# Sandbox transcript (2026-10-28T14:14:30Z, 018ddc0)

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
  "correlation_id": "9ed6e229-99f8-4bbe-b745-01d08719aef1"
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
  "session_id": "7a99907d-36db-4daa-aef6-e57b14fa9fc5",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3NzgsImlhdCI6MTc5MzE5Njg3OCwianRpIjoiNTJhNzNlNjQtMjM2MS00YzBkLWFkZTItMjE3Y2IwYWYwMzE2Iiwic2lkIjoiN2E5OTkwN2QtMzZkYi00ZGFhLWFlZjYtZTU3YjE0ZmE5ZmM1In0.DiTNmx3Sp3Cm2-f2h7SOaizYPV-uNklqowIeW3C1-mc",
  "access_expires_at": "2026-10-28T14:29:38.963487516Z",
  "refresh_token": "ihYDy9hkIgkRB17wpmbGFCoeT8xr-Jd5qgwxDwf6jw0",
  "refresh_expires_at": "2026-10-29T02:14:38.960412724Z",
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
  "session_id": "13ec1c32-f21f-444c-b335-16fd22672fe7",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3ODAsImlhdCI6MTc5MzE5Njg4MCwianRpIjoiYmQ2ZjViNGEtNzg2Mi00ODk0LWEzYmItOGIyYzZkODBhYjQxIiwic2lkIjoiMTNlYzFjMzItZjIxZi00NDRjLWIzMzUtMTZmZDIyNjcyZmU3In0.adX8_-3u8kEmTkUDwiBQYi9XDmpieRnB2EYkelL6QaY",
  "access_expires_at": "2026-10-28T14:29:40.597490935Z",
  "refresh_token": "DAQVe-cEbOGmL3FU4kR5DrcyW6_FZLSetiZ8wPYZTCQ",
  "refresh_expires_at": "2026-10-29T02:14:40.596572214Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "950c890e-4815-4a70-a065-932a58a814d8",
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
  "id": "111623af-6a63-40a7-ad3f-db650d9ba05a",
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
  "created_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "created_at": "2026-10-28T14:14:40.898509Z",
  "updated_at": "2026-10-28T14:14:40.898509Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636608696",
  "device_ref": "sandbox-11064"
}
```

```json
{
  "challenge_id": "50c5b154-b673-4e5f-82a1-d22ffca73274",
  "expires_at": "2026-10-28T14:19:41.194393096Z",
  "resend_available_at": "2026-10-28T14:14:42.194393096Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636608696` → **200**

```json
{
  "phone": "+380636608696",
  "audience": "CLIENT",
  "code": "383391",
  "sent_at": "2026-10-28T14:14:41.203326584Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50c5b154-b673-4e5f-82a1-d22ffca73274",
  "code": "383391",
  "device_ref": "sandbox-11064"
}
```

```json
{
  "session_id": "0ef30d53-e03e-4e4f-a608-a231df03e78c",
  "subject": {
    "type": "CLIENT",
    "id": "e965c00d-a26c-4031-99b4-ed7cb04535e0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlOTY1YzAwZC1hMjZjLTQwMzEtOTliNC1lZDdjYjA0NTM1ZTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3NzgxLCJpYXQiOjE3OTMxOTY4ODEsImp0aSI6IjcyNjcxNTEzLWFjYzEtNGU5MC05ZDg5LTM5ODdhNjZiNDFlNyIsInNpZCI6IjBlZjMwZDUzLWUwM2UtNGU0Zi1hNjA4LWEyMzFkZjAzZTc4YyJ9.omOUdayp3wDaJWafLwgZ21G10et-TVyDdsrQmRVCQpA",
  "access_expires_at": "2026-10-28T14:29:41.529603485Z",
  "refresh_token": "cWQJPfz4VdsT0la_aSlzYTjQ8ZT0sxyllq5XSQIjWVU",
  "refresh_expires_at": "2026-11-27T14:14:41.528633931Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636608696` → **200**

```json
{
  "client_id": "e965c00d-a26c-4031-99b4-ed7cb04535e0"
}
```

`POST /api/admin/v1/rider-wallets/e965c00d-a26c-4031-99b4-ed7cb04535e0/top-ups` → **201**

```json
{
  "command_id": "f493e95e-9754-4d4f-837b-e5e05862c2d1",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e965c00d-a26c-4031-99b4-ed7cb04535e0",
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
      "id": "898900ed-3030-42e0-8937-de075cfa4faf",
      "at": "2026-10-28T14:14:42.06727Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "13983ec6-893e-44ff-a46a-fb7fd98d50a0",
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
  "id": "2038d8c5-a444-447e-a0dd-79b8eaac200b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:19:42.492736Z",
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
      "id": "111623af-6a63-40a7-ad3f-db650d9ba05a",
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
  "device_ref": "sandbox-32022"
}
```

```json
{
  "challenge_id": "cd5964af-460c-4a9b-acfa-1d9c238c5213",
  "expires_at": "2026-10-28T14:19:42.795713729Z",
  "resend_available_at": "2026-10-28T14:14:43.795713729Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "887721",
  "sent_at": "2026-10-28T14:14:42.799316387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd5964af-460c-4a9b-acfa-1d9c238c5213",
  "code": "887721",
  "device_ref": "sandbox-32022"
}
```

```json
{
  "session_id": "3edd5313-9962-4985-8cd0-5f9023ad00e3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzc4MywiaWF0IjoxNzkzMTk2ODgzLCJqdGkiOiJjYTllYWVkNy0wYjI3LTQ1NzktYWQ5ZC01ZWVlMDIzYTlmOGIiLCJzaWQiOiIzZWRkNTMxMy05OTYyLTQ5ODUtOGNkMC01ZjkwMjNhZDAwZTMifQ.VvlHWkAI0OJ0jC6jB11Oiit5z3SmvfL69KU5lfAPr6U",
  "access_expires_at": "2026-10-28T14:29:43.092746727Z",
  "refresh_token": "7VPoTGd6TeDqxGdkiZhdAkaUv5weQI4zbyGNvKkuX5A",
  "refresh_expires_at": "2026-11-27T14:14:43.091773083Z",
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
  "command_id": "9dfe3889-79d8-4e46-930e-833127eaeea1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:14:43Z",
    "sequence": 1793196883631
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63fe0e63-4ec3-4b45-b83a-935b579c3609",
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
  "last_heartbeat_at": "2026-10-28T14:14:43.677454Z",
  "last_location_at": "2026-10-28T14:14:43.677454Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d0f1d440-b594-4a67-bc86-4a87cc561066",
  "quote_id": "2038d8c5-a444-447e-a0dd-79b8eaac200b",
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
  "id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e965c00d-a26c-4031-99b4-ed7cb04535e0",
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
  "created_at": "2026-10-28T14:14:44.010507Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "pickup_eta": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e965c00d-a26c-4031-99b4-ed7cb04535e0",
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
      "id": "898900ed-3030-42e0-8937-de075cfa4faf",
      "at": "2026-10-28T14:14:42.06727Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
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
    "id": "62e2c5b2-bba3-4a96-8f06-2ea9ab5f2142",
    "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
    "expires_at": "2026-10-28T14:14:59.024495Z",
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

`POST /api/driver/v1/offers/62e2c5b2-bba3-4a96-8f06-2ea9ab5f2142/accept` → **200**

```json
{
  "command_id": "bd62a264-1d32-4d1d-8096-7d9938902f42"
}
```

```json
{
  "id": "5b46a975-9944-4185-8d92-7ab8b8ce3f39",
  "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "72611f8f-24b1-4e16-9847-cf59fc3f06ca",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "72611f8f-24b1-4e16-9847-cf59fc3f06ca",
  "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
  "assignment_id": "5b46a975-9944-4185-8d92-7ab8b8ce3f39",
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

`POST /api/driver/v1/work-sessions/63fe0e63-4ec3-4b45-b83a-935b579c3609/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:14:45Z",
    "sequence": 1793196885439
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63fe0e63-4ec3-4b45-b83a-935b579c3609",
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
  "last_heartbeat_at": "2026-10-28T14:14:45.466115Z",
  "last_location_at": "2026-10-28T14:14:45.466115Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/72611f8f-24b1-4e16-9847-cf59fc3f06ca/arrive` → **200**

```json
{
  "command_id": "b2072c2d-2d03-4303-880b-fb87518f4380",
  "expected_version": 0
}
```

```json
{
  "id": "72611f8f-24b1-4e16-9847-cf59fc3f06ca",
  "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
  "assignment_id": "5b46a975-9944-4185-8d92-7ab8b8ce3f39",
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
  "arrived_at": "2026-10-28T14:14:45.75282Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/72611f8f-24b1-4e16-9847-cf59fc3f06ca/start` → **200**

```json
{
  "command_id": "64fa08ec-93b7-4abc-b751-b232965b20b2",
  "expected_version": 1
}
```

```json
{
  "id": "72611f8f-24b1-4e16-9847-cf59fc3f06ca",
  "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
  "assignment_id": "5b46a975-9944-4185-8d92-7ab8b8ce3f39",
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
  "arrived_at": "2026-10-28T14:14:45.75282Z",
  "started_at": "2026-10-28T14:14:46.03776Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/72611f8f-24b1-4e16-9847-cf59fc3f06ca/complete` → **200**

```json
{
  "command_id": "460c4736-4b2c-41e7-81f5-8a9715cd52e4",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:14:46Z",
  "cash_received": true
}
```

```json
{
  "id": "72611f8f-24b1-4e16-9847-cf59fc3f06ca",
  "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
  "assignment_id": "5b46a975-9944-4185-8d92-7ab8b8ce3f39",
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
  "arrived_at": "2026-10-28T14:14:45.75282Z",
  "started_at": "2026-10-28T14:14:46.03776Z",
  "completed_at": "2026-10-28T14:14:46.351085Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e965c00d-a26c-4031-99b4-ed7cb04535e0",
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
      "id": "672b52f0-2a1d-4899-81cc-5f60c5102594",
      "at": "2026-10-28T14:14:47.135634Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c"
    },
    {
      "id": "898900ed-3030-42e0-8937-de075cfa4faf",
      "at": "2026-10-28T14:14:42.06727Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/111623af-6a63-40a7-ad3f-db650d9ba05a/archive` → **200**

```json
{
  "command_id": "62797d0a-6671-45b4-8631-298773ad0172",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "111623af-6a63-40a7-ad3f-db650d9ba05a",
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
  "created_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "created_at": "2026-10-28T14:14:40.898509Z",
  "updated_at": "2026-10-28T14:14:49.930342Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "63fe0e63-4ec3-4b45-b83a-935b579c3609",
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
  "last_heartbeat_at": "2026-10-28T14:14:45.466115Z",
  "last_location_at": "2026-10-28T14:14:45.466115Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/63fe0e63-4ec3-4b45-b83a-935b579c3609/close` → **200**

```json
{
  "command_id": "221f92c3-75e9-4682-bc24-2e3113f00a3a",
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

Done: order 6e3aba38-eef2-450a-b7cc-a14f8533453c.

# Scenario: call-recording

## The admin says which city the service number belongs to

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
  "session_id": "4c95a399-1289-4d74-b919-589faf246019",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3OTEsImlhdCI6MTc5MzE5Njg5MSwianRpIjoiZmU4NDk2NTEtZTlmYS00NjI3LWEyNTYtMmU1OTNmNTYyNDRhIiwic2lkIjoiNGM5NWEzOTktMTI4OS00ZDc0LWI5MTktNTg5ZmFmMjQ2MDE5In0.tgyx5nYH-_iuS4uN7unQAG2H-EmQ5a1m4fuEcv0vKx0",
  "access_expires_at": "2026-10-28T14:29:51.061431963Z",
  "refresh_token": "Q7qWTxKpp6s_T1hRSjZpiEk2pT8alR96mxJdKiggbS8",
  "refresh_expires_at": "2026-10-29T02:14:51.060675776Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": []
}
```

`POST /api/admin/v1/call-lines/%2B380441110060` → **200**

```json
{
  "command_id": "cd6af478-3075-419b-8451-1f7575ece45d",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox call-recording scenario"
}
```

```json
{
  "number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
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
  "session_id": "d43be8f6-00db-40b8-b39c-b66a9c553f50",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc3OTIsImlhdCI6MTc5MzE5Njg5MiwianRpIjoiOGUyNDBjMzItZWVmZS00MDFlLWE1ZjgtZmEzZTQ1ZTJmOTEzIiwic2lkIjoiZDQzYmU4ZjYtMDBkYi00MGI4LWIzOWMtYjY2YTljNTUzZjUwIn0.noWq_8a5vZ5DGxvbQNxrsxfqAAkshJPRro5p0-QNPu4",
  "access_expires_at": "2026-10-28T14:29:52.179847356Z",
  "refresh_token": "fSl3NHFA8NtxP2Ac8_w-G7RDK5HiIPvk0b9IBT7m0Hs",
  "refresh_expires_at": "2026-10-29T02:14:52.179062065Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3128122034",
    "linkedid": "1730052700.3128122034",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675724469"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052700.3128122034",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "67cea02f-b06c-4b44-997e-b9186b799b6a",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.445515Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:14:52.470289Z",
      "recording": null
    }
  ]
}
```

## A call is taken and ends: its recording is fetched from Asterisk

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052600.423917147",
    "linkedid": "1730052600.423917147",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675724469"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110060"
    }
  }
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d/answer` → **200**

```json
{
  "command_id": "4864f9b4-328c-453c-9499-5d182cdd4fe4"
}
```

```json
{
  "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675724469",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "order_ids": [],
  "started_at": "2026-10-28T14:14:52.795571Z",
  "answered_at": "2026-10-28T14:14:53.111885Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.423917147",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052600.423917147",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": "2026-10-28T14:14:53.111885Z",
      "ended_at": "2026-10-28T14:14:53.407644Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": "2026-10-28T14:14:53.111885Z",
      "ended_at": "2026-10-28T14:14:53.407644Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": "2026-10-28T14:14:53.111885Z",
      "ended_at": "2026-10-28T14:14:53.407644Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": "2026-10-28T14:14:53.111885Z",
      "ended_at": "2026-10-28T14:14:53.407644Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:14:58.920731Z"
      }
    }
  ]
}
```

Recording: STORED

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": "2026-10-28T14:14:53.111885Z",
      "ended_at": "2026-10-28T14:14:53.407644Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:14:58.920731Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d` → **200**

```json
{
  "changes": [
    {
      "id": "4909d475-11b2-48d4-8d35-30f884b56312",
      "occurred_at": "2026-10-28T14:15:00.841116Z",
      "actor_type": "STAFF",
      "actor_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"73adc4f2-46c4-47a3-b6f3-ca05d2e51b93\", \"order_ids\": []}",
      "correlation_id": "38d3598e-a187-41fd-949a-4255be1bf3d2"
    },
    {
      "id": "bf944915-d0e6-4227-833d-bab731a3ef38",
      "occurred_at": "2026-10-28T14:15:00.808376Z",
      "actor_type": "STAFF",
      "actor_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"73adc4f2-46c4-47a3-b6f3-ca05d2e51b93\", \"order_ids\": []}",
      "correlation_id": "b65a1748-02c6-4cf6-aab2-0a5fe928b66c"
    }
  ]
}
```

Done: call e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-289"
}
```

```json
{
  "challenge_id": "4b53ed4b-a221-426e-b508-87ea77fca253",
  "expires_at": "2026-10-28T14:20:01.15089788Z",
  "resend_available_at": "2026-10-28T14:15:02.15089788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "150442",
  "sent_at": "2026-10-28T14:15:01.154718034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b53ed4b-a221-426e-b508-87ea77fca253",
  "code": "150442",
  "device_ref": "sandbox-289"
}
```

```json
{
  "session_id": "5b10fbd5-2ce2-4347-9182-d9fc74366eee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgwMSwiaWF0IjoxNzkzMTk2OTAxLCJqdGkiOiI2YThiMjYwNy1lMWYyLTQ4OWQtOTYzYy1jM2Q4NDdkY2VlMTkiLCJzaWQiOiI1YjEwZmJkNS0yY2UyLTQzNDctOTE4Mi1kOWZjNzQzNjZlZWUifQ.uApRgNOwef-CyRSVAFY0GZ6jYB9vSQE7pMN07qPHy_w",
  "access_expires_at": "2026-10-28T14:30:01.443556017Z",
  "refresh_token": "a2wc_B8nxbTYbL1P-LLwgwfPzXw6sy-PDhkYUVVCorY",
  "refresh_expires_at": "2026-11-27T14:15:01.442830688Z",
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
  "command_id": "c9d83114-0413-4c97-935b-956ae5a56b00",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:01Z",
    "sequence": 1793196901973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6463589-8310-45b6-91cc-18f0b40bdc1b",
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
  "last_heartbeat_at": "2026-10-28T14:15:01.992592Z",
  "last_location_at": "2026-10-28T14:15:01.992592Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The operator takes a phone order for a caller without the app

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
  "session_id": "999d02a6-8422-478d-bcc8-8f19e7dad46e",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4MDIsImlhdCI6MTc5MzE5NjkwMiwianRpIjoiNjFmNGZkY2ItNzlkMy00MmU3LWI5Y2EtZWVjY2ZkMmY3OTM3Iiwic2lkIjoiOTk5ZDAyYTYtODQyMi00NzhkLWJjYzgtOGYxOWU3ZGFkNDZlIn0.hB04y889wxP8kjT-kfAs26amTjDtkV6COgCpDefOcoA",
  "access_expires_at": "2026-10-28T14:30:02.554146639Z",
  "refresh_token": "nJjsYeVCB4kdcyW4zSNkohPLSMq_Zt7OL66zENb_OXY",
  "refresh_expires_at": "2026-10-29T02:15:02.553500279Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "fa0cc39b-9f91-4d36-9537-4d95143928e3",
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
  "id": "83923508-1c32-47e2-b545-6dda7f63097c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:02.822668Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "8d5dd821-65f1-47ff-af5a-c28d4dc8ce8a",
  "quote_id": "83923508-1c32-47e2-b545-6dda7f63097c",
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
  "caller": {
    "name": "Олена",
    "phone": "+380677263502"
  }
}
```

```json
{
  "id": "10a00574-ae62-4930-925c-804eece9de09",
  "short_number": 2,
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
  "created_at": "2026-10-28T14:15:03.131208Z",
  "caller": {
    "name": "Олена",
    "phone": "+380677263502"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Ivan accepts: the caller gets the car and the plate by SMS

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "80a944d7-affb-4aaf-b2ea-b5f5ae3a12bd",
    "order_id": "10a00574-ae62-4930-925c-804eece9de09",
    "expires_at": "2026-10-28T14:15:18.136256Z",
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
    "distance_m": 100
  }
]
```

`POST /api/driver/v1/offers/80a944d7-affb-4aaf-b2ea-b5f5ae3a12bd/accept` → **200**

```json
{
  "command_id": "0080c818-55fa-42c1-80f4-7bafe297b26a"
}
```

```json
{
  "id": "2fbb736b-32a0-4d7d-912e-5337585099d2",
  "order_id": "10a00574-ae62-4930-925c-804eece9de09",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "aaeaf568-ec52-4ef4-af2a-4e5248d0369b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "aaeaf568-ec52-4ef4-af2a-4e5248d0369b",
  "order_id": "10a00574-ae62-4930-925c-804eece9de09",
  "assignment_id": "2fbb736b-32a0-4d7d-912e-5337585099d2",
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
    "name": "Олена",
    "phone": "+380677263502"
  }
}
```

`POST /api/driver/v1/work-sessions/d6463589-8310-45b6-91cc-18f0b40bdc1b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:06Z",
    "sequence": 1793196906344
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6463589-8310-45b6-91cc-18f0b40bdc1b",
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
  "last_heartbeat_at": "2026-10-28T14:15:06.364466Z",
  "last_location_at": "2026-10-28T14:15:06.364466Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/aaeaf568-ec52-4ef4-af2a-4e5248d0369b/arrive` → **200**

```json
{
  "command_id": "1c701b7b-3020-4bd7-9d41-af52be78d825",
  "expected_version": 0
}
```

```json
{
  "id": "aaeaf568-ec52-4ef4-af2a-4e5248d0369b",
  "order_id": "10a00574-ae62-4930-925c-804eece9de09",
  "assignment_id": "2fbb736b-32a0-4d7d-912e-5337585099d2",
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
  "arrived_at": "2026-10-28T14:15:06.638811Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677263502"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  },
  {
    "phone": "+380677263502",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:08.100238084Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  },
  {
    "phone": "+380677263502",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:08.100238084Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380677263502` → **200**

```json
[
  {
    "phone": "+380677263502",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:05.091752654Z"
  },
  {
    "phone": "+380677263502",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-28T14:15:08.100238084Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/aaeaf568-ec52-4ef4-af2a-4e5248d0369b/start` → **200**

```json
{
  "command_id": "ada3d068-c099-4419-9b2f-41be778e1433",
  "expected_version": 1
}
```

```json
{
  "id": "aaeaf568-ec52-4ef4-af2a-4e5248d0369b",
  "order_id": "10a00574-ae62-4930-925c-804eece9de09",
  "assignment_id": "2fbb736b-32a0-4d7d-912e-5337585099d2",
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
  "arrived_at": "2026-10-28T14:15:06.638811Z",
  "started_at": "2026-10-28T14:15:09.052139Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380677263502"
  }
}
```

`POST /api/driver/v1/trips/aaeaf568-ec52-4ef4-af2a-4e5248d0369b/complete` → **200**

```json
{
  "command_id": "855e8de7-f573-48c8-9be6-936a4491d5a8",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:15:09Z",
  "cash_received": true
}
```

```json
{
  "id": "aaeaf568-ec52-4ef4-af2a-4e5248d0369b",
  "order_id": "10a00574-ae62-4930-925c-804eece9de09",
  "assignment_id": "2fbb736b-32a0-4d7d-912e-5337585099d2",
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
  "arrived_at": "2026-10-28T14:15:06.638811Z",
  "started_at": "2026-10-28T14:15:09.052139Z",
  "completed_at": "2026-10-28T14:15:09.336883Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

Done: two SMS to the caller of a phone order.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d6463589-8310-45b6-91cc-18f0b40bdc1b",
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
  "last_heartbeat_at": "2026-10-28T14:15:06.364466Z",
  "last_location_at": "2026-10-28T14:15:06.364466Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d6463589-8310-45b6-91cc-18f0b40bdc1b/close` → **200**

```json
{
  "command_id": "ed276090-34fb-4d52-b56d-bf5c47d2e949",
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

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634368662",
  "device_ref": "sandbox-28781"
}
```

```json
{
  "challenge_id": "ef8ccfd4-232e-4db1-a7c4-b1f1ffabce5f",
  "expires_at": "2026-10-28T14:20:10.17940735Z",
  "resend_available_at": "2026-10-28T14:15:11.17940735Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634368662` → **200**

```json
{
  "phone": "+380634368662",
  "audience": "CLIENT",
  "code": "801990",
  "sent_at": "2026-10-28T14:15:10.185093803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef8ccfd4-232e-4db1-a7c4-b1f1ffabce5f",
  "code": "801990",
  "device_ref": "sandbox-28781"
}
```

```json
{
  "session_id": "9dadb14c-8657-4578-8def-50871891301f",
  "subject": {
    "type": "CLIENT",
    "id": "ddbb681e-83ae-40c8-b569-91e3d4740657"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkZGJiNjgxZS04M2FlLTQwYzgtYjU2OS05MWUzZDQ3NDA2NTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODEwLCJpYXQiOjE3OTMxOTY5MTAsImp0aSI6ImIyNDBiNWFiLWFhM2YtNDA3MC1iYzU1LWVkNDlmMzRlYzM4MCIsInNpZCI6IjlkYWRiMTRjLTg2NTctNDU3OC04ZGVmLTUwODcxODkxMzAxZiJ9.4_JuoBXJ7shaD7rlvDa8kiO_2eegGWnjEBTA4QOOsdc",
  "access_expires_at": "2026-10-28T14:30:10.478249503Z",
  "refresh_token": "V53Z3jP1vnCY0-B9g8T0GCs8Re3b8-Et6HE0xlLO8JM",
  "refresh_expires_at": "2026-11-27T14:15:10.477594145Z",
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
  "device_ref": "sandbox-24884"
}
```

```json
{
  "challenge_id": "a9ad4cac-51d3-4bbb-868d-482070e0f651",
  "expires_at": "2026-10-28T14:20:10.999908903Z",
  "resend_available_at": "2026-10-28T14:15:11.999908903Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "258456",
  "sent_at": "2026-10-28T14:15:11.002951506Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9ad4cac-51d3-4bbb-868d-482070e0f651",
  "code": "258456",
  "device_ref": "sandbox-24884"
}
```

```json
{
  "session_id": "144bf08d-0409-4c90-9f96-b147e7b8d813",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgxMSwiaWF0IjoxNzkzMTk2OTExLCJqdGkiOiI0ZTIxMDAyYy00NDYwLTRiNTAtOTZiZC1jYzA3ZGZiZjA4ZjYiLCJzaWQiOiIxNDRiZjA4ZC0wNDA5LTRjOTAtOWY5Ni1iMTQ3ZTdiOGQ4MTMifQ.UC93kLn4n5uYtJly6Zz-lgogYBhrY6qe-l9pRtNbFPo",
  "access_expires_at": "2026-10-28T14:30:11.2886338Z",
  "refresh_token": "yX4-biRk-jdpVlA3KIVQtgNwk38plP0ReQ2Hg1IG6Bw",
  "refresh_expires_at": "2026-11-27T14:15:11.287848689Z",
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
  "session_id": "b7989dc5-7d24-4bac-abeb-927a09d2fb3e",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4MTIsImlhdCI6MTc5MzE5NjkxMiwianRpIjoiMjZkZDc4MjYtMmM0MC00OWI2LThlOGItNTY4NGNhMWEwYWRmIiwic2lkIjoiYjc5ODlkYzUtN2QyNC00YmFjLWFiZWItOTI3YTA5ZDJmYjNlIn0.GlSAKNF82C1m1gFLN_cJzpfjHdQ6uT1zoiYg1XGzLmI",
  "access_expires_at": "2026-10-28T14:30:12.099241296Z",
  "refresh_token": "xDkD6ItuhMNOIBv4LY_af1-xsnQSXfyLpeNqfmWSDdk",
  "refresh_expires_at": "2026-10-29T02:15:12.098557641Z",
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
  "session_id": "e33de7d5-f1f9-400e-bd5d-9ffd469e9b5f",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4MTIsImlhdCI6MTc5MzE5NjkxMiwianRpIjoiMTQ5NTVmYjktZTFmOC00OWExLWEzNWYtZTQxYTNhYTQ4ZDQ0Iiwic2lkIjoiZTMzZGU3ZDUtZjFmOS00MDBlLWJkNWQtOWZmZDQ2OWU5YjVmIn0.sOE8j4ZyAHihCMLSy4gvT8HXpweWbAdbEPcEKeVbQ1Y",
  "access_expires_at": "2026-10-28T14:30:12.668501224Z",
  "refresh_token": "-XOKSmiRZbL4AzzzXa2OXsUNB390geWXCJ_fhdhcCnQ",
  "refresh_expires_at": "2026-10-29T02:15:12.667826851Z",
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
  "command_id": "bb60d3c7-d311-41a1-be28-d8ddb5ee865f",
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
  "id": "a81c61cd-7c8a-4783-a3ed-5192ef6b0944",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:13.199735Z",
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
  "command_id": "e5375422-70c7-43e2-901c-f0f8f2908ddc",
  "quote_id": "a81c61cd-7c8a-4783-a3ed-5192ef6b0944",
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
  "id": "f378f00b-2693-4509-aecc-690565b9176a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ddbb681e-83ae-40c8-b569-91e3d4740657",
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
  "created_at": "2026-10-28T14:15:13.482102Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f378f00b-2693-4509-aecc-690565b9176a` → **200**

```json
{
  "id": "f378f00b-2693-4509-aecc-690565b9176a",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ddbb681e-83ae-40c8-b569-91e3d4740657",
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
  "created_at": "2026-10-28T14:15:13.482102Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f378f00b-2693-4509-aecc-690565b9176a/cancel` → **200**

```json
{
  "command_id": "3eaad234-c77e-4c2d-93ff-1a80919bb3ac",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f378f00b-2693-4509-aecc-690565b9176a",
  "short_number": 3,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ddbb681e-83ae-40c8-b569-91e3d4740657",
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
  "created_at": "2026-10-28T14:15:13.482102Z",
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
  "discount_minor": 0,
  "pickup_eta": null
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
  "command_id": "0fdb879f-c99a-4cb3-a1d3-e779ad9271a4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:14Z",
    "sequence": 1793196914613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4238054c-f2de-44c2-a1bd-1c55999e5b55",
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
  "last_heartbeat_at": "2026-10-28T14:15:14.632009Z",
  "last_location_at": "2026-10-28T14:15:14.632009Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27765"
}
```

```json
{
  "challenge_id": "ae41cc95-5b5c-42b8-8212-afb77c1d342d",
  "expires_at": "2026-10-28T14:20:14.897814944Z",
  "resend_available_at": "2026-10-28T14:15:15.897814944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "933991",
  "sent_at": "2026-10-28T14:15:14.900689329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae41cc95-5b5c-42b8-8212-afb77c1d342d",
  "code": "933991",
  "device_ref": "sandbox-27765"
}
```

