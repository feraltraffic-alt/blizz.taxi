# Sandbox transcript (2026-10-29T15:44:19Z, c1d827d)

# Scenario: app-version

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
  "correlation_id": "71d716f1-ffe6-4d42-9b00-ca48a35b024b"
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
  "session_id": "2f422ed3-21ff-4d4a-b426-1252b4a2addc",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1NjYsImlhdCI6MTc5MzI4ODY2NiwianRpIjoiYmExYzA3NjgtZGE0OC00ZmY5LWI3ZDAtZTBhODgzYmY0ODFkIiwic2lkIjoiMmY0MjJlZDMtMjFmZi00ZDRhLWI0MjYtMTI1MmI0YTJhZGRjIn0.aq6-UYRBN6eWz7emdyMY5iJqstW7-sX21o7QWza05eI",
  "access_expires_at": "2026-10-29T15:59:26.618105558Z",
  "refresh_token": "mxIUVdr-KnFarMBcFxLXpYoLKbXbArTJLgBd1InfTSE",
  "refresh_expires_at": "2026-10-30T03:44:26.615369101Z",
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
  "session_id": "8e155199-9876-4324-8c14-f4fd31dc8621",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1NjgsImlhdCI6MTc5MzI4ODY2OCwianRpIjoiYWYzMGQ0YWMtMDk3Mi00ZmQ5LTg0YzgtZTRhZGNlMWQ5MDk0Iiwic2lkIjoiOGUxNTUxOTktOTg3Ni00MzI0LThjMTQtZjRmZDMxZGM4NjIxIn0.U6w4x9oswibu5C_0HJvvCImvcFTeYLoHmomJaK3GEsM",
  "access_expires_at": "2026-10-29T15:59:28.521871834Z",
  "refresh_token": "YmPRra52EizRU4Yqp32FvtggzU9ZKudVqu02QxFYLu4",
  "refresh_expires_at": "2026-10-30T03:44:28.52081286Z",
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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

