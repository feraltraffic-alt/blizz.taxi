# Sandbox transcript (2026-10-29T09:29:43Z, 655ffc1)

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
  "correlation_id": "6d62667a-6e85-4a78-b55d-45b0e73fd6ba"
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
  "session_id": "4400cf53-334f-4456-a78c-810b0b4a0e07",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcwOTIsImlhdCI6MTc5MzI2NjE5MiwianRpIjoiYzM5YTIzODAtZDQ4Zi00ZDcyLWJiMWMtOTc1NjY5MzY5MGRmIiwic2lkIjoiNDQwMGNmNTMtMzM0Zi00NDU2LWE3OGMtODEwYjBiNGEwZTA3In0.90mTnGOo5h5wpws-AhAd76_XRxK6hsOxnvvP4XrJDLU",
  "access_expires_at": "2026-10-29T09:44:52.751461126Z",
  "refresh_token": "VjMopDcUHG30xwzAKH6kzhkFAbbyYc1Yg1n-7JwfXa4",
  "refresh_expires_at": "2026-10-29T21:29:52.749476014Z",
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
  "session_id": "327bffa0-f928-4e91-8202-42795613e619",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcwOTQsImlhdCI6MTc5MzI2NjE5NCwianRpIjoiZTg5NzExOGEtNDk0My00N2VhLTg3YTktNWUyNjJhZTliN2U4Iiwic2lkIjoiMzI3YmZmYTAtZjkyOC00ZTkxLTgyMDItNDI3OTU2MTNlNjE5In0.sAGgM8z2LxkaTZ1D6Mtc3x7HdCygXvmhq8iMF00cr3c",
  "access_expires_at": "2026-10-29T09:44:54.457775772Z",
  "refresh_token": "66UbNfS_L05HsFK8Z78dnoUybmJsv6nUm6gjlyYgB_I",
  "refresh_expires_at": "2026-10-29T21:29:54.456817931Z",
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
  "device_ref": "sandbox-28523"
}
```

```json
{
  "challenge_id": "21ed34cb-5535-4b25-a525-40ca43962a1c",
  "expires_at": "2026-10-29T09:34:55.065782386Z",
  "resend_available_at": "2026-10-29T09:29:56.065782386Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "896287",
  "sent_at": "2026-10-29T09:29:55.078197654Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "21ed34cb-5535-4b25-a525-40ca43962a1c",
  "code": "896287",
  "device_ref": "sandbox-28523"
}
```

```json
{
  "session_id": "6c997127-802c-4c2a-af18-8b68bcdf6a9c",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzA5NSwiaWF0IjoxNzkzMjY2MTk1LCJqdGkiOiI2YjBkZjc1Yi04Yjk4LTQ3ODQtYTc3OC1mYmNiY2RlMDM4OTEiLCJzaWQiOiI2Yzk5NzEyNy04MDJjLTRjMmEtYWYxOC04YjY4YmNkZjZhOWMifQ.JNUIxY0aQ8xazRkRMrcDtJaIP-7id2Lja5RJT-5NBGw",
  "access_expires_at": "2026-10-29T09:44:55.434273058Z",
  "refresh_token": "QOkfSL66d1WAwZabYS-6mJJsTO-P6VAIx5VNCLuk_YE",
  "refresh_expires_at": "2026-11-28T09:29:55.433356098Z",
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
  "command_id": "fdcef30e-b06c-44ed-8695-b05ab215a01c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:29:55Z",
    "sequence": 1793266196495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d542980d-44f0-42ce-bd27-6dd938d4e0b3",
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
  "last_heartbeat_at": "2026-10-29T09:29:56.169476Z",
  "last_location_at": "2026-10-29T09:29:56.169476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630182133",
  "device_ref": "sandbox-8952"
}
```

```json
{
  "challenge_id": "c40ab08f-b9a5-4ec8-ac5b-bb2a7b984fe7",
  "expires_at": "2026-10-29T09:34:56.459443997Z",
  "resend_available_at": "2026-10-29T09:29:57.459443997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630182133` → **200**

```json
{
  "phone": "+380630182133",
  "audience": "CLIENT",
  "code": "157942",
  "sent_at": "2026-10-29T09:29:56.464045137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c40ab08f-b9a5-4ec8-ac5b-bb2a7b984fe7",
  "code": "157942",
  "device_ref": "sandbox-8952"
}
```

```json
{
  "session_id": "09556e49-a025-4904-acb1-1018a8e36644",
  "subject": {
    "type": "CLIENT",
    "id": "66b4c767-3203-496b-b4bb-c8863f6be65a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2NmI0Yzc2Ny0zMjAzLTQ5NmItYjRiYi1jODg2M2Y2YmU2NWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MDk2LCJpYXQiOjE3OTMyNjYxOTYsImp0aSI6ImU3ODcxYmM1LTZlNTktNDRmNy1iMzg2LWZmMjYzYzc3Y2U4YiIsInNpZCI6IjA5NTU2ZTQ5LWEwMjUtNDkwNC1hY2IxLTEwMThhOGUzNjY0NCJ9.qg4eaLdFAlJryE70EnKe-vbex6O9xO8r8rciIzqKrI0",
  "access_expires_at": "2026-10-29T09:44:56.772807851Z",
  "refresh_token": "TjVmAls096ZUjbTjaq_rsTzAD5h3h6HdJr6t8cONfwM",
  "refresh_expires_at": "2026-11-28T09:29:56.77182118Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4768f49b-6867-4704-a40e-b5930b494478",
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
  "id": "dca094d1-5622-40bf-b898-61429eb78733",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:34:57.087412Z",
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
  "command_id": "13e6a94f-1040-4b0f-b38f-682f33818608",
  "quote_id": "dca094d1-5622-40bf-b898-61429eb78733",
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
  "id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "66b4c767-3203-496b-b4bb-c8863f6be65a",
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
  "created_at": "2026-10-29T09:29:57.452156Z",
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
    "id": "e8b149f0-92cd-41cb-a797-22263e9cf5e7",
    "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
    "expires_at": "2026-10-29T09:30:12.461866Z",
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

`POST /api/driver/v1/offers/e8b149f0-92cd-41cb-a797-22263e9cf5e7/accept` → **200**

```json
{
  "command_id": "fa7db607-ba2d-4660-80a6-ad2032ed3e7d"
}
```

```json
{
  "id": "7cd74d14-3827-46b6-b577-3cbce3ea58ca",
  "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2946c333-342a-4cbb-9bfd-e8fc0dc467ed",
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
  "command_id": "0d9efdbb-4bbd-4d18-8bf7-28a4343ac72a",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T09:29:58.671911581Z"
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
  "id": "2946c333-342a-4cbb-9bfd-e8fc0dc467ed",
  "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
  "assignment_id": "7cd74d14-3827-46b6-b577-3cbce3ea58ca",
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

`POST /api/driver/v1/work-sessions/d542980d-44f0-42ce-bd27-6dd938d4e0b3/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:29:59Z",
    "sequence": 1793266199538
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "d542980d-44f0-42ce-bd27-6dd938d4e0b3",
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
  "last_heartbeat_at": "2026-10-29T09:29:59.56538Z",
  "last_location_at": "2026-10-29T09:29:59.56538Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2946c333-342a-4cbb-9bfd-e8fc0dc467ed/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "a81d653c-28ad-4a3b-91fc-88bcbcb7e110",
  "expected_version": 0
}
```

```json
{
  "id": "2946c333-342a-4cbb-9bfd-e8fc0dc467ed",
  "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
  "assignment_id": "7cd74d14-3827-46b6-b577-3cbce3ea58ca",
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
  "arrived_at": "2026-10-29T09:29:59.865309Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2946c333-342a-4cbb-9bfd-e8fc0dc467ed/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9fc4724c-5182-40a8-8c43-3fd555687a23",
  "expected_version": 1
}
```

```json
{
  "id": "2946c333-342a-4cbb-9bfd-e8fc0dc467ed",
  "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
  "assignment_id": "7cd74d14-3827-46b6-b577-3cbce3ea58ca",
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
  "arrived_at": "2026-10-29T09:29:59.865309Z",
  "started_at": "2026-10-29T09:30:00.156561Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/2946c333-342a-4cbb-9bfd-e8fc0dc467ed/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "112d3790-0841-45df-9a7c-401e91f30d53",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:30:00Z",
  "cash_received": true
}
```

```json
{
  "id": "2946c333-342a-4cbb-9bfd-e8fc0dc467ed",
  "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
  "assignment_id": "7cd74d14-3827-46b6-b577-3cbce3ea58ca",
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
  "arrived_at": "2026-10-29T09:29:59.865309Z",
  "started_at": "2026-10-29T09:30:00.156561Z",
  "completed_at": "2026-10-29T09:30:00.485269Z",
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
  "session_id": "d542980d-44f0-42ce-bd27-6dd938d4e0b3",
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
  "last_heartbeat_at": "2026-10-29T09:29:59.56538Z",
  "last_location_at": "2026-10-29T09:29:59.56538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d542980d-44f0-42ce-bd27-6dd938d4e0b3/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9793a18f-bc00-4c7d-bb08-5042ea3951c6",
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
  "command_id": "ce055a08-b7a3-411d-88cb-325fd8faed61",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:01Z",
    "sequence": 1793266201368
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
  "correlation_id": "4c133334-f8ba-4d32-bf83-51178c5922f6",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "5450c03b-ce0d-4f4e-8a47-655cdaa37f2f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:01Z",
    "sequence": 1793266201668
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90ea8e07-9ecc-43d3-a557-606c5946f1cf",
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
  "last_heartbeat_at": "2026-10-29T09:30:01.691417Z",
  "last_location_at": "2026-10-29T09:30:01.691417Z",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T09:29:58.671912Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "2b99bd04-34ed-40dd-a60b-e8f0c1c11e41",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T09:30:02.262154028Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90ea8e07-9ecc-43d3-a557-606c5946f1cf",
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
  "last_heartbeat_at": "2026-10-29T09:30:01.691417Z",
  "last_location_at": "2026-10-29T09:30:01.691417Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90ea8e07-9ecc-43d3-a557-606c5946f1cf/close` → **200**

```json
{
  "command_id": "80ceed29-b61f-43ce-bd70-2330bd4b73b2",
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
  "session_id": "cff92536-cde1-48d9-ac9b-7c59ba600ca0",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxMDMsImlhdCI6MTc5MzI2NjIwMywianRpIjoiNWYzNmZhYTEtYjNjYi00MmYzLWJlOTEtMjc3YWQzYmM5ZDI4Iiwic2lkIjoiY2ZmOTI1MzYtY2RlMS00OGQ5LWFjOWItN2M1OWJhNjAwY2EwIn0.R7LA5MyxWbouHLQsdY9X_O-oidEMJjrTFLpnX-YVmWs",
  "access_expires_at": "2026-10-29T09:45:03.46434875Z",
  "refresh_token": "96hjdTV1b804oWa-Hkv3zO9VchEYT5649sSXpNLhuw4",
  "refresh_expires_at": "2026-10-29T21:30:03.463464015Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d8d78ce7-9ae3-4ae7-9868-67444a0638a5",
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
  "id": "7b1057b3-0a9a-4cc0-ac83-d2be6314a97e",
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
  "created_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "created_at": "2026-10-29T09:30:03.750101Z",
  "updated_at": "2026-10-29T09:30:03.750101Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633235750",
  "device_ref": "sandbox-3382"
}
```

```json
{
  "challenge_id": "cd2eb583-c6e8-4a17-9c88-547923efdef3",
  "expires_at": "2026-10-29T09:35:04.041831554Z",
  "resend_available_at": "2026-10-29T09:30:05.041831554Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633235750` → **200**

```json
{
  "phone": "+380633235750",
  "audience": "CLIENT",
  "code": "848440",
  "sent_at": "2026-10-29T09:30:04.046213906Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd2eb583-c6e8-4a17-9c88-547923efdef3",
  "code": "848440",
  "device_ref": "sandbox-3382"
}
```

```json
{
  "session_id": "2912462d-82bb-468e-ac9f-cf10f3fc4ba0",
  "subject": {
    "type": "CLIENT",
    "id": "d7489e11-01fa-476a-8bb4-4cfbd1b13e3e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzQ4OWUxMS0wMWZhLTQ3NmEtOGJiNC00Y2ZiZDFiMTNlM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTA0LCJpYXQiOjE3OTMyNjYyMDQsImp0aSI6IjUxNmU0NzA3LTNjYTAtNGFkMy04Mzg1LTQzNTkwZDc3Mzg1ZSIsInNpZCI6IjI5MTI0NjJkLTgyYmItNDY4ZS1hYzlmLWNmMTBmM2ZjNGJhMCJ9.88fJmLruXFhxLcI98aXwNK-El5-9-8q4k8VwU0Puv50",
  "access_expires_at": "2026-10-29T09:45:04.360727247Z",
  "refresh_token": "TCO4DYIDTjP-lJMxkZwHPXj3dQfajrtlc5vvvF3LfxU",
  "refresh_expires_at": "2026-11-28T09:30:04.359824226Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380633235750` → **200**

```json
{
  "client_id": "d7489e11-01fa-476a-8bb4-4cfbd1b13e3e"
}
```

`POST /api/admin/v1/rider-wallets/d7489e11-01fa-476a-8bb4-4cfbd1b13e3e/top-ups` → **201**

```json
{
  "command_id": "4a503f4a-4d4a-49c6-aaf8-9521aa1b8b02",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "d7489e11-01fa-476a-8bb4-4cfbd1b13e3e",
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
      "id": "43f353fb-b98f-43ed-8ed6-cbd6c1cd8a00",
      "at": "2026-10-29T09:30:04.929059Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d6d74541-fad9-487e-8fc5-b220236ebfa9",
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
  "id": "2f1ca83d-466d-4218-888d-355b2ad001fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:05.235360Z",
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
      "id": "7b1057b3-0a9a-4cc0-ac83-d2be6314a97e",
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
  "device_ref": "sandbox-7771"
}
```

```json
{
  "challenge_id": "bac8f236-5550-4b01-9255-0b1ebc09c512",
  "expires_at": "2026-10-29T09:35:05.534527549Z",
  "resend_available_at": "2026-10-29T09:30:06.534527549Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "643381",
  "sent_at": "2026-10-29T09:30:05.53851144Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bac8f236-5550-4b01-9255-0b1ebc09c512",
  "code": "643381",
  "device_ref": "sandbox-7771"
}
```

```json
{
  "session_id": "ce257320-8032-4db2-9cec-415953de8802",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzEwNSwiaWF0IjoxNzkzMjY2MjA1LCJqdGkiOiJiNTU4M2MzMC1iNmM5LTQwZGEtYWY5Yi0yNGVkZDZkMzMyZWQiLCJzaWQiOiJjZTI1NzMyMC04MDMyLTRkYjItOWNlYy00MTU5NTNkZTg4MDIifQ.2pBbp4C4NapW-iitmxE_kPRoB7PLzJlqsfFlbc3S-vk",
  "access_expires_at": "2026-10-29T09:45:05.845600691Z",
  "refresh_token": "Tmvdb7atBasn0RqhbgHuQEWFvnepKVk5S1QCsYjQoII",
  "refresh_expires_at": "2026-11-28T09:30:05.844767302Z",
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
  "command_id": "237694fa-f463-4798-b312-2faf3946a9b1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:06Z",
    "sequence": 1793266206389
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ddfbf51-33e2-4c08-aceb-e8483aa80d5c",
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
  "last_heartbeat_at": "2026-10-29T09:30:06.412121Z",
  "last_location_at": "2026-10-29T09:30:06.412121Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "afe34c7d-0a95-419d-9492-d0948d95d57c",
  "quote_id": "2f1ca83d-466d-4218-888d-355b2ad001fb",
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
  "id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d7489e11-01fa-476a-8bb4-4cfbd1b13e3e",
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
  "created_at": "2026-10-29T09:30:06.719874Z",
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
  "client_id": "d7489e11-01fa-476a-8bb4-4cfbd1b13e3e",
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
      "id": "43f353fb-b98f-43ed-8ed6-cbd6c1cd8a00",
      "at": "2026-10-29T09:30:04.929059Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
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
    "id": "6ceb9fc8-e458-474c-808d-a13bc21d1b5c",
    "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
    "expires_at": "2026-10-29T09:30:21.728834Z",
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

`POST /api/driver/v1/offers/6ceb9fc8-e458-474c-808d-a13bc21d1b5c/accept` → **200**

```json
{
  "command_id": "5dd3886e-d415-4de7-ab2a-790a866677a1"
}
```

```json
{
  "id": "92cccf3c-1900-4973-9fee-954bc09d51ed",
  "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0c1117ce-cd18-48be-a60d-be59537daf10",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0c1117ce-cd18-48be-a60d-be59537daf10",
  "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
  "assignment_id": "92cccf3c-1900-4973-9fee-954bc09d51ed",
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

`POST /api/driver/v1/work-sessions/2ddfbf51-33e2-4c08-aceb-e8483aa80d5c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:08Z",
    "sequence": 1793266208141
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ddfbf51-33e2-4c08-aceb-e8483aa80d5c",
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
  "last_heartbeat_at": "2026-10-29T09:30:08.163444Z",
  "last_location_at": "2026-10-29T09:30:08.163444Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0c1117ce-cd18-48be-a60d-be59537daf10/arrive` → **200**

```json
{
  "command_id": "2a074ab9-893e-431a-82ec-3dcad63b5e7d",
  "expected_version": 0
}
```

```json
{
  "id": "0c1117ce-cd18-48be-a60d-be59537daf10",
  "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
  "assignment_id": "92cccf3c-1900-4973-9fee-954bc09d51ed",
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
  "arrived_at": "2026-10-29T09:30:08.469233Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0c1117ce-cd18-48be-a60d-be59537daf10/start` → **200**

```json
{
  "command_id": "19937a3a-af27-4fc1-b960-a2ee8d10f263",
  "expected_version": 1
}
```

```json
{
  "id": "0c1117ce-cd18-48be-a60d-be59537daf10",
  "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
  "assignment_id": "92cccf3c-1900-4973-9fee-954bc09d51ed",
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
  "arrived_at": "2026-10-29T09:30:08.469233Z",
  "started_at": "2026-10-29T09:30:08.763968Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/0c1117ce-cd18-48be-a60d-be59537daf10/complete` → **200**

```json
{
  "command_id": "5ba83479-4591-418d-99d8-fc53c9d8f896",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:30:09Z",
  "cash_received": true
}
```

```json
{
  "id": "0c1117ce-cd18-48be-a60d-be59537daf10",
  "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
  "assignment_id": "92cccf3c-1900-4973-9fee-954bc09d51ed",
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
  "arrived_at": "2026-10-29T09:30:08.469233Z",
  "started_at": "2026-10-29T09:30:08.763968Z",
  "completed_at": "2026-10-29T09:30:09.071994Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "d7489e11-01fa-476a-8bb4-4cfbd1b13e3e",
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
      "id": "3144e460-b0ee-413f-a268-ae57fd12438a",
      "at": "2026-10-29T09:30:09.401752Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b"
    },
    {
      "id": "43f353fb-b98f-43ed-8ed6-cbd6c1cd8a00",
      "at": "2026-10-29T09:30:04.929059Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/7b1057b3-0a9a-4cc0-ac83-d2be6314a97e/archive` → **200**

```json
{
  "command_id": "af0f1473-eb6b-4d04-9303-c769bfa80b2b",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "7b1057b3-0a9a-4cc0-ac83-d2be6314a97e",
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
  "created_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "created_at": "2026-10-29T09:30:03.750101Z",
  "updated_at": "2026-10-29T09:30:12.669344Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2ddfbf51-33e2-4c08-aceb-e8483aa80d5c",
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
  "last_heartbeat_at": "2026-10-29T09:30:08.163444Z",
  "last_location_at": "2026-10-29T09:30:08.163444Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2ddfbf51-33e2-4c08-aceb-e8483aa80d5c/close` → **200**

```json
{
  "command_id": "70ddd497-447f-4031-8a7e-bfe38fd52af0",
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

Done: order c31f0d70-8b25-4cd1-8a10-ca635e48d06b.

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
  "session_id": "04533769-6f4b-46b6-af52-fdadea936655",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxMTMsImlhdCI6MTc5MzI2NjIxMywianRpIjoiZGU5OTY2MDUtMTU2OS00YWVjLWFhNmItNTgwM2Q5Y2FlYTI5Iiwic2lkIjoiMDQ1MzM3NjktNmY0Yi00NmI2LWFmNTItZmRhZGVhOTM2NjU1In0.wULlvDFrhrOI8sMBbUR6h_izV5L4MSG_TJps-VO78ik",
  "access_expires_at": "2026-10-29T09:45:13.890559775Z",
  "refresh_token": "k74Lj5Z1R8kdfnchPdv3oaS49GRMDabNqayBd5h23_s",
  "refresh_expires_at": "2026-10-29T21:30:13.889927594Z",
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
  "command_id": "878222a8-e3f4-4310-833f-6c418866f5b9",
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
  "session_id": "22a79d52-4185-4bfd-a8de-c7772a6d1bf4",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxMTUsImlhdCI6MTc5MzI2NjIxNSwianRpIjoiYzFiMDM4M2QtZWUxOC00ODY1LWFiYWYtMDdkYWMwMTQwMWM0Iiwic2lkIjoiMjJhNzlkNTItNDE4NS00YmZkLWE4ZGUtYzc3NzJhNmQxYmY0In0.DmbLYcR_II6LIlX2D8YPQHsYgHyP37Q9XGeIvJuoY6Y",
  "access_expires_at": "2026-10-29T09:45:15.07751875Z",
  "refresh_token": "7RJQO4lrBM-KB-Xbd-hh79wx0YT0O-Ob2xcQkhMb-1c",
  "refresh_expires_at": "2026-10-29T21:30:15.07680597Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2559425398",
    "linkedid": "1730052700.2559425398",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679508016"
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
    "id": "1730052700.2559425398",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "8d0024e0-fccc-4efa-a0d7-117fd4252ebc",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.347956Z",
      "answered_at": null,
      "ended_at": "2026-10-29T09:30:15.376018Z",
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
    "id": "1730052600.1453915627",
    "linkedid": "1730052600.1453915627",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380679508016"
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
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/ad50d306-bb8c-44dd-9a22-6a324d0d479d/answer` → **200**

```json
{
  "command_id": "6fa8d496-997e-4d3f-87d2-422abbcf2855"
}
```

```json
{
  "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380679508016",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "order_ids": [],
  "started_at": "2026-10-29T09:30:15.745505Z",
  "answered_at": "2026-10-29T09:30:16.073192Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1453915627",
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
    "id": "1730052600.1453915627",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": "2026-10-29T09:30:16.073192Z",
      "ended_at": "2026-10-29T09:30:16.392921Z",
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
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": "2026-10-29T09:30:16.073192Z",
      "ended_at": "2026-10-29T09:30:16.392921Z",
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
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": "2026-10-29T09:30:16.073192Z",
      "ended_at": "2026-10-29T09:30:16.392921Z",
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
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": "2026-10-29T09:30:16.073192Z",
      "ended_at": "2026-10-29T09:30:16.392921Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:30:22.097109Z"
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
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": "2026-10-29T09:30:16.073192Z",
      "ended_at": "2026-10-29T09:30:16.392921Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:30:22.097109Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/ad50d306-bb8c-44dd-9a22-6a324d0d479d/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/ad50d306-bb8c-44dd-9a22-6a324d0d479d/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=ad50d306-bb8c-44dd-9a22-6a324d0d479d` → **200**

```json
{
  "changes": [
    {
      "id": "f45e07b5-ddb6-4ce7-9275-f2d5390ff17f",
      "occurred_at": "2026-10-29T09:30:23.893507Z",
      "actor_type": "STAFF",
      "actor_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"eef03408-ab99-4661-88dd-974c5f6a4459\", \"order_ids\": []}",
      "correlation_id": "bd3ffdc7-ab7e-4a5f-92ab-109e73830657"
    },
    {
      "id": "158ec206-0ad7-474f-b36f-91e9c037ffbe",
      "occurred_at": "2026-10-29T09:30:23.858409Z",
      "actor_type": "STAFF",
      "actor_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"eef03408-ab99-4661-88dd-974c5f6a4459\", \"order_ids\": []}",
      "correlation_id": "c730f8dd-87a0-4c6e-af29-2f4541d3d6b7"
    }
  ]
}
```

Done: call ad50d306-bb8c-44dd-9a22-6a324d0d479d recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-25468"
}
```

```json
{
  "challenge_id": "19d3f022-8665-474e-861a-85c7c4186d3c",
  "expires_at": "2026-10-29T09:35:24.227897764Z",
  "resend_available_at": "2026-10-29T09:30:25.227897764Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "179291",
  "sent_at": "2026-10-29T09:30:24.232413161Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "19d3f022-8665-474e-861a-85c7c4186d3c",
  "code": "179291",
  "device_ref": "sandbox-25468"
}
```

```json
{
  "session_id": "03cb3880-60e4-4e72-8dd5-a9826c106dc3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzEyNCwiaWF0IjoxNzkzMjY2MjI0LCJqdGkiOiIxNzZlZjViYi00YjZmLTQzZjItYTI5OS00ZjhmMzcwNDA0MTgiLCJzaWQiOiIwM2NiMzg4MC02MGU0LTRlNzItOGRkNS1hOTgyNmMxMDZkYzMifQ.--9kFjqpitgbDZhHUzeC6DWFWld9aB84m9xtx57gOIU",
  "access_expires_at": "2026-10-29T09:45:24.536711524Z",
  "refresh_token": "O_c0nt4WSfEzVfigCmKAUGey3LoS8KIFNEurlF0E1JQ",
  "refresh_expires_at": "2026-11-28T09:30:24.535954618Z",
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
  "command_id": "2b282e53-ff02-4ec1-9a5f-cc1fcf153df7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:25Z",
    "sequence": 1793266225846
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4547e71-0582-4dcb-ada1-d90ce0cc11b3",
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
  "last_heartbeat_at": "2026-10-29T09:30:25.106101Z",
  "last_location_at": "2026-10-29T09:30:25.106101Z",
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
  "session_id": "20c734f3-dcff-4aa3-9065-3c21987676dd",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxMjUsImlhdCI6MTc5MzI2NjIyNSwianRpIjoiMzlmZTZmNGItNDI5NS00NGY4LWE3ZGYtNWY2YzM1NTc5ZjI0Iiwic2lkIjoiMjBjNzM0ZjMtZGNmZi00YWEzLTkwNjUtM2MyMTk4NzY3NmRkIn0.ooWkQMvUfRXbnoYoOTdVQKNliPUrpPDrmXA0vwP9d0s",
  "access_expires_at": "2026-10-29T09:45:25.724146686Z",
  "refresh_token": "bpn3hVFmut9ggXNGZWd1zujI7uQdJRjH9VHMazWTiSI",
  "refresh_expires_at": "2026-10-29T21:30:25.723590171Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "62a20006-59c8-46fb-a6fa-56eaa62507ec",
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
  "id": "9ac5e308-6df4-4f8b-ba98-4fa29320874b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:26.016993Z",
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
  "command_id": "cdaa480c-2033-4334-a7d8-e45a326995e8",
  "quote_id": "9ac5e308-6df4-4f8b-ba98-4fa29320874b",
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
    "phone": "+380675939300"
  }
}
```

```json
{
  "id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
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
  "created_at": "2026-10-29T09:30:26.343912Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675939300"
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
    "id": "c361e515-7488-4e2f-b7e6-ad67e715cda0",
    "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
    "expires_at": "2026-10-29T09:30:41.349485Z",
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

`POST /api/driver/v1/offers/c361e515-7488-4e2f-b7e6-ad67e715cda0/accept` → **200**

```json
{
  "command_id": "0317bd4c-dac9-4947-82e6-a3daa97fc7e7"
}
```

```json
{
  "id": "af934022-0300-40bc-8e24-c273b041985f",
  "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c0f72920-8eaf-480c-8e6f-9158c313b2eb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c0f72920-8eaf-480c-8e6f-9158c313b2eb",
  "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
  "assignment_id": "af934022-0300-40bc-8e24-c273b041985f",
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
    "phone": "+380675939300"
  }
}
```

`POST /api/driver/v1/work-sessions/b4547e71-0582-4dcb-ada1-d90ce0cc11b3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:29Z",
    "sequence": 1793266229628
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "b4547e71-0582-4dcb-ada1-d90ce0cc11b3",
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
  "last_heartbeat_at": "2026-10-29T09:30:29.649189Z",
  "last_location_at": "2026-10-29T09:30:29.649189Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c0f72920-8eaf-480c-8e6f-9158c313b2eb/arrive` → **200**

```json
{
  "command_id": "8be9eb8e-7048-462f-a922-23209bec7941",
  "expected_version": 0
}
```

```json
{
  "id": "c0f72920-8eaf-480c-8e6f-9158c313b2eb",
  "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
  "assignment_id": "af934022-0300-40bc-8e24-c273b041985f",
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
  "arrived_at": "2026-10-29T09:30:29.932543Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675939300"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  },
  {
    "phone": "+380675939300",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:31.318318252Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  },
  {
    "phone": "+380675939300",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:31.318318252Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675939300` → **200**

```json
[
  {
    "phone": "+380675939300",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:28.308700767Z"
  },
  {
    "phone": "+380675939300",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T09:30:31.318318252Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/c0f72920-8eaf-480c-8e6f-9158c313b2eb/start` → **200**

```json
{
  "command_id": "29c9d07a-0afa-466e-a3e4-533c6635c72c",
  "expected_version": 1
}
```

```json
{
  "id": "c0f72920-8eaf-480c-8e6f-9158c313b2eb",
  "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
  "assignment_id": "af934022-0300-40bc-8e24-c273b041985f",
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
  "arrived_at": "2026-10-29T09:30:29.932543Z",
  "started_at": "2026-10-29T09:30:32.367215Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675939300"
  }
}
```

`POST /api/driver/v1/trips/c0f72920-8eaf-480c-8e6f-9158c313b2eb/complete` → **200**

```json
{
  "command_id": "7bfa7098-822d-42c1-81a8-d3133db9f4af",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:30:32Z",
  "cash_received": true
}
```

```json
{
  "id": "c0f72920-8eaf-480c-8e6f-9158c313b2eb",
  "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
  "assignment_id": "af934022-0300-40bc-8e24-c273b041985f",
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
  "arrived_at": "2026-10-29T09:30:29.932543Z",
  "started_at": "2026-10-29T09:30:32.367215Z",
  "completed_at": "2026-10-29T09:30:32.693945Z",
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
  "session_id": "b4547e71-0582-4dcb-ada1-d90ce0cc11b3",
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
  "last_heartbeat_at": "2026-10-29T09:30:29.649189Z",
  "last_location_at": "2026-10-29T09:30:29.649189Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b4547e71-0582-4dcb-ada1-d90ce0cc11b3/close` → **200**

```json
{
  "command_id": "d3e68e5f-239d-4c94-9310-1c0857dd8ea3",
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
  "phone": "+380638333863",
  "device_ref": "sandbox-14473"
}
```

```json
{
  "challenge_id": "cd512256-d7e2-4ff0-a665-4c4b0a4d75d1",
  "expires_at": "2026-10-29T09:35:33.627155941Z",
  "resend_available_at": "2026-10-29T09:30:34.627155941Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638333863` → **200**

```json
{
  "phone": "+380638333863",
  "audience": "CLIENT",
  "code": "410087",
  "sent_at": "2026-10-29T09:30:33.630979782Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd512256-d7e2-4ff0-a665-4c4b0a4d75d1",
  "code": "410087",
  "device_ref": "sandbox-14473"
}
```

```json
{
  "session_id": "95854fae-e531-44f8-8168-19067d114f34",
  "subject": {
    "type": "CLIENT",
    "id": "b4f403d0-c55f-4689-b5f9-c85edd26db40"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNGY0MDNkMC1jNTVmLTQ2ODktYjVmOS1jODVlZGQyNmRiNDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTMzLCJpYXQiOjE3OTMyNjYyMzMsImp0aSI6ImE4OWQ2NGMwLTM4OWUtNDNlMi04ZDgzLTMyN2E1NGFkMDhlNSIsInNpZCI6Ijk1ODU0ZmFlLWU1MzEtNDRmOC04MTY4LTE5MDY3ZDExNGYzNCJ9.AvYlbinTBy2vvwwILxn-yyZJvIJYfPgITEXyy_cDr7g",
  "access_expires_at": "2026-10-29T09:45:33.943003919Z",
  "refresh_token": "d30u3314_SAk3N9fAJmWv92jsFaY7LraBZNgFoK2ku4",
  "refresh_expires_at": "2026-11-28T09:30:33.942382949Z",
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
  "device_ref": "sandbox-2854"
}
```

```json
{
  "challenge_id": "e54209da-08f4-40ae-bc2c-bb04d58e6495",
  "expires_at": "2026-10-29T09:35:34.5002796Z",
  "resend_available_at": "2026-10-29T09:30:35.5002796Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "785056",
  "sent_at": "2026-10-29T09:30:34.503890197Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e54209da-08f4-40ae-bc2c-bb04d58e6495",
  "code": "785056",
  "device_ref": "sandbox-2854"
}
```

```json
{
  "session_id": "5e1738de-5ea9-43a3-9174-3b1da4cee25a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzEzNCwiaWF0IjoxNzkzMjY2MjM0LCJqdGkiOiI3ZWY4NmU0Zi0xMTJkLTQzMjktYjgzZC1iMjJmNzlhZDNkYTUiLCJzaWQiOiI1ZTE3MzhkZS01ZWE5LTQzYTMtOTE3NC0zYjFkYTRjZWUyNWEifQ.MzxKpPZYezaB3rxmcWj4QoRoC1bqZTVADRhSEDoTRA8",
  "access_expires_at": "2026-10-29T09:45:34.834819531Z",
  "refresh_token": "xjRdY9quPfXzZkZaesw5rN20WLZqijEf6UWQCX7CKXU",
  "refresh_expires_at": "2026-11-28T09:30:34.834234404Z",
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
  "session_id": "cf77628c-24e4-462d-9a78-e0bb2b8b6ef1",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxMzUsImlhdCI6MTc5MzI2NjIzNSwianRpIjoiMzliMzIyMjctNTE0Ni00NWU3LWI0NzYtOTQ0NzNmYTMwOWZmIiwic2lkIjoiY2Y3NzYyOGMtMjRlNC00NjJkLTlhNzgtZTBiYjJiOGI2ZWYxIn0.pFqgFN6QnM66UZ9M0sH5S6QWAR1NAOAn2B8PlZ9Jrqs",
  "access_expires_at": "2026-10-29T09:45:35.713369919Z",
  "refresh_token": "fZAGTCmhvyx4YAi1eJG50jqo8uCNs223hq6TykrZeg0",
  "refresh_expires_at": "2026-10-29T21:30:35.712798662Z",
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
  "session_id": "96d8cb07-4a8a-4d91-9184-c39dd2f1d3c9",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxMzYsImlhdCI6MTc5MzI2NjIzNiwianRpIjoiNDVkYzM1YzItZGIwZS00OGZiLWFlMzEtM2ZhYWRkMWMyOWU1Iiwic2lkIjoiOTZkOGNiMDctNGE4YS00ZDkxLTkxODQtYzM5ZGQyZjFkM2M5In0.XLeoy5iQ0qiCSgNjfEmetz079KxqMlgPPSXur6CrL38",
  "access_expires_at": "2026-10-29T09:45:36.339413684Z",
  "refresh_token": "akt9BiiZtkhZoeMjyfMIW7XCh_48Q3bMxLii4YnWbKw",
  "refresh_expires_at": "2026-10-29T21:30:36.338780124Z",
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
      "code": "OPERATOR_ERROR",
      "labels": {
        "pl": "Błąd operatora",
        "uk": "Помилка оператора",
        "en": "Operator error",
        "ru": "Ошибка оператора"
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
  "command_id": "d2902842-557f-48f5-baf9-50428c067be0",
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
  "id": "acf516a8-5498-459d-a88c-9445b5da14ce",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:36.898700Z",
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
  "command_id": "d2f262f7-03e5-4e4c-8cc7-d6a0a785867e",
  "quote_id": "acf516a8-5498-459d-a88c-9445b5da14ce",
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
  "id": "f2ea31bd-77de-47e8-9c97-9c610d53ef29",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b4f403d0-c55f-4689-b5f9-c85edd26db40",
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
  "created_at": "2026-10-29T09:30:37.190058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f2ea31bd-77de-47e8-9c97-9c610d53ef29` → **200**

```json
{
  "id": "f2ea31bd-77de-47e8-9c97-9c610d53ef29",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b4f403d0-c55f-4689-b5f9-c85edd26db40",
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
  "created_at": "2026-10-29T09:30:37.190058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f2ea31bd-77de-47e8-9c97-9c610d53ef29/cancel` → **200**

```json
{
  "command_id": "2cb2e6a9-2bfe-4099-ae0d-9bf9e36eea52",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "f2ea31bd-77de-47e8-9c97-9c610d53ef29",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "b4f403d0-c55f-4689-b5f9-c85edd26db40",
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
  "created_at": "2026-10-29T09:30:37.190058Z",
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
  "command_id": "89b935a4-ddf8-4029-9bb6-d71510bab7e0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:38Z",
    "sequence": 1793266238360
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1a6aa21-bf70-4a92-a43f-209103f021d6",
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
  "last_heartbeat_at": "2026-10-29T09:30:38.381892Z",
  "last_location_at": "2026-10-29T09:30:38.381892Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-8885"
}
```

```json
{
  "challenge_id": "51832f7b-3741-4951-9684-d47b6f993101",
  "expires_at": "2026-10-29T09:35:38.662033734Z",
  "resend_available_at": "2026-10-29T09:30:39.662033734Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "797109",
  "sent_at": "2026-10-29T09:30:38.66572133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "51832f7b-3741-4951-9684-d47b6f993101",
  "code": "797109",
  "device_ref": "sandbox-8885"
}
```

```json
{
  "session_id": "f16761a5-2baa-42df-9847-921014cfa5ee",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzEzOCwiaWF0IjoxNzkzMjY2MjM4LCJqdGkiOiI5MTVmNjJlZi03YzczLTQ0ZmYtYTdjYS1lYjMyODQwY2EyZmMiLCJzaWQiOiJmMTY3NjFhNS0yYmFhLTQyZGYtOTg0Ny05MjEwMTRjZmE1ZWUifQ.NP0VSrmL9MdlAraW9SspTneaeZS9D5YUp6gtpnCIwSQ",
  "access_expires_at": "2026-10-29T09:45:38.963828065Z",
  "refresh_token": "v79R_JPzpF5AzJWdXcy2-9WlhltgdWajfHpWKYoiVBU",
  "refresh_expires_at": "2026-11-28T09:30:38.963117226Z",
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
  "command_id": "162e869b-6ce7-4708-b937-8d867c5bff49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:39Z",
    "sequence": 1793266239504
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:39.52591Z",
  "last_location_at": "2026-10-29T09:30:39.52591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2e5bcd2e-dcf0-4367-9382-42d44d4a1457",
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
  "id": "282e1e21-f072-47e8-af9e-f3d9a32bd719",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:39.810882Z",
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
  "command_id": "b825b763-cc83-4f0b-97c4-c3afe0458773",
  "quote_id": "282e1e21-f072-47e8-af9e-f3d9a32bd719",
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
  "id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "b4f403d0-c55f-4689-b5f9-c85edd26db40",
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
  "created_at": "2026-10-29T09:30:40.111512Z",
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
    "id": "df6f3885-66fe-4fb9-bb8d-5a11dcd10fde",
    "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
    "expires_at": "2026-10-29T09:30:55.115421Z",
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

`POST /api/driver/v1/offers/df6f3885-66fe-4fb9-bb8d-5a11dcd10fde/accept` → **200**

```json
{
  "command_id": "a58db2d6-faf8-4ba7-876b-d0aa63bfa57e"
}
```

```json
{
  "id": "8ee31b68-4264-49ac-9661-d77b4cf9762b",
  "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6efb2392-23c4-437f-9ba7-c979129763c2",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6efb2392-23c4-437f-9ba7-c979129763c2",
  "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "assignment_id": "8ee31b68-4264-49ac-9661-d77b4cf9762b",
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

`POST /api/driver/v1/trips/6efb2392-23c4-437f-9ba7-c979129763c2/cancel` → **200**

```json
{
  "command_id": "fd542b00-5dd0-4c4f-9fe2-d596a9749c8a",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "6efb2392-23c4-437f-9ba7-c979129763c2",
  "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "assignment_id": "8ee31b68-4264-49ac-9661-d77b4cf9762b",
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

`GET /api/rider/v1/orders/09b81ca4-8e50-4c94-bf8e-8ec0b807b403` → **200**

```json
{
  "id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "b4f403d0-c55f-4689-b5f9-c85edd26db40",
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
    "id": "8ee31b68-4264-49ac-9661-d77b4cf9762b",
    "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6efb2392-23c4-437f-9ba7-c979129763c2",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:30:40.111512Z",
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
    "id": "b764616e-eb85-4014-b5d6-d0862e3dbbbd",
    "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
    "expires_at": "2026-10-29T09:30:56.280153Z",
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

`POST /api/driver/v1/offers/b764616e-eb85-4014-b5d6-d0862e3dbbbd/accept` → **200**

```json
{
  "command_id": "68bd8dc2-860a-4b40-9e01-309a1c53fcb9"
}
```

```json
{
  "id": "4a9709b0-7db6-406f-91c5-526df7754422",
  "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1f7b2344-728d-45f9-9a2b-a8dbc4eb1054",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1f7b2344-728d-45f9-9a2b-a8dbc4eb1054",
  "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "assignment_id": "4a9709b0-7db6-406f-91c5-526df7754422",
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

`POST /api/driver/v1/trips/1f7b2344-728d-45f9-9a2b-a8dbc4eb1054/cancel` → **200**

```json
{
  "command_id": "f2d03a41-5c32-455a-9f05-06dabee28abb",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "1f7b2344-728d-45f9-9a2b-a8dbc4eb1054",
  "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
  "assignment_id": "4a9709b0-7db6-406f-91c5-526df7754422",
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
    "id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:30:40.111512Z",
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
    "id": "f2ea31bd-77de-47e8-9c97-9c610d53ef29",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:30:37.190058Z",
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

`GET /api/operator/v1/orders/09b81ca4-8e50-4c94-bf8e-8ec0b807b403/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:30:40.112241Z",
      "actor": {
        "type": "CLIENT",
        "id": "b4f403d0-c55f-4689-b5f9-c85edd26db40",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
        "quote_id": "282e1e21-f072-47e8-af9e-f3d9a32bd719",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "02ddafe4-3f22-479a-909d-8fb0de8690df"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:30:40.114493Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
        "attempt_id": "45d7d8a8-2e8e-4783-8f8c-ffafda632cfb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "02ddafe4-3f22-479a-909d-8fb0de8690df"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:30:40.121836Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "df6f3885-66fe-4fb9-bb8d-5a11dcd10fde",
        "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "02ddafe4-3f22-479a-909d-8fb0de8690df"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:30:40.691378Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "df6f3885-66fe-4fb9-bb8d-5a11dcd10fde",
        "order_id": "09b81ca4-8e50-4c94-bf8e-8ec0b807b403",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "8ee31b68-4264-49ac-9661-d77b4cf9762b"
      },
      "correlation_id": "2cd9a420-ba75-4b4b-aabe-bcc8412272ad"
```

Done: orders f2ea31bd-77de-47e8-9c97-9c610d53ef29, 09b81ca4-8e50-4c94-bf8e-8ec0b807b403.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733841591",
  "device_ref": "sandbox-22216"
}
```

```json
{
  "challenge_id": "b12872d7-5ef3-4df4-ad25-68eb65efce72",
  "expires_at": "2026-10-29T09:35:43.633726458Z",
  "resend_available_at": "2026-10-29T09:30:44.633726458Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733841591` → **200**

```json
{
  "phone": "+380733841591",
  "audience": "CLIENT",
  "code": "930295",
  "sent_at": "2026-10-29T09:30:43.637011479Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b12872d7-5ef3-4df4-ad25-68eb65efce72",
  "code": "930295",
  "device_ref": "sandbox-22216"
}
```

```json
{
  "session_id": "83992dc6-eefc-4a12-89de-56c6f1f901b1",
  "subject": {
    "type": "CLIENT",
    "id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyY2U2OTYzNS1hNmFiLTRhZjYtODVjZC1lMWQyNmQyMWQzMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTQzLCJpYXQiOjE3OTMyNjYyNDMsImp0aSI6IjhlYzU1Y2Q3LWY4ZGUtNGE3NS04NjJmLWIxZmY0Yjg5NWYzMyIsInNpZCI6IjgzOTkyZGM2LWVlZmMtNGExMi04OWRlLTU2YzZmMWY5MDFiMSJ9.gfQcl9sNazaiZtjVJJK_CuMkgGdX3pGoTUXcjtnJISQ",
  "access_expires_at": "2026-10-29T09:45:43.945379256Z",
  "refresh_token": "ZDyg2ZCcLsjK16dmPen1XQIuajYTa8-FGw5a9htY9FQ",
  "refresh_expires_at": "2026-11-28T09:30:43.944869539Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3bc1e7d3-daa0-4512-80b4-9d45f275f690",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2ddd0e09-ffcc-456a-8c69-193b26645cc8",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2ddd0e09-ffcc-456a-8c69-193b26645cc8",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "1ff605ca7552dcd1aae5e11621f53b4c",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2ddd0e09-ffcc-456a-8c69-193b26645cc8",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733841591"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2ddd0e09-ffcc-456a-8c69-193b26645cc8",
  "expires_at": "2026-10-29T10:00:44.230298Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2ddd0e09-ffcc-456a-8c69-193b26645cc8` → **200**

```json
{
  "id": "2ddd0e09-ffcc-456a-8c69-193b26645cc8",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:00:44.230298Z",
  "card": {
    "id": "5cefcb11-8573-463e-ad97-9417a1e29ed8",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2551",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:30:44.527364Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "5cefcb11-8573-463e-ad97-9417a1e29ed8",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****2551",
      "card_type": "Visa",
      "created_at": "2026-10-29T09:30:44.527364Z"
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
  "device_ref": "sandbox-6659"
}
```

```json
{
  "challenge_id": "a42af8da-32b1-408f-8ece-03da8be31d26",
  "expires_at": "2026-10-29T09:35:45.099967135Z",
  "resend_available_at": "2026-10-29T09:30:46.099967135Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "249163",
  "sent_at": "2026-10-29T09:30:45.103692455Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a42af8da-32b1-408f-8ece-03da8be31d26",
  "code": "249163",
  "device_ref": "sandbox-6659"
}
```

```json
{
  "session_id": "939e3adb-4613-4e9e-a604-6c6807eb2e44",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzE0NSwiaWF0IjoxNzkzMjY2MjQ1LCJqdGkiOiI1MDE1ZmFkOS04ZmY1LTQ1ODctYTA5OS0yNDk4NDQxNjkyODgiLCJzaWQiOiI5MzllM2FkYi00NjEzLTRlOWUtYTYwNC02YzY4MDdlYjJlNDQifQ.-Lon40T4EVuGPXhr28UmaSJw1L5c55v4ZY5DhIWCPKc",
  "access_expires_at": "2026-10-29T09:45:45.403054989Z",
  "refresh_token": "_hLH1Wl0eMvuiMMDIomtyicmnTnONnC7fBKLVAcm414",
  "refresh_expires_at": "2026-11-28T09:30:45.40247036Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:39.52591Z",
  "last_location_at": "2026-10-29T09:30:39.52591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/180bf880-4aac-4760-ae95-3a32441bbf8b/handover` → **200**

```json
{
  "command_id": "ca63d386-3e4d-4069-9efc-aa9505aa6f4c",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:39.52591Z",
  "last_location_at": "2026-10-29T09:30:39.52591Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/180bf880-4aac-4760-ae95-3a32441bbf8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:46Z",
    "sequence": 1793266246240
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:46.260769Z",
  "last_location_at": "2026-10-29T09:30:46.260769Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0100e6d0-4086-4249-ab72-348b8ceb76e6",
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
  "id": "3090607c-3bcc-4e42-98d4-96628364bfe7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:46.546720Z",
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
  "command_id": "d3ffdc61-665b-48d6-88dd-0e7707e2b9ae",
  "quote_id": "3090607c-3bcc-4e42-98d4-96628364bfe7",
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
  "id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
  "created_at": "2026-10-29T09:30:46.850148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0` → **200**

```json
{
  "id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
  "created_at": "2026-10-29T09:30:46.850148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0` → **200**

```json
{
  "id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
  "created_at": "2026-10-29T09:30:46.850148Z",
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
    "id": "92381fa2-e173-4c21-b1e8-c63eb132b5dc",
    "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
    "expires_at": "2026-10-29T09:31:02.627273Z",
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

`POST /api/driver/v1/offers/92381fa2-e173-4c21-b1e8-c63eb132b5dc/accept` → **200**

```json
{
  "command_id": "f3cac6e7-7fb7-44f2-9fd2-0cc064f778e9"
}
```

```json
{
  "id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0a1a097c-b037-4680-b247-72a6c9d649be",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0a1a097c-b037-4680-b247-72a6c9d649be",
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "assignment_id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
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

`POST /api/driver/v1/work-sessions/180bf880-4aac-4760-ae95-3a32441bbf8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:49Z",
    "sequence": 1793266249559
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:49.580758Z",
  "last_location_at": "2026-10-29T09:30:49.580758Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0a1a097c-b037-4680-b247-72a6c9d649be/arrive` → **200**

```json
{
  "command_id": "15c0dab0-97e9-4819-b8db-13f31dfb62e7",
  "expected_version": 0
}
```

```json
{
  "id": "0a1a097c-b037-4680-b247-72a6c9d649be",
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "assignment_id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
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
  "arrived_at": "2026-10-29T09:30:49.87075Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a1a097c-b037-4680-b247-72a6c9d649be/start` → **200**

```json
{
  "command_id": "7ec16e58-0c54-4d93-99f9-e6ceb3bdd9e5",
  "expected_version": 1
}
```

```json
{
  "id": "0a1a097c-b037-4680-b247-72a6c9d649be",
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "assignment_id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
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
  "arrived_at": "2026-10-29T09:30:49.87075Z",
  "started_at": "2026-10-29T09:30:50.161331Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0a1a097c-b037-4680-b247-72a6c9d649be/complete` → **200**

```json
{
  "command_id": "faf1479a-2591-4944-9c98-dc368b7fe098",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:30:50Z",
  "cash_received": true
}
```

```json
{
  "id": "0a1a097c-b037-4680-b247-72a6c9d649be",
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "assignment_id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
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
  "arrived_at": "2026-10-29T09:30:49.87075Z",
  "started_at": "2026-10-29T09:30:50.161331Z",
  "completed_at": "2026-10-29T09:30:50.455209Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0` → **200**

```json
{
  "id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
    "id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
    "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a1a097c-b037-4680-b247-72a6c9d649be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:30:46.850148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0` → **200**

```json
{
  "id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
    "id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
    "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a1a097c-b037-4680-b247-72a6c9d649be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:30:46.850148Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0` → **200**

```json
{
  "id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
    "id": "974de847-1d75-471e-bde5-aad0ea5e2b72",
    "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "0a1a097c-b037-4680-b247-72a6c9d649be",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:30:46.850148Z",
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

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0/tip` → **200**

```json
{
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
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
  "available_until": "2026-10-30T09:30:50.455209Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0/tip` → **201**

```json
{
  "command_id": "530c7194-b8da-4037-9e61-bc8e6384275d",
  "amount_minor": 2500
}
```

```json
{
  "id": "767aea9a-0e66-4c75-9831-8fbf6641bc82",
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T09:30:54.198829Z"
}
```

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0/tip` → **200**

```json
{
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
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
  "available_until": "2026-10-30T09:30:50.455209Z",
  "open": false,
  "tip": {
    "id": "767aea9a-0e66-4c75-9831-8fbf6641bc82",
    "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T09:30:54.198829Z"
  }
}
```

`GET /api/rider/v1/orders/c1874c09-d3e7-4ee1-8ef2-065f409cc2b0/tip` → **200**

```json
{
  "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
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
  "available_until": "2026-10-30T09:30:50.455209Z",
  "open": false,
  "tip": {
    "id": "767aea9a-0e66-4c75-9831-8fbf6641bc82",
    "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T09:30:54.198829Z"
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
      "id": "e3b368d9-43b1-40b4-8037-5e7e4663852a",
      "at": "2026-10-29T09:30:55.73611Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
      "counterpart_id": null
    },
    {
      "id": "dd48eb1b-cb81-4c98-ba86-f6998b6c6fb5",
      "at": "2026-10-29T09:30:50.683165Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "18fb39d3-dc3c-4458-a442-90dcaab0f4e5",
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
  "id": "b1dd3c06-9bb6-43cf-b0eb-3613761d431b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:35:56.354995Z",
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
  "session_id": "c32d14c5-0d9d-4c24-875f-eec3fb5075ed",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxNTYsImlhdCI6MTc5MzI2NjI1NiwianRpIjoiNWFjNGMyYjAtMzgzZS00MzFhLThiOGUtNWRlODM5MzM4M2M3Iiwic2lkIjoiYzMyZDE0YzUtMGQ5ZC00YzI0LTg3NWYtZWVjM2ZiNTA3NWVkIn0.7Sta2ypuPngOi0tm9MtHgVD1o3gv3hcUibwJw60E0II",
  "access_expires_at": "2026-10-29T09:45:56.99130321Z",
  "refresh_token": "OYoT1qWDqXHtUxiqC8e9Pb0vju_OJrLIoTijQstsWOc",
  "refresh_expires_at": "2026-10-29T21:30:56.990693382Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733841591` → **200**

```json
{
  "client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337"
}
```

`POST /api/admin/v1/rider-wallets/2ce69635-a6ab-4af6-85cd-e1d26d21d337/top-ups` → **201**

```json
{
  "command_id": "8350918a-bd97-4ec2-b69e-d46b548eeec3",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
      "id": "6bca5ef9-c61e-476d-8d9b-992d4eae4294",
      "at": "2026-10-29T09:30:57.537291Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "7663ab71-86ff-4f2a-aaf3-8c342cf718cd",
  "quote_id": "b1dd3c06-9bb6-43cf-b0eb-3613761d431b",
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
  "id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
  "created_at": "2026-10-29T09:30:57.841319Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5791977b-976d-4b71-b673-1ac69fa37eb0` → **200**

```json
{
  "id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
  "created_at": "2026-10-29T09:30:57.841319Z",
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
    "id": "31913f2f-dcfa-4a97-9218-7f581990e6e6",
    "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
    "expires_at": "2026-10-29T09:31:12.847025Z",
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

`POST /api/driver/v1/offers/31913f2f-dcfa-4a97-9218-7f581990e6e6/accept` → **200**

```json
{
  "command_id": "35117c67-3099-4127-ba83-830e8d2f23b8"
}
```

```json
{
  "id": "f07a6a63-7a72-42ab-a9e6-855968afeaa7",
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "93ae70a3-0533-46f4-a8cf-80ee2eb87eeb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "93ae70a3-0533-46f4-a8cf-80ee2eb87eeb",
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "assignment_id": "f07a6a63-7a72-42ab-a9e6-855968afeaa7",
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

`POST /api/driver/v1/work-sessions/180bf880-4aac-4760-ae95-3a32441bbf8b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:30:59Z",
    "sequence": 1793266259269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:59.289925Z",
  "last_location_at": "2026-10-29T09:30:59.289925Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/93ae70a3-0533-46f4-a8cf-80ee2eb87eeb/arrive` → **200**

```json
{
  "command_id": "70245233-268c-4677-92a5-929690a229ee",
  "expected_version": 0
}
```

```json
{
  "id": "93ae70a3-0533-46f4-a8cf-80ee2eb87eeb",
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "assignment_id": "f07a6a63-7a72-42ab-a9e6-855968afeaa7",
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
  "arrived_at": "2026-10-29T09:30:59.579589Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93ae70a3-0533-46f4-a8cf-80ee2eb87eeb/start` → **200**

```json
{
  "command_id": "38814b1d-da2d-449c-82d1-412cb369c050",
  "expected_version": 1
}
```

```json
{
  "id": "93ae70a3-0533-46f4-a8cf-80ee2eb87eeb",
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "assignment_id": "f07a6a63-7a72-42ab-a9e6-855968afeaa7",
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
  "arrived_at": "2026-10-29T09:30:59.579589Z",
  "started_at": "2026-10-29T09:30:59.873135Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/93ae70a3-0533-46f4-a8cf-80ee2eb87eeb/complete` → **200**

```json
{
  "command_id": "1a540577-cd32-4227-bd9c-47dd1ecd7b31",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:31:00Z",
  "cash_received": true
}
```

```json
{
  "id": "93ae70a3-0533-46f4-a8cf-80ee2eb87eeb",
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "assignment_id": "f07a6a63-7a72-42ab-a9e6-855968afeaa7",
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
  "arrived_at": "2026-10-29T09:30:59.579589Z",
  "started_at": "2026-10-29T09:30:59.873135Z",
  "completed_at": "2026-10-29T09:31:00.168794Z",
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
  "client_id": "2ce69635-a6ab-4af6-85cd-e1d26d21d337",
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
      "id": "6bca5ef9-c61e-476d-8d9b-992d4eae4294",
      "at": "2026-10-29T09:30:57.537291Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
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

`GET /api/rider/v1/orders/5791977b-976d-4b71-b673-1ac69fa37eb0/tip` → **200**

```json
{
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
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
  "available_until": "2026-10-30T09:31:00.168794Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5791977b-976d-4b71-b673-1ac69fa37eb0/tip` → **201**

```json
{
  "command_id": "89c6de05-971c-4149-9b92-52b5ef8ce826",
  "amount_minor": 2500
}
```

```json
{
  "id": "627acdcf-b688-4e0f-9f6c-863eedb79015",
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T09:31:01.330328Z"
}
```

`GET /api/rider/v1/orders/5791977b-976d-4b71-b673-1ac69fa37eb0/tip` → **200**

```json
{
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
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
  "available_until": "2026-10-30T09:31:00.168794Z",
  "open": false,
  "tip": {
    "id": "627acdcf-b688-4e0f-9f6c-863eedb79015",
    "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T09:31:01.330328Z"
  }
}
```

`GET /api/rider/v1/orders/5791977b-976d-4b71-b673-1ac69fa37eb0/tip` → **200**

```json
{
  "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
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
  "available_until": "2026-10-30T09:31:00.168794Z",
  "open": false,
  "tip": {
    "id": "627acdcf-b688-4e0f-9f6c-863eedb79015",
    "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T09:31:01.330328Z"
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
      "id": "c730f116-58bf-4299-b923-dfbaf40da78c",
      "at": "2026-10-29T09:31:02.795467Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
      "counterpart_id": null
    },
    {
      "id": "9d9cea98-3124-4b27-abcd-d2437aee3fa9",
      "at": "2026-10-29T09:31:00.771104Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5791977b-976d-4b71-b673-1ac69fa37eb0",
      "counterpart_id": null
    },
    {
      "id": "e3b368d9-43b1-40b4-8037-5e7e4663852a",
      "at": "2026-10-29T09:30:55.73611Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
      "counterpart_id": null
    },
    {
      "id": "dd48eb1b-cb81-4c98-ba86-f6998b6c6fb5",
      "at": "2026-10-29T09:30:50.683165Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c1874c09-d3e7-4ee1-8ef2-065f409cc2b0",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "180bf880-4aac-4760-ae95-3a32441bbf8b",
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
  "last_heartbeat_at": "2026-10-29T09:30:59.289925Z",
  "last_location_at": "2026-10-29T09:30:59.289925Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/180bf880-4aac-4760-ae95-3a32441bbf8b/close` → **200**

```json
{
  "command_id": "620e2d7b-47ad-497b-a44a-3f2382311f49",
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

Done: card order 5791977b-976d-4b71-b673-1ac69fa37eb0.

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
  "phone": "+380738744891",
  "device_ref": "sandbox-21990"
}
```

```json
{
  "challenge_id": "325d14de-64f4-42fc-9888-8b100ee50010",
  "expires_at": "2026-10-29T09:36:04.313323888Z",
  "resend_available_at": "2026-10-29T09:31:05.313323888Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738744891` → **200**

```json
{
  "phone": "+380738744891",
  "audience": "CLIENT",
  "code": "927428",
  "sent_at": "2026-10-29T09:31:04.31615601Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "325d14de-64f4-42fc-9888-8b100ee50010",
  "code": "927428",
  "device_ref": "sandbox-21990"
}
```

```json
{
  "session_id": "95e6740c-dd06-44c2-a25a-e4fc715289de",
  "subject": {
    "type": "CLIENT",
    "id": "5e63ba63-3651-47bb-8da7-43b603cf3e9a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZTYzYmE2My0zNjUxLTQ3YmItOGRhNy00M2I2MDNjZjNlOWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTY0LCJpYXQiOjE3OTMyNjYyNjQsImp0aSI6ImQxYTg5ZmI2LTUyM2ItNDczZS05MWM5LThlN2ExMjM0YmM0YyIsInNpZCI6Ijk1ZTY3NDBjLWRkMDYtNDRjMi1hMjVhLWU0ZmM3MTUyODlkZSJ9.7FRJBGkn6o9BFiQXRKEb6mi2ZNA-MhVZqnlfEGyVVFc",
  "access_expires_at": "2026-10-29T09:46:04.63034908Z",
  "refresh_token": "rjppl3JiNlgNT1K9oAQh0nkC7XILXMsiI1JTWCrkluk",
  "refresh_expires_at": "2026-11-28T09:31:04.629756638Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "8961ba0c-659f-40d6-888a-cccbb50185b6",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "2e0befbe-92ba-4f27-827e-7be60cb203a5",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-2e0befbe-92ba-4f27-827e-7be60cb203a5",
    "orderDate": "1793266264",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "614eb8ca80ad68da141c24358a5aff97",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=2e0befbe-92ba-4f27-827e-7be60cb203a5",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738744891"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=2e0befbe-92ba-4f27-827e-7be60cb203a5",
  "created_at": "2026-10-29T09:31:04.918171Z",
  "expires_at": "2026-10-29T10:01:04.918171Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/2e0befbe-92ba-4f27-827e-7be60cb203a5` → **200**

```json
{
  "id": "2e0befbe-92ba-4f27-827e-7be60cb203a5",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T09:31:04.918171Z",
  "expires_at": "2026-10-29T10:01:04.918171Z",
  "completed_at": "2026-10-29T09:31:05.211271Z",
  "masked_pan": "41****7891",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5e63ba63-3651-47bb-8da7-43b603cf3e9a",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "5e63ba63-3651-47bb-8da7-43b603cf3e9a",
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
      "id": "fc577184-25ce-40dd-92b1-198e6c250171",
      "at": "2026-10-29T09:31:05.808705Z",
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
  "client_id": "5e63ba63-3651-47bb-8da7-43b603cf3e9a",
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
      "id": "fc577184-25ce-40dd-92b1-198e6c250171",
      "at": "2026-10-29T09:31:05.808705Z",
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
  "device_ref": "sandbox-1794"
}
```

```json
{
  "challenge_id": "442156d1-1117-437c-95fb-72dab2f1b02f",
  "expires_at": "2026-10-29T09:36:07.354207017Z",
  "resend_available_at": "2026-10-29T09:31:08.354207017Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "117094",
  "sent_at": "2026-10-29T09:31:07.357447428Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "442156d1-1117-437c-95fb-72dab2f1b02f",
  "code": "117094",
  "device_ref": "sandbox-1794"
}
```

```json
{
  "session_id": "ea5c947d-6beb-45c2-bfa3-f728e8e9d542",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzE2NywiaWF0IjoxNzkzMjY2MjY3LCJqdGkiOiI5YjkwNWRmZi01ZDY0LTRhMDctOGY5Ny01OTgxNzc2NTZkZTgiLCJzaWQiOiJlYTVjOTQ3ZC02YmViLTQ1YzItYmZhMy1mNzI4ZThlOWQ1NDIifQ.j7OrZJR-vHwmlafQLaMPhwuVY1LkNMAE-QZXug6qm_g",
  "access_expires_at": "2026-10-29T09:46:07.663574795Z",
  "refresh_token": "uH9SjkZXOay5MgpXET9Z4mf4RsOa0pcNkpoOvwqJj08",
  "refresh_expires_at": "2026-11-28T09:31:07.66298626Z",
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
  "command_id": "4c0a0717-dffd-4978-a9cb-bf2a6436a557",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "f72b0fa8-fa44-4311-bd13-b444054d15fb",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-f72b0fa8-fa44-4311-bd13-b444054d15fb",
    "orderDate": "1793266268",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "bc2555a9e19c6ec3350aee46bc953495",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=f72b0fa8-fa44-4311-bd13-b444054d15fb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=f72b0fa8-fa44-4311-bd13-b444054d15fb",
  "created_at": "2026-10-29T09:31:08.220997Z",
  "expires_at": "2026-10-29T10:01:08.220997Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/f72b0fa8-fa44-4311-bd13-b444054d15fb` → **200**

```json
{
  "id": "f72b0fa8-fa44-4311-bd13-b444054d15fb",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T09:31:08.220997Z",
  "expires_at": "2026-10-29T10:01:08.220997Z",
  "completed_at": "2026-10-29T09:31:08.511053Z",
  "masked_pan": "41****2146",
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
      "id": "5bde205f-4284-45cc-8bba-c03f1ca37400",
      "at": "2026-10-29T09:31:08.816642Z",
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
  "command_id": "8bfae30c-71b7-4695-a606-769b1e05ae2c",
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
  "correlation_id": "047f6a57-ec84-4362-be87-b728a84de83c"
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
  "device_ref": "sandbox-27850"
}
```

```json
{
  "challenge_id": "2dcc3530-8dc5-4bab-ac02-007d245877e2",
  "expires_at": "2026-10-29T09:36:09.388930107Z",
  "resend_available_at": "2026-10-29T09:31:10.388930107Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "362963",
  "sent_at": "2026-10-29T09:31:09.392012445Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2dcc3530-8dc5-4bab-ac02-007d245877e2",
  "code": "362963",
  "device_ref": "sandbox-27850"
}
```

```json
{
  "session_id": "95391c3e-cd3a-4db2-b319-cc86359c821d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzE2OSwiaWF0IjoxNzkzMjY2MjY5LCJqdGkiOiJkY2JjOTcxOC1lMGZiLTRmZGQtYjU5Ni0zMzI3MGM1YTFjZGEiLCJzaWQiOiI5NTM5MWMzZS1jZDNhLTRkYjItYjMxOS1jYzg2MzU5YzgyMWQifQ.ExTCFj4S3gsFNt88kG0ozsw1-aXCWfHqKLSYwE76N9Q",
  "access_expires_at": "2026-10-29T09:46:09.701660981Z",
  "refresh_token": "xj1nattcLPZdL6DKjSKqUTgujdHi-1wiLE2O9x9Ib_E",
  "refresh_expires_at": "2026-11-28T09:31:09.701095179Z",
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
  "command_id": "9fe66927-b56f-49b0-82e9-caad4ad8ed5c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:31:10Z",
    "sequence": 1793266270255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83786fe3-66ac-4ff8-8994-45a87e5f8bae",
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
  "last_heartbeat_at": "2026-10-29T09:31:10.276208Z",
  "last_location_at": "2026-10-29T09:31:10.276208Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633946208",
  "device_ref": "sandbox-32253"
}
```

```json
{
  "challenge_id": "0e95ba30-2d84-4b18-8de6-93dc52c78733",
  "expires_at": "2026-10-29T09:36:10.56624702Z",
  "resend_available_at": "2026-10-29T09:31:11.56624702Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633946208` → **200**

```json
{
  "phone": "+380633946208",
  "audience": "CLIENT",
  "code": "687239",
  "sent_at": "2026-10-29T09:31:10.569630259Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0e95ba30-2d84-4b18-8de6-93dc52c78733",
  "code": "687239",
  "device_ref": "sandbox-32253"
}
```

```json
{
  "session_id": "51f79f2c-7132-4d55-9279-e6cefa9a23a8",
  "subject": {
    "type": "CLIENT",
    "id": "8da45152-9e49-4339-8721-aa5f2f32fc36"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGE0NTE1Mi05ZTQ5LTQzMzktODcyMS1hYTVmMmYzMmZjMzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTcwLCJpYXQiOjE3OTMyNjYyNzAsImp0aSI6Ijg4ZDFkOWYwLTY3NTItNDBjNS1hYzFiLWQ2MGM4ZWQzYTdiNSIsInNpZCI6IjUxZjc5ZjJjLTcxMzItNGQ1NS05Mjc5LWU2Y2VmYTlhMjNhOCJ9.zzE6L5CFUqGMAkgQH3CH_qmnJ-cQVCBG84ByQYkFtZI",
  "access_expires_at": "2026-10-29T09:46:10.873946633Z",
  "refresh_token": "u7C_8bIpof0u2uvnBaCkL8jnzMXkYo0KC1RBZ_DoBm8",
  "refresh_expires_at": "2026-11-28T09:31:10.87343284Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d88e262-516b-4243-bb79-aefd77f2403c",
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
  "id": "506e44b1-2b01-4c0c-bafa-2a631b7bbeed",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:11.152911Z",
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
  "command_id": "18e8a9a5-dab8-42ea-bbdf-79438794ae31",
  "quote_id": "506e44b1-2b01-4c0c-bafa-2a631b7bbeed",
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
  "id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8da45152-9e49-4339-8721-aa5f2f32fc36",
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
  "created_at": "2026-10-29T09:31:11.46013Z",
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
    "id": "ddf8f003-9fdd-43a5-b7ed-f10b4b848e79",
    "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
    "expires_at": "2026-10-29T09:31:26.463326Z",
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

`POST /api/driver/v1/offers/ddf8f003-9fdd-43a5-b7ed-f10b4b848e79/accept` → **200**

```json
{
  "command_id": "6e4f757a-f220-4cbe-b42d-8e1d6d80454a"
}
```

```json
{
  "id": "bc3c0fde-d769-4e32-9df8-2c78b6800bbd",
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d56cddd0-60ae-4388-b056-4e94e4d70e95",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d56cddd0-60ae-4388-b056-4e94e4d70e95",
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "assignment_id": "bc3c0fde-d769-4e32-9df8-2c78b6800bbd",
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

`POST /api/driver/v1/work-sessions/83786fe3-66ac-4ff8-8994-45a87e5f8bae/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:31:12Z",
    "sequence": 1793266272598
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83786fe3-66ac-4ff8-8994-45a87e5f8bae",
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
  "last_heartbeat_at": "2026-10-29T09:31:12.618991Z",
  "last_location_at": "2026-10-29T09:31:12.618991Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d56cddd0-60ae-4388-b056-4e94e4d70e95/arrive` → **200**

```json
{
  "command_id": "43ffaca5-3019-499b-a670-05754091b531",
  "expected_version": 0
}
```

```json
{
  "id": "d56cddd0-60ae-4388-b056-4e94e4d70e95",
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "assignment_id": "bc3c0fde-d769-4e32-9df8-2c78b6800bbd",
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
  "arrived_at": "2026-10-29T09:31:12.910541Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d56cddd0-60ae-4388-b056-4e94e4d70e95/start` → **200**

```json
{
  "command_id": "6b7c0579-8b01-4920-9b59-0cc63b03ab32",
  "expected_version": 1
}
```

```json
{
  "id": "d56cddd0-60ae-4388-b056-4e94e4d70e95",
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "assignment_id": "bc3c0fde-d769-4e32-9df8-2c78b6800bbd",
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
  "arrived_at": "2026-10-29T09:31:12.910541Z",
  "started_at": "2026-10-29T09:31:13.215159Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d56cddd0-60ae-4388-b056-4e94e4d70e95/complete` → **200**

```json
{
  "command_id": "4abc79f2-4bba-4f2c-a65e-fc45b4a30960",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:31:13Z",
  "cash_received": false
}
```

```json
{
  "id": "d56cddd0-60ae-4388-b056-4e94e4d70e95",
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "assignment_id": "bc3c0fde-d769-4e32-9df8-2c78b6800bbd",
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
  "arrived_at": "2026-10-29T09:31:12.910541Z",
  "started_at": "2026-10-29T09:31:13.215159Z",
  "completed_at": "2026-10-29T09:31:13.518953Z",
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
  "session_id": "49e42791-0b7e-4238-bf31-e0f8ddc2faa0",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxNzQsImlhdCI6MTc5MzI2NjI3NCwianRpIjoiZWRlYzA5MzctZTQ2MS00YTZiLTk0YjQtZmU5YWEyMGQxM2E5Iiwic2lkIjoiNDllNDI3OTEtMGI3ZS00MjM4LWJmMzEtZTBmOGRkYzJmYWEwIn0.JFtrsukkumL6kNlDD-vdL5d8dMcFXpExRcDQSvEdDiU",
  "access_expires_at": "2026-10-29T09:46:14.146559958Z",
  "refresh_token": "F2WLC659EN7TeGIBd6l9B3AYIuZCqY_hd904YdKbGws",
  "refresh_expires_at": "2026-10-29T21:31:14.145994157Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/e4945fb2-aec8-40b2-91b4-9ee8feaefac0/cash-dispute` → **200**

```json
{
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8da45152-9e49-4339-8721-aa5f2f32fc36",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T09:31:13.863377Z",
  "decide_by": "2026-11-12T09:31:13.863377Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T09:31:13.863377Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "8da45152-9e49-4339-8721-aa5f2f32fc36",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T09:31:13.863377Z",
      "decide_by": "2026-11-12T09:31:13.863377Z",
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

`POST /api/admin/v1/orders/e4945fb2-aec8-40b2-91b4-9ee8feaefac0/cash-dispute/decide` → **400**

```json
{
  "command_id": "36aeda28-5526-49ca-8519-8e2df58277a5",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/e4945fb2-aec8-40b2-91b4-9ee8feaefac0/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "dfefff20-78c4-4106-89ce-cc3cd82f839d",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/e4945fb2-aec8-40b2-91b4-9ee8feaefac0/cash-dispute/decide` → **200**

```json
{
  "command_id": "5913a6a6-f0e8-4248-ada4-3b8c04d23923",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "8da45152-9e49-4339-8721-aa5f2f32fc36",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T09:31:13.863377Z",
  "decide_by": "2026-11-12T09:31:13.863377Z",
  "decision": "PAY_DRIVER",
  "decided_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T09:31:15.31683Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/e4945fb2-aec8-40b2-91b4-9ee8feaefac0/cash-dispute/decide` → **409**

```json
{
  "command_id": "10f78247-07ce-4791-bb00-874d3b1e392c",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/e4945fb2-aec8-40b2-91b4-9ee8feaefac0/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "69c4d3b9-95d0-4d16-a8a7-74b80caf129d"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "83786fe3-66ac-4ff8-8994-45a87e5f8bae",
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
  "last_heartbeat_at": "2026-10-29T09:31:12.618991Z",
  "last_location_at": "2026-10-29T09:31:12.618991Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/83786fe3-66ac-4ff8-8994-45a87e5f8bae/close` → **200**

```json
{
  "command_id": "f9d385a4-e7f5-40b9-b995-4f534a9d346b",
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
  "phone": "+380735649304",
  "device_ref": "sandbox-26168"
}
```

```json
{
  "challenge_id": "9047b77d-1261-43a6-81e7-cbe9ccf992db",
  "expires_at": "2026-10-29T09:36:16.460688432Z",
  "resend_available_at": "2026-10-29T09:31:17.460688432Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735649304` → **200**

```json
{
  "phone": "+380735649304",
  "audience": "CLIENT",
  "code": "382674",
  "sent_at": "2026-10-29T09:31:16.463398916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9047b77d-1261-43a6-81e7-cbe9ccf992db",
  "code": "382674",
  "device_ref": "sandbox-26168"
}
```

```json
{
  "session_id": "da8c5801-1d59-4ae0-bf38-0768a67d66f4",
  "subject": {
    "type": "CLIENT",
    "id": "03408df1-e23e-478a-bd70-4ab16c119a0c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMzQwOGRmMS1lMjNlLTQ3OGEtYmQ3MC00YWIxNmMxMTlhMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTc2LCJpYXQiOjE3OTMyNjYyNzYsImp0aSI6ImM1NjRmMmU1LTI3N2QtNDI1Yy1hOGEzLWFlNWQwODQyZmYwMiIsInNpZCI6ImRhOGM1ODAxLTFkNTktNGFlMC1iZjM4LTA3NjhhNjdkNjZmNCJ9.rcWkqn6JWizHd9IpjouxB_G8b2D456NcDnZzMeLkAvc",
  "access_expires_at": "2026-10-29T09:46:16.786951741Z",
  "refresh_token": "GCSL5oBSmRVnOnjOxKHydPCzgO4329lovgbg0vWKBCw",
  "refresh_expires_at": "2026-11-28T09:31:16.786454955Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "c1d3b43a-adcd-45f9-a5f5-d345de80418f",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "c42b86cf-45b9-4721-a82f-ed3519bbf079",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-c42b86cf-45b9-4721-a82f-ed3519bbf079",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a85b3a2ca89e8a7b91f1e0084476ea50",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=c42b86cf-45b9-4721-a82f-ed3519bbf079",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735649304"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=c42b86cf-45b9-4721-a82f-ed3519bbf079",
  "expires_at": "2026-10-29T10:01:17.063288Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/c42b86cf-45b9-4721-a82f-ed3519bbf079` → **200**

```json
{
  "id": "c42b86cf-45b9-4721-a82f-ed3519bbf079",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:01:17.063288Z",
  "card": {
    "id": "3c0958bc-8164-421b-bf57-a0012c075e84",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****3619",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:31:17.352099Z"
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
  "device_ref": "sandbox-14110"
}
```

```json
{
  "challenge_id": "7dfba42b-691f-43a2-9e0a-f046f31752a3",
  "expires_at": "2026-10-29T09:36:17.651095286Z",
  "resend_available_at": "2026-10-29T09:31:18.651095286Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "733611",
  "sent_at": "2026-10-29T09:31:17.653801317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7dfba42b-691f-43a2-9e0a-f046f31752a3",
  "code": "733611",
  "device_ref": "sandbox-14110"
}
```

```json
{
  "session_id": "817a08e7-1cb7-4eca-922a-8392aaa91121",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzE3NywiaWF0IjoxNzkzMjY2Mjc3LCJqdGkiOiI3MzA5MDM3Ni04M2YwLTRhNmYtYmYwMy0wMWQ4M2IzYjBjNWYiLCJzaWQiOiI4MTdhMDhlNy0xY2I3LTRlY2EtOTIyYS04MzkyYWFhOTExMjEifQ.DMb5WPueginS_RHi6Z19gbONU0zVM3u7jrqILUMx8sQ",
  "access_expires_at": "2026-10-29T09:46:17.983400858Z",
  "refresh_token": "45N1zMRFGNrfa47VsCIEiEqFOKHjA1ktqVYaz2AA2pM",
  "refresh_expires_at": "2026-11-28T09:31:17.982864704Z",
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
  "command_id": "de6c5071-e0b3-4b03-8122-b0a34d4e7fd4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:31:18Z",
    "sequence": 1793266278537
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d5cacce-07e8-4b16-8e71-37158ad8c5dc",
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
  "last_heartbeat_at": "2026-10-29T09:31:18.557776Z",
  "last_location_at": "2026-10-29T09:31:18.557776Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ae64d10e-06dc-4ad9-a121-90c3a7bbf900",
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
  "id": "f87b4a7f-4aec-4486-89eb-30af29faac79",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:18.836880Z",
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
  "command_id": "82ab071a-4d11-4966-8224-22693054e04d",
  "quote_id": "f87b4a7f-4aec-4486-89eb-30af29faac79",
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
  "id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "03408df1-e23e-478a-bd70-4ab16c119a0c",
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
  "created_at": "2026-10-29T09:31:19.128387Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195` → **200**

```json
{
  "id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "03408df1-e23e-478a-bd70-4ab16c119a0c",
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
  "created_at": "2026-10-29T09:31:19.128387Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195` → **200**

```json
{
  "id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "03408df1-e23e-478a-bd70-4ab16c119a0c",
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
  "created_at": "2026-10-29T09:31:19.128387Z",
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
    "id": "7c62e8bd-7a1f-48bc-9856-1f0a00fb2aa3",
    "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
    "expires_at": "2026-10-29T09:31:34.898015Z",
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

`POST /api/driver/v1/offers/7c62e8bd-7a1f-48bc-9856-1f0a00fb2aa3/accept` → **200**

```json
{
  "command_id": "95a65a84-da4b-4a77-8886-9fff2318897f"
}
```

```json
{
  "id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "e015d173-e21f-4baa-8da3-98b2798a083f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "e015d173-e21f-4baa-8da3-98b2798a083f",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "assignment_id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
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

`POST /api/rider/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195/messages` → **201**

```json
{
  "command_id": "3b4cac54-0b5d-4f8f-97ff-8b3178fbd5e1",
  "body": "Я біля входу, мій номер +380735649304, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "2e6e8155-1c59-4e0e-9d13-71efd40a63dd",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380735649304, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T09:31:21.866331977Z"
}
```

`POST /api/driver/v1/trips/e015d173-e21f-4baa-8da3-98b2798a083f/messages` → **201**

```json
{
  "command_id": "3d58edd7-8b42-449d-9c7f-97ef682e336e",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "7e825af1-8b7b-41e0-a3a9-fb5fc3a7ca6d",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T09:31:22.162699857Z"
}
```

`POST /api/driver/v1/work-sessions/3d5cacce-07e8-4b16-8e71-37158ad8c5dc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:31:22Z",
    "sequence": 1793266282441
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d5cacce-07e8-4b16-8e71-37158ad8c5dc",
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
  "last_heartbeat_at": "2026-10-29T09:31:22.461597Z",
  "last_location_at": "2026-10-29T09:31:22.461597Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/e015d173-e21f-4baa-8da3-98b2798a083f/arrive` → **200**

```json
{
  "command_id": "72bb8980-a007-4a5e-9544-febbbf443ca4",
  "expected_version": 0
}
```

```json
{
  "id": "e015d173-e21f-4baa-8da3-98b2798a083f",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "assignment_id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
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
  "arrived_at": "2026-10-29T09:31:22.751017Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/e015d173-e21f-4baa-8da3-98b2798a083f/start` → **200**

```json
{
  "command_id": "88709e7d-518e-4aac-9708-0b407c0d1004",
  "expected_version": 1
}
```

```json
{
  "id": "e015d173-e21f-4baa-8da3-98b2798a083f",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "assignment_id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
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
  "arrived_at": "2026-10-29T09:31:22.751017Z",
  "started_at": "2026-10-29T09:31:23.051831Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/3d5cacce-07e8-4b16-8e71-37158ad8c5dc/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:31:23Z",
    "sequence": 1793266283331
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "3d5cacce-07e8-4b16-8e71-37158ad8c5dc",
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
  "last_heartbeat_at": "2026-10-29T09:31:23.351427Z",
  "last_location_at": "2026-10-29T09:31:23.351427Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/e015d173-e21f-4baa-8da3-98b2798a083f/complete` → **200**

```json
{
  "command_id": "f91fbcb2-2ad0-4768-9da9-a1ff3b3abb20",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:31:23Z",
  "cash_received": false
}
```

```json
{
  "id": "e015d173-e21f-4baa-8da3-98b2798a083f",
  "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "assignment_id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
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
  "arrived_at": "2026-10-29T09:31:22.751017Z",
  "started_at": "2026-10-29T09:31:23.051831Z",
  "completed_at": "2026-10-29T09:31:23.644665Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195` → **200**

```json
{
  "id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "03408df1-e23e-478a-bd70-4ab16c119a0c",
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
    "id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
    "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e015d173-e21f-4baa-8da3-98b2798a083f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:31:19.128387Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195` → **200**

```json
{
  "id": "de4314f5-621e-4ef4-8415-3ea832eab195",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "03408df1-e23e-478a-bd70-4ab16c119a0c",
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
    "id": "f9332713-ef96-4bf9-9b69-6e9290b0edf0",
    "order_id": "de4314f5-621e-4ef4-8415-3ea832eab195",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "e015d173-e21f-4baa-8da3-98b2798a083f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:31:19.128387Z",
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
  "session_id": "3d5cacce-07e8-4b16-8e71-37158ad8c5dc",
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
  "last_heartbeat_at": "2026-10-29T09:31:23.351427Z",
  "last_location_at": "2026-10-29T09:31:23.351427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3d5cacce-07e8-4b16-8e71-37158ad8c5dc/close` → **200**

```json
{
  "command_id": "b5418571-859e-4d6f-b51b-4e6f4b598dfa",
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
  "session_id": "2c1d8bfa-86dc-449e-a7e8-af08891e0ec9",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxODYsImlhdCI6MTc5MzI2NjI4NiwianRpIjoiODQwNWNkMDktODM2OC00ZDU0LTkwNzItNGRkZDc0ZDdhZjE5Iiwic2lkIjoiMmMxZDhiZmEtODZkYy00NDllLWE3ZTgtYWYwODg5MWUwZWM5In0.oquLVOTv85luM3G3xxToO1HliRZzL_T94en0vi-P3sQ",
  "access_expires_at": "2026-10-29T09:46:26.413141305Z",
  "refresh_token": "cGhUMrxIFyWs3jwV_lGSjFitatJBczY969fns93FJDY",
  "refresh_expires_at": "2026-10-29T21:31:26.412633351Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b08f3b7f-c0f0-4b4f-a3ea-b20a08e8cad5"
}
```

`GET /api/admin/v1/orders/de4314f5-621e-4ef4-8415-3ea832eab195/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T09:31:26.984910688Z",
  "order": {
    "id": "de4314f5-621e-4ef4-8415-3ea832eab195",
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
    "created_at": "2026-10-29T09:31:19.128387Z",
    "assigned_at": "2026-10-29T09:31:21.277088Z",
    "arrived_at": "2026-10-29T09:31:22.751017Z",
    "started_at": "2026-10-29T09:31:23.051831Z",
    "completed_at": "2026-10-29T09:31:23.644665Z"
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
    "id": "03408df1-e23e-478a-bd70-4ab16c119a0c",
    "registered_at": "2026-10-29T09:31:16.784675Z",
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
      "created_at": "2026-10-29T09:31:19.130838Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T09:31:23.953864Z"
    }
  ],
  "chat": [
    {
```

Done: the evidence of card order de4314f5-621e-4ef4-8415-3ea832eab195, without phone or card digits.

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
  "session_id": "b4802814-939c-4296-beaa-26fd6116d4e5",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxODcsImlhdCI6MTc5MzI2NjI4NywianRpIjoiZDgyNmQ1MDItYjNkYy00OTgwLWJjNTUtODQ3OGEzOWYxMjRmIiwic2lkIjoiYjQ4MDI4MTQtOTM5Yy00Mjk2LWJlYWEtMjZmZDYxMTZkNGU1In0.RmpejTClwDWtjQiOIPfribMifjvIPXW3o20vo8dt8ak",
  "access_expires_at": "2026-10-29T09:46:27.926164852Z",
  "refresh_token": "hHIIQeodetuO3IAu2qNkq0XJA343Kl8G3tr4KA3nOt4",
  "refresh_expires_at": "2026-10-29T21:31:27.925640854Z",
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
  "phone": "+48600244195",
  "device_ref": "sandbox-22059"
}
```

```json
{
  "challenge_id": "461acc96-8ec8-4930-aca7-0ab4867e7af6",
  "expires_at": "2026-10-29T09:36:28.762688505Z",
  "resend_available_at": "2026-10-29T09:31:29.762688505Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600244195` → **200**

```json
{
  "phone": "+48600244195",
  "audience": "CLIENT",
  "code": "986727",
  "sent_at": "2026-10-29T09:31:28.765215665Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "461acc96-8ec8-4930-aca7-0ab4867e7af6",
  "code": "986727",
  "device_ref": "sandbox-22059"
}
```

```json
{
  "session_id": "d6183b13-82da-4749-a897-7a7138122c27",
  "subject": {
    "type": "CLIENT",
    "id": "5db5fd05-8202-4d5a-af0a-272ba07c6500"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ZGI1ZmQwNS04MjAyLTRkNWEtYWYwYS0yNzJiYTA3YzY1MDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTg5LCJpYXQiOjE3OTMyNjYyODksImp0aSI6ImViZTBjNzE2LWQ3OTgtNDYxZC1iMGZmLTRiMWM5NWFmYTkzZSIsInNpZCI6ImQ2MTgzYjEzLTgyZGEtNDc0OS1hODk3LTdhNzEzODEyMmMyNyJ9.xHTOLYlTdOn1vmO1PDpI7hXbltyIrwEoTwPw23Xkuk8",
  "access_expires_at": "2026-10-29T09:46:29.076547932Z",
  "refresh_token": "KRN-6cZhekR3miMMn2aps6hagjtvP7nSI9ijSGYSjcQ",
  "refresh_expires_at": "2026-11-28T09:31:29.076006077Z",
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
  "command_id": "e8eea190-6f06-4ba0-a844-9aa5038b6909",
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
  "correlation_id": "f4d62baf-3504-408d-aed1-08afd5f1fe36",
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
  "command_id": "46e020db-bac2-4bb8-99d0-ac4a514d0028",
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
  "paused_at": "2026-10-29T09:31:30.210597721Z",
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
  "command_id": "524a9072-831c-4f02-96a4-d8f17ac3f40c",
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
  "id": "511f16a5-a83f-4176-8553-a307ce86d0a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:30.790250Z",
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
  "command_id": "5710da5b-6150-4556-98aa-68a042835ad7",
  "quote_id": "511f16a5-a83f-4176-8553-a307ce86d0a0",
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
  "correlation_id": "db3bdf41-c7c1-405a-9947-7068e5597bf6"
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
  "paused_at": "2026-10-29T09:31:30.210598Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "1d7f31d8-d759-404b-9e5f-a3c067b62c0d",
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
  "command_id": "4e66ce60-6ad2-4406-976f-a9c7e313e242",
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
  "command_id": "4c584232-385e-45d6-8d6e-a0da1bb6f339",
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
  "id": "408e6eac-4b9c-48d0-a6bf-ed5ba7ee6f4b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:32.535401Z",
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
  "command_id": "5b137560-f66e-4d99-92b7-189a8be42f2a",
  "quote_id": "408e6eac-4b9c-48d0-a6bf-ed5ba7ee6f4b",
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
  "correlation_id": "2b23bff8-a22f-496c-981f-d9250ebd3568"
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
  "command_id": "515a940e-3447-4cb2-bff5-4d20f56b437e",
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
  "command_id": "9f857a85-418b-4307-baf0-7dedfaf58c94",
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
  "id": "03c4eba4-171a-4904-976d-1858676c5e29",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:33.687772Z",
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
  "command_id": "a7f7d5b0-c333-4984-b10f-854dd17a5464",
  "quote_id": "03c4eba4-171a-4904-976d-1858676c5e29",
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
  "correlation_id": "b4a39503-4f5e-468b-86f5-817c5331c661"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "fb399630-b9ac-4d74-959f-e0a8243bdd2a",
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
  "correlation_id": "2b3fcc7f-630d-4d02-ae87-01c962a995cd"
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
  "command_id": "b68bd273-8ed9-4118-b951-fd6b02fa5ffa",
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
  "phone": "+380673930205",
  "device_ref": "sandbox-31629"
}
```

```json
{
  "challenge_id": "78c45365-7548-4645-a620-3d9461967c07",
  "expires_at": "2026-10-29T09:36:35.161326962Z",
  "resend_available_at": "2026-10-29T09:31:36.161326962Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673930205` → **200**

```json
{
  "phone": "+380673930205",
  "audience": "CLIENT",
  "code": "891923",
  "sent_at": "2026-10-29T09:31:35.163643464Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "78c45365-7548-4645-a620-3d9461967c07",
  "code": "891923",
  "device_ref": "sandbox-31629"
}
```

```json
{
  "session_id": "e5f00b3c-77a5-4ac7-8f10-7560d780369b",
  "subject": {
    "type": "CLIENT",
    "id": "2e8f3abd-1c58-47ca-83d5-a248a766681d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZThmM2FiZC0xYzU4LTQ3Y2EtODNkNS1hMjQ4YTc2NjY4MWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MTk1LCJpYXQiOjE3OTMyNjYyOTUsImp0aSI6Ijc5NjViM2RjLWZmMzgtNDdkNS1hZGYxLTg2NThkMDFjYWI2NCIsInNpZCI6ImU1ZjAwYjNjLTc3YTUtNGFjNy04ZjEwLTc1NjBkNzgwMzY5YiJ9.gp7jN1DJp2zHdNhIsdTZEQMwpAPMHFUQgFIRSUbKfDk",
  "access_expires_at": "2026-10-29T09:46:35.470515207Z",
  "refresh_token": "09C3Gwoji6eWtHs2x7zpTAa9VBnztxL3ucUHyqfkKzE",
  "refresh_expires_at": "2026-11-28T09:31:35.470057328Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2e8f3abd-1c58-47ca-83d5-a248a766681d",
  "session_id": "e5f00b3c-77a5-4ac7-8f10-7560d780369b",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "271014ee-be1c-46dd-a5e7-32ea2b2cca61",
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
  "id": "e78e2c8c-0f53-4f07-8e2e-2551cc3f3568",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:36.018899Z",
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
  "challenge_id": "1907cc92-d43b-4cdf-b67f-a65e5377776a",
  "expires_at": "2026-10-29T09:36:38.298090846Z",
  "resend_available_at": "2026-10-29T09:31:39.298090846Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380673930205` → **200**

```json
{
  "phone": "+380673930205",
  "audience": "CLIENT",
  "code": "955705",
  "sent_at": "2026-10-29T09:31:38.30052132Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "bf1d366b-5788-40b3-889d-65c28cdbc204",
  "challenge_id": "1907cc92-d43b-4cdf-b67f-a65e5377776a",
  "otp_code": "955705"
}
```

```json
{
  "client_id": "2e8f3abd-1c58-47ca-83d5-a248a766681d",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T09:31:38.624530606Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "be348d83-9429-4a03-91bb-b7555816587b",
  "quote_id": "e78e2c8c-0f53-4f07-8e2e-2551cc3f3568",
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
  "correlation_id": "1eb5bd87-c6ab-481e-b24b-ea91c1c85f16"
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
  "session_id": "8ca52de0-aaee-4516-8386-256112427ad6",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcxOTksImlhdCI6MTc5MzI2NjI5OSwianRpIjoiY2U0MmYzMGEtZDBhZS00OGNhLTlmYjctNjJmMmY0ZmM1NjE5Iiwic2lkIjoiOGNhNTJkZTAtYWFlZS00NTE2LTgzODYtMjU2MTEyNDI3YWQ2In0.dPxP8JNGuI7spkHDI79crVtOaSODXf-QCqhMqgh3ifM",
  "access_expires_at": "2026-10-29T09:46:39.517704837Z",
  "refresh_token": "kIXx_lXO6cMKEYGl2RCJIaIEPIa6MHt1D1EkeZXM3ms",
  "refresh_expires_at": "2026-10-29T21:31:39.517190158Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "2e8f3abd-1c58-47ca-83d5-a248a766681d",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T09:31:38.624531Z",
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

`POST /api/admin/v1/client-deletions/2e8f3abd-1c58-47ca-83d5-a248a766681d/complete` → **200**

```json
{
  "command_id": "d3bc92ee-13c6-4c52-8dd6-851a70e3a928",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "2e8f3abd-1c58-47ca-83d5-a248a766681d",
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
  "correlation_id": "cbf9d55d-ee7f-4151-bdc1-4806bd89adce"
}
```

Done: client 2e8f3abd-1c58-47ca-83d5-a248a766681d anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664962802",
  "device_ref": "sandbox-24576"
}
```

```json
{
  "challenge_id": "a3e53712-e989-47e7-aa55-a1b2d704a2d4",
  "expires_at": "2026-10-29T09:36:40.661068691Z",
  "resend_available_at": "2026-10-29T09:31:41.661068691Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664962802` → **200**

```json
{
  "phone": "+380664962802",
  "audience": "CLIENT",
  "code": "925528",
  "sent_at": "2026-10-29T09:31:40.663656125Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3e53712-e989-47e7-aa55-a1b2d704a2d4",
  "code": "925528",
  "device_ref": "sandbox-24576"
}
```

```json
{
  "session_id": "4848dd3c-eef5-448f-99c6-175e5e176a8d",
  "subject": {
    "type": "CLIENT",
    "id": "994b791b-9914-49f9-99c1-7d500947c415"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTRiNzkxYi05OTE0LTQ5ZjktOTljMS03ZDUwMDk0N2M0MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjAwLCJpYXQiOjE3OTMyNjYzMDAsImp0aSI6IjU3MDgxOWY2LTcyYmItNDkyYi1hNDNjLWJhZDQ0ZjE2NWIzMCIsInNpZCI6IjQ4NDhkZDNjLWVlZjUtNDQ4Zi05OWM2LTE3NWU1ZTE3NmE4ZCJ9.kg1dgMavUpcsS0_y2aWuybMOJwD5DallUyDaAs5SftY",
  "access_expires_at": "2026-10-29T09:46:40.964824887Z",
  "refresh_token": "BTvLCBYGgLjkKDwA66g33V08Os4GzJ0ddSacxUjaGXY",
  "refresh_expires_at": "2026-11-28T09:31:40.96420612Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "994b791b-9914-49f9-99c1-7d500947c415",
  "session_id": "4848dd3c-eef5-448f-99c6-175e5e176a8d",
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
  "session_id": "39b0db25-a3a4-4e72-86d0-24bb88d36223",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMDEsImlhdCI6MTc5MzI2NjMwMSwianRpIjoiNmE0MDBiN2QtMGYwNy00ODBhLWJkZWQtMzRmOWEwYWMxYmJhIiwic2lkIjoiMzliMGRiMjUtYTNhNC00ZTcyLTg2ZDAtMjRiYjg4ZDM2MjIzIn0.W2g6TjkZMLCmcDn-6rYMLuYeDFEbC2qMWT2Rn2ELvCk",
  "access_expires_at": "2026-10-29T09:46:41.854658114Z",
  "refresh_token": "8ItVmdPLzOgxKBUY2mSXcdsQkwvkko2QsisZPK5Ge_I",
  "refresh_expires_at": "2026-10-29T21:31:41.854029493Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=4962802&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "994b791b-9914-49f9-99c1-7d500947c415",
      "phone": "+380664962802",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T09:31:40.962402Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/994b791b-9914-49f9-99c1-7d500947c415` → **200**

```json
{
  "client": {
    "id": "994b791b-9914-49f9-99c1-7d500947c415",
    "phone": "+380664962802",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:31:40.962402Z",
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

`POST /api/admin/v1/clients/994b791b-9914-49f9-99c1-7d500947c415/block` → **400**

```json
{
  "command_id": "7ae9e3cf-6d42-40b8-8c53-5535243b6190",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/994b791b-9914-49f9-99c1-7d500947c415/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "fce67124-330f-40c0-bec1-eed55620581c",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/994b791b-9914-49f9-99c1-7d500947c415/block` → **200**

```json
{
  "command_id": "c84d4ea8-9f28-42bb-9857-4be0a6815aad",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "994b791b-9914-49f9-99c1-7d500947c415",
  "phone": "+380664962802",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T09:31:40.962402Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T09:31:43.077413Z",
    "by": "8fce279f-3832-4218-a097-1ba9e57f3caa"
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
  "correlation_id": "c8b1915e-7cd9-4321-a13c-d9ab9f7fe4ad"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664962802",
  "device_ref": "sandbox-12433"
}
```

```json
{
  "challenge_id": "b80a1edf-252c-43e6-9e37-e44197399680",
  "expires_at": "2026-10-29T09:36:45.648483982Z",
  "resend_available_at": "2026-10-29T09:31:46.648483982Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664962802` → **200**

```json
{
  "phone": "+380664962802",
  "audience": "CLIENT",
  "code": "715126",
  "sent_at": "2026-10-29T09:31:45.650950599Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "b80a1edf-252c-43e6-9e37-e44197399680",
  "code": "715126",
  "device_ref": "sandbox-12433"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "d72862d7-4a39-4ad6-bbfc-9e65d7837ecd"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/994b791b-9914-49f9-99c1-7d500947c415` → **200**

```json
{
  "client": {
    "id": "994b791b-9914-49f9-99c1-7d500947c415",
    "phone": "+380664962802",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T09:31:40.962402Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T09:31:43.077413Z",
      "by": "8fce279f-3832-4218-a097-1ba9e57f3caa"
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

`POST /api/admin/v1/clients/994b791b-9914-49f9-99c1-7d500947c415/unblock` → **200**

```json
{
  "command_id": "3f95cf77-3428-449c-a6e6-850d0f6c96d2",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "994b791b-9914-49f9-99c1-7d500947c415",
  "phone": "+380664962802",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T09:31:40.962402Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664962802",
  "device_ref": "sandbox-28118"
}
```

```json
{
  "challenge_id": "f5e8a72a-5578-40de-be24-b934a6795759",
  "expires_at": "2026-10-29T09:36:48.842436573Z",
  "resend_available_at": "2026-10-29T09:31:49.842436573Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664962802` → **200**

```json
{
  "phone": "+380664962802",
  "audience": "CLIENT",
  "code": "703329",
  "sent_at": "2026-10-29T09:31:48.84495499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f5e8a72a-5578-40de-be24-b934a6795759",
  "code": "703329",
  "device_ref": "sandbox-28118"
}
```

```json
{
  "session_id": "63ed3990-10fd-4412-b344-8a5228e754f0",
  "subject": {
    "type": "CLIENT",
    "id": "994b791b-9914-49f9-99c1-7d500947c415"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5OTRiNzkxYi05OTE0LTQ5ZjktOTljMS03ZDUwMDk0N2M0MTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjA5LCJpYXQiOjE3OTMyNjYzMDksImp0aSI6ImVlNGM1YmFjLWZlZjQtNGE2ZC05ZjAwLWFhNzAxY2QwNTM3YSIsInNpZCI6IjYzZWQzOTkwLTEwZmQtNDQxMi1iMzQ0LThhNTIyOGU3NTRmMCJ9.euFzTW2MRxeqaQYBqk6KHOvwfov4JLK5LfmuAGe_89g",
  "access_expires_at": "2026-10-29T09:46:49.153290011Z",
  "refresh_token": "TZdYKVWJ7zbw3YMAj6MB3wPBxsvJwnSN3ghyK5tmnO0",
  "refresh_expires_at": "2026-11-28T09:31:49.152806574Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "994b791b-9914-49f9-99c1-7d500947c415",
  "session_id": "63ed3990-10fd-4412-b344-8a5228e754f0",
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
  "phone": "+380666296189",
  "device_ref": "sandbox-18464"
}
```

```json
{
  "challenge_id": "224c92a5-3035-4231-83d5-d05705c530d6",
  "expires_at": "2026-10-29T09:36:49.713470201Z",
  "resend_available_at": "2026-10-29T09:31:50.713470201Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380666296189` → **200**

```json
{
  "phone": "+380666296189",
  "audience": "CLIENT",
  "code": "266323",
  "sent_at": "2026-10-29T09:31:49.715902458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "224c92a5-3035-4231-83d5-d05705c530d6",
  "code": "266323",
  "device_ref": "sandbox-18464"
}
```

```json
{
  "session_id": "75b2a00c-63de-48f1-8242-bd5ab1c87be4",
  "subject": {
    "type": "CLIENT",
    "id": "d90710c1-39c8-44c5-9b77-054af015775f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkOTA3MTBjMS0zOWM4LTQ0YzUtOWI3Ny0wNTRhZjAxNTc3NWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjEwLCJpYXQiOjE3OTMyNjYzMTAsImp0aSI6ImQ2ZDc3NjI4LTQxOGUtNGE1Yi04ZTU3LTAwZDIzNzdlNzUyNiIsInNpZCI6Ijc1YjJhMDBjLTYzZGUtNDhmMS04MjQyLWJkNWFiMWM4N2JlNCJ9.F52hOgT3bVfrbXx6Vbaim0CjjI9R3P_az2g-24lSGBg",
  "access_expires_at": "2026-10-29T09:46:50.032979685Z",
  "refresh_token": "k_ejZUqE2vza5dQuppDS4kuZM_wzD7BIVWeMPG2Fn7w",
  "refresh_expires_at": "2026-11-28T09:31:50.032368982Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "03171537-bc88-4d9d-80b5-27925887cba5",
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
  "id": "04d686b3-79fc-421e-8b98-8c10d707ba94",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:36:50.320035Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 4acbb72b-6844-4d19-87d4-0165e7d379ce) → **201**

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
  "session_id": "8167ae5c-5b8e-453d-9cd8-fbc929c60799",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMTAsImlhdCI6MTc5MzI2NjMxMCwianRpIjoiNTZiNDhhMzktYmQ3Yi00NjRjLWJkZmItYTM2MmJmNzNiZjhiIiwic2lkIjoiODE2N2FlNWMtNWI4ZS00NTNkLTljZDgtZmJjOTI5YzYwNzk5In0.LtkP8tWGJC5rkI_R5UVlStrs0vZ6tI3iAr_J86fF5dE",
  "access_expires_at": "2026-10-29T09:46:50.993686069Z",
  "refresh_token": "f4_j9zLd9hhSG5qNdtEosofI2iJ-QLbyj_yDt0cktUk",
  "refresh_expires_at": "2026-10-29T21:31:50.993168441Z",
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
  "session_id": "ebe59019-e7e1-4caf-9834-c93d69b06c7f",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMTEsImlhdCI6MTc5MzI2NjMxMSwianRpIjoiYWFhZDBiNDktOTM5Mi00MTE4LWFhNjAtMDJiZTY4MmM4MWVkIiwic2lkIjoiZWJlNTkwMTktZTdlMS00Y2FmLTk4MzQtYzkzZDY5YjA2YzdmIn0.X5rSv6eqwC8KiodHbJd2A5jPocHohLvlx2TCvqXrGRM",
  "access_expires_at": "2026-10-29T09:46:51.608315176Z",
  "refresh_token": "a5T2Elv-3uwEMrODSf-UJuB1i81HkMdLxLNKd8uiamQ",
  "refresh_expires_at": "2026-10-29T21:31:51.607800352Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/267d6ff7-fb4c-4da8-a27a-4f130b094724/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:31:50.624374Z",
      "actor": {
        "type": "CLIENT",
        "id": "d90710c1-39c8-44c5-9b77-054af015775f",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
        "quote_id": "04d686b3-79fc-421e-8b98-8c10d707ba94",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "4acbb72b-6844-4d19-87d4-0165e7d379ce"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:31:50.626729Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
        "attempt_id": "bc8e2866-a1db-4a18-ada4-3ce1c030237f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4acbb72b-6844-4d19-87d4-0165e7d379ce"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T09:31:50.633561Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
        "attempt_id": "bc8e2866-a1db-4a18-ada4-3ce1c030237f"
      },
      "correlation_id": "4acbb72b-6844-4d19-87d4-0165e7d379ce"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "bc8e2866-a1db-4a18-ada4-3ce1c030237f",
        "generation": 1,
        "started_at": "2026-10-29T09:31:50.625789Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T09:31:50.633561Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T09:31:50.627405Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/4acbb72b-6844-4d19-87d4-0165e7d379ce` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "267d6ff7-fb4c-4da8-a27a-4f130b094724:0",
      "order_id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
      "at": "2026-10-29T09:31:50.624374Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "267d6ff7-fb4c-4da8-a27a-4f130b094724:1",
      "order_id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
      "at": "2026-10-29T09:31:50.626729Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "267d6ff7-fb4c-4da8-a27a-4f130b094724:2",
      "order_id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
      "at": "2026-10-29T09:31:50.633561Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/93940314-dd73-43aa-baa1-c6e6bb6da758` → **200**

```json
{
  "found": []
}
```

Done: request 4acbb72b-6844-4d19-87d4-0165e7d379ce — order 267d6ff7-fb4c-4da8-a27a-4f130b094724 found by its id.

`GET /api/rider/v1/orders/267d6ff7-fb4c-4da8-a27a-4f130b094724` → **200**

```json
{
  "id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d90710c1-39c8-44c5-9b77-054af015775f",
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
  "created_at": "2026-10-29T09:31:50.623836Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/267d6ff7-fb4c-4da8-a27a-4f130b094724/cancel` → **200**

```json
{
  "command_id": "677a393a-bfae-4933-9602-6c895cb8e98c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "267d6ff7-fb4c-4da8-a27a-4f130b094724",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d90710c1-39c8-44c5-9b77-054af015775f",
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
  "created_at": "2026-10-29T09:31:50.623836Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "phone": "+380638147980",
  "device_ref": "sandbox-16732"
}
```

```json
{
  "challenge_id": "55a6f49b-45f3-4c89-97ee-b4303541285b",
  "expires_at": "2026-10-29T09:36:53.398111523Z",
  "resend_available_at": "2026-10-29T09:31:54.398111523Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638147980` → **200**

```json
{
  "phone": "+380638147980",
  "audience": "CLIENT",
  "code": "408864",
  "sent_at": "2026-10-29T09:31:53.400697051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55a6f49b-45f3-4c89-97ee-b4303541285b",
  "code": "408864",
  "device_ref": "sandbox-16732"
}
```

```json
{
  "session_id": "0b7a8958-ffd0-4a5c-9fe6-156c9fd291cf",
  "subject": {
    "type": "CLIENT",
    "id": "a70bc01f-db54-4734-8d36-c9660fc3b19b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNzBiYzAxZi1kYjU0LTQ3MzQtOGQzNi1jOTY2MGZjM2IxOWIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjEzLCJpYXQiOjE3OTMyNjYzMTMsImp0aSI6IjBkOTA3ZDQ4LTEwM2UtNDgyYy04NGJmLTUxOTJiOGUwODg1OSIsInNpZCI6IjBiN2E4OTU4LWZmZDAtNGE1Yy05ZmU2LTE1NmM5ZmQyOTFjZiJ9.9yi9991Ke4acaNmi6UNbeypVrvH9FnDIw033K1C35M0",
  "access_expires_at": "2026-10-29T09:46:53.708287987Z",
  "refresh_token": "Kk8yYaBp7e1GgQa4ol_eWvfQvrvZ5X88XTkWTXlT_a4",
  "refresh_expires_at": "2026-11-28T09:31:53.707820985Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "5dcb9137-a99d-491d-b74d-85ceec5866e7",
  "expires_at": "2026-10-29T09:36:55.993886531Z",
  "resend_available_at": "2026-10-29T09:31:56.993886531Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638147980` → **200**

```json
{
  "phone": "+380638147980",
  "audience": "CLIENT",
  "code": "364618",
  "sent_at": "2026-10-29T09:31:55.996103756Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "3e597201-7427-40fa-b794-974e56c1f958",
  "challenge_id": "5dcb9137-a99d-491d-b74d-85ceec5866e7",
  "otp_code": "364618"
}
```

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "PENDING",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a` → **200**

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "PENDING",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a` → **200**

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "PENDING",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a` → **200**

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "PENDING",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a` → **200**

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "PENDING",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a` → **200**

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "PENDING",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a` → **200**

```json
{
  "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
  "state": "READY",
  "created_at": "2026-10-29T09:31:56.311252Z",
  "ready_at": "2026-10-29T09:32:02.113943Z",
  "expires_at": "2026-11-05T09:32:02.113943Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633438402",
  "device_ref": "sandbox-8601"
}
```

```json
{
  "challenge_id": "9f3a5e44-3b06-4f74-a6f2-1f6842392763",
  "expires_at": "2026-10-29T09:37:03.243494284Z",
  "resend_available_at": "2026-10-29T09:32:04.243494284Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633438402` → **200**

```json
{
  "phone": "+380633438402",
  "audience": "CLIENT",
  "code": "961173",
  "sent_at": "2026-10-29T09:32:03.245977503Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f3a5e44-3b06-4f74-a6f2-1f6842392763",
  "code": "961173",
  "device_ref": "sandbox-8601"
}
```

```json
{
  "session_id": "4fe057a8-25d4-4529-9b5f-2a1c526537fa",
  "subject": {
    "type": "CLIENT",
    "id": "3f4d0105-78ce-4464-b385-30466d011a8a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzZjRkMDEwNS03OGNlLTQ0NjQtYjM4NS0zMDQ2NmQwMTFhOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjIzLCJpYXQiOjE3OTMyNjYzMjMsImp0aSI6IjRlYWZmNmQ5LThiNzktNDcwYS1iNjAzLWYxNDYyZGFhNWM1ZiIsInNpZCI6IjRmZTA1N2E4LTI1ZDQtNDUyOS05YjVmLTJhMWM1MjY1MzdmYSJ9.pq99qTzS5fjc7vDWdB1CARB0GZH6_C6Towdeout_vZc",
  "access_expires_at": "2026-10-29T09:47:03.543104837Z",
  "refresh_token": "2D6GeyxarU4chBVxCNwi2vLHifGO3DrWrkUjNDiVvOg",
  "refresh_expires_at": "2026-11-28T09:32:03.542628391Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a0725eb7-5d0e-49b9-8763-1a28cfb0c11a/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "99cfbba4-7ecb-4607-9a55-5af105ede832"
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
  "session_id": "eb442394-1853-404c-9843-98a9ee5a2ffd",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMjQsImlhdCI6MTc5MzI2NjMyNCwianRpIjoiZWRkYjk2OTUtZWIwNC00Yjg5LTg1Y2YtOGNmYzM3NWQ2NGY5Iiwic2lkIjoiZWI0NDIzOTQtMTg1My00MDRjLTk4NDMtOThhOWVlNWEyZmZkIn0.XtUzEsmRlqChKME2Z9RP9ht7hCEAhbR03HcPI-HXR6M",
  "access_expires_at": "2026-10-29T09:47:04.429335862Z",
  "refresh_token": "bFHtk2bTM2yGSIoF4-wxc8Oao7u8fNEuodKqKL0EJ1c",
  "refresh_expires_at": "2026-10-29T21:32:04.428866326Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "a70bc01f-db54-4734-8d36-c9660fc3b19b",
  "session_id": "0b7a8958-ffd0-4a5c-9fe6-156c9fd291cf",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/a70bc01f-db54-4734-8d36-c9660fc3b19b/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a0725eb7-5d0e-49b9-8763-1a28cfb0c11a",
      "state": "READY",
      "created_at": "2026-10-29T09:31:56.311252Z",
      "ready_at": "2026-10-29T09:32:02.113943Z",
      "expires_at": "2026-11-05T09:32:02.113943Z",
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
  "device_ref": "sandbox-31036"
}
```

```json
{
  "challenge_id": "8bd3c97f-b277-4161-b6eb-05bf0932388a",
  "expires_at": "2026-10-29T09:37:05.272077222Z",
  "resend_available_at": "2026-10-29T09:32:06.272077222Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "880791",
  "sent_at": "2026-10-29T09:32:05.274904474Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8bd3c97f-b277-4161-b6eb-05bf0932388a",
  "code": "880791",
  "device_ref": "sandbox-31036"
}
```

```json
{
  "session_id": "e065a8c9-c4b7-493b-80c6-78d70dbcd163",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzIyNSwiaWF0IjoxNzkzMjY2MzI1LCJqdGkiOiIxZmYwMjA1Yi00ZDVjLTQwNWYtODg4OC03ZTNlZWVhMjU1MDIiLCJzaWQiOiJlMDY1YThjOS1jNGI3LTQ5M2ItODBjNi03OGQ3MGRiY2QxNjMifQ.kqL34oUK1YqIqfbGKccrmX5rtd_g7dARCxa0AurZlD8",
  "access_expires_at": "2026-10-29T09:47:05.578585737Z",
  "refresh_token": "JlkU9FkqIl2m8MtiKaYTccs3yx6w7nL2w4Ak087AeBk",
  "refresh_expires_at": "2026-11-28T09:32:05.578118995Z",
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
  "device_ref": "sandbox-1292"
}
```

```json
{
  "challenge_id": "fcc19c5f-af75-45ef-afd8-87a7293952fb",
  "expires_at": "2026-10-29T09:37:06.144423687Z",
  "resend_available_at": "2026-10-29T09:32:07.144423687Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "762879",
  "sent_at": "2026-10-29T09:32:06.146955133Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcc19c5f-af75-45ef-afd8-87a7293952fb",
  "code": "762879",
  "device_ref": "sandbox-1292"
}
```

```json
{
  "session_id": "4f775dd5-b19d-4a7c-b74a-b4105c8cfd5b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzIyNiwiaWF0IjoxNzkzMjY2MzI2LCJqdGkiOiJjZDIzNTkwZC02MWFiLTRhYjItOTM3MS1lMjY0MDJkMjgzZTkiLCJzaWQiOiI0Zjc3NWRkNS1iMTlkLTRhN2MtYjc0YS1iNDEwNWM4Y2ZkNWIifQ.NCs7Z9CFGt1WK0RaKP7-QEl52PGVDUeCmkytufD9lz8",
  "access_expires_at": "2026-10-29T09:47:06.451434267Z",
  "refresh_token": "JhDTl67Rw1nqj3nAwZR79wMVcZlxXc6NmttVqH8C30k",
  "refresh_expires_at": "2026-11-28T09:32:06.450892732Z",
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
  "command_id": "fc183b7e-d73f-4a30-be19-5fcb8faf8d5c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:06Z",
    "sequence": 1793266326989
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "af3a144c-0967-43d0-b76d-c788f7f9ea31",
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
  "last_heartbeat_at": "2026-10-29T09:32:07.009203Z",
  "last_location_at": "2026-10-29T09:32:07.009203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-5606"
}
```

```json
{
  "challenge_id": "b3861f17-7431-48ab-bdef-cff4fb8c281e",
  "expires_at": "2026-10-29T09:37:07.302513442Z",
  "resend_available_at": "2026-10-29T09:32:08.302513442Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "205869",
  "sent_at": "2026-10-29T09:32:07.305403458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b3861f17-7431-48ab-bdef-cff4fb8c281e",
  "code": "205869",
  "device_ref": "sandbox-5606"
}
```

```json
{
  "session_id": "f13fd0be-dbed-4351-a9d6-7101d1b6d305",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzIyNywiaWF0IjoxNzkzMjY2MzI3LCJqdGkiOiI3YWRmZGJiMC05YmY3LTRlZWItYTA0OC0zMmJkZmUzMjcyMjIiLCJzaWQiOiJmMTNmZDBiZS1kYmVkLTQzNTEtYTlkNi03MTAxZDFiNmQzMDUifQ.HSI0vKrxV5CJXIzqJ74aE3as421345B7Ihg9Wyw9nwA",
  "access_expires_at": "2026-10-29T09:47:07.612629512Z",
  "refresh_token": "_YYjMJH91QUGzMePos7tWPaw7DVfju37B_VSIEC1Yhg",
  "refresh_expires_at": "2026-11-28T09:32:07.61211886Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1a6aa21-bf70-4a92-a43f-209103f021d6",
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
  "last_heartbeat_at": "2026-10-29T09:30:38.381892Z",
  "last_location_at": "2026-10-29T09:30:38.381892Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b1a6aa21-bf70-4a92-a43f-209103f021d6/handover` → **200**

```json
{
  "command_id": "9fa23eda-8c94-4cc0-b463-2dcfad801779",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1a6aa21-bf70-4a92-a43f-209103f021d6",
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
  "last_heartbeat_at": "2026-10-29T09:30:38.381892Z",
  "last_location_at": "2026-10-29T09:30:38.381892Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/b1a6aa21-bf70-4a92-a43f-209103f021d6/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:08Z",
    "sequence": 1793266328448
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b1a6aa21-bf70-4a92-a43f-209103f021d6",
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
  "last_heartbeat_at": "2026-10-29T09:32:08.468186Z",
  "last_location_at": "2026-10-29T09:32:08.468186Z",
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
  "session_id": "b8a8dada-d0be-4e36-a4d3-932338557a86",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMjksImlhdCI6MTc5MzI2NjMyOSwianRpIjoiNzQ3MDU2MGQtNjY0ZS00YmM3LTgyYTYtMzRhNjFiZGJmNmY5Iiwic2lkIjoiYjhhOGRhZGEtZDBiZS00ZTM2LWE0ZDMtOTMyMzM4NTU3YTg2In0.0Tq6N9JIFNKYSH0w1C0CZY5_W5zdVgneSkWF7KLSCCE",
  "access_expires_at": "2026-10-29T09:47:09.074132162Z",
  "refresh_token": "Pceq0O2dPewWmgCzqPhHEgrt0Cfbhahvi6nqkx8TDDU",
  "refresh_expires_at": "2026-10-29T21:32:09.073660463Z",
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
  "session_id": "02e4d36e-0ddd-4731-a432-896471f0de1a",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMjksImlhdCI6MTc5MzI2NjMyOSwianRpIjoiYjI2NzkxN2EtN2YxZi00ZDNmLWI5ODgtZmUxNWI5YzUzZjdiIiwic2lkIjoiMDJlNGQzNmUtMGRkZC00NzMxLWE0MzItODk2NDcxZjBkZTFhIn0.lFocaO81laIAofkhrNdSDmCgMcBQZoQgxN7C5ONLWVI",
  "access_expires_at": "2026-10-29T09:47:09.68705083Z",
  "refresh_token": "e4kl0zTljcEjwVtB5ixA-5YGFXf2pTigHFsrnmTs2CY",
  "refresh_expires_at": "2026-10-29T21:32:09.686528915Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380681826394",
  "device_ref": "sandbox-18884"
}
```

```json
{
  "challenge_id": "12299d5d-c010-40cf-9a9d-1bb326e915c6",
  "expires_at": "2026-10-29T09:37:09.965285912Z",
  "resend_available_at": "2026-10-29T09:32:10.965285912Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380681826394` → **200**

```json
{
  "phone": "+380681826394",
  "audience": "CLIENT",
  "code": "758077",
  "sent_at": "2026-10-29T09:32:09.967953385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "12299d5d-c010-40cf-9a9d-1bb326e915c6",
  "code": "758077",
  "device_ref": "sandbox-18884"
}
```

```json
{
  "session_id": "3c300c49-ec1c-4e41-9e3f-67cfd510af9e",
  "subject": {
    "type": "CLIENT",
    "id": "43b1ea54-fa6a-4b4c-b723-bd10f22540c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0M2IxZWE1NC1mYTZhLTRiNGMtYjcyMy1iZDEwZjIyNTQwYzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjMwLCJpYXQiOjE3OTMyNjYzMzAsImp0aSI6IjEwNzllZjY3LTNkZDMtNGFkNC05NTVhLWVlOWE4YmM2MTRlZSIsInNpZCI6IjNjMzAwYzQ5LWVjMWMtNGU0MS05ZTNmLTY3Y2ZkNTEwYWY5ZSJ9.LXfQIn-q_pwdRGbKvTPU-wFV-KmAymqrGPdd1l0vu9Q",
  "access_expires_at": "2026-10-29T09:47:10.27545287Z",
  "refresh_token": "pvOj8SjAXQfkDiIEtpxbrp6oIF97JQozs3XQSi6JBl8",
  "refresh_expires_at": "2026-11-28T09:32:10.274960439Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "080d3c4a-81d4-4064-af07-90c1b51d1f57",
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
  "id": "90ec2b47-4eea-4127-821e-9f93b830ef68",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:10.566265Z",
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
  "command_id": "f50a9502-42cd-437d-b626-78cd3875c8bd",
  "quote_id": "90ec2b47-4eea-4127-821e-9f93b830ef68",
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
  "id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "43b1ea54-fa6a-4b4c-b723-bd10f22540c6",
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
  "created_at": "2026-10-29T09:32:10.866771Z",
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
    "id": "0b0e82f5-3e15-49dc-b7fb-888fb5477854",
    "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
    "expires_at": "2026-10-29T09:32:25.869969Z",
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

`POST /api/driver/v1/offers/0b0e82f5-3e15-49dc-b7fb-888fb5477854/reject` → **204**

```json
{
  "command_id": "7bb946ae-28a4-444d-ac28-da2b2fe81391"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "fa0a37fd-3774-480f-9077-6dc9fd613de2",
    "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
    "expires_at": "2026-10-29T09:32:26.465695Z",
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

`POST /api/driver/v1/offers/fa0a37fd-3774-480f-9077-6dc9fd613de2/accept` → **200**

```json
{
  "command_id": "a7312874-0009-4f0f-9ad7-e8bb54183ce9"
}
```

```json
{
  "id": "72fea0b3-e456-482c-8e0e-9f4ea971d90b",
  "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ce1925cf-049a-4d6d-85f2-7e2c31896895",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c4687b0a-a1e0-421a-ac23-c47da437d138/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:32:10.867326Z",
      "actor": {
        "type": "CLIENT",
        "id": "43b1ea54-fa6a-4b4c-b723-bd10f22540c6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
        "quote_id": "90ec2b47-4eea-4127-821e-9f93b830ef68",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "e0a65172-90e0-4070-b84c-d5a8a8cee941"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:32:10.869212Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
        "attempt_id": "35d6c270-7f9a-4bf9-8f24-771932f58be3",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "e0a65172-90e0-4070-b84c-d5a8a8cee941"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:32:10.872716Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0b0e82f5-3e15-49dc-b7fb-888fb5477854",
        "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "e0a65172-90e0-4070-b84c-d5a8a8cee941"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T09:32:11.464806Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "0b0e82f5-3e15-49dc-b7fb-888fb5477854",
        "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138"
      },
      "correlation_id": "bf0965ff-07a6-41b2-ab39-a6c35bc06f70"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c4687b0a-a1e0-421a-ac23-c47da437d138 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c4687b0a-a1e0-421a-ac23-c47da437d138` → **200**

```json
{
  "id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "43b1ea54-fa6a-4b4c-b723-bd10f22540c6",
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
    "id": "72fea0b3-e456-482c-8e0e-9f4ea971d90b",
    "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "ce1925cf-049a-4d6d-85f2-7e2c31896895",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T09:32:10.866771Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c4687b0a-a1e0-421a-ac23-c47da437d138/cancel` → **200**

```json
{
  "command_id": "e4c3cdb2-022f-4a75-b935-083c8e780387",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "43b1ea54-fa6a-4b4c-b723-bd10f22540c6",
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
    "id": "72fea0b3-e456-482c-8e0e-9f4ea971d90b",
    "order_id": "c4687b0a-a1e0-421a-ac23-c47da437d138",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "ce1925cf-049a-4d6d-85f2-7e2c31896895",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:32:10.866771Z",
  "caller": null,
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "session_id": "af3a144c-0967-43d0-b76d-c788f7f9ea31",
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
  "last_heartbeat_at": "2026-10-29T09:32:07.009203Z",
  "last_location_at": "2026-10-29T09:32:07.009203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/af3a144c-0967-43d0-b76d-c788f7f9ea31/close` → **200**

```json
{
  "command_id": "6a89160a-8fdb-413a-a8df-2745262aaaef",
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
  "session_id": "b1a6aa21-bf70-4a92-a43f-209103f021d6",
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
  "last_heartbeat_at": "2026-10-29T09:32:08.468186Z",
  "last_location_at": "2026-10-29T09:32:08.468186Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b1a6aa21-bf70-4a92-a43f-209103f021d6/close` → **200**

```json
{
  "command_id": "00a56f8a-6dbf-48db-8fc5-5fbc1c0e7d21",
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
  "session_id": "3efb004a-906d-462e-a098-b62eadcb231f",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyMzQsImlhdCI6MTc5MzI2NjMzNCwianRpIjoiMTY1ZjY2MzktYTczMi00MjQxLWI2NWYtN2Y5MDY4NDc1YWUzIiwic2lkIjoiM2VmYjAwNGEtOTA2ZC00NjJlLWEwOTgtYjYyZWFkY2IyMzFmIn0.19JAo8hW6HY2ffqKBYwd9ZbxlPi9hCo389g-jZvrpmQ",
  "access_expires_at": "2026-10-29T09:47:14.472097324Z",
  "refresh_token": "r7dw_gb2O1nh5gcCRwCny9iEuCLa-irnq7Ichw1KFaQ",
  "refresh_expires_at": "2026-10-29T21:32:14.471598553Z",
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
  "command_id": "92957f0f-7f53-4f24-a1e1-30941a6d992d",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T09:32:15.044214Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "63a817da-fa8f-401e-901d-bdff21568b79",
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
  "correlation_id": "0d014621-548f-4b2c-93b6-6902b3ffdf04"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "19dcd1bf-9b42-4175-a8ed-7d964a6d63b1",
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
  "correlation_id": "48fc49d7-6fdb-4fb4-b3a2-cf56d224fcfa"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635350897",
  "device_ref": "sandbox-18021"
}
```

```json
{
  "challenge_id": "d530d0af-290e-4734-9164-367021b30bc7",
  "expires_at": "2026-10-29T09:37:15.913252181Z",
  "resend_available_at": "2026-10-29T09:32:16.913252181Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635350897` → **200**

```json
{
  "phone": "+380635350897",
  "audience": "CLIENT",
  "code": "178711",
  "sent_at": "2026-10-29T09:32:15.919526518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d530d0af-290e-4734-9164-367021b30bc7",
  "code": "178711",
  "device_ref": "sandbox-18021"
}
```

```json
{
  "session_id": "fcfd03f6-5007-441d-86fc-7ffd97a5f998",
  "subject": {
    "type": "CLIENT",
    "id": "8dfc2eee-78df-413c-a87c-43eda40c055f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZGZjMmVlZS03OGRmLTQxM2MtYTg3Yy00M2VkYTQwYzA1NWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjM2LCJpYXQiOjE3OTMyNjYzMzYsImp0aSI6ImIxMWE2NWI2LTNjNmYtNDZlNC04ZTYxLWYxOTJjMmZmNWRhNCIsInNpZCI6ImZjZmQwM2Y2LTUwMDctNDQxZC04NmZjLTdmZmQ5N2E1Zjk5OCJ9.v1hXyz8fLhUXVQ5DCfVwHibBIc57tikuveXP5SfehBk",
  "access_expires_at": "2026-10-29T09:47:16.237059619Z",
  "refresh_token": "tCyBt7e6Kd7qaTsvLRlXOFltequPMfjuh42fgBJfJCc",
  "refresh_expires_at": "2026-11-28T09:32:16.23654197Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "35aab5fc-ad30-490f-9554-39f1259e83a1",
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
  "id": "931a4a72-06ec-4ca1-ad95-b9784dd61536",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:16.515202Z",
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
  "command_id": "b9250694-2723-48ea-986b-846d9cfe2808",
  "quote_id": "931a4a72-06ec-4ca1-ad95-b9784dd61536",
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
  "correlation_id": "6d42ea03-f36b-41d8-8cce-69026965be1d"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "24a4148f-3bf8-4428-b11b-c145344197af",
  "quote_id": "931a4a72-06ec-4ca1-ad95-b9784dd61536",
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
  "id": "5773946d-5041-4de9-a3b8-72d53958e19a",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8dfc2eee-78df-413c-a87c-43eda40c055f",
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
  "created_at": "2026-10-29T09:32:17.094894Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5773946d-5041-4de9-a3b8-72d53958e19a/cancel` → **200**

```json
{
  "command_id": "4ba8d14d-102f-46f6-9fed-05e1fb7d8b95",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "5773946d-5041-4de9-a3b8-72d53958e19a",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8dfc2eee-78df-413c-a87c-43eda40c055f",
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
  "created_at": "2026-10-29T09:32:17.094894Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "command_id": "c6ffb9b9-3170-4749-9e66-e2115a1734ec",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T09:32:17.763722Z"
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
      "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T09:32:17.763722Z"
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
  "device_ref": "sandbox-22676"
}
```

```json
{
  "challenge_id": "163a7b03-370e-4b06-bb2e-4e1e0183204e",
  "expires_at": "2026-10-29T09:37:18.61399374Z",
  "resend_available_at": "2026-10-29T09:32:19.61399374Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "185976",
  "sent_at": "2026-10-29T09:32:18.616397671Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "163a7b03-370e-4b06-bb2e-4e1e0183204e",
  "code": "185976",
  "device_ref": "sandbox-22676"
}
```

```json
{
  "session_id": "e7c30403-8cbf-4351-a732-d4395a72af16",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzIzOCwiaWF0IjoxNzkzMjY2MzM4LCJqdGkiOiJlNWIxZWZmNy1iOGNmLTQ2Y2MtYjNlMS0xZjkzZDk0ZWU0YzEiLCJzaWQiOiJlN2MzMDQwMy04Y2JmLTQzNTEtYTczMi1kNDM5NWE3MmFmMTYifQ.jQb6E9uaKnkSNCGq0--BYvIozpH2x2gzAL8SFTWnQ3U",
  "access_expires_at": "2026-10-29T09:47:18.912513616Z",
  "refresh_token": "taJTe-V4G9vmCq5p6JyqVp8rPENgU2bH6nICWfeJ2CY",
  "refresh_expires_at": "2026-11-28T09:32:18.911996768Z",
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
  "command_id": "1d788c7a-6c5e-4fb6-bdf7-15e3a54f41f7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:19Z",
    "sequence": 1793266339460
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:19.480751Z",
  "last_location_at": "2026-10-29T09:32:19.480751Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678574322",
  "device_ref": "sandbox-22730"
}
```

```json
{
  "challenge_id": "0ee67e5b-785e-427d-859c-7bc92d2a6ff2",
  "expires_at": "2026-10-29T09:37:19.764013354Z",
  "resend_available_at": "2026-10-29T09:32:20.764013354Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678574322` → **200**

```json
{
  "phone": "+380678574322",
  "audience": "CLIENT",
  "code": "966712",
  "sent_at": "2026-10-29T09:32:19.766443385Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0ee67e5b-785e-427d-859c-7bc92d2a6ff2",
  "code": "966712",
  "device_ref": "sandbox-22730"
}
```

```json
{
  "session_id": "92a08b05-d5aa-47ce-acad-bb02effaf818",
  "subject": {
    "type": "CLIENT",
    "id": "dc362db7-4aaf-4e21-9180-df66fd1ba3ad"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzM2MmRiNy00YWFmLTRlMjEtOTE4MC1kZjY2ZmQxYmEzYWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjQwLCJpYXQiOjE3OTMyNjYzNDAsImp0aSI6IjdjMWEyZmNmLTA5ZjUtNDc3Ny1iNDE2LWU3OTEwOWI4Yzk1MSIsInNpZCI6IjkyYTA4YjA1LWQ1YWEtNDdjZS1hY2FkLWJiMDJlZmZhZjgxOCJ9.vkrfJx6DEo6B0yyCINXRpAqLDJb17ns7qzA-cGU6QLc",
  "access_expires_at": "2026-10-29T09:47:20.07101699Z",
  "refresh_token": "LR87PdKblKtuZYU5mIkX2tateIMhlxN41u2OHfZWr5c",
  "refresh_expires_at": "2026-11-28T09:32:20.070435935Z",
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
  "command_id": "726ed1a1-8ac3-4999-a570-3ad7e39a11f1",
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
  "id": "3c9ad83e-48a3-4641-9a87-e1648f6635f2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:20.638105Z",
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
  "command_id": "ee9d6ed4-b8e9-4d9f-8157-e72292a03349",
  "platform": "ANDROID",
  "token": "sandbox-driver-f474977b-a50c-47b2-8cbc-f9128617dd67"
}
```

```json
{
  "id": "8a2aedf6-c8f8-48fe-be64-1d128ec81e56",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T09:32:20.932125Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "7392b14e-9494-42ac-b55f-a882bf82c0b5",
  "platform": "ANDROID",
  "token": "sandbox-rider-68d70af9-110d-4647-bb5f-d8d7ad58cfe5"
}
```

```json
{
  "id": "c5cb2c11-c22b-4b89-a7fd-a7aeef0acd21",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T09:32:21.217908Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "fd309d26-4794-4e73-a5c0-54e6a0dbbe01",
  "quote_id": "3c9ad83e-48a3-4641-9a87-e1648f6635f2",
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
  "id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc362db7-4aaf-4e21-9180-df66fd1ba3ad",
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
  "created_at": "2026-10-29T09:32:21.510839Z",
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
    "id": "cc34e538-50d5-40d2-8308-5072a4c2a5a2",
    "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
    "expires_at": "2026-10-29T09:32:36.513802Z",
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

`POST /api/driver/v1/offers/cc34e538-50d5-40d2-8308-5072a4c2a5a2/accept` → **200**

```json
{
  "command_id": "f6a411ca-7ce1-45b4-8558-4ba4eccf1e41"
}
```

```json
{
  "id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T09:32:21.486Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T09:32:21.486Z` → **200**

```json
[
  {
    "at": "2026-10-29T09:32:22.581444399Z",
    "token_suffix": "17dd67",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
      "order_version": "2",
      "event_id": "ea5cdcdd-9412-4b95-b25e-06b4b4208019"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678574322&after=2026-10-29T09:32:21.486Z` → **200**

```json
[
  {
    "at": "2026-10-29T09:32:22.584241778Z",
    "token_suffix": "58cfe5",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
      "order_version": "3",
      "event_id": "87ae0291-25cc-4d36-87bb-1f4b94d821bd"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/2f70a2a4-bbd7-4247-8696-1dbe99dd66b6/messages` → **201**

```json
{
  "command_id": "31c1a825-cf01-4986-92e0-2c27e15fdc78",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "59c4a5d2-8fd4-4588-8924-07b9649d8428",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T09:32:23.46884525Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "assignment_id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
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

`POST /api/driver/v1/trips/ef3cfa39-b6b0-47bf-bf13-65f2eacd2155/messages` → **201**

```json
{
  "command_id": "d37011eb-0c8e-4f64-9c02-7f16499957f3",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "50521ca1-9d59-4f13-9d95-650290b8cd4b",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T09:32:24.010430614Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/2f70a2a4-bbd7-4247-8696-1dbe99dd66b6/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/ef3cfa39-b6b0-47bf-bf13-65f2eacd2155/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678574322"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:24Z",
    "sequence": 1793266344831
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:24.851715Z",
  "last_location_at": "2026-10-29T09:32:24.851715Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "assignment_id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
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

`POST /api/driver/v1/trips/ef3cfa39-b6b0-47bf-bf13-65f2eacd2155/arrive` → **200**

```json
{
  "command_id": "aeab8ff4-d5aa-4e4c-99d8-4642deea7046",
  "expected_version": 0
}
```

```json
{
  "id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "assignment_id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
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
  "arrived_at": "2026-10-29T09:32:25.400353Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/ef3cfa39-b6b0-47bf-bf13-65f2eacd2155/start` → **200**

```json
{
  "command_id": "bb8f313e-65a4-47c8-8088-6367211ef2d1",
  "expected_version": 1
}
```

```json
{
  "id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "assignment_id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
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
  "arrived_at": "2026-10-29T09:32:25.400353Z",
  "started_at": "2026-10-29T09:32:25.691721Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:25Z",
    "sequence": 1793266345970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:25.989801Z",
  "last_location_at": "2026-10-29T09:32:25.989801Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/ef3cfa39-b6b0-47bf-bf13-65f2eacd2155/complete` → **200**

```json
{
  "command_id": "0717bc74-ce3a-4dd8-b5f9-705a85c074d0",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:32:26Z",
  "cash_received": true
}
```

```json
{
  "id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "assignment_id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
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
  "arrived_at": "2026-10-29T09:32:25.400353Z",
  "started_at": "2026-10-29T09:32:25.691721Z",
  "completed_at": "2026-10-29T09:32:26.308386Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/2f70a2a4-bbd7-4247-8696-1dbe99dd66b6` → **200**

```json
{
  "id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "dc362db7-4aaf-4e21-9180-df66fd1ba3ad",
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
    "id": "0dad174d-e95c-4eb4-8928-2f75940468ae",
    "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:32:21.510839Z",
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
    "id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T09:32:21.510839Z",
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
    "id": "ef3cfa39-b6b0-47bf-bf13-65f2eacd2155",
    "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
    "order_short_number": 13,
    "created_at": "2026-10-29T09:32:22.088215Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d56cddd0-60ae-4388-b056-4e94e4d70e95",
    "order_id": "e4945fb2-aec8-40b2-91b4-9ee8feaefac0",
    "order_short_number": 8,
    "created_at": "2026-10-29T09:31:12.047009Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c0f72920-8eaf-480c-8e6f-9158c313b2eb",
    "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
    "order_short_number": 3,
    "created_at": "2026-10-29T09:30:26.942569Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "0c1117ce-cd18-48be-a60d-be59537daf10",
    "order_id": "c31f0d70-8b25-4cd1-8a10-ca635e48d06b",
    "order_short_number": 2,
    "created_at": "2026-10-29T09:30:07.589346Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2946c333-342a-4cbb-9bfd-e8fc0dc467ed",
    "order_id": "e45c253a-0715-44e3-842e-279d3b9ac93e",
    "order_short_number": 1,
    "created_at": "2026-10-29T09:29:58.058353Z",
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

`GET /api/rider/v1/orders/2f70a2a4-bbd7-4247-8696-1dbe99dd66b6/tip` → **200**

```json
{
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
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
  "available_until": "2026-10-30T09:32:26.308386Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2f70a2a4-bbd7-4247-8696-1dbe99dd66b6/tip` → **201**

```json
{
  "command_id": "28201726-10c9-4cb3-b026-135a107173ae",
  "amount_minor": 1100
}
```

```json
{
  "id": "5df6ddd8-c35a-4e83-bad8-2352b5084c69",
  "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T09:32:31.321596Z"
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
  "session_id": "55ab847a-91fa-430a-a638-6c1a2d74d95a",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNTEsImlhdCI6MTc5MzI2NjM1MSwianRpIjoiZWFlMmFjOTAtMjI1Yi00M2U0LWI0ZjgtYzM1OWQwZWNmNWUzIiwic2lkIjoiNTVhYjg0N2EtOTFmYS00MzBhLWE2MzgtNmMxYTJkNzRkOTVhIn0.-EluU0AxirTXxHt7lvBzBgKEqoO9D7wfUoeq_Fg7uuI",
  "access_expires_at": "2026-10-29T09:47:31.935353636Z",
  "refresh_token": "zra2QkqbAxGQN_TL2rFCGsb-BFe1pHuDNxfvdcGHqpY",
  "refresh_expires_at": "2026-10-29T21:32:31.934877169Z",
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
          "PHONE": 1,
          "APP": 12
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
      "PHONE": 1,
      "APP": 12
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
  "generated_at": "2026-10-29T09:32:32.213347897Z"
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
  "generated_at": "2026-10-29T09:32:32.493879996Z"
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
  "session_id": "b311d8db-7df3-41bd-9259-0c1e228df2f6",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNTMsImlhdCI6MTc5MzI2NjM1MywianRpIjoiYjc3NWUyMDUtNDAxYy00OGI1LWEwNDgtM2E2OTM4ODU0NTU0Iiwic2lkIjoiYjMxMWQ4ZGItN2RmMy00MWJkLTkyNTktMGMxZTIyOGRmMmY2In0.Tabe3FdQqz_byTle_Smfk2jgYymEezeYe7cQcEbdcBg",
  "access_expires_at": "2026-10-29T09:47:33.124673622Z",
  "refresh_token": "Q1fLkhmCgntvJf_5Hsa2Lx79IdfP_qkb0NVyEefJEMg",
  "refresh_expires_at": "2026-10-29T21:32:33.124177106Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2f70a2a4-bbd7-4247-8696-1dbe99dd66b6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:32:21.511293Z",
      "actor": {
        "type": "CLIENT",
        "id": "dc362db7-4aaf-4e21-9180-df66fd1ba3ad",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
        "quote_id": "3c9ad83e-48a3-4641-9a87-e1648f6635f2",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c4fc9aeb-c379-4660-ad72-45e38f57a842"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:32:21.513104Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
        "attempt_id": "7c7a3a07-ca46-4bb4-b4e7-97d8b31cf5f4",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c4fc9aeb-c379-4660-ad72-45e38f57a842"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:32:21.515749Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "cc34e538-50d5-40d2-8308-5072a4c2a5a2",
        "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c4fc9aeb-c379-4660-ad72-45e38f57a842"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:32:22.089847Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "cc34e538-50d5-40d2-8308-5072a4c2a5a2",
        "order_id": "2f70a2a4-bbd7-4247-8696-1dbe99dd66b6",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "0dad174d-e95c-4eb4-8928-2f75940468ae"
      },
      "correlation_id": "513f8327-38c2-4432-8a3b-50709411c887"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T09:32:33.707145552Z",
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
      "last_location_at": "2026-10-29T09:32:25.989801Z",
      "order_id": null
    }
  ]
}
```

Done: order 2f70a2a4-bbd7-4247-8696-1dbe99dd66b6.

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
  "session_id": "99df803f-119c-45e5-9f1e-89417b1ab00f",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNTQsImlhdCI6MTc5MzI2NjM1NCwianRpIjoiNzVlYjNlZDgtY2M1Yy00MjJkLTg3ZWMtNTU2MTY1YzcyZGIzIiwic2lkIjoiOTlkZjgwM2YtMTE5Yy00NWU1LTlmMWUtODk0MTdiMWFiMDBmIn0.5iAAme2xuXLqwxKh8NavkVtDXrMhzJ41FwE5_uGYndM",
  "access_expires_at": "2026-10-29T09:47:34.34222154Z",
  "refresh_token": "DouFNllONYyFLdfPPUrouHACAyrL52Qcx6Tqb4u7Djc",
  "refresh_expires_at": "2026-10-29T21:32:34.341672895Z",
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
  "command_id": "158f8119-5d3e-4324-8458-e5e75d1f0243",
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
  "timestamp": "2026-10-29T09:32:35.000+0000",
  "channel": {
    "id": "1730052000.2090124102",
    "linkedid": "1730052000.2090124102",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675087788"
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
  "timestamp": "2026-10-29T09:32:35.000+0000",
  "channel": {
    "id": "1730052000.2090124102",
    "linkedid": "1730052000.2090124102",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380675087788"
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
  "session_id": "edce425f-6d78-41c2-98ee-f0b356a537c5",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNTUsImlhdCI6MTc5MzI2NjM1NSwianRpIjoiOWZjZjVkN2ItMjk2MC00OTcyLWE3ZDktZmZmNmY2ZmQwNGVkIiwic2lkIjoiZWRjZTQyNWYtNmQ3OC00MWMyLTk4ZWUtZjBiMzU2YTUzN2M1In0.947DqBvxxWUtqFMZxiFV1-M6j57oY_FhPMa22JCoLTA",
  "access_expires_at": "2026-10-29T09:47:35.553938067Z",
  "refresh_token": "BfmS3zIyUCLGzUFvGyVIjjhoV9kf_e9gcSDa1SBoghI",
  "refresh_expires_at": "2026-10-29T21:32:35.553355581Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "58061db9-1430-4e99-b731-ed5690644d9b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380675087788",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T09:32:35Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/58061db9-1430-4e99-b731-ed5690644d9b/answer` → **200**

```json
{
  "command_id": "0dea02bf-f0b4-4c83-9a8d-52ad4d7165d4"
}
```

```json
{
  "id": "58061db9-1430-4e99-b731-ed5690644d9b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380675087788",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "order_ids": [],
  "started_at": "2026-10-29T09:32:35Z",
  "answered_at": "2026-10-29T09:32:36.131638Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.2090124102",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "36545ee7-ca3e-4ea3-a910-997e4a640253",
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
  "id": "91720899-892e-4d67-b0b0-4b0bf3cdbcd9",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:36.458074Z",
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
  "command_id": "c7f8d411-95f4-49da-b667-e1127df4da62",
  "quote_id": "91720899-892e-4d67-b0b0-4b0bf3cdbcd9",
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
    "phone": "+380675087788"
  },
  "call_id": "58061db9-1430-4e99-b731-ed5690644d9b"
}
```

```json
{
  "id": "e81d3c79-9e50-487f-8d8b-696cf741ab63",
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
  "created_at": "2026-10-29T09:32:36.753525Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675087788"
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
    "id": "1730052000.2090124102",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "58061db9-1430-4e99-b731-ed5690644d9b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380675087788",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [
        "e81d3c79-9e50-487f-8d8b-696cf741ab63"
      ],
      "started_at": "2026-10-29T09:32:35Z",
      "answered_at": "2026-10-29T09:32:36.131638Z",
      "ended_at": "2026-10-29T09:32:37.062115Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "ad50d306-bb8c-44dd-9a22-6a324d0d479d",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380679508016",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [],
      "started_at": "2026-10-29T09:30:15.745505Z",
      "answered_at": "2026-10-29T09:30:16.073192Z",
      "ended_at": "2026-10-29T09:30:16.392921Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:30:22.097109Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/e81d3c79-9e50-487f-8d8b-696cf741ab63` → **200**

```json
{
  "id": "e81d3c79-9e50-487f-8d8b-696cf741ab63",
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
  "created_at": "2026-10-29T09:32:36.753525Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675087788"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e81d3c79-9e50-487f-8d8b-696cf741ab63` → **200**

```json
{
  "id": "e81d3c79-9e50-487f-8d8b-696cf741ab63",
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
  "created_at": "2026-10-29T09:32:36.753525Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675087788"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e81d3c79-9e50-487f-8d8b-696cf741ab63/cancel` → **200**

```json
{
  "command_id": "dccb5176-6f67-44ad-a75b-a90a0cac45d6",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e81d3c79-9e50-487f-8d8b-696cf741ab63",
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
  "created_at": "2026-10-29T09:32:36.753525Z",
  "caller": {
    "name": "Caller",
    "phone": "+380675087788"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
    }
  },
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

Done: call 58061db9-1430-4e99-b731-ed5690644d9b with order e81d3c79-9e50-487f-8d8b-696cf741ab63.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-17888"
}
```

```json
{
  "challenge_id": "7795dcc7-873d-471b-89df-6541ecef9fa1",
  "expires_at": "2026-10-29T09:37:38.322192704Z",
  "resend_available_at": "2026-10-29T09:32:39.322192704Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "504026",
  "sent_at": "2026-10-29T09:32:38.324805594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7795dcc7-873d-471b-89df-6541ecef9fa1",
  "code": "504026",
  "device_ref": "sandbox-17888"
}
```

```json
{
  "session_id": "ac37f80d-155b-4df5-9bca-e093140beffc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzI1OCwiaWF0IjoxNzkzMjY2MzU4LCJqdGkiOiI1MjdjMGUzOC01NjYxLTQwMTktYmY2Yy02MWVkMmFkNzc0OTAiLCJzaWQiOiJhYzM3ZjgwZC0xNTViLTRkZjUtOWJjYS1lMDkzMTQwYmVmZmMifQ.3Re6PJbWOGJx1SeMSy-JiKGRJ2t3UrOwEeMfhJPPPGg",
  "access_expires_at": "2026-10-29T09:47:38.621703334Z",
  "refresh_token": "MYPv40vaiOakkCMvgmFDRDkkMnyj65-n3eiiBLLW1ug",
  "refresh_expires_at": "2026-11-28T09:32:38.621064709Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:25.989801Z",
  "last_location_at": "2026-10-29T09:32:25.989801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/handover` → **200**

```json
{
  "command_id": "46b4099a-193f-4970-898e-14795a273f6e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:25.989801Z",
  "last_location_at": "2026-10-29T09:32:25.989801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:39Z",
    "sequence": 1793266359452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:39.472007Z",
  "last_location_at": "2026-10-29T09:32:39.472007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667756391",
  "device_ref": "sandbox-21359"
}
```

```json
{
  "challenge_id": "161a29d8-5be0-468f-b98e-d11ad8dd3ffa",
  "expires_at": "2026-10-29T09:37:39.746308717Z",
  "resend_available_at": "2026-10-29T09:32:40.746308717Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667756391` → **200**

```json
{
  "phone": "+380667756391",
  "audience": "CLIENT",
  "code": "227228",
  "sent_at": "2026-10-29T09:32:39.748828256Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "161a29d8-5be0-468f-b98e-d11ad8dd3ffa",
  "code": "227228",
  "device_ref": "sandbox-21359"
}
```

```json
{
  "session_id": "8abc885e-bc52-4e94-b965-9b1b5809fc52",
  "subject": {
    "type": "CLIENT",
    "id": "5840b7e5-d95c-4713-8609-f02c3ee6feec"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1ODQwYjdlNS1kOTVjLTQ3MTMtODYwOS1mMDJjM2VlNmZlZWMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjYwLCJpYXQiOjE3OTMyNjYzNjAsImp0aSI6ImE1ZDg0MTAwLTllNWMtNDVlNi04ZTMwLWVjMmJiYjViOGFiZCIsInNpZCI6IjhhYmM4ODVlLWJjNTItNGU5NC1iOTY1LTliMWI1ODA5ZmM1MiJ9.83q-B2asRLbKETiijGgmckKujLHxuWFFxMHyLXb75Zc",
  "access_expires_at": "2026-10-29T09:47:40.056978572Z",
  "refresh_token": "Au5us9wQkoI-jUVeAGTJpZSCO6s2btiNQ-gINhxOlAw",
  "refresh_expires_at": "2026-11-28T09:32:40.056444654Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2f1a95ed-57ce-4a47-864a-c20ba7c0557f",
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
  "id": "2c06d3f7-bfd2-4172-8015-81ec677e4829",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:40.336672Z",
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
  "command_id": "a0d381f5-aee4-44d6-86d2-d92e1682c83a",
  "quote_id": "2c06d3f7-bfd2-4172-8015-81ec677e4829",
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
  "id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "5840b7e5-d95c-4713-8609-f02c3ee6feec",
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
  "created_at": "2026-10-29T09:32:40.630481Z",
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
    "id": "f4ed151b-4d03-43f1-b206-9f03b2a889c3",
    "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
    "expires_at": "2026-10-29T09:32:55.633357Z",
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

`POST /api/driver/v1/offers/f4ed151b-4d03-43f1-b206-9f03b2a889c3/accept` → **200**

```json
{
  "command_id": "b2250ead-d5d0-4093-9f36-bdd4e85bddf8"
}
```

```json
{
  "id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082",
  "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "b91b75aa-9de2-4ad2-b860-5e37e9884a47",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "b91b75aa-9de2-4ad2-b860-5e37e9884a47",
  "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
  "assignment_id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082",
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

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:41Z",
    "sequence": 1793266361726
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:41.74534Z",
  "last_location_at": "2026-10-29T09:32:41.74534Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/b91b75aa-9de2-4ad2-b860-5e37e9884a47/arrive` → **200**

```json
{
  "command_id": "3137ee95-61c9-41fd-a4f1-49c2565a3496",
  "expected_version": 0
}
```

```json
{
  "id": "b91b75aa-9de2-4ad2-b860-5e37e9884a47",
  "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
  "assignment_id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082",
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
  "arrived_at": "2026-10-29T09:32:42.024305Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/b91b75aa-9de2-4ad2-b860-5e37e9884a47/start` → **200**

```json
{
  "command_id": "69e9a74a-86bf-4780-920b-683d9cc50421",
  "expected_version": 1
}
```

```json
{
  "id": "b91b75aa-9de2-4ad2-b860-5e37e9884a47",
  "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
  "assignment_id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082",
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
  "arrived_at": "2026-10-29T09:32:42.024305Z",
  "started_at": "2026-10-29T09:32:42.325518Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:42Z",
    "sequence": 1793266362599
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:42.619476Z",
  "last_location_at": "2026-10-29T09:32:42.619476Z",
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
  "device_ref": "sandbox-32365"
}
```

```json
{
  "challenge_id": "c58ca456-7972-486c-ae4d-85523e6ccac7",
  "expires_at": "2026-10-29T09:37:42.912657073Z",
  "resend_available_at": "2026-10-29T09:32:43.912657073Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "446902",
  "sent_at": "2026-10-29T09:32:42.916150137Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c58ca456-7972-486c-ae4d-85523e6ccac7",
  "code": "446902",
  "device_ref": "sandbox-32365"
}
```

```json
{
  "session_id": "00e37d93-113e-4025-be81-6a7e0c0f23e9",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzI2MywiaWF0IjoxNzkzMjY2MzYzLCJqdGkiOiI4OTk4MjllMy1iMWE4LTQzYjMtYjBiNC0wMGM5NTcwMTM0YTAiLCJzaWQiOiIwMGUzN2Q5My0xMTNlLTQwMjUtYmU4MS02YTdlMGMwZjIzZTkifQ.FZz0y4lkFmPrV65BlC7YxU1a3flfJ_yqRNuhRuaAZnE",
  "access_expires_at": "2026-10-29T09:47:43.225339486Z",
  "refresh_token": "azqtIiSRQWq5kdyJbOrumiwPO9qBMhTuVmbIg37C764",
  "refresh_expires_at": "2026-11-28T09:32:43.224535732Z",
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
  "command_id": "036c67b1-fe98-453f-879f-bdaf7fef6309",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:43Z",
    "sequence": 1793266363781
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b928ce6f-555e-48b0-b0e9-81082ea2554b",
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
  "last_heartbeat_at": "2026-10-29T09:32:43.801075Z",
  "last_location_at": "2026-10-29T09:32:43.801075Z",
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
  "session_id": "739149c0-460b-4ec4-b090-45bec758af73",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNjQsImlhdCI6MTc5MzI2NjM2NCwianRpIjoiMDY4ODBiZmMtMzVjZS00ZTZjLWE4ZTEtNjM4NzJjZDFlZjViIiwic2lkIjoiNzM5MTQ5YzAtNDYwYi00ZWM0LWIwOTAtNDViZWM3NThhZjczIn0.MmLKJxvze0Ns_DPgx_470titREybapGucfehq6gMKMo",
  "access_expires_at": "2026-10-29T09:47:44.409334972Z",
  "refresh_token": "X5hAZUjBIfz8f1CeOoHfXo6SIbWgSLwnuisfuSLx8w4",
  "refresh_expires_at": "2026-10-29T21:32:44.408799136Z",
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
  "session_id": "d6339b34-0b3d-4c18-acc1-e663299d6884",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNjUsImlhdCI6MTc5MzI2NjM2NSwianRpIjoiMTE4OGZmYWQtMDA2MS00N2NmLTg5MjItY2Y5NmJlNTY5MmU2Iiwic2lkIjoiZDYzMzliMzQtMGIzZC00YzE4LWFjYzEtZTY2MzI5OWQ2ODg0In0.Zp_bhiKJds6LdKDLVn-QR3jbFxHqVSNzGnpemyjly9U",
  "access_expires_at": "2026-10-29T09:47:45.012223534Z",
  "refresh_token": "HaHPe3LsXC-ka-ZVekv2EPfUBg3p6QTTIVXyyFj5yIM",
  "refresh_expires_at": "2026-10-29T21:32:45.011677032Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0d2703aa-5f9b-4ae6-aede-50adaf2315bd` → **200**

```json
{
  "id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "5840b7e5-d95c-4713-8609-f02c3ee6feec",
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
    "id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082",
    "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "b91b75aa-9de2-4ad2-b860-5e37e9884a47",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T09:32:40.630481Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/0d2703aa-5f9b-4ae6-aede-50adaf2315bd/interrupt` → **200**

```json
{
  "command_id": "902a4fd9-e451-46b0-975d-fcb3079c52e1",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "5840b7e5-d95c-4713-8609-f02c3ee6feec",
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
      "id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082",
      "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "b91b75aa-9de2-4ad2-b860-5e37e9884a47",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T09:32:40.630481Z",
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
    "id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "5840b7e5-d95c-4713-8609-f02c3ee6feec",
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
    "id": "704f0730-321e-435b-8a53-c488a1f3f4e7",
    "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
    "expires_at": "2026-10-29T09:33:00.603928Z",
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

`POST /api/driver/v1/offers/704f0730-321e-435b-8a53-c488a1f3f4e7/accept` → **200**

```json
{
  "command_id": "a046da32-9d85-4dc4-8136-2ae9062fa439"
}
```

```json
{
  "id": "f1d8dc66-58e9-43fe-aa94-ede40050b54c",
  "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4526d8ce-c995-465a-a79a-df87e4eb808e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4526d8ce-c995-465a-a79a-df87e4eb808e",
  "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
  "assignment_id": "f1d8dc66-58e9-43fe-aa94-ede40050b54c",
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
  "session_id": "b928ce6f-555e-48b0-b0e9-81082ea2554b",
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
  "last_heartbeat_at": "2026-10-29T09:32:43.801075Z",
  "last_location_at": "2026-10-29T09:32:43.801075Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/b928ce6f-555e-48b0-b0e9-81082ea2554b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:47Z",
    "sequence": 1793266367351
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "b928ce6f-555e-48b0-b0e9-81082ea2554b",
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
  "last_heartbeat_at": "2026-10-29T09:32:47.054289Z",
  "last_location_at": "2026-10-29T09:32:47.054289Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4526d8ce-c995-465a-a79a-df87e4eb808e/arrive` → **200**

```json
{
  "command_id": "2008557f-831d-4cc2-b665-c2000cbfe5eb",
  "expected_version": 0
}
```

```json
{
  "id": "4526d8ce-c995-465a-a79a-df87e4eb808e",
  "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
  "assignment_id": "f1d8dc66-58e9-43fe-aa94-ede40050b54c",
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
  "arrived_at": "2026-10-29T09:32:47.343044Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4526d8ce-c995-465a-a79a-df87e4eb808e/start` → **200**

```json
{
  "command_id": "346862ef-cbea-4978-aabc-5026aef0f97b",
  "expected_version": 1
}
```

```json
{
  "id": "4526d8ce-c995-465a-a79a-df87e4eb808e",
  "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
  "assignment_id": "f1d8dc66-58e9-43fe-aa94-ede40050b54c",
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
  "arrived_at": "2026-10-29T09:32:47.343044Z",
  "started_at": "2026-10-29T09:32:47.630321Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4526d8ce-c995-465a-a79a-df87e4eb808e/complete` → **200**

```json
{
  "command_id": "1a97ba52-cb5d-482a-b75b-654e84d85614",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:32:47Z"
}
```

```json
{
  "id": "4526d8ce-c995-465a-a79a-df87e4eb808e",
  "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
  "assignment_id": "f1d8dc66-58e9-43fe-aa94-ede40050b54c",
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
  "arrived_at": "2026-10-29T09:32:47.343044Z",
  "started_at": "2026-10-29T09:32:47.630321Z",
  "completed_at": "2026-10-29T09:32:47.926826Z",
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
    "id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T09:32:45.59085Z",
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
    "id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T09:32:40.630481Z",
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
      "balance_minor": 61113,
      "debt_limit_minor": null,
      "blocked": false
    }
  ]
}
```

`GET /api/operator/v1/orders/0d2703aa-5f9b-4ae6-aede-50adaf2315bd/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T09:32:40.630998Z",
      "actor": {
        "type": "CLIENT",
        "id": "5840b7e5-d95c-4713-8609-f02c3ee6feec",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
        "quote_id": "2c06d3f7-bfd2-4172-8015-81ec677e4829",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "4c6f2aae-f4b3-4faf-8fa8-045fed426f99"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T09:32:40.632687Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
        "attempt_id": "fd989556-ad24-4333-ba7c-5a51e3eeabb5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "4c6f2aae-f4b3-4faf-8fa8-045fed426f99"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T09:32:40.635209Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "f4ed151b-4d03-43f1-b206-9f03b2a889c3",
        "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "4c6f2aae-f4b3-4faf-8fa8-045fed426f99"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T09:32:41.191939Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "f4ed151b-4d03-43f1-b206-9f03b2a889c3",
        "order_id": "0d2703aa-5f9b-4ae6-aede-50adaf2315bd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "ccd583ce-bb5d-446a-9d12-4ce44d9a0082"
      },
      "correlation_id": "9e31cbec-938f-46cb-be7d-c74142beb28c"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/effb7066-9c1f-4527-8102-6d4a2a70bbdd/tip` → **200**

```json
{
  "order_id": "effb7066-9c1f-4527-8102-6d4a2a70bbdd",
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
  "available_until": "2026-10-30T09:32:47.926826Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/effb7066-9c1f-4527-8102-6d4a2a70bbdd/tip` → **409**

```json
{
  "command_id": "a67b1fb1-f241-454c-8d23-1725ba1b1d8d",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/effb7066-9c1f-4527-8102-6d4a2a70bbdd/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1687117b-ef04-4d35-95fb-5ef5af843eab"
}
```

Done: interrupted 0d2703aa-5f9b-4ae6-aede-50adaf2315bd, follow-up effb7066-9c1f-4527-8102-6d4a2a70bbdd.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e76d3ded-6b8a-4ed6-b448-164513581181",
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
  "last_heartbeat_at": "2026-10-29T09:32:42.619476Z",
  "last_location_at": "2026-10-29T09:32:42.619476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e76d3ded-6b8a-4ed6-b448-164513581181/close` → **200**

```json
{
  "command_id": "d172c38b-2e49-47e4-a95a-a4be6af61aec",
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
  "session_id": "b928ce6f-555e-48b0-b0e9-81082ea2554b",
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
  "last_heartbeat_at": "2026-10-29T09:32:47.054289Z",
  "last_location_at": "2026-10-29T09:32:47.054289Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b928ce6f-555e-48b0-b0e9-81082ea2554b/close` → **200**

```json
{
  "command_id": "1740454e-009f-4652-aa03-0b9de01bcfe3",
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
  "session_id": "6379fb4f-0deb-4c9f-af48-cae07e5f5b01",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyNzQsImlhdCI6MTc5MzI2NjM3NCwianRpIjoiYzU3NTAwODAtNmRhMS00MmM1LWE3OTYtZjNhZWRmYzc3OGYyIiwic2lkIjoiNjM3OWZiNGYtMGRlYi00YzlmLWFmNDgtY2FlMDdlNWY1YjAxIn0.NMztAk7oN9L2Gj5wYEzTFtqZmIvzuk_3obOr4O-yhL0",
  "access_expires_at": "2026-10-29T09:47:54.100907678Z",
  "refresh_token": "iqc56dUj5jNTFrJSJd9UwU4F75M6LWkq8RykrwGwyj4",
  "refresh_expires_at": "2026-10-29T21:32:54.100321997Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2fada10a-3592-45c6-a911-84c5f177a02c",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:32:54Z"
}
```

```json
{
  "id": "d96a45e3-7d29-4c3b-9703-3173bef52041",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:32:54Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d96a45e3-7d29-4c3b-9703-3173bef52041/publish` → **200**

```json
{
  "command_id": "8e52044a-b112-480a-bb8d-a30e7bf0b36b",
  "expected_version": 0
}
```

```json
{
  "id": "d96a45e3-7d29-4c3b-9703-3173bef52041",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:32:54.70441Z",
  "published_at": "2026-10-29T09:32:54.70441Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "d96a45e3-7d29-4c3b-9703-3173bef52041",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T09:32:54.70441Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634904643",
  "device_ref": "sandbox-21486"
}
```

```json
{
  "challenge_id": "e1bed791-a3e5-4f1f-80a8-f8b862be7c7f",
  "expires_at": "2026-10-29T09:37:55.259357686Z",
  "resend_available_at": "2026-10-29T09:32:56.259357686Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634904643` → **200**

```json
{
  "phone": "+380634904643",
  "audience": "CLIENT",
  "code": "259155",
  "sent_at": "2026-10-29T09:32:55.261812628Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1bed791-a3e5-4f1f-80a8-f8b862be7c7f",
  "code": "259155",
  "device_ref": "sandbox-21486"
}
```

```json
{
  "session_id": "59f1f792-accd-42e5-805d-cfa3b29b8143",
  "subject": {
    "type": "CLIENT",
    "id": "fb283392-7ccc-4fdf-beba-8a8df353633e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYjI4MzM5Mi03Y2NjLTRmZGYtYmViYS04YThkZjM1MzYzM2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3Mjc1LCJpYXQiOjE3OTMyNjYzNzUsImp0aSI6ImU0NGEzZGJjLTQyOGMtNDIyYS05ZGUwLWJlNDc0ZWJkNzJmNiIsInNpZCI6IjU5ZjFmNzkyLWFjY2QtNDJlNS04MDVkLWNmYTNiMjliODE0MyJ9.HbubcEIhTgWoTE0sXNda1FhWBH81pUJYMln_nwVtYbg",
  "access_expires_at": "2026-10-29T09:47:55.566768534Z",
  "refresh_token": "FZciLtJZadtpiL-iLTJCz1-fA_iU17YowlE0sWURETI",
  "refresh_expires_at": "2026-11-28T09:32:55.566184936Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "d96a45e3-7d29-4c3b-9703-3173bef52041",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T09:32:54.70441Z",
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
  "command_id": "35c47955-9e46-49a9-8440-2b4b2bee6eeb",
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
  "id": "d965f977-199c-415d-a925-c0b0cfe8b8bb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:56.124653Z",
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
  "command_id": "bedc1bef-1c6a-46ad-801a-6232d77af333",
  "quote_id": "d965f977-199c-415d-a925-c0b0cfe8b8bb",
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
  "correlation_id": "5748ea4d-d811-489a-a179-8e1a52b72656"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "c7bbc763-d07a-4811-9ab2-e73ea7fe214a",
  "version_id": "d96a45e3-7d29-4c3b-9703-3173bef52041",
  "language": "uk"
}
```

```json
{
  "version_id": "d96a45e3-7d29-4c3b-9703-3173bef52041",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T09:32:56.71429Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "fe7cbc1c-f0b3-4d8c-9918-6b0bea8c91bc",
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
  "id": "438b7872-f784-42e4-8bbc-6078a30c65e8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:37:57.003926Z",
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
  "command_id": "86ea48f9-756b-4693-b02d-4948e44500c1",
  "quote_id": "438b7872-f784-42e4-8bbc-6078a30c65e8",
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
  "id": "161c43b0-f3fc-49ce-b50d-742c4fc9079a",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fb283392-7ccc-4fdf-beba-8a8df353633e",
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
  "created_at": "2026-10-29T09:32:57.303537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/161c43b0-f3fc-49ce-b50d-742c4fc9079a` → **200**

```json
{
  "id": "161c43b0-f3fc-49ce-b50d-742c4fc9079a",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fb283392-7ccc-4fdf-beba-8a8df353633e",
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
  "created_at": "2026-10-29T09:32:57.303537Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/161c43b0-f3fc-49ce-b50d-742c4fc9079a/cancel` → **200**

```json
{
  "command_id": "61d61915-cb24-4667-a671-03354a4598a1",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "161c43b0-f3fc-49ce-b50d-742c4fc9079a",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fb283392-7ccc-4fdf-beba-8a8df353633e",
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
  "created_at": "2026-10-29T09:32:57.303537Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`POST /api/admin/v1/legal-documents/d96a45e3-7d29-4c3b-9703-3173bef52041` → **409**

```json
{
  "command_id": "46b3c5fe-c487-4857-8d58-f101fa821dcc",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T09:32:58Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/d96a45e3-7d29-4c3b-9703-3173bef52041",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7b472e31-e28d-4afd-8fe4-6d755bddb729"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "dac31887-c12a-4c48-a753-e93b3b6aff60",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:32:58Z"
}
```

```json
{
  "id": "36e413a3-bdbd-4390-afae-941c2e885560",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:32:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/36e413a3-bdbd-4390-afae-941c2e885560/publish` → **200**

```json
{
  "command_id": "b6127f3e-bb6c-4c8e-9c2f-640c2ffc5b37",
  "expected_version": 0
}
```

```json
{
  "id": "36e413a3-bdbd-4390-afae-941c2e885560",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T09:32:58.760155Z",
  "published_at": "2026-10-29T09:32:58.760155Z",
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
  "device_ref": "sandbox-28169"
}
```

```json
{
  "challenge_id": "4cd1ce5c-9fcb-48b4-b14e-6c01a6b8d0ff",
  "expires_at": "2026-10-29T09:37:59.047956827Z",
  "resend_available_at": "2026-10-29T09:33:00.047956827Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "406886",
  "sent_at": "2026-10-29T09:32:59.050231589Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4cd1ce5c-9fcb-48b4-b14e-6c01a6b8d0ff",
  "code": "406886",
  "device_ref": "sandbox-28169"
}
```

```json
{
  "session_id": "0334f5cf-5a6d-4b14-af84-04005191ab67",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzI3OSwiaWF0IjoxNzkzMjY2Mzc5LCJqdGkiOiIyYWE1OGJlYS00MDJjLTRiMGMtOTNiNS1mNjFkY2VkYjYzNTAiLCJzaWQiOiIwMzM0ZjVjZi01YTZkLTRiMTQtYWY4NC0wNDAwNTE5MWFiNjcifQ.drTbKpb-DJ73g-N9QbPxcqF2YZFPuqRx0sa-cOlbZSw",
  "access_expires_at": "2026-10-29T09:47:59.352135279Z",
  "refresh_token": "5c9qpbCCNBWhRA0JsBapA32eIcbudmzDRX9D2BH_5qU",
  "refresh_expires_at": "2026-11-28T09:32:59.351555427Z",
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
  "command_id": "00e6c35f-a7d6-45a6-a8c8-94e810eb5a77",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:32:59Z",
    "sequence": 1793266379893
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b29f077-369f-4bba-bd3b-a19e6322ae90",
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
  "last_heartbeat_at": "2026-10-29T09:32:59.913187Z",
  "last_location_at": "2026-10-29T09:32:59.913187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675074433",
  "device_ref": "sandbox-29132"
}
```

```json
{
  "challenge_id": "91998699-7855-491f-80da-9ef18bfbe212",
  "expires_at": "2026-10-29T09:38:00.187436887Z",
  "resend_available_at": "2026-10-29T09:33:01.187436887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675074433` → **200**

```json
{
  "phone": "+380675074433",
  "audience": "CLIENT",
  "code": "171990",
  "sent_at": "2026-10-29T09:33:00.189800472Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "91998699-7855-491f-80da-9ef18bfbe212",
  "code": "171990",
  "device_ref": "sandbox-29132"
}
```

```json
{
  "session_id": "e75dc68d-e321-4cd8-9341-46bb2025f4d2",
  "subject": {
    "type": "CLIENT",
    "id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGE4NWRlNS1mN2Q5LTRkNTAtYTBkNy1jNDY0ZDZlOTQ3ZDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MjgwLCJpYXQiOjE3OTMyNjYzODAsImp0aSI6ImZiY2E4NGQ0LTcwY2YtNDQ2MC04NDFkLWZmNTAxZTFlNWM3OSIsInNpZCI6ImU3NWRjNjhkLWUzMjEtNGNkOC05MzQxLTQ2YmIyMDI1ZjRkMiJ9.vdWzu9YTQ62J2wMbTt5N0wvEwXmwCDZw2hc3tXTM6iE",
  "access_expires_at": "2026-10-29T09:48:00.48712188Z",
  "refresh_token": "K8JKCsQtLrxTJ0ZypzTQ9CqvFRyFOdIte6nVwMzdhkE",
  "refresh_expires_at": "2026-11-28T09:33:00.486588743Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ea4b2a6-9bf5-4300-bb47-80e27a2d09bc",
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
  "id": "8091ae52-9565-4576-babf-1c0023ee1057",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:00.774051Z",
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
  "command_id": "d2667afd-eb9c-4747-ab95-45b386daf461",
  "quote_id": "8091ae52-9565-4576-babf-1c0023ee1057",
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
    "phone": "+380671852535"
  }
}
```

```json
{
  "id": "fdbd2599-ab49-4523-b636-93294573e431",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:01.052871Z",
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
    "id": "37f83ea6-f4e9-401e-ba25-691b79cc969c",
    "order_id": "fdbd2599-ab49-4523-b636-93294573e431",
    "expires_at": "2026-10-29T09:33:16.055961Z",
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

`POST /api/driver/v1/offers/37f83ea6-f4e9-401e-ba25-691b79cc969c/accept` → **200**

```json
{
  "command_id": "5c4a9f73-79db-427b-8746-a8b0c8284771"
}
```

```json
{
  "id": "f558d3d7-058f-44d0-9c47-7d47da5936c7",
  "order_id": "fdbd2599-ab49-4523-b636-93294573e431",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6c33164d-437a-4aa2-9a1e-bb9a0ea38944",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6c33164d-437a-4aa2-9a1e-bb9a0ea38944",
  "order_id": "fdbd2599-ab49-4523-b636-93294573e431",
  "assignment_id": "f558d3d7-058f-44d0-9c47-7d47da5936c7",
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
    "phone": "+380671852535"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "063dcaaf-046b-49e4-98c7-c557ab9047b6",
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
  "id": "6c7624c4-491c-41d0-abf8-619e0f8f5fcb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:02.186633Z",
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
  "command_id": "abc0c7a5-dcb9-4f19-93d4-ab0bd9ee5d8b",
  "quote_id": "6c7624c4-491c-41d0-abf8-619e0f8f5fcb",
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
  "id": "edfde3e3-c5d1-41eb-afcd-10bd01c9f227",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:02.482446Z",
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
  "command_id": "03ebeb30-b625-4508-b219-d2f5fefdc00d",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T12:33:02Z"
}
```

```json
{
  "id": "4540242d-319a-4673-8589-4b202047894c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:02.787248Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T12:33:02Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "065b2b58-fcd4-4f01-9590-5e79149cd0ba",
  "quote_id": "4540242d-319a-4673-8589-4b202047894c",
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
  "pickup_at": "2026-10-29T12:33:02Z"
}
```

```json
{
  "id": "4f6444cb-866d-43ec-8f45-cfd5714e447f",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:03.08414Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:33:02Z",
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
  "command_id": "64e4594f-336e-457d-9f87-a45ddf5aca97",
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
  "id": "81693976-96a7-4dde-8890-fff2add7531a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:03.405247Z",
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
  "command_id": "cc73730c-e796-459c-989d-d1578bca2405",
  "quote_id": "81693976-96a7-4dde-8890-fff2add7531a",
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
  "correlation_id": "cdb09f6b-e016-4f50-b85d-1989ae2a02ca"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "4f6444cb-866d-43ec-8f45-cfd5714e447f",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
      "created_at": "2026-10-29T09:33:03.08414Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T12:33:02Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "edfde3e3-c5d1-41eb-afcd-10bd01c9f227",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
      "created_at": "2026-10-29T09:33:02.482446Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "fdbd2599-ab49-4523-b636-93294573e431",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "edfde3e3-c5d1-41eb-afcd-10bd01c9f227",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:02.482446Z",
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

`GET /api/rider/v1/orders/fdbd2599-ab49-4523-b636-93294573e431` → **200**

```json
{
  "id": "fdbd2599-ab49-4523-b636-93294573e431",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
    "id": "f558d3d7-058f-44d0-9c47-7d47da5936c7",
    "order_id": "fdbd2599-ab49-4523-b636-93294573e431",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6c33164d-437a-4aa2-9a1e-bb9a0ea38944",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T09:33:01.052871Z",
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
    "location_at": "2026-10-29T09:32:59.913187Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/fdbd2599-ab49-4523-b636-93294573e431/cancel` → **200**

```json
{
  "command_id": "1a346c75-b484-4d83-ba4b-e2c0bdf209c7",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "fdbd2599-ab49-4523-b636-93294573e431",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
    "id": "f558d3d7-058f-44d0-9c47-7d47da5936c7",
    "order_id": "fdbd2599-ab49-4523-b636-93294573e431",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6c33164d-437a-4aa2-9a1e-bb9a0ea38944",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T09:33:01.052871Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`GET /api/rider/v1/orders/edfde3e3-c5d1-41eb-afcd-10bd01c9f227` → **200**

```json
{
  "id": "edfde3e3-c5d1-41eb-afcd-10bd01c9f227",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:02.482446Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/edfde3e3-c5d1-41eb-afcd-10bd01c9f227/cancel` → **200**

```json
{
  "command_id": "71ca776a-ebf0-49d6-a978-0da4e2031dd8",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "edfde3e3-c5d1-41eb-afcd-10bd01c9f227",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:02.482446Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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

`GET /api/rider/v1/orders/4f6444cb-866d-43ec-8f45-cfd5714e447f` → **200**

```json
{
  "id": "4f6444cb-866d-43ec-8f45-cfd5714e447f",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:03.08414Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:33:02Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/4f6444cb-866d-43ec-8f45-cfd5714e447f/cancel` → **200**

```json
{
  "command_id": "a23821b8-e050-4555-90ae-a2c61c0281d9",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "4f6444cb-866d-43ec-8f45-cfd5714e447f",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ada85de5-f7d9-4d50-a0d7-c464d6e947d7",
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
  "created_at": "2026-10-29T09:33:03.08414Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
    }
  },
  "pickup_at": "2026-10-29T12:33:02Z",
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
  "session_id": "5b29f077-369f-4bba-bd3b-a19e6322ae90",
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
  "last_heartbeat_at": "2026-10-29T09:32:59.913187Z",
  "last_location_at": "2026-10-29T09:32:59.913187Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b29f077-369f-4bba-bd3b-a19e6322ae90/close` → **200**

```json
{
  "command_id": "dd5ead3c-1f22-447e-aeeb-b62f2cf3545f",
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

Done: orders fdbd2599-ab49-4523-b636-93294573e431, edfde3e3-c5d1-41eb-afcd-10bd01c9f227, 4f6444cb-866d-43ec-8f45-cfd5714e447f.

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
  "session_id": "9863af2d-9863-4729-87d3-e93d085e2430",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyODcsImlhdCI6MTc5MzI2NjM4NywianRpIjoiYzJiOTU0MGMtOWI5Zi00YjJlLWEyNzktZDA5NTIyNmY5Y2M0Iiwic2lkIjoiOTg2M2FmMmQtOTg2My00NzI5LTg3ZDMtZTkzZDA4NWUyNDMwIn0.z6-EOvKphYj7ZjX0C1lXRkXT0S6NMGqZm3y6ZQnSrao",
  "access_expires_at": "2026-10-29T09:48:07.209970849Z",
  "refresh_token": "vPupXm70i4OmyYWXm-XM56rDiwwXvU1cL4XVcOeQHqo",
  "refresh_expires_at": "2026-10-29T21:33:07.209443245Z",
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
  "session_id": "41e2e5e5-4ed1-4dce-882a-653c36381b0a",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjcyODcsImlhdCI6MTc5MzI2NjM4NywianRpIjoiOGU1NGQxZmYtMDQzYS00YzQ0LWJkMjYtYzg2NTQ4ZTgwZjA4Iiwic2lkIjoiNDFlMmU1ZTUtNGVkMS00ZGNlLTg4MmEtNjUzYzM2MzgxYjBhIn0.ELnRYeLYkbs0B4x_imSbqHJPhcw7ikW4wFt3LXX3jFs",
  "access_expires_at": "2026-10-29T09:48:07.827127512Z",
  "refresh_token": "kOLXLMlZ8fji82Vjcjgcf2abeWC2NFHO_y9amQlyq-c",
  "refresh_expires_at": "2026-10-29T21:33:07.82664107Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29318"
}
```

```json
{
  "challenge_id": "80020c58-fc8a-4c93-8600-4aceef8a417b",
  "expires_at": "2026-10-29T09:38:08.098078973Z",
  "resend_available_at": "2026-10-29T09:33:09.098078973Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "734184",
  "sent_at": "2026-10-29T09:33:08.100591833Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80020c58-fc8a-4c93-8600-4aceef8a417b",
  "code": "734184",
  "device_ref": "sandbox-29318"
}
```

```json
{
  "session_id": "2f2302f2-3754-4714-af89-a50027a6a091",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzI4OCwiaWF0IjoxNzkzMjY2Mzg4LCJqdGkiOiIyODlkZmI0NS02YTc5LTQ4MzktOWUyZS1mZmY0NDFjZjg1ZDgiLCJzaWQiOiIyZjIzMDJmMi0zNzU0LTQ3MTQtYWY4OS1hNTAwMjdhNmEwOTEifQ.JTiyTAMlBI7FpMGxuV61fbKsF23P9veyU0FxBWMUefc",
  "access_expires_at": "2026-10-29T09:48:08.422296233Z",
  "refresh_token": "udkRclQdnV9iqSsO6PKojGg41v5zgrNbs__y1vJeICo",
  "refresh_expires_at": "2026-11-28T09:33:08.421797613Z",
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
  "command_id": "a46c9ac3-4c7f-4911-9abd-503e7d626156",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:33:08Z",
    "sequence": 1793266388966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa963e52-f5c2-4657-8022-29fcd51b0d29",
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
  "last_heartbeat_at": "2026-10-29T09:33:08.985483Z",
  "last_location_at": "2026-10-29T09:33:08.985483Z",
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
  "command_id": "b65dec88-b97b-48f8-9011-7cfa2c9a8d53",
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
  "effective_at": "2026-10-29T09:33:09.562562Z",
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T09:30:32.706194Z",
  "last_entries": [
    {
      "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T09:30:32.706194Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "39d12db0-d4ba-4958-94fa-3216135c7fc1",
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
  "id": "80f79a5d-f114-4e1a-9b9b-3714b6802564",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:10.131505Z",
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
  "command_id": "e89ed444-9497-4c06-8103-50e769cd4d40",
  "quote_id": "80f79a5d-f114-4e1a-9b9b-3714b6802564",
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
    "phone": "+3806711113079"
  }
}
```

```json
{
  "id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
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
  "created_at": "2026-10-29T09:33:10.446294Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113079"
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
    "id": "606c18a6-ddce-44dc-8738-a0b0c9d35b3a",
    "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
    "expires_at": "2026-10-29T09:33:25.449899Z",
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

`POST /api/driver/v1/offers/606c18a6-ddce-44dc-8738-a0b0c9d35b3a/accept` → **200**

```json
{
  "command_id": "89833ac4-c436-49b6-9d99-26d7617292bc"
}
```

```json
{
  "id": "a42fe9d5-4414-455c-acd4-5b5b07e063bb",
  "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a463ed39-487e-4a74-8329-dc4d633f0902",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a463ed39-487e-4a74-8329-dc4d633f0902",
  "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
  "assignment_id": "a42fe9d5-4414-455c-acd4-5b5b07e063bb",
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
    "phone": "+3806711113079"
  }
}
```

`POST /api/driver/v1/work-sessions/fa963e52-f5c2-4657-8022-29fcd51b0d29/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:33:11Z",
    "sequence": 1793266391577
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa963e52-f5c2-4657-8022-29fcd51b0d29",
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
  "last_heartbeat_at": "2026-10-29T09:33:11.596476Z",
  "last_location_at": "2026-10-29T09:33:11.596476Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a463ed39-487e-4a74-8329-dc4d633f0902/arrive` → **200**

```json
{
  "command_id": "24eb7f06-3eeb-4c37-a84d-65185e510197",
  "expected_version": 0
}
```

```json
{
  "id": "a463ed39-487e-4a74-8329-dc4d633f0902",
  "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
  "assignment_id": "a42fe9d5-4414-455c-acd4-5b5b07e063bb",
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
  "arrived_at": "2026-10-29T09:33:11.880424Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113079"
  }
}
```

`POST /api/driver/v1/trips/a463ed39-487e-4a74-8329-dc4d633f0902/start` → **200**

```json
{
  "command_id": "cb26f267-f76d-4bbd-a39f-7b196b51ea28",
  "expected_version": 1
}
```

```json
{
  "id": "a463ed39-487e-4a74-8329-dc4d633f0902",
  "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
  "assignment_id": "a42fe9d5-4414-455c-acd4-5b5b07e063bb",
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
  "arrived_at": "2026-10-29T09:33:11.880424Z",
  "started_at": "2026-10-29T09:33:12.171723Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113079"
  }
}
```

`POST /api/driver/v1/trips/a463ed39-487e-4a74-8329-dc4d633f0902/complete` → **200**

```json
{
  "command_id": "daa9fbd2-9f7d-4c90-bf15-575183b9d192",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:33:12Z",
  "cash_received": true
}
```

```json
{
  "id": "a463ed39-487e-4a74-8329-dc4d633f0902",
  "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
  "assignment_id": "a42fe9d5-4414-455c-acd4-5b5b07e063bb",
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
  "arrived_at": "2026-10-29T09:33:11.880424Z",
  "started_at": "2026-10-29T09:33:12.171723Z",
  "completed_at": "2026-10-29T09:33:12.467957Z",
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
  "command_id": "8af40656-2c14-48cc-8d80-5a20c1ebca8d",
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
  "id": "e8946ee4-fdee-469f-b146-4bd3898c2078",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:12.760279Z",
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
  "command_id": "c8f3176a-0466-4f38-8c92-b4e799dbbf0d",
  "quote_id": "e8946ee4-fdee-469f-b146-4bd3898c2078",
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
    "phone": "+3806711123502"
  }
}
```

```json
{
  "id": "90a0abe1-0ed4-4804-9dcd-b21f7933f001",
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
  "created_at": "2026-10-29T09:33:13.045265Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123502"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/90a0abe1-0ed4-4804-9dcd-b21f7933f001` → **200**

```json
{
  "id": "90a0abe1-0ed4-4804-9dcd-b21f7933f001",
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
  "created_at": "2026-10-29T09:33:13.045265Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123502"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/90a0abe1-0ed4-4804-9dcd-b21f7933f001/cancel` → **200**

```json
{
  "command_id": "ad0fdc3d-e44f-4620-9d5c-8baf3ddae029",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "90a0abe1-0ed4-4804-9dcd-b21f7933f001",
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
  "created_at": "2026-10-29T09:33:13.045265Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711123502"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "OPERATOR_ERROR",
    "reason_labels": {
      "pl": "Błąd operatora",
      "uk": "Помилка оператора",
      "en": "Operator error",
      "ru": "Ошибка оператора"
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
  "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T09:30:32.706194Z",
  "last_entries": [
    {
      "order_id": "90a0abe1-0ed4-4804-9dcd-b21f7933f001",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T09:33:13.662547Z"
    },
    {
      "order_id": "644c7eff-39c3-44dd-b0f0-6c3482955794",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T09:33:12.47228Z"
    },
    {
      "order_id": "fb3cdc09-67ac-43a1-ae0e-55eec648333a",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T09:30:32.706194Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "fa963e52-f5c2-4657-8022-29fcd51b0d29",
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
  "last_heartbeat_at": "2026-10-29T09:33:11.596476Z",
  "last_location_at": "2026-10-29T09:33:11.596476Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/fa963e52-f5c2-4657-8022-29fcd51b0d29/close` → **200**

```json
{
  "command_id": "5c44c9ff-fe29-4100-8feb-e1fc6ac01ad3",
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

Done: operator bonus for fulfilled 644c7eff-39c3-44dd-b0f0-6c3482955794 and operator-fault cancellation 90a0abe1-0ed4-4804-9dcd-b21f7933f001.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676905493",
  "device_ref": "sandbox-27043"
}
```

```json
{
  "challenge_id": "ae54a84f-95c8-4bd8-b51d-2c5119af6f5f",
  "expires_at": "2026-10-29T09:38:18.037185431Z",
  "resend_available_at": "2026-10-29T09:33:19.037185431Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676905493` → **200**

```json
{
  "phone": "+380676905493",
  "audience": "CLIENT",
  "code": "797168",
  "sent_at": "2026-10-29T09:33:18.039499572Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678902751",
  "device_ref": "sandbox-855",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "5b3bbdcf-a860-4e7c-8aaf-b0379fdda84c",
  "expires_at": "2026-10-29T09:38:19.552695419Z",
  "resend_available_at": "2026-10-29T09:33:20.552695419Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678902751` → **200**

```json
{
  "phone": "+380678902751",
  "audience": "CLIENT",
  "code": "148598",
  "sent_at": "2026-10-29T09:33:19.554877441Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678902751",
  "device_ref": "sandbox-601",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "db409d05-293b-46c2-bce4-73ac35928585",
  "expires_at": "2026-10-29T09:38:21.05612186Z",
  "resend_available_at": "2026-10-29T09:33:22.05612186Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678902751` → **200**

```json
{
  "phone": "+380678902751",
  "audience": "CLIENT",
  "code": "207492",
  "sent_at": "2026-10-29T09:33:21.058972077Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676620000",
  "device_ref": "sandbox-792"
}
```

```json
{
  "challenge_id": "4b611dfc-d4fa-433a-be97-8656d1f581ee",
  "expires_at": "2026-10-29T09:38:22.570499184Z",
  "resend_available_at": "2026-10-29T09:33:23.570499184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676620000",
  "device_ref": "sandbox-2779"
}
```

```json
{
  "challenge_id": "f1b19da5-027f-43dd-a88f-b25b364c501c",
  "expires_at": "2026-10-29T09:38:24.06265491Z",
  "resend_available_at": "2026-10-29T09:33:25.06265491Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676620000` → **200**

```json
{
  "phone": "+380676620000",
  "audience": "CLIENT",
  "code": "836252",
  "sent_at": "2026-10-29T09:33:24.065372042Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676620000",
  "device_ref": "sandbox-26117",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "77a26c05-1f1b-4d96-8a63-a76672cf08cb",
  "expires_at": "2026-10-29T09:38:25.573081777Z",
  "resend_available_at": "2026-10-29T09:33:26.573081777Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676620000` → **200**

```json
{
  "phone": "+380676620000",
  "audience": "CLIENT",
  "code": "116364",
  "sent_at": "2026-10-29T09:33:25.575934115Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676620000",
  "device_ref": "sandbox-23055",
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
  "correlation_id": "7333ecca-af62-487e-aa8a-7b847d62a092",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000025114"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "721c4e38-baea-4433-aed4-dd7696d49e4b"
}
```

`GET /sandbox/v1/otp?phone=%2B442000025114` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120027687"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "36750d01-a039-4e9c-9f84-2976337b04d7"
}
```

`GET /sandbox/v1/otp?phone=%2B37120027687` → **404**

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
  "session_id": "afb664da-34af-4f45-8b17-9962295a172f",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczMDgsImlhdCI6MTc5MzI2NjQwOCwianRpIjoiOTVlYzllMzAtMDZiNC00ZTMzLWJmYWItNzM1YzhkMTBmYThkIiwic2lkIjoiYWZiNjY0ZGEtMzRhZi00ZjQ1LThiMTctOTk2MjI5NWExNzJmIn0.LdJVpAcL4KMLczZwkRsMmx7w3qoCYipJmfZ_yyNnMIY",
  "access_expires_at": "2026-10-29T09:48:28.316080521Z",
  "refresh_token": "Yr4flswypSPzr8xfvITeGKZpDQN7FzUitxGIzdpDOXI",
  "refresh_expires_at": "2026-10-29T21:33:28.315564514Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676620000` → **200**

```json
{
  "deliveries": [
    {
      "id": "b6456f2b-a1b2-4a3f-874f-2f2148cfeba1",
      "challenge_id": "77a26c05-1f1b-4d96-8a63-a76672cf08cb",
      "phone": "+380676620000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f3fe9384-098e-44ef-88a2-ae7cc4a476b1",
      "error": null,
      "attempted_at": "2026-10-29T09:33:25.57622Z"
    },
    {
      "id": "66f297f2-3464-473c-ac61-fa4e2afca343",
      "challenge_id": "f1b19da5-027f-43dd-a88f-b25b364c501c",
      "phone": "+380676620000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-7ff548ff-b479-417f-a16b-350f48f9991d",
      "error": null,
      "attempted_at": "2026-10-29T09:33:24.06567Z"
    },
    {
      "id": "58af70f4-7d9f-4ddb-bef7-0d1cb3e54d6e",
      "challenge_id": "4b611dfc-d4fa-433a-be97-8656d1f581ee",
      "phone": "+380676620000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T09:33:22.572774Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676620000` → **200**

```json
{
  "phone": "+380676620000",
  "audience": "CLIENT",
  "code": "116364",
  "sent_at": "2026-10-29T09:33:25.575934115Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678902751` → **200**

```json
{
  "deliveries": [
    {
      "id": "7c5630dc-b8c5-4fda-b796-c10238726d72",
      "challenge_id": "db409d05-293b-46c2-bce4-73ac35928585",
      "phone": "+380678902751",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-55c7e302-e510-41a0-ab77-03f560c42120",
      "error": null,
      "attempted_at": "2026-10-29T09:33:21.059345Z"
    },
    {
      "id": "33b1ceb5-9555-497b-b5fd-908128fdd016",
      "challenge_id": "5b3bbdcf-a860-4e7c-8aaf-b0379fdda84c",
      "phone": "+380678902751",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-5eb44a01-f538-4d02-a37f-abb0075101ff",
      "error": null,
      "attempted_at": "2026-10-29T09:33:19.555185Z"
    }
  ]
}
```

Done: SMS to +380676905493; SMS then a call to +380678902751; a failed SMS, two calls and a refused third to +380676620000; +44 and +371 refused.

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
  "session_id": "1da313d4-ebe6-4d15-ae86-73593fced5ad",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczMDksImlhdCI6MTc5MzI2NjQwOSwianRpIjoiNDkyZDE2ODUtNDE5My00MDg0LWE0N2QtMmVhNDFhOWMxMjlmIiwic2lkIjoiMWRhMzEzZDQtZWJlNi00ZDE1LWFlODYtNzM1OTNmY2VkNWFkIn0.8NGhd7DS6ktD__HjRs-WL5ubLzy1jYcMjTvbs8AgXDU",
  "access_expires_at": "2026-10-29T09:48:29.555651069Z",
  "refresh_token": "B1k9IvCrVvRMbke2X6ISRInAs0a7CWXqT_nReRzLoqE",
  "refresh_expires_at": "2026-10-29T21:33:29.554921481Z",
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
  "session_id": "104b694b-5bb8-4692-98dc-1ac8ebb4e781",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczMTAsImlhdCI6MTc5MzI2NjQxMCwianRpIjoiYjMyYTEyN2YtOTE3Ni00MDUwLTllNzgtYzUxYzk2MDkyMDI0Iiwic2lkIjoiMTA0YjY5NGItNWJiOC00NjkyLTk4ZGMtMWFjOGViYjRlNzgxIn0.EY6Pv86X81yiS1GEMlg17unoWcJoL_cusQvZxzl6EyI",
  "access_expires_at": "2026-10-29T09:48:30.161471753Z",
  "refresh_token": "9RECzACIh0Xfkgi3hvTgX2jqhKNXj_6JlYEqZwkqhDc",
  "refresh_expires_at": "2026-10-29T21:33:30.160994916Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
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

`POST /api/admin/v1/staff-extensions/8fce279f-3832-4218-a097-1ba9e57f3caa` → **200**

```json
{
  "command_id": "efdc272d-0a3c-43ec-aa34-aaf0cdbb8be5",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "bb5d44ac-d8c1-4a4d-9bfd-d4d8117de620",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T09:33:31.285647Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T09:33:31.285647Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "bdd0500a-f137-46bb-abc5-5367dc81b9ba",
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
  "id": "c72fbb03-c1ee-45c3-b78c-b54c6042ee61",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:38:31.852647Z",
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
  "command_id": "259b4a42-0068-4b4f-9529-9f29f773c388",
  "quote_id": "c72fbb03-c1ee-45c3-b78c-b54c6042ee61",
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
    "phone": "+380671981130"
  }
}
```

```json
{
  "id": "ad723ded-df86-4df9-bfb9-0574159d6a13",
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
  "created_at": "2026-10-29T09:33:32.138759Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671981130"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/ad723ded-df86-4df9-bfb9-0574159d6a13/calls` → **201**

```json
{
  "command_id": "bd45c782-4a0b-4e0c-8611-38bc93a4bd56",
  "to": "CALLER"
}
```

```json
{
  "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "order_ids": [
    "ad723ded-df86-4df9-bfb9-0574159d6a13"
  ],
  "started_at": "2026-10-29T09:33:32.458116Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/ad723ded-df86-4df9-bfb9-0574159d6a13/calls` → **201**

```json
{
  "command_id": "bd45c782-4a0b-4e0c-8611-38bc93a4bd56",
  "to": "CALLER"
}
```

```json
{
  "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "order_ids": [
    "ad723ded-df86-4df9-bfb9-0574159d6a13"
  ],
  "started_at": "2026-10-29T09:33:32.458116Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671981130",
    "at": "2026-10-29T09:33:32.460918156Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.32092",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "bbd52612-08e9-401b-97e3-09feb9797bfe"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=ad723ded-df86-4df9-bfb9-0574159d6a13` → **200**

```json
{
  "calls": [
    {
      "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [
        "ad723ded-df86-4df9-bfb9-0574159d6a13"
      ],
      "started_at": "2026-10-29T09:33:32.458116Z",
      "answered_at": "2026-10-29T09:33:33.122532Z",
      "ended_at": "2026-10-29T09:33:33.146224Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ad723ded-df86-4df9-bfb9-0574159d6a13` → **200**

```json
{
  "calls": [
    {
      "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [
        "ad723ded-df86-4df9-bfb9-0574159d6a13"
      ],
      "started_at": "2026-10-29T09:33:32.458116Z",
      "answered_at": "2026-10-29T09:33:33.122532Z",
      "ended_at": "2026-10-29T09:33:33.146224Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ad723ded-df86-4df9-bfb9-0574159d6a13` → **200**

```json
{
  "calls": [
    {
      "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [
        "ad723ded-df86-4df9-bfb9-0574159d6a13"
      ],
      "started_at": "2026-10-29T09:33:32.458116Z",
      "answered_at": "2026-10-29T09:33:33.122532Z",
      "ended_at": "2026-10-29T09:33:33.146224Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ad723ded-df86-4df9-bfb9-0574159d6a13` → **200**

```json
{
  "calls": [
    {
      "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [
        "ad723ded-df86-4df9-bfb9-0574159d6a13"
      ],
      "started_at": "2026-10-29T09:33:32.458116Z",
      "answered_at": "2026-10-29T09:33:33.122532Z",
      "ended_at": "2026-10-29T09:33:33.146224Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=ad723ded-df86-4df9-bfb9-0574159d6a13` → **200**

```json
{
  "calls": [
    {
      "id": "bbd52612-08e9-401b-97e3-09feb9797bfe",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "order_ids": [
        "ad723ded-df86-4df9-bfb9-0574159d6a13"
      ],
      "started_at": "2026-10-29T09:33:32.458116Z",
      "answered_at": "2026-10-29T09:33:33.122532Z",
      "ended_at": "2026-10-29T09:33:33.146224Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T09:33:42.138193Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/ad723ded-df86-4df9-bfb9-0574159d6a13` → **200**

```json
{
  "id": "ad723ded-df86-4df9-bfb9-0574159d6a13",
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
  "created_at": "2026-10-29T09:33:32.138759Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671981130"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ad723ded-df86-4df9-bfb9-0574159d6a13/cancel` → **200**

```json
{
  "command_id": "2f3837ec-03ec-408c-9d2d-815edc507625",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "ad723ded-df86-4df9-bfb9-0574159d6a13",
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
  "created_at": "2026-10-29T09:33:32.138759Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671981130"
  },
  "cancellation": {
    "by": "STAFF",
    "reason_code": "NO_CARS",
    "reason_labels": {
      "pl": "Brak wolnych aut",
      "uk": "Немає вільних авто",
      "en": "No cars available",
      "ru": "Нет свободных машин"
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
  "command_id": "b8e72ad0-5a96-47d0-a251-3ec85a60ff0e",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T09:33:43.250986Z",
  "extension": "101"
}
```

Done: outgoing call bbd52612-08e9-401b-97e3-09feb9797bfe from order ad723ded-df86-4df9-bfb9-0574159d6a13, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639894694",
  "device_ref": "sandbox-9747"
}
```

```json
{
  "challenge_id": "a57ef9b6-1e99-4fa8-abea-4a4ad8331ada",
  "expires_at": "2026-10-29T09:38:43.545090749Z",
  "resend_available_at": "2026-10-29T09:33:44.545090749Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639894694` → **200**

```json
{
  "phone": "+380639894694",
  "audience": "CLIENT",
  "code": "877722",
  "sent_at": "2026-10-29T09:33:43.547524991Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a57ef9b6-1e99-4fa8-abea-4a4ad8331ada",
  "code": "877722",
  "device_ref": "sandbox-9747"
}
```

```json
{
  "session_id": "ae258c8b-5108-450a-9ac5-c1469db6c698",
  "subject": {
    "type": "CLIENT",
    "id": "459d3b08-d35f-4b8c-849f-c41ec713caaf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTlkM2IwOC1kMzVmLTRiOGMtODQ5Zi1jNDFlYzcxM2NhYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzIzLCJpYXQiOjE3OTMyNjY0MjMsImp0aSI6ImEzNWZjMDIxLWU2M2ItNDk3NC1hZmE4LWM5YzgxNmI0YmZhMCIsInNpZCI6ImFlMjU4YzhiLTUxMDgtNDUwYS05YWM1LWMxNDY5ZGI2YzY5OCJ9.8r4-uhTlTKtu-ouBcbrRt7Pbd-DOplHCFWVpi742g3U",
  "access_expires_at": "2026-10-29T09:48:43.862893747Z",
  "refresh_token": "mxpbXCpDi299eepInedPVkpHSds3F0yPtR38FTp469I",
  "refresh_expires_at": "2026-11-28T09:33:43.862382438Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
  "session_id": "ae258c8b-5108-450a-9ac5-c1469db6c698",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639894694",
  "device_ref": "sandbox-12691"
}
```

```json
{
  "challenge_id": "97ec3160-76f5-431d-a54e-8ad6a87c080e",
  "expires_at": "2026-10-29T09:38:46.412885968Z",
  "resend_available_at": "2026-10-29T09:33:47.412885968Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639894694` → **200**

```json
{
  "phone": "+380639894694",
  "audience": "CLIENT",
  "code": "595067",
  "sent_at": "2026-10-29T09:33:46.415153689Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "97ec3160-76f5-431d-a54e-8ad6a87c080e",
  "code": "595067",
  "device_ref": "sandbox-12691"
}
```

```json
{
  "session_id": "cfec75a4-8794-4bed-b747-f961c9d5c16f",
  "subject": {
    "type": "CLIENT",
    "id": "459d3b08-d35f-4b8c-849f-c41ec713caaf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTlkM2IwOC1kMzVmLTRiOGMtODQ5Zi1jNDFlYzcxM2NhYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzI2LCJpYXQiOjE3OTMyNjY0MjYsImp0aSI6ImY1ZmFmNjFiLTMwNjYtNDJmYy1hZjhjLWI2YWM3NzYyNTEwNiIsInNpZCI6ImNmZWM3NWE0LTg3OTQtNGJlZC1iNzQ3LWY5NjFjOWQ1YzE2ZiJ9.Rlcd2t_d3GK4k8DMFiiQBoGarwQf-E9GuBbP3QmxURU",
  "access_expires_at": "2026-10-29T09:48:46.728535912Z",
  "refresh_token": "l6h1FiJu1XcuDe4cV7Vpr_k8nRfQV79p6RQsXleORn0",
  "refresh_expires_at": "2026-11-28T09:33:46.728035779Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "c5ba036b-411a-417a-9157-a4be8b6ac43c",
  "expires_at": "2026-10-29T09:38:49.009858688Z",
  "resend_available_at": "2026-10-29T09:33:50.009858688Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639894694` → **200**

```json
{
  "phone": "+380639894694",
  "audience": "CLIENT",
  "code": "445879",
  "sent_at": "2026-10-29T09:33:49.012024828Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380634947456"
}
```

```json
{
  "challenge_id": "51546209-c0ab-45ba-94b8-b4958ea79cad",
  "expires_at": "2026-10-29T09:38:49.308351192Z",
  "resend_available_at": "2026-10-29T09:33:50.308351192Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634947456` → **200**

```json
{
  "phone": "+380634947456",
  "audience": "CLIENT",
  "code": "241102",
  "sent_at": "2026-10-29T09:33:49.31077601Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "45e18ae2-12a0-4479-bea2-f3cd53bba07b",
  "current_challenge_id": "c5ba036b-411a-417a-9157-a4be8b6ac43c",
  "current_code": "000000",
  "new_challenge_id": "51546209-c0ab-45ba-94b8-b4958ea79cad",
  "new_code": "241102"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "1d548ce0-6c89-400d-b959-60e43a3e1a25"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "acff4a7d-2fcb-4e9c-a1c2-ef71b841efc1",
  "current_challenge_id": "c5ba036b-411a-417a-9157-a4be8b6ac43c",
  "current_code": "445879",
  "new_challenge_id": "51546209-c0ab-45ba-94b8-b4958ea79cad",
  "new_code": "241102"
}
```

```json
{
  "subject_id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
  "phone": "+380634947456",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
  "session_id": "ae258c8b-5108-450a-9ac5-c1469db6c698",
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
  "correlation_id": "c64690d9-e7c4-4a02-b268-69c2036ad37f"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634947456",
  "device_ref": "sandbox-17182"
}
```

```json
{
  "challenge_id": "67187c25-0bf0-4ccd-a05b-52a43524218f",
  "expires_at": "2026-10-29T09:38:52.760123115Z",
  "resend_available_at": "2026-10-29T09:33:53.760123115Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634947456` → **200**

```json
{
  "phone": "+380634947456",
  "audience": "CLIENT",
  "code": "609096",
  "sent_at": "2026-10-29T09:33:52.762594167Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "67187c25-0bf0-4ccd-a05b-52a43524218f",
  "code": "609096",
  "device_ref": "sandbox-17182"
}
```

```json
{
  "session_id": "8072aa33-973d-419b-8d3a-6a52bef09e43",
  "subject": {
    "type": "CLIENT",
    "id": "459d3b08-d35f-4b8c-849f-c41ec713caaf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTlkM2IwOC1kMzVmLTRiOGMtODQ5Zi1jNDFlYzcxM2NhYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzMzLCJpYXQiOjE3OTMyNjY0MzMsImp0aSI6IjA0ZjM0MGUxLWNmNWItNDc2Zi1hYjg0LWI3Y2NiOTRkNDlkZSIsInNpZCI6IjgwNzJhYTMzLTk3M2QtNDE5Yi04ZDNhLTZhNTJiZWYwOWU0MyJ9.i0-Vu_xuuMBB4AGyJmNmr69StrPDypxBaR6LfDLNkTI",
  "access_expires_at": "2026-10-29T09:48:53.080437539Z",
  "refresh_token": "hcJZB1vgrNOljo2dcdCMB30ssTvQ7sxCwLQrdi1Elao",
  "refresh_expires_at": "2026-11-28T09:33:53.079946331Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
  "session_id": "8072aa33-973d-419b-8d3a-6a52bef09e43",
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
  "session_id": "3eef8750-439b-4118-b10e-c6caba5845d2",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczMzMsImlhdCI6MTc5MzI2NjQzMywianRpIjoiMTE2YjUxMjItYTI0MC00Y2RjLWIxMmYtZTJkNTlkMmY5YmEzIiwic2lkIjoiM2VlZjg3NTAtNDM5Yi00MTE4LWIxMGUtYzZjYWJhNTg0NWQyIn0.0WwzMYqYW-AK1LlVW8Vu1yZZ3IzR_TUFa3ppfDZxJAA",
  "access_expires_at": "2026-10-29T09:48:53.962632509Z",
  "refresh_token": "kyB9oY2JaWNuCzxpJOwWDJS3r20VoDYeF_-OXJGmfQQ",
  "refresh_expires_at": "2026-10-29T21:33:53.962138487Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf` → **200**

```json
{
  "client": {
    "id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
    "phone": "+380634947456",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T09:33:43.860916Z",
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

`POST /api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf/phone/new-code` → **201**

```json
{
  "phone": "+380639993704"
}
```

```json
{
  "challenge_id": "9afdaa92-38f2-4d95-9f6e-9b72ca76f47a",
  "expires_at": "2026-10-29T09:38:54.55770605Z",
  "resend_available_at": "2026-10-29T09:33:55.55770605Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380639993704` → **200**

```json
{
  "phone": "+380639993704",
  "audience": "CLIENT",
  "code": "550833",
  "sent_at": "2026-10-29T09:33:54.559954568Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf/phone` → **422**

```json
{
  "command_id": "cd673d9c-3892-44e2-a0cf-0f6fec3f6e55",
  "expected_version": 3,
  "new_challenge_id": "9afdaa92-38f2-4d95-9f6e-9b72ca76f47a",
  "new_code": "550834",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "f00d66a5-d859-4973-bda2-efaa386cd941"
}
```

`POST /api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf/phone` → **400**

```json
{
  "command_id": "69f6e331-397c-4200-94d7-0b76d14084ac",
  "expected_version": 3,
  "new_challenge_id": "9afdaa92-38f2-4d95-9f6e-9b72ca76f47a",
  "new_code": "550833",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "493fe4de-a6eb-4285-810b-9ea6a5b18a2e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/459d3b08-d35f-4b8c-849f-c41ec713caaf/phone` → **200**

```json
{
  "command_id": "66d68eef-ae9d-4e1a-9ba1-d64877ef7d44",
  "expected_version": 3,
  "new_challenge_id": "9afdaa92-38f2-4d95-9f6e-9b72ca76f47a",
  "new_code": "550833",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
  "phone": "+380639993704",
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
  "correlation_id": "11dfa46c-ae77-4d65-87b6-45fb20af1b91"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639993704",
  "device_ref": "sandbox-22487"
}
```

```json
{
  "challenge_id": "cf401f8d-17a6-43a2-930e-f3214f1fe3f3",
  "expires_at": "2026-10-29T09:38:56.008712195Z",
  "resend_available_at": "2026-10-29T09:33:57.008712195Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639993704` → **200**

```json
{
  "phone": "+380639993704",
  "audience": "CLIENT",
  "code": "955195",
  "sent_at": "2026-10-29T09:33:56.011205381Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cf401f8d-17a6-43a2-930e-f3214f1fe3f3",
  "code": "955195",
  "device_ref": "sandbox-22487"
}
```

```json
{
  "session_id": "11f3ec34-2ed9-41da-8ab8-1db27027f7eb",
  "subject": {
    "type": "CLIENT",
    "id": "459d3b08-d35f-4b8c-849f-c41ec713caaf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NTlkM2IwOC1kMzVmLTRiOGMtODQ5Zi1jNDFlYzcxM2NhYWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzM2LCJpYXQiOjE3OTMyNjY0MzYsImp0aSI6IjEzMmM5MjM3LTQzNmItNDkxMC1iNDllLTljY2QzMGI2MWE3OSIsInNpZCI6IjExZjNlYzM0LTJlZDktNDFkYS04YWI4LTFkYjI3MDI3ZjdlYiJ9.VmLVeNiYWCxb4S_YGMSVR4KOcc5EMZJ9EPgYU_7L4MI",
  "access_expires_at": "2026-10-29T09:48:56.317880978Z",
  "refresh_token": "Te-yZujjKuJ8BPVpebqvNkmuayUh3_X7N95uWIE6iQg",
  "refresh_expires_at": "2026-11-28T09:33:56.317381678Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "459d3b08-d35f-4b8c-849f-c41ec713caaf",
  "session_id": "11f3ec34-2ed9-41da-8ab8-1db27027f7eb",
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
  "phone": "+380638308310",
  "device_ref": "sandbox-9177"
}
```

```json
{
  "challenge_id": "f9f41e99-41bb-4060-a91b-a754b418052f",
  "expires_at": "2026-10-29T09:38:56.867033214Z",
  "resend_available_at": "2026-10-29T09:33:57.867033214Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638308310` → **200**

```json
{
  "phone": "+380638308310",
  "audience": "CLIENT",
  "code": "321692",
  "sent_at": "2026-10-29T09:33:56.869820909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9f41e99-41bb-4060-a91b-a754b418052f",
  "code": "321692",
  "device_ref": "sandbox-9177"
}
```

```json
{
  "session_id": "a19fbcfc-9971-478e-9f58-d6a1b18b442a",
  "subject": {
    "type": "CLIENT",
    "id": "7ba84561-2a20-4e6f-80c3-fc950771b674"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmE4NDU2MS0yYTIwLTRlNmYtODBjMy1mYzk1MDc3MWI2NzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzM3LCJpYXQiOjE3OTMyNjY0MzcsImp0aSI6IjdhZDczYTViLTRkYmUtNDQ3MS05MmZkLWU4ZTE3MGQ3YmE0ZSIsInNpZCI6ImExOWZiY2ZjLTk5NzEtNDc4ZS05ZjU4LWQ2YTFiMThiNDQyYSJ9.2MfYrQljuFrpBdSL73LYFGbUkxOT6oM2ZMeUVMvGs0Q",
  "access_expires_at": "2026-10-29T09:48:57.176558842Z",
  "refresh_token": "lUr2Q7eZwwKFlm3t3jJt2T2izGv_bYcSogIifqbQ5AU",
  "refresh_expires_at": "2026-11-28T09:33:57.176027079Z",
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
  "session_id": "74254875-897a-473e-8529-3134b25f1915",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczMzgsImlhdCI6MTc5MzI2NjQzOCwianRpIjoiMDM3OTIxM2UtNGY0OC00NDBiLTgxM2UtN2JiMmJmNTUyNGQ3Iiwic2lkIjoiNzQyNTQ4NzUtODk3YS00NzNlLTg1MjktMzEzNGIyNWYxOTE1In0.8oTln12Nh99GmbjT85UzhRmuxG5Mr4ItkzL8YLCcZSc",
  "access_expires_at": "2026-10-29T09:48:58.38064855Z",
  "refresh_token": "V7m2LB56jT0marutqZxdj2W1D-SjbEaxfi7EakIt9Ac",
  "refresh_expires_at": "2026-10-29T21:33:58.380108414Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380638308310` → **200**

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
  "correlation_id": "b9b3c962-a1c2-4c94-8a53-817b4361af29"
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
  "session_id": "6d207000-d52b-49d8-8a19-56fde1cb72e5",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczMzksImlhdCI6MTc5MzI2NjQzOSwianRpIjoiNGFkNzZhMGItZjYyOS00MGRmLWI4NTEtZjIxMmQ5NjcyZjAwIiwic2lkIjoiNmQyMDcwMDAtZDUyYi00OWQ4LThhMTktNTZmZGUxY2I3MmU1In0.LLiUkiGbB8lKeOld_JBjNsoZts_9XvxmzJHtmEHOro8",
  "access_expires_at": "2026-10-29T09:48:59.574934137Z",
  "refresh_token": "bkjH9gUL-d48Isdv2fPXv6LWvVnCTqjePs7yprW_Ou0",
  "refresh_expires_at": "2026-10-29T21:33:59.574327071Z",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T09:30:02.262154Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "af319c97-8b2f-4ceb-819a-459d6c52b3dc",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T09:34:00.136383835Z"
}
```

## The rider books the airport for 2026-10-29T12:33:59Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600797974",
  "device_ref": "sandbox-19136"
}
```

```json
{
  "challenge_id": "8419b4fb-2c9a-4594-9454-51e06c7673f8",
  "expires_at": "2026-10-29T09:39:00.423712518Z",
  "resend_available_at": "2026-10-29T09:34:01.423712518Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600797974` → **200**

```json
{
  "phone": "+48600797974",
  "audience": "CLIENT",
  "code": "281892",
  "sent_at": "2026-10-29T09:34:00.426171849Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8419b4fb-2c9a-4594-9454-51e06c7673f8",
  "code": "281892",
  "device_ref": "sandbox-19136"
}
```

```json
{
  "session_id": "ebb52dcb-77cc-4d31-b26a-5ed6b68a846d",
  "subject": {
    "type": "CLIENT",
    "id": "ce45435f-c616-4a0a-8d52-cb136c554cd2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZTQ1NDM1Zi1jNjE2LTRhMGEtOGQ1Mi1jYjEzNmM1NTRjZDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzQwLCJpYXQiOjE3OTMyNjY0NDAsImp0aSI6ImFiZjMxNmNhLWMyNDktNDNhOC1hODgyLWUzMzk0MDcyYzkyOSIsInNpZCI6ImViYjUyZGNiLTc3Y2MtNGQzMS1iMjZhLTVlZDZiNjhhODQ2ZCJ9.B1_BEUX2iu46QrnnGjLlT4K0l4UrZPEb8lLOp-BNeJs",
  "access_expires_at": "2026-10-29T09:49:00.734846077Z",
  "refresh_token": "c3FewjvYHAuuW9iyWjPqgJFh1m0l4A4cn6k-ny9aRjs",
  "refresh_expires_at": "2026-11-28T09:34:00.73435636Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "edab588d-9e7b-45cb-b4b2-03ac24dd8256",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T12:33:59Z"
}
```

```json
{
  "id": "f4f72f61-eee2-4dcf-8457-6e34aa82bc20",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:39:01.014392Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T12:33:59Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "56844206-12d4-4be9-8e24-98b0a9129e60",
  "quote_id": "f4f72f61-eee2-4dcf-8457-6e34aa82bc20",
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
  "pickup_at": "2026-10-29T12:33:59Z"
}
```

```json
{
  "id": "086b3334-5cd9-4a30-8f92-e5109672831b",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ce45435f-c616-4a0a-8d52-cb136c554cd2",
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
  "created_at": "2026-10-29T09:34:01.300792Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T12:33:59Z",
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
  "device_ref": "sandbox-26167"
}
```

```json
{
  "challenge_id": "5813d932-df1e-44d5-bffb-fa6bcfe1fa25",
  "expires_at": "2026-10-29T09:39:01.587727538Z",
  "resend_available_at": "2026-10-29T09:34:02.587727538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "170116",
  "sent_at": "2026-10-29T09:34:01.589997609Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5813d932-df1e-44d5-bffb-fa6bcfe1fa25",
  "code": "170116",
  "device_ref": "sandbox-26167"
}
```

```json
{
  "session_id": "66c69814-536e-4e37-8b43-296480ed6fb5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM0MSwiaWF0IjoxNzkzMjY2NDQxLCJqdGkiOiJlM2U4OWUwYi1jNTQ1LTQ5MjAtOTE2OC1kZTYwODVlZmRjODIiLCJzaWQiOiI2NmM2OTgxNC01MzZlLTRlMzctOGI0My0yOTY0ODBlZDZmYjUifQ.DQZtKkh7w6MlH9WDCU7lmoqMhQVvqNgtXdb9DZ8yxsY",
  "access_expires_at": "2026-10-29T09:49:01.886628147Z",
  "refresh_token": "VoOnfbR6X0kpiyN_7lTAiIRGh8u-2OwsUqeXxkeuFf4",
  "refresh_expires_at": "2026-11-28T09:34:01.886149357Z",
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
  "command_id": "57ebb08b-2a4c-4572-a8ad-3bb6a34eaf7e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:02Z",
    "sequence": 1793266442430
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ae20d840-68fd-4376-9c94-bc70177bbcdb",
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
  "last_heartbeat_at": "2026-10-29T09:34:02.450116Z",
  "last_location_at": "2026-10-29T09:34:02.450116Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "086b3334-5cd9-4a30-8f92-e5109672831b",
      "short_number": 24,
      "pickup_at": "2026-10-29T12:33:59Z",
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

`POST /api/driver/v1/preorders/086b3334-5cd9-4a30-8f92-e5109672831b/reserve` → **200**

```json
{
  "command_id": "fbb2ce22-2dfd-48b3-be81-e507c82e7127"
}
```

```json
{
  "id": "5403746a-68f0-46b9-89cb-117eb6e2d91c",
  "state": "RESERVED",
  "order": {
    "order_id": "086b3334-5cd9-4a30-8f92-e5109672831b",
    "short_number": 24,
    "pickup_at": "2026-10-29T12:33:59Z",
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
  "reserved_at": "2026-10-29T09:34:03.000378Z",
  "confirm_from": "2026-10-29T12:03:59Z",
  "confirm_until": "2026-10-29T12:13:59Z",
  "drop_until": "2026-10-29T11:33:59Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "5403746a-68f0-46b9-89cb-117eb6e2d91c",
      "state": "RESERVED",
      "order": {
        "order_id": "086b3334-5cd9-4a30-8f92-e5109672831b",
        "short_number": 24,
        "pickup_at": "2026-10-29T12:33:59Z",
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
      "reserved_at": "2026-10-29T09:34:03.000378Z",
      "confirm_from": "2026-10-29T12:03:59Z",
      "confirm_until": "2026-10-29T12:13:59Z",
      "drop_until": "2026-10-29T11:33:59Z"
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
      "id": "5403746a-68f0-46b9-89cb-117eb6e2d91c",
      "state": "RESERVED",
      "order": {
        "order_id": "086b3334-5cd9-4a30-8f92-e5109672831b",
        "short_number": 24,
        "pickup_at": "2026-10-29T12:33:59Z",
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
      "reserved_at": "2026-10-29T09:34:03.000378Z",
      "confirm_from": "2026-10-29T12:03:59Z",
      "confirm_until": "2026-10-29T12:13:59Z",
      "drop_until": "2026-10-29T11:33:59Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/5403746a-68f0-46b9-89cb-117eb6e2d91c/confirm` → **409**

```json
{
  "command_id": "5077ed3e-5056-4e36-8680-b44aaea8fb13"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/5403746a-68f0-46b9-89cb-117eb6e2d91c/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "cbbc4b73-f066-444c-9962-4f6891e5cdfc"
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
  "session_id": "df848e40-b834-465d-aaa6-a6793b80f132",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNDQsImlhdCI6MTc5MzI2NjQ0NCwianRpIjoiMTY3MjJjYzItYzI0ZS00MDU0LWFlZWEtMzE4MzhhNTk1YjE2Iiwic2lkIjoiZGY4NDhlNDAtYjgzNC00NjVkLWFhYTYtYTY3OTNiODBmMTMyIn0.etbRt7THS1bDwZsnTpIX2V-xud6bsy3gTmjbwUTpwW4",
  "access_expires_at": "2026-10-29T09:49:04.457745858Z",
  "refresh_token": "-AD7iVgs5Hhq9bGAnEGWiaRRd10Ye43drw8tPPfCpcI",
  "refresh_expires_at": "2026-10-29T21:34:04.457203703Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/086b3334-5cd9-4a30-8f92-e5109672831b` → **200**

```json
{
  "id": "086b3334-5cd9-4a30-8f92-e5109672831b",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ce45435f-c616-4a0a-8d52-cb136c554cd2",
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
  "created_at": "2026-10-29T09:34:01.300792Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T12:33:59Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "5403746a-68f0-46b9-89cb-117eb6e2d91c",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T09:34:03.000378Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/086b3334-5cd9-4a30-8f92-e5109672831b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T09:34:01.301975Z",
      "actor": {
        "type": "CLIENT",
        "id": "ce45435f-c616-4a0a-8d52-cb136c554cd2",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "086b3334-5cd9-4a30-8f92-e5109672831b",
        "preorder": true,
        "quote_id": "f4f72f61-eee2-4dcf-8457-6e34aa82bc20",
        "pickup_at": "2026-10-29T12:33:59Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "ded4cf1b-1ac3-45d4-85f9-14b2629aa3be"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T09:34:03.00158Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "086b3334-5cd9-4a30-8f92-e5109672831b",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "5403746a-68f0-46b9-89cb-117eb6e2d91c"
      },
      "correlation_id": "a7ad5edc-8e8d-436a-b0a9-6ca46c707a3a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 086b3334-5cd9-4a30-8f92-e5109672831b, reservation 5403746a-68f0-46b9-89cb-117eb6e2d91c.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-9047"
}
```

```json
{
  "challenge_id": "f9d26056-df6a-490e-ad65-c917c51467d2",
  "expires_at": "2026-10-29T09:39:05.313183959Z",
  "resend_available_at": "2026-10-29T09:34:06.313183959Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "492829",
  "sent_at": "2026-10-29T09:34:05.315732721Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f9d26056-df6a-490e-ad65-c917c51467d2",
  "code": "492829",
  "device_ref": "sandbox-9047"
}
```

```json
{
  "session_id": "233ded77-fa5d-4908-8bf9-7629767fc8a2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM0NSwiaWF0IjoxNzkzMjY2NDQ1LCJqdGkiOiJmZmI1MDM1NC00MjRiLTQ4MjgtYTFiMC01M2FkNTRmNjllNDMiLCJzaWQiOiIyMzNkZWQ3Ny1mYTVkLTQ5MDgtOGJmOS03NjI5NzY3ZmM4YTIifQ.PrngsJlQKazkKuzUQLtBre66ZGcplwOMote-ubH3ci0",
  "access_expires_at": "2026-10-29T09:49:05.616141619Z",
  "refresh_token": "OHfKhTghSV_G__chfu0pErG6PmRZH6ds14Jbh4_o3S8",
  "refresh_expires_at": "2026-11-28T09:34:05.615626688Z",
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
  "command_id": "5e10d186-bd55-4572-821f-c233068c1013",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:06Z",
    "sequence": 1793266446167
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:06.187115Z",
  "last_location_at": "2026-10-29T09:34:06.187115Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678517615",
  "device_ref": "sandbox-2182"
}
```

```json
{
  "challenge_id": "109df9d1-d44e-42c1-8bdd-7ab86665db90",
  "expires_at": "2026-10-29T09:39:06.460260142Z",
  "resend_available_at": "2026-10-29T09:34:07.460260142Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678517615` → **200**

```json
{
  "phone": "+380678517615",
  "audience": "CLIENT",
  "code": "498138",
  "sent_at": "2026-10-29T09:34:06.462809235Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "109df9d1-d44e-42c1-8bdd-7ab86665db90",
  "code": "498138",
  "device_ref": "sandbox-2182"
}
```

```json
{
  "session_id": "7fbc7b37-6687-4b96-bfd1-b0c5e3da9434",
  "subject": {
    "type": "CLIENT",
    "id": "9e064387-4f92-4b34-881a-e465e29d9702"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ZTA2NDM4Ny00ZjkyLTRiMzQtODgxYS1lNDY1ZTI5ZDk3MDIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzQ2LCJpYXQiOjE3OTMyNjY0NDYsImp0aSI6ImUzMGYzMTVlLTgyODgtNDAxNS1hOGZlLTZiZDU0ZTJmMmQ2OSIsInNpZCI6IjdmYmM3YjM3LTY2ODctNGI5Ni1iZmQxLWIwYzVlM2RhOTQzNCJ9.u4RSsDagp36QdIlXp6Kmnm2ekNsKOFrsyMCVtWFtqxg",
  "access_expires_at": "2026-10-29T09:49:06.771965248Z",
  "refresh_token": "aEbo8w0DrpNmSkXK5yYh3lKDyBi2cWSTVIlAAiODtt4",
  "refresh_expires_at": "2026-11-28T09:34:06.771279966Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "84bc200a-45cc-4a83-ba57-d2e90494eb2a",
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
  "id": "dbd4daad-879d-4b44-b391-58be8bfbda42",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:39:07.076335Z",
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
  "command_id": "58f45edd-af02-499e-b62e-7379bce75338",
  "quote_id": "dbd4daad-879d-4b44-b391-58be8bfbda42",
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
  "id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9e064387-4f92-4b34-881a-e465e29d9702",
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
  "created_at": "2026-10-29T09:34:07.373883Z",
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
    "id": "f32addc9-0d20-47fe-abda-61a864bfe9ca",
    "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
    "expires_at": "2026-10-29T09:34:22.377149Z",
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

`POST /api/driver/v1/offers/f32addc9-0d20-47fe-abda-61a864bfe9ca/accept` → **200**

```json
{
  "command_id": "b5c222b2-f7ae-4b86-b8e7-814c3284da67"
}
```

```json
{
  "id": "375d51b7-df43-4b0f-85b4-cef8217420c9",
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0b68761d-a49d-45e2-a37d-33eb2cbcaeb2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0b68761d-a49d-45e2-a37d-33eb2cbcaeb2",
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "assignment_id": "375d51b7-df43-4b0f-85b4-cef8217420c9",
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

`POST /api/driver/v1/work-sessions/59d2e792-b6da-4a01-9c20-178efc10b7de/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:08Z",
    "sequence": 1793266448479
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:08.498171Z",
  "last_location_at": "2026-10-29T09:34:08.498171Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0b68761d-a49d-45e2-a37d-33eb2cbcaeb2",
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "assignment_id": "375d51b7-df43-4b0f-85b4-cef8217420c9",
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

`POST /api/driver/v1/trips/0b68761d-a49d-45e2-a37d-33eb2cbcaeb2/arrive` → **200**

```json
{
  "command_id": "5afc30b1-8636-4800-b572-b27ee12c6987",
  "expected_version": 0
}
```

```json
{
  "id": "0b68761d-a49d-45e2-a37d-33eb2cbcaeb2",
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "assignment_id": "375d51b7-df43-4b0f-85b4-cef8217420c9",
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
  "arrived_at": "2026-10-29T09:34:09.043746Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0b68761d-a49d-45e2-a37d-33eb2cbcaeb2/start` → **200**

```json
{
  "command_id": "4ec5cdc4-1b14-41f0-b041-d9d58d32693e",
  "expected_version": 1
}
```

```json
{
  "id": "0b68761d-a49d-45e2-a37d-33eb2cbcaeb2",
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "assignment_id": "375d51b7-df43-4b0f-85b4-cef8217420c9",
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
  "arrived_at": "2026-10-29T09:34:09.043746Z",
  "started_at": "2026-10-29T09:34:09.332191Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/59d2e792-b6da-4a01-9c20-178efc10b7de/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:09Z",
    "sequence": 1793266449606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:09.62451Z",
  "last_location_at": "2026-10-29T09:34:09.62451Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/0b68761d-a49d-45e2-a37d-33eb2cbcaeb2/complete` → **200**

```json
{
  "command_id": "88868b58-f6a1-4010-b806-90d579358515",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:34:09Z",
  "cash_received": true
}
```

```json
{
  "id": "0b68761d-a49d-45e2-a37d-33eb2cbcaeb2",
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "assignment_id": "375d51b7-df43-4b0f-85b4-cef8217420c9",
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
  "arrived_at": "2026-10-29T09:34:09.043746Z",
  "started_at": "2026-10-29T09:34:09.332191Z",
  "completed_at": "2026-10-29T09:34:09.900682Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6/rating` → **200**

```json
{
  "command_id": "9df21422-5197-4f2a-be95-c2cb505946ba",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "score": 5,
  "created_at": "2026-10-29T09:34:10.194941576Z"
}
```

`POST /api/driver/v1/orders/c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6/rating` → **200**

```json
{
  "command_id": "744cb7b9-7f57-47fc-b5e4-500adb2636f6",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
  "score": 4,
  "created_at": "2026-10-29T09:34:10.472766863Z"
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
  "session_id": "0a05d3ec-c792-41e3-8720-41aa809a8ade",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNTEsImlhdCI6MTc5MzI2NjQ1MSwianRpIjoiOTU1ZmExYTMtMjExNC00NjQ5LThhOTQtMzllYjI3NTc5YmUyIiwic2lkIjoiMGEwNWQzZWMtYzc5Mi00MWUzLTg3MjAtNDFhYTgwOWE4YWRlIn0.78FSxnDCLGkQHlchlW-6fqFmNsSbXSRlXrMasPWude4",
  "access_expires_at": "2026-10-29T09:49:11.358398348Z",
  "refresh_token": "Olb0XLozC8zERl25VqKVKUMnc9l26NYHuxnssAwkkkI",
  "refresh_expires_at": "2026-10-29T21:34:11.35789528Z",
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
  "session_id": "ded85475-411d-4f44-bcbb-bef740ecce26",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNTEsImlhdCI6MTc5MzI2NjQ1MSwianRpIjoiNzY5ZmVhMzctODIyNy00MTFkLWExMzEtYjYwNGYzMDQ2ZTVkIiwic2lkIjoiZGVkODU0NzUtNDExZC00ZjQ0LWJjYmItYmVmNzQwZWNjZTI2In0._ETOdhqS1AK2zD37aDeu0fXoYrg8JdWundra1EGCF6s",
  "access_expires_at": "2026-10-29T09:49:11.96855582Z",
  "refresh_token": "iRUzSIXPhcTKBTqyGEiUcL3j66EpPOlqSLs8VqqxJR4",
  "refresh_expires_at": "2026-10-29T21:34:11.968077821Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
      "author_type": "RIDER",
      "author_id": "9e064387-4f92-4b34-881a-e465e29d9702",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T09:34:10.194942Z"
    },
    {
      "order_id": "c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "9e064387-4f92-4b34-881a-e465e29d9702",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T09:34:10.472767Z"
    }
  ]
}
```

Done: ratings for order c33a66b8-c8ce-4d68-9e92-cf249b6cc1d6.

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
  "session_id": "07e9b57e-26f3-497c-a4f9-eef2493f61df",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNTIsImlhdCI6MTc5MzI2NjQ1MiwianRpIjoiMjQ2MzgyMmEtYThlMy00MTUzLTllYzMtNTVjMmM0MmEwZjAyIiwic2lkIjoiMDdlOWI1N2UtMjZmMy00OTdjLWE0ZjktZWVmMjQ5M2Y2MWRmIn0.p7nDe6fhjdlmikVxXdV00pFWN8B8k9QLk-l9QbQtaew",
  "access_expires_at": "2026-10-29T09:49:12.881572031Z",
  "refresh_token": "FGP06aqIbri5PprZV5NlZ6z0Zy49mR2HAxCbFAY0au4",
  "refresh_expires_at": "2026-10-29T21:34:12.881089595Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "ac6be982-98d7-4e1b-b6fb-b7b6f2e9e873",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "1df1620b-3e38-4c75-a710-d7e7e2d1b274",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:13.168039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1df1620b-3e38-4c75-a710-d7e7e2d1b274` → **200**

```json
{
  "id": "1df1620b-3e38-4c75-a710-d7e7e2d1b274",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:13.168039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1df1620b-3e38-4c75-a710-d7e7e2d1b274` → **200**

```json
{
  "id": "1df1620b-3e38-4c75-a710-d7e7e2d1b274",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:13.168039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1df1620b-3e38-4c75-a710-d7e7e2d1b274` → **200**

```json
{
  "id": "1df1620b-3e38-4c75-a710-d7e7e2d1b274",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:13.168039Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/1df1620b-3e38-4c75-a710-d7e7e2d1b274` → **200**

```json
{
  "id": "1df1620b-3e38-4c75-a710-d7e7e2d1b274",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T09:34:13.168039Z",
  "ready_at": "2026-10-29T09:34:17.190994Z",
  "expires_at": "2026-10-30T09:34:17.190994Z"
}
```

`GET /api/admin/v1/reports/exports/1df1620b-3e38-4c75-a710-d7e7e2d1b274/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "58ae46b3-f749-4e9b-a978-9b9e4c423f59",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "ea7114a5-3105-43f1-9bf1-410f50efc4ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:17.609795Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ea7114a5-3105-43f1-9bf1-410f50efc4ae` → **200**

```json
{
  "id": "ea7114a5-3105-43f1-9bf1-410f50efc4ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:17.609795Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ea7114a5-3105-43f1-9bf1-410f50efc4ae` → **200**

```json
{
  "id": "ea7114a5-3105-43f1-9bf1-410f50efc4ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:17.609795Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ea7114a5-3105-43f1-9bf1-410f50efc4ae` → **200**

```json
{
  "id": "ea7114a5-3105-43f1-9bf1-410f50efc4ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:17.609795Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ea7114a5-3105-43f1-9bf1-410f50efc4ae` → **200**

```json
{
  "id": "ea7114a5-3105-43f1-9bf1-410f50efc4ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T09:34:17.609795Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ea7114a5-3105-43f1-9bf1-410f50efc4ae` → **200**

```json
{
  "id": "ea7114a5-3105-43f1-9bf1-410f50efc4ae",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T09:34:17.609795Z",
  "ready_at": "2026-10-29T09:34:22.198584Z",
  "expires_at": "2026-10-30T09:34:22.198584Z"
}
```

`GET /api/admin/v1/reports/exports/ea7114a5-3105-43f1-9bf1-410f50efc4ae/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c6c6eda0-d182-4f1b-b6fb-d65df5b62823` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c6c6eda0-d182-4f1b-b6fb-d65df5b62823",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "6353a718-732e-4790-94a4-749bd2aba83e"
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
  "device_ref": "sandbox-28059"
}
```

```json
{
  "challenge_id": "df5d721b-cedd-4ddd-af0f-b55745894778",
  "expires_at": "2026-10-29T09:39:23.650454178Z",
  "resend_available_at": "2026-10-29T09:34:24.650454178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "355555",
  "sent_at": "2026-10-29T09:34:23.653307431Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "df5d721b-cedd-4ddd-af0f-b55745894778",
  "code": "355555",
  "device_ref": "sandbox-28059"
}
```

```json
{
  "session_id": "61a9ee7d-abcd-4e84-bd16-0edfbdcadd4e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM2MywiaWF0IjoxNzkzMjY2NDYzLCJqdGkiOiIzZGZhYmI1NS1mYWMzLTQ1YTktYWUwNy0xYTllOGNmY2E1OTciLCJzaWQiOiI2MWE5ZWU3ZC1hYmNkLTRlODQtYmQxNi0wZWRmYmRjYWRkNGUifQ.4aU7ymgCIRKzMBX7Vh26pyFr5p-XxBgdw3AGGn0tj2M",
  "access_expires_at": "2026-10-29T09:49:23.955834294Z",
  "refresh_token": "0egDVTl0_rU3h6_rOrowVKCXMYhBiZEJRcEB_jJtDZg",
  "refresh_expires_at": "2026-11-28T09:34:23.955328433Z",
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
  "command_id": "be5d112e-5af7-41ee-b68d-a911903aa5ac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:24Z",
    "sequence": 1793266464792
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "13c74755-4aab-4fec-8923-b953e5f462ee",
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
  "last_heartbeat_at": "2026-10-29T09:34:24.811292Z",
  "last_location_at": "2026-10-29T09:34:24.811292Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "91bebd0d-e925-4dea-9d41-cc7cc166b78d",
  "points": [
    {
      "sequence": 1793266467955,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T09:33:27Z"
    },
    {
      "sequence": 1793266467956,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T09:34:27Z"
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
  "session_id": "ead9fcef-dcdb-4843-9494-59ad54da0b1a",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNjcsImlhdCI6MTc5MzI2NjQ2NywianRpIjoiNjIyNGFhNmYtNjY5NS00NGU3LWI2ZjEtOWQ0NWVmMWQ5NDZjIiwic2lkIjoiZWFkOWZjZWYtZGNkYi00ODQzLTk0OTQtNTlhZDU0ZGEwYjFhIn0.C654nLKWUE2oK4f5m1HjgeMvrlfLwvxq0XuRML94k4U",
  "access_expires_at": "2026-10-29T09:49:27.788338012Z",
  "refresh_token": "-oQaeHzomJpBHJunC1xrwMFAhZgbMAdZ3ZGBu8meVTM",
  "refresh_expires_at": "2026-10-29T21:34:27.787783878Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "22592f0f-31cb-4f94-ac6b-6d237a5d064a",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T09:34:27Z",
        "track_point_id": "9fcefdcd-7b66-46b2-9304-32b23d61ad2e",
        "work_session_id": "13c74755-4aab-4fec-8923-b953e5f462ee"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T09:34:27Z",
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

`POST /api/admin/v1/driver-risk-flags/22592f0f-31cb-4f94-ac6b-6d237a5d064a/confirm` → **200**

```json
{
  "command_id": "0d842c26-5888-495f-9979-9201b6378577",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "22592f0f-31cb-4f94-ac6b-6d237a5d064a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T09:34:27Z",
    "track_point_id": "9fcefdcd-7b66-46b2-9304-32b23d61ad2e",
    "work_session_id": "13c74755-4aab-4fec-8923-b953e5f462ee"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T09:34:27Z",
  "reason": null,
  "reviewed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reviewed_at": "2026-10-29T09:34:28.670159Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/22592f0f-31cb-4f94-ac6b-6d237a5d064a/dismiss` → **409**

```json
{
  "command_id": "373e8ac5-fd51-4066-a218-d28551f0a8bc",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/22592f0f-31cb-4f94-ac6b-6d237a5d064a/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4dc1e104-b250-48ae-ad07-8dcc336868ff"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "8b859138-10ca-43bf-a3b9-7d638ecfc8bf",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "c97828eb-d514-4c37-a74e-8f34ec11855a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "raised_at": "2026-10-29T09:34:29.246429Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/c97828eb-d514-4c37-a74e-8f34ec11855a/dismiss` → **200**

```json
{
  "command_id": "6b74ed91-239e-4618-8ad9-b23519365541",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "c97828eb-d514-4c37-a74e-8f34ec11855a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "raised_at": "2026-10-29T09:34:29.246429Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reviewed_at": "2026-10-29T09:34:29.558047Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "022ecdb8-d5d5-4da8-a1dc-ae55f54b5b21",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "22592f0f-31cb-4f94-ac6b-6d237a5d064a"
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
      "actor_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:34:29.852742Z"
    }
  ]
}
```

Done: flag 22592f0f-31cb-4f94-ac6b-6d237a5d064a confirmed, suspension named it, driver reinstated.

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
  "session_id": "17f3d8f1-e4b7-4752-889e-72e1cbe98e1f",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNzAsImlhdCI6MTc5MzI2NjQ3MCwianRpIjoiNjcwZmUxMzItMTljMC00MjlmLTkwODMtN2ZjY2IxYjZhZGNlIiwic2lkIjoiMTdmM2Q4ZjEtZTRiNy00NzUyLTg4OWUtNzJlMWNiZTk4ZTFmIn0.2Jxaqy3mOXoAiNTvfvokxihbFLpavWOpgPt8hNEOxs0",
  "access_expires_at": "2026-10-29T09:49:30.750867613Z",
  "refresh_token": "ml3mE1lSpk8L4C9ikP16MBcZZ7dO5s170BXh0k_4CgY",
  "refresh_expires_at": "2026-10-29T21:34:30.750351827Z",
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
      "actor_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:34:29.852742Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "e2ae5310-d345-4286-92e2-1a4b57bbcfca",
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
  "session_id": "13c74755-4aab-4fec-8923-b953e5f462ee",
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
  "last_heartbeat_at": "2026-10-29T09:34:24.811292Z",
  "last_location_at": "2026-10-29T09:34:24.811292Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/13c74755-4aab-4fec-8923-b953e5f462ee/close` → **200**

```json
{
  "command_id": "5dacd0f8-34fc-4d00-adf4-d7b9b731b0c9",
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
  "session_id": "89d61643-b955-40a5-a720-4bd62edfc7ef",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNzIsImlhdCI6MTc5MzI2NjQ3MiwianRpIjoiOTJjY2RlMTctNTkyMy00YjhjLWEwM2ItNzhiZDYwNjRkNDRjIiwic2lkIjoiODlkNjE2NDMtYjk1NS00MGE1LWE3MjAtNGJkNjJlZGZjN2VmIn0.xPbO-YzzfEi0kZsjSEByAwpF9sMHayv4eTT8Wc2G5Xs",
  "access_expires_at": "2026-10-29T09:49:32.49267961Z",
  "refresh_token": "cmETypn-EZAB4b4-_ezvVoOoowKuZzRBkIzy73VRoWk",
  "refresh_expires_at": "2026-10-29T21:34:32.492165887Z",
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
  "command_id": "4664e2cd-eedd-4b5c-bbc3-8a71afc42d96",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T09:34:33.039022Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "4664e2cd-eedd-4b5c-bbc3-8a71afc42d96",
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
  "changed_by": "8fce279f-3832-4218-a097-1ba9e57f3caa",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T09:34:33.039022Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48750342819",
  "device_ref": "sandbox-7843"
}
```

```json
{
  "challenge_id": "ea51beac-9d83-4bf7-b574-d19fe6520f06",
  "expires_at": "2026-10-29T09:39:33.615724484Z",
  "resend_available_at": "2026-10-29T09:34:34.615724484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48750342819` → **200**

```json
{
  "phone": "+48750342819",
  "audience": "CLIENT",
  "code": "528534",
  "sent_at": "2026-10-29T09:34:33.618344922Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ea51beac-9d83-4bf7-b574-d19fe6520f06",
  "code": "528534",
  "device_ref": "sandbox-7843"
}
```

```json
{
  "session_id": "fe1435df-4833-4173-baf5-3314d7079e0d",
  "subject": {
    "type": "CLIENT",
    "id": "4f83a9f4-2122-4e02-a369-510a5c9dbfbb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0ZjgzYTlmNC0yMTIyLTRlMDItYTM2OS01MTBhNWM5ZGJmYmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzczLCJpYXQiOjE3OTMyNjY0NzMsImp0aSI6ImY0YTY0Yjg5LTY3YjktNGMyNC1hMWU1LTgxMGU4NjI0N2U2MSIsInNpZCI6ImZlMTQzNWRmLTQ4MzMtNDE3My1iYWY1LTMzMTRkNzA3OWUwZCJ9._F1xX7V-xJi1DlaCnTncJSF0GpfnzFARygqoww_ESR8",
  "access_expires_at": "2026-10-29T09:49:33.91938251Z",
  "refresh_token": "WkIAR8R-ytixAvkYnPFtedShKYfqZsOlLF7G1W63JSM",
  "refresh_expires_at": "2026-11-28T09:34:33.918807214Z",
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
  "correlation_id": "9addb6a0-6b3c-4c4f-89bc-bd3df10cec16"
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
  "device_ref": "sandbox-1182"
}
```

```json
{
  "challenge_id": "adf05ef0-0fad-48b4-99ab-deba53c5fa65",
  "expires_at": "2026-10-29T09:39:34.755050385Z",
  "resend_available_at": "2026-10-29T09:34:35.755050385Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "304020",
  "sent_at": "2026-10-29T09:34:34.75738983Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "adf05ef0-0fad-48b4-99ab-deba53c5fa65",
  "code": "304020",
  "device_ref": "sandbox-1182"
}
```

```json
{
  "session_id": "16420e7e-4f19-4ed2-8c2d-a5da9869347f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM3NSwiaWF0IjoxNzkzMjY2NDc1LCJqdGkiOiI1YTVmN2FiZS02YTdkLTRjMzItOWFiOS1kNjk0OGRlOTBmM2IiLCJzaWQiOiIxNjQyMGU3ZS00ZjE5LTRlZDItOGMyZC1hNWRhOTg2OTM0N2YifQ.x4XSgwV9fYX2cPbEW9uDT6fjZxXOPlKpkxnfCPLrwuc",
  "access_expires_at": "2026-10-29T09:49:35.052312568Z",
  "refresh_token": "vKBtYentwEZuUzITGTwdCvBbgdb-y62Dar7tJfnxVvU",
  "refresh_expires_at": "2026-11-28T09:34:35.051785484Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ae20d840-68fd-4376-9c94-bc70177bbcdb",
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
  "last_heartbeat_at": "2026-10-29T09:34:02.450116Z",
  "last_location_at": "2026-10-29T09:34:02.450116Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ae20d840-68fd-4376-9c94-bc70177bbcdb/handover` → **200**

```json
{
  "command_id": "23ea9c93-23f4-4779-bca4-f6d1126512e6",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ae20d840-68fd-4376-9c94-bc70177bbcdb",
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
  "last_heartbeat_at": "2026-10-29T09:34:02.450116Z",
  "last_location_at": "2026-10-29T09:34:02.450116Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/ae20d840-68fd-4376-9c94-bc70177bbcdb/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:35Z",
    "sequence": 1793266475880
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "ae20d840-68fd-4376-9c94-bc70177bbcdb",
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
  "last_heartbeat_at": "2026-10-29T09:34:35.898888Z",
  "last_location_at": "2026-10-29T09:34:35.898888Z",
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
  "session_id": "ae20d840-68fd-4376-9c94-bc70177bbcdb",
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
  "last_heartbeat_at": "2026-10-29T09:34:35.898888Z",
  "last_location_at": "2026-10-29T09:34:35.898888Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ae20d840-68fd-4376-9c94-bc70177bbcdb/close` → **200**

```json
{
  "command_id": "6dc70b74-6436-4670-9f57-c031d521e69f",
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
  "correlation_id": "ef6a4a10-cbbc-442c-abc1-41611fadde44"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670909237",
  "device_ref": "sandbox-29343"
}
```

```json
{
  "challenge_id": "680fb702-0954-4e87-ae54-4da99bcf5442",
  "expires_at": "2026-10-29T09:39:37.315953753Z",
  "resend_available_at": "2026-10-29T09:34:38.315953753Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670909237` → **200**

```json
{
  "phone": "+380670909237",
  "audience": "CLIENT",
  "code": "647550",
  "sent_at": "2026-10-29T09:34:37.318243315Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "680fb702-0954-4e87-ae54-4da99bcf5442",
  "code": "647550",
  "device_ref": "sandbox-29343"
}
```

```json
{
  "session_id": "e6792a8b-1184-474b-ad30-f7a9a15b08f9",
  "subject": {
    "type": "CLIENT",
    "id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2FjZGFmZi03YmZjLTRiNWEtOWI1My03NGQwMzY2YTBjOTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3Mzc3LCJpYXQiOjE3OTMyNjY0NzcsImp0aSI6IjFlNjI3ODcxLTU5NmMtNDdhZS1hNTczLTAwMmIwNzBiYjk4OCIsInNpZCI6ImU2NzkyYThiLTExODQtNDc0Yi1hZDMwLWY3YTlhMTViMDhmOSJ9.hLjIK8HlufOSHu7NsN43XGVNKIH2tVVDPNRmP636ZLY",
  "access_expires_at": "2026-10-29T09:49:37.621722036Z",
  "refresh_token": "fBOXmwzf0pvmnoputrPISP93WaAAVJtwAAGYNUHalHk",
  "refresh_expires_at": "2026-11-28T09:34:37.621094869Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "4640219a-0fa8-45db-aebb-5cefaa1b9f40",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
  "upload_path": "/api/rider/v1/uploads/fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
  "expires_at": "2026-10-29T09:49:37.91439349Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e` → **200**

```json
{
  "file_id": "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "4649c6e0-3a2d-4ec8-b836-ff2003f4d18c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e"
  ]
}
```

```json
{
  "id": "32f33401-ebc9-4e10-8dc6-02d270555d9f",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T09:34:38.224092Z",
  "updated_at": "2026-10-29T09:34:38.224092Z",
  "respond_by": "2026-10-29T13:34:38.224092Z",
  "messages": [
    {
      "id": "8c17b10f-44d6-4fb2-8164-22f7e489fd4c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:34:38.225155Z",
      "attachments": [
        {
          "file_id": "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
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
  "session_id": "3402668d-a140-40b8-a699-26f34071c517",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNzgsImlhdCI6MTc5MzI2NjQ3OCwianRpIjoiZjQ1MGMyOWEtNzFiZi00MGFhLWI3OGQtNzExZTczZjJhZTJhIiwic2lkIjoiMzQwMjY2OGQtYTE0MC00MGI4LWE2OTktMjZmMzQwNzFjNTE3In0.Oph2j1jBSc97GdimhgHdAK1MmTOBvsPAlZ8J8gBDx3M",
  "access_expires_at": "2026-10-29T09:49:38.857541431Z",
  "refresh_token": "DpaF0EIre8ggR68F9Nigqx6miXsULBLhBrFzQN-58OU",
  "refresh_expires_at": "2026-10-29T21:34:38.857014819Z",
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
  "session_id": "a536ff49-71dd-484b-ab4c-897f2fde2973",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczNzksImlhdCI6MTc5MzI2NjQ3OSwianRpIjoiYWI1MTkxMjctNjI0Zi00MTkwLWE4NzktZGU0NDg4YzEzMDhiIiwic2lkIjoiYTUzNmZmNDktNzFkZC00ODRiLWFiNGMtODk3ZjJmZGUyOTczIn0.Cx9vuK0fXADJYpKnW1Sa2ji5oSkmiUCBEDfOPXLuEOg",
  "access_expires_at": "2026-10-29T09:49:39.455241035Z",
  "refresh_token": "cvIxs27TyUipm8RTt7hDIeOFiX9mEO_BfZOM4IoXP_8",
  "refresh_expires_at": "2026-10-29T21:34:39.454754293Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/32f33401-ebc9-4e10-8dc6-02d270555d9f/attachments/fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "40b55210-4523-48a8-86c6-72352122fe67",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "f0f9074f-8408-47f6-b105-37fbaf9507b0",
  "upload_path": "/api/operator/v1/uploads/f0f9074f-8408-47f6-b105-37fbaf9507b0",
  "expires_at": "2026-10-29T09:49:39.761002904Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/f0f9074f-8408-47f6-b105-37fbaf9507b0` → **200**

```json
{
  "file_id": "f0f9074f-8408-47f6-b105-37fbaf9507b0",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/32f33401-ebc9-4e10-8dc6-02d270555d9f` → **200**

```json
{
  "id": "32f33401-ebc9-4e10-8dc6-02d270555d9f",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T09:34:38.224092Z",
  "updated_at": "2026-10-29T09:34:38.224092Z",
  "respond_by": "2026-10-29T13:34:38.224092Z",
  "messages": [
    {
      "id": "8c17b10f-44d6-4fb2-8164-22f7e489fd4c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:34:38.225155Z",
      "attachments": [
        {
          "file_id": "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/32f33401-ebc9-4e10-8dc6-02d270555d9f/comments` → **200**

```json
{
  "command_id": "7896c06e-ad6d-4c7a-9e50-95eac281295a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "f0f9074f-8408-47f6-b105-37fbaf9507b0"
  ]
}
```

```json
{
  "id": "32f33401-ebc9-4e10-8dc6-02d270555d9f",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T09:34:38.224092Z",
  "updated_at": "2026-10-29T09:34:40.36626Z",
  "respond_by": "2026-10-29T13:34:38.224092Z",
  "messages": [
    {
      "id": "8c17b10f-44d6-4fb2-8164-22f7e489fd4c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:34:38.225155Z",
      "attachments": [
        {
          "file_id": "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "602cd0d7-67bf-4516-8ab5-bd253c15fd99",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T09:34:40.365819Z",
      "attachments": [
        {
          "file_id": "f0f9074f-8408-47f6-b105-37fbaf9507b0",
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

`GET /api/rider/v1/support/cases/32f33401-ebc9-4e10-8dc6-02d270555d9f` → **200**

```json
{
  "id": "32f33401-ebc9-4e10-8dc6-02d270555d9f",
  "number": 2,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T09:34:38.224092Z",
  "updated_at": "2026-10-29T09:34:40.36626Z",
  "respond_by": "2026-10-29T13:34:38.224092Z",
  "messages": [
    {
      "id": "8c17b10f-44d6-4fb2-8164-22f7e489fd4c",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "83acdaff-7bfc-4b5a-9b53-74d0366a0c91",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T09:34:38.225155Z",
      "attachments": [
        {
          "file_id": "fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "602cd0d7-67bf-4516-8ab5-bd253c15fd99",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T09:34:40.365819Z",
      "attachments": [
        {
          "file_id": "f0f9074f-8408-47f6-b105-37fbaf9507b0",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/32f33401-ebc9-4e10-8dc6-02d270555d9f/attachments/f0f9074f-8408-47f6-b105-37fbaf9507b0` → **200**

Done: support case 32f33401-ebc9-4e10-8dc6-02d270555d9f, rider attachment fa5c7ef4-aac4-4828-8a3f-c3b8feb6b30e, operator attachment f0f9074f-8408-47f6-b105-37fbaf9507b0.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380739545945",
  "device_ref": "sandbox-24359"
}
```

```json
{
  "challenge_id": "5e17b087-839e-4274-b2dc-5f5b994bb19c",
  "expires_at": "2026-10-29T09:39:40.962545726Z",
  "resend_available_at": "2026-10-29T09:34:41.962545726Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739545945` → **200**

```json
{
  "phone": "+380739545945",
  "audience": "CLIENT",
  "code": "883761",
  "sent_at": "2026-10-29T09:34:40.965090741Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5e17b087-839e-4274-b2dc-5f5b994bb19c",
  "code": "883761",
  "device_ref": "sandbox-24359"
}
```

```json
{
  "session_id": "9d1769e2-bc6c-471c-bd14-689525fc7e1f",
  "subject": {
    "type": "CLIENT",
    "id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YTY0MTcyYS1mODU5LTRjNTAtOWJjNy01NGU3Y2IwYzJhYTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3MzgxLCJpYXQiOjE3OTMyNjY0ODEsImp0aSI6IjQ0NTExYWU0LWZhNGItNDMyZi05MjQwLTE5Y2Y2Mzk2YmYyYSIsInNpZCI6IjlkMTc2OWUyLWJjNmMtNDcxYy1iZDE0LTY4OTUyNWZjN2UxZiJ9.hy2oXopAomSyLKQVpcodbxONoN2I6617v-5cwyZYlhY",
  "access_expires_at": "2026-10-29T09:49:41.262034771Z",
  "refresh_token": "twDuemQRLv9YlZWCircMQpkBhiWumYchyFCSNtHGHho",
  "refresh_expires_at": "2026-11-28T09:34:41.26154863Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "75f94e2d-533d-4ea7-bebb-e719d22e75f7",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d40801a5-52ab-4603-8a75-af4fd1eb5915",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d40801a5-52ab-4603-8a75-af4fd1eb5915",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "6428c28094d65f9a5cb4ebd2ab56b7e2",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d40801a5-52ab-4603-8a75-af4fd1eb5915",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739545945"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d40801a5-52ab-4603-8a75-af4fd1eb5915",
  "expires_at": "2026-10-29T10:04:41.535993Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/d40801a5-52ab-4603-8a75-af4fd1eb5915` → **200**

```json
{
  "id": "d40801a5-52ab-4603-8a75-af4fd1eb5915",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T10:04:41.535993Z",
  "card": {
    "id": "5f09381f-0c57-4dd4-87a7-aa02be7621af",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8963",
    "card_type": "Visa",
    "created_at": "2026-10-29T09:34:41.825459Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "eb093cf3-323d-46cb-b145-4d6178645b3c",
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
  "id": "24f93470-c41f-4754-b213-da896190dae1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:39:42.127020Z",
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
  "command_id": "af16d016-7992-4718-8329-e7720cbc4c86",
  "quote_id": "24f93470-c41f-4754-b213-da896190dae1",
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
  "id": "652366fd-a946-44bb-b5ee-fe574eaf9603",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0",
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
  "created_at": "2026-10-29T09:34:42.417128Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603` → **200**

```json
{
  "id": "652366fd-a946-44bb-b5ee-fe574eaf9603",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0",
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
  "created_at": "2026-10-29T09:34:42.417128Z",
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

`GET /api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603` → **200**

```json
{
  "id": "652366fd-a946-44bb-b5ee-fe574eaf9603",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0",
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
  "created_at": "2026-10-29T09:34:42.417128Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603/switch-to-cash` → **200**

```json
{
  "command_id": "2ffd8c4d-4a65-4589-ac50-366bcd63bde8",
  "expected_version": 3
}
```

```json
{
  "id": "652366fd-a946-44bb-b5ee-fe574eaf9603",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0",
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
  "created_at": "2026-10-29T09:34:42.417128Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603/switch-to-cash` → **409**

```json
{
  "command_id": "b52e89e5-a4dc-4db2-b08a-cf1ef8576581",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "91222947-90d9-4428-b7f4-40c7f7b237b1"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603` → **200**

```json
{
  "id": "652366fd-a946-44bb-b5ee-fe574eaf9603",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0",
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
  "created_at": "2026-10-29T09:34:42.417128Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/652366fd-a946-44bb-b5ee-fe574eaf9603/cancel` → **200**

```json
{
  "command_id": "abf7e45e-7b3d-4858-9379-2805e87fb70f",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "652366fd-a946-44bb-b5ee-fe574eaf9603",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "6a64172a-f859-4c50-9bc7-54e7cb0c2aa0",
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
  "created_at": "2026-10-29T09:34:42.417128Z",
  "cancellation": {
    "by": "RIDER",
    "reason_code": "CHANGED_MIND",
    "reason_labels": {
      "pl": "Zmiana planów",
      "uk": "Передумав їхати",
      "en": "Changed my mind",
      "ru": "Передумал ехать"
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
  "session_id": "10543b4d-8b6d-4254-bb08-3c8f5180d5f9",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczODQsImlhdCI6MTc5MzI2NjQ4NCwianRpIjoiM2Y4MTkxZmMtNjg5Mi00ZTFhLWI3YTQtNWZjYzRjZGRhOTEwIiwic2lkIjoiMTA1NDNiNGQtOGI2ZC00MjU0LWJiMDgtM2M4ZjUxODBkNWY5In0.lrmTuTUyGDgBI54nOVq6m5CQ-exCbCtBdks4HFjssOs",
  "access_expires_at": "2026-10-29T09:49:44.806767093Z",
  "refresh_token": "5rxSazaWLKT_on05q8ArRkSEfeYXRwo7f-FqGjvnhEM",
  "refresh_expires_at": "2026-10-29T21:34:44.806234942Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-14505"
}
```

```json
{
  "challenge_id": "0a630c1c-f7c7-4219-968b-1423141c8fba",
  "expires_at": "2026-10-29T09:39:45.087141499Z",
  "resend_available_at": "2026-10-29T09:34:46.087141499Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "894471",
  "sent_at": "2026-10-29T09:34:45.089892537Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0a630c1c-f7c7-4219-968b-1423141c8fba",
  "code": "894471",
  "device_ref": "sandbox-14505"
}
```

```json
{
  "session_id": "6e0d6eec-b2e6-4f6e-967d-68dd568fe6fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM4NSwiaWF0IjoxNzkzMjY2NDg1LCJqdGkiOiI4ZTMzM2VkYy05M2FiLTQ0ZjQtOTU0MS03NTBjYTYyNGI1NmMiLCJzaWQiOiI2ZTBkNmVlYy1iMmU2LTRmNmUtOTY3ZC02OGRkNTY4ZmU2ZmIifQ.Bl9BzuBGc3hH-sK3piIwSWCIAju1LimGnUi7WdSG2ic",
  "access_expires_at": "2026-10-29T09:49:45.389263269Z",
  "refresh_token": "3yqcHAhynB2P8lYX0gECxu83C2zvxl7uHTellzuxB5k",
  "refresh_expires_at": "2026-11-28T09:34:45.388786482Z",
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
      "actor_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T09:34:29.852742Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "8fce279f-3832-4218-a097-1ba9e57f3caa",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T09:34:31.313447Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "d61751e4-ba03-483e-b00a-a64e60ffe843",
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
  "device_ref": "sandbox-22700"
}
```

```json
{
  "challenge_id": "5eb7d527-a24a-4986-93bb-d5587c1039ba",
  "expires_at": "2026-10-29T09:39:46.489660334Z",
  "resend_available_at": "2026-10-29T09:34:47.489660334Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "095115",
  "sent_at": "2026-10-29T09:34:46.492340071Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5eb7d527-a24a-4986-93bb-d5587c1039ba",
  "code": "095115",
  "device_ref": "sandbox-22700"
}
```

```json
{
  "session_id": "e4f0da58-5ede-402d-9b43-ad197042d24b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM4NiwiaWF0IjoxNzkzMjY2NDg2LCJqdGkiOiIzNTJkMDg0Yi01MWNhLTQ1NDQtYjQ3NS1lY2RlOGYwMDM1ZTEiLCJzaWQiOiJlNGYwZGE1OC01ZWRlLTQwMmQtOWI0My1hZDE5NzA0MmQyNGIifQ.DumTL5YI2ZCBZFPXfgJj8xUUFWl4f0l_zlQ1vxl0ifU",
  "access_expires_at": "2026-10-29T09:49:46.790299204Z",
  "refresh_token": "W96vARcMHfo4hTCk-i6YAcZiwxVklbDatNk5-JdszJw",
  "refresh_expires_at": "2026-11-28T09:34:46.78982426Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:09.62451Z",
  "last_location_at": "2026-10-29T09:34:09.62451Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/59d2e792-b6da-4a01-9c20-178efc10b7de/handover` → **200**

```json
{
  "command_id": "d1a1f00d-e908-4e99-b9d5-a98a01b5aead",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:09.62451Z",
  "last_location_at": "2026-10-29T09:34:09.62451Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/59d2e792-b6da-4a01-9c20-178efc10b7de/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:47Z",
    "sequence": 1793266487606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:47.624785Z",
  "last_location_at": "2026-10-29T09:34:47.624785Z",
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
  "command_id": "ad0b6e77-13c3-4600-bec9-16404da69dac",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:48Z",
    "sequence": 1793266488160
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "44424e99-16b4-4a3f-9c43-aa25f7052668",
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
  "last_heartbeat_at": "2026-10-29T09:34:48.179801Z",
  "last_location_at": "2026-10-29T09:34:48.179801Z",
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
  "session_id": "251683e8-a22c-45a3-ae8a-0c1e06879e54",
  "subject": {
    "type": "STAFF",
    "id": "8fce279f-3832-4218-a097-1ba9e57f3caa"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZmNlMjc5Zi0zODMyLTQyMTgtYTA5Ny0xYmE5ZTU3ZjNjYWEiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyNjczODgsImlhdCI6MTc5MzI2NjQ4OCwianRpIjoiZjg2MmJlMjUtZWY5MC00M2MyLWJlNzItYTgwMzAwMDZkMzliIiwic2lkIjoiMjUxNjgzZTgtYTIyYy00NWEzLWFlOGEtMGMxZTA2ODc5ZTU0In0.aORQsoueJsrnO09AmPYBWpvAn4vduHRLKfvlMO79ugo",
  "access_expires_at": "2026-10-29T09:49:48.794227297Z",
  "refresh_token": "sHpSCdpAeOj44RcfEAkiEOJh1X7D8cUrSrkWvCLCVw8",
  "refresh_expires_at": "2026-10-29T21:34:48.793738772Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "1ec860b6-d795-47f3-9840-bbe99a1824e3",
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
  "id": "0f0cb7d8-5acb-4188-ab1b-6261eed41a31",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:39:49.077161Z",
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
  "command_id": "3b07c873-61b9-4802-87f8-fd9a3ec6234f",
  "quote_id": "0f0cb7d8-5acb-4188-ab1b-6261eed41a31",
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
  "id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
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
  "created_at": "2026-10-29T09:34:49.367405Z",
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
    "id": "8948ce9d-4a34-4110-9434-6525c9a0eee3",
    "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
    "expires_at": "2026-10-29T09:35:04.371125Z",
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

`POST /api/driver/v1/offers/8948ce9d-4a34-4110-9434-6525c9a0eee3/accept` → **200**

```json
{
  "command_id": "4f61330e-6547-4fa5-b015-0a531849a9a2"
}
```

```json
{
  "id": "ed992577-49eb-4f4b-8c2a-f007af85152b",
  "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "31915b1d-7a63-4175-ac95-3952fd1b81cc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "31915b1d-7a63-4175-ac95-3952fd1b81cc",
  "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
  "assignment_id": "ed992577-49eb-4f4b-8c2a-f007af85152b",
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

`POST /api/driver/v1/work-sessions/44424e99-16b4-4a3f-9c43-aa25f7052668/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T09:34:50Z",
    "sequence": 1793266490782
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "44424e99-16b4-4a3f-9c43-aa25f7052668",
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
  "last_heartbeat_at": "2026-10-29T09:34:50.800835Z",
  "last_location_at": "2026-10-29T09:34:50.800835Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/31915b1d-7a63-4175-ac95-3952fd1b81cc/arrive` → **200**

```json
{
  "command_id": "c3f9c5e7-f920-4b79-9d5a-1262738a41bd",
  "expected_version": 0
}
```

```json
{
  "id": "31915b1d-7a63-4175-ac95-3952fd1b81cc",
  "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
  "assignment_id": "ed992577-49eb-4f4b-8c2a-f007af85152b",
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
  "arrived_at": "2026-10-29T09:34:51.107052Z",
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

`POST /api/driver/v1/trips/31915b1d-7a63-4175-ac95-3952fd1b81cc/start` → **200**

```json
{
  "command_id": "c3034877-4149-4e25-bfa3-68bd712740ec",
  "expected_version": 1
}
```

```json
{
  "id": "31915b1d-7a63-4175-ac95-3952fd1b81cc",
  "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
  "assignment_id": "ed992577-49eb-4f4b-8c2a-f007af85152b",
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
  "arrived_at": "2026-10-29T09:34:51.107052Z",
  "started_at": "2026-10-29T09:34:51.398968Z",
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

`POST /api/driver/v1/trips/31915b1d-7a63-4175-ac95-3952fd1b81cc/complete` → **200**

```json
{
  "command_id": "482b62bd-7a3d-4e3b-9673-539e42322933",
  "expected_version": 2,
  "reported_at": "2026-10-29T09:34:51Z",
  "cash_received": true
}
```

```json
{
  "id": "31915b1d-7a63-4175-ac95-3952fd1b81cc",
  "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
  "assignment_id": "ed992577-49eb-4f4b-8c2a-f007af85152b",
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
  "arrived_at": "2026-10-29T09:34:51.107052Z",
  "started_at": "2026-10-29T09:34:51.398968Z",
  "completed_at": "2026-10-29T09:34:51.68642Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/213ab5fa-e33e-4382-9bb2-ecae4f6eb922` → **200**

```json
{
  "id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
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
    "id": "ed992577-49eb-4f4b-8c2a-f007af85152b",
    "order_id": "213ab5fa-e33e-4382-9bb2-ecae4f6eb922",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "31915b1d-7a63-4175-ac95-3952fd1b81cc",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T09:34:49.367405Z",
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
  "session_id": "59d2e792-b6da-4a01-9c20-178efc10b7de",
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
  "last_heartbeat_at": "2026-10-29T09:34:47.624785Z",
  "last_location_at": "2026-10-29T09:34:47.624785Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/59d2e792-b6da-4a01-9c20-178efc10b7de/close` → **200**

```json
{
  "command_id": "384e3cb9-0ca4-4371-a972-ad23773fd97d",
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
  "session_id": "44424e99-16b4-4a3f-9c43-aa25f7052668",
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
  "last_heartbeat_at": "2026-10-29T09:34:50.800835Z",
  "last_location_at": "2026-10-29T09:34:50.800835Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/44424e99-16b4-4a3f-9c43-aa25f7052668/close` → **200**

```json
{
  "command_id": "fbf6003b-be4d-47b0-88d7-a30d2be019b8",
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

Done: terminal order 213ab5fa-e33e-4382-9bb2-ecae4f6eb922 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10139"
}
```

```json
{
  "challenge_id": "cacd7c8a-6c19-47ed-8b9a-f21326368cc9",
  "expires_at": "2026-10-29T09:39:56.631019501Z",
  "resend_available_at": "2026-10-29T09:34:57.631019501Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "367320",
  "sent_at": "2026-10-29T09:34:56.633544729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cacd7c8a-6c19-47ed-8b9a-f21326368cc9",
  "code": "367320",
  "device_ref": "sandbox-10139"
}
```

```json
{
  "session_id": "cf8975e1-0a23-4c58-bcbd-a57ec45b2ad0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM5NiwiaWF0IjoxNzkzMjY2NDk2LCJqdGkiOiJmMzYyOTFlYS03MzA2LTRkMzktOTI5NS1jYmEwNWM4ZWI0NTMiLCJzaWQiOiJjZjg5NzVlMS0wYTIzLTRjNTgtYmNiZC1hNTdlYzQ1YjJhZDAifQ.YZ4lWgkXdau6l_W2DSTS9dBNiglwNFCwO49dGg4aTCo",
  "access_expires_at": "2026-10-29T09:49:56.933042508Z",
  "refresh_token": "94vVcQO_X7uNpll22dfbwcoaWYdzI17Ge1FgR623Vtc",
  "refresh_expires_at": "2026-11-28T09:34:56.932406381Z",
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
  "device_ref": "sandbox-1202"
}
```

```json
{
  "challenge_id": "ad61965b-54e9-4ce4-b2e5-074676beb9cb",
  "expires_at": "2026-10-29T09:39:57.471529219Z",
  "resend_available_at": "2026-10-29T09:34:58.471529219Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "951891",
  "sent_at": "2026-10-29T09:34:57.47408297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad61965b-54e9-4ce4-b2e5-074676beb9cb",
  "code": "951891",
  "device_ref": "sandbox-1202"
}
```

```json
{
  "session_id": "761dccfa-f8e8-40f4-83b1-c58bdcb5b007",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM5NywiaWF0IjoxNzkzMjY2NDk3LCJqdGkiOiI5MGY4MTRkMi1lMGFlLTQyMDctYmE4Yi01Y2UzYzkyNThjZTMiLCJzaWQiOiI3NjFkY2NmYS1mOGU4LTQwZjQtODNiMS1jNThiZGNiNWIwMDcifQ.TNC0Yh2sJkgX6-tj1qKJ4nOGkIHo84UDQ0Rn-30fjjc",
  "access_expires_at": "2026-10-29T09:49:57.773752132Z",
  "refresh_token": "ps_7ZcGI4AMOTdWltEgbT5sgbiv9kImU1eiS1jbKN90",
  "refresh_expires_at": "2026-11-28T09:34:57.773235495Z",
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
  "device_ref": "sandbox-6685"
}
```

```json
{
  "challenge_id": "375c996c-033a-4666-9934-cc60e76b1294",
  "expires_at": "2026-10-29T09:39:58.309804465Z",
  "resend_available_at": "2026-10-29T09:34:59.309804465Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "703674",
  "sent_at": "2026-10-29T09:34:58.312671112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "375c996c-033a-4666-9934-cc60e76b1294",
  "code": "703674",
  "device_ref": "sandbox-6685"
}
```

```json
{
  "session_id": "d5688c9a-10e2-4309-8e51-133773a0b1e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI2NzM5OCwiaWF0IjoxNzkzMjY2NDk4LCJqdGkiOiJiZmNjNmZjYS05NGMxLTRjZmUtODNmOC01OWRjYzFiNTQxY2IiLCJzaWQiOiJkNTY4OGM5YS0xMGUyLTQzMDktOGU1MS0xMzM3NzNhMGIxZTQifQ.eqV11l5qamNnHKS121lvwYc2RES_l4J1pZlApjVJim4",
  "access_expires_at": "2026-10-29T09:49:58.610145793Z",
  "refresh_token": "iIuSArxP-K0nkGcnR6EVQAG3b5Slctas1E3ZvbTVwN0",
  "refresh_expires_at": "2026-11-28T09:34:58.609603022Z",
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
  "phone": "+380696788018",
  "device_ref": "sandbox-13772"
}
```

```json
{
  "challenge_id": "9b3ed970-4cb8-46f8-a567-745acb1861c9",
  "expires_at": "2026-10-29T09:39:59.142199983Z",
  "resend_available_at": "2026-10-29T09:35:00.142199983Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380696788018` → **200**

```json
{
  "phone": "+380696788018",
  "audience": "CLIENT",
  "code": "391326",
  "sent_at": "2026-10-29T09:34:59.144714631Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9b3ed970-4cb8-46f8-a567-745acb1861c9",
  "code": "391326",
  "device_ref": "sandbox-13772"
}
```

```json
{
  "session_id": "63d6939f-23b8-4b5e-a2a9-974ef673c920",
  "subject": {
    "type": "CLIENT",
    "id": "472645f7-cd87-42c6-bb61-2668834f7a63"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NzI2NDVmNy1jZDg3LTQyYzYtYmI2MS0yNjY4ODM0ZjdhNjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjY3Mzk5LCJpYXQiOjE3OTMyNjY0OTksImp0aSI6IjdmNTI5NmUyLWJiMmItNDhhOC1iNjZkLWM4YzQ1ZmJjNjM5ZiIsInNpZCI6IjYzZDY5MzlmLTIzYjgtNGI1ZS1hMmE5LTk3NGVmNjczYzkyMCJ9.ASySBwiB1P5k7ltm5rFI-TlWuDQp5gQIzk_6vkGBaAI",
  "access_expires_at": "2026-10-29T09:49:59.450005318Z",
  "refresh_token": "8VRnq94zSaqxXILYr_lvxBybY8pmk35r6Ss2kDFLbAM",
  "refresh_expires_at": "2026-11-28T09:34:59.449518666Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8753a427-8a36-4e39-9a80-d518fb6ff483",
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
  "id": "c6737146-3446-4e06-b59c-0cb908a83676",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T09:39:59.728577Z",
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
  "command_id": "0a306833-f938-45d5-ac50-5d75c3a328eb",
  "quote_id": "c6737146-3446-4e06-b59c-0cb908a83676",
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
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.181434334
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.149573119
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

`GET /api/rider/v1/orders/e4e1222a-530f-4429-959c-06602c0c9c1b` → **200**

```json
{
  "id": "e4e1222a-530f-4429-959c-06602c0c9c1b",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "472645f7-cd87-42c6-bb61-2668834f7a63",
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
  "created_at": "2026-10-29T09:35:00.026576Z",
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
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793266802283E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.79326680241E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.79326680241E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793266802411E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793266802411E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
