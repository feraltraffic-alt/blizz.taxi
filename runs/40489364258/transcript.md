# Sandbox transcript (2026-10-27T10:34:00Z, cbf1775)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633499955",
  "device_ref": "sandbox-2717"
}
```

```json
{
  "challenge_id": "e216944e-8d2e-4465-9602-a18d1cf28a75",
  "expires_at": "2026-10-27T10:39:00.818929945Z",
  "resend_available_at": "2026-10-27T10:34:01.818929945Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633499955` → **200**

```json
{
  "phone": "+380633499955",
  "audience": "CLIENT",
  "code": "674952",
  "sent_at": "2026-10-27T10:34:00.827249068Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e216944e-8d2e-4465-9602-a18d1cf28a75",
  "code": "674952",
  "device_ref": "sandbox-2717"
}
```

```json
{
  "session_id": "b23e091f-f46d-44d8-a5a2-82c4fe2654df",
  "subject": {
    "type": "CLIENT",
    "id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZmY0OGU5NC1jYTAxLTRhNWItOTQ0YS1mMmFiYTIzMzRlYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk4MTQwLCJpYXQiOjE3OTMwOTcyNDAsImp0aSI6ImZiNzNlZjNjLWI5YWQtNDUzZi04MWM3LTZhYmQzMGE3NjkxMiIsInNpZCI6ImIyM2UwOTFmLWY0NmQtNDRkOC1hNWEyLTgyYzRmZTI2NTRkZiJ9.s3qsH_uzDA70-TMhfqBAx-i61e6yGPTams0A3ZNKa0s",
  "access_expires_at": "2026-10-27T10:49:00.935776505Z",
  "refresh_token": "3RgOgGpQHBVII7cgmbGVE5Kr8TijzQjm-FLjm0_kkWs",
  "refresh_expires_at": "2026-11-26T10:34:00.932641701Z",
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
  "device_ref": "sandbox-14838"
}
```

```json
{
  "challenge_id": "27859bff-ed50-4e80-82bd-57bb5a34fabc",
  "expires_at": "2026-10-27T10:39:01.053143618Z",
  "resend_available_at": "2026-10-27T10:34:02.053143618Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "283428",
  "sent_at": "2026-10-27T10:34:01.056656271Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27859bff-ed50-4e80-82bd-57bb5a34fabc",
  "code": "283428",
  "device_ref": "sandbox-14838"
}
```

```json
{
  "session_id": "1caf3ed5-0fd6-4367-bbbd-fb91940eaa7c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE0MSwiaWF0IjoxNzkzMDk3MjQxLCJqdGkiOiIwNTM0OTVhNC0wMjljLTRkNjAtOWIzNi1iMzRhZDUwZWU2MTgiLCJzaWQiOiIxY2FmM2VkNS0wZmQ2LTQzNjctYmJiZC1mYjkxOTQwZWFhN2MifQ.Rc7lxk57U3rOY9SlV6UNgjdHfe9_pDbjTHL_CO71d0I",
  "access_expires_at": "2026-10-27T10:49:01.113897333Z",
  "refresh_token": "vNtPAZsCKpah5GBHEqC8X_X65hUVVzu6q5IK0eIMXiQ",
  "refresh_expires_at": "2026-11-26T10:34:01.113081867Z",
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
  "correlation_id": "a4c1749a-8e97-46d2-8d63-4459daaa583d"
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
  "session_id": "82e2a1c1-e4b3-4862-ac9d-c735f7904ab3",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNDEsImlhdCI6MTc5MzA5NzI0MSwianRpIjoiMWQ4NGQzOGEtYTQyMC00YTAyLWFhYzQtNGU4YWQxYTJhNDA5Iiwic2lkIjoiODJlMmExYzEtZTRiMy00ODYyLWFjOWQtYzczNWY3OTA0YWIzIn0.9mzk5hMuYWsNOwn-axJ5CoJhP-OgxASWPj4NTMGFNa0",
  "access_expires_at": "2026-10-27T10:49:01.735054116Z",
  "refresh_token": "xvDxfkl6OuTSkOtaAO6hzzdt4JaorTnhwqiGzQjCclk",
  "refresh_expires_at": "2026-10-27T22:34:01.734188034Z",
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
  "session_id": "728092bf-2819-4189-8790-43d7d68c54d6",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNDIsImlhdCI6MTc5MzA5NzI0MiwianRpIjoiODQxNmJjZDItYTdkNC00ZWU2LTg0MTEtOTUwMjI0MWM0ODZkIiwic2lkIjoiNzI4MDkyYmYtMjgxOS00MTg5LTg3OTAtNDNkN2Q2OGM1NGQ2In0.PFGXUM8jV7FmXH36rLNWMT7ptjzpyvRtHktFGyl3MSg",
  "access_expires_at": "2026-10-27T10:49:02.839062119Z",
  "refresh_token": "U3Ajc2EjqCcz8wBxt85ogoFZ1TsrDT3XiXEAzk9v34Q",
  "refresh_expires_at": "2026-10-27T22:34:02.838125901Z",
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
  "session_id": "3ecd2c2a-d91b-47e0-b544-91925589b11a",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNDMsImlhdCI6MTc5MzA5NzI0MywianRpIjoiMThmNTRmYmQtMTllYi00MzM1LTkyYjQtM2VjZjU3NjBiOWY4Iiwic2lkIjoiM2VjZDJjMmEtZDkxYi00N2UwLWI1NDQtOTE5MjU1ODliMTFhIn0.VabdXGoG6TWAEIaEhjdsgSyHyUdwT51OirGb2HRjAwU",
  "access_expires_at": "2026-10-27T10:49:03.126553642Z",
  "refresh_token": "uBeSXggmiavtWUhMHbdpvmEUHF7aLc9ip752LFcIFGI",
  "refresh_expires_at": "2026-10-27T22:34:03.125687049Z",
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
  "command_id": "58caa7a6-9405-42f8-8204-544ae5fac033",
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
  "id": "fee9bc12-35b7-493f-a9f8-1e0befa6de97",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T10:39:03.276676Z",
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
  "command_id": "a6f894b2-a29b-4008-9afa-cd37c70c88a4",
  "quote_id": "fee9bc12-35b7-493f-a9f8-1e0befa6de97",
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
  "id": "0faa5997-3386-4e6e-93d7-a50ed720967d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9",
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
  "created_at": "2026-10-27T10:34:03.380214Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/0faa5997-3386-4e6e-93d7-a50ed720967d` → **200**

```json
{
  "id": "0faa5997-3386-4e6e-93d7-a50ed720967d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9",
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
  "created_at": "2026-10-27T10:34:03.380214Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`POST /api/rider/v1/orders/0faa5997-3386-4e6e-93d7-a50ed720967d/cancel` → **200**

```json
{
  "command_id": "07b5e2f8-5299-45fc-af2c-404fdf55a14d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "0faa5997-3386-4e6e-93d7-a50ed720967d",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9",
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
  "created_at": "2026-10-27T10:34:03.380214Z",
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
  "command_id": "76433fc2-3aaf-47c8-82cf-521a5d2ea26d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:03Z",
    "sequence": 1793097243542
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4816ba0c-a01a-4c5b-9b83-da001475fc55",
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
  "last_heartbeat_at": "2026-10-27T10:34:03.580529Z",
  "last_location_at": "2026-10-27T10:34:03.580529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31081"
}
```

```json
{
  "challenge_id": "f1a739bf-f52c-45da-86ca-abb27fcfe1cb",
  "expires_at": "2026-10-27T10:39:03.616679142Z",
  "resend_available_at": "2026-10-27T10:34:04.616679142Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "707301",
  "sent_at": "2026-10-27T10:34:03.620417494Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1a739bf-f52c-45da-86ca-abb27fcfe1cb",
  "code": "707301",
  "device_ref": "sandbox-31081"
}
```

```json
{
  "session_id": "e4e17cf2-eb37-497a-8992-9c287a47654e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE0MywiaWF0IjoxNzkzMDk3MjQzLCJqdGkiOiJjNTQ4N2FlZS1kNmQ3LTRmZmItYWVlZC1hMTRkMjY5Njk1OTciLCJzaWQiOiJlNGUxN2NmMi1lYjM3LTQ5N2EtODk5Mi05YzI4N2E0NzY1NGUifQ.KQmFsUuVOnxaHw5t4AB9pnNgZ9sIcGDIRLPVPKHlAyQ",
  "access_expires_at": "2026-10-27T10:49:03.678901536Z",
  "refresh_token": "0iwHBX_dBl45ztfmQ5DLbe4zdDv-jtM6TYt3cDVeabY",
  "refresh_expires_at": "2026-11-26T10:34:03.678076034Z",
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
  "command_id": "5405012f-c377-4858-8de0-8ee5414c1f1a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:03Z",
    "sequence": 1793097243730
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4df5ab8e-26dd-490f-a376-912791a255e2",
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
  "last_heartbeat_at": "2026-10-27T10:34:03.746671Z",
  "last_location_at": "2026-10-27T10:34:03.746671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7c8fd5e5-823d-4d48-b515-8a3ec54ae1ad",
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
  "id": "6b84e395-de6a-4f92-8c99-e9a1a10c67c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T10:39:03.786892Z",
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
  "command_id": "fe8a7b03-039b-4b3d-a52d-cf07edec790c",
  "quote_id": "6b84e395-de6a-4f92-8c99-e9a1a10c67c2",
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
  "id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9",
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
  "created_at": "2026-10-27T10:34:03.825373Z",
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
    "id": "da57d4a3-1223-4f42-b3d0-8ba672bc8f2c",
    "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
    "expires_at": "2026-10-27T10:34:18.830155Z",
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

`POST /api/driver/v1/offers/da57d4a3-1223-4f42-b3d0-8ba672bc8f2c/accept` → **200**

```json
{
  "command_id": "90c6c16d-c637-41bf-8103-6aa455a224ce"
}
```

```json
{
  "id": "2fcc58a9-6ba5-40cc-af25-e8006217128c",
  "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bce01f08-1877-437e-9d19-378802bd59ba",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bce01f08-1877-437e-9d19-378802bd59ba",
  "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "assignment_id": "2fcc58a9-6ba5-40cc-af25-e8006217128c",
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

`POST /api/driver/v1/trips/bce01f08-1877-437e-9d19-378802bd59ba/cancel` → **200**

```json
{
  "command_id": "f9707a25-102d-4565-bf65-a15f96aae4df",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "bce01f08-1877-437e-9d19-378802bd59ba",
  "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "assignment_id": "2fcc58a9-6ba5-40cc-af25-e8006217128c",
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

`GET /api/rider/v1/orders/1ebe8e53-eea7-4cc8-bc98-3eab51d555ed` → **200**

```json
{
  "id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9",
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
    "id": "2fcc58a9-6ba5-40cc-af25-e8006217128c",
    "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "bce01f08-1877-437e-9d19-378802bd59ba",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T10:34:03.825373Z",
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
    "id": "ea70264a-9e05-4969-835e-2fa6bfc61037",
    "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
    "expires_at": "2026-10-27T10:34:18.994498Z",
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

`POST /api/driver/v1/offers/ea70264a-9e05-4969-835e-2fa6bfc61037/accept` → **200**

```json
{
  "command_id": "6b859ac9-7871-4140-b9e8-8080d3ec6a50"
}
```

```json
{
  "id": "05a7719d-5c95-4064-9c1e-e0d7d514eecb",
  "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f2b3f94e-7bc9-48ec-95bf-352dbd7c7c71",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f2b3f94e-7bc9-48ec-95bf-352dbd7c7c71",
  "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "assignment_id": "05a7719d-5c95-4064-9c1e-e0d7d514eecb",
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

`POST /api/driver/v1/trips/f2b3f94e-7bc9-48ec-95bf-352dbd7c7c71/cancel` → **200**

```json
{
  "command_id": "b057241c-31ba-465f-a199-df40afc89b49",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f2b3f94e-7bc9-48ec-95bf-352dbd7c7c71",
  "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
  "assignment_id": "05a7719d-5c95-4064-9c1e-e0d7d514eecb",
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
    "id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T10:34:03.825373Z",
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
    "id": "0faa5997-3386-4e6e-93d7-a50ed720967d",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T10:34:03.380214Z",
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

`GET /api/operator/v1/orders/1ebe8e53-eea7-4cc8-bc98-3eab51d555ed/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T10:34:03.826238Z",
      "actor": {
        "type": "CLIENT",
        "id": "6ff48e94-ca01-4a5b-944a-f2aba2334eb9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
        "quote_id": "6b84e395-de6a-4f92-8c99-e9a1a10c67c2",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T10:34:03.828746Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
        "attempt_id": "1a2b9cb4-0906-49d6-9d7a-489e6669e12c",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T10:34:03.835921Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "da57d4a3-1223-4f42-b3d0-8ba672bc8f2c",
        "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T10:34:03.911402Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "da57d4a3-1223-4f42-b3d0-8ba672bc8f2c",
        "order_id": "1ebe8e53-eea7-4cc8-bc98-3eab51d555ed",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "2fcc58a9-6ba5-40cc-af25-e8006217128c"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 0faa5997-3386-4e6e-93d7-a50ed720967d, 1ebe8e53-eea7-4cc8-bc98-3eab51d555ed.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731506553",
  "device_ref": "sandbox-11286"
}
```

```json
{
  "challenge_id": "62bd6d74-e7d1-4204-a7b0-d7f8395b0d26",
  "expires_at": "2026-10-27T10:39:04.251675039Z",
  "resend_available_at": "2026-10-27T10:34:05.251675039Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731506553` → **200**

```json
{
  "phone": "+380731506553",
  "audience": "CLIENT",
  "code": "882236",
  "sent_at": "2026-10-27T10:34:04.254983806Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62bd6d74-e7d1-4204-a7b0-d7f8395b0d26",
  "code": "882236",
  "device_ref": "sandbox-11286"
}
```

```json
{
  "session_id": "d994390d-925d-45fd-b1f2-1327ecc116e0",
  "subject": {
    "type": "CLIENT",
    "id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTg4MDAzMC1iMmE5LTQ3ZjItOTJmYS02Nzk1YTRiNGY4OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk4MTQ0LCJpYXQiOjE3OTMwOTcyNDQsImp0aSI6IjgzYzhiODNjLTE5YTgtNDM5Mi04N2QxLTc1ZWM0NGJlNWU1ZCIsInNpZCI6ImQ5OTQzOTBkLTkyNWQtNDVmZC1iMWYyLTEzMjdlY2MxMTZlMCJ9.Lt88KkqPo7Clx8sFn45FgL3zYAZt_CQr0E-bF4CqoC0",
  "access_expires_at": "2026-10-27T10:49:04.3091679Z",
  "refresh_token": "LxX2Ukfdh_OEo6YIS9KJMhiDmrpoGwDpgvZWTKNXcBs",
  "refresh_expires_at": "2026-11-26T10:34:04.308331953Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "abcfe288-9ef8-426b-9df6-e97e88aaf987",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "ab2f9e9d-db59-410f-a128-7573db6f1ae1",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-ab2f9e9d-db59-410f-a128-7573db6f1ae1",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "ae50fee8d25864fe5b77cd73805ed846",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=ab2f9e9d-db59-410f-a128-7573db6f1ae1",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731506553"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=ab2f9e9d-db59-410f-a128-7573db6f1ae1",
  "expires_at": "2026-10-27T11:04:04.344848Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/ab2f9e9d-db59-410f-a128-7573db6f1ae1` → **200**

```json
{
  "id": "ab2f9e9d-db59-410f-a128-7573db6f1ae1",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T11:04:04.344848Z",
  "card": {
    "id": "862de1c2-ad07-494b-8a9a-4b36adec7b0c",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3112",
    "card_type": "Visa",
    "created_at": "2026-10-27T10:34:04.38882Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "862de1c2-ad07-494b-8a9a-4b36adec7b0c",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3112",
      "card_type": "Visa",
      "created_at": "2026-10-27T10:34:04.38882Z"
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
  "device_ref": "sandbox-5619"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "3b55e859-68d2-414e-bc0e-e53feb8f64cd",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-5619"
}
```

```json
{
  "challenge_id": "9c087977-7c54-4760-95a8-6830daf743e2",
  "expires_at": "2026-10-27T10:39:05.502395264Z",
  "resend_available_at": "2026-10-27T10:34:06.502395264Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "004776",
  "sent_at": "2026-10-27T10:34:05.505283689Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c087977-7c54-4760-95a8-6830daf743e2",
  "code": "004776",
  "device_ref": "sandbox-5619"
}
```

```json
{
  "session_id": "34dc089f-cf9c-4dbb-9038-eb9e3b17c5fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE0NSwiaWF0IjoxNzkzMDk3MjQ1LCJqdGkiOiJiYjE4YjM0Yy00YjZkLTQ3NDQtYjY1Mi1mOTQxZjEwNzc1N2MiLCJzaWQiOiIzNGRjMDg5Zi1jZjljLTRkYmItOTAzOC1lYjllM2IxN2M1ZmMifQ._1jPB9CdrZ5yZz7mMfxT3wXvz0S2BM0xvPHkwF0AEeU",
  "access_expires_at": "2026-10-27T10:49:05.557518083Z",
  "refresh_token": "0OsV5gg4xgDEGx1w8ZLs8bEsFVYr3sDQf80U4Gha6qI",
  "refresh_expires_at": "2026-11-26T10:34:05.556753643Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4df5ab8e-26dd-490f-a376-912791a255e2",
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
  "last_heartbeat_at": "2026-10-27T10:34:03.746671Z",
  "last_location_at": "2026-10-27T10:34:03.746671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4df5ab8e-26dd-490f-a376-912791a255e2/handover` → **200**

```json
{
  "command_id": "c1e84f4c-eb7f-4920-bbd9-765bd7cdb144",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4df5ab8e-26dd-490f-a376-912791a255e2",
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
  "last_heartbeat_at": "2026-10-27T10:34:03.746671Z",
  "last_location_at": "2026-10-27T10:34:03.746671Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4df5ab8e-26dd-490f-a376-912791a255e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:05Z",
    "sequence": 1793097245646
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4df5ab8e-26dd-490f-a376-912791a255e2",
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
  "last_heartbeat_at": "2026-10-27T10:34:05.664909Z",
  "last_location_at": "2026-10-27T10:34:05.664909Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "23ba3f85-4827-4ada-935b-32482d7a1d05",
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
  "id": "34f7f76a-3c24-49e1-a612-0814e7086fc4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T10:39:05.700760Z",
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
  "command_id": "5e225213-1788-42a4-863c-a8251fcac8b0",
  "quote_id": "34f7f76a-3c24-49e1-a612-0814e7086fc4",
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
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
  "created_at": "2026-10-27T10:34:05.736851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/4f89130b-5fdf-4797-970a-feef5ca085c3` → **200**

```json
{
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
  "created_at": "2026-10-27T10:34:05.736851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/4f89130b-5fdf-4797-970a-feef5ca085c3` → **200**

```json
{
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
  "created_at": "2026-10-27T10:34:05.736851Z",
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
    "id": "88fb3a52-f6e8-4e1f-a520-3da8d923e0fa",
    "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
    "expires_at": "2026-10-27T10:34:20.9656Z",
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

`POST /api/driver/v1/offers/88fb3a52-f6e8-4e1f-a520-3da8d923e0fa/accept` → **200**

```json
{
  "command_id": "1193cf01-997a-4ee5-a88a-27e5d809785e"
}
```

```json
{
  "id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
  "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
  "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "assignment_id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
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

`POST /api/driver/v1/work-sessions/4df5ab8e-26dd-490f-a376-912791a255e2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:06Z",
    "sequence": 1793097246914
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "4df5ab8e-26dd-490f-a376-912791a255e2",
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
  "last_heartbeat_at": "2026-10-27T10:34:06.930346Z",
  "last_location_at": "2026-10-27T10:34:06.930346Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c60f274e-410d-419d-ab3e-9a18c90c9357/arrive` → **200**

```json
{
  "command_id": "ec67c70e-7c8f-4cbb-b1c6-87a88e8e8b6a",
  "expected_version": 0
}
```

```json
{
  "id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
  "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "assignment_id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
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
  "arrived_at": "2026-10-27T10:34:06.971811Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/c60f274e-410d-419d-ab3e-9a18c90c9357/start` → **200**

```json
{
  "command_id": "7fddf995-1746-48aa-a791-db1c35924403",
  "expected_version": 1
}
```

```json
{
  "id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
  "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "assignment_id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
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
  "arrived_at": "2026-10-27T10:34:06.971811Z",
  "started_at": "2026-10-27T10:34:07.016544Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/c60f274e-410d-419d-ab3e-9a18c90c9357/complete` → **200**

```json
{
  "command_id": "c9df39c5-79ac-439b-bcef-ccf1ca8c5dfc",
  "expected_version": 2,
  "reported_at": "2026-10-27T10:34:07Z"
}
```

```json
{
  "id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
  "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "assignment_id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
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
  "arrived_at": "2026-10-27T10:34:06.971811Z",
  "started_at": "2026-10-27T10:34:07.016544Z",
  "completed_at": "2026-10-27T10:34:07.067957Z",
  "needs_review": false
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/4f89130b-5fdf-4797-970a-feef5ca085c3` → **200**

```json
{
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
    "id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
    "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T10:34:05.736851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/4f89130b-5fdf-4797-970a-feef5ca085c3` → **200**

```json
{
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
    "id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
    "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T10:34:05.736851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/4f89130b-5fdf-4797-970a-feef5ca085c3` → **200**

```json
{
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
    "id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
    "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T10:34:05.736851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null
}
```

`GET /api/rider/v1/orders/4f89130b-5fdf-4797-970a-feef5ca085c3` → **200**

```json
{
  "id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5e880030-b2a9-47f2-92fa-6795a4b4f89d",
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
    "id": "60efb270-0f08-4623-84c0-dc3ed67a763a",
    "order_id": "4f89130b-5fdf-4797-970a-feef5ca085c3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c60f274e-410d-419d-ab3e-9a18c90c9357",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T10:34:05.736851Z",
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

Done: card order 4f89130b-5fdf-4797-970a-feef5ca085c3.

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
  "device_ref": "sandbox-9248"
}
```

```json
{
  "challenge_id": "163e5702-f3b5-4848-b3e4-f489af756ab0",
  "expires_at": "2026-10-27T10:39:10.27812112Z",
  "resend_available_at": "2026-10-27T10:34:11.27812112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "597655",
  "sent_at": "2026-10-27T10:34:10.280801412Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "163e5702-f3b5-4848-b3e4-f489af756ab0",
  "code": "597655",
  "device_ref": "sandbox-9248"
}
```

```json
{
  "session_id": "02bffeb5-d55d-4c40-bad6-281e4eecf124",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE1MCwiaWF0IjoxNzkzMDk3MjUwLCJqdGkiOiI0NDIyMTJjNS0wYmFiLTRhYWQtYjEyNC1iNDFjZjlkNjU0YTYiLCJzaWQiOiIwMmJmZmViNS1kNTVkLTRjNDAtYmFkNi0yODFlNGVlY2YxMjQifQ.jIYmiCmZc6bC0q8_TvyKj5DqxJ923_q6N32hiULgHW4",
  "access_expires_at": "2026-10-27T10:49:10.334630624Z",
  "refresh_token": "_qVFQnPke4UwJ-xgdi27pB1vagWJo-5fbrlFfNOHaKU",
  "refresh_expires_at": "2026-11-26T10:34:10.334091093Z",
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
  "command_id": "ee77a313-72dd-434c-8dff-3bb96d4363e5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:10Z",
    "sequence": 1793097250382
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:10.39659Z",
  "last_location_at": "2026-10-27T10:34:10.39659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678572022",
  "device_ref": "sandbox-1981"
}
```

```json
{
  "challenge_id": "d45fe8ba-e8d1-47f6-aa3a-ad4fea7c04ca",
  "expires_at": "2026-10-27T10:39:10.429248095Z",
  "resend_available_at": "2026-10-27T10:34:11.429248095Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678572022` → **200**

```json
{
  "phone": "+380678572022",
  "audience": "CLIENT",
  "code": "083405",
  "sent_at": "2026-10-27T10:34:10.431994396Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d45fe8ba-e8d1-47f6-aa3a-ad4fea7c04ca",
  "code": "083405",
  "device_ref": "sandbox-1981"
}
```

```json
{
  "session_id": "6a2a1eee-dcd3-4c6c-a3d0-a6d4f473fa7b",
  "subject": {
    "type": "CLIENT",
    "id": "b1498205-0d78-4cd5-9a91-308d64be7105"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMTQ5ODIwNS0wZDc4LTRjZDUtOWE5MS0zMDhkNjRiZTcxMDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk4MTUwLCJpYXQiOjE3OTMwOTcyNTAsImp0aSI6Ijg0Y2U4YmQwLTQxYmEtNGNmNC1iZjBhLWY2YjAxZWY1NDc0ZCIsInNpZCI6IjZhMmExZWVlLWRjZDMtNGM2Yy1hM2QwLWE2ZDRmNDczZmE3YiJ9.OiaDEDdEihJpBVDKMl2Q_aBCP20fLMG2K2wuKBACLZg",
  "access_expires_at": "2026-10-27T10:49:10.488625512Z",
  "refresh_token": "zr9DVa27gHl2pA68lTascoog-rews694kCBwew4d7GQ",
  "refresh_expires_at": "2026-11-26T10:34:10.487944068Z",
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
  "command_id": "82181cb7-ed63-4cc3-be5a-8ff56452d3b0",
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
  "id": "a8951021-fba7-4f52-834f-e393f5627273",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T10:39:10.554089Z",
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
  "command_id": "a78f71bc-4541-47ad-83a9-e49df5d05899",
  "quote_id": "a8951021-fba7-4f52-834f-e393f5627273",
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
  "id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b1498205-0d78-4cd5-9a91-308d64be7105",
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
  "created_at": "2026-10-27T10:34:10.591424Z",
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
    "id": "224fb6dc-77a5-47a4-87e5-6ee50d4fe0fc",
    "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
    "expires_at": "2026-10-27T10:34:25.594766Z",
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

`POST /api/driver/v1/offers/224fb6dc-77a5-47a4-87e5-6ee50d4fe0fc/accept` → **200**

```json
{
  "command_id": "e8291243-c061-4e6f-8b86-f3c5d1cdf227"
}
```

```json
{
  "id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/d303f8f3-5edc-4653-b467-7e81542da693/messages` → **201**

```json
{
  "command_id": "3cedf620-7f0d-4866-a82a-843778cbdae2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "d9ba6c9a-c9ba-47b0-856e-bfbc3b926ae3",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T10:34:10.69787047Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "assignment_id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
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

`POST /api/driver/v1/trips/8d4f68ab-df99-47b2-a35e-e80b14903eb6/messages` → **201**

```json
{
  "command_id": "1feaf24c-a387-4f92-ad03-ed4b99fd571e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "eed9eca3-0f82-4a55-a37d-c0387d284003",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T10:34:10.751484759Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/d303f8f3-5edc-4653-b467-7e81542da693/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/8d4f68ab-df99-47b2-a35e-e80b14903eb6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678572022"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/23e1e1ae-96d7-4fd7-a241-486f22b63b06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:10Z",
    "sequence": 1793097250823
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:10.839648Z",
  "last_location_at": "2026-10-27T10:34:10.839648Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "assignment_id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
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

`POST /api/driver/v1/trips/8d4f68ab-df99-47b2-a35e-e80b14903eb6/arrive` → **200**

```json
{
  "command_id": "5f2b2389-2775-4f30-8ac7-ed23ea8136d9",
  "expected_version": 0
}
```

```json
{
  "id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "assignment_id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
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
  "arrived_at": "2026-10-27T10:34:10.890326Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/8d4f68ab-df99-47b2-a35e-e80b14903eb6/start` → **200**

```json
{
  "command_id": "da18e2f6-64fd-452a-8bfa-0a86da456a41",
  "expected_version": 1
}
```

```json
{
  "id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "assignment_id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
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
  "arrived_at": "2026-10-27T10:34:10.890326Z",
  "started_at": "2026-10-27T10:34:10.923573Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/23e1e1ae-96d7-4fd7-a241-486f22b63b06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:10Z",
    "sequence": 1793097250947
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:10.96233Z",
  "last_location_at": "2026-10-27T10:34:10.96233Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/8d4f68ab-df99-47b2-a35e-e80b14903eb6/complete` → **200**

```json
{
  "command_id": "f6ee07e6-d901-48e0-8265-434af6c51fa6",
  "expected_version": 2,
  "reported_at": "2026-10-27T10:34:10Z",
  "cash_received": true
}
```

```json
{
  "id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
  "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "assignment_id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
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
  "arrived_at": "2026-10-27T10:34:10.890326Z",
  "started_at": "2026-10-27T10:34:10.923573Z",
  "completed_at": "2026-10-27T10:34:10.99701Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/d303f8f3-5edc-4653-b467-7e81542da693` → **200**

```json
{
  "id": "d303f8f3-5edc-4653-b467-7e81542da693",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b1498205-0d78-4cd5-9a91-308d64be7105",
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
    "id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45",
    "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T10:34:10.591424Z",
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
    "id": "d303f8f3-5edc-4653-b467-7e81542da693",
    "short_number": 4,
    "status": "FULFILLED",
    "created_at": "2026-10-27T10:34:10.591424Z",
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
    "id": "8d4f68ab-df99-47b2-a35e-e80b14903eb6",
    "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
    "order_short_number": 4,
    "created_at": "2026-10-27T10:34:10.656568Z",
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
  "session_id": "eab666bb-011d-4b1e-968c-fbbd35ed00c4",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNTQsImlhdCI6MTc5MzA5NzI1NCwianRpIjoiYzU4NDYyOTQtNmY3MC00NmU2LWIwZDgtNWQ1MjcyMGI2ZWZiIiwic2lkIjoiZWFiNjY2YmItMDExZC00YjFlLTk2OGMtZmJiZDM1ZWQwMGM0In0.U90lPQu0B7k3igc9D0hbxL89zBz83WF_BfrdS93qGcU",
  "access_expires_at": "2026-10-27T10:49:14.39552071Z",
  "refresh_token": "P25MqfzXLaEivqOy2X64TFNYXhzwk2QnIY0e6EAQxZk",
  "refresh_expires_at": "2026-10-27T22:34:14.395049531Z",
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
  "session_id": "10ee201b-8897-4375-95e8-e281783358cb",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNTQsImlhdCI6MTc5MzA5NzI1NCwianRpIjoiNWVhMGRhZWUtMjRhYi00ZTBiLWI1M2YtYTg3YzdhNjcwMTAzIiwic2lkIjoiMTBlZTIwMWItODg5Ny00Mzc1LTk1ZTgtZTI4MTc4MzM1OGNiIn0.Tme7dpi_aeU-3zJGNPkXqHR6mlYs8Ac5uDcdkQ67FVc",
  "access_expires_at": "2026-10-27T10:49:14.680346828Z",
  "refresh_token": "QsxY0lXdFE8000mYSyfenpFKCJdsN3BaecV3U7vnnKo",
  "refresh_expires_at": "2026-10-27T22:34:14.679773806Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d303f8f3-5edc-4653-b467-7e81542da693/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T10:34:10.592022Z",
      "actor": {
        "type": "CLIENT",
        "id": "b1498205-0d78-4cd5-9a91-308d64be7105",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
        "quote_id": "a8951021-fba7-4f52-834f-e393f5627273",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T10:34:10.59379Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
        "attempt_id": "a575f40d-5adc-4ebe-a4dc-63cb917ff520",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T10:34:10.599118Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "224fb6dc-77a5-47a4-87e5-6ee50d4fe0fc",
        "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T10:34:10.658609Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "224fb6dc-77a5-47a4-87e5-6ee50d4fe0fc",
        "order_id": "d303f8f3-5edc-4653-b467-7e81542da693",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0a9cca9f-c01c-4fa3-8813-6b3cfe26fa45"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order d303f8f3-5edc-4653-b467-7e81542da693.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-3053"
}
```

```json
{
  "challenge_id": "4f4df982-4256-4e96-81b1-f512dadd8bc7",
  "expires_at": "2026-10-27T10:39:14.74219509Z",
  "resend_available_at": "2026-10-27T10:34:15.74219509Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "779875",
  "sent_at": "2026-10-27T10:34:14.744574398Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f4df982-4256-4e96-81b1-f512dadd8bc7",
  "code": "779875",
  "device_ref": "sandbox-3053"
}
```

```json
{
  "session_id": "0da9fdb8-77f5-4703-a6a8-2cdbc9436928",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE1NCwiaWF0IjoxNzkzMDk3MjU0LCJqdGkiOiI5YTRjZjhjZS1kMDYwLTRiMDYtODY2OC01MGY0ZGMyMzdhMzkiLCJzaWQiOiIwZGE5ZmRiOC03N2Y1LTQ3MDMtYTZhOC0yY2RiYzk0MzY5MjgifQ.RdtDBYm3E_HqQ5Jav_Avv-OPevzapQbliZGY2aDJBl0",
  "access_expires_at": "2026-10-27T10:49:14.796858966Z",
  "refresh_token": "MWbfadmw7c_etGhYaRrLgVE_tnEO7eEfKvhN-ws_sn4",
  "refresh_expires_at": "2026-11-26T10:34:14.796298223Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:10.96233Z",
  "last_location_at": "2026-10-27T10:34:10.96233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23e1e1ae-96d7-4fd7-a241-486f22b63b06/handover` → **200**

```json
{
  "command_id": "557a978c-8c84-4788-bdc4-3afa79161106",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:10.96233Z",
  "last_location_at": "2026-10-27T10:34:10.96233Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23e1e1ae-96d7-4fd7-a241-486f22b63b06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:14Z",
    "sequence": 1793097254876
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:14.892195Z",
  "last_location_at": "2026-10-27T10:34:14.892195Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667012647",
  "device_ref": "sandbox-9448"
}
```

```json
{
  "challenge_id": "5b508911-25e7-4c17-8ec1-df53754c7e50",
  "expires_at": "2026-10-27T10:39:14.915733407Z",
  "resend_available_at": "2026-10-27T10:34:15.915733407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380667012647` → **200**

```json
{
  "phone": "+380667012647",
  "audience": "CLIENT",
  "code": "350559",
  "sent_at": "2026-10-27T10:34:14.919555836Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b508911-25e7-4c17-8ec1-df53754c7e50",
  "code": "350559",
  "device_ref": "sandbox-9448"
}
```

```json
{
  "session_id": "ddfc80e2-8dc1-45e0-9638-a099de669ea2",
  "subject": {
    "type": "CLIENT",
    "id": "2ca0a821-a945-4570-83fe-44078a4811cb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyY2EwYTgyMS1hOTQ1LTQ1NzAtODNmZS00NDA3OGE0ODExY2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk4MTU0LCJpYXQiOjE3OTMwOTcyNTQsImp0aSI6IjBhZTMwYzMwLWNlN2YtNGM4YS1hNWQwLWEwZTA4Yjk2OWJjOSIsInNpZCI6ImRkZmM4MGUyLThkYzEtNDVlMC05NjM4LWEwOTlkZTY2OWVhMiJ9.Qhk9oTPivKgwUpXsum4GnlOlu__27mvvo22eTTeQ3Z8",
  "access_expires_at": "2026-10-27T10:49:14.972581508Z",
  "refresh_token": "hx4_3vAHUhnvsS0tLXJSgf8dpniqTOrY_jpqFhPsOH0",
  "refresh_expires_at": "2026-11-26T10:34:14.972145052Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2199fc49-4f94-44b2-ae15-3eecd481685a",
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
  "id": "41d20b90-81ba-490f-affb-21c03b3dafc2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T10:39:15.007328Z",
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
  "command_id": "78363dae-8c7a-496c-bae8-f00a18908c39",
  "quote_id": "41d20b90-81ba-490f-affb-21c03b3dafc2",
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
  "id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ca0a821-a945-4570-83fe-44078a4811cb",
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
  "created_at": "2026-10-27T10:34:15.042843Z",
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
    "id": "daee14b5-90fa-4132-9b0c-9ec055f3808d",
    "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
    "expires_at": "2026-10-27T10:34:30.045949Z",
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

`POST /api/driver/v1/offers/daee14b5-90fa-4132-9b0c-9ec055f3808d/accept` → **200**

```json
{
  "command_id": "da82d3ba-184a-4557-a06d-1d8b3c6c664e"
}
```

```json
{
  "id": "21c88d89-5773-4494-859d-41b9425548cc",
  "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "516a9213-aeb2-4eb9-a239-c2289cec655e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "516a9213-aeb2-4eb9-a239-c2289cec655e",
  "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
  "assignment_id": "21c88d89-5773-4494-859d-41b9425548cc",
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

`POST /api/driver/v1/work-sessions/23e1e1ae-96d7-4fd7-a241-486f22b63b06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:15Z",
    "sequence": 1793097255151
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:15.167658Z",
  "last_location_at": "2026-10-27T10:34:15.167658Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/516a9213-aeb2-4eb9-a239-c2289cec655e/arrive` → **200**

```json
{
  "command_id": "ad06535c-a635-4119-9fff-9a1b7c59f26e",
  "expected_version": 0
}
```

```json
{
  "id": "516a9213-aeb2-4eb9-a239-c2289cec655e",
  "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
  "assignment_id": "21c88d89-5773-4494-859d-41b9425548cc",
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
  "arrived_at": "2026-10-27T10:34:15.204665Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/516a9213-aeb2-4eb9-a239-c2289cec655e/start` → **200**

```json
{
  "command_id": "f41dce3b-cc9a-460d-a4c6-c1ceff46827c",
  "expected_version": 1
}
```

```json
{
  "id": "516a9213-aeb2-4eb9-a239-c2289cec655e",
  "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
  "assignment_id": "21c88d89-5773-4494-859d-41b9425548cc",
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
  "arrived_at": "2026-10-27T10:34:15.204665Z",
  "started_at": "2026-10-27T10:34:15.241875Z",
  "completed_at": null,
  "needs_review": false
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/23e1e1ae-96d7-4fd7-a241-486f22b63b06/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:15Z",
    "sequence": 1793097255267
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "23e1e1ae-96d7-4fd7-a241-486f22b63b06",
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
  "last_heartbeat_at": "2026-10-27T10:34:15.283278Z",
  "last_location_at": "2026-10-27T10:34:15.283278Z",
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
  "device_ref": "sandbox-7701"
}
```

```json
{
  "challenge_id": "c5f09afc-48e4-499c-a13d-78e24521b0e7",
  "expires_at": "2026-10-27T10:39:15.308025317Z",
  "resend_available_at": "2026-10-27T10:34:16.308025317Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "196241",
  "sent_at": "2026-10-27T10:34:15.310633901Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5f09afc-48e4-499c-a13d-78e24521b0e7",
  "code": "196241",
  "device_ref": "sandbox-7701"
}
```

```json
{
  "session_id": "59c233dc-a223-4846-bbdd-55f997e05dd1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE1NSwiaWF0IjoxNzkzMDk3MjU1LCJqdGkiOiI0MDU5NjRlNi1iOGZmLTQzOWQtYWM3Yy1iMzhlNzBlMzJhNzMiLCJzaWQiOiI1OWMyMzNkYy1hMjIzLTQ4NDYtYmJkZC01NWY5OTdlMDVkZDEifQ.6j1_3h-sEs0Eciaomz-54XaDOncjZlGTgG0z1_ZQ9G8",
  "access_expires_at": "2026-10-27T10:49:15.365724048Z",
  "refresh_token": "VvPprSrsZBbuzG3WqOZVEKYtbhR2aNG_FQB6-oAgsL4",
  "refresh_expires_at": "2026-11-26T10:34:15.365265578Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4816ba0c-a01a-4c5b-9b83-da001475fc55",
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
  "last_heartbeat_at": "2026-10-27T10:34:03.580529Z",
  "last_location_at": "2026-10-27T10:34:03.580529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4816ba0c-a01a-4c5b-9b83-da001475fc55/handover` → **200**

```json
{
  "command_id": "06f6d2a0-7c55-4adc-ab6a-60a00ccd4955",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4816ba0c-a01a-4c5b-9b83-da001475fc55",
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
  "last_heartbeat_at": "2026-10-27T10:34:03.580529Z",
  "last_location_at": "2026-10-27T10:34:03.580529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4816ba0c-a01a-4c5b-9b83-da001475fc55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4150,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:15Z",
    "sequence": 1793097255446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4816ba0c-a01a-4c5b-9b83-da001475fc55",
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
  "last_heartbeat_at": "2026-10-27T10:34:15.462302Z",
  "last_location_at": "2026-10-27T10:34:15.462302Z",
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
  "session_id": "47013af6-9d8a-47aa-9b37-6bb7d3417cb8",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNTUsImlhdCI6MTc5MzA5NzI1NSwianRpIjoiZDg0ZmRmYTUtMWZlZC00ZjYzLTlmNGQtZGQ5OWY3OTEwNTQyIiwic2lkIjoiNDcwMTNhZjYtOWQ4YS00N2FhLTliMzctNmJiN2QzNDE3Y2I4In0.9zHd_4SeQhQ-_Td9fJ3i2gmtwgtmKTgtm2JQ5hg3hOA",
  "access_expires_at": "2026-10-27T10:49:15.751703113Z",
  "refresh_token": "tqqk2tavQyXaTzyeuctZ4a5NKMzkC8cZS0e4X9hHIxM",
  "refresh_expires_at": "2026-10-27T22:34:15.751138163Z",
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
  "session_id": "a6a3b857-ebab-4aa8-9b6d-c1696522ada6",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNTYsImlhdCI6MTc5MzA5NzI1NiwianRpIjoiMWQ5NmMwOWYtZTBjMi00OGU3LWJiMjUtZjZhNmY4MmRjZWM4Iiwic2lkIjoiYTZhM2I4NTctZWJhYi00YWE4LTliNmQtYzE2OTY1MjJhZGE2In0.C8tehBSpXb4315FZAw-mSH7JceAEXuGJ0ltvLEUJIzk",
  "access_expires_at": "2026-10-27T10:49:16.041455761Z",
  "refresh_token": "y0AfxHfjiJxXleGyCQV8D90QJq1Z3bKLRiyZwcY-45c",
  "refresh_expires_at": "2026-10-27T22:34:16.040813485Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4eb71ed3-5cfb-4a60-a101-3352f97eb8f7` → **200**

```json
{
  "id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
  "short_number": 5,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "2ca0a821-a945-4570-83fe-44078a4811cb",
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
    "id": "21c88d89-5773-4494-859d-41b9425548cc",
    "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "516a9213-aeb2-4eb9-a239-c2289cec655e",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T10:34:15.042843Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4eb71ed3-5cfb-4a60-a101-3352f97eb8f7/interrupt` → **200**

```json
{
  "command_id": "9d1461b0-bcbd-413d-8752-a49c7c479ce7",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
    "short_number": 5,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "2ca0a821-a945-4570-83fe-44078a4811cb",
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
      "id": "21c88d89-5773-4494-859d-41b9425548cc",
      "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "516a9213-aeb2-4eb9-a239-c2289cec655e",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T10:34:15.042843Z",
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
    "id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
    "short_number": 6,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "2ca0a821-a945-4570-83fe-44078a4811cb",
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
    "id": "92beaa40-1977-47af-90f8-e9c79f799c5c",
    "order_id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
    "expires_at": "2026-10-27T10:34:31.127573Z",
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

`POST /api/driver/v1/offers/92beaa40-1977-47af-90f8-e9c79f799c5c/accept` → **200**

```json
{
  "command_id": "f5c1c3f6-d7b4-49de-a280-2612da9a6e21"
}
```

```json
{
  "id": "e2f1df9c-8b35-44af-880a-89b8b9f77765",
  "order_id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b7f51164-f52d-49dd-95cb-cd46d0223678",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b7f51164-f52d-49dd-95cb-cd46d0223678",
  "order_id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
  "assignment_id": "e2f1df9c-8b35-44af-880a-89b8b9f77765",
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
  "session_id": "4816ba0c-a01a-4c5b-9b83-da001475fc55",
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
  "last_heartbeat_at": "2026-10-27T10:34:15.462302Z",
  "last_location_at": "2026-10-27T10:34:15.462302Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/4816ba0c-a01a-4c5b-9b83-da001475fc55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:16Z",
    "sequence": 1793097256269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4816ba0c-a01a-4c5b-9b83-da001475fc55",
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
  "last_heartbeat_at": "2026-10-27T10:34:16.284984Z",
  "last_location_at": "2026-10-27T10:34:16.284984Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b7f51164-f52d-49dd-95cb-cd46d0223678/arrive` → **200**

```json
{
  "command_id": "ac9c8e9e-2c51-44e0-af34-5dbe20fe1ef6",
  "expected_version": 0
}
```

```json
{
  "id": "b7f51164-f52d-49dd-95cb-cd46d0223678",
  "order_id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
  "assignment_id": "e2f1df9c-8b35-44af-880a-89b8b9f77765",
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
  "arrived_at": "2026-10-27T10:34:16.321671Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b7f51164-f52d-49dd-95cb-cd46d0223678/start` → **200**

```json
{
  "command_id": "d036d44b-0fc6-465e-bb3c-c4016e40cd4a",
  "expected_version": 1
}
```

```json
{
  "id": "b7f51164-f52d-49dd-95cb-cd46d0223678",
  "order_id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
  "assignment_id": "e2f1df9c-8b35-44af-880a-89b8b9f77765",
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
  "arrived_at": "2026-10-27T10:34:16.321671Z",
  "started_at": "2026-10-27T10:34:16.358904Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/b7f51164-f52d-49dd-95cb-cd46d0223678/complete` → **200**

```json
{
  "command_id": "1c206642-3e6b-4a0b-b1ae-c8864ec0d194",
  "expected_version": 2,
  "reported_at": "2026-10-27T10:34:16Z"
}
```

```json
{
  "id": "b7f51164-f52d-49dd-95cb-cd46d0223678",
  "order_id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
  "assignment_id": "e2f1df9c-8b35-44af-880a-89b8b9f77765",
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
  "arrived_at": "2026-10-27T10:34:16.321671Z",
  "started_at": "2026-10-27T10:34:16.358904Z",
  "completed_at": "2026-10-27T10:34:16.39911Z",
  "needs_review": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "8791a99a-f0d8-4955-846a-3c4e2f676a2f",
    "short_number": 6,
    "status": "FULFILLED",
    "created_at": "2026-10-27T10:34:16.116974Z",
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
    "id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-27T10:34:15.042843Z",
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

`GET /api/operator/v1/orders/4eb71ed3-5cfb-4a60-a101-3352f97eb8f7/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T10:34:15.043441Z",
      "actor": {
        "type": "CLIENT",
        "id": "2ca0a821-a945-4570-83fe-44078a4811cb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
        "quote_id": "41d20b90-81ba-490f-affb-21c03b3dafc2",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T10:34:15.045124Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
        "attempt_id": "dc832dbb-1095-4af5-8644-acb3392f7036",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T10:34:15.049978Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "daee14b5-90fa-4132-9b0c-9ec055f3808d",
        "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T10:34:15.110101Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "daee14b5-90fa-4132-9b0c-9ec055f3808d",
        "order_id": "4eb71ed3-5cfb-4a60-a101-3352f97eb8f7",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "21c88d89-5773-4494-859d-41b9425548cc"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted 4eb71ed3-5cfb-4a60-a101-3352f97eb8f7, follow-up 8791a99a-f0d8-4955-846a-3c4e2f676a2f.

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
  "session_id": "56139eca-88d2-41d6-a923-46b1cfa425dd",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNTksImlhdCI6MTc5MzA5NzI1OSwianRpIjoiNGM4ZTgyYjItY2Q0MS00MzMyLWJjMDgtOWU5YjBkOTMyN2FmIiwic2lkIjoiNTYxMzllY2EtODhkMi00MWQ2LWE5MjMtNDZiMWNmYTQyNWRkIn0.FJBK7UDAy7TEqKyJZmk6eERDQeP2fe-QXR-Vl6tD8_g",
  "access_expires_at": "2026-10-27T10:49:19.780187828Z",
  "refresh_token": "IXI4dqzBT7pAJBEUxXeKN2qvT3WCjXno6uaoXlP8AEU",
  "refresh_expires_at": "2026-10-27T22:34:19.779693255Z",
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
  "command_id": "e7d81e24-f55a-4c73-bcd5-538d3b1dfedd",
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
  "changed_by": "84fd7b91-9a50-467d-bb0c-64203d215a3e",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T10:34:19.850444226Z"
}
```

## The rider books the airport for 2026-10-27T13:34:19Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600500474",
  "device_ref": "sandbox-1437"
}
```

```json
{
  "challenge_id": "e12c8e6c-7ec8-400f-b845-0f7877d73799",
  "expires_at": "2026-10-27T10:39:19.881280695Z",
  "resend_available_at": "2026-10-27T10:34:20.881280695Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600500474` → **200**

```json
{
  "phone": "+48600500474",
  "audience": "CLIENT",
  "code": "400679",
  "sent_at": "2026-10-27T10:34:19.883506252Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e12c8e6c-7ec8-400f-b845-0f7877d73799",
  "code": "400679",
  "device_ref": "sandbox-1437"
}
```

```json
{
  "session_id": "bb6a45d1-fd7c-432a-b831-0af310f14a46",
  "subject": {
    "type": "CLIENT",
    "id": "cb817a74-79a3-46fe-b99d-bb17a88220fa"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYjgxN2E3NC03OWEzLTQ2ZmUtYjk5ZC1iYjE3YTg4MjIwZmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDk4MTU5LCJpYXQiOjE3OTMwOTcyNTksImp0aSI6ImEwNzZjMGUxLWJhMWYtNDA5Ni1hZjJjLTVjMDMxNjg0ZDkxMiIsInNpZCI6ImJiNmE0NWQxLWZkN2MtNDMyYS1iODMxLTBhZjMxMGYxNGE0NiJ9.YlT24EbrILUYuv_DZwUq1TVKFYZnU8MSpjyBpeidQJE",
  "access_expires_at": "2026-10-27T10:49:19.939399848Z",
  "refresh_token": "uUZFvh5XSxdrmn9gS4dBFv4Sk40riJ4mld2OP314ql0",
  "refresh_expires_at": "2026-11-26T10:34:19.93882881Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6b2e849-3be4-433d-b498-831f649b39b1",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T13:34:19Z"
}
```

```json
{
  "id": "3ac7f357-4a25-4701-a741-e86c71c0cd0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T10:39:19.974370Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T13:34:19Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3db7e33a-5565-4a77-8833-a3df2eda3631",
  "quote_id": "3ac7f357-4a25-4701-a741-e86c71c0cd0d",
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
  "pickup_at": "2026-10-27T13:34:19Z"
}
```

```json
{
  "id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
  "short_number": 7,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "cb817a74-79a3-46fe-b99d-bb17a88220fa",
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
  "created_at": "2026-10-27T10:34:20.009684Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T13:34:19Z",
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
  "device_ref": "sandbox-22452"
}
```

```json
{
  "challenge_id": "ed888690-4bc4-4738-8ce1-7ad234251761",
  "expires_at": "2026-10-27T10:39:20.041216474Z",
  "resend_available_at": "2026-10-27T10:34:21.041216474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "868828",
  "sent_at": "2026-10-27T10:34:20.04363381Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed888690-4bc4-4738-8ce1-7ad234251761",
  "code": "868828",
  "device_ref": "sandbox-22452"
}
```

```json
{
  "session_id": "5e92ec76-9c4c-4329-b35f-b3f2b11ca394",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5ODE2MCwiaWF0IjoxNzkzMDk3MjYwLCJqdGkiOiJjYTNlZTBmMS0zODczLTRhOTYtOGVkNC0yYjEzODIyZmY4YjUiLCJzaWQiOiI1ZTkyZWM3Ni05YzRjLTQzMjktYjM1Zi1iM2YyYjExY2EzOTQifQ.ESPPxER772cXrLX5g_8ZTXg-iT1HxtwjruGVQ5UGbFw",
  "access_expires_at": "2026-10-27T10:49:20.096633543Z",
  "refresh_token": "iq7MS6s2-WDTLILEhFxenmTeBG75fobU_ZY0tS8NDGY",
  "refresh_expires_at": "2026-11-26T10:34:20.096052479Z",
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
  "command_id": "c1cc7e2e-ec30-4f0e-aa0a-a9185769c4f1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T10:34:20Z",
    "sequence": 1793097260145
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8beaf1e5-ad92-43d6-9b64-ae97b7c9f3d0",
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
  "last_heartbeat_at": "2026-10-27T10:34:20.158817Z",
  "last_location_at": "2026-10-27T10:34:20.158817Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
      "short_number": 7,
      "pickup_at": "2026-10-27T13:34:19Z",
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

`POST /api/driver/v1/preorders/45badc84-62a0-4e6b-bc23-33fc66d12e78/reserve` → **200**

```json
{
  "command_id": "8a39e95c-927d-431b-bfbb-15893cc19273"
}
```

```json
{
  "id": "d14b1263-9f62-4072-84c9-a416b099ca3a",
  "state": "RESERVED",
  "order": {
    "order_id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
    "short_number": 7,
    "pickup_at": "2026-10-27T13:34:19Z",
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
  "reserved_at": "2026-10-27T10:34:20.223104Z",
  "confirm_from": "2026-10-27T13:04:19Z",
  "confirm_until": "2026-10-27T13:14:19Z",
  "drop_until": "2026-10-27T12:34:19Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "d14b1263-9f62-4072-84c9-a416b099ca3a",
      "state": "RESERVED",
      "order": {
        "order_id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
        "short_number": 7,
        "pickup_at": "2026-10-27T13:34:19Z",
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
      "reserved_at": "2026-10-27T10:34:20.223104Z",
      "confirm_from": "2026-10-27T13:04:19Z",
      "confirm_until": "2026-10-27T13:14:19Z",
      "drop_until": "2026-10-27T12:34:19Z"
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
      "id": "d14b1263-9f62-4072-84c9-a416b099ca3a",
      "state": "RESERVED",
      "order": {
        "order_id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
        "short_number": 7,
        "pickup_at": "2026-10-27T13:34:19Z",
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
      "reserved_at": "2026-10-27T10:34:20.223104Z",
      "confirm_from": "2026-10-27T13:04:19Z",
      "confirm_until": "2026-10-27T13:14:19Z",
      "drop_until": "2026-10-27T12:34:19Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/d14b1263-9f62-4072-84c9-a416b099ca3a/confirm` → **409**

```json
{
  "command_id": "f8756d9a-c630-4227-a9f7-b7732b25d3ac"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/d14b1263-9f62-4072-84c9-a416b099ca3a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ee7a8651-43a8-4dc6-bc36-650ee124f063"
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
  "session_id": "b8408882-00a9-43a9-92fe-2d00a8b18fdd",
  "subject": {
    "type": "STAFF",
    "id": "84fd7b91-9a50-467d-bb0c-64203d215a3e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGZkN2I5MS05YTUwLTQ2N2QtYmIwYy02NDIwM2QyMTVhM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTgxNjAsImlhdCI6MTc5MzA5NzI2MCwianRpIjoiMmQyMmQ2MDktNTRjNS00NThjLWJjOTAtMGQzMjNhMjJiYTVjIiwic2lkIjoiYjg0MDg4ODItMDBhOS00M2E5LTkyZmUtMmQwMGE4YjE4ZmRkIn0._79RUm9cAG8Ys7E40lpqztgFZbkoKIcutYJpcvRRCIc",
  "access_expires_at": "2026-10-27T10:49:20.601325216Z",
  "refresh_token": "NCVvFO_j73mDNtdbLQqAakqVPcTZcIQUkIJXklXxzjA",
  "refresh_expires_at": "2026-10-27T22:34:20.600834458Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/45badc84-62a0-4e6b-bc23-33fc66d12e78` → **200**

```json
{
  "id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
  "short_number": 7,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "cb817a74-79a3-46fe-b99d-bb17a88220fa",
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
  "created_at": "2026-10-27T10:34:20.009684Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T13:34:19Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "d14b1263-9f62-4072-84c9-a416b099ca3a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T10:34:20.223104Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/45badc84-62a0-4e6b-bc23-33fc66d12e78/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T10:34:20.011303Z",
      "actor": {
        "type": "CLIENT",
        "id": "cb817a74-79a3-46fe-b99d-bb17a88220fa",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
        "preorder": true,
        "quote_id": "3ac7f357-4a25-4701-a741-e86c71c0cd0d",
        "pickup_at": "2026-10-27T13:34:19Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T10:34:20.224213Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "45badc84-62a0-4e6b-bc23-33fc66d12e78",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "d14b1263-9f62-4072-84c9-a416b099ca3a"
      }
    }
  ]
}
```

Done: pre-order 45badc84-62a0-4e6b-bc23-33fc66d12e78, reservation d14b1263-9f62-4072-84c9-a416b099ca3a.
