# Sandbox transcript (2026-10-27T09:25:03Z, 8a90556)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635509139",
  "device_ref": "sandbox-25969"
}
```

```json
{
  "challenge_id": "6f7f578a-d640-4b26-ab42-7361272e4caf",
  "expires_at": "2026-10-27T09:30:03.402440084Z",
  "resend_available_at": "2026-10-27T09:25:04.402440084Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635509139` → **200**

```json
{
  "phone": "+380635509139",
  "audience": "CLIENT",
  "code": "996710",
  "sent_at": "2026-10-27T09:25:03.410025683Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f7f578a-d640-4b26-ab42-7361272e4caf",
  "code": "996710",
  "device_ref": "sandbox-25969"
}
```

```json
{
  "session_id": "779649a5-da80-4b12-a7c9-b457ebef6a65",
  "subject": {
    "type": "CLIENT",
    "id": "389d3566-6829-4d75-9b1f-c765ba66791b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzODlkMzU2Ni02ODI5LTRkNzUtOWIxZi1jNzY1YmE2Njc5MWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MDAzLCJpYXQiOjE3OTMwOTMxMDMsImp0aSI6IjZlNGIzZWUzLTQwMmYtNGQ0ZS05MWM2LWVhZWRjMjZlZTdjMyIsInNpZCI6Ijc3OTY0OWE1LWRhODAtNGIxMi1hN2M5LWI0NTdlYmVmNmE2NSJ9.9d33nmwRK-SHhmTKkFNACHHHR5_oK0uEW6dXN4KnDoQ",
  "access_expires_at": "2026-10-27T09:40:03.5055367Z",
  "refresh_token": "pnu00xPOJwpFGcsmLSyOCdrb4hRfn0t3W5p_A_Fs8J4",
  "refresh_expires_at": "2026-11-26T09:25:03.502415145Z",
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
  "device_ref": "sandbox-21183"
}
```

```json
{
  "challenge_id": "ba064819-2fda-4718-8a24-9831687047b4",
  "expires_at": "2026-10-27T09:30:03.63554807Z",
  "resend_available_at": "2026-10-27T09:25:04.63554807Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "087012",
  "sent_at": "2026-10-27T09:25:03.639850002Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba064819-2fda-4718-8a24-9831687047b4",
  "code": "087012",
  "device_ref": "sandbox-21183"
}
```

```json
{
  "session_id": "ed644be3-6a4b-4388-8795-93f253be2384",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDAwMywiaWF0IjoxNzkzMDkzMTAzLCJqdGkiOiJhNjM3NmIyZC1hZGJiLTQ5NzEtYjJiZC0yYmRlNWEwYzc5MTIiLCJzaWQiOiJlZDY0NGJlMy02YTRiLTQzODgtODc5NS05M2YyNTNiZTIzODQifQ.sgg-bAQHOkx7U9dPhHef3foMksDJ3Q8t3s9e1HEh3c0",
  "access_expires_at": "2026-10-27T09:40:03.706259035Z",
  "refresh_token": "4AfJXhpoCKBypLygHMCBHIhomr4QwIkqssHWsRjmlVs",
  "refresh_expires_at": "2026-11-26T09:25:03.705131735Z",
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
  "correlation_id": "0005c3e5-2b71-462b-859f-12ab3b2b2a9a"
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
  "session_id": "ea1d672a-f8f7-48d9-aaa5-96e04a70b122",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMDQsImlhdCI6MTc5MzA5MzEwNCwianRpIjoiZmEzMmZmZTgtMzViNS00NzFkLTk5NzktNDE3OWE1NzI4MmRkIiwic2lkIjoiZWExZDY3MmEtZjhmNy00OGQ5LWFhYTUtOTZlMDRhNzBiMTIyIn0.rWIncOzVz3AZw15JRZT6uXVlqEbfxkpZQFziAhCUwV4",
  "access_expires_at": "2026-10-27T09:40:04.415132941Z",
  "refresh_token": "4ctqXnrc2ENrlaxcMw02DCrBOToazIheE2QOV1PNtCs",
  "refresh_expires_at": "2026-10-27T21:25:04.413994096Z",
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
  "session_id": "79b4eaf8-0aa0-4cad-9904-398b96153371",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMDUsImlhdCI6MTc5MzA5MzEwNSwianRpIjoiYjgyNmJmOTgtOGMzNS00MTY0LWI4ODEtNjZlZWQ3NmVjNzE1Iiwic2lkIjoiNzliNGVhZjgtMGFhMC00Y2FkLTk5MDQtMzk4Yjk2MTUzMzcxIn0.DaMp4ctQZ5WG4DtSB0ZU9fV2xUxr4GpjkOBrzoXW_dU",
  "access_expires_at": "2026-10-27T09:40:05.652806722Z",
  "refresh_token": "gQU_y9wDr6JTEM9r2SgH8UUgPv20ZpyhBqFbl8QK1hI",
  "refresh_expires_at": "2026-10-27T21:25:05.651762097Z",
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
  "session_id": "f72ea4c3-4930-4274-bcbe-07e76c835f4c",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMDUsImlhdCI6MTc5MzA5MzEwNSwianRpIjoiNWZkNWI2MjgtZjk0MS00MzE4LTkzOGItNzg0ZDhhNzQzNTdhIiwic2lkIjoiZjcyZWE0YzMtNDkzMC00Mjc0LWJjYmUtMDdlNzZjODM1ZjRjIn0.VmWvECjUHuG8ocHqzYLDRvAg6jR-lVZPJH7PYl4IbtU",
  "access_expires_at": "2026-10-27T09:40:05.981036765Z",
  "refresh_token": "Liert5A9Qq7Z_ndbA1-l7ne33X4b-HmOZ1T3XjidtIE",
  "refresh_expires_at": "2026-10-27T21:25:05.979858944Z",
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
  "command_id": "a8f43cda-826a-412e-b255-144f9c018f8f",
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
  "id": "025d5fe6-addc-4fcc-96a9-73f65e625bde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:30:06.111728Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4210c32c-0b89-45cf-b6c2-e571ab0e2d2b",
  "quote_id": "025d5fe6-addc-4fcc-96a9-73f65e625bde",
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
  "id": "42616330-315d-46f1-a071-e76709c5ed70",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389d3566-6829-4d75-9b1f-c765ba66791b",
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
  "created_at": "2026-10-27T09:25:06.23798Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/42616330-315d-46f1-a071-e76709c5ed70` → **200**

```json
{
  "id": "42616330-315d-46f1-a071-e76709c5ed70",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389d3566-6829-4d75-9b1f-c765ba66791b",
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
  "created_at": "2026-10-27T09:25:06.23798Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/42616330-315d-46f1-a071-e76709c5ed70/cancel` → **200**

```json
{
  "command_id": "0dbd335d-395f-4f7c-80bf-193479ccf1e0",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "42616330-315d-46f1-a071-e76709c5ed70",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "389d3566-6829-4d75-9b1f-c765ba66791b",
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
  "created_at": "2026-10-27T09:25:06.23798Z",
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
  "related_order_id": null
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
  "command_id": "3854b72f-833e-495e-bd69-20572437034f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:06Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "837972ab-c14a-4fbe-9f79-db8f7d2be776",
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
  "last_heartbeat_at": "2026-10-27T09:25:06.47397Z",
  "last_location_at": "2026-10-27T09:25:06.47397Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10180"
}
```

```json
{
  "challenge_id": "5608c8c6-0c3c-4dc0-9571-d31edade47a8",
  "expires_at": "2026-10-27T09:30:06.509631406Z",
  "resend_available_at": "2026-10-27T09:25:07.509631406Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "598601",
  "sent_at": "2026-10-27T09:25:06.513510778Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5608c8c6-0c3c-4dc0-9571-d31edade47a8",
  "code": "598601",
  "device_ref": "sandbox-10180"
}
```

```json
{
  "session_id": "8ab9be36-920f-4325-ba4c-b7edfe9f80af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDAwNiwiaWF0IjoxNzkzMDkzMTA2LCJqdGkiOiI4MjZlZTE3MS02MzMxLTQwZjktYWViMi1mOGMxYjA0ZTY1NGMiLCJzaWQiOiI4YWI5YmUzNi05MjBmLTQzMjUtYmE0Yy1iN2VkZmU5ZjgwYWYifQ.PrLwVdt7k3mApsosK8_rsweVS5S4pNl7yXwYSx9MCLg",
  "access_expires_at": "2026-10-27T09:40:06.568420148Z",
  "refresh_token": "SLrjMpZstTVE8lndYET65TnG0NXaEAnopNUD1MaPR8s",
  "refresh_expires_at": "2026-11-26T09:25:06.567359674Z",
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
  "command_id": "7bc90dd4-6671-479d-ad23-ade12ddb91f0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:06Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eb89667a-85d7-4752-b7d6-5482b0a1798d",
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
  "last_heartbeat_at": "2026-10-27T09:25:06.634823Z",
  "last_location_at": "2026-10-27T09:25:06.634823Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3aaf77f9-28a3-45da-8b7b-39c0f2199f7d",
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
  "id": "74cba1c1-16e4-4bb2-8b1b-fe69530e38c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:30:06.677716Z",
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

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "98b9a83b-147c-4ea2-9ae2-304ca047d2d5",
  "quote_id": "74cba1c1-16e4-4bb2-8b1b-fe69530e38c3",
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
  "id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "389d3566-6829-4d75-9b1f-c765ba66791b",
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
  "created_at": "2026-10-27T09:25:06.717153Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "6409117a-bb0f-49e6-9079-de16ee2a4071",
    "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
    "expires_at": "2026-10-27T09:25:21.722173Z",
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

`POST /api/driver/v1/offers/6409117a-bb0f-49e6-9079-de16ee2a4071/accept` → **200**

```json
{
  "command_id": "6f56cba9-79e0-432e-9512-697f20c40f56"
}
```

```json
{
  "id": "9891b7f1-9a00-4e22-a681-59adedbdd7ae",
  "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "961a98f7-aa1a-4a14-b120-77b3bb98d083",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "961a98f7-aa1a-4a14-b120-77b3bb98d083",
  "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "assignment_id": "9891b7f1-9a00-4e22-a681-59adedbdd7ae",
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
  "needs_review": false
}
```

`POST /api/driver/v1/trips/961a98f7-aa1a-4a14-b120-77b3bb98d083/cancel` → **200**

```json
{
  "command_id": "ec894c65-ab2b-4666-93cd-0211ebbdf981",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "961a98f7-aa1a-4a14-b120-77b3bb98d083",
  "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "assignment_id": "9891b7f1-9a00-4e22-a681-59adedbdd7ae",
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
  "needs_review": false
}
```

`GET /api/rider/v1/orders/8f8b2c47-88ab-46c1-9e0b-192d641f97e3` → **200**

```json
{
  "id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "389d3566-6829-4d75-9b1f-c765ba66791b",
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
    "id": "9891b7f1-9a00-4e22-a681-59adedbdd7ae",
    "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "961a98f7-aa1a-4a14-b120-77b3bb98d083",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T09:25:06.717153Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "58820e7c-5fd6-4b02-8431-8c3a75b818c1",
    "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
    "expires_at": "2026-10-27T09:25:21.896576Z",
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

`POST /api/driver/v1/offers/58820e7c-5fd6-4b02-8431-8c3a75b818c1/accept` → **200**

```json
{
  "command_id": "d2963ec5-3747-4169-b54c-361e91f6753f"
}
```

```json
{
  "id": "01fbe844-1ed0-4215-80ea-596f6907c0e9",
  "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b00d5227-7be5-44a9-80ac-8058cfbb0501",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b00d5227-7be5-44a9-80ac-8058cfbb0501",
  "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "assignment_id": "01fbe844-1ed0-4215-80ea-596f6907c0e9",
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
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b00d5227-7be5-44a9-80ac-8058cfbb0501/cancel` → **200**

```json
{
  "command_id": "d2a6cab4-3050-4963-a87b-4c0c496186bc",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "b00d5227-7be5-44a9-80ac-8058cfbb0501",
  "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
  "assignment_id": "01fbe844-1ed0-4215-80ea-596f6907c0e9",
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
  "needs_review": false
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:25:06.717153Z",
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
    "id": "42616330-315d-46f1-a071-e76709c5ed70",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:25:06.23798Z",
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

`GET /api/operator/v1/orders/8f8b2c47-88ab-46c1-9e0b-192d641f97e3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:25:06.71792Z",
      "actor": {
        "type": "CLIENT",
        "id": "389d3566-6829-4d75-9b1f-c765ba66791b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
        "quote_id": "74cba1c1-16e4-4bb2-8b1b-fe69530e38c3",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:25:06.720751Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
        "attempt_id": "edb130e0-2a35-4f27-b450-3ed0be266b7c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:25:06.729148Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6409117a-bb0f-49e6-9079-de16ee2a4071",
        "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:25:06.808513Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6409117a-bb0f-49e6-9079-de16ee2a4071",
        "order_id": "8f8b2c47-88ab-46c1-9e0b-192d641f97e3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9891b7f1-9a00-4e22-a681-59adedbdd7ae"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 42616330-315d-46f1-a071-e76709c5ed70, 8f8b2c47-88ab-46c1-9e0b-192d641f97e3.

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
  "device_ref": "sandbox-1958"
}
```

```json
{
  "challenge_id": "d5b882f0-784a-4f23-9c76-50ab16c56d98",
  "expires_at": "2026-10-27T09:30:07.203827361Z",
  "resend_available_at": "2026-10-27T09:25:08.203827361Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "966907",
  "sent_at": "2026-10-27T09:25:07.207539905Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5b882f0-784a-4f23-9c76-50ab16c56d98",
  "code": "966907",
  "device_ref": "sandbox-1958"
}
```

```json
{
  "session_id": "fb0c72b9-84c4-4fdc-a177-5fe9492d8937",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDAwNywiaWF0IjoxNzkzMDkzMTA3LCJqdGkiOiJmNWJhOGJhMC0xZWQ2LTRiOGMtYTUyNy0wODhkNGNjNmI4MmEiLCJzaWQiOiJmYjBjNzJiOS04NGM0LTRmZGMtYTE3Ny01ZmU5NDkyZDg5MzcifQ.goR2fP6GZrbo90n_bJiUbPjYZ1i8pRN2rnjMnCU3hKI",
  "access_expires_at": "2026-10-27T09:40:07.264274322Z",
  "refresh_token": "uioBBg-vO74hHVNAPg8zVBGW7eqxa0_LM8Z-NWYNZDY",
  "refresh_expires_at": "2026-11-26T09:25:07.263412894Z",
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
  "command_id": "23e2da45-54aa-4117-857a-6c71a27131cc",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:07Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5db45ed6-0395-4cb7-ae12-44b4edddc32b",
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
  "last_heartbeat_at": "2026-10-27T09:25:07.331356Z",
  "last_location_at": "2026-10-27T09:25:07.331356Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670495292",
  "device_ref": "sandbox-10977"
}
```

```json
{
  "challenge_id": "571d0df9-08ec-4a08-b09d-8cf8ccc7adb6",
  "expires_at": "2026-10-27T09:30:07.368237078Z",
  "resend_available_at": "2026-10-27T09:25:08.368237078Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670495292` → **200**

```json
{
  "phone": "+380670495292",
  "audience": "CLIENT",
  "code": "106055",
  "sent_at": "2026-10-27T09:25:07.373209096Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "571d0df9-08ec-4a08-b09d-8cf8ccc7adb6",
  "code": "106055",
  "device_ref": "sandbox-10977"
}
```

```json
{
  "session_id": "c921696a-527d-469e-a24f-19fb1b96042d",
  "subject": {
    "type": "CLIENT",
    "id": "cfbc025f-695d-491d-abf1-902cd32982e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZmJjMDI1Zi02OTVkLTQ5MWQtYWJmMS05MDJjZDMyOTgyZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MDA3LCJpYXQiOjE3OTMwOTMxMDcsImp0aSI6IjI5YTVkZGFiLTE3OGItNDZlOS1hMDNhLTgxNDYyOTI1OWQ0OCIsInNpZCI6ImM5MjE2OTZhLTUyN2QtNDY5ZS1hMjRmLTE5ZmIxYjk2MDQyZCJ9.FFAusET_p6dFqI2i5fCpraIcCYD-rehx3ykjmnPAGf4",
  "access_expires_at": "2026-10-27T09:40:07.429469647Z",
  "refresh_token": "uNR9cTXnI1yOsu6X4X9axk7z784e3EoTHESlMDwH6a0",
  "refresh_expires_at": "2026-11-26T09:25:07.428644077Z",
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
  "command_id": "9cb69fac-55a2-4c8a-8934-a6466d958b4b",
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
  "id": "2ac4599c-73ef-460a-bb12-80d8b8dbd9c3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T09:30:07.495448Z",
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
  "command_id": "45e2a9aa-a870-47b9-a76b-7632dfd5769f",
  "quote_id": "2ac4599c-73ef-460a-bb12-80d8b8dbd9c3",
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
  "id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cfbc025f-695d-491d-abf1-902cd32982e2",
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
  "created_at": "2026-10-27T09:25:07.537242Z",
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
    "id": "2b574297-4a81-452f-9c0a-ef1f158838da",
    "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
    "expires_at": "2026-10-27T09:25:22.541642Z",
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

`POST /api/driver/v1/offers/2b574297-4a81-452f-9c0a-ef1f158838da/accept` → **200**

```json
{
  "command_id": "c6b8ec61-0f35-44a3-a54c-bc852bd49400"
}
```

```json
{
  "id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/aac62bc4-0334-42fc-ae31-e80a9c7281c8/messages` → **201**

```json
{
  "command_id": "8fab3598-e926-458b-84d2-fe00e34c197a",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "432207b9-82db-4aad-bf89-1a192248ca00",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T09:25:07.655453621Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "assignment_id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
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

`POST /api/driver/v1/trips/3fc789ac-1762-4e45-86e0-ed4b1495f1be/messages` → **201**

```json
{
  "command_id": "99cf2bcb-e328-45ac-84ac-311805374b47",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8548a73e-13ff-456b-be97-0cb275bc090a",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T09:25:07.711674825Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/aac62bc4-0334-42fc-ae31-e80a9c7281c8/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/3fc789ac-1762-4e45-86e0-ed4b1495f1be/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670495292"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5db45ed6-0395-4cb7-ae12-44b4edddc32b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:07Z",
    "sequence": 2
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5db45ed6-0395-4cb7-ae12-44b4edddc32b",
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
  "last_heartbeat_at": "2026-10-27T09:25:07.805827Z",
  "last_location_at": "2026-10-27T09:25:07.805827Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "assignment_id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
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

`POST /api/driver/v1/trips/3fc789ac-1762-4e45-86e0-ed4b1495f1be/arrive` → **200**

```json
{
  "command_id": "d609751a-6e87-4766-a8d4-39d4e33e7322",
  "expected_version": 0
}
```

```json
{
  "id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "assignment_id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
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
  "arrived_at": "2026-10-27T09:25:07.866966Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3fc789ac-1762-4e45-86e0-ed4b1495f1be/start` → **200**

```json
{
  "command_id": "f2bc621f-e36a-4b4e-892f-c32c9d4e33bd",
  "expected_version": 1
}
```

```json
{
  "id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "assignment_id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
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
  "arrived_at": "2026-10-27T09:25:07.866966Z",
  "started_at": "2026-10-27T09:25:07.904926Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/5db45ed6-0395-4cb7-ae12-44b4edddc32b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:07Z",
    "sequence": 3
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5db45ed6-0395-4cb7-ae12-44b4edddc32b",
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
  "last_heartbeat_at": "2026-10-27T09:25:07.945039Z",
  "last_location_at": "2026-10-27T09:25:07.945039Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/3fc789ac-1762-4e45-86e0-ed4b1495f1be/complete` → **200**

```json
{
  "command_id": "6735b09e-7840-4933-9150-9a4e1d9a7060",
  "expected_version": 2,
  "reported_at": "2026-10-27T09:25:07Z",
  "cash_received": true
}
```

```json
{
  "id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
  "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "assignment_id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
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
  "arrived_at": "2026-10-27T09:25:07.866966Z",
  "started_at": "2026-10-27T09:25:07.904926Z",
  "completed_at": "2026-10-27T09:25:07.996017Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/aac62bc4-0334-42fc-ae31-e80a9c7281c8` → **200**

```json
{
  "id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "cfbc025f-695d-491d-abf1-902cd32982e2",
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
    "id": "d2d09a4b-0866-473a-9e4e-8fe39363f919",
    "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T09:25:07.537242Z",
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
    "id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
    "short_number": 3,
    "status": "FULFILLED",
    "created_at": "2026-10-27T09:25:07.537242Z",
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
    "id": "3fc789ac-1762-4e45-86e0-ed4b1495f1be",
    "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
    "order_short_number": 3,
    "created_at": "2026-10-27T09:25:07.610047Z",
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
  "session_id": "2e8acf6e-ef80-4911-96ac-fc85fb18059a",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMTEsImlhdCI6MTc5MzA5MzExMSwianRpIjoiNzIyN2VmNjItYzI3NC00MjUzLThhYzUtYmExYWRjNGQ4MzAwIiwic2lkIjoiMmU4YWNmNmUtZWY4MC00OTExLTk2YWMtZmM4NWZiMTgwNTlhIn0.WxDRyP0TJE2J4CeAy3-QUFWostFdw8t1iZZp84XBywA",
  "access_expires_at": "2026-10-27T09:40:11.438887161Z",
  "refresh_token": "A70e230LEQ4ysemmoUavPpfIIFzVUXvIqA2jIbeIeFo",
  "refresh_expires_at": "2026-10-27T21:25:11.438243957Z",
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
  "session_id": "511981d1-2522-4658-95f3-5f0eb0316148",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMTEsImlhdCI6MTc5MzA5MzExMSwianRpIjoiMTI4NDk3OTctNmYwNi00NDlhLWI0Y2UtMDkxNGY0ZWM4Yzc5Iiwic2lkIjoiNTExOTgxZDEtMjUyMi00NjU4LTk1ZjMtNWYwZWIwMzE2MTQ4In0.oMnc3QBzkf_YAg4xbl0k8COTq8gjIoL-UXmlhBAHAKQ",
  "access_expires_at": "2026-10-27T09:40:11.761374532Z",
  "refresh_token": "SqFhBF-_t6yOT5Fer66M1gPle4xnsK4Xh-4Q2dWGor8",
  "refresh_expires_at": "2026-10-27T21:25:11.760607116Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/aac62bc4-0334-42fc-ae31-e80a9c7281c8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:25:07.537912Z",
      "actor": {
        "type": "CLIENT",
        "id": "cfbc025f-695d-491d-abf1-902cd32982e2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
        "quote_id": "2ac4599c-73ef-460a-bb12-80d8b8dbd9c3",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:25:07.54051Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
        "attempt_id": "ec17975f-e0d4-478c-8f31-0e9f933ebe57",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:25:07.547167Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2b574297-4a81-452f-9c0a-ef1f158838da",
        "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:25:07.612456Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2b574297-4a81-452f-9c0a-ef1f158838da",
        "order_id": "aac62bc4-0334-42fc-ae31-e80a9c7281c8",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d2d09a4b-0866-473a-9e4e-8fe39363f919"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order aac62bc4-0334-42fc-ae31-e80a9c7281c8.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29743"
}
```

```json
{
  "challenge_id": "d9c2324f-90c9-4aa9-9646-a15cb87e2fa1",
  "expires_at": "2026-10-27T09:30:11.826540047Z",
  "resend_available_at": "2026-10-27T09:25:12.826540047Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "171953",
  "sent_at": "2026-10-27T09:25:11.829611593Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9c2324f-90c9-4aa9-9646-a15cb87e2fa1",
  "code": "171953",
  "device_ref": "sandbox-29743"
}
```

```json
{
  "session_id": "66f42914-c506-46b1-be11-e32a279095f2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDAxMSwiaWF0IjoxNzkzMDkzMTExLCJqdGkiOiI0OWZlMzcwZC00OGZhLTRjZTItOGJkMy1mYmE0MDRhM2NhOTkiLCJzaWQiOiI2NmY0MjkxNC1jNTA2LTQ2YjEtYmUxMS1lMzJhMjc5MDk1ZjIifQ.HcHV3nenN_Sz4T1i9b0jakonVbEuo2_x3s6UoM_2Z4o",
  "access_expires_at": "2026-10-27T09:40:11.883607348Z",
  "refresh_token": "IpsvdEwiL-BB7CQR8OIyHvFPg0MjnfBe0Wh0KiKf1JE",
  "refresh_expires_at": "2026-11-26T09:25:11.882807674Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5db45ed6-0395-4cb7-ae12-44b4edddc32b",
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
  "last_heartbeat_at": "2026-10-27T09:25:07.945039Z",
  "last_location_at": "2026-10-27T09:25:07.945039Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5db45ed6-0395-4cb7-ae12-44b4edddc32b/close` → **409**

```json
{
  "command_id": "1e96c2f9-140f-47d1-a154-9f38cec1377d",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions/5db45ed6-0395-4cb7-ae12-44b4edddc32b/close",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f1879f27-369b-423f-9e90-4720d797e9a6"
}
```

`POST /api/driver/v1/work-sessions` → **409**

```json
{
  "command_id": "a6aadb03-6da5-4e6c-824a-1504ca6c677a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:11Z",
    "sequence": 1
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5468103d-c6f8-494b-88a1-c83588e3210c"
}
```

**Expected 201, got 409 — scenario stopped.**

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
  "session_id": "cbefd985-2801-476e-ba77-f6119464e15b",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMTIsImlhdCI6MTc5MzA5MzExMiwianRpIjoiZDM0ODEzMzMtYzEyYS00ZTQ4LWIxYmMtYjRmYzMwNDIwMDIyIiwic2lkIjoiY2JlZmQ5ODUtMjgwMS00NzZlLWJhNzctZjYxMTk0NjRlMTViIn0.-D6Zf9KAuNqkxfATDpZcipgkO7winoOq2mPhKxFnBrk",
  "access_expires_at": "2026-10-27T09:40:12.33854283Z",
  "refresh_token": "Ak3zE-fDaEsEn_SIKvyfTQgOfcnqEBsP-K7oxB0G-Gs",
  "refresh_expires_at": "2026-10-27T21:25:12.337854478Z",
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
  "command_id": "a5ef8172-7acf-46e4-a970-6792f20e2005",
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
    }
  },
  "changed_by": "08649436-268e-4618-8c57-450122efb8a5",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T09:25:12.416197846Z"
}
```

## The rider books the airport for 2026-10-27T12:25:12Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600067918",
  "device_ref": "sandbox-15358"
}
```

```json
{
  "challenge_id": "719a43a4-46ae-47b1-9bca-767e4a8e7d8d",
  "expires_at": "2026-10-27T09:30:12.449432567Z",
  "resend_available_at": "2026-10-27T09:25:13.449432567Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600067918` → **200**

```json
{
  "phone": "+48600067918",
  "audience": "CLIENT",
  "code": "790997",
  "sent_at": "2026-10-27T09:25:12.452601148Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "719a43a4-46ae-47b1-9bca-767e4a8e7d8d",
  "code": "790997",
  "device_ref": "sandbox-15358"
}
```

```json
{
  "session_id": "2b95540f-b78b-440e-a572-6e09f5bea0e1",
  "subject": {
    "type": "CLIENT",
    "id": "de5896fb-6e77-4424-8535-2ee89595a1c8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZTU4OTZmYi02ZTc3LTQ0MjQtODUzNS0yZWU4OTU5NWExYzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MDEyLCJpYXQiOjE3OTMwOTMxMTIsImp0aSI6IjA4M2VkMDNmLTg2M2QtNDgxOC1iNWI4LWFiN2U3MTc0YWRmMiIsInNpZCI6IjJiOTU1NDBmLWI3OGItNDQwZS1hNTcyLTZlMDlmNWJlYTBlMSJ9.72UNEvoWsrM4ylhK152yTmPxqGqp9UgwoAjQQXz7lhs",
  "access_expires_at": "2026-10-27T09:40:12.506000495Z",
  "refresh_token": "30ergb1RtHxwpIJodfiqYP68ump1bFN8gfTQXdM9k7Y",
  "refresh_expires_at": "2026-11-26T09:25:12.505087776Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "80ffe59f-172d-4ed3-8109-f7781443b02f",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T12:25:12Z"
}
```

```json
{
  "id": "5aff3ee0-23f4-4a2c-8cab-f6671f462687",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T09:30:12.545254Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T12:25:12Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4222c8eb-6279-4c09-a234-41f139023b33",
  "quote_id": "5aff3ee0-23f4-4a2c-8cab-f6671f462687",
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
  "pickup_at": "2026-10-27T12:25:12Z"
}
```

```json
{
  "id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
  "short_number": 4,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "de5896fb-6e77-4424-8535-2ee89595a1c8",
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
  "created_at": "2026-10-27T09:25:12.584425Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T12:25:12Z",
  "preorder": true,
  "related_order_id": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-8226"
}
```

```json
{
  "challenge_id": "6210d09b-9a1c-436b-b851-a608f7349617",
  "expires_at": "2026-10-27T09:30:12.619463526Z",
  "resend_available_at": "2026-10-27T09:25:13.619463526Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "002678",
  "sent_at": "2026-10-27T09:25:12.622585391Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6210d09b-9a1c-436b-b851-a608f7349617",
  "code": "002678",
  "device_ref": "sandbox-8226"
}
```

```json
{
  "session_id": "2e79772a-96b9-4041-a63e-fd2ae99bc1c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDAxMiwiaWF0IjoxNzkzMDkzMTEyLCJqdGkiOiJmNTU3YmQ5Mi00ZWZmLTRiOWMtOWM4My1kNjk4MWI0NzNjYzEiLCJzaWQiOiIyZTc5NzcyYS05NmI5LTQwNDEtYTYzZS1mZDJhZTk5YmMxYzMifQ.GL1VPcxKLyJvBECVQ3GZg1KWkOLbSKpY6f2dcl4d0pc",
  "access_expires_at": "2026-10-27T09:40:12.676457029Z",
  "refresh_token": "LEBmXrG7Ftgo738qQSixArO7VI3U9UOVecX8ir3JRBs",
  "refresh_expires_at": "2026-11-26T09:25:12.675786782Z",
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
  "command_id": "18a8b211-f254-4944-832f-66f677aedba0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:25:12Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bf36fad0-fefb-41a3-a05b-cc2e7873cf1b",
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
  "last_heartbeat_at": "2026-10-27T09:25:12.738953Z",
  "last_location_at": "2026-10-27T09:25:12.738953Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
      "short_number": 4,
      "pickup_at": "2026-10-27T12:25:12Z",
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

`POST /api/driver/v1/preorders/d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0/reserve` → **200**

```json
{
  "command_id": "99a8fcd4-c823-47bf-94e2-6667b1bd1af5"
}
```

```json
{
  "id": "78696b4c-1186-4753-9ac4-67adb3797cc9",
  "state": "RESERVED",
  "order": {
    "order_id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
    "short_number": 4,
    "pickup_at": "2026-10-27T12:25:12Z",
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
  "reserved_at": "2026-10-27T09:25:12.810994Z",
  "confirm_from": "2026-10-27T11:55:12Z",
  "confirm_until": "2026-10-27T12:05:12Z",
  "drop_until": "2026-10-27T11:25:12Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "78696b4c-1186-4753-9ac4-67adb3797cc9",
      "state": "RESERVED",
      "order": {
        "order_id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
        "short_number": 4,
        "pickup_at": "2026-10-27T12:25:12Z",
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
      "reserved_at": "2026-10-27T09:25:12.810994Z",
      "confirm_from": "2026-10-27T11:55:12Z",
      "confirm_until": "2026-10-27T12:05:12Z",
      "drop_until": "2026-10-27T11:25:12Z"
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
      "id": "78696b4c-1186-4753-9ac4-67adb3797cc9",
      "state": "RESERVED",
      "order": {
        "order_id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
        "short_number": 4,
        "pickup_at": "2026-10-27T12:25:12Z",
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
      "reserved_at": "2026-10-27T09:25:12.810994Z",
      "confirm_from": "2026-10-27T11:55:12Z",
      "confirm_until": "2026-10-27T12:05:12Z",
      "drop_until": "2026-10-27T11:25:12Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/78696b4c-1186-4753-9ac4-67adb3797cc9/confirm` → **409**

```json
{
  "command_id": "23c535fa-f48d-4272-ac6e-88bc247aca0d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/78696b4c-1186-4753-9ac4-67adb3797cc9/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "0337e202-2431-4526-8c7e-126e230d92ed"
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
  "session_id": "6df1abeb-d625-4844-9578-724e90b1709a",
  "subject": {
    "type": "STAFF",
    "id": "08649436-268e-4618-8c57-450122efb8a5"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODY0OTQzNi0yNjhlLTQ2MTgtOGM1Ny00NTAxMjJlZmI4YTUiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQwMTMsImlhdCI6MTc5MzA5MzExMywianRpIjoiYmUzN2Q4ZTEtNWQxZC00ZjBmLWE2NDctZjJiNmEwZjJiM2UwIiwic2lkIjoiNmRmMWFiZWItZDYyNS00ODQ0LTk1NzgtNzI0ZTkwYjE3MDlhIn0.LNfyisrUDpaI0j6hFi0JtxFUdF9ezfWetYDzkbtooQs",
  "access_expires_at": "2026-10-27T09:40:13.223709244Z",
  "refresh_token": "oElAILLCoTp2v3p4GgtwynkZWei65mJ_kthzQrf3MJQ",
  "refresh_expires_at": "2026-10-27T21:25:13.223026876Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0` → **200**

```json
{
  "id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
  "short_number": 4,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "de5896fb-6e77-4424-8535-2ee89595a1c8",
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
  "created_at": "2026-10-27T09:25:12.584425Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T12:25:12Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "78696b4c-1186-4753-9ac4-67adb3797cc9",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T09:25:12.810994Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T09:25:12.586274Z",
      "actor": {
        "type": "CLIENT",
        "id": "de5896fb-6e77-4424-8535-2ee89595a1c8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
        "preorder": true,
        "quote_id": "5aff3ee0-23f4-4a2c-8cab-f6671f462687",
        "pickup_at": "2026-10-27T12:25:12Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T09:25:12.812175Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "78696b4c-1186-4753-9ac4-67adb3797cc9"
      }
    }
  ]
}
```

Done: pre-order d24fdb4f-5a72-4ae7-8c55-3ca2aee86bb0, reservation 78696b4c-1186-4753-9ac4-67adb3797cc9.
