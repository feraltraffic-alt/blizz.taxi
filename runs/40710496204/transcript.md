# Sandbox transcript (2026-10-28T14:54:51Z, 1e37727)

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
  "correlation_id": "725d908a-1582-4887-8c8e-f9701c9b8c83"
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
  "session_id": "cc9ee81a-90ad-4a50-a8bb-84401f690181",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAxOTcsImlhdCI6MTc5MzE5OTI5NywianRpIjoiYzgxOTAwMTgtNGRjZS00MmVmLThjYjgtNjQ1ZGE1NmM5MzJiIiwic2lkIjoiY2M5ZWU4MWEtOTBhZC00YTUwLWE4YmItODQ0MDFmNjkwMTgxIn0.9Kcf3w-_-Sr0yUPvMeRs3QwXYGYANA7QCYhMpSYfVt4",
  "access_expires_at": "2026-10-28T15:09:57.479914918Z",
  "refresh_token": "zFDEmQh0T15EHpZ2mykB1J5wzWoXTRVB5_nQnIQQpZ4",
  "refresh_expires_at": "2026-10-29T02:54:57.477936298Z",
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
  "session_id": "9b9a1150-8687-45d4-8c3b-7f82e5e6a549",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAxOTksImlhdCI6MTc5MzE5OTI5OSwianRpIjoiYTkwYjM2M2EtZGU5Ni00OTcyLThiNWItMTVkYjVlZWExMTlhIiwic2lkIjoiOWI5YTExNTAtODY4Ny00NWQ0LThjM2ItN2Y4MmU1ZTZhNTQ5In0.enbsGeCRcCGgz4ogZ3KRCz4HwLhu5mILHKG_WUd8h8A",
  "access_expires_at": "2026-10-28T15:09:59.003206177Z",
  "refresh_token": "xi1aQqcCJ9AkGK30viXmCX7BNZoUfbXqD4Zyg6ak_pY",
  "refresh_expires_at": "2026-10-29T02:54:59.00220284Z",
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

`POST /api/admin/v1/settings` → **400**

```json
{
  "command_id": "e3dabdef-e2fc-4349-a4c2-50ee49ed75e3",
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
    "app_versions": {
      "driver_android": {
        "minimum_version": "9.0.0"
      }
    }
  },
  "reason": "Sandbox: force update"
}
```

```json
{
  "instance": "/api/admin/v1/settings",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9106318b-13bc-4b6e-8db7-68b8efcb03ef"
}
```

**Expected 200, got 400 — scenario stopped.**

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

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "27242a3c-f735-4ecb-b8c6-0457b255954c",
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
  "reason": "Sandbox clean-up"
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
  "changed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T14:55:00.193124605Z"
}
```

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
  "session_id": "67bf0121-03a8-488f-883c-818db5c4228f",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMDAsImlhdCI6MTc5MzE5OTMwMCwianRpIjoiNzBiZThmMjEtY2IwMS00MjQwLWIwNWMtNjdiZmFhODQ5ZTRkIiwic2lkIjoiNjdiZjAxMjEtMDNhOC00ODhmLTg4M2MtODE4ZGI1YzQyMjhmIn0.OMguWWMN0hTtn2H8PSVHfSvrRk-5A9BPyB_1FLYQnoI",
  "access_expires_at": "2026-10-28T15:10:00.781497848Z",
  "refresh_token": "ef5fuDLQ1yW62RtxHPnFgtGXvMr1HPCOsn0H-o-aEdc",
  "refresh_expires_at": "2026-10-29T02:55:00.780487749Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "424cf647-5dbf-457b-97e8-46d5fd524889",
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
  "id": "cffd2ff7-7900-416b-839f-7682c8efd109",
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
  "created_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "created_at": "2026-10-28T14:55:01.062297Z",
  "updated_at": "2026-10-28T14:55:01.062297Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632070920",
  "device_ref": "sandbox-28922"
}
```

```json
{
  "challenge_id": "20bf1654-5ebd-4c63-bd68-b4e4a95e5d7e",
  "expires_at": "2026-10-28T15:00:01.359064928Z",
  "resend_available_at": "2026-10-28T14:55:02.359064928Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632070920` → **200**

```json
{
  "phone": "+380632070920",
  "audience": "CLIENT",
  "code": "010255",
  "sent_at": "2026-10-28T14:55:01.367575598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "20bf1654-5ebd-4c63-bd68-b4e4a95e5d7e",
  "code": "010255",
  "device_ref": "sandbox-28922"
}
```

```json
{
  "session_id": "38600e93-d7b2-48cd-9140-a57204b91686",
  "subject": {
    "type": "CLIENT",
    "id": "1568a764-6a8c-4b86-addc-a21fbe0151e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTY4YTc2NC02YThjLTRiODYtYWRkYy1hMjFmYmUwMTUxZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjAxLCJpYXQiOjE3OTMxOTkzMDEsImp0aSI6IjcyMTFkODBiLWUyYmQtNDZjYi1hMGYwLWU4NjYxZTFjYzNhYSIsInNpZCI6IjM4NjAwZTkzLWQ3YjItNDhjZC05MTQwLWE1NzIwNGI5MTY4NiJ9.oyPEiiUFkyVZnkrtPGA7HARHmB70e1SVG3Kp1KQS7TQ",
  "access_expires_at": "2026-10-28T15:10:01.709247283Z",
  "refresh_token": "AQ49sfhJc0ehOBStccqI9GUIWsVYHf-4vXyxmwki0yQ",
  "refresh_expires_at": "2026-11-27T14:55:01.707989469Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380632070920` → **200**

```json
{
  "client_id": "1568a764-6a8c-4b86-addc-a21fbe0151e2"
}
```

`POST /api/admin/v1/rider-wallets/1568a764-6a8c-4b86-addc-a21fbe0151e2/top-ups` → **201**

```json
{
  "command_id": "7a7b176d-cd00-410b-bc8d-0a1db25f0659",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "1568a764-6a8c-4b86-addc-a21fbe0151e2",
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
      "id": "080d0b8b-8e1a-4809-8a1d-e6245120f953",
      "at": "2026-10-28T14:55:02.259537Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4d61fe44-e4f1-4d16-b54f-0c156ae61a04",
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
  "id": "82f70d86-efea-4f61-b2ae-a9e88f434db6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:02.601159Z",
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
      "id": "cffd2ff7-7900-416b-839f-7682c8efd109",
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
  "device_ref": "sandbox-6442"
}
```

```json
{
  "challenge_id": "5665c377-1d3a-43cf-8821-543f30af5e27",
  "expires_at": "2026-10-28T15:00:02.906084986Z",
  "resend_available_at": "2026-10-28T14:55:03.906084986Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "359275",
  "sent_at": "2026-10-28T14:55:02.909910861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5665c377-1d3a-43cf-8821-543f30af5e27",
  "code": "359275",
  "device_ref": "sandbox-6442"
}
```

```json
{
  "session_id": "b4ef87ed-4180-4b70-899a-99c58b363ae8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDIwMywiaWF0IjoxNzkzMTk5MzAzLCJqdGkiOiIyYzMwZDQxNS1jMWVkLTQwNzUtYWFmOC1mNzQxZGFiZmYzMzMiLCJzaWQiOiJiNGVmODdlZC00MTgwLTRiNzAtODk5YS05OWM1OGIzNjNhZTgifQ.aJz8syixk2NY7Ee0fx8AwyZ2T_WXLNyunZVhiWfMmQA",
  "access_expires_at": "2026-10-28T15:10:03.201413883Z",
  "refresh_token": "-55aPcW9g_TxtOUJRgCvNTgRg9jaa_a0B6dE5cPSU4A",
  "refresh_expires_at": "2026-11-27T14:55:03.200278349Z",
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
  "command_id": "7670fa5a-0025-46ff-9386-e6a2972d4126",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:03Z",
    "sequence": 1793199303740
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9aa29def-35b2-49aa-a5a7-fca3eade8244",
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
  "last_heartbeat_at": "2026-10-28T14:55:03.783827Z",
  "last_location_at": "2026-10-28T14:55:03.783827Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "3ea9553d-0526-4acb-9ccf-de2a9432fa9a",
  "quote_id": "82f70d86-efea-4f61-b2ae-a9e88f434db6",
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
  "id": "d343903a-f4a9-493f-ba09-f615541b178e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1568a764-6a8c-4b86-addc-a21fbe0151e2",
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
  "created_at": "2026-10-28T14:55:04.108086Z",
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
  "client_id": "1568a764-6a8c-4b86-addc-a21fbe0151e2",
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
      "id": "080d0b8b-8e1a-4809-8a1d-e6245120f953",
      "at": "2026-10-28T14:55:02.259537Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
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
    "id": "e956e1c2-b135-4d82-acef-e2099173c4d5",
    "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
    "expires_at": "2026-10-28T14:55:19.122711Z",
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

`POST /api/driver/v1/offers/e956e1c2-b135-4d82-acef-e2099173c4d5/accept` → **200**

```json
{
  "command_id": "73485ebe-8b13-4431-9cbf-8a88e664a9f7"
}
```

```json
{
  "id": "ad7c23fb-46f1-43d3-b470-4329ce971caa",
  "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8e49cc38-27db-40c1-ad4f-bab220734c73",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8e49cc38-27db-40c1-ad4f-bab220734c73",
  "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
  "assignment_id": "ad7c23fb-46f1-43d3-b470-4329ce971caa",
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

`POST /api/driver/v1/work-sessions/9aa29def-35b2-49aa-a5a7-fca3eade8244/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:05Z",
    "sequence": 1793199305510
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9aa29def-35b2-49aa-a5a7-fca3eade8244",
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
  "last_heartbeat_at": "2026-10-28T14:55:05.535256Z",
  "last_location_at": "2026-10-28T14:55:05.535256Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/8e49cc38-27db-40c1-ad4f-bab220734c73/arrive` → **200**

```json
{
  "command_id": "24c4b6ac-eb2d-4663-8f8b-10795e10eba6",
  "expected_version": 0
}
```

```json
{
  "id": "8e49cc38-27db-40c1-ad4f-bab220734c73",
  "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
  "assignment_id": "ad7c23fb-46f1-43d3-b470-4329ce971caa",
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
  "arrived_at": "2026-10-28T14:55:05.820767Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/8e49cc38-27db-40c1-ad4f-bab220734c73/start` → **200**

```json
{
  "command_id": "c9dc5cd0-7eb4-4507-bf4f-88a63a60077b",
  "expected_version": 1
}
```

```json
{
  "id": "8e49cc38-27db-40c1-ad4f-bab220734c73",
  "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
  "assignment_id": "ad7c23fb-46f1-43d3-b470-4329ce971caa",
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
  "arrived_at": "2026-10-28T14:55:05.820767Z",
  "started_at": "2026-10-28T14:55:06.116993Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/8e49cc38-27db-40c1-ad4f-bab220734c73/complete` → **200**

```json
{
  "command_id": "3e7dd3f8-2c9b-4755-b053-a1126e32886f",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:55:06Z",
  "cash_received": true
}
```

```json
{
  "id": "8e49cc38-27db-40c1-ad4f-bab220734c73",
  "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
  "assignment_id": "ad7c23fb-46f1-43d3-b470-4329ce971caa",
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
  "arrived_at": "2026-10-28T14:55:05.820767Z",
  "started_at": "2026-10-28T14:55:06.116993Z",
  "completed_at": "2026-10-28T14:55:06.444511Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "1568a764-6a8c-4b86-addc-a21fbe0151e2",
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
      "id": "1a22ef38-a4ae-47b2-99f9-b869e7a2d80d",
      "at": "2026-10-28T14:55:07.115352Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "d343903a-f4a9-493f-ba09-f615541b178e"
    },
    {
      "id": "080d0b8b-8e1a-4809-8a1d-e6245120f953",
      "at": "2026-10-28T14:55:02.259537Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cffd2ff7-7900-416b-839f-7682c8efd109/archive` → **200**

```json
{
  "command_id": "f60919f7-0ff1-4b2a-8354-760d5e1d0d12",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cffd2ff7-7900-416b-839f-7682c8efd109",
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
  "created_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "created_at": "2026-10-28T14:55:01.062297Z",
  "updated_at": "2026-10-28T14:55:10.04966Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9aa29def-35b2-49aa-a5a7-fca3eade8244",
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
  "last_heartbeat_at": "2026-10-28T14:55:05.535256Z",
  "last_location_at": "2026-10-28T14:55:05.535256Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9aa29def-35b2-49aa-a5a7-fca3eade8244/close` → **200**

```json
{
  "command_id": "a4b05e25-2708-4e9e-8ae4-8dd9bd5dac76",
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

Done: order d343903a-f4a9-493f-ba09-f615541b178e.

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
  "session_id": "43fb81de-90f4-4a42-b5c1-e9b342a07d18",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMTEsImlhdCI6MTc5MzE5OTMxMSwianRpIjoiMWM5OGQ3MzAtNWMwMC00MmU0LWI5YTAtMmZlMGExMGJkY2RkIiwic2lkIjoiNDNmYjgxZGUtOTBmNC00YTQyLWI1YzEtZTliMzQyYTA3ZDE4In0.AwhFaVkXdvVar8QyfvjyYEVXcSh4KTIVQd3NjqFT7Fs",
  "access_expires_at": "2026-10-28T15:10:11.181740285Z",
  "refresh_token": "Yism1T9rVhus_eldhh1BuabbL6gnuBlav8rjsfz8__A",
  "refresh_expires_at": "2026-10-29T02:55:11.181054075Z",
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
  "command_id": "6fb1eef6-70b7-49ca-a3d6-6d3ab7d6f09e",
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
  "session_id": "dae473cb-141a-47b7-afc5-4b68f3bb3db7",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMTIsImlhdCI6MTc5MzE5OTMxMiwianRpIjoiZGMxMGFjOTMtOTU2My00ZGI1LTk2ZWQtNGIxMjkwZjQzNjk1Iiwic2lkIjoiZGFlNDczY2ItMTQxYS00N2I3LWFmYzUtNGI2OGYzYmIzZGI3In0.FUquQfIFRcftb_tPsd31OCSgHfScu0xso9Z6AbnFeoQ",
  "access_expires_at": "2026-10-28T15:10:12.288714754Z",
  "refresh_token": "EjVP8_kJDTOo1ECGBd6njZg3uluJaYG8tobe1rl3rrE",
  "refresh_expires_at": "2026-10-29T02:55:12.287910203Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.325262130",
    "linkedid": "1730052700.325262130",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670705825"
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
    "id": "1730052700.325262130",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "28e64327-b430-4333-91a6-d9dbe5234be6",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.558443Z",
      "answered_at": null,
      "ended_at": "2026-10-28T14:55:12.58255Z",
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
    "id": "1730052600.12488067",
    "linkedid": "1730052600.12488067",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670705825"
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
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/c68709ee-8ddf-4c76-9dbe-dea9fc63f818/answer` → **200**

```json
{
  "command_id": "5507ed3b-5197-4e64-a2c0-ee1da561d1c9"
}
```

```json
{
  "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670705825",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "order_ids": [],
  "started_at": "2026-10-28T14:55:12.883906Z",
  "answered_at": "2026-10-28T14:55:13.189055Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.12488067",
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
    "id": "1730052600.12488067",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": "2026-10-28T14:55:13.189055Z",
      "ended_at": "2026-10-28T14:55:13.475573Z",
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
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": "2026-10-28T14:55:13.189055Z",
      "ended_at": "2026-10-28T14:55:13.475573Z",
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
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": "2026-10-28T14:55:13.189055Z",
      "ended_at": "2026-10-28T14:55:13.475573Z",
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
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": "2026-10-28T14:55:13.189055Z",
      "ended_at": "2026-10-28T14:55:13.475573Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:55:19.899594Z"
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
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": "2026-10-28T14:55:13.189055Z",
      "ended_at": "2026-10-28T14:55:13.475573Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:55:19.899594Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/c68709ee-8ddf-4c76-9dbe-dea9fc63f818/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/c68709ee-8ddf-4c76-9dbe-dea9fc63f818/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=c68709ee-8ddf-4c76-9dbe-dea9fc63f818` → **200**

```json
{
  "changes": [
    {
      "id": "28df6a6e-7ce0-4e51-8c3b-33ddfdaac0dc",
      "occurred_at": "2026-10-28T14:55:20.890909Z",
      "actor_type": "STAFF",
      "actor_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7d7049b9-8fcc-4fd2-a2f3-c0e23ec3c218\", \"order_ids\": []}",
      "correlation_id": "9f542396-fc8b-42ac-8a3b-556dc6bd9069"
    },
    {
      "id": "ef1aaf98-16c5-48ac-87db-ed8c6d0fea7d",
      "occurred_at": "2026-10-28T14:55:20.854718Z",
      "actor_type": "STAFF",
      "actor_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"7d7049b9-8fcc-4fd2-a2f3-c0e23ec3c218\", \"order_ids\": []}",
      "correlation_id": "b68c11a2-6766-4086-ae8e-e0d9f5d7a3b8"
    }
  ]
}
```

Done: call c68709ee-8ddf-4c76-9dbe-dea9fc63f818 recorded, listened to twice.

# Scenario: cancellations

## Reasons each side can choose from

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639690518",
  "device_ref": "sandbox-18737"
}
```

```json
{
  "challenge_id": "89280e90-1f94-4b25-9d1e-decaf2d71b51",
  "expires_at": "2026-10-28T15:00:21.205833881Z",
  "resend_available_at": "2026-10-28T14:55:22.205833881Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639690518` → **200**

```json
{
  "phone": "+380639690518",
  "audience": "CLIENT",
  "code": "170380",
  "sent_at": "2026-10-28T14:55:21.209400312Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89280e90-1f94-4b25-9d1e-decaf2d71b51",
  "code": "170380",
  "device_ref": "sandbox-18737"
}
```

```json
{
  "session_id": "0625577f-6e9a-41ac-af3b-4f8683cfb257",
  "subject": {
    "type": "CLIENT",
    "id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzhlYjdiOC1hZmZkLTQ1Y2ItOTU5My1mNTc2MmQxMzMwZjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjIxLCJpYXQiOjE3OTMxOTkzMjEsImp0aSI6IjY5MDRmOGUwLWU4ZTktNDM2NS05N2IzLWI5MGRhZTI4YTRkMCIsInNpZCI6IjA2MjU1NzdmLTZlOWEtNDFhYy1hZjNiLTRmODY4M2NmYjI1NyJ9.MbvO7DT5dwa2k8eVd_DV4FnZcfMz0EXYqvfI7Dh8480",
  "access_expires_at": "2026-10-28T15:10:21.495065232Z",
  "refresh_token": "lAt0qDiFm1-r0_wm_IRzF_bDaymZGHNLblPZhFTG9_4",
  "refresh_expires_at": "2026-11-27T14:55:21.49440519Z",
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
        "ru": "Передумал ехать",
        "en": "Changed my mind",
        "uk": "Передумав їхати"
      },
      "driver_outcome": null
    },
    {
      "code": "WAIT_TOO_LONG",
      "labels": {
        "pl": "Zbyt długie oczekiwanie",
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      },
      "driver_outcome": null
    },
    {
      "code": "WRONG_ADDRESS",
      "labels": {
        "pl": "Błędny adres",
        "ru": "Ошибся адресом",
        "en": "Wrong address",
        "uk": "Помилився адресою"
      },
      "driver_outcome": null
    },
    {
      "code": "OTHER_TRANSPORT",
      "labels": {
        "pl": "Inny transport",
        "ru": "Уеду на другом транспорте",
        "en": "Found other transport",
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
  "device_ref": "sandbox-9699"
}
```

```json
{
  "challenge_id": "316a2fff-a02d-4f3c-af27-30850e780d00",
  "expires_at": "2026-10-28T15:00:22.02025646Z",
  "resend_available_at": "2026-10-28T14:55:23.02025646Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "773370",
  "sent_at": "2026-10-28T14:55:22.023466272Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "316a2fff-a02d-4f3c-af27-30850e780d00",
  "code": "773370",
  "device_ref": "sandbox-9699"
}
```

```json
{
  "session_id": "8d198f7c-9285-46f3-b4a8-88a5c35d6cab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDIyMiwiaWF0IjoxNzkzMTk5MzIyLCJqdGkiOiJkZDZkY2Y3Yy0zYmI5LTQxNGItODAyOS1kNzM1MzM5M2QxMTQiLCJzaWQiOiI4ZDE5OGY3Yy05Mjg1LTQ2ZjMtYjRhOC04OGE1YzM1ZDZjYWIifQ.S9CjYrEqUgCgEuof1MT8Yld1haIJkUMJ3d1gbMM3X5A",
  "access_expires_at": "2026-10-28T15:10:22.32380774Z",
  "refresh_token": "aW0EHy_-NR9s56BXELfDpyF9xYUk9Ht3rFN6l-6XmVk",
  "refresh_expires_at": "2026-11-27T14:55:22.323143282Z",
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
        "ru": "Пассажир не вышел",
        "en": "Passenger did not show up",
        "uk": "Пасажир не вийшов"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "PASSENGER_ASKED",
      "labels": {
        "pl": "Pasażer poprosił o anulowanie",
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      },
      "driver_outcome": "CANCEL_ORDER"
    },
    {
      "code": "VEHICLE_PROBLEM",
      "labels": {
        "pl": "Awaria samochodu",
        "ru": "Неисправность автомобиля",
        "en": "Vehicle problem",
        "uk": "Несправність автомобіля"
      },
      "driver_outcome": "RETURN_TO_SEARCH"
    },
    {
      "code": "CANNOT_REACH",
      "labels": {
        "pl": "Nie mogę dojechać",
        "ru": "Не могу подъехать",
        "en": "Cannot reach the pickup",
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
  "session_id": "a800b712-887d-41ba-9e00-d95507563783",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMjMsImlhdCI6MTc5MzE5OTMyMywianRpIjoiMDliZTQyMjgtZDdkNS00YmNkLWFlYTAtNWI5ZmE4YzhmMGZlIiwic2lkIjoiYTgwMGI3MTItODg3ZC00MWJhLTllMDAtZDk1NTA3NTYzNzgzIn0.ZQWUodBrxSZJxEA0SpXjip_q1-JAYeMSubGYw9_3Pxs",
  "access_expires_at": "2026-10-28T15:10:23.135666984Z",
  "refresh_token": "zxSbO4lIBFVsZy_eK50-pdOw6IWEC6yP7AUgEdK1Q9Q",
  "refresh_expires_at": "2026-10-29T02:55:23.134946177Z",
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
  "session_id": "c2d65c0c-d989-4488-ba05-0b02a98ef5fb",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyMjMsImlhdCI6MTc5MzE5OTMyMywianRpIjoiMTQzYzk4ZjgtYmIwNS00ODhkLTkxMjUtYTAyNDMxMGQ5ZWU1Iiwic2lkIjoiYzJkNjVjMGMtZDk4OS00NDg4LWJhMDUtMGIwMmE5OGVmNWZiIn0.tz2EHfAxiDOhAck73sBXJWl2TV0j1KCQerZG_m7qB3I",
  "access_expires_at": "2026-10-28T15:10:23.68569206Z",
  "refresh_token": "lkAT3w5xCz-sBz_tbvBPb11i-TjrZP-34ZXI5UGNKcc",
  "refresh_expires_at": "2026-10-29T02:55:23.6850471Z",
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
        "ru": "Пассажир попросил",
        "en": "Passenger asked",
        "uk": "Пасажир попросив"
      },
      "driver_outcome": null
    },
    {
      "code": "DUPLICATE",
      "labels": {
        "pl": "Duplikat zamówienia",
        "ru": "Дубль заказа",
        "en": "Duplicate order",
        "uk": "Дубль замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "NO_CARS",
      "labels": {
        "pl": "Brak wolnych aut",
        "ru": "Нет свободных машин",
        "en": "No cars available",
        "uk": "Немає вільних авто"
      },
      "driver_outcome": null
    },
    {
      "code": "TEST_ORDER",
      "labels": {
        "pl": "Zamówienie testowe",
        "ru": "Тестовый заказ",
        "en": "Test order",
        "uk": "Тестове замовлення"
      },
      "driver_outcome": null
    },
    {
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "ru": "Ошибка оператора",
        "en": "Operator error",
        "uk": "Помилка оператора"
      },
      "driver_outcome": null
    },
    {
      "code": "VEHICLE_BREAKDOWN",
      "labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      },
      "driver_outcome": null
    },
    {
      "code": "ACCIDENT",
      "labels": {
        "pl": "Wypadek",
        "ru": "ДТП",
        "en": "Accident",
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
  "command_id": "873b231e-b304-4a5d-af18-165281396d9f",
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
  "id": "ad15b917-d6e7-449f-915f-ab2c8cde90ed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:24.217007Z",
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
  "command_id": "e337dd7e-f1f8-4b46-b10a-81623a0c6cb3",
  "quote_id": "ad15b917-d6e7-449f-915f-ab2c8cde90ed",
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
  "id": "43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7",
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
  "created_at": "2026-10-28T14:55:24.498433Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7` → **200**

```json
{
  "id": "43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7",
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
  "created_at": "2026-10-28T14:55:24.498433Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7/cancel` → **200**

```json
{
  "command_id": "f1541ed9-f7ef-456b-9dea-7493f0e422e0",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7",
  "short_number": 2,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7",
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
  "created_at": "2026-10-28T14:55:24.498433Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "WAIT_TOO_LONG",
    "reason_labels": {
      "pl": "Zbyt długie oczekiwanie",
      "ru": "Долго ждать машину",
      "en": "The wait is too long",
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
  "command_id": "97313c11-6652-4863-9b30-742f4c360ba4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:25Z",
    "sequence": 1793199325624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "23ca70d4-9b33-4009-be2b-4d4741cf9bbb",
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
  "last_heartbeat_at": "2026-10-28T14:55:25.644981Z",
  "last_location_at": "2026-10-28T14:55:25.644981Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-30804"
}
```

```json
{
  "challenge_id": "300f27af-b85c-4e59-95bc-f68ef2438dc7",
  "expires_at": "2026-10-28T15:00:25.910422603Z",
  "resend_available_at": "2026-10-28T14:55:26.910422603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "601289",
  "sent_at": "2026-10-28T14:55:25.913984829Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "300f27af-b85c-4e59-95bc-f68ef2438dc7",
  "code": "601289",
  "device_ref": "sandbox-30804"
}
```

```json
{
  "session_id": "62350a06-d771-4695-859b-53de734bf6bc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDIyNiwiaWF0IjoxNzkzMTk5MzI2LCJqdGkiOiIyZWI2MTNmZi0zNWYwLTRkMjMtOGNlYS1iNzNjYjZjNmFiYjgiLCJzaWQiOiI2MjM1MGEwNi1kNzcxLTQ2OTUtODU5Yi01M2RlNzM0YmY2YmMifQ.u8aP-3EVG3WOtMBsDAW8OIKQxoV3y0VCVbPDpGHKzRg",
  "access_expires_at": "2026-10-28T15:10:26.207437521Z",
  "refresh_token": "f9O4WQzS9m7qjHe3Bl-KIWCMcPJha1xzYeTWBXebLPk",
  "refresh_expires_at": "2026-11-27T14:55:26.206641666Z",
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
  "command_id": "09464090-b473-4292-85d8-b97831ca174a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:26Z",
    "sequence": 1793199326736
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41eec519-eae1-4a93-a8f3-a8f3725afd13",
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
  "last_heartbeat_at": "2026-10-28T14:55:26.757281Z",
  "last_location_at": "2026-10-28T14:55:26.757281Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5f59de08-8a8e-4ded-858a-95fe942b97f0",
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
  "id": "342640d8-16df-4c06-969e-89e348739af8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:27.047533Z",
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
  "command_id": "aed3bc62-c032-4c2d-bfa6-2ec2904b3fba",
  "quote_id": "342640d8-16df-4c06-969e-89e348739af8",
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
  "id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7",
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
  "created_at": "2026-10-28T14:55:27.336446Z",
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
    "id": "738196c7-d0a6-4953-99ea-eb93acac8727",
    "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
    "expires_at": "2026-10-28T14:55:42.340358Z",
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

`POST /api/driver/v1/offers/738196c7-d0a6-4953-99ea-eb93acac8727/accept` → **200**

```json
{
  "command_id": "66346d5a-6a79-4ed9-848f-6c74fb9e39a5"
}
```

```json
{
  "id": "fbfe8a53-c980-44a3-bb91-258378029f9a",
  "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4cd28af-3c6a-432f-b3c5-7b4a1ce7cc8a",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4cd28af-3c6a-432f-b3c5-7b4a1ce7cc8a",
  "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "assignment_id": "fbfe8a53-c980-44a3-bb91-258378029f9a",
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

`POST /api/driver/v1/trips/f4cd28af-3c6a-432f-b3c5-7b4a1ce7cc8a/cancel` → **200**

```json
{
  "command_id": "f30b7d15-d96d-48ce-8978-aff040de1258",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "f4cd28af-3c6a-432f-b3c5-7b4a1ce7cc8a",
  "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "assignment_id": "fbfe8a53-c980-44a3-bb91-258378029f9a",
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

`GET /api/rider/v1/orders/9b6ade3f-62e5-4d73-a201-62d138b32183` → **200**

```json
{
  "id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "short_number": 3,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7",
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
    "id": "fbfe8a53-c980-44a3-bb91-258378029f9a",
    "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "f4cd28af-3c6a-432f-b3c5-7b4a1ce7cc8a",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:55:27.336446Z",
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
    "id": "739cf8d0-9613-4234-ad88-5c67345e9457",
    "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
    "expires_at": "2026-10-28T14:55:43.453271Z",
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

`POST /api/driver/v1/offers/739cf8d0-9613-4234-ad88-5c67345e9457/accept` → **200**

```json
{
  "command_id": "22736cc3-693f-4fbd-88d6-9d9c0ef38410"
}
```

```json
{
  "id": "61d23ae2-d786-4734-bd55-47ae66f1b995",
  "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "39e066bf-ec26-4485-9c35-688cdd17f3db",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "39e066bf-ec26-4485-9c35-688cdd17f3db",
  "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "assignment_id": "61d23ae2-d786-4734-bd55-47ae66f1b995",
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

`POST /api/driver/v1/trips/39e066bf-ec26-4485-9c35-688cdd17f3db/cancel` → **200**

```json
{
  "command_id": "793ed1d8-7a76-4945-909c-11ab0054f65d",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "39e066bf-ec26-4485-9c35-688cdd17f3db",
  "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
  "assignment_id": "61d23ae2-d786-4734-bd55-47ae66f1b995",
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
    "id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
    "short_number": 3,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:55:27.336446Z",
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
        "ru": "Пассажир попросил отменить",
        "en": "Passenger asked to cancel",
        "uk": "Пасажир попросив скасувати"
      }
    },
    "pickup_at": null
  },
  {
    "id": "43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7",
    "short_number": 2,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:55:24.498433Z",
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
        "ru": "Долго ждать машину",
        "en": "The wait is too long",
        "uk": "Довго чекати авто"
      }
    },
    "pickup_at": null
  }
]
```

`GET /api/operator/v1/orders/9b6ade3f-62e5-4d73-a201-62d138b32183/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:55:27.337083Z",
      "actor": {
        "type": "CLIENT",
        "id": "8c8eb7b8-affd-45cb-9593-f5762d1330f7",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
        "quote_id": "342640d8-16df-4c06-969e-89e348739af8",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "ccdda50a-1391-4d27-be3c-d16004116e5b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:55:27.339335Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
        "attempt_id": "71c84d13-36d1-4a91-b78b-bd3d4bdd74b9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ccdda50a-1391-4d27-be3c-d16004116e5b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:55:27.347052Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "738196c7-d0a6-4953-99ea-eb93acac8727",
        "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "ccdda50a-1391-4d27-be3c-d16004116e5b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:55:27.887435Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "738196c7-d0a6-4953-99ea-eb93acac8727",
        "order_id": "9b6ade3f-62e5-4d73-a201-62d138b32183",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "fbfe8a53-c980-44a3-bb91-258378029f9a"
      },
      "correlation_id": "ddb64572-65ae-43dd-a726-02df9bb9c531"
