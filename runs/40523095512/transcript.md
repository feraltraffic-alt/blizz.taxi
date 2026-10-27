# Sandbox transcript (2026-10-27T14:39:38Z, 9bef2b8)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639537081",
  "device_ref": "sandbox-26235"
}
```

```json
{
  "challenge_id": "749b30e5-2739-496f-93f7-dd083602ed12",
  "expires_at": "2026-10-27T14:44:38.212452219Z",
  "resend_available_at": "2026-10-27T14:39:39.212452219Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639537081` → **200**

```json
{
  "phone": "+380639537081",
  "audience": "CLIENT",
  "code": "639171",
  "sent_at": "2026-10-27T14:39:38.218788329Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "749b30e5-2739-496f-93f7-dd083602ed12",
  "code": "639171",
  "device_ref": "sandbox-26235"
}
```

```json
{
  "session_id": "941a291e-0a5f-4472-a2ee-7b94e85a7a91",
  "subject": {
    "type": "CLIENT",
    "id": "f6ba133b-6d34-4765-8972-415d8b1ad18a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNmJhMTMzYi02ZDM0LTQ3NjUtODk3Mi00MTVkOGIxYWQxOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyODc4LCJpYXQiOjE3OTMxMTE5NzgsImp0aSI6IjJlMTczNjk2LTU2MjQtNDI2Zi05YWIxLTkzZTU1ODY5ZjhiNCIsInNpZCI6Ijk0MWEyOTFlLTBhNWYtNDQ3Mi1hMmVlLTdiOTRlODVhN2E5MSJ9.bo1VRYRTlSOgwtvqTbFLUGqZAX91ZBUAlOGG-0j7jBM",
  "access_expires_at": "2026-10-27T14:54:38.308595213Z",
  "refresh_token": "fI5xyPlqJX7JG0vG0mPsLJh8YvRGgFD195hsWtDc_kw",
  "refresh_expires_at": "2026-11-26T14:39:38.306272576Z",
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
        "uk": "Передумав їхати",
        "pl": "Zmiana planów",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "en": "The wait is too long",
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "en": "Wrong address",
        "uk": "Помилився адресою",
        "pl": "Błędny adres",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "en": "Found other transport",
        "uk": "Поїду іншим транспортом",
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте"
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
  "device_ref": "sandbox-16875"
}
```

```json
{
  "challenge_id": "c24a7e56-8cbf-454c-ad76-9f17d73680a5",
  "expires_at": "2026-10-27T14:44:38.441525912Z",
  "resend_available_at": "2026-10-27T14:39:39.441525912Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "818299",
  "sent_at": "2026-10-27T14:39:38.445421043Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c24a7e56-8cbf-454c-ad76-9f17d73680a5",
  "code": "818299",
  "device_ref": "sandbox-16875"
}
```

```json
{
  "session_id": "137baf44-aa1c-45d1-9c45-a4c9d2d226fa",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg3OCwiaWF0IjoxNzkzMTExOTc4LCJqdGkiOiI2MmU5MmY3NS05NjE5LTQwZDgtYTliMC05OGFkMGEzZjkyMDciLCJzaWQiOiIxMzdiYWY0NC1hYTFjLTQ1ZDEtOWM0NS1hNGM5ZDJkMjI2ZmEifQ.XQPCNOG2Slxh_j3vMaKBbb2hK9PJ9YkY5okcsGpmZO0",
  "access_expires_at": "2026-10-27T14:54:38.506978519Z",
  "refresh_token": "XRiPJ1uU375hbv2J-W6RrrwKenUfC02m_LwjhIX6aFo",
  "refresh_expires_at": "2026-11-26T14:39:38.505876776Z",
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
        "uk": "Пасажир не вийшов",
        "pl": "Pasażer nie przyszedł",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля",
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "en": "Cannot reach the pickup",
        "uk": "Не можу під'їхати",
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать"
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
  "correlation_id": "ce9e56a8-d5e4-4747-a45a-c612a5dcbdce"
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
  "session_id": "7af7c618-ee27-4991-b23e-e843307aaca0",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4NzksImlhdCI6MTc5MzExMTk3OSwianRpIjoiNDkyZjAwMDUtNGMxYS00NDkzLThkMTItZTMyZWU5ZjdmMzMxIiwic2lkIjoiN2FmN2M2MTgtZWUyNy00OTkxLWIyM2UtZTg0MzMwN2FhY2EwIn0.m3XH9ff9W-szh-7GUgqJxZORY0yF_E19xOYMiwhXkAA",
  "access_expires_at": "2026-10-27T14:54:39.209582209Z",
  "refresh_token": "9M-k9p5whcI0gqi34jXOzL6l3ukwUdWxytWF3sCV-ig",
  "refresh_expires_at": "2026-10-28T02:39:39.208535469Z",
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
  "session_id": "86904f9a-01b3-466c-91da-47cd1c27ba91",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4ODAsImlhdCI6MTc5MzExMTk4MCwianRpIjoiMTA3ODE4N2UtOWMwZS00NDA4LTliYjctYjg0YzUzZDIzNjdlIiwic2lkIjoiODY5MDRmOWEtMDFiMy00NjZjLTkxZGEtNDdjZDFjMjdiYTkxIn0.p7Q5-3_kf_zcj7TGcIl2VnufFohlBLFiOlAgJEtEKEg",
  "access_expires_at": "2026-10-27T14:54:40.458001169Z",
  "refresh_token": "qjF2x3-ifKpCdgPVVMwOp03K881a5vxPnxVfPMc9P08",
  "refresh_expires_at": "2026-10-28T02:39:40.457001107Z",
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
  "session_id": "5082f05e-c7bf-4bb2-8582-eaf1a7073069",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4ODAsImlhdCI6MTc5MzExMTk4MCwianRpIjoiNzFjZjY2MjEtZTFmOS00ZDM5LTgyMmQtNWMwNzFiNTIyYTRiIiwic2lkIjoiNTA4MmYwNWUtYzdiZi00YmIyLTg1ODItZWFmMWE3MDczMDY5In0.aG_jLeG3qV2jItt7pYe7LP0uwqEF3cvul1Z-bh9kejo",
  "access_expires_at": "2026-10-27T14:54:40.7868883Z",
  "refresh_token": "mSO251w8Qlud-cn84ILIF6Fcmvp5pVAgOrHXEiRmmtM",
  "refresh_expires_at": "2026-10-28T02:39:40.785585102Z",
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
        "uk": "Пасажир попросив",
        "pl": "Na prośbę pasażera",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "en": "Duplicate order",
        "uk": "Дубль замовлення",
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "en": "No cars available",
        "uk": "Немає вільних авто",
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "en": "Test order",
        "uk": "Тестове замовлення",
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "uk": "ДТП",
        "pl": "Wypadek",
        "ru": "ДТП"
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
  "command_id": "03d3656e-35e6-43db-860a-20c4efbd9243",
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
  "id": "d61151f9-4f98-460f-9fca-6f460309ad91",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:44:41.012051Z",
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
  "command_id": "4165e0d9-eb54-4a26-b870-962ef39d16c2",
  "quote_id": "d61151f9-4f98-460f-9fca-6f460309ad91",
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
  "id": "55060f63-0d8f-45b2-bd9c-e58805e1e322",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6ba133b-6d34-4765-8972-415d8b1ad18a",
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
  "created_at": "2026-10-27T14:39:41.121575Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/55060f63-0d8f-45b2-bd9c-e58805e1e322` → **200**

```json
{
  "id": "55060f63-0d8f-45b2-bd9c-e58805e1e322",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6ba133b-6d34-4765-8972-415d8b1ad18a",
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
  "created_at": "2026-10-27T14:39:41.121575Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/55060f63-0d8f-45b2-bd9c-e58805e1e322/cancel` → **200**

```json
{
  "command_id": "15aa46d2-3020-4597-af71-6fcb125baf44",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "55060f63-0d8f-45b2-bd9c-e58805e1e322",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f6ba133b-6d34-4765-8972-415d8b1ad18a",
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
  "created_at": "2026-10-27T14:39:41.121575Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "en": "The wait is too long",
      "uk": "Довго чекати авто",
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину"
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
  "command_id": "7c14c239-e12d-445e-b683-8c64ddd09974",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:41Z",
    "sequence": 1793111981319
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1782562-a91d-470c-8714-71b464628e5c",
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
  "last_heartbeat_at": "2026-10-27T14:39:41.361952Z",
  "last_location_at": "2026-10-27T14:39:41.361952Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5214"
}
```

```json
{
  "challenge_id": "7802fa15-bbd6-4264-80c9-8df557567290",
  "expires_at": "2026-10-27T14:44:41.4003014Z",
  "resend_available_at": "2026-10-27T14:39:42.4003014Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "708108",
  "sent_at": "2026-10-27T14:39:41.404717497Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7802fa15-bbd6-4264-80c9-8df557567290",
  "code": "708108",
  "device_ref": "sandbox-5214"
}
```

```json
{
  "session_id": "e8be6d25-7f44-4b13-9129-66a4772b538c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg4MSwiaWF0IjoxNzkzMTExOTgxLCJqdGkiOiIyNzA1MDU4OC03N2RmLTQ3NDEtYjg0Yy0wNGE3NDFjMDg1YTYiLCJzaWQiOiJlOGJlNmQyNS03ZjQ0LTRiMTMtOTEyOS02NmE0NzcyYjUzOGMifQ.pWMDaIwq_j9P5xcJoFDzYIcawrDWiZ2oJmAWjE63WNs",
  "access_expires_at": "2026-10-27T14:54:41.4740388Z",
  "refresh_token": "hOIVMGl70qmXpzqMfirjvMg-bhdCcexMmsIe2wEbdzw",
  "refresh_expires_at": "2026-11-26T14:39:41.47312533Z",
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
  "command_id": "bf80bbc1-ef5f-4f91-bcc4-4b92d5608e63",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:41Z",
    "sequence": 1793111981530
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:41.54889Z",
  "last_location_at": "2026-10-27T14:39:41.54889Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2339336-fddc-4f12-a650-caf4c44109ad",
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
  "id": "f31728b0-62ca-44e3-9d8d-5739bc090174",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:44:41.595005Z",
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
  "command_id": "2f11f6f4-bb89-48ee-880c-c11c53c9b1b0",
  "quote_id": "f31728b0-62ca-44e3-9d8d-5739bc090174",
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
  "id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6ba133b-6d34-4765-8972-415d8b1ad18a",
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
  "created_at": "2026-10-27T14:39:41.63649Z",
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
    "id": "a6d662cc-f7bd-48a9-8276-b4fabaa43b30",
    "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
    "expires_at": "2026-10-27T14:39:56.642253Z",
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

`POST /api/driver/v1/offers/a6d662cc-f7bd-48a9-8276-b4fabaa43b30/accept` → **200**

```json
{
  "command_id": "eb639321-83cb-4850-985e-b3499dbfca12"
}
```

```json
{
  "id": "9ae2309d-c259-4874-b536-ded8cb792177",
  "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e29e790d-53f1-4002-8a9f-d2b82dfdd920",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e29e790d-53f1-4002-8a9f-d2b82dfdd920",
  "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "assignment_id": "9ae2309d-c259-4874-b536-ded8cb792177",
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

`POST /api/driver/v1/trips/e29e790d-53f1-4002-8a9f-d2b82dfdd920/cancel` → **200**

```json
{
  "command_id": "a89b1724-4519-480a-ae56-a8990e29f906",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e29e790d-53f1-4002-8a9f-d2b82dfdd920",
  "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "assignment_id": "9ae2309d-c259-4874-b536-ded8cb792177",
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

`GET /api/rider/v1/orders/a22b8fbc-c626-43c4-9da9-942283f73860` → **200**

```json
{
  "id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f6ba133b-6d34-4765-8972-415d8b1ad18a",
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
    "id": "9ae2309d-c259-4874-b536-ded8cb792177",
    "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e29e790d-53f1-4002-8a9f-d2b82dfdd920",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T14:39:41.63649Z",
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
    "id": "a4c2eba2-e31a-43a6-ad82-f0836b96a29b",
    "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
    "expires_at": "2026-10-27T14:39:56.828035Z",
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

`POST /api/driver/v1/offers/a4c2eba2-e31a-43a6-ad82-f0836b96a29b/accept` → **200**

```json
{
  "command_id": "3779c252-c43c-4ab8-b585-a3535c5a00e8"
}
```

```json
{
  "id": "e012364b-f0fe-4f58-8e80-1a0f30db17da",
  "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "71d22cf0-d4f1-4d4d-a68c-a310493ab6fc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "71d22cf0-d4f1-4d4d-a68c-a310493ab6fc",
  "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "assignment_id": "e012364b-f0fe-4f58-8e80-1a0f30db17da",
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

`POST /api/driver/v1/trips/71d22cf0-d4f1-4d4d-a68c-a310493ab6fc/cancel` → **200**

```json
{
  "command_id": "57ee7eb9-c932-4542-a781-0b4d26a0a8c5",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "71d22cf0-d4f1-4d4d-a68c-a310493ab6fc",
  "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
  "assignment_id": "e012364b-f0fe-4f58-8e80-1a0f30db17da",
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
    "id": "a22b8fbc-c626-43c4-9da9-942283f73860",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:39:41.63649Z",
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
        "uk": "Пасажир попросив скасувати",
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "55060f63-0d8f-45b2-bd9c-e58805e1e322",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:39:41.121575Z",
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
        "uk": "Довго чекати авто",
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/a22b8fbc-c626-43c4-9da9-942283f73860/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:39:41.637482Z",
      "actor": {
        "type": "CLIENT",
        "id": "f6ba133b-6d34-4765-8972-415d8b1ad18a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
        "quote_id": "f31728b0-62ca-44e3-9d8d-5739bc090174",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:39:41.640704Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
        "attempt_id": "d6a70d51-36bb-4b73-a929-cd364debbdb2",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:39:41.649226Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a6d662cc-f7bd-48a9-8276-b4fabaa43b30",
        "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:39:41.727785Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a6d662cc-f7bd-48a9-8276-b4fabaa43b30",
        "order_id": "a22b8fbc-c626-43c4-9da9-942283f73860",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "9ae2309d-c259-4874-b536-ded8cb792177"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 55060f63-0d8f-45b2-bd9c-e58805e1e322, a22b8fbc-c626-43c4-9da9-942283f73860.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733979746",
  "device_ref": "sandbox-27749"
}
```

```json
{
  "challenge_id": "39d616d3-d36b-4b1e-9107-871e11e21fab",
  "expires_at": "2026-10-27T14:44:42.136892309Z",
  "resend_available_at": "2026-10-27T14:39:43.136892309Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733979746` → **200**

```json
{
  "phone": "+380733979746",
  "audience": "CLIENT",
  "code": "257740",
  "sent_at": "2026-10-27T14:39:42.140628553Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39d616d3-d36b-4b1e-9107-871e11e21fab",
  "code": "257740",
  "device_ref": "sandbox-27749"
}
```

```json
{
  "session_id": "5c1bb90a-0f28-400f-8b87-3c195b881510",
  "subject": {
    "type": "CLIENT",
    "id": "b9083782-4d52-48be-9a98-e58e6171db8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiOTA4Mzc4Mi00ZDUyLTQ4YmUtOWE5OC1lNThlNjE3MWRiOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyODgyLCJpYXQiOjE3OTMxMTE5ODIsImp0aSI6IjY0NzlmZDJjLTVhYTEtNGRjMi04OTc2LThiOWU4ZmM5YzBhZCIsInNpZCI6IjVjMWJiOTBhLTBmMjgtNDAwZi04Yjg3LTNjMTk1Yjg4MTUxMCJ9.S6_5TbpYcktzzV8HWearb2TsS4MKtx3gSV6FN4bUUG0",
  "access_expires_at": "2026-10-27T14:54:42.204006609Z",
  "refresh_token": "DkdLoiolkc7-pmQsSlLA2ERotQYDqF8tQk-PTF2FpcI",
  "refresh_expires_at": "2026-11-26T14:39:42.203178942Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "26fa6f5a-596e-4e7a-89f5-91412ef4470a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "5335e7f3-1e5f-4d22-90fb-a26aeb132582",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-5335e7f3-1e5f-4d22-90fb-a26aeb132582",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "7203e8d33d6ee6ae632cb5691230d03d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=5335e7f3-1e5f-4d22-90fb-a26aeb132582",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733979746"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=5335e7f3-1e5f-4d22-90fb-a26aeb132582",
  "expires_at": "2026-10-27T15:09:42.244216Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/5335e7f3-1e5f-4d22-90fb-a26aeb132582` → **200**

```json
{
  "id": "5335e7f3-1e5f-4d22-90fb-a26aeb132582",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:09:42.244216Z",
  "card": {
    "id": "6b07c1a1-77de-49fe-8d55-f8201102857e",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4460",
    "card_type": "Visa",
    "created_at": "2026-10-27T14:39:42.293797Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "6b07c1a1-77de-49fe-8d55-f8201102857e",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****4460",
      "card_type": "Visa",
      "created_at": "2026-10-27T14:39:42.293797Z"
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
  "device_ref": "sandbox-12818"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "7896a117-c5de-40d3-b7a7-833e74c81cf9",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12818"
}
```

```json
{
  "challenge_id": "dc25e49b-c6fd-4ac4-927b-5e5adc1f0ee0",
  "expires_at": "2026-10-27T14:44:43.414946602Z",
  "resend_available_at": "2026-10-27T14:39:44.414946602Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "944703",
  "sent_at": "2026-10-27T14:39:43.418639466Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc25e49b-c6fd-4ac4-927b-5e5adc1f0ee0",
  "code": "944703",
  "device_ref": "sandbox-12818"
}
```

```json
{
  "session_id": "f08beffd-6d95-4914-a285-0356832f01b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg4MywiaWF0IjoxNzkzMTExOTgzLCJqdGkiOiJmMWIxYjI2Mi00NjJlLTRjYmUtODE3Yi1jOWQ4NTg1MDUzNDUiLCJzaWQiOiJmMDhiZWZmZC02ZDk1LTQ5MTQtYTI4NS0wMzU2ODMyZjAxYjEifQ.LtRcRqz6hYxaEhHDGPQF-3mwxOrS4eJhqb4utCRPsMA",
  "access_expires_at": "2026-10-27T14:54:43.476080272Z",
  "refresh_token": "RYoHusEyG69bepcakOzyPUmKT_iieknWk39PGC3QvUk",
  "refresh_expires_at": "2026-11-26T14:39:43.475260601Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:41.54889Z",
  "last_location_at": "2026-10-27T14:39:41.54889Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/35f633cf-3c1d-4fc9-b85f-10a840ee2014/handover` → **200**

```json
{
  "command_id": "102a56e7-2f85-4a08-9872-172670dfd6a1",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:41.54889Z",
  "last_location_at": "2026-10-27T14:39:41.54889Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/35f633cf-3c1d-4fc9-b85f-10a840ee2014/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:43Z",
    "sequence": 1793111983581
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:43.603548Z",
  "last_location_at": "2026-10-27T14:39:43.603548Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8019d6f3-1e9a-403f-985a-6bf18bbcdbd9",
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
  "id": "af03b01e-cdb7-465e-bfc0-8b7d2039f58e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T14:44:43.645182Z",
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
  "command_id": "c4b59fb3-e04c-4cc9-9b47-6da5ea6f8613",
  "quote_id": "af03b01e-cdb7-465e-bfc0-8b7d2039f58e",
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
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
  "created_at": "2026-10-27T14:39:43.684795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/8ad31241-5158-48b6-8374-fe92818f90e1` → **200**

```json
{
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
  "created_at": "2026-10-27T14:39:43.684795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/8ad31241-5158-48b6-8374-fe92818f90e1` → **200**

```json
{
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
  "created_at": "2026-10-27T14:39:43.684795Z",
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
    "id": "2e11a594-7ff8-4783-ae60-ce3580e0b028",
    "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
    "expires_at": "2026-10-27T14:39:59.483825Z",
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

`POST /api/driver/v1/offers/2e11a594-7ff8-4783-ae60-ce3580e0b028/accept` → **200**

```json
{
  "command_id": "365c6ec0-ae9b-4d69-8287-d12a7601a572"
}
```

```json
{
  "id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
  "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
  "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "assignment_id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
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

`POST /api/driver/v1/work-sessions/35f633cf-3c1d-4fc9-b85f-10a840ee2014/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:44Z",
    "sequence": 1793111984875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:44.893397Z",
  "last_location_at": "2026-10-27T14:39:44.893397Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/28e9d52b-1b7d-42b7-9f25-4e37120d0e20/arrive` → **200**

```json
{
  "command_id": "e082aba1-559f-4406-94c6-9ca8b7f31b27",
  "expected_version": 0
}
```

```json
{
  "id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
  "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "assignment_id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
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
  "arrived_at": "2026-10-27T14:39:44.940614Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/28e9d52b-1b7d-42b7-9f25-4e37120d0e20/start` → **200**

```json
{
  "command_id": "8f9c8143-4f5b-4ea3-85fa-e04528e28b32",
  "expected_version": 1
}
```

```json
{
  "id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
  "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "assignment_id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
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
  "arrived_at": "2026-10-27T14:39:44.940614Z",
  "started_at": "2026-10-27T14:39:44.986605Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/28e9d52b-1b7d-42b7-9f25-4e37120d0e20/complete` → **200**

```json
{
  "command_id": "095ad9b8-f58d-446f-8720-02180776e883",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:39:45Z"
}
```

```json
{
  "id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
  "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "assignment_id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
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
  "arrived_at": "2026-10-27T14:39:44.940614Z",
  "started_at": "2026-10-27T14:39:44.986605Z",
  "completed_at": "2026-10-27T14:39:45.041455Z",
  "needs_review": false
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/8ad31241-5158-48b6-8374-fe92818f90e1` → **200**

```json
{
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
    "id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
    "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:39:43.684795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/8ad31241-5158-48b6-8374-fe92818f90e1` → **200**

```json
{
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
    "id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
    "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:39:43.684795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/8ad31241-5158-48b6-8374-fe92818f90e1` → **200**

```json
{
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
    "id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
    "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:39:43.684795Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/8ad31241-5158-48b6-8374-fe92818f90e1` → **200**

```json
{
  "id": "8ad31241-5158-48b6-8374-fe92818f90e1",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b9083782-4d52-48be-9a98-e58e6171db8a",
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
    "id": "5c39e7a4-1b01-4a9f-8a92-83ddaf8682e8",
    "order_id": "8ad31241-5158-48b6-8374-fe92818f90e1",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "28e9d52b-1b7d-42b7-9f25-4e37120d0e20",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:39:43.684795Z",
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

Done: card order 8ad31241-5158-48b6-8374-fe92818f90e1.

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
  "device_ref": "sandbox-9391"
}
```

```json
{
  "challenge_id": "3a5ec958-30cd-4f28-a2c5-0c4169413746",
  "expires_at": "2026-10-27T14:44:48.270849731Z",
  "resend_available_at": "2026-10-27T14:39:49.270849731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "889248",
  "sent_at": "2026-10-27T14:39:48.273801164Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a5ec958-30cd-4f28-a2c5-0c4169413746",
  "code": "889248",
  "device_ref": "sandbox-9391"
}
```

```json
{
  "session_id": "dc9065bd-1fb3-4d31-9ef3-128436dd95c1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg4OCwiaWF0IjoxNzkzMTExOTg4LCJqdGkiOiJkN2U1MzI5Yi0wY2E5LTQ0ZjItYTczZS1mYTYxZjI4MWVlNDEiLCJzaWQiOiJkYzkwNjViZC0xZmIzLTRkMzEtOWVmMy0xMjg0MzZkZDk1YzEifQ.Rb37edrfXpt81noESwlMqt-oLSJihd6LWT7juC0GsNs",
  "access_expires_at": "2026-10-27T14:54:48.333227961Z",
  "refresh_token": "EGpDG9-gJQvdvzj9UKH_jTLfNjblbgCm4nFR0LNLngQ",
  "refresh_expires_at": "2026-11-26T14:39:48.33249024Z",
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
  "command_id": "73b74833-63ad-4b43-b731-7d0e07b6b295",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:48Z",
    "sequence": 1793111988386
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:48.403249Z",
  "last_location_at": "2026-10-27T14:39:48.403249Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674301348",
  "device_ref": "sandbox-17432"
}
```

```json
{
  "challenge_id": "fc9f38d0-c5c4-4be2-87f8-b6092135ea1d",
  "expires_at": "2026-10-27T14:44:48.438112791Z",
  "resend_available_at": "2026-10-27T14:39:49.438112791Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674301348` → **200**

```json
{
  "phone": "+380674301348",
  "audience": "CLIENT",
  "code": "759776",
  "sent_at": "2026-10-27T14:39:48.440974897Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc9f38d0-c5c4-4be2-87f8-b6092135ea1d",
  "code": "759776",
  "device_ref": "sandbox-17432"
}
```

```json
{
  "session_id": "55612be0-ffb3-4f6a-826d-26121b534d7e",
  "subject": {
    "type": "CLIENT",
    "id": "d264a40e-cf9e-4dcb-9b35-440faa9ed4cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMjY0YTQwZS1jZjllLTRkY2ItOWIzNS00NDBmYWE5ZWQ0Y2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyODg4LCJpYXQiOjE3OTMxMTE5ODgsImp0aSI6IjNjNjI0ODZiLWEzNzctNGE4YS05ZWNmLTgxYTcwZjNmNmJmYSIsInNpZCI6IjU1NjEyYmUwLWZmYjMtNGY2YS04MjZkLTI2MTIxYjUzNGQ3ZSJ9.bi1iLPmNwzp1aV2lL-jLJO6w-VhVhSKOo4JMlyJrS6s",
  "access_expires_at": "2026-10-27T14:54:48.501188286Z",
  "refresh_token": "noDTlDfcF0HPyknpDz74G3EBMPMhVpDkxocsO_XrrcU",
  "refresh_expires_at": "2026-11-26T14:39:48.500518761Z",
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
  "command_id": "9542f20c-bba6-4687-8438-404e5c034cc0",
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
  "id": "892cf436-815d-4c4f-9648-1b98bdbef5ea",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:44:48.570235Z",
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
  "command_id": "5cd33b23-36fe-425d-a870-1e8b8bc11957",
  "quote_id": "892cf436-815d-4c4f-9648-1b98bdbef5ea",
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
  "id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d264a40e-cf9e-4dcb-9b35-440faa9ed4cb",
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
  "created_at": "2026-10-27T14:39:48.613329Z",
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
    "id": "3e8cb952-e31a-4dee-a7d3-5736c827d313",
    "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
    "expires_at": "2026-10-27T14:40:03.617604Z",
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

`POST /api/driver/v1/offers/3e8cb952-e31a-4dee-a7d3-5736c827d313/accept` → **200**

```json
{
  "command_id": "2d085c3a-6415-43c6-9223-3b3e59cc643e"
}
```

```json
{
  "id": "4078c145-3016-471a-9c96-865755d51e70",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/9b8d9d9e-dd16-4192-80f2-d7fe522002a7/messages` → **201**

```json
{
  "command_id": "9ff71082-9074-4fea-b8b7-9234551502cc",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "9eb4e094-48ce-4af6-998a-4f642fb3be74",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:39:48.734346403Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "assignment_id": "4078c145-3016-471a-9c96-865755d51e70",
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

`POST /api/driver/v1/trips/39a51508-b5a3-4ef5-b918-aee7c13a162f/messages` → **201**

```json
{
  "command_id": "54f92d61-ba60-4973-b29c-90dba9491e54",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "b2ea3c4e-602e-4272-b280-9bc882b4f507",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:39:48.79153817Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/9b8d9d9e-dd16-4192-80f2-d7fe522002a7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/39a51508-b5a3-4ef5-b918-aee7c13a162f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674301348"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:48Z",
    "sequence": 1793111988872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:48.890066Z",
  "last_location_at": "2026-10-27T14:39:48.890066Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "assignment_id": "4078c145-3016-471a-9c96-865755d51e70",
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

`POST /api/driver/v1/trips/39a51508-b5a3-4ef5-b918-aee7c13a162f/arrive` → **200**

```json
{
  "command_id": "ab12fea5-876c-400b-8d46-72438d83f487",
  "expected_version": 0
}
```

```json
{
  "id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "assignment_id": "4078c145-3016-471a-9c96-865755d51e70",
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
  "arrived_at": "2026-10-27T14:39:48.945738Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/39a51508-b5a3-4ef5-b918-aee7c13a162f/start` → **200**

```json
{
  "command_id": "fb76a216-e071-42b6-93cf-42ead8adf10e",
  "expected_version": 1
}
```

```json
{
  "id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "assignment_id": "4078c145-3016-471a-9c96-865755d51e70",
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
  "arrived_at": "2026-10-27T14:39:48.945738Z",
  "started_at": "2026-10-27T14:39:48.983355Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:49Z",
    "sequence": 1793111989868
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:49.026373Z",
  "last_location_at": "2026-10-27T14:39:49.026373Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/39a51508-b5a3-4ef5-b918-aee7c13a162f/complete` → **200**

```json
{
  "command_id": "9900f1eb-9898-4d55-812e-f7c0117051cd",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:39:49Z",
  "cash_received": true
}
```

```json
{
  "id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
  "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "assignment_id": "4078c145-3016-471a-9c96-865755d51e70",
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
  "arrived_at": "2026-10-27T14:39:48.945738Z",
  "started_at": "2026-10-27T14:39:48.983355Z",
  "completed_at": "2026-10-27T14:39:49.068007Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/9b8d9d9e-dd16-4192-80f2-d7fe522002a7` → **200**

```json
{
  "id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d264a40e-cf9e-4dcb-9b35-440faa9ed4cb",
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
    "id": "4078c145-3016-471a-9c96-865755d51e70",
    "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:39:48.613329Z",
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
    "id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
    "short_number": 4,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:39:48.613329Z",
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
    "id": "39a51508-b5a3-4ef5-b918-aee7c13a162f",
    "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
    "order_short_number": 4,
    "created_at": "2026-10-27T14:39:48.688162Z",
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
  "session_id": "84279c8e-dccd-47ed-af33-0caa559e26e0",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTIsImlhdCI6MTc5MzExMTk5MiwianRpIjoiMWQ1Yzg3OWMtYTU5ZS00ZDU5LWJkYWEtODQyNjhhZmJkYzAzIiwic2lkIjoiODQyNzljOGUtZGNjZC00N2VkLWFmMzMtMGNhYTU1OWUyNmUwIn0.ufa7YtccqdVRN6jqdnoVHRmSBBoULxBWz3mZ0RqzTXk",
  "access_expires_at": "2026-10-27T14:54:52.51982849Z",
  "refresh_token": "tz-xISg0Lf9AoiWgjabKsHIEXiKOUBD-NeqkvDAp1no",
  "refresh_expires_at": "2026-10-28T02:39:52.519175518Z",
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
  "session_id": "72ceab11-f2fa-4da4-bca9-7563a6f41462",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTIsImlhdCI6MTc5MzExMTk5MiwianRpIjoiNTdhMTg1NDQtMDk5Ny00YmRiLTkyNmItM2U4ZjI4OWQ3YTVkIiwic2lkIjoiNzJjZWFiMTEtZjJmYS00ZGE0LWJjYTktNzU2M2E2ZjQxNDYyIn0._SowO_88LJa4xZxXgyxnnISCU5uh0ko4R7k991Q2dZE",
  "access_expires_at": "2026-10-27T14:54:52.84416559Z",
  "refresh_token": "d8rzrMUiGSqTw7kDhAiV_oR6NZie4TkVvwb3kn6P5V8",
  "refresh_expires_at": "2026-10-28T02:39:52.843524149Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9b8d9d9e-dd16-4192-80f2-d7fe522002a7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:39:48.614231Z",
      "actor": {
        "type": "CLIENT",
        "id": "d264a40e-cf9e-4dcb-9b35-440faa9ed4cb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
        "quote_id": "892cf436-815d-4c4f-9648-1b98bdbef5ea",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:39:48.61633Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
        "attempt_id": "41fd6969-6d95-47e6-b62d-03d9d3c48bed",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:39:48.623159Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3e8cb952-e31a-4dee-a7d3-5736c827d313",
        "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:39:48.690331Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3e8cb952-e31a-4dee-a7d3-5736c827d313",
        "order_id": "9b8d9d9e-dd16-4192-80f2-d7fe522002a7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "4078c145-3016-471a-9c96-865755d51e70"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 9b8d9d9e-dd16-4192-80f2-d7fe522002a7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10"
}
```

```json
{
  "challenge_id": "01cc5b56-f824-40cd-bafd-e7f217e16eb6",
  "expires_at": "2026-10-27T14:44:52.913128987Z",
  "resend_available_at": "2026-10-27T14:39:53.913128987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "470220",
  "sent_at": "2026-10-27T14:39:52.916102813Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01cc5b56-f824-40cd-bafd-e7f217e16eb6",
  "code": "470220",
  "device_ref": "sandbox-10"
}
```

```json
{
  "session_id": "9f109459-cf71-42ab-9a72-cb5769fc135c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg5MiwiaWF0IjoxNzkzMTExOTkyLCJqdGkiOiI0ZWI1NThkYi1mYTNiLTQyMzItODM2YS0wYmZiYWViOTFlYzYiLCJzaWQiOiI5ZjEwOTQ1OS1jZjcxLTQyYWItOWE3Mi1jYjU3NjlmYzEzNWMifQ.2aqzPRF10LmfeGGh0By9SjSmQSYV82MXR6_QIjrw4kk",
  "access_expires_at": "2026-10-27T14:54:52.975377648Z",
  "refresh_token": "5HTitwzFzs36_nquJ3TXPI4bcSL4Fxe1EAugzITlDEw",
  "refresh_expires_at": "2026-11-26T14:39:52.97475896Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:49.026373Z",
  "last_location_at": "2026-10-27T14:39:49.026373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/handover` → **200**

```json
{
  "command_id": "b5e4080a-1f3d-43c2-8930-612bc82f6900",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:49.026373Z",
  "last_location_at": "2026-10-27T14:39:49.026373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:53Z",
    "sequence": 1793111993680
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.085347Z",
  "last_location_at": "2026-10-27T14:39:53.085347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660205019",
  "device_ref": "sandbox-29022"
}
```

```json
{
  "challenge_id": "fc134f7f-83aa-42ed-be04-a9118fb3f459",
  "expires_at": "2026-10-27T14:44:53.112008743Z",
  "resend_available_at": "2026-10-27T14:39:54.112008743Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660205019` → **200**

```json
{
  "phone": "+380660205019",
  "audience": "CLIENT",
  "code": "411736",
  "sent_at": "2026-10-27T14:39:53.115072425Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc134f7f-83aa-42ed-be04-a9118fb3f459",
  "code": "411736",
  "device_ref": "sandbox-29022"
}
```

```json
{
  "session_id": "defce668-dfc5-40ba-a569-e856734ece87",
  "subject": {
    "type": "CLIENT",
    "id": "185bfd0e-9c2f-4940-82f2-08b57fe4f743"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxODViZmQwZS05YzJmLTQ5NDAtODJmMi0wOGI1N2ZlNGY3NDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyODkzLCJpYXQiOjE3OTMxMTE5OTMsImp0aSI6IjgxNjEwODBlLTExZTQtNGFjZS1iODA4LThhM2Y1MmYwZWU5YSIsInNpZCI6ImRlZmNlNjY4LWRmYzUtNDBiYS1hNTY5LWU4NTY3MzRlY2U4NyJ9.Q96B34Cf0RXRmlPq8xkUenPhW4ZgqfOuCOAQF-3eUhQ",
  "access_expires_at": "2026-10-27T14:54:53.175255269Z",
  "refresh_token": "dG5E8v-ucTWlYG2P0p-gXATggQTrpsqzswhpBZPSX6w",
  "refresh_expires_at": "2026-11-26T14:39:53.174543088Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e219143c-3d65-484b-8a11-7a34da28d1a3",
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
  "id": "34a22447-4a52-4ba1-90f7-3a8f7f4abf4c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T14:44:53.215613Z",
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
  "command_id": "d3a12488-4562-47b0-bf02-6da84c0dd6ba",
  "quote_id": "34a22447-4a52-4ba1-90f7-3a8f7f4abf4c",
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
  "id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "185bfd0e-9c2f-4940-82f2-08b57fe4f743",
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
  "created_at": "2026-10-27T14:39:53.254219Z",
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
    "id": "dcb6ae14-eaf8-4fbf-88bf-637a369792d3",
    "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
    "expires_at": "2026-10-27T14:40:08.258233Z",
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

`POST /api/driver/v1/offers/dcb6ae14-eaf8-4fbf-88bf-637a369792d3/accept` → **200**

```json
{
  "command_id": "eb46cf16-cd0b-49d0-b9ca-43e55c105eec"
}
```

```json
{
  "id": "104d0cbb-e5fd-4ea1-bce8-3824861e0e0f",
  "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f548369-54c6-4682-9dc5-1eb0380404e0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f548369-54c6-4682-9dc5-1eb0380404e0",
  "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
  "assignment_id": "104d0cbb-e5fd-4ea1-bce8-3824861e0e0f",
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

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:53Z",
    "sequence": 1793111993373
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.389981Z",
  "last_location_at": "2026-10-27T14:39:53.085347Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1f548369-54c6-4682-9dc5-1eb0380404e0/arrive` → **200**

```json
{
  "command_id": "c2af00e0-9582-4648-9c5c-b643e8e1c8af",
  "expected_version": 0
}
```

```json
{
  "id": "1f548369-54c6-4682-9dc5-1eb0380404e0",
  "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
  "assignment_id": "104d0cbb-e5fd-4ea1-bce8-3824861e0e0f",
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
  "arrived_at": "2026-10-27T14:39:53.429099Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/1f548369-54c6-4682-9dc5-1eb0380404e0/start` → **200**

```json
{
  "command_id": "79c21274-5711-43ee-bbfc-fc9ba769de01",
  "expected_version": 1
}
```

```json
{
  "id": "1f548369-54c6-4682-9dc5-1eb0380404e0",
  "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
  "assignment_id": "104d0cbb-e5fd-4ea1-bce8-3824861e0e0f",
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
  "arrived_at": "2026-10-27T14:39:53.429099Z",
  "started_at": "2026-10-27T14:39:53.473139Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:53Z",
    "sequence": 1793111993500
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.516961Z",
  "last_location_at": "2026-10-27T14:39:53.085347Z",
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
  "device_ref": "sandbox-17507"
}
```

```json
{
  "challenge_id": "db76e7c3-4571-4e2a-9600-8b34f69c25aa",
  "expires_at": "2026-10-27T14:44:53.542628964Z",
  "resend_available_at": "2026-10-27T14:39:54.542628964Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "451326",
  "sent_at": "2026-10-27T14:39:53.545542958Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db76e7c3-4571-4e2a-9600-8b34f69c25aa",
  "code": "451326",
  "device_ref": "sandbox-17507"
}
```

```json
{
  "session_id": "cbb2c501-c4d0-4369-9a92-70f32fc7da60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg5MywiaWF0IjoxNzkzMTExOTkzLCJqdGkiOiI5MWI3YmY5OS0wZjlmLTQ5MzEtYTY5Ny02NjUwMmIyZjg2MGIiLCJzaWQiOiJjYmIyYzUwMS1jNGQwLTQzNjktOWE5Mi03MGYzMmZjN2RhNjAifQ.II8WKeRH1iMrr9y2oolVdYs-y-t_2VEEv4hx5tcAxTE",
  "access_expires_at": "2026-10-27T14:54:53.603964217Z",
  "refresh_token": "kqAn8rPW3S8FM_Qz-xb4QCkKRXqQEzUzxlT0X4dZyDo",
  "refresh_expires_at": "2026-11-26T14:39:53.603277973Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1782562-a91d-470c-8714-71b464628e5c",
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
  "last_heartbeat_at": "2026-10-27T14:39:41.361952Z",
  "last_location_at": "2026-10-27T14:39:41.361952Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1782562-a91d-470c-8714-71b464628e5c/handover` → **200**

```json
{
  "command_id": "0c751700-19e1-4c96-9c32-f507b503a7bb",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1782562-a91d-470c-8714-71b464628e5c",
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
  "last_heartbeat_at": "2026-10-27T14:39:41.361952Z",
  "last_location_at": "2026-10-27T14:39:41.361952Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1782562-a91d-470c-8714-71b464628e5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:53Z",
    "sequence": 1793111993698
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1782562-a91d-470c-8714-71b464628e5c",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.715455Z",
  "last_location_at": "2026-10-27T14:39:53.715455Z",
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
  "session_id": "f569efe9-def3-4f58-b50f-3d60cb5e6dd8",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTQsImlhdCI6MTc5MzExMTk5NCwianRpIjoiM2VmNWRmYmYtOTY3YS00Y2E1LWE0Y2UtNWE4YmUzZDVhOTEzIiwic2lkIjoiZjU2OWVmZTktZGVmMy00ZjU4LWI1MGYtM2Q2MGNiNWU2ZGQ4In0.JgdVC_5TJt1SSQ0g_I3v5YLRvwTY-FrhN3c_9hZIuGA",
  "access_expires_at": "2026-10-27T14:54:54.040075237Z",
  "refresh_token": "Znp_PPpHYez3S3Ys0d8abR10YaN6oa3HtDUkPwesNAo",
  "refresh_expires_at": "2026-10-28T02:39:54.039441711Z",
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
  "session_id": "a116bf97-cd9e-4359-81c0-483c056be983",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTQsImlhdCI6MTc5MzExMTk5NCwianRpIjoiYTJmMTNlMjktOGY4OC00ZTQwLThjNDUtZTdkYTEyZTBmN2EyIiwic2lkIjoiYTExNmJmOTctY2Q5ZS00MzU5LTgxYzAtNDgzYzA1NmJlOTgzIn0.HNjczxcoVeu7wiS4sKsXdDCXwdHCKZoFIOgyy1q1C3U",
  "access_expires_at": "2026-10-27T14:54:54.364942823Z",
  "refresh_token": "caoZBGdi3-I7aqCyrBY-vmKbgqstZTT55yGll3XchuY",
  "refresh_expires_at": "2026-10-28T02:39:54.364326599Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/636d0b74-f1cb-4458-b68f-22c4fa8cce78` → **200**

```json
{
  "id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
  "short_number": 5,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "185bfd0e-9c2f-4940-82f2-08b57fe4f743",
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
    "id": "104d0cbb-e5fd-4ea1-bce8-3824861e0e0f",
    "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "1f548369-54c6-4682-9dc5-1eb0380404e0",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T14:39:53.254219Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/636d0b74-f1cb-4458-b68f-22c4fa8cce78/interrupt` → **200**

```json
{
  "command_id": "e459dd09-fd8c-4b2e-9a92-41ef0b598f96",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
    "short_number": 5,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "185bfd0e-9c2f-4940-82f2-08b57fe4f743",
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
      "id": "104d0cbb-e5fd-4ea1-bce8-3824861e0e0f",
      "order_id": "636d0b74-f1cb-4458-b68f-22c4fa8cce78",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "1f548369-54c6-4682-9dc5-1eb0380404e0",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T14:39:53.254219Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі",
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "2d3a8d3f-d685-47d2-8ae5-d9e0098f93a7",
    "short_number": 6,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "185bfd0e-9c2f-4940-82f2-08b57fe4f743",
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4275,
      "lon": 30.5636
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff": {
      "lat": 50.3906,
      "lon": 30.4825
    },
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "payment_state": null,
    "price_minor": 21297,
    "final_price_minor": null,
    "currency": "UAH",
    "search_phase": "PERSONAL",
```

## Oleh takes the follow-up and finishes; the rider sees both orders

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "12bfc8b2-2ae4-478e-9b6c-06919c38cc12",
    "order_id": "2d3a8d3f-d685-47d2-8ae5-d9e0098f93a7",
    "expires_at": "2026-10-27T14:40:09.463056Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4275,
      "lon": 30.5636
    },
    "pickup_label": "Where the previous car stopped",
    "dropoff_label": "Голосіїв",
    "payment_method": "SERVICE",
    "price_minor": 21297,
    "currency": "UAH",
    "distance_m": 3075
  }
]
```

`POST /api/driver/v1/offers/12bfc8b2-2ae4-478e-9b6c-06919c38cc12/accept` → **200**

```json
{
  "command_id": "22737b6b-5f25-401f-82d5-a7e0c3068756"
}
```

```json
{
  "id": "69de6cbb-deca-4c74-9ae5-e8019f6ee4b2",
  "order_id": "2d3a8d3f-d685-47d2-8ae5-d9e0098f93a7",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30522103-4d68-46f9-9ac3-956578954b50",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30522103-4d68-46f9-9ac3-956578954b50",
  "order_id": "2d3a8d3f-d685-47d2-8ae5-d9e0098f93a7",
  "assignment_id": "69de6cbb-deca-4c74-9ae5-e8019f6ee4b2",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4275,
    "lon": 30.5636
  },
  "pickup_label": "Where the previous car stopped",
  "dropoff": {
    "lat": 50.3906,
    "lon": 30.4825
  },
  "dropoff_label": "Голосіїв",
  "payment_method": "SERVICE",
  "price_minor": 21297,
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
  "session_id": "f1782562-a91d-470c-8714-71b464628e5c",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.715455Z",
  "last_location_at": "2026-10-27T14:39:53.715455Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f1782562-a91d-470c-8714-71b464628e5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:54Z",
    "sequence": 1793111994614
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1782562-a91d-470c-8714-71b464628e5c",
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
  "last_heartbeat_at": "2026-10-27T14:39:54.63146Z",
  "last_location_at": "2026-10-27T14:39:54.63146Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/30522103-4d68-46f9-9ac3-956578954b50/arrive` → **422**

```json
{
  "command_id": "f783cd7c-fe0b-471b-bee0-4736753d48e1",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/30522103-4d68-46f9-9ac3-956578954b50/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "913f73f0-6f4e-4383-b200-1c99401390fa"
}
```

**Expected 200, got 422 — scenario stopped.**

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
  "session_id": "dd2636cc-d992-4281-8ecb-43ee3745b302",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTUsImlhdCI6MTc5MzExMTk5NSwianRpIjoiNjJjODRkYTMtZmI4Mi00MjEzLTk2MTMtOTlkNTljY2Y3ZjJmIiwic2lkIjoiZGQyNjM2Y2MtZDk5Mi00MjgxLThlY2ItNDNlZTM3NDViMzAyIn0.l9-viefq42UzSeOwK5aBd5nSnEqbrRJcjDE4TMoEEyM",
  "access_expires_at": "2026-10-27T14:54:55.020601259Z",
  "refresh_token": "szSohBha8i0KYDLbjVP7UYOeLHJFJhmN4KhNjoZwTFI",
  "refresh_expires_at": "2026-10-28T02:39:55.01987444Z",
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
  "session_id": "f055c5e5-79cc-4d69-b133-3100fe3d7190",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTUsImlhdCI6MTc5MzExMTk5NSwianRpIjoiZjZiY2QyMDctYzc0OC00NjU0LWJmNzAtMzFmNjU3ZGI5NGU1Iiwic2lkIjoiZjA1NWM1ZTUtNzljYy00ZDY5LWIxMzMtMzEwMGZlM2Q3MTkwIn0.NDWATyBD7wyf4zVzZWAOVjdw9PeKv2Sia_SV1s3LtHk",
  "access_expires_at": "2026-10-27T14:54:55.343853573Z",
  "refresh_token": "cyxl95SAYwNpusXE1Cm6qOIcksbE9cWG4OKajC1YRF8",
  "refresh_expires_at": "2026-10-28T02:39:55.34322674Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10790"
}
```

```json
{
  "challenge_id": "0fad3240-7692-4bb1-a110-2ecba4c61488",
  "expires_at": "2026-10-27T14:44:55.369979251Z",
  "resend_available_at": "2026-10-27T14:39:56.369979251Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "703572",
  "sent_at": "2026-10-27T14:39:55.372760769Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fad3240-7692-4bb1-a110-2ecba4c61488",
  "code": "703572",
  "device_ref": "sandbox-10790"
}
```

```json
{
  "session_id": "b104a3a0-77b5-47d0-9d29-e903b7ddcc2f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg5NSwiaWF0IjoxNzkzMTExOTk1LCJqdGkiOiI0N2I3NTY0Yy02YjIzLTQzZDQtYmY5NC0yZDBmNDFiZWJkZWQiLCJzaWQiOiJiMTA0YTNhMC03N2I1LTQ3ZDAtOWQyOS1lOTAzYjdkZGNjMmYifQ.5tqrqRgyy2LCMdwmVHbNMT7V87FzdcTQUYLlJPJf3AE",
  "access_expires_at": "2026-10-27T14:54:55.432466924Z",
  "refresh_token": "Jb74Deh8pBB0ha4h5L4dLET5_gG8sbhjVZaFlWzWBIg",
  "refresh_expires_at": "2026-11-26T14:39:55.431706538Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.516961Z",
  "last_location_at": "2026-10-27T14:39:53.085347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/handover` → **200**

```json
{
  "command_id": "81c6746d-1d4b-432d-818e-bc31e1b480e8",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:53.516961Z",
  "last_location_at": "2026-10-27T14:39:53.085347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:55Z",
    "sequence": 1793111995523
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:55.543886Z",
  "last_location_at": "2026-10-27T14:39:55.543886Z",
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
  "command_id": "7a49c0fc-b18d-4221-a038-82cd5ae2e54b",
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
  "effective_at": "2026-10-27T14:39:55.624816Z",
  "changed_by": "52b81e9f-553c-42db-9b69-59b7056d2d3a",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "52b81e9f-553c-42db-9b69-59b7056d2d3a",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T14:39:55.658050987Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c4345e1e-33fd-4614-a4e1-15785fea0b7d",
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
  "id": "bef19646-566b-4a64-81af-5c9152492737",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:44:55.703353Z",
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
  "command_id": "5e9fbce6-05cc-4d04-a5d3-89bf230743be",
  "quote_id": "bef19646-566b-4a64-81af-5c9152492737",
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
    "phone": "+3806711124299"
  }
}
```

```json
{
  "id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
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
  "created_at": "2026-10-27T14:39:55.761471Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124299"
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
    "id": "aa37a746-d710-42ee-b6bb-a63400268700",
    "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
    "expires_at": "2026-10-27T14:40:10.766496Z",
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

`POST /api/driver/v1/offers/aa37a746-d710-42ee-b6bb-a63400268700/accept` → **200**

```json
{
  "command_id": "1fa5bc9d-96a2-41fa-821f-a1a6145c8277"
}
```

```json
{
  "id": "2a8a9d21-75d7-4c7a-b06c-c77e41a0cbc9",
  "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7",
  "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
  "assignment_id": "2a8a9d21-75d7-4c7a-b06c-c77e41a0cbc9",
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

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:55Z",
    "sequence": 1793111995879
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:55.89528Z",
  "last_location_at": "2026-10-27T14:39:55.89528Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7/arrive` → **200**

```json
{
  "command_id": "3875995f-0554-4f38-b8bc-a36d64158091",
  "expected_version": 0
}
```

```json
{
  "id": "3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7",
  "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
  "assignment_id": "2a8a9d21-75d7-4c7a-b06c-c77e41a0cbc9",
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
  "arrived_at": "2026-10-27T14:39:55.933254Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7/start` → **200**

```json
{
  "command_id": "5d0af5ff-6e2f-4cb2-ab04-c8f847ac1a25",
  "expected_version": 1
}
```

```json
{
  "id": "3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7",
  "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
  "assignment_id": "2a8a9d21-75d7-4c7a-b06c-c77e41a0cbc9",
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
  "arrived_at": "2026-10-27T14:39:55.933254Z",
  "started_at": "2026-10-27T14:39:55.974185Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7/complete` → **200**

```json
{
  "command_id": "753a9be7-1ecf-4795-975e-a07d9a72c775",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:39:56Z",
  "cash_received": true
}
```

```json
{
  "id": "3deec3b2-c5cc-4cba-be2f-aadd11f1f4d7",
  "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
  "assignment_id": "2a8a9d21-75d7-4c7a-b06c-c77e41a0cbc9",
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
  "arrived_at": "2026-10-27T14:39:55.933254Z",
  "started_at": "2026-10-27T14:39:55.974185Z",
  "completed_at": "2026-10-27T14:39:56.019118Z",
  "needs_review": false
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "95dc49a9-bd39-4192-b762-97f9725e963d",
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
  "id": "f17f06c5-fa63-4116-a7df-f033296cd0ee",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:44:56.066930Z",
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
  "command_id": "03ce6239-2ca0-44cc-96cf-684a8ce5f53a",
  "quote_id": "f17f06c5-fa63-4116-a7df-f033296cd0ee",
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
    "phone": "+3806711128667"
  }
}
```

```json
{
  "id": "77ec9c59-42aa-4580-a058-ac100041bb35",
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
  "created_at": "2026-10-27T14:39:56.105658Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128667"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/77ec9c59-42aa-4580-a058-ac100041bb35` → **200**

```json
{
  "id": "77ec9c59-42aa-4580-a058-ac100041bb35",
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
  "created_at": "2026-10-27T14:39:56.105658Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128667"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/77ec9c59-42aa-4580-a058-ac100041bb35/cancel` → **200**

```json
{
  "command_id": "94096e8a-6ea7-451e-808e-13b7512f9622",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "77ec9c59-42aa-4580-a058-ac100041bb35",
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
  "created_at": "2026-10-27T14:39:56.105658Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711128667"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора"
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
  "staff_id": "52b81e9f-553c-42db-9b69-59b7056d2d3a",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T14:39:56.024762Z",
  "last_entries": [
    {
      "order_id": "77ec9c59-42aa-4580-a058-ac100041bb35",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T14:39:56.18715Z"
    },
    {
      "order_id": "3e77290e-4111-4490-bc3f-e1aa38a05e0b",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T14:39:56.024762Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "798688e5-335e-4c07-9d15-f07a6231af19",
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
  "last_heartbeat_at": "2026-10-27T14:39:55.89528Z",
  "last_location_at": "2026-10-27T14:39:55.89528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/798688e5-335e-4c07-9d15-f07a6231af19/close` → **200**

```json
{
  "command_id": "28be134e-13c5-4926-96c8-d75cdfb1222e",
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

Done: operator bonus for fulfilled 3e77290e-4111-4490-bc3f-e1aa38a05e0b and operator-fault cancellation 77ec9c59-42aa-4580-a058-ac100041bb35.

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
  "session_id": "6a1b2fe4-36b0-4076-9cad-04c3e2d51bb7",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTgsImlhdCI6MTc5MzExMTk5OCwianRpIjoiMzVjOTg0ZDgtMTRhYS00OTQ5LTgwZDctZjJmOTVlNzBiZTIyIiwic2lkIjoiNmExYjJmZTQtMzZiMC00MDc2LTljYWQtMDRjM2UyZDUxYmI3In0.relWVpMgfeqD3lWV5eKmVQ_vBfXQg1auVE_CAM7-EXQ",
  "access_expires_at": "2026-10-27T14:54:58.653208601Z",
  "refresh_token": "HprS6yVwAV6zcjVUDjGcz6SELRugHJnLNRxFAFmXK6Q",
  "refresh_expires_at": "2026-10-28T02:39:58.652619117Z",
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
  "command_id": "7530c17b-6841-43df-9a59-fcb81dcfffd8",
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
  "changed_by": "52b81e9f-553c-42db-9b69-59b7056d2d3a",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T14:39:58.731466784Z"
}
```

## The rider books the airport for 2026-10-27T17:39:58Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600831257",
  "device_ref": "sandbox-20140"
}
```

```json
{
  "challenge_id": "412a98ef-deb4-462e-90cd-110fc54f57ca",
  "expires_at": "2026-10-27T14:44:58.767905674Z",
  "resend_available_at": "2026-10-27T14:39:59.767905674Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600831257` → **200**

```json
{
  "phone": "+48600831257",
  "audience": "CLIENT",
  "code": "331144",
  "sent_at": "2026-10-27T14:39:58.770126477Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "412a98ef-deb4-462e-90cd-110fc54f57ca",
  "code": "331144",
  "device_ref": "sandbox-20140"
}
```

```json
{
  "session_id": "d10bfc40-1f52-4016-9c4a-afb385849435",
  "subject": {
    "type": "CLIENT",
    "id": "cd2fdd23-7301-434a-8523-7621a6e50176"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZDJmZGQyMy03MzAxLTQzNGEtODUyMy03NjIxYTZlNTAxNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyODk4LCJpYXQiOjE3OTMxMTE5OTgsImp0aSI6ImQzODhhZGYxLTJhNmItNGRkZi1iNGM3LWFjODlhMGIzNjczYyIsInNpZCI6ImQxMGJmYzQwLTFmNTItNDAxNi05YzRhLWFmYjM4NTg0OTQzNSJ9.z9HfBLonRIcxJaHroDlFKPtMSeL82WvmZHLVrXVwvTQ",
  "access_expires_at": "2026-10-27T14:54:58.828393679Z",
  "refresh_token": "AxF7ioHBKqfgQ17VEqfZkD9KKA78pi_yQLAvz2IFbks",
  "refresh_expires_at": "2026-11-26T14:39:58.827711946Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2d52d37-78e5-418b-9bb8-cd0876209734",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T17:39:58Z"
}
```

```json
{
  "id": "d814a9de-7db7-4bdb-a966-2e9b7046a97c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T14:44:58.866237Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T17:39:58Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1120b2ec-fcc7-4376-91ae-7ea01e1c7f90",
  "quote_id": "d814a9de-7db7-4bdb-a966-2e9b7046a97c",
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
  "pickup_at": "2026-10-27T17:39:58Z"
}
```

```json
{
  "id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cd2fdd23-7301-434a-8523-7621a6e50176",
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
  "created_at": "2026-10-27T14:39:58.905913Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T17:39:58Z",
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
  "device_ref": "sandbox-10390"
}
```

```json
{
  "challenge_id": "b8d2b646-4596-4cf8-bb47-f5ddc7713b0b",
  "expires_at": "2026-10-27T14:44:58.940371742Z",
  "resend_available_at": "2026-10-27T14:39:59.940371742Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "975460",
  "sent_at": "2026-10-27T14:39:58.943049012Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8d2b646-4596-4cf8-bb47-f5ddc7713b0b",
  "code": "975460",
  "device_ref": "sandbox-10390"
}
```

```json
{
  "session_id": "a9ea7ca4-e44e-4942-8859-8dd457e0748a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg5OSwiaWF0IjoxNzkzMTExOTk5LCJqdGkiOiI0ZmM5NGY5ZS0xYjE5LTQ2MjYtYjg1MC0yZmJjMThjMGI4MjYiLCJzaWQiOiJhOWVhN2NhNC1lNDRlLTQ5NDItODg1OS04ZGQ0NTdlMDc0OGEifQ.Ty_zUncKn4Qv9rV0f4jv0TquybLuDE6c5qhpsgcD9_A",
  "access_expires_at": "2026-10-27T14:54:59.000878596Z",
  "refresh_token": "_dKXWryJczkjIveXdQKO8oyqZ_RsURcDV_8T4pEEjRc",
  "refresh_expires_at": "2026-11-26T14:39:59.000267722Z",
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
  "command_id": "40a8961f-7b93-41a1-9209-26811b5bff7b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:59Z",
    "sequence": 1793111999548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "33b5d97e-b534-41f4-9b94-b717a3f1c9ea",
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
  "last_heartbeat_at": "2026-10-27T14:39:59.070158Z",
  "last_location_at": "2026-10-27T14:39:59.070158Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
      "short_number": 9,
      "pickup_at": "2026-10-27T17:39:58Z",
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

`POST /api/driver/v1/preorders/0d56d532-c7cb-4eec-9abc-de1339b62373/reserve` → **200**

```json
{
  "command_id": "28f3054f-319c-4b57-9ba4-53f32e7e5889"
}
```

```json
{
  "id": "d6f4e4f9-f541-4f8a-aa05-d401f828dfdc",
  "state": "RESERVED",
  "order": {
    "order_id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
    "short_number": 9,
    "pickup_at": "2026-10-27T17:39:58Z",
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
  "reserved_at": "2026-10-27T14:39:59.141354Z",
  "confirm_from": "2026-10-27T17:09:58Z",
  "confirm_until": "2026-10-27T17:19:58Z",
  "drop_until": "2026-10-27T16:39:58Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d6f4e4f9-f541-4f8a-aa05-d401f828dfdc",
      "state": "RESERVED",
      "order": {
        "order_id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:39:58Z",
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
      "reserved_at": "2026-10-27T14:39:59.141354Z",
      "confirm_from": "2026-10-27T17:09:58Z",
      "confirm_until": "2026-10-27T17:19:58Z",
      "drop_until": "2026-10-27T16:39:58Z"
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
      "id": "d6f4e4f9-f541-4f8a-aa05-d401f828dfdc",
      "state": "RESERVED",
      "order": {
        "order_id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:39:58Z",
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
      "reserved_at": "2026-10-27T14:39:59.141354Z",
      "confirm_from": "2026-10-27T17:09:58Z",
      "confirm_until": "2026-10-27T17:19:58Z",
      "drop_until": "2026-10-27T16:39:58Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d6f4e4f9-f541-4f8a-aa05-d401f828dfdc/confirm` → **409**

```json
{
  "command_id": "cb85af59-00be-45cf-a609-154789d7b9e2"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d6f4e4f9-f541-4f8a-aa05-d401f828dfdc/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "79fa2942-12ee-44d7-850d-4f3a1d7d876b"
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
  "session_id": "ef7be197-b2f7-43b8-8716-0b28d410edd8",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI4OTksImlhdCI6MTc5MzExMTk5OSwianRpIjoiZTI0YTI0ZmMtYWEzMS00MmQwLWEyNjAtODQ3ZGVlZmIyYjM4Iiwic2lkIjoiZWY3YmUxOTctYjJmNy00M2I4LTg3MTYtMGIyOGQ0MTBlZGQ4In0.LtlZ8jPVXQN-a382fHCH51bSa01R2xpDqHOPfdiFd9M",
  "access_expires_at": "2026-10-27T14:54:59.559132326Z",
  "refresh_token": "uHf02Q0KMv6eXeOSUmU-yhXbKQRey-NpaSccsApYgOE",
  "refresh_expires_at": "2026-10-28T02:39:59.558495955Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0d56d532-c7cb-4eec-9abc-de1339b62373` → **200**

```json
{
  "id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cd2fdd23-7301-434a-8523-7621a6e50176",
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
  "created_at": "2026-10-27T14:39:58.905913Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T17:39:58Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d6f4e4f9-f541-4f8a-aa05-d401f828dfdc",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T14:39:59.141354Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/0d56d532-c7cb-4eec-9abc-de1339b62373/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T14:39:58.907804Z",
      "actor": {
        "type": "CLIENT",
        "id": "cd2fdd23-7301-434a-8523-7621a6e50176",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
        "preorder": true,
        "quote_id": "d814a9de-7db7-4bdb-a966-2e9b7046a97c",
        "pickup_at": "2026-10-27T17:39:58Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T14:39:59.142509Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0d56d532-c7cb-4eec-9abc-de1339b62373",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d6f4e4f9-f541-4f8a-aa05-d401f828dfdc"
      }
    }
  ]
}
```

Done: pre-order 0d56d532-c7cb-4eec-9abc-de1339b62373, reservation d6f4e4f9-f541-4f8a-aa05-d401f828dfdc.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6828"
}
```

```json
{
  "challenge_id": "71212b2e-c37b-4857-bc3c-66d266c393b5",
  "expires_at": "2026-10-27T14:44:59.655229044Z",
  "resend_available_at": "2026-10-27T14:40:00.655229044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "067991",
  "sent_at": "2026-10-27T14:39:59.658046999Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "71212b2e-c37b-4857-bc3c-66d266c393b5",
  "code": "067991",
  "device_ref": "sandbox-6828"
}
```

```json
{
  "session_id": "f60cec0d-35f7-4c9a-95d3-50f6129e6019",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjg5OSwiaWF0IjoxNzkzMTExOTk5LCJqdGkiOiIwN2Y2OTMzZC1mYmUwLTQ0ZjEtOTA5Zi1jMDFkZGFjOTk2ZGYiLCJzaWQiOiJmNjBjZWMwZC0zNWY3LTRjOWEtOTVkMy01MGY2MTI5ZTYwMTkifQ.O8NNIQzYzIoN3-y3bNKMjsmm0YtTkLI0d6oQ_RV7NuU",
  "access_expires_at": "2026-10-27T14:54:59.717808311Z",
  "refresh_token": "OkoRVxOBeQV_AMnVw-fg2TSZCHd20LWLiF-Lg33fCSM",
  "refresh_expires_at": "2026-11-26T14:39:59.71709095Z",
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
  "command_id": "8ad1edfc-b38d-412b-8b36-4521a8518254",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:39:59Z",
    "sequence": 1793111999773
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df704788-362c-47fd-8c96-0c9886867d12",
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
  "last_heartbeat_at": "2026-10-27T14:39:59.789021Z",
  "last_location_at": "2026-10-27T14:39:59.789021Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671998222",
  "device_ref": "sandbox-2304"
}
```

```json
{
  "challenge_id": "04c1d5ec-74b4-48c0-bfd6-d92d76461bbf",
  "expires_at": "2026-10-27T14:44:59.819519664Z",
  "resend_available_at": "2026-10-27T14:40:00.819519664Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671998222` → **200**

```json
{
  "phone": "+380671998222",
  "audience": "CLIENT",
  "code": "443612",
  "sent_at": "2026-10-27T14:39:59.822122686Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "04c1d5ec-74b4-48c0-bfd6-d92d76461bbf",
  "code": "443612",
  "device_ref": "sandbox-2304"
}
```

```json
{
  "session_id": "fc9485fc-ddfb-4c42-a23f-283aec81ad98",
  "subject": {
    "type": "CLIENT",
    "id": "a1a01a4f-849b-4014-9abf-f5643fd69f99"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMWEwMWE0Zi04NDliLTQwMTQtOWFiZi1mNTY0M2ZkNjlmOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyODk5LCJpYXQiOjE3OTMxMTE5OTksImp0aSI6ImU0NmI5YzIwLWQyZjQtNGJmNS1hNGViLTE4MjljODViNWVmMSIsInNpZCI6ImZjOTQ4NWZjLWRkZmItNGM0Mi1hMjNmLTI4M2FlYzgxYWQ5OCJ9.GXS4jAa4IcYhQqvAUdfjrN5qgBYG2voB51DAq8oN5Yk",
  "access_expires_at": "2026-10-27T14:54:59.885301144Z",
  "refresh_token": "qv6JINGmlUABKFeFReXQpUSzmPWNFSP8RcVyI7wt31Y",
  "refresh_expires_at": "2026-11-26T14:39:59.884618111Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e4b2eb12-19bc-484c-b58b-821ca137fd80",
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
  "id": "17f8a15a-c579-40f5-98f6-04b831e792a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:44:59.926833Z",
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
  "command_id": "e218682f-3c05-4c6d-aeb0-6c27fb48d18c",
  "quote_id": "17f8a15a-c579-40f5-98f6-04b831e792a2",
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
  "id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a1a01a4f-849b-4014-9abf-f5643fd69f99",
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
  "created_at": "2026-10-27T14:39:59.967192Z",
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
    "id": "88d5e593-d0e3-4d1e-91bd-2434d4377a69",
    "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
    "expires_at": "2026-10-27T14:40:14.970843Z",
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

`POST /api/driver/v1/offers/88d5e593-d0e3-4d1e-91bd-2434d4377a69/accept` → **200**

```json
{
  "command_id": "692049d1-c381-4d09-89ec-4ef30208c16d"
}
```

```json
{
  "id": "d817bfb3-e37f-4c3d-b413-aeb583b2c91f",
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4f2fb990-389a-43b3-bd95-779c6db7286c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f2fb990-389a-43b3-bd95-779c6db7286c",
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "assignment_id": "d817bfb3-e37f-4c3d-b413-aeb583b2c91f",
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

`POST /api/driver/v1/work-sessions/df704788-362c-47fd-8c96-0c9886867d12/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:40:00Z",
    "sequence": 1793112000863
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df704788-362c-47fd-8c96-0c9886867d12",
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
  "last_heartbeat_at": "2026-10-27T14:40:00.101912Z",
  "last_location_at": "2026-10-27T14:40:00.101912Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4f2fb990-389a-43b3-bd95-779c6db7286c",
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "assignment_id": "d817bfb3-e37f-4c3d-b413-aeb583b2c91f",
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

`POST /api/driver/v1/trips/4f2fb990-389a-43b3-bd95-779c6db7286c/arrive` → **200**

```json
{
  "command_id": "0667a836-d237-4745-99f8-eb77d204ae82",
  "expected_version": 0
}
```

```json
{
  "id": "4f2fb990-389a-43b3-bd95-779c6db7286c",
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "assignment_id": "d817bfb3-e37f-4c3d-b413-aeb583b2c91f",
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
  "arrived_at": "2026-10-27T14:40:00.155384Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/4f2fb990-389a-43b3-bd95-779c6db7286c/start` → **200**

```json
{
  "command_id": "93fd8385-d423-47e9-a188-023cf5baa00b",
  "expected_version": 1
}
```

```json
{
  "id": "4f2fb990-389a-43b3-bd95-779c6db7286c",
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "assignment_id": "d817bfb3-e37f-4c3d-b413-aeb583b2c91f",
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
  "arrived_at": "2026-10-27T14:40:00.155384Z",
  "started_at": "2026-10-27T14:40:00.19197Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/df704788-362c-47fd-8c96-0c9886867d12/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:40:00Z",
    "sequence": 1793112000216
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df704788-362c-47fd-8c96-0c9886867d12",
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
  "last_heartbeat_at": "2026-10-27T14:40:00.232634Z",
  "last_location_at": "2026-10-27T14:40:00.101912Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4f2fb990-389a-43b3-bd95-779c6db7286c/complete` → **200**

```json
{
  "command_id": "61b0e24e-829c-47dc-9265-3e244b0878b1",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:40:00Z",
  "cash_received": true
}
```

```json
{
  "id": "4f2fb990-389a-43b3-bd95-779c6db7286c",
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "assignment_id": "d817bfb3-e37f-4c3d-b413-aeb583b2c91f",
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
  "arrived_at": "2026-10-27T14:40:00.155384Z",
  "started_at": "2026-10-27T14:40:00.19197Z",
  "completed_at": "2026-10-27T14:40:00.265778Z",
  "needs_review": false
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/b7bda8a9-79d2-4baf-92e1-341fcb841ebe/rating` → **200**

```json
{
  "command_id": "98f591f6-6063-4aea-ab90-2d10ef4253fb",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "score": 5,
  "created_at": "2026-10-27T14:40:00.317835619Z"
}
```

`POST /api/driver/v1/orders/b7bda8a9-79d2-4baf-92e1-341fcb841ebe/rating` → **200**

```json
{
  "command_id": "bd44ce41-c7a5-4556-80fd-52c64239343c",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
  "score": 4,
  "created_at": "2026-10-27T14:40:00.354623931Z"
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
  "session_id": "d042b20a-3b0a-4439-a3e0-c4d28b385436",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI5MDAsImlhdCI6MTc5MzExMjAwMCwianRpIjoiODAwNGY4ODgtYTFhYS00NWUyLWFhZGMtMzhmMDRiNzU5MDY2Iiwic2lkIjoiZDA0MmIyMGEtM2IwYS00NDM5LWEzZTAtYzRkMjhiMzg1NDM2In0.O6dyoFzITIXPDQwlNnSr-Sqqsa0qBnFAyck_EMbZ0SE",
  "access_expires_at": "2026-10-27T14:55:00.718897313Z",
  "refresh_token": "FaXugvjkKVbRBmVlf3ohXiCzrGHQYS4eWDyFCpS4gNk",
  "refresh_expires_at": "2026-10-28T02:40:00.718266963Z",
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
  "session_id": "176fdb84-d605-45c1-8562-e8649e598f23",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI5MDEsImlhdCI6MTc5MzExMjAwMSwianRpIjoiN2Y2NWMxNjktZWExMS00Njc5LWE4MjgtMTQxYjg0NzgyNWRlIiwic2lkIjoiMTc2ZmRiODQtZDYwNS00NWMxLTg1NjItZTg2NDllNTk4ZjIzIn0.vjnDc8x5gsjgXWkFYxU8NXs93TvClHYASgL2l7lJEc0",
  "access_expires_at": "2026-10-27T14:55:01.045923822Z",
  "refresh_token": "ccVLUcmX48jUEI7Ik3GnxQnKLbVieqNmH0rDIHTuQ_U",
  "refresh_expires_at": "2026-10-28T02:40:01.045251774Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b7bda8a9-79d2-4baf-92e1-341fcb841ebe/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
      "author_type": "RIDER",
      "author_id": "a1a01a4f-849b-4014-9abf-f5643fd69f99",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T14:40:00.317836Z"
    },
    {
      "order_id": "b7bda8a9-79d2-4baf-92e1-341fcb841ebe",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a1a01a4f-849b-4014-9abf-f5643fd69f99",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T14:40:00.354624Z"
    }
  ]
}
```

Done: ratings for order b7bda8a9-79d2-4baf-92e1-341fcb841ebe.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679905624",
  "device_ref": "sandbox-31158"
}
```

```json
{
  "challenge_id": "c077da39-0798-402e-87a3-d41a6016bdf5",
  "expires_at": "2026-10-27T14:45:01.134282881Z",
  "resend_available_at": "2026-10-27T14:40:02.134282881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679905624` → **200**

```json
{
  "phone": "+380679905624",
  "audience": "CLIENT",
  "code": "499784",
  "sent_at": "2026-10-27T14:40:01.136561165Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c077da39-0798-402e-87a3-d41a6016bdf5",
  "code": "499784",
  "device_ref": "sandbox-31158"
}
```

```json
{
  "session_id": "90d6a02f-57ed-4fa9-b551-f9e1c24ea97c",
  "subject": {
    "type": "CLIENT",
    "id": "429ebe8e-8452-4e7c-952c-8538951c70c3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MjllYmU4ZS04NDUyLTRlN2MtOTUyYy04NTM4OTUxYzcwYzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEyOTAxLCJpYXQiOjE3OTMxMTIwMDEsImp0aSI6ImYyYjBmNjUyLTFkZjYtNDdiOC1hMDVjLTk5Y2YxODYzOWU1ZCIsInNpZCI6IjkwZDZhMDJmLTU3ZWQtNGZhOS1iNTUxLWY5ZTFjMjRlYTk3YyJ9.MdBjuFsxOUYSWeZS-UanNWt_dfebWL4Ue-MDwSIIwJA",
  "access_expires_at": "2026-10-27T14:55:01.194349867Z",
  "refresh_token": "AUC1gKbdvMMtZoPRdeh3l-j6gDZQfG6UcpcsrkbYmik",
  "refresh_expires_at": "2026-11-26T14:40:01.193687217Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "0fc4344a-d61d-4976-b463-6cf040b2727a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "7f40739b-b07b-4c2e-803d-082ffaef28c8",
  "upload_path": "/api/rider/v1/uploads/7f40739b-b07b-4c2e-803d-082ffaef28c8",
  "expires_at": "2026-10-27T14:55:01.233355676Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/7f40739b-b07b-4c2e-803d-082ffaef28c8` → **200**

```json
{
  "file_id": "7f40739b-b07b-4c2e-803d-082ffaef28c8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "6225d445-dff3-4eb0-a19c-ce937ba61773",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "7f40739b-b07b-4c2e-803d-082ffaef28c8"
  ]
}
```

```json
{
  "id": "7901a421-4c7e-41fd-b443-b11782a25630",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:40:01.311223Z",
  "updated_at": "2026-10-27T14:40:01.311223Z",
  "messages": [
    {
      "id": "541d9c29-9500-4241-9703-ac0f2184fa99",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:40:01.312949Z",
      "attachments": [
        {
          "file_id": "7f40739b-b07b-4c2e-803d-082ffaef28c8",
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
  "session_id": "35b3d190-99c1-4d14-97c6-881cad647b7e",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI5MDEsImlhdCI6MTc5MzExMjAwMSwianRpIjoiOGE4YTkzYmEtNTIwNi00MzlkLWE2NTYtYmQ4MmE0Y2U5MTI4Iiwic2lkIjoiMzViM2QxOTAtOTljMS00ZDE0LTk3YzYtODgxY2FkNjQ3YjdlIn0.DutuYw0ChgEcO6-M2iH5vGMST5ebRWfdDFzudSnGiMU",
  "access_expires_at": "2026-10-27T14:55:01.656991406Z",
  "refresh_token": "8CgNyYGv0fk4kPcqVchrLlZZjurpulaDZ9XvjZ545m0",
  "refresh_expires_at": "2026-10-28T02:40:01.656330564Z",
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
  "session_id": "8b280de2-726c-4cfc-92e5-12601e9a38a9",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI5MDEsImlhdCI6MTc5MzExMjAwMSwianRpIjoiOThlNzI5YjYtMjVjOS00M2MwLWI0MjctOWIwMTM5ZWQ2YTE0Iiwic2lkIjoiOGIyODBkZTItNzI2Yy00Y2ZjLTkyZTUtMTI2MDFlOWEzOGE5In0.J-yvY9jkD7P5HeLAjVqXGk4Zs8bcNReZjX0mPQp134A",
  "access_expires_at": "2026-10-27T14:55:01.981541326Z",
  "refresh_token": "ptSllVmwz6SBmIZXyZJJ65ydsW2TYA3AdI1Yig6CZRk",
  "refresh_expires_at": "2026-10-28T02:40:01.980952665Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/7901a421-4c7e-41fd-b443-b11782a25630/attachments/7f40739b-b07b-4c2e-803d-082ffaef28c8` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "e5d982fe-015d-432a-9ed2-91d823eb9958",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b8e8bc44-14f3-41ca-a3c0-920a333f8b08",
  "upload_path": "/api/operator/v1/uploads/b8e8bc44-14f3-41ca-a3c0-920a333f8b08",
  "expires_at": "2026-10-27T14:55:02.035196625Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b8e8bc44-14f3-41ca-a3c0-920a333f8b08` → **200**

```json
{
  "file_id": "b8e8bc44-14f3-41ca-a3c0-920a333f8b08",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/7901a421-4c7e-41fd-b443-b11782a25630` → **200**

```json
{
  "id": "7901a421-4c7e-41fd-b443-b11782a25630",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:40:01.311223Z",
  "updated_at": "2026-10-27T14:40:01.311223Z",
  "messages": [
    {
      "id": "541d9c29-9500-4241-9703-ac0f2184fa99",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:40:01.312949Z",
      "attachments": [
        {
          "file_id": "7f40739b-b07b-4c2e-803d-082ffaef28c8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/7901a421-4c7e-41fd-b443-b11782a25630/comments` → **200**

```json
{
  "command_id": "cb165e24-35a1-42d4-b915-4d6c28ffebaf",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b8e8bc44-14f3-41ca-a3c0-920a333f8b08"
  ]
}
```

```json
{
  "id": "7901a421-4c7e-41fd-b443-b11782a25630",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:40:01.311223Z",
  "updated_at": "2026-10-27T14:40:02.152346Z",
  "messages": [
    {
      "id": "541d9c29-9500-4241-9703-ac0f2184fa99",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:40:01.312949Z",
      "attachments": [
        {
          "file_id": "7f40739b-b07b-4c2e-803d-082ffaef28c8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "af5ea34b-a504-478f-adb2-93212ae6a9d8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "52b81e9f-553c-42db-9b69-59b7056d2d3a",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:40:02.151997Z",
      "attachments": [
        {
          "file_id": "b8e8bc44-14f3-41ca-a3c0-920a333f8b08",
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

`GET /api/rider/v1/support/cases/7901a421-4c7e-41fd-b443-b11782a25630` → **200**

```json
{
  "id": "7901a421-4c7e-41fd-b443-b11782a25630",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:40:01.311223Z",
  "updated_at": "2026-10-27T14:40:02.152346Z",
  "messages": [
    {
      "id": "541d9c29-9500-4241-9703-ac0f2184fa99",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "429ebe8e-8452-4e7c-952c-8538951c70c3",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:40:01.312949Z",
      "attachments": [
        {
          "file_id": "7f40739b-b07b-4c2e-803d-082ffaef28c8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "af5ea34b-a504-478f-adb2-93212ae6a9d8",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:40:02.151997Z",
      "attachments": [
        {
          "file_id": "b8e8bc44-14f3-41ca-a3c0-920a333f8b08",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/7901a421-4c7e-41fd-b443-b11782a25630/attachments/b8e8bc44-14f3-41ca-a3c0-920a333f8b08` → **200**

Done: support case 7901a421-4c7e-41fd-b443-b11782a25630, rider attachment 7f40739b-b07b-4c2e-803d-082ffaef28c8, operator attachment b8e8bc44-14f3-41ca-a3c0-920a333f8b08.

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
  "session_id": "a1f0bc46-ddd1-49f7-af3d-dea77f521d2a",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI5MDIsImlhdCI6MTc5MzExMjAwMiwianRpIjoiZDVhMGZkNDMtMDM5Ni00YTZjLWE2NTctNzliMGFjM2JjNjVmIiwic2lkIjoiYTFmMGJjNDYtZGRkMS00OWY3LWFmM2QtZGVhNzdmNTIxZDJhIn0.d7r01jmPZdVKy0g-4U0HO0tySLnKI5RZsG70rrgXjVM",
  "access_expires_at": "2026-10-27T14:55:02.546148896Z",
  "refresh_token": "sgbbvIwd51ooSAuGMdZurCVDCzJMT-58ifrEEcD8zvc",
  "refresh_expires_at": "2026-10-28T02:40:02.54556328Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-23093"
}
```

```json
{
  "challenge_id": "f74c248d-9f41-4288-a1b6-8db7b04f75f3",
  "expires_at": "2026-10-27T14:45:02.575003144Z",
  "resend_available_at": "2026-10-27T14:40:03.575003144Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "895683",
  "sent_at": "2026-10-27T14:40:02.577256825Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f74c248d-9f41-4288-a1b6-8db7b04f75f3",
  "code": "895683",
  "device_ref": "sandbox-23093"
}
```

```json
{
  "session_id": "e22a2657-bf41-4d2f-b7c6-d2cb3d6ab625",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjkwMiwiaWF0IjoxNzkzMTEyMDAyLCJqdGkiOiI0MTYzOWRhMi02OTFiLTRhMmYtODAzYy1lZjVjMjNkNjdmYzEiLCJzaWQiOiJlMjJhMjY1Ny1iZjQxLTRkMmYtYjdjNi1kMmNiM2Q2YWI2MjUifQ.S30zGl-HAX9IM15z9JAYv_nn4dfvhzy11O_NYKYAd8E",
  "access_expires_at": "2026-10-27T14:55:02.63881879Z",
  "refresh_token": "rmtCEuo_-TvZUHWg29VPypwD10x7jd3HR9iaawiuATY",
  "refresh_expires_at": "2026-11-26T14:40:02.638162191Z",
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
  "command_id": "79ca61e2-ce4b-4179-a80a-b0eda785f9ae",
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
  "device_ref": "sandbox-13159"
}
```

```json
{
  "challenge_id": "ee78f825-2dc8-452d-a12e-a599cb381ac5",
  "expires_at": "2026-10-27T14:45:02.780915702Z",
  "resend_available_at": "2026-10-27T14:40:03.780915702Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "220066",
  "sent_at": "2026-10-27T14:40:02.783221909Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee78f825-2dc8-452d-a12e-a599cb381ac5",
  "code": "220066",
  "device_ref": "sandbox-13159"
}
```

```json
{
  "session_id": "ec8bb582-5353-4d88-88c8-7b5b1bddb927",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMjkwMiwiaWF0IjoxNzkzMTEyMDAyLCJqdGkiOiI3YmNmZjU4Zi01ZjJmLTRmN2QtOTRlNi1hMzI1ZjcxYjM2NjkiLCJzaWQiOiJlYzhiYjU4Mi01MzUzLTRkODgtODhjOC03YjViMWJkZGI5MjcifQ.hWCZLdRD3pLhtcd2oC8f_pe6JRUA1u0XKLDplIzL_Z0",
  "access_expires_at": "2026-10-27T14:55:02.841572272Z",
  "refresh_token": "EUHHyqrxmTea4yssKnIRVSBgkGz-y7JgVpzQkzmiFss",
  "refresh_expires_at": "2026-11-26T14:40:02.840998388Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df704788-362c-47fd-8c96-0c9886867d12",
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
  "last_heartbeat_at": "2026-10-27T14:40:00.232634Z",
  "last_location_at": "2026-10-27T14:40:00.101912Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df704788-362c-47fd-8c96-0c9886867d12/handover` → **200**

```json
{
  "command_id": "019b68c8-b71e-44df-ae12-0589c801474f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df704788-362c-47fd-8c96-0c9886867d12",
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
  "last_heartbeat_at": "2026-10-27T14:40:00.232634Z",
  "last_location_at": "2026-10-27T14:40:00.101912Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/df704788-362c-47fd-8c96-0c9886867d12/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:40:02Z",
    "sequence": 1793112002930
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "df704788-362c-47fd-8c96-0c9886867d12",
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
  "last_heartbeat_at": "2026-10-27T14:40:02.945901Z",
  "last_location_at": "2026-10-27T14:40:02.945901Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:44.893397Z",
  "last_location_at": "2026-10-27T14:39:44.893397Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/35f633cf-3c1d-4fc9-b85f-10a840ee2014/handover` → **200**

```json
{
  "command_id": "69dcce03-20e5-4ef8-81c4-261ca6920f19",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:39:44.893397Z",
  "last_location_at": "2026-10-27T14:39:44.893397Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/35f633cf-3c1d-4fc9-b85f-10a840ee2014/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:40:03Z",
    "sequence": 1793112003328
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:40:03.048665Z",
  "last_location_at": "2026-10-27T14:40:03.048665Z",
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
  "session_id": "ef41448d-cd97-41f5-9366-55f374fa03f1",
  "subject": {
    "type": "STAFF",
    "id": "52b81e9f-553c-42db-9b69-59b7056d2d3a"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmI4MWU5Zi01NTNjLTQyZGItOWI2OS01OWI3MDU2ZDJkM2EiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTI5MDMsImlhdCI6MTc5MzExMjAwMywianRpIjoiMDdlNTYzNWUtOTMwMy00MDMzLTkxNWEtNzllYzA1YWFmODliIiwic2lkIjoiZWY0MTQ0OGQtY2Q5Ny00MWY1LTkzNjYtNTVmMzc0ZmEwM2YxIn0.JaidbXCR6DmruaO870a1J9BN3LFYRHfMWwWrasFqw3s",
  "access_expires_at": "2026-10-27T14:55:03.372231192Z",
  "refresh_token": "uNaI3WOf72NL82h9Q-AxU7ZOoiFyGBOhevnYgkBu2-4",
  "refresh_expires_at": "2026-10-28T02:40:03.371663099Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f3ca09eb-5212-49a4-b968-be649ef44830",
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
  "id": "22a0d67a-33a3-4614-bde0-12f8172e4985",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:45:03.407097Z",
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
  "command_id": "ae15bcf5-bc24-48aa-b17f-f992ca8e5a0c",
  "quote_id": "22a0d67a-33a3-4614-bde0-12f8172e4985",
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
  "id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
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
  "created_at": "2026-10-27T14:40:03.444394Z",
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
    "id": "ca78e073-5dff-44e5-a230-b2227d69fe00",
    "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
    "expires_at": "2026-10-27T14:40:18.448287Z",
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

`POST /api/driver/v1/offers/ca78e073-5dff-44e5-a230-b2227d69fe00/accept` → **200**

```json
{
  "command_id": "8c08bf53-0bd8-42dc-81d7-fdc84938c8c9"
}
```

```json
{
  "id": "0cb8fa97-9e7c-41b9-8126-23c6e5f86fda",
  "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ecdfcde-d006-405d-92c5-6a58ffdb7764",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ecdfcde-d006-405d-92c5-6a58ffdb7764",
  "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
  "assignment_id": "0cb8fa97-9e7c-41b9-8126-23c6e5f86fda",
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

`POST /api/driver/v1/work-sessions/35f633cf-3c1d-4fc9-b85f-10a840ee2014/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:40:03Z",
    "sequence": 1793112003584
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "35f633cf-3c1d-4fc9-b85f-10a840ee2014",
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
  "last_heartbeat_at": "2026-10-27T14:40:03.600122Z",
  "last_location_at": "2026-10-27T14:40:03.600122Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3ecdfcde-d006-405d-92c5-6a58ffdb7764/arrive` → **200**

```json
{
  "command_id": "9df178de-158a-4f11-90f7-54bdf9ffe79e",
  "expected_version": 0
}
```

```json
{
  "id": "3ecdfcde-d006-405d-92c5-6a58ffdb7764",
  "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
  "assignment_id": "0cb8fa97-9e7c-41b9-8126-23c6e5f86fda",
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
  "arrived_at": "2026-10-27T14:40:03.638Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3ecdfcde-d006-405d-92c5-6a58ffdb7764/start` → **200**

```json
{
  "command_id": "4aac131a-9123-499c-89c9-7286428b6820",
  "expected_version": 1
}
```

```json
{
  "id": "3ecdfcde-d006-405d-92c5-6a58ffdb7764",
  "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
  "assignment_id": "0cb8fa97-9e7c-41b9-8126-23c6e5f86fda",
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
  "arrived_at": "2026-10-27T14:40:03.638Z",
  "started_at": "2026-10-27T14:40:03.678717Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/3ecdfcde-d006-405d-92c5-6a58ffdb7764/complete` → **200**

```json
{
  "command_id": "87835288-0c32-436f-bd80-10590d429636",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:40:03Z",
  "cash_received": true
}
```

```json
{
  "id": "3ecdfcde-d006-405d-92c5-6a58ffdb7764",
  "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
  "assignment_id": "0cb8fa97-9e7c-41b9-8126-23c6e5f86fda",
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
  "arrived_at": "2026-10-27T14:40:03.638Z",
  "started_at": "2026-10-27T14:40:03.678717Z",
  "completed_at": "2026-10-27T14:40:03.724003Z",
  "needs_review": false
}
```

`GET /api/operator/v1/orders/2de4254d-ce99-4d20-acd0-1c01eeab938f` → **200**

```json
{
  "id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
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
    "id": "0cb8fa97-9e7c-41b9-8126-23c6e5f86fda",
    "order_id": "2de4254d-ce99-4d20-acd0-1c01eeab938f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "3ecdfcde-d006-405d-92c5-6a58ffdb7764",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:40:03.444394Z",
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

Done: terminal order 2de4254d-ce99-4d20-acd0-1c01eeab938f by Andrii (5a000000-0000-4000-8000-000000000403).
