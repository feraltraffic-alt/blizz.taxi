# Sandbox transcript (2026-10-27T09:06:02Z, 6fc161d)

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
  "device_ref": "sandbox-10248"
}
```

```json
{
  "challenge_id": "1a548569-c7dd-49da-8f6e-07c1cebc4ee5",
  "expires_at": "2026-10-27T09:11:02.940151424Z",
  "resend_available_at": "2026-10-27T09:07:02.940151424Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "800269",
  "sent_at": "2026-10-27T09:06:02.946963888Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a548569-c7dd-49da-8f6e-07c1cebc4ee5",
  "code": "800269",
  "device_ref": "sandbox-10248"
}
```

```json
{
  "session_id": "744d2a7a-7899-491c-95b9-98820de93a13",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5Mjg2MywiaWF0IjoxNzkzMDkxOTYzLCJqdGkiOiI3ODM1NTg0MC05NjY2LTQwYTMtOGFkNy1lOWZlM2FjZTA4N2YiLCJzaWQiOiI3NDRkMmE3YS03ODk5LTQ5MWMtOTViOS05ODgyMGRlOTNhMTMifQ.Xu1xasvVh4KZwHwt2GVMN5L_1STtBf2rvzIe5Hn_ifg",
  "access_expires_at": "2026-10-27T09:21:03.03619209Z",
  "refresh_token": "ukRUnIQCo9OSPoW0-iX3YX763nxRK8fMGZDENhcHy3g",
  "refresh_expires_at": "2026-11-26T09:06:03.033605992Z",
  "account_created": false
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "2fc5429d-fd3d-4dc6-ad0d-71d22e7b8d47",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:06:03Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02158e33-f870-4076-bade-5e4bd98301cd",
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
  "last_heartbeat_at": "2026-10-27T09:06:03.242729Z",
  "last_location_at": "2026-10-27T09:06:03.242729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679958074",
  "device_ref": "sandbox-16055"
}
```

```json
{
  "challenge_id": "fe0dc10f-79d7-46e1-a95e-1618905fc4e0",
  "expires_at": "2026-10-27T09:11:03.290337828Z",
  "resend_available_at": "2026-10-27T09:07:03.290337828Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679958074` → **200**

```json
{
  "phone": "+380679958074",
  "audience": "CLIENT",
  "code": "045841",
  "sent_at": "2026-10-27T09:06:03.294409399Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe0dc10f-79d7-46e1-a95e-1618905fc4e0",
  "code": "045841",
  "device_ref": "sandbox-16055"
}
```

```json
{
  "session_id": "5891f2be-e727-4400-9ea9-28a2b6762497",
  "subject": {
    "type": "CLIENT",
    "id": "65c9c50a-bfe4-4d11-843e-4a0f49ec8e27"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NWM5YzUwYS1iZmU0LTRkMTEtODQzZS00YTBmNDllYzhlMjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkyODYzLCJpYXQiOjE3OTMwOTE5NjMsImp0aSI6IjY5MDczYWQ1LWMwNGMtNGMzYy04ZTlhLWY1MGVjMWE5ODRhMSIsInNpZCI6IjU4OTFmMmJlLWU3MjctNDQwMC05ZWE5LTI4YTJiNjc2MjQ5NyJ9.Ou-K0qdhKXYX-WD5Ic89rKUrZCcajG8xNN5UN2S59tA",
  "access_expires_at": "2026-10-27T09:21:03.351948134Z",
  "refresh_token": "9RDt4qH8FyfWdKjmRfMu433A2PKf1whO4kzKE8pGZvY",
  "refresh_expires_at": "2026-11-26T09:06:03.35096831Z",
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
  "command_id": "a331372d-a9fa-457d-b3c3-4eb9d14c1a5f",
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
  "id": "d784b9f5-b44d-455d-b274-0e78cd037264",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T09:11:03.452078Z",
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

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "45e6c7ad-fa8d-4ff5-a368-686fdc2ef895",
  "quote_id": "d784b9f5-b44d-455d-b274-0e78cd037264",
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
  "id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "65c9c50a-bfe4-4d11-843e-4a0f49ec8e27",
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
  "created_at": "2026-10-27T09:06:03.557809Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "80cde47e-36c9-4ede-941e-a8fbcdeb4d60",
    "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
    "expires_at": "2026-10-27T09:06:18.568214Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/80cde47e-36c9-4ede-941e-a8fbcdeb4d60/accept` → **200**

```json
{
  "command_id": "61104b79-e16f-4e40-949b-fcdbd9f03a66"
}
```

```json
{
  "id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e/messages` → **201**

```json
{
  "command_id": "2e5ca956-3cb1-4fe4-8951-ca325926c2de",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c8a9ae38-499f-47e0-b060-488cb501c58a",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T09:06:03.716456918Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "assignment_id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
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
  "needs_review": false
}
```

`POST /api/driver/v1/trips/7c2b5670-f8c3-4518-aafa-badb1b846215/messages` → **201**

```json
{
  "command_id": "4161b7a6-ead0-4e99-a0e0-2409dc455d77",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "1ff12235-d55c-4be4-b918-1c6efe9aa5de",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T09:06:03.782544642Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/7c2b5670-f8c3-4518-aafa-badb1b846215/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679958074"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/02158e33-f870-4076-bade-5e4bd98301cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:06:03Z",
    "sequence": 2
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02158e33-f870-4076-bade-5e4bd98301cd",
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
  "last_heartbeat_at": "2026-10-27T09:06:03.883538Z",
  "last_location_at": "2026-10-27T09:06:03.883538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "assignment_id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
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
  "needs_review": false
}
```

`POST /api/driver/v1/trips/7c2b5670-f8c3-4518-aafa-badb1b846215/arrive` → **200**

```json
{
  "command_id": "ed5c057d-4c1f-410b-b220-3004326f14cd",
  "expected_version": 0
}
```

```json
{
  "id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "assignment_id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
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
  "arrived_at": "2026-10-27T09:06:03.953585Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/7c2b5670-f8c3-4518-aafa-badb1b846215/start` → **200**

```json
{
  "command_id": "6c5c7ac5-778c-4098-9bc8-a597696a64ee",
  "expected_version": 1
}
```

```json
{
  "id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "assignment_id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
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
  "arrived_at": "2026-10-27T09:06:03.953585Z",
  "started_at": "2026-10-27T09:06:03.99575Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/02158e33-f870-4076-bade-5e4bd98301cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:06:04Z",
    "sequence": 3
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "02158e33-f870-4076-bade-5e4bd98301cd",
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
  "last_heartbeat_at": "2026-10-27T09:06:04.044147Z",
  "last_location_at": "2026-10-27T09:06:04.044147Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/7c2b5670-f8c3-4518-aafa-badb1b846215/complete` → **200**

```json
{
  "command_id": "c8b57b2a-333c-4f29-a312-01720a826477",
  "expected_version": 2,
  "reported_at": "2026-10-27T09:06:04Z",
  "cash_received": true
}
```

```json
{
  "id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
  "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "assignment_id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
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
  "arrived_at": "2026-10-27T09:06:03.953585Z",
  "started_at": "2026-10-27T09:06:03.99575Z",
  "completed_at": "2026-10-27T09:06:04.095917Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e` → **200**

```json
{
  "id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "65c9c50a-bfe4-4d11-843e-4a0f49ec8e27",
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
    "id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67",
    "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T09:06:03.557809Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
    "short_number": 1,
    "status": "FULFILLED",
    "created_at": "2026-10-27T09:06:03.557809Z",
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
    "id": "7c2b5670-f8c3-4518-aafa-badb1b846215",
    "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
    "order_short_number": 1,
    "created_at": "2026-10-27T09:06:03.664607Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
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
      "balance_minor": -1578,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

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
  "correlation_id": "6a8eb20e-a47c-4b39-a97f-958690170732"
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
  "session_id": "3ce6267e-d6d9-4f42-be97-a76c1dd6c3d7",
  "subject": {
    "type": "STAFF",
    "id": "badb369f-a8f7-46e6-a7ed-d663bc44a645"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWRiMzY5Zi1hOGY3LTQ2ZTYtYTdlZC1kNjYzYmM0NGE2NDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI4NjcsImlhdCI6MTc5MzA5MTk2NywianRpIjoiZDUwYjE0YmUtYzZjYS00MWY4LWFiZDAtYTg2YTliMjBlOThhIiwic2lkIjoiM2NlNjI2N2UtZDZkOS00ZjQyLWJlOTctYTc2YzFkZDZjM2Q3In0.bHbrAOFpBTo-bj9vfl-_meARfGU6lJhDnQc41PqAthU",
  "access_expires_at": "2026-10-27T09:21:07.902752138Z",
  "refresh_token": "l_D8IhsJ0nhRhsYyskJI6zYcJlkRZpAgEo71fAoH2kg",
  "refresh_expires_at": "2026-10-27T21:06:07.901642626Z",
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
  "session_id": "8e925cae-00c7-4ac5-9569-04cedd464c61",
  "subject": {
    "type": "STAFF",
    "id": "badb369f-a8f7-46e6-a7ed-d663bc44a645"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWRiMzY5Zi1hOGY3LTQ2ZTYtYTdlZC1kNjYzYmM0NGE2NDUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI4NjksImlhdCI6MTc5MzA5MTk2OSwianRpIjoiMzYzYTNiNWQtNjU3OC00MzJiLTg0MDEtMTVjZDA2ODZhM2RkIiwic2lkIjoiOGU5MjVjYWUtMDBjNy00YWM1LTk1NjktMDRjZWRkNDY0YzYxIn0.BJYGFh4yeyYB2JPnBFa6pvsXnIcuRjnwn5glVTNrfiQ",
  "access_expires_at": "2026-10-27T09:21:09.137556527Z",
  "refresh_token": "_61sQKTbt1u3f4TfUWIsU618D_-fx6kez4hz9V1OxMQ",
  "refresh_expires_at": "2026-10-27T21:06:09.13652217Z",
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
  "session_id": "9a5b09d2-821c-4957-95d8-d0597688d131",
  "subject": {
    "type": "STAFF",
    "id": "badb369f-a8f7-46e6-a7ed-d663bc44a645"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYWRiMzY5Zi1hOGY3LTQ2ZTYtYTdlZC1kNjYzYmM0NGE2NDUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI4NjksImlhdCI6MTc5MzA5MTk2OSwianRpIjoiNGU2ZTA1N2QtMDEzOS00NzgyLTg3YzAtYWRkNjViODVkNjQ2Iiwic2lkIjoiOWE1YjA5ZDItODIxYy00OTU3LTk1ZDgtZDA1OTc2ODhkMTMxIn0.4hMzH3DkocCvMLweTcZj9YeKDQ8cGSOhxnhVWCBW82Q",
  "access_expires_at": "2026-10-27T09:21:09.463910318Z",
  "refresh_token": "3v5-lVjH7AsQTD-9K2XOpeNjhhiZq8kuGQrCM-g5HOQ",
  "refresh_expires_at": "2026-10-27T21:06:09.462853672Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:06:03.560602Z",
      "actor": {
        "type": "CLIENT",
        "id": "65c9c50a-bfe4-4d11-843e-4a0f49ec8e27",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
        "quote_id": "d784b9f5-b44d-455d-b274-0e78cd037264",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:06:03.565994Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
        "attempt_id": "edb22e83-d167-4708-8de7-3976a185e9f4",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:06:03.578207Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "80cde47e-36c9-4ede-941e-a8fbcdeb4d60",
        "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:06:03.669103Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "80cde47e-36c9-4ede-941e-a8fbcdeb4d60",
        "order_id": "655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "23146d2b-b70f-41cc-bc16-bc0a2e4ffc67"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 655adbf8-0a03-4cde-8ac2-38d5d7ca0c8e.