```

Done: orders 43d16a8d-cc7b-4ab9-b7bf-54971a4a25a7, 9b6ade3f-62e5-4d73-a201-62d138b32183.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380734194233",
  "device_ref": "sandbox-32411"
}
```

```json
{
  "challenge_id": "de2e3336-e3c2-4f61-93df-6db3e0756ca2",
  "expires_at": "2026-10-28T15:00:30.642562687Z",
  "resend_available_at": "2026-10-28T14:55:31.642562687Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380734194233` → **200**

```json
{
  "phone": "+380734194233",
  "audience": "CLIENT",
  "code": "876628",
  "sent_at": "2026-10-28T14:55:30.645370916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "de2e3336-e3c2-4f61-93df-6db3e0756ca2",
  "code": "876628",
  "device_ref": "sandbox-32411"
}
```

```json
{
  "session_id": "163626ff-f798-43a4-b71e-80f97a67925f",
  "subject": {
    "type": "CLIENT",
    "id": "6690083e-8d66-4ca9-b9c8-7ac7dad645ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NjkwMDgzZS04ZDY2LTRjYTktYjljOC03YWM3ZGFkNjQ1ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjMwLCJpYXQiOjE3OTMxOTkzMzAsImp0aSI6IjczZWM4YjFkLTZkYjEtNDVmYS1hYzIyLWZiNGVmMGNlODMyMyIsInNpZCI6IjE2MzYyNmZmLWY3OTgtNDNhNC1iNzFlLTgwZjk3YTY3OTI1ZiJ9.yfrmZ0SLxnnb-UWYCQygOWCHtC3pkzoiS8L_Hgt1NE4",
  "access_expires_at": "2026-10-28T15:10:30.926267728Z",
  "refresh_token": "hvsB_iSg9OIhLmtUzlWnyCeD2RqzErwjCj2HIfl8WGc",
  "refresh_expires_at": "2026-11-27T14:55:30.925696266Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "e8aa2ea3-e6f5-4706-8eb3-0154acd070b2",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6ac18eb6-4aac-4ba9-b2c0-20a593b4d062",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6ac18eb6-4aac-4ba9-b2c0-20a593b4d062",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6bc017da5f2c38ced62c2405175c4927",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6ac18eb6-4aac-4ba9-b2c0-20a593b4d062",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734194233"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6ac18eb6-4aac-4ba9-b2c0-20a593b4d062",
  "expires_at": "2026-10-28T15:25:31.194121Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6ac18eb6-4aac-4ba9-b2c0-20a593b4d062` → **200**

```json
{
  "id": "6ac18eb6-4aac-4ba9-b2c0-20a593b4d062",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-28T15:25:31.194121Z",
  "card": {
    "id": "bac93812-578d-4636-b6a4-d8c395e51a2d",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3191",
    "card_type": "Visa",
    "created_at": "2026-10-28T14:55:31.47407Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "bac93812-578d-4636-b6a4-d8c395e51a2d",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****3191",
      "card_type": "Visa",
      "created_at": "2026-10-28T14:55:31.47407Z"
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
  "device_ref": "sandbox-27501"
}
```

```json
{
  "challenge_id": "86055c0d-ade5-4716-8793-6c29ffd2fed5",
  "expires_at": "2026-10-28T15:00:32.023677854Z",
  "resend_available_at": "2026-10-28T14:55:33.023677854Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "645255",
  "sent_at": "2026-10-28T14:55:32.0267556Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86055c0d-ade5-4716-8793-6c29ffd2fed5",
  "code": "645255",
  "device_ref": "sandbox-27501"
}
```

```json
{
  "session_id": "2a2a4b46-d1fb-4e60-89b8-7c647af8a474",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDIzMiwiaWF0IjoxNzkzMTk5MzMyLCJqdGkiOiI3ZDgwMDZhMi0wMDZmLTRlMWEtYWQyMC1kOThlNDE4ODFiMTciLCJzaWQiOiIyYTJhNGI0Ni1kMWZiLTRlNjAtODliOC03YzY0N2FmOGE0NzQifQ.-WVKlmjWAjfUoeQYx5yy6-fq4TrdeaOeUU3y-N76FSM",
  "access_expires_at": "2026-10-28T15:10:32.308754878Z",
  "refresh_token": "O4tO2zaQaDgSJpbbGaQ2NRmES6CBUr9E6OHJZH6LU9Y",
  "refresh_expires_at": "2026-11-27T14:55:32.308107218Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41eec519-eae1-4a93-a8f3-a8f3725afd13",
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
  "last_heartbeat_at": "2026-10-28T14:55:26.757281Z",
  "last_location_at": "2026-10-28T14:55:26.757281Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41eec519-eae1-4a93-a8f3-a8f3725afd13/handover` → **200**

```json
{
  "command_id": "df5fd61d-84f5-4a72-928d-11903ddbafee",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41eec519-eae1-4a93-a8f3-a8f3725afd13",
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
  "last_heartbeat_at": "2026-10-28T14:55:26.757281Z",
  "last_location_at": "2026-10-28T14:55:26.757281Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41eec519-eae1-4a93-a8f3-a8f3725afd13/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:33Z",
    "sequence": 1793199333111
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41eec519-eae1-4a93-a8f3-a8f3725afd13",
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
  "last_heartbeat_at": "2026-10-28T14:55:33.131537Z",
  "last_location_at": "2026-10-28T14:55:33.131537Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "338709c2-4544-4126-b382-e8641a96cbfc",
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
  "id": "0ebe158e-752d-401f-a67b-7f22b9676507",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:33.410044Z",
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
  "command_id": "adbe0a24-0f9b-4b79-ab8f-5318a5cf234d",
  "quote_id": "0ebe158e-752d-401f-a67b-7f22b9676507",
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
  "id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6690083e-8d66-4ca9-b9c8-7ac7dad645ed",
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
  "created_at": "2026-10-28T14:55:33.690604Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d` → **200**

```json
{
  "id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "short_number": 4,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6690083e-8d66-4ca9-b9c8-7ac7dad645ed",
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
  "created_at": "2026-10-28T14:55:33.690604Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d` → **200**

