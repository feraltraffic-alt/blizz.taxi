# Sandbox transcript (2026-10-27T10:28:23Z, 182af3e)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637721077",
  "device_ref": "sandbox-11785"
}
```

```json
{
  "challenge_id": "9b229e98-ea4b-4dcb-8cda-a363bb631d71",
  "expires_at": "2026-10-27T10:33:23.547481357Z",
  "resend_available_at": "2026-10-27T10:28:24.547481357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637721077` → **200**

```json
{
  "phone": "+380637721077",
  "audience": "CLIENT",
  "code": "996491",
  "sent_at": "2026-10-27T10:28:23.552957071Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b229e98-ea4b-4dcb-8cda-a363bb631d71",
  "code": "996491",
  "device_ref": "sandbox-11785"
}
```

```json
{
  "session_id": "234365ed-e410-4571-a746-e580825c9cf1",
  "subject": {
    "type": "CLIENT",
    "id": "8fff6819-6e18-4b10-b6f9-648c54ea0123"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmZmNjgxOS02ZTE4LTRiMTAtYjZmOS02NDhjNTRlYTAxMjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk3ODAzLCJpYXQiOjE3OTMwOTY5MDMsImp0aSI6IjdiMDY1OGZiLTc3ZTEtNDY5Yi04YTVhLTVjOTkzMTE4MTYyYiIsInNpZCI6IjIzNDM2NWVkLWU0MTAtNDU3MS1hNzQ2LWU1ODA4MjVjOWNmMSJ9.7sdsJOyq4_NuMfQ9l4xchqy9hU1QeXApO84h9MLyqYI",
  "access_expires_at": "2026-10-27T10:43:23.624953676Z",
  "refresh_token": "VZ51UeIV-vWtTc5q2isS7Dq62vOxMat4aBGtc2pmKI8",
  "refresh_expires_at": "2026-11-26T10:28:23.623540918Z",
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
        "en": "Changed my mind",
        "ru": "Передумал ехать",
        "pl": "Zmiana planów"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом",
        "pl": "Błędny adres"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
        "ru": "Уеду на другом транспорте",
        "pl": "Inny transport"
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
  "device_ref": "sandbox-17093"
}
```

```json
{
  "challenge_id": "c5b1f00c-03d1-46bc-bb96-fc08b5ec3bdb",
  "expires_at": "2026-10-27T10:33:23.726184946Z",
  "resend_available_at": "2026-10-27T10:28:24.726184946Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "897278",
  "sent_at": "2026-10-27T10:28:23.731288276Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5b1f00c-03d1-46bc-bb96-fc08b5ec3bdb",
  "code": "897278",
  "device_ref": "sandbox-17093"
}
```

```json
{
  "session_id": "873cc8d4-550c-4aa9-aa11-8a85bbf3ca9d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NzgwMywiaWF0IjoxNzkzMDk2OTAzLCJqdGkiOiI5ZDI1MDNjYy02YzQwLTRiMjQtODA5Yy1lNDlhNWYxYzU3NWUiLCJzaWQiOiI4NzNjYzhkNC01NTBjLTRhYTktYWExMS04YTg1YmJmM2NhOWQifQ.LLTPfx5-4p7ax4_IVvH5VtckQyir79SyTs5R4mXBBzM",
  "access_expires_at": "2026-10-27T10:43:23.780684563Z",
  "refresh_token": "u4kSb2SQwVC3v6Hcfa3oYuFCvPxBINusQaeqLF9NXeE",
  "refresh_expires_at": "2026-11-26T10:28:23.779754526Z",
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
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел",
        "pl": "Pasażer nie przyszedł"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля",
        "pl": "Awaria samochodu"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
        "ru": "Не могу подъехать",
        "pl": "Nie mogę dojechać"
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
  "correlation_id": "b4b488f9-042b-45b7-b238-ad26f93a48ca"
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
  "session_id": "643658fc-20d6-4f37-9186-de14e9db5e14",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MDQsImlhdCI6MTc5MzA5NjkwNCwianRpIjoiYzUwZDVhMGItYzFkOS00OTQ0LThiN2EtYzIwMWI5YTBjZTk0Iiwic2lkIjoiNjQzNjU4ZmMtMjBkNi00ZjM3LTkxODYtZGUxNGU5ZGI1ZTE0In0.Uwq_JhsV2Y5n5fWi9maUrap-nEfVunO-gEh1xI6uH5M",
  "access_expires_at": "2026-10-27T10:43:24.292980233Z",
  "refresh_token": "uukaYoWeIH-2GY5FQDQKvV4Kj56fbWSRQEVD_yADDIw",
  "refresh_expires_at": "2026-10-27T22:28:24.291968923Z",
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
  "session_id": "4cd2bc3f-f3b8-465b-b5d0-ca968e1aa727",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MDUsImlhdCI6MTc5MzA5NjkwNSwianRpIjoiMTI0ODc2NjYtZDk3Yy00YzA0LTkyY2MtYzAxMTVlZDM1ZDc4Iiwic2lkIjoiNGNkMmJjM2YtZjNiOC00NjViLWI1ZDAtY2E5NjhlMWFhNzI3In0.GW84eRrLXWi1qSRJSk7oaDtHjQsfecb2qpGJQJshl5M",
  "access_expires_at": "2026-10-27T10:43:25.179788966Z",
  "refresh_token": "KyHmo68ki8W3Ts_c8EhmxX_zCuwQ0cvE-c3P3B2aiGU",
  "refresh_expires_at": "2026-10-27T22:28:25.178931698Z",
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
  "session_id": "2066e96e-deff-4870-be21-528f9fee36e8",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MDUsImlhdCI6MTc5MzA5NjkwNSwianRpIjoiNDI4OTFkMjMtMDVjMi00M2U2LThhNDgtZTQ1OTdlMWVmOGE2Iiwic2lkIjoiMjA2NmU5NmUtZGVmZi00ODcwLWJlMjEtNTI4ZjlmZWUzNmU4In0.fk1CnFS4aSq-CD8vRx1RJpaHqrBtsEjGGv0En21UBIg",
  "access_expires_at": "2026-10-27T10:43:25.41599905Z",
  "refresh_token": "If4kHQxErFah29N04-oUN0au868OGONNtMq8X1pMoqE",
  "refresh_expires_at": "2026-10-27T22:28:25.415193382Z",
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
        "en": "Passenger asked",
        "ru": "Пассажир попросил",
        "pl": "Na prośbę pasażera"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа",
        "pl": "Duplikat zamówienia"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин",
        "pl": "Brak wolnych aut"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ",
        "pl": "Zamówienie testowe"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "uk": "ДТП",
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek"
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
  "command_id": "5f96403c-43d8-432e-8391-692b90c2eeda",
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
  "id": "c1946bc9-9cc5-463f-864f-b5b864c44cc6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T10:33:25.571841Z",
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
  "command_id": "7e944abd-23c8-4c48-98fb-078c62c9892b",
  "quote_id": "c1946bc9-9cc5-463f-864f-b5b864c44cc6",
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
  "id": "170ecd37-a9b3-44d9-8b22-c33dbb8e0f74",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fff6819-6e18-4b10-b6f9-648c54ea0123",
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
  "created_at": "2026-10-27T10:28:25.644369Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/170ecd37-a9b3-44d9-8b22-c33dbb8e0f74` → **200**

```json
{
  "id": "170ecd37-a9b3-44d9-8b22-c33dbb8e0f74",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fff6819-6e18-4b10-b6f9-648c54ea0123",
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
  "created_at": "2026-10-27T10:28:25.644369Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/170ecd37-a9b3-44d9-8b22-c33dbb8e0f74/cancel` → **200**

```json
{
  "command_id": "c0d4165c-f8ed-4306-8f5d-07a478cf6ec6",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "170ecd37-a9b3-44d9-8b22-c33dbb8e0f74",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8fff6819-6e18-4b10-b6f9-648c54ea0123",
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
  "created_at": "2026-10-27T10:28:25.644369Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
      "ru": "Долго ждать машину",
      "pl": "Zbyt długie oczekiwanie"
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
  "command_id": "3759c97a-2577-44ed-865c-68d31a1eff74",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:25Z",
    "sequence": 1793096905808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a546c6ee-dec2-42fa-adaf-e498a6bf9ba1",
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
  "last_heartbeat_at": "2026-10-27T10:28:25.84638Z",
  "last_location_at": "2026-10-27T10:28:25.84638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1171"
}
```

```json
{
  "challenge_id": "a300eb82-32ba-48b1-ab7b-18852ff201db",
  "expires_at": "2026-10-27T10:33:25.885865681Z",
  "resend_available_at": "2026-10-27T10:28:26.885865681Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "282602",
  "sent_at": "2026-10-27T10:28:25.89057848Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a300eb82-32ba-48b1-ab7b-18852ff201db",
  "code": "282602",
  "device_ref": "sandbox-1171"
}
```

```json
{
  "session_id": "88f6a30b-95c6-41b6-91c0-93a01ca082a7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NzgwNSwiaWF0IjoxNzkzMDk2OTA1LCJqdGkiOiJjYWQwODAwMS0zNTdjLTQxZTctOTYyYy1lN2U4ZTU1ZmViYmYiLCJzaWQiOiI4OGY2YTMwYi05NWM2LTQxYjYtOTFjMC05M2EwMWNhMDgyYTcifQ.-83Vi9l5Wq4cFNCBNWkh3B2h0svyMlz93SKn6n205tE",
  "access_expires_at": "2026-10-27T10:43:25.93808897Z",
  "refresh_token": "8_0f20PxrewHVil8GBrAZ_FX-u6kJrc8v565D8v6e2E",
  "refresh_expires_at": "2026-11-26T10:28:25.937342372Z",
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
  "command_id": "34e2b268-c526-4284-8b2e-397093775c68",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:25Z",
    "sequence": 1793096905983
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "0eca8d7f-7f78-4a24-b307-04daae307aeb",
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
  "last_heartbeat_at": "2026-10-27T10:28:25.998448Z",
  "last_location_at": "2026-10-27T10:28:25.998448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b13df0e-b159-45dc-95c9-24a2732514ac",
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
  "id": "27682c0d-88b1-4543-8afc-5853d264dc29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T10:33:26.034928Z",
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
  "command_id": "3c7bd55f-9cc8-4969-bfc1-b18bc5972ab0",
  "quote_id": "27682c0d-88b1-4543-8afc-5853d264dc29",
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
  "id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fff6819-6e18-4b10-b6f9-648c54ea0123",
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
  "created_at": "2026-10-27T10:28:26.069626Z",
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
    "id": "ab208f66-d1c0-4184-9987-e866e7fb658a",
    "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
    "expires_at": "2026-10-27T10:28:41.073265Z",
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

`POST /api/driver/v1/offers/ab208f66-d1c0-4184-9987-e866e7fb658a/accept` → **200**

```json
{
  "command_id": "6a4a8e9a-ebb9-4098-85b1-d38390934526"
}
```

```json
{
  "id": "d5a0dcdf-78a5-4708-ac2b-0d9820ecdfa9",
  "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e9104559-629b-4ee2-b73a-041ba3a7085d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e9104559-629b-4ee2-b73a-041ba3a7085d",
  "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "assignment_id": "d5a0dcdf-78a5-4708-ac2b-0d9820ecdfa9",
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

`POST /api/driver/v1/trips/e9104559-629b-4ee2-b73a-041ba3a7085d/cancel` → **200**

```json
{
  "command_id": "f1dfc12b-19e8-406f-8abc-8bc573a53054",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "e9104559-629b-4ee2-b73a-041ba3a7085d",
  "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "assignment_id": "d5a0dcdf-78a5-4708-ac2b-0d9820ecdfa9",
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

`GET /api/rider/v1/orders/6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8` → **200**

```json
{
  "id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8fff6819-6e18-4b10-b6f9-648c54ea0123",
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
    "id": "d5a0dcdf-78a5-4708-ac2b-0d9820ecdfa9",
    "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "e9104559-629b-4ee2-b73a-041ba3a7085d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T10:28:26.069626Z",
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
    "id": "cc7e55e7-7530-4635-bf62-8cd986e260c6",
    "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
    "expires_at": "2026-10-27T10:28:41.221237Z",
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

`POST /api/driver/v1/offers/cc7e55e7-7530-4635-bf62-8cd986e260c6/accept` → **200**

```json
{
  "command_id": "1ff0b33c-f1c7-4c63-80c1-046f9b95dea7"
}
```

```json
{
  "id": "5dd93dc1-1c28-42b8-ad3f-0ade53d0f076",
  "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6957af6b-d7a4-43bf-9043-a99f42309d4f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6957af6b-d7a4-43bf-9043-a99f42309d4f",
  "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "assignment_id": "5dd93dc1-1c28-42b8-ad3f-0ade53d0f076",
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

`POST /api/driver/v1/trips/6957af6b-d7a4-43bf-9043-a99f42309d4f/cancel` → **200**

```json
{
  "command_id": "e0a3f329-345e-4f48-a46d-2622e1f8e41b",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "6957af6b-d7a4-43bf-9043-a99f42309d4f",
  "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
  "assignment_id": "5dd93dc1-1c28-42b8-ad3f-0ade53d0f076",
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
    "id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T10:28:26.069626Z",
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
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить",
        "pl": "Pasażer poprosił o anulowanie"
      }
    },
    "pickup_at": null
  },
  {
    "id": "170ecd37-a9b3-44d9-8b22-c33dbb8e0f74",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T10:28:25.644369Z",
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
        "en": "The wait is too long",
        "ru": "Долго ждать машину",
        "pl": "Zbyt długie oczekiwanie"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T10:28:26.07024Z",
      "actor": {
        "type": "CLIENT",
        "id": "8fff6819-6e18-4b10-b6f9-648c54ea0123",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
        "quote_id": "27682c0d-88b1-4543-8afc-5853d264dc29",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T10:28:26.072175Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
        "attempt_id": "4551f5d7-ed0b-4385-b883-32ce1c039594",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T10:28:26.08383Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ab208f66-d1c0-4184-9987-e866e7fb658a",
        "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T10:28:26.149132Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ab208f66-d1c0-4184-9987-e866e7fb658a",
        "order_id": "6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "d5a0dcdf-78a5-4708-ac2b-0d9820ecdfa9"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 170ecd37-a9b3-44d9-8b22-c33dbb8e0f74, 6ae0dcb4-10e2-4a73-ad5d-84a842f1b6b8.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735103260",
  "device_ref": "sandbox-15169"
}
```

```json
{
  "challenge_id": "d53faeea-b71d-4821-82d1-c493c2c5e922",
  "expires_at": "2026-10-27T10:33:26.450612635Z",
  "resend_available_at": "2026-10-27T10:28:27.450612635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380735103260` → **200**

```json
{
  "phone": "+380735103260",
  "audience": "CLIENT",
  "code": "385903",
  "sent_at": "2026-10-27T10:28:26.453571025Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d53faeea-b71d-4821-82d1-c493c2c5e922",
  "code": "385903",
  "device_ref": "sandbox-15169"
}
```

```json
{
  "session_id": "32c8333f-d80b-4787-86b7-ad510f95ad47",
  "subject": {
    "type": "CLIENT",
    "id": "0b5eebba-29bb-43a0-a554-deccf4cfcfd8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjVlZWJiYS0yOWJiLTQzYTAtYTU1NC1kZWNjZjRjZmNmZDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk3ODA2LCJpYXQiOjE3OTMwOTY5MDYsImp0aSI6ImEwZWRjNjlmLTk4NTQtNDUzYi04Yzk0LWMzM2Y5NmVmZWQyMSIsInNpZCI6IjMyYzgzMzNmLWQ4MGItNDc4Ny04NmI3LWFkNTEwZjk1YWQ0NyJ9.wRRPRC4md-pGURoy0CfCI7NItwKZLpvdQ9GiGkAATGA",
  "access_expires_at": "2026-10-27T10:43:26.500041187Z",
  "refresh_token": "ZjDNuiz9ymkpUk60IvRzHs7il_gvc0b6C3Cff79kQos",
  "refresh_expires_at": "2026-11-26T10:28:26.499122827Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1d8a7a45-1c0d-433b-8fc3-1754003f78a0",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "761338c9-efa4-48c3-9856-a08a7e976254",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-761338c9-efa4-48c3-9856-a08a7e976254",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "4e90c90fd9fb06e2a4189520fa7cd552",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=761338c9-efa4-48c3-9856-a08a7e976254",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735103260"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=761338c9-efa4-48c3-9856-a08a7e976254",
  "expires_at": "2026-10-27T10:58:26.532956Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/761338c9-efa4-48c3-9856-a08a7e976254` → **200**

```json
{
  "id": "761338c9-efa4-48c3-9856-a08a7e976254",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T10:58:26.532956Z",
  "card": {
    "id": "512e4bd5-f72c-4ebf-9669-bb71eaa86fe9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8376",
    "card_type": "Visa",
    "created_at": "2026-10-27T10:28:26.570675Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "512e4bd5-f72c-4ebf-9669-bb71eaa86fe9",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8376",
      "card_type": "Visa",
      "created_at": "2026-10-27T10:28:26.570675Z"
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
  "device_ref": "sandbox-13277"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "b6f6a52b-620d-4a31-94fa-81d29011b37e",
  "retryable": true,
  "retry_after_seconds": 1
}
```

**Expected 201, got 429 — scenario stopped.**

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
  "device_ref": "sandbox-13999"
}
```

```json
{
  "challenge_id": "d84350f9-12f3-460c-b5e4-1c81522170ba",
  "expires_at": "2026-10-27T10:33:26.713290858Z",
  "resend_available_at": "2026-10-27T10:28:27.713290858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "490748",
  "sent_at": "2026-10-27T10:28:26.716359505Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d84350f9-12f3-460c-b5e4-1c81522170ba",
  "code": "490748",
  "device_ref": "sandbox-13999"
}
```

```json
{
  "session_id": "d61d6987-b597-49e0-88c0-7750cd6ec231",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NzgwNiwiaWF0IjoxNzkzMDk2OTA2LCJqdGkiOiIwZDlmZGViYy04N2VjLTRhZjAtOGEyMC01NWUzMGM4MDg5ZWEiLCJzaWQiOiJkNjFkNjk4Ny1iNTk3LTQ5ZTAtODhjMC03NzUwY2Q2ZWMyMzEifQ.NtpKOPkvNeTct7V5Hs2RRc8ry5WXIeVSKwLiTc_U_tc",
  "access_expires_at": "2026-10-27T10:43:26.764270722Z",
  "refresh_token": "SAwDd2dcQ4_kaWxoTE-BOzciSOrbqWqb0xk13bAGf0Y",
  "refresh_expires_at": "2026-11-26T10:28:26.76366064Z",
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
  "command_id": "f6627544-4633-47c6-81b9-0ecd6f66dc64",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:26Z",
    "sequence": 1793096906812
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:26.827774Z",
  "last_location_at": "2026-10-27T10:28:26.827774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674862529",
  "device_ref": "sandbox-31025"
}
```

```json
{
  "challenge_id": "10559cb8-b04e-4421-87d9-9702c251dfaa",
  "expires_at": "2026-10-27T10:33:26.856673817Z",
  "resend_available_at": "2026-10-27T10:28:27.856673817Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674862529` → **200**

```json
{
  "phone": "+380674862529",
  "audience": "CLIENT",
  "code": "965794",
  "sent_at": "2026-10-27T10:28:26.859137739Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10559cb8-b04e-4421-87d9-9702c251dfaa",
  "code": "965794",
  "device_ref": "sandbox-31025"
}
```

```json
{
  "session_id": "da3a9551-1f98-47b2-8653-db1a82460a71",
  "subject": {
    "type": "CLIENT",
    "id": "998cf981-cb56-4409-a642-9e300b43f869"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OThjZjk4MS1jYjU2LTQ0MDktYTY0Mi05ZTMwMGI0M2Y4NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk3ODA2LCJpYXQiOjE3OTMwOTY5MDYsImp0aSI6ImEzOTcyMjgyLTEyY2EtNGUwNC05NzQ3LTdhMGI3NTYyMDFhNiIsInNpZCI6ImRhM2E5NTUxLTFmOTgtNDdiMi04NjUzLWRiMWE4MjQ2MGE3MSJ9.xnekpsBYw1RPzh01wenNaUgZZsSQ2GbP_kFA1y0-X-E",
  "access_expires_at": "2026-10-27T10:43:26.904325625Z",
  "refresh_token": "GkeGok6NwDfljzkiKzS02fzLCFs-3fTMty99A4ykWvU",
  "refresh_expires_at": "2026-11-26T10:28:26.903662282Z",
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
  "command_id": "596d6a9d-c276-4bcd-ad9f-a67c03d8e2fd",
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
  "id": "61b7807e-45ab-498b-bceb-5847f5d17805",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T10:33:26.962573Z",
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
  "command_id": "b22c425a-ceac-4ba8-9e5b-6cf52f75709c",
  "quote_id": "61b7807e-45ab-498b-bceb-5847f5d17805",
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
  "id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "998cf981-cb56-4409-a642-9e300b43f869",
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
  "created_at": "2026-10-27T10:28:26.998209Z",
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
    "id": "35164453-9498-4b3f-9624-746d56d581d2",
    "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
    "expires_at": "2026-10-27T10:28:42.00129Z",
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

`POST /api/driver/v1/offers/35164453-9498-4b3f-9624-746d56d581d2/accept` → **200**

```json
{
  "command_id": "02566b48-9a52-48ab-b559-bf35ee3adf77"
}
```

```json
{
  "id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "391f0b45-6006-46cf-86d2-247ced833ca7",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13/messages` → **201**

```json
{
  "command_id": "a4bc5497-25de-4853-9039-55ff5c90a487",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "3f2fe4eb-2811-44d1-9c7b-3e7343cd7d35",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T10:28:27.095360368Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "391f0b45-6006-46cf-86d2-247ced833ca7",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "assignment_id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
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

`POST /api/driver/v1/trips/391f0b45-6006-46cf-86d2-247ced833ca7/messages` → **201**

```json
{
  "command_id": "3cb83851-0b85-4ad7-afb9-0ab1b7961299",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ac1df6d8-2e1c-48cc-850f-b93c32b9cbc2",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T10:28:27.142588396Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/391f0b45-6006-46cf-86d2-247ced833ca7/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380674862529"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/025a577a-745c-4077-8422-472636738099/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:27Z",
    "sequence": 1793096907210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:27.227844Z",
  "last_location_at": "2026-10-27T10:28:27.227844Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "391f0b45-6006-46cf-86d2-247ced833ca7",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "assignment_id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
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

`POST /api/driver/v1/trips/391f0b45-6006-46cf-86d2-247ced833ca7/arrive` → **200**

```json
{
  "command_id": "9ab83d3b-b36d-4192-a22a-737281fac475",
  "expected_version": 0
}
```

```json
{
  "id": "391f0b45-6006-46cf-86d2-247ced833ca7",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "assignment_id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
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
  "arrived_at": "2026-10-27T10:28:27.280905Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/391f0b45-6006-46cf-86d2-247ced833ca7/start` → **200**

```json
{
  "command_id": "79cb9970-ff63-4d1e-9bec-cbd21510a713",
  "expected_version": 1
}
```

```json
{
  "id": "391f0b45-6006-46cf-86d2-247ced833ca7",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "assignment_id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
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
  "arrived_at": "2026-10-27T10:28:27.280905Z",
  "started_at": "2026-10-27T10:28:27.316174Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/025a577a-745c-4077-8422-472636738099/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:27Z",
    "sequence": 1793096907339
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:27.355374Z",
  "last_location_at": "2026-10-27T10:28:27.355374Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/391f0b45-6006-46cf-86d2-247ced833ca7/complete` → **200**

```json
{
  "command_id": "4d62f849-ff75-42f7-a1f2-86e892d47b1d",
  "expected_version": 2,
  "reported_at": "2026-10-27T10:28:27Z",
  "cash_received": true
}
```

```json
{
  "id": "391f0b45-6006-46cf-86d2-247ced833ca7",
  "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "assignment_id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
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
  "arrived_at": "2026-10-27T10:28:27.280905Z",
  "started_at": "2026-10-27T10:28:27.316174Z",
  "completed_at": "2026-10-27T10:28:27.393784Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13` → **200**

```json
{
  "id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "998cf981-cb56-4409-a642-9e300b43f869",
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
    "id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291",
    "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "391f0b45-6006-46cf-86d2-247ced833ca7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T10:28:26.998209Z",
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
    "id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
    "short_number": 3,
    "status": "FULFILLED",
    "created_at": "2026-10-27T10:28:26.998209Z",
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
    "id": "391f0b45-6006-46cf-86d2-247ced833ca7",
    "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
    "order_short_number": 3,
    "created_at": "2026-10-27T10:28:27.056114Z",
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
  "session_id": "d2964c1e-e8fa-4cc6-9ae1-3c801cd31893",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MTAsImlhdCI6MTc5MzA5NjkxMCwianRpIjoiZjc5NDFjOWUtMzdjMi00MzA2LTkyN2YtZWI0M2FkMTQ3ZTJmIiwic2lkIjoiZDI5NjRjMWUtZThmYS00Y2M2LTlhZTEtM2M4MDFjZDMxODkzIn0.Z9OTeyVqZaKYK4T37eFd-6K089sOoThxRp4KWJW_ijs",
  "access_expires_at": "2026-10-27T10:43:30.734177464Z",
  "refresh_token": "5LgaXmUWi_frKzoEG28VK2VQKJGwyirUg9ZHtw0HBCQ",
  "refresh_expires_at": "2026-10-27T22:28:30.733550772Z",
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
  "session_id": "e679c110-ee86-4b5d-916a-6ac027c36210",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MTAsImlhdCI6MTc5MzA5NjkxMCwianRpIjoiYmVhM2ZjOGYtZDkwNy00NzNlLWE3ZTEtNzA1ZDdjNjdmYjk4Iiwic2lkIjoiZTY3OWMxMTAtZWU4Ni00YjVkLTkxNmEtNmFjMDI3YzM2MjEwIn0.eq5gsHsNaTeBiZaVHdfknkqZdpswWJ4a7plxB4gO6Gg",
  "access_expires_at": "2026-10-27T10:43:30.969256457Z",
  "refresh_token": "TJdljUz2gqnmnejtCjAdFt5Y_1GUzU1Gn6RG8ZxnjTE",
  "refresh_expires_at": "2026-10-27T22:28:30.96868973Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T10:28:26.998897Z",
      "actor": {
        "type": "CLIENT",
        "id": "998cf981-cb56-4409-a642-9e300b43f869",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
        "quote_id": "61b7807e-45ab-498b-bceb-5847f5d17805",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T10:28:27.000484Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
        "attempt_id": "c1aa37d5-b8ac-44e6-85ab-b94b23087c94",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T10:28:27.005102Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "35164453-9498-4b3f-9624-746d56d581d2",
        "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T10:28:27.057843Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "35164453-9498-4b3f-9624-746d56d581d2",
        "order_id": "8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "744f0e5e-2aaa-4b4d-ae88-cfba25adf291"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 8f093d19-f8b7-4b1d-a2fd-450dbfaf4c13.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-741"
}
```

```json
{
  "challenge_id": "7e977190-4afd-472d-a100-1fd1e6bd1ae7",
  "expires_at": "2026-10-27T10:33:31.025737598Z",
  "resend_available_at": "2026-10-27T10:28:32.025737598Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "640383",
  "sent_at": "2026-10-27T10:28:31.028267073Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e977190-4afd-472d-a100-1fd1e6bd1ae7",
  "code": "640383",
  "device_ref": "sandbox-741"
}
```

```json
{
  "session_id": "1a502c4d-75a3-414c-8db6-dadebf4093c2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NzgxMSwiaWF0IjoxNzkzMDk2OTExLCJqdGkiOiJiMzIxMmQyZC0xYmJkLTQ2MDctODUyMS1mYjllNmQwYzI1ZWUiLCJzaWQiOiIxYTUwMmM0ZC03NWEzLTQxNGMtOGRiNi1kYWRlYmY0MDkzYzIifQ.wLX4quVXDLMgh3VF1rAv5ayslZoJCHFJCk2-bTCZcfE",
  "access_expires_at": "2026-10-27T10:43:31.074362281Z",
  "refresh_token": "q2J4mWfBcF3wJeWEF3kzsAPrEjY76S_rbOht376DynA",
  "refresh_expires_at": "2026-11-26T10:28:31.07380634Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:27.355374Z",
  "last_location_at": "2026-10-27T10:28:27.355374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/025a577a-745c-4077-8422-472636738099/handover` → **200**

```json
{
  "command_id": "c0f2d83e-1db6-412a-bcf4-72625ab4f9ac",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:27.355374Z",
  "last_location_at": "2026-10-27T10:28:27.355374Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/025a577a-745c-4077-8422-472636738099/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:31Z",
    "sequence": 1793096911154
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:31.168564Z",
  "last_location_at": "2026-10-27T10:28:31.168564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664686832",
  "device_ref": "sandbox-5922"
}
```

```json
{
  "challenge_id": "c988171e-e4e7-4590-b0f8-fe2ef940ac62",
  "expires_at": "2026-10-27T10:33:31.211854347Z",
  "resend_available_at": "2026-10-27T10:28:32.211854347Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664686832` → **200**

```json
{
  "phone": "+380664686832",
  "audience": "CLIENT",
  "code": "706806",
  "sent_at": "2026-10-27T10:28:31.213964017Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c988171e-e4e7-4590-b0f8-fe2ef940ac62",
  "code": "706806",
  "device_ref": "sandbox-5922"
}
```

```json
{
  "session_id": "924566f8-7fd1-496d-aed5-646f727cbe67",
  "subject": {
    "type": "CLIENT",
    "id": "c7e41f85-1712-4169-9867-4ac18d2a9b4e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjN2U0MWY4NS0xNzEyLTQxNjktOTg2Ny00YWMxOGQyYTliNGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk3ODExLCJpYXQiOjE3OTMwOTY5MTEsImp0aSI6ImRmMmIwZmY5LWVlMjktNGU3Ni04MDYyLWRiZDUwNGI3NzU1MSIsInNpZCI6IjkyNDU2NmY4LTdmZDEtNDk2ZC1hZWQ1LTY0NmY3MjdjYmU2NyJ9.AHx4QO88h28ih8ssAfmPzwMqwYoeTdpluFQLLwKmino",
  "access_expires_at": "2026-10-27T10:43:31.258273109Z",
  "refresh_token": "MoTaqkBCf-P3WZJtPzUBBNfFBKVWtA32Pa7wUbAdHEk",
  "refresh_expires_at": "2026-11-26T10:28:31.257869268Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a527b131-81c1-4681-8ec0-89e11abe5e39",
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
  "id": "04243691-7308-47fa-84a8-c94f2d4f24b7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T10:33:31.289165Z",
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
  "command_id": "295a3361-a329-4949-b0c3-d027a7795916",
  "quote_id": "04243691-7308-47fa-84a8-c94f2d4f24b7",
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
  "id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c7e41f85-1712-4169-9867-4ac18d2a9b4e",
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
  "created_at": "2026-10-27T10:28:31.32061Z",
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
    "id": "db960db5-8012-4a03-86a3-46bfe3a34d01",
    "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
    "expires_at": "2026-10-27T10:28:46.323184Z",
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

`POST /api/driver/v1/offers/db960db5-8012-4a03-86a3-46bfe3a34d01/accept` → **200**

```json
{
  "command_id": "148c4bc6-4d6f-4b1a-976b-f90f23564b9d"
}
```

```json
{
  "id": "d3988b96-bb39-44b9-b875-5ab30cfef077",
  "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9216a6e2-9a93-425d-9d71-5d26e987b2dd",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9216a6e2-9a93-425d-9d71-5d26e987b2dd",
  "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
  "assignment_id": "d3988b96-bb39-44b9-b875-5ab30cfef077",
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

`POST /api/driver/v1/work-sessions/025a577a-745c-4077-8422-472636738099/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:31Z",
    "sequence": 1793096911411
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:31.425077Z",
  "last_location_at": "2026-10-27T10:28:31.425077Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9216a6e2-9a93-425d-9d71-5d26e987b2dd/arrive` → **200**

```json
{
  "command_id": "fe524e03-8a5b-4d62-a619-195d108106b1",
  "expected_version": 0
}
```

```json
{
  "id": "9216a6e2-9a93-425d-9d71-5d26e987b2dd",
  "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
  "assignment_id": "d3988b96-bb39-44b9-b875-5ab30cfef077",
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
  "arrived_at": "2026-10-27T10:28:31.456592Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/9216a6e2-9a93-425d-9d71-5d26e987b2dd/start` → **200**

```json
{
  "command_id": "cfa0d9bb-c352-45c9-9640-d2178f9d52c8",
  "expected_version": 1
}
```

```json
{
  "id": "9216a6e2-9a93-425d-9d71-5d26e987b2dd",
  "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
  "assignment_id": "d3988b96-bb39-44b9-b875-5ab30cfef077",
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
  "arrived_at": "2026-10-27T10:28:31.456592Z",
  "started_at": "2026-10-27T10:28:31.489242Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/025a577a-745c-4077-8422-472636738099/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:31Z",
    "sequence": 1793096911510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "025a577a-745c-4077-8422-472636738099",
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
  "last_heartbeat_at": "2026-10-27T10:28:31.524614Z",
  "last_location_at": "2026-10-27T10:28:31.524614Z",
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
  "device_ref": "sandbox-7761"
}
```

```json
{
  "challenge_id": "830b0ad7-f75f-4e6d-b85f-695febd54dbd",
  "expires_at": "2026-10-27T10:33:31.544941696Z",
  "resend_available_at": "2026-10-27T10:28:32.544941696Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "745940",
  "sent_at": "2026-10-27T10:28:31.547006258Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "830b0ad7-f75f-4e6d-b85f-695febd54dbd",
  "code": "745940",
  "device_ref": "sandbox-7761"
}
```

```json
{
  "session_id": "591fe6f7-a488-435b-ae55-790d893e2931",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NzgxMSwiaWF0IjoxNzkzMDk2OTExLCJqdGkiOiJmOTExNDM2ZC1lMDA0LTRkMzItOTk4Zi1iYTZiYWExMDY0MGYiLCJzaWQiOiI1OTFmZTZmNy1hNDg4LTQzNWItYWU1NS03OTBkODkzZTI5MzEifQ.IPYtdlpCOHs59D3n9hihP6kt7oz9hxuIgNOmUMiWvec",
  "access_expires_at": "2026-10-27T10:43:31.590807165Z",
  "refresh_token": "CETes00eBTVgIU9jfqtJtukJIvzL-uw9useJptpiOyI",
  "refresh_expires_at": "2026-11-26T10:28:31.590293899Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a546c6ee-dec2-42fa-adaf-e498a6bf9ba1",
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
  "last_heartbeat_at": "2026-10-27T10:28:25.84638Z",
  "last_location_at": "2026-10-27T10:28:25.84638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a546c6ee-dec2-42fa-adaf-e498a6bf9ba1/handover` → **200**

```json
{
  "command_id": "77e72a26-8edf-48bf-8303-52ecba2e3a63",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a546c6ee-dec2-42fa-adaf-e498a6bf9ba1",
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
  "last_heartbeat_at": "2026-10-27T10:28:25.84638Z",
  "last_location_at": "2026-10-27T10:28:25.84638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a546c6ee-dec2-42fa-adaf-e498a6bf9ba1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:31Z",
    "sequence": 1793096911662
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a546c6ee-dec2-42fa-adaf-e498a6bf9ba1",
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
  "last_heartbeat_at": "2026-10-27T10:28:31.676025Z",
  "last_location_at": "2026-10-27T10:28:31.676025Z",
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
  "session_id": "de143365-e442-4767-8023-ab093aa2f3d8",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MTEsImlhdCI6MTc5MzA5NjkxMSwianRpIjoiNTczNWE3MmUtYTQ5OC00OTQ5LWExN2UtMzg1NjBiYWRhYTY5Iiwic2lkIjoiZGUxNDMzNjUtZTQ0Mi00NzY3LTgwMjMtYWIwOTNhYTJmM2Q4In0.q77wyL_CT-1PS200kf_9Ag_tcC9q7cck94HeNpx1gJ8",
  "access_expires_at": "2026-10-27T10:43:31.909489637Z",
  "refresh_token": "rKovpvsHv7A3CHdalJ-0n4GyhIi32UMrXjI-GMUSQoM",
  "refresh_expires_at": "2026-10-27T22:28:31.90906169Z",
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
  "session_id": "4764bbf5-9ef1-4512-a85f-51a555e9c446",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MTIsImlhdCI6MTc5MzA5NjkxMiwianRpIjoiN2EzNDFmNTEtYzhhYS00Y2VhLTg1MjEtZjBjNmM5ZWIzOTJhIiwic2lkIjoiNDc2NGJiZjUtOWVmMS00NTEyLWE4NWYtNTFhNTU1ZTljNDQ2In0.cOfJAum47lDDqplvFFIFbdUriqyiiiLRPvyRM1KshDY",
  "access_expires_at": "2026-10-27T10:43:32.148243465Z",
  "refresh_token": "aq5xwy5LlKp9EySfyRBiwTEuJWXBzgKY9mqGl86kWe0",
  "refresh_expires_at": "2026-10-27T22:28:32.147773474Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d65b3df8-8197-4626-948b-7cf56ff9b601` → **200**

```json
{
  "id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
  "short_number": 4,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c7e41f85-1712-4169-9867-4ac18d2a9b4e",
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
    "id": "d3988b96-bb39-44b9-b875-5ab30cfef077",
    "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "9216a6e2-9a93-425d-9d71-5d26e987b2dd",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T10:28:31.32061Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d65b3df8-8197-4626-948b-7cf56ff9b601/interrupt` → **200**

```json
{
  "command_id": "09ab1471-c166-4f79-9f0a-199c0dd39c60",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
    "short_number": 4,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "c7e41f85-1712-4169-9867-4ac18d2a9b4e",
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
      "id": "d3988b96-bb39-44b9-b875-5ab30cfef077",
      "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "9216a6e2-9a93-425d-9d71-5d26e987b2dd",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T10:28:31.32061Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "36369311-70a2-4ca4-b739-984cf11325f6",
    "short_number": 5,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "c7e41f85-1712-4169-9867-4ac18d2a9b4e",
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
    "id": "afd32e92-47a2-4443-ab7a-b0c1d2c51a34",
    "order_id": "36369311-70a2-4ca4-b739-984cf11325f6",
    "expires_at": "2026-10-27T10:28:47.240799Z",
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

`POST /api/driver/v1/offers/afd32e92-47a2-4443-ab7a-b0c1d2c51a34/accept` → **200**

```json
{
  "command_id": "a19121a2-b16d-4f79-80e0-20de8123e5bb"
}
```

```json
{
  "id": "9320611a-97e5-45f9-a61a-527d01f0d58d",
  "order_id": "36369311-70a2-4ca4-b739-984cf11325f6",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "86754225-6f78-4551-85c1-354483bb28a9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "86754225-6f78-4551-85c1-354483bb28a9",
  "order_id": "36369311-70a2-4ca4-b739-984cf11325f6",
  "assignment_id": "9320611a-97e5-45f9-a61a-527d01f0d58d",
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
  "session_id": "a546c6ee-dec2-42fa-adaf-e498a6bf9ba1",
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
  "last_heartbeat_at": "2026-10-27T10:28:31.676025Z",
  "last_location_at": "2026-10-27T10:28:31.676025Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/a546c6ee-dec2-42fa-adaf-e498a6bf9ba1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:32Z",
    "sequence": 1793096912352
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a546c6ee-dec2-42fa-adaf-e498a6bf9ba1",
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
  "last_heartbeat_at": "2026-10-27T10:28:32.365372Z",
  "last_location_at": "2026-10-27T10:28:32.365372Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/86754225-6f78-4551-85c1-354483bb28a9/arrive` → **200**

```json
{
  "command_id": "33d0f6c6-f1ef-4eed-be27-6c63c86055ba",
  "expected_version": 0
}
```

```json
{
  "id": "86754225-6f78-4551-85c1-354483bb28a9",
  "order_id": "36369311-70a2-4ca4-b739-984cf11325f6",
  "assignment_id": "9320611a-97e5-45f9-a61a-527d01f0d58d",
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
  "arrived_at": "2026-10-27T10:28:32.396397Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/86754225-6f78-4551-85c1-354483bb28a9/start` → **200**

```json
{
  "command_id": "54bfdf52-c29c-4cdc-87a4-cbfbe8ed5b8a",
  "expected_version": 1
}
```

```json
{
  "id": "86754225-6f78-4551-85c1-354483bb28a9",
  "order_id": "36369311-70a2-4ca4-b739-984cf11325f6",
  "assignment_id": "9320611a-97e5-45f9-a61a-527d01f0d58d",
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
  "arrived_at": "2026-10-27T10:28:32.396397Z",
  "started_at": "2026-10-27T10:28:32.433177Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/86754225-6f78-4551-85c1-354483bb28a9/complete` → **200**

```json
{
  "command_id": "fe35c5d1-8903-4c5b-933d-7208fe18534c",
  "expected_version": 2,
  "reported_at": "2026-10-27T10:28:32Z"
}
```

```json
{
  "id": "86754225-6f78-4551-85c1-354483bb28a9",
  "order_id": "36369311-70a2-4ca4-b739-984cf11325f6",
  "assignment_id": "9320611a-97e5-45f9-a61a-527d01f0d58d",
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
  "arrived_at": "2026-10-27T10:28:32.396397Z",
  "started_at": "2026-10-27T10:28:32.433177Z",
  "completed_at": "2026-10-27T10:28:32.471861Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "36369311-70a2-4ca4-b739-984cf11325f6",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T10:28:32.233486Z",
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
    "id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-27T10:28:31.32061Z",
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
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie"
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

`GET /api/operator/v1/orders/d65b3df8-8197-4626-948b-7cf56ff9b601/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T10:28:31.321105Z",
      "actor": {
        "type": "CLIENT",
        "id": "c7e41f85-1712-4169-9867-4ac18d2a9b4e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
        "quote_id": "04243691-7308-47fa-84a8-c94f2d4f24b7",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T10:28:31.322561Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
        "attempt_id": "7b6d3ba4-6f5f-4a8b-9946-bd1ff4ed95dc",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T10:28:31.326805Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "db960db5-8012-4a03-86a3-46bfe3a34d01",
        "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T10:28:31.3763Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "db960db5-8012-4a03-86a3-46bfe3a34d01",
        "order_id": "d65b3df8-8197-4626-948b-7cf56ff9b601",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d3988b96-bb39-44b9-b875-5ab30cfef077"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted d65b3df8-8197-4626-948b-7cf56ff9b601, follow-up 36369311-70a2-4ca4-b739-984cf11325f6.

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
  "session_id": "e6a28161-86b9-4a49-8823-fadd0d3cb6e9",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MTUsImlhdCI6MTc5MzA5NjkxNSwianRpIjoiOWEyYWVhNGEtZWQ0ZC00ODE1LWJhYWYtOWUwOWYzMTZkMmEzIiwic2lkIjoiZTZhMjgxNjEtODZiOS00YTQ5LTg4MjMtZmFkZDBkM2NiNmU5In0.FKV-ykAiKoTzneQAKdzO2vBf9eWa6R0grD7rjjy56ao",
  "access_expires_at": "2026-10-27T10:43:35.796668598Z",
  "refresh_token": "bMl0iei2pdcDEPo8TdvxkQ-h8gNRyM63fhZUSqbSafE",
  "refresh_expires_at": "2026-10-27T22:28:35.796026457Z",
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
  "command_id": "099ad41c-e8ca-46b8-8a19-c2756040f65f",
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
  "changed_by": "77b87a25-18ca-4895-b541-709742b83262",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T10:28:35.871851203Z"
}
```

## The rider books the airport for 2026-10-27T13:28:35Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600232530",
  "device_ref": "sandbox-5908"
}
```

```json
{
  "challenge_id": "b0876433-03ec-4a2e-81a7-5366f34eca08",
  "expires_at": "2026-10-27T10:33:35.902253436Z",
  "resend_available_at": "2026-10-27T10:28:36.902253436Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600232530` → **200**

```json
{
  "phone": "+48600232530",
  "audience": "CLIENT",
  "code": "472813",
  "sent_at": "2026-10-27T10:28:35.904448456Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0876433-03ec-4a2e-81a7-5366f34eca08",
  "code": "472813",
  "device_ref": "sandbox-5908"
}
```

```json
{
  "session_id": "f3f30144-257e-46d8-9b08-01b983ff7b59",
  "subject": {
    "type": "CLIENT",
    "id": "aa313f14-87e0-4545-a045-c732242534cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTMxM2YxNC04N2UwLTQ1NDUtYTA0NS1jNzMyMjQyNTM0Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk3ODE1LCJpYXQiOjE3OTMwOTY5MTUsImp0aSI6IjBkOTNkODk0LTgxODQtNGQ5My1hYzRjLTQzMzBmZmJlM2M0MCIsInNpZCI6ImYzZjMwMTQ0LTI1N2UtNDZkOC05YjA4LTAxYjk4M2ZmN2I1OSJ9.RIUjW6RfgkSi5h08gEsIF1oaHM7Vz_Vt3cP3GqRrB4Y",
  "access_expires_at": "2026-10-27T10:43:35.952977929Z",
  "refresh_token": "L9wQnt0dCT55L-fB78JjOaidHZxn5VbVk44VWNQ8ybg",
  "refresh_expires_at": "2026-11-26T10:28:35.952585156Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "837dccd0-6dbb-4dc6-bfb0-333d7b671086",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T13:28:35Z"
}
```

```json
{
  "id": "0eedf9c5-83a6-4f6d-9f31-5030f84ba1d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T10:33:35.987331Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T13:28:35Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1f501ee8-047f-414d-8e30-b68c993bc514",
  "quote_id": "0eedf9c5-83a6-4f6d-9f31-5030f84ba1d8",
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
  "pickup_at": "2026-10-27T13:28:35Z"
}
```

```json
{
  "id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
  "short_number": 6,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "aa313f14-87e0-4545-a045-c732242534cd",
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
  "created_at": "2026-10-27T10:28:36.02296Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T13:28:35Z",
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
  "device_ref": "sandbox-19407"
}
```

```json
{
  "challenge_id": "ceb450da-8466-47f8-b6d4-8b2489c97b32",
  "expires_at": "2026-10-27T10:33:36.053216406Z",
  "resend_available_at": "2026-10-27T10:28:37.053216406Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "583252",
  "sent_at": "2026-10-27T10:28:36.055811741Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ceb450da-8466-47f8-b6d4-8b2489c97b32",
  "code": "583252",
  "device_ref": "sandbox-19407"
}
```

```json
{
  "session_id": "55d92ab8-d807-4870-bec7-de70c0b8018f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5NzgxNiwiaWF0IjoxNzkzMDk2OTE2LCJqdGkiOiIwZTNmODAxYy04MWY0LTRjMjUtYjE3ZS1jZGM1MDhmMDkwMjkiLCJzaWQiOiI1NWQ5MmFiOC1kODA3LTQ4NzAtYmVjNy1kZTcwYzBiODAxOGYifQ.h0i2DJvbeoK1Uw_r09xxtu6wu-7X0lvlB2QrB-628Fk",
  "access_expires_at": "2026-10-27T10:43:36.103661128Z",
  "refresh_token": "1y4h9fSbUq9v3bZxbOLQIkc_-PDOVDbLEV1zDqq2NK0",
  "refresh_expires_at": "2026-11-26T10:28:36.103158239Z",
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
  "command_id": "f5f3ec1d-3df4-4060-8b95-f6e18b3b29ed",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:28:36Z",
    "sequence": 1793096916149
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8e5ecb2c-d94d-45ac-bd91-56809cf6febc",
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
  "last_heartbeat_at": "2026-10-27T10:28:36.163166Z",
  "last_location_at": "2026-10-27T10:28:36.163166Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
      "short_number": 6,
      "pickup_at": "2026-10-27T13:28:35Z",
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

`POST /api/driver/v1/preorders/b8d89097-5494-4d3c-9e3a-5d07cd8f8f14/reserve` → **200**

```json
{
  "command_id": "9e35984f-0389-415d-9941-b767e8db232d"
}
```

```json
{
  "id": "26eadb46-509f-47db-845c-cd4bc7b2d325",
  "state": "RESERVED",
  "order": {
    "order_id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
    "short_number": 6,
    "pickup_at": "2026-10-27T13:28:35Z",
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
  "reserved_at": "2026-10-27T10:28:36.22354Z",
  "confirm_from": "2026-10-27T12:58:35Z",
  "confirm_until": "2026-10-27T13:08:35Z",
  "drop_until": "2026-10-27T12:28:35Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "26eadb46-509f-47db-845c-cd4bc7b2d325",
      "state": "RESERVED",
      "order": {
        "order_id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
        "short_number": 6,
        "pickup_at": "2026-10-27T13:28:35Z",
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
      "reserved_at": "2026-10-27T10:28:36.22354Z",
      "confirm_from": "2026-10-27T12:58:35Z",
      "confirm_until": "2026-10-27T13:08:35Z",
      "drop_until": "2026-10-27T12:28:35Z"
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
      "id": "26eadb46-509f-47db-845c-cd4bc7b2d325",
      "state": "RESERVED",
      "order": {
        "order_id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
        "short_number": 6,
        "pickup_at": "2026-10-27T13:28:35Z",
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
      "reserved_at": "2026-10-27T10:28:36.22354Z",
      "confirm_from": "2026-10-27T12:58:35Z",
      "confirm_until": "2026-10-27T13:08:35Z",
      "drop_until": "2026-10-27T12:28:35Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/26eadb46-509f-47db-845c-cd4bc7b2d325/confirm` → **409**

```json
{
  "command_id": "ad6aa977-5b61-46e8-ae23-df579edd099e"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/26eadb46-509f-47db-845c-cd4bc7b2d325/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bfa37485-0dca-4ecb-a093-33770e500790"
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
  "session_id": "6ef815b6-3765-4a3d-aec4-8a908926a647",
  "subject": {
    "type": "STAFF",
    "id": "77b87a25-18ca-4895-b541-709742b83262"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2I4N2EyNS0xOGNhLTQ4OTUtYjU0MS03MDk3NDJiODMyNjIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTc4MTYsImlhdCI6MTc5MzA5NjkxNiwianRpIjoiNjQzODBjNGUtN2Y2NC00YTA4LThkMWItMGE4ODcxN2ZmMTM2Iiwic2lkIjoiNmVmODE1YjYtMzc2NS00YTNkLWFlYzQtOGE5MDg5MjZhNjQ3In0.zSrl8ZxBMUUU0KfucCt5pJCILZb39cRQmLqdmVzlQ7A",
  "access_expires_at": "2026-10-27T10:43:36.54285254Z",
  "refresh_token": "7BUJJV1BMNaeTm-Ek7qU0DD92j06_3_7UO_5L8cHjNQ",
  "refresh_expires_at": "2026-10-27T22:28:36.542350773Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b8d89097-5494-4d3c-9e3a-5d07cd8f8f14` → **200**

```json
{
  "id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
  "short_number": 6,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "aa313f14-87e0-4545-a045-c732242534cd",
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
  "created_at": "2026-10-27T10:28:36.02296Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T13:28:35Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "26eadb46-509f-47db-845c-cd4bc7b2d325",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T10:28:36.22354Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/b8d89097-5494-4d3c-9e3a-5d07cd8f8f14/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T10:28:36.024316Z",
      "actor": {
        "type": "CLIENT",
        "id": "aa313f14-87e0-4545-a045-c732242534cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
        "preorder": true,
        "quote_id": "0eedf9c5-83a6-4f6d-9f31-5030f84ba1d8",
        "pickup_at": "2026-10-27T13:28:35Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T10:28:36.224644Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b8d89097-5494-4d3c-9e3a-5d07cd8f8f14",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "26eadb46-509f-47db-845c-cd4bc7b2d325"
      }
    }
  ]
}
```

Done: pre-order b8d89097-5494-4d3c-9e3a-5d07cd8f8f14, reservation 26eadb46-509f-47db-845c-cd4bc7b2d325.
