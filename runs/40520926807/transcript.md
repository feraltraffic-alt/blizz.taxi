# Sandbox transcript (2026-10-27T14:26:03Z, 66a68a9)

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
  "device_ref": "sandbox-4223"
}
```

```json
{
  "challenge_id": "8abe84ac-2534-4abd-b6e0-ab46938aae1d",
  "expires_at": "2026-10-27T14:31:03.338286915Z",
  "resend_available_at": "2026-10-27T14:26:04.338286915Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "144153",
  "sent_at": "2026-10-27T14:26:03.345700229Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8abe84ac-2534-4abd-b6e0-ab46938aae1d",
  "code": "144153",
  "device_ref": "sandbox-4223"
}
```

```json
{
  "session_id": "f2951f8c-532b-419c-9287-bc521a5a6c10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjA2MywiaWF0IjoxNzkzMTExMTYzLCJqdGkiOiIzZjMyMWU3YS1lNWZhLTQ0ZDktODI1Mi1hYTVhNmFmMjRiMjAiLCJzaWQiOiJmMjk1MWY4Yy01MzJiLTQxOWMtOTI4Ny1iYzUyMWE1YTZjMTAifQ.ovFlrCAU-UFxQBxq4kjlKqIeX5XRoTlVIyizl9U9KUs",
  "access_expires_at": "2026-10-27T14:41:03.451914566Z",
  "refresh_token": "2_ZRzBw4PbfPVlgEpLjLgZa5846_cREfJQwCDGvDi4U",
  "refresh_expires_at": "2026-11-26T14:26:03.448907071Z",
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
  "command_id": "fb6a9ff3-1242-4406-a24b-9d247fb6a55c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:26:03Z",
    "sequence": 1793111163592
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faf192f6-b025-4926-bce8-014ca121e5e1",
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
  "last_heartbeat_at": "2026-10-27T14:26:03.700405Z",
  "last_location_at": "2026-10-27T14:26:03.700405Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675664655",
  "device_ref": "sandbox-1966"
}
```

```json
{
  "challenge_id": "1bdbc459-8eb7-46ea-9480-c593ef754403",
  "expires_at": "2026-10-27T14:31:03.742800595Z",
  "resend_available_at": "2026-10-27T14:26:04.742800595Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675664655` → **200**

```json
{
  "phone": "+380675664655",
  "audience": "CLIENT",
  "code": "036814",
  "sent_at": "2026-10-27T14:26:03.746794821Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bdbc459-8eb7-46ea-9480-c593ef754403",
  "code": "036814",
  "device_ref": "sandbox-1966"
}
```

```json
{
  "session_id": "18975271-1d90-446d-8bd0-f520fe526caa",
  "subject": {
    "type": "CLIENT",
    "id": "c605b819-5d3b-45ad-a06d-fe3a3fba2d46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNjA1YjgxOS01ZDNiLTQ1YWQtYTA2ZC1mZTNhM2ZiYTJkNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyMDYzLCJpYXQiOjE3OTMxMTExNjMsImp0aSI6ImNlY2UwMTg5LTAyYjMtNGNiZS1hYWY2LTcwMzg3NTI2NjRhMCIsInNpZCI6IjE4OTc1MjcxLTFkOTAtNDQ2ZC04YmQwLWY1MjBmZTUyNmNhYSJ9.A3gPGS9qFJgLjVMLE3DVVZku0IB6YFktF_MGtaINcIc",
  "access_expires_at": "2026-10-27T14:41:03.808333035Z",
  "refresh_token": "e6ydE14TYNug2NtKphaVQ3-uPcB5DJzeXhKCeAfPHiw",
  "refresh_expires_at": "2026-11-26T14:26:03.807168157Z",
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
  "command_id": "0fc2eb1d-8503-4556-bbcb-a8486570ddeb",
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
  "id": "942a192d-5800-4583-9c60-595d710a5279",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:31:03.905719Z",
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

## Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)

`POST /api/driver/v1/push-devices` → **201**

```json
{
  "command_id": "5f023bb0-e91e-4a0f-bb68-8de68c1588a2",
  "platform": "ANDROID",
  "token": "sandbox-driver-d631042d-06c4-4829-bb4e-8b4a77448b5e"
}
```

```json
{
  "id": "71dc418c-485a-41b4-b034-5904a526e113",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T14:26:03.976861Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "9ec69333-fdeb-46f7-9942-dc2042b8402e",
  "platform": "ANDROID",
  "token": "sandbox-rider-3f42e1b4-5b6b-430d-9165-eeb602f152f5"
}
```

```json
{
  "id": "ae357187-f422-43fe-adb3-50ef249d59bd",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T14:26:04.016885Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9b534f27-0d93-4f5a-9604-0be3ac0c5273",
  "quote_id": "942a192d-5800-4583-9c60-595d710a5279",
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
  "id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c605b819-5d3b-45ad-a06d-fe3a3fba2d46",
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
  "created_at": "2026-10-27T14:26:04.106626Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ce4111ea-3e64-4cca-8a46-3b9d000b8284",
    "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
    "expires_at": "2026-10-27T14:26:19.118607Z",
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

`POST /api/driver/v1/offers/ce4111ea-3e64-4cca-8a46-3b9d000b8284/accept` → **200**

```json
{
  "command_id": "7537f356-ab09-42f9-b692-ff174b1871f5"
}
```

```json
{
  "id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T14:26:04.377Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T14:26:04.377Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T14:26:04.377Z` → **200**

```json
[
  {
    "at": "2026-10-27T14:26:05.557473346Z",
    "token_suffix": "448b5e",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
      "order_version": "2",
      "event_id": "b851683f-e899-44c9-a9e1-e378216dace8",
      "event_type": "OfferMade",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675664655&after=2026-10-27T14:26:04.377Z` → **200**

```json
[
  {
    "at": "2026-10-27T14:26:05.555257467Z",
    "token_suffix": "f152f5",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
      "order_version": "3",
      "event_id": "3ed81d9b-0341-46f1-bf42-74952ba90cfa",
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/4db2afff-d81a-4c0f-9d09-7352609f21d8/messages` → **201**

```json
{
  "command_id": "12975e49-2bbb-4023-b120-b327a67f0c24",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "94759803-7c9a-4353-ac62-580fb3efed77",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:26:06.388816059Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "assignment_id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
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

`POST /api/driver/v1/trips/0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813/messages` → **201**

```json
{
  "command_id": "da8da1ba-2029-4940-9cf9-099c181fdb1f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "66bd0f36-9e28-4096-a2fa-1e80987f4e53",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:26:06.45501989Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/4db2afff-d81a-4c0f-9d09-7352609f21d8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675664655"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/faf192f6-b025-4926-bce8-014ca121e5e1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:26:06Z",
    "sequence": 1793111166535
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faf192f6-b025-4926-bce8-014ca121e5e1",
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
  "last_heartbeat_at": "2026-10-27T14:26:06.557278Z",
  "last_location_at": "2026-10-27T14:26:06.557278Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "assignment_id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
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

`POST /api/driver/v1/trips/0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813/arrive` → **200**

```json
{
  "command_id": "cbf6e00e-0528-47ab-8e88-518e50f8c623",
  "expected_version": 0
}
```

```json
{
  "id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "assignment_id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
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
  "arrived_at": "2026-10-27T14:26:06.6295Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813/start` → **200**

```json
{
  "command_id": "58622a80-5e12-4420-aae3-6ed62c08fe01",
  "expected_version": 1
}
```

```json
{
  "id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "assignment_id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
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
  "arrived_at": "2026-10-27T14:26:06.6295Z",
  "started_at": "2026-10-27T14:26:06.670475Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/faf192f6-b025-4926-bce8-014ca121e5e1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:26:06Z",
    "sequence": 1793111166699
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "faf192f6-b025-4926-bce8-014ca121e5e1",
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
  "last_heartbeat_at": "2026-10-27T14:26:06.719317Z",
  "last_location_at": "2026-10-27T14:26:06.719317Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813/complete` → **200**

```json
{
  "command_id": "da42bb10-f8a1-4ed3-9432-281bcd55b7b5",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:26:06Z",
  "cash_received": true
}
```

```json
{
  "id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
  "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "assignment_id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
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
  "arrived_at": "2026-10-27T14:26:06.6295Z",
  "started_at": "2026-10-27T14:26:06.670475Z",
  "completed_at": "2026-10-27T14:26:06.770536Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/4db2afff-d81a-4c0f-9d09-7352609f21d8` → **200**

```json
{
  "id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
  "short_number": 1,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c605b819-5d3b-45ad-a06d-fe3a3fba2d46",
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
    "id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116",
    "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:26:04.106626Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
    "short_number": 1,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:26:04.106626Z",
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
    "id": "0aaaaf4f-7972-4f1a-8a44-2fe6bb07c813",
    "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
    "order_short_number": 1,
    "created_at": "2026-10-27T14:26:04.219948Z",
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
  "correlation_id": "59a3a319-ce87-4664-9098-5f4590bffbc8"
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
  "session_id": "e66c7735-1584-4c3a-9130-1fd433f83128",
  "subject": {
    "type": "STAFF",
    "id": "43bcbf79-2f2c-4d1a-b1eb-c810e375d87f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2JjYmY3OS0yZjJjLTRkMWEtYjFlYi1jODEwZTM3NWQ4N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTIwNzAsImlhdCI6MTc5MzExMTE3MCwianRpIjoiZTkxODE3MzMtOTI3Zi00OTU4LTliNGUtYTAyMWNlMzAzZDBlIiwic2lkIjoiZTY2Yzc3MzUtMTU4NC00YzNhLTkxMzAtMWZkNDMzZjgzMTI4In0.joQmATM8h3nbPJrvXTEPCpvdMa_NTSosJQQqRy8_b1A",
  "access_expires_at": "2026-10-27T14:41:10.607110584Z",
  "refresh_token": "Mkyc0WOlnxy4cgq2SsQVsCb1yx4y56HzX7VE46KIESw",
  "refresh_expires_at": "2026-10-28T02:26:10.606244481Z",
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
  "session_id": "e7194b53-d304-46ba-bb19-dd6fc4188b91",
  "subject": {
    "type": "STAFF",
    "id": "43bcbf79-2f2c-4d1a-b1eb-c810e375d87f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2JjYmY3OS0yZjJjLTRkMWEtYjFlYi1jODEwZTM3NWQ4N2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTIwNzEsImlhdCI6MTc5MzExMTE3MSwianRpIjoiNTgwYWIxODEtMzRhYi00MDE3LTk5ZmMtZjRjMzg2MmViODljIiwic2lkIjoiZTcxOTRiNTMtZDMwNC00NmJhLWJiMTktZGQ2ZmM0MTg4YjkxIn0.SDtovuQ9FskGI5m8HbbmAakAWIkhLVNeOVGJBLGcQQ0",
  "access_expires_at": "2026-10-27T14:41:11.850188485Z",
  "refresh_token": "izTD_0R8bPHYtY4dr-v5lFyS5zlzt2NOoMbs0ttfTPQ",
  "refresh_expires_at": "2026-10-28T02:26:11.849210794Z",
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
  "session_id": "de661ed1-820b-4b70-bede-b4219b3eacdd",
  "subject": {
    "type": "STAFF",
    "id": "43bcbf79-2f2c-4d1a-b1eb-c810e375d87f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2JjYmY3OS0yZjJjLTRkMWEtYjFlYi1jODEwZTM3NWQ4N2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTIwNzIsImlhdCI6MTc5MzExMTE3MiwianRpIjoiMTBiMzdlMjAtMWQ4YS00YzEzLTg2YTEtNWRkZjdkYmE4YTRhIiwic2lkIjoiZGU2NjFlZDEtODIwYi00YjcwLWJlZGUtYjQyMTliM2VhY2RkIn0.sZhlpkOemBunIou2K6zH6dRERL89ZS15q-v0mLQzLDo",
  "access_expires_at": "2026-10-27T14:41:12.175515918Z",
  "refresh_token": "XiAmMtYGFez620H0jqFdvWZ7u54w6XVT6_f0wSHmZi8",
  "refresh_expires_at": "2026-10-28T02:26:12.174564075Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4db2afff-d81a-4c0f-9d09-7352609f21d8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:26:04.10878Z",
      "actor": {
        "type": "CLIENT",
        "id": "c605b819-5d3b-45ad-a06d-fe3a3fba2d46",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
        "quote_id": "942a192d-5800-4583-9c60-595d710a5279",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:26:04.115509Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
        "attempt_id": "6dcb66fc-7568-45ee-a75b-a34f8eb5e0c9",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:26:04.130915Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ce4111ea-3e64-4cca-8a46-3b9d000b8284",
        "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:26:04.224065Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ce4111ea-3e64-4cca-8a46-3b9d000b8284",
        "order_id": "4db2afff-d81a-4c0f-9d09-7352609f21d8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e22602c5-8bdf-429d-9f5c-a9f2238bb116"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 4db2afff-d81a-4c0f-9d09-7352609f21d8.
