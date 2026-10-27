# Sandbox transcript (2026-10-27T08:58:16Z, 958e298)

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630170174",
  "device_ref": "sandbox-1483"
}
```

```json
{
  "challenge_id": "f79d2bd5-5013-4517-a5ad-857f400c6ea7",
  "expires_at": "2026-10-27T09:03:16.867877172Z",
  "resend_available_at": "2026-10-27T08:59:16.867877172Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630170174` → **200**

```json
{
  "phone": "+380630170174",
  "audience": "CLIENT",
  "code": "217470",
  "sent_at": "2026-10-27T08:58:16.87500673Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f79d2bd5-5013-4517-a5ad-857f400c6ea7",
  "code": "217470",
  "device_ref": "sandbox-1483"
}
```

```json
{
  "session_id": "96f5ba5e-0b23-4b03-9f37-487cfa9968be",
  "subject": {
    "type": "CLIENT",
    "id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Yzg2MzQzNi03NGZlLTRlNTctYTE4My01NmY5YTRkN2MyYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkyMzk2LCJpYXQiOjE3OTMwOTE0OTYsImp0aSI6ImRlMDkxNDUwLWIyYjEtNGY2ZS1hY2ZhLTRiOGM3ZWQ2NzVmZCIsInNpZCI6Ijk2ZjViYTVlLTBiMjMtNGIwMy05ZjM3LTQ4N2NmYTk5NjhiZSJ9.4I_CHPzaoNHmAsrsJzkGeKIdGEGKJav2wNKaYTJal2k",
  "access_expires_at": "2026-10-27T09:13:16.962903294Z",
  "refresh_token": "2WQrXp-Y3WFwaXj7zpQxmpKfABKo1I6xQQSU37fExeQ",
  "refresh_expires_at": "2026-11-26T08:58:16.959990154Z",
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
  "device_ref": "sandbox-6074"
}
```

```json
{
  "challenge_id": "18f30fdb-7b6d-4236-93ab-d7e033fe2320",
  "expires_at": "2026-10-27T09:03:17.081217492Z",
  "resend_available_at": "2026-10-27T08:59:17.081217492Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "801468",
  "sent_at": "2026-10-27T08:58:17.084628684Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18f30fdb-7b6d-4236-93ab-d7e033fe2320",
  "code": "801468",
  "device_ref": "sandbox-6074"
}
```

```json
{
  "session_id": "273b3f25-dad8-4bf6-abba-c3cf6a35d5b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5MjM5NywiaWF0IjoxNzkzMDkxNDk3LCJqdGkiOiIxYmM4YzAzOC1kOWJkLTQ0YzYtOWQwMi1mZWY2MjQ1ZWZlMGMiLCJzaWQiOiIyNzNiM2YyNS1kYWQ4LTRiZjYtYWJiYS1jM2NmNmEzNWQ1YjIifQ.OhXfduBaZipgNSN1RGmrk3SIuKd5pIMar0e8STgiSCM",
  "access_expires_at": "2026-10-27T09:13:17.13768155Z",
  "refresh_token": "Cc_GyJ7W1ffxhSAKdYTK4g4OT90Shl_bKLD8sguWEu8",
  "refresh_expires_at": "2026-11-26T08:58:17.136792707Z",
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
  "correlation_id": "b58d37be-620e-4ee8-9dc7-45fea9517142"
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
  "session_id": "e9a67e6e-6c5d-40d2-b677-de6f585ee1ff",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTIzOTcsImlhdCI6MTc5MzA5MTQ5NywianRpIjoiMzIzMzYzMmUtMzc3Zi00YjA5LThkOWMtNjdiNGM4YjdiOTgyIiwic2lkIjoiZTlhNjdlNmUtNmM1ZC00MGQyLWI2NzctZGU2ZjU4NWVlMWZmIn0.KRLTKDxoa5YB2feSQ5sTzH5mLceeugU3YSjAIpDgpwQ",
  "access_expires_at": "2026-10-27T09:13:17.772053806Z",
  "refresh_token": "3Gwll3tQEE8yVDgUkPbJgXM_ZColeGqQb3ExGiW0oD0",
  "refresh_expires_at": "2026-10-27T20:58:17.771128538Z",
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
  "session_id": "57661e63-e684-4b1c-a1ae-8b8aa65a291c",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTIzOTksImlhdCI6MTc5MzA5MTQ5OSwianRpIjoiODQ1MTNmM2EtZTdjMS00NTE5LTlkNzgtOWRlNzdiODY0MmM3Iiwic2lkIjoiNTc2NjFlNjMtZTY4NC00YjFjLWExYWUtOGI4YWE2NWEyOTFjIn0.US09iHuT6KSrlJdwHouLBHMMDVd1BGs_ni6F6gRwvFE",
  "access_expires_at": "2026-10-27T09:13:19.072632746Z",
  "refresh_token": "4PNdUS9E4D6majMHZeAcmsOK0zAsEYELcD05j2bBQww",
  "refresh_expires_at": "2026-10-27T20:58:19.071709321Z",
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
  "session_id": "6b9e83c8-e667-4214-9731-ac5d2c729e85",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTIzOTksImlhdCI6MTc5MzA5MTQ5OSwianRpIjoiMmQxYzBjOTMtYzY4MC00NTdkLWI4MDAtNDg4MmEyYjQ4NDBhIiwic2lkIjoiNmI5ZTgzYzgtZTY2Ny00MjE0LTk3MzEtYWM1ZDJjNzI5ZTg1In0.I6qKPcwRdenAWYiZtVabQcRiUn0TcYtNREUeP761QHc",
  "access_expires_at": "2026-10-27T09:13:19.361071722Z",
  "refresh_token": "ahSmn4D88RSnzKAc3DODUZ5erbNNNMXpySFHvKR3xYA",
  "refresh_expires_at": "2026-10-27T20:58:19.360224322Z",
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
    }
  ]
}
```

## The rider orders and cancels: «Долго ждать машину»

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "19cd2d9e-b63d-484a-9258-f9b2955076c8",
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
  "id": "3c53b6ca-0f13-4f15-8f9c-ef6f79c97563",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:03:19.499545Z",
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
  "command_id": "605008a8-f2c4-498b-beca-bdeafb450165",
  "quote_id": "3c53b6ca-0f13-4f15-8f9c-ef6f79c97563",
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
  "id": "45b57e9e-de14-478b-be3c-9ad5a3e8f0ad",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8",
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
  "created_at": "2026-10-27T08:58:19.592258Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

`GET /api/rider/v1/orders/45b57e9e-de14-478b-be3c-9ad5a3e8f0ad` → **200**

```json
{
  "id": "45b57e9e-de14-478b-be3c-9ad5a3e8f0ad",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8",
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
  "created_at": "2026-10-27T08:58:19.592258Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

`POST /api/rider/v1/orders/45b57e9e-de14-478b-be3c-9ad5a3e8f0ad/cancel` → **200**

```json
{
  "command_id": "06adde3c-e306-453b-9ebf-2360724dac1a",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "45b57e9e-de14-478b-be3c-9ad5a3e8f0ad",
  "short_number": 1,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8",
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
  "created_at": "2026-10-27T08:58:19.592258Z",
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
  "preorder": false
}
```

## Two drivers online; the order goes to the nearest one

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "c199d54c-e251-4923-8abb-44a37f127310",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T08:58:19Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "311509ba-ffd2-4d25-9ffd-0c480b325114",
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
  "last_heartbeat_at": "2026-10-27T08:58:19.799576Z",
  "last_location_at": "2026-10-27T08:58:19.799576Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30262"
}
```

```json
{
  "challenge_id": "a429e051-20ad-4644-b689-c136ee9773cf",
  "expires_at": "2026-10-27T09:03:19.836722923Z",
  "resend_available_at": "2026-10-27T08:59:19.836722923Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "277860",
  "sent_at": "2026-10-27T08:58:19.840051039Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a429e051-20ad-4644-b689-c136ee9773cf",
  "code": "277860",
  "device_ref": "sandbox-30262"
}
```

```json
{
  "session_id": "3c445e06-6c18-4a25-8a14-7fd7d28de20b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5MjM5OSwiaWF0IjoxNzkzMDkxNDk5LCJqdGkiOiI5YjYwNmU0Yi0yYzEzLTQwOTQtODIzNC1mOGM5ZmQ5M2YyMWEiLCJzaWQiOiIzYzQ0NWUwNi02YzE4LTRhMjUtOGExNC03ZmQ3ZDI4ZGUyMGIifQ.FScywCZEUCISPreWsSvLRFqQKaYRw_efGOOeCW0rum8",
  "access_expires_at": "2026-10-27T09:13:19.900265765Z",
  "refresh_token": "EVxioZ-pzu_7pUWF4pFvwem8lqvlTsRRWDKjodMSdhM",
  "refresh_expires_at": "2026-11-26T08:58:19.899307821Z",
  "account_created": false
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "629d0e34-429b-4cfc-b035-72f6ecd6450d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T08:58:19Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "76de5d5f-037c-418a-8705-61a7935ed537",
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
  "last_heartbeat_at": "2026-10-27T08:58:19.93788Z",
  "last_location_at": "2026-10-27T08:58:19.93788Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a1e3029d-32aa-4dd2-ac12-bbffa99f5dd6",
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
  "id": "a3f86150-cbca-49b2-95bb-2f1075e83a1f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T09:03:19.977387Z",
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
  "command_id": "7298f11e-8b34-449b-9fea-758cdf9a8f60",
  "quote_id": "a3f86150-cbca-49b2-95bb-2f1075e83a1f",
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
  "id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8",
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
  "created_at": "2026-10-27T08:58:20.015263Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bf1a91f0-59d5-436a-b730-ac82a82633c0",
    "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
    "expires_at": "2026-10-27T08:58:35.019895Z",
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

`POST /api/driver/v1/offers/bf1a91f0-59d5-436a-b730-ac82a82633c0/accept` → **200**

```json
{
  "command_id": "2a80a696-f7b2-475b-8b36-2b15f305a7c9"
}
```

```json
{
  "id": "1b888850-2fe3-45c8-938a-55a039d069e4",
  "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30f30a07-5fb0-4fb2-89aa-4dd653a4dc17",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30f30a07-5fb0-4fb2-89aa-4dd653a4dc17",
  "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "assignment_id": "1b888850-2fe3-45c8-938a-55a039d069e4",
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

`POST /api/driver/v1/trips/30f30a07-5fb0-4fb2-89aa-4dd653a4dc17/cancel` → **200**

```json
{
  "command_id": "0a63c2b8-b68b-4929-ab03-afc9253064e7",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "30f30a07-5fb0-4fb2-89aa-4dd653a4dc17",
  "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "assignment_id": "1b888850-2fe3-45c8-938a-55a039d069e4",
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

`GET /api/rider/v1/orders/fb8e0b0f-e283-465d-8b70-d11b6db9ebcb` → **200**

```json
{
  "id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8",
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
    "id": "1b888850-2fe3-45c8-938a-55a039d069e4",
    "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "30f30a07-5fb0-4fb2-89aa-4dd653a4dc17",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T08:58:20.015263Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "a9f254ac-17ca-4f67-9098-736edf5bb346",
    "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
    "expires_at": "2026-10-27T08:58:35.215221Z",
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

`POST /api/driver/v1/offers/a9f254ac-17ca-4f67-9098-736edf5bb346/accept` → **200**

```json
{
  "command_id": "dbe116dc-810c-4552-91cd-241f71155e3f"
}
```

```json
{
  "id": "d9730794-4353-4837-9e63-0e3cc5e6bc01",
  "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3ecdf858-a712-4bb1-8b94-daf67bff1a97",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3ecdf858-a712-4bb1-8b94-daf67bff1a97",
  "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "assignment_id": "d9730794-4353-4837-9e63-0e3cc5e6bc01",
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

`POST /api/driver/v1/trips/3ecdf858-a712-4bb1-8b94-daf67bff1a97/cancel` → **200**

```json
{
  "command_id": "47413afe-9c61-4d31-adb9-dc10fb0e659f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "3ecdf858-a712-4bb1-8b94-daf67bff1a97",
  "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
  "assignment_id": "d9730794-4353-4837-9e63-0e3cc5e6bc01",
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
    "id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T08:58:20.015263Z",
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
    "id": "45b57e9e-de14-478b-be3c-9ad5a3e8f0ad",
    "short_number": 1,
    "status": "CANCELLED",
    "created_at": "2026-10-27T08:58:19.592258Z",
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

`GET /api/operator/v1/orders/fb8e0b0f-e283-465d-8b70-d11b6db9ebcb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T08:58:20.016148Z",
      "actor": {
        "type": "CLIENT",
        "id": "9c863436-74fe-4e57-a183-56f9a4d7c2a8",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
        "quote_id": "a3f86150-cbca-49b2-95bb-2f1075e83a1f",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T08:58:20.018699Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
        "attempt_id": "e100354b-9c2c-4fd3-9458-6975061cde64",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T08:58:20.025732Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bf1a91f0-59d5-436a-b730-ac82a82633c0",
        "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T08:58:20.09629Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "bf1a91f0-59d5-436a-b730-ac82a82633c0",
        "order_id": "fb8e0b0f-e283-465d-8b70-d11b6db9ebcb",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "1b888850-2fe3-45c8-938a-55a039d069e4"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders 45b57e9e-de14-478b-be3c-9ad5a3e8f0ad, fb8e0b0f-e283-465d-8b70-d11b6db9ebcb.

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
  "device_ref": "sandbox-29679"
}
```

```json
{
  "challenge_id": "82ba0e40-a0a6-4976-8d92-0c719ee7dbb0",
  "expires_at": "2026-10-27T09:03:20.510517988Z",
  "resend_available_at": "2026-10-27T08:59:20.510517988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "906148",
  "sent_at": "2026-10-27T08:58:20.513454574Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "82ba0e40-a0a6-4976-8d92-0c719ee7dbb0",
  "code": "906148",
  "device_ref": "sandbox-29679"
}
```

```json
{
  "session_id": "cf3694c5-4ec1-4174-bc39-f1ce312f7d7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5MjQwMCwiaWF0IjoxNzkzMDkxNTAwLCJqdGkiOiJmNGM5NTBmNS0yYjcwLTQ5MWUtOWVmMS0yYWNlMjIzMzEzY2MiLCJzaWQiOiJjZjM2OTRjNS00ZWMxLTQxNzQtYmMzOS1mMWNlMzEyZjdkN2EifQ.M4GyBxLagjLTo9BtM7oBrVRrQvBZKRjFRXfkRyuNL-o",
  "access_expires_at": "2026-10-27T09:13:20.56565491Z",
  "refresh_token": "RyEcYdcgdvdJat0hCGZTupKkUHa3Rrjll_KKittAfqQ",
  "refresh_expires_at": "2026-11-26T08:58:20.564955606Z",
  "account_created": false
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "d8e7bad6-b0c7-4cbb-80a4-b9fc1bd8a40d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T08:58:20Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d43e0f88-cef3-4482-b839-75856658bee9",
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
  "last_heartbeat_at": "2026-10-27T08:58:20.601133Z",
  "last_location_at": "2026-10-27T08:58:20.601133Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674032154",
  "device_ref": "sandbox-31680"
}
```

```json
{
  "challenge_id": "c0dbb4ea-6803-4c15-b82d-fddc1884e080",
  "expires_at": "2026-10-27T09:03:20.633128499Z",
  "resend_available_at": "2026-10-27T08:59:20.633128499Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674032154` → **200**

```json
{
  "phone": "+380674032154",
  "audience": "CLIENT",
  "code": "521803",
  "sent_at": "2026-10-27T08:58:20.636362664Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0dbb4ea-6803-4c15-b82d-fddc1884e080",
  "code": "521803",
  "device_ref": "sandbox-31680"
}
```

```json
{
  "session_id": "281bd308-980c-4328-badd-167c03a9ca59",
  "subject": {
    "type": "CLIENT",
    "id": "e535a1e7-d411-4d76-a38a-7f72ee1f5700"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNTM1YTFlNy1kNDExLTRkNzYtYTM4YS03ZjcyZWUxZjU3MDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkyNDAwLCJpYXQiOjE3OTMwOTE1MDAsImp0aSI6ImQxODdiNWM0LTMwMTMtNDIyYi05NGFjLWU2YTkwNzJiOGQwNCIsInNpZCI6IjI4MWJkMzA4LTk4MGMtNDMyOC1iYWRkLTE2N2MwM2E5Y2E1OSJ9.XoU3mzrbHAJUwgu_6eShkXgvzHfMq_p9W_g_ZfCoEBs",
  "access_expires_at": "2026-10-27T09:13:20.68782691Z",
  "refresh_token": "wdyxQAN8s9aP7sTWKDlWGwzvd8okDcq3MMsTG6dFdsU",
  "refresh_expires_at": "2026-11-26T08:58:20.687152474Z",
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
  "command_id": "39ad06a2-893b-4f93-a497-b3138f342e37",
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
  "id": "1b478dd5-8dda-4106-8fab-9ea02431a684",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T09:03:20.749859Z",
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
  "command_id": "8e5ca156-07fc-4833-a4d9-c69e26794995",
  "quote_id": "1b478dd5-8dda-4106-8fab-9ea02431a684",
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
  "id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e535a1e7-d411-4d76-a38a-7f72ee1f5700",
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
  "created_at": "2026-10-27T08:58:20.787833Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4f7d48e7-ad3a-4a58-a96d-4e8060ba0ed2",
    "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
    "expires_at": "2026-10-27T08:58:35.791493Z",
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

`POST /api/driver/v1/offers/4f7d48e7-ad3a-4a58-a96d-4e8060ba0ed2/accept` → **200**

```json
{
  "command_id": "f7aa53c8-6333-4d91-a514-4db048f9323d"
}
```

```json
{
  "id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c4b4c50-0360-4dbf-8535-209fef143881",
  "trip_phase": "TO_PICKUP"
}
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/a593f72f-7e96-4bad-8ff8-e23057e1f772/messages` → **201**

```json
{
  "command_id": "1812257d-db24-481f-b6e5-34a52668993f",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "9a7eb421-ffe7-44bc-b794-4e5ed205c9ed",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T08:58:20.898683231Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c4b4c50-0360-4dbf-8535-209fef143881",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "assignment_id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
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

`POST /api/driver/v1/trips/9c4b4c50-0360-4dbf-8535-209fef143881/messages` → **201**

```json
{
  "command_id": "f88a8b0a-6215-4152-bdb7-6bcce40a0792",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "08cfcf2f-e998-46df-acb5-219efc8e8855",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T08:58:20.952418491Z"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d43e0f88-cef3-4482-b839-75856658bee9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T08:58:20Z",
    "sequence": 2
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d43e0f88-cef3-4482-b839-75856658bee9",
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
  "last_heartbeat_at": "2026-10-27T08:58:20.988689Z",
  "last_location_at": "2026-10-27T08:58:20.988689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c4b4c50-0360-4dbf-8535-209fef143881",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "assignment_id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
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

`POST /api/driver/v1/trips/9c4b4c50-0360-4dbf-8535-209fef143881/arrive` → **200**

```json
{
  "command_id": "0eb84410-5229-461b-9496-4f21ed8dd192",
  "expected_version": 0
}
```

```json
{
  "id": "9c4b4c50-0360-4dbf-8535-209fef143881",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "assignment_id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
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
  "arrived_at": "2026-10-27T08:58:21.044452Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/trips/9c4b4c50-0360-4dbf-8535-209fef143881/start` → **200**

```json
{
  "command_id": "2e2ac93f-1ffd-4297-aca6-3313d2feae9f",
  "expected_version": 1
}
```

```json
{
  "id": "9c4b4c50-0360-4dbf-8535-209fef143881",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "assignment_id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
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
  "arrived_at": "2026-10-27T08:58:21.044452Z",
  "started_at": "2026-10-27T08:58:21.079352Z",
  "completed_at": null,
  "needs_review": false
}
```

`POST /api/driver/v1/work-sessions/d43e0f88-cef3-4482-b839-75856658bee9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T08:58:21Z",
    "sequence": 3
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d43e0f88-cef3-4482-b839-75856658bee9",
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
  "last_heartbeat_at": "2026-10-27T08:58:21.114869Z",
  "last_location_at": "2026-10-27T08:58:21.114869Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/9c4b4c50-0360-4dbf-8535-209fef143881/complete` → **200**

```json
{
  "command_id": "3fff43cb-158e-4b8d-bd98-9b88cc685610",
  "expected_version": 2,
  "reported_at": "2026-10-27T08:58:21Z",
  "cash_received": true
}
```

```json
{
  "id": "9c4b4c50-0360-4dbf-8535-209fef143881",
  "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "assignment_id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
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
  "arrived_at": "2026-10-27T08:58:21.044452Z",
  "started_at": "2026-10-27T08:58:21.079352Z",
  "completed_at": "2026-10-27T08:58:21.156662Z",
  "needs_review": false
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/a593f72f-7e96-4bad-8ff8-e23057e1f772` → **200**

```json
{
  "id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
  "short_number": 3,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e535a1e7-d411-4d76-a38a-7f72ee1f5700",
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
    "id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665",
    "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9c4b4c50-0360-4dbf-8535-209fef143881",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T08:58:20.787833Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
    "short_number": 3,
    "status": "FULFILLED",
    "created_at": "2026-10-27T08:58:20.787833Z",
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
    "id": "9c4b4c50-0360-4dbf-8535-209fef143881",
    "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
    "order_short_number": 3,
    "created_at": "2026-10-27T08:58:20.854648Z",
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
  "session_id": "86afc48d-0d4f-4b46-a8b0-78a6343e470d",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI0MDQsImlhdCI6MTc5MzA5MTUwNCwianRpIjoiZGRhOTM2NWUtY2M1Yi00Y2M5LWFjNjMtOTViNWMyYzA3NDcwIiwic2lkIjoiODZhZmM0OGQtMGQ0Zi00YjQ2LWE4YjAtNzhhNjM0M2U0NzBkIn0.mobHPEBJrgg3o6M4PQ5ot4EtmbRk1wAIl9QjimFcczM",
  "access_expires_at": "2026-10-27T09:13:24.555066266Z",
  "refresh_token": "vh103PakF3m0Trq2UkbW_ciTX_Q0y1TvbUZu9zwHmaU",
  "refresh_expires_at": "2026-10-27T20:58:24.554472746Z",
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
  "session_id": "15c06135-1408-4ca7-8a8f-42cc573bd263",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI0MDQsImlhdCI6MTc5MzA5MTUwNCwianRpIjoiYzRhZjMxMTgtMjVhOS00NWY5LWI3YjEtZWRmMjgzNmZhMDJmIiwic2lkIjoiMTVjMDYxMzUtMTQwOC00Y2E3LThhOGYtNDJjYzU3M2JkMjYzIn0.Vl4IwsCTWs0B26orYtnheN1L93Si7SxNXMH-XVqGyP0",
  "access_expires_at": "2026-10-27T09:13:24.849848946Z",
  "refresh_token": "_5tqoIDn_IMDyGGik1CkXWW6eIEZVmGKzSSJ1AbADuM",
  "refresh_expires_at": "2026-10-27T20:58:24.849056672Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/a593f72f-7e96-4bad-8ff8-e23057e1f772/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T08:58:20.788443Z",
      "actor": {
        "type": "CLIENT",
        "id": "e535a1e7-d411-4d76-a38a-7f72ee1f5700",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
        "quote_id": "1b478dd5-8dda-4106-8fab-9ea02431a684",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T08:58:20.7905Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
        "attempt_id": "007efc42-4239-4eda-a242-f6a4fa8ce698",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T08:58:20.796024Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4f7d48e7-ad3a-4a58-a96d-4e8060ba0ed2",
        "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 211
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T08:58:20.85654Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4f7d48e7-ad3a-4a58-a96d-4e8060ba0ed2",
        "order_id": "a593f72f-7e96-4bad-8ff8-e23057e1f772",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f41dba8d-4fa1-4eba-bf27-39f6968fa665"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: order a593f72f-7e96-4bad-8ff8-e23057e1f772.

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
  "session_id": "3fd66f3b-42c5-4860-a90a-dd081b544164",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI0MDUsImlhdCI6MTc5MzA5MTUwNSwianRpIjoiMDI0NWYxYjMtNWUwYS00OTUzLTg2NWItYTUyODc2MjQ1NGQxIiwic2lkIjoiM2ZkNjZmM2ItNDJjNS00ODYwLWE5MGEtZGQwODFiNTQ0MTY0In0.x1yCN-DMUEEtnQ1q0CvRBWf9K0ehrC7hSBFkwclH5g8",
  "access_expires_at": "2026-10-27T09:13:25.189236961Z",
  "refresh_token": "4FM05Fvy0EGka-g4yhe85U04z-kfaOivDaOJNfoZg3E",
  "refresh_expires_at": "2026-10-27T20:58:25.188748105Z",
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
  "command_id": "52749d82-e94a-4405-b4ae-bdfa9f2b6ca3",
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
  "changed_by": "d3cb1330-2c5c-4236-a496-6bdcc183c49d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T08:58:25.259636006Z"
}
```

## The rider books the airport for 2026-10-27T11:58:24Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600489442",
  "device_ref": "sandbox-13326"
}
```

```json
{
  "challenge_id": "e61916cc-ee4e-447c-a14c-13de81531faa",
  "expires_at": "2026-10-27T09:03:25.290597283Z",
  "resend_available_at": "2026-10-27T08:59:25.290597283Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600489442` → **200**

```json
{
  "phone": "+48600489442",
  "audience": "CLIENT",
  "code": "680106",
  "sent_at": "2026-10-27T08:58:25.293265714Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e61916cc-ee4e-447c-a14c-13de81531faa",
  "code": "680106",
  "device_ref": "sandbox-13326"
}
```

```json
{
  "session_id": "76ea831a-7e19-4c7f-8f39-ab1a1bbc3845",
  "subject": {
    "type": "CLIENT",
    "id": "7f7d4afa-b733-49fa-aeec-35efb0ef60f6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZjdkNGFmYS1iNzMzLTQ5ZmEtYWVlYy0zNWVmYjBlZjYwZjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMDkyNDA1LCJpYXQiOjE3OTMwOTE1MDUsImp0aSI6ImI1NTBiY2ZmLWYyNGMtNDdlNi05MjYzLTkwZGYyZGYxNDI2NSIsInNpZCI6Ijc2ZWE4MzFhLTdlMTktNGM3Zi04ZjM5LWFiMWExYmJjMzg0NSJ9.j9GXHtJpE7FxghzygEPQudx0il6rQyNW3qenD7DjlDY",
  "access_expires_at": "2026-10-27T09:13:25.345439262Z",
  "refresh_token": "4jOVFt4wDymvwgBZ-6IsnQwHI4WZEpWNQXDAleaBNsQ",
  "refresh_expires_at": "2026-11-26T08:58:25.3449264Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "74d51f15-9440-4615-b09e-1f419753b453",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T11:58:24Z"
}
```

```json
{
  "id": "f65473a2-61ea-4b89-a09c-6cefc9247883",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T09:03:25.380400Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T11:58:24Z",
  "preorder": true
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "736169f8-6607-4e35-8b09-0a1af4b77f05",
  "quote_id": "f65473a2-61ea-4b89-a09c-6cefc9247883",
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
  "pickup_at": "2026-10-27T11:58:24Z"
}
```

```json
{
  "id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
  "short_number": 4,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7f7d4afa-b733-49fa-aeec-35efb0ef60f6",
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
  "created_at": "2026-10-27T08:58:25.417481Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T11:58:24Z",
  "preorder": true
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-19689"
}
```

```json
{
  "challenge_id": "2933251c-b113-4ae2-8ab4-ad36db262bc8",
  "expires_at": "2026-10-27T09:03:25.448996665Z",
  "resend_available_at": "2026-10-27T08:59:25.448996665Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "286522",
  "sent_at": "2026-10-27T08:58:25.451547308Z"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2933251c-b113-4ae2-8ab4-ad36db262bc8",
  "code": "286522",
  "device_ref": "sandbox-19689"
}
```

```json
{
  "session_id": "49c388e7-453c-46aa-9634-f23d678fa9fd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzA5MjQwNSwiaWF0IjoxNzkzMDkxNTA1LCJqdGkiOiJiNTQ5YjAwYy1hMzdjLTRhMWEtODM5YS05NDE1ZGEzOWYzYjAiLCJzaWQiOiI0OWMzODhlNy00NTNjLTQ2YWEtOTYzNC1mMjNkNjc4ZmE5ZmQifQ.hfA1oabh1lr8aJtDyYBL6YkK5jVDAbSBG0GyEX03bJM",
  "access_expires_at": "2026-10-27T09:13:25.501814504Z",
  "refresh_token": "jD7oicHH7n_KuwaIZAvZKHVS3EtAfDaCpatypggPBys",
  "refresh_expires_at": "2026-11-26T08:58:25.50121098Z",
  "account_created": false
}
```

`POST /api/driver/v1/work-sessions` → **201**

```json
{
  "command_id": "e3ece550-28a9-4986-aa6c-731ae7cbcbbb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T08:58:25Z",
    "sequence": 1
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bab84ea2-9c33-4d8c-8913-eaeabfa0e896",
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
  "last_heartbeat_at": "2026-10-27T08:58:25.536417Z",
  "last_location_at": "2026-10-27T08:58:25.536417Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
      "short_number": 4,
      "pickup_at": "2026-10-27T11:58:24Z",
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

`POST /api/driver/v1/preorders/7bc01edd-e2d8-4623-ace6-998bf0195f4f/reserve` → **200**

```json
{
  "command_id": "74b04d92-ee33-4112-82ee-d38441ae0378"
}
```

```json
{
  "id": "e9ce86e2-d2d5-4add-9e3e-ac445bcf6192",
  "state": "RESERVED",
  "order": {
    "order_id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
    "short_number": 4,
    "pickup_at": "2026-10-27T11:58:24Z",
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
  "reserved_at": "2026-10-27T08:58:25.600901Z",
  "confirm_from": "2026-10-27T11:28:24Z",
  "confirm_until": "2026-10-27T11:38:24Z",
  "drop_until": "2026-10-27T10:58:24Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "e9ce86e2-d2d5-4add-9e3e-ac445bcf6192",
      "state": "RESERVED",
      "order": {
        "order_id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
        "short_number": 4,
        "pickup_at": "2026-10-27T11:58:24Z",
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
      "reserved_at": "2026-10-27T08:58:25.600901Z",
      "confirm_from": "2026-10-27T11:28:24Z",
      "confirm_until": "2026-10-27T11:38:24Z",
      "drop_until": "2026-10-27T10:58:24Z"
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
      "id": "e9ce86e2-d2d5-4add-9e3e-ac445bcf6192",
      "state": "RESERVED",
      "order": {
        "order_id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
        "short_number": 4,
        "pickup_at": "2026-10-27T11:58:24Z",
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
      "reserved_at": "2026-10-27T08:58:25.600901Z",
      "confirm_from": "2026-10-27T11:28:24Z",
      "confirm_until": "2026-10-27T11:38:24Z",
      "drop_until": "2026-10-27T10:58:24Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/e9ce86e2-d2d5-4add-9e3e-ac445bcf6192/confirm` → **409**

```json
{
  "command_id": "9fe8fbfa-e16b-46e9-9212-f83875132c79"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/e9ce86e2-d2d5-4add-9e3e-ac445bcf6192/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ddc519cb-4e8d-4e68-9bf3-66a7e65c0182"
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
  "session_id": "5b7f0184-fcb5-449c-a2cd-a3baac632f36",
  "subject": {
    "type": "STAFF",
    "id": "d3cb1330-2c5c-4236-a496-6bdcc183c49d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkM2NiMTMzMC0yYzVjLTQyMzYtYTQ5Ni02YmRjYzE4M2M0OWQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMwOTI0MDUsImlhdCI6MTc5MzA5MTUwNSwianRpIjoiM2FiZTc2ZjQtNjAyNy00NWFhLThmNjYtZDQ4NzcyMzJjOWE0Iiwic2lkIjoiNWI3ZjAxODQtZmNiNS00NDljLWEyY2QtYTNiYWFjNjMyZjM2In0.44YHtQLITzLFuqSJMmhJiH76UkI47Z5sgFbrKqN3oUY",
  "access_expires_at": "2026-10-27T09:13:25.974184137Z",
  "refresh_token": "yU3lqv460p94UL4fzJw820Hpd6yqhHDeiGKt6_3NStQ",
  "refresh_expires_at": "2026-10-27T20:58:25.973737865Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7bc01edd-e2d8-4623-ace6-998bf0195f4f` → **200**

```json
{
  "id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
  "short_number": 4,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "7f7d4afa-b733-49fa-aeec-35efb0ef60f6",
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
  "created_at": "2026-10-27T08:58:25.417481Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T11:58:24Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "e9ce86e2-d2d5-4add-9e3e-ac445bcf6192",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T08:58:25.600901Z"
  }
}
```

`GET /api/operator/v1/orders/7bc01edd-e2d8-4623-ace6-998bf0195f4f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T08:58:25.419013Z",
      "actor": {
        "type": "CLIENT",
        "id": "7f7d4afa-b733-49fa-aeec-35efb0ef60f6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
        "preorder": true,
        "quote_id": "f65473a2-61ea-4b89-a09c-6cefc9247883",
        "pickup_at": "2026-10-27T11:58:24Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T08:58:25.60199Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7bc01edd-e2d8-4623-ace6-998bf0195f4f",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "e9ce86e2-d2d5-4add-9e3e-ac445bcf6192"
      }
    }
  ]
}
```

Done: pre-order 7bc01edd-e2d8-4623-ace6-998bf0195f4f, reservation e9ce86e2-d2d5-4add-9e3e-ac445bcf6192.