## Ivan is online with his app and takes an order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-2144"
}
```

```json
{
  "challenge_id": "b88b5bcb-f746-4c14-9b9a-10a8e88e7be7",
  "expires_at": "2026-10-29T15:49:29.139571907Z",
  "resend_available_at": "2026-10-29T15:44:30.139571907Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "861871",
  "sent_at": "2026-10-29T15:44:29.151973667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b88b5bcb-f746-4c14-9b9a-10a8e88e7be7",
  "code": "861871",
  "device_ref": "sandbox-2144"
}
```

```json
{
  "session_id": "5976518a-9ddf-4398-9d2d-c608decadb51",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTU2OSwiaWF0IjoxNzkzMjg4NjY5LCJqdGkiOiI3NjU4OGUxYy1iMDYwLTRmYjUtYTgyNS0xNmIxNzFkMDk0NTIiLCJzaWQiOiI1OTc2NTE4YS05ZGRmLTQzOTgtOWQyZC1jNjA4ZGVjYWRiNTEifQ.dGAjV_q5Qio99JG4jc83ramr_iHvpKNFJ1TJm4CGJh4",
  "access_expires_at": "2026-10-29T15:59:29.486651494Z",
  "refresh_token": "_Zq8rfgqh0P1VEsf3PPAQYwVuxbKfnwpMwNxMAKItLI",
  "refresh_expires_at": "2026-11-28T15:44:29.485469589Z",
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
  "command_id": "a439d930-6d82-4aea-9bc9-81734f7c4d64",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:30Z",
    "sequence": 1793288670503
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "765d60d9-daff-42fc-809d-b92daeaf31b6",
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
  "last_heartbeat_at": "2026-10-29T15:44:30.128188Z",
  "last_location_at": "2026-10-29T15:44:30.128188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636507731",
  "device_ref": "sandbox-11346"
}
```

```json
{
  "challenge_id": "e7c8e3f7-7b23-4756-a0b2-011fec40c8ea",
  "expires_at": "2026-10-29T15:49:30.431605953Z",
  "resend_available_at": "2026-10-29T15:44:31.431605953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636507731` → **200**

```json
{
  "phone": "+380636507731",
  "audience": "CLIENT",
  "code": "369232",
  "sent_at": "2026-10-29T15:44:30.436355699Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7c8e3f7-7b23-4756-a0b2-011fec40c8ea",
  "code": "369232",
  "device_ref": "sandbox-11346"
}
```

```json
{
  "session_id": "243c6f87-b719-4007-97f3-2df3bd832a76",
  "subject": {
    "type": "CLIENT",
    "id": "8a13f640-39fb-4b97-b466-4fece1edab3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YTEzZjY0MC0zOWZiLTRiOTctYjQ2Ni00ZmVjZTFlZGFiM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NTcwLCJpYXQiOjE3OTMyODg2NzAsImp0aSI6IjVmZjMxMGI4LWJmNTAtNGM1MC05YjAxLTIxZDAxN2JkMTlkZSIsInNpZCI6IjI0M2M2Zjg3LWI3MTktNDAwNy05N2YzLTJkZjNiZDgzMmE3NiJ9.U2A1a4tbAM31pYVXJWGdL7WUUeVDmhdozlBx0hY_8lQ",
  "access_expires_at": "2026-10-29T15:59:30.746463081Z",
  "refresh_token": "ARveulXCjsptR-EmN4Tj_XPeBTSE9sqcBPFyKKdXTBo",
  "refresh_expires_at": "2026-11-28T15:44:30.745198957Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c21278df-b984-4c63-9f25-f981b943c139",
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
  "id": "784f80bb-f42c-484c-b46b-754aa8ebe03a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:49:31.079050Z",
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
  "command_id": "f0e5d9d6-7d55-4ea0-9108-a8d3d8e20797",
  "quote_id": "784f80bb-f42c-484c-b46b-754aa8ebe03a",
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
  "id": "563c5c81-3166-45cc-babf-03ac172b19df",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8a13f640-39fb-4b97-b466-4fece1edab3e",
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
  "created_at": "2026-10-29T15:44:31.4655Z",
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
    "id": "c227d19b-c206-4ea7-b6c8-2cd20a86eae5",
    "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
    "expires_at": "2026-10-29T15:44:46.477504Z",
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

`POST /api/driver/v1/offers/c227d19b-c206-4ea7-b6c8-2cd20a86eae5/accept` → **200**

```json
{
  "command_id": "42e5fb78-f6e8-4665-9c19-488fcaf4c4e0"
}
```

```json
{
  "id": "58a3b261-8954-45c7-8275-03f12ec0a5c3",
  "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "473481b0-6121-442a-be5f-f7d7d422ce78",
  "trip_phase": "TO_PICKUP"
}
```

## While Ivan drives, staff require driver apps 9.0.0 or newer

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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "9286d0c1-1f2b-4d68-aabc-51fef2733504",
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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    }
  },
  "reason": "Sandbox: force an update"
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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    }
  },
  "changed_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:44:32.743835803Z"
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
      "minimum_version": "9.0.0",
      "latest_version": "9.0.0"
    },
```

## With the old app Ivan still finishes the trip

`GET /api/driver/v1/trips/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "id": "473481b0-6121-442a-be5f-f7d7d422ce78",
  "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
  "assignment_id": "58a3b261-8954-45c7-8275-03f12ec0a5c3",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/765d60d9-daff-42fc-809d-b92daeaf31b6/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:33Z",
    "sequence": 1793288673644
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "765d60d9-daff-42fc-809d-b92daeaf31b6",
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
  "last_heartbeat_at": "2026-10-29T15:44:33.671186Z",
  "last_location_at": "2026-10-29T15:44:33.671186Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/473481b0-6121-442a-be5f-f7d7d422ce78/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "7c57b90f-610b-44e4-b398-468543d53acf",
  "expected_version": 0
}
```

```json
{
  "id": "473481b0-6121-442a-be5f-f7d7d422ce78",
  "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
  "assignment_id": "58a3b261-8954-45c7-8275-03f12ec0a5c3",
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
  "arrived_at": "2026-10-29T15:44:33.985112Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/473481b0-6121-442a-be5f-f7d7d422ce78/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c473efa2-02a6-4913-8f32-742610e19dbf",
  "expected_version": 1
}
```

```json
{
  "id": "473481b0-6121-442a-be5f-f7d7d422ce78",
  "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
  "assignment_id": "58a3b261-8954-45c7-8275-03f12ec0a5c3",
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
  "arrived_at": "2026-10-29T15:44:33.985112Z",
  "started_at": "2026-10-29T15:44:34.294955Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/473481b0-6121-442a-be5f-f7d7d422ce78/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "c12f680b-0ffe-4454-8b2a-6531f2dbfe4a",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:44:34Z",
  "cash_received": true
}
```

```json
{
  "id": "473481b0-6121-442a-be5f-f7d7d422ce78",
  "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
  "assignment_id": "58a3b261-8954-45c7-8275-03f12ec0a5c3",
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
  "arrived_at": "2026-10-29T15:44:33.985112Z",
  "started_at": "2026-10-29T15:44:34.294955Z",
  "completed_at": "2026-10-29T15:44:34.603846Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## He closes his shift, and cannot go online again with the old app

`GET /api/driver/v1/work-sessions/current` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "765d60d9-daff-42fc-809d-b92daeaf31b6",
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
  "last_heartbeat_at": "2026-10-29T15:44:33.671186Z",
  "last_location_at": "2026-10-29T15:44:33.671186Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/765d60d9-daff-42fc-809d-b92daeaf31b6/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e7fbb71a-5f46-4fda-a5c6-f57b2c03c21a",
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

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **426**

```json
{
  "command_id": "28b913b1-02b7-4a69-93db-0f384a65e796",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:35Z",
    "sequence": 1793288675499
  }
}
```

```json
{
  "instance": "/api/driver/v1/work-sessions",
  "status": 426,
  "title": "Upgrade required",
  "type": "https://errors.blizz.taxi/upgrade-required",
  "code": "UPGRADE_REQUIRED",
  "correlation_id": "c08d00e2-ad94-4b6b-be43-58452b5efae2",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "9f28d98f-c5b2-4fd6-9527-f98f9c583a7f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:35Z",
    "sequence": 1793288675792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b29da926-01ec-4f29-9bce-77affb0a538d",
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
  "last_heartbeat_at": "2026-10-29T15:44:35.814641Z",
  "last_location_at": "2026-10-29T15:44:35.814641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

Done: an outdated driver app finished its trip, then was asked to update before going online.

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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "driver_ios": {
        "minimum_version": "9.0.0",
        "latest_version": "9.0.0"
      },
      "require_version_header": false
    }
  },
  "changed_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:44:32.743836Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "d34a7ad7-d79a-4ee0-91f4-953038120d0a",
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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "reason": "Sandbox: app version scenario over"
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
    "cash_not_received": {
      "credit_driver": true,
      "driver_share_percent": 100
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
  "changed_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:44:36.399893378Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b29da926-01ec-4f29-9bce-77affb0a538d",
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
  "last_heartbeat_at": "2026-10-29T15:44:35.814641Z",
  "last_location_at": "2026-10-29T15:44:35.814641Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b29da926-01ec-4f29-9bce-77affb0a538d/close` → **200**

```json
{
  "command_id": "b707d1fd-b4b9-499a-bdc6-79758acbc8ff",
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
  "session_id": "7a8c1aa1-6fd2-4b6e-9397-bf38b8a31591",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1NzcsImlhdCI6MTc5MzI4ODY3NywianRpIjoiYjE1YTI0MDktYWM3NC00ZmU2LTgyNWEtYTliM2Y4ZjhhMzI1Iiwic2lkIjoiN2E4YzFhYTEtNmZkMi00YjZlLTkzOTctYmYzOGI4YTMxNTkxIn0.4Lml_AEEZ4nS5Q2ehyqXNlbnfzBTjpPG6lSHhoYHSDI",
  "access_expires_at": "2026-10-29T15:59:37.573882173Z",
  "refresh_token": "WRDk5N-wqCq-PI7F7MtVrbq047cRt-cPHAaRIQXd_FE",
  "refresh_expires_at": "2026-10-30T03:44:37.573086799Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "f1ced721-87fe-4853-a401-3eaef8effca6",
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
  "id": "44c3c07b-70a7-4b05-bc3b-3d0f7559967f",
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
  "created_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "created_at": "2026-10-29T15:44:37.869272Z",
  "updated_at": "2026-10-29T15:44:37.869272Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630317573",
  "device_ref": "sandbox-21796"
}
```

```json
{
  "challenge_id": "137db921-36e4-4b44-868e-14d7b452ce5b",
  "expires_at": "2026-10-29T15:49:38.163677494Z",
  "resend_available_at": "2026-10-29T15:44:39.163677494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630317573` → **200**

```json
{
  "phone": "+380630317573",
  "audience": "CLIENT",
  "code": "472979",
  "sent_at": "2026-10-29T15:44:38.167949686Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "137db921-36e4-4b44-868e-14d7b452ce5b",
  "code": "472979",
  "device_ref": "sandbox-21796"
}
```

```json
{
  "session_id": "48d08119-309e-43f4-94a1-549e8dcb5cea",
  "subject": {
    "type": "CLIENT",
    "id": "e310e764-ed4c-42f1-bb65-6e0e44c7b5e3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlMzEwZTc2NC1lZDRjLTQyZjEtYmI2NS02ZTBlNDRjN2I1ZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NTc4LCJpYXQiOjE3OTMyODg2NzgsImp0aSI6ImNlM2JlNjU3LWFjNmUtNDBjMC1hMDg4LTU2YTQzMDgyN2E3MyIsInNpZCI6IjQ4ZDA4MTE5LTMwOWUtNDNmNC05NGExLTU0OWU4ZGNiNWNlYSJ9.p8aEfyQxIai7O-duPK1mrixwVi2f8agcAofdQmBSySo",
  "access_expires_at": "2026-10-29T15:59:38.474774027Z",
  "refresh_token": "Or8v5mEi3-X909pDI_ZY4etgcv4x-YYKl8GcUs-eAdE",
  "refresh_expires_at": "2026-11-28T15:44:38.474025564Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380630317573` → **200**

```json
{
  "client_id": "e310e764-ed4c-42f1-bb65-6e0e44c7b5e3"
}
```

`POST /api/admin/v1/rider-wallets/e310e764-ed4c-42f1-bb65-6e0e44c7b5e3/top-ups` → **201**

```json
{
  "command_id": "5a9f9285-c2be-4262-831e-5c7c10492440",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "e310e764-ed4c-42f1-bb65-6e0e44c7b5e3",
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
      "id": "bbd2e9aa-2827-4d9c-bddc-b7a60e1c64bd",
      "at": "2026-10-29T15:44:39.054324Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2137b256-f0be-45e7-add6-945d5f63aaca",
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
  "id": "ec280614-ce54-4dda-8576-5419fa0f1ac9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:49:39.360389Z",
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
      "id": "44c3c07b-70a7-4b05-bc3b-3d0f7559967f",
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
  "device_ref": "sandbox-8149"
}
```

```json
{
  "challenge_id": "12505205-1d0d-468f-abcd-c547e54021a9",
  "expires_at": "2026-10-29T15:49:39.663246437Z",
  "resend_available_at": "2026-10-29T15:44:40.663246437Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "585763",
  "sent_at": "2026-10-29T15:44:39.667603939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12505205-1d0d-468f-abcd-c547e54021a9",
  "code": "585763",
  "device_ref": "sandbox-8149"
}
```

```json
{
  "session_id": "adba5fa3-ce45-4a06-9a2b-ff0e2322e005",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTU3OSwiaWF0IjoxNzkzMjg4Njc5LCJqdGkiOiI4Zjg5YTZhZS01ZmNkLTRkMzEtYjNlNi0wZTZjNjU4ZjQwZmIiLCJzaWQiOiJhZGJhNWZhMy1jZTQ1LTRhMDYtOWEyYi1mZjBlMjMyMmUwMDUifQ.O0DBJ7gbCJKPZQ_ONE4M8eBFVTKu1EIZJfeL6v3CzIc",
  "access_expires_at": "2026-10-29T15:59:39.978170256Z",
  "refresh_token": "6WoC-3thVwZlqCh6btyZsTtYZWsJfKteQZI-wpxGwng",
  "refresh_expires_at": "2026-11-28T15:44:39.976751181Z",
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
  "command_id": "05731c0a-fbe2-41d4-8790-a93a231bbc01",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:40Z",
    "sequence": 1793288680547
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b24d3ce-22cc-4f8b-bcd6-3acc941291a8",
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
  "last_heartbeat_at": "2026-10-29T15:44:40.569557Z",
  "last_location_at": "2026-10-29T15:44:40.569557Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8a0f88b4-f245-4fb4-adeb-8880f7772177",
  "quote_id": "ec280614-ce54-4dda-8576-5419fa0f1ac9",
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
  "id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e310e764-ed4c-42f1-bb65-6e0e44c7b5e3",
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
  "created_at": "2026-10-29T15:44:40.877698Z",
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
  "client_id": "e310e764-ed4c-42f1-bb65-6e0e44c7b5e3",
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
      "id": "bbd2e9aa-2827-4d9c-bddc-b7a60e1c64bd",
      "at": "2026-10-29T15:44:39.054324Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
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
    "id": "b65a5ddb-922b-4a7a-bb75-dc1e78040dff",
    "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
    "expires_at": "2026-10-29T15:44:55.886894Z",
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

`POST /api/driver/v1/offers/b65a5ddb-922b-4a7a-bb75-dc1e78040dff/accept` → **200**

```json
{
  "command_id": "1d917640-8cf6-4eb9-8f5c-b89c5b10d252"
}
```

```json
{
  "id": "aaaf0bcb-828e-4eff-a9a9-226dc580f7e4",
  "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f658382c-2eb1-490f-af7c-61e216fd7de9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f658382c-2eb1-490f-af7c-61e216fd7de9",
  "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
  "assignment_id": "aaaf0bcb-828e-4eff-a9a9-226dc580f7e4",
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

`POST /api/driver/v1/work-sessions/9b24d3ce-22cc-4f8b-bcd6-3acc941291a8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:44:42Z",
    "sequence": 1793288682343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b24d3ce-22cc-4f8b-bcd6-3acc941291a8",
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
  "last_heartbeat_at": "2026-10-29T15:44:42.363668Z",
  "last_location_at": "2026-10-29T15:44:42.363668Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f658382c-2eb1-490f-af7c-61e216fd7de9/arrive` → **200**

```json
{
  "command_id": "ba030a81-cc5f-4c13-9b2f-4b1665c870d4",
  "expected_version": 0
}
```

```json
{
  "id": "f658382c-2eb1-490f-af7c-61e216fd7de9",
  "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
  "assignment_id": "aaaf0bcb-828e-4eff-a9a9-226dc580f7e4",
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
  "arrived_at": "2026-10-29T15:44:42.652511Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f658382c-2eb1-490f-af7c-61e216fd7de9/start` → **200**

```json
{
  "command_id": "6fd7be32-225f-4510-9575-7721b3989326",
  "expected_version": 1
}
```

```json
{
  "id": "f658382c-2eb1-490f-af7c-61e216fd7de9",
  "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
  "assignment_id": "aaaf0bcb-828e-4eff-a9a9-226dc580f7e4",
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
  "arrived_at": "2026-10-29T15:44:42.652511Z",
  "started_at": "2026-10-29T15:44:42.958981Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/f658382c-2eb1-490f-af7c-61e216fd7de9/complete` → **200**

```json
{
  "command_id": "e4d283b1-50ce-4239-85ac-eec38192d637",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:44:43Z",
  "cash_received": true
}
```

```json
{
  "id": "f658382c-2eb1-490f-af7c-61e216fd7de9",
  "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
  "assignment_id": "aaaf0bcb-828e-4eff-a9a9-226dc580f7e4",
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
  "arrived_at": "2026-10-29T15:44:42.652511Z",
  "started_at": "2026-10-29T15:44:42.958981Z",
  "completed_at": "2026-10-29T15:44:43.294435Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e310e764-ed4c-42f1-bb65-6e0e44c7b5e3",
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
      "id": "0607e3b9-a65f-4091-9d52-5a0ce361a54d",
      "at": "2026-10-29T15:44:44.060612Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745"
    },
    {
      "id": "bbd2e9aa-2827-4d9c-bddc-b7a60e1c64bd",
      "at": "2026-10-29T15:44:39.054324Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/44c3c07b-70a7-4b05-bc3b-3d0f7559967f/archive` → **200**

```json
{
  "command_id": "26747c04-c5d1-4773-aed5-a7ea12e6d4e4",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "44c3c07b-70a7-4b05-bc3b-3d0f7559967f",
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
  "created_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "created_at": "2026-10-29T15:44:37.869272Z",
  "updated_at": "2026-10-29T15:44:46.892896Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9b24d3ce-22cc-4f8b-bcd6-3acc941291a8",
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
  "last_heartbeat_at": "2026-10-29T15:44:42.363668Z",
  "last_location_at": "2026-10-29T15:44:42.363668Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9b24d3ce-22cc-4f8b-bcd6-3acc941291a8/close` → **200**

```json
{
  "command_id": "6d926a3d-ca98-4e39-b821-72a79a1a946a",
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

Done: order fca54d03-d5e6-467b-9e4c-4664dd82a745.

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
  "session_id": "2d16cbeb-b1b0-4991-8b44-faf16f2d3d2a",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1ODgsImlhdCI6MTc5MzI4ODY4OCwianRpIjoiZTRjMTM2OWItNDE1NS00MmUyLWEwZjYtY2ZmNmUyYzllZDZjIiwic2lkIjoiMmQxNmNiZWItYjFiMC00OTkxLThiNDQtZmFmMTZmMmQzZDJhIn0.C5yS0JCFUn2x_qJoX0DxMGQAG4wLosxYQofQ-OB5pc8",
  "access_expires_at": "2026-10-29T15:59:48.076384744Z",
  "refresh_token": "EXK49JQihSSJqwSItR-DFMctKgHkZMmsHomZtEEnd_I",
  "refresh_expires_at": "2026-10-30T03:44:48.075688326Z",
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
  "command_id": "786c5c06-9a37-4869-af27-afd26a90e568",
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
  "session_id": "00975398-f603-421f-a49e-ac4792e0b56e",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk1ODksImlhdCI6MTc5MzI4ODY4OSwianRpIjoiZjkzZDVhODEtOGYyMi00Y2Q0LWJkMjEtYmRjNjhkZWE1OTBkIiwic2lkIjoiMDA5NzUzOTgtZjYwMy00MjFmLWE0OWUtYWM0NzkyZTBiNTZlIn0.UgTaLl_1L_WjmDhWNIU1SpmpZ6D6akFmZYGj8ETddtM",
  "access_expires_at": "2026-10-29T15:59:49.261644839Z",
  "refresh_token": "f88BNw5IKhDG82mw5uNU1gU7xZRzZvAWVEXBfmb3fHY",
  "refresh_expires_at": "2026-10-30T03:44:49.260896277Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1219631200",
    "linkedid": "1730052700.1219631200",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673411474"
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
    "id": "1730052700.1219631200",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "4b3b5ae0-d9ef-4619-9e52-bbb42901e333",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.538522Z",
      "answered_at": null,
      "ended_at": "2026-10-29T15:44:49.564595Z",
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
    "id": "1730052600.10831693",
    "linkedid": "1730052600.10831693",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673411474"
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
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/7a6d47e1-da80-495b-b4b1-21b6181543d3/answer` → **200**

```json
{
  "command_id": "d9266e69-6238-4204-96aa-a8cd89bbc712"
}
```

```json
{
  "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673411474",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "order_ids": [],
  "started_at": "2026-10-29T15:44:49.886621Z",
  "answered_at": "2026-10-29T15:44:50.212809Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.10831693",
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
    "id": "1730052600.10831693",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
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
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
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
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
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
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
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
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:44:58.726426Z"
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
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:44:58.726426Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/7a6d47e1-da80-495b-b4b1-21b6181543d3/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/7a6d47e1-da80-495b-b4b1-21b6181543d3/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=7a6d47e1-da80-495b-b4b1-21b6181543d3` → **200**

```json
{
  "changes": [
    {
      "id": "6b1d47eb-da7e-4ed0-84fd-2487c3520ac7",
      "occurred_at": "2026-10-29T15:45:00.354982Z",
      "actor_type": "STAFF",
      "actor_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f5b0caf9-70fe-4e83-8925-8f6855ccbb1a\", \"order_ids\": []}",
      "correlation_id": "dbd7a778-0873-4d4f-8d5b-bdad2cfcc904"
    },
    {
      "id": "ba814c55-698f-4202-ac2e-a9ee13bfa2ab",
      "occurred_at": "2026-10-29T15:45:00.320872Z",
      "actor_type": "STAFF",
      "actor_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"f5b0caf9-70fe-4e83-8925-8f6855ccbb1a\", \"order_ids\": []}",
      "correlation_id": "d24d660c-affc-452b-bd07-330ad6487192"
    }
  ]
}
```

Done: call 7a6d47e1-da80-495b-b4b1-21b6181543d3 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29817"
}
```

```json
{
  "challenge_id": "2d92af5b-3a71-4b9e-8443-e787354f3f5f",
  "expires_at": "2026-10-29T15:50:00.711607704Z",
  "resend_available_at": "2026-10-29T15:45:01.711607704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "500059",
  "sent_at": "2026-10-29T15:45:00.717367187Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d92af5b-3a71-4b9e-8443-e787354f3f5f",
  "code": "500059",
  "device_ref": "sandbox-29817"
}
```

```json
{
  "session_id": "408dcc34-3e8f-4745-99b9-98f0472ae2d5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYwMSwiaWF0IjoxNzkzMjg4NzAxLCJqdGkiOiIxODM1N2UxMC0xODVhLTRlNjktYWE4Zi00YTBjZjNkNDA1ZGEiLCJzaWQiOiI0MDhkY2MzNC0zZThmLTQ3NDUtOTliOS05OGYwNDcyYWUyZDUifQ.7LqQU1Hoc9Uz_w4XIu1SXZVWNNzj4EpPDHzUj5axlRs",
  "access_expires_at": "2026-10-29T16:00:01.033024504Z",
  "refresh_token": "qkcI9wM70mhEEoy_3s5Z39bBQDVTdqom2QN_-H52lk0",
  "refresh_expires_at": "2026-11-28T15:45:01.032261438Z",
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
  "command_id": "2d459f4d-f3b0-4cfc-8e97-4edadc29d2ce",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:01Z",
    "sequence": 1793288701594
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a5ecf50-a393-4245-a597-e37bbdb100f8",
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
  "last_heartbeat_at": "2026-10-29T15:45:01.615564Z",
  "last_location_at": "2026-10-29T15:45:01.615564Z",
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
  "session_id": "2b60ef27-54e0-4d85-91ca-7fa75e7c5893",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MDIsImlhdCI6MTc5MzI4ODcwMiwianRpIjoiYzdkMjU5MmQtNGU2ZC00M2MzLTg3YzUtOGZiMDkyMDU4YWU1Iiwic2lkIjoiMmI2MGVmMjctNTRlMC00ZDg1LTkxY2EtN2ZhNzVlN2M1ODkzIn0.xNo1hS6DIb_lXcaFbEpOGrL0iJ9kCr8ToPiLsE4yzuU",
  "access_expires_at": "2026-10-29T16:00:02.193934288Z",
  "refresh_token": "I00F300cFMN6RuIxrVm9W_hIT95Fud-P1Vay0M8Py2A",
  "refresh_expires_at": "2026-10-30T03:45:02.193352286Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "e816832e-f3c5-4bb4-ae03-0e3808a347cc",
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
  "id": "1f608b28-0708-4eac-8845-64eb80d14326",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:02.494406Z",
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
  "command_id": "4b12a454-353b-4c49-b06d-c35bcd459936",
  "quote_id": "1f608b28-0708-4eac-8845-64eb80d14326",
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
    "phone": "+380673393406"
  }
}
```

```json
{
  "id": "cf118c48-0500-4161-9445-851fc7a82dff",
  "short_number": 3,
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
  "created_at": "2026-10-29T15:45:02.8092Z",
  "caller": {
    "name": "Олена",
    "phone": "+380673393406"
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
    "id": "5df170f2-bd24-44c8-98f2-ec4f55761f7a",
    "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
    "expires_at": "2026-10-29T15:45:17.814216Z",
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

`POST /api/driver/v1/offers/5df170f2-bd24-44c8-98f2-ec4f55761f7a/accept` → **200**

```json
{
  "command_id": "b6fc658c-2f69-463d-8ee7-bbb7c9b63b0f"
}
```

```json
{
  "id": "55eed540-12ff-4501-821c-5f239ee12caa",
  "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "082f3899-2dcb-4637-b025-6cca47012778",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "082f3899-2dcb-4637-b025-6cca47012778",
  "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
  "assignment_id": "55eed540-12ff-4501-821c-5f239ee12caa",
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
    "phone": "+380673393406"
  }
}
```

`POST /api/driver/v1/work-sessions/6a5ecf50-a393-4245-a597-e37bbdb100f8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:06Z",
    "sequence": 1793288706130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6a5ecf50-a393-4245-a597-e37bbdb100f8",
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
  "last_heartbeat_at": "2026-10-29T15:45:06.149898Z",
  "last_location_at": "2026-10-29T15:45:06.149898Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/082f3899-2dcb-4637-b025-6cca47012778/arrive` → **200**

```json
{
  "command_id": "965561fd-2a32-44eb-9405-a45a30691060",
  "expected_version": 0
}
```

```json
{
  "id": "082f3899-2dcb-4637-b025-6cca47012778",
  "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
  "assignment_id": "55eed540-12ff-4501-821c-5f239ee12caa",
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
  "arrived_at": "2026-10-29T15:45:06.442492Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673393406"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  },
  {
    "phone": "+380673393406",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:07.970368503Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  },
  {
    "phone": "+380673393406",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:07.970368503Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380673393406` → **200**

```json
[
  {
    "phone": "+380673393406",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:04.959899435Z"
  },
  {
    "phone": "+380673393406",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:45:07.970368503Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/082f3899-2dcb-4637-b025-6cca47012778/start` → **200**

```json
{
  "command_id": "8d7868fd-a6f1-4f10-b1b3-36efb4e8eff7",
  "expected_version": 1
}
```

```json
{
  "id": "082f3899-2dcb-4637-b025-6cca47012778",
  "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
  "assignment_id": "55eed540-12ff-4501-821c-5f239ee12caa",
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
  "arrived_at": "2026-10-29T15:45:06.442492Z",
  "started_at": "2026-10-29T15:45:08.867804Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380673393406"
  }
}
```

`POST /api/driver/v1/trips/082f3899-2dcb-4637-b025-6cca47012778/complete` → **200**

```json
{
  "command_id": "8a0dd7ac-9c0a-48b5-9bee-22a92cb5242d",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:09Z",
  "cash_received": true
}
```

```json
{
  "id": "082f3899-2dcb-4637-b025-6cca47012778",
  "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
  "assignment_id": "55eed540-12ff-4501-821c-5f239ee12caa",
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
  "arrived_at": "2026-10-29T15:45:06.442492Z",
  "started_at": "2026-10-29T15:45:08.867804Z",
  "completed_at": "2026-10-29T15:45:09.170307Z",
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
  "session_id": "6a5ecf50-a393-4245-a597-e37bbdb100f8",
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
  "last_heartbeat_at": "2026-10-29T15:45:06.149898Z",
  "last_location_at": "2026-10-29T15:45:06.149898Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6a5ecf50-a393-4245-a597-e37bbdb100f8/close` → **200**

```json
{
  "command_id": "1e7cad11-e63e-42bc-b7ef-d710f33711fd",
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
  "phone": "+380637739583",
  "device_ref": "sandbox-7200"
}
```

```json
{
  "challenge_id": "7dffccff-980b-435b-8e16-b866472d4de3",
  "expires_at": "2026-10-29T15:50:10.050541371Z",
  "resend_available_at": "2026-10-29T15:45:11.050541371Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637739583` → **200**

```json
{
  "phone": "+380637739583",
  "audience": "CLIENT",
  "code": "813748",
  "sent_at": "2026-10-29T15:45:10.054522606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7dffccff-980b-435b-8e16-b866472d4de3",
  "code": "813748",
  "device_ref": "sandbox-7200"
}
```

```json
{
  "session_id": "d732b5c5-bc10-4164-b257-a6ffda384a72",
  "subject": {
    "type": "CLIENT",
    "id": "0c1b6744-f146-4d30-9647-e79aa2786d2a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYzFiNjc0NC1mMTQ2LTRkMzAtOTY0Ny1lNzlhYTI3ODZkMmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjEwLCJpYXQiOjE3OTMyODg3MTAsImp0aSI6IjA0MmYxMWU4LWM0NjItNGQ1Zi1iMzZjLTIyNzdlNTkwNmJhMiIsInNpZCI6ImQ3MzJiNWM1LWJjMTAtNDE2NC1iMjU3LWE2ZmZkYTM4NGE3MiJ9.UINSZ_GlT0JfVhxnZq0MKPtzwg1rKvkq7uudvDYLJWw",
  "access_expires_at": "2026-10-29T16:00:10.377762319Z",
  "refresh_token": "AyoVatyeG54fkHlFLfZWTNVoMN3b_x4jmi9S9Fa2Ceg",
  "refresh_expires_at": "2026-11-28T15:45:10.377045734Z",
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
  "device_ref": "sandbox-10643"
}
```

```json
{
  "challenge_id": "fb923bae-9eeb-4861-8b2b-b5cbe77dd084",
  "expires_at": "2026-10-29T15:50:10.951680441Z",
  "resend_available_at": "2026-10-29T15:45:11.951680441Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "419025",
  "sent_at": "2026-10-29T15:45:10.95529505Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fb923bae-9eeb-4861-8b2b-b5cbe77dd084",
  "code": "419025",
  "device_ref": "sandbox-10643"
}
```

```json
{
  "session_id": "8161c818-f07d-4c32-b661-7928119c452f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYxMSwiaWF0IjoxNzkzMjg4NzExLCJqdGkiOiI0ZjMyODgyNC0wZTU5LTQzZDAtYWEyYS00ZWJjMDE1ZTRmOTYiLCJzaWQiOiI4MTYxYzgxOC1mMDdkLTRjMzItYjY2MS03OTI4MTE5YzQ1MmYifQ.YoMj963e2zZSDM3hTorNBeUahmV1P-rd9rMLlv-k1FU",
  "access_expires_at": "2026-10-29T16:00:11.255140952Z",
  "refresh_token": "xUv3q5I4Rp_ihk5JusbLRv2BLiNath9h8wwtDyat7eE",
  "refresh_expires_at": "2026-11-28T15:45:11.25455393Z",
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
  "session_id": "1be23cc9-20be-4672-84fa-0a2999395846",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MTIsImlhdCI6MTc5MzI4ODcxMiwianRpIjoiNjU3MTE3ODctNmRjMS00NmU4LWFiNWItOTY1MDMwOTI2Nzc0Iiwic2lkIjoiMWJlMjNjYzktMjBiZS00NjcyLTg0ZmEtMGEyOTk5Mzk1ODQ2In0.W-Xu47OtzGjzM7uEogJit97pcaqHjB45mOeeIux_cLA",
  "access_expires_at": "2026-10-29T16:00:12.100413018Z",
  "refresh_token": "BGVOj09HSctJmiDQsjy82Hc7C8KcHTu3ocxjzIrtNrA",
  "refresh_expires_at": "2026-10-30T03:45:12.099833359Z",
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
  "session_id": "1b60d1f0-24bf-457f-b931-2512f7ea11d4",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MTIsImlhdCI6MTc5MzI4ODcxMiwianRpIjoiMTY0MDcyMzktODNlMC00MDQ3LTg4M2ItN2UxZmQ0OTg0ZDU5Iiwic2lkIjoiMWI2MGQxZjAtMjRiZi00NTdmLWI5MzEtMjUxMmY3ZWExMWQ0In0.pDA29M6c4lZclOFC2u2blQGrVqJUAY4Q6t5EboJsF9c",
  "access_expires_at": "2026-10-29T16:00:12.67365572Z",
  "refresh_token": "m9EKC4cL_LPyKDZIugarPLqReQmId5HPEUHgyqveKqs",
  "refresh_expires_at": "2026-10-30T03:45:12.673068197Z",
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
  "command_id": "3a492226-23d0-4813-9d33-233a46f979e3",
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
  "id": "f283b1a2-9ba5-4de4-bdbd-9a1f75d8a85c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:13.247410Z",
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
  "command_id": "6e4bf245-365b-497e-8237-e3d73284dd25",
  "quote_id": "f283b1a2-9ba5-4de4-bdbd-9a1f75d8a85c",
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
  "id": "bd6515f2-28ab-4914-b7ea-752046d4cb2b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c1b6744-f146-4d30-9647-e79aa2786d2a",
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
  "created_at": "2026-10-29T15:45:13.549873Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/bd6515f2-28ab-4914-b7ea-752046d4cb2b` → **200**

```json
{
  "id": "bd6515f2-28ab-4914-b7ea-752046d4cb2b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c1b6744-f146-4d30-9647-e79aa2786d2a",
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
  "created_at": "2026-10-29T15:45:13.549873Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bd6515f2-28ab-4914-b7ea-752046d4cb2b/cancel` → **200**

```json
{
  "command_id": "f6128ccf-4ff4-4765-b1c8-f8082b758df3",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "bd6515f2-28ab-4914-b7ea-752046d4cb2b",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0c1b6744-f146-4d30-9647-e79aa2786d2a",
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
  "created_at": "2026-10-29T15:45:13.549873Z",
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
  "command_id": "68879ec2-3a1a-4047-a465-025aef871c9c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:14Z",
    "sequence": 1793288714748
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9",
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
  "last_heartbeat_at": "2026-10-29T15:45:14.768966Z",
  "last_location_at": "2026-10-29T15:45:14.768966Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-19363"
}
```

```json
{
  "challenge_id": "bdffc3a4-1311-4698-b35f-f640588d7306",
  "expires_at": "2026-10-29T15:50:15.055738674Z",
  "resend_available_at": "2026-10-29T15:45:16.055738674Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "658752",
  "sent_at": "2026-10-29T15:45:15.059357437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bdffc3a4-1311-4698-b35f-f640588d7306",
  "code": "658752",
  "device_ref": "sandbox-19363"
}
```

```json
{
  "session_id": "2c54c864-4777-43fa-ba62-482261d9b4d1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYxNSwiaWF0IjoxNzkzMjg4NzE1LCJqdGkiOiI2Mjg2MjQwYy0xZDQ1LTRkNzAtOTM2OS0zNzk5YTc4NDMyOWUiLCJzaWQiOiIyYzU0Yzg2NC00Nzc3LTQzZmEtYmE2Mi00ODIyNjFkOWI0ZDEifQ.-3TR9H47bnQC70DqFyzZN-d9tduoJCTsMkwsZcjbFbU",
  "access_expires_at": "2026-10-29T16:00:15.361298169Z",
  "refresh_token": "0xcEm0JYR2StAM1RK7yqe-ocv-6oNlxfjfF95f0T6m0",
  "refresh_expires_at": "2026-11-28T15:45:15.360660381Z",
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
  "command_id": "607928b8-4572-42f0-a9d3-43d8776da59c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:15Z",
    "sequence": 1793288715922
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:15.946283Z",
  "last_location_at": "2026-10-29T15:45:15.946283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "542d5e1d-8851-4666-be63-8f84cf829dd3",
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
  "id": "13846151-dd38-42cd-be04-912aceb1da4c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:16.259561Z",
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
  "command_id": "2ac2a9dc-f8f9-4f08-a811-ce8a87c4b8a9",
  "quote_id": "13846151-dd38-42cd-be04-912aceb1da4c",
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
  "id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0c1b6744-f146-4d30-9647-e79aa2786d2a",
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
  "created_at": "2026-10-29T15:45:16.567374Z",
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
    "id": "ff7666ec-84a6-4579-902d-18ba438bcc44",
    "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
    "expires_at": "2026-10-29T15:45:31.571412Z",
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

`POST /api/driver/v1/offers/ff7666ec-84a6-4579-902d-18ba438bcc44/accept` → **200**

```json
{
  "command_id": "21e7d1ef-46a6-4ac0-8ed6-9df4a7761a6d"
}
```

```json
{
  "id": "ff39925a-aae1-41d5-9c60-d4f4fffe9305",
  "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "64d6a45e-e81b-45fb-976a-839283aacd55",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "64d6a45e-e81b-45fb-976a-839283aacd55",
  "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "assignment_id": "ff39925a-aae1-41d5-9c60-d4f4fffe9305",
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

`POST /api/driver/v1/trips/64d6a45e-e81b-45fb-976a-839283aacd55/cancel` → **200**

```json
{
  "command_id": "5649a943-70ff-4941-b115-dbce08b112e3",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "64d6a45e-e81b-45fb-976a-839283aacd55",
  "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "assignment_id": "ff39925a-aae1-41d5-9c60-d4f4fffe9305",
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

`GET /api/rider/v1/orders/d7120b9d-79fd-4540-bdf4-5b67c1eea1cf` → **200**

```json
{
  "id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0c1b6744-f146-4d30-9647-e79aa2786d2a",
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
    "id": "ff39925a-aae1-41d5-9c60-d4f4fffe9305",
    "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "64d6a45e-e81b-45fb-976a-839283aacd55",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:45:16.567374Z",
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
    "id": "99a9cc1d-3686-43a7-8ead-d230d31fcd95",
    "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
    "expires_at": "2026-10-29T15:45:32.768881Z",
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

`POST /api/driver/v1/offers/99a9cc1d-3686-43a7-8ead-d230d31fcd95/accept` → **200**

```json
{
  "command_id": "c9d90a8a-ea57-45e9-95b6-1a5406a6f25f"
}
```

```json
{
  "id": "cda8cc04-0784-42c1-90a8-f808dffa9f4d",
  "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85b43e20-4d6f-468b-8ad0-ef05c66569fb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85b43e20-4d6f-468b-8ad0-ef05c66569fb",
  "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "assignment_id": "cda8cc04-0784-42c1-90a8-f808dffa9f4d",
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

`POST /api/driver/v1/trips/85b43e20-4d6f-468b-8ad0-ef05c66569fb/cancel` → **200**

```json
{
  "command_id": "645af864-463d-434f-81e3-be0f94723e54",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "85b43e20-4d6f-468b-8ad0-ef05c66569fb",
  "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
  "assignment_id": "cda8cc04-0784-42c1-90a8-f808dffa9f4d",
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
    "id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:45:16.567374Z",
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
    "id": "bd6515f2-28ab-4914-b7ea-752046d4cb2b",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:45:13.549873Z",
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

`GET /api/operator/v1/orders/d7120b9d-79fd-4540-bdf4-5b67c1eea1cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:45:16.568017Z",
      "actor": {
        "type": "CLIENT",
        "id": "0c1b6744-f146-4d30-9647-e79aa2786d2a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
        "quote_id": "13846151-dd38-42cd-be04-912aceb1da4c",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "332d456a-fa5c-4497-ba16-c2fe6d0d55ad"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:45:16.570448Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
        "attempt_id": "27407e7a-3337-4f28-9588-2a0267a0f87b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "332d456a-fa5c-4497-ba16-c2fe6d0d55ad"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:45:16.577763Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "ff7666ec-84a6-4579-902d-18ba438bcc44",
        "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "332d456a-fa5c-4497-ba16-c2fe6d0d55ad"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:45:17.180726Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "ff7666ec-84a6-4579-902d-18ba438bcc44",
        "order_id": "d7120b9d-79fd-4540-bdf4-5b67c1eea1cf",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "ff39925a-aae1-41d5-9c60-d4f4fffe9305"
      },
      "correlation_id": "bcc15aa4-465a-4b3c-a04c-d8189e2b2013"
```

Done: orders bd6515f2-28ab-4914-b7ea-752046d4cb2b, d7120b9d-79fd-4540-bdf4-5b67c1eea1cf.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737604548",
  "device_ref": "sandbox-13063"
}
```

```json
{
  "challenge_id": "4b3189af-76aa-4f4c-9eac-0b41982d10ed",
  "expires_at": "2026-10-29T15:50:20.187526318Z",
  "resend_available_at": "2026-10-29T15:45:21.187526318Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737604548` → **200**

```json
{
  "phone": "+380737604548",
  "audience": "CLIENT",
  "code": "333424",
  "sent_at": "2026-10-29T15:45:20.191092432Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4b3189af-76aa-4f4c-9eac-0b41982d10ed",
  "code": "333424",
  "device_ref": "sandbox-13063"
}
```

```json
{
  "session_id": "f1d5acc2-2d8e-4b8b-966d-980ad45351c7",
  "subject": {
    "type": "CLIENT",
    "id": "103918c5-2e25-46d5-9e6d-444f968efd1b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDM5MThjNS0yZTI1LTQ2ZDUtOWU2ZC00NDRmOTY4ZWZkMWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjIwLCJpYXQiOjE3OTMyODg3MjAsImp0aSI6IjM2M2Q5NTIzLWIxY2UtNGEzMy05NGI2LTc3ODM1NTQyZmFmOCIsInNpZCI6ImYxZDVhY2MyLTJkOGUtNGI4Yi05NjZkLTk4MGFkNDUzNTFjNyJ9.jO0awo28AgQnpw3Z5_VzsO7sr_xelPKRc1tS8nqaYnw",
  "access_expires_at": "2026-10-29T16:00:20.564383523Z",
  "refresh_token": "7ycnJU_6Pdaj4eDftVzMKb3dgGQ2r2f_34IJ6iwsVuY",
  "refresh_expires_at": "2026-11-28T15:45:20.563758259Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "ab0573cf-c242-48d7-b2ca-cc493e7862fe",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8281a6da-60ed-43ec-9f76-6839ee10ab4f",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8281a6da-60ed-43ec-9f76-6839ee10ab4f",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8399d4c2f94d6ddf589380cbd52b99d6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8281a6da-60ed-43ec-9f76-6839ee10ab4f",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737604548"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8281a6da-60ed-43ec-9f76-6839ee10ab4f",
  "expires_at": "2026-10-29T16:15:20.865936Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/8281a6da-60ed-43ec-9f76-6839ee10ab4f` → **200**

```json
{
  "id": "8281a6da-60ed-43ec-9f76-6839ee10ab4f",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:15:20.865936Z",
  "card": {
    "id": "67561ddd-59ef-439c-a5ce-557be8db0106",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2324",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:45:21.205615Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "67561ddd-59ef-439c-a5ce-557be8db0106",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2324",
      "card_type": "Visa",
      "created_at": "2026-10-29T15:45:21.205615Z"
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
  "device_ref": "sandbox-15556"
}
```

```json
{
  "challenge_id": "24f96ca0-4e3e-4c40-9a7f-db608387ae80",
  "expires_at": "2026-10-29T15:50:21.79432062Z",
  "resend_available_at": "2026-10-29T15:45:22.79432062Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "666363",
  "sent_at": "2026-10-29T15:45:21.797693645Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24f96ca0-4e3e-4c40-9a7f-db608387ae80",
  "code": "666363",
  "device_ref": "sandbox-15556"
}
```

```json
{
  "session_id": "38630e9f-c432-4eeb-95a6-8d833537e56f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTYyMiwiaWF0IjoxNzkzMjg4NzIyLCJqdGkiOiIwMjA5ODJmYy01YjQ2LTQ3NTktOWZjZC0wNDc5ZTVkZDhkYTYiLCJzaWQiOiIzODYzMGU5Zi1jNDMyLTRlZWItOTVhNi04ZDgzMzUzN2U1NmYifQ.aMKpdy3yC6-hmTAWLSqLqvQbPaNAHVHw0u5qxak9dB4",
  "access_expires_at": "2026-10-29T16:00:22.103077273Z",
  "refresh_token": "DZH4_pQNjBTQtarCQ_S6zXCw9qVcSvmrDfgMnZpFdHU",
  "refresh_expires_at": "2026-11-28T15:45:22.102411099Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:15.946283Z",
  "last_location_at": "2026-10-29T15:45:15.946283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/132d2cb3-a240-44f3-beaf-26fa5281f201/handover` → **200**

```json
{
  "command_id": "c9578c9a-e956-47a1-a6a4-118f5d3d41d6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:15.946283Z",
  "last_location_at": "2026-10-29T15:45:15.946283Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/132d2cb3-a240-44f3-beaf-26fa5281f201/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:22Z",
    "sequence": 1793288722940
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:22.959706Z",
  "last_location_at": "2026-10-29T15:45:22.959706Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7eb983bd-f6b5-45d2-9d3d-d8f8f65ac824",
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
  "id": "429bc900-8c8e-428d-b001-fce0fc785029",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:23.266984Z",
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
  "command_id": "fa8971b9-c961-46e1-9d6b-9288a77b4d3a",
  "quote_id": "429bc900-8c8e-428d-b001-fce0fc785029",
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
  "id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
  "created_at": "2026-10-29T15:45:23.573886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05` → **200**

```json
{
  "id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
  "created_at": "2026-10-29T15:45:23.573886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05` → **200**

```json
{
  "id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
  "created_at": "2026-10-29T15:45:23.573886Z",
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
    "id": "1810903a-b5ec-46dc-8283-152e8119ba8e",
    "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
    "expires_at": "2026-10-29T15:45:39.335837Z",
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

`POST /api/driver/v1/offers/1810903a-b5ec-46dc-8283-152e8119ba8e/accept` → **200**

```json
{
  "command_id": "fb12ba0c-f308-4f21-8174-b11c8c177dd9"
}
```

```json
{
  "id": "7899fb17-87d5-41e1-a83f-e8875da18851",
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "assignment_id": "7899fb17-87d5-41e1-a83f-e8875da18851",
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

`POST /api/driver/v1/work-sessions/132d2cb3-a240-44f3-beaf-26fa5281f201/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:26Z",
    "sequence": 1793288726338
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:26.358338Z",
  "last_location_at": "2026-10-29T15:45:26.358338Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b1a980bf-a942-402f-a7c3-2f45465c91c4/arrive` → **200**

```json
{
  "command_id": "fcf7754a-6a6c-414b-a792-7f38b0ca051c",
  "expected_version": 0
}
```

```json
{
  "id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "assignment_id": "7899fb17-87d5-41e1-a83f-e8875da18851",
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
  "arrived_at": "2026-10-29T15:45:26.651254Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b1a980bf-a942-402f-a7c3-2f45465c91c4/start` → **200**

```json
{
  "command_id": "24dab8f8-7119-4f39-a13c-47ee748e68c2",
  "expected_version": 1
}
```

```json
{
  "id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "assignment_id": "7899fb17-87d5-41e1-a83f-e8875da18851",
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
  "arrived_at": "2026-10-29T15:45:26.651254Z",
  "started_at": "2026-10-29T15:45:26.96481Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b1a980bf-a942-402f-a7c3-2f45465c91c4/complete` → **200**

```json
{
  "command_id": "5d169316-2179-417c-a079-4d1bc4987e44",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:27Z",
  "cash_received": true
}
```

```json
{
  "id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "assignment_id": "7899fb17-87d5-41e1-a83f-e8875da18851",
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
  "arrived_at": "2026-10-29T15:45:26.651254Z",
  "started_at": "2026-10-29T15:45:26.96481Z",
  "completed_at": "2026-10-29T15:45:27.270064Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05` → **200**

```json
{
  "id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
    "id": "7899fb17-87d5-41e1-a83f-e8875da18851",
    "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:23.573886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05` → **200**

```json
{
  "id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
    "id": "7899fb17-87d5-41e1-a83f-e8875da18851",
    "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:23.573886Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05` → **200**

```json
{
  "id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
    "id": "7899fb17-87d5-41e1-a83f-e8875da18851",
    "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "b1a980bf-a942-402f-a7c3-2f45465c91c4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:23.573886Z",
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

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05/tip` → **200**

```json
{
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
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
  "available_until": "2026-10-30T15:45:27.270064Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05/tip` → **201**

```json
{
  "command_id": "6517b738-0d5b-4175-a878-22051c430cdc",
  "amount_minor": 2500
}
```

```json
{
  "id": "232e3e2a-a05f-4ff6-80c3-22a0c88bafe2",
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:45:31.062645Z"
}
```

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05/tip` → **200**

```json
{
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
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
  "available_until": "2026-10-30T15:45:27.270064Z",
  "open": false,
  "tip": {
    "id": "232e3e2a-a05f-4ff6-80c3-22a0c88bafe2",
    "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:31.062645Z"
  }
}
```

`GET /api/rider/v1/orders/9e94b7ab-5650-4bb3-8a06-b3730e0fbb05/tip` → **200**

```json
{
  "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
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
  "available_until": "2026-10-30T15:45:27.270064Z",
  "open": false,
  "tip": {
    "id": "232e3e2a-a05f-4ff6-80c3-22a0c88bafe2",
    "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:31.062645Z"
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
      "id": "602ed7fc-ee3c-44d1-ba51-6b245ea0a1f1",
      "at": "2026-10-29T15:45:32.505146Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
      "counterpart_id": null
    },
    {
      "id": "e29c93bb-e382-4045-a11b-cebadea0eb7b",
      "at": "2026-10-29T15:45:27.427715Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e0f1f0a-d557-4b6c-ab68-0745e3f30ca0",
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
  "id": "1b6c9833-d0fe-4359-b149-5cb855ac6cd0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:33.264221Z",
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
  "session_id": "d3be1b6d-e8ef-4c39-8687-ca06383e3a4b",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2MzMsImlhdCI6MTc5MzI4ODczMywianRpIjoiODAxYzRiMTUtZTUwNC00YTQ5LWIyNTQtOTM0OGMxYjUxNTJkIiwic2lkIjoiZDNiZTFiNmQtZThlZi00YzM5LTg2ODctY2EwNjM4M2UzYTRiIn0.RkOTuLK6KofCren8aVm_UYjKnxkru4YZT-aVBbqcbAI",
  "access_expires_at": "2026-10-29T16:00:33.847701422Z",
  "refresh_token": "lry07xzdZjHqz9sKJExDzU5U0tM8MfihlJlnE93Wjpk",
  "refresh_expires_at": "2026-10-30T03:45:33.847101743Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737604548` → **200**

```json
{
  "client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b"
}
```

`POST /api/admin/v1/rider-wallets/103918c5-2e25-46d5-9e6d-444f968efd1b/top-ups` → **201**

```json
{
  "command_id": "240881e8-fa80-496e-924c-76b4f77fbe5a",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
      "id": "d5f3f7c7-bfa9-44ed-b34c-b63f287a60b1",
      "at": "2026-10-29T15:45:34.395772Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "894e8be9-f71d-4f45-9224-377e91a993e9",
  "quote_id": "1b6c9833-d0fe-4359-b149-5cb855ac6cd0",
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
  "id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
  "created_at": "2026-10-29T15:45:34.695664Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cfaa9d3c-84b3-4f6d-8c36-169de6b15035` → **200**

```json
{
  "id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
  "created_at": "2026-10-29T15:45:34.695664Z",
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
    "id": "e8d3a855-a255-487e-937a-cad1eeafd8a0",
    "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
    "expires_at": "2026-10-29T15:45:49.700951Z",
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

`POST /api/driver/v1/offers/e8d3a855-a255-487e-937a-cad1eeafd8a0/accept` → **200**

```json
{
  "command_id": "2fce0fde-252a-436a-93c1-26b7ec0f1c22"
}
```

```json
{
  "id": "15bc947b-c735-4722-b113-3d070c99654e",
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9c35f54f-d518-471a-83e0-b0570f8bca48",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9c35f54f-d518-471a-83e0-b0570f8bca48",
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "assignment_id": "15bc947b-c735-4722-b113-3d070c99654e",
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

`POST /api/driver/v1/work-sessions/132d2cb3-a240-44f3-beaf-26fa5281f201/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:36Z",
    "sequence": 1793288736150
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:36.170173Z",
  "last_location_at": "2026-10-29T15:45:36.170173Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9c35f54f-d518-471a-83e0-b0570f8bca48/arrive` → **200**

```json
{
  "command_id": "bc4e3519-a7d2-4938-82f6-a665f3e2982c",
  "expected_version": 0
}
```

```json
{
  "id": "9c35f54f-d518-471a-83e0-b0570f8bca48",
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "assignment_id": "15bc947b-c735-4722-b113-3d070c99654e",
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
  "arrived_at": "2026-10-29T15:45:36.476654Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c35f54f-d518-471a-83e0-b0570f8bca48/start` → **200**

```json
{
  "command_id": "3a6b6fbb-c941-48e6-8911-d29091e2564e",
  "expected_version": 1
}
```

```json
{
  "id": "9c35f54f-d518-471a-83e0-b0570f8bca48",
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "assignment_id": "15bc947b-c735-4722-b113-3d070c99654e",
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
  "arrived_at": "2026-10-29T15:45:36.476654Z",
  "started_at": "2026-10-29T15:45:36.781488Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9c35f54f-d518-471a-83e0-b0570f8bca48/complete` → **200**

```json
{
  "command_id": "6cfb1fef-f231-4227-a041-797d804bc402",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:37Z",
  "cash_received": true
}
```

```json
{
  "id": "9c35f54f-d518-471a-83e0-b0570f8bca48",
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "assignment_id": "15bc947b-c735-4722-b113-3d070c99654e",
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
  "arrived_at": "2026-10-29T15:45:36.476654Z",
  "started_at": "2026-10-29T15:45:36.781488Z",
  "completed_at": "2026-10-29T15:45:37.08537Z",
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
  "client_id": "103918c5-2e25-46d5-9e6d-444f968efd1b",
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
      "id": "d5f3f7c7-bfa9-44ed-b34c-b63f287a60b1",
      "at": "2026-10-29T15:45:34.395772Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "0392d253-d6a8-4a88-ba36-785edcc894c8",
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

`GET /api/rider/v1/orders/cfaa9d3c-84b3-4f6d-8c36-169de6b15035/tip` → **200**

```json
{
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
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
  "available_until": "2026-10-30T15:45:37.08537Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/cfaa9d3c-84b3-4f6d-8c36-169de6b15035/tip` → **201**

```json
{
  "command_id": "b693f118-de7a-46da-b5fa-eb129f53fc53",
  "amount_minor": 2500
}
```

```json
{
  "id": "89e338db-cd83-45f1-a730-93c59b7f2fb2",
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:45:38.246647Z"
}
```

`GET /api/rider/v1/orders/cfaa9d3c-84b3-4f6d-8c36-169de6b15035/tip` → **200**

```json
{
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
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
  "available_until": "2026-10-30T15:45:37.08537Z",
  "open": false,
  "tip": {
    "id": "89e338db-cd83-45f1-a730-93c59b7f2fb2",
    "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:38.246647Z"
  }
}
```

`GET /api/rider/v1/orders/cfaa9d3c-84b3-4f6d-8c36-169de6b15035/tip` → **200**

```json
{
  "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
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
  "available_until": "2026-10-30T15:45:37.08537Z",
  "open": false,
  "tip": {
    "id": "89e338db-cd83-45f1-a730-93c59b7f2fb2",
    "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:45:38.246647Z"
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
      "id": "7a52e8b4-46a9-41d6-8861-46a6cebcf71f",
      "at": "2026-10-29T15:45:39.582118Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
      "counterpart_id": null
    },
    {
      "id": "6faa5fa1-87d3-4f12-9a61-e0dd89ef56a6",
      "at": "2026-10-29T15:45:37.549281Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "cfaa9d3c-84b3-4f6d-8c36-169de6b15035",
      "counterpart_id": null
    },
    {
      "id": "602ed7fc-ee3c-44d1-ba51-6b245ea0a1f1",
      "at": "2026-10-29T15:45:32.505146Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
      "counterpart_id": null
    },
    {
      "id": "e29c93bb-e382-4045-a11b-cebadea0eb7b",
      "at": "2026-10-29T15:45:27.427715Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "9e94b7ab-5650-4bb3-8a06-b3730e0fbb05",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "132d2cb3-a240-44f3-beaf-26fa5281f201",
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
  "last_heartbeat_at": "2026-10-29T15:45:36.170173Z",
  "last_location_at": "2026-10-29T15:45:36.170173Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/132d2cb3-a240-44f3-beaf-26fa5281f201/close` → **200**

```json
{
  "command_id": "dc64c79c-0550-418a-9060-c4adf99dc184",
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

Done: card order cfaa9d3c-84b3-4f6d-8c36-169de6b15035.

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
  "phone": "+380737358051",
  "device_ref": "sandbox-7010"
}
```

```json
{
  "challenge_id": "4c82f560-e14f-44ed-a358-ee51529a5a8d",
  "expires_at": "2026-10-29T15:50:41.250696553Z",
  "resend_available_at": "2026-10-29T15:45:42.250696553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737358051` → **200**

```json
{
  "phone": "+380737358051",
  "audience": "CLIENT",
  "code": "567325",
  "sent_at": "2026-10-29T15:45:41.253873803Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c82f560-e14f-44ed-a358-ee51529a5a8d",
  "code": "567325",
  "device_ref": "sandbox-7010"
}
```

```json
{
  "session_id": "9f70edf0-f47f-4f37-b232-276f9980e0bb",
  "subject": {
    "type": "CLIENT",
    "id": "be2a9b06-8e1b-45c0-aade-8b774dd44fa8"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZTJhOWIwNi04ZTFiLTQ1YzAtYWFkZS04Yjc3NGRkNDRmYTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjQxLCJpYXQiOjE3OTMyODg3NDEsImp0aSI6IjJhMmZlYTQxLTQzYjItNGJlZi1hMmYxLTc1ZTc4MmYwZTU4MiIsInNpZCI6IjlmNzBlZGYwLWY0N2YtNGYzNy1iMjMyLTI3NmY5OTgwZTBiYiJ9.MBuz4aWIRnESK7AfyTtJEiY5SPjfq551EcVb54eR9Ek",
  "access_expires_at": "2026-10-29T16:00:41.578548493Z",
  "refresh_token": "CYkdvPPJPJncIKOX1QOhDh9kb5e13K3qW5vA1c0OEbg",
  "refresh_expires_at": "2026-11-28T15:45:41.577899361Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e114d433-2b19-4b80-bd8d-9bba92b9d4e6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "fae6d1d6-c346-4fee-a913-6b9533068041",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-fae6d1d6-c346-4fee-a913-6b9533068041",
    "orderDate": "1793288741",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "2537ca3dd6f655a4a52057d5351b7776",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=fae6d1d6-c346-4fee-a913-6b9533068041",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737358051"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=fae6d1d6-c346-4fee-a913-6b9533068041",
  "created_at": "2026-10-29T15:45:41.873302Z",
  "expires_at": "2026-10-29T16:15:41.873302Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/fae6d1d6-c346-4fee-a913-6b9533068041` → **200**

```json
{
  "id": "fae6d1d6-c346-4fee-a913-6b9533068041",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:45:41.873302Z",
  "expires_at": "2026-10-29T16:15:41.873302Z",
  "completed_at": "2026-10-29T15:45:42.164812Z",
  "masked_pan": "41****2097",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "be2a9b06-8e1b-45c0-aade-8b774dd44fa8",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "be2a9b06-8e1b-45c0-aade-8b774dd44fa8",
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
      "id": "bbe5d96c-d964-4b74-b957-3b6db2a27e26",
      "at": "2026-10-29T15:45:42.601868Z",
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
  "client_id": "be2a9b06-8e1b-45c0-aade-8b774dd44fa8",
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
      "id": "bbe5d96c-d964-4b74-b957-3b6db2a27e26",
      "at": "2026-10-29T15:45:42.601868Z",
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
  "device_ref": "sandbox-1970"
}
```

```json
{
  "challenge_id": "e9cf697e-52d6-4df6-a863-0e9a294632a3",
  "expires_at": "2026-10-29T15:50:44.319876435Z",
  "resend_available_at": "2026-10-29T15:45:45.319876435Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "230551",
  "sent_at": "2026-10-29T15:45:44.322596217Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9cf697e-52d6-4df6-a863-0e9a294632a3",
  "code": "230551",
  "device_ref": "sandbox-1970"
}
```

```json
{
  "session_id": "5c685985-8c53-43f9-83db-37003aa40ae7",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTY0NCwiaWF0IjoxNzkzMjg4NzQ0LCJqdGkiOiIyYjliOTkwNy01NWU1LTQ3NmEtYjJkZS0xZjg5MWJhODVmNmMiLCJzaWQiOiI1YzY4NTk4NS04YzUzLTQzZjktODNkYi0zNzAwM2FhNDBhZTcifQ.6hvKaGuqsogeWEucOTSRWtlWC_x21xKw25-e-g5j1Tc",
  "access_expires_at": "2026-10-29T16:00:44.636521031Z",
  "refresh_token": "squtH5xpN5ELWDvJkG9E4reJoagV5Zv7PavdaGMOdHw",
  "refresh_expires_at": "2026-11-28T15:45:44.635963986Z",
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
  "command_id": "861c9837-6382-438f-8918-3f45c8f86e4f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "1095a76b-1f17-4c46-be58-7d5e6ef26454",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-1095a76b-1f17-4c46-be58-7d5e6ef26454",
    "orderDate": "1793288745",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "fcbf63c369d9e6223e0849ad426164e5",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=1095a76b-1f17-4c46-be58-7d5e6ef26454",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=1095a76b-1f17-4c46-be58-7d5e6ef26454",
  "created_at": "2026-10-29T15:45:45.205088Z",
  "expires_at": "2026-10-29T16:15:45.205088Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/1095a76b-1f17-4c46-be58-7d5e6ef26454` → **200**

```json
{
  "id": "1095a76b-1f17-4c46-be58-7d5e6ef26454",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:45:45.205088Z",
  "expires_at": "2026-10-29T16:15:45.205088Z",
  "completed_at": "2026-10-29T15:45:45.493264Z",
  "masked_pan": "41****3599",
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
      "id": "8fd8830f-9e5e-4d65-8ebc-15b2dc6885d6",
      "at": "2026-10-29T15:45:45.611826Z",
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
  "command_id": "d356258d-6115-479d-9ffb-bc5af5e70007",
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
  "correlation_id": "b2f58cc5-f314-431a-8b86-c00cf8ef868b"
}
```

Done: the rider's account and the driver's balance were topped up by card.

# Scenario: cash-dispute

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-12031"
}
```

```json
{
  "challenge_id": "4cbc3db6-7087-4f2a-8bfc-83ccbaaec942",
  "expires_at": "2026-10-29T15:50:46.397722405Z",
  "resend_available_at": "2026-10-29T15:45:47.397722405Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "508387",
  "sent_at": "2026-10-29T15:45:46.403562672Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cbc3db6-7087-4f2a-8bfc-83ccbaaec942",
  "code": "508387",
  "device_ref": "sandbox-12031"
}
```

```json
{
  "session_id": "2cfda874-dfcb-4063-b6b9-4adacab68b04",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTY0NiwiaWF0IjoxNzkzMjg4NzQ2LCJqdGkiOiI5OTllZGVkMi1lMjUyLTQ0YjEtYmQwMS02MjdmYTZlYzZhNDMiLCJzaWQiOiIyY2ZkYTg3NC1kZmNiLTQwNjMtYjZiOS00YWRhY2FiNjhiMDQifQ.yA9LUCjbDbWbtmB7cpRRzEsO9XNec1QcoFbNZtXWi-U",
  "access_expires_at": "2026-10-29T16:00:46.714135167Z",
  "refresh_token": "bgU5UihBvgh_airHuCNTUEcTxNLBIA3N-XJFtes44XM",
  "refresh_expires_at": "2026-11-28T15:45:46.713588741Z",
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
  "command_id": "de8b8a92-d1b4-49e2-a88d-10f581445bea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:47Z",
    "sequence": 1793288747269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d92f069d-7943-42e5-9625-182759d65b87",
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
  "last_heartbeat_at": "2026-10-29T15:45:47.288772Z",
  "last_location_at": "2026-10-29T15:45:47.288772Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635157954",
  "device_ref": "sandbox-16418"
}
```

```json
{
  "challenge_id": "aae5a3db-d4ec-4bbc-a85b-55de61788e75",
  "expires_at": "2026-10-29T15:50:47.575278652Z",
  "resend_available_at": "2026-10-29T15:45:48.575278652Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635157954` → **200**

```json
{
  "phone": "+380635157954",
  "audience": "CLIENT",
  "code": "422474",
  "sent_at": "2026-10-29T15:45:47.577960964Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aae5a3db-d4ec-4bbc-a85b-55de61788e75",
  "code": "422474",
  "device_ref": "sandbox-16418"
}
```

```json
{
  "session_id": "e722da57-2907-4783-a506-5b59fd1c1c92",
  "subject": {
    "type": "CLIENT",
    "id": "47bde819-4237-4f8d-8434-fc023609976d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0N2JkZTgxOS00MjM3LTRmOGQtODQzNC1mYzAyMzYwOTk3NmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjQ3LCJpYXQiOjE3OTMyODg3NDcsImp0aSI6Ijc0ZTcyMWQyLWM4YTAtNGNlYy1hNjU2LTRhMjRhZmQ0NTM2ZSIsInNpZCI6ImU3MjJkYTU3LTI5MDctNDc4My1hNTA2LTViNTlmZDFjMWM5MiJ9.X2Ezj9E_S_83ebVd7RiT85XK3ME33OppmxgZZm871YY",
  "access_expires_at": "2026-10-29T16:00:47.875229349Z",
  "refresh_token": "kEEI8J6OV3bGfPWoVODS9yX5UkoU0vj1CPCBQqq2dfM",
  "refresh_expires_at": "2026-11-28T15:45:47.874641136Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "812aa7f8-a53c-40f7-a9dc-098d35446a84",
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
  "id": "07d348f4-c60f-4898-aae1-44bca7233dd8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:48.159246Z",
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
  "command_id": "3b8a6ded-1aef-4b44-9109-e4f1bdcf1b87",
  "quote_id": "07d348f4-c60f-4898-aae1-44bca7233dd8",
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
  "id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47bde819-4237-4f8d-8434-fc023609976d",
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
  "created_at": "2026-10-29T15:45:48.447787Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## Ivan drives; at the end the rider has no money and leaves

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "e718e66e-d955-479a-b8d5-ecc92744a540",
    "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
    "expires_at": "2026-10-29T15:46:03.451039Z",
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

`POST /api/driver/v1/offers/e718e66e-d955-479a-b8d5-ecc92744a540/accept` → **200**

```json
{
  "command_id": "7d3cd367-0412-483f-a874-077858cb4442"
}
```

```json
{
  "id": "aa353fc2-f404-44b3-b051-784fb28bd102",
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "26be506f-e824-4466-bf6c-1ea2e9121fd3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "26be506f-e824-4466-bf6c-1ea2e9121fd3",
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "assignment_id": "aa353fc2-f404-44b3-b051-784fb28bd102",
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
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/d92f069d-7943-42e5-9625-182759d65b87/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:49Z",
    "sequence": 1793288749616
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d92f069d-7943-42e5-9625-182759d65b87",
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
  "last_heartbeat_at": "2026-10-29T15:45:49.638351Z",
  "last_location_at": "2026-10-29T15:45:49.638351Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/26be506f-e824-4466-bf6c-1ea2e9121fd3/arrive` → **200**

```json
{
  "command_id": "e52aec1f-98b9-47d6-8554-af77d45dd909",
  "expected_version": 0
}
```

```json
{
  "id": "26be506f-e824-4466-bf6c-1ea2e9121fd3",
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "assignment_id": "aa353fc2-f404-44b3-b051-784fb28bd102",
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
  "arrived_at": "2026-10-29T15:45:49.921138Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/26be506f-e824-4466-bf6c-1ea2e9121fd3/start` → **200**

```json
{
  "command_id": "1312d0fe-2aa2-4aa6-a5df-30c8b0d89f44",
  "expected_version": 1
}
```

```json
{
  "id": "26be506f-e824-4466-bf6c-1ea2e9121fd3",
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "assignment_id": "aa353fc2-f404-44b3-b051-784fb28bd102",
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
  "arrived_at": "2026-10-29T15:45:49.921138Z",
  "started_at": "2026-10-29T15:45:50.219292Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/26be506f-e824-4466-bf6c-1ea2e9121fd3/complete` → **200**

```json
{
  "command_id": "bf1bd099-1e6d-4fe3-9680-bfc62f0eb868",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:45:50Z",
  "cash_received": false
}
```

```json
{
  "id": "26be506f-e824-4466-bf6c-1ea2e9121fd3",
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "assignment_id": "aa353fc2-f404-44b3-b051-784fb28bd102",
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
  "arrived_at": "2026-10-29T15:45:49.921138Z",
  "started_at": "2026-10-29T15:45:50.219292Z",
  "completed_at": "2026-10-29T15:45:50.510607Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Finance sees the dispute, with its deadline

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
  "session_id": "801cf288-73be-46ab-bfdd-03e474f56e44",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NTEsImlhdCI6MTc5MzI4ODc1MSwianRpIjoiZjQwMjlhM2QtN2Y4MC00ZDExLTllYTAtM2Y5NDE4ZDQ3ZmUyIiwic2lkIjoiODAxY2YyODgtNzNiZS00NmFiLWJmZGQtMDNlNDc0ZjU2ZTQ0In0.c20x4I4n8mYxpgaU-W5YDxpsBlr5phhtmSVS_y0cIP4",
  "access_expires_at": "2026-10-29T16:00:51.116813793Z",
  "refresh_token": "wF4EYAru0WZLFAyguSBmpHuxIRsNYw_IqSqGwejE66c",
  "refresh_expires_at": "2026-10-30T03:45:51.116233274Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/102ef466-dbe5-4318-a7e3-885d93f0a585/cash-dispute` → **200**

```json
{
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "47bde819-4237-4f8d-8434-fc023609976d",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:45:50.672788Z",
  "decide_by": "2026-11-12T15:45:50.672788Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T15:45:50.672788Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "47bde819-4237-4f8d-8434-fc023609976d",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T15:45:50.672788Z",
      "decide_by": "2026-11-12T15:45:50.672788Z",
      "decision": null,
      "decided_by": null,
      "reason": null,
      "decided_at": null,
      "version": 1
    }
  ]
}
```

## Finance decides: the rider did not pay, the service pays the driver

`POST /api/admin/v1/orders/102ef466-dbe5-4318-a7e3-885d93f0a585/cash-dispute/decide` → **400**

```json
{
  "command_id": "6cfe5eac-7cea-46d1-a2f8-50bb3ae6a8b7",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/102ef466-dbe5-4318-a7e3-885d93f0a585/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "88e8052f-109c-46ab-8055-184b176d34c0",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/102ef466-dbe5-4318-a7e3-885d93f0a585/cash-dispute/decide` → **200**

```json
{
  "command_id": "735a43ef-3652-4366-984e-76e9a726abc5",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "47bde819-4237-4f8d-8434-fc023609976d",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:45:50.672788Z",
  "decide_by": "2026-11-12T15:45:50.672788Z",
  "decision": "PAY_DRIVER",
  "decided_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T15:45:52.333707Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/102ef466-dbe5-4318-a7e3-885d93f0a585/cash-dispute/decide` → **409**

```json
{
  "command_id": "c220055d-26d5-4eaf-9cd5-472920a47bc1",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/102ef466-dbe5-4318-a7e3-885d93f0a585/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "f3339b24-e0dc-4c1b-92f3-69f00d60bb52"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d92f069d-7943-42e5-9625-182759d65b87",
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
  "last_heartbeat_at": "2026-10-29T15:45:49.638351Z",
  "last_location_at": "2026-10-29T15:45:49.638351Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d92f069d-7943-42e5-9625-182759d65b87/close` → **200**

```json
{
  "command_id": "fdf15379-2629-4e8e-88fe-9444b1b88faf",
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

# Scenario: chargeback

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739623860",
  "device_ref": "sandbox-21155"
}
```

```json
{
  "challenge_id": "2b87aa7e-77dc-4495-9931-a6426d14e731",
  "expires_at": "2026-10-29T15:50:53.503866312Z",
  "resend_available_at": "2026-10-29T15:45:54.503866312Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739623860` → **200**

```json
{
  "phone": "+380739623860",
  "audience": "CLIENT",
  "code": "898521",
  "sent_at": "2026-10-29T15:45:53.506993531Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2b87aa7e-77dc-4495-9931-a6426d14e731",
  "code": "898521",
  "device_ref": "sandbox-21155"
}
```

```json
{
  "session_id": "9b3540e3-5ba0-43fa-9300-c5cfbe008372",
  "subject": {
    "type": "CLIENT",
    "id": "1056b703-5065-439e-8baf-70720f411c38"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDU2YjcwMy01MDY1LTQzOWUtOGJhZi03MDcyMGY0MTFjMzgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjUzLCJpYXQiOjE3OTMyODg3NTMsImp0aSI6IjRlMzJjNWEwLWMzOWQtNGUxZi04MjlhLWRlYjExMDZhOTY4ZiIsInNpZCI6IjliMzU0MGUzLTViYTAtNDNmYS05MzAwLWM1Y2ZiZTAwODM3MiJ9.LVn_GStynEDihG5rJvHpdwwscWjE5rVQAN5orXp_KHg",
  "access_expires_at": "2026-10-29T16:00:53.809185542Z",
  "refresh_token": "UmI3hO6TF0OUVVhTibkGcLiZH2lCIjP75kn_pQO0R9o",
  "refresh_expires_at": "2026-11-28T15:45:53.80863725Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a4bcbf2a-9e87-4608-8477-849d6201035d",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6ec910a2-2518-40f6-a75c-35d8f48a0803",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6ec910a2-2518-40f6-a75c-35d8f48a0803",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "fac43c6ec847de991897bc3ae6906032",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6ec910a2-2518-40f6-a75c-35d8f48a0803",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739623860"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6ec910a2-2518-40f6-a75c-35d8f48a0803",
  "expires_at": "2026-10-29T16:15:54.086822Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6ec910a2-2518-40f6-a75c-35d8f48a0803` → **200**

```json
{
  "id": "6ec910a2-2518-40f6-a75c-35d8f48a0803",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:15:54.086822Z",
  "card": {
    "id": "aa1792e4-eafa-4f64-b570-122571634e00",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8024",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:45:54.377591Z"
  },
  "failure_reason": null
}
```

## Andrii is online nearby

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1736"
}
```

```json
{
  "challenge_id": "3c51c3fa-5070-429d-b4c1-084eca0f7caf",
  "expires_at": "2026-10-29T15:50:54.676878021Z",
  "resend_available_at": "2026-10-29T15:45:55.676878021Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "060551",
  "sent_at": "2026-10-29T15:45:54.679421085Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3c51c3fa-5070-429d-b4c1-084eca0f7caf",
  "code": "060551",
  "device_ref": "sandbox-1736"
}
```

```json
{
  "session_id": "7c719558-d39d-4ea1-984a-f80d635fa019",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTY1NCwiaWF0IjoxNzkzMjg4NzU0LCJqdGkiOiJmM2FmMTczYy0xNjA4LTRlZDEtYmQ4ZS01NjVlZmQ4NTJkMTUiLCJzaWQiOiI3YzcxOTU1OC1kMzlkLTRlYTEtOTg0YS1mODBkNjM1ZmEwMTkifQ.znR9fIpgxrvC5Dye0aUyBRPLLQuMbcB3bVv51aF4-1w",
  "access_expires_at": "2026-10-29T16:00:54.985264372Z",
  "refresh_token": "7xr35GZkLoHAMloj0QSHZvmUqHqT3ov78QXaAGzhVUU",
  "refresh_expires_at": "2026-11-28T15:45:54.984673209Z",
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
  "command_id": "5d0c2de2-88fe-4767-bbfb-ba943e4c58b8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:55Z",
    "sequence": 1793288755539
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c076453c-c54a-4c78-bf6d-8212bad6d4b3",
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
  "last_heartbeat_at": "2026-10-29T15:45:55.559398Z",
  "last_location_at": "2026-10-29T15:45:55.559398Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "15f20562-c9a3-49e4-97b5-1a1660d04f05",
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
  "id": "37ef0d8e-0254-4f8d-b251-776eece2c090",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:50:55.862698Z",
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
  "command_id": "aad30366-8081-4d5c-b69d-4eb6de3498b7",
  "quote_id": "37ef0d8e-0254-4f8d-b251-776eece2c090",
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
  "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1056b703-5065-439e-8baf-70720f411c38",
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
  "created_at": "2026-10-29T15:45:56.175397Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc` → **200**

```json
{
  "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1056b703-5065-439e-8baf-70720f411c38",
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
  "created_at": "2026-10-29T15:45:56.175397Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc` → **200**

```json
{
  "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1056b703-5065-439e-8baf-70720f411c38",
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
  "created_at": "2026-10-29T15:45:56.175397Z",
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
    "id": "ba45f357-e891-4ba0-9baa-a75ced1390d7",
    "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
    "expires_at": "2026-10-29T15:46:11.724827Z",
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

`POST /api/driver/v1/offers/ba45f357-e891-4ba0-9baa-a75ced1390d7/accept` → **200**

```json
{
  "command_id": "00207918-264f-443c-bdb2-7ca6f1ed49bd"
}
```

```json
{
  "id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "assignment_id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
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

`POST /api/rider/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/messages` → **201**

```json
{
  "command_id": "ff73cc47-f164-46c7-8c98-5fe4230fb371",
  "body": "Я біля входу, мій номер +380739623860, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "aa64b50c-4496-45d7-a831-f6c0f288680c",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739623860, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T15:45:58.973232738Z"
}
```

`POST /api/driver/v1/trips/dd73d7f3-5f6b-4ccf-a0d5-9580df552b46/messages` → **201**

```json
{
  "command_id": "1f00c192-5015-451b-a1ff-9a58b4805c4e",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "ad69677c-ab21-4534-a807-b478489a0432",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T15:45:59.272093734Z"
}
```

`POST /api/driver/v1/work-sessions/c076453c-c54a-4c78-bf6d-8212bad6d4b3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:45:59Z",
    "sequence": 1793288759552
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c076453c-c54a-4c78-bf6d-8212bad6d4b3",
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
  "last_heartbeat_at": "2026-10-29T15:45:59.571149Z",
  "last_location_at": "2026-10-29T15:45:59.571149Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/dd73d7f3-5f6b-4ccf-a0d5-9580df552b46/arrive` → **200**

```json
{
  "command_id": "26372b31-040b-4882-9ec0-40dd08a1375f",
  "expected_version": 0
}
```

```json
{
  "id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "assignment_id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
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
  "arrived_at": "2026-10-29T15:45:59.862278Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/dd73d7f3-5f6b-4ccf-a0d5-9580df552b46/start` → **200**

```json
{
  "command_id": "43127d33-5fea-4c51-ae3b-8b84afd15ade",
  "expected_version": 1
}
```

```json
{
  "id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "assignment_id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
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
  "arrived_at": "2026-10-29T15:45:59.862278Z",
  "started_at": "2026-10-29T15:46:00.164087Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c076453c-c54a-4c78-bf6d-8212bad6d4b3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:00Z",
    "sequence": 1793288760449
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c076453c-c54a-4c78-bf6d-8212bad6d4b3",
  "session_version": 0,
  "session_state": "OPEN",
  "intent": "ACCEPTING",
  "connection": "CONNECTED",
  "geolocation": "FRESH",
  "occupancy": "ON_TRIP",
  "account_state": "ACTIVE",
  "review_status": "APPROVED",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "last_heartbeat_at": "2026-10-29T15:46:00.468147Z",
  "last_location_at": "2026-10-29T15:46:00.468147Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/dd73d7f3-5f6b-4ccf-a0d5-9580df552b46/complete` → **200**

```json
{
  "command_id": "e01d877c-224e-47c0-8448-d7338c74f3db",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:46:00Z",
  "cash_received": false
}
```

```json
{
  "id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "assignment_id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
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
  "arrived_at": "2026-10-29T15:45:59.862278Z",
  "started_at": "2026-10-29T15:46:00.164087Z",
  "completed_at": "2026-10-29T15:46:00.777512Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc` → **200**

```json
{
  "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "1056b703-5065-439e-8baf-70720f411c38",
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
    "id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
    "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:56.175397Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc` → **200**

```json
{
  "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "1056b703-5065-439e-8baf-70720f411c38",
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
    "id": "3fa04cb5-8617-4db1-b6f5-80e462947c50",
    "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "dd73d7f3-5f6b-4ccf-a0d5-9580df552b46",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:45:56.175397Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c076453c-c54a-4c78-bf6d-8212bad6d4b3",
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
  "last_heartbeat_at": "2026-10-29T15:46:00.468147Z",
  "last_location_at": "2026-10-29T15:46:00.468147Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c076453c-c54a-4c78-bf6d-8212bad6d4b3/close` → **200**

```json
{
  "command_id": "07b38727-9ce3-478b-bc61-37480836b1cf",
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

## The bank disputes the payment: finance exports the evidence

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
  "session_id": "d740236b-389f-4129-aa5b-8b79834f874a",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NjMsImlhdCI6MTc5MzI4ODc2MywianRpIjoiZmZjNTYzNWYtM2U1Yy00YzUyLThlOTItOTcxMWZlNGNiNmZhIiwic2lkIjoiZDc0MDIzNmItMzg5Zi00MTI5LWFhNWItOGI3OTgzNGY4NzRhIn0.cRj-JnCJHi_oTXergab3rGOET5pGt5JwpBWeyPHU0CU",
  "access_expires_at": "2026-10-29T16:01:03.532306242Z",
  "refresh_token": "enuB_-ZJYpSOUbKPg9RWCsnPcIn469iudkEyUfNmvYM",
  "refresh_expires_at": "2026-10-30T03:46:03.531673936Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1def818f-dcc0-4c53-91c8-01d3382811e3"
}
```

`GET /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T15:46:04.096985125Z",
  "order": {
    "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
    "short_number": 9,
    "status": "FULFILLED",
    "payment_method": "CARD",
    "payment_state": "PAID",
    "pickup_label": "вул. Дмитрівська",
    "dropoff_label": "Нивки",
    "quoted_price_minor": 16297,
    "final_price_minor": 16297,
    "currency": "UAH",
    "wallet_minor": 0,
    "discount_minor": 0,
    "fare": {
      "amount_minor": 16297,
      "currency": "UAH",
      "policy": "M1_AGREED_PLUS_WAITING",
      "agreed_minor": 16297,
      "waiting_seconds": 0,
      "free_waiting_seconds": 180,
      "charged_waiting_seconds": 0,
      "waiting_minor": 0
    },
    "created_at": "2026-10-29T15:45:56.175397Z",
    "assigned_at": "2026-10-29T15:45:58.389907Z",
    "arrived_at": "2026-10-29T15:45:59.862278Z",
    "started_at": "2026-10-29T15:46:00.164087Z",
    "completed_at": "2026-10-29T15:46:00.777512Z"
  },
  "driver": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "vehicle": {
      "make": "Hyundai",
      "model": "Sonata",
      "color": "black",
      "registration_number": "AA0003TX"
    }
  },
  "track": {
    "points": 0,
    "flagged_points": 0,
    "first_point_at": null,
    "last_point_at": null,
    "duration_seconds": 0,
    "length_meters": 0
  },
  "rider": {
    "id": "1056b703-5065-439e-8baf-70720f411c38",
    "registered_at": "2026-10-29T15:45:53.806982Z",
    "trips_last_year": [
      {
        "currency": "UAH",
        "trips": 1,
        "total_minor": 16297
      }
    ]
  },
  "card_operations": [
    {
      "type": "AUTH",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "WaitingAuthComplete",
      "created_at": "2026-10-29T15:45:56.177954Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T15:46:00.810944Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks` → **422**

```json
{
  "command_id": "ad039f42-f08d-48f5-8b3a-cfbd3ae8be73",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "2c718c30-556a-46a0-80c0-d9f7e144ac09"
}
```

`POST /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks` → **201**

```json
{
  "command_id": "8cd7fbc3-f85f-47e9-ad43-c40156ac70fe",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:46:04.75042Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks` → **201**

```json
{
  "command_id": "8cd7fbc3-f85f-47e9-ad43-c40156ac70fe",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:46:04.75042Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/1056b703-5065-439e-8baf-70720f411c38` → **200**

```json
{
  "client": {
    "id": "1056b703-5065-439e-8baf-70720f411c38",
    "phone": "+380739623860",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:45:53.806982Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:45:56.175397Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [
    {
      "currency": "UAH",
      "amount_minor": 16297
    }
  ],
  "cases": []
}
```

## The provider's risk managers win it back: the debt is gone; a second answer is refused

`POST /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks/ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25/resolve` → **200**

```json
{
  "command_id": "fda73cdf-13a1-48e2-9935-5e809650bb11",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25",
  "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T15:46:04.75042Z",
  "resolved_at": "2026-10-29T15:46:05.684614Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/1056b703-5065-439e-8baf-70720f411c38` → **200**

```json
{
  "client": {
    "id": "1056b703-5065-439e-8baf-70720f411c38",
    "phone": "+380739623860",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:45:53.806982Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:45:56.175397Z",
      "pickup_label": "вул. Дмитрівська",
      "dropoff_label": "Нивки",
      "vehicle_class": "STANDARD",
      "price_minor": 16297,
      "final_price_minor": 16297,
      "currency": "UAH",
      "payment_method": "CARD",
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
      "cancellation": null,
      "pickup_at": null
    }
  ],
  "bonuses": [],
  "debt": [],
  "cases": []
}
```

`POST /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks/ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25/resolve` → **409**

```json
{
  "command_id": "61a91a43-9e2a-4260-8ccc-0e4f37289db0",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks/ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5a74b9d4-76f1-472c-8f0f-6b2165df21c9"
}
```

`GET /api/admin/v1/orders/697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25",
      "order_id": "697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T15:46:04.75042Z",
      "resolved_at": "2026-10-29T15:46:05.684614Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 697cf460-5dd1-4a16-b2cb-bfa65ae3e1cc without phone or card digits; chargeback ff0b2665-7b1d-4c8b-b7c1-b42b18b7fb25 recorded and won.

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
  "session_id": "8fab831e-273f-4ecc-ba98-af7ae12bd256",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NjcsImlhdCI6MTc5MzI4ODc2NywianRpIjoiOTkyNjNkYTMtY2QwMi00MzI5LTk2YjYtY2I1YTVmOGFmZDEyIiwic2lkIjoiOGZhYjgzMWUtMjczZi00ZWNjLWJhOTgtYWY3YWUxMmJkMjU2In0.mrc595VgM-wMplRHPXCiPi8y25ztYh5I8-GPkAinxTo",
  "access_expires_at": "2026-10-29T16:01:07.477802336Z",
  "refresh_token": "PZx5KpmPIR-TfaaEe4Nf522PHMt6wHrAuHyZqREzshA",
  "refresh_expires_at": "2026-10-30T03:46:07.477262643Z",
  "password_change_required": false
}
```

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
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
  "phone": "+48600489465",
  "device_ref": "sandbox-13993"
}
```

```json
{
  "challenge_id": "9c65b589-90ad-4464-b679-13717b3594b3",
  "expires_at": "2026-10-29T15:51:08.346642952Z",
  "resend_available_at": "2026-10-29T15:46:09.346642952Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600489465` → **200**

```json
{
  "phone": "+48600489465",
  "audience": "CLIENT",
  "code": "751111",
  "sent_at": "2026-10-29T15:46:08.349404347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c65b589-90ad-4464-b679-13717b3594b3",
  "code": "751111",
  "device_ref": "sandbox-13993"
}
```

```json
{
  "session_id": "0e8c276c-d7e2-44f3-8de6-01e4f4fde1bd",
  "subject": {
    "type": "CLIENT",
    "id": "4c78e888-dc19-4ef7-841b-5e3cb8c2d0bb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0Yzc4ZTg4OC1kYzE5LTRlZjctODQxYi01ZTNjYjhjMmQwYmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjY4LCJpYXQiOjE3OTMyODg3NjgsImp0aSI6IjE0NjliYmJhLTU2MTctNDcyZS04NjI2LWY2NDk5NTYzY2NmMyIsInNpZCI6IjBlOGMyNzZjLWQ3ZTItNDRmMy04ZGU2LTAxZTRmNGZkZTFiZCJ9.vHA2SVAOtRQjpme2fJVGTpIym0BnOIJVfolHvBPknCY",
  "access_expires_at": "2026-10-29T16:01:08.653623404Z",
  "refresh_token": "8WCOJsxsDDT4JLv72leDNWcUnZVw4IuryPc4hVIUnJw",
  "refresh_expires_at": "2026-11-28T15:46:08.653087509Z",
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
  "command_id": "02a436fb-6222-42a0-a10d-6d193b74fdbf",
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
  "correlation_id": "13f76d00-88d5-4204-95ef-4e5d87da46c5",
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
  "command_id": "f606d249-92ab-41ea-8093-b0d3ac7d9f6b",
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
  "paused_at": "2026-10-29T15:46:09.813436581Z",
  "version": 1
}
```

## The apps see the pause, and the rider's order is refused

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
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
  "command_id": "d2991ab1-87dd-4448-b39c-0851ccd3a10b",
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
  "id": "19690081-dadc-42c2-a7cf-b471e61aba01",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:10.407561Z",
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
  "command_id": "ed89bbef-1128-45fb-b04e-3de69f064f58",
  "quote_id": "19690081-dadc-42c2-a7cf-b471e61aba01",
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
  "correlation_id": "9d199f16-86dd-4263-9384-f9f4aa7038e0"
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
  "paused_at": "2026-10-29T15:46:09.813437Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "ee81b3be-21ac-44ad-bfe5-65d4cf787567",
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
  "command_id": "2fc629f6-7188-4efa-bf57-afe7d8768596",
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
  "command_id": "d130db16-b2af-40e6-9557-4a62ea6168f7",
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
  "id": "53c864c6-0fa8-45ba-8048-c0009672c912",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:12.151652Z",
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
  "command_id": "374c1e8a-d379-4509-9f6f-9a0035559115",
  "quote_id": "53c864c6-0fa8-45ba-8048-c0009672c912",
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
  "correlation_id": "bedd264c-7388-4454-84eb-69f0efd4052d"
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
  "command_id": "75147ab5-35b9-49ec-a32c-ef42fababe0e",
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
      "from": "18:00",
      "to": "19:00"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "3a9f5423-7408-4747-a33f-18f1bf95d3ef",
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
  "id": "5d6ef99d-a6bd-4030-8e1d-abd34e993d6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:13.320245Z",
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
  "command_id": "743674be-6b7e-489f-a123-51f79e16bf05",
  "quote_id": "5d6ef99d-a6bd-4030-8e1d-abd34e993d6a",
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
  "correlation_id": "13248c03-f6f1-4779-a150-dcfa443a1b66"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6152efdc-fd9e-4cb3-933a-ceb3a686ed9c",
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
  "correlation_id": "5d11d070-2de5-4d9e-8eec-6a507fcccdce"
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
      "from": "18:00",
      "to": "19:00"
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
  "command_id": "02a71061-73f1-4483-ab0a-ae969e6a1f73",
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
  "phone": "+380674020561",
  "device_ref": "sandbox-6081"
}
```

```json
{
  "challenge_id": "40a0ebbd-9fd3-4406-92f2-73e47f21e88d",
  "expires_at": "2026-10-29T15:51:14.829789635Z",
  "resend_available_at": "2026-10-29T15:46:15.829789635Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674020561` → **200**

```json
{
  "phone": "+380674020561",
  "audience": "CLIENT",
  "code": "307831",
  "sent_at": "2026-10-29T15:46:14.832279758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "40a0ebbd-9fd3-4406-92f2-73e47f21e88d",
  "code": "307831",
  "device_ref": "sandbox-6081"
}
```

```json
{
  "session_id": "4dd6ea4b-cfca-4d43-956a-3558eb94eb6d",
  "subject": {
    "type": "CLIENT",
    "id": "62525130-f5ba-41d5-893f-5c45ed6d0cec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MjUyNTEzMC1mNWJhLTQxZDUtODkzZi01YzQ1ZWQ2ZDBjZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5Njc1LCJpYXQiOjE3OTMyODg3NzUsImp0aSI6IjkwNzZmMDM4LTVmY2UtNGVkOS1hMTY0LWQzZGU2ZWFiZTcxNiIsInNpZCI6IjRkZDZlYTRiLWNmY2EtNGQ0My05NTZhLTM1NThlYjk0ZWI2ZCJ9.6NS0Yi5o2D5TLIrWASSXmMsohhjtuFTLQhXJ63uLxOk",
  "access_expires_at": "2026-10-29T16:01:15.133242702Z",
  "refresh_token": "0ZHrvCiKGW_ylfJoF8VRCFxpZ9NGWqh3jKf8VhucB40",
  "refresh_expires_at": "2026-11-28T15:46:15.13267119Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "62525130-f5ba-41d5-893f-5c45ed6d0cec",
  "session_id": "4dd6ea4b-cfca-4d43-956a-3558eb94eb6d",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4055f7d8-0473-4785-be6e-8b7d29300120",
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
  "id": "91446da2-e14a-43fb-a752-5bc0cf9a4ce1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:15.692389Z",
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
  "challenge_id": "e20399b3-4a9d-4145-8d92-1a5ad25b28b4",
  "expires_at": "2026-10-29T15:51:17.985079814Z",
  "resend_available_at": "2026-10-29T15:46:18.985079814Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674020561` → **200**

```json
{
  "phone": "+380674020561",
  "audience": "CLIENT",
  "code": "756137",
  "sent_at": "2026-10-29T15:46:17.987559656Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "d64d22c0-1868-4fde-ac9e-e52f19ac1030",
  "challenge_id": "e20399b3-4a9d-4145-8d92-1a5ad25b28b4",
  "otp_code": "756137"
}
```

```json
{
  "client_id": "62525130-f5ba-41d5-893f-5c45ed6d0cec",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T15:46:18.295431025Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "8491a146-dc2e-40ee-b845-a954e507fdef",
  "quote_id": "91446da2-e14a-43fb-a752-5bc0cf9a4ce1",
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
  "correlation_id": "12958d6a-f9d2-4d95-ab43-086bd7df8032"
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
  "session_id": "a02d84bf-4931-4a6c-8deb-3006ea296a79",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2NzksImlhdCI6MTc5MzI4ODc3OSwianRpIjoiMmJiMTNhYTMtYjhlNi00NTZmLWFiYzYtNDAwZGY3NTAyZmJjIiwic2lkIjoiYTAyZDg0YmYtNDkzMS00YTZjLThkZWItMzAwNmVhMjk2YTc5In0.3oszwncet1AF9CWOq9Xm6dts_9soat9buW_Iuf4MOl4",
  "access_expires_at": "2026-10-29T16:01:19.178050215Z",
  "refresh_token": "xn56mrzCr892gT_j9rkvHFOoWiM9c1cFv9twcFX5Yxc",
  "refresh_expires_at": "2026-10-30T03:46:19.177500253Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "62525130-f5ba-41d5-893f-5c45ed6d0cec",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T15:46:18.295431Z",
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

`POST /api/admin/v1/client-deletions/62525130-f5ba-41d5-893f-5c45ed6d0cec/complete` → **200**

```json
{
  "command_id": "90ae2472-f61d-4e5e-88af-0b5f7169d084",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "62525130-f5ba-41d5-893f-5c45ed6d0cec",
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
  "correlation_id": "b1320bd8-20d6-4a03-a6aa-c36af27f0622"
}
```

Done: client 62525130-f5ba-41d5-893f-5c45ed6d0cec anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667441159",
  "device_ref": "sandbox-7266"
}
```

```json
{
  "challenge_id": "10227a41-f53b-4286-80b4-7d7d172d7f0c",
  "expires_at": "2026-10-29T15:51:20.430484442Z",
  "resend_available_at": "2026-10-29T15:46:21.430484442Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667441159` → **200**

```json
{
  "phone": "+380667441159",
  "audience": "CLIENT",
  "code": "404219",
  "sent_at": "2026-10-29T15:46:20.434868734Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10227a41-f53b-4286-80b4-7d7d172d7f0c",
  "code": "404219",
  "device_ref": "sandbox-7266"
}
```

```json
{
  "session_id": "a275f235-ce05-444e-a239-fef57eb61030",
  "subject": {
    "type": "CLIENT",
    "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZThhYjFlYi05MjZmLTRmZTMtODhlYy1mMzFjZTFhMjVmOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjgwLCJpYXQiOjE3OTMyODg3ODAsImp0aSI6Ijg0YzIyMTA2LWMxMmUtNGI0NC1hYWVhLTBjZjA2ZTNhMjdkZSIsInNpZCI6ImEyNzVmMjM1LWNlMDUtNDQ0ZS1hMjM5LWZlZjU3ZWI2MTAzMCJ9.VAoAFSNaw35ei0C4Dcrxzk0d29DCS-6S2TjPVOAJf-Q",
  "access_expires_at": "2026-10-29T16:01:20.786336538Z",
  "refresh_token": "5A1-tw4ZR05zjYkCS-oAlio7F1fwuu_Kn_QubdJCq_I",
  "refresh_expires_at": "2026-11-28T15:46:20.785775505Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
  "session_id": "a275f235-ce05-444e-a239-fef57eb61030",
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
  "session_id": "e1641b39-26c6-44eb-97a3-b8cd3a35e76b",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2ODEsImlhdCI6MTc5MzI4ODc4MSwianRpIjoiNDE4ZGZiMDYtMzM3YS00MDNlLWE5OTItODQ3MDYxYzEzZDEyIiwic2lkIjoiZTE2NDFiMzktMjZjNi00NGViLTk3YTMtYjhjZDNhMzVlNzZiIn0.fKJrTkFvPar0ug2jLNVVtGInPxmsWgrWJWKmFCPi6lc",
  "access_expires_at": "2026-10-29T16:01:21.655295147Z",
  "refresh_token": "9sHYv0gV6DzbPIGfcHN2Dw-aNYXPOGjIBg6PFqApZSA",
  "refresh_expires_at": "2026-10-30T03:46:21.654734184Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7441159&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
      "phone": "+380667441159",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T15:46:20.783897Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c` → **200**

```json
{
  "client": {
    "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
    "phone": "+380667441159",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:46:20.783897Z",
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

`POST /api/admin/v1/clients/9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c/block` → **400**

```json
{
  "command_id": "49140bc9-57fa-4677-ba46-9dff282ebcb2",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "d4cb977b-98ad-45a1-9327-104210682608",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c/block` → **200**

```json
{
  "command_id": "972e5a4b-de7d-4b09-9b05-5e587aa15470",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
  "phone": "+380667441159",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T15:46:20.783897Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T15:46:22.8529Z",
    "by": "0392d253-d6a8-4a88-ba36-785edcc894c8"
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
  "correlation_id": "36a8916f-7590-4d86-b209-e8834dcf1971"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667441159",
  "device_ref": "sandbox-32300"
}
```

```json
{
  "challenge_id": "04e02dd2-311e-4182-bc5a-d175edd3b99e",
  "expires_at": "2026-10-29T15:51:25.432843872Z",
  "resend_available_at": "2026-10-29T15:46:26.432843872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667441159` → **200**

```json
{
  "phone": "+380667441159",
  "audience": "CLIENT",
  "code": "171539",
  "sent_at": "2026-10-29T15:46:25.435494152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "04e02dd2-311e-4182-bc5a-d175edd3b99e",
  "code": "171539",
  "device_ref": "sandbox-32300"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "e524a267-8005-4f81-ab76-1838f3445429"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c` → **200**

```json
{
  "client": {
    "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
    "phone": "+380667441159",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T15:46:20.783897Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T15:46:22.8529Z",
      "by": "0392d253-d6a8-4a88-ba36-785edcc894c8"
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

`POST /api/admin/v1/clients/9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c/unblock` → **200**

```json
{
  "command_id": "5b87cb28-bca4-417e-a4c4-7d8296029fc0",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
  "phone": "+380667441159",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T15:46:20.783897Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667441159",
  "device_ref": "sandbox-9779"
}
```

```json
{
  "challenge_id": "ca4536a2-c957-4517-85ad-d33ad29b2f24",
  "expires_at": "2026-10-29T15:51:28.633768555Z",
  "resend_available_at": "2026-10-29T15:46:29.633768555Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667441159` → **200**

```json
{
  "phone": "+380667441159",
  "audience": "CLIENT",
  "code": "692816",
  "sent_at": "2026-10-29T15:46:28.636172656Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca4536a2-c957-4517-85ad-d33ad29b2f24",
  "code": "692816",
  "device_ref": "sandbox-9779"
}
```

```json
{
  "session_id": "68c7287b-1f8b-4789-b5cf-6c90a9832a00",
  "subject": {
    "type": "CLIENT",
    "id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZThhYjFlYi05MjZmLTRmZTMtODhlYy1mMzFjZTFhMjVmOGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5Njg4LCJpYXQiOjE3OTMyODg3ODgsImp0aSI6IjA5ZGY4MzBlLTI4NzUtNGI1ZC1iYTE4LTZjNzI5MTFlMTYwZiIsInNpZCI6IjY4YzcyODdiLTFmOGItNDc4OS1iNWNmLTZjOTBhOTgzMmEwMCJ9.KDVpGikBeVfHU-vksrMnS-TCzXMQssIvawA5PHEVNss",
  "access_expires_at": "2026-10-29T16:01:28.947370035Z",
  "refresh_token": "VohkBxLxorDR_MPVLu5EhszOBg5lCAdI81mZVrtwrDI",
  "refresh_expires_at": "2026-11-28T15:46:28.946855469Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "9e8ab1eb-926f-4fe3-88ec-f31ce1a25f8c",
  "session_id": "68c7287b-1f8b-4789-b5cf-6c90a9832a00",
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
  "phone": "+380663443343",
  "device_ref": "sandbox-4552"
}
```

```json
{
  "challenge_id": "25524dc8-4f35-4077-868d-7889d2176290",
  "expires_at": "2026-10-29T15:51:29.511578006Z",
  "resend_available_at": "2026-10-29T15:46:30.511578006Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380663443343` → **200**

```json
{
  "phone": "+380663443343",
  "audience": "CLIENT",
  "code": "371150",
  "sent_at": "2026-10-29T15:46:29.514340971Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "25524dc8-4f35-4077-868d-7889d2176290",
  "code": "371150",
  "device_ref": "sandbox-4552"
}
```

```json
{
  "session_id": "5df5f88e-2630-40d5-9ff9-ca1261b4700e",
  "subject": {
    "type": "CLIENT",
    "id": "1616c25a-40b9-4e3a-8b8e-aeb5a8aa8051"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNjE2YzI1YS00MGI5LTRlM2EtOGI4ZS1hZWI1YThhYTgwNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5Njg5LCJpYXQiOjE3OTMyODg3ODksImp0aSI6Ijc1NTViOWNjLTljYWEtNDc4YS05OGRjLWQ1MDEzZTZkNTQ3YiIsInNpZCI6IjVkZjVmODhlLTI2MzAtNDBkNS05ZmY5LWNhMTI2MWI0NzAwZSJ9.EFuQpUDqttG0ayIDQvMExKhQbOqDbNWFoKZ2x7o9SAg",
  "access_expires_at": "2026-10-29T16:01:29.82700554Z",
  "refresh_token": "mgbXrNand34CGOlSq24UNHK4KmTksgBZCI2UBxMf0Q8",
  "refresh_expires_at": "2026-11-28T15:46:29.82641923Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8b7ebbc-136d-4881-88e8-ad5dc051f296",
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
  "id": "ac809d75-08e6-445d-8f1c-3ee9ff2cde43",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:30.109590Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 1bf469b9-3506-44d2-8d62-a2c22beff23b) → **201**

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
  "session_id": "17d0be22-911f-4cab-92ca-b4b74c4cd3a5",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2OTAsImlhdCI6MTc5MzI4ODc5MCwianRpIjoiNDQ0M2ViNTEtODI4Ni00N2NjLTg4ZjAtZTM2NjYzYWMwNWFjIiwic2lkIjoiMTdkMGJlMjItOTExZi00Y2FiLTkyY2EtYjRiNzRjNGNkM2E1In0.Jxguc1nO2MAM45dq9qeZp2v0TeBP2HSHCzSwANiz1nk",
  "access_expires_at": "2026-10-29T16:01:30.738658636Z",
  "refresh_token": "zAkHYEYHJ26rDA1PCrxvScMXt2gihAQzmZnViV2xyeY",
  "refresh_expires_at": "2026-10-30T03:46:30.738142127Z",
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
  "session_id": "7cb86a3e-74f9-4cf1-811a-6271551edc1e",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk2OTEsImlhdCI6MTc5MzI4ODc5MSwianRpIjoiZTBlZDBjNmItNzdiYS00MDBjLTkyNDUtZDZkOWE1ODU4MzkyIiwic2lkIjoiN2NiODZhM2UtNzRmOS00Y2YxLTgxMWEtNjI3MTU1MWVkYzFlIn0.OJvzbd0a9Q91mq796k5w0u5lo5EBpyMT9Po5TRRzeB0",
  "access_expires_at": "2026-10-29T16:01:31.310775978Z",
  "refresh_token": "isPq97q5hvPX4ZJo8QXwEJ6nsOgz_gPBCGCy2tkS6zE",
  "refresh_expires_at": "2026-10-30T03:46:31.310267212Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/878399b2-0a54-43c2-a12a-e848068470bb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:46:30.408355Z",
      "actor": {
        "type": "CLIENT",
        "id": "1616c25a-40b9-4e3a-8b8e-aeb5a8aa8051",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "878399b2-0a54-43c2-a12a-e848068470bb",
        "quote_id": "ac809d75-08e6-445d-8f1c-3ee9ff2cde43",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1bf469b9-3506-44d2-8d62-a2c22beff23b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:46:30.411303Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "878399b2-0a54-43c2-a12a-e848068470bb",
        "attempt_id": "4fea51a2-bd07-4be8-98be-1ff6338067da",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1bf469b9-3506-44d2-8d62-a2c22beff23b"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T15:46:30.419328Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "878399b2-0a54-43c2-a12a-e848068470bb",
        "attempt_id": "4fea51a2-bd07-4be8-98be-1ff6338067da"
      },
      "correlation_id": "1bf469b9-3506-44d2-8d62-a2c22beff23b"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "4fea51a2-bd07-4be8-98be-1ff6338067da",
        "generation": 1,
        "started_at": "2026-10-29T15:46:30.410054Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T15:46:30.419328Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T15:46:30.412224Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/1bf469b9-3506-44d2-8d62-a2c22beff23b` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "878399b2-0a54-43c2-a12a-e848068470bb:0",
      "order_id": "878399b2-0a54-43c2-a12a-e848068470bb",
      "at": "2026-10-29T15:46:30.408355Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "878399b2-0a54-43c2-a12a-e848068470bb:1",
      "order_id": "878399b2-0a54-43c2-a12a-e848068470bb",
      "at": "2026-10-29T15:46:30.411303Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "878399b2-0a54-43c2-a12a-e848068470bb:2",
      "order_id": "878399b2-0a54-43c2-a12a-e848068470bb",
      "at": "2026-10-29T15:46:30.419328Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/84579480-6828-4d6d-93d3-1598f3c72add` → **200**

```json
{
  "found": []
}
```

Done: request 1bf469b9-3506-44d2-8d62-a2c22beff23b — order 878399b2-0a54-43c2-a12a-e848068470bb found by its id.

`GET /api/rider/v1/orders/878399b2-0a54-43c2-a12a-e848068470bb` → **200**

```json
{
  "id": "878399b2-0a54-43c2-a12a-e848068470bb",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1616c25a-40b9-4e3a-8b8e-aeb5a8aa8051",
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
  "created_at": "2026-10-29T15:46:30.40762Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/878399b2-0a54-43c2-a12a-e848068470bb/cancel` → **200**

```json
{
  "command_id": "337a347f-dfeb-427e-ae8a-edf710890ada",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "878399b2-0a54-43c2-a12a-e848068470bb",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1616c25a-40b9-4e3a-8b8e-aeb5a8aa8051",
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
  "created_at": "2026-10-29T15:46:30.40762Z",
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
  "phone": "+380637371295",
  "device_ref": "sandbox-31755"
}
```

```json
{
  "challenge_id": "36d89542-f864-436f-bc1a-ece2f4cff22f",
  "expires_at": "2026-10-29T15:51:33.092360216Z",
  "resend_available_at": "2026-10-29T15:46:34.092360216Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637371295` → **200**

```json
{
  "phone": "+380637371295",
  "audience": "CLIENT",
  "code": "243243",
  "sent_at": "2026-10-29T15:46:33.095100729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36d89542-f864-436f-bc1a-ece2f4cff22f",
  "code": "243243",
  "device_ref": "sandbox-31755"
}
```

```json
{
  "session_id": "927ae78a-4174-437f-abf6-4ccd579fedce",
  "subject": {
    "type": "CLIENT",
    "id": "58d85530-0aad-4d82-9f52-cd27d0cac6c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1OGQ4NTUzMC0wYWFkLTRkODItOWY1Mi1jZDI3ZDBjYWM2YzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NjkzLCJpYXQiOjE3OTMyODg3OTMsImp0aSI6IjYxNGE3Y2NlLTYyZmMtNGQ2ZC1iYzc4LWY1YzVjYzBkZTdlMyIsInNpZCI6IjkyN2FlNzhhLTQxNzQtNDM3Zi1hYmY2LTRjY2Q1NzlmZWRjZSJ9.ptkjEsUoBhBhpDH1U6T2iQgC8Pz3PfaBDjw3YGnDeWk",
  "access_expires_at": "2026-10-29T16:01:33.401609368Z",
  "refresh_token": "mqk5VIBAFmQkjPzOHFXPZCYkEATK1kvlGAyXHTX7ijk",
  "refresh_expires_at": "2026-11-28T15:46:33.400987572Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "c895e380-7fa3-4118-98a8-a7a5863f9fcf",
  "expires_at": "2026-10-29T15:51:35.682225281Z",
  "resend_available_at": "2026-10-29T15:46:36.682225281Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637371295` → **200**

```json
{
  "phone": "+380637371295",
  "audience": "CLIENT",
  "code": "317076",
  "sent_at": "2026-10-29T15:46:35.684429184Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "17d1bbb6-c99b-498d-826d-2d6a0384a589",
  "challenge_id": "c895e380-7fa3-4118-98a8-a7a5863f9fcf",
  "otp_code": "317076"
}
```

```json
{
  "id": "76590312-0bbb-49cc-9ba0-2ac74d8486d1",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:35.988364Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/76590312-0bbb-49cc-9ba0-2ac74d8486d1` → **200**

```json
{
  "id": "76590312-0bbb-49cc-9ba0-2ac74d8486d1",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:35.988364Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/76590312-0bbb-49cc-9ba0-2ac74d8486d1` → **200**

```json
{
  "id": "76590312-0bbb-49cc-9ba0-2ac74d8486d1",
  "state": "PENDING",
  "created_at": "2026-10-29T15:46:35.988364Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/76590312-0bbb-49cc-9ba0-2ac74d8486d1` → **200**

```json
{
  "id": "76590312-0bbb-49cc-9ba0-2ac74d8486d1",
  "state": "READY",
  "created_at": "2026-10-29T15:46:35.988364Z",
  "ready_at": "2026-10-29T15:46:38.752312Z",
  "expires_at": "2026-11-05T15:46:38.752312Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/76590312-0bbb-49cc-9ba0-2ac74d8486d1/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633788525",
  "device_ref": "sandbox-14357"
}
```

```json
{
  "challenge_id": "c527818a-bb28-4bc8-9ace-1b7056a147b0",
  "expires_at": "2026-10-29T15:51:39.131211317Z",
  "resend_available_at": "2026-10-29T15:46:40.131211317Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633788525` → **200**

```json
{
  "phone": "+380633788525",
  "audience": "CLIENT",
  "code": "248218",
  "sent_at": "2026-10-29T15:46:39.133969262Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c527818a-bb28-4bc8-9ace-1b7056a147b0",
  "code": "248218",
  "device_ref": "sandbox-14357"
}
```

```json
{
  "session_id": "0c3bec78-47e2-436c-979a-4ca61c77d1bc",
  "subject": {
    "type": "CLIENT",
    "id": "088e5c7e-7bdd-4f13-ae98-9c5bdd3d5099"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwODhlNWM3ZS03YmRkLTRmMTMtYWU5OC05YzViZGQzZDUwOTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5Njk5LCJpYXQiOjE3OTMyODg3OTksImp0aSI6IjZmNmNjMzI0LTBkZTUtNDI5My04MzQyLThiYmQ5MDU4MzgzNyIsInNpZCI6IjBjM2JlYzc4LTQ3ZTItNDM2Yy05NzlhLTRjYTYxYzc3ZDFiYyJ9.EQPt2UxvrmZqWtpMszifn1Rs8ygCCQKtcv1OVpQR9K0",
  "access_expires_at": "2026-10-29T16:01:39.443086454Z",
  "refresh_token": "Lg6ETnc_RM0r-1mIb3rFg75ikR6Z-LJKsYZwEmRay7A",
  "refresh_expires_at": "2026-11-28T15:46:39.442561189Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/76590312-0bbb-49cc-9ba0-2ac74d8486d1/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/76590312-0bbb-49cc-9ba0-2ac74d8486d1/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6de3d9fb-6238-47e3-b6c9-d9a16411362a"
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
  "session_id": "d8a6d13b-c222-425c-b2d7-c57ecde083ba",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MDAsImlhdCI6MTc5MzI4ODgwMCwianRpIjoiMTc1ODc5MGMtYTE3Ny00YWExLWE3MWYtZWI3ZDNjZmUzZDA2Iiwic2lkIjoiZDhhNmQxM2ItYzIyMi00MjVjLWIyZDctYzU3ZWNkZTA4M2JhIn0.vtudFtSopP_nGNdIppdRIUtX17RETnKnNhKXXLzkARg",
  "access_expires_at": "2026-10-29T16:01:40.299161823Z",
  "refresh_token": "x8oUiEgOTYlXa31L3LvN8R4He5dJTffw4CVQhYK0Juc",
  "refresh_expires_at": "2026-10-30T03:46:40.298614907Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "58d85530-0aad-4d82-9f52-cd27d0cac6c4",
  "session_id": "927ae78a-4174-437f-abf6-4ccd579fedce",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/58d85530-0aad-4d82-9f52-cd27d0cac6c4/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "76590312-0bbb-49cc-9ba0-2ac74d8486d1",
      "state": "READY",
      "created_at": "2026-10-29T15:46:35.988364Z",
      "ready_at": "2026-10-29T15:46:38.752312Z",
      "expires_at": "2026-11-05T15:46:38.752312Z",
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
  "device_ref": "sandbox-12504"
}
```

```json
{
  "challenge_id": "2d70f30f-caba-4cdf-8063-553c42319f5c",
  "expires_at": "2026-10-29T15:51:41.154345458Z",
  "resend_available_at": "2026-10-29T15:46:42.154345458Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "409432",
  "sent_at": "2026-10-29T15:46:41.15683461Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d70f30f-caba-4cdf-8063-553c42319f5c",
  "code": "409432",
  "device_ref": "sandbox-12504"
}
```

```json
{
  "session_id": "f7e9b4bf-7207-400f-94f4-e76c4d3948c5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcwMSwiaWF0IjoxNzkzMjg4ODAxLCJqdGkiOiIyOTllN2RlYi0zNzMxLTRiNWMtOWVkMy0zN2RlYzAxNDc3MDciLCJzaWQiOiJmN2U5YjRiZi03MjA3LTQwMGYtOTRmNC1lNzZjNGQzOTQ4YzUifQ.qMLR5lH1F2FatJl-CPx-wiT5UhGRm4fgO1zczjuzOOc",
  "access_expires_at": "2026-10-29T16:01:41.464029631Z",
  "refresh_token": "PtSeJarQsiSxClL419t8u037jZiH1KVKtESFHDUh1PQ",
  "refresh_expires_at": "2026-11-28T15:46:41.463398272Z",
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
  "device_ref": "sandbox-5069"
}
```

```json
{
  "challenge_id": "3cc32532-4099-43b1-ade2-eb9a30ea6b10",
  "expires_at": "2026-10-29T15:51:42.010357081Z",
  "resend_available_at": "2026-10-29T15:46:43.010357081Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "510408",
  "sent_at": "2026-10-29T15:46:42.012880347Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3cc32532-4099-43b1-ade2-eb9a30ea6b10",
  "code": "510408",
  "device_ref": "sandbox-5069"
}
```

```json
{
  "session_id": "1c33dce1-0325-428a-a93c-4d341768ad0a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcwMiwiaWF0IjoxNzkzMjg4ODAyLCJqdGkiOiI1YTljNTVkNi01YTg4LTRkMjctYjU2Ny01OTM5ZWQyNzdmN2QiLCJzaWQiOiIxYzMzZGNlMS0wMzI1LTQyOGEtYTkzYy00ZDM0MTc2OGFkMGEifQ.hpF6NjnmEYnD59HFkIuPEku3dFChlbtVrR8eDO18dQQ",
  "access_expires_at": "2026-10-29T16:01:42.320804662Z",
  "refresh_token": "rKWOUQw22plig19fI-Rs7VUjOdYZ7HLjp3CxaGoV06M",
  "refresh_expires_at": "2026-11-28T15:46:42.320256739Z",
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
  "command_id": "4f8f0d2d-90c5-488f-a331-c477d72c5883",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:42Z",
    "sequence": 1793288802874
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "cc12a38c-e652-4011-8bd3-01ce69888bbd",
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
  "last_heartbeat_at": "2026-10-29T15:46:42.892613Z",
  "last_location_at": "2026-10-29T15:46:42.892613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-16158"
}
```

```json
{
  "challenge_id": "df16967f-cc97-4b22-a73a-9d6cd4445b38",
  "expires_at": "2026-10-29T15:51:43.176242953Z",
  "resend_available_at": "2026-10-29T15:46:44.176242953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "920897",
  "sent_at": "2026-10-29T15:46:43.178789931Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df16967f-cc97-4b22-a73a-9d6cd4445b38",
  "code": "920897",
  "device_ref": "sandbox-16158"
}
```

```json
{
  "session_id": "4b8dd510-e20c-4e86-814b-15456efc04b0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcwMywiaWF0IjoxNzkzMjg4ODAzLCJqdGkiOiI0M2ZkOGI4NC0yNjA3LTRmMGYtOTNjMy01M2ZiMWEyY2FmNmMiLCJzaWQiOiI0YjhkZDUxMC1lMjBjLTRlODYtODE0Yi0xNTQ1NmVmYzA0YjAifQ.2AvyAvHXGIk57nScDGwR-691y0QmBWiYmD4EX__lYy4",
  "access_expires_at": "2026-10-29T16:01:43.481436695Z",
  "refresh_token": "Ygerjx-Wo6D2XamNfFMCFtRPtl7KF6lirI7Hx3U-hnE",
  "refresh_expires_at": "2026-11-28T15:46:43.480889989Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9",
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
  "last_heartbeat_at": "2026-10-29T15:45:14.768966Z",
  "last_location_at": "2026-10-29T15:45:14.768966Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9/handover` → **200**

```json
{
  "command_id": "16e93e90-8e02-4272-9d62-62f89fb7ab31",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9",
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
  "last_heartbeat_at": "2026-10-29T15:45:14.768966Z",
  "last_location_at": "2026-10-29T15:45:14.768966Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:44Z",
    "sequence": 1793288804336
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9",
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
  "last_heartbeat_at": "2026-10-29T15:46:44.354964Z",
  "last_location_at": "2026-10-29T15:46:44.354964Z",
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
  "session_id": "d8f7dfb3-b2db-4258-b1db-dcbf6aa26914",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MDQsImlhdCI6MTc5MzI4ODgwNCwianRpIjoiN2EwN2ZiZjAtN2UyYi00NGJhLTgwMmQtMjkzZWUzNWZjYzFkIiwic2lkIjoiZDhmN2RmYjMtYjJkYi00MjU4LWIxZGItZGNiZjZhYTI2OTE0In0.k8zjYrLlW8TiPOxTKYMKDvrfaD1kNBeYXjKANPboIfA",
  "access_expires_at": "2026-10-29T16:01:44.924776551Z",
  "refresh_token": "bMU6cwbWjVRxHHBIPT6XcESTdM4WqVD_R-dzfcj0dHA",
  "refresh_expires_at": "2026-10-30T03:46:44.9242799Z",
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
  "session_id": "6b4a45dc-4a68-4a76-a73c-bf3f0a2373d8",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MDUsImlhdCI6MTc5MzI4ODgwNSwianRpIjoiMjE4YzRhN2UtZjUyMS00MGYwLWI5OTAtN2YzOGU1M2ViODNkIiwic2lkIjoiNmI0YTQ1ZGMtNGE2OC00YTc2LWE3M2MtYmYzZjBhMjM3M2Q4In0.zKRoA7UI6VGCm94178wABLQDi4tGH6t_xXBroBDGWO0",
  "access_expires_at": "2026-10-29T16:01:45.502244774Z",
  "refresh_token": "Lju8s_tZ0lrA_bqp1UkFIhZ_rgKJY_OtifjcVmP2wJ0",
  "refresh_expires_at": "2026-10-30T03:46:45.501677984Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683448899",
  "device_ref": "sandbox-18063"
}
```

```json
{
  "challenge_id": "d42d8634-c7a1-4711-b146-e4c175bf4787",
  "expires_at": "2026-10-29T15:51:45.786367451Z",
  "resend_available_at": "2026-10-29T15:46:46.786367451Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683448899` → **200**

```json
{
  "phone": "+380683448899",
  "audience": "CLIENT",
  "code": "867948",
  "sent_at": "2026-10-29T15:46:45.789581186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d42d8634-c7a1-4711-b146-e4c175bf4787",
  "code": "867948",
  "device_ref": "sandbox-18063"
}
```

```json
{
  "session_id": "10bbb7aa-1c9f-42b8-aab0-c47979aa28c9",
  "subject": {
    "type": "CLIENT",
    "id": "0ca4ec6f-00e3-49bb-ac5c-118e8e0512e6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwY2E0ZWM2Zi0wMGUzLTQ5YmItYWM1Yy0xMThlOGUwNTEyZTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzA2LCJpYXQiOjE3OTMyODg4MDYsImp0aSI6IjQ1ZDFjNjg0LTA5Y2QtNDgxOC1iZjY3LWZiYTU3MWU1NzIwNiIsInNpZCI6IjEwYmJiN2FhLTFjOWYtNDJiOC1hYWIwLWM0Nzk3OWFhMjhjOSJ9.xcmYwzYIJglMxR3EpJIitFePDkHubnwA4damTFnepoU",
  "access_expires_at": "2026-10-29T16:01:46.098870806Z",
  "refresh_token": "y_VHaQIBhT8ztmRUKIfp-Dds53urWA7u11LdSxTNQww",
  "refresh_expires_at": "2026-11-28T15:46:46.098351141Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c6d2d92-f1c9-4ff6-b09d-d446100bd678",
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
  "id": "a4afbf51-7fe4-4b62-aae9-b8493b4bc8be",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:46.383036Z",
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
  "command_id": "e155782c-bb4b-4704-85cd-f5cf088b0a0b",
  "quote_id": "a4afbf51-7fe4-4b62-aae9-b8493b4bc8be",
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
  "id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0ca4ec6f-00e3-49bb-ac5c-118e8e0512e6",
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
  "created_at": "2026-10-29T15:46:46.672502Z",
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
    "id": "eaa1e5f9-9b25-4ff9-8d03-bf20b31fa79f",
    "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
    "expires_at": "2026-10-29T15:47:01.675626Z",
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

`POST /api/driver/v1/offers/eaa1e5f9-9b25-4ff9-8d03-bf20b31fa79f/reject` → **204**

```json
{
  "command_id": "ef62d0f3-4c3c-4c03-9df7-948f92cb44e0"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "d4ff009f-37de-450b-94da-53006c831823",
    "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
    "expires_at": "2026-10-29T15:47:02.267284Z",
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

`POST /api/driver/v1/offers/d4ff009f-37de-450b-94da-53006c831823/accept` → **200**

```json
{
  "command_id": "e4caf1ef-8093-490b-9efc-a14425fb93dd"
}
```

```json
{
  "id": "d0bdc288-52b8-4824-8160-c5eef6d1cc1e",
  "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70cde7e5-d8cc-432d-b88a-5e7ca8326d30",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/d268c619-d4ab-4773-ac9d-24cc874eaafa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:46:46.672943Z",
      "actor": {
        "type": "CLIENT",
        "id": "0ca4ec6f-00e3-49bb-ac5c-118e8e0512e6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
        "quote_id": "a4afbf51-7fe4-4b62-aae9-b8493b4bc8be",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "a8a350d0-68dc-4c46-a0af-abcaf2dd9793"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:46:46.674836Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
        "attempt_id": "8706c779-547a-44af-8511-87309cbb9cce",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a8a350d0-68dc-4c46-a0af-abcaf2dd9793"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:46:46.678471Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "eaa1e5f9-9b25-4ff9-8d03-bf20b31fa79f",
        "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "a8a350d0-68dc-4c46-a0af-abcaf2dd9793"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T15:46:47.266277Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "eaa1e5f9-9b25-4ff9-8d03-bf20b31fa79f",
        "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa"
      },
      "correlation_id": "25fcc0c1-e69e-40a6-a8fc-1511bec8be65"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order d268c619-d4ab-4773-ac9d-24cc874eaafa — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/d268c619-d4ab-4773-ac9d-24cc874eaafa` → **200**

```json
{
  "id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "0ca4ec6f-00e3-49bb-ac5c-118e8e0512e6",
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
    "id": "d0bdc288-52b8-4824-8160-c5eef6d1cc1e",
    "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "70cde7e5-d8cc-432d-b88a-5e7ca8326d30",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:46:46.672502Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d268c619-d4ab-4773-ac9d-24cc874eaafa/cancel` → **200**

```json
{
  "command_id": "12a97e80-047e-4c49-9ef0-c751ae9d71d2",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "0ca4ec6f-00e3-49bb-ac5c-118e8e0512e6",
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
    "id": "d0bdc288-52b8-4824-8160-c5eef6d1cc1e",
    "order_id": "d268c619-d4ab-4773-ac9d-24cc874eaafa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "70cde7e5-d8cc-432d-b88a-5e7ca8326d30",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:46:46.672502Z",
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
  "session_id": "cc12a38c-e652-4011-8bd3-01ce69888bbd",
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
  "last_heartbeat_at": "2026-10-29T15:46:42.892613Z",
  "last_location_at": "2026-10-29T15:46:42.892613Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cc12a38c-e652-4011-8bd3-01ce69888bbd/close` → **200**

```json
{
  "command_id": "f37d23fb-59c7-4cda-9442-76b22a809414",
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
  "session_id": "dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9",
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
  "last_heartbeat_at": "2026-10-29T15:46:44.354964Z",
  "last_location_at": "2026-10-29T15:46:44.354964Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbcdfa5c-eb28-4c5d-bbd4-0a6a4bcd65a9/close` → **200**

```json
{
  "command_id": "a0bd5bbf-9ec4-4fcb-b5df-e27edce179d2",
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

# Scenario: feature-flags

## The admin looks at the feature flags

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
  "session_id": "f1d083d1-26ad-472a-9c80-38cf2da15f71",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MTAsImlhdCI6MTc5MzI4ODgxMCwianRpIjoiYjU1NTY0YzQtOGMwZS00Zjc5LTllMGMtM2MyYTg1ZGFiYjJkIiwic2lkIjoiZjFkMDgzZDEtMjZhZC00NzJhLTljODAtMzhjZjJkYTE1ZjcxIn0.mELQ3rplHHgVuXS0GD_dsBW2VSjxCfV8L3gUtY1chPw",
  "access_expires_at": "2026-10-29T16:01:50.30907497Z",
  "refresh_token": "oQmThEWFzfifL7EsQMESYJz_L-PibS_FeH2KPHc4-34",
  "refresh_expires_at": "2026-10-30T03:46:50.308487566Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 0,
      "changed_by": null,
      "reason": null,
      "changed_at": null
    }
  ]
}
```

card-payments: {"enabled":true,"owner":"payments","review_by":"2027-06-30","version":0}

## Card payments are switched off for a provider incident

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "1ac02219-8057-48f4-a162-3035cbc16ee0",
  "expected_version": 0,
  "enabled": false,
  "reason": "Sandbox: provider incident"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": false,
  "version": 1,
  "changed_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T15:46:50.897137Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "3d389015-4adb-4b33-b908-0be8650a30fa",
  "expected_version": 0,
  "enabled": false,
  "reason": "An old version"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/card-payments/change",
  "status": 409,
  "title": "Version conflict",
  "type": "https://errors.blizz.taxi/version-conflict",
  "code": "VERSION_CONFLICT",
  "correlation_id": "c7aa5018-049a-468b-aa87-1b8725c8719c"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "9111b6bf-292b-43c1-9b6d-82c2ffec0e2c",
  "expected_version": 0,
  "enabled": false,
  "reason": "x"
}
```

```json
{
  "instance": "/api/admin/v1/feature-flags/no-such-flag/change",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "a315fbdc-589b-4a82-b41f-6ef241b604f9"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639787331",
  "device_ref": "sandbox-7315"
}
```

```json
{
  "challenge_id": "0d7c014b-11b4-4e72-b223-2cb3161401ed",
  "expires_at": "2026-10-29T15:51:51.775904482Z",
  "resend_available_at": "2026-10-29T15:46:52.775904482Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639787331` → **200**

```json
{
  "phone": "+380639787331",
  "audience": "CLIENT",
  "code": "790189",
  "sent_at": "2026-10-29T15:46:51.778711373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d7c014b-11b4-4e72-b223-2cb3161401ed",
  "code": "790189",
  "device_ref": "sandbox-7315"
}
```

```json
{
  "session_id": "0b362de6-7de1-4c2c-9260-958572486341",
  "subject": {
    "type": "CLIENT",
    "id": "7615f177-f4bc-45b3-bd7c-e164fd5cfbdd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjE1ZjE3Ny1mNGJjLTQ1YjMtYmQ3Yy1lMTY0ZmQ1Y2ZiZGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzEyLCJpYXQiOjE3OTMyODg4MTIsImp0aSI6ImJhZTQwM2MyLWY4MjgtNGU1NC04YmQyLTU1MWJiNGUxYTE3OCIsInNpZCI6IjBiMzYyZGU2LTdkZTEtNGMyYy05MjYwLTk1ODU3MjQ4NjM0MSJ9.JzgC2Xz7hMd79q2liINQ9MNWHUMW1M693CLDKmyEbVw",
  "access_expires_at": "2026-10-29T16:01:52.084085871Z",
  "refresh_token": "lxZy5DosWRfs7N_qEqBsqXN5tpmNonWtN48OGVtyNB0",
  "refresh_expires_at": "2026-11-28T15:46:52.083552901Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b416afd4-889a-4e6c-bf14-9115f073d601",
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
  "id": "39a90b3b-a272-44e6-87d6-5a46e5459ffe",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:52.384008Z",
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

`POST /api/rider/v1/orders` → **422**

```json
{
  "command_id": "b931b3dd-ff2c-4c56-82cf-5a69b6c43b11",
  "quote_id": "39a90b3b-a272-44e6-87d6-5a46e5459ffe",
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
  "payment_method": "CARD"
}
```

```json
{
  "instance": "/api/rider/v1/orders",
  "status": 422,
  "title": "Payment method not offered",
  "type": "https://errors.blizz.taxi/payment-method-not-offered",
  "code": "PAYMENT_METHOD_NOT_OFFERED",
  "correlation_id": "0b26b464-abac-4c50-a260-175ae592e7be"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fedb7efa-123a-418c-a017-548b7dcae895",
  "quote_id": "39a90b3b-a272-44e6-87d6-5a46e5459ffe",
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
  "id": "ffe67242-64a3-4221-877a-f41cc77ccde3",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7615f177-f4bc-45b3-bd7c-e164fd5cfbdd",
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
  "created_at": "2026-10-29T15:46:52.968673Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ffe67242-64a3-4221-877a-f41cc77ccde3/cancel` → **200**

```json
{
  "command_id": "dd6a58b3-ce35-4c36-b650-74bdbbc468d1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ffe67242-64a3-4221-877a-f41cc77ccde3",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "7615f177-f4bc-45b3-bd7c-e164fd5cfbdd",
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
  "created_at": "2026-10-29T15:46:52.968673Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "11eccadb-2796-4b8c-9593-f06b372fbd95",
  "expected_version": 1,
  "enabled": true,
  "reason": "Sandbox: incident over"
}
```

```json
{
  "key": "card-payments",
  "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
  "owner": "payments",
  "review_by": "2027-06-30",
  "default_enabled": true,
  "enabled": true,
  "version": 2,
  "changed_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T15:46:53.588679Z"
}
```

Done: a new card order refused while the flag was off; a cash order went through; the flag is on again.

`GET /api/admin/v1/feature-flags` → **200**

```json
{
  "flags": [
    {
      "key": "card-payments",
      "description": "New orders paid by a saved card. Off: new card orders are refused; orders already made are still paid as begun.",
      "owner": "payments",
      "review_by": "2027-06-30",
      "default_enabled": true,
      "enabled": true,
      "version": 2,
      "changed_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T15:46:53.588679Z"
    }
  ]
}
```

# Scenario: full-ride

## Start-up data for the apps

`GET /api/config/v1/bootstrap` → **200**

```json
{
  "settings_version": 2,
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
  "device_ref": "sandbox-4381"
}
```

```json
{
  "challenge_id": "3022abb3-1372-4493-8781-6bce9fde478c",
  "expires_at": "2026-10-29T15:51:54.470235758Z",
  "resend_available_at": "2026-10-29T15:46:55.470235758Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "256370",
  "sent_at": "2026-10-29T15:46:54.472962323Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3022abb3-1372-4493-8781-6bce9fde478c",
  "code": "256370",
  "device_ref": "sandbox-4381"
}
```

```json
{
  "session_id": "433dbb66-eb88-41fb-b1e8-2f339d37e5f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTcxNCwiaWF0IjoxNzkzMjg4ODE0LCJqdGkiOiIxY2U4OWJjNS02YzQ2LTRmODAtYTcyYi0yMjdjYTk1NmY0MmYiLCJzaWQiOiI0MzNkYmI2Ni1lYjg4LTQxZmItYjFlOC0yZjMzOWQzN2U1ZjMifQ.JbifwxovTaaQGwmqNKtcw4WsDwUGbFfhypAYLeIuKgg",
  "access_expires_at": "2026-10-29T16:01:54.78178758Z",
  "refresh_token": "lDe7HycZq_r5AJ9xL_OpFJHQrE-HvwK7DKRsF3P_bYs",
  "refresh_expires_at": "2026-11-28T15:46:54.78111115Z",
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
  "command_id": "3e3ebdb4-dd59-4b30-84fa-5f03133c995c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:46:55Z",
    "sequence": 1793288815343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:46:55.361315Z",
  "last_location_at": "2026-10-29T15:46:55.361315Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675289842",
  "device_ref": "sandbox-31801"
}
```

```json
{
  "challenge_id": "64606f78-fb7c-40b8-b006-dfa1e4a8ecdb",
  "expires_at": "2026-10-29T15:51:55.638113939Z",
  "resend_available_at": "2026-10-29T15:46:56.638113939Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675289842` → **200**

```json
{
  "phone": "+380675289842",
  "audience": "CLIENT",
  "code": "653543",
  "sent_at": "2026-10-29T15:46:55.640699313Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64606f78-fb7c-40b8-b006-dfa1e4a8ecdb",
  "code": "653543",
  "device_ref": "sandbox-31801"
}
```

```json
{
  "session_id": "9773d458-b94e-4e04-9bbc-0cc5b5b58ab7",
  "subject": {
    "type": "CLIENT",
    "id": "5bd530c5-822e-48f3-b1c9-c16cc862cf2c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YmQ1MzBjNS04MjJlLTQ4ZjMtYjFjOS1jMTZjYzg2MmNmMmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzE1LCJpYXQiOjE3OTMyODg4MTUsImp0aSI6IjQwOTU5ZGJlLWIxMjQtNDBjZi1hOWUzLTUwYmNlYTRmMjE5YyIsInNpZCI6Ijk3NzNkNDU4LWI5NGUtNGUwNC05YmJjLTBjYzViNWI1OGFiNyJ9.k8OmFMMPHlzBUsOnhzAqC-2G7k14PJP_AU74sqmqLMM",
  "access_expires_at": "2026-10-29T16:01:55.94409019Z",
  "refresh_token": "zBnCU6rfLkGjRN1HesYhYGrFdEBB8I05CkQwUsupPcM",
  "refresh_expires_at": "2026-11-28T15:46:55.943519981Z",
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
  "command_id": "be9ed825-91d7-4d07-83f7-96d4467fce2c",
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
  "id": "d91cd0b3-b573-4f3a-b716-88aa50963739",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:51:56.511366Z",
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
  "command_id": "0896de7b-4439-46d9-8118-82d585d9e81e",
  "platform": "ANDROID",
  "token": "sandbox-driver-f9612f2f-ae43-4768-80bd-6f174ad970c0"
}
```

```json
{
  "id": "f318e58d-cb04-4a99-834a-4b2fc7ac5295",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:46:56.8162Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1c9f774b-a707-4b44-97c7-d77a1fbff1e9",
  "platform": "ANDROID",
  "token": "sandbox-rider-6236b39f-ebe5-4b19-b280-e865fb6dabdc"
}
```

```json
{
  "id": "2938cfa2-aa01-4731-bfba-9349779c208d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:46:57.10094Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5c0f6751-7eab-4102-96ec-25bef3149d96",
  "quote_id": "d91cd0b3-b573-4f3a-b716-88aa50963739",
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
  "id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5bd530c5-822e-48f3-b1c9-c16cc862cf2c",
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
  "created_at": "2026-10-29T15:46:57.392093Z",
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
    "id": "6c8400bb-b7fe-446b-9ea4-659bc664bbd4",
    "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
    "expires_at": "2026-10-29T15:47:12.395266Z",
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

`POST /api/driver/v1/offers/6c8400bb-b7fe-446b-9ea4-659bc664bbd4/accept` → **200**

```json
{
  "command_id": "f0e9adc1-2118-40c7-a6f6-fc3c1d41c709"
}
```

```json
{
  "id": "f93a9908-ba0c-4847-b316-396657a2642f",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:46:57.368Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:46:57.368Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:46:58.286386422Z",
    "token_suffix": "d970c0",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
      "order_version": "2",
      "event_id": "3e598a6a-12bf-4d6f-ba7e-0caf1774abcb",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380675289842&after=2026-10-29T15:46:57.368Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:46:58.289272976Z",
    "token_suffix": "6dabdc",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
      "order_version": "3",
      "event_id": "b89c2ba6-b7f1-4d37-b5e1-9231f31a885c",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/d69e302e-287a-440d-b59d-2d59e30368bb/messages` → **201**

```json
{
  "command_id": "042ccd9c-17e6-4667-9df4-7a447a2716f2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "9ed5550c-8b69-4810-849d-e58aab07513d",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T15:46:59.357946291Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "assignment_id": "f93a9908-ba0c-4847-b316-396657a2642f",
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

`POST /api/driver/v1/trips/c7e9e511-d15f-4356-a745-1a041a44c4c1/messages` → **201**

```json
{
  "command_id": "2dacdea3-1876-4a9b-936d-63d3798e1241",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "4df7b8ee-28df-4edc-bbff-db13878b0043",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T15:46:59.909670617Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/d69e302e-287a-440d-b59d-2d59e30368bb/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/c7e9e511-d15f-4356-a745-1a041a44c4c1/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380675289842"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/7a4e6c35-41db-492c-a370-71328cce7c19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:00Z",
    "sequence": 1793288820740
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:00.758373Z",
  "last_location_at": "2026-10-29T15:47:00.758373Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "assignment_id": "f93a9908-ba0c-4847-b316-396657a2642f",
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

`POST /api/driver/v1/trips/c7e9e511-d15f-4356-a745-1a041a44c4c1/arrive` → **200**

```json
{
  "command_id": "523a8fbd-e8cb-454e-9cac-3dd7642248a8",
  "expected_version": 0
}
```

```json
{
  "id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "assignment_id": "f93a9908-ba0c-4847-b316-396657a2642f",
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
  "arrived_at": "2026-10-29T15:47:01.323968Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c7e9e511-d15f-4356-a745-1a041a44c4c1/start` → **200**

```json
{
  "command_id": "d707f451-0566-4024-8782-0e2b7bc3a979",
  "expected_version": 1
}
```

```json
{
  "id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "assignment_id": "f93a9908-ba0c-4847-b316-396657a2642f",
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
  "arrived_at": "2026-10-29T15:47:01.323968Z",
  "started_at": "2026-10-29T15:47:01.62534Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/7a4e6c35-41db-492c-a370-71328cce7c19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:01Z",
    "sequence": 1793288821907
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:01.926037Z",
  "last_location_at": "2026-10-29T15:47:01.926037Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/c7e9e511-d15f-4356-a745-1a041a44c4c1/complete` → **200**

```json
{
  "command_id": "664c8486-1539-45d5-880f-4c3890f174c8",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:47:02Z",
  "cash_received": true
}
```

```json
{
  "id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "assignment_id": "f93a9908-ba0c-4847-b316-396657a2642f",
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
  "arrived_at": "2026-10-29T15:47:01.323968Z",
  "started_at": "2026-10-29T15:47:01.62534Z",
  "completed_at": "2026-10-29T15:47:02.222191Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/d69e302e-287a-440d-b59d-2d59e30368bb` → **200**

```json
{
  "id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "5bd530c5-822e-48f3-b1c9-c16cc862cf2c",
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
    "id": "f93a9908-ba0c-4847-b316-396657a2642f",
    "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:46:57.392093Z",
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
    "id": "d69e302e-287a-440d-b59d-2d59e30368bb",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:46:57.392093Z",
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
    "id": "c7e9e511-d15f-4356-a745-1a041a44c4c1",
    "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
    "order_short_number": 13,
    "created_at": "2026-10-29T15:46:57.971577Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "26be506f-e824-4466-bf6c-1ea2e9121fd3",
    "order_id": "102ef466-dbe5-4318-a7e3-885d93f0a585",
    "order_short_number": 8,
    "created_at": "2026-10-29T15:45:49.066268Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "082f3899-2dcb-4637-b025-6cca47012778",
    "order_id": "cf118c48-0500-4161-9445-851fc7a82dff",
    "order_short_number": 3,
    "created_at": "2026-10-29T15:45:03.434765Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "f658382c-2eb1-490f-af7c-61e216fd7de9",
    "order_id": "fca54d03-d5e6-467b-9e4c-4664dd82a745",
    "order_short_number": 2,
    "created_at": "2026-10-29T15:44:41.787266Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "473481b0-6121-442a-be5f-f7d7d422ce78",
    "order_id": "563c5c81-3166-45cc-babf-03ac172b19df",
    "order_short_number": 1,
    "created_at": "2026-10-29T15:44:32.131517Z",
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
      "balance_minor": 5679,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-29&to=2026-10-29` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-29",
  "to": "2026-10-29",
  "days": [
    {
      "date": "2026-10-29",
      "figures": {
        "trips": 5,
        "fare_minor": 52585,
        "commission_minor": 7890,
        "driver_share_minor": 44695,
        "cash_minor": 39016,
        "cashless_minor": 13569,
        "tips_minor": 0,
        "bonuses_minor": 0,
        "top_ups_minor": 0,
        "transfers_in_minor": 0,
        "transfers_out_minor": 0,
        "adjustments_minor": 0,
        "net_minor": 5679
      }
    }
  ],
  "total": {
    "trips": 5,
    "fare_minor": 52585,
    "commission_minor": 7890,
    "driver_share_minor": 44695,
    "cash_minor": 39016,
    "cashless_minor": 13569,
    "tips_minor": 0,
    "bonuses_minor": 0,
    "top_ups_minor": 0,
    "transfers_in_minor": 0,
    "transfers_out_minor": 0,
    "adjustments_minor": 0,
    "net_minor": 5679
  },
  "balance_minor": 5679
}
```

## The rider leaves a 10 % tip in cash: it is only recorded

`GET /api/rider/v1/orders/d69e302e-287a-440d-b59d-2d59e30368bb/tip` → **200**

```json
{
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
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
  "available_until": "2026-10-30T15:47:02.222191Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/d69e302e-287a-440d-b59d-2d59e30368bb/tip` → **201**

```json
{
  "command_id": "b83013eb-d291-4bd1-8d95-4a5119edf906",
  "amount_minor": 1100
}
```

```json
{
  "id": "e38b21ef-8f91-4b1f-a40d-c373a556e42b",
  "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T15:47:07.242705Z"
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
  "session_id": "facda468-b4ba-456f-b191-a014a3c0e88e",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MjcsImlhdCI6MTc5MzI4ODgyNywianRpIjoiNzU2YTZlNWQtMTA5Ny00ZTU5LTg0YjItNWNlYzNjZjU1N2E5Iiwic2lkIjoiZmFjZGE0NjgtYjRiYS00NTZmLWIxOTEtYTAxNGEzYzBlODhlIn0.lGXyqNNvQ0CaFbZz92cEUPTR26oEUEgP6EKzvI6bZnA",
  "access_expires_at": "2026-10-29T16:02:07.813381455Z",
  "refresh_token": "417MMAt-kzCNOEQBP-gsDhmiOrtO_9AP4Udkl4sFJ_A",
  "refresh_expires_at": "2026-10-30T03:47:07.812829339Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-29&to=2026-10-29` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-29",
  "to": "2026-10-29",
  "days": [
    {
      "date": "2026-10-29",
      "counts": {
        "created": 13,
        "fulfilled": 8,
        "cancelled": 5,
        "unfulfilled": 0,
        "open": 0,
        "by_channel": {
          "APP": 12,
          "PHONE": 1
        },
        "by_payment": {
          "CARD": 2,
          "CASH": 11
        },
        "cancelled_by": {
          "STAFF": 1,
          "RIDER": 3,
          "DRIVER": 1
        }
      }
    }
  ],
  "total": {
    "created": 13,
    "fulfilled": 8,
    "cancelled": 5,
    "unfulfilled": 0,
    "open": 0,
    "by_channel": {
      "APP": 12,
      "PHONE": 1
    },
    "by_payment": {
      "CARD": 2,
      "CASH": 11
    },
    "cancelled_by": {
      "STAFF": 1,
      "RIDER": 3,
      "DRIVER": 1
    }
  },
  "cancellation_reasons": [
    {
      "cancelled_by": "RIDER",
      "code": "CHANGED_MIND",
      "count": 2
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
  "generated_at": "2026-10-29T15:47:08.088787561Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-29&to=2026-10-29` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-29",
  "to": "2026-10-29",
  "days": [
    {
      "date": "2026-10-29",
      "figures": {
        "trips": 8,
        "fares_minor": 101476,
        "service_rides_minor": 0,
        "commission_minor": 15225,
        "driver_share_minor": 86251,
        "discounts_minor": 1052,
        "bonuses_granted_minor": 0,
        "paid_by_card_minor": 32594,
        "paid_with_bonuses_minor": 18297,
        "collected_by_drivers_minor": 39016,
        "tips_minor": 5000,
        "rider_debt_change_minor": 10517
      }
    }
  ],
  "total": {
    "trips": 8,
    "fares_minor": 101476,
    "service_rides_minor": 0,
    "commission_minor": 15225,
    "driver_share_minor": 86251,
    "discounts_minor": 1052,
    "bonuses_granted_minor": 0,
    "paid_by_card_minor": 32594,
    "paid_with_bonuses_minor": 18297,
    "collected_by_drivers_minor": 39016,
    "tips_minor": 5000,
    "rider_debt_change_minor": 10517
  },
  "generated_at": "2026-10-29T15:47:08.382980597Z"
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
  "session_id": "1783b986-3466-465d-81d2-1c79e42c44c9",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MjgsImlhdCI6MTc5MzI4ODgyOCwianRpIjoiYzQ3MDBkOGItNzg2NS00NGZhLTkwM2QtNTU3MDBkZjA5MWRmIiwic2lkIjoiMTc4M2I5ODYtMzQ2Ni00NjVkLTgxZDItMWM3OWU0MmM0NGM5In0.2vumg9AM-YAUnlkhbUmuz7VJ7p0Al_ewpEPBWbCSczc",
  "access_expires_at": "2026-10-29T16:02:08.969968634Z",
  "refresh_token": "6wlmmjDcWGSAoxpuikYk9kYq9Ba4XgwBsCP0VeooEVU",
  "refresh_expires_at": "2026-10-30T03:47:08.969392914Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d69e302e-287a-440d-b59d-2d59e30368bb/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:46:57.392525Z",
      "actor": {
        "type": "CLIENT",
        "id": "5bd530c5-822e-48f3-b1c9-c16cc862cf2c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
        "quote_id": "d91cd0b3-b573-4f3a-b716-88aa50963739",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "0b3e5e54-0e98-4a81-bbc2-05165c9096ba"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:46:57.39445Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
        "attempt_id": "4e466de3-f86c-4bbf-93ec-71a54c505872",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "0b3e5e54-0e98-4a81-bbc2-05165c9096ba"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:46:57.397393Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "6c8400bb-b7fe-446b-9ea4-659bc664bbd4",
        "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "0b3e5e54-0e98-4a81-bbc2-05165c9096ba"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:46:57.973144Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "6c8400bb-b7fe-446b-9ea4-659bc664bbd4",
        "order_id": "d69e302e-287a-440d-b59d-2d59e30368bb",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f93a9908-ba0c-4847-b316-396657a2642f"
      },
      "correlation_id": "3a295db3-6ce9-4b17-98ff-cccce8a6d510"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T15:47:09.542736411Z",
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
      "last_location_at": "2026-10-29T15:47:01.926037Z",
      "order_id": null
    }
  ]
}
```

Done: order d69e302e-287a-440d-b59d-2d59e30368bb.

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
  "session_id": "9088d17e-e25e-4c46-9962-239d4ad71393",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MzAsImlhdCI6MTc5MzI4ODgzMCwianRpIjoiZjBmMDAxNmMtNmQ5Yy00ZTFjLWJjYWItYThlNDBmNDJmYWZmIiwic2lkIjoiOTA4OGQxN2UtZTI1ZS00YzQ2LTk5NjItMjM5ZDRhZDcxMzkzIn0.hwOIVi_bEnx9m8xaA76Y3dy0KSdFq8hk7osRSEY3JQU",
  "access_expires_at": "2026-10-29T16:02:10.144213565Z",
  "refresh_token": "CSBuZlJG2rmhHdpD0QiTx4jIcqEy1UiRwV1vA-ycsLA",
  "refresh_expires_at": "2026-10-30T03:47:10.143625297Z",
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
  "command_id": "16295611-6e43-432f-a6c9-e239bf13fe45",
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
  "timestamp": "2026-10-29T15:47:10.000+0000",
  "channel": {
    "id": "1730052000.576122305",
    "linkedid": "1730052000.576122305",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672769649"
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
  "timestamp": "2026-10-29T15:47:10.000+0000",
  "channel": {
    "id": "1730052000.576122305",
    "linkedid": "1730052000.576122305",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380672769649"
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
  "session_id": "949c1f1f-1815-4948-8e7c-531931c59bad",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3MzEsImlhdCI6MTc5MzI4ODgzMSwianRpIjoiMjc5NGYwNDAtYWU4OS00MDMzLTk2OGItYTRhNmJjZmJjYzM3Iiwic2lkIjoiOTQ5YzFmMWYtMTgxNS00OTQ4LThlN2MtNTMxOTMxYzU5YmFkIn0.fqb4-ll5dF-uN1mQYmQlS_hZpizmdtXljjjdYpAaufI",
  "access_expires_at": "2026-10-29T16:02:11.328760487Z",
  "refresh_token": "ATY50jE8Gn3eLfEYTIt0PsQXbIB4yNGFlQ9YxgE6uPw",
  "refresh_expires_at": "2026-10-30T03:47:11.328247474Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "8956d69f-a9a6-4e10-9bea-f587bccb9e4e",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380672769649",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:47:10Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/8956d69f-a9a6-4e10-9bea-f587bccb9e4e/answer` → **200**

```json
{
  "command_id": "3d59b4e9-b486-4623-a1c6-50761b6eaba7"
}
```

```json
{
  "id": "8956d69f-a9a6-4e10-9bea-f587bccb9e4e",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380672769649",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
  "order_ids": [],
  "started_at": "2026-10-29T15:47:10Z",
  "answered_at": "2026-10-29T15:47:11.917799Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.576122305",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a3b5d0a9-f5e6-447f-ab37-3e25e19ee3f7",
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
  "id": "3eb2d0b4-2962-4b78-8e39-d68eb8bb89a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:12.240134Z",
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
  "command_id": "473fb6f3-3d50-4d3b-8e86-910bc580d486",
  "quote_id": "3eb2d0b4-2962-4b78-8e39-d68eb8bb89a0",
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
    "phone": "+380672769649"
  },
  "call_id": "8956d69f-a9a6-4e10-9bea-f587bccb9e4e"
}
```

```json
{
  "id": "7924fbf1-e8a3-417b-8b52-5b6fe4985f38",
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
  "created_at": "2026-10-29T15:47:12.53788Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672769649"
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
    "id": "1730052000.576122305",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "8956d69f-a9a6-4e10-9bea-f587bccb9e4e",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380672769649",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [
        "7924fbf1-e8a3-417b-8b52-5b6fe4985f38"
      ],
      "started_at": "2026-10-29T15:47:10Z",
      "answered_at": "2026-10-29T15:47:11.917799Z",
      "ended_at": "2026-10-29T15:47:12.86131Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "7a6d47e1-da80-495b-b4b1-21b6181543d3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673411474",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "0392d253-d6a8-4a88-ba36-785edcc894c8",
      "order_ids": [],
      "started_at": "2026-10-29T15:44:49.886621Z",
      "answered_at": "2026-10-29T15:44:50.212809Z",
      "ended_at": "2026-10-29T15:44:50.52486Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:44:58.726426Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/7924fbf1-e8a3-417b-8b52-5b6fe4985f38` → **200**

```json
{
  "id": "7924fbf1-e8a3-417b-8b52-5b6fe4985f38",
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
  "created_at": "2026-10-29T15:47:12.53788Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672769649"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/7924fbf1-e8a3-417b-8b52-5b6fe4985f38` → **200**

```json
{
  "id": "7924fbf1-e8a3-417b-8b52-5b6fe4985f38",
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
  "created_at": "2026-10-29T15:47:12.53788Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672769649"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/7924fbf1-e8a3-417b-8b52-5b6fe4985f38/cancel` → **200**

```json
{
  "command_id": "3bcb8230-c0e2-4143-825c-fff7571253ff",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "7924fbf1-e8a3-417b-8b52-5b6fe4985f38",
  "short_number": 14,
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
  "created_at": "2026-10-29T15:47:12.53788Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672769649"
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

Done: call 8956d69f-a9a6-4e10-9bea-f587bccb9e4e with order 7924fbf1-e8a3-417b-8b52-5b6fe4985f38.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-19436"
}
```

```json
{
  "challenge_id": "5108da86-7108-483e-a32f-7ec6915fd4a5",
  "expires_at": "2026-10-29T15:52:14.110178239Z",
  "resend_available_at": "2026-10-29T15:47:15.110178239Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "834871",
  "sent_at": "2026-10-29T15:47:14.112447411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5108da86-7108-483e-a32f-7ec6915fd4a5",
  "code": "834871",
  "device_ref": "sandbox-19436"
}
```

```json
{
  "session_id": "c82d4005-5f32-438b-b0fd-b16f29b7c9a6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTczNCwiaWF0IjoxNzkzMjg4ODM0LCJqdGkiOiJlNjE3MjQwYy1hNTYyLTRhNGEtOTYyMi1hMTAzZmIwNWU5NGEiLCJzaWQiOiJjODJkNDAwNS01ZjMyLTQzOGItYjBmZC1iMTZmMjliN2M5YTYifQ.WAxuKuF-rBrw3vvbV5x3WhaIOLwcJHB50ZJ-GtaEJ5M",
  "access_expires_at": "2026-10-29T16:02:14.41413441Z",
  "refresh_token": "vSboxAEZt0dWM3fzq5UGhxKXgmu2zx8PqK2-E7EcaWc",
  "refresh_expires_at": "2026-11-28T15:47:14.413564671Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:01.926037Z",
  "last_location_at": "2026-10-29T15:47:01.926037Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a4e6c35-41db-492c-a370-71328cce7c19/handover` → **200**

```json
{
  "command_id": "829c328a-db1f-4824-8887-2d8fd739575a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:01.926037Z",
  "last_location_at": "2026-10-29T15:47:01.926037Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7a4e6c35-41db-492c-a370-71328cce7c19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:15Z",
    "sequence": 1793288835248
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:15.266593Z",
  "last_location_at": "2026-10-29T15:47:15.266593Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662548277",
  "device_ref": "sandbox-23497"
}
```

```json
{
  "challenge_id": "3a9a9fd9-bb67-4eec-aad0-78fe2cc3be78",
  "expires_at": "2026-10-29T15:52:15.552427642Z",
  "resend_available_at": "2026-10-29T15:47:16.552427642Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662548277` → **200**

```json
{
  "phone": "+380662548277",
  "audience": "CLIENT",
  "code": "711847",
  "sent_at": "2026-10-29T15:47:15.554858156Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a9a9fd9-bb67-4eec-aad0-78fe2cc3be78",
  "code": "711847",
  "device_ref": "sandbox-23497"
}
```

```json
{
  "session_id": "31582826-7ee9-43e7-8678-b284aac292c8",
  "subject": {
    "type": "CLIENT",
    "id": "44f1cb60-df87-4029-a1bb-b31fd556bdef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGYxY2I2MC1kZjg3LTQwMjktYTFiYi1iMzFmZDU1NmJkZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5NzM1LCJpYXQiOjE3OTMyODg4MzUsImp0aSI6ImQyNGRmMmMwLWIzMDctNDM3OS1hYThiLWUyNDkxNWIyZjQ4MCIsInNpZCI6IjMxNTgyODI2LTdlZTktNDNlNy04Njc4LWIyODRhYWMyOTJjOCJ9.EMmTyTf3k_0lSFHqmhHNcqjWUye3HJEoBCxqRONk6bM",
  "access_expires_at": "2026-10-29T16:02:15.85547036Z",
  "refresh_token": "WewSyQOg0T8i3wLrQy0j7aFmHh2WysoPikL5n89Wt_k",
  "refresh_expires_at": "2026-11-28T15:47:15.85482534Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f125dc3b-2eb9-410c-9ca2-046f978ba162",
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
  "id": "ba8b4c58-e207-45e0-9d8b-d41edfd6f983",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:52:16.140832Z",
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
  "command_id": "e8c04468-c0d2-4000-b67c-2b257c5c2a86",
  "quote_id": "ba8b4c58-e207-45e0-9d8b-d41edfd6f983",
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
  "id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "44f1cb60-df87-4029-a1bb-b31fd556bdef",
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
  "created_at": "2026-10-29T15:47:16.437654Z",
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
    "id": "4a09d88b-4e80-4053-a3c3-cf7c84492c04",
    "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
    "expires_at": "2026-10-29T15:47:31.4407Z",
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

`POST /api/driver/v1/offers/4a09d88b-4e80-4053-a3c3-cf7c84492c04/accept` → **200**

```json
{
  "command_id": "1793e522-9b48-4148-bc1a-39352f00489b"
}
```

```json
{
  "id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461",
  "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70f94f10-af84-475a-96f8-341c79693921",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70f94f10-af84-475a-96f8-341c79693921",
  "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
  "assignment_id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461",
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

`POST /api/driver/v1/work-sessions/7a4e6c35-41db-492c-a370-71328cce7c19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:17Z",
    "sequence": 1793288837567
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:17.584846Z",
  "last_location_at": "2026-10-29T15:47:17.584846Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/70f94f10-af84-475a-96f8-341c79693921/arrive` → **200**

```json
{
  "command_id": "253796d0-6492-48c2-af02-5dcdec58ecfd",
  "expected_version": 0
}
```

```json
{
  "id": "70f94f10-af84-475a-96f8-341c79693921",
  "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
  "assignment_id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461",
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
  "arrived_at": "2026-10-29T15:47:17.894547Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/70f94f10-af84-475a-96f8-341c79693921/start` → **200**

```json
{
  "command_id": "7af847c1-c546-4d99-8ce5-68fd0a9529c8",
  "expected_version": 1
}
```

```json
{
  "id": "70f94f10-af84-475a-96f8-341c79693921",
  "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
  "assignment_id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461",
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
  "arrived_at": "2026-10-29T15:47:17.894547Z",
  "started_at": "2026-10-29T15:47:18.213464Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/7a4e6c35-41db-492c-a370-71328cce7c19/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:18Z",
    "sequence": 1793288838504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:18.522457Z",
  "last_location_at": "2026-10-29T15:47:18.522457Z",
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
  "device_ref": "sandbox-19317"
}
```

```json
{
  "challenge_id": "a42f0a76-442e-4803-ab0f-2ce5fbdf4fc4",
  "expires_at": "2026-10-29T15:52:18.805212338Z",
  "resend_available_at": "2026-10-29T15:47:19.805212338Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "726919",
  "sent_at": "2026-10-29T15:47:18.808048035Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a42f0a76-442e-4803-ab0f-2ce5fbdf4fc4",
  "code": "726919",
  "device_ref": "sandbox-19317"
}
```

```json
{
  "session_id": "5ef590c5-f387-42d2-adce-bd217627d22a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTczOSwiaWF0IjoxNzkzMjg4ODM5LCJqdGkiOiJkM2VlYzU4Zi05ZTQ3LTRmNzktYmExYy00ZTQ3M2Y5MTY2NWYiLCJzaWQiOiI1ZWY1OTBjNS1mMzg3LTQyZDItYWRjZS1iZDIxNzYyN2QyMmEifQ.1doFw1Qgzhe2au4WYpP1Bxh3zKQglc_fJrVzOKa3AbY",
  "access_expires_at": "2026-10-29T16:02:19.126571997Z",
  "refresh_token": "Y7sMcaXc1vtZ7mRt7kYEQylCT6PkDKMKNNDe00ZAgnA",
  "refresh_expires_at": "2026-11-28T15:47:19.125953256Z",
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
  "command_id": "f1d13312-36c0-44bc-b73d-6912a14459b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:19Z",
    "sequence": 1793288839673
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "65078ee0-c0f6-4649-a80b-31d63d165f64",
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
  "last_heartbeat_at": "2026-10-29T15:47:19.692217Z",
  "last_location_at": "2026-10-29T15:47:19.692217Z",
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
  "session_id": "e0d49bd7-e613-48c4-8617-2a79b900f43f",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3NDAsImlhdCI6MTc5MzI4ODg0MCwianRpIjoiMGI1MjZiODYtOGRjMi00MjNiLTkzODQtODgyZTZhYjQyNTIwIiwic2lkIjoiZTBkNDliZDctZTYxMy00OGM0LTg2MTctMmE3OWI5MDBmNDNmIn0.EFzIImDgwA-bQ-BTpvNy9lHrnwHfA5K_aEVkQDy_Fmg",
  "access_expires_at": "2026-10-29T16:02:20.290459022Z",
  "refresh_token": "ygF3UydWYL13NzT1Wy5dujgcJOEH9Z7lia7DSP2hBpw",
  "refresh_expires_at": "2026-10-30T03:47:20.28976551Z",
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
  "session_id": "4f216943-148a-4ae4-8f7d-05a546c2e823",
  "subject": {
    "type": "STAFF",
    "id": "0392d253-d6a8-4a88-ba36-785edcc894c8"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzkyZDI1My1kNmE4LTRhODgtYmEzNi03ODVlZGNjODk0YzgiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODk3NDAsImlhdCI6MTc5MzI4ODg0MCwianRpIjoiZmVhMmI5NTQtZmRlMi00YmY1LTlmNjctMzdkNDAyNDU2MWQwIiwic2lkIjoiNGYyMTY5NDMtMTQ4YS00YWU0LThmN2QtMDVhNTQ2YzJlODIzIn0.sS_p43ZqOXgpzBX887UaOGesjLxqA2XYXgrcTSR-d5Y",
  "access_expires_at": "2026-10-29T16:02:20.881064602Z",
  "refresh_token": "ehYPxvkPYJdCQjuDxvdKZ8pnfpiA5GDT4Vb2yCqLqXA",
  "refresh_expires_at": "2026-10-30T03:47:20.880426164Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e7207187-d6b2-4b21-b2f6-aa87644bbe1c` → **200**

```json
{
  "id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "44f1cb60-df87-4029-a1bb-b31fd556bdef",
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
    "id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461",
    "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "70f94f10-af84-475a-96f8-341c79693921",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T15:47:16.437654Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e7207187-d6b2-4b21-b2f6-aa87644bbe1c/interrupt` → **200**

```json
{
  "command_id": "ef52d978-8bba-4f40-be27-dd5e02e43ff2",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "44f1cb60-df87-4029-a1bb-b31fd556bdef",
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
      "id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461",
      "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "70f94f10-af84-475a-96f8-341c79693921",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T15:47:16.437654Z",
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
    "id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "44f1cb60-df87-4029-a1bb-b31fd556bdef",
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
    "id": "eb95b0c1-ee86-46d5-a338-f0d69da650bd",
    "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
    "expires_at": "2026-10-29T15:47:36.487336Z",
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

`POST /api/driver/v1/offers/eb95b0c1-ee86-46d5-a338-f0d69da650bd/accept` → **200**

```json
{
  "command_id": "a2aa8ca1-c54d-4a13-b3d7-22d6e6f4bc3b"
}
```

```json
{
  "id": "0008a040-3194-4536-a0f8-984d6dcbf5ac",
  "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "beab07a2-6829-4628-ba20-86fa57f74705",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "beab07a2-6829-4628-ba20-86fa57f74705",
  "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
  "assignment_id": "0008a040-3194-4536-a0f8-984d6dcbf5ac",
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
  "session_id": "65078ee0-c0f6-4649-a80b-31d63d165f64",
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
  "last_heartbeat_at": "2026-10-29T15:47:19.692217Z",
  "last_location_at": "2026-10-29T15:47:19.692217Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/65078ee0-c0f6-4649-a80b-31d63d165f64/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:47:22Z",
    "sequence": 1793288842944
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "65078ee0-c0f6-4649-a80b-31d63d165f64",
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
  "last_heartbeat_at": "2026-10-29T15:47:22.96222Z",
  "last_location_at": "2026-10-29T15:47:22.96222Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/beab07a2-6829-4628-ba20-86fa57f74705/arrive` → **200**

```json
{
  "command_id": "ee026a3d-3d83-4059-b81f-a5a64c54a041",
  "expected_version": 0
}
```

```json
{
  "id": "beab07a2-6829-4628-ba20-86fa57f74705",
  "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
  "assignment_id": "0008a040-3194-4536-a0f8-984d6dcbf5ac",
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
  "arrived_at": "2026-10-29T15:47:23.257795Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/beab07a2-6829-4628-ba20-86fa57f74705/start` → **200**

```json
{
  "command_id": "5e0ac396-519f-4d94-929c-9ac11efbde52",
  "expected_version": 1
}
```

```json
{
  "id": "beab07a2-6829-4628-ba20-86fa57f74705",
  "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
  "assignment_id": "0008a040-3194-4536-a0f8-984d6dcbf5ac",
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
  "arrived_at": "2026-10-29T15:47:23.257795Z",
  "started_at": "2026-10-29T15:47:23.550778Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/beab07a2-6829-4628-ba20-86fa57f74705/complete` → **200**

```json
{
  "command_id": "03d514f5-634d-465d-89f3-9af6afff8fd1",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:47:23Z"
}
```

```json
{
  "id": "beab07a2-6829-4628-ba20-86fa57f74705",
  "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
  "assignment_id": "0008a040-3194-4536-a0f8-984d6dcbf5ac",
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
  "arrived_at": "2026-10-29T15:47:23.257795Z",
  "started_at": "2026-10-29T15:47:23.550778Z",
  "completed_at": "2026-10-29T15:47:23.848386Z",
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
    "id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:47:21.477741Z",
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
    "id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:47:16.437654Z",
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

`GET /api/operator/v1/orders/e7207187-d6b2-4b21-b2f6-aa87644bbe1c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:47:16.438189Z",
      "actor": {
        "type": "CLIENT",
        "id": "44f1cb60-df87-4029-a1bb-b31fd556bdef",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
        "quote_id": "ba8b4c58-e207-45e0-9d8b-d41edfd6f983",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "5b6f47dd-9625-4abc-a94a-2b8f677e507e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:47:16.44001Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
        "attempt_id": "9c91439f-2662-40d9-ac22-11190291150b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5b6f47dd-9625-4abc-a94a-2b8f677e507e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:47:16.442683Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "4a09d88b-4e80-4053-a3c3-cf7c84492c04",
        "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "5b6f47dd-9625-4abc-a94a-2b8f677e507e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:47:17.00902Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "4a09d88b-4e80-4053-a3c3-cf7c84492c04",
        "order_id": "e7207187-d6b2-4b21-b2f6-aa87644bbe1c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "efb7bf1c-5ff6-4a5a-a804-e386e200b461"
      },
      "correlation_id": "b806ee57-424d-497b-bec3-f3923e308b03"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495/tip` → **200**

```json
{
  "order_id": "2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495",
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
  "available_until": "2026-10-30T15:47:23.848386Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495/tip` → **409**

```json
{
  "command_id": "b7d667fb-f072-42c1-a3e6-abbe2d1e973f",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "ced5bb1a-b453-4962-abcf-61602fa4ef84"
}
```

Done: interrupted e7207187-d6b2-4b21-b2f6-aa87644bbe1c, follow-up 2dd77c7a-4a28-494d-bfd5-ca1a2fa6d495.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "7a4e6c35-41db-492c-a370-71328cce7c19",
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
  "last_heartbeat_at": "2026-10-29T15:47:18.522457Z",
  "last_location_at": "2026-10-29T15:47:18.522457Z",
  "eligible": true,
  "ineligible_reasons": []
}
```