```json
{
  "id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6690083e-8d66-4ca9-b9c8-7ac7dad645ed",
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
  "created_at": "2026-10-28T14:55:33.690604Z",
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
    "id": "ab72e510-d001-4057-a8f3-21d409f7769f",
    "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
    "expires_at": "2026-10-28T14:55:49.296379Z",
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

`POST /api/driver/v1/offers/ab72e510-d001-4057-a8f3-21d409f7769f/accept` → **200**

```json
{
  "command_id": "5ad730ca-c90a-4321-b414-ed41c8eba86a"
}
```

```json
{
  "id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "assignment_id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
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

`POST /api/driver/v1/work-sessions/41eec519-eae1-4a93-a8f3-a8f3725afd13/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:55:36Z",
    "sequence": 1793199336308
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41eec519-eae1-4a93-a8f3-a8f3725afd13",
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
  "last_heartbeat_at": "2026-10-28T14:55:36.327877Z",
  "last_location_at": "2026-10-28T14:55:36.327877Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/abb7dc87-6b32-4cdf-b42c-89790576a7c9/arrive` → **200**

```json
{
  "command_id": "b504e313-419f-42ae-b823-694c7508a6d3",
  "expected_version": 0
}
```

```json
{
  "id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "assignment_id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
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
  "arrived_at": "2026-10-28T14:55:36.602002Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/abb7dc87-6b32-4cdf-b42c-89790576a7c9/start` → **200**

```json
{
  "command_id": "ca6f8270-5adb-4210-acd4-b4f678affb95",
  "expected_version": 1
}
```

```json
{
  "id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "assignment_id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
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
  "arrived_at": "2026-10-28T14:55:36.602002Z",
  "started_at": "2026-10-28T14:55:36.876514Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/abb7dc87-6b32-4cdf-b42c-89790576a7c9/complete` → **200**

```json
{
  "command_id": "981741b8-7c3d-4864-bda7-264c4de18623",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:55:37Z"
}
```

```json
{
  "id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "assignment_id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
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
  "arrived_at": "2026-10-28T14:55:36.602002Z",
  "started_at": "2026-10-28T14:55:36.876514Z",
  "completed_at": "2026-10-28T14:55:37.151125Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d` → **200**

```json
{
  "id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "6690083e-8d66-4ca9-b9c8-7ac7dad645ed",
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
    "id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
    "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:55:33.690604Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d` → **200**

```json
{
  "id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "short_number": 4,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "6690083e-8d66-4ca9-b9c8-7ac7dad645ed",
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
    "id": "9c8c4820-ec3f-40a9-ad5b-02ad54c74083",
    "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "abb7dc87-6b32-4cdf-b42c-89790576a7c9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:55:33.690604Z",
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
      "id": "a84fd55f-4986-44f2-a8e8-81b186ddc86a",
      "at": "2026-10-28T14:55:37.35706Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d/tip` → **200**

```json
{
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
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
  "available_until": "2026-10-29T14:55:37.151125Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d/tip` → **201**

```json
{
  "command_id": "b0e49ec2-4565-4f4c-84c2-4ad38eafe91d",
  "amount_minor": 2500
}
```

```json
{
  "id": "6ef66f1f-6b3f-465e-8659-1778aca9a2e9",
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-28T14:55:39.800639Z"
}
```

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d/tip` → **200**

```json
{
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
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
  "available_until": "2026-10-29T14:55:37.151125Z",
  "open": false,
  "tip": {
    "id": "6ef66f1f-6b3f-465e-8659-1778aca9a2e9",
    "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-28T14:55:39.800639Z"
  }
}
```

`GET /api/rider/v1/orders/1381012c-c2c4-4dc1-91ca-e51ef251e54d/tip` → **200**

```json
{
  "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
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
  "available_until": "2026-10-29T14:55:37.151125Z",
  "open": false,
  "tip": {
    "id": "6ef66f1f-6b3f-465e-8659-1778aca9a2e9",
    "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-28T14:55:39.800639Z"
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
      "id": "a510f613-1498-4e06-a916-b5916a522aef",
      "at": "2026-10-28T14:55:41.42294Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
      "counterpart_id": null
    },
    {
      "id": "a84fd55f-4986-44f2-a8e8-81b186ddc86a",
      "at": "2026-10-28T14:55:37.35706Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1381012c-c2c4-4dc1-91ca-e51ef251e54d",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "41eec519-eae1-4a93-a8f3-a8f3725afd13",
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
  "last_heartbeat_at": "2026-10-28T14:55:36.327877Z",
  "last_location_at": "2026-10-28T14:55:36.327877Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/41eec519-eae1-4a93-a8f3-a8f3725afd13/close` → **200**

```json
{
  "command_id": "ae7c25f7-8124-4d5f-a303-f74b82583a23",
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

Done: card order 1381012c-c2c4-4dc1-91ca-e51ef251e54d.

# Scenario: card-top-up

## The rider tops up the bonus account by 150.00

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738149312",
  "device_ref": "sandbox-28033"
}
```

```json
{
  "challenge_id": "cdd9bce6-a891-4fc1-8271-49913576bf41",
  "expires_at": "2026-10-28T15:00:42.451991132Z",
  "resend_available_at": "2026-10-28T14:55:43.451991132Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380738149312` → **200**

```json
{
  "phone": "+380738149312",
  "audience": "CLIENT",
  "code": "571682",
  "sent_at": "2026-10-28T14:55:42.454765949Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cdd9bce6-a891-4fc1-8271-49913576bf41",
  "code": "571682",
  "device_ref": "sandbox-28033"
}
```

```json
{
  "session_id": "aa6af9a9-4458-43c1-b529-ebc1f61107ac",
  "subject": {
    "type": "CLIENT",
    "id": "6555f5a0-7c6d-4272-83b8-c04ad2c4bee3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NTU1ZjVhMC03YzZkLTQyNzItODNiOC1jMDRhZDJjNGJlZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjQyLCJpYXQiOjE3OTMxOTkzNDIsImp0aSI6ImU5M2QzODgzLTE5MmItNDc0Ny1hOWUxLWI2Y2IwOTllMjc2ZSIsInNpZCI6ImFhNmFmOWE5LTQ0NTgtNDNjMS1iNTI5LWViYzFmNjExMDdhYyJ9.uRxPxcC5eqBs6piHweKinuER6R5aZMI5kMGkU1mQzJE",
  "access_expires_at": "2026-10-28T15:10:42.745884869Z",
  "refresh_token": "HY2Txx_NI-rl5srkRrBHjUTnFjSXK2pWXlUVDV88FhA",
  "refresh_expires_at": "2026-11-27T14:55:42.745320348Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "959dfa37-ec91-4e15-a109-68b027c98aa3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "c8de475b-6552-49a3-96db-986ac714c17d",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-c8de475b-6552-49a3-96db-986ac714c17d",
    "orderDate": "1793199343",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "acdcf2f58d8416f258f18f04054aea86",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=c8de475b-6552-49a3-96db-986ac714c17d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738149312"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=c8de475b-6552-49a3-96db-986ac714c17d",
  "created_at": "2026-10-28T14:55:43.017925Z",
  "expires_at": "2026-10-28T15:25:43.017925Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/c8de475b-6552-49a3-96db-986ac714c17d` → **200**

```json
{
  "id": "c8de475b-6552-49a3-96db-986ac714c17d",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:55:43.017925Z",
  "expires_at": "2026-10-28T15:25:43.017925Z",
  "completed_at": "2026-10-28T14:55:43.291405Z",
  "masked_pan": "41****3023",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "6555f5a0-7c6d-4272-83b8-c04ad2c4bee3",
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
      "id": "e895d264-4473-409d-97b1-393e2ba5fcca",
      "at": "2026-10-28T14:55:43.44753Z",
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
  "client_id": "6555f5a0-7c6d-4272-83b8-c04ad2c4bee3",
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
      "id": "e895d264-4473-409d-97b1-393e2ba5fcca",
      "at": "2026-10-28T14:55:43.44753Z",
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
  "device_ref": "sandbox-6013"
}
```

```json
{
  "challenge_id": "b49ffea0-478a-4c30-bbf0-5cae854b2a6e",
  "expires_at": "2026-10-28T15:00:44.107273907Z",
  "resend_available_at": "2026-10-28T14:55:45.107273907Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "390371",
  "sent_at": "2026-10-28T14:55:44.110398593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b49ffea0-478a-4c30-bbf0-5cae854b2a6e",
  "code": "390371",
  "device_ref": "sandbox-6013"
}
```

```json
{
  "session_id": "df8ad3b0-5d4b-4523-8698-2b5ef5bee1a0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI0NCwiaWF0IjoxNzkzMTk5MzQ0LCJqdGkiOiJjNzVlOWE2NS1iNjk5LTQwODctYWU0Zi03MjI0ODlmZDJhOTIiLCJzaWQiOiJkZjhhZDNiMC01ZDRiLTQ1MjMtODY5OC0yYjVlZjViZWUxYTAifQ.579gXsHXYyn4qNsoV71p79CjJnRHp-puJNLrY9C9rs4",
  "access_expires_at": "2026-10-28T15:10:44.394920198Z",
  "refresh_token": "TSExwSyO8yCSUx1j-2JWC47HYFOCJNdsrqnbwb2L6Zs",
  "refresh_expires_at": "2026-11-27T14:55:44.394199373Z",
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
  "command_id": "1e5a1e60-0c70-4b27-bea4-77bfe001e8f3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "f9d02026-de0e-4f84-90ef-31e5c16bd180",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f9d02026-de0e-4f84-90ef-31e5c16bd180",
    "orderDate": "1793199344",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bd63b6c6ba459a1e482da73c706c272c",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f9d02026-de0e-4f84-90ef-31e5c16bd180",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f9d02026-de0e-4f84-90ef-31e5c16bd180",
  "created_at": "2026-10-28T14:55:44.921612Z",
  "expires_at": "2026-10-28T15:25:44.921612Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/f9d02026-de0e-4f84-90ef-31e5c16bd180` → **200**

```json
{
  "id": "f9d02026-de0e-4f84-90ef-31e5c16bd180",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-28T14:55:44.921612Z",
  "expires_at": "2026-10-28T15:25:44.921612Z",
  "completed_at": "2026-10-28T14:55:45.193203Z",
  "masked_pan": "41****9307",
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
      "id": "bd0e4ad4-838a-4721-836d-b9d845eef7e5",
      "at": "2026-10-28T14:55:45.456257Z",
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
  "command_id": "3d4f92ba-842b-4db1-a0d8-077c95c0498d",
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
  "correlation_id": "73d0c168-db74-4b0c-affb-4e2bcd1ae98c"
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
  "session_id": "845fd1bd-cd08-45f1-abe1-d037280f2168",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNDYsImlhdCI6MTc5MzE5OTM0NiwianRpIjoiYTQ3YWEyYmUtMWY1NS00ZTU0LWFjODItZTI1MjNkNGZiMDVlIiwic2lkIjoiODQ1ZmQxYmQtY2QwOC00NWYxLWFiZTEtZDAzNzI4MGYyMTY4In0.RvDcYDh-GRwlQVUxacI1nZTYt27dUI3MN7CY5sw0fME",
  "access_expires_at": "2026-10-28T15:10:46.342779668Z",
  "refresh_token": "Mif0Mzhv7aH4-HbW81iCtgiloTnuv3jAKhUgCBgly1w",
  "refresh_expires_at": "2026-10-29T02:55:46.342139292Z",
  "password_change_required": false
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 1,
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
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
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
  "phone": "+48600860354",
  "device_ref": "sandbox-22625"
}
```

```json
{
  "challenge_id": "56512620-2d9e-4d8e-8c02-16ec541d2941",
  "expires_at": "2026-10-28T15:00:47.148593987Z",
  "resend_available_at": "2026-10-28T14:55:48.148593987Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600860354` → **200**

```json
{
  "phone": "+48600860354",
  "audience": "CLIENT",
  "code": "945860",
  "sent_at": "2026-10-28T14:55:47.151395296Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "56512620-2d9e-4d8e-8c02-16ec541d2941",
  "code": "945860",
  "device_ref": "sandbox-22625"
}
```

```json
{
  "session_id": "cf6b7633-187f-433d-80fb-47de7c7969be",
  "subject": {
    "type": "CLIENT",
    "id": "7d377240-c9f0-438c-a3a8-bd054db06b45"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3ZDM3NzI0MC1jOWYwLTQzOGMtYTNhOC1iZDA1NGRiMDZiNDUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjQ3LCJpYXQiOjE3OTMxOTkzNDcsImp0aSI6ImE0MzQ1OTVlLTBmNGQtNDk1Mi1iNTVmLWRmYjZlNDljZDA3OCIsInNpZCI6ImNmNmI3NjMzLTE4N2YtNDMzZC04MGZiLTQ3ZGU3Yzc5NjliZSJ9.XeHnze-P916bp_i5b2Py_J7-HXHGIykfGHIIPMWj85k",
  "access_expires_at": "2026-10-28T15:10:47.446240734Z",
  "refresh_token": "bHay_y9d3Awe_VTkgHaoiP2ZXaLrsDaZxovj8ZVoGHA",
  "refresh_expires_at": "2026-11-27T14:55:47.445641325Z",
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
  "command_id": "aa05af92-08ea-4d4f-b234-5659665ab0d0",
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
  "correlation_id": "03057d38-92d7-486f-9577-c6d9811dfa7e",
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
  "command_id": "1b0ade6d-fe45-498a-909b-c64248049de4",
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
  "paused_at": "2026-10-28T14:55:48.546713731Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 1,
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
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "647c8882-2672-4bbf-8a69-ce2ce286ef48",
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
  "id": "7a70e46b-f5d9-4ad5-af9d-7b046e6fa4c4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:49.092330Z",
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
  "command_id": "c49a9b78-261b-405e-8dff-7a8100be08d3",
  "quote_id": "7a70e46b-f5d9-4ad5-af9d-7b046e6fa4c4",
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
  "correlation_id": "f3b7193b-003e-4191-8145-4a665e310411"
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
  "paused_at": "2026-10-28T14:55:48.546714Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "114aa5a5-e0ed-454a-b2cc-5dcc6cec4138",
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
  "command_id": "170451b6-ccad-436d-9098-38b4f1290fe6",
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
  "command_id": "016bff80-8aab-4d1b-85e4-1dbfc2b332a3",
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
  "id": "d4f5f271-a824-425a-a40e-83b3b18d4f4d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:50.748079Z",
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
  "command_id": "6293cad1-a4cb-4fb4-b9d4-15fb2576f1b3",
  "quote_id": "d4f5f271-a824-425a-a40e-83b3b18d4f4d",
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
  "correlation_id": "34d62bcb-d9b5-4a94-b38b-19b6ae9f1be7"
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
  "command_id": "9144d9d1-3bbf-4cc9-bac6-6ac86fd868df",
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
  "command_id": "366bce4d-5a1a-4d58-a781-c70c463df1a4",
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
  "id": "e9609c68-f9f4-41af-9aa7-6416a957ecde",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:51.836507Z",
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
  "command_id": "c032f075-fb45-424a-8732-c74b3cb00c3d",
  "quote_id": "e9609c68-f9f4-41af-9aa7-6416a957ecde",
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
  "correlation_id": "61bab6d1-7c40-4b8c-87e4-02002eae6870"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "9479b782-83ea-46f2-9ef2-b37516c83fbd",
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
  "correlation_id": "b41e94a4-708e-43c9-a147-3f543834749e"
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
  "command_id": "f2e2ba4b-fd4e-4e6b-abe9-71eb3ef7e449",
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
  "phone": "+380675339700",
  "device_ref": "sandbox-22330"
}
```

```json
{
  "challenge_id": "789732d4-c209-4544-b6bd-88ee2593de5b",
  "expires_at": "2026-10-28T15:00:53.213528019Z",
  "resend_available_at": "2026-10-28T14:55:54.213528019Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675339700` → **200**

```json
{
  "phone": "+380675339700",
  "audience": "CLIENT",
  "code": "116262",
  "sent_at": "2026-10-28T14:55:53.217165309Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "789732d4-c209-4544-b6bd-88ee2593de5b",
  "code": "116262",
  "device_ref": "sandbox-22330"
}
```

```json
{
  "session_id": "a40e040c-b71e-446d-85b4-20941702e839",
  "subject": {
    "type": "CLIENT",
    "id": "c6ccd22e-510e-4367-8467-c1e33413913d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNmNjZDIyZS01MTBlLTQzNjctODQ2Ny1jMWUzMzQxMzkxM2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjUzLCJpYXQiOjE3OTMxOTkzNTMsImp0aSI6IjUwOWY0YzRjLTVkOGYtNGU1OC1hZmZjLTdiMWExZGJiZTE4NyIsInNpZCI6ImE0MGUwNDBjLWI3MWUtNDQ2ZC04NWI0LTIwOTQxNzAyZTgzOSJ9.xRCa3Up2rpK3US3sgh71sTlUFC-py3Y-uXtLtOTh0cU",
  "access_expires_at": "2026-10-28T15:10:53.512748521Z",
  "refresh_token": "uIb741IuxSp0Rnw1rsfNPHiLX1G9hi7EcFwGVU599x8",
  "refresh_expires_at": "2026-11-27T14:55:53.51214193Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "c6ccd22e-510e-4367-8467-c1e33413913d",
  "session_id": "a40e040c-b71e-446d-85b4-20941702e839",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "48973708-1938-4e95-b5e5-b36bdefc99b7",
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
  "id": "b89a66ab-f800-4bd8-b0d1-f77fee2f584a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:00:54.030802Z",
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
  "challenge_id": "965751f7-5a81-44f3-94a2-d4b0e0767b73",
  "expires_at": "2026-10-28T15:00:56.312060836Z",
  "resend_available_at": "2026-10-28T14:55:57.312060836Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675339700` → **200**

```json
{
  "phone": "+380675339700",
  "audience": "CLIENT",
  "code": "816852",
  "sent_at": "2026-10-28T14:55:56.314521821Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "5e266e19-fd67-4f8f-a95b-7d78cbf9af31",
  "challenge_id": "965751f7-5a81-44f3-94a2-d4b0e0767b73",
  "otp_code": "816852"
}
```

```json
{
  "client_id": "c6ccd22e-510e-4367-8467-c1e33413913d",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-28T14:55:56.618754118Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "713e5fff-bee6-43d8-914c-55b41341b121",
  "quote_id": "b89a66ab-f800-4bd8-b0d1-f77fee2f584a",
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
  "correlation_id": "cd6c3113-cc4d-4b93-943f-0e1e7678c03c"
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
  "session_id": "9e810baf-314c-49e4-a5fe-fee46bf4a132",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNTcsImlhdCI6MTc5MzE5OTM1NywianRpIjoiY2RkNzg3NjYtNzlhMC00ZDM5LWIxZDEtOTc2NmZhYTUwNjNjIiwic2lkIjoiOWU4MTBiYWYtMzE0Yy00OWU0LWE1ZmUtZmVlNDZiZjRhMTMyIn0.q46JUk1HGN8YWY0ELwrqsJlSacZ9JR4j6tsuOqFdJus",
  "access_expires_at": "2026-10-28T15:10:57.467367606Z",
  "refresh_token": "x4__ADhtWm2fCUh1lnX2Xv82glTCoGyW9kdMnIQC-V8",
  "refresh_expires_at": "2026-10-29T02:55:57.466681697Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "c6ccd22e-510e-4367-8467-c1e33413913d",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-28T14:55:56.618754Z",
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

`POST /api/admin/v1/client-deletions/c6ccd22e-510e-4367-8467-c1e33413913d/complete` → **200**

```json
{
  "command_id": "b703adc1-aa5f-4a27-a6fa-93dca0397e1f",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "c6ccd22e-510e-4367-8467-c1e33413913d",
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
  "correlation_id": "a521207d-45ba-43e3-99b9-51cf4839c50a"
}
```

Done: client c6ccd22e-510e-4367-8467-c1e33413913d anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668005779",
  "device_ref": "sandbox-18178"
}
```

```json
{
  "challenge_id": "2eea2812-83aa-4c15-a917-657d98b590a9",
  "expires_at": "2026-10-28T15:00:58.56687643Z",
  "resend_available_at": "2026-10-28T14:55:59.56687643Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668005779` → **200**

```json
{
  "phone": "+380668005779",
  "audience": "CLIENT",
  "code": "165056",
  "sent_at": "2026-10-28T14:55:58.569341062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2eea2812-83aa-4c15-a917-657d98b590a9",
  "code": "165056",
  "device_ref": "sandbox-18178"
}
```

```json
{
  "session_id": "8b4d719f-5f8c-4501-bf9a-06f4bc753006",
  "subject": {
    "type": "CLIENT",
    "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDMwNDgwYS1hNTVkLTRiOTItOGJkNS1iYTRiMjFiYTk4OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjU4LCJpYXQiOjE3OTMxOTkzNTgsImp0aSI6ImE0MDMyZGI1LTZkNTUtNGFmMi1iMjI5LWZmOWI3NDM4OTVlMyIsInNpZCI6IjhiNGQ3MTlmLTVmOGMtNDUwMS1iZjlhLTA2ZjRiYzc1MzAwNiJ9.jPzF7p1OWHTwxVppOXQ3lpcZNmL24gr6-NR_KjlokaQ",
  "access_expires_at": "2026-10-28T15:10:58.859128562Z",
  "refresh_token": "xGJ_45x7HJNybkKyyPbbygv6jNf5Jl8Gx04H3ZO7nVU",
  "refresh_expires_at": "2026-11-27T14:55:58.858577614Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
  "session_id": "8b4d719f-5f8c-4501-bf9a-06f4bc753006",
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
  "session_id": "b85a1cf8-0c04-4b39-bef9-48602fa99c63",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNTksImlhdCI6MTc5MzE5OTM1OSwianRpIjoiNDhjMmE5NWYtMmI4My00OGM0LWIxMjgtMjc3M2NiYTJjYmVjIiwic2lkIjoiYjg1YTFjZjgtMGMwNC00YjM5LWJlZjktNDg2MDJmYTk5YzYzIn0.cQ5U9lETKDpmuWlHU6bdBXLGMbZO10q9FCV6WxZ8yrk",
  "access_expires_at": "2026-10-28T15:10:59.682405345Z",
  "refresh_token": "LfkN8064pt_sMfEEVoOrdMQE2OpFwejlm-oRsLPcBdM",
  "refresh_expires_at": "2026-10-29T02:55:59.681845373Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8005779&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
      "phone": "+380668005779",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-28T14:55:58.856469Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/d030480a-a55d-4b92-8bd5-ba4b21ba989b` → **200**

```json
{
  "client": {
    "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
    "phone": "+380668005779",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:55:58.856469Z",
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

`POST /api/admin/v1/clients/d030480a-a55d-4b92-8bd5-ba4b21ba989b/block` → **400**

```json
{
  "command_id": "ce025382-a44d-46ea-9d3a-fa2361d46b9a",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d030480a-a55d-4b92-8bd5-ba4b21ba989b/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e1234862-831a-4d43-aefd-260b1229e735",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/d030480a-a55d-4b92-8bd5-ba4b21ba989b/block` → **200**

```json
{
  "command_id": "57d7d0c3-41bb-4e99-9c2f-1b797188f426",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
  "phone": "+380668005779",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-28T14:55:58.856469Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-28T14:56:00.824466Z",
    "by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
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
  "correlation_id": "33655fbd-c339-4df0-9610-fdb04cef9465"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668005779",
  "device_ref": "sandbox-21972"
}
```

```json
{
  "challenge_id": "2a391d48-3900-4c42-b478-706de9684181",
  "expires_at": "2026-10-28T15:01:03.377899474Z",
  "resend_available_at": "2026-10-28T14:56:04.377899474Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668005779` → **200**

```json
{
  "phone": "+380668005779",
  "audience": "CLIENT",
  "code": "061657",
  "sent_at": "2026-10-28T14:56:03.380701993Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "2a391d48-3900-4c42-b478-706de9684181",
  "code": "061657",
  "device_ref": "sandbox-21972"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "c33af0b6-ba70-4ac7-b99a-25226b1ca738"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/d030480a-a55d-4b92-8bd5-ba4b21ba989b` → **200**

```json
{
  "client": {
    "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
    "phone": "+380668005779",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-28T14:55:58.856469Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-28T14:56:00.824466Z",
      "by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
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

`POST /api/admin/v1/clients/d030480a-a55d-4b92-8bd5-ba4b21ba989b/unblock` → **200**

```json
{
  "command_id": "689cb44b-b412-48e0-95d4-10984acdb412",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
  "phone": "+380668005779",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-28T14:55:58.856469Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668005779",
  "device_ref": "sandbox-27729"
}
```

```json
{
  "challenge_id": "bb807839-481b-45d6-ae07-ad56ca606edd",
  "expires_at": "2026-10-28T15:01:06.522447128Z",
  "resend_available_at": "2026-10-28T14:56:07.522447128Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668005779` → **200**

```json
{
  "phone": "+380668005779",
  "audience": "CLIENT",
  "code": "042754",
  "sent_at": "2026-10-28T14:56:06.524785705Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb807839-481b-45d6-ae07-ad56ca606edd",
  "code": "042754",
  "device_ref": "sandbox-27729"
}
```

```json
{
  "session_id": "92b71049-5841-41cc-9060-48fd4fe08509",
  "subject": {
    "type": "CLIENT",
    "id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMDMwNDgwYS1hNTVkLTRiOTItOGJkNS1iYTRiMjFiYTk4OWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjY2LCJpYXQiOjE3OTMxOTkzNjYsImp0aSI6IjdkM2ZmNWI0LWNiMzItNDA3Ni04NjEzLWIwMDUwNmJhNjkzZSIsInNpZCI6IjkyYjcxMDQ5LTU4NDEtNDFjYy05MDYwLTQ4ZmQ0ZmUwODUwOSJ9.bPj72dny6g6HtPzXrQOJklovR3ZAUav8w3xApJ4pExM",
  "access_expires_at": "2026-10-28T15:11:06.850354145Z",
  "refresh_token": "h4chIjKflHJNyrCYBi8jnl9CqMMZFA62sJPQhZ__Qw0",
  "refresh_expires_at": "2026-11-27T14:56:06.849687854Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d030480a-a55d-4b92-8bd5-ba4b21ba989b",
  "session_id": "92b71049-5841-41cc-9060-48fd4fe08509",
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
  "phone": "+380668419996",
  "device_ref": "sandbox-5253"
}
```

```json
{
  "challenge_id": "90334890-e6f5-42a1-8ada-c8530f890312",
  "expires_at": "2026-10-28T15:01:07.407539959Z",
  "resend_available_at": "2026-10-28T14:56:08.407539959Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380668419996` → **200**

```json
{
  "phone": "+380668419996",
  "audience": "CLIENT",
  "code": "360909",
  "sent_at": "2026-10-28T14:56:07.410905657Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "90334890-e6f5-42a1-8ada-c8530f890312",
  "code": "360909",
  "device_ref": "sandbox-5253"
}
```

```json
{
  "session_id": "e2a57709-291e-4b50-9240-a86acff6a656",
  "subject": {
    "type": "CLIENT",
    "id": "4ec0496c-77f7-40cb-bf84-4681e396fa96"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZWMwNDk2Yy03N2Y3LTQwY2ItYmY4NC00NjgxZTM5NmZhOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjY3LCJpYXQiOjE3OTMxOTkzNjcsImp0aSI6IjYzY2VlNTY5LWFlMzYtNGU1Yy05ZjVjLWYzZWMzNzE4YjE4NCIsInNpZCI6ImUyYTU3NzA5LTI5MWUtNGI1MC05MjQwLWE4NmFjZmY2YTY1NiJ9.0oHg5tK7F-_GzD4X6Kf7QgC9sv7t3Un-Glukzq8KrkQ",
  "access_expires_at": "2026-10-28T15:11:07.697201979Z",
  "refresh_token": "iDYZK-AaNRr1UbRaW3G8N4vnEAJJ5O1wJOrhJ-mIgos",
  "refresh_expires_at": "2026-11-27T14:56:07.696688103Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ceed6ee5-31f7-40d4-9b76-8b6830701cdf",
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
  "id": "54132f69-e82d-4dc5-a45f-f15a1d47813e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:07.973184Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 1f034854-5454-41c3-bafd-b35588e7b3cb) → **201**

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
  "session_id": "6876f9e2-85a2-40c4-9c55-e1c7d18d6cff",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNjgsImlhdCI6MTc5MzE5OTM2OCwianRpIjoiMWMzYjg2OGUtNGQ0Ni00ZDZlLThiZmItNDJiNWY5YzgzOTU1Iiwic2lkIjoiNjg3NmY5ZTItODVhMi00MGM0LTljNTUtZTFjN2QxOGQ2Y2ZmIn0.o4zgXdjsozlk3nuaSDMroMKpw_NDeckMkorfpK9TZMg",
  "access_expires_at": "2026-10-28T15:11:08.583393279Z",
  "refresh_token": "4sbLuUBp2xHZGdx0AETTxEKlagS7e7akRGZDsYPRgSY",
  "refresh_expires_at": "2026-10-29T02:56:08.582844458Z",
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
  "session_id": "4fc46fe2-11b0-4953-941a-670a06a8821f",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyNjksImlhdCI6MTc5MzE5OTM2OSwianRpIjoiOGNlOGJjYzctYzc0MC00MGVhLTljOWUtOGU2N2Q4YWMzOTk1Iiwic2lkIjoiNGZjNDZmZTItMTFiMC00OTUzLTk0MWEtNjcwYTA2YTg4MjFmIn0.C--oYHOXmmzp4DpH45t33ihVCSrP2z6OIhdnl7ZeNds",
  "access_expires_at": "2026-10-28T15:11:09.136509824Z",
  "refresh_token": "q_ujQ905lRHhSiGGgMDiwqVM9ex9v4Cp0Vo3vqCawK4",
  "refresh_expires_at": "2026-10-29T02:56:09.135941375Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/70ae26cc-fdf2-4006-8c3a-bb2166db459f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:56:08.251869Z",
      "actor": {
        "type": "CLIENT",
        "id": "4ec0496c-77f7-40cb-bf84-4681e396fa96",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
        "quote_id": "54132f69-e82d-4dc5-a45f-f15a1d47813e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1f034854-5454-41c3-bafd-b35588e7b3cb"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:56:08.253741Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
        "attempt_id": "308b1a31-24e1-4f38-a7ea-6f1696c3bcf8",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1f034854-5454-41c3-bafd-b35588e7b3cb"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-28T14:56:08.263904Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
        "attempt_id": "308b1a31-24e1-4f38-a7ea-6f1696c3bcf8"
      },
      "correlation_id": "1f034854-5454-41c3-bafd-b35588e7b3cb"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "308b1a31-24e1-4f38-a7ea-6f1696c3bcf8",
        "generation": 1,
        "started_at": "2026-10-28T14:56:08.252778Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-28T14:56:08.263904Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-28T14:56:08.25484Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/1f034854-5454-41c3-bafd-b35588e7b3cb` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f:0",
      "order_id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
      "at": "2026-10-28T14:56:08.251869Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f:1",
      "order_id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
      "at": "2026-10-28T14:56:08.253741Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f:2",
      "order_id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
      "at": "2026-10-28T14:56:08.263904Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/bebe8506-d572-4c06-ae11-e58ee42ffbe1` → **200**

```json
{
  "found": []
}
```

Done: request 1f034854-5454-41c3-bafd-b35588e7b3cb — order 70ae26cc-fdf2-4006-8c3a-bb2166db459f found by its id.

`GET /api/rider/v1/orders/70ae26cc-fdf2-4006-8c3a-bb2166db459f` → **200**

```json
{
  "id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ec0496c-77f7-40cb-bf84-4681e396fa96",
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
  "created_at": "2026-10-28T14:56:08.251239Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/70ae26cc-fdf2-4006-8c3a-bb2166db459f/cancel` → **200**

```json
{
  "command_id": "c15d1933-636b-400d-913d-c6923cd01698",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "70ae26cc-fdf2-4006-8c3a-bb2166db459f",
  "short_number": 5,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4ec0496c-77f7-40cb-bf84-4681e396fa96",
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
  "created_at": "2026-10-28T14:56:08.251239Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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
  "phone": "+380631045100",
  "device_ref": "sandbox-4306"
}
```

```json
{
  "challenge_id": "db0a350d-aa20-488a-a539-aab252126ebe",
  "expires_at": "2026-10-28T15:01:10.803250121Z",
  "resend_available_at": "2026-10-28T14:56:11.803250121Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631045100` → **200**

```json
{
  "phone": "+380631045100",
  "audience": "CLIENT",
  "code": "196190",
  "sent_at": "2026-10-28T14:56:10.806141056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db0a350d-aa20-488a-a539-aab252126ebe",
  "code": "196190",
  "device_ref": "sandbox-4306"
}
```

```json
{
  "session_id": "e647f08b-3005-440f-acc9-f3dfe0dc3d29",
  "subject": {
    "type": "CLIENT",
    "id": "fa99645a-e57b-456e-9129-a2f2011ce06a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYTk5NjQ1YS1lNTdiLTQ1NmUtOTEyOS1hMmYyMDExY2UwNmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjcxLCJpYXQiOjE3OTMxOTkzNzEsImp0aSI6IjljYmZhMjdkLTI2MzAtNGU0OS1hNDMwLTBlYTNjM2ZhZDJlNCIsInNpZCI6ImU2NDdmMDhiLTMwMDUtNDQwZi1hY2M5LWYzZGZlMGRjM2QyOSJ9.wtwR5sH-A5q80qsAP2pZlA8nEOPeWonZueiY7Zscjs0",
  "access_expires_at": "2026-10-28T15:11:11.092535283Z",
  "refresh_token": "TwIfDsgTG6VZFtLHYvuLF0nvFp61GGNImchashS1Wm0",
  "refresh_expires_at": "2026-11-27T14:56:11.091934714Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "8396e947-178d-44bb-9152-471c13546ca5",
  "expires_at": "2026-10-28T15:01:13.360445547Z",
  "resend_available_at": "2026-10-28T14:56:14.360445547Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631045100` → **200**

```json
{
  "phone": "+380631045100",
  "audience": "CLIENT",
  "code": "572030",
  "sent_at": "2026-10-28T14:56:13.362354496Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "0699bd36-fee5-4154-8b6d-f98bc33d819d",
  "challenge_id": "8396e947-178d-44bb-9152-471c13546ca5",
  "otp_code": "572030"
}
```

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "PENDING",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc` → **200**

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "PENDING",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc` → **200**

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "PENDING",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc` → **200**

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "PENDING",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc` → **200**

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "PENDING",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc` → **200**

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "PENDING",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc` → **200**

```json
{
  "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
  "state": "READY",
  "created_at": "2026-10-28T14:56:13.656234Z",
  "ready_at": "2026-10-28T14:56:19.906822Z",
  "expires_at": "2026-11-04T14:56:19.906822Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639176518",
  "device_ref": "sandbox-6807"
}
```

```json
{
  "challenge_id": "12a798b9-1cc5-44f3-9faf-fbe2f0baa262",
  "expires_at": "2026-10-28T15:01:20.504690145Z",
  "resend_available_at": "2026-10-28T14:56:21.504690145Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639176518` → **200**

```json
{
  "phone": "+380639176518",
  "audience": "CLIENT",
  "code": "860252",
  "sent_at": "2026-10-28T14:56:20.507068015Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12a798b9-1cc5-44f3-9faf-fbe2f0baa262",
  "code": "860252",
  "device_ref": "sandbox-6807"
}
```

```json
{
  "session_id": "1afecb6e-09f1-4fcb-afc4-a6c822d3ec85",
  "subject": {
    "type": "CLIENT",
    "id": "cc1ee238-3774-467d-a97b-ce41841a95ed"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYzFlZTIzOC0zNzc0LTQ2N2QtYTk3Yi1jZTQxODQxYTk1ZWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjgwLCJpYXQiOjE3OTMxOTkzODAsImp0aSI6IjBjNTRjYTAxLTNiNGMtNGMwYy04MjVkLTFkZTI3YWRiYjNmNSIsInNpZCI6IjFhZmVjYjZlLTA5ZjEtNGZjYi1hZmM0LWE2YzgyMmQzZWM4NSJ9.8yHsJKqJenrVLTU4anr_SJKGfhtSV4g0jK0QwR7CGBo",
  "access_expires_at": "2026-10-28T15:11:20.798199107Z",
  "refresh_token": "_PzwnAsMpcQt4E6W_B7oFMzVJEAeXM7FI2eu7DP_gm4",
  "refresh_expires_at": "2026-11-27T14:56:20.797560025Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/75eb0397-88b7-4095-ba15-f4d70304adfc/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "87beecad-a030-4ced-a21b-16c4e93023a4"
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
  "session_id": "9b703a74-b07b-42f8-9a2f-af6ede8b3cfb",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyODEsImlhdCI6MTc5MzE5OTM4MSwianRpIjoiZDlkZmNhZGQtOGM4MC00OTU0LWI4MjAtM2NiOTg2YTA3ZDA0Iiwic2lkIjoiOWI3MDNhNzQtYjA3Yi00MmY4LTlhMmYtYWY2ZWRlOGIzY2ZiIn0.CVN5t2Pqc07e2TIYQalNuY4rU6LQpYtnoTmjxcGfj6A",
  "access_expires_at": "2026-10-28T15:11:21.617898754Z",
  "refresh_token": "DIU4Xh9m-zphFKmMoU4V3L2QIcxb0yXpz-YIqwpJJGA",
  "refresh_expires_at": "2026-10-29T02:56:21.617340695Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fa99645a-e57b-456e-9129-a2f2011ce06a",
  "session_id": "e647f08b-3005-440f-acc9-f3dfe0dc3d29",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/fa99645a-e57b-456e-9129-a2f2011ce06a/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "75eb0397-88b7-4095-ba15-f4d70304adfc",
      "state": "READY",
      "created_at": "2026-10-28T14:56:13.656234Z",
      "ready_at": "2026-10-28T14:56:19.906822Z",
      "expires_at": "2026-11-04T14:56:19.906822Z",
      "size_bytes": 1031
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
  "device_ref": "sandbox-30018"
}
```

```json
{
  "challenge_id": "1bbee2c0-fb97-4934-bf87-b53d2f6e9399",
  "expires_at": "2026-10-28T15:01:22.406275977Z",
  "resend_available_at": "2026-10-28T14:56:23.406275977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "500158",
  "sent_at": "2026-10-28T14:56:22.413973121Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1bbee2c0-fb97-4934-bf87-b53d2f6e9399",
  "code": "500158",
  "device_ref": "sandbox-30018"
}
```

```json
{
  "session_id": "d7b7f469-8ebe-4bb4-9c83-fe81b684d2c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI4MiwiaWF0IjoxNzkzMTk5MzgyLCJqdGkiOiJiMGU4NmZiZi0xMWFmLTRlNDctYTFiZS1hYTNmZjdhM2ExYzYiLCJzaWQiOiJkN2I3ZjQ2OS04ZWJlLTRiYjQtOWM4My1mZTgxYjY4NGQyYzMifQ.h6PE5WdOmFuFsLLxUJjfM04JZXxcMJTgTXLz0lOpCcw",
  "access_expires_at": "2026-10-28T15:11:22.699191395Z",
  "refresh_token": "B9fyaOpG0dpvN6YJ77RuxBpUr4Z2AB0WfCDN_kqNTRQ",
  "refresh_expires_at": "2026-11-27T14:56:22.698613329Z",
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
  "device_ref": "sandbox-5940"
}
```

```json
{
  "challenge_id": "7ba0252b-2be3-4f18-8aee-f1aac947c997",
  "expires_at": "2026-10-28T15:01:23.216573849Z",
  "resend_available_at": "2026-10-28T14:56:24.216573849Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "799721",
  "sent_at": "2026-10-28T14:56:23.218831565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ba0252b-2be3-4f18-8aee-f1aac947c997",
  "code": "799721",
  "device_ref": "sandbox-5940"
}
```

```json
{
  "session_id": "b1c66ca4-a194-45b7-8268-8081607c7ce1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI4MywiaWF0IjoxNzkzMTk5MzgzLCJqdGkiOiI5MGY3YWY2OS0wYmZmLTQ5YjgtOTkyMy1jNTVkMjQyYTE5OTIiLCJzaWQiOiJiMWM2NmNhNC1hMTk0LTQ1YjctODI2OC04MDgxNjA3YzdjZTEifQ.7FbxlxDXZpm3-DZ3NocDRGyY_zoRKsDMmgkB1s61om4",
  "access_expires_at": "2026-10-28T15:11:23.501100679Z",
  "refresh_token": "rfdlRWJtZPsN2xIOiyIrwb1BpksVLbhdzApM_4fYVxQ",
  "refresh_expires_at": "2026-11-27T14:56:23.500570783Z",
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
  "command_id": "dd4ff4c2-dbd7-479d-a81a-93a2c45b44e3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:24Z",
    "sequence": 1793199384143
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5620b9c3-5289-4699-834f-53808944ebcd",
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
  "last_heartbeat_at": "2026-10-28T14:56:24.033198Z",
  "last_location_at": "2026-10-28T14:56:24.033198Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-19633"
}
```

```json
{
  "challenge_id": "9f4bd5da-fa37-44ae-9460-c98e71cfd219",
  "expires_at": "2026-10-28T15:01:24.298426794Z",
  "resend_available_at": "2026-10-28T14:56:25.298426794Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "893574",
  "sent_at": "2026-10-28T14:56:24.300787945Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f4bd5da-fa37-44ae-9460-c98e71cfd219",
  "code": "893574",
  "device_ref": "sandbox-19633"
}
```

```json
{
  "session_id": "46ef181c-de8b-4121-9906-822e020e1fb1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI4NCwiaWF0IjoxNzkzMTk5Mzg0LCJqdGkiOiJlOWU5MDYzNC0wYTM3LTQ0MDgtOTM1MS02YmM4NDk0NmY0MDYiLCJzaWQiOiI0NmVmMTgxYy1kZThiLTQxMjEtOTkwNi04MjJlMDIwZTFmYjEifQ.ZGqlMDR80kvZVpTVPJNQgOKZ5GNqdnU4Dj8vFO5BP-c",
  "access_expires_at": "2026-10-28T15:11:24.587748068Z",
  "refresh_token": "2ze-MrhakfzLjofBfxu5RuVvubv-gReJuWI8CwVd__A",
  "refresh_expires_at": "2026-11-27T14:56:24.587032413Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "23ca70d4-9b33-4009-be2b-4d4741cf9bbb",
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
  "last_heartbeat_at": "2026-10-28T14:55:25.644981Z",
  "last_location_at": "2026-10-28T14:55:25.644981Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/23ca70d4-9b33-4009-be2b-4d4741cf9bbb/handover` → **200**

```json
{
  "command_id": "7b818661-57e4-4bb0-9be7-b10305c03220",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "23ca70d4-9b33-4009-be2b-4d4741cf9bbb",
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
  "last_heartbeat_at": "2026-10-28T14:55:25.644981Z",
  "last_location_at": "2026-10-28T14:55:25.644981Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/23ca70d4-9b33-4009-be2b-4d4741cf9bbb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:25Z",
    "sequence": 1793199385378
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "23ca70d4-9b33-4009-be2b-4d4741cf9bbb",
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
  "last_heartbeat_at": "2026-10-28T14:56:25.398803Z",
  "last_location_at": "2026-10-28T14:56:25.398803Z",
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
  "session_id": "e9f74900-12c9-4689-9f5e-9e0bb0f3c466",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyODUsImlhdCI6MTc5MzE5OTM4NSwianRpIjoiYTEwZjgwN2ItMGU2NS00YzkzLWI4MmQtM2VjYmYzYjkxNjcyIiwic2lkIjoiZTlmNzQ5MDAtMTJjOS00Njg5LTlmNWUtOWUwYmIwZjNjNDY2In0.FNGisldRJadroZhFXfO16osYFAfr8MejPkVmgXdCxko",
  "access_expires_at": "2026-10-28T15:11:25.953861427Z",
  "refresh_token": "nLGd77QdC94crIU5H1iS2s_Edkj3chGnvAGxUVuZpbM",
  "refresh_expires_at": "2026-10-29T02:56:25.953284645Z",
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
  "session_id": "f7ab38af-08f3-485d-ac78-20c7a03f7e0d",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAyODYsImlhdCI6MTc5MzE5OTM4NiwianRpIjoiNzBkZDJlNTctOGZlMy00N2M0LTk2ZjUtNzA5ZmNkY2ZhNzJkIiwic2lkIjoiZjdhYjM4YWYtMDhmMy00ODVkLWFjNzgtMjBjN2EwM2Y3ZTBkIn0.mDIpQZF0on21sA32VQ27Eov-XTiaNWfDYERkChRceCU",
  "access_expires_at": "2026-10-28T15:11:26.507098823Z",
  "refresh_token": "Nlu8SR8WgsQp1fgr0bHnUkFu9gaPyGEqB-WL4dmvEVo",
  "refresh_expires_at": "2026-10-29T02:56:26.506501822Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681150196",
  "device_ref": "sandbox-24174"
}
```

```json
{
  "challenge_id": "95f320f9-6165-40e5-b837-13ba2e2d32bf",
  "expires_at": "2026-10-28T15:01:26.765204882Z",
  "resend_available_at": "2026-10-28T14:56:27.765204882Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380681150196` → **200**

```json
{
  "phone": "+380681150196",
  "audience": "CLIENT",
  "code": "398836",
  "sent_at": "2026-10-28T14:56:26.769258593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95f320f9-6165-40e5-b837-13ba2e2d32bf",
  "code": "398836",
  "device_ref": "sandbox-24174"
}
```

```json
{
  "session_id": "f085f742-f867-42a1-9ce5-b5de97fd055e",
  "subject": {
    "type": "CLIENT",
    "id": "431e8cfd-13fb-4ea2-9052-1fbb6ad542a0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MzFlOGNmZC0xM2ZiLTRlYTItOTA1Mi0xZmJiNmFkNTQyYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjg3LCJpYXQiOjE3OTMxOTkzODcsImp0aSI6IjFjNDY5YTFmLTYxN2MtNDUxNi1hMWM5LWMxOTcyMTg2NGIyZSIsInNpZCI6ImYwODVmNzQyLWY4NjctNDJhMS05Y2U1LWI1ZGU5N2ZkMDU1ZSJ9.eEobrJGb9Xw4ETL-VHGQ1ogoPDyQP4sHsM7d2xYho9w",
  "access_expires_at": "2026-10-28T15:11:27.048777145Z",
  "refresh_token": "A-iNQmAiioE9PYcnWc2aBnA9WIzE_UXFGNHkAD8iNVM",
  "refresh_expires_at": "2026-11-27T14:56:27.048204127Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f5d95338-4277-42a3-be84-2bbe6cb6b493",
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
  "id": "318e1536-3afd-436f-a61b-6d1e1e205324",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:27.316461Z",
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
  "command_id": "8a898238-090a-4a79-8c3c-4a1acd5320db",
  "quote_id": "318e1536-3afd-436f-a61b-6d1e1e205324",
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
  "id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "431e8cfd-13fb-4ea2-9052-1fbb6ad542a0",
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
  "created_at": "2026-10-28T14:56:27.593187Z",
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
    "id": "ac91e9af-e978-428f-9301-0464e80ebc54",
    "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
    "expires_at": "2026-10-28T14:56:42.596592Z",
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

`POST /api/driver/v1/offers/ac91e9af-e978-428f-9301-0464e80ebc54/reject` → **204**

```json
{
  "command_id": "a102f405-7ed2-47f7-9967-ff7be78d15b1"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "51dd4e3d-9983-46ba-a1bb-d68c3bef1202",
    "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
    "expires_at": "2026-10-28T14:56:43.147214Z",
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

`POST /api/driver/v1/offers/51dd4e3d-9983-46ba-a1bb-d68c3bef1202/accept` → **200**

```json
{
  "command_id": "e2f8a8a6-061e-4613-b1cf-571e091b4ea8"
}
```

```json
{
  "id": "e4002ff6-7384-416d-89e8-9b554b017bd1",
  "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c0b80c55-b39d-4f42-b80a-e4be6dbc0234",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/513aee85-5b18-4878-80d4-c7a33cb8b59f/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:56:27.593719Z",
      "actor": {
        "type": "CLIENT",
        "id": "431e8cfd-13fb-4ea2-9052-1fbb6ad542a0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
        "quote_id": "318e1536-3afd-436f-a61b-6d1e1e205324",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c5c8b3d5-ea4a-45ba-a505-b5203866823a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:56:27.595679Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
        "attempt_id": "02f8269f-69c9-4d19-beb7-8f1b4a1360c3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c5c8b3d5-ea4a-45ba-a505-b5203866823a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:56:27.602555Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ac91e9af-e978-428f-9301-0464e80ebc54",
        "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "c5c8b3d5-ea4a-45ba-a505-b5203866823a"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-28T14:56:28.146095Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ac91e9af-e978-428f-9301-0464e80ebc54",
        "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f"
      },
      "correlation_id": "0c7fd6ba-f09f-4fd8-b11d-6665b9d540c1"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 513aee85-5b18-4878-80d4-c7a33cb8b59f — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/513aee85-5b18-4878-80d4-c7a33cb8b59f` → **200**

```json
{
  "id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
  "short_number": 6,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "431e8cfd-13fb-4ea2-9052-1fbb6ad542a0",
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
    "id": "e4002ff6-7384-416d-89e8-9b554b017bd1",
    "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "c0b80c55-b39d-4f42-b80a-e4be6dbc0234",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:56:27.593187Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/513aee85-5b18-4878-80d4-c7a33cb8b59f/cancel` → **200**

```json
{
  "command_id": "2306b6b1-3bc9-41bd-bb0d-f918e9df704e",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
  "short_number": 6,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "431e8cfd-13fb-4ea2-9052-1fbb6ad542a0",
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
    "id": "e4002ff6-7384-416d-89e8-9b554b017bd1",
    "order_id": "513aee85-5b18-4878-80d4-c7a33cb8b59f",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "c0b80c55-b39d-4f42-b80a-e4be6dbc0234",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:56:27.593187Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "session_id": "5620b9c3-5289-4699-834f-53808944ebcd",
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
  "last_heartbeat_at": "2026-10-28T14:56:24.033198Z",
  "last_location_at": "2026-10-28T14:56:24.033198Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5620b9c3-5289-4699-834f-53808944ebcd/close` → **200**

```json
{
  "command_id": "92f8eee1-224a-429a-b2fc-7d08cb96d5a5",
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
  "session_id": "23ca70d4-9b33-4009-be2b-4d4741cf9bbb",
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
  "last_heartbeat_at": "2026-10-28T14:56:25.398803Z",
  "last_location_at": "2026-10-28T14:56:25.398803Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/23ca70d4-9b33-4009-be2b-4d4741cf9bbb/close` → **200**

```json
{
  "command_id": "5feff998-f368-4aea-aa85-0e23842e6413",
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
  "settings_version": 1,
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
  "app_versions": {
    "rider_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "rider_ios": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
    "driver_android": {
      "minimum_version": "0.0.0",
      "latest_version": "0.0.0"
    },
```

## Driver signs in and goes online 200 m from the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2414"
}
```

```json
{
  "challenge_id": "a2ca4761-7254-4fc5-ae04-4a984a3fbc04",
  "expires_at": "2026-10-28T15:01:30.962768233Z",
  "resend_available_at": "2026-10-28T14:56:31.962768233Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "801329",
  "sent_at": "2026-10-28T14:56:30.966716224Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a2ca4761-7254-4fc5-ae04-4a984a3fbc04",
  "code": "801329",
  "device_ref": "sandbox-2414"
}
```

```json
{
  "session_id": "a766953f-d3ba-46eb-95a6-7152cb11669f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDI5MSwiaWF0IjoxNzkzMTk5MzkxLCJqdGkiOiIyNzVhZDQ3NS1mZTQ3LTRiZTEtYjI3YS1jYWE0YjA2MzJlZjUiLCJzaWQiOiJhNzY2OTUzZi1kM2JhLTQ2ZWItOTVhNi03MTUyY2IxMTY2OWYifQ.exk6CA26feK09aj_n9qlm3o6vX7DdzUahFZsPr0Q_uI",
  "access_expires_at": "2026-10-28T15:11:31.25467876Z",
  "refresh_token": "Pw2AhCPAbBjWmt2e1NXpVMRAfU68xyyPEO23YMgbVCs",
  "refresh_expires_at": "2026-11-27T14:56:31.25407265Z",
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
  "command_id": "edcf2596-225f-4072-afc2-2c7c54a48e60",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:31Z",
    "sequence": 1793199391778
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:31.798156Z",
  "last_location_at": "2026-10-28T14:56:31.798156Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672025273",
  "device_ref": "sandbox-2944"
}
```

```json
{
  "challenge_id": "58358a33-8bdc-447e-a7fc-776710ea5e8c",
  "expires_at": "2026-10-28T15:01:32.067987609Z",
  "resend_available_at": "2026-10-28T14:56:33.067987609Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672025273` → **200**

```json
{
  "phone": "+380672025273",
  "audience": "CLIENT",
  "code": "914525",
  "sent_at": "2026-10-28T14:56:32.070602427Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58358a33-8bdc-447e-a7fc-776710ea5e8c",
  "code": "914525",
  "device_ref": "sandbox-2944"
}
```

```json
{
  "session_id": "c99edbf2-ed7a-4697-a70d-5ae21b6d99ec",
  "subject": {
    "type": "CLIENT",
    "id": "38ad01d5-d1ef-4e30-ad40-849a60e9259c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOGFkMDFkNS1kMWVmLTRlMzAtYWQ0MC04NDlhNjBlOTI1OWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMjkyLCJpYXQiOjE3OTMxOTkzOTIsImp0aSI6IjhkNmVmMzdiLWFhMDctNDAzYS04YzlhLTY5ZWQ4ODAxYWUwMiIsInNpZCI6ImM5OWVkYmYyLWVkN2EtNDY5Ny1hNzBkLTVhZTIxYjZkOTllYyJ9.l_wGweJeRETnz0dU7eXPKH5WMJOtvbNnOWFMY39x0YM",
  "access_expires_at": "2026-10-28T15:11:32.361055492Z",
  "refresh_token": "lVEaFSHM1c-FsczJkghPeWN_P3AETdWXbd1sSvtvl6c",
  "refresh_expires_at": "2026-11-27T14:56:32.360500258Z",
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
  "command_id": "22fc9b90-ffc4-4c6c-870f-05b768298c43",
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
  "id": "38b15c9c-bc8c-45ec-96af-926e3ba7431d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:32.909430Z",
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
  "command_id": "967e0a54-eeb7-4ab9-8d04-2c2fba011e9f",
  "platform": "ANDROID",
  "token": "sandbox-driver-af1bc6ef-11f1-4d5c-a5bd-b005dcd0a1c8"
}
```

```json
{
  "id": "060e99c5-67e3-4b41-9fd8-2a83c56b1f52",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:56:33.20242Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "10952f2a-8670-4c52-be7f-1d34d8628274",
  "platform": "ANDROID",
  "token": "sandbox-rider-cffe2ecd-0a4b-4ca0-86ac-c0f4c7203cd5"
}
```

```json
{
  "id": "d4348814-bba1-4c02-9860-f6c947ef98b4",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-28T14:56:33.481543Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "35b303c0-f7f6-43b7-9703-b0f24508c272",
  "quote_id": "38b15c9c-bc8c-45ec-96af-926e3ba7431d",
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
  "id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "38ad01d5-d1ef-4e30-ad40-849a60e9259c",
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
  "created_at": "2026-10-28T14:56:33.754574Z",
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
    "id": "8a0ad703-2bed-4d30-bbb6-30c973cd1f0e",
    "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
    "expires_at": "2026-10-28T14:56:48.757814Z",
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

`POST /api/driver/v1/offers/8a0ad703-2bed-4d30-bbb6-30c973cd1f0e/accept` → **200**

```json
{
  "command_id": "f678f461-94f7-4e87-a978-477c0856bd3f"
}
```

```json
{
  "id": "d3137545-14ce-455b-a97d-892edb439cf4",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:56:33.728Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-28T14:56:33.728Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:56:35.170423247Z",
    "token_suffix": "d0a1c8",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "8245a033-bee8-4449-85fb-804546a52760",
      "order_version": "2",
      "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672025273&after=2026-10-28T14:56:33.728Z` → **200**

```json
[
  {
    "at": "2026-10-28T14:56:35.17265336Z",
    "token_suffix": "203cd5",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "ba596e4e-760d-4c5f-958f-b6843c9824cc",
      "order_version": "3",
      "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/bc926603-7549-4276-a609-b7e03e2243e5/messages` → **201**

```json
{
  "command_id": "14786a55-c89d-461b-8602-1814100ba247",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "c4ecf939-43c6-4036-9a8d-a1052dc7ce7a",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-28T14:56:35.666257416Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "assignment_id": "d3137545-14ce-455b-a97d-892edb439cf4",
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

`POST /api/driver/v1/trips/a9494df4-1e74-4003-9e69-fd568473a5e3/messages` → **201**

```json
{
  "command_id": "70cc3f6a-11ed-4366-b4e7-5289f9b9a994",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "c26803d1-7465-4941-9bd1-25c1169838e6",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-28T14:56:36.207640134Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/bc926603-7549-4276-a609-b7e03e2243e5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/a9494df4-1e74-4003-9e69-fd568473a5e3/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672025273"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:36Z",
    "sequence": 1793199396977
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:36.996615Z",
  "last_location_at": "2026-10-28T14:56:36.996615Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "assignment_id": "d3137545-14ce-455b-a97d-892edb439cf4",
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

`POST /api/driver/v1/trips/a9494df4-1e74-4003-9e69-fd568473a5e3/arrive` → **200**

```json
{
  "command_id": "1c4f72e4-8215-41cf-9dfc-f935eec4ab08",
  "expected_version": 0
}
```

```json
{
  "id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "assignment_id": "d3137545-14ce-455b-a97d-892edb439cf4",
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
  "arrived_at": "2026-10-28T14:56:37.515406Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a9494df4-1e74-4003-9e69-fd568473a5e3/start` → **200**

```json
{
  "command_id": "95671eee-803b-4c78-9847-d3c7a6633aad",
  "expected_version": 1
}
```

```json
{
  "id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "assignment_id": "d3137545-14ce-455b-a97d-892edb439cf4",
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
  "arrived_at": "2026-10-28T14:56:37.515406Z",
  "started_at": "2026-10-28T14:56:37.793844Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:38Z",
    "sequence": 1793199398555
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:38.07456Z",
  "last_location_at": "2026-10-28T14:56:38.07456Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/a9494df4-1e74-4003-9e69-fd568473a5e3/complete` → **200**

```json
{
  "command_id": "23265ff3-b273-4601-8ca6-b6bdc3c2b5d2",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:56:38Z",
  "cash_received": true
}
```

```json
{
  "id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "assignment_id": "d3137545-14ce-455b-a97d-892edb439cf4",
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
  "arrived_at": "2026-10-28T14:56:37.515406Z",
  "started_at": "2026-10-28T14:56:37.793844Z",
  "completed_at": "2026-10-28T14:56:38.349507Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/bc926603-7549-4276-a609-b7e03e2243e5` → **200**

```json
{
  "id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "short_number": 7,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "38ad01d5-d1ef-4e30-ad40-849a60e9259c",
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
    "id": "d3137545-14ce-455b-a97d-892edb439cf4",
    "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:56:33.754574Z",
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
    "id": "bc926603-7549-4276-a609-b7e03e2243e5",
    "short_number": 7,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:56:33.754574Z",
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
    "id": "a9494df4-1e74-4003-9e69-fd568473a5e3",
    "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
    "order_short_number": 7,
    "created_at": "2026-10-28T14:56:34.312155Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "8e49cc38-27db-40c1-ad4f-bab220734c73",
    "order_id": "d343903a-f4a9-493f-ba09-f615541b178e",
    "order_short_number": 1,
    "created_at": "2026-10-28T14:55:04.974804Z",
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

`GET /api/rider/v1/orders/bc926603-7549-4276-a609-b7e03e2243e5/tip` → **200**

```json
{
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
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
  "available_until": "2026-10-29T14:56:38.349507Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/bc926603-7549-4276-a609-b7e03e2243e5/tip` → **201**

```json
{
  "command_id": "a7a061f3-3610-4e04-8253-774b4cde6919",
  "amount_minor": 1100
}
```

```json
{
  "id": "da3f650a-5e81-4b75-8d34-d9cb314c35a6",
  "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-28T14:56:43.292496Z"
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
  "session_id": "f96e5ad9-fd2b-4d4f-bfa5-b7cc0b85a6b8",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMDMsImlhdCI6MTc5MzE5OTQwMywianRpIjoiNGE5ZjBiNWItODYxYy00YTRkLWE1Y2EtMDBkNThjNjdiZWJhIiwic2lkIjoiZjk2ZTVhZDktZmQyYi00ZDRmLWJmYTUtYjdjYzBiODVhNmI4In0.chmhFysEGG55x6Oy49o59oM4IvhtnRet9JBdwYA5mPc",
  "access_expires_at": "2026-10-28T15:11:43.857320077Z",
  "refresh_token": "ob7snGOXwK4JzXmk0tCH1wflO_g9INovJdV9FFgY5Os",
  "refresh_expires_at": "2026-10-29T02:56:43.856773509Z",
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
          "CARD": 1,
          "CASH": 6
        },
        "cancelled_by": {
          "RIDER": 2,
          "STAFF": 1,
          "DRIVER": 1
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
      "CARD": 1,
      "CASH": 6
    },
    "cancelled_by": {
      "RIDER": 2,
      "STAFF": 1,
      "DRIVER": 1
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
  "generated_at": "2026-10-28T14:56:44.12173072Z"
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
  "generated_at": "2026-10-28T14:56:44.392011357Z"
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
  "session_id": "f3c52c45-90fc-44f0-9b17-39378eaf0608",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMDQsImlhdCI6MTc5MzE5OTQwNCwianRpIjoiMWRiZmUxNzAtYmE1ZS00YmE2LWIyYjYtODNmMGM2NWI2ZjEyIiwic2lkIjoiZjNjNTJjNDUtOTBmYy00NGYwLTliMTctMzkzNzhlYWYwNjA4In0.roywcwvWA33u0nmXwGlRgI74v4ytq5Ls5RQYN2ZMF6M",
  "access_expires_at": "2026-10-28T15:11:44.950048965Z",
  "refresh_token": "4SMigDaxwW1EN0VB4f5efxGHQ0W_7rvjQSw8KhQCoKU",
  "refresh_expires_at": "2026-10-29T02:56:44.949371792Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/bc926603-7549-4276-a609-b7e03e2243e5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:56:33.755113Z",
      "actor": {
        "type": "CLIENT",
        "id": "38ad01d5-d1ef-4e30-ad40-849a60e9259c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
        "quote_id": "38b15c9c-bc8c-45ec-96af-926e3ba7431d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "dae7d73a-a0a9-4519-8d28-a22270c709e8"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:56:33.756989Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
        "attempt_id": "a7a7e2b4-2074-41ac-8130-e8880a1bbcf6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "dae7d73a-a0a9-4519-8d28-a22270c709e8"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:56:33.763409Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "8a0ad703-2bed-4d30-bbb6-30c973cd1f0e",
        "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "dae7d73a-a0a9-4519-8d28-a22270c709e8"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:56:34.314136Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "8a0ad703-2bed-4d30-bbb6-30c973cd1f0e",
        "order_id": "bc926603-7549-4276-a609-b7e03e2243e5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "d3137545-14ce-455b-a97d-892edb439cf4"
      },
      "correlation_id": "69848b0e-2506-4143-9d37-723ecabb1668"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-28T14:56:45.48447192Z",
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
      "last_location_at": "2026-10-28T14:56:38.07456Z",
      "order_id": null
    }
  ]
}
```

Done: order bc926603-7549-4276-a609-b7e03e2243e5.

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
  "session_id": "3825fcf0-25ba-4aa3-ace6-d1b913d37da1",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMDYsImlhdCI6MTc5MzE5OTQwNiwianRpIjoiMTg5MzUzMjMtZGE3Ni00NzE2LWIwYTItMTllMzk0YzJjZDMwIiwic2lkIjoiMzgyNWZjZjAtMjViYS00YWEzLWFjZTYtZDFiOTEzZDM3ZGExIn0.qhrGm24Q-6s_Aj87w3wesoo0oOro9Luoa1tqGqx79c8",
  "access_expires_at": "2026-10-28T15:11:46.067250384Z",
  "refresh_token": "ZgcsZpk5DPeUHbwT7aB2BfcWGYDcno2y_82vrPSl_wI",
  "refresh_expires_at": "2026-10-29T02:56:46.066590484Z",
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
  "command_id": "6a6da7c5-af4f-4f33-ae9a-9421c682f194",
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
  "timestamp": "2026-10-28T14:56:46.000+0000",
  "channel": {
    "id": "1730052000.821215784",
    "linkedid": "1730052000.821215784",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672230224"
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
  "timestamp": "2026-10-28T14:56:46.000+0000",
  "channel": {
    "id": "1730052000.821215784",
    "linkedid": "1730052000.821215784",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672230224"
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
  "session_id": "0e9e4687-4e6d-49b3-a5c5-6909ddcabf99",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMDcsImlhdCI6MTc5MzE5OTQwNywianRpIjoiODJkOWIzYWMtNjBiMy00MDkzLTk5ODgtOTAxYWQ2ZTQ2MDFjIiwic2lkIjoiMGU5ZTQ2ODctNGU2ZC00OWIzLWE1YzUtNjkwOWRkY2FiZjk5In0.5JC3aAvUIzmyoHGNYjnQYPURVrWX9De0jvZ_6O9tgJo",
  "access_expires_at": "2026-10-28T15:11:47.208134026Z",
  "refresh_token": "h8FJEuwX2k--Eklp_7rqxG8Bj-obPwVvfdkXHF_nVng",
  "refresh_expires_at": "2026-10-29T02:56:47.207592848Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "2c208a2c-65d9-4911-b4fb-1cee1cc690b6",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672230224",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-28T14:56:46Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/2c208a2c-65d9-4911-b4fb-1cee1cc690b6/answer` → **200**

```json
{
  "command_id": "115b3e65-8ec1-4bd3-99c4-c94c07d559cb"
}
```

```json
{
  "id": "2c208a2c-65d9-4911-b4fb-1cee1cc690b6",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672230224",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "order_ids": [],
  "started_at": "2026-10-28T14:56:46Z",
  "answered_at": "2026-10-28T14:56:47.746041Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.821215784",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "d8dcfeb2-2fd2-4317-bd9c-c9cb2776510c",
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
  "id": "703f54dc-3bb8-42ba-a064-7dd68b990b4c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:48.044922Z",
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
  "command_id": "ac03cb83-0e3f-455f-95ec-5fcb6289169e",
  "quote_id": "703f54dc-3bb8-42ba-a064-7dd68b990b4c",
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
    "phone": "+380672230224"
  },
  "call_id": "2c208a2c-65d9-4911-b4fb-1cee1cc690b6"
}
```

```json
{
  "id": "b3899eba-ca09-4636-9f34-f5503e0286c0",
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
  "created_at": "2026-10-28T14:56:48.335579Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672230224"
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
    "id": "1730052000.821215784",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "2c208a2c-65d9-4911-b4fb-1cee1cc690b6",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672230224",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [
        "b3899eba-ca09-4636-9f34-f5503e0286c0"
      ],
      "started_at": "2026-10-28T14:56:46Z",
      "answered_at": "2026-10-28T14:56:47.746041Z",
      "ended_at": "2026-10-28T14:56:48.623876Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "c68709ee-8ddf-4c76-9dbe-dea9fc63f818",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670705825",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [],
      "started_at": "2026-10-28T14:55:12.883906Z",
      "answered_at": "2026-10-28T14:55:13.189055Z",
      "ended_at": "2026-10-28T14:55:13.475573Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:55:19.899594Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/b3899eba-ca09-4636-9f34-f5503e0286c0` → **200**

```json
{
  "id": "b3899eba-ca09-4636-9f34-f5503e0286c0",
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
  "created_at": "2026-10-28T14:56:48.335579Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672230224"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/b3899eba-ca09-4636-9f34-f5503e0286c0` → **200**

```json
{
  "id": "b3899eba-ca09-4636-9f34-f5503e0286c0",
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
  "created_at": "2026-10-28T14:56:48.335579Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672230224"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/b3899eba-ca09-4636-9f34-f5503e0286c0/cancel` → **200**

```json
{
  "command_id": "17ecbc97-7074-402e-8f6a-566b0f88ab8c",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "b3899eba-ca09-4636-9f34-f5503e0286c0",
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
  "created_at": "2026-10-28T14:56:48.335579Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672230224"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
      "uk": "Немає вільних авто"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 2c208a2c-65d9-4911-b4fb-1cee1cc690b6 with order b3899eba-ca09-4636-9f34-f5503e0286c0.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11060"
}
```

```json
{
  "challenge_id": "0e754f17-7fc0-4566-a092-182faceec29e",
  "expires_at": "2026-10-28T15:01:49.768388414Z",
  "resend_available_at": "2026-10-28T14:56:50.768388414Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "482881",
  "sent_at": "2026-10-28T14:56:49.770550689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e754f17-7fc0-4566-a092-182faceec29e",
  "code": "482881",
  "device_ref": "sandbox-11060"
}
```

```json
{
  "session_id": "2fca97e2-b6b4-40c2-a796-07e2c05c3a72",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMxMCwiaWF0IjoxNzkzMTk5NDEwLCJqdGkiOiJlOWFiODFhZC00OGVlLTRhYmUtYmQ0Yi04ZTZkYzVlYzE1MjYiLCJzaWQiOiIyZmNhOTdlMi1iNmI0LTQwYzItYTc5Ni0wN2UyYzA1YzNhNzIifQ.kundEPuXSyDat1SWE1RrOdgQ_T2IAy8YQooR_39H4ns",
  "access_expires_at": "2026-10-28T15:11:50.064670699Z",
  "refresh_token": "5FbyzvrpQaiaEtZBK2_qHRXjDv4kvl7Wosw9_JTV9zo",
  "refresh_expires_at": "2026-11-27T14:56:50.064076282Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:38.07456Z",
  "last_location_at": "2026-10-28T14:56:38.07456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/handover` → **200**

```json
{
  "command_id": "3542f03d-da02-438e-a11e-69e348bca923",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:38.07456Z",
  "last_location_at": "2026-10-28T14:56:38.07456Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:50Z",
    "sequence": 1793199410858
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:50.87813Z",
  "last_location_at": "2026-10-28T14:56:50.87813Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380669320673",
  "device_ref": "sandbox-18388"
}
```

```json
{
  "challenge_id": "511d2a90-ab11-4009-ba24-9f325fc5bb3a",
  "expires_at": "2026-10-28T15:01:51.136357284Z",
  "resend_available_at": "2026-10-28T14:56:52.136357284Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380669320673` → **200**

```json
{
  "phone": "+380669320673",
  "audience": "CLIENT",
  "code": "151175",
  "sent_at": "2026-10-28T14:56:51.13843391Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "511d2a90-ab11-4009-ba24-9f325fc5bb3a",
  "code": "151175",
  "device_ref": "sandbox-18388"
}
```

```json
{
  "session_id": "2598402f-b671-41e8-a33a-7515a077f45a",
  "subject": {
    "type": "CLIENT",
    "id": "881b6865-df3e-4dc5-8bfb-3923ab739847"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ODFiNjg2NS1kZjNlLTRkYzUtOGJmYi0zOTIzYWI3Mzk4NDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzExLCJpYXQiOjE3OTMxOTk0MTEsImp0aSI6ImE5NzU2MDkwLTMxZjEtNGU3YS1iZDc4LTM1ZDRkNjNiNjVjMCIsInNpZCI6IjI1OTg0MDJmLWI2NzEtNDFlOC1hMzNhLTc1MTVhMDc3ZjQ1YSJ9.AiV3HCZMzNlyA0TmJIlYG2ZwxXGcHYFVqmAiNmUULeo",
  "access_expires_at": "2026-10-28T15:11:51.439381432Z",
  "refresh_token": "iaBBpixBvcZthU9sL3CJr1F7dq9CA8hJ7jk9UqmDVE4",
  "refresh_expires_at": "2026-11-27T14:56:51.438801031Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c745bd2d-3b64-4680-b2e8-a5c9443f30f4",
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
  "id": "81ed7a92-2b98-400a-8c94-237b56e6d561",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:01:51.707972Z",
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
  "command_id": "f9856069-af63-4f2c-9808-6bbe5db5f3cd",
  "quote_id": "81ed7a92-2b98-400a-8c94-237b56e6d561",
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
  "id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "881b6865-df3e-4dc5-8bfb-3923ab739847",
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
  "created_at": "2026-10-28T14:56:51.985945Z",
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
    "id": "76f8a03e-2c25-4843-a628-c11726ef25aa",
    "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
    "expires_at": "2026-10-28T14:57:06.989224Z",
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

`POST /api/driver/v1/offers/76f8a03e-2c25-4843-a628-c11726ef25aa/accept` → **200**

```json
{
  "command_id": "19f85158-6b02-4f6f-842b-504bdf728153"
}
```

```json
{
  "id": "17ac5e1f-2dde-4b9b-bc89-67551384e898",
  "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4c0dc7ed-8054-4983-b8a6-c803c5230e43",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4c0dc7ed-8054-4983-b8a6-c803c5230e43",
  "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
  "assignment_id": "17ac5e1f-2dde-4b9b-bc89-67551384e898",
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

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:53Z",
    "sequence": 1793199413494
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:53.069926Z",
  "last_location_at": "2026-10-28T14:56:53.069926Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4c0dc7ed-8054-4983-b8a6-c803c5230e43/arrive` → **200**

```json
{
  "command_id": "1a3370de-0e3b-4aa6-9f48-044d0f235298",
  "expected_version": 0
}
```

```json
{
  "id": "4c0dc7ed-8054-4983-b8a6-c803c5230e43",
  "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
  "assignment_id": "17ac5e1f-2dde-4b9b-bc89-67551384e898",
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
  "arrived_at": "2026-10-28T14:56:53.34262Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4c0dc7ed-8054-4983-b8a6-c803c5230e43/start` → **200**

```json
{
  "command_id": "d6ce4a0e-3c4f-4e7a-a526-b6fee7257831",
  "expected_version": 1
}
```

```json
{
  "id": "4c0dc7ed-8054-4983-b8a6-c803c5230e43",
  "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
  "assignment_id": "17ac5e1f-2dde-4b9b-bc89-67551384e898",
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
  "arrived_at": "2026-10-28T14:56:53.34262Z",
  "started_at": "2026-10-28T14:56:53.620601Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:53Z",
    "sequence": 1793199413895
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:53.914045Z",
  "last_location_at": "2026-10-28T14:56:53.914045Z",
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
  "device_ref": "sandbox-32690"
}
```

```json
{
  "challenge_id": "a954ceb6-f020-42d4-a39e-213bb97e67f4",
  "expires_at": "2026-10-28T15:01:54.178956772Z",
  "resend_available_at": "2026-10-28T14:56:55.178956772Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "460422",
  "sent_at": "2026-10-28T14:56:54.181257269Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a954ceb6-f020-42d4-a39e-213bb97e67f4",
  "code": "460422",
  "device_ref": "sandbox-32690"
}
```

```json
{
  "session_id": "22152769-0c89-4d12-b7e1-6a6e339e628e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMxNCwiaWF0IjoxNzkzMTk5NDE0LCJqdGkiOiI1MjdiOTI4ZS1iYmZjLTRkOTItOGY2NC0wZWE2Y2YzY2Q5ODQiLCJzaWQiOiIyMjE1Mjc2OS0wYzg5LTRkMTItYjdlMS02YTZlMzM5ZTYyOGUifQ.JvOg2fzHx4xeNHrumByyVXVRD791GARNMROGARsmlqE",
  "access_expires_at": "2026-10-28T15:11:54.467237372Z",
  "refresh_token": "PuFz9xo4KmTjArQOMz8NC2bk7z6Ei5TGi4MvbVnjZUc",
  "refresh_expires_at": "2026-11-27T14:56:54.466740307Z",
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
  "command_id": "fa0312c0-a2d6-40e8-b0ba-83301ac352b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:54Z",
    "sequence": 1793199414985
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:56:55.006483Z",
  "last_location_at": "2026-10-28T14:56:55.006483Z",
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
  "session_id": "03d3180e-53f6-4a37-aa3c-de665ac3b4a3",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMTUsImlhdCI6MTc5MzE5OTQxNSwianRpIjoiNzAyMDYyZjgtNThiOS00OGFjLWJjY2QtMjJiOWRhNzBmM2RkIiwic2lkIjoiMDNkMzE4MGUtNTNmNi00YTM3LWFhM2MtZGU2NjVhYzNiNGEzIn0.5U0lAFb2Sz5ydOZ2GD49FyFewqCjSLxr0R6_T8a_Z_M",
  "access_expires_at": "2026-10-28T15:11:55.57733307Z",
  "refresh_token": "SU1XrQp5srB4xOT0fkAsu-aGW2UPsj89-f9qtbAC6OI",
  "refresh_expires_at": "2026-10-29T02:56:55.576703506Z",
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
  "session_id": "21e8026b-3267-4d56-b2b8-5011010252e1",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMTYsImlhdCI6MTc5MzE5OTQxNiwianRpIjoiN2U5YjRiYjEtOTg5YS00Y2YyLWI4NjItZTk2YmQ1MTY2YWNmIiwic2lkIjoiMjFlODAyNmItMzI2Ny00ZDU2LWIyYjgtNTAxMTAxMDI1MmUxIn0.5Wtx93Je-Bn6IQtyq4VzyrjMWC2YvzDwteKw4HxhPto",
  "access_expires_at": "2026-10-28T15:11:56.128430621Z",
  "refresh_token": "VULcTTqqJmspYyIvkqS0twMxTcA-88AWAMjNhVOgnXM",
  "refresh_expires_at": "2026-10-29T02:56:56.127878914Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9e1bba63-dafb-4ff6-959c-5f18f168ed77` → **200**

```json
{
  "id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
  "short_number": 9,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "881b6865-df3e-4dc5-8bfb-3923ab739847",
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
    "id": "17ac5e1f-2dde-4b9b-bc89-67551384e898",
    "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4c0dc7ed-8054-4983-b8a6-c803c5230e43",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-28T14:56:51.985945Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9e1bba63-dafb-4ff6-959c-5f18f168ed77/interrupt` → **200**

```json
{
  "command_id": "9cd80724-dc77-4c5e-ab75-919b12702baf",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
    "short_number": 9,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "881b6865-df3e-4dc5-8bfb-3923ab739847",
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
      "id": "17ac5e1f-2dde-4b9b-bc89-67551384e898",
      "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "4c0dc7ed-8054-4983-b8a6-c803c5230e43",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-28T14:56:51.985945Z",
    "caller": null,
    "cancellation": {
      "by": "STAFF",
      "reason_code": "VEHICLE_BREAKDOWN",
      "reason_labels": {
        "pl": "Awaria auta w trasie",
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
        "uk": "Поломка автомобіля в дорозі"
      }
    },
    "pickup_at": null,
    "preorder": false,
    "reservation": null,
    "related_order_id": null
  },
  "follow_up": {
    "id": "79340adb-7283-4ca5-932a-bce68abe5201",
    "short_number": 10,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "881b6865-df3e-4dc5-8bfb-3923ab739847",
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
    "id": "68e1041e-9845-4eb1-b4a2-b756923e48c7",
    "order_id": "79340adb-7283-4ca5-932a-bce68abe5201",
    "expires_at": "2026-10-28T14:57:11.697169Z",
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

`POST /api/driver/v1/offers/68e1041e-9845-4eb1-b4a2-b756923e48c7/accept` → **200**

```json
{
  "command_id": "3ed3bf79-497e-4fe7-88c6-2f34d1c51077"
}
```

```json
{
  "id": "e91a02bf-e485-413c-b360-75aec1f38246",
  "order_id": "79340adb-7283-4ca5-932a-bce68abe5201",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "00f33e02-d36f-4e5d-97a5-ceb0dfb44a91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "00f33e02-d36f-4e5d-97a5-ceb0dfb44a91",
  "order_id": "79340adb-7283-4ca5-932a-bce68abe5201",
  "assignment_id": "e91a02bf-e485-413c-b360-75aec1f38246",
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
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:56:55.006483Z",
  "last_location_at": "2026-10-28T14:56:55.006483Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/644f4cba-9acd-4593-b6cd-29d6f90debde/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:56:58Z",
    "sequence": 1793199418610
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:56:58.080841Z",
  "last_location_at": "2026-10-28T14:56:58.080841Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/00f33e02-d36f-4e5d-97a5-ceb0dfb44a91/arrive` → **200**

```json
{
  "command_id": "ed4574d3-1f12-4154-90dc-958086c9c54c",
  "expected_version": 0
}
```

```json
{
  "id": "00f33e02-d36f-4e5d-97a5-ceb0dfb44a91",
  "order_id": "79340adb-7283-4ca5-932a-bce68abe5201",
  "assignment_id": "e91a02bf-e485-413c-b360-75aec1f38246",
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
  "arrived_at": "2026-10-28T14:56:58.35736Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/00f33e02-d36f-4e5d-97a5-ceb0dfb44a91/start` → **200**

```json
{
  "command_id": "7d03f7d1-7546-40ce-99ac-0de1b8b79c6c",
  "expected_version": 1
}
```

```json
{
  "id": "00f33e02-d36f-4e5d-97a5-ceb0dfb44a91",
  "order_id": "79340adb-7283-4ca5-932a-bce68abe5201",
  "assignment_id": "e91a02bf-e485-413c-b360-75aec1f38246",
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
  "arrived_at": "2026-10-28T14:56:58.35736Z",
  "started_at": "2026-10-28T14:56:58.636248Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/00f33e02-d36f-4e5d-97a5-ceb0dfb44a91/complete` → **200**

```json
{
  "command_id": "33b36c7e-0b2a-44ee-96e2-503aa746039d",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:56:58Z"
}
```

```json
{
  "id": "00f33e02-d36f-4e5d-97a5-ceb0dfb44a91",
  "order_id": "79340adb-7283-4ca5-932a-bce68abe5201",
  "assignment_id": "e91a02bf-e485-413c-b360-75aec1f38246",
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
  "arrived_at": "2026-10-28T14:56:58.35736Z",
  "started_at": "2026-10-28T14:56:58.636248Z",
  "completed_at": "2026-10-28T14:56:58.915558Z",
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
    "id": "79340adb-7283-4ca5-932a-bce68abe5201",
    "short_number": 10,
    "status": "FULFILLED",
    "created_at": "2026-10-28T14:56:56.6882Z",
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
    "id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
    "short_number": 9,
    "status": "CANCELLED",
    "created_at": "2026-10-28T14:56:51.985945Z",
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
        "ru": "Поломка автомобиля в пути",
        "en": "Vehicle broke down on the way",
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

`GET /api/operator/v1/orders/9e1bba63-dafb-4ff6-959c-5f18f168ed77/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-28T14:56:51.986447Z",
      "actor": {
        "type": "CLIENT",
        "id": "881b6865-df3e-4dc5-8bfb-3923ab739847",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
        "quote_id": "81ed7a92-2b98-400a-8c94-237b56e6d561",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "95a10015-c837-48c5-8bab-2534f2ca2126"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-28T14:56:51.988392Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
        "attempt_id": "de8a7e73-e8c4-49ce-8047-b2fd3c538b0b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "95a10015-c837-48c5-8bab-2534f2ca2126"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-28T14:56:51.992081Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "76f8a03e-2c25-4843-a628-c11726ef25aa",
        "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "95a10015-c837-48c5-8bab-2534f2ca2126"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-28T14:56:52.530793Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "76f8a03e-2c25-4843-a628-c11726ef25aa",
        "order_id": "9e1bba63-dafb-4ff6-959c-5f18f168ed77",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "17ac5e1f-2dde-4b9b-bc89-67551384e898"
      },
      "correlation_id": "656820bc-2ed2-4564-9d1a-df593fc4a5bc"
```

Done: interrupted 9e1bba63-dafb-4ff6-959c-5f18f168ed77, follow-up 79340adb-7283-4ca5-932a-bce68abe5201.

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
  "session_id": "0f73a350-f282-43d8-957b-b28ce3949395",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMjMsImlhdCI6MTc5MzE5OTQyMywianRpIjoiYjc2MTQxNjEtNmFhYS00N2QxLWFkYzgtMDM5NjhkM2ZmYjA3Iiwic2lkIjoiMGY3M2EzNTAtZjI4Mi00M2Q4LTk1N2ItYjI4Y2UzOTQ5Mzk1In0.NMXx92gu4Z8E_6BdwLQv0Y-udnlX8M5-zYqRQqJxcwc",
  "access_expires_at": "2026-10-28T15:12:03.279313636Z",
  "refresh_token": "oVqXMy6nBCGskHcTXaJXgBAzC1elmD3OQx0r2qxbLPU",
  "refresh_expires_at": "2026-10-29T02:57:03.278790773Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "42cc2051-af10-4e81-bf24-03f893bb1310",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:03Z"
}
```

```json
{
  "id": "4021e679-f10d-4f12-8648-e47898aaaec2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:03Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4021e679-f10d-4f12-8648-e47898aaaec2/publish` → **200**

```json
{
  "command_id": "5da190df-6c06-4635-8067-289ef71f46f5",
  "expected_version": 0
}
```

```json
{
  "id": "4021e679-f10d-4f12-8648-e47898aaaec2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:03.830767Z",
  "published_at": "2026-10-28T14:57:03.830767Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4021e679-f10d-4f12-8648-e47898aaaec2",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-28T14:57:03.830767Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639595680",
  "device_ref": "sandbox-10077"
}
```

```json
{
  "challenge_id": "fa877818-f1c9-4c3e-a166-f31a05491594",
  "expires_at": "2026-10-28T15:02:04.354213125Z",
  "resend_available_at": "2026-10-28T14:57:05.354213125Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639595680` → **200**

```json
{
  "phone": "+380639595680",
  "audience": "CLIENT",
  "code": "554080",
  "sent_at": "2026-10-28T14:57:04.357126793Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fa877818-f1c9-4c3e-a166-f31a05491594",
  "code": "554080",
  "device_ref": "sandbox-10077"
}
```

```json
{
  "session_id": "2567895f-406f-418f-a5b6-c3ae42903dab",
  "subject": {
    "type": "CLIENT",
    "id": "515178ef-d586-4723-b3ae-570c9791f8b4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1MTUxNzhlZi1kNTg2LTQ3MjMtYjNhZS01NzBjOTc5MWY4YjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzI0LCJpYXQiOjE3OTMxOTk0MjQsImp0aSI6IjlmMDMzZDAzLTEyNzItNGUwOC1hNGFkLWZhZTA5ODJlN2ExYyIsInNpZCI6IjI1Njc4OTVmLTQwNmYtNDE4Zi1hNWI2LWMzYWU0MjkwM2RhYiJ9.gUHNndR3-qlkEQXBxElbUBzUsL8jC8uRbpGZvNlFYZw",
  "access_expires_at": "2026-10-28T15:12:04.645674508Z",
  "refresh_token": "DvZ-d8OdbRkY1mk1wBEoQBloEidz9dinAe92cVrSTcE",
  "refresh_expires_at": "2026-11-27T14:57:04.64514917Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4021e679-f10d-4f12-8648-e47898aaaec2",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-28T14:57:03.830767Z",
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
  "command_id": "ce337354-c4d4-46fc-90a2-21b1553bd254",
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
  "id": "7deb2213-20e8-4901-ac7a-07fbd76f5f84",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:05.171348Z",
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
  "command_id": "a6740493-d906-4f09-a040-a52b23d5c0ec",
  "quote_id": "7deb2213-20e8-4901-ac7a-07fbd76f5f84",
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
  "correlation_id": "8c5faf3d-aae0-4eb0-93e8-d384f25b93be"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "326c580b-8b9b-4d4c-b695-4a5e8a03b4f5",
  "version_id": "4021e679-f10d-4f12-8648-e47898aaaec2",
  "language": "uk"
}
```

```json
{
  "version_id": "4021e679-f10d-4f12-8648-e47898aaaec2",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-28T14:57:05.709653Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a5123da9-9181-4d1a-8b00-627a92c9511c",
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
  "id": "e9d5d20d-0634-47ee-ba95-d885533628b8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:05.967848Z",
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
  "command_id": "2f54e8a0-b644-4ed0-a058-a600fcd0f579",
  "quote_id": "e9d5d20d-0634-47ee-ba95-d885533628b8",
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
  "id": "b853ac8b-9d77-41e8-9c33-cfd44201cabf",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "515178ef-d586-4723-b3ae-570c9791f8b4",
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
  "created_at": "2026-10-28T14:57:06.256909Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`GET /api/rider/v1/orders/b853ac8b-9d77-41e8-9c33-cfd44201cabf` → **200**

```json
{
  "id": "b853ac8b-9d77-41e8-9c33-cfd44201cabf",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "515178ef-d586-4723-b3ae-570c9791f8b4",
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
  "created_at": "2026-10-28T14:57:06.256909Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b853ac8b-9d77-41e8-9c33-cfd44201cabf/cancel` → **200**

```json
{
  "command_id": "b2ea1dcf-9183-4cb6-b8e5-02839c981994",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b853ac8b-9d77-41e8-9c33-cfd44201cabf",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "515178ef-d586-4723-b3ae-570c9791f8b4",
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
  "created_at": "2026-10-28T14:57:06.256909Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`POST /api/admin/v1/legal-documents/4021e679-f10d-4f12-8648-e47898aaaec2` → **409**

```json
{
  "command_id": "c4cc5e4d-557c-4f35-b67e-5c7295e46dac",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-28T14:57:07Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4021e679-f10d-4f12-8648-e47898aaaec2",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7fc08164-3b04-4430-9ee2-dc34dd8b4c7b"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "397eb278-074c-4b08-bd39-d87c90b179ac",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:57:07Z"
}
```

```json
{
  "id": "71a691ef-93c9-4430-8c5b-0e44a30d022a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:57:07Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/71a691ef-93c9-4430-8c5b-0e44a30d022a/publish` → **200**

```json
{
  "command_id": "de82195f-843a-47fb-863d-50eff28ff7d6",
  "expected_version": 0
}
```

```json
{
  "id": "71a691ef-93c9-4430-8c5b-0e44a30d022a",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-28T14:57:07.766501Z",
  "published_at": "2026-10-28T14:57:07.766501Z",
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
  "device_ref": "sandbox-19776"
}
```

```json
{
  "challenge_id": "8b9ce7fb-3d83-4590-b409-eb8d5d994e8b",
  "expires_at": "2026-10-28T15:02:08.042830998Z",
  "resend_available_at": "2026-10-28T14:57:09.042830998Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "579813",
  "sent_at": "2026-10-28T14:57:08.045319999Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b9ce7fb-3d83-4590-b409-eb8d5d994e8b",
  "code": "579813",
  "device_ref": "sandbox-19776"
}
```

```json
{
  "session_id": "3d659ded-31a6-4606-89ea-75621c5a466c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMyOCwiaWF0IjoxNzkzMTk5NDI4LCJqdGkiOiI5NmZkMDQyYS1kYTg2LTRkZTEtODUyNS1iNTZkMzljNTZhNGQiLCJzaWQiOiIzZDY1OWRlZC0zMWE2LTQ2MDYtODllYS03NTYyMWM1YTQ2NmMifQ.TnyOTCV7I3-iY1JGRwFLqvXl8APi-ALLdon4Y06uutE",
  "access_expires_at": "2026-10-28T15:12:08.344624315Z",
  "refresh_token": "KYqdksiLiYinvSBdUciqYzRFKv0dWnsfUnJ5ogQQAok",
  "refresh_expires_at": "2026-11-27T14:57:08.343989694Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:56:58.080841Z",
  "last_location_at": "2026-10-28T14:56:58.080841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/644f4cba-9acd-4593-b6cd-29d6f90debde/handover` → **200**

```json
{
  "command_id": "5cdfb311-96ff-4f5d-abb6-80ba881b1e33",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:56:58.080841Z",
  "last_location_at": "2026-10-28T14:56:58.080841Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/644f4cba-9acd-4593-b6cd-29d6f90debde/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:09Z",
    "sequence": 1793199429126
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:57:09.145893Z",
  "last_location_at": "2026-10-28T14:57:09.145893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673683529",
  "device_ref": "sandbox-20785"
}
```

```json
{
  "challenge_id": "1d5f9362-3700-48d3-8a25-0ccf8d808776",
  "expires_at": "2026-10-28T15:02:09.417531298Z",
  "resend_available_at": "2026-10-28T14:57:10.417531298Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673683529` → **200**

```json
{
  "phone": "+380673683529",
  "audience": "CLIENT",
  "code": "076342",
  "sent_at": "2026-10-28T14:57:09.420278823Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d5f9362-3700-48d3-8a25-0ccf8d808776",
  "code": "076342",
  "device_ref": "sandbox-20785"
}
```

```json
{
  "session_id": "c1f443db-f840-4562-9813-5f45282a235d",
  "subject": {
    "type": "CLIENT",
    "id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZDQ4ZDZjOS1jMWRjLTQ1ZmUtYTA4MC0xYWMwNDk5OGRiODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzI5LCJpYXQiOjE3OTMxOTk0MjksImp0aSI6ImU0OTVjOGM3LTc4YmUtNDA5ZC1iYmQyLWEwMmMzYWJhZDY4MyIsInNpZCI6ImMxZjQ0M2RiLWY4NDAtNDU2Mi05ODEzLTVmNDUyODJhMjM1ZCJ9.VJfiwNoILhG0JZilHbhzUESUrzTYb5oOXy16osbD1-k",
  "access_expires_at": "2026-10-28T15:12:09.735602539Z",
  "refresh_token": "AdyYKJejqve53CHDfBiTqXlieOBL5ArMyxNQgyXQrH8",
  "refresh_expires_at": "2026-11-27T14:57:09.735074856Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e1eaee8-e0fa-4a26-8308-eb1d3ba19a71",
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
  "id": "0491f924-a404-487c-8c6e-137b2d835d0d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:10.014346Z",
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
  "command_id": "8331d794-0b3f-4be8-94ad-972d3af5fdd9",
  "quote_id": "0491f924-a404-487c-8c6e-137b2d835d0d",
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
    "phone": "+380675329974"
  }
}
```

```json
{
  "id": "32393948-0217-4899-8b7c-a1b75a1228ca",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:10.295054Z",
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
    "id": "45ca150d-95ca-4a96-8804-7dbe2d350c46",
    "order_id": "32393948-0217-4899-8b7c-a1b75a1228ca",
    "expires_at": "2026-10-28T14:57:25.298612Z",
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

`POST /api/driver/v1/offers/45ca150d-95ca-4a96-8804-7dbe2d350c46/accept` → **200**

```json
{
  "command_id": "9a210c32-21c9-46a0-a275-3748d0b400b8"
}
```

```json
{
  "id": "1a019c66-e5c6-4121-a760-e9d63aeb7695",
  "order_id": "32393948-0217-4899-8b7c-a1b75a1228ca",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d42427b1-f426-4656-ab77-0040fb81832b",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d42427b1-f426-4656-ab77-0040fb81832b",
  "order_id": "32393948-0217-4899-8b7c-a1b75a1228ca",
  "assignment_id": "1a019c66-e5c6-4121-a760-e9d63aeb7695",
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
    "phone": "+380675329974"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55d62464-1c3a-4fc8-8bda-655b9f3c2bfb",
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
  "id": "d825575c-25e3-419b-bfd5-c778d0f9fe03",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:11.391770Z",
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
  "command_id": "19151a16-aff0-4481-8e03-87e7e8f12683",
  "quote_id": "d825575c-25e3-419b-bfd5-c778d0f9fe03",
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
  "id": "b531b179-7208-4bf4-bcf1-2e65bb84282c",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:11.686067Z",
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
  "command_id": "c43982c8-078a-4b49-99ed-3e67c26f599d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-28T17:57:11Z"
}
```

```json
{
  "id": "45d0b60b-dac5-45c4-a1c6-e353fe0c4f4a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:11.982326Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:57:11Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "ee8ec1d4-94d3-45d6-8637-8fe2ffee71af",
  "quote_id": "45d0b60b-dac5-45c4-a1c6-e353fe0c4f4a",
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
  "pickup_at": "2026-10-28T17:57:11Z"
}
```

```json
{
  "id": "b74e2902-1818-46ac-90e4-4fa602589067",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:12.264717Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:57:11Z",
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
  "command_id": "f3198e00-3fcb-4ffa-bfd0-10b7722a8a68",
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
  "id": "d1201e89-bf3c-4c63-8ecf-b5f8a37e93d4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:12.557645Z",
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
  "command_id": "5c34c6f8-8033-45d0-8ced-2688892a1dd9",
  "quote_id": "d1201e89-bf3c-4c63-8ecf-b5f8a37e93d4",
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
  "correlation_id": "c4516330-3126-4963-b0b3-473208ba20d3"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "b74e2902-1818-46ac-90e4-4fa602589067",
      "short_number": 14,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
      "created_at": "2026-10-28T14:57:12.264717Z",
      "cancellation": null,
      "pickup_at": "2026-10-28T17:57:11Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "b531b179-7208-4bf4-bcf1-2e65bb84282c",
      "short_number": 13,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
      "created_at": "2026-10-28T14:57:11.686067Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0
    },
    {
      "id": "32393948-0217-4899-8b7c-a1b75a1228ca",
      "short_number": 12,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
      "channel": "APP",
      "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "b531b179-7208-4bf4-bcf1-2e65bb84282c",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:11.686067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

## The rider cancels all three; the driver goes off line

`GET /api/rider/v1/orders/32393948-0217-4899-8b7c-a1b75a1228ca` → **200**

```json
{
  "id": "32393948-0217-4899-8b7c-a1b75a1228ca",
  "short_number": 12,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
    "id": "1a019c66-e5c6-4121-a760-e9d63aeb7695",
    "order_id": "32393948-0217-4899-8b7c-a1b75a1228ca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "d42427b1-f426-4656-ab77-0040fb81832b",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-28T14:57:10.295054Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/32393948-0217-4899-8b7c-a1b75a1228ca/cancel` → **200**

```json
{
  "command_id": "1c15f1f4-470d-4d08-8ce4-34db67dfed79",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "32393948-0217-4899-8b7c-a1b75a1228ca",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
    "id": "1a019c66-e5c6-4121-a760-e9d63aeb7695",
    "order_id": "32393948-0217-4899-8b7c-a1b75a1228ca",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "d42427b1-f426-4656-ab77-0040fb81832b",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-28T14:57:10.295054Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/b531b179-7208-4bf4-bcf1-2e65bb84282c` → **200**

```json
{
  "id": "b531b179-7208-4bf4-bcf1-2e65bb84282c",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:11.686067Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b531b179-7208-4bf4-bcf1-2e65bb84282c/cancel` → **200**

```json
{
  "command_id": "db83ab16-e689-4fc6-aa89-ed3cb4a14ca7",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b531b179-7208-4bf4-bcf1-2e65bb84282c",
  "short_number": 13,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:11.686067Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
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

`GET /api/rider/v1/orders/b74e2902-1818-46ac-90e4-4fa602589067` → **200**

```json
{
  "id": "b74e2902-1818-46ac-90e4-4fa602589067",
  "short_number": 14,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:12.264717Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:57:11Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0
}
```

`POST /api/rider/v1/orders/b74e2902-1818-46ac-90e4-4fa602589067/cancel` → **200**

```json
{
  "command_id": "e4923019-93dc-4b97-870e-9f1d9f6ee70b",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b74e2902-1818-46ac-90e4-4fa602589067",
  "short_number": 14,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "2d48d6c9-c1dc-45fe-a080-1ac04998db88",
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
  "created_at": "2026-10-28T14:57:12.264717Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "ru": "Передумал ехать",
      "en": "Changed my mind",
      "uk": "Передумав їхати"
    }
  },
  "pickup_at": "2026-10-28T17:57:11Z",
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
  "session_id": "644f4cba-9acd-4593-b6cd-29d6f90debde",
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
  "last_heartbeat_at": "2026-10-28T14:57:09.145893Z",
  "last_location_at": "2026-10-28T14:57:09.145893Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/644f4cba-9acd-4593-b6cd-29d6f90debde/close` → **200**

```json
{
  "command_id": "1e562067-7a30-4053-86e0-99ab0315f997",
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

Done: orders 32393948-0217-4899-8b7c-a1b75a1228ca, b531b179-7208-4bf4-bcf1-2e65bb84282c, b74e2902-1818-46ac-90e4-4fa602589067.

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
  "session_id": "d3dcc71d-8b26-43ac-9d4c-8d4178b497f7",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMzYsImlhdCI6MTc5MzE5OTQzNiwianRpIjoiYTM3ZWRjMWUtNDBlMy00MmVjLWI2MzktZTg4YjQyNWI3ZmJhIiwic2lkIjoiZDNkY2M3MWQtOGIyNi00M2FjLTlkNGMtOGQ0MTc4YjQ5N2Y3In0.xUCYzgu_F3tKYO2aMCziAuT3thhA7nWQPdcC8ML1Lw8",
  "access_expires_at": "2026-10-28T15:12:16.217353305Z",
  "refresh_token": "xpKh3dASa9i1oEMQQ_AKCe9AUyD5g1MxkajzgBGITQU",
  "refresh_expires_at": "2026-10-29T02:57:16.216801478Z",
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
  "session_id": "94bc48ec-13dc-4d66-86b4-7f9a2fa7b181",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzMzYsImlhdCI6MTc5MzE5OTQzNiwianRpIjoiMzBjZDYzZTUtNDBiMi00MTQxLWJjNmEtZTc1ZDliMTc1NTc4Iiwic2lkIjoiOTRiYzQ4ZWMtMTNkYy00ZDY2LTg2YjQtN2Y5YTJmYTdiMTgxIn0.SQdIy72bPNm8Z2yRBItSYKkRdFTXgYK1n11MfU1qnNw",
  "access_expires_at": "2026-10-28T15:12:16.782110792Z",
  "refresh_token": "0RevmzKghCnFUFvqnfpu66bOeAlHMaiBmTj_ae4Zrts",
  "refresh_expires_at": "2026-10-29T02:57:16.78158333Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-15535"
}
```

```json
{
  "challenge_id": "2553dee7-5fa4-46c8-a0af-da3b0484700d",
  "expires_at": "2026-10-28T15:02:17.043619114Z",
  "resend_available_at": "2026-10-28T14:57:18.043619114Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "515635",
  "sent_at": "2026-10-28T14:57:17.045935769Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2553dee7-5fa4-46c8-a0af-da3b0484700d",
  "code": "515635",
  "device_ref": "sandbox-15535"
}
```

```json
{
  "session_id": "039818ab-d91a-4132-91ec-502935e04c05",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDMzNywiaWF0IjoxNzkzMTk5NDM3LCJqdGkiOiIxYTI4Yzg0ZC04YTM2LTRjOTktOGEwMy1mZTMzNDdiM2ZiZWUiLCJzaWQiOiIwMzk4MThhYi1kOTFhLTQxMzItOTFlYy01MDI5MzVlMDRjMDUifQ.VtZpO-dml21C4x2sBYfLigHD19cW3Q98e9gh1aADIAU",
  "access_expires_at": "2026-10-28T15:12:17.338006378Z",
  "refresh_token": "6UCv3NO70FktIKHR06sLQ3f5al85XRzgocr5Dxme3dA",
  "refresh_expires_at": "2026-11-27T14:57:17.337447045Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:53.914045Z",
  "last_location_at": "2026-10-28T14:56:53.914045Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/handover` → **200**

```json
{
  "command_id": "0fb8fe40-9be7-4d63-b64b-de10cbf7480a",
  "expected_version": 1
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:56:53.914045Z",
  "last_location_at": "2026-10-28T14:56:53.914045Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:18Z",
    "sequence": 1793199438142
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:57:18.161703Z",
  "last_location_at": "2026-10-28T14:57:18.161703Z",
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
  "command_id": "056e2e94-0462-4412-8b36-52905a948a6f",
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
  "effective_at": "2026-10-28T14:57:18.710579Z",
  "changed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "balance": 0,
  "fulfilled_count": 0,
  "cancelled_count": 0,
  "period_started_at": "2026-10-28T14:57:18.992204468Z",
  "last_entries": []
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "072e36b6-c1ad-4018-bfbf-404bebd2b441",
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
  "id": "c76ea207-dcf3-4182-b0b4-41b2488cd51c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:19.262626Z",
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
  "command_id": "bd53a009-49e3-4e47-9e5a-7998f2b4c9dd",
  "quote_id": "c76ea207-dcf3-4182-b0b4-41b2488cd51c",
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
    "phone": "+3806711126585"
  }
}
```

```json
{
  "id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
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
  "created_at": "2026-10-28T14:57:19.549257Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711126585"
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
    "id": "c9a31122-a54b-4376-8993-254690f6767c",
    "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
    "expires_at": "2026-10-28T14:57:34.552849Z",
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

`POST /api/driver/v1/offers/c9a31122-a54b-4376-8993-254690f6767c/accept` → **200**

```json
{
  "command_id": "d749bfa3-cfb4-4b97-8365-7080a7ee7f48"
}
```

```json
{
  "id": "741029eb-7c07-4896-b31b-3d3181b4bcb1",
  "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bf9244b9-9b37-43e9-b511-232479e58ed2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bf9244b9-9b37-43e9-b511-232479e58ed2",
  "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
  "assignment_id": "741029eb-7c07-4896-b31b-3d3181b4bcb1",
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
    "phone": "+3806711126585"
  }
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:20Z",
    "sequence": 1793199440619
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:57:20.639269Z",
  "last_location_at": "2026-10-28T14:57:20.639269Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bf9244b9-9b37-43e9-b511-232479e58ed2/arrive` → **200**

```json
{
  "command_id": "5030ae60-652d-428b-969a-448f5f59278b",
  "expected_version": 0
}
```

```json
{
  "id": "bf9244b9-9b37-43e9-b511-232479e58ed2",
  "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
  "assignment_id": "741029eb-7c07-4896-b31b-3d3181b4bcb1",
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
  "arrived_at": "2026-10-28T14:57:20.921813Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711126585"
  }
}
```

`POST /api/driver/v1/trips/bf9244b9-9b37-43e9-b511-232479e58ed2/start` → **200**

```json
{
  "command_id": "b0e7c513-f1c4-4d68-83c2-12dd566fe2c6",
  "expected_version": 1
}
```

```json
{
  "id": "bf9244b9-9b37-43e9-b511-232479e58ed2",
  "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
  "assignment_id": "741029eb-7c07-4896-b31b-3d3181b4bcb1",
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
  "arrived_at": "2026-10-28T14:57:20.921813Z",
  "started_at": "2026-10-28T14:57:21.207679Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711126585"
  }
}
```

`POST /api/driver/v1/trips/bf9244b9-9b37-43e9-b511-232479e58ed2/complete` → **200**

```json
{
  "command_id": "1923656b-f6df-41e6-ae9d-532dae04ac38",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:57:21Z",
  "cash_received": true
}
```

```json
{
  "id": "bf9244b9-9b37-43e9-b511-232479e58ed2",
  "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
  "assignment_id": "741029eb-7c07-4896-b31b-3d3181b4bcb1",
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
  "arrived_at": "2026-10-28T14:57:20.921813Z",
  "started_at": "2026-10-28T14:57:21.207679Z",
  "completed_at": "2026-10-28T14:57:21.494118Z",
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
  "command_id": "31a83290-c7d8-43f2-8ba0-006ff025c13e",
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
  "id": "70a4b530-146a-4e57-aef7-4d2e643e7fd4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:21.787267Z",
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
  "command_id": "7424265d-6535-4940-b20b-ad487e4d0807",
  "quote_id": "70a4b530-146a-4e57-aef7-4d2e643e7fd4",
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
    "phone": "+3806711111701"
  }
}
```

```json
{
  "id": "9b1bc7d8-3638-4d2e-a281-141afd96524e",
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
  "created_at": "2026-10-28T14:57:22.081327Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111701"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/9b1bc7d8-3638-4d2e-a281-141afd96524e` → **200**

```json
{
  "id": "9b1bc7d8-3638-4d2e-a281-141afd96524e",
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
  "created_at": "2026-10-28T14:57:22.081327Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111701"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/9b1bc7d8-3638-4d2e-a281-141afd96524e/cancel` → **200**

```json
{
  "command_id": "f2614020-198e-4446-bf4f-aab9c920eef4",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "9b1bc7d8-3638-4d2e-a281-141afd96524e",
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
  "created_at": "2026-10-28T14:57:22.081327Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711111701"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "ru": "Ошибка оператора",
      "en": "Operator error",
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
  "staff_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "balance": -1,
  "fulfilled_count": 1,
  "cancelled_count": 1,
  "period_started_at": "2026-10-28T14:57:21.499097Z",
  "last_entries": [
    {
      "order_id": "9b1bc7d8-3638-4d2e-a281-141afd96524e",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-28T14:57:22.651801Z"
    },
    {
      "order_id": "5d9a4703-b219-457e-b309-d7259ef47c3d",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-28T14:57:21.499097Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "34c9734d-5058-4095-a161-f47eaac1083c",
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
  "last_heartbeat_at": "2026-10-28T14:57:20.639269Z",
  "last_location_at": "2026-10-28T14:57:20.639269Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/34c9734d-5058-4095-a161-f47eaac1083c/close` → **200**

```json
{
  "command_id": "1c7bb50e-cecd-40b8-9685-0f25f0b9e500",
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

Done: operator bonus for fulfilled 5d9a4703-b219-457e-b309-d7259ef47c3d and operator-fault cancellation 9b1bc7d8-3638-4d2e-a281-141afd96524e.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670278699",
  "device_ref": "sandbox-15976"
}
```

```json
{
  "challenge_id": "6d1bcf03-e445-4d85-b0b1-9f3e4f0254a1",
  "expires_at": "2026-10-28T15:02:25.773119435Z",
  "resend_available_at": "2026-10-28T14:57:26.773119435Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670278699` → **200**

```json
{
  "phone": "+380670278699",
  "audience": "CLIENT",
  "code": "290014",
  "sent_at": "2026-10-28T14:57:25.775406774Z",
  "channel": "SMS"
}
```

## "Call me instead" from the sign-in screen

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670508644",
  "device_ref": "sandbox-18255",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "3e7eca9d-2429-432d-89af-1804f2886c31",
  "expires_at": "2026-10-28T15:02:26.06508988Z",
  "resend_available_at": "2026-10-28T14:57:27.06508988Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670508644` → **200**

```json
{
  "phone": "+380670508644",
  "audience": "CLIENT",
  "code": "600862",
  "sent_at": "2026-10-28T14:57:26.067267313Z",
  "channel": "VOICE"
}
```

## The SMS does not get through, so the code comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675030000",
  "device_ref": "sandbox-11078"
}
```

```json
{
  "challenge_id": "249162b3-76e1-445a-b7f9-8dea8f9779e6",
  "expires_at": "2026-10-28T15:02:26.35784527Z",
  "resend_available_at": "2026-10-28T14:57:27.35784527Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380675030000` → **200**

```json
{
  "phone": "+380675030000",
  "audience": "CLIENT",
  "code": "189570",
  "sent_at": "2026-10-28T14:57:26.360456178Z",
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
  "session_id": "2d07dace-14fe-4588-a34b-b9c7e0ac3f03",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNDYsImlhdCI6MTc5MzE5OTQ0NiwianRpIjoiYjBhMDJhMGEtM2NiYi00YWI2LTkyYjktNzIxNDBjYzcwZTgyIiwic2lkIjoiMmQwN2RhY2UtMTRmZS00NTg4LWEzNGItYjljN2UwYWMzZjAzIn0.ov9jlw6UkSBwA8qhQ2az4162C4nSxqshZ-cwabcAWfY",
  "access_expires_at": "2026-10-28T15:12:26.934929019Z",
  "refresh_token": "Ya-1HbVFXDc9kKSFgasNsjkR_3IdZmFKjlY6w9tdXGI",
  "refresh_expires_at": "2026-10-29T02:57:26.934443596Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675030000` → **200**

```json
{
  "deliveries": [
    {
      "id": "9e58e100-eb25-4645-ba4b-0aa3bea97d22",
      "challenge_id": "249162b3-76e1-445a-b7f9-8dea8f9779e6",
      "phone": "+380675030000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d5c83be0-6ad4-470f-8b71-2a83e4cfd595",
      "error": null,
      "attempted_at": "2026-10-28T14:57:26.36068Z"
    },
    {
      "id": "6e24a814-4e9b-48bf-954f-d028e3a40464",
      "challenge_id": "249162b3-76e1-445a-b7f9-8dea8f9779e6",
      "phone": "+380675030000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-28T14:57:26.359993Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380675030000` → **200**

```json
{
  "phone": "+380675030000",
  "audience": "CLIENT",
  "code": "189570",
  "sent_at": "2026-10-28T14:57:26.360456178Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380670508644` → **200**

```json
{
  "deliveries": [
    {
      "id": "e6ef155c-6ccc-4194-b946-b94a79b7629f",
      "challenge_id": "3e7eca9d-2429-432d-89af-1804f2886c31",
      "phone": "+380670508644",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-6fe86db9-9594-49c3-82e8-4ed53170a484",
      "error": null,
      "attempted_at": "2026-10-28T14:57:26.067516Z"
    }
  ]
}
```

Done: SMS to +380670278699, a call to +380670508644, SMS then a call to +380675030000.

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
  "session_id": "b2c24ba1-e6bc-474e-8062-508aff6976bd",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNDgsImlhdCI6MTc5MzE5OTQ0OCwianRpIjoiNjM4M2E2YjktOTUyNS00ZmJmLWFlMzAtMWNkNTMyOWU0NTFjIiwic2lkIjoiYjJjMjRiYTEtZTZiYy00NzRlLTgwNjItNTA4YWZmNjk3NmJkIn0.Q__5eyIvZHGPMai8jZpxJS44m_AzMgQDQR-KZoH6dzM",
  "access_expires_at": "2026-10-28T15:12:28.066871256Z",
  "refresh_token": "NIj4QuIIMlRXnZMHJRFCUeak5luktoO7mOJqB4l_vgA",
  "refresh_expires_at": "2026-10-29T02:57:28.066375995Z",
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
  "session_id": "64179591-8545-4dd2-acd9-cc751b0594e9",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNDgsImlhdCI6MTc5MzE5OTQ0OCwianRpIjoiYjUyY2QwNzktYTU0ZC00NDY0LWFlZDUtNGMwMmIwZTg1MmQwIiwic2lkIjoiNjQxNzk1OTEtODU0NS00ZGQyLWFjZDktY2M3NTFiMDU5NGU5In0.MwPCzy_mmm8n_oAs5YyXYIZAo43rJLvyJUhaAabPvGE",
  "access_expires_at": "2026-10-28T15:12:28.621321515Z",
  "refresh_token": "QW1zVLnQEaoNidXrEONTTonH4a4Qo3UIIAZRAswFgLk",
  "refresh_expires_at": "2026-10-29T02:57:28.620828118Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
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

`POST /api/admin/v1/staff-extensions/d4b48cf3-622e-4949-92b5-ac3526d95d0d` → **200**

```json
{
  "command_id": "3f4e4014-29fe-4e68-bab0-138cd9867700",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "54c80f89-3678-4214-937b-87fd437d53d7",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:57:29.70148Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-28T14:57:29.70148Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "aba1be36-2e4d-4225-8484-46b0884bbe5a",
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
  "id": "9ce134be-2b6f-489f-852d-a566c9ec1348",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:30.231427Z",
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
  "command_id": "6a916769-15a1-486b-a87a-791b39764af4",
  "quote_id": "9ce134be-2b6f-489f-852d-a566c9ec1348",
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
    "phone": "+380672995651"
  }
}
```

```json
{
  "id": "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7",
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
  "created_at": "2026-10-28T14:57:30.506241Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672995651"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/36ca10ce-9512-447b-b5a8-3e8fb24a9ed7/calls` → **201**

```json
{
  "command_id": "53c26517-d344-4042-a328-35178ba37d4f",
  "to": "CALLER"
}
```

```json
{
  "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "order_ids": [
    "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
  ],
  "started_at": "2026-10-28T14:57:30.804558Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/36ca10ce-9512-447b-b5a8-3e8fb24a9ed7/calls` → **201**

```json
{
  "command_id": "53c26517-d344-4042-a328-35178ba37d4f",
  "to": "CALLER"
}
```

```json
{
  "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "order_ids": [
    "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
  ],
  "started_at": "2026-10-28T14:57:30.804558Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672995651",
    "at": "2026-10-28T14:57:30.8065374Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.13367",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "afcbb22f-d933-4582-8f02-bbb43602bbab"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=36ca10ce-9512-447b-b5a8-3e8fb24a9ed7` → **200**

```json
{
  "calls": [
    {
      "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [
        "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
      ],
      "started_at": "2026-10-28T14:57:30.804558Z",
      "answered_at": "2026-10-28T14:57:31.416474Z",
      "ended_at": "2026-10-28T14:57:31.438517Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36ca10ce-9512-447b-b5a8-3e8fb24a9ed7` → **200**

```json
{
  "calls": [
    {
      "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [
        "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
      ],
      "started_at": "2026-10-28T14:57:30.804558Z",
      "answered_at": "2026-10-28T14:57:31.416474Z",
      "ended_at": "2026-10-28T14:57:31.438517Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36ca10ce-9512-447b-b5a8-3e8fb24a9ed7` → **200**

```json
{
  "calls": [
    {
      "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [
        "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
      ],
      "started_at": "2026-10-28T14:57:30.804558Z",
      "answered_at": "2026-10-28T14:57:31.416474Z",
      "ended_at": "2026-10-28T14:57:31.438517Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36ca10ce-9512-447b-b5a8-3e8fb24a9ed7` → **200**

```json
{
  "calls": [
    {
      "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [
        "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
      ],
      "started_at": "2026-10-28T14:57:30.804558Z",
      "answered_at": "2026-10-28T14:57:31.416474Z",
      "ended_at": "2026-10-28T14:57:31.438517Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=36ca10ce-9512-447b-b5a8-3e8fb24a9ed7` → **200**

```json
{
  "calls": [
    {
      "id": "afcbb22f-d933-4582-8f02-bbb43602bbab",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "order_ids": [
        "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7"
      ],
      "started_at": "2026-10-28T14:57:30.804558Z",
      "answered_at": "2026-10-28T14:57:31.416474Z",
      "ended_at": "2026-10-28T14:57:31.438517Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-28T14:57:39.937082Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/36ca10ce-9512-447b-b5a8-3e8fb24a9ed7` → **200**

```json
{
  "id": "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7",
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
  "created_at": "2026-10-28T14:57:30.506241Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672995651"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/36ca10ce-9512-447b-b5a8-3e8fb24a9ed7/cancel` → **200**

```json
{
  "command_id": "350930c4-7960-48fc-a083-07f00aaf7082",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "36ca10ce-9512-447b-b5a8-3e8fb24a9ed7",
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
  "created_at": "2026-10-28T14:57:30.506241Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672995651"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "ru": "Нет свободных машин",
      "en": "No cars available",
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
  "command_id": "8a1450b7-fd6e-4bbf-9b5d-aab58594c8da",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-28T14:57:41.416854Z",
  "extension": "101"
}
```

Done: outgoing call afcbb22f-d933-4582-8f02-bbb43602bbab from order 36ca10ce-9512-447b-b5a8-3e8fb24a9ed7, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630676757",
  "device_ref": "sandbox-16679"
}
```

```json
{
  "challenge_id": "0d54a1b5-f368-42ef-a885-27fb7832873c",
  "expires_at": "2026-10-28T15:02:41.698282491Z",
  "resend_available_at": "2026-10-28T14:57:42.698282491Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630676757` → **200**

```json
{
  "phone": "+380630676757",
  "audience": "CLIENT",
  "code": "828598",
  "sent_at": "2026-10-28T14:57:41.700636837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d54a1b5-f368-42ef-a885-27fb7832873c",
  "code": "828598",
  "device_ref": "sandbox-16679"
}
```

```json
{
  "session_id": "d0bb3b08-c294-48f6-a268-c386d34596f1",
  "subject": {
    "type": "CLIENT",
    "id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2EzOTYzMy1lNWMzLTRmYTgtYTkyZS02YjZhM2MxNjJkOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzYyLCJpYXQiOjE3OTMxOTk0NjIsImp0aSI6IjcwOGI1MTU1LWUzNGEtNDJjZi04NTg2LTFjYThhZDE5MjQ2ZCIsInNpZCI6ImQwYmIzYjA4LWMyOTQtNDhmNi1hMjY4LWMzODZkMzQ1OTZmMSJ9.EARoZ8l_5JidIFg8yFOBvjQ7ePPhTPlWMzpt-DDk1jY",
  "access_expires_at": "2026-10-28T15:12:42.009092634Z",
  "refresh_token": "uh_wSTKYz2ORV-HR0zTcPOMiax2y5eZ7sF8BdZASowY",
  "refresh_expires_at": "2026-11-27T14:57:42.008416725Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
  "session_id": "d0bb3b08-c294-48f6-a268-c386d34596f1",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630676757",
  "device_ref": "sandbox-13701"
}
```

```json
{
  "challenge_id": "805f4fdd-a80c-4e95-b82b-8628f9a72d67",
  "expires_at": "2026-10-28T15:02:44.534795603Z",
  "resend_available_at": "2026-10-28T14:57:45.534795603Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630676757` → **200**

```json
{
  "phone": "+380630676757",
  "audience": "CLIENT",
  "code": "101074",
  "sent_at": "2026-10-28T14:57:44.536779022Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "805f4fdd-a80c-4e95-b82b-8628f9a72d67",
  "code": "101074",
  "device_ref": "sandbox-13701"
}
```

```json
{
  "session_id": "9c63afd0-c027-411f-b892-e614fab63b34",
  "subject": {
    "type": "CLIENT",
    "id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2EzOTYzMy1lNWMzLTRmYTgtYTkyZS02YjZhM2MxNjJkOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzY0LCJpYXQiOjE3OTMxOTk0NjQsImp0aSI6ImMyZWIzNjBmLTFjOTgtNDVmYS1hNTM1LTk3MDNlZWQ5YmQwOSIsInNpZCI6IjljNjNhZmQwLWMwMjctNDExZi1iODkyLWU2MTRmYWI2M2IzNCJ9.deG_-QyVZnnsp7Zw7aNumynXKoXwJOH7RFGJQeWY-2g",
  "access_expires_at": "2026-10-28T15:12:44.834270869Z",
  "refresh_token": "JZiRd4L-kI0NGsdL2ia_L0CWeowWOjaD7SNL2RuIXpM",
  "refresh_expires_at": "2026-11-27T14:57:44.833670622Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "8e53a3b6-5c4e-4b2f-918d-9bc1cc57d80f",
  "expires_at": "2026-10-28T15:02:47.119984676Z",
  "resend_available_at": "2026-10-28T14:57:48.119984676Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630676757` → **200**

```json
{
  "phone": "+380630676757",
  "audience": "CLIENT",
  "code": "497214",
  "sent_at": "2026-10-28T14:57:47.121853091Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380631746417"
}
```

```json
{
  "challenge_id": "da65db8e-e748-44eb-b802-65e98d731c49",
  "expires_at": "2026-10-28T15:02:47.399650488Z",
  "resend_available_at": "2026-10-28T14:57:48.399650488Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631746417` → **200**

```json
{
  "phone": "+380631746417",
  "audience": "CLIENT",
  "code": "849722",
  "sent_at": "2026-10-28T14:57:47.40135946Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "bef17d46-d784-454d-9312-393e2ca07f39",
  "current_challenge_id": "8e53a3b6-5c4e-4b2f-918d-9bc1cc57d80f",
  "current_code": "000000",
  "new_challenge_id": "da65db8e-e748-44eb-b802-65e98d731c49",
  "new_code": "849722"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "bc403fab-fb9c-4edd-8e23-b7fc2f9a13a0"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "2c779cd4-fb60-4be3-b4ab-df0521e1bbe4",
  "current_challenge_id": "8e53a3b6-5c4e-4b2f-918d-9bc1cc57d80f",
  "current_code": "497214",
  "new_challenge_id": "da65db8e-e748-44eb-b802-65e98d731c49",
  "new_code": "849722"
}
```

```json
{
  "subject_id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
  "phone": "+380631746417",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
  "session_id": "d0bb3b08-c294-48f6-a268-c386d34596f1",
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
  "correlation_id": "100525d1-2391-4177-aea1-4127604834f6"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631746417",
  "device_ref": "sandbox-16520"
}
```

```json
{
  "challenge_id": "b2efd622-585d-4e9f-9607-447d8b49d294",
  "expires_at": "2026-10-28T15:02:50.780730073Z",
  "resend_available_at": "2026-10-28T14:57:51.780730073Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380631746417` → **200**

```json
{
  "phone": "+380631746417",
  "audience": "CLIENT",
  "code": "671152",
  "sent_at": "2026-10-28T14:57:50.782801485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2efd622-585d-4e9f-9607-447d8b49d294",
  "code": "671152",
  "device_ref": "sandbox-16520"
}
```

```json
{
  "session_id": "0872d4ec-3df0-4ded-bfbd-5b06ba391f26",
  "subject": {
    "type": "CLIENT",
    "id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2EzOTYzMy1lNWMzLTRmYTgtYTkyZS02YjZhM2MxNjJkOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzcxLCJpYXQiOjE3OTMxOTk0NzEsImp0aSI6IjUzNmQ1MDM4LTc1NzktNDlkNy1hZjhmLWRkNzBmZDk2Mzc0MSIsInNpZCI6IjA4NzJkNGVjLTNkZjAtNGRlZC1iZmJkLTViMDZiYTM5MWYyNiJ9.ksKx1yeOFBGpBKJEUI6JNzLZf3KyGOmqpCPpsbBJCDw",
  "access_expires_at": "2026-10-28T15:12:51.067726136Z",
  "refresh_token": "dYKyxowWHCVnbiHnBsvyeRY1f9VegAfiKJI-6VfsZUU",
  "refresh_expires_at": "2026-11-27T14:57:51.06720305Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
  "session_id": "0872d4ec-3df0-4ded-bfbd-5b06ba391f26",
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
  "session_id": "89a8a7da-6065-420b-b1ad-dbf69b7a5a50",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNzEsImlhdCI6MTc5MzE5OTQ3MSwianRpIjoiZjE1OTJjNjMtMGVmZi00MTMzLWFkMjAtZjhhNDc2NWU4MzY2Iiwic2lkIjoiODlhOGE3ZGEtNjA2NS00MjBiLWIxYWQtZGJmNjliN2E1YTUwIn0.SYlzmgP4kyDFEkDpAu4_ZqQXilGhibI5YH9Y3-3rL1Q",
  "access_expires_at": "2026-10-28T15:12:51.87885207Z",
  "refresh_token": "LPcB-2qQjHXqQv25oRCGMmGQDvHLo1gtYCEYMqoD2MQ",
  "refresh_expires_at": "2026-10-29T02:57:51.878344604Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/87a39633-e5c3-4fa8-a92e-6b6a3c162d94` → **200**

```json
{
  "client": {
    "id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
    "phone": "+380631746417",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-28T14:57:42.006528Z",
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

`POST /api/admin/v1/clients/87a39633-e5c3-4fa8-a92e-6b6a3c162d94/phone` → **400**

```json
{
  "command_id": "e643930e-93a2-4622-9311-3608b4cb4a19",
  "expected_version": 3,
  "phone": "+380639524482",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/87a39633-e5c3-4fa8-a92e-6b6a3c162d94/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "5d99cd0f-d3ab-4811-bbe4-97ea8c650d93",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/87a39633-e5c3-4fa8-a92e-6b6a3c162d94/phone` → **200**

```json
{
  "command_id": "4c595943-b03e-444a-90f1-8c309c5f0b55",
  "expected_version": 3,
  "phone": "+380639524482",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
  "phone": "+380639524482",
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
  "correlation_id": "95664611-31c1-4dbf-b82d-dcef2f9f163d"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639524482",
  "device_ref": "sandbox-1349"
}
```

```json
{
  "challenge_id": "2a134199-99b5-4718-ba21-5868c2b70f5c",
  "expires_at": "2026-10-28T15:02:53.263182688Z",
  "resend_available_at": "2026-10-28T14:57:54.263182688Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639524482` → **200**

```json
{
  "phone": "+380639524482",
  "audience": "CLIENT",
  "code": "222978",
  "sent_at": "2026-10-28T14:57:53.26544437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2a134199-99b5-4718-ba21-5868c2b70f5c",
  "code": "222978",
  "device_ref": "sandbox-1349"
}
```

```json
{
  "session_id": "e7cc5ad3-1473-4048-87e7-1855812a9e70",
  "subject": {
    "type": "CLIENT",
    "id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4N2EzOTYzMy1lNWMzLTRmYTgtYTkyZS02YjZhM2MxNjJkOTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzczLCJpYXQiOjE3OTMxOTk0NzMsImp0aSI6IjVmMjEzOTZjLWExNzEtNDg4Mi04MzFiLWE3NWQ3NWFjMDVkNyIsInNpZCI6ImU3Y2M1YWQzLTE0NzMtNDA0OC04N2U3LTE4NTU4MTJhOWU3MCJ9.Cx1TNc9HW-zuxCVeZA8pZDkbar16yFcre4FCOzJBACc",
  "access_expires_at": "2026-10-28T15:12:53.547682357Z",
  "refresh_token": "U1vv9yNiKGgAjMpBkhj5C66xrBHuefPlj3e434_E3qM",
  "refresh_expires_at": "2026-11-27T14:57:53.547137673Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "87a39633-e5c3-4fa8-a92e-6b6a3c162d94",
  "session_id": "e7cc5ad3-1473-4048-87e7-1855812a9e70",
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
  "phone": "+380632310824",
  "device_ref": "sandbox-15373"
}
```

```json
{
  "challenge_id": "392ad5a2-ae6f-4bf2-b655-0bf4c76369e2",
  "expires_at": "2026-10-28T15:02:54.07870734Z",
  "resend_available_at": "2026-10-28T14:57:55.07870734Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632310824` → **200**

```json
{
  "phone": "+380632310824",
  "audience": "CLIENT",
  "code": "037403",
  "sent_at": "2026-10-28T14:57:54.084092696Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "392ad5a2-ae6f-4bf2-b655-0bf4c76369e2",
  "code": "037403",
  "device_ref": "sandbox-15373"
}
```

```json
{
  "session_id": "0d27f55c-71fa-4a58-84d2-05ba25041c1f",
  "subject": {
    "type": "CLIENT",
    "id": "b86bedbe-d81c-44a8-b1df-201c25954b22"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODZiZWRiZS1kODFjLTQ0YTgtYjFkZi0yMDFjMjU5NTRiMjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzc0LCJpYXQiOjE3OTMxOTk0NzQsImp0aSI6IjRkNjg1MzZhLTU1MGItNDUxNi04OTg5LWRiODMxZmI5OTFjOSIsInNpZCI6IjBkMjdmNTVjLTcxZmEtNGE1OC04NGQyLTA1YmEyNTA0MWMxZiJ9.X4nSiDHLINIVpmDaU8pLsboTKp1C89eI3kgfGK2iAUw",
  "access_expires_at": "2026-10-28T15:12:54.373842395Z",
  "refresh_token": "O6xvhVIjmPPyyXkUOUX5on8o-wi4cz1ie0fUYNHa7KA",
  "refresh_expires_at": "2026-11-27T14:57:54.373318761Z",
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
  "session_id": "f911e64e-c066-4f7e-873d-3a093d73902b",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNzUsImlhdCI6MTc5MzE5OTQ3NSwianRpIjoiYmU2NGRmMDctODQwMi00N2YzLTgzMTAtZmQ5MGJkNDI2MWMxIiwic2lkIjoiZjkxMWU2NGUtYzA2Ni00ZjdlLTg3M2QtM2EwOTNkNzM5MDJiIn0.H-YiAqvq6oKn5X6krzMTIOaQNtJswt0l5FV4J-Vu6Hw",
  "access_expires_at": "2026-10-28T15:12:55.483014877Z",
  "refresh_token": "pC-FkAdAOZnDYSjhasXtThOch6HKrauG1YiBLvjDEMY",
  "refresh_expires_at": "2026-10-29T02:57:55.482486443Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380632310824` → **200**

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
  "correlation_id": "415a973a-3ae7-4b56-b43e-32ca13fc701c"
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
  "session_id": "baa1577a-3192-46cc-b13a-faf06008536e",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzNzYsImlhdCI6MTc5MzE5OTQ3NiwianRpIjoiOTMxMWZhNzUtZDk5ZC00Zjg4LTkwNGUtYTM2NWU0YmY3ZTg4Iiwic2lkIjoiYmFhMTU3N2EtMzE5Mi00NmNjLWIxM2EtZmFmMDYwMDg1MzZlIn0.r6JrFHc3UPDI5-5wHFOjFaliD8pR3Sz8rrWN9mZEk4c",
  "access_expires_at": "2026-10-28T15:12:56.573668983Z",
  "refresh_token": "r7l5D6DMDDll_0JgXFRxpj0fUcm26CwqbWsmEr-c7A0",
  "refresh_expires_at": "2026-10-29T02:57:56.573076589Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

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
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    }
  },
  "changed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reason": "Sandbox clean-up",
  "changed_at": "2026-10-28T14:55:00.193125Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "0ae4dbbc-44cf-4a07-a571-c5f001995798",
  "expected_version": 1,
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
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    }
  },
  "reason": "Sandbox: pre-orders by reservation"
}
```

```json
{
  "version": 2,
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
    },
    "app_versions": {
      "rider_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "rider_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_android": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "driver_ios": {
        "minimum_version": "0.0.0",
        "latest_version": "0.0.0"
      },
      "require_version_header": false
    }
  },
  "changed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-28T14:57:57.101603045Z"
}
```

## The rider books the airport for 2026-10-28T17:57:56Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600332137",
  "device_ref": "sandbox-13944"
}
```

```json
{
  "challenge_id": "f79f52a5-9a76-4189-ac05-2a908ab7f783",
  "expires_at": "2026-10-28T15:02:57.394228914Z",
  "resend_available_at": "2026-10-28T14:57:58.394228914Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48600332137` → **200**

```json
{
  "phone": "+48600332137",
  "audience": "CLIENT",
  "code": "937505",
  "sent_at": "2026-10-28T14:57:57.396252927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f79f52a5-9a76-4189-ac05-2a908ab7f783",
  "code": "937505",
  "device_ref": "sandbox-13944"
}
```

```json
{
  "session_id": "f3627478-bdf3-48f4-a464-799734075988",
  "subject": {
    "type": "CLIENT",
    "id": "0b6a6020-06ab-4bdc-91b2-6ee50314557d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYjZhNjAyMC0wNmFiLTRiZGMtOTFiMi02ZWU1MDMxNDU1N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzc3LCJpYXQiOjE3OTMxOTk0NzcsImp0aSI6ImMwM2MxYzg1LTk4NWQtNDM0Yy1iMGEwLTRjOGYxYzQ1NTY4MCIsInNpZCI6ImYzNjI3NDc4LWJkZjMtNDhmNC1hNDY0LTc5OTczNDA3NTk4OCJ9.YN9_Agf5aBoVBleEQYTb5SjADg96mSwDvefOi3AUamY",
  "access_expires_at": "2026-10-28T15:12:57.685442774Z",
  "refresh_token": "Dq5cXGgcOEpb_KbaSTkYMF4_rrLJnRL5z1koO4W7iFI",
  "refresh_expires_at": "2026-11-27T14:57:57.684890595Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c04a9e34-4331-4b5e-a744-0abd251db4fb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-28T17:57:56Z"
}
```

```json
{
  "id": "b974ccb7-2e09-4947-8702-069733ea30aa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:02:57.952027Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-28T17:57:56Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "08dff488-3960-40e9-a7fb-05d9670fa70d",
  "quote_id": "b974ccb7-2e09-4947-8702-069733ea30aa",
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
  "pickup_at": "2026-10-28T17:57:56Z"
}
```

```json
{
  "id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "0b6a6020-06ab-4bdc-91b2-6ee50314557d",
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
  "created_at": "2026-10-28T14:57:58.227028Z",
  "cancellation": null,
  "pickup_at": "2026-10-28T17:57:56Z",
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
  "device_ref": "sandbox-19557"
}
```

```json
{
  "challenge_id": "055b331b-eb6c-4718-951c-39672dc54867",
  "expires_at": "2026-10-28T15:02:58.505995492Z",
  "resend_available_at": "2026-10-28T14:57:59.505995492Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "207882",
  "sent_at": "2026-10-28T14:57:58.508256872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "055b331b-eb6c-4718-951c-39672dc54867",
  "code": "207882",
  "device_ref": "sandbox-19557"
}
```

```json
{
  "session_id": "05ccb9ad-25dd-458a-8d0d-71bd536acae0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM3OCwiaWF0IjoxNzkzMTk5NDc4LCJqdGkiOiI3MzY3YjYxMC0zMTVmLTRhZGUtYWRjNC01YzM4ZTk4NTc4YTMiLCJzaWQiOiIwNWNjYjlhZC0yNWRkLTQ1OGEtOGQwZC03MWJkNTM2YWNhZTAifQ.SsBLYnYibeeWRs5V7lgmCQEvm64RwkDNLoJDKmwhN3k",
  "access_expires_at": "2026-10-28T15:12:58.789328528Z",
  "refresh_token": "GuHvP77io5kuKQ8SDpLpcJlVYHFb7pM79MdSuhomhIU",
  "refresh_expires_at": "2026-11-27T14:57:58.788705005Z",
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
  "command_id": "42ef4eba-4c57-4891-8981-e5dd555d34d7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:57:59Z",
    "sequence": 1793199479307
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be55979e-5beb-48f5-9062-a9e68154d895",
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
  "last_heartbeat_at": "2026-10-28T14:57:59.326913Z",
  "last_location_at": "2026-10-28T14:57:59.326913Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
      "short_number": 18,
      "pickup_at": "2026-10-28T17:57:56Z",
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

`POST /api/driver/v1/preorders/dffbb72f-f6e9-4a5e-912f-aecb47c424eb/reserve` → **200**

```json
{
  "command_id": "c3527d87-29c0-441d-8de9-32751ddd2e47"
}
```

```json
{
  "id": "2f64be6b-5ec2-49b6-b082-9a438848b0c9",
  "state": "RESERVED",
  "order": {
    "order_id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
    "short_number": 18,
    "pickup_at": "2026-10-28T17:57:56Z",
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
  "reserved_at": "2026-10-28T14:57:59.863834Z",
  "confirm_from": "2026-10-28T17:27:56Z",
  "confirm_until": "2026-10-28T17:37:56Z",
  "drop_until": "2026-10-28T16:57:56Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "2f64be6b-5ec2-49b6-b082-9a438848b0c9",
      "state": "RESERVED",
      "order": {
        "order_id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
        "short_number": 18,
        "pickup_at": "2026-10-28T17:57:56Z",
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
      "reserved_at": "2026-10-28T14:57:59.863834Z",
      "confirm_from": "2026-10-28T17:27:56Z",
      "confirm_until": "2026-10-28T17:37:56Z",
      "drop_until": "2026-10-28T16:57:56Z"
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
      "id": "2f64be6b-5ec2-49b6-b082-9a438848b0c9",
      "state": "RESERVED",
      "order": {
        "order_id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
        "short_number": 18,
        "pickup_at": "2026-10-28T17:57:56Z",
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
      "reserved_at": "2026-10-28T14:57:59.863834Z",
      "confirm_from": "2026-10-28T17:27:56Z",
      "confirm_until": "2026-10-28T17:37:56Z",
      "drop_until": "2026-10-28T16:57:56Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/2f64be6b-5ec2-49b6-b082-9a438848b0c9/confirm` → **409**

```json
{
  "command_id": "2637c2df-99d2-4a14-98ec-be40b807d237"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/2f64be6b-5ec2-49b6-b082-9a438848b0c9/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "64f7420a-f464-4b13-bc50-247c8da95a11"
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
  "session_id": "2eb1ed47-a521-47de-8160-1b4c5232ca71",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODEsImlhdCI6MTc5MzE5OTQ4MSwianRpIjoiNDNjZmZmMDMtOTI4OC00YTE3LWIyNjItOTA1MzUxNzE5YmQ2Iiwic2lkIjoiMmViMWVkNDctYTUyMS00N2RlLTgxNjAtMWI0YzUyMzJjYTcxIn0.R7_477Butj4o8w8xHIs71ZmyccMitLz9JNkHZzTwk2s",
  "access_expires_at": "2026-10-28T15:13:01.206800874Z",
  "refresh_token": "B7C8sycK-0ZarfxCSJZbBQ3YbdY1VRiHcuxqiCVkD10",
  "refresh_expires_at": "2026-10-29T02:58:01.206092723Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/dffbb72f-f6e9-4a5e-912f-aecb47c424eb` → **200**

```json
{
  "id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
  "short_number": 18,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "0b6a6020-06ab-4bdc-91b2-6ee50314557d",
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
  "created_at": "2026-10-28T14:57:58.227028Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-28T17:57:56Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "2f64be6b-5ec2-49b6-b082-9a438848b0c9",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-28T14:57:59.863834Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/dffbb72f-f6e9-4a5e-912f-aecb47c424eb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-28T14:57:58.228112Z",
      "actor": {
        "type": "CLIENT",
        "id": "0b6a6020-06ab-4bdc-91b2-6ee50314557d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
        "preorder": true,
        "quote_id": "b974ccb7-2e09-4947-8702-069733ea30aa",
        "pickup_at": "2026-10-28T17:57:56Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "677a73bf-ae53-4bbb-b826-d0e1abdf50f5"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-28T14:57:59.864907Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dffbb72f-f6e9-4a5e-912f-aecb47c424eb",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "2f64be6b-5ec2-49b6-b082-9a438848b0c9"
      },
      "correlation_id": "f07564c5-a01b-4ae5-bbcc-e92192018f73"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order dffbb72f-f6e9-4a5e-912f-aecb47c424eb, reservation 2f64be6b-5ec2-49b6-b082-9a438848b0c9.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-30553"
}
```

```json
{
  "challenge_id": "832b6603-4a9d-4c0b-87af-1239afa2eca0",
  "expires_at": "2026-10-28T15:03:02.018091689Z",
  "resend_available_at": "2026-10-28T14:58:03.018091689Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "943499",
  "sent_at": "2026-10-28T14:58:02.020233456Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "832b6603-4a9d-4c0b-87af-1239afa2eca0",
  "code": "943499",
  "device_ref": "sandbox-30553"
}
```

```json
{
  "session_id": "a38924a6-6a86-42b5-9a66-de778ebb9e32",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM4MiwiaWF0IjoxNzkzMTk5NDgyLCJqdGkiOiIxZDEyYjgyOS0zYzEwLTRhNjAtODhmYy04NjRhMGFlOTAyOTIiLCJzaWQiOiJhMzg5MjRhNi02YTg2LTQyYjUtOWE2Ni1kZTc3OGViYjllMzIifQ.Qmrmy_UVCS4Zv6jd-bmYJLRgj6PKe36G0an_6FLTNtk",
  "access_expires_at": "2026-10-28T15:13:02.336070525Z",
  "refresh_token": "szvXDGS24CUxV3J0aDjh_FibHshUiEizkEElUsiIRl8",
  "refresh_expires_at": "2026-11-27T14:58:02.335241786Z",
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
  "command_id": "6b393090-7163-4047-ad3c-d3248874e5c0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:02Z",
    "sequence": 1793199482857
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:02.877559Z",
  "last_location_at": "2026-10-28T14:58:02.877559Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673136650",
  "device_ref": "sandbox-21547"
}
```

```json
{
  "challenge_id": "2d6ec000-9140-4851-9454-47686c5acbd2",
  "expires_at": "2026-10-28T15:03:03.142638788Z",
  "resend_available_at": "2026-10-28T14:58:04.142638788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673136650` → **200**

```json
{
  "phone": "+380673136650",
  "audience": "CLIENT",
  "code": "994406",
  "sent_at": "2026-10-28T14:58:03.144889639Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d6ec000-9140-4851-9454-47686c5acbd2",
  "code": "994406",
  "device_ref": "sandbox-21547"
}
```

```json
{
  "session_id": "eea47232-f778-478c-accd-65325e2faf63",
  "subject": {
    "type": "CLIENT",
    "id": "cf5c2173-d0b2-4e3e-96c2-4bf8de179334"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZjVjMjE3My1kMGIyLTRlM2UtOTZjMi00YmY4ZGUxNzkzMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwMzgzLCJpYXQiOjE3OTMxOTk0ODMsImp0aSI6IjhlYTdiMDU3LWQxOTEtNDc4MC1iZWViLTEzNGMzODM4ODJhMCIsInNpZCI6ImVlYTQ3MjMyLWY3NzgtNDc4Yy1hY2NkLTY1MzI1ZTJmYWY2MyJ9.n8REeVhy_aY_Et2GXeRhaCwxaZiHhzJQ7T-uvqkFDx8",
  "access_expires_at": "2026-10-28T15:13:03.428840901Z",
  "refresh_token": "yL1C_th_d49Roh97sv5S9dao3q5Ph2ALMWVcKvpqFj8",
  "refresh_expires_at": "2026-11-27T14:58:03.428266451Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11884847-3915-44b2-9ee7-ddfd959e7bb6",
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
  "id": "a1fbd8f1-0fe6-41fb-a398-5a37b86b7772",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:03.700651Z",
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
  "command_id": "3299818c-2aa8-4c2f-8359-a46d5b1b44f4",
  "quote_id": "a1fbd8f1-0fe6-41fb-a398-5a37b86b7772",
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
  "id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "cf5c2173-d0b2-4e3e-96c2-4bf8de179334",
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
  "created_at": "2026-10-28T14:58:03.981586Z",
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
    "id": "d281708e-cfed-4d59-971c-2f6152af3883",
    "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
    "expires_at": "2026-10-28T14:58:18.984999Z",
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

`POST /api/driver/v1/offers/d281708e-cfed-4d59-971c-2f6152af3883/accept` → **200**

```json
{
  "command_id": "76bf151f-c242-44f4-826a-ceb216120dcd"
}
```

```json
{
  "id": "1a7629a2-1cb2-45ca-9fb9-608d0748bd5b",
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "df51cee2-19ca-48e6-b040-a97c72d9b548",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "df51cee2-19ca-48e6-b040-a97c72d9b548",
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "assignment_id": "1a7629a2-1cb2-45ca-9fb9-608d0748bd5b",
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

`POST /api/driver/v1/work-sessions/6afe221c-24b7-4797-9134-74ca2d33f541/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:05Z",
    "sequence": 1793199485511
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:05.070012Z",
  "last_location_at": "2026-10-28T14:58:05.070012Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "df51cee2-19ca-48e6-b040-a97c72d9b548",
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "assignment_id": "1a7629a2-1cb2-45ca-9fb9-608d0748bd5b",
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

`POST /api/driver/v1/trips/df51cee2-19ca-48e6-b040-a97c72d9b548/arrive` → **200**

```json
{
  "command_id": "9f976ef9-1ebc-4840-bd6a-14677907ce7f",
  "expected_version": 0
}
```

```json
{
  "id": "df51cee2-19ca-48e6-b040-a97c72d9b548",
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "assignment_id": "1a7629a2-1cb2-45ca-9fb9-608d0748bd5b",
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
  "arrived_at": "2026-10-28T14:58:05.592476Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/df51cee2-19ca-48e6-b040-a97c72d9b548/start` → **200**

```json
{
  "command_id": "6b1a9c38-46a7-4139-8718-290bcfeb845d",
  "expected_version": 1
}
```

```json
{
  "id": "df51cee2-19ca-48e6-b040-a97c72d9b548",
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "assignment_id": "1a7629a2-1cb2-45ca-9fb9-608d0748bd5b",
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
  "arrived_at": "2026-10-28T14:58:05.592476Z",
  "started_at": "2026-10-28T14:58:05.85976Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/6afe221c-24b7-4797-9134-74ca2d33f541/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:06Z",
    "sequence": 1793199486136
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:06.155627Z",
  "last_location_at": "2026-10-28T14:58:06.155627Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/df51cee2-19ca-48e6-b040-a97c72d9b548/complete` → **200**

```json
{
  "command_id": "97d78785-5fc6-4b03-a199-fcbe55a93f9b",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:58:06Z",
  "cash_received": true
}
```

```json
{
  "id": "df51cee2-19ca-48e6-b040-a97c72d9b548",
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "assignment_id": "1a7629a2-1cb2-45ca-9fb9-608d0748bd5b",
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
  "arrived_at": "2026-10-28T14:58:05.592476Z",
  "started_at": "2026-10-28T14:58:05.85976Z",
  "completed_at": "2026-10-28T14:58:06.436386Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/8ea9b303-49a4-4eee-814b-076b1d231427/rating` → **200**

```json
{
  "command_id": "c8150e2f-acf2-47ce-abfb-e32a88647461",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "score": 5,
  "created_at": "2026-10-28T14:58:06.753945171Z"
}
```

`POST /api/driver/v1/orders/8ea9b303-49a4-4eee-814b-076b1d231427/rating` → **200**

```json
{
  "command_id": "637f4512-101a-4483-a05a-5b5f0cd10106",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
  "score": 4,
  "created_at": "2026-10-28T14:58:07.045167819Z"
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
  "session_id": "2d56524d-c2bd-449a-a417-528abf51cafc",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODcsImlhdCI6MTc5MzE5OTQ4NywianRpIjoiYjczYzA3ODEtM2YzNi00YjI0LTljNTktNzJiMjNkZDUxMWJmIiwic2lkIjoiMmQ1NjUyNGQtYzJiZC00NDlhLWE0MTctNTI4YWJmNTFjYWZjIn0.3wu7mq6yOHAuJ9tNwnkn4Fvd2SiP-EkOxyclQY81EUo",
  "access_expires_at": "2026-10-28T15:13:07.903523478Z",
  "refresh_token": "Cjhi2-SOk5CDA1dPbWNFu_WQp4pUdK385rc7rVJatqo",
  "refresh_expires_at": "2026-10-29T02:58:07.902896149Z",
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
  "session_id": "d112461a-a652-485e-911f-d690558c6a13",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODgsImlhdCI6MTc5MzE5OTQ4OCwianRpIjoiNzEwNDRiNmUtYTI2Zi00Y2Y3LWI4NjctMGE5ZWVkYjFmMDQyIiwic2lkIjoiZDExMjQ2MWEtYTY1Mi00ODVlLTkxMWYtZDY5MDU1OGM2YTEzIn0.iPHY6qMWtJo4JoV2uzObZtrIfDH_T7k3329ExOi72LA",
  "access_expires_at": "2026-10-28T15:13:08.455148863Z",
  "refresh_token": "bGuHX4riDzticfKQ08AM7lBZvLeT5D1vPNT9_xhnIno",
  "refresh_expires_at": "2026-10-29T02:58:08.454557331Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8ea9b303-49a4-4eee-814b-076b1d231427/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
      "author_type": "RIDER",
      "author_id": "cf5c2173-d0b2-4e3e-96c2-4bf8de179334",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-28T14:58:06.753945Z"
    },
    {
      "order_id": "8ea9b303-49a4-4eee-814b-076b1d231427",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "cf5c2173-d0b2-4e3e-96c2-4bf8de179334",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-28T14:58:07.045168Z"
    }
  ]
}
```

Done: ratings for order 8ea9b303-49a4-4eee-814b-076b1d231427.

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
  "session_id": "3964c773-62e0-414d-9c47-ef843d5c8d29",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzODksImlhdCI6MTc5MzE5OTQ4OSwianRpIjoiMGY4NjJiZGYtM2M1ZS00NTM1LWIwMzItZjQxOTBkZDkyZjBiIiwic2lkIjoiMzk2NGM3NzMtNjJlMC00MTRkLTljNDctZWY4NDNkNWM4ZDI5In0.MxUvBaXRNR5NyiE18d93Wqkk5Mi-UjXF5PnvHEIk4nY",
  "access_expires_at": "2026-10-28T15:13:09.278146843Z",
  "refresh_token": "zU3S4EXi0q2gkS_5E_reCqerlgie9gcQw036LlzjeZM",
  "refresh_expires_at": "2026-10-29T02:58:09.277600325Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b344226f-8771-4abb-85e9-70a2c321a981",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "4e9ac7be-c589-4fb5-afaf-b914790e3969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:09.548131Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4e9ac7be-c589-4fb5-afaf-b914790e3969` → **200**

```json
{
  "id": "4e9ac7be-c589-4fb5-afaf-b914790e3969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:09.548131Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/4e9ac7be-c589-4fb5-afaf-b914790e3969` → **200**

```json
{
  "id": "4e9ac7be-c589-4fb5-afaf-b914790e3969",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:58:09.548131Z",
  "ready_at": "2026-10-28T14:58:09.970415Z",
  "expires_at": "2026-10-29T14:58:09.970415Z"
}
```

`GET /api/admin/v1/reports/exports/4e9ac7be-c589-4fb5-afaf-b914790e3969/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-28,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
total,18,6,12,0,0,14,4,0,16,1,0,1,6,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "712ab024-f98e-4552-bb30-dc4f5f96ef31",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28"
}
```

```json
{
  "id": "ecad0ccf-3f62-45ba-a181-d1d3336bbeaa",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:11.372083Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ecad0ccf-3f62-45ba-a181-d1d3336bbeaa` → **200**

```json
{
  "id": "ecad0ccf-3f62-45ba-a181-d1d3336bbeaa",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:11.372083Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ecad0ccf-3f62-45ba-a181-d1d3336bbeaa` → **200**

```json
{
  "id": "ecad0ccf-3f62-45ba-a181-d1d3336bbeaa",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:11.372083Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ecad0ccf-3f62-45ba-a181-d1d3336bbeaa` → **200**

```json
{
  "id": "ecad0ccf-3f62-45ba-a181-d1d3336bbeaa",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-28T14:58:11.372083Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ecad0ccf-3f62-45ba-a181-d1d3336bbeaa` → **200**

```json
{
  "id": "ecad0ccf-3f62-45ba-a181-d1d3336bbeaa",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-28",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-28.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-28T14:58:11.372083Z",
  "ready_at": "2026-10-28T14:58:14.980409Z",
  "expires_at": "2026-10-29T14:58:14.980409Z"
}
```

`GET /api/admin/v1/reports/exports/ecad0ccf-3f62-45ba-a181-d1d3336bbeaa/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-28,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
total,UAH,6,908.89,130.74,136.35,772.54,10.52,0.00,162.97,20.00,584.66,25.00,0.00
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/0cfcbe33-f390-43f2-a080-47a1ead5239c` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/0cfcbe33-f390-43f2-a080-47a1ead5239c",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "169e4616-f9dd-43af-b6b3-42775092cf8c"
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
  "device_ref": "sandbox-31093"
}
```

```json
{
  "challenge_id": "81e954e8-2d17-4938-af9e-054f2c8733db",
  "expires_at": "2026-10-28T15:03:15.980483873Z",
  "resend_available_at": "2026-10-28T14:58:16.980483873Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "984016",
  "sent_at": "2026-10-28T14:58:15.982629388Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "81e954e8-2d17-4938-af9e-054f2c8733db",
  "code": "984016",
  "device_ref": "sandbox-31093"
}
```

```json
{
  "session_id": "4422cf8b-c494-44f5-b884-5e7f5e6e9557",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDM5NiwiaWF0IjoxNzkzMTk5NDk2LCJqdGkiOiJhZGI1OTBkZC01ZTU2LTRhZTYtODJlZi04NWU1YzFjMTI1ZjMiLCJzaWQiOiI0NDIyY2Y4Yi1jNDk0LTQ0ZjUtYjg4NC01ZTdmNWU2ZTk1NTcifQ.iRlmbMMT8p2cJSWgI5eZnYtt4IB9d7tliRZUtnPzfi8",
  "access_expires_at": "2026-10-28T15:13:16.273122137Z",
  "refresh_token": "DC3osdvseTFZwf4Cre135lSrgqeFHY9ksTUKMbCgR94",
  "refresh_expires_at": "2026-11-27T14:58:16.272548418Z",
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
  "command_id": "f2137228-e5fe-4eb9-a3b8-de925ed551ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:17Z",
    "sequence": 1793199497436
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "894de4d6-c4cb-4f32-a847-7ffb371a461b",
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
  "last_heartbeat_at": "2026-10-28T14:58:17.061316Z",
  "last_location_at": "2026-10-28T14:58:17.061316Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "b278197a-757f-4b69-a78c-08d9e42335a0",
  "points": [
    {
      "sequence": 1793199499323,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:57:19Z"
    },
    {
      "sequence": 1793199499331,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-28T14:58:19Z"
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
  "session_id": "af850eae-3792-4227-a012-d02601d4abac",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDAzOTksImlhdCI6MTc5MzE5OTQ5OSwianRpIjoiM2NlOGY0ZjctMmNiNC00ZDYxLTg2YTItYjY3NGQzMjM5M2NlIiwic2lkIjoiYWY4NTBlYWUtMzc5Mi00MjI3LWEwMTItZDAyNjAxZDRhYmFjIn0.8AYQXFi2RU3OTVF4_54-_CJugUrHwgqY-9XrNWgYXRg",
  "access_expires_at": "2026-10-28T15:13:19.923615969Z",
  "refresh_token": "DbEAUe9uHITNvqB_eAYKPl4gi3W_kcpSDwgxyK5KHNE",
  "refresh_expires_at": "2026-10-29T02:58:19.923076624Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "f26988fa-fb13-466f-ac29-81b808ba4842",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-28T14:58:19Z",
        "track_point_id": "dbf9e97e-6feb-4e88-916b-cb920d9d225f",
        "work_session_id": "894de4d6-c4cb-4f32-a847-7ffb371a461b"
      },
      "raised_by": null,
      "raised_at": "2026-10-28T14:58:19Z",
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

`POST /api/admin/v1/driver-risk-flags/f26988fa-fb13-466f-ac29-81b808ba4842/confirm` → **200**

```json
{
  "command_id": "44cba491-9d72-4382-902b-9f49529f61f3",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "f26988fa-fb13-466f-ac29-81b808ba4842",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-28T14:58:19Z",
    "track_point_id": "dbf9e97e-6feb-4e88-916b-cb920d9d225f",
    "work_session_id": "894de4d6-c4cb-4f32-a847-7ffb371a461b"
  },
  "raised_by": null,
  "raised_at": "2026-10-28T14:58:19Z",
  "reason": null,
  "reviewed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reviewed_at": "2026-10-28T14:58:20.764687Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/f26988fa-fb13-466f-ac29-81b808ba4842/dismiss` → **409**

```json
{
  "command_id": "d3aefad3-fc8b-48e8-a890-1d4501b2aa37",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/f26988fa-fb13-466f-ac29-81b808ba4842/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f815cc73-5a34-4e5c-8958-507117ef08e4"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "1f3b9b28-6f62-411a-98df-9524452b69c2",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "58976d34-faf3-4fa9-975e-030e1d3f7ab9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "raised_at": "2026-10-28T14:58:21.305406Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/58976d34-faf3-4fa9-975e-030e1d3f7ab9/dismiss` → **200**

```json
{
  "command_id": "b229aac0-f7a5-4ea7-a121-12be39303cdb",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "58976d34-faf3-4fa9-975e-030e1d3f7ab9",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "raised_at": "2026-10-28T14:58:21.305406Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reviewed_at": "2026-10-28T14:58:21.58641Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "0b2955ed-c06e-4829-b199-88c0d76b9fe1",
  "expected_version": 4,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "f26988fa-fb13-466f-ac29-81b808ba4842"
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
      "actor_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:58:21.86915Z"
    }
  ]
}
```

Done: flag f26988fa-fb13-466f-ac29-81b808ba4842 confirmed, suspension named it, driver reinstated.

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
  "session_id": "f3f7c7f0-ddad-42c1-bf7f-8502608a49e0",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MDIsImlhdCI6MTc5MzE5OTUwMiwianRpIjoiYTBkZTBlYjUtMGNlMC00YTFkLTk2OWMtNWQ1MWMwNWIzYzRmIiwic2lkIjoiZjNmN2M3ZjAtZGRhZC00MmMxLWJmN2YtODUwMjYwOGE0OWUwIn0.V2bZygo__ykdoJcFQAQoDtNA7x2S2spXP1fAnv2foIc",
  "access_expires_at": "2026-10-28T15:13:22.693173737Z",
  "refresh_token": "gIqTwdLL1nAo6ERtB9SLCK7jbluh2lpbe4o3JDtGPJQ",
  "refresh_expires_at": "2026-10-29T02:58:22.692635204Z",
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
      "actor_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:58:21.86915Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "52823c32-ddb8-4062-951d-41fed2d9287a",
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
  "session_id": "894de4d6-c4cb-4f32-a847-7ffb371a461b",
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
  "last_heartbeat_at": "2026-10-28T14:58:17.061316Z",
  "last_location_at": "2026-10-28T14:58:17.061316Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/894de4d6-c4cb-4f32-a847-7ffb371a461b/close` → **200**

```json
{
  "command_id": "ed7c3e9a-ac3e-4f90-ba06-4fcee4f22038",
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
  "session_id": "104d9061-fe94-45da-b540-5ec8256bf097",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MDQsImlhdCI6MTc5MzE5OTUwNCwianRpIjoiYzhlNmZkOWEtZjYzNS00MTY0LTgxNGYtOTY2NDYxNjY2MDc1Iiwic2lkIjoiMTA0ZDkwNjEtZmU5NC00NWRhLWI1NDAtNWVjODI1NmJmMDk3In0.vMXzqm3kxe4wXhIRVm8NqJUFz6-l76i7pyxmHpu7YGc",
  "access_expires_at": "2026-10-28T15:13:24.329133962Z",
  "refresh_token": "t9pE2i71WWNmWj3kttgtP4riWH5PoLqvFoVSHEJ3oz4",
  "refresh_expires_at": "2026-10-29T02:58:24.328571683Z",
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
  "command_id": "55ed506d-8b0a-41bd-90e5-28048d37314a",
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
  "changed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:58:24.881138Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "55ed506d-8b0a-41bd-90e5-28048d37314a",
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
  "changed_by": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-28T14:58:24.881138Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48132349740",
  "device_ref": "sandbox-85"
}
```

```json
{
  "challenge_id": "559ebf0d-79c8-40a0-8997-2f81cf69db08",
  "expires_at": "2026-10-28T15:03:25.441027788Z",
  "resend_available_at": "2026-10-28T14:58:26.441027788Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48132349740` → **200**

```json
{
  "phone": "+48132349740",
  "audience": "CLIENT",
  "code": "538303",
  "sent_at": "2026-10-28T14:58:25.443191787Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "559ebf0d-79c8-40a0-8997-2f81cf69db08",
  "code": "538303",
  "device_ref": "sandbox-85"
}
```

```json
{
  "session_id": "1cceeb79-d03e-4c36-b0dc-4db433e56fa4",
  "subject": {
    "type": "CLIENT",
    "id": "8c7deb26-39b0-4add-b0cb-69104dd41b47"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YzdkZWIyNi0zOWIwLTRhZGQtYjBjYi02OTEwNGRkNDFiNDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDA1LCJpYXQiOjE3OTMxOTk1MDUsImp0aSI6ImVhNjJjNzllLWUxY2ItNGViMC1iNzEzLWMxM2Y3MzJhYWFhNCIsInNpZCI6IjFjY2VlYjc5LWQwM2UtNGMzNi1iMGRjLTRkYjQzM2U1NmZhNCJ9.nzHZIlLmMQXkjrMAFPZlRriBhdPGmyQyuQvmEKL672Y",
  "access_expires_at": "2026-10-28T15:13:25.724117217Z",
  "refresh_token": "2LpJCiNh0KsThmagLn89_iRbNwyKwt9v0uIufFEIB4M",
  "refresh_expires_at": "2026-11-27T14:58:25.723530293Z",
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
  "correlation_id": "577139b2-d761-4749-95ac-f9e15a6dd3e7"
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
  "device_ref": "sandbox-19958"
}
```

```json
{
  "challenge_id": "6cc30c9d-2445-4217-ad6d-72a81c861558",
  "expires_at": "2026-10-28T15:03:26.517186193Z",
  "resend_available_at": "2026-10-28T14:58:27.517186193Z"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "646968",
  "sent_at": "2026-10-28T14:58:26.519209748Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6cc30c9d-2445-4217-ad6d-72a81c861558",
  "code": "646968",
  "device_ref": "sandbox-19958"
}
```

```json
{
  "session_id": "1e5aadd2-aed0-4c1e-8d4d-2ca476f55fca",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQwNiwiaWF0IjoxNzkzMTk5NTA2LCJqdGkiOiJlZGIyZTViMy1iMjVkLTQwZWQtOWJhMy01NDg1N2M3YjA4ODQiLCJzaWQiOiIxZTVhYWRkMi1hZWQwLTRjMWUtOGQ0ZC0yY2E0NzZmNTVmY2EifQ.sAzP4KfCU5CNfq8RgZAscYY_liaOqf17jJ6Je8qSkwM",
  "access_expires_at": "2026-10-28T15:13:26.80883719Z",
  "refresh_token": "RNRGTlfy4DnQkU-_PdtZKrg_8yeLMeN-AcLFVEnpKKo",
  "refresh_expires_at": "2026-11-27T14:58:26.808283161Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be55979e-5beb-48f5-9062-a9e68154d895",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T14:57:59.326913Z",
  "last_location_at": "2026-10-28T14:57:59.326913Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/be55979e-5beb-48f5-9062-a9e68154d895/handover` → **200**

```json
{
  "command_id": "aba77de9-23f5-4c96-98d9-32ec4b7066ce",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be55979e-5beb-48f5-9062-a9e68154d895",
  "session_version": 1,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "STALE",
  "geolocation": "STALE",
  "occupancy": "FREE",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "last_heartbeat_at": "2026-10-28T14:57:59.326913Z",
  "last_location_at": "2026-10-28T14:57:59.326913Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/be55979e-5beb-48f5-9062-a9e68154d895/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:27Z",
    "sequence": 1793199507605
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "be55979e-5beb-48f5-9062-a9e68154d895",
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
  "last_heartbeat_at": "2026-10-28T14:58:27.626669Z",
  "last_location_at": "2026-10-28T14:58:27.626669Z",
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
  "session_id": "be55979e-5beb-48f5-9062-a9e68154d895",
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
  "last_heartbeat_at": "2026-10-28T14:58:27.626669Z",
  "last_location_at": "2026-10-28T14:58:27.626669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/be55979e-5beb-48f5-9062-a9e68154d895/close` → **200**

```json
{
  "command_id": "16b6f613-5d3e-463c-890e-f27d7fd02192",
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
  "correlation_id": "e324d8de-4180-49fc-989d-eee3e82400a5"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679565643",
  "device_ref": "sandbox-25274"
}
```

```json
{
  "challenge_id": "65ebb157-7f70-401c-b486-e7eed4bd6244",
  "expires_at": "2026-10-28T15:03:28.960850891Z",
  "resend_available_at": "2026-10-28T14:58:29.960850891Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380679565643` → **200**

```json
{
  "phone": "+380679565643",
  "audience": "CLIENT",
  "code": "327477",
  "sent_at": "2026-10-28T14:58:28.963421037Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "65ebb157-7f70-401c-b486-e7eed4bd6244",
  "code": "327477",
  "device_ref": "sandbox-25274"
}
```

```json
{
  "session_id": "955e425c-a78f-4fbe-a9aa-f4beadd49547",
  "subject": {
    "type": "CLIENT",
    "id": "1b77aaf7-d232-40b5-818b-571615625188"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjc3YWFmNy1kMjMyLTQwYjUtODE4Yi01NzE2MTU2MjUxODgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjAwNDA5LCJpYXQiOjE3OTMxOTk1MDksImp0aSI6ImMzNGJjZWRhLTA1ODQtNGQ5Ny1hYWI1LTRlYjA3MzEwNjA3ZCIsInNpZCI6Ijk1NWU0MjVjLWE3OGYtNGZiZS1hOWFhLWY0YmVhZGQ0OTU0NyJ9.3fT9FITw8ft0ikKxeHdA__3e4suTAyJea8PwcNqsDeE",
  "access_expires_at": "2026-10-28T15:13:29.245889434Z",
  "refresh_token": "yB5cRGcA8hQA5jfuttRuMi6hcPOPO4eyN9sQ1nZOo6k",
  "refresh_expires_at": "2026-11-27T14:58:29.245358666Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "f41da405-a73a-4565-ac84-129357c874b7",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "c5a12c33-d188-4e80-a435-483d24181e5f",
  "upload_path": "/api/rider/v1/uploads/c5a12c33-d188-4e80-a435-483d24181e5f",
  "expires_at": "2026-10-28T15:13:29.507850871Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/c5a12c33-d188-4e80-a435-483d24181e5f` → **200**

```json
{
  "file_id": "c5a12c33-d188-4e80-a435-483d24181e5f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "b817c934-40b6-468a-b371-aef6112e9887",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "c5a12c33-d188-4e80-a435-483d24181e5f"
  ]
}
```

```json
{
  "id": "fda87635-4fab-4e94-a067-3fc5a0e1cc11",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b77aaf7-d232-40b5-818b-571615625188",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:58:29.817371Z",
  "updated_at": "2026-10-28T14:58:29.817371Z",
  "messages": [
    {
      "id": "b695b71d-2b5f-4900-b075-6dc1d5ee78bf",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b77aaf7-d232-40b5-818b-571615625188",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:29.818786Z",
      "attachments": [
        {
          "file_id": "c5a12c33-d188-4e80-a435-483d24181e5f",
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
  "session_id": "060aa5b9-5aa7-4704-8428-b4cc139d8cd4",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTAsImlhdCI6MTc5MzE5OTUxMCwianRpIjoiM2U5MTg4OTAtMzliYy00MjY0LWJlODYtYzVmZDNiZmI0YmMwIiwic2lkIjoiMDYwYWE1YjktNWFhNy00NzA0LTg0MjgtYjRjYzEzOWQ4Y2Q0In0.wZvWCmM-7KBcZ3FCisGf6wI1l1zhwzcHvsL5d9qIIXY",
  "access_expires_at": "2026-10-28T15:13:30.399964514Z",
  "refresh_token": "14u09Bf0WXC_BDx95lWSjrDYz7Nx8uA-nk40Pzt9K5Q",
  "refresh_expires_at": "2026-10-29T02:58:30.399469575Z",
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
  "session_id": "266cc939-fd72-4eb5-911d-6d8cc912c56e",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTAsImlhdCI6MTc5MzE5OTUxMCwianRpIjoiMDRhNjNhYWMtNWIzZi00MTY5LWIwMTUtMzljM2UwN2QyZDkwIiwic2lkIjoiMjY2Y2M5MzktZmQ3Mi00ZWI1LTkxMWQtNmQ4Y2M5MTJjNTZlIn0.NPTBgh0xLApiw-D7z1Y0plLw4a9joQF-JWlc4wlYDvc",
  "access_expires_at": "2026-10-28T15:13:30.954368631Z",
  "refresh_token": "hoWFtDJ6RBsoEwH_R9rfP_gH7QrRcsq-nBJfAOgSbUY",
  "refresh_expires_at": "2026-10-29T02:58:30.953711713Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/fda87635-4fab-4e94-a067-3fc5a0e1cc11/attachments/c5a12c33-d188-4e80-a435-483d24181e5f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "d104e620-195f-46f1-a91f-ec47e5534eed",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "fbc06f57-71ed-47a8-b33b-229a949c1b37",
  "upload_path": "/api/operator/v1/uploads/fbc06f57-71ed-47a8-b33b-229a949c1b37",
  "expires_at": "2026-10-28T15:13:31.228584094Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/fbc06f57-71ed-47a8-b33b-229a949c1b37` → **200**

```json
{
  "file_id": "fbc06f57-71ed-47a8-b33b-229a949c1b37",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/fda87635-4fab-4e94-a067-3fc5a0e1cc11` → **200**

```json
{
  "id": "fda87635-4fab-4e94-a067-3fc5a0e1cc11",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b77aaf7-d232-40b5-818b-571615625188",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-28T14:58:29.817371Z",
  "updated_at": "2026-10-28T14:58:29.817371Z",
  "messages": [
    {
      "id": "b695b71d-2b5f-4900-b075-6dc1d5ee78bf",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b77aaf7-d232-40b5-818b-571615625188",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:29.818786Z",
      "attachments": [
        {
          "file_id": "c5a12c33-d188-4e80-a435-483d24181e5f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/fda87635-4fab-4e94-a067-3fc5a0e1cc11/comments` → **200**

```json
{
  "command_id": "3d65ee9a-b759-4708-aff9-58b1d8a5f4a8",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "fbc06f57-71ed-47a8-b33b-229a949c1b37"
  ]
}
```

```json
{
  "id": "fda87635-4fab-4e94-a067-3fc5a0e1cc11",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b77aaf7-d232-40b5-818b-571615625188",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:58:29.817371Z",
  "updated_at": "2026-10-28T14:58:31.790605Z",
  "messages": [
    {
      "id": "b695b71d-2b5f-4900-b075-6dc1d5ee78bf",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b77aaf7-d232-40b5-818b-571615625188",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:29.818786Z",
      "attachments": [
        {
          "file_id": "c5a12c33-d188-4e80-a435-483d24181e5f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "54516347-f684-48a7-ae05-ddaaa11b9df4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:58:31.790167Z",
      "attachments": [
        {
          "file_id": "fbc06f57-71ed-47a8-b33b-229a949c1b37",
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

`GET /api/rider/v1/support/cases/fda87635-4fab-4e94-a067-3fc5a0e1cc11` → **200**

```json
{
  "id": "fda87635-4fab-4e94-a067-3fc5a0e1cc11",
  "number": 1,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "1b77aaf7-d232-40b5-818b-571615625188",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-28T14:58:29.817371Z",
  "updated_at": "2026-10-28T14:58:31.790605Z",
  "messages": [
    {
      "id": "b695b71d-2b5f-4900-b075-6dc1d5ee78bf",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "1b77aaf7-d232-40b5-818b-571615625188",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-28T14:58:29.818786Z",
      "attachments": [
        {
          "file_id": "c5a12c33-d188-4e80-a435-483d24181e5f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "54516347-f684-48a7-ae05-ddaaa11b9df4",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-28T14:58:31.790167Z",
      "attachments": [
        {
          "file_id": "fbc06f57-71ed-47a8-b33b-229a949c1b37",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/fda87635-4fab-4e94-a067-3fc5a0e1cc11/attachments/fbc06f57-71ed-47a8-b33b-229a949c1b37` → **200**

Done: support case fda87635-4fab-4e94-a067-3fc5a0e1cc11, rider attachment c5a12c33-d188-4e80-a435-483d24181e5f, operator attachment fbc06f57-71ed-47a8-b33b-229a949c1b37.

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
  "session_id": "8c5ad88d-f0b9-4ad2-a358-a45ff641e4a9",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTIsImlhdCI6MTc5MzE5OTUxMiwianRpIjoiZDczMmQ1YzctNjQ3OC00NzBhLWJjYzItNTNjZjczMjkzNWE1Iiwic2lkIjoiOGM1YWQ4OGQtZjBiOS00YWQyLWEzNTgtYTQ1ZmY2NDFlNGE5In0.VcX40sWlnYn59MXsurBTTIkurIc_XpYATjxMAxniw00",
  "access_expires_at": "2026-10-28T15:13:32.651230336Z",
  "refresh_token": "fSj57wK55pTP8NUASLkLS5Gk7oglwuce-IYvFPV3sXU",
  "refresh_expires_at": "2026-10-29T02:58:32.65042406Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-11040"
}
```

```json
{
  "challenge_id": "fcf81e70-fe48-489d-9388-eeef05dc84f2",
  "expires_at": "2026-10-28T15:03:32.915559112Z",
  "resend_available_at": "2026-10-28T14:58:33.915559112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "073557",
  "sent_at": "2026-10-28T14:58:32.917830432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcf81e70-fe48-489d-9388-eeef05dc84f2",
  "code": "073557",
  "device_ref": "sandbox-11040"
}
```

```json
{
  "session_id": "ab887836-ae7f-47f1-99c3-39c1c4629fde",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQxMywiaWF0IjoxNzkzMTk5NTEzLCJqdGkiOiI3MDI1ZjdlZS04MzFiLTQxZjctYmJlZi0yZDVlYzNiYmMzYWQiLCJzaWQiOiJhYjg4NzgzNi1hZTdmLTQ3ZjEtOTljMy0zOWMxYzQ2MjlmZGUifQ.fmUHKXo46dgCB5FCXsJV0zo06BG7UifUh6en-cxe8TQ",
  "access_expires_at": "2026-10-28T15:13:33.201646047Z",
  "refresh_token": "OiVhpTaCPNvOfa1kVHZsPgLX3sqAy5UAFZfotZ0dTs8",
  "refresh_expires_at": "2026-11-27T14:58:33.201095463Z",
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
      "actor_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-28T14:58:21.86915Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d",
      "reason": "Sandbox clean-up",
      "at": "2026-10-28T14:58:23.221671Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "366c289d-ade4-41f7-9bf0-d9b1abd2d79c",
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
  "device_ref": "sandbox-27119"
}
```

```json
{
  "challenge_id": "b2ae07fa-7da8-449c-9c02-a8ef9743430e",
  "expires_at": "2026-10-28T15:03:34.259878793Z",
  "resend_available_at": "2026-10-28T14:58:35.259878793Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "786821",
  "sent_at": "2026-10-28T14:58:34.261870668Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b2ae07fa-7da8-449c-9c02-a8ef9743430e",
  "code": "786821",
  "device_ref": "sandbox-27119"
}
```

```json
{
  "session_id": "95d5fab3-2a0a-4f54-b36a-c04dfb1364e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzIwMDQxNCwiaWF0IjoxNzkzMTk5NTE0LCJqdGkiOiJlODk4NzFhZS0yZGM1LTRkNzQtYTk1YS0yZTk1OTMxNDgwZmMiLCJzaWQiOiI5NWQ1ZmFiMy0yYTBhLTRmNTQtYjM2YS1jMDRkZmIxMzY0ZTgifQ.t8V7k26g4W--KWR1tAsHh0NB7_lcR0hf_HfmZzIWKnA",
  "access_expires_at": "2026-10-28T15:13:34.542717813Z",
  "refresh_token": "_D8Gc0hYfQT1Qpmlxrqlq8l8Iq9LxWG1wp0SEYINKzw",
  "refresh_expires_at": "2026-11-27T14:58:34.54218436Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:06.155627Z",
  "last_location_at": "2026-10-28T14:58:06.155627Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6afe221c-24b7-4797-9134-74ca2d33f541/handover` → **200**

```json
{
  "command_id": "ffec496d-c87e-4e18-9672-ca51240eb708",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:06.155627Z",
  "last_location_at": "2026-10-28T14:58:06.155627Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6afe221c-24b7-4797-9134-74ca2d33f541/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:35Z",
    "sequence": 1793199515321
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:35.339099Z",
  "last_location_at": "2026-10-28T14:58:35.339099Z",
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
  "command_id": "a738a114-f471-4d30-9a9e-823c3c352bd9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:35Z",
    "sequence": 1793199515850
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f872ba09-0f44-4090-a1c2-c2cd537b3c5d",
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
  "last_heartbeat_at": "2026-10-28T14:58:35.867594Z",
  "last_location_at": "2026-10-28T14:58:35.867594Z",
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
  "session_id": "955c93ce-837b-485a-9d5b-df6bad67450b",
  "subject": {
    "type": "STAFF",
    "id": "d4b48cf3-622e-4949-92b5-ac3526d95d0d"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNGI0OGNmMy02MjJlLTQ5NDktOTJiNS1hYzM1MjZkOTVkMGQiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyMDA0MTYsImlhdCI6MTc5MzE5OTUxNiwianRpIjoiOTA1ODY4ODktOGJlMC00OGIwLWI0MjUtYjhiODZhOWM2YzA4Iiwic2lkIjoiOTU1YzkzY2UtODM3Yi00ODVhLTlkNWItZGY2YmFkNjc0NTBiIn0.NLcUXp9z5oBFoKt0XoVPyesqtegicfn5TGHymgelqIk",
  "access_expires_at": "2026-10-28T15:13:36.423810364Z",
  "refresh_token": "ZkQzEfNLeEkk7pj4cBpYPTpPruJqRO8nvp4V14ba-ZM",
  "refresh_expires_at": "2026-10-29T02:58:36.423251613Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2b3621fb-a97f-41d6-8982-9debb16896bd",
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
  "id": "005b7b92-e002-4f8a-bfd8-70787fb02639",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-28T15:03:36.680506Z",
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
  "command_id": "d37a702c-d70d-4bbf-99b2-dd66740fe66e",
  "quote_id": "005b7b92-e002-4f8a-bfd8-70787fb02639",
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
  "id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "short_number": 20,
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
  "created_at": "2026-10-28T14:58:36.948479Z",
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
    "id": "e73a2f38-abee-46a2-8ecd-3964521dfc13",
    "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
    "expires_at": "2026-10-28T14:58:51.95166Z",
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

`POST /api/driver/v1/offers/e73a2f38-abee-46a2-8ecd-3964521dfc13/accept` → **200**

```json
{
  "command_id": "0572e3ce-5a22-4220-ba24-6df9b0b30520"
}
```

```json
{
  "id": "a8e6fb79-5054-4d48-8935-abd2fa0eb918",
  "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "cbc93cda-9ded-4b2f-9b69-f792eedbb6b9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "cbc93cda-9ded-4b2f-9b69-f792eedbb6b9",
  "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "assignment_id": "a8e6fb79-5054-4d48-8935-abd2fa0eb918",
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

`POST /api/driver/v1/work-sessions/f872ba09-0f44-4090-a1c2-c2cd537b3c5d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-28T14:58:38Z",
    "sequence": 1793199518264
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f872ba09-0f44-4090-a1c2-c2cd537b3c5d",
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
  "last_heartbeat_at": "2026-10-28T14:58:38.282308Z",
  "last_location_at": "2026-10-28T14:58:38.282308Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/cbc93cda-9ded-4b2f-9b69-f792eedbb6b9/arrive` → **200**

```json
{
  "command_id": "0c584edf-6518-45de-b5ca-67a27489a765",
  "expected_version": 0
}
```

```json
{
  "id": "cbc93cda-9ded-4b2f-9b69-f792eedbb6b9",
  "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "assignment_id": "a8e6fb79-5054-4d48-8935-abd2fa0eb918",
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
  "arrived_at": "2026-10-28T14:58:38.553901Z",
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

`POST /api/driver/v1/trips/cbc93cda-9ded-4b2f-9b69-f792eedbb6b9/start` → **200**

```json
{
  "command_id": "07570395-40d1-4678-abd5-ed95c4dd3597",
  "expected_version": 1
}
```

```json
{
  "id": "cbc93cda-9ded-4b2f-9b69-f792eedbb6b9",
  "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "assignment_id": "a8e6fb79-5054-4d48-8935-abd2fa0eb918",
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
  "arrived_at": "2026-10-28T14:58:38.553901Z",
  "started_at": "2026-10-28T14:58:38.823532Z",
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

`POST /api/driver/v1/trips/cbc93cda-9ded-4b2f-9b69-f792eedbb6b9/complete` → **200**

```json
{
  "command_id": "3caff35f-834e-40e1-9881-5fd0309ed11c",
  "expected_version": 2,
  "reported_at": "2026-10-28T14:58:39Z",
  "cash_received": true
}
```

```json
{
  "id": "cbc93cda-9ded-4b2f-9b69-f792eedbb6b9",
  "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "assignment_id": "a8e6fb79-5054-4d48-8935-abd2fa0eb918",
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
  "arrived_at": "2026-10-28T14:58:38.553901Z",
  "started_at": "2026-10-28T14:58:38.823532Z",
  "completed_at": "2026-10-28T14:58:39.099955Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d0cccf25-1f42-4bfa-8b0e-52a89a73c08a` → **200**

```json
{
  "id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
  "short_number": 20,
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
    "id": "a8e6fb79-5054-4d48-8935-abd2fa0eb918",
    "order_id": "d0cccf25-1f42-4bfa-8b0e-52a89a73c08a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "cbc93cda-9ded-4b2f-9b69-f792eedbb6b9",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-28T14:58:36.948479Z",
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
  "session_id": "6afe221c-24b7-4797-9134-74ca2d33f541",
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
  "last_heartbeat_at": "2026-10-28T14:58:35.339099Z",
  "last_location_at": "2026-10-28T14:58:35.339099Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6afe221c-24b7-4797-9134-74ca2d33f541/close` → **200**

```json
{
  "command_id": "02acf48c-e56a-4326-943d-6d7de1c62199",
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
  "session_id": "f872ba09-0f44-4090-a1c2-c2cd537b3c5d",
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
  "last_heartbeat_at": "2026-10-28T14:58:38.282308Z",
  "last_location_at": "2026-10-28T14:58:38.282308Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f872ba09-0f44-4090-a1c2-c2cd537b3c5d/close` → **200**

```json
{
  "command_id": "12691c8f-eaf4-4027-9aa3-da616fd19959",
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

Done: terminal order d0cccf25-1f42-4bfa-8b0e-52a89a73c08a by Andrii (5a000000-0000-4000-8000-000000000403).
