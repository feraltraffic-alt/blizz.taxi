# Sandbox transcript (2026-10-27T09:22:57Z, 2820b99)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636468496",
  "device_ref": "sandbox-7143"
}
```

```json
{
  "challenge_id": "ee07cc0b-0dba-4447-98ec-16ca8da90287",
  "expires_at": "2026-10-27T09:27:57.663990991Z",
  "resend_available_at": "2026-10-27T09:23:57.663990991Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636468496` → **200**

```json
{
  "phone": "+380636468496",
  "audience": "CLIENT",
  "code": "560668",
  "sent_at": "2026-10-27T09:22:57.676738351Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ee07cc0b-0dba-4447-98ec-16ca8da90287",
  "code": "560668",
  "device_ref": "sandbox-7143"
}
```

```json
{
  "session_id": "214fa0ab-6e3e-412a-a409-773b62966a24",
  "subject": {
    "type": "CLIENT",
    "id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OWJlMGVlYi0yYTU0LTQ2ZWYtOTJlNC01MDc4OWY0ZWEyZDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkzODc3LCJpYXQiOjE3OTMwOTI5NzcsImp0aSI6IjAzZTY0YjMxLWM2NTktNDBiMS1hOTc2LTJhMzg4YTEyM2U2NSIsInNpZCI6IjIxNGZhMGFiLTZlM2UtNDEyYS1hNDA5LTc3M2I2Mjk2NmEyNCJ9.SGonshm-pZ9jbRpk0F6Xk4uVsx5jmGkNRcaNINZrFO0",
  "access_expires_at": "2026-10-27T09:37:57.795548727Z",
  "refresh_token": "w1IXDNgdhDUbNv-ajCsgHV4Lm8jBXg46hTnMK7GAu10",
  "refresh_expires_at": "2026-11-26T09:22:57.793544463Z",
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
  "device_ref": "sandbox-27518"
}
```

```json
{
  "challenge_id": "7bb271cc-fe60-45fe-84a4-60ec9b60a27c",
  "expires_at": "2026-10-27T09:27:57.924943779Z",
  "resend_available_at": "2026-10-27T09:23:57.924943779Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "769245",
  "sent_at": "2026-10-27T09:22:57.929108398Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7bb271cc-fe60-45fe-84a4-60ec9b60a27c",
  "code": "769245",
  "device_ref": "sandbox-27518"
}
```

```json
{
  "session_id": "2cd39bc6-d1b8-4a3c-a4f4-2c8c1ea3fc51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5Mzg3NywiaWF0IjoxNzkzMDkyOTc3LCJqdGkiOiJiOTBlYTA4My1mNWU4LTQ5ZjQtYjhmMi00ZjYyNzI2MjRhODUiLCJzaWQiOiIyY2QzOWJjNi1kMWI4LTRhM2MtYTRmNC0yYzhjMWVhM2ZjNTEifQ.3BMlacj7KJcuVq3RajrED3aMjVcmN8WB66Brc_E_lyU",
  "access_expires_at": "2026-10-27T09:37:57.992418571Z",
  "refresh_token": "8rpnd9V4x-saUhn1J9DZ4riIP0DPuHOMcxbP1nIzgOU",
  "refresh_expires_at": "2026-11-26T09:22:57.991218433Z",
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
  "correlation_id": "73b60b03-040d-4696-9ff4-80f96094a7ea"
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
  "session_id": "29dcf834-cd45-42ea-8c76-8d98853443cf",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4NzgsImlhdCI6MTc5MzA5Mjk3OCwianRpIjoiMGRlYTM3ZTctZDc4NS00NGY1LThkNzEtYTRmM2U3ZjFjMTM2Iiwic2lkIjoiMjlkY2Y4MzQtY2Q0NS00MmVhLThjNzYtOGQ5ODg1MzQ0M2NmIn0.JMdIjPdrgoI5ILnsRB1v1X0bn8xnUWoLpbmj8hrOizk",
  "access_expires_at": "2026-10-27T09:37:58.70465557Z",
  "refresh_token": "0bZa0KXmlmvRFpGQksysm753PDJx7JuUY3WlyLTYEj0",
  "refresh_expires_at": "2026-10-27T21:22:58.703505776Z",
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
  "session_id": "71cad848-519f-482f-aa5e-c8787cd75428",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4NzksImlhdCI6MTc5MzA5Mjk3OSwianRpIjoiZTNkYTlmNjYtZWMwMi00ZjE3LWFlM2EtYmFiMDMxMzBiNmQyIiwic2lkIjoiNzFjYWQ4NDgtNTE5Zi00ODJmLWFhNWUtYzg3ODdjZDc1NDI4In0.fnG3E9sqUMLxVDRwtTg7hSvHmmFe5GsscHBl_4oNeko",
  "access_expires_at": "2026-10-27T09:37:59.948488102Z",
  "refresh_token": "4zG075N_jVtwTP86SYQCL1q0XFb4Av4gdK03fKjK8w0",
  "refresh_expires_at": "2026-10-27T21:22:59.947396577Z",
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
  "session_id": "0cd26f5d-2ee3-4c80-bb62-12b79cbc9192",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4ODAsImlhdCI6MTc5MzA5Mjk4MCwianRpIjoiNzg5Mzg4MDItOTViMS00MGI1LWJjOTktNDk0Y2ZkZTg4Mjk2Iiwic2lkIjoiMGNkMjZmNWQtMmVlMy00YzgwLWJiNjItMTJiNzljYmM5MTkyIn0.Hd8sNjjyuZn9SYgZAxKBzll-kVYzpiu4e7DW8qUpdYU",
  "access_expires_at": "2026-10-27T09:38:00.274543469Z",
  "refresh_token": "S6LPCH4idCMwS34jbPz99AjR6l82WBv1Dm1zJyn_0cU",
  "refresh_expires_at": "2026-10-27T21:23:00.273495606Z",
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
  "command_id": "22d8a5a6-e4bd-41c4-8dbf-5a1a9acb7ddb",
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
  "id": "91ae07bc-efe6-4e2e-8b5e-2c4f711fa30c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:28:00.448024Z",
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
  "command_id": "344c08cf-bd25-40bf-9f65-b4fd11c3ba29",
  "quote_id": "91ae07bc-efe6-4e2e-8b5e-2c4f711fa30c",
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
  "id": "b477949f-3847-48ae-a691-4a9ac65d5bc1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3",
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
  "created_at": "2026-10-27T09:23:00.568566Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/b477949f-3847-48ae-a691-4a9ac65d5bc1` → **200**

```json
{
  "id": "b477949f-3847-48ae-a691-4a9ac65d5bc1",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3",
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
  "created_at": "2026-10-27T09:23:00.568566Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/b477949f-3847-48ae-a691-4a9ac65d5bc1/cancel` → **200**

```json
{
  "command_id": "ef5d43e6-3e79-45bb-a777-112d1404be3b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "b477949f-3847-48ae-a691-4a9ac65d5bc1",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3",
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
  "created_at": "2026-10-27T09:23:00.568566Z",
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
  "command_id": "df9a6663-f31e-4216-ac7c-725997112949",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:23:00Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8e4736a3-abfa-4f37-8b7d-69ccef3df0b4",
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
  "last_heartbeat_at": "2026-10-27T09:23:00.793314Z",
  "last_location_at": "2026-10-27T09:23:00.793314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29033"
}
```

```json
{
  "challenge_id": "abc9e87f-bd07-49c9-9cd4-f43dc3b0e92a",
  "expires_at": "2026-10-27T09:28:00.830960668Z",
  "resend_available_at": "2026-10-27T09:24:00.830960668Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "675798",
  "sent_at": "2026-10-27T09:23:00.835182643Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abc9e87f-bd07-49c9-9cd4-f43dc3b0e92a",
  "code": "675798",
  "device_ref": "sandbox-29033"
}
```

```json
{
  "session_id": "b929f694-a94d-49bc-b258-07923e691d52",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5Mzg4MCwiaWF0IjoxNzkzMDkyOTgwLCJqdGkiOiI3YTU3YTc5ZC0zZWJhLTQzY2YtODZkZi1kNmQ3ZjVlMjkwOTUiLCJzaWQiOiJiOTI5ZjY5NC1hOTRkLTQ5YmMtYjI1OC0wNzkyM2U2OTFkNTIifQ.eeUIMzNhGne-orET6Vbr24ygdHBr_t9dZZJMA4U2v8o",
  "access_expires_at": "2026-10-27T09:38:00.892951893Z",
  "refresh_token": "C1AJtpgy6472MpuCv_BgXthv8ADcz1Lcx0lSZbnDhHs",
  "refresh_expires_at": "2026-11-26T09:23:00.892016639Z",
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
  "command_id": "25f3b291-dc36-47b2-bb46-029ac287496f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:23:00Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7f17e1c4-6202-404b-af55-232ce46054f4",
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
  "last_heartbeat_at": "2026-10-27T09:23:00.966598Z",
  "last_location_at": "2026-10-27T09:23:00.966598Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1d4777d8-edbc-4523-a18e-ba8ec58bdc77",
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
  "id": "b515f956-ff5c-4de0-b582-658846d1ac8e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:28:01.010592Z",
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
  "command_id": "59e4bc53-78f5-4b52-8fd4-2eab63a7a13e",
  "quote_id": "b515f956-ff5c-4de0-b582-658846d1ac8e",
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
  "id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3",
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
  "created_at": "2026-10-27T09:23:01.051819Z",
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
    "id": "560c470c-168c-45fa-bdd0-5bf08e920afa",
    "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
    "expires_at": "2026-10-27T09:23:16.057352Z",
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

`POST /api/driver/v1/offers/560c470c-168c-45fa-bdd0-5bf08e920afa/accept` → **200**

```json
{
  "command_id": "72ff7bdf-794a-41fe-8983-90581852b8d5"
}
```

```json
{
  "id": "76c19c39-a740-4d98-b7b3-ddfc8041655c",
  "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c849371b-a6cd-449b-9c5d-a0e261b93450",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c849371b-a6cd-449b-9c5d-a0e261b93450",
  "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "assignment_id": "76c19c39-a740-4d98-b7b3-ddfc8041655c",
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

`POST /api/driver/v1/trips/c849371b-a6cd-449b-9c5d-a0e261b93450/cancel` → **200**

```json
{
  "command_id": "3937b19e-5571-4b61-af4d-4e2d60d351a4",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "c849371b-a6cd-449b-9c5d-a0e261b93450",
  "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "assignment_id": "76c19c39-a740-4d98-b7b3-ddfc8041655c",
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

`GET /api/rider/v1/orders/f4c831fc-389a-4725-a5fe-946185ee0a1e` → **200**

```json
{
  "id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3",
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
    "id": "76c19c39-a740-4d98-b7b3-ddfc8041655c",
    "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c849371b-a6cd-449b-9c5d-a0e261b93450",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T09:23:01.051819Z",
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
    "id": "81c0e1b9-8af2-4d2b-9466-f86cf6aa3c02",
    "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
    "expires_at": "2026-10-27T09:23:16.238852Z",
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

`POST /api/driver/v1/offers/81c0e1b9-8af2-4d2b-9466-f86cf6aa3c02/accept` → **200**

```json
{
  "command_id": "e24633ad-e168-4533-9462-7419bb4722ae"
}
```

```json
{
  "id": "1da451b7-193f-43e1-a100-6176785e16b5",
  "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "01279dc9-1330-4eb2-ba46-a837dd3387d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "01279dc9-1330-4eb2-ba46-a837dd3387d3",
  "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "assignment_id": "1da451b7-193f-43e1-a100-6176785e16b5",
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

`POST /api/driver/v1/trips/01279dc9-1330-4eb2-ba46-a837dd3387d3/cancel` → **200**

```json
{
  "command_id": "00bc9fdb-133d-49f3-b8d9-12975fa1419e",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "01279dc9-1330-4eb2-ba46-a837dd3387d3",
  "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
  "assignment_id": "1da451b7-193f-43e1-a100-6176785e16b5",
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
    "id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:23:01.051819Z",
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
    "id": "b477949f-3847-48ae-a691-4a9ac65d5bc1",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T09:23:00.568566Z",
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

`GET /api/operator/v1/orders/f4c831fc-389a-4725-a5fe-946185ee0a1e/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:23:01.052661Z",
      "actor": {
        "type": "CLIENT",
        "id": "59be0eeb-2a54-46ef-92e4-50789f4ea2d3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
        "quote_id": "b515f956-ff5c-4de0-b582-658846d1ac8e",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:23:01.055838Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
        "attempt_id": "35a42c36-060e-4ee0-998a-12745670ac84",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:23:01.06476Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "560c470c-168c-45fa-bdd0-5bf08e920afa",
        "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:23:01.14888Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "560c470c-168c-45fa-bdd0-5bf08e920afa",
        "order_id": "f4c831fc-389a-4725-a5fe-946185ee0a1e",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "76c19c39-a740-4d98-b7b3-ddfc8041655c"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders b477949f-3847-48ae-a691-4a9ac65d5bc1, f4c831fc-389a-4725-a5fe-946185ee0a1e.

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
  "device_ref": "sandbox-634"
}
```

```json
{
  "challenge_id": "39f5b146-15e9-4170-a9f6-1c6ee1476dd8",
  "expires_at": "2026-10-27T09:28:01.558676002Z",
  "resend_available_at": "2026-10-27T09:24:01.558676002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "159589",
  "sent_at": "2026-10-27T09:23:01.562417833Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39f5b146-15e9-4170-a9f6-1c6ee1476dd8",
  "code": "159589",
  "device_ref": "sandbox-634"
}
```

```json
{
  "session_id": "8fdf3c00-6208-4564-beba-af635f44b311",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5Mzg4MSwiaWF0IjoxNzkzMDkyOTgxLCJqdGkiOiI2ZTFmZGU5Zi1mMTk5LTRjN2EtOTU4ZC0wYTI5OTM5M2NlMjkiLCJzaWQiOiI4ZmRmM2MwMC02MjA4LTQ1NjQtYmViYS1hZjYzNWY0NGIzMTEifQ.BEOjPdb4qz3wnmZq4XINbgvxP4g3W-16P64E9z8kToE",
  "access_expires_at": "2026-10-27T09:38:01.620852334Z",
  "refresh_token": "in20qrZDrlCs0wVgpQj_PEQYx9ZhVfsxNmqPGNt4RtQ",
  "refresh_expires_at": "2026-11-26T09:23:01.619937085Z",
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
  "command_id": "f0c4996f-03b4-4f74-8187-11e52dfaa673",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:23:01Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a1b793e-3188-4ae9-8fbd-e5a6e4a53be9",
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
  "last_heartbeat_at": "2026-10-27T09:23:01.692413Z",
  "last_location_at": "2026-10-27T09:23:01.692413Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677777887",
  "device_ref": "sandbox-18394"
}
```

```json
{
  "challenge_id": "258d30df-fc6e-4c37-9389-6e602003db1b",
  "expires_at": "2026-10-27T09:28:01.727360401Z",
  "resend_available_at": "2026-10-27T09:24:01.727360401Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677777887` → **200**

```json
{
  "phone": "+380677777887",
  "audience": "CLIENT",
  "code": "664083",
  "sent_at": "2026-10-27T09:23:01.731159708Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "258d30df-fc6e-4c37-9389-6e602003db1b",
  "code": "664083",
  "device_ref": "sandbox-18394"
}
```

```json
{
  "session_id": "5d478c2c-10be-4851-9a8e-864cf21065b5",
  "subject": {
    "type": "CLIENT",
    "id": "6f3ab20b-86fe-4a0a-af7c-1a08ad14d70f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjNhYjIwYi04NmZlLTRhMGEtYWY3Yy0xYTA4YWQxNGQ3MGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkzODgxLCJpYXQiOjE3OTMwOTI5ODEsImp0aSI6IjcwYzVhYzk1LTJmMDktNDE3OS1iZWU1LTM4M2FlM2JlYmQ1OCIsInNpZCI6IjVkNDc4YzJjLTEwYmUtNDg1MS05YThlLTg2NGNmMjEwNjViNSJ9.shTThwX5Ru7yG-aeVrsBJOA2fOE2Top1SnDOc3zb10g",
  "access_expires_at": "2026-10-27T09:38:01.786368199Z",
  "refresh_token": "S_FC88vQds_eX9iKx3V1uYI09IIOJotNh7uBvLHM_QQ",
  "refresh_expires_at": "2026-11-26T09:23:01.785567905Z",
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
  "command_id": "47f75fae-1abb-4c32-86f0-8d224096ac9a",
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
  "id": "9da20c01-938a-45bf-a8ed-28f4e94d116d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T09:28:01.854702Z",
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
  "command_id": "ee3a9186-89eb-476f-a327-c8e7cfda8d94",
  "quote_id": "9da20c01-938a-45bf-a8ed-28f4e94d116d",
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
  "id": "def4817b-a277-4544-a359-f310075bcc8d",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f3ab20b-86fe-4a0a-af7c-1a08ad14d70f",
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
  "created_at": "2026-10-27T09:23:01.897819Z",
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
    "id": "cc46c78b-6340-4ba8-9656-dba08fcded56",
    "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
    "expires_at": "2026-10-27T09:23:16.902757Z",
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

`POST /api/driver/v1/offers/cc46c78b-6340-4ba8-9656-dba08fcded56/accept` → **200**

```json
{
  "command_id": "8f8d5118-5e06-4bb9-921f-5c5e7a5f764a"
}
```

```json
{
  "id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/def4817b-a277-4544-a359-f310075bcc8d/messages` → **201**

```json
{
  "command_id": "c2068dcf-61e2-4016-a8b5-4511dbd73ce8",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "fb877c91-c7f1-4adb-8a7f-b0b7516a1349",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T09:23:02.018648532Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "assignment_id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
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

`POST /api/driver/v1/trips/34ec2b67-8f10-48a9-8b96-aa0879f43c9a/messages` → **201**

```json
{
  "command_id": "3c1b357e-1359-4e74-be0d-0f342ffc4944",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "99b05d4d-2240-4989-97a1-18ff780be63a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T09:23:02.077871521Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/def4817b-a277-4544-a359-f310075bcc8d/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/34ec2b67-8f10-48a9-8b96-aa0879f43c9a/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677777887"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/5a1b793e-3188-4ae9-8fbd-e5a6e4a53be9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:23:02Z",
    "sequence": 2
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a1b793e-3188-4ae9-8fbd-e5a6e4a53be9",
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
  "last_heartbeat_at": "2026-10-27T09:23:02.174877Z",
  "last_location_at": "2026-10-27T09:23:02.174877Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "assignment_id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
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

`POST /api/driver/v1/trips/34ec2b67-8f10-48a9-8b96-aa0879f43c9a/arrive` → **200**

```json
{
  "command_id": "cd66d97a-fee9-4161-821a-667006b47b06",
  "expected_version": 0
}
```

```json
{
  "id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "assignment_id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
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
  "arrived_at": "2026-10-27T09:23:02.236463Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/34ec2b67-8f10-48a9-8b96-aa0879f43c9a/start` → **200**

```json
{
  "command_id": "32da289c-fb1e-438d-9e4a-2486b04bde90",
  "expected_version": 1
}
```

```json
{
  "id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "assignment_id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
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
  "arrived_at": "2026-10-27T09:23:02.236463Z",
  "started_at": "2026-10-27T09:23:02.274957Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/5a1b793e-3188-4ae9-8fbd-e5a6e4a53be9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:23:02Z",
    "sequence": 3
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5a1b793e-3188-4ae9-8fbd-e5a6e4a53be9",
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
  "last_heartbeat_at": "2026-10-27T09:23:02.31718Z",
  "last_location_at": "2026-10-27T09:23:02.31718Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/34ec2b67-8f10-48a9-8b96-aa0879f43c9a/complete` → **200**

```json
{
  "command_id": "bcd5dbf4-25eb-4dc5-be25-71ffb180753d",
  "expected_version": 2,
  "reported_at": "2026-10-27T09:23:02Z",
  "cash_received": true
}
```

```json
{
  "id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
  "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
  "assignment_id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
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
  "arrived_at": "2026-10-27T09:23:02.236463Z",
  "started_at": "2026-10-27T09:23:02.274957Z",
  "completed_at": "2026-10-27T09:23:02.364036Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/def4817b-a277-4544-a359-f310075bcc8d` → **200**

```json
{
  "id": "def4817b-a277-4544-a359-f310075bcc8d",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6f3ab20b-86fe-4a0a-af7c-1a08ad14d70f",
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
    "id": "e70b1c4c-e463-4b26-8627-11fff1778a3a",
    "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T09:23:01.897819Z",
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
    "id": "def4817b-a277-4544-a359-f310075bcc8d",
    "short_number": 3,
    "status": "FULFILLED",
    "created_at": "2026-10-27T09:23:01.897819Z",
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
    "id": "34ec2b67-8f10-48a9-8b96-aa0879f43c9a",
    "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
    "order_short_number": 3,
    "created_at": "2026-10-27T09:23:01.97263Z",
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
  "session_id": "b33aa945-532a-4e49-88a4-c190d1490199",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4ODUsImlhdCI6MTc5MzA5Mjk4NSwianRpIjoiNzhmYzM3YzctZjg3ZS00NDJmLWIwOGEtYjJlOGYzYzMzMmUzIiwic2lkIjoiYjMzYWE5NDUtNTMyYS00ZTQ5LTg4YTQtYzE5MGQxNDkwMTk5In0.jscxDAKZU1ST86rjpQj5VHXuUdSFMavm_jFWuuc4uFo",
  "access_expires_at": "2026-10-27T09:38:05.812878135Z",
  "refresh_token": "SFyBjj6q5Ly8a1umWmzbFlcNrrzOCNv7jFlMtbwvibs",
  "refresh_expires_at": "2026-10-27T21:23:05.812210013Z",
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
  "session_id": "a94158e8-eeea-4ba9-8842-940eedbd0441",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4ODYsImlhdCI6MTc5MzA5Mjk4NiwianRpIjoiMDQ3MDYyMjQtMmZkNi00MDFiLWFiNTgtZDQwZWMxNDdkYjkzIiwic2lkIjoiYTk0MTU4ZTgtZWVlYS00YmE5LTg4NDItOTQwZWVkYmQwNDQxIn0.bYjYdX1jij_FdywXOotdopGZ3jRskOmHtvGGpc-w8fk",
  "access_expires_at": "2026-10-27T09:38:06.13597022Z",
  "refresh_token": "5A3xMccd3_4XrYKurzLrt7-KiL77bXauPvbcJm8urRc",
  "refresh_expires_at": "2026-10-27T21:23:06.135271811Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/def4817b-a277-4544-a359-f310075bcc8d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T09:23:01.898612Z",
      "actor": {
        "type": "CLIENT",
        "id": "6f3ab20b-86fe-4a0a-af7c-1a08ad14d70f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
        "quote_id": "9da20c01-938a-45bf-a8ed-28f4e94d116d",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T09:23:01.901522Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
        "attempt_id": "571b81b7-9488-4610-848b-ac9553aec4f1",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T09:23:01.908482Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cc46c78b-6340-4ba8-9656-dba08fcded56",
        "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T09:23:01.975179Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cc46c78b-6340-4ba8-9656-dba08fcded56",
        "order_id": "def4817b-a277-4544-a359-f310075bcc8d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "e70b1c4c-e463-4b26-8627-11fff1778a3a"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order def4817b-a277-4544-a359-f310075bcc8d.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22022"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "6c0909b8-0a33-43a0-9789-4c92dbbe0325",
  "retryable": true,
  "retry_after_seconds": 56
}
```

**Expected 201, got 429 — scenario stopped.**

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
  "session_id": "ebcf1623-23f8-449a-ae7d-9fe5ad9b15f1",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4ODYsImlhdCI6MTc5MzA5Mjk4NiwianRpIjoiY2I1OGE5ZGItNjU0Yy00OWI1LTllMWItZjUwOGJiZjUwMmQ0Iiwic2lkIjoiZWJjZjE2MjMtMjNmOC00NDlhLWFlN2QtOWZlNWFkOWIxNWYxIn0.IS1We0gkNATsp29dtrbiJE5oYMwhRcsVvjDfP2g-RGM",
  "access_expires_at": "2026-10-27T09:38:06.551931154Z",
  "refresh_token": "2O6eP_1--f5nSk7PaiwpZk-QTDXudg43_6qrq01EZO8",
  "refresh_expires_at": "2026-10-27T21:23:06.5509361Z",
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
  "command_id": "a0d51a7b-7fff-4932-83bb-e8a7f8e7e30d",
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
  "changed_by": "6f0e641d-d2ce-40a5-adb0-071714b0950b",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T09:23:06.632197669Z"
}
```

## The rider books the airport for 2026-10-27T12:23:06Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600349321",
  "device_ref": "sandbox-6970"
}
```

```json
{
  "challenge_id": "7eb82a91-7cdc-478c-8290-185b820d62e0",
  "expires_at": "2026-10-27T09:28:06.668726194Z",
  "resend_available_at": "2026-10-27T09:24:06.668726194Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600349321` → **200**

```json
{
  "phone": "+48600349321",
  "audience": "CLIENT",
  "code": "468132",
  "sent_at": "2026-10-27T09:23:06.671583338Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7eb82a91-7cdc-478c-8290-185b820d62e0",
  "code": "468132",
  "device_ref": "sandbox-6970"
}
```

```json
{
  "session_id": "2d64d695-26ae-43df-bc4c-f8a8b4db08f7",
  "subject": {
    "type": "CLIENT",
    "id": "1169ba4f-6003-48b7-88a7-16e1bd86ae0e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTY5YmE0Zi02MDAzLTQ4YjctODhhNy0xNmUxYmQ4NmFlMGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkzODg2LCJpYXQiOjE3OTMwOTI5ODYsImp0aSI6ImE0YmQyYTliLTlkODktNDQxOS04MTIyLTllYjk1YTc0OGUyZSIsInNpZCI6IjJkNjRkNjk1LTI2YWUtNDNkZi1iYzRjLWY4YThiNGRiMDhmNyJ9.q7ju3-lbcOY8uUsSYaorG4CHDRN6Snkt1h0vv515w1c",
  "access_expires_at": "2026-10-27T09:38:06.726516121Z",
  "refresh_token": "PkSKP15Cj8s7bNkgfROjmIKyi1cjhU0BYXdAENffm2U",
  "refresh_expires_at": "2026-11-26T09:23:06.725847906Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b02d8601-4af8-4377-9b64-d6e65cf02a76",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T12:23:06Z"
}
```

```json
{
  "id": "cc93d73f-0390-4d0e-91cb-6a1b7410ace6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T09:28:06.766797Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T12:23:06Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5a9b9b66-efe3-4c61-a542-4384f4a1242b",
  "quote_id": "cc93d73f-0390-4d0e-91cb-6a1b7410ace6",
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
  "pickup_at": "2026-10-27T12:23:06Z"
}
```

```json
{
  "id": "8afc98f3-8419-4fdc-a150-152a364aab54",
  "short_number": 4,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1169ba4f-6003-48b7-88a7-16e1bd86ae0e",
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
  "created_at": "2026-10-27T09:23:06.80726Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T12:23:06Z",
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
  "device_ref": "sandbox-174"
}
```

```json
{
  "challenge_id": "34847711-d838-42e2-8b3e-6307897a4f94",
  "expires_at": "2026-10-27T09:28:06.844459554Z",
  "resend_available_at": "2026-10-27T09:24:06.844459554Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "695918",
  "sent_at": "2026-10-27T09:23:06.84754231Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "34847711-d838-42e2-8b3e-6307897a4f94",
  "code": "695918",
  "device_ref": "sandbox-174"
}
```

```json
{
  "session_id": "24fa0069-ec19-418b-9218-7b514d29e599",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5Mzg4NiwiaWF0IjoxNzkzMDkyOTg2LCJqdGkiOiJmYmE5Yzc5Yy0yYWFjLTQxOTEtYTI2NS1mNzMyNmNlODM2Y2MiLCJzaWQiOiIyNGZhMDA2OS1lYzE5LTQxOGItOTIxOC03YjUxNGQyOWU1OTkifQ.5bKfT2AOv7jf00kqz8gAYVZdXAT2VwdrSjbiNB7yX-8",
  "access_expires_at": "2026-10-27T09:38:06.904267821Z",
  "refresh_token": "5SYbnfTsM6w5_XJTnT8TiKLn-mVVlodgwwoIQIg1JsE",
  "refresh_expires_at": "2026-11-26T09:23:06.903593659Z",
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
  "command_id": "94931d9c-0102-4cda-a8b2-39fb4a009c0b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T09:23:06Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ca9b00f5-92fa-4df1-9e41-e2acbceb8c2f",
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
  "last_heartbeat_at": "2026-10-27T09:23:06.968754Z",
  "last_location_at": "2026-10-27T09:23:06.968754Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "8afc98f3-8419-4fdc-a150-152a364aab54",
      "short_number": 4,
      "pickup_at": "2026-10-27T12:23:06Z",
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

`POST /api/driver/v1/preorders/8afc98f3-8419-4fdc-a150-152a364aab54/reserve` → **200**

```json
{
  "command_id": "2ea0030e-9341-47e8-847b-8d047a996fa3"
}
```

```json
{
  "id": "65ecf3f9-5b67-4757-8057-c4a6a58fb9cb",
  "state": "RESERVED",
  "order": {
    "order_id": "8afc98f3-8419-4fdc-a150-152a364aab54",
    "short_number": 4,
    "pickup_at": "2026-10-27T12:23:06Z",
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
  "reserved_at": "2026-10-27T09:23:07.042081Z",
  "confirm_from": "2026-10-27T11:53:06Z",
  "confirm_until": "2026-10-27T12:03:06Z",
  "drop_until": "2026-10-27T11:23:06Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "65ecf3f9-5b67-4757-8057-c4a6a58fb9cb",
      "state": "RESERVED",
      "order": {
        "order_id": "8afc98f3-8419-4fdc-a150-152a364aab54",
        "short_number": 4,
        "pickup_at": "2026-10-27T12:23:06Z",
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
      "reserved_at": "2026-10-27T09:23:07.042081Z",
      "confirm_from": "2026-10-27T11:53:06Z",
      "confirm_until": "2026-10-27T12:03:06Z",
      "drop_until": "2026-10-27T11:23:06Z"
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
      "id": "65ecf3f9-5b67-4757-8057-c4a6a58fb9cb",
      "state": "RESERVED",
      "order": {
        "order_id": "8afc98f3-8419-4fdc-a150-152a364aab54",
        "short_number": 4,
        "pickup_at": "2026-10-27T12:23:06Z",
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
      "reserved_at": "2026-10-27T09:23:07.042081Z",
      "confirm_from": "2026-10-27T11:53:06Z",
      "confirm_until": "2026-10-27T12:03:06Z",
      "drop_until": "2026-10-27T11:23:06Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/65ecf3f9-5b67-4757-8057-c4a6a58fb9cb/confirm` → **409**

```json
{
  "command_id": "b304169a-f1b4-4b81-bf3a-9d522f1a06c2"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/65ecf3f9-5b67-4757-8057-c4a6a58fb9cb/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f1511910-fc5e-4007-acef-5580351e6bb8"
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
  "session_id": "c2c3a3bd-1b1e-4485-9c20-3903bb9a6b48",
  "subject": {
    "type": "STAFF",
    "id": "6f0e641d-d2ce-40a5-adb0-071714b0950b"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjBlNjQxZC1kMmNlLTQwYTUtYWRiMC0wNzE3MTRiMDk1MGIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTM4ODcsImlhdCI6MTc5MzA5Mjk4NywianRpIjoiNDI0MmVmMGMtMTY2Ni00ODgxLWE5NzYtMTJlYjU2ZTZhMjdjIiwic2lkIjoiYzJjM2EzYmQtMWIxZS00NDg1LTljMjAtMzkwM2JiOWE2YjQ4In0.8XIUHdXwybYgITxou-hzZrsZRs5sSwvuip2KzLGK7oo",
  "access_expires_at": "2026-10-27T09:38:07.463412183Z",
  "refresh_token": "yYW5qM-doltnVR78ONSxv9BS8yz0EDiYAz7-j9A09Gs",
  "refresh_expires_at": "2026-10-27T21:23:07.462636429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8afc98f3-8419-4fdc-a150-152a364aab54` → **200**

```json
{
  "id": "8afc98f3-8419-4fdc-a150-152a364aab54",
  "short_number": 4,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1169ba4f-6003-48b7-88a7-16e1bd86ae0e",
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
  "created_at": "2026-10-27T09:23:06.80726Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T12:23:06Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "65ecf3f9-5b67-4757-8057-c4a6a58fb9cb",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T09:23:07.042081Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8afc98f3-8419-4fdc-a150-152a364aab54/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T09:23:06.80942Z",
      "actor": {
        "type": "CLIENT",
        "id": "1169ba4f-6003-48b7-88a7-16e1bd86ae0e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "8afc98f3-8419-4fdc-a150-152a364aab54",
        "preorder": true,
        "quote_id": "cc93d73f-0390-4d0e-91cb-6a1b7410ace6",
        "pickup_at": "2026-10-27T12:23:06Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T09:23:07.043623Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8afc98f3-8419-4fdc-a150-152a364aab54",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "65ecf3f9-5b67-4757-8057-c4a6a58fb9cb"
      }
    }
  ]
}
```

Done: pre-order 8afc98f3-8419-4fdc-a150-152a364aab54, reservation 65ecf3f9-5b67-4757-8057-c4a6a58fb9cb.
