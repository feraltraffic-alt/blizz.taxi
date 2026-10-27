# Sandbox transcript (2026-10-27T19:23:04Z, 763de99)

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

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
  "correlation_id": "b4dbf0b9-fbba-4158-aada-8b1ae59135c3"
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
  "session_id": "cf7681ed-88ba-49c7-9738-2d038c66e50d",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk4ODQsImlhdCI6MTc5MzEyODk4NCwianRpIjoiODllNjFiYmItOGQwZS00MmU3LWJmZDItMGI0MWI1N2Y1ZmIxIiwic2lkIjoiY2Y3NjgxZWQtODhiYS00OWM3LTk3MzgtMmQwMzhjNjZlNTBkIn0.xjdHgQawUluCma_fZ-URi7aEktkOPRHpPQ5vT2F-Kxc",
  "access_expires_at": "2026-10-27T19:38:04.880051962Z",
  "refresh_token": "5TtVNy9odZj3sUQEcQbo7DRVinm-IPGTVmjk9pBUq8Q",
  "refresh_expires_at": "2026-10-28T07:23:04.87836185Z",
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
  "session_id": "961e7696-da12-4878-ace2-b9bad4346819",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk4ODYsImlhdCI6MTc5MzEyODk4NiwianRpIjoiNzI1MTM2NjUtMjE2NS00YzBlLWE3NjAtNjk4MDZmYWE2YWU4Iiwic2lkIjoiOTYxZTc2OTYtZGExMi00ODc4LWFjZTItYjliYWQ0MzQ2ODE5In0.qiPM2nVlLm6I1Nhfcu0BzoOizj-IyY1JCWkK_Wh4YKY",
  "access_expires_at": "2026-10-27T19:38:06.039168655Z",
  "refresh_token": "k6UDrRf7or9PZlysKGDyt47H84xGHG22TdUjzGfLQEA",
  "refresh_expires_at": "2026-10-28T07:23:06.038317992Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "134f1caf-7dc0-4c23-a535-edee65239efb",
  "reason": "Осіння акція",
  "promotion": {
    "name": "Осінь −10 %",
    "kind": "DISCOUNT",
    "value_type": "PERCENT",
    "value": 1000,
    "conditions": {
      "city_id": "5a000000-0000-4000-8000-000000000001"
    }
  }
}
```

```json
{
  "id": "d47b4105-9f53-4a69-b0d0-0e612155c494",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ACTIVE",
  "version": 1,
  "created_by": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "created_at": "2026-10-27T19:23:06.111317Z",
  "updated_at": "2026-10-27T19:23:06.111317Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631239881",
  "device_ref": "sandbox-22744"
}
```

```json
{
  "challenge_id": "3ac4e8ed-fb2e-4c80-a2a1-51f0bcd1a025",
  "expires_at": "2026-10-27T19:28:06.156301939Z",
  "resend_available_at": "2026-10-27T19:23:07.156301939Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631239881` → **200**

```json
{
  "phone": "+380631239881",
  "audience": "CLIENT",
  "code": "949591",
  "sent_at": "2026-10-27T19:23:06.164531042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3ac4e8ed-fb2e-4c80-a2a1-51f0bcd1a025",
  "code": "949591",
  "device_ref": "sandbox-22744"
}
```

```json
{
  "session_id": "63707d26-95d4-4990-87f3-8b6150eabcdd",
  "subject": {
    "type": "CLIENT",
    "id": "684ceca0-740a-418a-9a86-faafe3bd4981"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODRjZWNhMC03NDBhLTQxOGEtOWE4Ni1mYWFmZTNiZDQ5ODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5ODg2LCJpYXQiOjE3OTMxMjg5ODYsImp0aSI6IjYwZTYyNGZiLTRmYWItNDQyNi04YThlLWU1Y2FiZmFiOTBiNiIsInNpZCI6IjYzNzA3ZDI2LTk1ZDQtNDk5MC04N2YzLThiNjE1MGVhYmNkZCJ9.2WR2LkYEX4EDzIDT0FwsgEpO49ve4R8RQxbAvpO1DVw",
  "access_expires_at": "2026-10-27T19:38:06.235845594Z",
  "refresh_token": "VAiMrMBGoWDA70kmRgvUx6C4WKRfNwv14hz4PjrYDqs",
  "refresh_expires_at": "2026-11-26T19:23:06.234921898Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631239881` → **200**

```json
{
  "client_id": "684ceca0-740a-418a-9a86-faafe3bd4981"
}
```

`POST /api/admin/v1/rider-wallets/684ceca0-740a-418a-9a86-faafe3bd4981/top-ups` → **201**

```json
{
  "command_id": "b1568795-a294-47c0-9d46-7dc030065d6a",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "684ceca0-740a-418a-9a86-faafe3bd4981",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 0,
      "available_minor": 5000
    }
  ],
  "entries": [
    {
      "id": "60c7dec5-f681-4248-bc97-d03f801f1108",
      "at": "2026-10-27T19:23:06.307389Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99e86dda-d56e-43da-bcf4-721156a57cb5",
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
  "id": "9bb36fad-c9e3-4813-91ae-56e6e7d931bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:06.424802Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 1052,
  "to_pay_minor": 9465,
  "promotions": [
    {
      "id": "d47b4105-9f53-4a69-b0d0-0e612155c494",
      "name": "Осінь −10 %",
      "kind": "DISCOUNT",
      "value_type": "PERCENT",
      "value": 1000,
      "discount_minor": 1052
    }
  ]
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8680"
}
```

```json
{
  "challenge_id": "fece5481-7934-4455-af2a-60c014969a29",
  "expires_at": "2026-10-27T19:28:06.478385448Z",
  "resend_available_at": "2026-10-27T19:23:07.478385448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "385317",
  "sent_at": "2026-10-27T19:23:06.481663138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fece5481-7934-4455-af2a-60c014969a29",
  "code": "385317",
  "device_ref": "sandbox-8680"
}
```

```json
{
  "session_id": "b3ba8668-3891-449d-bf4c-cae0d93d165d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTg4NiwiaWF0IjoxNzkzMTI4OTg2LCJqdGkiOiI5MTFkMTRlNC03ZTU2LTQ5OWMtYTQzYS04OWIwMzFiYjc4MjciLCJzaWQiOiJiM2JhODY2OC0zODkxLTQ0OWQtYmY0Yy1jYWUwZDkzZDE2NWQifQ.CeVoLkk0bmht16z6Y9HE5wykphAKW2rIki9lzA2gNOc",
  "access_expires_at": "2026-10-27T19:38:06.533865173Z",
  "refresh_token": "b9fex4e77aRwrIuz4qrX30LG8GnVmMuz19wYmRYv4u8",
  "refresh_expires_at": "2026-11-26T19:23:06.533054932Z",
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
  "command_id": "e967822a-3c25-4925-8de4-ce1930be88a3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:06Z",
    "sequence": 1793128986589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71ae613f-e34f-42e8-bd29-e6f1dc739e99",
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
  "last_heartbeat_at": "2026-10-27T19:23:06.628169Z",
  "last_location_at": "2026-10-27T19:23:06.628169Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f89d2df2-9524-4045-b4de-fb032ed1fe94",
  "quote_id": "9bb36fad-c9e3-4813-91ae-56e6e7d931bb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "wallet_minor": 2000
}
```

```json
{
  "id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "684ceca0-740a-418a-9a86-faafe3bd4981",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T19:23:06.712375Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "684ceca0-740a-418a-9a86-faafe3bd4981",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 5000,
      "reserved_minor": 2000,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "60c7dec5-f681-4248-bc97-d03f801f1108",
      "at": "2026-10-27T19:23:06.307389Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
      "order_id": null
    }
  ]
}
```

## Ivan drives; he collects the price minus the discount and the bonuses

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "7149ef22-2580-400c-9202-023ec41778d6",
    "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
    "expires_at": "2026-10-27T19:23:21.725427Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/7149ef22-2580-400c-9202-023ec41778d6/accept` → **200**

```json
{
  "command_id": "72eb2c2b-1b1d-4178-924a-705b13526626"
}
```

```json
{
  "id": "7f4b4d10-08c6-43e0-a69b-15bf85dcd2ee",
  "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7661735d-0640-46d0-a104-4fa2aa8e3244",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7661735d-0640-46d0-a104-4fa2aa8e3244",
  "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
  "assignment_id": "7f4b4d10-08c6-43e0-a69b-15bf85dcd2ee",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/71ae613f-e34f-42e8-bd29-e6f1dc739e99/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:06Z",
    "sequence": 1793128986875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71ae613f-e34f-42e8-bd29-e6f1dc739e99",
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
  "last_heartbeat_at": "2026-10-27T19:23:06.896569Z",
  "last_location_at": "2026-10-27T19:23:06.896569Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7661735d-0640-46d0-a104-4fa2aa8e3244/arrive` → **200**

```json
{
  "command_id": "3d9b35b8-046a-4ccb-b1cc-625d3b95c3e3",
  "expected_version": 0
}
```

```json
{
  "id": "7661735d-0640-46d0-a104-4fa2aa8e3244",
  "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
  "assignment_id": "7f4b4d10-08c6-43e0-a69b-15bf85dcd2ee",
  "phase": "WAITING",
  "version": 1,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T19:23:06.939496Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7661735d-0640-46d0-a104-4fa2aa8e3244/start` → **200**

```json
{
  "command_id": "a5b5c7a9-f408-4f36-b602-024575b91b29",
  "expected_version": 1
}
```

```json
{
  "id": "7661735d-0640-46d0-a104-4fa2aa8e3244",
  "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
  "assignment_id": "7f4b4d10-08c6-43e0-a69b-15bf85dcd2ee",
  "phase": "IN_PROGRESS",
  "version": 2,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T19:23:06.939496Z",
  "started_at": "2026-10-27T19:23:06.983747Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/7661735d-0640-46d0-a104-4fa2aa8e3244/complete` → **200**

```json
{
  "command_id": "022bb771-b94c-4df5-9e84-7ea20d15336d",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:07Z",
  "cash_received": true
}
```

```json
{
  "id": "7661735d-0640-46d0-a104-4fa2aa8e3244",
  "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
  "assignment_id": "7f4b4d10-08c6-43e0-a69b-15bf85dcd2ee",
  "phase": "COMPLETED",
  "version": 3,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": "2026-10-27T19:23:06.939496Z",
  "started_at": "2026-10-27T19:23:06.983747Z",
  "completed_at": "2026-10-27T19:23:07.051017Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "684ceca0-740a-418a-9a86-faafe3bd4981",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 3000,
      "reserved_minor": 0,
      "available_minor": 3000
    }
  ],
  "entries": [
    {
      "id": "e4160614-573c-4503-b3f4-96178e7eee83",
      "at": "2026-10-27T19:23:08.030418Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d"
    },
    {
      "id": "60c7dec5-f681-4248-bc97-d03f801f1108",
      "at": "2026-10-27T19:23:06.307389Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/d47b4105-9f53-4a69-b0d0-0e612155c494/archive` → **200**

```json
{
  "command_id": "04e0f21e-1a21-4b30-8b8b-0fd13cb07c82",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "d47b4105-9f53-4a69-b0d0-0e612155c494",
  "name": "Осінь −10 %",
  "kind": "DISCOUNT",
  "value_type": "PERCENT",
  "value": 1000,
  "currency": null,
  "conditions": {
    "city_id": "5a000000-0000-4000-8000-000000000001",
    "vehicle_class": null,
    "every_nth_trip": null,
    "days_of_week": null,
    "time_from": null,
    "time_to": null,
    "pickup_zone_id": null,
    "dropoff_zone_id": null,
    "starts_at": null,
    "ends_at": null
  },
  "state": "ARCHIVED",
  "version": 2,
  "created_by": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "created_at": "2026-10-27T19:23:06.111317Z",
  "updated_at": "2026-10-27T19:23:10.133724Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "71ae613f-e34f-42e8-bd29-e6f1dc739e99",
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
  "last_heartbeat_at": "2026-10-27T19:23:06.896569Z",
  "last_location_at": "2026-10-27T19:23:06.896569Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71ae613f-e34f-42e8-bd29-e6f1dc739e99/close` → **200**

```json
{
  "command_id": "84207e61-3a38-4a49-bcd0-2601f3e2c922",
  "expected_version": 0
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

Done: order 1443065b-29c0-40ef-b555-8fc9ba0c638d.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635395543",
  "device_ref": "sandbox-15819"
}
```

```json
{
  "challenge_id": "bf2863dc-f4a6-42df-bfb3-a717f3187f90",
  "expires_at": "2026-10-27T19:28:10.253106279Z",
  "resend_available_at": "2026-10-27T19:23:11.253106279Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635395543` → **200**

```json
{
  "phone": "+380635395543",
  "audience": "CLIENT",
  "code": "431171",
  "sent_at": "2026-10-27T19:23:10.31482924Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf2863dc-f4a6-42df-bfb3-a717f3187f90",
  "code": "431171",
  "device_ref": "sandbox-15819"
}
```

```json
{
  "session_id": "c7eff2e3-d060-47d9-9b16-f94ef18799e4",
  "subject": {
    "type": "CLIENT",
    "id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMGRhMjE3Mi1jZWU0LTQyYWItODI2Ny1lZmEzY2EwZWE2ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5ODkwLCJpYXQiOjE3OTMxMjg5OTAsImp0aSI6Ijk4YTViYWQ3LTI5MGMtNGRhMS1iNWZiLTU1NzIxYzI0MzRjMCIsInNpZCI6ImM3ZWZmMmUzLWQwNjAtNDdkOS05YjE2LWY5NGVmMTg3OTllNCJ9.nbQuEXtdP36m7WbhRdw77S_I0X697LRfMXsnn-UH17k",
  "access_expires_at": "2026-10-27T19:38:10.397220642Z",
  "refresh_token": "qKZvN_lwvODS7FbxVPhk5BeQ4t16nyrZs6yD2qhHzWE",
  "refresh_expires_at": "2026-11-26T19:23:10.396371898Z",
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
  "device_ref": "sandbox-28162"
}
```

```json
{
  "challenge_id": "2ffe3275-7400-4a4f-b567-26a028dca6ec",
  "expires_at": "2026-10-27T19:28:10.446918136Z",
  "resend_available_at": "2026-10-27T19:23:11.446918136Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "860579",
  "sent_at": "2026-10-27T19:23:10.449895075Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2ffe3275-7400-4a4f-b567-26a028dca6ec",
  "code": "860579",
  "device_ref": "sandbox-28162"
}
```

```json
{
  "session_id": "408b47bc-30c7-4d72-a45e-30c19cce1af2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTg5MCwiaWF0IjoxNzkzMTI4OTkwLCJqdGkiOiI2MWUwNzhkMi0wNDdiLTQ3MzAtYTNhNS00NTA2MGRjNjExNWYiLCJzaWQiOiI0MDhiNDdiYy0zMGM3LTRkNzItYTQ1ZS0zMGMxOWNjZTFhZjIifQ.BHbTPb3tCgiK8QbGHOcJhXp4EMmvXgwYfAQfAAvgTkY",
  "access_expires_at": "2026-10-27T19:38:10.500814587Z",
  "refresh_token": "Z4bYTWF3k-m2grw8eV723t_Gk68GXkLoHTcHcOhZF_U",
  "refresh_expires_at": "2026-11-26T19:23:10.500149479Z",
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
  "session_id": "1926fb20-a013-47a3-8abc-8cb30b2ad121",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk4OTAsImlhdCI6MTc5MzEyODk5MCwianRpIjoiNjgwMDdjYzgtNTc5NC00NzEzLWJiOWUtY2RjYmQxOTEwNGMyIiwic2lkIjoiMTkyNmZiMjAtYTAxMy00N2EzLThhYmMtOGNiMzBiMmFkMTIxIn0.pJglIZHUKxjwDH7HXYhyeO2l4wdQ-sAFkssglXRSGFU",
  "access_expires_at": "2026-10-27T19:38:10.806970705Z",
  "refresh_token": "1q1aBhbQ6wBDbi5b0iDbCiY_QnNNWjqtTxiA9sSXV6Y",
  "refresh_expires_at": "2026-10-28T07:23:10.806371405Z",
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
  "session_id": "08a11dd8-777c-4f3f-b504-1e3000324c92",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk4OTEsImlhdCI6MTc5MzEyODk5MSwianRpIjoiNWIxMmQwYTctNjExMy00MDdkLTg4N2YtNzUxOWFhNzU4NWJiIiwic2lkIjoiMDhhMTFkZDgtNzc3Yy00ZjNmLWI1MDQtMWUzMDAwMzI0YzkyIn0.XQxtNFGYTmYreHYijhXj9S-4SC4XpiidjqKnEmnUhA4",
  "access_expires_at": "2026-10-27T19:38:11.091237804Z",
  "refresh_token": "scwYDGYDKnNbPyG8lIFqBdxNfA5rC7HVWGMIiNUiHUE",
  "refresh_expires_at": "2026-10-28T07:23:11.090529526Z",
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
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error"
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
  "command_id": "654a8bb0-5021-4bc8-8707-dcbd8a2e7b6e",
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
  "id": "f0d20e72-aa0e-446b-a4b0-0e97f82ac5dc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:28:11.149448Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dd5ec97e-3865-437a-94f6-2400c38d50dd",
  "quote_id": "f0d20e72-aa0e-446b-a4b0-0e97f82ac5dc",
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
  "id": "f57d548a-2820-473f-80eb-cf1f558c63fc",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3",
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
  "created_at": "2026-10-27T19:23:11.186919Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/f57d548a-2820-473f-80eb-cf1f558c63fc` → **200**

```json
{
  "id": "f57d548a-2820-473f-80eb-cf1f558c63fc",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3",
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
  "created_at": "2026-10-27T19:23:11.186919Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/f57d548a-2820-473f-80eb-cf1f558c63fc/cancel` → **200**

```json
{
  "command_id": "a970fd2d-51f2-4761-b53b-8997fdb6bced",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f57d548a-2820-473f-80eb-cf1f558c63fc",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3",
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
  "created_at": "2026-10-27T19:23:11.186919Z",
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
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
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
  "command_id": "f24336de-f5d3-4f77-b7aa-066467d352db",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:11Z",
    "sequence": 1793128991310
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
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
  "last_heartbeat_at": "2026-10-27T19:23:11.327148Z",
  "last_location_at": "2026-10-27T19:23:11.327148Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6649"
}
```

```json
{
  "challenge_id": "6b65bd36-3ace-4282-b578-11bedcc6ef43",
  "expires_at": "2026-10-27T19:28:11.35404666Z",
  "resend_available_at": "2026-10-27T19:23:12.35404666Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "648799",
  "sent_at": "2026-10-27T19:23:11.357219098Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6b65bd36-3ace-4282-b578-11bedcc6ef43",
  "code": "648799",
  "device_ref": "sandbox-6649"
}
```

```json
{
  "session_id": "1f8a5604-42ed-4b57-b824-38b80216e072",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTg5MSwiaWF0IjoxNzkzMTI4OTkxLCJqdGkiOiJiZTRjYjA4Mi02NjhkLTRiMGMtYTNkMi1jYTQ2YTZkMzhjNGUiLCJzaWQiOiIxZjhhNTYwNC00MmVkLTRiNTctYjgyNC0zOGI4MDIxNmUwNzIifQ.jpMILeZhQAAXyHwYk2bNhhLrogNGwYaox7rMvxxHvr0",
  "access_expires_at": "2026-10-27T19:38:11.407853633Z",
  "refresh_token": "5tXRbiXVoeg0qReJXb_7MZN_1JtpbWDkvidYjVe5RxQ",
  "refresh_expires_at": "2026-11-26T19:23:11.407339261Z",
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
  "command_id": "2a1d32a9-efb2-4366-ba32-bbc06f78b645",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:11Z",
    "sequence": 1793128991453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e2196eb-49c5-44b3-bf7a-9294e7653cbc",
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
  "last_heartbeat_at": "2026-10-27T19:23:11.469991Z",
  "last_location_at": "2026-10-27T19:23:11.469991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3970850c-a61c-4ef3-aff0-91d782eb3b2d",
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
  "id": "c6d2df9f-cbed-47f8-94d4-67cac2e9dfdb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "expires_at": "2026-10-27T19:28:11.504844Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 30533,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "07966652-1f32-4a05-8096-4f833cdf37d0",
  "quote_id": "c6d2df9f-cbed-47f8-94d4-67cac2e9dfdb",
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
  "id": "7679780c-fad1-417f-91c2-9642a256a883",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3",
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
  "created_at": "2026-10-27T19:23:11.539291Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "65ea2a64-82d1-48a3-9591-038bd55740b1",
    "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
    "expires_at": "2026-10-27T19:23:26.542984Z",
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

`POST /api/driver/v1/offers/65ea2a64-82d1-48a3-9591-038bd55740b1/accept` → **200**

```json
{
  "command_id": "9ff679f2-cc09-4882-88e5-975128b35ce6"
}
```

```json
{
  "id": "c727072a-35e8-4b68-83f0-1dc12772abe3",
  "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0fd24af8-8233-449d-bdf8-dcc8fdad4a0a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0fd24af8-8233-449d-bdf8-dcc8fdad4a0a",
  "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
  "assignment_id": "c727072a-35e8-4b68-83f0-1dc12772abe3",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0fd24af8-8233-449d-bdf8-dcc8fdad4a0a/cancel` → **200**

```json
{
  "command_id": "40ef121b-d8a7-468b-9963-ae4df89dc6b7",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "0fd24af8-8233-449d-bdf8-dcc8fdad4a0a",
  "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
  "assignment_id": "c727072a-35e8-4b68-83f0-1dc12772abe3",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/7679780c-fad1-417f-91c2-9642a256a883` → **200**

```json
{
  "id": "7679780c-fad1-417f-91c2-9642a256a883",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3",
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
    "id": "c727072a-35e8-4b68-83f0-1dc12772abe3",
    "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "0fd24af8-8233-449d-bdf8-dcc8fdad4a0a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:23:11.539291Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bbfd07a0-6c58-44e0-99ac-e4dd6b4eae02",
    "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
    "expires_at": "2026-10-27T19:23:26.67022Z",
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

`POST /api/driver/v1/offers/bbfd07a0-6c58-44e0-99ac-e4dd6b4eae02/accept` → **200**

```json
{
  "command_id": "1063d529-c64e-4bfa-9f3a-73b76adb39c1"
}
```

```json
{
  "id": "6c5fa3fd-bcf8-4af9-8320-b9692a7598ac",
  "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b542c31-2e16-4621-a24b-61f659694b66",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b542c31-2e16-4621-a24b-61f659694b66",
  "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
  "assignment_id": "6c5fa3fd-bcf8-4af9-8320-b9692a7598ac",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/1b542c31-2e16-4621-a24b-61f659694b66/cancel` → **200**

```json
{
  "command_id": "da7c7e4c-b2d8-4cf3-b348-5dcfb666ca7f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1b542c31-2e16-4621-a24b-61f659694b66",
  "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
  "assignment_id": "6c5fa3fd-bcf8-4af9-8320-b9692a7598ac",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The rider sees who cancelled; the operator sees the whole history

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "7679780c-fad1-417f-91c2-9642a256a883",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:23:11.539291Z",
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
    "id": "f57d548a-2820-473f-80eb-cf1f558c63fc",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:23:11.186919Z",
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

`GET /api/operator/v1/orders/7679780c-fad1-417f-91c2-9642a256a883/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:23:11.5399Z",
      "actor": {
        "type": "CLIENT",
        "id": "00da2172-cee4-42ab-8267-efa3ca0ea6e3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
        "quote_id": "c6d2df9f-cbed-47f8-94d4-67cac2e9dfdb",
        "price_minor": 30533,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:23:11.54195Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
        "attempt_id": "634cc842-96f1-4d97-8757-79f3c9d9705d",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:23:11.547441Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65ea2a64-82d1-48a3-9591-038bd55740b1",
        "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:23:11.602308Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "65ea2a64-82d1-48a3-9591-038bd55740b1",
        "order_id": "7679780c-fad1-417f-91c2-9642a256a883",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "c727072a-35e8-4b68-83f0-1dc12772abe3"
      }
    },
    {
      "sequence": 4,
      "type": "AssignmentWithdrawn",
```

Done: orders f57d548a-2820-473f-80eb-cf1f558c63fc, 7679780c-fad1-417f-91c2-9642a256a883.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738748381",
  "device_ref": "sandbox-31311"
}
```

```json
{
  "challenge_id": "9459a107-76c2-411f-9f4a-fe8a9e46fce2",
  "expires_at": "2026-10-27T19:28:11.907629864Z",
  "resend_available_at": "2026-10-27T19:23:12.907629864Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738748381` → **200**

```json
{
  "phone": "+380738748381",
  "audience": "CLIENT",
  "code": "827599",
  "sent_at": "2026-10-27T19:23:11.910142446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9459a107-76c2-411f-9f4a-fe8a9e46fce2",
  "code": "827599",
  "device_ref": "sandbox-31311"
}
```

```json
{
  "session_id": "3200826a-0e9c-49f8-9289-d8d9c5bb4c44",
  "subject": {
    "type": "CLIENT",
    "id": "7abccf88-8d64-4de0-8dac-875116eb6529"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YWJjY2Y4OC04ZDY0LTRkZTAtOGRhYy04NzUxMTZlYjY1MjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5ODkxLCJpYXQiOjE3OTMxMjg5OTEsImp0aSI6IjNjZjQ5NmI0LWJiMWItNGY4Yi05NjI0LTRjNDQxYmQxOWJjNSIsInNpZCI6IjMyMDA4MjZhLTBlOWMtNDlmOC05Mjg5LWQ4ZDljNWJiNGM0NCJ9.FPohxG1KMIg9aJNls2EfHDng4Cq3MJ08OgZSEgrzOBM",
  "access_expires_at": "2026-10-27T19:38:11.964111722Z",
  "refresh_token": "OdbdX36TXjRqcdfqkgQIkMJULLZz6tuQlXntMWn_s7I",
  "refresh_expires_at": "2026-11-26T19:23:11.963467505Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "290e2518-1cbe-4db5-b9fc-12e97cd2706f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "72060a86-ca0c-43d2-8cae-55f6ad68bd3c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-72060a86-ca0c-43d2-8cae-55f6ad68bd3c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f84b7e3265a62d3b69800da7589a2c32",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=72060a86-ca0c-43d2-8cae-55f6ad68bd3c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738748381"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=72060a86-ca0c-43d2-8cae-55f6ad68bd3c",
  "expires_at": "2026-10-27T19:53:11.998271Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/72060a86-ca0c-43d2-8cae-55f6ad68bd3c` → **200**

```json
{
  "id": "72060a86-ca0c-43d2-8cae-55f6ad68bd3c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-27T19:53:11.998271Z",
  "card": {
    "id": "caa2b7ff-9fda-4e9a-b6fe-74dbc453e367",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****7409",
    "card_type": "Visa",
    "created_at": "2026-10-27T19:23:12.045317Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "caa2b7ff-9fda-4e9a-b6fe-74dbc453e367",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****7409",
      "card_type": "Visa",
      "created_at": "2026-10-27T19:23:12.045317Z"
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
  "device_ref": "sandbox-28583"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "964da46e-8852-4836-804c-1365f958dcfd",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28583"
}
```

```json
{
  "challenge_id": "6fcf2c6d-3ea0-4a20-ab02-d2f5df00710e",
  "expires_at": "2026-10-27T19:28:13.155150435Z",
  "resend_available_at": "2026-10-27T19:23:14.155150435Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "141403",
  "sent_at": "2026-10-27T19:23:13.157415305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6fcf2c6d-3ea0-4a20-ab02-d2f5df00710e",
  "code": "141403",
  "device_ref": "sandbox-28583"
}
```

```json
{
  "session_id": "a2fd6519-a8c6-49a7-a2af-e93a3c2afaea",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTg5MywiaWF0IjoxNzkzMTI4OTkzLCJqdGkiOiJjMTU5MzJlNi02NjcwLTRmMGYtYjlhNC02NWViNzUyMTZkNGMiLCJzaWQiOiJhMmZkNjUxOS1hOGM2LTQ5YTctYTJhZi1lOTNhM2MyYWZhZWEifQ.9q16_CvNLJVmcUFWO_m-4VDvJXMyneyN5cgxoGfZkZA",
  "access_expires_at": "2026-10-27T19:38:13.205211124Z",
  "refresh_token": "b2hl72rveyHUe5WHdXCXKeCXA7ew_qnA2rP7GDjpRIY",
  "refresh_expires_at": "2026-11-26T19:23:13.204745865Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e2196eb-49c5-44b3-bf7a-9294e7653cbc",
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
  "last_heartbeat_at": "2026-10-27T19:23:11.469991Z",
  "last_location_at": "2026-10-27T19:23:11.469991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e2196eb-49c5-44b3-bf7a-9294e7653cbc/handover` → **200**

```json
{
  "command_id": "ab38f705-b511-429f-87a9-81dcb787f4f8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e2196eb-49c5-44b3-bf7a-9294e7653cbc",
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
  "last_heartbeat_at": "2026-10-27T19:23:11.469991Z",
  "last_location_at": "2026-10-27T19:23:11.469991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e2196eb-49c5-44b3-bf7a-9294e7653cbc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:13Z",
    "sequence": 1793128993284
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e2196eb-49c5-44b3-bf7a-9294e7653cbc",
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
  "last_heartbeat_at": "2026-10-27T19:23:13.301638Z",
  "last_location_at": "2026-10-27T19:23:13.301638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a0c7df18-1699-46f7-8558-df38c23d0aa2",
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
  "id": "ae0733eb-168d-4189-a248-9e863ae48d7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "expires_at": "2026-10-27T19:28:13.335194Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 16297,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "1acf18da-a5fc-4de1-a3f6-d201246f971f",
  "quote_id": "ae0733eb-168d-4189-a248-9e863ae48d7b",
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
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e` → **200**

```json
{
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e` → **200**

```json
{
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "0b601c4b-2c4e-4533-bcf4-1bffe1338ea9",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "expires_at": "2026-10-27T19:23:29.119294Z",
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

`POST /api/driver/v1/offers/0b601c4b-2c4e-4533-bcf4-1bffe1338ea9/accept` → **200**

```json
{
  "command_id": "b497e0f9-a8b8-4b07-8e8d-d6e9ed5af6ed"
}
```

```json
{
  "id": "89997949-ca45-413a-8605-8aedff6638e5",
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "assignment_id": "89997949-ca45-413a-8605-8aedff6638e5",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7e2196eb-49c5-44b3-bf7a-9294e7653cbc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:14Z",
    "sequence": 1793128994525
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e2196eb-49c5-44b3-bf7a-9294e7653cbc",
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
  "last_heartbeat_at": "2026-10-27T19:23:14.542516Z",
  "last_location_at": "2026-10-27T19:23:14.542516Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2eb810cc-888c-4b7f-ad52-d962f50233b9/arrive` → **200**

```json
{
  "command_id": "09f48872-28af-4daa-a632-43da941f3d7d",
  "expected_version": 0
}
```

```json
{
  "id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "assignment_id": "89997949-ca45-413a-8605-8aedff6638e5",
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
  "arrived_at": "2026-10-27T19:23:14.575218Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2eb810cc-888c-4b7f-ad52-d962f50233b9/start` → **200**

```json
{
  "command_id": "370e6ecb-c806-475f-9592-e303c74165dd",
  "expected_version": 1
}
```

```json
{
  "id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "assignment_id": "89997949-ca45-413a-8605-8aedff6638e5",
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
  "arrived_at": "2026-10-27T19:23:14.575218Z",
  "started_at": "2026-10-27T19:23:14.611458Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2eb810cc-888c-4b7f-ad52-d962f50233b9/complete` → **200**

```json
{
  "command_id": "b2e560f0-0fd6-4b55-b2e1-4ca858f3fccf",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:14Z"
}
```

```json
{
  "id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "assignment_id": "89997949-ca45-413a-8605-8aedff6638e5",
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
  "arrived_at": "2026-10-27T19:23:14.575218Z",
  "started_at": "2026-10-27T19:23:14.611458Z",
  "completed_at": "2026-10-27T19:23:14.653332Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e` → **200**

```json
{
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
    "id": "89997949-ca45-413a-8605-8aedff6638e5",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e` → **200**

```json
{
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
    "id": "89997949-ca45-413a-8605-8aedff6638e5",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e` → **200**

```json
{
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
    "id": "89997949-ca45-413a-8605-8aedff6638e5",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e` → **200**

```json
{
  "id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "7abccf88-8d64-4de0-8dac-875116eb6529",
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
    "id": "89997949-ca45-413a-8605-8aedff6638e5",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "2eb810cc-888c-4b7f-ad52-d962f50233b9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:23:13.370707Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
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

## The rider tips 15 % on the same card; all of it goes to Andrii

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "d5f26a7b-386f-4ddc-a512-42293aca67d7",
      "at": "2026-10-27T19:23:15.15345Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e/tip` → **200**

```json
{
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-28T19:23:14.653332Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e/tip` → **201**

```json
{
  "command_id": "5e14b93a-80a1-4bf4-860d-0a7e693670dc",
  "amount_minor": 2500
}
```

```json
{
  "id": "ed0559bc-9383-455f-8657-2d204fa8e649",
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-27T19:23:17.874102Z"
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e/tip` → **200**

```json
{
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-28T19:23:14.653332Z",
  "open": false,
  "tip": {
    "id": "ed0559bc-9383-455f-8657-2d204fa8e649",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-27T19:23:17.874102Z"
  }
}
```

`GET /api/rider/v1/orders/e875aa65-991f-468c-bcd8-a5b8aa16dd9e/tip` → **200**

```json
{
  "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
  "currency": "UAH",
  "trip_cost_minor": 16297,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1700
    },
    {
      "percent": 15,
      "amount_minor": 2500
    },
    {
      "percent": 20,
      "amount_minor": 3300
    },
    {
      "percent": 25,
      "amount_minor": 4100
    }
  ],
  "min_minor": 100,
  "max_minor": 16300,
  "method": "CARD",
  "available_until": "2026-10-28T19:23:14.653332Z",
  "open": false,
  "tip": {
    "id": "ed0559bc-9383-455f-8657-2d204fa8e649",
    "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-27T19:23:17.874102Z"
  }
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 13852
    }
  ],
  "entries": [
    {
      "id": "d5f26a7b-386f-4ddc-a512-42293aca67d7",
      "at": "2026-10-27T19:23:15.15345Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "6c6b2e18-b4bc-4bd1-ba83-043e8b8dce11",
      "at": "2026-10-27T19:23:19.197571Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
      "counterpart_id": null
    },
    {
      "id": "d5f26a7b-386f-4ddc-a512-42293aca67d7",
      "at": "2026-10-27T19:23:15.15345Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "e875aa65-991f-468c-bcd8-a5b8aa16dd9e",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "7e2196eb-49c5-44b3-bf7a-9294e7653cbc",
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
  "last_heartbeat_at": "2026-10-27T19:23:14.542516Z",
  "last_location_at": "2026-10-27T19:23:14.542516Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7e2196eb-49c5-44b3-bf7a-9294e7653cbc/close` → **200**

```json
{
  "command_id": "3ef1e603-2615-458b-8ea5-8cf949110d3e",
  "expected_version": 1
}
```

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

Done: card order e875aa65-991f-468c-bcd8-a5b8aa16dd9e.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733320076",
  "device_ref": "sandbox-7648"
}
```

```json
{
  "challenge_id": "b104b2cc-b521-4fe7-af27-359c9de0ae51",
  "expires_at": "2026-10-27T19:28:20.064175107Z",
  "resend_available_at": "2026-10-27T19:23:21.064175107Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380733320076` → **200**

```json
{
  "phone": "+380733320076",
  "audience": "CLIENT",
  "code": "498410",
  "sent_at": "2026-10-27T19:23:20.066552826Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b104b2cc-b521-4fe7-af27-359c9de0ae51",
  "code": "498410",
  "device_ref": "sandbox-7648"
}
```

```json
{
  "session_id": "ef32398c-47c8-40dd-8e31-72a8ca588407",
  "subject": {
    "type": "CLIENT",
    "id": "23845318-be6a-45ce-a0c9-afcf0fed0658"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMzg0NTMxOC1iZTZhLTQ1Y2UtYTBjOS1hZmNmMGZlZDA2NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTAwLCJpYXQiOjE3OTMxMjkwMDAsImp0aSI6IjMwNGUwN2NmLTZiNWUtNDJiNi1hNmI2LTBlNTM0MmY5YTYzNyIsInNpZCI6ImVmMzIzOThjLTQ3YzgtNDBkZC04ZTMxLTcyYThjYTU4ODQwNyJ9.IFa3fHHVu0l1LHNbtC8Frqpb4-IDGRN3lQ9M4wj_f-Y",
  "access_expires_at": "2026-10-27T19:38:20.116995857Z",
  "refresh_token": "uUiN0uHjdt2sbYd6aaICBdyCFYEULBMwt_SlksWafFo",
  "refresh_expires_at": "2026-11-26T19:23:20.116521765Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "a787ee35-ead7-4218-9265-f48c331719ff",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "8e454d1b-b27e-49ea-a22b-6e27d6503efb",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8e454d1b-b27e-49ea-a22b-6e27d6503efb",
    "orderDate": "1793129000",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f8d2ee8f19298d797b101f78c3e03471",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8e454d1b-b27e-49ea-a22b-6e27d6503efb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733320076"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8e454d1b-b27e-49ea-a22b-6e27d6503efb",
  "created_at": "2026-10-27T19:23:20.14957Z",
  "expires_at": "2026-10-27T19:53:20.14957Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/8e454d1b-b27e-49ea-a22b-6e27d6503efb` → **200**

```json
{
  "id": "8e454d1b-b27e-49ea-a22b-6e27d6503efb",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:23:20.14957Z",
  "expires_at": "2026-10-27T19:53:20.14957Z",
  "completed_at": "2026-10-27T19:23:20.183499Z",
  "masked_pan": "41****4157",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "23845318-be6a-45ce-a0c9-afcf0fed0658",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "5d625551-eec2-4a7d-9002-c6d504c82b02",
      "at": "2026-10-27T19:23:20.220318Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "23845318-be6a-45ce-a0c9-afcf0fed0658",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 15000,
      "reserved_minor": 0,
      "available_minor": 15000
    }
  ],
  "entries": [
    {
      "id": "5d625551-eec2-4a7d-9002-c6d504c82b02",
      "at": "2026-10-27T19:23:20.220318Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 15000,
      "reason": "Top-up by card",
      "staff_id": null,
      "order_id": null
    }
  ]
}
```

## The driver tops up the balance by 500.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-10680"
}
```

```json
{
  "challenge_id": "5a3d0068-b10d-4b32-b11b-8aaab479595f",
  "expires_at": "2026-10-27T19:28:20.291214139Z",
  "resend_available_at": "2026-10-27T19:23:21.291214139Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "351284",
  "sent_at": "2026-10-27T19:23:20.294084648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a3d0068-b10d-4b32-b11b-8aaab479595f",
  "code": "351284",
  "device_ref": "sandbox-10680"
}
```

```json
{
  "session_id": "b8f54bb4-9926-4bcf-8765-02d176750456",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkwMCwiaWF0IjoxNzkzMTI5MDAwLCJqdGkiOiJhMzk4ZGZmNS05YzQ4LTRjMTAtOGQ5Yi1lZWQ4N2M1ZGY0YjciLCJzaWQiOiJiOGY1NGJiNC05OTI2LTRiY2YtODc2NS0wMmQxNzY3NTA0NTYifQ.De7oJ5eUqk1LWyVDLA-iuxrlQJijwRbtINYZfW6EEh0",
  "access_expires_at": "2026-10-27T19:38:20.34371498Z",
  "refresh_token": "B5zO1SjFl5O_gmDcwblGC--ik4BWyfPsqazokWH6vG4",
  "refresh_expires_at": "2026-11-26T19:23:20.343151744Z",
  "account_created": false
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`POST /api/driver/v1/balance/card-top-ups` → **201**

```json
{
  "command_id": "eec91f00-357e-486d-a64d-0e8a015bb4cb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "e14593c6-1fde-47df-8a13-365d0f2c2d2f",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-e14593c6-1fde-47df-8a13-365d0f2c2d2f",
    "orderDate": "1793129000",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "91980f9703730c9d3fa8f29833ce2f40",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=e14593c6-1fde-47df-8a13-365d0f2c2d2f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=e14593c6-1fde-47df-8a13-365d0f2c2d2f",
  "created_at": "2026-10-27T19:23:20.393806Z",
  "expires_at": "2026-10-27T19:53:20.393806Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/e14593c6-1fde-47df-8a13-365d0f2c2d2f` → **200**

```json
{
  "id": "e14593c6-1fde-47df-8a13-365d0f2c2d2f",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-27T19:23:20.393806Z",
  "expires_at": "2026-10-27T19:53:20.393806Z",
  "completed_at": "2026-10-27T19:23:20.422552Z",
  "masked_pan": "41****1370",
  "failure_reason": null
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [],
  "entries": []
}
```

`GET /api/driver/v1/balance/history` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 50000
    }
  ],
  "entries": [
    {
      "id": "26067524-f445-4528-9a17-fc50fd879b98",
      "at": "2026-10-27T19:23:21.226193Z",
      "kind": "CARD_TOP_UP",
      "currency": "UAH",
      "amount_minor": 50000,
      "reason": "Top-up by card",
      "order_id": null,
      "counterpart_id": null
    }
  ]
}
```

## A rider's token does not open the driver's path

`POST /api/driver/v1/balance/card-top-ups` → **401**

```json
{
  "command_id": "18e8d1b0-1d65-486a-b74a-c41f16615aaf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "instance": "/api/driver/v1/balance/card-top-ups",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "f37874b5-ba51-469a-8ea8-303e1ea63eb9"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673180951",
  "device_ref": "sandbox-1488"
}
```

```json
{
  "challenge_id": "4c59fb59-c065-4fca-9577-5db062a8009d",
  "expires_at": "2026-10-27T19:28:21.550382357Z",
  "resend_available_at": "2026-10-27T19:23:22.550382357Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673180951` → **200**

```json
{
  "phone": "+380673180951",
  "audience": "CLIENT",
  "code": "646175",
  "sent_at": "2026-10-27T19:23:21.552534022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c59fb59-c065-4fca-9577-5db062a8009d",
  "code": "646175",
  "device_ref": "sandbox-1488"
}
```

```json
{
  "session_id": "2436e0a8-5232-4fc1-8837-a2b3205b54b8",
  "subject": {
    "type": "CLIENT",
    "id": "86c26fcc-ca76-4018-ac8b-9ffdcefe26d6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmMyNmZjYy1jYTc2LTQwMTgtYWM4Yi05ZmZkY2VmZTI2ZDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTAxLCJpYXQiOjE3OTMxMjkwMDEsImp0aSI6Ijg2MTljMDM1LTVkMTUtNDQxNS04ODZlLTJiYzMzNDM3OGMzZCIsInNpZCI6IjI0MzZlMGE4LTUyMzItNGZjMS04ODM3LWEyYjMyMDViNTRiOCJ9.c2nPe59Td5mg-pikbE6Km-PqD0--tWUbX8YX_uVf0BE",
  "access_expires_at": "2026-10-27T19:38:21.602056161Z",
  "refresh_token": "hFXJAFBVfh6cIVDl11UkmpMqCMzItPBmCBAF1fGSReA",
  "refresh_expires_at": "2026-11-26T19:23:21.601579455Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "86c26fcc-ca76-4018-ac8b-9ffdcefe26d6",
  "session_id": "2436e0a8-5232-4fc1-8837-a2b3205b54b8",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "acd0cbe3-c3f7-4d4a-b3d7-ab6ceb8043b0",
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
  "id": "150d1e64-73a3-4daf-be3c-164d38c5341c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:21.657063Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

## Step one: a code to confirm the deletion (a sign-in code would not do)

`POST /api/rider/v1/me/deletion-request/challenge` → **201**

```json
{
  "challenge_id": "b20a3642-a3c7-472e-baef-d75da216e3cb",
  "expires_at": "2026-10-27T19:28:23.693277555Z",
  "resend_available_at": "2026-10-27T19:23:24.693277555Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673180951` → **200**

```json
{
  "phone": "+380673180951",
  "audience": "CLIENT",
  "code": "823626",
  "sent_at": "2026-10-27T19:23:23.695636576Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "a4bb171e-8959-4e1e-8d4f-1657555ccab4",
  "challenge_id": "b20a3642-a3c7-472e-baef-d75da216e3cb",
  "otp_code": "823626"
}
```

```json
{
  "client_id": "86c26fcc-ca76-4018-ac8b-9ffdcefe26d6",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-27T19:23:23.756033604Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f3633aa0-948c-4c48-b19b-35be9fcdbfc2",
  "quote_id": "150d1e64-73a3-4daf-be3c-164d38c5341c",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Account not active",
  "type": "https://errors.blizz.taxi/account-not-active",
  "code": "ACCOUNT_NOT_ACTIVE",
  "correlation_id": "2dbe5def-df70-471d-9763-539159027be2"
}
```

## Staff see the request with nothing blocking it and complete it

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
  "session_id": "aee7b629-7801-4536-b40c-2332733b24a3",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MDQsImlhdCI6MTc5MzEyOTAwNCwianRpIjoiZDViZjM5MzEtN2YyOS00YWVjLTg4YTQtYmQwYjY5YmUyY2YxIiwic2lkIjoiYWVlN2I2MjktNzgwMS00NTM2LWI0MGMtMjMzMjczM2IyNGEzIn0.dt6lAK_wo9uB3n8fRNsoFNgiPwy4UHibBypyBs3rpcU",
  "access_expires_at": "2026-10-27T19:38:24.082106805Z",
  "refresh_token": "ScNsQW7S5LsE7bl7TeFx3eLWUoMy_ut2H-I4MGiJ9tc",
  "refresh_expires_at": "2026-10-28T07:23:24.081524645Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "86c26fcc-ca76-4018-ac8b-9ffdcefe26d6",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-27T19:23:23.756034Z",
      "blockers": {
        "active_order_id": null,
        "debt": [],
        "open_support_cases": 0,
        "bonuses_to_burn": [],
        "blocked": false
      }
    }
  ]
}
```

`POST /api/admin/v1/client-deletions/86c26fcc-ca76-4018-ac8b-9ffdcefe26d6/complete` → **200**

```json
{
  "command_id": "cb39e54d-3b78-471f-8cb5-5be40472e73b",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "86c26fcc-ca76-4018-ac8b-9ffdcefe26d6",
  "account_state": "ANONYMIZED"
}
```

## The old token no longer works

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "eba27186-d32c-4c44-912d-adc210b6d75c"
}
```

Done: client 86c26fcc-ca76-4018-ac8b-9ffdcefe26d6 anonymized.

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
  "device_ref": "sandbox-15713"
}
```

```json
{
  "challenge_id": "942f2329-5960-404b-80aa-c68206febf6f",
  "expires_at": "2026-10-27T19:28:24.240679846Z",
  "resend_available_at": "2026-10-27T19:23:25.240679846Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "667641",
  "sent_at": "2026-10-27T19:23:24.24300695Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "942f2329-5960-404b-80aa-c68206febf6f",
  "code": "667641",
  "device_ref": "sandbox-15713"
}
```

```json
{
  "session_id": "3978612f-9790-4085-9852-fad55ae675b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkwNCwiaWF0IjoxNzkzMTI5MDA0LCJqdGkiOiIyZDkzYzc1NC01ZDUzLTQyOTItYmY0ZS1hZWJjMWM2M2Q4NjciLCJzaWQiOiIzOTc4NjEyZi05NzkwLTQwODUtOTg1Mi1mYWQ1NWFlNjc1YjUifQ.ptx4eWoZqRdA6hO-6wkuQ39PawktfcUMuszvpR05x78",
  "access_expires_at": "2026-10-27T19:38:24.294681495Z",
  "refresh_token": "wmtViQ0NaAUmkwVWjb4zuAMEQ8nhvAzeqhlwsoQFsqA",
  "refresh_expires_at": "2026-11-26T19:23:24.294188755Z",
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
  "command_id": "fb3b4e37-d655-4d75-adf5-d40973da92e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:24Z",
    "sequence": 1793129004340
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:24.356006Z",
  "last_location_at": "2026-10-27T19:23:24.356006Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670677789",
  "device_ref": "sandbox-26080"
}
```

```json
{
  "challenge_id": "868dc322-8ed1-4f13-895f-27e76fd274c3",
  "expires_at": "2026-10-27T19:28:24.384655521Z",
  "resend_available_at": "2026-10-27T19:23:25.384655521Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670677789` → **200**

```json
{
  "phone": "+380670677789",
  "audience": "CLIENT",
  "code": "558123",
  "sent_at": "2026-10-27T19:23:24.386657126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "868dc322-8ed1-4f13-895f-27e76fd274c3",
  "code": "558123",
  "device_ref": "sandbox-26080"
}
```

```json
{
  "session_id": "2bbe9bee-58ff-4528-b3c4-d25d66ad7e9c",
  "subject": {
    "type": "CLIENT",
    "id": "5f0bbf23-1551-4815-a82d-1893ad3e3498"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZjBiYmYyMy0xNTUxLTQ4MTUtYTgyZC0xODkzYWQzZTM0OTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTA0LCJpYXQiOjE3OTMxMjkwMDQsImp0aSI6IjE1NmRjOTdlLTYwMDgtNDg4My1hNjc0LWNkMmI5NjMzNTU3NSIsInNpZCI6IjJiYmU5YmVlLTU4ZmYtNDUyOC1iM2M0LWQyNWQ2NmFkN2U5YyJ9.IR1EfM6MsNzarpbBi2pBpOjl5nL7Ed3_6504gEl0NgY",
  "access_expires_at": "2026-10-27T19:38:24.437953243Z",
  "refresh_token": "8sZZFsI67pTz-NTbH1wrQxlh7aLEvu2Y1Wy8rECLUuo",
  "refresh_expires_at": "2026-11-26T19:23:24.437490122Z",
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
  "command_id": "774b4777-0fa3-4c6b-be51-dad8741aba67",
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
  "id": "7a3b222d-60bf-4dc8-b0bf-5f7e30d99162",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:24.495357Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

## Both phones register for pushes (the sandbox only records them: /sandbox/v1/pushes)

`POST /api/driver/v1/push-devices` → **201**

```json
{
  "command_id": "6541256b-f124-40c5-bf3c-c4e92b06f7e0",
  "platform": "ANDROID",
  "token": "sandbox-driver-ac86d891-28a8-466f-8682-37277bdd7ab3"
}
```

```json
{
  "id": "cc419b1c-5219-47bb-947b-bb7775a6f7f6",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:23:24.534351Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "f3758ca2-4a36-4c9f-abde-c8cc56361902",
  "platform": "ANDROID",
  "token": "sandbox-rider-cb65c7e5-20df-410d-922e-bfadc44d7d63"
}
```

```json
{
  "id": "92406760-d3f5-4685-80a6-6dc687461490",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-27T19:23:24.566382Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b72842f6-7d09-4cec-b301-7c225b0a02af",
  "quote_id": "7a3b222d-60bf-4dc8-b0bf-5f7e30d99162",
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
  "id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5f0bbf23-1551-4815-a82d-1893ad3e3498",
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
  "created_at": "2026-10-27T19:23:24.60484Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "491c3070-bd6b-451c-b0b7-da527421176b",
    "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
    "expires_at": "2026-10-27T19:23:39.608456Z",
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

`POST /api/driver/v1/offers/491c3070-bd6b-451c-b0b7-da527421176b/accept` → **200**

```json
{
  "command_id": "c2c5a242-088e-4b9e-992c-68a71c5c790f"
}
```

```json
{
  "id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:23:24.584Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:23:24.584Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-27T19:23:24.584Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:23:26.093244487Z",
    "token_suffix": "dd7ab3",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "263197c3-685c-4b0b-aea5-b5518ee37c0f",
      "order_version": "2",
      "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380670677789&after=2026-10-27T19:23:24.584Z` → **200**

```json
[
  {
    "at": "2026-10-27T19:23:26.171432818Z",
    "token_suffix": "4d7d63",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "c980aa04-ae22-437c-b369-a3ccf41a08ab",
      "order_version": "3",
      "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf/messages` → **201**

```json
{
  "command_id": "6a7c55a3-93b3-4338-bef3-caaee8e9dbe2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "12ac1aee-6c21-483f-a19e-a49986c57926",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-27T19:23:26.800190375Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "assignment_id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bc24bdda-b81a-4b56-9244-87c046bd65ce/messages` → **201**

```json
{
  "command_id": "e29d653a-f3bc-4c97-8598-dc19b3ad3226",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "4cab8f50-4b6f-4f10-a495-5c891e39c56f",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-27T19:23:26.849721522Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/bc24bdda-b81a-4b56-9244-87c046bd65ce/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380670677789"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:26Z",
    "sequence": 1793129006915
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:26.933017Z",
  "last_location_at": "2026-10-27T19:23:26.933017Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "assignment_id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bc24bdda-b81a-4b56-9244-87c046bd65ce/arrive` → **200**

```json
{
  "command_id": "b3921d95-03c5-4302-a710-4f01204eb77c",
  "expected_version": 0
}
```

```json
{
  "id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "assignment_id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
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
  "arrived_at": "2026-10-27T19:23:26.9801Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bc24bdda-b81a-4b56-9244-87c046bd65ce/start` → **200**

```json
{
  "command_id": "a37a7ee9-a77d-4492-a41e-f9c1d7389f29",
  "expected_version": 1
}
```

```json
{
  "id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "assignment_id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
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
  "arrived_at": "2026-10-27T19:23:26.9801Z",
  "started_at": "2026-10-27T19:23:27.011079Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:27Z",
    "sequence": 1793129007321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:27.049415Z",
  "last_location_at": "2026-10-27T19:23:27.049415Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/bc24bdda-b81a-4b56-9244-87c046bd65ce/complete` → **200**

```json
{
  "command_id": "3bf1b7f4-fef3-4e79-a431-0a4dfb3e128a",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:27Z",
  "cash_received": true
}
```

```json
{
  "id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "assignment_id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
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
  "arrived_at": "2026-10-27T19:23:26.9801Z",
  "started_at": "2026-10-27T19:23:27.011079Z",
  "completed_at": "2026-10-27T19:23:27.081791Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf` → **200**

```json
{
  "id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5f0bbf23-1551-4815-a82d-1893ad3e3498",
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
    "id": "11c99754-ab6b-4f38-b451-c56d534fba3c",
    "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:23:24.60484Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
    "short_number": 5,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:23:24.60484Z",
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
    "id": "bc24bdda-b81a-4b56-9244-87c046bd65ce",
    "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
    "order_short_number": 5,
    "created_at": "2026-10-27T19:23:24.668522Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "7661735d-0640-46d0-a104-4fa2aa8e3244",
    "order_id": "1443065b-29c0-40ef-b555-8fc9ba0c638d",
    "order_short_number": 1,
    "created_at": "2026-10-27T19:23:06.826687Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
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
      "balance_minor": -104,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "figures": {
        "trips": 2,
        "fare_minor": 21034,
        "commission_minor": 3156,
        "driver_share_minor": 17878,
        "cash_minor": 17982,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -104
      }
    }
  ],
  "total": {
    "trips": 2,
    "fare_minor": 21034,
    "commission_minor": 3156,
    "driver_share_minor": 17878,
    "cash_minor": 17982,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -104
  },
  "balance_minor": -104
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf/tip` → **200**

```json
{
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "currency": "UAH",
  "trip_cost_minor": 10517,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1100
    },
    {
      "percent": 15,
      "amount_minor": 1600
    },
    {
      "percent": 20,
      "amount_minor": 2200
    },
    {
      "percent": 25,
      "amount_minor": 2700
    }
  ],
  "min_minor": 100,
  "max_minor": 10600,
  "method": "CASH",
  "available_until": "2026-10-28T19:23:27.081791Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf/tip` → **201**

```json
{
  "command_id": "74252115-d669-4ca3-9a5b-9e04825c065f",
  "amount_minor": 1100
}
```

```json
{
  "id": "b4ad79bd-dc29-4c22-b0a6-dd4e24bf4a75",
  "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-27T19:23:30.269923Z"
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
  "session_id": "4f795950-a0ab-45b9-b6d0-9e468b38b212",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MTAsImlhdCI6MTc5MzEyOTAxMCwianRpIjoiMGM1MjgyZjQtOGU3Yi00ZmNmLTk2YjMtOWJjNmI0ZGU0NWM4Iiwic2lkIjoiNGY3OTU5NTAtYTBhYi00NWI5LWI2ZDAtOWU0NjhiMzhiMjEyIn0.KNjsmvmfRvzrObk_EIV04yQZScNQ_r8G_4ptDre3j_o",
  "access_expires_at": "2026-10-27T19:38:30.560679256Z",
  "refresh_token": "oA-3IfwHPDZ_o-ZKXJyiwhRzTNzXNXcpc59Cgd1tWUc",
  "refresh_expires_at": "2026-10-28T07:23:30.560226366Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "counts": {
        "created": 5,
        "fulfilled": 3,
        "cancelled": 2,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 5
        },
        "by_payment": {
          "CARD": 1,
          "CASH": 4
        },
        "cancelled_by": {
          "RIDER": 1,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 5,
    "fulfilled": 3,
    "cancelled": 2,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 5
    },
    "by_payment": {
      "CARD": 1,
      "CASH": 4
    },
    "cancelled_by": {
      "RIDER": 1,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "DRIVER",
      "code": "PASSENGER_ASKED",
      "count": 1
    },
    {
      "cancelled_by": "RIDER",
      "code": "WAIT_TOO_LONG",
      "count": 1
    }
  ]
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-27&to=2026-10-27` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-27",
  "to": "2026-10-27",
  "days": [
    {
      "date": "2026-10-27",
      "figures": {
        "trips": 3,
        "fares_minor": 37331,
        "service_rides_minor": 0,
        "commission_minor": 5601,
        "driver_share_minor": 31730,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 2000,
        "collected_by_drivers_minor": 17982,
        "tips_minor": 2500,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 3,
    "fares_minor": 37331,
    "service_rides_minor": 0,
    "commission_minor": 5601,
    "driver_share_minor": 31730,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 2000,
    "collected_by_drivers_minor": 17982,
    "tips_minor": 2500,
    "rider_debt_change_minor": 0
  }
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
  "session_id": "408fd50c-ed90-476d-b62d-6630379e034f",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MTAsImlhdCI6MTc5MzEyOTAxMCwianRpIjoiOTJmYmY1ZGYtMmI2Zi00ZmRmLWE2YTgtNDM2MDJhNDU5ZGQyIiwic2lkIjoiNDA4ZmQ1MGMtZWQ5MC00NzZkLWI2MmQtNjYzMDM3OWUwMzRmIn0.SApYD9JpIrQuvQEE1kvXqcBNiSe9cBz2IkQ37wMOZQY",
  "access_expires_at": "2026-10-27T19:38:30.902297191Z",
  "refresh_token": "dA1_aI95euefCII5WlnwNnW5RLFJu9d8YYsASt8T3qw",
  "refresh_expires_at": "2026-10-28T07:23:30.901869048Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:23:24.605535Z",
      "actor": {
        "type": "CLIENT",
        "id": "5f0bbf23-1551-4815-a82d-1893ad3e3498",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
        "quote_id": "7a3b222d-60bf-4dc8-b0bf-5f7e30d99162",
        "price_minor": 10517,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:23:24.607614Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
        "attempt_id": "f9ad4a7d-29ea-4719-b63b-a2a167867501",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:23:24.612756Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "491c3070-bd6b-451c-b0b7-da527421176b",
        "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:23:24.670079Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "491c3070-bd6b-451c-b0b7-da527421176b",
        "order_id": "f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "11c99754-ab6b-4f38-b451-c56d534fba3c"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-27T19:23:30.948791049Z",
  "drivers": [
    {
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "name": "Іван Петренко",
      "car": {
        "registration_number": "AA0001TX",
        "make": "Skoda",
        "model": "Octavia",
        "color": "white",
        "classes": [
          "STANDARD",
          "COMFORT"
        ]
      },
      "has_payment_terminal": false,
      "status": "FREE",
      "occupancy": "FREE",
      "connection": "CONNECTED",
      "geolocation": "FRESH",
      "location": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "last_location_at": "2026-10-27T19:23:27.049415Z",
      "order_id": null
    },
    {
      "driver_id": "5a000000-0000-4000-8000-000000000402",
      "name": "Олег Коваль",
      "car": {
        "registration_number": "AA0002TX",
        "make": "Toyota",
        "model": "Corolla",
        "color": "grey",
        "classes": [
          "STANDARD"
        ]
      },
      "has_payment_terminal": false,
      "status": "NO_SIGNAL",
      "occupancy": "FREE",
      "connection": "STALE",
      "geolocation": "STALE",
      "location": {
        "lat": 50.459,
        "lon": 30.5238
      },
      "last_location_at": "2026-10-27T19:23:11.327148Z",
      "order_id": null
    }
  ]
}
```

Done: order f7ca7ef8-9ddd-4220-b7c5-726ad6b5bbbf.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14315"
}
```

```json
{
  "challenge_id": "760a3b31-098d-44df-8dbd-a36b2eeb8687",
  "expires_at": "2026-10-27T19:28:30.985982263Z",
  "resend_available_at": "2026-10-27T19:23:31.985982263Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "317752",
  "sent_at": "2026-10-27T19:23:30.988199351Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "760a3b31-098d-44df-8dbd-a36b2eeb8687",
  "code": "317752",
  "device_ref": "sandbox-14315"
}
```

```json
{
  "session_id": "1eefe72e-57c9-423b-819d-ffd9cac334b9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkxMSwiaWF0IjoxNzkzMTI5MDExLCJqdGkiOiI1YWQ4YTFhNC1kMjRmLTRmODAtYTJlOC1iOGNlYWQ2MjBlYjEiLCJzaWQiOiIxZWVmZTcyZS01N2M5LTQyM2ItODE5ZC1mZmQ5Y2FjMzM0YjkifQ.Nt8FJBrEe3Wb17adPOvWzNqSSsMdqUS9F4jEkzLUEQU",
  "access_expires_at": "2026-10-27T19:38:31.038555977Z",
  "refresh_token": "pNSBHkIXHzJBCQENfUbKUmGOkHyF6icg-ISX3l_F_1M",
  "refresh_expires_at": "2026-11-26T19:23:31.037991204Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:27.049415Z",
  "last_location_at": "2026-10-27T19:23:27.049415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/handover` → **200**

```json
{
  "command_id": "0aeb06e4-10ab-4f3b-bcf9-f5a816edba1d",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:27.049415Z",
  "last_location_at": "2026-10-27T19:23:27.049415Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:31Z",
    "sequence": 1793129011113
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.130966Z",
  "last_location_at": "2026-10-27T19:23:31.130966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668172041",
  "device_ref": "sandbox-21459"
}
```

```json
{
  "challenge_id": "2c8450a6-5c27-47e9-b994-2af86201cde7",
  "expires_at": "2026-10-27T19:28:31.200656174Z",
  "resend_available_at": "2026-10-27T19:23:32.200656174Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668172041` → **200**

```json
{
  "phone": "+380668172041",
  "audience": "CLIENT",
  "code": "897274",
  "sent_at": "2026-10-27T19:23:31.202487964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c8450a6-5c27-47e9-b994-2af86201cde7",
  "code": "897274",
  "device_ref": "sandbox-21459"
}
```

```json
{
  "session_id": "2fb93a97-3921-4022-92c1-5aa753ea4fac",
  "subject": {
    "type": "CLIENT",
    "id": "9dc93b89-c355-43bb-af1d-2c4eafefe863"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGM5M2I4OS1jMzU1LTQzYmItYWYxZC0yYzRlYWZlZmU4NjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTExLCJpYXQiOjE3OTMxMjkwMTEsImp0aSI6IjZiYjI1Y2UzLTBiMTctNDU2YS1iY2E4LTUxODljNTY1OGJiZSIsInNpZCI6IjJmYjkzYTk3LTM5MjEtNDAyMi05MmMxLTVhYTc1M2VhNGZhYyJ9.i3aKppoYLVC7BenejMQfVCUeQOuelccNWHeDTXelYwI",
  "access_expires_at": "2026-10-27T19:38:31.251181344Z",
  "refresh_token": "3tNjr7d0-PDFARN6NhBzX9d4u61tpTWNuxth4IRs8Uo",
  "refresh_expires_at": "2026-11-26T19:23:31.250783607Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b3ddcfea-55a2-4d8a-a779-3b93473fe8f8",
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
  "id": "909ac2b4-3ca5-4862-beab-b4728018d311",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "expires_at": "2026-10-27T19:28:31.422Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 21185,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "50c87064-aa1d-4dfa-8ac1-621ff49dc913",
  "quote_id": "909ac2b4-3ca5-4862-beab-b4728018d311",
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
  "id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9dc93b89-c355-43bb-af1d-2c4eafefe863",
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
  "created_at": "2026-10-27T19:23:31.454599Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1d59e616-315c-4470-ad7e-47b63674d1bd",
    "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
    "expires_at": "2026-10-27T19:23:46.456818Z",
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

`POST /api/driver/v1/offers/1d59e616-315c-4470-ad7e-47b63674d1bd/accept` → **200**

```json
{
  "command_id": "e151cd51-e10c-40cc-a5c2-91e1e7be1697"
}
```

```json
{
  "id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c",
  "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "19f0bcdc-bf49-4dfc-a8fe-6923dc721153",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "19f0bcdc-bf49-4dfc-a8fe-6923dc721153",
  "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
  "assignment_id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:31Z",
    "sequence": 1793129011548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.564744Z",
  "last_location_at": "2026-10-27T19:23:31.564744Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/19f0bcdc-bf49-4dfc-a8fe-6923dc721153/arrive` → **200**

```json
{
  "command_id": "e122bb3e-a097-44d3-abe8-52866128a21b",
  "expected_version": 0
}
```

```json
{
  "id": "19f0bcdc-bf49-4dfc-a8fe-6923dc721153",
  "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
  "assignment_id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c",
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
  "arrived_at": "2026-10-27T19:23:31.596352Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/19f0bcdc-bf49-4dfc-a8fe-6923dc721153/start` → **200**

```json
{
  "command_id": "0f7a67a3-32e4-4ed4-b78c-3e5a5e89ee4f",
  "expected_version": 1
}
```

```json
{
  "id": "19f0bcdc-bf49-4dfc-a8fe-6923dc721153",
  "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
  "assignment_id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c",
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
  "arrived_at": "2026-10-27T19:23:31.596352Z",
  "started_at": "2026-10-27T19:23:31.632456Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:31Z",
    "sequence": 1793129011656
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.673879Z",
  "last_location_at": "2026-10-27T19:23:31.673879Z",
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
  "device_ref": "sandbox-13581"
}
```

```json
{
  "challenge_id": "b009f9e2-148c-42d7-bf25-359b4c5ec94c",
  "expires_at": "2026-10-27T19:28:31.696199451Z",
  "resend_available_at": "2026-10-27T19:23:32.696199451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "085505",
  "sent_at": "2026-10-27T19:23:31.698422633Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b009f9e2-148c-42d7-bf25-359b4c5ec94c",
  "code": "085505",
  "device_ref": "sandbox-13581"
}
```

```json
{
  "session_id": "e9deac5e-e19d-4008-912a-4c7d775e8b74",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkxMSwiaWF0IjoxNzkzMTI5MDExLCJqdGkiOiJlYzk1MDRmMi04YjNhLTQyYjYtYmUwYy1mMzE1ZTJhM2EwMTUiLCJzaWQiOiJlOWRlYWM1ZS1lMTlkLTQwMDgtOTEyYS00YzdkNzc1ZThiNzQifQ.6mA5sJClfCytm_JBumX08J8qUdS328KPxQOvQA2jFIM",
  "access_expires_at": "2026-10-27T19:38:31.748985094Z",
  "refresh_token": "W9e84Wn7TDMDUOKP5wrfwfyR8gdfc-UzEh5WkZFbnv0",
  "refresh_expires_at": "2026-11-26T19:23:31.748519905Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T19:23:11.327148Z",
  "last_location_at": "2026-10-27T19:23:11.327148Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/487d600f-4d45-4481-84f4-4f1a3b565d4a/handover` → **200**

```json
{
  "command_id": "751ae044-5215-4f28-8068-505a4d574b39",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T19:23:11.327148Z",
  "last_location_at": "2026-10-27T19:23:11.327148Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/487d600f-4d45-4481-84f4-4f1a3b565d4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:31Z",
    "sequence": 1793129011825
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.842659Z",
  "last_location_at": "2026-10-27T19:23:31.842659Z",
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
  "session_id": "9f6970b2-dc3a-460b-aa4f-2125ce40ac77",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MTIsImlhdCI6MTc5MzEyOTAxMiwianRpIjoiOGY0NWY0YmItM2UxYS00NjdjLWJlMjktNjE5NWUwYThjMzEyIiwic2lkIjoiOWY2OTcwYjItZGMzYS00NjBiLWFhNGYtMjEyNWNlNDBhYzc3In0.kwSmPQwZcNpT6Jc6CpVksTZhi8aeogxHC5OOl-fDsm8",
  "access_expires_at": "2026-10-27T19:38:32.128354123Z",
  "refresh_token": "xuR1v3H_Tp6WVaYic8cDQ7BYu1HDDK4fpoMsLYAe9v8",
  "refresh_expires_at": "2026-10-28T07:23:32.127916136Z",
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
  "session_id": "1cef2ecb-4f7e-4348-b628-238a808b519f",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MTIsImlhdCI6MTc5MzEyOTAxMiwianRpIjoiYTU5YjZkOTAtMjgzYS00NTFjLTk1ZTUtNDA5YWU2OGQ5MDVlIiwic2lkIjoiMWNlZjJlY2ItNGY3ZS00MzQ4LWI2MjgtMjM4YTgwOGI1MTlmIn0.sebspbM8cyPwUbHmHiqH5ky2q56DmcExgfIy-L3KHEM",
  "access_expires_at": "2026-10-27T19:38:32.411108147Z",
  "refresh_token": "DAm_di4PTiq5WnbyQs6_ObcOPmCbswZPLyLvHtJsy40",
  "refresh_expires_at": "2026-10-28T07:23:32.410622508Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d` → **200**

```json
{
  "id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
  "short_number": 6,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "9dc93b89-c355-43bb-af1d-2c4eafefe863",
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
    "id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c",
    "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "19f0bcdc-bf49-4dfc-a8fe-6923dc721153",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-27T19:23:31.454599Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d/interrupt` → **200**

```json
{
  "command_id": "cf81a090-c868-43fa-ae0f-b13c72cf6053",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
    "short_number": 6,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "9dc93b89-c355-43bb-af1d-2c4eafefe863",
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
      "id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c",
      "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "19f0bcdc-bf49-4dfc-a8fe-6923dc721153",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-27T19:23:31.454599Z",
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
    "id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
    "short_number": 7,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "9dc93b89-c355-43bb-af1d-2c4eafefe863",
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
    "id": "02a8683e-2abf-47f1-9f71-586c46ba3e65",
    "order_id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
    "expires_at": "2026-10-27T19:23:47.489597Z",
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

`POST /api/driver/v1/offers/02a8683e-2abf-47f1-9f71-586c46ba3e65/accept` → **200**

```json
{
  "command_id": "26d75471-5f03-44ec-8a7b-ab8d0d2dc11b"
}
```

```json
{
  "id": "332f8092-c7cb-44db-8b97-cbf5524cbc0a",
  "order_id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b091e08f-f7e1-4813-887e-b94d869ef322",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b091e08f-f7e1-4813-887e-b94d869ef322",
  "order_id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
  "assignment_id": "332f8092-c7cb-44db-8b97-cbf5524cbc0a",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.842659Z",
  "last_location_at": "2026-10-27T19:23:31.842659Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/487d600f-4d45-4481-84f4-4f1a3b565d4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:32Z",
    "sequence": 1793129012618
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
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
  "last_heartbeat_at": "2026-10-27T19:23:32.635659Z",
  "last_location_at": "2026-10-27T19:23:32.635659Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b091e08f-f7e1-4813-887e-b94d869ef322/arrive` → **200**

```json
{
  "command_id": "6514825e-1975-4ebc-8150-6a5a11962eeb",
  "expected_version": 0
}
```

```json
{
  "id": "b091e08f-f7e1-4813-887e-b94d869ef322",
  "order_id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
  "assignment_id": "332f8092-c7cb-44db-8b97-cbf5524cbc0a",
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
  "arrived_at": "2026-10-27T19:23:32.669976Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b091e08f-f7e1-4813-887e-b94d869ef322/start` → **200**

```json
{
  "command_id": "c9d58f13-3887-46f9-8036-610b8590efab",
  "expected_version": 1
}
```

```json
{
  "id": "b091e08f-f7e1-4813-887e-b94d869ef322",
  "order_id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
  "assignment_id": "332f8092-c7cb-44db-8b97-cbf5524cbc0a",
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
  "arrived_at": "2026-10-27T19:23:32.669976Z",
  "started_at": "2026-10-27T19:23:32.705889Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b091e08f-f7e1-4813-887e-b94d869ef322/complete` → **200**

```json
{
  "command_id": "cb35e50e-1564-4756-a130-3d2ab4f4ac6f",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:32Z"
}
```

```json
{
  "id": "b091e08f-f7e1-4813-887e-b94d869ef322",
  "order_id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
  "assignment_id": "332f8092-c7cb-44db-8b97-cbf5524cbc0a",
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
  "arrived_at": "2026-10-27T19:23:32.669976Z",
  "started_at": "2026-10-27T19:23:32.705889Z",
  "completed_at": "2026-10-27T19:23:32.742877Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "f85f6b35-9c6c-40c7-b1f8-a74213925dc1",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-27T19:23:32.481787Z",
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
    "id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
    "short_number": 6,
    "status": "CANCELLED",
    "created_at": "2026-10-27T19:23:31.454599Z",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-27T19:23:31.455006Z",
      "actor": {
        "type": "CLIENT",
        "id": "9dc93b89-c355-43bb-af1d-2c4eafefe863",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
        "quote_id": "909ac2b4-3ca5-4862-beab-b4728018d311",
        "price_minor": 21185,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-27T19:23:31.45627Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
        "attempt_id": "fd3ae31f-97b0-473d-a4ca-97fac0df2f7d",
        "generation": 1,
        "search_seconds": 180
      }
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-27T19:23:31.46053Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1d59e616-315c-4470-ad7e-47b63674d1bd",
        "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      }
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-27T19:23:31.5119Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1d59e616-315c-4470-ad7e-47b63674d1bd",
        "order_id": "e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "964a026b-c8c9-4cf6-a4dd-7c83753ca18c"
      }
    },
    {
      "sequence": 4,
      "type": "DriverArrived",
```

Done: interrupted e652bf9d-c5d9-472e-ad00-0ebc1d7ef37d, follow-up f85f6b35-9c6c-40c7-b1f8-a74213925dc1.

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1991"
}
```

```json
{
  "challenge_id": "02476982-c615-4492-83b5-f1829e8c3e1c",
  "expires_at": "2026-10-27T19:28:35.854325019Z",
  "resend_available_at": "2026-10-27T19:23:36.854325019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "657456",
  "sent_at": "2026-10-27T19:23:35.856132792Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02476982-c615-4492-83b5-f1829e8c3e1c",
  "code": "657456",
  "device_ref": "sandbox-1991"
}
```

```json
{
  "session_id": "2e96b737-9f8a-4ebe-b885-dc30f66ec907",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkxNSwiaWF0IjoxNzkzMTI5MDE1LCJqdGkiOiIzMmRiMjVjZi03YmJiLTRkOGUtYmU4OS01ZmY4MzUwNWYxZTEiLCJzaWQiOiIyZTk2YjczNy05ZjhhLTRlYmUtYjg4NS1kYzMwZjY2ZWM5MDcifQ.OBXcknFw6PxmP0leqitZYyU25wpydjji7zcamLSv5kg",
  "access_expires_at": "2026-10-27T19:38:35.90598995Z",
  "refresh_token": "DQIR48MIjybvAjExQxU6NU5zIFHQNl7UMuz-aHMB62w",
  "refresh_expires_at": "2026-11-26T19:23:35.905555528Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
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
  "last_heartbeat_at": "2026-10-27T19:23:32.635659Z",
  "last_location_at": "2026-10-27T19:23:32.635659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/487d600f-4d45-4481-84f4-4f1a3b565d4a/handover` → **200**

```json
{
  "command_id": "b376a999-072b-4bc1-a536-49fe3b258cd1",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T19:23:32.635659Z",
  "last_location_at": "2026-10-27T19:23:32.635659Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/487d600f-4d45-4481-84f4-4f1a3b565d4a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:35Z",
    "sequence": 1793129015981
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T19:23:35.997813Z",
  "last_location_at": "2026-10-27T19:23:35.997813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676449012",
  "device_ref": "sandbox-11925"
}
```

```json
{
  "challenge_id": "27f238df-69cb-4d2a-af5f-e1f5fa678146",
  "expires_at": "2026-10-27T19:28:36.021787295Z",
  "resend_available_at": "2026-10-27T19:23:37.021787295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676449012` → **200**

```json
{
  "phone": "+380676449012",
  "audience": "CLIENT",
  "code": "827409",
  "sent_at": "2026-10-27T19:23:36.023870262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "27f238df-69cb-4d2a-af5f-e1f5fa678146",
  "code": "827409",
  "device_ref": "sandbox-11925"
}
```

```json
{
  "session_id": "388c7805-7032-4999-9684-827938b7fb40",
  "subject": {
    "type": "CLIENT",
    "id": "606fcf47-6536-45ac-9c65-33377aafaed2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDZmY2Y0Ny02NTM2LTQ1YWMtOWM2NS0zMzM3N2FhZmFlZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTE2LCJpYXQiOjE3OTMxMjkwMTYsImp0aSI6ImVjMDg2ZWZhLTU0OWUtNDlhOS04YjljLTUxYTkyNGYwMGQwNSIsInNpZCI6IjM4OGM3ODA1LTcwMzItNDk5OS05Njg0LTgyNzkzOGI3ZmI0MCJ9.yZPYyQPWyCfILtqG0uMyja6nNU3yqGO6kUqk0dijaLg",
  "access_expires_at": "2026-10-27T19:38:36.074416464Z",
  "refresh_token": "eX-0Yysli5GknnTXmQ5oh8jd6DX5M0oA9c2tUawUih0",
  "refresh_expires_at": "2026-11-26T19:23:36.073882248Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "764fa4e6-b052-4f97-ae64-8f26a7de9d5a",
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
  "id": "9fc4d6e8-4a07-4093-81d8-5aae6a603834",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:36.105350Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "211d771a-de9d-4d88-b51e-c088cecd01f3",
  "quote_id": "9fc4d6e8-4a07-4093-81d8-5aae6a603834",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380670865304"
  }
}
```

```json
{
  "id": "fc340e30-9319-42e5-b50a-77e616d67813",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.139573Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "ebf527ef-5b35-404e-acd2-ffb402e92bcc",
    "order_id": "fc340e30-9319-42e5-b50a-77e616d67813",
    "expires_at": "2026-10-27T19:23:51.142858Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4501,
      "lon": 30.5234
    },
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "payment_method": "CASH",
    "price_minor": 10517,
    "currency": "UAH",
    "distance_m": 211
  }
]
```

`POST /api/driver/v1/offers/ebf527ef-5b35-404e-acd2-ffb402e92bcc/accept` → **200**

```json
{
  "command_id": "7d628295-1354-42a3-8be3-07ae7e84b8d0"
}
```

```json
{
  "id": "ffd1e06d-b7f6-4bed-8eea-ff9762ea6ddc",
  "order_id": "fc340e30-9319-42e5-b50a-77e616d67813",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "42c9674a-bde2-4f65-b8fd-a5faa844dbdb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "42c9674a-bde2-4f65-b8fd-a5faa844dbdb",
  "order_id": "fc340e30-9319-42e5-b50a-77e616d67813",
  "assignment_id": "ffd1e06d-b7f6-4bed-8eea-ff9762ea6ddc",
  "phase": "TO_PICKUP",
  "version": 0,
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "price_minor": 10517,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Бабуся Ольга",
    "phone": "+380670865304"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f33ea038-1b1c-4666-a281-dbf588ac9742",
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
  "id": "9d5f173b-f7a9-437e-b1b5-2d7545182bd2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:36.265868Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "48591d44-7761-4ca3-9675-14e2ca088988",
  "quote_id": "9d5f173b-f7a9-437e-b1b5-2d7545182bd2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "id": "9f1dc765-8132-48c9-8974-90ee59b0c76e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.297942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ee8766d9-0b82-4924-90bf-add1ccaad9d6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-27T22:23:36Z"
}
```

```json
{
  "id": "d01143c0-471c-49c6-b690-37c303fe3a59",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:36.338581Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:23:36Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "63908879-9f60-4951-aef9-e627cba53a0b",
  "quote_id": "d01143c0-471c-49c6-b690-37c303fe3a59",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": null,
  "pickup_at": "2026-10-27T22:23:36Z"
}
```

```json
{
  "id": "7a1bb235-5afc-4a83-9d04-5182443fc6b4",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.373554Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:23:36Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8472f2ae-f193-41fc-93f3-94848ac80a8e",
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
  "id": "1b259b12-b4e7-47ab-9475-8c122b40ca50",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:36.410065Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **409**

```json
{
  "command_id": "00f28ce0-3518-426b-af2e-5c7843ef3e45",
  "quote_id": "1b259b12-b4e7-47ab-9475-8c122b40ca50",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "recipient": null
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 409,
  "title": "Active order limit",
  "type": "https://errors.blizz.taxi/active-order-limit",
  "code": "ACTIVE_ORDER_LIMIT",
  "correlation_id": "05fe6a0d-f525-430b-b64e-ce3e501742e8"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "7a1bb235-5afc-4a83-9d04-5182443fc6b4",
      "short_number": 10,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 13517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": null,
      "assignment": null,
      "created_at": "2026-10-27T19:23:36.373554Z",
      "cancellation": null,
      "pickup_at": "2026-10-27T22:23:36Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "9f1dc765-8132-48c9-8974-90ee59b0c76e",
      "short_number": 9,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
        "lat": 50.4405,
        "lon": 30.489
      },
      "dropoff_label": "Вокзал",
      "payment_method": "CASH",
      "payment_state": "CASH_EXPECTED",
      "price_minor": 10517,
      "final_price_minor": null,
      "currency": "UAH",
      "search_phase": "PERSONAL",
      "assignment": null,
      "created_at": "2026-10-27T19:23:36.297942Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "fc340e30-9319-42e5-b50a-77e616d67813",
      "short_number": 8,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "9f1dc765-8132-48c9-8974-90ee59b0c76e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.297942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/fc340e30-9319-42e5-b50a-77e616d67813` → **200**

```json
{
  "id": "fc340e30-9319-42e5-b50a-77e616d67813",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "ffd1e06d-b7f6-4bed-8eea-ff9762ea6ddc",
    "order_id": "fc340e30-9319-42e5-b50a-77e616d67813",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "42c9674a-bde2-4f65-b8fd-a5faa844dbdb",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-27T19:23:36.139573Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fc340e30-9319-42e5-b50a-77e616d67813/cancel` → **200**

```json
{
  "command_id": "cde7f01c-0546-43f6-b569-05d5db4c2375",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc340e30-9319-42e5-b50a-77e616d67813",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": {
    "id": "ffd1e06d-b7f6-4bed-8eea-ff9762ea6ddc",
    "order_id": "fc340e30-9319-42e5-b50a-77e616d67813",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "42c9674a-bde2-4f65-b8fd-a5faa844dbdb",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-27T19:23:36.139573Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/9f1dc765-8132-48c9-8974-90ee59b0c76e` → **200**

```json
{
  "id": "9f1dc765-8132-48c9-8974-90ee59b0c76e",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.297942Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/9f1dc765-8132-48c9-8974-90ee59b0c76e/cancel` → **200**

```json
{
  "command_id": "cab06790-cdb7-4c85-b3b2-50132dea9c36",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9f1dc765-8132-48c9-8974-90ee59b0c76e",
  "short_number": 9,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.297942Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/7a1bb235-5afc-4a83-9d04-5182443fc6b4` → **200**

```json
{
  "id": "7a1bb235-5afc-4a83-9d04-5182443fc6b4",
  "short_number": 10,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.373554Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:23:36Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/7a1bb235-5afc-4a83-9d04-5182443fc6b4/cancel` → **200**

```json
{
  "command_id": "30754c93-3bad-4f95-b823-33869f87f243",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "7a1bb235-5afc-4a83-9d04-5182443fc6b4",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "606fcf47-6536-45ac-9c65-33377aafaed2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 13517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": null,
  "assignment": null,
  "created_at": "2026-10-27T19:23:36.373554Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind"
    }
  },
  "pickup_at": "2026-10-27T22:23:36Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "487d600f-4d45-4481-84f4-4f1a3b565d4a",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-27T19:23:35.997813Z",
  "last_location_at": "2026-10-27T19:23:35.997813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/487d600f-4d45-4481-84f4-4f1a3b565d4a/close` → **200**

```json
{
  "command_id": "1bbeee00-48aa-43cb-b26b-9d2821e5c12a",
  "expected_version": 2
}
```

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

Done: orders fc340e30-9319-42e5-b50a-77e616d67813, 9f1dc765-8132-48c9-8974-90ee59b0c76e, 7a1bb235-5afc-4a83-9d04-5182443fc6b4.

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
  "session_id": "0353e677-5d94-4c9f-9879-380e3d00aa0e",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MTYsImlhdCI6MTc5MzEyOTAxNiwianRpIjoiODUxMjc3ZWMtNmNhOS00YTcyLTgwNjItMzFiNTM1MzAxYmI2Iiwic2lkIjoiMDM1M2U2NzctNWQ5NC00YzlmLTk4NzktMzgwZTNkMDBhYTBlIn0.cf1XZk7EgmZOJ9JOZrvys0vjr5V5vgDKHj9Gb7e8nvU",
  "access_expires_at": "2026-10-27T19:38:36.997929092Z",
  "refresh_token": "C5_DuhkGeKZZK8FOSiXK8F7nsqjtRmM6sCLWtqq6ZXc",
  "refresh_expires_at": "2026-10-28T07:23:36.997481405Z",
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
  "session_id": "b8de9581-3aec-4076-93dd-f65396e60392",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MTcsImlhdCI6MTc5MzEyOTAxNywianRpIjoiNzQ5ZjFkYmQtMDRlZS00ZmY3LThmOWEtZjFkZTZiOWIxMzVhIiwic2lkIjoiYjhkZTk1ODEtM2FlYy00MDc2LTkzZGQtZjY1Mzk2ZTYwMzkyIn0.a5PT2Ao2uoaN_ZmzMARernbIXkIBP8U2Pnen0pXez5w",
  "access_expires_at": "2026-10-27T19:38:37.280194621Z",
  "refresh_token": "c_Sl7h1Yb1Rz46FS83g1uSdoMGYX_V2g77jn9-oihwM",
  "refresh_expires_at": "2026-10-28T07:23:37.279802623Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8257"
}
```

```json
{
  "challenge_id": "2831a8d6-3375-4c9e-9f86-143ea5d8d254",
  "expires_at": "2026-10-27T19:28:37.301507749Z",
  "resend_available_at": "2026-10-27T19:23:38.301507749Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "544982",
  "sent_at": "2026-10-27T19:23:37.303622393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2831a8d6-3375-4c9e-9f86-143ea5d8d254",
  "code": "544982",
  "device_ref": "sandbox-8257"
}
```

```json
{
  "session_id": "ac05a191-6d9f-4b9d-aa63-0697d07f0c5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkxNywiaWF0IjoxNzkzMTI5MDE3LCJqdGkiOiI0YzIxZTJiZC1kN2ExLTRiZWQtYmJiYy0yMzJmYjg3NDZhYWIiLCJzaWQiOiJhYzA1YTE5MS02ZDlmLTRiOWQtYWE2My0wNjk3ZDA3ZjBjNWIifQ.f4d4eOa8N2N0N7xHJ36kZHWBgakQbu3j7akWGPei_2A",
  "access_expires_at": "2026-10-27T19:38:37.352200527Z",
  "refresh_token": "m39P8RvxIJ-IGTA82c7_ad0YWrrpwk0KzY1qLIY5_Fs",
  "refresh_expires_at": "2026-11-26T19:23:37.351787077Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.673879Z",
  "last_location_at": "2026-10-27T19:23:31.673879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/handover` → **200**

```json
{
  "command_id": "abd7389c-3a32-47b8-9a5f-390a2212a921",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:31.673879Z",
  "last_location_at": "2026-10-27T19:23:31.673879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:37Z",
    "sequence": 1793129017427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:37.443662Z",
  "last_location_at": "2026-10-27T19:23:37.443662Z",
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
  "command_id": "94987a37-4415-4b51-ae98-a6b1b17a5616",
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
  "effective_at": "2026-10-27T19:23:37.513388Z",
  "changed_by": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-27T19:23:37.541406277Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bd12d8c5-937d-43d7-afc4-70ab6f637892",
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
  "id": "c63cc24d-304a-4fd1-ba3f-117292b1a687",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:28:37.577505Z",
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
  "command_id": "79324ea9-128c-4cc8-b220-a946ee321d57",
  "quote_id": "c63cc24d-304a-4fd1-ba3f-117292b1a687",
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
    "phone": "+3806711125559"
  }
}
```

```json
{
  "id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
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
  "created_at": "2026-10-27T19:23:37.62047Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711125559"
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
    "id": "de12bd65-4a21-4320-b119-42c0e3399f7a",
    "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
    "expires_at": "2026-10-27T19:23:52.623786Z",
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

`POST /api/driver/v1/offers/de12bd65-4a21-4320-b119-42c0e3399f7a/accept` → **200**

```json
{
  "command_id": "22e4ec9e-bcd5-4cd6-b38e-fde83265067b"
}
```

```json
{
  "id": "d62a0866-cfa1-47f7-8775-a0e7cf44dd04",
  "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c85491f9-70d1-47da-a2d4-64363952ad5d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c85491f9-70d1-47da-a2d4-64363952ad5d",
  "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
  "assignment_id": "d62a0866-cfa1-47f7-8775-a0e7cf44dd04",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125559"
  }
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:37Z",
    "sequence": 1793129017715
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:37.732485Z",
  "last_location_at": "2026-10-27T19:23:37.732485Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c85491f9-70d1-47da-a2d4-64363952ad5d/arrive` → **200**

```json
{
  "command_id": "00a7713f-f441-4061-98ca-835d3569146d",
  "expected_version": 0
}
```

```json
{
  "id": "c85491f9-70d1-47da-a2d4-64363952ad5d",
  "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
  "assignment_id": "d62a0866-cfa1-47f7-8775-a0e7cf44dd04",
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
  "arrived_at": "2026-10-27T19:23:37.765406Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125559"
  }
}
```

`POST /api/driver/v1/trips/c85491f9-70d1-47da-a2d4-64363952ad5d/start` → **200**

```json
{
  "command_id": "c56b3e94-1200-46a4-b616-90ecb0f284c1",
  "expected_version": 1
}
```

```json
{
  "id": "c85491f9-70d1-47da-a2d4-64363952ad5d",
  "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
  "assignment_id": "d62a0866-cfa1-47f7-8775-a0e7cf44dd04",
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
  "arrived_at": "2026-10-27T19:23:37.765406Z",
  "started_at": "2026-10-27T19:23:37.800575Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711125559"
  }
}
```

`POST /api/driver/v1/trips/c85491f9-70d1-47da-a2d4-64363952ad5d/complete` → **200**

```json
{
  "command_id": "609c46dd-7c66-4b21-9ec6-0bc2667283d7",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:37Z",
  "cash_received": true
}
```

```json
{
  "id": "c85491f9-70d1-47da-a2d4-64363952ad5d",
  "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
  "assignment_id": "d62a0866-cfa1-47f7-8775-a0e7cf44dd04",
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
  "arrived_at": "2026-10-27T19:23:37.765406Z",
  "started_at": "2026-10-27T19:23:37.800575Z",
  "completed_at": "2026-10-27T19:23:37.837816Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Second phone order is cancelled for operator error

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "48a3af19-80a4-421d-9361-4d982bfdaf25",
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
  "id": "b96e27b6-7b28-4fce-ba59-760e47b4bd63",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:28:37.875341Z",
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
  "command_id": "e600f159-6a99-4c96-937f-16b6dbe02eab",
  "quote_id": "b96e27b6-7b28-4fce-ba59-760e47b4bd63",
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
    "phone": "+3806711112817"
  }
}
```

```json
{
  "id": "86c1c641-428d-4f69-8765-f264f287bc60",
  "short_number": 12,
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
  "created_at": "2026-10-27T19:23:37.907505Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112817"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/86c1c641-428d-4f69-8765-f264f287bc60` → **200**

```json
{
  "id": "86c1c641-428d-4f69-8765-f264f287bc60",
  "short_number": 12,
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
  "created_at": "2026-10-27T19:23:37.907505Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112817"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/86c1c641-428d-4f69-8765-f264f287bc60/cancel` → **200**

```json
{
  "command_id": "3521832b-8f38-4d28-8d67-d7a7a342016a",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "86c1c641-428d-4f69-8765-f264f287bc60",
  "short_number": 12,
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
  "created_at": "2026-10-27T19:23:37.907505Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112817"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error"
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
  "staff_id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-27T19:23:37.842124Z",
  "last_entries": [
    {
      "order_id": "86c1c641-428d-4f69-8765-f264f287bc60",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-27T19:23:37.97058Z"
    },
    {
      "order_id": "e1b0282a-52a1-4b35-9af4-5ec88dce5193",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-27T19:23:37.842124Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d4fb28c9-8d3e-4eba-a2a9-1534d42beafe",
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
  "last_heartbeat_at": "2026-10-27T19:23:37.732485Z",
  "last_location_at": "2026-10-27T19:23:37.732485Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d4fb28c9-8d3e-4eba-a2a9-1534d42beafe/close` → **200**

```json
{
  "command_id": "f9f9c583-70de-4fc2-a768-db3b2b22c00e",
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

Done: operator bonus for fulfilled e1b0282a-52a1-4b35-9af4-5ec88dce5193 and operator-fault cancellation 86c1c641-428d-4f69-8765-f264f287bc60.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671859939",
  "device_ref": "sandbox-3469"
}
```

```json
{
  "challenge_id": "a7630eeb-5665-498d-a1b4-cd3bcae49c4d",
  "expires_at": "2026-10-27T19:28:40.104741641Z",
  "resend_available_at": "2026-10-27T19:23:41.104741641Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671859939` → **200**

```json
{
  "phone": "+380671859939",
  "audience": "CLIENT",
  "code": "938558",
  "sent_at": "2026-10-27T19:23:40.106574472Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673610319",
  "device_ref": "sandbox-6937",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "cee4d450-112b-481a-8fca-bc27dc834f88",
  "expires_at": "2026-10-27T19:28:40.156375816Z",
  "resend_available_at": "2026-10-27T19:23:41.156375816Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673610319` → **200**

```json
{
  "phone": "+380673610319",
  "audience": "CLIENT",
  "code": "837605",
  "sent_at": "2026-10-27T19:23:40.158059408Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673150000",
  "device_ref": "sandbox-32024"
}
```

```json
{
  "challenge_id": "c7bf7bf5-e2da-4241-84b6-718993e9ba53",
  "expires_at": "2026-10-27T19:28:40.204061826Z",
  "resend_available_at": "2026-10-27T19:23:41.204061826Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673150000` → **200**

```json
{
  "phone": "+380673150000",
  "audience": "CLIENT",
  "code": "416119",
  "sent_at": "2026-10-27T19:23:40.206347721Z",
  "channel": "VOICE"
}
```

## What support sees: the attempts, never the code

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
  "session_id": "8b054991-5ed6-4567-b3c1-b882861f3bd6",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjAsImlhdCI6MTc5MzEyOTAyMCwianRpIjoiYjk0OTdjYmQtYWU4Ni00MjgwLThkNmYtY2I5YWNhOTBkNjMzIiwic2lkIjoiOGIwNTQ5OTEtNWVkNi00NTY3LWIzYzEtYjg4Mjg2MWYzYmQ2In0.n9JbNV-UKcezTp49MS37cfx3-03GgpPbzDn9Q7DWgqg",
  "access_expires_at": "2026-10-27T19:38:40.511611353Z",
  "refresh_token": "KIDDo2DasPIc2ZaetYtcy8ZSOO4aNEsWnOuZ8_d3BFA",
  "refresh_expires_at": "2026-10-28T07:23:40.511195289Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673150000` → **200**

```json
{
  "deliveries": [
    {
      "id": "76106cb3-0eb0-4941-9cf5-c19f3b5fd7f9",
      "challenge_id": "c7bf7bf5-e2da-4241-84b6-718993e9ba53",
      "phone": "+380673150000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0a47684c-2f16-44e9-8995-315f874838e8",
      "error": null,
      "attempted_at": "2026-10-27T19:23:40.206532Z"
    },
    {
      "id": "d894fb32-2b14-40da-806d-04f611758cd1",
      "challenge_id": "c7bf7bf5-e2da-4241-84b6-718993e9ba53",
      "phone": "+380673150000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-27T19:23:40.205934Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380673150000` → **200**

```json
{
  "phone": "+380673150000",
  "audience": "CLIENT",
  "code": "416119",
  "sent_at": "2026-10-27T19:23:40.206347721Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673610319` → **200**

```json
{
  "deliveries": [
    {
      "id": "62dd1b0d-6828-458c-a63c-e75216a43d01",
      "challenge_id": "cee4d450-112b-481a-8fca-bc27dc834f88",
      "phone": "+380673610319",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-547fab15-de38-49eb-95a6-81b94d4c0d7a",
      "error": null,
      "attempted_at": "2026-10-27T19:23:40.158249Z"
    }
  ]
}
```

Done: SMS to +380671859939, a call to +380673610319, SMS then a call to +380673150000.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634024458",
  "device_ref": "sandbox-4747"
}
```

```json
{
  "challenge_id": "f0e7cefd-756e-4b7d-b669-af094d01242c",
  "expires_at": "2026-10-27T19:28:40.626326514Z",
  "resend_available_at": "2026-10-27T19:23:41.626326514Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634024458` → **200**

```json
{
  "phone": "+380634024458",
  "audience": "CLIENT",
  "code": "304733",
  "sent_at": "2026-10-27T19:23:40.628058673Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f0e7cefd-756e-4b7d-b669-af094d01242c",
  "code": "304733",
  "device_ref": "sandbox-4747"
}
```

```json
{
  "session_id": "da0a6a17-e5f9-4b9f-af9b-eb2085d0068d",
  "subject": {
    "type": "CLIENT",
    "id": "eed9751b-d096-41d6-8f5d-279f4e35e934"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlZWQ5NzUxYi1kMDk2LTQxZDYtOGY1ZC0yNzlmNGUzNWU5MzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTIwLCJpYXQiOjE3OTMxMjkwMjAsImp0aSI6ImE1NjQyODAwLTMxNjgtNGQ1NC05OWU1LTk3Yzg5ZWZjNzQ4OSIsInNpZCI6ImRhMGE2YTE3LWU1ZjktNGI5Zi1hZjliLWViMjA4NWQwMDY4ZCJ9.V0VUnewe9kmxmT5XVtBmqL1xxMHLknjQ90hGEhNcnuo",
  "access_expires_at": "2026-10-27T19:38:40.677765286Z",
  "refresh_token": "av5tk6gfYl0Gj7dLkM6sMHSTou6i60lsgU0fcnW8g9o",
  "refresh_expires_at": "2026-11-26T19:23:40.677344755Z",
  "account_created": true
}
```

`GET /api/rider/v1/places?query=%D0%9C%D0%B0%D0%B9%D0%B4%D0%B0%D0%BD&lat=50.4501&lon=30.5234` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 1",
      "street": "Майдан",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 2",
      "street": "Майдан",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Майдан, 3",
      "street": "Майдан",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## A point on the map gives an address

`GET /api/rider/v1/places/reverse?lat=50.4501&lon=30.5234` → **200**

```json
{
  "source": "FAKE",
  "address_id": null,
  "label": "Fake street 1",
  "street": "Fake street",
  "house": "1",
  "point": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "instructions": null
}
```

## The operator searches for a caller

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
  "session_id": "75763c90-8d20-42ad-a79b-0b40f3164f8b",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjEsImlhdCI6MTc5MzEyOTAyMSwianRpIjoiZmY3NzgxYTgtZDU0NS00NGM4LTg0YmItZjNkMzZkMzlmNDdmIiwic2lkIjoiNzU3NjNjOTAtOGQyMC00MmFkLWE3OWItMGI0MGYzMTY0ZjhiIn0.YoZnV17UWCk8erSZB9rzGnNd09DrCbuphYFCTRSxUr8",
  "access_expires_at": "2026-10-27T19:38:41.032130221Z",
  "refresh_token": "gHKR6kcm_E5YfspIRpTUfHq6-jf36FphASDyJHBvjnA",
  "refresh_expires_at": "2026-10-28T07:23:41.031736901Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380634024458` → **200**

```json
{
  "provider": "FAKE",
  "places": [
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 1",
      "street": "Вокзал",
      "house": "1",
      "point": {
        "lat": 50.4531,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 2",
      "street": "Вокзал",
      "house": "2",
      "point": {
        "lat": 50.4561,
        "lon": 30.5234
      },
      "instructions": null
    },
    {
      "source": "FAKE",
      "address_id": null,
      "label": "Вокзал, 3",
      "street": "Вокзал",
      "house": "3",
      "point": {
        "lat": 50.4591,
        "lon": 30.5234
      },
      "instructions": null
    }
  ]
}
```

## Outside the service area

`GET /api/rider/v1/places?query=x&lat=10&lon=10` → **422**

```json
{
  "instance": "/api/rider/v1/places",
  "status": 422,
  "title": "Outside service area",
  "type": "https://errors.blizz.taxi/outside-service-area",
  "code": "OUTSIDE_SERVICE_AREA",
  "correlation_id": "5ac114ee-bafe-4817-898d-4410bb76eca0"
}
```

Done: address search through FAKE.

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
  "session_id": "6aae58d0-13e5-48a2-acc8-63c76bdb1bf6",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjEsImlhdCI6MTc5MzEyOTAyMSwianRpIjoiOWFmNjlmMTgtMzEzNS00ZjMxLWE2YTAtNTRhNzhlZjQ2NmRkIiwic2lkIjoiNmFhZTU4ZDAtMTNlNS00OGEyLWFjYzgtNjNjNzZiZGIxYmY2In0.NjZJT4R6pBzr11-5Nb-85q9a_3DKfj5jVx1F15TQTgo",
  "access_expires_at": "2026-10-27T19:38:41.474030695Z",
  "refresh_token": "qLkk0IwQFAtZ-gb0u4ExSQ9fZMj0S1AvqWOspssO0xo",
  "refresh_expires_at": "2026-10-28T07:23:41.473644455Z",
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
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
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
  "command_id": "0b36e621-bc22-4186-b168-605d271a7dc0",
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
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
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
    },
    "tips": {
      "window_hours": 24
    },
    "orders": {
      "active_per_payer": 3
    }
  },
  "changed_by": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-27T19:23:41.537924107Z"
}
```

## The rider books the airport for 2026-10-27T22:23:41Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600640100",
  "device_ref": "sandbox-12561"
}
```

```json
{
  "challenge_id": "bf9f71ac-e7f8-4263-ba45-f5b24d5a5ac9",
  "expires_at": "2026-10-27T19:28:41.566009262Z",
  "resend_available_at": "2026-10-27T19:23:42.566009262Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600640100` → **200**

```json
{
  "phone": "+48600640100",
  "audience": "CLIENT",
  "code": "222937",
  "sent_at": "2026-10-27T19:23:41.619165347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf9f71ac-e7f8-4263-ba45-f5b24d5a5ac9",
  "code": "222937",
  "device_ref": "sandbox-12561"
}
```

```json
{
  "session_id": "dc80284d-7f54-452e-bca5-a76f7682ddaa",
  "subject": {
    "type": "CLIENT",
    "id": "227f030b-6df1-481b-84e8-3828a00698e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMjdmMDMwYi02ZGYxLTQ4MWItODRlOC0zODI4YTAwNjk4ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTIxLCJpYXQiOjE3OTMxMjkwMjEsImp0aSI6IjJkOThkM2Q2LWVmOTMtNGI1Ny1hNmM4LWQwZTc0YmE4N2MzMiIsInNpZCI6ImRjODAyODRkLTdmNTQtNDUyZS1iY2E1LWE3NmY3NjgyZGRhYSJ9.LKTW9ofJRt-i9iC8j2ckutZYTgu49Nv3JmClt0oTSQY",
  "access_expires_at": "2026-10-27T19:38:41.670185418Z",
  "refresh_token": "qVFNSv6nWDkeMnLoaVI6uAPdWOZFypi3ksFRIu0enJw",
  "refresh_expires_at": "2026-11-26T19:23:41.669702859Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8388aedb-3d82-42f3-94ca-c7d28f08f48d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-27T22:23:41Z"
}
```

```json
{
  "id": "de9aeb11-c1e4-464b-8762-3e2681ea69fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "expires_at": "2026-10-27T19:28:41.701593Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-27T22:23:41Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ab9286a4-303c-42c5-b7d2-06355312090a",
  "quote_id": "de9aeb11-c1e4-464b-8762-3e2681ea69fc",
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
  "pickup_at": "2026-10-27T22:23:41Z"
}
```

```json
{
  "id": "1bed99b0-8895-4af3-985b-8d161cae3959",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "227f030b-6df1-481b-84e8-3828a00698e9",
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
  "created_at": "2026-10-27T19:23:41.73325Z",
  "cancellation": null,
  "pickup_at": "2026-10-27T22:23:41Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-11591"
}
```

```json
{
  "challenge_id": "c2faeddf-033c-4397-a29d-d2d6119aaa60",
  "expires_at": "2026-10-27T19:28:41.760848391Z",
  "resend_available_at": "2026-10-27T19:23:42.760848391Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "621038",
  "sent_at": "2026-10-27T19:23:41.762524447Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2faeddf-033c-4397-a29d-d2d6119aaa60",
  "code": "621038",
  "device_ref": "sandbox-11591"
}
```

```json
{
  "session_id": "cea17f95-7119-4c66-8b8d-bc97bb4f1405",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkyMSwiaWF0IjoxNzkzMTI5MDIxLCJqdGkiOiI5OWU2MTA5Ni0wMzRhLTQ2Y2EtOWM2MC1iNjQ5N2RlMTNiYTUiLCJzaWQiOiJjZWExN2Y5NS03MTE5LTRjNjYtOGI4ZC1iYzk3YmI0ZjE0MDUifQ.u7mhKYMNyKUGX8TooweJBft1QtG5DEELni2rOfpkiCM",
  "access_expires_at": "2026-10-27T19:38:41.811700446Z",
  "refresh_token": "qGWJCvoeYv8TQGk5_QNo6x5v8_yBjKnMPKGhWRIehLQ",
  "refresh_expires_at": "2026-11-26T19:23:41.811172163Z",
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
  "command_id": "710d4b6b-d664-4971-ae60-6838f1545e13",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:41Z",
    "sequence": 1793129021855
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "19640929-e201-456e-a169-6b7ee5735f30",
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
  "last_heartbeat_at": "2026-10-27T19:23:41.871348Z",
  "last_location_at": "2026-10-27T19:23:41.871348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "1bed99b0-8895-4af3-985b-8d161cae3959",
      "short_number": 13,
      "pickup_at": "2026-10-27T22:23:41Z",
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

`POST /api/driver/v1/preorders/1bed99b0-8895-4af3-985b-8d161cae3959/reserve` → **200**

```json
{
  "command_id": "a88a6f83-4734-4e4d-86fc-17be1265a468"
}
```

```json
{
  "id": "bc3c1802-77ae-40ca-9c85-c047a463e747",
  "state": "RESERVED",
  "order": {
    "order_id": "1bed99b0-8895-4af3-985b-8d161cae3959",
    "short_number": 13,
    "pickup_at": "2026-10-27T22:23:41Z",
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
  "reserved_at": "2026-10-27T19:23:41.929282Z",
  "confirm_from": "2026-10-27T21:53:41Z",
  "confirm_until": "2026-10-27T22:03:41Z",
  "drop_until": "2026-10-27T21:23:41Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "bc3c1802-77ae-40ca-9c85-c047a463e747",
      "state": "RESERVED",
      "order": {
        "order_id": "1bed99b0-8895-4af3-985b-8d161cae3959",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:23:41Z",
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
      "reserved_at": "2026-10-27T19:23:41.929282Z",
      "confirm_from": "2026-10-27T21:53:41Z",
      "confirm_until": "2026-10-27T22:03:41Z",
      "drop_until": "2026-10-27T21:23:41Z"
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
      "id": "bc3c1802-77ae-40ca-9c85-c047a463e747",
      "state": "RESERVED",
      "order": {
        "order_id": "1bed99b0-8895-4af3-985b-8d161cae3959",
        "short_number": 13,
        "pickup_at": "2026-10-27T22:23:41Z",
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
      "reserved_at": "2026-10-27T19:23:41.929282Z",
      "confirm_from": "2026-10-27T21:53:41Z",
      "confirm_until": "2026-10-27T22:03:41Z",
      "drop_until": "2026-10-27T21:23:41Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/bc3c1802-77ae-40ca-9c85-c047a463e747/confirm` → **409**

```json
{
  "command_id": "00306dc9-cb0a-4fb9-b2f4-3eef24a13adc"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/bc3c1802-77ae-40ca-9c85-c047a463e747/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2e454d42-7b70-4b6a-aafd-add631ecec8d"
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
  "session_id": "9d33aca5-914f-4460-8cf6-e7ba6fb7e51a",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjIsImlhdCI6MTc5MzEyOTAyMiwianRpIjoiYjcyYjk1MTgtNjI3ZC00NDFlLWI3NzktMDJjYWI0ZmVjMjI5Iiwic2lkIjoiOWQzM2FjYTUtOTE0Zi00NDYwLThjZjYtZTdiYTZmYjdlNTFhIn0.PHZ5yGlIZW9wz_tZKWuTPNm_IAJ66yaT7r6gzRRQKmI",
  "access_expires_at": "2026-10-27T19:38:42.286798339Z",
  "refresh_token": "uJMyGWZJf--BE5DY7x1Jxqc7m5SMvbr8YcsnejRYpzA",
  "refresh_expires_at": "2026-10-28T07:23:42.286387092Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1bed99b0-8895-4af3-985b-8d161cae3959` → **200**

```json
{
  "id": "1bed99b0-8895-4af3-985b-8d161cae3959",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "227f030b-6df1-481b-84e8-3828a00698e9",
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
  "created_at": "2026-10-27T19:23:41.73325Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-27T22:23:41Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "bc3c1802-77ae-40ca-9c85-c047a463e747",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-27T19:23:41.929282Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1bed99b0-8895-4af3-985b-8d161cae3959/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-27T19:23:41.734299Z",
      "actor": {
        "type": "CLIENT",
        "id": "227f030b-6df1-481b-84e8-3828a00698e9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "1bed99b0-8895-4af3-985b-8d161cae3959",
        "preorder": true,
        "quote_id": "de9aeb11-c1e4-464b-8762-3e2681ea69fc",
        "pickup_at": "2026-10-27T22:23:41Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      }
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-27T19:23:41.930202Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1bed99b0-8895-4af3-985b-8d161cae3959",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "bc3c1802-77ae-40ca-9c85-c047a463e747"
      }
    }
  ]
}
```

Done: pre-order 1bed99b0-8895-4af3-985b-8d161cae3959, reservation bc3c1802-77ae-40ca-9c85-c047a463e747.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8981"
}
```

```json
{
  "challenge_id": "a93f54dd-5b0e-43c5-9de2-e626e6a3f9ae",
  "expires_at": "2026-10-27T19:28:42.363718631Z",
  "resend_available_at": "2026-10-27T19:23:43.363718631Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "916295",
  "sent_at": "2026-10-27T19:23:42.447879667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a93f54dd-5b0e-43c5-9de2-e626e6a3f9ae",
  "code": "916295",
  "device_ref": "sandbox-8981"
}
```

```json
{
  "session_id": "3e7f420d-ba41-45b3-ba96-f0f40e7f9213",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkyMiwiaWF0IjoxNzkzMTI5MDIyLCJqdGkiOiI2N2Q4NzI2ZC1jNTdkLTQ0ZjktYTAzYi1jNjUyMjI4NTc3Y2MiLCJzaWQiOiIzZTdmNDIwZC1iYTQxLTQ1YjMtYmE5Ni1mMGY0MGU3ZjkyMTMifQ.YOm6z3p0B5VHd58symIHID_ZitJHI0-Xt6DkD7bGhqI",
  "access_expires_at": "2026-10-27T19:38:42.498372453Z",
  "refresh_token": "j8KcW2A2W33Cs7lJHbJsU7FrN5xxBzCSQM3EgrjEgFc",
  "refresh_expires_at": "2026-11-26T19:23:42.497854521Z",
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
  "command_id": "069f5e91-b7de-449c-9e2f-e670c4e3b35c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:42Z",
    "sequence": 1793129022544
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:42.560637Z",
  "last_location_at": "2026-10-27T19:23:42.560637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672502223",
  "device_ref": "sandbox-22896"
}
```

```json
{
  "challenge_id": "b27ae390-b4a9-4c98-ab74-a21df4dc57d3",
  "expires_at": "2026-10-27T19:28:42.586297019Z",
  "resend_available_at": "2026-10-27T19:23:43.586297019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672502223` → **200**

```json
{
  "phone": "+380672502223",
  "audience": "CLIENT",
  "code": "477861",
  "sent_at": "2026-10-27T19:23:42.588103421Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b27ae390-b4a9-4c98-ab74-a21df4dc57d3",
  "code": "477861",
  "device_ref": "sandbox-22896"
}
```

```json
{
  "session_id": "4916f500-ccbe-4944-b97f-416ad75c3743",
  "subject": {
    "type": "CLIENT",
    "id": "11487d66-98b9-47ed-abfe-910cf8efca76"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTQ4N2Q2Ni05OGI5LTQ3ZWQtYWJmZS05MTBjZjhlZmNhNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTIyLCJpYXQiOjE3OTMxMjkwMjIsImp0aSI6ImM4YzBhZWYyLTY3ODktNDExMS04M2NjLTM3ZmFmMjMyNzE1ZCIsInNpZCI6IjQ5MTZmNTAwLWNjYmUtNDk0NC1iOTdmLTQxNmFkNzVjMzc0MyJ9.WaU9A-tYUpW7L8OaI_vP_Y9QCyunhPT6Ho2zoJiGC-I",
  "access_expires_at": "2026-10-27T19:38:42.63552697Z",
  "refresh_token": "nbyF2D4lvgfeD2rShaguiQpyRxWJEtkjfEvAQqik0XY",
  "refresh_expires_at": "2026-11-26T19:23:42.635094931Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6cdb2f90-a0b7-4af4-8957-acebf8a17302",
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
  "id": "e253a715-0e45-4f4d-8404-889104809e16",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "expires_at": "2026-10-27T19:28:42.667170Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 10517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5b014ad7-eb3d-4034-9281-8ad63235537a",
  "quote_id": "e253a715-0e45-4f4d-8404-889104809e16",
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
  "id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "11487d66-98b9-47ed-abfe-910cf8efca76",
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
  "created_at": "2026-10-27T19:23:42.69948Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "2d5d9b63-f94f-40cb-a702-7fd40345aeef",
    "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
    "expires_at": "2026-10-27T19:23:57.702693Z",
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

`POST /api/driver/v1/offers/2d5d9b63-f94f-40cb-a702-7fd40345aeef/accept` → **200**

```json
{
  "command_id": "6aa67063-87d7-4781-bdaf-a0b827dc78bc"
}
```

```json
{
  "id": "f9de5262-57f7-4c04-b949-3886e8710ecf",
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ff591082-a5ea-4a66-8edb-66837b560523",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ff591082-a5ea-4a66-8edb-66837b560523",
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "assignment_id": "f9de5262-57f7-4c04-b949-3886e8710ecf",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d34c75c9-64fb-42e0-9f3f-0cd2736c78bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:42Z",
    "sequence": 1793129022798
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:42.815305Z",
  "last_location_at": "2026-10-27T19:23:42.815305Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ff591082-a5ea-4a66-8edb-66837b560523",
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "assignment_id": "f9de5262-57f7-4c04-b949-3886e8710ecf",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ff591082-a5ea-4a66-8edb-66837b560523/arrive` → **200**

```json
{
  "command_id": "c19fcfe7-98b7-44da-828e-356257646b58",
  "expected_version": 0
}
```

```json
{
  "id": "ff591082-a5ea-4a66-8edb-66837b560523",
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "assignment_id": "f9de5262-57f7-4c04-b949-3886e8710ecf",
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
  "arrived_at": "2026-10-27T19:23:42.860622Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ff591082-a5ea-4a66-8edb-66837b560523/start` → **200**

```json
{
  "command_id": "ef71eb0f-e009-4653-9a7d-40bfad14a3ae",
  "expected_version": 1
}
```

```json
{
  "id": "ff591082-a5ea-4a66-8edb-66837b560523",
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "assignment_id": "f9de5262-57f7-4c04-b949-3886e8710ecf",
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
  "arrived_at": "2026-10-27T19:23:42.860622Z",
  "started_at": "2026-10-27T19:23:42.891167Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d34c75c9-64fb-42e0-9f3f-0cd2736c78bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:42Z",
    "sequence": 1793129022912
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:42.928831Z",
  "last_location_at": "2026-10-27T19:23:42.928831Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/ff591082-a5ea-4a66-8edb-66837b560523/complete` → **200**

```json
{
  "command_id": "1db2988d-3db6-4d8d-b09b-2815e60bf182",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:42Z",
  "cash_received": true
}
```

```json
{
  "id": "ff591082-a5ea-4a66-8edb-66837b560523",
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "assignment_id": "f9de5262-57f7-4c04-b949-3886e8710ecf",
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
  "arrived_at": "2026-10-27T19:23:42.860622Z",
  "started_at": "2026-10-27T19:23:42.891167Z",
  "completed_at": "2026-10-27T19:23:42.957072Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/096987cf-2d59-487b-b895-1a6cbddce97c/rating` → **200**

```json
{
  "command_id": "3cf41314-2878-47bd-94e3-85c4ddc22012",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "score": 5,
  "created_at": "2026-10-27T19:23:43.003079779Z"
}
```

`POST /api/driver/v1/orders/096987cf-2d59-487b-b895-1a6cbddce97c/rating` → **200**

```json
{
  "command_id": "c97572e7-a975-40c3-971f-a268b8b05548",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
  "score": 4,
  "created_at": "2026-10-27T19:23:43.034448001Z"
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
  "session_id": "d436be11-2f14-4033-ac4a-0ccbc5b799d9",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjMsImlhdCI6MTc5MzEyOTAyMywianRpIjoiMjVlNmE0YmMtZjMyMC00MzI5LWI1OTYtNzE2Y2U5NzllZGZhIiwic2lkIjoiZDQzNmJlMTEtMmYxNC00MDMzLWFjNGEtMGNjYmM1Yjc5OWQ5In0.pDviTmDEZohSHlM0LWBRq18_WFdC5Vt9vxMpYeSpx6k",
  "access_expires_at": "2026-10-27T19:38:43.350116731Z",
  "refresh_token": "PzQ5M9wQT7XLF5axZ_9iyixfJO9xPqqOUbbbDAWEgqY",
  "refresh_expires_at": "2026-10-28T07:23:43.349713275Z",
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
  "session_id": "0e0c62a2-43b0-4e74-9b4d-040b1b18d168",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjMsImlhdCI6MTc5MzEyOTAyMywianRpIjoiMTQ5M2U2OTQtOTI5ZS00NmYyLTgxMjctMWVhZjQ0Y2E0NzJjIiwic2lkIjoiMGUwYzYyYTItNDNiMC00ZTc0LTliNGQtMDQwYjFiMThkMTY4In0.7X1N6vrl-vw0ARrcu0dgF9U4QsHsI3VXCPAfmQjK-IA",
  "access_expires_at": "2026-10-27T19:38:43.632411912Z",
  "refresh_token": "VY1yIo3hazZEfBHOCzcSjOOVsHn1WhKAAfy731P-fk4",
  "refresh_expires_at": "2026-10-28T07:23:43.631869087Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/096987cf-2d59-487b-b895-1a6cbddce97c/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
      "author_type": "RIDER",
      "author_id": "11487d66-98b9-47ed-abfe-910cf8efca76",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-27T19:23:43.00308Z"
    },
    {
      "order_id": "096987cf-2d59-487b-b895-1a6cbddce97c",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "11487d66-98b9-47ed-abfe-910cf8efca76",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-27T19:23:43.034448Z"
    }
  ]
}
```

Done: ratings for order 096987cf-2d59-487b-b895-1a6cbddce97c.

# Scenario: safety-contacts

## The admin reads the city's contacts and replaces them

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
  "session_id": "63902d0a-ac28-4996-9f80-137c54ea182e",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjMsImlhdCI6MTc5MzEyOTAyMywianRpIjoiNTc4YTM2MjQtYWYxMC00NGYzLTgwZjItZjM4NDBiNjQ3MmY2Iiwic2lkIjoiNjM5MDJkMGEtYWMyOC00OTk2LTlmODAtMTM3YzU0ZWExODJlIn0.gApUQUYEnfardo2w2J1qg-Lt_PZLSyOTNUeE7MJFi6s",
  "access_expires_at": "2026-10-27T19:38:43.959966238Z",
  "refresh_token": "EzqCRbtoW2KUHUMEzVOXn7pxv0shM6QFkTiRBiH8Jf0",
  "refresh_expires_at": "2026-10-28T07:23:43.959544826Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 0,
  "emergency_number": "112",
  "support_phone": null,
  "extra": [],
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "68be6f49-4732-4bf4-9985-ff9780cd5d09",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:23:44.022187Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "68be6f49-4732-4bf4-9985-ff9780cd5d09",
  "expected_version": 0,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "pl": "Infolinia",
        "uk": "Гаряча лінія",
        "ru": "Горячая линия",
        "en": "Hotline"
      },
      "phone": "+48220000997"
    }
  ],
  "reason": "Sandbox: contacts of Warszawa"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "version": 1,
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": {
        "en": "Hotline",
        "pl": "Infolinia",
        "ru": "Горячая линия",
        "uk": "Гаряча лінія"
      },
      "phone": "+48220000997"
    }
  ],
  "changed_by": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-27T19:23:44.022187Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48132713209",
  "device_ref": "sandbox-22001"
}
```

```json
{
  "challenge_id": "eefdd92f-13c8-4e1c-81c3-f9b8b7aa2aaf",
  "expires_at": "2026-10-27T19:28:44.090471624Z",
  "resend_available_at": "2026-10-27T19:23:45.090471624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48132713209` → **200**

```json
{
  "phone": "+48132713209",
  "audience": "CLIENT",
  "code": "493417",
  "sent_at": "2026-10-27T19:23:44.092742943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eefdd92f-13c8-4e1c-81c3-f9b8b7aa2aaf",
  "code": "493417",
  "device_ref": "sandbox-22001"
}
```

```json
{
  "session_id": "8fad066c-ca62-4a7e-b50c-1ce462bf132a",
  "subject": {
    "type": "CLIENT",
    "id": "84b90bbd-0434-4d8c-95e5-1ac073739308"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NGI5MGJiZC0wNDM0LTRkOGMtOTVlNS0xYWMwNzM3MzkzMDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTI0LCJpYXQiOjE3OTMxMjkwMjQsImp0aSI6IjgwOTI4ZGQ3LTA5MjktNGRiNi05MzRmLTJhODgxZWQ3OTUyZCIsInNpZCI6IjhmYWQwNjZjLWNhNjItNGE3ZS1iNTBjLTFjZTQ2MmJmMTMyYSJ9.4-LCUvFnBqTW5EAghSHnUy5NVEN28ENujC9QKV8MQJY",
  "access_expires_at": "2026-10-27T19:38:44.147086109Z",
  "refresh_token": "wJuAepfaYC_RWb4vmC37aRU6CNkwyquJ0AUAWJit1jk",
  "refresh_expires_at": "2026-11-26T19:23:44.146578838Z",
  "account_created": true
}
```

`GET /api/rider/v1/safety-contacts` → **400**

```json
{
  "instance": "/api/rider/v1/safety-contacts",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "2b723421-bd29-43f7-8001-40c6e26b4542"
}
```

`GET /api/rider/v1/safety-contacts?city_id=5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Горячая линия",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver on line in Warszawa opens it (the city of his session)

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-11615"
}
```

```json
{
  "challenge_id": "162afcdf-9ca4-412f-b25d-001a5eb86ebf",
  "expires_at": "2026-10-27T19:28:44.218745344Z",
  "resend_available_at": "2026-10-27T19:23:45.218745344Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "654620",
  "sent_at": "2026-10-27T19:23:44.220407939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "162afcdf-9ca4-412f-b25d-001a5eb86ebf",
  "code": "654620",
  "device_ref": "sandbox-11615"
}
```

```json
{
  "session_id": "9b3ba65d-c1da-4d00-8b49-5c2f51a674d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkyNCwiaWF0IjoxNzkzMTI5MDI0LCJqdGkiOiIxMTIyMjljZS0wN2IyLTQ1YjQtYTYwYy0xNmJmMGZiNTkzYTEiLCJzaWQiOiI5YjNiYTY1ZC1jMWRhLTRkMDAtOGI0OS01YzJmNTFhNjc0ZDYifQ.YHayhKhRKywY1MyyW98sjpyl4p2VDK9P4ko41R4_IyU",
  "access_expires_at": "2026-10-27T19:38:44.269498696Z",
  "refresh_token": "xDBP0BITkl1spcCaAjR2Wr2RwdSQANTIRaCvGCT0UUs",
  "refresh_expires_at": "2026-11-26T19:23:44.269067359Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "19640929-e201-456e-a169-6b7ee5735f30",
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
  "last_heartbeat_at": "2026-10-27T19:23:41.871348Z",
  "last_location_at": "2026-10-27T19:23:41.871348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19640929-e201-456e-a169-6b7ee5735f30/handover` → **200**

```json
{
  "command_id": "d5d47826-d78a-48b0-b818-f073d7818f02",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "19640929-e201-456e-a169-6b7ee5735f30",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T19:23:41.871348Z",
  "last_location_at": "2026-10-27T19:23:41.871348Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19640929-e201-456e-a169-6b7ee5735f30/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:44Z",
    "sequence": 1793129024343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "19640929-e201-456e-a169-6b7ee5735f30",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T19:23:44.360088Z",
  "last_location_at": "2026-10-27T19:23:44.360088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/safety-contacts` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "emergency_number": "112",
  "support_phone": "+48220000101",
  "extra": [
    {
      "label": "Infolinia",
      "phone": "+48220000997"
    }
  ],
  "disclaimer_code": "NO_AUTO_DISPATCH"
}
```

## The driver goes off line; without a session there is no city

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "19640929-e201-456e-a169-6b7ee5735f30",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-27T19:23:44.360088Z",
  "last_location_at": "2026-10-27T19:23:44.360088Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/19640929-e201-456e-a169-6b7ee5735f30/close` → **200**

```json
{
  "command_id": "ef6acd23-b275-4ee8-b985-d1c0702d3ace",
  "expected_version": 1
}
```

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

`GET /api/driver/v1/safety-contacts` → **409**

```json
{
  "instance": "/api/driver/v1/safety-contacts",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "463c44a9-6c10-4afd-aa9d-c15bc0e177df"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676206751",
  "device_ref": "sandbox-27800"
}
```

```json
{
  "challenge_id": "d85aa0cc-d058-4c1a-948a-8dfa3cbd5dca",
  "expires_at": "2026-10-27T19:28:44.504344785Z",
  "resend_available_at": "2026-10-27T19:23:45.504344785Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676206751` → **200**

```json
{
  "phone": "+380676206751",
  "audience": "CLIENT",
  "code": "885129",
  "sent_at": "2026-10-27T19:23:44.506420511Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d85aa0cc-d058-4c1a-948a-8dfa3cbd5dca",
  "code": "885129",
  "device_ref": "sandbox-27800"
}
```

```json
{
  "session_id": "df01e92c-1c70-4e68-a4de-a19b3434169c",
  "subject": {
    "type": "CLIENT",
    "id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTMxMTE3Yy1iY2I4LTQ0YzktYjcwYi0yYjQ0NjJhZDE3MGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTI5OTI0LCJpYXQiOjE3OTMxMjkwMjQsImp0aSI6ImEwMTU2YjVjLWVjNzYtNGM5Yi1iMzRiLTZmNzJhYWFlMDI4NiIsInNpZCI6ImRmMDFlOTJjLTFjNzAtNGU2OC1hNGRlLWExOWIzNDM0MTY5YyJ9.PfhljNs-oSs9g9TC5zyqCQaD6OZ98YIu7OEtqHDwCEs",
  "access_expires_at": "2026-10-27T19:38:44.555668739Z",
  "refresh_token": "ZIEZLa__KaaNahb76IIMZNk5R9qJZH3ztOLu58So5JY",
  "refresh_expires_at": "2026-11-26T19:23:44.555236926Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "280ed4e8-a792-4202-80f7-c1ba9eeb2b59",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "20fcf04e-9924-4eab-9ebc-458cb7c6dece",
  "upload_path": "/api/rider/v1/uploads/20fcf04e-9924-4eab-9ebc-458cb7c6dece",
  "expires_at": "2026-10-27T19:38:44.586815244Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/20fcf04e-9924-4eab-9ebc-458cb7c6dece` → **200**

```json
{
  "file_id": "20fcf04e-9924-4eab-9ebc-458cb7c6dece",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "7194e879-eea5-4be9-85e2-08b4d5e0e09e",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "20fcf04e-9924-4eab-9ebc-458cb7c6dece"
  ]
}
```

```json
{
  "id": "ebe6e290-27d8-45c4-a80b-82a5f8702738",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:23:44.648962Z",
  "updated_at": "2026-10-27T19:23:44.648962Z",
  "messages": [
    {
      "id": "5c5d5eaf-4000-4cc9-8c22-fa451795eb31",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:23:44.650299Z",
      "attachments": [
        {
          "file_id": "20fcf04e-9924-4eab-9ebc-458cb7c6dece",
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
  "session_id": "db9e0740-614b-4ca9-8893-e493d098efb5",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjQsImlhdCI6MTc5MzEyOTAyNCwianRpIjoiNmY1ZmE1YzItOWZjNy00YjQ3LWJiNDctMTZmYzc5YjNiOTU3Iiwic2lkIjoiZGI5ZTA3NDAtNjE0Yi00Y2E5LTg4OTMtZTQ5M2QwOThlZmI1In0.moKyP2O_0utkaNPIgbVRyoAe_39AXi5-VKwkzmNkNW8",
  "access_expires_at": "2026-10-27T19:38:44.950092199Z",
  "refresh_token": "1I_ycMwLWQFszLl1T9ubCl3awP92KebAg0poL3L28E4",
  "refresh_expires_at": "2026-10-28T07:23:44.949593691Z",
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
  "session_id": "b93258f2-1e3b-42a3-9842-c70da3c240c5",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjUsImlhdCI6MTc5MzEyOTAyNSwianRpIjoiZjEyMTE3ZGYtMGM2YS00NzFjLTgxOTAtNGUyMDQzNzAzYjdkIiwic2lkIjoiYjkzMjU4ZjItMWUzYi00MmEzLTk4NDItYzcwZGEzYzI0MGM1In0.2nV9zlMmNfAoVp0bxnAYBbhblmTgk6lPvKRnS0huOHY",
  "access_expires_at": "2026-10-27T19:38:45.231843269Z",
  "refresh_token": "ffmI7Qowjzgv_jzPrI64M5nhnW_ltKBAYxcNrZ6mMG8",
  "refresh_expires_at": "2026-10-28T07:23:45.231436158Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/ebe6e290-27d8-45c4-a80b-82a5f8702738/attachments/20fcf04e-9924-4eab-9ebc-458cb7c6dece` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "1b1ae4df-7b60-463a-a1ea-d365a3e3a8ec",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6f110414-0a56-403e-98e5-26d3924cbec5",
  "upload_path": "/api/operator/v1/uploads/6f110414-0a56-403e-98e5-26d3924cbec5",
  "expires_at": "2026-10-27T19:38:45.274936943Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6f110414-0a56-403e-98e5-26d3924cbec5` → **200**

```json
{
  "file_id": "6f110414-0a56-403e-98e5-26d3924cbec5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/ebe6e290-27d8-45c4-a80b-82a5f8702738` → **200**

```json
{
  "id": "ebe6e290-27d8-45c4-a80b-82a5f8702738",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-27T19:23:44.648962Z",
  "updated_at": "2026-10-27T19:23:44.648962Z",
  "messages": [
    {
      "id": "5c5d5eaf-4000-4cc9-8c22-fa451795eb31",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:23:44.650299Z",
      "attachments": [
        {
          "file_id": "20fcf04e-9924-4eab-9ebc-458cb7c6dece",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/ebe6e290-27d8-45c4-a80b-82a5f8702738/comments` → **200**

```json
{
  "command_id": "e315db60-189c-4fee-a33d-17dfb6c458dc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6f110414-0a56-403e-98e5-26d3924cbec5"
  ]
}
```

```json
{
  "id": "ebe6e290-27d8-45c4-a80b-82a5f8702738",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:23:44.648962Z",
  "updated_at": "2026-10-27T19:23:45.360845Z",
  "messages": [
    {
      "id": "5c5d5eaf-4000-4cc9-8c22-fa451795eb31",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:23:44.650299Z",
      "attachments": [
        {
          "file_id": "20fcf04e-9924-4eab-9ebc-458cb7c6dece",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "eeccf307-a8af-4ae7-87b8-c0183dd520e7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:23:45.360566Z",
      "attachments": [
        {
          "file_id": "6f110414-0a56-403e-98e5-26d3924cbec5",
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

`GET /api/rider/v1/support/cases/ebe6e290-27d8-45c4-a80b-82a5f8702738` → **200**

```json
{
  "id": "ebe6e290-27d8-45c4-a80b-82a5f8702738",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-27T19:23:44.648962Z",
  "updated_at": "2026-10-27T19:23:45.360845Z",
  "messages": [
    {
      "id": "5c5d5eaf-4000-4cc9-8c22-fa451795eb31",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5e31117c-bcb8-44c9-b70b-2b4462ad170d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-27T19:23:44.650299Z",
      "attachments": [
        {
          "file_id": "20fcf04e-9924-4eab-9ebc-458cb7c6dece",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "eeccf307-a8af-4ae7-87b8-c0183dd520e7",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-27T19:23:45.360566Z",
      "attachments": [
        {
          "file_id": "6f110414-0a56-403e-98e5-26d3924cbec5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/ebe6e290-27d8-45c4-a80b-82a5f8702738/attachments/6f110414-0a56-403e-98e5-26d3924cbec5` → **200**

Done: support case ebe6e290-27d8-45c4-a80b-82a5f8702738, rider attachment 20fcf04e-9924-4eab-9ebc-458cb7c6dece, operator attachment 6f110414-0a56-403e-98e5-26d3924cbec5.

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
  "session_id": "e74e0d6f-8ec0-433d-bf56-2fe200444f52",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjUsImlhdCI6MTc5MzEyOTAyNSwianRpIjoiN2MxOWIyY2YtOWZiOS00NjliLThjZjktYjI3NmFkOTNlYWRjIiwic2lkIjoiZTc0ZTBkNmYtOGVjMC00MzNkLWJmNTYtMmZlMjAwNDQ0ZjUyIn0.ApXd8-U60bym0Yitbawe9tBPU1V-kUs6bM6FOIwyBu4",
  "access_expires_at": "2026-10-27T19:38:45.70221402Z",
  "refresh_token": "FijucpK7sTv90D6bwuN1sz3tQbeOOrd5Q4ygUhMTHqw",
  "refresh_expires_at": "2026-10-28T07:23:45.70182076Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-15774"
}
```

```json
{
  "challenge_id": "4f09fe0d-bf1e-4ffa-a913-ec3d117fc719",
  "expires_at": "2026-10-27T19:28:45.72552947Z",
  "resend_available_at": "2026-10-27T19:23:46.72552947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "912380",
  "sent_at": "2026-10-27T19:23:45.727536663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4f09fe0d-bf1e-4ffa-a913-ec3d117fc719",
  "code": "912380",
  "device_ref": "sandbox-15774"
}
```

```json
{
  "session_id": "f9d181af-2be2-4d0d-9b92-a81511dcaf4c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkyNSwiaWF0IjoxNzkzMTI5MDI1LCJqdGkiOiJkYzY2NjZlNy0xYmViLTRiYTAtYTEzNi00YTViZmM4ODllZTQiLCJzaWQiOiJmOWQxODFhZi0yYmUyLTRkMGQtOWI5Mi1hODE1MTFkY2FmNGMifQ.GgDSqzyB201EvwblsALLvScrkIkpovJ0oPAwhMF-j7E",
  "access_expires_at": "2026-10-27T19:38:45.775502406Z",
  "refresh_token": "-_1E-obrFFEwyzVA8oYdm0ojdwtPiF9uK2tNW3Mw0as",
  "refresh_expires_at": "2026-11-26T19:23:45.775029776Z",
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
  "command_id": "79a8897c-04e8-48a3-928b-465672a84357",
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
  "device_ref": "sandbox-13361"
}
```

```json
{
  "challenge_id": "8bf2f92b-3a6f-4db2-8d49-58186d3355d8",
  "expires_at": "2026-10-27T19:28:45.886080067Z",
  "resend_available_at": "2026-10-27T19:23:46.886080067Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "958396",
  "sent_at": "2026-10-27T19:23:45.888269634Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bf2f92b-3a6f-4db2-8d49-58186d3355d8",
  "code": "958396",
  "device_ref": "sandbox-13361"
}
```

```json
{
  "session_id": "867115d0-33a8-43ab-a457-54562e2dcdd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzEyOTkyNSwiaWF0IjoxNzkzMTI5MDI1LCJqdGkiOiJhNjE5N2NkMS1mZDBmLTQ0M2QtOTMzNy0xODg5OGRlN2I2NjUiLCJzaWQiOiI4NjcxMTVkMC0zM2E4LTQzYWItYTQ1Ny01NDU2MmUyZGNkZDMifQ.hgQGN7yKWmrTAGslHVZLcQ4rxQibgkRpTFXxD-hjtCc",
  "access_expires_at": "2026-10-27T19:38:45.937994828Z",
  "refresh_token": "6AOqdU19PIrdhNN-EScO7aw-DOqUWhK9tM4ftOvNN34",
  "refresh_expires_at": "2026-11-26T19:23:45.937504777Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:42.928831Z",
  "last_location_at": "2026-10-27T19:23:42.928831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d34c75c9-64fb-42e0-9f3f-0cd2736c78bb/handover` → **200**

```json
{
  "command_id": "4d1b34bd-b296-4f1d-8863-6fa9d5020676",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:42.928831Z",
  "last_location_at": "2026-10-27T19:23:42.928831Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d34c75c9-64fb-42e0-9f3f-0cd2736c78bb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:46Z",
    "sequence": 1793129026130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:46.02945Z",
  "last_location_at": "2026-10-27T19:23:46.02945Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "command_id": "082ae265-f9b7-4ddf-849f-2e3718562dff",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:46Z",
    "sequence": 1793129026715
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6facd740-b877-4427-bf12-b00791032eff",
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
  "last_heartbeat_at": "2026-10-27T19:23:46.086704Z",
  "last_location_at": "2026-10-27T19:23:46.086704Z",
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
  "session_id": "edc612e3-5b12-48ab-a24d-78444d7fc8a6",
  "subject": {
    "type": "STAFF",
    "id": "aaef4f73-40b1-4176-9e23-8b7bf9d228ce"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWVmNGY3My00MGIxLTQxNzYtOWUyMy04YjdiZjlkMjI4Y2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxMjk5MjYsImlhdCI6MTc5MzEyOTAyNiwianRpIjoiYmExZGM4MWUtZjkxZi00MDY2LThmNjItYzM1M2ZlN2I1OWI3Iiwic2lkIjoiZWRjNjEyZTMtNWIxMi00OGFiLWEyNGQtNzg0NDRkN2ZjOGE2In0.GXYh5nmPdwI2n8pZeKe63_BXN4BWmisnoGcF5rZab14",
  "access_expires_at": "2026-10-27T19:38:46.373297323Z",
  "refresh_token": "SB2dlxb4Hrr_Zj2BopQrSycK1c-Trf4bhUiiQ9j1uSY",
  "refresh_expires_at": "2026-10-28T07:23:46.372894738Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "edcbb7e7-0418-4c68-805b-1ac34cfd502e",
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
  "id": "39b8fb78-40d3-4e61-8624-c82db7cc25df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "expires_at": "2026-10-27T19:28:46.400746Z",
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
  "command_id": "ea5e5576-7d33-4269-bff0-ed8406398547",
  "quote_id": "39b8fb78-40d3-4e61-8624-c82db7cc25df",
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
  "id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "short_number": 15,
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
  "created_at": "2026-10-27T19:23:46.434453Z",
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
    "id": "8b983f11-35da-4dbb-955b-be7685b4c967",
    "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
    "expires_at": "2026-10-27T19:24:01.438013Z",
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

`POST /api/driver/v1/offers/8b983f11-35da-4dbb-955b-be7685b4c967/accept` → **200**

```json
{
  "command_id": "c0799a19-78a9-4686-a13a-09aaaed74ac0"
}
```

```json
{
  "id": "df764504-6eaa-4507-874e-b0265c9188ac",
  "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3b8e8c1-5fbd-4397-8f71-d09731a0df22",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3b8e8c1-5fbd-4397-8f71-d09731a0df22",
  "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "assignment_id": "df764504-6eaa-4507-874e-b0265c9188ac",
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
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/work-sessions/6facd740-b877-4427-bf12-b00791032eff/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-27T19:23:46Z",
    "sequence": 1793129026716
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6facd740-b877-4427-bf12-b00791032eff",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-27T19:23:46.570327Z",
  "last_location_at": "2026-10-27T19:23:46.570327Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d3b8e8c1-5fbd-4397-8f71-d09731a0df22/arrive` → **200**

```json
{
  "command_id": "d3dfc371-2973-4a50-9bd7-623826eecae6",
  "expected_version": 0
}
```

```json
{
  "id": "d3b8e8c1-5fbd-4397-8f71-d09731a0df22",
  "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "assignment_id": "df764504-6eaa-4507-874e-b0265c9188ac",
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
  "arrived_at": "2026-10-27T19:23:46.600974Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/d3b8e8c1-5fbd-4397-8f71-d09731a0df22/start` → **200**

```json
{
  "command_id": "5fb6d41f-0085-4256-83e9-257e05bce984",
  "expected_version": 1
}
```

```json
{
  "id": "d3b8e8c1-5fbd-4397-8f71-d09731a0df22",
  "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "assignment_id": "df764504-6eaa-4507-874e-b0265c9188ac",
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
  "arrived_at": "2026-10-27T19:23:46.600974Z",
  "started_at": "2026-10-27T19:23:46.634587Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380671112233"
  }
}
```

`POST /api/driver/v1/trips/d3b8e8c1-5fbd-4397-8f71-d09731a0df22/complete` → **200**

```json
{
  "command_id": "5669abb3-bfe6-4672-b4e9-ce8616d78239",
  "expected_version": 2,
  "reported_at": "2026-10-27T19:23:46Z",
  "cash_received": true
}
```

```json
{
  "id": "d3b8e8c1-5fbd-4397-8f71-d09731a0df22",
  "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "assignment_id": "df764504-6eaa-4507-874e-b0265c9188ac",
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
  "arrived_at": "2026-10-27T19:23:46.600974Z",
  "started_at": "2026-10-27T19:23:46.634587Z",
  "completed_at": "2026-10-27T19:23:46.673974Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/79041c1b-ed03-4bb0-a2a8-0154046c79f3` → **200**

```json
{
  "id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
  "short_number": 15,
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
    "id": "df764504-6eaa-4507-874e-b0265c9188ac",
    "order_id": "79041c1b-ed03-4bb0-a2a8-0154046c79f3",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d3b8e8c1-5fbd-4397-8f71-d09731a0df22",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-27T19:23:46.434453Z",
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
      "balance_minor": 11857,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d34c75c9-64fb-42e0-9f3f-0cd2736c78bb",
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
  "last_heartbeat_at": "2026-10-27T19:23:46.02945Z",
  "last_location_at": "2026-10-27T19:23:46.02945Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d34c75c9-64fb-42e0-9f3f-0cd2736c78bb/close` → **200**

```json
{
  "command_id": "b63edb40-4729-4836-8254-3e61699ebec9",
  "expected_version": 1
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6facd740-b877-4427-bf12-b00791032eff",
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
  "last_heartbeat_at": "2026-10-27T19:23:46.570327Z",
  "last_location_at": "2026-10-27T19:23:46.570327Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6facd740-b877-4427-bf12-b00791032eff/close` → **200**

```json
{
  "command_id": "9b4b31a6-b7f8-45a7-8387-0cf3b659090e",
  "expected_version": 0
}
```

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

Done: terminal order 79041c1b-ed03-4bb0-a2a8-0154046c79f3 by Andrii (5a000000-0000-4000-8000-000000000403).