```json
{
  "session_id": "7e7ad252-1b9a-4c1c-ab0c-df14a4585c4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgxNSwiaWF0IjoxNzkzMTk2OTE1LCJqdGkiOiI0ZjE2M2IwZi1lODc5LTRjMGYtYTdiZS1hODZiMDRkYzEyOWUiLCJzaWQiOiI3ZTdhZDI1Mi0xYjlhLTRjMWMtYWIwYy1kZjE0YTQ1ODVjNGEifQ.Xka04xnSFTC7JPOCcZ2Ni8mEjTdFlXB23d5APHahMZc",
  "access_expires_at": "2026-10-28T14:30:15.203557252Z",
  "refresh_token": "u3suwMycCZXyLpi-h5c3snMIqSLq5txKsYUPdX75xWs",
  "refresh_expires_at": "2026-11-27T14:15:15.202912134Z",
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
  "command_id": "974beb68-aa82-43e1-8d88-62e8b1040728",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:15Z",
    "sequence": 1793196915722
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:15.74091Z",
  "last_location_at": "2026-10-28T14:15:15.74091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "18e780be-f4cd-4141-b9d8-43107e1827f7",
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
  "id": "325d12e0-7dd8-4ba4-bcc5-430994fe68d1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:16.031509Z",
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
  "command_id": "1f6847e5-b9a0-441e-9eb1-cf4205dc2fd3",
  "quote_id": "325d12e0-7dd8-4ba4-bcc5-430994fe68d1",
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
  "id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ddbb681e-83ae-40c8-b569-91e3d4740657",
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
  "created_at": "2026-10-28T14:15:16.315123Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3ed69d58-67ac-47f3-8daa-1c8054c79ff1",
    "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
    "expires_at": "2026-10-28T14:15:31.318876Z",
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

`POST /api/driver/v1/offers/3ed69d58-67ac-47f3-8daa-1c8054c79ff1/accept` → **200**

```json
{
  "command_id": "a13eb379-6968-440a-86a4-f9d738fd0e6b"
}
```

```json
{
  "id": "239736c8-21a4-4afa-a4b9-defd12ffb8d7",
  "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dfec625b-7dc9-40c5-9ae7-3da520c492cf",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dfec625b-7dc9-40c5-9ae7-3da520c492cf",
  "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "assignment_id": "239736c8-21a4-4afa-a4b9-defd12ffb8d7",
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

`POST /api/driver/v1/trips/dfec625b-7dc9-40c5-9ae7-3da520c492cf/cancel` → **200**

```json
{
  "command_id": "e410e3ef-4e6e-4f0f-b5a6-8bf0f529ff54",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "dfec625b-7dc9-40c5-9ae7-3da520c492cf",
  "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "assignment_id": "239736c8-21a4-4afa-a4b9-defd12ffb8d7",
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

`GET /api/rider/v1/orders/ec4f3a3e-8481-4197-a10b-d6e4cf7141ca` → **200**

```json
{
  "id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ddbb681e-83ae-40c8-b569-91e3d4740657",
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
    "id": "239736c8-21a4-4afa-a4b9-defd12ffb8d7",
    "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dfec625b-7dc9-40c5-9ae7-3da520c492cf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:15:16.315123Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii gets it and cancels: «Пассажир попросил отменить»

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "633fff0a-c1b7-4aba-8a8b-592f80e662e9",
    "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
    "expires_at": "2026-10-28T14:15:32.430294Z",
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

`POST /api/driver/v1/offers/633fff0a-c1b7-4aba-8a8b-592f80e662e9/accept` → **200**

```json
{
  "command_id": "b357c103-d781-4eea-9843-4cb2f1d4f398"
}
```

```json
{
  "id": "778fd6a3-40c6-45a2-ab21-bb463cda8dc4",
  "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "95d06544-f6cc-4b62-8bcf-778dd5a2889c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "95d06544-f6cc-4b62-8bcf-778dd5a2889c",
  "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "assignment_id": "778fd6a3-40c6-45a2-ab21-bb463cda8dc4",
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

`POST /api/driver/v1/trips/95d06544-f6cc-4b62-8bcf-778dd5a2889c/cancel` → **200**

```json
{
  "command_id": "69d24d0e-7172-4f2b-84a8-74c8efbbca82",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "95d06544-f6cc-4b62-8bcf-778dd5a2889c",
  "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
  "assignment_id": "778fd6a3-40c6-45a2-ab21-bb463cda8dc4",
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
    "id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:15:16.315123Z",
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
    "id": "f378f00b-2693-4509-aecc-690565b9176a",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:15:13.482102Z",
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

`GET /api/operator/v1/orders/ec4f3a3e-8481-4197-a10b-d6e4cf7141ca/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:15:16.315733Z",
      "actor": {
        "type": "CLIENT",
        "id": "ddbb681e-83ae-40c8-b569-91e3d4740657",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
        "quote_id": "325d12e0-7dd8-4ba4-bcc5-430994fe68d1",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "45bb5dab-c0c8-4111-8bcd-37fdd8129180"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:15:16.317866Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
        "attempt_id": "e36d0c25-5145-496c-983b-96a947cd7b41",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "45bb5dab-c0c8-4111-8bcd-37fdd8129180"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:15:16.325492Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3ed69d58-67ac-47f3-8daa-1c8054c79ff1",
        "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "45bb5dab-c0c8-4111-8bcd-37fdd8129180"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:15:16.870857Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3ed69d58-67ac-47f3-8daa-1c8054c79ff1",
        "order_id": "ec4f3a3e-8481-4197-a10b-d6e4cf7141ca",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "239736c8-21a4-4afa-a4b9-defd12ffb8d7"
      },
      "correlation_id": "9200d7ba-15b3-450f-a27f-95e88737ace7"
```

Done: orders f378f00b-2693-4509-aecc-690565b9176a, ec4f3a3e-8481-4197-a10b-d6e4cf7141ca.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737984174",
  "device_ref": "sandbox-15972"
}
```

```json
{
  "challenge_id": "b67edc81-51ab-4adf-ac8f-d202f4d04512",
  "expires_at": "2026-10-28T14:20:19.657379312Z",
  "resend_available_at": "2026-10-28T14:15:20.657379312Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737984174` → **200**

```json
{
  "phone": "+380737984174",
  "audience": "CLIENT",
  "code": "996473",
  "sent_at": "2026-10-28T14:15:19.660087156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b67edc81-51ab-4adf-ac8f-d202f4d04512",
  "code": "996473",
  "device_ref": "sandbox-15972"
}
```

```json
{
  "session_id": "bed979e6-43cf-4233-83d1-93ce22b04a12",
  "subject": {
    "type": "CLIENT",
    "id": "9b06ad7b-8c3f-4846-a415-309cdde24265"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YjA2YWQ3Yi04YzNmLTQ4NDYtYTQxNS0zMDljZGRlMjQyNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODE5LCJpYXQiOjE3OTMxOTY5MTksImp0aSI6ImIyM2NkZDZkLWVmNWYtNGU1Ni05YjZjLWQ5OTU1ZmNlMWJlNiIsInNpZCI6ImJlZDk3OWU2LTQzY2YtNDIzMy04M2QxLTkzY2UyMmIwNGExMiJ9.apfaMpyKbdEP56xCvfHKONReDRyT8bwHLOprG5vGawo",
  "access_expires_at": "2026-10-28T14:30:19.952568798Z",
  "refresh_token": "-Awul6DDNfXEgNtkIwmGaVX8wQ6_L5pglOXHtQBEcow",
  "refresh_expires_at": "2026-11-27T14:15:19.951927356Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "d6357e80-ca7e-4265-9156-1ee2f236e83e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "e41e2d86-7d95-477b-9839-88e55e99f877",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-e41e2d86-7d95-477b-9839-88e55e99f877",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "accbd5fabf0cf8f959cb652df601a681",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=e41e2d86-7d95-477b-9839-88e55e99f877",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737984174"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=e41e2d86-7d95-477b-9839-88e55e99f877",
  "expires_at": "2026-10-28T14:45:20.243771Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/e41e2d86-7d95-477b-9839-88e55e99f877` → **200**

```json
{
  "id": "e41e2d86-7d95-477b-9839-88e55e99f877",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:45:20.243771Z",
  "card": {
    "id": "079e3c40-285a-480a-af2c-702978aec21f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5522",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:15:20.533854Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "079e3c40-285a-480a-af2c-702978aec21f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5522",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:15:20.533854Z"
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
  "device_ref": "sandbox-13355"
}
```

```json
{
  "challenge_id": "ec43de4c-792f-4615-9438-7a3b4623311a",
  "expires_at": "2026-10-28T14:20:21.110520366Z",
  "resend_available_at": "2026-10-28T14:15:22.110520366Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "079157",
  "sent_at": "2026-10-28T14:15:21.113440718Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec43de4c-792f-4615-9438-7a3b4623311a",
  "code": "079157",
  "device_ref": "sandbox-13355"
}
```

```json
{
  "session_id": "c2b4998e-45de-4564-9085-b7f090ce708d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzgyMSwiaWF0IjoxNzkzMTk2OTIxLCJqdGkiOiJjMjI4NGRmYS1mNGVkLTQ2ZDEtYTJlMy1iMzk2NmRkNTI1MGMiLCJzaWQiOiJjMmI0OTk4ZS00NWRlLTQ1NjQtOTA4NS1iN2YwOTBjZTcwOGQifQ.yU0v_EnIStlQtdxe1LoeOsDnYUTtvcxPkMoUUAG9MkE",
  "access_expires_at": "2026-10-28T14:30:21.402578466Z",
  "refresh_token": "phMf6bKt6LRPRLQrq01dRMWBE3kzeuLj2156vty6PWw",
  "refresh_expires_at": "2026-11-27T14:15:21.401962302Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:15.74091Z",
  "last_location_at": "2026-10-28T14:15:15.74091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d682093-be7e-456c-961f-419d9c55e4ce/handover` → **200**

```json
{
  "command_id": "50bb5ac6-6a02-4f79-99d1-144fb58e507a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:15.74091Z",
  "last_location_at": "2026-10-28T14:15:15.74091Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d682093-be7e-456c-961f-419d9c55e4ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:22Z",
    "sequence": 1793196922205
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:22.224418Z",
  "last_location_at": "2026-10-28T14:15:22.224418Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "95e00356-2516-497c-a1b9-4c3a6c2078cf",
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
  "id": "9cf212f7-2c82-4e62-bb17-c1e2943c8022",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:22.497772Z",
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
  "command_id": "d85192ab-07f4-4c83-9edd-0cd6b0f71b5d",
  "quote_id": "9cf212f7-2c82-4e62-bb17-c1e2943c8022",
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
  "payment_method": "CARD",
  "wallet_minor": 0
}
```

```json
{
  "id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
  "created_at": "2026-10-28T14:15:22.781141Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c` → **200**

```json
{
  "id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "short_number": 5,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
  "created_at": "2026-10-28T14:15:22.781141Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c` → **200**

```json
{
  "id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
  "created_at": "2026-10-28T14:15:22.781141Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "326d279c-2590-4298-b4ef-c87b6a646952",
    "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
    "expires_at": "2026-10-28T14:15:38.361853Z",
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

`POST /api/driver/v1/offers/326d279c-2590-4298-b4ef-c87b6a646952/accept` → **200**

```json
{
  "command_id": "800167cf-404f-4d42-bcab-81c9007759dc"
}
```

```json
{
  "id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "154813b9-db71-417c-a5ec-ccabcf29d875",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "154813b9-db71-417c-a5ec-ccabcf29d875",
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "assignment_id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
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

`POST /api/driver/v1/work-sessions/1d682093-be7e-456c-961f-419d9c55e4ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:25Z",
    "sequence": 1793196925481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:25.500906Z",
  "last_location_at": "2026-10-28T14:15:25.500906Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/154813b9-db71-417c-a5ec-ccabcf29d875/arrive` → **200**

```json
{
  "command_id": "a5366b56-4b5a-4ead-a9a8-7f0a62f49dc2",
  "expected_version": 0
}
```

```json
{
  "id": "154813b9-db71-417c-a5ec-ccabcf29d875",
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "assignment_id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
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
  "arrived_at": "2026-10-28T14:15:25.775506Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/154813b9-db71-417c-a5ec-ccabcf29d875/start` → **200**

```json
{
  "command_id": "b8f9a051-6e06-48b5-b344-94cd2ef26a83",
  "expected_version": 1
}
```

```json
{
  "id": "154813b9-db71-417c-a5ec-ccabcf29d875",
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "assignment_id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
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
  "arrived_at": "2026-10-28T14:15:25.775506Z",
  "started_at": "2026-10-28T14:15:26.060268Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/154813b9-db71-417c-a5ec-ccabcf29d875/complete` → **200**

```json
{
  "command_id": "b68cdffa-98f8-4958-8b3e-e59679dda394",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:15:26Z",
  "cash_received": true
}
```

```json
{
  "id": "154813b9-db71-417c-a5ec-ccabcf29d875",
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "assignment_id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
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
  "arrived_at": "2026-10-28T14:15:25.775506Z",
  "started_at": "2026-10-28T14:15:26.060268Z",
  "completed_at": "2026-10-28T14:15:26.348452Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c` → **200**

```json
{
  "id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
    "id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
    "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "154813b9-db71-417c-a5ec-ccabcf29d875",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:15:22.781141Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c` → **200**

```json
{
  "id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "short_number": 5,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
    "id": "1eef2d92-0649-4f70-91c4-34d19ab66289",
    "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "154813b9-db71-417c-a5ec-ccabcf29d875",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:15:22.781141Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
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
      "id": "2bde1fbe-0964-45ef-b679-9c64de3d3d58",
      "at": "2026-10-28T14:15:26.427777Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c/tip` → **200**

```json
{
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
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
  "available_until": "2026-10-29T14:15:26.348452Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c/tip` → **201**

```json
{
  "command_id": "728a0de7-4b02-4b4e-a4f8-03a56e9e73b5",
  "amount_minor": 2500
}
```

```json
{
  "id": "61ce0f52-d629-4216-8f5d-7efece70320e",
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:15:29.023298Z"
}
```

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c/tip` → **200**

```json
{
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
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
  "available_until": "2026-10-29T14:15:26.348452Z",
  "open": false,
  "tip": {
    "id": "61ce0f52-d629-4216-8f5d-7efece70320e",
    "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:15:29.023298Z"
  }
}
```

`GET /api/rider/v1/orders/2a1b8ab9-e42b-4881-a19e-baf62ec36e9c/tip` → **200**

```json
{
  "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
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
  "available_until": "2026-10-29T14:15:26.348452Z",
  "open": false,
  "tip": {
    "id": "61ce0f52-d629-4216-8f5d-7efece70320e",
    "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:15:29.023298Z"
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
      "balance_minor": 16352
    }
  ],
  "entries": [
    {
      "id": "980cddd7-14a0-455c-aee2-a0c752490441",
      "at": "2026-10-28T14:15:30.490816Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    },
    {
      "id": "2bde1fbe-0964-45ef-b679-9c64de3d3d58",
      "at": "2026-10-28T14:15:26.427777Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "73cebc5d-0716-4415-941c-4c23cfba5d8f",
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
  "id": "230e4745-e37d-4f3a-8ef4-da5186ba95a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:31.112654Z",
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

## Bonuses cover the fare; 300 minor units remain for a larger card tip

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
  "session_id": "b6de822e-21a5-4d4e-b7fc-c5f7fbb277f7",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4MzEsImlhdCI6MTc5MzE5NjkzMSwianRpIjoiM2VhNGYzMjctYTNiNi00MmM1LTk2YjgtMDdkYTI4ZjBhNTkwIiwic2lkIjoiYjZkZTgyMmUtMjFhNS00ZDRlLWI3ZmMtYzVmN2ZiYjI3N2Y3In0.bSUdki-iE2Wxi-bbSqz51dmCwfXPgbwKuFqIsg9bJ2g",
  "access_expires_at": "2026-10-28T14:30:31.685152627Z",
  "refresh_token": "sk6gE2Y_5QG9-dStXo0Bb98Mox1rZIa2czBkqzaAxnI",
  "refresh_expires_at": "2026-10-29T02:15:31.684458958Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737984174` → **200**

```json
{
  "client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265"
}
```

`POST /api/admin/v1/rider-wallets/9b06ad7b-8c3f-4846-a415-309cdde24265/top-ups` → **201**

```json
{
  "command_id": "a4ffa151-34e2-43fa-8754-35d491e4ad78",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 0,
      "available_minor": 16597
    }
  ],
  "entries": [
    {
      "id": "49e93c5d-d818-41ec-8b88-aaf92e849ff4",
      "at": "2026-10-28T14:15:32.223151Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a320d18c-4300-40f3-99f2-9964dbfad43a",
  "quote_id": "230e4745-e37d-4f3a-8ef4-da5186ba95a0",
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
  "payment_method": "CARD",
  "wallet_minor": 16297
}
```

```json
{
  "id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T14:15:32.505246Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/db6b62a6-7a27-458b-955e-43e1507cc0ca` → **200**

```json
{
  "id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
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
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 16297,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "PERSONAL",
  "assignment": null,
  "created_at": "2026-10-28T14:15:32.505246Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Andrii takes it and drives

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "55bed714-3a6d-4ae1-b6ac-11b52c889bd7",
    "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
    "expires_at": "2026-10-28T14:15:47.510094Z",
    "vehicle_class": "STANDARD",
    "pickup": {
      "lat": 50.4437,
      "lon": 30.497
    },
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "payment_method": "CASH",
    "price_minor": 16297,
    "currency": "UAH",
    "distance_m": 11
  }
]
```

`POST /api/driver/v1/offers/55bed714-3a6d-4ae1-b6ac-11b52c889bd7/accept` → **200**

```json
{
  "command_id": "8161a51d-1483-42f1-b4bb-1fa0f80670d2"
}
```

```json
{
  "id": "45fe0b69-4e35-4981-bf03-63d9c0126650",
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ebdb55f7-b1d5-4323-86e3-50b60b86c44b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ebdb55f7-b1d5-4323-86e3-50b60b86c44b",
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "assignment_id": "45fe0b69-4e35-4981-bf03-63d9c0126650",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": null,
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1d682093-be7e-456c-961f-419d9c55e4ce/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:15:33Z",
    "sequence": 1793196933899
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:33.918906Z",
  "last_location_at": "2026-10-28T14:15:33.918906Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/ebdb55f7-b1d5-4323-86e3-50b60b86c44b/arrive` → **200**

```json
{
  "command_id": "08471717-5cbd-47f6-81a5-d895bb57d16b",
  "expected_version": 0
}
```

```json
{
  "id": "ebdb55f7-b1d5-4323-86e3-50b60b86c44b",
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "assignment_id": "45fe0b69-4e35-4981-bf03-63d9c0126650",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T14:15:34.203346Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ebdb55f7-b1d5-4323-86e3-50b60b86c44b/start` → **200**

```json
{
  "command_id": "c4397f15-4132-4dfb-bd1f-1a4a66c293e0",
  "expected_version": 1
}
```

```json
{
  "id": "ebdb55f7-b1d5-4323-86e3-50b60b86c44b",
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "assignment_id": "45fe0b69-4e35-4981-bf03-63d9c0126650",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T14:15:34.203346Z",
  "started_at": "2026-10-28T14:15:34.482777Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ebdb55f7-b1d5-4323-86e3-50b60b86c44b/complete` → **200**

```json
{
  "command_id": "1cad00ed-b453-41d5-a8fe-c341d1ece315",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:15:34Z",
  "cash_received": true
}
```

```json
{
  "id": "ebdb55f7-b1d5-4323-86e3-50b60b86c44b",
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "assignment_id": "45fe0b69-4e35-4981-bf03-63d9c0126650",
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
  "payment_method": "CASH",
  "price_minor": 16297,
  "currency": "UAH",
  "arrived_at": "2026-10-28T14:15:34.203346Z",
  "started_at": "2026-10-28T14:15:34.482777Z",
  "completed_at": "2026-10-28T14:15:34.767803Z",
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9b06ad7b-8c3f-4846-a415-309cdde24265",
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16597,
      "reserved_minor": 16297,
      "available_minor": 300
    }
  ],
  "entries": [
    {
      "id": "49e93c5d-d818-41ec-8b88-aaf92e849ff4",
      "at": "2026-10-28T14:15:32.223151Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_id": null
    }
  ]
}
```

`GET /api/driver/v1/balance` → **200**

```json
{
  "balances": [
    {
      "currency": "UAH",
      "balance_minor": 16352,
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "e206378e-d732-4120-bb57-c8441ad176da",
      "at": "2026-10-28T14:15:35.538959Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
      "counterpart_id": null
    },
    {
      "id": "980cddd7-14a0-455c-aee2-a0c752490441",
      "at": "2026-10-28T14:15:30.490816Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    },
    {
      "id": "2bde1fbe-0964-45ef-b679-9c64de3d3d58",
      "at": "2026-10-28T14:15:26.427777Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/db6b62a6-7a27-458b-955e-43e1507cc0ca/tip` → **200**

```json
{
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
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
  "method": "WALLET",
  "available_until": "2026-10-29T14:15:34.767803Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/db6b62a6-7a27-458b-955e-43e1507cc0ca/tip` → **201**

```json
{
  "command_id": "161b1211-eb07-41fd-8b46-8119d70144e9",
  "amount_minor": 2500
}
```

```json
{
  "id": "5db10683-a036-4310-8c71-5d2e4c7b83e1",
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:15:36.11786Z"
}
```

`GET /api/rider/v1/orders/db6b62a6-7a27-458b-955e-43e1507cc0ca/tip` → **200**

```json
{
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
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
  "method": "WALLET",
  "available_until": "2026-10-29T14:15:34.767803Z",
  "open": false,
  "tip": {
    "id": "5db10683-a036-4310-8c71-5d2e4c7b83e1",
    "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:15:36.11786Z"
  }
}
```

`GET /api/rider/v1/orders/db6b62a6-7a27-458b-955e-43e1507cc0ca/tip` → **200**

```json
{
  "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
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
  "method": "WALLET",
  "available_until": "2026-10-29T14:15:34.767803Z",
  "open": false,
  "tip": {
    "id": "5db10683-a036-4310-8c71-5d2e4c7b83e1",
    "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:15:36.11786Z"
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "ea9af990-15e4-4a9c-b366-789b3ab16fdb",
      "at": "2026-10-28T14:15:37.569206Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
      "counterpart_id": null
    },
    {
      "id": "e206378e-d732-4120-bb57-c8441ad176da",
      "at": "2026-10-28T14:15:35.538959Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "db6b62a6-7a27-458b-955e-43e1507cc0ca",
      "counterpart_id": null
    },
    {
      "id": "980cddd7-14a0-455c-aee2-a0c752490441",
      "at": "2026-10-28T14:15:30.490816Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    },
    {
      "id": "2bde1fbe-0964-45ef-b679-9c64de3d3d58",
      "at": "2026-10-28T14:15:26.427777Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2a1b8ab9-e42b-4881-a19e-baf62ec36e9c",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "1d682093-be7e-456c-961f-419d9c55e4ce",
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
  "last_heartbeat_at": "2026-10-28T14:15:33.918906Z",
  "last_location_at": "2026-10-28T14:15:33.918906Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1d682093-be7e-456c-961f-419d9c55e4ce/close` → **200**

```json
{
  "command_id": "9d6d184f-f8ea-4605-8d77-e034526d9a27",
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

Done: card order db6b62a6-7a27-458b-955e-43e1507cc0ca.

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

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734566791",
  "device_ref": "sandbox-451"
}
```

```json
{
  "challenge_id": "b96e8b29-886f-4d09-b2a4-c8365d418967",
  "expires_at": "2026-10-28T14:20:39.019909441Z",
  "resend_available_at": "2026-10-28T14:15:40.019909441Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734566791` → **200**

```json
{
  "phone": "+380734566791",
  "audience": "CLIENT",
  "code": "233669",
  "sent_at": "2026-10-28T14:15:39.024758343Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b96e8b29-886f-4d09-b2a4-c8365d418967",
  "code": "233669",
  "device_ref": "sandbox-451"
}
```

```json
{
  "session_id": "4a0bc3eb-4322-4729-84b8-901ffedbc29c",
  "subject": {
    "type": "CLIENT",
    "id": "198be9bf-40a5-4de0-9dd4-3f18afe75aee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOThiZTliZi00MGE1LTRkZTAtOWRkNC0zZjE4YWZlNzVhZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODM5LCJpYXQiOjE3OTMxOTY5MzksImp0aSI6ImM0ODAzYzY4LTIwOTMtNGE3Ny05YTlmLTMyOTkyZWEyNjRlOSIsInNpZCI6IjRhMGJjM2ViLTQzMjItNDcyOS04NGI4LTkwMWZmZWRiYzI5YyJ9.M20dQLID8kU4Yn2scyQRxQsNUAykz01ndX6GnA-I5M8",
  "access_expires_at": "2026-10-28T14:30:39.340434818Z",
  "refresh_token": "0wpfVVt_rLgpKCtC5KfTwtb_XSCSMEwzVPnev6QPsi0",
  "refresh_expires_at": "2026-11-27T14:15:39.339763815Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "bfe7e997-1e34-40af-888c-b33718700bcb",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c2923d01-7a3c-4d66-ae9e-87eeff7f2758",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c2923d01-7a3c-4d66-ae9e-87eeff7f2758",
    "orderDate": "1793196939",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "537a008f3dbe383390da745e6bf4c5ea",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c2923d01-7a3c-4d66-ae9e-87eeff7f2758",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734566791"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c2923d01-7a3c-4d66-ae9e-87eeff7f2758",
  "created_at": "2026-10-28T14:15:39.63529Z",
  "expires_at": "2026-10-28T14:45:39.63529Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c2923d01-7a3c-4d66-ae9e-87eeff7f2758` → **200**

```json
{
  "id": "c2923d01-7a3c-4d66-ae9e-87eeff7f2758",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:15:39.63529Z",
  "expires_at": "2026-10-28T14:45:39.63529Z",
  "completed_at": "2026-10-28T14:15:39.929482Z",
  "masked_pan": "41****6195",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "198be9bf-40a5-4de0-9dd4-3f18afe75aee",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "198be9bf-40a5-4de0-9dd4-3f18afe75aee",
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
      "id": "281d4271-daa8-4914-9b57-4842d64ea3f7",
      "at": "2026-10-28T14:15:40.583179Z",
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
  "client_id": "198be9bf-40a5-4de0-9dd4-3f18afe75aee",
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
      "id": "281d4271-daa8-4914-9b57-4842d64ea3f7",
      "at": "2026-10-28T14:15:40.583179Z",
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
  "device_ref": "sandbox-12338"
}
```

```json
{
  "challenge_id": "aec1ebdc-701f-4690-b936-8e304e6836a6",
  "expires_at": "2026-10-28T14:20:42.026599026Z",
  "resend_available_at": "2026-10-28T14:15:43.026599026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "033405",
  "sent_at": "2026-10-28T14:15:42.029363396Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aec1ebdc-701f-4690-b936-8e304e6836a6",
  "code": "033405",
  "device_ref": "sandbox-12338"
}
```

```json
{
  "session_id": "71d18be0-8265-4235-b7f4-fa6e181aa7d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg0MiwiaWF0IjoxNzkzMTk2OTQyLCJqdGkiOiJiMmUwMWFmYy02MGYwLTQwOGUtYmVlOS0yMTMwZTJlM2U4ZDYiLCJzaWQiOiI3MWQxOGJlMC04MjY1LTQyMzUtYjdmNC1mYTZlMTgxYWE3ZDUifQ.mOs6gnvTo2ZFoBp34OPKY03wG-g72Hq2fqyom-OINg0",
  "access_expires_at": "2026-10-28T14:30:42.316017604Z",
  "refresh_token": "-Mj0tyyzYwQSFKD4K7Eq8x6i_eRJ8oO7adQoSELK4So",
  "refresh_expires_at": "2026-11-27T14:15:42.31539393Z",
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
  "command_id": "983fd893-8f7a-46c7-86ca-35b7bc55b82f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "752bce20-4bf3-4460-b77e-bffb8013cd7e",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-752bce20-4bf3-4460-b77e-bffb8013cd7e",
    "orderDate": "1793196942",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "482884dd709093b3f5f3d29335b22b01",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=752bce20-4bf3-4460-b77e-bffb8013cd7e",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=752bce20-4bf3-4460-b77e-bffb8013cd7e",
  "created_at": "2026-10-28T14:15:42.842549Z",
  "expires_at": "2026-10-28T14:45:42.842549Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/752bce20-4bf3-4460-b77e-bffb8013cd7e` → **200**

```json
{
  "id": "752bce20-4bf3-4460-b77e-bffb8013cd7e",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:15:42.842549Z",
  "expires_at": "2026-10-28T14:45:42.842549Z",
  "completed_at": "2026-10-28T14:15:43.106455Z",
  "masked_pan": "41****7952",
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
      "id": "0e490b2b-398b-421d-9918-38b638fab638",
      "at": "2026-10-28T14:15:43.59097Z",
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
  "command_id": "0a09c6d5-e7c7-4aa3-93e0-4ca668704a2f",
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
  "correlation_id": "efa10d97-010e-4664-9d8a-eac180d223ce"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: city-operations

## Staff open Warsaw's operations (version 0 until the first change: around the clock, every method)

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
  "session_id": "926f1b2d-0011-4a8c-b5a3-954141056d07",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NDUsImlhdCI6MTc5MzE5Njk0NSwianRpIjoiYWRiNzE4YzItNzA2NS00MTA3LTgxNzUtM2Y0NzhmZTgwNWY2Iiwic2lkIjoiOTI2ZjFiMmQtMDAxMS00YThjLWI1YTMtOTU0MTQxMDU2ZDA3In0.AfI9Qw8i5kT4_1qHREd7CXcj1nM26Vk8wstiMvQ1Rtw",
  "access_expires_at": "2026-10-28T14:30:45.509652253Z",
  "refresh_token": "0hQJ4-6Dk2llqLpn774dvlHUBSXMHKtIbtsUaZSWyMo",
  "refresh_expires_at": "2026-10-29T02:15:45.50911193Z",
  "password_change_required": false
}
```

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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600036020",
  "device_ref": "sandbox-9550"
}
```

```json
{
  "challenge_id": "8ed435ad-df49-41f3-8540-3d14cee9eafa",
  "expires_at": "2026-10-28T14:20:46.322321861Z",
  "resend_available_at": "2026-10-28T14:15:47.322321861Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600036020` → **200**

```json
{
  "phone": "+48600036020",
  "audience": "CLIENT",
  "code": "749247",
  "sent_at": "2026-10-28T14:15:46.324749159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ed435ad-df49-41f3-8540-3d14cee9eafa",
  "code": "749247",
  "device_ref": "sandbox-9550"
}
```

```json
{
  "session_id": "e1e4ae53-129d-4aad-be34-1c3a90ce4ffb",
  "subject": {
    "type": "CLIENT",
    "id": "011481dc-50ae-426d-9a3d-97889b173fe4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTE0ODFkYy01MGFlLTQyNmQtOWEzZC05Nzg4OWIxNzNmZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODQ2LCJpYXQiOjE3OTMxOTY5NDYsImp0aSI6ImI3YjczZTc4LWM0MTUtNDU1MS05YTM1LTliYTI3NDM4NWJhZCIsInNpZCI6ImUxZTRhZTUzLTEyOWQtNGFhZC1iZTM0LTFjM2E5MGNlNGZmYiJ9.wAcy0isfJ2AH1t5ah5AmiUTYEoz1u8JVfjb7-IabCqs",
  "access_expires_at": "2026-10-28T14:30:46.608612987Z",
  "refresh_token": "NVXJpxx1n4V0zngoUOKVxoQcCsrM-g1lxYuF9FWxDAo",
  "refresh_expires_at": "2026-11-27T14:15:46.608062256Z",
  "account_created": true
}
```

## Staff pause new orders: a reason is required

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **400**

```json
{
  "command_id": "bff32074-5f8c-4c5e-abf8-361945a11c3d",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f3140dc6-14ca-4687-9909-f52ff7d4c78b",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 0
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **200**

```json
{
  "command_id": "8028212d-2ad6-4a09-b5a7-b2bbbb0af10a",
  "expected_version": 0,
  "reason": "Storm warning"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T14:15:47.708044152Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": true
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dfcceba3-c5e3-46ec-a105-51551506b69a",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "78802f8b-3a0c-4850-96fd-c651f98e0603",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:48.250712Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "5c1b1442-9b07-4025-9968-cfbdde267f4b",
  "quote_id": "78802f8b-3a0c-4850-96fd-c651f98e0603",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City paused",
  "type": "https://errors.blizz.taxi/city-paused",
  "code": "CITY_PAUSED",
  "correlation_id": "b678e362-1533-4ed8-b5a2-9c65a7b34532"
}
```

## Staff lift the pause

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": true,
  "pause_reason": "Storm warning",
  "paused_at": "2026-10-28T14:15:47.708044Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "441d9283-7271-450d-916a-c4cb99222ff0",
  "expected_version": 1,
  "reason": "Storm over"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

## Warsaw offers only cards for now: a cash order is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 2
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "233004a2-6b88-451a-a848-1960a606533f",
  "expected_version": 2,
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "reason": "Cash collection paused"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d03c1206-a0fa-4505-9962-a54b04437ab3",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "bc4e0d6a-85a2-444b-8e49-6cff56b5e2a2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:49.894324Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "521b9c9e-8fb2-4ca1-95db-18d9fc00292f",
  "quote_id": "bc4e0d6a-85a2-444b-8e49-6cff56b5e2a2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "1cfa4790-2337-4048-a19c-3a9c24098f75"
}
```

## Working hours that do not include now: an order for now is refused

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 3
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "646582f1-84a0-443d-a558-22d2844c6354",
  "expected_version": 3,
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "17:00",
      "to": "18:00"
    }
  ],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "One hour a day"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "17:00",
      "to": "18:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b41aaac7-738c-4f89-a8db-5ac8fe151cbc",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  }
}
```

```json
{
  "id": "993873e2-8222-482f-a7cf-866684d67b00",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:51.007414Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 1500,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "f745247a-9a4e-4532-9944-84b915dda69c",
  "quote_id": "993873e2-8222-482f-a7cf-866684d67b00",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "pickup_label": "Pałac Kultury",
  "dropoff": {
    "lat": 52.2319,
    "lon": 21.0067
  },
  "dropoff_label": "Warszawa Centralna",
  "payment_method": "CASH"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "City closed",
  "type": "https://errors.blizz.taxi/city-closed",
  "code": "CITY_CLOSED",
  "correlation_id": "fd8d189f-55e3-4bd6-af0f-53f5066dc649"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "11c2ceea-1e1f-4052-9e57-efd29ce8b31c",
  "expected_version": 0,
  "reason": "stale"
}
```

```json
{
  "instance": "/api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "d4b514ed-577b-41d8-a2a9-d1e1e92405ad"
}
```

Done: paused and resumed, a method not offered and closed hours refused orders; Warsaw is restored on exit.

`GET /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [
    {
      "days_of_week": [
        1,
        2,
        3,
        4,
        5,
        6,
        7
      ],
      "from": "17:00",
      "to": "18:00"
    }
  ],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 4
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations` → **200**

```json
{
  "command_id": "8c869365-53e0-4adf-9350-abcb3b142220",
  "expected_version": 4,
  "working_hours": [],
  "payment_methods": [
    "CASH",
    "CARD",
    "TERMINAL"
  ],
  "reason": "Sandbox clean-up"
}
```

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "working_hours": [],
  "payment_methods": [
    "CARD",
    "CASH",
    "TERMINAL"
  ],
  "orders_paused": false,
  "pause_reason": null,
  "paused_at": null,
  "version": 5
}
```

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679666313",
  "device_ref": "sandbox-7804"
}
```

```json
{
  "challenge_id": "46330972-36b3-4b89-ac8a-e7f1d0d6bcd9",
  "expires_at": "2026-10-28T14:20:52.391833647Z",
  "resend_available_at": "2026-10-28T14:15:53.391833647Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679666313` → **200**

```json
{
  "phone": "+380679666313",
  "audience": "CLIENT",
  "code": "222571",
  "sent_at": "2026-10-28T14:15:52.39420236Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "46330972-36b3-4b89-ac8a-e7f1d0d6bcd9",
  "code": "222571",
  "device_ref": "sandbox-7804"
}
```

```json
{
  "session_id": "047d1c41-807b-4fe9-adfc-8fb01b64d82e",
  "subject": {
    "type": "CLIENT",
    "id": "8e34505a-afac-4c81-b51c-c374cb2b9f8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTM0NTA1YS1hZmFjLTRjODEtYjUxYy1jMzc0Y2IyYjlmOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODUyLCJpYXQiOjE3OTMxOTY5NTIsImp0aSI6ImYzYjRmM2U1LTQ5MzQtNDIzYi1iMjRmLTk5Y2ViYzZlYTQ3NyIsInNpZCI6IjA0N2QxYzQxLTgwN2ItNGZlOS1hZGZjLThmYjAxYjY0ZDgyZSJ9.BKU70PRK35DmisnAkTiKIdibOIuK4oB7KWOeYBzGDrY",
  "access_expires_at": "2026-10-28T14:30:52.678649767Z",
  "refresh_token": "n0VGQMt-L4UJn2QAgyFUTi4Lmrja_b5H4xp6i6cX75U",
  "refresh_expires_at": "2026-11-27T14:15:52.678081685Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8e34505a-afac-4c81-b51c-c374cb2b9f8a",
  "session_id": "047d1c41-807b-4fe9-adfc-8fb01b64d82e",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3b53861b-5740-4f66-8096-228c87fc715b",
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
  "id": "0fc9b782-a430-4c29-b1e6-68254d610108",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:20:53.210752Z",
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
  "challenge_id": "2cb7359b-3981-44d1-8117-a719cc5eae39",
  "expires_at": "2026-10-28T14:20:55.492351482Z",
  "resend_available_at": "2026-10-28T14:15:56.492351482Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679666313` → **200**

```json
{
  "phone": "+380679666313",
  "audience": "CLIENT",
  "code": "547329",
  "sent_at": "2026-10-28T14:15:55.494335198Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d015df57-e12e-4843-86ca-9859f47a75ed",
  "challenge_id": "2cb7359b-3981-44d1-8117-a719cc5eae39",
  "otp_code": "547329"
}
```

```json
{
  "client_id": "8e34505a-afac-4c81-b51c-c374cb2b9f8a",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:15:55.800728143Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f1c6cc74-df55-4ce2-bf47-eabdd9f96cdc",
  "quote_id": "0fc9b782-a430-4c29-b1e6-68254d610108",
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
  "correlation_id": "07b27642-1eee-49f3-8997-9d2cbddf609f"
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
  "session_id": "8889b04b-5d76-4e04-bbdc-21a204dcba72",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NTYsImlhdCI6MTc5MzE5Njk1NiwianRpIjoiZDQyYzJlYzMtMmNiMi00MTQ3LWIwOTMtODc3NTk3YzM2YTNjIiwic2lkIjoiODg4OWIwNGItNWQ3Ni00ZTA0LWJiZGMtMjFhMjA0ZGNiYTcyIn0.5_COkrOtHBQ71LX9O1jOqsSxcl03yihrCRAvp5BLSMw",
  "access_expires_at": "2026-10-28T14:30:56.651226699Z",
  "refresh_token": "jXUB7qxfvtpL6jalDKzreJkUzvPFS6l5-u9pA7ue1VE",
  "refresh_expires_at": "2026-10-29T02:15:56.65063484Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "8e34505a-afac-4c81-b51c-c374cb2b9f8a",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:15:55.800728Z",
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

`POST /api/admin/v1/client-deletions/8e34505a-afac-4c81-b51c-c374cb2b9f8a/complete` → **200**

```json
{
  "command_id": "1cfa59cd-165b-4aee-84da-449972752ba9",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "8e34505a-afac-4c81-b51c-c374cb2b9f8a",
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
  "correlation_id": "0db3e36e-3bb7-400c-b345-66b098e520be"
}
```

Done: client 8e34505a-afac-4c81-b51c-c374cb2b9f8a anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666891853",
  "device_ref": "sandbox-30360"
}
```

```json
{
  "challenge_id": "e2a55d85-5ad7-4c7a-8ef5-690da1352abe",
  "expires_at": "2026-10-28T14:20:57.757379647Z",
  "resend_available_at": "2026-10-28T14:15:58.757379647Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666891853` → **200**

```json
{
  "phone": "+380666891853",
  "audience": "CLIENT",
  "code": "690335",
  "sent_at": "2026-10-28T14:15:57.760239315Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2a55d85-5ad7-4c7a-8ef5-690da1352abe",
  "code": "690335",
  "device_ref": "sandbox-30360"
}
```

```json
{
  "session_id": "b401ef12-6de4-4c39-b5c3-da4d4923ca15",
  "subject": {
    "type": "CLIENT",
    "id": "68d45cf6-92a7-41df-9ead-3e52b182c488"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGQ0NWNmNi05MmE3LTQxZGYtOWVhZC0zZTUyYjE4MmM0ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODU4LCJpYXQiOjE3OTMxOTY5NTgsImp0aSI6IjM3YjRlYmM3LWJhMDQtNDdiYy1iZDk4LTZmNWJkMzViZTU3ZSIsInNpZCI6ImI0MDFlZjEyLTZkZTQtNGMzOS1iNWMzLWRhNGQ0OTIzY2ExNSJ9.3yZQYCvHEsWawO54xy-82e_c1H-HPR45-CAZld1kGT4",
  "access_expires_at": "2026-10-28T14:30:58.057124109Z",
  "refresh_token": "c6fVLGXhdBzvW0mJrOyj8pgdH9eRbjx8pNo1d-oNcfI",
  "refresh_expires_at": "2026-11-27T14:15:58.056548721Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
  "session_id": "b401ef12-6de4-4c39-b5c3-da4d4923ca15",
  "account_state": "ACTIVE"
}
```

## Staff find the rider by the last 7 digits of the phone and open the card

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
  "session_id": "a8676da9-942d-4ab4-8884-4ba12b528378",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NTgsImlhdCI6MTc5MzE5Njk1OCwianRpIjoiZDExNTQwMmYtNzYwYi00NWNhLTkwMDAtOTdiOWMzM2FhMTVlIiwic2lkIjoiYTg2NzZkYTktOTQyZC00YWI0LTg4ODQtNGJhMTJiNTI4Mzc4In0.XZZ8Me0Zx2xPnkLsCLJmwtZHhasE7Cn6hrjLPClsYCw",
  "access_expires_at": "2026-10-28T14:30:58.876830615Z",
  "refresh_token": "fsxZDUZvR8lEjpXHDCP5JFQQ0ISXZImqxhlFVGyCDVg",
  "refresh_expires_at": "2026-10-29T02:15:58.876268937Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6891853&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
      "phone": "+380666891853",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:15:58.054542Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/68d45cf6-92a7-41df-9ead-3e52b182c488` → **200**

```json
{
  "client": {
    "id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
    "phone": "+380666891853",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:15:58.054542Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

## A block needs a reason

`POST /api/admin/v1/clients/68d45cf6-92a7-41df-9ead-3e52b182c488/block` → **400**

```json
{
  "command_id": "da556a97-7790-4f99-bff3-c8404f557d94",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/68d45cf6-92a7-41df-9ead-3e52b182c488/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "93fd3410-dd4b-4a30-a49f-88a886c3633a",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/68d45cf6-92a7-41df-9ead-3e52b182c488/block` → **200**

```json
{
  "command_id": "989a3578-36e9-41a2-9d3c-4a1c8293e3a6",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
  "phone": "+380666891853",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:15:58.054542Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:16:00.004181Z",
    "by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "deletion_requested_at": null
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "c1879db5-2927-435e-af9c-1fb3bbd65f5c"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666891853",
  "device_ref": "sandbox-12620"
}
```

```json
{
  "challenge_id": "fea91f17-5bbe-4f52-bd9e-58dcc9448827",
  "expires_at": "2026-10-28T14:21:02.549885433Z",
  "resend_available_at": "2026-10-28T14:16:03.549885433Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666891853` → **200**

```json
{
  "phone": "+380666891853",
  "audience": "CLIENT",
  "code": "619638",
  "sent_at": "2026-10-28T14:16:02.552047073Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "fea91f17-5bbe-4f52-bd9e-58dcc9448827",
  "code": "619638",
  "device_ref": "sandbox-12620"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "a59fa8bd-33ed-4c31-a6cb-d8471786c772"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/68d45cf6-92a7-41df-9ead-3e52b182c488` → **200**

```json
{
  "client": {
    "id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
    "phone": "+380666891853",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:15:58.054542Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:16:00.004181Z",
      "by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
    },
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/68d45cf6-92a7-41df-9ead-3e52b182c488/unblock` → **200**

```json
{
  "command_id": "6c1c0aea-bd69-4b1b-bb3f-9bac9b5b80b9",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
  "phone": "+380666891853",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:15:58.054542Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666891853",
  "device_ref": "sandbox-7231"
}
```

```json
{
  "challenge_id": "673bc51b-4a26-4bc0-b306-fcf3346308a4",
  "expires_at": "2026-10-28T14:21:05.685470091Z",
  "resend_available_at": "2026-10-28T14:16:06.685470091Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666891853` → **200**

```json
{
  "phone": "+380666891853",
  "audience": "CLIENT",
  "code": "267193",
  "sent_at": "2026-10-28T14:16:05.688452939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "673bc51b-4a26-4bc0-b306-fcf3346308a4",
  "code": "267193",
  "device_ref": "sandbox-7231"
}
```

```json
{
  "session_id": "edcbcd33-c6f9-47db-907f-76f5a4baa6c8",
  "subject": {
    "type": "CLIENT",
    "id": "68d45cf6-92a7-41df-9ead-3e52b182c488"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2OGQ0NWNmNi05MmE3LTQxZGYtOWVhZC0zZTUyYjE4MmM0ODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODY1LCJpYXQiOjE3OTMxOTY5NjUsImp0aSI6IjNlZDA2NzQ0LTNhMTctNDU3NS04OTZhLWQ0ZmRiYTQzMDY4NCIsInNpZCI6ImVkY2JjZDMzLWM2ZjktNDdkYi05MDdmLTc2ZjVhNGJhYTZjOCJ9.M7LeFoN30PNlRKA8A7ZZpz9Au18kQVLS1Z0rAipNihU",
  "access_expires_at": "2026-10-28T14:31:05.980706201Z",
  "refresh_token": "tO6OaWpF3yna47iJc3Vwlz4v2xZK1u2unYPgGcLH8l0",
  "refresh_expires_at": "2026-11-27T14:16:05.980107293Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "68d45cf6-92a7-41df-9ead-3e52b182c488",
  "session_id": "edcbcd33-c6f9-47db-907f-76f5a4baa6c8",
  "account_state": "ACTIVE"
}
```

Done: found, blocked (signed out, sign-in refused) and unblocked.

# Scenario: correlation-search

## A rider orders; the app sends its own correlation id with the request

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665052441",
  "device_ref": "sandbox-32382"
}
```

```json
{
  "challenge_id": "0ef12c3b-6abc-4dd2-8d90-d7114588ba72",
  "expires_at": "2026-10-28T14:21:06.517793703Z",
  "resend_available_at": "2026-10-28T14:16:07.517793703Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380665052441` → **200**

```json
{
  "phone": "+380665052441",
  "audience": "CLIENT",
  "code": "532315",
  "sent_at": "2026-10-28T14:16:06.5200248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ef12c3b-6abc-4dd2-8d90-d7114588ba72",
  "code": "532315",
  "device_ref": "sandbox-32382"
}
```

```json
{
  "session_id": "f05458e9-309b-4123-856e-c4d7bb96b139",
  "subject": {
    "type": "CLIENT",
    "id": "52e7379d-f459-4211-90b7-e5d5031f2d92"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MmU3Mzc5ZC1mNDU5LTQyMTEtOTBiNy1lNWQ1MDMxZjJkOTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODY2LCJpYXQiOjE3OTMxOTY5NjYsImp0aSI6IjI1YjY0NmEyLTRmZTUtNDJlZS1hMDlhLTg5ZWZkODA0NzRjYyIsInNpZCI6ImYwNTQ1OGU5LTMwOWItNDEyMy04NTZlLWM0ZDdiYjk2YjEzOSJ9.cTgxvspLYTZxrC4QT8Is7HPpDhYdgecHOp-MLWd1a7k",
  "access_expires_at": "2026-10-28T14:31:06.811769663Z",
  "refresh_token": "eJRIH_9eF4NKTU39jbumYFoBRQcdf6FaZIULHPAj3fQ",
  "refresh_expires_at": "2026-11-27T14:16:06.811114525Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fb8bff2c-77b3-475e-bf99-9aaf5cb9217d",
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
  "id": "b115da7b-6d40-469c-9f49-5a89d6735b3f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:07.096115Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: d417c91a-cd13-4da7-b0cf-3694c522471e) → **201**

## The operator sees the id on the order's history

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
  "session_id": "7260b11d-42cc-4636-9810-ea42fd04d39c",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NjcsImlhdCI6MTc5MzE5Njk2NywianRpIjoiYjU2OTE0N2QtNzQ5OS00NTAyLWIxMmEtNTllNGYyZTVjY2QyIiwic2lkIjoiNzI2MGIxMWQtNDJjYy00NjM2LTk4MTAtZWE0MmZkMDRkMzljIn0.EpBiZ76AoZZaqdsTMj2-yAnWNo5Aqai81MbDi1cfwi4",
  "access_expires_at": "2026-10-28T14:31:07.713879017Z",
  "refresh_token": "8ZS3qS5dwcVVq-q0K4Ps_JEswEBYm5D8qQcTls8kMbM",
  "refresh_expires_at": "2026-10-29T02:16:07.713250129Z",
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
  "session_id": "96021cd6-4828-4719-ab3f-c3b2f7213c51",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4NjgsImlhdCI6MTc5MzE5Njk2OCwianRpIjoiNzAwNzc3OTgtMTM1NC00ZmViLTllNjctYmNjZTc3OTMwMWJmIiwic2lkIjoiOTYwMjFjZDYtNDgyOC00NzE5LWFiM2YtYzNiMmY3MjEzYzUxIn0.TU_XxMDXRragsM6_vq5epwGML93rEGRljtv6_abAHFw",
  "access_expires_at": "2026-10-28T14:31:08.27318658Z",
  "refresh_token": "oHK8mhCj44lEC72u7dQOdQp-bCsXEKsVEgCs0wBANgo",
  "refresh_expires_at": "2026-10-29T02:16:08.272594912Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d796b1fb-758c-4d2e-b15b-6f46c8c01a29/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:07.381703Z",
      "actor": {
        "type": "CLIENT",
        "id": "52e7379d-f459-4211-90b7-e5d5031f2d92",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
        "quote_id": "b115da7b-6d40-469c-9f49-5a89d6735b3f",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "d417c91a-cd13-4da7-b0cf-3694c522471e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:07.383835Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
        "attempt_id": "9d36fc0d-f30a-45b4-ae63-d7280eafdd48",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d417c91a-cd13-4da7-b0cf-3694c522471e"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:16:07.393429Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
        "attempt_id": "9d36fc0d-f30a-45b4-ae63-d7280eafdd48"
      },
      "correlation_id": "d417c91a-cd13-4da7-b0cf-3694c522471e"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "9d36fc0d-f30a-45b4-ae63-d7280eafdd48",
        "generation": 1,
        "started_at": "2026-10-28T14:16:07.382755Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:16:07.393429Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:16:07.384771Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/d417c91a-cd13-4da7-b0cf-3694c522471e` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29:0",
      "order_id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
      "at": "2026-10-28T14:16:07.381703Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29:1",
      "order_id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
      "at": "2026-10-28T14:16:07.383835Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29:2",
      "order_id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
      "at": "2026-10-28T14:16:07.393429Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/a7390054-868d-48b1-9150-d5b9da20b755` → **200**

```json
{
  "found": []
}
```

Done: request d417c91a-cd13-4da7-b0cf-3694c522471e — order d796b1fb-758c-4d2e-b15b-6f46c8c01a29 found by its id.

`GET /api/rider/v1/orders/d796b1fb-758c-4d2e-b15b-6f46c8c01a29` → **200**

```json
{
  "id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "52e7379d-f459-4211-90b7-e5d5031f2d92",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:16:07.381159Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d796b1fb-758c-4d2e-b15b-6f46c8c01a29/cancel` → **200**

```json
{
  "command_id": "2d82ba36-f98c-4576-abdd-bd0cf8f20e2a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d796b1fb-758c-4d2e-b15b-6f46c8c01a29",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "52e7379d-f459-4211-90b7-e5d5031f2d92",
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
  "created_at": "2026-10-28T14:16:07.381159Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630218955",
  "device_ref": "sandbox-18466"
}
```

```json
{
  "challenge_id": "3e4720d7-c224-4fbd-ba92-9b7bbfc109c0",
  "expires_at": "2026-10-28T14:21:09.921638229Z",
  "resend_available_at": "2026-10-28T14:16:10.921638229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630218955` → **200**

```json
{
  "phone": "+380630218955",
  "audience": "CLIENT",
  "code": "031971",
  "sent_at": "2026-10-28T14:16:09.923822151Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e4720d7-c224-4fbd-ba92-9b7bbfc109c0",
  "code": "031971",
  "device_ref": "sandbox-18466"
}
```

```json
{
  "session_id": "866bf924-4ab2-4d8e-8689-943f98f40753",
  "subject": {
    "type": "CLIENT",
    "id": "9af1cdb9-29a6-43ab-8cd2-0c42d135edb9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YWYxY2RiOS0yOWE2LTQzYWItOGNkMi0wYzQyZDEzNWVkYjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODcwLCJpYXQiOjE3OTMxOTY5NzAsImp0aSI6IjRmMzY0OTcxLWNkZDUtNDM2MS1hYmMwLWUyNTQ2Nzk2M2FkNSIsInNpZCI6Ijg2NmJmOTI0LTRhYjItNGQ4ZS04Njg5LTk0M2Y5OGY0MDc1MyJ9.aDHmXYgPxgSIvAloiIY21K-uwhUUpkUzF-OlEHjavgU",
  "access_expires_at": "2026-10-28T14:31:10.208163156Z",
  "refresh_token": "dFsdJa54zZJUfWJEtQKlJDtkS6g06IRYDJRqD72--G4",
  "refresh_expires_at": "2026-11-27T14:16:10.207466996Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "79deb782-40d2-4bdc-beb8-7e9c709fc87a",
  "expires_at": "2026-10-28T14:21:12.469076349Z",
  "resend_available_at": "2026-10-28T14:16:13.469076349Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630218955` → **200**

```json
{
  "phone": "+380630218955",
  "audience": "CLIENT",
  "code": "473127",
  "sent_at": "2026-10-28T14:16:12.471239071Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "6f895111-e87c-4ab9-b2a9-2811494bc5a1",
  "challenge_id": "79deb782-40d2-4bdc-beb8-7e9c709fc87a",
  "otp_code": "473127"
}
```

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "PENDING",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd` → **200**

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "PENDING",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd` → **200**

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "PENDING",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd` → **200**

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "PENDING",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd` → **200**

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "PENDING",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd` → **200**

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "PENDING",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd` → **200**

```json
{
  "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
  "state": "READY",
  "created_at": "2026-10-28T14:16:12.767846Z",
  "ready_at": "2026-10-28T14:16:18.935623Z",
  "expires_at": "2026-11-04T14:16:18.935623Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635209480",
  "device_ref": "sandbox-3766"
}
```

```json
{
  "challenge_id": "42d28ad4-0847-4707-b52d-08492b93bfe3",
  "expires_at": "2026-10-28T14:21:19.617224715Z",
  "resend_available_at": "2026-10-28T14:16:20.617224715Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635209480` → **200**

```json
{
  "phone": "+380635209480",
  "audience": "CLIENT",
  "code": "897957",
  "sent_at": "2026-10-28T14:16:19.620040741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "42d28ad4-0847-4707-b52d-08492b93bfe3",
  "code": "897957",
  "device_ref": "sandbox-3766"
}
```

```json
{
  "session_id": "c38ff3aa-fc56-4c9c-baa1-65398a6cab99",
  "subject": {
    "type": "CLIENT",
    "id": "88e73a5c-a814-4363-9575-4293b832b5a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OGU3M2E1Yy1hODE0LTQzNjMtOTU3NS00MjkzYjgzMmI1YTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODc5LCJpYXQiOjE3OTMxOTY5NzksImp0aSI6ImUxNTM4MzQ5LTA3NzgtNGY3OS1iMWY4LTZlMjI0MGM2Zjk0NCIsInNpZCI6ImMzOGZmM2FhLWZjNTYtNGM5Yy1iYWExLTY1Mzk4YTZjYWI5OSJ9.GRLHwFVfFakoT0BdaMfULZ4yQQQUZLNtoNymYxIj1H4",
  "access_expires_at": "2026-10-28T14:31:19.903715134Z",
  "refresh_token": "ClYNolLdmNDJ8KsJaBvMwpqmytV87WNCBugGvh4G4sQ",
  "refresh_expires_at": "2026-11-27T14:16:19.903186243Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/bb3962dd-c9f8-4766-847d-f5d96a4cf8fd/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "3b4cf622-cc2f-4a92-991d-cd60c31fe344"
}
```

## Support sees that it was asked for, not what is in it

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
  "session_id": "b6d6c86c-22a5-40c7-97ec-de51bab9d4be",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4ODAsImlhdCI6MTc5MzE5Njk4MCwianRpIjoiYTVlZWQzOGYtZTE1YS00NWY3LThkZjYtNGI1NWJkNTk2ZjZmIiwic2lkIjoiYjZkNmM4NmMtMjJhNS00MGM3LTk3ZWMtZGU1MWJhYjlkNGJlIn0.Gu3kCwpbR6MdD82PR9M9m-7nL_t_t6Qi3Yc4v4JMZZE",
  "access_expires_at": "2026-10-28T14:31:20.720337876Z",
  "refresh_token": "ctCo_dmyydRC-BYPnYUl41Iz33UmiruKUsFR95Gd0PQ",
  "refresh_expires_at": "2026-10-29T02:16:20.719789489Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9af1cdb9-29a6-43ab-8cd2-0c42d135edb9",
  "session_id": "866bf924-4ab2-4d8e-8689-943f98f40753",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/9af1cdb9-29a6-43ab-8cd2-0c42d135edb9/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "bb3962dd-c9f8-4766-847d-f5d96a4cf8fd",
      "state": "READY",
      "created_at": "2026-10-28T14:16:12.767846Z",
      "ready_at": "2026-10-28T14:16:18.935623Z",
      "expires_at": "2026-11-04T14:16:18.935623Z",
      "size_bytes": 1032
    }
  ]
}
```

Done: the copy was asked for with a code, built in the background and downloaded by the rider only.

# Scenario: dispatch-journal

## Only the two drivers of this scenario are online

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13587"
}
```

```json
{
  "challenge_id": "7a9d9591-4efd-46db-ad0f-03ea1db20983",
  "expires_at": "2026-10-28T14:21:21.516855134Z",
  "resend_available_at": "2026-10-28T14:16:22.516855134Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "542237",
  "sent_at": "2026-10-28T14:16:21.519034648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a9d9591-4efd-46db-ad0f-03ea1db20983",
  "code": "542237",
  "device_ref": "sandbox-13587"
}
```

```json
{
  "session_id": "9c5ade4d-b0a2-4c5f-a744-a2ccab31950f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg4MSwiaWF0IjoxNzkzMTk2OTgxLCJqdGkiOiJkZjgwNjU1Yy01NGI0LTRkYjQtYjk1ZS01NzU2ZWRjOTk1M2MiLCJzaWQiOiI5YzVhZGU0ZC1iMGEyLTRjNWYtYTc0NC1hMmNjYWIzMTk1MGYifQ.W6DYsNirk6Krxma8P9mmLQTGijWaRbgR5cHY4JdAspk",
  "access_expires_at": "2026-10-28T14:31:21.806660822Z",
  "refresh_token": "g50HDa_Nzl5YZRdXoVEdTQcnC0NuzVbQRx20Z7twBXg",
  "refresh_expires_at": "2026-11-27T14:16:21.80606881Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11420"
}
```

```json
{
  "challenge_id": "249f58ec-0d95-4fbf-af58-71ec85e94605",
  "expires_at": "2026-10-28T14:21:22.32177556Z",
  "resend_available_at": "2026-10-28T14:16:23.32177556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "216347",
  "sent_at": "2026-10-28T14:16:22.324074427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "249f58ec-0d95-4fbf-af58-71ec85e94605",
  "code": "216347",
  "device_ref": "sandbox-11420"
}
```

```json
{
  "session_id": "bd28ec04-9342-45a5-8d38-8e01fdf5d7c6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg4MiwiaWF0IjoxNzkzMTk2OTgyLCJqdGkiOiIxNDQ3NzYyYy1hYjhkLTQ0NzgtYjY0Ni01MDAzODhjZTM3MGUiLCJzaWQiOiJiZDI4ZWMwNC05MzQyLTQ1YTUtOGQzOC04ZTAxZmRmNWQ3YzYifQ.A9JNxXaJ8tWrjY3z62gZsCJ6G5yQ3MmDFBVtheugrVI",
  "access_expires_at": "2026-10-28T14:31:22.611647856Z",
  "refresh_token": "fxBgagB1W0cb0-CYNtKciXbmu9Ou0eU1patb4wzB31A",
  "refresh_expires_at": "2026-11-27T14:16:22.611068921Z",
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
  "command_id": "744eea23-60f0-4672-9514-542efbd89270",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:23Z",
    "sequence": 1793196983128
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4d1c39c0-bf10-49f2-93d4-c133d8597898",
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
  "last_heartbeat_at": "2026-10-28T14:16:23.146188Z",
  "last_location_at": "2026-10-28T14:16:23.146188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-7915"
}
```

```json
{
  "challenge_id": "e41ae806-58fe-4c30-a44f-832a19524d7d",
  "expires_at": "2026-10-28T14:21:23.416129408Z",
  "resend_available_at": "2026-10-28T14:16:24.416129408Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "038909",
  "sent_at": "2026-10-28T14:16:23.418335484Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e41ae806-58fe-4c30-a44f-832a19524d7d",
  "code": "038909",
  "device_ref": "sandbox-7915"
}
```

```json
{
  "session_id": "79d3e124-bc11-4456-afa4-a43863be20ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg4MywiaWF0IjoxNzkzMTk2OTgzLCJqdGkiOiI5Y2UyMjE0Zi03ZDBkLTQ0ODctOTYzMC02NjYzNzFkMGRjYmYiLCJzaWQiOiI3OWQzZTEyNC1iYzExLTQ0NTYtYWZhNC1hNDM4NjNiZTIwY2EifQ.pJB8zpTDIARZ9ni_WGFhr4PSgu_a_qf-feRXH71DHjU",
  "access_expires_at": "2026-10-28T14:31:23.707259975Z",
  "refresh_token": "XbdsvoDKC6Agtfa87O1HTuX89flwIfwqxwdcI3CuEsw",
  "refresh_expires_at": "2026-11-27T14:16:23.706690947Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4238054c-f2de-44c2-a1bd-1c55999e5b55",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T14:15:14.632009Z",
  "last_location_at": "2026-10-28T14:15:14.632009Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4238054c-f2de-44c2-a1bd-1c55999e5b55/handover` → **200**

```json
{
  "command_id": "efa0b4d0-ade7-4a9c-9659-e5b52d02eddc",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4238054c-f2de-44c2-a1bd-1c55999e5b55",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T14:15:14.632009Z",
  "last_location_at": "2026-10-28T14:15:14.632009Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/4238054c-f2de-44c2-a1bd-1c55999e5b55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:24Z",
    "sequence": 1793196984498
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4238054c-f2de-44c2-a1bd-1c55999e5b55",
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
  "last_heartbeat_at": "2026-10-28T14:16:24.51726Z",
  "last_location_at": "2026-10-28T14:16:24.51726Z",
  "eligible": true,
  "ineligible_reasons": []
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
  "session_id": "7fa3a32b-0f52-467c-b0b8-78e97209f7da",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4ODUsImlhdCI6MTc5MzE5Njk4NSwianRpIjoiMWQ5ZThlZjItMzk4ZS00OTE0LTk0Y2EtMmY3YjNmMjQ0NmI2Iiwic2lkIjoiN2ZhM2EzMmItMGY1Mi00NjdjLWIwYjgtNzhlOTcyMDlmN2RhIn0.pY71os6eyjR3kkZPnNqt2JU3mC3MqkuJtLLcnhS0t9c",
  "access_expires_at": "2026-10-28T14:31:25.070514885Z",
  "refresh_token": "78NXs2PRmChAUKvyxi-OB0IiQqbUMKLa037X188ajzU",
  "refresh_expires_at": "2026-10-29T02:16:25.069880907Z",
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
  "session_id": "22bc5cd5-fa3d-4468-8702-c7fbb94d8fc5",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc4ODUsImlhdCI6MTc5MzE5Njk4NSwianRpIjoiMDg0MzIzOTEtNDM5My00ZDNhLWEwZmItNmVmZmY3ZDhlMzAwIiwic2lkIjoiMjJiYzVjZDUtZmEzZC00NDY4LTg3MDItYzdmYmI5NGQ4ZmM1In0.GGMbkxmmb4ovlpBFmJhr2uqe58knrfonxT2hvZYJur8",
  "access_expires_at": "2026-10-28T14:31:25.624335246Z",
  "refresh_token": "eqFXRfzfp0tODduMvT4CuhQqw4W-dDz84rWYNlC-zVk",
  "refresh_expires_at": "2026-10-29T02:16:25.623696714Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684872876",
  "device_ref": "sandbox-29692"
}
```

```json
{
  "challenge_id": "7244fbd6-369c-4ad5-be8e-2be77b52e752",
  "expires_at": "2026-10-28T14:21:25.883840984Z",
  "resend_available_at": "2026-10-28T14:16:26.883840984Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684872876` → **200**

```json
{
  "phone": "+380684872876",
  "audience": "CLIENT",
  "code": "027135",
  "sent_at": "2026-10-28T14:16:25.886207607Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7244fbd6-369c-4ad5-be8e-2be77b52e752",
  "code": "027135",
  "device_ref": "sandbox-29692"
}
```

```json
{
  "session_id": "2348aae7-ecdf-4f36-9291-04bde675b52e",
  "subject": {
    "type": "CLIENT",
    "id": "7e3c349b-ebde-4219-8a31-122c8cbc1d9b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZTNjMzQ5Yi1lYmRlLTQyMTktOGEzMS0xMjJjOGNiYzFkOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODg2LCJpYXQiOjE3OTMxOTY5ODYsImp0aSI6ImQ0ZTIxYzNhLWEyYjQtNGRjMC1iZDNmLTIwM2IxZGE0YmRhMyIsInNpZCI6IjIzNDhhYWU3LWVjZGYtNGYzNi05MjkxLTA0YmRlNjc1YjUyZSJ9.gPNUhN9r4AwbvFFB1YuqS3E8vV6Sp5rjziIBRbQp1Tg",
  "access_expires_at": "2026-10-28T14:31:26.17778486Z",
  "refresh_token": "a3-MzYQXPZbbwPwmcIVXOuv7nKRVP_mJj3u8DxT5jNI",
  "refresh_expires_at": "2026-11-27T14:16:26.177249096Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3a28bd5f-a8ae-4c74-8b79-013b1aed84c8",
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
  "id": "9d39de79-3fb5-41ee-9783-fc86f9d971fd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:26.446950Z",
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
  "command_id": "8aee01e4-de61-4460-a717-b1b4a86970aa",
  "quote_id": "9d39de79-3fb5-41ee-9783-fc86f9d971fd",
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
  "payment_method": "CASH"
}
```

```json
{
  "id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7e3c349b-ebde-4219-8a31-122c8cbc1d9b",
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
  "created_at": "2026-10-28T14:16:26.729118Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "65f572ca-7c7f-4a3c-a145-6fd5976c621d",
    "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
    "expires_at": "2026-10-28T14:16:41.733124Z",
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
    "distance_m": 200
  }
]
```

`POST /api/driver/v1/offers/65f572ca-7c7f-4a3c-a145-6fd5976c621d/reject` → **204**

```json
{
  "command_id": "998eb7a5-fb39-4547-bf2a-b92699dc36a8"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "771a6a8e-5367-4568-ac39-c2309d9a89b5",
    "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
    "expires_at": "2026-10-28T14:16:42.298628Z",
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
    "distance_m": 601
  }
]
```

`POST /api/driver/v1/offers/771a6a8e-5367-4568-ac39-c2309d9a89b5/accept` → **200**

```json
{
  "command_id": "467bb802-900c-436d-a0e8-94eb95639664"
}
```

```json
{
  "id": "cd6e8d07-ce75-4dc8-a569-141037512cb0",
  "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "64f01745-b8b5-4165-962b-870897816d50",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/0c652e0f-0ddb-41d6-b762-9112ee10a2b4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:26.729748Z",
      "actor": {
        "type": "CLIENT",
        "id": "7e3c349b-ebde-4219-8a31-122c8cbc1d9b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
        "quote_id": "9d39de79-3fb5-41ee-9783-fc86f9d971fd",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b1ab9056-509c-4e2e-9e5a-55ec49e4ece3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:26.732097Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
        "attempt_id": "d24bc38d-da01-4ce4-a0f5-7a0a15cd6510",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b1ab9056-509c-4e2e-9e5a-55ec49e4ece3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:16:26.739161Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65f572ca-7c7f-4a3c-a145-6fd5976c621d",
        "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "b1ab9056-509c-4e2e-9e5a-55ec49e4ece3"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:16:27.297373Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "65f572ca-7c7f-4a3c-a145-6fd5976c621d",
        "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4"
      },
      "correlation_id": "458d6547-ca89-4c44-a457-b0add4349bc8"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 0c652e0f-0ddb-41d6-b762-9112ee10a2b4 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/0c652e0f-0ddb-41d6-b762-9112ee10a2b4` → **200**

```json
{
  "id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
  "short_number": 8,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "7e3c349b-ebde-4219-8a31-122c8cbc1d9b",
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
    "id": "cd6e8d07-ce75-4dc8-a569-141037512cb0",
    "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "64f01745-b8b5-4165-962b-870897816d50",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:16:26.729118Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0c652e0f-0ddb-41d6-b762-9112ee10a2b4/cancel` → **200**

```json
{
  "command_id": "52078cb3-7704-4fda-a9b7-d5b8c60ece0c",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
  "short_number": 8,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "7e3c349b-ebde-4219-8a31-122c8cbc1d9b",
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
    "id": "cd6e8d07-ce75-4dc8-a569-141037512cb0",
    "order_id": "0c652e0f-0ddb-41d6-b762-9112ee10a2b4",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "64f01745-b8b5-4165-962b-870897816d50",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:16:26.729118Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "4d1c39c0-bf10-49f2-93d4-c133d8597898",
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
  "last_heartbeat_at": "2026-10-28T14:16:23.146188Z",
  "last_location_at": "2026-10-28T14:16:23.146188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4d1c39c0-bf10-49f2-93d4-c133d8597898/close` → **200**

```json
{
  "command_id": "4f6c4fd7-d88b-407b-963d-e704be7685d1",
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "4238054c-f2de-44c2-a1bd-1c55999e5b55",
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
  "last_heartbeat_at": "2026-10-28T14:16:24.51726Z",
  "last_location_at": "2026-10-28T14:16:24.51726Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/4238054c-f2de-44c2-a1bd-1c55999e5b55/close` → **200**

```json
{
  "command_id": "43b1db79-90a5-43b0-ab20-440b535f67ab",
  "expected_version": 1
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
      "timezone": "Europe/Warsaw",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
    },
    {
      "id": "5a000000-0000-4000-8000-000000000001",
      "code": "kyiv",
      "name": "Київ",
      "currency": "UAH",
      "timezone": "Europe/Kyiv",
      "working_hours": [],
      "payment_methods": [
        "CARD",
        "CASH",
        "TERMINAL"
      ],
      "orders_paused": false
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
  "device_ref": "sandbox-25549"
}
```

```json
{
  "challenge_id": "fc7efe27-87b3-4d49-9f14-fd99c0d87222",
  "expires_at": "2026-10-28T14:21:30.126259475Z",
  "resend_available_at": "2026-10-28T14:16:31.126259475Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "462446",
  "sent_at": "2026-10-28T14:16:30.128428806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc7efe27-87b3-4d49-9f14-fd99c0d87222",
  "code": "462446",
  "device_ref": "sandbox-25549"
}
```

```json
{
  "session_id": "1237d333-e982-4700-ae92-d3b98e70e309",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzg5MCwiaWF0IjoxNzkzMTk2OTkwLCJqdGkiOiJiYzdkZmI5ZS1lMjAyLTQ3ZjctYmQ3MC00ODc4M2M0N2YxNjgiLCJzaWQiOiIxMjM3ZDMzMy1lOTgyLTQ3MDAtYWU5Mi1kM2I5OGU3MGUzMDkifQ.0f2EXmttLME7FtRc480_is9dG6zeim4lxcXTebNHo78",
  "access_expires_at": "2026-10-28T14:31:30.416855566Z",
  "refresh_token": "7G0qJlVKGj1Ku-CHDP5xixq5N6eqe3th4gavMHYPkvo",
  "refresh_expires_at": "2026-11-27T14:16:30.416308458Z",
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
  "command_id": "e9cb466e-f786-4f58-8685-e5f77a1fa3b9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:30Z",
    "sequence": 1793196990934
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:30.952324Z",
  "last_location_at": "2026-10-28T14:16:30.952324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679329396",
  "device_ref": "sandbox-161"
}
```

```json
{
  "challenge_id": "7e6f43f3-fc6c-46cd-9b03-1c182df9159e",
  "expires_at": "2026-10-28T14:21:31.236319606Z",
  "resend_available_at": "2026-10-28T14:16:32.236319606Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679329396` → **200**

```json
{
  "phone": "+380679329396",
  "audience": "CLIENT",
  "code": "159756",
  "sent_at": "2026-10-28T14:16:31.238656342Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e6f43f3-fc6c-46cd-9b03-1c182df9159e",
  "code": "159756",
  "device_ref": "sandbox-161"
}
```

```json
{
  "session_id": "556de918-0f87-4f61-9b2c-f8355f2c6fa9",
  "subject": {
    "type": "CLIENT",
    "id": "b63882df-c56f-4609-8269-37053aaded4f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjM4ODJkZi1jNTZmLTQ2MDktODI2OS0zNzA1M2FhZGVkNGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3ODkxLCJpYXQiOjE3OTMxOTY5OTEsImp0aSI6IjFlMzZjMTA0LTg1OTItNGM1Yi04YWU4LTFlNTdmYzEzYTk2NSIsInNpZCI6IjU1NmRlOTE4LTBmODctNGY2MS05YjJjLWY4MzU1ZjJjNmZhOSJ9.r_5QQcDk2Cwt1sE5t6B_fqOur835Ns9tjyHmeoYdEw8",
  "access_expires_at": "2026-10-28T14:31:31.522887456Z",
  "refresh_token": "1Rpeav-G_1SPmTAXYcRYnYp7karp5nev7TQR7i4bJaI",
  "refresh_expires_at": "2026-11-27T14:16:31.522318565Z",
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
  "command_id": "716d9314-2481-4967-83d7-b2d927157d75",
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
  "id": "65b43273-3c95-4175-a73c-4de59ea7a2cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:32.046513Z",
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
  "command_id": "cbaa7811-8f92-4ffc-b269-8d80d75f8b24",
  "platform": "ANDROID",
  "token": "sandbox-driver-78e2c156-cb08-469d-a19b-637b739d4bb6"
}
```

```json
{
  "id": "021c720a-9253-48ec-8abf-fcbc34e73e85",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:16:32.328457Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "4f4a8ce5-40fd-4d08-8cfb-3e04cad58243",
  "platform": "ANDROID",
  "token": "sandbox-rider-cef505a5-e0e0-475c-83d1-500f325fec21"
}
```

```json
{
  "id": "ee6fb6d7-2ad1-475c-b174-bd40628491f2",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:16:32.592311Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4df97e1c-ec98-49a7-a514-cac29c9461cb",
  "quote_id": "65b43273-3c95-4175-a73c-4de59ea7a2cb",
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
  "id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b63882df-c56f-4609-8269-37053aaded4f",
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
  "created_at": "2026-10-28T14:16:32.8732Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The driver gets the offer and accepts it

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "3e21db46-1f6a-47ef-b5b7-0a69b5f918cf",
    "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
    "expires_at": "2026-10-28T14:16:47.876555Z",
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

`POST /api/driver/v1/offers/3e21db46-1f6a-47ef-b5b7-0a69b5f918cf/accept` → **200**

```json
{
  "command_id": "1b7dd8a6-2b36-43bc-b7aa-105438759cf8"
}
```

```json
{
  "id": "480c17eb-ae18-4e50-8616-af91f472a28a",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:16:32.849Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:16:32.849Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:16:34.301535282Z",
    "token_suffix": "9d4bb6",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "ca491f7d-242a-4b97-87fb-69fa5df3dd7a",
      "order_version": "2",
      "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380679329396&after=2026-10-28T14:16:32.849Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:16:34.303626059Z",
    "token_suffix": "5fec21",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "9260fa49-3e2a-4160-9542-afa6fad44f2a",
      "order_version": "3",
      "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/ab2f32d0-4cf7-4a49-a81e-afd94596191b/messages` → **201**

```json
{
  "command_id": "abda0597-b32a-4818-b884-734e65891ad9",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "a262797b-f876-48ad-aa63-c287e8b00240",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:16:34.781897316Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "assignment_id": "480c17eb-ae18-4e50-8616-af91f472a28a",
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

`POST /api/driver/v1/trips/d879437e-bd46-4c03-89c1-5cd88ae210b9/messages` → **201**

```json
{
  "command_id": "9234db49-b5e0-461f-b4d2-1c3503941d6b",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "9facbd13-f3df-4609-b7db-e1e0b1c96011",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:16:35.307579768Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/ab2f32d0-4cf7-4a49-a81e-afd94596191b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d879437e-bd46-4c03-89c1-5cd88ae210b9/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380679329396"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:36Z",
    "sequence": 1793196996822
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:36.101921Z",
  "last_location_at": "2026-10-28T14:16:36.101921Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "assignment_id": "480c17eb-ae18-4e50-8616-af91f472a28a",
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

`POST /api/driver/v1/trips/d879437e-bd46-4c03-89c1-5cd88ae210b9/arrive` → **200**

```json
{
  "command_id": "905f3091-2a05-45d4-9703-6861ae9fe2ab",
  "expected_version": 0
}
```

```json
{
  "id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "assignment_id": "480c17eb-ae18-4e50-8616-af91f472a28a",
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
  "arrived_at": "2026-10-28T14:16:36.64434Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d879437e-bd46-4c03-89c1-5cd88ae210b9/start` → **200**

```json
{
  "command_id": "ad1575fe-72fe-4146-9889-c9c4e5643d12",
  "expected_version": 1
}
```

```json
{
  "id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "assignment_id": "480c17eb-ae18-4e50-8616-af91f472a28a",
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
  "arrived_at": "2026-10-28T14:16:36.64434Z",
  "started_at": "2026-10-28T14:16:36.921185Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:37Z",
    "sequence": 1793196997183
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:37.202141Z",
  "last_location_at": "2026-10-28T14:16:37.202141Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d879437e-bd46-4c03-89c1-5cd88ae210b9/complete` → **200**

```json
{
  "command_id": "0206bcda-c9cd-485a-9d92-4254f1a6f2a3",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:16:37Z",
  "cash_received": true
}
```

```json
{
  "id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "assignment_id": "480c17eb-ae18-4e50-8616-af91f472a28a",
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
  "arrived_at": "2026-10-28T14:16:36.64434Z",
  "started_at": "2026-10-28T14:16:36.921185Z",
  "completed_at": "2026-10-28T14:16:37.476626Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/ab2f32d0-4cf7-4a49-a81e-afd94596191b` → **200**

```json
{
  "id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b63882df-c56f-4609-8269-37053aaded4f",
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
    "id": "480c17eb-ae18-4e50-8616-af91f472a28a",
    "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:16:32.8732Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders` → **200**

```json
[
  {
    "id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:16:32.8732Z",
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
    "id": "d879437e-bd46-4c03-89c1-5cd88ae210b9",
    "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
    "order_short_number": 9,
    "created_at": "2026-10-28T14:16:33.425948Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "aaeaf568-ec52-4ef4-af2a-4e5248d0369b",
    "order_id": "10a00574-ae62-4930-925c-804eece9de09",
    "order_short_number": 2,
    "created_at": "2026-10-28T14:15:03.69763Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "72611f8f-24b1-4e16-9847-cf59fc3f06ca",
    "order_id": "6e3aba38-eef2-450a-b7cc-a14f8533453c",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:14:44.898305Z",
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
      "balance_minor": -1682,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "figures": {
        "trips": 3,
        "fare_minor": 31551,
        "commission_minor": 4734,
        "driver_share_minor": 26817,
        "cash_minor": 28499,
        "cashless_minor": 3052,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": -1682
      }
    }
  ],
  "total": {
    "trips": 3,
    "fare_minor": 31551,
    "commission_minor": 4734,
    "driver_share_minor": 26817,
    "cash_minor": 28499,
    "cashless_minor": 3052,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": -1682
  },
  "balance_minor": -1682
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/ab2f32d0-4cf7-4a49-a81e-afd94596191b/tip` → **200**

```json
{
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
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
  "available_until": "2026-10-29T14:16:37.476626Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/ab2f32d0-4cf7-4a49-a81e-afd94596191b/tip` → **201**

```json
{
  "command_id": "1a6b07e6-c622-4810-9d57-0a3a504e5b08",
  "amount_minor": 1100
}
```

```json
{
  "id": "fe06dca9-2add-48e6-8dc3-dcb0153077cc",
  "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:16:42.417136Z"
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
  "session_id": "18fc0f72-33cc-4744-84a1-d0c8d92a0eef",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MDIsImlhdCI6MTc5MzE5NzAwMiwianRpIjoiNjQzODIxMWYtMWU1NS00ODY3LTkwMjItODQ1YThjNjU2ZmFhIiwic2lkIjoiMThmYzBmNzItMzNjYy00NzQ0LTg0YTEtZDBjOGQ5MmEwZWVmIn0._kSjcONrfzpSLg8OK8Rv5rfr7dl_geWZq8vSFgbX0iU",
  "access_expires_at": "2026-10-28T14:31:42.998200413Z",
  "refresh_token": "drMqyvZWJI1z8oN4m6VdJUjJZbAu6SJCs-1L_A8_b2Y",
  "refresh_expires_at": "2026-10-29T02:16:42.997645063Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "counts": {
        "created": 9,
        "fulfilled": 5,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "PHONE": 1,
          "APP": 8
        },
        "by_payment": {
          "CASH": 8,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 2,
          "STAFF": 1
        }
      }
    }
  ],
  "total": {
    "created": 9,
    "fulfilled": 5,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "PHONE": 1,
      "APP": 8
    },
    "by_payment": {
      "CASH": 8,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 2,
      "STAFF": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 1
    },
    {
      "cancelled_by": "STAFF",
      "code": "NO_CARS",
      "count": 1
    },
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
  ],
  "generated_at": "2026-10-28T14:16:43.270301731Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-28&to=2026-10-28` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-28",
  "to": "2026-10-28",
  "days": [
    {
      "date": "2026-10-28",
      "figures": {
        "trips": 5,
        "fares_minor": 64145,
        "service_rides_minor": 0,
        "commission_minor": 9624,
        "driver_share_minor": 54521,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 28499,
        "tips_minor": 5000,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 5,
    "fares_minor": 64145,
    "service_rides_minor": 0,
    "commission_minor": 9624,
    "driver_share_minor": 54521,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 28499,
    "tips_minor": 5000,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T14:16:43.5502578Z"
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
  "session_id": "53621792-0b47-415f-8232-9330a98c0f52",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MDQsImlhdCI6MTc5MzE5NzAwNCwianRpIjoiMTZjM2Q3ZDctOWI3YS00ZjBkLTgxMTgtOWViNWY0MzBlNDVjIiwic2lkIjoiNTM2MjE3OTItMGI0Ny00MTVmLTgyMzItOTMzMGE5OGMwZjUyIn0.hg4uGIsrUPEko4SJDBKlojyRcvyGMs5eSvynl1l3YUE",
  "access_expires_at": "2026-10-28T14:31:44.11432476Z",
  "refresh_token": "H_Wz-6rlQwsexwuTgh_p-kcb1nSptLGvGRZrVs2vSDI",
  "refresh_expires_at": "2026-10-29T02:16:44.113727992Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ab2f32d0-4cf7-4a49-a81e-afd94596191b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:32.873725Z",
      "actor": {
        "type": "CLIENT",
        "id": "b63882df-c56f-4609-8269-37053aaded4f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
        "quote_id": "65b43273-3c95-4175-a73c-4de59ea7a2cb",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "aaa07430-4a6a-4a95-94df-fe2e1d67dc14"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:32.875708Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
        "attempt_id": "906dff21-14ec-494a-bebf-eeabc990c8ac",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "aaa07430-4a6a-4a95-94df-fe2e1d67dc14"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:16:32.87952Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "3e21db46-1f6a-47ef-b5b7-0a69b5f918cf",
        "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "aaa07430-4a6a-4a95-94df-fe2e1d67dc14"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:16:33.427739Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "3e21db46-1f6a-47ef-b5b7-0a69b5f918cf",
        "order_id": "ab2f32d0-4cf7-4a49-a81e-afd94596191b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "480c17eb-ae18-4e50-8616-af91f472a28a"
      },
      "correlation_id": "da9b6482-4ac9-4d91-ba06-c4871206125f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:16:44.654913964Z",
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
      "last_location_at": "2026-10-28T14:16:37.202141Z",
      "order_id": null
    }
  ]
}
```

Done: order ab2f32d0-4cf7-4a49-a81e-afd94596191b.

# Scenario: incoming-call

## The admin says which city the service number belongs to

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
  "session_id": "0e26eea1-cea1-4141-8562-3a4491866666",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MDUsImlhdCI6MTc5MzE5NzAwNSwianRpIjoiYWViY2NkMzEtYjEyZC00MjEzLWE0OGMtM2EyYmIzOTMzNGM4Iiwic2lkIjoiMGUyNmVlYTEtY2VhMS00MTQxLTg1NjItM2E0NDkxODY2NjY2In0.1P8Lm9iKeMxExvNKFeRdjCJkii7pIJ30GTKhfA6Cg18",
  "access_expires_at": "2026-10-28T14:31:45.233540273Z",
  "refresh_token": "rv-6eYM5ewa709LOK9Yx8LYRuKdzyKeVK3PZabTUvoA",
  "refresh_expires_at": "2026-10-29T02:16:45.232958624Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/call-lines` → **200**

```json
{
  "lines": [
    {
      "number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "label": "Kyiv call centre",
      "version": 1
    }
  ]
}
```

`POST /api/admin/v1/call-lines/%2B380441110064` → **200**

```json
{
  "command_id": "3374475f-3123-41e7-8cf7-d0d8809f6480",
  "expected_version": 0,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "reason": "Sandbox incoming-call scenario"
}
```

```json
{
  "number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "label": "Kyiv call centre",
  "version": 1
}
```

## A call comes in; Asterisk reports it twice — one call in the log

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-28T14:16:46.000+0000",
  "channel": {
    "id": "1730052000.834326629",
    "linkedid": "1730052000.834326629",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672183842"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "timestamp": "2026-10-28T14:16:46.000+0000",
  "channel": {
    "id": "1730052000.834326629",
    "linkedid": "1730052000.834326629",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672183842"
    },
    "dialplan": {
      "context": "from-trunk",
      "exten": "380441110064"
    }
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
  "session_id": "ec0905bf-9513-4ecf-bb5c-d4149f1417aa",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MDYsImlhdCI6MTc5MzE5NzAwNiwianRpIjoiNGU2NmVmNWEtZGQ4Mi00YTJlLThkOTUtODQ5NTJlYjc0NDNhIiwic2lkIjoiZWMwOTA1YmYtOTUxMy00ZWNmLWJiNWMtZDQxNDlmMTQxN2FhIn0.gXp827S60tjCZlPGBU1KSYZJpvy4nf_JOxHTEdZcU5o",
  "access_expires_at": "2026-10-28T14:31:46.383945982Z",
  "refresh_token": "G7w4bKqTJ65CgcUzJ-AL_M_qVby8bMvmLhGXEmHHF4o",
  "refresh_expires_at": "2026-10-29T02:16:46.383340376Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "a1a18fbe-0e33-49e5-a7e9-267963c77b2d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672183842",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:16:46Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/a1a18fbe-0e33-49e5-a7e9-267963c77b2d/answer` → **200**

```json
{
  "command_id": "d75553ea-8d0e-4198-865c-90b4680eac8b"
}
```

```json
{
  "id": "a1a18fbe-0e33-49e5-a7e9-267963c77b2d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672183842",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "order_ids": [],
  "started_at": "2026-10-28T14:16:46Z",
  "answered_at": "2026-10-28T14:16:46.932842Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.834326629",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "11fb1d99-88b0-44f5-a200-1abc1e7b1c06",
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
  "id": "c7a3d921-844c-4961-aaa1-29082fee7bb7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:47.240476Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "ad9c4f73-7758-4d93-a75f-9532c1190bff",
  "quote_id": "c7a3d921-844c-4961-aaa1-29082fee7bb7",
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
  "caller": {
    "name": "Caller",
    "phone": "+380672183842"
  },
  "call_id": "a1a18fbe-0e33-49e5-a7e9-267963c77b2d"
}
```

```json
{
  "id": "b4632a99-4cbe-41b3-945a-fba2bf3c7cd4",
  "short_number": 10,
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
  "created_at": "2026-10-28T14:16:47.524243Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672183842"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The caller hangs up: the call is over, the order is not

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "1730052000.834326629",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a1a18fbe-0e33-49e5-a7e9-267963c77b2d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672183842",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [
        "b4632a99-4cbe-41b3-945a-fba2bf3c7cd4"
      ],
      "started_at": "2026-10-28T14:16:46Z",
      "answered_at": "2026-10-28T14:16:46.932842Z",
      "ended_at": "2026-10-28T14:16:47.816648Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "e9fb4a86-f5d2-402a-bed6-c8f2c4ecaf6d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675724469",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [],
      "started_at": "2026-10-28T14:14:52.795571Z",
      "answered_at": "2026-10-28T14:14:53.111885Z",
      "ended_at": "2026-10-28T14:14:53.407644Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:14:58.920731Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b4632a99-4cbe-41b3-945a-fba2bf3c7cd4` → **200**

```json
{
  "id": "b4632a99-4cbe-41b3-945a-fba2bf3c7cd4",
  "short_number": 10,
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
  "created_at": "2026-10-28T14:16:47.524243Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672183842"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b4632a99-4cbe-41b3-945a-fba2bf3c7cd4` → **200**

```json
{
  "id": "b4632a99-4cbe-41b3-945a-fba2bf3c7cd4",
  "short_number": 10,
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
  "created_at": "2026-10-28T14:16:47.524243Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672183842"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b4632a99-4cbe-41b3-945a-fba2bf3c7cd4/cancel` → **200**

```json
{
  "command_id": "c0ab149a-c1a4-4948-ac18-3bb46cbdad53",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b4632a99-4cbe-41b3-945a-fba2bf3c7cd4",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
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
  "created_at": "2026-10-28T14:16:47.524243Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672183842"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call a1a18fbe-0e33-49e5-a7e9-267963c77b2d with order b4632a99-4cbe-41b3-945a-fba2bf3c7cd4.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15326"
}
```

```json
{
  "challenge_id": "41d6ed8a-6387-45fd-9154-a535975f6853",
  "expires_at": "2026-10-28T14:21:49.012041932Z",
  "resend_available_at": "2026-10-28T14:16:50.012041932Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "634588",
  "sent_at": "2026-10-28T14:16:49.015522423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "41d6ed8a-6387-45fd-9154-a535975f6853",
  "code": "634588",
  "device_ref": "sandbox-15326"
}
```

```json
{
  "session_id": "5bfd3cb7-117f-4a7e-9c52-d60c8344e49c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkwOSwiaWF0IjoxNzkzMTk3MDA5LCJqdGkiOiIwNDA1MjRjNy01MTk0LTRkZWMtYjczMC1mNzZjZDM4NTE4ZDEiLCJzaWQiOiI1YmZkM2NiNy0xMTdmLTRhN2UtOWM1Mi1kNjBjODM0NGU0OWMifQ.7syrtQiP2EO33td79AqMNEmlSVUoIfvdmVhbFUma4Fc",
  "access_expires_at": "2026-10-28T14:31:49.297278446Z",
  "refresh_token": "xLnuiC26fVsUntNSbx7S_jkGyhnRLJFQOhTIR5ekGj8",
  "refresh_expires_at": "2026-11-27T14:16:49.296666699Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:37.202141Z",
  "last_location_at": "2026-10-28T14:16:37.202141Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/handover` → **200**

```json
{
  "command_id": "642107f6-a5d3-4222-aff7-414365fb69c8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:37.202141Z",
  "last_location_at": "2026-10-28T14:16:37.202141Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:50Z",
    "sequence": 1793197010864
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:50.104309Z",
  "last_location_at": "2026-10-28T14:16:50.104309Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668825360",
  "device_ref": "sandbox-31803"
}
```

```json
{
  "challenge_id": "97d313c2-38a1-49c2-81c3-aa54de680820",
  "expires_at": "2026-10-28T14:21:50.367082486Z",
  "resend_available_at": "2026-10-28T14:16:51.367082486Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668825360` → **200**

```json
{
  "phone": "+380668825360",
  "audience": "CLIENT",
  "code": "424748",
  "sent_at": "2026-10-28T14:16:50.369397117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97d313c2-38a1-49c2-81c3-aa54de680820",
  "code": "424748",
  "device_ref": "sandbox-31803"
}
```

```json
{
  "session_id": "5c425fd9-ede8-44dc-9f30-9954b20c49fb",
  "subject": {
    "type": "CLIENT",
    "id": "58de339f-c775-4a32-84d4-8243a8af8813"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OGRlMzM5Zi1jNzc1LTRhMzItODRkNC04MjQzYThhZjg4MTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTEwLCJpYXQiOjE3OTMxOTcwMTAsImp0aSI6IjIxMzE2ZTM0LTllZTQtNDdlOS1hMjk0LTRlYjFjNDhjMjliMSIsInNpZCI6IjVjNDI1ZmQ5LWVkZTgtNDRkYy05ZjMwLTk5NTRiMjBjNDlmYiJ9.t96KCEn3KVSDsc6msQSh1wzYnlF46SlYeT80PvNmYPc",
  "access_expires_at": "2026-10-28T14:31:50.659888924Z",
  "refresh_token": "BDs-7fkYcjDcOucWHkxxsGjlE1YT0mwIZuDGUlcy0jk",
  "refresh_expires_at": "2026-11-27T14:16:50.65938503Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8242331e-18c6-41bf-bca3-70c5cf791721",
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
  "id": "d02c04d8-d26b-4190-a3f8-0e9846c3bced",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:21:50.933354Z",
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
  "command_id": "e017ecf0-2db6-49d6-83a5-58bfc3cf4aec",
  "quote_id": "d02c04d8-d26b-4190-a3f8-0e9846c3bced",
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
  "id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "58de339f-c775-4a32-84d4-8243a8af8813",
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
  "created_at": "2026-10-28T14:16:51.209121Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "f48a2d96-7670-47bc-9c82-be3ddf5cb363",
    "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
    "expires_at": "2026-10-28T14:17:06.212062Z",
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

`POST /api/driver/v1/offers/f48a2d96-7670-47bc-9c82-be3ddf5cb363/accept` → **200**

```json
{
  "command_id": "393ed925-853c-449d-bc69-e3e40b5285c6"
}
```

```json
{
  "id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8",
  "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8b0f016f-2536-44de-83b0-843c6573a456",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8b0f016f-2536-44de-83b0-843c6573a456",
  "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
  "assignment_id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8",
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

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:52Z",
    "sequence": 1793197012327
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:52.346206Z",
  "last_location_at": "2026-10-28T14:16:52.346206Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8b0f016f-2536-44de-83b0-843c6573a456/arrive` → **200**

```json
{
  "command_id": "8d6654cc-349d-4286-b550-07733fb84d95",
  "expected_version": 0
}
```

```json
{
  "id": "8b0f016f-2536-44de-83b0-843c6573a456",
  "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
  "assignment_id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8",
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
  "arrived_at": "2026-10-28T14:16:52.624516Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8b0f016f-2536-44de-83b0-843c6573a456/start` → **200**

```json
{
  "command_id": "510b45ea-f7b5-4eb5-9a6c-0eaa21fa63d3",
  "expected_version": 1
}
```

```json
{
  "id": "8b0f016f-2536-44de-83b0-843c6573a456",
  "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
  "assignment_id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8",
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
  "arrived_at": "2026-10-28T14:16:52.624516Z",
  "started_at": "2026-10-28T14:16:52.904344Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:53Z",
    "sequence": 1793197013168
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:53.186934Z",
  "last_location_at": "2026-10-28T14:16:53.186934Z",
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
  "device_ref": "sandbox-18515"
}
```

```json
{
  "challenge_id": "fd04c3cd-bcf0-4d56-8620-edb5d3d14a3f",
  "expires_at": "2026-10-28T14:21:53.463862031Z",
  "resend_available_at": "2026-10-28T14:16:54.463862031Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "811402",
  "sent_at": "2026-10-28T14:16:53.466328281Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fd04c3cd-bcf0-4d56-8620-edb5d3d14a3f",
  "code": "811402",
  "device_ref": "sandbox-18515"
}
```

```json
{
  "session_id": "2d52a66d-e587-4586-b014-b5970c285879",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkxMywiaWF0IjoxNzkzMTk3MDEzLCJqdGkiOiI0ODUxMmE3OS1kNGNjLTQwOWQtYTM0OC03N2ZhM2I0Y2ZjMGYiLCJzaWQiOiIyZDUyYTY2ZC1lNTg3LTQ1ODYtYjAxNC1iNTk3MGMyODU4NzkifQ.g9rt3amIJdI3I1seKUEwzTqQIPvWtHiAjpfF8aZWZ5k",
  "access_expires_at": "2026-10-28T14:31:53.756525258Z",
  "refresh_token": "m7oogEl4UUF4uSAzfO3sGuTu9RXhR-hCY9Pok0iUfQA",
  "refresh_expires_at": "2026-11-27T14:16:53.756019731Z",
  "account_created": false
}
```

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
  "command_id": "0d7f09cb-0cb2-436a-88b9-7a5afcef027d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:54Z",
    "sequence": 1793197014279
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d33a600-a919-49dc-ac23-144ed8937d65",
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
  "last_heartbeat_at": "2026-10-28T14:16:54.296359Z",
  "last_location_at": "2026-10-28T14:16:54.296359Z",
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
  "session_id": "f6591ea2-6fe2-4fa1-af69-285687d7ccea",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MTQsImlhdCI6MTc5MzE5NzAxNCwianRpIjoiZmZhNTM3NjQtNTIyYy00MDBlLWJkY2QtMGE0ZDc3MDg2Zjg3Iiwic2lkIjoiZjY1OTFlYTItNmZlMi00ZmExLWFmNjktMjg1Njg3ZDdjY2VhIn0.KOvFkmZiW4Exqyt4_pHB0tn-9uHMydTlEPLIpz2o-2g",
  "access_expires_at": "2026-10-28T14:31:54.854093505Z",
  "refresh_token": "hB0KSmE7sQDgFU5KNFM3kFYk7JjJBJ6OytrpYS89Eko",
  "refresh_expires_at": "2026-10-29T02:16:54.853512214Z",
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
  "session_id": "1c94a302-b069-4948-ae97-35933ec5dbe1",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MTUsImlhdCI6MTc5MzE5NzAxNSwianRpIjoiNDc0ZjY4ZWItOWJhZS00ZWVlLTg5OTgtMWFjYTJjNzhlYTliIiwic2lkIjoiMWM5NGEzMDItYjA2OS00OTQ4LWFlOTctMzU5MzNlYzVkYmUxIn0.2KW2kX0aVoqkJakwlG3yKLspu2VcdK5-qzn1Lv66cYU",
  "access_expires_at": "2026-10-28T14:31:55.405254821Z",
  "refresh_token": "GnC_cNCSqD_S7VgEHscdy1AvNhNJv4mG9Ja1T9wklIE",
  "refresh_expires_at": "2026-10-29T02:16:55.404693257Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787` → **200**

```json
{
  "id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
  "short_number": 11,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "58de339f-c775-4a32-84d4-8243a8af8813",
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
    "id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8",
    "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8b0f016f-2536-44de-83b0-843c6573a456",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:16:51.209121Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787/interrupt` → **200**

```json
{
  "command_id": "1971c702-596f-4e77-bacd-cecada0dee5f",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
    "short_number": 11,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "58de339f-c775-4a32-84d4-8243a8af8813",
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
      "id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8",
      "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "8b0f016f-2536-44de-83b0-843c6573a456",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:16:51.209121Z",
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
    "id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
    "short_number": 12,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "58de339f-c775-4a32-84d4-8243a8af8813",
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
    "id": "175b4fc5-53c7-418b-83e7-78b23c92d281",
    "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
    "expires_at": "2026-10-28T14:17:10.977312Z",
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

`POST /api/driver/v1/offers/175b4fc5-53c7-418b-83e7-78b23c92d281/accept` → **200**

```json
{
  "command_id": "76c8cb85-9655-4f02-879e-4d93dba19dd9"
}
```

```json
{
  "id": "27d28149-b83f-4f49-a400-046c65280616",
  "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2459b365-af3d-4377-aebd-d0a886986e64",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2459b365-af3d-4377-aebd-d0a886986e64",
  "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
  "assignment_id": "27d28149-b83f-4f49-a400-046c65280616",
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
  "session_id": "8d33a600-a919-49dc-ac23-144ed8937d65",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T14:16:54.296359Z",
  "last_location_at": "2026-10-28T14:16:54.296359Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8d33a600-a919-49dc-ac23-144ed8937d65/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:16:57Z",
    "sequence": 1793197017358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d33a600-a919-49dc-ac23-144ed8937d65",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "TO_PICKUP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "last_heartbeat_at": "2026-10-28T14:16:57.378362Z",
  "last_location_at": "2026-10-28T14:16:57.378362Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2459b365-af3d-4377-aebd-d0a886986e64/arrive` → **200**

```json
{
  "command_id": "3b3738d0-3b1f-4f7a-96f4-fe65e88e6112",
  "expected_version": 0
}
```

```json
{
  "id": "2459b365-af3d-4377-aebd-d0a886986e64",
  "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
  "assignment_id": "27d28149-b83f-4f49-a400-046c65280616",
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
  "arrived_at": "2026-10-28T14:16:57.650259Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2459b365-af3d-4377-aebd-d0a886986e64/start` → **200**

```json
{
  "command_id": "4ce23edd-6062-49d4-a99e-44a200bd397d",
  "expected_version": 1
}
```

```json
{
  "id": "2459b365-af3d-4377-aebd-d0a886986e64",
  "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
  "assignment_id": "27d28149-b83f-4f49-a400-046c65280616",
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
  "arrived_at": "2026-10-28T14:16:57.650259Z",
  "started_at": "2026-10-28T14:16:57.928621Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2459b365-af3d-4377-aebd-d0a886986e64/complete` → **200**

```json
{
  "command_id": "c1c91b02-77b9-474b-88ff-7ee711c4835e",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:16:58Z"
}
```

```json
{
  "id": "2459b365-af3d-4377-aebd-d0a886986e64",
  "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
  "assignment_id": "27d28149-b83f-4f49-a400-046c65280616",
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
  "arrived_at": "2026-10-28T14:16:57.650259Z",
  "started_at": "2026-10-28T14:16:57.928621Z",
  "completed_at": "2026-10-28T14:16:58.214008Z",
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
    "id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
    "short_number": 12,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:16:55.968841Z",
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
    "id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
    "short_number": 11,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:16:51.209121Z",
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

`GET /api/operator/v1/orders/f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:16:51.209595Z",
      "actor": {
        "type": "CLIENT",
        "id": "58de339f-c775-4a32-84d4-8243a8af8813",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
        "quote_id": "d02c04d8-d26b-4190-a3f8-0e9846c3bced",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "599bf46a-aae4-445e-a3ea-36a6cc1cb983"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:16:51.211241Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
        "attempt_id": "d7a068a6-9019-4e1b-96be-30266d15d154",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "599bf46a-aae4-445e-a3ea-36a6cc1cb983"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:16:51.214092Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f48a2d96-7670-47bc-9c82-be3ddf5cb363",
        "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "599bf46a-aae4-445e-a3ea-36a6cc1cb983"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:16:51.775332Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f48a2d96-7670-47bc-9c82-be3ddf5cb363",
        "order_id": "f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8e1ecd97-f999-4ee2-86f0-e5f147abb3b8"
      },
      "correlation_id": "e5e0b076-3af7-4c93-90d8-0f55237f0a87"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/9e89cd5d-c480-47fc-a4de-ba87486ac89e/tip` → **200**

```json
{
  "order_id": "9e89cd5d-c480-47fc-a4de-ba87486ac89e",
  "currency": "UAH",
  "trip_cost_minor": 13074,
  "presets": [
    {
      "percent": 10,
      "amount_minor": 1400
    },
    {
      "percent": 15,
      "amount_minor": 2000
    },
    {
      "percent": 20,
      "amount_minor": 2700
    },
    {
      "percent": 25,
      "amount_minor": 3300
    }
  ],
  "min_minor": 100,
  "max_minor": 13100,
  "method": null,
  "available_until": "2026-10-29T14:16:58.214008Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/9e89cd5d-c480-47fc-a4de-ba87486ac89e/tip` → **409**

```json
{
  "command_id": "0f2b2115-77aa-49de-b2e9-3ad9eaf7c5d3",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/9e89cd5d-c480-47fc-a4de-ba87486ac89e/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "b280d21a-da2c-4a02-ae0f-614a785720ed"
}
```

Done: interrupted f1ba60a2-38cd-470d-8b5d-c0ce4d0ff787, follow-up 9e89cd5d-c480-47fc-a4de-ba87486ac89e.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c90ef9fb-40ea-4944-ad74-5cb10467ab48",
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
  "last_heartbeat_at": "2026-10-28T14:16:53.186934Z",
  "last_location_at": "2026-10-28T14:16:53.186934Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c90ef9fb-40ea-4944-ad74-5cb10467ab48/close` → **200**

```json
{
  "command_id": "cf69ddeb-281b-449a-ab79-6dc8b1d666d7",
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
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d33a600-a919-49dc-ac23-144ed8937d65",
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
  "last_heartbeat_at": "2026-10-28T14:16:57.378362Z",
  "last_location_at": "2026-10-28T14:16:57.378362Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d33a600-a919-49dc-ac23-144ed8937d65/close` → **200**

```json
{
  "command_id": "00e87483-0367-4451-998d-3d8fcd92276e",
  "expected_version": 0
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

# Scenario: legal-acceptance

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
  "session_id": "bc022f8e-db49-4b2d-8e87-1b4253ef3099",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MjQsImlhdCI6MTc5MzE5NzAyNCwianRpIjoiNzUyZmM2NjgtMjg2OS00MTQ3LWI0MWUtNjkyNTFmMTM3MDc4Iiwic2lkIjoiYmMwMjJmOGUtZGI0OS00YjJkLThlODctMWI0MjUzZWYzMDk5In0.PLj8_m45YW6trZkNmLkMDDFn64qKttpBMIDaL_eR-h8",
  "access_expires_at": "2026-10-28T14:32:04.272353942Z",
  "refresh_token": "4PYHt6PHTHzmrEBXKk2puzq_wZdCEwouQnn6Xjns27M",
  "refresh_expires_at": "2026-10-29T02:17:04.271807519Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dbbbe068-87b5-492c-86bd-87441f4d96a4",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:17:04Z"
}
```

```json
{
  "id": "bef017a9-d972-4448-a315-99762ff1dea4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:17:04Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/bef017a9-d972-4448-a315-99762ff1dea4/publish` → **200**

```json
{
  "command_id": "13747114-15df-4730-b571-9f1759d3f5ad",
  "expected_version": 0
}
```

```json
{
  "id": "bef017a9-d972-4448-a315-99762ff1dea4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:17:04.844376Z",
  "published_at": "2026-10-28T14:17:04.844376Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "bef017a9-d972-4448-a315-99762ff1dea4",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:17:04.844376Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634172820",
  "device_ref": "sandbox-30741"
}
```

```json
{
  "challenge_id": "b80348f6-2cf1-4793-9370-b87d9c9c97da",
  "expires_at": "2026-10-28T14:22:05.380723873Z",
  "resend_available_at": "2026-10-28T14:17:06.380723873Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634172820` → **200**

```json
{
  "phone": "+380634172820",
  "audience": "CLIENT",
  "code": "653751",
  "sent_at": "2026-10-28T14:17:05.382925586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b80348f6-2cf1-4793-9370-b87d9c9c97da",
  "code": "653751",
  "device_ref": "sandbox-30741"
}
```

```json
{
  "session_id": "6f5e39a7-e96c-4e72-9450-cfdb426341dd",
  "subject": {
    "type": "CLIENT",
    "id": "9e1c2304-b3fe-485f-b600-15825268c3cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTFjMjMwNC1iM2ZlLTQ4NWYtYjYwMC0xNTgyNTI2OGMzY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTI1LCJpYXQiOjE3OTMxOTcwMjUsImp0aSI6IjgwYjkzYTdiLTA5MWMtNGMwMy04Njk5LTA4MTlhZTU1ZDg4OSIsInNpZCI6IjZmNWUzOWE3LWU5NmMtNGU3Mi05NDUwLWNmZGI0MjYzNDFkZCJ9.0x18QnshDWUj3QGBnWYlQ9J2o-kdMh1FqHbjwGDxTZU",
  "access_expires_at": "2026-10-28T14:32:05.670153106Z",
  "refresh_token": "S8UkqB2L1d3fjDmgNEKAxWO7y4APDeqWmCNqObNRIPk",
  "refresh_expires_at": "2026-11-27T14:17:05.669614366Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "bef017a9-d972-4448-a315-99762ff1dea4",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:17:04.844376Z",
      "languages": [
        "pl",
        "uk"
      ]
    }
  ]
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0ef20c47-0032-4ee3-b098-7cc4c71d06bb",
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
  "id": "f1f0c06c-08c8-4608-905f-d91e31307a99",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:06.209233Z",
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

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "acc768c8-a246-4d1b-a3af-b609efb49839",
  "quote_id": "f1f0c06c-08c8-4608-905f-d91e31307a99",
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
  "instance": "/api/rider/v1/orders",
  "status": 403,
  "title": "Acceptance required",
  "type": "https://errors.blizz.taxi/acceptance-required",
  "code": "ACCEPTANCE_REQUIRED",
  "correlation_id": "1deaa96d-4f3e-4e8f-bb28-3d601810275a"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "55029b3e-9326-4fbe-8637-3eb2a9d15b83",
  "version_id": "bef017a9-d972-4448-a315-99762ff1dea4",
  "language": "uk"
}
```

```json
{
  "version_id": "bef017a9-d972-4448-a315-99762ff1dea4",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:17:06.773322Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "675a5ea2-c3d2-4ef5-ae0f-c1356ded26f2",
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
  "id": "1c318d50-60a4-4ab7-a09f-a9f7d3384f54",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:07.047947Z",
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
  "command_id": "4a1a39c1-8ea7-4d16-a926-0f7e6db750ee",
  "quote_id": "1c318d50-60a4-4ab7-a09f-a9f7d3384f54",
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
  "id": "5f5a59dd-b8ac-4067-808d-bb266b23f12a",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e1c2304-b3fe-485f-b600-15825268c3cc",
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
  "created_at": "2026-10-28T14:17:07.321167Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5f5a59dd-b8ac-4067-808d-bb266b23f12a` → **200**

```json
{
  "id": "5f5a59dd-b8ac-4067-808d-bb266b23f12a",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e1c2304-b3fe-485f-b600-15825268c3cc",
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
  "created_at": "2026-10-28T14:17:07.321167Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5f5a59dd-b8ac-4067-808d-bb266b23f12a/cancel` → **200**

```json
{
  "command_id": "eb1eced0-c4db-4149-9a1a-6683446bbf95",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5f5a59dd-b8ac-4067-808d-bb266b23f12a",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9e1c2304-b3fe-485f-b600-15825268c3cc",
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
  "created_at": "2026-10-28T14:17:07.321167Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/bef017a9-d972-4448-a315-99762ff1dea4` → **409**

```json
{
  "command_id": "36d76966-42d4-4b5c-b22f-5db7bb2affec",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:17:08Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/bef017a9-d972-4448-a315-99762ff1dea4",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d5755fc0-350b-4ac5-b22a-18e833a19d8f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "e8dd73fe-6d6e-422d-a75d-c0d9fb03a65c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:17:08Z"
}
```

```json
{
  "id": "3ffc9a56-7352-4c07-b9b4-bd37d6c214ca",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:17:08Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/3ffc9a56-7352-4c07-b9b4-bd37d6c214ca/publish` → **200**

```json
{
  "command_id": "e60bf1b7-120f-4048-99a9-014480c91586",
  "expected_version": 0
}
```

```json
{
  "id": "3ffc9a56-7352-4c07-b9b4-bd37d6c214ca",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:17:08.743789Z",
  "published_at": "2026-10-28T14:17:08.743789Z",
  "version": 1
}
```

# Scenario: multiple-orders

## A driver goes online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-1137"
}
```

```json
{
  "challenge_id": "4b71fa48-d5d4-4ad3-96fc-a1c837911ece",
  "expires_at": "2026-10-28T14:22:09.022225786Z",
  "resend_available_at": "2026-10-28T14:17:10.022225786Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "323972",
  "sent_at": "2026-10-28T14:17:09.024274034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b71fa48-d5d4-4ad3-96fc-a1c837911ece",
  "code": "323972",
  "device_ref": "sandbox-1137"
}
```

```json
{
  "session_id": "3abe5a37-5c22-4664-9486-71e741822c98",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkyOSwiaWF0IjoxNzkzMTk3MDI5LCJqdGkiOiIzYTE0MGEzNy02OTEwLTQ4NmItOWFkYy1iNjhiNTU3ZmYyNzEiLCJzaWQiOiIzYWJlNWEzNy01YzIyLTQ2NjQtOTQ4Ni03MWU3NDE4MjJjOTgifQ.aFKEOQ8-nGBrzHHsfQQyQl9ui7NIcfSSr8OVIw6afAs",
  "access_expires_at": "2026-10-28T14:32:09.319775735Z",
  "refresh_token": "7z-R48rQKc-9n83T2XCrmm6wGEQ5XsAgeYa3O4-67FQ",
  "refresh_expires_at": "2026-11-27T14:17:09.319242196Z",
  "account_created": false
}
```

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
  "command_id": "980cf6a6-5712-4cd8-96c0-c44a4f2735e5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:09Z",
    "sequence": 1793197029841
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1f92df7-e7ae-43b0-b7b1-04919fba6399",
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
  "last_heartbeat_at": "2026-10-28T14:17:09.858534Z",
  "last_location_at": "2026-10-28T14:17:09.858534Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679565056",
  "device_ref": "sandbox-13205"
}
```

```json
{
  "challenge_id": "ec0fe7eb-a499-4531-9ae1-9eba9613e3b2",
  "expires_at": "2026-10-28T14:22:10.13187558Z",
  "resend_available_at": "2026-10-28T14:17:11.13187558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679565056` → **200**

```json
{
  "phone": "+380679565056",
  "audience": "CLIENT",
  "code": "682733",
  "sent_at": "2026-10-28T14:17:10.133906975Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec0fe7eb-a499-4531-9ae1-9eba9613e3b2",
  "code": "682733",
  "device_ref": "sandbox-13205"
}
```

```json
{
  "session_id": "cf8b2a4e-f45b-4134-b93c-220788357fd6",
  "subject": {
    "type": "CLIENT",
    "id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NGU0MWY1OC1kM2EyLTQwZWMtODkxNS1lZTJhZTZhZTFhYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTMwLCJpYXQiOjE3OTMxOTcwMzAsImp0aSI6IjkzNTExNDZlLTQ2MTEtNDJlNS1hOGFhLTczNmZhZjljMjRmZiIsInNpZCI6ImNmOGIyYTRlLWY0NWItNDEzNC1iOTNjLTIyMDc4ODM1N2ZkNiJ9.Ucac_eakXWJPD3RZQOZW2ZEvNxGTxnd1g-xVq_ycYVY",
  "access_expires_at": "2026-10-28T14:32:10.42943334Z",
  "refresh_token": "vbBpI17hGrp--FAWPK_GCsjdhQHym6E3GQDSCVIqh6w",
  "refresh_expires_at": "2026-11-27T14:17:10.428894651Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "bb834aaa-fb49-4e92-9979-eba832c206d2",
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
  "id": "4095c33b-9665-4e3f-9523-43b914dd64f4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:10.698598Z",
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
  "command_id": "f5e51599-4b96-4c8b-b52d-b262c1ffb1be",
  "quote_id": "4095c33b-9665-4e3f-9523-43b914dd64f4",
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
    "phone": "+380671426176"
  }
}
```

```json
{
  "id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "created_at": "2026-10-28T14:17:10.986897Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The offer says nothing about granny; once accepted, the trip does

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "bcee2393-a235-4659-9a7a-62c214ea6bd2",
    "order_id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
    "expires_at": "2026-10-28T14:17:25.99024Z",
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

`POST /api/driver/v1/offers/bcee2393-a235-4659-9a7a-62c214ea6bd2/accept` → **200**

```json
{
  "command_id": "81b2f444-14f2-4f95-9fa3-28d3775b3bd3"
}
```

```json
{
  "id": "c961a0aa-94a3-4a88-9f79-838dc43c4cb1",
  "order_id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc875fc3-9114-4fef-938a-fb8d9e8059c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc875fc3-9114-4fef-938a-fb8d9e8059c6",
  "order_id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
  "assignment_id": "c961a0aa-94a3-4a88-9f79-838dc43c4cb1",
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
    "phone": "+380671426176"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b87638e5-740e-4436-bcf6-3e21bbc281c5",
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
  "id": "0e80b070-4a6b-4104-ac28-e1481dec1b10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:12.097759Z",
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
  "command_id": "fe40493f-10dd-490d-bfd9-2d2414e88e06",
  "quote_id": "0e80b070-4a6b-4104-ac28-e1481dec1b10",
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
  "id": "9a98d0db-5888-4916-843d-f261ccf45f0f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:17:12.376063Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "02836b89-6661-4a6a-b1ab-12c835e04cec",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:17:12Z"
}
```

```json
{
  "id": "203209fc-efce-40ff-9320-ce6bc732e53a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:12.673168Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:17:12Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d9fa86f3-b673-4cd7-acab-3a41115ca66e",
  "quote_id": "203209fc-efce-40ff-9320-ce6bc732e53a",
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
  "pickup_at": "2026-10-28T17:17:12Z"
}
```

```json
{
  "id": "ffce4edf-4ff0-4fb8-ba51-285cf6c91383",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "created_at": "2026-10-28T14:17:12.949654Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The fourth is refused: at most three active orders, orders for later included

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e06fe5ca-e5b7-476e-895b-8082a7cdcd25",
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
  "id": "db6947a3-e8c6-4391-a314-ba0f509556fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:13.245337Z",
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
  "command_id": "d13ee667-e994-407c-b222-15041c5fd20c",
  "quote_id": "db6947a3-e8c6-4391-a314-ba0f509556fa",
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
  "correlation_id": "42dd8a82-7f3b-4676-8770-3ef258ba2f3c"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "ffce4edf-4ff0-4fb8-ba51-285cf6c91383",
      "short_number": 16,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
      "created_at": "2026-10-28T14:17:12.949654Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:17:12Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "9a98d0db-5888-4916-843d-f261ccf45f0f",
      "short_number": 15,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
      "search_phase": "BROADCAST",
      "assignment": null,
      "created_at": "2026-10-28T14:17:12.376063Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
      "short_number": 14,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "9a98d0db-5888-4916-843d-f261ccf45f0f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:17:12.376063Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c` → **200**

```json
{
  "id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
  "short_number": 14,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
    "id": "c961a0aa-94a3-4a88-9f79-838dc43c4cb1",
    "order_id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dc875fc3-9114-4fef-938a-fb8d9e8059c6",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:17:10.986897Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": {
    "seconds": 40,
    "distance_metres": 275,
    "source": "STRAIGHT_LINE",
    "location_at": "2026-10-28T14:17:09.858534Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c/cancel` → **200**

```json
{
  "command_id": "681f0332-cd21-4afd-9917-12a030fc5da2",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
    "id": "c961a0aa-94a3-4a88-9f79-838dc43c4cb1",
    "order_id": "6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dc875fc3-9114-4fef-938a-fb8d9e8059c6",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:17:10.986897Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9a98d0db-5888-4916-843d-f261ccf45f0f` → **200**

```json
{
  "id": "9a98d0db-5888-4916-843d-f261ccf45f0f",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:17:12.376063Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9a98d0db-5888-4916-843d-f261ccf45f0f/cancel` → **200**

```json
{
  "command_id": "fc57ab09-67c1-4cce-9c13-645fb849f58a",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9a98d0db-5888-4916-843d-f261ccf45f0f",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "created_at": "2026-10-28T14:17:12.376063Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ffce4edf-4ff0-4fb8-ba51-285cf6c91383` → **200**

```json
{
  "id": "ffce4edf-4ff0-4fb8-ba51-285cf6c91383",
  "short_number": 16,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "created_at": "2026-10-28T14:17:12.949654Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ffce4edf-4ff0-4fb8-ba51-285cf6c91383/cancel` → **200**

```json
{
  "command_id": "bb5c635e-9885-4915-a0c2-2a2a9dca9a31",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ffce4edf-4ff0-4fb8-ba51-285cf6c91383",
  "short_number": 16,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "74e41f58-d3a2-40ec-8915-ee2ae6ae1abc",
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
  "created_at": "2026-10-28T14:17:12.949654Z",
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
  "pickup_at": "2026-10-28T17:17:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f1f92df7-e7ae-43b0-b7b1-04919fba6399",
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
  "last_heartbeat_at": "2026-10-28T14:17:09.858534Z",
  "last_location_at": "2026-10-28T14:17:09.858534Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1f92df7-e7ae-43b0-b7b1-04919fba6399/close` → **200**

```json
{
  "command_id": "6aba1758-2e8c-4fbe-b823-ac3149ee5abd",
  "expected_version": 0
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

Done: orders 6e83d4d6-7d61-4cf3-90cc-f477f0e5ed9c, 9a98d0db-5888-4916-843d-f261ccf45f0f, ffce4edf-4ff0-4fb8-ba51-285cf6c91383.

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
  "session_id": "312470fd-e412-4348-a6be-9b25878635a8",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MzYsImlhdCI6MTc5MzE5NzAzNiwianRpIjoiZTI4ZmI5ZWEtNWRjYi00ZWRiLWJjNDYtNzhlNDc0ZDJkZmRjIiwic2lkIjoiMzEyNDcwZmQtZTQxMi00MzQ4LWE2YmUtOWIyNTg3ODYzNWE4In0.tr_GKgsSqUfZXCgaLiY1IDa94l3ZIIKC5Tr9tsyg4U0",
  "access_expires_at": "2026-10-28T14:32:16.898364295Z",
  "refresh_token": "iJoNp7G4HQURMdz-Z8D1yUHfkiD-24OwTSI_-EBFC8M",
  "refresh_expires_at": "2026-10-29T02:17:16.897774207Z",
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
  "session_id": "c4f92274-b3ce-44ad-90b7-7752936cbe1c",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5MzcsImlhdCI6MTc5MzE5NzAzNywianRpIjoiMGNlMTg1MzQtZGIyNS00MzUyLTg4Y2QtNjUzZjBkNjZiZDA5Iiwic2lkIjoiYzRmOTIyNzQtYjNjZS00NGFkLTkwYjctNzc1MjkzNmNiZTFjIn0.tV4tpYr9U7OmHUj62Sd-qakgtsyxRfkRIR-nlwAv28w",
  "access_expires_at": "2026-10-28T14:32:17.462097442Z",
  "refresh_token": "3353FmmTqsIjh2tcI-S5idgYpRu2-BrKlldRrddpec0",
  "refresh_expires_at": "2026-10-29T02:17:17.461544246Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2306"
}
```

```json
{
  "challenge_id": "b65ab7f2-ad79-4e3c-9d3f-88db051cc9a3",
  "expires_at": "2026-10-28T14:22:17.723123876Z",
  "resend_available_at": "2026-10-28T14:17:18.723123876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "347670",
  "sent_at": "2026-10-28T14:17:17.725313247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b65ab7f2-ad79-4e3c-9d3f-88db051cc9a3",
  "code": "347670",
  "device_ref": "sandbox-2306"
}
```

```json
{
  "session_id": "8ddfbdd9-57f5-4312-9a25-c4c8ffd06662",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzkzOCwiaWF0IjoxNzkzMTk3MDM4LCJqdGkiOiIyMzg3ZmJlMy00ZDUxLTQwZWYtOWUzYy01M2I1ZTJiYzVmODIiLCJzaWQiOiI4ZGRmYmRkOS01N2Y1LTQzMTItOWEyNS1jNGM4ZmZkMDY2NjIifQ.PeK7Tc8Rk_jOGuxhJqUvXUzy-b7GgCTbVZuqwbA1trA",
  "access_expires_at": "2026-10-28T14:32:18.019468499Z",
  "refresh_token": "7ZNq8UbzAwhZJiTqXfSOOBG0-o-2jTWgIwgoETRMsBA",
  "refresh_expires_at": "2026-11-27T14:17:18.018908931Z",
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
  "command_id": "f64f6c10-e47d-4008-8bc4-d6e3994763d0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:18Z",
    "sequence": 1793197038548
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "73fa1fbe-fe25-4190-8604-1d4fdf1f45e9",
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
  "last_heartbeat_at": "2026-10-28T14:17:18.565877Z",
  "last_location_at": "2026-10-28T14:17:18.565877Z",
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
  "command_id": "57e1c221-6caf-4c67-b398-570c2127ef9e",
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
  "effective_at": "2026-10-28T14:17:19.117383Z",
  "changed_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:15:09.343429Z",
  "last_entries": [
    {
      "order_id": "10a00574-ae62-4930-925c-804eece9de09",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:15:09.343429Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9ab45530-0fbb-4477-b2b8-db0d3af7a890",
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
  "id": "e6656008-3303-443c-a894-e337e378518b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:19.663540Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "a0f4d144-cca5-4ac4-913a-fcb0da44d379",
  "quote_id": "e6656008-3303-443c-a894-e337e378518b",
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
    "phone": "+380671110372"
  }
}
```

```json
{
  "id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
  "short_number": 17,
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
  "created_at": "2026-10-28T14:17:19.940227Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671110372"
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
    "id": "8470ba03-6c5f-4aab-a012-d6dc953aea00",
    "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
    "expires_at": "2026-10-28T14:17:34.943798Z",
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

`POST /api/driver/v1/offers/8470ba03-6c5f-4aab-a012-d6dc953aea00/accept` → **200**

```json
{
  "command_id": "9564470c-8391-48fb-bf3b-a51cdec4dc49"
}
```

```json
{
  "id": "d73e013c-89c5-46d8-b723-4bc5853afd8e",
  "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "59a84551-a1db-4cb1-888a-53a5d64ccc52",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "59a84551-a1db-4cb1-888a-53a5d64ccc52",
  "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
  "assignment_id": "d73e013c-89c5-46d8-b723-4bc5853afd8e",
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
    "phone": "+380671110372"
  }
}
```

`POST /api/driver/v1/work-sessions/73fa1fbe-fe25-4190-8604-1d4fdf1f45e9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:21Z",
    "sequence": 1793197041302
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "73fa1fbe-fe25-4190-8604-1d4fdf1f45e9",
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
  "last_heartbeat_at": "2026-10-28T14:17:21.047727Z",
  "last_location_at": "2026-10-28T14:17:21.047727Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/59a84551-a1db-4cb1-888a-53a5d64ccc52/arrive` → **200**

```json
{
  "command_id": "7803e60a-2508-48fc-9b66-690e438d714b",
  "expected_version": 0
}
```

```json
{
  "id": "59a84551-a1db-4cb1-888a-53a5d64ccc52",
  "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
  "assignment_id": "d73e013c-89c5-46d8-b723-4bc5853afd8e",
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
  "arrived_at": "2026-10-28T14:17:21.325547Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110372"
  }
}
```

`POST /api/driver/v1/trips/59a84551-a1db-4cb1-888a-53a5d64ccc52/start` → **200**

```json
{
  "command_id": "f9fb62ef-f9a7-490b-925d-99573ecb2196",
  "expected_version": 1
}
```

```json
{
  "id": "59a84551-a1db-4cb1-888a-53a5d64ccc52",
  "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
  "assignment_id": "d73e013c-89c5-46d8-b723-4bc5853afd8e",
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
  "arrived_at": "2026-10-28T14:17:21.325547Z",
  "started_at": "2026-10-28T14:17:21.602753Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671110372"
  }
}
```

`POST /api/driver/v1/trips/59a84551-a1db-4cb1-888a-53a5d64ccc52/complete` → **200**

```json
{
  "command_id": "b8af5a8d-b9b1-4015-9a85-0c4e5c1fbe8e",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:17:21Z",
  "cash_received": true
}
```

```json
{
  "id": "59a84551-a1db-4cb1-888a-53a5d64ccc52",
  "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
  "assignment_id": "d73e013c-89c5-46d8-b723-4bc5853afd8e",
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
  "arrived_at": "2026-10-28T14:17:21.325547Z",
  "started_at": "2026-10-28T14:17:21.602753Z",
  "completed_at": "2026-10-28T14:17:21.903634Z",
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
  "command_id": "ccabdc0f-43ad-4c73-9955-9b56004251c7",
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
  "id": "01c08052-d999-4ca8-ba65-42f52fe5cc64",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:22.199344Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "de3dfbd4-b935-4ac3-b2ce-88803f03ed9f",
  "quote_id": "01c08052-d999-4ca8-ba65-42f52fe5cc64",
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
    "phone": "+380671112438"
  }
}
```

```json
{
  "id": "abdc6089-311b-4595-9fa6-49ef336c844a",
  "short_number": 18,
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
  "created_at": "2026-10-28T14:17:22.476537Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112438"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/abdc6089-311b-4595-9fa6-49ef336c844a` → **200**

```json
{
  "id": "abdc6089-311b-4595-9fa6-49ef336c844a",
  "short_number": 18,
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
  "created_at": "2026-10-28T14:17:22.476537Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112438"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/abdc6089-311b-4595-9fa6-49ef336c844a/cancel` → **200**

```json
{
  "command_id": "9d16033a-f2bc-4904-8bdf-a5dea727e47f",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "abdc6089-311b-4595-9fa6-49ef336c844a",
  "short_number": 18,
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
  "created_at": "2026-10-28T14:17:22.476537Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671112438"
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
  "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:15:09.343429Z",
  "last_entries": [
    {
      "order_id": "abdc6089-311b-4595-9fa6-49ef336c844a",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:17:23.052552Z"
    },
    {
      "order_id": "9345cfd0-6f07-4dab-930d-fb3f572a2259",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:17:21.908793Z"
    },
    {
      "order_id": "10a00574-ae62-4930-925c-804eece9de09",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-28T14:15:09.343429Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "73fa1fbe-fe25-4190-8604-1d4fdf1f45e9",
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
  "last_heartbeat_at": "2026-10-28T14:17:21.047727Z",
  "last_location_at": "2026-10-28T14:17:21.047727Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/73fa1fbe-fe25-4190-8604-1d4fdf1f45e9/close` → **200**

```json
{
  "command_id": "26594280-eb34-4c32-8551-9bccc727bd4c",
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

Done: operator bonus for fulfilled 9345cfd0-6f07-4dab-930d-fb3f572a2259 and operator-fault cancellation abdc6089-311b-4595-9fa6-49ef336c844a.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679319382",
  "device_ref": "sandbox-11230"
}
```

```json
{
  "challenge_id": "3fe80f11-c080-4a69-a4a3-09cff9f5ee66",
  "expires_at": "2026-10-28T14:22:26.17876374Z",
  "resend_available_at": "2026-10-28T14:17:27.17876374Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679319382` → **200**

```json
{
  "phone": "+380679319382",
  "audience": "CLIENT",
  "code": "503794",
  "sent_at": "2026-10-28T14:17:26.181496541Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675842781",
  "device_ref": "sandbox-29277",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "41a18ebe-3e7a-4a8c-b459-f2779eec6662",
  "expires_at": "2026-10-28T14:22:26.476823636Z",
  "resend_available_at": "2026-10-28T14:17:27.476823636Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675842781` → **200**

```json
{
  "phone": "+380675842781",
  "audience": "CLIENT",
  "code": "342083",
  "sent_at": "2026-10-28T14:17:26.47900868Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672750000",
  "device_ref": "sandbox-16222"
}
```

```json
{
  "challenge_id": "ed20874c-e126-427f-88ba-402213d08dc0",
  "expires_at": "2026-10-28T14:22:26.762568293Z",
  "resend_available_at": "2026-10-28T14:17:27.762568293Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672750000` → **200**

```json
{
  "phone": "+380672750000",
  "audience": "CLIENT",
  "code": "643397",
  "sent_at": "2026-10-28T14:17:26.765402446Z",
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
  "session_id": "0888935d-f8ef-4835-99a1-7a9acbc2312f",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NDcsImlhdCI6MTc5MzE5NzA0NywianRpIjoiNDRlYTAyOTMtYmQ3OS00MGE4LWFhMGEtZTQ1MDRkZDg3NzIxIiwic2lkIjoiMDg4ODkzNWQtZjhlZi00ODM1LTk5YTEtN2E5YWNiYzIzMTJmIn0.oKkiAXndQK2vNzzgrK2F0EHMK30lCVA1guHTbaainCw",
  "access_expires_at": "2026-10-28T14:32:27.361142773Z",
  "refresh_token": "kVMrl26FlDMgfZoZ1D-gRCu6SeMgurll-yw-YlqGppQ",
  "refresh_expires_at": "2026-10-29T02:17:27.36054727Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672750000` → **200**

```json
{
  "deliveries": [
    {
      "id": "e2c746c5-f8b4-4888-bbf1-e1a2f263ce8d",
      "challenge_id": "ed20874c-e126-427f-88ba-402213d08dc0",
      "phone": "+380672750000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b83991e9-1f36-45e4-b8a9-97bbae2f245f",
      "error": null,
      "attempted_at": "2026-10-28T14:17:26.765642Z"
    },
    {
      "id": "bdbfb075-2396-42d1-8ea7-d502697d102d",
      "challenge_id": "ed20874c-e126-427f-88ba-402213d08dc0",
      "phone": "+380672750000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:17:26.764738Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672750000` → **200**

```json
{
  "phone": "+380672750000",
  "audience": "CLIENT",
  "code": "643397",
  "sent_at": "2026-10-28T14:17:26.765402446Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675842781` → **200**

```json
{
  "deliveries": [
    {
      "id": "d581a8a9-3e1e-4103-b351-18d4feff5408",
      "challenge_id": "41a18ebe-3e7a-4a8c-b459-f2779eec6662",
      "phone": "+380675842781",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-24e87313-6fec-46b3-b927-48f7f8d1cf62",
      "error": null,
      "attempted_at": "2026-10-28T14:17:26.479249Z"
    }
  ]
}
```

Done: SMS to +380679319382, a call to +380675842781, SMS then a call to +380672750000.

# Scenario: outgoing-call

## The admin gives the operator an internal number

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
  "session_id": "5035823c-4b39-4608-972b-7363a25841e8",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NDgsImlhdCI6MTc5MzE5NzA0OCwianRpIjoiZjFkYjRmM2QtYzZhMi00MzE1LWI4NjYtY2RkYmI1MjRiMjU5Iiwic2lkIjoiNTAzNTgyM2MtNGIzOS00NjA4LTk3MmItNzM2M2EyNTg0MWU4In0.7lIJkItnIm7rttrvXRgGITCoHv9PRMChAtUTcezalgo",
  "access_expires_at": "2026-10-28T14:32:28.487870598Z",
  "refresh_token": "9z43klo5BrlakzoFFoIWtkqquAyAJ9XTc1jG9IJBLYQ",
  "refresh_expires_at": "2026-10-29T02:17:28.487345419Z",
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
  "session_id": "56b54260-3a20-4d7c-9b30-bec45234bbc6",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NDksImlhdCI6MTc5MzE5NzA0OSwianRpIjoiMWQyNDIxZTgtYWE0Mi00YTMzLWEyZDEtMjhmYzhmNGE0YmRmIiwic2lkIjoiNTZiNTQyNjAtM2EyMC00ZDdjLTliMzAtYmVjNDUyMzRiYmM2In0.tNG9FAQVesfXJPMq_I08DnS_EpaAUimp47v-F1f9yC4",
  "access_expires_at": "2026-10-28T14:32:29.038338219Z",
  "refresh_token": "BMHY3njDglG6NPlTemymulZo_d_n-d-LrCQ9Gn7kcMg",
  "refresh_expires_at": "2026-10-29T02:17:29.03778917Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
    "login": "admin",
    "profile": {
      "first_name": "Super",
      "last_name": "Admin",
      "contacts": {
        "phone": null,
        "email": null,
        "telegram": null
      },
      "role": "SUPER_ADMIN",
      "permissions": [],
      "all_cities": true,
      "city_ids": []
    },
    "state": "ACTIVE",
    "password_change_required": false,
    "version": 0
  },
  "effective_permissions": [
    "orders.create",
    "orders.cancel",
    "orders.reassign",
    "orders.interrupt",
    "orders.view",
    "calls.answer",
    "calls.listen",
    "calls.supervise",
    "driver.review",
    "drivers.risk",
    "geo.manage",
    "pricing.manage",
    "finance.manage",
    "wallets.manage",
    "payments.retry",
    "promotions.manage",
    "support.manage",
    "clients.manage",
    "clients.delete",
    "operator-bonuses.manage",
    "settings.manage",
    "integrations.manage",
    "audit.view",
    "reports.view",
    "legal.manage"
  ]
}
```

`GET /api/admin/v1/staff-extensions` → **200**

```json
{
  "extensions": []
}
```

`POST /api/admin/v1/staff-extensions/a305ed0a-9871-4f1d-b3d1-3690e33395a4` → **200**

```json
{
  "command_id": "c056ecbe-9b80-46c2-8666-f6cdfed80955",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "88087b84-a9bb-46ea-aa2f-09146d2e1869",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:17:30.136095Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:17:30.136095Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8776813e-79ac-4430-97e7-ee30e194712d",
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
  "id": "fe0c9a35-1e73-4f1d-850d-da44e3fdc111",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:30.661266Z",
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

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "d8a9de57-ddc1-4dad-8e31-670b6dd1a075",
  "quote_id": "fe0c9a35-1e73-4f1d-850d-da44e3fdc111",
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
  "caller": {
    "name": "Caller",
    "phone": "+380674109948"
  }
}
```

```json
{
  "id": "183a3c46-ee86-47bc-b395-c0b7077669f7",
  "short_number": 19,
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
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:17:30.939157Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674109948"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/183a3c46-ee86-47bc-b395-c0b7077669f7/calls` → **201**

```json
{
  "command_id": "5f586527-7341-444a-b581-210fd11da04e",
  "to": "CALLER"
}
```

```json
{
  "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "order_ids": [
    "183a3c46-ee86-47bc-b395-c0b7077669f7"
  ],
  "started_at": "2026-10-28T14:17:31.253186Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/183a3c46-ee86-47bc-b395-c0b7077669f7/calls` → **201**

```json
{
  "command_id": "5f586527-7341-444a-b581-210fd11da04e",
  "to": "CALLER"
}
```

```json
{
  "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "order_ids": [
    "183a3c46-ee86-47bc-b395-c0b7077669f7"
  ],
  "started_at": "2026-10-28T14:17:31.253186Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380674109948",
    "at": "2026-10-28T14:17:31.255201562Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.31512",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "8796081d-bf17-45b9-8c3f-b88c5dcbab74"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=183a3c46-ee86-47bc-b395-c0b7077669f7` → **200**

```json
{
  "calls": [
    {
      "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [
        "183a3c46-ee86-47bc-b395-c0b7077669f7"
      ],
      "started_at": "2026-10-28T14:17:31.253186Z",
      "answered_at": "2026-10-28T14:17:31.865375Z",
      "ended_at": "2026-10-28T14:17:31.887507Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=183a3c46-ee86-47bc-b395-c0b7077669f7` → **200**

```json
{
  "calls": [
    {
      "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [
        "183a3c46-ee86-47bc-b395-c0b7077669f7"
      ],
      "started_at": "2026-10-28T14:17:31.253186Z",
      "answered_at": "2026-10-28T14:17:31.865375Z",
      "ended_at": "2026-10-28T14:17:31.887507Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=183a3c46-ee86-47bc-b395-c0b7077669f7` → **200**

```json
{
  "calls": [
    {
      "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [
        "183a3c46-ee86-47bc-b395-c0b7077669f7"
      ],
      "started_at": "2026-10-28T14:17:31.253186Z",
      "answered_at": "2026-10-28T14:17:31.865375Z",
      "ended_at": "2026-10-28T14:17:31.887507Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=183a3c46-ee86-47bc-b395-c0b7077669f7` → **200**

```json
{
  "calls": [
    {
      "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [
        "183a3c46-ee86-47bc-b395-c0b7077669f7"
      ],
      "started_at": "2026-10-28T14:17:31.253186Z",
      "answered_at": "2026-10-28T14:17:31.865375Z",
      "ended_at": "2026-10-28T14:17:31.887507Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=183a3c46-ee86-47bc-b395-c0b7077669f7` → **200**

```json
{
  "calls": [
    {
      "id": "8796081d-bf17-45b9-8c3f-b88c5dcbab74",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "order_ids": [
        "183a3c46-ee86-47bc-b395-c0b7077669f7"
      ],
      "started_at": "2026-10-28T14:17:31.253186Z",
      "answered_at": "2026-10-28T14:17:31.865375Z",
      "ended_at": "2026-10-28T14:17:31.887507Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:17:38.967244Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/183a3c46-ee86-47bc-b395-c0b7077669f7` → **200**

```json
{
  "id": "183a3c46-ee86-47bc-b395-c0b7077669f7",
  "short_number": 19,
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
    "lat": 50.4405,
    "lon": 30.489
  },
  "dropoff_label": "Вокзал",
  "payment_method": "CASH",
  "payment_state": "CASH_EXPECTED",
  "price_minor": 10517,
  "final_price_minor": null,
  "currency": "UAH",
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-28T14:17:30.939157Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674109948"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/183a3c46-ee86-47bc-b395-c0b7077669f7/cancel` → **200**

```json
{
  "command_id": "1f46e9e4-5bbd-4e51-a537-99dccadba585",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "183a3c46-ee86-47bc-b395-c0b7077669f7",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 3,
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
  "created_at": "2026-10-28T14:17:30.939157Z",
  "caller": {
    "name": "Caller",
    "phone": "+380674109948"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "dc123546-b84b-4699-8846-0ef904735019",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:17:41.916593Z",
  "extension": "101"
}
```

Done: outgoing call 8796081d-bf17-45b9-8c3f-b88c5dcbab74 from order 183a3c46-ee86-47bc-b395-c0b7077669f7, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639232720",
  "device_ref": "sandbox-5644"
}
```

```json
{
  "challenge_id": "2798ce93-6ae2-45bc-bd74-3cff429c9a79",
  "expires_at": "2026-10-28T14:22:42.208925739Z",
  "resend_available_at": "2026-10-28T14:17:43.208925739Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639232720` → **200**

```json
{
  "phone": "+380639232720",
  "audience": "CLIENT",
  "code": "089910",
  "sent_at": "2026-10-28T14:17:42.211294136Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2798ce93-6ae2-45bc-bd74-3cff429c9a79",
  "code": "089910",
  "device_ref": "sandbox-5644"
}
```

```json
{
  "session_id": "8e6fa338-6fcc-4e56-9c58-ad6175e2df8d",
  "subject": {
    "type": "CLIENT",
    "id": "f7073477-557e-44df-97f6-11a59b2d78bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzA3MzQ3Ny01NTdlLTQ0ZGYtOTdmNi0xMWE1OWIyZDc4YmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTYyLCJpYXQiOjE3OTMxOTcwNjIsImp0aSI6Ijk1OTlhOGNiLWY4ZmUtNDRhMS1iMjlhLWZlNTQ0ZjZmZTZjMSIsInNpZCI6IjhlNmZhMzM4LTZmY2MtNGU1Ni05YzU4LWFkNjE3NWUyZGY4ZCJ9.KDxwFQcY8BUTiUHzijj_1q6c3EwDuLca80foeJq4ivc",
  "access_expires_at": "2026-10-28T14:32:42.497429487Z",
  "refresh_token": "_Dkhnigs9qCLN9eLVig_KWZsBziRM-Dd1--RUM3Tu_M",
  "refresh_expires_at": "2026-11-27T14:17:42.496532696Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7073477-557e-44df-97f6-11a59b2d78bb",
  "session_id": "8e6fa338-6fcc-4e56-9c58-ad6175e2df8d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639232720",
  "device_ref": "sandbox-6817"
}
```

```json
{
  "challenge_id": "8e76b325-cac7-4b34-a79f-c6697d293212",
  "expires_at": "2026-10-28T14:22:45.006648361Z",
  "resend_available_at": "2026-10-28T14:17:46.006648361Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639232720` → **200**

```json
{
  "phone": "+380639232720",
  "audience": "CLIENT",
  "code": "412623",
  "sent_at": "2026-10-28T14:17:45.008927197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e76b325-cac7-4b34-a79f-c6697d293212",
  "code": "412623",
  "device_ref": "sandbox-6817"
}
```

```json
{
  "session_id": "20a96260-a6bb-42a3-9f01-948b2861656c",
  "subject": {
    "type": "CLIENT",
    "id": "f7073477-557e-44df-97f6-11a59b2d78bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzA3MzQ3Ny01NTdlLTQ0ZGYtOTdmNi0xMWE1OWIyZDc4YmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTY1LCJpYXQiOjE3OTMxOTcwNjUsImp0aSI6IjRhMWQ5MDgwLWNlOWQtNGY1Zi1iZWEzLTM4ZTIyNGUyMjYyMCIsInNpZCI6IjIwYTk2MjYwLWE2YmItNDJhMy05ZjAxLTk0OGIyODYxNjU2YyJ9.MlI7F9GfN6olNejix-9Lxlq3-GSb4vLPkHsfgSyyv0w",
  "access_expires_at": "2026-10-28T14:32:45.292737794Z",
  "refresh_token": "7CMTRAln1Ha9SCed90MlXxaZrpIRMy7cQbQDC6ugLQk",
  "refresh_expires_at": "2026-11-27T14:17:45.292094999Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "21630c44-ee75-447e-b450-8b544f92a75a",
  "expires_at": "2026-10-28T14:22:47.571148162Z",
  "resend_available_at": "2026-10-28T14:17:48.571148162Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639232720` → **200**

```json
{
  "phone": "+380639232720",
  "audience": "CLIENT",
  "code": "625778",
  "sent_at": "2026-10-28T14:17:47.573259509Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634374885"
}
```

```json
{
  "challenge_id": "2f30cf6a-1c53-43db-8d1e-7d9545ca627d",
  "expires_at": "2026-10-28T14:22:47.84793314Z",
  "resend_available_at": "2026-10-28T14:17:48.84793314Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634374885` → **200**

```json
{
  "phone": "+380634374885",
  "audience": "CLIENT",
  "code": "254966",
  "sent_at": "2026-10-28T14:17:47.849715098Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "fa330825-1041-43ba-8388-9e7c2d75ed6b",
  "current_challenge_id": "21630c44-ee75-447e-b450-8b544f92a75a",
  "current_code": "000000",
  "new_challenge_id": "2f30cf6a-1c53-43db-8d1e-7d9545ca627d",
  "new_code": "254966"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "17a0b8ab-fd04-462f-ad6c-0e27a1ffe412"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "d51aa2b1-0652-49c9-b65d-5f2b247b039c",
  "current_challenge_id": "21630c44-ee75-447e-b450-8b544f92a75a",
  "current_code": "625778",
  "new_challenge_id": "2f30cf6a-1c53-43db-8d1e-7d9545ca627d",
  "new_code": "254966"
}
```

```json
{
  "subject_id": "f7073477-557e-44df-97f6-11a59b2d78bb",
  "phone": "+380634374885",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7073477-557e-44df-97f6-11a59b2d78bb",
  "session_id": "8e6fa338-6fcc-4e56-9c58-ad6175e2df8d",
  "account_state": "ACTIVE"
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "5ceb9c80-612d-418b-b489-1e1f1321bba4"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634374885",
  "device_ref": "sandbox-5548"
}
```

```json
{
  "challenge_id": "ca8fb6ed-6577-44ef-9572-53a59b4248c0",
  "expires_at": "2026-10-28T14:22:51.199917959Z",
  "resend_available_at": "2026-10-28T14:17:52.199917959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634374885` → **200**

```json
{
  "phone": "+380634374885",
  "audience": "CLIENT",
  "code": "148321",
  "sent_at": "2026-10-28T14:17:51.201962039Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca8fb6ed-6577-44ef-9572-53a59b4248c0",
  "code": "148321",
  "device_ref": "sandbox-5548"
}
```

```json
{
  "session_id": "c05309bf-a851-4521-81e3-95411caab3ea",
  "subject": {
    "type": "CLIENT",
    "id": "f7073477-557e-44df-97f6-11a59b2d78bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzA3MzQ3Ny01NTdlLTQ0ZGYtOTdmNi0xMWE1OWIyZDc4YmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTcxLCJpYXQiOjE3OTMxOTcwNzEsImp0aSI6IjNhOTdlMTcyLTcyMTgtNDdlMC1iNDg5LTY2MzUwYzI5YTU5YyIsInNpZCI6ImMwNTMwOWJmLWE4NTEtNDUyMS04MWUzLTk1NDExY2FhYjNlYSJ9.UGBlVbGng5EY68eaWuH0r6iIN_4LQlybBmGX_IU5PaE",
  "access_expires_at": "2026-10-28T14:32:51.491020416Z",
  "refresh_token": "pYHJdDs_h5Gx6MTMTismwh53x34H5ZAa7m7ORXFWx-0",
  "refresh_expires_at": "2026-11-27T14:17:51.490443926Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7073477-557e-44df-97f6-11a59b2d78bb",
  "session_id": "c05309bf-a851-4521-81e3-95411caab3ea",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support sets another after checking who it is

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
  "session_id": "a03c5b8e-1716-473a-877d-4150c1ae5425",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NzIsImlhdCI6MTc5MzE5NzA3MiwianRpIjoiNjVjYjJjODUtNzMxYS00MDgwLTkyOTAtMTQxZTAxZmI2MjdjIiwic2lkIjoiYTAzYzViOGUtMTcxNi00NzNhLTg3N2QtNDE1MGMxYWU1NDI1In0.j2KtB8MAJ_33k4mzV8HamfPcGlwFei5DsHTNMrZRLQI",
  "access_expires_at": "2026-10-28T14:32:52.303135775Z",
  "refresh_token": "V49gzlNVgEb0Fh4bEDBasLsfN7l7I4pJcQ4IGDDkXDI",
  "refresh_expires_at": "2026-10-29T02:17:52.302561329Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/f7073477-557e-44df-97f6-11a59b2d78bb` → **200**

```json
{
  "client": {
    "id": "f7073477-557e-44df-97f6-11a59b2d78bb",
    "phone": "+380634374885",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:17:42.494762Z",
    "version": 3,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/clients/f7073477-557e-44df-97f6-11a59b2d78bb/phone` → **400**

```json
{
  "command_id": "addc6524-8c7d-4dcb-a7ba-bed0ea6dbfc5",
  "expected_version": 3,
  "phone": "+380635311685",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/f7073477-557e-44df-97f6-11a59b2d78bb/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "834ee201-9c9b-4473-97e7-77442d334b87",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/f7073477-557e-44df-97f6-11a59b2d78bb/phone` → **200**

```json
{
  "command_id": "ec924a9b-81e7-4d7d-90a0-ae2864239c9f",
  "expected_version": 3,
  "phone": "+380635311685",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "f7073477-557e-44df-97f6-11a59b2d78bb",
  "phone": "+380635311685",
  "version": 4
}
```

`GET /api/rider/v1/me` → **401**

```json
{
  "instance": "/api/rider/v1/me",
  "status": 401,
  "title": "Unauthenticated",
  "type": "https://errors.blizz.taxi/unauthenticated",
  "code": "UNAUTHENTICATED",
  "correlation_id": "adf4b157-eeed-4f0b-a861-4df5b9d9646a"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635311685",
  "device_ref": "sandbox-7049"
}
```

```json
{
  "challenge_id": "027d676e-3271-4b04-90aa-04914c11f854",
  "expires_at": "2026-10-28T14:22:53.695876992Z",
  "resend_available_at": "2026-10-28T14:17:54.695876992Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635311685` → **200**

```json
{
  "phone": "+380635311685",
  "audience": "CLIENT",
  "code": "571045",
  "sent_at": "2026-10-28T14:17:53.698140062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "027d676e-3271-4b04-90aa-04914c11f854",
  "code": "571045",
  "device_ref": "sandbox-7049"
}
```

```json
{
  "session_id": "f3efa79b-6b04-4fc1-993f-3d2ff32f00d1",
  "subject": {
    "type": "CLIENT",
    "id": "f7073477-557e-44df-97f6-11a59b2d78bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNzA3MzQ3Ny01NTdlLTQ0ZGYtOTdmNi0xMWE1OWIyZDc4YmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTczLCJpYXQiOjE3OTMxOTcwNzMsImp0aSI6IjlkOWMyNWVjLTVlYzMtNDkyNS05MDQyLTlhN2QyMTJjNzViMCIsInNpZCI6ImYzZWZhNzliLTZiMDQtNGZjMS05OTNmLTNkMmZmMzJmMDBkMSJ9.s6ar1MNJvopXR_tPet775jtexCseihe1S6RN3cPtMNY",
  "access_expires_at": "2026-10-28T14:32:53.987582842Z",
  "refresh_token": "iA2ZeHOXab13hsCnJgGKJbNTXbaVeVOdrphRjUf5DNI",
  "refresh_expires_at": "2026-11-27T14:17:53.986906815Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "f7073477-557e-44df-97f6-11a59b2d78bb",
  "session_id": "f3efa79b-6b04-4fc1-993f-3d2ff32f00d1",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635353843",
  "device_ref": "sandbox-9648"
}
```

```json
{
  "challenge_id": "77bc0bdd-cda5-4f87-a33c-c5aec449b17b",
  "expires_at": "2026-10-28T14:22:54.520881211Z",
  "resend_available_at": "2026-10-28T14:17:55.520881211Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635353843` → **200**

```json
{
  "phone": "+380635353843",
  "audience": "CLIENT",
  "code": "153153",
  "sent_at": "2026-10-28T14:17:54.523177646Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "77bc0bdd-cda5-4f87-a33c-c5aec449b17b",
  "code": "153153",
  "device_ref": "sandbox-9648"
}
```

```json
{
  "session_id": "5192969f-592d-46e0-adf0-5e93d7d84c27",
  "subject": {
    "type": "CLIENT",
    "id": "a9ed52eb-7439-4450-9b69-1ac29cfe4383"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWVkNTJlYi03NDM5LTQ0NTAtOWI2OS0xYWMyOWNmZTQzODMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTc0LCJpYXQiOjE3OTMxOTcwNzQsImp0aSI6Ijc1NDM3ZGRkLTBhOTMtNGU3Yy1iZTc2LTdjYmE1OTc5Yjg5MyIsInNpZCI6IjUxOTI5NjlmLTU5MmQtNDZlMC1hZGYwLTVlOTNkN2Q4NGMyNyJ9.60E-yQP2v4N4Y9jQENa3O0pwCQVBDXwnj-xXE48ZPhU",
  "access_expires_at": "2026-10-28T14:32:54.818094733Z",
  "refresh_token": "ckF1VZ-XiSa9v03dkdCchVdEfjg5CzdQHo8BWClj0X0",
  "refresh_expires_at": "2026-11-27T14:17:54.817412843Z",
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
  "session_id": "837ba856-f31d-4865-b13b-e594cfa6cd31",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NzUsImlhdCI6MTc5MzE5NzA3NSwianRpIjoiNjhhMzYzYmEtYjkxZC00ZGFkLTk0NGItNDU5ZjVjOTVkZGUwIiwic2lkIjoiODM3YmE4NTYtZjMxZC00ODY1LWIxM2ItZTU5NGNmYTZjZDMxIn0._c3-xCe7S0htBzojJ0Qgc01V1JnMBTp7P5Jywg9o0Cw",
  "access_expires_at": "2026-10-28T14:32:55.950417178Z",
  "refresh_token": "ejjs5gVK-JlH-MdE9i7oBIANDsAAfSIiVUb-xvQjQp0",
  "refresh_expires_at": "2026-10-29T02:17:55.949878208Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635353843` → **200**

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
  "correlation_id": "598d3125-4fa1-4b85-9fec-50a2fc98b9cc"
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
  "session_id": "cd7816fb-d909-4486-a629-60170aa1d59c",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5NzcsImlhdCI6MTc5MzE5NzA3NywianRpIjoiMmU4N2RmZTgtOTE2Mi00M2RlLTk3N2MtNDY0NGZkNmM3MjA1Iiwic2lkIjoiY2Q3ODE2ZmItZDkwOS00NDg2LWE2MjktNjAxNzBhYTFkNTljIn0.mgHHKKmMcqsM3X-6xRvXSKpM5SbY38_ceo__H6Nluzs",
  "access_expires_at": "2026-10-28T14:32:57.045753382Z",
  "refresh_token": "HwkNqSnxqGeQUBCG7IxqkJhXqd3_hjwxDaeJlQLZ1HQ",
  "refresh_expires_at": "2026-10-29T02:17:57.045211976Z",
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
  "command_id": "699c4411-d1c0-4ea1-85bc-6a8780de7699",
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
  "changed_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:17:57.611334641Z"
}
```

## The rider books the airport for 2026-10-28T17:17:56Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600586321",
  "device_ref": "sandbox-28683"
}
```

```json
{
  "challenge_id": "53068243-a944-4441-b3ea-74a6dcdf029a",
  "expires_at": "2026-10-28T14:22:57.890121753Z",
  "resend_available_at": "2026-10-28T14:17:58.890121753Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600586321` → **200**

```json
{
  "phone": "+48600586321",
  "audience": "CLIENT",
  "code": "773272",
  "sent_at": "2026-10-28T14:17:57.892174051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53068243-a944-4441-b3ea-74a6dcdf029a",
  "code": "773272",
  "device_ref": "sandbox-28683"
}
```

```json
{
  "session_id": "4362229e-dd15-4e1a-a35a-948509b20aaa",
  "subject": {
    "type": "CLIENT",
    "id": "33d087d5-1a82-4de3-ac2f-279978a01e00"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzM2QwODdkNS0xYTgyLTRkZTMtYWMyZi0yNzk5NzhhMDFlMDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTc4LCJpYXQiOjE3OTMxOTcwNzgsImp0aSI6IjU1ZjBkNjhlLTgxM2QtNDc4Zi04ZjU2LTg1MDE5NzI4MjQ0MCIsInNpZCI6IjQzNjIyMjllLWRkMTUtNGUxYS1hMzVhLTk0ODUwOWIyMGFhYSJ9.tqR6ZZLxnA-1sUkDeTOsR65zikxaAYLLYjWlbOf3bq8",
  "access_expires_at": "2026-10-28T14:32:58.178492988Z",
  "refresh_token": "SX02OR8HrQLNiO_JhiR2O_IvxG96AwJBmp9zpWDq3Lc",
  "refresh_expires_at": "2026-11-27T14:17:58.177811932Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "13fb628f-993b-4780-b891-aa50a430fc95",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:17:56Z"
}
```

```json
{
  "id": "d5df6ca6-b19b-422c-84f4-ee8aba77b7b0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:22:58.452032Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:17:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8d811984-1182-44a4-b3e9-5358297498c7",
  "quote_id": "d5df6ca6-b19b-422c-84f4-ee8aba77b7b0",
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
  "pickup_at": "2026-10-28T17:17:56Z"
}
```

```json
{
  "id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "33d087d5-1a82-4de3-ac2f-279978a01e00",
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
  "created_at": "2026-10-28T14:17:58.738096Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:56Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A driver in Warsaw sees it and reserves it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+48500000001",
  "device_ref": "sandbox-9001"
}
```

```json
{
  "challenge_id": "047f2f5e-3a57-4c58-9872-17c3727a7c4f",
  "expires_at": "2026-10-28T14:22:59.031869918Z",
  "resend_available_at": "2026-10-28T14:18:00.031869918Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "521961",
  "sent_at": "2026-10-28T14:17:59.034464857Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "047f2f5e-3a57-4c58-9872-17c3727a7c4f",
  "code": "521961",
  "device_ref": "sandbox-9001"
}
```

```json
{
  "session_id": "00409970-09f1-40f3-9c47-6ccd7643f9f6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzk3OSwiaWF0IjoxNzkzMTk3MDc5LCJqdGkiOiIyYzJlYjEyNC01OGE4LTRjMTQtODlmMi0wNGVlMTMyZmYyZjQiLCJzaWQiOiIwMDQwOTk3MC0wOWYxLTQwZjMtOWM0Ny02Y2NkNzY0M2Y5ZjYifQ.c84x9oEDFuTVZ-Z3tQ84trwjz0suCPzNkFZ1hSKUKnE",
  "access_expires_at": "2026-10-28T14:32:59.335856094Z",
  "refresh_token": "_0FK3NcFnUjKqIrS9GR8DX1Z386C0WRJj2hvZhb5Y_w",
  "refresh_expires_at": "2026-11-27T14:17:59.335372618Z",
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
  "command_id": "3cf8ac15-76ed-429d-be30-9cffd7c61e80",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:17:59Z",
    "sequence": 1793197079866
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bba7af7c-42c4-4e20-9499-dbc6a4c495c4",
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
  "last_heartbeat_at": "2026-10-28T14:17:59.883879Z",
  "last_location_at": "2026-10-28T14:17:59.883879Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
      "short_number": 20,
      "pickup_at": "2026-10-28T17:17:56Z",
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

`POST /api/driver/v1/preorders/f0913438-20b7-4289-a9ee-716f0d255d4a/reserve` → **200**

```json
{
  "command_id": "9c6db17c-c467-4cc7-b93c-65f386b030c4"
}
```

```json
{
  "id": "aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9",
  "state": "RESERVED",
  "order": {
    "order_id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
    "short_number": 20,
    "pickup_at": "2026-10-28T17:17:56Z",
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
  "reserved_at": "2026-10-28T14:18:00.436757Z",
  "confirm_from": "2026-10-28T16:47:56Z",
  "confirm_until": "2026-10-28T16:57:56Z",
  "drop_until": "2026-10-28T16:17:56Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9",
      "state": "RESERVED",
      "order": {
        "order_id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:17:56Z",
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
      "reserved_at": "2026-10-28T14:18:00.436757Z",
      "confirm_from": "2026-10-28T16:47:56Z",
      "confirm_until": "2026-10-28T16:57:56Z",
      "drop_until": "2026-10-28T16:17:56Z"
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
      "id": "aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9",
      "state": "RESERVED",
      "order": {
        "order_id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
        "short_number": 20,
        "pickup_at": "2026-10-28T17:17:56Z",
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
      "reserved_at": "2026-10-28T14:18:00.436757Z",
      "confirm_from": "2026-10-28T16:47:56Z",
      "confirm_until": "2026-10-28T16:57:56Z",
      "drop_until": "2026-10-28T16:17:56Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9/confirm` → **409**

```json
{
  "command_id": "eaf7a573-ceec-4ead-bb5b-7e39c0d49a3a"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f8ce02d2-0484-47f0-a433-72e283b798a6"
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
  "session_id": "4063949a-98f3-4bc6-8d70-d592fc5e0476",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5ODEsImlhdCI6MTc5MzE5NzA4MSwianRpIjoiN2FhNGYwMDUtNDliZi00MWQ4LTkxNTMtMzhkM2JjYWI5YjY0Iiwic2lkIjoiNDA2Mzk0OWEtOThmMy00YmM2LThkNzAtZDU5MmZjNWUwNDc2In0.qx67-8HlLoCeYVIaVQaG16z-8X8sApjZ9GVGPD-mWmY",
  "access_expires_at": "2026-10-28T14:33:01.822498159Z",
  "refresh_token": "IEqps1B3sKpdQHqKzq1h_fy_qOPf6U8bmUzt0RVCxt8",
  "refresh_expires_at": "2026-10-29T02:18:01.821963999Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f0913438-20b7-4289-a9ee-716f0d255d4a` → **200**

```json
{
  "id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "33d087d5-1a82-4de3-ac2f-279978a01e00",
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
  "created_at": "2026-10-28T14:17:58.738096Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:17:56Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:18:00.436757Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f0913438-20b7-4289-a9ee-716f0d255d4a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:17:58.73924Z",
      "actor": {
        "type": "CLIENT",
        "id": "33d087d5-1a82-4de3-ac2f-279978a01e00",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
        "preorder": true,
        "quote_id": "d5df6ca6-b19b-422c-84f4-ee8aba77b7b0",
        "pickup_at": "2026-10-28T17:17:56Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "9ab387e1-825f-4ac1-b125-f6b898dc7e21"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:18:00.437925Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f0913438-20b7-4289-a9ee-716f0d255d4a",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9"
      },
      "correlation_id": "d96944f9-8bf7-435a-aaac-911688a18bdc"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order f0913438-20b7-4289-a9ee-716f0d255d4a, reservation aeeb6459-4ff2-4e3d-9bf9-5d0d2263a3e9.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-18421"
}
```

```json
{
  "challenge_id": "22b1fe6e-a682-46c1-abe2-d69db969de30",
  "expires_at": "2026-10-28T14:23:02.659284452Z",
  "resend_available_at": "2026-10-28T14:18:03.659284452Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "779824",
  "sent_at": "2026-10-28T14:18:02.661380749Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22b1fe6e-a682-46c1-abe2-d69db969de30",
  "code": "779824",
  "device_ref": "sandbox-18421"
}
```

```json
{
  "session_id": "2715ecfa-79be-4252-9c87-d20ea1da0f7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Nzk4MiwiaWF0IjoxNzkzMTk3MDgyLCJqdGkiOiJhY2JjZGNiMS1mNjk5LTQyMjctOTgxMi05NjlkN2RlNDY3ZTAiLCJzaWQiOiIyNzE1ZWNmYS03OWJlLTQyNTItOWM4Ny1kMjBlYTFkYTBmN2EifQ.6ahJq3I7imOdHD1T7cBOo9_X1GIgxXUWHrNmqzIeEI4",
  "access_expires_at": "2026-10-28T14:33:02.948852232Z",
  "refresh_token": "23tZVRcePrzKQS0BK18iUgnTc4bIGariD6f7Nh6F1XA",
  "refresh_expires_at": "2026-11-27T14:18:02.948351945Z",
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
  "command_id": "3e20b786-cc68-4588-8c05-f01b41a11965",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:03Z",
    "sequence": 1793197083477
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
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
  "last_heartbeat_at": "2026-10-28T14:18:03.494872Z",
  "last_location_at": "2026-10-28T14:18:03.494872Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676283571",
  "device_ref": "sandbox-13322"
}
```

```json
{
  "challenge_id": "62ae3df1-f161-421c-b45b-737cc8dc28a8",
  "expires_at": "2026-10-28T14:23:03.759220086Z",
  "resend_available_at": "2026-10-28T14:18:04.759220086Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676283571` → **200**

```json
{
  "phone": "+380676283571",
  "audience": "CLIENT",
  "code": "927219",
  "sent_at": "2026-10-28T14:18:03.761412713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62ae3df1-f161-421c-b45b-737cc8dc28a8",
  "code": "927219",
  "device_ref": "sandbox-13322"
}
```

```json
{
  "session_id": "d9b06d31-c99e-4a7e-8ffb-98d72770636b",
  "subject": {
    "type": "CLIENT",
    "id": "b647176f-39b6-4139-869c-747924d2b9ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNjQ3MTc2Zi0zOWI2LTQxMzktODY5Yy03NDc5MjRkMmI5YWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3OTg0LCJpYXQiOjE3OTMxOTcwODQsImp0aSI6IjhjZWMxZmYwLTNiYjctNGY1MC05YzRjLWJmZWNhZDI1ZmQyYSIsInNpZCI6ImQ5YjA2ZDMxLWM5OWUtNGE3ZS04ZmZiLTk4ZDcyNzcwNjM2YiJ9.Q6e6J_Yej1JNgffqNI94ZRAkTyo6waKjpRnAmnPFrUI",
  "access_expires_at": "2026-10-28T14:33:04.054483914Z",
  "refresh_token": "Y7yB7URlQq9hBt1vX75_pEc0bzdvzEVlAQaCEMNxHKA",
  "refresh_expires_at": "2026-11-27T14:18:04.053932088Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "072356fd-2896-440d-9491-c20da7f9f09d",
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
  "id": "cdb493d4-c875-4e09-9131-8ee1b94e629d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:23:04.330755Z",
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
  "command_id": "2b81c6fc-d95f-41dc-addd-f37d58a858c1",
  "quote_id": "cdb493d4-c875-4e09-9131-8ee1b94e629d",
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
  "id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "short_number": 21,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b647176f-39b6-4139-869c-747924d2b9ae",
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
  "created_at": "2026-10-28T14:18:04.622958Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Driver accepts and completes the ride

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "75379290-7c0d-439f-8321-277e86f6dd77",
    "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
    "expires_at": "2026-10-28T14:18:19.626345Z",
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

`POST /api/driver/v1/offers/75379290-7c0d-439f-8321-277e86f6dd77/accept` → **200**

```json
{
  "command_id": "c80de845-b5be-4e86-94fe-7492cd0b337f"
}
```

```json
{
  "id": "128e6f75-2204-4354-a7e3-a0c6618cba2a",
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cc9b961b-aea7-44cd-8123-ac09add51c5d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc9b961b-aea7-44cd-8123-ac09add51c5d",
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "assignment_id": "128e6f75-2204-4354-a7e3-a0c6618cba2a",
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

`POST /api/driver/v1/work-sessions/d24c7522-d1a3-4f61-8fff-6ba293cb807f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:05Z",
    "sequence": 1793197085724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
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
  "last_heartbeat_at": "2026-10-28T14:18:05.743181Z",
  "last_location_at": "2026-10-28T14:18:05.743181Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cc9b961b-aea7-44cd-8123-ac09add51c5d",
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "assignment_id": "128e6f75-2204-4354-a7e3-a0c6618cba2a",
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

`POST /api/driver/v1/trips/cc9b961b-aea7-44cd-8123-ac09add51c5d/arrive` → **200**

```json
{
  "command_id": "c91bbbd5-05a5-4d59-ac4f-dc51358e4128",
  "expected_version": 0
}
```

```json
{
  "id": "cc9b961b-aea7-44cd-8123-ac09add51c5d",
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "assignment_id": "128e6f75-2204-4354-a7e3-a0c6618cba2a",
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
  "arrived_at": "2026-10-28T14:18:06.278913Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/cc9b961b-aea7-44cd-8123-ac09add51c5d/start` → **200**

```json
{
  "command_id": "77e108c4-e85f-4548-9f0e-ec30f4493906",
  "expected_version": 1
}
```

```json
{
  "id": "cc9b961b-aea7-44cd-8123-ac09add51c5d",
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "assignment_id": "128e6f75-2204-4354-a7e3-a0c6618cba2a",
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
  "arrived_at": "2026-10-28T14:18:06.278913Z",
  "started_at": "2026-10-28T14:18:06.548924Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d24c7522-d1a3-4f61-8fff-6ba293cb807f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:06Z",
    "sequence": 1793197086817
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
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
  "last_heartbeat_at": "2026-10-28T14:18:06.834561Z",
  "last_location_at": "2026-10-28T14:18:06.834561Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/cc9b961b-aea7-44cd-8123-ac09add51c5d/complete` → **200**

```json
{
  "command_id": "c769be91-902f-43ed-b11f-d7c4d43b5240",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:18:07Z",
  "cash_received": true
}
```

```json
{
  "id": "cc9b961b-aea7-44cd-8123-ac09add51c5d",
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "assignment_id": "128e6f75-2204-4354-a7e3-a0c6618cba2a",
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
  "arrived_at": "2026-10-28T14:18:06.278913Z",
  "started_at": "2026-10-28T14:18:06.548924Z",
  "completed_at": "2026-10-28T14:18:07.109725Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/59e1d52c-06ff-45eb-a3bc-04e27f0f4b65/rating` → **200**

```json
{
  "command_id": "733660ec-0304-4de2-8b4c-46258cf1e8e8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "score": 5,
  "created_at": "2026-10-28T14:18:07.408236274Z"
}
```

`POST /api/driver/v1/orders/59e1d52c-06ff-45eb-a3bc-04e27f0f4b65/rating` → **200**

```json
{
  "command_id": "5e2ef153-fb64-4819-add1-e59c2f506ae0",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
  "score": 4,
  "created_at": "2026-10-28T14:18:07.685964248Z"
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
  "session_id": "93642565-7a51-4295-bd3e-871cc036c84c",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5ODgsImlhdCI6MTc5MzE5NzA4OCwianRpIjoiMzNmOTVmZDYtMzM3ZC00NjdlLTljOWEtMjgzYTM1NTI0MzcwIiwic2lkIjoiOTM2NDI1NjUtN2E1MS00Mjk1LWJkM2UtODcxY2MwMzZjODRjIn0.LbeUwKMi_LeeH3JVIjwQ1KBV6ERRcjWCW6hiIsEfoHc",
  "access_expires_at": "2026-10-28T14:33:08.506771122Z",
  "refresh_token": "ERmKUEA33zIExUgQ4I3wDovVg8nKhCAdGnn5I9hsaZg",
  "refresh_expires_at": "2026-10-29T02:18:08.506215228Z",
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
  "session_id": "0114fd81-9130-443d-be0e-e0830b66e45e",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5ODksImlhdCI6MTc5MzE5NzA4OSwianRpIjoiNDM4ODhkYmEtMzQyMS00YjE2LWJkYTItZDE4MWY3YmZmMzI1Iiwic2lkIjoiMDExNGZkODEtOTEzMC00NDNkLWJlMGUtZTA4MzBiNjZlNDVlIn0.vbdsOO1jLpdtavL2EBa1IR8CrZDzJ_9znQGsNAIZHhc",
  "access_expires_at": "2026-10-28T14:33:09.067491417Z",
  "refresh_token": "IsFomD_KQiNK7c7OlUH8PEfKAs_zubMHkIlxxc3fIKs",
  "refresh_expires_at": "2026-10-29T02:18:09.066912839Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/59e1d52c-06ff-45eb-a3bc-04e27f0f4b65/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
      "author_type": "RIDER",
      "author_id": "b647176f-39b6-4139-869c-747924d2b9ae",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:18:07.408236Z"
    },
    {
      "order_id": "59e1d52c-06ff-45eb-a3bc-04e27f0f4b65",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "b647176f-39b6-4139-869c-747924d2b9ae",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:18:07.685964Z"
    }
  ]
}
```

Done: ratings for order 59e1d52c-06ff-45eb-a3bc-04e27f0f4b65.

# Scenario: report-export

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
  "session_id": "d23e6b17-02b6-479a-807d-4f9a165362ae",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTc5ODksImlhdCI6MTc5MzE5NzA4OSwianRpIjoiYjJhZmY2NDQtODY4My00M2IwLTkxMDUtYjMwZGYwZmJjOWYwIiwic2lkIjoiZDIzZTZiMTctMDJiNi00NzlhLTgwN2QtNGY5YTE2NTM2MmFlIn0.Jci8m2buXah0Fkzd0wVW__hGi5GgyFGPp2sR4-U88GM",
  "access_expires_at": "2026-10-28T14:33:09.935301742Z",
  "refresh_token": "6OWr0A9f5DIGF14rZGJVvbV9bgufScWR-aHwP3K7zMY",
  "refresh_expires_at": "2026-10-29T02:18:09.934732255Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "a4f397e2-7479-434f-b39f-32d4ed881b66",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "8995e372-93e9-4b06-a30f-83d62b7bf33b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:10.219034Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8995e372-93e9-4b06-a30f-83d62b7bf33b` → **200**

```json
{
  "id": "8995e372-93e9-4b06-a30f-83d62b7bf33b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:10.219034Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8995e372-93e9-4b06-a30f-83d62b7bf33b` → **200**

```json
{
  "id": "8995e372-93e9-4b06-a30f-83d62b7bf33b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:10.219034Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8995e372-93e9-4b06-a30f-83d62b7bf33b` → **200**

```json
{
  "id": "8995e372-93e9-4b06-a30f-83d62b7bf33b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:10.219034Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/8995e372-93e9-4b06-a30f-83d62b7bf33b` → **200**

```json
{
  "id": "8995e372-93e9-4b06-a30f-83d62b7bf33b",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:18:10.219034Z",
  "ready_at": "2026-10-28T14:18:13.989156Z",
  "expires_at": "2026-10-29T14:18:13.989156Z"
}
```

`GET /api/admin/v1/reports/exports/8995e372-93e9-4b06-a30f-83d62b7bf33b/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
total,20,8,12,0,0,15,5,0,18,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b2c84d92-4c6a-48fa-a701-b03dbc615b34",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b0d2e594-840e-4b7b-bb2d-729ef8cc1029",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:14.590635Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0d2e594-840e-4b7b-bb2d-729ef8cc1029` → **200**

```json
{
  "id": "b0d2e594-840e-4b7b-bb2d-729ef8cc1029",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:14.590635Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0d2e594-840e-4b7b-bb2d-729ef8cc1029` → **200**

```json
{
  "id": "b0d2e594-840e-4b7b-bb2d-729ef8cc1029",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:14.590635Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0d2e594-840e-4b7b-bb2d-729ef8cc1029` → **200**

```json
{
  "id": "b0d2e594-840e-4b7b-bb2d-729ef8cc1029",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:14.590635Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0d2e594-840e-4b7b-bb2d-729ef8cc1029` → **200**

```json
{
  "id": "b0d2e594-840e-4b7b-bb2d-729ef8cc1029",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:18:14.590635Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b0d2e594-840e-4b7b-bb2d-729ef8cc1029` → **200**

```json
{
  "id": "b0d2e594-840e-4b7b-bb2d-729ef8cc1029",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:18:14.590635Z",
  "ready_at": "2026-10-28T14:18:18.996385Z",
  "expires_at": "2026-10-29T14:18:18.996385Z"
}
```

`GET /api/admin/v1/reports/exports/b0d2e594-840e-4b7b-bb2d-729ef8cc1029/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
total,UAH,8,1177.03,130.74,176.58,1000.45,10.52,0.00,162.97,182.97,689.83,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/4242f038-1125-453e-ae4e-57f40705f5e3` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/4242f038-1125-453e-ae4e-57f40705f5e3",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f4da5c33-b4d2-402f-bc68-820c1fff390a"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25177"
}
```

```json
{
  "challenge_id": "694de230-880a-4fe6-982a-0b7d16b62e69",
  "expires_at": "2026-10-28T14:23:20.503615387Z",
  "resend_available_at": "2026-10-28T14:18:21.503615387Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "426535",
  "sent_at": "2026-10-28T14:18:20.505925836Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "694de230-880a-4fe6-982a-0b7d16b62e69",
  "code": "426535",
  "device_ref": "sandbox-25177"
}
```

```json
{
  "session_id": "c2a950cf-b4b1-4bf0-b552-cd6463aa9a4b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAwMCwiaWF0IjoxNzkzMTk3MTAwLCJqdGkiOiIxZGQxYjE2NC01NDBhLTRmYjQtYTlmMi02MDg0ZDI1YTA5MzMiLCJzaWQiOiJjMmE5NTBjZi1iNGIxLTRiZjAtYjU1Mi1jZDY0NjNhYTlhNGIifQ._JL4cED7KeliCMLzXF8DqmjxIO3SMA8kQoFMITTN66M",
  "access_expires_at": "2026-10-28T14:33:20.797038946Z",
  "refresh_token": "-v9zdS7hyMAGO4RSa6sW_7_1PyEwBUl54YV3pI0TwZI",
  "refresh_expires_at": "2026-11-27T14:18:20.796506749Z",
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
  "command_id": "3bee6f15-cd89-474a-ae5b-6d275cde3ee3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:21Z",
    "sequence": 1793197101586
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "67a8123c-80f1-4b78-9c98-e5e335057364",
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
  "last_heartbeat_at": "2026-10-28T14:18:21.60375Z",
  "last_location_at": "2026-10-28T14:18:21.60375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "3c8e1ba6-212f-4c99-a42d-a473e0e29c9c",
  "points": [
    {
      "sequence": 1793197103868,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:17:23Z"
    },
    {
      "sequence": 1793197103875,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:18:23Z"
    }
  ]
}
```

```json
{
  "accepted": 2,
  "duplicates": 0,
  "flagged": 1
}
```

## Support finds one open flag — the driver is still approved

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
  "session_id": "9526a44f-6de2-4bf7-a2d8-4ca7f7d241a0",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDQsImlhdCI6MTc5MzE5NzEwNCwianRpIjoiMDI2YTU0ZWUtMDZiYS00NTAyLWE2ZTEtMzQ0NzljYTJiN2I0Iiwic2lkIjoiOTUyNmE0NGYtNmRlMi00YmY3LWEyZDgtNGNhN2Y3ZDI0MWEwIn0.uAxWfAdY5UYUruA0iRsrxsBwcv9Xs9FFoAmW1ekh4VI",
  "access_expires_at": "2026-10-28T14:33:24.475459993Z",
  "refresh_token": "ISoAB8-BG8Ak1ZfXHsyeMRkXO0arWbsMpMCY8LV86W4",
  "refresh_expires_at": "2026-10-29T02:18:24.474938646Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:18:23Z",
        "track_point_id": "4b425143-81eb-402d-b41d-330312c21a47",
        "work_session_id": "67a8123c-80f1-4b78-9c98-e5e335057364"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:18:23Z",
      "reason": null,
      "reviewed_by": null,
      "reviewed_at": null,
      "review_reason": null,
      "version": 1
    }
  ]
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
    "version": 4,
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

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78/confirm` → **200**

```json
{
  "command_id": "418f1491-d0a5-4eb4-8e1f-47df503a710d",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:18:23Z",
    "track_point_id": "4b425143-81eb-402d-b41d-330312c21a47",
    "work_session_id": "67a8123c-80f1-4b78-9c98-e5e335057364"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:18:23Z",
  "reason": null,
  "reviewed_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "reviewed_at": "2026-10-28T14:18:25.307776Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78/dismiss` → **409**

```json
{
  "command_id": "51699ca8-4553-4e85-a23e-ad8ec2c6f444",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "81bb11bb-8523-4a2b-b834-d461e68991d7"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e1c7d0c2-c928-486f-8a06-5c2a26ffa9cb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "05f34796-01a0-4fc8-9643-451d1c38f906",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "raised_at": "2026-10-28T14:18:25.869938Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/05f34796-01a0-4fc8-9643-451d1c38f906/dismiss` → **200**

```json
{
  "command_id": "b3ec1b16-d70b-4c5f-b8f6-ca21bb6dee7c",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "05f34796-01a0-4fc8-9643-451d1c38f906",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "raised_at": "2026-10-28T14:18:25.869938Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "reviewed_at": "2026-10-28T14:18:26.151436Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "dc18d3da-8f3a-40d1-83c7-057b3f480d8b",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
  "version": 5,
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
    "review_status": "SUSPENDED",
    "version": 5,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:18:26.44274Z"
    }
  ]
}
```

Done: flag f3514c8b-f6c9-45a9-b9af-dcf9d2be9f78 confirmed, suspension named it, driver reinstated.

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
  "session_id": "720b4234-8f35-46b0-9fe0-08def20ae755",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDcsImlhdCI6MTc5MzE5NzEwNywianRpIjoiYzk2NDFmNjEtOGVlNy00ZmU4LTliMDYtYzg3YjM3OGM3YTBkIiwic2lkIjoiNzIwYjQyMzQtOGYzNS00NmIwLTlmZTAtMDhkZWYyMGFlNzU1In0.WYRZhCshL9R9UDg3Z3lmpMs86MZLSG7o3pGoICNQm9U",
  "access_expires_at": "2026-10-28T14:33:27.269393711Z",
  "refresh_token": "KtZV0hNsLdOXil2VUF-MCQ1uawYkt4nlI2QBcx0OZho",
  "refresh_expires_at": "2026-10-29T02:18:27.268802906Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
    "version": 5,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:18:26.44274Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "6eb2cc9d-ae6b-4150-8534-733329c333bf",
  "expected_version": 5,
  "reason": "Sandbox clean-up"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "APPROVED",
  "version": 6,
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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "67a8123c-80f1-4b78-9c98-e5e335057364",
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
  "last_heartbeat_at": "2026-10-28T14:18:21.60375Z",
  "last_location_at": "2026-10-28T14:18:21.60375Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/67a8123c-80f1-4b78-9c98-e5e335057364/close` → **200**

```json
{
  "command_id": "f89c7b97-6438-42a1-abd5-5c4cd50c6b4c",
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
  "session_id": "6f30f844-c9b3-4ecc-be96-7897dbc653c7",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMDgsImlhdCI6MTc5MzE5NzEwOCwianRpIjoiYjcxOWQwMjgtYTQyZS00NzU3LWExNTEtMzQ3NDI2OTcwNjFjIiwic2lkIjoiNmYzMGY4NDQtYzliMy00ZWNjLWJlOTYtNzg5N2RiYzY1M2M3In0.285twFFh_YV8nQY8dfc_PNEbKiYhcrgv9Bu6i0gbM-Q",
  "access_expires_at": "2026-10-28T14:33:28.970316044Z",
  "refresh_token": "zt73SKTqbrbT8RPcCfsKFX1d6MVC-2WIK1r1xCHao3c",
  "refresh_expires_at": "2026-10-29T02:18:28.969748106Z",
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
  "command_id": "ab3c4011-f9ad-49e9-a906-f12780512207",
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
  "changed_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:18:29.525958Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "ab3c4011-f9ad-49e9-a906-f12780512207",
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
  "changed_by": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:18:29.525958Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48984433408",
  "device_ref": "sandbox-14876"
}
```

```json
{
  "challenge_id": "98d1af4e-9400-4374-b48a-76fcbbe75286",
  "expires_at": "2026-10-28T14:23:30.079494316Z",
  "resend_available_at": "2026-10-28T14:18:31.079494316Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48984433408` → **200**

```json
{
  "phone": "+48984433408",
  "audience": "CLIENT",
  "code": "201251",
  "sent_at": "2026-10-28T14:18:30.081723727Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "98d1af4e-9400-4374-b48a-76fcbbe75286",
  "code": "201251",
  "device_ref": "sandbox-14876"
}
```

```json
{
  "session_id": "3865574b-70fb-4f2b-9e61-ea21d3237d71",
  "subject": {
    "type": "CLIENT",
    "id": "5c38824c-7c15-4608-9b79-123ad15726a2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzM4ODI0Yy03YzE1LTQ2MDgtOWI3OS0xMjNhZDE1NzI2YTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDEwLCJpYXQiOjE3OTMxOTcxMTAsImp0aSI6Ijg2N2NjZDQ3LWU1M2EtNDQwYi04NzBmLWJhZmI5MWFkNzA2ZCIsInNpZCI6IjM4NjU1NzRiLTcwZmItNGYyYi05ZTYxLWVhMjFkMzIzN2Q3MSJ9.JSBeh3zMbpogqVToZg-1ZYPz9ia-wtADX7TD0u3_LPo",
  "access_expires_at": "2026-10-28T14:33:30.376434409Z",
  "refresh_token": "Z1tC5MK0K-TEtiIvhv7Ltro7qqOLi9KCGullafMa0gs",
  "refresh_expires_at": "2026-11-27T14:18:30.375916499Z",
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
  "correlation_id": "cf3eb3d1-8b3e-4f1e-9279-5077977bfbf8"
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
  "device_ref": "sandbox-25925"
}
```

```json
{
  "challenge_id": "582b10fe-bbfe-4f96-8fb2-5ed0d049435d",
  "expires_at": "2026-10-28T14:23:31.182770307Z",
  "resend_available_at": "2026-10-28T14:18:32.182770307Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "475895",
  "sent_at": "2026-10-28T14:18:31.184934159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "582b10fe-bbfe-4f96-8fb2-5ed0d049435d",
  "code": "475895",
  "device_ref": "sandbox-25925"
}
```

```json
{
  "session_id": "328b4066-02ce-4692-a5a7-bdeab695ad50",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAxMSwiaWF0IjoxNzkzMTk3MTExLCJqdGkiOiI0ZWUxZGE5MC04NDE4LTRmNmYtYTcwYy03MDA1MDMwZDdjMmUiLCJzaWQiOiIzMjhiNDA2Ni0wMmNlLTQ2OTItYTVhNy1iZGVhYjY5NWFkNTAifQ.MLqOXlb6aNwhIq56Wv7pa0qlydm4PRYJVNha0gUZVFY",
  "access_expires_at": "2026-10-28T14:33:31.474772463Z",
  "refresh_token": "xtgN7DB-YOULheGNSV6fdGMCBCqBmpreh2l17vVCRiM",
  "refresh_expires_at": "2026-11-27T14:18:31.474260073Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bba7af7c-42c4-4e20-9499-dbc6a4c495c4",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T14:17:59.883879Z",
  "last_location_at": "2026-10-28T14:17:59.883879Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bba7af7c-42c4-4e20-9499-dbc6a4c495c4/handover` → **200**

```json
{
  "command_id": "8028b18f-b344-4861-b046-50d3e2b19c38",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bba7af7c-42c4-4e20-9499-dbc6a4c495c4",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T14:17:59.883879Z",
  "last_location_at": "2026-10-28T14:17:59.883879Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bba7af7c-42c4-4e20-9499-dbc6a4c495c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:32Z",
    "sequence": 1793197112276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bba7af7c-42c4-4e20-9499-dbc6a4c495c4",
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
  "last_heartbeat_at": "2026-10-28T14:18:32.29556Z",
  "last_location_at": "2026-10-28T14:18:32.29556Z",
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
  "session_id": "bba7af7c-42c4-4e20-9499-dbc6a4c495c4",
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
  "last_heartbeat_at": "2026-10-28T14:18:32.29556Z",
  "last_location_at": "2026-10-28T14:18:32.29556Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bba7af7c-42c4-4e20-9499-dbc6a4c495c4/close` → **200**

```json
{
  "command_id": "d541ec80-4bce-4973-9eed-00c59f53c6a9",
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
  "correlation_id": "6e06fb1d-da57-42e5-bf25-45e7aa424429"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678806219",
  "device_ref": "sandbox-25730"
}
```

```json
{
  "challenge_id": "4bed1272-b5af-4840-b16b-03da718f72aa",
  "expires_at": "2026-10-28T14:23:33.679386089Z",
  "resend_available_at": "2026-10-28T14:18:34.679386089Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678806219` → **200**

```json
{
  "phone": "+380678806219",
  "audience": "CLIENT",
  "code": "534100",
  "sent_at": "2026-10-28T14:18:33.681571092Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bed1272-b5af-4840-b16b-03da718f72aa",
  "code": "534100",
  "device_ref": "sandbox-25730"
}
```

```json
{
  "session_id": "663b0042-233f-4e19-b9af-3549ce102450",
  "subject": {
    "type": "CLIENT",
    "id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YzZlODk4Zi0xM2Q3LTQyMzUtYWFkMS1iMzYzY2YzZjgwY2MiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDEzLCJpYXQiOjE3OTMxOTcxMTMsImp0aSI6IjEwMDA4YjgwLWZkNzktNDI1ZS1iMDdmLWMyNDkyNGY3OWUzZSIsInNpZCI6IjY2M2IwMDQyLTIzM2YtNGUxOS1iOWFmLTM1NDljZTEwMjQ1MCJ9.E3VoNnlGCfyKccaIROjfqhsW6R2eqVpLtrClPmFa2hw",
  "access_expires_at": "2026-10-28T14:33:33.975784516Z",
  "refresh_token": "vxZHVbwDpT9PunIT7PvcQaU4dMbBaLkBSeE833-1RUg",
  "refresh_expires_at": "2026-11-27T14:18:33.97530089Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "96db0995-defd-4c8d-a147-140736820edc",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "812120c3-8374-4d6c-8b5f-18578399d6e3",
  "upload_path": "/api/rider/v1/uploads/812120c3-8374-4d6c-8b5f-18578399d6e3",
  "expires_at": "2026-10-28T14:33:34.247545158Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/812120c3-8374-4d6c-8b5f-18578399d6e3` → **200**

```json
{
  "file_id": "812120c3-8374-4d6c-8b5f-18578399d6e3",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "21d80b12-7f1a-462b-b755-377ea9bec0fe",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "812120c3-8374-4d6c-8b5f-18578399d6e3"
  ]
}
```

```json
{
  "id": "db33a060-a4b8-46a9-a26e-d3bf6a74d96a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:18:34.556341Z",
  "updated_at": "2026-10-28T14:18:34.556341Z",
  "respond_by": "2026-10-28T18:18:34.556341Z",
  "messages": [
    {
      "id": "a7d69f10-02a1-4282-84ae-c608a5ffd282",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:34.55784Z",
      "attachments": [
        {
          "file_id": "812120c3-8374-4d6c-8b5f-18578399d6e3",
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
  "session_id": "a467844f-592f-453e-bf1f-2065c57d753d",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMTUsImlhdCI6MTc5MzE5NzExNSwianRpIjoiYWI2MWI1NjgtZjZmNC00ZTM5LTg2NjktZmFkMGYzZmNhMjQ0Iiwic2lkIjoiYTQ2Nzg0NGYtNTkyZi00NTNlLWJmMWYtMjA2NWM1N2Q3NTNkIn0.Cx89P8v04ErXWicoBxI_uy-VpLwSvQmw3Y2Mx2ysqWY",
  "access_expires_at": "2026-10-28T14:33:35.143555252Z",
  "refresh_token": "-nXz5olL4KW3IlYbNnZ9NHQIX0V_Y0sySWrqKJPw3YQ",
  "refresh_expires_at": "2026-10-29T02:18:35.142848528Z",
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
  "session_id": "40cdf371-cc5e-433a-b84b-dbededd187d0",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMTUsImlhdCI6MTc5MzE5NzExNSwianRpIjoiNmY2YWU4YzMtZDRkMi00NDljLTg4ZjgtMDNjM2Q0MGQ2ZGM1Iiwic2lkIjoiNDBjZGYzNzEtY2M1ZS00MzNhLWI4NGItZGJlZGVkZDE4N2QwIn0.jyIIPJT-TRO0mbK-xvi5qDFe8nwdN8kGj0wUS2zQUz4",
  "access_expires_at": "2026-10-28T14:33:35.695254164Z",
  "refresh_token": "tqIrQoBNV-8Y8EkFtwswMaSwbqZxikuKp2M2uqsPWEE",
  "refresh_expires_at": "2026-10-29T02:18:35.694705386Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/db33a060-a4b8-46a9-a26e-d3bf6a74d96a/attachments/812120c3-8374-4d6c-8b5f-18578399d6e3` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "1a53edf8-4b27-44ef-b0ee-da9bdc98ab7f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "23484977-d848-405e-af36-ac2110e63fdc",
  "upload_path": "/api/operator/v1/uploads/23484977-d848-405e-af36-ac2110e63fdc",
  "expires_at": "2026-10-28T14:33:35.981251668Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/23484977-d848-405e-af36-ac2110e63fdc` → **200**

```json
{
  "file_id": "23484977-d848-405e-af36-ac2110e63fdc",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/db33a060-a4b8-46a9-a26e-d3bf6a74d96a` → **200**

```json
{
  "id": "db33a060-a4b8-46a9-a26e-d3bf6a74d96a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:18:34.556341Z",
  "updated_at": "2026-10-28T14:18:34.556341Z",
  "respond_by": "2026-10-28T18:18:34.556341Z",
  "messages": [
    {
      "id": "a7d69f10-02a1-4282-84ae-c608a5ffd282",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:34.55784Z",
      "attachments": [
        {
          "file_id": "812120c3-8374-4d6c-8b5f-18578399d6e3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/db33a060-a4b8-46a9-a26e-d3bf6a74d96a/comments` → **200**

```json
{
  "command_id": "f3516f23-a9bd-4f19-b97b-df5104969a8d",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "23484977-d848-405e-af36-ac2110e63fdc"
  ]
}
```

```json
{
  "id": "db33a060-a4b8-46a9-a26e-d3bf6a74d96a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:18:34.556341Z",
  "updated_at": "2026-10-28T14:18:36.55399Z",
  "respond_by": "2026-10-28T18:18:34.556341Z",
  "messages": [
    {
      "id": "a7d69f10-02a1-4282-84ae-c608a5ffd282",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:34.55784Z",
      "attachments": [
        {
          "file_id": "812120c3-8374-4d6c-8b5f-18578399d6e3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e76624ef-0eeb-41b4-99a0-037230461afe",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:18:36.553467Z",
      "attachments": [
        {
          "file_id": "23484977-d848-405e-af36-ac2110e63fdc",
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

`GET /api/rider/v1/support/cases/db33a060-a4b8-46a9-a26e-d3bf6a74d96a` → **200**

```json
{
  "id": "db33a060-a4b8-46a9-a26e-d3bf6a74d96a",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:18:34.556341Z",
  "updated_at": "2026-10-28T14:18:36.55399Z",
  "respond_by": "2026-10-28T18:18:34.556341Z",
  "messages": [
    {
      "id": "a7d69f10-02a1-4282-84ae-c608a5ffd282",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5c6e898f-13d7-4235-aad1-b363cf3f80cc",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:18:34.55784Z",
      "attachments": [
        {
          "file_id": "812120c3-8374-4d6c-8b5f-18578399d6e3",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "e76624ef-0eeb-41b4-99a0-037230461afe",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:18:36.553467Z",
      "attachments": [
        {
          "file_id": "23484977-d848-405e-af36-ac2110e63fdc",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/db33a060-a4b8-46a9-a26e-d3bf6a74d96a/attachments/23484977-d848-405e-af36-ac2110e63fdc` → **200**

Done: support case db33a060-a4b8-46a9-a26e-d3bf6a74d96a, rider attachment 812120c3-8374-4d6c-8b5f-18578399d6e3, operator attachment 23484977-d848-405e-af36-ac2110e63fdc.

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
  "session_id": "d6e497ee-c2f5-4e99-9be3-86b2271f35f8",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMTcsImlhdCI6MTc5MzE5NzExNywianRpIjoiYmU0N2UwM2UtNzY4Yy00ZThkLTg0MjQtNDdlMmZkN2ZjYjdjIiwic2lkIjoiZDZlNDk3ZWUtYzJmNS00ZTk5LTliZTMtODZiMjI3MWYzNWY4In0.66dF9NhADFu6o5_rn__EMx1rGFeE3yLL1x1aCJtr3ZA",
  "access_expires_at": "2026-10-28T14:33:37.445175305Z",
  "refresh_token": "3N5Y4w_riB3_ssZm5pFSemRa6MGEOUsBOySZSBDFS-0",
  "refresh_expires_at": "2026-10-29T02:18:37.444637507Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-6774"
}
```

```json
{
  "challenge_id": "1d38cb3a-b73d-4d04-b50a-81ffd8026d13",
  "expires_at": "2026-10-28T14:23:37.724206578Z",
  "resend_available_at": "2026-10-28T14:18:38.724206578Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "688828",
  "sent_at": "2026-10-28T14:18:37.727073549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d38cb3a-b73d-4d04-b50a-81ffd8026d13",
  "code": "688828",
  "device_ref": "sandbox-6774"
}
```

```json
{
  "session_id": "ea978830-f64b-428a-8961-89666b758d7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAxOCwiaWF0IjoxNzkzMTk3MTE4LCJqdGkiOiJmZDJkNzliOS1kZmQxLTRkZmQtOWViOS0xNzI3YTc2ZDlkZGIiLCJzaWQiOiJlYTk3ODgzMC1mNjRiLTQyOGEtODk2MS04OTY2NmI3NThkN2EifQ.SekwtuqYmULSlk4qdxu9Olq07X5FzzQsEN1GO8umqtY",
  "access_expires_at": "2026-10-28T14:33:38.038775288Z",
  "refresh_token": "SP_NjptGb4cHZZ_RtDzbrkjxmFdN1bazjCJmttiyG3w",
  "refresh_expires_at": "2026-11-27T14:18:38.038251386Z",
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
  "version": 7,
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
    "version": 7,
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
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:18:26.44274Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:18:27.843112Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "553aecd8-f6bf-4851-8031-b28fab56e627",
  "expected_version": 7,
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
  "version": 8,
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
  "device_ref": "sandbox-24437"
}
```

```json
{
  "challenge_id": "8aa0d7cd-319e-4d96-b171-fd17753780dc",
  "expires_at": "2026-10-28T14:23:39.149247003Z",
  "resend_available_at": "2026-10-28T14:18:40.149247003Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "256037",
  "sent_at": "2026-10-28T14:18:39.151303793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8aa0d7cd-319e-4d96-b171-fd17753780dc",
  "code": "256037",
  "device_ref": "sandbox-24437"
}
```

```json
{
  "session_id": "d95c7bc0-571c-4428-a80e-786132940a87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAxOSwiaWF0IjoxNzkzMTk3MTE5LCJqdGkiOiIxNzg3ODdjZC00N2IwLTRjNzItODJkYy0zMTc4ZTU0MDA0MzYiLCJzaWQiOiJkOTVjN2JjMC01NzFjLTQ0MjgtYTgwZS03ODYxMzI5NDBhODcifQ.lk-MF87toQDCteUimuhYnRXRBHZ-q46cd2qlvfSPELk",
  "access_expires_at": "2026-10-28T14:33:39.443567121Z",
  "refresh_token": "Vx0H_FruXJnJMq9TTKP5Xo209icP5fV0kkTke30TSns",
  "refresh_expires_at": "2026-11-27T14:18:39.443045664Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:18:06.834561Z",
  "last_location_at": "2026-10-28T14:18:06.834561Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d24c7522-d1a3-4f61-8fff-6ba293cb807f/handover` → **200**

```json
{
  "command_id": "2b37856b-623d-449c-bb22-a69cfcd18f00",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "DISCONNECTED",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:18:06.834561Z",
  "last_location_at": "2026-10-28T14:18:06.834561Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/d24c7522-d1a3-4f61-8fff-6ba293cb807f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:40Z",
    "sequence": 1793197120295
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
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
  "last_heartbeat_at": "2026-10-28T14:18:40.314085Z",
  "last_location_at": "2026-10-28T14:18:40.314085Z",
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
  "command_id": "3837cc8e-d0f9-4534-9f93-aa86174f2fd9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:40Z",
    "sequence": 1793197120893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4890510-cb7a-4a47-9c50-076b92a36b34",
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
  "last_heartbeat_at": "2026-10-28T14:18:40.910562Z",
  "last_location_at": "2026-10-28T14:18:40.910562Z",
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
  "session_id": "cce3b09e-3b1c-43ad-89ab-2a44ff817102",
  "subject": {
    "type": "STAFF",
    "id": "a305ed0a-9871-4f1d-b3d1-3690e33395a4"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMzA1ZWQwYS05ODcxLTRmMWQtYjNkMS0zNjkwZTMzMzk1YTQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMjEsImlhdCI6MTc5MzE5NzEyMSwianRpIjoiNDNhYmQ5YzYtOTYzZS00ZGQ3LTllM2YtMTY0NzVlNGM1ODU3Iiwic2lkIjoiY2NlM2IwOWUtM2IxYy00M2FkLTg5YWItMmE0NGZmODE3MTAyIn0.ORYBUU_0YUTPnFthH-xa8Unlj_91rkXjIdBAXK8U_HU",
  "access_expires_at": "2026-10-28T14:33:41.475511581Z",
  "refresh_token": "PZ00nGYIlwcJS7q0RG6sn4YotVUIvBTL6rROtTQ8fu0",
  "refresh_expires_at": "2026-10-29T02:18:41.4749615Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1831029e-0c1e-40e1-ba37-da4b88b363ce",
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
  "id": "e683b6eb-238c-4c38-96ab-7eb5295a87b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:23:41.747504Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": null,
  "preorder": false,
  "discount_minor": 0,
  "to_pay_minor": 29967,
  "promotions": []
}
```

`POST /api/operator/v1/orders` → **201**

```json
{
  "command_id": "f476aa72-9c05-4b11-b05c-8655e0b327a9",
  "quote_id": "e683b6eb-238c-4c38-96ab-7eb5295a87b8",
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
  "id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "short_number": 22,
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
  "created_at": "2026-10-28T14:18:42.023721Z",
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
    "id": "1eedca04-313b-4439-bdb2-57e1fbcd41d8",
    "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
    "expires_at": "2026-10-28T14:18:57.027422Z",
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

`POST /api/driver/v1/offers/1eedca04-313b-4439-bdb2-57e1fbcd41d8/accept` → **200**

```json
{
  "command_id": "e26b77c8-fc24-4a25-aca7-01f805d1ede1"
}
```

```json
{
  "id": "d5168a47-cca9-41dd-92c2-ac5575d980cb",
  "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "73fbb657-b0d8-4596-8a64-28a8415746c5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "73fbb657-b0d8-4596-8a64-28a8415746c5",
  "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "assignment_id": "d5168a47-cca9-41dd-92c2-ac5575d980cb",
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

`POST /api/driver/v1/work-sessions/b4890510-cb7a-4a47-9c50-076b92a36b34/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:43Z",
    "sequence": 1793197123378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b4890510-cb7a-4a47-9c50-076b92a36b34",
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
  "last_heartbeat_at": "2026-10-28T14:18:43.395701Z",
  "last_location_at": "2026-10-28T14:18:43.395701Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/73fbb657-b0d8-4596-8a64-28a8415746c5/arrive` → **200**

```json
{
  "command_id": "fb4ca9aa-347a-410f-b354-b12f2485b327",
  "expected_version": 0
}
```

```json
{
  "id": "73fbb657-b0d8-4596-8a64-28a8415746c5",
  "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "assignment_id": "d5168a47-cca9-41dd-92c2-ac5575d980cb",
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
  "arrived_at": "2026-10-28T14:18:43.666307Z",
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

`POST /api/driver/v1/trips/73fbb657-b0d8-4596-8a64-28a8415746c5/start` → **200**

```json
{
  "command_id": "3b581500-529a-472c-a77e-ba6e73b9af9d",
  "expected_version": 1
}
```

```json
{
  "id": "73fbb657-b0d8-4596-8a64-28a8415746c5",
  "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "assignment_id": "d5168a47-cca9-41dd-92c2-ac5575d980cb",
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
  "arrived_at": "2026-10-28T14:18:43.666307Z",
  "started_at": "2026-10-28T14:18:43.949922Z",
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

`POST /api/driver/v1/trips/73fbb657-b0d8-4596-8a64-28a8415746c5/complete` → **200**

```json
{
  "command_id": "9b36beb6-010b-4aa7-a914-04e2d8f73295",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:18:44Z",
  "cash_received": true
}
```

```json
{
  "id": "73fbb657-b0d8-4596-8a64-28a8415746c5",
  "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "assignment_id": "d5168a47-cca9-41dd-92c2-ac5575d980cb",
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
  "arrived_at": "2026-10-28T14:18:43.666307Z",
  "started_at": "2026-10-28T14:18:43.949922Z",
  "completed_at": "2026-10-28T14:18:44.233255Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/f32a5d2f-adff-4c30-a73e-5dec7f08bd13` → **200**

```json
{
  "id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
  "short_number": 22,
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
    "id": "d5168a47-cca9-41dd-92c2-ac5575d980cb",
    "order_id": "f32a5d2f-adff-4c30-a73e-5dec7f08bd13",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "73fbb657-b0d8-4596-8a64-28a8415746c5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:18:42.023721Z",
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
      "balance_minor": 28209,
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
  "session_id": "d24c7522-d1a3-4f61-8fff-6ba293cb807f",
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
  "last_heartbeat_at": "2026-10-28T14:18:40.314085Z",
  "last_location_at": "2026-10-28T14:18:40.314085Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d24c7522-d1a3-4f61-8fff-6ba293cb807f/close` → **200**

```json
{
  "command_id": "1013bead-213b-4925-b7c4-d51c6581ab14",
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
  "session_id": "b4890510-cb7a-4a47-9c50-076b92a36b34",
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
  "last_heartbeat_at": "2026-10-28T14:18:43.395701Z",
  "last_location_at": "2026-10-28T14:18:43.395701Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4890510-cb7a-4a47-9c50-076b92a36b34/close` → **200**

```json
{
  "command_id": "9eb93850-3536-45aa-a13a-9c3f57a36dbd",
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

Done: terminal order f32a5d2f-adff-4c30-a73e-5dec7f08bd13 by Andrii (5a000000-0000-4000-8000-000000000403).
