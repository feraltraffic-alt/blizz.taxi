# Sandbox transcript (2026-10-27T14:41:41Z, 3c8de89)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633257733",
  "device_ref": "sandbox-7068"
}
```

```json
{
  "challenge_id": "7b8d555c-7923-443c-869d-eef9a931636e",
  "expires_at": "2026-10-27T14:46:41.561630577Z",
  "resend_available_at": "2026-10-27T14:41:42.561630577Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633257733` → **200**

```json
{
  "phone": "+380633257733",
  "audience": "CLIENT",
  "code": "544527",
  "sent_at": "2026-10-27T14:41:41.588088497Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b8d555c-7923-443c-869d-eef9a931636e",
  "code": "544527",
  "device_ref": "sandbox-7068"
}
```

```json
{
  "session_id": "82ac0ea3-d427-4725-b0bc-8a723ec299c5",
  "subject": {
    "type": "CLIENT",
    "id": "173304c5-cf7b-4a3f-b19b-058f050da7df"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzMzMDRjNS1jZjdiLTRhM2YtYjE5Yi0wNThmMDUwZGE3ZGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDAxLCJpYXQiOjE3OTMxMTIxMDEsImp0aSI6ImQ3MWZjOTA2LTg1ODYtNDdmNS1hOTNmLWUxZDU1YjI5MzFjMCIsInNpZCI6IjgyYWMwZWEzLWQ0MjctNDcyNS1iMGJjLThhNzIzZWMyOTljNSJ9.GCAMVktmvINbHyIresAQMmdLOPp3VOqwv7LUu7XaBnA",
  "access_expires_at": "2026-10-27T14:56:41.692615937Z",
  "refresh_token": "gbgtnWJY3NpN4PQ3btGqDVujVV3D0NL8ZKcYPGdiSG4",
  "refresh_expires_at": "2026-11-26T14:41:41.689847752Z",
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
  "device_ref": "sandbox-13844"
}
```

```json
{
  "challenge_id": "5a6bec42-1c38-475a-9c93-ffa7be4ae779",
  "expires_at": "2026-10-27T14:46:41.874118037Z",
  "resend_available_at": "2026-10-27T14:41:42.874118037Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "738879",
  "sent_at": "2026-10-27T14:41:41.936891613Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a6bec42-1c38-475a-9c93-ffa7be4ae779",
  "code": "738879",
  "device_ref": "sandbox-13844"
}
```

```json
{
  "session_id": "ef754b4c-ff53-4188-b2f4-40afd476581c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAwMiwiaWF0IjoxNzkzMTEyMTAyLCJqdGkiOiIyNDI1ZmIwOC01NGJhLTQwZjMtOGM3Mi1iZDk5MjViZWFjMTUiLCJzaWQiOiJlZjc1NGI0Yy1mZjUzLTQxODgtYjJmNC00MGFmZDQ3NjU4MWMifQ.aPGJS4unaioZ1XDYjbOY8eIy80Ev5IagwJp4-Voxs28",
  "access_expires_at": "2026-10-27T14:56:42.069797096Z",
  "refresh_token": "ZxUEXhzVGr6kr-m2QdXbT50Jv94SKzaET5GYOdXnU-E",
  "refresh_expires_at": "2026-11-26T14:41:42.068041094Z",
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
  "correlation_id": "2356c35b-9df2-428f-8bb2-ae4a88932ec3"
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
  "session_id": "2ef57292-e48e-427e-9934-3bed97f9be8d",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMDIsImlhdCI6MTc5MzExMjEwMiwianRpIjoiNTQ4ZmYyOTgtMzNmYy00OTlkLWI0NTgtZGRlMzMwMmVhYjQ5Iiwic2lkIjoiMmVmNTcyOTItZTQ4ZS00MjdlLTk5MzQtM2JlZDk3ZjliZThkIn0.Kjqspdt2gbbhk5_qi7pG2WVMfZGV3L82zP7m0cVddTw",
  "access_expires_at": "2026-10-27T14:56:42.682620331Z",
  "refresh_token": "O3m0nP5Lajkc4H2TmlIDVyIQ3O4VBhWUofWDfHMVI8I",
  "refresh_expires_at": "2026-10-28T02:41:42.681616983Z",
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
  "session_id": "77887959-bd3e-40f4-aef9-d6c0f3f476a8",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMDMsImlhdCI6MTc5MzExMjEwMywianRpIjoiNTI1ZjIwMjktNjgwNi00YzhkLTliZmQtZWQ0ZWVkZGYyOWEwIiwic2lkIjoiNzc4ODc5NTktYmQzZS00MGY0LWFlZjktZDZjMGYzZjQ3NmE4In0.msLqquYaFufi9ZJJUmlIktwKDQvrxulr_L0qXNvymTI",
  "access_expires_at": "2026-10-27T14:56:43.669660774Z",
  "refresh_token": "yPzS2z-PNcnOQaclbJVgXUfaAFPW07uP6Oe3aXTKdhM",
  "refresh_expires_at": "2026-10-28T02:41:43.668515547Z",
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
  "session_id": "ce0f2d34-0a4d-4428-9ec5-3433ad137f25",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMDMsImlhdCI6MTc5MzExMjEwMywianRpIjoiODhlMDk0NmEtZmQ4Ny00NzFmLTlmZTEtN2FkYTY2MDJjMjRlIiwic2lkIjoiY2UwZjJkMzQtMGE0ZC00NDI4LTllYzUtMzQzM2FkMTM3ZjI1In0.QMllIhw44Vu9dawO-nLWzIeAHHAMRJmTlFUGSjQ-vbI",
  "access_expires_at": "2026-10-27T14:56:43.931119118Z",
  "refresh_token": "oJWkR7-_JJUKwWPY_aqLWEG4FfF0fK3W2lkgAGEDxQI",
  "refresh_expires_at": "2026-10-28T02:41:43.929997747Z",
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
  "command_id": "a5c619fe-6a9a-4a18-b383-b1bdc0c94409",
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
  "id": "1d574102-a88a-40a0-8563-9be72226cd31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:46:44.113210Z",
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
  "command_id": "91e16599-2d05-4fe5-a6b1-ea6d8ef6a51b",
  "quote_id": "1d574102-a88a-40a0-8563-9be72226cd31",
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
  "id": "488d32e0-6b8c-4d5a-9920-582fb0a8eb15",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "173304c5-cf7b-4a3f-b19b-058f050da7df",
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
  "created_at": "2026-10-27T14:41:44.19374Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/488d32e0-6b8c-4d5a-9920-582fb0a8eb15` → **200**

```json
{
  "id": "488d32e0-6b8c-4d5a-9920-582fb0a8eb15",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "173304c5-cf7b-4a3f-b19b-058f050da7df",
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
  "created_at": "2026-10-27T14:41:44.19374Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/488d32e0-6b8c-4d5a-9920-582fb0a8eb15/cancel` → **200**

```json
{
  "command_id": "292ae21a-a68f-4e39-a8b6-870c19a2fd1d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "488d32e0-6b8c-4d5a-9920-582fb0a8eb15",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "173304c5-cf7b-4a3f-b19b-058f050da7df",
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
  "created_at": "2026-10-27T14:41:44.19374Z",
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
  "command_id": "9c9945a2-3c6f-4ed3-8b2c-964b52223dd2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:44Z",
    "sequence": 1793112104357
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10741a32-bc6a-4158-b5c0-34e3d75f9fdc",
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
  "last_heartbeat_at": "2026-10-27T14:41:44.409741Z",
  "last_location_at": "2026-10-27T14:41:44.409741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10279"
}
```

```json
{
  "challenge_id": "2f56408a-6f12-4b84-99ee-e950ce17adff",
  "expires_at": "2026-10-27T14:46:44.452074892Z",
  "resend_available_at": "2026-10-27T14:41:45.452074892Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "957982",
  "sent_at": "2026-10-27T14:41:44.456785994Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f56408a-6f12-4b84-99ee-e950ce17adff",
  "code": "957982",
  "device_ref": "sandbox-10279"
}
```

```json
{
  "session_id": "15ae24ea-878d-4233-a7ed-ffa65213efef",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAwNCwiaWF0IjoxNzkzMTEyMTA0LCJqdGkiOiI4ZDdmMGUzZS0wNDlkLTQxMzQtYjE1Mi04MDZkMGYzOGZmMDIiLCJzaWQiOiIxNWFlMjRlYS04NzhkLTQyMzMtYTdlZC1mZmE2NTIxM2VmZWYifQ.Rdep9e262CSNw1OUJKx6tgctjyNQW-icMIagBWD-IPo",
  "access_expires_at": "2026-10-27T14:56:44.506752831Z",
  "refresh_token": "RrJS9VecNdXAGAE7FVj2EqUxK9H-n3b10v7ZF8z2tUs",
  "refresh_expires_at": "2026-11-26T14:41:44.505287811Z",
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
  "command_id": "7dba58d2-0190-4709-802d-c5e0d270bba7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:44Z",
    "sequence": 1793112104553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:44.571869Z",
  "last_location_at": "2026-10-27T14:41:44.571869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7dbbfa03-dff1-4954-bb44-731a2684b684",
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
  "id": "907f12e0-134b-4574-82d3-8b9c7c9c06ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:46:44.613391Z",
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
  "command_id": "a2f81004-3a78-4cc9-ae80-1807961374fc",
  "quote_id": "907f12e0-134b-4574-82d3-8b9c7c9c06ac",
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
  "id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "173304c5-cf7b-4a3f-b19b-058f050da7df",
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
  "created_at": "2026-10-27T14:41:44.646969Z",
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
    "id": "2642d77c-4801-4e67-bfca-1ff2d1242de9",
    "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
    "expires_at": "2026-10-27T14:41:59.651661Z",
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

`POST /api/driver/v1/offers/2642d77c-4801-4e67-bfca-1ff2d1242de9/accept` → **200**

```json
{
  "command_id": "43408bb6-71e9-4108-b492-2befacb3290e"
}
```

```json
{
  "id": "d7a9c64e-f894-4b36-8d8e-2edd43337049",
  "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5b0c17c4-5714-42a4-83f7-f2037772ac5b",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5b0c17c4-5714-42a4-83f7-f2037772ac5b",
  "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "assignment_id": "d7a9c64e-f894-4b36-8d8e-2edd43337049",
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

`POST /api/driver/v1/trips/5b0c17c4-5714-42a4-83f7-f2037772ac5b/cancel` → **200**

```json
{
  "command_id": "1014ec4e-b810-4091-8255-339c74675b1b",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "5b0c17c4-5714-42a4-83f7-f2037772ac5b",
  "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "assignment_id": "d7a9c64e-f894-4b36-8d8e-2edd43337049",
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

`GET /api/rider/v1/orders/1986a525-cb4e-4b57-a1c1-38e35de12165` → **200**

```json
{
  "id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "173304c5-cf7b-4a3f-b19b-058f050da7df",
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
    "id": "d7a9c64e-f894-4b36-8d8e-2edd43337049",
    "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5b0c17c4-5714-42a4-83f7-f2037772ac5b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T14:41:44.646969Z",
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
    "id": "6c7f5419-d639-4a9c-99c2-2d3b082a5429",
    "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
    "expires_at": "2026-10-27T14:41:59.802817Z",
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

`POST /api/driver/v1/offers/6c7f5419-d639-4a9c-99c2-2d3b082a5429/accept` → **200**

```json
{
  "command_id": "fe823efe-10d2-4acd-9cec-0b53d2ca3f68"
}
```

```json
{
  "id": "becca7ee-d912-45b3-b577-daa7d912209d",
  "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3eb5cc4e-5646-45a7-9b11-d28db8da5149",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3eb5cc4e-5646-45a7-9b11-d28db8da5149",
  "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "assignment_id": "becca7ee-d912-45b3-b577-daa7d912209d",
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

`POST /api/driver/v1/trips/3eb5cc4e-5646-45a7-9b11-d28db8da5149/cancel` → **200**

```json
{
  "command_id": "b5e1de78-6c3a-46fb-b90b-376534971773",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3eb5cc4e-5646-45a7-9b11-d28db8da5149",
  "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
  "assignment_id": "becca7ee-d912-45b3-b577-daa7d912209d",
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
    "id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:41:44.646969Z",
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
    "id": "488d32e0-6b8c-4d5a-9920-582fb0a8eb15",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:41:44.19374Z",
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

`GET /api/operator/v1/orders/1986a525-cb4e-4b57-a1c1-38e35de12165/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:41:44.647793Z",
      "actor": {
        "type": "CLIENT",
        "id": "173304c5-cf7b-4a3f-b19b-058f050da7df",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
        "quote_id": "907f12e0-134b-4574-82d3-8b9c7c9c06ac",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:41:44.650371Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
        "attempt_id": "f985f913-cad7-4b2f-b16b-afa1cca3a65b",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:41:44.657407Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "2642d77c-4801-4e67-bfca-1ff2d1242de9",
        "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:41:44.724315Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "2642d77c-4801-4e67-bfca-1ff2d1242de9",
        "order_id": "1986a525-cb4e-4b57-a1c1-38e35de12165",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d7a9c64e-f894-4b36-8d8e-2edd43337049"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 488d32e0-6b8c-4d5a-9920-582fb0a8eb15, 1986a525-cb4e-4b57-a1c1-38e35de12165.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738275361",
  "device_ref": "sandbox-13235"
}
```

```json
{
  "challenge_id": "82fdc4e0-a071-4d4b-b8ae-de4e0ab8b246",
  "expires_at": "2026-10-27T14:46:45.04178252Z",
  "resend_available_at": "2026-10-27T14:41:46.04178252Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738275361` → **200**

```json
{
  "phone": "+380738275361",
  "audience": "CLIENT",
  "code": "546745",
  "sent_at": "2026-10-27T14:41:45.045038846Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82fdc4e0-a071-4d4b-b8ae-de4e0ab8b246",
  "code": "546745",
  "device_ref": "sandbox-13235"
}
```

```json
{
  "session_id": "a7e7c6bd-220f-4a2f-926d-5e6521976be6",
  "subject": {
    "type": "CLIENT",
    "id": "467a3395-ab21-449d-b3cd-82fa00536c71"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NjdhMzM5NS1hYjIxLTQ0OWQtYjNjZC04MmZhMDA1MzZjNzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDA1LCJpYXQiOjE3OTMxMTIxMDUsImp0aSI6IjhhODQwNjkxLWIxY2MtNGI5MC1hYTVhLTc3YzMyOTdmYmQyZSIsInNpZCI6ImE3ZTdjNmJkLTIyMGYtNGEyZi05MjZkLTVlNjUyMTk3NmJlNiJ9.xlG8b7_Qgmisw1LCe8woiDvc6i2IGxe8pYj4JGk7l-4",
  "access_expires_at": "2026-10-27T14:56:45.092755511Z",
  "refresh_token": "uW2zpMEnpDLMDLTjqEXDNrMWNmdezOxOVemAAwEnXog",
  "refresh_expires_at": "2026-11-26T14:41:45.091940109Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c87ebb4a-c7eb-4013-9dea-5d4504bbc02c",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "36bcb411-ccb3-41be-ab81-0e7dfb1f4dcc",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-36bcb411-ccb3-41be-ab81-0e7dfb1f4dcc",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4806c467f94c6cc6d17a776ae59d1208",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=36bcb411-ccb3-41be-ab81-0e7dfb1f4dcc",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738275361"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=36bcb411-ccb3-41be-ab81-0e7dfb1f4dcc",
  "expires_at": "2026-10-27T15:11:45.125886Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/36bcb411-ccb3-41be-ab81-0e7dfb1f4dcc` → **200**

```json
{
  "id": "36bcb411-ccb3-41be-ab81-0e7dfb1f4dcc",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:11:45.125886Z",
  "card": {
    "id": "dc579457-81fc-41ed-8a91-9cdae7190565",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2539",
    "card_type": "Visa",
    "created_at": "2026-10-27T14:41:45.166648Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "dc579457-81fc-41ed-8a91-9cdae7190565",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2539",
      "card_type": "Visa",
      "created_at": "2026-10-27T14:41:45.166648Z"
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
  "device_ref": "sandbox-10307"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "d4664c0f-a63c-46e5-a925-7470bc2e593e",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-10307"
}
```

```json
{
  "challenge_id": "334031a7-ba2e-4e92-acef-92d2d1216b3e",
  "expires_at": "2026-10-27T14:46:46.27972181Z",
  "resend_available_at": "2026-10-27T14:41:47.27972181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "252046",
  "sent_at": "2026-10-27T14:41:46.282567014Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "334031a7-ba2e-4e92-acef-92d2d1216b3e",
  "code": "252046",
  "device_ref": "sandbox-10307"
}
```

```json
{
  "session_id": "3f0f618a-ad1f-4958-9dc3-add7c5146dff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAwNiwiaWF0IjoxNzkzMTEyMTA2LCJqdGkiOiJiMDVmNThiNi01NzkyLTQ3ZWQtYTQ0Ny05MzkwMDE1NzZlMDQiLCJzaWQiOiIzZjBmNjE4YS1hZDFmLTQ5NTgtOWRjMy1hZGQ3YzUxNDZkZmYifQ.IipsspLQcMOUtUT6s3b4ERQEBEl2h4WMIFixG8OqseE",
  "access_expires_at": "2026-10-27T14:56:46.329643019Z",
  "refresh_token": "yHMK0z70CgVd7ocR6J-pYlnM8mn8yYHjB8OQGXdD_6Y",
  "refresh_expires_at": "2026-11-26T14:41:46.328878724Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:44.571869Z",
  "last_location_at": "2026-10-27T14:41:44.571869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/abb813bc-494e-466c-84bf-6f53842a4a1e/handover` → **200**

```json
{
  "command_id": "2a30cb8d-5e4b-40b5-9be0-4ea8dde6feba",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:44.571869Z",
  "last_location_at": "2026-10-27T14:41:44.571869Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/abb813bc-494e-466c-84bf-6f53842a4a1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:46Z",
    "sequence": 1793112106423
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:46.441764Z",
  "last_location_at": "2026-10-27T14:41:46.441764Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "21c80af9-02fd-4e59-b263-3767c2e6995e",
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
  "id": "54b2b3a4-3170-4ecb-a9c3-e84b67f447a4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T14:46:46.477574Z",
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
  "command_id": "74c3682c-d5ea-4cc7-8157-bb448db4dd6a",
  "quote_id": "54b2b3a4-3170-4ecb-a9c3-e84b67f447a4",
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
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
  "created_at": "2026-10-27T14:41:46.511178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/65eec114-6506-4d13-bf0a-a32d3079ff55` → **200**

```json
{
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
  "created_at": "2026-10-27T14:41:46.511178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/65eec114-6506-4d13-bf0a-a32d3079ff55` → **200**

```json
{
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
  "created_at": "2026-10-27T14:41:46.511178Z",
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
    "id": "1ccb4ebe-895c-4611-96de-1ef89183a77d",
    "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
    "expires_at": "2026-10-27T14:42:01.664907Z",
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

`POST /api/driver/v1/offers/1ccb4ebe-895c-4611-96de-1ef89183a77d/accept` → **200**

```json
{
  "command_id": "7defc535-b3ef-481e-85fa-1e0a86532b28"
}
```

```json
{
  "id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
  "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
  "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "assignment_id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
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

`POST /api/driver/v1/work-sessions/abb813bc-494e-466c-84bf-6f53842a4a1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:47Z",
    "sequence": 1793112107667
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:47.683154Z",
  "last_location_at": "2026-10-27T14:41:47.683154Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c3c5f016-1fa2-499a-b2a8-8e032258db86/arrive` → **200**

```json
{
  "command_id": "f65dbf28-3a9c-419f-a343-f0df5fbc183b",
  "expected_version": 0
}
```

```json
{
  "id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
  "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "assignment_id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
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
  "arrived_at": "2026-10-27T14:41:47.723235Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/c3c5f016-1fa2-499a-b2a8-8e032258db86/start` → **200**

```json
{
  "command_id": "0ebcce42-d585-44cf-a937-13d67aa78cb9",
  "expected_version": 1
}
```

```json
{
  "id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
  "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "assignment_id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
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
  "arrived_at": "2026-10-27T14:41:47.723235Z",
  "started_at": "2026-10-27T14:41:47.774655Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/c3c5f016-1fa2-499a-b2a8-8e032258db86/complete` → **200**

```json
{
  "command_id": "1ac195d6-327a-4657-bdc3-805c1897bd02",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:41:47Z"
}
```

```json
{
  "id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
  "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "assignment_id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
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
  "arrived_at": "2026-10-27T14:41:47.723235Z",
  "started_at": "2026-10-27T14:41:47.774655Z",
  "completed_at": "2026-10-27T14:41:47.818957Z",
  "needs_review": false
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/65eec114-6506-4d13-bf0a-a32d3079ff55` → **200**

```json
{
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
    "id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
    "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:41:46.511178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/65eec114-6506-4d13-bf0a-a32d3079ff55` → **200**

```json
{
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
    "id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
    "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:41:46.511178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/65eec114-6506-4d13-bf0a-a32d3079ff55` → **200**

```json
{
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
    "id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
    "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:41:46.511178Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/65eec114-6506-4d13-bf0a-a32d3079ff55` → **200**

```json
{
  "id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "467a3395-ab21-449d-b3cd-82fa00536c71",
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
    "id": "5761ddd5-30ce-48e3-8348-08d6c368947b",
    "order_id": "65eec114-6506-4d13-bf0a-a32d3079ff55",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c3c5f016-1fa2-499a-b2a8-8e032258db86",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:41:46.511178Z",
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

Done: card order 65eec114-6506-4d13-bf0a-a32d3079ff55.

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
  "device_ref": "sandbox-4572"
}
```

```json
{
  "challenge_id": "45e829f7-56c0-403a-bd0c-e026cce1ca55",
  "expires_at": "2026-10-27T14:46:51.014886271Z",
  "resend_available_at": "2026-10-27T14:41:52.014886271Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "625118",
  "sent_at": "2026-10-27T14:41:51.017595808Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "45e829f7-56c0-403a-bd0c-e026cce1ca55",
  "code": "625118",
  "device_ref": "sandbox-4572"
}
```

```json
{
  "session_id": "84084fff-1e10-46a3-a60a-2389e997342d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAxMSwiaWF0IjoxNzkzMTEyMTExLCJqdGkiOiIzYjZiMDQ1Yy03YWQwLTRhZDctYmQyMy00Njk1MDVmMmJkMzkiLCJzaWQiOiI4NDA4NGZmZi0xZTEwLTQ2YTMtYTYwYS0yMzg5ZTk5NzM0MmQifQ.yv3QX8S_fCcDKCwxJFD_UpzDm7kNDKKEOX1w_TR_ORA",
  "access_expires_at": "2026-10-27T14:56:51.066423108Z",
  "refresh_token": "A919sKxhYRzR8ZrBgV08g7sQK1a4Wi6478B8YfHpFJQ",
  "refresh_expires_at": "2026-11-26T14:41:51.065897857Z",
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
  "command_id": "181fc077-12a7-492b-a53d-44122d47c474",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:51Z",
    "sequence": 1793112111109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:51.123734Z",
  "last_location_at": "2026-10-27T14:41:51.123734Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672870967",
  "device_ref": "sandbox-4599"
}
```

```json
{
  "challenge_id": "d2642c82-f4c8-48d8-a2a7-2f7312d4e0b5",
  "expires_at": "2026-10-27T14:46:51.153202551Z",
  "resend_available_at": "2026-10-27T14:41:52.153202551Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672870967` → **200**

```json
{
  "phone": "+380672870967",
  "audience": "CLIENT",
  "code": "030123",
  "sent_at": "2026-10-27T14:41:51.156575738Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2642c82-f4c8-48d8-a2a7-2f7312d4e0b5",
  "code": "030123",
  "device_ref": "sandbox-4599"
}
```

```json
{
  "session_id": "b3d36bb3-8851-40b0-9cdf-c6218fd1188b",
  "subject": {
    "type": "CLIENT",
    "id": "5da8c443-458a-419a-9eb7-84bf7d25a9b5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGE4YzQ0My00NThhLTQxOWEtOWViNy04NGJmN2QyNWE5YjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDExLCJpYXQiOjE3OTMxMTIxMTEsImp0aSI6ImJmNjMyY2JmLWYxM2QtNDY1ZC1iNmZkLTUzZmE0NzcxNDg5OCIsInNpZCI6ImIzZDM2YmIzLTg4NTEtNDBiMC05Y2RmLWM2MjE4ZmQxMTg4YiJ9.WXsadv8lmyy5NDBCZ8YFEgcKkLEU-bgVmTKse_OSPsg",
  "access_expires_at": "2026-10-27T14:56:51.205048939Z",
  "refresh_token": "jrUGH-XTEIlfk86HwnX7Lr1MpFlFvOzNa0aRBEvS0_I",
  "refresh_expires_at": "2026-11-26T14:41:51.204340174Z",
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
  "command_id": "63967a37-bf7e-49b6-a56a-03143a80e61a",
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
  "id": "242b4b00-60e9-43da-a455-6c01ad2a666b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:46:51.264231Z",
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
  "command_id": "092aa92f-bfe5-40c7-93f7-eefe521dbdbb",
  "quote_id": "242b4b00-60e9-43da-a455-6c01ad2a666b",
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
  "id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5da8c443-458a-419a-9eb7-84bf7d25a9b5",
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
  "created_at": "2026-10-27T14:41:51.301692Z",
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
    "id": "021c4bf1-32e4-46af-8e97-c39c2ea3ecd5",
    "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
    "expires_at": "2026-10-27T14:42:06.306486Z",
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

`POST /api/driver/v1/offers/021c4bf1-32e4-46af-8e97-c39c2ea3ecd5/accept` → **200**

```json
{
  "command_id": "d41bdd89-557f-4149-8a05-388133490acf"
}
```

```json
{
  "id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/03b3e02e-ffad-466f-b51f-01330b556a08/messages` → **201**

```json
{
  "command_id": "0d4bd16c-82a9-4c82-8d06-0e39e0c58188",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "695e839c-a163-44ba-83ab-9d5af8f2341c",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:41:51.409985262Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "assignment_id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
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

`POST /api/driver/v1/trips/b6b62790-4cf3-4957-93c3-39296513c5fa/messages` → **201**

```json
{
  "command_id": "1be4756e-f454-4d68-9e77-7baa7b3a573a",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "76a10774-c0f2-48c2-b2a0-f5266da3cc93",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:41:51.463204029Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/03b3e02e-ffad-466f-b51f-01330b556a08/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/b6b62790-4cf3-4957-93c3-39296513c5fa/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672870967"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:51Z",
    "sequence": 1793112111528
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:51.544282Z",
  "last_location_at": "2026-10-27T14:41:51.544282Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "assignment_id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
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

`POST /api/driver/v1/trips/b6b62790-4cf3-4957-93c3-39296513c5fa/arrive` → **200**

```json
{
  "command_id": "995243be-7fea-4407-b3c4-108cad9de250",
  "expected_version": 0
}
```

```json
{
  "id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "assignment_id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
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
  "arrived_at": "2026-10-27T14:41:51.590774Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b6b62790-4cf3-4957-93c3-39296513c5fa/start` → **200**

```json
{
  "command_id": "6a9f47a2-f8ac-410b-8d2a-2eb59b7d5382",
  "expected_version": 1
}
```

```json
{
  "id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "assignment_id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
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
  "arrived_at": "2026-10-27T14:41:51.590774Z",
  "started_at": "2026-10-27T14:41:51.621526Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:51Z",
    "sequence": 1793112111642
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:51.658528Z",
  "last_location_at": "2026-10-27T14:41:51.658528Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/b6b62790-4cf3-4957-93c3-39296513c5fa/complete` → **200**

```json
{
  "command_id": "91404371-1194-4ff6-b59b-616b56b3aa51",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:41:51Z",
  "cash_received": true
}
```

```json
{
  "id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
  "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "assignment_id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
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
  "arrived_at": "2026-10-27T14:41:51.590774Z",
  "started_at": "2026-10-27T14:41:51.621526Z",
  "completed_at": "2026-10-27T14:41:51.691503Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/03b3e02e-ffad-466f-b51f-01330b556a08` → **200**

```json
{
  "id": "03b3e02e-ffad-466f-b51f-01330b556a08",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5da8c443-458a-419a-9eb7-84bf7d25a9b5",
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
    "id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b",
    "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:41:51.301692Z",
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
    "id": "03b3e02e-ffad-466f-b51f-01330b556a08",
    "short_number": 4,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:41:51.301692Z",
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
    "id": "b6b62790-4cf3-4957-93c3-39296513c5fa",
    "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
    "order_short_number": 4,
    "created_at": "2026-10-27T14:41:51.36786Z",
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
  "session_id": "b025078b-90f3-4f9a-862b-fbf9b1020813",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMTUsImlhdCI6MTc5MzExMjExNSwianRpIjoiZmY0ZjE3MmEtODliNi00ZTg3LWJkYWItM2EzM2Y1MzIzYzgwIiwic2lkIjoiYjAyNTA3OGItOTBmMy00ZjlhLTg2MmItZmJmOWIxMDIwODEzIn0.3TDVlkc8thoKQtai-YOgMrKEGovxg3xSFWI-O2eTHYE",
  "access_expires_at": "2026-10-27T14:56:55.050646952Z",
  "refresh_token": "f7rWGstvwsXMdUzUolLTfhuv0HWv-V9CRFK2IHBRtQA",
  "refresh_expires_at": "2026-10-28T02:41:55.050020564Z",
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
  "session_id": "003e8088-2de6-45fe-bdec-25b31ceb968e",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMTUsImlhdCI6MTc5MzExMjExNSwianRpIjoiNmQzOGE5NzUtZjY0OS00NmE5LTlhOWItYWMzZjJhZmZjODk2Iiwic2lkIjoiMDAzZTgwODgtMmRlNi00NWZlLWJkZWMtMjViMzFjZWI5NjhlIn0.I2V7F06S_tvpBTeNG3T75GnxCbySJjobBxGN0le777I",
  "access_expires_at": "2026-10-27T14:56:55.308967581Z",
  "refresh_token": "HNqUy1zQCLk8kt_gyMhaazMBko3icBe2gScCiSnRQG0",
  "refresh_expires_at": "2026-10-28T02:41:55.308347981Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/03b3e02e-ffad-466f-b51f-01330b556a08/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:41:51.302308Z",
      "actor": {
        "type": "CLIENT",
        "id": "5da8c443-458a-419a-9eb7-84bf7d25a9b5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
        "quote_id": "242b4b00-60e9-43da-a455-6c01ad2a666b",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:41:51.305576Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
        "attempt_id": "3a72d905-1440-4c89-9d48-18181da7d26c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:41:51.310916Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "021c4bf1-32e4-46af-8e97-c39c2ea3ecd5",
        "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:41:51.369753Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "021c4bf1-32e4-46af-8e97-c39c2ea3ecd5",
        "order_id": "03b3e02e-ffad-466f-b51f-01330b556a08",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "1e395e74-7ed2-4a53-a04d-0e8525996f3b"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 03b3e02e-ffad-466f-b51f-01330b556a08.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-7341"
}
```

```json
{
  "challenge_id": "74e76104-d1ac-4912-8291-52b30b52e798",
  "expires_at": "2026-10-27T14:46:55.365454022Z",
  "resend_available_at": "2026-10-27T14:41:56.365454022Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "736848",
  "sent_at": "2026-10-27T14:41:55.368670015Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74e76104-d1ac-4912-8291-52b30b52e798",
  "code": "736848",
  "device_ref": "sandbox-7341"
}
```

```json
{
  "session_id": "3734cacb-e4bc-49ee-86a6-451ef06f649e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAxNSwiaWF0IjoxNzkzMTEyMTE1LCJqdGkiOiJhNDI2ODQ3NC05OTVmLTQzNjEtYTEwNC1jOWI0MjExZWRjMzQiLCJzaWQiOiIzNzM0Y2FjYi1lNGJjLTQ5ZWUtODZhNi00NTFlZjA2ZjY0OWUifQ.gDEi_mI1H2awp-J6rmGZ1az6DbM98qCkdnb-8cunsiU",
  "access_expires_at": "2026-10-27T14:56:55.415907266Z",
  "refresh_token": "G7v6rxs_N6JFicNPwbA_ltPybwPzdTjcWx1lQHdHVlE",
  "refresh_expires_at": "2026-11-26T14:41:55.415210818Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:51.658528Z",
  "last_location_at": "2026-10-27T14:41:51.658528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/handover` → **200**

```json
{
  "command_id": "c571da1e-c5d5-4955-9442-2c1d9978201b",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:51.658528Z",
  "last_location_at": "2026-10-27T14:41:51.658528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:55Z",
    "sequence": 1793112115488
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:55.502743Z",
  "last_location_at": "2026-10-27T14:41:55.502743Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663977383",
  "device_ref": "sandbox-9145"
}
```

```json
{
  "challenge_id": "36881f6d-b529-4184-945a-146238a00fd0",
  "expires_at": "2026-10-27T14:46:55.524191694Z",
  "resend_available_at": "2026-10-27T14:41:56.524191694Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663977383` → **200**

```json
{
  "phone": "+380663977383",
  "audience": "CLIENT",
  "code": "313772",
  "sent_at": "2026-10-27T14:41:55.52757162Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36881f6d-b529-4184-945a-146238a00fd0",
  "code": "313772",
  "device_ref": "sandbox-9145"
}
```

```json
{
  "session_id": "d784947e-a7d3-4c8d-ab76-861c17db7d17",
  "subject": {
    "type": "CLIENT",
    "id": "17b8f939-b448-4e93-95a4-ddce0be14a4e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2I4ZjkzOS1iNDQ4LTRlOTMtOTVhNC1kZGNlMGJlMTRhNGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDE1LCJpYXQiOjE3OTMxMTIxMTUsImp0aSI6ImZiYjZlNDY0LTg5MzUtNDA5OS1hMTQ3LTY1MDJjNzdiNTA0NyIsInNpZCI6ImQ3ODQ5NDdlLWE3ZDMtNGM4ZC1hYjc2LTg2MWMxN2RiN2QxNyJ9.cSWZvzdH_weCiWmq-cYxp7PJDPpGkHHGuJvGBwAcgY0",
  "access_expires_at": "2026-10-27T14:56:55.573464993Z",
  "refresh_token": "Zz7YeaON6P7YRBTTb9noOHCUNGST5Zvc7kO9KMflE-s",
  "refresh_expires_at": "2026-11-26T14:41:55.572898561Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e8cd0ae-e970-439c-9fe4-c81355eef11d",
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
  "id": "adf9c521-9729-4e8f-8f40-051fc4017cf3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T14:46:55.605110Z",
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
  "command_id": "0b325267-a6c9-46fb-9c8a-b7b50c5f35ca",
  "quote_id": "adf9c521-9729-4e8f-8f40-051fc4017cf3",
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
  "id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "17b8f939-b448-4e93-95a4-ddce0be14a4e",
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
  "created_at": "2026-10-27T14:41:55.637691Z",
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
    "id": "1e401ba1-7bb3-413e-8a3d-456df9cbcb70",
    "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
    "expires_at": "2026-10-27T14:42:10.641669Z",
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

`POST /api/driver/v1/offers/1e401ba1-7bb3-413e-8a3d-456df9cbcb70/accept` → **200**

```json
{
  "command_id": "ed09a051-d7a3-4b05-bd3d-6d0898409ec5"
}
```

```json
{
  "id": "fd43028a-1f1f-436b-ac36-29a01d0106e0",
  "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "722bfe2e-7bba-4296-b37f-c854fd69a2da",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "722bfe2e-7bba-4296-b37f-c854fd69a2da",
  "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
  "assignment_id": "fd43028a-1f1f-436b-ac36-29a01d0106e0",
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

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:55Z",
    "sequence": 1793112115742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:55.756982Z",
  "last_location_at": "2026-10-27T14:41:55.756982Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/722bfe2e-7bba-4296-b37f-c854fd69a2da/arrive` → **200**

```json
{
  "command_id": "42129049-60ed-4360-b94e-0af6b31c47b6",
  "expected_version": 0
}
```

```json
{
  "id": "722bfe2e-7bba-4296-b37f-c854fd69a2da",
  "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
  "assignment_id": "fd43028a-1f1f-436b-ac36-29a01d0106e0",
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
  "arrived_at": "2026-10-27T14:41:55.789563Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/722bfe2e-7bba-4296-b37f-c854fd69a2da/start` → **200**

```json
{
  "command_id": "456897af-d63c-4de3-92fe-6632ff0f94dc",
  "expected_version": 1
}
```

```json
{
  "id": "722bfe2e-7bba-4296-b37f-c854fd69a2da",
  "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
  "assignment_id": "fd43028a-1f1f-436b-ac36-29a01d0106e0",
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
  "arrived_at": "2026-10-27T14:41:55.789563Z",
  "started_at": "2026-10-27T14:41:55.823588Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:55Z",
    "sequence": 1793112115846
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:55.86373Z",
  "last_location_at": "2026-10-27T14:41:55.86373Z",
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
  "device_ref": "sandbox-6466"
}
```

```json
{
  "challenge_id": "aa095d6e-0395-4345-84d4-8c151f408c4a",
  "expires_at": "2026-10-27T14:46:55.88500321Z",
  "resend_available_at": "2026-10-27T14:41:56.88500321Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "068074",
  "sent_at": "2026-10-27T14:41:55.887924845Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aa095d6e-0395-4345-84d4-8c151f408c4a",
  "code": "068074",
  "device_ref": "sandbox-6466"
}
```

```json
{
  "session_id": "cf73f263-27fa-4729-ab89-a46ce0d9eaf8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAxNSwiaWF0IjoxNzkzMTEyMTE1LCJqdGkiOiI1NTlmNWUxYy04OTQ2LTRiZDgtOWZmNy1jZDA0OGIyNTJkZjciLCJzaWQiOiJjZjczZjI2My0yN2ZhLTQ3MjktYWI4OS1hNDZjZTBkOWVhZjgifQ.4vRW7gfIvZIApDroP1Ux6iUm9OiOzAOsCuLcaZJDi0M",
  "access_expires_at": "2026-10-27T14:56:55.935665836Z",
  "refresh_token": "YnErB9u3KwegJlB4AQ45_WbaFxeBDttt8GHFd_NGB30",
  "refresh_expires_at": "2026-11-26T14:41:55.935037124Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10741a32-bc6a-4158-b5c0-34e3d75f9fdc",
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
  "last_heartbeat_at": "2026-10-27T14:41:44.409741Z",
  "last_location_at": "2026-10-27T14:41:44.409741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10741a32-bc6a-4158-b5c0-34e3d75f9fdc/handover` → **200**

```json
{
  "command_id": "d57b2aa7-86d2-4ab6-a5e9-d4b73811cce9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10741a32-bc6a-4158-b5c0-34e3d75f9fdc",
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
  "last_heartbeat_at": "2026-10-27T14:41:44.409741Z",
  "last_location_at": "2026-10-27T14:41:44.409741Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/10741a32-bc6a-4158-b5c0-34e3d75f9fdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:56Z",
    "sequence": 1793112116804
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10741a32-bc6a-4158-b5c0-34e3d75f9fdc",
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
  "last_heartbeat_at": "2026-10-27T14:41:56.021932Z",
  "last_location_at": "2026-10-27T14:41:56.021932Z",
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
  "session_id": "0b7a2b5a-4e84-4beb-8210-a823ae32b831",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMTYsImlhdCI6MTc5MzExMjExNiwianRpIjoiNWMxYzYzY2UtYzY3Ni00YTQyLWJmNDEtMTdiYTQ1Mzg4M2I0Iiwic2lkIjoiMGI3YTJiNWEtNGU4NC00YmViLTgyMTAtYTgyM2FlMzJiODMxIn0.oC5Qy7vN5Ng7y1-sZALQE52NTlmf9sMsahEyYou_dqA",
  "access_expires_at": "2026-10-27T14:56:56.278664169Z",
  "refresh_token": "poBOndxU02CwMzubliGzIDJQBT_a77IWk05mCV-vlH4",
  "refresh_expires_at": "2026-10-28T02:41:56.278206794Z",
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
  "session_id": "ddb801d9-c234-495e-9859-6cd3736558b4",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMTYsImlhdCI6MTc5MzExMjExNiwianRpIjoiYjc0ZWI1YmUtNWU2Yy00M2U1LWJhNjctMDM5ZjFhYTUzNmUzIiwic2lkIjoiZGRiODAxZDktYzIzNC00OTVlLTk4NTktNmNkMzczNjU1OGI0In0.C44WdK9EO_eeg5StscHsahYzl6eWuxVGfU27Fb8wwDM",
  "access_expires_at": "2026-10-27T14:56:56.536735103Z",
  "refresh_token": "dUO5NNLuhLt-VnqTgdeGV6T7sS_HRUh8j9UEArHviR0",
  "refresh_expires_at": "2026-10-28T02:41:56.536308815Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/32fb2c70-1e7f-4728-8f99-4922f67a6fea` → **200**

```json
{
  "id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
  "short_number": 5,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "17b8f939-b448-4e93-95a4-ddce0be14a4e",
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
    "id": "fd43028a-1f1f-436b-ac36-29a01d0106e0",
    "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "722bfe2e-7bba-4296-b37f-c854fd69a2da",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T14:41:55.637691Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/32fb2c70-1e7f-4728-8f99-4922f67a6fea/interrupt` → **200**

```json
{
  "command_id": "ca4d3211-3af9-421c-8774-4ec721866adc",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
    "short_number": 5,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "17b8f939-b448-4e93-95a4-ddce0be14a4e",
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
      "id": "fd43028a-1f1f-436b-ac36-29a01d0106e0",
      "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "722bfe2e-7bba-4296-b37f-c854fd69a2da",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T14:41:55.637691Z",
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
    "id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
    "short_number": 6,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "17b8f939-b448-4e93-95a4-ddce0be14a4e",
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
    "id": "105ef848-f1cb-4d04-90b2-7ca24306260c",
    "order_id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
    "expires_at": "2026-10-27T14:42:11.616441Z",
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

`POST /api/driver/v1/offers/105ef848-f1cb-4d04-90b2-7ca24306260c/accept` → **200**

```json
{
  "command_id": "cc7bd95e-bdcf-4476-8bb0-49164f8551b1"
}
```

```json
{
  "id": "7a683467-3ef7-445b-b5aa-a07e94b5481b",
  "order_id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380",
  "order_id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
  "assignment_id": "7a683467-3ef7-445b-b5aa-a07e94b5481b",
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
  "session_id": "10741a32-bc6a-4158-b5c0-34e3d75f9fdc",
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
  "last_heartbeat_at": "2026-10-27T14:41:56.021932Z",
  "last_location_at": "2026-10-27T14:41:56.021932Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/10741a32-bc6a-4158-b5c0-34e3d75f9fdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:41:56Z",
    "sequence": 1793112116728
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "10741a32-bc6a-4158-b5c0-34e3d75f9fdc",
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
  "last_heartbeat_at": "2026-10-27T14:41:56.742009Z",
  "last_location_at": "2026-10-27T14:41:56.021932Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380/arrive` → **200**

```json
{
  "command_id": "527dcb83-2aa5-48a6-ac55-2198a20fe978",
  "expected_version": 0
}
```

```json
{
  "id": "6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380",
  "order_id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
  "assignment_id": "7a683467-3ef7-445b-b5aa-a07e94b5481b",
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
  "arrived_at": "2026-10-27T14:41:56.772698Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380/start` → **200**

```json
{
  "command_id": "bf897de8-3286-4e0a-a0d0-944ad9640be1",
  "expected_version": 1
}
```

```json
{
  "id": "6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380",
  "order_id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
  "assignment_id": "7a683467-3ef7-445b-b5aa-a07e94b5481b",
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
  "arrived_at": "2026-10-27T14:41:56.772698Z",
  "started_at": "2026-10-27T14:41:56.807339Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380/complete` → **200**

```json
{
  "command_id": "6354ed16-8640-4f4c-8192-506ebb4b7a19",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:41:56Z"
}
```

```json
{
  "id": "6dbc5d25-4ee9-4c61-a5a1-1e9512ae0380",
  "order_id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
  "assignment_id": "7a683467-3ef7-445b-b5aa-a07e94b5481b",
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
  "arrived_at": "2026-10-27T14:41:56.772698Z",
  "started_at": "2026-10-27T14:41:56.807339Z",
  "completed_at": "2026-10-27T14:41:56.843646Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "5002616a-962d-4b59-b4ef-a5c3909979d1",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:41:56.606097Z",
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
    "id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:41:55.637691Z",
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
      "balance_minor": 11113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/32fb2c70-1e7f-4728-8f99-4922f67a6fea/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:41:55.638591Z",
      "actor": {
        "type": "CLIENT",
        "id": "17b8f939-b448-4e93-95a4-ddce0be14a4e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
        "quote_id": "adf9c521-9729-4e8f-8f40-051fc4017cf3",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:41:55.640639Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
        "attempt_id": "c5a97c4d-3872-45aa-9c40-c7dcdcf2f78f",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:41:55.645941Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1e401ba1-7bb3-413e-8a3d-456df9cbcb70",
        "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:41:55.703893Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1e401ba1-7bb3-413e-8a3d-456df9cbcb70",
        "order_id": "32fb2c70-1e7f-4728-8f99-4922f67a6fea",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "fd43028a-1f1f-436b-ac36-29a01d0106e0"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 32fb2c70-1e7f-4728-8f99-4922f67a6fea, follow-up 5002616a-962d-4b59-b4ef-a5c3909979d1.

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
  "session_id": "dd5a646b-f00b-404e-9d0b-04d4a375e170",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjAsImlhdCI6MTc5MzExMjEyMCwianRpIjoiNzc3OTRiMWEtYjFiZS00ZGM2LWI2N2EtN2IwYzA0ZWY3MmNiIiwic2lkIjoiZGQ1YTY0NmItZjAwYi00MDRlLTlkMGItMDRkNGEzNzVlMTcwIn0.u5J54VH0yITvVBBYz8t6WWla0V3ppx633HYUbCWC_aE",
  "access_expires_at": "2026-10-27T14:57:00.186628406Z",
  "refresh_token": "xHhSdpQKODdKasj7hr5Tt-vZzdraZ1WMp-MWeuYayUM",
  "refresh_expires_at": "2026-10-28T02:42:00.186122768Z",
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
  "session_id": "e89181ac-d839-4350-9c2f-ec2ae8e48768",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjAsImlhdCI6MTc5MzExMjEyMCwianRpIjoiYjE5MTljNGMtNmM3My00YzNhLWEzNmEtZjg4ZGI4MDU3ODNmIiwic2lkIjoiZTg5MTgxYWMtZDgzOS00MzUwLTljMmYtZWMyYWU4ZTQ4NzY4In0.gQxVbyXUnQ0ovUW1dbMo-I0Wp-04Sztyql8rI-PpjLA",
  "access_expires_at": "2026-10-27T14:57:00.477118549Z",
  "refresh_token": "xQiA-XdAYN8HJfO6MasndJ4mzsVsqyaYJJuykxnSWNE",
  "refresh_expires_at": "2026-10-28T02:42:00.476586755Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14620"
}
```

```json
{
  "challenge_id": "9a9f234e-dcc8-43be-9d8c-b1b5bf656b53",
  "expires_at": "2026-10-27T14:47:00.499662189Z",
  "resend_available_at": "2026-10-27T14:42:01.499662189Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "749154",
  "sent_at": "2026-10-27T14:42:00.501856782Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a9f234e-dcc8-43be-9d8c-b1b5bf656b53",
  "code": "749154",
  "device_ref": "sandbox-14620"
}
```

```json
{
  "session_id": "461e5073-a115-4c08-9d5b-8ab968d444cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAyMCwiaWF0IjoxNzkzMTEyMTIwLCJqdGkiOiI0YjQyNmFlNy0zN2ViLTQ2ZDMtOWY5Ni05NGY4MjU0OTIyYjciLCJzaWQiOiI0NjFlNTA3My1hMTE1LTRjMDgtOWQ1Yi04YWI5NjhkNDQ0Y2QifQ.UV9PFjNot5MujANHjxaiYcJd0DUiDELykTK_MbSFHkM",
  "access_expires_at": "2026-10-27T14:57:00.556472388Z",
  "refresh_token": "wF1Qvt-jRYfKZgg8I-dWKlqfdf2aYgNm1xfd3hfEg7o",
  "refresh_expires_at": "2026-11-26T14:42:00.555709892Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:55.86373Z",
  "last_location_at": "2026-10-27T14:41:55.86373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/handover` → **200**

```json
{
  "command_id": "974f1dc1-7026-463f-a646-2a44745f6bbd",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:41:55.86373Z",
  "last_location_at": "2026-10-27T14:41:55.86373Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:00Z",
    "sequence": 1793112120628
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:42:00.643074Z",
  "last_location_at": "2026-10-27T14:42:00.643074Z",
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
  "command_id": "004288a5-359a-4cad-bbdb-3ff4f247b6b9",
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
  "effective_at": "2026-10-27T14:42:00.709353Z",
  "changed_by": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T14:42:00.739284867Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a48e7f34-365a-4872-b854-207c5305dbea",
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
  "id": "82233948-16e3-4320-80c7-ab32b6e9b22b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:47:00.778844Z",
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
  "command_id": "db3d442c-3e92-4139-a5e5-ef3360996341",
  "quote_id": "82233948-16e3-4320-80c7-ab32b6e9b22b",
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
    "phone": "+380671110400"
  }
}
```

```json
{
  "id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
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
  "created_at": "2026-10-27T14:42:00.838188Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110400"
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
    "id": "62447459-3e07-4a2e-9e6c-2616e1e6b137",
    "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
    "expires_at": "2026-10-27T14:42:15.842505Z",
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

`POST /api/driver/v1/offers/62447459-3e07-4a2e-9e6c-2616e1e6b137/accept` → **200**

```json
{
  "command_id": "51278b52-51af-4813-aa8e-ed8a0251a5c6"
}
```

```json
{
  "id": "cf01d5c6-9ac7-451d-931b-6bc60a2103ef",
  "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae",
  "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
  "assignment_id": "cf01d5c6-9ac7-451d-931b-6bc60a2103ef",
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

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:00Z",
    "sequence": 1793112120931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:42:00.943967Z",
  "last_location_at": "2026-10-27T14:42:00.943967Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae/arrive` → **200**

```json
{
  "command_id": "1f582c67-e6e7-4e41-877c-88921d2cb97f",
  "expected_version": 0
}
```

```json
{
  "id": "ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae",
  "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
  "assignment_id": "cf01d5c6-9ac7-451d-931b-6bc60a2103ef",
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
  "arrived_at": "2026-10-27T14:42:00.973314Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae/start` → **200**

```json
{
  "command_id": "02dfcf77-4e77-48b6-8cc0-a5edc78a7bfe",
  "expected_version": 1
}
```

```json
{
  "id": "ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae",
  "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
  "assignment_id": "cf01d5c6-9ac7-451d-931b-6bc60a2103ef",
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
  "arrived_at": "2026-10-27T14:42:00.973314Z",
  "started_at": "2026-10-27T14:42:01.005336Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae/complete` → **200**

```json
{
  "command_id": "66752747-cbe3-4569-94eb-58e52e6c3d01",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:42:01Z",
  "cash_received": true
}
```

```json
{
  "id": "ea80987d-a6b8-49f2-8bcb-e83dbb84f0ae",
  "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
  "assignment_id": "cf01d5c6-9ac7-451d-931b-6bc60a2103ef",
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
  "arrived_at": "2026-10-27T14:42:00.973314Z",
  "started_at": "2026-10-27T14:42:01.005336Z",
  "completed_at": "2026-10-27T14:42:01.055129Z",
  "needs_review": false
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ce34dfdd-07de-4dc7-9a08-6e4b6f26761b",
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
  "id": "219866e1-f390-47b2-b5c2-56ae7e214c7d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:47:01.094664Z",
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
  "command_id": "d88fcdfd-987c-4198-b986-9226043cc660",
  "quote_id": "219866e1-f390-47b2-b5c2-56ae7e214c7d",
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
    "phone": "+3806711131480"
  }
}
```

```json
{
  "id": "8c4f3ace-3162-4640-b57b-9f5cdb9336d3",
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
  "created_at": "2026-10-27T14:42:01.127114Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131480"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8c4f3ace-3162-4640-b57b-9f5cdb9336d3` → **200**

```json
{
  "id": "8c4f3ace-3162-4640-b57b-9f5cdb9336d3",
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
  "created_at": "2026-10-27T14:42:01.127114Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131480"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8c4f3ace-3162-4640-b57b-9f5cdb9336d3/cancel` → **200**

```json
{
  "command_id": "5c3f52ae-ff25-4b33-af7d-38c8e392142d",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8c4f3ace-3162-4640-b57b-9f5cdb9336d3",
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
  "created_at": "2026-10-27T14:42:01.127114Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131480"
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
  "staff_id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T14:42:01.061461Z",
  "last_entries": [
    {
      "order_id": "8c4f3ace-3162-4640-b57b-9f5cdb9336d3",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T14:42:01.193327Z"
    },
    {
      "order_id": "7934d0ec-1022-48ec-8264-3cd60faebf8e",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T14:42:01.061461Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0edb1d8d-88ae-484d-b3f5-671e5100a3df",
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
  "last_heartbeat_at": "2026-10-27T14:42:00.943967Z",
  "last_location_at": "2026-10-27T14:42:00.943967Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0edb1d8d-88ae-484d-b3f5-671e5100a3df/close` → **200**

```json
{
  "command_id": "bc7158c7-90bc-4d19-a4f9-1e0fef68c205",
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

Done: operator bonus for fulfilled 7934d0ec-1022-48ec-8264-3cd60faebf8e and operator-fault cancellation 8c4f3ace-3162-4640-b57b-9f5cdb9336d3.

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
  "session_id": "41463c4d-576a-4c2a-baa1-97b4d8c001af",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjMsImlhdCI6MTc5MzExMjEyMywianRpIjoiZmQxZWRhZTctODc4MC00ZmQ1LWIwZWQtYzc5ZjRhOTZkMmY1Iiwic2lkIjoiNDE0NjNjNGQtNTc2YS00YzJhLWJhYTEtOTdiNGQ4YzAwMWFmIn0.VhkFV9G9TjgvQ9cWrj88WjoD2PXZFnsFMcqEPDVcH8s",
  "access_expires_at": "2026-10-27T14:57:03.561890708Z",
  "refresh_token": "K4BDzaOoGWAjqDlGB3DrZueHCEjX5V9cQlUnDUCoYTI",
  "refresh_expires_at": "2026-10-28T02:42:03.561277586Z",
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
  "command_id": "988c05d9-648d-423d-a060-f57340f796a5",
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
  "changed_by": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T14:42:03.625623808Z"
}
```

## The rider books the airport for 2026-10-27T17:42:03Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600069501",
  "device_ref": "sandbox-13672"
}
```

```json
{
  "challenge_id": "c72afa64-e5c8-40a3-8e7a-928cdde03e99",
  "expires_at": "2026-10-27T14:47:03.652820079Z",
  "resend_available_at": "2026-10-27T14:42:04.652820079Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600069501` → **200**

```json
{
  "phone": "+48600069501",
  "audience": "CLIENT",
  "code": "349990",
  "sent_at": "2026-10-27T14:42:03.654821302Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c72afa64-e5c8-40a3-8e7a-928cdde03e99",
  "code": "349990",
  "device_ref": "sandbox-13672"
}
```

```json
{
  "session_id": "606d2059-e6ec-42ba-a06c-034ccd5aae8d",
  "subject": {
    "type": "CLIENT",
    "id": "e509b119-95d1-46a7-beab-5ec6526b9761"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTA5YjExOS05NWQxLTQ2YTctYmVhYi01ZWM2NTI2Yjk3NjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDIzLCJpYXQiOjE3OTMxMTIxMjMsImp0aSI6Ijg4MGM5ZTljLWUyZTUtNDI4Ni1iN2M2LWJhM2Q4NzAxYWQ0YyIsInNpZCI6IjYwNmQyMDU5LWU2ZWMtNDJiYS1hMDZjLTAzNGNjZDVhYWU4ZCJ9.CO2ApfKUPl11mURPZc59iG1f9piE9oAxcoEJ9xmuRJY",
  "access_expires_at": "2026-10-27T14:57:03.698862716Z",
  "refresh_token": "v-w8slTmBmdEAyfWO2M2Oa9qw6jnx0OHYScRZIlXXNo",
  "refresh_expires_at": "2026-11-26T14:42:03.698252231Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "92c85774-3633-488d-a1d2-bdb0de4fbb73",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T17:42:03Z"
}
```

```json
{
  "id": "a2e78945-26df-4b55-8ab8-95589dff34a9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T14:47:03.729030Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T17:42:03Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0047eca5-3d59-41a0-bf55-d33b46e32b95",
  "quote_id": "a2e78945-26df-4b55-8ab8-95589dff34a9",
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
  "pickup_at": "2026-10-27T17:42:03Z"
}
```

```json
{
  "id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e509b119-95d1-46a7-beab-5ec6526b9761",
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
  "created_at": "2026-10-27T14:42:03.763407Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T17:42:03Z",
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
  "device_ref": "sandbox-28366"
}
```

```json
{
  "challenge_id": "82325979-e84f-4563-8b39-06ac8de96aa6",
  "expires_at": "2026-10-27T14:47:03.794107292Z",
  "resend_available_at": "2026-10-27T14:42:04.794107292Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "148230",
  "sent_at": "2026-10-27T14:42:03.796914853Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82325979-e84f-4563-8b39-06ac8de96aa6",
  "code": "148230",
  "device_ref": "sandbox-28366"
}
```

```json
{
  "session_id": "758df204-ac55-4077-9a42-a3a7200cf212",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAyMywiaWF0IjoxNzkzMTEyMTIzLCJqdGkiOiI0NDFhZTk3Ny00YzU2LTRkNzQtYTA2NC1mNTczYjM1ZGQ2NGYiLCJzaWQiOiI3NThkZjIwNC1hYzU1LTQwNzctOWE0Mi1hM2E3MjAwY2YyMTIifQ.yYEiDkgRkQrJQXR0S124mFyPDRjH-YP2lp7VxKb11GU",
  "access_expires_at": "2026-10-27T14:57:03.841784559Z",
  "refresh_token": "T6t_6ypSxHOYqkAufjxxH6WLnDh0iUyd1UO0tsI-38E",
  "refresh_expires_at": "2026-11-26T14:42:03.841082835Z",
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
  "command_id": "16a5b781-0045-4e04-a1d0-782256397615",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:03Z",
    "sequence": 1793112123880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "39fdd2a5-02f5-45d0-87db-c3b9d1a9fd88",
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
  "last_heartbeat_at": "2026-10-27T14:42:03.89247Z",
  "last_location_at": "2026-10-27T14:42:03.89247Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
      "short_number": 9,
      "pickup_at": "2026-10-27T17:42:03Z",
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

`POST /api/driver/v1/preorders/bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9/reserve` → **200**

```json
{
  "command_id": "438076d8-70a3-47fc-bff2-3fec650a3bce"
}
```

```json
{
  "id": "304f0cf5-11c6-4973-aae1-9453ae038c1b",
  "state": "RESERVED",
  "order": {
    "order_id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
    "short_number": 9,
    "pickup_at": "2026-10-27T17:42:03Z",
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
  "reserved_at": "2026-10-27T14:42:03.953897Z",
  "confirm_from": "2026-10-27T17:12:03Z",
  "confirm_until": "2026-10-27T17:22:03Z",
  "drop_until": "2026-10-27T16:42:03Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "304f0cf5-11c6-4973-aae1-9453ae038c1b",
      "state": "RESERVED",
      "order": {
        "order_id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:42:03Z",
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
      "reserved_at": "2026-10-27T14:42:03.953897Z",
      "confirm_from": "2026-10-27T17:12:03Z",
      "confirm_until": "2026-10-27T17:22:03Z",
      "drop_until": "2026-10-27T16:42:03Z"
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
      "id": "304f0cf5-11c6-4973-aae1-9453ae038c1b",
      "state": "RESERVED",
      "order": {
        "order_id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:42:03Z",
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
      "reserved_at": "2026-10-27T14:42:03.953897Z",
      "confirm_from": "2026-10-27T17:12:03Z",
      "confirm_until": "2026-10-27T17:22:03Z",
      "drop_until": "2026-10-27T16:42:03Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/304f0cf5-11c6-4973-aae1-9453ae038c1b/confirm` → **409**

```json
{
  "command_id": "ab232f8d-5075-433b-a6aa-4de1f2c93a4d"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/304f0cf5-11c6-4973-aae1-9453ae038c1b/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c9df0f9a-7823-46a3-88b1-6b4ce1928658"
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
  "session_id": "3593b030-8ec4-484e-aeae-7f36562a19b9",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjQsImlhdCI6MTc5MzExMjEyNCwianRpIjoiNGMxOWQwMzktYjMwOC00ZDY0LWI2YzctNGYyYTFhY2I1ZmNlIiwic2lkIjoiMzU5M2IwMzAtOGVjNC00ODRlLWFlYWUtN2YzNjU2MmExOWI5In0.JZN83ieKA-d8fYt3FDEEOkhTJ5SuFhVccCRlZYbMSaM",
  "access_expires_at": "2026-10-27T14:57:04.296352143Z",
  "refresh_token": "fIUrXEfWugxKHHNIjSEqUGUjVFnlDsWOk9d0arXS3p0",
  "refresh_expires_at": "2026-10-28T02:42:04.295796314Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9` → **200**

```json
{
  "id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "e509b119-95d1-46a7-beab-5ec6526b9761",
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
  "created_at": "2026-10-27T14:42:03.763407Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T17:42:03Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "304f0cf5-11c6-4973-aae1-9453ae038c1b",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T14:42:03.953897Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T14:42:03.765557Z",
      "actor": {
        "type": "CLIENT",
        "id": "e509b119-95d1-46a7-beab-5ec6526b9761",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
        "preorder": true,
        "quote_id": "a2e78945-26df-4b55-8ab8-95589dff34a9",
        "pickup_at": "2026-10-27T17:42:03Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T14:42:03.955424Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "304f0cf5-11c6-4973-aae1-9453ae038c1b"
      }
    }
  ]
}
```

Done: pre-order bbb593b8-c9b4-4c7c-9b7d-76c575d3d3a9, reservation 304f0cf5-11c6-4973-aae1-9453ae038c1b.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3272"
}
```

```json
{
  "challenge_id": "3163aab4-c3bb-4264-944a-bbea75450ec5",
  "expires_at": "2026-10-27T14:47:04.369640928Z",
  "resend_available_at": "2026-10-27T14:42:05.369640928Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "517698",
  "sent_at": "2026-10-27T14:42:04.371819021Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3163aab4-c3bb-4264-944a-bbea75450ec5",
  "code": "517698",
  "device_ref": "sandbox-3272"
}
```

```json
{
  "session_id": "4bdeff8d-bef4-405c-b05d-c84012198df1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAyNCwiaWF0IjoxNzkzMTEyMTI0LCJqdGkiOiI3ZjEzYjEyOC05MTQ3LTQ1NzAtODdjZi1lNjY4NzhjMWYwMWIiLCJzaWQiOiI0YmRlZmY4ZC1iZWY0LTQwNWMtYjA1ZC1jODQwMTIxOThkZjEifQ.cYqfyX5Wd6hNCZfqnJcP_LKp99-8dUPApoYTnO6N16k",
  "access_expires_at": "2026-10-27T14:57:04.41436743Z",
  "refresh_token": "hOx-hj7l290kxjV-FGBV__WoyIM_L4Bjy2YogSpuNzM",
  "refresh_expires_at": "2026-11-26T14:42:04.413900066Z",
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
  "command_id": "5a91b0c7-a388-4680-b00c-1db3e9d150a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:04Z",
    "sequence": 1793112124453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd8834f5-f4f8-4c16-94a0-b428f19dd36d",
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
  "last_heartbeat_at": "2026-10-27T14:42:04.465983Z",
  "last_location_at": "2026-10-27T14:42:04.465983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672944313",
  "device_ref": "sandbox-27989"
}
```

```json
{
  "challenge_id": "5521ceb3-c33d-4b77-ad1c-87f523529853",
  "expires_at": "2026-10-27T14:47:04.490331861Z",
  "resend_available_at": "2026-10-27T14:42:05.490331861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672944313` → **200**

```json
{
  "phone": "+380672944313",
  "audience": "CLIENT",
  "code": "568814",
  "sent_at": "2026-10-27T14:42:04.492380926Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5521ceb3-c33d-4b77-ad1c-87f523529853",
  "code": "568814",
  "device_ref": "sandbox-27989"
}
```

```json
{
  "session_id": "6995ef7d-ed72-4bf2-be99-65e01a853f10",
  "subject": {
    "type": "CLIENT",
    "id": "68167f1c-b780-40e9-85e2-33b4f1b4f487"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODE2N2YxYy1iNzgwLTQwZTktODVlMi0zM2I0ZjFiNGY0ODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDI0LCJpYXQiOjE3OTMxMTIxMjQsImp0aSI6IjQ1ZWQ1MGZhLWRjOWMtNDA4MS04OTZjLTkzNDhlZmU1YmU4ZSIsInNpZCI6IjY5OTVlZjdkLWVkNzItNGJmMi1iZTk5LTY1ZTAxYTg1M2YxMCJ9.QY8CtobyDhsCm3hHGtH9qU_o_zcJJjMWkemjRpE3r5M",
  "access_expires_at": "2026-10-27T14:57:04.536220761Z",
  "refresh_token": "411EjSSxcTXh6dwOnJGHEB9n-tXjsQsXWsTeACy0gEk",
  "refresh_expires_at": "2026-11-26T14:42:04.53582096Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a84ba9f2-d1b1-4650-8a6b-49579c03f73c",
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
  "id": "1eb3f7a4-6a35-4f77-b49f-5daab42c62c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:47:04.566644Z",
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
  "command_id": "60989cfb-0415-4fee-927c-5c21c0f228cd",
  "quote_id": "1eb3f7a4-6a35-4f77-b49f-5daab42c62c7",
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
  "id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "68167f1c-b780-40e9-85e2-33b4f1b4f487",
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
  "created_at": "2026-10-27T14:42:04.597274Z",
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
    "id": "800fe36f-2f3a-46d3-8826-a3f72d063ab5",
    "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
    "expires_at": "2026-10-27T14:42:19.601153Z",
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

`POST /api/driver/v1/offers/800fe36f-2f3a-46d3-8826-a3f72d063ab5/accept` → **200**

```json
{
  "command_id": "52314c06-366b-4b2d-9359-674f71201f29"
}
```

```json
{
  "id": "194a6cb3-a6b4-4b55-acfd-a6addd9b26ec",
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f2b9b623-fc8a-4901-a84a-c41d6d709739",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f2b9b623-fc8a-4901-a84a-c41d6d709739",
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "assignment_id": "194a6cb3-a6b4-4b55-acfd-a6addd9b26ec",
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

`POST /api/driver/v1/work-sessions/dd8834f5-f4f8-4c16-94a0-b428f19dd36d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:04Z",
    "sequence": 1793112124695
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd8834f5-f4f8-4c16-94a0-b428f19dd36d",
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
  "last_heartbeat_at": "2026-10-27T14:42:04.709041Z",
  "last_location_at": "2026-10-27T14:42:04.709041Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f2b9b623-fc8a-4901-a84a-c41d6d709739",
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "assignment_id": "194a6cb3-a6b4-4b55-acfd-a6addd9b26ec",
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

`POST /api/driver/v1/trips/f2b9b623-fc8a-4901-a84a-c41d6d709739/arrive` → **200**

```json
{
  "command_id": "4dee6fae-f318-4254-a08f-c6ea1f252a45",
  "expected_version": 0
}
```

```json
{
  "id": "f2b9b623-fc8a-4901-a84a-c41d6d709739",
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "assignment_id": "194a6cb3-a6b4-4b55-acfd-a6addd9b26ec",
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
  "arrived_at": "2026-10-27T14:42:04.751046Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/f2b9b623-fc8a-4901-a84a-c41d6d709739/start` → **200**

```json
{
  "command_id": "f570b420-f50f-4bc3-82ce-daa71f8e006c",
  "expected_version": 1
}
```

```json
{
  "id": "f2b9b623-fc8a-4901-a84a-c41d6d709739",
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "assignment_id": "194a6cb3-a6b4-4b55-acfd-a6addd9b26ec",
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
  "arrived_at": "2026-10-27T14:42:04.751046Z",
  "started_at": "2026-10-27T14:42:04.789934Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/dd8834f5-f4f8-4c16-94a0-b428f19dd36d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:04Z",
    "sequence": 1793112124807
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd8834f5-f4f8-4c16-94a0-b428f19dd36d",
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
  "last_heartbeat_at": "2026-10-27T14:42:04.820949Z",
  "last_location_at": "2026-10-27T14:42:04.820949Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/f2b9b623-fc8a-4901-a84a-c41d6d709739/complete` → **200**

```json
{
  "command_id": "dbd534af-cf7d-440a-af00-0dc7b8dce5e1",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:42:04Z",
  "cash_received": true
}
```

```json
{
  "id": "f2b9b623-fc8a-4901-a84a-c41d6d709739",
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "assignment_id": "194a6cb3-a6b4-4b55-acfd-a6addd9b26ec",
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
  "arrived_at": "2026-10-27T14:42:04.751046Z",
  "started_at": "2026-10-27T14:42:04.789934Z",
  "completed_at": "2026-10-27T14:42:04.846896Z",
  "needs_review": false
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/43c2cf95-4508-446e-b742-3e65155e2c94/rating` → **200**

```json
{
  "command_id": "66ee9a85-80ee-4346-b460-5c6a948464ca",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "score": 5,
  "created_at": "2026-10-27T14:42:04.887035967Z"
}
```

`POST /api/driver/v1/orders/43c2cf95-4508-446e-b742-3e65155e2c94/rating` → **200**

```json
{
  "command_id": "82930c10-f854-4d21-b187-7611a643cce1",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
  "score": 4,
  "created_at": "2026-10-27T14:42:04.917080048Z"
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
  "session_id": "acfc5b38-2d20-446b-bf40-aa20c47acb3a",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjUsImlhdCI6MTc5MzExMjEyNSwianRpIjoiOTM2N2YwYmItYjY0Yi00NmU1LTljMmEtZTJmNTMzOWI3OTE3Iiwic2lkIjoiYWNmYzViMzgtMmQyMC00NDZiLWJmNDAtYWEyMGM0N2FjYjNhIn0.AKfUKjcSNB0fZb1W-vG1HsRuJl5fZWdx_Eoo31dkEFk",
  "access_expires_at": "2026-10-27T14:57:05.202109869Z",
  "refresh_token": "D0x6gSE-nwtMNpxY0Vjf4jUf5mveUiJVqPZN1YVak3U",
  "refresh_expires_at": "2026-10-28T02:42:05.201430742Z",
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
  "session_id": "a644f943-9482-4d6b-a527-ec8594cb52a6",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjUsImlhdCI6MTc5MzExMjEyNSwianRpIjoiYTEzZDQ4ZDctNzU3MC00ZjgwLTg1YWYtMjQwMDBmZGU5N2EzIiwic2lkIjoiYTY0NGY5NDMtOTQ4Mi00ZDZiLWE1MjctZWM4NTk0Y2I1MmE2In0.sookWa-aBAGWVYSiU5d1DxI3wGVDaUU1TMjff9pBjto",
  "access_expires_at": "2026-10-27T14:57:05.461429705Z",
  "refresh_token": "vQ_sqabKxZu846neV2_SmiJDzbv9JtSNK9b_oUy9Wxo",
  "refresh_expires_at": "2026-10-28T02:42:05.461034185Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/43c2cf95-4508-446e-b742-3e65155e2c94/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
      "author_type": "RIDER",
      "author_id": "68167f1c-b780-40e9-85e2-33b4f1b4f487",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T14:42:04.887036Z"
    },
    {
      "order_id": "43c2cf95-4508-446e-b742-3e65155e2c94",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "68167f1c-b780-40e9-85e2-33b4f1b4f487",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T14:42:04.91708Z"
    }
  ]
}
```

Done: ratings for order 43c2cf95-4508-446e-b742-3e65155e2c94.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672852442",
  "device_ref": "sandbox-7001"
}
```

```json
{
  "challenge_id": "0811e799-bf20-49ee-95cc-3e7677f53d12",
  "expires_at": "2026-10-27T14:47:05.529191019Z",
  "resend_available_at": "2026-10-27T14:42:06.529191019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672852442` → **200**

```json
{
  "phone": "+380672852442",
  "audience": "CLIENT",
  "code": "531214",
  "sent_at": "2026-10-27T14:42:05.531372791Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0811e799-bf20-49ee-95cc-3e7677f53d12",
  "code": "531214",
  "device_ref": "sandbox-7001"
}
```

```json
{
  "session_id": "56057f75-43ff-4278-9792-6b4ba0be3056",
  "subject": {
    "type": "CLIENT",
    "id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMmNjY2Y4YS1iMDNlLTQyODgtOGZlNy1kZjk5ZWQ0MGRlN2EiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMDI1LCJpYXQiOjE3OTMxMTIxMjUsImp0aSI6IjkzMWU0ZWExLTgzNDYtNGIzMS05MTQ4LTlmOGU5YTUzMjZiNyIsInNpZCI6IjU2MDU3Zjc1LTQzZmYtNDI3OC05NzkyLTZiNGJhMGJlMzA1NiJ9.YEFURWS4Qak4Fwm_HKGYOKcXQ6gjvca9JrFT_b25Qeo",
  "access_expires_at": "2026-10-27T14:57:05.576302288Z",
  "refresh_token": "2KOH0A2RbPeVIov6PDJvp5JPiOryBR4HJMoq_n5xX_4",
  "refresh_expires_at": "2026-11-26T14:42:05.575700492Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "2fc41576-d279-4e4b-91ee-5425dd81bc71",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "0a365175-2c64-4d7b-867a-9536b5d3dc31",
  "upload_path": "/api/rider/v1/uploads/0a365175-2c64-4d7b-867a-9536b5d3dc31",
  "expires_at": "2026-10-27T14:57:05.607040425Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/0a365175-2c64-4d7b-867a-9536b5d3dc31` → **200**

```json
{
  "file_id": "0a365175-2c64-4d7b-867a-9536b5d3dc31",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "79025bf9-7678-4ceb-9980-7e1f23adb281",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "0a365175-2c64-4d7b-867a-9536b5d3dc31"
  ]
}
```

```json
{
  "id": "bb09c5d9-2da4-4946-943b-3334b70891e9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:42:05.668155Z",
  "updated_at": "2026-10-27T14:42:05.668155Z",
  "messages": [
    {
      "id": "0e7b009a-be26-4349-9728-e69a9daa359a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:42:05.669589Z",
      "attachments": [
        {
          "file_id": "0a365175-2c64-4d7b-867a-9536b5d3dc31",
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
  "session_id": "266d1850-cc53-4b87-b00c-2a5fe531f833",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjUsImlhdCI6MTc5MzExMjEyNSwianRpIjoiYjYwZGNlYWItMjM4Mi00NDJhLWJkZDUtNmFjNzYxZmJkMjhlIiwic2lkIjoiMjY2ZDE4NTAtY2M1My00Yjg3LWIwMGMtMmE1ZmU1MzFmODMzIn0.gGiAwoEotwRXwx5LjKTAkfjlpklynLhtD2_8mb-8H7E",
  "access_expires_at": "2026-10-27T14:57:05.955633454Z",
  "refresh_token": "wPJbL85y62gTru7OT9JOc9Wk_R3hJYXsYdzyQEzmUmo",
  "refresh_expires_at": "2026-10-28T02:42:05.955142032Z",
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
  "session_id": "365d1100-7759-49be-b211-e7dce6d78f97",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjYsImlhdCI6MTc5MzExMjEyNiwianRpIjoiOWEzNmYyMmUtNjVhNi00Y2Q1LWI0NTUtYjhmNmVjZjg1ZDg5Iiwic2lkIjoiMzY1ZDExMDAtNzc1OS00OWJlLWIyMTEtZTdkY2U2ZDc4Zjk3In0.mEowWyjnCslc0xEpu82XPYZJOq86ka_Y6IrnFjaJCkE",
  "access_expires_at": "2026-10-27T14:57:06.211154677Z",
  "refresh_token": "QhKpA8hLo60fcLsQa1UzFwJS4Ycx8PFgdxJW8XAbeNw",
  "refresh_expires_at": "2026-10-28T02:42:06.210604843Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/bb09c5d9-2da4-4946-943b-3334b70891e9/attachments/0a365175-2c64-4d7b-867a-9536b5d3dc31` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "b6f39130-2823-44d2-8395-d3d575b1e01a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "bb3e639c-18bf-4620-812d-065d92b0923e",
  "upload_path": "/api/operator/v1/uploads/bb3e639c-18bf-4620-812d-065d92b0923e",
  "expires_at": "2026-10-27T14:57:06.254964717Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/bb3e639c-18bf-4620-812d-065d92b0923e` → **200**

```json
{
  "file_id": "bb3e639c-18bf-4620-812d-065d92b0923e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/bb09c5d9-2da4-4946-943b-3334b70891e9` → **200**

```json
{
  "id": "bb09c5d9-2da4-4946-943b-3334b70891e9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:42:05.668155Z",
  "updated_at": "2026-10-27T14:42:05.668155Z",
  "messages": [
    {
      "id": "0e7b009a-be26-4349-9728-e69a9daa359a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:42:05.669589Z",
      "attachments": [
        {
          "file_id": "0a365175-2c64-4d7b-867a-9536b5d3dc31",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/bb09c5d9-2da4-4946-943b-3334b70891e9/comments` → **200**

```json
{
  "command_id": "139824bd-64ac-4c7f-9814-28ca02956466",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "bb3e639c-18bf-4620-812d-065d92b0923e"
  ]
}
```

```json
{
  "id": "bb09c5d9-2da4-4946-943b-3334b70891e9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:42:05.668155Z",
  "updated_at": "2026-10-27T14:42:06.340238Z",
  "messages": [
    {
      "id": "0e7b009a-be26-4349-9728-e69a9daa359a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:42:05.669589Z",
      "attachments": [
        {
          "file_id": "0a365175-2c64-4d7b-867a-9536b5d3dc31",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "98c4f109-f2aa-4617-9cb6-9a72b4f43dca",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:42:06.339841Z",
      "attachments": [
        {
          "file_id": "bb3e639c-18bf-4620-812d-065d92b0923e",
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

`GET /api/rider/v1/support/cases/bb09c5d9-2da4-4946-943b-3334b70891e9` → **200**

```json
{
  "id": "bb09c5d9-2da4-4946-943b-3334b70891e9",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:42:05.668155Z",
  "updated_at": "2026-10-27T14:42:06.340238Z",
  "messages": [
    {
      "id": "0e7b009a-be26-4349-9728-e69a9daa359a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "12cccf8a-b03e-4288-8fe7-df99ed40de7a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:42:05.669589Z",
      "attachments": [
        {
          "file_id": "0a365175-2c64-4d7b-867a-9536b5d3dc31",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "98c4f109-f2aa-4617-9cb6-9a72b4f43dca",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:42:06.339841Z",
      "attachments": [
        {
          "file_id": "bb3e639c-18bf-4620-812d-065d92b0923e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/bb09c5d9-2da4-4946-943b-3334b70891e9/attachments/bb3e639c-18bf-4620-812d-065d92b0923e` → **200**

Done: support case bb09c5d9-2da4-4946-943b-3334b70891e9, rider attachment 0a365175-2c64-4d7b-867a-9536b5d3dc31, operator attachment bb3e639c-18bf-4620-812d-065d92b0923e.

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
  "session_id": "a1c005b2-3375-4004-80b7-fa7cebef307e",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjYsImlhdCI6MTc5MzExMjEyNiwianRpIjoiMDk5ODUxYjgtNTA2Mi00ZTg5LWFhNTEtMDZjZTJhZDBhNTQwIiwic2lkIjoiYTFjMDA1YjItMzM3NS00MDA0LTgwYjctZmE3Y2ViZWYzMDdlIn0.htvaPkXH1w8o07iAURU-jCqX8Aq2AF0cn1r0UarPRV4",
  "access_expires_at": "2026-10-27T14:57:06.652671756Z",
  "refresh_token": "eZ280kV4I9zhWhCZt0AxbLX-mkoUVnbtvd4er905kd8",
  "refresh_expires_at": "2026-10-28T02:42:06.652070727Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-4750"
}
```

```json
{
  "challenge_id": "7c47db06-a8ca-4f50-9fa5-05eab85f277e",
  "expires_at": "2026-10-27T14:47:06.677303725Z",
  "resend_available_at": "2026-10-27T14:42:07.677303725Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "004535",
  "sent_at": "2026-10-27T14:42:06.680239103Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c47db06-a8ca-4f50-9fa5-05eab85f277e",
  "code": "004535",
  "device_ref": "sandbox-4750"
}
```

```json
{
  "session_id": "a0c73162-479e-47a1-895d-de4f4c7348a9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAyNiwiaWF0IjoxNzkzMTEyMTI2LCJqdGkiOiJiYTc2NWE4Zi1mMThlLTRjMzctYTViMy01ZTdhM2I0YTI5ODgiLCJzaWQiOiJhMGM3MzE2Mi00NzllLTQ3YTEtODk1ZC1kZTRmNGM3MzQ4YTkifQ.lXB2_HQYmMDrW2SpOjCYo7DmboPvKHpmQpRtgR_gMjs",
  "access_expires_at": "2026-10-27T14:57:06.732159502Z",
  "refresh_token": "T72i9BDDv7D5GVQqZlxkIKgmHjSFC63t4dMGiN-gH28",
  "refresh_expires_at": "2026-11-26T14:42:06.731660185Z",
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
  "command_id": "03eeaecd-620d-49a3-acb7-0f1015ac159e",
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
  "device_ref": "sandbox-27515"
}
```

```json
{
  "challenge_id": "7328378e-ee26-415e-9d85-ef3e7bf7683f",
  "expires_at": "2026-10-27T14:47:06.854386491Z",
  "resend_available_at": "2026-10-27T14:42:07.854386491Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "897589",
  "sent_at": "2026-10-27T14:42:06.860960944Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7328378e-ee26-415e-9d85-ef3e7bf7683f",
  "code": "897589",
  "device_ref": "sandbox-27515"
}
```

```json
{
  "session_id": "52beab8f-170b-431b-b12a-521b7a17cd1d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzAyNiwiaWF0IjoxNzkzMTEyMTI2LCJqdGkiOiIyZDRlOWJjYi00ODM0LTQ0M2MtOTk2MS01N2EyMGUxMTZjNzEiLCJzaWQiOiI1MmJlYWI4Zi0xNzBiLTQzMWItYjEyYS01MjFiN2ExN2NkMWQifQ.MD0sBNAibYqUTvLzSmCeAqLTB2IvjsGdylT5sOlfxDY",
  "access_expires_at": "2026-10-27T14:57:06.908747473Z",
  "refresh_token": "oj-7J1__njeldzf7Yf_E8lc5AWE6ae1jGvLl1Nb8fX4",
  "refresh_expires_at": "2026-11-26T14:42:06.907867643Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd8834f5-f4f8-4c16-94a0-b428f19dd36d",
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
  "last_heartbeat_at": "2026-10-27T14:42:04.820949Z",
  "last_location_at": "2026-10-27T14:42:04.820949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dd8834f5-f4f8-4c16-94a0-b428f19dd36d/handover` → **200**

```json
{
  "command_id": "7c96d4d2-a669-40fa-9fff-d600cba53410",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd8834f5-f4f8-4c16-94a0-b428f19dd36d",
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
  "last_heartbeat_at": "2026-10-27T14:42:04.820949Z",
  "last_location_at": "2026-10-27T14:42:04.820949Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dd8834f5-f4f8-4c16-94a0-b428f19dd36d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:06Z",
    "sequence": 1793112126977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dd8834f5-f4f8-4c16-94a0-b428f19dd36d",
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
  "last_heartbeat_at": "2026-10-27T14:42:06.989976Z",
  "last_location_at": "2026-10-27T14:42:06.989976Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:47.683154Z",
  "last_location_at": "2026-10-27T14:41:47.683154Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/abb813bc-494e-466c-84bf-6f53842a4a1e/handover` → **200**

```json
{
  "command_id": "065bb601-2114-4dee-ba8e-30903cb48cb1",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:41:47.683154Z",
  "last_location_at": "2026-10-27T14:41:47.683154Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/abb813bc-494e-466c-84bf-6f53842a4a1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:07Z",
    "sequence": 1793112127572
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:42:07.070123Z",
  "last_location_at": "2026-10-27T14:42:07.070123Z",
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
  "session_id": "c1551957-6792-4666-9189-c9f3e08c1d0c",
  "subject": {
    "type": "STAFF",
    "id": "7702e9c3-cb47-4ba8-b968-b95ac45ace3f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NzAyZTljMy1jYjQ3LTRiYTgtYjk2OC1iOTVhYzQ1YWNlM2YiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMwMjcsImlhdCI6MTc5MzExMjEyNywianRpIjoiOGRhMTA0ZDItNDg1Ny00YzQ5LTkzOTAtN2M5NGQ3NDc0ZWJmIiwic2lkIjoiYzE1NTE5NTctNjc5Mi00NjY2LTkxODktYzlmM2UwOGMxZDBjIn0.MVh6MleALPdOkkjTuTkU7UHYFXVqsdrF08xZn-Tc-Ek",
  "access_expires_at": "2026-10-27T14:57:07.325501416Z",
  "refresh_token": "SEdMckB4D5jlrj0YGbKtEfQ6ID0eQFZPF-j2wSxqW8Q",
  "refresh_expires_at": "2026-10-28T02:42:07.325102818Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "46f12b67-aa8e-4d7a-ab65-7c1d359b1404",
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
  "id": "8e564f0d-9b57-4c4f-8249-fedbc516a59d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:47:07.354024Z",
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
  "command_id": "31bd856a-00c2-4679-bee2-06123cc573b9",
  "quote_id": "8e564f0d-9b57-4c4f-8249-fedbc516a59d",
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
  "id": "8d1863a3-b49c-4dbd-83af-4ab60549162b",
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
  "created_at": "2026-10-27T14:42:07.386078Z",
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
    "id": "0a60838b-4df5-4534-b1e6-21037a4e4a2f",
    "order_id": "8d1863a3-b49c-4dbd-83af-4ab60549162b",
    "expires_at": "2026-10-27T14:42:22.390189Z",
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

`POST /api/driver/v1/offers/0a60838b-4df5-4534-b1e6-21037a4e4a2f/accept` → **200**

```json
{
  "command_id": "01e4b5de-74f8-4c4a-b93b-23f13ace4fcd"
}
```

```json
{
  "id": "71936e43-327c-481c-b09d-6832537c4392",
  "order_id": "8d1863a3-b49c-4dbd-83af-4ab60549162b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c8f820a8-2280-4351-bb6c-7e11154966ed",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c8f820a8-2280-4351-bb6c-7e11154966ed",
  "order_id": "8d1863a3-b49c-4dbd-83af-4ab60549162b",
  "assignment_id": "71936e43-327c-481c-b09d-6832537c4392",
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

`POST /api/driver/v1/work-sessions/abb813bc-494e-466c-84bf-6f53842a4a1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:42:07Z",
    "sequence": 1793112127499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "abb813bc-494e-466c-84bf-6f53842a4a1e",
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
  "last_heartbeat_at": "2026-10-27T14:42:07.512066Z",
  "last_location_at": "2026-10-27T14:42:07.070123Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c8f820a8-2280-4351-bb6c-7e11154966ed/arrive` → **422**

```json
{
  "command_id": "0e4ffd58-8197-42b1-a2a7-7e96d13afe13",
  "expected_version": 0
}
```

```json
{
  "instance": "/api/driver/v1/trips/c8f820a8-2280-4351-bb6c-7e11154966ed/arrive",
  "status": 422,
  "title": "Pickup too far",
  "type": "https://errors.blizz.taxi/pickup-too-far",
  "code": "PICKUP_TOO_FAR",
  "correlation_id": "b309de4f-be5f-4d24-a10e-76eb8d1f7dc7"
}
```

**Expected 200, got 422 — scenario stopped.**
