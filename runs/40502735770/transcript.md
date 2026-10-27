# Sandbox transcript (2026-10-27T12:19:22Z, 6608638)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633934076",
  "device_ref": "sandbox-26256"
}
```

```json
{
  "challenge_id": "3bf1001d-6c20-4e3d-b6ca-c1af697b8236",
  "expires_at": "2026-10-27T12:24:22.111424334Z",
  "resend_available_at": "2026-10-27T12:19:23.111424334Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633934076` → **200**

```json
{
  "phone": "+380633934076",
  "audience": "CLIENT",
  "code": "552979",
  "sent_at": "2026-10-27T12:19:22.118391419Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bf1001d-6c20-4e3d-b6ca-c1af697b8236",
  "code": "552979",
  "device_ref": "sandbox-26256"
}
```

```json
{
  "session_id": "5a0527a7-5afb-4f6c-b182-c9d8c6b1ae1f",
  "subject": {
    "type": "CLIENT",
    "id": "652253af-508b-4b7a-a51e-4254e982cd67"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTIyNTNhZi01MDhiLTRiN2EtYTUxZS00MjU0ZTk4MmNkNjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0NDYyLCJpYXQiOjE3OTMxMDM1NjIsImp0aSI6IjEwYjU1NmQ1LTgwZjEtNDQzNC1iOTUyLWU5OGE2OWIyZWY0OSIsInNpZCI6IjVhMDUyN2E3LTVhZmItNGY2Yy1iMTgyLWM5ZDhjNmIxYWUxZiJ9.B473nViS7dTAvGygWd2_wk6i1d39W9PTugqX_fXImY4",
  "access_expires_at": "2026-10-27T12:34:22.214220551Z",
  "refresh_token": "b-vjQA5F6d1agTqUFxdROAI_FaS_GKeyKXT5ZWsyplo",
  "refresh_expires_at": "2026-11-26T12:19:22.212283544Z",
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
        "uk": "Передумав їхати",
        "en": "Changed my mind",
        "ru": "Передумал ехать"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "uk": "Помилився адресою",
        "en": "Wrong address",
        "ru": "Ошибся адресом"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "uk": "Поїду іншим транспортом",
        "en": "Found other transport",
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
  "device_ref": "sandbox-9029"
}
```

```json
{
  "challenge_id": "274af9b1-c48d-47b9-a48c-8c493280b93f",
  "expires_at": "2026-10-27T12:24:22.411747332Z",
  "resend_available_at": "2026-10-27T12:19:23.411747332Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "571120",
  "sent_at": "2026-10-27T12:19:22.41585398Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "274af9b1-c48d-47b9-a48c-8c493280b93f",
  "code": "571120",
  "device_ref": "sandbox-9029"
}
```

```json
{
  "session_id": "9d8a1d47-98ae-4607-855a-35b576ddac9f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ2MiwiaWF0IjoxNzkzMTAzNTYyLCJqdGkiOiI2M2JkOGUwMy1hMWY5LTRhYmQtYjllNi03N2U4N2I4NjU2NGYiLCJzaWQiOiI5ZDhhMWQ0Ny05OGFlLTQ2MDctODU1YS0zNWI1NzZkZGFjOWYifQ.6yH3ZYIjBW_Pu2znuxnDD4KaNz0I7hzoJdp-LFHuOkE",
  "access_expires_at": "2026-10-27T12:34:22.476423087Z",
  "refresh_token": "XAgbSHzYrt9RSmHB0mqhGUv5pHpFen_BxTkeS-HGG6I",
  "refresh_expires_at": "2026-11-26T12:19:22.47541401Z",
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
        "uk": "Пасажир не вийшов",
        "en": "Passenger did not show up",
        "ru": "Пассажир не вышел"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "uk": "Несправність автомобіля",
        "en": "Vehicle problem",
        "ru": "Неисправность автомобиля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "uk": "Не можу під'їхати",
        "en": "Cannot reach the pickup",
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
  "correlation_id": "6f1cd8c9-644f-45d5-b30f-6119d71becca"
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
  "session_id": "5101f665-c54b-4078-87f2-750405ac374e",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NjMsImlhdCI6MTc5MzEwMzU2MywianRpIjoiYjc2MGM5ZjgtMmIzMi00NDc4LWJkNDgtOTk3ODEzMTYwYzgzIiwic2lkIjoiNTEwMWY2NjUtYzU0Yi00MDc4LTg3ZjItNzUwNDA1YWMzNzRlIn0.6VnagF1X-Ralb8gJSh2zhXKstzcOu3dtmwKvkuTA8n4",
  "access_expires_at": "2026-10-27T12:34:23.183278474Z",
  "refresh_token": "gAcS5-qeXW5LtzrFeFlBQTX14IUCOOyWemOwB4AwNoM",
  "refresh_expires_at": "2026-10-28T00:19:23.18221303Z",
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
  "session_id": "af8ac75b-13bc-402c-b976-e910f2ef1f77",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NjQsImlhdCI6MTc5MzEwMzU2NCwianRpIjoiZmY1NTdkNGItN2M2MS00NzNhLWFiNjUtOTA3Y2U5ZDVhMGRhIiwic2lkIjoiYWY4YWM3NWItMTNiYy00MDJjLWI5NzYtZTkxMGYyZWYxZjc3In0.yud0u03rTjP0wlEo5CxNsT9H1Rm0avTK0GGzHFFxToM",
  "access_expires_at": "2026-10-27T12:34:24.425571831Z",
  "refresh_token": "ZeRTxoaOSu7piCFQ9ddbxxYyZBA4yhHi_ooMBIyKcMA",
  "refresh_expires_at": "2026-10-28T00:19:24.42441155Z",
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
  "session_id": "bd886657-e802-45c8-8d18-88dba0f65365",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NjQsImlhdCI6MTc5MzEwMzU2NCwianRpIjoiMDJiNjVmOTctOWVkOC00M2YxLThlZWYtMDRlMGFiODNmMTgxIiwic2lkIjoiYmQ4ODY2NTctZTgwMi00NWM4LThkMTgtODhkYmEwZjY1MzY1In0.xsWDNiVul923CuhukL1E0RMQXM9pLR5r0ibdeu3UFtY",
  "access_expires_at": "2026-10-27T12:34:24.754022026Z",
  "refresh_token": "kxT2QghLUxqky9clz-VDsC9UY2Ar1BjSHEJdQF_P3aE",
  "refresh_expires_at": "2026-10-28T00:19:24.752894673Z",
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
        "uk": "Пасажир попросив",
        "en": "Passenger asked",
        "ru": "Пассажир попросил"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "uk": "Дубль замовлення",
        "en": "Duplicate order",
        "ru": "Дубль заказа"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "uk": "Немає вільних авто",
        "en": "No cars available",
        "ru": "Нет свободных машин"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "uk": "Тестове замовлення",
        "en": "Test order",
        "ru": "Тестовый заказ"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "uk": "ДТП",
        "en": "Accident",
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
  "command_id": "f8f5d855-22f4-49a9-95fa-d2bc280e14bc",
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
  "id": "b6120780-10b2-4d26-add7-9c8397659593",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T12:24:24.912608Z",
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
  "command_id": "342fb94c-1c39-4390-9f80-dfc3b9d1040c",
  "quote_id": "b6120780-10b2-4d26-add7-9c8397659593",
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
  "id": "ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "652253af-508b-4b7a-a51e-4254e982cd67",
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
  "created_at": "2026-10-27T12:19:25.038083Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa` → **200**

```json
{
  "id": "ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "652253af-508b-4b7a-a51e-4254e982cd67",
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
  "created_at": "2026-10-27T12:19:25.038083Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa/cancel` → **200**

```json
{
  "command_id": "b17ea98d-7e15-4561-bb56-94906e91f0e4",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "652253af-508b-4b7a-a51e-4254e982cd67",
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
  "created_at": "2026-10-27T12:19:25.038083Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "uk": "Довго чекати авто",
      "en": "The wait is too long",
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
  "command_id": "5bf17bcc-590f-4618-a18b-7bb855efa5bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:25Z",
    "sequence": 1793103565236
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "13f7dec8-16ad-4830-aa84-dfb8ba2bfec6",
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
  "last_heartbeat_at": "2026-10-27T12:19:25.283311Z",
  "last_location_at": "2026-10-27T12:19:25.283311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7212"
}
```

```json
{
  "challenge_id": "2f628a89-f4b4-4f70-b1e1-246104828b3e",
  "expires_at": "2026-10-27T12:24:25.328884074Z",
  "resend_available_at": "2026-10-27T12:19:26.328884074Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "388210",
  "sent_at": "2026-10-27T12:19:25.333534951Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f628a89-f4b4-4f70-b1e1-246104828b3e",
  "code": "388210",
  "device_ref": "sandbox-7212"
}
```

```json
{
  "session_id": "23925d64-9c88-4cca-9183-41c5b6b0da8d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ2NSwiaWF0IjoxNzkzMTAzNTY1LCJqdGkiOiJkN2MzYjk5NC03ZjU2LTQ3MTAtYWVmYi1lYzg2ZTI0ZGRkZmIiLCJzaWQiOiIyMzkyNWQ2NC05Yzg4LTRjY2EtOTE4My00MWM1YjZiMGRhOGQifQ.QpRLL-gcryQ62zRmqLqc6YydwJ4zELrWmUYYV0s9YB8",
  "access_expires_at": "2026-10-27T12:34:25.41098538Z",
  "refresh_token": "3Y_LsZPHYDo3v2TTGiim7D1le8N_asr-UKyLo9PaAFQ",
  "refresh_expires_at": "2026-11-26T12:19:25.409884298Z",
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
  "command_id": "1e776b92-73c8-4d09-aea0-07a1e35cf323",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:25Z",
    "sequence": 1793103565474
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32b9f10d-6366-474c-95cb-2b2e96e80415",
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
  "last_heartbeat_at": "2026-10-27T12:19:25.492801Z",
  "last_location_at": "2026-10-27T12:19:25.492801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff8aaf72-4b68-4a53-93a7-87862bc0eea3",
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
  "id": "3229f43c-db5c-487b-a006-c7e60de705df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T12:24:25.538905Z",
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
  "command_id": "0f512c3d-4e5b-4ffa-85e3-934608967b9b",
  "quote_id": "3229f43c-db5c-487b-a006-c7e60de705df",
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
  "id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "652253af-508b-4b7a-a51e-4254e982cd67",
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
  "created_at": "2026-10-27T12:19:25.578349Z",
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
    "id": "7cc0b427-2609-40a3-b271-e9fdb900a9ef",
    "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
    "expires_at": "2026-10-27T12:19:40.583693Z",
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

`POST /api/driver/v1/offers/7cc0b427-2609-40a3-b271-e9fdb900a9ef/accept` → **200**

```json
{
  "command_id": "344c6fa5-36f5-4437-9ce9-4a6c727e7e6e"
}
```

```json
{
  "id": "e4cce061-be37-48ff-b978-7164254c19ae",
  "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f5357ef-7bdf-46f7-82e2-8fefd98fe672",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f5357ef-7bdf-46f7-82e2-8fefd98fe672",
  "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "assignment_id": "e4cce061-be37-48ff-b978-7164254c19ae",
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

`POST /api/driver/v1/trips/1f5357ef-7bdf-46f7-82e2-8fefd98fe672/cancel` → **200**

```json
{
  "command_id": "41d14e01-83a8-451a-b8c4-88e696f84fcc",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "1f5357ef-7bdf-46f7-82e2-8fefd98fe672",
  "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "assignment_id": "e4cce061-be37-48ff-b978-7164254c19ae",
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

`GET /api/rider/v1/orders/b28febcd-3c2b-41f2-afd5-3c52d5165b44` → **200**

```json
{
  "id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "652253af-508b-4b7a-a51e-4254e982cd67",
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
    "id": "e4cce061-be37-48ff-b978-7164254c19ae",
    "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "1f5357ef-7bdf-46f7-82e2-8fefd98fe672",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T12:19:25.578349Z",
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
    "id": "6777682a-d854-4621-a440-466d8fe462e1",
    "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
    "expires_at": "2026-10-27T12:19:40.7881Z",
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

`POST /api/driver/v1/offers/6777682a-d854-4621-a440-466d8fe462e1/accept` → **200**

```json
{
  "command_id": "6fb30342-cb60-46ec-8f3e-d3f2d1eb29a8"
}
```

```json
{
  "id": "8b625259-c11d-4e01-9fb4-37f8433382be",
  "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3e8248f9-a8aa-4e95-9a5d-94c3ee6a7e65",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3e8248f9-a8aa-4e95-9a5d-94c3ee6a7e65",
  "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "assignment_id": "8b625259-c11d-4e01-9fb4-37f8433382be",
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

`POST /api/driver/v1/trips/3e8248f9-a8aa-4e95-9a5d-94c3ee6a7e65/cancel` → **200**

```json
{
  "command_id": "555671c7-c142-4432-a0be-5423e0aa18d3",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3e8248f9-a8aa-4e95-9a5d-94c3ee6a7e65",
  "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
  "assignment_id": "8b625259-c11d-4e01-9fb4-37f8433382be",
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
    "id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T12:19:25.578349Z",
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
        "uk": "Пасажир попросив скасувати",
        "en": "Passenger asked to cancel",
        "ru": "Пассажир попросил отменить"
      }
    },
    "pickup_at": null
  },
  {
    "id": "ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T12:19:25.038083Z",
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
        "uk": "Довго чекати авто",
        "en": "The wait is too long",
        "ru": "Долго ждать машину"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/b28febcd-3c2b-41f2-afd5-3c52d5165b44/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T12:19:25.579293Z",
      "actor": {
        "type": "CLIENT",
        "id": "652253af-508b-4b7a-a51e-4254e982cd67",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
        "quote_id": "3229f43c-db5c-487b-a006-c7e60de705df",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T12:19:25.582285Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
        "attempt_id": "9cdf7ffb-f29b-489e-abf0-350d3d6f407c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T12:19:25.591346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "7cc0b427-2609-40a3-b271-e9fdb900a9ef",
        "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T12:19:25.681851Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "7cc0b427-2609-40a3-b271-e9fdb900a9ef",
        "order_id": "b28febcd-3c2b-41f2-afd5-3c52d5165b44",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "e4cce061-be37-48ff-b978-7164254c19ae"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders ec6d59e8-8bd8-4ee9-b81c-e01d1ed86afa, b28febcd-3c2b-41f2-afd5-3c52d5165b44.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739646072",
  "device_ref": "sandbox-31430"
}
```

```json
{
  "challenge_id": "42c7f95a-b852-4be3-be7f-474fc38692eb",
  "expires_at": "2026-10-27T12:24:26.114040406Z",
  "resend_available_at": "2026-10-27T12:19:27.114040406Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380739646072` → **200**

```json
{
  "phone": "+380739646072",
  "audience": "CLIENT",
  "code": "930421",
  "sent_at": "2026-10-27T12:19:26.117927486Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42c7f95a-b852-4be3-be7f-474fc38692eb",
  "code": "930421",
  "device_ref": "sandbox-31430"
}
```

```json
{
  "session_id": "1c01ddd3-106e-46c8-9f13-e420527c14a0",
  "subject": {
    "type": "CLIENT",
    "id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOWE3MmE2Zi01ZGM4LTRmZDItOGZhNS1hMzg4MzgyNDZmOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0NDY2LCJpYXQiOjE3OTMxMDM1NjYsImp0aSI6ImJiZWZlMDIzLTI5YWQtNDcxZi1hOWU4LTMxMWM1MzNmMzFhOSIsInNpZCI6IjFjMDFkZGQzLTEwNmUtNDZjOC05ZjEzLWU0MjA1MjdjMTRhMCJ9._7Tgo3yLkan2smhlFVa-nieEV-KKfjPK4iTl62cm6RY",
  "access_expires_at": "2026-10-27T12:34:26.178782085Z",
  "refresh_token": "DRyPSvdfqE568ne5BVIwjIYLP59fDYyg9vn7mZKAx20",
  "refresh_expires_at": "2026-11-26T12:19:26.177930393Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "799cf45f-5de3-4aa9-8cc6-24fb29f31152",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "84bc6d97-cb9b-47c2-81b1-a1d96c55f92f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-84bc6d97-cb9b-47c2-81b1-a1d96c55f92f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6617e36d6ad5803e942c874618da215d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=84bc6d97-cb9b-47c2-81b1-a1d96c55f92f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739646072"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=84bc6d97-cb9b-47c2-81b1-a1d96c55f92f",
  "expires_at": "2026-10-27T12:49:26.220523Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/84bc6d97-cb9b-47c2-81b1-a1d96c55f92f` → **200**

```json
{
  "id": "84bc6d97-cb9b-47c2-81b1-a1d96c55f92f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T12:49:26.220523Z",
  "card": {
    "id": "ad40e7f4-5ea8-40b5-890e-323e48cb6081",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6417",
    "card_type": "Visa",
    "created_at": "2026-10-27T12:19:26.280588Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "ad40e7f4-5ea8-40b5-890e-323e48cb6081",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6417",
      "card_type": "Visa",
      "created_at": "2026-10-27T12:19:26.280588Z"
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
  "device_ref": "sandbox-5397"
}
```

```json
{
  "challenge_id": "836b8a3b-cd6f-4102-9f7e-2d326b7e018b",
  "expires_at": "2026-10-27T12:24:26.370175334Z",
  "resend_available_at": "2026-10-27T12:19:27.370175334Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "942933",
  "sent_at": "2026-10-27T12:19:26.374112492Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "836b8a3b-cd6f-4102-9f7e-2d326b7e018b",
  "code": "942933",
  "device_ref": "sandbox-5397"
}
```

```json
{
  "session_id": "d685ea1e-01df-483e-91bd-3957bf3ce588",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ2NiwiaWF0IjoxNzkzMTAzNTY2LCJqdGkiOiJkZTliMzI5MS1jMzJmLTQ2ZjYtYWM1Yi1lZWJiOWNkNDUwMWYiLCJzaWQiOiJkNjg1ZWExZS0wMWRmLTQ4M2UtOTFiZC0zOTU3YmYzY2U1ODgifQ.ik6AhCB6ABY-MDSDwKF4BB6S44ABfaNMH43e48uwxEs",
  "access_expires_at": "2026-10-27T12:34:26.439002369Z",
  "refresh_token": "NQskGXAgvBSlZOeC7NM-6Ab9XDgBiLUQpsjaFmwen9U",
  "refresh_expires_at": "2026-11-26T12:19:26.437704006Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32b9f10d-6366-474c-95cb-2b2e96e80415",
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
  "last_heartbeat_at": "2026-10-27T12:19:25.492801Z",
  "last_location_at": "2026-10-27T12:19:25.492801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/32b9f10d-6366-474c-95cb-2b2e96e80415/handover` → **200**

```json
{
  "command_id": "fab577d6-c1df-42e7-a9d2-437a4d13a3d6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32b9f10d-6366-474c-95cb-2b2e96e80415",
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
  "last_heartbeat_at": "2026-10-27T12:19:25.492801Z",
  "last_location_at": "2026-10-27T12:19:25.492801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/32b9f10d-6366-474c-95cb-2b2e96e80415/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:26Z",
    "sequence": 1793103566562
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32b9f10d-6366-474c-95cb-2b2e96e80415",
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
  "last_heartbeat_at": "2026-10-27T12:19:26.594576Z",
  "last_location_at": "2026-10-27T12:19:26.594576Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9986e0a7-e29e-4481-bb03-3b8e85feb909",
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
  "id": "170634f4-05a7-4da3-b1e5-1cdc489203dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T12:24:26.648428Z",
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
  "command_id": "65077143-2e2b-4f00-84f6-a930ce8ce6c8",
  "quote_id": "170634f4-05a7-4da3-b1e5-1cdc489203dc",
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
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
  "created_at": "2026-10-27T12:19:26.705206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/f9f2eafa-9f1d-41a7-83a8-03451c358a73` → **200**

```json
{
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
  "created_at": "2026-10-27T12:19:26.705206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/f9f2eafa-9f1d-41a7-83a8-03451c358a73` → **200**

```json
{
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
  "created_at": "2026-10-27T12:19:26.705206Z",
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
    "id": "9fa2131d-442f-488c-b1fe-ef2009993827",
    "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
    "expires_at": "2026-10-27T12:19:42.704917Z",
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

`POST /api/driver/v1/offers/9fa2131d-442f-488c-b1fe-ef2009993827/accept` → **200**

```json
{
  "command_id": "f0f63a8c-1676-4f72-a19e-c6c48e35cb46"
}
```

```json
{
  "id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
  "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
  "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "assignment_id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
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

`POST /api/driver/v1/work-sessions/32b9f10d-6366-474c-95cb-2b2e96e80415/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:27Z",
    "sequence": 1793103567896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "32b9f10d-6366-474c-95cb-2b2e96e80415",
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
  "last_heartbeat_at": "2026-10-27T12:19:27.915354Z",
  "last_location_at": "2026-10-27T12:19:27.915354Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5b0766fa-e3b0-458d-85a4-97a8207ba869/arrive` → **200**

```json
{
  "command_id": "ba477b2f-220f-44f3-89c3-dc4e056bc78b",
  "expected_version": 0
}
```

```json
{
  "id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
  "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "assignment_id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
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
  "arrived_at": "2026-10-27T12:19:27.960587Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/5b0766fa-e3b0-458d-85a4-97a8207ba869/start` → **200**

```json
{
  "command_id": "e0257ed8-409b-47e9-babe-2a916a14def2",
  "expected_version": 1
}
```

```json
{
  "id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
  "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "assignment_id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
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
  "arrived_at": "2026-10-27T12:19:27.960587Z",
  "started_at": "2026-10-27T12:19:28.003469Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/5b0766fa-e3b0-458d-85a4-97a8207ba869/complete` → **200**

```json
{
  "command_id": "516607fe-64f1-4891-8def-b69534cfb1ea",
  "expected_version": 2,
  "reported_at": "2026-10-27T12:19:28Z"
}
```

```json
{
  "id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
  "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "assignment_id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
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
  "arrived_at": "2026-10-27T12:19:27.960587Z",
  "started_at": "2026-10-27T12:19:28.003469Z",
  "completed_at": "2026-10-27T12:19:28.056728Z",
  "needs_review": false
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f9f2eafa-9f1d-41a7-83a8-03451c358a73` → **200**

```json
{
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
    "id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
    "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T12:19:26.705206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/f9f2eafa-9f1d-41a7-83a8-03451c358a73` → **200**

```json
{
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
    "id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
    "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T12:19:26.705206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/f9f2eafa-9f1d-41a7-83a8-03451c358a73` → **200**

```json
{
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
    "id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
    "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T12:19:26.705206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/f9f2eafa-9f1d-41a7-83a8-03451c358a73` → **200**

```json
{
  "id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "09a72a6f-5dc8-4fd2-8fa5-a38838246f96",
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
    "id": "487e6767-d944-4c6b-a459-e09c0d85a2dd",
    "order_id": "f9f2eafa-9f1d-41a7-83a8-03451c358a73",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "5b0766fa-e3b0-458d-85a4-97a8207ba869",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T12:19:26.705206Z",
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

Done: card order f9f2eafa-9f1d-41a7-83a8-03451c358a73.

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
  "device_ref": "sandbox-6510"
}
```

```json
{
  "challenge_id": "3d78c17b-0071-4912-b2c8-727bdf0344c7",
  "expires_at": "2026-10-27T12:24:31.292187459Z",
  "resend_available_at": "2026-10-27T12:19:32.292187459Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "589972",
  "sent_at": "2026-10-27T12:19:31.295774869Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d78c17b-0071-4912-b2c8-727bdf0344c7",
  "code": "589972",
  "device_ref": "sandbox-6510"
}
```

```json
{
  "session_id": "5aadeb16-94c0-4814-936d-00bd62da9e98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ3MSwiaWF0IjoxNzkzMTAzNTcxLCJqdGkiOiJjMjBkYjhiNy1kYjY5LTQ3MjItYmIzMy1jNzdmMjg1MzJkMGEiLCJzaWQiOiI1YWFkZWIxNi05NGMwLTQ4MTQtOTM2ZC0wMGJkNjJkYTllOTgifQ.xnRshN6me3VrSbrFP1aQ6btcFacY6Mis2PT10ZZSh5I",
  "access_expires_at": "2026-10-27T12:34:31.353371306Z",
  "refresh_token": "U2KqXcCKKxWgrQ1Gem2WxZW9uioBlzNYqMTHnnCRXtw",
  "refresh_expires_at": "2026-11-26T12:19:31.35270446Z",
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
  "command_id": "4c1117b5-da3f-4f0c-94e8-37852dba9234",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:31Z",
    "sequence": 1793103571406
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:31.422395Z",
  "last_location_at": "2026-10-27T12:19:31.422395Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673423672",
  "device_ref": "sandbox-6145"
}
```

```json
{
  "challenge_id": "37051b22-52c8-4c20-8cf6-003fba8bfce2",
  "expires_at": "2026-10-27T12:24:31.459383502Z",
  "resend_available_at": "2026-10-27T12:19:32.459383502Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673423672` → **200**

```json
{
  "phone": "+380673423672",
  "audience": "CLIENT",
  "code": "348340",
  "sent_at": "2026-10-27T12:19:31.46274854Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "37051b22-52c8-4c20-8cf6-003fba8bfce2",
  "code": "348340",
  "device_ref": "sandbox-6145"
}
```

```json
{
  "session_id": "cfe67309-5bcc-4a75-b1da-72872689dfa7",
  "subject": {
    "type": "CLIENT",
    "id": "9ad9d495-7008-4bd9-bc8b-cf2e4ea4602a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWQ5ZDQ5NS03MDA4LTRiZDktYmM4Yi1jZjJlNGVhNDYwMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0NDcxLCJpYXQiOjE3OTMxMDM1NzEsImp0aSI6IjFkNjM5MmMwLWZjNWItNGM4Ny05MmZiLTdjOTNlMzM2ZjcwYSIsInNpZCI6ImNmZTY3MzA5LTViY2MtNGE3NS1iMWRhLTcyODcyNjg5ZGZhNyJ9.tWyG27Ujpbp_3-Ir_jo0yaqcvK3RT9M4k1w98_QJHYQ",
  "access_expires_at": "2026-10-27T12:34:31.520995346Z",
  "refresh_token": "B6RE9476triObEK36OwUkOaV3ChnL03O6W5q9_KxjmY",
  "refresh_expires_at": "2026-11-26T12:19:31.520215161Z",
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
  "command_id": "7581c432-8433-4ca3-8911-6b08be7df8b3",
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
  "id": "9e602fed-f48e-4a68-b713-432f6e953748",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T12:24:31.588857Z",
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
  "command_id": "10653ce4-bcfa-4b99-be53-1a8883632b71",
  "quote_id": "9e602fed-f48e-4a68-b713-432f6e953748",
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
  "id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ad9d495-7008-4bd9-bc8b-cf2e4ea4602a",
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
  "created_at": "2026-10-27T12:19:31.634513Z",
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
    "id": "c9519867-2501-4e88-aec8-13c2f327e43e",
    "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
    "expires_at": "2026-10-27T12:19:46.638986Z",
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

`POST /api/driver/v1/offers/c9519867-2501-4e88-aec8-13c2f327e43e/accept` → **200**

```json
{
  "command_id": "c5b62b39-ca4b-4e32-beb7-80dff54566dd"
}
```

```json
{
  "id": "b340c735-80c9-4109-9814-e95704fa9b46",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/9d7ccfd2-5582-4af5-8b12-55ddad57d043/messages` → **201**

```json
{
  "command_id": "c3389b67-7295-432f-abfd-6f4998e797ea",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "245d2c5b-1acf-42ba-8701-5a378b906699",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T12:19:31.766212568Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "assignment_id": "b340c735-80c9-4109-9814-e95704fa9b46",
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

`POST /api/driver/v1/trips/4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23/messages` → **201**

```json
{
  "command_id": "144bea13-837d-4429-9771-7c7d522fb94c",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "23df13cb-c12f-4758-8c1d-326c268f705e",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T12:19:31.827321865Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/9d7ccfd2-5582-4af5-8b12-55ddad57d043/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673423672"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/bacc3409-def6-460a-9685-802b512b809e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:31Z",
    "sequence": 1793103571908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:31.925943Z",
  "last_location_at": "2026-10-27T12:19:31.925943Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "assignment_id": "b340c735-80c9-4109-9814-e95704fa9b46",
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

`POST /api/driver/v1/trips/4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23/arrive` → **200**

```json
{
  "command_id": "86ca64cd-68f4-499d-8664-bb5a11580a7c",
  "expected_version": 0
}
```

```json
{
  "id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "assignment_id": "b340c735-80c9-4109-9814-e95704fa9b46",
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
  "arrived_at": "2026-10-27T12:19:31.981283Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23/start` → **200**

```json
{
  "command_id": "72d662c6-71fe-41f7-bf61-d65d55f8de39",
  "expected_version": 1
}
```

```json
{
  "id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "assignment_id": "b340c735-80c9-4109-9814-e95704fa9b46",
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
  "arrived_at": "2026-10-27T12:19:31.981283Z",
  "started_at": "2026-10-27T12:19:32.01744Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/bacc3409-def6-460a-9685-802b512b809e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:32Z",
    "sequence": 1793103572422
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:32.062694Z",
  "last_location_at": "2026-10-27T12:19:32.062694Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23/complete` → **200**

```json
{
  "command_id": "a896c01a-3b4f-4bc3-acb0-d441c8d399f9",
  "expected_version": 2,
  "reported_at": "2026-10-27T12:19:32Z",
  "cash_received": true
}
```

```json
{
  "id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
  "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "assignment_id": "b340c735-80c9-4109-9814-e95704fa9b46",
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
  "arrived_at": "2026-10-27T12:19:31.981283Z",
  "started_at": "2026-10-27T12:19:32.01744Z",
  "completed_at": "2026-10-27T12:19:32.105697Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/9d7ccfd2-5582-4af5-8b12-55ddad57d043` → **200**

```json
{
  "id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9ad9d495-7008-4bd9-bc8b-cf2e4ea4602a",
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
    "id": "b340c735-80c9-4109-9814-e95704fa9b46",
    "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T12:19:31.634513Z",
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
    "id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
    "short_number": 4,
    "status": "FULFILLED",
    "created_at": "2026-10-27T12:19:31.634513Z",
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
    "id": "4a16ccd7-1dc5-41e6-80cb-97f15b1a5d23",
    "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
    "order_short_number": 4,
    "created_at": "2026-10-27T12:19:31.716974Z",
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
  "session_id": "4a0ceefe-5de8-4144-a74a-7a01f6fba38d",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NzUsImlhdCI6MTc5MzEwMzU3NSwianRpIjoiMzE5MzgwYWMtZjAzMi00YjlhLTliMTctY2U4MTRkMWNjNGRjIiwic2lkIjoiNGEwY2VlZmUtNWRlOC00MTQ0LWE3NGEtN2EwMWY2ZmJhMzhkIn0.gWK-Q7jiQv1jsrJIV6-dctawl6VC_2RWnhqoPAbHig4",
  "access_expires_at": "2026-10-27T12:34:35.549450966Z",
  "refresh_token": "TFGyj7vEdO-v2jYDplJV4I9AG-f-MguXjYJHy6B4hW8",
  "refresh_expires_at": "2026-10-28T00:19:35.548816021Z",
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
  "session_id": "5236ae96-5296-41a7-8846-e55d979a15a4",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NzUsImlhdCI6MTc5MzEwMzU3NSwianRpIjoiOWE4NzQ4MTYtODQzOS00YWNjLTg1ODUtMWRiOGI1OTQ4NWNkIiwic2lkIjoiNTIzNmFlOTYtNTI5Ni00MWE3LTg4NDYtZTU1ZDk3OWExNWE0In0.kjvmuc0dnIEAeKTlVSjmMYOmKsI-0gHrx7_GIomGXt8",
  "access_expires_at": "2026-10-27T12:34:35.8737257Z",
  "refresh_token": "F5EIdWlK7AObSMWLQlX_27X6E-A06qLIgt7uQzGaCFo",
  "refresh_expires_at": "2026-10-28T00:19:35.873061109Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9d7ccfd2-5582-4af5-8b12-55ddad57d043/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T12:19:31.635255Z",
      "actor": {
        "type": "CLIENT",
        "id": "9ad9d495-7008-4bd9-bc8b-cf2e4ea4602a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
        "quote_id": "9e602fed-f48e-4a68-b713-432f6e953748",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T12:19:31.637736Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
        "attempt_id": "4a733710-c3fb-434f-a5e5-e948ce7cc85c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T12:19:31.644227Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c9519867-2501-4e88-aec8-13c2f327e43e",
        "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T12:19:31.720261Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c9519867-2501-4e88-aec8-13c2f327e43e",
        "order_id": "9d7ccfd2-5582-4af5-8b12-55ddad57d043",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b340c735-80c9-4109-9814-e95704fa9b46"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order 9d7ccfd2-5582-4af5-8b12-55ddad57d043.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25533"
}
```

```json
{
  "challenge_id": "134e8cf0-15e8-4be8-8264-1f0b47abb526",
  "expires_at": "2026-10-27T12:24:35.946662097Z",
  "resend_available_at": "2026-10-27T12:19:36.946662097Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "274256",
  "sent_at": "2026-10-27T12:19:35.949790096Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "134e8cf0-15e8-4be8-8264-1f0b47abb526",
  "code": "274256",
  "device_ref": "sandbox-25533"
}
```

```json
{
  "session_id": "c863041f-9dbb-4fc7-940c-695cccb655f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ3NiwiaWF0IjoxNzkzMTAzNTc2LCJqdGkiOiJjODIxZGE1NS1jNzYzLTRlOGQtOGVlOS0yMDA5ZjNhMmU4MDYiLCJzaWQiOiJjODYzMDQxZi05ZGJiLTRmYzctOTQwYy02OTVjY2NiNjU1ZjMifQ.mD3nlOx1HdvuvcdOw9uj_Cb3PNKt9sthphDPC371h2w",
  "access_expires_at": "2026-10-27T12:34:36.01361836Z",
  "refresh_token": "PYAF5-ZAzLSLX-qaytzabm36nzmZNUI-87Kyx1EmrY8",
  "refresh_expires_at": "2026-11-26T12:19:36.012942589Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:32.062694Z",
  "last_location_at": "2026-10-27T12:19:32.062694Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bacc3409-def6-460a-9685-802b512b809e/handover` → **200**

```json
{
  "command_id": "55918fde-d9ff-4d52-a2f5-e7ffb128064f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:32.062694Z",
  "last_location_at": "2026-10-27T12:19:32.062694Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bacc3409-def6-460a-9685-802b512b809e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:36Z",
    "sequence": 1793103576109
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:36.126438Z",
  "last_location_at": "2026-10-27T12:19:36.126438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666934614",
  "device_ref": "sandbox-27635"
}
```

```json
{
  "challenge_id": "090da4c6-8783-408d-ae45-d2f26923f94e",
  "expires_at": "2026-10-27T12:24:36.153359736Z",
  "resend_available_at": "2026-10-27T12:19:37.153359736Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666934614` → **200**

```json
{
  "phone": "+380666934614",
  "audience": "CLIENT",
  "code": "270471",
  "sent_at": "2026-10-27T12:19:36.157743346Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "090da4c6-8783-408d-ae45-d2f26923f94e",
  "code": "270471",
  "device_ref": "sandbox-27635"
}
```

```json
{
  "session_id": "de63392e-7c91-466e-8e8b-339b5c0191ea",
  "subject": {
    "type": "CLIENT",
    "id": "8b4f24ae-eadf-4e61-8862-1e33f9a7eb87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YjRmMjRhZS1lYWRmLTRlNjEtODg2Mi0xZTMzZjlhN2ViODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0NDc2LCJpYXQiOjE3OTMxMDM1NzYsImp0aSI6ImM1NzdlNzZjLTc3ZTItNGU1YS1hNjhmLWE3NTc5NjIxYTc0OCIsInNpZCI6ImRlNjMzOTJlLTdjOTEtNDY2ZS04ZThiLTMzOWI1YzAxOTFlYSJ9.hvcLB8w5_jgTwAikbG4oQPkHPUKr2isNRytd2MIvgv0",
  "access_expires_at": "2026-10-27T12:34:36.217332486Z",
  "refresh_token": "r0xFRHdxPkroQzIMUhI-foVLbOJDTHkux0cW7Kzk1Kc",
  "refresh_expires_at": "2026-11-26T12:19:36.216362909Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1461609d-934e-41b7-b51c-f27c892010ed",
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
  "id": "f993c36e-c0e1-447f-88a3-4484370ccaf4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T12:24:36.257114Z",
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
  "command_id": "ba1547ee-f8a2-4e05-9a1b-690cda1e97b9",
  "quote_id": "f993c36e-c0e1-447f-88a3-4484370ccaf4",
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
  "id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8b4f24ae-eadf-4e61-8862-1e33f9a7eb87",
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
  "created_at": "2026-10-27T12:19:36.295825Z",
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
    "id": "f1a553a1-0982-4046-9d41-77556219b9a9",
    "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
    "expires_at": "2026-10-27T12:19:51.299523Z",
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

`POST /api/driver/v1/offers/f1a553a1-0982-4046-9d41-77556219b9a9/accept` → **200**

```json
{
  "command_id": "5a4ff48a-baf1-49fe-8027-088a9d947631"
}
```

```json
{
  "id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e",
  "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fd8c7883-edcc-46eb-affc-fdac244fb5f4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fd8c7883-edcc-46eb-affc-fdac244fb5f4",
  "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
  "assignment_id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e",
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

`POST /api/driver/v1/work-sessions/bacc3409-def6-460a-9685-802b512b809e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:36Z",
    "sequence": 1793103576417
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:36.436139Z",
  "last_location_at": "2026-10-27T12:19:36.436139Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fd8c7883-edcc-46eb-affc-fdac244fb5f4/arrive` → **200**

```json
{
  "command_id": "f50ae85b-0870-4166-b592-710f701e4912",
  "expected_version": 0
}
```

```json
{
  "id": "fd8c7883-edcc-46eb-affc-fdac244fb5f4",
  "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
  "assignment_id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e",
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
  "arrived_at": "2026-10-27T12:19:36.480626Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/fd8c7883-edcc-46eb-affc-fdac244fb5f4/start` → **200**

```json
{
  "command_id": "0946fab3-36dd-4f6d-8d20-7002d26b7b49",
  "expected_version": 1
}
```

```json
{
  "id": "fd8c7883-edcc-46eb-affc-fdac244fb5f4",
  "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
  "assignment_id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e",
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
  "arrived_at": "2026-10-27T12:19:36.480626Z",
  "started_at": "2026-10-27T12:19:36.524502Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/bacc3409-def6-460a-9685-802b512b809e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:36Z",
    "sequence": 1793103576552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bacc3409-def6-460a-9685-802b512b809e",
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
  "last_heartbeat_at": "2026-10-27T12:19:36.568371Z",
  "last_location_at": "2026-10-27T12:19:36.568371Z",
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
  "device_ref": "sandbox-13718"
}
```

```json
{
  "challenge_id": "d6617d23-c3f4-4c0d-841f-4a2d8128760e",
  "expires_at": "2026-10-27T12:24:36.595347607Z",
  "resend_available_at": "2026-10-27T12:19:37.595347607Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "768367",
  "sent_at": "2026-10-27T12:19:36.598427124Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6617d23-c3f4-4c0d-841f-4a2d8128760e",
  "code": "768367",
  "device_ref": "sandbox-13718"
}
```

```json
{
  "session_id": "3eca907c-1579-4021-aa13-fc9387d5a2f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ3NiwiaWF0IjoxNzkzMTAzNTc2LCJqdGkiOiIxZDY5ZmRkNi1lODI0LTQ3MmEtOThjOS0zZWFlNWI0MmEyMWYiLCJzaWQiOiIzZWNhOTA3Yy0xNTc5LTQwMjEtYWExMy1mYzkzODdkNWEyZjQifQ.wGKMDRCBrMz0w16-O-pjXgUkkU0_Y-GvqTTQN9k4i9E",
  "access_expires_at": "2026-10-27T12:34:36.664041632Z",
  "refresh_token": "pws-2BGHIWBOw631CPWLmUYXps83J1aiZbb8CUrZROs",
  "refresh_expires_at": "2026-11-26T12:19:36.663340912Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "13f7dec8-16ad-4830-aa84-dfb8ba2bfec6",
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
  "last_heartbeat_at": "2026-10-27T12:19:25.283311Z",
  "last_location_at": "2026-10-27T12:19:25.283311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13f7dec8-16ad-4830-aa84-dfb8ba2bfec6/handover` → **200**

```json
{
  "command_id": "26220fdf-da9c-48e0-bc4c-7df2581c260f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "13f7dec8-16ad-4830-aa84-dfb8ba2bfec6",
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
  "last_heartbeat_at": "2026-10-27T12:19:25.283311Z",
  "last_location_at": "2026-10-27T12:19:25.283311Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13f7dec8-16ad-4830-aa84-dfb8ba2bfec6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:36Z",
    "sequence": 1793103576763
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "13f7dec8-16ad-4830-aa84-dfb8ba2bfec6",
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
  "last_heartbeat_at": "2026-10-27T12:19:36.782157Z",
  "last_location_at": "2026-10-27T12:19:36.782157Z",
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
  "session_id": "3a783dbd-bcfa-4786-9f28-f9152a80cc78",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NzcsImlhdCI6MTc5MzEwMzU3NywianRpIjoiNWUxNDNhMDEtNjFkOC00ODZiLWFmN2QtZDI1NzIxZjc4OTlkIiwic2lkIjoiM2E3ODNkYmQtYmNmYS00Nzg2LTlmMjgtZjkxNTJhODBjYzc4In0.up2hY4GPN9zks2FqPRuC0SNd33ezcvSL1ef129yJ_zE",
  "access_expires_at": "2026-10-27T12:34:37.112888225Z",
  "refresh_token": "JrecfEWPSZOkN4AhjuC2QaijQXPfF9tS0IGRYxgJj5k",
  "refresh_expires_at": "2026-10-28T00:19:37.11223585Z",
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
  "session_id": "ed9abfee-361e-405a-a99e-9041d67f39cf",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0NzcsImlhdCI6MTc5MzEwMzU3NywianRpIjoiZmM5ZDAwN2UtMGViYS00MGM0LThmOGUtOWRhNzRhNzk1YjRlIiwic2lkIjoiZWQ5YWJmZWUtMzYxZS00MDVhLWE5OWUtOTA0MWQ2N2YzOWNmIn0.fRovpWJl4C5c82kLT_fHsAPPyspqOFiV24O2h2pbbuY",
  "access_expires_at": "2026-10-27T12:34:37.437248432Z",
  "refresh_token": "9eZQ-X02FOnfN0OtPMiRRbYujKEYLWUvWGZ-w_7C8sY",
  "refresh_expires_at": "2026-10-28T00:19:37.436603029Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/60fd917c-c759-44cc-ba82-dc2e625bd8bf` → **200**

```json
{
  "id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
  "short_number": 5,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "8b4f24ae-eadf-4e61-8862-1e33f9a7eb87",
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
    "id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e",
    "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "fd8c7883-edcc-46eb-affc-fdac244fb5f4",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T12:19:36.295825Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/60fd917c-c759-44cc-ba82-dc2e625bd8bf/interrupt` → **200**

```json
{
  "command_id": "97f46960-f3e1-4c01-9064-d969bbb159da",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
    "short_number": 5,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "8b4f24ae-eadf-4e61-8862-1e33f9a7eb87",
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
      "id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e",
      "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "fd8c7883-edcc-46eb-affc-fdac244fb5f4",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T12:19:36.295825Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
    "short_number": 6,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "8b4f24ae-eadf-4e61-8862-1e33f9a7eb87",
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
    "id": "b16796fb-b2a7-4203-9b1d-b5b4f4b10251",
    "order_id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
    "expires_at": "2026-10-27T12:19:52.53219Z",
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

`POST /api/driver/v1/offers/b16796fb-b2a7-4203-9b1d-b5b4f4b10251/accept` → **200**

```json
{
  "command_id": "4a26acd3-20df-488c-bb8e-fbddcd3f00d2"
}
```

```json
{
  "id": "f9a2c6f0-d8b0-4d18-b46b-38276f09f45f",
  "order_id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1bfb1a3b-a904-4270-8241-3f64c0971d98",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1bfb1a3b-a904-4270-8241-3f64c0971d98",
  "order_id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
  "assignment_id": "f9a2c6f0-d8b0-4d18-b46b-38276f09f45f",
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
  "session_id": "13f7dec8-16ad-4830-aa84-dfb8ba2bfec6",
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
  "last_heartbeat_at": "2026-10-27T12:19:36.782157Z",
  "last_location_at": "2026-10-27T12:19:36.782157Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/13f7dec8-16ad-4830-aa84-dfb8ba2bfec6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:37Z",
    "sequence": 1793103577677
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "13f7dec8-16ad-4830-aa84-dfb8ba2bfec6",
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
  "last_heartbeat_at": "2026-10-27T12:19:37.694453Z",
  "last_location_at": "2026-10-27T12:19:37.694453Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1bfb1a3b-a904-4270-8241-3f64c0971d98/arrive` → **200**

```json
{
  "command_id": "517a7e5a-bc61-4fc3-bcca-ae4c77eb894d",
  "expected_version": 0
}
```

```json
{
  "id": "1bfb1a3b-a904-4270-8241-3f64c0971d98",
  "order_id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
  "assignment_id": "f9a2c6f0-d8b0-4d18-b46b-38276f09f45f",
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
  "arrived_at": "2026-10-27T12:19:37.73713Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/1bfb1a3b-a904-4270-8241-3f64c0971d98/start` → **200**

```json
{
  "command_id": "5a5cba0e-bd06-41ba-ad06-aa91a16f0cfc",
  "expected_version": 1
}
```

```json
{
  "id": "1bfb1a3b-a904-4270-8241-3f64c0971d98",
  "order_id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
  "assignment_id": "f9a2c6f0-d8b0-4d18-b46b-38276f09f45f",
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
  "arrived_at": "2026-10-27T12:19:37.73713Z",
  "started_at": "2026-10-27T12:19:37.779577Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/1bfb1a3b-a904-4270-8241-3f64c0971d98/complete` → **200**

```json
{
  "command_id": "42e2f32f-c4df-44d8-91ee-fc1fa3ab4707",
  "expected_version": 2,
  "reported_at": "2026-10-27T12:19:37Z"
}
```

```json
{
  "id": "1bfb1a3b-a904-4270-8241-3f64c0971d98",
  "order_id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
  "assignment_id": "f9a2c6f0-d8b0-4d18-b46b-38276f09f45f",
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
  "arrived_at": "2026-10-27T12:19:37.73713Z",
  "started_at": "2026-10-27T12:19:37.779577Z",
  "completed_at": "2026-10-27T12:19:37.824637Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "ffa6feab-e8ef-41ea-ad69-60d83b178d17",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-27T12:19:37.519107Z",
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
    "id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-27T12:19:36.295825Z",
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
        "uk": "Поломка автомобіля в дорозі",
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути"
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

`GET /api/operator/v1/orders/60fd917c-c759-44cc-ba82-dc2e625bd8bf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T12:19:36.296495Z",
      "actor": {
        "type": "CLIENT",
        "id": "8b4f24ae-eadf-4e61-8862-1e33f9a7eb87",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
        "quote_id": "f993c36e-c0e1-447f-88a3-4484370ccaf4",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T12:19:36.298502Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
        "attempt_id": "9fec0af1-994e-4954-8b42-ac76cc325fde",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T12:19:36.304428Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f1a553a1-0982-4046-9d41-77556219b9a9",
        "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T12:19:36.369134Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f1a553a1-0982-4046-9d41-77556219b9a9",
        "order_id": "60fd917c-c759-44cc-ba82-dc2e625bd8bf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "b01ae539-cc27-4bfe-9519-cc67ab525c7e"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 60fd917c-c759-44cc-ba82-dc2e625bd8bf, follow-up ffa6feab-e8ef-41ea-ad69-60d83b178d17.

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
  "session_id": "20392ddf-b995-4e89-be17-5b2175294b1a",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0ODEsImlhdCI6MTc5MzEwMzU4MSwianRpIjoiOTMzMGIzZDctOGY0My00MzUzLTkyNjMtODA5MGNhOGU5YzQzIiwic2lkIjoiMjAzOTJkZGYtYjk5NS00ZTg5LWJlMTctNWIyMTc1Mjk0YjFhIn0.jYnNxHJ40AgwtkeI2Dnh5FUsRwDjEWycnelIDs-gm7Y",
  "access_expires_at": "2026-10-27T12:34:41.255923527Z",
  "refresh_token": "t0XPXhsUOWvKA3zq8M7GA21ku2D5uKCJr-xA5dsbN1I",
  "refresh_expires_at": "2026-10-28T00:19:41.255199706Z",
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
  "command_id": "5d2c876a-3acf-4f93-9848-47298e8fb51a",
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
  "changed_by": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T12:19:41.331885049Z"
}
```

## The rider books the airport for 2026-10-27T15:19:40Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600503803",
  "device_ref": "sandbox-22332"
}
```

```json
{
  "challenge_id": "b41e173c-9cef-4f3d-b424-b5dec8734fce",
  "expires_at": "2026-10-27T12:24:41.370136946Z",
  "resend_available_at": "2026-10-27T12:19:42.370136946Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600503803` → **200**

```json
{
  "phone": "+48600503803",
  "audience": "CLIENT",
  "code": "030669",
  "sent_at": "2026-10-27T12:19:41.373483703Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b41e173c-9cef-4f3d-b424-b5dec8734fce",
  "code": "030669",
  "device_ref": "sandbox-22332"
}
```

```json
{
  "session_id": "1cbcd0d3-e6bd-402c-bc92-fd733555081f",
  "subject": {
    "type": "CLIENT",
    "id": "9e7064c9-41b5-4297-bac0-2da448b6b6cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTcwNjRjOS00MWI1LTQyOTctYmFjMC0yZGE0NDhiNmI2Y2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0NDgxLCJpYXQiOjE3OTMxMDM1ODEsImp0aSI6IjFlNzJjMzQ1LTEyZDMtNDdlNi05MmJiLTFmNTkxMWVlYzZkMSIsInNpZCI6IjFjYmNkMGQzLWU2YmQtNDAyYy1iYzkyLWZkNzMzNTU1MDgxZiJ9.RelpSDEMDTU3ILj0XlqBfC700z6RV9gO7oK8mDJqQc8",
  "access_expires_at": "2026-10-27T12:34:41.435745383Z",
  "refresh_token": "ILvLquiiQww_s3Om3FfljEavX39bcfSY8X4V95rBNHA",
  "refresh_expires_at": "2026-11-26T12:19:41.434819387Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d8d215d2-be97-4e2a-b29d-45c574f2d956",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T15:19:40Z"
}
```

```json
{
  "id": "2321025e-945d-4542-9791-016fcce1d0bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T12:24:41.477579Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T15:19:40Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7c209943-fd63-455d-9369-e52ca9e12fe3",
  "quote_id": "2321025e-945d-4542-9791-016fcce1d0bb",
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
  "pickup_at": "2026-10-27T15:19:40Z"
}
```

```json
{
  "id": "453b9214-62bf-4416-8048-4dff71033555",
  "short_number": 7,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9e7064c9-41b5-4297-bac0-2da448b6b6cd",
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
  "created_at": "2026-10-27T12:19:41.518165Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T15:19:40Z",
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
  "device_ref": "sandbox-12254"
}
```

```json
{
  "challenge_id": "02b89dcd-f2ba-4d0f-90a7-b5226958ece6",
  "expires_at": "2026-10-27T12:24:41.552545237Z",
  "resend_available_at": "2026-10-27T12:19:42.552545237Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "028098",
  "sent_at": "2026-10-27T12:19:41.556037055Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02b89dcd-f2ba-4d0f-90a7-b5226958ece6",
  "code": "028098",
  "device_ref": "sandbox-12254"
}
```

```json
{
  "session_id": "000122b5-49af-433c-bf67-9308b307f470",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEwNDQ4MSwiaWF0IjoxNzkzMTAzNTgxLCJqdGkiOiJkMTNmM2QxMi02ZWU5LTRlZTctOTM5OS0zMDhjMDc0NzdlNWYiLCJzaWQiOiIwMDAxMjJiNS00OWFmLTQzM2MtYmY2Ny05MzA4YjMwN2Y0NzAifQ.P3EbA7gHPMfUMzqNpa3CLg0kwMwvjHh8xAASwVps2CM",
  "access_expires_at": "2026-10-27T12:34:41.614991594Z",
  "refresh_token": "z0-p-bl7jAD6TwTNsw1cKup7t7E75h7ycFevbpG4oLg",
  "refresh_expires_at": "2026-11-26T12:19:41.614343927Z",
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
  "command_id": "45e9c06e-1450-45c0-91c3-d2769618e16d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T12:19:41Z",
    "sequence": 1793103581670
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e5c0908b-e9d4-43a6-be57-4a0a7bbdb110",
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
  "last_heartbeat_at": "2026-10-27T12:19:41.687061Z",
  "last_location_at": "2026-10-27T12:19:41.687061Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "453b9214-62bf-4416-8048-4dff71033555",
      "short_number": 7,
      "pickup_at": "2026-10-27T15:19:40Z",
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

`POST /api/driver/v1/preorders/453b9214-62bf-4416-8048-4dff71033555/reserve` → **200**

```json
{
  "command_id": "4107cc16-18c2-42b9-8bdb-a6b852be2e28"
}
```

```json
{
  "id": "4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a",
  "state": "RESERVED",
  "order": {
    "order_id": "453b9214-62bf-4416-8048-4dff71033555",
    "short_number": 7,
    "pickup_at": "2026-10-27T15:19:40Z",
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
  "reserved_at": "2026-10-27T12:19:41.760831Z",
  "confirm_from": "2026-10-27T14:49:40Z",
  "confirm_until": "2026-10-27T14:59:40Z",
  "drop_until": "2026-10-27T14:19:40Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a",
      "state": "RESERVED",
      "order": {
        "order_id": "453b9214-62bf-4416-8048-4dff71033555",
        "short_number": 7,
        "pickup_at": "2026-10-27T15:19:40Z",
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
      "reserved_at": "2026-10-27T12:19:41.760831Z",
      "confirm_from": "2026-10-27T14:49:40Z",
      "confirm_until": "2026-10-27T14:59:40Z",
      "drop_until": "2026-10-27T14:19:40Z"
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
      "id": "4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a",
      "state": "RESERVED",
      "order": {
        "order_id": "453b9214-62bf-4416-8048-4dff71033555",
        "short_number": 7,
        "pickup_at": "2026-10-27T15:19:40Z",
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
      "reserved_at": "2026-10-27T12:19:41.760831Z",
      "confirm_from": "2026-10-27T14:49:40Z",
      "confirm_until": "2026-10-27T14:59:40Z",
      "drop_until": "2026-10-27T14:19:40Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a/confirm` → **409**

```json
{
  "command_id": "adfc9d93-4ca0-4dd5-9213-4b6016462ea0"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d4bef7fb-a738-4f19-959c-68fb36011f46"
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
  "session_id": "741bee84-a8e4-48f4-b1f7-7b5cfbc22745",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0ODIsImlhdCI6MTc5MzEwMzU4MiwianRpIjoiZTlmODJlZGMtODMyMi00YzIwLTgyMjctMTEzMmZlMjg2MjkzIiwic2lkIjoiNzQxYmVlODQtYThlNC00OGY0LWIxZjctN2I1Y2ZiYzIyNzQ1In0.xMnlzuumGOyVeENxQa05E0Xsf352wPOG0dVpig7ybbQ",
  "access_expires_at": "2026-10-27T12:34:42.19204641Z",
  "refresh_token": "mEXVmtxkwBkLW0sbIHQwZ5lMBWuIPFkdJT7kNwI5GY8",
  "refresh_expires_at": "2026-10-28T00:19:42.191372526Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/453b9214-62bf-4416-8048-4dff71033555` → **200**

```json
{
  "id": "453b9214-62bf-4416-8048-4dff71033555",
  "short_number": 7,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "9e7064c9-41b5-4297-bac0-2da448b6b6cd",
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
  "created_at": "2026-10-27T12:19:41.518165Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T15:19:40Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T12:19:41.760831Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/453b9214-62bf-4416-8048-4dff71033555/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T12:19:41.519899Z",
      "actor": {
        "type": "CLIENT",
        "id": "9e7064c9-41b5-4297-bac0-2da448b6b6cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "453b9214-62bf-4416-8048-4dff71033555",
        "preorder": true,
        "quote_id": "2321025e-945d-4542-9791-016fcce1d0bb",
        "pickup_at": "2026-10-27T15:19:40Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T12:19:41.762008Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "453b9214-62bf-4416-8048-4dff71033555",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a"
      }
    }
  ]
}
```

Done: pre-order 453b9214-62bf-4416-8048-4dff71033555, reservation 4026ac4d-e7ef-4b93-86cc-8a41fd1e7f3a.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678944396",
  "device_ref": "sandbox-5609"
}
```

```json
{
  "challenge_id": "5bd4a94c-86f5-4414-b35d-c51f9a4bf856",
  "expires_at": "2026-10-27T12:24:42.296933981Z",
  "resend_available_at": "2026-10-27T12:19:43.296933981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678944396` → **200**

```json
{
  "phone": "+380678944396",
  "audience": "CLIENT",
  "code": "100234",
  "sent_at": "2026-10-27T12:19:42.300577992Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5bd4a94c-86f5-4414-b35d-c51f9a4bf856",
  "code": "100234",
  "device_ref": "sandbox-5609"
}
```

```json
{
  "session_id": "3be8ceef-c260-493b-b2d2-e626fccb0581",
  "subject": {
    "type": "CLIENT",
    "id": "49306ddb-8709-40b6-8965-9d743f898f15"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OTMwNmRkYi04NzA5LTQwYjYtODk2NS05ZDc0M2Y4OThmMTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTA0NDgyLCJpYXQiOjE3OTMxMDM1ODIsImp0aSI6ImVmMWUwNGYwLTc1YjItNDEyNC1iYzA4LTFkZjk5MjljM2FmMCIsInNpZCI6IjNiZThjZWVmLWMyNjAtNDkzYi1iMmQyLWU2MjZmY2NiMDU4MSJ9.N2cSNgFzgVwRogfeLhMQvKdieIf10-pl6MFEuWJ11fY",
  "access_expires_at": "2026-10-27T12:34:42.367146942Z",
  "refresh_token": "Tp4UnsF2WolKqCpFnIXe01-z08KGpWrpabdayy-n9uc",
  "refresh_expires_at": "2026-11-26T12:19:42.366479859Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f573a7c4-bd78-4a36-a98d-ec3a83cb2213",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f7fb65b5-2c16-44be-b9ac-64e5e782c432",
  "upload_path": "/api/rider/v1/uploads/f7fb65b5-2c16-44be-b9ac-64e5e782c432",
  "expires_at": "2026-10-27T12:34:42.40705357Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/f7fb65b5-2c16-44be-b9ac-64e5e782c432` → **200**

```json
{
  "file_id": "f7fb65b5-2c16-44be-b9ac-64e5e782c432",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "fc6a15ca-6577-4e06-8bb5-f24f19eff01f",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "f7fb65b5-2c16-44be-b9ac-64e5e782c432"
  ]
}
```

```json
{
  "id": "10f6f130-50df-4656-bf8d-9f014f3df4be",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "49306ddb-8709-40b6-8965-9d743f898f15",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T12:19:42.496365Z",
  "updated_at": "2026-10-27T12:19:42.496365Z",
  "messages": [
    {
      "id": "b7d69173-1627-4622-91e6-acdc549a93d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "49306ddb-8709-40b6-8965-9d743f898f15",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:19:42.498796Z",
      "attachments": [
        {
          "file_id": "f7fb65b5-2c16-44be-b9ac-64e5e782c432",
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
  "session_id": "08ec43e0-6087-4d0b-a5d5-3fc2e305a5a6",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0ODIsImlhdCI6MTc5MzEwMzU4MiwianRpIjoiZWI0YTAzMGUtN2Y0ZC00OWMzLWExYzEtYWIxOGFhNzI1ZjBiIiwic2lkIjoiMDhlYzQzZTAtNjA4Ny00ZDBiLWE1ZDUtM2ZjMmUzMDVhNWE2In0.dSZKMmO_-mJ1Ch8I34S0Fk9dmWM3GVrH-yLgdmpVh0w",
  "access_expires_at": "2026-10-27T12:34:42.85017047Z",
  "refresh_token": "tcgpF0UirJfsEbDX_gztNOQQG1Surzp1sJa6j-F4lrk",
  "refresh_expires_at": "2026-10-28T00:19:42.849561445Z",
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
  "session_id": "637c3cff-0ced-49c6-a82c-87a1cc30cd91",
  "subject": {
    "type": "STAFF",
    "id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZDhiMGUzNi1hNjhiLTRkMTktOGU1OC02YjJjYzZkNWMzNjkiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMDQ0ODMsImlhdCI6MTc5MzEwMzU4MywianRpIjoiNWNkNTUxODgtYzY4ZS00ODVlLTk0YzktMDg3YWJiNjU4Y2Y2Iiwic2lkIjoiNjM3YzNjZmYtMGNlZC00OWM2LWE4MmMtODdhMWNjMzBjZDkxIn0.hiRraAH66jUFXuJCa4Wttv9hK0T4fn9k3CV72okZ1q4",
  "access_expires_at": "2026-10-27T12:34:43.172847731Z",
  "refresh_token": "Ku25imkD2Bo0Bvoj3qBcZ4TIOAWveWab4Mf2N-XwGXw",
  "refresh_expires_at": "2026-10-28T00:19:43.172221874Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/10f6f130-50df-4656-bf8d-9f014f3df4be/attachments/f7fb65b5-2c16-44be-b9ac-64e5e782c432` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "1ffb1161-19f0-483f-bab9-a6419c1ebd9a",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "b45b7ac7-bf9f-40f4-8057-1aa97a627415",
  "upload_path": "/api/operator/v1/uploads/b45b7ac7-bf9f-40f4-8057-1aa97a627415",
  "expires_at": "2026-10-27T12:34:43.228428858Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/b45b7ac7-bf9f-40f4-8057-1aa97a627415` → **200**

```json
{
  "file_id": "b45b7ac7-bf9f-40f4-8057-1aa97a627415",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/10f6f130-50df-4656-bf8d-9f014f3df4be` → **200**

```json
{
  "id": "10f6f130-50df-4656-bf8d-9f014f3df4be",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "49306ddb-8709-40b6-8965-9d743f898f15",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T12:19:42.496365Z",
  "updated_at": "2026-10-27T12:19:42.496365Z",
  "messages": [
    {
      "id": "b7d69173-1627-4622-91e6-acdc549a93d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "49306ddb-8709-40b6-8965-9d743f898f15",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:19:42.498796Z",
      "attachments": [
        {
          "file_id": "f7fb65b5-2c16-44be-b9ac-64e5e782c432",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/10f6f130-50df-4656-bf8d-9f014f3df4be/comments` → **200**

```json
{
  "command_id": "2d71f444-208c-4b3d-bc68-9dc20739d639",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "b45b7ac7-bf9f-40f4-8057-1aa97a627415"
  ]
}
```

```json
{
  "id": "10f6f130-50df-4656-bf8d-9f014f3df4be",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "49306ddb-8709-40b6-8965-9d743f898f15",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T12:19:42.496365Z",
  "updated_at": "2026-10-27T12:19:43.340192Z",
  "messages": [
    {
      "id": "b7d69173-1627-4622-91e6-acdc549a93d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "49306ddb-8709-40b6-8965-9d743f898f15",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:19:42.498796Z",
      "attachments": [
        {
          "file_id": "f7fb65b5-2c16-44be-b9ac-64e5e782c432",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "df4d2c03-cd60-465b-8e62-b87e8a51953c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "fd8b0e36-a68b-4d19-8e58-6b2cc6d5c369",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T12:19:43.33973Z",
      "attachments": [
        {
          "file_id": "b45b7ac7-bf9f-40f4-8057-1aa97a627415",
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

`GET /api/rider/v1/support/cases/10f6f130-50df-4656-bf8d-9f014f3df4be` → **200**

```json
{
  "id": "10f6f130-50df-4656-bf8d-9f014f3df4be",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "49306ddb-8709-40b6-8965-9d743f898f15",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T12:19:42.496365Z",
  "updated_at": "2026-10-27T12:19:43.340192Z",
  "messages": [
    {
      "id": "b7d69173-1627-4622-91e6-acdc549a93d1",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "49306ddb-8709-40b6-8965-9d743f898f15",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T12:19:42.498796Z",
      "attachments": [
        {
          "file_id": "f7fb65b5-2c16-44be-b9ac-64e5e782c432",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "df4d2c03-cd60-465b-8e62-b87e8a51953c",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T12:19:43.33973Z",
      "attachments": [
        {
          "file_id": "b45b7ac7-bf9f-40f4-8057-1aa97a627415",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/10f6f130-50df-4656-bf8d-9f014f3df4be/attachments/b45b7ac7-bf9f-40f4-8057-1aa97a627415` → **200**

Done: support case 10f6f130-50df-4656-bf8d-9f014f3df4be, rider attachment f7fb65b5-2c16-44be-b9ac-64e5e782c432, operator attachment b45b7ac7-bf9f-40f4-8057-1aa97a627415.
