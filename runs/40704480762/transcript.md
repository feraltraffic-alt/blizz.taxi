# Sandbox transcript (2026-10-28T14:18:27Z, dccfef0)

# Scenario: app-version

## Staff set a high driver minimum

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
  "correlation_id": "692d6d6b-a455-4424-894e-0adeb59649ad"
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
  "session_id": "85d396f0-fbc8-475c-96be-b9d1be1c7b92",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMTcsImlhdCI6MTc5MzE5NzExNywianRpIjoiYzMzODM4NTUtNTA1My00MGE3LTljMWMtNmFjMzc4YmI0NTNiIiwic2lkIjoiODVkMzk2ZjAtZmJjOC00NzVjLTk2YmUtYjlkMWJlMWM3YjkyIn0.EFydu1-GWGiQ9zopAx3JH8GFzbUEpim1N1mqDoljJ40",
  "access_expires_at": "2026-10-28T14:33:37.669716451Z",
  "refresh_token": "WsWI7OCovGI2ndOesR5NZn8V327toWPhNmzwwplQGfM",
  "refresh_expires_at": "2026-10-29T02:18:37.667670941Z",
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
  "session_id": "b21ec387-c2b3-4896-bc0a-2d11e15de03b",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMTksImlhdCI6MTc5MzE5NzExOSwianRpIjoiMDNmOWYyZjYtNDg2MS00NWVkLWI0MTQtZWM2NjUyMDQ3MDY3Iiwic2lkIjoiYjIxZWMzODctYzJiMy00ODk2LWJjMGEtMmQxMWUxNWRlMDNiIn0.eRJKuHkMUoUyjonq7J4OYmKYanOL4ZAjyIUmrnee36Y",
  "access_expires_at": "2026-10-28T14:33:39.192724639Z",
  "refresh_token": "ukXjhUknS1XGWBwj-LnKEJWtyt0jvB0EAJBjUoxI9uY",
  "refresh_expires_at": "2026-10-29T02:18:39.191627891Z",
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
    },
    "app_versions": null
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: bonuses

