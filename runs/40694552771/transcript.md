# Sandbox transcript (2026-10-28T13:14:58Z, 88d850c)

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
  "correlation_id": "4bae10c8-cd67-450d-8b77-89f1244e13b0"
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
  "session_id": "b3d75ef0-132e-4481-85e9-fbbadc2ff866",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyMDcsImlhdCI6MTc5MzE5MzMwNywianRpIjoiMGM1YzM4MWYtMTNhMC00MTBiLWJhZDItOGMxMDI2YWQxMDNlIiwic2lkIjoiYjNkNzVlZjAtMTMyZS00NDgxLTg1ZTktZmJiYWRjMmZmODY2In0.ZWjYfzKS-Jizt_vIs4VYN0MAHDmYjHTaTS_DhYXC3AQ",
  "access_expires_at": "2026-10-28T13:30:07.491150721Z",
  "refresh_token": "31V1q6yQZNNZZ9QxbB6MchhmeXJXU56zUfhIW4eZ9Vs",
  "refresh_expires_at": "2026-10-29T01:15:07.488649043Z",
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
  "session_id": "fff02edc-0d08-4946-ac83-6d166c1b778e",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyMDksImlhdCI6MTc5MzE5MzMwOSwianRpIjoiY2E3NzVjODktNTE1ZC00ZTc4LWJkYzktMDBiNmI1NmE4MzEzIiwic2lkIjoiZmZmMDJlZGMtMGQwOC00OTQ2LWFjODMtNmQxNjZjMWI3NzhlIn0.lwFsorR_3_rE60Zyyj4oUzQroxFkbBwvPBsd2pPjbJs",
  "access_expires_at": "2026-10-28T13:30:09.052299385Z",
  "refresh_token": "koAF0FYh-0NUYUqvGfdsy9qdS09bpNGgK3j39G372u8",
  "refresh_expires_at": "2026-10-29T01:15:09.051154433Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "8191761d-e993-4b5d-862f-12ca4a5bb496",
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
  "id": "5ac10293-676c-4a5d-97b8-72e6a73a2b5c",
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
  "created_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "created_at": "2026-10-28T13:15:09.375672Z",
  "updated_at": "2026-10-28T13:15:09.375672Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630451827",
  "device_ref": "sandbox-7286"
}
```

```json
{
  "challenge_id": "8c0f4d6c-5e61-4f65-b9ff-e5466b9e652d",
  "expires_at": "2026-10-28T13:20:09.682871048Z",
  "resend_available_at": "2026-10-28T13:15:10.682871048Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630451827` → **200**

```json
{
  "phone": "+380630451827",
  "audience": "CLIENT",
  "code": "054018",
  "sent_at": "2026-10-28T13:15:09.692137117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8c0f4d6c-5e61-4f65-b9ff-e5466b9e652d",
  "code": "054018",
  "device_ref": "sandbox-7286"
}
```

```json
{
  "session_id": "b8f1aeaf-cef6-4e50-bd79-182291e44558",
  "subject": {
    "type": "CLIENT",
    "id": "7815265f-b50d-460e-9367-c27000cf4c17"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ODE1MjY1Zi1iNTBkLTQ2MGUtOTM2Ny1jMjcwMDBjZjRjMTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjEwLCJpYXQiOjE3OTMxOTMzMTAsImp0aSI6IjJlOGRmZDZjLTI2OTItNGJhNS05NjhhLTMxODY1NDU5MTM4MSIsInNpZCI6ImI4ZjFhZWFmLWNlZjYtNGU1MC1iZDc5LTE4MjI5MWU0NDU1OCJ9.UKXpUYLlaREzWn2eWdauLP_9EqozpWJiG9RZdXeLx_M",
  "access_expires_at": "2026-10-28T13:30:10.035551963Z",
  "refresh_token": "VszmpaTqL8DwQVdqEg7R8Ebb5lb6mKJ0HJS85n2sLeg",
  "refresh_expires_at": "2026-11-27T13:15:10.034023992Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630451827` → **200**

```json
{
  "client_id": "7815265f-b50d-460e-9367-c27000cf4c17"
}
```

`POST /api/admin/v1/rider-wallets/7815265f-b50d-460e-9367-c27000cf4c17/top-ups` → **201**

```json
{
  "command_id": "72c4f0ce-0662-425c-ba44-887afa90b42d",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "7815265f-b50d-460e-9367-c27000cf4c17",
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
      "id": "99a13393-ba26-4c76-a684-f2bfe025c1d7",
      "at": "2026-10-28T13:15:10.620844Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b4b42805-4456-4951-b954-7b29f49aa5b7",
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
  "id": "df3f6672-e459-4c5c-b515-7df22b700083",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:20:11.002080Z",
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
      "id": "5ac10293-676c-4a5d-97b8-72e6a73a2b5c",
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
  "device_ref": "sandbox-17438"
}
```

```json
{
  "challenge_id": "80e511a4-ada1-4e42-852f-553450d53723",
  "expires_at": "2026-10-28T13:20:11.328249193Z",
  "resend_available_at": "2026-10-28T13:15:12.328249193Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "912745",
  "sent_at": "2026-10-28T13:15:11.332667703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80e511a4-ada1-4e42-852f-553450d53723",
  "code": "912745",
  "device_ref": "sandbox-17438"
}
```

```json
{
  "session_id": "743dd932-0fba-43c6-9f96-ffc69c0c128a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDIxMSwiaWF0IjoxNzkzMTkzMzExLCJqdGkiOiJlMjUwMDBhMy00NDE4LTRjMGQtOGZjOS1kOTQzMTJlZDk4N2MiLCJzaWQiOiI3NDNkZDkzMi0wZmJhLTQzYzYtOWY5Ni1mZmM2OWMwYzEyOGEifQ.SelW8aoApvPSGiaVpk2tA9gJhRjnHo-yZIS1Ny28U5k",
  "access_expires_at": "2026-10-28T13:30:11.646851484Z",
  "refresh_token": "NW847EQ_UAdJS_L0rgxzpUtfxE_lv6AgrR8dGxoFNKo",
  "refresh_expires_at": "2026-11-27T13:15:11.645846148Z",
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
  "command_id": "4fbaf0c2-4302-4f35-abc1-7873c77ec925",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:12Z",
    "sequence": 1793193312209
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6b55847-d02c-45f7-948d-66d747e08dd5",
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
  "last_heartbeat_at": "2026-10-28T13:15:12.265044Z",
  "last_location_at": "2026-10-28T13:15:12.265044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a8229ac3-71e1-4188-a1b7-ce0e23fcb178",
  "quote_id": "df3f6672-e459-4c5c-b515-7df22b700083",
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
  "id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7815265f-b50d-460e-9367-c27000cf4c17",
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
  "created_at": "2026-10-28T13:15:12.648911Z",
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
  "client_id": "7815265f-b50d-460e-9367-c27000cf4c17",
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
      "id": "99a13393-ba26-4c76-a684-f2bfe025c1d7",
      "at": "2026-10-28T13:15:10.620844Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
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
    "id": "93d20957-9c0b-4807-82f0-4f56df66a5f5",
    "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
    "expires_at": "2026-10-28T13:15:27.666532Z",
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

`POST /api/driver/v1/offers/93d20957-9c0b-4807-82f0-4f56df66a5f5/accept` → **200**

```json
{
  "command_id": "0b72e2c9-b53d-4a5d-8ac4-ce1b4e79803e"
}
```

```json
{
  "id": "c5d693b3-7ac6-4ed1-89a6-1431dd5047dc",
  "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30270e23-0a90-48bd-a00f-fcd429e96fd1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30270e23-0a90-48bd-a00f-fcd429e96fd1",
  "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
  "assignment_id": "c5d693b3-7ac6-4ed1-89a6-1431dd5047dc",
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

`POST /api/driver/v1/work-sessions/f6b55847-d02c-45f7-948d-66d747e08dd5/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:14Z",
    "sequence": 1793193314157
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6b55847-d02c-45f7-948d-66d747e08dd5",
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
  "last_heartbeat_at": "2026-10-28T13:15:14.186182Z",
  "last_location_at": "2026-10-28T13:15:14.186182Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/30270e23-0a90-48bd-a00f-fcd429e96fd1/arrive` → **200**

```json
{
  "command_id": "7326b83a-5126-42fb-aac0-61670daa1557",
  "expected_version": 0
}
```

```json
{
  "id": "30270e23-0a90-48bd-a00f-fcd429e96fd1",
  "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
  "assignment_id": "c5d693b3-7ac6-4ed1-89a6-1431dd5047dc",
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
  "arrived_at": "2026-10-28T13:15:14.487484Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/30270e23-0a90-48bd-a00f-fcd429e96fd1/start` → **200**

```json
{
  "command_id": "eee8d5fe-e0ec-4de8-b0c3-f15cd0d02cb5",
  "expected_version": 1
}
```

```json
{
  "id": "30270e23-0a90-48bd-a00f-fcd429e96fd1",
  "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
  "assignment_id": "c5d693b3-7ac6-4ed1-89a6-1431dd5047dc",
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
  "arrived_at": "2026-10-28T13:15:14.487484Z",
  "started_at": "2026-10-28T13:15:14.794447Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/30270e23-0a90-48bd-a00f-fcd429e96fd1/complete` → **200**

```json
{
  "command_id": "8e9ce431-5ae7-4ecb-baae-497cd6370c1f",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:15:15Z",
  "cash_received": true
}
```

```json
{
  "id": "30270e23-0a90-48bd-a00f-fcd429e96fd1",
  "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
  "assignment_id": "c5d693b3-7ac6-4ed1-89a6-1431dd5047dc",
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
  "arrived_at": "2026-10-28T13:15:14.487484Z",
  "started_at": "2026-10-28T13:15:14.794447Z",
  "completed_at": "2026-10-28T13:15:15.114751Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "7815265f-b50d-460e-9367-c27000cf4c17",
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
      "id": "0ede2a56-28a1-48d6-8a99-bceae5e262d9",
      "at": "2026-10-28T13:15:15.38984Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d"
    },
    {
      "id": "99a13393-ba26-4c76-a684-f2bfe025c1d7",
      "at": "2026-10-28T13:15:10.620844Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/5ac10293-676c-4a5d-97b8-72e6a73a2b5c/archive` → **200**

```json
{
  "command_id": "8ea14f8e-0767-4468-a793-91ab1f9e6082",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "5ac10293-676c-4a5d-97b8-72e6a73a2b5c",
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
  "created_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "created_at": "2026-10-28T13:15:09.375672Z",
  "updated_at": "2026-10-28T13:15:18.742549Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f6b55847-d02c-45f7-948d-66d747e08dd5",
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
  "last_heartbeat_at": "2026-10-28T13:15:14.186182Z",
  "last_location_at": "2026-10-28T13:15:14.186182Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f6b55847-d02c-45f7-948d-66d747e08dd5/close` → **200**

```json
{
  "command_id": "2daaded8-2c66-4aa6-875f-fe5dd104d99e",
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

Done: order 29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d.

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
  "session_id": "980ff5f4-38b0-4c09-bd7a-d40e9974b835",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyMTksImlhdCI6MTc5MzE5MzMxOSwianRpIjoiMGFkYTMwODAtNjA2Mi00ZWZhLTg1YTctZDBmNjQ2YTA0YjcwIiwic2lkIjoiOTgwZmY1ZjQtMzhiMC00YzA5LWJkN2EtZDQwZTk5NzRiODM1In0.5CV3fXBpngL1pinEZsaPEdYjSb3QcSCdLVIlWyGRwh0",
  "access_expires_at": "2026-10-28T13:30:19.93332493Z",
  "refresh_token": "RPCSufC38tKYgs2bzjg8LODC7Cg6CXbwEiEQEWdxors",
  "refresh_expires_at": "2026-10-29T01:15:19.93240598Z",
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
  "command_id": "5076d2de-4914-41ff-9af2-e410f37f109e",
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
  "session_id": "87149210-dfdb-4e65-a972-4402957fac8a",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyMjEsImlhdCI6MTc5MzE5MzMyMSwianRpIjoiOTE3YjU3OGMtNDQwYy00NWUwLWIyZmYtNDM2NWM5NmM1ZWYxIiwic2lkIjoiODcxNDkyMTAtZGZkYi00ZTY1LWE5NzItNDQwMjk1N2ZhYzhhIn0.FGI-OjFNGRznFtzTPH7BBB3fgn78YEnwXwMmYYeXbNk",
  "access_expires_at": "2026-10-28T13:30:21.091447307Z",
  "refresh_token": "gr_jCBGLl7Qd519QZjlOawa1lNr2VsF--5-I9zIJm3Q",
  "refresh_expires_at": "2026-10-29T01:15:21.09056813Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2065625547",
    "linkedid": "1730052700.2065625547",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671320136"
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
    "id": "1730052700.2065625547",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "b21abeca-ef8d-4f32-b64a-c8810a1cfc4c",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.383173Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:15:21.411892Z",
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
    "id": "1730052600.477826033",
    "linkedid": "1730052600.477826033",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671320136"
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
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6/answer` → **200**

```json
{
  "command_id": "cdd77f7c-7473-42c0-8220-ca3fb3bc2ded"
}
```

```json
{
  "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671320136",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "order_ids": [],
  "started_at": "2026-10-28T13:15:21.738596Z",
  "answered_at": "2026-10-28T13:15:22.062899Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.477826033",
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
    "id": "1730052600.477826033",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": "2026-10-28T13:15:22.062899Z",
      "ended_at": "2026-10-28T13:15:22.383318Z",
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
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": "2026-10-28T13:15:22.062899Z",
      "ended_at": "2026-10-28T13:15:22.383318Z",
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
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": "2026-10-28T13:15:22.062899Z",
      "ended_at": "2026-10-28T13:15:22.383318Z",
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
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": "2026-10-28T13:15:22.062899Z",
      "ended_at": "2026-10-28T13:15:22.383318Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:15:28.174593Z"
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
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": "2026-10-28T13:15:22.062899Z",
      "ended_at": "2026-10-28T13:15:22.383318Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:15:28.174593Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6` → **200**

```json
{
  "changes": [
    {
      "id": "a605584a-01bc-4fc4-9792-2e4a11b5da44",
      "occurred_at": "2026-10-28T13:15:29.918777Z",
      "actor_type": "STAFF",
      "actor_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7182f9e4-235b-4944-9ac1-9918d7603f6d\", \"order_ids\": []}",
      "correlation_id": "9e80e6d4-639e-4714-b549-dd7a52286090"
    },
    {
      "id": "af970477-b59e-4808-8c50-a21263f1ae4a",
      "occurred_at": "2026-10-28T13:15:29.880945Z",
      "actor_type": "STAFF",
      "actor_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7182f9e4-235b-4944-9ac1-9918d7603f6d\", \"order_ids\": []}",
      "correlation_id": "5ae89271-69d5-4cb9-a307-0144ce62e849"
    }
  ]
}
```

Done: call b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631142695",
  "device_ref": "sandbox-13147"
}
```

```json
{
  "challenge_id": "4744d659-e91c-42b8-9a0c-ad2373eaef85",
  "expires_at": "2026-10-28T13:20:30.255591046Z",
  "resend_available_at": "2026-10-28T13:15:31.255591046Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631142695` → **200**

```json
{
  "phone": "+380631142695",
  "audience": "CLIENT",
  "code": "785698",
  "sent_at": "2026-10-28T13:15:30.259170957Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4744d659-e91c-42b8-9a0c-ad2373eaef85",
  "code": "785698",
  "device_ref": "sandbox-13147"
}
```

```json
{
  "session_id": "afb48ddc-397f-4706-b36d-f37bbf986f18",
  "subject": {
    "type": "CLIENT",
    "id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYmY0ZGIwMS1iOTIxLTRiNGUtYmNmMS01NGQ5YmY4YjU3MTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjMwLCJpYXQiOjE3OTMxOTMzMzAsImp0aSI6ImVlNzIyNjAxLWM5NjItNDhmMS1hY2EyLThiOThhYWU4Y2FiYSIsInNpZCI6ImFmYjQ4ZGRjLTM5N2YtNDcwNi1iMzZkLWYzN2JiZjk4NmYxOCJ9.w3q-7PaVs5l1Ahv7def4oMJHQ1LhNspFhZ7wESvIjUc",
  "access_expires_at": "2026-10-28T13:30:30.564280392Z",
  "refresh_token": "b_3wo-z8IdRQyXJYW7fPbYawGIGQTYJjhOYWvGT7xGk",
  "refresh_expires_at": "2026-11-27T13:15:30.563551071Z",
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
  "device_ref": "sandbox-20602"
}
```

```json
{
  "challenge_id": "0ca90cbb-7611-44ac-a1a0-31e4ce31f35d",
  "expires_at": "2026-10-28T13:20:31.12447134Z",
  "resend_available_at": "2026-10-28T13:15:32.12447134Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "826895",
  "sent_at": "2026-10-28T13:15:31.129207785Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ca90cbb-7611-44ac-a1a0-31e4ce31f35d",
  "code": "826895",
  "device_ref": "sandbox-20602"
}
```

```json
{
  "session_id": "4632eb6a-c0d6-4f5c-92f1-da0a9f894235",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDIzMSwiaWF0IjoxNzkzMTkzMzMxLCJqdGkiOiJiNjkxMGM0NC0wOGQ1LTQ5MTktOWM2OS1mZmRmMjYyNzFhNGUiLCJzaWQiOiI0NjMyZWI2YS1jMGQ2LTRmNWMtOTJmMS1kYTBhOWY4OTQyMzUifQ.-XLhpnUfRzutdvpACIi0b9YraoAEvYhnhK-8AIFAzyg",
  "access_expires_at": "2026-10-28T13:30:31.441052566Z",
  "refresh_token": "WD1uqcaphhUlnWohPHXZlZMBUMI4Px-EsRtgDoSbSIw",
  "refresh_expires_at": "2026-11-27T13:15:31.440232737Z",
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
  "session_id": "c69f6834-263e-45a1-955d-f517de23ee06",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyMzIsImlhdCI6MTc5MzE5MzMzMiwianRpIjoiNzEwZGVhMjktMjEyOS00ZmMyLTg4MTgtNmQxNGNhNTJlOTkwIiwic2lkIjoiYzY5ZjY4MzQtMjYzZS00NWExLTk1NWQtZjUxN2RlMjNlZTA2In0.zvL7hRPs7vPcTexvzh5FceDvDr-Ylw1jKEiGpt1KkVI",
  "access_expires_at": "2026-10-28T13:30:32.287833897Z",
  "refresh_token": "PYn_ir64w21hUN2id-Ihdi6MYCcSk-ZiXoxNXOZn3-w",
  "refresh_expires_at": "2026-10-29T01:15:32.287099715Z",
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
  "session_id": "696f8c7f-2ff9-4abd-a760-fe2888fdcac9",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyMzIsImlhdCI6MTc5MzE5MzMzMiwianRpIjoiMDU0Y2IyNTMtZmU2Ni00ODIxLWE1OGYtYWRmNzdkNDc1NDBmIiwic2lkIjoiNjk2ZjhjN2YtMmZmOS00YWJkLWE3NjAtZmUyODg4ZmRjYWM5In0.fq7WeY5yFVBXDIr9MPGYEBecRzXL6rDj_dPi6_7A9Rg",
  "access_expires_at": "2026-10-28T13:30:32.870475164Z",
  "refresh_token": "THNQ5xomhTzer-INaTqBdh4JJfbAtz83Nr-OfYUlHaw",
  "refresh_expires_at": "2026-10-29T01:15:32.869650629Z",
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
      "code": "OPERATOR_ERROR",
      "labels": {
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora"
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
  "command_id": "dbb7f901-38e9-4316-87ff-304388223662",
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
  "id": "d92f3351-1ea8-4051-b004-f65b9fb8071d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:20:33.468967Z",
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
  "command_id": "d54c1d0f-073d-40e6-995e-23abf820839f",
  "quote_id": "d92f3351-1ea8-4051-b004-f65b9fb8071d",
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
  "id": "421187f2-7655-46f1-a2ef-8b9ee4c7e073",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718",
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
  "created_at": "2026-10-28T13:15:33.786117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/421187f2-7655-46f1-a2ef-8b9ee4c7e073` → **200**

```json
{
  "id": "421187f2-7655-46f1-a2ef-8b9ee4c7e073",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718",
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
  "created_at": "2026-10-28T13:15:33.786117Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/421187f2-7655-46f1-a2ef-8b9ee4c7e073/cancel` → **200**

```json
{
  "command_id": "acb11a05-26f4-4264-a4d7-7209510885b9",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "421187f2-7655-46f1-a2ef-8b9ee4c7e073",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718",
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
  "created_at": "2026-10-28T13:15:33.786117Z",
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
  "command_id": "3844e221-510a-49cb-add0-609f2701233a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:34Z",
    "sequence": 1793193334999
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91d863a8-d529-43a4-8a86-6da722ed61c7",
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
  "last_heartbeat_at": "2026-10-28T13:15:35.021206Z",
  "last_location_at": "2026-10-28T13:15:35.021206Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25818"
}
```

```json
{
  "challenge_id": "9d935982-de2b-4082-9374-250e59b4c5da",
  "expires_at": "2026-10-28T13:20:35.305654146Z",
  "resend_available_at": "2026-10-28T13:15:36.305654146Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "065455",
  "sent_at": "2026-10-28T13:15:35.309575537Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9d935982-de2b-4082-9374-250e59b4c5da",
  "code": "065455",
  "device_ref": "sandbox-25818"
}
```

```json
{
  "session_id": "e04181c2-190c-4119-ad80-96f0e7d9fb18",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDIzNSwiaWF0IjoxNzkzMTkzMzM1LCJqdGkiOiI5ZmYzZjJmYS0xY2I5LTQxOWUtOTMwZC0xZTY4Zjg2ZjA5ZDQiLCJzaWQiOiJlMDQxODFjMi0xOTBjLTQxMTktYWQ4MC05NmYwZTdkOWZiMTgifQ.xl1RighpvXF_9pDBETV-mTb23eumdb1782Ky8EMP33w",
  "access_expires_at": "2026-10-28T13:30:35.626387541Z",
  "refresh_token": "J1ftfBW4dRRf9Gk7NdA4rEGdTuCLzFDk3xBSCex-Pd0",
  "refresh_expires_at": "2026-11-27T13:15:35.625622992Z",
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
  "command_id": "9ad4fa3d-664a-4dcf-8f0a-6d744ef0ff85",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:36Z",
    "sequence": 1793193336193
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:36.215113Z",
  "last_location_at": "2026-10-28T13:15:36.215113Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "16836c3c-537b-4a0e-9282-c979c254c32d",
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
  "id": "cb143ecb-20fa-4a1a-b61b-c94b061e7bca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:20:36.518465Z",
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
  "command_id": "b82bf3e2-ba00-4895-953e-c51e97e78c41",
  "quote_id": "cb143ecb-20fa-4a1a-b61b-c94b061e7bca",
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
  "id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718",
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
  "created_at": "2026-10-28T13:15:36.815967Z",
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
    "id": "ec6d5b52-a2c2-4677-b6df-522cde2c4582",
    "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
    "expires_at": "2026-10-28T13:15:51.820886Z",
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

`POST /api/driver/v1/offers/ec6d5b52-a2c2-4677-b6df-522cde2c4582/accept` → **200**

```json
{
  "command_id": "b24a7681-5777-4221-b6f8-a585b14ffc2c"
}
```

```json
{
  "id": "4519df84-a240-42df-ad69-bf1479b3ea73",
  "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9ad1a44a-9e5f-4d64-8161-d2882a66d498",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9ad1a44a-9e5f-4d64-8161-d2882a66d498",
  "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "assignment_id": "4519df84-a240-42df-ad69-bf1479b3ea73",
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

`POST /api/driver/v1/trips/9ad1a44a-9e5f-4d64-8161-d2882a66d498/cancel` → **200**

```json
{
  "command_id": "e05245d7-17c7-48c6-8a32-2a72cca53bbf",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "9ad1a44a-9e5f-4d64-8161-d2882a66d498",
  "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "assignment_id": "4519df84-a240-42df-ad69-bf1479b3ea73",
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

`GET /api/rider/v1/orders/6b58e397-1177-43aa-9d2d-ff78226a56c3` → **200**

```json
{
  "id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718",
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
    "id": "4519df84-a240-42df-ad69-bf1479b3ea73",
    "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "9ad1a44a-9e5f-4d64-8161-d2882a66d498",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:15:36.815967Z",
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
    "id": "b16be445-69e8-4c08-9112-8d59191ce4a8",
    "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
    "expires_at": "2026-10-28T13:15:53.173192Z",
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

`POST /api/driver/v1/offers/b16be445-69e8-4c08-9112-8d59191ce4a8/accept` → **200**

```json
{
  "command_id": "c68c1e7f-fe5d-4f0f-a993-12a053e77bd1"
}
```

```json
{
  "id": "f704dc66-42fa-4a1b-8724-f956a8cbab09",
  "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "944e200c-a3db-4172-86fa-030eb6c76856",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "944e200c-a3db-4172-86fa-030eb6c76856",
  "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "assignment_id": "f704dc66-42fa-4a1b-8724-f956a8cbab09",
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

`POST /api/driver/v1/trips/944e200c-a3db-4172-86fa-030eb6c76856/cancel` → **200**

```json
{
  "command_id": "ba8d7f2a-7558-49f2-9b88-5fba994d81c1",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "944e200c-a3db-4172-86fa-030eb6c76856",
  "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
  "assignment_id": "f704dc66-42fa-4a1b-8724-f956a8cbab09",
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
    "id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:15:36.815967Z",
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
    "id": "421187f2-7655-46f1-a2ef-8b9ee4c7e073",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:15:33.786117Z",
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

`GET /api/operator/v1/orders/6b58e397-1177-43aa-9d2d-ff78226a56c3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:15:36.816782Z",
      "actor": {
        "type": "CLIENT",
        "id": "abf4db01-b921-4b4e-bcf1-54d9bf8b5718",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
        "quote_id": "cb143ecb-20fa-4a1a-b61b-c94b061e7bca",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "c5116b33-71b5-47b4-869e-7a9b71feceee"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:15:36.819649Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
        "attempt_id": "75459b70-6fa1-4c45-b28f-aa6c857482bd",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c5116b33-71b5-47b4-869e-7a9b71feceee"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:15:36.828026Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ec6d5b52-a2c2-4677-b6df-522cde2c4582",
        "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "c5116b33-71b5-47b4-869e-7a9b71feceee"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:15:37.480552Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ec6d5b52-a2c2-4677-b6df-522cde2c4582",
        "order_id": "6b58e397-1177-43aa-9d2d-ff78226a56c3",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "4519df84-a240-42df-ad69-bf1479b3ea73"
      },
      "correlation_id": "838b4d7c-eb52-4832-9689-55953c14028e"
```

Done: orders 421187f2-7655-46f1-a2ef-8b9ee4c7e073, 6b58e397-1177-43aa-9d2d-ff78226a56c3.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737771008",
  "device_ref": "sandbox-27985"
}
```

```json
{
  "challenge_id": "adddc199-178f-4d88-8223-7cbb6f825fea",
  "expires_at": "2026-10-28T13:20:40.551661856Z",
  "resend_available_at": "2026-10-28T13:15:41.551661856Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737771008` → **200**

```json
{
  "phone": "+380737771008",
  "audience": "CLIENT",
  "code": "461147",
  "sent_at": "2026-10-28T13:15:40.555280347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adddc199-178f-4d88-8223-7cbb6f825fea",
  "code": "461147",
  "device_ref": "sandbox-27985"
}
```

```json
{
  "session_id": "51943a4c-ffac-4e3e-b1c1-d5d52786f453",
  "subject": {
    "type": "CLIENT",
    "id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Y2NjM2NkZC1mYTk3LTQzMjItYjY3My04YmFiMzhhYjM2ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjQwLCJpYXQiOjE3OTMxOTMzNDAsImp0aSI6ImQ4YzI2NTg5LTg4M2YtNGY4My1iNDg3LTU1NzlkNzdmZTgzMiIsInNpZCI6IjUxOTQzYTRjLWZmYWMtNGUzZS1iMWMxLWQ1ZDUyNzg2ZjQ1MyJ9.ddvHW-S8KLSjuC6QRpjonNz5Ewz4baXpxtHCMLpegQY",
  "access_expires_at": "2026-10-28T13:30:40.864268158Z",
  "refresh_token": "2GIDxb_3DrxPIhCUXb03uW5j0Ii-pqiuFJeDb5UH5qk",
  "refresh_expires_at": "2026-11-27T13:15:40.863563642Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "aa14d635-d3bf-4684-ae61-d9016e4055dd",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "26aeebc6-18f7-4287-868a-fb569df92812",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-26aeebc6-18f7-4287-868a-fb569df92812",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "58464d677d49fd4a6410144d52f8738a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=26aeebc6-18f7-4287-868a-fb569df92812",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737771008"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=26aeebc6-18f7-4287-868a-fb569df92812",
  "expires_at": "2026-10-28T13:45:41.154491Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/26aeebc6-18f7-4287-868a-fb569df92812` → **200**

```json
{
  "id": "26aeebc6-18f7-4287-868a-fb569df92812",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T13:45:41.154491Z",
  "card": {
    "id": "1c32cd44-7836-4f4c-abc3-d427d25cde16",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6213",
    "card_type": "Visa",
    "created_at": "2026-10-28T13:15:41.463425Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "1c32cd44-7836-4f4c-abc3-d427d25cde16",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****6213",
      "card_type": "Visa",
      "created_at": "2026-10-28T13:15:41.463425Z"
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
  "device_ref": "sandbox-26667"
}
```

```json
{
  "challenge_id": "f622eb43-182e-4d86-9df9-0475f9e48146",
  "expires_at": "2026-10-28T13:20:42.064748295Z",
  "resend_available_at": "2026-10-28T13:15:43.064748295Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "707964",
  "sent_at": "2026-10-28T13:15:42.068039844Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f622eb43-182e-4d86-9df9-0475f9e48146",
  "code": "707964",
  "device_ref": "sandbox-26667"
}
```

```json
{
  "session_id": "7e711e33-057e-4cfc-8489-5984426020bb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDI0MiwiaWF0IjoxNzkzMTkzMzQyLCJqdGkiOiI3NDAxZDZiNC0yNzlmLTQzNjItYmI2Zi04ZDk5MWQ0MjIxZTAiLCJzaWQiOiI3ZTcxMWUzMy0wNTdlLTRjZmMtODQ4OS01OTg0NDI2MDIwYmIifQ.AELct_MZx2Wk20PAQbVXqa7O9dtMDNFXkmEMDjFOkwU",
  "access_expires_at": "2026-10-28T13:30:42.383526641Z",
  "refresh_token": "Z-tBmf3apo6iVz4_xd2Tm7tCx_mroR7oqU8tntLgsSM",
  "refresh_expires_at": "2026-11-27T13:15:42.382629009Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:36.215113Z",
  "last_location_at": "2026-10-28T13:15:36.215113Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5330ee5-82b0-4d8d-a256-1c47302417b9/handover` → **200**

```json
{
  "command_id": "219a8b52-1153-4f8e-b5dd-350ccf288ae8",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:36.215113Z",
  "last_location_at": "2026-10-28T13:15:36.215113Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5330ee5-82b0-4d8d-a256-1c47302417b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:43Z",
    "sequence": 1793193343257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:43.281392Z",
  "last_location_at": "2026-10-28T13:15:43.281392Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e33d4cb-6874-4685-97b1-c6708a5f89aa",
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
  "id": "50e20ef3-68ec-4e0a-ad85-5dfc8706a40e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:20:43.585147Z",
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
  "command_id": "e1b30359-7094-4081-85cb-ae186f5ca9fe",
  "quote_id": "50e20ef3-68ec-4e0a-ad85-5dfc8706a40e",
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
  "id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
  "created_at": "2026-10-28T13:15:43.890822Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0` → **200**

```json
{
  "id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
  "created_at": "2026-10-28T13:15:43.890822Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0` → **200**

```json
{
  "id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
  "created_at": "2026-10-28T13:15:43.890822Z",
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
    "id": "c69ded9c-6c6e-49de-8cde-b68c154faa9b",
    "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
    "expires_at": "2026-10-28T13:15:59.593849Z",
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

`POST /api/driver/v1/offers/c69ded9c-6c6e-49de-8cde-b68c154faa9b/accept` → **200**

```json
{
  "command_id": "60ca6c2c-2ad4-4364-ab48-a1c8120955c9"
}
```

```json
{
  "id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "assignment_id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
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

`POST /api/driver/v1/work-sessions/a5330ee5-82b0-4d8d-a256-1c47302417b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:46Z",
    "sequence": 1793193346619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:46.642166Z",
  "last_location_at": "2026-10-28T13:15:46.642166Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0c7a4f67-e228-4ff2-9ae7-b52252997227/arrive` → **200**

```json
{
  "command_id": "adf81dbf-f0de-40b4-b08d-33695219cdc5",
  "expected_version": 0
}
```

```json
{
  "id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "assignment_id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
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
  "arrived_at": "2026-10-28T13:15:46.935696Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c7a4f67-e228-4ff2-9ae7-b52252997227/start` → **200**

```json
{
  "command_id": "208ecc63-1da0-446e-9067-e30784ec3127",
  "expected_version": 1
}
```

```json
{
  "id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "assignment_id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
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
  "arrived_at": "2026-10-28T13:15:46.935696Z",
  "started_at": "2026-10-28T13:15:47.228947Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c7a4f67-e228-4ff2-9ae7-b52252997227/complete` → **200**

```json
{
  "command_id": "cba34313-d418-4606-98fe-f0aa0948b984",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:15:47Z",
  "cash_received": true
}
```

```json
{
  "id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "assignment_id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
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
  "arrived_at": "2026-10-28T13:15:46.935696Z",
  "started_at": "2026-10-28T13:15:47.228947Z",
  "completed_at": "2026-10-28T13:15:47.536714Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0` → **200**

```json
{
  "id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
    "id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
    "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:15:43.890822Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0` → **200**

```json
{
  "id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
    "id": "26ceb0dc-08d2-49dc-ba13-e9b48a7c0488",
    "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0c7a4f67-e228-4ff2-9ae7-b52252997227",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:15:43.890822Z",
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
      "id": "c86fc84b-ca48-438a-b097-d09508f1b2a0",
      "at": "2026-10-28T13:15:47.65709Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0/tip` → **200**

```json
{
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
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
  "available_until": "2026-10-29T13:15:47.536714Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0/tip` → **201**

```json
{
  "command_id": "3f3b3e14-6985-4224-be23-0c7c7abff0ef",
  "amount_minor": 2500
}
```

```json
{
  "id": "3515a8ee-f05c-40f5-a817-4a5b29a640c1",
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:15:50.290454Z"
}
```

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0/tip` → **200**

```json
{
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
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
  "available_until": "2026-10-29T13:15:47.536714Z",
  "open": false,
  "tip": {
    "id": "3515a8ee-f05c-40f5-a817-4a5b29a640c1",
    "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T13:15:50.290454Z"
  }
}
```

`GET /api/rider/v1/orders/2bf5c73e-8ae3-4782-b019-e2b790144af0/tip` → **200**

```json
{
  "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
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
  "available_until": "2026-10-29T13:15:47.536714Z",
  "open": false,
  "tip": {
    "id": "3515a8ee-f05c-40f5-a817-4a5b29a640c1",
    "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:15:50.290454Z"
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
      "id": "badc2ecd-d6db-4033-b0c4-5b8a9262d8e4",
      "at": "2026-10-28T13:15:51.728247Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    },
    {
      "id": "c86fc84b-ca48-438a-b097-d09508f1b2a0",
      "at": "2026-10-28T13:15:47.65709Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "899587fa-09c2-460a-8b67-0fce38a5d2d7",
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
  "id": "c652dffb-c19b-4a69-9b67-c487211c8ec8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:20:52.443249Z",
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
  "session_id": "f3919158-d665-41c9-b217-13bd1a1dc8ff",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyNTMsImlhdCI6MTc5MzE5MzM1MywianRpIjoiNjYzZTM1MTAtNjczNi00YzNlLTlmODktNjc1MWY4MTQ1Njk2Iiwic2lkIjoiZjM5MTkxNTgtZDY2NS00MWM5LWIyMTctMTNiZDFhMWRjOGZmIn0.JDEXPRRiyAEpzCm9FRzxKrNdc2oxNMoVRSKXFsFVgfQ",
  "access_expires_at": "2026-10-28T13:30:53.036892093Z",
  "refresh_token": "VqXEiY_byoy3B2V13BJLYh6DdnThytqj_fMD52tjJY0",
  "refresh_expires_at": "2026-10-29T01:15:53.036148478Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737771008` → **200**

```json
{
  "client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7"
}
```

`POST /api/admin/v1/rider-wallets/9ccc3cdd-fa97-4322-b673-8bab38ab36e7/top-ups` → **201**

```json
{
  "command_id": "2c6ba94d-5202-427b-9e21-cf91b12f6275",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
      "id": "6562a369-ba74-47f1-a462-2f0fe8b30b26",
      "at": "2026-10-28T13:15:53.609702Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "50395fae-0cf1-465a-923a-e4048ef7dcd8",
  "quote_id": "c652dffb-c19b-4a69-9b67-c487211c8ec8",
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
  "id": "27d951cf-b97d-4703-93c8-36345834b767",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
  "created_at": "2026-10-28T13:15:53.908553Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/27d951cf-b97d-4703-93c8-36345834b767` → **200**

```json
{
  "id": "27d951cf-b97d-4703-93c8-36345834b767",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
  "created_at": "2026-10-28T13:15:53.908553Z",
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
    "id": "b080eed4-489c-4169-805c-623ac9085f7e",
    "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
    "expires_at": "2026-10-28T13:16:08.914476Z",
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

`POST /api/driver/v1/offers/b080eed4-489c-4169-805c-623ac9085f7e/accept` → **200**

```json
{
  "command_id": "6dc95699-a1b8-4a15-9a57-35196d37bc56"
}
```

```json
{
  "id": "ffaea4ad-ca06-4ee6-bf50-24f57e1dbf71",
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe186950-af1d-4442-a2c8-48a27c184877",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe186950-af1d-4442-a2c8-48a27c184877",
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
  "assignment_id": "ffaea4ad-ca06-4ee6-bf50-24f57e1dbf71",
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

`POST /api/driver/v1/work-sessions/a5330ee5-82b0-4d8d-a256-1c47302417b9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:15:55Z",
    "sequence": 1793193355348
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:55.370883Z",
  "last_location_at": "2026-10-28T13:15:55.370883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fe186950-af1d-4442-a2c8-48a27c184877/arrive` → **200**

```json
{
  "command_id": "907a2276-f135-4484-aab0-ca7d4337f9be",
  "expected_version": 0
}
```

```json
{
  "id": "fe186950-af1d-4442-a2c8-48a27c184877",
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
  "assignment_id": "ffaea4ad-ca06-4ee6-bf50-24f57e1dbf71",
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
  "arrived_at": "2026-10-28T13:15:55.670132Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe186950-af1d-4442-a2c8-48a27c184877/start` → **200**

```json
{
  "command_id": "55f3808d-3f47-42a3-a5d9-fac334df4ee3",
  "expected_version": 1
}
```

```json
{
  "id": "fe186950-af1d-4442-a2c8-48a27c184877",
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
  "assignment_id": "ffaea4ad-ca06-4ee6-bf50-24f57e1dbf71",
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
  "arrived_at": "2026-10-28T13:15:55.670132Z",
  "started_at": "2026-10-28T13:15:55.979842Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fe186950-af1d-4442-a2c8-48a27c184877/complete` → **200**

```json
{
  "command_id": "b334f386-c783-4ba6-85eb-4043ff9c9bb5",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:15:56Z",
  "cash_received": true
}
```

```json
{
  "id": "fe186950-af1d-4442-a2c8-48a27c184877",
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
  "assignment_id": "ffaea4ad-ca06-4ee6-bf50-24f57e1dbf71",
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
  "arrived_at": "2026-10-28T13:15:55.670132Z",
  "started_at": "2026-10-28T13:15:55.979842Z",
  "completed_at": "2026-10-28T13:15:56.280039Z",
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
  "client_id": "9ccc3cdd-fa97-4322-b673-8bab38ab36e7",
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
      "id": "6562a369-ba74-47f1-a462-2f0fe8b30b26",
      "at": "2026-10-28T13:15:53.609702Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
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
      "balance_minor": 30204,
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
      "id": "03e029d0-3583-4fd3-a403-441cf0b69437",
      "at": "2026-10-28T13:15:56.785Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
      "counterpart_id": null
    },
    {
      "id": "badc2ecd-d6db-4033-b0c4-5b8a9262d8e4",
      "at": "2026-10-28T13:15:51.728247Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    },
    {
      "id": "c86fc84b-ca48-438a-b097-d09508f1b2a0",
      "at": "2026-10-28T13:15:47.65709Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/27d951cf-b97d-4703-93c8-36345834b767/tip` → **200**

```json
{
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
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
  "available_until": "2026-10-29T13:15:56.280039Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/27d951cf-b97d-4703-93c8-36345834b767/tip` → **201**

```json
{
  "command_id": "14b8274b-23bc-43cb-a85c-f82385dab40e",
  "amount_minor": 2500
}
```

```json
{
  "id": "57df6115-7a85-458d-ba4b-33d084d8fc5c",
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T13:15:57.737711Z"
}
```

`GET /api/rider/v1/orders/27d951cf-b97d-4703-93c8-36345834b767/tip` → **200**

```json
{
  "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
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
  "available_until": "2026-10-29T13:15:56.280039Z",
  "open": false,
  "tip": {
    "id": "57df6115-7a85-458d-ba4b-33d084d8fc5c",
    "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T13:15:57.737711Z"
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
      "balance_minor": 30204
    }
  ],
  "entries": [
    {
      "id": "03e029d0-3583-4fd3-a403-441cf0b69437",
      "at": "2026-10-28T13:15:56.785Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
      "counterpart_id": null
    },
    {
      "id": "badc2ecd-d6db-4033-b0c4-5b8a9262d8e4",
      "at": "2026-10-28T13:15:51.728247Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    },
    {
      "id": "c86fc84b-ca48-438a-b097-d09508f1b2a0",
      "at": "2026-10-28T13:15:47.65709Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
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
      "balance_minor": 32704
    }
  ],
  "entries": [
    {
      "id": "10aa9a45-f1c5-455d-bd4e-113039da7e32",
      "at": "2026-10-28T13:15:58.825374Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
      "counterpart_id": null
    },
    {
      "id": "03e029d0-3583-4fd3-a403-441cf0b69437",
      "at": "2026-10-28T13:15:56.785Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "27d951cf-b97d-4703-93c8-36345834b767",
      "counterpart_id": null
    },
    {
      "id": "badc2ecd-d6db-4033-b0c4-5b8a9262d8e4",
      "at": "2026-10-28T13:15:51.728247Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    },
    {
      "id": "c86fc84b-ca48-438a-b097-d09508f1b2a0",
      "at": "2026-10-28T13:15:47.65709Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "2bf5c73e-8ae3-4782-b019-e2b790144af0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "a5330ee5-82b0-4d8d-a256-1c47302417b9",
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
  "last_heartbeat_at": "2026-10-28T13:15:55.370883Z",
  "last_location_at": "2026-10-28T13:15:55.370883Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a5330ee5-82b0-4d8d-a256-1c47302417b9/close` → **200**

```json
{
  "command_id": "22e5be56-e872-4e50-914d-f49340d7ae79",
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

Done: card order 27d951cf-b97d-4703-93c8-36345834b767.

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
  "phone": "+380732725220",
  "device_ref": "sandbox-26536"
}
```

```json
{
  "challenge_id": "19fa8dfe-a1aa-43fb-9eb0-faa7df40aa07",
  "expires_at": "2026-10-28T13:21:00.755545556Z",
  "resend_available_at": "2026-10-28T13:16:01.755545556Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380732725220` → **200**

```json
{
  "phone": "+380732725220",
  "audience": "CLIENT",
  "code": "276393",
  "sent_at": "2026-10-28T13:16:00.758677237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19fa8dfe-a1aa-43fb-9eb0-faa7df40aa07",
  "code": "276393",
  "device_ref": "sandbox-26536"
}
```

```json
{
  "session_id": "442c2e56-897e-4fe4-8170-f8510fc489c0",
  "subject": {
    "type": "CLIENT",
    "id": "550f59a4-ba01-4db0-b898-f93764c5da36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NTBmNTlhNC1iYTAxLTRkYjAtYjg5OC1mOTM3NjRjNWRhMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjYxLCJpYXQiOjE3OTMxOTMzNjEsImp0aSI6IjVhYTJiMzVhLTRjNDUtNGQ4Yi1hMTg0LTkwMzJlMTNkMzBiMSIsInNpZCI6IjQ0MmMyZTU2LTg5N2UtNGZlNC04MTcwLWY4NTEwZmM0ODljMCJ9.gAgjkX2vYA06HCGu477qYNHFnkDkQy1NJZb0s8Q8GGo",
  "access_expires_at": "2026-10-28T13:31:01.067177913Z",
  "refresh_token": "rwb0vdZTnVYzkIU3F3FcWuseI1h5tCtXP05JQ7dGmck",
  "refresh_expires_at": "2026-11-27T13:16:01.066488923Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "82706add-8c01-46f4-bb93-6ddef733d33c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "d4ea7362-dcd0-47ee-8728-728e69d28c25",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-d4ea7362-dcd0-47ee-8728-728e69d28c25",
    "orderDate": "1793193361",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8a68dee279f634ef3784ea31be7e5cf7",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=d4ea7362-dcd0-47ee-8728-728e69d28c25",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732725220"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=d4ea7362-dcd0-47ee-8728-728e69d28c25",
  "created_at": "2026-10-28T13:16:01.355515Z",
  "expires_at": "2026-10-28T13:46:01.355515Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/d4ea7362-dcd0-47ee-8728-728e69d28c25` → **200**

```json
{
  "id": "d4ea7362-dcd0-47ee-8728-728e69d28c25",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:16:01.355515Z",
  "expires_at": "2026-10-28T13:46:01.355515Z",
  "completed_at": "2026-10-28T13:16:01.637528Z",
  "masked_pan": "41****3131",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "550f59a4-ba01-4db0-b898-f93764c5da36",
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
      "id": "a214577d-5aa2-46e4-a353-5eceb32f1b5d",
      "at": "2026-10-28T13:16:01.841626Z",
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
  "client_id": "550f59a4-ba01-4db0-b898-f93764c5da36",
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
      "id": "a214577d-5aa2-46e4-a353-5eceb32f1b5d",
      "at": "2026-10-28T13:16:01.841626Z",
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
  "device_ref": "sandbox-25620"
}
```

```json
{
  "challenge_id": "be308f8f-f658-444c-a0bd-c285c83eb6dc",
  "expires_at": "2026-10-28T13:21:02.51380428Z",
  "resend_available_at": "2026-10-28T13:16:03.51380428Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "550873",
  "sent_at": "2026-10-28T13:16:02.516751848Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be308f8f-f658-444c-a0bd-c285c83eb6dc",
  "code": "550873",
  "device_ref": "sandbox-25620"
}
```

```json
{
  "session_id": "c771128a-ef2e-4ecc-8371-15fb16aecf95",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDI2MiwiaWF0IjoxNzkzMTkzMzYyLCJqdGkiOiI5ZDY2MGQ2Yi1mNzg1LTRkOTgtOTBlNy0yOGI4MzhkMjcxOGYiLCJzaWQiOiJjNzcxMTI4YS1lZjJlLTRlY2MtODM3MS0xNWZiMTZhZWNmOTUifQ.Qs0Xo5i-XW0Nyj7gdHbHwgDH7chFdLuz7U70jbqWidg",
  "access_expires_at": "2026-10-28T13:31:02.830246161Z",
  "refresh_token": "hXjc0UNh_UeqLxIun-9zWFm8nXEtoXkPNXMRciM5wBA",
  "refresh_expires_at": "2026-11-27T13:16:02.829598766Z",
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
  "command_id": "aa84ce18-12ab-4b7d-bd86-bd115d706354",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "82a2d160-f978-4ec2-b497-390854e0f929",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-82a2d160-f978-4ec2-b497-390854e0f929",
    "orderDate": "1793193363",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "641fa33a84ae384a3f0f209797cd87ee",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=82a2d160-f978-4ec2-b497-390854e0f929",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=82a2d160-f978-4ec2-b497-390854e0f929",
  "created_at": "2026-10-28T13:16:03.405814Z",
  "expires_at": "2026-10-28T13:46:03.405814Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/82a2d160-f978-4ec2-b497-390854e0f929` → **200**

```json
{
  "id": "82a2d160-f978-4ec2-b497-390854e0f929",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T13:16:03.405814Z",
  "expires_at": "2026-10-28T13:46:03.405814Z",
  "completed_at": "2026-10-28T13:16:03.686712Z",
  "masked_pan": "41****4653",
  "failure_reason": null
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
      "id": "3e6d1249-8475-4ff4-a395-de8b16cae057",
      "at": "2026-10-28T13:16:03.85169Z",
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
  "command_id": "1f7f31b0-706e-45fb-b53d-e2bf617418d3",
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
  "correlation_id": "53ca4e49-53b7-4420-9097-db8adc87336a"
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
  "session_id": "91145646-b67c-4a08-b87c-aa21798544ed",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyNjQsImlhdCI6MTc5MzE5MzM2NCwianRpIjoiMWViNmE5OTktOTZkZi00YjE2LTkzODYtOWYxOGIyOThmZDM5Iiwic2lkIjoiOTExNDU2NDYtYjY3Yy00YTA4LWI4N2MtYWEyMTc5ODU0NGVkIn0.y6RS8RBLYuriUa4loeCC8XufU3u0fyMiP-FKaS3Lev0",
  "access_expires_at": "2026-10-28T13:31:04.880204089Z",
  "refresh_token": "NRLYHLaQlrQftc7l3JSZoBANybhr4_LCMU6-AQ0CmD4",
  "refresh_expires_at": "2026-10-29T01:16:04.879570729Z",
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
  "phone": "+48600627948",
  "device_ref": "sandbox-18182"
}
```

```json
{
  "challenge_id": "9ea8f61b-8385-4210-9404-3d3971d6cb73",
  "expires_at": "2026-10-28T13:21:05.744136044Z",
  "resend_available_at": "2026-10-28T13:16:06.744136044Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600627948` → **200**

```json
{
  "phone": "+48600627948",
  "audience": "CLIENT",
  "code": "246033",
  "sent_at": "2026-10-28T13:16:05.746984648Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9ea8f61b-8385-4210-9404-3d3971d6cb73",
  "code": "246033",
  "device_ref": "sandbox-18182"
}
```

```json
{
  "session_id": "6c34c84e-26fb-4429-b858-4e8dc368ad82",
  "subject": {
    "type": "CLIENT",
    "id": "c1dc6b0a-017e-4de9-9c31-ff1151f1a18a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMWRjNmIwYS0wMTdlLTRkZTktOWMzMS1mZjExNTFmMWExOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjY2LCJpYXQiOjE3OTMxOTMzNjYsImp0aSI6ImE3ZGQ4MmNjLWY4ODEtNGJjYi1hYzk2LTRkZGFhY2I0MGExZSIsInNpZCI6IjZjMzRjODRlLTI2ZmItNDQyOS1iODU4LTRlOGRjMzY4YWQ4MiJ9.-NjJPaG1SXx-9u3dQcPEnP7pRRaLMnwpe0hdFBtC454",
  "access_expires_at": "2026-10-28T13:31:06.055216638Z",
  "refresh_token": "8fq6d552qj7LIXwF0f4lxeCArRqog7vVAudyvFQCOO0",
  "refresh_expires_at": "2026-11-27T13:16:06.054530146Z",
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
  "command_id": "db3edc58-c7ce-4397-91e0-1739a2bab8a9",
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
  "correlation_id": "2def8db5-80b8-4cc3-84cb-0b969fad39f0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
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
  "command_id": "b5e715da-01c7-422d-af73-ed46c899911c",
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
  "paused_at": "2026-10-28T13:16:07.188253906Z",
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
  "command_id": "d6718416-352a-4ac3-a662-c5e5d18a395e",
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
  "id": "56c431a1-384a-4bad-9f23-03b8665eb6a8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:07.768448Z",
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
  "command_id": "58acd6c4-b0cb-4a9e-a352-533a5bc98de6",
  "quote_id": "56c431a1-384a-4bad-9f23-03b8665eb6a8",
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
  "correlation_id": "2db8745d-1677-4a6c-b084-0d954db919f0"
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
  "paused_at": "2026-10-28T13:16:07.188254Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "393e5482-92c6-45d9-8f76-39b5f84281e4",
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
  "command_id": "127fd116-c7bb-46ea-a248-127dc6f3d91d",
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
  "command_id": "bd6abeac-5dfe-4e48-bf2e-19c91007edf7",
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
  "id": "591464f6-edd4-4e13-a5bb-627d2126edb7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:09.523196Z",
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
  "command_id": "dafeaa30-b12e-4c0e-b275-56dc5e33e414",
  "quote_id": "591464f6-edd4-4e13-a5bb-627d2126edb7",
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
  "correlation_id": "7ba633e8-b673-411f-ab0a-ac622030cac3"
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
  "command_id": "9ee7a85c-0a98-43e3-8cc1-b1f0c453ad94",
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
      "from": "16:00",
      "to": "17:00"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "03c2489d-a19d-419d-854b-84e78647f99e",
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
  "id": "badacc2e-2571-452f-8b75-0da3d74c4475",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:10.671521Z",
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
  "command_id": "459e2874-71a9-4835-ab29-703c90cb313a",
  "quote_id": "badacc2e-2571-452f-8b75-0da3d74c4475",
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
  "correlation_id": "5809d5df-49f4-4d52-80d0-efb33a022add"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "75f2d49c-bca0-4ff9-8870-02a728bf96dc",
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
  "correlation_id": "a0be0cf0-fab2-40d5-b052-a436f9079bd9"
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
      "from": "16:00",
      "to": "17:00"
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
  "command_id": "334785f2-9acb-4607-a09f-b9f562729066",
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
  "phone": "+380679751647",
  "device_ref": "sandbox-1399"
}
```

```json
{
  "challenge_id": "4bfc8aff-84a7-46ac-9ca9-a631cef490d2",
  "expires_at": "2026-10-28T13:21:12.122549522Z",
  "resend_available_at": "2026-10-28T13:16:13.122549522Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679751647` → **200**

```json
{
  "phone": "+380679751647",
  "audience": "CLIENT",
  "code": "327648",
  "sent_at": "2026-10-28T13:16:12.124931993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bfc8aff-84a7-46ac-9ca9-a631cef490d2",
  "code": "327648",
  "device_ref": "sandbox-1399"
}
```

```json
{
  "session_id": "7080672b-a127-4798-a4dd-0d391f89245f",
  "subject": {
    "type": "CLIENT",
    "id": "8cfc02c7-afc9-4b06-ad28-352e75aef397"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4Y2ZjMDJjNy1hZmM5LTRiMDYtYWQyOC0zNTJlNzVhZWYzOTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjcyLCJpYXQiOjE3OTMxOTMzNzIsImp0aSI6ImVlMDk0NmFlLWZmYTMtNGFiYi04NGFiLTJlOWU1MzEyZWE1MyIsInNpZCI6IjcwODA2NzJiLWExMjctNDc5OC1hNGRkLTBkMzkxZjg5MjQ1ZiJ9.iu9-EyBR3d9EFZ-KTr4hnZBXpoRNAfBaOh1b3KpUwtQ",
  "access_expires_at": "2026-10-28T13:31:12.433089827Z",
  "refresh_token": "CPjWzwBIpOmjHR9CgptCFBOANcy_QkAdnxNekekw_PE",
  "refresh_expires_at": "2026-11-27T13:16:12.432465835Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8cfc02c7-afc9-4b06-ad28-352e75aef397",
  "session_id": "7080672b-a127-4798-a4dd-0d391f89245f",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "35573b62-180f-457d-b166-5dfed121cd8f",
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
  "id": "b795045b-d90c-46b4-a776-65037c9084db",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:13.000372Z",
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
  "challenge_id": "59523cae-e391-42b5-b90f-84c3872060ab",
  "expires_at": "2026-10-28T13:21:15.294069024Z",
  "resend_available_at": "2026-10-28T13:16:16.294069024Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679751647` → **200**

```json
{
  "phone": "+380679751647",
  "audience": "CLIENT",
  "code": "407430",
  "sent_at": "2026-10-28T13:16:15.29632025Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "39bc4065-1f74-4e94-adba-7f0f7bb372dd",
  "challenge_id": "59523cae-e391-42b5-b90f-84c3872060ab",
  "otp_code": "407430"
}
```

```json
{
  "client_id": "8cfc02c7-afc9-4b06-ad28-352e75aef397",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T13:16:15.613939932Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "02fffea1-4e56-4d53-a7e7-4729e4040c59",
  "quote_id": "b795045b-d90c-46b4-a776-65037c9084db",
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
  "correlation_id": "08aaaa39-4aea-445d-8224-9cf029e076f0"
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
  "session_id": "a3a06777-482b-448e-94b2-47b940d46c7a",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyNzYsImlhdCI6MTc5MzE5MzM3NiwianRpIjoiZmE5NjAyMjctMGU4OC00NTgwLWE0MWMtYmM4MGYxYzdiOGVjIiwic2lkIjoiYTNhMDY3NzctNDgyYi00NDhlLTk0YjItNDdiOTQwZDQ2YzdhIn0.PTO1fIMjBYjjNNnzV_SsJ9UPqy2dfToXfjGmZq2nA8E",
  "access_expires_at": "2026-10-28T13:31:16.491658653Z",
  "refresh_token": "tT_87SOzb65p7JmTyn0hbTGEeoZfJGK8GSRCAU1_iC4",
  "refresh_expires_at": "2026-10-29T01:16:16.490863568Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "8cfc02c7-afc9-4b06-ad28-352e75aef397",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T13:16:15.61394Z",
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

`POST /api/admin/v1/client-deletions/8cfc02c7-afc9-4b06-ad28-352e75aef397/complete` → **200**

```json
{
  "command_id": "d292363d-efa9-4b7a-8a83-eca714c71b79",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "8cfc02c7-afc9-4b06-ad28-352e75aef397",
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
  "correlation_id": "b3680d46-117f-42c7-8450-9df44392b02a"
}
```

Done: client 8cfc02c7-afc9-4b06-ad28-352e75aef397 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660649352",
  "device_ref": "sandbox-26602"
}
```

```json
{
  "challenge_id": "c67f88ad-8e9d-4a0b-b472-d9f8b9e33b06",
  "expires_at": "2026-10-28T13:21:17.640516398Z",
  "resend_available_at": "2026-10-28T13:16:18.640516398Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660649352` → **200**

```json
{
  "phone": "+380660649352",
  "audience": "CLIENT",
  "code": "531741",
  "sent_at": "2026-10-28T13:16:17.643235518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c67f88ad-8e9d-4a0b-b472-d9f8b9e33b06",
  "code": "531741",
  "device_ref": "sandbox-26602"
}
```

```json
{
  "session_id": "92f472f9-86ae-4ca5-b499-ad0789a0eaeb",
  "subject": {
    "type": "CLIENT",
    "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzM5N2JmYS0yZDU4LTQxNmEtOWFkMi1kNGVjNmNhMWVkNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0Mjc3LCJpYXQiOjE3OTMxOTMzNzcsImp0aSI6IjQ3YmI5YmRhLTIwOGMtNDVjMy1iMjUyLTk0M2UzOGNkOGI1ZiIsInNpZCI6IjkyZjQ3MmY5LTg2YWUtNGNhNS1iNDk5LWFkMDc4OWEwZWFlYiJ9.wxSVo_2gNfgOVYonR7PwxA4hCOZ43knm-sPnRE0ZBRI",
  "access_expires_at": "2026-10-28T13:31:17.950449434Z",
  "refresh_token": "tcAUt-AAQQs3aHsOpE3SHbQhxkrF1zFRimRSOMcz6JE",
  "refresh_expires_at": "2026-11-27T13:16:17.949913376Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
  "session_id": "92f472f9-86ae-4ca5-b499-ad0789a0eaeb",
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
  "session_id": "f09287a4-4b95-4039-b99e-75d0bc08ddbf",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyNzgsImlhdCI6MTc5MzE5MzM3OCwianRpIjoiNzQyMDdkOTYtOGJiZC00MmQyLWE3N2UtN2ZiM2M4Mjc2YTZjIiwic2lkIjoiZjA5Mjg3YTQtNGI5NS00MDM5LWI5OWUtNzVkMGJjMDhkZGJmIn0.QUU9eJhixP2THyKphHUu42npqf8zyDVLn8b-FwnzQvM",
  "access_expires_at": "2026-10-28T13:31:18.807154358Z",
  "refresh_token": "FQso7pkNz4d41QOEPLV9fsIEF0WRgwEJHbuaFnlLcyQ",
  "refresh_expires_at": "2026-10-29T01:16:18.806563398Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0649352&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
      "phone": "+380660649352",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T13:16:17.947952Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/53397bfa-2d58-416a-9ad2-d4ec6ca1ed73` → **200**

```json
{
  "client": {
    "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
    "phone": "+380660649352",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:16:17.947952Z",
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

`POST /api/admin/v1/clients/53397bfa-2d58-416a-9ad2-d4ec6ca1ed73/block` → **400**

```json
{
  "command_id": "fd7e803e-84b2-43ca-bffe-06b38ec47aab",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/53397bfa-2d58-416a-9ad2-d4ec6ca1ed73/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f1604051-8132-4c46-8cd3-76e8d31d3676",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/53397bfa-2d58-416a-9ad2-d4ec6ca1ed73/block` → **200**

```json
{
  "command_id": "c61994f3-c5aa-48dc-9b1f-4d36ed8b2fa8",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
  "phone": "+380660649352",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T13:16:17.947952Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T13:16:20.022297Z",
    "by": "b3948ea9-305c-4583-a362-0e821bbde242"
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
  "correlation_id": "69b7607a-04bb-4641-a190-a9fe6d437aa6"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660649352",
  "device_ref": "sandbox-26508"
}
```

```json
{
  "challenge_id": "409c4471-dd01-4e35-aa6a-5881ed1390c9",
  "expires_at": "2026-10-28T13:21:22.586695731Z",
  "resend_available_at": "2026-10-28T13:16:23.586695731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660649352` → **200**

```json
{
  "phone": "+380660649352",
  "audience": "CLIENT",
  "code": "583175",
  "sent_at": "2026-10-28T13:16:22.589203521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "409c4471-dd01-4e35-aa6a-5881ed1390c9",
  "code": "583175",
  "device_ref": "sandbox-26508"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "bc40781e-624c-4144-82d4-a8e0d3732c20"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/53397bfa-2d58-416a-9ad2-d4ec6ca1ed73` → **200**

```json
{
  "client": {
    "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
    "phone": "+380660649352",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T13:16:17.947952Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T13:16:20.022297Z",
      "by": "b3948ea9-305c-4583-a362-0e821bbde242"
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

`POST /api/admin/v1/clients/53397bfa-2d58-416a-9ad2-d4ec6ca1ed73/unblock` → **200**

```json
{
  "command_id": "b95c11ba-9c67-41c1-8099-9225aca531c4",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
  "phone": "+380660649352",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T13:16:17.947952Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660649352",
  "device_ref": "sandbox-27491"
}
```

```json
{
  "challenge_id": "a3f5e436-3e02-41b4-a190-347e78467f14",
  "expires_at": "2026-10-28T13:21:25.80957033Z",
  "resend_available_at": "2026-10-28T13:16:26.80957033Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660649352` → **200**

```json
{
  "phone": "+380660649352",
  "audience": "CLIENT",
  "code": "842390",
  "sent_at": "2026-10-28T13:16:25.812593434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3f5e436-3e02-41b4-a190-347e78467f14",
  "code": "842390",
  "device_ref": "sandbox-27491"
}
```

```json
{
  "session_id": "7f7a4c95-78fd-4614-846f-5454e1862196",
  "subject": {
    "type": "CLIENT",
    "id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MzM5N2JmYS0yZDU4LTQxNmEtOWFkMi1kNGVjNmNhMWVkNzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0Mjg2LCJpYXQiOjE3OTMxOTMzODYsImp0aSI6IjdjMDdiY2ExLTYwMjctNGQwNC04MzI0LWQ0M2M4M2I2OWJjMCIsInNpZCI6IjdmN2E0Yzk1LTc4ZmQtNDYxNC04NDZmLTU0NTRlMTg2MjE5NiJ9.MHjflAazjnkyxxcPi8kIbwuzmkGdJHdReXCabrUK8CY",
  "access_expires_at": "2026-10-28T13:31:26.120529699Z",
  "refresh_token": "anAdvUw5fe33udD2SisR2rOhM2m5PB1i4BONtpB9ziw",
  "refresh_expires_at": "2026-11-27T13:16:26.119905988Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "53397bfa-2d58-416a-9ad2-d4ec6ca1ed73",
  "session_id": "7f7a4c95-78fd-4614-846f-5454e1862196",
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
  "phone": "+380664583836",
  "device_ref": "sandbox-16793"
}
```

```json
{
  "challenge_id": "2c40c249-a00c-4571-ab72-1ce9e96d8bf8",
  "expires_at": "2026-10-28T13:21:26.682931386Z",
  "resend_available_at": "2026-10-28T13:16:27.682931386Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380664583836` → **200**

```json
{
  "phone": "+380664583836",
  "audience": "CLIENT",
  "code": "991248",
  "sent_at": "2026-10-28T13:16:26.685215631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c40c249-a00c-4571-ab72-1ce9e96d8bf8",
  "code": "991248",
  "device_ref": "sandbox-16793"
}
```

```json
{
  "session_id": "5d4e48f8-8090-4cf4-9eee-12687b185eaa",
  "subject": {
    "type": "CLIENT",
    "id": "b3428aed-e3ae-46f2-a513-8bf08d8d1466"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzQyOGFlZC1lM2FlLTQ2ZjItYTUxMy04YmYwOGQ4ZDE0NjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0Mjg2LCJpYXQiOjE3OTMxOTMzODYsImp0aSI6ImIyODllNzg5LWVhNzEtNGZkZi1iODBjLWFjMDRkMWIwMzIzNCIsInNpZCI6IjVkNGU0OGY4LTgwOTAtNGNmNC05ZWVlLTEyNjg3YjE4NWVhYSJ9.DDbcHN1ukK1VbHBY3aqMhjTyQn_KUF96EhENLVCNw2A",
  "access_expires_at": "2026-10-28T13:31:26.986694026Z",
  "refresh_token": "CkV5g3DCNilJ63JjkZZ6O7wmmHUntO-VdjeOKsYq4AA",
  "refresh_expires_at": "2026-11-27T13:16:26.985989249Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "27f32ccc-3df5-4c65-b899-ddc20b954866",
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
  "id": "3d311803-4c9f-4250-94f3-1e672c8f1093",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:27.275131Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: b02c7275-0ee9-4993-9acb-2a9be8367e36) → **201**

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
  "session_id": "c6e0cf4f-d03f-41cb-9fc8-28e2a4b97454",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyODcsImlhdCI6MTc5MzE5MzM4NywianRpIjoiMGJiMDIxZWUtNzRjZS00ZGFmLWEzMWUtMDAwYWRmYTI1OGU5Iiwic2lkIjoiYzZlMGNmNGYtZDAzZi00MWNiLTlmYzgtMjhlMmE0Yjk3NDU0In0.uHTbPwJxE9MMH64fPRa3kequsyZM5WOdGqmYlyZafck",
  "access_expires_at": "2026-10-28T13:31:27.907445467Z",
  "refresh_token": "gMfqDYCoccPualkPIrtv_i-_efEAzDoDbhSXZdPOLf4",
  "refresh_expires_at": "2026-10-29T01:16:27.906814162Z",
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
  "session_id": "e1c3fa2f-cacb-4220-9108-29e934933575",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQyODgsImlhdCI6MTc5MzE5MzM4OCwianRpIjoiYWE2N2YwOWYtZThkZC00NDVmLTlmNDEtYmVkNjgwZjVhYWQ3Iiwic2lkIjoiZTFjM2ZhMmYtY2FjYi00MjIwLTkxMDgtMjllOTM0OTMzNTc1In0.0dmxrNPSjM35bB3apSuV5893JCr5kDoXejhBjBM4VBI",
  "access_expires_at": "2026-10-28T13:31:28.509199934Z",
  "refresh_token": "1B4SEJXMMls5QjXt-SU2LCVYKnVnvPNGoe6wRIcBMwY",
  "refresh_expires_at": "2026-10-29T01:16:28.508435791Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0898bccc-46f1-4598-aca9-48d88a1f32c5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:16:27.573365Z",
      "actor": {
        "type": "CLIENT",
        "id": "b3428aed-e3ae-46f2-a513-8bf08d8d1466",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
        "quote_id": "3d311803-4c9f-4250-94f3-1e672c8f1093",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b02c7275-0ee9-4993-9acb-2a9be8367e36"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:16:27.575352Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
        "attempt_id": "3a3b8156-45ad-4333-9eea-f23d2fe2d8a0",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b02c7275-0ee9-4993-9acb-2a9be8367e36"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T13:16:27.585263Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
        "attempt_id": "3a3b8156-45ad-4333-9eea-f23d2fe2d8a0"
      },
      "correlation_id": "b02c7275-0ee9-4993-9acb-2a9be8367e36"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "3a3b8156-45ad-4333-9eea-f23d2fe2d8a0",
        "generation": 1,
        "started_at": "2026-10-28T13:16:27.574279Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T13:16:27.585263Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T13:16:27.576254Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/b02c7275-0ee9-4993-9acb-2a9be8367e36` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "0898bccc-46f1-4598-aca9-48d88a1f32c5:0",
      "order_id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
      "at": "2026-10-28T13:16:27.573365Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "0898bccc-46f1-4598-aca9-48d88a1f32c5:1",
      "order_id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
      "at": "2026-10-28T13:16:27.575352Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "0898bccc-46f1-4598-aca9-48d88a1f32c5:2",
      "order_id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
      "at": "2026-10-28T13:16:27.585263Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/2e80dfaa-2859-4c2d-ad6b-fc1835b348a6` → **200**

```json
{
  "found": []
}
```

Done: request b02c7275-0ee9-4993-9acb-2a9be8367e36 — order 0898bccc-46f1-4598-aca9-48d88a1f32c5 found by its id.

`GET /api/rider/v1/orders/0898bccc-46f1-4598-aca9-48d88a1f32c5` → **200**

```json
{
  "id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b3428aed-e3ae-46f2-a513-8bf08d8d1466",
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
  "created_at": "2026-10-28T13:16:27.572755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0898bccc-46f1-4598-aca9-48d88a1f32c5/cancel` → **200**

```json
{
  "command_id": "ef4fe573-f585-4f57-823e-bf778241839d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0898bccc-46f1-4598-aca9-48d88a1f32c5",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b3428aed-e3ae-46f2-a513-8bf08d8d1466",
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
  "created_at": "2026-10-28T13:16:27.572755Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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
  "phone": "+380636675763",
  "device_ref": "sandbox-18758"
}
```

```json
{
  "challenge_id": "4cac419b-afcf-42d5-940f-79215effc005",
  "expires_at": "2026-10-28T13:21:30.258339065Z",
  "resend_available_at": "2026-10-28T13:16:31.258339065Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636675763` → **200**

```json
{
  "phone": "+380636675763",
  "audience": "CLIENT",
  "code": "318968",
  "sent_at": "2026-10-28T13:16:30.261066203Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cac419b-afcf-42d5-940f-79215effc005",
  "code": "318968",
  "device_ref": "sandbox-18758"
}
```

```json
{
  "session_id": "ebd9648c-6335-4baa-9b02-84b3aefd549c",
  "subject": {
    "type": "CLIENT",
    "id": "6268d1ef-bb95-471f-80b7-ff5c2978e431"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjY4ZDFlZi1iYjk1LTQ3MWYtODBiNy1mZjVjMjk3OGU0MzEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MjkwLCJpYXQiOjE3OTMxOTMzOTAsImp0aSI6IjIxZTRkNzk3LTE2YTEtNDEyNi05NzJkLTA3YjdjMjU1NjFjNCIsInNpZCI6ImViZDk2NDhjLTYzMzUtNGJhYS05YjAyLTg0YjNhZWZkNTQ5YyJ9.PrKYREnzOLvhDhzvc2oHUAhOD8P5KWtwHl4rV5tw2CI",
  "access_expires_at": "2026-10-28T13:31:30.571108349Z",
  "refresh_token": "sKIuupGrZpgfHPYwggV4hGMWI3GZmdx6x24wKv3FW3M",
  "refresh_expires_at": "2026-11-27T13:16:30.570486301Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "1e380a40-712c-48ff-9f0c-7d8df6780c95",
  "expires_at": "2026-10-28T13:21:32.855871123Z",
  "resend_available_at": "2026-10-28T13:16:33.855871123Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636675763` → **200**

```json
{
  "phone": "+380636675763",
  "audience": "CLIENT",
  "code": "475971",
  "sent_at": "2026-10-28T13:16:32.857866597Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "5bd44b0a-f610-4ee4-a115-9946b58937dd",
  "challenge_id": "1e380a40-712c-48ff-9f0c-7d8df6780c95",
  "otp_code": "475971"
}
```

```json
{
  "id": "4ea028c9-785a-4829-baef-e1414908f50e",
  "state": "PENDING",
  "created_at": "2026-10-28T13:16:33.180189Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e` → **200**

```json
{
  "id": "4ea028c9-785a-4829-baef-e1414908f50e",
  "state": "PENDING",
  "created_at": "2026-10-28T13:16:33.180189Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e` → **200**

```json
{
  "id": "4ea028c9-785a-4829-baef-e1414908f50e",
  "state": "PENDING",
  "created_at": "2026-10-28T13:16:33.180189Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e` → **200**

```json
{
  "id": "4ea028c9-785a-4829-baef-e1414908f50e",
  "state": "PENDING",
  "created_at": "2026-10-28T13:16:33.180189Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e` → **200**

```json
{
  "id": "4ea028c9-785a-4829-baef-e1414908f50e",
  "state": "PENDING",
  "created_at": "2026-10-28T13:16:33.180189Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e` → **200**

```json
{
  "id": "4ea028c9-785a-4829-baef-e1414908f50e",
  "state": "READY",
  "created_at": "2026-10-28T13:16:33.180189Z",
  "ready_at": "2026-10-28T13:16:38.192783Z",
  "expires_at": "2026-11-04T13:16:38.192783Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639109121",
  "device_ref": "sandbox-26891"
}
```

```json
{
  "challenge_id": "86332a72-2173-490c-9002-63e788008e7f",
  "expires_at": "2026-10-28T13:21:38.892179246Z",
  "resend_available_at": "2026-10-28T13:16:39.892179246Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639109121` → **200**

```json
{
  "phone": "+380639109121",
  "audience": "CLIENT",
  "code": "414852",
  "sent_at": "2026-10-28T13:16:38.894789426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86332a72-2173-490c-9002-63e788008e7f",
  "code": "414852",
  "device_ref": "sandbox-26891"
}
```

```json
{
  "session_id": "ebb7044e-6169-4d2e-95df-4cd0d13a3841",
  "subject": {
    "type": "CLIENT",
    "id": "90f08c01-5ee7-496e-a2ab-5b0b6b59e210"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MGYwOGMwMS01ZWU3LTQ5NmUtYTJhYi01YjBiNmI1OWUyMTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0Mjk5LCJpYXQiOjE3OTMxOTMzOTksImp0aSI6ImFmYWE0MWEwLWU2NDMtNDZlMi04OGZjLTBkMTA3YWNjZTQ4MiIsInNpZCI6ImViYjcwNDRlLTYxNjktNGQyZS05NWRmLTRjZDBkMTNhMzg0MSJ9.56c2uu16-qusa0_AWSRBLtUmGAUe1yjwiQydGRod8Lc",
  "access_expires_at": "2026-10-28T13:31:39.202554666Z",
  "refresh_token": "ZdOAsLytEOq78D6e1TNBu_YpxZEO-cCEAqEXDWaGN4g",
  "refresh_expires_at": "2026-11-27T13:16:39.201979695Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/4ea028c9-785a-4829-baef-e1414908f50e/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "aa3f9086-d1b7-48d0-a9dd-4e334e99abd3"
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
  "session_id": "d338d57a-d6ac-4716-b70d-551279c9cc1e",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMDAsImlhdCI6MTc5MzE5MzQwMCwianRpIjoiMTIxMWZkMjItMjYwYS00NmU0LWE3NTgtNDg3MDA3ZmNmY2MyIiwic2lkIjoiZDMzOGQ1N2EtZDZhYy00NzE2LWI3MGQtNTUxMjc5YzljYzFlIn0.0QVKCVeB9YYjfPS_ZKW19cwORTn_ZlEIi4ax-0BRLW8",
  "access_expires_at": "2026-10-28T13:31:40.051479369Z",
  "refresh_token": "2De_ByWMipakNTkNEEkZ1Q_0KPUlU1P0HJ8k7c9Ez2I",
  "refresh_expires_at": "2026-10-29T01:16:40.050896264Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "6268d1ef-bb95-471f-80b7-ff5c2978e431",
  "session_id": "ebd9648c-6335-4baa-9b02-84b3aefd549c",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/6268d1ef-bb95-471f-80b7-ff5c2978e431/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "4ea028c9-785a-4829-baef-e1414908f50e",
      "state": "READY",
      "created_at": "2026-10-28T13:16:33.180189Z",
      "ready_at": "2026-10-28T13:16:38.192783Z",
      "expires_at": "2026-11-04T13:16:38.192783Z",
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
  "device_ref": "sandbox-13247"
}
```

```json
{
  "challenge_id": "e7a6cd2d-0a61-414a-9508-24bacf742426",
  "expires_at": "2026-10-28T13:21:40.890850996Z",
  "resend_available_at": "2026-10-28T13:16:41.890850996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "929855",
  "sent_at": "2026-10-28T13:16:40.893219069Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7a6cd2d-0a61-414a-9508-24bacf742426",
  "code": "929855",
  "device_ref": "sandbox-13247"
}
```

```json
{
  "session_id": "78c48ce3-f0e8-45e5-9e53-3701c1e09051",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDMwMSwiaWF0IjoxNzkzMTkzNDAxLCJqdGkiOiJhOWU4M2VhNi1jMDJiLTRmNGItYmUzOC0wZGVhMGVjNjdhMGYiLCJzaWQiOiI3OGM0OGNlMy1mMGU4LTQ1ZTUtOWU1My0zNzAxYzFlMDkwNTEifQ.NeLp_kVY2Bu4zw7u46YyVnmVUQ4_ukqJlZE0bZWk0sw",
  "access_expires_at": "2026-10-28T13:31:41.197602841Z",
  "refresh_token": "GhauskNAyxOKkolYzkWJCeHdycuTZPDCPFbZBDDt9gs",
  "refresh_expires_at": "2026-11-27T13:16:41.197051154Z",
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
  "device_ref": "sandbox-24124"
}
```

```json
{
  "challenge_id": "be939838-a74d-4206-9ea1-34d969c595ee",
  "expires_at": "2026-10-28T13:21:41.746276882Z",
  "resend_available_at": "2026-10-28T13:16:42.746276882Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "277060",
  "sent_at": "2026-10-28T13:16:41.748591161Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be939838-a74d-4206-9ea1-34d969c595ee",
  "code": "277060",
  "device_ref": "sandbox-24124"
}
```

```json
{
  "session_id": "583ba171-f565-4ad3-8ad4-caec8ad29c03",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDMwMiwiaWF0IjoxNzkzMTkzNDAyLCJqdGkiOiJiYmIxMGZhNy1kZDcxLTRjMTctYWNlMy1iNTVkNTdjYzJhNWMiLCJzaWQiOiI1ODNiYTE3MS1mNTY1LTRhZDMtOGFkNC1jYWVjOGFkMjljMDMifQ.yV8AL9L8njXs-iJgxCFGOmw7zBmCfLoljWc7opAeI6I",
  "access_expires_at": "2026-10-28T13:31:42.059902727Z",
  "refresh_token": "_TtKz2aULQB-u5YPOBacESmEWUB_9bkAZuRisnU75Wo",
  "refresh_expires_at": "2026-11-27T13:16:42.059097799Z",
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
  "command_id": "1a591803-3acb-4db1-8174-99eb89f7b851",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:16:42Z",
    "sequence": 1793193402613
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c418aa9f-957a-44f5-badc-0d2065a4302f",
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
  "last_heartbeat_at": "2026-10-28T13:16:42.633637Z",
  "last_location_at": "2026-10-28T13:16:42.633637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-3711"
}
```

```json
{
  "challenge_id": "76fff820-42e6-4e0a-b52c-13dd5fa8f16d",
  "expires_at": "2026-10-28T13:21:42.911351716Z",
  "resend_available_at": "2026-10-28T13:16:43.911351716Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "701866",
  "sent_at": "2026-10-28T13:16:42.916900466Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76fff820-42e6-4e0a-b52c-13dd5fa8f16d",
  "code": "701866",
  "device_ref": "sandbox-3711"
}
```

```json
{
  "session_id": "8698868b-e171-40f3-9e48-6ac122304afe",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDMwMywiaWF0IjoxNzkzMTkzNDAzLCJqdGkiOiIxODY0YWYyZC1iNjZhLTRjMzQtYmQzNi0yMDdjZGJjNzVjZjEiLCJzaWQiOiI4Njk4ODY4Yi1lMTcxLTQwZjMtOWU0OC02YWMxMjIzMDRhZmUifQ.iBGR_aHh4l_13twt26xZAYxZADXxX0Fzll_pWuwF4f8",
  "access_expires_at": "2026-10-28T13:31:43.220090606Z",
  "refresh_token": "84ZNiLseJHKWDJs3EctT0NmF9KkyhzOv4mCAo9pYSLI",
  "refresh_expires_at": "2026-11-27T13:16:43.219502277Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91d863a8-d529-43a4-8a86-6da722ed61c7",
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
  "last_heartbeat_at": "2026-10-28T13:15:35.021206Z",
  "last_location_at": "2026-10-28T13:15:35.021206Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/91d863a8-d529-43a4-8a86-6da722ed61c7/handover` → **200**

```json
{
  "command_id": "0b73a7bb-9336-4873-8c01-a71a87911da2",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91d863a8-d529-43a4-8a86-6da722ed61c7",
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
  "last_heartbeat_at": "2026-10-28T13:15:35.021206Z",
  "last_location_at": "2026-10-28T13:15:35.021206Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/91d863a8-d529-43a4-8a86-6da722ed61c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:16:44Z",
    "sequence": 1793193404706
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "91d863a8-d529-43a4-8a86-6da722ed61c7",
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
  "last_heartbeat_at": "2026-10-28T13:16:44.091606Z",
  "last_location_at": "2026-10-28T13:16:44.091606Z",
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
  "session_id": "6ddd554a-6706-46b0-ad79-d2e70541a545",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMDQsImlhdCI6MTc5MzE5MzQwNCwianRpIjoiYTI0MDk2MTItMjI2My00ZmY2LWIxMDUtY2JlNGYyZjkzNDZiIiwic2lkIjoiNmRkZDU1NGEtNjcwNi00NmIwLWFkNzktZDJlNzA1NDFhNTQ1In0.SEKOI9WpsGSLYNf_MlOgJVwdGePGWyRr5YcnNtw_07I",
  "access_expires_at": "2026-10-28T13:31:44.660731777Z",
  "refresh_token": "1dyNbHIIVtsjD2BUeevKpAGNE8JMTPT7YL70VJp1mbc",
  "refresh_expires_at": "2026-10-29T01:16:44.660021485Z",
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
  "session_id": "d498b5ad-f7a0-4a12-b7e9-e6af3fa4711c",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMDUsImlhdCI6MTc5MzE5MzQwNSwianRpIjoiYmJmNzA1ODAtNmQ0OS00MWEzLWE3MTMtNWRmOWZkYjYwMDI2Iiwic2lkIjoiZDQ5OGI1YWQtZjdhMC00YTEyLWI3ZTktZTZhZjNmYTQ3MTFjIn0.s4Yd4PJXpxCt1X3mHUKK1pksig-bRFW3G-L-r4k5ddY",
  "access_expires_at": "2026-10-28T13:31:45.229342475Z",
  "refresh_token": "aLnUf_d-nfL1UgSUT7bqyLwOAqNGA7HC8TPFGgLat04",
  "refresh_expires_at": "2026-10-29T01:16:45.228755351Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684989212",
  "device_ref": "sandbox-3504"
}
```

```json
{
  "challenge_id": "1667cacf-ad85-46ce-ba2b-b6e4ed276d55",
  "expires_at": "2026-10-28T13:21:45.511189891Z",
  "resend_available_at": "2026-10-28T13:16:46.511189891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380684989212` → **200**

```json
{
  "phone": "+380684989212",
  "audience": "CLIENT",
  "code": "840677",
  "sent_at": "2026-10-28T13:16:45.514649077Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1667cacf-ad85-46ce-ba2b-b6e4ed276d55",
  "code": "840677",
  "device_ref": "sandbox-3504"
}
```

```json
{
  "session_id": "38abd8ec-a746-4de9-afe2-f5be17bc0f71",
  "subject": {
    "type": "CLIENT",
    "id": "c37d982a-8f36-46be-9555-79aa81d8c8bf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjMzdkOTgyYS04ZjM2LTQ2YmUtOTU1NS03OWFhODFkOGM4YmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzA1LCJpYXQiOjE3OTMxOTM0MDUsImp0aSI6IjIyMjI1OGIwLWM3ODgtNGRjNi1iMjAzLTE4MWQwNDg3Zjk3MyIsInNpZCI6IjM4YWJkOGVjLWE3NDYtNGRlOS1hZmUyLWY1YmUxN2JjMGY3MSJ9.mBkTnA5X1QUv0sn0oavhGjVlbjWEWoSXFS6DlQbVtvM",
  "access_expires_at": "2026-10-28T13:31:45.819129704Z",
  "refresh_token": "yEFaKCGMZi2ynXuHMV708Y7YIjBYqSRN-A1bTGA5GA4",
  "refresh_expires_at": "2026-11-27T13:16:45.818335635Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "71afc95e-e94b-44f6-a9ef-ba4b43f2001c",
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
  "id": "9baa3b2d-efed-4cae-861d-c509d0c0b3d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:46.110578Z",
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
  "command_id": "c7645c99-f3c9-4f12-9d1e-525b6f085795",
  "quote_id": "9baa3b2d-efed-4cae-861d-c509d0c0b3d4",
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
  "id": "728b2e37-47e2-4658-8432-eea3a4640111",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c37d982a-8f36-46be-9555-79aa81d8c8bf",
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
  "created_at": "2026-10-28T13:16:46.404517Z",
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
    "id": "21beb652-ba20-41d6-a3e0-c930d6f387ed",
    "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
    "expires_at": "2026-10-28T13:17:01.407805Z",
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

`POST /api/driver/v1/offers/21beb652-ba20-41d6-a3e0-c930d6f387ed/reject` → **204**

```json
{
  "command_id": "ec1930a0-ccbd-4e80-aba4-63a00c2de485"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "4b3318d7-5bc7-44c9-817f-a8dcd03ae381",
    "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
    "expires_at": "2026-10-28T13:17:02.009006Z",
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

`POST /api/driver/v1/offers/4b3318d7-5bc7-44c9-817f-a8dcd03ae381/accept` → **200**

```json
{
  "command_id": "ebc29898-caeb-4e3d-88bb-d9ada13903b0"
}
```

```json
{
  "id": "4b736280-afe7-4b05-b971-f8a3274c37ee",
  "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4b02549f-cb00-4a84-b191-7ae4f82eaa50",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/728b2e37-47e2-4658-8432-eea3a4640111/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:16:46.405086Z",
      "actor": {
        "type": "CLIENT",
        "id": "c37d982a-8f36-46be-9555-79aa81d8c8bf",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
        "quote_id": "9baa3b2d-efed-4cae-861d-c509d0c0b3d4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "651e3700-2134-470c-a586-e81353ce7e75"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:16:46.406949Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
        "attempt_id": "b09f3bc3-ede9-4831-b0e9-aced8e267481",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "651e3700-2134-470c-a586-e81353ce7e75"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:16:46.413857Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "21beb652-ba20-41d6-a3e0-c930d6f387ed",
        "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "651e3700-2134-470c-a586-e81353ce7e75"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T13:16:47.007751Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "21beb652-ba20-41d6-a3e0-c930d6f387ed",
        "order_id": "728b2e37-47e2-4658-8432-eea3a4640111"
      },
      "correlation_id": "5da4980c-3d9a-4ba9-a48b-a0639f9d8854"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 728b2e37-47e2-4658-8432-eea3a4640111 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/728b2e37-47e2-4658-8432-eea3a4640111` → **200**

```json
{
  "id": "728b2e37-47e2-4658-8432-eea3a4640111",
  "short_number": 7,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "c37d982a-8f36-46be-9555-79aa81d8c8bf",
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
    "id": "4b736280-afe7-4b05-b971-f8a3274c37ee",
    "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4b02549f-cb00-4a84-b191-7ae4f82eaa50",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:16:46.404517Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/728b2e37-47e2-4658-8432-eea3a4640111/cancel` → **200**

```json
{
  "command_id": "fb57a2f5-8a84-493a-bf98-23b17ee20376",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "728b2e37-47e2-4658-8432-eea3a4640111",
  "short_number": 7,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c37d982a-8f36-46be-9555-79aa81d8c8bf",
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
    "id": "4b736280-afe7-4b05-b971-f8a3274c37ee",
    "order_id": "728b2e37-47e2-4658-8432-eea3a4640111",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4b02549f-cb00-4a84-b191-7ae4f82eaa50",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:16:46.404517Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
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
  "session_id": "c418aa9f-957a-44f5-badc-0d2065a4302f",
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
  "last_heartbeat_at": "2026-10-28T13:16:42.633637Z",
  "last_location_at": "2026-10-28T13:16:42.633637Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c418aa9f-957a-44f5-badc-0d2065a4302f/close` → **200**

```json
{
  "command_id": "c4a5a378-190c-411f-b4ca-36d1b1fb554f",
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
  "session_id": "91d863a8-d529-43a4-8a86-6da722ed61c7",
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
  "last_heartbeat_at": "2026-10-28T13:16:44.091606Z",
  "last_location_at": "2026-10-28T13:16:44.091606Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/91d863a8-d529-43a4-8a86-6da722ed61c7/close` → **200**

```json
{
  "command_id": "499af316-87da-484b-ab97-4a96a084dfd1",
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
  "device_ref": "sandbox-20668"
}
```

```json
{
  "challenge_id": "eb13d289-be86-4806-9958-c422cc094e64",
  "expires_at": "2026-10-28T13:21:50.014124765Z",
  "resend_available_at": "2026-10-28T13:16:51.014124765Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "953992",
  "sent_at": "2026-10-28T13:16:50.017058237Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "eb13d289-be86-4806-9958-c422cc094e64",
  "code": "953992",
  "device_ref": "sandbox-20668"
}
```

```json
{
  "session_id": "d60ac3c2-5fed-47ef-9414-e6c6225c52b5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDMxMCwiaWF0IjoxNzkzMTkzNDEwLCJqdGkiOiJhNzg0OTZmNi00NTgxLTRjZjctYjE4Mi1mMzU5ZTI1MWZlMTAiLCJzaWQiOiJkNjBhYzNjMi01ZmVkLTQ3ZWYtOTQxNC1lNmM2MjI1YzUyYjUifQ.0VHU3dkL6ytaCcVO9uRcj02g1TvoLqT6OQ6M9vf2n6M",
  "access_expires_at": "2026-10-28T13:31:50.324438112Z",
  "refresh_token": "-DGKnOgP65UHSHP3lWci2sSqTc6GyXC92b3g1Vj_cDE",
  "refresh_expires_at": "2026-11-27T13:16:50.323562631Z",
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
  "command_id": "f05adcf6-e9c5-40d7-a813-b285c93ec568",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:16:50Z",
    "sequence": 1793193410873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:16:50.89347Z",
  "last_location_at": "2026-10-28T13:16:50.89347Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672595909",
  "device_ref": "sandbox-20275"
}
```

```json
{
  "challenge_id": "13d9c340-5245-44c6-baaf-94e4b760e351",
  "expires_at": "2026-10-28T13:21:51.183626481Z",
  "resend_available_at": "2026-10-28T13:16:52.183626481Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672595909` → **200**

```json
{
  "phone": "+380672595909",
  "audience": "CLIENT",
  "code": "901876",
  "sent_at": "2026-10-28T13:16:51.18613298Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "13d9c340-5245-44c6-baaf-94e4b760e351",
  "code": "901876",
  "device_ref": "sandbox-20275"
}
```

```json
{
  "session_id": "4b1a6b65-e59c-4410-9847-8461db98c9ef",
  "subject": {
    "type": "CLIENT",
    "id": "8f578573-7d1a-4b06-9c3b-410f6236d5b9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjU3ODU3My03ZDFhLTRiMDYtOWMzYi00MTBmNjIzNmQ1YjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzExLCJpYXQiOjE3OTMxOTM0MTEsImp0aSI6IjI3MGEwZTI3LTMxMTYtNDRkMy04ZjAzLWIwNjI1NmU0YTZjMCIsInNpZCI6IjRiMWE2YjY1LWU1OWMtNDQxMC05ODQ3LTg0NjFkYjk4YzllZiJ9.pIRtOIat8t821zsCKveH7gR2iFzg9Znxrh3YjW9u7IQ",
  "access_expires_at": "2026-10-28T13:31:51.4888947Z",
  "refresh_token": "6Os-gFWhnKJn9kogjNjW8K4brdjcnZ_eUcJus3A4hS8",
  "refresh_expires_at": "2026-11-27T13:16:51.488240495Z",
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
  "command_id": "f8342e4c-62fd-41a0-aca6-65410f8483da",
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
  "id": "e5ae41db-b824-4677-afd9-08a5984a0247",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:21:52.056658Z",
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
  "command_id": "94de54ee-4e09-4807-9c2f-3f914684a2cf",
  "platform": "ANDROID",
  "token": "sandbox-driver-3edf9ba7-fddc-4ec8-bc64-2e155c2542eb"
}
```

```json
{
  "id": "8233d3e7-e979-45d2-bcbb-b243efe858b8",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:16:52.35872Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "54ee5732-8e7c-412c-96ea-4e1bbc60d123",
  "platform": "ANDROID",
  "token": "sandbox-rider-984b5e73-d732-4bf6-9770-a8c9066f87cf"
}
```

```json
{
  "id": "c4b0ee4a-ea72-413e-b163-0e30b93573fa",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T13:16:52.6372Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "96f47d8b-704b-466c-93a2-90ab5b9c37f0",
  "quote_id": "e5ae41db-b824-4677-afd9-08a5984a0247",
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
  "id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f578573-7d1a-4b06-9c3b-410f6236d5b9",
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
  "created_at": "2026-10-28T13:16:52.92557Z",
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
    "id": "f502f944-32fd-486a-bf85-8c2bc8477369",
    "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
    "expires_at": "2026-10-28T13:17:07.930181Z",
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

`POST /api/driver/v1/offers/f502f944-32fd-486a-bf85-8c2bc8477369/accept` → **200**

```json
{
  "command_id": "adefe0cb-1173-4008-af3c-01afeb921121"
}
```

```json
{
  "id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T13:16:52.899Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:16:53.496437198Z",
    "token_suffix": "2542eb",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
      "order_version": "2",
      "event_id": "6992e529-fdeb-4200-83d8-a8bff9acf484"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672595909&after=2026-10-28T13:16:52.899Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380672595909&after=2026-10-28T13:16:52.899Z` → **200**

```json
[
  {
    "at": "2026-10-28T13:16:54.500997464Z",
    "token_suffix": "6f87cf",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
      "order_version": "3",
      "event_id": "8b8d8c63-d46d-4b2b-a825-e03339476fc0"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/6574a47f-800d-4690-8515-65e56acd31f0/messages` → **201**

```json
{
  "command_id": "32f0da73-31c3-43a2-a7f5-bd8c8e6fbf46",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "f3380c32-b724-4c74-9adf-cf622393e839",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T13:16:54.908885647Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "assignment_id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
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

`POST /api/driver/v1/trips/50afcb8c-f4f8-4dcc-a7e5-de975a0f9980/messages` → **201**

```json
{
  "command_id": "38fe05c8-9fe1-49b0-afa1-ca0e729bf263",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "ce3314ab-d53d-4e1c-a8ef-0a7d803ad276",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T13:16:55.457936551Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/6574a47f-800d-4690-8515-65e56acd31f0/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/50afcb8c-f4f8-4dcc-a7e5-de975a0f9980/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672595909"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:16:56Z",
    "sequence": 1793193416307
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:16:56.327684Z",
  "last_location_at": "2026-10-28T13:16:56.327684Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "assignment_id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
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

`POST /api/driver/v1/trips/50afcb8c-f4f8-4dcc-a7e5-de975a0f9980/arrive` → **200**

```json
{
  "command_id": "1b9ceb7e-b9a3-404a-9438-c3e8cc044f9e",
  "expected_version": 0
}
```

```json
{
  "id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "assignment_id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
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
  "arrived_at": "2026-10-28T13:16:56.881786Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/50afcb8c-f4f8-4dcc-a7e5-de975a0f9980/start` → **200**

```json
{
  "command_id": "386e242d-d348-477e-bda0-dd57e8297466",
  "expected_version": 1
}
```

```json
{
  "id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "assignment_id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
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
  "arrived_at": "2026-10-28T13:16:56.881786Z",
  "started_at": "2026-10-28T13:16:57.185644Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:16:57Z",
    "sequence": 1793193417486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:16:57.507875Z",
  "last_location_at": "2026-10-28T13:16:57.507875Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/50afcb8c-f4f8-4dcc-a7e5-de975a0f9980/complete` → **200**

```json
{
  "command_id": "3e28c74e-fe00-411a-a9e5-7b241b9e65a4",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:16:57Z",
  "cash_received": true
}
```

```json
{
  "id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "assignment_id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
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
  "arrived_at": "2026-10-28T13:16:56.881786Z",
  "started_at": "2026-10-28T13:16:57.185644Z",
  "completed_at": "2026-10-28T13:16:57.796264Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/6574a47f-800d-4690-8515-65e56acd31f0` → **200**

```json
{
  "id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "short_number": 8,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8f578573-7d1a-4b06-9c3b-410f6236d5b9",
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
    "id": "8fbe1694-2269-4abd-8f65-2a877d5397b1",
    "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:16:52.92557Z",
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
    "id": "6574a47f-800d-4690-8515-65e56acd31f0",
    "short_number": 8,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:16:52.92557Z",
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
    "id": "50afcb8c-f4f8-4dcc-a7e5-de975a0f9980",
    "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
    "order_short_number": 8,
    "created_at": "2026-10-28T13:16:53.524612Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "30270e23-0a90-48bd-a00f-fcd429e96fd1",
    "order_id": "29bd9f5e-92bb-45b7-8f42-bc3b24c4d66d",
    "order_short_number": 1,
    "created_at": "2026-10-28T13:15:13.605833Z",
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

`GET /api/rider/v1/orders/6574a47f-800d-4690-8515-65e56acd31f0/tip` → **200**

```json
{
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
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
  "available_until": "2026-10-29T13:16:57.796264Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/6574a47f-800d-4690-8515-65e56acd31f0/tip` → **201**

```json
{
  "command_id": "ab6b2b32-b6dc-4f8d-856b-48a8241b59db",
  "amount_minor": 1100
}
```

```json
{
  "id": "1cbd7272-e226-4c4e-bdbd-d9cbe443cd85",
  "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T13:17:02.796222Z"
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
  "session_id": "edd7457c-c090-4800-b2c8-381fa1ed1768",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMjMsImlhdCI6MTc5MzE5MzQyMywianRpIjoiNjQ3YmRkMzgtMWZmZS00OTc0LTg4ZjItOWUzMzBhMjcyODViIiwic2lkIjoiZWRkNzQ1N2MtYzA5MC00ODAwLWIyYzgtMzgxZmExZWQxNzY4In0.fn_XTmX6XT-Xwik-CKCdt071YVyXmVLbnYriZaNGQtU",
  "access_expires_at": "2026-10-28T13:32:03.385704306Z",
  "refresh_token": "cAt3pq8oxAg5PPQFGX1sk6n7pe9-o0WUopaDvtVajRs",
  "refresh_expires_at": "2026-10-29T01:17:03.384879862Z",
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
        "created": 8,
        "fulfilled": 4,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 8
        },
        "by_payment": {
          "CASH": 7,
          "CARD": 1
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 2
        }
      }
    }
  ],
  "total": {
    "created": 8,
    "fulfilled": 4,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 8
    },
    "by_payment": {
      "CASH": 7,
      "CARD": 1
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 1,
      "RIDER": 2
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
  "generated_at": "2026-10-28T13:17:03.671124637Z"
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
        "trips": 4,
        "fares_minor": 53628,
        "service_rides_minor": 0,
        "commission_minor": 8046,
        "driver_share_minor": 45582,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 16297,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 17982,
        "tips_minor": 5000,
        "rider_debt_change_minor": 0
      }
    }
  ],
  "total": {
    "trips": 4,
    "fares_minor": 53628,
    "service_rides_minor": 0,
    "commission_minor": 8046,
    "driver_share_minor": 45582,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 16297,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 17982,
    "tips_minor": 5000,
    "rider_debt_change_minor": 0
  },
  "generated_at": "2026-10-28T13:17:03.964599634Z"
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
  "session_id": "99a1b90d-2990-467b-b8e9-9f0f696a21fa",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMjQsImlhdCI6MTc5MzE5MzQyNCwianRpIjoiYmFhMWRiODMtZDgyMS00YjNhLTkxZmItNjk4YjQxOWIxOWRiIiwic2lkIjoiOTlhMWI5MGQtMjk5MC00NjdiLWI4ZTktOWYwZjY5NmEyMWZhIn0.8BLJ__UT5pNg4FeFALKPNFOmTT96Qal7-63IVz4wT8Y",
  "access_expires_at": "2026-10-28T13:32:04.559121822Z",
  "refresh_token": "og9PXOL1H7lZW27qIS5HRXTx_QlK7JkmoUNK9Sj-_vw",
  "refresh_expires_at": "2026-10-29T01:17:04.558514251Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/6574a47f-800d-4690-8515-65e56acd31f0/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:16:52.926367Z",
      "actor": {
        "type": "CLIENT",
        "id": "8f578573-7d1a-4b06-9c3b-410f6236d5b9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
        "quote_id": "e5ae41db-b824-4677-afd9-08a5984a0247",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "aa951aa1-c981-4412-af6a-233a0caf27bf"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:16:52.929156Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
        "attempt_id": "4fc67617-388f-4819-b38a-11eaaaf3df6b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "aa951aa1-c981-4412-af6a-233a0caf27bf"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:16:52.933383Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f502f944-32fd-486a-bf85-8c2bc8477369",
        "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "aa951aa1-c981-4412-af6a-233a0caf27bf"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:16:53.526403Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f502f944-32fd-486a-bf85-8c2bc8477369",
        "order_id": "6574a47f-800d-4690-8515-65e56acd31f0",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "8fbe1694-2269-4abd-8f65-2a877d5397b1"
      },
      "correlation_id": "851accdc-112a-4e44-a025-16b884959e50"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T13:17:05.13249694Z",
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
      "last_location_at": "2026-10-28T13:16:57.507875Z",
      "order_id": null
    }
  ]
}
```

Done: order 6574a47f-800d-4690-8515-65e56acd31f0.

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
  "session_id": "eadc2d4d-3585-4e9b-9526-5572440543d6",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMjUsImlhdCI6MTc5MzE5MzQyNSwianRpIjoiM2ZiMWU5OGQtMjdlMS00NGIyLWE1NWQtYWUxMzI0NzRmMTc3Iiwic2lkIjoiZWFkYzJkNGQtMzU4NS00ZTliLTk1MjYtNTU3MjQ0MDU0M2Q2In0.vwFDVN34hKoxUD70uycmStp2DLxgLLw_yYUICAyY--c",
  "access_expires_at": "2026-10-28T13:32:05.737326919Z",
  "refresh_token": "HpbGYiKkyoP26YQUQF_H9MYfgN89D9VdJ93wf7RxSuw",
  "refresh_expires_at": "2026-10-29T01:17:05.736728094Z",
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
  "command_id": "6f1c4c08-7ff0-4645-b95b-b4e989a9a893",
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
  "timestamp": "2026-10-28T13:17:06.000+0000",
  "channel": {
    "id": "1730052000.196119186",
    "linkedid": "1730052000.196119186",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679862813"
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
  "timestamp": "2026-10-28T13:17:06.000+0000",
  "channel": {
    "id": "1730052000.196119186",
    "linkedid": "1730052000.196119186",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679862813"
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
  "session_id": "968161f0-bd08-4eb7-afe2-2d6fe61f48e9",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMjYsImlhdCI6MTc5MzE5MzQyNiwianRpIjoiZDExMzU0OWUtODQwZi00NWFhLWI3ZWQtYWFlNDg4OGFlYWNiIiwic2lkIjoiOTY4MTYxZjAtYmQwOC00ZWI3LWFmZTItMmQ2ZmU2MWY0OGU5In0.iem7S3fk77J2rn3Pc4liHpfRck2Jzeiuzoh9tqnhUXA",
  "access_expires_at": "2026-10-28T13:32:06.917035675Z",
  "refresh_token": "VpneNWmelUGPIyimkoOjt34-_8cwl9tq6Vo1WlrfJJw",
  "refresh_expires_at": "2026-10-29T01:17:06.916436239Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "ba43d987-bb58-42bf-b75a-5773dfd87c36",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679862813",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:17:06Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/ba43d987-bb58-42bf-b75a-5773dfd87c36/answer` → **200**

```json
{
  "command_id": "2a1f466a-1181-4e77-a971-0dbb037cca8d"
}
```

```json
{
  "id": "ba43d987-bb58-42bf-b75a-5773dfd87c36",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679862813",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "order_ids": [],
  "started_at": "2026-10-28T13:17:06Z",
  "answered_at": "2026-10-28T13:17:07.498954Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.196119186",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "16de0cce-62d2-4351-97be-9d3656ac02ea",
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
  "id": "d35fb0d9-dc81-4b98-b639-e7d8fa9c77e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:07.835677Z",
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
  "command_id": "259cd782-f312-4bba-84ff-cf5306b34b52",
  "quote_id": "d35fb0d9-dc81-4b98-b639-e7d8fa9c77e4",
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
    "phone": "+380679862813"
  },
  "call_id": "ba43d987-bb58-42bf-b75a-5773dfd87c36"
}
```

```json
{
  "id": "5600dbc0-994e-467f-864d-c00ccf0139ba",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:17:08.149914Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679862813"
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
    "id": "1730052000.196119186",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ba43d987-bb58-42bf-b75a-5773dfd87c36",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679862813",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [
        "5600dbc0-994e-467f-864d-c00ccf0139ba"
      ],
      "started_at": "2026-10-28T13:17:06Z",
      "answered_at": "2026-10-28T13:17:07.498954Z",
      "ended_at": "2026-10-28T13:17:08.465253Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "b697cf84-81dc-4ece-ac5f-d0fbe6b7a8a6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671320136",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [],
      "started_at": "2026-10-28T13:15:21.738596Z",
      "answered_at": "2026-10-28T13:15:22.062899Z",
      "ended_at": "2026-10-28T13:15:22.383318Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:15:28.174593Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/5600dbc0-994e-467f-864d-c00ccf0139ba` → **200**

```json
{
  "id": "5600dbc0-994e-467f-864d-c00ccf0139ba",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:17:08.149914Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679862813"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/5600dbc0-994e-467f-864d-c00ccf0139ba` → **200**

```json
{
  "id": "5600dbc0-994e-467f-864d-c00ccf0139ba",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:17:08.149914Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679862813"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5600dbc0-994e-467f-864d-c00ccf0139ba/cancel` → **200**

```json
{
  "command_id": "e0238917-aa07-4477-83af-42724e47d15d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5600dbc0-994e-467f-864d-c00ccf0139ba",
  "short_number": 9,
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
  "created_at": "2026-10-28T13:17:08.149914Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679862813"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call ba43d987-bb58-42bf-b75a-5773dfd87c36 with order 5600dbc0-994e-467f-864d-c00ccf0139ba.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10477"
}
```

```json
{
  "challenge_id": "23a786b6-0f98-4d5f-bebc-f99083d94bcd",
  "expires_at": "2026-10-28T13:22:09.718373876Z",
  "resend_available_at": "2026-10-28T13:17:10.718373876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "790399",
  "sent_at": "2026-10-28T13:17:09.721019165Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23a786b6-0f98-4d5f-bebc-f99083d94bcd",
  "code": "790399",
  "device_ref": "sandbox-10477"
}
```

```json
{
  "session_id": "7ea4ed72-c847-48e4-a5d3-9b75d65c41b1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDMzMCwiaWF0IjoxNzkzMTkzNDMwLCJqdGkiOiJlZDdjNjFlZS04ODUzLTQwN2QtODVlYS1mODdmZTJlMWFhZmQiLCJzaWQiOiI3ZWE0ZWQ3Mi1jODQ3LTQ4ZTQtYTVkMy05Yjc1ZDY1YzQxYjEifQ.QY-VxvJCUHKKV6edfcBFXrc24UEEDxVLuT_CGpO5ui4",
  "access_expires_at": "2026-10-28T13:32:10.029901054Z",
  "refresh_token": "ZFe3opjSSL6BkgROLpuOPPFITSNEicIEWNgcEE2gDEI",
  "refresh_expires_at": "2026-11-27T13:17:10.029290788Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:16:57.507875Z",
  "last_location_at": "2026-10-28T13:16:57.507875Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/handover` → **200**

```json
{
  "command_id": "5258f641-3e2d-4b31-bcf7-8c001857671a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:16:57.507875Z",
  "last_location_at": "2026-10-28T13:16:57.507875Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:10Z",
    "sequence": 1793193430872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:17:10.893128Z",
  "last_location_at": "2026-10-28T13:17:10.893128Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380663022215",
  "device_ref": "sandbox-30041"
}
```

```json
{
  "challenge_id": "e0c5e9cd-97b0-4eb1-b0b9-6396d6af4733",
  "expires_at": "2026-10-28T13:22:11.161164319Z",
  "resend_available_at": "2026-10-28T13:17:12.161164319Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663022215` → **200**

```json
{
  "phone": "+380663022215",
  "audience": "CLIENT",
  "code": "472150",
  "sent_at": "2026-10-28T13:17:11.163285659Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e0c5e9cd-97b0-4eb1-b0b9-6396d6af4733",
  "code": "472150",
  "device_ref": "sandbox-30041"
}
```

```json
{
  "session_id": "161e15cf-48ed-4fc8-93fa-63cdf194e708",
  "subject": {
    "type": "CLIENT",
    "id": "1a6b562d-2a9b-4f64-820f-a127e6874b30"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYTZiNTYyZC0yYTliLTRmNjQtODIwZi1hMTI3ZTY4NzRiMzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzMxLCJpYXQiOjE3OTMxOTM0MzEsImp0aSI6Ijc5NTA1ZDhmLTQ1NmUtNGUzYy1iMTc0LTlkMDBkZDU2NTlkNiIsInNpZCI6IjE2MWUxNWNmLTQ4ZWQtNGZjOC05M2ZhLTYzY2RmMTk0ZTcwOCJ9.HWXnD41tLhBwaTm5MSI9v3-2bpOjHkS-VE-ZSoZ_4zw",
  "access_expires_at": "2026-10-28T13:32:11.459474137Z",
  "refresh_token": "XxdnMxQxi5tYsr8KzCq76N7rqZvstLWFBdLwfZc-XMs",
  "refresh_expires_at": "2026-11-27T13:17:11.458834247Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d981dc72-143d-4450-9e57-67830dc58827",
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
  "id": "576890b9-fd2f-472c-8cdf-7dc8c03dc006",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:11.755404Z",
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
  "command_id": "8780aa30-78d2-4871-85e0-5d0f1209c932",
  "quote_id": "576890b9-fd2f-472c-8cdf-7dc8c03dc006",
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
  "id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1a6b562d-2a9b-4f64-820f-a127e6874b30",
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
  "created_at": "2026-10-28T13:17:12.046415Z",
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
    "id": "1b0bd586-7412-418d-ac0e-3165ff8d00de",
    "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
    "expires_at": "2026-10-28T13:17:27.049938Z",
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

`POST /api/driver/v1/offers/1b0bd586-7412-418d-ac0e-3165ff8d00de/accept` → **200**

```json
{
  "command_id": "e041e280-0c5c-4b47-9c07-36fc8c120e5c"
}
```

```json
{
  "id": "57184b72-61ab-45da-9b9c-a49abc9d01a8",
  "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe",
  "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
  "assignment_id": "57184b72-61ab-45da-9b9c-a49abc9d01a8",
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

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:13Z",
    "sequence": 1793193433159
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:17:13.180883Z",
  "last_location_at": "2026-10-28T13:17:13.180883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe/arrive` → **200**

```json
{
  "command_id": "40079758-df95-4e8f-94ab-9146e817e991",
  "expected_version": 0
}
```

```json
{
  "id": "5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe",
  "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
  "assignment_id": "57184b72-61ab-45da-9b9c-a49abc9d01a8",
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
  "arrived_at": "2026-10-28T13:17:13.471211Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe/start` → **200**

```json
{
  "command_id": "02a65469-5fe2-494c-a2ad-f4dc22b4b874",
  "expected_version": 1
}
```

```json
{
  "id": "5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe",
  "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
  "assignment_id": "57184b72-61ab-45da-9b9c-a49abc9d01a8",
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
  "arrived_at": "2026-10-28T13:17:13.471211Z",
  "started_at": "2026-10-28T13:17:13.767306Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:14Z",
    "sequence": 1793193434522
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:17:14.07192Z",
  "last_location_at": "2026-10-28T13:17:14.07192Z",
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
  "device_ref": "sandbox-21531"
}
```

```json
{
  "challenge_id": "084cd035-9871-4e9d-a2ed-4d2c4a4b9126",
  "expires_at": "2026-10-28T13:22:14.353004685Z",
  "resend_available_at": "2026-10-28T13:17:15.353004685Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "435625",
  "sent_at": "2026-10-28T13:17:14.355496082Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "084cd035-9871-4e9d-a2ed-4d2c4a4b9126",
  "code": "435625",
  "device_ref": "sandbox-21531"
}
```

```json
{
  "session_id": "20399325-6e3e-44e5-9a17-c325664a12ca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDMzNCwiaWF0IjoxNzkzMTkzNDM0LCJqdGkiOiJjNTRhNjE5NC0wZDMyLTQyYzMtOWQwNS1iYjAwMjJhMGUwN2IiLCJzaWQiOiIyMDM5OTMyNS02ZTNlLTQ0ZTUtOWExNy1jMzI1NjY0YTEyY2EifQ.k-OGWrnjwjr0pfFMmv3KrjVL7H9kokTSy9kgMnH_nnU",
  "access_expires_at": "2026-10-28T13:32:14.666994805Z",
  "refresh_token": "j-HDUhJ8JAUWfvkZM9BO64dJ0-Z2Pkc5gBYMb0ZilXM",
  "refresh_expires_at": "2026-11-27T13:17:14.666377356Z",
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
  "command_id": "deb14523-11c0-4e53-9b3e-b26ccfaee82e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:15Z",
    "sequence": 1793193435223
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c75205fe-b133-4103-a110-0c940e578cab",
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
  "last_heartbeat_at": "2026-10-28T13:17:15.243231Z",
  "last_location_at": "2026-10-28T13:17:15.243231Z",
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
  "session_id": "48b4841e-ddc9-4437-af24-bf749af53ca7",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMzUsImlhdCI6MTc5MzE5MzQzNSwianRpIjoiYzlhNGM1OWItYWRlNC00NTEwLThhZTMtOGUzNGYyOWRiY2I5Iiwic2lkIjoiNDhiNDg0MWUtZGRjOS00NDM3LWFmMjQtYmY3NDlhZjUzY2E3In0.CuGoDYoPRF6_0lxDc-Vrw05GG-ZxXrg2XhCBz2UIliI",
  "access_expires_at": "2026-10-28T13:32:15.817935028Z",
  "refresh_token": "_T9AMtwnzb0D1MHQ8AH2sv-Q-ppyX90flEjhBw7fxmI",
  "refresh_expires_at": "2026-10-29T01:17:15.817309373Z",
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
  "session_id": "d65253ff-05fc-4a5f-92ef-725d97a7b76c",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzMzYsImlhdCI6MTc5MzE5MzQzNiwianRpIjoiZDExOGJhMGQtYmY4MC00MjkwLThhZmEtZjQ5YTc3ZTcxMzg3Iiwic2lkIjoiZDY1MjUzZmYtMDVmYy00YTVmLTkyZWYtNzI1ZDk3YTdiNzZjIn0.w-Lt1uKQoqJpqPSc0-xqTzbC7YDMbfFhwykauCYmXNc",
  "access_expires_at": "2026-10-28T13:32:16.40329851Z",
  "refresh_token": "p3S3e80ffhf5tM9PfFKh0bs8N_uf4DCWRxwpzNqCFc4",
  "refresh_expires_at": "2026-10-29T01:17:16.402677965Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1ca8de67-1669-4436-a7ac-aec8320686cf` → **200**

```json
{
  "id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
  "short_number": 10,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "1a6b562d-2a9b-4f64-820f-a127e6874b30",
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
    "id": "57184b72-61ab-45da-9b9c-a49abc9d01a8",
    "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T13:17:12.046415Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1ca8de67-1669-4436-a7ac-aec8320686cf/interrupt` → **200**

```json
{
  "command_id": "8f70205e-fbb0-42db-b434-13bec85735a5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
    "short_number": 10,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "1a6b562d-2a9b-4f64-820f-a127e6874b30",
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
      "id": "57184b72-61ab-45da-9b9c-a49abc9d01a8",
      "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "5f049bec-2aab-45f6-aea7-5b2b3bfcb7fe",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T13:17:12.046415Z",
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
    "id": "49a09cc3-241c-43b1-842a-470ded584f06",
    "short_number": 11,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "1a6b562d-2a9b-4f64-820f-a127e6874b30",
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
    "id": "1d64b3ec-0e4c-483d-a3df-c81eedefbd8b",
    "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
    "expires_at": "2026-10-28T13:17:31.994031Z",
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

`POST /api/driver/v1/offers/1d64b3ec-0e4c-483d-a3df-c81eedefbd8b/accept` → **200**

```json
{
  "command_id": "96d2622f-4030-49b5-8ad5-2d12f5cb1c3a"
}
```

```json
{
  "id": "f21eac22-1abd-4b2b-b3e7-dee7dd1109f0",
  "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3c4dbd8c-b332-4002-a760-858c19bb6c0f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3c4dbd8c-b332-4002-a760-858c19bb6c0f",
  "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
  "assignment_id": "f21eac22-1abd-4b2b-b3e7-dee7dd1109f0",
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
  "session_id": "c75205fe-b133-4103-a110-0c940e578cab",
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
  "last_heartbeat_at": "2026-10-28T13:17:15.243231Z",
  "last_location_at": "2026-10-28T13:17:15.243231Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/c75205fe-b133-4103-a110-0c940e578cab/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:18Z",
    "sequence": 1793193438453
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "c75205fe-b133-4103-a110-0c940e578cab",
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
  "last_heartbeat_at": "2026-10-28T13:17:18.473911Z",
  "last_location_at": "2026-10-28T13:17:18.473911Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3c4dbd8c-b332-4002-a760-858c19bb6c0f/arrive` → **200**

```json
{
  "command_id": "b5323303-91b5-462b-9a91-d4cc31036120",
  "expected_version": 0
}
```

```json
{
  "id": "3c4dbd8c-b332-4002-a760-858c19bb6c0f",
  "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
  "assignment_id": "f21eac22-1abd-4b2b-b3e7-dee7dd1109f0",
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
  "arrived_at": "2026-10-28T13:17:18.767116Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c4dbd8c-b332-4002-a760-858c19bb6c0f/start` → **200**

```json
{
  "command_id": "030ed27e-e5a5-42c6-9dfb-5707ab6fd3b5",
  "expected_version": 1
}
```

```json
{
  "id": "3c4dbd8c-b332-4002-a760-858c19bb6c0f",
  "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
  "assignment_id": "f21eac22-1abd-4b2b-b3e7-dee7dd1109f0",
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
  "arrived_at": "2026-10-28T13:17:18.767116Z",
  "started_at": "2026-10-28T13:17:19.077921Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3c4dbd8c-b332-4002-a760-858c19bb6c0f/complete` → **200**

```json
{
  "command_id": "a509d9c2-6620-4db2-991d-242583502549",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:17:19Z"
}
```

```json
{
  "id": "3c4dbd8c-b332-4002-a760-858c19bb6c0f",
  "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
  "assignment_id": "f21eac22-1abd-4b2b-b3e7-dee7dd1109f0",
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
  "arrived_at": "2026-10-28T13:17:18.767116Z",
  "started_at": "2026-10-28T13:17:19.077921Z",
  "completed_at": "2026-10-28T13:17:19.420576Z",
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
    "id": "49a09cc3-241c-43b1-842a-470ded584f06",
    "short_number": 11,
    "status": "FULFILLED",
    "created_at": "2026-10-28T13:17:16.98402Z",
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
    "id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
    "short_number": 10,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:17:12.046415Z",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/1ca8de67-1669-4436-a7ac-aec8320686cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:17:12.046976Z",
      "actor": {
        "type": "CLIENT",
        "id": "1a6b562d-2a9b-4f64-820f-a127e6874b30",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
        "quote_id": "576890b9-fd2f-472c-8cdf-7dc8c03dc006",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "d9a32a73-4a08-4c0b-b964-0afb8bb27fc6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:17:12.04905Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
        "attempt_id": "0314cc28-2570-4e5a-96c1-f0c21188d997",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d9a32a73-4a08-4c0b-b964-0afb8bb27fc6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:17:12.052202Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1b0bd586-7412-418d-ac0e-3165ff8d00de",
        "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "d9a32a73-4a08-4c0b-b964-0afb8bb27fc6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T13:17:12.623574Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "1b0bd586-7412-418d-ac0e-3165ff8d00de",
        "order_id": "1ca8de67-1669-4436-a7ac-aec8320686cf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "57184b72-61ab-45da-9b9c-a49abc9d01a8"
      },
      "correlation_id": "e7764450-b218-4011-a6ce-66350f1708c4"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/49a09cc3-241c-43b1-842a-470ded584f06/tip` → **200**

```json
{
  "order_id": "49a09cc3-241c-43b1-842a-470ded584f06",
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
  "available_until": "2026-10-29T13:17:19.420576Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/49a09cc3-241c-43b1-842a-470ded584f06/tip` → **409**

```json
{
  "command_id": "2a99f1b2-029b-436f-adfc-dc96d760f27b",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/49a09cc3-241c-43b1-842a-470ded584f06/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5e8727dc-9fcd-49c8-b5dc-881467f6f064"
}
```

Done: interrupted 1ca8de67-1669-4436-a7ac-aec8320686cf, follow-up 49a09cc3-241c-43b1-842a-470ded584f06.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8ca3635b-f432-4ca0-b546-ed59534f49dd",
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
  "last_heartbeat_at": "2026-10-28T13:17:14.07192Z",
  "last_location_at": "2026-10-28T13:17:14.07192Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8ca3635b-f432-4ca0-b546-ed59534f49dd/close` → **200**

```json
{
  "command_id": "17572efe-2f6c-4a33-8600-8bca8b94d68d",
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
  "session_id": "c75205fe-b133-4103-a110-0c940e578cab",
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
  "last_heartbeat_at": "2026-10-28T13:17:18.473911Z",
  "last_location_at": "2026-10-28T13:17:18.473911Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c75205fe-b133-4103-a110-0c940e578cab/close` → **200**

```json
{
  "command_id": "fc4204f9-ff79-404b-b2f8-fce004a9429a",
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
  "session_id": "131ce61c-f782-4590-89bf-5f4794166879",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzNDUsImlhdCI6MTc5MzE5MzQ0NSwianRpIjoiZWMxYmU4NjgtNDViZS00MDVjLWEwNWItZmE5ZTFmZDg3YjJiIiwic2lkIjoiMTMxY2U2MWMtZjc4Mi00NTkwLTg5YmYtNWY0Nzk0MTY2ODc5In0.WUCGrPOXobykc7LJ-wCkvbfB-KrsStpRlvYXyztKREs",
  "access_expires_at": "2026-10-28T13:32:25.639537414Z",
  "refresh_token": "u6FlshlAmvqmOCHozfvLzSVY1vRkfumDhMAilweafV0",
  "refresh_expires_at": "2026-10-29T01:17:25.638966576Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "9710e7c2-3ced-4a6a-9fc8-e6a21d0d3cf8",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:17:25Z"
}
```

```json
{
  "id": "480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:17:25Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/480f43cf-6a69-48a7-b2cd-96bbb6f3b76f/publish` → **200**

```json
{
  "command_id": "8cac3309-6dd2-4d45-a11e-7d4fe398e0d8",
  "expected_version": 0
}
```

```json
{
  "id": "480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:17:26.256071Z",
  "published_at": "2026-10-28T13:17:26.256071Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T13:17:26.256071Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638191933",
  "device_ref": "sandbox-30506"
}
```

```json
{
  "challenge_id": "d311ec68-d635-4a43-aae9-3926b2370112",
  "expires_at": "2026-10-28T13:22:26.829120963Z",
  "resend_available_at": "2026-10-28T13:17:27.829120963Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638191933` → **200**

```json
{
  "phone": "+380638191933",
  "audience": "CLIENT",
  "code": "300380",
  "sent_at": "2026-10-28T13:17:26.831519248Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d311ec68-d635-4a43-aae9-3926b2370112",
  "code": "300380",
  "device_ref": "sandbox-30506"
}
```

```json
{
  "session_id": "1ec68329-3046-4b0c-af7c-23bbb6e27dc9",
  "subject": {
    "type": "CLIENT",
    "id": "6841ab53-7450-4e60-b35a-db35102d61da"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ODQxYWI1My03NDUwLTRlNjAtYjM1YS1kYjM1MTAyZDYxZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzQ3LCJpYXQiOjE3OTMxOTM0NDcsImp0aSI6ImI2NmE2MmFlLWQ2ZDctNDE0OS1iZmJkLWIzYzBkZjM1MjI4ZiIsInNpZCI6IjFlYzY4MzI5LTMwNDYtNGIwYy1hZjdjLTIzYmJiNmUyN2RjOSJ9.kqPfHdq0957gai915UtopNzPDeIdxNJVm9Oc3xy4mSQ",
  "access_expires_at": "2026-10-28T13:32:27.140604923Z",
  "refresh_token": "gRJ_5XCLDqsjUt8zZPYnI1RarZFWABLFwSwJvb-pNuQ",
  "refresh_expires_at": "2026-11-27T13:17:27.140021136Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T13:17:26.256071Z",
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
  "command_id": "5d283789-ac55-41fa-b3ac-65be38c2de8c",
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
  "id": "1781b3e0-6a49-4219-a161-6a5634f9928f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:27.703833Z",
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
  "command_id": "3ed60f57-a80b-4b30-a973-b47d45611981",
  "quote_id": "1781b3e0-6a49-4219-a161-6a5634f9928f",
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
  "correlation_id": "6d6432b1-d009-4ef8-8424-ea93c112124b"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "8ae6ecf0-ba98-4892-ae3f-f68d659125ad",
  "version_id": "480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
  "language": "uk"
}
```

```json
{
  "version_id": "480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T13:17:28.301311Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "975ff02f-3401-4f6a-80b2-e506041c6f40",
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
  "id": "ebb8c00d-eb15-42d5-9deb-74f73c20fa45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:28.583742Z",
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
  "command_id": "836bf4fc-2294-4e46-908d-27b7eeba6133",
  "quote_id": "ebb8c00d-eb15-42d5-9deb-74f73c20fa45",
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
  "id": "44e33a4e-0d77-415d-bd26-41007cf8c7d7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6841ab53-7450-4e60-b35a-db35102d61da",
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
  "created_at": "2026-10-28T13:17:28.876368Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/44e33a4e-0d77-415d-bd26-41007cf8c7d7` → **200**

```json
{
  "id": "44e33a4e-0d77-415d-bd26-41007cf8c7d7",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6841ab53-7450-4e60-b35a-db35102d61da",
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
  "created_at": "2026-10-28T13:17:28.876368Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/44e33a4e-0d77-415d-bd26-41007cf8c7d7/cancel` → **200**

```json
{
  "command_id": "bd19da89-995c-4feb-9d90-7c8d462815e6",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "44e33a4e-0d77-415d-bd26-41007cf8c7d7",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6841ab53-7450-4e60-b35a-db35102d61da",
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
  "created_at": "2026-10-28T13:17:28.876368Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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

`POST /api/admin/v1/legal-documents/480f43cf-6a69-48a7-b2cd-96bbb6f3b76f` → **409**

```json
{
  "command_id": "6132a2f7-9f97-4a21-8cef-7cc5749a6ab4",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T13:17:29Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/480f43cf-6a69-48a7-b2cd-96bbb6f3b76f",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c2819112-69eb-4c55-a566-df570988c124"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a65be63f-3497-4ed1-8407-71b2f6a581c5",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:17:30Z"
}
```

```json
{
  "id": "2c5b87a9-6568-493e-a6c0-5e7885926be7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:17:30Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/2c5b87a9-6568-493e-a6c0-5e7885926be7/publish` → **200**

```json
{
  "command_id": "c6db9d70-8b5e-4a82-8787-874da8d5f882",
  "expected_version": 0
}
```

```json
{
  "id": "2c5b87a9-6568-493e-a6c0-5e7885926be7",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T13:17:30.393579Z",
  "published_at": "2026-10-28T13:17:30.393579Z",
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
  "device_ref": "sandbox-11495"
}
```

```json
{
  "challenge_id": "b229fce5-2b30-4288-ace2-ba300b8f0112",
  "expires_at": "2026-10-28T13:22:30.684739434Z",
  "resend_available_at": "2026-10-28T13:17:31.684739434Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "178995",
  "sent_at": "2026-10-28T13:17:30.686951388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b229fce5-2b30-4288-ace2-ba300b8f0112",
  "code": "178995",
  "device_ref": "sandbox-11495"
}
```

```json
{
  "session_id": "e825df0f-5e48-4568-9ff2-fab4a7eed477",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDM1MCwiaWF0IjoxNzkzMTkzNDUwLCJqdGkiOiIxNzU2YjFmNy0yYjEyLTQwZWYtOGYyMy05ODFiZWQ2YjljNGIiLCJzaWQiOiJlODI1ZGYwZi01ZTQ4LTQ1NjgtOWZmMi1mYWI0YTdlZWQ0NzcifQ.JTd0E1bhn4cph6OthOlOlTvrOPoysKRumRW_5hFHzus",
  "access_expires_at": "2026-10-28T13:32:30.990114467Z",
  "refresh_token": "2HG-F_u6cxFNSjCBDCBIkNaud2hvdBpIq9P9XNGLxX0",
  "refresh_expires_at": "2026-11-27T13:17:30.989502238Z",
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
  "command_id": "510c0595-092b-4c54-9eba-9a9bfbd71e61",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:31Z",
    "sequence": 1793193451538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "6fc2ce5c-8fb1-4a38-afdb-6af2fc721a2b",
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
  "last_heartbeat_at": "2026-10-28T13:17:31.557528Z",
  "last_location_at": "2026-10-28T13:17:31.557528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677777898",
  "device_ref": "sandbox-29133"
}
```

```json
{
  "challenge_id": "c6880017-1623-4c2d-831a-3aac5c56a32b",
  "expires_at": "2026-10-28T13:22:31.849934117Z",
  "resend_available_at": "2026-10-28T13:17:32.849934117Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677777898` → **200**

```json
{
  "phone": "+380677777898",
  "audience": "CLIENT",
  "code": "036739",
  "sent_at": "2026-10-28T13:17:31.852350536Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6880017-1623-4c2d-831a-3aac5c56a32b",
  "code": "036739",
  "device_ref": "sandbox-29133"
}
```

```json
{
  "session_id": "83c2fc28-f89a-488b-80fb-ea4271a4743d",
  "subject": {
    "type": "CLIENT",
    "id": "ac828482-4b57-4cde-97fb-f6519581c491"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzgyODQ4Mi00YjU3LTRjZGUtOTdmYi1mNjUxOTU4MWM0OTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzUyLCJpYXQiOjE3OTMxOTM0NTIsImp0aSI6IjM1MTllOTljLTFhM2ItNGE0MC1hNzExLWVmMmNiZTM3ZDRlNiIsInNpZCI6IjgzYzJmYzI4LWY4OWEtNDg4Yi04MGZiLWVhNDI3MWE0NzQzZCJ9.ZzvHpr-3COAZnqW79tOMg6Z97KalYmpeHRls4b6YWuw",
  "access_expires_at": "2026-10-28T13:32:32.170183981Z",
  "refresh_token": "LMlTlBTludrD3X3eMQuNPBo_zxihojZW16PtVmuIrRY",
  "refresh_expires_at": "2026-11-27T13:17:32.169544458Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4f0b3668-1689-4f4c-81f1-97faa9a0da26",
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
  "id": "bce223e9-5778-4bee-a9fd-84fea6c243fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:32.457288Z",
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
  "command_id": "e5007348-e2c5-419c-8cdb-d1c1c9861b44",
  "quote_id": "bce223e9-5778-4bee-a9fd-84fea6c243fc",
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
    "phone": "+380676946076"
  }
}
```

```json
{
  "id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:32.771942Z",
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
    "id": "8f750757-1835-43c5-b4cb-e6446846feb9",
    "order_id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
    "expires_at": "2026-10-28T13:17:47.776378Z",
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

`POST /api/driver/v1/offers/8f750757-1835-43c5-b4cb-e6446846feb9/accept` → **200**

```json
{
  "command_id": "b40757c4-a490-45fc-9abe-4e0a2c260734"
}
```

```json
{
  "id": "bd428b0b-03f2-4081-b6eb-85abcf8547cc",
  "order_id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "307376f6-6c0d-45d6-bfac-dea85c80bce0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "307376f6-6c0d-45d6-bfac-dea85c80bce0",
  "order_id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
  "assignment_id": "bd428b0b-03f2-4081-b6eb-85abcf8547cc",
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
    "phone": "+380676946076"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b8766d09-ef61-418a-a882-70ff983700e2",
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
  "id": "d132d932-5b80-455f-bbba-fe463df84957",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:33.935255Z",
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
  "command_id": "8607f3cf-1afb-4cd8-bbf3-b42bd9d06680",
  "quote_id": "d132d932-5b80-455f-bbba-fe463df84957",
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
  "id": "e58782c8-4007-4dd3-a309-f61bd9adc319",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.224727Z",
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
  "command_id": "3c383fe0-c909-4e99-89dc-24adc707b2de",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T16:17:34Z"
}
```

```json
{
  "id": "e3b8e5b5-7cd6-46f0-875a-a73ebac8b103",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:34.534492Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:17:34Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "e82fab74-0761-4fbb-b5db-473557b9f026",
  "quote_id": "e3b8e5b5-7cd6-46f0-875a-a73ebac8b103",
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
  "pickup_at": "2026-10-28T16:17:34Z"
}
```

```json
{
  "id": "481a8ea8-fab8-44e4-8fc0-c97f08887360",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.848986Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:17:34Z",
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
  "command_id": "4985c85a-d579-43c0-952c-b86bae58a1e7",
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
  "id": "00c0d128-6f3d-4779-9695-459c82e6b9d0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:35.159642Z",
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
  "command_id": "ea32becb-002b-4638-a53c-a3dd04f67e90",
  "quote_id": "00c0d128-6f3d-4779-9695-459c82e6b9d0",
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
  "correlation_id": "90544907-9a62-4663-bbe3-97817d6617f0"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "481a8ea8-fab8-44e4-8fc0-c97f08887360",
      "short_number": 15,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
      "created_at": "2026-10-28T13:17:34.848986Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T16:17:34Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "e58782c8-4007-4dd3-a309-f61bd9adc319",
      "short_number": 14,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
      "created_at": "2026-10-28T13:17:34.224727Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
      "short_number": 13,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "e58782c8-4007-4dd3-a309-f61bd9adc319",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.224727Z",
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

`GET /api/rider/v1/orders/cf11ec21-4442-4e3f-876d-d828afc711c2` → **200**

```json
{
  "id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
  "short_number": 13,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
    "id": "bd428b0b-03f2-4081-b6eb-85abcf8547cc",
    "order_id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "307376f6-6c0d-45d6-bfac-dea85c80bce0",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T13:17:32.771942Z",
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
    "location_at": "2026-10-28T13:17:31.557528Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/cf11ec21-4442-4e3f-876d-d828afc711c2/cancel` → **200**

```json
{
  "command_id": "1c886a9e-2a68-4743-9ef7-79a736f8ed22",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
    "id": "bd428b0b-03f2-4081-b6eb-85abcf8547cc",
    "order_id": "cf11ec21-4442-4e3f-876d-d828afc711c2",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "307376f6-6c0d-45d6-bfac-dea85c80bce0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:17:32.771942Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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

`GET /api/rider/v1/orders/e58782c8-4007-4dd3-a309-f61bd9adc319` → **200**

```json
{
  "id": "e58782c8-4007-4dd3-a309-f61bd9adc319",
  "short_number": 14,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.224727Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e58782c8-4007-4dd3-a309-f61bd9adc319/cancel` → **200**

```json
{
  "command_id": "fc80cc01-8ac2-40c4-92d8-a6fadcbe3371",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e58782c8-4007-4dd3-a309-f61bd9adc319",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.224727Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
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

`GET /api/rider/v1/orders/481a8ea8-fab8-44e4-8fc0-c97f08887360` → **200**

```json
{
  "id": "481a8ea8-fab8-44e4-8fc0-c97f08887360",
  "short_number": 15,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.848986Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:17:34Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/481a8ea8-fab8-44e4-8fc0-c97f08887360/cancel` → **200**

```json
{
  "command_id": "bf742de8-2483-45ac-a0a5-9c8466a7551d",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "481a8ea8-fab8-44e4-8fc0-c97f08887360",
  "short_number": 15,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ac828482-4b57-4cde-97fb-f6519581c491",
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
  "created_at": "2026-10-28T13:17:34.848986Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów"
    }
  },
  "pickup_at": "2026-10-28T16:17:34Z",
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
  "session_id": "6fc2ce5c-8fb1-4a38-afdb-6af2fc721a2b",
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
  "last_heartbeat_at": "2026-10-28T13:17:31.557528Z",
  "last_location_at": "2026-10-28T13:17:31.557528Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6fc2ce5c-8fb1-4a38-afdb-6af2fc721a2b/close` → **200**

```json
{
  "command_id": "b1ac2d49-c96b-4602-9e9c-ea65e502dea5",
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

Done: orders cf11ec21-4442-4e3f-876d-d828afc711c2, e58782c8-4007-4dd3-a309-f61bd9adc319, 481a8ea8-fab8-44e4-8fc0-c97f08887360.

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
  "session_id": "a0ebae2d-2d9c-4ef8-96b3-3def2d63364c",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzNTksImlhdCI6MTc5MzE5MzQ1OSwianRpIjoiYjg4Y2M4MDktNTAzOS00NzU4LThmNmMtZTBhM2Q1ZDNjYTI1Iiwic2lkIjoiYTBlYmFlMmQtMmQ5Yy00ZWY4LTk2YjMtM2RlZjJkNjMzNjRjIn0.UUU9QRS-yhXXPpbLGBfXXHBQ3wMhB2GcxE7GvhrNKQQ",
  "access_expires_at": "2026-10-28T13:32:39.046566827Z",
  "refresh_token": "0zATpNs3UT3KMabAtWHhSv7r0LuMkJPWJAgVQymRMDA",
  "refresh_expires_at": "2026-10-29T01:17:39.045854054Z",
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
  "session_id": "4831d7d6-5342-42b6-931f-c123604998c5",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzNTksImlhdCI6MTc5MzE5MzQ1OSwianRpIjoiNmZiNDRiM2ItODA5Ny00Y2I0LWJlNGItYTBhOGUwNDVmZmQxIiwic2lkIjoiNDgzMWQ3ZDYtNTM0Mi00MmI2LTkzMWYtYzEyMzYwNDk5OGM1In0.41Szu5tGC7qUtGvuLoCHWsIyKse8N5DJifLlBeAnNxY",
  "access_expires_at": "2026-10-28T13:32:39.636533398Z",
  "refresh_token": "LYG1vl8-vxzX6hY-m157n6tjtmPbyhLlj2pOYQyhwYc",
  "refresh_expires_at": "2026-10-29T01:17:39.635971622Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6568"
}
```

```json
{
  "challenge_id": "0f115683-2320-4d47-a032-21a5a9a110cc",
  "expires_at": "2026-10-28T13:22:39.915711099Z",
  "resend_available_at": "2026-10-28T13:17:40.915711099Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "496607",
  "sent_at": "2026-10-28T13:17:39.918363678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0f115683-2320-4d47-a032-21a5a9a110cc",
  "code": "496607",
  "device_ref": "sandbox-6568"
}
```

```json
{
  "session_id": "c969bbcb-a824-470c-ac1d-7c433b366503",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDM2MCwiaWF0IjoxNzkzMTkzNDYwLCJqdGkiOiI0MmE5MjNkYi1hOTc4LTRiMmYtYWNiMC0yZjhkMTEzNTE3YjkiLCJzaWQiOiJjOTY5YmJjYi1hODI0LTQ3MGMtYWMxZC03YzQzM2IzNjY1MDMifQ._4yodhzUH-paD1NqWLqdSMORaTgZP1yJ4f15G07yIbg",
  "access_expires_at": "2026-10-28T13:32:40.23252125Z",
  "refresh_token": "-30RqVb1vnd5rlowB3R5fPL1-VIGEwClSA4h8j4m3Lo",
  "refresh_expires_at": "2026-11-27T13:17:40.231965265Z",
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
  "command_id": "5e78d039-ef8b-4fe5-9921-af8c887d2827",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:40Z",
    "sequence": 1793193460775
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a668371-bd16-4a3e-ba41-c703a24ef456",
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
  "last_heartbeat_at": "2026-10-28T13:17:40.794849Z",
  "last_location_at": "2026-10-28T13:17:40.794849Z",
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
  "command_id": "1ff1c223-ef52-453e-92bc-6b25d2f623a0",
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
  "effective_at": "2026-10-28T13:17:41.377572Z",
  "changed_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T13:17:41.656471701Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1f6b2b22-a4c4-44db-855e-90aef718a83b",
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
  "id": "1fc68afa-6559-4f5e-9bf9-cc2f36f5165a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:41.939306Z",
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
  "command_id": "aa1f5f6a-60b4-4fff-bb2a-9be4c4803819",
  "quote_id": "1fc68afa-6559-4f5e-9bf9-cc2f36f5165a",
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
    "phone": "+3806711124696"
  }
}
```

```json
{
  "id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
  "short_number": 16,
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
  "created_at": "2026-10-28T13:17:42.231124Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124696"
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
    "id": "9472c4cc-c085-46d4-98e5-565c64287fcc",
    "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
    "expires_at": "2026-10-28T13:17:57.234842Z",
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

`POST /api/driver/v1/offers/9472c4cc-c085-46d4-98e5-565c64287fcc/accept` → **200**

```json
{
  "command_id": "c53dab74-d0b0-4617-870c-220a528769ef"
}
```

```json
{
  "id": "5390777b-1ae2-445a-b799-672fddd2bc26",
  "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6f1ee2ac-7692-423a-aacf-c0f0dc16987a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6f1ee2ac-7692-423a-aacf-c0f0dc16987a",
  "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
  "assignment_id": "5390777b-1ae2-445a-b799-672fddd2bc26",
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
    "phone": "+3806711124696"
  }
}
```

`POST /api/driver/v1/work-sessions/0a668371-bd16-4a3e-ba41-c703a24ef456/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:17:43Z",
    "sequence": 1793193463358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a668371-bd16-4a3e-ba41-c703a24ef456",
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
  "last_heartbeat_at": "2026-10-28T13:17:43.378177Z",
  "last_location_at": "2026-10-28T13:17:43.378177Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6f1ee2ac-7692-423a-aacf-c0f0dc16987a/arrive` → **200**

```json
{
  "command_id": "8ce785b6-a0c4-415d-b3e8-2505f6b9a348",
  "expected_version": 0
}
```

```json
{
  "id": "6f1ee2ac-7692-423a-aacf-c0f0dc16987a",
  "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
  "assignment_id": "5390777b-1ae2-445a-b799-672fddd2bc26",
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
  "arrived_at": "2026-10-28T13:17:43.669035Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124696"
  }
}
```

`POST /api/driver/v1/trips/6f1ee2ac-7692-423a-aacf-c0f0dc16987a/start` → **200**

```json
{
  "command_id": "2afc8d40-d89a-4711-b0a8-8f86d3a63815",
  "expected_version": 1
}
```

```json
{
  "id": "6f1ee2ac-7692-423a-aacf-c0f0dc16987a",
  "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
  "assignment_id": "5390777b-1ae2-445a-b799-672fddd2bc26",
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
  "arrived_at": "2026-10-28T13:17:43.669035Z",
  "started_at": "2026-10-28T13:17:43.962579Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711124696"
  }
}
```

`POST /api/driver/v1/trips/6f1ee2ac-7692-423a-aacf-c0f0dc16987a/complete` → **200**

```json
{
  "command_id": "84e37a3a-2a93-43d4-a9ce-2d293d7aab61",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:17:44Z",
  "cash_received": true
}
```

```json
{
  "id": "6f1ee2ac-7692-423a-aacf-c0f0dc16987a",
  "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
  "assignment_id": "5390777b-1ae2-445a-b799-672fddd2bc26",
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
  "arrived_at": "2026-10-28T13:17:43.669035Z",
  "started_at": "2026-10-28T13:17:43.962579Z",
  "completed_at": "2026-10-28T13:17:44.261751Z",
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
  "command_id": "2402b1bd-31c5-4974-baf8-c71a310634fa",
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
  "id": "5e1afd46-8bbb-425b-9d7e-b1fb04d5110e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:44.565357Z",
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
  "command_id": "43539c25-3855-4a76-bf7c-dc5a11486e18",
  "quote_id": "5e1afd46-8bbb-425b-9d7e-b1fb04d5110e",
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
    "phone": "+3806711124492"
  }
}
```

```json
{
  "id": "423e9727-fab6-416c-91ab-79f7ec661377",
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
  "created_at": "2026-10-28T13:17:44.865296Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124492"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/423e9727-fab6-416c-91ab-79f7ec661377` → **200**

```json
{
  "id": "423e9727-fab6-416c-91ab-79f7ec661377",
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
  "created_at": "2026-10-28T13:17:44.865296Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124492"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/423e9727-fab6-416c-91ab-79f7ec661377/cancel` → **200**

```json
{
  "command_id": "ed384765-d3f9-47d1-9569-cc4a5c4905c7",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "423e9727-fab6-416c-91ab-79f7ec661377",
  "short_number": 17,
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
  "created_at": "2026-10-28T13:17:44.865296Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711124492"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora"
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
  "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T13:17:44.268339Z",
  "last_entries": [
    {
      "order_id": "423e9727-fab6-416c-91ab-79f7ec661377",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T13:17:45.478499Z"
    },
    {
      "order_id": "ba50449a-03a5-4c67-b71a-88e048d60a1c",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T13:17:44.268339Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0a668371-bd16-4a3e-ba41-c703a24ef456",
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
  "last_heartbeat_at": "2026-10-28T13:17:43.378177Z",
  "last_location_at": "2026-10-28T13:17:43.378177Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a668371-bd16-4a3e-ba41-c703a24ef456/close` → **200**

```json
{
  "command_id": "b8b9b881-167c-465f-bd28-6853f8bcf319",
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

Done: operator bonus for fulfilled ba50449a-03a5-4c67-b71a-88e048d60a1c and operator-fault cancellation 423e9727-fab6-416c-91ab-79f7ec661377.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671084481",
  "device_ref": "sandbox-2216"
}
```

```json
{
  "challenge_id": "3386b98d-6e69-461e-93cb-cc88762c3f73",
  "expires_at": "2026-10-28T13:22:48.662445872Z",
  "resend_available_at": "2026-10-28T13:17:49.662445872Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671084481` → **200**

```json
{
  "phone": "+380671084481",
  "audience": "CLIENT",
  "code": "251183",
  "sent_at": "2026-10-28T13:17:48.664810231Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677958702",
  "device_ref": "sandbox-23951",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "59581088-f698-4cf4-b570-1fe0a958929e",
  "expires_at": "2026-10-28T13:22:48.971977776Z",
  "resend_available_at": "2026-10-28T13:17:49.971977776Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677958702` → **200**

```json
{
  "phone": "+380677958702",
  "audience": "CLIENT",
  "code": "541640",
  "sent_at": "2026-10-28T13:17:48.974591623Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671720000",
  "device_ref": "sandbox-23107"
}
```

```json
{
  "challenge_id": "fb9eec52-b528-436b-914d-1c4c62ba9bde",
  "expires_at": "2026-10-28T13:22:49.274224111Z",
  "resend_available_at": "2026-10-28T13:17:50.274224111Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380671720000` → **200**

```json
{
  "phone": "+380671720000",
  "audience": "CLIENT",
  "code": "927459",
  "sent_at": "2026-10-28T13:17:49.277183821Z",
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
  "session_id": "c7db7c50-f250-4ce2-9f83-3e6e6e3cf476",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzNjksImlhdCI6MTc5MzE5MzQ2OSwianRpIjoiYTc3MjJjYzgtNmIyYy00Y2QwLTllODUtN2JlZTdiMTkxODhmIiwic2lkIjoiYzdkYjdjNTAtZjI1MC00Y2UyLTlmODMtM2U2ZTZlM2NmNDc2In0.YThCh06Ls3dAUJoUrLoPrymt1Y_n799YQ0D7OJ4OZIs",
  "access_expires_at": "2026-10-28T13:32:49.880485047Z",
  "refresh_token": "RLqkjmSnZSzSlSc9n1vGJzdK8edp-jJ5mAcpHQ2NLQM",
  "refresh_expires_at": "2026-10-29T01:17:49.879853301Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380671720000` → **200**

```json
{
  "deliveries": [
    {
      "id": "510b102c-dd9f-436f-8db1-03b48489a9e9",
      "challenge_id": "fb9eec52-b528-436b-914d-1c4c62ba9bde",
      "phone": "+380671720000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-98105089-fe42-4e7b-a363-ebaa2fb6f742",
      "error": null,
      "attempted_at": "2026-10-28T13:17:49.277465Z"
    },
    {
      "id": "41c49a49-ed0f-43e4-b306-fe6f85706b46",
      "challenge_id": "fb9eec52-b528-436b-914d-1c4c62ba9bde",
      "phone": "+380671720000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T13:17:49.276662Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380671720000` → **200**

```json
{
  "phone": "+380671720000",
  "audience": "CLIENT",
  "code": "927459",
  "sent_at": "2026-10-28T13:17:49.277183821Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677958702` → **200**

```json
{
  "deliveries": [
    {
      "id": "a8abc616-5588-4438-8140-aa8b261c1369",
      "challenge_id": "59581088-f698-4cf4-b570-1fe0a958929e",
      "phone": "+380677958702",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b562fb0a-0454-4520-9ffb-39788e6978fc",
      "error": null,
      "attempted_at": "2026-10-28T13:17:48.97493Z"
    }
  ]
}
```

Done: SMS to +380671084481, a call to +380677958702, SMS then a call to +380671720000.

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
  "session_id": "92b2d4b3-95af-4e15-85b7-69c0a26ddca6",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzNzEsImlhdCI6MTc5MzE5MzQ3MSwianRpIjoiOTBlNjFkNGMtZjlhZC00MDY1LTkxYTAtNDA0ZWZhMTlkNzNiIiwic2lkIjoiOTJiMmQ0YjMtOTVhZi00ZTE1LTg1YjctNjljMGEyNmRkY2E2In0.hY9E-pNMUNsWT_TQ1jIIaUvJVU6IwalUQH3DDD5e5eM",
  "access_expires_at": "2026-10-28T13:32:51.08011372Z",
  "refresh_token": "IFHDSThGFKu6Vll3q9g0cmQl1ceoh-q0Mhsz89_7YQE",
  "refresh_expires_at": "2026-10-29T01:17:51.07949079Z",
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
  "session_id": "df5e5056-b314-4bad-9e2f-a51057af09d4",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzNzEsImlhdCI6MTc5MzE5MzQ3MSwianRpIjoiOTA5YWUzMzYtMzMwYS00NzAzLThhMjgtMmZhNzlmZjM0Y2M0Iiwic2lkIjoiZGY1ZTUwNTYtYjMxNC00YmFkLTllMmYtYTUxMDU3YWYwOWQ0In0.MGstT0NKeAACawWmVMB5wBxNI4Euyif7aMpVUIDhx9o",
  "access_expires_at": "2026-10-28T13:32:51.656440417Z",
  "refresh_token": "B_Z70O2DVDMsbbqBs_kqLIp-RERm7S837q0Mo0DUWdw",
  "refresh_expires_at": "2026-10-29T01:17:51.655790817Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b3948ea9-305c-4583-a362-0e821bbde242",
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

`POST /api/admin/v1/staff-extensions/b3948ea9-305c-4583-a362-0e821bbde242` → **200**

```json
{
  "command_id": "c8e9ec11-b662-4f3f-b9b9-8201064ff43b",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b3948ea9-305c-4583-a362-0e821bbde242",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "a42e209f-2076-430a-9c39-08d3dd8ab558",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:17:52.772801Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T13:17:52.772801Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a37ceec6-7f4e-4f2e-a181-ed978ef1c3aa",
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
  "id": "f4628f49-a0a2-414d-856c-7cc297f3746a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:22:53.333817Z",
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
  "command_id": "37d0f027-801c-47bc-b978-5615f4ac85c9",
  "quote_id": "f4628f49-a0a2-414d-856c-7cc297f3746a",
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
    "phone": "+380673491865"
  }
}
```

```json
{
  "id": "1997490e-ff12-4802-aa4e-806d99ab9ec0",
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
  "created_at": "2026-10-28T13:17:53.615637Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673491865"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/1997490e-ff12-4802-aa4e-806d99ab9ec0/calls` → **201**

```json
{
  "command_id": "24078e0e-676a-4e9f-bf9f-e77de6cb7687",
  "to": "CALLER"
}
```

```json
{
  "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "order_ids": [
    "1997490e-ff12-4802-aa4e-806d99ab9ec0"
  ],
  "started_at": "2026-10-28T13:17:53.926166Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/1997490e-ff12-4802-aa4e-806d99ab9ec0/calls` → **201**

```json
{
  "command_id": "24078e0e-676a-4e9f-bf9f-e77de6cb7687",
  "to": "CALLER"
}
```

```json
{
  "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "order_ids": [
    "1997490e-ff12-4802-aa4e-806d99ab9ec0"
  ],
  "started_at": "2026-10-28T13:17:53.926166Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673491865",
    "at": "2026-10-28T13:17:53.928204141Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.19939",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=1997490e-ff12-4802-aa4e-806d99ab9ec0` → **200**

```json
{
  "calls": [
    {
      "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [
        "1997490e-ff12-4802-aa4e-806d99ab9ec0"
      ],
      "started_at": "2026-10-28T13:17:53.926166Z",
      "answered_at": "2026-10-28T13:17:54.581888Z",
      "ended_at": "2026-10-28T13:17:54.604495Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1997490e-ff12-4802-aa4e-806d99ab9ec0` → **200**

```json
{
  "calls": [
    {
      "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [
        "1997490e-ff12-4802-aa4e-806d99ab9ec0"
      ],
      "started_at": "2026-10-28T13:17:53.926166Z",
      "answered_at": "2026-10-28T13:17:54.581888Z",
      "ended_at": "2026-10-28T13:17:54.604495Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=1997490e-ff12-4802-aa4e-806d99ab9ec0` → **200**

```json
{
  "calls": [
    {
      "id": "ca30dc42-6e45-4cc8-ae28-d9aca04f812c",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b3948ea9-305c-4583-a362-0e821bbde242",
      "order_ids": [
        "1997490e-ff12-4802-aa4e-806d99ab9ec0"
      ],
      "started_at": "2026-10-28T13:17:53.926166Z",
      "answered_at": "2026-10-28T13:17:54.581888Z",
      "ended_at": "2026-10-28T13:17:54.604495Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:17:58.215583Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/1997490e-ff12-4802-aa4e-806d99ab9ec0` → **200**

```json
{
  "id": "1997490e-ff12-4802-aa4e-806d99ab9ec0",
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
  "created_at": "2026-10-28T13:17:53.615637Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673491865"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/1997490e-ff12-4802-aa4e-806d99ab9ec0/cancel` → **200**

```json
{
  "command_id": "57f71585-4288-4e5f-b889-d097087fdaf7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "1997490e-ff12-4802-aa4e-806d99ab9ec0",
  "short_number": 18,
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
  "created_at": "2026-10-28T13:17:53.615637Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673491865"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut"
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
  "command_id": "065c0480-5aa5-4b70-a377-d76f6a36016a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T13:18:00.126714Z",
  "extension": "101"
}
```

Done: outgoing call ca30dc42-6e45-4cc8-ae28-d9aca04f812c from order 1997490e-ff12-4802-aa4e-806d99ab9ec0, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630493719",
  "device_ref": "sandbox-11100"
}
```

```json
{
  "challenge_id": "6f54ce9f-93e8-47d1-89c7-5d549e07dfe5",
  "expires_at": "2026-10-28T13:23:00.424896026Z",
  "resend_available_at": "2026-10-28T13:18:01.424896026Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630493719` → **200**

```json
{
  "phone": "+380630493719",
  "audience": "CLIENT",
  "code": "131250",
  "sent_at": "2026-10-28T13:18:00.427468556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6f54ce9f-93e8-47d1-89c7-5d549e07dfe5",
  "code": "131250",
  "device_ref": "sandbox-11100"
}
```

```json
{
  "session_id": "0d558010-08d9-42f3-8069-f5277cf3a96f",
  "subject": {
    "type": "CLIENT",
    "id": "9de4d364-186f-499a-b9ae-bd1fb633349d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGU0ZDM2NC0xODZmLTQ5OWEtYjlhZS1iZDFmYjYzMzM0OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzgwLCJpYXQiOjE3OTMxOTM0ODAsImp0aSI6IjhiZjZlNjRjLTczNTEtNDIxNy04MmM0LTQ4NDYyODkxYmUyMSIsInNpZCI6IjBkNTU4MDEwLTA4ZDktNDJmMy04MDY5LWY1Mjc3Y2YzYTk2ZiJ9.05pMOJEz4WQeYWWE8QDupD2zISKLHoiAL4x64nUEw2Y",
  "access_expires_at": "2026-10-28T13:33:00.739747404Z",
  "refresh_token": "-Iqv1j3PVhbmvT6iXxGmqseP2-mC8VlSUuhJR-KQpSs",
  "refresh_expires_at": "2026-11-27T13:18:00.739109811Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
  "session_id": "0d558010-08d9-42f3-8069-f5277cf3a96f",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630493719",
  "device_ref": "sandbox-2600"
}
```

```json
{
  "challenge_id": "2f28eeee-4402-412d-ad0e-1b1289ff3206",
  "expires_at": "2026-10-28T13:23:03.297963996Z",
  "resend_available_at": "2026-10-28T13:18:04.297963996Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630493719` → **200**

```json
{
  "phone": "+380630493719",
  "audience": "CLIENT",
  "code": "139463",
  "sent_at": "2026-10-28T13:18:03.300065854Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f28eeee-4402-412d-ad0e-1b1289ff3206",
  "code": "139463",
  "device_ref": "sandbox-2600"
}
```

```json
{
  "session_id": "621e9669-b42d-4c5b-a965-fa04bca3730a",
  "subject": {
    "type": "CLIENT",
    "id": "9de4d364-186f-499a-b9ae-bd1fb633349d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGU0ZDM2NC0xODZmLTQ5OWEtYjlhZS1iZDFmYjYzMzM0OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzgzLCJpYXQiOjE3OTMxOTM0ODMsImp0aSI6IjI1YTM2NmRkLTNiNjctNGMwZi1hZDkxLTY2MWFiMDU2OGVkZCIsInNpZCI6IjYyMWU5NjY5LWI0MmQtNGM1Yi1hOTY1LWZhMDRiY2EzNzMwYSJ9.kIM7aTKov-qWIJpFpXViPNqYlytV5TAtHWhWtXm0aKk",
  "access_expires_at": "2026-10-28T13:33:03.609084923Z",
  "refresh_token": "0beljo13XH3sQfRPBXUXWqQbEvogrfNJqS8uFa4p6UE",
  "refresh_expires_at": "2026-11-27T13:18:03.608504302Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "3f02a0c0-2de7-4748-8605-ee61a17a7714",
  "expires_at": "2026-10-28T13:23:05.889577772Z",
  "resend_available_at": "2026-10-28T13:18:06.889577772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630493719` → **200**

```json
{
  "phone": "+380630493719",
  "audience": "CLIENT",
  "code": "072584",
  "sent_at": "2026-10-28T13:18:05.892087772Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380635011549"
}
```

```json
{
  "challenge_id": "92a19621-af87-4dd7-8057-7c93c3a7052e",
  "expires_at": "2026-10-28T13:23:06.186843418Z",
  "resend_available_at": "2026-10-28T13:18:07.186843418Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635011549` → **200**

```json
{
  "phone": "+380635011549",
  "audience": "CLIENT",
  "code": "153671",
  "sent_at": "2026-10-28T13:18:06.18854186Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "952394f4-541b-4a28-8359-0d13ad0d48d1",
  "current_challenge_id": "3f02a0c0-2de7-4748-8605-ee61a17a7714",
  "current_code": "000000",
  "new_challenge_id": "92a19621-af87-4dd7-8057-7c93c3a7052e",
  "new_code": "153671"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8ed274b5-deb3-4d3e-8a37-c89ba2788e1c"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "4be59cd9-22ad-4e47-a66f-45d051a43d22",
  "current_challenge_id": "3f02a0c0-2de7-4748-8605-ee61a17a7714",
  "current_code": "072584",
  "new_challenge_id": "92a19621-af87-4dd7-8057-7c93c3a7052e",
  "new_code": "153671"
}
```

```json
{
  "subject_id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
  "phone": "+380635011549",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
  "session_id": "0d558010-08d9-42f3-8069-f5277cf3a96f",
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
  "correlation_id": "bd557435-e0bb-488b-b918-b669299b0a0a"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635011549",
  "device_ref": "sandbox-15870"
}
```

```json
{
  "challenge_id": "7958a720-6c19-46bf-badc-f57a9b6c4a28",
  "expires_at": "2026-10-28T13:23:09.604823878Z",
  "resend_available_at": "2026-10-28T13:18:10.604823878Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635011549` → **200**

```json
{
  "phone": "+380635011549",
  "audience": "CLIENT",
  "code": "426464",
  "sent_at": "2026-10-28T13:18:09.607142874Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7958a720-6c19-46bf-badc-f57a9b6c4a28",
  "code": "426464",
  "device_ref": "sandbox-15870"
}
```

```json
{
  "session_id": "87a19fe3-c152-4804-97d6-b52beadfa5a5",
  "subject": {
    "type": "CLIENT",
    "id": "9de4d364-186f-499a-b9ae-bd1fb633349d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGU0ZDM2NC0xODZmLTQ5OWEtYjlhZS1iZDFmYjYzMzM0OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0Mzg5LCJpYXQiOjE3OTMxOTM0ODksImp0aSI6ImY2YmFmMDkzLTIyMzctNGYxNi1hY2JmLWVhZjNkYWQ5ZGNlZSIsInNpZCI6Ijg3YTE5ZmUzLWMxNTItNDgwNC05N2Q2LWI1MmJlYWRmYTVhNSJ9.Ai_oKBcZBvVKdNWMKNxCm5SGpCCHjGPaWH7mkpNI-Tw",
  "access_expires_at": "2026-10-28T13:33:09.917045668Z",
  "refresh_token": "NgXVHFD9AX4Cg54pJ2yhkmuUgbQkLk93t5oSKsU47Os",
  "refresh_expires_at": "2026-11-27T13:18:09.916189803Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
  "session_id": "87a19fe3-c152-4804-97d6-b52beadfa5a5",
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
  "session_id": "720c9cf8-724c-46e9-968f-96bf3f752cf5",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzOTAsImlhdCI6MTc5MzE5MzQ5MCwianRpIjoiMzRkMzAzMTItOTFkZC00ZTBmLTkwNmMtM2QxYjVhNWNmODdjIiwic2lkIjoiNzIwYzljZjgtNzI0Yy00NmU5LTk2OGYtOTZiZjNmNzUyY2Y1In0.TYr4ngjzaPK5sBbJTQto2MPv-dtAAOmIUeDj7BivC3A",
  "access_expires_at": "2026-10-28T13:33:10.774106874Z",
  "refresh_token": "kqRlFFWpxmeckPGu6DoA5AqUwRabbG-Qvs9sULj9YYg",
  "refresh_expires_at": "2026-10-29T01:18:10.773484294Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/9de4d364-186f-499a-b9ae-bd1fb633349d` → **200**

```json
{
  "client": {
    "id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
    "phone": "+380635011549",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T13:18:00.737391Z",
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

`POST /api/admin/v1/clients/9de4d364-186f-499a-b9ae-bd1fb633349d/phone` → **400**

```json
{
  "command_id": "c0ea7dd4-1574-4597-8980-321bd7bd1faf",
  "expected_version": 3,
  "phone": "+380631766185",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9de4d364-186f-499a-b9ae-bd1fb633349d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "69e9c3cf-95e1-4573-89fe-039b2c7c9add",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/9de4d364-186f-499a-b9ae-bd1fb633349d/phone` → **200**

```json
{
  "command_id": "88ef6f78-c067-4bda-9ede-578143354cc6",
  "expected_version": 3,
  "phone": "+380631766185",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
  "phone": "+380631766185",
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
  "correlation_id": "f66730fc-2d9c-4d75-b18a-50e72167159f"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631766185",
  "device_ref": "sandbox-32235"
}
```

```json
{
  "challenge_id": "69a58d53-b150-4478-b7f7-3902cbc832ee",
  "expires_at": "2026-10-28T13:23:12.224574009Z",
  "resend_available_at": "2026-10-28T13:18:13.224574009Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631766185` → **200**

```json
{
  "phone": "+380631766185",
  "audience": "CLIENT",
  "code": "833371",
  "sent_at": "2026-10-28T13:18:12.226947525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69a58d53-b150-4478-b7f7-3902cbc832ee",
  "code": "833371",
  "device_ref": "sandbox-32235"
}
```

```json
{
  "session_id": "f3a68af6-2491-48d7-bb9b-f6797151149c",
  "subject": {
    "type": "CLIENT",
    "id": "9de4d364-186f-499a-b9ae-bd1fb633349d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZGU0ZDM2NC0xODZmLTQ5OWEtYjlhZS1iZDFmYjYzMzM0OWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzkyLCJpYXQiOjE3OTMxOTM0OTIsImp0aSI6IjI4NzkyODcxLTJkNDgtNDAzYS1iODMzLTkyZTZkNTBlNWYxNiIsInNpZCI6ImYzYTY4YWY2LTI0OTEtNDhkNy1iYjliLWY2Nzk3MTUxMTQ5YyJ9.cmTadNOSvwHr2YmNkh9gUvdFTVoNg6_TSU_-AQdSygg",
  "access_expires_at": "2026-10-28T13:33:12.525424086Z",
  "refresh_token": "lh4KNxwu44xKbnc2kc0K6B7f3D4Jhwn7-Qypc1duk-w",
  "refresh_expires_at": "2026-11-27T13:18:12.524827024Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9de4d364-186f-499a-b9ae-bd1fb633349d",
  "session_id": "f3a68af6-2491-48d7-bb9b-f6797151149c",
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
  "phone": "+380632220538",
  "device_ref": "sandbox-22585"
}
```

```json
{
  "challenge_id": "32bdb42b-5c5e-4246-b367-3bcd4657acbd",
  "expires_at": "2026-10-28T13:23:13.089275346Z",
  "resend_available_at": "2026-10-28T13:18:14.089275346Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632220538` → **200**

```json
{
  "phone": "+380632220538",
  "audience": "CLIENT",
  "code": "370205",
  "sent_at": "2026-10-28T13:18:13.091610777Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "32bdb42b-5c5e-4246-b367-3bcd4657acbd",
  "code": "370205",
  "device_ref": "sandbox-22585"
}
```

```json
{
  "session_id": "83c8c00e-9399-4a8e-9171-cccf08aab609",
  "subject": {
    "type": "CLIENT",
    "id": "86a1a1fc-da10-45c6-aa29-805d1f84cd38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NmExYTFmYy1kYTEwLTQ1YzYtYWEyOS04MDVkMWY4NGNkMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0MzkzLCJpYXQiOjE3OTMxOTM0OTMsImp0aSI6ImYxMWY4N2M1LWNlZmYtNDQ3NS1iNTdmLWRlYzVkM2I2YjRmYyIsInNpZCI6IjgzYzhjMDBlLTkzOTktNGE4ZS05MTcxLWNjY2YwOGFhYjYwOSJ9.VtMxDStaN35gMazv4YEqqmj__ycmPzwtNK3bG5DQzTc",
  "access_expires_at": "2026-10-28T13:33:13.389284452Z",
  "refresh_token": "L2CVUDt5v3EK--zoqqrWqWdrJWe5vDjjWPzZ3qpnXmI",
  "refresh_expires_at": "2026-11-27T13:18:13.388567792Z",
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
  "session_id": "3883b22e-8e16-4196-b191-6fea0f580fce",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzOTQsImlhdCI6MTc5MzE5MzQ5NCwianRpIjoiY2Q4Yzc2ZWYtZDIwZC00MzhmLTlhNGYtNDczMDE5MGQ3NjBjIiwic2lkIjoiMzg4M2IyMmUtOGUxNi00MTk2LWIxOTEtNmZlYTBmNTgwZmNlIn0.IOWB6FybrodRLXKTHTFkB-5hhdmZnXvgj2KF-kMWWmw",
  "access_expires_at": "2026-10-28T13:33:14.537871267Z",
  "refresh_token": "UK5rf3n5YvmSUEut0aULJisEJN4XfTsyUXMAg9NgcKs",
  "refresh_expires_at": "2026-10-29T01:18:14.537217949Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632220538` → **200**

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
  "correlation_id": "3a0815be-0b49-48fe-b4fe-a38fa9c03ad9"
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
  "session_id": "53f3d259-c767-4ce0-8dfa-ed85eb763ac6",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQzOTUsImlhdCI6MTc5MzE5MzQ5NSwianRpIjoiYjUxNzYyMTItNTM0NC00ODNlLTliMjItMThjMzI5OGRjZjczIiwic2lkIjoiNTNmM2QyNTktYzc2Ny00Y2UwLThkZmEtZWQ4NWViNzYzYWM2In0.MfoOm-hNWjSOHqG1j9wDeEpuXNBidBLI7cST1vg8W0I",
  "access_expires_at": "2026-10-28T13:33:15.691173751Z",
  "refresh_token": "ALqYUguU55uamRA4IaDoW5Xil4ljNqiDI7IPnVq4QFQ",
  "refresh_expires_at": "2026-10-29T01:18:15.690476247Z",
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
  "command_id": "3795cdb3-7e4b-4a64-86cf-5713b0e33551",
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
  "changed_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T13:18:16.27474543Z"
}
```

## The rider books the airport for 2026-10-28T16:18:15Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600457375",
  "device_ref": "sandbox-10892"
}
```

```json
{
  "challenge_id": "cbae14de-8d09-437f-a1e4-eb2ddcf511bb",
  "expires_at": "2026-10-28T13:23:16.560578822Z",
  "resend_available_at": "2026-10-28T13:18:17.560578822Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600457375` → **200**

```json
{
  "phone": "+48600457375",
  "audience": "CLIENT",
  "code": "772223",
  "sent_at": "2026-10-28T13:18:16.562747107Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbae14de-8d09-437f-a1e4-eb2ddcf511bb",
  "code": "772223",
  "device_ref": "sandbox-10892"
}
```

```json
{
  "session_id": "6cbd51a6-293d-452a-b62f-f6692d525dd2",
  "subject": {
    "type": "CLIENT",
    "id": "eca06dba-6d8c-4998-b1eb-d77f9b2d33c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlY2EwNmRiYS02ZDhjLTQ5OTgtYjFlYi1kNzdmOWIyZDMzYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0Mzk2LCJpYXQiOjE3OTMxOTM0OTYsImp0aSI6ImU4NDk2NmFkLTBmZTAtNGVkZi1hMTcxLThiOTkyN2E0YTI5OCIsInNpZCI6IjZjYmQ1MWE2LTI5M2QtNDUyYS1iNjJmLWY2NjkyZDUyNWRkMiJ9.65-JfRXW7YlDQvzdrz7X6pUyFc7PI0_f-9GzSijyWoU",
  "access_expires_at": "2026-10-28T13:33:16.865212635Z",
  "refresh_token": "BHCf9Mi2rbQ13qpw8OIjpyY7lTs0FpGLkBaEmSaksak",
  "refresh_expires_at": "2026-11-27T13:18:16.864662209Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5a94d1f2-30e2-4235-a60b-cae5cdf27a90",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T16:18:15Z"
}
```

```json
{
  "id": "7a40b21e-48af-4b08-ab96-92c26efbea21",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:23:17.155041Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T16:18:15Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4c1854de-55ad-4d6e-b800-29cdd137956d",
  "quote_id": "7a40b21e-48af-4b08-ab96-92c26efbea21",
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
  "pickup_at": "2026-10-28T16:18:15Z"
}
```

```json
{
  "id": "3931641e-4837-42b9-877c-d4e7c386f17d",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "eca06dba-6d8c-4998-b1eb-d77f9b2d33c6",
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
  "created_at": "2026-10-28T13:18:17.445683Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T16:18:15Z",
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
  "device_ref": "sandbox-1342"
}
```

```json
{
  "challenge_id": "93e04584-eab0-4c29-88f0-f1627a0f8a96",
  "expires_at": "2026-10-28T13:23:17.738658758Z",
  "resend_available_at": "2026-10-28T13:18:18.738658758Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "985083",
  "sent_at": "2026-10-28T13:18:17.741097703Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93e04584-eab0-4c29-88f0-f1627a0f8a96",
  "code": "985083",
  "device_ref": "sandbox-1342"
}
```

```json
{
  "session_id": "78bc6502-745e-4504-9412-014ef537ee65",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDM5OCwiaWF0IjoxNzkzMTkzNDk4LCJqdGkiOiJmZjc3YjQ4Yy0zODZhLTQ2MzEtODY5YS1kMmE3NzZlODA2YmUiLCJzaWQiOiI3OGJjNjUwMi03NDVlLTQ1MDQtOTQxMi0wMTRlZjUzN2VlNjUifQ.8Y400rM6OXM3mNS8J48di_OazbV6t8SLwEdOZsfRabE",
  "access_expires_at": "2026-10-28T13:33:18.032092081Z",
  "refresh_token": "6rXvJ_ep4OqzFE4D0k63MyhXscnF4hVyrzfd0fWdvJE",
  "refresh_expires_at": "2026-11-27T13:18:18.031494021Z",
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
  "command_id": "3a0143c2-f42a-4328-a5bd-3e836ebc6639",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:18:18Z",
    "sequence": 1793193498585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4d5c3a6-d7bd-4dbb-a28e-643934d6de88",
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
  "last_heartbeat_at": "2026-10-28T13:18:18.603699Z",
  "last_location_at": "2026-10-28T13:18:18.603699Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "3931641e-4837-42b9-877c-d4e7c386f17d",
      "short_number": 19,
      "pickup_at": "2026-10-28T16:18:15Z",
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

`POST /api/driver/v1/preorders/3931641e-4837-42b9-877c-d4e7c386f17d/reserve` → **200**

```json
{
  "command_id": "09300dff-25f4-4d79-948d-212adefff7ea"
}
```

```json
{
  "id": "9193279f-1809-40e1-9960-e91cdcc864eb",
  "state": "RESERVED",
  "order": {
    "order_id": "3931641e-4837-42b9-877c-d4e7c386f17d",
    "short_number": 19,
    "pickup_at": "2026-10-28T16:18:15Z",
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
  "reserved_at": "2026-10-28T13:18:19.170819Z",
  "confirm_from": "2026-10-28T15:48:15Z",
  "confirm_until": "2026-10-28T15:58:15Z",
  "drop_until": "2026-10-28T15:18:15Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "9193279f-1809-40e1-9960-e91cdcc864eb",
      "state": "RESERVED",
      "order": {
        "order_id": "3931641e-4837-42b9-877c-d4e7c386f17d",
        "short_number": 19,
        "pickup_at": "2026-10-28T16:18:15Z",
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
      "reserved_at": "2026-10-28T13:18:19.170819Z",
      "confirm_from": "2026-10-28T15:48:15Z",
      "confirm_until": "2026-10-28T15:58:15Z",
      "drop_until": "2026-10-28T15:18:15Z"
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
      "id": "9193279f-1809-40e1-9960-e91cdcc864eb",
      "state": "RESERVED",
      "order": {
        "order_id": "3931641e-4837-42b9-877c-d4e7c386f17d",
        "short_number": 19,
        "pickup_at": "2026-10-28T16:18:15Z",
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
      "reserved_at": "2026-10-28T13:18:19.170819Z",
      "confirm_from": "2026-10-28T15:48:15Z",
      "confirm_until": "2026-10-28T15:58:15Z",
      "drop_until": "2026-10-28T15:18:15Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/9193279f-1809-40e1-9960-e91cdcc864eb/confirm` → **409**

```json
{
  "command_id": "633cd0e9-c89d-460e-8fe6-a0744ba21911"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/9193279f-1809-40e1-9960-e91cdcc864eb/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1c73d67b-2b94-436a-9115-ee40b1c0ef95"
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
  "session_id": "f489353b-b3fa-4207-a3c1-f3ae9f622ef8",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MDAsImlhdCI6MTc5MzE5MzUwMCwianRpIjoiN2E2NWNlZjctOTY5My00ODNhLWJmNDEtYjZlZGRhOTQ1MWI5Iiwic2lkIjoiZjQ4OTM1M2ItYjNmYS00MjA3LWEzYzEtZjNhZTlmNjIyZWY4In0.nPOX2VeqgemFy-Q4o_NnZrg1GzWqLugW_sfHzLFhyoQ",
  "access_expires_at": "2026-10-28T13:33:20.584840216Z",
  "refresh_token": "TkrSeZZLHZqQD-rVQmjF8Hd9j-nJvpfClFS1OTojOPc",
  "refresh_expires_at": "2026-10-29T01:18:20.583883574Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3931641e-4837-42b9-877c-d4e7c386f17d` → **200**

```json
{
  "id": "3931641e-4837-42b9-877c-d4e7c386f17d",
  "short_number": 19,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "eca06dba-6d8c-4998-b1eb-d77f9b2d33c6",
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
  "created_at": "2026-10-28T13:18:17.445683Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T16:18:15Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "9193279f-1809-40e1-9960-e91cdcc864eb",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T13:18:19.170819Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/3931641e-4837-42b9-877c-d4e7c386f17d/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T13:18:17.447189Z",
      "actor": {
        "type": "CLIENT",
        "id": "eca06dba-6d8c-4998-b1eb-d77f9b2d33c6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "3931641e-4837-42b9-877c-d4e7c386f17d",
        "preorder": true,
        "quote_id": "7a40b21e-48af-4b08-ab96-92c26efbea21",
        "pickup_at": "2026-10-28T16:18:15Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "941e7031-842f-4923-8ab2-aa4c0861d0a8"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T13:18:19.172114Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "3931641e-4837-42b9-877c-d4e7c386f17d",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "9193279f-1809-40e1-9960-e91cdcc864eb"
      },
      "correlation_id": "1e808c6a-bf57-47c8-a2db-c30c493f443b"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 3931641e-4837-42b9-877c-d4e7c386f17d, reservation 9193279f-1809-40e1-9960-e91cdcc864eb.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20673"
}
```

```json
{
  "challenge_id": "ec4a1a4c-b1f3-43b6-989f-78c5c82fffd8",
  "expires_at": "2026-10-28T13:23:21.462002754Z",
  "resend_available_at": "2026-10-28T13:18:22.462002754Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "273862",
  "sent_at": "2026-10-28T13:18:21.465481292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ec4a1a4c-b1f3-43b6-989f-78c5c82fffd8",
  "code": "273862",
  "device_ref": "sandbox-20673"
}
```

```json
{
  "session_id": "c63e0b6d-7623-439a-bb67-cdcbfceef833",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDQwMSwiaWF0IjoxNzkzMTkzNTAxLCJqdGkiOiI0MmI0NTg0YS1lYmJmLTRkOWYtYmQ2NS01NTM4MDU2NzhhNGMiLCJzaWQiOiJjNjNlMGI2ZC03NjIzLTQzOWEtYmI2Ny1jZGNiZmNlZWY4MzMifQ.25UrP3uuQ-cVG70ZTKXdLqkITPmDbpuIYYNMdk4jbps",
  "access_expires_at": "2026-10-28T13:33:21.7674903Z",
  "refresh_token": "LJkuU4jBsngtxHZznyWhdn9Q8hpXA0PN8YJiBZzYy_M",
  "refresh_expires_at": "2026-11-27T13:18:21.766934625Z",
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
  "command_id": "ebba1da6-ccbe-406b-8005-1b8cc3008d8c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:18:22Z",
    "sequence": 1793193502312
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:18:22.331357Z",
  "last_location_at": "2026-10-28T13:18:22.331357Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676138413",
  "device_ref": "sandbox-23960"
}
```

```json
{
  "challenge_id": "9a1242a5-994f-4ecd-95dc-b4fd0d2d3eb8",
  "expires_at": "2026-10-28T13:23:22.619695764Z",
  "resend_available_at": "2026-10-28T13:18:23.619695764Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676138413` → **200**

```json
{
  "phone": "+380676138413",
  "audience": "CLIENT",
  "code": "088278",
  "sent_at": "2026-10-28T13:18:22.622106944Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9a1242a5-994f-4ecd-95dc-b4fd0d2d3eb8",
  "code": "088278",
  "device_ref": "sandbox-23960"
}
```

```json
{
  "session_id": "acb0ae91-72bf-4050-a57c-6847d34ade7b",
  "subject": {
    "type": "CLIENT",
    "id": "a6223aa9-00cf-4803-8a17-21e7060c3353"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNjIyM2FhOS0wMGNmLTQ4MDMtOGExNy0yMWU3MDYwYzMzNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0NDAyLCJpYXQiOjE3OTMxOTM1MDIsImp0aSI6IjBhZTZiNjUyLTVlNjgtNDI3Mi05ZWM0LWY0NjUzOTIxOWZlZCIsInNpZCI6ImFjYjBhZTkxLTcyYmYtNDA1MC1hNTdjLTY4NDdkMzRhZGU3YiJ9.m-rKNlzu1Mcgh60h_sjOznAxx2Er86DrL_dxVVse2Us",
  "access_expires_at": "2026-10-28T13:33:22.930286344Z",
  "refresh_token": "DgfxvQaen6TS5O4Vaufn2xZq7d6KF7Ymxui-Y5fHdYE",
  "refresh_expires_at": "2026-11-27T13:18:22.929695329Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fafd747a-1a00-4552-8979-2150d052d5cf",
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
  "id": "e2e6ebab-112d-4ba4-af15-50d841773e7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:23:23.220372Z",
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
  "command_id": "8d598ce8-65eb-411b-bd83-16dbfb6b075a",
  "quote_id": "e2e6ebab-112d-4ba4-af15-50d841773e7b",
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
  "id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "short_number": 20,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a6223aa9-00cf-4803-8a17-21e7060c3353",
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
  "created_at": "2026-10-28T13:18:23.522903Z",
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
    "id": "4b099642-7134-4bf9-81f6-8727ed357fba",
    "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
    "expires_at": "2026-10-28T13:18:38.526267Z",
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

`POST /api/driver/v1/offers/4b099642-7134-4bf9-81f6-8727ed357fba/accept` → **200**

```json
{
  "command_id": "7772bcc7-742d-41d1-9099-d9ae78235652"
}
```

```json
{
  "id": "ebcd8aff-1eb2-437c-9005-80bbd767cdf4",
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "29f65006-aa7c-4b78-9ac6-10610707f329",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "29f65006-aa7c-4b78-9ac6-10610707f329",
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "assignment_id": "ebcd8aff-1eb2-437c-9005-80bbd767cdf4",
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

`POST /api/driver/v1/work-sessions/5e59889d-ebca-493e-8450-604c4e789a3f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:18:24Z",
    "sequence": 1793193504661
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:18:24.68283Z",
  "last_location_at": "2026-10-28T13:18:24.68283Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "29f65006-aa7c-4b78-9ac6-10610707f329",
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "assignment_id": "ebcd8aff-1eb2-437c-9005-80bbd767cdf4",
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

`POST /api/driver/v1/trips/29f65006-aa7c-4b78-9ac6-10610707f329/arrive` → **200**

```json
{
  "command_id": "3f228f4b-30d3-496e-9214-6ec10246c812",
  "expected_version": 0
}
```

```json
{
  "id": "29f65006-aa7c-4b78-9ac6-10610707f329",
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "assignment_id": "ebcd8aff-1eb2-437c-9005-80bbd767cdf4",
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
  "arrived_at": "2026-10-28T13:18:25.235389Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/29f65006-aa7c-4b78-9ac6-10610707f329/start` → **200**

```json
{
  "command_id": "c7d5043a-a1cb-4c97-a4df-d1ea3d43c057",
  "expected_version": 1
}
```

```json
{
  "id": "29f65006-aa7c-4b78-9ac6-10610707f329",
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "assignment_id": "ebcd8aff-1eb2-437c-9005-80bbd767cdf4",
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
  "arrived_at": "2026-10-28T13:18:25.235389Z",
  "started_at": "2026-10-28T13:18:25.538341Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5e59889d-ebca-493e-8450-604c4e789a3f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:18:25Z",
    "sequence": 1793193505822
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:18:25.842002Z",
  "last_location_at": "2026-10-28T13:18:25.842002Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/29f65006-aa7c-4b78-9ac6-10610707f329/complete` → **200**

```json
{
  "command_id": "9bcee1cc-f297-4b0c-bacb-894a2b0b53ea",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:18:26Z",
  "cash_received": true
}
```

```json
{
  "id": "29f65006-aa7c-4b78-9ac6-10610707f329",
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "assignment_id": "ebcd8aff-1eb2-437c-9005-80bbd767cdf4",
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
  "arrived_at": "2026-10-28T13:18:25.235389Z",
  "started_at": "2026-10-28T13:18:25.538341Z",
  "completed_at": "2026-10-28T13:18:26.127932Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb/rating` → **200**

```json
{
  "command_id": "8c203646-01b7-41b3-8770-68bb0410c2d3",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "score": 5,
  "created_at": "2026-10-28T13:18:26.42666424Z"
}
```

`POST /api/driver/v1/orders/3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb/rating` → **200**

```json
{
  "command_id": "3b421301-f868-4927-b356-31a3de055c77",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
  "score": 4,
  "created_at": "2026-10-28T13:18:26.707396942Z"
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
  "session_id": "b48a1ca2-3db2-44a6-8c9a-a0765f15c928",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MDcsImlhdCI6MTc5MzE5MzUwNywianRpIjoiNzg0NjNjOTUtY2MwMC00NjJkLWI5OWQtYzQzNmM5NmNkZjllIiwic2lkIjoiYjQ4YTFjYTItM2RiMi00NGE2LThjOWEtYTA3NjVmMTVjOTI4In0.Jxhw1pJC1ZhODbMBBXwm3XW1yUyJaEEmUrgNlk_nnTg",
  "access_expires_at": "2026-10-28T13:33:27.559636701Z",
  "refresh_token": "TPebqm_edmkF1_3ij0WbNdDKOWivi1KSt9jIkD1VIWs",
  "refresh_expires_at": "2026-10-29T01:18:27.558974702Z",
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
  "session_id": "0a794bfb-d946-4443-94c3-0f98d91d9c9b",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MDgsImlhdCI6MTc5MzE5MzUwOCwianRpIjoiNjgzNTRmZjgtZjlhNi00ZjU0LWI4NzItMGU1ODA2ZTA0YzI1Iiwic2lkIjoiMGE3OTRiZmItZDk0Ni00NDQzLTk0YzMtMGY5OGQ5MWQ5YzliIn0.Z7q9YI3MONy4cmAZuEPleGlsLOutpVMzwCiIH8hdw0Q",
  "access_expires_at": "2026-10-28T13:33:28.122059416Z",
  "refresh_token": "mZBwUBHZ48ax02jbBCXA_4iHAONRUwM61XioihZwKgs",
  "refresh_expires_at": "2026-10-29T01:18:28.121453267Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
      "author_type": "RIDER",
      "author_id": "a6223aa9-00cf-4803-8a17-21e7060c3353",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T13:18:26.426664Z"
    },
    {
      "order_id": "3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "a6223aa9-00cf-4803-8a17-21e7060c3353",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T13:18:26.707397Z"
    }
  ]
}
```

Done: ratings for order 3aabe9f2-5e78-48fc-a600-66ec5f1b1ffb.

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
  "session_id": "1ecec342-6ccd-4090-a266-ba81750daacb",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MDgsImlhdCI6MTc5MzE5MzUwOCwianRpIjoiMDg2ZTY1MDEtOWVkZC00N2E2LThkNDQtYzc4NjZhMzNjNWIyIiwic2lkIjoiMWVjZWMzNDItNmNjZC00MDkwLWEyNjYtYmE4MTc1MGRhYWNiIn0.f-AIUwACynf_BPgxxzQqLxclW-OCuA5gvQ-X0RSUrms",
  "access_expires_at": "2026-10-28T13:33:28.993660586Z",
  "refresh_token": "W_E9JZCbz-R8ZFys5cxq-kLhu9BYDBVzu99OzLbFcR8",
  "refresh_expires_at": "2026-10-29T01:18:28.993103799Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ba1985bd-c157-42ac-a16d-b68816c7dbea",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "216a6278-6cae-43c1-b3a6-484456dc305f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:29.282828Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/216a6278-6cae-43c1-b3a6-484456dc305f` → **200**

```json
{
  "id": "216a6278-6cae-43c1-b3a6-484456dc305f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:29.282828Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/216a6278-6cae-43c1-b3a6-484456dc305f` → **200**

```json
{
  "id": "216a6278-6cae-43c1-b3a6-484456dc305f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:29.282828Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/216a6278-6cae-43c1-b3a6-484456dc305f` → **200**

```json
{
  "id": "216a6278-6cae-43c1-b3a6-484456dc305f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:29.282828Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/216a6278-6cae-43c1-b3a6-484456dc305f` → **200**

```json
{
  "id": "216a6278-6cae-43c1-b3a6-484456dc305f",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:18:29.282828Z",
  "ready_at": "2026-10-28T13:18:33.270238Z",
  "expires_at": "2026-10-29T13:18:33.270238Z"
}
```

`GET /api/admin/v1/reports/exports/216a6278-6cae-43c1-b3a6-484456dc305f/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,19,7,12,0,0,15,4,0,17,1,0,1,6,1,5
total,19,7,12,0,0,15,4,0,17,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "8b91c0e5-eb23-4043-b4b3-a020c8e369e8",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "eb2a9519-75a3-40aa-860c-9ae54c1be55b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:33.709885Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb2a9519-75a3-40aa-860c-9ae54c1be55b` → **200**

```json
{
  "id": "eb2a9519-75a3-40aa-860c-9ae54c1be55b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:33.709885Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb2a9519-75a3-40aa-860c-9ae54c1be55b` → **200**

```json
{
  "id": "eb2a9519-75a3-40aa-860c-9ae54c1be55b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:33.709885Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb2a9519-75a3-40aa-860c-9ae54c1be55b` → **200**

```json
{
  "id": "eb2a9519-75a3-40aa-860c-9ae54c1be55b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:33.709885Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb2a9519-75a3-40aa-860c-9ae54c1be55b` → **200**

```json
{
  "id": "eb2a9519-75a3-40aa-860c-9ae54c1be55b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T13:18:33.709885Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/eb2a9519-75a3-40aa-860c-9ae54c1be55b` → **200**

```json
{
  "id": "eb2a9519-75a3-40aa-860c-9ae54c1be55b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T13:18:33.709885Z",
  "ready_at": "2026-10-28T13:18:38.281552Z",
  "expires_at": "2026-10-29T13:18:38.281552Z"
}
```

`GET /api/admin/v1/reports/exports/eb2a9519-75a3-40aa-860c-9ae54c1be55b/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,7,1071.86,130.74,160.80,911.06,10.52,0.00,162.97,182.97,584.66,50.00,0.00
total,UAH,7,1071.86,130.74,160.80,911.06,10.52,0.00,162.97,182.97,584.66,50.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/fdb0b968-fe42-44ca-a431-f8e9522c7bae` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/fdb0b968-fe42-44ca-a431-f8e9522c7bae",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "9e2967b2-a9e6-46dc-b87d-c9e59b59c4e1"
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
  "device_ref": "sandbox-604"
}
```

```json
{
  "challenge_id": "cf0e6030-dbbc-40f7-bb4f-27a2433c9588",
  "expires_at": "2026-10-28T13:23:39.701704906Z",
  "resend_available_at": "2026-10-28T13:18:40.701704906Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "489262",
  "sent_at": "2026-10-28T13:18:39.704021038Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf0e6030-dbbc-40f7-bb4f-27a2433c9588",
  "code": "489262",
  "device_ref": "sandbox-604"
}
```

```json
{
  "session_id": "0170c87a-2ab5-45ad-9b9b-d60001cc98b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDQxOSwiaWF0IjoxNzkzMTkzNTE5LCJqdGkiOiI3ZDU2NzNkNS0zYjUwLTQzOWQtYjQ1ZS1hM2M5MGQ4NjExYjYiLCJzaWQiOiIwMTcwYzg3YS0yYWI1LTQ1YWQtOWI5Yi1kNjAwMDFjYzk4YjAifQ.LyzRCeOKH3ow9p8j3ekwBLC6yzG7Z9eMRuA1-fj177g",
  "access_expires_at": "2026-10-28T13:33:39.996927071Z",
  "refresh_token": "lcF3LrSVVGSvWtNEWrc_X1FL0Z70Mop1MKstsPmgcO4",
  "refresh_expires_at": "2026-11-27T13:18:39.996310362Z",
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
  "command_id": "38c40481-3059-4f8b-89e2-d2971992e56a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:18:40Z",
    "sequence": 1793193520821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f2e899a2-083f-4c9d-8905-958ba756dcc7",
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
  "last_heartbeat_at": "2026-10-28T13:18:40.839673Z",
  "last_location_at": "2026-10-28T13:18:40.839673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "0305a4b2-3e2a-41d0-a666-5ecd10ab4ac7",
  "points": [
    {
      "sequence": 1793193523117,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:17:43Z"
    },
    {
      "sequence": 1793193523125,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T13:18:43Z"
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
  "session_id": "1e1d171d-9dfb-4d98-8f84-a61cfb5f5d45",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MjMsImlhdCI6MTc5MzE5MzUyMywianRpIjoiNzVhNjBmODktZDBmMy00Zjc3LTk4YTEtZDJmODNiZTgyZThmIiwic2lkIjoiMWUxZDE3MWQtOWRmYi00ZDk4LThmODQtYTYxY2ZiNWY1ZDQ1In0.dRsX13oH0o8IG3FJ_jNddM_3ft-8yRtSbhreAjUlKCQ",
  "access_expires_at": "2026-10-28T13:33:43.733490289Z",
  "refresh_token": "D4iQ-glJ8rqAbojziyU16BDAdGMvzvFJhVqCYKhpf34",
  "refresh_expires_at": "2026-10-29T01:18:43.732899929Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "df53db06-7f4d-4cc2-8403-3601344701aa",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T13:18:43Z",
        "track_point_id": "aa4fa4f8-ca36-4671-93aa-1e73ba40936a",
        "work_session_id": "f2e899a2-083f-4c9d-8905-958ba756dcc7"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T13:18:43Z",
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

`POST /api/admin/v1/driver-risk-flags/df53db06-7f4d-4cc2-8403-3601344701aa/confirm` → **200**

```json
{
  "command_id": "0d694e30-9987-4c1a-8421-f5ed20846f4c",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "df53db06-7f4d-4cc2-8403-3601344701aa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T13:18:43Z",
    "track_point_id": "aa4fa4f8-ca36-4671-93aa-1e73ba40936a",
    "work_session_id": "f2e899a2-083f-4c9d-8905-958ba756dcc7"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T13:18:43Z",
  "reason": null,
  "reviewed_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "reviewed_at": "2026-10-28T13:18:44.668167Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/df53db06-7f4d-4cc2-8403-3601344701aa/dismiss` → **409**

```json
{
  "command_id": "8babeebc-da7b-4714-8311-6b3034759251",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/df53db06-7f4d-4cc2-8403-3601344701aa/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cbc13636-e2ff-42b7-85a7-96b01217ad73"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "d5f0898d-534f-417c-9b20-2ae3bb2b15cf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "ad0a945c-b645-4efd-a942-f41d0a4def5d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "raised_at": "2026-10-28T13:18:45.248094Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/ad0a945c-b645-4efd-a942-f41d0a4def5d/dismiss` → **200**

```json
{
  "command_id": "ab275953-c72e-40fa-bde1-180115c2f759",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "ad0a945c-b645-4efd-a942-f41d0a4def5d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "raised_at": "2026-10-28T13:18:45.248094Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "reviewed_at": "2026-10-28T13:18:45.526629Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "73edc4c8-b045-4c65-95c2-324931a3cebf",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "df53db06-7f4d-4cc2-8403-3601344701aa"
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
      "actor_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:18:45.840395Z"
    }
  ]
}
```

Done: flag df53db06-7f4d-4cc2-8403-3601344701aa confirmed, suspension named it, driver reinstated.

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
  "session_id": "3a53cb92-3d34-414d-b6d3-c193a1664d19",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MjYsImlhdCI6MTc5MzE5MzUyNiwianRpIjoiNmMxNDllMTItMzgyYS00ZTNhLTgzYzgtZDNmNmU4NDkyODEwIiwic2lkIjoiM2E1M2NiOTItM2QzNC00MTRkLWI2ZDMtYzE5M2ExNjY0ZDE5In0.81L7CkDpEhTLH5OG7bNuUMPZfdfPe7H7piXBtgO9Kf4",
  "access_expires_at": "2026-10-28T13:33:46.697917999Z",
  "refresh_token": "ZMJVAMi_e6R1pAAjgU0oDDTbQuW9WRnb2EJi-jCbmeQ",
  "refresh_expires_at": "2026-10-29T01:18:46.69736018Z",
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
      "actor_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:18:45.840395Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "b3e6e103-7191-40ca-ae17-8de79f97a8b0",
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
  "session_id": "f2e899a2-083f-4c9d-8905-958ba756dcc7",
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
  "last_heartbeat_at": "2026-10-28T13:18:40.839673Z",
  "last_location_at": "2026-10-28T13:18:40.839673Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f2e899a2-083f-4c9d-8905-958ba756dcc7/close` → **200**

```json
{
  "command_id": "3cc086b7-d926-48bf-bdc8-4be304f50ef2",
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
  "session_id": "e1f82730-db1e-4e4f-8f3d-b962fe636f55",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MjgsImlhdCI6MTc5MzE5MzUyOCwianRpIjoiNDQ2OGJjNTgtMzg1MS00YTlmLWE1NjctOTA5NDQ1ZDJjYTQxIiwic2lkIjoiZTFmODI3MzAtZGIxZS00ZTRmLThmM2QtYjk2MmZlNjM2ZjU1In0.XLTZ8LHFpl-XD3gz5zLmX1XjGsZAhK6zJehkPUN3B04",
  "access_expires_at": "2026-10-28T13:33:48.410292683Z",
  "refresh_token": "peyFQDwhQIZA0jT_aWqsvV5HuyJTJX8yW5W60RpeUn0",
  "refresh_expires_at": "2026-10-29T01:18:48.409701121Z",
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
  "command_id": "e0289c11-44e2-4194-81eb-6d8026035754",
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
  "changed_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:18:48.971489Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "e0289c11-44e2-4194-81eb-6d8026035754",
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
  "changed_by": "b3948ea9-305c-4583-a362-0e821bbde242",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T13:18:48.971489Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48783416789",
  "device_ref": "sandbox-26730"
}
```

```json
{
  "challenge_id": "8f68394e-7038-4090-bc2b-2c43ffe4bbbb",
  "expires_at": "2026-10-28T13:23:49.551884Z",
  "resend_available_at": "2026-10-28T13:18:50.551884Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48783416789` → **200**

```json
{
  "phone": "+48783416789",
  "audience": "CLIENT",
  "code": "976626",
  "sent_at": "2026-10-28T13:18:49.554353225Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f68394e-7038-4090-bc2b-2c43ffe4bbbb",
  "code": "976626",
  "device_ref": "sandbox-26730"
}
```

```json
{
  "session_id": "a2615929-ebba-43b8-ae07-230610b78ce7",
  "subject": {
    "type": "CLIENT",
    "id": "b77dc22c-8386-4880-94b6-12fac21b9dc5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzdkYzIyYy04Mzg2LTQ4ODAtOTRiNi0xMmZhYzIxYjlkYzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0NDI5LCJpYXQiOjE3OTMxOTM1MjksImp0aSI6ImFjYjlkODY0LWRlZTktNGQ0NC1iMjEyLTMxZThlZjBiNWU4MyIsInNpZCI6ImEyNjE1OTI5LWViYmEtNDNiOC1hZTA3LTIzMDYxMGI3OGNlNyJ9.6cmgViRNb-0o8ME0ZqZVrdwA9ZuKdASLZysZHpf7XH8",
  "access_expires_at": "2026-10-28T13:33:49.849432283Z",
  "refresh_token": "iALvnSaYmL2zwL-Jn-2wipnbafST6v1DLrFNmeCNff8",
  "refresh_expires_at": "2026-11-27T13:18:49.848822585Z",
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
  "correlation_id": "23c1dd6f-39d1-47e7-b185-bf03e26550c2"
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
  "device_ref": "sandbox-27550"
}
```

```json
{
  "challenge_id": "2dd20b1c-242c-4f76-892c-f8f6d2a4c459",
  "expires_at": "2026-10-28T13:23:50.672865054Z",
  "resend_available_at": "2026-10-28T13:18:51.672865054Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "792119",
  "sent_at": "2026-10-28T13:18:50.674972866Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dd20b1c-242c-4f76-892c-f8f6d2a4c459",
  "code": "792119",
  "device_ref": "sandbox-27550"
}
```

```json
{
  "session_id": "fae4366b-b952-48da-a800-3d26b9b4c389",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDQzMSwiaWF0IjoxNzkzMTkzNTMxLCJqdGkiOiI1MTViMGJjYy1lMTFlLTQwYTUtOTczNS05NDk4MjNmYzhkYzYiLCJzaWQiOiJmYWU0MzY2Yi1iOTUyLTQ4ZGEtYTgwMC0zZDI2YjliNGMzODkifQ.9KkKYTkZzIAuRgxuBHK76oqbdWk0yGUTjaJxUgOfdBg",
  "access_expires_at": "2026-10-28T13:33:51.004607279Z",
  "refresh_token": "VCxcodoFhpyJ4nZK6Is1VOwuqiwSc0UZQSFaO_zKsio",
  "refresh_expires_at": "2026-11-27T13:18:51.004085298Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4d5c3a6-d7bd-4dbb-a28e-643934d6de88",
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
  "last_heartbeat_at": "2026-10-28T13:18:18.603699Z",
  "last_location_at": "2026-10-28T13:18:18.603699Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4d5c3a6-d7bd-4dbb-a28e-643934d6de88/handover` → **200**

```json
{
  "command_id": "27089e86-6797-452f-8a78-4e139c32ad73",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4d5c3a6-d7bd-4dbb-a28e-643934d6de88",
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
  "last_heartbeat_at": "2026-10-28T13:18:18.603699Z",
  "last_location_at": "2026-10-28T13:18:18.603699Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f4d5c3a6-d7bd-4dbb-a28e-643934d6de88/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:18:51Z",
    "sequence": 1793193531843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "f4d5c3a6-d7bd-4dbb-a28e-643934d6de88",
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
  "last_heartbeat_at": "2026-10-28T13:18:51.863079Z",
  "last_location_at": "2026-10-28T13:18:51.863079Z",
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
  "session_id": "f4d5c3a6-d7bd-4dbb-a28e-643934d6de88",
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
  "last_heartbeat_at": "2026-10-28T13:18:51.863079Z",
  "last_location_at": "2026-10-28T13:18:51.863079Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f4d5c3a6-d7bd-4dbb-a28e-643934d6de88/close` → **200**

```json
{
  "command_id": "310fd241-697f-47cf-8868-826e79febebd",
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
  "correlation_id": "030f86a2-63c4-480a-b9f8-767d1466a5fb"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677791468",
  "device_ref": "sandbox-20523"
}
```

```json
{
  "challenge_id": "67c8f0ac-3739-48e1-a1f6-00d9d6016312",
  "expires_at": "2026-10-28T13:23:53.278486413Z",
  "resend_available_at": "2026-10-28T13:18:54.278486413Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677791468` → **200**

```json
{
  "phone": "+380677791468",
  "audience": "CLIENT",
  "code": "172334",
  "sent_at": "2026-10-28T13:18:53.28054872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67c8f0ac-3739-48e1-a1f6-00d9d6016312",
  "code": "172334",
  "device_ref": "sandbox-20523"
}
```

```json
{
  "session_id": "5b928a13-bac8-4ab6-84fa-24f338c28ea0",
  "subject": {
    "type": "CLIENT",
    "id": "746dbe32-94a1-40e4-a864-c755f6b60399"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NDZkYmUzMi05NGExLTQwZTQtYTg2NC1jNzU1ZjZiNjAzOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk0NDMzLCJpYXQiOjE3OTMxOTM1MzMsImp0aSI6IjNjN2MxNjJlLTU1YzItNDFmMC04MGQ1LWJjY2YwNWY2MzQ3MCIsInNpZCI6IjViOTI4YTEzLWJhYzgtNGFiNi04NGZhLTI0ZjMzOGMyOGVhMCJ9.YdrjzzFZVmOBk7HLWK9EAncb-TCXDGcymlV-CFKWxjk",
  "access_expires_at": "2026-10-28T13:33:53.589388646Z",
  "refresh_token": "XIDBay3Tpx7N2TiFrXuvAXIo8Sa39LGSW3OvazYXfFA",
  "refresh_expires_at": "2026-11-27T13:18:53.588837671Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "dee5bb33-1544-4a1e-b386-5e03be4d6341",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "68bbe945-6e07-4352-b646-410e5fea1dd8",
  "upload_path": "/api/rider/v1/uploads/68bbe945-6e07-4352-b646-410e5fea1dd8",
  "expires_at": "2026-10-28T13:33:53.869107917Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/68bbe945-6e07-4352-b646-410e5fea1dd8` → **200**

```json
{
  "file_id": "68bbe945-6e07-4352-b646-410e5fea1dd8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "d3280d69-6b66-4838-b80e-24425e3acb64",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "68bbe945-6e07-4352-b646-410e5fea1dd8"
  ]
}
```

```json
{
  "id": "eeea0af5-2cef-4d92-ba69-8ee2986f8c0d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:18:54.199706Z",
  "updated_at": "2026-10-28T13:18:54.199706Z",
  "messages": [
    {
      "id": "341ebcbd-141f-4536-9276-0624db04cd81",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:18:54.201186Z",
      "attachments": [
        {
          "file_id": "68bbe945-6e07-4352-b646-410e5fea1dd8",
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
  "session_id": "9495bb26-d917-4c31-afe2-76de9cf38497",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MzQsImlhdCI6MTc5MzE5MzUzNCwianRpIjoiMGExMTA4OTAtNTBhMy00M2ZmLWEwY2MtNTc2NmUxN2M0ZmZlIiwic2lkIjoiOTQ5NWJiMjYtZDkxNy00YzMxLWFmZTItNzZkZTljZjM4NDk3In0.2DJLC7E712-QoQm6xtmSKVCKu8w1ny_RIbbKmi-tAiI",
  "access_expires_at": "2026-10-28T13:33:54.801123273Z",
  "refresh_token": "wTlMRFW7uqE2p9BonYZxpBmx18qxncoXwzj_ZlTntSE",
  "refresh_expires_at": "2026-10-29T01:18:54.800508448Z",
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
  "session_id": "aae2783b-53a4-40ff-9ddb-33e24c0c70ac",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MzUsImlhdCI6MTc5MzE5MzUzNSwianRpIjoiOGZiMzNhMzAtZmZlZC00NjMxLWI5YWUtZWY1ZmU4ZDMyZjlkIiwic2lkIjoiYWFlMjc4M2ItNTNhNC00MGZmLTlkZGItMzNlMjRjMGM3MGFjIn0.G_mVZrNd_FQsZKYOfHhPocbljZyXGwDSM0vGaleX3Z8",
  "access_expires_at": "2026-10-28T13:33:55.367958804Z",
  "refresh_token": "QRoz-WLuokujPYf832NBX45tFSOyOsm22-jIK_EsDzg",
  "refresh_expires_at": "2026-10-29T01:18:55.367203222Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/eeea0af5-2cef-4d92-ba69-8ee2986f8c0d/attachments/68bbe945-6e07-4352-b646-410e5fea1dd8` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "a64365e9-fcf3-4da2-840c-7ca69336fa41",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "e8f727d0-d2b4-4f3c-9548-0228efd19446",
  "upload_path": "/api/operator/v1/uploads/e8f727d0-d2b4-4f3c-9548-0228efd19446",
  "expires_at": "2026-10-28T13:33:55.664813266Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/e8f727d0-d2b4-4f3c-9548-0228efd19446` → **200**

```json
{
  "file_id": "e8f727d0-d2b4-4f3c-9548-0228efd19446",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/eeea0af5-2cef-4d92-ba69-8ee2986f8c0d` → **200**

```json
{
  "id": "eeea0af5-2cef-4d92-ba69-8ee2986f8c0d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T13:18:54.199706Z",
  "updated_at": "2026-10-28T13:18:54.199706Z",
  "messages": [
    {
      "id": "341ebcbd-141f-4536-9276-0624db04cd81",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:18:54.201186Z",
      "attachments": [
        {
          "file_id": "68bbe945-6e07-4352-b646-410e5fea1dd8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/eeea0af5-2cef-4d92-ba69-8ee2986f8c0d/comments` → **200**

```json
{
  "command_id": "da2c669f-68b6-41dc-a9a5-87daaf821e3d",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "e8f727d0-d2b4-4f3c-9548-0228efd19446"
  ]
}
```

```json
{
  "id": "eeea0af5-2cef-4d92-ba69-8ee2986f8c0d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:18:54.199706Z",
  "updated_at": "2026-10-28T13:18:56.284425Z",
  "messages": [
    {
      "id": "341ebcbd-141f-4536-9276-0624db04cd81",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:18:54.201186Z",
      "attachments": [
        {
          "file_id": "68bbe945-6e07-4352-b646-410e5fea1dd8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3641dfff-679a-4ade-bf16-7a54fd63ee29",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:18:56.283997Z",
      "attachments": [
        {
          "file_id": "e8f727d0-d2b4-4f3c-9548-0228efd19446",
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

`GET /api/rider/v1/support/cases/eeea0af5-2cef-4d92-ba69-8ee2986f8c0d` → **200**

```json
{
  "id": "eeea0af5-2cef-4d92-ba69-8ee2986f8c0d",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T13:18:54.199706Z",
  "updated_at": "2026-10-28T13:18:56.284425Z",
  "messages": [
    {
      "id": "341ebcbd-141f-4536-9276-0624db04cd81",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "746dbe32-94a1-40e4-a864-c755f6b60399",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T13:18:54.201186Z",
      "attachments": [
        {
          "file_id": "68bbe945-6e07-4352-b646-410e5fea1dd8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "3641dfff-679a-4ade-bf16-7a54fd63ee29",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T13:18:56.283997Z",
      "attachments": [
        {
          "file_id": "e8f727d0-d2b4-4f3c-9548-0228efd19446",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/eeea0af5-2cef-4d92-ba69-8ee2986f8c0d/attachments/e8f727d0-d2b4-4f3c-9548-0228efd19446` → **200**

Done: support case eeea0af5-2cef-4d92-ba69-8ee2986f8c0d, rider attachment 68bbe945-6e07-4352-b646-410e5fea1dd8, operator attachment e8f727d0-d2b4-4f3c-9548-0228efd19446.

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
  "session_id": "9d08c34e-4280-4621-8cec-01bb3867ebb3",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0MzcsImlhdCI6MTc5MzE5MzUzNywianRpIjoiNTNlNTY4MWEtOTliMS00N2E0LTg3MTEtMDgwZDExMGU1N2VjIiwic2lkIjoiOWQwOGMzNGUtNDI4MC00NjIxLThjZWMtMDFiYjM4NjdlYmIzIn0.vkg99xRFHw9phcpLrFEnoQkqd3PPI9tTRW2hcpzg7Zg",
  "access_expires_at": "2026-10-28T13:33:57.181095071Z",
  "refresh_token": "lwkO-cAp6LgggCQu369LgKy8-F1znX5MpOnh_vznV8c",
  "refresh_expires_at": "2026-10-29T01:18:57.180081363Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-266"
}
```

```json
{
  "challenge_id": "ed53be86-acd3-4867-a1dc-d6d2809b6e20",
  "expires_at": "2026-10-28T13:23:57.457029482Z",
  "resend_available_at": "2026-10-28T13:18:58.457029482Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "857438",
  "sent_at": "2026-10-28T13:18:57.459343188Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ed53be86-acd3-4867-a1dc-d6d2809b6e20",
  "code": "857438",
  "device_ref": "sandbox-266"
}
```

```json
{
  "session_id": "5e992fdd-f39e-4a11-92db-aa89a3c56b79",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDQzNywiaWF0IjoxNzkzMTkzNTM3LCJqdGkiOiJlYzI4YzAwZi1kYmNiLTQwMzYtOGIwNS03ZGE4YmMzYjIxYTQiLCJzaWQiOiI1ZTk5MmZkZC1mMzllLTRhMTEtOTJkYi1hYTg5YTNjNTZiNzkifQ.5nPMBhyoMb1MR9MzJPJ7Pj7btXyFJsA6xKQIT_N44Ls",
  "access_expires_at": "2026-10-28T13:33:57.755568474Z",
  "refresh_token": "0PIfr4OBalFQprnZz5TL870pkwjZ-JjfbE4RNIhQ1gc",
  "refresh_expires_at": "2026-11-27T13:18:57.754993273Z",
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
      "actor_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T13:18:45.840395Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "b3948ea9-305c-4583-a362-0e821bbde242",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T13:18:47.269354Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "c9a1278c-e55c-4d2e-b2b6-86ca51c74bf5",
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
  "device_ref": "sandbox-27191"
}
```

```json
{
  "challenge_id": "d1bffc20-bc1c-4289-959b-f7cc836e65ac",
  "expires_at": "2026-10-28T13:23:58.886139181Z",
  "resend_available_at": "2026-10-28T13:18:59.886139181Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "258845",
  "sent_at": "2026-10-28T13:18:58.888559179Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d1bffc20-bc1c-4289-959b-f7cc836e65ac",
  "code": "258845",
  "device_ref": "sandbox-27191"
}
```

```json
{
  "session_id": "4e008174-e0df-4356-b6d9-e34a341b2ff6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NDQzOSwiaWF0IjoxNzkzMTkzNTM5LCJqdGkiOiI4ZmY4MmViZi0xZjI3LTRjMGQtYmMyMy0zODk5ZTVjZjk0ZGMiLCJzaWQiOiI0ZTAwODE3NC1lMGRmLTQzNTYtYjZkOS1lMzRhMzQxYjJmZjYifQ.29PkNPboJwYhemuUYXo_DcT_8k85wmyhEVV4alHJTo4",
  "access_expires_at": "2026-10-28T13:33:59.200350818Z",
  "refresh_token": "0yPK1NJ94iMocVcY__C_JtIrsG6QULI-9lgZVjsSnlg",
  "refresh_expires_at": "2026-11-27T13:18:59.199727387Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:18:25.842002Z",
  "last_location_at": "2026-10-28T13:18:25.842002Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5e59889d-ebca-493e-8450-604c4e789a3f/handover` → **200**

```json
{
  "command_id": "bf54ced6-2d28-4d78-b450-a87f8c6da2b4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:18:25.842002Z",
  "last_location_at": "2026-10-28T13:18:25.842002Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5e59889d-ebca-493e-8450-604c4e789a3f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:19:00Z",
    "sequence": 1793193540567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:19:00.077891Z",
  "last_location_at": "2026-10-28T13:19:00.077891Z",
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
  "command_id": "12e2affd-8173-4d1b-aa59-73789cd2afd5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:19:00Z",
    "sequence": 1793193540635
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7dcedf7-802e-4662-9208-dd8c56275a05",
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
  "last_heartbeat_at": "2026-10-28T13:19:00.655151Z",
  "last_location_at": "2026-10-28T13:19:00.655151Z",
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
  "session_id": "238ad5f7-6571-4cbf-94d8-318091516a64",
  "subject": {
    "type": "STAFF",
    "id": "b3948ea9-305c-4583-a362-0e821bbde242"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMzk0OGVhOS0zMDVjLTQ1ODMtYTM2Mi0wZTgyMWJiZGUyNDIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTQ0NDEsImlhdCI6MTc5MzE5MzU0MSwianRpIjoiNGI5OGI0NTUtYWFhNS00YjkxLTk3ZmYtZWY2MDNhZTQ4NTI1Iiwic2lkIjoiMjM4YWQ1ZjctNjU3MS00Y2JmLTk0ZDgtMzE4MDkxNTE2YTY0In0.6bhZ4gAIDmA4eyXD9mSiFwZUBuJayAVjM5MeKYN2hVk",
  "access_expires_at": "2026-10-28T13:34:01.234446815Z",
  "refresh_token": "Ie07gsBfkag89CEDl9K7JTYq04B0CMkZT-1EvbYuZgY",
  "refresh_expires_at": "2026-10-29T01:19:01.233874298Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "69861e73-5a8f-4e32-8c18-4278d7195025",
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
  "id": "2e35e18e-7a98-45f5-ae73-7030a92e2047",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T13:24:01.515305Z",
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
  "command_id": "aa551675-6924-4599-bfe7-9e1ef485dd33",
  "quote_id": "2e35e18e-7a98-45f5-ae73-7030a92e2047",
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
  "id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "short_number": 21,
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
  "created_at": "2026-10-28T13:19:01.812871Z",
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
    "id": "1d99069b-8dcd-43c3-b123-10965074cca9",
    "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
    "expires_at": "2026-10-28T13:19:16.816808Z",
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

`POST /api/driver/v1/offers/1d99069b-8dcd-43c3-b123-10965074cca9/accept` → **200**

```json
{
  "command_id": "9752e5ce-d411-401f-ba51-8c90bbfe4466"
}
```

```json
{
  "id": "bbfa0b15-22ec-477a-bbbb-a9e2c639b244",
  "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "24ce8061-1dd4-45e3-bc38-fc50ae7a3850",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "24ce8061-1dd4-45e3-bc38-fc50ae7a3850",
  "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "assignment_id": "bbfa0b15-22ec-477a-bbbb-a9e2c639b244",
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

`POST /api/driver/v1/work-sessions/d7dcedf7-802e-4662-9208-dd8c56275a05/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:19:03Z",
    "sequence": 1793193543210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d7dcedf7-802e-4662-9208-dd8c56275a05",
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
  "last_heartbeat_at": "2026-10-28T13:19:03.228887Z",
  "last_location_at": "2026-10-28T13:19:03.228887Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/24ce8061-1dd4-45e3-bc38-fc50ae7a3850/arrive` → **200**

```json
{
  "command_id": "74434688-cc45-4819-8b4a-eefbc34565d0",
  "expected_version": 0
}
```

```json
{
  "id": "24ce8061-1dd4-45e3-bc38-fc50ae7a3850",
  "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "assignment_id": "bbfa0b15-22ec-477a-bbbb-a9e2c639b244",
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
  "arrived_at": "2026-10-28T13:19:03.511226Z",
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

`POST /api/driver/v1/trips/24ce8061-1dd4-45e3-bc38-fc50ae7a3850/start` → **200**

```json
{
  "command_id": "a53e8732-b33f-43f2-b995-ab2244d031ef",
  "expected_version": 1
}
```

```json
{
  "id": "24ce8061-1dd4-45e3-bc38-fc50ae7a3850",
  "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "assignment_id": "bbfa0b15-22ec-477a-bbbb-a9e2c639b244",
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
  "arrived_at": "2026-10-28T13:19:03.511226Z",
  "started_at": "2026-10-28T13:19:03.79851Z",
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

`POST /api/driver/v1/trips/24ce8061-1dd4-45e3-bc38-fc50ae7a3850/complete` → **200**

```json
{
  "command_id": "f662081e-f73c-48fa-9874-49076b0cfd24",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:19:04Z",
  "cash_received": true
}
```

```json
{
  "id": "24ce8061-1dd4-45e3-bc38-fc50ae7a3850",
  "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "assignment_id": "bbfa0b15-22ec-477a-bbbb-a9e2c639b244",
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
  "arrived_at": "2026-10-28T13:19:03.511226Z",
  "started_at": "2026-10-28T13:19:03.79851Z",
  "completed_at": "2026-10-28T13:19:04.095959Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/dbf8b2a9-c294-436c-9281-e7a73c9fe3a4` → **200**

```json
{
  "id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
  "short_number": 21,
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
    "id": "bbfa0b15-22ec-477a-bbbb-a9e2c639b244",
    "order_id": "dbf8b2a9-c294-436c-9281-e7a73c9fe3a4",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "24ce8061-1dd4-45e3-bc38-fc50ae7a3850",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T13:19:01.812871Z",
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
  "session_id": "5e59889d-ebca-493e-8450-604c4e789a3f",
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
  "last_heartbeat_at": "2026-10-28T13:19:00.077891Z",
  "last_location_at": "2026-10-28T13:19:00.077891Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5e59889d-ebca-493e-8450-604c4e789a3f/close` → **200**

```json
{
  "command_id": "8d3ca28c-0058-41d6-80b8-a6bfd772e067",
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
  "session_id": "d7dcedf7-802e-4662-9208-dd8c56275a05",
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
  "last_heartbeat_at": "2026-10-28T13:19:03.228887Z",
  "last_location_at": "2026-10-28T13:19:03.228887Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d7dcedf7-802e-4662-9208-dd8c56275a05/close` → **200**

```json
{
  "command_id": "48ac03ce-0ea9-46eb-a471-d2d3405d60f9",
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

Done: terminal order dbf8b2a9-c294-436c-9281-e7a73c9fe3a4 by Andrii (5a000000-0000-4000-8000-000000000403).
