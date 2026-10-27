# Sandbox transcript (2026-10-27T12:41:39Z, a63b923)

# Scenario: terminal-ride

## The admin marks that Andrii has an own card terminal

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
  "correlation_id": "1bb955e5-61df-4c7b-bcda-b1f8fa32085f"
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
  "session_id": "1f5dee60-9a45-4ea9-9859-5bc12e7157aa",
  "subject": {
    "type": "STAFF",
    "id": "4d414699-ad13-483e-92e4-6b5ff3ed3427"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDQxNDY5OS1hZDEzLTQ4M2UtOTJlNC02YjVmZjNlZDM0MjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDU4MDAsImlhdCI6MTc5MzEwNDkwMCwianRpIjoiNDdjNmFkNTctY2M0OS00NDg3LWI4MWItZjc0ZTk2ZWY5Y2VhIiwic2lkIjoiMWY1ZGVlNjAtOWE0NS00ZWE5LTk4NTktNWJjMTJlNzE1N2FhIn0.XjpEl1edKx7r9X9jInF9UasmBTskrAql6Z4a2cny9W4",
  "access_expires_at": "2026-10-27T12:56:40.558611435Z",
  "refresh_token": "MVqwA31JgQliR9oFeI585hVvgO2ugRGwZCBdJrev6Oc",
  "refresh_expires_at": "2026-10-28T00:41:40.556483074Z",
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
  "session_id": "698a295c-d0b2-49d4-aacd-b65026b154ac",
  "subject": {
    "type": "STAFF",
    "id": "4d414699-ad13-483e-92e4-6b5ff3ed3427"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDQxNDY5OS1hZDEzLTQ4M2UtOTJlNC02YjVmZjNlZDM0MjciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDU4MDEsImlhdCI6MTc5MzEwNDkwMSwianRpIjoiOTFkOTZmYjItZTBhOS00ZDZiLTliNzgtMjI2MjE5MzE5NDI3Iiwic2lkIjoiNjk4YTI5NWMtZDBiMi00OWQ0LWFhY2QtYjY1MDI2YjE1NGFjIn0.EKkqSnQkHa0bSqUXt3rAJupQfR0FsN-vfeLzAr3Dxa0",
  "access_expires_at": "2026-10-27T12:56:41.854085419Z",
  "refresh_token": "cdQ87XTFlHVV6Y-lC9tneNZpzibtIwNZ6Gtsfiwofbc",
  "refresh_expires_at": "2026-10-28T00:41:41.852899009Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8625"
}
```

```json
{
  "challenge_id": "fc49a166-c032-441b-9b16-240b3035fad2",
  "expires_at": "2026-10-27T12:46:41.89166797Z",
  "resend_available_at": "2026-10-27T12:41:42.89166797Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "207592",
  "sent_at": "2026-10-27T12:41:41.898151875Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc49a166-c032-441b-9b16-240b3035fad2",
  "code": "207592",
  "device_ref": "sandbox-8625"
}
```

```json
{
  "session_id": "18418de3-855d-4d89-a835-f4de1c5764a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNTgwMSwiaWF0IjoxNzkzMTA0OTAxLCJqdGkiOiIyNTlkYTRkMS1mMTRmLTRlYTUtYmQyNy04MWRlOTA2MzkyMTgiLCJzaWQiOiIxODQxOGRlMy04NTVkLTRkODktYTgzNS1mNGRlMWM1NzY0YTkifQ.y_jawOU14PL9moG6eJTia0aig8Tv2louzQY-7Bi5umo",
  "access_expires_at": "2026-10-27T12:56:41.987594989Z",
  "refresh_token": "qm5EC4xgEFRcaEly37axanrFVBcYZ5kIfbhPaKGVpJU",
  "refresh_expires_at": "2026-11-26T12:41:41.986392559Z",
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
  "version": 1,
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
    "version": 1,
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
  "command_id": "00e0c967-565f-477f-9eb6-64aa218b60c5",
  "expected_version": 1,
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
  "version": 2,
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
  "device_ref": "sandbox-12440"
}
```

```json
{
  "challenge_id": "45ee84c1-ddf6-447f-90f3-51a76e1270e8",
  "expires_at": "2026-10-27T12:46:42.168955458Z",
  "resend_available_at": "2026-10-27T12:41:43.168955458Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "054920",
  "sent_at": "2026-10-27T12:41:42.172988714Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45ee84c1-ddf6-447f-90f3-51a76e1270e8",
  "code": "054920",
  "device_ref": "sandbox-12440"
}
```

```json
{
  "session_id": "e1daafeb-a5e7-4940-8dc8-a30999384a96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNTgwMiwiaWF0IjoxNzkzMTA0OTAyLCJqdGkiOiI1Mzc0ZjA1OC03YzRjLTQyN2UtODY1MC1kNTQyM2EyMzMxNmIiLCJzaWQiOiJlMWRhYWZlYi1hNWU3LTQ5NDAtOGRjOC1hMzA5OTkzODRhOTYifQ.WLuWlUXHYeRHNefKjTyBAEO0TVr0FV8qQKMQIldPlFk",
  "access_expires_at": "2026-10-27T12:56:42.233094272Z",
  "refresh_token": "2sfKHXBKt3bW7PyOjLTm50cXs3xtzT8xO7x85NS0e3Y",
  "refresh_expires_at": "2026-11-26T12:41:42.232004602Z",
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
  "command_id": "8981e0e3-d707-43fb-8276-5e80c07bfb56",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:41:42Z",
    "sequence": 1793104902294
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "caf12d5d-de73-4614-8166-8b1587966dc4",
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
  "last_heartbeat_at": "2026-10-27T12:41:42.398865Z",
  "last_location_at": "2026-10-27T12:41:42.398865Z",
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
  "command_id": "69e1ec48-bbd0-4515-8235-ff9d6d0d1bb0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:41:42Z",
    "sequence": 1793104902482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "992f1e58-f4e0-4380-bc41-aaa4e5cd39a6",
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
  "last_heartbeat_at": "2026-10-27T12:41:42.502301Z",
  "last_location_at": "2026-10-27T12:41:42.502301Z",
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
  "session_id": "73c373a6-585a-4830-8baa-785f5577d489",
  "subject": {
    "type": "STAFF",
    "id": "4d414699-ad13-483e-92e4-6b5ff3ed3427"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZDQxNDY5OS1hZDEzLTQ4M2UtOTJlNC02YjVmZjNlZDM0MjciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDU4MDIsImlhdCI6MTc5MzEwNDkwMiwianRpIjoiNGY4MzliNDUtNzMxZC00M2ViLTljNDItYTQ0NDBhNzEzNTEzIiwic2lkIjoiNzNjMzczYTYtNTg1YS00ODMwLThiYWEtNzg1ZjU1NzdkNDg5In0.qkfGgrQJrmJq_vt48_J6OUtttQFsFr8OcgjXm1tuqjg",
  "access_expires_at": "2026-10-27T12:56:42.850881227Z",
  "refresh_token": "D_dVk7GfyH8hWiO04jkmuouxzMdTIERQEz_tJVCiIWs",
  "refresh_expires_at": "2026-10-28T00:41:42.849721677Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3f9cdc7c-c070-4ae2-8965-9da5edc44536",
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
  "id": "b442cd23-9283-46d9-9f21-c4041c3cc05f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T12:46:42.918102Z",
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
  "command_id": "209020e3-f715-48b3-a148-52e34a30a3f4",
  "quote_id": "b442cd23-9283-46d9-9f21-c4041c3cc05f",
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
  "id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "short_number": 1,
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
  "created_at": "2026-10-27T12:41:43.038652Z",
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
    "id": "87f528e0-be69-40c3-942f-9b78da2f8a9b",
    "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
    "expires_at": "2026-10-27T12:41:58.052153Z",
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

`POST /api/driver/v1/offers/87f528e0-be69-40c3-942f-9b78da2f8a9b/accept` → **200**

```json
{
  "command_id": "13c380ea-00b3-43a9-9f59-1dc267e3a8c6"
}
```

```json
{
  "id": "549d8850-7d3e-467d-bf0c-3c0cf597a8a5",
  "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f186ec37-5089-4104-9137-cbb2b1d1fc71",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f186ec37-5089-4104-9137-cbb2b1d1fc71",
  "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "assignment_id": "549d8850-7d3e-467d-bf0c-3c0cf597a8a5",
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
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/992f1e58-f4e0-4380-bc41-aaa4e5cd39a6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:41:43Z",
    "sequence": 1793104903270
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "992f1e58-f4e0-4380-bc41-aaa4e5cd39a6",
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
  "last_heartbeat_at": "2026-10-27T12:41:43.295339Z",
  "last_location_at": "2026-10-27T12:41:43.295339Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f186ec37-5089-4104-9137-cbb2b1d1fc71/arrive` → **200**

```json
{
  "command_id": "596b296f-c6c1-4ea2-bc5a-a94cdab55066",
  "expected_version": 0
}
```

```json
{
  "id": "f186ec37-5089-4104-9137-cbb2b1d1fc71",
  "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "assignment_id": "549d8850-7d3e-467d-bf0c-3c0cf597a8a5",
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
  "arrived_at": "2026-10-27T12:41:43.350997Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/f186ec37-5089-4104-9137-cbb2b1d1fc71/start` → **200**

```json
{
  "command_id": "d9504833-7a91-4830-a379-3bdc520d0a16",
  "expected_version": 1
}
```

```json
{
  "id": "f186ec37-5089-4104-9137-cbb2b1d1fc71",
  "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "assignment_id": "549d8850-7d3e-467d-bf0c-3c0cf597a8a5",
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
  "arrived_at": "2026-10-27T12:41:43.350997Z",
  "started_at": "2026-10-27T12:41:43.401533Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/f186ec37-5089-4104-9137-cbb2b1d1fc71/complete` → **200**

```json
{
  "command_id": "a4d16c60-3303-4b77-aebf-ba66c6795ee7",
  "expected_version": 2,
  "reported_at": "2026-10-27T12:41:43Z",
  "cash_received": true
}
```

```json
{
  "id": "f186ec37-5089-4104-9137-cbb2b1d1fc71",
  "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "assignment_id": "549d8850-7d3e-467d-bf0c-3c0cf597a8a5",
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
  "arrived_at": "2026-10-27T12:41:43.350997Z",
  "started_at": "2026-10-27T12:41:43.401533Z",
  "completed_at": "2026-10-27T12:41:43.45782Z",
  "needs_review": false
}
```

`GET /api/operator/v1/orders/fc60e390-26b0-4db9-ae13-291441dcff27` → **200**

```json
{
  "id": "fc60e390-26b0-4db9-ae13-291441dcff27",
  "short_number": 1,
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
    "id": "549d8850-7d3e-467d-bf0c-3c0cf597a8a5",
    "order_id": "fc60e390-26b0-4db9-ae13-291441dcff27",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "f186ec37-5089-4104-9137-cbb2b1d1fc71",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T12:41:43.038652Z",
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
      "balance_minor": -4495,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

Done: terminal order fc60e390-26b0-4db9-ae13-291441dcff27 by Andrii (5a000000-0000-4000-8000-000000000403).
