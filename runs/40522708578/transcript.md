# Sandbox transcript (2026-10-27T14:37:09Z, a39c715)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637700208",
  "device_ref": "sandbox-28156"
}
```

```json
{
  "challenge_id": "ae32d936-4f8f-49d0-b69a-a71548eda1d9",
  "expires_at": "2026-10-27T14:42:09.313846398Z",
  "resend_available_at": "2026-10-27T14:37:10.313846398Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637700208` → **200**

```json
{
  "phone": "+380637700208",
  "audience": "CLIENT",
  "code": "057026",
  "sent_at": "2026-10-27T14:37:09.320948846Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae32d936-4f8f-49d0-b69a-a71548eda1d9",
  "code": "057026",
  "device_ref": "sandbox-28156"
}
```

```json
{
  "session_id": "9f09179f-d1e6-4b0c-bab9-b02b4be548a4",
  "subject": {
    "type": "CLIENT",
    "id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOGU0MjBjMS04ODg1LTQ3YTgtOGYxYi03ZTlhMDExMjgyZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzI5LCJpYXQiOjE3OTMxMTE4MjksImp0aSI6ImMyZDlkMWU0LTkyZTAtNDg0My05MzJkLWJjZTU0ZGExNzkyMCIsInNpZCI6IjlmMDkxNzlmLWQxZTYtNGIwYy1iYWI5LWIwMmI0YmU1NDhhNCJ9.SxXwgNtKLhhxvvcnvM6495O_TuAH-t32KrcpVyHmsdM",
  "access_expires_at": "2026-10-27T14:52:09.428998848Z",
  "refresh_token": "_Mbc-7p8yAItpQvuIL4B9aEohkqMKWNBZh8ugvMU2NM",
  "refresh_expires_at": "2026-11-26T14:37:09.426146011Z",
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
  "device_ref": "sandbox-15909"
}
```

```json
{
  "challenge_id": "cb34f07f-5864-49a2-8888-28f3cb8d121d",
  "expires_at": "2026-10-27T14:42:09.550098261Z",
  "resend_available_at": "2026-10-27T14:37:10.550098261Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "095116",
  "sent_at": "2026-10-27T14:37:09.554165414Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb34f07f-5864-49a2-8888-28f3cb8d121d",
  "code": "095116",
  "device_ref": "sandbox-15909"
}
```

```json
{
  "session_id": "f2b89199-8b09-4a32-ad95-7c25f1705e61",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjcyOSwiaWF0IjoxNzkzMTExODI5LCJqdGkiOiIxZmZhZGQ2Zi03NGI5LTRmYjgtYWQwMC04MjI0MmZmZjI0MzUiLCJzaWQiOiJmMmI4OTE5OS04YjA5LTRhMzItYWQ5NS03YzI1ZjE3MDVlNjEifQ.3nHRC3YJeIFGHELZUCrHrOE_cawVPWXO2M9quGALo90",
  "access_expires_at": "2026-10-27T14:52:09.61627175Z",
  "refresh_token": "54jla3o2vrqnhLYNDqZSuX6zKCYoJouGJtbcvfPDKbA",
  "refresh_expires_at": "2026-11-26T14:37:09.614936912Z",
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
  "correlation_id": "996a910c-b45b-441b-9454-d20be3f59461"
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
  "session_id": "543d6fbc-c61b-4737-9014-a1d41828f2d3",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3MzAsImlhdCI6MTc5MzExMTgzMCwianRpIjoiM2I0NWUxMWYtZjg2Ny00ZjI3LTk0ZmMtYmRkNzkzNTliYzRjIiwic2lkIjoiNTQzZDZmYmMtYzYxYi00NzM3LTkwMTQtYTFkNDE4MjhmMmQzIn0.bi34_auUTJr7eXy2eoKzQb-rEKwil0bdsZYIg9znGb8",
  "access_expires_at": "2026-10-27T14:52:10.318850731Z",
  "refresh_token": "u4v7PZb_bmqpphuhhaGb5L7pm_BiiutY7zEYfWqO-Do",
  "refresh_expires_at": "2026-10-28T02:37:10.317703202Z",
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
  "session_id": "edc759e6-63de-4470-a10f-816635621a8d",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3MzEsImlhdCI6MTc5MzExMTgzMSwianRpIjoiNDJjMWI1NmItMWZhNy00OGE4LWIzNWQtZjk5NTFkZWYwYTBiIiwic2lkIjoiZWRjNzU5ZTYtNjNkZS00NDcwLWExMGYtODE2NjM1NjIxYThkIn0.oXUKT46xa4NDi4btprbrk22u-smeQfFATX6yi8LJXns",
  "access_expires_at": "2026-10-27T14:52:11.569671903Z",
  "refresh_token": "sSmyV77Lhk8fdca9rOZd1XGc4qsbjugfrPfVX4ivooM",
  "refresh_expires_at": "2026-10-28T02:37:11.568641397Z",
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
  "session_id": "fd368018-6548-4a7b-9074-d5384216f669",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3MzEsImlhdCI6MTc5MzExMTgzMSwianRpIjoiNDczYjBkZjctYWM2Ni00ZjZhLTg4MzAtMjc5ZWUzNzNmNmQwIiwic2lkIjoiZmQzNjgwMTgtNjU0OC00YTdiLTkwNzQtZDUzODQyMTZmNjY5In0.whUsYUbxAKQ5nPLxrWtmeG5feW4qZzKxmjqDwaRbInE",
  "access_expires_at": "2026-10-27T14:52:11.895888815Z",
  "refresh_token": "q0R7i7XsQ9eSiCkfrAtMishYA_XzGUWMcR5vSIyrxUU",
  "refresh_expires_at": "2026-10-28T02:37:11.894774431Z",
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
  "command_id": "289a132d-c5ee-46e0-9d84-2d409a6944e3",
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
  "id": "05c86452-650f-4f9e-969c-174e3f787983",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:42:12.028782Z",
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
  "command_id": "30d726f6-8386-4048-8776-80a1e9078f41",
  "quote_id": "05c86452-650f-4f9e-969c-174e3f787983",
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
  "id": "e1261a5d-7d63-4ab2-8820-0bdd4eed9081",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa",
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
  "created_at": "2026-10-27T14:37:12.130887Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/e1261a5d-7d63-4ab2-8820-0bdd4eed9081` → **200**

```json
{
  "id": "e1261a5d-7d63-4ab2-8820-0bdd4eed9081",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa",
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
  "created_at": "2026-10-27T14:37:12.130887Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/e1261a5d-7d63-4ab2-8820-0bdd4eed9081/cancel` → **200**

```json
{
  "command_id": "d8b1a933-c4cf-48be-b3f3-b7858db3db46",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "e1261a5d-7d63-4ab2-8820-0bdd4eed9081",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa",
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
  "created_at": "2026-10-27T14:37:12.130887Z",
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
  "command_id": "d443d9ea-ec58-48b2-9f8c-67cdad593dc9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:12Z",
    "sequence": 1793111832357
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b613fbfb-beaa-4d3a-bd2e-79c497e24b14",
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
  "last_heartbeat_at": "2026-10-27T14:37:12.414562Z",
  "last_location_at": "2026-10-27T14:37:12.414562Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27917"
}
```

```json
{
  "challenge_id": "df4ed767-5367-442d-a715-0320f45e0c35",
  "expires_at": "2026-10-27T14:42:12.462521068Z",
  "resend_available_at": "2026-10-27T14:37:13.462521068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "549510",
  "sent_at": "2026-10-27T14:37:12.466697526Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df4ed767-5367-442d-a715-0320f45e0c35",
  "code": "549510",
  "device_ref": "sandbox-27917"
}
```

```json
{
  "session_id": "19f45337-972b-4cdf-a164-fc9e5aa9fa75",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjczMiwiaWF0IjoxNzkzMTExODMyLCJqdGkiOiIxYjc0NjUxMC0yNjI1LTQwNGMtYjJmYi03MGVjMGMwNDQ1ZDkiLCJzaWQiOiIxOWY0NTMzNy05NzJiLTRjZGYtYTE2NC1mYzllNWFhOWZhNzUifQ._0AN9EHGLhX9hpk-MAo-eEUOVAIXo9XL7SwalCVIby0",
  "access_expires_at": "2026-10-27T14:52:12.535696152Z",
  "refresh_token": "fCHaikqyVMfeHucSV1dA4DuFY_d1EtUlTPsCihRvR80",
  "refresh_expires_at": "2026-11-26T14:37:12.534775933Z",
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
  "command_id": "afc5ed57-6fb9-43fa-8f8c-b4e75acd0d71",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:12Z",
    "sequence": 1793111832589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
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
  "last_heartbeat_at": "2026-10-27T14:37:12.606232Z",
  "last_location_at": "2026-10-27T14:37:12.606232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f2ce18a-f239-4102-ac7f-e09710dd8d72",
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
  "id": "51a5342d-57a8-4330-a645-6965329b8547",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:42:12.651739Z",
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
  "command_id": "05f2558d-2ae0-45e6-a0d3-a9ead8f87dab",
  "quote_id": "51a5342d-57a8-4330-a645-6965329b8547",
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
  "id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa",
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
  "created_at": "2026-10-27T14:37:12.709125Z",
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
    "id": "3e7b8364-6d8c-4e15-b4a2-4eb54af9c5ff",
    "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
    "expires_at": "2026-10-27T14:37:27.716126Z",
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

`POST /api/driver/v1/offers/3e7b8364-6d8c-4e15-b4a2-4eb54af9c5ff/accept` → **200**

```json
{
  "command_id": "f91686cc-6794-430e-94bb-c26f995253aa"
}
```

```json
{
  "id": "b26ac89c-9c65-420d-9a03-009ab43ee6a5",
  "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cdd86020-f53f-4452-88fe-bd0f3f4da16e",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cdd86020-f53f-4452-88fe-bd0f3f4da16e",
  "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "assignment_id": "b26ac89c-9c65-420d-9a03-009ab43ee6a5",
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

`POST /api/driver/v1/trips/cdd86020-f53f-4452-88fe-bd0f3f4da16e/cancel` → **200**

```json
{
  "command_id": "90b7db49-8675-4c39-abcc-a081356cc1a1",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "cdd86020-f53f-4452-88fe-bd0f3f4da16e",
  "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "assignment_id": "b26ac89c-9c65-420d-9a03-009ab43ee6a5",
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

`GET /api/rider/v1/orders/21dcb03a-556f-4ba7-9092-ac3f5bda7a6a` → **200**

```json
{
  "id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa",
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
    "id": "b26ac89c-9c65-420d-9a03-009ab43ee6a5",
    "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "cdd86020-f53f-4452-88fe-bd0f3f4da16e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T14:37:12.709125Z",
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
    "id": "472b15af-6e55-404e-b7a7-89e97b1263c4",
    "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
    "expires_at": "2026-10-27T14:37:27.958685Z",
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

`POST /api/driver/v1/offers/472b15af-6e55-404e-b7a7-89e97b1263c4/accept` → **200**

```json
{
  "command_id": "3c95675e-de9d-488e-9897-933e922bc973"
}
```

```json
{
  "id": "64c7eb87-92e1-4a42-a993-9c9048f0d56a",
  "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "28950240-266c-4393-a67f-b899652c7469",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28950240-266c-4393-a67f-b899652c7469",
  "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "assignment_id": "64c7eb87-92e1-4a42-a993-9c9048f0d56a",
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

`POST /api/driver/v1/trips/28950240-266c-4393-a67f-b899652c7469/cancel` → **200**

```json
{
  "command_id": "9b9a0658-ed6d-4a93-9a6f-a917b49c332b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "28950240-266c-4393-a67f-b899652c7469",
  "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
  "assignment_id": "64c7eb87-92e1-4a42-a993-9c9048f0d56a",
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
    "id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:37:12.709125Z",
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
    "id": "e1261a5d-7d63-4ab2-8820-0bdd4eed9081",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:37:12.130887Z",
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

`GET /api/operator/v1/orders/21dcb03a-556f-4ba7-9092-ac3f5bda7a6a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:37:12.710993Z",
      "actor": {
        "type": "CLIENT",
        "id": "d8e420c1-8885-47a8-8f1b-7e9a011282fa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
        "quote_id": "51a5342d-57a8-4330-a645-6965329b8547",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:37:12.714433Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
        "attempt_id": "83bfb167-2fe2-41f1-a737-75776b7411cb",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:37:12.743707Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3e7b8364-6d8c-4e15-b4a2-4eb54af9c5ff",
        "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:37:12.827486Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3e7b8364-6d8c-4e15-b4a2-4eb54af9c5ff",
        "order_id": "21dcb03a-556f-4ba7-9092-ac3f5bda7a6a",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "b26ac89c-9c65-420d-9a03-009ab43ee6a5"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders e1261a5d-7d63-4ab2-8820-0bdd4eed9081, 21dcb03a-556f-4ba7-9092-ac3f5bda7a6a.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738764829",
  "device_ref": "sandbox-24312"
}
```

```json
{
  "challenge_id": "15e5346e-9de6-4cde-8bfb-36b09dffb759",
  "expires_at": "2026-10-27T14:42:13.268278793Z",
  "resend_available_at": "2026-10-27T14:37:14.268278793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738764829` → **200**

```json
{
  "phone": "+380738764829",
  "audience": "CLIENT",
  "code": "376982",
  "sent_at": "2026-10-27T14:37:13.272205095Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "15e5346e-9de6-4cde-8bfb-36b09dffb759",
  "code": "376982",
  "device_ref": "sandbox-24312"
}
```

```json
{
  "session_id": "3135babb-3f5d-4c7e-99c0-69c204c15671",
  "subject": {
    "type": "CLIENT",
    "id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMmM1MjZjMi1hNGE0LTQ1NDctYmY2Ny1mZjYzZGM4OWEwNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzMzLCJpYXQiOjE3OTMxMTE4MzMsImp0aSI6Ijc0YWE1M2I0LTliY2YtNDY2OS1hYzRmLWNlZmRjOWI0MmY3OCIsInNpZCI6IjMxMzViYWJiLTNmNWQtNGM3ZS05OWMwLTY5YzIwNGMxNTY3MSJ9.P2bNW9-nLjpoaovI2U345Pm-xJ6eVHrQ9vTOBDospLE",
  "access_expires_at": "2026-10-27T14:52:13.338156588Z",
  "refresh_token": "OEuykk48owHUYU2eRrGsHwNFcikMGcSNYYIvwOj5Q4w",
  "refresh_expires_at": "2026-11-26T14:37:13.337176124Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "99d64a88-c8e3-42e8-a984-9f4ea3b92f7f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d3ee7766-883a-4ab1-a7bc-9b3dcc0e28c6",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d3ee7766-883a-4ab1-a7bc-9b3dcc0e28c6",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a0382171c9a567ea38d351e931162536",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d3ee7766-883a-4ab1-a7bc-9b3dcc0e28c6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738764829"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d3ee7766-883a-4ab1-a7bc-9b3dcc0e28c6",
  "expires_at": "2026-10-27T15:07:13.386377Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d3ee7766-883a-4ab1-a7bc-9b3dcc0e28c6` → **200**

```json
{
  "id": "d3ee7766-883a-4ab1-a7bc-9b3dcc0e28c6",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:07:13.386377Z",
  "card": {
    "id": "04019ee2-9450-4dd4-a930-cde1c684eb02",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7771",
    "card_type": "Visa",
    "created_at": "2026-10-27T14:37:13.44259Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "04019ee2-9450-4dd4-a930-cde1c684eb02",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7771",
      "card_type": "Visa",
      "created_at": "2026-10-27T14:37:13.44259Z"
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
  "device_ref": "sandbox-2308"
}
```

```json
{
  "challenge_id": "104d4cf2-131e-4569-8630-3208ae795f07",
  "expires_at": "2026-10-27T14:42:13.532187008Z",
  "resend_available_at": "2026-10-27T14:37:14.532187008Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "519635",
  "sent_at": "2026-10-27T14:37:13.536258068Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "104d4cf2-131e-4569-8630-3208ae795f07",
  "code": "519635",
  "device_ref": "sandbox-2308"
}
```

```json
{
  "session_id": "9619c61f-8196-4550-ad4a-b6e6bfbcbe7e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjczMywiaWF0IjoxNzkzMTExODMzLCJqdGkiOiI2YzU0N2Q1ZC02YTU4LTQ3MTItYTFjNy0xZTk4ZWRiNzNiYmYiLCJzaWQiOiI5NjE5YzYxZi04MTk2LTQ1NTAtYWQ0YS1iNmU2YmZiY2JlN2UifQ.s1RsPdGZdw7m5Lt5pOTYA7zrO8GO316eaLs3SWj175U",
  "access_expires_at": "2026-10-27T14:52:13.599127471Z",
  "refresh_token": "iS5yRHeyEf-TCpXvMvp_nX9DibnqBGNLVzrbKwcAx7s",
  "refresh_expires_at": "2026-11-26T14:37:13.598231517Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
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
  "last_heartbeat_at": "2026-10-27T14:37:12.606232Z",
  "last_location_at": "2026-10-27T14:37:12.606232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b75ce16-96e3-4479-bc31-40e2a1ea1013/handover` → **200**

```json
{
  "command_id": "a0d7f745-90e9-4abd-8c74-e161adb23d26",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
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
  "last_heartbeat_at": "2026-10-27T14:37:12.606232Z",
  "last_location_at": "2026-10-27T14:37:12.606232Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6b75ce16-96e3-4479-bc31-40e2a1ea1013/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:13Z",
    "sequence": 1793111833709
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
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
  "last_heartbeat_at": "2026-10-27T14:37:13.729931Z",
  "last_location_at": "2026-10-27T14:37:13.729931Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91169ed7-fbc1-4b18-9edf-b7efa54fa941",
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
  "id": "0411510e-c71c-4f0d-bd55-2de971d41514",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T14:42:13.773427Z",
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
  "command_id": "dcb05f82-c231-4fc0-9bc3-101040ffe36f",
  "quote_id": "0411510e-c71c-4f0d-bd55-2de971d41514",
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
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/331c9d4c-a5fd-4299-9049-eb623b44a662` → **200**

```json
{
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/331c9d4c-a5fd-4299-9049-eb623b44a662` → **200**

```json
{
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2354d624-d8c4-4560-aa5f-74c3553b447c",
    "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
    "expires_at": "2026-10-27T14:37:28.95652Z",
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

`POST /api/driver/v1/offers/2354d624-d8c4-4560-aa5f-74c3553b447c/accept` → **200**

```json
{
  "command_id": "eef7f1d0-c1f5-4b2c-b47e-2578fb08cfbd"
}
```

```json
{
  "id": "105f2b0c-017a-4899-81b9-63fee00759ff",
  "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
  "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "assignment_id": "105f2b0c-017a-4899-81b9-63fee00759ff",
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
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/6b75ce16-96e3-4479-bc31-40e2a1ea1013/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:15Z",
    "sequence": 1793111835821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
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
  "last_heartbeat_at": "2026-10-27T14:37:15.025416Z",
  "last_location_at": "2026-10-27T14:37:15.025416Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0b3b3c7e-8339-407f-b466-dcfba1ee3231/arrive` → **200**

```json
{
  "command_id": "7fefef5a-b06c-495e-922c-db79fd810540",
  "expected_version": 0
}
```

```json
{
  "id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
  "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "assignment_id": "105f2b0c-017a-4899-81b9-63fee00759ff",
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
  "arrived_at": "2026-10-27T14:37:15.06992Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/0b3b3c7e-8339-407f-b466-dcfba1ee3231/start` → **200**

```json
{
  "command_id": "b6214395-cb13-456c-8169-8f93fc1b596c",
  "expected_version": 1
}
```

```json
{
  "id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
  "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "assignment_id": "105f2b0c-017a-4899-81b9-63fee00759ff",
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
  "arrived_at": "2026-10-27T14:37:15.06992Z",
  "started_at": "2026-10-27T14:37:15.114133Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/0b3b3c7e-8339-407f-b466-dcfba1ee3231/complete` → **200**

```json
{
  "command_id": "753c4cef-e35e-430e-a7a8-a356117fe073",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:37:15Z"
}
```

```json
{
  "id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
  "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "assignment_id": "105f2b0c-017a-4899-81b9-63fee00759ff",
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
  "arrived_at": "2026-10-27T14:37:15.06992Z",
  "started_at": "2026-10-27T14:37:15.114133Z",
  "completed_at": "2026-10-27T14:37:15.169016Z",
  "needs_review": false
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/331c9d4c-a5fd-4299-9049-eb623b44a662` → **200**

```json
{
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
    "id": "105f2b0c-017a-4899-81b9-63fee00759ff",
    "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/331c9d4c-a5fd-4299-9049-eb623b44a662` → **200**

```json
{
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
    "id": "105f2b0c-017a-4899-81b9-63fee00759ff",
    "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/331c9d4c-a5fd-4299-9049-eb623b44a662` → **200**

```json
{
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
    "id": "105f2b0c-017a-4899-81b9-63fee00759ff",
    "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/331c9d4c-a5fd-4299-9049-eb623b44a662` → **200**

```json
{
  "id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "12c526c2-a4a4-4547-bf67-ff63dc89a04c",
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
    "id": "105f2b0c-017a-4899-81b9-63fee00759ff",
    "order_id": "331c9d4c-a5fd-4299-9049-eb623b44a662",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0b3b3c7e-8339-407f-b466-dcfba1ee3231",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:37:13.814032Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
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

Done: card order 331c9d4c-a5fd-4299-9049-eb623b44a662.

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
  "device_ref": "sandbox-3796"
}
```

```json
{
  "challenge_id": "a76ad9a9-0843-4248-8553-59a0f7ea4bac",
  "expires_at": "2026-10-27T14:42:18.405722294Z",
  "resend_available_at": "2026-10-27T14:37:19.405722294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "711549",
  "sent_at": "2026-10-27T14:37:18.408655488Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a76ad9a9-0843-4248-8553-59a0f7ea4bac",
  "code": "711549",
  "device_ref": "sandbox-3796"
}
```

```json
{
  "session_id": "ca9f48f6-4a5e-4417-b77c-84e91a70343f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjczOCwiaWF0IjoxNzkzMTExODM4LCJqdGkiOiIyNTM4ZTRjZS1lMTc0LTRiYzEtYjQ5OS1lNjdhYTc1ZDEzZmUiLCJzaWQiOiJjYTlmNDhmNi00YTVlLTQ0MTctYjc3Yy04NGU5MWE3MDM0M2YifQ.JDqNmfBfsS5gAyptUgauhGF910CHGwErUDIXA6bqEH8",
  "access_expires_at": "2026-10-27T14:52:18.470971462Z",
  "refresh_token": "KoNKNeGmz7hIQfJTOkxl-p3DvFgi5lEG2Wg4Fyrzor8",
  "refresh_expires_at": "2026-11-26T14:37:18.470136512Z",
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
  "command_id": "8a8326df-8691-442d-bfef-0093c859267c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:18Z",
    "sequence": 1793111838525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:18.542203Z",
  "last_location_at": "2026-10-27T14:37:18.542203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673032437",
  "device_ref": "sandbox-23045"
}
```

```json
{
  "challenge_id": "ce767b32-07e0-499d-9641-c4aed04640e8",
  "expires_at": "2026-10-27T14:42:18.577307661Z",
  "resend_available_at": "2026-10-27T14:37:19.577307661Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673032437` → **200**

```json
{
  "phone": "+380673032437",
  "audience": "CLIENT",
  "code": "700108",
  "sent_at": "2026-10-27T14:37:18.580347791Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ce767b32-07e0-499d-9641-c4aed04640e8",
  "code": "700108",
  "device_ref": "sandbox-23045"
}
```

```json
{
  "session_id": "a306c8d0-07f4-4480-a296-b7939ade9014",
  "subject": {
    "type": "CLIENT",
    "id": "7e6d4332-798f-4f59-bf23-474a5108d192"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTZkNDMzMi03OThmLTRmNTktYmYyMy00NzRhNTEwOGQxOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzM4LCJpYXQiOjE3OTMxMTE4MzgsImp0aSI6ImMzYzRiNzc4LTBkZjUtNDg4Ni04MDJlLWE3Mzg5MjI2ZDA4YyIsInNpZCI6ImEzMDZjOGQwLTA3ZjQtNDQ4MC1hMjk2LWI3OTM5YWRlOTAxNCJ9.r3BIgfpvAfoPBIIB2eRUJfdZSNHks2EW9j3nTOcwujM",
  "access_expires_at": "2026-10-27T14:52:18.638403175Z",
  "refresh_token": "hkXNh61Bqyz0p-0qT3OZZCUUClwhlL7V-zsbgZJFPiQ",
  "refresh_expires_at": "2026-11-26T14:37:18.637663328Z",
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
  "command_id": "14750861-fe5d-4523-9947-96749ca28e02",
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
  "id": "d128b401-c431-4d39-bc8a-4a8c3a2d3788",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:42:18.706333Z",
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
  "command_id": "3b1e6de9-bd5b-4229-8ec0-2638bca86e0d",
  "quote_id": "d128b401-c431-4d39-bc8a-4a8c3a2d3788",
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
  "id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e6d4332-798f-4f59-bf23-474a5108d192",
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
  "created_at": "2026-10-27T14:37:18.748044Z",
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
    "id": "b32912a5-d12c-404b-bbc5-64216390aef2",
    "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
    "expires_at": "2026-10-27T14:37:33.75229Z",
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

`POST /api/driver/v1/offers/b32912a5-d12c-404b-bbc5-64216390aef2/accept` → **200**

```json
{
  "command_id": "5b360c8c-f707-40fc-bc61-ac8d6bb868d2"
}
```

```json
{
  "id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/33e760a8-a78c-44e6-9f0e-477095e264f7/messages` → **201**

```json
{
  "command_id": "9276e582-d369-444d-aebe-743deff64811",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "5b47e98a-0c0b-4a10-9071-5ad18dcd40d4",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:37:18.872040169Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "assignment_id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
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

`POST /api/driver/v1/trips/e0245fdc-5dcd-4f83-8f7e-9c49a783649a/messages` → **201**

```json
{
  "command_id": "de86daa3-155f-49d8-9491-d5c36e8df828",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "33a5aad9-0d24-4ef3-addd-a6e780cfe222",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:37:18.933636895Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/33e760a8-a78c-44e6-9f0e-477095e264f7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/e0245fdc-5dcd-4f83-8f7e-9c49a783649a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673032437"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:19Z",
    "sequence": 1793111839154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:19.032111Z",
  "last_location_at": "2026-10-27T14:37:19.032111Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "assignment_id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
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

`POST /api/driver/v1/trips/e0245fdc-5dcd-4f83-8f7e-9c49a783649a/arrive` → **200**

```json
{
  "command_id": "cc618b97-a5c8-4a69-a1d5-2518dc188703",
  "expected_version": 0
}
```

```json
{
  "id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "assignment_id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
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
  "arrived_at": "2026-10-27T14:37:19.094402Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/e0245fdc-5dcd-4f83-8f7e-9c49a783649a/start` → **200**

```json
{
  "command_id": "27089543-fb4f-42ca-bd33-941c9ae867d7",
  "expected_version": 1
}
```

```json
{
  "id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "assignment_id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
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
  "arrived_at": "2026-10-27T14:37:19.094402Z",
  "started_at": "2026-10-27T14:37:19.130927Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:19Z",
    "sequence": 1793111839155
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:19.173221Z",
  "last_location_at": "2026-10-27T14:37:19.173221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/e0245fdc-5dcd-4f83-8f7e-9c49a783649a/complete` → **200**

```json
{
  "command_id": "b414b19f-4eff-48ae-b6df-64fe55b4f59e",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:37:19Z",
  "cash_received": true
}
```

```json
{
  "id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
  "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "assignment_id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
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
  "arrived_at": "2026-10-27T14:37:19.094402Z",
  "started_at": "2026-10-27T14:37:19.130927Z",
  "completed_at": "2026-10-27T14:37:19.212365Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/33e760a8-a78c-44e6-9f0e-477095e264f7` → **200**

```json
{
  "id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7e6d4332-798f-4f59-bf23-474a5108d192",
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
    "id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870",
    "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:37:18.748044Z",
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
    "id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
    "short_number": 4,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:37:18.748044Z",
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
    "id": "e0245fdc-5dcd-4f83-8f7e-9c49a783649a",
    "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
    "order_short_number": 4,
    "created_at": "2026-10-27T14:37:18.823365Z",
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
  "session_id": "a4d5337f-fe8d-492b-b32f-0beb8974c97e",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NDIsImlhdCI6MTc5MzExMTg0MiwianRpIjoiNTc4ZDM4OWYtMmU4Mi00ZmU4LTljZTMtNDg4YzFiOGVjNzA2Iiwic2lkIjoiYTRkNTMzN2YtZmU4ZC00OTJiLWIzMmYtMGJlYjg5NzRjOTdlIn0.3XDzmc28NUGwgOoJeSEj-1QF5X5shnOtAYdcRWzFmVI",
  "access_expires_at": "2026-10-27T14:52:22.658462186Z",
  "refresh_token": "nUAmrwjUWo3XAMeMVQyrK9b6e9nveXYyuJuvHhB4ieU",
  "refresh_expires_at": "2026-10-28T02:37:22.657761735Z",
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
  "session_id": "6e2aa163-6b97-4c1d-9ae0-6d94757416ee",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NDIsImlhdCI6MTc5MzExMTg0MiwianRpIjoiYTYyNWEzOGYtZDYzZC00ZTY5LThhZmYtMmI3NDZiYzFiNGMzIiwic2lkIjoiNmUyYWExNjMtNmI5Ny00YzFkLTlhZTAtNmQ5NDc1NzQxNmVlIn0.vCnB4dduYH6nWf_QAk5nN8axgTy--BbHR1XsVNWRET0",
  "access_expires_at": "2026-10-27T14:52:22.982402463Z",
  "refresh_token": "X7re_Y9yKH9KoAK24UfcP_QB1FtFTYyv91L9UqcpNDk",
  "refresh_expires_at": "2026-10-28T02:37:22.981736061Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/33e760a8-a78c-44e6-9f0e-477095e264f7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:37:18.748719Z",
      "actor": {
        "type": "CLIENT",
        "id": "7e6d4332-798f-4f59-bf23-474a5108d192",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
        "quote_id": "d128b401-c431-4d39-bc8a-4a8c3a2d3788",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:37:18.750926Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
        "attempt_id": "4c953f78-df1e-4e84-b3a6-73ea710457b8",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:37:18.757989Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b32912a5-d12c-404b-bbc5-64216390aef2",
        "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:37:18.825576Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b32912a5-d12c-404b-bbc5-64216390aef2",
        "order_id": "33e760a8-a78c-44e6-9f0e-477095e264f7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9095b2a4-3e01-45ac-8b86-1d0d3fe84870"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 33e760a8-a78c-44e6-9f0e-477095e264f7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13173"
}
```

```json
{
  "challenge_id": "5cc0c91b-0142-4e07-82c8-c9a15b93e6b7",
  "expires_at": "2026-10-27T14:42:23.049375122Z",
  "resend_available_at": "2026-10-27T14:37:24.049375122Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "045795",
  "sent_at": "2026-10-27T14:37:23.052333649Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5cc0c91b-0142-4e07-82c8-c9a15b93e6b7",
  "code": "045795",
  "device_ref": "sandbox-13173"
}
```

```json
{
  "session_id": "03e9c70c-25de-458c-b883-a10c4230e056",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc0MywiaWF0IjoxNzkzMTExODQzLCJqdGkiOiI1MzhiMTg1My00NmVhLTQ0ZjUtYjBmMS1jZWE2MzAyNzMyYmIiLCJzaWQiOiIwM2U5YzcwYy0yNWRlLTQ1OGMtYjg4My1hMTBjNDIzMGUwNTYifQ.FUc3W3Mxd04P-1hK62BphDT5l9PU61VMqawt0MrYV-0",
  "access_expires_at": "2026-10-27T14:52:23.111965405Z",
  "refresh_token": "NgUyKlVQNXnJt_T6YwAEbz-svxYWt01MPWdp-iVSsRg",
  "refresh_expires_at": "2026-11-26T14:37:23.111282066Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:19.173221Z",
  "last_location_at": "2026-10-27T14:37:19.173221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/handover` → **200**

```json
{
  "command_id": "e3cf5c4a-d347-4ae7-b555-81b5a6e0cb99",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:19.173221Z",
  "last_location_at": "2026-10-27T14:37:19.173221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:23Z",
    "sequence": 1793111843200
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.217058Z",
  "last_location_at": "2026-10-27T14:37:23.217058Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662232225",
  "device_ref": "sandbox-28499"
}
```

```json
{
  "challenge_id": "6e8a42cc-5533-461b-abdf-4923708ccd7c",
  "expires_at": "2026-10-27T14:42:23.243140217Z",
  "resend_available_at": "2026-10-27T14:37:24.243140217Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380662232225` → **200**

```json
{
  "phone": "+380662232225",
  "audience": "CLIENT",
  "code": "566416",
  "sent_at": "2026-10-27T14:37:23.246826461Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6e8a42cc-5533-461b-abdf-4923708ccd7c",
  "code": "566416",
  "device_ref": "sandbox-28499"
}
```

```json
{
  "session_id": "03aa8b89-518a-4fba-8d69-d90fc3870f52",
  "subject": {
    "type": "CLIENT",
    "id": "2558c626-84e4-48de-a9fa-9581e84158cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTU4YzYyNi04NGU0LTQ4ZGUtYTlmYS05NTgxZTg0MTU4Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzQzLCJpYXQiOjE3OTMxMTE4NDMsImp0aSI6ImY1ZDA3NjdlLTQ5ZmEtNDIwZC1hNGQyLWJmZDljOTQyMWJjYyIsInNpZCI6IjAzYWE4Yjg5LTUxOGEtNGZiYS04ZDY5LWQ5MGZjMzg3MGY1MiJ9.X5dq0wuhSEzQJzVIepF1LnigfvIcL6CHjbxyIsxb-2I",
  "access_expires_at": "2026-10-27T14:52:23.303516411Z",
  "refresh_token": "1K5InEhyaEaNdgbt8IhdDEDlzq2YJQcV7W-ABivWKt4",
  "refresh_expires_at": "2026-11-26T14:37:23.302891192Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb26e1fa-59ba-4168-9df5-d0aa98ebdeb9",
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
  "id": "bd457ecf-50e5-45f4-bacf-3652cc2efe4e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T14:42:23.340212Z",
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
  "command_id": "ab4c195c-b265-4837-96c7-0d609f2b71cb",
  "quote_id": "bd457ecf-50e5-45f4-bacf-3652cc2efe4e",
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
  "id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2558c626-84e4-48de-a9fa-9581e84158cb",
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
  "created_at": "2026-10-27T14:37:23.377646Z",
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
    "id": "8423d321-0986-4213-b070-bb50e9cfd595",
    "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
    "expires_at": "2026-10-27T14:37:38.381492Z",
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

`POST /api/driver/v1/offers/8423d321-0986-4213-b070-bb50e9cfd595/accept` → **200**

```json
{
  "command_id": "826f8683-44d2-4569-bf8b-aa291dd2878b"
}
```

```json
{
  "id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188",
  "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4350dc5-16d3-4766-8275-734f3e865b9c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4350dc5-16d3-4766-8275-734f3e865b9c",
  "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
  "assignment_id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188",
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

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:23Z",
    "sequence": 1793111843496
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.512783Z",
  "last_location_at": "2026-10-27T14:37:23.512783Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f4350dc5-16d3-4766-8275-734f3e865b9c/arrive` → **200**

```json
{
  "command_id": "4b401a0a-a2d7-4828-a615-b18665c866c5",
  "expected_version": 0
}
```

```json
{
  "id": "f4350dc5-16d3-4766-8275-734f3e865b9c",
  "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
  "assignment_id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188",
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
  "arrived_at": "2026-10-27T14:37:23.554468Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/f4350dc5-16d3-4766-8275-734f3e865b9c/start` → **200**

```json
{
  "command_id": "2681badf-3640-4fcf-b0f1-9d91a1676d65",
  "expected_version": 1
}
```

```json
{
  "id": "f4350dc5-16d3-4766-8275-734f3e865b9c",
  "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
  "assignment_id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188",
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
  "arrived_at": "2026-10-27T14:37:23.554468Z",
  "started_at": "2026-10-27T14:37:23.596338Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:23Z",
    "sequence": 1793111843622
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.638702Z",
  "last_location_at": "2026-10-27T14:37:23.638702Z",
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
  "device_ref": "sandbox-27824"
}
```

```json
{
  "challenge_id": "85225f9d-fc95-46fb-8ae8-a23edd4a930c",
  "expires_at": "2026-10-27T14:42:23.664131316Z",
  "resend_available_at": "2026-10-27T14:37:24.664131316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "291829",
  "sent_at": "2026-10-27T14:37:23.666903844Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85225f9d-fc95-46fb-8ae8-a23edd4a930c",
  "code": "291829",
  "device_ref": "sandbox-27824"
}
```

```json
{
  "session_id": "e6d2a568-3ecd-443b-bb81-720a15f62d32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc0MywiaWF0IjoxNzkzMTExODQzLCJqdGkiOiI2ZTk4ODhmNy05YTA4LTQ4YmQtOTc3Yy01MTY4ZDg4MjM1ODgiLCJzaWQiOiJlNmQyYTU2OC0zZWNkLTQ0M2ItYmI4MS03MjBhMTVmNjJkMzIifQ._S2jBcc-lzVQh9FR_s_vu9NMx1F6vpPJqqjzr-zii8w",
  "access_expires_at": "2026-10-27T14:52:23.722970555Z",
  "refresh_token": "1Up7T9Qq6P5JZKPeL-ozSf8h0rUBIP6_g1yqwfq0tI8",
  "refresh_expires_at": "2026-11-26T14:37:23.722328609Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b613fbfb-beaa-4d3a-bd2e-79c497e24b14",
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
  "last_heartbeat_at": "2026-10-27T14:37:12.414562Z",
  "last_location_at": "2026-10-27T14:37:12.414562Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b613fbfb-beaa-4d3a-bd2e-79c497e24b14/handover` → **200**

```json
{
  "command_id": "9d120d57-1fb6-4c85-81a2-dc8736997fb5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b613fbfb-beaa-4d3a-bd2e-79c497e24b14",
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
  "last_heartbeat_at": "2026-10-27T14:37:12.414562Z",
  "last_location_at": "2026-10-27T14:37:12.414562Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b613fbfb-beaa-4d3a-bd2e-79c497e24b14/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:23Z",
    "sequence": 1793111843813
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b613fbfb-beaa-4d3a-bd2e-79c497e24b14",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.829672Z",
  "last_location_at": "2026-10-27T14:37:23.829672Z",
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
  "session_id": "f4c753df-7bad-464c-92fc-ed5250bc180c",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NDQsImlhdCI6MTc5MzExMTg0NCwianRpIjoiODc3ZjMxNTgtZmRjOC00MDU0LTk3NmUtYTE4MDhjZWFkODczIiwic2lkIjoiZjRjNzUzZGYtN2JhZC00NjRjLTkyZmMtZWQ1MjUwYmMxODBjIn0.HEGWTnguw0rj3DO4p83rpkL9lK1ANsnJMLwxgO20PMI",
  "access_expires_at": "2026-10-27T14:52:24.15559816Z",
  "refresh_token": "s1_9UTnnOYNT_x1MAGjV6Tez69t0HhxSZ9f-_UjL5h0",
  "refresh_expires_at": "2026-10-28T02:37:24.155031866Z",
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
  "session_id": "0d2f2f58-6926-4783-92cd-62ebf4981139",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NDQsImlhdCI6MTc5MzExMTg0NCwianRpIjoiZWQ4Y2ZlOTEtMDcyNy00MGU2LWEzMzctNGMxYThhMWEwYmVjIiwic2lkIjoiMGQyZjJmNTgtNjkyNi00NzgzLTkyY2QtNjJlYmY0OTgxMTM5In0.Cq9_Lggim9uAjsCuxEa6oEiFDs0jal7CLqMZhQq5jXw",
  "access_expires_at": "2026-10-27T14:52:24.47889576Z",
  "refresh_token": "wjfR301pd9Ahs4Rz_Gg2eFPooDEPnvzCb_OmK-qFyDo",
  "refresh_expires_at": "2026-10-28T02:37:24.478284742Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c28bcb6c-8ed6-41a7-a585-2d23a375412f` → **200**

```json
{
  "id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
  "short_number": 5,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2558c626-84e4-48de-a9fa-9581e84158cb",
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
    "id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188",
    "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f4350dc5-16d3-4766-8275-734f3e865b9c",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T14:37:23.377646Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c28bcb6c-8ed6-41a7-a585-2d23a375412f/interrupt` → **200**

```json
{
  "command_id": "ad21e19a-6f4a-4728-8e57-b9bf1e275e66",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
    "short_number": 5,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "2558c626-84e4-48de-a9fa-9581e84158cb",
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
      "id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188",
      "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "f4350dc5-16d3-4766-8275-734f3e865b9c",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T14:37:23.377646Z",
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
    "id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
    "short_number": 6,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "2558c626-84e4-48de-a9fa-9581e84158cb",
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
    "id": "8bada85c-ec5f-4a5d-b9f0-93a9b98dcc42",
    "order_id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
    "expires_at": "2026-10-27T14:37:39.573167Z",
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

`POST /api/driver/v1/offers/8bada85c-ec5f-4a5d-b9f0-93a9b98dcc42/accept` → **200**

```json
{
  "command_id": "7fd2a196-6ea4-49f6-a6af-fdb15fc01e0e"
}
```

```json
{
  "id": "71d3fb3e-c999-463e-8682-122aa63eb02f",
  "order_id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c6743d48-27a0-440e-80bb-37e1e18ea5e6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c6743d48-27a0-440e-80bb-37e1e18ea5e6",
  "order_id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
  "assignment_id": "71d3fb3e-c999-463e-8682-122aa63eb02f",
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
  "session_id": "b613fbfb-beaa-4d3a-bd2e-79c497e24b14",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.829672Z",
  "last_location_at": "2026-10-27T14:37:23.829672Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b613fbfb-beaa-4d3a-bd2e-79c497e24b14/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:24Z",
    "sequence": 1793111844725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b613fbfb-beaa-4d3a-bd2e-79c497e24b14",
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
  "last_heartbeat_at": "2026-10-27T14:37:24.742733Z",
  "last_location_at": "2026-10-27T14:37:24.742733Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c6743d48-27a0-440e-80bb-37e1e18ea5e6/arrive` → **200**

```json
{
  "command_id": "c2428a79-96b1-4272-8095-16b4a1985a2a",
  "expected_version": 0
}
```

```json
{
  "id": "c6743d48-27a0-440e-80bb-37e1e18ea5e6",
  "order_id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
  "assignment_id": "71d3fb3e-c999-463e-8682-122aa63eb02f",
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
  "arrived_at": "2026-10-27T14:37:24.78827Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/c6743d48-27a0-440e-80bb-37e1e18ea5e6/start` → **200**

```json
{
  "command_id": "4cc3f0cc-d7eb-4d5c-9e89-4caed8ebe821",
  "expected_version": 1
}
```

```json
{
  "id": "c6743d48-27a0-440e-80bb-37e1e18ea5e6",
  "order_id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
  "assignment_id": "71d3fb3e-c999-463e-8682-122aa63eb02f",
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
  "arrived_at": "2026-10-27T14:37:24.78827Z",
  "started_at": "2026-10-27T14:37:24.835244Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/c6743d48-27a0-440e-80bb-37e1e18ea5e6/complete` → **200**

```json
{
  "command_id": "b535bbce-a9d5-4dfc-a8a8-72de6f559d0d",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:37:24Z"
}
```

```json
{
  "id": "c6743d48-27a0-440e-80bb-37e1e18ea5e6",
  "order_id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
  "assignment_id": "71d3fb3e-c999-463e-8682-122aa63eb02f",
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
  "arrived_at": "2026-10-27T14:37:24.78827Z",
  "started_at": "2026-10-27T14:37:24.835244Z",
  "completed_at": "2026-10-27T14:37:24.883429Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "a34fea94-79c6-4619-8e85-ad8e4b894d52",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:37:24.562227Z",
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
    "id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:37:23.377646Z",
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
      "balance_minor": 11113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/c28bcb6c-8ed6-41a7-a585-2d23a375412f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:37:23.378378Z",
      "actor": {
        "type": "CLIENT",
        "id": "2558c626-84e4-48de-a9fa-9581e84158cb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
        "quote_id": "bd457ecf-50e5-45f4-bacf-3652cc2efe4e",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:37:23.380473Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
        "attempt_id": "19dc43ae-2870-404b-9a8b-9489fc5006b2",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:37:23.389284Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8423d321-0986-4213-b070-bb50e9cfd595",
        "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:37:23.452442Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8423d321-0986-4213-b070-bb50e9cfd595",
        "order_id": "c28bcb6c-8ed6-41a7-a585-2d23a375412f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "5ec7283d-d4cd-4334-b56d-ae019fcd3188"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted c28bcb6c-8ed6-41a7-a585-2d23a375412f, follow-up a34fea94-79c6-4619-8e85-ad8e4b894d52.

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
  "session_id": "3c80b34b-abcb-4923-ab54-a6f99467c1b2",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NDgsImlhdCI6MTc5MzExMTg0OCwianRpIjoiOWZlNTJiYWMtODU0ZS00OWU4LWI4NTAtNjY1YTIxOGZhNzA2Iiwic2lkIjoiM2M4MGIzNGItYWJjYi00OTIzLWFiNTQtYTZmOTk0NjdjMWIyIn0.653mPEFthrm2KOsqiFLj8zX_2KJrEW9JrxHJDYZ8--k",
  "access_expires_at": "2026-10-27T14:52:28.309962291Z",
  "refresh_token": "MPTFK3bxBj71yN1P7S3tD0Rdu3x_NSd3VeeCCGOl0u4",
  "refresh_expires_at": "2026-10-28T02:37:28.309320776Z",
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
  "session_id": "11945a9c-3487-4f13-8bbe-d302cccb52b4",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NDgsImlhdCI6MTc5MzExMTg0OCwianRpIjoiMzhkYTUzMDUtYmRhMC00YjVhLTg5MzAtNDU5MGNhNTY5N2E0Iiwic2lkIjoiMTE5NDVhOWMtMzQ4Ny00ZjEzLThiYmUtZDMwMmNjY2I1MmI0In0.V7NNVEdJX7koSOwTBZ-BNcjR3gG-GC492egzQ8WLghg",
  "access_expires_at": "2026-10-27T14:52:28.63256444Z",
  "refresh_token": "D3jomhplseR_L1LCpaQ6b0wLkyC_N1QD-jBqxRV-7vc",
  "refresh_expires_at": "2026-10-28T02:37:28.631891474Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13695"
}
```

```json
{
  "challenge_id": "f86fc6af-cfc5-45c3-97f8-826d8983a151",
  "expires_at": "2026-10-27T14:42:28.657571123Z",
  "resend_available_at": "2026-10-27T14:37:29.657571123Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "819125",
  "sent_at": "2026-10-27T14:37:28.660484756Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f86fc6af-cfc5-45c3-97f8-826d8983a151",
  "code": "819125",
  "device_ref": "sandbox-13695"
}
```

```json
{
  "session_id": "1d492be5-0ff0-4718-8f57-5d418a111fc7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc0OCwiaWF0IjoxNzkzMTExODQ4LCJqdGkiOiJjMTJjNzU5Yi1kZWFjLTRlMWUtODk0My1jNzY2NDFmMTRlOWEiLCJzaWQiOiIxZDQ5MmJlNS0wZmYwLTQ3MTgtOGY1Ny01ZDQxOGExMTFmYzcifQ.CbMp_YsMeaVnImnCkkhL1SlYR6UhHww-TYfOQuZXntc",
  "access_expires_at": "2026-10-27T14:52:28.721647044Z",
  "refresh_token": "6i0WIdFOufMVn7nrApSyCaPeh5Qff5xgitOpbmxjEcs",
  "refresh_expires_at": "2026-11-26T14:37:28.720674197Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.638702Z",
  "last_location_at": "2026-10-27T14:37:23.638702Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/handover` → **200**

```json
{
  "command_id": "7f1b17e4-00c9-482e-a271-6028531bb773",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:23.638702Z",
  "last_location_at": "2026-10-27T14:37:23.638702Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:28Z",
    "sequence": 1793111848814
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:28.832068Z",
  "last_location_at": "2026-10-27T14:37:28.832068Z",
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
  "command_id": "3fa15f71-3dfc-42bc-9348-48ef372771b0",
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
  "effective_at": "2026-10-27T14:37:28.914183Z",
  "changed_by": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T14:37:28.946048155Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "6583fc58-6e1c-4568-9a09-ebf3a77e100f",
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
  "id": "6ab65613-2e28-475f-917a-85ee751e77f0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:42:28.990688Z",
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
  "command_id": "53e9f9cf-5d62-4608-bb8e-3782d3ab2a67",
  "quote_id": "6ab65613-2e28-475f-917a-85ee751e77f0",
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
    "phone": "+3806711129495"
  }
}
```

```json
{
  "id": "54927993-d3be-4f52-a56e-45d384902ac8",
  "short_number": 7,
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
  "created_at": "2026-10-27T14:37:29.044116Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129495"
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
    "id": "eeefa04b-ecb2-4513-b8bd-b10aa8b32515",
    "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
    "expires_at": "2026-10-27T14:37:44.04906Z",
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

`POST /api/driver/v1/offers/eeefa04b-ecb2-4513-b8bd-b10aa8b32515/accept` → **200**

```json
{
  "command_id": "378ff853-6d13-4d46-af12-d510ae337e0f"
}
```

```json
{
  "id": "fa16f311-7599-4845-b0f1-90b64bbbcd8f",
  "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc035d25-10fc-4484-ba50-30dbd580d8d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc035d25-10fc-4484-ba50-30dbd580d8d3",
  "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
  "assignment_id": "fa16f311-7599-4845-b0f1-90b64bbbcd8f",
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
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:29Z",
    "sequence": 1793111849159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:29.175078Z",
  "last_location_at": "2026-10-27T14:37:29.175078Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cc035d25-10fc-4484-ba50-30dbd580d8d3/arrive` → **200**

```json
{
  "command_id": "881f4a95-59a0-41c2-8ce2-8f0b5e42b87e",
  "expected_version": 0
}
```

```json
{
  "id": "cc035d25-10fc-4484-ba50-30dbd580d8d3",
  "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
  "assignment_id": "fa16f311-7599-4845-b0f1-90b64bbbcd8f",
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
  "arrived_at": "2026-10-27T14:37:29.216421Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/cc035d25-10fc-4484-ba50-30dbd580d8d3/start` → **200**

```json
{
  "command_id": "5ec5b587-b2d5-4ec8-883a-911e09270a59",
  "expected_version": 1
}
```

```json
{
  "id": "cc035d25-10fc-4484-ba50-30dbd580d8d3",
  "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
  "assignment_id": "fa16f311-7599-4845-b0f1-90b64bbbcd8f",
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
  "arrived_at": "2026-10-27T14:37:29.216421Z",
  "started_at": "2026-10-27T14:37:29.256174Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/cc035d25-10fc-4484-ba50-30dbd580d8d3/complete` → **200**

```json
{
  "command_id": "bdd33d44-d6d1-41f2-8d21-1877c50a3035",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:37:29Z",
  "cash_received": true
}
```

```json
{
  "id": "cc035d25-10fc-4484-ba50-30dbd580d8d3",
  "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
  "assignment_id": "fa16f311-7599-4845-b0f1-90b64bbbcd8f",
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
  "arrived_at": "2026-10-27T14:37:29.216421Z",
  "started_at": "2026-10-27T14:37:29.256174Z",
  "completed_at": "2026-10-27T14:37:29.30043Z",
  "needs_review": false
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8a28f0e0-dd04-439f-9558-15d1fe348b24",
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
  "id": "a0a75342-d13a-44cd-8deb-c4fc6bbf60fe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:42:29.345296Z",
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
  "command_id": "35f078a9-10f7-440e-91f8-b09e175f9d45",
  "quote_id": "a0a75342-d13a-44cd-8deb-c4fc6bbf60fe",
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
    "phone": "+3806711115765"
  }
}
```

```json
{
  "id": "5148d6c9-3f34-41c8-b154-66419f69d89d",
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
  "created_at": "2026-10-27T14:37:29.38276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115765"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/5148d6c9-3f34-41c8-b154-66419f69d89d` → **200**

```json
{
  "id": "5148d6c9-3f34-41c8-b154-66419f69d89d",
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
  "created_at": "2026-10-27T14:37:29.38276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115765"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5148d6c9-3f34-41c8-b154-66419f69d89d/cancel` → **200**

```json
{
  "command_id": "7aee5205-abe0-4e35-b471-0a446d4b262a",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "5148d6c9-3f34-41c8-b154-66419f69d89d",
  "short_number": 8,
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
  "created_at": "2026-10-27T14:37:29.38276Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711115765"
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
  "staff_id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T14:37:29.306121Z",
  "last_entries": [
    {
      "order_id": "5148d6c9-3f34-41c8-b154-66419f69d89d",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T14:37:29.464401Z"
    },
    {
      "order_id": "54927993-d3be-4f52-a56e-45d384902ac8",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T14:37:29.306121Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9abd9d8e-7046-4d9b-87d1-2f1d347a9616",
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
  "last_heartbeat_at": "2026-10-27T14:37:29.175078Z",
  "last_location_at": "2026-10-27T14:37:29.175078Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9abd9d8e-7046-4d9b-87d1-2f1d347a9616/close` → **200**

```json
{
  "command_id": "7d48f9cf-cae6-43e1-bb57-a18e1df9dcba",
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

Done: operator bonus for fulfilled 54927993-d3be-4f52-a56e-45d384902ac8 and operator-fault cancellation 5148d6c9-3f34-41c8-b154-66419f69d89d.

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
  "session_id": "64d1c4e5-206a-4a8f-b36e-e25377009097",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NTEsImlhdCI6MTc5MzExMTg1MSwianRpIjoiNWY2ZWYyM2UtYzA2Ni00YTA5LWJiZWUtYzcyMTE1ZDY3ZmIwIiwic2lkIjoiNjRkMWM0ZTUtMjA2YS00YThmLWIzNmUtZTI1Mzc3MDA5MDk3In0.KNEbfyV7Lfi9gUzPZcTJV0Kiwd7clqfzmgQHtjS7HRg",
  "access_expires_at": "2026-10-27T14:52:31.924229162Z",
  "refresh_token": "8wqXbEXqT07V24dEZJT1ufZ_L9qZ-jaDpN4MyCj0I5E",
  "refresh_expires_at": "2026-10-28T02:37:31.92358691Z",
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
  "command_id": "f6c09414-0374-473a-a832-ac3299e3426e",
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
    }
  },
  "changed_by": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T14:37:32.000311036Z"
}
```

## The rider books the airport for 2026-10-27T17:37:31Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600777903",
  "device_ref": "sandbox-6668"
}
```

```json
{
  "challenge_id": "036bedbd-31e1-4506-a690-d0ac96904ba4",
  "expires_at": "2026-10-27T14:42:32.036671002Z",
  "resend_available_at": "2026-10-27T14:37:33.036671002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600777903` → **200**

```json
{
  "phone": "+48600777903",
  "audience": "CLIENT",
  "code": "652731",
  "sent_at": "2026-10-27T14:37:32.039712866Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "036bedbd-31e1-4506-a690-d0ac96904ba4",
  "code": "652731",
  "device_ref": "sandbox-6668"
}
```

```json
{
  "session_id": "4c152537-68d8-4b10-9651-bfadda789ff1",
  "subject": {
    "type": "CLIENT",
    "id": "dd831ee0-414e-48c6-8641-169e4d5005d1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZDgzMWVlMC00MTRlLTQ4YzYtODY0MS0xNjllNGQ1MDA1ZDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzUyLCJpYXQiOjE3OTMxMTE4NTIsImp0aSI6IjUzYjI5OGQ3LTFjMjMtNDdkZi1hMjA5LWQ2YzkzZjhiNjc1OSIsInNpZCI6IjRjMTUyNTM3LTY4ZDgtNGIxMC05NjUxLWJmYWRkYTc4OWZmMSJ9.m-dksf1iGBRQ1q2IikoxocOd-mVe0vXTeUjiNg02Xuk",
  "access_expires_at": "2026-10-27T14:52:32.097640034Z",
  "refresh_token": "ViAqMBLpvghd7t4eCCplSChnjGklt_HqV17ZZh9j_FI",
  "refresh_expires_at": "2026-11-26T14:37:32.097023796Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "958adb5d-2fa4-4d51-b67f-6d649e2d73f6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T17:37:31Z"
}
```

```json
{
  "id": "84f797ad-c598-483e-8297-82ab5a345e65",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T14:42:32.136997Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T17:37:31Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2ea42689-a09d-431a-bfcc-9140af22e04f",
  "quote_id": "84f797ad-c598-483e-8297-82ab5a345e65",
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
  "pickup_at": "2026-10-27T17:37:31Z"
}
```

```json
{
  "id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "dd831ee0-414e-48c6-8641-169e4d5005d1",
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
  "created_at": "2026-10-27T14:37:32.176353Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T17:37:31Z",
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
  "device_ref": "sandbox-8321"
}
```

```json
{
  "challenge_id": "2b6bae5d-965c-4616-8ee1-5850a222e1d8",
  "expires_at": "2026-10-27T14:42:32.209960615Z",
  "resend_available_at": "2026-10-27T14:37:33.209960615Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "697868",
  "sent_at": "2026-10-27T14:37:32.213171718Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b6bae5d-965c-4616-8ee1-5850a222e1d8",
  "code": "697868",
  "device_ref": "sandbox-8321"
}
```

```json
{
  "session_id": "ff4da639-4a0d-4808-9f82-14d090701cce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc1MiwiaWF0IjoxNzkzMTExODUyLCJqdGkiOiIyMzMwMDYzMy1jYzljLTQ5YTItYWFlYi0wYWVlNTAyZGIxOWEiLCJzaWQiOiJmZjRkYTYzOS00YTBkLTQ4MDgtOWY4Mi0xNGQwOTA3MDFjY2UifQ.W4ZuOwl4NQ1TfTsOucmyYDIIgi6Ixjj8VjHotM6xgsY",
  "access_expires_at": "2026-10-27T14:52:32.274439377Z",
  "refresh_token": "JB6IM-dBhYGE7PFIsTJBv2lJN2_qudbkiBnSkCjGhuU",
  "refresh_expires_at": "2026-11-26T14:37:32.273836434Z",
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
  "command_id": "647d6320-77fe-40ca-9908-0f594060b4d9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:32Z",
    "sequence": 1793111852326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e51b0f6a-c5e2-46ac-8f7c-b8d78797297d",
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
  "last_heartbeat_at": "2026-10-27T14:37:32.342188Z",
  "last_location_at": "2026-10-27T14:37:32.342188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
      "short_number": 9,
      "pickup_at": "2026-10-27T17:37:31Z",
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

`POST /api/driver/v1/preorders/6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6/reserve` → **200**

```json
{
  "command_id": "62517672-6468-44f3-9d3b-607681248b2a"
}
```

```json
{
  "id": "ece2a928-e370-4941-9780-18879ecd8871",
  "state": "RESERVED",
  "order": {
    "order_id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
    "short_number": 9,
    "pickup_at": "2026-10-27T17:37:31Z",
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
  "reserved_at": "2026-10-27T14:37:32.419681Z",
  "confirm_from": "2026-10-27T17:07:31Z",
  "confirm_until": "2026-10-27T17:17:31Z",
  "drop_until": "2026-10-27T16:37:31Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ece2a928-e370-4941-9780-18879ecd8871",
      "state": "RESERVED",
      "order": {
        "order_id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:37:31Z",
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
      "reserved_at": "2026-10-27T14:37:32.419681Z",
      "confirm_from": "2026-10-27T17:07:31Z",
      "confirm_until": "2026-10-27T17:17:31Z",
      "drop_until": "2026-10-27T16:37:31Z"
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
      "id": "ece2a928-e370-4941-9780-18879ecd8871",
      "state": "RESERVED",
      "order": {
        "order_id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:37:31Z",
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
      "reserved_at": "2026-10-27T14:37:32.419681Z",
      "confirm_from": "2026-10-27T17:07:31Z",
      "confirm_until": "2026-10-27T17:17:31Z",
      "drop_until": "2026-10-27T16:37:31Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ece2a928-e370-4941-9780-18879ecd8871/confirm` → **409**

```json
{
  "command_id": "60dce266-dc89-40b3-bb95-74874121bfcc"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ece2a928-e370-4941-9780-18879ecd8871/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9c8ef7ee-522a-4f60-b393-d6d7d291c5cc"
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
  "session_id": "85e8623d-dcc2-4774-b549-79f7553cb492",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NTIsImlhdCI6MTc5MzExMTg1MiwianRpIjoiYzMzMWQyN2QtNTk0ZS00MGY0LThkNWItNDc2MWZmZDE4N2FlIiwic2lkIjoiODVlODYyM2QtZGNjMi00Nzc0LWI1NDktNzlmNzU1M2NiNDkyIn0.lIWC4fAoMfBWqMiKXzkc8ay_Q8Umj5OVIr_qeWU8hp8",
  "access_expires_at": "2026-10-27T14:52:32.845773533Z",
  "refresh_token": "GFmXEY79vhphYq8Xl4VkPxJ-0-e6AKkv2vfwr1eARik",
  "refresh_expires_at": "2026-10-28T02:37:32.84506664Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6` → **200**

```json
{
  "id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "dd831ee0-414e-48c6-8641-169e4d5005d1",
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
  "created_at": "2026-10-27T14:37:32.176353Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T17:37:31Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ece2a928-e370-4941-9780-18879ecd8871",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T14:37:32.419681Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T14:37:32.177921Z",
      "actor": {
        "type": "CLIENT",
        "id": "dd831ee0-414e-48c6-8641-169e4d5005d1",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
        "preorder": true,
        "quote_id": "84f797ad-c598-483e-8297-82ab5a345e65",
        "pickup_at": "2026-10-27T17:37:31Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T14:37:32.420885Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ece2a928-e370-4941-9780-18879ecd8871"
      }
    }
  ]
}
```

Done: pre-order 6647b09e-ebd9-43ae-aac4-6eb6f05b5ee6, reservation ece2a928-e370-4941-9780-18879ecd8871.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3912"
}
```

```json
{
  "challenge_id": "1d4adba6-5a5e-4753-af6a-6126a2a7440e",
  "expires_at": "2026-10-27T14:42:32.942117665Z",
  "resend_available_at": "2026-10-27T14:37:33.942117665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "718087",
  "sent_at": "2026-10-27T14:37:32.944961192Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d4adba6-5a5e-4753-af6a-6126a2a7440e",
  "code": "718087",
  "device_ref": "sandbox-3912"
}
```

```json
{
  "session_id": "bf0b7b8c-499d-4680-a44f-2515a30d0a51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc1MywiaWF0IjoxNzkzMTExODUzLCJqdGkiOiI0YWZjMzg0Mi05NjlhLTQwZmMtOTJkNS0wNzU3OGMzMTdjNGEiLCJzaWQiOiJiZjBiN2I4Yy00OTlkLTQ2ODAtYTQ0Zi0yNTE1YTMwZDBhNTEifQ.9_mUr10OlkogfYTdkV_rp6Q0uDBri3sQUPMxBhSYX5s",
  "access_expires_at": "2026-10-27T14:52:33.005301917Z",
  "refresh_token": "awhBJJjyziwSegHkU31aqskNCxbFXAKm5PsLUQVzVbE",
  "refresh_expires_at": "2026-11-26T14:37:33.00460321Z",
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
  "command_id": "e1d0b8c4-a8ea-46e7-9a39-0ab25dba528a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:33Z",
    "sequence": 1793111853692
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b5a55d43-7810-4418-8da9-6c0152887b05",
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
  "last_heartbeat_at": "2026-10-27T14:37:33.085572Z",
  "last_location_at": "2026-10-27T14:37:33.085572Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677241751",
  "device_ref": "sandbox-22136"
}
```

```json
{
  "challenge_id": "11bea4e7-a3e2-4554-83cb-487323e9eb81",
  "expires_at": "2026-10-27T14:42:33.117159838Z",
  "resend_available_at": "2026-10-27T14:37:34.117159838Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677241751` → **200**

```json
{
  "phone": "+380677241751",
  "audience": "CLIENT",
  "code": "338269",
  "sent_at": "2026-10-27T14:37:33.119622237Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11bea4e7-a3e2-4554-83cb-487323e9eb81",
  "code": "338269",
  "device_ref": "sandbox-22136"
}
```

```json
{
  "session_id": "03ef9149-14f2-4c08-8e4e-ea778389d57e",
  "subject": {
    "type": "CLIENT",
    "id": "a3c96207-c56e-4cef-86d5-ceba04a3da23"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2M5NjIwNy1jNTZlLTRjZWYtODZkNS1jZWJhMDRhM2RhMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzUzLCJpYXQiOjE3OTMxMTE4NTMsImp0aSI6IjJhM2MxMjNjLTlkYTEtNDkyMC1iOGViLWEyYWU0ZDdjMDEzOCIsInNpZCI6IjAzZWY5MTQ5LTE0ZjItNGMwOC04ZTRlLWVhNzc4Mzg5ZDU3ZSJ9.YVpTQ0_1_NVH5gJCYcAfs_xKMn0UtWaahItdc4nJhak",
  "access_expires_at": "2026-10-27T14:52:33.177239833Z",
  "refresh_token": "9x_oHMy_gHFomiI3195ohQVzQiUiAgwEzv4Oh7r6ZVc",
  "refresh_expires_at": "2026-11-26T14:37:33.176631394Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8fd5339c-8c5b-467a-a90a-6c32098852c9",
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
  "id": "be2bb7f5-d50e-4663-90f4-0864a67622d6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:42:33.214922Z",
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
  "command_id": "22ac5df7-5bef-4ae3-81ee-c7cf1934b401",
  "quote_id": "be2bb7f5-d50e-4663-90f4-0864a67622d6",
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
  "id": "7b35005b-ae5f-431d-865e-51e68ea7a297",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3c96207-c56e-4cef-86d5-ceba04a3da23",
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
  "created_at": "2026-10-27T14:37:33.249479Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "cad5efc1-28f9-42c7-841f-7063ac22585f",
    "order_id": "7b35005b-ae5f-431d-865e-51e68ea7a297",
    "expires_at": "2026-10-27T14:37:48.253001Z",
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
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/cad5efc1-28f9-42c7-841f-7063ac22585f/accept` → **200**

```json
{
  "command_id": "5ee3be79-75e7-4fdb-ab62-8d3243642725"
}
```

```json
{
  "id": "f26a5058-d914-4521-ab15-51cbc52b4a75",
  "order_id": "7b35005b-ae5f-431d-865e-51e68ea7a297",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "04fa19ea-fa2a-4649-8fa2-ef6a811ecbbb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "04fa19ea-fa2a-4649-8fa2-ef6a811ecbbb",
  "order_id": "7b35005b-ae5f-431d-865e-51e68ea7a297",
  "assignment_id": "f26a5058-d914-4521-ab15-51cbc52b4a75",
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
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/b5a55d43-7810-4418-8da9-6c0152887b05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:33Z",
    "sequence": 1793111853365
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b5a55d43-7810-4418-8da9-6c0152887b05",
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
  "last_heartbeat_at": "2026-10-27T14:37:33.380319Z",
  "last_location_at": "2026-10-27T14:37:33.085572Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "04fa19ea-fa2a-4649-8fa2-ef6a811ecbbb",
  "order_id": "7b35005b-ae5f-431d-865e-51e68ea7a297",
  "assignment_id": "f26a5058-d914-4521-ab15-51cbc52b4a75",
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
  "needs_review": false
}
```

`POST /api/driver/v1/trips/04fa19ea-fa2a-4649-8fa2-ef6a811ecbbb/arrive` → **422**

```json
{
  "command_id": "4eaa43d1-d232-4fe6-a56c-8bff452c5d27",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/04fa19ea-fa2a-4649-8fa2-ef6a811ecbbb/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "476a2633-c4be-4184-a992-0e343b102430"
}
```

**Expected 200, got 422 — scenario stopped.**

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679246124",
  "device_ref": "sandbox-12567"
}
```

```json
{
  "challenge_id": "30da5642-f43d-46b7-b71a-97d6626b7748",
  "expires_at": "2026-10-27T14:42:33.485652525Z",
  "resend_available_at": "2026-10-27T14:37:34.485652525Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679246124` → **200**

```json
{
  "phone": "+380679246124",
  "audience": "CLIENT",
  "code": "081618",
  "sent_at": "2026-10-27T14:37:33.487879939Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "30da5642-f43d-46b7-b71a-97d6626b7748",
  "code": "081618",
  "device_ref": "sandbox-12567"
}
```

```json
{
  "session_id": "c23999b8-a3c0-40d9-9447-7798945ba616",
  "subject": {
    "type": "CLIENT",
    "id": "f3339443-11ec-42f6-a823-cf069df1b181"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMzMzOTQ0My0xMWVjLTQyZjYtYTgyMy1jZjA2OWRmMWIxODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyNzUzLCJpYXQiOjE3OTMxMTE4NTMsImp0aSI6ImNiNzljOTlkLWEzYWYtNDU2My05MGJkLWEzOGIzNGFkMjE1ZSIsInNpZCI6ImMyMzk5OWI4LWEzYzAtNDBkOS05NDQ3LTc3OTg5NDViYTYxNiJ9.KCSDUjglL5UCBH8UcfGpjivp6PDZ7-RoyVnovQoVKlM",
  "access_expires_at": "2026-10-27T14:52:33.542668314Z",
  "refresh_token": "6YPB5VCxoYuuZIA-EbuxM8fo0Ay-xvI5zZEIDA8A-lE",
  "refresh_expires_at": "2026-11-26T14:37:33.542107129Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "074c3105-803d-4a02-82d9-761e58e1c492",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
  "upload_path": "/api/rider/v1/uploads/c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
  "expires_at": "2026-10-27T14:52:33.579613038Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c7d9e7dd-a36e-44dc-9af2-42a757f3a907` → **200**

```json
{
  "file_id": "c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "3a25f2be-4320-4741-92d5-1b64feddaeae",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c7d9e7dd-a36e-44dc-9af2-42a757f3a907"
  ]
}
```

```json
{
  "id": "9e272a50-410c-4b74-93be-af14751c219f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f3339443-11ec-42f6-a823-cf069df1b181",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:37:33.655346Z",
  "updated_at": "2026-10-27T14:37:33.655346Z",
  "messages": [
    {
      "id": "ef719062-840f-43f5-9455-0158e12e09ac",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f3339443-11ec-42f6-a823-cf069df1b181",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:37:33.657443Z",
      "attachments": [
        {
          "file_id": "c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
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
  "session_id": "5c4b3d73-0cc1-42b4-962c-81d3012b1c42",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NTQsImlhdCI6MTc5MzExMTg1NCwianRpIjoiMThiYmVmNWEtMDEzZi00YTRjLTliNzItMjM3M2M0ZGQ5OTQ1Iiwic2lkIjoiNWM0YjNkNzMtMGNjMS00MmI0LTk2MmMtODFkMzAxMmIxYzQyIn0.MDckK2_JdeqHCqrxn1RT34PekZgdx22Aw9RcfXHB9wY",
  "access_expires_at": "2026-10-27T14:52:34.00818155Z",
  "refresh_token": "XHxyo-jy-zSJAx2hi_g7QJAIq85wy5wLRo5a0fnVpBs",
  "refresh_expires_at": "2026-10-28T02:37:34.007578887Z",
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
  "session_id": "ef56fdd7-d5e2-4d58-ab7d-70857868e19f",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NTQsImlhdCI6MTc5MzExMTg1NCwianRpIjoiZDYwM2JkYjYtYTU4MC00Njc5LWFhZGYtZTEyNGNhZjhhNzYwIiwic2lkIjoiZWY1NmZkZDctZDVlMi00ZDU4LWFiN2QtNzA4NTc4NjhlMTlmIn0.5RjMDTRqRWLws6O_9nxs_iy5Kkjp8-jvEJICPAgwZtk",
  "access_expires_at": "2026-10-27T14:52:34.330483873Z",
  "refresh_token": "JS0vdcSRvqf3nbpX61I99bvX-4aG1e2t0YqQ43roo4I",
  "refresh_expires_at": "2026-10-28T02:37:34.329879187Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/9e272a50-410c-4b74-93be-af14751c219f/attachments/c7d9e7dd-a36e-44dc-9af2-42a757f3a907` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "606cf851-e1f0-4484-a504-f7b0daac9ac2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4b92a6c5-ca1c-400c-8b2a-afabca18ad38",
  "upload_path": "/api/operator/v1/uploads/4b92a6c5-ca1c-400c-8b2a-afabca18ad38",
  "expires_at": "2026-10-27T14:52:34.383975179Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/4b92a6c5-ca1c-400c-8b2a-afabca18ad38` → **200**

```json
{
  "file_id": "4b92a6c5-ca1c-400c-8b2a-afabca18ad38",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/9e272a50-410c-4b74-93be-af14751c219f` → **200**

```json
{
  "id": "9e272a50-410c-4b74-93be-af14751c219f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f3339443-11ec-42f6-a823-cf069df1b181",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:37:33.655346Z",
  "updated_at": "2026-10-27T14:37:33.655346Z",
  "messages": [
    {
      "id": "ef719062-840f-43f5-9455-0158e12e09ac",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f3339443-11ec-42f6-a823-cf069df1b181",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:37:33.657443Z",
      "attachments": [
        {
          "file_id": "c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/9e272a50-410c-4b74-93be-af14751c219f/comments` → **200**

```json
{
  "command_id": "17895cf4-4a01-4124-aa62-231a9f6de978",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "4b92a6c5-ca1c-400c-8b2a-afabca18ad38"
  ]
}
```

```json
{
  "id": "9e272a50-410c-4b74-93be-af14751c219f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f3339443-11ec-42f6-a823-cf069df1b181",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:37:33.655346Z",
  "updated_at": "2026-10-27T14:37:34.493673Z",
  "messages": [
    {
      "id": "ef719062-840f-43f5-9455-0158e12e09ac",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f3339443-11ec-42f6-a823-cf069df1b181",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:37:33.657443Z",
      "attachments": [
        {
          "file_id": "c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5c95736d-b3d0-4e6c-bdc7-2119d91aacb2",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:37:34.49319Z",
      "attachments": [
        {
          "file_id": "4b92a6c5-ca1c-400c-8b2a-afabca18ad38",
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

`GET /api/rider/v1/support/cases/9e272a50-410c-4b74-93be-af14751c219f` → **200**

```json
{
  "id": "9e272a50-410c-4b74-93be-af14751c219f",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f3339443-11ec-42f6-a823-cf069df1b181",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:37:33.655346Z",
  "updated_at": "2026-10-27T14:37:34.493673Z",
  "messages": [
    {
      "id": "ef719062-840f-43f5-9455-0158e12e09ac",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f3339443-11ec-42f6-a823-cf069df1b181",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:37:33.657443Z",
      "attachments": [
        {
          "file_id": "c7d9e7dd-a36e-44dc-9af2-42a757f3a907",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5c95736d-b3d0-4e6c-bdc7-2119d91aacb2",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:37:34.49319Z",
      "attachments": [
        {
          "file_id": "4b92a6c5-ca1c-400c-8b2a-afabca18ad38",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/9e272a50-410c-4b74-93be-af14751c219f/attachments/4b92a6c5-ca1c-400c-8b2a-afabca18ad38` → **200**

Done: support case 9e272a50-410c-4b74-93be-af14751c219f, rider attachment c7d9e7dd-a36e-44dc-9af2-42a757f3a907, operator attachment 4b92a6c5-ca1c-400c-8b2a-afabca18ad38.

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
  "session_id": "de32cbdd-9f66-440d-8887-5a41a164d526",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NTQsImlhdCI6MTc5MzExMTg1NCwianRpIjoiMGNmZWU2MjYtYjM5NC00ZTY1LTgzNDItM2MxN2I5YzRjMjIzIiwic2lkIjoiZGUzMmNiZGQtOWY2Ni00NDBkLTg4ODctNWE0MWExNjRkNTI2In0.ds8QvHTAtNpmCmf_A7umOkBINT0xFsQ8WQ8O-2mcqWA",
  "access_expires_at": "2026-10-27T14:52:34.886193176Z",
  "refresh_token": "IgRvD28l-z8KU-V4yg1fUmqHiGqvht0lAupMDm8XcZ4",
  "refresh_expires_at": "2026-10-28T02:37:34.885489432Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-16075"
}
```

```json
{
  "challenge_id": "d873f106-4bfc-4e27-8320-4e63300a6a8d",
  "expires_at": "2026-10-27T14:42:34.91369558Z",
  "resend_available_at": "2026-10-27T14:37:35.91369558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "014852",
  "sent_at": "2026-10-27T14:37:34.916171486Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d873f106-4bfc-4e27-8320-4e63300a6a8d",
  "code": "014852",
  "device_ref": "sandbox-16075"
}
```

```json
{
  "session_id": "6ae011f1-336c-42ae-8637-030fd94ab679",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc1NCwiaWF0IjoxNzkzMTExODU0LCJqdGkiOiI2MmY1N2VhMS1hMmU4LTQ5NWEtYTY0OC01NmJiY2FmNTMzMDciLCJzaWQiOiI2YWUwMTFmMS0zMzZjLTQyYWUtODYzNy0wMzBmZDk0YWI2NzkifQ.lwIHkwJC_1YPBEDLQwQi_NxJkJFXawlFm4-afX4lMuw",
  "access_expires_at": "2026-10-27T14:52:34.97193828Z",
  "refresh_token": "zioglX_O3SJ5slr9lzMsGKMhdGzMyOot1YehmdbVHSI",
  "refresh_expires_at": "2026-11-26T14:37:34.971376955Z",
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
  "command_id": "c43bde7a-2821-465c-9425-3bb95c72cc19",
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
  "device_ref": "sandbox-30835"
}
```

```json
{
  "challenge_id": "6371fa48-2281-44ef-905a-18457ddd9e38",
  "expires_at": "2026-10-27T14:42:35.1024157Z",
  "resend_available_at": "2026-10-27T14:37:36.1024157Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "788802",
  "sent_at": "2026-10-27T14:37:35.104788177Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6371fa48-2281-44ef-905a-18457ddd9e38",
  "code": "788802",
  "device_ref": "sandbox-30835"
}
```

```json
{
  "session_id": "9551939a-537c-48cb-ad80-75eee7ecb33f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjc1NSwiaWF0IjoxNzkzMTExODU1LCJqdGkiOiIyN2ZhZThjOC04NmJiLTRiOWEtOGQwZS02N2QzZmFhNjQ1ZjYiLCJzaWQiOiI5NTUxOTM5YS01MzdjLTQ4Y2ItYWQ4MC03NWVlZTdlY2IzM2YifQ.18-sYBNVTLu3OZd6OlmmnpNnc8bY24J8at06_rnVK8Y",
  "access_expires_at": "2026-10-27T14:52:35.160831369Z",
  "refresh_token": "RuS2XNw7SnqRjsDobGgCCDieLkKIvgqQAHqc0QxvfSg",
  "refresh_expires_at": "2026-11-26T14:37:35.160100044Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b5a55d43-7810-4418-8da9-6c0152887b05",
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
  "last_heartbeat_at": "2026-10-27T14:37:33.380319Z",
  "last_location_at": "2026-10-27T14:37:33.085572Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b5a55d43-7810-4418-8da9-6c0152887b05/handover` → **200**

```json
{
  "command_id": "ca73dd07-98b7-4482-bf7f-7adfbb3bf3bd",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b5a55d43-7810-4418-8da9-6c0152887b05",
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
  "last_heartbeat_at": "2026-10-27T14:37:33.380319Z",
  "last_location_at": "2026-10-27T14:37:33.085572Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b5a55d43-7810-4418-8da9-6c0152887b05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:35Z",
    "sequence": 1793111855248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b5a55d43-7810-4418-8da9-6c0152887b05",
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
  "last_heartbeat_at": "2026-10-27T14:37:35.264031Z",
  "last_location_at": "2026-10-27T14:37:35.264031Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T14:37:15.025416Z",
  "last_location_at": "2026-10-27T14:37:15.025416Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6b75ce16-96e3-4479-bc31-40e2a1ea1013/handover` → **200**

```json
{
  "command_id": "f5895278-15ae-49a6-b0f5-f2f8f30b9048",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T14:37:15.025416Z",
  "last_location_at": "2026-10-27T14:37:15.025416Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6b75ce16-96e3-4479-bc31-40e2a1ea1013/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:35Z",
    "sequence": 1793111855352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T14:37:35.368568Z",
  "last_location_at": "2026-10-27T14:37:35.368568Z",
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
  "session_id": "9dd7309b-995a-4d73-94fb-6359a3bb8986",
  "subject": {
    "type": "STAFF",
    "id": "cf5e18bb-edd3-4e6c-a603-1ec10df9c197"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVlMThiYi1lZGQzLTRlNmMtYTYwMy0xZWMxMGRmOWMxOTciLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI3NTUsImlhdCI6MTc5MzExMTg1NSwianRpIjoiNDU5N2ZkN2UtNjllZS00YTU0LWFlNjAtMTJmNDExMGUyMzQ5Iiwic2lkIjoiOWRkNzMwOWItOTk1YS00ZDczLTk0ZmItNjM1OWEzYmI4OTg2In0.jWZsYWiLej3_FDKtoQ6yyrrg5lrfA_OWgl1wSw8AVkg",
  "access_expires_at": "2026-10-27T14:52:35.692702044Z",
  "refresh_token": "ToPBDlt5IuXKcBDG74sjA5tBml4vuplb72BlW_pjVSg",
  "refresh_expires_at": "2026-10-28T02:37:35.692138996Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d8dda2a2-b674-46ac-a2ea-72c5dee2eb57",
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
  "id": "ffa207fe-9929-4f5b-ae84-4d4894da515b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:42:35.727376Z",
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
  "command_id": "41c1f5fd-039c-412a-b89d-0f8317acd444",
  "quote_id": "ffa207fe-9929-4f5b-ae84-4d4894da515b",
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
  "id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
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
  "created_at": "2026-10-27T14:37:35.766404Z",
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
    "id": "4e1ac78f-67fd-4214-8305-aaa0239b56fb",
    "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
    "expires_at": "2026-10-27T14:37:50.770525Z",
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

`POST /api/driver/v1/offers/4e1ac78f-67fd-4214-8305-aaa0239b56fb/accept` → **200**

```json
{
  "command_id": "c3d7d14f-2c20-4bbf-8630-5657d97f985b"
}
```

```json
{
  "id": "d9d1dea9-b411-4029-a153-1f0783f654a8",
  "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b47d14ea-1132-467e-b8ce-6be72c9aab93",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b47d14ea-1132-467e-b8ce-6be72c9aab93",
  "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
  "assignment_id": "d9d1dea9-b411-4029-a153-1f0783f654a8",
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

`POST /api/driver/v1/work-sessions/6b75ce16-96e3-4479-bc31-40e2a1ea1013/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:37:35Z",
    "sequence": 1793111855932
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6b75ce16-96e3-4479-bc31-40e2a1ea1013",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T14:37:35.949607Z",
  "last_location_at": "2026-10-27T14:37:35.949607Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b47d14ea-1132-467e-b8ce-6be72c9aab93/arrive` → **200**

```json
{
  "command_id": "82ad32f9-e134-4b39-bd96-82f6582cf93a",
  "expected_version": 0
}
```

```json
{
  "id": "b47d14ea-1132-467e-b8ce-6be72c9aab93",
  "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
  "assignment_id": "d9d1dea9-b411-4029-a153-1f0783f654a8",
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
  "arrived_at": "2026-10-27T14:37:35.992772Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b47d14ea-1132-467e-b8ce-6be72c9aab93/start` → **200**

```json
{
  "command_id": "fb5d8e3e-e424-4cd7-a087-acb77119d56e",
  "expected_version": 1
}
```

```json
{
  "id": "b47d14ea-1132-467e-b8ce-6be72c9aab93",
  "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
  "assignment_id": "d9d1dea9-b411-4029-a153-1f0783f654a8",
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
  "arrived_at": "2026-10-27T14:37:35.992772Z",
  "started_at": "2026-10-27T14:37:36.036573Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b47d14ea-1132-467e-b8ce-6be72c9aab93/complete` → **200**

```json
{
  "command_id": "e6aaea19-fa7b-405d-9ce9-140bd3743a7a",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:37:36Z",
  "cash_received": true
}
```

```json
{
  "id": "b47d14ea-1132-467e-b8ce-6be72c9aab93",
  "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
  "assignment_id": "d9d1dea9-b411-4029-a153-1f0783f654a8",
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
  "arrived_at": "2026-10-27T14:37:35.992772Z",
  "started_at": "2026-10-27T14:37:36.036573Z",
  "completed_at": "2026-10-27T14:37:36.084358Z",
  "needs_review": false
}
```

`GET /api/operator/v1/orders/dadaade8-9772-4f04-9c4c-f1c8be067ac5` → **200**

```json
{
  "id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
  "short_number": 11,
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
    "id": "d9d1dea9-b411-4029-a153-1f0783f654a8",
    "order_id": "dadaade8-9772-4f04-9c4c-f1c8be067ac5",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b47d14ea-1132-467e-b8ce-6be72c9aab93",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:37:35.766404Z",
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
      "balance_minor": 9357,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

Done: terminal order dadaade8-9772-4f04-9c4c-f1c8be067ac5 by Andrii (5a000000-0000-4000-8000-000000000403).
