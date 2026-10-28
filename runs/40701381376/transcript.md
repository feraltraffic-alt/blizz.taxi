# Sandbox transcript (2026-10-28T13:59:27Z, c7de75c)

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
  "correlation_id": "e463c1c9-efce-44ec-937a-29d2fd47b912"
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
  "session_id": "5d110d78-7797-4e7c-a9b1-c7c628f099cf",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4NzMsImlhdCI6MTc5MzE5NTk3MywianRpIjoiMGE0OTEyYzktZTA5NS00NjUyLTgxOTUtMDJhYzA5MzY4MDdhIiwic2lkIjoiNWQxMTBkNzgtNzc5Ny00ZTdjLWE5YjEtYzdjNjI4ZjA5OWNmIn0.7HO9b_eEtMvP2QXgTn4evyHHeU7hQOfXnNn82q_s-mc",
  "access_expires_at": "2026-10-28T14:14:33.160155143Z",
  "refresh_token": "Gf8ljI6Jj2Xmt8IgveTFQ80kypU7p_9kJRRutIB0KF0",
  "refresh_expires_at": "2026-10-29T01:59:33.157932281Z",
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
  "session_id": "87fdf139-3e7a-47f1-96bb-4df0c42f3ca4",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4NzQsImlhdCI6MTc5MzE5NTk3NCwianRpIjoiYzgwYjIxYjMtZDJkOC00ZWJjLWExM2YtMDAzZTU3NTVjNmE1Iiwic2lkIjoiODdmZGYxMzktM2U3YS00N2YxLTk2YmItNGRmMGM0MmYzY2E0In0.260608doaOd1m5yDHpDNN9V8DzSYCdc6PcrnkhF3p5k",
  "access_expires_at": "2026-10-28T14:14:34.376511081Z",
  "refresh_token": "Z_sUC1qVIjwmOlkmxb8-J8i4SqERZnOeLmsHX8GS54Q",
  "refresh_expires_at": "2026-10-29T01:59:34.375509242Z",
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
  "session_id": "49df0c0f-59dd-4d0e-b481-a93418976cbe",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4NzUsImlhdCI6MTc5MzE5NTk3NSwianRpIjoiYWE5MmQzZTctOTE2OC00YjFmLTk1ZDctNGI0MTliZWRjNTNlIiwic2lkIjoiNDlkZjBjMGYtNTlkZC00ZDBlLWI0ODEtYTkzNDE4OTc2Y2JlIn0.c3bhAPKNha82647OUiFNXRbNOCLqKN8UcUTFkrLT2cE",
  "access_expires_at": "2026-10-28T14:14:35.067335725Z",
  "refresh_token": "GhG-sscwkGRc7srBHTmLhrXunWaxxjPfVJFUAH6U94E",
  "refresh_expires_at": "2026-10-29T01:59:35.066194143Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "e39cafa5-a3e1-402d-911d-769889c5a50d",
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
  "id": "c17d1e59-9c23-4c05-8eac-420fefbad9d5",
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
  "created_by": "082b7a54-1900-46de-b027-a59df7363721",
  "created_at": "2026-10-28T13:59:35.279196Z",
  "updated_at": "2026-10-28T13:59:35.279196Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635771346",
  "device_ref": "sandbox-4922"
}
```

```json
{
  "challenge_id": "0027cd6d-c4eb-4795-80a1-008008be3b6b",
  "expires_at": "2026-10-28T14:04:35.491667104Z",
  "resend_available_at": "2026-10-28T13:59:36.491667104Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635771346` → **200**

```json
{
  "phone": "+380635771346",
  "audience": "CLIENT",
  "code": "772644",
  "sent_at": "2026-10-28T13:59:35.50000337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0027cd6d-c4eb-4795-80a1-008008be3b6b",
  "code": "772644",
  "device_ref": "sandbox-4922"
}
```

```json
{
  "session_id": "c559e943-3fa0-4be4-9e20-d3adea4ad8a3",
  "subject": {
    "type": "CLIENT",
    "id": "8f115e34-3066-4512-9bee-e94e3fc37d72"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjExNWUzNC0zMDY2LTQ1MTItOWJlZS1lOTRlM2ZjMzdkNzIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2ODc1LCJpYXQiOjE3OTMxOTU5NzUsImp0aSI6ImNhNzZmNjdmLTJiMDgtNDJhNC1hZGU5LTdmNzQzYjc1ODBmZSIsInNpZCI6ImM1NTllOTQzLTNmYTAtNGJlNC05ZTIwLWQzYWRlYTRhZDhhMyJ9.haeA8zOOOwF1KIBvnxzQBLnM1PJhUsCdMhK4DJyWf9U",
  "access_expires_at": "2026-10-28T14:14:35.749221918Z",
  "refresh_token": "HnGCkIG6jVKrin_6lRk8NJH7b3aL-JVp0XucaPXX8e4",
  "refresh_expires_at": "2026-11-27T13:59:35.748157036Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635771346` → **200**

```json
{
  "client_id": "8f115e34-3066-4512-9bee-e94e3fc37d72"
}
```

`POST /api/admin/v1/rider-wallets/8f115e34-3066-4512-9bee-e94e3fc37d72/top-ups` → **201**

```json
{
  "command_id": "d9df1000-065b-4e76-a765-aff155c94711",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "8f115e34-3066-4512-9bee-e94e3fc37d72",
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
      "id": "2611a795-a99c-4263-8aa4-63035f9ee47f",
      "at": "2026-10-28T13:59:36.15487Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "082b7a54-1900-46de-b027-a59df7363721",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7e83e7cb-0515-47b8-914b-6c046c774fba",
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
  "id": "a30f952c-e70e-4c85-b158-ab7b3afc5d46",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:04:36.658944Z",
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
      "id": "c17d1e59-9c23-4c05-8eac-420fefbad9d5",
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
  "device_ref": "sandbox-16812"
}
```

```json
{
  "challenge_id": "3b514771-d9bc-4c18-8fe6-08d88c9c0f67",
  "expires_at": "2026-10-28T14:04:36.877617635Z",
  "resend_available_at": "2026-10-28T13:59:37.877617635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "734553",
  "sent_at": "2026-10-28T13:59:36.881465953Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b514771-d9bc-4c18-8fe6-08d88c9c0f67",
  "code": "734553",
  "device_ref": "sandbox-16812"
}
```

```json
{
  "session_id": "9d011abc-1778-445f-990b-cebc0f46ab7a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njg3NywiaWF0IjoxNzkzMTk1OTc3LCJqdGkiOiI4N2IwYzE3NS1lMDc4LTQ1MmItODI3Yy1mYTk1MWNjNGE5MDYiLCJzaWQiOiI5ZDAxMWFiYy0xNzc4LTQ0NWYtOTkwYi1jZWJjMGY0NmFiN2EifQ.kquBpm94XD_S6_gszOMQb_-s2pXeJ7q_zetKccTWv4I",
  "access_expires_at": "2026-10-28T14:14:37.094435065Z",
  "refresh_token": "U2lSnm0AyiAflbA0F0nBpq-Q_vfjfr-59hHzRzXfqBc",
  "refresh_expires_at": "2026-11-27T13:59:37.093423141Z",
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
  "command_id": "9fe3b66c-30dc-41ea-b7a7-673ef91ec431",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:59:37Z",
    "sequence": 1793195977475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "46e380b9-d8de-42c4-bda9-a665c195737c",
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
  "last_heartbeat_at": "2026-10-28T13:59:37.516107Z",
  "last_location_at": "2026-10-28T13:59:37.516107Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "47dd98e9-0854-49f4-8f3e-c50e8459623b",
  "quote_id": "a30f952c-e70e-4c85-b158-ab7b3afc5d46",
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
  "id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8f115e34-3066-4512-9bee-e94e3fc37d72",
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
  "created_at": "2026-10-28T13:59:37.780429Z",
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
  "client_id": "8f115e34-3066-4512-9bee-e94e3fc37d72",
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
      "id": "2611a795-a99c-4263-8aa4-63035f9ee47f",
      "at": "2026-10-28T13:59:36.15487Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "082b7a54-1900-46de-b027-a59df7363721",
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
    "id": "c23e66a1-e7b3-4a9f-82ab-e4a8609f71c8",
    "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
    "expires_at": "2026-10-28T13:59:52.792146Z",
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

`POST /api/driver/v1/offers/c23e66a1-e7b3-4a9f-82ab-e4a8609f71c8/accept` → **200**

```json
{
  "command_id": "79e20eb5-ff92-4fce-9ed1-ce9b709acc57"
}
```

```json
{
  "id": "bebec631-8d48-4f5a-8e57-07846389b6a2",
  "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d462f087-0f4b-4edf-a916-9455b4bebb42",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d462f087-0f4b-4edf-a916-9455b4bebb42",
  "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
  "assignment_id": "bebec631-8d48-4f5a-8e57-07846389b6a2",
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

`POST /api/driver/v1/work-sessions/46e380b9-d8de-42c4-bda9-a665c195737c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:59:38Z",
    "sequence": 1793195978800
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "46e380b9-d8de-42c4-bda9-a665c195737c",
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
  "last_heartbeat_at": "2026-10-28T13:59:38.823282Z",
  "last_location_at": "2026-10-28T13:59:38.823282Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d462f087-0f4b-4edf-a916-9455b4bebb42/arrive` → **200**

```json
{
  "command_id": "7efd9456-2562-4e0a-b179-f8c99d249df5",
  "expected_version": 0
}
```

```json
{
  "id": "d462f087-0f4b-4edf-a916-9455b4bebb42",
  "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
  "assignment_id": "bebec631-8d48-4f5a-8e57-07846389b6a2",
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
  "arrived_at": "2026-10-28T13:59:39.030941Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d462f087-0f4b-4edf-a916-9455b4bebb42/start` → **200**

```json
{
  "command_id": "4352f51a-a544-4e13-86ae-6ae20cd61931",
  "expected_version": 1
}
```

```json
{
  "id": "d462f087-0f4b-4edf-a916-9455b4bebb42",
  "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
  "assignment_id": "bebec631-8d48-4f5a-8e57-07846389b6a2",
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
  "arrived_at": "2026-10-28T13:59:39.030941Z",
  "started_at": "2026-10-28T13:59:39.247299Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/d462f087-0f4b-4edf-a916-9455b4bebb42/complete` → **200**

```json
{
  "command_id": "ba24c7ee-9bea-4103-bbcc-9d2c0539bbfe",
  "expected_version": 2,
  "reported_at": "2026-10-28T13:59:39Z",
  "cash_received": true
}
```

```json
{
  "id": "d462f087-0f4b-4edf-a916-9455b4bebb42",
  "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e",
  "assignment_id": "bebec631-8d48-4f5a-8e57-07846389b6a2",
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
  "arrived_at": "2026-10-28T13:59:39.030941Z",
  "started_at": "2026-10-28T13:59:39.247299Z",
  "completed_at": "2026-10-28T13:59:39.471816Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "8f115e34-3066-4512-9bee-e94e3fc37d72",
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
      "id": "073c1469-de17-4245-99a2-917b783333ce",
      "at": "2026-10-28T13:59:39.725873Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e"
    },
    {
      "id": "2611a795-a99c-4263-8aa4-63035f9ee47f",
      "at": "2026-10-28T13:59:36.15487Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "082b7a54-1900-46de-b027-a59df7363721",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/c17d1e59-9c23-4c05-8eac-420fefbad9d5/archive` → **200**

```json
{
  "command_id": "5c7f2e82-065e-44b2-aea6-4d811fbb980e",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "c17d1e59-9c23-4c05-8eac-420fefbad9d5",
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
  "created_by": "082b7a54-1900-46de-b027-a59df7363721",
  "created_at": "2026-10-28T13:59:35.279196Z",
  "updated_at": "2026-10-28T13:59:42.898912Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "46e380b9-d8de-42c4-bda9-a665c195737c",
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
  "last_heartbeat_at": "2026-10-28T13:59:38.823282Z",
  "last_location_at": "2026-10-28T13:59:38.823282Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/46e380b9-d8de-42c4-bda9-a665c195737c/close` → **200**

```json
{
  "command_id": "f754632d-fc00-4ba9-ae9a-b6f291902e95",
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

Done: order 2ddd0d8d-1a32-4a73-97d3-0b5489e96c7e.

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
  "session_id": "76ba9118-9ec8-448e-abc3-5e718be89d9c",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4ODMsImlhdCI6MTc5MzE5NTk4MywianRpIjoiYTgzZTYwMDYtYzg1NC00YWIxLTg3ZTMtZTM2MjgzYzE5OWRmIiwic2lkIjoiNzZiYTkxMTgtOWVjOC00NDhlLWFiYzMtNWU3MThiZTg5ZDljIn0.3jyWqtWuarJ0yUwbnSe6I-y_dPgCBmdcWeGXYosD8fc",
  "access_expires_at": "2026-10-28T14:14:43.781553811Z",
  "refresh_token": "uFIAeLC8vkilc9mRQa_FV-T4qqwdFtzjoh7cPG8KofE",
  "refresh_expires_at": "2026-10-29T01:59:43.780745107Z",
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
  "command_id": "3473b40f-55b6-4bfd-bfca-e0163604dddd",
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
  "session_id": "be5f7a6b-cf59-4d29-8198-7d692f698d26",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4ODQsImlhdCI6MTc5MzE5NTk4NCwianRpIjoiZGU3NjAyNDgtYTY4Ny00NjcyLWFjYjUtYTUzMzQwNGM0M2ZjIiwic2lkIjoiYmU1ZjdhNmItY2Y1OS00ZDI5LTgxOTgtN2Q2OTJmNjk4ZDI2In0.M9TrH-tHGmDv0CVDQdXhTVYqXeUoLNAcMNhd18gwu6k",
  "access_expires_at": "2026-10-28T14:14:44.603605985Z",
  "refresh_token": "OtvYLgy-Kw-qK_MkvOxcc0PAVOJ8aQUAfPuSOwB_DUE",
  "refresh_expires_at": "2026-10-29T01:59:44.602961286Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.46652887",
    "linkedid": "1730052700.46652887",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676970904"
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
    "id": "1730052700.46652887",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "2091e246-2dde-4a07-b1a9-3ad573c8dbaf",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:59:44.800849Z",
      "answered_at": null,
      "ended_at": "2026-10-28T13:59:45.058359Z",
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
    "id": "1730052600.964724068",
    "linkedid": "1730052600.964724068",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676970904"
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
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a33ffa5a-12bf-42ab-b7aa-784940b36d18/answer` → **200**

```json
{
  "command_id": "7804efa9-d078-42af-a326-de11a8e8c094"
}
```

```json
{
  "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676970904",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
  "order_ids": [],
  "started_at": "2026-10-28T13:59:45.281327Z",
  "answered_at": "2026-10-28T13:59:45.503376Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.964724068",
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
    "id": "1730052600.964724068",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
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
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
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
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
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
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
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
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:59:54.543231Z"
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
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:59:54.543231Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a33ffa5a-12bf-42ab-b7aa-784940b36d18/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a33ffa5a-12bf-42ab-b7aa-784940b36d18/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a33ffa5a-12bf-42ab-b7aa-784940b36d18` → **200**

```json
{
  "changes": [
    {
      "id": "d8bcd413-1c15-4170-969c-d6613ee182c8",
      "occurred_at": "2026-10-28T13:59:55.032993Z",
      "actor_type": "STAFF",
      "actor_id": "082b7a54-1900-46de-b027-a59df7363721",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1b2d34c4-6d54-4ad1-bd71-9e33abaf87bc\", \"order_ids\": []}",
      "correlation_id": "2a2d5476-20b2-429d-81bc-9125bfc8ca4f"
    },
    {
      "id": "d01d54be-2451-4440-af30-38255856ed2b",
      "occurred_at": "2026-10-28T13:59:55.005555Z",
      "actor_type": "STAFF",
      "actor_id": "082b7a54-1900-46de-b027-a59df7363721",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"1b2d34c4-6d54-4ad1-bd71-9e33abaf87bc\", \"order_ids\": []}",
      "correlation_id": "2d2c9d3b-12a4-4db2-8810-6aaba0811f09"
    }
  ]
}
```

Done: call a33ffa5a-12bf-42ab-b7aa-784940b36d18 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633828296",
  "device_ref": "sandbox-200"
}
```

```json
{
  "challenge_id": "db255f21-f5e6-4bcd-ba46-d007f28a0cf4",
  "expires_at": "2026-10-28T14:04:55.261125611Z",
  "resend_available_at": "2026-10-28T13:59:56.261125611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633828296` → **200**

```json
{
  "phone": "+380633828296",
  "audience": "CLIENT",
  "code": "893765",
  "sent_at": "2026-10-28T13:59:55.264124265Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db255f21-f5e6-4bcd-ba46-d007f28a0cf4",
  "code": "893765",
  "device_ref": "sandbox-200"
}
```

```json
{
  "session_id": "2d3ab8b9-980b-4daa-9562-326103523ad3",
  "subject": {
    "type": "CLIENT",
    "id": "08083d87-5484-430b-a895-984dc50ef4e9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODA4M2Q4Ny01NDg0LTQzMGItYTg5NS05ODRkYzUwZWY0ZTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2ODk1LCJpYXQiOjE3OTMxOTU5OTUsImp0aSI6IjFmOTE1YzA5LTA4NDYtNGNmZS1iYjBlLTM1ZWY4MDUyMzY2ZCIsInNpZCI6IjJkM2FiOGI5LTk4MGItNGRhYS05NTYyLTMyNjEwMzUyM2FkMyJ9.21D6tXrIJq0J0HcFx7gfqwspMEALHbGMZV8trle4G98",
  "access_expires_at": "2026-10-28T14:14:55.468855614Z",
  "refresh_token": "0HpsOesK-2zOfMXxSZ_8IK34BHrQz_JHcs_G9iJ4ecg",
  "refresh_expires_at": "2026-11-27T13:59:55.468283263Z",
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
  "device_ref": "sandbox-5483"
}
```

```json
{
  "challenge_id": "511ad1ac-a868-4698-bfd6-cbeb7db0dbf0",
  "expires_at": "2026-10-28T14:04:55.884035989Z",
  "resend_available_at": "2026-10-28T13:59:56.884035989Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "914463",
  "sent_at": "2026-10-28T13:59:55.887527495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "511ad1ac-a868-4698-bfd6-cbeb7db0dbf0",
  "code": "914463",
  "device_ref": "sandbox-5483"
}
```

```json
{
  "session_id": "ba14eb68-1ac2-4537-900b-e3356aa6c89e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njg5NiwiaWF0IjoxNzkzMTk1OTk2LCJqdGkiOiIzZmViOTAzNS0yMzIxLTQzMDctYWUyYy05ZDZiZmJlZDBjMGMiLCJzaWQiOiJiYTE0ZWI2OC0xYWMyLTQ1MzctOTAwYi1lMzM1NmFhNmM4OWUifQ.au2I-IOvFT9383zZDltbTQ1KQK0Xag_w8Z-GyJEOr8g",
  "access_expires_at": "2026-10-28T14:14:56.11380248Z",
  "refresh_token": "0d1isE7V0QRRSKNIQKYplqqv9i5UXn3RiA_a8xh0bCc",
  "refresh_expires_at": "2026-11-27T13:59:56.113323128Z",
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
  "session_id": "5b1ab969-1049-4ef1-804c-041d6e5c53f6",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4OTYsImlhdCI6MTc5MzE5NTk5NiwianRpIjoiOTI0NzUzYWMtYWYxNy00NDQ1LWEwYTAtYjUzZGUwMzYwYjIwIiwic2lkIjoiNWIxYWI5NjktMTA0OS00ZWYxLTgwNGMtMDQxZDZlNWM1M2Y2In0.Z3mjL_PqynYoxCo33YdOUmLxuDwWrTXfxyJKsPcuxUU",
  "access_expires_at": "2026-10-28T14:14:56.76810542Z",
  "refresh_token": "WM3MPrLBSG4feLyqwr-g8zx2oQ_eVpVgMmLHfbiOTgI",
  "refresh_expires_at": "2026-10-29T01:59:56.767429202Z",
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
  "session_id": "1aca0e49-af7c-40f4-a744-a294c460f1d4",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY4OTcsImlhdCI6MTc5MzE5NTk5NywianRpIjoiN2E3Nzk0NTYtNzdlZC00ZDk2LThkYjQtNGFiYzUxMTc1NmQzIiwic2lkIjoiMWFjYTBlNDktYWY3Yy00MGY0LWE3NDQtYTI5NGM0NjBmMWQ0In0.fxGB9799JyoUcd6XBW_I3w0hpVBvDtRWuuXeX0YBWIU",
  "access_expires_at": "2026-10-28T14:14:57.194563925Z",
  "refresh_token": "fBhde_7YeInPa_rBU2ekSE3kxBQUWyt8hACHHgEpIkk",
  "refresh_expires_at": "2026-10-29T01:59:57.193981158Z",
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
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "en": "Operator error",
        "ru": "Ошибка оператора",
        "pl": "Błąd operatora",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "en": "Accident",
        "ru": "ДТП",
        "pl": "Wypadek",
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
  "command_id": "3b9cf0e3-9af4-4477-b968-49187dbc70d8",
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
  "id": "7b2736da-7ea4-411d-acb7-751df1f5cd76",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:04:57.589267Z",
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
  "command_id": "94b190cb-fa69-4857-93cf-fc3014768ca5",
  "quote_id": "7b2736da-7ea4-411d-acb7-751df1f5cd76",
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
  "id": "eaf3aa59-7226-4c04-ac53-b142ebfdf9ae",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08083d87-5484-430b-a895-984dc50ef4e9",
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
  "created_at": "2026-10-28T13:59:57.81147Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/eaf3aa59-7226-4c04-ac53-b142ebfdf9ae` → **200**

```json
{
  "id": "eaf3aa59-7226-4c04-ac53-b142ebfdf9ae",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08083d87-5484-430b-a895-984dc50ef4e9",
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
  "created_at": "2026-10-28T13:59:57.81147Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/eaf3aa59-7226-4c04-ac53-b142ebfdf9ae/cancel` → **200**

```json
{
  "command_id": "84335483-d783-448b-b6af-f1043a8ad1bb",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "eaf3aa59-7226-4c04-ac53-b142ebfdf9ae",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "08083d87-5484-430b-a895-984dc50ef4e9",
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
  "created_at": "2026-10-28T13:59:57.81147Z",
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
  "command_id": "ffa44bc6-f54a-4983-b101-9fa1bf108f4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:59:58Z",
    "sequence": 1793195998679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "47f8579a-4a67-4696-827b-cc1a648d4e4b",
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
  "last_heartbeat_at": "2026-10-28T13:59:58.697047Z",
  "last_location_at": "2026-10-28T13:59:58.697047Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31595"
}
```

```json
{
  "challenge_id": "efcd11c7-2f3c-41ba-9ed8-24a38e93499c",
  "expires_at": "2026-10-28T14:04:58.898233421Z",
  "resend_available_at": "2026-10-28T13:59:59.898233421Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "710996",
  "sent_at": "2026-10-28T13:59:58.901680601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efcd11c7-2f3c-41ba-9ed8-24a38e93499c",
  "code": "710996",
  "device_ref": "sandbox-31595"
}
```

```json
{
  "session_id": "6b0b6c75-b9ad-42be-86f0-8834429d8d3e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njg5OSwiaWF0IjoxNzkzMTk1OTk5LCJqdGkiOiJhODU1ZDczNy1lZTY4LTQwMTItYjcyNi03OTc1ZTU0YTgzZTgiLCJzaWQiOiI2YjBiNmM3NS1iOWFkLTQyYmUtODZmMC04ODM0NDI5ZDhkM2UifQ.dFjtolViDqGnsUlekWSr18wsXctZXgwjxLVw-EXZtD4",
  "access_expires_at": "2026-10-28T14:14:59.117019227Z",
  "refresh_token": "LxueLUTD_CFa0RTx6YlgqjySCPBnxu6MqcIhoUImN-U",
  "refresh_expires_at": "2026-11-27T13:59:59.116379943Z",
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
  "command_id": "b644f13a-5fcf-443d-9718-b2e83697278a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T13:59:59Z",
    "sequence": 1793195999486
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eedbfd67-69e7-452f-aa9d-46cad1885b58",
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
  "last_heartbeat_at": "2026-10-28T13:59:59.50448Z",
  "last_location_at": "2026-10-28T13:59:59.50448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c36369a6-9875-4012-b0f5-e0e1c1368052",
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
  "id": "199ebabb-2674-44a4-95b2-3762aafb88b9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:04:59.714020Z",
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
  "command_id": "85461826-4ff8-41bf-be99-3207d35123ff",
  "quote_id": "199ebabb-2674-44a4-95b2-3762aafb88b9",
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
  "id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "08083d87-5484-430b-a895-984dc50ef4e9",
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
  "created_at": "2026-10-28T13:59:59.916729Z",
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
    "id": "e82c68b7-5386-4b7f-bbaa-f0d80f24d5d5",
    "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
    "expires_at": "2026-10-28T14:00:14.920847Z",
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

`POST /api/driver/v1/offers/e82c68b7-5386-4b7f-bbaa-f0d80f24d5d5/accept` → **200**

```json
{
  "command_id": "4fce2de3-ba78-47ad-8ccc-fc2763cffe70"
}
```

```json
{
  "id": "6fb49e56-5586-4d3a-8cf4-07ea08ae3b29",
  "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "57680371-95fe-4d40-bd27-db6b39d09951",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "57680371-95fe-4d40-bd27-db6b39d09951",
  "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "assignment_id": "6fb49e56-5586-4d3a-8cf4-07ea08ae3b29",
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

`POST /api/driver/v1/trips/57680371-95fe-4d40-bd27-db6b39d09951/cancel` → **200**

```json
{
  "command_id": "5eef01ce-da2f-4054-9b2e-6a3ce879c8b7",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "57680371-95fe-4d40-bd27-db6b39d09951",
  "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "assignment_id": "6fb49e56-5586-4d3a-8cf4-07ea08ae3b29",
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

`GET /api/rider/v1/orders/d48f0819-1f4c-476b-a72f-1165d4ebd7fc` → **200**

```json
{
  "id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "08083d87-5484-430b-a895-984dc50ef4e9",
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
    "id": "6fb49e56-5586-4d3a-8cf4-07ea08ae3b29",
    "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "57680371-95fe-4d40-bd27-db6b39d09951",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T13:59:59.916729Z",
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
    "id": "8b1f8c02-5afc-4df4-9680-1d532bc1fbb4",
    "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
    "expires_at": "2026-10-28T14:00:15.725253Z",
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

`POST /api/driver/v1/offers/8b1f8c02-5afc-4df4-9680-1d532bc1fbb4/accept` → **200**

```json
{
  "command_id": "b33a0ecb-08f9-447c-95d9-78b322c7a1e6"
}
```

```json
{
  "id": "a2480910-cca1-494b-849b-53991bc7b3e0",
  "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0f448185-789d-4483-9719-1adb788386ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0f448185-789d-4483-9719-1adb788386ac",
  "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "assignment_id": "a2480910-cca1-494b-849b-53991bc7b3e0",
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

`POST /api/driver/v1/trips/0f448185-789d-4483-9719-1adb788386ac/cancel` → **200**

```json
{
  "command_id": "2f0f1902-d060-454c-8c8c-028e48abd383",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "0f448185-789d-4483-9719-1adb788386ac",
  "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
  "assignment_id": "a2480910-cca1-494b-849b-53991bc7b3e0",
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
    "id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:59:59.916729Z",
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
    "id": "eaf3aa59-7226-4c04-ac53-b142ebfdf9ae",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T13:59:57.81147Z",
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

`GET /api/operator/v1/orders/d48f0819-1f4c-476b-a72f-1165d4ebd7fc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T13:59:59.917433Z",
      "actor": {
        "type": "CLIENT",
        "id": "08083d87-5484-430b-a895-984dc50ef4e9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
        "quote_id": "199ebabb-2674-44a4-95b2-3762aafb88b9",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "b00dc87d-b78c-4749-b777-012215eab4a6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T13:59:59.919753Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
        "attempt_id": "e68c6660-f727-46be-8b1f-0d183475c6dc",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b00dc87d-b78c-4749-b777-012215eab4a6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T13:59:59.926093Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e82c68b7-5386-4b7f-bbaa-f0d80f24d5d5",
        "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "b00dc87d-b78c-4749-b777-012215eab4a6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:00:00.322343Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e82c68b7-5386-4b7f-bbaa-f0d80f24d5d5",
        "order_id": "d48f0819-1f4c-476b-a72f-1165d4ebd7fc",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6fb49e56-5586-4d3a-8cf4-07ea08ae3b29"
      },
      "correlation_id": "0ec9d9c2-f766-45ec-9016-83e24b9beb3e"
```

Done: orders eaf3aa59-7226-4c04-ac53-b142ebfdf9ae, d48f0819-1f4c-476b-a72f-1165d4ebd7fc.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738626813",
  "device_ref": "sandbox-257"
}
```

```json
{
  "challenge_id": "a05009ea-f658-490b-a0f0-d86ee4a137bf",
  "expires_at": "2026-10-28T14:05:02.370239153Z",
  "resend_available_at": "2026-10-28T14:00:03.370239153Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738626813` → **200**

```json
{
  "phone": "+380738626813",
  "audience": "CLIENT",
  "code": "110959",
  "sent_at": "2026-10-28T14:00:02.37366637Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a05009ea-f658-490b-a0f0-d86ee4a137bf",
  "code": "110959",
  "device_ref": "sandbox-257"
}
```

```json
{
  "session_id": "29c60c23-dd20-4ae2-8bfb-317025eaae56",
  "subject": {
    "type": "CLIENT",
    "id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzM1ZDkwMS00YzI4LTRiZjUtOGU2NS04OGM5Y2E2NmVlZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTAyLCJpYXQiOjE3OTMxOTYwMDIsImp0aSI6Ijk4YTJiZTkyLTI3MmItNGQ5Yi1hOTU0LTg4MDEzNDg3YjNjZCIsInNpZCI6IjI5YzYwYzIzLWRkMjAtNGFlMi04YmZiLTMxNzAyNWVhYWU1NiJ9.Iv6LEPHMEWIo_iQoPJx2mfgZRKd3rrRmgPn2ml1SSgE",
  "access_expires_at": "2026-10-28T14:15:02.582872365Z",
  "refresh_token": "8LV_Pzwaj7gi4kq644EernYixgzw1LaNCC8s0lFY5ck",
  "refresh_expires_at": "2026-11-27T14:00:02.582448638Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "bb1374d7-f4c4-4769-8bd1-0cb7c233ab8e",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "01fb1cca-6931-47de-b389-a1071531cea3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-01fb1cca-6931-47de-b389-a1071531cea3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "95df79af268e32d5c1e5457bdf1b2039",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=01fb1cca-6931-47de-b389-a1071531cea3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738626813"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=01fb1cca-6931-47de-b389-a1071531cea3",
  "expires_at": "2026-10-28T14:30:02.781094Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/01fb1cca-6931-47de-b389-a1071531cea3` → **200**

```json
{
  "id": "01fb1cca-6931-47de-b389-a1071531cea3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T14:30:02.781094Z",
  "card": {
    "id": "9cf9a5f6-6ce0-4afb-bb41-c96b6bf6965a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5512",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:00:02.98938Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "9cf9a5f6-6ce0-4afb-bb41-c96b6bf6965a",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5512",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:00:02.98938Z"
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
  "device_ref": "sandbox-23705"
}
```

```json
{
  "challenge_id": "665f2076-6b9f-49ed-aee8-6d4d78515304",
  "expires_at": "2026-10-28T14:05:03.386963082Z",
  "resend_available_at": "2026-10-28T14:00:04.386963082Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "020902",
  "sent_at": "2026-10-28T14:00:03.390111896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "665f2076-6b9f-49ed-aee8-6d4d78515304",
  "code": "020902",
  "device_ref": "sandbox-23705"
}
```

```json
{
  "session_id": "0cdd44d6-95db-4fb6-9ec4-186a4a629e49",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjkwMywiaWF0IjoxNzkzMTk2MDAzLCJqdGkiOiIzNjczN2Q0Yi0xOTcxLTRiNTMtYWU0OC03ZWEwY2U0YjQwZTAiLCJzaWQiOiIwY2RkNDRkNi05NWRiLTRmYjYtOWVjNC0xODZhNGE2MjllNDkifQ.cSObVOQGBOqvlI5eUp1A7U-bn5GoyqxtNBGZeBXacfw",
  "access_expires_at": "2026-10-28T14:15:03.598378679Z",
  "refresh_token": "sKG0lOWyjIh2B7q0g7UOTCsuNmYZzv8WlQ3YpajKUp8",
  "refresh_expires_at": "2026-11-27T14:00:03.597723738Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eedbfd67-69e7-452f-aa9d-46cad1885b58",
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
  "last_heartbeat_at": "2026-10-28T13:59:59.50448Z",
  "last_location_at": "2026-10-28T13:59:59.50448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eedbfd67-69e7-452f-aa9d-46cad1885b58/handover` → **200**

```json
{
  "command_id": "ec5b9125-7ffd-4706-ae5e-f75cfb6e8b99",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eedbfd67-69e7-452f-aa9d-46cad1885b58",
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
  "last_heartbeat_at": "2026-10-28T13:59:59.50448Z",
  "last_location_at": "2026-10-28T13:59:59.50448Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eedbfd67-69e7-452f-aa9d-46cad1885b58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:04Z",
    "sequence": 1793196004169
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eedbfd67-69e7-452f-aa9d-46cad1885b58",
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
  "last_heartbeat_at": "2026-10-28T14:00:04.187774Z",
  "last_location_at": "2026-10-28T14:00:04.187774Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3317a8e7-1f94-4ed2-b844-b507ca8368c2",
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
  "id": "fc5e6c84-57c7-4a7b-bf3f-78c23afd134e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:05:04.383157Z",
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
  "command_id": "77d3ed2c-b21b-4881-8d62-cbb8af71459a",
  "quote_id": "fc5e6c84-57c7-4a7b-bf3f-78c23afd134e",
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
  "id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2",
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
  "created_at": "2026-10-28T14:00:04.582245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54` → **200**

```json
{
  "id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2",
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
  "created_at": "2026-10-28T14:00:04.582245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54` → **200**

```json
{
  "id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2",
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
  "created_at": "2026-10-28T14:00:04.582245Z",
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
    "id": "de76d661-2ae7-416c-b702-5cb1012396dd",
    "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
    "expires_at": "2026-10-28T14:00:19.923402Z",
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

`POST /api/driver/v1/offers/de76d661-2ae7-416c-b702-5cb1012396dd/accept` → **200**

```json
{
  "command_id": "f950a128-7bc6-4709-b92b-046057d82cbb"
}
```

```json
{
  "id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "862b7824-7924-4136-9a03-bd669c6a8726",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "862b7824-7924-4136-9a03-bd669c6a8726",
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "assignment_id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
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

`POST /api/driver/v1/work-sessions/eedbfd67-69e7-452f-aa9d-46cad1885b58/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:06Z",
    "sequence": 1793196006754
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eedbfd67-69e7-452f-aa9d-46cad1885b58",
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
  "last_heartbeat_at": "2026-10-28T14:00:06.772324Z",
  "last_location_at": "2026-10-28T14:00:06.772324Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/862b7824-7924-4136-9a03-bd669c6a8726/arrive` → **200**

```json
{
  "command_id": "7bf42823-c8e3-4f55-9e03-c8b626fcf10e",
  "expected_version": 0
}
```

```json
{
  "id": "862b7824-7924-4136-9a03-bd669c6a8726",
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "assignment_id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
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
  "arrived_at": "2026-10-28T14:00:06.984601Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/862b7824-7924-4136-9a03-bd669c6a8726/start` → **200**

```json
{
  "command_id": "e55b6829-7f68-422a-a854-771350d45e87",
  "expected_version": 1
}
```

```json
{
  "id": "862b7824-7924-4136-9a03-bd669c6a8726",
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "assignment_id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
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
  "arrived_at": "2026-10-28T14:00:06.984601Z",
  "started_at": "2026-10-28T14:00:07.188117Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/862b7824-7924-4136-9a03-bd669c6a8726/complete` → **200**

```json
{
  "command_id": "2229facf-fc6f-4857-a692-d1f60adec748",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:00:07Z"
}
```

```json
{
  "id": "862b7824-7924-4136-9a03-bd669c6a8726",
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "assignment_id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
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
  "arrived_at": "2026-10-28T14:00:06.984601Z",
  "started_at": "2026-10-28T14:00:07.188117Z",
  "completed_at": "2026-10-28T14:00:07.412613Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54` → **200**

```json
{
  "id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2",
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
    "id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
    "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "862b7824-7924-4136-9a03-bd669c6a8726",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:00:04.582245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54` → **200**

```json
{
  "id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2",
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
    "id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
    "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "862b7824-7924-4136-9a03-bd669c6a8726",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:00:04.582245Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54` → **200**

```json
{
  "id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4335d901-4c28-4bf5-8e65-88c9ca66eef2",
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
    "id": "4b10cdbf-572c-4ac6-97b6-ea9f247a1429",
    "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "862b7824-7924-4136-9a03-bd669c6a8726",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:00:04.582245Z",
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
      "id": "960e9761-b2a3-4bf2-82fd-1f732d321244",
      "at": "2026-10-28T14:00:07.976082Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54/tip` → **200**

```json
{
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
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
  "available_until": "2026-10-29T14:00:07.412613Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54/tip` → **201**

```json
{
  "command_id": "9db4635f-8aea-47c6-b884-595a0bd97771",
  "amount_minor": 2500
}
```

```json
{
  "id": "0736165e-37bc-4eee-9f38-04a54cc49352",
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:00:10.830571Z"
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54/tip` → **200**

```json
{
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
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
  "available_until": "2026-10-29T14:00:07.412613Z",
  "open": false,
  "tip": {
    "id": "0736165e-37bc-4eee-9f38-04a54cc49352",
    "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:00:10.830571Z"
  }
}
```

`GET /api/rider/v1/orders/fdc81ecf-b648-45c0-9616-788abb4bcc54/tip` → **200**

```json
{
  "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
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
  "available_until": "2026-10-29T14:00:07.412613Z",
  "open": false,
  "tip": {
    "id": "0736165e-37bc-4eee-9f38-04a54cc49352",
    "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:00:10.830571Z"
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
      "id": "8b970d88-d548-47b9-abbb-8a894e2e7427",
      "at": "2026-10-28T14:00:12.066805Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
      "counterpart_id": null
    },
    {
      "id": "960e9761-b2a3-4bf2-82fd-1f732d321244",
      "at": "2026-10-28T14:00:07.976082Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "fdc81ecf-b648-45c0-9616-788abb4bcc54",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "eedbfd67-69e7-452f-aa9d-46cad1885b58",
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
  "last_heartbeat_at": "2026-10-28T14:00:06.772324Z",
  "last_location_at": "2026-10-28T14:00:06.772324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/eedbfd67-69e7-452f-aa9d-46cad1885b58/close` → **200**

```json
{
  "command_id": "14ee4a64-0a7e-4ece-b0d3-b70f46b5a62d",
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

Done: card order fdc81ecf-b648-45c0-9616-788abb4bcc54.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737036877",
  "device_ref": "sandbox-28037"
}
```

```json
{
  "challenge_id": "942a1f83-85fc-44b8-8f23-608bc551064f",
  "expires_at": "2026-10-28T14:05:13.050061581Z",
  "resend_available_at": "2026-10-28T14:00:14.050061581Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380737036877` → **200**

```json
{
  "phone": "+380737036877",
  "audience": "CLIENT",
  "code": "166418",
  "sent_at": "2026-10-28T14:00:13.052994003Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "942a1f83-85fc-44b8-8f23-608bc551064f",
  "code": "166418",
  "device_ref": "sandbox-28037"
}
```

```json
{
  "session_id": "3fbc6cd5-5e16-4abb-9dfa-315778daf235",
  "subject": {
    "type": "CLIENT",
    "id": "276af4eb-2406-4cd6-9eb3-9a58cf82032b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNzZhZjRlYi0yNDA2LTRjZDYtOWViMy05YTU4Y2Y4MjAzMmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTEzLCJpYXQiOjE3OTMxOTYwMTMsImp0aSI6Ijk3ZjA0MmY1LWUxY2UtNDBjMS05ZmI0LTA2Y2M3ODI4ZjYyZCIsInNpZCI6IjNmYmM2Y2Q1LTVlMTYtNGFiYi05ZGZhLTMxNTc3OGRhZjIzNSJ9.4KfnIljUNwYc3IO0LS6fBMRH5prgL6bZAXCeiRdsbvE",
  "access_expires_at": "2026-10-28T14:15:13.270732773Z",
  "refresh_token": "XcwXXY0HWClpC4kkm5VM-LH4nplASXH4AeTskuyvPqo",
  "refresh_expires_at": "2026-11-27T14:00:13.270133787Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "0f562267-a0c5-4851-b877-99f677b6b5cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "df712884-b628-441f-98a4-c0cb8a5a9807",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-df712884-b628-441f-98a4-c0cb8a5a9807",
    "orderDate": "1793196013",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "7291912f12bbad8d6d80bfa0d818f085",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=df712884-b628-441f-98a4-c0cb8a5a9807",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737036877"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=df712884-b628-441f-98a4-c0cb8a5a9807",
  "created_at": "2026-10-28T14:00:13.480315Z",
  "expires_at": "2026-10-28T14:30:13.480315Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/df712884-b628-441f-98a4-c0cb8a5a9807` → **200**

```json
{
  "id": "df712884-b628-441f-98a4-c0cb8a5a9807",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:00:13.480315Z",
  "expires_at": "2026-10-28T14:30:13.480315Z",
  "completed_at": "2026-10-28T14:00:13.681321Z",
  "masked_pan": "41****9771",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "276af4eb-2406-4cd6-9eb3-9a58cf82032b",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "276af4eb-2406-4cd6-9eb3-9a58cf82032b",
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
      "id": "7082f2f2-be15-473b-9351-448e69da2754",
      "at": "2026-10-28T14:00:14.083957Z",
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
  "client_id": "276af4eb-2406-4cd6-9eb3-9a58cf82032b",
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
      "id": "7082f2f2-be15-473b-9351-448e69da2754",
      "at": "2026-10-28T14:00:14.083957Z",
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
  "device_ref": "sandbox-29245"
}
```

```json
{
  "challenge_id": "1412671e-b004-4a1b-8441-de04f2a6fff3",
  "expires_at": "2026-10-28T14:05:15.456650962Z",
  "resend_available_at": "2026-10-28T14:00:16.456650962Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "620211",
  "sent_at": "2026-10-28T14:00:15.459607044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1412671e-b004-4a1b-8441-de04f2a6fff3",
  "code": "620211",
  "device_ref": "sandbox-29245"
}
```

```json
{
  "session_id": "1a3299cd-f3c1-4bd6-831c-331798f12c06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NjkxNSwiaWF0IjoxNzkzMTk2MDE1LCJqdGkiOiIwNDUwZDU0Yy02YjUyLTRlMzEtYTBmZi04YWQ1ODY3MjY5OTQiLCJzaWQiOiIxYTMyOTljZC1mM2MxLTRiZDYtODMxYy0zMzE3OThmMTJjMDYifQ.9PvAQjxhbYHxF2nf-98n8Y6wYvf6gJyW6InE5IntIkY",
  "access_expires_at": "2026-10-28T14:15:15.675825735Z",
  "refresh_token": "odBkoFezJsE3uO7-8Bn-7cmazvx5fjtNCsFkR3ARArk",
  "refresh_expires_at": "2026-11-27T14:00:15.675147397Z",
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
  "command_id": "c3c28ea4-760e-443f-a904-6e15d596d9d8",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "2770d585-cde7-43d8-b0cd-32208f6811e9",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2770d585-cde7-43d8-b0cd-32208f6811e9",
    "orderDate": "1793196016",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "716ff53425d7525e9fbcab0a98cf6196",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2770d585-cde7-43d8-b0cd-32208f6811e9",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2770d585-cde7-43d8-b0cd-32208f6811e9",
  "created_at": "2026-10-28T14:00:16.080401Z",
  "expires_at": "2026-10-28T14:30:16.080401Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/2770d585-cde7-43d8-b0cd-32208f6811e9` → **200**

```json
{
  "id": "2770d585-cde7-43d8-b0cd-32208f6811e9",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:00:16.080401Z",
  "expires_at": "2026-10-28T14:30:16.080401Z",
  "completed_at": "2026-10-28T14:00:16.289442Z",
  "masked_pan": "41****5451",
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
      "id": "624cff1b-9b1b-470f-8ff1-c4b6a1c1af11",
      "at": "2026-10-28T14:00:17.108384Z",
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
  "command_id": "d7cca0c9-825f-45d8-9b8f-a0add5be22f0",
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
  "correlation_id": "ec4a7394-31e8-4332-bb2e-23db37e8924e"
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
  "session_id": "c276dc8f-cac7-42df-88ca-7dabe3c7019c",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5MTgsImlhdCI6MTc5MzE5NjAxOCwianRpIjoiMDcxYzAxYjctMzQ4Yy00ZWIwLWI3OWMtOGQ2MzE2ZmVkOTYxIiwic2lkIjoiYzI3NmRjOGYtY2FjNy00MmRmLTg4Y2EtN2RhYmUzYzcwMTljIn0.lBbPRHwosXPm842S6Ej4wrCT0F2e_MxMAyXOt-ryizE",
  "access_expires_at": "2026-10-28T14:15:18.340459642Z",
  "refresh_token": "L0B5NoEbID2Q5geKEAsUsMVfFAei7RmawWgoQyAcUnI",
  "refresh_expires_at": "2026-10-29T02:00:18.340017025Z",
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

**Contract validation failed — scenario stopped.**

# Scenario: client-deletion

## A rider signs in and takes a quote

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676428416",
  "device_ref": "sandbox-30970"
}
```

```json
{
  "challenge_id": "55282ec8-1bd8-4c9d-9f95-5ef4a4e120f8",
  "expires_at": "2026-10-28T14:05:18.748195405Z",
  "resend_available_at": "2026-10-28T14:00:19.748195405Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676428416` → **200**

```json
{
  "phone": "+380676428416",
  "audience": "CLIENT",
  "code": "018617",
  "sent_at": "2026-10-28T14:00:18.751641973Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55282ec8-1bd8-4c9d-9f95-5ef4a4e120f8",
  "code": "018617",
  "device_ref": "sandbox-30970"
}
```

```json
{
  "session_id": "0a4c7da6-9de1-44df-b3b9-d86ae563e683",
  "subject": {
    "type": "CLIENT",
    "id": "4118c8a7-6256-4ad1-8671-a1016c612495"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MTE4YzhhNy02MjU2LTRhZDEtODY3MS1hMTAxNmM2MTI0OTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTE4LCJpYXQiOjE3OTMxOTYwMTgsImp0aSI6ImU5NWE4MzkyLTFmODQtNGFjNC1hOGM2LTUzZDNjZWIzMzNjNiIsInNpZCI6IjBhNGM3ZGE2LTlkZTEtNDRkZi1iM2I5LWQ4NmFlNTYzZTY4MyJ9.M9uaeHmQ7n6Sahpnw6vaWQyWBsfDRWPL8-hddMb06t0",
  "access_expires_at": "2026-10-28T14:15:18.957787555Z",
  "refresh_token": "t3-o8cf9oDFR0A33_p9Fera73QEtyTqT046ibO2mniI",
  "refresh_expires_at": "2026-11-27T14:00:18.957216146Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "4118c8a7-6256-4ad1-8671-a1016c612495",
  "session_id": "0a4c7da6-9de1-44df-b3b9-d86ae563e683",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0b25055c-528f-4348-bb0b-a16b41627071",
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
  "id": "056fde70-a52a-4095-a033-0a4dbe28f814",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:05:19.356144Z",
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
  "challenge_id": "d18ab800-39ce-46bc-9b37-d57a2364cc71",
  "expires_at": "2026-10-28T14:05:21.561333313Z",
  "resend_available_at": "2026-10-28T14:00:22.561333313Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676428416` → **200**

```json
{
  "phone": "+380676428416",
  "audience": "CLIENT",
  "code": "096864",
  "sent_at": "2026-10-28T14:00:21.563627227Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "e8e3c6fa-05ce-4e8e-b591-ac5c710fe0ed",
  "challenge_id": "d18ab800-39ce-46bc-9b37-d57a2364cc71",
  "otp_code": "096864"
}
```

```json
{
  "client_id": "4118c8a7-6256-4ad1-8671-a1016c612495",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:00:21.785889769Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "4291b1b4-39b9-4e49-92e6-e70ba9034b2c",
  "quote_id": "056fde70-a52a-4095-a033-0a4dbe28f814",
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
  "correlation_id": "e2b6172a-a2f3-4bfd-a7cf-4dab9e7f73b6"
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
  "session_id": "7ef323ed-ccf7-4c84-87d0-9abf1b6a370c",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5MjIsImlhdCI6MTc5MzE5NjAyMiwianRpIjoiZjU3NTMyZGUtZGZhZC00YWMzLWIwNzEtYTk1ZTcwN2VlYjZmIiwic2lkIjoiN2VmMzIzZWQtY2NmNy00Yzg0LTg3ZDAtOWFiZjFiNmEzNzBjIn0.UpR3tSvBBqODD0OZDGvojEWNSPbvAl8bpoRFa6Z7Gag",
  "access_expires_at": "2026-10-28T14:15:22.403150408Z",
  "refresh_token": "lU4kDtmaFD4C4Tw7LKNUu7KDrr6KwvnGTvB5QJd2A2g",
  "refresh_expires_at": "2026-10-29T02:00:22.402490727Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "4118c8a7-6256-4ad1-8671-a1016c612495",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:00:21.78589Z",
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

`POST /api/admin/v1/client-deletions/4118c8a7-6256-4ad1-8671-a1016c612495/complete` → **200**

```json
{
  "command_id": "bcbb6139-a0bd-4d90-82f0-b35e1c1a0519",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "4118c8a7-6256-4ad1-8671-a1016c612495",
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
  "correlation_id": "5e1c9b94-a5a6-40f2-afb0-ed68fc7e876c"
}
```

Done: client 4118c8a7-6256-4ad1-8671-a1016c612495 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666005298",
  "device_ref": "sandbox-4074"
}
```

```json
{
  "challenge_id": "81430f1f-4a50-4944-ab1d-b577b9913546",
  "expires_at": "2026-10-28T14:05:23.223635212Z",
  "resend_available_at": "2026-10-28T14:00:24.223635212Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666005298` → **200**

```json
{
  "phone": "+380666005298",
  "audience": "CLIENT",
  "code": "477430",
  "sent_at": "2026-10-28T14:00:23.226178589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81430f1f-4a50-4944-ab1d-b577b9913546",
  "code": "477430",
  "device_ref": "sandbox-4074"
}
```

```json
{
  "session_id": "bbd9bd9e-d181-45d7-bc57-3197df393f36",
  "subject": {
    "type": "CLIENT",
    "id": "48c487ec-4008-4e77-befe-1042e6a93678"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OGM0ODdlYy00MDA4LTRlNzctYmVmZS0xMDQyZTZhOTM2NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTIzLCJpYXQiOjE3OTMxOTYwMjMsImp0aSI6ImRkOGRmNGQ3LTVlMmItNGM2Yy04ZTllLWQ5OWExYWM0NWU1MiIsInNpZCI6ImJiZDliZDllLWQxODEtNDVkNy1iYzU3LTMxOTdkZjM5M2YzNiJ9.NwzXrojOautB51bV_L9bGUWEZBeTvgKmYeOMbHofezU",
  "access_expires_at": "2026-10-28T14:15:23.446390551Z",
  "refresh_token": "kK71Rvx8QvY14X9R9Z33peJOhuGG0j0MTd9LAeYFQak",
  "refresh_expires_at": "2026-11-27T14:00:23.445842829Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "48c487ec-4008-4e77-befe-1042e6a93678",
  "session_id": "bbd9bd9e-d181-45d7-bc57-3197df393f36",
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
  "session_id": "9ac7a03c-6065-43c2-b477-faa17b297fac",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5MjQsImlhdCI6MTc5MzE5NjAyNCwianRpIjoiNzk5MmZhMDAtMDNlNy00NzNkLWI1NGItODg3NmMwZjhiMDczIiwic2lkIjoiOWFjN2EwM2MtNjA2NS00M2MyLWI0NzctZmFhMTdiMjk3ZmFjIn0.ePV9hy8FiZaO_Nv6pYuzFu3iOytr0iEA495GxcwPwd8",
  "access_expires_at": "2026-10-28T14:15:24.066254719Z",
  "refresh_token": "S_A5AmdNzS7NlyZblSt-YQWBqErUuqHKAvjEsq2fGxs",
  "refresh_expires_at": "2026-10-29T02:00:24.065607002Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=6005298&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "48c487ec-4008-4e77-befe-1042e6a93678",
      "phone": "+380666005298",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:00:23.443754Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/48c487ec-4008-4e77-befe-1042e6a93678` → **200**

```json
{
  "client": {
    "id": "48c487ec-4008-4e77-befe-1042e6a93678",
    "phone": "+380666005298",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:00:23.443754Z",
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

`POST /api/admin/v1/clients/48c487ec-4008-4e77-befe-1042e6a93678/block` → **400**

```json
{
  "command_id": "50226f95-06e3-4dfc-a6c9-acfe7d02b35a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/48c487ec-4008-4e77-befe-1042e6a93678/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a03fb9e1-e3b2-4686-ac1c-dddb8b89742a",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/48c487ec-4008-4e77-befe-1042e6a93678/block` → **200**

```json
{
  "command_id": "ef629bb9-6c79-4394-b5b4-ae890e5b3251",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "48c487ec-4008-4e77-befe-1042e6a93678",
  "phone": "+380666005298",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:00:23.443754Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:00:24.930672Z",
    "by": "082b7a54-1900-46de-b027-a59df7363721"
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
  "correlation_id": "08c3aba6-eebf-4519-a84b-318d52596ff7"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666005298",
  "device_ref": "sandbox-5812"
}
```

```json
{
  "challenge_id": "167bf6c1-259b-4724-b6f7-797c4a26d60d",
  "expires_at": "2026-10-28T14:05:27.3270108Z",
  "resend_available_at": "2026-10-28T14:00:28.3270108Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666005298` → **200**

```json
{
  "phone": "+380666005298",
  "audience": "CLIENT",
  "code": "865177",
  "sent_at": "2026-10-28T14:00:27.329191877Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "167bf6c1-259b-4724-b6f7-797c4a26d60d",
  "code": "865177",
  "device_ref": "sandbox-5812"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e7ead132-77f3-411a-b970-5ec28cb4f148"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/48c487ec-4008-4e77-befe-1042e6a93678` → **200**

```json
{
  "client": {
    "id": "48c487ec-4008-4e77-befe-1042e6a93678",
    "phone": "+380666005298",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:00:23.443754Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:00:24.930672Z",
      "by": "082b7a54-1900-46de-b027-a59df7363721"
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

`POST /api/admin/v1/clients/48c487ec-4008-4e77-befe-1042e6a93678/unblock` → **200**

```json
{
  "command_id": "390ebe83-ce82-456d-9a45-6fe38464cac6",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "48c487ec-4008-4e77-befe-1042e6a93678",
  "phone": "+380666005298",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:00:23.443754Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380666005298",
  "device_ref": "sandbox-4005"
}
```

```json
{
  "challenge_id": "9791ac6d-67ac-4382-be52-cbe7c0717cbc",
  "expires_at": "2026-10-28T14:05:30.197424068Z",
  "resend_available_at": "2026-10-28T14:00:31.197424068Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666005298` → **200**

```json
{
  "phone": "+380666005298",
  "audience": "CLIENT",
  "code": "151510",
  "sent_at": "2026-10-28T14:00:30.199476725Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9791ac6d-67ac-4382-be52-cbe7c0717cbc",
  "code": "151510",
  "device_ref": "sandbox-4005"
}
```

```json
{
  "session_id": "6fdaff17-4736-40c5-9c90-7b823efbd81d",
  "subject": {
    "type": "CLIENT",
    "id": "48c487ec-4008-4e77-befe-1042e6a93678"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0OGM0ODdlYy00MDA4LTRlNzctYmVmZS0xMDQyZTZhOTM2NzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTMwLCJpYXQiOjE3OTMxOTYwMzAsImp0aSI6IjkzMDE1N2NlLWI5NDUtNGY2MC1iYzMzLTVlZjk4N2Y5YzFiNCIsInNpZCI6IjZmZGFmZjE3LTQ3MzYtNDBjNS05YzkwLTdiODIzZWZiZDgxZCJ9.jrPWeDN86Z_xnvBr-KC_8lMOJRpSFiYez8npJ7sK26w",
  "access_expires_at": "2026-10-28T14:15:30.410317469Z",
  "refresh_token": "MzDjucRgxDp2a33HQIcQtBTU8kQ5Tz3309ikAmKTclc",
  "refresh_expires_at": "2026-11-27T14:00:30.4097477Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "48c487ec-4008-4e77-befe-1042e6a93678",
  "session_id": "6fdaff17-4736-40c5-9c90-7b823efbd81d",
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
  "phone": "+380666035407",
  "device_ref": "sandbox-8469"
}
```

```json
{
  "challenge_id": "25735d4b-49ab-4aa6-9780-e7edb0af2f44",
  "expires_at": "2026-10-28T14:05:30.789718243Z",
  "resend_available_at": "2026-10-28T14:00:31.789718243Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380666035407` → **200**

```json
{
  "phone": "+380666035407",
  "audience": "CLIENT",
  "code": "004670",
  "sent_at": "2026-10-28T14:00:30.792018746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25735d4b-49ab-4aa6-9780-e7edb0af2f44",
  "code": "004670",
  "device_ref": "sandbox-8469"
}
```

```json
{
  "session_id": "7a6893c6-e201-409a-abd9-f3c2f9b62c72",
  "subject": {
    "type": "CLIENT",
    "id": "0b9a9399-61e5-42fc-9134-62b1a13e1504"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjlhOTM5OS02MWU1LTQyZmMtOTEzNC02MmIxYTEzZTE1MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTMxLCJpYXQiOjE3OTMxOTYwMzEsImp0aSI6IjU0NmMxMWJmLTU5ZGUtNGE1My1hYTgyLTAwNTJkNTBhNWI3NiIsInNpZCI6IjdhNjg5M2M2LWUyMDEtNDA5YS1hYmQ5LWYzYzJmOWI2MmM3MiJ9.Rptc8fRnD5Lu2Zizjt870roEsienZiLpWAfbAgH_2bs",
  "access_expires_at": "2026-10-28T14:15:31.003801518Z",
  "refresh_token": "01fhlVGn_b1HkehPwPA28iUXQ7uN8DwzaiZJw_ZPe90",
  "refresh_expires_at": "2026-11-27T14:00:31.00341125Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9c6f4c4d-14ea-4791-97cb-90d3be3bbe17",
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
  "id": "10df5446-5673-4962-ae0e-f950048e0423",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:05:31.198856Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 2a60d60d-6bee-49b5-ad8b-5a5147c6ee09) → **201**

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
  "session_id": "a5017530-a0f2-4588-ac75-e4fc6b6312ae",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5MzEsImlhdCI6MTc5MzE5NjAzMSwianRpIjoiMmY0N2I0NjQtYWViYy00YzRiLWEzODEtMjExMmExMmMzODc0Iiwic2lkIjoiYTUwMTc1MzAtYTBmMi00NTg4LWFjNzUtZTRmYzZiNjMxMmFlIn0.CtnBiKo-9oVlcUz9vxw4_qcxbQUt_7vT9qjt8Og941U",
  "access_expires_at": "2026-10-28T14:15:31.676469921Z",
  "refresh_token": "TgkDsJpAGmYgf95HesK0moMOMI7iuu8L2hBiznXIjt8",
  "refresh_expires_at": "2026-10-29T02:00:31.675900085Z",
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
  "session_id": "571af999-4e38-4438-b070-1ec1af03078b",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5MzIsImlhdCI6MTc5MzE5NjAzMiwianRpIjoiMjVhMTM5NTUtNjU2Ny00ZWY4LWE2YjAtYTRjMDc3NjlhNDI2Iiwic2lkIjoiNTcxYWY5OTktNGUzOC00NDM4LWIwNzAtMWVjMWFmMDMwNzhiIn0.1rmV217Q0EG6WGXLWfeo5z0ik_pYiRYSwuRraoXfBlA",
  "access_expires_at": "2026-10-28T14:15:32.103390559Z",
  "refresh_token": "l4360noU_l8S9s5gB114mpJ1c2QVeh0vmTTm6LofvIQ",
  "refresh_expires_at": "2026-10-29T02:00:32.102628345Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d04fd878-0c42-40e9-8821-c93079f87694/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:00:31.398663Z",
      "actor": {
        "type": "CLIENT",
        "id": "0b9a9399-61e5-42fc-9134-62b1a13e1504",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d04fd878-0c42-40e9-8821-c93079f87694",
        "quote_id": "10df5446-5673-4962-ae0e-f950048e0423",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2a60d60d-6bee-49b5-ad8b-5a5147c6ee09"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:00:31.400677Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d04fd878-0c42-40e9-8821-c93079f87694",
        "attempt_id": "ce168cd2-017a-41f0-8284-c0a7078bca4e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2a60d60d-6bee-49b5-ad8b-5a5147c6ee09"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:00:31.408659Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d04fd878-0c42-40e9-8821-c93079f87694",
        "attempt_id": "ce168cd2-017a-41f0-8284-c0a7078bca4e"
      },
      "correlation_id": "2a60d60d-6bee-49b5-ad8b-5a5147c6ee09"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "ce168cd2-017a-41f0-8284-c0a7078bca4e",
        "generation": 1,
        "started_at": "2026-10-28T14:00:31.39968Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:00:31.408659Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:00:31.401683Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/2a60d60d-6bee-49b5-ad8b-5a5147c6ee09` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d04fd878-0c42-40e9-8821-c93079f87694:0",
      "order_id": "d04fd878-0c42-40e9-8821-c93079f87694",
      "at": "2026-10-28T14:00:31.398663Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d04fd878-0c42-40e9-8821-c93079f87694:1",
      "order_id": "d04fd878-0c42-40e9-8821-c93079f87694",
      "at": "2026-10-28T14:00:31.400677Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d04fd878-0c42-40e9-8821-c93079f87694:2",
      "order_id": "d04fd878-0c42-40e9-8821-c93079f87694",
      "at": "2026-10-28T14:00:31.408659Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/94c54ba5-c6e3-4c42-8903-cec4f7f63dd5` → **200**

```json
{
  "found": []
}
```

Done: request 2a60d60d-6bee-49b5-ad8b-5a5147c6ee09 — order d04fd878-0c42-40e9-8821-c93079f87694 found by its id.

`GET /api/rider/v1/orders/d04fd878-0c42-40e9-8821-c93079f87694` → **200**

```json
{
  "id": "d04fd878-0c42-40e9-8821-c93079f87694",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0b9a9399-61e5-42fc-9134-62b1a13e1504",
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
  "created_at": "2026-10-28T14:00:31.398016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d04fd878-0c42-40e9-8821-c93079f87694/cancel` → **200**

```json
{
  "command_id": "fa2c45d4-a962-4f5c-8a2f-7fc0350b35e2",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d04fd878-0c42-40e9-8821-c93079f87694",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0b9a9399-61e5-42fc-9134-62b1a13e1504",
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
  "created_at": "2026-10-28T14:00:31.398016Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
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
  "phone": "+380630561827",
  "device_ref": "sandbox-14321"
}
```

```json
{
  "challenge_id": "b73c4f5d-89ed-460c-98d8-b05020909091",
  "expires_at": "2026-10-28T14:05:33.409534427Z",
  "resend_available_at": "2026-10-28T14:00:34.409534427Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630561827` → **200**

```json
{
  "phone": "+380630561827",
  "audience": "CLIENT",
  "code": "753661",
  "sent_at": "2026-10-28T14:00:33.411709896Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b73c4f5d-89ed-460c-98d8-b05020909091",
  "code": "753661",
  "device_ref": "sandbox-14321"
}
```

```json
{
  "session_id": "c715137c-ca5e-4a1e-8b10-f8ac9cc59215",
  "subject": {
    "type": "CLIENT",
    "id": "e831d93a-01d2-47c5-94c4-f11330cd247b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlODMxZDkzYS0wMWQyLTQ3YzUtOTRjNC1mMTEzMzBjZDI0N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTMzLCJpYXQiOjE3OTMxOTYwMzMsImp0aSI6ImUzNzc2YWY2LWRjZTMtNGVjZi1hNzg4LTZlZGM5NzhjMzMyOCIsInNpZCI6ImM3MTUxMzdjLWNhNWUtNGExZS04YjEwLWY4YWM5Y2M1OTIxNSJ9.kqxgYVSuW0-yMh_A9iha7q0Cxc_OdAxLX-RC0bDhPN8",
  "access_expires_at": "2026-10-28T14:15:33.623294244Z",
  "refresh_token": "uRcwYpO3ljnHcF2VSOYmJsGKRyR-QjxoUWyxKayV_sM",
  "refresh_expires_at": "2026-11-27T14:00:33.622809587Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "2018bf1e-c03a-40fc-b1ed-a698b0b8213e",
  "expires_at": "2026-10-28T14:05:35.816562367Z",
  "resend_available_at": "2026-10-28T14:00:36.816562367Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630561827` → **200**

```json
{
  "phone": "+380630561827",
  "audience": "CLIENT",
  "code": "853862",
  "sent_at": "2026-10-28T14:00:35.818341747Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "3c1dd5a8-8996-451c-a0b0-0a0beadcb818",
  "challenge_id": "2018bf1e-c03a-40fc-b1ed-a698b0b8213e",
  "otp_code": "853862"
}
```

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "PENDING",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b` → **200**

```json
{
  "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
  "state": "READY",
  "created_at": "2026-10-28T14:00:36.030289Z",
  "ready_at": "2026-10-28T14:00:44.577302Z",
  "expires_at": "2026-11-04T14:00:44.577302Z",
  "size_bytes": 1029
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639531254",
  "device_ref": "sandbox-8637"
}
```

```json
{
  "challenge_id": "8f215007-6ef9-492a-84fe-55b02b236bc4",
  "expires_at": "2026-10-28T14:05:44.785330019Z",
  "resend_available_at": "2026-10-28T14:00:45.785330019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639531254` → **200**

```json
{
  "phone": "+380639531254",
  "audience": "CLIENT",
  "code": "998409",
  "sent_at": "2026-10-28T14:00:44.787595044Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8f215007-6ef9-492a-84fe-55b02b236bc4",
  "code": "998409",
  "device_ref": "sandbox-8637"
}
```

```json
{
  "session_id": "e710a2fe-b0d4-4a48-a2dd-a73d65ef42af",
  "subject": {
    "type": "CLIENT",
    "id": "2941f2ab-f278-48c3-9d83-0817c4f3f2eb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOTQxZjJhYi1mMjc4LTQ4YzMtOWQ4My0wODE3YzRmM2YyZWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTQ0LCJpYXQiOjE3OTMxOTYwNDQsImp0aSI6IjM3NTMyZmFlLTBiMmUtNGU3My04YjdjLWQ1YWQwOGFmNTZhMiIsInNpZCI6ImU3MTBhMmZlLWIwZDQtNGE0OC1hMmRkLWE3M2Q2NWVmNDJhZiJ9.MigjIpcSW--RlvMb3neMwhGWWw9Hs4ywO4FeTFoZm5w",
  "access_expires_at": "2026-10-28T14:15:44.995324437Z",
  "refresh_token": "SNgIQjYmYz-3vy9w3Y2PjeKZJgfURJKTEjCeqSYMQPY",
  "refresh_expires_at": "2026-11-27T14:00:44.994871845Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/5e3205e3-dee2-43be-8709-4b2ac06a545b/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "05fa9edc-c4a3-4d78-8f20-f1db3f2b6400"
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
  "session_id": "79b48612-ac36-40e7-9315-63fb63e8182c",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NDUsImlhdCI6MTc5MzE5NjA0NSwianRpIjoiYWVkNjdiNDctY2U3MS00NDgwLTljNjktNThiOTFiZGNkNmVhIiwic2lkIjoiNzliNDg2MTItYWMzNi00MGU3LTkzMTUtNjNmYjYzZTgxODJjIn0.ZtpsdiFDcTy9QQ1zQNQWiMOftbHPwjVKR1hP-G9A4jc",
  "access_expires_at": "2026-10-28T14:15:45.646476815Z",
  "refresh_token": "QKHWVmpZtGLgmygAFprhAAU2FeSDiW-PDBeS-twh95c",
  "refresh_expires_at": "2026-10-29T02:00:45.645933805Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "e831d93a-01d2-47c5-94c4-f11330cd247b",
  "session_id": "c715137c-ca5e-4a1e-8b10-f8ac9cc59215",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/e831d93a-01d2-47c5-94c4-f11330cd247b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "5e3205e3-dee2-43be-8709-4b2ac06a545b",
      "state": "READY",
      "created_at": "2026-10-28T14:00:36.030289Z",
      "ready_at": "2026-10-28T14:00:44.577302Z",
      "expires_at": "2026-11-04T14:00:44.577302Z",
      "size_bytes": 1029
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
  "device_ref": "sandbox-14291"
}
```

```json
{
  "challenge_id": "8cf4fefa-83b8-49c3-9a63-b8daf0a0490f",
  "expires_at": "2026-10-28T14:05:46.226435257Z",
  "resend_available_at": "2026-10-28T14:00:47.226435257Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "111470",
  "sent_at": "2026-10-28T14:00:46.228703962Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8cf4fefa-83b8-49c3-9a63-b8daf0a0490f",
  "code": "111470",
  "device_ref": "sandbox-14291"
}
```

```json
{
  "session_id": "17aea8ae-8995-4670-9bb7-4373d34f42e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk0NiwiaWF0IjoxNzkzMTk2MDQ2LCJqdGkiOiJkNGZjOGQ4ZC00M2M2LTRmOWMtYTIxOC01N2NhNTIxMmIyMWIiLCJzaWQiOiIxN2FlYThhZS04OTk1LTQ2NzAtOWJiNy00MzczZDM0ZjQyZTQifQ.vTcx_EPot1VS6iKu7DD1aNhDAsMNODs9BBeJNDy7CEA",
  "access_expires_at": "2026-10-28T14:15:46.444826191Z",
  "refresh_token": "MSP5ydyRsLSQyF_Zn9O7n3qzhzfeD5B0Q1HiAL2a4Mo",
  "refresh_expires_at": "2026-11-27T14:00:46.444273967Z",
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
  "device_ref": "sandbox-17984"
}
```

```json
{
  "challenge_id": "abcafe2d-629b-43c4-9314-42a5a2fdeddc",
  "expires_at": "2026-10-28T14:05:46.846410031Z",
  "resend_available_at": "2026-10-28T14:00:47.846410031Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "367688",
  "sent_at": "2026-10-28T14:00:46.848568713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "abcafe2d-629b-43c4-9314-42a5a2fdeddc",
  "code": "367688",
  "device_ref": "sandbox-17984"
}
```

```json
{
  "session_id": "f6401c30-e093-45e5-8686-bd91015108ed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk0NywiaWF0IjoxNzkzMTk2MDQ3LCJqdGkiOiIxMjM1OGNmZi02NWU4LTQ4NjgtOWFmOC0yMDlkNzczYTIzNjgiLCJzaWQiOiJmNjQwMWMzMC1lMDkzLTQ1ZTUtODY4Ni1iZDkxMDE1MTA4ZWQifQ.hMEUzYv8i5ReSt54kgUSQFeKc5QYq0czOZtLzSvgnMQ",
  "access_expires_at": "2026-10-28T14:15:47.054518073Z",
  "refresh_token": "T86nuasOabqIN_7ukF4-I0qRBnarmC48kFUx0SO3lMw",
  "refresh_expires_at": "2026-11-27T14:00:47.054001921Z",
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
  "command_id": "b3ad88b9-42ed-4ed2-914f-6b5e8d1517a1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:47Z",
    "sequence": 1793196047416
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3272d350-4e59-44cf-b5d6-b29d8b93c9de",
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
  "last_heartbeat_at": "2026-10-28T14:00:47.432705Z",
  "last_location_at": "2026-10-28T14:00:47.432705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-4472"
}
```

```json
{
  "challenge_id": "01a59dc0-2e4d-4635-9c28-37e58a2a4169",
  "expires_at": "2026-10-28T14:05:47.622723611Z",
  "resend_available_at": "2026-10-28T14:00:48.622723611Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "792239",
  "sent_at": "2026-10-28T14:00:47.624945989Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "01a59dc0-2e4d-4635-9c28-37e58a2a4169",
  "code": "792239",
  "device_ref": "sandbox-4472"
}
```

```json
{
  "session_id": "312cd98d-92fa-429d-9b79-d79e7f6b88d2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk0NywiaWF0IjoxNzkzMTk2MDQ3LCJqdGkiOiI3YjNiYzNjZS01MTc2LTQyOGEtOGFkNy0xMzQ0NDRiYmUwNDQiLCJzaWQiOiIzMTJjZDk4ZC05MmZhLTQyOWQtOWI3OS1kNzllN2Y2Yjg4ZDIifQ.Fwr9DnnDYE36kq4X8GoZMhIMswPE87bp0aV-zoYGHqw",
  "access_expires_at": "2026-10-28T14:15:47.832755642Z",
  "refresh_token": "hkEMs5LQR1-xFos6mQqWRYtU-39C5skVxwIqcQkxZ2s",
  "refresh_expires_at": "2026-11-27T14:00:47.832321315Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "47f8579a-4a67-4696-827b-cc1a648d4e4b",
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
  "last_heartbeat_at": "2026-10-28T13:59:58.697047Z",
  "last_location_at": "2026-10-28T13:59:58.697047Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/47f8579a-4a67-4696-827b-cc1a648d4e4b/handover` → **200**

```json
{
  "command_id": "5cb233fa-2fed-477d-99d4-b994dceb5030",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "47f8579a-4a67-4696-827b-cc1a648d4e4b",
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
  "last_heartbeat_at": "2026-10-28T13:59:58.697047Z",
  "last_location_at": "2026-10-28T13:59:58.697047Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/47f8579a-4a67-4696-827b-cc1a648d4e4b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:48Z",
    "sequence": 1793196048408
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "47f8579a-4a67-4696-827b-cc1a648d4e4b",
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
  "last_heartbeat_at": "2026-10-28T14:00:48.424826Z",
  "last_location_at": "2026-10-28T14:00:48.424826Z",
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
  "session_id": "06a64135-06e1-4552-a249-43f54cb4e360",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NDgsImlhdCI6MTc5MzE5NjA0OCwianRpIjoiYWY1ZGFlNTAtYTA5ZC00NWFkLWEzMWYtMDkwZmMxYTA1MDU0Iiwic2lkIjoiMDZhNjQxMzUtMDZlMS00NTUyLWEyNDktNDNmNTRjYjRlMzYwIn0.j9-fkiKF6bKMaj-W_kqa-IgdteGPYot8oikuB8ynAVg",
  "access_expires_at": "2026-10-28T14:15:48.844379638Z",
  "refresh_token": "0q40bnnWV-L-p0OwK3b8re7B_OQ_N6hTS7KyomrrJuM",
  "refresh_expires_at": "2026-10-29T02:00:48.843870402Z",
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
  "session_id": "699f5240-2ef9-4988-94a8-07e558a6e76b",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NDksImlhdCI6MTc5MzE5NjA0OSwianRpIjoiYWQ4YzZmMDUtNDBhNi00YzkyLWE5ZmYtYzI2OWZkMGYzYTIxIiwic2lkIjoiNjk5ZjUyNDAtMmVmOS00OTg4LTk0YTgtMDdlNTU4YTZlNzZiIn0.aRQAdQg83C-pkmHJK_btZIDi50U30KlBqIU0tYR2Dhc",
  "access_expires_at": "2026-10-28T14:15:49.267648916Z",
  "refresh_token": "W4anSrj5jnlRUH4TOAl50RsrhuahnxQw4yowPMwizW4",
  "refresh_expires_at": "2026-10-29T02:00:49.26720553Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680305895",
  "device_ref": "sandbox-15191"
}
```

```json
{
  "challenge_id": "99399362-a0b2-424e-b14b-d8e1383c2a9c",
  "expires_at": "2026-10-28T14:05:49.451298641Z",
  "resend_available_at": "2026-10-28T14:00:50.451298641Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380680305895` → **200**

```json
{
  "phone": "+380680305895",
  "audience": "CLIENT",
  "code": "318718",
  "sent_at": "2026-10-28T14:00:49.4532304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "99399362-a0b2-424e-b14b-d8e1383c2a9c",
  "code": "318718",
  "device_ref": "sandbox-15191"
}
```

```json
{
  "session_id": "1a7b1db6-b305-445f-af74-3661779e2c8e",
  "subject": {
    "type": "CLIENT",
    "id": "14ba2917-3a4f-45e1-b03d-331af5333856"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGJhMjkxNy0zYTRmLTQ1ZTEtYjAzZC0zMzFhZjUzMzM4NTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTQ5LCJpYXQiOjE3OTMxOTYwNDksImp0aSI6ImNmMDVmNjk0LWMwOTEtNDJhZC1iYWJiLTcxZjgzMmI2MDlmMSIsInNpZCI6IjFhN2IxZGI2LWIzMDUtNDQ1Zi1hZjc0LTM2NjE3NzllMmM4ZSJ9.yVvU7uNBp10aG2Vw2zWAs_cF105NALaIF_A9DLtLY9I",
  "access_expires_at": "2026-10-28T14:15:49.661447515Z",
  "refresh_token": "e-jKGcFf5rLHys6xDrQU3FEXXLVMXCTGf-uyl_emQEY",
  "refresh_expires_at": "2026-11-27T14:00:49.660825948Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7f566a5b-e51f-4481-96f2-9395451bd1db",
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
  "id": "9aec9249-e1b5-410a-900b-a6eb8167dc9e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:05:49.862210Z",
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
  "command_id": "f4e9bc0b-7b39-40c5-9a63-11dea23a2839",
  "quote_id": "9aec9249-e1b5-410a-900b-a6eb8167dc9e",
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
  "id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14ba2917-3a4f-45e1-b03d-331af5333856",
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
  "created_at": "2026-10-28T14:00:50.065519Z",
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
    "id": "1066f4e6-16fa-4e52-8184-2be25fab95b6",
    "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
    "expires_at": "2026-10-28T14:01:05.069278Z",
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

`POST /api/driver/v1/offers/1066f4e6-16fa-4e52-8184-2be25fab95b6/reject` → **204**

```json
{
  "command_id": "78c0c0bb-fd87-462e-ac57-924f400c81d7"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "52cf59e5-87d9-4e78-9726-828ab7361840",
    "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
    "expires_at": "2026-10-28T14:01:05.473484Z",
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

`POST /api/driver/v1/offers/52cf59e5-87d9-4e78-9726-828ab7361840/accept` → **200**

```json
{
  "command_id": "54ebbc35-78a9-4a0e-8b78-7498426138c5"
}
```

```json
{
  "id": "23e506cd-6f63-4d22-ba51-90b3364a7682",
  "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ffc5ca12-2b44-48b8-aace-efaf100ec62e",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:00:50.066228Z",
      "actor": {
        "type": "CLIENT",
        "id": "14ba2917-3a4f-45e1-b03d-331af5333856",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
        "quote_id": "9aec9249-e1b5-410a-900b-a6eb8167dc9e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "7eaf2e2e-b9b4-4fa5-bdfe-19552a7fa9c3"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:00:50.068471Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
        "attempt_id": "bf7f0353-d929-4c4a-941d-0806eaf8705b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "7eaf2e2e-b9b4-4fa5-bdfe-19552a7fa9c3"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:00:50.073886Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1066f4e6-16fa-4e52-8184-2be25fab95b6",
        "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "7eaf2e2e-b9b4-4fa5-bdfe-19552a7fa9c3"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:00:50.472291Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "1066f4e6-16fa-4e52-8184-2be25fab95b6",
        "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5"
      },
      "correlation_id": "64e62f60-ae33-48d8-81dc-2f7dcf3757a5"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5` → **200**

```json
{
  "id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "14ba2917-3a4f-45e1-b03d-331af5333856",
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
    "id": "23e506cd-6f63-4d22-ba51-90b3364a7682",
    "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ffc5ca12-2b44-48b8-aace-efaf100ec62e",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:00:50.065519Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5/cancel` → **200**

```json
{
  "command_id": "3c3e34f4-1eb1-4749-a276-5aeb7a2a94fa",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "14ba2917-3a4f-45e1-b03d-331af5333856",
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
    "id": "23e506cd-6f63-4d22-ba51-90b3364a7682",
    "order_id": "7a1c853c-c7a5-44f6-a1e0-6df6e49cf3c5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ffc5ca12-2b44-48b8-aace-efaf100ec62e",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:00:50.065519Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
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
  "session_id": "3272d350-4e59-44cf-b5d6-b29d8b93c9de",
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
  "last_heartbeat_at": "2026-10-28T14:00:47.432705Z",
  "last_location_at": "2026-10-28T14:00:47.432705Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3272d350-4e59-44cf-b5d6-b29d8b93c9de/close` → **200**

```json
{
  "command_id": "f57dc06f-552b-460f-b550-f8af67ca0f02",
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
  "session_id": "47f8579a-4a67-4696-827b-cc1a648d4e4b",
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
  "last_heartbeat_at": "2026-10-28T14:00:48.424826Z",
  "last_location_at": "2026-10-28T14:00:48.424826Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/47f8579a-4a67-4696-827b-cc1a648d4e4b/close` → **200**

```json
{
  "command_id": "3e0d577e-b30a-4c07-b92d-e20808795899",
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

**Contract validation failed — scenario stopped.**

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
  "session_id": "e32febe9-c012-46fe-9078-b97021287577",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NTIsImlhdCI6MTc5MzE5NjA1MiwianRpIjoiNmMwN2JlMTktNDE4Yi00ZTYxLWE5NzgtNzYzOGYxOGUyYTRiIiwic2lkIjoiZTMyZmViZTktYzAxMi00NmZlLTkwNzgtYjk3MDIxMjg3NTc3In0._bZE4BnE83CQvvrAU9QxLoi59K47OJQ1WOiyQB6LDnI",
  "access_expires_at": "2026-10-28T14:15:52.827981927Z",
  "refresh_token": "I6glNap7MldBgLGSWCP6TFyvZv4OABa0IvX3p2yJAD8",
  "refresh_expires_at": "2026-10-29T02:00:52.827519892Z",
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
  "command_id": "6797b06e-ab30-48d8-8a8e-b2640d6ed9ba",
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
  "timestamp": "2026-10-28T14:00:53.000+0000",
  "channel": {
    "id": "1730052000.1630821405",
    "linkedid": "1730052000.1630821405",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678107073"
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
  "timestamp": "2026-10-28T14:00:53.000+0000",
  "channel": {
    "id": "1730052000.1630821405",
    "linkedid": "1730052000.1630821405",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678107073"
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
  "session_id": "4f1ee2c8-f503-49ca-8942-20cf1ac0c183",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NTMsImlhdCI6MTc5MzE5NjA1MywianRpIjoiNGI4YjJlMjMtY2JkNy00MWZlLWI2OTAtMzMzMWM3NDdiZTgxIiwic2lkIjoiNGYxZWUyYzgtZjUwMy00OWNhLTg5NDItMjBjZjFhYzBjMTgzIn0.FnRDBUxa-KbVnK1LC_meABBiXrWWVDVJnfmWZ9QhEZs",
  "access_expires_at": "2026-10-28T14:15:53.71740645Z",
  "refresh_token": "M8zZZPk-GP1LYDtk6xWpm1VeJr0aoXjYO1Hq5nLZlDg",
  "refresh_expires_at": "2026-10-29T02:00:53.716872244Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "abd64cf2-cc3e-4c88-b382-b2c9671e7e73",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678107073",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:00:53Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/abd64cf2-cc3e-4c88-b382-b2c9671e7e73/answer` → **200**

```json
{
  "command_id": "ceaf56e0-ebce-48fe-a725-39c3e3800f65"
}
```

```json
{
  "id": "abd64cf2-cc3e-4c88-b382-b2c9671e7e73",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678107073",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
  "order_ids": [],
  "started_at": "2026-10-28T14:00:53Z",
  "answered_at": "2026-10-28T14:00:54.150856Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1630821405",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "8f60ade9-fc8c-49f4-ab40-563307666495",
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
  "id": "d4c09dd0-7932-4aad-8d14-99141af51170",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:05:54.377857Z",
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
  "command_id": "96801ea1-24e0-4b2e-aa40-70002c811550",
  "quote_id": "d4c09dd0-7932-4aad-8d14-99141af51170",
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
    "phone": "+380678107073"
  },
  "call_id": "abd64cf2-cc3e-4c88-b382-b2c9671e7e73"
}
```

```json
{
  "id": "7d2f36c7-2204-41ca-99b9-5a85b9fae222",
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
  "created_at": "2026-10-28T14:00:54.591189Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678107073"
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
    "id": "1730052000.1630821405",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "abd64cf2-cc3e-4c88-b382-b2c9671e7e73",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678107073",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [
        "7d2f36c7-2204-41ca-99b9-5a85b9fae222"
      ],
      "started_at": "2026-10-28T14:00:53Z",
      "answered_at": "2026-10-28T14:00:54.150856Z",
      "ended_at": "2026-10-28T14:00:54.805379Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a33ffa5a-12bf-42ab-b7aa-784940b36d18",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676970904",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [],
      "started_at": "2026-10-28T13:59:45.281327Z",
      "answered_at": "2026-10-28T13:59:45.503376Z",
      "ended_at": "2026-10-28T13:59:45.717272Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T13:59:54.543231Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/7d2f36c7-2204-41ca-99b9-5a85b9fae222` → **200**

```json
{
  "id": "7d2f36c7-2204-41ca-99b9-5a85b9fae222",
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
  "created_at": "2026-10-28T14:00:54.591189Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678107073"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/7d2f36c7-2204-41ca-99b9-5a85b9fae222` → **200**

```json
{
  "id": "7d2f36c7-2204-41ca-99b9-5a85b9fae222",
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
  "created_at": "2026-10-28T14:00:54.591189Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678107073"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7d2f36c7-2204-41ca-99b9-5a85b9fae222/cancel` → **200**

```json
{
  "command_id": "ff3bff60-3726-4650-98fc-704ec208e89a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7d2f36c7-2204-41ca-99b9-5a85b9fae222",
  "short_number": 7,
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
  "created_at": "2026-10-28T14:00:54.591189Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678107073"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call abd64cf2-cc3e-4c88-b382-b2c9671e7e73 with order 7d2f36c7-2204-41ca-99b9-5a85b9fae222.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25256"
}
```

```json
{
  "challenge_id": "f77a8b5a-7771-4e94-aa26-7f62a57c355e",
  "expires_at": "2026-10-28T14:05:55.624622558Z",
  "resend_available_at": "2026-10-28T14:00:56.624622558Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "078021",
  "sent_at": "2026-10-28T14:00:55.626714141Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f77a8b5a-7771-4e94-aa26-7f62a57c355e",
  "code": "078021",
  "device_ref": "sandbox-25256"
}
```

```json
{
  "session_id": "21053a1c-ce0d-4ce1-8758-01d2898d16df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk1NSwiaWF0IjoxNzkzMTk2MDU1LCJqdGkiOiI2ZTY4NWIwNS02ZTZiLTQxNTAtOTI5Yy0wMjFmNTI5ZWUwNjciLCJzaWQiOiIyMTA1M2ExYy1jZTBkLTRjZTEtODc1OC0wMWQyODk4ZDE2ZGYifQ.lvEdcPX-cbrEIczgHJQS39GQRVdLNdtBuHKDxIw7tSM",
  "access_expires_at": "2026-10-28T14:15:55.837992938Z",
  "refresh_token": "me9Ryxc2KrzppjvO0whVAi88z4n84PPCL8lM4IddpLM",
  "refresh_expires_at": "2026-11-27T14:00:55.837465548Z",
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
  "command_id": "ade3eb2b-b7fe-4ddb-858d-26107a26d250",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:56Z",
    "sequence": 1793196056227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:00:56.244072Z",
  "last_location_at": "2026-10-28T14:00:56.244072Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380661541369",
  "device_ref": "sandbox-22791"
}
```

```json
{
  "challenge_id": "a85f3657-c14d-4971-908f-ecb966231df0",
  "expires_at": "2026-10-28T14:05:56.444370735Z",
  "resend_available_at": "2026-10-28T14:00:57.444370735Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380661541369` → **200**

```json
{
  "phone": "+380661541369",
  "audience": "CLIENT",
  "code": "804416",
  "sent_at": "2026-10-28T14:00:56.446613789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a85f3657-c14d-4971-908f-ecb966231df0",
  "code": "804416",
  "device_ref": "sandbox-22791"
}
```

```json
{
  "session_id": "2c0c232d-b297-420b-bd9a-e2838ea6e4a0",
  "subject": {
    "type": "CLIENT",
    "id": "4edb4c83-5663-4b15-b141-0fcda1e0513d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWRiNGM4My01NjYzLTRiMTUtYjE0MS0wZmNkYTFlMDUxM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTU2LCJpYXQiOjE3OTMxOTYwNTYsImp0aSI6IjBhNzA0MDIxLThlZDUtNDA0Ni04ZDIzLTE4ZDEwMWYxMTQ1MSIsInNpZCI6IjJjMGMyMzJkLWIyOTctNDIwYi1iZDlhLWUyODM4ZWE2ZTRhMCJ9.725fICVpGvrONCS_uUjjsvzElIMTdLR5WFR_7LcKPvo",
  "access_expires_at": "2026-10-28T14:15:56.66978776Z",
  "refresh_token": "3nSzIzUKpTEGwfjLXtDnwH_nYQX4PXosUalmva7mC-k",
  "refresh_expires_at": "2026-11-27T14:00:56.669213297Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1092ca26-7e6d-4362-9884-a12a953af69d",
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
  "id": "c88df54c-b555-4fa4-83ad-927df5d39458",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:05:56.885924Z",
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
  "command_id": "1c5b6c99-d64b-44fb-b783-a7292b4c08d4",
  "quote_id": "c88df54c-b555-4fa4-83ad-927df5d39458",
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
  "id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4edb4c83-5663-4b15-b141-0fcda1e0513d",
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
  "created_at": "2026-10-28T14:00:57.093431Z",
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
    "id": "9d4e6a8d-3725-4016-b7ab-30ea442cd668",
    "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
    "expires_at": "2026-10-28T14:01:12.095509Z",
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

`POST /api/driver/v1/offers/9d4e6a8d-3725-4016-b7ab-30ea442cd668/accept` → **200**

```json
{
  "command_id": "e47b05ed-8b87-4f7f-b773-20d0aa8651cc"
}
```

```json
{
  "id": "816be695-f0d9-4d6a-b93d-bd220652502c",
  "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "04c7caa3-2ccf-484d-98fb-430fa952bb47",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "04c7caa3-2ccf-484d-98fb-430fa952bb47",
  "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
  "assignment_id": "816be695-f0d9-4d6a-b93d-bd220652502c",
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

`POST /api/driver/v1/work-sessions/25fcaa0f-fcba-498f-82be-51246d85bb29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:57Z",
    "sequence": 1793196057853
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:00:57.869899Z",
  "last_location_at": "2026-10-28T14:00:57.869899Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/04c7caa3-2ccf-484d-98fb-430fa952bb47/arrive` → **200**

```json
{
  "command_id": "a2ae8118-2875-41ff-a06f-27fbf159c094",
  "expected_version": 0
}
```

```json
{
  "id": "04c7caa3-2ccf-484d-98fb-430fa952bb47",
  "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
  "assignment_id": "816be695-f0d9-4d6a-b93d-bd220652502c",
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
  "arrived_at": "2026-10-28T14:00:58.074496Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/04c7caa3-2ccf-484d-98fb-430fa952bb47/start` → **200**

```json
{
  "command_id": "00894736-04dc-4adb-aab7-8473d8c250da",
  "expected_version": 1
}
```

```json
{
  "id": "04c7caa3-2ccf-484d-98fb-430fa952bb47",
  "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
  "assignment_id": "816be695-f0d9-4d6a-b93d-bd220652502c",
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
  "arrived_at": "2026-10-28T14:00:58.074496Z",
  "started_at": "2026-10-28T14:00:58.281893Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/25fcaa0f-fcba-498f-82be-51246d85bb29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:58Z",
    "sequence": 1793196058468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:00:58.485465Z",
  "last_location_at": "2026-10-28T14:00:58.485465Z",
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
  "device_ref": "sandbox-5186"
}
```

```json
{
  "challenge_id": "8410baad-bcd7-4f08-a0c2-24c6dcb2c486",
  "expires_at": "2026-10-28T14:05:58.672602678Z",
  "resend_available_at": "2026-10-28T14:00:59.672602678Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "850990",
  "sent_at": "2026-10-28T14:00:58.675121922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8410baad-bcd7-4f08-a0c2-24c6dcb2c486",
  "code": "850990",
  "device_ref": "sandbox-5186"
}
```

```json
{
  "session_id": "b90e5093-d927-415a-86c0-d5369d84eed2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk1OCwiaWF0IjoxNzkzMTk2MDU4LCJqdGkiOiJhYWYxNzE2Zi05MDRkLTRjZTktOGI4NS04YjdmZDBjZTM0YzEiLCJzaWQiOiJiOTBlNTA5My1kOTI3LTQxNWEtODZjMC1kNTM2OWQ4NGVlZDIifQ.My3uNVlDBvZAIs10tkD0fmd1yqTGnB3GGJzK_QKRpHo",
  "access_expires_at": "2026-10-28T14:15:58.902792244Z",
  "refresh_token": "sfhNcVDYYHD6nLIGytM1p_TMOpcqMQo6CiCyiPzpLHk",
  "refresh_expires_at": "2026-11-27T14:00:58.902309578Z",
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
  "command_id": "dd5f15c5-fb7c-462c-9471-cc9c81f80221",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:00:59Z",
    "sequence": 1793196059303
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:00:59.319689Z",
  "last_location_at": "2026-10-28T14:00:59.319689Z",
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
  "session_id": "049aaace-30ea-4216-ab08-329a8f8b8c18",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NTksImlhdCI6MTc5MzE5NjA1OSwianRpIjoiNTI3MWNlM2ItOTBkZC00MWM5LTlmM2MtNmFlYjMyZGM1Y2U5Iiwic2lkIjoiMDQ5YWFhY2UtMzBlYS00MjE2LWFiMDgtMzI5YThmOGI4YzE4In0.n-B3oyGZvKnmQlvYMJ6uv2dibvuMaqxaitPALHeiwGI",
  "access_expires_at": "2026-10-28T14:15:59.769851572Z",
  "refresh_token": "8Ke2mnFOTnhDrL0-SQdm7ZDLxeuG2IpGbNkfvTwnY0Y",
  "refresh_expires_at": "2026-10-29T02:00:59.76934068Z",
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
  "session_id": "ca0cfa5b-08f6-4b7f-92a0-7c568055331c",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NjAsImlhdCI6MTc5MzE5NjA2MCwianRpIjoiZTQ3MTNkM2YtZDU0OC00MTY5LWEyOGMtMzA2NTQ5MzhhNzRhIiwic2lkIjoiY2EwY2ZhNWItMDhmNi00YjdmLTkyYTAtN2M1NjgwNTUzMzFjIn0.j8OFKQe_CWKTb-uP-fuF08ah-s89Zh46Y79ZQvMP7a4",
  "access_expires_at": "2026-10-28T14:16:00.209920634Z",
  "refresh_token": "LDSPDTia1SFF_wyCu0lLpA92NeNnInHylmaJ0FMyAIQ",
  "refresh_expires_at": "2026-10-29T02:01:00.209561106Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/885617ee-3a16-4122-8a07-9b59bbd0973a` → **200**

```json
{
  "id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
  "short_number": 8,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "4edb4c83-5663-4b15-b141-0fcda1e0513d",
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
    "id": "816be695-f0d9-4d6a-b93d-bd220652502c",
    "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "04c7caa3-2ccf-484d-98fb-430fa952bb47",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:00:57.093431Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/885617ee-3a16-4122-8a07-9b59bbd0973a/interrupt` → **200**

```json
{
  "command_id": "1f9b5f9b-bae8-4d4f-b520-7d18d16fe171",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
    "short_number": 8,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "4edb4c83-5663-4b15-b141-0fcda1e0513d",
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
      "id": "816be695-f0d9-4d6a-b93d-bd220652502c",
      "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "04c7caa3-2ccf-484d-98fb-430fa952bb47",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:00:57.093431Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
    "short_number": 9,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "4edb4c83-5663-4b15-b141-0fcda1e0513d",
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
    "id": "00d065fc-0228-4f1b-a1f6-40c47e62c7ad",
    "order_id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
    "expires_at": "2026-10-28T14:01:15.632882Z",
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

`POST /api/driver/v1/offers/00d065fc-0228-4f1b-a1f6-40c47e62c7ad/accept` → **200**

```json
{
  "command_id": "96a70d24-5272-45ce-b0bc-5953760670bb"
}
```

```json
{
  "id": "bfeb44de-d37d-41c3-8f88-1c3f0de559aa",
  "order_id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e",
  "order_id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
  "assignment_id": "bfeb44de-d37d-41c3-8f88-1c3f0de559aa",
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
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:00:59.319689Z",
  "last_location_at": "2026-10-28T14:00:59.319689Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:01Z",
    "sequence": 1793196061620
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:01:01.638923Z",
  "last_location_at": "2026-10-28T14:01:01.638923Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e/arrive` → **200**

```json
{
  "command_id": "335df926-79e9-4bd1-a721-71a29d09b703",
  "expected_version": 0
}
```

```json
{
  "id": "0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e",
  "order_id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
  "assignment_id": "bfeb44de-d37d-41c3-8f88-1c3f0de559aa",
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
  "arrived_at": "2026-10-28T14:01:01.833084Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e/start` → **200**

```json
{
  "command_id": "20e6466e-c6a3-4ea1-a477-3cc5e31acaa4",
  "expected_version": 1
}
```

```json
{
  "id": "0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e",
  "order_id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
  "assignment_id": "bfeb44de-d37d-41c3-8f88-1c3f0de559aa",
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
  "arrived_at": "2026-10-28T14:01:01.833084Z",
  "started_at": "2026-10-28T14:01:02.037472Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e/complete` → **200**

```json
{
  "command_id": "15ccc518-1470-4c5b-9674-6f07fb861b0f",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:01:02Z"
}
```

```json
{
  "id": "0e7f61a1-8b71-4a78-aacf-1a6f4fca6a5e",
  "order_id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
  "assignment_id": "bfeb44de-d37d-41c3-8f88-1c3f0de559aa",
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
  "arrived_at": "2026-10-28T14:01:01.833084Z",
  "started_at": "2026-10-28T14:01:02.037472Z",
  "completed_at": "2026-10-28T14:01:02.242985Z",
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
    "id": "d19d9661-69fe-4757-93ec-73471d88c3ac",
    "short_number": 9,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:01:00.622849Z",
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
    "id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
    "short_number": 8,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:00:57.093431Z",
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
        "en": "Vehicle broke down on the way",
        "ru": "Поломка автомобиля в пути",
        "pl": "Awaria auta w trasie",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/885617ee-3a16-4122-8a07-9b59bbd0973a/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:00:57.0938Z",
      "actor": {
        "type": "CLIENT",
        "id": "4edb4c83-5663-4b15-b141-0fcda1e0513d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
        "quote_id": "c88df54c-b555-4fa4-83ad-927df5d39458",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "cdd2a513-7e68-4683-bf19-17a545a28635"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:00:57.095018Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
        "attempt_id": "ce6cdadb-e52b-410c-a196-7e1651e23de7",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "cdd2a513-7e68-4683-bf19-17a545a28635"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:00:57.097531Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "9d4e6a8d-3725-4016-b7ab-30ea442cd668",
        "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "cdd2a513-7e68-4683-bf19-17a545a28635"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:00:57.487382Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "9d4e6a8d-3725-4016-b7ab-30ea442cd668",
        "order_id": "885617ee-3a16-4122-8a07-9b59bbd0973a",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "816be695-f0d9-4d6a-b93d-bd220652502c"
      },
      "correlation_id": "30b1399b-d78c-49e1-89bf-367421fa8c29"
```

Done: interrupted 885617ee-3a16-4122-8a07-9b59bbd0973a, follow-up d19d9661-69fe-4757-93ec-73471d88c3ac.

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
  "session_id": "c8074bd7-9dd8-4be5-8f19-8b26879cfc17",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NjYsImlhdCI6MTc5MzE5NjA2NiwianRpIjoiZmY1Y2FiMTYtYmQ0Ni00OGMzLWFmODItOWQ3MmViYzYxNjY4Iiwic2lkIjoiYzgwNzRiZDctOWRkOC00YmU1LThmMTktOGIyNjg3OWNmYzE3In0.dG3u1bYTobFk7FYbXmjPlrrjwT1vL6l_A0xEokM7feY",
  "access_expires_at": "2026-10-28T14:16:06.281354287Z",
  "refresh_token": "grKyew6yyAxQshYIlUkit1QR1YJjZhcrF0NlyTgx4v8",
  "refresh_expires_at": "2026-10-29T02:01:06.280744538Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "c4943e8a-4ff3-4c96-af91-5c3c4ff661ee",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:01:06Z"
}
```

```json
{
  "id": "35058876-4600-41af-ab9d-3329bcdfa083",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:01:06Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/35058876-4600-41af-ab9d-3329bcdfa083/publish` → **200**

```json
{
  "command_id": "ea6306c9-9d38-4c35-88bf-be555a358aaf",
  "expected_version": 0
}
```

```json
{
  "id": "35058876-4600-41af-ab9d-3329bcdfa083",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:01:06.688394Z",
  "published_at": "2026-10-28T14:01:06.688394Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "35058876-4600-41af-ab9d-3329bcdfa083",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:01:06.688394Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635435416",
  "device_ref": "sandbox-25661"
}
```

```json
{
  "challenge_id": "3c9f2c6c-e5cf-4b9e-8f5c-bcdc9fae4629",
  "expires_at": "2026-10-28T14:06:07.067781276Z",
  "resend_available_at": "2026-10-28T14:01:08.067781276Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635435416` → **200**

```json
{
  "phone": "+380635435416",
  "audience": "CLIENT",
  "code": "525103",
  "sent_at": "2026-10-28T14:01:07.070100223Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c9f2c6c-e5cf-4b9e-8f5c-bcdc9fae4629",
  "code": "525103",
  "device_ref": "sandbox-25661"
}
```

```json
{
  "session_id": "1dd046da-de0c-4a9a-b237-5df39ea062cd",
  "subject": {
    "type": "CLIENT",
    "id": "32fe5316-a62c-4bde-8600-8d3c704b6839"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMmZlNTMxNi1hNjJjLTRiZGUtODYwMC04ZDNjNzA0YjY4MzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTY3LCJpYXQiOjE3OTMxOTYwNjcsImp0aSI6ImNjZGIxZDMzLWJkNTQtNDRjNC05ODU0LWYzODQzNzg5ZjJhZSIsInNpZCI6IjFkZDA0NmRhLWRlMGMtNGE5YS1iMjM3LTVkZjM5ZWEwNjJjZCJ9.DcJfI0cLApUlhxBL-DH3Y9dAAPUytRK5j9rHn9xXYMY",
  "access_expires_at": "2026-10-28T14:16:07.273578165Z",
  "refresh_token": "bGNKs5LqpDJJ2hBk7KT45qJ9MgwaYjommn20pswKWi4",
  "refresh_expires_at": "2026-11-27T14:01:07.273063807Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "35058876-4600-41af-ab9d-3329bcdfa083",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:01:06.688394Z",
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
  "command_id": "69b0b76c-0fc7-4286-bcb3-307a026dbbc7",
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
  "id": "2eaea65d-eba7-468e-afb3-cccafe200cdf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:07.666623Z",
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
  "command_id": "cdeb3441-f6cb-409d-9cc9-4d43a90b5385",
  "quote_id": "2eaea65d-eba7-468e-afb3-cccafe200cdf",
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
  "correlation_id": "52c742ad-5b4c-438e-ba54-ea1726caa3da"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "df6403b0-a12c-4caa-8cdc-164ba88fd857",
  "version_id": "35058876-4600-41af-ab9d-3329bcdfa083",
  "language": "uk"
}
```

```json
{
  "version_id": "35058876-4600-41af-ab9d-3329bcdfa083",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:01:08.064747Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b2a8c313-23bd-4345-9f37-617fdc34fcc8",
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
  "id": "a3dd120d-d549-499f-931b-e5a30bb79dc5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:08.271797Z",
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
  "command_id": "272d8ecf-b90a-4382-9e3b-40f81c35686c",
  "quote_id": "a3dd120d-d549-499f-931b-e5a30bb79dc5",
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
  "id": "64bc481c-0047-4d89-9e7f-eac1e69c3ee3",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32fe5316-a62c-4bde-8600-8d3c704b6839",
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
  "created_at": "2026-10-28T14:01:08.496149Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/64bc481c-0047-4d89-9e7f-eac1e69c3ee3` → **200**

```json
{
  "id": "64bc481c-0047-4d89-9e7f-eac1e69c3ee3",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "32fe5316-a62c-4bde-8600-8d3c704b6839",
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
  "created_at": "2026-10-28T14:01:08.496149Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/64bc481c-0047-4d89-9e7f-eac1e69c3ee3/cancel` → **200**

```json
{
  "command_id": "a7c2fadb-c05e-47d6-a9d1-a86e551ca526",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "64bc481c-0047-4d89-9e7f-eac1e69c3ee3",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "32fe5316-a62c-4bde-8600-8d3c704b6839",
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
  "created_at": "2026-10-28T14:01:08.496149Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
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

`POST /api/admin/v1/legal-documents/35058876-4600-41af-ab9d-3329bcdfa083` → **409**

```json
{
  "command_id": "e8538c84-8fec-41f2-ae94-41c199fd89f7",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:01:09Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/35058876-4600-41af-ab9d-3329bcdfa083",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "fe393f5a-9439-4602-9d2a-eb89d7d0c879"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "ad048d4a-615e-4b3d-864f-f6cb2c1e9cd9",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:01:09Z"
}
```

```json
{
  "id": "bdd55cfa-b68a-49e9-b4ea-a6e1e558244a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:01:09Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/bdd55cfa-b68a-49e9-b4ea-a6e1e558244a/publish` → **200**

```json
{
  "command_id": "4008dc58-f2a3-4018-9b93-614ccfdf5289",
  "expected_version": 0
}
```

```json
{
  "id": "bdd55cfa-b68a-49e9-b4ea-a6e1e558244a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:01:09.511988Z",
  "published_at": "2026-10-28T14:01:09.511988Z",
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
  "device_ref": "sandbox-18765"
}
```

```json
{
  "challenge_id": "c65de9a5-a8be-4501-83dc-cc76d404de01",
  "expires_at": "2026-10-28T14:06:09.711993613Z",
  "resend_available_at": "2026-10-28T14:01:10.711993613Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "095614",
  "sent_at": "2026-10-28T14:01:09.714049514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c65de9a5-a8be-4501-83dc-cc76d404de01",
  "code": "095614",
  "device_ref": "sandbox-18765"
}
```

```json
{
  "session_id": "4ee6431f-ef17-41a9-8168-88ef4e29d447",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk2OSwiaWF0IjoxNzkzMTk2MDY5LCJqdGkiOiIxOGNkYzA5My0yNzZlLTQ1YWMtYjI0Ni1jYmQyMTQ0NGUwMzYiLCJzaWQiOiI0ZWU2NDMxZi1lZjE3LTQxYTktODE2OC04OGVmNGUyOWQ0NDcifQ.JOYMCI7B-c-lv2vT3PrNIwgOMwYezOJGSMy5gkLN4cs",
  "access_expires_at": "2026-10-28T14:16:09.91961791Z",
  "refresh_token": "xTVooJhMelePMos4HQfGWF8nv1Bdkzp5ELhFXpCTlwg",
  "refresh_expires_at": "2026-11-27T14:01:09.919235383Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:01:01.638923Z",
  "last_location_at": "2026-10-28T14:01:01.638923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81/handover` → **200**

```json
{
  "command_id": "2ab74c02-3dc3-4013-a3bb-b9fb3da46e58",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:01:01.638923Z",
  "last_location_at": "2026-10-28T14:01:01.638923Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:10Z",
    "sequence": 1793196070487
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:01:10.503355Z",
  "last_location_at": "2026-10-28T14:01:10.503355Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674778647",
  "device_ref": "sandbox-9988"
}
```

```json
{
  "challenge_id": "9beebf74-aeed-466a-948f-9a26327d7270",
  "expires_at": "2026-10-28T14:06:10.69388797Z",
  "resend_available_at": "2026-10-28T14:01:11.69388797Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674778647` → **200**

```json
{
  "phone": "+380674778647",
  "audience": "CLIENT",
  "code": "447839",
  "sent_at": "2026-10-28T14:01:10.696211612Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9beebf74-aeed-466a-948f-9a26327d7270",
  "code": "447839",
  "device_ref": "sandbox-9988"
}
```

```json
{
  "session_id": "231d80b8-20a6-4678-83b8-e3963c685d7b",
  "subject": {
    "type": "CLIENT",
    "id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNTQwYzM5ZC1iZTRiLTQ5ZjktOGE4NS1iYjUxZWJlNGQ4YzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTcwLCJpYXQiOjE3OTMxOTYwNzAsImp0aSI6IjZmZGZjZDViLTcyYmItNGNlMS05M2UwLWFmODMxNTk1MGNhMyIsInNpZCI6IjIzMWQ4MGI4LTIwYTYtNDY3OC04M2I4LWUzOTYzYzY4NWQ3YiJ9.QNywfAI5Y3s-rwueleS_BBvZsD0Dka2quiv2XVL42xo",
  "access_expires_at": "2026-10-28T14:16:10.9011144Z",
  "refresh_token": "zNNE8Go_Jb6KYnP4LmceH5XNofiI6MeVpdBOQ5BUs0w",
  "refresh_expires_at": "2026-11-27T14:01:10.900756565Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "40760b4e-10cd-40c7-a03b-543d89df4a0a",
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
  "id": "e1093963-90d3-4916-a0b2-1c51b285df82",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:11.098172Z",
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
  "command_id": "e4476e89-a33b-4f2d-bc2f-0240ed9f0eca",
  "quote_id": "e1093963-90d3-4916-a0b2-1c51b285df82",
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
    "phone": "+380674010349"
  }
}
```

```json
{
  "id": "d67429f5-6a39-4d63-8bcf-15374377e540",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:11.296437Z",
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
    "id": "64428b09-e710-47ea-8335-c3f82a6d5ccd",
    "order_id": "d67429f5-6a39-4d63-8bcf-15374377e540",
    "expires_at": "2026-10-28T14:01:26.299207Z",
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

`POST /api/driver/v1/offers/64428b09-e710-47ea-8335-c3f82a6d5ccd/accept` → **200**

```json
{
  "command_id": "40d8da4a-e5cc-4599-abb6-511f6c863069"
}
```

```json
{
  "id": "e20d10a5-0260-45a3-883b-727586bb576e",
  "order_id": "d67429f5-6a39-4d63-8bcf-15374377e540",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2d9f6145-8e3b-4521-a711-a9b3c4815cb4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2d9f6145-8e3b-4521-a711-a9b3c4815cb4",
  "order_id": "d67429f5-6a39-4d63-8bcf-15374377e540",
  "assignment_id": "e20d10a5-0260-45a3-883b-727586bb576e",
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
    "phone": "+380674010349"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e087727b-86e3-4e0f-ac89-e037950beb2b",
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
  "id": "e69041a7-f027-46a3-98fb-66efeca75dff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:12.078612Z",
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
  "command_id": "6625320f-9250-4c90-b220-fa3dbaa61b05",
  "quote_id": "e69041a7-f027-46a3-98fb-66efeca75dff",
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
  "id": "229225ba-0b5e-4542-a533-b39b1639f487",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.274393Z",
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
  "command_id": "8275f928-a60f-46a4-b3ef-295bc755a684",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:01:12Z"
}
```

```json
{
  "id": "2689f3c1-6cb6-45b4-afc7-f0625a428b33",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:12.488143Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:01:12Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "6d93caa7-7fbd-47bd-b59f-7edd8eaa505a",
  "quote_id": "2689f3c1-6cb6-45b4-afc7-f0625a428b33",
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
  "pickup_at": "2026-10-28T17:01:12Z"
}
```

```json
{
  "id": "adc73588-64a6-48e0-9a41-3e546728b7b9",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.691001Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:01:12Z",
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
  "command_id": "8ce5bdc9-835c-479f-a6e5-1b0b5bff371e",
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
  "id": "cd34d57f-519b-4157-b56f-6813c4476df0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:12.897946Z",
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
  "command_id": "75c4bf38-487b-443d-af22-e33880f86914",
  "quote_id": "cd34d57f-519b-4157-b56f-6813c4476df0",
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
  "correlation_id": "557302b7-d033-4f0f-afa1-07bf7c1cb2bd"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "adc73588-64a6-48e0-9a41-3e546728b7b9",
      "short_number": 13,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
      "created_at": "2026-10-28T14:01:12.691001Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:01:12Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "229225ba-0b5e-4542-a533-b39b1639f487",
      "short_number": 12,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
      "created_at": "2026-10-28T14:01:12.274393Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "d67429f5-6a39-4d63-8bcf-15374377e540",
      "short_number": 11,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "229225ba-0b5e-4542-a533-b39b1639f487",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.274393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/d67429f5-6a39-4d63-8bcf-15374377e540` → **200**

```json
{
  "id": "d67429f5-6a39-4d63-8bcf-15374377e540",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
    "id": "e20d10a5-0260-45a3-883b-727586bb576e",
    "order_id": "d67429f5-6a39-4d63-8bcf-15374377e540",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "2d9f6145-8e3b-4521-a711-a9b3c4815cb4",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:01:11.296437Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/d67429f5-6a39-4d63-8bcf-15374377e540/cancel` → **200**

```json
{
  "command_id": "4f02213a-50fe-4be0-bc75-010f73282394",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d67429f5-6a39-4d63-8bcf-15374377e540",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
    "id": "e20d10a5-0260-45a3-883b-727586bb576e",
    "order_id": "d67429f5-6a39-4d63-8bcf-15374377e540",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "2d9f6145-8e3b-4521-a711-a9b3c4815cb4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:01:11.296437Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/229225ba-0b5e-4542-a533-b39b1639f487` → **200**

```json
{
  "id": "229225ba-0b5e-4542-a533-b39b1639f487",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.274393Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/229225ba-0b5e-4542-a533-b39b1639f487/cancel` → **200**

```json
{
  "command_id": "e89bdb29-5fa2-4510-99a4-ba01315acd54",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "229225ba-0b5e-4542-a533-b39b1639f487",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.274393Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/adc73588-64a6-48e0-9a41-3e546728b7b9` → **200**

```json
{
  "id": "adc73588-64a6-48e0-9a41-3e546728b7b9",
  "short_number": 13,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.691001Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:01:12Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/adc73588-64a6-48e0-9a41-3e546728b7b9/cancel` → **200**

```json
{
  "command_id": "a2e6568f-fbd6-43c1-af6c-fc4983271bd8",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "adc73588-64a6-48e0-9a41-3e546728b7b9",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f540c39d-be4b-49f9-8a85-bb51ebe4d8c7",
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
  "created_at": "2026-10-28T14:01:12.691001Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "en": "Changed my mind",
      "ru": "Передумал ехать",
      "pl": "Zmiana planów",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-28T17:01:12Z",
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
  "session_id": "8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81",
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
  "last_heartbeat_at": "2026-10-28T14:01:10.503355Z",
  "last_location_at": "2026-10-28T14:01:10.503355Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8d819e2f-5578-4e8c-a5eb-7b58c3e2ca81/close` → **200**

```json
{
  "command_id": "5aacb9d8-94d7-49fb-9f7e-afb1217f4232",
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

Done: orders d67429f5-6a39-4d63-8bcf-15374377e540, 229225ba-0b5e-4542-a533-b39b1639f487, adc73588-64a6-48e0-9a41-3e546728b7b9.

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
  "session_id": "20492748-eaab-4c35-a82a-4b6163392642",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NzUsImlhdCI6MTc5MzE5NjA3NSwianRpIjoiNjhmNDg0OGYtY2JmYy00NjFiLWI0ZTQtNWQyNDIzMjE2YmNhIiwic2lkIjoiMjA0OTI3NDgtZWFhYi00YzM1LWE4MmEtNGI2MTYzMzkyNjQyIn0.7OmPkmD22qTjwjyEBNYsI23vlK437iuKmSOUqpjySUg",
  "access_expires_at": "2026-10-28T14:16:15.54444215Z",
  "refresh_token": "u7_dHLUW_tbdm8Mm8m_9Ijv-sP3eX-T5CNXpiX88ggo",
  "refresh_expires_at": "2026-10-29T02:01:15.544058954Z",
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
  "session_id": "d585e54a-dc00-486b-aee8-78424ba04bf6",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5NzUsImlhdCI6MTc5MzE5NjA3NSwianRpIjoiMjU5NDRhYjYtYTY1Yy00MGQyLTlhMDUtNzEzY2U4OWJjMDc3Iiwic2lkIjoiZDU4NWU1NGEtZGMwMC00ODZiLWFlZTgtNzg0MjRiYTA0YmY2In0.EBDlrCsS_MFDRplid2nv-1swP8o_3CgUYdCn45et8dE",
  "access_expires_at": "2026-10-28T14:16:15.969228979Z",
  "refresh_token": "jkxSRyXBsXjbr2_ISsCgqEhcsHDpPNzXPa87XK14tU4",
  "refresh_expires_at": "2026-10-29T02:01:15.968833204Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22256"
}
```

```json
{
  "challenge_id": "f7e624c0-f768-4f09-b650-7f579b519982",
  "expires_at": "2026-10-28T14:06:16.156801002Z",
  "resend_available_at": "2026-10-28T14:01:17.156801002Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "861347",
  "sent_at": "2026-10-28T14:01:16.15913304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f7e624c0-f768-4f09-b650-7f579b519982",
  "code": "861347",
  "device_ref": "sandbox-22256"
}
```

```json
{
  "session_id": "f32cf297-4baa-4a01-9b81-8bafb6e9adf2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5Njk3NiwiaWF0IjoxNzkzMTk2MDc2LCJqdGkiOiJkNTFhYzhlNy0zMTAyLTQyZDYtYjdmMi00NTVlMTVkNjhkNGMiLCJzaWQiOiJmMzJjZjI5Ny00YmFhLTRhMDEtOWI4MS04YmFmYjZlOWFkZjIifQ.AbyYhC-K_74tc-sXYzvrpYStm_1TbLRANMAkuy0ivig",
  "access_expires_at": "2026-10-28T14:16:16.371308586Z",
  "refresh_token": "ngW2KgV3TPxGjqi6c5zFLErc0Hd8UEZcognbsnf6iMU",
  "refresh_expires_at": "2026-11-27T14:01:16.370821065Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:00:58.485465Z",
  "last_location_at": "2026-10-28T14:00:58.485465Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/25fcaa0f-fcba-498f-82be-51246d85bb29/handover` → **200**

```json
{
  "command_id": "c3b49643-ab9b-4890-b2b0-35ebb8c5d28e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:00:58.485465Z",
  "last_location_at": "2026-10-28T14:00:58.485465Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/25fcaa0f-fcba-498f-82be-51246d85bb29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:16Z",
    "sequence": 1793196076927
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:01:16.944149Z",
  "last_location_at": "2026-10-28T14:01:16.944149Z",
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
  "command_id": "62e3359a-9d02-47db-99c1-7f92bcaaa5b9",
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
  "effective_at": "2026-10-28T14:01:17.327999Z",
  "changed_by": "082b7a54-1900-46de-b027-a59df7363721",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "082b7a54-1900-46de-b027-a59df7363721",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:01:17.527098009Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0993e22d-0d8f-475d-a203-dece729685eb",
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
  "id": "8b2aa15d-0117-4229-808b-5e8443e76615",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:17.742183Z",
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
  "command_id": "b9b5acf0-f133-4c75-8667-4dc1c0d1bf6b",
  "quote_id": "8b2aa15d-0117-4229-808b-5e8443e76615",
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
    "phone": "+380671115890"
  }
}
```

```json
{
  "id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
  "short_number": 14,
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
  "created_at": "2026-10-28T14:01:17.943192Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671115890"
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
    "id": "bddb341a-b56d-447b-a41e-f1ef5100ed79",
    "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
    "expires_at": "2026-10-28T14:01:32.946846Z",
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

`POST /api/driver/v1/offers/bddb341a-b56d-447b-a41e-f1ef5100ed79/accept` → **200**

```json
{
  "command_id": "33bb7a84-995b-434e-9066-9d160bad211f"
}
```

```json
{
  "id": "bec9d656-755a-4326-bf93-8ddf15e62506",
  "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5144c703-e158-4948-8f88-0028ad3a045a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5144c703-e158-4948-8f88-0028ad3a045a",
  "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
  "assignment_id": "bec9d656-755a-4326-bf93-8ddf15e62506",
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
    "phone": "+380671115890"
  }
}
```

`POST /api/driver/v1/work-sessions/25fcaa0f-fcba-498f-82be-51246d85bb29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:18Z",
    "sequence": 1793196078710
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:01:18.72726Z",
  "last_location_at": "2026-10-28T14:01:18.72726Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5144c703-e158-4948-8f88-0028ad3a045a/arrive` → **200**

```json
{
  "command_id": "823efb47-5f7e-46c2-9a5a-0174a6ee2bcb",
  "expected_version": 0
}
```

```json
{
  "id": "5144c703-e158-4948-8f88-0028ad3a045a",
  "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
  "assignment_id": "bec9d656-755a-4326-bf93-8ddf15e62506",
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
  "arrived_at": "2026-10-28T14:01:18.924526Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115890"
  }
}
```

`POST /api/driver/v1/trips/5144c703-e158-4948-8f88-0028ad3a045a/start` → **200**

```json
{
  "command_id": "9162438c-0c42-4877-b418-196ced9923fd",
  "expected_version": 1
}
```

```json
{
  "id": "5144c703-e158-4948-8f88-0028ad3a045a",
  "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
  "assignment_id": "bec9d656-755a-4326-bf93-8ddf15e62506",
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
  "arrived_at": "2026-10-28T14:01:18.924526Z",
  "started_at": "2026-10-28T14:01:19.127416Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671115890"
  }
}
```

`POST /api/driver/v1/trips/5144c703-e158-4948-8f88-0028ad3a045a/complete` → **200**

```json
{
  "command_id": "3a87d347-7846-4c4c-990f-db1d279a0212",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:01:19Z",
  "cash_received": true
}
```

```json
{
  "id": "5144c703-e158-4948-8f88-0028ad3a045a",
  "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
  "assignment_id": "bec9d656-755a-4326-bf93-8ddf15e62506",
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
  "arrived_at": "2026-10-28T14:01:18.924526Z",
  "started_at": "2026-10-28T14:01:19.127416Z",
  "completed_at": "2026-10-28T14:01:19.332169Z",
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
  "command_id": "b0680c78-6ffb-418d-b36a-02ad68d52afc",
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
  "id": "19c48727-80b8-4f2a-aab6-d5f0511fe948",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:19.538538Z",
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
  "command_id": "235758bc-ba9c-416f-92ac-394c63f090ab",
  "quote_id": "19c48727-80b8-4f2a-aab6-d5f0511fe948",
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
    "phone": "+3806711123135"
  }
}
```

```json
{
  "id": "095d344a-3199-4212-bf7b-d9723ecddce5",
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
  "created_at": "2026-10-28T14:01:19.740516Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123135"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/095d344a-3199-4212-bf7b-d9723ecddce5` → **200**

```json
{
  "id": "095d344a-3199-4212-bf7b-d9723ecddce5",
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
  "created_at": "2026-10-28T14:01:19.740516Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123135"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/095d344a-3199-4212-bf7b-d9723ecddce5/cancel` → **200**

```json
{
  "command_id": "72259841-e2f1-4a76-8128-5a4b5eda2483",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "095d344a-3199-4212-bf7b-d9723ecddce5",
  "short_number": 15,
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
  "created_at": "2026-10-28T14:01:19.740516Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123135"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "en": "Operator error",
      "ru": "Ошибка оператора",
      "pl": "Błąd operatora",
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
  "staff_id": "082b7a54-1900-46de-b027-a59df7363721",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:01:19.336583Z",
  "last_entries": [
    {
      "order_id": "095d344a-3199-4212-bf7b-d9723ecddce5",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:01:20.146489Z"
    },
    {
      "order_id": "3685a59c-d1d4-4cd2-82d1-dffbc5c76348",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:01:19.336583Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "25fcaa0f-fcba-498f-82be-51246d85bb29",
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
  "last_heartbeat_at": "2026-10-28T14:01:18.72726Z",
  "last_location_at": "2026-10-28T14:01:18.72726Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/25fcaa0f-fcba-498f-82be-51246d85bb29/close` → **200**

```json
{
  "command_id": "b9be642f-04f8-4032-b524-b8cd2dd8bb22",
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

Done: operator bonus for fulfilled 3685a59c-d1d4-4cd2-82d1-dffbc5c76348 and operator-fault cancellation 095d344a-3199-4212-bf7b-d9723ecddce5.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676557225",
  "device_ref": "sandbox-19021"
}
```

```json
{
  "challenge_id": "7489f791-a6c2-4087-9c49-6192d67fa5ac",
  "expires_at": "2026-10-28T14:06:22.977815925Z",
  "resend_available_at": "2026-10-28T14:01:23.977815925Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676557225` → **200**

```json
{
  "phone": "+380676557225",
  "audience": "CLIENT",
  "code": "489135",
  "sent_at": "2026-10-28T14:01:22.980462177Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676517861",
  "device_ref": "sandbox-10534",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "45ff2c7e-039b-4dac-bb72-05f63b31ad48",
  "expires_at": "2026-10-28T14:06:23.219624423Z",
  "resend_available_at": "2026-10-28T14:01:24.219624423Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380676517861` → **200**

```json
{
  "phone": "+380676517861",
  "audience": "CLIENT",
  "code": "170424",
  "sent_at": "2026-10-28T14:01:23.221657906Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677210000",
  "device_ref": "sandbox-3378"
}
```

```json
{
  "challenge_id": "fb4b42b3-5753-4dd5-8a50-e062cf2848eb",
  "expires_at": "2026-10-28T14:06:23.427503621Z",
  "resend_available_at": "2026-10-28T14:01:24.427503621Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677210000` → **200**

```json
{
  "phone": "+380677210000",
  "audience": "CLIENT",
  "code": "820641",
  "sent_at": "2026-10-28T14:01:23.430227399Z",
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
  "session_id": "4a604127-31ae-4082-8805-ba5dc76f5bc7",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5ODMsImlhdCI6MTc5MzE5NjA4MywianRpIjoiMTE3MzkwZGYtZGRlNy00MjBlLTk4OWQtMTgwYzY4OGJmMTRmIiwic2lkIjoiNGE2MDQxMjctMzFhZS00MDgyLTg4MDUtYmE1ZGM3NmY1YmM3In0.0Ea-KgHP5LHk1N1ihEEmxQYrX3mSkuu9_F4s2aaziWA",
  "access_expires_at": "2026-10-28T14:16:23.875302482Z",
  "refresh_token": "qJxWILY5JBjUCcDP1qHDC2kRTEK1I2rL1kY-jgXB1jE",
  "refresh_expires_at": "2026-10-29T02:01:23.874834471Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380677210000` → **200**

```json
{
  "deliveries": [
    {
      "id": "55351ed9-cade-46d9-904f-906de6570f78",
      "challenge_id": "fb4b42b3-5753-4dd5-8a50-e062cf2848eb",
      "phone": "+380677210000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-0df42dd3-f4db-4d0e-b733-dd38b872fc60",
      "error": null,
      "attempted_at": "2026-10-28T14:01:23.430498Z"
    },
    {
      "id": "880ee9e4-57b1-41c3-a496-5079419f2722",
      "challenge_id": "fb4b42b3-5753-4dd5-8a50-e062cf2848eb",
      "phone": "+380677210000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:01:23.429744Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380677210000` → **200**

```json
{
  "phone": "+380677210000",
  "audience": "CLIENT",
  "code": "820641",
  "sent_at": "2026-10-28T14:01:23.430227399Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676517861` → **200**

```json
{
  "deliveries": [
    {
      "id": "6887df70-9d97-4e03-b399-22d125510a10",
      "challenge_id": "45ff2c7e-039b-4dac-bb72-05f63b31ad48",
      "phone": "+380676517861",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5e698009-10f6-48e8-8714-5b41030525e8",
      "error": null,
      "attempted_at": "2026-10-28T14:01:23.221934Z"
    }
  ]
}
```

Done: SMS to +380676557225, a call to +380676517861, SMS then a call to +380677210000.

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
  "session_id": "2a64df0e-70f7-453d-adc4-4f26f7682776",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5ODQsImlhdCI6MTc5MzE5NjA4NCwianRpIjoiNTMwMmIxYjMtNTgwYS00YTgxLTg3ZDgtMzYxYmEzMTAxYWY0Iiwic2lkIjoiMmE2NGRmMGUtNzBmNy00NTNkLWFkYzQtNGYyNmY3NjgyNzc2In0.f18jtF7HUciInAGCc8eJOVBku92IseqgxojT2Qt8RRE",
  "access_expires_at": "2026-10-28T14:16:24.718743206Z",
  "refresh_token": "fSxlL9Y6QENyWF0lItvEyFzJ5OiJOP7Atn5rRm4LrC4",
  "refresh_expires_at": "2026-10-29T02:01:24.718226863Z",
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
  "session_id": "ffa7ae28-67bf-42c6-90ae-6bcb9f705f06",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTY5ODUsImlhdCI6MTc5MzE5NjA4NSwianRpIjoiOWMzNTIxMjUtOThjOS00ZjY0LTg0NDAtYTgxMGMzZmU0OTQ3Iiwic2lkIjoiZmZhN2FlMjgtNjdiZi00MmM2LTkwYWUtNmJjYjlmNzA1ZjA2In0.R9xEb2SObEj9_WulKAmqG2OtQjMHDw2wkn4ayqzWqhY",
  "access_expires_at": "2026-10-28T14:16:25.144129222Z",
  "refresh_token": "Aig3h6VOWTZz95sx37AYChtAYnSUdlAz2FqNAmiNgBQ",
  "refresh_expires_at": "2026-10-29T02:01:25.14361364Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "082b7a54-1900-46de-b027-a59df7363721",
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

`POST /api/admin/v1/staff-extensions/082b7a54-1900-46de-b027-a59df7363721` → **200**

```json
{
  "command_id": "6b0c2d11-a563-4132-a031-8e8192957c46",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "082b7a54-1900-46de-b027-a59df7363721",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "a842be75-8d74-485a-b5a9-25acb561c859",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:01:25.929581Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:01:25.929581Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ec0de61e-dec9-4b34-9384-e26b9f084ce2",
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
  "id": "03238d1c-da4d-447a-9f7f-944548b12a1e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:26.317919Z",
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
  "command_id": "73f99c21-e6e4-496e-9e78-df48aa0abd98",
  "quote_id": "03238d1c-da4d-447a-9f7f-944548b12a1e",
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
    "phone": "+380679828327"
  }
}
```

```json
{
  "id": "33e56752-e7ba-4f8b-9df3-487c503d781b",
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
  "created_at": "2026-10-28T14:01:26.520488Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679828327"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/33e56752-e7ba-4f8b-9df3-487c503d781b/calls` → **201**

```json
{
  "command_id": "d0300324-2986-4f73-be50-8acd061bd647",
  "to": "CALLER"
}
```

```json
{
  "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
  "order_ids": [
    "33e56752-e7ba-4f8b-9df3-487c503d781b"
  ],
  "started_at": "2026-10-28T14:01:26.746853Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/33e56752-e7ba-4f8b-9df3-487c503d781b/calls` → **201**

```json
{
  "command_id": "d0300324-2986-4f73-be50-8acd061bd647",
  "to": "CALLER"
}
```

```json
{
  "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
  "order_ids": [
    "33e56752-e7ba-4f8b-9df3-487c503d781b"
  ],
  "started_at": "2026-10-28T14:01:26.746853Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380679828327",
    "at": "2026-10-28T14:01:26.748892772Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.18288",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "3c9819d7-15d0-4580-944b-632bb67f3a34"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=33e56752-e7ba-4f8b-9df3-487c503d781b` → **200**

```json
{
  "calls": [
    {
      "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [
        "33e56752-e7ba-4f8b-9df3-487c503d781b"
      ],
      "started_at": "2026-10-28T14:01:26.746853Z",
      "answered_at": "2026-10-28T14:01:27.210181Z",
      "ended_at": "2026-10-28T14:01:27.225796Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=33e56752-e7ba-4f8b-9df3-487c503d781b` → **200**

```json
{
  "calls": [
    {
      "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [
        "33e56752-e7ba-4f8b-9df3-487c503d781b"
      ],
      "started_at": "2026-10-28T14:01:26.746853Z",
      "answered_at": "2026-10-28T14:01:27.210181Z",
      "ended_at": "2026-10-28T14:01:27.225796Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=33e56752-e7ba-4f8b-9df3-487c503d781b` → **200**

```json
{
  "calls": [
    {
      "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [
        "33e56752-e7ba-4f8b-9df3-487c503d781b"
      ],
      "started_at": "2026-10-28T14:01:26.746853Z",
      "answered_at": "2026-10-28T14:01:27.210181Z",
      "ended_at": "2026-10-28T14:01:27.225796Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=33e56752-e7ba-4f8b-9df3-487c503d781b` → **200**

```json
{
  "calls": [
    {
      "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [
        "33e56752-e7ba-4f8b-9df3-487c503d781b"
      ],
      "started_at": "2026-10-28T14:01:26.746853Z",
      "answered_at": "2026-10-28T14:01:27.210181Z",
      "ended_at": "2026-10-28T14:01:27.225796Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=33e56752-e7ba-4f8b-9df3-487c503d781b` → **200**

```json
{
  "calls": [
    {
      "id": "3c9819d7-15d0-4580-944b-632bb67f3a34",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "082b7a54-1900-46de-b027-a59df7363721",
      "order_ids": [
        "33e56752-e7ba-4f8b-9df3-487c503d781b"
      ],
      "started_at": "2026-10-28T14:01:26.746853Z",
      "answered_at": "2026-10-28T14:01:27.210181Z",
      "ended_at": "2026-10-28T14:01:27.225796Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:01:34.597092Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/33e56752-e7ba-4f8b-9df3-487c503d781b` → **200**

```json
{
  "id": "33e56752-e7ba-4f8b-9df3-487c503d781b",
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
  "created_at": "2026-10-28T14:01:26.520488Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679828327"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/33e56752-e7ba-4f8b-9df3-487c503d781b/cancel` → **200**

```json
{
  "command_id": "af51f434-e70b-46d0-95d8-cd905717e561",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "33e56752-e7ba-4f8b-9df3-487c503d781b",
  "short_number": 16,
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
  "created_at": "2026-10-28T14:01:26.520488Z",
  "caller": {
    "name": "Caller",
    "phone": "+380679828327"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "en": "No cars available",
      "ru": "Нет свободных машин",
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто"
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
  "command_id": "c4cb43af-7134-4dd3-9f58-558b859d1fdb",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:01:36.742486Z",
  "extension": "101"
}
```

Done: outgoing call 3c9819d7-15d0-4580-944b-632bb67f3a34 from order 33e56752-e7ba-4f8b-9df3-487c503d781b, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638044518",
  "device_ref": "sandbox-20382"
}
```

```json
{
  "challenge_id": "1662d382-4984-42db-9dff-f2e0c18a852d",
  "expires_at": "2026-10-28T14:06:36.95095731Z",
  "resend_available_at": "2026-10-28T14:01:37.95095731Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638044518` → **200**

```json
{
  "phone": "+380638044518",
  "audience": "CLIENT",
  "code": "428535",
  "sent_at": "2026-10-28T14:01:36.954223195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1662d382-4984-42db-9dff-f2e0c18a852d",
  "code": "428535",
  "device_ref": "sandbox-20382"
}
```

```json
{
  "session_id": "b4476a8e-6651-45d6-9fea-3e9f30c821a9",
  "subject": {
    "type": "CLIENT",
    "id": "a4c14638-713b-4e9d-8b14-6b78d2115755"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGMxNDYzOC03MTNiLTRlOWQtOGIxNC02Yjc4ZDIxMTU3NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTk3LCJpYXQiOjE3OTMxOTYwOTcsImp0aSI6ImMwYzFlNzQ3LWUzYzAtNDBhNi04OGQyLTM3Yjk2MzNjMTgyMSIsInNpZCI6ImI0NDc2YThlLTY2NTEtNDVkNi05ZmVhLTNlOWYzMGM4MjFhOSJ9.CNvzErvYYAhToNunO6lnWmzzfzUhOh_FJjvt5AzTc4k",
  "access_expires_at": "2026-10-28T14:16:37.170931449Z",
  "refresh_token": "TidRoebnVdZ98clr0Y2SPPSFwEehHpNeuXAdZXn3POM",
  "refresh_expires_at": "2026-11-27T14:01:37.170424668Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
  "session_id": "b4476a8e-6651-45d6-9fea-3e9f30c821a9",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638044518",
  "device_ref": "sandbox-16570"
}
```

```json
{
  "challenge_id": "c5c49210-4ebb-49df-a0eb-f9f136e91deb",
  "expires_at": "2026-10-28T14:06:39.54594641Z",
  "resend_available_at": "2026-10-28T14:01:40.54594641Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638044518` → **200**

```json
{
  "phone": "+380638044518",
  "audience": "CLIENT",
  "code": "411633",
  "sent_at": "2026-10-28T14:01:39.54813498Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c5c49210-4ebb-49df-a0eb-f9f136e91deb",
  "code": "411633",
  "device_ref": "sandbox-16570"
}
```

```json
{
  "session_id": "33e951e3-d052-4241-9b3b-fc99d5c8f3ea",
  "subject": {
    "type": "CLIENT",
    "id": "a4c14638-713b-4e9d-8b14-6b78d2115755"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGMxNDYzOC03MTNiLTRlOWQtOGIxNC02Yjc4ZDIxMTU3NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk2OTk5LCJpYXQiOjE3OTMxOTYwOTksImp0aSI6Ijk2OWQ1YjllLTU5M2EtNDg3NC1iNThjLThhZDEyNzk2ZTNhMiIsInNpZCI6IjMzZTk1MWUzLWQwNTItNDI0MS05YjNiLWZjOTlkNWM4ZjNlYSJ9.8Yx6iyV_mmFDB9uSZw-9Nog4kNZ-OavbhVyO5ERrd9o",
  "access_expires_at": "2026-10-28T14:16:39.758466114Z",
  "refresh_token": "7LNTL66U7eblzHZi6paCt5IWN537N7tqzCSE97uPYxQ",
  "refresh_expires_at": "2026-11-27T14:01:39.75791829Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "83a92080-adde-4f31-abbe-fa3add6ed892",
  "expires_at": "2026-10-28T14:06:41.95427407Z",
  "resend_available_at": "2026-10-28T14:01:42.95427407Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638044518` → **200**

```json
{
  "phone": "+380638044518",
  "audience": "CLIENT",
  "code": "220642",
  "sent_at": "2026-10-28T14:01:41.956514954Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636966202"
}
```

```json
{
  "challenge_id": "c0a27c3f-637a-4960-a954-5ad482b06a3d",
  "expires_at": "2026-10-28T14:06:42.182407628Z",
  "resend_available_at": "2026-10-28T14:01:43.182407628Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636966202` → **200**

```json
{
  "phone": "+380636966202",
  "audience": "CLIENT",
  "code": "173184",
  "sent_at": "2026-10-28T14:01:42.184254557Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "3dc7bd4b-26a9-410b-9644-4c9fc2e6f7c5",
  "current_challenge_id": "83a92080-adde-4f31-abbe-fa3add6ed892",
  "current_code": "000000",
  "new_challenge_id": "c0a27c3f-637a-4960-a954-5ad482b06a3d",
  "new_code": "173184"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e5b66d1f-eab8-450f-abbc-7e389cbcf4e0"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "6db00a22-7e96-4e96-998e-f153cc60a258",
  "current_challenge_id": "83a92080-adde-4f31-abbe-fa3add6ed892",
  "current_code": "220642",
  "new_challenge_id": "c0a27c3f-637a-4960-a954-5ad482b06a3d",
  "new_code": "173184"
}
```

```json
{
  "subject_id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
  "phone": "+380636966202",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
  "session_id": "b4476a8e-6651-45d6-9fea-3e9f30c821a9",
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
  "correlation_id": "897260b5-a44a-41dd-91f0-d79f30648d10"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636966202",
  "device_ref": "sandbox-17189"
}
```

```json
{
  "challenge_id": "40c13c43-a94f-4ed0-b560-4e13aac32c28",
  "expires_at": "2026-10-28T14:06:45.207202117Z",
  "resend_available_at": "2026-10-28T14:01:46.207202117Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636966202` → **200**

```json
{
  "phone": "+380636966202",
  "audience": "CLIENT",
  "code": "671941",
  "sent_at": "2026-10-28T14:01:45.20942897Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40c13c43-a94f-4ed0-b560-4e13aac32c28",
  "code": "671941",
  "device_ref": "sandbox-17189"
}
```

```json
{
  "session_id": "072530db-8681-4ed6-aa30-b955cfed1168",
  "subject": {
    "type": "CLIENT",
    "id": "a4c14638-713b-4e9d-8b14-6b78d2115755"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGMxNDYzOC03MTNiLTRlOWQtOGIxNC02Yjc4ZDIxMTU3NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MDA1LCJpYXQiOjE3OTMxOTYxMDUsImp0aSI6IjExMjc1Nzg0LTI0ZGQtNDdhZi05MzNkLTI2Njc5ZDYxNGEzMyIsInNpZCI6IjA3MjUzMGRiLTg2ODEtNGVkNi1hYTMwLWI5NTVjZmVkMTE2OCJ9.SsN5xGjtloDh00dFeLopQrJ2Kt2vP_28FTo47Yuy1vM",
  "access_expires_at": "2026-10-28T14:16:45.416268283Z",
  "refresh_token": "4WJZ6HTtTVP4oSgRuLLSe7yLBNlH4DonvF1v-XFi8x0",
  "refresh_expires_at": "2026-11-27T14:01:45.415720262Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
  "session_id": "072530db-8681-4ed6-aa30-b955cfed1168",
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
  "session_id": "8b95d7e3-96d5-463a-8408-5591f59d2610",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMDYsImlhdCI6MTc5MzE5NjEwNiwianRpIjoiM2VjN2UwMGEtYmFiMy00NGM5LWI4NjAtMTJmODdjNjVjZGI2Iiwic2lkIjoiOGI5NWQ3ZTMtOTZkNS00NjNhLTg0MDgtNTU5MWY1OWQyNjEwIn0.0_fWnP2cbWmJyfSD1Nox_FcBMDUA5F29pJdAePRuwAw",
  "access_expires_at": "2026-10-28T14:16:46.012924003Z",
  "refresh_token": "5MJkzQcq0qqM5G3qwQoMCCo-4xlISsg69bpU8NC6vTU",
  "refresh_expires_at": "2026-10-29T02:01:46.012394631Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/a4c14638-713b-4e9d-8b14-6b78d2115755` → **200**

```json
{
  "client": {
    "id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
    "phone": "+380636966202",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:01:37.168574Z",
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

`POST /api/admin/v1/clients/a4c14638-713b-4e9d-8b14-6b78d2115755/phone` → **400**

```json
{
  "command_id": "b4083360-9fd9-49de-be2b-988ac129b528",
  "expected_version": 3,
  "phone": "+380635645012",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/a4c14638-713b-4e9d-8b14-6b78d2115755/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f16b1059-6406-4dff-b7dc-d9295f3dadda",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/a4c14638-713b-4e9d-8b14-6b78d2115755/phone` → **200**

```json
{
  "command_id": "838fef62-7812-42b9-8a94-18a4c6eca3bd",
  "expected_version": 3,
  "phone": "+380635645012",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
  "phone": "+380635645012",
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
  "correlation_id": "60ab99e9-6d94-4881-af1b-f2c5f575caae"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635645012",
  "device_ref": "sandbox-25620"
}
```

```json
{
  "challenge_id": "05333040-a13a-40e3-8020-abfb5d8f2f96",
  "expires_at": "2026-10-28T14:06:47.007482453Z",
  "resend_available_at": "2026-10-28T14:01:48.007482453Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635645012` → **200**

```json
{
  "phone": "+380635645012",
  "audience": "CLIENT",
  "code": "060170",
  "sent_at": "2026-10-28T14:01:47.009864423Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "05333040-a13a-40e3-8020-abfb5d8f2f96",
  "code": "060170",
  "device_ref": "sandbox-25620"
}
```

```json
{
  "session_id": "3a2e1499-0a1a-4d0b-b673-c221980a2034",
  "subject": {
    "type": "CLIENT",
    "id": "a4c14638-713b-4e9d-8b14-6b78d2115755"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNGMxNDYzOC03MTNiLTRlOWQtOGIxNC02Yjc4ZDIxMTU3NTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MDA3LCJpYXQiOjE3OTMxOTYxMDcsImp0aSI6ImE3ODFjZjJiLTQwMWYtNDgzZC1hYjFhLTY2NGMyYTkyODhmMiIsInNpZCI6IjNhMmUxNDk5LTBhMWEtNGQwYi1iNjczLWMyMjE5ODBhMjAzNCJ9.lOBnwVCMXHLbnasH_sq_uuVecR3D6i1Yh0LP7zkajRI",
  "access_expires_at": "2026-10-28T14:16:47.227052852Z",
  "refresh_token": "1HIy1P48wQYoUvjPxEDTvGTAGQ4QE4rzDGNu99sPRJg",
  "refresh_expires_at": "2026-11-27T14:01:47.22658498Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a4c14638-713b-4e9d-8b14-6b78d2115755",
  "session_id": "3a2e1499-0a1a-4d0b-b673-c221980a2034",
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
  "phone": "+380631663166",
  "device_ref": "sandbox-14022"
}
```

```json
{
  "challenge_id": "e387b272-21ee-4f0c-b90b-45b911af4bd3",
  "expires_at": "2026-10-28T14:06:47.618286635Z",
  "resend_available_at": "2026-10-28T14:01:48.618286635Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631663166` → **200**

```json
{
  "phone": "+380631663166",
  "audience": "CLIENT",
  "code": "088500",
  "sent_at": "2026-10-28T14:01:47.620175464Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e387b272-21ee-4f0c-b90b-45b911af4bd3",
  "code": "088500",
  "device_ref": "sandbox-14022"
}
```

```json
{
  "session_id": "d2becff6-3585-4bc2-a230-60c4920f1d00",
  "subject": {
    "type": "CLIENT",
    "id": "6267866c-de23-4611-8ddd-68403b64a00f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjY3ODY2Yy1kZTIzLTQ2MTEtOGRkZC02ODQwM2I2NGEwMGYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MDA3LCJpYXQiOjE3OTMxOTYxMDcsImp0aSI6IjQ3MjhjZWEyLTA2ZTAtNDdkMS05ODU0LTUwMzVkZDUzZjgxMyIsInNpZCI6ImQyYmVjZmY2LTM1ODUtNGJjMi1hMjMwLTYwYzQ5MjBmMWQwMCJ9.po1a0QXbdZNQCFwodsiRIKaTtm0AADxVZndoKgsm6qI",
  "access_expires_at": "2026-10-28T14:16:47.82508585Z",
  "refresh_token": "c4u68nOPcZ8YKTzcoqSfGtFKIreM-1BrZNu64XYdbWw",
  "refresh_expires_at": "2026-11-27T14:01:47.824488153Z",
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
  "session_id": "face8208-96a7-4891-9844-4d7b12ab53d1",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMDgsImlhdCI6MTc5MzE5NjEwOCwianRpIjoiZTZkYjU4ZDEtYjQ2Yi00OWFjLThkYzEtNjRhMjc4MGViMDcyIiwic2lkIjoiZmFjZTgyMDgtOTZhNy00ODkxLTk4NDQtNGQ3YjEyYWI1M2QxIn0.d20_MukI0KTyLmYjpizxDwnO5o0NrLrszcSBT71ZIYs",
  "access_expires_at": "2026-10-28T14:16:48.669920436Z",
  "refresh_token": "hvRNLXfEz94YOYqIKR_w14icVnxTpRvEOItlmoeExRc",
  "refresh_expires_at": "2026-10-29T02:01:48.669500432Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380631663166` → **200**

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
  "correlation_id": "8e28b578-203c-4c91-8ebc-ccbcb543a184"
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
  "session_id": "af4a11d3-2546-4afd-809a-802a6ce05d5d",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMDksImlhdCI6MTc5MzE5NjEwOSwianRpIjoiN2IxODdhOTctZDJlMS00YjJmLWE1YTMtNDhhNTBhNTI4ODE2Iiwic2lkIjoiYWY0YTExZDMtMjU0Ni00YWZkLTgwOWEtODAyYTZjZTA1ZDVkIn0.wQJGsxXcr14hbqCAZDC2IXAug4u4Uq4w4FKbVM1u264",
  "access_expires_at": "2026-10-28T14:16:49.53134151Z",
  "refresh_token": "WLfpacXI5A7HjEiZ0oliGSwKC8baciikrbjgotJ1m7o",
  "refresh_expires_at": "2026-10-29T02:01:49.530757247Z",
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
  "device_ref": "sandbox-22326"
}
```

```json
{
  "challenge_id": "4d826e79-f5da-4fb3-ba86-140112cd6dfc",
  "expires_at": "2026-10-28T14:06:49.959694942Z",
  "resend_available_at": "2026-10-28T14:01:50.959694942Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "463504",
  "sent_at": "2026-10-28T14:01:49.963483567Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d826e79-f5da-4fb3-ba86-140112cd6dfc",
  "code": "463504",
  "device_ref": "sandbox-22326"
}
```

```json
{
  "session_id": "e2dd88b0-aa49-4b25-ac3d-b115ae3d77a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzAxMCwiaWF0IjoxNzkzMTk2MTEwLCJqdGkiOiJkM2U5ZWQ3Mi0xOWE5LTQyYzQtOGU1YS05MWY1MjgyNWQzN2MiLCJzaWQiOiJlMmRkODhiMC1hYTQ5LTRiMjUtYWMzZC1iMTE1YWUzZDc3YTgifQ.dw2hphuGVq6gw7bSUZsYDEIRGWS2YF_kg4jOCUshT9g",
  "access_expires_at": "2026-10-28T14:16:50.203206068Z",
  "refresh_token": "_ANiIm5If406526iLEoKMjpYncv2y_yanJrS-Dnhdqc",
  "refresh_expires_at": "2026-11-27T14:01:50.202777463Z",
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
  "command_id": "95fe5563-7260-4915-9594-2f47ca601eda",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:50Z",
    "sequence": 1793196110628
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
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
  "last_heartbeat_at": "2026-10-28T14:01:50.64421Z",
  "last_location_at": "2026-10-28T14:01:50.64421Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677284731",
  "device_ref": "sandbox-13137"
}
```

```json
{
  "challenge_id": "a4c5ee85-3052-47c3-b449-5bcc317464dc",
  "expires_at": "2026-10-28T14:06:50.834279585Z",
  "resend_available_at": "2026-10-28T14:01:51.834279585Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380677284731` → **200**

```json
{
  "phone": "+380677284731",
  "audience": "CLIENT",
  "code": "516379",
  "sent_at": "2026-10-28T14:01:50.836672921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a4c5ee85-3052-47c3-b449-5bcc317464dc",
  "code": "516379",
  "device_ref": "sandbox-13137"
}
```

```json
{
  "session_id": "b48326e5-83f8-4d4a-972d-61fb7c21e648",
  "subject": {
    "type": "CLIENT",
    "id": "3d9df336-63f3-4910-a455-5963d61c0b46"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZDlkZjMzNi02M2YzLTQ5MTAtYTQ1NS01OTYzZDYxYzBiNDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MDExLCJpYXQiOjE3OTMxOTYxMTEsImp0aSI6Ijg3NTA3YzZkLTI0MTEtNGJjZi04NzE5LTQyMGIzYzI3YmUzNSIsInNpZCI6ImI0ODMyNmU1LTgzZjgtNGQ0YS05NzJkLTYxZmI3YzIxZTY0OCJ9.fH6PKpehHMHC37voI8kZ3hDMeJsIjt4venp8_Ey3ZxA",
  "access_expires_at": "2026-10-28T14:16:51.043633902Z",
  "refresh_token": "mOEGHcPK8tTTzxhcvfYjNQsz0MZIY6N-cK2LlS1ze5U",
  "refresh_expires_at": "2026-11-27T14:01:51.04307988Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e62f8f03-90d8-4d2e-a96f-bf0e97354d1e",
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
  "id": "fffa4193-15a0-4541-bacf-4abb39e843ab",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:06:51.245360Z",
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
  "command_id": "03cc5965-5814-47de-8e8d-47f684df5866",
  "quote_id": "fffa4193-15a0-4541-bacf-4abb39e843ab",
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
  "id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3d9df336-63f3-4910-a455-5963d61c0b46",
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
  "created_at": "2026-10-28T14:01:51.450395Z",
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
    "id": "ffe0a47e-6ef0-49b6-920e-a8416957b410",
    "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
    "expires_at": "2026-10-28T14:02:06.453101Z",
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

`POST /api/driver/v1/offers/ffe0a47e-6ef0-49b6-920e-a8416957b410/accept` → **200**

```json
{
  "command_id": "edabe837-2ce7-4909-b3bc-a01dd87387c6"
}
```

```json
{
  "id": "17f57389-9701-468e-8557-359a246cd0f8",
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "317fdbef-58dc-485e-a045-3bff42a16834",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "317fdbef-58dc-485e-a045-3bff42a16834",
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "assignment_id": "17f57389-9701-468e-8557-359a246cd0f8",
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

`POST /api/driver/v1/work-sessions/a7e8697d-7054-4f58-8284-d4fd1f6ffce3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:52Z",
    "sequence": 1793196112227
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
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
  "last_heartbeat_at": "2026-10-28T14:01:52.24293Z",
  "last_location_at": "2026-10-28T14:01:52.24293Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "317fdbef-58dc-485e-a045-3bff42a16834",
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "assignment_id": "17f57389-9701-468e-8557-359a246cd0f8",
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

`POST /api/driver/v1/trips/317fdbef-58dc-485e-a045-3bff42a16834/arrive` → **200**

```json
{
  "command_id": "f18d54a0-37f7-4288-beb6-27967013eb6a",
  "expected_version": 0
}
```

```json
{
  "id": "317fdbef-58dc-485e-a045-3bff42a16834",
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "assignment_id": "17f57389-9701-468e-8557-359a246cd0f8",
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
  "arrived_at": "2026-10-28T14:01:52.629952Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/317fdbef-58dc-485e-a045-3bff42a16834/start` → **200**

```json
{
  "command_id": "bc47a5da-6f70-4dbb-9dc9-28e62a8d573d",
  "expected_version": 1
}
```

```json
{
  "id": "317fdbef-58dc-485e-a045-3bff42a16834",
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "assignment_id": "17f57389-9701-468e-8557-359a246cd0f8",
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
  "arrived_at": "2026-10-28T14:01:52.629952Z",
  "started_at": "2026-10-28T14:01:52.831729Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/a7e8697d-7054-4f58-8284-d4fd1f6ffce3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:01:53Z",
    "sequence": 1793196113268
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
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
  "last_heartbeat_at": "2026-10-28T14:01:53.042225Z",
  "last_location_at": "2026-10-28T14:01:53.042225Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/317fdbef-58dc-485e-a045-3bff42a16834/complete` → **200**

```json
{
  "command_id": "9810a42d-27bb-4edf-b63a-e71a41a88b6e",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:01:53Z",
  "cash_received": true
}
```

```json
{
  "id": "317fdbef-58dc-485e-a045-3bff42a16834",
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "assignment_id": "17f57389-9701-468e-8557-359a246cd0f8",
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
  "arrived_at": "2026-10-28T14:01:52.629952Z",
  "started_at": "2026-10-28T14:01:52.831729Z",
  "completed_at": "2026-10-28T14:01:53.233605Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/58a6ac53-57bb-416f-bf75-6c1e03b7fed5/rating` → **200**

```json
{
  "command_id": "debd8bf4-7ac7-4148-bca8-738b71720e29",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "score": 5,
  "created_at": "2026-10-28T14:01:53.444705641Z"
}
```

`POST /api/driver/v1/orders/58a6ac53-57bb-416f-bf75-6c1e03b7fed5/rating` → **200**

```json
{
  "command_id": "cccd2595-8be3-437c-bc5a-1cba9726f949",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
  "score": 4,
  "created_at": "2026-10-28T14:01:53.642443349Z"
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
  "session_id": "43733fe2-f967-4ad0-a569-bf41b974903e",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMTQsImlhdCI6MTc5MzE5NjExNCwianRpIjoiZjM1MzFkNDAtNjg2NS00OGQ3LTgyMTYtYWM0YjlhOWYyZWEzIiwic2lkIjoiNDM3MzNmZTItZjk2Ny00YWQwLWE1NjktYmY0MWI5NzQ5MDNlIn0.7JrvJdBxD2S4TOHI3FVzqYqwhL7lbauOzCDQYEbaQZA",
  "access_expires_at": "2026-10-28T14:16:54.257262252Z",
  "refresh_token": "N5epjWpDlQ27u-O5T7rUH20IhUY_HmVr5YMftL4xfss",
  "refresh_expires_at": "2026-10-29T02:01:54.256182917Z",
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
  "session_id": "68085686-fb62-4605-8c63-07fa2f5513db",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMTQsImlhdCI6MTc5MzE5NjExNCwianRpIjoiZWRiMjk4N2EtZDI0YS00ODgyLTlhOGQtMWVhMzJkZDllZmIzIiwic2lkIjoiNjgwODU2ODYtZmI2Mi00NjA1LThjNjMtMDdmYTJmNTUxM2RiIn0.9qCUy5ri24eIWxCnIR3Pggswe7melRIhwNl8X_wG6jQ",
  "access_expires_at": "2026-10-28T14:16:54.686298098Z",
  "refresh_token": "hAqNByh14JhAs58u-A4fqANzbE1SXCXltpjAZSrAej4",
  "refresh_expires_at": "2026-10-29T02:01:54.685916352Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/58a6ac53-57bb-416f-bf75-6c1e03b7fed5/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
      "author_type": "RIDER",
      "author_id": "3d9df336-63f3-4910-a455-5963d61c0b46",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:01:53.444706Z"
    },
    {
      "order_id": "58a6ac53-57bb-416f-bf75-6c1e03b7fed5",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "3d9df336-63f3-4910-a455-5963d61c0b46",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:01:53.642443Z"
    }
  ]
}
```

Done: ratings for order 58a6ac53-57bb-416f-bf75-6c1e03b7fed5.

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
  "session_id": "d9bfd0bf-d2d1-4e71-97d5-03f02821eb58",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMTUsImlhdCI6MTc5MzE5NjExNSwianRpIjoiODIyNjFjN2YtOTc4Ni00NjdmLWJiMTYtMDgxMjQzYjA2Y2VmIiwic2lkIjoiZDliZmQwYmYtZDJkMS00ZTcxLTk3ZDUtMDNmMDI4MjFlYjU4In0.2luTgTR_GCxO9oLeGC6JVcOLiENvVJa48qpDWDBsmlU",
  "access_expires_at": "2026-10-28T14:16:55.36892713Z",
  "refresh_token": "f3mmWzkBrzKynL_2EpLxg0hZmPGxMtqhFx181t2Tp7g",
  "refresh_expires_at": "2026-10-29T02:01:55.368536041Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "bdfb6678-2240-457f-a69a-608a77c9cd96",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "bfe63ff5-eb2c-4803-9bcb-bf103b35db00",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:01:55.563747Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bfe63ff5-eb2c-4803-9bcb-bf103b35db00` → **200**

```json
{
  "id": "bfe63ff5-eb2c-4803-9bcb-bf103b35db00",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:01:55.563747Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bfe63ff5-eb2c-4803-9bcb-bf103b35db00` → **200**

```json
{
  "id": "bfe63ff5-eb2c-4803-9bcb-bf103b35db00",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:01:55.563747Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bfe63ff5-eb2c-4803-9bcb-bf103b35db00` → **200**

```json
{
  "id": "bfe63ff5-eb2c-4803-9bcb-bf103b35db00",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:01:55.563747Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bfe63ff5-eb2c-4803-9bcb-bf103b35db00` → **200**

```json
{
  "id": "bfe63ff5-eb2c-4803-9bcb-bf103b35db00",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:01:55.563747Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/bfe63ff5-eb2c-4803-9bcb-bf103b35db00` → **200**

```json
{
  "id": "bfe63ff5-eb2c-4803-9bcb-bf103b35db00",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:01:55.563747Z",
  "ready_at": "2026-10-28T14:01:59.614584Z",
  "expires_at": "2026-10-29T14:01:59.614584Z"
}
```

`GET /api/admin/v1/reports/exports/bfe63ff5-eb2c-4803-9bcb-bf103b35db00/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,17,5,12,0,0,13,4,0,15,1,0,1,6,1,5
total,17,5,12,0,0,13,4,0,15,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "2b610a67-29d9-422b-8858-c7c926144b90",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "360ecfeb-c964-4e9c-bc75-e0ad3c64e102",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:02:00.792304Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/360ecfeb-c964-4e9c-bc75-e0ad3c64e102` → **200**

```json
{
  "id": "360ecfeb-c964-4e9c-bc75-e0ad3c64e102",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:02:00.792304Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/360ecfeb-c964-4e9c-bc75-e0ad3c64e102` → **200**

```json
{
  "id": "360ecfeb-c964-4e9c-bc75-e0ad3c64e102",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:02:00.792304Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/360ecfeb-c964-4e9c-bc75-e0ad3c64e102` → **200**

```json
{
  "id": "360ecfeb-c964-4e9c-bc75-e0ad3c64e102",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:02:00.792304Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/360ecfeb-c964-4e9c-bc75-e0ad3c64e102` → **200**

```json
{
  "id": "360ecfeb-c964-4e9c-bc75-e0ad3c64e102",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:02:00.792304Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/360ecfeb-c964-4e9c-bc75-e0ad3c64e102` → **200**

```json
{
  "id": "360ecfeb-c964-4e9c-bc75-e0ad3c64e102",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:02:00.792304Z",
  "ready_at": "2026-10-28T14:02:04.623841Z",
  "expires_at": "2026-10-29T14:02:04.623841Z"
}
```

`GET /api/admin/v1/reports/exports/360ecfeb-c964-4e9c-bc75-e0ad3c64e102/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,5,803.72,130.74,120.57,683.15,10.52,0.00,162.97,20.00,479.49,25.00,0.00
total,UAH,5,803.72,130.74,120.57,683.15,10.52,0.00,162.97,20.00,479.49,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/fe58c122-25e7-4c73-8080-d7b2fa292a67` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/fe58c122-25e7-4c73-8080-d7b2fa292a67",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "17286a31-b731-432f-9d95-f6f360eb9c19"
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
  "device_ref": "sandbox-4309"
}
```

```json
{
  "challenge_id": "43f2df3a-1ba0-4642-8a15-c81f4be3aeb7",
  "expires_at": "2026-10-28T14:07:06.206905209Z",
  "resend_available_at": "2026-10-28T14:02:07.206905209Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "147528",
  "sent_at": "2026-10-28T14:02:06.20911084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43f2df3a-1ba0-4642-8a15-c81f4be3aeb7",
  "code": "147528",
  "device_ref": "sandbox-4309"
}
```

```json
{
  "session_id": "b6225dbf-1951-48e4-9495-6ec2f2473813",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzAyNiwiaWF0IjoxNzkzMTk2MTI2LCJqdGkiOiI0MGI2ZDUwMy03MDVjLTRlNmItODBkYy1hM2Q4YWNiMGJjNmEiLCJzaWQiOiJiNjIyNWRiZi0xOTUxLTQ4ZTQtOTQ5NS02ZWMyZjI0NzM4MTMifQ.9FFmL_C2b4hJwcQMsqyqvOmJ10kapn7AHyfpTSCeB-I",
  "access_expires_at": "2026-10-28T14:17:06.417112589Z",
  "refresh_token": "_m0V3UVBEWFALkA6AJaa-USWNPfH5WdKHfzN9DvlLKA",
  "refresh_expires_at": "2026-11-27T14:02:06.416626112Z",
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
  "command_id": "41d5dc47-e060-4b7b-ac3f-6cb3c0d30475",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:02:06Z",
    "sequence": 1793196126973
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d58dee45-33fe-46ce-b173-6e1fd0e5133e",
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
  "last_heartbeat_at": "2026-10-28T14:02:06.988834Z",
  "last_location_at": "2026-10-28T14:02:06.988834Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "5b56fcb7-cb31-4972-8ccf-3c59d1ab5196",
  "points": [
    {
      "sequence": 1793196129186,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:01:09Z"
    },
    {
      "sequence": 1793196129192,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:02:09Z"
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
  "session_id": "339d636f-153a-4fc7-8eb3-3e14b65daec7",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMjksImlhdCI6MTc5MzE5NjEyOSwianRpIjoiN2JhNjBjNWYtYTY1Ny00N2E1LWE0NmUtYjlhZDAwOWNjNGIwIiwic2lkIjoiMzM5ZDYzNmYtMTUzYS00ZmM3LThlYjMtM2UxNGI2NWRhZWM3In0.g2VIDdmMJNWYEGRVVpoHuf2Ptb1svDuS7zVLimzOXWU",
  "access_expires_at": "2026-10-28T14:17:09.677064557Z",
  "refresh_token": "TUcKvHMVKxaMMdbjveNc9Kfqft01y4rVMmQSxEa_d0Y",
  "refresh_expires_at": "2026-10-29T02:02:09.676482384Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "a3118fe0-e093-4eb9-936b-c316de603799",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:02:09Z",
        "track_point_id": "a7eaa633-acab-4102-92ce-b3e9259b8e8a",
        "work_session_id": "d58dee45-33fe-46ce-b173-6e1fd0e5133e"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:02:09Z",
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

`POST /api/admin/v1/driver-risk-flags/a3118fe0-e093-4eb9-936b-c316de603799/confirm` → **200**

```json
{
  "command_id": "96a3bb48-a81b-4466-8b74-79f070001447",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "a3118fe0-e093-4eb9-936b-c316de603799",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:02:09Z",
    "track_point_id": "a7eaa633-acab-4102-92ce-b3e9259b8e8a",
    "work_session_id": "d58dee45-33fe-46ce-b173-6e1fd0e5133e"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:02:09Z",
  "reason": null,
  "reviewed_by": "082b7a54-1900-46de-b027-a59df7363721",
  "reviewed_at": "2026-10-28T14:02:10.305445Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/a3118fe0-e093-4eb9-936b-c316de603799/dismiss` → **409**

```json
{
  "command_id": "a869e313-b49f-4b31-a5f7-c26b10737e00",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/a3118fe0-e093-4eb9-936b-c316de603799/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a5df9497-49e4-46bd-b605-034f5d4deffa"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "b4c9291b-4e8a-4c61-a8d3-adfc1852b0d6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "852d0bd6-561c-48e4-bcd6-6ceaf7a9662a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "082b7a54-1900-46de-b027-a59df7363721",
  "raised_at": "2026-10-28T14:02:10.719061Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/852d0bd6-561c-48e4-bcd6-6ceaf7a9662a/dismiss` → **200**

```json
{
  "command_id": "c5a3aa50-9ed2-4769-af65-d2d37d87e72b",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "852d0bd6-561c-48e4-bcd6-6ceaf7a9662a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "082b7a54-1900-46de-b027-a59df7363721",
  "raised_at": "2026-10-28T14:02:10.719061Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "082b7a54-1900-46de-b027-a59df7363721",
  "reviewed_at": "2026-10-28T14:02:10.925132Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "dff5408c-a3f8-4dd6-b486-9ebe8d85722f",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "a3118fe0-e093-4eb9-936b-c316de603799"
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
      "actor_id": "082b7a54-1900-46de-b027-a59df7363721",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:02:11.136915Z"
    }
  ]
}
```

Done: flag a3118fe0-e093-4eb9-936b-c316de603799 confirmed, suspension named it, driver reinstated.

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
  "session_id": "69791b98-679f-49cc-9491-8d84935f8c51",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMzEsImlhdCI6MTc5MzE5NjEzMSwianRpIjoiZDg2OWU1NmItNjA3Yy00YzBlLWI0ZGEtODE4NTUxMjU2OGM5Iiwic2lkIjoiNjk3OTFiOTgtNjc5Zi00OWNjLTk0OTEtOGQ4NDkzNWY4YzUxIn0.KOXaGsEHineJE6tGQ21mdDkJMqj727o315zmC9XakFc",
  "access_expires_at": "2026-10-28T14:17:11.7781337Z",
  "refresh_token": "QnwHiWri-8l0EJHNz6Ajy2j-z2Cw0ww5PI-fEUnNyjw",
  "refresh_expires_at": "2026-10-29T02:02:11.777424294Z",
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
      "actor_id": "082b7a54-1900-46de-b027-a59df7363721",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:02:11.136915Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e508273f-82bb-4d2e-93d1-14bcd5a836e3",
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
  "session_id": "d58dee45-33fe-46ce-b173-6e1fd0e5133e",
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
  "last_heartbeat_at": "2026-10-28T14:02:06.988834Z",
  "last_location_at": "2026-10-28T14:02:06.988834Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d58dee45-33fe-46ce-b173-6e1fd0e5133e/close` → **200**

```json
{
  "command_id": "ea29c106-45ab-4e19-a6d4-348ca00d7694",
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
  "session_id": "46a91503-04a4-443a-aff3-eb57e740a65b",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMzMsImlhdCI6MTc5MzE5NjEzMywianRpIjoiZWY4MjcwOTMtOTJhYi00MjhiLWFhZjktYTdjMDE5Y2Q5OTk1Iiwic2lkIjoiNDZhOTE1MDMtMDRhNC00NDNhLWFmZjMtZWI1N2U3NDBhNjViIn0.knHJbSFhCZ3XzX4oDvdPn9xhGfD9kWlaoJT7-seeVfY",
  "access_expires_at": "2026-10-28T14:17:13.059562933Z",
  "refresh_token": "4N4aWzQBhOGSwso8Ow0xNBgAT1p8s8TChIMEQOOa6OE",
  "refresh_expires_at": "2026-10-29T02:02:13.059098876Z",
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
  "command_id": "a4260efa-378a-4bb4-bd80-dd9162594b75",
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
  "changed_by": "082b7a54-1900-46de-b027-a59df7363721",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:02:13.467085Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "a4260efa-378a-4bb4-bd80-dd9162594b75",
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
  "changed_by": "082b7a54-1900-46de-b027-a59df7363721",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:02:13.467085Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48277707042",
  "device_ref": "sandbox-31755"
}
```

```json
{
  "challenge_id": "5836a285-5acf-48ee-8e6f-1718046e3dd1",
  "expires_at": "2026-10-28T14:07:13.885129321Z",
  "resend_available_at": "2026-10-28T14:02:14.885129321Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48277707042` → **200**

```json
{
  "phone": "+48277707042",
  "audience": "CLIENT",
  "code": "533363",
  "sent_at": "2026-10-28T14:02:13.887291042Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5836a285-5acf-48ee-8e6f-1718046e3dd1",
  "code": "533363",
  "device_ref": "sandbox-31755"
}
```

```json
{
  "session_id": "249cb58d-a73e-4c7c-b3ab-b15bdbbc9da2",
  "subject": {
    "type": "CLIENT",
    "id": "8a08713a-8555-40f6-ba15-4e27ebcac281"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YTA4NzEzYS04NTU1LTQwZjYtYmExNS00ZTI3ZWJjYWMyODEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MDM0LCJpYXQiOjE3OTMxOTYxMzQsImp0aSI6IjkzN2UwNjkwLTVlMGEtNDRhYS05MDhhLTExNDdkMTIxYTg0NiIsInNpZCI6IjI0OWNiNThkLWE3M2UtNGM3Yy1iM2FiLWIxNWJkYmJjOWRhMiJ9.8qk95WLiqFuIKZEZfMdTkC7AoXn8a4pew0w4giLD-Es",
  "access_expires_at": "2026-10-28T14:17:14.103130107Z",
  "refresh_token": "sIce9zzIHF7xieqtrhlKvdDOxSBltdYkVcPgBnwKmZ0",
  "refresh_expires_at": "2026-11-27T14:02:14.102535914Z",
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
  "correlation_id": "20bcbe44-bdfb-48a9-a92a-a65c84489370"
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
  "device_ref": "sandbox-25281"
}
```

```json
{
  "challenge_id": "050adda6-86d4-4cd8-8364-fcdb5ae01bdf",
  "expires_at": "2026-10-28T14:07:14.713923685Z",
  "resend_available_at": "2026-10-28T14:02:15.713923685Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "348007",
  "sent_at": "2026-10-28T14:02:14.715960341Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "050adda6-86d4-4cd8-8364-fcdb5ae01bdf",
  "code": "348007",
  "device_ref": "sandbox-25281"
}
```

```json
{
  "session_id": "c81566f8-d4fa-4217-a893-4aeaeea066f7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzAzNCwiaWF0IjoxNzkzMTk2MTM0LCJqdGkiOiJlZmI0NjhhNC02N2JmLTRjMTktOGY5Mi03MzMyY2M1ZDJlNTUiLCJzaWQiOiJjODE1NjZmOC1kNGZhLTQyMTctYTg5My00YWVhZWVhMDY2ZjcifQ.Z5IU1fHeIJiseD3GyPheXFvAhUJBaKNsKNMNZupLQ2Y",
  "access_expires_at": "2026-10-28T14:17:14.931596724Z",
  "refresh_token": "3CPW6lPvj9KQZ7GrWi5EbGHL6C1M9LmeVyhzH54aoFw",
  "refresh_expires_at": "2026-11-27T14:02:14.931054512Z",
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
  "command_id": "ce1df350-09f8-4cf3-8fc4-315bb73fd33f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:02:15Z",
    "sequence": 1793196135308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "e061fe94-d3f3-4f73-8e00-73394cd72eec",
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
  "last_heartbeat_at": "2026-10-28T14:02:15.324126Z",
  "last_location_at": "2026-10-28T14:02:15.324126Z",
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
  "session_id": "e061fe94-d3f3-4f73-8e00-73394cd72eec",
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
  "last_heartbeat_at": "2026-10-28T14:02:15.324126Z",
  "last_location_at": "2026-10-28T14:02:15.324126Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e061fe94-d3f3-4f73-8e00-73394cd72eec/close` → **200**

```json
{
  "command_id": "b6aeff27-a743-430c-b1d7-9dc53c88db74",
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
  "correlation_id": "e9bacea5-24d5-46d8-afab-c0d6fea4ae9c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673654987",
  "device_ref": "sandbox-11507"
}
```

```json
{
  "challenge_id": "0811c159-f531-409e-a283-5aa89c9db473",
  "expires_at": "2026-10-28T14:07:16.32350847Z",
  "resend_available_at": "2026-10-28T14:02:17.32350847Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673654987` → **200**

```json
{
  "phone": "+380673654987",
  "audience": "CLIENT",
  "code": "309669",
  "sent_at": "2026-10-28T14:02:16.325457244Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0811c159-f531-409e-a283-5aa89c9db473",
  "code": "309669",
  "device_ref": "sandbox-11507"
}
```

```json
{
  "session_id": "6bea4729-9e47-4091-b1d1-e5ffd5e3944f",
  "subject": {
    "type": "CLIENT",
    "id": "8e18afde-6cdb-4a99-ad17-0ced000c880a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZTE4YWZkZS02Y2RiLTRhOTktYWQxNy0wY2VkMDAwYzg4MGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMTk3MDM2LCJpYXQiOjE3OTMxOTYxMzYsImp0aSI6IjY4MDkzMTBmLTllNmItNGQ1YS04ZWVjLWNjMzg0N2Q2MGE1YSIsInNpZCI6IjZiZWE0NzI5LTllNDctNDA5MS1iMWQxLWU1ZmZkNWUzOTQ0ZiJ9.3F_t9hEGLzie4m9eiSHF2713SjgRpwyVdtlgV42q7x8",
  "access_expires_at": "2026-10-28T14:17:16.544116392Z",
  "refresh_token": "UW4w2RKuZ47iYHsI1tU4Wl2QkzPApR3oJxsykOFWiL8",
  "refresh_expires_at": "2026-11-27T14:02:16.543486842Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "4e270175-029a-47df-a98f-accfd5dde8c0",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8c080a5f-02ef-4733-97d1-2116d6a419f5",
  "upload_path": "/api/rider/v1/uploads/8c080a5f-02ef-4733-97d1-2116d6a419f5",
  "expires_at": "2026-10-28T14:17:16.74222534Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/8c080a5f-02ef-4733-97d1-2116d6a419f5` → **200**

```json
{
  "file_id": "8c080a5f-02ef-4733-97d1-2116d6a419f5",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "09076e42-4e02-4552-8e27-642ec80bf9a9",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "8c080a5f-02ef-4733-97d1-2116d6a419f5"
  ]
}
```

```json
{
  "id": "8c77e9e7-529e-49fd-868b-f6bb3c82a893",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:02:16.966593Z",
  "updated_at": "2026-10-28T14:02:16.966593Z",
  "messages": [
    {
      "id": "606d6d2d-2ebb-4765-bcad-e5c615553466",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:02:16.967792Z",
      "attachments": [
        {
          "file_id": "8c080a5f-02ef-4733-97d1-2116d6a419f5",
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
  "session_id": "c3d73b95-368d-487d-a9db-6e378302625f",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMzcsImlhdCI6MTc5MzE5NjEzNywianRpIjoiZGEyMzE4MTctNDdkNS00OGMwLTk0YzgtMDQwOTZmNzhiYjhjIiwic2lkIjoiYzNkNzNiOTUtMzY4ZC00ODdkLWE5ZGItNmUzNzgzMDI2MjVmIn0.As6Py2JOa4rI-gsqKweMLARIjQ4ZcmiAzHZ2eoYfbaQ",
  "access_expires_at": "2026-10-28T14:17:17.423431534Z",
  "refresh_token": "JZm6mxsyMaL-CWhjqOGCPOWg6hRLS9AymvdFw-YQ-8Y",
  "refresh_expires_at": "2026-10-29T02:02:17.423025463Z",
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
  "session_id": "08e1032c-0da2-4319-b3c0-97a980728fa8",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMzcsImlhdCI6MTc5MzE5NjEzNywianRpIjoiYTA1YjI1NTQtODkxOC00YzRmLTliNjYtMWYzNzg2NjhjMzVlIiwic2lkIjoiMDhlMTAzMmMtMGRhMi00MzE5LWIzYzAtOTdhOTgwNzI4ZmE4In0.LbCRJwikQAiKT5oWCwTvv8fvxkkYbAVitAa9sNlBJDE",
  "access_expires_at": "2026-10-28T14:17:17.862465232Z",
  "refresh_token": "WVq-xkXfnOIzJ__dNzVJ9A9pM-FxBq0foYTX1YsKhIE",
  "refresh_expires_at": "2026-10-29T02:02:17.862051437Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/8c77e9e7-529e-49fd-868b-f6bb3c82a893/attachments/8c080a5f-02ef-4733-97d1-2116d6a419f5` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "c0ae257e-55c6-4aaa-ad12-0ee39e4d8b36",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "6c0e9e5f-40e3-4674-b83a-6e6957723450",
  "upload_path": "/api/operator/v1/uploads/6c0e9e5f-40e3-4674-b83a-6e6957723450",
  "expires_at": "2026-10-28T14:17:18.07308966Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/6c0e9e5f-40e3-4674-b83a-6e6957723450` → **200**

```json
{
  "file_id": "6c0e9e5f-40e3-4674-b83a-6e6957723450",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/8c77e9e7-529e-49fd-868b-f6bb3c82a893` → **200**

```json
{
  "id": "8c77e9e7-529e-49fd-868b-f6bb3c82a893",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:02:16.966593Z",
  "updated_at": "2026-10-28T14:02:16.966593Z",
  "messages": [
    {
      "id": "606d6d2d-2ebb-4765-bcad-e5c615553466",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:02:16.967792Z",
      "attachments": [
        {
          "file_id": "8c080a5f-02ef-4733-97d1-2116d6a419f5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/8c77e9e7-529e-49fd-868b-f6bb3c82a893/comments` → **200**

```json
{
  "command_id": "7947b0b2-618b-47ae-a590-137a62a1d589",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "6c0e9e5f-40e3-4674-b83a-6e6957723450"
  ]
}
```

```json
{
  "id": "8c77e9e7-529e-49fd-868b-f6bb3c82a893",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:02:16.966593Z",
  "updated_at": "2026-10-28T14:02:18.51092Z",
  "messages": [
    {
      "id": "606d6d2d-2ebb-4765-bcad-e5c615553466",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:02:16.967792Z",
      "attachments": [
        {
          "file_id": "8c080a5f-02ef-4733-97d1-2116d6a419f5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cedecd17-ec5e-47f0-b25c-fff67509966d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "082b7a54-1900-46de-b027-a59df7363721",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:02:18.51061Z",
      "attachments": [
        {
          "file_id": "6c0e9e5f-40e3-4674-b83a-6e6957723450",
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

`GET /api/rider/v1/support/cases/8c77e9e7-529e-49fd-868b-f6bb3c82a893` → **200**

```json
{
  "id": "8c77e9e7-529e-49fd-868b-f6bb3c82a893",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:02:16.966593Z",
  "updated_at": "2026-10-28T14:02:18.51092Z",
  "messages": [
    {
      "id": "606d6d2d-2ebb-4765-bcad-e5c615553466",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "8e18afde-6cdb-4a99-ad17-0ced000c880a",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:02:16.967792Z",
      "attachments": [
        {
          "file_id": "8c080a5f-02ef-4733-97d1-2116d6a419f5",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "cedecd17-ec5e-47f0-b25c-fff67509966d",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:02:18.51061Z",
      "attachments": [
        {
          "file_id": "6c0e9e5f-40e3-4674-b83a-6e6957723450",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/8c77e9e7-529e-49fd-868b-f6bb3c82a893/attachments/6c0e9e5f-40e3-4674-b83a-6e6957723450` → **200**

Done: support case 8c77e9e7-529e-49fd-868b-f6bb3c82a893, rider attachment 8c080a5f-02ef-4733-97d1-2116d6a419f5, operator attachment 6c0e9e5f-40e3-4674-b83a-6e6957723450.

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
  "session_id": "b2214112-e01b-44d5-8ed0-2c9488b668e5",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwMzksImlhdCI6MTc5MzE5NjEzOSwianRpIjoiMDljNzZmMTAtMDhkYy00YTQ5LTgzYWEtNzZkYTQ4NzEwMzZkIiwic2lkIjoiYjIyMTQxMTItZTAxYi00NGQ1LThlZDAtMmM5NDg4YjY2OGU1In0.JLB7IDQQw9QKg34ZE7DB_qBDRQVVDtZ4phV6oCxNzxA",
  "access_expires_at": "2026-10-28T14:17:19.194629543Z",
  "refresh_token": "PSYasadmEsWsyoIR6xvZzIYN8VbTZWKgPnXoeQc439k",
  "refresh_expires_at": "2026-10-29T02:02:19.194007014Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-9275"
}
```

```json
{
  "challenge_id": "a6ada958-8ce8-46c6-9c50-a89f0634be97",
  "expires_at": "2026-10-28T14:07:19.394023649Z",
  "resend_available_at": "2026-10-28T14:02:20.394023649Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "225367",
  "sent_at": "2026-10-28T14:02:19.396207323Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6ada958-8ce8-46c6-9c50-a89f0634be97",
  "code": "225367",
  "device_ref": "sandbox-9275"
}
```

```json
{
  "session_id": "adc3f567-685d-4b5b-bade-fad147b0da0c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzAzOSwiaWF0IjoxNzkzMTk2MTM5LCJqdGkiOiJhZmZhMThlMS1kOGQwLTQ0MGQtOGVjMC1hMmQzN2IxNzgwNjkiLCJzaWQiOiJhZGMzZjU2Ny02ODVkLTRiNWItYmFkZS1mYWQxNDdiMGRhMGMifQ.RW1pEtcm9jmcKY9YpN-sRK-70YufLDwOfGnWUbq-P7g",
  "access_expires_at": "2026-10-28T14:17:19.611347224Z",
  "refresh_token": "csgJ8JqHbrgkYdX4hLUmbb4go78L3ZkqC7MNo0BngJM",
  "refresh_expires_at": "2026-11-27T14:02:19.610818222Z",
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
      "actor_id": "082b7a54-1900-46de-b027-a59df7363721",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:02:11.136915Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "082b7a54-1900-46de-b027-a59df7363721",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:02:12.193723Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "4135753b-c089-4cfb-9b0c-3055cb9d1e67",
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
  "device_ref": "sandbox-14702"
}
```

```json
{
  "challenge_id": "341e4121-0136-42a2-a470-3e0d941926a8",
  "expires_at": "2026-10-28T14:07:20.426652173Z",
  "resend_available_at": "2026-10-28T14:02:21.426652173Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "289552",
  "sent_at": "2026-10-28T14:02:20.428959366Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "341e4121-0136-42a2-a470-3e0d941926a8",
  "code": "289552",
  "device_ref": "sandbox-14702"
}
```

```json
{
  "session_id": "d4f6b248-baf8-462c-9d81-3cd8ca1feee8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzE5NzA0MCwiaWF0IjoxNzkzMTk2MTQwLCJqdGkiOiJhYWU1N2Y3Ny1jNGUzLTRhZjAtYTllMC0xNDFmOTAxZGNhMzMiLCJzaWQiOiJkNGY2YjI0OC1iYWY4LTQ2MmMtOWQ4MS0zY2Q4Y2ExZmVlZTgifQ.aF_VM4bmkOcU87-2dWIvCzOkZ5HwQRySKGFIQI5BUYc",
  "access_expires_at": "2026-10-28T14:17:20.65752148Z",
  "refresh_token": "Ce2AmrsEAZAZ_tjn2gKWLTSPYs99Dh7xCQcCAh0jl_4",
  "refresh_expires_at": "2026-11-27T14:02:20.656904829Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "last_heartbeat_at": "2026-10-28T14:01:53.042225Z",
  "last_location_at": "2026-10-28T14:01:53.042225Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a7e8697d-7054-4f58-8284-d4fd1f6ffce3/handover` → **200**

```json
{
  "command_id": "b2d9ce05-9970-4701-8620-35b674aa841a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
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
  "last_heartbeat_at": "2026-10-28T14:01:53.042225Z",
  "last_location_at": "2026-10-28T14:01:53.042225Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a7e8697d-7054-4f58-8284-d4fd1f6ffce3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:02:21Z",
    "sequence": 1793196141254
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
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
  "last_heartbeat_at": "2026-10-28T14:02:21.27048Z",
  "last_location_at": "2026-10-28T14:02:21.27048Z",
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
  "command_id": "68c29127-d8ab-45bc-b63d-56e83aa73eeb",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:02:21Z",
    "sequence": 1793196141679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aea269cd-ee86-4c39-8186-55191aed29a7",
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
  "last_heartbeat_at": "2026-10-28T14:02:21.695702Z",
  "last_location_at": "2026-10-28T14:02:21.695702Z",
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
  "session_id": "860bb269-fe45-425a-8c53-2cd7cf84028f",
  "subject": {
    "type": "STAFF",
    "id": "082b7a54-1900-46de-b027-a59df7363721"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODJiN2E1NC0xOTAwLTQ2ZGUtYjAyNy1hNTlkZjczNjM3MjEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMxOTcwNDIsImlhdCI6MTc5MzE5NjE0MiwianRpIjoiNjE0MGQ0NDItNGI5OS00YzU5LTkxYjItNWY0NzdhMmNiZjhiIiwic2lkIjoiODYwYmIyNjktZmU0NS00MjVhLThjNTMtMmNkN2NmODQwMjhmIn0.gty4NVze3Io_Q5NnN1WIp1hLnGdd1E3UsPEfIVFvf5Q",
  "access_expires_at": "2026-10-28T14:17:22.173929071Z",
  "refresh_token": "5dsx74jD2MibONpydkg6Uu6TXpRkpqCENgoS33uDLv0",
  "refresh_expires_at": "2026-10-29T02:02:22.173383286Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "efd14d82-6552-45ee-8f80-f989cb3d3a20",
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
  "id": "789c552a-74bd-4260-93c1-5a7ca01f8225",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T14:07:22.382804Z",
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
  "command_id": "ee41b318-ea5e-4c51-8295-70b259031946",
  "quote_id": "789c552a-74bd-4260-93c1-5a7ca01f8225",
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
  "id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
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
  "created_at": "2026-10-28T14:02:22.602697Z",
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
    "id": "f5dfe9bc-4786-4cff-b338-6c2cb35a3154",
    "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
    "expires_at": "2026-10-28T14:02:37.605934Z",
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

`POST /api/driver/v1/offers/f5dfe9bc-4786-4cff-b338-6c2cb35a3154/accept` → **200**

```json
{
  "command_id": "58d5ab1e-80ee-4909-bd32-bd64c741d6b0"
}
```

```json
{
  "id": "a2009ac8-666d-43e6-9de8-3d1b6ca16b1e",
  "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fb7825c5-7c3d-4313-8c0f-704a4e30f56f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fb7825c5-7c3d-4313-8c0f-704a4e30f56f",
  "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
  "assignment_id": "a2009ac8-666d-43e6-9de8-3d1b6ca16b1e",
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

`POST /api/driver/v1/work-sessions/aea269cd-ee86-4c39-8186-55191aed29a7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:02:23Z",
    "sequence": 1793196143632
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "aea269cd-ee86-4c39-8186-55191aed29a7",
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
  "last_heartbeat_at": "2026-10-28T14:02:23.649898Z",
  "last_location_at": "2026-10-28T14:02:23.649898Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fb7825c5-7c3d-4313-8c0f-704a4e30f56f/arrive` → **200**

```json
{
  "command_id": "0f90f855-2891-4285-9332-bd662598c012",
  "expected_version": 0
}
```

```json
{
  "id": "fb7825c5-7c3d-4313-8c0f-704a4e30f56f",
  "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
  "assignment_id": "a2009ac8-666d-43e6-9de8-3d1b6ca16b1e",
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
  "arrived_at": "2026-10-28T14:02:23.866551Z",
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

`POST /api/driver/v1/trips/fb7825c5-7c3d-4313-8c0f-704a4e30f56f/start` → **200**

```json
{
  "command_id": "ccc3f43b-3388-49ca-9e01-1002054f15a3",
  "expected_version": 1
}
```

```json
{
  "id": "fb7825c5-7c3d-4313-8c0f-704a4e30f56f",
  "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
  "assignment_id": "a2009ac8-666d-43e6-9de8-3d1b6ca16b1e",
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
  "arrived_at": "2026-10-28T14:02:23.866551Z",
  "started_at": "2026-10-28T14:02:24.087294Z",
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

`POST /api/driver/v1/trips/fb7825c5-7c3d-4313-8c0f-704a4e30f56f/complete` → **200**

```json
{
  "command_id": "e86579f8-22e4-4552-92f5-7308ab8c01ea",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:02:24Z",
  "cash_received": true
}
```

```json
{
  "id": "fb7825c5-7c3d-4313-8c0f-704a4e30f56f",
  "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
  "assignment_id": "a2009ac8-666d-43e6-9de8-3d1b6ca16b1e",
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
  "arrived_at": "2026-10-28T14:02:23.866551Z",
  "started_at": "2026-10-28T14:02:24.087294Z",
  "completed_at": "2026-10-28T14:02:24.309051Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/1ff8be5a-6976-4bf1-afa4-53e0a190282a` → **200**

```json
{
  "id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
  "short_number": 18,
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
    "id": "a2009ac8-666d-43e6-9de8-3d1b6ca16b1e",
    "order_id": "1ff8be5a-6976-4bf1-afa4-53e0a190282a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "fb7825c5-7c3d-4313-8c0f-704a4e30f56f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:02:22.602697Z",
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
  "session_id": "a7e8697d-7054-4f58-8284-d4fd1f6ffce3",
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
  "last_heartbeat_at": "2026-10-28T14:02:21.27048Z",
  "last_location_at": "2026-10-28T14:02:21.27048Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a7e8697d-7054-4f58-8284-d4fd1f6ffce3/close` → **200**

```json
{
  "command_id": "119f0dd9-8c35-4a01-84e6-519bb5c060db",
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
  "session_id": "aea269cd-ee86-4c39-8186-55191aed29a7",
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
  "last_heartbeat_at": "2026-10-28T14:02:23.649898Z",
  "last_location_at": "2026-10-28T14:02:23.649898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aea269cd-ee86-4c39-8186-55191aed29a7/close` → **200**

```json
{
  "command_id": "da51dba3-dc03-4f12-9ede-c33cb9dce700",
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

Done: terminal order 1ff8be5a-6976-4bf1-afa4-53e0a190282a by Andrii (5a000000-0000-4000-8000-000000000403).
