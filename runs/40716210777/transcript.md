# Sandbox transcript (2026-10-28T15:28:44Z, 37b2c82)

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
  "correlation_id": "3ea892b0-a6ce-4a4c-889c-05e24ecd7ddb"
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
  "session_id": "b46a8eff-37c7-4fb0-9e59-1b85abaa0a97",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMjksImlhdCI6MTc5MzIwMTMyOSwianRpIjoiNjVlNDVmOWMtZmM0ZS00NzExLTg0MWUtNmU0NTg2MGMzNGRhIiwic2lkIjoiYjQ2YThlZmYtMzdjNy00ZmIwLTllNTktMWI4NWFiYWEwYTk3In0.jUC1qzTogkMihdINPMjITLEOZ0epzcbwRFzrvB4R2HQ",
  "access_expires_at": "2026-10-28T15:43:49.413503767Z",
  "refresh_token": "8PtZpgq0CcgxS0ge3xxpeezeomeGCLweW5pl-9hSMzQ",
  "refresh_expires_at": "2026-10-29T03:28:49.412081404Z",
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
  "session_id": "ca97ff7f-4058-499d-8a61-81fe02dfe4f6",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMzAsImlhdCI6MTc5MzIwMTMzMCwianRpIjoiNmRlNmJjYmMtYTEzMC00NTQ0LWE3YmEtZGY4ZGFkYzkyNmJmIiwic2lkIjoiY2E5N2ZmN2YtNDA1OC00OTlkLThhNjEtODFmZTAyZGZlNGY2In0.h24uuGIKtfDVCCvDUwmh1Xd1mB1bvuW7QsW-E4w3mm8",
  "access_expires_at": "2026-10-28T15:43:50.475822812Z",
  "refresh_token": "h4BQ_3kEP5S9HrY7WmjxnkK4pCX6AVydbyb2XsE61Ck",
  "refresh_expires_at": "2026-10-29T03:28:50.475001605Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "26657b95-0b4c-4be4-b5fd-5871aea0f454",
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
  "id": "4836f8a7-e015-4403-b810-6bd5aec1e184",
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
  "created_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "created_at": "2026-10-28T15:28:50.667921Z",
  "updated_at": "2026-10-28T15:28:50.667921Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635197971",
  "device_ref": "sandbox-1920"
}
```

```json
{
  "challenge_id": "de2f4a18-88cf-47bc-9906-183cd5ac3892",
  "expires_at": "2026-10-28T15:33:50.869574316Z",
  "resend_available_at": "2026-10-28T15:28:51.869574316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635197971` → **200**

```json
{
  "phone": "+380635197971",
  "audience": "CLIENT",
  "code": "087257",
  "sent_at": "2026-10-28T15:28:50.878059855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de2f4a18-88cf-47bc-9906-183cd5ac3892",
  "code": "087257",
  "device_ref": "sandbox-1920"
}
```

```json
{
  "session_id": "1f99458d-f699-4dae-97eb-a2fe4bfe8baf",
  "subject": {
    "type": "CLIENT",
    "id": "b73d154b-c946-4b1c-a8f0-5e9ca5796b19"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzNkMTU0Yi1jOTQ2LTRiMWMtYThmMC01ZTljYTU3OTZiMTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjMxLCJpYXQiOjE3OTMyMDEzMzEsImp0aSI6IjkyZTllNGUzLTVhZjItNDc2Ny1hODkyLWU0ZWZkOGVjMDg1MCIsInNpZCI6IjFmOTk0NThkLWY2OTktNGRhZS05N2ViLWEyZmU0YmZlOGJhZiJ9.Dlyoz70TwPlWHfDPjb8GVdXdRSujds5HjHTMdnmCKgs",
  "access_expires_at": "2026-10-28T15:43:51.092194253Z",
  "refresh_token": "gB9rgJYicR9vzaxq8B__hyfA1vGk9IpAYw2cwY0KcKE",
  "refresh_expires_at": "2026-11-27T15:28:51.091567379Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635197971` → **200**

```json
{
  "client_id": "b73d154b-c946-4b1c-a8f0-5e9ca5796b19"
}
```

`POST /api/admin/v1/rider-wallets/b73d154b-c946-4b1c-a8f0-5e9ca5796b19/top-ups` → **201**

```json
{
  "command_id": "26328376-1f89-451c-9d8f-b3f61f69c3b2",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "b73d154b-c946-4b1c-a8f0-5e9ca5796b19",
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
      "id": "d18212ff-729e-4c1b-a0ac-842ffa1c93b1",
      "at": "2026-10-28T15:28:51.44868Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "50d06d43-32f5-4252-ad5d-4b8b4623cffc",
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
  "id": "e9a8b587-06cf-47bb-a755-c50ea9815b3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:33:51.848007Z",
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
      "id": "4836f8a7-e015-4403-b810-6bd5aec1e184",
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
  "device_ref": "sandbox-8669"
}
```

```json
{
  "challenge_id": "b922f540-3eb1-4857-91da-55f72a382418",
  "expires_at": "2026-10-28T15:33:52.042375513Z",
  "resend_available_at": "2026-10-28T15:28:53.042375513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "074049",
  "sent_at": "2026-10-28T15:28:52.045924329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b922f540-3eb1-4857-91da-55f72a382418",
  "code": "074049",
  "device_ref": "sandbox-8669"
}
```

```json
{
  "session_id": "8d6c302f-3676-409a-a42d-3fd47e334ed8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjIzMiwiaWF0IjoxNzkzMjAxMzMyLCJqdGkiOiJhMWQ3NzNmZS03ZGRmLTQwZGUtOGU3ZC1lMzczYjQ4ZjI4NzkiLCJzaWQiOiI4ZDZjMzAyZi0zNjc2LTQwOWEtYTQyZC0zZmQ0N2UzMzRlZDgifQ.ZxbtqjQkKLwT6o5xQukE-u7TqYiNfrZT3meybXNdvMg",
  "access_expires_at": "2026-10-28T15:43:52.244563344Z",
  "refresh_token": "Ve10k075uwARJEU9TniwrUwnlvOEDWAw045rLsXlW7U",
  "refresh_expires_at": "2026-11-27T15:28:52.24373288Z",
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
  "command_id": "78749620-be70-43e2-9d20-b7e5c2ede0ff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:52Z",
    "sequence": 1793201332588
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "53309e3f-ffa9-4b3f-86c8-059028b011dc",
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
  "last_heartbeat_at": "2026-10-28T15:28:52.622352Z",
  "last_location_at": "2026-10-28T15:28:52.622352Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1be69bd2-ddb4-43fd-8473-e828a10f0773",
  "quote_id": "e9a8b587-06cf-47bb-a755-c50ea9815b3d",
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
  "id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b73d154b-c946-4b1c-a8f0-5e9ca5796b19",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:28:52.83823Z",
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
  "client_id": "b73d154b-c946-4b1c-a8f0-5e9ca5796b19",
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
      "id": "d18212ff-729e-4c1b-a0ac-842ffa1c93b1",
      "at": "2026-10-28T15:28:51.44868Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
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
    "id": "0924e2c4-8778-42ec-9c4d-f3a89ef0c4ae",
    "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
    "expires_at": "2026-10-28T15:29:07.847014Z",
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

`POST /api/driver/v1/offers/0924e2c4-8778-42ec-9c4d-f3a89ef0c4ae/accept` → **200**

```json
{
  "command_id": "f488c236-3898-4a8f-83a0-1759fe2c0252"
}
```

```json
{
  "id": "aa49b2f2-f6ab-4192-824c-2626da168a64",
  "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "78fb77cf-445f-43ee-beda-a5c97372cb8a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "78fb77cf-445f-43ee-beda-a5c97372cb8a",
  "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
  "assignment_id": "aa49b2f2-f6ab-4192-824c-2626da168a64",
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

`POST /api/driver/v1/work-sessions/53309e3f-ffa9-4b3f-86c8-059028b011dc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:28:53Z",
    "sequence": 1793201333748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "53309e3f-ffa9-4b3f-86c8-059028b011dc",
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
  "last_heartbeat_at": "2026-10-28T15:28:53.768545Z",
  "last_location_at": "2026-10-28T15:28:53.768545Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/78fb77cf-445f-43ee-beda-a5c97372cb8a/arrive` → **200**

```json
{
  "command_id": "3d7e0c57-e7f4-4c62-8cfe-236f40fb58d0",
  "expected_version": 0
}
```

```json
{
  "id": "78fb77cf-445f-43ee-beda-a5c97372cb8a",
  "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
  "assignment_id": "aa49b2f2-f6ab-4192-824c-2626da168a64",
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
  "arrived_at": "2026-10-28T15:28:53.976826Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/78fb77cf-445f-43ee-beda-a5c97372cb8a/start` → **200**

```json
{
  "command_id": "cef820a5-0ab6-48c8-a8e0-da1a114f8975",
  "expected_version": 1
}
```

```json
{
  "id": "78fb77cf-445f-43ee-beda-a5c97372cb8a",
  "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
  "assignment_id": "aa49b2f2-f6ab-4192-824c-2626da168a64",
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
  "arrived_at": "2026-10-28T15:28:53.976826Z",
  "started_at": "2026-10-28T15:28:54.16344Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/78fb77cf-445f-43ee-beda-a5c97372cb8a/complete` → **200**

```json
{
  "command_id": "4d3a6860-62da-45df-91ee-4b03527d6937",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:28:54Z",
  "cash_received": true
}
```

```json
{
  "id": "78fb77cf-445f-43ee-beda-a5c97372cb8a",
  "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
  "assignment_id": "aa49b2f2-f6ab-4192-824c-2626da168a64",
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
  "arrived_at": "2026-10-28T15:28:53.976826Z",
  "started_at": "2026-10-28T15:28:54.16344Z",
  "completed_at": "2026-10-28T15:28:54.366058Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "b73d154b-c946-4b1c-a8f0-5e9ca5796b19",
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
      "id": "4e466550-f7e7-4012-997a-2e4947e44ba9",
      "at": "2026-10-28T15:28:54.872369Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1"
    },
    {
      "id": "d18212ff-729e-4c1b-a0ac-842ffa1c93b1",
      "at": "2026-10-28T15:28:51.44868Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/4836f8a7-e015-4403-b810-6bd5aec1e184/archive` → **200**

```json
{
  "command_id": "3425b987-f51b-4086-aad5-f375eef9c1f0",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "4836f8a7-e015-4403-b810-6bd5aec1e184",
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
  "created_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "created_at": "2026-10-28T15:28:50.667921Z",
  "updated_at": "2026-10-28T15:28:57.742353Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "53309e3f-ffa9-4b3f-86c8-059028b011dc",
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
  "last_heartbeat_at": "2026-10-28T15:28:53.768545Z",
  "last_location_at": "2026-10-28T15:28:53.768545Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/53309e3f-ffa9-4b3f-86c8-059028b011dc/close` → **200**

```json
{
  "command_id": "7d3b37a2-83a0-4972-85e4-2752fe571e9d",
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

Done: order 11499b48-8f57-469f-bedc-4f37d49b61b1.

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
  "session_id": "5254f12d-0d0d-4c65-b795-f96b62434012",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMzgsImlhdCI6MTc5MzIwMTMzOCwianRpIjoiODc4OWE0Y2UtNjU1OS00N2E4LWE5MTItYzkzMjM2NDY4ZTU0Iiwic2lkIjoiNTI1NGYxMmQtMGQwZC00YzY1LWI3OTUtZjk2YjYyNDM0MDEyIn0.4gMYhFSKDXVlVkXwgNY_8wcvLIOU7wjMt8WqvA183W0",
  "access_expires_at": "2026-10-28T15:43:58.528243692Z",
  "refresh_token": "tQb5H9OTFG9jHdWrguHFPPYey5ayqjJv8_dvpqlBkNo",
  "refresh_expires_at": "2026-10-29T03:28:58.527234013Z",
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
  "command_id": "919d3d1e-0827-4f64-8060-8b272ff59d3b",
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
  "session_id": "a1ea9744-a979-4564-919a-04683793500c",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyMzksImlhdCI6MTc5MzIwMTMzOSwianRpIjoiZWQwMTlhMTEtN2E4NC00ZjQ4LWI3MzMtODM2ZjBmMTFmZDVlIiwic2lkIjoiYTFlYTk3NDQtYTk3OS00NTY0LTkxOWEtMDQ2ODM3OTM1MDBjIn0.O5IrHhpG8g8l67X--M2extzV1UYQ4-x4cQFQ6mtJmuA",
  "access_expires_at": "2026-10-28T15:43:59.273766929Z",
  "refresh_token": "MWIsgAQ7DB0QgfIb61hE7Y6-7Pr0GJey4udD99DE75k",
  "refresh_expires_at": "2026-10-29T03:28:59.273095364Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1168519150",
    "linkedid": "1730052700.1168519150",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670147664"
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
    "id": "1730052700.1168519150",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "ef1ee17d-8344-4557-a0f8-0958fd1b6c5c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.443781Z",
      "answered_at": null,
      "ended_at": "2026-10-28T15:28:59.464003Z",
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
    "id": "1730052600.266664323",
    "linkedid": "1730052600.266664323",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670147664"
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
      "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.672038Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ffeed815-c1d1-42a4-8189-d398f655225c/answer` → **200**

```json
{
  "command_id": "ac1e9d89-ac5d-4bbb-974b-f5357161106b"
}
```

```json
{
  "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670147664",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "order_ids": [],
  "started_at": "2026-10-28T15:28:59.672038Z",
  "answered_at": "2026-10-28T15:28:59.878221Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.266664323",
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
    "id": "1730052600.266664323",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.672038Z",
      "answered_at": "2026-10-28T15:28:59.878221Z",
      "ended_at": "2026-10-28T15:29:00.079021Z",
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
      "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.672038Z",
      "answered_at": "2026-10-28T15:28:59.878221Z",
      "ended_at": "2026-10-28T15:29:00.079021Z",
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
      "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.672038Z",
      "answered_at": "2026-10-28T15:28:59.878221Z",
      "ended_at": "2026-10-28T15:29:00.079021Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:29:03.745751Z"
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
      "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.672038Z",
      "answered_at": "2026-10-28T15:28:59.878221Z",
      "ended_at": "2026-10-28T15:29:00.079021Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:29:03.745751Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ffeed815-c1d1-42a4-8189-d398f655225c/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ffeed815-c1d1-42a4-8189-d398f655225c/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ffeed815-c1d1-42a4-8189-d398f655225c` → **200**

```json
{
  "changes": [
    {
      "id": "e21a83ed-ef11-491e-ab6f-0db88181fd41",
      "occurred_at": "2026-10-28T15:29:04.879986Z",
      "actor_type": "STAFF",
      "actor_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0c948a40-7b9d-4cc5-a3f3-9d147e7443d8\", \"order_ids\": []}",
      "correlation_id": "20b35b79-ccf6-4b20-ab2d-ae8c85a368b5"
    },
    {
      "id": "9fcab99c-7b6e-40da-9c2a-27ac9a3d5c5e",
      "occurred_at": "2026-10-28T15:29:04.852894Z",
      "actor_type": "STAFF",
      "actor_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"0c948a40-7b9d-4cc5-a3f3-9d147e7443d8\", \"order_ids\": []}",
      "correlation_id": "b2c7ad76-57f9-445e-9912-20125280a567"
    }
  ]
}
```

Done: call ffeed815-c1d1-42a4-8189-d398f655225c recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12982"
}
```

```json
{
  "challenge_id": "6bb52648-6464-40e7-80a0-46347ecef997",
  "expires_at": "2026-10-28T15:34:05.095609387Z",
  "resend_available_at": "2026-10-28T15:29:06.095609387Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "509994",
  "sent_at": "2026-10-28T15:29:05.098535111Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6bb52648-6464-40e7-80a0-46347ecef997",
  "code": "509994",
  "device_ref": "sandbox-12982"
}
```

```json
{
  "session_id": "14725694-a01c-4a61-aa7b-9fdbf70b7f86",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjI0NSwiaWF0IjoxNzkzMjAxMzQ1LCJqdGkiOiJjNTBjYWJlYy1hODVmLTRlMGMtYThlOC0yMDY2ZGU2ODRhNmMiLCJzaWQiOiIxNDcyNTY5NC1hMDFjLTRhNjEtYWE3Yi05ZmRiZjcwYjdmODYifQ.z57NI7oIy3rpaw1Xr_vGNiukqK6stKcAfr1nZ8_Lm5k",
  "access_expires_at": "2026-10-28T15:44:05.297018785Z",
  "refresh_token": "6dOZtKv_YQU77C_Rf5fHt4HDfd7uFMTTDo3-ehW2dWY",
  "refresh_expires_at": "2026-11-27T15:29:05.296484457Z",
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
  "command_id": "05b8751f-c469-46c8-9623-3a42d0cee076",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:05Z",
    "sequence": 1793201345681
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c4a149d6-9155-4d20-a09d-dc0cfb49a62d",
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
  "last_heartbeat_at": "2026-10-28T15:29:05.69855Z",
  "last_location_at": "2026-10-28T15:29:05.69855Z",
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
  "session_id": "ef79e9c1-fb07-454e-bde8-8f2bfea09a35",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyNDYsImlhdCI6MTc5MzIwMTM0NiwianRpIjoiNGM2NDc4NzAtYWZlOS00MDJhLWJkZjItOTJiNTAxMDAwYmM2Iiwic2lkIjoiZWY3OWU5YzEtZmIwNy00NTRlLWJkZTgtOGYyYmZlYTA5YTM1In0.EyeVl1zN42YnnSQcOTMcQmIzaTHRti9wIMk_5FLvQjU",
  "access_expires_at": "2026-10-28T15:44:06.076958505Z",
  "refresh_token": "b6cSGw_0WaiOM4Jy5_GOvQ2Igljn1WC1waYz-dh-0tQ",
  "refresh_expires_at": "2026-10-29T03:29:06.076461948Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bfa597cc-17cd-4d3a-9d04-68d01bd6b096",
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
  "id": "d011349d-9581-4ff9-b0af-8302a05208be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:06.248971Z",
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
  "command_id": "988d302a-6941-4546-b332-f19be71d94d4",
  "quote_id": "d011349d-9581-4ff9-b0af-8302a05208be",
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
    "phone": "+380673429763"
  }
}
```

```json
{
  "id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
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
  "created_at": "2026-10-28T15:29:06.438862Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673429763"
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
    "id": "ee44d731-12ab-4b49-a60c-8b27075eb3c5",
    "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
    "expires_at": "2026-10-28T15:29:21.442074Z",
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

`POST /api/driver/v1/offers/ee44d731-12ab-4b49-a60c-8b27075eb3c5/accept` → **200**

```json
{
  "command_id": "6acb40e2-a393-4d22-bbbf-705d2cb809b7"
}
```

```json
{
  "id": "a0a3884e-9cfb-48d9-a76f-db46da2d1029",
  "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7",
  "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
  "assignment_id": "a0a3884e-9cfb-48d9-a76f-db46da2d1029",
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
    "phone": "+380673429763"
  }
}
```

`POST /api/driver/v1/work-sessions/c4a149d6-9155-4d20-a09d-dc0cfb49a62d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:08Z",
    "sequence": 1793201348212
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c4a149d6-9155-4d20-a09d-dc0cfb49a62d",
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
  "last_heartbeat_at": "2026-10-28T15:29:08.230066Z",
  "last_location_at": "2026-10-28T15:29:08.230066Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7/arrive` → **200**

```json
{
  "command_id": "5653ac91-28a0-452f-b998-338bb6c5934d",
  "expected_version": 0
}
```

```json
{
  "id": "1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7",
  "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
  "assignment_id": "a0a3884e-9cfb-48d9-a76f-db46da2d1029",
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
  "arrived_at": "2026-10-28T15:29:08.410414Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673429763"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  },
  {
    "phone": "+380673429763",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:09.857776524Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  },
  {
    "phone": "+380673429763",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:09.857776524Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673429763` → **200**

```json
[
  {
    "phone": "+380673429763",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:07.850911638Z"
  },
  {
    "phone": "+380673429763",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T15:29:09.857776524Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7/start` → **200**

```json
{
  "command_id": "c7cb30ea-1d68-4055-84c9-b086c3b37505",
  "expected_version": 1
}
```

```json
{
  "id": "1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7",
  "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
  "assignment_id": "a0a3884e-9cfb-48d9-a76f-db46da2d1029",
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
  "arrived_at": "2026-10-28T15:29:08.410414Z",
  "started_at": "2026-10-28T15:29:10.965437Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673429763"
  }
}
```

`POST /api/driver/v1/trips/1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7/complete` → **200**

```json
{
  "command_id": "4eb6a587-1fa3-43a7-a5a1-7d5235272bc9",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:29:11Z",
  "cash_received": true
}
```

```json
{
  "id": "1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7",
  "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
  "assignment_id": "a0a3884e-9cfb-48d9-a76f-db46da2d1029",
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
  "arrived_at": "2026-10-28T15:29:08.410414Z",
  "started_at": "2026-10-28T15:29:10.965437Z",
  "completed_at": "2026-10-28T15:29:11.162783Z",
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
  "session_id": "c4a149d6-9155-4d20-a09d-dc0cfb49a62d",
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
  "last_heartbeat_at": "2026-10-28T15:29:08.230066Z",
  "last_location_at": "2026-10-28T15:29:08.230066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c4a149d6-9155-4d20-a09d-dc0cfb49a62d/close` → **200**

```json
{
  "command_id": "a5d984d4-c3aa-4b06-b701-f9dcec4f5457",
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
  "phone": "+380635074760",
  "device_ref": "sandbox-5061"
}
```

```json
{
  "challenge_id": "98937a92-c593-4ccc-b7be-d104310cfb10",
  "expires_at": "2026-10-28T15:34:11.716568096Z",
  "resend_available_at": "2026-10-28T15:29:12.716568096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635074760` → **200**

```json
{
  "phone": "+380635074760",
  "audience": "CLIENT",
  "code": "543446",
  "sent_at": "2026-10-28T15:29:11.71962799Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98937a92-c593-4ccc-b7be-d104310cfb10",
  "code": "543446",
  "device_ref": "sandbox-5061"
}
```

```json
{
  "session_id": "2c13189a-2c6a-4eab-a279-9ed861691a13",
  "subject": {
    "type": "CLIENT",
    "id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzkwNTFkMy1mMDM4LTQ4YjQtOGI0ZS1hMzhhOWQ2ZDVkZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjUxLCJpYXQiOjE3OTMyMDEzNTEsImp0aSI6IjJkODc1MGUzLWY5ZjItNGI1ZC1hYzA3LWQ0YzFiMTNjNGM3ZCIsInNpZCI6IjJjMTMxODlhLTJjNmEtNGVhYi1hMjc5LTllZDg2MTY5MWExMyJ9.2HL6xjD6vE2b1nccuue_aun5JJXAoApgNFCoJ-4Yuic",
  "access_expires_at": "2026-10-28T15:44:11.914224012Z",
  "refresh_token": "_8hxhVqWtMwOmebZgxWwttWYaknzSRckn1V8HwFJWQc",
  "refresh_expires_at": "2026-11-27T15:29:11.913865843Z",
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
  "device_ref": "sandbox-7985"
}
```

```json
{
  "challenge_id": "dbc24d02-ebb1-495e-bb2d-29deb4e027ac",
  "expires_at": "2026-10-28T15:34:12.265541579Z",
  "resend_available_at": "2026-10-28T15:29:13.265541579Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "498865",
  "sent_at": "2026-10-28T15:29:12.267931771Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbc24d02-ebb1-495e-bb2d-29deb4e027ac",
  "code": "498865",
  "device_ref": "sandbox-7985"
}
```

```json
{
  "session_id": "af64f766-2ca7-429c-b248-3091e2a339c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjI1MiwiaWF0IjoxNzkzMjAxMzUyLCJqdGkiOiI3MTBlNTJlZS1jOTA3LTQ0MDktYmZhYS0xZTZjZTM0NDgyNGQiLCJzaWQiOiJhZjY0Zjc2Ni0yY2E3LTQyOWMtYjI0OC0zMDkxZTJhMzM5YzUifQ.SU9ji5zu-KCWym6EvjwieX-XYZ8D6exB0mm4z1NeVjw",
  "access_expires_at": "2026-10-28T15:44:12.475148642Z",
  "refresh_token": "OSUvMzzEv86uaykZ-fKRbTCrNXYoY4U6A7SNg3D7dtU",
  "refresh_expires_at": "2026-11-27T15:29:12.474547443Z",
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
  "session_id": "e0799517-b7ae-47a3-a2a9-b8f689df71a3",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyNTMsImlhdCI6MTc5MzIwMTM1MywianRpIjoiNjY3YmIzNjAtM2JiZC00ZTEzLTk1MjktYjcxMDExYzU5OTJmIiwic2lkIjoiZTA3OTk1MTctYjdhZS00N2EzLWEyYTktYjhmNjg5ZGY3MWEzIn0.ugr1UJHCzULmo1wvGsgTFZcXnSdGW-UwQn5ae4gz54M",
  "access_expires_at": "2026-10-28T15:44:13.022727525Z",
  "refresh_token": "X69kVhFm_U8Cm-c1b3_p6QxZ6kajL1DV_b_awI2NBHg",
  "refresh_expires_at": "2026-10-29T03:29:13.022214719Z",
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
  "session_id": "7ea454ab-9bd8-4c33-9ae3-a634dbd6df9c",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyNTMsImlhdCI6MTc5MzIwMTM1MywianRpIjoiMjlkNjdmNzQtZWZlMy00ODk0LWI0YTMtOTkwMTBhMmM2ZDE3Iiwic2lkIjoiN2VhNDU0YWItOWJkOC00YzMzLTlhZTMtYTYzNGRiZDZkZjljIn0.LvsER6LjaLIy6Ny9l8fAbEQn8YGxA6l-VccEUUuS00A",
  "access_expires_at": "2026-10-28T15:44:13.454053325Z",
  "refresh_token": "78MxJXon5TOPwg65klyjEN7gV-qaICU4DwRWj4ApbHc",
  "refresh_expires_at": "2026-10-29T03:29:13.453689087Z",
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
  "command_id": "9895182a-be84-4e4b-9068-9c4c9040c46c",
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
  "id": "d81ed177-f9b3-4f1a-bec0-00c28a3c2735",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:13.821524Z",
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
  "command_id": "c22f4915-4c70-44e4-a59e-fab19b304929",
  "quote_id": "d81ed177-f9b3-4f1a-bec0-00c28a3c2735",
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
  "id": "177daadb-2e80-49d8-8978-76fbd7efbe2a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3",
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
  "created_at": "2026-10-28T15:29:14.003312Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/177daadb-2e80-49d8-8978-76fbd7efbe2a` → **200**

```json
{
  "id": "177daadb-2e80-49d8-8978-76fbd7efbe2a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3",
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
  "created_at": "2026-10-28T15:29:14.003312Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/177daadb-2e80-49d8-8978-76fbd7efbe2a/cancel` → **200**

```json
{
  "command_id": "8805a2a6-32b6-43b3-af15-c378c534fd8a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "177daadb-2e80-49d8-8978-76fbd7efbe2a",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3",
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
  "created_at": "2026-10-28T15:29:14.003312Z",
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
  "command_id": "c9b7511a-4d28-44d7-addd-8a7aed84ec55",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:14Z",
    "sequence": 1793201354759
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8c0ae9d0-8bec-4f53-82d8-e0e20224373e",
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
  "last_heartbeat_at": "2026-10-28T15:29:14.776109Z",
  "last_location_at": "2026-10-28T15:29:14.776109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13695"
}
```

```json
{
  "challenge_id": "40f78660-9026-4214-a8b6-f1670866b98a",
  "expires_at": "2026-10-28T15:34:14.951101356Z",
  "resend_available_at": "2026-10-28T15:29:15.951101356Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "751793",
  "sent_at": "2026-10-28T15:29:14.953274582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40f78660-9026-4214-a8b6-f1670866b98a",
  "code": "751793",
  "device_ref": "sandbox-13695"
}
```

```json
{
  "session_id": "b7d41b64-786d-4a82-a3a7-d4ad8b6776d0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjI1NSwiaWF0IjoxNzkzMjAxMzU1LCJqdGkiOiI5ZGUxZjRkOS1hZDJjLTQzMGMtOGVhYi1jNzIyOTdjZjkwNDYiLCJzaWQiOiJiN2Q0MWI2NC03ODZkLTRhODItYTNhNy1kNGFkOGI2Nzc2ZDAifQ.-tfbHpRZl04SPDFpBtF5WoMMpAlxi6qnCXuTGPXILLA",
  "access_expires_at": "2026-10-28T15:44:15.148199218Z",
  "refresh_token": "WB3QQTBjqYsbm6_n0pKPRRIyR_CUv_y5XcHJ8QZkIpc",
  "refresh_expires_at": "2026-11-27T15:29:15.147832267Z",
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
  "command_id": "136559e9-14ce-4144-bac7-99a70d11f6ff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:15Z",
    "sequence": 1793201355480
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:15.496307Z",
  "last_location_at": "2026-10-28T15:29:15.496307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "26f68bda-6f7b-488e-9cc0-527639359188",
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
  "id": "17b46a50-c1f8-4d5d-881e-7e06780c2574",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:15.680225Z",
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
  "command_id": "b359504d-1b7e-47c8-b58e-0123b440147e",
  "quote_id": "17b46a50-c1f8-4d5d-881e-7e06780c2574",
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
  "id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3",
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
  "created_at": "2026-10-28T15:29:15.856873Z",
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
    "id": "ee4b7070-659d-43ae-96d2-e191f275c6fc",
    "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
    "expires_at": "2026-10-28T15:29:30.859478Z",
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

`POST /api/driver/v1/offers/ee4b7070-659d-43ae-96d2-e191f275c6fc/accept` → **200**

```json
{
  "command_id": "18e51ba1-0b0a-41fc-aef0-f06b76b54d02"
}
```

```json
{
  "id": "f2159dc7-a7af-45ff-8751-77c2f19412bd",
  "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a64b0a52-0b08-4350-b40b-3a304e99d9b6",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a64b0a52-0b08-4350-b40b-3a304e99d9b6",
  "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "assignment_id": "f2159dc7-a7af-45ff-8751-77c2f19412bd",
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

`POST /api/driver/v1/trips/a64b0a52-0b08-4350-b40b-3a304e99d9b6/cancel` → **200**

```json
{
  "command_id": "67ecb219-e15a-4715-8e3a-b131ce3fb650",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "a64b0a52-0b08-4350-b40b-3a304e99d9b6",
  "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "assignment_id": "f2159dc7-a7af-45ff-8751-77c2f19412bd",
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

`GET /api/rider/v1/orders/de105cc8-daf5-4724-aa4b-d86a8ee4fec0` → **200**

```json
{
  "id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3",
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
    "id": "f2159dc7-a7af-45ff-8751-77c2f19412bd",
    "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "a64b0a52-0b08-4350-b40b-3a304e99d9b6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:29:15.856873Z",
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
    "id": "3eb0e189-e180-4f42-9412-956308503103",
    "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
    "expires_at": "2026-10-28T15:29:31.582265Z",
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

`POST /api/driver/v1/offers/3eb0e189-e180-4f42-9412-956308503103/accept` → **200**

```json
{
  "command_id": "9217a026-740d-42d2-92cc-46c130d51090"
}
```

```json
{
  "id": "cdd08c77-a849-4959-88c3-bbbbbcb9c269",
  "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "513ee315-c123-47f7-9c7b-64acac117ca1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "513ee315-c123-47f7-9c7b-64acac117ca1",
  "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "assignment_id": "cdd08c77-a849-4959-88c3-bbbbbcb9c269",
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

`POST /api/driver/v1/trips/513ee315-c123-47f7-9c7b-64acac117ca1/cancel` → **200**

```json
{
  "command_id": "e1175b87-c59b-4300-b9a3-77543a06fbac",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "513ee315-c123-47f7-9c7b-64acac117ca1",
  "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
  "assignment_id": "cdd08c77-a849-4959-88c3-bbbbbcb9c269",
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
    "id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:29:15.856873Z",
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
    "id": "177daadb-2e80-49d8-8978-76fbd7efbe2a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:29:14.003312Z",
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

`GET /api/operator/v1/orders/de105cc8-daf5-4724-aa4b-d86a8ee4fec0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:29:15.85732Z",
      "actor": {
        "type": "CLIENT",
        "id": "e39051d3-f038-48b4-8b4e-a38a9d6d5df3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
        "quote_id": "17b46a50-c1f8-4d5d-881e-7e06780c2574",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "64cb931f-30cf-42dd-87e6-bbbc2f706f49"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:29:15.858793Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
        "attempt_id": "80e968d7-0c62-44b6-8395-27a2f00e988d",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "64cb931f-30cf-42dd-87e6-bbbc2f706f49"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:29:15.864186Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ee4b7070-659d-43ae-96d2-e191f275c6fc",
        "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "64cb931f-30cf-42dd-87e6-bbbc2f706f49"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:29:16.230458Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ee4b7070-659d-43ae-96d2-e191f275c6fc",
        "order_id": "de105cc8-daf5-4724-aa4b-d86a8ee4fec0",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "f2159dc7-a7af-45ff-8751-77c2f19412bd"
      },
      "correlation_id": "d580b40c-0190-40f6-898e-fbc2a40b3dd0"
```

Done: orders 177daadb-2e80-49d8-8978-76fbd7efbe2a, de105cc8-daf5-4724-aa4b-d86a8ee4fec0.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733143954",
  "device_ref": "sandbox-5498"
}
```

```json
{
  "challenge_id": "a9b903f8-c3a8-459c-8e9c-27b5ef4ef121",
  "expires_at": "2026-10-28T15:34:18.004922087Z",
  "resend_available_at": "2026-10-28T15:29:19.004922087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733143954` → **200**

```json
{
  "phone": "+380733143954",
  "audience": "CLIENT",
  "code": "681670",
  "sent_at": "2026-10-28T15:29:18.007462441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9b903f8-c3a8-459c-8e9c-27b5ef4ef121",
  "code": "681670",
  "device_ref": "sandbox-5498"
}
```

```json
{
  "session_id": "86d8ea6f-7721-4805-be28-cc8a82f72fe3",
  "subject": {
    "type": "CLIENT",
    "id": "b202b83c-c1ef-4614-83be-258284916fbe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMjAyYjgzYy1jMWVmLTQ2MTQtODNiZS0yNTgyODQ5MTZmYmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjU4LCJpYXQiOjE3OTMyMDEzNTgsImp0aSI6ImRhODU1N2ZlLTE2OGItNGEyMy1iNTZmLTkzNDZmOTVmMDE5NCIsInNpZCI6Ijg2ZDhlYTZmLTc3MjEtNDgwNS1iZTI4LWNjOGE4MmY3MmZlMyJ9.T259_HibL33vJKRIrkQTaG5fogAmch3YaNEApGEznOg",
  "access_expires_at": "2026-10-28T15:44:18.199641812Z",
  "refresh_token": "-MLdMgaMIXpEwOjYNMjeKfg4pBhta_z55UPv4s911QA",
  "refresh_expires_at": "2026-11-27T15:29:18.199310565Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "662fb0da-03ac-4ff3-bb4a-18c990c3f4cc",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "673c6ba3-7d5b-41ab-9d99-04ce73177722",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-673c6ba3-7d5b-41ab-9d99-04ce73177722",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3df3ac68ed63eb529484b1674857e532",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=673c6ba3-7d5b-41ab-9d99-04ce73177722",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733143954"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=673c6ba3-7d5b-41ab-9d99-04ce73177722",
  "expires_at": "2026-10-28T15:59:18.374033Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/673c6ba3-7d5b-41ab-9d99-04ce73177722` → **200**

```json
{
  "id": "673c6ba3-7d5b-41ab-9d99-04ce73177722",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:59:18.374033Z",
  "card": {
    "id": "1d0aafd3-c7fb-472f-b430-181da5954d16",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2701",
    "card_type": "Visa",
    "created_at": "2026-10-28T15:29:18.564273Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "1d0aafd3-c7fb-472f-b430-181da5954d16",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2701",
      "card_type": "Visa",
      "created_at": "2026-10-28T15:29:18.564273Z"
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
  "device_ref": "sandbox-3366"
}
```

```json
{
  "challenge_id": "1cdf49a4-7bfb-4357-84c5-2c625ca3dfdd",
  "expires_at": "2026-10-28T15:34:18.925334465Z",
  "resend_available_at": "2026-10-28T15:29:19.925334465Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "160819",
  "sent_at": "2026-10-28T15:29:18.927524063Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1cdf49a4-7bfb-4357-84c5-2c625ca3dfdd",
  "code": "160819",
  "device_ref": "sandbox-3366"
}
```

```json
{
  "session_id": "a1166358-b779-4e1e-b405-c5fc1a784462",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjI1OSwiaWF0IjoxNzkzMjAxMzU5LCJqdGkiOiJiMWZlNmFjNS0wY2I1LTRhZWQtYjVmMS03OGFjMTRhYzA1ZDgiLCJzaWQiOiJhMTE2NjM1OC1iNzc5LTRlMWUtYjQwNS1jNWZjMWE3ODQ0NjIifQ.5mx-2P3PrZYkjav6hy9fb1mhwY3RrMh4Eb0RzxdsWoc",
  "access_expires_at": "2026-10-28T15:44:19.117192002Z",
  "refresh_token": "VmnCYn6lEuXPw13Q3aCBQVJvkHv1pBRPgRABnEkudSE",
  "refresh_expires_at": "2026-11-27T15:29:19.116667886Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:15.496307Z",
  "last_location_at": "2026-10-28T15:29:15.496307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36e471a4-d246-46b2-8258-3b6467f18d9b/handover` → **200**

```json
{
  "command_id": "42314efd-72ac-43dd-9c2e-5fdcffaed29e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:15.496307Z",
  "last_location_at": "2026-10-28T15:29:15.496307Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36e471a4-d246-46b2-8258-3b6467f18d9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:19Z",
    "sequence": 1793201359630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:19.649539Z",
  "last_location_at": "2026-10-28T15:29:19.649539Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d5439126-b4c7-40d5-b033-0870d4c4cd04",
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
  "id": "891047f5-b37b-4900-8725-b1e9b4d35432",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:19.836743Z",
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
  "command_id": "40743bdd-6ad4-4930-90b7-ccaa59f7697f",
  "quote_id": "891047f5-b37b-4900-8725-b1e9b4d35432",
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
  "id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
  "created_at": "2026-10-28T15:29:20.024514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78` → **200**

```json
{
  "id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
  "created_at": "2026-10-28T15:29:20.024514Z",
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
    "id": "6062472e-9d88-412c-b635-8f7a6ba60a0d",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "expires_at": "2026-10-28T15:29:35.092591Z",
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

`POST /api/driver/v1/offers/6062472e-9d88-412c-b635-8f7a6ba60a0d/accept` → **200**

```json
{
  "command_id": "8634a8d9-5456-4ac3-9d0c-7745d63ec0df"
}
```

```json
{
  "id": "42817235-89df-489d-a8ff-5e2a72c870aa",
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "assignment_id": "42817235-89df-489d-a8ff-5e2a72c870aa",
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

`POST /api/driver/v1/work-sessions/36e471a4-d246-46b2-8258-3b6467f18d9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:20Z",
    "sequence": 1793201360905
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:20.921632Z",
  "last_location_at": "2026-10-28T15:29:20.921632Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5f01dfc6-af5a-4ee2-af8c-7c539a201216/arrive` → **200**

```json
{
  "command_id": "7388c70d-1a20-408f-a282-d79907659d18",
  "expected_version": 0
}
```

```json
{
  "id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "assignment_id": "42817235-89df-489d-a8ff-5e2a72c870aa",
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
  "arrived_at": "2026-10-28T15:29:21.103028Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5f01dfc6-af5a-4ee2-af8c-7c539a201216/start` → **200**

```json
{
  "command_id": "03d19106-fafb-49d6-af88-d13b4dc92734",
  "expected_version": 1
}
```

```json
{
  "id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "assignment_id": "42817235-89df-489d-a8ff-5e2a72c870aa",
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
  "arrived_at": "2026-10-28T15:29:21.103028Z",
  "started_at": "2026-10-28T15:29:21.282443Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5f01dfc6-af5a-4ee2-af8c-7c539a201216/complete` → **200**

```json
{
  "command_id": "e3ef3354-334a-4f7d-93a5-69f110108cea",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:29:21Z",
  "cash_received": true
}
```

```json
{
  "id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "assignment_id": "42817235-89df-489d-a8ff-5e2a72c870aa",
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
  "arrived_at": "2026-10-28T15:29:21.103028Z",
  "started_at": "2026-10-28T15:29:21.282443Z",
  "completed_at": "2026-10-28T15:29:21.464882Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78` → **200**

```json
{
  "id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
    "id": "42817235-89df-489d-a8ff-5e2a72c870aa",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:29:20.024514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78` → **200**

```json
{
  "id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
    "id": "42817235-89df-489d-a8ff-5e2a72c870aa",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:29:20.024514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78` → **200**

```json
{
  "id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
    "id": "42817235-89df-489d-a8ff-5e2a72c870aa",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:29:20.024514Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78` → **200**

```json
{
  "id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
    "id": "42817235-89df-489d-a8ff-5e2a72c870aa",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5f01dfc6-af5a-4ee2-af8c-7c539a201216",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:29:20.024514Z",
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

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78/tip` → **200**

```json
{
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
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
  "available_until": "2026-10-29T15:29:21.464882Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78/tip` → **201**

```json
{
  "command_id": "d1877010-48d1-4921-b4b9-5e34b925141f",
  "amount_minor": 2500
}
```

```json
{
  "id": "8bfb2866-9c0c-4dec-9937-d74290200f01",
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:29:25.703859Z"
}
```

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78/tip` → **200**

```json
{
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
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
  "available_until": "2026-10-29T15:29:21.464882Z",
  "open": false,
  "tip": {
    "id": "8bfb2866-9c0c-4dec-9937-d74290200f01",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:29:25.703859Z"
  }
}
```

`GET /api/rider/v1/orders/54c0a190-1210-4736-8560-fd9b8e7efc78/tip` → **200**

```json
{
  "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
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
  "available_until": "2026-10-29T15:29:21.464882Z",
  "open": false,
  "tip": {
    "id": "8bfb2866-9c0c-4dec-9937-d74290200f01",
    "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:29:25.703859Z"
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
      "id": "d5f585ed-14d2-4978-938e-1311517d4b95",
      "at": "2026-10-28T15:29:27.186999Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
      "counterpart_id": null
    },
    {
      "id": "7fef95dd-28ef-432d-ae11-23d23d6075cd",
      "at": "2026-10-28T15:29:22.128444Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "66fb477b-e1e2-4b2c-a728-556a4ffff1d1",
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
  "id": "212ed99c-f851-430e-a551-63f801eb3a80",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:27.424437Z",
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
  "session_id": "34551e5a-b39d-4c84-a12d-6012b7f34bfc",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyNjcsImlhdCI6MTc5MzIwMTM2NywianRpIjoiMWRhZDM3OWYtODg4NS00ZDRmLTg4ODgtZWU4ZGVjOWE3OTk2Iiwic2lkIjoiMzQ1NTFlNWEtYjM5ZC00Yzg0LWExMmQtNjAxMmI3ZjM0YmZjIn0.D-xsj8W-IdUDU7ghFbDMa7P2qcD1s-xc_uHLkDEBnkM",
  "access_expires_at": "2026-10-28T15:44:27.808670626Z",
  "refresh_token": "tf9DcRBwOP3LLD3CYQKFeh8bibgiH7LAOiKfin91y1g",
  "refresh_expires_at": "2026-10-29T03:29:27.808331316Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733143954` → **200**

```json
{
  "client_id": "b202b83c-c1ef-4614-83be-258284916fbe"
}
```

`POST /api/admin/v1/rider-wallets/b202b83c-c1ef-4614-83be-258284916fbe/top-ups` → **201**

```json
{
  "command_id": "4bf7c907-3ea1-4cbd-bdeb-e76b3394ad33",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
      "id": "0cc364b7-23a9-40e6-9011-5657e0c13c03",
      "at": "2026-10-28T15:29:28.158206Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f2f8ffe1-2207-4813-b487-abb1e62a55fc",
  "quote_id": "212ed99c-f851-430e-a551-63f801eb3a80",
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
  "id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
  "created_at": "2026-10-28T15:29:28.350282Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fbbb8777-cb95-44ff-b76a-142ecb6339b0` → **200**

```json
{
  "id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
  "created_at": "2026-10-28T15:29:28.350282Z",
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
    "id": "41751c41-9ecb-45b2-9267-615a1416cb50",
    "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
    "expires_at": "2026-10-28T15:29:43.353528Z",
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

`POST /api/driver/v1/offers/41751c41-9ecb-45b2-9267-615a1416cb50/accept` → **200**

```json
{
  "command_id": "ab0e3488-6c3b-4cb9-ba95-852ee7f7ecc4"
}
```

```json
{
  "id": "485eeef8-8e0f-4e89-a9e3-cd6c8a9e14d0",
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b77c3edc-37cf-4b34-a2cd-a614fe40b19a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b77c3edc-37cf-4b34-a2cd-a614fe40b19a",
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "assignment_id": "485eeef8-8e0f-4e89-a9e3-cd6c8a9e14d0",
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

`POST /api/driver/v1/work-sessions/36e471a4-d246-46b2-8258-3b6467f18d9b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:29:29Z",
    "sequence": 1793201369253
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:29.270201Z",
  "last_location_at": "2026-10-28T15:29:29.270201Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b77c3edc-37cf-4b34-a2cd-a614fe40b19a/arrive` → **200**

```json
{
  "command_id": "6f9f90e4-6101-4ad1-8de3-56e56f5a5846",
  "expected_version": 0
}
```

```json
{
  "id": "b77c3edc-37cf-4b34-a2cd-a614fe40b19a",
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "assignment_id": "485eeef8-8e0f-4e89-a9e3-cd6c8a9e14d0",
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
  "arrived_at": "2026-10-28T15:29:29.443189Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b77c3edc-37cf-4b34-a2cd-a614fe40b19a/start` → **200**

```json
{
  "command_id": "8f7307e3-85b9-42fd-9805-b5e8caa64acf",
  "expected_version": 1
}
```

```json
{
  "id": "b77c3edc-37cf-4b34-a2cd-a614fe40b19a",
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "assignment_id": "485eeef8-8e0f-4e89-a9e3-cd6c8a9e14d0",
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
  "arrived_at": "2026-10-28T15:29:29.443189Z",
  "started_at": "2026-10-28T15:29:29.625898Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b77c3edc-37cf-4b34-a2cd-a614fe40b19a/complete` → **200**

```json
{
  "command_id": "cb7630e0-27ed-4032-acab-5f59e8fcb8f7",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:29:29Z",
  "cash_received": true
}
```

```json
{
  "id": "b77c3edc-37cf-4b34-a2cd-a614fe40b19a",
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "assignment_id": "485eeef8-8e0f-4e89-a9e3-cd6c8a9e14d0",
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
  "arrived_at": "2026-10-28T15:29:29.443189Z",
  "started_at": "2026-10-28T15:29:29.625898Z",
  "completed_at": "2026-10-28T15:29:29.828846Z",
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
  "client_id": "b202b83c-c1ef-4614-83be-258284916fbe",
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
      "id": "0cc364b7-23a9-40e6-9011-5657e0c13c03",
      "at": "2026-10-28T15:29:28.158206Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
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
      "balance_minor": 16352,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/rider/v1/orders/fbbb8777-cb95-44ff-b76a-142ecb6339b0/tip` → **200**

```json
{
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
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
  "available_until": "2026-10-29T15:29:29.828846Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fbbb8777-cb95-44ff-b76a-142ecb6339b0/tip` → **201**

```json
{
  "command_id": "70937ca6-aef8-4bd5-b08d-11319a3dbdf4",
  "amount_minor": 2500
}
```

```json
{
  "id": "7bf4a087-5cce-4923-ad0f-18ac8459332e",
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T15:29:30.538501Z"
}
```

`GET /api/rider/v1/orders/fbbb8777-cb95-44ff-b76a-142ecb6339b0/tip` → **200**

```json
{
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
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
  "available_until": "2026-10-29T15:29:29.828846Z",
  "open": false,
  "tip": {
    "id": "7bf4a087-5cce-4923-ad0f-18ac8459332e",
    "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T15:29:30.538501Z"
  }
}
```

`GET /api/rider/v1/orders/fbbb8777-cb95-44ff-b76a-142ecb6339b0/tip` → **200**

```json
{
  "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
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
  "available_until": "2026-10-29T15:29:29.828846Z",
  "open": false,
  "tip": {
    "id": "7bf4a087-5cce-4923-ad0f-18ac8459332e",
    "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T15:29:30.538501Z"
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
      "id": "09871d3d-dd4c-4aed-a02a-7410a65d19c3",
      "at": "2026-10-28T15:29:30.231167Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
      "counterpart_id": null
    },
    {
      "id": "d5f585ed-14d2-4978-938e-1311517d4b95",
      "at": "2026-10-28T15:29:27.186999Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
      "counterpart_id": null
    },
    {
      "id": "7fef95dd-28ef-432d-ae11-23d23d6075cd",
      "at": "2026-10-28T15:29:22.128444Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
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
      "id": "f4272dee-4698-43c3-9de6-dbfd6e584a7a",
      "at": "2026-10-28T15:29:32.254449Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
      "counterpart_id": null
    },
    {
      "id": "09871d3d-dd4c-4aed-a02a-7410a65d19c3",
      "at": "2026-10-28T15:29:30.231167Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fbbb8777-cb95-44ff-b76a-142ecb6339b0",
      "counterpart_id": null
    },
    {
      "id": "d5f585ed-14d2-4978-938e-1311517d4b95",
      "at": "2026-10-28T15:29:27.186999Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
      "counterpart_id": null
    },
    {
      "id": "7fef95dd-28ef-432d-ae11-23d23d6075cd",
      "at": "2026-10-28T15:29:22.128444Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "54c0a190-1210-4736-8560-fd9b8e7efc78",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "36e471a4-d246-46b2-8258-3b6467f18d9b",
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
  "last_heartbeat_at": "2026-10-28T15:29:29.270201Z",
  "last_location_at": "2026-10-28T15:29:29.270201Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/36e471a4-d246-46b2-8258-3b6467f18d9b/close` → **200**

```json
{
  "command_id": "c31fe78c-4e88-4fb1-bf05-88d8cf3cb0be",
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

Done: card order fbbb8777-cb95-44ff-b76a-142ecb6339b0.

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
  "phone": "+380731222763",
  "device_ref": "sandbox-21471"
}
```

```json
{
  "challenge_id": "b9714da4-5abb-4952-867a-6f8ea32eb3c1",
  "expires_at": "2026-10-28T15:34:33.935964204Z",
  "resend_available_at": "2026-10-28T15:29:34.935964204Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731222763` → **200**

```json
{
  "phone": "+380731222763",
  "audience": "CLIENT",
  "code": "962977",
  "sent_at": "2026-10-28T15:29:33.942189542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b9714da4-5abb-4952-867a-6f8ea32eb3c1",
  "code": "962977",
  "device_ref": "sandbox-21471"
}
```

```json
{
  "session_id": "55c8600a-6987-497b-a4e6-f87dc748bd10",
  "subject": {
    "type": "CLIENT",
    "id": "3f6a9fda-18ee-44e9-99f5-01cb3b4e126e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjZhOWZkYS0xOGVlLTQ0ZTktOTlmNS0wMWNiM2I0ZTEyNmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjc0LCJpYXQiOjE3OTMyMDEzNzQsImp0aSI6IjcxYjY4NThlLTIzYzgtNDJhMC05MjdhLTNjNmY4MjhmMjFjZCIsInNpZCI6IjU1Yzg2MDBhLTY5ODctNDk3Yi1hNGU2LWY4N2RjNzQ4YmQxMCJ9.VbDyKIp9_CcPqQSebm-9Zcvh2u2-LeU9GZheTfH26nY",
  "access_expires_at": "2026-10-28T15:44:34.126984605Z",
  "refresh_token": "A-d_W_uRtj2CfDCvm8So089nBl15kUMU0v4fh_PkOuM",
  "refresh_expires_at": "2026-11-27T15:29:34.126607779Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "6bd08fc4-0f3a-4911-8f24-1d9dc0305605",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "8b06bf31-fa7e-4008-8170-6d2708ca94de",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8b06bf31-fa7e-4008-8170-6d2708ca94de",
    "orderDate": "1793201374",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "614379a20a3992e651e713f894b46d3d",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8b06bf31-fa7e-4008-8170-6d2708ca94de",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731222763"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8b06bf31-fa7e-4008-8170-6d2708ca94de",
  "created_at": "2026-10-28T15:29:34.302027Z",
  "expires_at": "2026-10-28T15:59:34.302027Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/8b06bf31-fa7e-4008-8170-6d2708ca94de` → **200**

```json
{
  "id": "8b06bf31-fa7e-4008-8170-6d2708ca94de",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:29:34.302027Z",
  "expires_at": "2026-10-28T15:59:34.302027Z",
  "completed_at": "2026-10-28T15:29:34.484481Z",
  "masked_pan": "41****5245",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3f6a9fda-18ee-44e9-99f5-01cb3b4e126e",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "3f6a9fda-18ee-44e9-99f5-01cb3b4e126e",
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
      "id": "6386e41c-4d01-4e34-ad1a-62026ef5d0c1",
      "at": "2026-10-28T15:29:35.264705Z",
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
  "client_id": "3f6a9fda-18ee-44e9-99f5-01cb3b4e126e",
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
      "id": "6386e41c-4d01-4e34-ad1a-62026ef5d0c1",
      "at": "2026-10-28T15:29:35.264705Z",
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
  "device_ref": "sandbox-32199"
}
```

```json
{
  "challenge_id": "a2b6ae8c-370d-4694-9cda-eb7577480f8b",
  "expires_at": "2026-10-28T15:34:36.175907029Z",
  "resend_available_at": "2026-10-28T15:29:37.175907029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "673558",
  "sent_at": "2026-10-28T15:29:36.178052542Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2b6ae8c-370d-4694-9cda-eb7577480f8b",
  "code": "673558",
  "device_ref": "sandbox-32199"
}
```

```json
{
  "session_id": "1d6f4d3f-6902-47a9-9ecf-9938f5e3112c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjI3NiwiaWF0IjoxNzkzMjAxMzc2LCJqdGkiOiJiYWJiMjFiZi03N2MwLTRmNGEtYWMwZC1jN2U2ZTJjZGE4MTIiLCJzaWQiOiIxZDZmNGQzZi02OTAyLTQ3YTktOWVjZi05OTM4ZjVlMzExMmMifQ.eBTr1q57B4XneilVJNLMYQQ6hxgL0LubBQtctGGbj6k",
  "access_expires_at": "2026-10-28T15:44:36.365927123Z",
  "refresh_token": "lX9Mzb5kwrVlWNN4nE0rtklU2kR9dN8EIbZ6ktkijR0",
  "refresh_expires_at": "2026-11-27T15:29:36.365554719Z",
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
  "command_id": "0b089e2c-b676-44c0-8be5-7db4da8f3edf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ca6cb85c-e86b-49da-91d7-47c815829ba8",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ca6cb85c-e86b-49da-91d7-47c815829ba8",
    "orderDate": "1793201376",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5af8c99b40341d3573a61dca3a162374",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ca6cb85c-e86b-49da-91d7-47c815829ba8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ca6cb85c-e86b-49da-91d7-47c815829ba8",
  "created_at": "2026-10-28T15:29:36.699584Z",
  "expires_at": "2026-10-28T15:59:36.699584Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ca6cb85c-e86b-49da-91d7-47c815829ba8` → **200**

```json
{
  "id": "ca6cb85c-e86b-49da-91d7-47c815829ba8",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T15:29:36.699584Z",
  "expires_at": "2026-10-28T15:59:36.699584Z",
  "completed_at": "2026-10-28T15:29:36.914253Z",
  "masked_pan": "41****9594",
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
      "id": "79718f8f-3616-44c1-8a31-79d22dcde381",
      "at": "2026-10-28T15:29:37.270422Z",
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
  "command_id": "a6776b33-05b2-4c58-9dff-d6771efb93e9",
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
  "correlation_id": "be65ca84-5bfa-4c14-aa09-aaaa427cdadf"
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
  "session_id": "f29ecaa5-4fa4-4d53-a0fb-2dfb0fb4e5ae",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyNzgsImlhdCI6MTc5MzIwMTM3OCwianRpIjoiYjgyY2VmNTEtNzg5MS00MDhlLWE5Y2ItYjhkYmQyMzhjYzY5Iiwic2lkIjoiZjI5ZWNhYTUtNGZhNC00ZDUzLWEwZmItMmRmYjBmYjRlNWFlIn0.l8sORHyAzJLI1x98bjgiq4FQLgecYwQeBpDfTU7yXMw",
  "access_expires_at": "2026-10-28T15:44:38.832969162Z",
  "refresh_token": "0UxeZ6zOY3EXdIYSi1wfAdoIzBO9NEmaUbdvkG45Evs",
  "refresh_expires_at": "2026-10-29T03:29:38.832602292Z",
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
  "phone": "+48600631551",
  "device_ref": "sandbox-5285"
}
```

```json
{
  "challenge_id": "1e8014a8-0eda-4f4a-a0df-b037ca650567",
  "expires_at": "2026-10-28T15:34:39.343146662Z",
  "resend_available_at": "2026-10-28T15:29:40.343146662Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600631551` → **200**

```json
{
  "phone": "+48600631551",
  "audience": "CLIENT",
  "code": "630064",
  "sent_at": "2026-10-28T15:29:39.345103401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e8014a8-0eda-4f4a-a0df-b037ca650567",
  "code": "630064",
  "device_ref": "sandbox-5285"
}
```

```json
{
  "session_id": "a081ea60-a184-4e39-abe3-224a48feb007",
  "subject": {
    "type": "CLIENT",
    "id": "26be70b9-0b32-48f9-9ed3-450c3984aa6a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNmJlNzBiOS0wYjMyLTQ4ZjktOWVkMy00NTBjMzk4NGFhNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjc5LCJpYXQiOjE3OTMyMDEzNzksImp0aSI6IjI4NTA1NjY2LTYzMzYtNDMxZC05YjgyLTc2Zjk4OGQxMjFlMCIsInNpZCI6ImEwODFlYTYwLWExODQtNGUzOS1hYmUzLTIyNGE0OGZlYjAwNyJ9.1K_doexQ9KDP1H80eeeXfeZn1jUInIS2QGzEHmjqJQo",
  "access_expires_at": "2026-10-28T15:44:39.537046214Z",
  "refresh_token": "n0e2rtI9VGhksHOkCO2T0O8E1zSSTh9Wc-EqQu_91dM",
  "refresh_expires_at": "2026-11-27T15:29:39.536694906Z",
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
  "command_id": "b33ab9c2-a3cb-4652-b9d8-e5bf3706a047",
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
  "correlation_id": "c0e2cd45-7e5d-4157-8e22-17d2eecae0a1",
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
  "command_id": "4940c1e1-6532-43da-8b65-4928a39311d3",
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
  "paused_at": "2026-10-28T15:29:40.229951816Z",
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
  "command_id": "842bae4b-3318-4702-9c92-5b28d5e0ba57",
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
  "id": "05b40673-9a51-4bb8-a95c-45bd09372338",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:40.596843Z",
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
  "command_id": "1d456f25-9eb6-433c-8746-f022578a3dc9",
  "quote_id": "05b40673-9a51-4bb8-a95c-45bd09372338",
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
  "correlation_id": "082937ea-cc0b-4886-be4d-df9d4ca59740"
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
  "paused_at": "2026-10-28T15:29:40.229952Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "19af3864-4066-450f-8e5d-55c3fb89ab61",
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
  "command_id": "844bbebd-3f84-4364-97ab-fb031d9d5ff2",
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
  "command_id": "1ff89408-f8c5-4627-809f-a990359a3d1d",
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
  "id": "82ff67d5-3d4f-455c-8e48-5734e141fcb0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:41.659943Z",
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
  "command_id": "1e1186e1-5299-497f-b918-06a5c295df76",
  "quote_id": "82ff67d5-3d4f-455c-8e48-5734e141fcb0",
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
  "correlation_id": "7a6ea10f-ca34-4d35-8c4a-051aec3dd415"
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
  "command_id": "5bf1e0e5-1562-4766-b092-9c6c231404d3",
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
  "command_id": "aec7b459-8ca3-409c-86d8-5c8ab410d1cd",
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
  "id": "1583e23e-b16a-44cd-a1ab-ca20f2bf41ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:42.378166Z",
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
  "command_id": "a37b4b91-e4d3-4d84-a372-45b994de8fb5",
  "quote_id": "1583e23e-b16a-44cd-a1ab-ca20f2bf41ea",
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
  "correlation_id": "0465d4a9-f222-45ce-96f9-ad3a3665a1a3"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5a30dcc6-94cf-4061-9321-07285b77f847",
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
  "correlation_id": "7105502b-77ce-4f33-9b7a-177ee98d091c"
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
  "command_id": "73ce8d06-9662-45c5-b653-b32bbadef659",
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
  "phone": "+380675461251",
  "device_ref": "sandbox-2826"
}
```

```json
{
  "challenge_id": "cc4fb187-0697-4f7b-bd65-61748f9955cd",
  "expires_at": "2026-10-28T15:34:43.313519504Z",
  "resend_available_at": "2026-10-28T15:29:44.313519504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675461251` → **200**

```json
{
  "phone": "+380675461251",
  "audience": "CLIENT",
  "code": "646977",
  "sent_at": "2026-10-28T15:29:43.315240051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc4fb187-0697-4f7b-bd65-61748f9955cd",
  "code": "646977",
  "device_ref": "sandbox-2826"
}
```

```json
{
  "session_id": "885c611a-38b5-42bd-aaca-af776881bf7b",
  "subject": {
    "type": "CLIENT",
    "id": "1c7293b3-a169-412f-847d-e3234208857f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYzcyOTNiMy1hMTY5LTQxMmYtODQ3ZC1lMzIzNDIwODg1N2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjgzLCJpYXQiOjE3OTMyMDEzODMsImp0aSI6ImYxNWM0Y2I4LWMyMTctNDdjOS1hZTE3LWY3MTcwZjMyY2JmNSIsInNpZCI6Ijg4NWM2MTFhLTM4YjUtNDJiZC1hYWNhLWFmNzc2ODgxYmY3YiJ9.4mFY9eNiNh6h2Hrs48OZ1hWWd7vKeYbKWufgmSfAFEg",
  "access_expires_at": "2026-10-28T15:44:43.514535233Z",
  "refresh_token": "P8ksAKwYSX5eTa4t5_Uytkirrzq5wiBGPCdE0pB8gWM",
  "refresh_expires_at": "2026-11-27T15:29:43.51414996Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1c7293b3-a169-412f-847d-e3234208857f",
  "session_id": "885c611a-38b5-42bd-aaca-af776881bf7b",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0914b94e-56de-4654-92ee-ffbabd9f20c2",
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
  "id": "d51ce9f2-c4c5-49da-9eba-2ca13b412a1c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:43.858928Z",
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
  "challenge_id": "2357d4ba-11d4-4324-a53d-d4ed0e8a76b7",
  "expires_at": "2026-10-28T15:34:46.044073888Z",
  "resend_available_at": "2026-10-28T15:29:47.044073888Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675461251` → **200**

```json
{
  "phone": "+380675461251",
  "audience": "CLIENT",
  "code": "442740",
  "sent_at": "2026-10-28T15:29:46.045438616Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "ba5fc7af-15b9-4d94-94f9-632bd7a24450",
  "challenge_id": "2357d4ba-11d4-4324-a53d-d4ed0e8a76b7",
  "otp_code": "442740"
}
```

```json
{
  "client_id": "1c7293b3-a169-412f-847d-e3234208857f",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T15:29:46.240973305Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "8bd4d0fc-2566-4bb1-941f-95535ccaec91",
  "quote_id": "d51ce9f2-c4c5-49da-9eba-2ca13b412a1c",
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
  "correlation_id": "07bf5c31-882e-4f76-a93e-756587a51b4f"
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
  "session_id": "11ae91e6-5015-4345-b612-a80a1c323028",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyODYsImlhdCI6MTc5MzIwMTM4NiwianRpIjoiYzlhMmNkOWMtMDFjMy00NzM0LTk0NWItNDIyOThmOTY1M2FmIiwic2lkIjoiMTFhZTkxZTYtNTAxNS00MzQ1LWI2MTItYTgwYTFjMzIzMDI4In0.V_lWpm6UoEdzX-y-fd18Z5w0kj5HOdyH9vvyX4E2y6Y",
  "access_expires_at": "2026-10-28T15:44:46.847374446Z",
  "refresh_token": "h3pjuOyu6iMJ6sg8UEd585kbjH5Yy6IvTjYhseP_fhc",
  "refresh_expires_at": "2026-10-29T03:29:46.847062708Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1c7293b3-a169-412f-847d-e3234208857f",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T15:29:46.240973Z",
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

`POST /api/admin/v1/client-deletions/1c7293b3-a169-412f-847d-e3234208857f/complete` → **200**

```json
{
  "command_id": "6d2dffba-359d-48bb-8207-1ba3929b09df",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1c7293b3-a169-412f-847d-e3234208857f",
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
  "correlation_id": "faf22bc0-c8a4-41ed-aabe-ae5e5d169123"
}
```

Done: client 1c7293b3-a169-412f-847d-e3234208857f anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664635949",
  "device_ref": "sandbox-20376"
}
```

```json
{
  "challenge_id": "e4f6af83-b2f8-4f88-a9d3-3484ead70e9f",
  "expires_at": "2026-10-28T15:34:47.548500142Z",
  "resend_available_at": "2026-10-28T15:29:48.548500142Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664635949` → **200**

```json
{
  "phone": "+380664635949",
  "audience": "CLIENT",
  "code": "719830",
  "sent_at": "2026-10-28T15:29:47.55081128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e4f6af83-b2f8-4f88-a9d3-3484ead70e9f",
  "code": "719830",
  "device_ref": "sandbox-20376"
}
```

```json
{
  "session_id": "2cc6cbea-ae84-4314-9469-1f9f43f5ea7d",
  "subject": {
    "type": "CLIENT",
    "id": "be3b2299-e49a-4e92-89da-3578499e1c47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTNiMjI5OS1lNDlhLTRlOTItODlkYS0zNTc4NDk5ZTFjNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjg3LCJpYXQiOjE3OTMyMDEzODcsImp0aSI6ImI2MDg3ZTRmLWRlNWYtNGNkMy1iMDUwLWEwOTM3N2I0OWU2OSIsInNpZCI6IjJjYzZjYmVhLWFlODQtNDMxNC05NDY5LTFmOWY0M2Y1ZWE3ZCJ9.zGGbE6zjHCP9Vg_W2xiBcqFSESD0vAOlKLvf74TA51s",
  "access_expires_at": "2026-10-28T15:44:47.739691307Z",
  "refresh_token": "WPQeoxryIaT52c9kwC4ERJvZ-20qb3npTNvumQcnAwU",
  "refresh_expires_at": "2026-11-27T15:29:47.739285563Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "be3b2299-e49a-4e92-89da-3578499e1c47",
  "session_id": "2cc6cbea-ae84-4314-9469-1f9f43f5ea7d",
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
  "session_id": "79e7215f-7217-4732-9e9c-995eca8b0c01",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyODgsImlhdCI6MTc5MzIwMTM4OCwianRpIjoiZGFkYWY1MmMtYTUzZC00MzQyLWE2MDItNjNhNTJkZmQyZDNjIiwic2lkIjoiNzllNzIxNWYtNzIxNy00NzMyLTllOWMtOTk1ZWNhOGIwYzAxIn0.1l_QFmIe84j-palKdH080xMH6iVC1ubtbQhKX8mdbAg",
  "access_expires_at": "2026-10-28T15:44:48.273951417Z",
  "refresh_token": "Nxn-GHkFFvrR9yc3FCynao38LbCPUCPA9jMRv7hCHxc",
  "refresh_expires_at": "2026-10-29T03:29:48.273618176Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4635949&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "be3b2299-e49a-4e92-89da-3578499e1c47",
      "phone": "+380664635949",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T15:29:47.737672Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/be3b2299-e49a-4e92-89da-3578499e1c47` → **200**

```json
{
  "client": {
    "id": "be3b2299-e49a-4e92-89da-3578499e1c47",
    "phone": "+380664635949",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:29:47.737672Z",
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

`POST /api/admin/v1/clients/be3b2299-e49a-4e92-89da-3578499e1c47/block` → **400**

```json
{
  "command_id": "08dcd04d-32be-42e4-8c74-d5c85c2529f9",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/be3b2299-e49a-4e92-89da-3578499e1c47/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "346cc69e-03e3-4c73-aef4-d62216eb2920",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/be3b2299-e49a-4e92-89da-3578499e1c47/block` → **200**

```json
{
  "command_id": "e3f8bc92-6a00-4a45-9c14-0109cd8c9155",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "be3b2299-e49a-4e92-89da-3578499e1c47",
  "phone": "+380664635949",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T15:29:47.737672Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T15:29:49.011424Z",
    "by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
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
  "correlation_id": "3d9d02c3-b208-48c8-a596-d4acb6df733a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664635949",
  "device_ref": "sandbox-8845"
}
```

```json
{
  "challenge_id": "c872e82e-d51b-4e11-b934-e202731efbd8",
  "expires_at": "2026-10-28T15:34:51.355083671Z",
  "resend_available_at": "2026-10-28T15:29:52.355083671Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664635949` → **200**

```json
{
  "phone": "+380664635949",
  "audience": "CLIENT",
  "code": "760765",
  "sent_at": "2026-10-28T15:29:51.356869647Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c872e82e-d51b-4e11-b934-e202731efbd8",
  "code": "760765",
  "device_ref": "sandbox-8845"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d27547f7-0468-4930-be18-042f8565f392"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/be3b2299-e49a-4e92-89da-3578499e1c47` → **200**

```json
{
  "client": {
    "id": "be3b2299-e49a-4e92-89da-3578499e1c47",
    "phone": "+380664635949",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T15:29:47.737672Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T15:29:49.011424Z",
      "by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
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

`POST /api/admin/v1/clients/be3b2299-e49a-4e92-89da-3578499e1c47/unblock` → **200**

```json
{
  "command_id": "ef11ff94-c86f-4b59-9368-01002f5171cc",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "be3b2299-e49a-4e92-89da-3578499e1c47",
  "phone": "+380664635949",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T15:29:47.737672Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664635949",
  "device_ref": "sandbox-7702"
}
```

```json
{
  "challenge_id": "fdab74d9-3ca8-48a8-82df-35577dfc2052",
  "expires_at": "2026-10-28T15:34:54.116503832Z",
  "resend_available_at": "2026-10-28T15:29:55.116503832Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664635949` → **200**

```json
{
  "phone": "+380664635949",
  "audience": "CLIENT",
  "code": "747844",
  "sent_at": "2026-10-28T15:29:54.118120649Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fdab74d9-3ca8-48a8-82df-35577dfc2052",
  "code": "747844",
  "device_ref": "sandbox-7702"
}
```

```json
{
  "session_id": "cfcb5a7e-9296-4b6e-804e-2083eda35515",
  "subject": {
    "type": "CLIENT",
    "id": "be3b2299-e49a-4e92-89da-3578499e1c47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTNiMjI5OS1lNDlhLTRlOTItODlkYS0zNTc4NDk5ZTFjNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjk0LCJpYXQiOjE3OTMyMDEzOTQsImp0aSI6IjFjODdhMTJlLWQ4MDQtNGMyZS1iZDRiLWU4MzIwMmY1MzY2OCIsInNpZCI6ImNmY2I1YTdlLTkyOTYtNGI2ZS04MDRlLTIwODNlZGEzNTUxNSJ9.eJ6wAHt1c-jaoNrsT3f3wCmsL1Zr-MyJEdUbGlT8qfY",
  "access_expires_at": "2026-10-28T15:44:54.312634347Z",
  "refresh_token": "Jq5xdYKZIHbF3nlZWXapfpsqJS45zSnKjyc-xsIJdzM",
  "refresh_expires_at": "2026-11-27T15:29:54.312238162Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "be3b2299-e49a-4e92-89da-3578499e1c47",
  "session_id": "cfcb5a7e-9296-4b6e-804e-2083eda35515",
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
  "phone": "+380661328295",
  "device_ref": "sandbox-16740"
}
```

```json
{
  "challenge_id": "9e92ad18-612c-486b-8f2e-e5736fb48dfc",
  "expires_at": "2026-10-28T15:34:54.67327963Z",
  "resend_available_at": "2026-10-28T15:29:55.67327963Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661328295` → **200**

```json
{
  "phone": "+380661328295",
  "audience": "CLIENT",
  "code": "090402",
  "sent_at": "2026-10-28T15:29:54.675032162Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9e92ad18-612c-486b-8f2e-e5736fb48dfc",
  "code": "090402",
  "device_ref": "sandbox-16740"
}
```

```json
{
  "session_id": "1ff9d49c-7bb9-49eb-babd-cf8bb1f84592",
  "subject": {
    "type": "CLIENT",
    "id": "39ec5cb2-db6a-4640-a578-b6b08aa6e73f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOWVjNWNiMi1kYjZhLTQ2NDAtYTU3OC1iNmIwOGFhNmU3M2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjk0LCJpYXQiOjE3OTMyMDEzOTQsImp0aSI6IjBmZjRmZGUyLTNjNjYtNGYwOS1iNmQ0LTg4NzU0ODc5MmE2NiIsInNpZCI6IjFmZjlkNDljLTdiYjktNDllYi1iYWJkLWNmOGJiMWY4NDU5MiJ9.2ca6yZlZUmN7OB5jyL3z5SoF_raaioFIVRLwgVnezU4",
  "access_expires_at": "2026-10-28T15:44:54.862390737Z",
  "refresh_token": "ir_ZltJy7v1OJrUJbS1hpojLii5dCMDcLI-mkQ3XW4g",
  "refresh_expires_at": "2026-11-27T15:29:54.862024517Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ab96202-ffb8-4689-8105-8b5afae83699",
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
  "id": "29487f7d-3aef-42ec-baf6-57b01728cc6f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:34:55.037837Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: c19c14e0-0bbb-4b4e-b5d6-b2525a6d7daa) → **201**

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
  "session_id": "9b09d3aa-4b58-4e67-a24e-673bf35df1bc",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyOTUsImlhdCI6MTc5MzIwMTM5NSwianRpIjoiNjRmZDY4NTktODQyMS00NDcwLThlOWItMDM4ZjMzNTU4YTZhIiwic2lkIjoiOWIwOWQzYWEtNGI1OC00ZTY3LWEyNGUtNjczYmYzNWRmMWJjIn0.b2Cp1vFvntMiVRcM6cBMRJvr_CplDAq-HrbKjbmJG7w",
  "access_expires_at": "2026-10-28T15:44:55.474861734Z",
  "refresh_token": "Ex8dViDWzXH0uO8zzRBEbs-Nn5vD8l7xNY38FtjD8yE",
  "refresh_expires_at": "2026-10-29T03:29:55.473948513Z",
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
  "session_id": "5c79069a-9ce6-4c9e-814b-58ef89bc6130",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIyOTUsImlhdCI6MTc5MzIwMTM5NSwianRpIjoiZDc5YjkwODQtZDc4NS00YWQ4LTg0NmUtNjkxZThmMmE2ZDg0Iiwic2lkIjoiNWM3OTA2OWEtOWNlNi00YzllLTgxNGItNThlZjg5YmM2MTMwIn0.JU9GWyLPVonZKaljaHUoxeLCLU_Re2OhN7jv9fX7ytQ",
  "access_expires_at": "2026-10-28T15:44:55.858700901Z",
  "refresh_token": "b7OpGttWmxdyTPfAQ7B-sWedOfzMATXxUwuQXbRjG2A",
  "refresh_expires_at": "2026-10-29T03:29:55.85828792Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3f85913e-0666-4689-b839-2bc2f52ff14d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:29:55.223979Z",
      "actor": {
        "type": "CLIENT",
        "id": "39ec5cb2-db6a-4640-a578-b6b08aa6e73f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
        "quote_id": "29487f7d-3aef-42ec-baf6-57b01728cc6f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c19c14e0-0bbb-4b4e-b5d6-b2525a6d7daa"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:29:55.225373Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
        "attempt_id": "73c4f7be-11f5-464e-9eb7-f5141ddc95b4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c19c14e0-0bbb-4b4e-b5d6-b2525a6d7daa"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T15:29:55.233248Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
        "attempt_id": "73c4f7be-11f5-464e-9eb7-f5141ddc95b4"
      },
      "correlation_id": "c19c14e0-0bbb-4b4e-b5d6-b2525a6d7daa"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "73c4f7be-11f5-464e-9eb7-f5141ddc95b4",
        "generation": 1,
        "started_at": "2026-10-28T15:29:55.224741Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T15:29:55.233248Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T15:29:55.226033Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/c19c14e0-0bbb-4b4e-b5d6-b2525a6d7daa` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "3f85913e-0666-4689-b839-2bc2f52ff14d:0",
      "order_id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
      "at": "2026-10-28T15:29:55.223979Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3f85913e-0666-4689-b839-2bc2f52ff14d:1",
      "order_id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
      "at": "2026-10-28T15:29:55.225373Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "3f85913e-0666-4689-b839-2bc2f52ff14d:2",
      "order_id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
      "at": "2026-10-28T15:29:55.233248Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/8ae053d1-57f8-489b-8afd-796f05f4a10e` → **200**

```json
{
  "found": []
}
```

Done: request c19c14e0-0bbb-4b4e-b5d6-b2525a6d7daa — order 3f85913e-0666-4689-b839-2bc2f52ff14d found by its id.

`GET /api/rider/v1/orders/3f85913e-0666-4689-b839-2bc2f52ff14d` → **200**

```json
{
  "id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "39ec5cb2-db6a-4640-a578-b6b08aa6e73f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:29:55.223504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3f85913e-0666-4689-b839-2bc2f52ff14d/cancel` → **200**

```json
{
  "command_id": "60fe0980-7dc5-4e34-94f1-7f55465ed55d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3f85913e-0666-4689-b839-2bc2f52ff14d",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39ec5cb2-db6a-4640-a578-b6b08aa6e73f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:29:55.223504Z",
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
  "phone": "+380637713747",
  "device_ref": "sandbox-17681"
}
```

```json
{
  "challenge_id": "a25ae154-72f6-40d9-839d-e44a2624884d",
  "expires_at": "2026-10-28T15:34:56.935351186Z",
  "resend_available_at": "2026-10-28T15:29:57.935351186Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637713747` → **200**

```json
{
  "phone": "+380637713747",
  "audience": "CLIENT",
  "code": "736000",
  "sent_at": "2026-10-28T15:29:56.937932083Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a25ae154-72f6-40d9-839d-e44a2624884d",
  "code": "736000",
  "device_ref": "sandbox-17681"
}
```

```json
{
  "session_id": "193f618c-6c8d-4db4-8899-d129cc508ac6",
  "subject": {
    "type": "CLIENT",
    "id": "c19360d2-1bc3-44e4-bedf-5663f1fc12b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMTkzNjBkMi0xYmMzLTQ0ZTQtYmVkZi01NjYzZjFmYzEyYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMjk3LCJpYXQiOjE3OTMyMDEzOTcsImp0aSI6ImUwYjM4ODI2LTZmNWQtNGE0ZC1hYmM2LWZkNmJjMWM2YjNkMyIsInNpZCI6IjE5M2Y2MThjLTZjOGQtNGRiNC04ODk5LWQxMjljYzUwOGFjNiJ9.fzbHj8rDqvELr_3g7Jpjk78HCU7FBPZJi4HeA9MB9ws",
  "access_expires_at": "2026-10-28T15:44:57.129616849Z",
  "refresh_token": "OyWEfNWMvYBhbpsQu5OwE_sY5EBOeym6IIObROLAod4",
  "refresh_expires_at": "2026-11-27T15:29:57.129261095Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "dfd117d1-68a4-4874-8b9f-2dc8cbda5d9a",
  "expires_at": "2026-10-28T15:34:59.305597604Z",
  "resend_available_at": "2026-10-28T15:30:00.305597604Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637713747` → **200**

```json
{
  "phone": "+380637713747",
  "audience": "CLIENT",
  "code": "267856",
  "sent_at": "2026-10-28T15:29:59.307616747Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "9509da72-42f9-4e0d-b719-cb110774310e",
  "challenge_id": "dfd117d1-68a4-4874-8b9f-2dc8cbda5d9a",
  "otp_code": "267856"
}
```

```json
{
  "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
  "state": "PENDING",
  "created_at": "2026-10-28T15:29:59.511533Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7` → **200**

```json
{
  "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
  "state": "PENDING",
  "created_at": "2026-10-28T15:29:59.511533Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7` → **200**

```json
{
  "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
  "state": "PENDING",
  "created_at": "2026-10-28T15:29:59.511533Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7` → **200**

```json
{
  "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
  "state": "PENDING",
  "created_at": "2026-10-28T15:29:59.511533Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7` → **200**

```json
{
  "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
  "state": "PENDING",
  "created_at": "2026-10-28T15:29:59.511533Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7` → **200**

```json
{
  "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
  "state": "READY",
  "created_at": "2026-10-28T15:29:59.511533Z",
  "ready_at": "2026-10-28T15:30:03.75935Z",
  "expires_at": "2026-11-04T15:30:03.75935Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633730267",
  "device_ref": "sandbox-32198"
}
```

```json
{
  "challenge_id": "ed63f929-1204-4cd8-a323-589035760b6c",
  "expires_at": "2026-10-28T15:35:04.569575963Z",
  "resend_available_at": "2026-10-28T15:30:05.569575963Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633730267` → **200**

```json
{
  "phone": "+380633730267",
  "audience": "CLIENT",
  "code": "325968",
  "sent_at": "2026-10-28T15:30:04.571636769Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed63f929-1204-4cd8-a323-589035760b6c",
  "code": "325968",
  "device_ref": "sandbox-32198"
}
```

```json
{
  "session_id": "140606f9-8a34-4b06-a90b-028cadca03a7",
  "subject": {
    "type": "CLIENT",
    "id": "e566af39-6f41-4d1e-a2b8-8ab4e8a95f5d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTY2YWYzOS02ZjQxLTRkMWUtYTJiOC04YWI0ZThhOTVmNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzA0LCJpYXQiOjE3OTMyMDE0MDQsImp0aSI6IjhmNWMxNzlkLTA0ZTQtNDlmNC1iYWM3LTQwMGY5N2M0Zjg1NCIsInNpZCI6IjE0MDYwNmY5LThhMzQtNGIwNi1hOTBiLTAyOGNhZGNhMDNhNyJ9.AFdcgeTaexgKeqTjWI9nNBV7mCBhBc3GPhzwr9j-Zgc",
  "access_expires_at": "2026-10-28T15:45:04.77139372Z",
  "refresh_token": "4XfpmqmsHD0FF3q07eZLHgdR-1O6OSOrIm0VRUlcG1I",
  "refresh_expires_at": "2026-11-27T15:30:04.770965055Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/12b142a8-843c-4299-94e0-92e68fda5cf7/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c0cd90fa-01c2-4d5a-a608-9c4fedf6cbdb"
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
  "session_id": "83e46c3b-55d2-442f-bb6a-bee1e43bf481",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMDUsImlhdCI6MTc5MzIwMTQwNSwianRpIjoiMDVmYjFmODMtNTU4Yy00OGFiLWE3OTAtMDRiNzdiZDkzZjRlIiwic2lkIjoiODNlNDZjM2ItNTVkMi00NDJmLWJiNmEtYmVlMWU0M2JmNDgxIn0.MNvfWZhEH72NpWueYYG4H0Nb97XhFSbqxRml5EMyUaQ",
  "access_expires_at": "2026-10-28T15:45:05.310723143Z",
  "refresh_token": "NuSInO9KREEfQdjFs4LFxSS8IFFhptMJII450eMXeWI",
  "refresh_expires_at": "2026-10-29T03:30:05.310386487Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c19360d2-1bc3-44e4-bedf-5663f1fc12b5",
  "session_id": "193f618c-6c8d-4db4-8899-d129cc508ac6",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/c19360d2-1bc3-44e4-bedf-5663f1fc12b5/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "12b142a8-843c-4299-94e0-92e68fda5cf7",
      "state": "READY",
      "created_at": "2026-10-28T15:29:59.511533Z",
      "ready_at": "2026-10-28T15:30:03.75935Z",
      "expires_at": "2026-11-04T15:30:03.75935Z",
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
  "device_ref": "sandbox-17237"
}
```

```json
{
  "challenge_id": "32258c6d-9677-4f1a-abef-2bc7c2f1121b",
  "expires_at": "2026-10-28T15:35:05.825307666Z",
  "resend_available_at": "2026-10-28T15:30:06.825307666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "091586",
  "sent_at": "2026-10-28T15:30:05.827165207Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32258c6d-9677-4f1a-abef-2bc7c2f1121b",
  "code": "091586",
  "device_ref": "sandbox-17237"
}
```

```json
{
  "session_id": "688d2bc3-21c0-4594-8eae-aca469cc9b42",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjMwNiwiaWF0IjoxNzkzMjAxNDA2LCJqdGkiOiIyYjYyM2RiZS0xNTMyLTQ2NjktYjIyNS00ZmNjNGVkMmRhMTciLCJzaWQiOiI2ODhkMmJjMy0yMWMwLTQ1OTQtOGVhZS1hY2E0NjljYzliNDIifQ.T7dAvA09KF6N1CWXsKYSo2OG_KtS_29NTLV_cbIW5rw",
  "access_expires_at": "2026-10-28T15:45:06.022568566Z",
  "refresh_token": "koyi2BTw5ev8w5FXrY0q1k_hpQIqjydZIjc6FTbboXM",
  "refresh_expires_at": "2026-11-27T15:30:06.022214304Z",
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
  "device_ref": "sandbox-21887"
}
```

```json
{
  "challenge_id": "b71aad5e-428a-4a52-b2c7-a197e2cf6d26",
  "expires_at": "2026-10-28T15:35:06.358022757Z",
  "resend_available_at": "2026-10-28T15:30:07.358022757Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "522294",
  "sent_at": "2026-10-28T15:30:06.359822636Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b71aad5e-428a-4a52-b2c7-a197e2cf6d26",
  "code": "522294",
  "device_ref": "sandbox-21887"
}
```

```json
{
  "session_id": "4545ab86-018f-4e8e-b3fb-e5510e2a96ad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjMwNiwiaWF0IjoxNzkzMjAxNDA2LCJqdGkiOiI4ZDU2ZTJkYi03NjMzLTQ2ZjctOWRlOS04NmY4MDA5Njg4Y2YiLCJzaWQiOiI0NTQ1YWI4Ni0wMThmLTRlOGUtYjNmYi1lNTUxMGUyYTk2YWQifQ.w_J0Pme0hWd7vq6p0Kegv3cLe1mavkna8XLMoD9yiso",
  "access_expires_at": "2026-10-28T15:45:06.586068374Z",
  "refresh_token": "yUzrGn1-TdY0DvkERI7kT4qOyT8uDZ7lXYno1hWsEVc",
  "refresh_expires_at": "2026-11-27T15:30:06.585724958Z",
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
  "command_id": "2341edc8-3537-488d-bc1b-6b63ebed5ce0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:06Z",
    "sequence": 1793201406929
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4dab84db-50ea-4758-a67c-615e04d38661",
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
  "last_heartbeat_at": "2026-10-28T15:30:06.944203Z",
  "last_location_at": "2026-10-28T15:30:06.944203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-5678"
}
```

```json
{
  "challenge_id": "85c4a317-d196-42cb-b453-4015511e4d43",
  "expires_at": "2026-10-28T15:35:07.125059163Z",
  "resend_available_at": "2026-10-28T15:30:08.125059163Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "393412",
  "sent_at": "2026-10-28T15:30:07.126880289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85c4a317-d196-42cb-b453-4015511e4d43",
  "code": "393412",
  "device_ref": "sandbox-5678"
}
```

```json
{
  "session_id": "5409097a-745d-4862-9d4d-f86e8da63af7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjMwNywiaWF0IjoxNzkzMjAxNDA3LCJqdGkiOiJhNjYzZjdmMy04MjhkLTRkOTYtYmIzNy1mZjhjMjMwZjJjMjIiLCJzaWQiOiI1NDA5MDk3YS03NDVkLTQ4NjItOWQ0ZC1mODZlOGRhNjNhZjcifQ.XH-nPMXYrg-Z5gyWaP1o271-RyeLXiKhXK9TReH5mm0",
  "access_expires_at": "2026-10-28T15:45:07.325845897Z",
  "refresh_token": "-Jkm3CE9RZdvL64fhIk4db7fw_mqPoRC2fhSRKJklHs",
  "refresh_expires_at": "2026-11-27T15:30:07.325338144Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8c0ae9d0-8bec-4f53-82d8-e0e20224373e",
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
  "last_heartbeat_at": "2026-10-28T15:29:14.776109Z",
  "last_location_at": "2026-10-28T15:29:14.776109Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c0ae9d0-8bec-4f53-82d8-e0e20224373e/handover` → **200**

```json
{
  "command_id": "71c85f8f-603a-4257-8f78-a5d9a12317ef",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8c0ae9d0-8bec-4f53-82d8-e0e20224373e",
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
  "last_heartbeat_at": "2026-10-28T15:29:14.776109Z",
  "last_location_at": "2026-10-28T15:29:14.776109Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8c0ae9d0-8bec-4f53-82d8-e0e20224373e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:07Z",
    "sequence": 1793201407847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8c0ae9d0-8bec-4f53-82d8-e0e20224373e",
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
  "last_heartbeat_at": "2026-10-28T15:30:07.866575Z",
  "last_location_at": "2026-10-28T15:30:07.866575Z",
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
  "session_id": "cb0a538a-0a05-46a2-a5e6-a99b06aa4f64",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMDgsImlhdCI6MTc5MzIwMTQwOCwianRpIjoiZjQ0NWI1NDMtMzA2Mi00YWJiLTkzNDgtNjEzYTVkZDEyMjY0Iiwic2lkIjoiY2IwYTUzOGEtMGEwNS00NmEyLWE1ZTYtYTk5YjA2YWE0ZjY0In0.Vg20Yio9nkrvUbNPrS854R_dlHv8-OTDZqNphxG7BKk",
  "access_expires_at": "2026-10-28T15:45:08.242314292Z",
  "refresh_token": "15CBO8URukjvJJLV4nDvHMyzfs-S3oAB6WS4sGpI22Q",
  "refresh_expires_at": "2026-10-29T03:30:08.241954637Z",
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
  "session_id": "e685ee6e-6584-47d5-aa4a-39c895bee1a0",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMDgsImlhdCI6MTc5MzIwMTQwOCwianRpIjoiNmEzY2M0NzktY2M0Ny00ZDg4LTg2OTgtMjNjMzM3MjEzZWNiIiwic2lkIjoiZTY4NWVlNmUtNjU4NC00N2Q1LWFhNGEtMzljODk1YmVlMWEwIn0.c5qOZocrKubsHGWHvxHuCAm_Jj2eVMYEwD8M8h4MphQ",
  "access_expires_at": "2026-10-28T15:45:08.613129959Z",
  "refresh_token": "p5Yru2nHHYQ7J5C9kVzC8sAtaWlXj1ZnhUthj6wFwis",
  "refresh_expires_at": "2026-10-29T03:30:08.612634465Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680119341",
  "device_ref": "sandbox-2125"
}
```

```json
{
  "challenge_id": "071be82c-6ac7-45ce-9fe6-75de669ff3b2",
  "expires_at": "2026-10-28T15:35:08.78050792Z",
  "resend_available_at": "2026-10-28T15:30:09.78050792Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680119341` → **200**

```json
{
  "phone": "+380680119341",
  "audience": "CLIENT",
  "code": "797729",
  "sent_at": "2026-10-28T15:30:08.78215906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "071be82c-6ac7-45ce-9fe6-75de669ff3b2",
  "code": "797729",
  "device_ref": "sandbox-2125"
}
```

```json
{
  "session_id": "88ad8657-d2d1-4416-ac87-59f739ba1ff8",
  "subject": {
    "type": "CLIENT",
    "id": "f8f32b24-168d-46fd-aaff-796f406de168"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOGYzMmIyNC0xNjhkLTQ2ZmQtYWFmZi03OTZmNDA2ZGUxNjgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzA4LCJpYXQiOjE3OTMyMDE0MDgsImp0aSI6IjU4ODY4YWNlLTNiZjAtNDM0ZC05Mjc5LWQ5YTM5ODMxYzJiMSIsInNpZCI6Ijg4YWQ4NjU3LWQyZDEtNDQxNi1hYzg3LTU5ZjczOWJhMWZmOCJ9.j3jJeBFcjzOBILs6IiAWEv87ip8QnONTNgfluUJdnGE",
  "access_expires_at": "2026-10-28T15:45:08.977251419Z",
  "refresh_token": "Kf9aQG41Q4GB7mnelAWBK0V0eFCh8exXXXrJeaiHQAQ",
  "refresh_expires_at": "2026-11-27T15:30:08.976944728Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cb710c92-b006-478b-90a9-7513bf6eda67",
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
  "id": "97c50922-ceb0-4992-8c62-6415e5fee99a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:09.155792Z",
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
  "command_id": "ee22cc33-bb21-40b4-ad47-c181fafdce6e",
  "quote_id": "97c50922-ceb0-4992-8c62-6415e5fee99a",
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
  "id": "81abc948-80e7-40bc-b577-844255ec58d4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f8f32b24-168d-46fd-aaff-796f406de168",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:09.344528Z",
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
    "id": "45fd5466-859a-445f-99e7-02852908258d",
    "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
    "expires_at": "2026-10-28T15:30:24.3472Z",
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

`POST /api/driver/v1/offers/45fd5466-859a-445f-99e7-02852908258d/reject` → **204**

```json
{
  "command_id": "e198e269-fde9-4548-887d-962a98b5904e"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bbfc0102-bfeb-475d-9234-deeab71d6500",
    "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
    "expires_at": "2026-10-28T15:30:24.712659Z",
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

`POST /api/driver/v1/offers/bbfc0102-bfeb-475d-9234-deeab71d6500/accept` → **200**

```json
{
  "command_id": "35b6e6f3-fa3e-4f91-9934-13b159dc5cf4"
}
```

```json
{
  "id": "d7ec0d11-61a9-4eb6-9f9f-3c4687a13bdd",
  "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cfd4b83b-9bdb-4660-8b53-7d2bdb2cc9f5",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/81abc948-80e7-40bc-b577-844255ec58d4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:30:09.344968Z",
      "actor": {
        "type": "CLIENT",
        "id": "f8f32b24-168d-46fd-aaff-796f406de168",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
        "quote_id": "97c50922-ceb0-4992-8c62-6415e5fee99a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "22d5b9b4-24d1-4480-a0ce-b4ee5c0bd41f"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:30:09.3466Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
        "attempt_id": "947cf8c9-c51c-4bb0-99fa-eafe202666b9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "22d5b9b4-24d1-4480-a0ce-b4ee5c0bd41f"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:30:09.35141Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "45fd5466-859a-445f-99e7-02852908258d",
        "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "22d5b9b4-24d1-4480-a0ce-b4ee5c0bd41f"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T15:30:09.711826Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "45fd5466-859a-445f-99e7-02852908258d",
        "order_id": "81abc948-80e7-40bc-b577-844255ec58d4"
      },
      "correlation_id": "ce2d25c8-16ff-4ee3-b29a-a5d67bbda39f"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 81abc948-80e7-40bc-b577-844255ec58d4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/81abc948-80e7-40bc-b577-844255ec58d4` → **200**

```json
{
  "id": "81abc948-80e7-40bc-b577-844255ec58d4",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "f8f32b24-168d-46fd-aaff-796f406de168",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d7ec0d11-61a9-4eb6-9f9f-3c4687a13bdd",
    "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "cfd4b83b-9bdb-4660-8b53-7d2bdb2cc9f5",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:30:09.344528Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/81abc948-80e7-40bc-b577-844255ec58d4/cancel` → **200**

```json
{
  "command_id": "f7bfebe6-86d9-4068-b591-fa82ecf75dd5",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "81abc948-80e7-40bc-b577-844255ec58d4",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f8f32b24-168d-46fd-aaff-796f406de168",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "d7ec0d11-61a9-4eb6-9f9f-3c4687a13bdd",
    "order_id": "81abc948-80e7-40bc-b577-844255ec58d4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cfd4b83b-9bdb-4660-8b53-7d2bdb2cc9f5",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:30:09.344528Z",
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
  "session_id": "4dab84db-50ea-4758-a67c-615e04d38661",
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
  "last_heartbeat_at": "2026-10-28T15:30:06.944203Z",
  "last_location_at": "2026-10-28T15:30:06.944203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4dab84db-50ea-4758-a67c-615e04d38661/close` → **200**

```json
{
  "command_id": "85b13e84-a1cd-4b03-b444-3da47af4dae3",
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
  "session_id": "8c0ae9d0-8bec-4f53-82d8-e0e20224373e",
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
  "last_heartbeat_at": "2026-10-28T15:30:07.866575Z",
  "last_location_at": "2026-10-28T15:30:07.866575Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8c0ae9d0-8bec-4f53-82d8-e0e20224373e/close` → **200**

```json
{
  "command_id": "368249cd-a862-4774-9dab-f95d3264ea28",
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
  "session_id": "6649f8fe-b304-4f98-87de-fa08d719f11e",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMTEsImlhdCI6MTc5MzIwMTQxMSwianRpIjoiNmIwZDBjZTAtOTI3Zi00NTZhLThjMDItZGRjYjM4NzVjOTBlIiwic2lkIjoiNjY0OWY4ZmUtYjMwNC00Zjk4LTg3ZGUtZmEwOGQ3MTlmMTFlIn0.BsARke96k5IJzJ4w60gLjEbQ8pgFxenN2cyH-c4LQ08",
  "access_expires_at": "2026-10-28T15:45:11.616402947Z",
  "refresh_token": "QVI93LJCsHMwiSDhagm7yzQTKNlLhmi6r3cR8k8Oc3w",
  "refresh_expires_at": "2026-10-29T03:30:11.616003356Z",
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
  "command_id": "07c314bb-461f-422b-a5d4-cd76d8c932f3",
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
  "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-28T15:30:11.980107Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "c9eea4ed-8db8-4c2d-b442-c3648375f5d8",
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
  "correlation_id": "91f4f3dd-42c6-405c-9458-dccd40118374"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "d9d62ed2-263c-408c-8b78-466b7fa9ecf7",
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
  "correlation_id": "dd3d2ade-c019-4260-8eb8-890209f50b52"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632406042",
  "device_ref": "sandbox-5889"
}
```

```json
{
  "challenge_id": "da29b799-03fa-4a65-bd73-f4cefe270eae",
  "expires_at": "2026-10-28T15:35:12.514355059Z",
  "resend_available_at": "2026-10-28T15:30:13.514355059Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632406042` → **200**

```json
{
  "phone": "+380632406042",
  "audience": "CLIENT",
  "code": "434030",
  "sent_at": "2026-10-28T15:30:12.51643241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "da29b799-03fa-4a65-bd73-f4cefe270eae",
  "code": "434030",
  "device_ref": "sandbox-5889"
}
```

```json
{
  "session_id": "748b1ec9-89e1-4d9c-90d3-6dd3ddacb9f9",
  "subject": {
    "type": "CLIENT",
    "id": "9f6b5e6a-ccc5-4fbe-a902-ef11b3cbca01"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZjZiNWU2YS1jY2M1LTRmYmUtYTkwMi1lZjExYjNjYmNhMDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzEyLCJpYXQiOjE3OTMyMDE0MTIsImp0aSI6ImNjYThjMjZlLWYyNDEtNDgzZS1hMDBlLWNmMmE0MWVjNzU3YSIsInNpZCI6Ijc0OGIxZWM5LTg5ZTEtNGQ5Yy05MGQzLTZkZDNkZGFjYjlmOSJ9.xBShGrL3n0dQhrtwEd2tW4FUxiNTYojotXrPUrs_d9M",
  "access_expires_at": "2026-10-28T15:45:12.707217587Z",
  "refresh_token": "N_TDTAOsHl4BxaG0l7Eswmgn9HRENJl86xOeOBGKKJQ",
  "refresh_expires_at": "2026-11-27T15:30:12.706733225Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d469c36d-5723-4e0e-be84-c5cd8bb74ecf",
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
  "id": "9d45cf08-f2c9-4640-a023-b9cfc7c620c1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:12.882722Z",
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
  "command_id": "2e783d95-adff-4131-bf40-6f3dd9018a26",
  "quote_id": "9d45cf08-f2c9-4640-a023-b9cfc7c620c1",
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
  "correlation_id": "2059ec19-d3c1-4db5-9769-463f8666b489"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6cd88835-b748-4a75-b62b-67ada02842b3",
  "quote_id": "9d45cf08-f2c9-4640-a023-b9cfc7c620c1",
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
  "id": "173a3a7b-0b49-4007-b3c7-15a1f86d9c7e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9f6b5e6a-ccc5-4fbe-a902-ef11b3cbca01",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:13.239071Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/173a3a7b-0b49-4007-b3c7-15a1f86d9c7e/cancel` → **200**

```json
{
  "command_id": "d2c4a2a6-4ccf-438b-bd3f-354c64f2d698",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "173a3a7b-0b49-4007-b3c7-15a1f86d9c7e",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9f6b5e6a-ccc5-4fbe-a902-ef11b3cbca01",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:13.239071Z",
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
  "command_id": "19a38fc1-8670-433f-b2f1-4f8dd7e11474",
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
  "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-28T15:30:13.623Z"
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
      "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-28T15:30:13.623Z"
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
  "device_ref": "sandbox-20689"
}
```

```json
{
  "challenge_id": "c94cb057-f0b8-4744-aa78-20ca0aff23f1",
  "expires_at": "2026-10-28T15:35:14.155071739Z",
  "resend_available_at": "2026-10-28T15:30:15.155071739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "522251",
  "sent_at": "2026-10-28T15:30:14.15683981Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c94cb057-f0b8-4744-aa78-20ca0aff23f1",
  "code": "522251",
  "device_ref": "sandbox-20689"
}
```

```json
{
  "session_id": "87ad77a7-4406-4a5d-85a7-91f473dbac32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjMxNCwiaWF0IjoxNzkzMjAxNDE0LCJqdGkiOiJiNDA4ZGZkNy0yNGY5LTRhNDItYjYwOS02MWU0MWRlNDE2ZDAiLCJzaWQiOiI4N2FkNzdhNy00NDA2LTRhNWQtODVhNy05MWY0NzNkYmFjMzIifQ.Uc2k5GOEQqIdDx8jpVmQ80QgEuEdCVjC9-U39ULyVFw",
  "access_expires_at": "2026-10-28T15:45:14.348199141Z",
  "refresh_token": "fM_ObzzrDRnIvonL5f_cwJUb-VADf4WhtAXl6MAczeM",
  "refresh_expires_at": "2026-11-27T15:30:14.347716426Z",
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
  "command_id": "6e9fbcb7-8fb3-4960-ace0-289bdefe8e10",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:14Z",
    "sequence": 1793201414684
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:14.699229Z",
  "last_location_at": "2026-10-28T15:30:14.699229Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674826093",
  "device_ref": "sandbox-30259"
}
```

```json
{
  "challenge_id": "14c2b2ea-8d2a-481c-9c11-9516cc02746d",
  "expires_at": "2026-10-28T15:35:14.875203958Z",
  "resend_available_at": "2026-10-28T15:30:15.875203958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674826093` → **200**

```json
{
  "phone": "+380674826093",
  "audience": "CLIENT",
  "code": "991723",
  "sent_at": "2026-10-28T15:30:14.877028298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14c2b2ea-8d2a-481c-9c11-9516cc02746d",
  "code": "991723",
  "device_ref": "sandbox-30259"
}
```

```json
{
  "session_id": "29294e9e-111a-43b8-bc07-6b337b2900a4",
  "subject": {
    "type": "CLIENT",
    "id": "63b565eb-d8a8-4533-9f7e-7573b8199810"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2I1NjVlYi1kOGE4LTQ1MzMtOWY3ZS03NTczYjgxOTk4MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzE1LCJpYXQiOjE3OTMyMDE0MTUsImp0aSI6IjM1MjBhNjNhLTM4NDktNDRiNS05YTFjLWJkZTc4ZjE1OGZlNSIsInNpZCI6IjI5Mjk0ZTllLTExMWEtNDNiOC1iYzA3LTZiMzM3YjI5MDBhNCJ9.gXWbj2Gz853_xbS7W7eq6ZCarablGPFv_-fQHioR7hY",
  "access_expires_at": "2026-10-28T15:45:15.065819137Z",
  "refresh_token": "_SURel1LDgKhZxH61oGfarvkY705WAN9xATRy-7Vits",
  "refresh_expires_at": "2026-11-27T15:30:15.065457314Z",
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
  "command_id": "9d35e16c-b3c6-43b3-a19c-044b6844efc9",
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
  "id": "b66917f9-e586-490d-ada5-fa4fae7a9e3a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:15.418599Z",
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
  "command_id": "7ef7832c-b65e-4531-9af6-35f95a5f8fdc",
  "platform": "ANDROID",
  "token": "sandbox-driver-26ce95f8-6624-4f60-88df-5e2910fb98f2"
}
```

```json
{
  "id": "28990c1f-a04e-49f2-bfcc-8eb3577b607f",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:30:15.610935Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "a6fcd81c-3a78-48d0-8092-d47160e99677",
  "platform": "ANDROID",
  "token": "sandbox-rider-d4137c3a-53c4-42eb-8ff5-5e52a899320f"
}
```

```json
{
  "id": "495f6704-4122-43f7-b55e-c25a837900f6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T15:30:15.795266Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4efe25f8-199e-4b63-9395-e9ea62357019",
  "quote_id": "b66917f9-e586-490d-ada5-fa4fae7a9e3a",
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
  "id": "210b2859-da9c-4768-8f36-82995040cc54",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "63b565eb-d8a8-4533-9f7e-7573b8199810",
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
  "created_at": "2026-10-28T15:30:15.982905Z",
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
    "id": "f1142ab2-d971-4c6f-b06d-a705c46f895b",
    "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
    "expires_at": "2026-10-28T15:30:30.985093Z",
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

`POST /api/driver/v1/offers/f1142ab2-d971-4c6f-b06d-a705c46f895b/accept` → **200**

```json
{
  "command_id": "7fa204f1-126f-43c1-a1a9-ef76c9ec6a10"
}
```

```json
{
  "id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "897f5f55-daf6-4021-b7d1-5cc735001961",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:30:15.963Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T15:30:15.963Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:30:17.030953893Z",
    "token_suffix": "fb98f2",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "737bfdfd-8c46-4c69-8575-c108a91ab868",
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
      "order_version": "2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380674826093&after=2026-10-28T15:30:15.963Z` → **200**

```json
[
  {
    "at": "2026-10-28T15:30:17.032880266Z",
    "token_suffix": "99320f",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "4f6f0154-02ed-4d75-861d-d100eff2c5ff",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
      "order_version": "3"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/210b2859-da9c-4768-8f36-82995040cc54/messages` → **201**

```json
{
  "command_id": "9c4e588d-67f1-43e1-84ba-736651d5c23c",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "b1b1c81f-d861-4e2c-8079-92bae089d2c0",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T15:30:17.624432482Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "897f5f55-daf6-4021-b7d1-5cc735001961",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "assignment_id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
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

`POST /api/driver/v1/trips/897f5f55-daf6-4021-b7d1-5cc735001961/messages` → **201**

```json
{
  "command_id": "3010d068-18c0-4955-9e33-597d43a813e9",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "271758c3-5af9-4101-b36a-7f23932fc827",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T15:30:17.976789264Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/210b2859-da9c-4768-8f36-82995040cc54/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/897f5f55-daf6-4021-b7d1-5cc735001961/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674826093"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:18Z",
    "sequence": 1793201418501
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:18.516799Z",
  "last_location_at": "2026-10-28T15:30:18.516799Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "897f5f55-daf6-4021-b7d1-5cc735001961",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "assignment_id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
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

`POST /api/driver/v1/trips/897f5f55-daf6-4021-b7d1-5cc735001961/arrive` → **200**

```json
{
  "command_id": "8492422b-c027-4e97-b577-44090c1786eb",
  "expected_version": 0
}
```

```json
{
  "id": "897f5f55-daf6-4021-b7d1-5cc735001961",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "assignment_id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
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
  "arrived_at": "2026-10-28T15:30:18.874627Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/897f5f55-daf6-4021-b7d1-5cc735001961/start` → **200**

```json
{
  "command_id": "6146baba-5b92-413f-a4e1-a704ddb0fcb7",
  "expected_version": 1
}
```

```json
{
  "id": "897f5f55-daf6-4021-b7d1-5cc735001961",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "assignment_id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
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
  "arrived_at": "2026-10-28T15:30:18.874627Z",
  "started_at": "2026-10-28T15:30:19.052803Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:19Z",
    "sequence": 1793201419229
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:19.244531Z",
  "last_location_at": "2026-10-28T15:30:19.244531Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/897f5f55-daf6-4021-b7d1-5cc735001961/complete` → **200**

```json
{
  "command_id": "7bdea322-d6fa-4531-879f-d7d9a12d7fbc",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:30:19Z",
  "cash_received": true
}
```

```json
{
  "id": "897f5f55-daf6-4021-b7d1-5cc735001961",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "assignment_id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
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
  "arrived_at": "2026-10-28T15:30:18.874627Z",
  "started_at": "2026-10-28T15:30:19.052803Z",
  "completed_at": "2026-10-28T15:30:19.429833Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/210b2859-da9c-4768-8f36-82995040cc54` → **200**

```json
{
  "id": "210b2859-da9c-4768-8f36-82995040cc54",
  "short_number": 10,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "63b565eb-d8a8-4533-9f7e-7573b8199810",
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
    "id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d",
    "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "897f5f55-daf6-4021-b7d1-5cc735001961",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:30:15.982905Z",
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
    "id": "210b2859-da9c-4768-8f36-82995040cc54",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:30:15.982905Z",
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
    "id": "897f5f55-daf6-4021-b7d1-5cc735001961",
    "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
    "order_short_number": 10,
    "created_at": "2026-10-28T15:30:16.363012Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "1b1a89ad-fbbb-44f0-a1de-0d027cba2ce7",
    "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
    "order_short_number": 2,
    "created_at": "2026-10-28T15:29:06.798638Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "78fb77cf-445f-43ee-beda-a5c97372cb8a",
    "order_id": "11499b48-8f57-469f-bedc-4f37d49b61b1",
    "order_short_number": 1,
    "created_at": "2026-10-28T15:28:53.397628Z",
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

`GET /api/rider/v1/orders/210b2859-da9c-4768-8f36-82995040cc54/tip` → **200**

```json
{
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
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
  "available_until": "2026-10-29T15:30:19.429833Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/210b2859-da9c-4768-8f36-82995040cc54/tip` → **201**

```json
{
  "command_id": "b9af04bb-31e5-4bb2-95fd-2b1fabe23f9a",
  "amount_minor": 1100
}
```

```json
{
  "id": "247488d3-c8df-4454-be1f-fc65709150d7",
  "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T15:30:23.683371Z"
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
  "session_id": "90bbab45-d476-4e7e-aecf-445596457fd6",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMjQsImlhdCI6MTc5MzIwMTQyNCwianRpIjoiOThlNTY4MjgtMmJmYi00ZTRjLTg5NGUtNDMyYTI2M2QwNzIyIiwic2lkIjoiOTBiYmFiNDUtZDQ3Ni00ZTdlLWFlY2YtNDQ1NTk2NDU3ZmQ2In0.j_zVcTBsQSuayPLkBh6IOhsDMk6rWNQtbbG8H2g2YEA",
  "access_expires_at": "2026-10-28T15:45:24.076635015Z",
  "refresh_token": "z8T8u5ha0V_8QvcXV97nFwo1vaToMQzI3kBtLJ_r-0g",
  "refresh_expires_at": "2026-10-29T03:30:24.076240934Z",
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
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 3
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
      "DRIVER": 1,
      "STAFF": 1,
      "RIDER": 3
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
  "generated_at": "2026-10-28T15:30:24.253827637Z"
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
  "generated_at": "2026-10-28T15:30:24.441024176Z"
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
  "session_id": "434f9551-caca-45b5-87b1-d21223928297",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMjQsImlhdCI6MTc5MzIwMTQyNCwianRpIjoiYTcyYzdlODgtOTc2My00Mzk3LTgwNDMtYjBkNjY2YTRhN2M5Iiwic2lkIjoiNDM0Zjk1NTEtY2FjYS00NWI1LTg3YjEtZDIxMjIzOTI4Mjk3In0.Gv4V9M1CyLGd33j9kWQ58KokPy--9EKg04uFJZLKEjc",
  "access_expires_at": "2026-10-28T15:45:24.831641778Z",
  "refresh_token": "3lbzbtMDBXMQ36u6LfideNU_Dk7GMH1ctRqDCPahmDs",
  "refresh_expires_at": "2026-10-29T03:30:24.831231473Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/210b2859-da9c-4768-8f36-82995040cc54/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:30:15.983308Z",
      "actor": {
        "type": "CLIENT",
        "id": "63b565eb-d8a8-4533-9f7e-7573b8199810",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
        "quote_id": "b66917f9-e586-490d-ada5-fa4fae7a9e3a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a7acbc18-2210-465b-b3aa-0ef718c44ab2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:30:15.98465Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
        "attempt_id": "812c7941-bd64-4d9f-8fd8-d772e46b9d0e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a7acbc18-2210-465b-b3aa-0ef718c44ab2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:30:15.986416Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f1142ab2-d971-4c6f-b06d-a705c46f895b",
        "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "a7acbc18-2210-465b-b3aa-0ef718c44ab2"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:30:16.364247Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f1142ab2-d971-4c6f-b06d-a705c46f895b",
        "order_id": "210b2859-da9c-4768-8f36-82995040cc54",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "bf09bdd3-7a28-4907-9de7-eb6672d7c81d"
      },
      "correlation_id": "f2989cd8-3254-4dcb-a81e-a80af9112a12"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T15:30:25.189469327Z",
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
      "last_location_at": "2026-10-28T15:30:19.244531Z",
      "order_id": null
    }
  ]
}
```

Done: order 210b2859-da9c-4768-8f36-82995040cc54.

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
  "session_id": "26cdbb19-ad96-4e45-89a0-646783d475a6",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMjUsImlhdCI6MTc5MzIwMTQyNSwianRpIjoiMGQyZjVkNmYtM2MwMi00Yjk2LTkzNWMtZWQzMjEwNWY5ZjVlIiwic2lkIjoiMjZjZGJiMTktYWQ5Ni00ZTQ1LTg5YTAtNjQ2NzgzZDQ3NWE2In0.ErObCo898_aphsGDuBIujF69FaCrW4_PTCylRQgFVdQ",
  "access_expires_at": "2026-10-28T15:45:25.592074034Z",
  "refresh_token": "tTqOgiPchuyJQLWMe_Z25IJWyVxnG8ysVE9Nb1Bef6E",
  "refresh_expires_at": "2026-10-29T03:30:25.591677168Z",
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
  "command_id": "07505f2b-3bb6-4f12-b99b-9c0be9a48b79",
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
  "timestamp": "2026-10-28T15:30:26.000+0000",
  "channel": {
    "id": "1730052000.1105418673",
    "linkedid": "1730052000.1105418673",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670187962"
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
  "timestamp": "2026-10-28T15:30:26.000+0000",
  "channel": {
    "id": "1730052000.1105418673",
    "linkedid": "1730052000.1105418673",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670187962"
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
  "session_id": "d461af6f-3078-4eba-aa43-c58534732196",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMjYsImlhdCI6MTc5MzIwMTQyNiwianRpIjoiNmQ5MTE1ZjctMDc2Zi00NzU1LTkzZjctYTMyZWVlMjczN2I0Iiwic2lkIjoiZDQ2MWFmNmYtMzA3OC00ZWJhLWFhNDMtYzU4NTM0NzMyMTk2In0.1zHNg6uXblgv1gOD0kCoJbjk2bOGnYlYb4CuFEbFeGA",
  "access_expires_at": "2026-10-28T15:45:26.373596565Z",
  "refresh_token": "p-q--hGmX93x_3lVW32jytWiliO2fzKNTGHXtDB958c",
  "refresh_expires_at": "2026-10-29T03:30:26.373164571Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a24b50fd-c2aa-41a3-b973-2f2f2a6def44",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670187962",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T15:30:26Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a24b50fd-c2aa-41a3-b973-2f2f2a6def44/answer` → **200**

```json
{
  "command_id": "b682c716-e765-48aa-a9d5-c9c2b012ebe7"
}
```

```json
{
  "id": "a24b50fd-c2aa-41a3-b973-2f2f2a6def44",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670187962",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "order_ids": [],
  "started_at": "2026-10-28T15:30:26Z",
  "answered_at": "2026-10-28T15:30:26.756971Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1105418673",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "266777e9-83b8-4935-a5f8-38a5d82ee0bb",
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
  "id": "a9eb4629-49a5-4679-8bfc-d66b8a82c9a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:26.964376Z",
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
  "command_id": "82cb0826-16f8-4886-8841-e97a5b689a43",
  "quote_id": "a9eb4629-49a5-4679-8bfc-d66b8a82c9a8",
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
    "phone": "+380670187962"
  },
  "call_id": "a24b50fd-c2aa-41a3-b973-2f2f2a6def44"
}
```

```json
{
  "id": "6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a",
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
  "created_at": "2026-10-28T15:30:27.153999Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670187962"
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
    "id": "1730052000.1105418673",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a24b50fd-c2aa-41a3-b973-2f2f2a6def44",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670187962",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [
        "6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a"
      ],
      "started_at": "2026-10-28T15:30:26Z",
      "answered_at": "2026-10-28T15:30:26.756971Z",
      "ended_at": "2026-10-28T15:30:27.348185Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ffeed815-c1d1-42a4-8189-d398f655225c",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670147664",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [],
      "started_at": "2026-10-28T15:28:59.672038Z",
      "answered_at": "2026-10-28T15:28:59.878221Z",
      "ended_at": "2026-10-28T15:29:00.079021Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:29:03.745751Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a` → **200**

```json
{
  "id": "6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a",
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
  "created_at": "2026-10-28T15:30:27.153999Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670187962"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a` → **200**

```json
{
  "id": "6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a",
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
  "created_at": "2026-10-28T15:30:27.153999Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670187962"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a/cancel` → **200**

```json
{
  "command_id": "467dc157-248e-407e-bce8-2addd60c9ae5",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a",
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
  "created_at": "2026-10-28T15:30:27.153999Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670187962"
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

Done: call a24b50fd-c2aa-41a3-b973-2f2f2a6def44 with order 6b5a65f9-e8d3-41b3-b7ae-2f13cb5f104a.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29325"
}
```

```json
{
  "challenge_id": "ca652e4e-d01a-4b50-b6d7-5de34bbb5384",
  "expires_at": "2026-10-28T15:35:28.145626284Z",
  "resend_available_at": "2026-10-28T15:30:29.145626284Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "278696",
  "sent_at": "2026-10-28T15:30:28.147755883Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca652e4e-d01a-4b50-b6d7-5de34bbb5384",
  "code": "278696",
  "device_ref": "sandbox-29325"
}
```

```json
{
  "session_id": "274899b2-0dc4-4914-8bbb-56623dfa6005",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjMyOCwiaWF0IjoxNzkzMjAxNDI4LCJqdGkiOiIzOWFjOWRlYy02NDE0LTRiMGYtODAyYi00ZThhODM1ZmE0OWYiLCJzaWQiOiIyNzQ4OTliMi0wZGM0LTQ5MTQtOGJiYi01NjYyM2RmYTYwMDUifQ.mSAwquZ_f5-U5eszZL97wZn__f8djjKW7rP3Re7MnMU",
  "access_expires_at": "2026-10-28T15:45:28.349549002Z",
  "refresh_token": "vjpbx1w-Cfbd4HEu9VlaPPjB7Bx1K4v2BF0y6_cKaXs",
  "refresh_expires_at": "2026-11-27T15:30:28.349034875Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:19.244531Z",
  "last_location_at": "2026-10-28T15:30:19.244531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/handover` → **200**

```json
{
  "command_id": "740d08f9-6ef8-4abb-9f9b-8348ee313dda",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:19.244531Z",
  "last_location_at": "2026-10-28T15:30:19.244531Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:28Z",
    "sequence": 1793201428883
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:28.899923Z",
  "last_location_at": "2026-10-28T15:30:28.899923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664372821",
  "device_ref": "sandbox-4118"
}
```

```json
{
  "challenge_id": "961949a6-156a-42b3-b9fe-54353a2fabf0",
  "expires_at": "2026-10-28T15:35:29.073696545Z",
  "resend_available_at": "2026-10-28T15:30:30.073696545Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664372821` → **200**

```json
{
  "phone": "+380664372821",
  "audience": "CLIENT",
  "code": "259569",
  "sent_at": "2026-10-28T15:30:29.075420135Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "961949a6-156a-42b3-b9fe-54353a2fabf0",
  "code": "259569",
  "device_ref": "sandbox-4118"
}
```

```json
{
  "session_id": "fcaa807d-65d6-44e2-b10b-2366553b901b",
  "subject": {
    "type": "CLIENT",
    "id": "9c5b7e50-4910-4b46-b180-bec2a50d83e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YzViN2U1MC00OTEwLTRiNDYtYjE4MC1iZWMyYTUwZDgzZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzI5LCJpYXQiOjE3OTMyMDE0MjksImp0aSI6IjhlNTc0YmNlLTE3NjMtNDAxNy1iNDNlLTRiYWNjYzBkODNkNiIsInNpZCI6ImZjYWE4MDdkLTY1ZDYtNDRlMi1iMTBiLTIzNjY1NTNiOTAxYiJ9.SUpFXlVxbycsFGKxFQpM0vDKCA5AcarhFRJJISYkMAk",
  "access_expires_at": "2026-10-28T15:45:29.274217858Z",
  "refresh_token": "tWvbBY0EMxMQ3m1BeR6ZxmAwiOKndqwZAa0FsNjRX0E",
  "refresh_expires_at": "2026-11-27T15:30:29.273880531Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0faadcc0-a06f-45e0-9260-085c10f03c54",
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
  "id": "b3a90094-da8a-477b-a438-fc6ba1694c71",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:29.447032Z",
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
  "command_id": "18c32f73-dd99-46f7-af94-2e6cbdda744b",
  "quote_id": "b3a90094-da8a-477b-a438-fc6ba1694c71",
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
  "id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c5b7e50-4910-4b46-b180-bec2a50d83e2",
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
  "created_at": "2026-10-28T15:30:29.627954Z",
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
    "id": "2facd52f-e570-4206-9c31-187cf04a2254",
    "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
    "expires_at": "2026-10-28T15:30:44.629954Z",
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

`POST /api/driver/v1/offers/2facd52f-e570-4206-9c31-187cf04a2254/accept` → **200**

```json
{
  "command_id": "445d8460-6bd8-4ac1-ad58-b243c39fbfc5"
}
```

```json
{
  "id": "097f1fd7-5e02-4a69-896a-379bce6a31d9",
  "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9ed41cf7-67a1-4d86-b04c-5bf2caa276e9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ed41cf7-67a1-4d86-b04c-5bf2caa276e9",
  "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
  "assignment_id": "097f1fd7-5e02-4a69-896a-379bce6a31d9",
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

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:30Z",
    "sequence": 1793201430317
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:30.33398Z",
  "last_location_at": "2026-10-28T15:30:30.33398Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9ed41cf7-67a1-4d86-b04c-5bf2caa276e9/arrive` → **200**

```json
{
  "command_id": "38b40232-e751-4299-8892-796119809209",
  "expected_version": 0
}
```

```json
{
  "id": "9ed41cf7-67a1-4d86-b04c-5bf2caa276e9",
  "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
  "assignment_id": "097f1fd7-5e02-4a69-896a-379bce6a31d9",
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
  "arrived_at": "2026-10-28T15:30:30.515009Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9ed41cf7-67a1-4d86-b04c-5bf2caa276e9/start` → **200**

```json
{
  "command_id": "b91e5b37-e651-4881-a707-c43a4e7696c8",
  "expected_version": 1
}
```

```json
{
  "id": "9ed41cf7-67a1-4d86-b04c-5bf2caa276e9",
  "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
  "assignment_id": "097f1fd7-5e02-4a69-896a-379bce6a31d9",
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
  "arrived_at": "2026-10-28T15:30:30.515009Z",
  "started_at": "2026-10-28T15:30:30.70119Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:30Z",
    "sequence": 1793201430877
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:30.89283Z",
  "last_location_at": "2026-10-28T15:30:30.89283Z",
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
  "device_ref": "sandbox-25294"
}
```

```json
{
  "challenge_id": "66c02bc1-3000-4a91-9531-db92ff1bf73b",
  "expires_at": "2026-10-28T15:35:31.066664683Z",
  "resend_available_at": "2026-10-28T15:30:32.066664683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "294724",
  "sent_at": "2026-10-28T15:30:31.067995267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66c02bc1-3000-4a91-9531-db92ff1bf73b",
  "code": "294724",
  "device_ref": "sandbox-25294"
}
```

```json
{
  "session_id": "9f96f2f0-4836-4cdb-ab2f-f5208b0d7073",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjMzMSwiaWF0IjoxNzkzMjAxNDMxLCJqdGkiOiIwMTY4OTY1Ni1mMTg2LTQ3NjAtYTZmZC1iYzRkYmI1MTdhZTQiLCJzaWQiOiI5Zjk2ZjJmMC00ODM2LTRjZGItYWIyZi1mNTIwOGIwZDcwNzMifQ.DGbOb0RCycX44pZ6nPu8GIAcrAI5K2d2MysOAXkzx8k",
  "access_expires_at": "2026-10-28T15:45:31.264407671Z",
  "refresh_token": "cey5N9Jvc2r1s-UZrhq-EU79R_qvMdT9yYXi1Ts1CX0",
  "refresh_expires_at": "2026-11-27T15:30:31.264081881Z",
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
  "command_id": "8b7f6d95-147d-4bf3-8660-f1b245896278",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:31Z",
    "sequence": 1793201431608
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "21aebc70-8431-4e08-80b0-86f2ad852d6b",
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
  "last_heartbeat_at": "2026-10-28T15:30:31.622883Z",
  "last_location_at": "2026-10-28T15:30:31.622883Z",
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
  "session_id": "69e64133-11b3-4986-a01c-3954a78cfb13",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMzIsImlhdCI6MTc5MzIwMTQzMiwianRpIjoiZjUyOGRlOTItMzMzNC00M2YxLWEwNTAtNzU1OWZlM2E1MGQzIiwic2lkIjoiNjllNjQxMzMtMTFiMy00OTg2LWEwMWMtMzk1NGE3OGNmYjEzIn0.7DE8fzyEit0udsoD6u0u6N5s8umpRvN4FNuAGl1zEeM",
  "access_expires_at": "2026-10-28T15:45:32.024016654Z",
  "refresh_token": "GWxXUI1-K4ADlffOwB4WgBwqxIljYXt2mGqJKOnxJOc",
  "refresh_expires_at": "2026-10-29T03:30:32.023633413Z",
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
  "session_id": "019684a1-a471-4ef3-a022-7d2babcd2061",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMzIsImlhdCI6MTc5MzIwMTQzMiwianRpIjoiNDg5ZTMxM2QtNjZmYS00ZjA2LTgwZmQtMzNiNDA4MDk4ZWI3Iiwic2lkIjoiMDE5Njg0YTEtYTQ3MS00ZWYzLWEwMjItN2QyYmFiY2QyMDYxIn0.RL0IGhhEZCyq_sGGl4Jh37hp755uM6_Tyc6RM1orX8E",
  "access_expires_at": "2026-10-28T15:45:32.402815922Z",
  "refresh_token": "_BLQnlrc06mFi_Ex_5gf_zK-O_zfp9Yz6kPb2jFRkSY",
  "refresh_expires_at": "2026-10-29T03:30:32.402451234Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c9fd3222-5b4f-4d9e-a362-4f1ee2711856` → **200**

```json
{
  "id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
  "short_number": 12,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9c5b7e50-4910-4b46-b180-bec2a50d83e2",
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
    "id": "097f1fd7-5e02-4a69-896a-379bce6a31d9",
    "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9ed41cf7-67a1-4d86-b04c-5bf2caa276e9",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T15:30:29.627954Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c9fd3222-5b4f-4d9e-a362-4f1ee2711856/interrupt` → **200**

```json
{
  "command_id": "0de2ce9d-d2a4-4236-a06d-89b10e4a28ba",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
    "short_number": 12,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "9c5b7e50-4910-4b46-b180-bec2a50d83e2",
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
      "id": "097f1fd7-5e02-4a69-896a-379bce6a31d9",
      "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9ed41cf7-67a1-4d86-b04c-5bf2caa276e9",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T15:30:29.627954Z",
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
    "id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
    "short_number": 13,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "9c5b7e50-4910-4b46-b180-bec2a50d83e2",
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
    "id": "af9b7ec9-3a33-4df3-b55b-9d34ceb689d6",
    "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
    "expires_at": "2026-10-28T15:30:47.774729Z",
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

`POST /api/driver/v1/offers/af9b7ec9-3a33-4df3-b55b-9d34ceb689d6/accept` → **200**

```json
{
  "command_id": "85f706ba-e360-4139-8f69-97ce7c2fb870"
}
```

```json
{
  "id": "915555ab-b54d-43a5-a8c6-c8684a533940",
  "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "79560256-7535-495d-a4e0-6af620a30648",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "79560256-7535-495d-a4e0-6af620a30648",
  "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
  "assignment_id": "915555ab-b54d-43a5-a8c6-c8684a533940",
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
  "session_id": "21aebc70-8431-4e08-80b0-86f2ad852d6b",
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
  "last_heartbeat_at": "2026-10-28T15:30:31.622883Z",
  "last_location_at": "2026-10-28T15:30:31.622883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/21aebc70-8431-4e08-80b0-86f2ad852d6b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:33Z",
    "sequence": 1793201433673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "21aebc70-8431-4e08-80b0-86f2ad852d6b",
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
  "last_heartbeat_at": "2026-10-28T15:30:33.689327Z",
  "last_location_at": "2026-10-28T15:30:33.689327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/79560256-7535-495d-a4e0-6af620a30648/arrive` → **200**

```json
{
  "command_id": "9d9be42e-60f1-48ae-a16e-9ca7d9e42bd7",
  "expected_version": 0
}
```

```json
{
  "id": "79560256-7535-495d-a4e0-6af620a30648",
  "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
  "assignment_id": "915555ab-b54d-43a5-a8c6-c8684a533940",
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
  "arrived_at": "2026-10-28T15:30:33.875696Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/79560256-7535-495d-a4e0-6af620a30648/start` → **200**

```json
{
  "command_id": "53c2f679-253f-4b88-86a7-412a937c58f2",
  "expected_version": 1
}
```

```json
{
  "id": "79560256-7535-495d-a4e0-6af620a30648",
  "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
  "assignment_id": "915555ab-b54d-43a5-a8c6-c8684a533940",
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
  "arrived_at": "2026-10-28T15:30:33.875696Z",
  "started_at": "2026-10-28T15:30:34.067648Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/79560256-7535-495d-a4e0-6af620a30648/complete` → **200**

```json
{
  "command_id": "05d298ff-91cb-4229-afbc-c989cac4a103",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:30:34Z"
}
```

```json
{
  "id": "79560256-7535-495d-a4e0-6af620a30648",
  "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
  "assignment_id": "915555ab-b54d-43a5-a8c6-c8684a533940",
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
  "arrived_at": "2026-10-28T15:30:33.875696Z",
  "started_at": "2026-10-28T15:30:34.067648Z",
  "completed_at": "2026-10-28T15:30:34.265849Z",
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
    "id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-28T15:30:32.768311Z",
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
    "id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
    "short_number": 12,
    "status": "CANCELLED",
    "created_at": "2026-10-28T15:30:29.627954Z",
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

`GET /api/operator/v1/orders/c9fd3222-5b4f-4d9e-a362-4f1ee2711856/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T15:30:29.628305Z",
      "actor": {
        "type": "CLIENT",
        "id": "9c5b7e50-4910-4b46-b180-bec2a50d83e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
        "quote_id": "b3a90094-da8a-477b-a438-fc6ba1694c71",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "0483cc9b-7176-4841-a1b5-0829bff0ceac"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T15:30:29.629513Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
        "attempt_id": "9cf0497c-25ad-4038-8f2c-8b6c711ba0e7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0483cc9b-7176-4841-a1b5-0829bff0ceac"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T15:30:29.631192Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2facd52f-e570-4206-9c31-187cf04a2254",
        "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "0483cc9b-7176-4841-a1b5-0829bff0ceac"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T15:30:29.985013Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2facd52f-e570-4206-9c31-187cf04a2254",
        "order_id": "c9fd3222-5b4f-4d9e-a362-4f1ee2711856",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "097f1fd7-5e02-4a69-896a-379bce6a31d9"
      },
      "correlation_id": "f450bcd9-d65e-4613-b895-a5629788e9d2"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/4ea03aa4-2808-4f79-ab54-f9743b8e2130/tip` → **200**

```json
{
  "order_id": "4ea03aa4-2808-4f79-ab54-f9743b8e2130",
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
  "available_until": "2026-10-29T15:30:34.265849Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/4ea03aa4-2808-4f79-ab54-f9743b8e2130/tip` → **409**

```json
{
  "command_id": "916dbe6b-34fb-4b2f-b355-8af4ff2e68f2",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/4ea03aa4-2808-4f79-ab54-f9743b8e2130/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6590732e-9727-4bd9-ba0e-85c8765f5d12"
}
```

Done: interrupted c9fd3222-5b4f-4d9e-a362-4f1ee2711856, follow-up 4ea03aa4-2808-4f79-ab54-f9743b8e2130.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef",
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
  "last_heartbeat_at": "2026-10-28T15:30:30.89283Z",
  "last_location_at": "2026-10-28T15:30:30.89283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6e2ad20b-23af-470b-ba3d-b2b8bca2c9ef/close` → **200**

```json
{
  "command_id": "1fae845b-96e5-49f1-94b0-b99b46a98223",
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
  "session_id": "21aebc70-8431-4e08-80b0-86f2ad852d6b",
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
  "last_heartbeat_at": "2026-10-28T15:30:33.689327Z",
  "last_location_at": "2026-10-28T15:30:33.689327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/21aebc70-8431-4e08-80b0-86f2ad852d6b/close` → **200**

```json
{
  "command_id": "eb75a8ed-1566-4f82-b9de-da1a78696cbf",
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
  "session_id": "77f4e0a7-c551-4a19-8f6a-fe68e44d26cc",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzMzksImlhdCI6MTc5MzIwMTQzOSwianRpIjoiYzE4MmYzNTAtODlhNi00ZjA5LWI4YWYtMjUzZGU2MDRjNDk4Iiwic2lkIjoiNzdmNGUwYTctYzU1MS00YTE5LThmNmEtZmU2OGU0NGQyNmNjIn0.HTWPaxocJLKwJ_uD07O5Lla8mOkWk4GA8avZLkNHNoU",
  "access_expires_at": "2026-10-28T15:45:39.294067264Z",
  "refresh_token": "qXFsHlMprTHvvkGTsfd6yaG4oVBImCI8-amGctrIxdk",
  "refresh_expires_at": "2026-10-29T03:30:39.293689026Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "16f0ed55-9ace-40d7-8ddf-c4f878c2d03b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:30:39Z"
}
```

```json
{
  "id": "e53e0386-2155-4b54-ba27-8b18f641f92c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:30:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e53e0386-2155-4b54-ba27-8b18f641f92c/publish` → **200**

```json
{
  "command_id": "51483d8f-74cf-4ec6-9f08-b75524cab8ef",
  "expected_version": 0
}
```

```json
{
  "id": "e53e0386-2155-4b54-ba27-8b18f641f92c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:30:39.674513Z",
  "published_at": "2026-10-28T15:30:39.674513Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "e53e0386-2155-4b54-ba27-8b18f641f92c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T15:30:39.674513Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630753072",
  "device_ref": "sandbox-31103"
}
```

```json
{
  "challenge_id": "6af0852c-50bb-410c-9ea6-f09120125c59",
  "expires_at": "2026-10-28T15:35:40.025594414Z",
  "resend_available_at": "2026-10-28T15:30:41.025594414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630753072` → **200**

```json
{
  "phone": "+380630753072",
  "audience": "CLIENT",
  "code": "244406",
  "sent_at": "2026-10-28T15:30:40.027377995Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6af0852c-50bb-410c-9ea6-f09120125c59",
  "code": "244406",
  "device_ref": "sandbox-31103"
}
```

```json
{
  "session_id": "efe53b64-ab7d-4938-b0a3-9f4ab6fa85d9",
  "subject": {
    "type": "CLIENT",
    "id": "453ca450-9cb7-42f9-83ca-d6515897e9e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTNjYTQ1MC05Y2I3LTQyZjktODNjYS1kNjUxNTg5N2U5ZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzQwLCJpYXQiOjE3OTMyMDE0NDAsImp0aSI6IjdlZmU0MjUyLWI2YTYtNDQ0NC05MzZkLWQyYmRhYzUyYmMwZSIsInNpZCI6ImVmZTUzYjY0LWFiN2QtNDkzOC1iMGEzLTlmNGFiNmZhODVkOSJ9.Jq9KnK4bAJm6hPL8VSBLa-pQNTVjhsuAuoCkyPr9U74",
  "access_expires_at": "2026-10-28T15:45:40.219904346Z",
  "refresh_token": "iCyLintzapemkJA1DNqlFnzKEe84R7sha32GI2dfDrQ",
  "refresh_expires_at": "2026-11-27T15:30:40.219597045Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "e53e0386-2155-4b54-ba27-8b18f641f92c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T15:30:39.674513Z",
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
  "command_id": "7c6c6b98-61fe-4c2a-b017-f08f7d152e31",
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
  "id": "0e8a3721-f4ec-407c-8783-c51e1e0a84e0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:40.581284Z",
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
  "command_id": "11e12065-ec31-458b-b9d2-33d115a1de50",
  "quote_id": "0e8a3721-f4ec-407c-8783-c51e1e0a84e0",
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
  "correlation_id": "a7a51a8e-0b15-4e5f-ac73-b9412b05e18b"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "dcbc9b02-97df-41e6-b948-b19ff7bd1d43",
  "version_id": "e53e0386-2155-4b54-ba27-8b18f641f92c",
  "language": "uk"
}
```

```json
{
  "version_id": "e53e0386-2155-4b54-ba27-8b18f641f92c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T15:30:40.973553Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d8ad77ac-36fe-49dd-a49a-030d33deeb56",
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
  "id": "1f45c4f5-5e31-40da-b99d-26c75143c530",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:41.166020Z",
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
  "command_id": "0c349cab-93f6-4636-831e-5fc54c26e8a9",
  "quote_id": "1f45c4f5-5e31-40da-b99d-26c75143c530",
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
  "id": "2cd29597-eccf-47c1-8be0-bacad8019e65",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "453ca450-9cb7-42f9-83ca-d6515897e9e0",
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
  "created_at": "2026-10-28T15:30:41.352184Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2cd29597-eccf-47c1-8be0-bacad8019e65` → **200**

```json
{
  "id": "2cd29597-eccf-47c1-8be0-bacad8019e65",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "453ca450-9cb7-42f9-83ca-d6515897e9e0",
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
  "created_at": "2026-10-28T15:30:41.352184Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2cd29597-eccf-47c1-8be0-bacad8019e65/cancel` → **200**

```json
{
  "command_id": "7feab0fb-047f-4938-ac8e-d2ef3075bd45",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2cd29597-eccf-47c1-8be0-bacad8019e65",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "453ca450-9cb7-42f9-83ca-d6515897e9e0",
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
  "created_at": "2026-10-28T15:30:41.352184Z",
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

`POST /api/admin/v1/legal-documents/e53e0386-2155-4b54-ba27-8b18f641f92c` → **409**

```json
{
  "command_id": "26988b2e-4beb-4262-8b39-04bb050828f9",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T15:30:41Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/e53e0386-2155-4b54-ba27-8b18f641f92c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b2f9c973-7fa4-4a87-912b-ea11528325b8"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6a4a39a9-95e8-4999-bebf-35e768101d1c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:30:42Z"
}
```

```json
{
  "id": "73fd38b8-0905-4b8e-9137-bc3bc15a8739",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:30:42Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/73fd38b8-0905-4b8e-9137-bc3bc15a8739/publish` → **200**

```json
{
  "command_id": "242ab2f0-ce04-4afd-8466-d83535f317e0",
  "expected_version": 0
}
```

```json
{
  "id": "73fd38b8-0905-4b8e-9137-bc3bc15a8739",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T15:30:42.300351Z",
  "published_at": "2026-10-28T15:30:42.300351Z",
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
  "device_ref": "sandbox-4384"
}
```

```json
{
  "challenge_id": "43a3a92b-47c1-42b8-82eb-8fc71c4bc80d",
  "expires_at": "2026-10-28T15:35:42.481741181Z",
  "resend_available_at": "2026-10-28T15:30:43.481741181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "442167",
  "sent_at": "2026-10-28T15:30:42.483511023Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43a3a92b-47c1-42b8-82eb-8fc71c4bc80d",
  "code": "442167",
  "device_ref": "sandbox-4384"
}
```

```json
{
  "session_id": "47d80a03-10b2-4897-828b-d425056f543a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM0MiwiaWF0IjoxNzkzMjAxNDQyLCJqdGkiOiI5NDUyZGFlYi1mMjBiLTQzM2EtYmY1NS1hMTljM2Y0Mzg3MzQiLCJzaWQiOiI0N2Q4MGEwMy0xMGIyLTQ4OTctODI4Yi1kNDI1MDU2ZjU0M2EifQ._lnTX9abBJSeCX7KaracsRwGnqcg7Ts0f6oNimZPQL8",
  "access_expires_at": "2026-10-28T15:45:42.677266774Z",
  "refresh_token": "8PTYg3y9jPflfy9KEtkeoolL1qXAWBUQmEMcoJyYdZk",
  "refresh_expires_at": "2026-11-27T15:30:42.676761005Z",
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
  "command_id": "966c4ba1-cda3-4bc0-a521-c1f28002daae",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:43Z",
    "sequence": 1793201443222
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "d6c4b72f-3e60-441e-8659-1b65d01f9dae",
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
  "last_heartbeat_at": "2026-10-28T15:30:43.037276Z",
  "last_location_at": "2026-10-28T15:30:43.037276Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677594568",
  "device_ref": "sandbox-9095"
}
```

```json
{
  "challenge_id": "8f2862e4-f7f8-4b1a-9a61-67cedd6e65d1",
  "expires_at": "2026-10-28T15:35:43.221572432Z",
  "resend_available_at": "2026-10-28T15:30:44.221572432Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677594568` → **200**

```json
{
  "phone": "+380677594568",
  "audience": "CLIENT",
  "code": "642968",
  "sent_at": "2026-10-28T15:30:43.223422098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f2862e4-f7f8-4b1a-9a61-67cedd6e65d1",
  "code": "642968",
  "device_ref": "sandbox-9095"
}
```

```json
{
  "session_id": "f4e1460d-c070-48b1-ad3e-282e5bff8be1",
  "subject": {
    "type": "CLIENT",
    "id": "61f3348a-6f97-4aa3-973b-184ad6421fc9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MWYzMzQ4YS02Zjk3LTRhYTMtOTczYi0xODRhZDY0MjFmYzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzQzLCJpYXQiOjE3OTMyMDE0NDMsImp0aSI6Ijg0ZTI0YTlhLTU3YmItNDAwOS1iNGE4LTRhYTI3OTU0ZjI5ZSIsInNpZCI6ImY0ZTE0NjBkLWMwNzAtNDhiMS1hZDNlLTI4MmU1YmZmOGJlMSJ9.4-IJ8-euYpljwm2Nmx3srVy-kdGw7u97QzS_sHUOGZw",
  "access_expires_at": "2026-10-28T15:45:43.416910086Z",
  "refresh_token": "__WJ6BdwwyknCAnc8szeSlxcdrualKTD0JBc2Qyf8zo",
  "refresh_expires_at": "2026-11-27T15:30:43.416505964Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "37536c29-db19-48a0-9115-0bc8d3367989",
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
  "id": "5b334c4c-e181-4ba9-8f85-1c99952e1c88",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:43.599239Z",
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
  "command_id": "ae77757c-0858-4fab-a9ff-0b100b63800b",
  "quote_id": "5b334c4c-e181-4ba9-8f85-1c99952e1c88",
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
    "phone": "+380672504093"
  }
}
```

```json
{
  "id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:43.788827Z",
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
    "id": "2995cb7f-5abb-4684-aa88-befb8990ad49",
    "order_id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
    "expires_at": "2026-10-28T15:30:58.791013Z",
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

`POST /api/driver/v1/offers/2995cb7f-5abb-4684-aa88-befb8990ad49/accept` → **200**

```json
{
  "command_id": "2dfa1634-9fa0-4f7d-8f8e-c7cc116f0560"
}
```

```json
{
  "id": "53c547f8-257f-478d-987f-46417e725e0f",
  "order_id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e66af890-5a00-431c-b017-a2de1fe55ee2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e66af890-5a00-431c-b017-a2de1fe55ee2",
  "order_id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
  "assignment_id": "53c547f8-257f-478d-987f-46417e725e0f",
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
    "phone": "+380672504093"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4e61ffab-9084-4c0c-944b-0641cc227ade",
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
  "id": "4e9c7366-aa4e-4fbd-930a-cd219b35e9e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:44.560304Z",
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
  "command_id": "d52f7df5-6bef-4674-ab17-9e6524e86849",
  "quote_id": "4e9c7366-aa4e-4fbd-930a-cd219b35e9e5",
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
  "id": "4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:44.74826Z",
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
  "command_id": "067a8f67-7aff-43c5-bdba-f6999d041d99",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T18:30:44Z"
}
```

```json
{
  "id": "a1ed8f37-63cc-43f5-b226-e8ed8ff4ab43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:44.947957Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:30:44Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0c27f14b-58aa-4f78-a6cd-d5a9e2329c36",
  "quote_id": "a1ed8f37-63cc-43f5-b226-e8ed8ff4ab43",
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
  "pickup_at": "2026-10-28T18:30:44Z"
}
```

```json
{
  "id": "c81daa95-2ab1-4aa2-8740-7ba83d00fc86",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:30:45.132481Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:30:44Z",
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
  "command_id": "1c769325-4db3-4fbd-a15d-49aedb63500d",
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
  "id": "dedf5544-20bd-480c-916b-1a0bdb6c8e20",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:45.323415Z",
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
  "command_id": "30873005-2d76-4254-b435-3720ff24f357",
  "quote_id": "dedf5544-20bd-480c-916b-1a0bdb6c8e20",
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
  "correlation_id": "69b7f6d8-672f-4db0-8f9d-29a5c1c8a08a"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "c81daa95-2ab1-4aa2-8740-7ba83d00fc86",
      "short_number": 17,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-28T15:30:45.132481Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T18:30:44Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5",
      "short_number": 16,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-28T15:30:44.74826Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
      "short_number": 15,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:44.74826Z",
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

`GET /api/rider/v1/orders/5ca97a2c-814f-42db-ba35-ed1d87ffd307` → **200**

```json
{
  "id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
  "short_number": 15,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "53c547f8-257f-478d-987f-46417e725e0f",
    "order_id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "e66af890-5a00-431c-b017-a2de1fe55ee2",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T15:30:43.788827Z",
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
    "location_at": "2026-10-28T15:30:43.037276Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/5ca97a2c-814f-42db-ba35-ed1d87ffd307/cancel` → **200**

```json
{
  "command_id": "3c8ee683-b79c-461d-af55-cf5934b8985b",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "53c547f8-257f-478d-987f-46417e725e0f",
    "order_id": "5ca97a2c-814f-42db-ba35-ed1d87ffd307",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e66af890-5a00-431c-b017-a2de1fe55ee2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T15:30:43.788827Z",
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

`GET /api/rider/v1/orders/4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5` → **200**

```json
{
  "id": "4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5",
  "short_number": 16,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:44.74826Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5/cancel` → **200**

```json
{
  "command_id": "10f107a1-407b-4290-91d2-3ccbd865eeb7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:30:44.74826Z",
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

`GET /api/rider/v1/orders/c81daa95-2ab1-4aa2-8740-7ba83d00fc86` → **200**

```json
{
  "id": "c81daa95-2ab1-4aa2-8740-7ba83d00fc86",
  "short_number": 17,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:30:45.132481Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:30:44Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c81daa95-2ab1-4aa2-8740-7ba83d00fc86/cancel` → **200**

```json
{
  "command_id": "a478728e-05f7-4216-a4e8-f9c2c7469c92",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c81daa95-2ab1-4aa2-8740-7ba83d00fc86",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "61f3348a-6f97-4aa3-973b-184ad6421fc9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-28T15:30:45.132481Z",
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
  "pickup_at": "2026-10-28T18:30:44Z",
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
  "session_id": "d6c4b72f-3e60-441e-8659-1b65d01f9dae",
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
  "last_heartbeat_at": "2026-10-28T15:30:43.037276Z",
  "last_location_at": "2026-10-28T15:30:43.037276Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6c4b72f-3e60-441e-8659-1b65d01f9dae/close` → **200**

```json
{
  "command_id": "2f85a6b6-4648-43ce-aae0-ec480b61059c",
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

Done: orders 5ca97a2c-814f-42db-ba35-ed1d87ffd307, 4b5958d8-19ae-4e9a-b1cf-aa39bb3f7cf5, c81daa95-2ab1-4aa2-8740-7ba83d00fc86.

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
  "session_id": "794ba877-28c9-440b-a073-a1e19b848295",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNDcsImlhdCI6MTc5MzIwMTQ0NywianRpIjoiMTc3ZTEzYjUtZDU5Ni00OTQ4LWI0MGEtNTU4M2ExMjNlZDkxIiwic2lkIjoiNzk0YmE4NzctMjhjOS00NDBiLWEwNzMtYTFlMTliODQ4Mjk1In0.t8ypTkyXcSf84osyK6YKGDub0TQRfJ158b0Wc0MPT7k",
  "access_expires_at": "2026-10-28T15:45:47.840506526Z",
  "refresh_token": "2izaLddObZOSGlEofUHWzh41OMqOsDgBbWcOr7QR2fo",
  "refresh_expires_at": "2026-10-29T03:30:47.840134507Z",
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
  "session_id": "c7b1dd45-dba1-4053-9fd8-fb68a34c69bd",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNDgsImlhdCI6MTc5MzIwMTQ0OCwianRpIjoiNDYyNWFjNjEtZGFlMS00ZmU0LWE4NmMtMjNmMjk0MGFkOWRkIiwic2lkIjoiYzdiMWRkNDUtZGJhMS00MDUzLTlmZDgtZmI2OGEzNGM2OWJkIn0.VnoAhE4CkD9GwR30dZE0ngadl6duqoLhPrcTs9o9atM",
  "access_expires_at": "2026-10-28T15:45:48.212956256Z",
  "refresh_token": "vs-7pjwHi8mwY319I8KUv-GCZRFNPCfi9fpldzqrAZQ",
  "refresh_expires_at": "2026-10-29T03:30:48.212601422Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26025"
}
```

```json
{
  "challenge_id": "5a2c3238-94eb-4b34-9448-955a46bddde8",
  "expires_at": "2026-10-28T15:35:48.379737948Z",
  "resend_available_at": "2026-10-28T15:30:49.379737948Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "487300",
  "sent_at": "2026-10-28T15:30:48.381394231Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a2c3238-94eb-4b34-9448-955a46bddde8",
  "code": "487300",
  "device_ref": "sandbox-26025"
}
```

```json
{
  "session_id": "febd0791-efc4-4316-a6e7-6bc7fe6b0928",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM0OCwiaWF0IjoxNzkzMjAxNDQ4LCJqdGkiOiJkYzNjMzg5NS0yODEzLTQyYTItYTY3Ny1hZDI1ZTc2NzBkNjgiLCJzaWQiOiJmZWJkMDc5MS1lZmM0LTQzMTYtYTZlNy02YmM3ZmU2YjA5MjgifQ.pCNVjetLD3wgqsx1LzKQRPGsZcEqnwQ8dYWQr5V7X7Y",
  "access_expires_at": "2026-10-28T15:45:48.574000161Z",
  "refresh_token": "EM_YIySYTkeg2VOoUr8Sb4SfIfroM-XjKhK803OgR2k",
  "refresh_expires_at": "2026-11-27T15:30:48.573673721Z",
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
  "command_id": "17e98824-09d5-47e8-ae4e-8767f517c27e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:48Z",
    "sequence": 1793201448912
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9443dac6-15be-4f86-b21d-4f0fa00baab1",
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
  "last_heartbeat_at": "2026-10-28T15:30:48.927375Z",
  "last_location_at": "2026-10-28T15:30:48.927375Z",
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
  "command_id": "4b95149b-fdac-4649-b508-bd92c7f89e78",
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
  "effective_at": "2026-10-28T15:30:49.289327Z",
  "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T15:29:11.167143Z",
  "last_entries": [
    {
      "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:29:11.167143Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b8c260f1-640c-4100-96a0-3d94e1e1993d",
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
  "id": "231a892e-564f-4ba8-9da1-30210db14d99",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:49.647607Z",
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
  "command_id": "798d1914-1577-40c1-9424-2d743adce971",
  "quote_id": "231a892e-564f-4ba8-9da1-30210db14d99",
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
    "phone": "+380671112886"
  }
}
```

```json
{
  "id": "e5390915-112e-43b5-b029-7c1b00718a86",
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
  "created_at": "2026-10-28T15:30:49.836128Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112886"
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
    "id": "8f8b6368-b4b3-400c-a55f-c95925988f02",
    "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
    "expires_at": "2026-10-28T15:31:04.838789Z",
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

`POST /api/driver/v1/offers/8f8b6368-b4b3-400c-a55f-c95925988f02/accept` → **200**

```json
{
  "command_id": "c685814f-ff5c-416c-9d05-1649cac92cf3"
}
```

```json
{
  "id": "306dc493-4f10-459f-bb7d-43bc39ea4194",
  "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "394da312-50f9-416a-942c-d287e898152c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "394da312-50f9-416a-942c-d287e898152c",
  "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
  "assignment_id": "306dc493-4f10-459f-bb7d-43bc39ea4194",
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
    "phone": "+380671112886"
  }
}
```

`POST /api/driver/v1/work-sessions/9443dac6-15be-4f86-b21d-4f0fa00baab1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:30:50Z",
    "sequence": 1793201450547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9443dac6-15be-4f86-b21d-4f0fa00baab1",
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
  "last_heartbeat_at": "2026-10-28T15:30:50.56319Z",
  "last_location_at": "2026-10-28T15:30:50.56319Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/394da312-50f9-416a-942c-d287e898152c/arrive` → **200**

```json
{
  "command_id": "97bc3d28-4716-4d1e-a9f9-866cadecf5c7",
  "expected_version": 0
}
```

```json
{
  "id": "394da312-50f9-416a-942c-d287e898152c",
  "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
  "assignment_id": "306dc493-4f10-459f-bb7d-43bc39ea4194",
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
  "arrived_at": "2026-10-28T15:30:50.743015Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112886"
  }
}
```

`POST /api/driver/v1/trips/394da312-50f9-416a-942c-d287e898152c/start` → **200**

```json
{
  "command_id": "5ccfc2e4-f817-45c7-9979-b1deb6e8caaa",
  "expected_version": 1
}
```

```json
{
  "id": "394da312-50f9-416a-942c-d287e898152c",
  "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
  "assignment_id": "306dc493-4f10-459f-bb7d-43bc39ea4194",
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
  "arrived_at": "2026-10-28T15:30:50.743015Z",
  "started_at": "2026-10-28T15:30:50.929777Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671112886"
  }
}
```

`POST /api/driver/v1/trips/394da312-50f9-416a-942c-d287e898152c/complete` → **200**

```json
{
  "command_id": "0ac75a00-f796-4ab7-bda9-d4114c77c86f",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:30:51Z",
  "cash_received": true
}
```

```json
{
  "id": "394da312-50f9-416a-942c-d287e898152c",
  "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
  "assignment_id": "306dc493-4f10-459f-bb7d-43bc39ea4194",
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
  "arrived_at": "2026-10-28T15:30:50.743015Z",
  "started_at": "2026-10-28T15:30:50.929777Z",
  "completed_at": "2026-10-28T15:30:51.11079Z",
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
  "command_id": "67d75771-ff91-41aa-bf0b-4efc351c485a",
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
  "id": "d5b2fd5f-1fb8-49d6-b552-fb6e00d2fa78",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:51.294676Z",
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
  "command_id": "5db8f0c5-b812-4e21-b39e-914f3aa52a01",
  "quote_id": "d5b2fd5f-1fb8-49d6-b552-fb6e00d2fa78",
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
    "phone": "+3806711117976"
  }
}
```

```json
{
  "id": "ad54760f-d936-4047-a00d-311e6b2053ac",
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
  "created_at": "2026-10-28T15:30:51.483068Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117976"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ad54760f-d936-4047-a00d-311e6b2053ac` → **200**

```json
{
  "id": "ad54760f-d936-4047-a00d-311e6b2053ac",
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
  "created_at": "2026-10-28T15:30:51.483068Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117976"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ad54760f-d936-4047-a00d-311e6b2053ac/cancel` → **200**

```json
{
  "command_id": "a9f33459-17f0-46a3-9180-4d55798d4d92",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ad54760f-d936-4047-a00d-311e6b2053ac",
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
  "created_at": "2026-10-28T15:30:51.483068Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711117976"
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
  "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T15:29:11.167143Z",
  "last_entries": [
    {
      "order_id": "ad54760f-d936-4047-a00d-311e6b2053ac",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T15:30:51.869138Z"
    },
    {
      "order_id": "e5390915-112e-43b5-b029-7c1b00718a86",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T15:30:51.113724Z"
    },
    {
      "order_id": "6ce96302-9e61-4441-825d-7e45e3b70ab3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T15:29:11.167143Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9443dac6-15be-4f86-b21d-4f0fa00baab1",
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
  "last_heartbeat_at": "2026-10-28T15:30:50.56319Z",
  "last_location_at": "2026-10-28T15:30:50.56319Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9443dac6-15be-4f86-b21d-4f0fa00baab1/close` → **200**

```json
{
  "command_id": "a1a5ac30-4a88-4591-94b4-2c17f841e665",
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

Done: operator bonus for fulfilled e5390915-112e-43b5-b029-7c1b00718a86 and operator-fault cancellation ad54760f-d936-4047-a00d-311e6b2053ac.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678197561",
  "device_ref": "sandbox-5259"
}
```

```json
{
  "challenge_id": "31ef6559-0e0c-4081-bc89-3206d5cf7ab7",
  "expires_at": "2026-10-28T15:35:54.635610791Z",
  "resend_available_at": "2026-10-28T15:30:55.635610791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678197561` → **200**

```json
{
  "phone": "+380678197561",
  "audience": "CLIENT",
  "code": "426635",
  "sent_at": "2026-10-28T15:30:54.637221404Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672381743",
  "device_ref": "sandbox-26138",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "90006c58-f632-4c5c-bade-fc096817ca04",
  "expires_at": "2026-10-28T15:35:54.834224546Z",
  "resend_available_at": "2026-10-28T15:30:55.834224546Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672381743` → **200**

```json
{
  "phone": "+380672381743",
  "audience": "CLIENT",
  "code": "125800",
  "sent_at": "2026-10-28T15:30:54.835996487Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672040000",
  "device_ref": "sandbox-19777"
}
```

```json
{
  "challenge_id": "b1405683-1c88-47ae-9d0e-874da87af340",
  "expires_at": "2026-10-28T15:35:55.047136515Z",
  "resend_available_at": "2026-10-28T15:30:56.047136515Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672040000` → **200**

```json
{
  "phone": "+380672040000",
  "audience": "CLIENT",
  "code": "927935",
  "sent_at": "2026-10-28T15:30:55.049891397Z",
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
  "session_id": "b4b12d28-3926-45c6-88ff-3bf4c3867f74",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNTUsImlhdCI6MTc5MzIwMTQ1NSwianRpIjoiNzRjMzk4MjktMTczOC00ODdjLTg4NWMtMDAwY2U3Njk4Y2ViIiwic2lkIjoiYjRiMTJkMjgtMzkyNi00NWM2LTg4ZmYtM2JmNGMzODY3Zjc0In0.w2lzv9CT6tNvp-QTQs0_HgqKnBH1C2ZrdMruHXS6SjU",
  "access_expires_at": "2026-10-28T15:45:55.459135504Z",
  "refresh_token": "J1iYuSgicwdqC6mt9bQPQG8YjlZHfYCVdRnlawZVWQY",
  "refresh_expires_at": "2026-10-29T03:30:55.458755774Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672040000` → **200**

```json
{
  "deliveries": [
    {
      "id": "1728b2b0-6b47-4d19-8c00-602a4e7a663e",
      "challenge_id": "b1405683-1c88-47ae-9d0e-874da87af340",
      "phone": "+380672040000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-580909c9-7f82-4b48-b94a-64cc489ac301",
      "error": null,
      "attempted_at": "2026-10-28T15:30:55.05014Z"
    },
    {
      "id": "0517b8a9-39d5-460b-aeb5-ddd4419dcf42",
      "challenge_id": "b1405683-1c88-47ae-9d0e-874da87af340",
      "phone": "+380672040000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T15:30:55.049061Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672040000` → **200**

```json
{
  "phone": "+380672040000",
  "audience": "CLIENT",
  "code": "927935",
  "sent_at": "2026-10-28T15:30:55.049891397Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672381743` → **200**

```json
{
  "deliveries": [
    {
      "id": "6942a76c-755a-4b53-b7f7-55b0de68902c",
      "challenge_id": "90006c58-f632-4c5c-bade-fc096817ca04",
      "phone": "+380672381743",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-630c6c59-d3bb-4513-b82c-83465e921a5b",
      "error": null,
      "attempted_at": "2026-10-28T15:30:54.836251Z"
    }
  ]
}
```

Done: SMS to +380678197561, a call to +380672381743, SMS then a call to +380672040000.

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
  "session_id": "fbd1e05d-9a62-442e-a35f-2995dcdb87db",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNTYsImlhdCI6MTc5MzIwMTQ1NiwianRpIjoiNmU5NTg1ZWUtZTRjOC00M2JhLThiZGYtYTUyODMyYjI2NDFkIiwic2lkIjoiZmJkMWUwNWQtOWE2Mi00NDJlLWEzNWYtMjk5NWRjZGI4N2RiIn0.UvbtMnSdXYAXYIQeGK9cejGGurOqJzGIQgiA1ClzKkE",
  "access_expires_at": "2026-10-28T15:45:56.230827823Z",
  "refresh_token": "MZYKACMk2IGXOqTK03KbdKOR3n-LKyfugq0WU5_N3DE",
  "refresh_expires_at": "2026-10-29T03:30:56.230498198Z",
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
  "session_id": "03fb901b-ced9-4bbf-a74c-2cb56aae78be",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNTYsImlhdCI6MTc5MzIwMTQ1NiwianRpIjoiYjcwM2Y0ODYtYjVhZS00YmExLWE3MzctNGQ5MmM3YjJmZDJiIiwic2lkIjoiMDNmYjkwMWItY2VkOS00YmJmLWE3NGMtMmNiNTZhYWU3OGJlIn0.ywoEpcoabg10yYh-Wtdh5IiVTbX-Wg8z57ct97d0fuA",
  "access_expires_at": "2026-10-28T15:45:56.61536914Z",
  "refresh_token": "ZYps2btviZCBjYGOC4yMRsL_nuD2ML5aUsSa_NQYKoQ",
  "refresh_expires_at": "2026-10-29T03:30:56.615027718Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
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

`POST /api/admin/v1/staff-extensions/8b87eb7b-a763-40a5-9437-8d35e5092d3a` → **200**

```json
{
  "command_id": "cb754107-569d-4352-ab82-6a0f2af2690b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "46ef29b4-15eb-4632-b3ee-2f645e2e7ef5",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:30:57.352456Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T15:30:57.352456Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "5fd9da4b-9060-4f9b-9191-9df883b30cf0",
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
  "id": "f67787d3-323e-4a3d-809d-bbae6ec452f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:35:57.718577Z",
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
  "command_id": "5f308437-2103-44d0-8ce4-effb77ecadd6",
  "quote_id": "f67787d3-323e-4a3d-809d-bbae6ec452f4",
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
    "phone": "+380674313614"
  }
}
```

```json
{
  "id": "548d77b9-3cd3-46a8-8cd0-9c8ff9513716",
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
  "created_at": "2026-10-28T15:30:57.909693Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674313614"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/548d77b9-3cd3-46a8-8cd0-9c8ff9513716/calls` → **201**

```json
{
  "command_id": "c5122cfd-6d09-4f07-8425-607667cdc5ac",
  "to": "CALLER"
}
```

```json
{
  "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "order_ids": [
    "548d77b9-3cd3-46a8-8cd0-9c8ff9513716"
  ],
  "started_at": "2026-10-28T15:30:58.134844Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/548d77b9-3cd3-46a8-8cd0-9c8ff9513716/calls` → **201**

```json
{
  "command_id": "c5122cfd-6d09-4f07-8425-607667cdc5ac",
  "to": "CALLER"
}
```

```json
{
  "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "order_ids": [
    "548d77b9-3cd3-46a8-8cd0-9c8ff9513716"
  ],
  "started_at": "2026-10-28T15:30:58.134844Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674313614",
    "at": "2026-10-28T15:30:58.136761748Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.16263",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=548d77b9-3cd3-46a8-8cd0-9c8ff9513716` → **200**

```json
{
  "calls": [
    {
      "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [
        "548d77b9-3cd3-46a8-8cd0-9c8ff9513716"
      ],
      "started_at": "2026-10-28T15:30:58.134844Z",
      "answered_at": "2026-10-28T15:30:58.567716Z",
      "ended_at": "2026-10-28T15:30:58.58386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=548d77b9-3cd3-46a8-8cd0-9c8ff9513716` → **200**

```json
{
  "calls": [
    {
      "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [
        "548d77b9-3cd3-46a8-8cd0-9c8ff9513716"
      ],
      "started_at": "2026-10-28T15:30:58.134844Z",
      "answered_at": "2026-10-28T15:30:58.567716Z",
      "ended_at": "2026-10-28T15:30:58.58386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=548d77b9-3cd3-46a8-8cd0-9c8ff9513716` → **200**

```json
{
  "calls": [
    {
      "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [
        "548d77b9-3cd3-46a8-8cd0-9c8ff9513716"
      ],
      "started_at": "2026-10-28T15:30:58.134844Z",
      "answered_at": "2026-10-28T15:30:58.567716Z",
      "ended_at": "2026-10-28T15:30:58.58386Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=548d77b9-3cd3-46a8-8cd0-9c8ff9513716` → **200**

```json
{
  "calls": [
    {
      "id": "ac1698cf-5cdd-4f62-b468-0a0969a3c7c9",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "order_ids": [
        "548d77b9-3cd3-46a8-8cd0-9c8ff9513716"
      ],
      "started_at": "2026-10-28T15:30:58.134844Z",
      "answered_at": "2026-10-28T15:30:58.567716Z",
      "ended_at": "2026-10-28T15:30:58.58386Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T15:31:03.783466Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/548d77b9-3cd3-46a8-8cd0-9c8ff9513716` → **200**

```json
{
  "id": "548d77b9-3cd3-46a8-8cd0-9c8ff9513716",
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
  "created_at": "2026-10-28T15:30:57.909693Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674313614"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/548d77b9-3cd3-46a8-8cd0-9c8ff9513716/cancel` → **200**

```json
{
  "command_id": "22c4d9fa-6e09-4143-87e4-6c5f37d3275b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "548d77b9-3cd3-46a8-8cd0-9c8ff9513716",
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
  "created_at": "2026-10-28T15:30:57.909693Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674313614"
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
  "command_id": "26397103-f20d-43d4-a51b-2f23fb15d4c7",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T15:31:05.751658Z",
  "extension": "101"
}
```

Done: outgoing call ac1698cf-5cdd-4f62-b468-0a0969a3c7c9 from order 548d77b9-3cd3-46a8-8cd0-9c8ff9513716, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638608377",
  "device_ref": "sandbox-6401"
}
```

```json
{
  "challenge_id": "5645f8c0-3437-4a5c-9882-db30dd65f369",
  "expires_at": "2026-10-28T15:36:05.940906988Z",
  "resend_available_at": "2026-10-28T15:31:06.940906988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638608377` → **200**

```json
{
  "phone": "+380638608377",
  "audience": "CLIENT",
  "code": "798131",
  "sent_at": "2026-10-28T15:31:05.943334312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5645f8c0-3437-4a5c-9882-db30dd65f369",
  "code": "798131",
  "device_ref": "sandbox-6401"
}
```

```json
{
  "session_id": "6a6ec3ba-efc8-4760-ae2b-46e1525ceefb",
  "subject": {
    "type": "CLIENT",
    "id": "f7c10631-c75d-4d14-b11c-715130fd7959"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmN2MxMDYzMS1jNzVkLTRkMTQtYjExYy03MTUxMzBmZDc5NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzY2LCJpYXQiOjE3OTMyMDE0NjYsImp0aSI6ImZlM2YyY2Y3LWMxODUtNGMwNi05NTk5LTY4MjNlZDhlZmM5MCIsInNpZCI6IjZhNmVjM2JhLWVmYzgtNDc2MC1hZTJiLTQ2ZTE1MjVjZWVmYiJ9.exslaPJH4-amgHXLotXOUG_tHdtEcFpkVDXpvBBAD7A",
  "access_expires_at": "2026-10-28T15:46:06.148812394Z",
  "refresh_token": "Lih5IMaoAlPNnFyyU9-6r85c6ftpKApFW779iBF6wPs",
  "refresh_expires_at": "2026-11-27T15:31:06.148254316Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7c10631-c75d-4d14-b11c-715130fd7959",
  "session_id": "6a6ec3ba-efc8-4760-ae2b-46e1525ceefb",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638608377",
  "device_ref": "sandbox-25919"
}
```

```json
{
  "challenge_id": "70eddd49-45ad-4b79-8600-6b6a4a7d268e",
  "expires_at": "2026-10-28T15:36:08.494418039Z",
  "resend_available_at": "2026-10-28T15:31:09.494418039Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638608377` → **200**

```json
{
  "phone": "+380638608377",
  "audience": "CLIENT",
  "code": "101877",
  "sent_at": "2026-10-28T15:31:08.495947925Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70eddd49-45ad-4b79-8600-6b6a4a7d268e",
  "code": "101877",
  "device_ref": "sandbox-25919"
}
```

```json
{
  "session_id": "b90b79c5-0130-4023-92a4-3977c410d151",
  "subject": {
    "type": "CLIENT",
    "id": "f7c10631-c75d-4d14-b11c-715130fd7959"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmN2MxMDYzMS1jNzVkLTRkMTQtYjExYy03MTUxMzBmZDc5NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzY4LCJpYXQiOjE3OTMyMDE0NjgsImp0aSI6IjE3MDQ1NGEzLWVhMWMtNDdiNS04YjE1LTAyM2QzN2YwYmMwOCIsInNpZCI6ImI5MGI3OWM1LTAxMzAtNDAyMy05MmE0LTM5NzdjNDEwZDE1MSJ9.mjT6WNkr-yLWM9ZAjdPX-RcjDTNn3Uky1mpgPs0Al5Y",
  "access_expires_at": "2026-10-28T15:46:08.694726418Z",
  "refresh_token": "8oD77dHG2_Tuy03e35QE6G-nFVHjlN0buUOJ-uinJjY",
  "refresh_expires_at": "2026-11-27T15:31:08.694293151Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "4625c03c-ceb3-4341-8219-6065ac781bbc",
  "expires_at": "2026-10-28T15:36:10.886544469Z",
  "resend_available_at": "2026-10-28T15:31:11.886544469Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638608377` → **200**

```json
{
  "phone": "+380638608377",
  "audience": "CLIENT",
  "code": "756555",
  "sent_at": "2026-10-28T15:31:10.888198218Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380639026269"
}
```

```json
{
  "challenge_id": "784a8706-7191-445f-b01b-6f68df4b2d9d",
  "expires_at": "2026-10-28T15:36:11.076745376Z",
  "resend_available_at": "2026-10-28T15:31:12.076745376Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639026269` → **200**

```json
{
  "phone": "+380639026269",
  "audience": "CLIENT",
  "code": "984119",
  "sent_at": "2026-10-28T15:31:11.078224754Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "a5276640-95c3-470c-8eed-0aff462e71d1",
  "current_challenge_id": "4625c03c-ceb3-4341-8219-6065ac781bbc",
  "current_code": "000000",
  "new_challenge_id": "784a8706-7191-445f-b01b-6f68df4b2d9d",
  "new_code": "984119"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "a6999065-c1c7-45be-918a-f8ecfa9c8817"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "4c03b6e7-7f65-42cf-88f3-571a894eda9f",
  "current_challenge_id": "4625c03c-ceb3-4341-8219-6065ac781bbc",
  "current_code": "756555",
  "new_challenge_id": "784a8706-7191-445f-b01b-6f68df4b2d9d",
  "new_code": "984119"
}
```

```json
{
  "subject_id": "f7c10631-c75d-4d14-b11c-715130fd7959",
  "phone": "+380639026269",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7c10631-c75d-4d14-b11c-715130fd7959",
  "session_id": "6a6ec3ba-efc8-4760-ae2b-46e1525ceefb",
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
  "correlation_id": "fe354950-d9f5-458e-8b38-0f7c6d78949b"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639026269",
  "device_ref": "sandbox-10900"
}
```

```json
{
  "challenge_id": "2bda9b2b-7d42-42db-bad2-fbaa57752e48",
  "expires_at": "2026-10-28T15:36:14.002748006Z",
  "resend_available_at": "2026-10-28T15:31:15.002748006Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639026269` → **200**

```json
{
  "phone": "+380639026269",
  "audience": "CLIENT",
  "code": "653561",
  "sent_at": "2026-10-28T15:31:14.004273196Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2bda9b2b-7d42-42db-bad2-fbaa57752e48",
  "code": "653561",
  "device_ref": "sandbox-10900"
}
```

```json
{
  "session_id": "70cb9f87-c6f6-4635-a558-4dfd3bbaf7f1",
  "subject": {
    "type": "CLIENT",
    "id": "f7c10631-c75d-4d14-b11c-715130fd7959"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmN2MxMDYzMS1jNzVkLTRkMTQtYjExYy03MTUxMzBmZDc5NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzc0LCJpYXQiOjE3OTMyMDE0NzQsImp0aSI6IjcyM2VjODM2LTE2MWItNGQ2OS1hNTQ0LTJkMGJhMWVhMzJmMyIsInNpZCI6IjcwY2I5Zjg3LWM2ZjYtNDYzNS1hNTU4LTRkZmQzYmJhZjdmMSJ9.4rAnygDJYjDX0y7L3XkMndjVf9dTyMOSSZwGUgQMQlQ",
  "access_expires_at": "2026-10-28T15:46:14.201313301Z",
  "refresh_token": "WCq6-RF4g0J9UFK7YPtAxAuKRGCdaphbghqCoJMjBUs",
  "refresh_expires_at": "2026-11-27T15:31:14.200822685Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7c10631-c75d-4d14-b11c-715130fd7959",
  "session_id": "70cb9f87-c6f6-4635-a558-4dfd3bbaf7f1",
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
  "session_id": "4c1a64d3-da8d-4c08-b29c-3450c976810f",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNzQsImlhdCI6MTc5MzIwMTQ3NCwianRpIjoiYzk0YmNiMWUtNWY5Mi00MGE5LTk3MzctM2ZiZWI0YTVhNjNhIiwic2lkIjoiNGMxYTY0ZDMtZGE4ZC00YzA4LWIyOWMtMzQ1MGM5NzY4MTBmIn0.S3IlDIMs_3DgiP3ciwz5YISkJ00E2ZPRzHreNfspVJ0",
  "access_expires_at": "2026-10-28T15:46:14.742685378Z",
  "refresh_token": "0sD_tXExCkokfkCUhRwkmVDUWkvSTlrlL49cQgVOclw",
  "refresh_expires_at": "2026-10-29T03:31:14.742272619Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/f7c10631-c75d-4d14-b11c-715130fd7959` → **200**

```json
{
  "client": {
    "id": "f7c10631-c75d-4d14-b11c-715130fd7959",
    "phone": "+380639026269",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T15:31:06.146912Z",
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

`POST /api/admin/v1/clients/f7c10631-c75d-4d14-b11c-715130fd7959/phone` → **400**

```json
{
  "command_id": "29d15a97-64dc-45f4-8be6-b0e98ab7d2cf",
  "expected_version": 3,
  "phone": "+380639782293",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/f7c10631-c75d-4d14-b11c-715130fd7959/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9468a841-e6da-440e-a1d6-5eeeb417a46c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/f7c10631-c75d-4d14-b11c-715130fd7959/phone` → **200**

```json
{
  "command_id": "460f5ba1-5b13-472e-a56e-e9e087bf53b0",
  "expected_version": 3,
  "phone": "+380639782293",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "f7c10631-c75d-4d14-b11c-715130fd7959",
  "phone": "+380639782293",
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
  "correlation_id": "19e22416-4967-4d58-9c00-9636b1236167"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639782293",
  "device_ref": "sandbox-8458"
}
```

```json
{
  "challenge_id": "0caf5381-80b5-4178-88be-e5c75c747878",
  "expires_at": "2026-10-28T15:36:15.65161178Z",
  "resend_available_at": "2026-10-28T15:31:16.65161178Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639782293` → **200**

```json
{
  "phone": "+380639782293",
  "audience": "CLIENT",
  "code": "581794",
  "sent_at": "2026-10-28T15:31:15.653241122Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0caf5381-80b5-4178-88be-e5c75c747878",
  "code": "581794",
  "device_ref": "sandbox-8458"
}
```

```json
{
  "session_id": "41b4cd81-3497-40ad-85ad-d84cd08145fe",
  "subject": {
    "type": "CLIENT",
    "id": "f7c10631-c75d-4d14-b11c-715130fd7959"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmN2MxMDYzMS1jNzVkLTRkMTQtYjExYy03MTUxMzBmZDc5NTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzc1LCJpYXQiOjE3OTMyMDE0NzUsImp0aSI6IjY0MTdjYWVkLTQ0NmYtNDQ3Mi04NDEzLTBhOGM1MTQ4OWVmNyIsInNpZCI6IjQxYjRjZDgxLTM0OTctNDBhZC04NWFkLWQ4NGNkMDgxNDVmZSJ9.TUWQc9ndL6Klfd7gzx_qNPatytPM4TiZdjUN4EcNzjA",
  "access_expires_at": "2026-10-28T15:46:15.848912338Z",
  "refresh_token": "kIBLKdEhZtxYqK2OoD1NL-P8zmtJND3H7GOGiuQpWY0",
  "refresh_expires_at": "2026-11-27T15:31:15.848444325Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7c10631-c75d-4d14-b11c-715130fd7959",
  "session_id": "41b4cd81-3497-40ad-85ad-d84cd08145fe",
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
  "phone": "+380637501483",
  "device_ref": "sandbox-25664"
}
```

```json
{
  "challenge_id": "2c85dcc7-f382-467e-b953-51b58f606776",
  "expires_at": "2026-10-28T15:36:16.202569969Z",
  "resend_available_at": "2026-10-28T15:31:17.202569969Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637501483` → **200**

```json
{
  "phone": "+380637501483",
  "audience": "CLIENT",
  "code": "072485",
  "sent_at": "2026-10-28T15:31:16.204482972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c85dcc7-f382-467e-b953-51b58f606776",
  "code": "072485",
  "device_ref": "sandbox-25664"
}
```

```json
{
  "session_id": "5b0ac577-a4ae-440d-b1cb-92771bb38c6d",
  "subject": {
    "type": "CLIENT",
    "id": "2eb8eea9-7e8d-4fe5-bf93-fdbd55457fe6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZWI4ZWVhOS03ZThkLTRmZTUtYmY5My1mZGJkNTU0NTdmZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzc2LCJpYXQiOjE3OTMyMDE0NzYsImp0aSI6ImQzMDk3OGMwLTAzMGItNGMwYy05ODg0LTYyZTRhMTNlYWRjMyIsInNpZCI6IjViMGFjNTc3LWE0YWUtNDQwZC1iMWNiLTkyNzcxYmIzOGM2ZCJ9.HC06_BXzK0Sz6CWzxs17036n12djLDU95-hRNygcaug",
  "access_expires_at": "2026-10-28T15:46:16.394046283Z",
  "refresh_token": "C5_Idwx8jHdMCDgnUiK5lK5ILZWSUykIJ1RTW_3ZG-w",
  "refresh_expires_at": "2026-11-27T15:31:16.393664239Z",
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
  "session_id": "9a1b5d5c-456a-469b-abcf-5ba0070ae477",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNzcsImlhdCI6MTc5MzIwMTQ3NywianRpIjoiMzEzZGM5MDMtZTc1MC00OTM3LThmMzgtZTdhN2VlNDJhMTA5Iiwic2lkIjoiOWExYjVkNWMtNDU2YS00NjliLWFiY2YtNWJhMDA3MGFlNDc3In0.1O-h31wpILX1lwLpYuLYfl7pALXIJWRKWa5uEAhNxBU",
  "access_expires_at": "2026-10-28T15:46:17.140785998Z",
  "refresh_token": "TI_VQ1biozant4qXW7MFPVCOU2QPIX6bP1UJWEBStdY",
  "refresh_expires_at": "2026-10-29T03:31:17.140188951Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637501483` → **200**

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
  "correlation_id": "9205892f-1019-4d1b-b903-f6beb37f7632"
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
  "session_id": "9318ae51-90e1-4c71-b2a4-59fa446099cc",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzNzcsImlhdCI6MTc5MzIwMTQ3NywianRpIjoiNTgzMDVjMmQtMTRhNS00YTQ4LTk1M2UtODNiMWQxZTJmMzZlIiwic2lkIjoiOTMxOGFlNTEtOTBlMS00YzcxLWIyYTQtNTlmYTQ0NjA5OWNjIn0.U2X9ZziS5j-9aIhMub3SN5LGYTXjk8k2dvMjQkt7w20",
  "access_expires_at": "2026-10-28T15:46:17.908895733Z",
  "refresh_token": "qwWzi8Xj9ff6ZixqSWLuJkJAAXZcph9TyiGPdMUqCyY",
  "refresh_expires_at": "2026-10-29T03:31:17.908506078Z",
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
  "command_id": "9b09908f-d390-4b17-814d-e6c5cf4be2e5",
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
  "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T15:31:18.281795624Z"
}
```

## The rider books the airport for 2026-10-28T18:31:17Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600573772",
  "device_ref": "sandbox-5770"
}
```

```json
{
  "challenge_id": "1c100a6f-d7af-454a-9655-5c42b05974dc",
  "expires_at": "2026-10-28T15:36:18.462805049Z",
  "resend_available_at": "2026-10-28T15:31:19.462805049Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600573772` → **200**

```json
{
  "phone": "+48600573772",
  "audience": "CLIENT",
  "code": "578624",
  "sent_at": "2026-10-28T15:31:18.464538521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c100a6f-d7af-454a-9655-5c42b05974dc",
  "code": "578624",
  "device_ref": "sandbox-5770"
}
```

```json
{
  "session_id": "315cfb35-d5c5-4191-8105-929e39bf09e8",
  "subject": {
    "type": "CLIENT",
    "id": "13d6ba8d-1cda-4cd1-94fe-98060bd204ac"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxM2Q2YmE4ZC0xY2RhLTRjZDEtOTRmZS05ODA2MGJkMjA0YWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzc4LCJpYXQiOjE3OTMyMDE0NzgsImp0aSI6ImY5NDZmNGQ3LTJmZmMtNDI5NC1iYjA1LTA2MTllYzk3Y2Y4NiIsInNpZCI6IjMxNWNmYjM1LWQ1YzUtNDE5MS04MTA1LTkyOWUzOWJmMDllOCJ9.yH_4S0cVH9u2r1L0mewsY-1dCrXJUbALHfTiHWeUL9g",
  "access_expires_at": "2026-10-28T15:46:18.658945961Z",
  "refresh_token": "YDeS1M9e28sjHPIFIuuPRCAOiiRn3kZ-SCZaesDvumM",
  "refresh_expires_at": "2026-11-27T15:31:18.658638079Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40e7a8d4-a249-4009-b721-ffb44020e323",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T18:31:17Z"
}
```

```json
{
  "id": "69535d64-5199-41f9-9dfc-b20966792f2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:18.844194Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T18:31:17Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "80944f86-1086-4cd6-b402-201eb4fcb228",
  "quote_id": "69535d64-5199-41f9-9dfc-b20966792f2e",
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
  "pickup_at": "2026-10-28T18:31:17Z"
}
```

```json
{
  "id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "13d6ba8d-1cda-4cd1-94fe-98060bd204ac",
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
  "created_at": "2026-10-28T15:31:19.031861Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T18:31:17Z",
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
  "device_ref": "sandbox-9857"
}
```

```json
{
  "challenge_id": "19c3005d-c299-48fb-a47d-4662aac0faad",
  "expires_at": "2026-10-28T15:36:19.222841434Z",
  "resend_available_at": "2026-10-28T15:31:20.222841434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "593153",
  "sent_at": "2026-10-28T15:31:19.224579974Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19c3005d-c299-48fb-a47d-4662aac0faad",
  "code": "593153",
  "device_ref": "sandbox-9857"
}
```

```json
{
  "session_id": "24c25f2a-9ccf-4d00-8c78-8a0efead6107",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM3OSwiaWF0IjoxNzkzMjAxNDc5LCJqdGkiOiI4OGMwZGRjOC1kODdhLTQzOTctODk1YS1iMGFiNDgwMjczYmEiLCJzaWQiOiIyNGMyNWYyYS05Y2NmLTRkMDAtOGM3OC04YTBlZmVhZDYxMDcifQ.3W5HcG2t8zwh-h2JSko0TMOUcs9bhPvwlFZiFjFpyY8",
  "access_expires_at": "2026-10-28T15:46:19.433230633Z",
  "refresh_token": "6YbaYWcfjdvEG4NSpA0JXDiWv6gPALfwbDljdM6jLms",
  "refresh_expires_at": "2026-11-27T15:31:19.432844793Z",
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
  "command_id": "f82fde60-f238-46dc-8380-a7e9507ab557",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:19Z",
    "sequence": 1793201479781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e15dbdff-ca3e-42f4-9c26-11ae055b60bd",
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
  "last_heartbeat_at": "2026-10-28T15:31:19.796885Z",
  "last_location_at": "2026-10-28T15:31:19.796885Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
      "short_number": 21,
      "pickup_at": "2026-10-28T18:31:17Z",
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

`POST /api/driver/v1/preorders/1e82fb34-fa4b-4370-b7fc-3de63e553bf9/reserve` → **200**

```json
{
  "command_id": "060603f9-c0d3-4367-9893-bd592fe56024"
}
```

```json
{
  "id": "d6db8ef9-f86f-4c40-8477-62fec1c21631",
  "state": "RESERVED",
  "order": {
    "order_id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
    "short_number": 21,
    "pickup_at": "2026-10-28T18:31:17Z",
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
  "reserved_at": "2026-10-28T15:31:20.150018Z",
  "confirm_from": "2026-10-28T18:01:17Z",
  "confirm_until": "2026-10-28T18:11:17Z",
  "drop_until": "2026-10-28T17:31:17Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d6db8ef9-f86f-4c40-8477-62fec1c21631",
      "state": "RESERVED",
      "order": {
        "order_id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
        "short_number": 21,
        "pickup_at": "2026-10-28T18:31:17Z",
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
      "reserved_at": "2026-10-28T15:31:20.150018Z",
      "confirm_from": "2026-10-28T18:01:17Z",
      "confirm_until": "2026-10-28T18:11:17Z",
      "drop_until": "2026-10-28T17:31:17Z"
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
      "id": "d6db8ef9-f86f-4c40-8477-62fec1c21631",
      "state": "RESERVED",
      "order": {
        "order_id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
        "short_number": 21,
        "pickup_at": "2026-10-28T18:31:17Z",
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
      "reserved_at": "2026-10-28T15:31:20.150018Z",
      "confirm_from": "2026-10-28T18:01:17Z",
      "confirm_until": "2026-10-28T18:11:17Z",
      "drop_until": "2026-10-28T17:31:17Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d6db8ef9-f86f-4c40-8477-62fec1c21631/confirm` → **409**

```json
{
  "command_id": "a171daf1-e051-4917-aa4a-d1faff720b65"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d6db8ef9-f86f-4c40-8477-62fec1c21631/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9fba9b60-f013-44ee-b6cf-a0e30786c8ee"
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
  "session_id": "83afaa9f-ce6b-4579-8035-c099ff8f8414",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzODEsImlhdCI6MTc5MzIwMTQ4MSwianRpIjoiYTIzYTE0OGEtZDFlMC00NmY5LWJmY2EtNTE0NTViZWJiZjFmIiwic2lkIjoiODNhZmFhOWYtY2U2Yi00NTc5LTgwMzUtYzA5OWZmOGY4NDE0In0.ZArj6yxTNY2WZdN2CPnXpSSd157FeW0CnGi3zCRKP60",
  "access_expires_at": "2026-10-28T15:46:21.057177932Z",
  "refresh_token": "Yd0uy0V4RRqOc8AdoVfdRrLGc22vl36E4pgHKidYlj4",
  "refresh_expires_at": "2026-10-29T03:31:21.056853545Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1e82fb34-fa4b-4370-b7fc-3de63e553bf9` → **200**

```json
{
  "id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
  "short_number": 21,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "13d6ba8d-1cda-4cd1-94fe-98060bd204ac",
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
  "created_at": "2026-10-28T15:31:19.031861Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T18:31:17Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d6db8ef9-f86f-4c40-8477-62fec1c21631",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T15:31:20.150018Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1e82fb34-fa4b-4370-b7fc-3de63e553bf9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T15:31:19.032739Z",
      "actor": {
        "type": "CLIENT",
        "id": "13d6ba8d-1cda-4cd1-94fe-98060bd204ac",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
        "preorder": true,
        "quote_id": "69535d64-5199-41f9-9dfc-b20966792f2e",
        "pickup_at": "2026-10-28T18:31:17Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "84f0e4c0-07e4-40a7-8149-2987f76087b6"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T15:31:20.15085Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1e82fb34-fa4b-4370-b7fc-3de63e553bf9",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d6db8ef9-f86f-4c40-8477-62fec1c21631"
      },
      "correlation_id": "26893704-fcbd-4c56-b55e-fd008e4dbcf7"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 1e82fb34-fa4b-4370-b7fc-3de63e553bf9, reservation d6db8ef9-f86f-4c40-8477-62fec1c21631.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3866"
}
```

```json
{
  "challenge_id": "c573bbb6-5a89-453e-b42c-82f6bc48da8d",
  "expires_at": "2026-10-28T15:36:21.599528408Z",
  "resend_available_at": "2026-10-28T15:31:22.599528408Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "826814",
  "sent_at": "2026-10-28T15:31:21.601757153Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c573bbb6-5a89-453e-b42c-82f6bc48da8d",
  "code": "826814",
  "device_ref": "sandbox-3866"
}
```

```json
{
  "session_id": "231b6ee8-a512-4f3a-a0f9-2ff02324bbb2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM4MSwiaWF0IjoxNzkzMjAxNDgxLCJqdGkiOiJiMzUyMGE4Yy0yOThlLTRkODQtYWIxNy1lNzk0NjZiNmVkYmEiLCJzaWQiOiIyMzFiNmVlOC1hNTEyLTRmM2EtYTBmOS0yZmYwMjMyNGJiYjIifQ.uCHx-hccwmNl1mtrIGDvyNzktcGefJQS4tQs4IZ1d4g",
  "access_expires_at": "2026-10-28T15:46:21.793455412Z",
  "refresh_token": "OtswM8lVvM4yNXbq4OVYQxsv8YREtXgo7xWJv2IVzNs",
  "refresh_expires_at": "2026-11-27T15:31:21.79304151Z",
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
  "command_id": "eacf7553-660b-4139-b046-17c03521f20d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:22Z",
    "sequence": 1793201482142
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:22.156875Z",
  "last_location_at": "2026-10-28T15:31:22.156875Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670903665",
  "device_ref": "sandbox-2486"
}
```

```json
{
  "challenge_id": "4fe62b91-8ceb-4fda-adaa-7e043ef8f8e6",
  "expires_at": "2026-10-28T15:36:22.330960054Z",
  "resend_available_at": "2026-10-28T15:31:23.330960054Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670903665` → **200**

```json
{
  "phone": "+380670903665",
  "audience": "CLIENT",
  "code": "481703",
  "sent_at": "2026-10-28T15:31:22.332918764Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4fe62b91-8ceb-4fda-adaa-7e043ef8f8e6",
  "code": "481703",
  "device_ref": "sandbox-2486"
}
```

```json
{
  "session_id": "6cac486c-6f49-4153-b236-11b671027b76",
  "subject": {
    "type": "CLIENT",
    "id": "b679b6d0-50ba-45d6-bd62-c871fa76fe8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjc5YjZkMC01MGJhLTQ1ZDYtYmQ2Mi1jODcxZmE3NmZlOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyMzgyLCJpYXQiOjE3OTMyMDE0ODIsImp0aSI6IjRlODY3MGM2LTQ4ZjctNGFkMS1iMjFlLWMyODkwMWY5NTRlZSIsInNpZCI6IjZjYWM0ODZjLTZmNDktNDE1My1iMjM2LTExYjY3MTAyN2I3NiJ9.T_YV_NDDtn5Kjz83RnwqA1-KmXqo6Sf9lXpnYLCyHPE",
  "access_expires_at": "2026-10-28T15:46:22.526598175Z",
  "refresh_token": "CP9aKn164mjdmVgHGpHsOPd9_YDijswXefwcTGofaeM",
  "refresh_expires_at": "2026-11-27T15:31:22.52624184Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6cbaddb5-6357-454c-aafb-56608f8ee7ab",
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
  "id": "e8476336-1230-4d79-b219-69c81a25fea0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:22.717855Z",
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
  "command_id": "071649c8-00fa-4415-81dd-8d119536a491",
  "quote_id": "e8476336-1230-4d79-b219-69c81a25fea0",
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
  "id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "short_number": 22,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b679b6d0-50ba-45d6-bd62-c871fa76fe8a",
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
  "created_at": "2026-10-28T15:31:22.895706Z",
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
    "id": "e9d69824-0abe-4b74-9659-848bee7e12d0",
    "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
    "expires_at": "2026-10-28T15:31:37.897629Z",
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

`POST /api/driver/v1/offers/e9d69824-0abe-4b74-9659-848bee7e12d0/accept` → **200**

```json
{
  "command_id": "3489d3d9-c909-4ee1-9ef4-9c32a82717f0"
}
```

```json
{
  "id": "0783fdd0-1647-4da3-88fa-70dd394ec1e9",
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "54b3b52e-aec8-4d7d-b9a0-525a38e70434",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "54b3b52e-aec8-4d7d-b9a0-525a38e70434",
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "assignment_id": "0783fdd0-1647-4da3-88fa-70dd394ec1e9",
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

`POST /api/driver/v1/work-sessions/6a6c89dc-c8f7-4e48-97d3-3d40978751b6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:23Z",
    "sequence": 1793201483644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:23.661397Z",
  "last_location_at": "2026-10-28T15:31:23.661397Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "54b3b52e-aec8-4d7d-b9a0-525a38e70434",
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "assignment_id": "0783fdd0-1647-4da3-88fa-70dd394ec1e9",
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

`POST /api/driver/v1/trips/54b3b52e-aec8-4d7d-b9a0-525a38e70434/arrive` → **200**

```json
{
  "command_id": "30b1a88e-a8ed-49a9-a287-95635a865111",
  "expected_version": 0
}
```

```json
{
  "id": "54b3b52e-aec8-4d7d-b9a0-525a38e70434",
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "assignment_id": "0783fdd0-1647-4da3-88fa-70dd394ec1e9",
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
  "arrived_at": "2026-10-28T15:31:24.008904Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/54b3b52e-aec8-4d7d-b9a0-525a38e70434/start` → **200**

```json
{
  "command_id": "e47ace09-fe91-4775-8ea2-f7606eed27e5",
  "expected_version": 1
}
```

```json
{
  "id": "54b3b52e-aec8-4d7d-b9a0-525a38e70434",
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "assignment_id": "0783fdd0-1647-4da3-88fa-70dd394ec1e9",
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
  "arrived_at": "2026-10-28T15:31:24.008904Z",
  "started_at": "2026-10-28T15:31:24.185513Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6a6c89dc-c8f7-4e48-97d3-3d40978751b6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:24Z",
    "sequence": 1793201484359
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:24.374055Z",
  "last_location_at": "2026-10-28T15:31:24.374055Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/54b3b52e-aec8-4d7d-b9a0-525a38e70434/complete` → **200**

```json
{
  "command_id": "0fd57a49-79ff-477c-a1bf-afa4894a1927",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:31:24Z",
  "cash_received": true
}
```

```json
{
  "id": "54b3b52e-aec8-4d7d-b9a0-525a38e70434",
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "assignment_id": "0783fdd0-1647-4da3-88fa-70dd394ec1e9",
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
  "arrived_at": "2026-10-28T15:31:24.008904Z",
  "started_at": "2026-10-28T15:31:24.185513Z",
  "completed_at": "2026-10-28T15:31:24.553116Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3/rating` → **200**

```json
{
  "command_id": "4a5bd4f5-b82e-4bff-85fb-5634f9c5874e",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "score": 5,
  "created_at": "2026-10-28T15:31:24.751445603Z"
}
```

`POST /api/driver/v1/orders/9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3/rating` → **200**

```json
{
  "command_id": "6806cd1a-71f2-4da8-ad0a-b5785f9946ff",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
  "score": 4,
  "created_at": "2026-10-28T15:31:24.930757654Z"
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
  "session_id": "afd237f0-ea14-4f2c-9299-8cfd7e989475",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzODUsImlhdCI6MTc5MzIwMTQ4NSwianRpIjoiODA4ZmM2ODktNTA5ZC00OTIwLWE2OWItYWFjOTM1ZGFkM2RmIiwic2lkIjoiYWZkMjM3ZjAtZWExNC00ZjJjLTkyOTktOGNmZDdlOTg5NDc1In0.r49mr4VRx5hwzoKoT918vN3Cqej-2kQ04x44FC92x1o",
  "access_expires_at": "2026-10-28T15:46:25.488000232Z",
  "refresh_token": "lpaigCEeCI4Ez3bp02YgQENmsWHHZavwf9xtp6n5l4M",
  "refresh_expires_at": "2026-10-29T03:31:25.487609311Z",
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
  "session_id": "d9d2bc02-c027-4387-a098-3a08fb465fdb",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzODUsImlhdCI6MTc5MzIwMTQ4NSwianRpIjoiYzFkZmQ4NjgtZTllNy00MDJmLTk5M2YtMmMwZThlM2E2ZTQ3Iiwic2lkIjoiZDlkMmJjMDItYzAyNy00Mzg3LWEwOTgtM2EwOGZiNDY1ZmRiIn0.KBdz8oYfen5QWdNDodfViSwlZSf51z2hP1aRMIumX1Q",
  "access_expires_at": "2026-10-28T15:46:25.868291123Z",
  "refresh_token": "rtu14_OnyVwchN8BuFJXbQ3IJOl3OOlDd7jcPEVPGNk",
  "refresh_expires_at": "2026-10-29T03:31:25.867825323Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
      "author_type": "RIDER",
      "author_id": "b679b6d0-50ba-45d6-bd62-c871fa76fe8a",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T15:31:24.751446Z"
    },
    {
      "order_id": "9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b679b6d0-50ba-45d6-bd62-c871fa76fe8a",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T15:31:24.930758Z"
    }
  ]
}
```

Done: ratings for order 9d8c928d-6129-4ff8-98df-ddcc6b8b4bd3.

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
  "session_id": "5465e398-944b-4467-a7bf-4af525a140be",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzODYsImlhdCI6MTc5MzIwMTQ4NiwianRpIjoiM2U2Y2Y1MTQtNzM5MS00OTQ5LWEwMzAtMzdjOGQ3YjNkMzgzIiwic2lkIjoiNTQ2NWUzOTgtOTQ0Yi00NDY3LWE3YmYtNGFmNTI1YTE0MGJlIn0.tqWpV93t6ob_aMS1dO_MeHEtNssFRHQb952_bcNuSRI",
  "access_expires_at": "2026-10-28T15:46:26.445615294Z",
  "refresh_token": "xQVg7VSH4yxDkji-c4TZGiyxJE-t7mb0mnx29g6WLJ8",
  "refresh_expires_at": "2026-10-29T03:31:26.445258529Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "73fc36bb-5eff-4c87-9044-833c463eb60e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "67e9c689-f1c5-4d6b-874b-95fbbd2e09ad",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:26.645578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67e9c689-f1c5-4d6b-874b-95fbbd2e09ad` → **200**

```json
{
  "id": "67e9c689-f1c5-4d6b-874b-95fbbd2e09ad",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:26.645578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67e9c689-f1c5-4d6b-874b-95fbbd2e09ad` → **200**

```json
{
  "id": "67e9c689-f1c5-4d6b-874b-95fbbd2e09ad",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:26.645578Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/67e9c689-f1c5-4d6b-874b-95fbbd2e09ad` → **200**

```json
{
  "id": "67e9c689-f1c5-4d6b-874b-95fbbd2e09ad",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:31:26.645578Z",
  "ready_at": "2026-10-28T15:31:28.793992Z",
  "expires_at": "2026-10-29T15:31:28.793992Z"
}
```

`GET /api/admin/v1/reports/exports/67e9c689-f1c5-4d6b-874b-95fbbd2e09ad/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
total,21,8,13,0,0,16,5,0,19,1,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ba10119f-74e9-4dd0-a24c-fff1c522b6c8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "513fb556-d8b3-422d-9343-ec398f118ef0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:29.397749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/513fb556-d8b3-422d-9343-ec398f118ef0` → **200**

```json
{
  "id": "513fb556-d8b3-422d-9343-ec398f118ef0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:29.397749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/513fb556-d8b3-422d-9343-ec398f118ef0` → **200**

```json
{
  "id": "513fb556-d8b3-422d-9343-ec398f118ef0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:29.397749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/513fb556-d8b3-422d-9343-ec398f118ef0` → **200**

```json
{
  "id": "513fb556-d8b3-422d-9343-ec398f118ef0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:29.397749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/513fb556-d8b3-422d-9343-ec398f118ef0` → **200**

```json
{
  "id": "513fb556-d8b3-422d-9343-ec398f118ef0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T15:31:29.397749Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/513fb556-d8b3-422d-9343-ec398f118ef0` → **200**

```json
{
  "id": "513fb556-d8b3-422d-9343-ec398f118ef0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T15:31:29.397749Z",
  "ready_at": "2026-10-28T15:31:33.799806Z",
  "expires_at": "2026-10-29T15:31:33.799806Z"
}
```

`GET /api/admin/v1/reports/exports/513fb556-d8b3-422d-9343-ec398f118ef0/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/d62cfe29-3750-4555-9b7d-22396648ffd6` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/d62cfe29-3750-4555-9b7d-22396648ffd6",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f3208750-b0ae-4755-8203-a7fc9535c93e"
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
  "device_ref": "sandbox-2059"
}
```

```json
{
  "challenge_id": "e23404b5-0709-4b33-b31e-eac139a28047",
  "expires_at": "2026-10-28T15:36:34.665778811Z",
  "resend_available_at": "2026-10-28T15:31:35.665778811Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "509393",
  "sent_at": "2026-10-28T15:31:34.667633048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e23404b5-0709-4b33-b31e-eac139a28047",
  "code": "509393",
  "device_ref": "sandbox-2059"
}
```

```json
{
  "session_id": "51345a62-beb3-4a69-badc-a1fbd27a66b7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjM5NCwiaWF0IjoxNzkzMjAxNDk0LCJqdGkiOiIxOGViNTc5My1iMjZhLTQ2YmUtYjNiZC1kNjIyMWM0MDAxYjkiLCJzaWQiOiI1MTM0NWE2Mi1iZWIzLTRhNjktYmFkYy1hMWZiZDI3YTY2YjcifQ.WN-Swj6fw6tchib6av3ex0qhfo8-0hsS-3oJ4Kej2AM",
  "access_expires_at": "2026-10-28T15:46:34.864706649Z",
  "refresh_token": "sVHTqvtj9kAGx0MohGknVmYaHXx1dBdKnQYTeR9t9Vc",
  "refresh_expires_at": "2026-11-27T15:31:34.86432812Z",
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
  "command_id": "311f1ae3-01e5-4a2f-a54d-6ac6137f256c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:35Z",
    "sequence": 1793201495395
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "9c4acaa9-5754-4570-9192-83a708434668",
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
  "last_heartbeat_at": "2026-10-28T15:31:35.409723Z",
  "last_location_at": "2026-10-28T15:31:35.409723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "fe8a0a1e-4136-436b-aa2a-7001d73dc8ba",
  "points": [
    {
      "sequence": 1793201497591,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:30:37Z"
    },
    {
      "sequence": 1793201497598,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T15:31:37Z"
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
  "session_id": "4f275a13-297f-4cb3-95a5-770ee4df803a",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzOTgsImlhdCI6MTc5MzIwMTQ5OCwianRpIjoiZDY0ODY0Y2QtM2E3Mi00OWYyLTkwOWMtOTAxZjNmNTdlNGE2Iiwic2lkIjoiNGYyNzVhMTMtMjk3Zi00Y2IzLTk1YTUtNzcwZWU0ZGY4MDNhIn0.eO6wGo93OqEL-behtC7qSd6BsXzA9l_BR4UZHNUSAM4",
  "access_expires_at": "2026-10-28T15:46:38.035112627Z",
  "refresh_token": "BG9_Ics0kdumw6HtDotD6nEN6R28En5gj1IFjHuCdFk",
  "refresh_expires_at": "2026-10-29T03:31:38.03408868Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "461312c3-e915-4138-8f1d-c3598c4f5559",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T15:31:37Z",
        "track_point_id": "1ebdfa63-32f6-44dd-b5bd-b146f4dd2273",
        "work_session_id": "9c4acaa9-5754-4570-9192-83a708434668"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T15:31:37Z",
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

`POST /api/admin/v1/driver-risk-flags/461312c3-e915-4138-8f1d-c3598c4f5559/confirm` → **200**

```json
{
  "command_id": "d0e8b857-902b-4b14-a6b2-38c87271e0d0",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "461312c3-e915-4138-8f1d-c3598c4f5559",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T15:31:37Z",
    "track_point_id": "1ebdfa63-32f6-44dd-b5bd-b146f4dd2273",
    "work_session_id": "9c4acaa9-5754-4570-9192-83a708434668"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T15:31:37Z",
  "reason": null,
  "reviewed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reviewed_at": "2026-10-28T15:31:38.625231Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/461312c3-e915-4138-8f1d-c3598c4f5559/dismiss` → **409**

```json
{
  "command_id": "e5da915b-8393-4324-85e2-904e9264fe81",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/461312c3-e915-4138-8f1d-c3598c4f5559/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "dbbc9de6-b4c3-4355-9a65-11fc2c7e76e3"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "5cc52d9b-65d6-478b-8ef5-fe0bda3e71c4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "aeb384c7-2ca5-4f4b-93ca-4f0233999d02",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "raised_at": "2026-10-28T15:31:39.003014Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/aeb384c7-2ca5-4f4b-93ca-4f0233999d02/dismiss` → **200**

```json
{
  "command_id": "9cd2de0f-12ec-42c4-914c-f575253bc3c8",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "aeb384c7-2ca5-4f4b-93ca-4f0233999d02",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "raised_at": "2026-10-28T15:31:39.003014Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reviewed_at": "2026-10-28T15:31:39.198051Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "782332c2-00f0-44e9-a42b-0370089cbd94",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "461312c3-e915-4138-8f1d-c3598c4f5559"
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
      "actor_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:31:39.39001Z"
    }
  ]
}
```

Done: flag 461312c3-e915-4138-8f1d-c3598c4f5559 confirmed, suspension named it, driver reinstated.

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
  "session_id": "c52aa03d-1703-43e9-996d-66e3b588e5fb",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDIzOTksImlhdCI6MTc5MzIwMTQ5OSwianRpIjoiNThhOGM2NjgtMGZhZS00MWY3LTllZTYtYTZhNjcwNjA5MDE3Iiwic2lkIjoiYzUyYWEwM2QtMTcwMy00M2U5LTk5NmQtNjZlM2I1ODhlNWZiIn0.z6L3tB_ay-2DMmYd_rCDDo36mwxXdLRQ-dbRxhI7QCE",
  "access_expires_at": "2026-10-28T15:46:39.962790574Z",
  "refresh_token": "gwS8b-5FNTYqsxCkO7nMXTscZKon_UxXArtsm9FPzyw",
  "refresh_expires_at": "2026-10-29T03:31:39.96241475Z",
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
      "actor_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:31:39.39001Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "2a7713ab-ec1b-4702-9585-f1dc089ed4b8",
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
  "session_id": "9c4acaa9-5754-4570-9192-83a708434668",
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
  "last_heartbeat_at": "2026-10-28T15:31:35.409723Z",
  "last_location_at": "2026-10-28T15:31:35.409723Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9c4acaa9-5754-4570-9192-83a708434668/close` → **200**

```json
{
  "command_id": "71eafaed-d289-4085-9201-862acaf59ea3",
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
  "session_id": "4c53a412-91f2-4ffd-aaa6-35d6b29a9e7f",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MDEsImlhdCI6MTc5MzIwMTUwMSwianRpIjoiZWU1ZGJhMjctZDFjMi00NmM3LWJkNWItOTA1MmY3OTA4MTE0Iiwic2lkIjoiNGM1M2E0MTItOTFmMi00ZmZkLWFhYTYtMzVkNmIyOWE5ZTdmIn0.kV-bJZfr00LkOfqocXd65YZK8pv3pvkpeFFupiPeXzA",
  "access_expires_at": "2026-10-28T15:46:41.117106001Z",
  "refresh_token": "HJb1Hht363qWDU91oYOyK55Jy8dQbipuYx32dNTwI44",
  "refresh_expires_at": "2026-10-29T03:31:41.116733552Z",
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
  "command_id": "e01b3a60-8582-4d28-aa4c-fcda9dc55d64",
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
  "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:31:41.536464Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e01b3a60-8582-4d28-aa4c-fcda9dc55d64",
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
  "changed_by": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T15:31:41.536464Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48758815613",
  "device_ref": "sandbox-10461"
}
```

```json
{
  "challenge_id": "3b92fe54-5dde-46f6-9373-a5e8f38d4b6e",
  "expires_at": "2026-10-28T15:36:41.926795757Z",
  "resend_available_at": "2026-10-28T15:31:42.926795757Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48758815613` → **200**

```json
{
  "phone": "+48758815613",
  "audience": "CLIENT",
  "code": "612251",
  "sent_at": "2026-10-28T15:31:41.928701203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b92fe54-5dde-46f6-9373-a5e8f38d4b6e",
  "code": "612251",
  "device_ref": "sandbox-10461"
}
```

```json
{
  "session_id": "f00ea68b-02ba-4c68-a26c-2f8b0127f8f0",
  "subject": {
    "type": "CLIENT",
    "id": "57bb9c3f-4e85-4bb0-9f81-ba0ce42143e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1N2JiOWMzZi00ZTg1LTRiYjAtOWY4MS1iYTBjZTQyMTQzZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDAyLCJpYXQiOjE3OTMyMDE1MDIsImp0aSI6IjU1ZjMzZmMzLWVmYzUtNDdkZS05M2QyLTRhZjhhYmU4MTQ0NCIsInNpZCI6ImYwMGVhNjhiLTAyYmEtNGM2OC1hMjZjLTJmOGIwMTI3ZjhmMCJ9.3aK7Hg-mdr1D-zzEtnmD8EOvh0y0JXluYoMSnJehOvE",
  "access_expires_at": "2026-10-28T15:46:42.141784713Z",
  "refresh_token": "sbBgbMPA92zQBzwODtyRZEq4jxDbI2W0SmCyD2F4uTc",
  "refresh_expires_at": "2026-11-27T15:31:42.141340087Z",
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
  "correlation_id": "1e02e46a-f8a1-435e-abed-518ad90089cc"
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
  "device_ref": "sandbox-1160"
}
```

```json
{
  "challenge_id": "a9d1e600-1b3c-4289-9c8a-f30944262dc9",
  "expires_at": "2026-10-28T15:36:42.705641427Z",
  "resend_available_at": "2026-10-28T15:31:43.705641427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "488927",
  "sent_at": "2026-10-28T15:31:42.707334065Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9d1e600-1b3c-4289-9c8a-f30944262dc9",
  "code": "488927",
  "device_ref": "sandbox-1160"
}
```

```json
{
  "session_id": "95769ec2-0c8e-4aea-838e-a5490106f236",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQwMiwiaWF0IjoxNzkzMjAxNTAyLCJqdGkiOiI5OWUxYTdjZC0zNzhiLTQ4ZTMtYTFiYS04NzI2MTk3OWYxZGEiLCJzaWQiOiI5NTc2OWVjMi0wYzhlLTRhZWEtODM4ZS1hNTQ5MDEwNmYyMzYifQ.WWvDZtjSyQp5i8BKuTIQ3Ctmz-MZXI-m5YFA65vCqo8",
  "access_expires_at": "2026-10-28T15:46:42.912005163Z",
  "refresh_token": "RcuFg5Cj9wHRIvsXLb9AfERS54aF0FnVhT2XcMJtWxY",
  "refresh_expires_at": "2026-11-27T15:31:42.91140329Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e15dbdff-ca3e-42f4-9c26-11ae055b60bd",
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
  "last_heartbeat_at": "2026-10-28T15:31:19.796885Z",
  "last_location_at": "2026-10-28T15:31:19.796885Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e15dbdff-ca3e-42f4-9c26-11ae055b60bd/handover` → **200**

```json
{
  "command_id": "f1f7b488-f574-48b3-bccc-4206e7de19f0",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e15dbdff-ca3e-42f4-9c26-11ae055b60bd",
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
  "last_heartbeat_at": "2026-10-28T15:31:19.796885Z",
  "last_location_at": "2026-10-28T15:31:19.796885Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e15dbdff-ca3e-42f4-9c26-11ae055b60bd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:43Z",
    "sequence": 1793201503453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e15dbdff-ca3e-42f4-9c26-11ae055b60bd",
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
  "last_heartbeat_at": "2026-10-28T15:31:43.469511Z",
  "last_location_at": "2026-10-28T15:31:43.469511Z",
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
  "session_id": "e15dbdff-ca3e-42f4-9c26-11ae055b60bd",
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
  "last_heartbeat_at": "2026-10-28T15:31:43.469511Z",
  "last_location_at": "2026-10-28T15:31:43.469511Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e15dbdff-ca3e-42f4-9c26-11ae055b60bd/close` → **200**

```json
{
  "command_id": "a9d247ef-33a1-44da-acc2-30b880716d45",
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
  "correlation_id": "41fdf596-a0fd-4de8-8aed-00ef0a57f7fe"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670777910",
  "device_ref": "sandbox-412"
}
```

```json
{
  "challenge_id": "0bc8b24b-ab17-4241-af74-3cf80eebc278",
  "expires_at": "2026-10-28T15:36:44.386212721Z",
  "resend_available_at": "2026-10-28T15:31:45.386212721Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670777910` → **200**

```json
{
  "phone": "+380670777910",
  "audience": "CLIENT",
  "code": "415014",
  "sent_at": "2026-10-28T15:31:44.387996485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0bc8b24b-ab17-4241-af74-3cf80eebc278",
  "code": "415014",
  "device_ref": "sandbox-412"
}
```

```json
{
  "session_id": "aa126c08-e330-4a72-afd9-8ce01151eb31",
  "subject": {
    "type": "CLIENT",
    "id": "f010b793-380e-4878-b355-20390bac966d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDEwYjc5My0zODBlLTQ4NzgtYjM1NS0yMDM5MGJhYzk2NmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDA0LCJpYXQiOjE3OTMyMDE1MDQsImp0aSI6ImViMDJjN2UzLTE2OTAtNGQ2Mi04YmUwLTEwZTNjMjc4NmRhZCIsInNpZCI6ImFhMTI2YzA4LWUzMzAtNGE3Mi1hZmQ5LThjZTAxMTUxZWIzMSJ9.7qJepxgGEcVNOC8YNadLTXH3iIQGuuN-Btsy7PyKhnc",
  "access_expires_at": "2026-10-28T15:46:44.597634845Z",
  "refresh_token": "rOBFnv3HFZJPoRpADIN50C4PtVpkI3B_K7CQNv7OYQA",
  "refresh_expires_at": "2026-11-27T15:31:44.59729159Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f32c198f-5ff3-4fef-861c-74eefd0df27c",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "048940cd-82fc-4165-bb0e-7e0bf6458784",
  "upload_path": "/api/rider/v1/uploads/048940cd-82fc-4165-bb0e-7e0bf6458784",
  "expires_at": "2026-10-28T15:46:44.783546516Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/048940cd-82fc-4165-bb0e-7e0bf6458784` → **200**

```json
{
  "file_id": "048940cd-82fc-4165-bb0e-7e0bf6458784",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "d8db74a4-0f79-4ce1-a007-0d471f84b062",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "048940cd-82fc-4165-bb0e-7e0bf6458784"
  ]
}
```

```json
{
  "id": "8b8e5348-9c83-4e67-a0fc-62db7036f614",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f010b793-380e-4878-b355-20390bac966d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:31:44.995666Z",
  "updated_at": "2026-10-28T15:31:44.995666Z",
  "respond_by": "2026-10-28T19:31:44.995666Z",
  "messages": [
    {
      "id": "8bc5efef-cb0e-42f3-8610-63f5bd2b7f97",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f010b793-380e-4878-b355-20390bac966d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:31:44.996893Z",
      "attachments": [
        {
          "file_id": "048940cd-82fc-4165-bb0e-7e0bf6458784",
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
  "session_id": "67a04ffe-9db6-47ec-b956-d7d72d8ff9c0",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MDUsImlhdCI6MTc5MzIwMTUwNSwianRpIjoiY2ZlYjEzNWEtZWYyNi00YjY1LTgxN2MtMTc3NTE5ZTU2OWNlIiwic2lkIjoiNjdhMDRmZmUtOWRiNi00N2VjLWI5NTYtZDdkNzJkOGZmOWMwIn0._VzDaPKcN_pVASTvBQ-FbLHaMTK2-968GO9Y8I_IIUk",
  "access_expires_at": "2026-10-28T15:46:45.40877785Z",
  "refresh_token": "zcrwWQUqHFU9OyawljcFLFAmIDLoZfj0JNYGMUnplC0",
  "refresh_expires_at": "2026-10-29T03:31:45.408376227Z",
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
  "session_id": "0ee8beba-0007-4385-a933-8910af035140",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MDUsImlhdCI6MTc5MzIwMTUwNSwianRpIjoiNjljOTZlODYtNjZlMy00ZDQ1LTk5NDgtNWZmODNiMjNjMTg1Iiwic2lkIjoiMGVlOGJlYmEtMDAwNy00Mzg1LWE5MzMtODkxMGFmMDM1MTQwIn0.dGNTtsApod_ZvubAp5R8TkG6hcPVMFx6LKAiqYmSgn4",
  "access_expires_at": "2026-10-28T15:46:45.796892098Z",
  "refresh_token": "fr8_o84kzvkt-hAb-LP-tOqmuJJqxfTc9zuZQdZqZwQ",
  "refresh_expires_at": "2026-10-29T03:31:45.796480811Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8b8e5348-9c83-4e67-a0fc-62db7036f614/attachments/048940cd-82fc-4165-bb0e-7e0bf6458784` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "dab49068-070b-4c47-abd7-d1406f3f62ae",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "560e5231-9192-49a5-ac7c-4f5466cdb120",
  "upload_path": "/api/operator/v1/uploads/560e5231-9192-49a5-ac7c-4f5466cdb120",
  "expires_at": "2026-10-28T15:46:45.989043385Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/560e5231-9192-49a5-ac7c-4f5466cdb120` → **200**

```json
{
  "file_id": "560e5231-9192-49a5-ac7c-4f5466cdb120",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8b8e5348-9c83-4e67-a0fc-62db7036f614` → **200**

```json
{
  "id": "8b8e5348-9c83-4e67-a0fc-62db7036f614",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f010b793-380e-4878-b355-20390bac966d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T15:31:44.995666Z",
  "updated_at": "2026-10-28T15:31:44.995666Z",
  "respond_by": "2026-10-28T19:31:44.995666Z",
  "messages": [
    {
      "id": "8bc5efef-cb0e-42f3-8610-63f5bd2b7f97",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f010b793-380e-4878-b355-20390bac966d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:31:44.996893Z",
      "attachments": [
        {
          "file_id": "048940cd-82fc-4165-bb0e-7e0bf6458784",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8b8e5348-9c83-4e67-a0fc-62db7036f614/comments` → **200**

```json
{
  "command_id": "ac68bca8-cf4b-4569-b1e4-91565a86f188",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "560e5231-9192-49a5-ac7c-4f5466cdb120"
  ]
}
```

```json
{
  "id": "8b8e5348-9c83-4e67-a0fc-62db7036f614",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f010b793-380e-4878-b355-20390bac966d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:31:44.995666Z",
  "updated_at": "2026-10-28T15:31:46.407186Z",
  "respond_by": "2026-10-28T19:31:44.995666Z",
  "messages": [
    {
      "id": "8bc5efef-cb0e-42f3-8610-63f5bd2b7f97",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f010b793-380e-4878-b355-20390bac966d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:31:44.996893Z",
      "attachments": [
        {
          "file_id": "048940cd-82fc-4165-bb0e-7e0bf6458784",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1a9eaa1f-ecd7-4c67-83c1-a43b7745a20c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:31:46.406836Z",
      "attachments": [
        {
          "file_id": "560e5231-9192-49a5-ac7c-4f5466cdb120",
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

`GET /api/rider/v1/support/cases/8b8e5348-9c83-4e67-a0fc-62db7036f614` → **200**

```json
{
  "id": "8b8e5348-9c83-4e67-a0fc-62db7036f614",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f010b793-380e-4878-b355-20390bac966d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T15:31:44.995666Z",
  "updated_at": "2026-10-28T15:31:46.407186Z",
  "respond_by": "2026-10-28T19:31:44.995666Z",
  "messages": [
    {
      "id": "8bc5efef-cb0e-42f3-8610-63f5bd2b7f97",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f010b793-380e-4878-b355-20390bac966d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T15:31:44.996893Z",
      "attachments": [
        {
          "file_id": "048940cd-82fc-4165-bb0e-7e0bf6458784",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "1a9eaa1f-ecd7-4c67-83c1-a43b7745a20c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T15:31:46.406836Z",
      "attachments": [
        {
          "file_id": "560e5231-9192-49a5-ac7c-4f5466cdb120",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8b8e5348-9c83-4e67-a0fc-62db7036f614/attachments/560e5231-9192-49a5-ac7c-4f5466cdb120` → **200**

Done: support case 8b8e5348-9c83-4e67-a0fc-62db7036f614, rider attachment 048940cd-82fc-4165-bb0e-7e0bf6458784, operator attachment 560e5231-9192-49a5-ac7c-4f5466cdb120.

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
  "session_id": "38f105e5-b360-4e12-87a6-58217f9d4c9b",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MDcsImlhdCI6MTc5MzIwMTUwNywianRpIjoiNjk4N2JmNmYtYjE4Ny00Y2ZhLWI5NDItN2ZiMzRiNTgxZGFkIiwic2lkIjoiMzhmMTA1ZTUtYjM2MC00ZTEyLTg3YTYtNTgyMTdmOWQ0YzliIn0.sL0Uou4oPPkfBOyVo_7j55Cpg_NZ9lizRtOZtZTaB7A",
  "access_expires_at": "2026-10-28T15:46:47.028212305Z",
  "refresh_token": "yFwcMLycWl_arLCOy_vZ73e5nbgNE978fDJpTxFLhfs",
  "refresh_expires_at": "2026-10-29T03:31:47.027826215Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-32050"
}
```

```json
{
  "challenge_id": "253332f7-88df-44ee-8f99-73d0c0c52562",
  "expires_at": "2026-10-28T15:36:47.20597378Z",
  "resend_available_at": "2026-10-28T15:31:48.20597378Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "757495",
  "sent_at": "2026-10-28T15:31:47.207835899Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "253332f7-88df-44ee-8f99-73d0c0c52562",
  "code": "757495",
  "device_ref": "sandbox-32050"
}
```

```json
{
  "session_id": "dc3be7a0-f8c4-4682-b6e0-7580352135b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQwNywiaWF0IjoxNzkzMjAxNTA3LCJqdGkiOiI3N2JkNDA3MC02ZTMxLTRmYmYtYjY3MS1jYWUzM2RlZTFmMjMiLCJzaWQiOiJkYzNiZTdhMC1mOGM0LTQ2ODItYjZlMC03NTgwMzUyMTM1YjkifQ.MZASQIMkXWWgcU0cRmJO1fZcUeUoXCKHJgHG-0ZBrGM",
  "access_expires_at": "2026-10-28T15:46:47.400913932Z",
  "refresh_token": "UqPgm-jzMeq-WkeU3kE79OebUc-b1Wek2Y_rQWxjPpM",
  "refresh_expires_at": "2026-11-27T15:31:47.400529389Z",
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
      "actor_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T15:31:39.39001Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T15:31:40.345856Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "78aca4d2-e76b-497d-b117-a0e52ee003a6",
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
  "device_ref": "sandbox-8365"
}
```

```json
{
  "challenge_id": "9c036d49-5b40-430a-9b10-fec1469c750a",
  "expires_at": "2026-10-28T15:36:48.138639504Z",
  "resend_available_at": "2026-10-28T15:31:49.138639504Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "050060",
  "sent_at": "2026-10-28T15:31:48.140387046Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c036d49-5b40-430a-9b10-fec1469c750a",
  "code": "050060",
  "device_ref": "sandbox-8365"
}
```

```json
{
  "session_id": "4f13bea6-c6ec-4c89-a42e-58b9104093ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQwOCwiaWF0IjoxNzkzMjAxNTA4LCJqdGkiOiJmYjE5MGVlYi05MmQxLTQ3YjYtOGQ2Mi02OGM0NDMyOGMxODgiLCJzaWQiOiI0ZjEzYmVhNi1jNmVjLTRjODktYTQyZS01OGI5MTA0MDkzZWUifQ.JGkR8DSfCURlhVZOnO-MKCEVcvEfVIGoUR5icX9GQ2o",
  "access_expires_at": "2026-10-28T15:46:48.334685691Z",
  "refresh_token": "ED79JcFcKiS_3JnI_kXs1Q7USp0vSIreX9iPE6sAaUQ",
  "refresh_expires_at": "2026-11-27T15:31:48.334297379Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:24.374055Z",
  "last_location_at": "2026-10-28T15:31:24.374055Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6a6c89dc-c8f7-4e48-97d3-3d40978751b6/handover` → **200**

```json
{
  "command_id": "4c049f00-9b8d-4a44-bac8-6e648c031409",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:24.374055Z",
  "last_location_at": "2026-10-28T15:31:24.374055Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6a6c89dc-c8f7-4e48-97d3-3d40978751b6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:48Z",
    "sequence": 1793201508872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:48.888822Z",
  "last_location_at": "2026-10-28T15:31:48.888822Z",
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
  "command_id": "8559845e-1144-4171-9643-5e55e34e13d5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:49Z",
    "sequence": 1793201509249
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cce94582-99c0-4990-851f-77d5fafba019",
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
  "last_heartbeat_at": "2026-10-28T15:31:49.264285Z",
  "last_location_at": "2026-10-28T15:31:49.264285Z",
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
  "session_id": "f9116d0d-4c6c-480a-b659-92a9e800aed8",
  "subject": {
    "type": "STAFF",
    "id": "8b87eb7b-a763-40a5-9437-8d35e5092d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Yjg3ZWI3Yi1hNzYzLTQwYTUtOTQzNy04ZDM1ZTUwOTJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDI0MDksImlhdCI6MTc5MzIwMTUwOSwianRpIjoiMTkxOGIzMDktYTYwYy00ZGM1LTljNDYtZWU5ZjIzNWZmOTY4Iiwic2lkIjoiZjkxMTZkMGQtNGM2Yy00ODBhLWI2NTktOTJhOWU4MDBhZWQ4In0.xVcmkbMgkiR0ux5LsnxhBG4W0ronZebb127nmaC0cM4",
  "access_expires_at": "2026-10-28T15:46:49.647030823Z",
  "refresh_token": "ynV3Qja34mTbqMFiImHbqZByBdmbdJeX0Ca4WZ3x_AQ",
  "refresh_expires_at": "2026-10-29T03:31:49.646700036Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b54ce650-856f-4331-8253-5969670f9d67",
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
  "id": "0b6d8ed1-567b-4f44-a81f-76789263b740",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:49.823434Z",
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
  "command_id": "157662a1-4036-4a4c-881b-a8e9acf91e7e",
  "quote_id": "0b6d8ed1-567b-4f44-a81f-76789263b740",
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
  "id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
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
  "created_at": "2026-10-28T15:31:50.004355Z",
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
    "id": "fbbe47b5-a0c8-4616-8aa8-72e0f271626e",
    "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
    "expires_at": "2026-10-28T15:32:05.007305Z",
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

`POST /api/driver/v1/offers/fbbe47b5-a0c8-4616-8aa8-72e0f271626e/accept` → **200**

```json
{
  "command_id": "2a98c6c3-efdd-4d07-b97b-172a7c29befe"
}
```

```json
{
  "id": "597ce3f6-5503-4c36-ae36-7f09d2082ffc",
  "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1954f0e3-3673-4a39-8c11-d939e668339c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1954f0e3-3673-4a39-8c11-d939e668339c",
  "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
  "assignment_id": "597ce3f6-5503-4c36-ae36-7f09d2082ffc",
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

`POST /api/driver/v1/work-sessions/cce94582-99c0-4990-851f-77d5fafba019/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T15:31:50Z",
    "sequence": 1793201510889
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cce94582-99c0-4990-851f-77d5fafba019",
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
  "last_heartbeat_at": "2026-10-28T15:31:50.904327Z",
  "last_location_at": "2026-10-28T15:31:50.904327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1954f0e3-3673-4a39-8c11-d939e668339c/arrive` → **200**

```json
{
  "command_id": "369ce5d8-c5e5-4cf5-ae67-66e24659954b",
  "expected_version": 0
}
```

```json
{
  "id": "1954f0e3-3673-4a39-8c11-d939e668339c",
  "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
  "assignment_id": "597ce3f6-5503-4c36-ae36-7f09d2082ffc",
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
  "arrived_at": "2026-10-28T15:31:51.085147Z",
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

`POST /api/driver/v1/trips/1954f0e3-3673-4a39-8c11-d939e668339c/start` → **200**

```json
{
  "command_id": "9ecd5268-bdfc-459a-a311-2a92780a6dca",
  "expected_version": 1
}
```

```json
{
  "id": "1954f0e3-3673-4a39-8c11-d939e668339c",
  "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
  "assignment_id": "597ce3f6-5503-4c36-ae36-7f09d2082ffc",
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
  "arrived_at": "2026-10-28T15:31:51.085147Z",
  "started_at": "2026-10-28T15:31:51.272222Z",
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

`POST /api/driver/v1/trips/1954f0e3-3673-4a39-8c11-d939e668339c/complete` → **200**

```json
{
  "command_id": "c043f1bd-4d2d-42f1-b5e0-0e4d4d3ad0c2",
  "expected_version": 2,
  "reported_at": "2026-10-28T15:31:51Z",
  "cash_received": true
}
```

```json
{
  "id": "1954f0e3-3673-4a39-8c11-d939e668339c",
  "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
  "assignment_id": "597ce3f6-5503-4c36-ae36-7f09d2082ffc",
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
  "arrived_at": "2026-10-28T15:31:51.085147Z",
  "started_at": "2026-10-28T15:31:51.272222Z",
  "completed_at": "2026-10-28T15:31:51.459569Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/77c2ce79-1898-41ef-b3ae-601a4c5bbc26` → **200**

```json
{
  "id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
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
    "id": "597ce3f6-5503-4c36-ae36-7f09d2082ffc",
    "order_id": "77c2ce79-1898-41ef-b3ae-601a4c5bbc26",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1954f0e3-3673-4a39-8c11-d939e668339c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T15:31:50.004355Z",
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
  "session_id": "6a6c89dc-c8f7-4e48-97d3-3d40978751b6",
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
  "last_heartbeat_at": "2026-10-28T15:31:48.888822Z",
  "last_location_at": "2026-10-28T15:31:48.888822Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a6c89dc-c8f7-4e48-97d3-3d40978751b6/close` → **200**

```json
{
  "command_id": "c08caf35-627e-4b60-87b2-5b70e06ae6cf",
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
  "session_id": "cce94582-99c0-4990-851f-77d5fafba019",
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
  "last_heartbeat_at": "2026-10-28T15:31:50.904327Z",
  "last_location_at": "2026-10-28T15:31:50.904327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cce94582-99c0-4990-851f-77d5fafba019/close` → **200**

```json
{
  "command_id": "59582597-d248-481f-8b5f-d5f4b17b005e",
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

Done: terminal order 77c2ce79-1898-41ef-b3ae-601a4c5bbc26 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19699"
}
```

```json
{
  "challenge_id": "4605c155-36e6-48cf-a420-95643ef35d18",
  "expires_at": "2026-10-28T15:36:55.716743573Z",
  "resend_available_at": "2026-10-28T15:31:56.716743573Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "842447",
  "sent_at": "2026-10-28T15:31:55.718518878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4605c155-36e6-48cf-a420-95643ef35d18",
  "code": "842447",
  "device_ref": "sandbox-19699"
}
```

```json
{
  "session_id": "cd307122-50fe-415c-8b24-6740d8844fce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQxNSwiaWF0IjoxNzkzMjAxNTE1LCJqdGkiOiJhZDFmMzAxMC0wMGMwLTQ2NzgtYTJkYy0zMjFiNDNiMjAxZGMiLCJzaWQiOiJjZDMwNzEyMi01MGZlLTQxNWMtOGIyNC02NzQwZDg4NDRmY2UifQ.TPb19hk7XYNS0cpMufo4e5pA-k0pgKEUQxYyehm4KsI",
  "access_expires_at": "2026-10-28T15:46:55.910446142Z",
  "refresh_token": "Cr_AgBdCDwfejIcXAzbel_0eZIoj5VikCa4PcVh_SUw",
  "refresh_expires_at": "2026-11-27T15:31:55.910076136Z",
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
  "device_ref": "sandbox-1886"
}
```

```json
{
  "challenge_id": "c20297f7-3b55-4faa-8184-a0f5c813e3f5",
  "expires_at": "2026-10-28T15:36:56.248886029Z",
  "resend_available_at": "2026-10-28T15:31:57.248886029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "743524",
  "sent_at": "2026-10-28T15:31:56.250475395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c20297f7-3b55-4faa-8184-a0f5c813e3f5",
  "code": "743524",
  "device_ref": "sandbox-1886"
}
```

```json
{
  "session_id": "45c1a810-a60e-48cc-a4fd-821c967aed2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQxNiwiaWF0IjoxNzkzMjAxNTE2LCJqdGkiOiJiMzA4OWRjNC0wMzc5LTQ4YzAtYTI0Mi0zMmZjMzNjYmM5MmMiLCJzaWQiOiI0NWMxYTgxMC1hNjBlLTQ4Y2MtYTRmZC04MjFjOTY3YWVkMmYifQ.nIGtweueF7jKknimJ4cO8eBvEzScRHxV2e6k7O_7W6g",
  "access_expires_at": "2026-10-28T15:46:56.442467281Z",
  "refresh_token": "1N7oYJSe_r0bAKtJYb-2dnGfujqLFvui2yrV3PxrJ-U",
  "refresh_expires_at": "2026-11-27T15:31:56.442099098Z",
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
  "device_ref": "sandbox-10483"
}
```

```json
{
  "challenge_id": "93a3e7c7-805a-4485-9d88-9c18b3738c02",
  "expires_at": "2026-10-28T15:36:56.787257452Z",
  "resend_available_at": "2026-10-28T15:31:57.787257452Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "674767",
  "sent_at": "2026-10-28T15:31:56.788770103Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93a3e7c7-805a-4485-9d88-9c18b3738c02",
  "code": "674767",
  "device_ref": "sandbox-10483"
}
```

```json
{
  "session_id": "3538564b-3ab4-413f-8bfa-1242865d5782",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMjQxNiwiaWF0IjoxNzkzMjAxNTE2LCJqdGkiOiJjOGFhMDJkNy1mMjg5LTQ1MGMtOTdiMy0xOGQxOGM1YTMyMWQiLCJzaWQiOiIzNTM4NTY0Yi0zYWI0LTQxM2YtOGJmYS0xMjQyODY1ZDU3ODIifQ.6QXGvK0o6jbBZ255usbISpbTQaPpTFAAKOanIkOXSYM",
  "access_expires_at": "2026-10-28T15:46:56.98169477Z",
  "refresh_token": "5nOz1sCl6Xq2w1W-5eCK-W9Z8yeMsO_kpOwIhMdfCvo",
  "refresh_expires_at": "2026-11-27T15:31:56.981223528Z",
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
  "phone": "+380694867863",
  "device_ref": "sandbox-7631"
}
```

```json
{
  "challenge_id": "b4292182-3293-48b7-b841-b267e267c699",
  "expires_at": "2026-10-28T15:36:57.356539602Z",
  "resend_available_at": "2026-10-28T15:31:58.356539602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380694867863` → **200**

```json
{
  "phone": "+380694867863",
  "audience": "CLIENT",
  "code": "850134",
  "sent_at": "2026-10-28T15:31:57.358243728Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4292182-3293-48b7-b841-b267e267c699",
  "code": "850134",
  "device_ref": "sandbox-7631"
}
```

```json
{
  "session_id": "7bf772fd-19d5-4e66-a63c-1a865b8b1631",
  "subject": {
    "type": "CLIENT",
    "id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGNkMTUyYy0yNzU5LTRlNDgtYmYyYi00Y2JiZjYyODM3MjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAyNDE3LCJpYXQiOjE3OTMyMDE1MTcsImp0aSI6Ijg4NWJlNWFjLWIwNjktNDYxOC1iMzE5LWU1NjQxMTk0ZjIwNCIsInNpZCI6IjdiZjc3MmZkLTE5ZDUtNGU2Ni1hNjNjLTFhODY1YjhiMTYzMSJ9.sBM-ivOqs5GEALOn-7a_BfLJsqEsF1RzOrjpeHv8v-I",
  "access_expires_at": "2026-10-28T15:46:57.554576486Z",
  "refresh_token": "H1WIW4NbWdVj7wn9NgmWPSdK80EtFHNpsEs-RJEFiKA",
  "refresh_expires_at": "2026-11-27T15:31:57.554140762Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "173a2a34-eda7-4215-b575-1203e4b60200",
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
  "id": "42ae3c82-cc7d-4eb4-b89f-fda32e01e349",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:36:57.746579Z",
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
  "command_id": "1919b081-5112-4642-b2e2-f66832249424",
  "quote_id": "42ae3c82-cc7d-4eb4-b89f-fda32e01e349",
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
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
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
  "blizz_dispatch_excluded_total": 6,
  "blizz_sms_sent_total": 63
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 14
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 6.969619385
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 1.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 15
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.077351677
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
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 56.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/348ede65-bb95-45d9-90f0-c31bec4d3f30` → **200**

```json
{
  "id": "348ede65-bb95-45d9-90f0-c31bec4d3f30",
  "short_number": 24,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d4cd152c-2759-4e48-bf2b-4cbbf6283725",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-28T15:31:57.937207Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```
