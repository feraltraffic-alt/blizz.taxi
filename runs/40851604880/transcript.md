# Sandbox transcript (2026-10-29T09:42:25Z, 0fa5761)

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
  "correlation_id": "652f7ac6-ac25-4bf7-8928-fb76e73ebd07"
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
  "session_id": "d00015eb-c844-4ede-918c-a21b10791070",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4NTUsImlhdCI6MTc5MzI2Njk1NSwianRpIjoiYTk1NDAzYmMtOWZjZC00MjIwLTk1MjktMTRhOGRjZmIxMmUyIiwic2lkIjoiZDAwMDE1ZWItYzg0NC00ZWRlLTkxOGMtYTIxYjEwNzkxMDcwIn0.d0FVAzpa4zKSplRY_ftq1LyxAJVBpoPN0iSUvLcW0TU",
  "access_expires_at": "2026-10-29T09:57:35.010654592Z",
  "refresh_token": "Kqpb9WAXn03ecmQb2KnQW-2Y88ZhWiVDXK4m3_-DVkE",
  "refresh_expires_at": "2026-10-29T21:42:35.008492497Z",
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
  "session_id": "be098fd0-a7ea-48db-8048-55be19039daf",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4NTYsImlhdCI6MTc5MzI2Njk1NiwianRpIjoiNGIwNDQ5Y2QtOTI0Ny00MDYyLThhYzItNzlmYzA4ODg5N2IxIiwic2lkIjoiYmUwOThmZDAtYTdlYS00OGRiLTgwNDgtNTViZTE5MDM5ZGFmIn0.H3LEp8BjYBl5t429kSpa84NKVORM8Q4VXB9A_eozep4",
  "access_expires_at": "2026-10-29T09:57:36.539395477Z",
  "refresh_token": "EOpLtXHMB7SbHuiiuf63_1rhECJ8nxa5KqiwpC0r1aE",
  "refresh_expires_at": "2026-10-29T21:42:36.538443126Z",
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
  "device_ref": "sandbox-16090"
}
```

```json
{
  "challenge_id": "8b3f8e25-6fe8-4255-b699-283b3b97d30c",
  "expires_at": "2026-10-29T09:47:37.137631604Z",
  "resend_available_at": "2026-10-29T09:42:38.137631604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "365666",
  "sent_at": "2026-10-29T09:42:37.148900393Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8b3f8e25-6fe8-4255-b699-283b3b97d30c",
  "code": "365666",
  "device_ref": "sandbox-16090"
}
```

```json
{
  "session_id": "1899833d-a803-40ef-869c-f021abbd0b4c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzg1NywiaWF0IjoxNzkzMjY2OTU3LCJqdGkiOiI2Y2FmYmE0Yy0xM2RhLTRhNGMtYTViMy03YjcyOTU1M2NkM2MiLCJzaWQiOiIxODk5ODMzZC1hODAzLTQwZWYtODY5Yy1mMDIxYWJiZDBiNGMifQ.-P0zPEBLrHhcmStUVraocjwXiAAJy1UbxNJxF3DjLCw",
  "access_expires_at": "2026-10-29T09:57:37.483348958Z",
  "refresh_token": "m2r5uDaFc5O6QzGYWD1fa15DxJkXaI_W2_TlrzlRuP8",
  "refresh_expires_at": "2026-11-28T09:42:37.482206945Z",
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
  "command_id": "8b898979-7c41-4bb8-8ec5-7d27e926f823",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:42:38Z",
    "sequence": 1793266958463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5cd6e20c-9db6-4760-b56f-a091c5228d3e",
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
  "last_heartbeat_at": "2026-10-29T09:42:38.193012Z",
  "last_location_at": "2026-10-29T09:42:38.193012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634036676",
  "device_ref": "sandbox-17286"
}
```

```json
{
  "challenge_id": "a03b52b5-3da3-44eb-976d-f80419fa223b",
  "expires_at": "2026-10-29T09:47:38.48563844Z",
  "resend_available_at": "2026-10-29T09:42:39.48563844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634036676` → **200**

```json
{
  "phone": "+380634036676",
  "audience": "CLIENT",
  "code": "659074",
  "sent_at": "2026-10-29T09:42:38.490534004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a03b52b5-3da3-44eb-976d-f80419fa223b",
  "code": "659074",
  "device_ref": "sandbox-17286"
}
```

```json
{
  "session_id": "98867412-464f-4083-a638-ab6706bc6922",
  "subject": {
    "type": "CLIENT",
    "id": "9fdbb91d-ffbc-4c37-93c6-2ea4db6073e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZmRiYjkxZC1mZmJjLTRjMzctOTNjNi0yZWE0ZGI2MDczZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3ODU4LCJpYXQiOjE3OTMyNjY5NTgsImp0aSI6IjhjOGIxZmE0LTBhZGItNDlmNi04NWZjLTA3NTU0ZTMxZTYzZCIsInNpZCI6Ijk4ODY3NDEyLTQ2NGYtNDA4My1hNjM4LWFiNjcwNmJjNjkyMiJ9.hG2zCN-5eOm37F0jFIqjCDN3c2oOLlIAF8qU-s3SDRo",
  "access_expires_at": "2026-10-29T09:57:38.802580482Z",
  "refresh_token": "5VR3HWukxsn2eCvGehkWbY19aJ_aVxlsfq3Cpommof4",
  "refresh_expires_at": "2026-11-28T09:42:38.801646061Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "56b4198e-995d-4191-b1ee-8a6dfafb7777",
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
  "id": "6db1c5c6-e7e8-4d07-8d41-587ce49d2fe3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:47:39.116020Z",
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
  "command_id": "60b31837-56c1-4346-bb00-e46c9f1b4d21",
  "quote_id": "6db1c5c6-e7e8-4d07-8d41-587ce49d2fe3",
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
  "id": "a6433619-a21c-4193-90d2-fa58f9de5563",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9fdbb91d-ffbc-4c37-93c6-2ea4db6073e1",
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
  "created_at": "2026-10-29T09:42:39.537713Z",
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
    "id": "63ed933c-54d9-441d-b437-0d71f4e5a4f4",
    "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
    "expires_at": "2026-10-29T09:42:54.546293Z",
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

`POST /api/driver/v1/offers/63ed933c-54d9-441d-b437-0d71f4e5a4f4/accept` → **200**

```json
{
  "command_id": "ee1c5e2b-12c6-4f6b-a3d1-a188f0233674"
}
```

```json
{
  "id": "55f6987d-fb10-43e6-ae09-1abd62f52549",
  "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3287d9ab-8dee-4a98-9469-d868d17fa6a0",
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
  "command_id": "4be56d76-2f26-46df-8525-7224b5a90397",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T09:42:40.794483316Z"
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
  "id": "3287d9ab-8dee-4a98-9469-d868d17fa6a0",
  "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
  "assignment_id": "55f6987d-fb10-43e6-ae09-1abd62f52549",
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

`POST /api/driver/v1/work-sessions/5cd6e20c-9db6-4760-b56f-a091c5228d3e/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:42:41Z",
    "sequence": 1793266961658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5cd6e20c-9db6-4760-b56f-a091c5228d3e",
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
  "last_heartbeat_at": "2026-10-29T09:42:41.683121Z",
  "last_location_at": "2026-10-29T09:42:41.683121Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3287d9ab-8dee-4a98-9469-d868d17fa6a0/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3d447a9c-a31c-432a-9a4f-bd2c57b6e0be",
  "expected_version": 0
}
```

```json
{
  "id": "3287d9ab-8dee-4a98-9469-d868d17fa6a0",
  "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
  "assignment_id": "55f6987d-fb10-43e6-ae09-1abd62f52549",
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
  "arrived_at": "2026-10-29T09:42:41.985133Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3287d9ab-8dee-4a98-9469-d868d17fa6a0/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "aaba0552-cfce-4499-beba-e771fa663ea3",
  "expected_version": 1
}
```

```json
{
  "id": "3287d9ab-8dee-4a98-9469-d868d17fa6a0",
  "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
  "assignment_id": "55f6987d-fb10-43e6-ae09-1abd62f52549",
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
  "arrived_at": "2026-10-29T09:42:41.985133Z",
  "started_at": "2026-10-29T09:42:42.289755Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3287d9ab-8dee-4a98-9469-d868d17fa6a0/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "58d9e54f-1cfc-410a-b698-e93a8668c154",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:42:42Z",
  "cash_received": true
}
```

```json
{
  "id": "3287d9ab-8dee-4a98-9469-d868d17fa6a0",
  "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
  "assignment_id": "55f6987d-fb10-43e6-ae09-1abd62f52549",
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
  "arrived_at": "2026-10-29T09:42:41.985133Z",
  "started_at": "2026-10-29T09:42:42.289755Z",
  "completed_at": "2026-10-29T09:42:42.599785Z",
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
  "session_id": "5cd6e20c-9db6-4760-b56f-a091c5228d3e",
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
  "last_heartbeat_at": "2026-10-29T09:42:41.683121Z",
  "last_location_at": "2026-10-29T09:42:41.683121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5cd6e20c-9db6-4760-b56f-a091c5228d3e/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "abc6ed65-e72e-46a3-92f7-f8903d7edcde",
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
  "command_id": "649e907d-6859-428b-9e47-7d3048956452",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:42:43Z",
    "sequence": 1793266963498
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
  "correlation_id": "ff1dab07-3c02-4afb-bdaf-49f4d6df2f7e",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "a51079c4-1ec3-431f-9994-5417e22f6e81",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:42:43Z",
    "sequence": 1793266963799
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd5d024c-12a4-4843-bc1f-c1fa2de00db7",
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
  "last_heartbeat_at": "2026-10-29T09:42:43.82092Z",
  "last_location_at": "2026-10-29T09:42:43.82092Z",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T09:42:40.794483Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "89d87cc5-6f3a-4ebf-b267-909dbd772e9b",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T09:42:44.408803528Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd5d024c-12a4-4843-bc1f-c1fa2de00db7",
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
  "last_heartbeat_at": "2026-10-29T09:42:43.82092Z",
  "last_location_at": "2026-10-29T09:42:43.82092Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bd5d024c-12a4-4843-bc1f-c1fa2de00db7/close` → **200**

```json
{
  "command_id": "bca95f28-b713-4b2b-95b4-74b2aff27c82",
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
  "session_id": "a024a488-b14d-4465-b66c-308fe6c4eeae",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4NjUsImlhdCI6MTc5MzI2Njk2NSwianRpIjoiZjk5NjkyYzctNjQ2MS00NjZlLTkxMDAtY2MxMzlkYmJlOTE2Iiwic2lkIjoiYTAyNGE0ODgtYjE0ZC00NDY1LWI2NmMtMzA4ZmU2YzRlZWFlIn0.C9NEybzNM9XQsgi2ZE_V62NKS-jTLe4wmorCMHfUKPk",
  "access_expires_at": "2026-10-29T09:57:45.574871848Z",
  "refresh_token": "o251b3XKBU83EFEAv5rZ4ACbBcnoeR9i2sS4k1q9Yrs",
  "refresh_expires_at": "2026-10-29T21:42:45.57412904Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "37a8ec9a-6a49-4386-ac25-26d412a063d9",
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
  "id": "772faeac-ab48-4ed9-bea6-f965bd037794",
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
  "created_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "created_at": "2026-10-29T09:42:45.870591Z",
  "updated_at": "2026-10-29T09:42:45.870591Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637068582",
  "device_ref": "sandbox-31976"
}
```

```json
{
  "challenge_id": "a93a0d0b-259f-4a18-bf66-3e928b548822",
  "expires_at": "2026-10-29T09:47:46.153783688Z",
  "resend_available_at": "2026-10-29T09:42:47.153783688Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637068582` → **200**

```json
{
  "phone": "+380637068582",
  "audience": "CLIENT",
  "code": "767356",
  "sent_at": "2026-10-29T09:42:46.157942666Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a93a0d0b-259f-4a18-bf66-3e928b548822",
  "code": "767356",
  "device_ref": "sandbox-31976"
}
```

```json
{
  "session_id": "db7d15ae-d97a-4d65-b3f5-d75e6c82e987",
  "subject": {
    "type": "CLIENT",
    "id": "70b42073-fcde-4770-918c-9b1eee7411d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MGI0MjA3My1mY2RlLTQ3NzAtOTE4Yy05YjFlZWU3NDExZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3ODY2LCJpYXQiOjE3OTMyNjY5NjYsImp0aSI6IjYxMDY2N2U1LTA0YzktNGViZi1hZjg1LWU1NDEwNjAwNDhjMSIsInNpZCI6ImRiN2QxNWFlLWQ5N2EtNGQ2NS1iM2Y1LWQ3NWU2YzgyZTk4NyJ9.cjhNBBMmOO0O-1Ao4RMmAyLfVoJ9XsRKgehZmyMzs-w",
  "access_expires_at": "2026-10-29T09:57:46.455381028Z",
  "refresh_token": "L7sZIBr8EikTkIInZ2OrHPP_5DNqnhTbZnoK__u-NpQ",
  "refresh_expires_at": "2026-11-28T09:42:46.45451075Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637068582` → **200**

```json
{
  "client_id": "70b42073-fcde-4770-918c-9b1eee7411d9"
}
```

`POST /api/admin/v1/rider-wallets/70b42073-fcde-4770-918c-9b1eee7411d9/top-ups` → **201**

```json
{
  "command_id": "18728a89-09aa-4f0f-993c-eaacca00b261",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "70b42073-fcde-4770-918c-9b1eee7411d9",
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
      "id": "260b8801-b3e3-4d3d-a2bc-601a616c0919",
      "at": "2026-10-29T09:42:47.00425Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "765f3e2a-1784-44f8-ad2e-141987ca3e3d",
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
  "id": "29f63884-7a39-4a3b-a402-8771d58cac61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:47:47.323438Z",
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
      "id": "772faeac-ab48-4ed9-bea6-f965bd037794",
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
  "device_ref": "sandbox-4538"
}
```

```json
{
  "challenge_id": "bca9b775-41c7-4d54-965e-15783011d62a",
  "expires_at": "2026-10-29T09:47:47.618359618Z",
  "resend_available_at": "2026-10-29T09:42:48.618359618Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "693103",
  "sent_at": "2026-10-29T09:42:47.622415564Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bca9b775-41c7-4d54-965e-15783011d62a",
  "code": "693103",
  "device_ref": "sandbox-4538"
}
```

```json
{
  "session_id": "692e7619-2c4b-4d51-9721-7882d8bc1376",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzg2NywiaWF0IjoxNzkzMjY2OTY3LCJqdGkiOiJiM2Q4NTU3ZS1jNmFmLTQ5MWQtYTc2Mi0yOTMwNjQzYzMzMGEiLCJzaWQiOiI2OTJlNzYxOS0yYzRiLTRkNTEtOTcyMS03ODgyZDhiYzEzNzYifQ.5_ug97YipXia6SeUfmhEjhBnYCiFGmhWcFolCYdoCNE",
  "access_expires_at": "2026-10-29T09:57:47.927679502Z",
  "refresh_token": "g-0ELRWPARMg4Ewz8DP4x5u_dRyytzgNN2RlrylUKYs",
  "refresh_expires_at": "2026-11-28T09:42:47.926880948Z",
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
  "command_id": "c7306490-14c7-440b-8aca-0e69b6bbc76d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:42:48Z",
    "sequence": 1793266968457
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8615fbf1-a31d-4381-b6b1-b9f8a6a552e6",
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
  "last_heartbeat_at": "2026-10-29T09:42:48.478606Z",
  "last_location_at": "2026-10-29T09:42:48.478606Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "38580a7e-4ad4-4485-aa02-e77c023dfa20",
  "quote_id": "29f63884-7a39-4a3b-a402-8771d58cac61",
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
  "id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "70b42073-fcde-4770-918c-9b1eee7411d9",
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
  "created_at": "2026-10-29T09:42:48.767693Z",
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
  "client_id": "70b42073-fcde-4770-918c-9b1eee7411d9",
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
      "id": "260b8801-b3e3-4d3d-a2bc-601a616c0919",
      "at": "2026-10-29T09:42:47.00425Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
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
    "id": "f4fbb1ae-b4b8-441d-bd2a-d4b08fcf5467",
    "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
    "expires_at": "2026-10-29T09:43:03.775642Z",
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

`POST /api/driver/v1/offers/f4fbb1ae-b4b8-441d-bd2a-d4b08fcf5467/accept` → **200**

```json
{
  "command_id": "bba3e05a-76ab-4fd5-ba1a-ca456324c543"
}
```

```json
{
  "id": "901d3fdd-e086-4e99-8e93-9388f1a228da",
  "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bc7abcce-0a86-4ced-a64c-9b27720f078a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bc7abcce-0a86-4ced-a64c-9b27720f078a",
  "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
  "assignment_id": "901d3fdd-e086-4e99-8e93-9388f1a228da",
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

`POST /api/driver/v1/work-sessions/8615fbf1-a31d-4381-b6b1-b9f8a6a552e6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:42:50Z",
    "sequence": 1793266970174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8615fbf1-a31d-4381-b6b1-b9f8a6a552e6",
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
  "last_heartbeat_at": "2026-10-29T09:42:50.195921Z",
  "last_location_at": "2026-10-29T09:42:50.195921Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bc7abcce-0a86-4ced-a64c-9b27720f078a/arrive` → **200**

```json
{
  "command_id": "ca612f67-06e0-48e8-9ce6-5ad8b770e73b",
  "expected_version": 0
}
```

```json
{
  "id": "bc7abcce-0a86-4ced-a64c-9b27720f078a",
  "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
  "assignment_id": "901d3fdd-e086-4e99-8e93-9388f1a228da",
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
  "arrived_at": "2026-10-29T09:42:50.476743Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bc7abcce-0a86-4ced-a64c-9b27720f078a/start` → **200**

```json
{
  "command_id": "111891e9-a5f9-43a0-8456-ac9bcbd35e73",
  "expected_version": 1
}
```

```json
{
  "id": "bc7abcce-0a86-4ced-a64c-9b27720f078a",
  "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
  "assignment_id": "901d3fdd-e086-4e99-8e93-9388f1a228da",
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
  "arrived_at": "2026-10-29T09:42:50.476743Z",
  "started_at": "2026-10-29T09:42:50.774387Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/bc7abcce-0a86-4ced-a64c-9b27720f078a/complete` → **200**

```json
{
  "command_id": "b000dc49-1c6b-4659-90d7-a7759d759d4b",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:42:51Z",
  "cash_received": true
}
```

```json
{
  "id": "bc7abcce-0a86-4ced-a64c-9b27720f078a",
  "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
  "assignment_id": "901d3fdd-e086-4e99-8e93-9388f1a228da",
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
  "arrived_at": "2026-10-29T09:42:50.476743Z",
  "started_at": "2026-10-29T09:42:50.774387Z",
  "completed_at": "2026-10-29T09:42:51.090235Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "70b42073-fcde-4770-918c-9b1eee7411d9",
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
      "id": "d5d5405e-10ed-4c30-b145-c1542239d511",
      "at": "2026-10-29T09:42:51.888093Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4"
    },
    {
      "id": "260b8801-b3e3-4d3d-a2bc-601a616c0919",
      "at": "2026-10-29T09:42:47.00425Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/772faeac-ab48-4ed9-bea6-f965bd037794/archive` → **200**

```json
{
  "command_id": "ab6ff83b-66b5-4014-8c7e-182e2729c815",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "772faeac-ab48-4ed9-bea6-f965bd037794",
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
  "created_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "created_at": "2026-10-29T09:42:45.870591Z",
  "updated_at": "2026-10-29T09:42:54.703224Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "8615fbf1-a31d-4381-b6b1-b9f8a6a552e6",
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
  "last_heartbeat_at": "2026-10-29T09:42:50.195921Z",
  "last_location_at": "2026-10-29T09:42:50.195921Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8615fbf1-a31d-4381-b6b1-b9f8a6a552e6/close` → **200**

```json
{
  "command_id": "1343aba3-9650-46ac-b3ae-e970330cd287",
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

Done: order e1fb866b-2057-44dc-a732-a7fcf64cc4f4.

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
  "session_id": "bc46451c-5c6f-489f-a8e2-dbac7aa65e95",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4NzUsImlhdCI6MTc5MzI2Njk3NSwianRpIjoiOGU4N2E0MGItMTIxNC00NGQzLWE2ODMtMDRmMTU2NmYxMjMxIiwic2lkIjoiYmM0NjQ1MWMtNWM2Zi00ODlmLWE4ZTItZGJhYzdhYTY1ZTk1In0.1MtGZNFRogVen-74GsjSeMVa_AkoBNpnwZmncnF3Vqc",
  "access_expires_at": "2026-10-29T09:57:55.851090336Z",
  "refresh_token": "tJcMlFFcJKHYiMr0aIXd7VNNKpDM3iGcswOMpNs6a_8",
  "refresh_expires_at": "2026-10-29T21:42:55.85040283Z",
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
  "command_id": "0b28d41d-9551-49b8-abad-90b54ab24173",
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
  "session_id": "b8822574-4617-481f-ae6f-3f05adc21b4e",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4NzYsImlhdCI6MTc5MzI2Njk3NiwianRpIjoiNWMwZTQ4ODAtYmIzZS00NTBmLThmOWEtNWRjNThhMWVkYTY5Iiwic2lkIjoiYjg4MjI1NzQtNDYxNy00ODFmLWFlNmYtM2YwNWFkYzIxYjRlIn0.QywEifcs_BrTllZt3gaqpCukjFMr86aCzGo5irzog1U",
  "access_expires_at": "2026-10-29T09:57:56.996663579Z",
  "refresh_token": "_J9jrknHz53JzNMHJt9utDzoINdogngZNMOLIdsnXMo",
  "refresh_expires_at": "2026-10-29T21:42:56.995898305Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.3002017840",
    "linkedid": "1730052700.3002017840",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678069369"
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
    "id": "1730052700.3002017840",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "0be9e049-5668-4139-b766-618590d03a83",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.267438Z",
      "answered_at": null,
      "ended_at": "2026-10-29T09:42:57.293134Z",
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
    "id": "1730052600.1290923537",
    "linkedid": "1730052600.1290923537",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678069369"
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
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/a50fce79-1553-492c-86b8-eb104f8631d0/answer` → **200**

```json
{
  "command_id": "645a6eb7-5551-4bba-ba26-93c445409e4d"
}
```

```json
{
  "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678069369",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "order_ids": [],
  "started_at": "2026-10-29T09:42:57.610957Z",
  "answered_at": "2026-10-29T09:42:57.923906Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1290923537",
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
    "id": "1730052600.1290923537",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": "2026-10-29T09:42:57.923906Z",
      "ended_at": "2026-10-29T09:42:58.230233Z",
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
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": "2026-10-29T09:42:57.923906Z",
      "ended_at": "2026-10-29T09:42:58.230233Z",
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
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": "2026-10-29T09:42:57.923906Z",
      "ended_at": "2026-10-29T09:42:58.230233Z",
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
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": "2026-10-29T09:42:57.923906Z",
      "ended_at": "2026-10-29T09:42:58.230233Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:43:04.595303Z"
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
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": "2026-10-29T09:42:57.923906Z",
      "ended_at": "2026-10-29T09:42:58.230233Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:43:04.595303Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/a50fce79-1553-492c-86b8-eb104f8631d0/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/a50fce79-1553-492c-86b8-eb104f8631d0/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=a50fce79-1553-492c-86b8-eb104f8631d0` → **200**

```json
{
  "changes": [
    {
      "id": "84ce87d9-4d6a-499d-bdaa-5eed37d5d31e",
      "occurred_at": "2026-10-29T09:43:05.735931Z",
      "actor_type": "STAFF",
      "actor_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"6b86c640-81d2-4e8f-bd27-7f9207ce0b9c\", \"order_ids\": []}",
      "correlation_id": "d0b01025-5301-44d1-bbdd-973d277b7646"
    },
    {
      "id": "f0d716e4-c0be-45c7-b97d-083f77543633",
      "occurred_at": "2026-10-29T09:43:05.703584Z",
      "actor_type": "STAFF",
      "actor_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"6b86c640-81d2-4e8f-bd27-7f9207ce0b9c\", \"order_ids\": []}",
      "correlation_id": "689eba30-0d57-4f37-ba00-b5c78f14389e"
    }
  ]
}
```

Done: call a50fce79-1553-492c-86b8-eb104f8631d0 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14239"
}
```

```json
{
  "challenge_id": "883a3907-4cd4-4e2a-81f4-6ada4e6a899b",
  "expires_at": "2026-10-29T09:48:06.050244823Z",
  "resend_available_at": "2026-10-29T09:43:07.050244823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "447076",
  "sent_at": "2026-10-29T09:43:06.054500754Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "883a3907-4cd4-4e2a-81f4-6ada4e6a899b",
  "code": "447076",
  "device_ref": "sandbox-14239"
}
```

```json
{
  "session_id": "affd61f5-0ec3-4b1f-a9d9-1846d3cd7503",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzg4NiwiaWF0IjoxNzkzMjY2OTg2LCJqdGkiOiJkZTMzNjc5Ny00OGQwLTQ3NzgtYjFlOC03Mzc3NTQ5YmFmMzEiLCJzaWQiOiJhZmZkNjFmNS0wZWMzLTRiMWYtYTlkOS0xODQ2ZDNjZDc1MDMifQ.UopKNOHd30w7vdwmqXK6oYzF1g11-Rs2bFBFgUEAzCo",
  "access_expires_at": "2026-10-29T09:58:06.357350473Z",
  "refresh_token": "M5Z7gvq2lg-IANwLt82B_zasuweF7Lod_WGWfw_WL7g",
  "refresh_expires_at": "2026-11-28T09:43:06.356733489Z",
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
  "command_id": "3b0ce7a2-e8c7-422f-8038-1b318172da80",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:06Z",
    "sequence": 1793266986900
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "49b75a6e-9be1-4061-9011-6e99c458a111",
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
  "last_heartbeat_at": "2026-10-29T09:43:06.921174Z",
  "last_location_at": "2026-10-29T09:43:06.921174Z",
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
  "session_id": "a5f2dd12-2d99-442b-addb-c9d20add9d16",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4ODcsImlhdCI6MTc5MzI2Njk4NywianRpIjoiOTc3OWQyZTktZWRmOC00OGM3LWJlNjItZjMxMWQ1MzhmM2ZiIiwic2lkIjoiYTVmMmRkMTItMmQ5OS00NDJiLWFkZGItYzlkMjBhZGQ5ZDE2In0.EF4EnGNwbeThxyIDbjYJkh0KFUipbKm4OyKT0p-dxLo",
  "access_expires_at": "2026-10-29T09:58:07.503272482Z",
  "refresh_token": "HHq-b48Yw2W5JbRuRLiwgQ4YXcnDU0aK5jmFkyLxOWY",
  "refresh_expires_at": "2026-10-29T21:43:07.502690564Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9f5f0797-c490-4dec-914c-968ad85c1f7f",
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
  "id": "7bb67de9-fddd-4c3c-b360-d06e57670b6a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:07.785241Z",
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
  "command_id": "06579d47-3288-4660-a2e3-f095c78d4554",
  "quote_id": "7bb67de9-fddd-4c3c-b360-d06e57670b6a",
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
    "phone": "+380678905750"
  }
}
```

```json
{
  "id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
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
  "created_at": "2026-10-29T09:43:08.089747Z",
  "caller": {
    "name": "Олена",
    "phone": "+380678905750"
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
    "id": "64ea0582-3c52-4414-832f-443d319e7363",
    "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
    "expires_at": "2026-10-29T09:43:23.095309Z",
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

`POST /api/driver/v1/offers/64ea0582-3c52-4414-832f-443d319e7363/accept` → **200**

```json
{
  "command_id": "87455008-7121-418c-9467-59e9960001be"
}
```

```json
{
  "id": "1efb7adf-35ac-41a3-b6b2-1327d751f73d",
  "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b3540eee-5f58-4a5e-aff5-92cfc1811e31",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b3540eee-5f58-4a5e-aff5-92cfc1811e31",
  "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
  "assignment_id": "1efb7adf-35ac-41a3-b6b2-1327d751f73d",
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
    "phone": "+380678905750"
  }
}
```

`POST /api/driver/v1/work-sessions/49b75a6e-9be1-4061-9011-6e99c458a111/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:10Z",
    "sequence": 1793266990355
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "49b75a6e-9be1-4061-9011-6e99c458a111",
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
  "last_heartbeat_at": "2026-10-29T09:43:10.375264Z",
  "last_location_at": "2026-10-29T09:43:10.375264Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b3540eee-5f58-4a5e-aff5-92cfc1811e31/arrive` → **200**

```json
{
  "command_id": "92f69e3e-3e28-4833-8481-effc51aefa87",
  "expected_version": 0
}
```

```json
{
  "id": "b3540eee-5f58-4a5e-aff5-92cfc1811e31",
  "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
  "assignment_id": "1efb7adf-35ac-41a3-b6b2-1327d751f73d",
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
  "arrived_at": "2026-10-29T09:43:10.671783Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678905750"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  },
  {
    "phone": "+380678905750",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:11.794860373Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  },
  {
    "phone": "+380678905750",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:11.794860373Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380678905750` → **200**

```json
[
  {
    "phone": "+380678905750",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:09.787366495Z"
  },
  {
    "phone": "+380678905750",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T09:43:11.794860373Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/b3540eee-5f58-4a5e-aff5-92cfc1811e31/start` → **200**

```json
{
  "command_id": "0396bf8c-3577-4e28-84b1-8309d3b5d48a",
  "expected_version": 1
}
```

```json
{
  "id": "b3540eee-5f58-4a5e-aff5-92cfc1811e31",
  "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
  "assignment_id": "1efb7adf-35ac-41a3-b6b2-1327d751f73d",
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
  "arrived_at": "2026-10-29T09:43:10.671783Z",
  "started_at": "2026-10-29T09:43:12.072092Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380678905750"
  }
}
```

`POST /api/driver/v1/trips/b3540eee-5f58-4a5e-aff5-92cfc1811e31/complete` → **200**

```json
{
  "command_id": "59d50f3c-36de-40e3-b799-b3f65ce98654",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:43:12Z",
  "cash_received": true
}
```

```json
{
  "id": "b3540eee-5f58-4a5e-aff5-92cfc1811e31",
  "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
  "assignment_id": "1efb7adf-35ac-41a3-b6b2-1327d751f73d",
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
  "arrived_at": "2026-10-29T09:43:10.671783Z",
  "started_at": "2026-10-29T09:43:12.072092Z",
  "completed_at": "2026-10-29T09:43:12.372138Z",
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
  "session_id": "49b75a6e-9be1-4061-9011-6e99c458a111",
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
  "last_heartbeat_at": "2026-10-29T09:43:10.375264Z",
  "last_location_at": "2026-10-29T09:43:10.375264Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/49b75a6e-9be1-4061-9011-6e99c458a111/close` → **200**

```json
{
  "command_id": "03ccface-3c00-4673-9bb5-bff444080e1c",
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
  "phone": "+380636327908",
  "device_ref": "sandbox-7223"
}
```

```json
{
  "challenge_id": "886e1b8e-7348-4af4-9fa3-9c43fda3942b",
  "expires_at": "2026-10-29T09:48:13.237882839Z",
  "resend_available_at": "2026-10-29T09:43:14.237882839Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636327908` → **200**

```json
{
  "phone": "+380636327908",
  "audience": "CLIENT",
  "code": "950596",
  "sent_at": "2026-10-29T09:43:13.241599056Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "886e1b8e-7348-4af4-9fa3-9c43fda3942b",
  "code": "950596",
  "device_ref": "sandbox-7223"
}
```

```json
{
  "session_id": "c567fabf-a93a-4c66-95c0-21d838333933",
  "subject": {
    "type": "CLIENT",
    "id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjE5ZmJlZi1lYjkzLTRmMGItOWNhYy04YzkwZTM5N2QwYzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3ODkzLCJpYXQiOjE3OTMyNjY5OTMsImp0aSI6ImE3ODQ0YWNmLTAwZmMtNDZhZC1iZGMyLTkzNzQ0NTg1NmRkMCIsInNpZCI6ImM1NjdmYWJmLWE5M2EtNGM2Ni05NWMwLTIxZDgzODMzMzkzMyJ9.7PxnpFT6V0TqG9moeFwDmy7CJ2XbeuueYekfRlDRf_g",
  "access_expires_at": "2026-10-29T09:58:13.537805332Z",
  "refresh_token": "9YSAtfxDisVFVPUMGj3nm_1In-gWex6086HjOhObyTY",
  "refresh_expires_at": "2026-11-28T09:43:13.537201468Z",
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
  "device_ref": "sandbox-23916"
}
```

```json
{
  "challenge_id": "1222169d-269a-4ab5-8e98-77facf7923df",
  "expires_at": "2026-10-29T09:48:14.088176283Z",
  "resend_available_at": "2026-10-29T09:43:15.088176283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "898390",
  "sent_at": "2026-10-29T09:43:14.091709314Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1222169d-269a-4ab5-8e98-77facf7923df",
  "code": "898390",
  "device_ref": "sandbox-23916"
}
```

```json
{
  "session_id": "a824d8e9-fd17-45bc-9f88-c73285f65915",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzg5NCwiaWF0IjoxNzkzMjY2OTk0LCJqdGkiOiI2NGJiMWRkOS1jZjhkLTQ3N2MtOTIxNS0xZWMzNzc1NTQ4YTUiLCJzaWQiOiJhODI0ZDhlOS1mZDE3LTQ1YmMtOWY4OC1jNzMyODVmNjU5MTUifQ.25GynXKJJHwn8NPsu_bdDdELQ0s-GseAl_2Huk83Tto",
  "access_expires_at": "2026-10-29T09:58:14.389331985Z",
  "refresh_token": "jxeBtvBd2jS-19cx9VQ9sWuVq7JsZGf8kyBPpgNSXxU",
  "refresh_expires_at": "2026-11-28T09:43:14.38867188Z",
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
  "session_id": "aca1d216-d606-457f-b87e-8d260a53ab3a",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4OTUsImlhdCI6MTc5MzI2Njk5NSwianRpIjoiYmE4NjI0MGUtZjBkYi00ZDA2LTgxMjktZjM4OWJkNDdhOTIyIiwic2lkIjoiYWNhMWQyMTYtZDYwNi00NTdmLWI4N2UtOGQyNjBhNTNhYjNhIn0.9N7G5MONS1fNehipBf-dzIvBgmTHLmjYs3nhUVhw4us",
  "access_expires_at": "2026-10-29T09:58:15.237935548Z",
  "refresh_token": "QNSySft0QC_PxDnZ8NptkNKN52WONwDNQHn0PZX1VdU",
  "refresh_expires_at": "2026-10-29T21:43:15.237305725Z",
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
  "session_id": "3a20426c-3c61-46c2-889c-2267b4743608",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc4OTUsImlhdCI6MTc5MzI2Njk5NSwianRpIjoiMjNhYWJkYmQtN2E0OC00MTU0LTllMjktZjg0ZmFmMWZiMGZlIiwic2lkIjoiM2EyMDQyNmMtM2M2MS00NmMyLTg4OWMtMjI2N2I0NzQzNjA4In0.mSB5vWK31_-rquh3B3jGaYTWzjWiaX0AZkea-3hGCTI",
  "access_expires_at": "2026-10-29T09:58:15.811729045Z",
  "refresh_token": "NJ-v3Z2E71Y9Om6zwyHGCW5jHgF5uFwtCeMMvTm2l-U",
  "refresh_expires_at": "2026-10-29T21:43:15.811193779Z",
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
  "command_id": "68aba890-fb1a-46d7-ad28-36132ce35ae1",
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
  "id": "a1ce6243-564a-4299-8f6c-4f838eef18df",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:16.363376Z",
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
  "command_id": "14bcd074-697e-42a1-8451-15919f538f92",
  "quote_id": "a1ce6243-564a-4299-8f6c-4f838eef18df",
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
  "id": "73820fc9-9099-47cf-bae1-feed2cce8a88",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4",
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
  "created_at": "2026-10-29T09:43:16.656605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/73820fc9-9099-47cf-bae1-feed2cce8a88` → **200**

```json
{
  "id": "73820fc9-9099-47cf-bae1-feed2cce8a88",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4",
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
  "created_at": "2026-10-29T09:43:16.656605Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/73820fc9-9099-47cf-bae1-feed2cce8a88/cancel` → **200**

```json
{
  "command_id": "6a5716ae-3ab1-468f-9246-e9beedc432cc",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "73820fc9-9099-47cf-bae1-feed2cce8a88",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4",
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
  "created_at": "2026-10-29T09:43:16.656605Z",
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
  "command_id": "99e85f03-a69b-47a3-84a7-62110289d151",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:17Z",
    "sequence": 1793266997819
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7754f8b0-9111-4cf6-854f-3df165521288",
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
  "last_heartbeat_at": "2026-10-29T09:43:17.838577Z",
  "last_location_at": "2026-10-29T09:43:17.838577Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-32396"
}
```

```json
{
  "challenge_id": "cb45a2c8-448e-4447-9f1c-74eba26baa0a",
  "expires_at": "2026-10-29T09:48:18.122634452Z",
  "resend_available_at": "2026-10-29T09:43:19.122634452Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "965811",
  "sent_at": "2026-10-29T09:43:18.126250663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cb45a2c8-448e-4447-9f1c-74eba26baa0a",
  "code": "965811",
  "device_ref": "sandbox-32396"
}
```

```json
{
  "session_id": "aca5240a-ab48-4cbd-8864-cd352411a627",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzg5OCwiaWF0IjoxNzkzMjY2OTk4LCJqdGkiOiIyZjVhODJmOS04ZmQ3LTRmOTgtOTA0Zi03YzVhMDJhMTkwZDMiLCJzaWQiOiJhY2E1MjQwYS1hYjQ4LTRjYmQtODg2NC1jZDM1MjQxMWE2MjcifQ.Hl9ORSAtFSZkAKYNwGBot5LKjze_6gqjSekY_n47q_M",
  "access_expires_at": "2026-10-29T09:58:18.427347889Z",
  "refresh_token": "KvVV564VNwLH55EReBIzp5vQXHwQ71ExOdj2Ujyv1GM",
  "refresh_expires_at": "2026-11-28T09:43:18.426675427Z",
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
  "command_id": "c61be8a1-1d39-4e03-a5f6-119824adc84a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:18Z",
    "sequence": 1793266998967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:18.988664Z",
  "last_location_at": "2026-10-29T09:43:18.988664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db3dc33c-3aa2-4013-bef5-d6a40e28a994",
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
  "id": "27462330-e00b-44d1-bd5a-5b30471ad742",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:19.277062Z",
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
  "command_id": "62e51ead-3989-451c-85a7-be0737a8b2fc",
  "quote_id": "27462330-e00b-44d1-bd5a-5b30471ad742",
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
  "id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4",
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
  "created_at": "2026-10-29T09:43:19.568073Z",
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
    "id": "48933064-549f-48e7-8271-8cd5e2800a6a",
    "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
    "expires_at": "2026-10-29T09:43:34.571983Z",
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

`POST /api/driver/v1/offers/48933064-549f-48e7-8271-8cd5e2800a6a/accept` → **200**

```json
{
  "command_id": "dcfed68d-4625-43aa-8f6f-5b11947ba1e3"
}
```

```json
{
  "id": "ffc56326-c3d5-4a46-9127-404f1a359a73",
  "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "74d028e8-c23b-48a9-93aa-6bd056470586",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "74d028e8-c23b-48a9-93aa-6bd056470586",
  "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "assignment_id": "ffc56326-c3d5-4a46-9127-404f1a359a73",
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

`POST /api/driver/v1/trips/74d028e8-c23b-48a9-93aa-6bd056470586/cancel` → **200**

```json
{
  "command_id": "bc1580c7-d264-4fc2-832e-cef4ad231264",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "74d028e8-c23b-48a9-93aa-6bd056470586",
  "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "assignment_id": "ffc56326-c3d5-4a46-9127-404f1a359a73",
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

`GET /api/rider/v1/orders/bd3b9eb9-73e0-4997-bc79-c14db08f7944` → **200**

```json
{
  "id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4",
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
    "id": "ffc56326-c3d5-4a46-9127-404f1a359a73",
    "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "74d028e8-c23b-48a9-93aa-6bd056470586",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:43:19.568073Z",
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
    "id": "9757b759-8e0c-4d11-892a-1ed0d213a0be",
    "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
    "expires_at": "2026-10-29T09:43:35.737665Z",
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

`POST /api/driver/v1/offers/9757b759-8e0c-4d11-892a-1ed0d213a0be/accept` → **200**

```json
{
  "command_id": "e06ada61-3afa-41c8-a320-d56f5f9af286"
}
```

```json
{
  "id": "551f3ec2-ac20-46a3-95ed-17cb1b7f5a64",
  "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "19d93f8c-acf5-4efc-b81b-50ae1b30d919",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "19d93f8c-acf5-4efc-b81b-50ae1b30d919",
  "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "assignment_id": "551f3ec2-ac20-46a3-95ed-17cb1b7f5a64",
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

`POST /api/driver/v1/trips/19d93f8c-acf5-4efc-b81b-50ae1b30d919/cancel` → **200**

```json
{
  "command_id": "8319ef88-4a3f-4925-ba3b-f5f8f3781b2a",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "19d93f8c-acf5-4efc-b81b-50ae1b30d919",
  "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
  "assignment_id": "551f3ec2-ac20-46a3-95ed-17cb1b7f5a64",
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
    "id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:43:19.568073Z",
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
    "id": "73820fc9-9099-47cf-bae1-feed2cce8a88",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:43:16.656605Z",
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

`GET /api/operator/v1/orders/bd3b9eb9-73e0-4997-bc79-c14db08f7944/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:43:19.568733Z",
      "actor": {
        "type": "CLIENT",
        "id": "1b19fbef-eb93-4f0b-9cac-8c90e397d0c4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
        "quote_id": "27462330-e00b-44d1-bd5a-5b30471ad742",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "4f79e9b6-8685-49bf-9532-912c0612156b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:43:19.571036Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
        "attempt_id": "22d6aab4-bef9-42a5-8646-bd163e416b90",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4f79e9b6-8685-49bf-9532-912c0612156b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:43:19.578114Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "48933064-549f-48e7-8271-8cd5e2800a6a",
        "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "4f79e9b6-8685-49bf-9532-912c0612156b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:43:20.170985Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "48933064-549f-48e7-8271-8cd5e2800a6a",
        "order_id": "bd3b9eb9-73e0-4997-bc79-c14db08f7944",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "ffc56326-c3d5-4a46-9127-404f1a359a73"
      },
      "correlation_id": "45be9057-56b5-45d3-bdc4-c2ed1ca6cfe8"
```

Done: orders 73820fc9-9099-47cf-bae1-feed2cce8a88, bd3b9eb9-73e0-4997-bc79-c14db08f7944.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380736994799",
  "device_ref": "sandbox-25732"
}
```

```json
{
  "challenge_id": "8e0a38ec-2117-4714-b62a-1bf2e464215a",
  "expires_at": "2026-10-29T09:48:23.02380108Z",
  "resend_available_at": "2026-10-29T09:43:24.02380108Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736994799` → **200**

```json
{
  "phone": "+380736994799",
  "audience": "CLIENT",
  "code": "493542",
  "sent_at": "2026-10-29T09:43:23.027343606Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8e0a38ec-2117-4714-b62a-1bf2e464215a",
  "code": "493542",
  "device_ref": "sandbox-25732"
}
```

```json
{
  "session_id": "773a0d60-0051-40be-a966-fbc15f3bcc8e",
  "subject": {
    "type": "CLIENT",
    "id": "b82cd45b-46cd-4b86-9b9d-0119006e346c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiODJjZDQ1Yi00NmNkLTRiODYtOWI5ZC0wMTE5MDA2ZTM0NmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTAzLCJpYXQiOjE3OTMyNjcwMDMsImp0aSI6ImQwYWVkMDgwLTllNWEtNDA2OS05MTNjLTYwYmZiYzNmYzlmYSIsInNpZCI6Ijc3M2EwZDYwLTAwNTEtNDBiZS1hOTY2LWZiYzE1ZjNiY2M4ZSJ9.jhtfpsHJRa7u8VRmYG0q1cdDux-ubWC0GUbYwxo-nJY",
  "access_expires_at": "2026-10-29T09:58:23.327120129Z",
  "refresh_token": "HJb8ungwSiEkKmAnBoyX96wME2XQUlyorYSxQcELXDw",
  "refresh_expires_at": "2026-11-28T09:43:23.32659103Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c10f139e-49ab-47e2-addd-1f03e0a29521",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c108823d-1b80-48ee-ba1a-d694c2a76776",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c108823d-1b80-48ee-ba1a-d694c2a76776",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1b5522662d9628c96381b10247ef40a0",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c108823d-1b80-48ee-ba1a-d694c2a76776",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736994799"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c108823d-1b80-48ee-ba1a-d694c2a76776",
  "expires_at": "2026-10-29T10:13:23.61212Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c108823d-1b80-48ee-ba1a-d694c2a76776` → **200**

```json
{
  "id": "c108823d-1b80-48ee-ba1a-d694c2a76776",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:13:23.61212Z",
  "card": {
    "id": "688f5f30-f686-473f-8c48-dc453302c54f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8220",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:43:23.908672Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "688f5f30-f686-473f-8c48-dc453302c54f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****8220",
      "card_type": "Visa",
      "created_at": "2026-10-29T09:43:23.908672Z"
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
  "device_ref": "sandbox-2776"
}
```

```json
{
  "challenge_id": "48de190e-0b97-4150-a935-bdfcf136a2b5",
  "expires_at": "2026-10-29T09:48:24.494462382Z",
  "resend_available_at": "2026-10-29T09:43:25.494462382Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "509116",
  "sent_at": "2026-10-29T09:43:24.497990872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48de190e-0b97-4150-a935-bdfcf136a2b5",
  "code": "509116",
  "device_ref": "sandbox-2776"
}
```

```json
{
  "session_id": "0e2d15b5-57da-476d-b2dc-e749576c39cd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzkwNCwiaWF0IjoxNzkzMjY3MDA0LCJqdGkiOiJmNjY0OTZiZC02N2UzLTQ1YmMtYWY2NC03MmUzZGY4ZmQ2NzIiLCJzaWQiOiIwZTJkMTViNS01N2RhLTQ3NmQtYjJkYy1lNzQ5NTc2YzM5Y2QifQ.xGfLwvMguV1k8D7HiBQ9T632tjq0IpNh70Z3vqGLWu4",
  "access_expires_at": "2026-10-29T09:58:24.804303296Z",
  "refresh_token": "uy70qDjhnNh3gThq1xTw40ZhhRNkqdNdF6hPTxriwDE",
  "refresh_expires_at": "2026-11-28T09:43:24.803645846Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:18.988664Z",
  "last_location_at": "2026-10-29T09:43:18.988664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/328c7044-73bd-45ea-ac7a-0aef05f3e4c3/handover` → **200**

```json
{
  "command_id": "b2125a25-626c-4b48-81ea-11537c157d29",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:18.988664Z",
  "last_location_at": "2026-10-29T09:43:18.988664Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/328c7044-73bd-45ea-ac7a-0aef05f3e4c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:25Z",
    "sequence": 1793267005658
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:25.678111Z",
  "last_location_at": "2026-10-29T09:43:25.678111Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8329f0de-623e-48c9-9aa4-9f8ebdc57788",
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
  "id": "9c912a65-7876-4c1f-90ec-1ed80ef267dd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:25.973007Z",
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
  "command_id": "882bfb0c-354d-499b-a8ed-6a33e96e7722",
  "quote_id": "9c912a65-7876-4c1f-90ec-1ed80ef267dd",
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
  "id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
  "created_at": "2026-10-29T09:43:26.275389Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33` → **200**

```json
{
  "id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
  "created_at": "2026-10-29T09:43:26.275389Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33` → **200**

```json
{
  "id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
  "created_at": "2026-10-29T09:43:26.275389Z",
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
    "id": "45550ad6-1410-440f-aac9-cf0b3a63a7b2",
    "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
    "expires_at": "2026-10-29T09:43:42.114451Z",
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

`POST /api/driver/v1/offers/45550ad6-1410-440f-aac9-cf0b3a63a7b2/accept` → **200**

```json
{
  "command_id": "5c5017fe-7bb6-449a-8393-fdf720d9bb79"
}
```

```json
{
  "id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "assignment_id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
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

`POST /api/driver/v1/work-sessions/328c7044-73bd-45ea-ac7a-0aef05f3e4c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:28Z",
    "sequence": 1793267008967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:28.98651Z",
  "last_location_at": "2026-10-29T09:43:28.98651Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9e2d2daa-075c-4cb3-996a-206ce6071071/arrive` → **200**

```json
{
  "command_id": "f97791af-f3a8-4e63-8d38-854da02a3366",
  "expected_version": 0
}
```

```json
{
  "id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "assignment_id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
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
  "arrived_at": "2026-10-29T09:43:29.270081Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e2d2daa-075c-4cb3-996a-206ce6071071/start` → **200**

```json
{
  "command_id": "5187869d-4e73-493c-96c7-f1de8086578b",
  "expected_version": 1
}
```

```json
{
  "id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "assignment_id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
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
  "arrived_at": "2026-10-29T09:43:29.270081Z",
  "started_at": "2026-10-29T09:43:29.554969Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9e2d2daa-075c-4cb3-996a-206ce6071071/complete` → **200**

```json
{
  "command_id": "5e0a5533-889f-4591-9707-42bdc2b7fe6e",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:43:29Z",
  "cash_received": true
}
```

```json
{
  "id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "assignment_id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
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
  "arrived_at": "2026-10-29T09:43:29.270081Z",
  "started_at": "2026-10-29T09:43:29.554969Z",
  "completed_at": "2026-10-29T09:43:29.845011Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33` → **200**

```json
{
  "id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
    "id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
    "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:43:26.275389Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33` → **200**

```json
{
  "id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
    "id": "81adce0d-9de6-4c9e-9f08-7b02afeac47b",
    "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "9e2d2daa-075c-4cb3-996a-206ce6071071",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:43:26.275389Z",
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

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33/tip` → **200**

```json
{
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
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
  "available_until": "2026-10-30T09:43:29.845011Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33/tip` → **201**

```json
{
  "command_id": "57dfe29b-5beb-493f-b893-c902a5defbd4",
  "amount_minor": 2500
}
```

```json
{
  "id": "f9b72654-1bba-4991-a6ec-4866a288fefa",
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T09:43:32.286956Z"
}
```

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33/tip` → **200**

```json
{
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
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
  "available_until": "2026-10-30T09:43:29.845011Z",
  "open": false,
  "tip": {
    "id": "f9b72654-1bba-4991-a6ec-4866a288fefa",
    "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T09:43:32.286956Z"
  }
}
```

`GET /api/rider/v1/orders/aae92f16-0187-464f-b081-3e94374a7d33/tip` → **200**

```json
{
  "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
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
  "available_until": "2026-10-30T09:43:29.845011Z",
  "open": false,
  "tip": {
    "id": "f9b72654-1bba-4991-a6ec-4866a288fefa",
    "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T09:43:32.286956Z"
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
      "id": "16c8fe3e-cad5-4dfa-9795-b8c20bf44c29",
      "at": "2026-10-29T09:43:30.163755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
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
      "id": "91259110-6d3a-4c32-ab8c-e4c7ccb51fec",
      "at": "2026-10-29T09:43:34.219388Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
      "counterpart_id": null
    },
    {
      "id": "16c8fe3e-cad5-4dfa-9795-b8c20bf44c29",
      "at": "2026-10-29T09:43:30.163755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "482f9c9c-ef6a-4171-8b83-7fd9d4ec7d43",
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
  "id": "866e5212-194c-47b5-89b6-2c4bb62a5934",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:35.705041Z",
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
  "session_id": "114cb71c-8e8f-4aec-9d40-c82a99d141c7",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5MTYsImlhdCI6MTc5MzI2NzAxNiwianRpIjoiMjFjN2ZjMGYtNzQzYS00OTNmLThlZGEtZWE1ZmVjODVhODk1Iiwic2lkIjoiMTE0Y2I3MWMtOGU4Zi00YWVjLTlkNDAtYzgyYTk5ZDE0MWM3In0.xZLrQB0hnFVtve_GD98FC2AhWAx9Jql3Gpktvt_iPZY",
  "access_expires_at": "2026-10-29T09:58:36.296733921Z",
  "refresh_token": "-Jq7ji7kgBkfmLhNx0nYOduHNd27-qTieVxaUm7K57E",
  "refresh_expires_at": "2026-10-29T21:43:36.296144579Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380736994799` → **200**

```json
{
  "client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c"
}
```

`POST /api/admin/v1/rider-wallets/b82cd45b-46cd-4b86-9b9d-0119006e346c/top-ups` → **201**

```json
{
  "command_id": "f123d7ea-486a-4a27-9cb7-258218a8737b",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
      "id": "c20ae884-b349-44af-b913-84583ec911b3",
      "at": "2026-10-29T09:43:36.853686Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "86bb4728-43bf-4b8d-93fb-414615a160a5",
  "quote_id": "866e5212-194c-47b5-89b6-2c4bb62a5934",
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
  "id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
  "created_at": "2026-10-29T09:43:37.156851Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb` → **200**

```json
{
  "id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
  "created_at": "2026-10-29T09:43:37.156851Z",
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
    "id": "2d46df1c-14c2-43ac-9011-2030efea8741",
    "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
    "expires_at": "2026-10-29T09:43:52.162135Z",
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

`POST /api/driver/v1/offers/2d46df1c-14c2-43ac-9011-2030efea8741/accept` → **200**

```json
{
  "command_id": "7aca3adc-1b3d-4100-aff4-bdc980ab72cb"
}
```

```json
{
  "id": "d4a41b83-f66c-4c4c-bbae-31b7152a8bd0",
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "94c82d64-a19a-4e2d-a834-d7fda6f50b81",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "94c82d64-a19a-4e2d-a834-d7fda6f50b81",
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "assignment_id": "d4a41b83-f66c-4c4c-bbae-31b7152a8bd0",
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

`POST /api/driver/v1/work-sessions/328c7044-73bd-45ea-ac7a-0aef05f3e4c3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:38Z",
    "sequence": 1793267018579
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:38.598299Z",
  "last_location_at": "2026-10-29T09:43:38.598299Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/94c82d64-a19a-4e2d-a834-d7fda6f50b81/arrive` → **200**

```json
{
  "command_id": "46a375bd-0e57-4fbc-ae1e-b61c49eb737e",
  "expected_version": 0
}
```

```json
{
  "id": "94c82d64-a19a-4e2d-a834-d7fda6f50b81",
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "assignment_id": "d4a41b83-f66c-4c4c-bbae-31b7152a8bd0",
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
  "arrived_at": "2026-10-29T09:43:38.884013Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/94c82d64-a19a-4e2d-a834-d7fda6f50b81/start` → **200**

```json
{
  "command_id": "bd64ab81-aecf-49dc-845c-420b06962ef3",
  "expected_version": 1
}
```

```json
{
  "id": "94c82d64-a19a-4e2d-a834-d7fda6f50b81",
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "assignment_id": "d4a41b83-f66c-4c4c-bbae-31b7152a8bd0",
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
  "arrived_at": "2026-10-29T09:43:38.884013Z",
  "started_at": "2026-10-29T09:43:39.178158Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/94c82d64-a19a-4e2d-a834-d7fda6f50b81/complete` → **200**

```json
{
  "command_id": "206420a3-4b41-4542-a592-037e0d8dd34b",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:43:39Z",
  "cash_received": true
}
```

```json
{
  "id": "94c82d64-a19a-4e2d-a834-d7fda6f50b81",
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "assignment_id": "d4a41b83-f66c-4c4c-bbae-31b7152a8bd0",
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
  "arrived_at": "2026-10-29T09:43:38.884013Z",
  "started_at": "2026-10-29T09:43:39.178158Z",
  "completed_at": "2026-10-29T09:43:39.478049Z",
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
  "client_id": "b82cd45b-46cd-4b86-9b9d-0119006e346c",
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
      "id": "c20ae884-b349-44af-b913-84583ec911b3",
      "at": "2026-10-29T09:43:36.853686Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
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

`GET /api/rider/v1/orders/a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb/tip` → **200**

```json
{
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
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
  "available_until": "2026-10-30T09:43:39.478049Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb/tip` → **201**

```json
{
  "command_id": "1c47c858-4018-4441-9e8d-e42bc4fb615d",
  "amount_minor": 2500
}
```

```json
{
  "id": "18d7b5b1-12db-477d-99b0-e1dee17b64f4",
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T09:43:40.627399Z"
}
```

`GET /api/rider/v1/orders/a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb/tip` → **200**

```json
{
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
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
  "available_until": "2026-10-30T09:43:39.478049Z",
  "open": false,
  "tip": {
    "id": "18d7b5b1-12db-477d-99b0-e1dee17b64f4",
    "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T09:43:40.627399Z"
  }
}
```

`GET /api/rider/v1/orders/a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb/tip` → **200**

```json
{
  "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
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
  "available_until": "2026-10-30T09:43:39.478049Z",
  "open": false,
  "tip": {
    "id": "18d7b5b1-12db-477d-99b0-e1dee17b64f4",
    "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T09:43:40.627399Z"
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
      "id": "d7170347-cc6a-4596-80e7-3c1744063aa8",
      "at": "2026-10-29T09:43:42.285714Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
      "counterpart_id": null
    },
    {
      "id": "27b57e80-0c4a-4f7c-b9ef-111d2497a78b",
      "at": "2026-10-29T09:43:40.261622Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb",
      "counterpart_id": null
    },
    {
      "id": "91259110-6d3a-4c32-ab8c-e4c7ccb51fec",
      "at": "2026-10-29T09:43:34.219388Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
      "counterpart_id": null
    },
    {
      "id": "16c8fe3e-cad5-4dfa-9795-b8c20bf44c29",
      "at": "2026-10-29T09:43:30.163755Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "aae92f16-0187-464f-b081-3e94374a7d33",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "328c7044-73bd-45ea-ac7a-0aef05f3e4c3",
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
  "last_heartbeat_at": "2026-10-29T09:43:38.598299Z",
  "last_location_at": "2026-10-29T09:43:38.598299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/328c7044-73bd-45ea-ac7a-0aef05f3e4c3/close` → **200**

```json
{
  "command_id": "fc2de7ff-540e-4c80-b359-d327a54b3181",
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

Done: card order a2dc00bc-e9f8-4ce6-a23e-31b1c6992ddb.

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
  "phone": "+380734182823",
  "device_ref": "sandbox-17592"
}
```

```json
{
  "challenge_id": "4af1b349-e846-42c9-a784-bec890780bfe",
  "expires_at": "2026-10-29T09:48:43.584250966Z",
  "resend_available_at": "2026-10-29T09:43:44.584250966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734182823` → **200**

```json
{
  "phone": "+380734182823",
  "audience": "CLIENT",
  "code": "388110",
  "sent_at": "2026-10-29T09:43:43.587070369Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4af1b349-e846-42c9-a784-bec890780bfe",
  "code": "388110",
  "device_ref": "sandbox-17592"
}
```

```json
{
  "session_id": "52614def-7aae-4c9d-beb6-0d114b493547",
  "subject": {
    "type": "CLIENT",
    "id": "e6fbe620-582d-44bc-8045-6c5e4852d5c5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNmZiZTYyMC01ODJkLTQ0YmMtODA0NS02YzVlNDg1MmQ1YzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTIzLCJpYXQiOjE3OTMyNjcwMjMsImp0aSI6IjMzOGUwMTE5LWUxN2MtNDA3MS04NDc5LTIwZDg4NzIwOTFhOSIsInNpZCI6IjUyNjE0ZGVmLTdhYWUtNGM5ZC1iZWI2LTBkMTE0YjQ5MzU0NyJ9.P-WsTG43MIfqJ-HfdRSkgP9bfjypyt8_yXJrblSIKSM",
  "access_expires_at": "2026-10-29T09:58:43.89446897Z",
  "refresh_token": "B4vKmEjhECqfVegxfFXFjSpIElthkjvZF91d9wvURjY",
  "refresh_expires_at": "2026-11-28T09:43:43.893817144Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "86ad9472-55c9-440a-9753-d10a0f43ae65",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "8323499e-9b33-434a-84c9-c0415d5457d3",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-8323499e-9b33-434a-84c9-c0415d5457d3",
    "orderDate": "1793267024",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f69cf4daac3d829f2983edc64b64ab20",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=8323499e-9b33-434a-84c9-c0415d5457d3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734182823"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=8323499e-9b33-434a-84c9-c0415d5457d3",
  "created_at": "2026-10-29T09:43:44.176928Z",
  "expires_at": "2026-10-29T10:13:44.176928Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/8323499e-9b33-434a-84c9-c0415d5457d3` → **200**

```json
{
  "id": "8323499e-9b33-434a-84c9-c0415d5457d3",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T09:43:44.176928Z",
  "expires_at": "2026-10-29T10:13:44.176928Z",
  "completed_at": "2026-10-29T09:43:44.463956Z",
  "masked_pan": "41****4708",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e6fbe620-582d-44bc-8045-6c5e4852d5c5",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "e6fbe620-582d-44bc-8045-6c5e4852d5c5",
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
      "id": "eb37131f-ecde-46d0-b206-1d6499e3a5ec",
      "at": "2026-10-29T09:43:45.310876Z",
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
  "client_id": "e6fbe620-582d-44bc-8045-6c5e4852d5c5",
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
      "id": "eb37131f-ecde-46d0-b206-1d6499e3a5ec",
      "at": "2026-10-29T09:43:45.310876Z",
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
  "device_ref": "sandbox-20941"
}
```

```json
{
  "challenge_id": "320a0066-17f7-4c86-95ea-300c5562f6e9",
  "expires_at": "2026-10-29T09:48:46.590683266Z",
  "resend_available_at": "2026-10-29T09:43:47.590683266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "573920",
  "sent_at": "2026-10-29T09:43:46.593781126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "320a0066-17f7-4c86-95ea-300c5562f6e9",
  "code": "573920",
  "device_ref": "sandbox-20941"
}
```

```json
{
  "session_id": "4e1338a0-3474-4745-9895-2968667b2f7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzkyNiwiaWF0IjoxNzkzMjY3MDI2LCJqdGkiOiIxOTM5MzU3ZS01NzljLTQ0MjgtYTQ0Yi1lMDMzZmM0MmFlM2IiLCJzaWQiOiI0ZTEzMzhhMC0zNDc0LTQ3NDUtOTg5NS0yOTY4NjY3YjJmN2QifQ.WR3jAHb5YniCYxNfTZuaD5F7j32bhuT0swANXCQKnws",
  "access_expires_at": "2026-10-29T09:58:46.891631579Z",
  "refresh_token": "KD_FGHlj1PWKZA4cK0eVWtOuw8RxAgdjlczXIWC3hqY",
  "refresh_expires_at": "2026-11-28T09:43:46.891041205Z",
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
  "command_id": "0752b329-1819-4e3a-83a4-6750442e2569",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "9fc17f11-3de2-4013-978b-682989de3543",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-9fc17f11-3de2-4013-978b-682989de3543",
    "orderDate": "1793267027",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "8104112b42e57c8ae7695187bfecba62",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=9fc17f11-3de2-4013-978b-682989de3543",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=9fc17f11-3de2-4013-978b-682989de3543",
  "created_at": "2026-10-29T09:43:47.437312Z",
  "expires_at": "2026-10-29T10:13:47.437312Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/9fc17f11-3de2-4013-978b-682989de3543` → **200**

```json
{
  "id": "9fc17f11-3de2-4013-978b-682989de3543",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T09:43:47.437312Z",
  "expires_at": "2026-10-29T10:13:47.437312Z",
  "completed_at": "2026-10-29T09:43:47.720025Z",
  "masked_pan": "41****3307",
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
      "id": "16e8c2e6-7421-4712-be30-424a8ee29d3c",
      "at": "2026-10-29T09:43:48.31839Z",
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
  "command_id": "538936d5-96a5-4f2a-b441-2680c7ab3ee7",
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
  "correlation_id": "1df944b6-b6f0-4178-900a-d69c7ffa6f34"
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
  "device_ref": "sandbox-26966"
}
```

```json
{
  "challenge_id": "be744e81-439a-4aff-8040-63434ff208ca",
  "expires_at": "2026-10-29T09:48:49.878527547Z",
  "resend_available_at": "2026-10-29T09:43:50.878527547Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "370574",
  "sent_at": "2026-10-29T09:43:49.881584048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "be744e81-439a-4aff-8040-63434ff208ca",
  "code": "370574",
  "device_ref": "sandbox-26966"
}
```

```json
{
  "session_id": "5b076ca9-42ad-42bc-becd-70b05b8c3eb5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzkzMCwiaWF0IjoxNzkzMjY3MDMwLCJqdGkiOiJjMmVkYmI5My0wNDllLTQ0ZDItODljYS04MmI1ZjZiNDAxZmMiLCJzaWQiOiI1YjA3NmNhOS00MmFkLTQyYmMtYmVjZC03MGIwNWI4YzNlYjUifQ.poNh_Im0BMB1UZMLx0Qrc0s8q8XN-YQd8Hc3muX1yKE",
  "access_expires_at": "2026-10-29T09:58:50.178694846Z",
  "refresh_token": "FloSn8aCi4ljZoH9PsYaInAHtj-LPm5jpGGikoISCT0",
  "refresh_expires_at": "2026-11-28T09:43:50.178142455Z",
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
  "command_id": "2a6b6f00-2c35-4bde-85f8-4178ffe3d50e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:50Z",
    "sequence": 1793267030725
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2116731a-44a1-4640-bc00-5c8dba03f810",
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
  "last_heartbeat_at": "2026-10-29T09:43:50.74429Z",
  "last_location_at": "2026-10-29T09:43:50.74429Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635784459",
  "device_ref": "sandbox-9779"
}
```

```json
{
  "challenge_id": "03467892-7bdc-43c6-a7d4-4ae7a12ec623",
  "expires_at": "2026-10-29T09:48:51.026984042Z",
  "resend_available_at": "2026-10-29T09:43:52.026984042Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635784459` → **200**

```json
{
  "phone": "+380635784459",
  "audience": "CLIENT",
  "code": "903491",
  "sent_at": "2026-10-29T09:43:51.029549088Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03467892-7bdc-43c6-a7d4-4ae7a12ec623",
  "code": "903491",
  "device_ref": "sandbox-9779"
}
```

```json
{
  "session_id": "09612712-be34-434c-a4a8-9aeb6eeffe8c",
  "subject": {
    "type": "CLIENT",
    "id": "8fc9715d-394a-4f48-b7fa-d8b84a72cc70"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmM5NzE1ZC0zOTRhLTRmNDgtYjdmYS1kOGI4NGE3MmNjNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTMxLCJpYXQiOjE3OTMyNjcwMzEsImp0aSI6IjU0N2RmNDA1LTg2YTYtNGQyMy04ZjE0LWE4NjQ2MTE2NTg0MSIsInNpZCI6IjA5NjEyNzEyLWJlMzQtNDM0Yy1hNGE4LTlhZWI2ZWVmZmU4YyJ9.YmQcCt9njJQWFGJREYX9_qKR6CzDuxG_vi39WXOC2BU",
  "access_expires_at": "2026-10-29T09:58:51.333093278Z",
  "refresh_token": "GTZ6xO-hWOkClNcr7AqpcQwLccfXIQXU7xaS8sCGNic",
  "refresh_expires_at": "2026-11-28T09:43:51.332565794Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "44951492-117f-441e-b2b4-e9a70e9bd966",
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
  "id": "c4d07c6c-ff7e-46b4-bc45-97f2dcb00edf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:51.611781Z",
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
  "command_id": "1f585845-9162-4388-8783-687cc7745745",
  "quote_id": "c4d07c6c-ff7e-46b4-bc45-97f2dcb00edf",
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
  "id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8fc9715d-394a-4f48-b7fa-d8b84a72cc70",
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
  "created_at": "2026-10-29T09:43:51.908683Z",
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
    "id": "71e32d3e-6c34-472f-8c4b-f4ef8fe16e85",
    "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
    "expires_at": "2026-10-29T09:44:06.912006Z",
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

`POST /api/driver/v1/offers/71e32d3e-6c34-472f-8c4b-f4ef8fe16e85/accept` → **200**

```json
{
  "command_id": "2f150815-0a70-44e3-87ee-af60105edacd"
}
```

```json
{
  "id": "78162330-f6f2-4d0f-b687-1c7ad8e2a2b8",
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5ea45472-6843-4773-b920-2e61010b093e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5ea45472-6843-4773-b920-2e61010b093e",
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "assignment_id": "78162330-f6f2-4d0f-b687-1c7ad8e2a2b8",
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

`POST /api/driver/v1/work-sessions/2116731a-44a1-4640-bc00-5c8dba03f810/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:53Z",
    "sequence": 1793267033275
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2116731a-44a1-4640-bc00-5c8dba03f810",
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
  "last_heartbeat_at": "2026-10-29T09:43:53.045962Z",
  "last_location_at": "2026-10-29T09:43:53.045962Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5ea45472-6843-4773-b920-2e61010b093e/arrive` → **200**

```json
{
  "command_id": "448150e7-bb19-4c4b-bce0-0d16a1a319b9",
  "expected_version": 0
}
```

```json
{
  "id": "5ea45472-6843-4773-b920-2e61010b093e",
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "assignment_id": "78162330-f6f2-4d0f-b687-1c7ad8e2a2b8",
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
  "arrived_at": "2026-10-29T09:43:53.324804Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5ea45472-6843-4773-b920-2e61010b093e/start` → **200**

```json
{
  "command_id": "53d43490-328f-4255-9df8-9691912fddf6",
  "expected_version": 1
}
```

```json
{
  "id": "5ea45472-6843-4773-b920-2e61010b093e",
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "assignment_id": "78162330-f6f2-4d0f-b687-1c7ad8e2a2b8",
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
  "arrived_at": "2026-10-29T09:43:53.324804Z",
  "started_at": "2026-10-29T09:43:53.610694Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5ea45472-6843-4773-b920-2e61010b093e/complete` → **200**

```json
{
  "command_id": "653c0c00-4833-4ef7-ac7a-59995389c52f",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:43:53Z",
  "cash_received": false
}
```

```json
{
  "id": "5ea45472-6843-4773-b920-2e61010b093e",
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "assignment_id": "78162330-f6f2-4d0f-b687-1c7ad8e2a2b8",
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
  "arrived_at": "2026-10-29T09:43:53.324804Z",
  "started_at": "2026-10-29T09:43:53.610694Z",
  "completed_at": "2026-10-29T09:43:53.897576Z",
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
  "session_id": "d7ed1f44-dc93-4c50-a8f8-30c3d17454af",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5MzQsImlhdCI6MTc5MzI2NzAzNCwianRpIjoiY2JlOTRjY2QtODhlNC00M2QzLTliMmYtZWQzOTkzZTMzZTM0Iiwic2lkIjoiZDdlZDFmNDQtZGM5My00YzUwLWE4ZjgtMzBjM2QxNzQ1NGFmIn0.jLswbgfFoeYn4ZQHN9jR4bQuuHGFsZQgk1iYTZll0IA",
  "access_expires_at": "2026-10-29T09:58:54.478414591Z",
  "refresh_token": "MdEDxQOnPZtb2YYM_kVq1mD9UhdwfgaiA3l5ySMJ5VE",
  "refresh_expires_at": "2026-10-29T21:43:54.477882336Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/2f8cdf37-adc6-4762-a4b0-166b6a045b42/cash-dispute` → **200**

```json
{
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8fc9715d-394a-4f48-b7fa-d8b84a72cc70",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T09:43:54.370444Z",
  "decide_by": "2026-11-12T09:43:54.370444Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T09:43:54.370444Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "8fc9715d-394a-4f48-b7fa-d8b84a72cc70",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T09:43:54.370444Z",
      "decide_by": "2026-11-12T09:43:54.370444Z",
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

`POST /api/admin/v1/orders/2f8cdf37-adc6-4762-a4b0-166b6a045b42/cash-dispute/decide` → **400**

```json
{
  "command_id": "1833e455-fcf0-44bd-82d2-8f60ec506dbe",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/2f8cdf37-adc6-4762-a4b0-166b6a045b42/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "14e45f66-550c-4d3a-88b5-c9f927cd1c26",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/2f8cdf37-adc6-4762-a4b0-166b6a045b42/cash-dispute/decide` → **200**

```json
{
  "command_id": "785d78e1-0153-4090-b82e-c611e45df9bc",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8fc9715d-394a-4f48-b7fa-d8b84a72cc70",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T09:43:54.370444Z",
  "decide_by": "2026-11-12T09:43:54.370444Z",
  "decision": "PAY_DRIVER",
  "decided_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T09:43:55.647691Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/2f8cdf37-adc6-4762-a4b0-166b6a045b42/cash-dispute/decide` → **409**

```json
{
  "command_id": "65b37d40-7fcd-41a9-be7b-531c08aa8ecd",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/2f8cdf37-adc6-4762-a4b0-166b6a045b42/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d21e837f-0ceb-4fc5-8f6a-775994ba3c2c"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2116731a-44a1-4640-bc00-5c8dba03f810",
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
  "last_heartbeat_at": "2026-10-29T09:43:53.045962Z",
  "last_location_at": "2026-10-29T09:43:53.045962Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2116731a-44a1-4640-bc00-5c8dba03f810/close` → **200**

```json
{
  "command_id": "16136c13-d00d-44a7-891c-a9ad5d8f3acb",
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
  "phone": "+380737835998",
  "device_ref": "sandbox-10396"
}
```

```json
{
  "challenge_id": "a1e604b1-4603-4e0c-a8af-a1e95c3f5c71",
  "expires_at": "2026-10-29T09:48:56.776853592Z",
  "resend_available_at": "2026-10-29T09:43:57.776853592Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737835998` → **200**

```json
{
  "phone": "+380737835998",
  "audience": "CLIENT",
  "code": "476282",
  "sent_at": "2026-10-29T09:43:56.779741622Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a1e604b1-4603-4e0c-a8af-a1e95c3f5c71",
  "code": "476282",
  "device_ref": "sandbox-10396"
}
```

```json
{
  "session_id": "8b088160-0d0d-4aa6-b370-6ba4f60b88f3",
  "subject": {
    "type": "CLIENT",
    "id": "39512225-8f04-49d8-b14c-e3aa1da112bc"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTUxMjIyNS04ZjA0LTQ5ZDgtYjE0Yy1lM2FhMWRhMTEyYmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTM3LCJpYXQiOjE3OTMyNjcwMzcsImp0aSI6IjRhNGRkZGRlLWJmZGYtNDhjZS04NDRmLTc3YjY0NWY3MjIyZiIsInNpZCI6IjhiMDg4MTYwLTBkMGQtNGFhNi1iMzcwLTZiYTRmNjBiODhmMyJ9.pX6fVAR-UzTx1GWK69-3WC5LxlIH_ReJfe7AsEqNc-o",
  "access_expires_at": "2026-10-29T09:58:57.07858004Z",
  "refresh_token": "wLZPsKgcUc7gsKJ5nYXs-3xeMMrBj4Y5trLFgOCxkfU",
  "refresh_expires_at": "2026-11-28T09:43:57.07801551Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "6a41c941-3f88-48c1-a443-51979287a3ef",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "6cbad379-d15c-41a3-8106-bd3d9100630d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-6cbad379-d15c-41a3-8106-bd3d9100630d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b4c0ea96c66aa78ad6d2268678c77e1b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=6cbad379-d15c-41a3-8106-bd3d9100630d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737835998"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=6cbad379-d15c-41a3-8106-bd3d9100630d",
  "expires_at": "2026-10-29T10:13:57.354199Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/6cbad379-d15c-41a3-8106-bd3d9100630d` → **200**

```json
{
  "id": "6cbad379-d15c-41a3-8106-bd3d9100630d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:13:57.354199Z",
  "card": {
    "id": "01733b45-6a39-483e-87d2-e8384b38a2f5",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5547",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:43:57.639513Z"
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
  "device_ref": "sandbox-19445"
}
```

```json
{
  "challenge_id": "fc95266b-2158-42a6-9424-bc147b1f5724",
  "expires_at": "2026-10-29T09:48:57.932083604Z",
  "resend_available_at": "2026-10-29T09:43:58.932083604Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "075767",
  "sent_at": "2026-10-29T09:43:57.934473851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fc95266b-2158-42a6-9424-bc147b1f5724",
  "code": "075767",
  "device_ref": "sandbox-19445"
}
```

```json
{
  "session_id": "62ce905c-0061-45fa-8d11-86cc227ccdce",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzkzOCwiaWF0IjoxNzkzMjY3MDM4LCJqdGkiOiI4YjU1MjVlNC00YjBlLTQ0YjAtYWMyNS0xZmNkNWIyMGQ3ZjQiLCJzaWQiOiI2MmNlOTA1Yy0wMDYxLTQ1ZmEtOGQxMS04NmNjMjI3Y2NkY2UifQ.sWe_pNJAL_DWQYTpA7Tgcah1rApMin43HXlFhxFpYSk",
  "access_expires_at": "2026-10-29T09:58:58.237467384Z",
  "refresh_token": "d-3TV2u0UoX4FQ4dz9DIUTBOnR8Qh_Z0fA0gJrPlF8o",
  "refresh_expires_at": "2026-11-28T09:43:58.23688131Z",
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
  "command_id": "ec6f2ff3-f60c-441a-b281-f933319d5ebe",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:43:58Z",
    "sequence": 1793267038777
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "204d866e-3e55-44a1-a162-ba7bb6a3b714",
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
  "last_heartbeat_at": "2026-10-29T09:43:58.796546Z",
  "last_location_at": "2026-10-29T09:43:58.796546Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b0a2e0b9-190b-4c9d-bf38-59da410aead4",
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
  "id": "abb86383-2a97-4173-ba38-01005d2d79ec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:48:59.089267Z",
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
  "command_id": "997c1cae-fa7b-43bc-84b5-52a145c248ad",
  "quote_id": "abb86383-2a97-4173-ba38-01005d2d79ec",
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
  "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
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
  "created_at": "2026-10-29T09:43:59.377331Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65` → **200**

```json
{
  "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
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
  "created_at": "2026-10-29T09:43:59.377331Z",
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
    "id": "731e6328-7cb9-4195-8937-a733254a280c",
    "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
    "expires_at": "2026-10-29T09:44:14.406233Z",
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

`POST /api/driver/v1/offers/731e6328-7cb9-4195-8937-a733254a280c/accept` → **200**

```json
{
  "command_id": "5e08d6fa-928f-4b1b-a48b-57f4b4a8c8ca"
}
```

```json
{
  "id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "assignment_id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
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

`POST /api/rider/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/messages` → **201**

```json
{
  "command_id": "f22ff3fd-55ba-44f9-9bb5-a85f4ade23c1",
  "body": "Я біля входу, мій номер +380737835998, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "396b6c52-0f1e-46f8-8e2c-5f4fbc94ac97",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380737835998, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T09:44:00.828915297Z"
}
```

`POST /api/driver/v1/trips/92b76fdd-889d-4dca-8eb1-cf6a104d8f4d/messages` → **201**

```json
{
  "command_id": "5cc0bce9-ce42-4279-8a02-5c87c1ab4f2e",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "43e2c7b2-5bc6-497f-bdbf-1fbeeb0046ca",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T09:44:01.118675826Z"
}
```

`POST /api/driver/v1/work-sessions/204d866e-3e55-44a1-a162-ba7bb6a3b714/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:44:01Z",
    "sequence": 1793267041379
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "204d866e-3e55-44a1-a162-ba7bb6a3b714",
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
  "last_heartbeat_at": "2026-10-29T09:44:01.398539Z",
  "last_location_at": "2026-10-29T09:44:01.398539Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/92b76fdd-889d-4dca-8eb1-cf6a104d8f4d/arrive` → **200**

```json
{
  "command_id": "42328391-8435-4500-951e-4eb77d5810ae",
  "expected_version": 0
}
```

```json
{
  "id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "assignment_id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
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
  "arrived_at": "2026-10-29T09:44:01.677044Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/92b76fdd-889d-4dca-8eb1-cf6a104d8f4d/start` → **200**

```json
{
  "command_id": "100955cd-c6eb-40e2-83b7-016bcf0fc897",
  "expected_version": 1
}
```

```json
{
  "id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "assignment_id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
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
  "arrived_at": "2026-10-29T09:44:01.677044Z",
  "started_at": "2026-10-29T09:44:01.960158Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/204d866e-3e55-44a1-a162-ba7bb6a3b714/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:44:02Z",
    "sequence": 1793267042230
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "204d866e-3e55-44a1-a162-ba7bb6a3b714",
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
  "last_heartbeat_at": "2026-10-29T09:44:02.24863Z",
  "last_location_at": "2026-10-29T09:44:02.24863Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/92b76fdd-889d-4dca-8eb1-cf6a104d8f4d/complete` → **200**

```json
{
  "command_id": "ab355d60-f2da-4289-88c9-370ed14f73fb",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:44:02Z",
  "cash_received": false
}
```

```json
{
  "id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "assignment_id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
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
  "arrived_at": "2026-10-29T09:44:01.677044Z",
  "started_at": "2026-10-29T09:44:01.960158Z",
  "completed_at": "2026-10-29T09:44:02.534001Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65` → **200**

```json
{
  "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
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
    "id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
    "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:43:59.377331Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65` → **200**

```json
{
  "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
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
    "id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
    "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:43:59.377331Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65` → **200**

```json
{
  "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
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
    "id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
    "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:43:59.377331Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65` → **200**

```json
{
  "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
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
    "id": "31bd7079-9c9d-4801-bd4b-d90372419b3b",
    "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "92b76fdd-889d-4dca-8eb1-cf6a104d8f4d",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:43:59.377331Z",
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
  "session_id": "204d866e-3e55-44a1-a162-ba7bb6a3b714",
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
  "last_heartbeat_at": "2026-10-29T09:44:02.24863Z",
  "last_location_at": "2026-10-29T09:44:02.24863Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/204d866e-3e55-44a1-a162-ba7bb6a3b714/close` → **200**

```json
{
  "command_id": "1ba7624f-cbd1-40cc-bb27-508fa2fc70d8",
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
  "session_id": "800d50e6-39c6-45da-8de6-8c18076094bb",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5NDcsImlhdCI6MTc5MzI2NzA0NywianRpIjoiYTM1NGZmOTAtMDY0ZC00YzhmLTg2YmUtMTIwOWFhNTU0ZjRiIiwic2lkIjoiODAwZDUwZTYtMzljNi00NWRhLThkZTYtOGMxODA3NjA5NGJiIn0.AiV7RbTKPj5-MpC_Jp38VC-32SDkwBUUbpxFcAW8Mps",
  "access_expires_at": "2026-10-29T09:59:07.826556333Z",
  "refresh_token": "sR5QnwEjREVEiVJ8C3xnq-ms_rdodxeYKLDulpkGNyA",
  "refresh_expires_at": "2026-10-29T21:44:07.826019578Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1c1c8e2b-831a-4956-945c-b19f6c9ecdec"
}
```

`GET /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T09:44:08.371067986Z",
  "order": {
    "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
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
    "created_at": "2026-10-29T09:43:59.377331Z",
    "assigned_at": "2026-10-29T09:44:00.239809Z",
    "arrived_at": "2026-10-29T09:44:01.677044Z",
    "started_at": "2026-10-29T09:44:01.960158Z",
    "completed_at": "2026-10-29T09:44:02.534001Z"
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
    "id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
    "registered_at": "2026-10-29T09:43:57.075988Z",
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
      "created_at": "2026-10-29T09:43:59.379582Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T09:44:03.469408Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks` → **422**

```json
{
  "command_id": "70554df8-fb88-4368-a409-a528501a2376",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "1017f896-bcb5-484b-b934-937f60a346d5"
}
```

`POST /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks` → **201**

```json
{
  "command_id": "494d553b-b8b0-4775-aea4-f5599bfc2088",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "4394406b-27ae-4770-9a4f-92c9cf8ce768",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T09:44:09.009632Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks` → **201**

```json
{
  "command_id": "494d553b-b8b0-4775-aea4-f5599bfc2088",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "4394406b-27ae-4770-9a4f-92c9cf8ce768",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T09:44:09.009632Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/39512225-8f04-49d8-b14c-e3aa1da112bc` → **200**

```json
{
  "client": {
    "id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
    "phone": "+380737835998",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:43:57.075988Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T09:43:59.377331Z",
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

`POST /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks/4394406b-27ae-4770-9a4f-92c9cf8ce768/resolve` → **200**

```json
{
  "command_id": "930aedb8-1a81-4151-96f1-93b943513950",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "4394406b-27ae-4770-9a4f-92c9cf8ce768",
  "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T09:44:09.009632Z",
  "resolved_at": "2026-10-29T09:44:09.968141Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/39512225-8f04-49d8-b14c-e3aa1da112bc` → **200**

```json
{
  "client": {
    "id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
    "phone": "+380737835998",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:43:57.075988Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T09:43:59.377331Z",
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

`GET /api/admin/v1/clients/39512225-8f04-49d8-b14c-e3aa1da112bc` → **200**

```json
{
  "client": {
    "id": "39512225-8f04-49d8-b14c-e3aa1da112bc",
    "phone": "+380737835998",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:43:57.075988Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T09:43:59.377331Z",
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

`POST /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks/4394406b-27ae-4770-9a4f-92c9cf8ce768/resolve` → **409**

```json
{
  "command_id": "cfef83d3-cafd-4431-a544-546b5faf9555",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks/4394406b-27ae-4770-9a4f-92c9cf8ce768/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8cf6b44c-9999-4403-9596-9c94e682b8ad"
}
```

`GET /api/admin/v1/orders/20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "4394406b-27ae-4770-9a4f-92c9cf8ce768",
      "order_id": "20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T09:44:09.009632Z",
      "resolved_at": "2026-10-29T09:44:09.968141Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 20320d5e-2cc1-40ac-ae4c-49d0c9dbbb65 without phone or card digits; chargeback 4394406b-27ae-4770-9a4f-92c9cf8ce768 recorded and won.

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
  "session_id": "ee8920b1-1861-4e38-ac59-0ba0a4761ef5",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5NTMsImlhdCI6MTc5MzI2NzA1MywianRpIjoiYTUwM2RmMTgtYzM3Zi00ODE1LWE2NDMtMWI1MDczNGQ0ZTQyIiwic2lkIjoiZWU4OTIwYjEtMTg2MS00ZTM4LWFjNTktMGJhMGE0NzYxZWY1In0.4LO5LnejOaJmghdAn1oqSygJnMIx_db59dWzjKGoXI0",
  "access_expires_at": "2026-10-29T09:59:13.034918883Z",
  "refresh_token": "mYFUO80rKZ1jRnEH32EgEZn5bB6eltodbPKyeYw6o8Y",
  "refresh_expires_at": "2026-10-29T21:44:13.034396717Z",
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
  "phone": "+48600498182",
  "device_ref": "sandbox-25104"
}
```

```json
{
  "challenge_id": "49ef67ca-e58d-414e-9ed8-b189cbb1a18d",
  "expires_at": "2026-10-29T09:49:13.851919218Z",
  "resend_available_at": "2026-10-29T09:44:14.851919218Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600498182` → **200**

```json
{
  "phone": "+48600498182",
  "audience": "CLIENT",
  "code": "490730",
  "sent_at": "2026-10-29T09:44:13.854510243Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49ef67ca-e58d-414e-9ed8-b189cbb1a18d",
  "code": "490730",
  "device_ref": "sandbox-25104"
}
```

```json
{
  "session_id": "d9ca160b-9fad-46dd-aeb5-aedc9bb302d2",
  "subject": {
    "type": "CLIENT",
    "id": "f041bd6f-ce5c-4453-9268-f5b43ea4fe62"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDQxYmQ2Zi1jZTVjLTQ0NTMtOTI2OC1mNWI0M2VhNGZlNjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTU0LCJpYXQiOjE3OTMyNjcwNTQsImp0aSI6ImI3YmExNTk5LTVhNWMtNGRjNy04YThjLTRjY2Q1OTNkNjNiOSIsInNpZCI6ImQ5Y2ExNjBiLTlmYWQtNDZkZC1hZWI1LWFlZGM5YmIzMDJkMiJ9.v1KrUyprS9na5mwLg5fFHWHUiC4DIRgczZxkgpjYdAk",
  "access_expires_at": "2026-10-29T09:59:14.160449692Z",
  "refresh_token": "NAtMWRzyB3FfBNHpmOeVBqAClEGnn8LE05hz5eCTRiE",
  "refresh_expires_at": "2026-11-28T09:44:14.159882317Z",
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
  "command_id": "8147495b-5520-4027-8fdc-030c39e8c732",
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
  "correlation_id": "3f05e553-cf64-4de0-b391-df53b61ec0df",
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
  "command_id": "1cfb20a8-8787-436b-a7e3-d0123a277e44",
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
  "paused_at": "2026-10-29T09:44:15.258448422Z",
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
  "command_id": "8048e687-daec-4805-9da6-e79cae2c376f",
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
  "id": "5745cb5f-19ee-4970-a6fa-a387832a344e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:15.846643Z",
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
  "command_id": "153c92e8-9f11-46c6-8cfe-58392e9afc62",
  "quote_id": "5745cb5f-19ee-4970-a6fa-a387832a344e",
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
  "correlation_id": "cf8ed7d5-de2c-4f10-b422-45412fa8f0c7"
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
  "paused_at": "2026-10-29T09:44:15.258448Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "c9b68768-4668-4fd1-9fe5-311ca788fda8",
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
  "command_id": "16dcc794-530c-4956-b2a5-c617a748940e",
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
  "command_id": "18dff6cf-76e4-494d-a0c4-ac85fbc8c35d",
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
  "id": "1e9952df-2f72-4f69-a24d-37ed93076964",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:17.548647Z",
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
  "command_id": "48c2f410-1ee8-48fb-ab13-54a2af3076a1",
  "quote_id": "1e9952df-2f72-4f69-a24d-37ed93076964",
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
  "correlation_id": "408101e4-731e-47c8-a9bc-a1aad716ab4c"
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
  "command_id": "3ef50fd0-0e20-459d-a511-2cdad6cf8190",
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
      "from": "12:00",
      "to": "13:00"
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
      "from": "12:00",
      "to": "13:00"
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
  "command_id": "189564b3-80df-4795-9507-3cfa11a15cf4",
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
  "id": "65a34ba7-7ab8-470b-9733-788984f6b434",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:18.677729Z",
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
  "command_id": "0f5276c5-bbe1-4103-a0b6-eaa6fc76c8fd",
  "quote_id": "65a34ba7-7ab8-470b-9733-788984f6b434",
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
  "correlation_id": "ced3188e-f8ce-4538-9820-ac835848690c"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "d5b7ff85-9694-4617-9fa4-e41b5604ed5d",
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
  "correlation_id": "b005929a-8256-4b9a-88b5-127f3536dc26"
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
      "from": "12:00",
      "to": "13:00"
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
  "command_id": "2df1e962-ae87-4c38-892b-3e0871eb6772",
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
  "phone": "+380670059198",
  "device_ref": "sandbox-22926"
}
```

```json
{
  "challenge_id": "d0468cfd-2dc8-42ca-87f4-b1091eeb2467",
  "expires_at": "2026-10-29T09:49:20.11166845Z",
  "resend_available_at": "2026-10-29T09:44:21.11166845Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670059198` → **200**

```json
{
  "phone": "+380670059198",
  "audience": "CLIENT",
  "code": "759474",
  "sent_at": "2026-10-29T09:44:20.11425411Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d0468cfd-2dc8-42ca-87f4-b1091eeb2467",
  "code": "759474",
  "device_ref": "sandbox-22926"
}
```

```json
{
  "session_id": "6bb79d97-78fd-4f9e-ba8c-5cd3c53c02ea",
  "subject": {
    "type": "CLIENT",
    "id": "bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYjViNWVlNy1hMTZjLTQyMWItODc2Zi1kMWNlOGQzZWFiYjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTYwLCJpYXQiOjE3OTMyNjcwNjAsImp0aSI6IjIwZDk2Y2EzLTkwMmMtNDBhMC1hZjlkLWQ1OTVmZjE4YjY5ZSIsInNpZCI6IjZiYjc5ZDk3LTc4ZmQtNGY5ZS1iYThjLTVjZDNjNTNjMDJlYSJ9.aG4MepJJam8DrUrTS1rH5bApYVXgx4F3SR3V6d7giIQ",
  "access_expires_at": "2026-10-29T09:59:20.412610352Z",
  "refresh_token": "P3CnGjui-Tu9dwdRJ-ICAK7l97-Ij_8nU8txFq0Ey0I",
  "refresh_expires_at": "2026-11-28T09:44:20.412132769Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6",
  "session_id": "6bb79d97-78fd-4f9e-ba8c-5cd3c53c02ea",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8851e498-686c-4d7e-b495-4143b8ea6530",
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
  "id": "c1ddae7a-79e4-4e90-88b3-b474468b2c44",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:20.977252Z",
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
  "challenge_id": "adb39aa8-c212-48b9-8dee-6d37ca184d3b",
  "expires_at": "2026-10-29T09:49:23.257127914Z",
  "resend_available_at": "2026-10-29T09:44:24.257127914Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670059198` → **200**

```json
{
  "phone": "+380670059198",
  "audience": "CLIENT",
  "code": "803309",
  "sent_at": "2026-10-29T09:44:23.259700344Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "91eb2d5a-7219-404d-b7c2-5368e02cfccb",
  "challenge_id": "adb39aa8-c212-48b9-8dee-6d37ca184d3b",
  "otp_code": "803309"
}
```

```json
{
  "client_id": "bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T09:44:23.563097625Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "b4350a92-0cb2-4e33-b941-60440d00a0eb",
  "quote_id": "c1ddae7a-79e4-4e90-88b3-b474468b2c44",
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
  "correlation_id": "3177564c-4fa9-4968-8cf9-c907ac445c51"
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
  "session_id": "845e6c4b-0a0f-4863-9593-cf182c34c0e7",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5NjQsImlhdCI6MTc5MzI2NzA2NCwianRpIjoiOWY4Yjg3MTEtY2E2OC00MzhhLTk2ZmUtNjg3YWM1YmE4OGY0Iiwic2lkIjoiODQ1ZTZjNGItMGEwZi00ODYzLTk1OTMtY2YxODJjMzRjMGU3In0.R-0UrO7Ygvo2nLlwgiHRT_YBtD-MfSEiXaas5EcdUzY",
  "access_expires_at": "2026-10-29T09:59:24.412645343Z",
  "refresh_token": "AVtOcTcaejbUH1utl04Y73oxrwYcn2N0FkiwVf7LOTk",
  "refresh_expires_at": "2026-10-29T21:44:24.412079299Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T09:44:23.563098Z",
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

`POST /api/admin/v1/client-deletions/bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6/complete` → **200**

```json
{
  "command_id": "4bf7c840-696b-4ef7-a247-4053cab1cd62",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6",
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
  "correlation_id": "65e1d703-e3c7-40bf-bd4b-4b14b2b0c30a"
}
```

Done: client bb5b5ee7-a16c-421b-876f-d1ce8d3eabb6 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667664495",
  "device_ref": "sandbox-23541"
}
```

```json
{
  "challenge_id": "e69d76d3-301c-45ad-b582-19e4122654f1",
  "expires_at": "2026-10-29T09:49:25.532310055Z",
  "resend_available_at": "2026-10-29T09:44:26.532310055Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667664495` → **200**

```json
{
  "phone": "+380667664495",
  "audience": "CLIENT",
  "code": "456171",
  "sent_at": "2026-10-29T09:44:25.53574075Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e69d76d3-301c-45ad-b582-19e4122654f1",
  "code": "456171",
  "device_ref": "sandbox-23541"
}
```

```json
{
  "session_id": "e262cb04-5127-4b92-a317-2128b6500e73",
  "subject": {
    "type": "CLIENT",
    "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTczYjNiMi1mY2EyLTRhY2UtYTBjZC0xYzcyNjRkYmU2MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTY1LCJpYXQiOjE3OTMyNjcwNjUsImp0aSI6IjYxZWJjY2Q1LWYzZWMtNGNkMS1iNWZmLTA4MDIzNGM0YzA3ZCIsInNpZCI6ImUyNjJjYjA0LTUxMjctNGI5Mi1hMzE3LTIxMjhiNjUwMGU3MyJ9.BKwr7HlohDxLQvTzxaqATnwSulT-FT2KYPVvAtRhKNs",
  "access_expires_at": "2026-10-29T09:59:25.881358625Z",
  "refresh_token": "Zwp_6l8l3kE2-gH7KAmwatEfttMq4fjJx7sU5IAPh44",
  "refresh_expires_at": "2026-11-28T09:44:25.880840626Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
  "session_id": "e262cb04-5127-4b92-a317-2128b6500e73",
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
  "session_id": "80408bed-4c4c-48e0-89ad-ab90301704d7",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5NjYsImlhdCI6MTc5MzI2NzA2NiwianRpIjoiOThlYmIwNjctMjMyNi00ZWI5LTk5MzUtMDY2MzA2NDc1YzNiIiwic2lkIjoiODA0MDhiZWQtNGM0Yy00OGUwLTg5YWQtYWI5MDMwMTcwNGQ3In0.iGyCtkgxSq_47T0-E4jCZgbX642m0c0oZ-E6-SppyLY",
  "access_expires_at": "2026-10-29T09:59:26.726781228Z",
  "refresh_token": "qjAc5YZMT-PYumipg1F7nQgBLcCnHrDpezuKmTrWW6o",
  "refresh_expires_at": "2026-10-29T21:44:26.726302092Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7664495&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
      "phone": "+380667664495",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T09:44:25.878856Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/0e73b3b2-fca2-4ace-a0cd-1c7264dbe619` → **200**

```json
{
  "client": {
    "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
    "phone": "+380667664495",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:44:25.878856Z",
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

`POST /api/admin/v1/clients/0e73b3b2-fca2-4ace-a0cd-1c7264dbe619/block` → **400**

```json
{
  "command_id": "8b55aa70-358a-4611-aee7-a8b4e2218e38",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0e73b3b2-fca2-4ace-a0cd-1c7264dbe619/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "52864f8f-3b26-4ac0-920b-5a3e2a6d09fe",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/0e73b3b2-fca2-4ace-a0cd-1c7264dbe619/block` → **200**

```json
{
  "command_id": "061c8def-08f3-4dd2-811f-09a9ceee0603",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
  "phone": "+380667664495",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T09:44:25.878856Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T09:44:27.90114Z",
    "by": "05964478-3d01-486a-b6e6-062abbd67c76"
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
  "correlation_id": "d3768d7f-1e35-495f-9044-3be85110bb61"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667664495",
  "device_ref": "sandbox-15588"
}
```

```json
{
  "challenge_id": "ace4645e-c9c0-4414-8413-fbcdf2a9d893",
  "expires_at": "2026-10-29T09:49:30.450890283Z",
  "resend_available_at": "2026-10-29T09:44:31.450890283Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667664495` → **200**

```json
{
  "phone": "+380667664495",
  "audience": "CLIENT",
  "code": "669913",
  "sent_at": "2026-10-29T09:44:30.453446159Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "ace4645e-c9c0-4414-8413-fbcdf2a9d893",
  "code": "669913",
  "device_ref": "sandbox-15588"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "1a638c34-1b70-42f3-9144-75705bba7933"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/0e73b3b2-fca2-4ace-a0cd-1c7264dbe619` → **200**

```json
{
  "client": {
    "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
    "phone": "+380667664495",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T09:44:25.878856Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T09:44:27.90114Z",
      "by": "05964478-3d01-486a-b6e6-062abbd67c76"
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

`POST /api/admin/v1/clients/0e73b3b2-fca2-4ace-a0cd-1c7264dbe619/unblock` → **200**

```json
{
  "command_id": "b1daef73-4754-4e80-9253-c12fd994a70c",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
  "phone": "+380667664495",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T09:44:25.878856Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667664495",
  "device_ref": "sandbox-22515"
}
```

```json
{
  "challenge_id": "53fac27b-a556-4592-87a4-1e99295ad78e",
  "expires_at": "2026-10-29T09:49:33.656469443Z",
  "resend_available_at": "2026-10-29T09:44:34.656469443Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667664495` → **200**

```json
{
  "phone": "+380667664495",
  "audience": "CLIENT",
  "code": "832233",
  "sent_at": "2026-10-29T09:44:33.659310164Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "53fac27b-a556-4592-87a4-1e99295ad78e",
  "code": "832233",
  "device_ref": "sandbox-22515"
}
```

```json
{
  "session_id": "2eb529a6-e7a8-4664-bf72-ef35d63b5339",
  "subject": {
    "type": "CLIENT",
    "id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZTczYjNiMi1mY2EyLTRhY2UtYTBjZC0xYzcyNjRkYmU2MTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTczLCJpYXQiOjE3OTMyNjcwNzMsImp0aSI6ImIyODBjMmQ1LTNmZjAtNDQ3Yy04MGM2LWE4ZDcwNTM3YjE5ZCIsInNpZCI6IjJlYjUyOWE2LWU3YTgtNDY2NC1iZjcyLWVmMzVkNjNiNTMzOSJ9.U9rGPRr_ysV3j17YMy6Xhq3yhoAJTTwnTB76KKUQP8E",
  "access_expires_at": "2026-10-29T09:59:33.957210402Z",
  "refresh_token": "7g0ptVnbjHAFS1GXcNKPHFYw9fLCpRWSbYnIKtdHdJQ",
  "refresh_expires_at": "2026-11-28T09:44:33.956680932Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0e73b3b2-fca2-4ace-a0cd-1c7264dbe619",
  "session_id": "2eb529a6-e7a8-4664-bf72-ef35d63b5339",
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
  "phone": "+380669458026",
  "device_ref": "sandbox-12531"
}
```

```json
{
  "challenge_id": "a7d21a3b-d859-4fcc-b4a8-47e38140dcce",
  "expires_at": "2026-10-29T09:49:34.504936238Z",
  "resend_available_at": "2026-10-29T09:44:35.504936238Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669458026` → **200**

```json
{
  "phone": "+380669458026",
  "audience": "CLIENT",
  "code": "339666",
  "sent_at": "2026-10-29T09:44:34.507514707Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7d21a3b-d859-4fcc-b4a8-47e38140dcce",
  "code": "339666",
  "device_ref": "sandbox-12531"
}
```

```json
{
  "session_id": "49a170fa-3678-4bfc-9ccf-09abb1b7249e",
  "subject": {
    "type": "CLIENT",
    "id": "3fe8a215-3284-4884-8bb7-959cf57efbe4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZmU4YTIxNS0zMjg0LTQ4ODQtOGJiNy05NTljZjU3ZWZiZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTc0LCJpYXQiOjE3OTMyNjcwNzQsImp0aSI6IjhlNjc3MDNiLTliNzYtNDBjYS1iMjBkLWRjNGRlMWZhMGYzNCIsInNpZCI6IjQ5YTE3MGZhLTM2NzgtNGJmYy05Y2NmLTA5YWJiMWI3MjQ5ZSJ9.JGwwfyNcwPZv7_by8biRqVDlaAvCV0epB4lkHJaUbYM",
  "access_expires_at": "2026-10-29T09:59:34.825407626Z",
  "refresh_token": "0jtM6_1p-ruewMOrfKO3yPm99z8ogEsDvC3gidZee8I",
  "refresh_expires_at": "2026-11-28T09:44:34.824808441Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a769a70d-08df-47d4-9f5d-86d950750657",
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
  "id": "06f98ef5-c5d5-468e-a773-7c01743d3f0c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:35.111049Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: fd775d61-1e89-43ba-a19b-73f822f09f03) → **201**

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
  "session_id": "1b710719-02f7-4c61-833c-04581f8dd79b",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5NzUsImlhdCI6MTc5MzI2NzA3NSwianRpIjoiYTBmYzhkYzktMWUzMS00Mjg3LTk1MDUtNDIxMmQ3MGRjM2EzIiwic2lkIjoiMWI3MTA3MTktMDJmNy00YzYxLTgzM2MtMDQ1ODFmOGRkNzliIn0.onb94kZY3C77kEQCo5SThB1HpouBE1Uljwz3EaDEvdo",
  "access_expires_at": "2026-10-29T09:59:35.722369437Z",
  "refresh_token": "OZer7lOoXN1gzQRw58hqcFV4DysRjRuWI4J5Il0me_k",
  "refresh_expires_at": "2026-10-29T21:44:35.721859984Z",
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
  "session_id": "d2b7409b-f197-4137-bb59-a9842a5e4eff",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5NzYsImlhdCI6MTc5MzI2NzA3NiwianRpIjoiNTJlOWMxZWUtOTY0NS00MDE5LWI2MjYtN2ZmMGQ1NjUxZTRjIiwic2lkIjoiZDJiNzQwOWItZjE5Ny00MTM3LWJiNTktYTk4NDJhNWU0ZWZmIn0.4t39pDSs9X50hPYwV7kj7tPR_2DMSpnE2kjKzOGBX1g",
  "access_expires_at": "2026-10-29T09:59:36.301039008Z",
  "refresh_token": "1Ptx6L_X4khwrGoqhws31wcZDtmzYEPHDYuXv24whSs",
  "refresh_expires_at": "2026-10-29T21:44:36.300501801Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cdfbc366-d430-48df-9ee8-18e3973553cf/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:44:35.394182Z",
      "actor": {
        "type": "CLIENT",
        "id": "3fe8a215-3284-4884-8bb7-959cf57efbe4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
        "quote_id": "06f98ef5-c5d5-468e-a773-7c01743d3f0c",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "fd775d61-1e89-43ba-a19b-73f822f09f03"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:44:35.396722Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
        "attempt_id": "27007fed-6652-4115-967f-9496db883169",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "fd775d61-1e89-43ba-a19b-73f822f09f03"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T09:44:35.403593Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
        "attempt_id": "27007fed-6652-4115-967f-9496db883169"
      },
      "correlation_id": "fd775d61-1e89-43ba-a19b-73f822f09f03"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "27007fed-6652-4115-967f-9496db883169",
        "generation": 1,
        "started_at": "2026-10-29T09:44:35.395673Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T09:44:35.403593Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T09:44:35.397496Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/fd775d61-1e89-43ba-a19b-73f822f09f03` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "cdfbc366-d430-48df-9ee8-18e3973553cf:0",
      "order_id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
      "at": "2026-10-29T09:44:35.394182Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "cdfbc366-d430-48df-9ee8-18e3973553cf:1",
      "order_id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
      "at": "2026-10-29T09:44:35.396722Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "cdfbc366-d430-48df-9ee8-18e3973553cf:2",
      "order_id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
      "at": "2026-10-29T09:44:35.403593Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/9f3d66d7-415c-4379-a03a-f891bd61a4a0` → **200**

```json
{
  "found": []
}
```

Done: request fd775d61-1e89-43ba-a19b-73f822f09f03 — order cdfbc366-d430-48df-9ee8-18e3973553cf found by its id.

`GET /api/rider/v1/orders/cdfbc366-d430-48df-9ee8-18e3973553cf` → **200**

```json
{
  "id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3fe8a215-3284-4884-8bb7-959cf57efbe4",
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
  "created_at": "2026-10-29T09:44:35.393647Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cdfbc366-d430-48df-9ee8-18e3973553cf/cancel` → **200**

```json
{
  "command_id": "686af204-093b-4768-a270-c417a71e88ca",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cdfbc366-d430-48df-9ee8-18e3973553cf",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3fe8a215-3284-4884-8bb7-959cf57efbe4",
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
  "created_at": "2026-10-29T09:44:35.393647Z",
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
  "phone": "+380630039420",
  "device_ref": "sandbox-4651"
}
```

```json
{
  "challenge_id": "67c1002b-ed12-4903-b973-ba2e08416781",
  "expires_at": "2026-10-29T09:49:38.006850843Z",
  "resend_available_at": "2026-10-29T09:44:39.006850843Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630039420` → **200**

```json
{
  "phone": "+380630039420",
  "audience": "CLIENT",
  "code": "988755",
  "sent_at": "2026-10-29T09:44:38.009312171Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67c1002b-ed12-4903-b973-ba2e08416781",
  "code": "988755",
  "device_ref": "sandbox-4651"
}
```

```json
{
  "session_id": "c4873eb9-d9d8-4c35-af01-11fb05badf6c",
  "subject": {
    "type": "CLIENT",
    "id": "d8f8be97-8dbf-4ae2-b2ab-d9c1d443a1ff"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOGY4YmU5Ny04ZGJmLTRhZTItYjJhYi1kOWMxZDQ0M2ExZmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTc4LCJpYXQiOjE3OTMyNjcwNzgsImp0aSI6ImJjODg1MDE5LTQ0OTEtNGY5My1hNDBmLTY1MGU4NDdiZjFlZSIsInNpZCI6ImM0ODczZWI5LWQ5ZDgtNGMzNS1hZjAxLTExZmIwNWJhZGY2YyJ9.wx5zLJKJVXcaUORw0aJsmXrh6awFRRl9Q2ynrMH35cs",
  "access_expires_at": "2026-10-29T09:59:38.297046208Z",
  "refresh_token": "Bl2hyutB1WUEur3fzyBYuDhh1wpj14uHn1G-KWaQyrc",
  "refresh_expires_at": "2026-11-28T09:44:38.296495574Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "10be23d0-19c4-4ff2-b6dd-744c1da78593",
  "expires_at": "2026-10-29T09:49:40.564413191Z",
  "resend_available_at": "2026-10-29T09:44:41.564413191Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630039420` → **200**

```json
{
  "phone": "+380630039420",
  "audience": "CLIENT",
  "code": "872676",
  "sent_at": "2026-10-29T09:44:40.566717148Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "9ae536c1-3be2-4c48-9547-ff3c38de1747",
  "challenge_id": "10be23d0-19c4-4ff2-b6dd-744c1da78593",
  "otp_code": "872676"
}
```

```json
{
  "id": "105fd3c4-f336-401b-9b95-f7e7eec66d59",
  "state": "PENDING",
  "created_at": "2026-10-29T09:44:40.875541Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59` → **200**

```json
{
  "id": "105fd3c4-f336-401b-9b95-f7e7eec66d59",
  "state": "PENDING",
  "created_at": "2026-10-29T09:44:40.875541Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59` → **200**

```json
{
  "id": "105fd3c4-f336-401b-9b95-f7e7eec66d59",
  "state": "PENDING",
  "created_at": "2026-10-29T09:44:40.875541Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59` → **200**

```json
{
  "id": "105fd3c4-f336-401b-9b95-f7e7eec66d59",
  "state": "PENDING",
  "created_at": "2026-10-29T09:44:40.875541Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59` → **200**

```json
{
  "id": "105fd3c4-f336-401b-9b95-f7e7eec66d59",
  "state": "READY",
  "created_at": "2026-10-29T09:44:40.875541Z",
  "ready_at": "2026-10-29T09:44:44.612725Z",
  "expires_at": "2026-11-05T09:44:44.612725Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634630205",
  "device_ref": "sandbox-30928"
}
```

```json
{
  "challenge_id": "9469d98f-4665-488a-a053-5ac6a3729995",
  "expires_at": "2026-10-29T09:49:45.284867167Z",
  "resend_available_at": "2026-10-29T09:44:46.284867167Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634630205` → **200**

```json
{
  "phone": "+380634630205",
  "audience": "CLIENT",
  "code": "195739",
  "sent_at": "2026-10-29T09:44:45.28730476Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9469d98f-4665-488a-a053-5ac6a3729995",
  "code": "195739",
  "device_ref": "sandbox-30928"
}
```

```json
{
  "session_id": "f0751a34-97e2-4ace-a7c4-b44f0ba8a223",
  "subject": {
    "type": "CLIENT",
    "id": "3cf8929c-49d7-4b30-a6cc-acd723066aad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzY2Y4OTI5Yy00OWQ3LTRiMzAtYTZjYy1hY2Q3MjMwNjZhYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTg1LCJpYXQiOjE3OTMyNjcwODUsImp0aSI6ImE4NDA4NmI1LTE4NjktNGZkYi1hNjNiLTgzOWEwODdhMzE2MSIsInNpZCI6ImYwNzUxYTM0LTk3ZTItNGFjZS1hN2M0LWI0NGYwYmE4YTIyMyJ9.jSarOJZwohaf1Ngr_7COluQMPyVjQD3aCbxoNxcJr-A",
  "access_expires_at": "2026-10-29T09:59:45.582075715Z",
  "refresh_token": "iFw0KFC4WBSStJf_F5o3CwVrqA0tCSCGNiB2X1HyINc",
  "refresh_expires_at": "2026-11-28T09:44:45.581556485Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/105fd3c4-f336-401b-9b95-f7e7eec66d59/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f0387fc0-ada8-43e0-b9bc-caa0aec27dea"
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
  "session_id": "5ed06af2-4e5f-4864-aa19-2762a93d77e4",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5ODYsImlhdCI6MTc5MzI2NzA4NiwianRpIjoiMDc5ZjU0NzgtN2IyMy00YzJlLWIyNDMtMGJlNzljY2NkMTNiIiwic2lkIjoiNWVkMDZhZjItNGU1Zi00ODY0LWFhMTktMjc2MmE5M2Q3N2U0In0.2oP6_XAmuYEi_LCin-nxPwlCBQ5yEVolDW07S9_B8cA",
  "access_expires_at": "2026-10-29T09:59:46.416297407Z",
  "refresh_token": "RGdDINbx4VLDFbRCT8YgCXbJbn_yQlyiEj0sAXgYauk",
  "refresh_expires_at": "2026-10-29T21:44:46.415750695Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d8f8be97-8dbf-4ae2-b2ab-d9c1d443a1ff",
  "session_id": "c4873eb9-d9d8-4c35-af01-11fb05badf6c",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/d8f8be97-8dbf-4ae2-b2ab-d9c1d443a1ff/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "105fd3c4-f336-401b-9b95-f7e7eec66d59",
      "state": "READY",
      "created_at": "2026-10-29T09:44:40.875541Z",
      "ready_at": "2026-10-29T09:44:44.612725Z",
      "expires_at": "2026-11-05T09:44:44.612725Z",
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
  "device_ref": "sandbox-28765"
}
```

```json
{
  "challenge_id": "33223f2d-c4fe-4b00-bd91-41ff925c4884",
  "expires_at": "2026-10-29T09:49:47.245902681Z",
  "resend_available_at": "2026-10-29T09:44:48.245902681Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "245831",
  "sent_at": "2026-10-29T09:44:47.248560869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "33223f2d-c4fe-4b00-bd91-41ff925c4884",
  "code": "245831",
  "device_ref": "sandbox-28765"
}
```

```json
{
  "session_id": "a1e3b80c-c8b6-4036-97b2-b39e2f5ac6f1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzk4NywiaWF0IjoxNzkzMjY3MDg3LCJqdGkiOiJjMWMxYTY3MC1iMTUyLTRiMmYtYjM0Ny05MzZjOTUyMGZmNTAiLCJzaWQiOiJhMWUzYjgwYy1jOGI2LTQwMzYtOTdiMi1iMzllMmY1YWM2ZjEifQ.943ReuIP-RVCPZR1M2Ztfx75Ma8KYnoYetDdokkJ_m8",
  "access_expires_at": "2026-10-29T09:59:47.551599636Z",
  "refresh_token": "njvnyIPzSNqpHqc03ucqlUi1g3OMTistMCqDLbiOh7k",
  "refresh_expires_at": "2026-11-28T09:44:47.551090654Z",
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
  "device_ref": "sandbox-31969"
}
```

```json
{
  "challenge_id": "e2cccb4f-73d3-4bde-af6a-16e2417ac1d5",
  "expires_at": "2026-10-29T09:49:48.092468575Z",
  "resend_available_at": "2026-10-29T09:44:49.092468575Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "684685",
  "sent_at": "2026-10-29T09:44:48.095006325Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2cccb4f-73d3-4bde-af6a-16e2417ac1d5",
  "code": "684685",
  "device_ref": "sandbox-31969"
}
```

```json
{
  "session_id": "d6bffa51-a9b0-4d7a-be66-9624eaed84ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzk4OCwiaWF0IjoxNzkzMjY3MDg4LCJqdGkiOiI4ODNjNmIzYi00MjdhLTQyNGUtYTdjYS1kMzFkZTBmOGEyZGUiLCJzaWQiOiJkNmJmZmE1MS1hOWIwLTRkN2EtYmU2Ni05NjI0ZWFlZDg0ZmYifQ.Mvr80pJSfaHWwp4_7E8EWNX8ijoUS2iZwOMox6pnYtw",
  "access_expires_at": "2026-10-29T09:59:48.396004001Z",
  "refresh_token": "OZNO4j3noN34cgsgrFWtv7ABeDSCt4rnVCaDquOa00w",
  "refresh_expires_at": "2026-11-28T09:44:48.395436277Z",
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
  "command_id": "a25e3f52-16d6-4453-b397-9b83e4f23d6c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:44:48Z",
    "sequence": 1793267088940
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a1dca613-c61c-4d62-9cc9-126116341135",
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
  "last_heartbeat_at": "2026-10-29T09:44:48.958382Z",
  "last_location_at": "2026-10-29T09:44:48.958382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-7059"
}
```

```json
{
  "challenge_id": "bf8ddd6c-5c84-4d82-a08e-bfb8083a9e68",
  "expires_at": "2026-10-29T09:49:49.226706472Z",
  "resend_available_at": "2026-10-29T09:44:50.226706472Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "918668",
  "sent_at": "2026-10-29T09:44:49.229461869Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bf8ddd6c-5c84-4d82-a08e-bfb8083a9e68",
  "code": "918668",
  "device_ref": "sandbox-7059"
}
```

```json
{
  "session_id": "d11666ea-f886-4b36-bb95-68120ae50c96",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2Nzk4OSwiaWF0IjoxNzkzMjY3MDg5LCJqdGkiOiI2NWJiMmI0Zi1jYjNkLTQ0NTgtYWY1Ni01NTQ2YTY4NTI1YzMiLCJzaWQiOiJkMTE2NjZlYS1mODg2LTRiMzYtYmI5NS02ODEyMGFlNTBjOTYifQ.3rRUt_ob_cyuwWIvF7MdZIiFRCbXnyTWaKtowFd7XhM",
  "access_expires_at": "2026-10-29T09:59:49.524978887Z",
  "refresh_token": "syXbMRbupwg1YQ54BCL0bQqhqfb5f1ajNNxKQXfPy8Y",
  "refresh_expires_at": "2026-11-28T09:44:49.524392295Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7754f8b0-9111-4cf6-854f-3df165521288",
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
  "last_heartbeat_at": "2026-10-29T09:43:17.838577Z",
  "last_location_at": "2026-10-29T09:43:17.838577Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7754f8b0-9111-4cf6-854f-3df165521288/handover` → **200**

```json
{
  "command_id": "8559e1d3-3e91-4f49-a285-a3ff345fe474",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7754f8b0-9111-4cf6-854f-3df165521288",
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
  "last_heartbeat_at": "2026-10-29T09:43:17.838577Z",
  "last_location_at": "2026-10-29T09:43:17.838577Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/7754f8b0-9111-4cf6-854f-3df165521288/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:44:50Z",
    "sequence": 1793267090351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "7754f8b0-9111-4cf6-854f-3df165521288",
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
  "last_heartbeat_at": "2026-10-29T09:44:50.36903Z",
  "last_location_at": "2026-10-29T09:44:50.36903Z",
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
  "session_id": "42762654-dd64-4051-bdcb-c63058f500bb",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5OTAsImlhdCI6MTc5MzI2NzA5MCwianRpIjoiZjdjYmI1MDItMDAwZi00ZmYyLWI0YjUtZDE0NzkyNDA1ZmNhIiwic2lkIjoiNDI3NjI2NTQtZGQ2NC00MDUxLWJkY2ItYzYzMDU4ZjUwMGJiIn0.KJAcXqYivDo7ASXi2DhhFRAjtWkjj5zLdi_-4LVIUP8",
  "access_expires_at": "2026-10-29T09:59:50.933843958Z",
  "refresh_token": "LpPUteqbX65OQBW8tdCkMo6sangC5y-LWmjemwdisN4",
  "refresh_expires_at": "2026-10-29T21:44:50.933337511Z",
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
  "session_id": "aee0a648-c7ab-4b57-a723-ceeec75af4f3",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5OTEsImlhdCI6MTc5MzI2NzA5MSwianRpIjoiMDVhMDkxNTMtZjZiNy00OGY0LTgyZDEtOTk3MTBlMmUyMTlhIiwic2lkIjoiYWVlMGE2NDgtYzdhYi00YjU3LWE3MjMtY2VlZWM3NWFmNGYzIn0.i79PTvnIeuCXEx52WBX9-p66nVKqpyPIhkwBvutJ9tU",
  "access_expires_at": "2026-10-29T09:59:51.497432624Z",
  "refresh_token": "YfqA_I3uk3Sse5Brb6fbq8ujTI7vTeq9qEUhYCkeSJg",
  "refresh_expires_at": "2026-10-29T21:44:51.496932883Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686980780",
  "device_ref": "sandbox-29864"
}
```

```json
{
  "challenge_id": "adb16561-77f3-4611-8a7f-a7a3a28e0592",
  "expires_at": "2026-10-29T09:49:51.76864518Z",
  "resend_available_at": "2026-10-29T09:44:52.76864518Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686980780` → **200**

```json
{
  "phone": "+380686980780",
  "audience": "CLIENT",
  "code": "809014",
  "sent_at": "2026-10-29T09:44:51.771093682Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adb16561-77f3-4611-8a7f-a7a3a28e0592",
  "code": "809014",
  "device_ref": "sandbox-29864"
}
```

```json
{
  "session_id": "f6eabd8b-7770-4603-8560-c9e37ed132af",
  "subject": {
    "type": "CLIENT",
    "id": "a9bd9666-a2ee-4d67-81a6-d064cc445325"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWJkOTY2Ni1hMmVlLTRkNjctODFhNi1kMDY0Y2M0NDUzMjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTkyLCJpYXQiOjE3OTMyNjcwOTIsImp0aSI6ImMwYzBiNGI4LTU5NjctNDM5ZS04MjdkLTI4ZDNlMTI3MjY1NiIsInNpZCI6ImY2ZWFiZDhiLTc3NzAtNDYwMy04NTYwLWM5ZTM3ZWQxMzJhZiJ9.Ruh7nFibxh-ha8hZCoMOm1D_7ZfESrrvcoipWZudjVg",
  "access_expires_at": "2026-10-29T09:59:52.060809499Z",
  "refresh_token": "jwzFWH3rAfVrxz1BJTRFliCEfHVLtDo-4D5X1aE6Xgc",
  "refresh_expires_at": "2026-11-28T09:44:52.060340633Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "60b307ca-8a18-4191-899d-c61255ab9e71",
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
  "id": "3eb80c02-27d4-41b4-a547-5d91773d0bd9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:52.343126Z",
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
  "command_id": "85f97bb2-0179-456e-8c4f-642be81f0c60",
  "quote_id": "3eb80c02-27d4-41b4-a547-5d91773d0bd9",
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
  "id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a9bd9666-a2ee-4d67-81a6-d064cc445325",
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
  "created_at": "2026-10-29T09:44:52.639114Z",
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
    "id": "f0e1ab97-7c89-4645-a1b5-df1c81e46486",
    "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
    "expires_at": "2026-10-29T09:45:07.642358Z",
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

`POST /api/driver/v1/offers/f0e1ab97-7c89-4645-a1b5-df1c81e46486/reject` → **204**

```json
{
  "command_id": "2e68bd13-12af-415b-a417-25de2558fe89"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "900913d2-c082-4f7b-ac96-6ce2e784556b",
    "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
    "expires_at": "2026-10-29T09:45:08.206181Z",
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

`POST /api/driver/v1/offers/900913d2-c082-4f7b-ac96-6ce2e784556b/accept` → **200**

```json
{
  "command_id": "3aef20f5-5ed4-45a8-b5f6-94eeae463706"
}
```

```json
{
  "id": "84a1624d-1f85-4630-8b3d-986f402c00e4",
  "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "96678d91-d79a-412b-bce5-cdd73d66b6aa",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/4e3284b7-0567-437d-af4a-1a93f9e5e943/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:44:52.639607Z",
      "actor": {
        "type": "CLIENT",
        "id": "a9bd9666-a2ee-4d67-81a6-d064cc445325",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
        "quote_id": "3eb80c02-27d4-41b4-a547-5d91773d0bd9",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "ce6ab27f-6df8-4d17-ae4c-a0d7954892c2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:44:52.64157Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
        "attempt_id": "f04df249-9d50-4c75-a29a-181c05dce251",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "ce6ab27f-6df8-4d17-ae4c-a0d7954892c2"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:44:52.645268Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f0e1ab97-7c89-4645-a1b5-df1c81e46486",
        "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "ce6ab27f-6df8-4d17-ae4c-a0d7954892c2"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T09:44:53.205233Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f0e1ab97-7c89-4645-a1b5-df1c81e46486",
        "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943"
      },
      "correlation_id": "b363d659-e32c-49e5-82b9-5d199ae0e732"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 4e3284b7-0567-437d-af4a-1a93f9e5e943 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/4e3284b7-0567-437d-af4a-1a93f9e5e943` → **200**

```json
{
  "id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a9bd9666-a2ee-4d67-81a6-d064cc445325",
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
    "id": "84a1624d-1f85-4630-8b3d-986f402c00e4",
    "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "96678d91-d79a-412b-bce5-cdd73d66b6aa",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T09:44:52.639114Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4e3284b7-0567-437d-af4a-1a93f9e5e943/cancel` → **200**

```json
{
  "command_id": "3ebc3488-2794-4509-a0c0-c964d53c0e95",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "a9bd9666-a2ee-4d67-81a6-d064cc445325",
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
    "id": "84a1624d-1f85-4630-8b3d-986f402c00e4",
    "order_id": "4e3284b7-0567-437d-af4a-1a93f9e5e943",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "96678d91-d79a-412b-bce5-cdd73d66b6aa",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:44:52.639114Z",
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
  "session_id": "a1dca613-c61c-4d62-9cc9-126116341135",
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
  "last_heartbeat_at": "2026-10-29T09:44:48.958382Z",
  "last_location_at": "2026-10-29T09:44:48.958382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a1dca613-c61c-4d62-9cc9-126116341135/close` → **200**

```json
{
  "command_id": "3285418d-c09f-4d66-90aa-8341f110c36c",
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
  "session_id": "7754f8b0-9111-4cf6-854f-3df165521288",
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
  "last_heartbeat_at": "2026-10-29T09:44:50.36903Z",
  "last_location_at": "2026-10-29T09:44:50.36903Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/7754f8b0-9111-4cf6-854f-3df165521288/close` → **200**

```json
{
  "command_id": "42db33f1-ac3c-4690-bab6-67cea87e12d6",
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
  "session_id": "81151166-0465-45d3-b219-1865b0d131de",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjc5OTYsImlhdCI6MTc5MzI2NzA5NiwianRpIjoiZTUwYWM2ODItYmVkNC00N2UxLTg4YTQtYmQ3MTU0OGM0NzcwIiwic2lkIjoiODExNTExNjYtMDQ2NS00NWQzLWIyMTktMTg2NWIwZDEzMWRlIn0.zObhAepaRvP3PRVVaS6QTJRwY7hRBJLfBlZeGPftHR8",
  "access_expires_at": "2026-10-29T09:59:56.111279935Z",
  "refresh_token": "wXFP7he3Fsg9iNgDqcUdAJThkghTquvkpAXHLy-ZZAQ",
  "refresh_expires_at": "2026-10-29T21:44:56.110750025Z",
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
  "command_id": "153c5813-3204-4a47-9880-ef234bbc22fd",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T09:44:56.685749Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "15c116bc-d624-4a88-8d19-0b41290ab8d5",
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
  "correlation_id": "89139bc7-1ab8-464b-9c91-116cbc7e273d"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "e3404128-d1bb-4802-961a-b20111eaff61",
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
  "correlation_id": "62ecd2c3-a187-42dd-a9e8-6f3b05baa18a"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635193796",
  "device_ref": "sandbox-25979"
}
```

```json
{
  "challenge_id": "9c7ce074-cf54-490d-afc3-12a38eb21ca4",
  "expires_at": "2026-10-29T09:49:57.532610844Z",
  "resend_available_at": "2026-10-29T09:44:58.532610844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635193796` → **200**

```json
{
  "phone": "+380635193796",
  "audience": "CLIENT",
  "code": "984547",
  "sent_at": "2026-10-29T09:44:57.535121485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c7ce074-cf54-490d-afc3-12a38eb21ca4",
  "code": "984547",
  "device_ref": "sandbox-25979"
}
```

```json
{
  "session_id": "f9a9f609-aa1c-48e3-bc84-b35369248dd6",
  "subject": {
    "type": "CLIENT",
    "id": "3e0d2b7d-b2f8-48f6-a661-f0455a0cafbf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTBkMmI3ZC1iMmY4LTQ4ZjYtYTY2MS1mMDQ1NWEwY2FmYmYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3OTk3LCJpYXQiOjE3OTMyNjcwOTcsImp0aSI6IjIxMDgyOTE5LTExNTktNDQzZC1hMmRjLWJkMmJlNDNiYzNiMSIsInNpZCI6ImY5YTlmNjA5LWFhMWMtNDhlMy1iYzg0LWIzNTM2OTI0OGRkNiJ9.77HK9W8z9UU-inW0Co6DV-8c-PN0YXq6cIES3rFIu9A",
  "access_expires_at": "2026-10-29T09:59:57.83291553Z",
  "refresh_token": "2_cgJu5Opmq4wZTQGp6RBO9BYdCKAM7NGfR-dx_Sa04",
  "refresh_expires_at": "2026-11-28T09:44:57.832393826Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab140054-1d80-439e-9654-2814cc78ef64",
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
  "id": "947b2fb5-948b-4000-be0c-c1b3ed4d74e5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:49:58.108737Z",
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
  "command_id": "68d48161-4735-411f-b8d7-ef067a58a571",
  "quote_id": "947b2fb5-948b-4000-be0c-c1b3ed4d74e5",
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
  "correlation_id": "228e7e55-8f8d-40ff-a6cc-1f977246c90a"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "726dcbe9-0de6-4355-a755-93898c52a63b",
  "quote_id": "947b2fb5-948b-4000-be0c-c1b3ed4d74e5",
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
  "id": "c1af0c93-e171-4d44-880b-93bd1a1bc52a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3e0d2b7d-b2f8-48f6-a661-f0455a0cafbf",
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
  "created_at": "2026-10-29T09:44:58.683728Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c1af0c93-e171-4d44-880b-93bd1a1bc52a/cancel` → **200**

```json
{
  "command_id": "6c4c3c3e-57ee-4b51-b3e0-1da6907229a9",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c1af0c93-e171-4d44-880b-93bd1a1bc52a",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e0d2b7d-b2f8-48f6-a661-f0455a0cafbf",
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
  "created_at": "2026-10-29T09:44:58.683728Z",
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

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "841d000a-344f-4b38-b026-7f034471e11c",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T09:44:59.275699Z"
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
      "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T09:44:59.275699Z"
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
  "device_ref": "sandbox-4520"
}
```

```json
{
  "challenge_id": "91705efe-a47e-4a41-bfd3-c11845f0a0c4",
  "expires_at": "2026-10-29T09:50:00.114017842Z",
  "resend_available_at": "2026-10-29T09:45:01.114017842Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "274084",
  "sent_at": "2026-10-29T09:45:00.116752459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91705efe-a47e-4a41-bfd3-c11845f0a0c4",
  "code": "274084",
  "device_ref": "sandbox-4520"
}
```

```json
{
  "session_id": "6185dd88-d8f4-413e-a52e-ed0454b7f0c3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODAwMCwiaWF0IjoxNzkzMjY3MTAwLCJqdGkiOiI3ZDk4ZjVmOS05ZWEzLTQyYTEtOWM0MC1mOTNhYWRmMGRhODYiLCJzaWQiOiI2MTg1ZGQ4OC1kOGY0LTQxM2UtYTUyZS1lZDA0NTRiN2YwYzMifQ.xwps7HLsFt517M9g-bgzohVhcFGtclZ8JvzodwFv-Vc",
  "access_expires_at": "2026-10-29T10:00:00.408926287Z",
  "refresh_token": "pxPRfwOsYLQtl0RX-brC9HG3kG-UrrQRq8LWowy9N0g",
  "refresh_expires_at": "2026-11-28T09:45:00.408376269Z",
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
  "command_id": "137cb7cb-5904-4259-888d-1fb302d95e8d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:00Z",
    "sequence": 1793267100951
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:00.969584Z",
  "last_location_at": "2026-10-29T09:45:00.969584Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672988374",
  "device_ref": "sandbox-11892"
}
```

```json
{
  "challenge_id": "ad504fb3-8299-4fe0-834a-abefa2c58a7f",
  "expires_at": "2026-10-29T09:50:01.239191116Z",
  "resend_available_at": "2026-10-29T09:45:02.239191116Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672988374` → **200**

```json
{
  "phone": "+380672988374",
  "audience": "CLIENT",
  "code": "116922",
  "sent_at": "2026-10-29T09:45:01.24209144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad504fb3-8299-4fe0-834a-abefa2c58a7f",
  "code": "116922",
  "device_ref": "sandbox-11892"
}
```

```json
{
  "session_id": "a06bd245-c625-47c0-9c05-04ae5d400bc1",
  "subject": {
    "type": "CLIENT",
    "id": "ad13b80b-f79e-4ef3-b0ce-5b3aad8ef09c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZDEzYjgwYi1mNzllLTRlZjMtYjBjZS01YjNhYWQ4ZWYwOWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDAxLCJpYXQiOjE3OTMyNjcxMDEsImp0aSI6IjEzNGMzMWZmLTQ5NWMtNGJmNi1hOGEzLWJmNGNhOWRiOTdiZSIsInNpZCI6ImEwNmJkMjQ1LWM2MjUtNDdjMC05YzA1LTA0YWU1ZDQwMGJjMSJ9.M6YUc3IqcaGyQ7BPn_FbyP_9bXYu0axlZQojjHfvjBU",
  "access_expires_at": "2026-10-29T10:00:01.558373154Z",
  "refresh_token": "BJpWOj_rzWH7IujBoRDdT_1R8x7XpD5lFR4VwfHtEgo",
  "refresh_expires_at": "2026-11-28T09:45:01.557867208Z",
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
  "command_id": "0ea4b30c-b4ec-4b4b-8cbd-0fd5317526ef",
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
  "id": "056ed122-e6ec-4cb7-8b4a-2f2de1c94cf0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:02.100513Z",
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
  "command_id": "8e096847-68b9-4ce5-a78a-90dcf4bb4e7c",
  "platform": "ANDROID",
  "token": "sandbox-driver-5cde7d0a-c4a2-4d87-a357-df374af26a06"
}
```

```json
{
  "id": "09f5e5cb-886a-4e6c-8d6a-a1276571532d",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T09:45:02.387052Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "1373a37e-820d-4b01-a821-46efeb66a957",
  "platform": "ANDROID",
  "token": "sandbox-rider-ec2d0a38-c36f-475f-9772-170898ff1f29"
}
```

```json
{
  "id": "776ff80f-0d1e-417a-a036-39c9ef70fe40",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T09:45:02.663795Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4dd59c8a-caf6-48c1-91c3-41a3ac92d413",
  "quote_id": "056ed122-e6ec-4cb7-8b4a-2f2de1c94cf0",
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
  "id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ad13b80b-f79e-4ef3-b0ce-5b3aad8ef09c",
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
  "created_at": "2026-10-29T09:45:02.951506Z",
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
    "id": "b34319d4-5875-4c81-ab37-679058547f48",
    "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
    "expires_at": "2026-10-29T09:45:17.954457Z",
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

`POST /api/driver/v1/offers/b34319d4-5875-4c81-ab37-679058547f48/accept` → **200**

```json
{
  "command_id": "ef792a07-f9c0-4b9f-a3bc-07786e95b3a0"
}
```

```json
{
  "id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T09:45:02.927Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T09:45:02.927Z` → **200**

```json
[
  {
    "at": "2026-10-29T09:45:04.043749016Z",
    "token_suffix": "f26a06",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
      "order_version": "2",
      "event_id": "8071714b-4ce8-475e-9658-255756d77721"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380672988374&after=2026-10-29T09:45:02.927Z` → **200**

```json
[
  {
    "at": "2026-10-29T09:45:04.04616963Z",
    "token_suffix": "ff1f29",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
      "order_version": "3",
      "event_id": "fa8c0f0b-303a-43cc-95d1-50460b5b9ede"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52/messages` → **201**

```json
{
  "command_id": "5d7c74fd-0156-4e0b-a0f8-ff3320da6512",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "dbe66233-4b36-415c-917c-b44dfeea2b6c",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T09:45:04.884095679Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "assignment_id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
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

`POST /api/driver/v1/trips/4dd19614-0ab8-4bfb-969d-b82f835058b4/messages` → **201**

```json
{
  "command_id": "0e935eb4-13a0-4015-bf43-97b1d57b9830",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "94ebb07e-3662-4b6c-9fe1-be08acc9cc5a",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T09:45:05.413946873Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/4dd19614-0ab8-4bfb-969d-b82f835058b4/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380672988374"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:06Z",
    "sequence": 1793267106210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:06.228723Z",
  "last_location_at": "2026-10-29T09:45:06.228723Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "assignment_id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
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

`POST /api/driver/v1/trips/4dd19614-0ab8-4bfb-969d-b82f835058b4/arrive` → **200**

```json
{
  "command_id": "ce7a07dd-d0a7-438e-b072-fd6d8bda4a46",
  "expected_version": 0
}
```

```json
{
  "id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "assignment_id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
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
  "arrived_at": "2026-10-29T09:45:06.778692Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4dd19614-0ab8-4bfb-969d-b82f835058b4/start` → **200**

```json
{
  "command_id": "28d3a426-4eaa-43fb-8468-e19451e6771c",
  "expected_version": 1
}
```

```json
{
  "id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "assignment_id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
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
  "arrived_at": "2026-10-29T09:45:06.778692Z",
  "started_at": "2026-10-29T09:45:07.066782Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:07Z",
    "sequence": 1793267107349
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:07.367523Z",
  "last_location_at": "2026-10-29T09:45:07.367523Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/4dd19614-0ab8-4bfb-969d-b82f835058b4/complete` → **200**

```json
{
  "command_id": "9e9aa9a4-99ff-4f52-844b-c2764039fa0c",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:45:07Z",
  "cash_received": true
}
```

```json
{
  "id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "assignment_id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
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
  "arrived_at": "2026-10-29T09:45:06.778692Z",
  "started_at": "2026-10-29T09:45:07.066782Z",
  "completed_at": "2026-10-29T09:45:07.650574Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52` → **200**

```json
{
  "id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ad13b80b-f79e-4ef3-b0ce-5b3aad8ef09c",
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
    "id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6",
    "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:45:02.951506Z",
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
    "id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T09:45:02.951506Z",
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
    "id": "4dd19614-0ab8-4bfb-969d-b82f835058b4",
    "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
    "order_short_number": 13,
    "created_at": "2026-10-29T09:45:03.515684Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5ea45472-6843-4773-b920-2e61010b093e",
    "order_id": "2f8cdf37-adc6-4762-a4b0-166b6a045b42",
    "order_short_number": 8,
    "created_at": "2026-10-29T09:43:52.490368Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "b3540eee-5f58-4a5e-aff5-92cfc1811e31",
    "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
    "order_short_number": 3,
    "created_at": "2026-10-29T09:43:08.675497Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "bc7abcce-0a86-4ced-a64c-9b27720f078a",
    "order_id": "e1fb866b-2057-44dc-a732-a7fcf64cc4f4",
    "order_short_number": 2,
    "created_at": "2026-10-29T09:42:49.641978Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3287d9ab-8dee-4a98-9469-d868d17fa6a0",
    "order_id": "a6433619-a21c-4193-90d2-fa58f9de5563",
    "order_short_number": 1,
    "created_at": "2026-10-29T09:42:40.192088Z",
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

`GET /api/rider/v1/orders/b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52/tip` → **200**

```json
{
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
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
  "available_until": "2026-10-30T09:45:07.650574Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52/tip` → **201**

```json
{
  "command_id": "6cc034c4-86ed-41d4-a21d-78140babf5b3",
  "amount_minor": 1100
}
```

```json
{
  "id": "d99732ab-d902-47d2-851b-f177873f10f8",
  "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T09:45:12.618481Z"
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
  "session_id": "213e7ae6-dc8a-43bb-a85f-463576505390",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMTMsImlhdCI6MTc5MzI2NzExMywianRpIjoiZmQwZjMzZTQtNzY1Mi00ZGNiLWIzNzUtZDJkODliNjJjNDA5Iiwic2lkIjoiMjEzZTdhZTYtZGM4YS00M2JiLWE4NWYtNDYzNTc2NTA1MzkwIn0.qKBkT7Ag7MVKSmoXSqigNB3YAqe4KVx69S8bOYS_Z1s",
  "access_expires_at": "2026-10-29T10:00:13.197445989Z",
  "refresh_token": "Gy1dyXuoxajP6wh-QlK8_YMmRqdjCacSXkRWXINIHps",
  "refresh_expires_at": "2026-10-29T21:45:13.196971753Z",
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
          "CASH": 11,
          "CARD": 2
        },
        "cancelled_by": {
          "DRIVER": 1,
          "STAFF": 1,
          "RIDER": 3
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
      "CASH": 11,
      "CARD": 2
    },
    "cancelled_by": {
      "DRIVER": 1,
      "STAFF": 1,
      "RIDER": 3
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
  "generated_at": "2026-10-29T09:45:13.481198145Z"
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
  "generated_at": "2026-10-29T09:45:13.780929245Z"
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
  "session_id": "324b4ecc-dd6d-4dfe-ae2d-cb3d5fecf15e",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMTQsImlhdCI6MTc5MzI2NzExNCwianRpIjoiMzk3NDQ4ZjMtMzA5My00MTFiLWJiMjQtNTYxMzc1YjAzN2NiIiwic2lkIjoiMzI0YjRlY2MtZGQ2ZC00ZGZlLWFlMmQtY2IzZDVmZWNmMTVlIn0.k3ytjGLZCkcD8G6Cn_E2TVm_OhzuuADNku9FJ4qCNMQ",
  "access_expires_at": "2026-10-29T10:00:14.357950023Z",
  "refresh_token": "5H8LwgVBfNQN9X9ypa_6ODMDYCOvSQs_CJVCbz0l-88",
  "refresh_expires_at": "2026-10-29T21:45:14.357293668Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:45:02.952009Z",
      "actor": {
        "type": "CLIENT",
        "id": "ad13b80b-f79e-4ef3-b0ce-5b3aad8ef09c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
        "quote_id": "056ed122-e6ec-4cb7-8b4a-2f2de1c94cf0",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "5a86dfa1-eafc-452d-a77a-3725ea14726d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:45:02.953734Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
        "attempt_id": "a8930d90-a635-48ea-8e49-0b05d53b6a98",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "5a86dfa1-eafc-452d-a77a-3725ea14726d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:45:02.957007Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b34319d4-5875-4c81-ab37-679058547f48",
        "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "5a86dfa1-eafc-452d-a77a-3725ea14726d"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:45:03.517625Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b34319d4-5875-4c81-ab37-679058547f48",
        "order_id": "b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "cd9d51b3-e114-46b1-98fa-f10e38c71fa6"
      },
      "correlation_id": "1594e3f9-157c-497f-bddc-48c2a483d2c6"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T09:45:14.92469747Z",
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
      "last_location_at": "2026-10-29T09:45:07.367523Z",
      "order_id": null
    }
  ]
}
```

Done: order b7d2eed1-26b6-44f9-b3e8-6c92d6d57f52.

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
  "session_id": "f59e9d4c-b772-4542-8ea8-83789a068607",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMTUsImlhdCI6MTc5MzI2NzExNSwianRpIjoiZjMzYTM1MjUtNjIwZS00OTdiLTgzM2MtNzZjODE3NTgwOTVhIiwic2lkIjoiZjU5ZTlkNGMtYjc3Mi00NTQyLThlYTgtODM3ODlhMDY4NjA3In0.GXIFvxQcHBLASGyQmBydFkiFR4IkskOapCFDTU0F5Iw",
  "access_expires_at": "2026-10-29T10:00:15.506495525Z",
  "refresh_token": "2Bh4YeMK29E1trrwNYgz0kxki-LpnAJ03FJ3O1AF8N8",
  "refresh_expires_at": "2026-10-29T21:45:15.505994569Z",
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
  "command_id": "2aa4b91c-cddc-43d2-ab68-3cc25069e85e",
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
  "timestamp": "2026-10-29T09:45:16.000+0000",
  "channel": {
    "id": "1730052000.2985010400",
    "linkedid": "1730052000.2985010400",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678772501"
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
  "timestamp": "2026-10-29T09:45:16.000+0000",
  "channel": {
    "id": "1730052000.2985010400",
    "linkedid": "1730052000.2985010400",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678772501"
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
  "session_id": "322e7b6a-a8f4-4a57-b7dd-81ee8458fe0a",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMTYsImlhdCI6MTc5MzI2NzExNiwianRpIjoiM2Y1ZjM1ODMtOGY3MC00YzdjLWE5NDUtYmVlN2NiYjQxYmY0Iiwic2lkIjoiMzIyZTdiNmEtYThmNC00YTU3LWI3ZGQtODFlZTg0NThmZTBhIn0.yhnvmWahyhgaxyOT4SPM_yZyowL59PPgOOXwEFa4h1k",
  "access_expires_at": "2026-10-29T10:00:16.656731051Z",
  "refresh_token": "Fmxdt43bO1XXhoaQEQk_43EGc80AsNaM_lVAljgnYaQ",
  "refresh_expires_at": "2026-10-29T21:45:16.656238981Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "034d585d-a08b-4ce4-96b5-7d9cb8f83d0a",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678772501",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:45:16Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/034d585d-a08b-4ce4-96b5-7d9cb8f83d0a/answer` → **200**

```json
{
  "command_id": "6dac3b9a-dfe0-4ca8-ba3a-b94e9d52564d"
}
```

```json
{
  "id": "034d585d-a08b-4ce4-96b5-7d9cb8f83d0a",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678772501",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "order_ids": [],
  "started_at": "2026-10-29T09:45:16Z",
  "answered_at": "2026-10-29T09:45:17.226328Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2985010400",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "f454b463-b69b-4e78-997b-af2056d8b7bb",
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
  "id": "9cde2b1d-2541-4c73-b7bf-f45793b59bb4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:17.528709Z",
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
  "command_id": "b309c428-03c4-4d07-8132-60b0907b3049",
  "quote_id": "9cde2b1d-2541-4c73-b7bf-f45793b59bb4",
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
    "phone": "+380678772501"
  },
  "call_id": "034d585d-a08b-4ce4-96b5-7d9cb8f83d0a"
}
```

```json
{
  "id": "aaa4848e-830b-47b5-9136-980a06483b5e",
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
  "created_at": "2026-10-29T09:45:17.817091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678772501"
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
    "id": "1730052000.2985010400",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "034d585d-a08b-4ce4-96b5-7d9cb8f83d0a",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678772501",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [
        "aaa4848e-830b-47b5-9136-980a06483b5e"
      ],
      "started_at": "2026-10-29T09:45:16Z",
      "answered_at": "2026-10-29T09:45:17.226328Z",
      "ended_at": "2026-10-29T09:45:18.12986Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "a50fce79-1553-492c-86b8-eb104f8631d0",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678069369",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [],
      "started_at": "2026-10-29T09:42:57.610957Z",
      "answered_at": "2026-10-29T09:42:57.923906Z",
      "ended_at": "2026-10-29T09:42:58.230233Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:43:04.595303Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/aaa4848e-830b-47b5-9136-980a06483b5e` → **200**

```json
{
  "id": "aaa4848e-830b-47b5-9136-980a06483b5e",
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
  "created_at": "2026-10-29T09:45:17.817091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678772501"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/aaa4848e-830b-47b5-9136-980a06483b5e` → **200**

```json
{
  "id": "aaa4848e-830b-47b5-9136-980a06483b5e",
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
  "created_at": "2026-10-29T09:45:17.817091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678772501"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/aaa4848e-830b-47b5-9136-980a06483b5e/cancel` → **200**

```json
{
  "command_id": "a1f98701-c04f-420d-b3a3-5e90285eb55d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "aaa4848e-830b-47b5-9136-980a06483b5e",
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
  "created_at": "2026-10-29T09:45:17.817091Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678772501"
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

Done: call 034d585d-a08b-4ce4-96b5-7d9cb8f83d0a with order aaa4848e-830b-47b5-9136-980a06483b5e.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25265"
}
```

```json
{
  "challenge_id": "60600063-4528-4e29-8288-c00006fe6a47",
  "expires_at": "2026-10-29T09:50:19.348983419Z",
  "resend_available_at": "2026-10-29T09:45:20.348983419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "763383",
  "sent_at": "2026-10-29T09:45:19.351615294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "60600063-4528-4e29-8288-c00006fe6a47",
  "code": "763383",
  "device_ref": "sandbox-25265"
}
```

```json
{
  "session_id": "ae7b3451-122e-47fe-933f-7c2bd2498f5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODAxOSwiaWF0IjoxNzkzMjY3MTE5LCJqdGkiOiJjOGM1Nzc0ZS04YmJmLTQyOTUtYmM2OS1iZjEwNjA2YTUwYTIiLCJzaWQiOiJhZTdiMzQ1MS0xMjJlLTQ3ZmUtOTMzZi03YzJiZDI0OThmNWIifQ.n2wc4jiupbBC181jYFBRLHhgqThxJwCxzvKYlqnmYFc",
  "access_expires_at": "2026-10-29T10:00:19.64729189Z",
  "refresh_token": "dg_nSju6e28EN5CU6NSgY56TYrRReI7SwtqJNVgOP9Y",
  "refresh_expires_at": "2026-11-28T09:45:19.646663956Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:07.367523Z",
  "last_location_at": "2026-10-29T09:45:07.367523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/handover` → **200**

```json
{
  "command_id": "1cdef180-cc56-456e-9a54-a6a683361993",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:07.367523Z",
  "last_location_at": "2026-10-29T09:45:07.367523Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:20Z",
    "sequence": 1793267120470
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:20.488973Z",
  "last_location_at": "2026-10-29T09:45:20.488973Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665380384",
  "device_ref": "sandbox-23352"
}
```

```json
{
  "challenge_id": "09efc31b-e798-4b71-a09c-5aad1ae946f2",
  "expires_at": "2026-10-29T09:50:20.764083365Z",
  "resend_available_at": "2026-10-29T09:45:21.764083365Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665380384` → **200**

```json
{
  "phone": "+380665380384",
  "audience": "CLIENT",
  "code": "999513",
  "sent_at": "2026-10-29T09:45:20.766646247Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09efc31b-e798-4b71-a09c-5aad1ae946f2",
  "code": "999513",
  "device_ref": "sandbox-23352"
}
```

```json
{
  "session_id": "42bbfbe1-5d14-4554-b796-75b64232cbaa",
  "subject": {
    "type": "CLIENT",
    "id": "78f7288a-761a-45b6-9fa1-1ebaf9826024"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OGY3Mjg4YS03NjFhLTQ1YjYtOWZhMS0xZWJhZjk4MjYwMjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDIxLCJpYXQiOjE3OTMyNjcxMjEsImp0aSI6IjMwYjE0MzM2LWIwZDItNGZjOC04YWFkLTE2NDQwMzA1N2YxNCIsInNpZCI6IjQyYmJmYmUxLTVkMTQtNDU1NC1iNzk2LTc1YjY0MjMyY2JhYSJ9.MyzJK4uBXB95GYBkt-RTyTIiyTRsoTrk6bas8jQpZ-A",
  "access_expires_at": "2026-10-29T10:00:21.067733906Z",
  "refresh_token": "ZjYk08E3KVYmXuFL7kI036o9d8j_8OEUDErO7G6Bl4w",
  "refresh_expires_at": "2026-11-28T09:45:21.067258247Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ffcbaa9d-7557-43b2-9145-2ed593aaac39",
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
  "id": "df7d4531-b3f2-40c3-ab52-5ee8253c489f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:21.344914Z",
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
  "command_id": "6b647223-9747-46f2-8232-4c0f6631c9f0",
  "quote_id": "df7d4531-b3f2-40c3-ab52-5ee8253c489f",
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
  "id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "78f7288a-761a-45b6-9fa1-1ebaf9826024",
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
  "created_at": "2026-10-29T09:45:21.646126Z",
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
    "id": "48fb1d40-5419-4624-b614-7ecf43f4bc1a",
    "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
    "expires_at": "2026-10-29T09:45:36.649867Z",
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

`POST /api/driver/v1/offers/48fb1d40-5419-4624-b614-7ecf43f4bc1a/accept` → **200**

```json
{
  "command_id": "efa79d88-d5d7-4675-907d-3c789679798f"
}
```

```json
{
  "id": "78a42959-54a3-484f-aa08-dbc749114791",
  "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad",
  "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
  "assignment_id": "78a42959-54a3-484f-aa08-dbc749114791",
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

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:22Z",
    "sequence": 1793267122754
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:22.772427Z",
  "last_location_at": "2026-10-29T09:45:22.772427Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad/arrive` → **200**

```json
{
  "command_id": "12fd4b32-279e-4aca-8469-7df055333183",
  "expected_version": 0
}
```

```json
{
  "id": "385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad",
  "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
  "assignment_id": "78a42959-54a3-484f-aa08-dbc749114791",
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
  "arrived_at": "2026-10-29T09:45:23.057918Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad/start` → **200**

```json
{
  "command_id": "c6f262d3-1024-4cd5-8b25-61d698cdc014",
  "expected_version": 1
}
```

```json
{
  "id": "385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad",
  "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
  "assignment_id": "78a42959-54a3-484f-aa08-dbc749114791",
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
  "arrived_at": "2026-10-29T09:45:23.057918Z",
  "started_at": "2026-10-29T09:45:23.353287Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:23Z",
    "sequence": 1793267123624
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:23.642529Z",
  "last_location_at": "2026-10-29T09:45:23.642529Z",
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
  "device_ref": "sandbox-27782"
}
```

```json
{
  "challenge_id": "725666bf-12ea-483e-890e-7b29dd41a7b5",
  "expires_at": "2026-10-29T09:50:23.914748656Z",
  "resend_available_at": "2026-10-29T09:45:24.914748656Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "438641",
  "sent_at": "2026-10-29T09:45:23.918034667Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "725666bf-12ea-483e-890e-7b29dd41a7b5",
  "code": "438641",
  "device_ref": "sandbox-27782"
}
```

```json
{
  "session_id": "8c7749c5-bfad-4033-86dd-c9b8dc561f41",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODAyNCwiaWF0IjoxNzkzMjY3MTI0LCJqdGkiOiI5M2M2ZjYxNy1kMGQ2LTQ5ZTUtYjQ1Mi1kOWRkOWY0OTcyNjEiLCJzaWQiOiI4Yzc3NDljNS1iZmFkLTQwMzMtODZkZC1jOWI4ZGM1NjFmNDEifQ.tk4jOURB74x5zEp5wFO45BYsNJ07X0ALlGxB-esEZdw",
  "access_expires_at": "2026-10-29T10:00:24.21457251Z",
  "refresh_token": "9WNuxbRkSeRxL5esLtFog6gTKEg1VZx1ecHeNtq1Gzk",
  "refresh_expires_at": "2026-11-28T09:45:24.214063769Z",
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
  "command_id": "6e6da796-d299-44f6-8192-2d7a8682de03",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:24Z",
    "sequence": 1793267124770
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "aa933f2c-f6cb-4faf-b1d4-df30d6138541",
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
  "last_heartbeat_at": "2026-10-29T09:45:24.788942Z",
  "last_location_at": "2026-10-29T09:45:24.788942Z",
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
  "session_id": "a28e04e6-0153-492f-9fff-89870b5ab7da",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMjUsImlhdCI6MTc5MzI2NzEyNSwianRpIjoiMGY3NDk2MzUtODBmMS00MjEyLTgyNzQtODBjNmU1MWY5MjQ4Iiwic2lkIjoiYTI4ZTA0ZTYtMDE1My00OTJmLTlmZmYtODk4NzBiNWFiN2RhIn0.N8aOpwXzeKtArRgJuukdy115WvpLd8jZeUcQWO0Agcg",
  "access_expires_at": "2026-10-29T10:00:25.369948074Z",
  "refresh_token": "RCxSUtDhVWPMsH6vhDyxBsD4Qpks8wshpPtb5weUrqM",
  "refresh_expires_at": "2026-10-29T21:45:25.369390549Z",
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
  "session_id": "bfe92f0d-9701-43f1-9bde-072bd6fe3af9",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMjUsImlhdCI6MTc5MzI2NzEyNSwianRpIjoiNDJlMDNmNjMtNGQyZC00YmVhLWJjY2UtNmM2MTM0OGE3YjkxIiwic2lkIjoiYmZlOTJmMGQtOTcwMS00M2YxLTliZGUtMDcyYmQ2ZmUzYWY5In0.6VW9iFAwRZVUwYlU4utNTdF_RFWszHsimfejuJ3R5PI",
  "access_expires_at": "2026-10-29T10:00:25.931208004Z",
  "refresh_token": "o9fRhcdxQsdtf8nv13chlPvcAWs9r6aPKB1yvQSg_c4",
  "refresh_expires_at": "2026-10-29T21:45:25.930191254Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5` → **200**

```json
{
  "id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "78f7288a-761a-45b6-9fa1-1ebaf9826024",
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
    "id": "78a42959-54a3-484f-aa08-dbc749114791",
    "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T09:45:21.646126Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5/interrupt` → **200**

```json
{
  "command_id": "8fb68e8e-581c-4e35-a106-bc0156a91a5b",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "78f7288a-761a-45b6-9fa1-1ebaf9826024",
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
      "id": "78a42959-54a3-484f-aa08-dbc749114791",
      "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "385a3d53-35a2-40c8-b4fe-7b7ed45ab5ad",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T09:45:21.646126Z",
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
    "id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "78f7288a-761a-45b6-9fa1-1ebaf9826024",
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
    "id": "f70dfc83-48cd-4f9e-a522-a952db4615d5",
    "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
    "expires_at": "2026-10-29T09:45:41.52397Z",
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

`POST /api/driver/v1/offers/f70dfc83-48cd-4f9e-a522-a952db4615d5/accept` → **200**

```json
{
  "command_id": "b16ed1d6-9972-40aa-9efa-23fdfb7d2350"
}
```

```json
{
  "id": "70683ad5-6c1c-41e2-b5a4-bd37fe22743e",
  "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2ab47568-060f-4637-b69d-1b1962ec8892",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2ab47568-060f-4637-b69d-1b1962ec8892",
  "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
  "assignment_id": "70683ad5-6c1c-41e2-b5a4-bd37fe22743e",
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
  "session_id": "aa933f2c-f6cb-4faf-b1d4-df30d6138541",
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
  "last_heartbeat_at": "2026-10-29T09:45:24.788942Z",
  "last_location_at": "2026-10-29T09:45:24.788942Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/aa933f2c-f6cb-4faf-b1d4-df30d6138541/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:27Z",
    "sequence": 1793267127964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "aa933f2c-f6cb-4faf-b1d4-df30d6138541",
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
  "last_heartbeat_at": "2026-10-29T09:45:27.982775Z",
  "last_location_at": "2026-10-29T09:45:27.982775Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2ab47568-060f-4637-b69d-1b1962ec8892/arrive` → **200**

```json
{
  "command_id": "d84870af-e009-4c90-aff8-f8ee6ac4e2aa",
  "expected_version": 0
}
```

```json
{
  "id": "2ab47568-060f-4637-b69d-1b1962ec8892",
  "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
  "assignment_id": "70683ad5-6c1c-41e2-b5a4-bd37fe22743e",
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
  "arrived_at": "2026-10-29T09:45:28.255429Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2ab47568-060f-4637-b69d-1b1962ec8892/start` → **200**

```json
{
  "command_id": "8a8fe5fa-e5b4-4323-86cc-7d212f72dcf4",
  "expected_version": 1
}
```

```json
{
  "id": "2ab47568-060f-4637-b69d-1b1962ec8892",
  "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
  "assignment_id": "70683ad5-6c1c-41e2-b5a4-bd37fe22743e",
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
  "arrived_at": "2026-10-29T09:45:28.255429Z",
  "started_at": "2026-10-29T09:45:28.541002Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2ab47568-060f-4637-b69d-1b1962ec8892/complete` → **200**

```json
{
  "command_id": "c1a465b2-218e-457e-9f50-4e2ac4e346df",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:45:28Z"
}
```

```json
{
  "id": "2ab47568-060f-4637-b69d-1b1962ec8892",
  "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
  "assignment_id": "70683ad5-6c1c-41e2-b5a4-bd37fe22743e",
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
  "arrived_at": "2026-10-29T09:45:28.255429Z",
  "started_at": "2026-10-29T09:45:28.541002Z",
  "completed_at": "2026-10-29T09:45:28.833443Z",
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
    "id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T09:45:26.514781Z",
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
    "id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:45:21.646126Z",
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

`GET /api/operator/v1/orders/f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:45:21.646744Z",
      "actor": {
        "type": "CLIENT",
        "id": "78f7288a-761a-45b6-9fa1-1ebaf9826024",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
        "quote_id": "df7d4531-b3f2-40c3-ab52-5ee8253c489f",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "1a693613-518d-4da6-b36d-34cfa85e82c1"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:45:21.649015Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
        "attempt_id": "68538e1d-81f7-44c8-bf09-030a75b91eb9",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1a693613-518d-4da6-b36d-34cfa85e82c1"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:45:21.65228Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "48fb1d40-5419-4624-b614-7ecf43f4bc1a",
        "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "1a693613-518d-4da6-b36d-34cfa85e82c1"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:45:22.214656Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "48fb1d40-5419-4624-b614-7ecf43f4bc1a",
        "order_id": "f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "78a42959-54a3-484f-aa08-dbc749114791"
      },
      "correlation_id": "f89b7763-ad18-4c41-9d7d-e9526ac00f36"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/29dda734-e2ed-4f83-8e42-4cade0d4ce44/tip` → **200**

```json
{
  "order_id": "29dda734-e2ed-4f83-8e42-4cade0d4ce44",
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
  "available_until": "2026-10-30T09:45:28.833443Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/29dda734-e2ed-4f83-8e42-4cade0d4ce44/tip` → **409**

```json
{
  "command_id": "cbf9d36d-faa5-4d41-a0c5-610b03b30970",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/29dda734-e2ed-4f83-8e42-4cade0d4ce44/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c039d173-e21f-4607-83bf-01086534ea92"
}
```

Done: interrupted f1e38ecb-4ba3-4387-a8b7-0a2a88e9f8b5, follow-up 29dda734-e2ed-4f83-8e42-4cade0d4ce44.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "03180926-dba5-42dc-835d-a783b043cb5b",
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
  "last_heartbeat_at": "2026-10-29T09:45:23.642529Z",
  "last_location_at": "2026-10-29T09:45:23.642529Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/03180926-dba5-42dc-835d-a783b043cb5b/close` → **200**

```json
{
  "command_id": "84631076-5bbc-42b8-8c95-a3534dc0d69d",
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
  "session_id": "aa933f2c-f6cb-4faf-b1d4-df30d6138541",
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
  "last_heartbeat_at": "2026-10-29T09:45:27.982775Z",
  "last_location_at": "2026-10-29T09:45:27.982775Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aa933f2c-f6cb-4faf-b1d4-df30d6138541/close` → **200**

```json
{
  "command_id": "db01c29e-d4ad-46bf-8261-d0664bfdf797",
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
  "session_id": "abfa24ef-2d2a-4858-8791-0cc060a1228d",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwMzQsImlhdCI6MTc5MzI2NzEzNCwianRpIjoiYmJjYzBmYmEtNDkzOC00NWZkLWE3YmItYzUzMjA3ZGI0NTcwIiwic2lkIjoiYWJmYTI0ZWYtMmQyYS00ODU4LTg3OTEtMGNjMDYwYTEyMjhkIn0._1eBeazQX6muJdodwI47nLFn_h9iKrLCZojCq6zVpU4",
  "access_expires_at": "2026-10-29T10:00:34.964002789Z",
  "refresh_token": "Hu8aZEDykyoRwgLW1auqdsgWVZJ5JgWL2abzcSSF5l4",
  "refresh_expires_at": "2026-10-29T21:45:34.96333156Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1812f3bd-59c1-428f-94ef-c303b47dc632",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:45:35Z"
}
```

```json
{
  "id": "ad5dad51-991a-444d-a05b-7fe77e02870d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:45:35Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/ad5dad51-991a-444d-a05b-7fe77e02870d/publish` → **200**

```json
{
  "command_id": "2214b01b-f4a3-449e-89bc-8da42951850c",
  "expected_version": 0
}
```

```json
{
  "id": "ad5dad51-991a-444d-a05b-7fe77e02870d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:45:35.550388Z",
  "published_at": "2026-10-29T09:45:35.550388Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "ad5dad51-991a-444d-a05b-7fe77e02870d",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T09:45:35.550388Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633158533",
  "device_ref": "sandbox-27050"
}
```

```json
{
  "challenge_id": "dbff48d9-7b35-4351-a69e-3fd39fd50dac",
  "expires_at": "2026-10-29T09:50:36.090251573Z",
  "resend_available_at": "2026-10-29T09:45:37.090251573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633158533` → **200**

```json
{
  "phone": "+380633158533",
  "audience": "CLIENT",
  "code": "716194",
  "sent_at": "2026-10-29T09:45:36.093710257Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dbff48d9-7b35-4351-a69e-3fd39fd50dac",
  "code": "716194",
  "device_ref": "sandbox-27050"
}
```

```json
{
  "session_id": "a93277f4-e37a-407a-917f-824346dcb376",
  "subject": {
    "type": "CLIENT",
    "id": "bd4154ae-2674-4c80-8654-42efbaf55de3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZDQxNTRhZS0yNjc0LTRjODAtODY1NC00MmVmYmFmNTVkZTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDM2LCJpYXQiOjE3OTMyNjcxMzYsImp0aSI6ImEwNGI0YTU4LWI1MGYtNDIxZC1iN2U4LTRlM2Q1YjcxNDI1YiIsInNpZCI6ImE5MzI3N2Y0LWUzN2EtNDA3YS05MTdmLTgyNDM0NmRjYjM3NiJ9.252OTUaAvhFmGmvF9Af0hfSAvfWou-5bHwqacZ0Idoc",
  "access_expires_at": "2026-10-29T10:00:36.393720883Z",
  "refresh_token": "DI4ZTKNmdqL1KHEJ4dwJdGYzynu3ubn26B2Vo9_U9lQ",
  "refresh_expires_at": "2026-11-28T09:45:36.39317856Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "ad5dad51-991a-444d-a05b-7fe77e02870d",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T09:45:35.550388Z",
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
  "command_id": "b0ae3e2e-508c-48a8-ace3-49f054013ef3",
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
  "id": "6e20130a-1629-48bd-9329-fbdcefa604cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:36.962955Z",
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
  "command_id": "e48d7a24-8855-471c-9a9b-7a3831dfab38",
  "quote_id": "6e20130a-1629-48bd-9329-fbdcefa604cb",
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
  "correlation_id": "2d3d07c8-50b8-4526-8674-5b7147ff9dda"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f57f58c6-87c5-4c77-ae38-883813af2ac5",
  "version_id": "ad5dad51-991a-444d-a05b-7fe77e02870d",
  "language": "uk"
}
```

```json
{
  "version_id": "ad5dad51-991a-444d-a05b-7fe77e02870d",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T09:45:37.527947Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8159d833-7b98-45d5-9a44-8eff465fb8dd",
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
  "id": "7f5d46ab-273f-4a65-89a4-04d6c4f1ceaf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:37.816966Z",
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
  "command_id": "9f1f46f4-5272-4214-a266-70a6c1e3537c",
  "quote_id": "7f5d46ab-273f-4a65-89a4-04d6c4f1ceaf",
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
  "id": "c33684d9-d295-46aa-9a4f-5f0f38e15c31",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd4154ae-2674-4c80-8654-42efbaf55de3",
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
  "created_at": "2026-10-29T09:45:38.098626Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c33684d9-d295-46aa-9a4f-5f0f38e15c31` → **200**

```json
{
  "id": "c33684d9-d295-46aa-9a4f-5f0f38e15c31",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "bd4154ae-2674-4c80-8654-42efbaf55de3",
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
  "created_at": "2026-10-29T09:45:38.098626Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/c33684d9-d295-46aa-9a4f-5f0f38e15c31/cancel` → **200**

```json
{
  "command_id": "7283033a-0718-4a87-9ae7-64cb5285c306",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "c33684d9-d295-46aa-9a4f-5f0f38e15c31",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bd4154ae-2674-4c80-8654-42efbaf55de3",
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
  "created_at": "2026-10-29T09:45:38.098626Z",
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

`POST /api/admin/v1/legal-documents/ad5dad51-991a-444d-a05b-7fe77e02870d` → **409**

```json
{
  "command_id": "372b7bc1-8454-4da1-8bd8-4173496b8adf",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:45:38Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/ad5dad51-991a-444d-a05b-7fe77e02870d",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a30526ce-2c3a-4a33-ac46-f760138eaa8e"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "aa8d4ce1-b2ed-43ca-9d56-90a79b78d58b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:45:39Z"
}
```

```json
{
  "id": "e8ad560f-76e2-4243-9b53-67e28a6b2367",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:45:39Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/e8ad560f-76e2-4243-9b53-67e28a6b2367/publish` → **200**

```json
{
  "command_id": "da4c05e8-6965-4035-8fc1-f0043ac684ee",
  "expected_version": 0
}
```

```json
{
  "id": "e8ad560f-76e2-4243-9b53-67e28a6b2367",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:45:39.55193Z",
  "published_at": "2026-10-29T09:45:39.55193Z",
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
  "device_ref": "sandbox-19743"
}
```

```json
{
  "challenge_id": "f94a1954-2166-4dc3-b455-9fd77342018e",
  "expires_at": "2026-10-29T09:50:39.833327924Z",
  "resend_available_at": "2026-10-29T09:45:40.833327924Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "386816",
  "sent_at": "2026-10-29T09:45:39.835847233Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f94a1954-2166-4dc3-b455-9fd77342018e",
  "code": "386816",
  "device_ref": "sandbox-19743"
}
```

```json
{
  "session_id": "fb0b0dee-d271-41be-b85b-26df987eb9f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODA0MCwiaWF0IjoxNzkzMjY3MTQwLCJqdGkiOiIyMmJjNTQxYy0wMGNiLTQ3ZTMtYWUzNy00MDczZmZiNGE3NTAiLCJzaWQiOiJmYjBiMGRlZS1kMjcxLTQxYmUtYjg1Yi0yNmRmOTg3ZWI5ZjMifQ.5l7gToR0dvNxccH_Yfds0aR0OH5B3bau6bykcqhGBDc",
  "access_expires_at": "2026-10-29T10:00:40.124628025Z",
  "refresh_token": "JnMhN6CRs8CAMdgPUWGwkL5pr3sit09oPczEtygFEMY",
  "refresh_expires_at": "2026-11-28T09:45:40.124061857Z",
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
  "command_id": "b848183b-d1a0-4ede-9cbc-dc6477146758",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:40Z",
    "sequence": 1793267140662
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "dadc614c-e0ff-45e1-b8f4-061b9d4ae377",
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
  "last_heartbeat_at": "2026-10-29T09:45:40.680896Z",
  "last_location_at": "2026-10-29T09:45:40.680896Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670627688",
  "device_ref": "sandbox-4975"
}
```

```json
{
  "challenge_id": "af5703fa-9a55-419c-a77f-a95a6e67a17b",
  "expires_at": "2026-10-29T09:50:40.965546994Z",
  "resend_available_at": "2026-10-29T09:45:41.965546994Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670627688` → **200**

```json
{
  "phone": "+380670627688",
  "audience": "CLIENT",
  "code": "301143",
  "sent_at": "2026-10-29T09:45:40.968093383Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "af5703fa-9a55-419c-a77f-a95a6e67a17b",
  "code": "301143",
  "device_ref": "sandbox-4975"
}
```

```json
{
  "session_id": "b8b8ce48-1d7e-4d47-b833-9fdd6c473c4d",
  "subject": {
    "type": "CLIENT",
    "id": "c5662a51-4d24-47a4-a278-a0794425c2fe"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjNTY2MmE1MS00ZDI0LTQ3YTQtYTI3OC1hMDc5NDQyNWMyZmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDQxLCJpYXQiOjE3OTMyNjcxNDEsImp0aSI6IjVmYjU3MzY4LWMyMmEtNDhlNC1hOWNjLTI1NTgxNTQ1NjQ3MiIsInNpZCI6ImI4YjhjZTQ4LTFkN2UtNGQ0Ny1iODMzLTlmZGQ2YzQ3M2M0ZCJ9.uskRE_Y-b0MT69Z9XrnwnKBxyDhO4ntQgItYXjjhIHQ",
  "access_expires_at": "2026-10-29T10:00:41.265468575Z",
  "refresh_token": "PMOAEDFXxzHZEFVpiVn2aenmlVYZYxegnZ40L2O3lhI",
  "refresh_expires_at": "2026-11-28T09:45:41.264932305Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a5a844d5-f29a-43ba-8b63-30ab0df7f90c",
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
  "id": "7e8844b5-a583-4d44-ac8b-4d62fd1d7b14",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:41.542498Z",
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
  "command_id": "07bdb0e8-ea62-4148-9ce4-74053960accf",
  "quote_id": "7e8844b5-a583-4d44-ac8b-4d62fd1d7b14",
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
    "phone": "+380677537932"
  }
}
```

```json
{
  "id": "0242e325-4c4b-4806-a670-533541d98001",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:41.832992Z",
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
    "id": "e558ff5c-73d5-4409-99cf-886d9f0eb1c2",
    "order_id": "0242e325-4c4b-4806-a670-533541d98001",
    "expires_at": "2026-10-29T09:45:56.83613Z",
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

`POST /api/driver/v1/offers/e558ff5c-73d5-4409-99cf-886d9f0eb1c2/accept` → **200**

```json
{
  "command_id": "985c9895-0c1e-4221-a3b0-34aa43374607"
}
```

```json
{
  "id": "fd9685eb-9016-4e24-919c-b8663d1176b3",
  "order_id": "0242e325-4c4b-4806-a670-533541d98001",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "85ab6fb6-513d-4225-a503-d94409a082de",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "85ab6fb6-513d-4225-a503-d94409a082de",
  "order_id": "0242e325-4c4b-4806-a670-533541d98001",
  "assignment_id": "fd9685eb-9016-4e24-919c-b8663d1176b3",
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
    "phone": "+380677537932"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "75c1faf4-7f6e-418e-b0bc-6450d120f546",
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
  "id": "0747ab19-df77-4f42-9a0a-02a243bc1110",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:42.989867Z",
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
  "command_id": "634e4766-3f0b-421f-9924-58884312891d",
  "quote_id": "0747ab19-df77-4f42-9a0a-02a243bc1110",
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
  "id": "bcdd6a01-9f4e-482e-88aa-d34a82f032c0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.290002Z",
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
  "command_id": "12f2ee13-8ef2-4b3a-9fef-0f31bb2b8ef6",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T12:45:43Z"
}
```

```json
{
  "id": "24f30ae4-5414-48af-a9ca-dbe5c1b990ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:43.603707Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T12:45:43Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "dfc1e9ec-e8b0-4581-bf6e-d7f2ee5183ea",
  "quote_id": "24f30ae4-5414-48af-a9ca-dbe5c1b990ad",
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
  "pickup_at": "2026-10-29T12:45:43Z"
}
```

```json
{
  "id": "8faae744-0fa0-4c14-8787-846c4ad1cf1a",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.896392Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:45:43Z",
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
  "command_id": "6831e337-f8c2-44c8-aa89-2219ffbb068d",
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
  "id": "5166e57e-ddfb-477e-a00c-8ef3fa845daa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:44.198748Z",
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
  "command_id": "73d47190-8a0b-4005-9382-98768615d71e",
  "quote_id": "5166e57e-ddfb-477e-a00c-8ef3fa845daa",
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
  "correlation_id": "59cba696-8e05-4115-8e0b-4662207f20bb"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "8faae744-0fa0-4c14-8787-846c4ad1cf1a",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
      "created_at": "2026-10-29T09:45:43.896392Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T12:45:43Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bcdd6a01-9f4e-482e-88aa-d34a82f032c0",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
      "created_at": "2026-10-29T09:45:43.290002Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "0242e325-4c4b-4806-a670-533541d98001",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "bcdd6a01-9f4e-482e-88aa-d34a82f032c0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.290002Z",
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

`GET /api/rider/v1/orders/0242e325-4c4b-4806-a670-533541d98001` → **200**

```json
{
  "id": "0242e325-4c4b-4806-a670-533541d98001",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
    "id": "fd9685eb-9016-4e24-919c-b8663d1176b3",
    "order_id": "0242e325-4c4b-4806-a670-533541d98001",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "85ab6fb6-513d-4225-a503-d94409a082de",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T09:45:41.832992Z",
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
    "location_at": "2026-10-29T09:45:40.680896Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/0242e325-4c4b-4806-a670-533541d98001/cancel` → **200**

```json
{
  "command_id": "f5c54883-98ae-4e70-8d17-52a76f10f37a",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0242e325-4c4b-4806-a670-533541d98001",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
    "id": "fd9685eb-9016-4e24-919c-b8663d1176b3",
    "order_id": "0242e325-4c4b-4806-a670-533541d98001",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "85ab6fb6-513d-4225-a503-d94409a082de",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:45:41.832992Z",
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

`GET /api/rider/v1/orders/bcdd6a01-9f4e-482e-88aa-d34a82f032c0` → **200**

```json
{
  "id": "bcdd6a01-9f4e-482e-88aa-d34a82f032c0",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.290002Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/bcdd6a01-9f4e-482e-88aa-d34a82f032c0/cancel` → **200**

```json
{
  "command_id": "69dda566-713b-4e44-a749-5226deb4e395",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bcdd6a01-9f4e-482e-88aa-d34a82f032c0",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.290002Z",
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

`GET /api/rider/v1/orders/8faae744-0fa0-4c14-8787-846c4ad1cf1a` → **200**

```json
{
  "id": "8faae744-0fa0-4c14-8787-846c4ad1cf1a",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.896392Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:45:43Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8faae744-0fa0-4c14-8787-846c4ad1cf1a/cancel` → **200**

```json
{
  "command_id": "3b9c9c44-736e-4b4d-b02c-b201f74161cb",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8faae744-0fa0-4c14-8787-846c4ad1cf1a",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "c5662a51-4d24-47a4-a278-a0794425c2fe",
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
  "created_at": "2026-10-29T09:45:43.896392Z",
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
  "pickup_at": "2026-10-29T12:45:43Z",
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
  "session_id": "dadc614c-e0ff-45e1-b8f4-061b9d4ae377",
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
  "last_heartbeat_at": "2026-10-29T09:45:40.680896Z",
  "last_location_at": "2026-10-29T09:45:40.680896Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dadc614c-e0ff-45e1-b8f4-061b9d4ae377/close` → **200**

```json
{
  "command_id": "efa24904-f2bd-450c-9371-2d8cbb009f44",
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

Done: orders 0242e325-4c4b-4806-a670-533541d98001, bcdd6a01-9f4e-482e-88aa-d34a82f032c0, 8faae744-0fa0-4c14-8787-846c4ad1cf1a.

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
  "session_id": "77dc7744-7198-403d-9af7-ff100869810b",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwNDcsImlhdCI6MTc5MzI2NzE0NywianRpIjoiM2IwMmVmYjAtZjY5YS00ZTRiLThlOTUtMWUwMzk2NGFlMmViIiwic2lkIjoiNzdkYzc3NDQtNzE5OC00MDNkLTlhZjctZmYxMDA4Njk4MTBiIn0.AGGoV6cbRLlBPO9pJ8AaqtUDkP63BaeDIibFIuIhyW4",
  "access_expires_at": "2026-10-29T10:00:47.948212175Z",
  "refresh_token": "MvGz8rf4c8hWTLDs8inod3OjHVkv8sEZEUVbXoV-7DI",
  "refresh_expires_at": "2026-10-29T21:45:47.947641229Z",
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
  "session_id": "ba881808-756b-47c0-a8e7-0e60cd862473",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwNDgsImlhdCI6MTc5MzI2NzE0OCwianRpIjoiMDIzZDhjZWYtNDIwZi00OGRkLWIxMjYtYzBjMzNjZTBiMThkIiwic2lkIjoiYmE4ODE4MDgtNzU2Yi00N2MwLWE4ZTctMGU2MGNkODYyNDczIn0.Y1szWUjPeJRuaiY65S3q-i9bbyYfp2ITl9aAfEEdyKA",
  "access_expires_at": "2026-10-29T10:00:48.514559342Z",
  "refresh_token": "qhsn95iwkm1XEIDp30wVa8gBRwekXWKAn3AVOlSNrvI",
  "refresh_expires_at": "2026-10-29T21:45:48.514022763Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-22730"
}
```

```json
{
  "challenge_id": "4ee7cbff-87f9-4e51-82af-1c997eb43709",
  "expires_at": "2026-10-29T09:50:48.784550872Z",
  "resend_available_at": "2026-10-29T09:45:49.784550872Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "261517",
  "sent_at": "2026-10-29T09:45:48.787125138Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ee7cbff-87f9-4e51-82af-1c997eb43709",
  "code": "261517",
  "device_ref": "sandbox-22730"
}
```

```json
{
  "session_id": "338a218e-2ee6-4b00-8932-ed68307a4f85",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODA0OSwiaWF0IjoxNzkzMjY3MTQ5LCJqdGkiOiIyZGQ5YzI2Ni0yZmI1LTQ1MWMtYWEzZi1mMWEyZDg1ZDAxNjYiLCJzaWQiOiIzMzhhMjE4ZS0yZWU2LTRiMDAtODkzMi1lZDY4MzA3YTRmODUifQ.1KSL9foS6WP28MoPWvkGcLJC4oI9kToFf97sq6JHgkM",
  "access_expires_at": "2026-10-29T10:00:49.092126684Z",
  "refresh_token": "S6ItTpKv1RKr4jL4-GLfhjfdfzRZxaXUT_QVs2PGlyw",
  "refresh_expires_at": "2026-11-28T09:45:49.091577559Z",
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
  "command_id": "a8a0e5e6-c1ea-4a9f-9bff-28365a36865c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:49Z",
    "sequence": 1793267149637
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf989e4c-d3a8-4bfe-80fe-eefe4b2132c4",
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
  "last_heartbeat_at": "2026-10-29T09:45:49.655593Z",
  "last_location_at": "2026-10-29T09:45:49.655593Z",
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
  "command_id": "960b5497-8db4-4494-a7a6-dbd25a9dc37e",
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
  "effective_at": "2026-10-29T09:45:50.227668Z",
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T09:43:12.378087Z",
  "last_entries": [
    {
      "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T09:43:12.378087Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "07e7e1f1-67c1-4ddd-939d-cf0340084495",
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
  "id": "57cb546b-9495-4d72-a083-7a9c62e35d2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:50.789353Z",
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
  "command_id": "523cf4c4-0fc5-4a08-89d1-ea472dbbc15e",
  "quote_id": "57cb546b-9495-4d72-a083-7a9c62e35d2c",
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
    "phone": "+380671114888"
  }
}
```

```json
{
  "id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
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
  "created_at": "2026-10-29T09:45:51.079648Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671114888"
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
    "id": "4b90d6bf-a200-44ac-a4ad-8585716cdb9f",
    "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
    "expires_at": "2026-10-29T09:46:06.083981Z",
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

`POST /api/driver/v1/offers/4b90d6bf-a200-44ac-a4ad-8585716cdb9f/accept` → **200**

```json
{
  "command_id": "70de1df7-3326-4fbd-9791-3239d21e3543"
}
```

```json
{
  "id": "51ab38e9-f454-4cc8-b342-881fb5831739",
  "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fe04a3d2-b0a8-447b-931c-1bc651506386",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fe04a3d2-b0a8-447b-931c-1bc651506386",
  "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
  "assignment_id": "51ab38e9-f454-4cc8-b342-881fb5831739",
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
    "phone": "+380671114888"
  }
}
```

`POST /api/driver/v1/work-sessions/bf989e4c-d3a8-4bfe-80fe-eefe4b2132c4/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:45:52Z",
    "sequence": 1793267152208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf989e4c-d3a8-4bfe-80fe-eefe4b2132c4",
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
  "last_heartbeat_at": "2026-10-29T09:45:52.226267Z",
  "last_location_at": "2026-10-29T09:45:52.226267Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fe04a3d2-b0a8-447b-931c-1bc651506386/arrive` → **200**

```json
{
  "command_id": "d4d2f1c0-7660-4c65-b44a-670e96018349",
  "expected_version": 0
}
```

```json
{
  "id": "fe04a3d2-b0a8-447b-931c-1bc651506386",
  "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
  "assignment_id": "51ab38e9-f454-4cc8-b342-881fb5831739",
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
  "arrived_at": "2026-10-29T09:45:52.498176Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114888"
  }
}
```

`POST /api/driver/v1/trips/fe04a3d2-b0a8-447b-931c-1bc651506386/start` → **200**

```json
{
  "command_id": "afffac14-eda7-4594-89a1-59bedb8dab1e",
  "expected_version": 1
}
```

```json
{
  "id": "fe04a3d2-b0a8-447b-931c-1bc651506386",
  "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
  "assignment_id": "51ab38e9-f454-4cc8-b342-881fb5831739",
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
  "arrived_at": "2026-10-29T09:45:52.498176Z",
  "started_at": "2026-10-29T09:45:52.794499Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671114888"
  }
}
```

`POST /api/driver/v1/trips/fe04a3d2-b0a8-447b-931c-1bc651506386/complete` → **200**

```json
{
  "command_id": "9a8f5525-5126-4f45-8a78-0e0e733258e9",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:45:53Z",
  "cash_received": true
}
```

```json
{
  "id": "fe04a3d2-b0a8-447b-931c-1bc651506386",
  "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
  "assignment_id": "51ab38e9-f454-4cc8-b342-881fb5831739",
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
  "arrived_at": "2026-10-29T09:45:52.498176Z",
  "started_at": "2026-10-29T09:45:52.794499Z",
  "completed_at": "2026-10-29T09:45:53.091297Z",
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
  "command_id": "ac83314d-8968-4b35-a949-0e568528028f",
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
  "id": "7d4b3607-85a5-44c3-b90d-b266984c1068",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:50:53.375596Z",
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
  "command_id": "5a8ac3aa-df16-4282-90eb-b1c331265113",
  "quote_id": "7d4b3607-85a5-44c3-b90d-b266984c1068",
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
    "phone": "+3806711119429"
  }
}
```

```json
{
  "id": "d6ade601-f814-4425-ae79-649af3ec27b1",
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
  "created_at": "2026-10-29T09:45:53.65898Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119429"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/d6ade601-f814-4425-ae79-649af3ec27b1` → **200**

```json
{
  "id": "d6ade601-f814-4425-ae79-649af3ec27b1",
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
  "created_at": "2026-10-29T09:45:53.65898Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119429"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d6ade601-f814-4425-ae79-649af3ec27b1/cancel` → **200**

```json
{
  "command_id": "f289e238-8740-4ae7-a1e3-0cbe37d87ed6",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "d6ade601-f814-4425-ae79-649af3ec27b1",
  "short_number": 22,
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
  "created_at": "2026-10-29T09:45:53.65898Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711119429"
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
  "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T09:43:12.378087Z",
  "last_entries": [
    {
      "order_id": "d6ade601-f814-4425-ae79-649af3ec27b1",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T09:45:54.268264Z"
    },
    {
      "order_id": "2958e1bb-1a18-496f-b6d4-2cc4fe95b514",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T09:45:53.095873Z"
    },
    {
      "order_id": "669ffc0c-b4ca-48d6-9c3e-a0d131db0db3",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T09:43:12.378087Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bf989e4c-d3a8-4bfe-80fe-eefe4b2132c4",
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
  "last_heartbeat_at": "2026-10-29T09:45:52.226267Z",
  "last_location_at": "2026-10-29T09:45:52.226267Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bf989e4c-d3a8-4bfe-80fe-eefe4b2132c4/close` → **200**

```json
{
  "command_id": "1b37eb9b-ef03-49e5-bfd0-7c4c92477d67",
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

Done: operator bonus for fulfilled 2958e1bb-1a18-496f-b6d4-2cc4fe95b514 and operator-fault cancellation d6ade601-f814-4425-ae79-649af3ec27b1.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675674823",
  "device_ref": "sandbox-16546"
}
```

```json
{
  "challenge_id": "eee889ff-a71b-4d1a-bd5a-db7528bad735",
  "expires_at": "2026-10-29T09:50:58.644780679Z",
  "resend_available_at": "2026-10-29T09:45:59.644780679Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675674823` → **200**

```json
{
  "phone": "+380675674823",
  "audience": "CLIENT",
  "code": "944366",
  "sent_at": "2026-10-29T09:45:58.647259345Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675383975",
  "device_ref": "sandbox-7020",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1ce1bbb7-7b32-43c3-a57f-c8f712e33ba1",
  "expires_at": "2026-10-29T09:51:00.143393596Z",
  "resend_available_at": "2026-10-29T09:46:01.143393596Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675383975` → **200**

```json
{
  "phone": "+380675383975",
  "audience": "CLIENT",
  "code": "499952",
  "sent_at": "2026-10-29T09:46:00.145432496Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675383975",
  "device_ref": "sandbox-11896",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b040215e-c41d-4579-a8cd-aa376324d17c",
  "expires_at": "2026-10-29T09:51:01.654877305Z",
  "resend_available_at": "2026-10-29T09:46:02.654877305Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380675383975` → **200**

```json
{
  "phone": "+380675383975",
  "audience": "CLIENT",
  "code": "287207",
  "sent_at": "2026-10-29T09:46:01.657691313Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-27373"
}
```

```json
{
  "challenge_id": "40c2f868-ce62-4020-acb0-6e926a7eeaee",
  "expires_at": "2026-10-29T09:51:03.164736784Z",
  "resend_available_at": "2026-10-29T09:46:04.164736784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-3070"
}
```

```json
{
  "challenge_id": "3f94dc2f-c4bb-4243-9539-89279adf4531",
  "expires_at": "2026-10-29T09:51:04.635038319Z",
  "resend_available_at": "2026-10-29T09:46:05.635038319Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676410000` → **200**

```json
{
  "phone": "+380676410000",
  "audience": "CLIENT",
  "code": "963662",
  "sent_at": "2026-10-29T09:46:04.637674811Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-31209",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "b23aba18-a4fd-4a4e-a8da-61c7f0a60e3d",
  "expires_at": "2026-10-29T09:51:06.144027353Z",
  "resend_available_at": "2026-10-29T09:46:07.144027353Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676410000` → **200**

```json
{
  "phone": "+380676410000",
  "audience": "CLIENT",
  "code": "099671",
  "sent_at": "2026-10-29T09:46:06.146386994Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676410000",
  "device_ref": "sandbox-6637",
  "channel": "VOICE"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "902ffba9-dc03-4813-9ccf-4c4755fcb5c1",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000027836"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "7279981d-26dd-4f5c-8947-2c1653741343"
}
```

`GET /sandbox/v1/otp?phone=%2B442000027836` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120004317"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "43445822-e516-4f1e-ab90-b96c9589965d"
}
```

`GET /sandbox/v1/otp?phone=%2B37120004317` → **404**

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
  "session_id": "5e502258-99a0-4dda-a142-6c7c55d120b3",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwNjgsImlhdCI6MTc5MzI2NzE2OCwianRpIjoiMTEwNTE2YjgtNGJiMy00OTc4LWE0OTktMzAxZjEzMTNjOGQ4Iiwic2lkIjoiNWU1MDIyNTgtOTlhMC00ZGRhLWExNDItNmM3YzU1ZDEyMGIzIn0.jswsnBplexKo6mkcmExZhzE58BNEA7UQWZEjs27opB4",
  "access_expires_at": "2026-10-29T10:01:08.845469859Z",
  "refresh_token": "byb8tG-ddA6Dv6FZmgfAzQvRMeI8BI9LB_vJ2Zdmcro",
  "refresh_expires_at": "2026-10-29T21:46:08.844926714Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676410000` → **200**

```json
{
  "deliveries": [
    {
      "id": "44ace620-1993-477b-ad8f-4af29060e0f9",
      "challenge_id": "b23aba18-a4fd-4a4e-a8da-61c7f0a60e3d",
      "phone": "+380676410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-b8ecfeb3-a84d-48b8-8c5e-0decd30b623f",
      "error": null,
      "attempted_at": "2026-10-29T09:46:06.146633Z"
    },
    {
      "id": "140d03bb-2d03-4b08-a9b1-581740651d48",
      "challenge_id": "3f94dc2f-c4bb-4243-9539-89279adf4531",
      "phone": "+380676410000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d4f418b6-865f-47b2-918d-cc920915281b",
      "error": null,
      "attempted_at": "2026-10-29T09:46:04.637984Z"
    },
    {
      "id": "703f40b3-71d0-4425-bee6-9adc82317872",
      "challenge_id": "40c2f868-ce62-4020-acb0-6e926a7eeaee",
      "phone": "+380676410000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T09:46:03.1671Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676410000` → **200**

```json
{
  "phone": "+380676410000",
  "audience": "CLIENT",
  "code": "099671",
  "sent_at": "2026-10-29T09:46:06.146386994Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380675383975` → **200**

```json
{
  "deliveries": [
    {
      "id": "126d660d-3565-4323-87ca-450528bdaae9",
      "challenge_id": "b040215e-c41d-4579-a8cd-aa376324d17c",
      "phone": "+380675383975",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-db4e77cb-3944-42e3-8da7-0ed594a64f3e",
      "error": null,
      "attempted_at": "2026-10-29T09:46:01.657961Z"
    },
    {
      "id": "0a1ed77c-2d52-4231-b307-43b6da197b5b",
      "challenge_id": "1ce1bbb7-7b32-43c3-a57f-c8f712e33ba1",
      "phone": "+380675383975",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a0470756-acc8-4eeb-b524-5daec2505970",
      "error": null,
      "attempted_at": "2026-10-29T09:46:00.145696Z"
    }
  ]
}
```

Done: SMS to +380675674823; SMS then a call to +380675383975; a failed SMS, two calls and a refused third to +380676410000; +44 and +371 refused.

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
  "session_id": "ca86c746-7289-455e-85ca-058e09a689f0",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwNzAsImlhdCI6MTc5MzI2NzE3MCwianRpIjoiN2RhZTc1OWYtMzQ0Yy00YjEwLWE5ZjYtZWMyYTI5ZGM1MTRhIiwic2lkIjoiY2E4NmM3NDYtNzI4OS00NTVlLTg1Y2EtMDU4ZTA5YTY4OWYwIn0.t92CPnnG-WgDJoeXdGhJJEm3W1u8yb6HYchoHRJeOhc",
  "access_expires_at": "2026-10-29T10:01:10.130356859Z",
  "refresh_token": "ssy0QfrigCJvUSA798BMMyuEFfHoBY5kpoqajnfMlxY",
  "refresh_expires_at": "2026-10-29T21:46:10.129482387Z",
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
  "session_id": "ebc9a252-ede4-4f3c-aedd-369384a9ca23",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwNzAsImlhdCI6MTc5MzI2NzE3MCwianRpIjoiYzhiZjkxMzItYzQ5Yy00YzRiLWIxMmItZTZkYjMxN2UxZTc2Iiwic2lkIjoiZWJjOWEyNTItZWRlNC00ZjNjLWFlZGQtMzY5Mzg0YTljYTIzIn0.QvnE-EKuuF9NiT4t783nHwTBtjBa3xCIJnTYcY1MYB0",
  "access_expires_at": "2026-10-29T10:01:10.714075319Z",
  "refresh_token": "WbJcvU8dTN1gzki7QBR-W4T_Sg_siXmoD4HkW2-9QGY",
  "refresh_expires_at": "2026-10-29T21:46:10.713494315Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "05964478-3d01-486a-b6e6-062abbd67c76",
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
    "flags.manage",
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

`POST /api/admin/v1/staff-extensions/05964478-3d01-486a-b6e6-062abbd67c76` → **200**

```json
{
  "command_id": "491478d8-5a05-4e66-bca4-01ecc8f679f6",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "05964478-3d01-486a-b6e6-062abbd67c76",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e3e174a0-380c-41fc-91ed-496c757d0ae3",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T09:46:11.844054Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T09:46:11.844054Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c8008880-7783-46e4-a682-cf662803dbb0",
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
  "id": "2a95cf43-7c9e-40e7-8c05-7287f8abbaae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:51:12.416796Z",
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
  "command_id": "2f42759a-3b3c-4ac0-942c-5d83e34bbcfe",
  "quote_id": "2a95cf43-7c9e-40e7-8c05-7287f8abbaae",
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
    "phone": "+380673307180"
  }
}
```

```json
{
  "id": "bfeb90a4-2dc6-4342-97c0-838f137cfd6d",
  "short_number": 23,
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
  "created_at": "2026-10-29T09:46:12.711713Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673307180"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/bfeb90a4-2dc6-4342-97c0-838f137cfd6d/calls` → **201**

```json
{
  "command_id": "d401f82e-46e8-43bc-b2b8-07728a8721d6",
  "to": "CALLER"
}
```

```json
{
  "id": "ca433896-d13a-4d39-9a71-83ba088023ff",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "order_ids": [
    "bfeb90a4-2dc6-4342-97c0-838f137cfd6d"
  ],
  "started_at": "2026-10-29T09:46:13.021754Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/bfeb90a4-2dc6-4342-97c0-838f137cfd6d/calls` → **201**

```json
{
  "command_id": "d401f82e-46e8-43bc-b2b8-07728a8721d6",
  "to": "CALLER"
}
```

```json
{
  "id": "ca433896-d13a-4d39-9a71-83ba088023ff",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "order_ids": [
    "bfeb90a4-2dc6-4342-97c0-838f137cfd6d"
  ],
  "started_at": "2026-10-29T09:46:13.021754Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ca433896-d13a-4d39-9a71-83ba088023ff",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673307180",
    "at": "2026-10-29T09:46:13.02394593Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ca433896-d13a-4d39-9a71-83ba088023ff",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.22523",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ca433896-d13a-4d39-9a71-83ba088023ff"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ca433896-d13a-4d39-9a71-83ba088023ff",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=bfeb90a4-2dc6-4342-97c0-838f137cfd6d` → **200**

```json
{
  "calls": [
    {
      "id": "ca433896-d13a-4d39-9a71-83ba088023ff",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [
        "bfeb90a4-2dc6-4342-97c0-838f137cfd6d"
      ],
      "started_at": "2026-10-29T09:46:13.021754Z",
      "answered_at": "2026-10-29T09:46:13.67933Z",
      "ended_at": "2026-10-29T09:46:13.701507Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=bfeb90a4-2dc6-4342-97c0-838f137cfd6d` → **200**

```json
{
  "calls": [
    {
      "id": "ca433896-d13a-4d39-9a71-83ba088023ff",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "05964478-3d01-486a-b6e6-062abbd67c76",
      "order_ids": [
        "bfeb90a4-2dc6-4342-97c0-838f137cfd6d"
      ],
      "started_at": "2026-10-29T09:46:13.021754Z",
      "answered_at": "2026-10-29T09:46:13.67933Z",
      "ended_at": "2026-10-29T09:46:13.701507Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:46:14.639096Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/bfeb90a4-2dc6-4342-97c0-838f137cfd6d` → **200**

```json
{
  "id": "bfeb90a4-2dc6-4342-97c0-838f137cfd6d",
  "short_number": 23,
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
  "created_at": "2026-10-29T09:46:12.711713Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673307180"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bfeb90a4-2dc6-4342-97c0-838f137cfd6d/cancel` → **200**

```json
{
  "command_id": "b03bc14f-d162-43d0-838e-586a0725009a",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bfeb90a4-2dc6-4342-97c0-838f137cfd6d",
  "short_number": 23,
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
  "created_at": "2026-10-29T09:46:12.711713Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673307180"
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
  "command_id": "e933d715-40f1-412a-8c5b-f789c9706459",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T09:46:16.919213Z",
  "extension": "101"
}
```

Done: outgoing call ca433896-d13a-4d39-9a71-83ba088023ff from order bfeb90a4-2dc6-4342-97c0-838f137cfd6d, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632969390",
  "device_ref": "sandbox-23363"
}
```

```json
{
  "challenge_id": "ead60ab4-d5db-436a-855e-ca7b104364cd",
  "expires_at": "2026-10-29T09:51:17.222232789Z",
  "resend_available_at": "2026-10-29T09:46:18.222232789Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632969390` → **200**

```json
{
  "phone": "+380632969390",
  "audience": "CLIENT",
  "code": "219477",
  "sent_at": "2026-10-29T09:46:17.224464862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ead60ab4-d5db-436a-855e-ca7b104364cd",
  "code": "219477",
  "device_ref": "sandbox-23363"
}
```

```json
{
  "session_id": "284536fa-1ae2-4b3b-8b06-d499dc51c82d",
  "subject": {
    "type": "CLIENT",
    "id": "d37da659-09c6-4f88-95aa-0143e4f99458"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzdkYTY1OS0wOWM2LTRmODgtOTVhYS0wMTQzZTRmOTk0NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDc3LCJpYXQiOjE3OTMyNjcxNzcsImp0aSI6IjE3NjViYTVjLTY4ODEtNGM4NS1iYjZjLTVkYWFlYmYwOThhZSIsInNpZCI6IjI4NDUzNmZhLTFhZTItNGIzYi04YjA2LWQ0OTlkYzUxYzgyZCJ9.q2BN65NSMoNEfDzVrU4SQ1sqpsGEPnoP0KhiNV8n9NE",
  "access_expires_at": "2026-10-29T10:01:17.545059674Z",
  "refresh_token": "TEyLUzur6bGZH1ZU4VGjzeDyvHDt0Fo9uBR4LYwUgO8",
  "refresh_expires_at": "2026-11-28T09:46:17.544517902Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d37da659-09c6-4f88-95aa-0143e4f99458",
  "session_id": "284536fa-1ae2-4b3b-8b06-d499dc51c82d",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632969390",
  "device_ref": "sandbox-31098"
}
```

```json
{
  "challenge_id": "91512ea4-a313-48be-b571-f8669ee2f38d",
  "expires_at": "2026-10-29T09:51:20.087770096Z",
  "resend_available_at": "2026-10-29T09:46:21.087770096Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632969390` → **200**

```json
{
  "phone": "+380632969390",
  "audience": "CLIENT",
  "code": "199630",
  "sent_at": "2026-10-29T09:46:20.090486927Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91512ea4-a313-48be-b571-f8669ee2f38d",
  "code": "199630",
  "device_ref": "sandbox-31098"
}
```

```json
{
  "session_id": "27edc90c-44cf-4ab8-9402-47c49c4f67e9",
  "subject": {
    "type": "CLIENT",
    "id": "d37da659-09c6-4f88-95aa-0143e4f99458"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzdkYTY1OS0wOWM2LTRmODgtOTVhYS0wMTQzZTRmOTk0NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDgwLCJpYXQiOjE3OTMyNjcxODAsImp0aSI6ImExM2FlNzAxLTY3NmEtNDY0Yi05YTQ4LTU3YjVmODI2MmRkZCIsInNpZCI6IjI3ZWRjOTBjLTQ0Y2YtNGFiOC05NDAyLTQ3YzQ5YzRmNjdlOSJ9.OTs2VV9St9yYa4NgH8aDKE2TANHMtc6FtrJD9ZhaUZU",
  "access_expires_at": "2026-10-29T10:01:20.38604864Z",
  "refresh_token": "b_SC-TSJH4uRZ4IIZQ2IQiOiKsoJchgtS6FocCBDy_c",
  "refresh_expires_at": "2026-11-28T09:46:20.385518013Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "0cb10ef4-75ee-44ec-813c-ce90570904c0",
  "expires_at": "2026-10-29T09:51:22.664093701Z",
  "resend_available_at": "2026-10-29T09:46:23.664093701Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632969390` → **200**

```json
{
  "phone": "+380632969390",
  "audience": "CLIENT",
  "code": "494963",
  "sent_at": "2026-10-29T09:46:22.666244821Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638030101"
}
```

```json
{
  "challenge_id": "3fbfd55b-12b9-4c7a-bee9-cfaf342bebe8",
  "expires_at": "2026-10-29T09:51:22.955862448Z",
  "resend_available_at": "2026-10-29T09:46:23.955862448Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638030101` → **200**

```json
{
  "phone": "+380638030101",
  "audience": "CLIENT",
  "code": "028383",
  "sent_at": "2026-10-29T09:46:22.958020233Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "eef2dfa2-cefc-454a-8b35-75426fc314a2",
  "current_challenge_id": "0cb10ef4-75ee-44ec-813c-ce90570904c0",
  "current_code": "000000",
  "new_challenge_id": "3fbfd55b-12b9-4c7a-bee9-cfaf342bebe8",
  "new_code": "028383"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "a1458271-89bc-48bc-becc-fd1e98674840"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "47011387-0a8d-4cc8-9efe-4969be77f706",
  "current_challenge_id": "0cb10ef4-75ee-44ec-813c-ce90570904c0",
  "current_code": "494963",
  "new_challenge_id": "3fbfd55b-12b9-4c7a-bee9-cfaf342bebe8",
  "new_code": "028383"
}
```

```json
{
  "subject_id": "d37da659-09c6-4f88-95aa-0143e4f99458",
  "phone": "+380638030101",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d37da659-09c6-4f88-95aa-0143e4f99458",
  "session_id": "284536fa-1ae2-4b3b-8b06-d499dc51c82d",
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
  "correlation_id": "aed2ded6-58a2-4c22-9d7b-4478527c3934"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638030101",
  "device_ref": "sandbox-18191"
}
```

```json
{
  "challenge_id": "b8b0396f-d60b-4a43-8ae4-baa14c46c827",
  "expires_at": "2026-10-29T09:51:26.358220821Z",
  "resend_available_at": "2026-10-29T09:46:27.358220821Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638030101` → **200**

```json
{
  "phone": "+380638030101",
  "audience": "CLIENT",
  "code": "296447",
  "sent_at": "2026-10-29T09:46:26.360909116Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b8b0396f-d60b-4a43-8ae4-baa14c46c827",
  "code": "296447",
  "device_ref": "sandbox-18191"
}
```

```json
{
  "session_id": "f2b985d6-4c97-4712-b0f7-7f41bbf445dd",
  "subject": {
    "type": "CLIENT",
    "id": "d37da659-09c6-4f88-95aa-0143e4f99458"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzdkYTY1OS0wOWM2LTRmODgtOTVhYS0wMTQzZTRmOTk0NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDg2LCJpYXQiOjE3OTMyNjcxODYsImp0aSI6IjBjOWI5M2U3LTQyNDMtNGVlMC05NmYzLTBiODVmMzk0MjY5NyIsInNpZCI6ImYyYjk4NWQ2LTRjOTctNDcxMi1iMGY3LTdmNDFiYmY0NDVkZCJ9.GxLScfQUSPnBW6CYaOYCuxNSF7JBCfiNFbmmtbTXF-0",
  "access_expires_at": "2026-10-29T10:01:26.654369529Z",
  "refresh_token": "IFthgFwIF_rxJH8swdFneqXVEZ_pXHPb9O0J8LScR7o",
  "refresh_expires_at": "2026-11-28T09:46:26.653859235Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d37da659-09c6-4f88-95aa-0143e4f99458",
  "session_id": "f2b985d6-4c97-4712-b0f7-7f41bbf445dd",
  "account_state": "ACTIVE"
}
```

## The rider loses the phone: support checks who it is and sends a code to the new phone

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
  "session_id": "447f88c1-83e0-4f3f-a561-955ce401b277",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwODcsImlhdCI6MTc5MzI2NzE4NywianRpIjoiYTJjNmI2MGQtZDIyMi00MTc1LWI3NzAtZTgzM2Y1ZDcyMjVmIiwic2lkIjoiNDQ3Zjg4YzEtODNlMC00ZjNmLWE1NjEtOTU1Y2U0MDFiMjc3In0.KAVpCh_kCWINdzKne87Wy-ri80o7eoUHtUzaW668HnY",
  "access_expires_at": "2026-10-29T10:01:27.479188531Z",
  "refresh_token": "wKquc9NYesaP9XtDNRqLY9-e99nfgFovI6ci5LXcFTE",
  "refresh_expires_at": "2026-10-29T21:46:27.478630528Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458` → **200**

```json
{
  "client": {
    "id": "d37da659-09c6-4f88-95aa-0143e4f99458",
    "phone": "+380638030101",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:46:17.542987Z",
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

`POST /api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458/phone/new-code` → **201**

```json
{
  "phone": "+380633643005"
}
```

```json
{
  "challenge_id": "56c4a375-748d-44e4-a3cd-989c11d082ee",
  "expires_at": "2026-10-29T09:51:28.060284781Z",
  "resend_available_at": "2026-10-29T09:46:29.060284781Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633643005` → **200**

```json
{
  "phone": "+380633643005",
  "audience": "CLIENT",
  "code": "072456",
  "sent_at": "2026-10-29T09:46:28.06255426Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458/phone` → **422**

```json
{
  "command_id": "4d1079c1-4168-4a32-b95a-6dfda93f0ea7",
  "expected_version": 3,
  "new_challenge_id": "56c4a375-748d-44e4-a3cd-989c11d082ee",
  "new_code": "072457",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "8ec4ce46-8aaa-4ed4-82df-37f8d704f6d1"
}
```

`POST /api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458/phone` → **400**

```json
{
  "command_id": "ccb15ece-336e-4692-bbd1-90cdf24539f0",
  "expected_version": 3,
  "new_challenge_id": "56c4a375-748d-44e4-a3cd-989c11d082ee",
  "new_code": "072456",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6448fb59-6872-4564-9df3-13490aa16d0e",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/d37da659-09c6-4f88-95aa-0143e4f99458/phone` → **200**

```json
{
  "command_id": "7a082aba-0ea5-4387-954b-846a93f77f3f",
  "expected_version": 3,
  "new_challenge_id": "56c4a375-748d-44e4-a3cd-989c11d082ee",
  "new_code": "072456",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "d37da659-09c6-4f88-95aa-0143e4f99458",
  "phone": "+380633643005",
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
  "correlation_id": "dccdb234-1b22-4578-8bf9-25a133393801"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633643005",
  "device_ref": "sandbox-4240"
}
```

```json
{
  "challenge_id": "7926213e-0241-40d8-a885-b9b9e682be09",
  "expires_at": "2026-10-29T09:51:29.478578303Z",
  "resend_available_at": "2026-10-29T09:46:30.478578303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633643005` → **200**

```json
{
  "phone": "+380633643005",
  "audience": "CLIENT",
  "code": "047210",
  "sent_at": "2026-10-29T09:46:29.481746021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7926213e-0241-40d8-a885-b9b9e682be09",
  "code": "047210",
  "device_ref": "sandbox-4240"
}
```

```json
{
  "session_id": "8b58168d-454e-4d17-9ad1-134c36848361",
  "subject": {
    "type": "CLIENT",
    "id": "d37da659-09c6-4f88-95aa-0143e4f99458"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMzdkYTY1OS0wOWM2LTRmODgtOTVhYS0wMTQzZTRmOTk0NTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDg5LCJpYXQiOjE3OTMyNjcxODksImp0aSI6ImZhZDA1OGQxLTgyOTgtNDRiMi1iNjM1LTYxODU0OWFiMGIxMCIsInNpZCI6IjhiNTgxNjhkLTQ1NGUtNGQxNy05YWQxLTEzNGMzNjg0ODM2MSJ9.Zq3gt9F6AH9NICQisYxI6byZXcn6H6VfcODhkFc5sZk",
  "access_expires_at": "2026-10-29T10:01:29.784083926Z",
  "refresh_token": "uOZJNS0-PsBL34G7pLWjKWRgx36GBPeEcE-eNgFcq7I",
  "refresh_expires_at": "2026-11-28T09:46:29.783522826Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "d37da659-09c6-4f88-95aa-0143e4f99458",
  "session_id": "8b58168d-454e-4d17-9ad1-134c36848361",
  "account_state": "ACTIVE"
}
```

Done: changed with both codes (one was not enough), then by support with a code to the new phone and a reason; sessions ended each time.

# Scenario: places

## A new rider searches: no history yet, the provider answers

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635509646",
  "device_ref": "sandbox-28245"
}
```

```json
{
  "challenge_id": "61b69b19-82f7-4d9a-9c4a-cf0a415be374",
  "expires_at": "2026-10-29T09:51:30.327260962Z",
  "resend_available_at": "2026-10-29T09:46:31.327260962Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635509646` → **200**

```json
{
  "phone": "+380635509646",
  "audience": "CLIENT",
  "code": "812520",
  "sent_at": "2026-10-29T09:46:30.330152195Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61b69b19-82f7-4d9a-9c4a-cf0a415be374",
  "code": "812520",
  "device_ref": "sandbox-28245"
}
```

```json
{
  "session_id": "55ee5084-f549-4e75-a15d-f4024345c9dd",
  "subject": {
    "type": "CLIENT",
    "id": "6b279e48-4a39-432a-a62b-2e11224e6ba2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YjI3OWU0OC00YTM5LTQzMmEtYTYyYi0yZTExMjI0ZTZiYTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDkwLCJpYXQiOjE3OTMyNjcxOTAsImp0aSI6ImRiZjEzMzNkLTdkNDYtNDQ4ZC1hNGFkLTk2YjE1ZTdhOTBjYSIsInNpZCI6IjU1ZWU1MDg0LWY1NDktNGU3NS1hMTVkLWY0MDI0MzQ1YzlkZCJ9.QVsVYdbAuyghuOS7UDqAtviD9JBpTuiZSfKP6j5Psok",
  "access_expires_at": "2026-10-29T10:01:30.637939158Z",
  "refresh_token": "ZAIM4CrCZE1UDOGKLayqOZ26rtMD9FMQKVuiSlUElmk",
  "refresh_expires_at": "2026-11-28T09:46:30.637441931Z",
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
  "session_id": "39058cf4-f22e-4974-ac97-254bc83b28c1",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwOTEsImlhdCI6MTc5MzI2NzE5MSwianRpIjoiNjZhMDg4MjEtMTJlMy00MzVkLWJmODEtMmMyZjhiYzcwOGIxIiwic2lkIjoiMzkwNThjZjQtZjIyZS00OTc0LWFjOTctMjU0YmM4M2IyOGMxIn0.2JxU173yh7E5M1rJAD7vGw2H8TX8mc66z8NxLbqzjgw",
  "access_expires_at": "2026-10-29T10:01:31.805809471Z",
  "refresh_token": "yQWT9mlocG05NbBUHNFU-VgPVBGbwMVHSh6n3rLn0Cg",
  "refresh_expires_at": "2026-10-29T21:46:31.80533821Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380635509646` → **200**

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
  "correlation_id": "a18ce5fb-f41c-437b-a062-f36d9b236c91"
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
  "session_id": "54c0b343-fd05-4e9f-b81c-40a10396c819",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwOTIsImlhdCI6MTc5MzI2NzE5MiwianRpIjoiZTdiMDFkNzUtMmEyYi00NTMyLTlhZjQtYzY2OTU1YjEyOWMzIiwic2lkIjoiNTRjMGIzNDMtZmQwNS00ZTlmLWI4MWMtNDBhMTAzOTZjODE5In0.spFTG2LvAZD6vT0DZevgkDOg-5Uk8_OrJhJ-X5-Iiik",
  "access_expires_at": "2026-10-29T10:01:32.930391151Z",
  "refresh_token": "1YEj3VpMbGpUshC0AMl1ttXlfKK1II29D-CnCxkItQo",
  "refresh_expires_at": "2026-10-29T21:46:32.929779493Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/settings` → **200**

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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T09:42:44.408804Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "2d7eb7ee-fa9a-4322-82eb-09b31554d805",
  "expected_version": 2,
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
  "reason": "Sandbox: pre-orders by reservation"
}
```

```json
{
  "version": 3,
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T09:46:33.498157045Z"
}
```

## The rider books the airport for 2026-10-29T12:46:32Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600729681",
  "device_ref": "sandbox-28213"
}
```

```json
{
  "challenge_id": "499e2f2e-6338-4b45-a07b-fc9e714d3760",
  "expires_at": "2026-10-29T09:51:33.784515435Z",
  "resend_available_at": "2026-10-29T09:46:34.784515435Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600729681` → **200**

```json
{
  "phone": "+48600729681",
  "audience": "CLIENT",
  "code": "010700",
  "sent_at": "2026-10-29T09:46:33.786912234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "499e2f2e-6338-4b45-a07b-fc9e714d3760",
  "code": "010700",
  "device_ref": "sandbox-28213"
}
```

```json
{
  "session_id": "35295e9f-b219-47c6-99f7-5d6c98d31819",
  "subject": {
    "type": "CLIENT",
    "id": "911fd959-87fd-4e9c-b1bf-a93ea7cb3c76"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MTFmZDk1OS04N2ZkLTRlOWMtYjFiZi1hOTNlYTdjYjNjNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MDk0LCJpYXQiOjE3OTMyNjcxOTQsImp0aSI6IjlkNDI1OWZlLTg0YzAtNGY1OS1hNDE2LWMxNTFlNjY4OWE3YiIsInNpZCI6IjM1Mjk1ZTlmLWIyMTktNDdjNi05OWY3LTVkNmM5OGQzMTgxOSJ9.YwrrZZO8UbGw3MXqMr2Crg4TD4tvQB47luwPWNtXrL4",
  "access_expires_at": "2026-10-29T10:01:34.085138746Z",
  "refresh_token": "-prUxj5owBFQVIIgDhg0hODwx3atcuolnpcb3OreS1s",
  "refresh_expires_at": "2026-11-28T09:46:34.08459483Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c3f77719-2fc4-4cb7-8cce-307d4b9963fd",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T12:46:32Z"
}
```

```json
{
  "id": "f5d75462-1f6f-491f-839d-ca48d5d528f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:51:34.360292Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T12:46:32Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f5cadc29-d949-4031-bccc-0774bf3644ec",
  "quote_id": "f5d75462-1f6f-491f-839d-ca48d5d528f1",
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
  "pickup_at": "2026-10-29T12:46:32Z"
}
```

```json
{
  "id": "1833276f-379d-4e66-9c64-3cc76075e827",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "911fd959-87fd-4e9c-b1bf-a93ea7cb3c76",
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
  "created_at": "2026-10-29T09:46:34.645842Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:46:32Z",
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
  "device_ref": "sandbox-29786"
}
```

```json
{
  "challenge_id": "cf6ce918-1ece-434a-bde5-88a6615809e4",
  "expires_at": "2026-10-29T09:51:34.932666265Z",
  "resend_available_at": "2026-10-29T09:46:35.932666265Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "184437",
  "sent_at": "2026-10-29T09:46:34.935395664Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf6ce918-1ece-434a-bde5-88a6615809e4",
  "code": "184437",
  "device_ref": "sandbox-29786"
}
```

```json
{
  "session_id": "351a0701-7584-4055-a395-f6892e3dbe24",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODA5NSwiaWF0IjoxNzkzMjY3MTk1LCJqdGkiOiIzZTZjZjNiYS1iZTM2LTQyYTktOTdhNi1jYjdmMjhjZTZlZjYiLCJzaWQiOiIzNTFhMDcwMS03NTg0LTQwNTUtYTM5NS1mNjg5MmUzZGJlMjQifQ.4_mBX5NOL6YFELvQzAJ5PLpuc0QejGjX_GiTwUgayA4",
  "access_expires_at": "2026-10-29T10:01:35.240572394Z",
  "refresh_token": "N--Gp9Amjqz0PcqW5zYqJ9LBsLpk0P79yMxfP-sGAbg",
  "refresh_expires_at": "2026-11-28T09:46:35.239951694Z",
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
  "command_id": "3ad68b8d-03ba-4d0d-af16-ceff788f726c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:46:35Z",
    "sequence": 1793267195781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bd9b4030-af89-4641-bab0-172c3c05c901",
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
  "last_heartbeat_at": "2026-10-29T09:46:35.79941Z",
  "last_location_at": "2026-10-29T09:46:35.79941Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "1833276f-379d-4e66-9c64-3cc76075e827",
      "short_number": 24,
      "pickup_at": "2026-10-29T12:46:32Z",
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

`POST /api/driver/v1/preorders/1833276f-379d-4e66-9c64-3cc76075e827/reserve` → **200**

```json
{
  "command_id": "87d19b60-7a75-4108-b15a-dfe51b1d4528"
}
```

```json
{
  "id": "4f32bcc9-e896-4427-ae38-5eb144326598",
  "state": "RESERVED",
  "order": {
    "order_id": "1833276f-379d-4e66-9c64-3cc76075e827",
    "short_number": 24,
    "pickup_at": "2026-10-29T12:46:32Z",
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
  "reserved_at": "2026-10-29T09:46:36.359585Z",
  "confirm_from": "2026-10-29T12:16:32Z",
  "confirm_until": "2026-10-29T12:26:32Z",
  "drop_until": "2026-10-29T11:46:32Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "4f32bcc9-e896-4427-ae38-5eb144326598",
      "state": "RESERVED",
      "order": {
        "order_id": "1833276f-379d-4e66-9c64-3cc76075e827",
        "short_number": 24,
        "pickup_at": "2026-10-29T12:46:32Z",
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
      "reserved_at": "2026-10-29T09:46:36.359585Z",
      "confirm_from": "2026-10-29T12:16:32Z",
      "confirm_until": "2026-10-29T12:26:32Z",
      "drop_until": "2026-10-29T11:46:32Z"
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
      "id": "4f32bcc9-e896-4427-ae38-5eb144326598",
      "state": "RESERVED",
      "order": {
        "order_id": "1833276f-379d-4e66-9c64-3cc76075e827",
        "short_number": 24,
        "pickup_at": "2026-10-29T12:46:32Z",
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
      "reserved_at": "2026-10-29T09:46:36.359585Z",
      "confirm_from": "2026-10-29T12:16:32Z",
      "confirm_until": "2026-10-29T12:26:32Z",
      "drop_until": "2026-10-29T11:46:32Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/4f32bcc9-e896-4427-ae38-5eb144326598/confirm` → **409**

```json
{
  "command_id": "7cd251a9-e761-4879-b07f-8ecb192d1049"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/4f32bcc9-e896-4427-ae38-5eb144326598/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7f5d9952-5f19-45ca-b12d-7cf3abe1b071"
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
  "session_id": "dc2ff894-1bba-4bd5-8fb4-ff7975dceca2",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgwOTcsImlhdCI6MTc5MzI2NzE5NywianRpIjoiZTQxOWQwMjQtOThmNi00ZmI0LTg5MjItZjVlYzIwMjE1NWJmIiwic2lkIjoiZGMyZmY4OTQtMWJiYS00YmQ1LThmYjQtZmY3OTc1ZGNlY2EyIn0.zk6frPabifZl0MTImmXtvgkTg11T3Zqc99zptp8MjM8",
  "access_expires_at": "2026-10-29T10:01:37.76544245Z",
  "refresh_token": "ACaGT0IFolNYdXWaWBCd1KL7MxKlHA--hJhHocTNkvw",
  "refresh_expires_at": "2026-10-29T21:46:37.764875057Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/1833276f-379d-4e66-9c64-3cc76075e827` → **200**

```json
{
  "id": "1833276f-379d-4e66-9c64-3cc76075e827",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "911fd959-87fd-4e9c-b1bf-a93ea7cb3c76",
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
  "created_at": "2026-10-29T09:46:34.645842Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T12:46:32Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "4f32bcc9-e896-4427-ae38-5eb144326598",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T09:46:36.359585Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/1833276f-379d-4e66-9c64-3cc76075e827/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T09:46:34.647203Z",
      "actor": {
        "type": "CLIENT",
        "id": "911fd959-87fd-4e9c-b1bf-a93ea7cb3c76",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "1833276f-379d-4e66-9c64-3cc76075e827",
        "preorder": true,
        "quote_id": "f5d75462-1f6f-491f-839d-ca48d5d528f1",
        "pickup_at": "2026-10-29T12:46:32Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "20537314-c62c-4a78-ba4a-0d5c5b7b11f2"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T09:46:36.361016Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "1833276f-379d-4e66-9c64-3cc76075e827",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "4f32bcc9-e896-4427-ae38-5eb144326598"
      },
      "correlation_id": "eca7525d-b908-4743-9a69-9d246f8e6ccb"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 1833276f-379d-4e66-9c64-3cc76075e827, reservation 4f32bcc9-e896-4427-ae38-5eb144326598.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-6266"
}
```

```json
{
  "challenge_id": "d487bc2d-526c-4b69-87cf-4a4c1de313bb",
  "expires_at": "2026-10-29T09:51:38.62991958Z",
  "resend_available_at": "2026-10-29T09:46:39.62991958Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "101157",
  "sent_at": "2026-10-29T09:46:38.632438789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d487bc2d-526c-4b69-87cf-4a4c1de313bb",
  "code": "101157",
  "device_ref": "sandbox-6266"
}
```

```json
{
  "session_id": "37ba2b20-1ca5-471c-b651-dccfda3d07ab",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODA5OCwiaWF0IjoxNzkzMjY3MTk4LCJqdGkiOiI1N2EzYjc4My1jZGY1LTQzMGItOTc3MS00NDYwYjExNzljMjYiLCJzaWQiOiIzN2JhMmIyMC0xY2E1LTQ3MWMtYjY1MS1kY2NmZGEzZDA3YWIifQ.jfquiclMyZyhA0QeEoynJHLPOG2bZZmsbK9s82jojAg",
  "access_expires_at": "2026-10-29T10:01:38.929259751Z",
  "refresh_token": "Btg34hLMKRkEJnUWy0-ZWu9-64oIFvdAvvsVmagnnr0",
  "refresh_expires_at": "2026-11-28T09:46:38.928733136Z",
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
  "command_id": "a1a227ad-63ba-4789-a2b7-75650e9053c2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:46:39Z",
    "sequence": 1793267199464
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:46:39.481973Z",
  "last_location_at": "2026-10-29T09:46:39.481973Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678683479",
  "device_ref": "sandbox-18457"
}
```

```json
{
  "challenge_id": "80ac0da2-c9b5-4d62-b506-0e05f4ef8142",
  "expires_at": "2026-10-29T09:51:39.758579455Z",
  "resend_available_at": "2026-10-29T09:46:40.758579455Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678683479` → **200**

```json
{
  "phone": "+380678683479",
  "audience": "CLIENT",
  "code": "756889",
  "sent_at": "2026-10-29T09:46:39.760768429Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80ac0da2-c9b5-4d62-b506-0e05f4ef8142",
  "code": "756889",
  "device_ref": "sandbox-18457"
}
```

```json
{
  "session_id": "3717d372-0e3c-4ed5-960d-403acfcabedf",
  "subject": {
    "type": "CLIENT",
    "id": "055c3291-1680-4ea0-8bb5-a491c6abcbfb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTVjMzI5MS0xNjgwLTRlYTAtOGJiNS1hNDkxYzZhYmNiZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MTAwLCJpYXQiOjE3OTMyNjcyMDAsImp0aSI6ImRkMzI5YzU5LWZkOGItNDlmMC04MDQ1LWVmYWM4NTdiN2UyNiIsInNpZCI6IjM3MTdkMzcyLTBlM2MtNGVkNS05NjBkLTQwM2FjZmNhYmVkZiJ9.gd75zC3fL1cD0zSAqe2tdQ5xRqdMe-Q-BUo5eq8hJ84",
  "access_expires_at": "2026-10-29T10:01:40.04467019Z",
  "refresh_token": "w3_zBsF9R2ZgCjO9ZzOWIWNetSfFgdmVfegcndgAzlM",
  "refresh_expires_at": "2026-11-28T09:46:40.044026749Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "9ecaaf28-e7b5-4373-9c93-01f730602736",
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
  "id": "5a9a15ec-76d5-4c29-b94b-97eefba2eac5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:51:40.332794Z",
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
  "command_id": "529d1937-ab2f-450b-907e-580b1543154e",
  "quote_id": "5a9a15ec-76d5-4c29-b94b-97eefba2eac5",
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
  "id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "055c3291-1680-4ea0-8bb5-a491c6abcbfb",
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
  "created_at": "2026-10-29T09:46:40.625369Z",
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
    "id": "700ed74d-6d9f-4be3-a079-751042dfe137",
    "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
    "expires_at": "2026-10-29T09:46:55.628766Z",
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

`POST /api/driver/v1/offers/700ed74d-6d9f-4be3-a079-751042dfe137/accept` → **200**

```json
{
  "command_id": "244ea492-390a-40b2-a59a-adba9eeb33f3"
}
```

```json
{
  "id": "feb363a1-4646-458b-ac2e-6594770c409b",
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "70503031-3c1a-45c6-abc7-7c5c6fc9d741",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70503031-3c1a-45c6-abc7-7c5c6fc9d741",
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "assignment_id": "feb363a1-4646-458b-ac2e-6594770c409b",
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

`POST /api/driver/v1/work-sessions/138371ec-d436-4833-a17e-390fef5fabdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:46:41Z",
    "sequence": 1793267201744
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:46:41.762663Z",
  "last_location_at": "2026-10-29T09:46:41.762663Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "70503031-3c1a-45c6-abc7-7c5c6fc9d741",
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "assignment_id": "feb363a1-4646-458b-ac2e-6594770c409b",
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

`POST /api/driver/v1/trips/70503031-3c1a-45c6-abc7-7c5c6fc9d741/arrive` → **200**

```json
{
  "command_id": "89f39362-9f9c-4f55-b016-3019c33655bc",
  "expected_version": 0
}
```

```json
{
  "id": "70503031-3c1a-45c6-abc7-7c5c6fc9d741",
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "assignment_id": "feb363a1-4646-458b-ac2e-6594770c409b",
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
  "arrived_at": "2026-10-29T09:46:42.327479Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/70503031-3c1a-45c6-abc7-7c5c6fc9d741/start` → **200**

```json
{
  "command_id": "33ca0899-1b8c-42b8-af30-d665d18dbb2d",
  "expected_version": 1
}
```

```json
{
  "id": "70503031-3c1a-45c6-abc7-7c5c6fc9d741",
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "assignment_id": "feb363a1-4646-458b-ac2e-6594770c409b",
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
  "arrived_at": "2026-10-29T09:46:42.327479Z",
  "started_at": "2026-10-29T09:46:42.61333Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/138371ec-d436-4833-a17e-390fef5fabdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:46:42Z",
    "sequence": 1793267202896
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:46:42.913625Z",
  "last_location_at": "2026-10-29T09:46:42.913625Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/70503031-3c1a-45c6-abc7-7c5c6fc9d741/complete` → **200**

```json
{
  "command_id": "01f32014-7b09-437c-a079-e80bafc0e72a",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:46:43Z",
  "cash_received": true
}
```

```json
{
  "id": "70503031-3c1a-45c6-abc7-7c5c6fc9d741",
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "assignment_id": "feb363a1-4646-458b-ac2e-6594770c409b",
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
  "arrived_at": "2026-10-29T09:46:42.327479Z",
  "started_at": "2026-10-29T09:46:42.61333Z",
  "completed_at": "2026-10-29T09:46:43.197253Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c88cab1d-1047-4e95-afdb-b2cb065b7265/rating` → **200**

```json
{
  "command_id": "157bf448-b8df-4d0e-bff5-e4f3bf35ceec",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "score": 5,
  "created_at": "2026-10-29T09:46:43.490112732Z"
}
```

`POST /api/driver/v1/orders/c88cab1d-1047-4e95-afdb-b2cb065b7265/rating` → **200**

```json
{
  "command_id": "02efc82d-91c0-4201-81b2-998c8357b8e3",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
  "score": 4,
  "created_at": "2026-10-29T09:46:43.771640153Z"
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
  "session_id": "7134d502-14dc-4777-9020-5453bf2934f4",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMDQsImlhdCI6MTc5MzI2NzIwNCwianRpIjoiNWJiZjUwZTQtYjhiYi00ZWJhLTgwMzMtNTY2YjA0YjQyZWVkIiwic2lkIjoiNzEzNGQ1MDItMTRkYy00Nzc3LTkwMjAtNTQ1M2JmMjkzNGY0In0.fkJDYG-bec6KZ8L8lcOUeqAkov30kudomEQnmP25yyY",
  "access_expires_at": "2026-10-29T10:01:44.620028489Z",
  "refresh_token": "AoxH0YgLzjkXYXGKXNoqH1HIlgAOlQGTebfo37pMoc4",
  "refresh_expires_at": "2026-10-29T21:46:44.619516339Z",
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
  "session_id": "a4aaa2de-1447-4ce0-803c-896ee34d7178",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMDUsImlhdCI6MTc5MzI2NzIwNSwianRpIjoiNjRkYzJjNzYtMDBmMC00MmE3LTk3MjMtOWVhYjQ3MDQ1Njk2Iiwic2lkIjoiYTRhYWEyZGUtMTQ0Ny00Y2UwLTgwM2MtODk2ZWUzNGQ3MTc4In0.8n9Q-27yyCpBhiw3XW0gMwOJ98iBMzvpO7A-59DBDU8",
  "access_expires_at": "2026-10-29T10:01:45.181013439Z",
  "refresh_token": "UwQtP_Wc66BDREPFCzB7bBgviXjsUaqWXjZLs9HUK1I",
  "refresh_expires_at": "2026-10-29T21:46:45.180497986Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c88cab1d-1047-4e95-afdb-b2cb065b7265/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
      "author_type": "RIDER",
      "author_id": "055c3291-1680-4ea0-8bb5-a491c6abcbfb",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T09:46:43.490113Z"
    },
    {
      "order_id": "c88cab1d-1047-4e95-afdb-b2cb065b7265",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "055c3291-1680-4ea0-8bb5-a491c6abcbfb",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T09:46:43.77164Z"
    }
  ]
}
```

Done: ratings for order c88cab1d-1047-4e95-afdb-b2cb065b7265.

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
  "session_id": "0d1b3669-d6c8-4e47-8d1b-6be900053c5f",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMDYsImlhdCI6MTc5MzI2NzIwNiwianRpIjoiMDc5NWIxYzktM2Y1OC00MGQ0LWE0NmMtMGFhNGI5MWQ2NGZhIiwic2lkIjoiMGQxYjM2NjktZDZjOC00ZTQ3LThkMWItNmJlOTAwMDUzYzVmIn0.9ph82beB7bk-fHM1j8s9mIRd77SihjeiyHh3r0f_-ng",
  "access_expires_at": "2026-10-29T10:01:46.044457422Z",
  "refresh_token": "Q1Nds19IU1CDprcapmffxmNAdNnTudYdAtDo9gDgZQc",
  "refresh_expires_at": "2026-10-29T21:46:46.043988145Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "1c906b83-d503-4960-99b8-0ed7055909a0",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "5a7170b0-2172-414d-aa19-225412ab482c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:46.325935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5a7170b0-2172-414d-aa19-225412ab482c` → **200**

```json
{
  "id": "5a7170b0-2172-414d-aa19-225412ab482c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:46.325935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5a7170b0-2172-414d-aa19-225412ab482c` → **200**

```json
{
  "id": "5a7170b0-2172-414d-aa19-225412ab482c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:46.325935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5a7170b0-2172-414d-aa19-225412ab482c` → **200**

```json
{
  "id": "5a7170b0-2172-414d-aa19-225412ab482c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:46.325935Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5a7170b0-2172-414d-aa19-225412ab482c` → **200**

```json
{
  "id": "5a7170b0-2172-414d-aa19-225412ab482c",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T09:46:46.325935Z",
  "ready_at": "2026-10-29T09:46:49.673041Z",
  "expires_at": "2026-10-30T09:46:49.673041Z"
}
```

`GET /api/admin/v1/reports/exports/5a7170b0-2172-414d-aa19-225412ab482c/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "991e82fd-7cc9-4abf-97af-241aa1b72d65",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "a353d805-df67-457f-8acb-d02442710b24",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:50.728341Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a353d805-df67-457f-8acb-d02442710b24` → **200**

```json
{
  "id": "a353d805-df67-457f-8acb-d02442710b24",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:50.728341Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a353d805-df67-457f-8acb-d02442710b24` → **200**

```json
{
  "id": "a353d805-df67-457f-8acb-d02442710b24",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:50.728341Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a353d805-df67-457f-8acb-d02442710b24` → **200**

```json
{
  "id": "a353d805-df67-457f-8acb-d02442710b24",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:46:50.728341Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a353d805-df67-457f-8acb-d02442710b24` → **200**

```json
{
  "id": "a353d805-df67-457f-8acb-d02442710b24",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T09:46:50.728341Z",
  "ready_at": "2026-10-29T09:46:54.680318Z",
  "expires_at": "2026-10-30T09:46:54.680318Z"
}
```

`GET /api/admin/v1/reports/exports/a353d805-df67-457f-8acb-d02442710b24/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/55bf5153-3eba-4f44-8e10-1250641e2d6a` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/55bf5153-3eba-4f44-8e10-1250641e2d6a",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "5e4b5d8a-e172-454e-9ca3-2f37c6c8a66a"
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
  "device_ref": "sandbox-4186"
}
```

```json
{
  "challenge_id": "cd6fa925-d2d8-4b27-a3cd-ef591a4c5a39",
  "expires_at": "2026-10-29T09:51:55.415117943Z",
  "resend_available_at": "2026-10-29T09:46:56.415117943Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "813329",
  "sent_at": "2026-10-29T09:46:55.417789682Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd6fa925-d2d8-4b27-a3cd-ef591a4c5a39",
  "code": "813329",
  "device_ref": "sandbox-4186"
}
```

```json
{
  "session_id": "85d44543-9556-4d3f-9b15-c387e61b262c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODExNSwiaWF0IjoxNzkzMjY3MjE1LCJqdGkiOiJjZTkzMjM0Mi0xNzk3LTQyMGMtYjU3My0xOTRjYjQxOTUzYjYiLCJzaWQiOiI4NWQ0NDU0My05NTU2LTRkM2YtOWIxNS1jMzg3ZTYxYjI2MmMifQ.UK_AtslZB65it9XtYGictIBuiTHm01EeQ6fDNQ5Z7FM",
  "access_expires_at": "2026-10-29T10:01:55.717841969Z",
  "refresh_token": "apr1Wz-qAyq363Bf307uo3fWwL9NBIPuJK1mMOEG4Og",
  "refresh_expires_at": "2026-11-28T09:46:55.71734353Z",
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
  "command_id": "4d5772a0-2b4d-4153-b341-e6ee092b12a2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:46:56Z",
    "sequence": 1793267216502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f1171724-6ea7-43fa-9d3b-1b6526595e4b",
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
  "last_heartbeat_at": "2026-10-29T09:46:56.519464Z",
  "last_location_at": "2026-10-29T09:46:56.519464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "bd423c50-f412-4ba8-a6e2-f1fb43d47d69",
  "points": [
    {
      "sequence": 1793267218796,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T09:45:58Z"
    },
    {
      "sequence": 1793267218803,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T09:46:58Z"
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
  "session_id": "559fed35-8938-4134-9180-60515512f651",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMTksImlhdCI6MTc5MzI2NzIxOSwianRpIjoiYzA4ZmViOWMtYmY3Ny00NWUwLTliMjUtZDg0ODMwNTU3Y2IzIiwic2lkIjoiNTU5ZmVkMzUtODkzOC00MTM0LTkxODAtNjA1MTU1MTJmNjUxIn0.WDozcT9nfUV2K2HnWbXFTX14HKS0rpDxCOrcfFc5jrQ",
  "access_expires_at": "2026-10-29T10:01:59.417277693Z",
  "refresh_token": "zxfJ8eJbbisNBO-bW3VMq3yrVuPdKTBUnEyu289ZPJ8",
  "refresh_expires_at": "2026-10-29T21:46:59.416757912Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "8ca20112-e3d7-4d6f-9ccb-9d62adac4029",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T09:46:58Z",
        "track_point_id": "357c0acf-7025-4aa4-b3fd-6f7700910a21",
        "work_session_id": "f1171724-6ea7-43fa-9d3b-1b6526595e4b"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T09:46:58Z",
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
  "history": []
}
```

## Support confirms it with a reason — once

`POST /api/admin/v1/driver-risk-flags/8ca20112-e3d7-4d6f-9ccb-9d62adac4029/confirm` → **200**

```json
{
  "command_id": "afd64040-9636-4a37-9417-a443c45b5cd2",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "8ca20112-e3d7-4d6f-9ccb-9d62adac4029",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T09:46:58Z",
    "track_point_id": "357c0acf-7025-4aa4-b3fd-6f7700910a21",
    "work_session_id": "f1171724-6ea7-43fa-9d3b-1b6526595e4b"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T09:46:58Z",
  "reason": null,
  "reviewed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reviewed_at": "2026-10-29T09:47:00.295485Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/8ca20112-e3d7-4d6f-9ccb-9d62adac4029/dismiss` → **409**

```json
{
  "command_id": "26b0f1ea-a790-4c97-9e54-85cb55aeb4bf",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/8ca20112-e3d7-4d6f-9ccb-9d62adac4029/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3bcdf110-7415-4047-8bcd-3cbd11b7d787"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "a157d1d8-ea1f-4968-af9b-4fb96ab39ca0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "6d2a656d-616a-4e47-9435-34989ca71a74",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "raised_at": "2026-10-29T09:47:00.886429Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/6d2a656d-616a-4e47-9435-34989ca71a74/dismiss` → **200**

```json
{
  "command_id": "952538c3-6d79-4957-a62f-f956de993753",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "6d2a656d-616a-4e47-9435-34989ca71a74",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "raised_at": "2026-10-29T09:47:00.886429Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reviewed_at": "2026-10-29T09:47:01.180418Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "d3e73e09-0a05-47c6-9ac7-c082db1cd68e",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "8ca20112-e3d7-4d6f-9ccb-9d62adac4029"
}
```

```json
{
  "id": "5a000000-0000-4000-8000-000000000403",
  "name": "Андрій Шевчук",
  "language": "ru",
  "review_status": "SUSPENDED",
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

`GET /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403` → **200**

```json
{
  "profile": {
    "id": "5a000000-0000-4000-8000-000000000403",
    "name": "Андрій Шевчук",
    "language": "ru",
    "review_status": "SUSPENDED",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:47:01.477637Z"
    }
  ]
}
```

Done: flag 8ca20112-e3d7-4d6f-9ccb-9d62adac4029 confirmed, suspension named it, driver reinstated.

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
  "session_id": "d268e9ca-5ddd-4a2f-81e0-8f8e128bcb2c",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMjIsImlhdCI6MTc5MzI2NzIyMiwianRpIjoiMjRhYjRlMGUtOTcyYi00ZjM1LWE4ZDktYjFmNzZiZTNhZWVkIiwic2lkIjoiZDI2OGU5Y2EtNWRkZC00YTJmLTgxZTAtOGY4ZTEyOGJjYjJjIn0.hVi_Ladm0bFdNBLfx2ss319GMQFGtspFQvN5-U8V_Fc",
  "access_expires_at": "2026-10-29T10:02:02.331506981Z",
  "refresh_token": "VWnIsDylgo0s2y5JavwnjUPi-ML9hSorVREySLRtzSk",
  "refresh_expires_at": "2026-10-29T21:47:02.331007139Z",
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
  },
  "phone": "+380500000003",
  "history": [
    {
      "from": "APPROVED",
      "to": "SUSPENDED",
      "actor_type": "STAFF",
      "actor_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:47:01.477637Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "59ea5870-95ff-4ffc-ae3c-ca2830199ad6",
  "expected_version": 6,
  "reason": "Sandbox clean-up"
}
```

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

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "f1171724-6ea7-43fa-9d3b-1b6526595e4b",
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
  "last_heartbeat_at": "2026-10-29T09:46:56.519464Z",
  "last_location_at": "2026-10-29T09:46:56.519464Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f1171724-6ea7-43fa-9d3b-1b6526595e4b/close` → **200**

```json
{
  "command_id": "d2684f52-d617-4003-a0e3-4cfdb0d61f4b",
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
  "session_id": "6d9d91d5-3333-434a-9daf-fd6fa14cf068",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMjQsImlhdCI6MTc5MzI2NzIyNCwianRpIjoiNjIxMWRjZWQtNTI1MS00OWQ3LThhZWQtZjhiM2NiMWExZDhlIiwic2lkIjoiNmQ5ZDkxZDUtMzMzMy00MzRhLTlkYWYtZmQ2ZmExNGNmMDY4In0.YSqHk6IalMGOOmWFb9FotUvYtF3ybdXPLUOb4fvgfL0",
  "access_expires_at": "2026-10-29T10:02:04.060524284Z",
  "refresh_token": "ZVlv5uy_5j1b_8Jy4sUVp5f5YaQ7InmDoh9SIRlZ3BU",
  "refresh_expires_at": "2026-10-29T21:47:04.059982813Z",
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
  "command_id": "96264817-fa54-4118-8968-9ea31b9e0890",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T09:47:04.644094Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "96264817-fa54-4118-8968-9ea31b9e0890",
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
  "changed_by": "05964478-3d01-486a-b6e6-062abbd67c76",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T09:47:04.644094Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48221859304",
  "device_ref": "sandbox-12615"
}
```

```json
{
  "challenge_id": "5dc1e765-500f-47a2-abf0-1cd04e0d3da4",
  "expires_at": "2026-10-29T09:52:05.219186812Z",
  "resend_available_at": "2026-10-29T09:47:06.219186812Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48221859304` → **200**

```json
{
  "phone": "+48221859304",
  "audience": "CLIENT",
  "code": "292732",
  "sent_at": "2026-10-29T09:47:05.22174086Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5dc1e765-500f-47a2-abf0-1cd04e0d3da4",
  "code": "292732",
  "device_ref": "sandbox-12615"
}
```

```json
{
  "session_id": "0551a860-f72d-46df-a67e-a7b8c0f794a5",
  "subject": {
    "type": "CLIENT",
    "id": "7ba57075-61ef-4671-9e60-fbaa0a7c84e2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmE1NzA3NS02MWVmLTQ2NzEtOWU2MC1mYmFhMGE3Yzg0ZTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MTI1LCJpYXQiOjE3OTMyNjcyMjUsImp0aSI6ImQzYWVkMGRmLTg2ZWQtNGU1ZC04NDBkLWI3OGU2ZjNjMmZiNiIsInNpZCI6IjA1NTFhODYwLWY3MmQtNDZkZi1hNjdlLWE3YjhjMGY3OTRhNSJ9.916QTZw7MD-kPypRz3QtOfTwceXHFtXrRWBhKatqbpY",
  "access_expires_at": "2026-10-29T10:02:05.516053632Z",
  "refresh_token": "HZ2MqYgA7B8nbya67TmzWtb6q7LWZZOe5s2ThYK5jO4",
  "refresh_expires_at": "2026-11-28T09:47:05.515509255Z",
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
  "correlation_id": "796abd54-2f49-470d-8aac-c0457d9f22a4"
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
  "device_ref": "sandbox-11982"
}
```

```json
{
  "challenge_id": "64c7a1d0-9e98-4254-b575-786e80a8d577",
  "expires_at": "2026-10-29T09:52:06.33010565Z",
  "resend_available_at": "2026-10-29T09:47:07.33010565Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "690606",
  "sent_at": "2026-10-29T09:47:06.332432327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "64c7a1d0-9e98-4254-b575-786e80a8d577",
  "code": "690606",
  "device_ref": "sandbox-11982"
}
```

```json
{
  "session_id": "4f9dc899-03f0-44a8-8136-ffa58f6cf601",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODEyNiwiaWF0IjoxNzkzMjY3MjI2LCJqdGkiOiI5NDU4NTljMC01MDA2LTQxZDYtYjVlZS1kYWU4NTEzZGJhM2EiLCJzaWQiOiI0ZjlkYzg5OS0wM2YwLTQ0YTgtODEzNi1mZmE1OGY2Y2Y2MDEifQ.NZb7ZLoqelMnDI3waG1AZWMm1I-bFbCsiSQGJhW2rOg",
  "access_expires_at": "2026-10-29T10:02:06.623552719Z",
  "refresh_token": "kKTN6wlnfMHurm-MrgIwsdrN9VMrOBIUpZqz2a6Etu0",
  "refresh_expires_at": "2026-11-28T09:47:06.623019984Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bd9b4030-af89-4641-bab0-172c3c05c901",
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
  "last_heartbeat_at": "2026-10-29T09:46:35.79941Z",
  "last_location_at": "2026-10-29T09:46:35.79941Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bd9b4030-af89-4641-bab0-172c3c05c901/handover` → **200**

```json
{
  "command_id": "6ba41a38-8d41-401c-92b6-32efd1826b88",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bd9b4030-af89-4641-bab0-172c3c05c901",
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
  "last_heartbeat_at": "2026-10-29T09:46:35.79941Z",
  "last_location_at": "2026-10-29T09:46:35.79941Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/bd9b4030-af89-4641-bab0-172c3c05c901/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:47:07Z",
    "sequence": 1793267227446
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "bd9b4030-af89-4641-bab0-172c3c05c901",
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
  "last_heartbeat_at": "2026-10-29T09:47:07.464381Z",
  "last_location_at": "2026-10-29T09:47:07.464381Z",
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
  "session_id": "bd9b4030-af89-4641-bab0-172c3c05c901",
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
  "last_heartbeat_at": "2026-10-29T09:47:07.464381Z",
  "last_location_at": "2026-10-29T09:47:07.464381Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bd9b4030-af89-4641-bab0-172c3c05c901/close` → **200**

```json
{
  "command_id": "55907765-9712-443e-bfd2-a209a03463a8",
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
  "correlation_id": "c53660ad-9bef-431f-b2ad-3f50a66cde65"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671413596",
  "device_ref": "sandbox-13387"
}
```

```json
{
  "challenge_id": "a96bae9c-a78f-4db1-9e71-f867b6842dc5",
  "expires_at": "2026-10-29T09:52:08.866071888Z",
  "resend_available_at": "2026-10-29T09:47:09.866071888Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671413596` → **200**

```json
{
  "phone": "+380671413596",
  "audience": "CLIENT",
  "code": "133999",
  "sent_at": "2026-10-29T09:47:08.868433137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a96bae9c-a78f-4db1-9e71-f867b6842dc5",
  "code": "133999",
  "device_ref": "sandbox-13387"
}
```

```json
{
  "session_id": "a0d8a2c6-7d2f-475c-9ddd-6a7066e26235",
  "subject": {
    "type": "CLIENT",
    "id": "796ac479-434a-46a3-8731-a8f8d8faa32e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OTZhYzQ3OS00MzRhLTQ2YTMtODczMS1hOGY4ZDhmYWEzMmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MTI5LCJpYXQiOjE3OTMyNjcyMjksImp0aSI6ImNjMzRiYjE4LWZkOGUtNDY4Yy1hZjUzLTRhY2M4ZTIzOGYyNyIsInNpZCI6ImEwZDhhMmM2LTdkMmYtNDc1Yy05ZGRkLTZhNzA2NmUyNjIzNSJ9.floZZzsRk4Vf7ZuPyfweNucCRrNa-u0Ted_sCL_jktQ",
  "access_expires_at": "2026-10-29T10:02:09.17154098Z",
  "refresh_token": "iUez1CrZAysD3s9iCPmZq7nqEcApTZOQnEPG4HyxA40",
  "refresh_expires_at": "2026-11-28T09:47:09.171055964Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "ec39bea2-0b93-4e0d-8037-3297debfc6cd",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "4b40f079-32ed-4714-9eb6-dfc01174850f",
  "upload_path": "/api/rider/v1/uploads/4b40f079-32ed-4714-9eb6-dfc01174850f",
  "expires_at": "2026-10-29T10:02:09.468120425Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/4b40f079-32ed-4714-9eb6-dfc01174850f` → **200**

```json
{
  "file_id": "4b40f079-32ed-4714-9eb6-dfc01174850f",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "fb7488bc-825e-4418-ae0e-15b303550ca2",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "4b40f079-32ed-4714-9eb6-dfc01174850f"
  ]
}
```

```json
{
  "id": "fe08ce36-aa87-453f-ba3a-495804408b2e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T09:47:09.857681Z",
  "updated_at": "2026-10-29T09:47:09.857681Z",
  "respond_by": "2026-10-29T13:47:09.857681Z",
  "messages": [
    {
      "id": "723de96e-c6ae-48a0-95f2-1383ede0145b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:47:09.858788Z",
      "attachments": [
        {
          "file_id": "4b40f079-32ed-4714-9eb6-dfc01174850f",
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
  "session_id": "d53f20bb-61dc-4c25-a284-909eda467a9c",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMzAsImlhdCI6MTc5MzI2NzIzMCwianRpIjoiOTgxODg0ODUtMjZlYS00ODk4LWFlNGQtZmY4OGY0ZTJiNTA4Iiwic2lkIjoiZDUzZjIwYmItNjFkYy00YzI1LWEyODQtOTA5ZWRhNDY3YTljIn0.r8w5VLnd6DWhR-83rrBVFSm09nII0UvrxA7IPWi94R0",
  "access_expires_at": "2026-10-29T10:02:10.503387013Z",
  "refresh_token": "mnqhPnE1_kAXHfGeOX6rGz0oTTL-LcDZTahJ6OkItv0",
  "refresh_expires_at": "2026-10-29T21:47:10.502887619Z",
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
  "session_id": "acb85345-73d8-46de-870f-6bd969002eef",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMzEsImlhdCI6MTc5MzI2NzIzMSwianRpIjoiZmE5YWU2ZWYtYWFkZC00NTcyLWE4NjItYzgxNDRmNzg2MThhIiwic2lkIjoiYWNiODUzNDUtNzNkOC00NmRlLTg3MGYtNmJkOTY5MDAyZWVmIn0.0MEah2iKzAfnMfTPNaYxctkzi_U4Ym4fvWrSQRnslDU",
  "access_expires_at": "2026-10-29T10:02:11.079487486Z",
  "refresh_token": "0tJCAOEw_S7UOyIXxZgP2gkk89T9wJkBJr8VSPXeE4U",
  "refresh_expires_at": "2026-10-29T21:47:11.079019371Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/fe08ce36-aa87-453f-ba3a-495804408b2e/attachments/4b40f079-32ed-4714-9eb6-dfc01174850f` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "ec41953f-802d-47c2-a4e2-b3f76c5040ab",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1c0bb832-39e4-4d6e-81ec-0854774de6f8",
  "upload_path": "/api/operator/v1/uploads/1c0bb832-39e4-4d6e-81ec-0854774de6f8",
  "expires_at": "2026-10-29T10:02:11.378292926Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/1c0bb832-39e4-4d6e-81ec-0854774de6f8` → **200**

```json
{
  "file_id": "1c0bb832-39e4-4d6e-81ec-0854774de6f8",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/fe08ce36-aa87-453f-ba3a-495804408b2e` → **200**

```json
{
  "id": "fe08ce36-aa87-453f-ba3a-495804408b2e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T09:47:09.857681Z",
  "updated_at": "2026-10-29T09:47:09.857681Z",
  "respond_by": "2026-10-29T13:47:09.857681Z",
  "messages": [
    {
      "id": "723de96e-c6ae-48a0-95f2-1383ede0145b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:47:09.858788Z",
      "attachments": [
        {
          "file_id": "4b40f079-32ed-4714-9eb6-dfc01174850f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/fe08ce36-aa87-453f-ba3a-495804408b2e/comments` → **200**

```json
{
  "command_id": "db54f6c5-7d87-4897-a0a0-c809e92c7eab",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "1c0bb832-39e4-4d6e-81ec-0854774de6f8"
  ]
}
```

```json
{
  "id": "fe08ce36-aa87-453f-ba3a-495804408b2e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T09:47:09.857681Z",
  "updated_at": "2026-10-29T09:47:11.9678Z",
  "respond_by": "2026-10-29T13:47:09.857681Z",
  "messages": [
    {
      "id": "723de96e-c6ae-48a0-95f2-1383ede0145b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:47:09.858788Z",
      "attachments": [
        {
          "file_id": "4b40f079-32ed-4714-9eb6-dfc01174850f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9632c1e5-fe50-4a0c-ad99-b00e02b23554",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T09:47:11.96739Z",
      "attachments": [
        {
          "file_id": "1c0bb832-39e4-4d6e-81ec-0854774de6f8",
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

`GET /api/rider/v1/support/cases/fe08ce36-aa87-453f-ba3a-495804408b2e` → **200**

```json
{
  "id": "fe08ce36-aa87-453f-ba3a-495804408b2e",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T09:47:09.857681Z",
  "updated_at": "2026-10-29T09:47:11.9678Z",
  "respond_by": "2026-10-29T13:47:09.857681Z",
  "messages": [
    {
      "id": "723de96e-c6ae-48a0-95f2-1383ede0145b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "796ac479-434a-46a3-8731-a8f8d8faa32e",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:47:09.858788Z",
      "attachments": [
        {
          "file_id": "4b40f079-32ed-4714-9eb6-dfc01174850f",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9632c1e5-fe50-4a0c-ad99-b00e02b23554",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T09:47:11.96739Z",
      "attachments": [
        {
          "file_id": "1c0bb832-39e4-4d6e-81ec-0854774de6f8",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/fe08ce36-aa87-453f-ba3a-495804408b2e/attachments/1c0bb832-39e4-4d6e-81ec-0854774de6f8` → **200**

Done: support case fe08ce36-aa87-453f-ba3a-495804408b2e, rider attachment 4b40f079-32ed-4714-9eb6-dfc01174850f, operator attachment 1c0bb832-39e4-4d6e-81ec-0854774de6f8.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735762083",
  "device_ref": "sandbox-26800"
}
```

```json
{
  "challenge_id": "a132cf30-35f2-4cac-8fc2-69dbc1da63d0",
  "expires_at": "2026-10-29T09:52:12.572229089Z",
  "resend_available_at": "2026-10-29T09:47:13.572229089Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735762083` → **200**

```json
{
  "phone": "+380735762083",
  "audience": "CLIENT",
  "code": "917834",
  "sent_at": "2026-10-29T09:47:12.574775185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a132cf30-35f2-4cac-8fc2-69dbc1da63d0",
  "code": "917834",
  "device_ref": "sandbox-26800"
}
```

```json
{
  "session_id": "17baa0ca-716e-4ceb-a315-f58ea4f5982a",
  "subject": {
    "type": "CLIENT",
    "id": "3e731637-bc19-4e83-95ff-a6edac30f6ce"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZTczMTYzNy1iYzE5LTRlODMtOTVmZi1hNmVkYWMzMGY2Y2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MTMyLCJpYXQiOjE3OTMyNjcyMzIsImp0aSI6IjkwYjRjYjA3LTgwYjctNDI0MC04OWJjLTJkZWM2MmE5MzI0YiIsInNpZCI6IjE3YmFhMGNhLTcxNmUtNGNlYi1hMzE1LWY1OGVhNGY1OTgyYSJ9.UAA6KZhxOsSxXGDalnpeprsSvnTbSoDq7C2W6cSO3sw",
  "access_expires_at": "2026-10-29T10:02:12.880944178Z",
  "refresh_token": "pD3Wso0-PpxsUThdKgQNeezqgxXCw3xFhdOnkFNv0Q8",
  "refresh_expires_at": "2026-11-28T09:47:12.8804065Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "4c9fee27-425f-40f9-bcef-7f7337c2e791",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "506da176-a628-4b41-8c63-8d6cb2080290",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-506da176-a628-4b41-8c63-8d6cb2080290",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "0226d605393cf2211793b7f7a6b08c3d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=506da176-a628-4b41-8c63-8d6cb2080290",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735762083"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=506da176-a628-4b41-8c63-8d6cb2080290",
  "expires_at": "2026-10-29T10:17:13.164736Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/506da176-a628-4b41-8c63-8d6cb2080290` → **200**

```json
{
  "id": "506da176-a628-4b41-8c63-8d6cb2080290",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:17:13.164736Z",
  "card": {
    "id": "88d4b19a-5717-4c75-be4f-b680ca7bb253",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5351",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:47:13.448401Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aff97f26-2c10-44ca-808a-264483c4697b",
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
  "id": "a4adedad-7598-40aa-9dfc-6d6b58c96d90",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:52:13.751339Z",
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
  "command_id": "196b876e-86c6-4988-9f5a-b2a71211d964",
  "quote_id": "a4adedad-7598-40aa-9dfc-6d6b58c96d90",
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
  "id": "b87ee0e7-cea4-42e9-86c5-9239df6d04ec",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "3e731637-bc19-4e83-95ff-a6edac30f6ce",
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
  "created_at": "2026-10-29T09:47:14.042775Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec` → **200**

```json
{
  "id": "b87ee0e7-cea4-42e9-86c5-9239df6d04ec",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e731637-bc19-4e83-95ff-a6edac30f6ce",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:47:14.042775Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The rider decides to pay in cash

`GET /api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec` → **200**

```json
{
  "id": "b87ee0e7-cea4-42e9-86c5-9239df6d04ec",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "3e731637-bc19-4e83-95ff-a6edac30f6ce",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:47:14.042775Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec/switch-to-cash` → **200**

```json
{
  "command_id": "8d2e479b-d09d-4f4e-b076-a7af2e86df01",
  "expected_version": 3
}
```

```json
{
  "id": "b87ee0e7-cea4-42e9-86c5-9239df6d04ec",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3e731637-bc19-4e83-95ff-a6edac30f6ce",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:47:14.042775Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec/switch-to-cash` → **409**

```json
{
  "command_id": "a9448917-e424-4c18-b6ad-8709a6dfdf7b",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a25e8d67-7aac-4998-aa8c-5675a9126814"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec` → **200**

```json
{
  "id": "b87ee0e7-cea4-42e9-86c5-9239df6d04ec",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "3e731637-bc19-4e83-95ff-a6edac30f6ce",
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
  "search_phase": "BROADCAST",
  "assignment": null,
  "created_at": "2026-10-29T09:47:14.042775Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/b87ee0e7-cea4-42e9-86c5-9239df6d04ec/cancel` → **200**

```json
{
  "command_id": "0c8810fd-e9e6-46ae-9eee-baeba013aacd",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "b87ee0e7-cea4-42e9-86c5-9239df6d04ec",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3e731637-bc19-4e83-95ff-a6edac30f6ce",
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
  "search_phase": "STOPPED",
  "assignment": null,
  "created_at": "2026-10-29T09:47:14.042775Z",
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
  "session_id": "4fa57a9b-3a2a-4153-b45e-9eff170278c8",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxMzYsImlhdCI6MTc5MzI2NzIzNiwianRpIjoiYzMxNGM1OWEtM2MwMC00MWQ5LTk3YTEtNTcyMWI2MzdhZDQ1Iiwic2lkIjoiNGZhNTdhOWItM2EyYS00MTUzLWI0NWUtOWVmZjE3MDI3OGM4In0.W16iQi862KX85fU1XxbQXE8qsn_hk3M_ofBpxpeFC7E",
  "access_expires_at": "2026-10-29T10:02:16.384239616Z",
  "refresh_token": "IFfye9q-NKNauJLJ_eY2GhLbQpMuo8LgkXxyBDrxxLQ",
  "refresh_expires_at": "2026-10-29T21:47:16.383732307Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-7138"
}
```

```json
{
  "challenge_id": "7ad28be6-b644-4c02-b6b4-96ed61f13601",
  "expires_at": "2026-10-29T09:52:16.659612426Z",
  "resend_available_at": "2026-10-29T09:47:17.659612426Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "151203",
  "sent_at": "2026-10-29T09:47:16.662284495Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7ad28be6-b644-4c02-b6b4-96ed61f13601",
  "code": "151203",
  "device_ref": "sandbox-7138"
}
```

```json
{
  "session_id": "5bce07b7-cdf7-4543-9762-8871b909820d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODEzNiwiaWF0IjoxNzkzMjY3MjM2LCJqdGkiOiIxYzY5YTA1MC1hY2RmLTRhYWEtOWVhMy1lN2EyMDk0ZjRhZDUiLCJzaWQiOiI1YmNlMDdiNy1jZGY3LTQ1NDMtOTc2Mi04ODcxYjkwOTgyMGQifQ.cJ60ZCNIjoen0ubmSrQXW2Jnc7L5aTBJyGODar-5Rm8",
  "access_expires_at": "2026-10-29T10:02:16.959720865Z",
  "refresh_token": "39dloxLUI1JJr6Rbg8YnM4aG0Q4CYA5WenvyvZgqoI8",
  "refresh_expires_at": "2026-11-28T09:47:16.959225925Z",
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
  "version": 8,
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
    "version": 8,
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
      "actor_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:47:01.477637Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "05964478-3d01-486a-b6e6-062abbd67c76",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T09:47:02.897094Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "cc898bcb-97ce-43f7-9f35-a09a4d409ac5",
  "expected_version": 8,
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
  "version": 9,
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
  "device_ref": "sandbox-19179"
}
```

```json
{
  "challenge_id": "23b2746b-432a-490d-be4a-19a72682b957",
  "expires_at": "2026-10-29T09:52:18.089668922Z",
  "resend_available_at": "2026-10-29T09:47:19.089668922Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "215994",
  "sent_at": "2026-10-29T09:47:18.09240597Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "23b2746b-432a-490d-be4a-19a72682b957",
  "code": "215994",
  "device_ref": "sandbox-19179"
}
```

```json
{
  "session_id": "d273f3a8-8b47-4281-9500-dc8b6ab30843",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODEzOCwiaWF0IjoxNzkzMjY3MjM4LCJqdGkiOiI4ZWI4NjMwMS1iMjUyLTQ5MzEtYjczYy00OTAzOTFhNjUwYTQiLCJzaWQiOiJkMjczZjNhOC04YjQ3LTQyODEtOTUwMC1kYzhiNmFiMzA4NDMifQ.ncsmF4tkv7jmxEwJkHZZlCFhE94wDodNtck1R-STjxU",
  "access_expires_at": "2026-10-29T10:02:18.417966002Z",
  "refresh_token": "OG1CoKvsh1ONRqAhWOS-t3LHluEAOOWREOPzu3NB56A",
  "refresh_expires_at": "2026-11-28T09:47:18.417407828Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:46:42.913625Z",
  "last_location_at": "2026-10-29T09:46:42.913625Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/138371ec-d436-4833-a17e-390fef5fabdc/handover` → **200**

```json
{
  "command_id": "348669b2-1b45-4453-8a85-7bad73b87af9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:46:42.913625Z",
  "last_location_at": "2026-10-29T09:46:42.913625Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/138371ec-d436-4833-a17e-390fef5fabdc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:47:19Z",
    "sequence": 1793267239237
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:47:19.254589Z",
  "last_location_at": "2026-10-29T09:47:19.254589Z",
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
  "command_id": "8d06db58-7502-42eb-b0f5-08378c7e7b8d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:47:19Z",
    "sequence": 1793267239798
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c7ef1c3-285e-442c-88fa-e8d6e22fe61e",
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
  "last_heartbeat_at": "2026-10-29T09:47:19.816812Z",
  "last_location_at": "2026-10-29T09:47:19.816812Z",
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
  "session_id": "e68a72cb-e04d-48d6-a99c-1be4bcb9fe9c",
  "subject": {
    "type": "STAFF",
    "id": "05964478-3d01-486a-b6e6-062abbd67c76"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTk2NDQ3OC0zZDAxLTQ4NmEtYjZlNi0wNjJhYmJkNjdjNzYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjgxNDAsImlhdCI6MTc5MzI2NzI0MCwianRpIjoiMjM3MmFiNTMtNzUwNS00NDIzLThiYTQtMjZiNmViMWRjODI4Iiwic2lkIjoiZTY4YTcyY2ItZTA0ZC00OGQ2LWE5OWMtMWJlNGJjYjlmZTljIn0.KzSv7-IXj8GFQs5Z5SkCopofdMY9tH0NMoUbRphlslc",
  "access_expires_at": "2026-10-29T10:02:20.392165712Z",
  "refresh_token": "F0kxZe06Aq0fv4eyNhwc18vyUIBv58oQD7zrqPVlfdk",
  "refresh_expires_at": "2026-10-29T21:47:20.391663934Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "44af8bba-d32a-48d7-b9db-1911f89fac94",
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
  "id": "e2563679-b856-4747-8c4b-2290b6e553c9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:52:20.664692Z",
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
  "command_id": "1d4b680d-7278-4e27-9f65-af760708304e",
  "quote_id": "e2563679-b856-4747-8c4b-2290b6e553c9",
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
  "id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "short_number": 27,
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
  "created_at": "2026-10-29T09:47:20.955767Z",
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
    "id": "150901cc-ebd3-45cc-b4cf-86f9a9f11df1",
    "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
    "expires_at": "2026-10-29T09:47:35.959539Z",
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

`POST /api/driver/v1/offers/150901cc-ebd3-45cc-b4cf-86f9a9f11df1/accept` → **200**

```json
{
  "command_id": "4fc1a418-faa0-4dac-bef6-6c548f8fa303"
}
```

```json
{
  "id": "836d5699-9053-438b-85ec-7f97d0ea4890",
  "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1817677a-d472-4372-8e3d-e44c7c4037aa",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1817677a-d472-4372-8e3d-e44c7c4037aa",
  "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "assignment_id": "836d5699-9053-438b-85ec-7f97d0ea4890",
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

`POST /api/driver/v1/work-sessions/6c7ef1c3-285e-442c-88fa-e8d6e22fe61e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:47:22Z",
    "sequence": 1793267242339
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "6c7ef1c3-285e-442c-88fa-e8d6e22fe61e",
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
  "last_heartbeat_at": "2026-10-29T09:47:22.357453Z",
  "last_location_at": "2026-10-29T09:47:22.357453Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1817677a-d472-4372-8e3d-e44c7c4037aa/arrive` → **200**

```json
{
  "command_id": "346230a3-33f5-4a32-91ed-bbe8becdf4cd",
  "expected_version": 0
}
```

```json
{
  "id": "1817677a-d472-4372-8e3d-e44c7c4037aa",
  "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "assignment_id": "836d5699-9053-438b-85ec-7f97d0ea4890",
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
  "arrived_at": "2026-10-29T09:47:22.640274Z",
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

`POST /api/driver/v1/trips/1817677a-d472-4372-8e3d-e44c7c4037aa/start` → **200**

```json
{
  "command_id": "2ac54b01-24eb-4c5b-962b-8e55ee3158d0",
  "expected_version": 1
}
```

```json
{
  "id": "1817677a-d472-4372-8e3d-e44c7c4037aa",
  "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "assignment_id": "836d5699-9053-438b-85ec-7f97d0ea4890",
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
  "arrived_at": "2026-10-29T09:47:22.640274Z",
  "started_at": "2026-10-29T09:47:22.923606Z",
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

`POST /api/driver/v1/trips/1817677a-d472-4372-8e3d-e44c7c4037aa/complete` → **200**

```json
{
  "command_id": "ad2b67de-5898-4c42-ae97-4a1e377f2f03",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:47:23Z",
  "cash_received": true
}
```

```json
{
  "id": "1817677a-d472-4372-8e3d-e44c7c4037aa",
  "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "assignment_id": "836d5699-9053-438b-85ec-7f97d0ea4890",
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
  "arrived_at": "2026-10-29T09:47:22.640274Z",
  "started_at": "2026-10-29T09:47:22.923606Z",
  "completed_at": "2026-10-29T09:47:23.21633Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/4fbd96ad-ae21-4a6b-9828-a827b7ded88f` → **200**

```json
{
  "id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
  "short_number": 27,
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
    "id": "836d5699-9053-438b-85ec-7f97d0ea4890",
    "order_id": "4fbd96ad-ae21-4a6b-9828-a827b7ded88f",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "1817677a-d472-4372-8e3d-e44c7c4037aa",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:47:20.955767Z",
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
      "balance_minor": 42061,
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
  "session_id": "138371ec-d436-4833-a17e-390fef5fabdc",
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
  "last_heartbeat_at": "2026-10-29T09:47:19.254589Z",
  "last_location_at": "2026-10-29T09:47:19.254589Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/138371ec-d436-4833-a17e-390fef5fabdc/close` → **200**

```json
{
  "command_id": "a1198a11-ce13-48be-9907-748b3acf9292",
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
  "session_id": "6c7ef1c3-285e-442c-88fa-e8d6e22fe61e",
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
  "last_heartbeat_at": "2026-10-29T09:47:22.357453Z",
  "last_location_at": "2026-10-29T09:47:22.357453Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6c7ef1c3-285e-442c-88fa-e8d6e22fe61e/close` → **200**

```json
{
  "command_id": "47cff8b9-2cea-4afd-827e-b506dbf9dbe5",
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

Done: terminal order 4fbd96ad-ae21-4a6b-9828-a827b7ded88f by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-28170"
}
```

```json
{
  "challenge_id": "3bc5db54-7085-4854-937a-71aa7031e42b",
  "expires_at": "2026-10-29T09:52:28.209262237Z",
  "resend_available_at": "2026-10-29T09:47:29.209262237Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "000533",
  "sent_at": "2026-10-29T09:47:28.212926409Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bc5db54-7085-4854-937a-71aa7031e42b",
  "code": "000533",
  "device_ref": "sandbox-28170"
}
```

```json
{
  "session_id": "0b8cd604-5b9e-4e43-8996-82740448a02f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODE0OCwiaWF0IjoxNzkzMjY3MjQ4LCJqdGkiOiJhYjI5NzEwOC05ZmYyLTQ0ODEtYjI2NC01NjkwMTg5MzRjMjMiLCJzaWQiOiIwYjhjZDYwNC01YjllLTRlNDMtODk5Ni04Mjc0MDQ0OGEwMmYifQ.GrO0mkq0q-6Bx4l1XB-VrJ4rGdjER0_kahBTBPlbvQo",
  "access_expires_at": "2026-10-29T10:02:28.52334154Z",
  "refresh_token": "thdOtgoLc6P9RwFBKL3IDIefYkRtnm_9dI-x4NpzUd8",
  "refresh_expires_at": "2026-11-28T09:47:28.522727333Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "challenge_id": "f8106a29-913f-4a9b-a7f3-a8c74d3fab2e",
  "expires_at": "2026-10-29T09:52:29.080955616Z",
  "resend_available_at": "2026-10-29T09:47:30.080955616Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "107451",
  "sent_at": "2026-10-29T09:47:29.083909243Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8106a29-913f-4a9b-a7f3-a8c74d3fab2e",
  "code": "107451",
  "device_ref": "sandbox-22769"
}
```

```json
{
  "session_id": "e0a387c8-510d-4efb-95f9-b3496af53c93",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODE0OSwiaWF0IjoxNzkzMjY3MjQ5LCJqdGkiOiI0NzIwYWVmMi0zZDU0LTQ1MDctOWIzYy0xZjk4ZmE2MGUyZmEiLCJzaWQiOiJlMGEzODdjOC01MTBkLTRlZmItOTVmOS1iMzQ5NmFmNTNjOTMifQ.Mw8HX9b_0dst25ai9Jyi1xh9wSdf95wU5nRjGVbP_q4",
  "access_expires_at": "2026-10-29T10:02:29.39176324Z",
  "refresh_token": "wT3zRTzzdNkwifgS0Wy6wZMDDq0PHf4h-WTk9SqDQ20",
  "refresh_expires_at": "2026-11-28T09:47:29.391258557Z",
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

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-25293"
}
```

```json
{
  "challenge_id": "1c527bd6-b007-4fd4-9a12-d46f70ecf233",
  "expires_at": "2026-10-29T09:52:29.940070453Z",
  "resend_available_at": "2026-10-29T09:47:30.940070453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "843529",
  "sent_at": "2026-10-29T09:47:29.942429362Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1c527bd6-b007-4fd4-9a12-d46f70ecf233",
  "code": "843529",
  "device_ref": "sandbox-25293"
}
```

```json
{
  "session_id": "37459845-56c0-4659-a53b-0878e3014afd",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2ODE1MCwiaWF0IjoxNzkzMjY3MjUwLCJqdGkiOiIyZmIxOTZlMi1jODU1LTQ3NjgtOTFlNC1lNzU2ZmY3YzQyMTAiLCJzaWQiOiIzNzQ1OTg0NS01NmMwLTQ2NTktYTUzYi0wODc4ZTMwMTRhZmQifQ.YMkCnr6HRopb0SFig0GEZ7nwodtl5Pqrerm731QMGKk",
  "access_expires_at": "2026-10-29T10:02:30.230958933Z",
  "refresh_token": "mCavU1Wi6XyNUfabHpmDHS40n-eSIswjADWmnJh2TAw",
  "refresh_expires_at": "2026-11-28T09:47:30.23045576Z",
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
  "audience": "CLIENT",
  "phone": "+380695624358",
  "device_ref": "sandbox-3857"
}
```

```json
{
  "challenge_id": "1ad1c9f8-28c7-4bc9-a30d-9ef16a0bfe2b",
  "expires_at": "2026-10-29T09:52:30.776682138Z",
  "resend_available_at": "2026-10-29T09:47:31.776682138Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380695624358` → **200**

```json
{
  "phone": "+380695624358",
  "audience": "CLIENT",
  "code": "188383",
  "sent_at": "2026-10-29T09:47:30.779138387Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1ad1c9f8-28c7-4bc9-a30d-9ef16a0bfe2b",
  "code": "188383",
  "device_ref": "sandbox-3857"
}
```

```json
{
  "session_id": "642fb664-7f75-4d52-a4d1-0935b94b40d0",
  "subject": {
    "type": "CLIENT",
    "id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNWJlNzY3OC03ZjU4LTRiYTQtYWE1ZC1mYmZlMmU5MzQ3NjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY4MTUxLCJpYXQiOjE3OTMyNjcyNTEsImp0aSI6Ijc3YjQ5NGE0LWI1MzUtNDEyOC04MjA1LTA1ZTllNmE3MmQ0NyIsInNpZCI6IjY0MmZiNjY0LTdmNzUtNGQ1Mi1hNGQxLTA5MzViOTRiNDBkMCJ9.Z6FHVhq5vUBVsQESxGNw9IaoUOxPZbwqc0zutTy381k",
  "access_expires_at": "2026-10-29T10:02:31.080435392Z",
  "refresh_token": "Q5J9tOr9t-2jorgu046EG360ilbJ2T8S-odQ5DeJGHU",
  "refresh_expires_at": "2026-11-28T09:47:31.079955335Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "037b6c35-32a3-4fc3-b785-22b61a75e7aa",
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
  "id": "a2a8c213-32c5-4742-b937-d475d3715dd1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:52:31.365213Z",
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
  "command_id": "68ab342e-69d1-4c46-8cd0-1f96b758ee81",
  "quote_id": "a2a8c213-32c5-4742-b937-d475d3715dd1",
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
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

## All eight metrics are non-zero, with closed labels and no ids/phones
Metric validator: good scrape accepted; missing, unknown, id/phone, extra, zero and NaN rejected
{
  "blizz_orders_total": 28,
  "blizz_orders_cancelled_total": 14,
  "blizz_orders_unfulfilled_total": 1,
  "blizz_dispatch_first_offer_seconds_count": 18,
  "blizz_dispatch_assigned_seconds_count": 17,
  "blizz_offers_total": 20,
  "blizz_dispatch_excluded_total": 10,
  "blizz_sms_sent_total": 72
}

```prometheus
blizz_dispatch_assigned_seconds_count{application="blizz-taxi-server",source="OFFER"} 17
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 13.578725209
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.163937253
blizz_dispatch_first_offer_seconds_max{application="blizz-taxi-server"} 0.0
blizz_offers_total{application="blizz-taxi-server",outcome="ACCEPTED"} 17.0
blizz_offers_total{application="blizz-taxi-server",outcome="DECLINED"} 1.0
blizz_offers_total{application="blizz-taxi-server",outcome="REVOKED"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="false"} 20.0
blizz_orders_total{application="blizz-taxi-server",channel="APP",preorder="true"} 2.0
blizz_orders_total{application="blizz-taxi-server",channel="PHONE",preorder="false"} 6.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="DRIVER",reason="PASSENGER_ASKED"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="CHANGED_MIND"} 7.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="RIDER",reason="WAIT_TOO_LONG"} 1.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="NO_CARS"} 3.0
blizz_orders_cancelled_total{application="blizz-taxi-server",by="STAFF",reason="OTHER"} 2.0
blizz_orders_unfulfilled_total{application="blizz-taxi-server"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="CALLER",state="SENT"} 6.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="FAILED"} 1.0
blizz_sms_sent_total{application="blizz-taxi-server",purpose="OTP",state="SENT"} 65.0
```

Done: real no-car deadline, non-zero counters/timers and bounded labels on the management port.

`GET /api/rider/v1/orders/56828727-ecba-46b2-bb27-59cc4368d869` → **200**

```json
{
  "id": "56828727-ecba-46b2-bb27-59cc4368d869",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "15be7678-7f58-4ba4-aa5d-fbfe2e934769",
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
  "search_phase": "EXHAUSTED",
  "assignment": null,
  "created_at": "2026-10-29T09:47:31.663971Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793267564768E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79326755992E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79326755992E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793267559921E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793267559921E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
