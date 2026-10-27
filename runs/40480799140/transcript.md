# Sandbox transcript (2026-10-27T09:27:20Z, f741c32)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637341863",
  "device_ref": "sandbox-14351"
}
```

```json
{
  "challenge_id": "3bc4b2f8-4846-4cdb-be49-dcacee12a3c7",
  "expires_at": "2026-10-27T09:32:20.535586511Z",
  "resend_available_at": "2026-10-27T09:27:21.535586511Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637341863` → **200**

```json
{
  "phone": "+380637341863",
  "audience": "CLIENT",
  "code": "647139",
  "sent_at": "2026-10-27T09:27:20.543240332Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bc4b2f8-4846-4cdb-be49-dcacee12a3c7",
  "code": "647139",
  "device_ref": "sandbox-14351"
}
```

```json
{
  "session_id": "9952fc14-5193-4e55-824b-cd79dd5e7a37",
  "subject": {
    "type": "CLIENT",
    "id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMjZjYTQzYy1jYzUwLTQxOGQtYTNhZC1mMDdlZjFlNGUxNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MTQwLCJpYXQiOjE3OTMwOTMyNDAsImp0aSI6ImYzNzkyY2NlLTE0OGUtNGNlZi04NGJiLWJmMTg1ZjkyNDhmOSIsInNpZCI6Ijk5NTJmYzE0LTUxOTMtNGU1NS04MjRiLWNkNzlkZDVlN2EzNyJ9.wo3YVqUrplEZGr9pmtRIOhuRKszOpHodXZw9r1ZFRC8",
  "access_expires_at": "2026-10-27T09:42:20.639909692Z",
  "refresh_token": "17TmPuaGbKgObQE2W3gU1cwDoaNfrsm-DVkNMMH7nKI",
  "refresh_expires_at": "2026-11-26T09:27:20.635401521Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать",
        "en": "Changed my mind"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
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
  "device_ref": "sandbox-11088"
}
```

```json
{
  "challenge_id": "14272bd9-7e32-492e-94d6-a1e0fbfce4df",
  "expires_at": "2026-10-27T09:32:20.77177299Z",
  "resend_available_at": "2026-10-27T09:27:21.77177299Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "450542",
  "sent_at": "2026-10-27T09:27:20.775624982Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "14272bd9-7e32-492e-94d6-a1e0fbfce4df",
  "code": "450542",
  "device_ref": "sandbox-11088"
}
```

```json
{
  "session_id": "46a58295-6e1b-41fe-87e5-8733c1ddd4b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDE0MCwiaWF0IjoxNzkzMDkzMjQwLCJqdGkiOiI3ZDEzNTI5My0yNjA3LTRlZGMtOGFlMi1iMzNlNmJjMjgzODkiLCJzaWQiOiI0NmE1ODI5NS02ZTFiLTQxZmUtODdlNS04NzMzYzFkZGQ0YjAifQ.1X1d9e5iPhIT9wew8eP8XKU8QMeAx9zmyPwAa2dZJ-Q",
  "access_expires_at": "2026-10-27T09:42:20.835974789Z",
  "refresh_token": "t3wVnjx0rpgVOazQAybP274-k1_Erf7_ppdaZ6vMMac",
  "refresh_expires_at": "2026-11-26T09:27:20.834822339Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup"
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
  "correlation_id": "f4259a46-8f4f-4974-a12d-ce8318e8e1b9"
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
  "session_id": "42aa12cd-ebba-456a-9bfd-2b2f8e16cb40",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNDEsImlhdCI6MTc5MzA5MzI0MSwianRpIjoiYjlmNTZiNzYtZmYwYi00ZmUzLWFmY2QtZWQ2YzEyYzkxNjZkIiwic2lkIjoiNDJhYTEyY2QtZWJiYS00NTZhLTliZmQtMmIyZjhlMTZjYjQwIn0.6dBtEaAcoFosbfGXExFQFvutq3T5brZwE1BHdM9nIHk",
  "access_expires_at": "2026-10-27T09:42:21.613013065Z",
  "refresh_token": "acWl1o8AOTcGl7n8Q-Zhk7NnhPi6d3tbVmGMi0zlioc",
  "refresh_expires_at": "2026-10-27T21:27:21.61176956Z",
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
  "session_id": "52b8a440-07ec-4293-a4e7-e4adb1868580",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNDMsImlhdCI6MTc5MzA5MzI0MywianRpIjoiN2RjZmNiYWQtOTE1Yy00YTQ2LWEzMzYtMWEyNmQyMWFhMWMyIiwic2lkIjoiNTJiOGE0NDAtMDdlYy00MjkzLWE0ZTctZTRhZGIxODY4NTgwIn0.n6_1brKb-Zb1dgedSZ5MZvTa4166GvzuvA6VBmkM2ZA",
  "access_expires_at": "2026-10-27T09:42:23.021417628Z",
  "refresh_token": "51fJCCxMaJKGXra9Y7YRnexGf8dVbSlCc_0FhrlftFU",
  "refresh_expires_at": "2026-10-27T21:27:23.020291031Z",
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
  "session_id": "be33ba41-81c0-436a-a2b5-bb088297a59c",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNDMsImlhdCI6MTc5MzA5MzI0MywianRpIjoiYTdkYjZiN2YtZmVhNS00MzgzLThmMWEtMWZjNWY3NjYzZmY2Iiwic2lkIjoiYmUzM2JhNDEtODFjMC00MzZhLWEyYjUtYmIwODgyOTdhNTljIn0.Z6R9L0ufYk04496hh6Z7Wrss4cdeh1fKBJZZVSMdVdw",
  "access_expires_at": "2026-10-27T09:42:23.387697217Z",
  "refresh_token": "HCcF2kZ_0kste7D6w2Ug8cCNYGBEQRnXX4fGTnFrIcI",
  "refresh_expires_at": "2026-10-27T21:27:23.386707788Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил",
        "en": "Passenger asked"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП",
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
  "command_id": "79cbd02d-e93d-4135-8ae2-1bb5dbb2163b",
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
  "id": "60d34a37-c686-42c6-a175-3692a6597109",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:32:23.589285Z",
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
  "command_id": "0e6d73d9-0c68-4595-b252-6b72b3852ec2",
  "quote_id": "60d34a37-c686-42c6-a175-3692a6597109",
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
  "id": "8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159",
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
  "created_at": "2026-10-27T09:27:23.69701Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0` → **200**

```json
{
  "id": "8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159",
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
  "created_at": "2026-10-27T09:27:23.69701Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0/cancel` → **200**

```json
{
  "command_id": "99343088-c97e-4c1d-914c-f513ec9dd055",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159",
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
  "created_at": "2026-10-27T09:27:23.69701Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long"
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
  "command_id": "10fa42b2-881e-42b4-b74d-b5615380ef43",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:23Z",
    "sequence": 1793093243895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "817ee3f9-04a6-424e-adcc-2d92e2f0faff",
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
  "last_heartbeat_at": "2026-10-27T09:27:23.938337Z",
  "last_location_at": "2026-10-27T09:27:23.938337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13483"
}
```

```json
{
  "challenge_id": "4c912a1f-87ab-4d89-bc22-06a22c5c08ef",
  "expires_at": "2026-10-27T09:32:23.978268339Z",
  "resend_available_at": "2026-10-27T09:27:24.978268339Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "159759",
  "sent_at": "2026-10-27T09:27:23.982263934Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c912a1f-87ab-4d89-bc22-06a22c5c08ef",
  "code": "159759",
  "device_ref": "sandbox-13483"
}
```

```json
{
  "session_id": "c7ed84c0-b868-4a78-9486-689230c4aea7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDE0NCwiaWF0IjoxNzkzMDkzMjQ0LCJqdGkiOiJlYWYwNDJjNC04ZWRhLTRiMTItODgwMi0wNDBmZWQxYzNiYTIiLCJzaWQiOiJjN2VkODRjMC1iODY4LTRhNzgtOTQ4Ni02ODkyMzBjNGFlYTcifQ.5nusJ9ReVQqv2tkmUtDDsHPxjiYHuxMuMVGs221Lsn0",
  "access_expires_at": "2026-10-27T09:42:24.047509894Z",
  "refresh_token": "fmvwOTkN-Fcizv67PyU_guInGmWdCaDRa7pnlqcOW58",
  "refresh_expires_at": "2026-11-26T09:27:24.046524711Z",
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
  "command_id": "09b40ca8-3ddc-4223-9a61-08928c3ea0a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:24Z",
    "sequence": 1793093244109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "294c26a1-327b-4ab9-945d-f6a73a68c9f2",
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
  "last_heartbeat_at": "2026-10-27T09:27:24.128051Z",
  "last_location_at": "2026-10-27T09:27:24.128051Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "97372563-bcbe-40f1-852a-7b7b67c30660",
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
  "id": "027e884f-9a24-4630-94f5-f513eae6612a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:32:24.173720Z",
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
  "command_id": "e6c3be1f-f1c3-4e72-96ed-d65440cddb86",
  "quote_id": "027e884f-9a24-4630-94f5-f513eae6612a",
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
  "id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159",
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
  "created_at": "2026-10-27T09:27:24.215927Z",
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
    "id": "e8618052-823e-4ba5-a482-1e20f49f2d79",
    "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
    "expires_at": "2026-10-27T09:27:39.220948Z",
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

`POST /api/driver/v1/offers/e8618052-823e-4ba5-a482-1e20f49f2d79/accept` → **200**

```json
{
  "command_id": "e730a493-f9b8-4d82-8f85-699fcc4834d9"
}
```

```json
{
  "id": "21c9253f-5410-41ed-ae21-fcb0fa9a9497",
  "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "62c0d6c7-5783-4ff0-b5c3-8c037e7c2194",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "62c0d6c7-5783-4ff0-b5c3-8c037e7c2194",
  "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "assignment_id": "21c9253f-5410-41ed-ae21-fcb0fa9a9497",
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

`POST /api/driver/v1/trips/62c0d6c7-5783-4ff0-b5c3-8c037e7c2194/cancel` → **200**

```json
{
  "command_id": "a8651f23-b042-4c44-8fc0-6bdf45ac2882",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "62c0d6c7-5783-4ff0-b5c3-8c037e7c2194",
  "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "assignment_id": "21c9253f-5410-41ed-ae21-fcb0fa9a9497",
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

`GET /api/rider/v1/orders/fb295c13-2ea7-454a-bced-b1cdc7fb2cf4` → **200**

```json
{
  "id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159",
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
    "id": "21c9253f-5410-41ed-ae21-fcb0fa9a9497",
    "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "62c0d6c7-5783-4ff0-b5c3-8c037e7c2194",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T09:27:24.215927Z",
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
    "id": "d3fe223a-bd7f-411b-9c89-679fc84d4a1d",
    "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
    "expires_at": "2026-10-27T09:27:39.40139Z",
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

`POST /api/driver/v1/offers/d3fe223a-bd7f-411b-9c89-679fc84d4a1d/accept` → **200**

```json
{
  "command_id": "6e830253-ebfc-4c5e-b025-c4f644bc7895"
}
```

```json
{
  "id": "6826a922-db25-4b27-903e-00be8e0a7353",
  "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "487ab76f-ba34-4b73-88f0-ce14a726c831",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "487ab76f-ba34-4b73-88f0-ce14a726c831",
  "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "assignment_id": "6826a922-db25-4b27-903e-00be8e0a7353",
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

`POST /api/driver/v1/trips/487ab76f-ba34-4b73-88f0-ce14a726c831/cancel` → **200**

```json
{
  "command_id": "1b801134-d4e3-426e-a2be-cf969c342940",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "487ab76f-ba34-4b73-88f0-ce14a726c831",
  "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
  "assignment_id": "6826a922-db25-4b27-903e-00be8e0a7353",
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
    "id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:27:24.215927Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel"
      }
    },
    "pickup_at": null
  },
  {
    "id": "8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:27:23.69701Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/fb295c13-2ea7-454a-bced-b1cdc7fb2cf4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:27:24.216789Z",
      "actor": {
        "type": "CLIENT",
        "id": "026ca43c-cc50-418d-a3ad-f07ef1e4e159",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
        "quote_id": "027e884f-9a24-4630-94f5-f513eae6612a",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:27:24.219519Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
        "attempt_id": "df89faed-0938-4d40-9d58-243de32bad0b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:27:24.227887Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e8618052-823e-4ba5-a482-1e20f49f2d79",
        "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:27:24.309392Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e8618052-823e-4ba5-a482-1e20f49f2d79",
        "order_id": "fb295c13-2ea7-454a-bced-b1cdc7fb2cf4",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "21c9253f-5410-41ed-ae21-fcb0fa9a9497"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 8c6a9720-4c0e-4fc6-9b0c-c2e667d70ba0, fb295c13-2ea7-454a-bced-b1cdc7fb2cf4.

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
  "device_ref": "sandbox-31223"
}
```

```json
{
  "challenge_id": "79a224ca-c005-4cd5-a0ba-90e192c14828",
  "expires_at": "2026-10-27T09:32:24.730372502Z",
  "resend_available_at": "2026-10-27T09:27:25.730372502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "228366",
  "sent_at": "2026-10-27T09:27:24.734152425Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79a224ca-c005-4cd5-a0ba-90e192c14828",
  "code": "228366",
  "device_ref": "sandbox-31223"
}
```

```json
{
  "session_id": "ef715471-596a-4156-b90f-de6aacbe14db",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDE0NCwiaWF0IjoxNzkzMDkzMjQ0LCJqdGkiOiJjOGFmODgyMy0zNzkwLTRkOTYtOTdhNS01MzVhMjNkYzQ3MWMiLCJzaWQiOiJlZjcxNTQ3MS01OTZhLTQxNTYtYjkwZi1kZTZhYWNiZTE0ZGIifQ.TUHt0GbBp5i5VY9s1j29YdUP4p08jafaTzRjffOnFCA",
  "access_expires_at": "2026-10-27T09:42:24.793694248Z",
  "refresh_token": "9jjeuihMntkFwPc-qPoIDdRh_driqdx7AGl0QfF7HeQ",
  "refresh_expires_at": "2026-11-26T09:27:24.792851505Z",
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
  "command_id": "2194b7d0-d26d-46d7-a8c7-9342d101b00c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:24Z",
    "sequence": 1793093244851
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:24.869052Z",
  "last_location_at": "2026-10-27T09:27:24.869052Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673050946",
  "device_ref": "sandbox-31437"
}
```

```json
{
  "challenge_id": "a92a9333-649f-400e-9c35-7f3e827d5d8b",
  "expires_at": "2026-10-27T09:32:24.906563607Z",
  "resend_available_at": "2026-10-27T09:27:25.906563607Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673050946` → **200**

```json
{
  "phone": "+380673050946",
  "audience": "CLIENT",
  "code": "408154",
  "sent_at": "2026-10-27T09:27:24.910505538Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a92a9333-649f-400e-9c35-7f3e827d5d8b",
  "code": "408154",
  "device_ref": "sandbox-31437"
}
```

```json
{
  "session_id": "8e7d88f6-e0b1-42e8-a192-bbe811fa360d",
  "subject": {
    "type": "CLIENT",
    "id": "16bfa836-93f6-49ed-8c7d-efae14c20fdc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNmJmYTgzNi05M2Y2LTQ5ZWQtOGM3ZC1lZmFlMTRjMjBmZGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MTQ0LCJpYXQiOjE3OTMwOTMyNDQsImp0aSI6IjM0ZTYwMmUxLTEzYWQtNDUzYi1iYzA3LTVhZTE4MzlhY2RjMCIsInNpZCI6IjhlN2Q4OGY2LWUwYjEtNDJlOC1hMTkyLWJiZTgxMWZhMzYwZCJ9.6eJth_hX23kST3vYJfdHuVLD3mkupQ_YtLav6lWpdgQ",
  "access_expires_at": "2026-10-27T09:42:24.969599917Z",
  "refresh_token": "cHo7BjPgdxm1E4rZ9WeMgpDsiOWt4XlSMHfztLBT1Vo",
  "refresh_expires_at": "2026-11-26T09:27:24.968775681Z",
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
  "command_id": "b24d5bed-f8d5-4657-bf8b-b83617ff71d5",
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
  "id": "534972e1-333e-48ee-b499-aea20319bbe9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T09:32:25.042939Z",
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
  "command_id": "82547e43-0c28-4262-8ad9-ff8526202ab4",
  "quote_id": "534972e1-333e-48ee-b499-aea20319bbe9",
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
  "id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "16bfa836-93f6-49ed-8c7d-efae14c20fdc",
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
  "created_at": "2026-10-27T09:27:25.088504Z",
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
    "id": "0b0d92ca-e5a6-456e-bea4-e1cde1eda934",
    "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
    "expires_at": "2026-10-27T09:27:40.093031Z",
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

`POST /api/driver/v1/offers/0b0d92ca-e5a6-456e-bea4-e1cde1eda934/accept` → **200**

```json
{
  "command_id": "a99a05ab-4b3a-467c-9465-2b9072c38cf7"
}
```

```json
{
  "id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a281b8d0-3bee-49bc-b941-b3d3c8432963/messages` → **201**

```json
{
  "command_id": "7b8e04c3-4d3f-4ca5-af75-485a9b295b6b",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d739a4e8-903a-48fb-b9c1-ac9bf61854bf",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T09:27:25.218225488Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "assignment_id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
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

`POST /api/driver/v1/trips/6e5b2efb-df8b-4b64-8b03-79e6b27dbd43/messages` → **201**

```json
{
  "command_id": "2ee198a4-e607-4472-9270-f770a9e4be70",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "75ebee88-b355-4aef-8082-47527d86a67b",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T09:27:25.280679224Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/a281b8d0-3bee-49bc-b941-b3d3c8432963/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/6e5b2efb-df8b-4b64-8b03-79e6b27dbd43/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673050946"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0cd5cfbe-4fb9-439b-9b92-b53fbe35908e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:25Z",
    "sequence": 1793093245364
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:25.38528Z",
  "last_location_at": "2026-10-27T09:27:25.38528Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "assignment_id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
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

`POST /api/driver/v1/trips/6e5b2efb-df8b-4b64-8b03-79e6b27dbd43/arrive` → **200**

```json
{
  "command_id": "ad6f28a2-de7b-4cd6-84fa-55241255fb8b",
  "expected_version": 0
}
```

```json
{
  "id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "assignment_id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
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
  "arrived_at": "2026-10-27T09:27:25.449966Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/6e5b2efb-df8b-4b64-8b03-79e6b27dbd43/start` → **200**

```json
{
  "command_id": "9914a681-3dcc-46e9-a317-39ab47286f98",
  "expected_version": 1
}
```

```json
{
  "id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "assignment_id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
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
  "arrived_at": "2026-10-27T09:27:25.449966Z",
  "started_at": "2026-10-27T09:27:25.490587Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/0cd5cfbe-4fb9-439b-9b92-b53fbe35908e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:25Z",
    "sequence": 1793093245516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:25.534173Z",
  "last_location_at": "2026-10-27T09:27:25.534173Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/6e5b2efb-df8b-4b64-8b03-79e6b27dbd43/complete` → **200**

```json
{
  "command_id": "97e205b9-58f5-44bb-802d-d42384027296",
  "expected_version": 2,
  "reported_at": "2026-10-27T09:27:25Z",
  "cash_received": true
}
```

```json
{
  "id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
  "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "assignment_id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
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
  "arrived_at": "2026-10-27T09:27:25.449966Z",
  "started_at": "2026-10-27T09:27:25.490587Z",
  "completed_at": "2026-10-27T09:27:25.584372Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a281b8d0-3bee-49bc-b941-b3d3c8432963` → **200**

```json
{
  "id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "16bfa836-93f6-49ed-8c7d-efae14c20fdc",
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
    "id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872",
    "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T09:27:25.088504Z",
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
    "id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
    "short_number": 3,
    "status": "FULFILLED",
    "created_at": "2026-10-27T09:27:25.088504Z",
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
    "id": "6e5b2efb-df8b-4b64-8b03-79e6b27dbd43",
    "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
    "order_short_number": 3,
    "created_at": "2026-10-27T09:27:25.167055Z",
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
  "session_id": "3e422950-4ccc-4184-b3ad-1832708e78f9",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNDksImlhdCI6MTc5MzA5MzI0OSwianRpIjoiMGIxN2Q2YmYtNThiNC00YTg5LTk4NmYtNTBjODIwMTdjOGM1Iiwic2lkIjoiM2U0MjI5NTAtNGNjYy00MTg0LWIzYWQtMTgzMjcwOGU3OGY5In0.KoppxYjPZZTy3WaM2vzZSv6KQqW1vghiTfoUPxbZwUk",
  "access_expires_at": "2026-10-27T09:42:29.0791393Z",
  "refresh_token": "QJSXO6RWg165mK8HK_TkIk5L1wB1M0zlZFd3Ec-nPZc",
  "refresh_expires_at": "2026-10-27T21:27:29.078522441Z",
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
  "session_id": "842b3a37-cdd8-48fd-9a4a-d77dc274ad6c",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNDksImlhdCI6MTc5MzA5MzI0OSwianRpIjoiYjFhYWFjZDgtZTMyZC00YmZlLWFjYmUtMTZiMDdjZDY3ODEwIiwic2lkIjoiODQyYjNhMzctY2RkOC00OGZkLTlhNGEtZDc3ZGMyNzRhZDZjIn0.cFYi3OCqwhh6cu8j1JXz5J2VZW8itAnV86pCZbEW6tQ",
  "access_expires_at": "2026-10-27T09:42:29.443595555Z",
  "refresh_token": "W56779PR5h_FRBlM0md6v8Qq8b_s-8K3pLjWUZ_FJqo",
  "refresh_expires_at": "2026-10-27T21:27:29.442987078Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a281b8d0-3bee-49bc-b941-b3d3c8432963/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:27:25.089263Z",
      "actor": {
        "type": "CLIENT",
        "id": "16bfa836-93f6-49ed-8c7d-efae14c20fdc",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
        "quote_id": "534972e1-333e-48ee-b499-aea20319bbe9",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:27:25.091844Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
        "attempt_id": "52eb20e7-6751-43b3-90cd-d5fc7a3b2178",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:27:25.098932Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0b0d92ca-e5a6-456e-bea4-e1cde1eda934",
        "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:27:25.169508Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "0b0d92ca-e5a6-456e-bea4-e1cde1eda934",
        "order_id": "a281b8d0-3bee-49bc-b941-b3d3c8432963",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "a960eed3-b8d9-4f55-bd91-20f5fe7ef872"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order a281b8d0-3bee-49bc-b941-b3d3c8432963.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16421"
}
```

```json
{
  "challenge_id": "4b030f6b-6cc0-4f0f-bb65-743b01d6f8cd",
  "expires_at": "2026-10-27T09:32:29.514767746Z",
  "resend_available_at": "2026-10-27T09:27:30.514767746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "281062",
  "sent_at": "2026-10-27T09:27:29.517697261Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b030f6b-6cc0-4f0f-bb65-743b01d6f8cd",
  "code": "281062",
  "device_ref": "sandbox-16421"
}
```

```json
{
  "session_id": "419012b0-dcc0-437e-9e4e-67056529b9a5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDE0OSwiaWF0IjoxNzkzMDkzMjQ5LCJqdGkiOiJjOGEwYTE0MC1kMWYwLTQxYTEtODU0NC1mMDY2ZDRlZDZiMzEiLCJzaWQiOiI0MTkwMTJiMC1kY2MwLTQzN2UtOWU0ZS02NzA1NjUyOWI5YTUifQ.jtm_H_WnXiBKSdhhtkIkGcp46_W6iQ1PqxbvGl8xoz0",
  "access_expires_at": "2026-10-27T09:42:29.57589382Z",
  "refresh_token": "yMF2JFEYssWAzmG2DdWcFT3hKdg9K3V2ahuTtTFgmjA",
  "refresh_expires_at": "2026-11-26T09:27:29.57517145Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:25.534173Z",
  "last_location_at": "2026-10-27T09:27:25.534173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0cd5cfbe-4fb9-439b-9b92-b53fbe35908e/handover` → **200**

```json
{
  "command_id": "4712eac2-6ba9-4847-8c94-cebb631ebcae",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:25.534173Z",
  "last_location_at": "2026-10-27T09:27:25.534173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0cd5cfbe-4fb9-439b-9b92-b53fbe35908e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:29Z",
    "sequence": 1793093249678
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:29.696254Z",
  "last_location_at": "2026-10-27T09:27:29.696254Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660073093",
  "device_ref": "sandbox-27678"
}
```

```json
{
  "challenge_id": "dd761fdf-464a-4085-a1fc-ec0b364939b9",
  "expires_at": "2026-10-27T09:32:29.725716247Z",
  "resend_available_at": "2026-10-27T09:27:30.725716247Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660073093` → **200**

```json
{
  "phone": "+380660073093",
  "audience": "CLIENT",
  "code": "906604",
  "sent_at": "2026-10-27T09:27:29.72845157Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd761fdf-464a-4085-a1fc-ec0b364939b9",
  "code": "906604",
  "device_ref": "sandbox-27678"
}
```

```json
{
  "session_id": "0e1b23b1-aeb4-4f5c-b43f-c9006a5e834b",
  "subject": {
    "type": "CLIENT",
    "id": "a76b505f-205b-40e4-a612-fa9616a26534"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzZiNTA1Zi0yMDViLTQwZTQtYTYxMi1mYTk2MTZhMjY1MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MTQ5LCJpYXQiOjE3OTMwOTMyNDksImp0aSI6ImFhNmEwNWE5LTM3YjItNDk5ZS04Yjg5LWVkODQ5YWFkMTlkMSIsInNpZCI6IjBlMWIyM2IxLWFlYjQtNGY1Yy1iNDNmLWM5MDA2YTVlODM0YiJ9.ddbZCeBbmh1vU5U3dKO7DOyzSRrltKFHe5BqX7pbsR0",
  "access_expires_at": "2026-10-27T09:42:29.78698146Z",
  "refresh_token": "WOyPhvB8t_C89QDz5DWA6ZrV8KyXIX3eMX-zML10v2w",
  "refresh_expires_at": "2026-11-26T09:27:29.786343074Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "61e9acf6-7121-4ca0-94af-582495a0ca66",
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
  "id": "8b0aaed6-92d9-4e39-b043-a2a4d91ebf69",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T09:32:29.826855Z",
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
  "command_id": "d43ac6fd-afed-44fb-bc52-048ca497c46a",
  "quote_id": "8b0aaed6-92d9-4e39-b043-a2a4d91ebf69",
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
  "id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a76b505f-205b-40e4-a612-fa9616a26534",
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
  "created_at": "2026-10-27T09:27:29.867793Z",
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
    "id": "3508eb78-5722-464a-a93f-a25802537b33",
    "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
    "expires_at": "2026-10-27T09:27:44.871895Z",
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

`POST /api/driver/v1/offers/3508eb78-5722-464a-a93f-a25802537b33/accept` → **200**

```json
{
  "command_id": "e84fc0b8-a466-49d9-8ce9-7d6a23bd161d"
}
```

```json
{
  "id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61",
  "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5c01eda8-e0cd-4f0d-8a73-b521dda21a5b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5c01eda8-e0cd-4f0d-8a73-b521dda21a5b",
  "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
  "assignment_id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61",
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
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/0cd5cfbe-4fb9-439b-9b92-b53fbe35908e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:29Z",
    "sequence": 1793093249988
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:30.006688Z",
  "last_location_at": "2026-10-27T09:27:30.006688Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5c01eda8-e0cd-4f0d-8a73-b521dda21a5b/arrive` → **200**

```json
{
  "command_id": "1e3898e2-cbcb-4d50-b39a-8219d9420559",
  "expected_version": 0
}
```

```json
{
  "id": "5c01eda8-e0cd-4f0d-8a73-b521dda21a5b",
  "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
  "assignment_id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61",
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
  "arrived_at": "2026-10-27T09:27:30.04779Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/5c01eda8-e0cd-4f0d-8a73-b521dda21a5b/start` → **200**

```json
{
  "command_id": "35cacfe6-e517-4075-978c-fd8becc42deb",
  "expected_version": 1
}
```

```json
{
  "id": "5c01eda8-e0cd-4f0d-8a73-b521dda21a5b",
  "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
  "assignment_id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61",
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
  "arrived_at": "2026-10-27T09:27:30.04779Z",
  "started_at": "2026-10-27T09:27:30.091827Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/0cd5cfbe-4fb9-439b-9b92-b53fbe35908e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:30Z",
    "sequence": 1793093250120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0cd5cfbe-4fb9-439b-9b92-b53fbe35908e",
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
  "last_heartbeat_at": "2026-10-27T09:27:30.138023Z",
  "last_location_at": "2026-10-27T09:27:30.138023Z",
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
  "device_ref": "sandbox-22062"
}
```

```json
{
  "challenge_id": "7f53f9f0-c8e8-40af-9d32-4a34be8b1264",
  "expires_at": "2026-10-27T09:32:30.16565958Z",
  "resend_available_at": "2026-10-27T09:27:31.16565958Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "015695",
  "sent_at": "2026-10-27T09:27:30.169075481Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7f53f9f0-c8e8-40af-9d32-4a34be8b1264",
  "code": "015695",
  "device_ref": "sandbox-22062"
}
```

```json
{
  "session_id": "7b0cc315-7d16-44cb-a71e-6dd72bc1efad",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDE1MCwiaWF0IjoxNzkzMDkzMjUwLCJqdGkiOiI4NGU1ZWVlYy1kM2IxLTRmOTctOTZiMS1iY2FjMjM0NjQ0ODQiLCJzaWQiOiI3YjBjYzMxNS03ZDE2LTQ0Y2ItYTcxZS02ZGQ3MmJjMWVmYWQifQ.WjuGJiuJGVYVgN4SpZsmtX0vGAPQ7A2EpMpyCXSOngc",
  "access_expires_at": "2026-10-27T09:42:30.231598174Z",
  "refresh_token": "9QuMJ3Li-Y66YRanAnil9XofLSKOMKqAUMTX6JpEt38",
  "refresh_expires_at": "2026-11-26T09:27:30.230923489Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "817ee3f9-04a6-424e-adcc-2d92e2f0faff",
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
  "last_heartbeat_at": "2026-10-27T09:27:23.938337Z",
  "last_location_at": "2026-10-27T09:27:23.938337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/817ee3f9-04a6-424e-adcc-2d92e2f0faff/handover` → **200**

```json
{
  "command_id": "ab915db5-5da5-45fb-865d-6124ab23149d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "817ee3f9-04a6-424e-adcc-2d92e2f0faff",
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
  "last_heartbeat_at": "2026-10-27T09:27:23.938337Z",
  "last_location_at": "2026-10-27T09:27:23.938337Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/817ee3f9-04a6-424e-adcc-2d92e2f0faff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:30Z",
    "sequence": 1793093250331
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "817ee3f9-04a6-424e-adcc-2d92e2f0faff",
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
  "last_heartbeat_at": "2026-10-27T09:27:30.34916Z",
  "last_location_at": "2026-10-27T09:27:30.34916Z",
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
  "session_id": "67e86ab1-2fe9-442a-95f2-a15831716bfd",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNTAsImlhdCI6MTc5MzA5MzI1MCwianRpIjoiYTZhM2JmZDQtNjJiOC00NmE4LWE2MjgtNzBlMzQ2MzVhNDBhIiwic2lkIjoiNjdlODZhYjEtMmZlOS00NDJhLTk1ZjItYTE1ODMxNzE2YmZkIn0.oX1bFxO5DIp_kf-pw0oySMXHGERgJF8ctWmea4NyFEg",
  "access_expires_at": "2026-10-27T09:42:30.714457081Z",
  "refresh_token": "Sz4woDv8ADZ9LF8ZqsLrH8qy_aGycR9lIhEZ1HKkR8k",
  "refresh_expires_at": "2026-10-27T21:27:30.713868243Z",
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
  "session_id": "242fa00c-2a26-4be3-98b8-d48075899c9d",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNTEsImlhdCI6MTc5MzA5MzI1MSwianRpIjoiZDUxNjU3MzktMzdlNC00ZDRkLWIwNmQtYjM0NDU5MjMxOGY2Iiwic2lkIjoiMjQyZmEwMGMtMmEyNi00YmUzLTk4YjgtZDQ4MDc1ODk5YzlkIn0.4WecdF7Iews9RAixv8FptcOBviiSzhXnbusnTTM3VCc",
  "access_expires_at": "2026-10-27T09:42:31.077851806Z",
  "refresh_token": "LB-LTStr1fEETAG9SjH6TWqX8dohEq0SD1FpG8IExKM",
  "refresh_expires_at": "2026-10-27T21:27:31.077177131Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bffce43c-707f-40b8-b2bf-0e675fff73f9` → **200**

```json
{
  "id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
  "short_number": 4,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a76b505f-205b-40e4-a612-fa9616a26534",
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
    "id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61",
    "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5c01eda8-e0cd-4f0d-8a73-b521dda21a5b",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T09:27:29.867793Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bffce43c-707f-40b8-b2bf-0e675fff73f9/interrupt` → **200**

```json
{
  "command_id": "9f94fc9e-9f23-483b-8a5a-d0db943feedb",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
    "short_number": 4,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "a76b505f-205b-40e4-a612-fa9616a26534",
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
      "id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61",
      "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5c01eda8-e0cd-4f0d-8a73-b521dda21a5b",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T09:27:29.867793Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
    "short_number": 5,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "a76b505f-205b-40e4-a612-fa9616a26534",
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
    "id": "a27c59f6-9947-4dc4-8f09-8e74e1b86757",
    "order_id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
    "expires_at": "2026-10-27T09:27:46.1964Z",
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
    "distance_m": 556
  }
]
```

`POST /api/driver/v1/offers/a27c59f6-9947-4dc4-8f09-8e74e1b86757/accept` → **200**

```json
{
  "command_id": "23d52bd8-803c-4b70-9e11-68c46ffb46c4"
}
```

```json
{
  "id": "c432f4f3-a072-4e00-a557-188427552760",
  "order_id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3cedeaee-255a-48c8-b4a9-dda7c30d3f0b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3cedeaee-255a-48c8-b4a9-dda7c30d3f0b",
  "order_id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
  "assignment_id": "c432f4f3-a072-4e00-a557-188427552760",
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
  "needs_review": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "817ee3f9-04a6-424e-adcc-2d92e2f0faff",
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
  "last_heartbeat_at": "2026-10-27T09:27:30.34916Z",
  "last_location_at": "2026-10-27T09:27:30.34916Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/817ee3f9-04a6-424e-adcc-2d92e2f0faff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:31Z",
    "sequence": 1793093251348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "817ee3f9-04a6-424e-adcc-2d92e2f0faff",
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
  "last_heartbeat_at": "2026-10-27T09:27:31.365346Z",
  "last_location_at": "2026-10-27T09:27:31.365346Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3cedeaee-255a-48c8-b4a9-dda7c30d3f0b/arrive` → **200**

```json
{
  "command_id": "27ec3a44-f446-476d-a4b6-338d913e2417",
  "expected_version": 0
}
```

```json
{
  "id": "3cedeaee-255a-48c8-b4a9-dda7c30d3f0b",
  "order_id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
  "assignment_id": "c432f4f3-a072-4e00-a557-188427552760",
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
  "arrived_at": "2026-10-27T09:27:31.406825Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3cedeaee-255a-48c8-b4a9-dda7c30d3f0b/start` → **200**

```json
{
  "command_id": "2e71f200-1660-47eb-b61e-06ad1a299da7",
  "expected_version": 1
}
```

```json
{
  "id": "3cedeaee-255a-48c8-b4a9-dda7c30d3f0b",
  "order_id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
  "assignment_id": "c432f4f3-a072-4e00-a557-188427552760",
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
  "arrived_at": "2026-10-27T09:27:31.406825Z",
  "started_at": "2026-10-27T09:27:31.451246Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3cedeaee-255a-48c8-b4a9-dda7c30d3f0b/complete` → **200**

```json
{
  "command_id": "aca1caee-5c56-427d-b7db-7efea958c516",
  "expected_version": 2,
  "reported_at": "2026-10-27T09:27:31Z"
}
```

```json
{
  "id": "3cedeaee-255a-48c8-b4a9-dda7c30d3f0b",
  "order_id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
  "assignment_id": "c432f4f3-a072-4e00-a557-188427552760",
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
  "arrived_at": "2026-10-27T09:27:31.406825Z",
  "started_at": "2026-10-27T09:27:31.451246Z",
  "completed_at": "2026-10-27T09:27:31.49984Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "c3f9412d-aa5a-4601-a4f3-cb397e42b0d1",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T09:27:31.185656Z",
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
    "id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:27:29.867793Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
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
      "balance_minor": 11113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/bffce43c-707f-40b8-b2bf-0e675fff73f9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:27:29.86849Z",
      "actor": {
        "type": "CLIENT",
        "id": "a76b505f-205b-40e4-a612-fa9616a26534",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
        "quote_id": "8b0aaed6-92d9-4e39-b043-a2a4d91ebf69",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:27:29.870787Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
        "attempt_id": "0175f93b-0644-4bed-90b5-19f235dcc335",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:27:29.876932Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3508eb78-5722-464a-a93f-a25802537b33",
        "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:27:29.942401Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3508eb78-5722-464a-a93f-a25802537b33",
        "order_id": "bffce43c-707f-40b8-b2bf-0e675fff73f9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4a2b8176-90a8-4a8f-a3cf-64d3e5eb8b61"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted bffce43c-707f-40b8-b2bf-0e675fff73f9, follow-up c3f9412d-aa5a-4601-a4f3-cb397e42b0d1.

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
  "session_id": "5385839e-04ac-4301-bd09-4083bcc4dbd6",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNTQsImlhdCI6MTc5MzA5MzI1NCwianRpIjoiNGQwMDc1MTMtNjA5ZC00MDMzLWFhMTMtN2QwNzUyMTBkNDQzIiwic2lkIjoiNTM4NTgzOWUtMDRhYy00MzAxLWJkMDktNDA4M2JjYzRkYmQ2In0.pELue4g8Vywhy8pr58aCZrcAm5c1_jsQbU-n0pM6u4Y",
  "access_expires_at": "2026-10-27T09:42:34.978593178Z",
  "refresh_token": "Kh5kSUU883xuPFVrwRG3-KjRsEtDrvV3aFFa3ZZm7SI",
  "refresh_expires_at": "2026-10-27T21:27:34.977877525Z",
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
  "command_id": "4696ef4e-37f2-49f5-9c81-0c84d06cc7fb",
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
  "changed_by": "c5feef8a-a37b-4171-b58e-0a7af3d733f4",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T09:27:35.058415802Z"
}
```

## The rider books the airport for 2026-10-27T12:27:34Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600802154",
  "device_ref": "sandbox-26130"
}
```

```json
{
  "challenge_id": "57539e22-68b2-4624-a015-5c52a404ecaf",
  "expires_at": "2026-10-27T09:32:35.096250266Z",
  "resend_available_at": "2026-10-27T09:27:36.096250266Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600802154` → **200**

```json
{
  "phone": "+48600802154",
  "audience": "CLIENT",
  "code": "643635",
  "sent_at": "2026-10-27T09:27:35.099202461Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "57539e22-68b2-4624-a015-5c52a404ecaf",
  "code": "643635",
  "device_ref": "sandbox-26130"
}
```

```json
{
  "session_id": "0bb70789-397c-4c1f-800c-5027c2582170",
  "subject": {
    "type": "CLIENT",
    "id": "b804121b-a6eb-43a1-a545-7d13b6e7d2e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODA0MTIxYi1hNmViLTQzYTEtYTU0NS03ZDEzYjZlN2QyZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk0MTU1LCJpYXQiOjE3OTMwOTMyNTUsImp0aSI6IjhhM2M1OGMzLWY5MmQtNGE5Ni1iM2MxLTFhMGU4ZmMzYjQyNCIsInNpZCI6IjBiYjcwNzg5LTM5N2MtNGMxZi04MDBjLTUwMjdjMjU4MjE3MCJ9.cBvJ4GJroGoqE2ODn97S-f19qtqqZ1zvQlRcB7uxyVc",
  "access_expires_at": "2026-10-27T09:42:35.15796798Z",
  "refresh_token": "Dd6iRSn-w646UB9u-BSdmveR6wXuyxK2mWmV0qh9P1s",
  "refresh_expires_at": "2026-11-26T09:27:35.157348038Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9083995e-96a3-4d88-9cbc-88ccb78c86c7",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T12:27:34Z"
}
```

```json
{
  "id": "12f8eba9-435f-4717-8bdb-f53d5a0af83e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T09:32:35.199563Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T12:27:34Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6ef29b77-bbce-4bdb-a214-96c200b24db5",
  "quote_id": "12f8eba9-435f-4717-8bdb-f53d5a0af83e",
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
  "pickup_at": "2026-10-27T12:27:34Z"
}
```

```json
{
  "id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
  "short_number": 6,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b804121b-a6eb-43a1-a545-7d13b6e7d2e0",
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
  "created_at": "2026-10-27T09:27:35.240171Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T12:27:34Z",
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
  "device_ref": "sandbox-11983"
}
```

```json
{
  "challenge_id": "e9b3c1cb-7c62-4680-a730-bb8b0abd124a",
  "expires_at": "2026-10-27T09:32:35.277267695Z",
  "resend_available_at": "2026-10-27T09:27:36.277267695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "298517",
  "sent_at": "2026-10-27T09:27:35.280627781Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9b3c1cb-7c62-4680-a730-bb8b0abd124a",
  "code": "298517",
  "device_ref": "sandbox-11983"
}
```

```json
{
  "session_id": "2dba4ddb-f522-4693-b856-d2343db9799c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NDE1NSwiaWF0IjoxNzkzMDkzMjU1LCJqdGkiOiJlMzY1ZDI0OC04NjIxLTRkZDEtOWU1OC0wYzAwZDJlYjA5MWEiLCJzaWQiOiIyZGJhNGRkYi1mNTIyLTQ2OTMtYjg1Ni1kMjM0M2RiOTc5OWMifQ.MEC6QYlSKBTbd7SpU6BoV6RFaL482dyFUcj4mp1y1Ig",
  "access_expires_at": "2026-10-27T09:42:35.33832292Z",
  "refresh_token": "YnUIUJSe5gB1AQ-KlAje_vrbIhCa1l2lUw-T9r5U0o4",
  "refresh_expires_at": "2026-11-26T09:27:35.337694965Z",
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
  "command_id": "ba768c97-1e32-4b5f-bb62-69e9379e289e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:27:35Z",
    "sequence": 1793093255392
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "462bd5d7-9de3-4369-b97d-c412c9f116c6",
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
  "last_heartbeat_at": "2026-10-27T09:27:35.409088Z",
  "last_location_at": "2026-10-27T09:27:35.409088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
      "short_number": 6,
      "pickup_at": "2026-10-27T12:27:34Z",
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

`POST /api/driver/v1/preorders/19b77eba-4cda-4517-9aa4-3ed134f0663c/reserve` → **200**

```json
{
  "command_id": "b60b15c5-ed7c-4168-ab98-687b04765c8f"
}
```

```json
{
  "id": "0832d9e6-7824-4f65-bd86-f6954e5a6779",
  "state": "RESERVED",
  "order": {
    "order_id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
    "short_number": 6,
    "pickup_at": "2026-10-27T12:27:34Z",
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
  "reserved_at": "2026-10-27T09:27:35.48433Z",
  "confirm_from": "2026-10-27T11:57:34Z",
  "confirm_until": "2026-10-27T12:07:34Z",
  "drop_until": "2026-10-27T11:27:34Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "0832d9e6-7824-4f65-bd86-f6954e5a6779",
      "state": "RESERVED",
      "order": {
        "order_id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
        "short_number": 6,
        "pickup_at": "2026-10-27T12:27:34Z",
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
      "reserved_at": "2026-10-27T09:27:35.48433Z",
      "confirm_from": "2026-10-27T11:57:34Z",
      "confirm_until": "2026-10-27T12:07:34Z",
      "drop_until": "2026-10-27T11:27:34Z"
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
      "id": "0832d9e6-7824-4f65-bd86-f6954e5a6779",
      "state": "RESERVED",
      "order": {
        "order_id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
        "short_number": 6,
        "pickup_at": "2026-10-27T12:27:34Z",
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
      "reserved_at": "2026-10-27T09:27:35.48433Z",
      "confirm_from": "2026-10-27T11:57:34Z",
      "confirm_until": "2026-10-27T12:07:34Z",
      "drop_until": "2026-10-27T11:27:34Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/0832d9e6-7824-4f65-bd86-f6954e5a6779/confirm` → **409**

```json
{
  "command_id": "a215b61d-d839-4581-abca-cae297830653"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/0832d9e6-7824-4f65-bd86-f6954e5a6779/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "93cbba84-9c2e-4d4e-9e25-3ae7b4885e20"
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
  "session_id": "7301c12d-3124-46a7-b275-d9bf896d5d61",
  "subject": {
    "type": "STAFF",
    "id": "c5feef8a-a37b-4171-b58e-0a7af3d733f4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNWZlZWY4YS1hMzdiLTQxNzEtYjU4ZS0wYTdhZjNkNzMzZjQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTQxNTUsImlhdCI6MTc5MzA5MzI1NSwianRpIjoiZjg0OTEzZjItNWI2YS00Nzc3LThlMjMtNTA4NGEwNTE1NzcxIiwic2lkIjoiNzMwMWMxMmQtMzEyNC00NmE3LWIyNzUtZDliZjg5NmQ1ZDYxIn0.jvI55DdKW-7hOYV2Ku1b1sGwTRizAzJ-9AW4xJv6d90",
  "access_expires_at": "2026-10-27T09:42:35.949654145Z",
  "refresh_token": "Z92xTrG4lCAURSWuXQOSa6PoeApOyZtDB3rY5yHZc48",
  "refresh_expires_at": "2026-10-27T21:27:35.948918848Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/19b77eba-4cda-4517-9aa4-3ed134f0663c` → **200**

```json
{
  "id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
  "short_number": 6,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "b804121b-a6eb-43a1-a545-7d13b6e7d2e0",
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
  "created_at": "2026-10-27T09:27:35.240171Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T12:27:34Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "0832d9e6-7824-4f65-bd86-f6954e5a6779",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T09:27:35.48433Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/19b77eba-4cda-4517-9aa4-3ed134f0663c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T09:27:35.242056Z",
      "actor": {
        "type": "CLIENT",
        "id": "b804121b-a6eb-43a1-a545-7d13b6e7d2e0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
        "preorder": true,
        "quote_id": "12f8eba9-435f-4717-8bdb-f53d5a0af83e",
        "pickup_at": "2026-10-27T12:27:34Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T09:27:35.485586Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "19b77eba-4cda-4517-9aa4-3ed134f0663c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "0832d9e6-7824-4f65-bd86-f6954e5a6779"
      }
    }
  ]
}
```

Done: pre-order 19b77eba-4cda-4517-9aa4-3ed134f0663c, reservation 0832d9e6-7824-4f65-bd86-f6954e5a6779.