## The admin starts «Осінь −10 %» in Kyiv

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
  "session_id": "294dd13f-d4d5-4df3-b3d8-3fdf0cda5941",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMjAsImlhdCI6MTc5MzE5NzEyMCwianRpIjoiOTIzMGE0YjgtNmRiNC00MTQwLTljMTAtOGFkN2IyNzE3YjE2Iiwic2lkIjoiMjk0ZGQxM2YtZDRkNS00ZGYzLWIzZDgtM2ZkZjBjZGE1OTQxIn0.NChtI640fWyCv_wfn5c4LE_khutDOlzMr1ZnwkNuq78",
  "access_expires_at": "2026-10-28T14:33:40.15123867Z",
  "refresh_token": "r7u_4vpTsAI6JYEPzFctr801WFeB9cWjlluI9ynG6CA",
  "refresh_expires_at": "2026-10-29T02:18:40.150170696Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "c7f336f7-577b-44ef-9ec9-1be44ecf215c",
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
  "id": "02a9c313-7711-48cd-99bf-ce9e6e0f7b99",
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
  "created_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "created_at": "2026-10-28T14:18:40.448436Z",
  "updated_at": "2026-10-28T14:18:40.448436Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633871894",
  "device_ref": "sandbox-13861"
}
```

```json
{
  "challenge_id": "79546a3e-513f-4859-b0be-8671ca0dfdb4",
  "expires_at": "2026-10-28T14:23:40.740993068Z",
  "resend_available_at": "2026-10-28T14:18:41.740993068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633871894` → **200**

```json
{
  "phone": "+380633871894",
  "audience": "CLIENT",
  "code": "613101",
  "sent_at": "2026-10-28T14:18:40.748637637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "79546a3e-513f-4859-b0be-8671ca0dfdb4",
  "code": "613101",
  "device_ref": "sandbox-13861"
}
```

```json
{
  "session_id": "49c6ce32-5405-4527-9503-de3e9c96e448",
  "subject": {
    "type": "CLIENT",
    "id": "598f1e4b-f93d-4177-a3ee-bb288593750e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OThmMWU0Yi1mOTNkLTQxNzctYTNlZS1iYjI4ODU5Mzc1MGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDIxLCJpYXQiOjE3OTMxOTcxMjEsImp0aSI6IjgxNzgwZmY2LTg4NWMtNDUzZC1hODU1LTNiNWExZTE5ODcxOCIsInNpZCI6IjQ5YzZjZTMyLTU0MDUtNDUyNy05NTAzLWRlM2U5Yzk2ZTQ0OCJ9.8h2YS9T9mgiT3B79jqCE2yrlu_4AuibiQgYqwKv69Gw",
  "access_expires_at": "2026-10-28T14:33:41.072785858Z",
  "refresh_token": "K4QAJoeeC_Oo5rGVHsHMbx8G8gaFWrmcLRR-L2NdcJI",
  "refresh_expires_at": "2026-11-27T14:18:41.071536986Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633871894` → **200**

```json
{
  "client_id": "598f1e4b-f93d-4177-a3ee-bb288593750e"
}
```

`POST /api/admin/v1/rider-wallets/598f1e4b-f93d-4177-a3ee-bb288593750e/top-ups` → **201**

```json
{
  "command_id": "88aa8c9b-5432-45e6-81a6-3eff2065b011",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "598f1e4b-f93d-4177-a3ee-bb288593750e",
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
      "id": "7b595b4e-77c0-4a74-9b8a-1c2ac4717c92",
      "at": "2026-10-28T14:18:41.632444Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b5d09e13-e2ac-477c-bb3e-e9ac14634c83",
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
  "id": "358e5aa8-41e0-4ea7-b0c4-d0ffea268375",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:23:42.025922Z",
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
      "id": "02a9c313-7711-48cd-99bf-ce9e6e0f7b99",
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
  "device_ref": "sandbox-1900"
}
```

```json
{
  "challenge_id": "0193871a-ae4d-4750-8b72-9bd60a6dcaef",
  "expires_at": "2026-10-28T14:23:42.330136947Z",
  "resend_available_at": "2026-10-28T14:18:43.330136947Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "686083",
  "sent_at": "2026-10-28T14:18:42.333761483Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0193871a-ae4d-4750-8b72-9bd60a6dcaef",
  "code": "686083",
  "device_ref": "sandbox-1900"
}
```

```json
{
  "session_id": "dc2a4d2d-4b84-4394-be86-3e654ecf627e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAyMiwiaWF0IjoxNzkzMTk3MTIyLCJqdGkiOiIzYWFkOTIyMC00MGU4LTQ3ZDYtYTZkMS1lNTM2MDA5MDkzMmUiLCJzaWQiOiJkYzJhNGQyZC00Yjg0LTQzOTQtYmU4Ni0zZTY1NGVjZjYyN2UifQ.piHBIi0-L42MfTQ7kj0eDqxj8YV5FycMe4z5H_qy-Eo",
  "access_expires_at": "2026-10-28T14:33:42.628002211Z",
  "refresh_token": "o3Hk2C-7qjdCJrm9r5DPl8scWxf9giyvfFIhoJWh9_k",
  "refresh_expires_at": "2026-11-27T14:18:42.62687696Z",
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
  "command_id": "221cf9c0-afc0-4dbe-a8ec-d9e91b17218c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:43Z",
    "sequence": 1793197123162
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc63b987-2bcb-4bae-98ef-e85b0e3ab221",
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
  "last_heartbeat_at": "2026-10-28T14:18:43.205335Z",
  "last_location_at": "2026-10-28T14:18:43.205335Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "803bb555-3c87-4d82-a1f7-911d28f9b33d",
  "quote_id": "358e5aa8-41e0-4ea7-b0c4-d0ffea268375",
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
  "id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "598f1e4b-f93d-4177-a3ee-bb288593750e",
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
  "created_at": "2026-10-28T14:18:43.538051Z",
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
  "client_id": "598f1e4b-f93d-4177-a3ee-bb288593750e",
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
      "id": "7b595b4e-77c0-4a74-9b8a-1c2ac4717c92",
      "at": "2026-10-28T14:18:41.632444Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
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
    "id": "92616adc-b88e-4200-aae9-075042c82103",
    "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
    "expires_at": "2026-10-28T14:18:58.551675Z",
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

`POST /api/driver/v1/offers/92616adc-b88e-4200-aae9-075042c82103/accept` → **200**

```json
{
  "command_id": "328f927e-6db7-4d52-a804-113a209b6b9f"
}
```

```json
{
  "id": "eedd7154-8e9c-4664-b38c-346814948060",
  "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c475a89e-6c3b-463a-8f74-121e8c1535cb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c475a89e-6c3b-463a-8f74-121e8c1535cb",
  "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
  "assignment_id": "eedd7154-8e9c-4664-b38c-346814948060",
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

`POST /api/driver/v1/work-sessions/bc63b987-2bcb-4bae-98ef-e85b0e3ab221/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:18:44Z",
    "sequence": 1793197124955
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc63b987-2bcb-4bae-98ef-e85b0e3ab221",
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
  "last_heartbeat_at": "2026-10-28T14:18:44.982449Z",
  "last_location_at": "2026-10-28T14:18:44.982449Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c475a89e-6c3b-463a-8f74-121e8c1535cb/arrive` → **200**

```json
{
  "command_id": "7f20518f-54f8-4124-81d2-83b0afcffbe5",
  "expected_version": 0
}
```

```json
{
  "id": "c475a89e-6c3b-463a-8f74-121e8c1535cb",
  "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
  "assignment_id": "eedd7154-8e9c-4664-b38c-346814948060",
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
  "arrived_at": "2026-10-28T14:18:45.271972Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c475a89e-6c3b-463a-8f74-121e8c1535cb/start` → **200**

```json
{
  "command_id": "a0fee9d3-ec39-493d-be78-40e297f2cc5a",
  "expected_version": 1
}
```

```json
{
  "id": "c475a89e-6c3b-463a-8f74-121e8c1535cb",
  "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
  "assignment_id": "eedd7154-8e9c-4664-b38c-346814948060",
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
  "arrived_at": "2026-10-28T14:18:45.271972Z",
  "started_at": "2026-10-28T14:18:45.552351Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/c475a89e-6c3b-463a-8f74-121e8c1535cb/complete` → **200**

```json
{
  "command_id": "afa7a085-6688-45ec-b655-d1f65c9fd99b",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:18:45Z",
  "cash_received": true
}
```

```json
{
  "id": "c475a89e-6c3b-463a-8f74-121e8c1535cb",
  "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
  "assignment_id": "eedd7154-8e9c-4664-b38c-346814948060",
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
  "arrived_at": "2026-10-28T14:18:45.271972Z",
  "started_at": "2026-10-28T14:18:45.552351Z",
  "completed_at": "2026-10-28T14:18:45.86995Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "598f1e4b-f93d-4177-a3ee-bb288593750e",
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
      "id": "f43ec2ec-2d77-46b0-8d0e-b1fc6d05c367",
      "at": "2026-10-28T14:18:46.666673Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c"
    },
    {
      "id": "7b595b4e-77c0-4a74-9b8a-1c2ac4717c92",
      "at": "2026-10-28T14:18:41.632444Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/02a9c313-7711-48cd-99bf-ce9e6e0f7b99/archive` → **200**

```json
{
  "command_id": "42d17f52-96d3-429b-a841-5ad2ec444eae",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "02a9c313-7711-48cd-99bf-ce9e6e0f7b99",
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
  "created_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "created_at": "2026-10-28T14:18:40.448436Z",
  "updated_at": "2026-10-28T14:18:49.444692Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc63b987-2bcb-4bae-98ef-e85b0e3ab221",
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
  "last_heartbeat_at": "2026-10-28T14:18:44.982449Z",
  "last_location_at": "2026-10-28T14:18:44.982449Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc63b987-2bcb-4bae-98ef-e85b0e3ab221/close` → **200**

```json
{
  "command_id": "9875bb96-58b7-4ad2-bc79-29aff8bbe1a2",
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

Done: order e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c.

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
  "session_id": "17424849-80ab-4355-b3ac-10f9df8fca57",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMzAsImlhdCI6MTc5MzE5NzEzMCwianRpIjoiMTEwMzk3ODctODBmNi00NTdhLWJhNDEtMTQ1MzhjZTNiOGI0Iiwic2lkIjoiMTc0MjQ4NDktODBhYi00MzU1LWIzYWMtMTBmOWRmOGZjYTU3In0.GZvSJpLQcQXn899wg8dfMUnluhIf2JCW2umxKmnA8kU",
  "access_expires_at": "2026-10-28T14:33:50.59721138Z",
  "refresh_token": "G67Ta9U-waisIviN1ZD1oKh--EqzNR_ie7_TsiJy-dw",
  "refresh_expires_at": "2026-10-29T02:18:50.596449347Z",
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
  "command_id": "3018aed6-61b9-4976-8d25-4775d6c01c61",
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
  "session_id": "ae85f5e4-48e6-4c64-9796-f47c4f60c45a",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwMzEsImlhdCI6MTc5MzE5NzEzMSwianRpIjoiNTlkMWE0OTYtOWM1Yi00MDk5LTk0NGYtN2NmYjJmYmYyZDM0Iiwic2lkIjoiYWU4NWY1ZTQtNDhlNi00YzY0LTk3OTYtZjQ3YzRmNjBjNDVhIn0.JuxdPuU_-bO8LAVP5QJQkXn42phGA8TDlWI0xX5PBT8",
  "access_expires_at": "2026-10-28T14:33:51.711412992Z",
  "refresh_token": "46TdIBOgyOgNODJHm-fONZ_iW5D42onIJv28ZTIc8ro",
  "refresh_expires_at": "2026-10-29T02:18:51.710754172Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.881820750",
    "linkedid": "1730052700.881820750",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670165384"
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
    "id": "1730052700.881820750",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d91ff86d-7c1f-494f-a480-0eaae2776554",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:18:51.98039Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:18:52.01108Z",
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
    "id": "1730052600.74104259",
    "linkedid": "1730052600.74104259",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670165384"
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
      "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:18:52.318919Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/3dbc037f-ec55-457c-b6f7-6844aab23f26/answer` → **200**

```json
{
  "command_id": "e8109ca8-c832-42b5-b04a-192a595cef65"
}
```

```json
{
  "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670165384",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "order_ids": [],
  "started_at": "2026-10-28T14:18:52.318919Z",
  "answered_at": "2026-10-28T14:18:52.624456Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.74104259",
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
    "id": "1730052600.74104259",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [],
      "started_at": "2026-10-28T14:18:52.318919Z",
      "answered_at": "2026-10-28T14:18:52.624456Z",
      "ended_at": "2026-10-28T14:18:52.92209Z",
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
      "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [],
      "started_at": "2026-10-28T14:18:52.318919Z",
      "answered_at": "2026-10-28T14:18:52.624456Z",
      "ended_at": "2026-10-28T14:18:52.92209Z",
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
      "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [],
      "started_at": "2026-10-28T14:18:52.318919Z",
      "answered_at": "2026-10-28T14:18:52.624456Z",
      "ended_at": "2026-10-28T14:18:52.92209Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:18:56.470332Z"
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
      "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [],
      "started_at": "2026-10-28T14:18:52.318919Z",
      "answered_at": "2026-10-28T14:18:52.624456Z",
      "ended_at": "2026-10-28T14:18:52.92209Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:18:56.470332Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/3dbc037f-ec55-457c-b6f7-6844aab23f26/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/3dbc037f-ec55-457c-b6f7-6844aab23f26/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=3dbc037f-ec55-457c-b6f7-6844aab23f26` → **200**

```json
{
  "changes": [
    {
      "id": "c85f36ff-a932-4c51-9735-b6002580d405",
      "occurred_at": "2026-10-28T14:18:58.068883Z",
      "actor_type": "STAFF",
      "actor_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8a6d44a9-96d8-4f62-8847-717c2c284f16\", \"order_ids\": []}",
      "correlation_id": "670ded71-aa9e-4094-9772-e674c8511709"
    },
    {
      "id": "5a8fe9e3-f1ae-490d-89dc-d4b280974f64",
      "occurred_at": "2026-10-28T14:18:58.034704Z",
      "actor_type": "STAFF",
      "actor_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"8a6d44a9-96d8-4f62-8847-717c2c284f16\", \"order_ids\": []}",
      "correlation_id": "3e620635-3a0d-4149-9a97-60b80754f18c"
    }
  ]
}
```

Done: call 3dbc037f-ec55-457c-b6f7-6844aab23f26 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639037330",
  "device_ref": "sandbox-3303"
}
```

```json
{
  "challenge_id": "69b3605d-0777-4630-a0fc-d069cc7182c5",
  "expires_at": "2026-10-28T14:23:58.38570004Z",
  "resend_available_at": "2026-10-28T14:18:59.38570004Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639037330` → **200**

```json
{
  "phone": "+380639037330",
  "audience": "CLIENT",
  "code": "360392",
  "sent_at": "2026-10-28T14:18:58.389195157Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69b3605d-0777-4630-a0fc-d069cc7182c5",
  "code": "360392",
  "device_ref": "sandbox-3303"
}
```

```json
{
  "session_id": "d15953e5-ce89-4ec8-8d5c-f1e8945624c5",
  "subject": {
    "type": "CLIENT",
    "id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjM2FjYTM1MC04OWZjLTQ2MTYtOWI4Yy02M2IyZDViYWU3MGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDM4LCJpYXQiOjE3OTMxOTcxMzgsImp0aSI6IjNmYjlhMTczLTdkMTQtNDY0ZS05NWZkLWY0MzM3NmEzNzhlNSIsInNpZCI6ImQxNTk1M2U1LWNlODktNGVjOC04ZDVjLWYxZTg5NDU2MjRjNSJ9.B3RvS4V6W2RFRTE6npljZ4gLsTelfNnfn-WlnpPqYnE",
  "access_expires_at": "2026-10-28T14:33:58.677474533Z",
  "refresh_token": "u5f0LoY69xHQHibYo-G6kBVNGNtUdxmLoq9MdEIhyzk",
  "refresh_expires_at": "2026-11-27T14:18:58.676846691Z",
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
  "device_ref": "sandbox-25185"
}
```

```json
{
  "challenge_id": "b86cb099-fe9b-4299-9257-dfc96cfe744b",
  "expires_at": "2026-10-28T14:23:59.197767959Z",
  "resend_available_at": "2026-10-28T14:19:00.197767959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "970412",
  "sent_at": "2026-10-28T14:18:59.200796855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b86cb099-fe9b-4299-9257-dfc96cfe744b",
  "code": "970412",
  "device_ref": "sandbox-25185"
}
```

```json
{
  "session_id": "7478e7dd-f348-4537-a00a-1bf176649b57",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODAzOSwiaWF0IjoxNzkzMTk3MTM5LCJqdGkiOiJmZGQ2MjhhNS0xMTEzLTRlNWQtYTQxOS0xZTUxZmNmZjZlNWQiLCJzaWQiOiI3NDc4ZTdkZC1mMzQ4LTQ1MzctYTAwYS0xYmYxNzY2NDliNTcifQ.Jfbq_AeindRF9pt-GIgj0Knj7RSaMclJg4v_Q7TDacU",
  "access_expires_at": "2026-10-28T14:33:59.49525229Z",
  "refresh_token": "yQJpNSoY03NYWutq_eVxgoi0R8YkPwedftGWqBm0-ts",
  "refresh_expires_at": "2026-11-27T14:18:59.494600022Z",
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
  "session_id": "e5de1324-51e0-4286-b94f-737a5a6e35db",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwNDAsImlhdCI6MTc5MzE5NzE0MCwianRpIjoiN2EwODQ2OTktOTI4Mi00M2FkLThkN2YtMjBjODI2YzE2YTFmIiwic2lkIjoiZTVkZTEzMjQtNTFlMC00Mjg2LWI5NGYtNzM3YTVhNmUzNWRiIn0.R7vSfrUlNJUJfLYeAfVSqFmynnpiNpxupL-S_Enfrss",
  "access_expires_at": "2026-10-28T14:34:00.317178648Z",
  "refresh_token": "6A1eK1o6-C64_hswQocN2fkirPyPLDfnp--1hEkIvwI",
  "refresh_expires_at": "2026-10-29T02:19:00.316434007Z",
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
  "session_id": "2b1db89b-7754-4f77-b8a5-b83ad20411a7",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwNDAsImlhdCI6MTc5MzE5NzE0MCwianRpIjoiYmVkNWUxNWQtNDg5NC00YjI5LWJlOWUtOGM4NTE5Y2I1ODQyIiwic2lkIjoiMmIxZGI4OWItNzc1NC00Zjc3LWI4YTUtYjgzYWQyMDQxMWE3In0.zwRPLMkmYVz_AUTEps5PxsCZrZYWnl9Tjh5bYd95Kps",
  "access_expires_at": "2026-10-28T14:34:00.870102569Z",
  "refresh_token": "Nf7RajwrGVgh-QUFoS0n7Yc9FoX8fTCkvO0Zs6i2JOg",
  "refresh_expires_at": "2026-10-29T02:19:00.869343992Z",
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
  "command_id": "51e74965-740d-4798-8551-71a5e91365ce",
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
  "id": "a4bfd65f-bac2-4910-971b-38d73d1b36f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:01.415085Z",
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
  "command_id": "304af268-1b2f-450f-8707-de48a80b9465",
  "quote_id": "a4bfd65f-bac2-4910-971b-38d73d1b36f5",
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
  "id": "d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f",
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
  "created_at": "2026-10-28T14:19:01.70125Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3` → **200**

```json
{
  "id": "d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f",
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
  "created_at": "2026-10-28T14:19:01.70125Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3/cancel` → **200**

```json
{
  "command_id": "d88fe7ce-4237-4159-998c-d8c823cb0699",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f",
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
  "created_at": "2026-10-28T14:19:01.70125Z",
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
  "command_id": "7d0391f7-b01b-481e-b113-0d1630779c54",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:19:02Z",
    "sequence": 1793197142859
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2ca44e7-b111-4cc7-9f40-9e7e8499c85b",
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
  "last_heartbeat_at": "2026-10-28T14:19:02.879925Z",
  "last_location_at": "2026-10-28T14:19:02.879925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-27627"
}
```

```json
{
  "challenge_id": "7d7985d6-14ae-480f-aaa0-9733276d9adb",
  "expires_at": "2026-10-28T14:24:03.154457001Z",
  "resend_available_at": "2026-10-28T14:19:04.154457001Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "737842",
  "sent_at": "2026-10-28T14:19:03.157647068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7d7985d6-14ae-480f-aaa0-9733276d9adb",
  "code": "737842",
  "device_ref": "sandbox-27627"
}
```

```json
{
  "session_id": "e24a5232-e5ae-4931-8eed-10533a25ab4b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODA0MywiaWF0IjoxNzkzMTk3MTQzLCJqdGkiOiJlNGFhZDAyMi0zY2NkLTQzNmEtYmNjZS0zMTZmNTZiZGU3YjEiLCJzaWQiOiJlMjRhNTIzMi1lNWFlLTQ5MzEtOGVlZC0xMDUzM2EyNWFiNGIifQ.Us8c6r4HOGkqzpVVxq1pX2w39ch6-0tT5lFXfUKg1r0",
  "access_expires_at": "2026-10-28T14:34:03.453158177Z",
  "refresh_token": "MWF_QxKEY5TZAi1x93XR5wcIIYhtMJXwZQitAcF1UHM",
  "refresh_expires_at": "2026-11-27T14:19:03.452486583Z",
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
  "command_id": "5d6f9a8b-7939-4f9a-8be5-553852f72379",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:19:03Z",
    "sequence": 1793197143990
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5efabd95-a5c6-40d1-b46e-0bf17d3f035d",
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
  "last_heartbeat_at": "2026-10-28T14:19:04.011438Z",
  "last_location_at": "2026-10-28T14:19:04.011438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "47f9770b-9652-4811-b974-6c7bd9988ddc",
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
  "id": "f5608319-635c-4701-81c7-74cbd2155b4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:04.305171Z",
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
  "command_id": "52031e10-3a79-4609-b875-d272bc0b3e6c",
  "quote_id": "f5608319-635c-4701-81c7-74cbd2155b4b",
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
  "id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f",
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
  "created_at": "2026-10-28T14:19:04.590817Z",
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
    "id": "4ae3dd61-2b86-40e1-adf6-7350de181b61",
    "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
    "expires_at": "2026-10-28T14:19:19.594886Z",
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

`POST /api/driver/v1/offers/4ae3dd61-2b86-40e1-adf6-7350de181b61/accept` → **200**

```json
{
  "command_id": "be48e570-fb5d-4612-a641-90f8bacd58c1"
}
```

```json
{
  "id": "423de4a7-d806-4bac-8c10-2443e6c0bb3a",
  "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "276db224-233e-4c96-af51-4481d1379d6d",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "276db224-233e-4c96-af51-4481d1379d6d",
  "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "assignment_id": "423de4a7-d806-4bac-8c10-2443e6c0bb3a",
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

`POST /api/driver/v1/trips/276db224-233e-4c96-af51-4481d1379d6d/cancel` → **200**

```json
{
  "command_id": "09e62c73-4d28-4d05-8082-fa6ad3fd9dff",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "276db224-233e-4c96-af51-4481d1379d6d",
  "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "assignment_id": "423de4a7-d806-4bac-8c10-2443e6c0bb3a",
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

`GET /api/rider/v1/orders/cfcdc326-44b9-4f96-bd38-41d9b8745602` → **200**

```json
{
  "id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f",
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
    "id": "423de4a7-d806-4bac-8c10-2443e6c0bb3a",
    "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "276db224-233e-4c96-af51-4481d1379d6d",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:19:04.590817Z",
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
    "id": "4dc97686-fd50-4a63-9b03-ad7fc1b72368",
    "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
    "expires_at": "2026-10-28T14:19:20.72916Z",
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

`POST /api/driver/v1/offers/4dc97686-fd50-4a63-9b03-ad7fc1b72368/accept` → **200**

```json
{
  "command_id": "24563b1c-97c2-4f43-ad0e-8f98a82e9386"
}
```

```json
{
  "id": "ceb276c3-6805-47b4-84c9-241ec1e8a374",
  "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "15f73e43-1c7e-4bf2-991c-992c9fd36407",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "15f73e43-1c7e-4bf2-991c-992c9fd36407",
  "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "assignment_id": "ceb276c3-6805-47b4-84c9-241ec1e8a374",
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

`POST /api/driver/v1/trips/15f73e43-1c7e-4bf2-991c-992c9fd36407/cancel` → **200**

```json
{
  "command_id": "13f8ba3d-f15f-4c4d-bf76-ace947024890",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "15f73e43-1c7e-4bf2-991c-992c9fd36407",
  "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
  "assignment_id": "ceb276c3-6805-47b4-84c9-241ec1e8a374",
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
    "id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:19:04.590817Z",
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
    "id": "d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:19:01.70125Z",
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

`GET /api/operator/v1/orders/cfcdc326-44b9-4f96-bd38-41d9b8745602/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:19:04.591506Z",
      "actor": {
        "type": "CLIENT",
        "id": "c3aca350-89fc-4616-9b8c-63b2d5bae70f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
        "quote_id": "f5608319-635c-4701-81c7-74cbd2155b4b",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "d0ff398a-d1d6-4726-8839-b39a4be9095e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:19:04.593793Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
        "attempt_id": "2c3d0ff0-ff20-4bfe-8a6e-958cb94dc9a2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "d0ff398a-d1d6-4726-8839-b39a4be9095e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:19:04.601473Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4ae3dd61-2b86-40e1-adf6-7350de181b61",
        "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "d0ff398a-d1d6-4726-8839-b39a4be9095e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:19:05.165166Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4ae3dd61-2b86-40e1-adf6-7350de181b61",
        "order_id": "cfcdc326-44b9-4f96-bd38-41d9b8745602",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "423de4a7-d806-4bac-8c10-2443e6c0bb3a"
      },
      "correlation_id": "da0e1d29-d1c1-4bd1-a967-3a1bc4e402a2"
```

Done: orders d8eac04a-8cb7-4df4-a18a-9731f7cc8eb3, cfcdc326-44b9-4f96-bd38-41d9b8745602.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731780069",
  "device_ref": "sandbox-30801"
}
```

```json
{
  "challenge_id": "ba831ac4-d42f-4247-b1f9-d1cf7fe12e38",
  "expires_at": "2026-10-28T14:24:07.96296456Z",
  "resend_available_at": "2026-10-28T14:19:08.96296456Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380731780069` → **200**

```json
{
  "phone": "+380731780069",
  "audience": "CLIENT",
  "code": "214941",
  "sent_at": "2026-10-28T14:19:07.965932722Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba831ac4-d42f-4247-b1f9-d1cf7fe12e38",
  "code": "214941",
  "device_ref": "sandbox-30801"
}
```

```json
{
  "session_id": "c4c59ac7-6fae-4e37-85ce-456185045939",
  "subject": {
    "type": "CLIENT",
    "id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MGU5NTQ0Ny0yZDQxLTQ0NGYtYjc1YS03ZTAzZjJlMGYxZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDQ4LCJpYXQiOjE3OTMxOTcxNDgsImp0aSI6ImZjZTY3Zjc0LWJmZDQtNDI2YS04MzJiLTZiODM4Y2I2NDcxZSIsInNpZCI6ImM0YzU5YWM3LTZmYWUtNGUzNy04NWNlLTQ1NjE4NTA0NTkzOSJ9.0cBmqUBWq8wpRA1OlgIk7NbgSuOOATMclFf08sELOQc",
  "access_expires_at": "2026-10-28T14:34:08.260684135Z",
  "refresh_token": "IrZjbC_zowa4JggBGdBGfwORnme0NLA_IsLLK0Fd4xg",
  "refresh_expires_at": "2026-11-27T14:19:08.259986282Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0c7a7f46-3011-42d5-b9c7-7bc5003c9fae",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6d9fb5fb-1a2a-488d-b35a-4bd9d9cb11ba",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6d9fb5fb-1a2a-488d-b35a-4bd9d9cb11ba",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "98294172dceadde67498c10963a26da3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6d9fb5fb-1a2a-488d-b35a-4bd9d9cb11ba",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731780069"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6d9fb5fb-1a2a-488d-b35a-4bd9d9cb11ba",
  "expires_at": "2026-10-28T14:49:08.536509Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6d9fb5fb-1a2a-488d-b35a-4bd9d9cb11ba` → **200**

```json
{
  "id": "6d9fb5fb-1a2a-488d-b35a-4bd9d9cb11ba",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:49:08.536509Z",
  "card": {
    "id": "3b15bc0b-e407-40e1-9732-4e7e471ad5b9",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0065",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:19:08.823468Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "3b15bc0b-e407-40e1-9732-4e7e471ad5b9",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0065",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:19:08.823468Z"
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
  "device_ref": "sandbox-14279"
}
```

```json
{
  "challenge_id": "cbc7a4db-158f-49e2-9b32-4bf0f1efc61d",
  "expires_at": "2026-10-28T14:24:09.375681184Z",
  "resend_available_at": "2026-10-28T14:19:10.375681184Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "303153",
  "sent_at": "2026-10-28T14:19:09.379645567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cbc7a4db-158f-49e2-9b32-4bf0f1efc61d",
  "code": "303153",
  "device_ref": "sandbox-14279"
}
```

```json
{
  "session_id": "e47f9531-c122-44f9-bb0d-52ac5ee4aa54",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODA0OSwiaWF0IjoxNzkzMTk3MTQ5LCJqdGkiOiI0NDRmMWY4ZS1jZTAxLTQ4ZjItOTcxNC1iODQzNzgzM2E2NzUiLCJzaWQiOiJlNDdmOTUzMS1jMTIyLTQ0ZjktYmIwZC01MmFjNWVlNGFhNTQifQ.m47iX9VLOSj2A8QNNw6ubd7jMZ8CKb7GjjZC_HB8sNc",
  "access_expires_at": "2026-10-28T14:34:09.674306417Z",
  "refresh_token": "sflP4zSOBIc4q3I5v16VkXtEjCQvCRfMdMYYJC6Uc4E",
  "refresh_expires_at": "2026-11-27T14:19:09.673656694Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5efabd95-a5c6-40d1-b46e-0bf17d3f035d",
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
  "last_heartbeat_at": "2026-10-28T14:19:04.011438Z",
  "last_location_at": "2026-10-28T14:19:04.011438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5efabd95-a5c6-40d1-b46e-0bf17d3f035d/handover` → **200**

```json
{
  "command_id": "7780ec05-6561-4390-adff-4fc85c537039",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5efabd95-a5c6-40d1-b46e-0bf17d3f035d",
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
  "last_heartbeat_at": "2026-10-28T14:19:04.011438Z",
  "last_location_at": "2026-10-28T14:19:04.011438Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5efabd95-a5c6-40d1-b46e-0bf17d3f035d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:19:10Z",
    "sequence": 1793197150471
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5efabd95-a5c6-40d1-b46e-0bf17d3f035d",
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
  "last_heartbeat_at": "2026-10-28T14:19:10.493238Z",
  "last_location_at": "2026-10-28T14:19:10.493238Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "04225914-94c7-489a-8162-6eb5d687f22b",
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
  "id": "79b358d2-8018-44b4-a716-0f6ebe23df1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:10.765009Z",
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
  "command_id": "fb528e43-92db-4da4-b508-441b27677cba",
  "quote_id": "79b358d2-8018-44b4-a716-0f6ebe23df1e",
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
  "id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9",
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
  "created_at": "2026-10-28T14:19:11.054394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7` → **200**

```json
{
  "id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9",
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
  "created_at": "2026-10-28T14:19:11.054394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7` → **200**

```json
{
  "id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9",
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
  "created_at": "2026-10-28T14:19:11.054394Z",
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
    "id": "3fb66b11-59ed-4620-a278-80425a3a8d4a",
    "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
    "expires_at": "2026-10-28T14:19:26.81326Z",
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

`POST /api/driver/v1/offers/3fb66b11-59ed-4620-a278-80425a3a8d4a/accept` → **200**

```json
{
  "command_id": "eddfd27c-b668-4b44-b931-70816bf714fa"
}
```

```json
{
  "id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "assignment_id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
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

`POST /api/driver/v1/work-sessions/5efabd95-a5c6-40d1-b46e-0bf17d3f035d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:19:13Z",
    "sequence": 1793197153689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5efabd95-a5c6-40d1-b46e-0bf17d3f035d",
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
  "last_heartbeat_at": "2026-10-28T14:19:13.710514Z",
  "last_location_at": "2026-10-28T14:19:13.710514Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e5cf0aed-16a3-4e7b-a895-3f952b723ae7/arrive` → **200**

```json
{
  "command_id": "cfac1a2c-ffb8-4dde-b673-da555c8547cc",
  "expected_version": 0
}
```

```json
{
  "id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "assignment_id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
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
  "arrived_at": "2026-10-28T14:19:13.991984Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e5cf0aed-16a3-4e7b-a895-3f952b723ae7/start` → **200**

```json
{
  "command_id": "dacb3721-2dd7-4280-8660-73d7cb03db7b",
  "expected_version": 1
}
```

```json
{
  "id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "assignment_id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
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
  "arrived_at": "2026-10-28T14:19:13.991984Z",
  "started_at": "2026-10-28T14:19:14.289155Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e5cf0aed-16a3-4e7b-a895-3f952b723ae7/complete` → **200**

```json
{
  "command_id": "1b558a25-3a98-4b8d-a990-815a4142bdf8",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:19:14Z"
}
```

```json
{
  "id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "assignment_id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
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
  "arrived_at": "2026-10-28T14:19:13.991984Z",
  "started_at": "2026-10-28T14:19:14.289155Z",
  "completed_at": "2026-10-28T14:19:14.574058Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7` → **200**

```json
{
  "id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9",
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
    "id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
    "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:19:11.054394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7` → **200**

```json
{
  "id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9",
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
    "id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
    "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:19:11.054394Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7` → **200**

```json
{
  "id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "50e95447-2d41-444f-b75a-7e03f2e0f1e9",
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
    "id": "9a24bb5b-221d-4b1b-95f0-e855241da9f0",
    "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e5cf0aed-16a3-4e7b-a895-3f952b723ae7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:19:11.054394Z",
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
      "id": "8ad6995a-ea0a-4200-b881-40a1d6e06893",
      "at": "2026-10-28T14:19:14.87036Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7/tip` → **200**

```json
{
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
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
  "available_until": "2026-10-29T14:19:14.574058Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7/tip` → **201**

```json
{
  "command_id": "73e906db-59f0-4de5-9b79-ee33739e685f",
  "amount_minor": 2500
}
```

```json
{
  "id": "b3122daf-22be-4e37-954d-936cfe5725dc",
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:19:18.555123Z"
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7/tip` → **200**

```json
{
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
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
  "available_until": "2026-10-29T14:19:14.574058Z",
  "open": false,
  "tip": {
    "id": "b3122daf-22be-4e37-954d-936cfe5725dc",
    "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:19:18.555123Z"
  }
}
```

`GET /api/rider/v1/orders/1f7d51d9-6fca-4950-84a4-a8931e0799e7/tip` → **200**

```json
{
  "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
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
  "available_until": "2026-10-29T14:19:14.574058Z",
  "open": false,
  "tip": {
    "id": "b3122daf-22be-4e37-954d-936cfe5725dc",
    "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:19:18.555123Z"
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
      "id": "6b20afb9-2b77-4035-9a7f-99cb9330a3ce",
      "at": "2026-10-28T14:19:19.937352Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
      "counterpart_id": null
    },
    {
      "id": "8ad6995a-ea0a-4200-b881-40a1d6e06893",
      "at": "2026-10-28T14:19:14.87036Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1f7d51d9-6fca-4950-84a4-a8931e0799e7",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5efabd95-a5c6-40d1-b46e-0bf17d3f035d",
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
  "last_heartbeat_at": "2026-10-28T14:19:13.710514Z",
  "last_location_at": "2026-10-28T14:19:13.710514Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5efabd95-a5c6-40d1-b46e-0bf17d3f035d/close` → **200**

```json
{
  "command_id": "78b93b0a-0ea6-43fe-bd6c-9adf852a5986",
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

Done: card order 1f7d51d9-6fca-4950-84a4-a8931e0799e7.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380730435705",
  "device_ref": "sandbox-12338"
}
```

```json
{
  "challenge_id": "31ec4e82-ce7f-410d-90f1-a8316006b6a3",
  "expires_at": "2026-10-28T14:24:21.208925043Z",
  "resend_available_at": "2026-10-28T14:19:22.208925043Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380730435705` → **200**

```json
{
  "phone": "+380730435705",
  "audience": "CLIENT",
  "code": "661093",
  "sent_at": "2026-10-28T14:19:21.21170808Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31ec4e82-ce7f-410d-90f1-a8316006b6a3",
  "code": "661093",
  "device_ref": "sandbox-12338"
}
```

```json
{
  "session_id": "43e0a411-eeb3-4a4e-b7a9-832905eaa1f0",
  "subject": {
    "type": "CLIENT",
    "id": "1d778d19-06c8-4749-b530-354fa60b5a1e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDc3OGQxOS0wNmM4LTQ3NDktYjUzMC0zNTRmYTYwYjVhMWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDYxLCJpYXQiOjE3OTMxOTcxNjEsImp0aSI6ImNjMzVmMGNiLTkzZDgtNDBhYi1iNjg2LTc3NDdkNjgzZThhZSIsInNpZCI6IjQzZTBhNDExLWVlYjMtNGE0ZS1iN2E5LTgzMjkwNWVhYTFmMCJ9.YEe14a41kJn7fKn0LsnvztQxWmyySmLMX7ZGM2N5-lA",
  "access_expires_at": "2026-10-28T14:34:21.50136361Z",
  "refresh_token": "GbTwG-7SLZW7WaOzV6BAOhshK_Kq6H6rrx8j8aP45HE",
  "refresh_expires_at": "2026-11-27T14:19:21.500767673Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "c349bd8a-1648-4b61-9591-b4df92be3958",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "ab9a1620-796f-4b9b-9616-71bd06b96b43",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ab9a1620-796f-4b9b-9616-71bd06b96b43",
    "orderDate": "1793197161",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "193d8b475680b5a6f285c3bb4e3b6ca4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ab9a1620-796f-4b9b-9616-71bd06b96b43",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730435705"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ab9a1620-796f-4b9b-9616-71bd06b96b43",
  "created_at": "2026-10-28T14:19:21.783945Z",
  "expires_at": "2026-10-28T14:49:21.783945Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/ab9a1620-796f-4b9b-9616-71bd06b96b43` → **200**

```json
{
  "id": "ab9a1620-796f-4b9b-9616-71bd06b96b43",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:19:21.783945Z",
  "expires_at": "2026-10-28T14:49:21.783945Z",
  "completed_at": "2026-10-28T14:19:22.060301Z",
  "masked_pan": "41****6784",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1d778d19-06c8-4749-b530-354fa60b5a1e",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1d778d19-06c8-4749-b530-354fa60b5a1e",
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
      "id": "9457db40-5bfa-43ae-a3ab-6b6ca3fbacbc",
      "at": "2026-10-28T14:19:22.955354Z",
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
  "client_id": "1d778d19-06c8-4749-b530-354fa60b5a1e",
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
      "id": "9457db40-5bfa-43ae-a3ab-6b6ca3fbacbc",
      "at": "2026-10-28T14:19:22.955354Z",
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
  "device_ref": "sandbox-30396"
}
```

```json
{
  "challenge_id": "2c215c75-787f-463c-9811-f64fa7b4952b",
  "expires_at": "2026-10-28T14:24:24.192720875Z",
  "resend_available_at": "2026-10-28T14:19:25.192720875Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "869647",
  "sent_at": "2026-10-28T14:19:24.1956457Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c215c75-787f-463c-9811-f64fa7b4952b",
  "code": "869647",
  "device_ref": "sandbox-30396"
}
```

```json
{
  "session_id": "b744aa5e-9d2c-41fa-a9fe-17af53ac779e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODA2NCwiaWF0IjoxNzkzMTk3MTY0LCJqdGkiOiIxMmY1ZDYyZC03MjQ4LTQ4MzUtYWYyYy04MGY4ZjA5ZDZmNzUiLCJzaWQiOiJiNzQ0YWE1ZS05ZDJjLTQxZmEtYTlmZS0xN2FmNTNhYzc3OWUifQ.2xCOvjptLODX5ZzpG8M9Z9b0ui5n2qGs6cZ8jnG4R_Q",
  "access_expires_at": "2026-10-28T14:34:24.484775766Z",
  "refresh_token": "RNwRZrzZJBuafC-ipDl4v6lbadoMg30dAOKR6J5bPGM",
  "refresh_expires_at": "2026-11-27T14:19:24.484143064Z",
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
  "command_id": "58e1c6cd-0f23-4cef-bf6b-e917d33a4b5a",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "4e1316c6-7c67-4c93-9e6d-dc801d9fe1b4",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4e1316c6-7c67-4c93-9e6d-dc801d9fe1b4",
    "orderDate": "1793197165",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "058e931ca96d643c7779abb43a3327b3",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4e1316c6-7c67-4c93-9e6d-dc801d9fe1b4",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4e1316c6-7c67-4c93-9e6d-dc801d9fe1b4",
  "created_at": "2026-10-28T14:19:25.030758Z",
  "expires_at": "2026-10-28T14:49:25.030758Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/4e1316c6-7c67-4c93-9e6d-dc801d9fe1b4` → **200**

```json
{
  "id": "4e1316c6-7c67-4c93-9e6d-dc801d9fe1b4",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:19:25.030758Z",
  "expires_at": "2026-10-28T14:49:25.030758Z",
  "completed_at": "2026-10-28T14:19:25.305654Z",
  "masked_pan": "41****4959",
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
      "id": "76d7d4ca-7f2b-4250-a38d-ea62a122e6a1",
      "at": "2026-10-28T14:19:25.971315Z",
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
  "command_id": "155e0435-33ba-4bdf-960a-0feeb3a61abe",
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
  "correlation_id": "8408c941-9ab3-44c7-bf90-97801a68725c"
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
  "session_id": "be79292e-6da5-495b-8fdf-6364589c5662",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwNjcsImlhdCI6MTc5MzE5NzE2NywianRpIjoiZTU0ZmUxYzEtNzE1Ny00MTE0LWIzM2ItMjJkMjQwNzUyZTIzIiwic2lkIjoiYmU3OTI5MmUtNmRhNS00OTViLThmZGYtNjM2NDU4OWM1NjYyIn0.z6pfWsAek9oPJYzyqDxNmy9vIDrNpQ3-AoCCiiFmP5k",
  "access_expires_at": "2026-10-28T14:34:27.716059078Z",
  "refresh_token": "HyWR22SLs9pP0Z1hyQZpbkjFNXJycbRjjAS2xt_V8os",
  "refresh_expires_at": "2026-10-29T02:19:27.71548169Z",
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
  ],
  "app_versions": null
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
  "phone": "+48600263229",
  "device_ref": "sandbox-23902"
}
```

```json
{
  "challenge_id": "e3798e77-8965-48e9-9899-c989a4dcfe3b",
  "expires_at": "2026-10-28T14:24:28.52118273Z",
  "resend_available_at": "2026-10-28T14:19:29.52118273Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600263229` → **200**

```json
{
  "phone": "+48600263229",
  "audience": "CLIENT",
  "code": "815436",
  "sent_at": "2026-10-28T14:19:28.524018124Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3798e77-8965-48e9-9899-c989a4dcfe3b",
  "code": "815436",
  "device_ref": "sandbox-23902"
}
```

```json
{
  "session_id": "b069d957-4195-4aff-9151-8a26861ce1f8",
  "subject": {
    "type": "CLIENT",
    "id": "c8cd1d5c-cbb5-40b5-acd3-8445d016b1fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGNkMWQ1Yy1jYmI1LTQwYjUtYWNkMy04NDQ1ZDAxNmIxZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDY4LCJpYXQiOjE3OTMxOTcxNjgsImp0aSI6ImZjMzZiMzMyLWY1YjUtNGM0OS1hM2U0LTdmZTdiZjVjZDUyMSIsInNpZCI6ImIwNjlkOTU3LTQxOTUtNGFmZi05MTUxLThhMjY4NjFjZTFmOCJ9.RBHPE2PiMKz7vOLm1ppquAdGLL_247n2WxJeS-iqGtU",
  "access_expires_at": "2026-10-28T14:34:28.820976996Z",
  "refresh_token": "InmhKaGxrnNwKBxd3BR5dAerSo36MAyyEfYK4LJZXMo",
  "refresh_expires_at": "2026-11-27T14:19:28.820330809Z",
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
  "command_id": "740482f0-2d48-42d5-adb3-ad02a42a6891",
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
  "correlation_id": "9ff88cd9-eee8-4590-959d-79f6da02f207",
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
  "command_id": "061a093b-db2d-405c-8a5f-82c3c82680b7",
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
  "paused_at": "2026-10-28T14:19:29.922451634Z",
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
  ],
  "app_versions": null
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0352b66b-4d1a-4404-bf21-ce87ca357c16",
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
  "id": "156d5ab1-35ac-4b43-9a72-be33c1e8e5a3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:30.494471Z",
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
  "command_id": "e50fd541-e3a1-4505-8347-6d81a663619f",
  "quote_id": "156d5ab1-35ac-4b43-9a72-be33c1e8e5a3",
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
  "correlation_id": "995f33da-8b94-493a-9844-02af4bc3eff6"
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
  "paused_at": "2026-10-28T14:19:29.922452Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "389c0583-1f92-4922-a4f1-728e06d52c6d",
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
  "command_id": "b2514894-01b0-4981-b540-bf2efca8c2cc",
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
  "command_id": "0abd94d1-7a65-449c-8bca-4f5fcca9570f",
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
  "id": "7d7933e3-9c6c-4190-85da-f692ef5e7fab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:32.166656Z",
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
  "command_id": "b71f18ab-2553-47a5-818d-c092260de440",
  "quote_id": "7d7933e3-9c6c-4190-85da-f692ef5e7fab",
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
  "correlation_id": "fbf08f2e-5b5f-44f1-a2bc-8af09837866f"
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
  "command_id": "bacd7ede-c340-4e14-a590-b32b7af328bc",
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
  "command_id": "ea074fbf-16fc-45be-b5f4-91799e52facc",
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
  "id": "c82d3406-3e7f-4439-9b93-3216589e500b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:33.291271Z",
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
  "command_id": "3362c9ba-7619-44f0-bf73-c050d479a0b5",
  "quote_id": "c82d3406-3e7f-4439-9b93-3216589e500b",
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
  "correlation_id": "84d2bac4-b67c-4b74-a00c-b0794303a899"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6e816fe6-bb59-43fc-bd89-6f1046e4639e",
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
  "correlation_id": "9692182a-4038-47d2-bc76-7308568b110e"
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
  "command_id": "19ca53a5-bd8e-41b5-8c22-1cd86d35677a",
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
  "phone": "+380672652147",
  "device_ref": "sandbox-1686"
}
```

```json
{
  "challenge_id": "3924f083-13a3-4c8c-88f2-f894cf6fec38",
  "expires_at": "2026-10-28T14:24:34.691312946Z",
  "resend_available_at": "2026-10-28T14:19:35.691312946Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672652147` → **200**

```json
{
  "phone": "+380672652147",
  "audience": "CLIENT",
  "code": "217969",
  "sent_at": "2026-10-28T14:19:34.694302969Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3924f083-13a3-4c8c-88f2-f894cf6fec38",
  "code": "217969",
  "device_ref": "sandbox-1686"
}
```

```json
{
  "session_id": "803e3eac-49f8-4968-afde-61e2c23d64fa",
  "subject": {
    "type": "CLIENT",
    "id": "1d5709e6-f5c6-41ed-8912-ffbe00baafb0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxZDU3MDllNi1mNWM2LTQxZWQtODkxMi1mZmJlMDBiYWFmYjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDc0LCJpYXQiOjE3OTMxOTcxNzQsImp0aSI6IjJhYzg2MDQyLWQyNmEtNDc5NS04ZWY1LTQ0YzFmYmIxMGFjZiIsInNpZCI6IjgwM2UzZWFjLTQ5ZjgtNDk2OC1hZmRlLTYxZTJjMjNkNjRmYSJ9.Ojq6EGf4_AQ7BiU4eTUbic7lrMW3jXfkzK9x26i0yxM",
  "access_expires_at": "2026-10-28T14:34:34.988347132Z",
  "refresh_token": "9WzQmmeRTsbvpcqTbJjjUSqcHmxRWx2oPLelqfcsAX0",
  "refresh_expires_at": "2026-11-27T14:19:34.987751199Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1d5709e6-f5c6-41ed-8912-ffbe00baafb0",
  "session_id": "803e3eac-49f8-4968-afde-61e2c23d64fa",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e301ab82-7216-4e70-bb79-208178534631",
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
  "id": "08eccce4-4a04-453c-b858-f6761f7c20fa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:35.526834Z",
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
  "challenge_id": "45fc0d4c-190a-49e1-8e02-2813106711f8",
  "expires_at": "2026-10-28T14:24:37.806108119Z",
  "resend_available_at": "2026-10-28T14:19:38.806108119Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672652147` → **200**

```json
{
  "phone": "+380672652147",
  "audience": "CLIENT",
  "code": "107156",
  "sent_at": "2026-10-28T14:19:37.808126578Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "069c0b1c-7b63-4e4a-ad8d-c60f52b90db7",
  "challenge_id": "45fc0d4c-190a-49e1-8e02-2813106711f8",
  "otp_code": "107156"
}
```

```json
{
  "client_id": "1d5709e6-f5c6-41ed-8912-ffbe00baafb0",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:19:38.109443624Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "f0185ea8-b070-4eff-8377-27e27f48e87f",
  "quote_id": "08eccce4-4a04-453c-b858-f6761f7c20fa",
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
  "correlation_id": "2bb1d4d8-ed35-4afd-a83d-1d344f74270c"
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
  "session_id": "1fa7e292-abba-4998-aa16-a7b12a12c3eb",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwNzgsImlhdCI6MTc5MzE5NzE3OCwianRpIjoiMzA1YzBkMTItZjFjNy00Y2E0LTk0NDktN2I5ODU1Yzc0YjgzIiwic2lkIjoiMWZhN2UyOTItYWJiYS00OTk4LWFhMTYtYTdiMTJhMTJjM2ViIn0.jqYg9f6ImnUTIyYN3orzcN7CS2MWZfuX4gKNRj2GbWI",
  "access_expires_at": "2026-10-28T14:34:38.959768388Z",
  "refresh_token": "5eYdgWokAG0ODJIxVcnzXUl-34IDAQsDePKDq7VEmMs",
  "refresh_expires_at": "2026-10-29T02:19:38.959124248Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "1d5709e6-f5c6-41ed-8912-ffbe00baafb0",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:19:38.109444Z",
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

`POST /api/admin/v1/client-deletions/1d5709e6-f5c6-41ed-8912-ffbe00baafb0/complete` → **200**

```json
{
  "command_id": "ec0ad5e0-db2c-439f-8aa9-a14d7c5a2280",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "1d5709e6-f5c6-41ed-8912-ffbe00baafb0",
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
  "correlation_id": "d09bb1c4-eec4-4aaa-81c0-79aecd846cf1"
}
```

Done: client 1d5709e6-f5c6-41ed-8912-ffbe00baafb0 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661914343",
  "device_ref": "sandbox-31731"
}
```

```json
{
  "challenge_id": "ea013a7f-4032-474e-a3aa-b7bf1b481550",
  "expires_at": "2026-10-28T14:24:40.146735389Z",
  "resend_available_at": "2026-10-28T14:19:41.146735389Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661914343` → **200**

```json
{
  "phone": "+380661914343",
  "audience": "CLIENT",
  "code": "685519",
  "sent_at": "2026-10-28T14:19:40.149718867Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea013a7f-4032-474e-a3aa-b7bf1b481550",
  "code": "685519",
  "device_ref": "sandbox-31731"
}
```

```json
{
  "session_id": "0a524ee9-8434-4579-9230-643929dc80ed",
  "subject": {
    "type": "CLIENT",
    "id": "11a33017-4ef0-40e6-8e12-e805197ee325"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWEzMzAxNy00ZWYwLTQwZTYtOGUxMi1lODA1MTk3ZWUzMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDgwLCJpYXQiOjE3OTMxOTcxODAsImp0aSI6IjU1NjRlNTk2LTEzZWYtNDBkYi1hMGJmLWFjY2M2OGIzYzZmMSIsInNpZCI6IjBhNTI0ZWU5LTg0MzQtNDU3OS05MjMwLTY0MzkyOWRjODBlZCJ9.b-xmrig1UsPxr-RYuIV7_wLC1AVS-dIzKe8ez9Iujpo",
  "access_expires_at": "2026-10-28T14:34:40.444519482Z",
  "refresh_token": "cvdenrNFlSah792WdvUUurhKyOMpwhYOKRYG7nSTZZw",
  "refresh_expires_at": "2026-11-27T14:19:40.443948185Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "11a33017-4ef0-40e6-8e12-e805197ee325",
  "session_id": "0a524ee9-8434-4579-9230-643929dc80ed",
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
  "session_id": "cdd27643-2b69-4d5c-b4ae-105f5fa9d49c",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwODEsImlhdCI6MTc5MzE5NzE4MSwianRpIjoiOWQwOTk2NzktOTUxZC00NmViLTg0MjMtZTVhN2Y4ZTlkZTNhIiwic2lkIjoiY2RkMjc2NDMtMmI2OS00ZDVjLWI0YWUtMTA1ZjVmYTlkNDljIn0.moxPJJuSXSyW1rVOczuSy7zRY_bdlx_H_mawGXv1YBk",
  "access_expires_at": "2026-10-28T14:34:41.277342023Z",
  "refresh_token": "xBRfiHJHma8EhTHkHhds930mIYryygFXq17ZUsDW7k0",
  "refresh_expires_at": "2026-10-29T02:19:41.276722095Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=1914343&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "11a33017-4ef0-40e6-8e12-e805197ee325",
      "phone": "+380661914343",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:19:40.441951Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/11a33017-4ef0-40e6-8e12-e805197ee325` → **200**

```json
{
  "client": {
    "id": "11a33017-4ef0-40e6-8e12-e805197ee325",
    "phone": "+380661914343",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:19:40.441951Z",
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

`POST /api/admin/v1/clients/11a33017-4ef0-40e6-8e12-e805197ee325/block` → **400**

```json
{
  "command_id": "69c5c25d-1494-4056-98d9-6e27475ad758",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/11a33017-4ef0-40e6-8e12-e805197ee325/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "73ca7473-da04-4e97-b0b1-122f538cf19f",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/11a33017-4ef0-40e6-8e12-e805197ee325/block` → **200**

```json
{
  "command_id": "bac9f71d-cada-430d-ae79-a26c065ab962",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "11a33017-4ef0-40e6-8e12-e805197ee325",
  "phone": "+380661914343",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:19:40.441951Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:19:42.430027Z",
    "by": "29e60344-3672-4781-bd0b-03ba5bf95292"
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
  "correlation_id": "d20958d1-6f60-4d53-9b85-69703bd41483"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661914343",
  "device_ref": "sandbox-4880"
}
```

```json
{
  "challenge_id": "1f9e3fa6-0491-4882-bd75-f2fe05bd8ec4",
  "expires_at": "2026-10-28T14:24:44.991650675Z",
  "resend_available_at": "2026-10-28T14:19:45.991650675Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661914343` → **200**

```json
{
  "phone": "+380661914343",
  "audience": "CLIENT",
  "code": "730547",
  "sent_at": "2026-10-28T14:19:44.99459372Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "1f9e3fa6-0491-4882-bd75-f2fe05bd8ec4",
  "code": "730547",
  "device_ref": "sandbox-4880"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "752f9a52-70c0-4ca9-81bc-59f36e083c3b"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/11a33017-4ef0-40e6-8e12-e805197ee325` → **200**

```json
{
  "client": {
    "id": "11a33017-4ef0-40e6-8e12-e805197ee325",
    "phone": "+380661914343",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:19:40.441951Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:19:42.430027Z",
      "by": "29e60344-3672-4781-bd0b-03ba5bf95292"
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

`POST /api/admin/v1/clients/11a33017-4ef0-40e6-8e12-e805197ee325/unblock` → **200**

```json
{
  "command_id": "2fb9758b-cd28-4002-a116-498cf361579a",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "11a33017-4ef0-40e6-8e12-e805197ee325",
  "phone": "+380661914343",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:19:40.441951Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661914343",
  "device_ref": "sandbox-13707"
}
```

```json
{
  "challenge_id": "92f649ff-6970-43e1-8988-47c4cb02f86b",
  "expires_at": "2026-10-28T14:24:48.1240286Z",
  "resend_available_at": "2026-10-28T14:19:49.1240286Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661914343` → **200**

```json
{
  "phone": "+380661914343",
  "audience": "CLIENT",
  "code": "126410",
  "sent_at": "2026-10-28T14:19:48.12654597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "92f649ff-6970-43e1-8988-47c4cb02f86b",
  "code": "126410",
  "device_ref": "sandbox-13707"
}
```

```json
{
  "session_id": "e65154bd-4e31-4fcf-aeaa-60ebb5fb5fbc",
  "subject": {
    "type": "CLIENT",
    "id": "11a33017-4ef0-40e6-8e12-e805197ee325"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMWEzMzAxNy00ZWYwLTQwZTYtOGUxMi1lODA1MTk3ZWUzMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDg4LCJpYXQiOjE3OTMxOTcxODgsImp0aSI6ImZkYTUwOGM1LTdlZWQtNDBhZS1hMzI3LWQzYjY4ODhmZmY4OSIsInNpZCI6ImU2NTE1NGJkLTRlMzEtNGZjZi1hZWFhLTYwZWJiNWZiNWZiYyJ9.-UiX74gFctQRvGACUo1dF7irFVnK0c9MAKN44yoK78Y",
  "access_expires_at": "2026-10-28T14:34:48.423564465Z",
  "refresh_token": "8QpEApX_6BDc9QOLBuu3CYFE5ZyB1bOQiUWJkkK-SIc",
  "refresh_expires_at": "2026-11-27T14:19:48.422879476Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "11a33017-4ef0-40e6-8e12-e805197ee325",
  "session_id": "e65154bd-4e31-4fcf-aeaa-60ebb5fb5fbc",
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
  "phone": "+380663690519",
  "device_ref": "sandbox-26520"
}
```

```json
{
  "challenge_id": "49e614c9-9dfe-4d42-bddb-6dad5403dc22",
  "expires_at": "2026-10-28T14:24:48.964379991Z",
  "resend_available_at": "2026-10-28T14:19:49.964379991Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380663690519` → **200**

```json
{
  "phone": "+380663690519",
  "audience": "CLIENT",
  "code": "727914",
  "sent_at": "2026-10-28T14:19:48.966867756Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49e614c9-9dfe-4d42-bddb-6dad5403dc22",
  "code": "727914",
  "device_ref": "sandbox-26520"
}
```

```json
{
  "session_id": "5114d19f-f44f-4e68-aae6-39b18f5a0d49",
  "subject": {
    "type": "CLIENT",
    "id": "0398f42b-9add-463b-bd94-6cb7ad8aa5d5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzk4ZjQyYi05YWRkLTQ2M2ItYmQ5NC02Y2I3YWQ4YWE1ZDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDg5LCJpYXQiOjE3OTMxOTcxODksImp0aSI6ImUzNWI3MjE4LWQyMDEtNDFkYy1iODM1LWM5N2Q2N2U4NjIwNSIsInNpZCI6IjUxMTRkMTlmLWY0NGYtNGU2OC1hYWU2LTM5YjE4ZjVhMGQ0OSJ9.6XQ1pXRSBoiiw_SgVoi7IZX4UneLbu7I4KUbWI1G1mw",
  "access_expires_at": "2026-10-28T14:34:49.256223836Z",
  "refresh_token": "it8JhUrP-YwfBXLCfFlLzxWn13FvLjk4WFCb3Ng8zvo",
  "refresh_expires_at": "2026-11-27T14:19:49.255618726Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "475d7cbb-62a8-4c4c-b1e4-94bdd40911ac",
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
  "id": "16642479-bf17-45af-a7e4-90a7fd60dd23",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:24:49.530643Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 8f218b60-d4fe-4d9e-87be-f0afbd5d54cd) → **201**

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
  "session_id": "87dc3b19-e3b5-49d4-a770-e14f4552b833",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwOTAsImlhdCI6MTc5MzE5NzE5MCwianRpIjoiOGUwN2JhYzMtYjU2ZS00NjA2LWJkMTAtYmMwNWRmNjZiYWJjIiwic2lkIjoiODdkYzNiMTktZTNiNS00OWQ0LWE3NzAtZTE0ZjQ1NTJiODMzIn0.sUjJT52v6lWFkUHrhNPUiQZ_nin36Cmw7-GsnIRQML0",
  "access_expires_at": "2026-10-28T14:34:50.156548199Z",
  "refresh_token": "XNFAUH8wlYqXekWGJrBz2S9AYb0fhP87IAbwgoL7fXQ",
  "refresh_expires_at": "2026-10-29T02:19:50.155974698Z",
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
  "session_id": "11dbb84d-a12b-4056-9d2d-a6c01e98122a",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwOTAsImlhdCI6MTc5MzE5NzE5MCwianRpIjoiZjYyZWQyN2ItYjExOC00Mjk5LTk0NjEtOGRjM2NiMzk5YmRhIiwic2lkIjoiMTFkYmI4NGQtYTEyYi00MDU2LTlkMmQtYTZjMDFlOTgxMjJhIn0.WHbcgBxhd7Ld4IcM33EUEpFnWrqAAo224YXotLohIS4",
  "access_expires_at": "2026-10-28T14:34:50.706034299Z",
  "refresh_token": "qyQfBYeVRLQysISh_WHL9eshqC47QkEXvc3aTH_HFE8",
  "refresh_expires_at": "2026-10-29T02:19:50.705421946Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ca4fb215-ac86-4e48-8de0-43c23ddbb397/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:19:49.813787Z",
      "actor": {
        "type": "CLIENT",
        "id": "0398f42b-9add-463b-bd94-6cb7ad8aa5d5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
        "quote_id": "16642479-bf17-45af-a7e4-90a7fd60dd23",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "8f218b60-d4fe-4d9e-87be-f0afbd5d54cd"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:19:49.815831Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
        "attempt_id": "bb71883e-b30d-4ac0-a5c5-0516f9ded232",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "8f218b60-d4fe-4d9e-87be-f0afbd5d54cd"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:19:49.826005Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
        "attempt_id": "bb71883e-b30d-4ac0-a5c5-0516f9ded232"
      },
      "correlation_id": "8f218b60-d4fe-4d9e-87be-f0afbd5d54cd"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "bb71883e-b30d-4ac0-a5c5-0516f9ded232",
        "generation": 1,
        "started_at": "2026-10-28T14:19:49.8147Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:19:49.826005Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:19:49.816865Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/8f218b60-d4fe-4d9e-87be-f0afbd5d54cd` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397:0",
      "order_id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
      "at": "2026-10-28T14:19:49.813787Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397:1",
      "order_id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
      "at": "2026-10-28T14:19:49.815831Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397:2",
      "order_id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
      "at": "2026-10-28T14:19:49.826005Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/f09b1937-9519-41b6-9512-4be73af6499c` → **200**

```json
{
  "found": []
}
```

Done: request 8f218b60-d4fe-4d9e-87be-f0afbd5d54cd — order ca4fb215-ac86-4e48-8de0-43c23ddbb397 found by its id.

`GET /api/rider/v1/orders/ca4fb215-ac86-4e48-8de0-43c23ddbb397` → **200**

```json
{
  "id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0398f42b-9add-463b-bd94-6cb7ad8aa5d5",
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
  "created_at": "2026-10-28T14:19:49.813108Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/ca4fb215-ac86-4e48-8de0-43c23ddbb397/cancel` → **200**

```json
{
  "command_id": "d56562bd-bab2-432f-ba59-76d3c144e69d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ca4fb215-ac86-4e48-8de0-43c23ddbb397",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0398f42b-9add-463b-bd94-6cb7ad8aa5d5",
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
  "created_at": "2026-10-28T14:19:49.813108Z",
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

# Scenario: data-export

## A rider signs in and asks for a code to confirm the copy

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635975736",
  "device_ref": "sandbox-18693"
}
```

```json
{
  "challenge_id": "3017cf57-4b38-428f-8fb4-959762a8865a",
  "expires_at": "2026-10-28T14:24:52.371645121Z",
  "resend_available_at": "2026-10-28T14:19:53.371645121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635975736` → **200**

```json
{
  "phone": "+380635975736",
  "audience": "CLIENT",
  "code": "663052",
  "sent_at": "2026-10-28T14:19:52.373897186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3017cf57-4b38-428f-8fb4-959762a8865a",
  "code": "663052",
  "device_ref": "sandbox-18693"
}
```

```json
{
  "session_id": "e4b2f027-ea30-43b5-b01a-28411cf7b339",
  "subject": {
    "type": "CLIENT",
    "id": "fee59df4-fe21-476f-8bb3-b5c286741a36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZWU1OWRmNC1mZTIxLTQ3NmYtOGJiMy1iNWMyODY3NDFhMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDkyLCJpYXQiOjE3OTMxOTcxOTIsImp0aSI6IjA4NWM0ZWU3LTMyZjMtNDEwZS04OTRjLThkM2VkZjEzNWRjNyIsInNpZCI6ImU0YjJmMDI3LWVhMzAtNDNiNS1iMDFhLTI4NDExY2Y3YjMzOSJ9.rC4kq1_aQ7Darw-jx1HR1dorzrTKcEubUxGCJh9uXqE",
  "access_expires_at": "2026-10-28T14:34:52.665302771Z",
  "refresh_token": "e7lH96PN9fFDIzcprdV9oL0eb9KAinoxpjflyGWctMM",
  "refresh_expires_at": "2026-11-27T14:19:52.664751512Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "498a8c17-b11a-4e28-9e82-2e6ffe7acaa1",
  "expires_at": "2026-10-28T14:24:54.947814726Z",
  "resend_available_at": "2026-10-28T14:19:55.947814726Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635975736` → **200**

```json
{
  "phone": "+380635975736",
  "audience": "CLIENT",
  "code": "480591",
  "sent_at": "2026-10-28T14:19:54.950200178Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "377187d4-d869-433b-a77a-40712cec1267",
  "challenge_id": "498a8c17-b11a-4e28-9e82-2e6ffe7acaa1",
  "otp_code": "480591"
}
```

```json
{
  "id": "6f396ba9-102e-4d92-98fa-e846fa26f333",
  "state": "PENDING",
  "created_at": "2026-10-28T14:19:55.243955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/6f396ba9-102e-4d92-98fa-e846fa26f333` → **200**

```json
{
  "id": "6f396ba9-102e-4d92-98fa-e846fa26f333",
  "state": "PENDING",
  "created_at": "2026-10-28T14:19:55.243955Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/6f396ba9-102e-4d92-98fa-e846fa26f333` → **200**

```json
{
  "id": "6f396ba9-102e-4d92-98fa-e846fa26f333",
  "state": "READY",
  "created_at": "2026-10-28T14:19:55.243955Z",
  "ready_at": "2026-10-28T14:19:56.484192Z",
  "expires_at": "2026-11-04T14:19:56.484192Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/6f396ba9-102e-4d92-98fa-e846fa26f333/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636600626",
  "device_ref": "sandbox-2336"
}
```

```json
{
  "challenge_id": "ab83a75b-46de-44b5-b7ba-d066e228a4bf",
  "expires_at": "2026-10-28T14:24:57.069927407Z",
  "resend_available_at": "2026-10-28T14:19:58.069927407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636600626` → **200**

```json
{
  "phone": "+380636600626",
  "audience": "CLIENT",
  "code": "678524",
  "sent_at": "2026-10-28T14:19:57.07252496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ab83a75b-46de-44b5-b7ba-d066e228a4bf",
  "code": "678524",
  "device_ref": "sandbox-2336"
}
```

```json
{
  "session_id": "0364802b-d911-40fe-b233-f993e6cd791c",
  "subject": {
    "type": "CLIENT",
    "id": "06d084fa-a406-418d-961d-20c48cd4405d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmQwODRmYS1hNDA2LTQxOGQtOTYxZC0yMGM0OGNkNDQwNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MDk3LCJpYXQiOjE3OTMxOTcxOTcsImp0aSI6ImExNjlkZDAxLWRlMTAtNDc1Yy1iYjM2LTk1ZjZjNzM4ODA4NSIsInNpZCI6IjAzNjQ4MDJiLWQ5MTEtNDBmZS1iMjMzLWY5OTNlNmNkNzkxYyJ9.kDbkgfSrOFCJ2ovG1iVSvnNrg25Iu98Ifhx2b-R3Qv4",
  "access_expires_at": "2026-10-28T14:34:57.366482541Z",
  "refresh_token": "-La-mezrGqQQ-NZqkcGOwDD09BpiQw7BPoDsGTg_Kcs",
  "refresh_expires_at": "2026-11-27T14:19:57.365955747Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/6f396ba9-102e-4d92-98fa-e846fa26f333/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/6f396ba9-102e-4d92-98fa-e846fa26f333/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c3795973-810c-46c2-abc2-31c33104ab4b"
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
  "session_id": "9b1a75c3-6e4b-4e16-8dca-dcab2e419ed9",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgwOTgsImlhdCI6MTc5MzE5NzE5OCwianRpIjoiMzQ3YTYxOGEtNjJkZC00NTE2LTljOWEtOGZhZGQxOTBiYjlhIiwic2lkIjoiOWIxYTc1YzMtNmU0Yi00ZTE2LThkY2EtZGNhYjJlNDE5ZWQ5In0.pTlCo4UAYB0VDpB23l8_zu_sA0_GvNxF_JjoYNqk0iI",
  "access_expires_at": "2026-10-28T14:34:58.207174067Z",
  "refresh_token": "01eOwGwKlyA2EOXw-gOV8w18qJkFNV5nCO34QfyB3LA",
  "refresh_expires_at": "2026-10-29T02:19:58.20660252Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fee59df4-fe21-476f-8bb3-b5c286741a36",
  "session_id": "e4b2f027-ea30-43b5-b01a-28411cf7b339",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/fee59df4-fe21-476f-8bb3-b5c286741a36/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "6f396ba9-102e-4d92-98fa-e846fa26f333",
      "state": "READY",
      "created_at": "2026-10-28T14:19:55.243955Z",
      "ready_at": "2026-10-28T14:19:56.484192Z",
      "expires_at": "2026-11-04T14:19:56.484192Z",
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
  "device_ref": "sandbox-22317"
}
```

```json
{
  "challenge_id": "c859d428-e38d-4a02-89e3-2de14880ea83",
  "expires_at": "2026-10-28T14:24:59.010191944Z",
  "resend_available_at": "2026-10-28T14:20:00.010191944Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "201933",
  "sent_at": "2026-10-28T14:19:59.012475208Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c859d428-e38d-4a02-89e3-2de14880ea83",
  "code": "201933",
  "device_ref": "sandbox-22317"
}
```

```json
{
  "session_id": "e353d0d8-b481-4c17-b8a9-1d90309de663",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODA5OSwiaWF0IjoxNzkzMTk3MTk5LCJqdGkiOiI4ODgwNmEwNS1lN2RjLTQxNDQtOTVlOS1mZjNiY2Q3Yjc1MDciLCJzaWQiOiJlMzUzZDBkOC1iNDgxLTRjMTctYjhhOS0xZDkwMzA5ZGU2NjMifQ.oSTp9PZ6Q4deBM_2ddp1nGuc5zyBH7x8DUrRK_TpOZs",
  "access_expires_at": "2026-10-28T14:34:59.297443091Z",
  "refresh_token": "CnPTFf1KQYI6RNHm2vTK414WnOGU0ZWnU4IrwVQS058",
  "refresh_expires_at": "2026-11-27T14:19:59.296895489Z",
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
  "device_ref": "sandbox-31483"
}
```

```json
{
  "challenge_id": "f701342f-1ea7-4ee6-b6bd-a6f79fdd5a7f",
  "expires_at": "2026-10-28T14:24:59.822058414Z",
  "resend_available_at": "2026-10-28T14:20:00.822058414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "243349",
  "sent_at": "2026-10-28T14:19:59.824454678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f701342f-1ea7-4ee6-b6bd-a6f79fdd5a7f",
  "code": "243349",
  "device_ref": "sandbox-31483"
}
```

```json
{
  "session_id": "ea0ac68e-d17d-4df5-afaf-8744ddbd01cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODEwMCwiaWF0IjoxNzkzMTk3MjAwLCJqdGkiOiIwZTRiN2ZmMC0yNWZkLTRkMWUtYTJkYi01MjM0ODhiMDg1Y2EiLCJzaWQiOiJlYTBhYzY4ZS1kMTdkLTRkZjUtYWZhZi04NzQ0ZGRiZDAxY2IifQ.ZYkjZqYbRes-wDbOvMIMPdARdDD8pU4HrLVxK4ZB2n8",
  "access_expires_at": "2026-10-28T14:35:00.111648197Z",
  "refresh_token": "O8SrA6UjQjsWaG6XDJFDB04hK4l6e2RyVlzQmop4C6k",
  "refresh_expires_at": "2026-11-27T14:20:00.111080487Z",
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
  "command_id": "ccc2d253-3ebf-4830-9a50-78fa3deefb4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:00Z",
    "sequence": 1793197200631
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bc884c5a-9a4b-4877-9a2b-9b897bab77f0",
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
  "last_heartbeat_at": "2026-10-28T14:20:00.650224Z",
  "last_location_at": "2026-10-28T14:20:00.650224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4401"
}
```

```json
{
  "challenge_id": "dac1a346-3b13-4c5f-9cef-d1256c261739",
  "expires_at": "2026-10-28T14:25:00.91987968Z",
  "resend_available_at": "2026-10-28T14:20:01.91987968Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "868640",
  "sent_at": "2026-10-28T14:20:00.922325296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dac1a346-3b13-4c5f-9cef-d1256c261739",
  "code": "868640",
  "device_ref": "sandbox-4401"
}
```

```json
{
  "session_id": "5e44188b-4cd8-4df2-95f7-0f7ecd031083",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODEwMSwiaWF0IjoxNzkzMTk3MjAxLCJqdGkiOiJiZDZhNjhlZi04ZjY1LTQxYjMtYmViNi1mMjA0OWNkZTI2MzciLCJzaWQiOiI1ZTQ0MTg4Yi00Y2Q4LTRkZjItOTVmNy0wZjdlY2QwMzEwODMifQ._iicgsYq_3XsUT0KCQKaIjTwO0D5USHFPemDMY24JCI",
  "access_expires_at": "2026-10-28T14:35:01.213963154Z",
  "refresh_token": "Ykh5NNAbnAyUui67Rqa_qblRzfVj5mAbFwaxkFzmZW4",
  "refresh_expires_at": "2026-11-27T14:20:01.21333975Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2ca44e7-b111-4cc7-9f40-9e7e8499c85b",
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
  "last_heartbeat_at": "2026-10-28T14:19:02.879925Z",
  "last_location_at": "2026-10-28T14:19:02.879925Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e2ca44e7-b111-4cc7-9f40-9e7e8499c85b/handover` → **200**

```json
{
  "command_id": "da2576b3-3632-40a0-9316-e4e4660f2b60",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2ca44e7-b111-4cc7-9f40-9e7e8499c85b",
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
  "last_heartbeat_at": "2026-10-28T14:19:02.879925Z",
  "last_location_at": "2026-10-28T14:19:02.879925Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e2ca44e7-b111-4cc7-9f40-9e7e8499c85b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:01Z",
    "sequence": 1793197201995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2ca44e7-b111-4cc7-9f40-9e7e8499c85b",
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
  "last_heartbeat_at": "2026-10-28T14:20:02.01564Z",
  "last_location_at": "2026-10-28T14:20:02.01564Z",
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
  "session_id": "880cf587-2347-4ac4-af8c-83c77b51f21f",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMDIsImlhdCI6MTc5MzE5NzIwMiwianRpIjoiZTEzYTM4ZjEtODZjMC00YzM0LWJkOTctZTg2M2ZjYzA5ZDM4Iiwic2lkIjoiODgwY2Y1ODctMjM0Ny00YWM0LWFmOGMtODNjNzdiNTFmMjFmIn0.0MnN4_VgjzZefGc9HSIOhfGnBYAcbopVF6QOXG3CD18",
  "access_expires_at": "2026-10-28T14:35:02.570280705Z",
  "refresh_token": "K51iKy2lAplexHN8O-02Bz_KveGgukb6skkWKQVmYp4",
  "refresh_expires_at": "2026-10-29T02:20:02.569652251Z",
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
  "session_id": "717591ff-648b-40e0-bf8b-cd369a9fbaa0",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMDMsImlhdCI6MTc5MzE5NzIwMywianRpIjoiNTE5NDMwM2MtM2VjOS00MTBjLTk4NWUtODU4YmViY2M1ZDJjIiwic2lkIjoiNzE3NTkxZmYtNjQ4Yi00MGUwLWJmOGItY2QzNjlhOWZiYWEwIn0.wXo0mlY0w_Wkem6BEhKUTd5TYsnUcJEP69bioaK3L4o",
  "access_expires_at": "2026-10-28T14:35:03.137914654Z",
  "refresh_token": "nM3Z7Wq3qfxETHrl6VacRrpSOlESnukn-eb8DurSKm8",
  "refresh_expires_at": "2026-10-29T02:20:03.137358224Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683919580",
  "device_ref": "sandbox-1664"
}
```

```json
{
  "challenge_id": "b490c3a7-3744-48c3-bf16-455f28f8ac03",
  "expires_at": "2026-10-28T14:25:03.404064128Z",
  "resend_available_at": "2026-10-28T14:20:04.404064128Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380683919580` → **200**

```json
{
  "phone": "+380683919580",
  "audience": "CLIENT",
  "code": "422800",
  "sent_at": "2026-10-28T14:20:03.406505527Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b490c3a7-3744-48c3-bf16-455f28f8ac03",
  "code": "422800",
  "device_ref": "sandbox-1664"
}
```

```json
{
  "session_id": "a7e230df-96ec-43fd-ab90-cf731e0c92d8",
  "subject": {
    "type": "CLIENT",
    "id": "5072de67-d3ea-42ff-b0ef-10f6f399afdb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDcyZGU2Ny1kM2VhLTQyZmYtYjBlZi0xMGY2ZjM5OWFmZGIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTAzLCJpYXQiOjE3OTMxOTcyMDMsImp0aSI6IjNlYWUwZGUwLTQ1YTMtNGM0Yi1hMGUzLTk2NDQ5NmZmYWM2ZCIsInNpZCI6ImE3ZTIzMGRmLTk2ZWMtNDNmZC1hYjkwLWNmNzMxZTBjOTJkOCJ9.FWhdD3i9KUbeYT1UcCGHAh7jSwZskR7ZJh-gzFGCsoU",
  "access_expires_at": "2026-10-28T14:35:03.706232931Z",
  "refresh_token": "rGEOt4F9IuOs6ayiGQ0cY2j7ViuUvgNkpK-dqDaNUZk",
  "refresh_expires_at": "2026-11-27T14:20:03.705546519Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99490767-dfed-457f-adce-8d6fb85432c3",
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
  "id": "4783a587-7df7-44fa-b1c1-d461eb4c2722",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:03.975102Z",
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
  "command_id": "400a1ae8-be02-4e33-a800-68ead77f549f",
  "quote_id": "4783a587-7df7-44fa-b1c1-d461eb4c2722",
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
  "id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5072de67-d3ea-42ff-b0ef-10f6f399afdb",
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
  "created_at": "2026-10-28T14:20:04.261499Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The nearest driver declines, the next one accepts

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "c92a5884-a6b5-4646-86cf-844247f69c65",
    "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
    "expires_at": "2026-10-28T14:20:19.264727Z",
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

`POST /api/driver/v1/offers/c92a5884-a6b5-4646-86cf-844247f69c65/reject` → **204**

```json
{
  "command_id": "b962c1c5-7554-4295-8bba-fe5916df5179"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "be913d53-42ee-415c-a4ce-35abe837c31d",
    "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
    "expires_at": "2026-10-28T14:20:19.819672Z",
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

`POST /api/driver/v1/offers/be913d53-42ee-415c-a4ce-35abe837c31d/accept` → **200**

```json
{
  "command_id": "82f26d47-dc0e-44d4-b527-3f4e3f7d0cbc"
}
```

```json
{
  "id": "fa237c13-c428-48a2-9e59-a45f03f6ecae",
  "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c98c90e6-6fd6-42b5-b0ae-753f8c528494",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/25a33714-e2d1-4962-b078-69f0fa11b2d3/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:20:04.262031Z",
      "actor": {
        "type": "CLIENT",
        "id": "5072de67-d3ea-42ff-b0ef-10f6f399afdb",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
        "quote_id": "4783a587-7df7-44fa-b1c1-d461eb4c2722",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7de3aeff-68e7-40f3-85cd-90811829232e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:20:04.26386Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
        "attempt_id": "381e1da1-3214-42d9-8ff0-8c63911578bf",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7de3aeff-68e7-40f3-85cd-90811829232e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:20:04.27058Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c92a5884-a6b5-4646-86cf-844247f69c65",
        "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "7de3aeff-68e7-40f3-85cd-90811829232e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:20:04.818597Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c92a5884-a6b5-4646-86cf-844247f69c65",
        "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3"
      },
      "correlation_id": "ca38b3dd-5505-4d71-a1ee-3a248d574e6a"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 25a33714-e2d1-4962-b078-69f0fa11b2d3 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/25a33714-e2d1-4962-b078-69f0fa11b2d3` → **200**

```json
{
  "id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5072de67-d3ea-42ff-b0ef-10f6f399afdb",
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
    "id": "fa237c13-c428-48a2-9e59-a45f03f6ecae",
    "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c98c90e6-6fd6-42b5-b0ae-753f8c528494",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:20:04.261499Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/25a33714-e2d1-4962-b078-69f0fa11b2d3/cancel` → **200**

```json
{
  "command_id": "73023eab-63b6-4d67-b6db-aab903227172",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5072de67-d3ea-42ff-b0ef-10f6f399afdb",
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
    "id": "fa237c13-c428-48a2-9e59-a45f03f6ecae",
    "order_id": "25a33714-e2d1-4962-b078-69f0fa11b2d3",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c98c90e6-6fd6-42b5-b0ae-753f8c528494",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:20:04.261499Z",
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
  "session_id": "bc884c5a-9a4b-4877-9a2b-9b897bab77f0",
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
  "last_heartbeat_at": "2026-10-28T14:20:00.650224Z",
  "last_location_at": "2026-10-28T14:20:00.650224Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bc884c5a-9a4b-4877-9a2b-9b897bab77f0/close` → **200**

```json
{
  "command_id": "23ad2dd5-f646-4d79-a97e-8fb8ce4cc31a",
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
  "session_id": "e2ca44e7-b111-4cc7-9f40-9e7e8499c85b",
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
  "last_heartbeat_at": "2026-10-28T14:20:02.01564Z",
  "last_location_at": "2026-10-28T14:20:02.01564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e2ca44e7-b111-4cc7-9f40-9e7e8499c85b/close` → **200**

```json
{
  "command_id": "65157491-5e15-426a-96f2-c60d459688a3",
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
  ],
  "app_versions": null
}
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30660"
}
```

```json
{
  "challenge_id": "f6058d71-cad1-4f68-bdc7-3cd90ff5bc06",
  "expires_at": "2026-10-28T14:25:07.672798294Z",
  "resend_available_at": "2026-10-28T14:20:08.672798294Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "416547",
  "sent_at": "2026-10-28T14:20:07.675523713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6058d71-cad1-4f68-bdc7-3cd90ff5bc06",
  "code": "416547",
  "device_ref": "sandbox-30660"
}
```

```json
{
  "session_id": "53255f06-ffdc-4cb3-b2b4-2f6ab5d895e5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODEwNywiaWF0IjoxNzkzMTk3MjA3LCJqdGkiOiIzNTkyNmVhNi1hY2E5LTQ1OGMtODJkMC1kN2FkMWEyNWE0MWIiLCJzaWQiOiI1MzI1NWYwNi1mZmRjLTRjYjMtYjJiNC0yZjZhYjVkODk1ZTUifQ.b5usuk1OqpPITnVbAViL7Uu_9K5O1mSB5Yl91jsdrUA",
  "access_expires_at": "2026-10-28T14:35:07.970868687Z",
  "refresh_token": "_jOV6WZ7Ga0504HSedkH9esK1OJlp3HScC58_rvOI_Q",
  "refresh_expires_at": "2026-11-27T14:20:07.970168359Z",
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
  "command_id": "351891c7-80fc-429d-8b74-2cc96452e021",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:08Z",
    "sequence": 1793197208517
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:08.536078Z",
  "last_location_at": "2026-10-28T14:20:08.536078Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677969489",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "challenge_id": "f6be0739-ad9d-4bb5-a335-6d68f1986e52",
  "expires_at": "2026-10-28T14:25:08.807520652Z",
  "resend_available_at": "2026-10-28T14:20:09.807520652Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677969489` → **200**

```json
{
  "phone": "+380677969489",
  "audience": "CLIENT",
  "code": "977100",
  "sent_at": "2026-10-28T14:20:08.809750906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6be0739-ad9d-4bb5-a335-6d68f1986e52",
  "code": "977100",
  "device_ref": "sandbox-20980"
}
```

```json
{
  "session_id": "767cb7d9-c935-49fe-80bd-ba5de2c6b830",
  "subject": {
    "type": "CLIENT",
    "id": "74fba26c-3880-4f67-8f47-78d2a66c0160"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NGZiYTI2Yy0zODgwLTRmNjctOGY0Ny03OGQyYTY2YzAxNjAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTA5LCJpYXQiOjE3OTMxOTcyMDksImp0aSI6IjQwOTA5YmM0LWFlZGQtNDUyOS1hZmNiLWQ2OWM3ODk2NGNhNyIsInNpZCI6Ijc2N2NiN2Q5LWM5MzUtNDlmZS04MGJkLWJhNWRlMmM2YjgzMCJ9.oeUpD2lJVNqQrkY4bDfOKoZZRkaFuBZENKH9U-jBJ1U",
  "access_expires_at": "2026-10-28T14:35:09.104250732Z",
  "refresh_token": "NzmU9jnmV3L6BZrgqZNh3Qc1QCrKmJ7nSqdpqjGEZsk",
  "refresh_expires_at": "2026-11-27T14:20:09.103630785Z",
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
  "command_id": "27bd6f28-9de7-4976-aefb-43c1bab590bf",
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
  "id": "ed9f1ba4-41ac-44d8-8985-fa682804438e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:09.635641Z",
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
  "command_id": "451ddffc-4cb1-481e-a02d-95cc423c5e96",
  "platform": "ANDROID",
  "token": "sandbox-driver-94b099b6-f08e-449e-a481-ff5273c0cff0"
}
```

```json
{
  "id": "b27f1c91-4bc7-4ba7-aa69-ffa5d01d9683",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:20:09.924254Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "fd9824da-1cd2-4743-ac66-98f060d5d4f1",
  "platform": "ANDROID",
  "token": "sandbox-rider-f34b1fe7-7bb4-43af-a99e-3e4a7ed82128"
}
```

```json
{
  "id": "84a1e5bf-1f4e-4b5c-a122-277649c580d4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:20:10.192438Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "040f1fda-e226-454c-add9-03fc1315f7f7",
  "quote_id": "ed9f1ba4-41ac-44d8-8985-fa682804438e",
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
  "id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "74fba26c-3880-4f67-8f47-78d2a66c0160",
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
  "created_at": "2026-10-28T14:20:10.472772Z",
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
    "id": "cf82c08d-42f4-40ab-a058-33452adf65a4",
    "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
    "expires_at": "2026-10-28T14:20:25.476908Z",
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

`POST /api/driver/v1/offers/cf82c08d-42f4-40ab-a058-33452adf65a4/accept` → **200**

```json
{
  "command_id": "9d12d072-a44f-44ba-9e2f-9af28ccdf9ac"
}
```

```json
{
  "id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:20:10.447Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:20:10.447Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:20:11.72354031Z",
    "token_suffix": "c0cff0",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "event_type": "OfferMade",
      "event_id": "452fba8a-72be-4b4f-855b-17a33fd66b2f",
      "order_version": "2",
      "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677969489&after=2026-10-28T14:20:10.447Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:20:11.725804809Z",
    "token_suffix": "d82128",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted",
      "event_id": "d674e590-d698-4717-861a-443f440bdf97",
      "order_version": "3",
      "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/831998a4-b3b0-4fa4-b5da-2de4e10e7bbf/messages` → **201**

```json
{
  "command_id": "f9b069a1-dd63-43f2-844c-e7d9ef675c43",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "1a7972a2-f145-4593-b957-72f988f54d93",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:20:12.38686241Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "assignment_id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
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

`POST /api/driver/v1/trips/645b2965-1295-4fc0-9756-e6c82f609c5e/messages` → **201**

```json
{
  "command_id": "624c2f41-d2b0-4207-91bb-98dfa13c089e",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "37a14b63-2bdb-48a1-b01c-4b46b1ba7e49",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:20:12.915847951Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/831998a4-b3b0-4fa4-b5da-2de4e10e7bbf/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/645b2965-1295-4fc0-9756-e6c82f609c5e/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677969489"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:13Z",
    "sequence": 1793197213732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:13.751494Z",
  "last_location_at": "2026-10-28T14:20:13.751494Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "assignment_id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
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

`POST /api/driver/v1/trips/645b2965-1295-4fc0-9756-e6c82f609c5e/arrive` → **200**

```json
{
  "command_id": "e0834c01-1846-4c6f-b93d-24b094815bbf",
  "expected_version": 0
}
```

```json
{
  "id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "assignment_id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
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
  "arrived_at": "2026-10-28T14:20:14.287864Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/645b2965-1295-4fc0-9756-e6c82f609c5e/start` → **200**

```json
{
  "command_id": "61f3312f-4c8a-440f-91ea-970736737eb5",
  "expected_version": 1
}
```

```json
{
  "id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "assignment_id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
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
  "arrived_at": "2026-10-28T14:20:14.287864Z",
  "started_at": "2026-10-28T14:20:14.567348Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:14Z",
    "sequence": 1793197214838
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:14.857563Z",
  "last_location_at": "2026-10-28T14:20:14.857563Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/645b2965-1295-4fc0-9756-e6c82f609c5e/complete` → **200**

```json
{
  "command_id": "9b5677a8-1d0f-4d59-a36f-989774b49ad1",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:20:15Z",
  "cash_received": true
}
```

```json
{
  "id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "assignment_id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
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
  "arrived_at": "2026-10-28T14:20:14.287864Z",
  "started_at": "2026-10-28T14:20:14.567348Z",
  "completed_at": "2026-10-28T14:20:15.13749Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/831998a4-b3b0-4fa4-b5da-2de4e10e7bbf` → **200**

```json
{
  "id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "74fba26c-3880-4f67-8f47-78d2a66c0160",
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
    "id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a",
    "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:20:10.472772Z",
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
    "id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:20:10.472772Z",
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
    "id": "645b2965-1295-4fc0-9756-e6c82f609c5e",
    "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
    "order_short_number": 7,
    "created_at": "2026-10-28T14:20:11.025892Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c475a89e-6c3b-463a-8f74-121e8c1535cb",
    "order_id": "e48a6ab6-eb9b-452e-bfbd-fe2bb91a8f7c",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:18:44.409222Z",
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

`GET /api/rider/v1/orders/831998a4-b3b0-4fa4-b5da-2de4e10e7bbf/tip` → **200**

```json
{
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
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
  "available_until": "2026-10-29T14:20:15.13749Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/831998a4-b3b0-4fa4-b5da-2de4e10e7bbf/tip` → **201**

```json
{
  "command_id": "152fda89-3bc3-4dd0-ae8e-98497d7bd15d",
  "amount_minor": 1100
}
```

```json
{
  "id": "8ad20642-637a-4d27-bba3-6131f7487ce6",
  "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:20:20.057349Z"
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
  "session_id": "c69e4057-3e77-41fb-b07e-19ee68fc43e7",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMjAsImlhdCI6MTc5MzE5NzIyMCwianRpIjoiZWYzNTg1NzQtMTA5NC00ZWMyLWE3MWUtMDRkNmQxZDI1MzE1Iiwic2lkIjoiYzY5ZTQwNTctM2U3Ny00MWZiLWIwN2UtMTllZTY4ZmM0M2U3In0.RA-aUdjA8ZGK258myDkUqcgx-xHOJh7FgRxfui8ntM8",
  "access_expires_at": "2026-10-28T14:35:20.63175649Z",
  "refresh_token": "ldSJANq7kDlE__lAP8MJ194sHPtlBPsHPOjqq5jXEp0",
  "refresh_expires_at": "2026-10-29T02:20:20.631157562Z",
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
        "created": 7,
        "fulfilled": 3,
        "cancelled": 4,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 7
        },
        "by_payment": {
          "CASH": 6,
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
    "created": 7,
    "fulfilled": 3,
    "cancelled": 4,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 7
    },
    "by_payment": {
      "CASH": 6,
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
  "generated_at": "2026-10-28T14:20:20.901007138Z"
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
  },
  "generated_at": "2026-10-28T14:20:21.169873841Z"
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
  "session_id": "e9bdf736-75e9-45a1-8a26-68cbbe9c4912",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMjEsImlhdCI6MTc5MzE5NzIyMSwianRpIjoiZDllYWZiMGItMmYwZS00N2U0LTk1YjUtOGYyY2M2NGUwNjkwIiwic2lkIjoiZTliZGY3MzYtNzVlOS00NWExLThhMjYtNjhjYmJlOWM0OTEyIn0.Ix4PxLL-Jg8Ba_gSs3BM561_-pYnVQbZHmyx7X9AAcQ",
  "access_expires_at": "2026-10-28T14:35:21.735785181Z",
  "refresh_token": "opA9D_pYXfxQqdWmRjiBfAkmpUHIvFWkAnXNEPVeCS8",
  "refresh_expires_at": "2026-10-29T02:20:21.73519Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/831998a4-b3b0-4fa4-b5da-2de4e10e7bbf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:20:10.47352Z",
      "actor": {
        "type": "CLIENT",
        "id": "74fba26c-3880-4f67-8f47-78d2a66c0160",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
        "quote_id": "ed9f1ba4-41ac-44d8-8985-fa682804438e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c6d5382a-b14b-4111-b89d-bc0a99d7eb03"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:20:10.475853Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
        "attempt_id": "a97111d1-773e-428a-b2a1-1374ed290394",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c6d5382a-b14b-4111-b89d-bc0a99d7eb03"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:20:10.482646Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cf82c08d-42f4-40ab-a058-33452adf65a4",
        "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c6d5382a-b14b-4111-b89d-bc0a99d7eb03"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:20:11.027886Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cf82c08d-42f4-40ab-a058-33452adf65a4",
        "order_id": "831998a4-b3b0-4fa4-b5da-2de4e10e7bbf",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "787d1a3d-c8b0-4963-b80a-e3dbed5b6f4a"
      },
      "correlation_id": "9828a620-cb0f-41a4-9b54-53b214cac43f"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:20:22.27066547Z",
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
      "last_location_at": "2026-10-28T14:20:14.857563Z",
      "order_id": null
    }
  ]
}
```

Done: order 831998a4-b3b0-4fa4-b5da-2de4e10e7bbf.

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
  "session_id": "14ec19d7-8f17-49be-bbe9-59de8814bfa3",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMjIsImlhdCI6MTc5MzE5NzIyMiwianRpIjoiNDAwOWUzNmItYzI3OS00YzljLWI0ZDktOTVjMDkzMDVkZDZmIiwic2lkIjoiMTRlYzE5ZDctOGYxNy00OWJlLWJiZTktNTlkZTg4MTRiZmEzIn0.IfiahqN_tHWZlXPTIgEaX6wiNzlx9TpAfiJHz-l84Xc",
  "access_expires_at": "2026-10-28T14:35:22.854718242Z",
  "refresh_token": "cOrNk7ELkXVYNqMF3dJlpYyngqF0t7WVcLhLXF3k_zU",
  "refresh_expires_at": "2026-10-29T02:20:22.854155561Z",
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
  "command_id": "f9fcbf69-9f2a-4562-8f6f-7870fd2de602",
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
  "timestamp": "2026-10-28T14:20:23.000+0000",
  "channel": {
    "id": "1730052000.69737360",
    "linkedid": "1730052000.69737360",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672304409"
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
  "timestamp": "2026-10-28T14:20:23.000+0000",
  "channel": {
    "id": "1730052000.69737360",
    "linkedid": "1730052000.69737360",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672304409"
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
  "session_id": "983f005a-fe12-4ce9-bd30-548c7d75b5cb",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMjQsImlhdCI6MTc5MzE5NzIyNCwianRpIjoiNzNhNmYxMmMtZTcxNy00NGRjLTgzNGYtYmYwMWNjNGJkNGY5Iiwic2lkIjoiOTgzZjAwNWEtZmUxMi00Y2U5LWJkMzAtNTQ4YzdkNzViNWNiIn0.Nqp5quWFXWDmJGQCIQRiSE3ovM2wwOGp1qePkBPi3iY",
  "access_expires_at": "2026-10-28T14:35:24.012175534Z",
  "refresh_token": "HumcNNxdg3DqY3nP7Ddo8KzfKBK-lq4P-hSX9SF7TPI",
  "refresh_expires_at": "2026-10-29T02:20:24.011625547Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "88346c63-c9ab-41b6-a4db-fb30cfd80180",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672304409",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:20:23Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/88346c63-c9ab-41b6-a4db-fb30cfd80180/answer` → **200**

```json
{
  "command_id": "46629ac8-f8f3-44da-a51c-def0d9057169"
}
```

```json
{
  "id": "88346c63-c9ab-41b6-a4db-fb30cfd80180",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672304409",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "order_ids": [],
  "started_at": "2026-10-28T14:20:23Z",
  "answered_at": "2026-10-28T14:20:24.561472Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.69737360",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9a5b9bc6-6db1-45b0-8766-d9ce5038f49b",
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
  "id": "02bf2aac-0a77-44bd-92dd-6838629ddb35",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:24.868754Z",
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
  "command_id": "28851073-d7f4-4294-84d7-0198c1d6cd72",
  "quote_id": "02bf2aac-0a77-44bd-92dd-6838629ddb35",
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
    "phone": "+380672304409"
  },
  "call_id": "88346c63-c9ab-41b6-a4db-fb30cfd80180"
}
```

```json
{
  "id": "c8657b03-8367-475e-825e-cc29f2409e5c",
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
  "created_at": "2026-10-28T14:20:25.168388Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672304409"
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
    "id": "1730052000.69737360",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "88346c63-c9ab-41b6-a4db-fb30cfd80180",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672304409",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [
        "c8657b03-8367-475e-825e-cc29f2409e5c"
      ],
      "started_at": "2026-10-28T14:20:23Z",
      "answered_at": "2026-10-28T14:20:24.561472Z",
      "ended_at": "2026-10-28T14:20:25.461083Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "3dbc037f-ec55-457c-b6f7-6844aab23f26",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670165384",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [],
      "started_at": "2026-10-28T14:18:52.318919Z",
      "answered_at": "2026-10-28T14:18:52.624456Z",
      "ended_at": "2026-10-28T14:18:52.92209Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:18:56.470332Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/c8657b03-8367-475e-825e-cc29f2409e5c` → **200**

```json
{
  "id": "c8657b03-8367-475e-825e-cc29f2409e5c",
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
  "created_at": "2026-10-28T14:20:25.168388Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672304409"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c8657b03-8367-475e-825e-cc29f2409e5c` → **200**

```json
{
  "id": "c8657b03-8367-475e-825e-cc29f2409e5c",
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
  "created_at": "2026-10-28T14:20:25.168388Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672304409"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c8657b03-8367-475e-825e-cc29f2409e5c/cancel` → **200**

```json
{
  "command_id": "3fec2abb-aa34-4a72-9f34-4a2c05b2b35b",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c8657b03-8367-475e-825e-cc29f2409e5c",
  "short_number": 8,
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
  "created_at": "2026-10-28T14:20:25.168388Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672304409"
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

Done: call 88346c63-c9ab-41b6-a4db-fb30cfd80180 with order c8657b03-8367-475e-825e-cc29f2409e5c.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21277"
}
```

```json
{
  "challenge_id": "571f2488-2732-4a7a-b539-7732f5c5d3fc",
  "expires_at": "2026-10-28T14:25:26.635685312Z",
  "resend_available_at": "2026-10-28T14:20:27.635685312Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "697327",
  "sent_at": "2026-10-28T14:20:26.638021204Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "571f2488-2732-4a7a-b539-7732f5c5d3fc",
  "code": "697327",
  "device_ref": "sandbox-21277"
}
```

```json
{
  "session_id": "5205004c-5099-4b30-a4a8-a453ef05fcc9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODEyNiwiaWF0IjoxNzkzMTk3MjI2LCJqdGkiOiJhMTg0Mjg5Mi03MjAxLTQ3ZmEtYWI5YS0wZTg2YWY1YTgyYjciLCJzaWQiOiI1MjA1MDA0Yy01MDk5LTRiMzAtYTRhOC1hNDUzZWYwNWZjYzkifQ.wHh1z_ctwSmtG_TLo5mgFnYcMhVsKNmApKc3nirrmW8",
  "access_expires_at": "2026-10-28T14:35:26.925856582Z",
  "refresh_token": "q0G2oxRYNw5jU57Ye7phZONnxwWhZrIGdMlcwjSdx7s",
  "refresh_expires_at": "2026-11-27T14:20:26.925205453Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:14.857563Z",
  "last_location_at": "2026-10-28T14:20:14.857563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/handover` → **200**

```json
{
  "command_id": "ad1579db-7910-481d-a3b7-17ab5ca4d9c4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:14.857563Z",
  "last_location_at": "2026-10-28T14:20:14.857563Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:27Z",
    "sequence": 1793197227718
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:27.739119Z",
  "last_location_at": "2026-10-28T14:20:27.739119Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660627781",
  "device_ref": "sandbox-16240"
}
```

```json
{
  "challenge_id": "939224c0-466b-432b-9a70-acfd223fdcd2",
  "expires_at": "2026-10-28T14:25:27.998541799Z",
  "resend_available_at": "2026-10-28T14:20:28.998541799Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380660627781` → **200**

```json
{
  "phone": "+380660627781",
  "audience": "CLIENT",
  "code": "005115",
  "sent_at": "2026-10-28T14:20:28.00104871Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "939224c0-466b-432b-9a70-acfd223fdcd2",
  "code": "005115",
  "device_ref": "sandbox-16240"
}
```

```json
{
  "session_id": "83f1fc29-0e7b-4a7a-b597-154f3509f8ea",
  "subject": {
    "type": "CLIENT",
    "id": "da7864bd-4e7d-4af3-817f-60cdefcfbb90"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYTc4NjRiZC00ZTdkLTRhZjMtODE3Zi02MGNkZWZjZmJiOTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTI4LCJpYXQiOjE3OTMxOTcyMjgsImp0aSI6IjNkZDYyNGJmLWYyOTMtNDU3OC05YWNmLTNhNjQ3ZjYxOGNiYSIsInNpZCI6IjgzZjFmYzI5LTBlN2ItNGE3YS1iNTk3LTE1NGYzNTA5ZjhlYSJ9.c8BvkkvJzt6LTgOiZ7TnwVWo4cUKeHKY0CeEewn02Lg",
  "access_expires_at": "2026-10-28T14:35:28.284022453Z",
  "refresh_token": "5b4q8cpyNRRIrn2CpK6yI2nNs-kiLj9_TKfD0evRjdQ",
  "refresh_expires_at": "2026-11-27T14:20:28.28342784Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "99f21b6c-d729-47db-8166-d6569e5a7a5d",
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
  "id": "abb5fcd9-1e76-4d27-af0c-9de6b0dd70c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:28.572324Z",
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
  "command_id": "814beb96-d876-4c72-b56f-cd923b6ee591",
  "quote_id": "abb5fcd9-1e76-4d27-af0c-9de6b0dd70c7",
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
  "id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "da7864bd-4e7d-4af3-817f-60cdefcfbb90",
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
  "created_at": "2026-10-28T14:20:28.850321Z",
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
    "id": "cb383071-84b8-4ee6-b0f8-18b030ae0308",
    "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
    "expires_at": "2026-10-28T14:20:43.853408Z",
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

`POST /api/driver/v1/offers/cb383071-84b8-4ee6-b0f8-18b030ae0308/accept` → **200**

```json
{
  "command_id": "96804009-ea62-4d7f-8ab0-67fbc284607c"
}
```

```json
{
  "id": "9650726a-3be2-430f-aedf-e5abb1d3a936",
  "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fec81754-a936-4e2e-8d7d-58a13a3ed72e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fec81754-a936-4e2e-8d7d-58a13a3ed72e",
  "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
  "assignment_id": "9650726a-3be2-430f-aedf-e5abb1d3a936",
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

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:29Z",
    "sequence": 1793197229914
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:29.93443Z",
  "last_location_at": "2026-10-28T14:20:29.93443Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fec81754-a936-4e2e-8d7d-58a13a3ed72e/arrive` → **200**

```json
{
  "command_id": "ed18391d-f5ab-43bd-b1ed-cf347b40ba2f",
  "expected_version": 0
}
```

```json
{
  "id": "fec81754-a936-4e2e-8d7d-58a13a3ed72e",
  "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
  "assignment_id": "9650726a-3be2-430f-aedf-e5abb1d3a936",
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
  "arrived_at": "2026-10-28T14:20:30.208806Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/fec81754-a936-4e2e-8d7d-58a13a3ed72e/start` → **200**

```json
{
  "command_id": "ca57e045-8f63-42ba-a778-1540c93d2428",
  "expected_version": 1
}
```

```json
{
  "id": "fec81754-a936-4e2e-8d7d-58a13a3ed72e",
  "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
  "assignment_id": "9650726a-3be2-430f-aedf-e5abb1d3a936",
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
  "arrived_at": "2026-10-28T14:20:30.208806Z",
  "started_at": "2026-10-28T14:20:30.498637Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:30Z",
    "sequence": 1793197230769
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:30.788376Z",
  "last_location_at": "2026-10-28T14:20:30.788376Z",
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
  "device_ref": "sandbox-841"
}
```

```json
{
  "challenge_id": "7ce1bbbd-5c68-4abf-aa56-157565ad1d50",
  "expires_at": "2026-10-28T14:25:31.055331029Z",
  "resend_available_at": "2026-10-28T14:20:32.055331029Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "803927",
  "sent_at": "2026-10-28T14:20:31.058231174Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ce1bbbd-5c68-4abf-aa56-157565ad1d50",
  "code": "803927",
  "device_ref": "sandbox-841"
}
```

```json
{
  "session_id": "d93b5110-bfbd-4ab1-af8f-b4c86bebd943",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODEzMSwiaWF0IjoxNzkzMTk3MjMxLCJqdGkiOiI4YWUzODNjMS0wZDIyLTRmMzMtOTcyNi0wZjgwZTU2OTBjYzkiLCJzaWQiOiJkOTNiNTExMC1iZmJkLTRhYjEtYWY4Zi1iNGM4NmJlYmQ5NDMifQ.hSzWwjyiU9Rk8b_podgvFN7aX0CfFeM1BbdOVj-yjiI",
  "access_expires_at": "2026-10-28T14:35:31.347855125Z",
  "refresh_token": "-IURP5obgufatdzhILVlC4obkG1Gez8QRzHM3TA7x38",
  "refresh_expires_at": "2026-11-27T14:20:31.347286222Z",
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
  "command_id": "1b341a8e-e409-4a93-9fd7-b5f9b69a9abb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:31Z",
    "sequence": 1793197231861
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:31.879744Z",
  "last_location_at": "2026-10-28T14:20:31.879744Z",
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
  "session_id": "35b556ec-c75e-4559-83cd-25a043d6e32b",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMzIsImlhdCI6MTc5MzE5NzIzMiwianRpIjoiMjg1ZjlhMTQtYjNhYy00ZGUxLTkwOTEtOTUxYTc5ZTZmMjUwIiwic2lkIjoiMzViNTU2ZWMtYzc1ZS00NTU5LTgzY2QtMjVhMDQzZDZlMzJiIn0.WFn2Ebex8Kd5FVO47QLK6HiEquiPkLzM_NXyI56EgGQ",
  "access_expires_at": "2026-10-28T14:35:32.437833753Z",
  "refresh_token": "n5DrPiT2l_wIB6AeuTFzDb9o2CEngAE9yr-psAj0Zvk",
  "refresh_expires_at": "2026-10-29T02:20:32.437281703Z",
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
  "session_id": "34bf15b5-f96d-438f-b7e2-dd972df39db7",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxMzIsImlhdCI6MTc5MzE5NzIzMiwianRpIjoiYjk1NmU1NmQtN2Q0MS00YjIyLThlZWItNjlhZDRmNGQ2YmY2Iiwic2lkIjoiMzRiZjE1YjUtZjk2ZC00MzhmLWI3ZTItZGQ5NzJkZjM5ZGI3In0.lY_3BGUdq4H1yMzpxCIxxx-r2rJMaOsT8jX5BzgVjUI",
  "access_expires_at": "2026-10-28T14:35:32.992656664Z",
  "refresh_token": "MSCCMx7Uar8Xb2hHaOqQV9WvvV6wakDwH_DGhwjcXtk",
  "refresh_expires_at": "2026-10-29T02:20:32.992046104Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/998cb244-3b47-46ca-b4b2-64536ebfb62b` → **200**

```json
{
  "id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "da7864bd-4e7d-4af3-817f-60cdefcfbb90",
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
    "id": "9650726a-3be2-430f-aedf-e5abb1d3a936",
    "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "fec81754-a936-4e2e-8d7d-58a13a3ed72e",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:20:28.850321Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/998cb244-3b47-46ca-b4b2-64536ebfb62b/interrupt` → **200**

```json
{
  "command_id": "3fcef7a6-2446-4250-8475-b7936947e03c",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "da7864bd-4e7d-4af3-817f-60cdefcfbb90",
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
      "id": "9650726a-3be2-430f-aedf-e5abb1d3a936",
      "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "fec81754-a936-4e2e-8d7d-58a13a3ed72e",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:20:28.850321Z",
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
    "id": "f25c77cc-4334-462d-897a-ea9dc6796684",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "da7864bd-4e7d-4af3-817f-60cdefcfbb90",
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
    "id": "f2c96ce4-4b88-4270-bbce-d5a3d05d210d",
    "order_id": "f25c77cc-4334-462d-897a-ea9dc6796684",
    "expires_at": "2026-10-28T14:20:48.586634Z",
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

`POST /api/driver/v1/offers/f2c96ce4-4b88-4270-bbce-d5a3d05d210d/accept` → **200**

```json
{
  "command_id": "2ca3eadd-395f-44a2-9d94-e0aca666aa13"
}
```

```json
{
  "id": "fa8e3cbf-23a8-4e28-a8f8-b2f3770b7171",
  "order_id": "f25c77cc-4334-462d-897a-ea9dc6796684",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "af0f9456-ad90-4916-9608-917c52f7b056",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "af0f9456-ad90-4916-9608-917c52f7b056",
  "order_id": "f25c77cc-4334-462d-897a-ea9dc6796684",
  "assignment_id": "fa8e3cbf-23a8-4e28-a8f8-b2f3770b7171",
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
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:31.879744Z",
  "last_location_at": "2026-10-28T14:20:31.879744Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/ab3f7243-f3de-44e2-b787-dda0e4730b38/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:34Z",
    "sequence": 1793197234972
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:34.991774Z",
  "last_location_at": "2026-10-28T14:20:34.991774Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/af0f9456-ad90-4916-9608-917c52f7b056/arrive` → **200**

```json
{
  "command_id": "d8073efc-5d9d-42bc-8b72-a79c95066273",
  "expected_version": 0
}
```

```json
{
  "id": "af0f9456-ad90-4916-9608-917c52f7b056",
  "order_id": "f25c77cc-4334-462d-897a-ea9dc6796684",
  "assignment_id": "fa8e3cbf-23a8-4e28-a8f8-b2f3770b7171",
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
  "arrived_at": "2026-10-28T14:20:35.271067Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af0f9456-ad90-4916-9608-917c52f7b056/start` → **200**

```json
{
  "command_id": "5a6bb40a-4009-4131-b53e-1a662276a60f",
  "expected_version": 1
}
```

```json
{
  "id": "af0f9456-ad90-4916-9608-917c52f7b056",
  "order_id": "f25c77cc-4334-462d-897a-ea9dc6796684",
  "assignment_id": "fa8e3cbf-23a8-4e28-a8f8-b2f3770b7171",
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
  "arrived_at": "2026-10-28T14:20:35.271067Z",
  "started_at": "2026-10-28T14:20:35.552105Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/af0f9456-ad90-4916-9608-917c52f7b056/complete` → **200**

```json
{
  "command_id": "6749fa2a-36ac-463b-bb44-9b1813c4ccbd",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:20:35Z"
}
```

```json
{
  "id": "af0f9456-ad90-4916-9608-917c52f7b056",
  "order_id": "f25c77cc-4334-462d-897a-ea9dc6796684",
  "assignment_id": "fa8e3cbf-23a8-4e28-a8f8-b2f3770b7171",
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
  "arrived_at": "2026-10-28T14:20:35.271067Z",
  "started_at": "2026-10-28T14:20:35.552105Z",
  "completed_at": "2026-10-28T14:20:35.841369Z",
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
    "id": "f25c77cc-4334-462d-897a-ea9dc6796684",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:20:33.57747Z",
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
    "id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:20:28.850321Z",
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

`GET /api/operator/v1/orders/998cb244-3b47-46ca-b4b2-64536ebfb62b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:20:28.850833Z",
      "actor": {
        "type": "CLIENT",
        "id": "da7864bd-4e7d-4af3-817f-60cdefcfbb90",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
        "quote_id": "abb5fcd9-1e76-4d27-af0c-9de6b0dd70c7",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "07a45541-31d8-4bc4-a9d6-db733d0100f0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:20:28.852611Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
        "attempt_id": "8f9cb5d1-bd10-4b1d-a39a-471496f2bc23",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "07a45541-31d8-4bc4-a9d6-db733d0100f0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:20:28.856344Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cb383071-84b8-4ee6-b0f8-18b030ae0308",
        "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "07a45541-31d8-4bc4-a9d6-db733d0100f0"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:20:29.397147Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cb383071-84b8-4ee6-b0f8-18b030ae0308",
        "order_id": "998cb244-3b47-46ca-b4b2-64536ebfb62b",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9650726a-3be2-430f-aedf-e5abb1d3a936"
      },
      "correlation_id": "59a77cab-7c56-41d9-bf85-c9ac86a0d477"
```

Done: interrupted 998cb244-3b47-46ca-b4b2-64536ebfb62b, follow-up f25c77cc-4334-462d-897a-ea9dc6796684.

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
  "session_id": "33f439da-f832-499f-ac1a-7bde4f7b9ee2",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxNDAsImlhdCI6MTc5MzE5NzI0MCwianRpIjoiODk5MmVmNTItOTMwYy00NWJmLWFjYjgtZmU5N2I1NGQwOTAyIiwic2lkIjoiMzNmNDM5ZGEtZjgzMi00OTlmLWFjMWEtN2JkZTRmN2I5ZWUyIn0.oRjju54sfFlq03SOGvUbXc_C_S3hBnfl0Lu92nCEx8M",
  "access_expires_at": "2026-10-28T14:35:40.290494265Z",
  "refresh_token": "bV3NF9yqEXwTt5CQimtugAgnz_jIyzBkY9TMgLhDv90",
  "refresh_expires_at": "2026-10-29T02:20:40.289947834Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "b2324a45-b80e-42f5-a0e6-7b6272c631fb",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:20:40Z"
}
```

```json
{
  "id": "404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:20:40Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/404ca527-45e5-4e9c-a6c6-03d2e0b9d552/publish` → **200**

```json
{
  "command_id": "2c8b3d41-6174-4456-b064-0b849915d7b1",
  "expected_version": 0
}
```

```json
{
  "id": "404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:20:40.860445Z",
  "published_at": "2026-10-28T14:20:40.860445Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:20:40.860445Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630316044",
  "device_ref": "sandbox-29358"
}
```

```json
{
  "challenge_id": "e042c7a5-8ce0-44f2-9299-0f95396b15b8",
  "expires_at": "2026-10-28T14:25:41.397442747Z",
  "resend_available_at": "2026-10-28T14:20:42.397442747Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630316044` → **200**

```json
{
  "phone": "+380630316044",
  "audience": "CLIENT",
  "code": "372006",
  "sent_at": "2026-10-28T14:20:41.400349434Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e042c7a5-8ce0-44f2-9299-0f95396b15b8",
  "code": "372006",
  "device_ref": "sandbox-29358"
}
```

```json
{
  "session_id": "3a859feb-29df-4a82-9bd2-994e5398753c",
  "subject": {
    "type": "CLIENT",
    "id": "170480b5-cbaf-4b61-aff8-f4fe8bb72bf4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNzA0ODBiNS1jYmFmLTRiNjEtYWZmOC1mNGZlOGJiNzJiZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTQxLCJpYXQiOjE3OTMxOTcyNDEsImp0aSI6Ijc4MTcxZDc1LTI3MTEtNDliOS1hNDJmLWNjNTgwZTRlNDcyNCIsInNpZCI6IjNhODU5ZmViLTI5ZGYtNGE4Mi05YmQyLTk5NGU1Mzk4NzUzYyJ9.mR_LN8e730Uenu49L7nPxbf3wlby2VqxTU8dK-pMzYc",
  "access_expires_at": "2026-10-28T14:35:41.693662246Z",
  "refresh_token": "O9vV52O1GGKxpcGBTwSQEd8zyjCep9f6ekoCEB5UFG4",
  "refresh_expires_at": "2026-11-27T14:20:41.693059684Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:20:40.860445Z",
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
  "command_id": "e619a667-2efc-4906-9b5f-0cf46889d548",
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
  "id": "348e40fe-9e34-4b21-857a-afc1fd844a41",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:42.231467Z",
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
  "command_id": "acfdd1f7-68a6-422c-8624-0a60d3d9a745",
  "quote_id": "348e40fe-9e34-4b21-857a-afc1fd844a41",
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
  "correlation_id": "8fb18968-4e17-43ac-b1d9-215317c7d6a4"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "7a579539-c840-4864-b2ae-018d0695700a",
  "version_id": "404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
  "language": "uk"
}
```

```json
{
  "version_id": "404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:20:42.789758Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b98212bf-832a-42ff-9efa-2bdc02c8c2e0",
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
  "id": "4f6e88a1-d98c-4ef4-b555-95fb3484f469",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:43.059968Z",
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
  "command_id": "f76075eb-dfad-4e28-be6f-9079b2cbf6c6",
  "quote_id": "4f6e88a1-d98c-4ef4-b555-95fb3484f469",
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
  "id": "72ba934e-8e4a-4309-97aa-cb9ce19e7687",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "170480b5-cbaf-4b61-aff8-f4fe8bb72bf4",
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
  "created_at": "2026-10-28T14:20:43.341425Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/72ba934e-8e4a-4309-97aa-cb9ce19e7687` → **200**

```json
{
  "id": "72ba934e-8e4a-4309-97aa-cb9ce19e7687",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "170480b5-cbaf-4b61-aff8-f4fe8bb72bf4",
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
  "created_at": "2026-10-28T14:20:43.341425Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/72ba934e-8e4a-4309-97aa-cb9ce19e7687/cancel` → **200**

```json
{
  "command_id": "81f92b9a-f16b-428c-96a6-647373fd3e3c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "72ba934e-8e4a-4309-97aa-cb9ce19e7687",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "170480b5-cbaf-4b61-aff8-f4fe8bb72bf4",
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
  "created_at": "2026-10-28T14:20:43.341425Z",
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

## A published version never changes

`POST /api/admin/v1/legal-documents/404ca527-45e5-4e9c-a6c6-03d2e0b9d552` → **409**

```json
{
  "command_id": "211d3914-d873-4f51-8a09-0cc609852a43",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:20:44Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/404ca527-45e5-4e9c-a6c6-03d2e0b9d552",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "6e32ba7f-7152-44a2-af5e-a4ab7efab05b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "141907bb-d4c7-4230-9bd8-95ff21e15e96",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:20:44Z"
}
```

```json
{
  "id": "4a6a7326-2aca-4b39-9a79-ff8997ab1083",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:20:44Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4a6a7326-2aca-4b39-9a79-ff8997ab1083/publish` → **200**

```json
{
  "command_id": "71864f39-9e38-45f1-80da-284040973d84",
  "expected_version": 0
}
```

```json
{
  "id": "4a6a7326-2aca-4b39-9a79-ff8997ab1083",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:20:44.772023Z",
  "published_at": "2026-10-28T14:20:44.772023Z",
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
  "device_ref": "sandbox-1545"
}
```

```json
{
  "challenge_id": "5e8f21d7-ae32-4b32-b9e1-de24630d9db8",
  "expires_at": "2026-10-28T14:25:45.041444383Z",
  "resend_available_at": "2026-10-28T14:20:46.041444383Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "717909",
  "sent_at": "2026-10-28T14:20:45.043593205Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e8f21d7-ae32-4b32-b9e1-de24630d9db8",
  "code": "717909",
  "device_ref": "sandbox-1545"
}
```

```json
{
  "session_id": "2eb4d0d2-557a-4bc0-b62e-36809581e199",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODE0NSwiaWF0IjoxNzkzMTk3MjQ1LCJqdGkiOiI3M2ZhYTQ0Mi1kZThiLTQ4NWQtOWM1MS1kYmQ2MjgxNDcyNTAiLCJzaWQiOiIyZWI0ZDBkMi01NTdhLTRiYzAtYjYyZS0zNjgwOTU4MWUxOTkifQ.WrT-VBhlB-zPOe_oaffaDHHKKoG778xYuR2wLosWfVk",
  "access_expires_at": "2026-10-28T14:35:45.34039586Z",
  "refresh_token": "vRzqJtgKV9b0FNBrF-GreufGHBZZNhyNFnrgNBRDhkk",
  "refresh_expires_at": "2026-11-27T14:20:45.339878213Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:34.991774Z",
  "last_location_at": "2026-10-28T14:20:34.991774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab3f7243-f3de-44e2-b787-dda0e4730b38/handover` → **200**

```json
{
  "command_id": "d20c246d-ea2a-40e6-b43a-f724f6adfeda",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:34.991774Z",
  "last_location_at": "2026-10-28T14:20:34.991774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab3f7243-f3de-44e2-b787-dda0e4730b38/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:46Z",
    "sequence": 1793197246142
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:46.161996Z",
  "last_location_at": "2026-10-28T14:20:46.161996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673454132",
  "device_ref": "sandbox-6989"
}
```

```json
{
  "challenge_id": "cba2a352-b205-4bcc-b9a6-fb8ab07d67eb",
  "expires_at": "2026-10-28T14:25:46.4251516Z",
  "resend_available_at": "2026-10-28T14:20:47.4251516Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673454132` → **200**

```json
{
  "phone": "+380673454132",
  "audience": "CLIENT",
  "code": "240646",
  "sent_at": "2026-10-28T14:20:46.427491599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cba2a352-b205-4bcc-b9a6-fb8ab07d67eb",
  "code": "240646",
  "device_ref": "sandbox-6989"
}
```

```json
{
  "session_id": "820c00bb-6094-4e68-8753-afdebddf8b45",
  "subject": {
    "type": "CLIENT",
    "id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MDZhMjEzNi02MmQ3LTRiZWQtOTU4My04YjljMGIzYmIwZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTQ2LCJpYXQiOjE3OTMxOTcyNDYsImp0aSI6IjcwZDdiNjUwLWQxOWUtNGEzYS1hYjdlLTExYzMzY2M0NTJlYyIsInNpZCI6IjgyMGMwMGJiLTYwOTQtNGU2OC04NzUzLWFmZGViZGRmOGI0NSJ9.cVbuXv5spIKjk9bXWcpwNiFGXN6GCovkBJId_nFkdkU",
  "access_expires_at": "2026-10-28T14:35:46.717191794Z",
  "refresh_token": "BWTT5mZjotmS1Ig7PXwgGlzJTumnLXwQ5mO6kNkIeco",
  "refresh_expires_at": "2026-11-27T14:20:46.716624014Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "337ac82a-45c9-4c60-8c27-d3c249e24515",
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
  "id": "9524e03f-5884-4600-9bea-976e493eb7c2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:46.987451Z",
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
  "command_id": "f105c000-eb6a-4585-a0d8-af44862ee60a",
  "quote_id": "9524e03f-5884-4600-9bea-976e493eb7c2",
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
    "phone": "+380676499202"
  }
}
```

```json
{
  "id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:47.26143Z",
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
    "id": "295c6045-1db9-44dc-b454-db59e2b669cf",
    "order_id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
    "expires_at": "2026-10-28T14:21:02.264667Z",
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

`POST /api/driver/v1/offers/295c6045-1db9-44dc-b454-db59e2b669cf/accept` → **200**

```json
{
  "command_id": "c47302dd-53b4-4012-b411-c876070f1056"
}
```

```json
{
  "id": "d13b2a26-49ba-45d8-8274-3ac65d0274a9",
  "order_id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "319d376c-d707-431b-9512-1c0f407b3d98",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "319d376c-d707-431b-9512-1c0f407b3d98",
  "order_id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
  "assignment_id": "d13b2a26-49ba-45d8-8274-3ac65d0274a9",
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
    "phone": "+380676499202"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2c707b98-e7c1-4c45-8f5a-9b359ecbea66",
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
  "id": "83265976-a74a-480e-ab1a-98972faa3c52",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:48.391434Z",
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
  "command_id": "8216c6f6-23c4-4d93-9220-561ceb6820ca",
  "quote_id": "83265976-a74a-480e-ab1a-98972faa3c52",
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
  "id": "4b3f7b42-b4db-478c-85a4-850ff1e34be9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:48.67959Z",
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
  "command_id": "52a9a1e4-8234-4024-b13c-0747cd5a7a28",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:20:48Z"
}
```

```json
{
  "id": "1e83760c-c325-4d15-8c01-a07cb623a28f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:48.981967Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:20:48Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ce990c92-f181-4540-94c6-cbfd0369663c",
  "quote_id": "1e83760c-c325-4d15-8c01-a07cb623a28f",
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
  "pickup_at": "2026-10-28T17:20:48Z"
}
```

```json
{
  "id": "fc348e0f-277c-4b36-9baa-4108f4270551",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:49.261219Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:20:48Z",
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
  "command_id": "c2fa1c98-566b-4261-b2d8-7dd117bf50a9",
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
  "id": "91da3049-b24c-47d8-bcb6-9706b8c8656d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:49.551063Z",
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
  "command_id": "73348886-004a-447e-9d83-4b4a2c4ae927",
  "quote_id": "91da3049-b24c-47d8-bcb6-9706b8c8656d",
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
  "correlation_id": "3fe275fa-2342-4e08-9f1c-65c54d649623"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "fc348e0f-277c-4b36-9baa-4108f4270551",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
      "created_at": "2026-10-28T14:20:49.261219Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:20:48Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "4b3f7b42-b4db-478c-85a4-850ff1e34be9",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
      "created_at": "2026-10-28T14:20:48.67959Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "4b3f7b42-b4db-478c-85a4-850ff1e34be9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:48.67959Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/4051e75e-30a9-4f60-b521-64efe1e4bead` → **200**

```json
{
  "id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
    "id": "d13b2a26-49ba-45d8-8274-3ac65d0274a9",
    "order_id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "319d376c-d707-431b-9512-1c0f407b3d98",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:20:47.26143Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4051e75e-30a9-4f60-b521-64efe1e4bead/cancel` → **200**

```json
{
  "command_id": "e0044649-8ca1-4ddf-97b2-3743321467b7",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
    "id": "d13b2a26-49ba-45d8-8274-3ac65d0274a9",
    "order_id": "4051e75e-30a9-4f60-b521-64efe1e4bead",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "319d376c-d707-431b-9512-1c0f407b3d98",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:20:47.26143Z",
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

`GET /api/rider/v1/orders/4b3f7b42-b4db-478c-85a4-850ff1e34be9` → **200**

```json
{
  "id": "4b3f7b42-b4db-478c-85a4-850ff1e34be9",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:48.67959Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/4b3f7b42-b4db-478c-85a4-850ff1e34be9/cancel` → **200**

```json
{
  "command_id": "0d090705-beac-4f34-821d-a538368dc4da",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4b3f7b42-b4db-478c-85a4-850ff1e34be9",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:48.67959Z",
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

`GET /api/rider/v1/orders/fc348e0f-277c-4b36-9baa-4108f4270551` → **200**

```json
{
  "id": "fc348e0f-277c-4b36-9baa-4108f4270551",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:49.261219Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:20:48Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/fc348e0f-277c-4b36-9baa-4108f4270551/cancel` → **200**

```json
{
  "command_id": "302b0112-9307-4e32-911b-99360531fec0",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fc348e0f-277c-4b36-9baa-4108f4270551",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "506a2136-62d7-4bed-9583-8b9c0b3bb0d0",
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
  "created_at": "2026-10-28T14:20:49.261219Z",
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
  "pickup_at": "2026-10-28T17:20:48Z",
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
  "session_id": "ab3f7243-f3de-44e2-b787-dda0e4730b38",
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
  "last_heartbeat_at": "2026-10-28T14:20:46.161996Z",
  "last_location_at": "2026-10-28T14:20:46.161996Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ab3f7243-f3de-44e2-b787-dda0e4730b38/close` → **200**

```json
{
  "command_id": "a7cd0505-d45a-4d66-99f5-fe2facf29904",
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

Done: orders 4051e75e-30a9-4f60-b521-64efe1e4bead, 4b3f7b42-b4db-478c-85a4-850ff1e34be9, fc348e0f-277c-4b36-9baa-4108f4270551.

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
  "session_id": "0a225a5e-47f5-4190-b6be-ebf91c6e05f4",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxNTMsImlhdCI6MTc5MzE5NzI1MywianRpIjoiOTJkMTExNTgtOTJhMi00ZDYwLWI3YjQtYzBmNGM0Yjg2N2YyIiwic2lkIjoiMGEyMjVhNWUtNDdmNS00MTkwLWI2YmUtZWJmOTFjNmUwNWY0In0.yfNAvH4lfGSgm_OsWN10dM84w60s9V3Oe3DlH0dAKms",
  "access_expires_at": "2026-10-28T14:35:53.132045754Z",
  "refresh_token": "dHG7LS_HrzDMjx6m8KMj3CwAD7aQO8w1IomWuuOQIC8",
  "refresh_expires_at": "2026-10-29T02:20:53.131419956Z",
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
  "session_id": "f08b6033-5dcd-4991-af97-15648b0ac867",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxNTMsImlhdCI6MTc5MzE5NzI1MywianRpIjoiZjYzNzVjMjYtNTU0OS00NzExLTliNjItZDZlZmNmMThjYmQ1Iiwic2lkIjoiZjA4YjYwMzMtNWRjZC00OTkxLWFmOTctMTU2NDhiMGFjODY3In0.XVrvKsZ5yZJA-eaFxmEmK3H9BEC0BaTg3IBrmdWH9Ew",
  "access_expires_at": "2026-10-28T14:35:53.685341593Z",
  "refresh_token": "kbVXkCNxGJM-7FHa7MuIalheoVsTSXxVdvXTnduKOlE",
  "refresh_expires_at": "2026-10-29T02:20:53.684768002Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16156"
}
```

```json
{
  "challenge_id": "abb538f2-8872-4b7b-8413-390b746dc63b",
  "expires_at": "2026-10-28T14:25:53.962536032Z",
  "resend_available_at": "2026-10-28T14:20:54.962536032Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "988385",
  "sent_at": "2026-10-28T14:20:53.964829087Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abb538f2-8872-4b7b-8413-390b746dc63b",
  "code": "988385",
  "device_ref": "sandbox-16156"
}
```

```json
{
  "session_id": "d523fd22-927d-4724-a499-8ab3ba6d2197",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODE1NCwiaWF0IjoxNzkzMTk3MjU0LCJqdGkiOiI2MWZlNjI4Mi1jZWIwLTRiMjQtYjliNC1hYjI0N2JkZjY4OTAiLCJzaWQiOiJkNTIzZmQyMi05MjdkLTQ3MjQtYTQ5OS04YWIzYmE2ZDIxOTcifQ.1kUOA68XWAZGgj-LXT5BTC5IPGHrohFMoeT7MJjFbvg",
  "access_expires_at": "2026-10-28T14:35:54.254897477Z",
  "refresh_token": "WmncoXR89It4S4uS_1J51oymGBIT29u-SoD6Kx7X0LM",
  "refresh_expires_at": "2026-11-27T14:20:54.254339014Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:20:30.788376Z",
  "last_location_at": "2026-10-28T14:20:30.788376Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/handover` → **200**

```json
{
  "command_id": "f671e576-ef41-4992-b161-3633404b7d7e",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
  "session_version": 2,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:20:30.788376Z",
  "last_location_at": "2026-10-28T14:20:30.788376Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:55Z",
    "sequence": 1793197255410
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:55.060297Z",
  "last_location_at": "2026-10-28T14:20:55.060297Z",
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
  "command_id": "505d86cd-79d3-4828-9a50-0f77bb1aedfe",
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
  "effective_at": "2026-10-28T14:20:55.601227Z",
  "changed_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:20:55.865001538Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9f9506cc-8f86-4ca6-996a-484081131b02",
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
  "id": "55a3afc3-294a-44b9-903d-2f4d93bceb5c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:56.140435Z",
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
  "command_id": "d7a1c7a0-fcfe-4948-a9f0-4d8b4f4f84a8",
  "quote_id": "55a3afc3-294a-44b9-903d-2f4d93bceb5c",
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
    "phone": "+380671117773"
  }
}
```

```json
{
  "id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
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
  "created_at": "2026-10-28T14:20:56.420273Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671117773"
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
    "id": "6f64e515-7d3e-4af9-a61d-59ae92b2272c",
    "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
    "expires_at": "2026-10-28T14:21:11.423886Z",
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

`POST /api/driver/v1/offers/6f64e515-7d3e-4af9-a61d-59ae92b2272c/accept` → **200**

```json
{
  "command_id": "164baed1-5559-4d7a-a188-73a61ada40a6"
}
```

```json
{
  "id": "245436f5-526d-4861-8fb8-479a8f9e955d",
  "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e28faf26-04f6-4c49-b903-a510ffa059cb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e28faf26-04f6-4c49-b903-a510ffa059cb",
  "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
  "assignment_id": "245436f5-526d-4861-8fb8-479a8f9e955d",
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
    "phone": "+380671117773"
  }
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:20:57Z",
    "sequence": 1793197257503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:57.523388Z",
  "last_location_at": "2026-10-28T14:20:57.523388Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e28faf26-04f6-4c49-b903-a510ffa059cb/arrive` → **200**

```json
{
  "command_id": "5d73432c-b1d8-4d50-a854-992e4763a4f8",
  "expected_version": 0
}
```

```json
{
  "id": "e28faf26-04f6-4c49-b903-a510ffa059cb",
  "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
  "assignment_id": "245436f5-526d-4861-8fb8-479a8f9e955d",
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
  "arrived_at": "2026-10-28T14:20:57.796772Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117773"
  }
}
```

`POST /api/driver/v1/trips/e28faf26-04f6-4c49-b903-a510ffa059cb/start` → **200**

```json
{
  "command_id": "a015e747-d544-4a5d-b4b0-fb9fc3a28926",
  "expected_version": 1
}
```

```json
{
  "id": "e28faf26-04f6-4c49-b903-a510ffa059cb",
  "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
  "assignment_id": "245436f5-526d-4861-8fb8-479a8f9e955d",
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
  "arrived_at": "2026-10-28T14:20:57.796772Z",
  "started_at": "2026-10-28T14:20:58.075224Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671117773"
  }
}
```

`POST /api/driver/v1/trips/e28faf26-04f6-4c49-b903-a510ffa059cb/complete` → **200**

```json
{
  "command_id": "8c51392b-b847-491f-92a3-208fd0497f99",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:20:58Z",
  "cash_received": true
}
```

```json
{
  "id": "e28faf26-04f6-4c49-b903-a510ffa059cb",
  "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
  "assignment_id": "245436f5-526d-4861-8fb8-479a8f9e955d",
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
  "arrived_at": "2026-10-28T14:20:57.796772Z",
  "started_at": "2026-10-28T14:20:58.075224Z",
  "completed_at": "2026-10-28T14:20:58.355748Z",
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
  "command_id": "979c8323-0c58-4e56-b5d1-f1bb77a49bbd",
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
  "id": "32251b53-bbf5-43f3-a65d-01f259ed3f09",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:25:58.637749Z",
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
  "command_id": "4b7e40c7-a55d-4f5d-b8d3-b49d53f6bfb6",
  "quote_id": "32251b53-bbf5-43f3-a65d-01f259ed3f09",
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
    "phone": "+3806711129518"
  }
}
```

```json
{
  "id": "cb8c8a45-54b5-44f0-b10d-c88c3dc55db7",
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
  "created_at": "2026-10-28T14:20:58.931085Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/cb8c8a45-54b5-44f0-b10d-c88c3dc55db7` → **200**

```json
{
  "id": "cb8c8a45-54b5-44f0-b10d-c88c3dc55db7",
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
  "created_at": "2026-10-28T14:20:58.931085Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129518"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cb8c8a45-54b5-44f0-b10d-c88c3dc55db7/cancel` → **200**

```json
{
  "command_id": "9e0efbed-97e2-4c33-b82d-297052cd1446",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "cb8c8a45-54b5-44f0-b10d-c88c3dc55db7",
  "short_number": 16,
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
  "created_at": "2026-10-28T14:20:58.931085Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711129518"
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
  "staff_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:20:58.361108Z",
  "last_entries": [
    {
      "order_id": "cb8c8a45-54b5-44f0-b10d-c88c3dc55db7",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:20:59.506783Z"
    },
    {
      "order_id": "8710709f-2f4b-45d9-95da-e795b6cbb6f3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:20:58.361108Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "acfafda7-a687-42ea-8067-da4c749f3646",
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
  "last_heartbeat_at": "2026-10-28T14:20:57.523388Z",
  "last_location_at": "2026-10-28T14:20:57.523388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/acfafda7-a687-42ea-8067-da4c749f3646/close` → **200**

```json
{
  "command_id": "127fbeb3-a6c9-4976-baa0-24655a560e0d",
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

Done: operator bonus for fulfilled 8710709f-2f4b-45d9-95da-e795b6cbb6f3 and operator-fault cancellation cb8c8a45-54b5-44f0-b10d-c88c3dc55db7.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670973359",
  "device_ref": "sandbox-9634"
}
```

```json
{
  "challenge_id": "48211190-f20b-4b34-bb60-fc9c42bed267",
  "expires_at": "2026-10-28T14:26:02.632634876Z",
  "resend_available_at": "2026-10-28T14:21:03.632634876Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670973359` → **200**

```json
{
  "phone": "+380670973359",
  "audience": "CLIENT",
  "code": "566143",
  "sent_at": "2026-10-28T14:21:02.634968263Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677584607",
  "device_ref": "sandbox-32430",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "bdcd4368-26f5-4c77-acd9-4a9ae87dfeef",
  "expires_at": "2026-10-28T14:26:02.918865898Z",
  "resend_available_at": "2026-10-28T14:21:03.918865898Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677584607` → **200**

```json
{
  "phone": "+380677584607",
  "audience": "CLIENT",
  "code": "168392",
  "sent_at": "2026-10-28T14:21:02.920974225Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679090000",
  "device_ref": "sandbox-5033"
}
```

```json
{
  "challenge_id": "f4161e49-62b6-4a3e-9352-9bd4d9991b5c",
  "expires_at": "2026-10-28T14:26:03.213412924Z",
  "resend_available_at": "2026-10-28T14:21:04.213412924Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679090000` → **200**

```json
{
  "phone": "+380679090000",
  "audience": "CLIENT",
  "code": "706095",
  "sent_at": "2026-10-28T14:21:03.216005665Z",
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
  "session_id": "dbd389de-3d13-417c-9d9e-ee3a743c0148",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxNjMsImlhdCI6MTc5MzE5NzI2MywianRpIjoiYTRlZTMwNzktYjc4NS00OGVmLThiODEtMDhlMjZhMzJiZjI1Iiwic2lkIjoiZGJkMzg5ZGUtM2QxMy00MTdjLTlkOWUtZWUzYTc0M2MwMTQ4In0.EO63ZQO3-BDGdQt6gsSsXdxelBuhyUrtGPNAA2nhTUc",
  "access_expires_at": "2026-10-28T14:36:03.822451642Z",
  "refresh_token": "NZH3q9ahxSr5X5wEica7ZoFYV4ixJ0U3d7pD1SxWH3Q",
  "refresh_expires_at": "2026-10-29T02:21:03.821842625Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380679090000` → **200**

```json
{
  "deliveries": [
    {
      "id": "851c09b2-b6f8-4a80-8fdd-adef48bb4c88",
      "challenge_id": "f4161e49-62b6-4a3e-9352-9bd4d9991b5c",
      "phone": "+380679090000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f3367a7a-86d6-47dd-a98e-89f3be211667",
      "error": null,
      "attempted_at": "2026-10-28T14:21:03.21624Z"
    },
    {
      "id": "b4f58f51-2bc1-4758-8e63-9f144232fc83",
      "challenge_id": "f4161e49-62b6-4a3e-9352-9bd4d9991b5c",
      "phone": "+380679090000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:21:03.215524Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380679090000` → **200**

```json
{
  "phone": "+380679090000",
  "audience": "CLIENT",
  "code": "706095",
  "sent_at": "2026-10-28T14:21:03.216005665Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677584607` → **200**

```json
{
  "deliveries": [
    {
      "id": "512b6c63-0848-451b-b4a3-c852d1a65245",
      "challenge_id": "bdcd4368-26f5-4c77-acd9-4a9ae87dfeef",
      "phone": "+380677584607",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-864c6aaf-736e-4649-967c-92e5dcbc54a7",
      "error": null,
      "attempted_at": "2026-10-28T14:21:02.921199Z"
    }
  ]
}
```

Done: SMS to +380670973359, a call to +380677584607, SMS then a call to +380679090000.

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
  "session_id": "8e8765e9-0d22-429c-83c5-3bf41273677e",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxNjQsImlhdCI6MTc5MzE5NzI2NCwianRpIjoiYzA2MGRlNzctOWM5Mi00MDYxLWJjOTktZmE1NjBiOWFmNGI5Iiwic2lkIjoiOGU4NzY1ZTktMGQyMi00MjljLTgzYzUtM2JmNDEyNzM2NzdlIn0.-L8filC-6-5NBF62NQiT0pygc_Cg_hddJlVQblA2hU8",
  "access_expires_at": "2026-10-28T14:36:04.970285746Z",
  "refresh_token": "IXR1jCC2EeIFtk39l5cXq5yHAdL5JB9y_SfuIKbi68g",
  "refresh_expires_at": "2026-10-29T02:21:04.969759003Z",
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
  "session_id": "42f6a24d-a370-485d-be4a-a9b6f1939bed",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxNjUsImlhdCI6MTc5MzE5NzI2NSwianRpIjoiZTY4MDBiNmQtMTk5Yy00ZmRkLWJmNzEtMzIxOWY0ODU3Y2ZjIiwic2lkIjoiNDJmNmEyNGQtYTM3MC00ODVkLWJlNGEtYTliNmYxOTM5YmVkIn0.ThZUOKrIM5pyBvlwlDbBDbimNQZU6oDtni13dTh_yMM",
  "access_expires_at": "2026-10-28T14:36:05.525808221Z",
  "refresh_token": "PBNSTOlurfsyZ8iXD5dLAS8JhSljBO5rVJQv5oYQmq4",
  "refresh_expires_at": "2026-10-29T02:21:05.525232095Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292",
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

`POST /api/admin/v1/staff-extensions/29e60344-3672-4781-bd0b-03ba5bf95292` → **200**

```json
{
  "command_id": "ff5b2667-12f4-4174-8c09-a6e854016af3",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "83dd0474-a843-4d96-ac46-a9e58f60088f",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:21:06.610998Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:21:06.610998Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "646f3f42-d100-43a3-bc1b-844adbd1babf",
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
  "id": "73aa06d5-5042-48f2-91d9-fd6017422896",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:26:07.159479Z",
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
  "command_id": "9d053c50-8b55-4887-911e-95ade5f7325a",
  "quote_id": "73aa06d5-5042-48f2-91d9-fd6017422896",
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
    "phone": "+380677608162"
  }
}
```

```json
{
  "id": "d280a16a-acb8-491e-80b0-f081215cd5e3",
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
  "created_at": "2026-10-28T14:21:07.431346Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677608162"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d280a16a-acb8-491e-80b0-f081215cd5e3/calls` → **201**

```json
{
  "command_id": "18dcb2dc-8dce-4ccb-9761-55c7c25f07ae",
  "to": "CALLER"
}
```

```json
{
  "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "order_ids": [
    "d280a16a-acb8-491e-80b0-f081215cd5e3"
  ],
  "started_at": "2026-10-28T14:21:07.725846Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d280a16a-acb8-491e-80b0-f081215cd5e3/calls` → **201**

```json
{
  "command_id": "18dcb2dc-8dce-4ccb-9761-55c7c25f07ae",
  "to": "CALLER"
}
```

```json
{
  "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "order_ids": [
    "d280a16a-acb8-491e-80b0-f081215cd5e3"
  ],
  "started_at": "2026-10-28T14:21:07.725846Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380677608162",
    "at": "2026-10-28T14:21:07.728043658Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.28743",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "6d320bb4-1671-45e0-95df-03e58a5c6d2a"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d280a16a-acb8-491e-80b0-f081215cd5e3` → **200**

```json
{
  "calls": [
    {
      "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [
        "d280a16a-acb8-491e-80b0-f081215cd5e3"
      ],
      "started_at": "2026-10-28T14:21:07.725846Z",
      "answered_at": "2026-10-28T14:21:08.34676Z",
      "ended_at": "2026-10-28T14:21:08.367322Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d280a16a-acb8-491e-80b0-f081215cd5e3` → **200**

```json
{
  "calls": [
    {
      "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [
        "d280a16a-acb8-491e-80b0-f081215cd5e3"
      ],
      "started_at": "2026-10-28T14:21:07.725846Z",
      "answered_at": "2026-10-28T14:21:08.34676Z",
      "ended_at": "2026-10-28T14:21:08.367322Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d280a16a-acb8-491e-80b0-f081215cd5e3` → **200**

```json
{
  "calls": [
    {
      "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [
        "d280a16a-acb8-491e-80b0-f081215cd5e3"
      ],
      "started_at": "2026-10-28T14:21:07.725846Z",
      "answered_at": "2026-10-28T14:21:08.34676Z",
      "ended_at": "2026-10-28T14:21:08.367322Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d280a16a-acb8-491e-80b0-f081215cd5e3` → **200**

```json
{
  "calls": [
    {
      "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [
        "d280a16a-acb8-491e-80b0-f081215cd5e3"
      ],
      "started_at": "2026-10-28T14:21:07.725846Z",
      "answered_at": "2026-10-28T14:21:08.34676Z",
      "ended_at": "2026-10-28T14:21:08.367322Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d280a16a-acb8-491e-80b0-f081215cd5e3` → **200**

```json
{
  "calls": [
    {
      "id": "6d320bb4-1671-45e0-95df-03e58a5c6d2a",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "order_ids": [
        "d280a16a-acb8-491e-80b0-f081215cd5e3"
      ],
      "started_at": "2026-10-28T14:21:07.725846Z",
      "answered_at": "2026-10-28T14:21:08.34676Z",
      "ended_at": "2026-10-28T14:21:08.367322Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:21:16.508804Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d280a16a-acb8-491e-80b0-f081215cd5e3` → **200**

```json
{
  "id": "d280a16a-acb8-491e-80b0-f081215cd5e3",
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
  "created_at": "2026-10-28T14:21:07.431346Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677608162"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d280a16a-acb8-491e-80b0-f081215cd5e3/cancel` → **200**

```json
{
  "command_id": "204bec0c-f170-4516-b688-507fb7a0c262",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d280a16a-acb8-491e-80b0-f081215cd5e3",
  "short_number": 17,
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
  "created_at": "2026-10-28T14:21:07.431346Z",
  "caller": {
    "name": "Caller",
    "phone": "+380677608162"
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
  "command_id": "4c093ca9-fe90-4de0-a6a5-a1969c264729",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:21:18.362753Z",
  "extension": "101"
}
```

Done: outgoing call 6d320bb4-1671-45e0-95df-03e58a5c6d2a from order d280a16a-acb8-491e-80b0-f081215cd5e3, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635600440",
  "device_ref": "sandbox-17694"
}
```

```json
{
  "challenge_id": "aafd2059-7481-439e-bc82-f21caf542a08",
  "expires_at": "2026-10-28T14:26:18.652982836Z",
  "resend_available_at": "2026-10-28T14:21:19.652982836Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635600440` → **200**

```json
{
  "phone": "+380635600440",
  "audience": "CLIENT",
  "code": "949298",
  "sent_at": "2026-10-28T14:21:18.655337071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aafd2059-7481-439e-bc82-f21caf542a08",
  "code": "949298",
  "device_ref": "sandbox-17694"
}
```

```json
{
  "session_id": "f8f8ed28-90cb-4115-a6f8-c6ccb564e41b",
  "subject": {
    "type": "CLIENT",
    "id": "b0e08674-ceb8-4c7c-9369-900a16d13492"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGUwODY3NC1jZWI4LTRjN2MtOTM2OS05MDBhMTZkMTM0OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTc4LCJpYXQiOjE3OTMxOTcyNzgsImp0aSI6ImJlYzdhZTBiLWRjODMtNDMwMS04ZTQzLWIwN2NkZGM4MTg1ZSIsInNpZCI6ImY4ZjhlZDI4LTkwY2ItNDExNS1hNmY4LWM2Y2NiNTY0ZTQxYiJ9.KOI6clgW73epTFWKnBq94UInFQ-qFkSlR_bBsOv4t0w",
  "access_expires_at": "2026-10-28T14:36:18.938823923Z",
  "refresh_token": "7l4nDtkT01rLRZhB8B9Sfa7VIifjKPIh4orbBvwhDYw",
  "refresh_expires_at": "2026-11-27T14:21:18.938316245Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
  "session_id": "f8f8ed28-90cb-4115-a6f8-c6ccb564e41b",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635600440",
  "device_ref": "sandbox-9983"
}
```

```json
{
  "challenge_id": "b4214139-3202-4ba5-a7f7-501c2d206637",
  "expires_at": "2026-10-28T14:26:21.484771981Z",
  "resend_available_at": "2026-10-28T14:21:22.484771981Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635600440` → **200**

```json
{
  "phone": "+380635600440",
  "audience": "CLIENT",
  "code": "134628",
  "sent_at": "2026-10-28T14:21:21.48675126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b4214139-3202-4ba5-a7f7-501c2d206637",
  "code": "134628",
  "device_ref": "sandbox-9983"
}
```

```json
{
  "session_id": "cb984d58-575a-40c2-a308-8bc3e1740cd1",
  "subject": {
    "type": "CLIENT",
    "id": "b0e08674-ceb8-4c7c-9369-900a16d13492"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGUwODY3NC1jZWI4LTRjN2MtOTM2OS05MDBhMTZkMTM0OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTgxLCJpYXQiOjE3OTMxOTcyODEsImp0aSI6ImMyZGQzNzEzLWJiMmYtNDhiZS05NjM0LTFjZTg5MDc3YzFhOCIsInNpZCI6ImNiOTg0ZDU4LTU3NWEtNDBjMi1hMzA4LThiYzNlMTc0MGNkMSJ9.7j6UCgaGfCpsNzWpgw11j6D03E4T-wddgUoAiN9-NxE",
  "access_expires_at": "2026-10-28T14:36:21.783228637Z",
  "refresh_token": "OF3gpsSGqGNSc7d9EAJxobaXIxmUsGyyIyuYZtBuHj8",
  "refresh_expires_at": "2026-11-27T14:21:21.782693357Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "efb0eaa3-3381-417d-bf69-628fd6bc3a66",
  "expires_at": "2026-10-28T14:26:24.053776451Z",
  "resend_available_at": "2026-10-28T14:21:25.053776451Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635600440` → **200**

```json
{
  "phone": "+380635600440",
  "audience": "CLIENT",
  "code": "895521",
  "sent_at": "2026-10-28T14:21:24.055801553Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380637586212"
}
```

```json
{
  "challenge_id": "7d5f6970-3c85-4acd-bed6-e4413eab2594",
  "expires_at": "2026-10-28T14:26:24.368007558Z",
  "resend_available_at": "2026-10-28T14:21:25.368007558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637586212` → **200**

```json
{
  "phone": "+380637586212",
  "audience": "CLIENT",
  "code": "007103",
  "sent_at": "2026-10-28T14:21:24.369738159Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "1a68131f-046b-4bd1-bc4b-624e00740fc1",
  "current_challenge_id": "efb0eaa3-3381-417d-bf69-628fd6bc3a66",
  "current_code": "000000",
  "new_challenge_id": "7d5f6970-3c85-4acd-bed6-e4413eab2594",
  "new_code": "007103"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "56a77a23-b3e5-4763-8f6b-e538aef00759"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "0ea0945c-0fe8-4615-9da5-6e480cf04f1d",
  "current_challenge_id": "efb0eaa3-3381-417d-bf69-628fd6bc3a66",
  "current_code": "895521",
  "new_challenge_id": "7d5f6970-3c85-4acd-bed6-e4413eab2594",
  "new_code": "007103"
}
```

```json
{
  "subject_id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
  "phone": "+380637586212",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
  "session_id": "f8f8ed28-90cb-4115-a6f8-c6ccb564e41b",
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
  "correlation_id": "1f40e82f-15e5-47db-8755-74ed2b5a43ad"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637586212",
  "device_ref": "sandbox-29380"
}
```

```json
{
  "challenge_id": "a54011d4-3223-4729-98c6-71ce99e81159",
  "expires_at": "2026-10-28T14:26:27.728123858Z",
  "resend_available_at": "2026-10-28T14:21:28.728123858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637586212` → **200**

```json
{
  "phone": "+380637586212",
  "audience": "CLIENT",
  "code": "055508",
  "sent_at": "2026-10-28T14:21:27.731585451Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a54011d4-3223-4729-98c6-71ce99e81159",
  "code": "055508",
  "device_ref": "sandbox-29380"
}
```

```json
{
  "session_id": "a4f0e785-da19-4496-9df2-0eeaa6eb2f04",
  "subject": {
    "type": "CLIENT",
    "id": "b0e08674-ceb8-4c7c-9369-900a16d13492"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGUwODY3NC1jZWI4LTRjN2MtOTM2OS05MDBhMTZkMTM0OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTg4LCJpYXQiOjE3OTMxOTcyODgsImp0aSI6IjVlOTMzYThkLWU4NzItNDg3ZC1iNzczLTRiNTBiMjQ3Mjc5YiIsInNpZCI6ImE0ZjBlNzg1LWRhMTktNDQ5Ni05ZGYyLTBlZWFhNmViMmYwNCJ9.eCCgTc0TCItN59sR3ROwkNnRkj2_s2r-l4EYvOxOaWM",
  "access_expires_at": "2026-10-28T14:36:28.017271313Z",
  "refresh_token": "liPXsjCG37ieOsKaw3h-KSOkdzm1bh4IjTAM0ffqO0g",
  "refresh_expires_at": "2026-11-27T14:21:28.016742773Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
  "session_id": "a4f0e785-da19-4496-9df2-0eeaa6eb2f04",
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
  "session_id": "c810ba32-cefe-4dbf-b1f8-cd9af0654e54",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxODgsImlhdCI6MTc5MzE5NzI4OCwianRpIjoiMTA0OWY5NGItZTVkZS00ZmRmLWI1M2ItNzhhNjUyZGI3YWJjIiwic2lkIjoiYzgxMGJhMzItY2VmZS00ZGJmLWIxZjgtY2Q5YWYwNjU0ZTU0In0.yhqv5RJBvIGbkoUzXn_rmlWXlUzEm3pJfDxDFfoluxI",
  "access_expires_at": "2026-10-28T14:36:28.829615314Z",
  "refresh_token": "narjaSgi83w_gxxoBlSlOJpUbp7oLE4mUjLE0rXKn9Q",
  "refresh_expires_at": "2026-10-29T02:21:28.829035732Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/b0e08674-ceb8-4c7c-9369-900a16d13492` → **200**

```json
{
  "client": {
    "id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
    "phone": "+380637586212",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:21:18.93674Z",
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

`POST /api/admin/v1/clients/b0e08674-ceb8-4c7c-9369-900a16d13492/phone` → **400**

```json
{
  "command_id": "7a6b3a61-de92-4a4b-aa9d-8495e35f92da",
  "expected_version": 3,
  "phone": "+380636386849",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/b0e08674-ceb8-4c7c-9369-900a16d13492/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "665bef03-f027-4662-83b4-d63e0e3ed925",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/b0e08674-ceb8-4c7c-9369-900a16d13492/phone` → **200**

```json
{
  "command_id": "6dabfc07-d48a-4ae1-8b9b-c57192940481",
  "expected_version": 3,
  "phone": "+380636386849",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
  "phone": "+380636386849",
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
  "correlation_id": "d42f357d-cfa7-4ca2-b3de-8778814c8900"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636386849",
  "device_ref": "sandbox-3892"
}
```

```json
{
  "challenge_id": "e983962f-5de9-4a1b-9ba4-651e866949ad",
  "expires_at": "2026-10-28T14:26:30.204204191Z",
  "resend_available_at": "2026-10-28T14:21:31.204204191Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636386849` → **200**

```json
{
  "phone": "+380636386849",
  "audience": "CLIENT",
  "code": "178810",
  "sent_at": "2026-10-28T14:21:30.206444964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e983962f-5de9-4a1b-9ba4-651e866949ad",
  "code": "178810",
  "device_ref": "sandbox-3892"
}
```

```json
{
  "session_id": "60e5ffd7-90d8-428b-b387-bbebc4166334",
  "subject": {
    "type": "CLIENT",
    "id": "b0e08674-ceb8-4c7c-9369-900a16d13492"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiMGUwODY3NC1jZWI4LTRjN2MtOTM2OS05MDBhMTZkMTM0OTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTkwLCJpYXQiOjE3OTMxOTcyOTAsImp0aSI6ImY4YzZhYTIxLWFjNzgtNGRlZi1hODg2LTQxMThkMGU5NTUzYSIsInNpZCI6IjYwZTVmZmQ3LTkwZDgtNDI4Yi1iMzg3LWJiZWJjNDE2NjMzNCJ9.bCqSQ30WAKTR0WHcWvUVMe_ukF8-ckGtGP0kOUTRy-A",
  "access_expires_at": "2026-10-28T14:36:30.498022132Z",
  "refresh_token": "NEdPLF-bNX2ZPRV8nRFSaYt5tWSfgAtaElPDUR0H4qY",
  "refresh_expires_at": "2026-11-27T14:21:30.497491461Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b0e08674-ceb8-4c7c-9369-900a16d13492",
  "session_id": "60e5ffd7-90d8-428b-b387-bbebc4166334",
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
  "phone": "+380635262495",
  "device_ref": "sandbox-12366"
}
```

```json
{
  "challenge_id": "60949048-e7e0-4ce7-98c5-242749b40144",
  "expires_at": "2026-10-28T14:26:31.026770229Z",
  "resend_available_at": "2026-10-28T14:21:32.026770229Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635262495` → **200**

```json
{
  "phone": "+380635262495",
  "audience": "CLIENT",
  "code": "407433",
  "sent_at": "2026-10-28T14:21:31.028975586Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60949048-e7e0-4ce7-98c5-242749b40144",
  "code": "407433",
  "device_ref": "sandbox-12366"
}
```

```json
{
  "session_id": "39522c61-80c2-4ff3-9544-6bf7473d874d",
  "subject": {
    "type": "CLIENT",
    "id": "52902af8-fd8f-4aa3-b4f5-479b189c6ef4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MjkwMmFmOC1mZDhmLTRhYTMtYjRmNS00NzliMTg5YzZlZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTkxLCJpYXQiOjE3OTMxOTcyOTEsImp0aSI6IjczZDllODI2LTAzZDItNDg1ZS05ZWYzLTQxODQ4ZmY5NDViMiIsInNpZCI6IjM5NTIyYzYxLTgwYzItNGZmMy05NTQ0LTZiZjc0NzNkODc0ZCJ9.Lx3JRKmA5gJx66_JGp60FnsWaBCWdM1XApBKPe5R_X0",
  "access_expires_at": "2026-10-28T14:36:31.316302034Z",
  "refresh_token": "SDuLOYYmVzURt9lXuGvvvJdeBtusog0HFpSbq_8FcWk",
  "refresh_expires_at": "2026-11-27T14:21:31.315784588Z",
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
  "session_id": "42d5e25a-bf44-4c9c-bfb2-cd439ffc6b34",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxOTIsImlhdCI6MTc5MzE5NzI5MiwianRpIjoiNmViNTI5NjctMjI5MC00MjE3LTlmNzMtZDc1NmM3MGQwNjQwIiwic2lkIjoiNDJkNWUyNWEtYmY0NC00YzljLWJmYjItY2Q0MzlmZmM2YjM0In0.KKPETOVjACg8iUz9RyMKCAZuTSPS4HutseUnB5LgCTY",
  "access_expires_at": "2026-10-28T14:36:32.424025545Z",
  "refresh_token": "Xk9hxWO-g-IYcBMh8BKsimB43ufm44lwxI0dYgJcJug",
  "refresh_expires_at": "2026-10-29T02:21:32.423384959Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635262495` → **200**

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
  "correlation_id": "98f05662-a8dc-4459-b55b-1bfda2d2e6df"
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
  "session_id": "eca27da6-c8ad-43e5-8a3f-e11fc2a99ad1",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxOTMsImlhdCI6MTc5MzE5NzI5MywianRpIjoiZTUwZmU4YmYtYTZkMy00MmZmLWEwYTEtODUzM2VjZjE2NTkwIiwic2lkIjoiZWNhMjdkYTYtYzhhZC00M2U1LThhM2YtZTExZmMyYTk5YWQxIn0.-AuvzoVrI6IpfJWE1BeUQIfDabR5dmvtosFXXrYG-s4",
  "access_expires_at": "2026-10-28T14:36:33.528675998Z",
  "refresh_token": "oWSyROz8Ro4jnQvSokuWTzopRFaMI9469ydbT-yMLhY",
  "refresh_expires_at": "2026-10-29T02:21:33.527818547Z",
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
    },
    "app_versions": null
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

**Contract validation failed — scenario stopped.**

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32345"
}
```

```json
{
  "challenge_id": "e82dfa98-3233-4b75-8e3a-e6babe6417e4",
  "expires_at": "2026-10-28T14:26:34.079987175Z",
  "resend_available_at": "2026-10-28T14:21:35.079987175Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "876325",
  "sent_at": "2026-10-28T14:21:34.082138616Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e82dfa98-3233-4b75-8e3a-e6babe6417e4",
  "code": "876325",
  "device_ref": "sandbox-32345"
}
```

```json
{
  "session_id": "107498a4-67ef-4160-9afd-24820bc1bb66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODE5NCwiaWF0IjoxNzkzMTk3Mjk0LCJqdGkiOiI2YTliYWU4Yy0xMzg3LTQ1M2EtODBmZC02Zjg4MWVmMzc4ZWEiLCJzaWQiOiIxMDc0OThhNC02N2VmLTQxNjAtOWFmZC0yNDgyMGJjMWJiNjYifQ.d39yoGXwtaLxAm4QagMl84cOv_p4cE-oLRlpC4enzVE",
  "access_expires_at": "2026-10-28T14:36:34.380135391Z",
  "refresh_token": "hnKLxMxShdXe-sQl_0aI0a1-kPlbP1QqFd0E-045k2A",
  "refresh_expires_at": "2026-11-27T14:21:34.379425065Z",
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
  "command_id": "0911e262-bf2b-4d06-a4fc-6868da7462e8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:21:34Z",
    "sequence": 1793197294908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:21:34.926857Z",
  "last_location_at": "2026-10-28T14:21:34.926857Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674791858",
  "device_ref": "sandbox-10166"
}
```

```json
{
  "challenge_id": "7cc9caee-f8b2-4d34-a584-e22c6b3a5aa8",
  "expires_at": "2026-10-28T14:26:35.193035979Z",
  "resend_available_at": "2026-10-28T14:21:36.193035979Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674791858` → **200**

```json
{
  "phone": "+380674791858",
  "audience": "CLIENT",
  "code": "549611",
  "sent_at": "2026-10-28T14:21:35.195343027Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7cc9caee-f8b2-4d34-a584-e22c6b3a5aa8",
  "code": "549611",
  "device_ref": "sandbox-10166"
}
```

```json
{
  "session_id": "3203190c-a7f7-46bc-9d3f-34dc4587dbb3",
  "subject": {
    "type": "CLIENT",
    "id": "894a824f-ea3c-4cb6-a72c-c4bda6f1d78c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4OTRhODI0Zi1lYTNjLTRjYjYtYTcyYy1jNGJkYTZmMWQ3OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MTk1LCJpYXQiOjE3OTMxOTcyOTUsImp0aSI6IjdmNzVkZGRkLTBkM2QtNDNjMS1iMzIyLWNkZmJhY2Q0NThkYiIsInNpZCI6IjMyMDMxOTBjLWE3ZjctNDZiYy05ZDNmLTM0ZGM0NTg3ZGJiMyJ9.iJ0zpvyA0IIQdp_gx9XNRrvh0oeEMFXXfBKThTf6QBY",
  "access_expires_at": "2026-10-28T14:36:35.481704527Z",
  "refresh_token": "4Ph0AGLgoqlM2qpAslzKdsWitauxXFwG8B0KBx-ye24",
  "refresh_expires_at": "2026-11-27T14:21:35.480965317Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "83f5c4f5-3bba-4163-b757-a9ba6dd93f57",
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
  "id": "265c1ab2-1552-4935-b4d7-a168577b16b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:26:35.761631Z",
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
  "command_id": "1791173b-19a5-4619-aee8-a4cbaa51c86b",
  "quote_id": "265c1ab2-1552-4935-b4d7-a168577b16b9",
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
  "id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "894a824f-ea3c-4cb6-a72c-c4bda6f1d78c",
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
  "created_at": "2026-10-28T14:21:36.045557Z",
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
    "id": "9092dd1f-204b-42a8-8bcb-943b4fc3e962",
    "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
    "expires_at": "2026-10-28T14:21:51.049791Z",
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

`POST /api/driver/v1/offers/9092dd1f-204b-42a8-8bcb-943b4fc3e962/accept` → **200**

```json
{
  "command_id": "aad3fdf4-5590-4c38-aff9-813db5ee8776"
}
```

```json
{
  "id": "3016cb64-39df-495e-a672-f62848bef605",
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bbf9e4b6-9082-4722-9e85-29d8a7680328",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bbf9e4b6-9082-4722-9e85-29d8a7680328",
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "assignment_id": "3016cb64-39df-495e-a672-f62848bef605",
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

`POST /api/driver/v1/work-sessions/fa0a8238-a223-46fc-b41b-9fafa2b87b1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:21:37Z",
    "sequence": 1793197297120
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:21:37.139129Z",
  "last_location_at": "2026-10-28T14:21:37.139129Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bbf9e4b6-9082-4722-9e85-29d8a7680328",
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "assignment_id": "3016cb64-39df-495e-a672-f62848bef605",
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

`POST /api/driver/v1/trips/bbf9e4b6-9082-4722-9e85-29d8a7680328/arrive` → **200**

```json
{
  "command_id": "4422ea4a-852d-43f3-a015-83edac8ea763",
  "expected_version": 0
}
```

```json
{
  "id": "bbf9e4b6-9082-4722-9e85-29d8a7680328",
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "assignment_id": "3016cb64-39df-495e-a672-f62848bef605",
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
  "arrived_at": "2026-10-28T14:21:37.662607Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bbf9e4b6-9082-4722-9e85-29d8a7680328/start` → **200**

```json
{
  "command_id": "c4ac553b-01d8-4840-b73e-b2026379c324",
  "expected_version": 1
}
```

```json
{
  "id": "bbf9e4b6-9082-4722-9e85-29d8a7680328",
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "assignment_id": "3016cb64-39df-495e-a672-f62848bef605",
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
  "arrived_at": "2026-10-28T14:21:37.662607Z",
  "started_at": "2026-10-28T14:21:37.938422Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/fa0a8238-a223-46fc-b41b-9fafa2b87b1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:21:38Z",
    "sequence": 1793197298202
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:21:38.220742Z",
  "last_location_at": "2026-10-28T14:21:38.220742Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/bbf9e4b6-9082-4722-9e85-29d8a7680328/complete` → **200**

```json
{
  "command_id": "3a7989f7-c584-4ce6-ace9-02271d266587",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:21:38Z",
  "cash_received": true
}
```

```json
{
  "id": "bbf9e4b6-9082-4722-9e85-29d8a7680328",
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "assignment_id": "3016cb64-39df-495e-a672-f62848bef605",
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
  "arrived_at": "2026-10-28T14:21:37.662607Z",
  "started_at": "2026-10-28T14:21:37.938422Z",
  "completed_at": "2026-10-28T14:21:38.490256Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/8e159135-45c4-47d8-9357-4240ceec06cd/rating` → **200**

```json
{
  "command_id": "1927405f-aed4-4633-b729-d3314f68641a",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "score": 5,
  "created_at": "2026-10-28T14:21:38.779855756Z"
}
```

`POST /api/driver/v1/orders/8e159135-45c4-47d8-9357-4240ceec06cd/rating` → **200**

```json
{
  "command_id": "efb55bff-e804-4fe3-adb1-880e873f138b",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
  "score": 4,
  "created_at": "2026-10-28T14:21:39.046377995Z"
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
  "session_id": "b49bf6f9-2b29-417e-8acd-a0b6d8dc6247",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgxOTksImlhdCI6MTc5MzE5NzI5OSwianRpIjoiZDFmYTI2MmMtYmVkMC00MjJiLTk5ZTYtZjUwODllMzg0ZDkwIiwic2lkIjoiYjQ5YmY2ZjktMmIyOS00MTdlLThhY2QtYTBiNmQ4ZGM2MjQ3In0.lai73XVpZWBYBOUJBtRdenXXwcvLYbiqHb5dhFi_XxE",
  "access_expires_at": "2026-10-28T14:36:39.937719603Z",
  "refresh_token": "PwGRnJhNf2tFnQHcf7_W4of1BizL4d6xVSc52yAzchg",
  "refresh_expires_at": "2026-10-29T02:21:39.936765181Z",
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
  "session_id": "3af31d4c-60ca-4c5b-b226-4e0c94aa11f5",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMDAsImlhdCI6MTc5MzE5NzMwMCwianRpIjoiNTVhMjZiN2ItZDY4ZS00MzgwLWEwMzUtMGFlNWU0M2RmMjNhIiwic2lkIjoiM2FmMzFkNGMtNjBjYS00YzViLWIyMjYtNGUwYzk0YWExMWY1In0.i2Rn4WJpFdqKaEsMWa8jePVR1kojVXqsoC03igjn4Hw",
  "access_expires_at": "2026-10-28T14:36:40.513697401Z",
  "refresh_token": "j9f_8TN3dMuAQIwsM9rDLEIBDFoZoWf-H8dD7HRRJig",
  "refresh_expires_at": "2026-10-29T02:21:40.513071753Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8e159135-45c4-47d8-9357-4240ceec06cd/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
      "author_type": "RIDER",
      "author_id": "894a824f-ea3c-4cb6-a72c-c4bda6f1d78c",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:21:38.779856Z"
    },
    {
      "order_id": "8e159135-45c4-47d8-9357-4240ceec06cd",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "894a824f-ea3c-4cb6-a72c-c4bda6f1d78c",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:21:39.046378Z"
    }
  ]
}
```

Done: ratings for order 8e159135-45c4-47d8-9357-4240ceec06cd.

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
  "session_id": "eeded8d2-5592-426c-8893-21b7b1a9a366",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMDEsImlhdCI6MTc5MzE5NzMwMSwianRpIjoiMmQ0ZTk1ZjMtMDEzZS00ZmYxLTgwNjEtZWFiMjQ1NGNlMzQ4Iiwic2lkIjoiZWVkZWQ4ZDItNTU5Mi00MjZjLTg4OTMtMjFiN2IxYTlhMzY2In0.EpekyqAN0ODuxzmIEBCryrj1qQIuhOqB2T2AT1rGiyA",
  "access_expires_at": "2026-10-28T14:36:41.356875928Z",
  "refresh_token": "kjhRoRzBJ1SqbufZzpYuAj0BEObEjH3d0sJD_rRzAMc",
  "refresh_expires_at": "2026-10-29T02:21:41.356275066Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "68b973ae-17ed-42b1-bd42-301a7569794d",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "d08bd9c5-b885-4a18-91ce-81cde257e969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:41.651164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d08bd9c5-b885-4a18-91ce-81cde257e969` → **200**

```json
{
  "id": "d08bd9c5-b885-4a18-91ce-81cde257e969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:41.651164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d08bd9c5-b885-4a18-91ce-81cde257e969` → **200**

```json
{
  "id": "d08bd9c5-b885-4a18-91ce-81cde257e969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:41.651164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d08bd9c5-b885-4a18-91ce-81cde257e969` → **200**

```json
{
  "id": "d08bd9c5-b885-4a18-91ce-81cde257e969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:41.651164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d08bd9c5-b885-4a18-91ce-81cde257e969` → **200**

```json
{
  "id": "d08bd9c5-b885-4a18-91ce-81cde257e969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:41.651164Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/d08bd9c5-b885-4a18-91ce-81cde257e969` → **200**

```json
{
  "id": "d08bd9c5-b885-4a18-91ce-81cde257e969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:21:41.651164Z",
  "ready_at": "2026-10-28T14:21:46.541251Z",
  "expires_at": "2026-10-29T14:21:46.541251Z"
}
```

`GET /api/admin/v1/reports/exports/d08bd9c5-b885-4a18-91ce-81cde257e969/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b57bb365-c313-47db-81c0-c76838c25f4b",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "b858d74a-6324-4906-8a03-2be37c3cb8af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:47.301461Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b858d74a-6324-4906-8a03-2be37c3cb8af` → **200**

```json
{
  "id": "b858d74a-6324-4906-8a03-2be37c3cb8af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:47.301461Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b858d74a-6324-4906-8a03-2be37c3cb8af` → **200**

```json
{
  "id": "b858d74a-6324-4906-8a03-2be37c3cb8af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:47.301461Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b858d74a-6324-4906-8a03-2be37c3cb8af` → **200**

```json
{
  "id": "b858d74a-6324-4906-8a03-2be37c3cb8af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:47.301461Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b858d74a-6324-4906-8a03-2be37c3cb8af` → **200**

```json
{
  "id": "b858d74a-6324-4906-8a03-2be37c3cb8af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:21:47.301461Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/b858d74a-6324-4906-8a03-2be37c3cb8af` → **200**

```json
{
  "id": "b858d74a-6324-4906-8a03-2be37c3cb8af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:21:47.301461Z",
  "ready_at": "2026-10-28T14:21:51.550427Z",
  "expires_at": "2026-10-29T14:21:51.550427Z"
}
```

`GET /api/admin/v1/reports/exports/b858d74a-6324-4906-8a03-2be37c3cb8af/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/dbd1f3c6-7136-4c8a-8371-d28a133303c5` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/dbd1f3c6-7136-4c8a-8371-d28a133303c5",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "c2b4e158-a6a1-4605-801a-5b4f5719352c"
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
  "device_ref": "sandbox-1079"
}
```

```json
{
  "challenge_id": "76ab1ce9-3b0c-438d-b298-eed553a3009d",
  "expires_at": "2026-10-28T14:26:53.186357969Z",
  "resend_available_at": "2026-10-28T14:21:54.186357969Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "620439",
  "sent_at": "2026-10-28T14:21:53.188824825Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76ab1ce9-3b0c-438d-b298-eed553a3009d",
  "code": "620439",
  "device_ref": "sandbox-1079"
}
```

```json
{
  "session_id": "e978e056-2aba-4440-95e8-4641d5380b3a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODIxMywiaWF0IjoxNzkzMTk3MzEzLCJqdGkiOiJhOGQ4YzE4OS1jMTlmLTQyZTAtOTNhYS01MjYxMGMxNDM2MDkiLCJzaWQiOiJlOTc4ZTA1Ni0yYWJhLTQ0NDAtOTVlOC00NjQxZDUzODBiM2EifQ.KtKpWNeCOLLRGTuGWzfr1kz_5bPU3yBQR_P6V1lQSSs",
  "access_expires_at": "2026-10-28T14:36:53.481585151Z",
  "refresh_token": "2kwnityekgVNu0B5ePKQu30zn4_7RdlbmY6cWOxdtqw",
  "refresh_expires_at": "2026-11-27T14:21:53.481001371Z",
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
  "command_id": "8ff02ed4-6de3-4eba-bb73-722060b1b7b5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:21:54Z",
    "sequence": 1793197314274
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b1262cd6-6af7-489e-a2d9-f6d5526fddfc",
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
  "last_heartbeat_at": "2026-10-28T14:21:54.293081Z",
  "last_location_at": "2026-10-28T14:21:54.293081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "9ea8a60e-20e7-4c9e-a5bf-3e3e48a18aee",
  "points": [
    {
      "sequence": 1793197316560,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:20:56Z"
    },
    {
      "sequence": 1793197316567,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:21:56Z"
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
  "session_id": "c80b48b7-f50e-4dfa-b39a-09aa0d347897",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMTcsImlhdCI6MTc5MzE5NzMxNywianRpIjoiYmJhMTc4OTEtNGIxYS00YmQ2LTk0NWQtNDM1NTE1YTg4N2RlIiwic2lkIjoiYzgwYjQ4YjctZjUwZS00ZGZhLWIzOWEtMDlhYTBkMzQ3ODk3In0.NbbcP-Mg9LE5Z7jakYv1XKMOYb0DMLR-izNnti00pk0",
  "access_expires_at": "2026-10-28T14:36:57.165277141Z",
  "refresh_token": "QvWNi0Xw-MEF0luR3ZGSiuGwThcp3aYhHjJn3Fq-S9Q",
  "refresh_expires_at": "2026-10-29T02:21:57.164718498Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": []
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "2125eed2-0d14-44b2-b613-29e76dc82326",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:21:56Z",
        "track_point_id": "976adfad-20f1-4946-a286-6336480c4f84",
        "work_session_id": "b1262cd6-6af7-489e-a2d9-f6d5526fddfc"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:21:56Z",
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

`POST /api/admin/v1/driver-risk-flags/2125eed2-0d14-44b2-b613-29e76dc82326/confirm` → **200**

```json
{
  "command_id": "09ed2e9e-8d9f-4538-a6ac-924937b82821",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "2125eed2-0d14-44b2-b613-29e76dc82326",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:21:56Z",
    "track_point_id": "976adfad-20f1-4946-a286-6336480c4f84",
    "work_session_id": "b1262cd6-6af7-489e-a2d9-f6d5526fddfc"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:21:56Z",
  "reason": null,
  "reviewed_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "reviewed_at": "2026-10-28T14:21:59.272745Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/2125eed2-0d14-44b2-b613-29e76dc82326/dismiss` → **409**

```json
{
  "command_id": "9829d399-cb82-49f0-82ec-6b7119890966",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/2125eed2-0d14-44b2-b613-29e76dc82326/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "69c25766-2298-4285-91be-a19b7fadb256"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "908fc08f-a8cc-45ce-8754-fa666035f8db",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "b9d341a5-164c-4d48-a787-ed1ace563939",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "raised_at": "2026-10-28T14:21:59.83314Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/b9d341a5-164c-4d48-a787-ed1ace563939/dismiss` → **200**

```json
{
  "command_id": "b291692f-ee06-40e5-bf89-f962e3611a03",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "b9d341a5-164c-4d48-a787-ed1ace563939",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "raised_at": "2026-10-28T14:21:59.83314Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "reviewed_at": "2026-10-28T14:22:00.108773Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "afdc5953-30a1-442b-b5e7-292af99a7aed",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "2125eed2-0d14-44b2-b613-29e76dc82326"
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
      "actor_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:22:00.398038Z"
    }
  ]
}
```

Done: flag 2125eed2-0d14-44b2-b613-29e76dc82326 confirmed, suspension named it, driver reinstated.

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
  "session_id": "4a4244e8-f8da-4418-a28b-ba10a8b62dd0",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMjEsImlhdCI6MTc5MzE5NzMyMSwianRpIjoiNzIwMDJiOWEtNWY1OC00ZTM1LWE1MmUtMjAyZWVkNzA1ZWU4Iiwic2lkIjoiNGE0MjQ0ZTgtZjhkYS00NDE4LWEyOGItYmExMGE4YjYyZGQwIn0.RESGG9tf5Wo_GtSLg9usTuHipUuJrnjH6j0Ue1ugrsk",
  "access_expires_at": "2026-10-28T14:37:01.237167241Z",
  "refresh_token": "7IJm7LNb7WFDnUGGEClwW_EQcoHEzUvwUJTHNq9ILBk",
  "refresh_expires_at": "2026-10-29T02:22:01.23649688Z",
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
      "actor_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:22:00.398038Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "2d865022-3483-4e36-8fb3-826fb197e8d0",
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
  "session_id": "b1262cd6-6af7-489e-a2d9-f6d5526fddfc",
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
  "last_heartbeat_at": "2026-10-28T14:21:54.293081Z",
  "last_location_at": "2026-10-28T14:21:54.293081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1262cd6-6af7-489e-a2d9-f6d5526fddfc/close` → **200**

```json
{
  "command_id": "50736c86-1798-409a-b686-da3b90826098",
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
  "session_id": "7909be51-138a-4aa6-8a78-410099ca1347",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMjIsImlhdCI6MTc5MzE5NzMyMiwianRpIjoiNjc5Y2Y4MzktNmZlMS00MDhiLThkNzktMWQ3OTBhMGNlNTgyIiwic2lkIjoiNzkwOWJlNTEtMTM4YS00YWE2LThhNzgtNDEwMDk5Y2ExMzQ3In0.99LyjI-AwKH37FmG-HrNYLz01sufw9wSeRH9niETx2I",
  "access_expires_at": "2026-10-28T14:37:02.88908029Z",
  "refresh_token": "73B9wryKbxF-xUKVSh3yUAdkqmySvP4aXFQnGqlUL18",
  "refresh_expires_at": "2026-10-29T02:22:02.888525344Z",
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
  "command_id": "455263c4-bd19-4904-9793-5d76367acc31",
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
  "changed_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:22:03.428926Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "455263c4-bd19-4904-9793-5d76367acc31",
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
  "changed_by": "29e60344-3672-4781-bd0b-03ba5bf95292",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:22:03.428926Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48711369865",
  "device_ref": "sandbox-16594"
}
```

```json
{
  "challenge_id": "c0aefc99-7e6b-446f-b7de-b8999ceea086",
  "expires_at": "2026-10-28T14:27:03.990048542Z",
  "resend_available_at": "2026-10-28T14:22:04.990048542Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48711369865` → **200**

```json
{
  "phone": "+48711369865",
  "audience": "CLIENT",
  "code": "639494",
  "sent_at": "2026-10-28T14:22:03.992286532Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0aefc99-7e6b-446f-b7de-b8999ceea086",
  "code": "639494",
  "device_ref": "sandbox-16594"
}
```

```json
{
  "session_id": "09647d74-57c0-43ab-bc02-d8dc758eacba",
  "subject": {
    "type": "CLIENT",
    "id": "7536b204-227e-428b-803c-75c2dc955078"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NTM2YjIwNC0yMjdlLTQyOGItODAzYy03NWMyZGM5NTUwNzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MjI0LCJpYXQiOjE3OTMxOTczMjQsImp0aSI6IjkzM2UyNTFjLTBlMDQtNDAyMS1iMWQwLTBmYTg0MTUyYjExOCIsInNpZCI6IjA5NjQ3ZDc0LTU3YzAtNDNhYi1iYzAyLWQ4ZGM3NThlYWNiYSJ9.5qBKHqGh_LSoDynA0-uKuD3LS6VksP7uSJIpNBevgBY",
  "access_expires_at": "2026-10-28T14:37:04.292144682Z",
  "refresh_token": "VTNZePlWS1wcbs4a2T7MafquNFSvy8lGTMbhVj-A2ho",
  "refresh_expires_at": "2026-11-27T14:22:04.291540634Z",
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
  "correlation_id": "3aba85d3-0371-4262-b7fe-a7627004e114"
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
  "device_ref": "sandbox-2251"
}
```

```json
{
  "challenge_id": "c88d5619-0c58-4cb1-a941-8de84c08348a",
  "expires_at": "2026-10-28T14:27:05.106173308Z",
  "resend_available_at": "2026-10-28T14:22:06.106173308Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "175506",
  "sent_at": "2026-10-28T14:22:05.108457884Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c88d5619-0c58-4cb1-a941-8de84c08348a",
  "code": "175506",
  "device_ref": "sandbox-2251"
}
```

```json
{
  "session_id": "e57335c0-e59d-44ed-aaa7-4046a705399b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODIyNSwiaWF0IjoxNzkzMTk3MzI1LCJqdGkiOiI2N2IyMjllOS0yN2RkLTQ0NTctYjllNy03M2UxNzg5MzU2M2EiLCJzaWQiOiJlNTczMzVjMC1lNTlkLTQ0ZWQtYWFhNy00MDQ2YTcwNTM5OWIifQ.5MU5CsLyj7z325UYRphMchnDm7DfhZQW_7aR_9e3zzI",
  "access_expires_at": "2026-10-28T14:37:05.392547299Z",
  "refresh_token": "jIaM5rJW1YNFqxhzH1NB58H3qxvh22uEhkNHhAgvjP4",
  "refresh_expires_at": "2026-11-27T14:22:05.392029332Z",
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
  "command_id": "a5ddb72c-039a-49e0-bf58-938f84195154",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:22:05Z",
    "sequence": 1793197325916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e36719d4-e212-470b-a060-ef784aed6400",
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
  "last_heartbeat_at": "2026-10-28T14:22:05.934607Z",
  "last_location_at": "2026-10-28T14:22:05.934607Z",
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
  "session_id": "e36719d4-e212-470b-a060-ef784aed6400",
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
  "last_heartbeat_at": "2026-10-28T14:22:05.934607Z",
  "last_location_at": "2026-10-28T14:22:05.934607Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e36719d4-e212-470b-a060-ef784aed6400/close` → **200**

```json
{
  "command_id": "ad2a0569-297e-4841-8574-0d722821ec1d",
  "expected_version": 0
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
  "correlation_id": "7b47d5a7-3dcd-44f0-b458-71cdcc2289a0"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673444905",
  "device_ref": "sandbox-31343"
}
```

```json
{
  "challenge_id": "9b69d1aa-034d-4ce8-8edc-638694dbd6de",
  "expires_at": "2026-10-28T14:27:07.285535863Z",
  "resend_available_at": "2026-10-28T14:22:08.285535863Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673444905` → **200**

```json
{
  "phone": "+380673444905",
  "audience": "CLIENT",
  "code": "825492",
  "sent_at": "2026-10-28T14:22:07.288053888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b69d1aa-034d-4ce8-8edc-638694dbd6de",
  "code": "825492",
  "device_ref": "sandbox-31343"
}
```

```json
{
  "session_id": "6042c236-f591-470d-acb4-40faae0b7f25",
  "subject": {
    "type": "CLIENT",
    "id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzhhYWYzOS04NmNmLTQ5NWMtYmZlZC1hNTNlNThlYTExMWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk4MjI3LCJpYXQiOjE3OTMxOTczMjcsImp0aSI6IjY0MzJmNjA0LTAwNjUtNGJkOC04MWEzLTNhZjllMjI1ZWYxYyIsInNpZCI6IjYwNDJjMjM2LWY1OTEtNDcwZC1hY2I0LTQwZmFhZTBiN2YyNSJ9.-VL7MD0xbfB65VJ-yZa2n3mzSBiDTIX6YG4MoQJmLJU",
  "access_expires_at": "2026-10-28T14:37:07.574225405Z",
  "refresh_token": "U25jJ3Oz4XqfUi-yY4NgVyEUAuQ0ulfLPIMw-0_xhE0",
  "refresh_expires_at": "2026-11-27T14:22:07.573602322Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "fb929d7e-e27d-450b-9dea-944e4e7fcb6b",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
  "upload_path": "/api/rider/v1/uploads/3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
  "expires_at": "2026-10-28T14:37:07.847968793Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/3be86c8c-e41d-4dda-a02e-49a8ef8227cf` → **200**

```json
{
  "file_id": "3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "cca75c6e-e99d-407f-aaea-bce8bbdaa574",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "3be86c8c-e41d-4dda-a02e-49a8ef8227cf"
  ]
}
```

```json
{
  "id": "6d12fb1b-a8f6-448b-9bf5-863f470a2510",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:22:08.15343Z",
  "updated_at": "2026-10-28T14:22:08.15343Z",
  "messages": [
    {
      "id": "fe5ff1c1-22eb-4a9c-bf5d-a3167190e23f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:22:08.154852Z",
      "attachments": [
        {
          "file_id": "3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
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
  "session_id": "f1d803cb-dc57-40e6-b427-01df15847fd0",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMjgsImlhdCI6MTc5MzE5NzMyOCwianRpIjoiNmE2NTk2ZmMtNTZjYS00OGRkLTkxODYtMzA1Y2ViZWVhZTUwIiwic2lkIjoiZjFkODAzY2ItZGM1Ny00MGU2LWI0MjctMDFkZjE1ODQ3ZmQwIn0.qOvwD4Zuge0JJC_1zkSreaQChWzYfZIHtorAYIJEKjY",
  "access_expires_at": "2026-10-28T14:37:08.728832638Z",
  "refresh_token": "1CFlddjYmF7-EhDURRnaiiM1yivTjPHaYQ8YYuWEDYg",
  "refresh_expires_at": "2026-10-29T02:22:08.728254699Z",
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
  "session_id": "f2ebaec9-5c12-4026-b484-72e765b1aa8e",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMjksImlhdCI6MTc5MzE5NzMyOSwianRpIjoiNTdmZDZhZjMtMjA4ZS00N2Q3LWJkZTUtNjkzOWRlZTc3ODc0Iiwic2lkIjoiZjJlYmFlYzktNWMxMi00MDI2LWI0ODQtNzJlNzY1YjFhYThlIn0.UudPe_Flmut7ba1tnzTTLTGMy19uQNDvBGrMKSpLvXA",
  "access_expires_at": "2026-10-28T14:37:09.285809236Z",
  "refresh_token": "7JAQf-bARmJfhzfi_H8aI5zI442vla_YLqlrEOu-0mk",
  "refresh_expires_at": "2026-10-29T02:22:09.285255362Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/6d12fb1b-a8f6-448b-9bf5-863f470a2510/attachments/3be86c8c-e41d-4dda-a02e-49a8ef8227cf` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "f51dbf33-e46d-4104-9010-15eac219cf4f",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "aca8bfbc-bfca-414f-b6d9-7cdda022fb5a",
  "upload_path": "/api/operator/v1/uploads/aca8bfbc-bfca-414f-b6d9-7cdda022fb5a",
  "expires_at": "2026-10-28T14:37:09.565451014Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/aca8bfbc-bfca-414f-b6d9-7cdda022fb5a` → **200**

```json
{
  "file_id": "aca8bfbc-bfca-414f-b6d9-7cdda022fb5a",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/6d12fb1b-a8f6-448b-9bf5-863f470a2510` → **200**

```json
{
  "id": "6d12fb1b-a8f6-448b-9bf5-863f470a2510",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:22:08.15343Z",
  "updated_at": "2026-10-28T14:22:08.15343Z",
  "messages": [
    {
      "id": "fe5ff1c1-22eb-4a9c-bf5d-a3167190e23f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:22:08.154852Z",
      "attachments": [
        {
          "file_id": "3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/6d12fb1b-a8f6-448b-9bf5-863f470a2510/comments` → **200**

```json
{
  "command_id": "6b5071ab-a7b5-4527-a99c-a6a67d2e019b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "aca8bfbc-bfca-414f-b6d9-7cdda022fb5a"
  ]
}
```

```json
{
  "id": "6d12fb1b-a8f6-448b-9bf5-863f470a2510",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:22:08.15343Z",
  "updated_at": "2026-10-28T14:22:10.152488Z",
  "messages": [
    {
      "id": "fe5ff1c1-22eb-4a9c-bf5d-a3167190e23f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:22:08.154852Z",
      "attachments": [
        {
          "file_id": "3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2dc65761-aff9-4f2e-bde0-4a286ccff54b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:22:10.152148Z",
      "attachments": [
        {
          "file_id": "aca8bfbc-bfca-414f-b6d9-7cdda022fb5a",
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

`GET /api/rider/v1/support/cases/6d12fb1b-a8f6-448b-9bf5-863f470a2510` → **200**

```json
{
  "id": "6d12fb1b-a8f6-448b-9bf5-863f470a2510",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:22:08.15343Z",
  "updated_at": "2026-10-28T14:22:10.152488Z",
  "messages": [
    {
      "id": "fe5ff1c1-22eb-4a9c-bf5d-a3167190e23f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "dc8aaf39-86cf-495c-bfed-a53e58ea111d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:22:08.154852Z",
      "attachments": [
        {
          "file_id": "3be86c8c-e41d-4dda-a02e-49a8ef8227cf",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "2dc65761-aff9-4f2e-bde0-4a286ccff54b",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:22:10.152148Z",
      "attachments": [
        {
          "file_id": "aca8bfbc-bfca-414f-b6d9-7cdda022fb5a",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/6d12fb1b-a8f6-448b-9bf5-863f470a2510/attachments/aca8bfbc-bfca-414f-b6d9-7cdda022fb5a` → **200**

Done: support case 6d12fb1b-a8f6-448b-9bf5-863f470a2510, rider attachment 3be86c8c-e41d-4dda-a02e-49a8ef8227cf, operator attachment aca8bfbc-bfca-414f-b6d9-7cdda022fb5a.

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
  "session_id": "421c435e-293a-4940-ae6a-f35dd8f311ed",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMzEsImlhdCI6MTc5MzE5NzMzMSwianRpIjoiMDMwMzE1MDQtMmU2YS00NmFiLWFmZWYtZGNmYTk4ZGE2MDBlIiwic2lkIjoiNDIxYzQzNWUtMjkzYS00OTQwLWFlNmEtZjM1ZGQ4ZjMxMWVkIn0.y6oDL5Ce5XCvhXuIJUq4qev9yHUMnFCW27Nl4okhTRg",
  "access_expires_at": "2026-10-28T14:37:11.024893361Z",
  "refresh_token": "CdG4Jrud0vWqtWeR9bcp-h5uwkh_huAET1VLD8kLcoE",
  "refresh_expires_at": "2026-10-29T02:22:11.024300436Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30106"
}
```

```json
{
  "challenge_id": "a59f1492-f535-4df2-bb7d-27350f73493e",
  "expires_at": "2026-10-28T14:27:11.282581242Z",
  "resend_available_at": "2026-10-28T14:22:12.282581242Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "985215",
  "sent_at": "2026-10-28T14:22:11.284806938Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a59f1492-f535-4df2-bb7d-27350f73493e",
  "code": "985215",
  "device_ref": "sandbox-30106"
}
```

```json
{
  "session_id": "016cf635-a244-4755-b9b1-e92309029b0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODIzMSwiaWF0IjoxNzkzMTk3MzMxLCJqdGkiOiJmNWVlMGYxNC1lMTg0LTRlNjUtODJjZS01NGU1MDZiZDhkZmQiLCJzaWQiOiIwMTZjZjYzNS1hMjQ0LTQ3NTUtYjliMS1lOTIzMDkwMjliMGYifQ._6SBTdBG_JJJT8vgLqvjNXJLnX6vBQFDelaODSbWmOQ",
  "access_expires_at": "2026-10-28T14:37:11.571078702Z",
  "refresh_token": "nearMZboWcJR_VZxCr1rtDIMuZOnBpr87-BCAF2gKL8",
  "refresh_expires_at": "2026-11-27T14:22:11.570518355Z",
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
      "actor_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:22:00.398038Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "29e60344-3672-4781-bd0b-03ba5bf95292",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:22:01.784308Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "df291eac-0330-4530-af1d-ffdf891ef10b",
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
  "device_ref": "sandbox-19749"
}
```

```json
{
  "challenge_id": "dc99704f-1b72-481a-aa05-cfd0b1a5d899",
  "expires_at": "2026-10-28T14:27:12.650081858Z",
  "resend_available_at": "2026-10-28T14:22:13.650081858Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "407132",
  "sent_at": "2026-10-28T14:22:12.652876306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dc99704f-1b72-481a-aa05-cfd0b1a5d899",
  "code": "407132",
  "device_ref": "sandbox-19749"
}
```

```json
{
  "session_id": "33fb7cae-b497-43a2-95e0-71639a3c1d41",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5ODIzMiwiaWF0IjoxNzkzMTk3MzMyLCJqdGkiOiI3MTI2NTA5ZS1mNTc3LTQxMTItOTBkMy1jZDQ4NjRmMGJhZWQiLCJzaWQiOiIzM2ZiN2NhZS1iNDk3LTQzYTItOTVlMC03MTYzOWEzYzFkNDEifQ.a-Iahhf1kbyhWzfMfvG0QD_NRI-M_8V8vD_aQRx8d24",
  "access_expires_at": "2026-10-28T14:37:12.938195248Z",
  "refresh_token": "fZFq6U0OoRIPZh914mZA3H5ule-bV5bqPV8oWC8m-UY",
  "refresh_expires_at": "2026-11-27T14:22:12.937679064Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:21:38.220742Z",
  "last_location_at": "2026-10-28T14:21:38.220742Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fa0a8238-a223-46fc-b41b-9fafa2b87b1e/handover` → **200**

```json
{
  "command_id": "731dbf29-43a8-4cfb-9e84-0ced11ffdd10",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:21:38.220742Z",
  "last_location_at": "2026-10-28T14:21:38.220742Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/fa0a8238-a223-46fc-b41b-9fafa2b87b1e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:22:13Z",
    "sequence": 1793197333735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:22:13.753864Z",
  "last_location_at": "2026-10-28T14:22:13.753864Z",
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
  "command_id": "9bdc2d98-67e6-487f-a220-f9d36f10fb7c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:22:14Z",
    "sequence": 1793197334279
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "939736a8-ed35-4a7a-b89b-b20e4bef4a20",
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
  "last_heartbeat_at": "2026-10-28T14:22:14.296815Z",
  "last_location_at": "2026-10-28T14:22:14.296815Z",
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
  "session_id": "1211ce09-f237-44c8-8d3e-64525f1f39c5",
  "subject": {
    "type": "STAFF",
    "id": "29e60344-3672-4781-bd0b-03ba5bf95292"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWU2MDM0NC0zNjcyLTQ3ODEtYmQwYi0wM2JhNWJmOTUyOTIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTgyMzQsImlhdCI6MTc5MzE5NzMzNCwianRpIjoiMjQwMzk3ZTctNzgyYy00M2NkLTg0YmQtMmMwNjllNDgwNzRjIiwic2lkIjoiMTIxMWNlMDktZjIzNy00NGM4LThkM2UtNjQ1MjVmMWYzOWM1In0.UOtEzC37CkzK6eWY3v2Py348RFYL3jecRMbbyP5AMHM",
  "access_expires_at": "2026-10-28T14:37:14.853280115Z",
  "refresh_token": "fxDKfM7LYLwzSkSjVW9leCelhI4_GuiKrniId_mqoIU",
  "refresh_expires_at": "2026-10-29T02:22:14.852488804Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "eb8ad798-5571-4c0d-b052-4a9bda6d7dde",
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
  "id": "7cf03d6b-6c00-4ba4-a940-41e16da134ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:27:15.129152Z",
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
  "command_id": "cf81ccc5-d59f-4c88-9775-599f34f996fe",
  "quote_id": "7cf03d6b-6c00-4ba4-a940-41e16da134ca",
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
  "id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
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
  "created_at": "2026-10-28T14:22:15.409685Z",
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
    "id": "5d3950f2-aefc-48b8-9e8e-a6794233ff64",
    "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
    "expires_at": "2026-10-28T14:22:30.413279Z",
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

`POST /api/driver/v1/offers/5d3950f2-aefc-48b8-9e8e-a6794233ff64/accept` → **200**

```json
{
  "command_id": "270b9d36-fbd2-4f7d-a287-9281c51de60d"
}
```

```json
{
  "id": "5f9b33f5-3293-40dc-868e-dbd893946448",
  "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6116962c-fabc-4b1f-a85f-e6d8ff1a429e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6116962c-fabc-4b1f-a85f-e6d8ff1a429e",
  "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
  "assignment_id": "5f9b33f5-3293-40dc-868e-dbd893946448",
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

`POST /api/driver/v1/work-sessions/939736a8-ed35-4a7a-b89b-b20e4bef4a20/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:22:16Z",
    "sequence": 1793197336778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "939736a8-ed35-4a7a-b89b-b20e4bef4a20",
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
  "last_heartbeat_at": "2026-10-28T14:22:16.796785Z",
  "last_location_at": "2026-10-28T14:22:16.796785Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6116962c-fabc-4b1f-a85f-e6d8ff1a429e/arrive` → **200**

```json
{
  "command_id": "bdf339aa-91b4-4a22-8fc3-02d8cbd751c1",
  "expected_version": 0
}
```

```json
{
  "id": "6116962c-fabc-4b1f-a85f-e6d8ff1a429e",
  "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
  "assignment_id": "5f9b33f5-3293-40dc-868e-dbd893946448",
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
  "arrived_at": "2026-10-28T14:22:17.073682Z",
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

`POST /api/driver/v1/trips/6116962c-fabc-4b1f-a85f-e6d8ff1a429e/start` → **200**

```json
{
  "command_id": "3d8b06d3-6dea-4c8b-966a-e71537637df4",
  "expected_version": 1
}
```

```json
{
  "id": "6116962c-fabc-4b1f-a85f-e6d8ff1a429e",
  "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
  "assignment_id": "5f9b33f5-3293-40dc-868e-dbd893946448",
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
  "arrived_at": "2026-10-28T14:22:17.073682Z",
  "started_at": "2026-10-28T14:22:17.359196Z",
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

`POST /api/driver/v1/trips/6116962c-fabc-4b1f-a85f-e6d8ff1a429e/complete` → **200**

```json
{
  "command_id": "0f32eda9-6d0c-4b68-a551-25ecb78e4d64",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:22:17Z",
  "cash_received": true
}
```

```json
{
  "id": "6116962c-fabc-4b1f-a85f-e6d8ff1a429e",
  "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
  "assignment_id": "5f9b33f5-3293-40dc-868e-dbd893946448",
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
  "arrived_at": "2026-10-28T14:22:17.073682Z",
  "started_at": "2026-10-28T14:22:17.359196Z",
  "completed_at": "2026-10-28T14:22:17.640809Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/237fcae4-1591-430d-8f65-b05a3c2c70a8` → **200**

```json
{
  "id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
  "short_number": 19,
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
    "id": "5f9b33f5-3293-40dc-868e-dbd893946448",
    "order_id": "237fcae4-1591-430d-8f65-b05a3c2c70a8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "6116962c-fabc-4b1f-a85f-e6d8ff1a429e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:22:15.409685Z",
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
  "session_id": "fa0a8238-a223-46fc-b41b-9fafa2b87b1e",
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
  "last_heartbeat_at": "2026-10-28T14:22:13.753864Z",
  "last_location_at": "2026-10-28T14:22:13.753864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa0a8238-a223-46fc-b41b-9fafa2b87b1e/close` → **200**

```json
{
  "command_id": "5f6d0d1c-1243-4165-a542-dbf359894533",
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
  "session_id": "939736a8-ed35-4a7a-b89b-b20e4bef4a20",
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
  "last_heartbeat_at": "2026-10-28T14:22:16.796785Z",
  "last_location_at": "2026-10-28T14:22:16.796785Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/939736a8-ed35-4a7a-b89b-b20e4bef4a20/close` → **200**

```json
{
  "command_id": "8163226c-0dbd-46e5-b17c-232519b491bc",
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

Done: terminal order 237fcae4-1591-430d-8f65-b05a3c2c70a8 by Andrii (5a000000-0000-4000-8000-000000000403).
