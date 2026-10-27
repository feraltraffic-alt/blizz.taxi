# Sandbox transcript (2026-10-27T14:43:55Z, 82037bd)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632062168",
  "device_ref": "sandbox-19025"
}
```

```json
{
  "challenge_id": "b05fbf25-211e-453f-9510-8c9f027825bb",
  "expires_at": "2026-10-27T14:48:55.765376565Z",
  "resend_available_at": "2026-10-27T14:43:56.765376565Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632062168` → **200**

```json
{
  "phone": "+380632062168",
  "audience": "CLIENT",
  "code": "241110",
  "sent_at": "2026-10-27T14:43:55.77806965Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b05fbf25-211e-453f-9510-8c9f027825bb",
  "code": "241110",
  "device_ref": "sandbox-19025"
}
```

```json
{
  "session_id": "0ece1d9a-7bb7-48a4-a3c6-dca106a34a49",
  "subject": {
    "type": "CLIENT",
    "id": "5638bbc6-9f8b-4daa-bb48-01395e988f53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NjM4YmJjNi05ZjhiLTRkYWEtYmI0OC0wMTM5NWU5ODhmNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTM1LCJpYXQiOjE3OTMxMTIyMzUsImp0aSI6Ijg1MWQ5OTE2LTU4ZDMtNGM3NS1hMmJiLTBlMjlhZDE1ODI0MSIsInNpZCI6IjBlY2UxZDlhLTdiYjctNDhhNC1hM2M2LWRjYTEwNmEzNGE0OSJ9.Pepom3jHcehD1SBuvXf6w8DXLCflXE22jrqobO3DdQ8",
  "access_expires_at": "2026-10-27T14:58:55.856627921Z",
  "refresh_token": "zHtQKz_rH9AYf-Qh4qHTFh6cO_Ee3YRV4JQGZ2nAMts",
  "refresh_expires_at": "2026-11-26T14:43:55.854974264Z",
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
  "device_ref": "sandbox-7933"
}
```

```json
{
  "challenge_id": "5d8b350c-f1ac-4990-839b-47bbaa60fc23",
  "expires_at": "2026-10-27T14:48:55.955160977Z",
  "resend_available_at": "2026-10-27T14:43:56.955160977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "935990",
  "sent_at": "2026-10-27T14:43:55.958073062Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5d8b350c-f1ac-4990-839b-47bbaa60fc23",
  "code": "935990",
  "device_ref": "sandbox-7933"
}
```

```json
{
  "session_id": "2716ebf1-845a-4a87-bcc2-5077ce0b08ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzEzNiwiaWF0IjoxNzkzMTEyMjM2LCJqdGkiOiIxYTkyM2YyMS1iYTRjLTQ0OGYtYTM2MC03ZDA4ZDlkZjQwZmEiLCJzaWQiOiIyNzE2ZWJmMS04NDVhLTRhODctYmNjMi01MDc3Y2UwYjA4YmEifQ.juTE2WFCPA4pA4KbwBlKWyD2DA58sBQdzi0QmXRc0kw",
  "access_expires_at": "2026-10-27T14:58:56.009357631Z",
  "refresh_token": "V8xcFO7U2STahsQ_QNS96Gwbu8fjfsJADPLiZg1UWpQ",
  "refresh_expires_at": "2026-11-26T14:43:56.00844951Z",
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
  "correlation_id": "4834a478-99a1-4c1a-82c1-569e17817757"
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
  "session_id": "c95f1317-d81c-4583-8984-8163b302dd00",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxMzYsImlhdCI6MTc5MzExMjIzNiwianRpIjoiMTE0ODE5ODMtNWYyOC00ZDUwLTk3ZTEtZTY0NTI2YTEzZTM1Iiwic2lkIjoiYzk1ZjEzMTctZDgxYy00NTgzLTg5ODQtODE2M2IzMDJkZDAwIn0.nticSvmiJD0xqwy_zi-NTPoGjwGUJO5ucDftpR5gb9U",
  "access_expires_at": "2026-10-27T14:58:56.503801571Z",
  "refresh_token": "Oz6IBitcQIZBUS63PGqE8MxxWL22GgQZKE5u42QMg8o",
  "refresh_expires_at": "2026-10-28T02:43:56.503186949Z",
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
  "session_id": "d31462e2-acc4-4836-bdb9-513384aba7a9",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxMzcsImlhdCI6MTc5MzExMjIzNywianRpIjoiNDNjZTMzYTctZTRmMS00ODQ2LTlhMGItMGQzM2JkMzE0ODQ5Iiwic2lkIjoiZDMxNDYyZTItYWNjNC00ODM2LWJkYjktNTEzMzg0YWJhN2E5In0.efzTA58uYrHXT0jiEW6w4KV2WS4ElKaW3FxHy-FkvM4",
  "access_expires_at": "2026-10-27T14:58:57.365425477Z",
  "refresh_token": "fEZ9POsfS0KLTpEltJwzUupuWQt0KwHSTRDon_cVcCI",
  "refresh_expires_at": "2026-10-28T02:43:57.364604917Z",
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
  "session_id": "518389aa-ca61-4f52-9fd1-25ad8f5c57dd",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxMzcsImlhdCI6MTc5MzExMjIzNywianRpIjoiNDgwMDU2ZjQtYjVjYy00ZjE5LWJkNWYtYjNhOTgwYzEwMGIwIiwic2lkIjoiNTE4Mzg5YWEtY2E2MS00ZjUyLTlmZDEtMjVhZDhmNWM1N2RkIn0.Z0jSCRTF4X_ThZskLq4n30Pqv5mm3M-wsxeJcFENsH4",
  "access_expires_at": "2026-10-27T14:58:57.594276807Z",
  "refresh_token": "_CcDdCo_SjIOnC6FfsV0HFi1WbX5qG8K1vWpqxF78Po",
  "refresh_expires_at": "2026-10-28T02:43:57.593464665Z",
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
  "command_id": "fa37c799-d7c3-4c21-bf61-5564cf4388c6",
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
  "id": "28c389aa-7b90-4c1c-a10e-1b81bce029b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:48:57.727269Z",
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
  "command_id": "02a3f5d4-3727-4d82-af80-bac1eeab84a1",
  "quote_id": "28c389aa-7b90-4c1c-a10e-1b81bce029b1",
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
  "id": "9b49bb01-430f-408f-8f4f-d350ac4ffb84",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5638bbc6-9f8b-4daa-bb48-01395e988f53",
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
  "created_at": "2026-10-27T14:43:57.804589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/9b49bb01-430f-408f-8f4f-d350ac4ffb84` → **200**

```json
{
  "id": "9b49bb01-430f-408f-8f4f-d350ac4ffb84",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5638bbc6-9f8b-4daa-bb48-01395e988f53",
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
  "created_at": "2026-10-27T14:43:57.804589Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/9b49bb01-430f-408f-8f4f-d350ac4ffb84/cancel` → **200**

```json
{
  "command_id": "ffd44ac6-b0af-4526-a38e-7a42e8baca18",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "9b49bb01-430f-408f-8f4f-d350ac4ffb84",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5638bbc6-9f8b-4daa-bb48-01395e988f53",
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
  "created_at": "2026-10-27T14:43:57.804589Z",
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
  "command_id": "80601ae9-afed-40ca-b62e-35dae5721e95",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:43:57Z",
    "sequence": 1793112237978
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b11bdd3f-ab4c-4700-9cad-6ff52006ed06",
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
  "last_heartbeat_at": "2026-10-27T14:43:58.017827Z",
  "last_location_at": "2026-10-27T14:43:58.017827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8561"
}
```

```json
{
  "challenge_id": "8e1956fb-edb3-44ac-ae94-2321a0579d09",
  "expires_at": "2026-10-27T14:48:58.057064164Z",
  "resend_available_at": "2026-10-27T14:43:59.057064164Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "421353",
  "sent_at": "2026-10-27T14:43:58.060423657Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e1956fb-edb3-44ac-ae94-2321a0579d09",
  "code": "421353",
  "device_ref": "sandbox-8561"
}
```

```json
{
  "session_id": "1cf4cdea-4d5b-4bd6-aba2-c0e79803870f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzEzOCwiaWF0IjoxNzkzMTEyMjM4LCJqdGkiOiJiMGYzYzA4NC0zMWM1LTRhMGUtYmZiMy01Njk5NjgzZTZlNTAiLCJzaWQiOiIxY2Y0Y2RlYS00ZDViLTRiZDYtYWJhMi1jMGU3OTgwMzg3MGYifQ.wER0JNYqL87p4ZaPIGgCPJolaxil4KSnrRYauXugWzM",
  "access_expires_at": "2026-10-27T14:58:58.112909319Z",
  "refresh_token": "n0Oa-JmgSW4GYCzkNi62wSwroxIRlhBwjajv5g8Wa6c",
  "refresh_expires_at": "2026-11-26T14:43:58.112258597Z",
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
  "command_id": "2a339bad-fddc-4f36-8dc3-4ffdd38a9d24",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:43:58Z",
    "sequence": 1793112238159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:43:58.176825Z",
  "last_location_at": "2026-10-27T14:43:58.176825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "77ca0fb4-e5bb-4561-bcd4-8ca90a1b4943",
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
  "id": "d951fba0-6a1a-4273-8c7f-35c51abb3094",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T14:48:58.213906Z",
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
  "command_id": "488788cf-5000-4c28-afe3-43485c2bdf23",
  "quote_id": "d951fba0-6a1a-4273-8c7f-35c51abb3094",
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
  "id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5638bbc6-9f8b-4daa-bb48-01395e988f53",
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
  "created_at": "2026-10-27T14:43:58.248492Z",
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
    "id": "1fd1ea80-bea8-4bba-9b7d-f352e338d1f6",
    "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
    "expires_at": "2026-10-27T14:44:13.252336Z",
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

`POST /api/driver/v1/offers/1fd1ea80-bea8-4bba-9b7d-f352e338d1f6/accept` → **200**

```json
{
  "command_id": "7a4b5cb1-f75b-49ec-bb06-305f8bc088c2"
}
```

```json
{
  "id": "d8e041ed-bad1-45a0-be08-2563912c8e61",
  "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c399dd5-bae0-45f4-9fd7-003a1e248740",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c399dd5-bae0-45f4-9fd7-003a1e248740",
  "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "assignment_id": "d8e041ed-bad1-45a0-be08-2563912c8e61",
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

`POST /api/driver/v1/trips/6c399dd5-bae0-45f4-9fd7-003a1e248740/cancel` → **200**

```json
{
  "command_id": "510dccc9-3a3c-445f-906b-a0cfcceb63c0",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "6c399dd5-bae0-45f4-9fd7-003a1e248740",
  "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "assignment_id": "d8e041ed-bad1-45a0-be08-2563912c8e61",
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

`GET /api/rider/v1/orders/2dfacb4b-ce2f-4f76-8b4b-328504baeb79` → **200**

```json
{
  "id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5638bbc6-9f8b-4daa-bb48-01395e988f53",
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
    "id": "d8e041ed-bad1-45a0-be08-2563912c8e61",
    "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6c399dd5-bae0-45f4-9fd7-003a1e248740",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T14:43:58.248492Z",
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
    "id": "cf6679b8-ca18-4667-95ae-fd13f5394b4b",
    "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
    "expires_at": "2026-10-27T14:44:13.518986Z",
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

`POST /api/driver/v1/offers/cf6679b8-ca18-4667-95ae-fd13f5394b4b/accept` → **200**

```json
{
  "command_id": "782670ee-de03-4320-9155-c32af3e88e7b"
}
```

```json
{
  "id": "c550c58b-2f36-44d1-82c1-bbcde3766ee3",
  "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9f535701-98c7-4950-9192-921212b969b8",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9f535701-98c7-4950-9192-921212b969b8",
  "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "assignment_id": "c550c58b-2f36-44d1-82c1-bbcde3766ee3",
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

`POST /api/driver/v1/trips/9f535701-98c7-4950-9192-921212b969b8/cancel` → **200**

```json
{
  "command_id": "68f9701c-86c2-4ce7-b9c8-42c6bc8c05f9",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "9f535701-98c7-4950-9192-921212b969b8",
  "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
  "assignment_id": "c550c58b-2f36-44d1-82c1-bbcde3766ee3",
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
    "id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:43:58.248492Z",
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
    "id": "9b49bb01-430f-408f-8f4f-d350ac4ffb84",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:43:57.804589Z",
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

`GET /api/operator/v1/orders/2dfacb4b-ce2f-4f76-8b4b-328504baeb79/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:43:58.249125Z",
      "actor": {
        "type": "CLIENT",
        "id": "5638bbc6-9f8b-4daa-bb48-01395e988f53",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
        "quote_id": "d951fba0-6a1a-4273-8c7f-35c51abb3094",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:43:58.251111Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
        "attempt_id": "7fdb73e8-f62c-4673-9a0c-e59287114eda",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:43:58.257086Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1fd1ea80-bea8-4bba-9b7d-f352e338d1f6",
        "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:43:58.326695Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1fd1ea80-bea8-4bba-9b7d-f352e338d1f6",
        "order_id": "2dfacb4b-ce2f-4f76-8b4b-328504baeb79",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d8e041ed-bad1-45a0-be08-2563912c8e61"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 9b49bb01-430f-408f-8f4f-d350ac4ffb84, 2dfacb4b-ce2f-4f76-8b4b-328504baeb79.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732208712",
  "device_ref": "sandbox-30436"
}
```

```json
{
  "challenge_id": "d639df94-bb2d-4e5f-8cc0-099ee414bd4b",
  "expires_at": "2026-10-27T14:48:59.115505161Z",
  "resend_available_at": "2026-10-27T14:44:00.115505161Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732208712` → **200**

```json
{
  "phone": "+380732208712",
  "audience": "CLIENT",
  "code": "897274",
  "sent_at": "2026-10-27T14:43:59.153435035Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d639df94-bb2d-4e5f-8cc0-099ee414bd4b",
  "code": "897274",
  "device_ref": "sandbox-30436"
}
```

```json
{
  "session_id": "ab34d057-e2a1-4ce7-bdfe-0d972ed264c3",
  "subject": {
    "type": "CLIENT",
    "id": "10e01be1-8888-4250-a207-80539f04c460"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMGUwMWJlMS04ODg4LTQyNTAtYTIwNy04MDUzOWYwNGM0NjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTM5LCJpYXQiOjE3OTMxMTIyMzksImp0aSI6IjllYzdlNzk2LTUxMDgtNDE4Ni1hZjNmLTRmNTg3NDEzODkzNSIsInNpZCI6ImFiMzRkMDU3LWUyYTEtNGNlNy1iZGZlLTBkOTcyZWQyNjRjMyJ9.s4acUpUzxMIfX2b-RQjAwswyoxcXYDzG2ByvQm0ZWTI",
  "access_expires_at": "2026-10-27T14:58:59.204071145Z",
  "refresh_token": "HBrdkSlZp8kbkGjvF14E1HZLTWnX-d1Ix8BhBI_14zo",
  "refresh_expires_at": "2026-11-26T14:43:59.203436811Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b6b73061-bcdf-48f2-a741-049d94418b09",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "515c7642-b7a6-4460-b706-04fe0aaa1111",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-515c7642-b7a6-4460-b706-04fe0aaa1111",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3e38dae0eabb8c5592ecb1ba1c299a68",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=515c7642-b7a6-4460-b706-04fe0aaa1111",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732208712"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=515c7642-b7a6-4460-b706-04fe0aaa1111",
  "expires_at": "2026-10-27T15:13:59.237866Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/515c7642-b7a6-4460-b706-04fe0aaa1111` → **200**

```json
{
  "id": "515c7642-b7a6-4460-b706-04fe0aaa1111",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T15:13:59.237866Z",
  "card": {
    "id": "8054c6e5-1806-4bae-b8b6-c0e97a3e3565",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3565",
    "card_type": "Visa",
    "created_at": "2026-10-27T14:43:59.279971Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "8054c6e5-1806-4bae-b8b6-c0e97a3e3565",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3565",
      "card_type": "Visa",
      "created_at": "2026-10-27T14:43:59.279971Z"
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
  "device_ref": "sandbox-22388"
}
```

```json
{
  "challenge_id": "1fd36904-3b0c-4d99-b5e2-84c34e59740a",
  "expires_at": "2026-10-27T14:48:59.349280699Z",
  "resend_available_at": "2026-10-27T14:44:00.349280699Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "570529",
  "sent_at": "2026-10-27T14:43:59.352303275Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1fd36904-3b0c-4d99-b5e2-84c34e59740a",
  "code": "570529",
  "device_ref": "sandbox-22388"
}
```

```json
{
  "session_id": "acc7ba37-c143-48f1-b7eb-741912dfef9f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzEzOSwiaWF0IjoxNzkzMTEyMjM5LCJqdGkiOiI1MGZmYWQ1Mi05MGExLTQ3ZTItOTE2ZC1jMTQ4NTg2YTk3MjMiLCJzaWQiOiJhY2M3YmEzNy1jMTQzLTQ4ZjEtYjdlYi03NDE5MTJkZmVmOWYifQ.dgJg5XpJEV0B90f2UaWz-wg-iu5j2quUGgTsIrbseg4",
  "access_expires_at": "2026-10-27T14:58:59.40209919Z",
  "refresh_token": "uG0uvdnh0x9UVMFoRhXUME3uUfT95FDLIYKzvoDaP5c",
  "refresh_expires_at": "2026-11-26T14:43:59.401486836Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:43:58.176825Z",
  "last_location_at": "2026-10-27T14:43:58.176825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12a67e37-afb0-433d-9d9c-28b1ce4fe38f/handover` → **200**

```json
{
  "command_id": "3d4a9045-4215-46b4-801e-186ebc5bcf2c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:43:58.176825Z",
  "last_location_at": "2026-10-27T14:43:58.176825Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/12a67e37-afb0-433d-9d9c-28b1ce4fe38f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:43:59Z",
    "sequence": 1793112239487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:43:59.507778Z",
  "last_location_at": "2026-10-27T14:43:59.507778Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "81aed6fc-0190-4f85-88a3-b6eea4a9a6e3",
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
  "id": "3daedbdc-7a94-4e28-a972-5a153cd92b97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T14:48:59.541512Z",
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
  "command_id": "a8ec81bb-18bf-4a73-8d6a-19335b92428f",
  "quote_id": "3daedbdc-7a94-4e28-a972-5a153cd92b97",
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
  "id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "10e01be1-8888-4250-a207-80539f04c460",
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
  "created_at": "2026-10-27T14:43:59.576103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/9902bfa1-fb4f-4856-a15a-3f1fe609a659` → **200**

```json
{
  "id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "10e01be1-8888-4250-a207-80539f04c460",
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
  "created_at": "2026-10-27T14:43:59.576103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/9902bfa1-fb4f-4856-a15a-3f1fe609a659` → **200**

```json
{
  "id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "10e01be1-8888-4250-a207-80539f04c460",
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
  "created_at": "2026-10-27T14:43:59.576103Z",
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
    "id": "e908232a-b893-4a68-beae-0c0751507aa3",
    "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
    "expires_at": "2026-10-27T14:44:15.10915Z",
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

`POST /api/driver/v1/offers/e908232a-b893-4a68-beae-0c0751507aa3/accept` → **200**

```json
{
  "command_id": "f51dd8d2-fadf-4eb6-a93a-50195a6ffdc1"
}
```

```json
{
  "id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
  "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
  "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "assignment_id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
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

`POST /api/driver/v1/work-sessions/12a67e37-afb0-433d-9d9c-28b1ce4fe38f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:00Z",
    "sequence": 1793112240730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:44:00.74746Z",
  "last_location_at": "2026-10-27T14:44:00.74746Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161/arrive` → **200**

```json
{
  "command_id": "92d88d8c-82ce-44cc-b356-c75201079b9f",
  "expected_version": 0
}
```

```json
{
  "id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
  "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "assignment_id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
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
  "arrived_at": "2026-10-27T14:44:00.785043Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161/start` → **200**

```json
{
  "command_id": "1f1fe3ef-da2e-425f-ac07-cc432da23cca",
  "expected_version": 1
}
```

```json
{
  "id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
  "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "assignment_id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
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
  "arrived_at": "2026-10-27T14:44:00.785043Z",
  "started_at": "2026-10-27T14:44:00.82309Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161/complete` → **200**

```json
{
  "command_id": "f6e08999-01fd-4be7-a761-3947526f0bff",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:44:00Z"
}
```

```json
{
  "id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
  "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "assignment_id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
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
  "arrived_at": "2026-10-27T14:44:00.785043Z",
  "started_at": "2026-10-27T14:44:00.82309Z",
  "completed_at": "2026-10-27T14:44:00.868348Z",
  "needs_review": false
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/9902bfa1-fb4f-4856-a15a-3f1fe609a659` → **200**

```json
{
  "id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "10e01be1-8888-4250-a207-80539f04c460",
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
    "id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
    "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:43:59.576103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/9902bfa1-fb4f-4856-a15a-3f1fe609a659` → **200**

```json
{
  "id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "10e01be1-8888-4250-a207-80539f04c460",
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
    "id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
    "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:43:59.576103Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/9902bfa1-fb4f-4856-a15a-3f1fe609a659` → **200**

```json
{
  "id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "10e01be1-8888-4250-a207-80539f04c460",
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
    "id": "d65c777a-6b40-4541-b9f9-72d40d9bb0c3",
    "order_id": "9902bfa1-fb4f-4856-a15a-3f1fe609a659",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b6c9ceb1-8de4-4e1c-adb9-90e0fc4ad161",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:43:59.576103Z",
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

Done: card order 9902bfa1-fb4f-4856-a15a-3f1fe609a659.

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
  "device_ref": "sandbox-12541"
}
```

```json
{
  "challenge_id": "e0b7c8b8-3609-432d-b76f-138ff2ab0870",
  "expires_at": "2026-10-27T14:49:03.054003934Z",
  "resend_available_at": "2026-10-27T14:44:04.054003934Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "730502",
  "sent_at": "2026-10-27T14:44:03.056456525Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0b7c8b8-3609-432d-b76f-138ff2ab0870",
  "code": "730502",
  "device_ref": "sandbox-12541"
}
```

```json
{
  "session_id": "612ef60b-1cc8-49cf-8ff3-e49cd761f873",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE0MywiaWF0IjoxNzkzMTEyMjQzLCJqdGkiOiJhYWIxYzc4Yy05ZTFlLTRkOWMtOWM1Zi1jMjk2Njg1NmQ1ZWQiLCJzaWQiOiI2MTJlZjYwYi0xY2M4LTQ5Y2YtOGZmMy1lNDljZDc2MWY4NzMifQ.uB5FkIwJ_s-kRM74404opn66Qs5QLi7ful7djDMvbig",
  "access_expires_at": "2026-10-27T14:59:03.108633751Z",
  "refresh_token": "mk01gat7LMPBqJBauvRgXn3Aiw5yar8ssA4MJjYRsXw",
  "refresh_expires_at": "2026-11-26T14:44:03.10801243Z",
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
  "command_id": "9990a227-a88b-4460-b87e-3dc1cddc7205",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:03Z",
    "sequence": 1793112243160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:03.176981Z",
  "last_location_at": "2026-10-27T14:44:03.176981Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672473193",
  "device_ref": "sandbox-29291"
}
```

```json
{
  "challenge_id": "9605dd02-5063-4742-b472-48a25c056c49",
  "expires_at": "2026-10-27T14:49:03.206341335Z",
  "resend_available_at": "2026-10-27T14:44:04.206341335Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672473193` → **200**

```json
{
  "phone": "+380672473193",
  "audience": "CLIENT",
  "code": "102637",
  "sent_at": "2026-10-27T14:44:03.209809169Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9605dd02-5063-4742-b472-48a25c056c49",
  "code": "102637",
  "device_ref": "sandbox-29291"
}
```

```json
{
  "session_id": "48de633d-ef0c-4c3e-91c3-72adc2294f9d",
  "subject": {
    "type": "CLIENT",
    "id": "fb6806b1-5925-4095-a026-a3e0550a1680"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjY4MDZiMS01OTI1LTQwOTUtYTAyNi1hM2UwNTUwYTE2ODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTQzLCJpYXQiOjE3OTMxMTIyNDMsImp0aSI6IjczZWY0Mzk3LWZlZGYtNDE4Ny1iZjgxLWM1ZGJlNTIzNGJiNyIsInNpZCI6IjQ4ZGU2MzNkLWVmMGMtNGMzZS05MWMzLTcyYWRjMjI5NGY5ZCJ9.fsXDJOnL9ixMTbqJuHjHqti1-UF4hmlbXOUa-wi0t2o",
  "access_expires_at": "2026-10-27T14:59:03.266165844Z",
  "refresh_token": "iWoVqC8CrvUmfP8luHp7HHWwFxhNIE3p70ISXyil680",
  "refresh_expires_at": "2026-11-26T14:44:03.265533255Z",
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
  "command_id": "19fe3989-e2cd-4abb-8412-350a63f92737",
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
  "id": "4f8a1fdf-2582-4679-9514-56af53f35682",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:49:03.325275Z",
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
  "command_id": "d617fd2b-8307-46b7-8430-baca33b9c3b1",
  "quote_id": "4f8a1fdf-2582-4679-9514-56af53f35682",
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
  "id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fb6806b1-5925-4095-a026-a3e0550a1680",
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
  "created_at": "2026-10-27T14:44:03.360555Z",
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
    "id": "7e96ee44-15f8-45a2-bf0c-ee814918f5f8",
    "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
    "expires_at": "2026-10-27T14:44:18.363635Z",
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

`POST /api/driver/v1/offers/7e96ee44-15f8-45a2-bf0c-ee814918f5f8/accept` → **200**

```json
{
  "command_id": "f3c00f10-14f6-4b6a-9a75-e97033ddb862"
}
```

```json
{
  "id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/89acfb46-a2d6-4856-9de4-a8aaf91d3428/messages` → **201**

```json
{
  "command_id": "8cd066ad-c0ab-4a1a-99cc-1ce188c298a5",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "300f398f-bd86-47c5-b2f1-ee9468f487ba",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T14:44:03.460397385Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "assignment_id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
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

`POST /api/driver/v1/trips/a633e405-5b98-44cc-ab77-65bc5d02898a/messages` → **201**

```json
{
  "command_id": "b614bd7a-cbd8-4b94-94d9-03fb536e1923",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "be8cd709-a09a-4ddb-8adb-058e4faff7ca",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T14:44:03.508501316Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/89acfb46-a2d6-4856-9de4-a8aaf91d3428/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a633e405-5b98-44cc-ab77-65bc5d02898a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672473193"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:03Z",
    "sequence": 1793112243589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:03.6067Z",
  "last_location_at": "2026-10-27T14:44:03.6067Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "assignment_id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
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

`POST /api/driver/v1/trips/a633e405-5b98-44cc-ab77-65bc5d02898a/arrive` → **200**

```json
{
  "command_id": "ec048de9-9c60-4c48-a473-5139e68606c3",
  "expected_version": 0
}
```

```json
{
  "id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "assignment_id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
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
  "arrived_at": "2026-10-27T14:44:03.655445Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/a633e405-5b98-44cc-ab77-65bc5d02898a/start` → **200**

```json
{
  "command_id": "d99dfaf9-97f5-4f93-8455-c3e7562fe63a",
  "expected_version": 1
}
```

```json
{
  "id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "assignment_id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
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
  "arrived_at": "2026-10-27T14:44:03.655445Z",
  "started_at": "2026-10-27T14:44:03.687016Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:03Z",
    "sequence": 1793112243707
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:03.723811Z",
  "last_location_at": "2026-10-27T14:44:03.723811Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a633e405-5b98-44cc-ab77-65bc5d02898a/complete` → **200**

```json
{
  "command_id": "6e629cf5-7b01-44ad-a7b6-4b757a7adbc6",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:44:03Z",
  "cash_received": true
}
```

```json
{
  "id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
  "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "assignment_id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
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
  "arrived_at": "2026-10-27T14:44:03.655445Z",
  "started_at": "2026-10-27T14:44:03.687016Z",
  "completed_at": "2026-10-27T14:44:03.75619Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/89acfb46-a2d6-4856-9de4-a8aaf91d3428` → **200**

```json
{
  "id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "fb6806b1-5925-4095-a026-a3e0550a1680",
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
    "id": "73ab4ed2-53b0-459a-843c-c1cef5b37467",
    "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:44:03.360555Z",
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
    "id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
    "short_number": 4,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:44:03.360555Z",
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
    "id": "a633e405-5b98-44cc-ab77-65bc5d02898a",
    "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
    "order_short_number": 4,
    "created_at": "2026-10-27T14:44:03.421096Z",
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
  "session_id": "ebe70702-505f-45bc-be41-5404b6d94ec1",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNDcsImlhdCI6MTc5MzExMjI0NywianRpIjoiMzQ4MGVmN2YtNWI2OC00ZGIyLTlkOTAtNDE3ZDY4ZjViODJhIiwic2lkIjoiZWJlNzA3MDItNTA1Zi00NWJjLWJlNDEtNTQwNGI2ZDk0ZWMxIn0.ylg9LesnP34FOn-j6OGpsXX_v5hjWL11eP7SQUE0zOk",
  "access_expires_at": "2026-10-27T14:59:07.096659521Z",
  "refresh_token": "ENTT56LNwMLR1xDrlp8kdVe4B-RBdSp2GV-PvakAHKI",
  "refresh_expires_at": "2026-10-28T02:44:07.096190384Z",
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
  "session_id": "63772543-7c49-4420-bf6a-10fd2ee9dbe4",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNDcsImlhdCI6MTc5MzExMjI0NywianRpIjoiMDNkYmIzNWYtNzI5Ny00MTliLWI1MWEtZGU4YmFmOTZiMmZhIiwic2lkIjoiNjM3NzI1NDMtN2M0OS00NDIwLWJmNmEtMTBmZDJlZTlkYmU0In0.KuYCbwaA2wHtxS8cljO8--U0MWhYdWcKRocqOcuAmug",
  "access_expires_at": "2026-10-27T14:59:07.323685726Z",
  "refresh_token": "MfJPSkH_WvR-cJALItUNY9g8_ec81eb5zbRbooQbJ_k",
  "refresh_expires_at": "2026-10-28T02:44:07.323334978Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/89acfb46-a2d6-4856-9de4-a8aaf91d3428/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:44:03.361204Z",
      "actor": {
        "type": "CLIENT",
        "id": "fb6806b1-5925-4095-a026-a3e0550a1680",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
        "quote_id": "4f8a1fdf-2582-4679-9514-56af53f35682",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:44:03.362782Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
        "attempt_id": "97cee368-86f0-4581-89ef-f57f0ceca158",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:44:03.367396Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7e96ee44-15f8-45a2-bf0c-ee814918f5f8",
        "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:44:03.42227Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7e96ee44-15f8-45a2-bf0c-ee814918f5f8",
        "order_id": "89acfb46-a2d6-4856-9de4-a8aaf91d3428",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "73ab4ed2-53b0-459a-843c-c1cef5b37467"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 89acfb46-a2d6-4856-9de4-a8aaf91d3428.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16674"
}
```

```json
{
  "challenge_id": "f555c402-0eef-4d50-aaa0-466033f585eb",
  "expires_at": "2026-10-27T14:49:07.380101651Z",
  "resend_available_at": "2026-10-27T14:44:08.380101651Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "113971",
  "sent_at": "2026-10-27T14:44:07.382440096Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f555c402-0eef-4d50-aaa0-466033f585eb",
  "code": "113971",
  "device_ref": "sandbox-16674"
}
```

```json
{
  "session_id": "979bb53a-dd02-47f5-ba74-020055c06396",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE0NywiaWF0IjoxNzkzMTEyMjQ3LCJqdGkiOiJhYWExM2RmYy1mODhhLTRlNGYtYTNhMy1iN2ZiZDM0NTZjMjEiLCJzaWQiOiI5NzliYjUzYS1kZDAyLTQ3ZjUtYmE3NC0wMjAwNTVjMDYzOTYifQ.XB4Mqy2VedmCifD7BSPO8rd3rTkTh3EWxEgaQ54l5xA",
  "access_expires_at": "2026-10-27T14:59:07.431249632Z",
  "refresh_token": "ltTyIBJMU8xbtZiZXMDgJnOyH8J21XxYBqQ_VAijhMg",
  "refresh_expires_at": "2026-11-26T14:44:07.43082388Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:03.723811Z",
  "last_location_at": "2026-10-27T14:44:03.723811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/handover` → **200**

```json
{
  "command_id": "bf7074b5-bd72-4275-8a26-59bdd3ebb2ab",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:03.723811Z",
  "last_location_at": "2026-10-27T14:44:03.723811Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:07Z",
    "sequence": 1793112247512
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:07.528106Z",
  "last_location_at": "2026-10-27T14:44:07.528106Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669744290",
  "device_ref": "sandbox-8896"
}
```

```json
{
  "challenge_id": "2315ab47-907e-4ad2-a589-d148da063b3c",
  "expires_at": "2026-10-27T14:49:07.549844087Z",
  "resend_available_at": "2026-10-27T14:44:08.549844087Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669744290` → **200**

```json
{
  "phone": "+380669744290",
  "audience": "CLIENT",
  "code": "497984",
  "sent_at": "2026-10-27T14:44:07.552009075Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2315ab47-907e-4ad2-a589-d148da063b3c",
  "code": "497984",
  "device_ref": "sandbox-8896"
}
```

```json
{
  "session_id": "195e7a3a-dea7-4a87-a37d-ca8892c43e65",
  "subject": {
    "type": "CLIENT",
    "id": "6e87319d-7065-4b2f-b8c6-b76980a0c882"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTg3MzE5ZC03MDY1LTRiMmYtYjhjNi1iNzY5ODBhMGM4ODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTQ3LCJpYXQiOjE3OTMxMTIyNDcsImp0aSI6ImE0MGNiMWQ5LTRiZjAtNDY4ZS05NWJiLTI0ODYyYjU1MjliYiIsInNpZCI6IjE5NWU3YTNhLWRlYTctNGE4Ny1hMzdkLWNhODg5MmM0M2U2NSJ9.XP8tdyPfnAdW0B11khmUQS2-nxXetyfh6p9Fm6uJqAU",
  "access_expires_at": "2026-10-27T14:59:07.600295227Z",
  "refresh_token": "Ob5mizm2MZOCjwEo_0Cd68IegjZWm_CL9LXduSWv0MM",
  "refresh_expires_at": "2026-11-26T14:44:07.599916386Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "86bb8e2b-ee82-4466-a394-056f5864a16d",
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
  "id": "14c27e63-85b0-4236-b538-dc8ecb2a1540",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T14:49:07.631640Z",
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
  "command_id": "b9e09253-3e25-443c-a656-0ebd21dc0207",
  "quote_id": "14c27e63-85b0-4236-b538-dc8ecb2a1540",
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
  "id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e87319d-7065-4b2f-b8c6-b76980a0c882",
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
  "created_at": "2026-10-27T14:44:07.663829Z",
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
    "id": "9e65d1b0-9b27-45e3-a5f9-70751ed96712",
    "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
    "expires_at": "2026-10-27T14:44:22.666412Z",
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

`POST /api/driver/v1/offers/9e65d1b0-9b27-45e3-a5f9-70751ed96712/accept` → **200**

```json
{
  "command_id": "5318d4dc-5487-44fd-ae67-94bcdd254cd5"
}
```

```json
{
  "id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520",
  "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7ca0474b-58aa-438c-91a4-b1bca160c920",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7ca0474b-58aa-438c-91a4-b1bca160c920",
  "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
  "assignment_id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520",
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

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:07Z",
    "sequence": 1793112247754
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:07.770187Z",
  "last_location_at": "2026-10-27T14:44:07.770187Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7ca0474b-58aa-438c-91a4-b1bca160c920/arrive` → **200**

```json
{
  "command_id": "02d30bc0-aca1-4900-bbaa-66a392bb83bd",
  "expected_version": 0
}
```

```json
{
  "id": "7ca0474b-58aa-438c-91a4-b1bca160c920",
  "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
  "assignment_id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520",
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
  "arrived_at": "2026-10-27T14:44:07.801803Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/7ca0474b-58aa-438c-91a4-b1bca160c920/start` → **200**

```json
{
  "command_id": "f2b4e194-0d55-4231-aaf3-d9a82021fe7a",
  "expected_version": 1
}
```

```json
{
  "id": "7ca0474b-58aa-438c-91a4-b1bca160c920",
  "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
  "assignment_id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520",
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
  "arrived_at": "2026-10-27T14:44:07.801803Z",
  "started_at": "2026-10-27T14:44:07.835756Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:07Z",
    "sequence": 1793112247858
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:07.874963Z",
  "last_location_at": "2026-10-27T14:44:07.874963Z",
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
  "device_ref": "sandbox-27031"
}
```

```json
{
  "challenge_id": "9dc39764-5f32-459d-a33e-a66007647ec7",
  "expires_at": "2026-10-27T14:49:07.8958169Z",
  "resend_available_at": "2026-10-27T14:44:08.8958169Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "003255",
  "sent_at": "2026-10-27T14:44:07.906375195Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9dc39764-5f32-459d-a33e-a66007647ec7",
  "code": "003255",
  "device_ref": "sandbox-27031"
}
```

```json
{
  "session_id": "da74e8ed-a527-4f7f-b031-f673c7dbc2b3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE0NywiaWF0IjoxNzkzMTEyMjQ3LCJqdGkiOiIxZGUzMDFlOC0wZGFmLTQ1ZWYtYWFlNC1kZjRiZjYzZjRiMWEiLCJzaWQiOiJkYTc0ZThlZC1hNTI3LTRmN2YtYjAzMS1mNjczYzdkYmMyYjMifQ.PATO3zA-bceAolx0RPDe_jdl0eni7awJ69Umjodi1Uw",
  "access_expires_at": "2026-10-27T14:59:07.954402972Z",
  "refresh_token": "6k5xQTLcSWMduWPjAZLw-aYPd5e-AK4TMxP01SRpCQc",
  "refresh_expires_at": "2026-11-26T14:44:07.953950309Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b11bdd3f-ab4c-4700-9cad-6ff52006ed06",
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
  "last_heartbeat_at": "2026-10-27T14:43:58.017827Z",
  "last_location_at": "2026-10-27T14:43:58.017827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b11bdd3f-ab4c-4700-9cad-6ff52006ed06/handover` → **200**

```json
{
  "command_id": "93e2e755-db3e-48d3-9619-98ba97588fe6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b11bdd3f-ab4c-4700-9cad-6ff52006ed06",
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
  "last_heartbeat_at": "2026-10-27T14:43:58.017827Z",
  "last_location_at": "2026-10-27T14:43:58.017827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b11bdd3f-ab4c-4700-9cad-6ff52006ed06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:08Z",
    "sequence": 1793112248348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b11bdd3f-ab4c-4700-9cad-6ff52006ed06",
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
  "last_heartbeat_at": "2026-10-27T14:44:08.05328Z",
  "last_location_at": "2026-10-27T14:44:08.05328Z",
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
  "session_id": "639ab9d5-d1f4-47b9-9166-f141c0281fe5",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNDgsImlhdCI6MTc5MzExMjI0OCwianRpIjoiYzE5YWM3YjYtMzlmZC00ZDgyLTljZjAtNzkzMWEwMWQwNmMxIiwic2lkIjoiNjM5YWI5ZDUtZDFmNC00N2I5LTkxNjYtZjE0MWMwMjgxZmU1In0.kFZQzvKKdQ8lHeAPzPakcQ48koHVMJkyqoVL9hFgiHE",
  "access_expires_at": "2026-10-27T14:59:08.28738842Z",
  "refresh_token": "j8lG65hJunClDLiZWv5tlxy821JlVaEPCL_IhmywI_s",
  "refresh_expires_at": "2026-10-28T02:44:08.286967846Z",
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
  "session_id": "bded2052-054e-4e8f-ab8b-77f73d069d7b",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNDgsImlhdCI6MTc5MzExMjI0OCwianRpIjoiNzAwYjIxMmYtYjg0My00Njk3LTk2YjAtMGM5ZmY3OWFiNWQwIiwic2lkIjoiYmRlZDIwNTItMDU0ZS00ZThmLWFiOGItNzdmNzNkMDY5ZDdiIn0.VMoBaAWLPkh3YVMfg8UOS0GPLN95XUXRIY0CjbvSzkg",
  "access_expires_at": "2026-10-27T14:59:08.520680327Z",
  "refresh_token": "Jp0CNRgoVNEpsPT78_BDrHCDLgSjz3m5zOWiu9-RWKs",
  "refresh_expires_at": "2026-10-28T02:44:08.520106934Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f810c194-7dfe-4bb4-90d9-d3a73d7e370f` → **200**

```json
{
  "id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
  "short_number": 5,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6e87319d-7065-4b2f-b8c6-b76980a0c882",
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
    "id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520",
    "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "7ca0474b-58aa-438c-91a4-b1bca160c920",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T14:44:07.663829Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f810c194-7dfe-4bb4-90d9-d3a73d7e370f/interrupt` → **200**

```json
{
  "command_id": "c4028d19-12e3-45a7-9923-c9dc232cb959",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
    "short_number": 5,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "6e87319d-7065-4b2f-b8c6-b76980a0c882",
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
      "id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520",
      "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "7ca0474b-58aa-438c-91a4-b1bca160c920",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T14:44:07.663829Z",
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
    "id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
    "short_number": 6,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "6e87319d-7065-4b2f-b8c6-b76980a0c882",
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
    "id": "da692a82-100c-4da7-9dbd-7347580bf75f",
    "order_id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
    "expires_at": "2026-10-27T14:44:23.603027Z",
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

`POST /api/driver/v1/offers/da692a82-100c-4da7-9dbd-7347580bf75f/accept` → **200**

```json
{
  "command_id": "a1a61d57-a338-4113-b99e-7e510d6ef8c7"
}
```

```json
{
  "id": "050ddc4d-b565-4106-87d8-9293ef5c74c2",
  "order_id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1d0af90b-033f-485f-8c87-1915a71d4bd7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1d0af90b-033f-485f-8c87-1915a71d4bd7",
  "order_id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
  "assignment_id": "050ddc4d-b565-4106-87d8-9293ef5c74c2",
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
  "session_id": "b11bdd3f-ab4c-4700-9cad-6ff52006ed06",
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
  "last_heartbeat_at": "2026-10-27T14:44:08.05328Z",
  "last_location_at": "2026-10-27T14:44:08.05328Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b11bdd3f-ab4c-4700-9cad-6ff52006ed06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:08Z",
    "sequence": 1793112248730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b11bdd3f-ab4c-4700-9cad-6ff52006ed06",
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
  "last_heartbeat_at": "2026-10-27T14:44:08.747701Z",
  "last_location_at": "2026-10-27T14:44:08.747701Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1d0af90b-033f-485f-8c87-1915a71d4bd7/arrive` → **200**

```json
{
  "command_id": "90be8d70-b344-4ccb-96d5-c76911e55bf5",
  "expected_version": 0
}
```

```json
{
  "id": "1d0af90b-033f-485f-8c87-1915a71d4bd7",
  "order_id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
  "assignment_id": "050ddc4d-b565-4106-87d8-9293ef5c74c2",
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
  "arrived_at": "2026-10-27T14:44:08.778809Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/1d0af90b-033f-485f-8c87-1915a71d4bd7/start` → **200**

```json
{
  "command_id": "7553fb36-b005-48aa-b702-0cc315f01753",
  "expected_version": 1
}
```

```json
{
  "id": "1d0af90b-033f-485f-8c87-1915a71d4bd7",
  "order_id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
  "assignment_id": "050ddc4d-b565-4106-87d8-9293ef5c74c2",
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
  "arrived_at": "2026-10-27T14:44:08.778809Z",
  "started_at": "2026-10-27T14:44:08.812915Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/1d0af90b-033f-485f-8c87-1915a71d4bd7/complete` → **200**

```json
{
  "command_id": "ed8fa29a-96cc-4b47-9497-b68cb6d75faa",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:44:08Z"
}
```

```json
{
  "id": "1d0af90b-033f-485f-8c87-1915a71d4bd7",
  "order_id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
  "assignment_id": "050ddc4d-b565-4106-87d8-9293ef5c74c2",
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
  "arrived_at": "2026-10-27T14:44:08.778809Z",
  "started_at": "2026-10-27T14:44:08.812915Z",
  "completed_at": "2026-10-27T14:44:08.855915Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "97911c90-b2fc-45df-a046-c5313f3dc6d8",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-27T14:44:08.594776Z",
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
    "id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-27T14:44:07.663829Z",
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

`GET /api/operator/v1/orders/f810c194-7dfe-4bb4-90d9-d3a73d7e370f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T14:44:07.664413Z",
      "actor": {
        "type": "CLIENT",
        "id": "6e87319d-7065-4b2f-b8c6-b76980a0c882",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
        "quote_id": "14c27e63-85b0-4236-b538-dc8ecb2a1540",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T14:44:07.665788Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
        "attempt_id": "e2c2fad9-5607-464c-923d-c23ce09e6651",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T14:44:07.669842Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9e65d1b0-9b27-45e3-a5f9-70751ed96712",
        "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T14:44:07.719309Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9e65d1b0-9b27-45e3-a5f9-70751ed96712",
        "order_id": "f810c194-7dfe-4bb4-90d9-d3a73d7e370f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "76c347c2-0dcb-46f3-b2c0-4dc9ae227520"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted f810c194-7dfe-4bb4-90d9-d3a73d7e370f, follow-up 97911c90-b2fc-45df-a046-c5313f3dc6d8.

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
  "session_id": "141daf40-a5ab-4273-8889-caa0343a04e5",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTIsImlhdCI6MTc5MzExMjI1MiwianRpIjoiODA0YmYwNTYtNDhhNS00MjAxLWFhNjEtZjEwYTRlODYzMWVjIiwic2lkIjoiMTQxZGFmNDAtYTVhYi00MjczLTg4ODktY2FhMDM0M2EwNGU1In0.iYx7DaGj6BjAoiEp__8yBzIzACHyn21RGs2PNJyJntI",
  "access_expires_at": "2026-10-27T14:59:12.17916512Z",
  "refresh_token": "ndvWm9yAl4K6gq-BRk2kDY75372EShnABa7jydGOwMI",
  "refresh_expires_at": "2026-10-28T02:44:12.178623713Z",
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
  "session_id": "5b8374d0-8ff4-4dfa-bb79-acaeb4de008f",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTIsImlhdCI6MTc5MzExMjI1MiwianRpIjoiMmFjN2YyZmQtNzU0NS00NDY0LWJmN2YtNjE3OGZiNjNmYmNmIiwic2lkIjoiNWI4Mzc0ZDAtOGZmNC00ZGZhLWJiNzktYWNhZWI0ZGUwMDhmIn0.4VKd8kgoLYxaCrkAXSMbr8vqSEHRiIDss56i042wv3A",
  "access_expires_at": "2026-10-27T14:59:12.41348611Z",
  "refresh_token": "PGOKWOeNc9ymu-ni8Q1cbyz0bPSVrFjh5z-YoUHpqBQ",
  "refresh_expires_at": "2026-10-28T02:44:12.413100418Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26264"
}
```

```json
{
  "challenge_id": "0fca83d5-7767-4cc1-a670-745640e5092b",
  "expires_at": "2026-10-27T14:49:12.433769308Z",
  "resend_available_at": "2026-10-27T14:44:13.433769308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "767993",
  "sent_at": "2026-10-27T14:44:12.43543884Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fca83d5-7767-4cc1-a670-745640e5092b",
  "code": "767993",
  "device_ref": "sandbox-26264"
}
```

```json
{
  "session_id": "09437a15-d43e-40eb-9806-8a957ba309f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE1MiwiaWF0IjoxNzkzMTEyMjUyLCJqdGkiOiI0NTA0NmUxOC1kMDkzLTQwNDAtYjgxYi1lYmIxMWFhNTAxYTgiLCJzaWQiOiIwOTQzN2ExNS1kNDNlLTQwZWItOTgwNi04YTk1N2JhMzA5ZjMifQ.BSwsOsN8DpgnnvyvPAgwxSauRG2cB6E55r8cxl6KwO0",
  "access_expires_at": "2026-10-27T14:59:12.489162963Z",
  "refresh_token": "uPramDVxNuXzTL34cfrMoSPjX18SP04i01Ppfjnu3c8",
  "refresh_expires_at": "2026-11-26T14:44:12.488722437Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:07.874963Z",
  "last_location_at": "2026-10-27T14:44:07.874963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/handover` → **200**

```json
{
  "command_id": "7553d9f1-49fa-441e-8d3c-a546150a9c43",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:07.874963Z",
  "last_location_at": "2026-10-27T14:44:07.874963Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:12Z",
    "sequence": 1793112252562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:12.578034Z",
  "last_location_at": "2026-10-27T14:44:12.578034Z",
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
  "command_id": "e296f291-3739-43c6-9853-25679b5f53e4",
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
  "effective_at": "2026-10-27T14:44:12.640341Z",
  "changed_by": "f5af211d-ab5e-417e-88ab-f9c370de2ece",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "f5af211d-ab5e-417e-88ab-f9c370de2ece",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T14:44:12.672570987Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9577cf4f-92a8-48e6-8263-0d02d224e0a4",
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
  "id": "bd9fc449-5030-4988-beee-f09b7fbad989",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:49:12.708896Z",
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
  "command_id": "7a20c538-8e5a-4553-ae75-7c81ccc810df",
  "quote_id": "bd9fc449-5030-4988-beee-f09b7fbad989",
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
    "phone": "+3806711113049"
  }
}
```

```json
{
  "id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
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
  "created_at": "2026-10-27T14:44:12.752314Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113049"
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
    "id": "131b60f2-45c7-497c-ae84-076ccc7f1652",
    "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
    "expires_at": "2026-10-27T14:44:27.756645Z",
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

`POST /api/driver/v1/offers/131b60f2-45c7-497c-ae84-076ccc7f1652/accept` → **200**

```json
{
  "command_id": "d29be8de-cde7-47d6-b235-302321e857a8"
}
```

```json
{
  "id": "c5628a3b-52a7-47b2-b1ca-b2225dd5c1e4",
  "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6ce6d147-cce2-41d1-8133-5a2adcaa109f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6ce6d147-cce2-41d1-8133-5a2adcaa109f",
  "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
  "assignment_id": "c5628a3b-52a7-47b2-b1ca-b2225dd5c1e4",
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

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:12Z",
    "sequence": 1793112252858
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:12.899064Z",
  "last_location_at": "2026-10-27T14:44:12.899064Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6ce6d147-cce2-41d1-8133-5a2adcaa109f/arrive` → **200**

```json
{
  "command_id": "ca33f366-bf9e-4380-a40a-78a1e7e8996c",
  "expected_version": 0
}
```

```json
{
  "id": "6ce6d147-cce2-41d1-8133-5a2adcaa109f",
  "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
  "assignment_id": "c5628a3b-52a7-47b2-b1ca-b2225dd5c1e4",
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
  "arrived_at": "2026-10-27T14:44:12.930567Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/6ce6d147-cce2-41d1-8133-5a2adcaa109f/start` → **200**

```json
{
  "command_id": "0a67341e-63eb-494c-af3e-05bad18f6f79",
  "expected_version": 1
}
```

```json
{
  "id": "6ce6d147-cce2-41d1-8133-5a2adcaa109f",
  "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
  "assignment_id": "c5628a3b-52a7-47b2-b1ca-b2225dd5c1e4",
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
  "arrived_at": "2026-10-27T14:44:12.930567Z",
  "started_at": "2026-10-27T14:44:12.964154Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/6ce6d147-cce2-41d1-8133-5a2adcaa109f/complete` → **200**

```json
{
  "command_id": "977ec6d7-6083-4904-a1cf-1dcb4c8e91da",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:44:12Z",
  "cash_received": true
}
```

```json
{
  "id": "6ce6d147-cce2-41d1-8133-5a2adcaa109f",
  "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
  "assignment_id": "c5628a3b-52a7-47b2-b1ca-b2225dd5c1e4",
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
  "arrived_at": "2026-10-27T14:44:12.930567Z",
  "started_at": "2026-10-27T14:44:12.964154Z",
  "completed_at": "2026-10-27T14:44:12.998753Z",
  "needs_review": false
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f33744ad-e9d6-4a23-9608-378782b3cf97",
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
  "id": "3bea09ca-a017-459c-a2a1-a8b5a1a0023a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:49:13.034254Z",
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
  "command_id": "41a27608-7765-40ce-9423-ac2421c0204a",
  "quote_id": "3bea09ca-a017-459c-a2a1-a8b5a1a0023a",
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
    "phone": "+3806711114661"
  }
}
```

```json
{
  "id": "ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e",
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
  "created_at": "2026-10-27T14:44:13.06715Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114661"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e` → **200**

```json
{
  "id": "ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e",
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
  "created_at": "2026-10-27T14:44:13.06715Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114661"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e/cancel` → **200**

```json
{
  "command_id": "3b5104fb-94d5-4ad5-8c94-2aa2fdf6555e",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e",
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
  "created_at": "2026-10-27T14:44:13.06715Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711114661"
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
  "staff_id": "f5af211d-ab5e-417e-88ab-f9c370de2ece",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T14:44:13.144192Z",
  "last_entries": [
    {
      "order_id": "ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T14:44:13.144192Z"
    },
    {
      "order_id": "4ffd5306-9784-452f-8906-d45b9e9aa1a2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T14:44:13.003067Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fdabbb37-ec34-492f-b068-2849c6afa7cf",
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
  "last_heartbeat_at": "2026-10-27T14:44:12.899064Z",
  "last_location_at": "2026-10-27T14:44:12.899064Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fdabbb37-ec34-492f-b068-2849c6afa7cf/close` → **200**

```json
{
  "command_id": "2891a713-38cb-47af-9136-75ee4c12cbec",
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

Done: operator bonus for fulfilled 4ffd5306-9784-452f-8906-d45b9e9aa1a2 and operator-fault cancellation ec0bd3a0-1410-4d41-a422-53b7bbc5fd0e.

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
  "session_id": "3dfde7fa-da1f-4100-957b-8c9ae6ca675b",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTUsImlhdCI6MTc5MzExMjI1NSwianRpIjoiZDRmMTE1ZTEtMmE2Yi00MTc4LWFjMTktODEwNTc2Y2UzYmI1Iiwic2lkIjoiM2RmZGU3ZmEtZGExZi00MTAwLTk1N2ItOGM5YWU2Y2E2NzViIn0.T4NmIcE38tF3nY_PPTpUvYEfhSE5-_haLiLRN7letYw",
  "access_expires_at": "2026-10-27T14:59:15.482355584Z",
  "refresh_token": "31Gcn9xIn0qyBTluy3QCWQtZzmrbjSgJ8tMF4gfr3j0",
  "refresh_expires_at": "2026-10-28T02:44:15.481970362Z",
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
  "command_id": "4a149512-feb1-4eee-81e6-4ac8f2c0851a",
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
  "changed_by": "f5af211d-ab5e-417e-88ab-f9c370de2ece",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T14:44:15.544473083Z"
}
```

## The rider books the airport for 2026-10-27T17:44:15Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600520929",
  "device_ref": "sandbox-24518"
}
```

```json
{
  "challenge_id": "c6d32b0f-cef2-4cea-bb00-ea3788258512",
  "expires_at": "2026-10-27T14:49:15.571946683Z",
  "resend_available_at": "2026-10-27T14:44:16.571946683Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600520929` → **200**

```json
{
  "phone": "+48600520929",
  "audience": "CLIENT",
  "code": "190114",
  "sent_at": "2026-10-27T14:44:15.574828361Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6d32b0f-cef2-4cea-bb00-ea3788258512",
  "code": "190114",
  "device_ref": "sandbox-24518"
}
```

```json
{
  "session_id": "66c27e79-6053-4c40-a934-75c77770ee35",
  "subject": {
    "type": "CLIENT",
    "id": "feb3a3eb-1647-4581-97aa-8baaaf7f5a8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWIzYTNlYi0xNjQ3LTQ1ODEtOTdhYS04YmFhYWY3ZjVhOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTU1LCJpYXQiOjE3OTMxMTIyNTUsImp0aSI6ImQ4NTA2MzJhLTcwMzgtNDM4OS04YjU4LWRjMDY0ZTY2Y2JmZSIsInNpZCI6IjY2YzI3ZTc5LTYwNTMtNGM0MC1hOTM0LTc1Yzc3NzcwZWUzNSJ9.OqwVSlwSUHzq7TlKaLydeicH3SsvsIOs3GSUGh7w63g",
  "access_expires_at": "2026-10-27T14:59:15.621574538Z",
  "refresh_token": "gRe7J-vvBxmIgyc0n1_cbf_tXuYWtXg5cXbkAoWm0as",
  "refresh_expires_at": "2026-11-26T14:44:15.621270239Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6e39a0b3-dfd4-43f9-b3f3-b564af60aa14",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T17:44:15Z"
}
```

```json
{
  "id": "48c0a311-0398-4156-9565-97cfb831e933",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T14:49:15.651827Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T17:44:15Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dfd7c37f-534b-457d-b303-fbbb7b74d2d6",
  "quote_id": "48c0a311-0398-4156-9565-97cfb831e933",
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
  "pickup_at": "2026-10-27T17:44:15Z"
}
```

```json
{
  "id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "feb3a3eb-1647-4581-97aa-8baaaf7f5a8c",
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
  "created_at": "2026-10-27T14:44:15.685535Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T17:44:15Z",
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
  "device_ref": "sandbox-26353"
}
```

```json
{
  "challenge_id": "b0b488e4-e611-4add-aee5-e29ca0fbbc81",
  "expires_at": "2026-10-27T14:49:15.71368765Z",
  "resend_available_at": "2026-10-27T14:44:16.71368765Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "761627",
  "sent_at": "2026-10-27T14:44:15.715591517Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0b488e4-e611-4add-aee5-e29ca0fbbc81",
  "code": "761627",
  "device_ref": "sandbox-26353"
}
```

```json
{
  "session_id": "ea76aeae-2ff1-4679-bd69-72a30f3cdc22",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE1NSwiaWF0IjoxNzkzMTEyMjU1LCJqdGkiOiJkYTI3ZjI1OC1mODJmLTRhN2YtOWI5Ni1hMzQzODhlM2M5Y2EiLCJzaWQiOiJlYTc2YWVhZS0yZmYxLTQ2NzktYmQ2OS03MmEzMGYzY2RjMjIifQ.Tkz55AzoUttAOIr6RkeCoOHHwM-5IXb4lvYc9XdSxJU",
  "access_expires_at": "2026-10-27T14:59:15.760994736Z",
  "refresh_token": "bPAnA6BmdKiaadk6q4QcmOtmHa8MtVT8Tl00PCo6O3A",
  "refresh_expires_at": "2026-11-26T14:44:15.760575753Z",
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
  "command_id": "da763e15-66ea-4562-a062-546c49a9181b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:15Z",
    "sequence": 1793112255812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0745a1ca-ed3c-418f-8e58-554420f7de24",
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
  "last_heartbeat_at": "2026-10-27T14:44:15.831657Z",
  "last_location_at": "2026-10-27T14:44:15.831657Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
      "short_number": 9,
      "pickup_at": "2026-10-27T17:44:15Z",
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

`POST /api/driver/v1/preorders/915ea5f1-2051-4b09-8b7f-77a2fc66bc41/reserve` → **200**

```json
{
  "command_id": "b5e8bee0-896d-4c56-a302-488e5ceb05e9"
}
```

```json
{
  "id": "fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3",
  "state": "RESERVED",
  "order": {
    "order_id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
    "short_number": 9,
    "pickup_at": "2026-10-27T17:44:15Z",
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
  "reserved_at": "2026-10-27T14:44:15.907878Z",
  "confirm_from": "2026-10-27T17:14:15Z",
  "confirm_until": "2026-10-27T17:24:15Z",
  "drop_until": "2026-10-27T16:44:15Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3",
      "state": "RESERVED",
      "order": {
        "order_id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:44:15Z",
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
      "reserved_at": "2026-10-27T14:44:15.907878Z",
      "confirm_from": "2026-10-27T17:14:15Z",
      "confirm_until": "2026-10-27T17:24:15Z",
      "drop_until": "2026-10-27T16:44:15Z"
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
      "id": "fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3",
      "state": "RESERVED",
      "order": {
        "order_id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
        "short_number": 9,
        "pickup_at": "2026-10-27T17:44:15Z",
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
      "reserved_at": "2026-10-27T14:44:15.907878Z",
      "confirm_from": "2026-10-27T17:14:15Z",
      "confirm_until": "2026-10-27T17:24:15Z",
      "drop_until": "2026-10-27T16:44:15Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3/confirm` → **409**

```json
{
  "command_id": "dda6a002-af1e-458b-8830-3d6ea2fd7386"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "490bc02b-9f01-41e8-a761-992e28977fbe"
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
  "session_id": "364eac43-ef50-48f8-a30b-b532487f0907",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTYsImlhdCI6MTc5MzExMjI1NiwianRpIjoiNTkxM2Q2M2YtZjNmYi00OWQwLWE0NDktOGRkNTNiZmMyZjAzIiwic2lkIjoiMzY0ZWFjNDMtZWY1MC00OGY4LWEzMGItYjUzMjQ4N2YwOTA3In0.u3txlbJVura0wG9Z4vTR29iBYd9RDm28cFgeu7ue_c8",
  "access_expires_at": "2026-10-27T14:59:16.219873436Z",
  "refresh_token": "Vyfjgl7U3Gyojf7dgko-jxSApZxHO8L-MyIQxMplyAc",
  "refresh_expires_at": "2026-10-28T02:44:16.219360331Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/915ea5f1-2051-4b09-8b7f-77a2fc66bc41` → **200**

```json
{
  "id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
  "short_number": 9,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "feb3a3eb-1647-4581-97aa-8baaaf7f5a8c",
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
  "created_at": "2026-10-27T14:44:15.685535Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T17:44:15Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T14:44:15.907878Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/915ea5f1-2051-4b09-8b7f-77a2fc66bc41/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T14:44:15.686907Z",
      "actor": {
        "type": "CLIENT",
        "id": "feb3a3eb-1647-4581-97aa-8baaaf7f5a8c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
        "preorder": true,
        "quote_id": "48c0a311-0398-4156-9565-97cfb831e933",
        "pickup_at": "2026-10-27T17:44:15Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T14:44:15.908837Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "915ea5f1-2051-4b09-8b7f-77a2fc66bc41",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3"
      }
    }
  ]
}
```

Done: pre-order 915ea5f1-2051-4b09-8b7f-77a2fc66bc41, reservation fdfab0e4-dc01-4b6d-b75a-a2ecc8bfb0a3.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17495"
}
```

```json
{
  "challenge_id": "733cbd4a-e0ed-4728-851e-b2bb4edac360",
  "expires_at": "2026-10-27T14:49:16.297604539Z",
  "resend_available_at": "2026-10-27T14:44:17.297604539Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "842499",
  "sent_at": "2026-10-27T14:44:16.299499952Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "733cbd4a-e0ed-4728-851e-b2bb4edac360",
  "code": "842499",
  "device_ref": "sandbox-17495"
}
```

```json
{
  "session_id": "f5e444b7-6016-4717-bdf6-b291bc7c0f8b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE1NiwiaWF0IjoxNzkzMTEyMjU2LCJqdGkiOiJlYTM0OTQ1Yy0yYmY2LTQzN2UtYjRhYy0wN2JhZTA0ODdlOTgiLCJzaWQiOiJmNWU0NDRiNy02MDE2LTQ3MTctYmRmNi1iMjkxYmM3YzBmOGIifQ.AbM1G9W6_GYMZBZpnRs-EzAuy1XE_a1nVA_0qbu7MT0",
  "access_expires_at": "2026-10-27T14:59:16.351475574Z",
  "refresh_token": "spt1JGzayDOl31b6ZhSQDEX7q92Cv1UezKxyL5PIkfU",
  "refresh_expires_at": "2026-11-26T14:44:16.351034317Z",
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
  "command_id": "2ba774e5-6af7-4d33-b00e-78519e424a4f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:16Z",
    "sequence": 1793112256393
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e02d0b3a-16a0-41da-b3e2-bde5300ea1cd",
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
  "last_heartbeat_at": "2026-10-27T14:44:16.408326Z",
  "last_location_at": "2026-10-27T14:44:16.408326Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676892778",
  "device_ref": "sandbox-20597"
}
```

```json
{
  "challenge_id": "aad36d11-6893-4f5b-b33e-961c9716d59c",
  "expires_at": "2026-10-27T14:49:16.431404285Z",
  "resend_available_at": "2026-10-27T14:44:17.431404285Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676892778` → **200**

```json
{
  "phone": "+380676892778",
  "audience": "CLIENT",
  "code": "706771",
  "sent_at": "2026-10-27T14:44:16.433123552Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aad36d11-6893-4f5b-b33e-961c9716d59c",
  "code": "706771",
  "device_ref": "sandbox-20597"
}
```

```json
{
  "session_id": "6bf7713a-6218-47ec-b58d-f11a0dc428c2",
  "subject": {
    "type": "CLIENT",
    "id": "a50c44f0-8372-4621-b744-ead2c37fc57b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNTBjNDRmMC04MzcyLTQ2MjEtYjc0NC1lYWQyYzM3ZmM1N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTU2LCJpYXQiOjE3OTMxMTIyNTYsImp0aSI6IjIwNGVjZTViLTQ4ZGMtNDlhMS04N2RkLTI2NjA5MjBhOTg3OCIsInNpZCI6IjZiZjc3MTNhLTYyMTgtNDdlYy1iNThkLWYxMWEwZGM0MjhjMiJ9.OIxkx9hTotCEUXlGIcOl51Rs0yK4Ir4pH3_gZHneY9Y",
  "access_expires_at": "2026-10-27T14:59:16.48032389Z",
  "refresh_token": "AtlRe3j1Fz0N0PcvBwy7KMrDg_jsWWfC27zXCv065OM",
  "refresh_expires_at": "2026-11-26T14:44:16.480007001Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b8190627-461a-450c-8e53-63234df89383",
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
  "id": "0444ca3a-65e3-48f2-8783-20ccf9f8adb3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T14:49:16.515316Z",
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
  "command_id": "675cda0d-7e56-45bd-88a5-a2c3a9289dfb",
  "quote_id": "0444ca3a-65e3-48f2-8783-20ccf9f8adb3",
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
  "id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a50c44f0-8372-4621-b744-ead2c37fc57b",
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
  "created_at": "2026-10-27T14:44:16.544818Z",
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
    "id": "5b3195e0-cd43-4904-8862-c2f617bcf384",
    "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
    "expires_at": "2026-10-27T14:44:31.546682Z",
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

`POST /api/driver/v1/offers/5b3195e0-cd43-4904-8862-c2f617bcf384/accept` → **200**

```json
{
  "command_id": "99620523-8e31-4a5f-974c-07e4c0e09c99"
}
```

```json
{
  "id": "aec2984b-30e2-42c2-846f-77da285f20de",
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e3db31be-f79d-4f74-9fac-ded88f0783cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e3db31be-f79d-4f74-9fac-ded88f0783cc",
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "assignment_id": "aec2984b-30e2-42c2-846f-77da285f20de",
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

`POST /api/driver/v1/work-sessions/e02d0b3a-16a0-41da-b3e2-bde5300ea1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:16Z",
    "sequence": 1793112256635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e02d0b3a-16a0-41da-b3e2-bde5300ea1cd",
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
  "last_heartbeat_at": "2026-10-27T14:44:16.650953Z",
  "last_location_at": "2026-10-27T14:44:16.650953Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e3db31be-f79d-4f74-9fac-ded88f0783cc",
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "assignment_id": "aec2984b-30e2-42c2-846f-77da285f20de",
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

`POST /api/driver/v1/trips/e3db31be-f79d-4f74-9fac-ded88f0783cc/arrive` → **200**

```json
{
  "command_id": "c169cae5-9d51-4118-94ae-a13f354aecd8",
  "expected_version": 0
}
```

```json
{
  "id": "e3db31be-f79d-4f74-9fac-ded88f0783cc",
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "assignment_id": "aec2984b-30e2-42c2-846f-77da285f20de",
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
  "arrived_at": "2026-10-27T14:44:16.693609Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/e3db31be-f79d-4f74-9fac-ded88f0783cc/start` → **200**

```json
{
  "command_id": "96838562-447b-4f44-b564-bcc0237f3196",
  "expected_version": 1
}
```

```json
{
  "id": "e3db31be-f79d-4f74-9fac-ded88f0783cc",
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "assignment_id": "aec2984b-30e2-42c2-846f-77da285f20de",
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
  "arrived_at": "2026-10-27T14:44:16.693609Z",
  "started_at": "2026-10-27T14:44:16.72227Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/e02d0b3a-16a0-41da-b3e2-bde5300ea1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:16Z",
    "sequence": 1793112256742
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e02d0b3a-16a0-41da-b3e2-bde5300ea1cd",
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
  "last_heartbeat_at": "2026-10-27T14:44:16.757624Z",
  "last_location_at": "2026-10-27T14:44:16.757624Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e3db31be-f79d-4f74-9fac-ded88f0783cc/complete` → **200**

```json
{
  "command_id": "f990bf7a-dd77-4322-924e-89410a74125f",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:44:16Z",
  "cash_received": true
}
```

```json
{
  "id": "e3db31be-f79d-4f74-9fac-ded88f0783cc",
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "assignment_id": "aec2984b-30e2-42c2-846f-77da285f20de",
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
  "arrived_at": "2026-10-27T14:44:16.693609Z",
  "started_at": "2026-10-27T14:44:16.72227Z",
  "completed_at": "2026-10-27T14:44:16.786496Z",
  "needs_review": false
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/8c7feaf5-9769-4deb-8413-1e0ca9685022/rating` → **200**

```json
{
  "command_id": "3575bbb2-2dc7-474a-a1e1-743a16c310ae",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "score": 5,
  "created_at": "2026-10-27T14:44:16.833605446Z"
}
```

`POST /api/driver/v1/orders/8c7feaf5-9769-4deb-8413-1e0ca9685022/rating` → **200**

```json
{
  "command_id": "26bc9199-4620-43cf-951f-49b55cdbe190",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
  "score": 4,
  "created_at": "2026-10-27T14:44:16.892348732Z"
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
  "session_id": "31046a46-8e2d-44b0-b8a6-c134e0a632e0",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTcsImlhdCI6MTc5MzExMjI1NywianRpIjoiYjEyN2UyNGQtZDU5Yy00MmFhLTk0Y2YtN2Q1MDQwODAzZjMwIiwic2lkIjoiMzEwNDZhNDYtOGUyZC00NGIwLWI4YTYtYzEzNGUwYTYzMmUwIn0.CuNZzRT6O4O4uUwKT9hh6n-w5kbqqy26ACqw2BZM7Uo",
  "access_expires_at": "2026-10-27T14:59:17.152434143Z",
  "refresh_token": "yIZlsTWDqrxQU7MwzBREB6wN2NpDyLktcB9gBH8_mLs",
  "refresh_expires_at": "2026-10-28T02:44:17.152047399Z",
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
  "session_id": "ba2ddb1d-0ad7-4060-9815-b3a658566118",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTcsImlhdCI6MTc5MzExMjI1NywianRpIjoiNTRjMTI5MTItYzM5ZC00Mjc3LWFkZGItNTZmNTEzN2UxYTNkIiwic2lkIjoiYmEyZGRiMWQtMGFkNy00MDYwLTk4MTUtYjNhNjU4NTY2MTE4In0.mubpAsWru8VhPNzmLY5F_uHFY95Ew1-Zu5oIxF9FzWw",
  "access_expires_at": "2026-10-27T14:59:17.378319266Z",
  "refresh_token": "Kj3JIw23tLH_3i7m_xwEjmggbWC_mBaHrHSxPfwdM5M",
  "refresh_expires_at": "2026-10-28T02:44:17.377856788Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8c7feaf5-9769-4deb-8413-1e0ca9685022/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
      "author_type": "RIDER",
      "author_id": "a50c44f0-8372-4621-b744-ead2c37fc57b",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T14:44:16.833605Z"
    },
    {
      "order_id": "8c7feaf5-9769-4deb-8413-1e0ca9685022",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a50c44f0-8372-4621-b744-ead2c37fc57b",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T14:44:16.892349Z"
    }
  ]
}
```

Done: ratings for order 8c7feaf5-9769-4deb-8413-1e0ca9685022.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676998838",
  "device_ref": "sandbox-30351"
}
```

```json
{
  "challenge_id": "b0e341ae-3987-464d-8d40-0e4b92a9a670",
  "expires_at": "2026-10-27T14:49:17.459978249Z",
  "resend_available_at": "2026-10-27T14:44:18.459978249Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676998838` → **200**

```json
{
  "phone": "+380676998838",
  "audience": "CLIENT",
  "code": "207916",
  "sent_at": "2026-10-27T14:44:17.461611573Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0e341ae-3987-464d-8d40-0e4b92a9a670",
  "code": "207916",
  "device_ref": "sandbox-30351"
}
```

```json
{
  "session_id": "5ed48b53-1eea-4882-85d4-646cc8a680c5",
  "subject": {
    "type": "CLIENT",
    "id": "89d88ead-ea86-425c-95e8-1ac65dd9c610"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OWQ4OGVhZC1lYTg2LTQyNWMtOTVlOC0xYWM2NWRkOWM2MTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTEzMTU3LCJpYXQiOjE3OTMxMTIyNTcsImp0aSI6IjlhMmJjNmIxLTVlNjgtNDA5Yi04YmNmLWQxMTFhZTFmY2IzOCIsInNpZCI6IjVlZDQ4YjUzLTFlZWEtNDg4Mi04NWQ0LTY0NmNjOGE2ODBjNSJ9.Q5CjuHL31KBVuCNPiYNRx-H2Fa6R6V3WI-ph-oYEH7Y",
  "access_expires_at": "2026-10-27T14:59:17.509126926Z",
  "refresh_token": "qUOpPr_OFxkIYreE5UlVgLcJ6p_kZvF-ac9yQ5BmbBY",
  "refresh_expires_at": "2026-11-26T14:44:17.508695565Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "ae9d9857-f35c-4385-aefc-c171e338f204",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "84c52cca-fc9c-428e-991a-b0056e606f2b",
  "upload_path": "/api/rider/v1/uploads/84c52cca-fc9c-428e-991a-b0056e606f2b",
  "expires_at": "2026-10-27T14:59:17.542051054Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/84c52cca-fc9c-428e-991a-b0056e606f2b` → **200**

```json
{
  "file_id": "84c52cca-fc9c-428e-991a-b0056e606f2b",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "f5fdc60b-56fe-4bd5-8b6e-823292bd28da",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "84c52cca-fc9c-428e-991a-b0056e606f2b"
  ]
}
```

```json
{
  "id": "1d1d5090-3d4e-4472-946d-4f9e97d438af",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:44:17.613172Z",
  "updated_at": "2026-10-27T14:44:17.613172Z",
  "messages": [
    {
      "id": "555b7920-17a1-411f-a2bc-dffbec5a0505",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:44:17.61475Z",
      "attachments": [
        {
          "file_id": "84c52cca-fc9c-428e-991a-b0056e606f2b",
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
  "session_id": "028bbe8a-01e9-4e43-a2c1-5dfa07445647",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTcsImlhdCI6MTc5MzExMjI1NywianRpIjoiMDU0ZDllNGYtMjEzZi00ZGExLTg5YzQtYWE2NDQ4ZGJhODZlIiwic2lkIjoiMDI4YmJlOGEtMDFlOS00ZTQzLWEyYzEtNWRmYTA3NDQ1NjQ3In0.3eWnydsgNykPEZG2KcZOcrYZ8cQnmRNEs5e1NNcva-4",
  "access_expires_at": "2026-10-27T14:59:17.858902847Z",
  "refresh_token": "BsmtNoU0ApFfLQQpkjeOfEMAGhk-lHJeOV3LULP3iBc",
  "refresh_expires_at": "2026-10-28T02:44:17.858435872Z",
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
  "session_id": "4b993b48-fe11-43e6-b46b-95c5bf356022",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTgsImlhdCI6MTc5MzExMjI1OCwianRpIjoiZmM2YTllN2MtZDgzZC00NzgwLTljNDAtODA5OTVkNWQ4OWNkIiwic2lkIjoiNGI5OTNiNDgtZmUxMS00M2U2LWI0NmItOTVjNWJmMzU2MDIyIn0.G0KiN1o36ahQ3XMYfyXKnpateQnaNTH96IEUJG2ZdI8",
  "access_expires_at": "2026-10-27T14:59:18.087137607Z",
  "refresh_token": "rJgDN-gytzwEeTIQfk3k9E_0uLVOQWkwNdehLcMooZI",
  "refresh_expires_at": "2026-10-28T02:44:18.086784013Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1d1d5090-3d4e-4472-946d-4f9e97d438af/attachments/84c52cca-fc9c-428e-991a-b0056e606f2b` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d900100d-a9e6-49e6-a709-21ca7e56e4de",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "26e63998-abc6-445d-b591-ebdaa007643c",
  "upload_path": "/api/operator/v1/uploads/26e63998-abc6-445d-b591-ebdaa007643c",
  "expires_at": "2026-10-27T14:59:18.133957848Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/26e63998-abc6-445d-b591-ebdaa007643c` → **200**

```json
{
  "file_id": "26e63998-abc6-445d-b591-ebdaa007643c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1d1d5090-3d4e-4472-946d-4f9e97d438af` → **200**

```json
{
  "id": "1d1d5090-3d4e-4472-946d-4f9e97d438af",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T14:44:17.613172Z",
  "updated_at": "2026-10-27T14:44:17.613172Z",
  "messages": [
    {
      "id": "555b7920-17a1-411f-a2bc-dffbec5a0505",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:44:17.61475Z",
      "attachments": [
        {
          "file_id": "84c52cca-fc9c-428e-991a-b0056e606f2b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1d1d5090-3d4e-4472-946d-4f9e97d438af/comments` → **200**

```json
{
  "command_id": "0e2a36df-e153-4d6f-8dcd-b0883a5426a7",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "26e63998-abc6-445d-b591-ebdaa007643c"
  ]
}
```

```json
{
  "id": "1d1d5090-3d4e-4472-946d-4f9e97d438af",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:44:17.613172Z",
  "updated_at": "2026-10-27T14:44:18.226269Z",
  "messages": [
    {
      "id": "555b7920-17a1-411f-a2bc-dffbec5a0505",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:44:17.61475Z",
      "attachments": [
        {
          "file_id": "84c52cca-fc9c-428e-991a-b0056e606f2b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "81cad85e-a210-436a-a579-ef8dfb0e60e5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "f5af211d-ab5e-417e-88ab-f9c370de2ece",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:44:18.225899Z",
      "attachments": [
        {
          "file_id": "26e63998-abc6-445d-b591-ebdaa007643c",
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

`GET /api/rider/v1/support/cases/1d1d5090-3d4e-4472-946d-4f9e97d438af` → **200**

```json
{
  "id": "1d1d5090-3d4e-4472-946d-4f9e97d438af",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T14:44:17.613172Z",
  "updated_at": "2026-10-27T14:44:18.226269Z",
  "messages": [
    {
      "id": "555b7920-17a1-411f-a2bc-dffbec5a0505",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "89d88ead-ea86-425c-95e8-1ac65dd9c610",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T14:44:17.61475Z",
      "attachments": [
        {
          "file_id": "84c52cca-fc9c-428e-991a-b0056e606f2b",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "81cad85e-a210-436a-a579-ef8dfb0e60e5",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T14:44:18.225899Z",
      "attachments": [
        {
          "file_id": "26e63998-abc6-445d-b591-ebdaa007643c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1d1d5090-3d4e-4472-946d-4f9e97d438af/attachments/26e63998-abc6-445d-b591-ebdaa007643c` → **200**

Done: support case 1d1d5090-3d4e-4472-946d-4f9e97d438af, rider attachment 84c52cca-fc9c-428e-991a-b0056e606f2b, operator attachment 26e63998-abc6-445d-b591-ebdaa007643c.

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
  "session_id": "b3d36b25-0cf3-4257-bcf1-670a8723b4b1",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTgsImlhdCI6MTc5MzExMjI1OCwianRpIjoiM2YyY2YwMTgtNTE0MC00MDZlLWI0OTMtNTAzNDY4MjYwYTUwIiwic2lkIjoiYjNkMzZiMjUtMGNmMy00MjU3LWJjZjEtNjcwYTg3MjNiNGIxIn0.DxaR3pn3MD_SSP5qEG4FnLKklxyzwSteYvAf81boYbA",
  "access_expires_at": "2026-10-27T14:59:18.51978336Z",
  "refresh_token": "hrNpO5OFRWQD3JciKyjg6-_xljS7ab-Fcf_zZzDy414",
  "refresh_expires_at": "2026-10-28T02:44:18.51935961Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-17858"
}
```

```json
{
  "challenge_id": "ace0c68b-7922-45ee-9b4f-520958676df4",
  "expires_at": "2026-10-27T14:49:18.543695864Z",
  "resend_available_at": "2026-10-27T14:44:19.543695864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "989266",
  "sent_at": "2026-10-27T14:44:18.545540316Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ace0c68b-7922-45ee-9b4f-520958676df4",
  "code": "989266",
  "device_ref": "sandbox-17858"
}
```

```json
{
  "session_id": "98bb4e56-5720-4068-834f-9b2bb5daef21",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE1OCwiaWF0IjoxNzkzMTEyMjU4LCJqdGkiOiI4NGFhMjc0YS1lOTBmLTQwOWItOTYwZC02MjVmZDJiN2Q0MzQiLCJzaWQiOiI5OGJiNGU1Ni01NzIwLTQwNjgtODM0Zi05YjJiYjVkYWVmMjEifQ.EljsRsxZkn9WclIiHQy-1E_E7FUtouzeH5vJ8qxtXWE",
  "access_expires_at": "2026-10-27T14:59:18.594172416Z",
  "refresh_token": "tD2JtSPL-FSXEDdUgSqbEBljVTnFRsfO14V5MN7yLQg",
  "refresh_expires_at": "2026-11-26T14:44:18.593812042Z",
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
  "command_id": "c4101d2c-c366-493e-bdf4-eb33ed4edbdb",
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
  "device_ref": "sandbox-3174"
}
```

```json
{
  "challenge_id": "7686227b-f169-4579-b42b-0345c396b69d",
  "expires_at": "2026-10-27T14:49:18.708431911Z",
  "resend_available_at": "2026-10-27T14:44:19.708431911Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "239071",
  "sent_at": "2026-10-27T14:44:18.710178517Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7686227b-f169-4579-b42b-0345c396b69d",
  "code": "239071",
  "device_ref": "sandbox-3174"
}
```

```json
{
  "session_id": "663f4c78-b58e-4e6f-91e4-b0d6d243b291",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzExMzE1OCwiaWF0IjoxNzkzMTEyMjU4LCJqdGkiOiJjMmI2ZDRjZi0wY2MyLTQxYTctOGI5YS02Y2UzMDc4NWM5Y2YiLCJzaWQiOiI2NjNmNGM3OC1iNThlLTRlNmYtOTFlNC1iMGQ2ZDI0M2IyOTEifQ.7R9B_UE3-sKux-FToXsnvK5ttmpdnqhbeVUtNJvrAPQ",
  "access_expires_at": "2026-10-27T14:59:18.758681021Z",
  "refresh_token": "UcK8wwym_DvFaFGpIXbq09zHLNk_SILSTEAhddtJdFE",
  "refresh_expires_at": "2026-11-26T14:44:18.758318614Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e02d0b3a-16a0-41da-b3e2-bde5300ea1cd",
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
  "last_heartbeat_at": "2026-10-27T14:44:16.757624Z",
  "last_location_at": "2026-10-27T14:44:16.757624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e02d0b3a-16a0-41da-b3e2-bde5300ea1cd/handover` → **200**

```json
{
  "command_id": "04b7680e-b47f-4d8d-8685-0a92ca7f260c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e02d0b3a-16a0-41da-b3e2-bde5300ea1cd",
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
  "last_heartbeat_at": "2026-10-27T14:44:16.757624Z",
  "last_location_at": "2026-10-27T14:44:16.757624Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e02d0b3a-16a0-41da-b3e2-bde5300ea1cd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:18Z",
    "sequence": 1793112258831
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e02d0b3a-16a0-41da-b3e2-bde5300ea1cd",
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
  "last_heartbeat_at": "2026-10-27T14:44:18.84758Z",
  "last_location_at": "2026-10-27T14:44:18.84758Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:44:00.74746Z",
  "last_location_at": "2026-10-27T14:44:00.74746Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/12a67e37-afb0-433d-9d9c-28b1ce4fe38f/handover` → **200**

```json
{
  "command_id": "99a6f850-85be-446e-bd8a-f8e9f4d2f2e3",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:44:00.74746Z",
  "last_location_at": "2026-10-27T14:44:00.74746Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/12a67e37-afb0-433d-9d9c-28b1ce4fe38f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:18Z",
    "sequence": 1793112258918
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:44:18.935342Z",
  "last_location_at": "2026-10-27T14:44:18.935342Z",
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
  "session_id": "616fed82-96a7-4835-90fb-db3a195aaf26",
  "subject": {
    "type": "STAFF",
    "id": "f5af211d-ab5e-417e-88ab-f9c370de2ece"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNWFmMjExZC1hYjVlLTQxN2UtODhhYi1mOWMzNzBkZTJlY2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMTMxNTksImlhdCI6MTc5MzExMjI1OSwianRpIjoiZGE2ZTY1YWEtNGE1Yi00YzI1LTg4ZTMtNmEwNWY3MTJhMjM1Iiwic2lkIjoiNjE2ZmVkODItOTZhNy00ODM1LTkwZmItZGIzYTE5NWFhZjI2In0.fB3xfp0gRWv2M-zRB4oEtaZodOGhmw5exqGs1Kde91c",
  "access_expires_at": "2026-10-27T14:59:19.164260276Z",
  "refresh_token": "B6ngTb_QDny2Gw56XJ6Jjg73u8OYWPeEtmkMj7Gn5bc",
  "refresh_expires_at": "2026-10-28T02:44:19.16385177Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2940bd70-4d1f-4dde-aa93-fc8c0ea43614",
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
  "id": "d5e56774-05e1-4aaa-a6b1-b2cbb84c3aa2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T14:49:19.191832Z",
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
  "command_id": "909fa502-2cd4-4141-bf29-65ddbf79a740",
  "quote_id": "d5e56774-05e1-4aaa-a6b1-b2cbb84c3aa2",
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
  "id": "18ba694d-f816-4df4-8d6b-64840c036107",
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
  "created_at": "2026-10-27T14:44:19.222271Z",
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
    "id": "7d0da147-118a-4cc8-95ff-f9891f9645e2",
    "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
    "expires_at": "2026-10-27T14:44:34.225123Z",
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

`POST /api/driver/v1/offers/7d0da147-118a-4cc8-95ff-f9891f9645e2/accept` → **200**

```json
{
  "command_id": "bc2a5ccd-3f97-4cc4-99e0-12fbbfbe8344"
}
```

```json
{
  "id": "825e4593-5aa1-41ec-ab09-58d89203641f",
  "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aa1a51b4-9642-4caf-b3d8-f75e37572829",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aa1a51b4-9642-4caf-b3d8-f75e37572829",
  "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
  "assignment_id": "825e4593-5aa1-41ec-ab09-58d89203641f",
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

`POST /api/driver/v1/work-sessions/12a67e37-afb0-433d-9d9c-28b1ce4fe38f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T14:44:19Z",
    "sequence": 1793112259336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "12a67e37-afb0-433d-9d9c-28b1ce4fe38f",
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
  "last_heartbeat_at": "2026-10-27T14:44:19.351874Z",
  "last_location_at": "2026-10-27T14:44:19.351874Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/aa1a51b4-9642-4caf-b3d8-f75e37572829/arrive` → **200**

```json
{
  "command_id": "ccc6359b-61de-4790-bffe-46277d29b24a",
  "expected_version": 0
}
```

```json
{
  "id": "aa1a51b4-9642-4caf-b3d8-f75e37572829",
  "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
  "assignment_id": "825e4593-5aa1-41ec-ab09-58d89203641f",
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
  "arrived_at": "2026-10-27T14:44:19.382525Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/aa1a51b4-9642-4caf-b3d8-f75e37572829/start` → **200**

```json
{
  "command_id": "fcd0a199-ceb0-4d89-9b23-e40eff479131",
  "expected_version": 1
}
```

```json
{
  "id": "aa1a51b4-9642-4caf-b3d8-f75e37572829",
  "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
  "assignment_id": "825e4593-5aa1-41ec-ab09-58d89203641f",
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
  "arrived_at": "2026-10-27T14:44:19.382525Z",
  "started_at": "2026-10-27T14:44:19.415455Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/aa1a51b4-9642-4caf-b3d8-f75e37572829/complete` → **200**

```json
{
  "command_id": "8a13915e-ed0a-4d2d-a7e8-b540a8825fdd",
  "expected_version": 2,
  "reported_at": "2026-10-27T14:44:19Z",
  "cash_received": true
}
```

```json
{
  "id": "aa1a51b4-9642-4caf-b3d8-f75e37572829",
  "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
  "assignment_id": "825e4593-5aa1-41ec-ab09-58d89203641f",
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
  "arrived_at": "2026-10-27T14:44:19.382525Z",
  "started_at": "2026-10-27T14:44:19.415455Z",
  "completed_at": "2026-10-27T14:44:19.454336Z",
  "needs_review": false
}
```

`GET /api/operator/v1/orders/18ba694d-f816-4df4-8d6b-64840c036107` → **200**

```json
{
  "id": "18ba694d-f816-4df4-8d6b-64840c036107",
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
    "id": "825e4593-5aa1-41ec-ab09-58d89203641f",
    "order_id": "18ba694d-f816-4df4-8d6b-64840c036107",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "aa1a51b4-9642-4caf-b3d8-f75e37572829",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T14:44:19.222271Z",
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

Done: terminal order 18ba694d-f816-4df4-8d6b-64840c036107 by Andrii (5a000000-0000-4000-8000-000000000403).
