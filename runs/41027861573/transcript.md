# Sandbox transcript (2026-10-30T08:40:04Z, edf51a1)

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
  "correlation_id": "54af3fa4-ff9a-42e3-89a6-70f0d3e57bde"
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
  "session_id": "d4e17b2b-5109-4297-a7d7-5d000e4088af",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1MTEsImlhdCI6MTc5MzM0OTYxMSwianRpIjoiYzgwNmY3NjAtYmI2Yi00YmUxLWI5N2ItNjI4M2QwYjkzYzFlIiwic2lkIjoiZDRlMTdiMmItNTEwOS00Mjk3LWE3ZDctNWQwMDBlNDA4OGFmIn0.VqAnd7e8TG_yGY71cV_mC6-NGM7mMbq0YHsIrZCGhZ8",
  "access_expires_at": "2026-10-30T08:55:11.606135987Z",
  "refresh_token": "2bXTg7TMlYRXeX3YDEV1CIBwQOpoggUH18GJyfx281c",
  "refresh_expires_at": "2026-10-30T20:40:11.604083839Z",
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
  "session_id": "36df9125-a5b1-46eb-a9b5-99310cad5d48",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1MTMsImlhdCI6MTc5MzM0OTYxMywianRpIjoiMDI0ZDkxNWItOTA2Ni00OWM4LWIxOWEtMmNlZjJjMmNkODYyIiwic2lkIjoiMzZkZjkxMjUtYTViMS00NmViLWE5YjUtOTkzMTBjYWQ1ZDQ4In0.rUQS2ZfWcYJO2eQvli8w2YjvLJ1iwnj2rgu9MZjdTBg",
  "access_expires_at": "2026-10-30T08:55:13.394120308Z",
  "refresh_token": "TJgc7oB_sbF1ZSZtRfQr_R5nVI0jFPJ2VnqJjaicPTs",
  "refresh_expires_at": "2026-10-30T20:40:13.392922314Z",
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
  "device_ref": "sandbox-1816"
}
```

```json
{
  "challenge_id": "ad3299da-fc85-4447-988b-954c173febf4",
  "expires_at": "2026-10-30T08:45:13.941091959Z",
  "resend_available_at": "2026-10-30T08:40:14.941091959Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "571844",
  "sent_at": "2026-10-30T08:40:13.952774818Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ad3299da-fc85-4447-988b-954c173febf4",
  "code": "571844",
  "device_ref": "sandbox-1816"
}
```

```json
{
  "session_id": "22e4670f-a154-4ee9-8d69-c1bd0fbac876",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDUxNCwiaWF0IjoxNzkzMzQ5NjE0LCJqdGkiOiI2NWJhZTdiMS02NzA4LTRmODItOTc1MC01NDVjNjJlYmQ5MmIiLCJzaWQiOiIyMmU0NjcwZi1hMTU0LTRlZTktOGQ2OS1jMWJkMGZiYWM4NzYifQ.OOriuXNROCb_2e-lD4B3kAEjVYV1BEpGgjOVaxfs6HM",
  "access_expires_at": "2026-10-30T08:55:14.237851938Z",
  "refresh_token": "rxtzBC0eYLML1inpstziVhVi6k4NrhCRWzRGN27Pl4U",
  "refresh_expires_at": "2026-11-29T08:40:14.236987227Z",
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
  "command_id": "c117289f-a423-4c34-b52a-50cc05979a48",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:14Z",
    "sequence": 1793349614708
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9434c524-7464-45e7-9273-abbed5a8d152",
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
  "last_heartbeat_at": "2026-10-30T08:40:14.79299Z",
  "last_location_at": "2026-10-30T08:40:14.79299Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630928875",
  "device_ref": "sandbox-31534"
}
```

```json
{
  "challenge_id": "d174fab3-1541-4ff9-82b3-86d1da2da391",
  "expires_at": "2026-10-30T08:45:15.030253559Z",
  "resend_available_at": "2026-10-30T08:40:16.030253559Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630928875` → **200**

```json
{
  "phone": "+380630928875",
  "audience": "CLIENT",
  "code": "201689",
  "sent_at": "2026-10-30T08:40:15.035783049Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d174fab3-1541-4ff9-82b3-86d1da2da391",
  "code": "201689",
  "device_ref": "sandbox-31534"
}
```

```json
{
  "session_id": "6c1c2a3a-67bf-42bb-808e-ec3a5f1888bb",
  "subject": {
    "type": "CLIENT",
    "id": "336f2f58-bb63-480d-87e9-8ba4bdda56be"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMzZmMmY1OC1iYjYzLTQ4MGQtODdlOS04YmE0YmRkYTU2YmUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTE1LCJpYXQiOjE3OTMzNDk2MTUsImp0aSI6IjJmMDU5YmNhLWZjNGQtNGUzMi04MzViLTczNjJkZGMwNmVlNiIsInNpZCI6IjZjMWMyYTNhLTY3YmYtNDJiYi04MDhlLWVjM2E1ZjE4ODhiYiJ9.JjIuI-5_B_BXCih3qikb7FnB7c7UjfwNVvIYopcU_h8",
  "access_expires_at": "2026-10-30T08:55:15.287098762Z",
  "refresh_token": "pBNni-hs4zvomF7YSp-cjWHU2MUCJIDk3FnzKyw4YuI",
  "refresh_expires_at": "2026-11-29T08:40:15.286278327Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cea2a2f9-98cc-46f6-8d25-cc8bb05e9bd2",
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
  "id": "ca028b09-f4f4-4b07-93d7-719bbf048b83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:15.543907Z",
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
  "command_id": "e8fb63ab-a5e0-4fd2-be2d-1760a12925a9",
  "quote_id": "ca028b09-f4f4-4b07-93d7-719bbf048b83",
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
  "id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "336f2f58-bb63-480d-87e9-8ba4bdda56be",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:40:15.845265Z",
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
    "id": "aa21dc75-7e2d-487c-98e1-e917c16788bc",
    "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
    "expires_at": "2026-10-30T08:40:30.853043Z",
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

`POST /api/driver/v1/offers/aa21dc75-7e2d-487c-98e1-e917c16788bc/accept` → **200**

```json
{
  "command_id": "f87d4cef-c3ab-4c83-aae5-f20d0f2a9ec9"
}
```

```json
{
  "id": "81977ac4-804e-4514-a480-9c41f9013a9c",
  "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3a52ab5f-c09b-491c-93d4-a3c8a2b9e735",
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
  "command_id": "c3cdf285-c610-4b6e-9730-a6f6e660ca15",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:40:16.855187021Z"
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
  "id": "3a52ab5f-c09b-491c-93d4-a3c8a2b9e735",
  "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
  "assignment_id": "81977ac4-804e-4514-a480-9c41f9013a9c",
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

`POST /api/driver/v1/work-sessions/9434c524-7464-45e7-9273-abbed5a8d152/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:17Z",
    "sequence": 1793349617589
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9434c524-7464-45e7-9273-abbed5a8d152",
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
  "last_heartbeat_at": "2026-10-30T08:40:17.613432Z",
  "last_location_at": "2026-10-30T08:40:17.613432Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/3a52ab5f-c09b-491c-93d4-a3c8a2b9e735/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "92d64cae-58b9-4eb4-9f83-7aa9143fab47",
  "expected_version": 0
}
```

```json
{
  "id": "3a52ab5f-c09b-491c-93d4-a3c8a2b9e735",
  "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
  "assignment_id": "81977ac4-804e-4514-a480-9c41f9013a9c",
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
  "arrived_at": "2026-10-30T08:40:17.856178Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3a52ab5f-c09b-491c-93d4-a3c8a2b9e735/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "0f08daee-0cbf-4fe9-b01c-57ae23b7ea34",
  "expected_version": 1
}
```

```json
{
  "id": "3a52ab5f-c09b-491c-93d4-a3c8a2b9e735",
  "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
  "assignment_id": "81977ac4-804e-4514-a480-9c41f9013a9c",
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
  "arrived_at": "2026-10-30T08:40:17.856178Z",
  "started_at": "2026-10-30T08:40:18.096317Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3a52ab5f-c09b-491c-93d4-a3c8a2b9e735/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e920edae-ddf1-45bc-b21b-ed978d050f92",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:40:18Z",
  "cash_received": true
}
```

```json
{
  "id": "3a52ab5f-c09b-491c-93d4-a3c8a2b9e735",
  "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
  "assignment_id": "81977ac4-804e-4514-a480-9c41f9013a9c",
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
  "arrived_at": "2026-10-30T08:40:17.856178Z",
  "started_at": "2026-10-30T08:40:18.096317Z",
  "completed_at": "2026-10-30T08:40:18.360699Z",
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
  "session_id": "9434c524-7464-45e7-9273-abbed5a8d152",
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
  "last_heartbeat_at": "2026-10-30T08:40:17.613432Z",
  "last_location_at": "2026-10-30T08:40:17.613432Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9434c524-7464-45e7-9273-abbed5a8d152/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "751184f4-475f-44d8-ae67-041b45f154b2",
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
  "command_id": "149f3f30-bdc2-4c66-b8c8-23317b36a59b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:19Z",
    "sequence": 1793349619969
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
  "correlation_id": "c1ec3e6c-3739-4352-924a-3666c17c3553",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "cb984d1b-a996-4917-8c8d-04883496c918",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:19Z",
    "sequence": 1793349619970
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9ac7dd19-00ca-4420-967a-e5a7c2a2882d",
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
  "last_heartbeat_at": "2026-10-30T08:40:19.355501Z",
  "last_location_at": "2026-10-30T08:40:19.355501Z",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-30T08:40:16.855187Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "b876bd4d-0e65-40e1-b87e-8abe8c3436fb",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:40:19.844483051Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9ac7dd19-00ca-4420-967a-e5a7c2a2882d",
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
  "last_heartbeat_at": "2026-10-30T08:40:19.355501Z",
  "last_location_at": "2026-10-30T08:40:19.355501Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9ac7dd19-00ca-4420-967a-e5a7c2a2882d/close` → **200**

```json
{
  "command_id": "8b3a7629-f763-4448-8e42-aaeef39db84f",
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
  "session_id": "5fdfb3a5-324c-4255-a36d-4f2312449ac8",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1MjAsImlhdCI6MTc5MzM0OTYyMCwianRpIjoiNjQ0ZDAzZWEtZWJmOC00NWM5LWFiMDYtMTk1ODgwZTg3MzZmIiwic2lkIjoiNWZkZmIzYTUtMzI0Yy00MjU1LWEzNmQtNGYyMzEyNDQ5YWM4In0.hsyaPsMd6b8-pTnaR7SgNAFitO8ph1IMniOsALZJcbA",
  "access_expires_at": "2026-10-30T08:55:20.81601418Z",
  "refresh_token": "XKsrRHmQn0Y-HEXgaAKLSxOR8QcH115h3RGsPEpH-NA",
  "refresh_expires_at": "2026-10-30T20:40:20.815241736Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "87bd1d44-e8a9-475c-a56b-732fce14526b",
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
  "id": "a2f7420f-a60b-4cfb-a8d4-be49d0c2e1b9",
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
  "created_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "created_at": "2026-10-30T08:40:21.105637Z",
  "updated_at": "2026-10-30T08:40:21.105637Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637822114",
  "device_ref": "sandbox-16098"
}
```

```json
{
  "challenge_id": "4c7e0666-b5f2-49cf-a8f8-eca17c9e39f0",
  "expires_at": "2026-10-30T08:45:21.345130261Z",
  "resend_available_at": "2026-10-30T08:40:22.345130261Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637822114` → **200**

```json
{
  "phone": "+380637822114",
  "audience": "CLIENT",
  "code": "463331",
  "sent_at": "2026-10-30T08:40:21.348699537Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4c7e0666-b5f2-49cf-a8f8-eca17c9e39f0",
  "code": "463331",
  "device_ref": "sandbox-16098"
}
```

```json
{
  "session_id": "3db64a83-5249-4f3f-9cc9-57756d56eeb7",
  "subject": {
    "type": "CLIENT",
    "id": "549812f3-9212-443f-b4bf-aa4e728db1e1"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDk4MTJmMy05MjEyLTQ0M2YtYjRiZi1hYTRlNzI4ZGIxZTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTIxLCJpYXQiOjE3OTMzNDk2MjEsImp0aSI6IjViMDllODM5LTFlMjYtNDkzZS05MjkxLThjZjIyNzgyOGY4NyIsInNpZCI6IjNkYjY0YTgzLTUyNDktNGYzZi05Y2M5LTU3NzU2ZDU2ZWViNyJ9.lG30PUeLx-TgGAxQHDz7U-uEPqn8yISII5KxyYuhs7U",
  "access_expires_at": "2026-10-30T08:55:21.598530332Z",
  "refresh_token": "DsoLZazPCqBQsKgf7GU0KVtRr3AlYvuhHNTLFznm0p0",
  "refresh_expires_at": "2026-11-29T08:40:21.597870334Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380637822114` → **200**

```json
{
  "client_id": "549812f3-9212-443f-b4bf-aa4e728db1e1"
}
```

`POST /api/admin/v1/rider-wallets/549812f3-9212-443f-b4bf-aa4e728db1e1/top-ups` → **201**

```json
{
  "command_id": "4b84c5fc-384f-49ce-858c-aa9b5b3836ff",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "549812f3-9212-443f-b4bf-aa4e728db1e1",
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
      "id": "c6be217f-55d1-4bff-8fa2-15815631c065",
      "at": "2026-10-30T08:40:22.215932Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "0c525973-45ad-47d4-a948-9e2c0b9e6e88",
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
  "id": "13be74d5-4d3a-4f43-ab6a-f139ddd1bf5f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:22.465619Z",
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
      "id": "a2f7420f-a60b-4cfb-a8d4-be49d0c2e1b9",
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
  "device_ref": "sandbox-27507"
}
```

```json
{
  "challenge_id": "62771cd6-62d2-4526-afab-e2bd3b27f01d",
  "expires_at": "2026-10-30T08:45:22.75187576Z",
  "resend_available_at": "2026-10-30T08:40:23.75187576Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "444034",
  "sent_at": "2026-10-30T08:40:22.755732117Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "62771cd6-62d2-4526-afab-e2bd3b27f01d",
  "code": "444034",
  "device_ref": "sandbox-27507"
}
```

```json
{
  "session_id": "b914765d-ee7a-47a3-9719-b349884ff056",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDUyMywiaWF0IjoxNzkzMzQ5NjIzLCJqdGkiOiI4YjJjY2M1ZC01MGMyLTQ0YTgtYTRkYi01YWM0ZjM5Y2VlNTciLCJzaWQiOiJiOTE0NzY1ZC1lZTdhLTQ3YTMtOTcxOS1iMzQ5ODg0ZmYwNTYifQ.af8ypsrI6MJYOh31BAMMM2yePeZYY1YBLWnGSu1aLv4",
  "access_expires_at": "2026-10-30T08:55:23.007651109Z",
  "refresh_token": "TjFGdFN4BJ6DFXhLNYt3QXae-bHsKRhIgr6atyn3Zz4",
  "refresh_expires_at": "2026-11-29T08:40:23.007055647Z",
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
  "command_id": "f04f66be-6270-4066-90a2-4cd9ecf751df",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:23Z",
    "sequence": 1793349623461
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99faa810-e096-48de-987d-95d992dd95ee",
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
  "last_heartbeat_at": "2026-10-30T08:40:23.480162Z",
  "last_location_at": "2026-10-30T08:40:23.480162Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "45c0c32f-8e03-45d7-a6a0-ac5016d34754",
  "quote_id": "13be74d5-4d3a-4f43-ab6a-f139ddd1bf5f",
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
  "id": "4b407aad-116f-4560-8294-e3c876815a23",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "549812f3-9212-443f-b4bf-aa4e728db1e1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:40:23.724354Z",
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
  "client_id": "549812f3-9212-443f-b4bf-aa4e728db1e1",
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
      "id": "c6be217f-55d1-4bff-8fa2-15815631c065",
      "at": "2026-10-30T08:40:22.215932Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
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
    "id": "9d68545f-9bb9-4c34-b933-211a7c6bbc9c",
    "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
    "expires_at": "2026-10-30T08:40:38.731406Z",
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

`POST /api/driver/v1/offers/9d68545f-9bb9-4c34-b933-211a7c6bbc9c/accept` → **200**

```json
{
  "command_id": "9bd43c86-4798-413e-a1cf-9aa0b24370d3"
}
```

```json
{
  "id": "37722f1b-1eb8-4f8c-bbd1-2040c78816a6",
  "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6dce82b1-3e7f-488d-bfb8-725ff93b8c1c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6dce82b1-3e7f-488d-bfb8-725ff93b8c1c",
  "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
  "assignment_id": "37722f1b-1eb8-4f8c-bbd1-2040c78816a6",
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

`POST /api/driver/v1/work-sessions/99faa810-e096-48de-987d-95d992dd95ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:25Z",
    "sequence": 1793349625138
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99faa810-e096-48de-987d-95d992dd95ee",
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
  "last_heartbeat_at": "2026-10-30T08:40:25.031724Z",
  "last_location_at": "2026-10-30T08:40:25.031724Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6dce82b1-3e7f-488d-bfb8-725ff93b8c1c/arrive` → **200**

```json
{
  "command_id": "555719f6-2e36-413c-ba71-aff865d3055b",
  "expected_version": 0
}
```

```json
{
  "id": "6dce82b1-3e7f-488d-bfb8-725ff93b8c1c",
  "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
  "assignment_id": "37722f1b-1eb8-4f8c-bbd1-2040c78816a6",
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
  "arrived_at": "2026-10-30T08:40:25.275857Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/6dce82b1-3e7f-488d-bfb8-725ff93b8c1c/start` → **200**

```json
{
  "command_id": "d59d9a64-cefd-4fff-83fb-a238401f7fbc",
  "expected_version": 1
}
```

```json
{
  "id": "6dce82b1-3e7f-488d-bfb8-725ff93b8c1c",
  "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
  "assignment_id": "37722f1b-1eb8-4f8c-bbd1-2040c78816a6",
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
  "arrived_at": "2026-10-30T08:40:25.275857Z",
  "started_at": "2026-10-30T08:40:25.536768Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/6dce82b1-3e7f-488d-bfb8-725ff93b8c1c/complete` → **200**

```json
{
  "command_id": "6ee212a2-2660-4782-91ac-aacd419fcc23",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:40:25Z",
  "cash_received": true
}
```

```json
{
  "id": "6dce82b1-3e7f-488d-bfb8-725ff93b8c1c",
  "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
  "assignment_id": "37722f1b-1eb8-4f8c-bbd1-2040c78816a6",
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
  "arrived_at": "2026-10-30T08:40:25.275857Z",
  "started_at": "2026-10-30T08:40:25.536768Z",
  "completed_at": "2026-10-30T08:40:25.793412Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "549812f3-9212-443f-b4bf-aa4e728db1e1",
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
      "id": "f85f9bd3-c767-4d28-9933-f9715e521f3e",
      "at": "2026-10-30T08:40:26.700482Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "4b407aad-116f-4560-8294-e3c876815a23"
    },
    {
      "id": "c6be217f-55d1-4bff-8fa2-15815631c065",
      "at": "2026-10-30T08:40:22.215932Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/a2f7420f-a60b-4cfb-a8d4-be49d0c2e1b9/archive` → **200**

```json
{
  "command_id": "dd947a17-df3d-4d91-beba-6c2260212ab6",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a2f7420f-a60b-4cfb-a8d4-be49d0c2e1b9",
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
  "created_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "created_at": "2026-10-30T08:40:21.105637Z",
  "updated_at": "2026-10-30T08:40:29.270699Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "99faa810-e096-48de-987d-95d992dd95ee",
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
  "last_heartbeat_at": "2026-10-30T08:40:25.031724Z",
  "last_location_at": "2026-10-30T08:40:25.031724Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/99faa810-e096-48de-987d-95d992dd95ee/close` → **200**

```json
{
  "command_id": "cef162cc-3776-4cf3-9bf7-1c526f3fd93c",
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

Done: order 4b407aad-116f-4560-8294-e3c876815a23.

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
  "session_id": "1a21d589-6f6b-4026-9226-a7b8a480d5d2",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1MzAsImlhdCI6MTc5MzM0OTYzMCwianRpIjoiOTJkMWQzYmItNjMxNi00OGQxLWJlZTUtNDVjNTA1ODhhYWZkIiwic2lkIjoiMWEyMWQ1ODktNmY2Yi00MDI2LTkyMjYtYTdiOGE0ODBkNWQyIn0.rfzoZipqeRUDsZUFpYIj-e36xkuPP5nz-tWQ2-XjqoQ",
  "access_expires_at": "2026-10-30T08:55:30.385821355Z",
  "refresh_token": "sc2fOsw39T75h_0xzbKjdIFOdFShQIf9a9PF80qQuso",
  "refresh_expires_at": "2026-10-30T20:40:30.385247035Z",
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
  "command_id": "8cff0f77-19ae-4301-8ec8-d2df2de698bc",
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
  "session_id": "5440320d-93f5-4628-b689-1672c845736e",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1MzEsImlhdCI6MTc5MzM0OTYzMSwianRpIjoiMjAxYTdjMDktYzQzMC00ODY1LWJlZDQtNmJiMmQzOTFhOWU5Iiwic2lkIjoiNTQ0MDMyMGQtOTNmNS00NjI4LWI2ODktMTY3MmM4NDU3MzZlIn0.-o-l6FBLVN-0u-69XKgpoqD1pq312caPjmRDU8t-J6g",
  "access_expires_at": "2026-10-30T08:55:31.456701319Z",
  "refresh_token": "h3rqPY00yuZqGTXnYneMAdHvOklDmVuxus4LnPAimIk",
  "refresh_expires_at": "2026-10-30T20:40:31.456143963Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2545022514",
    "linkedid": "1730052700.2545022514",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671301080"
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
    "id": "1730052700.2545022514",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "3b77f9c5-bb90-4271-8375-ac67982118a8",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380671301080",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:40:31.68297Z",
      "answered_at": null,
      "ended_at": "2026-10-30T08:40:31.706181Z",
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
    "id": "1730052600.2980630365",
    "linkedid": "1730052600.2980630365",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380671301080"
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
      "id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380671301080",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:40:31.975861Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/0d024f4a-c895-409b-8653-5ed4d8a82e89/answer` → **200**

```json
{
  "command_id": "5b9d028b-103a-4f5e-96b9-25d39ed4e5de"
}
```

```json
{
  "id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380671301080",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "order_ids": [],
  "started_at": "2026-10-30T08:40:31.975861Z",
  "answered_at": "2026-10-30T08:40:32.235049Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.2980630365",
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
    "id": "1730052600.2980630365",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671301080",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [],
      "started_at": "2026-10-30T08:40:31.975861Z",
      "answered_at": "2026-10-30T08:40:32.235049Z",
      "ended_at": "2026-10-30T08:40:32.488369Z",
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
      "id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671301080",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [],
      "started_at": "2026-10-30T08:40:31.975861Z",
      "answered_at": "2026-10-30T08:40:32.235049Z",
      "ended_at": "2026-10-30T08:40:32.488369Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:40:33.321123Z"
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
      "id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671301080",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [],
      "started_at": "2026-10-30T08:40:31.975861Z",
      "answered_at": "2026-10-30T08:40:32.235049Z",
      "ended_at": "2026-10-30T08:40:32.488369Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:40:33.321123Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/0d024f4a-c895-409b-8653-5ed4d8a82e89/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/0d024f4a-c895-409b-8653-5ed4d8a82e89/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=0d024f4a-c895-409b-8653-5ed4d8a82e89` → **200**

```json
{
  "changes": [
    {
      "id": "d1e0c07f-7012-42af-ad47-871449459ba2",
      "occurred_at": "2026-10-30T08:40:35.232036Z",
      "actor_type": "STAFF",
      "actor_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a69bbf0e-10cd-4778-aa32-ba433c6df11f\", \"order_ids\": []}",
      "correlation_id": "0b07713c-4cf3-48e6-88ff-942422ace337"
    },
    {
      "id": "654f8a10-0ca4-44b1-ad0a-194a596ac925",
      "occurred_at": "2026-10-30T08:40:35.200593Z",
      "actor_type": "STAFF",
      "actor_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"a69bbf0e-10cd-4778-aa32-ba433c6df11f\", \"order_ids\": []}",
      "correlation_id": "a231039b-1774-4371-b8b8-a3b02b24db25"
    }
  ]
}
```

Done: call 0d024f4a-c895-409b-8653-5ed4d8a82e89 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20341"
}
```

```json
{
  "challenge_id": "f512f3b9-fdb6-45e6-a511-effdb6d6d5be",
  "expires_at": "2026-10-30T08:45:35.640022373Z",
  "resend_available_at": "2026-10-30T08:40:36.640022373Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "876949",
  "sent_at": "2026-10-30T08:40:35.803074978Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f512f3b9-fdb6-45e6-a511-effdb6d6d5be",
  "code": "876949",
  "device_ref": "sandbox-20341"
}
```

```json
{
  "session_id": "7c02ec8f-21a8-41ea-a51a-9f31349a4808",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDUzNiwiaWF0IjoxNzkzMzQ5NjM2LCJqdGkiOiI1NzNjZDg4YS1mMWI1LTQ0YzItOTg2Zi1kNjU0ZmUxZTY0MTciLCJzaWQiOiI3YzAyZWM4Zi0yMWE4LTQxZWEtYTUxYS05ZjMxMzQ5YTQ4MDgifQ.eEmTIbk5NsmQ-E9bthoM8RVOjtbBJDpnM61WDKCQOH0",
  "access_expires_at": "2026-10-30T08:55:36.070176197Z",
  "refresh_token": "GU-e-tXozJtGp0kApsF6x5pnd1Hpf5tSupR834AibvE",
  "refresh_expires_at": "2026-11-29T08:40:36.06961083Z",
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
  "command_id": "3190f8b8-6552-43e0-8f27-2f4387fa5ac7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:36Z",
    "sequence": 1793349636516
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79fc07c5-e166-46c9-b7b3-d6f7a1f16d95",
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
  "last_heartbeat_at": "2026-10-30T08:40:36.534944Z",
  "last_location_at": "2026-10-30T08:40:36.534944Z",
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
  "session_id": "3bdba2dd-5133-488c-b3e2-2b84a1b7d264",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1MzcsImlhdCI6MTc5MzM0OTYzNywianRpIjoiMTY1OGI4YWYtZjY1NC00YTk3LTkwMjgtMDQ4M2RiZjY5Y2Y0Iiwic2lkIjoiM2JkYmEyZGQtNTEzMy00ODhjLWIzZTItMmI4NGExYjdkMjY0In0.YCTuSaZxeUpkC8j5QcZXUSS6b1g4LbBK6svblj-nGVs",
  "access_expires_at": "2026-10-30T08:55:37.069469494Z",
  "refresh_token": "mx5pFpPx6HpD4tJWNFDorY9l-vnfoFDYP7ryWCrX3BA",
  "refresh_expires_at": "2026-10-30T20:40:37.068350878Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "7bcf9eaa-096b-4219-a79c-a526d7ef298a",
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
  "id": "ea0587fc-e533-40fd-8121-dc8b294d5807",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:37.334705Z",
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
  "command_id": "83c0e3e0-fbbc-444f-9c15-a28ccf65a2d0",
  "quote_id": "ea0587fc-e533-40fd-8121-dc8b294d5807",
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
    "phone": "+380675419444"
  }
}
```

```json
{
  "id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
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
  "created_at": "2026-10-30T08:40:37.596884Z",
  "caller": {
    "name": "Олена",
    "phone": "+380675419444"
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
    "id": "63af0d44-a1b2-4c35-a207-0550fd3f0409",
    "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
    "expires_at": "2026-10-30T08:40:52.601171Z",
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

`POST /api/driver/v1/offers/63af0d44-a1b2-4c35-a207-0550fd3f0409/accept` → **200**

```json
{
  "command_id": "dad8affe-5728-4dbc-9f04-89e22683a17f"
}
```

```json
{
  "id": "4dec4fb1-3171-4e6e-a22d-36904857ae5e",
  "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c",
  "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
  "assignment_id": "4dec4fb1-3171-4e6e-a22d-36904857ae5e",
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
    "phone": "+380675419444"
  }
}
```

`POST /api/driver/v1/work-sessions/79fc07c5-e166-46c9-b7b3-d6f7a1f16d95/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:40Z",
    "sequence": 1793349640671
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "79fc07c5-e166-46c9-b7b3-d6f7a1f16d95",
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
  "last_heartbeat_at": "2026-10-30T08:40:40.689565Z",
  "last_location_at": "2026-10-30T08:40:40.689565Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c/arrive` → **200**

```json
{
  "command_id": "f6c1b0bc-9810-40d6-8a2e-3380ff6c8ce9",
  "expected_version": 0
}
```

```json
{
  "id": "2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c",
  "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
  "assignment_id": "4dec4fb1-3171-4e6e-a22d-36904857ae5e",
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
  "arrived_at": "2026-10-30T08:40:40.926858Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675419444"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  },
  {
    "phone": "+380675419444",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:42.721284758Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  },
  {
    "phone": "+380675419444",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:42.721284758Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380675419444` → **200**

```json
[
  {
    "phone": "+380675419444",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:39.560413728Z"
  },
  {
    "phone": "+380675419444",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-30T08:40:42.721284758Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c/start` → **200**

```json
{
  "command_id": "469c8b63-1291-436d-93e7-f31dcfeb4ec2",
  "expected_version": 1
}
```

```json
{
  "id": "2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c",
  "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
  "assignment_id": "4dec4fb1-3171-4e6e-a22d-36904857ae5e",
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
  "arrived_at": "2026-10-30T08:40:40.926858Z",
  "started_at": "2026-10-30T08:40:43.347558Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380675419444"
  }
}
```

`POST /api/driver/v1/trips/2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c/complete` → **200**

```json
{
  "command_id": "3c0f0b16-e35e-4440-9ab9-47b205eb2351",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:40:43Z",
  "cash_received": true
}
```

```json
{
  "id": "2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c",
  "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
  "assignment_id": "4dec4fb1-3171-4e6e-a22d-36904857ae5e",
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
  "arrived_at": "2026-10-30T08:40:40.926858Z",
  "started_at": "2026-10-30T08:40:43.347558Z",
  "completed_at": "2026-10-30T08:40:43.591617Z",
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
  "session_id": "79fc07c5-e166-46c9-b7b3-d6f7a1f16d95",
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
  "last_heartbeat_at": "2026-10-30T08:40:40.689565Z",
  "last_location_at": "2026-10-30T08:40:40.689565Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/79fc07c5-e166-46c9-b7b3-d6f7a1f16d95/close` → **200**

```json
{
  "command_id": "b85ddad2-5c5b-49cc-b19a-94fcf92c8b33",
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
  "phone": "+380632491078",
  "device_ref": "sandbox-16938"
}
```

```json
{
  "challenge_id": "7a0ad21e-c28a-4a67-9c63-541494509eca",
  "expires_at": "2026-10-30T08:45:44.301810603Z",
  "resend_available_at": "2026-10-30T08:40:45.301810603Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632491078` → **200**

```json
{
  "phone": "+380632491078",
  "audience": "CLIENT",
  "code": "572816",
  "sent_at": "2026-10-30T08:40:44.305179861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a0ad21e-c28a-4a67-9c63-541494509eca",
  "code": "572816",
  "device_ref": "sandbox-16938"
}
```

```json
{
  "session_id": "7d558aa8-4f7f-48c3-8d47-4d7635276ff1",
  "subject": {
    "type": "CLIENT",
    "id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmODY1ZjdlMy0wZjdkLTQ3Y2MtYTNhMC00ZjhkYjZhMTA4NGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTQ0LCJpYXQiOjE3OTMzNDk2NDQsImp0aSI6ImM0OTBjMWMyLTE2YTAtNGFmZS04YTk5LTIzMGU0NWI1MWY4NCIsInNpZCI6IjdkNTU4YWE4LTRmN2YtNDhjMy04ZDQ3LTRkNzYzNTI3NmZmMSJ9.XIR8Hu3frwLLJLVwnTcmRh7mMhXkIQ08X2lGmreBUz4",
  "access_expires_at": "2026-10-30T08:55:44.553762873Z",
  "refresh_token": "lDx61bmoMT2kBGsFap5EKXDPmiNzQcHAj2VnicNjTJI",
  "refresh_expires_at": "2026-11-29T08:40:44.553253509Z",
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
  "device_ref": "sandbox-13538"
}
```

```json
{
  "challenge_id": "3764163a-22d0-4457-a862-8b6a1af5e46d",
  "expires_at": "2026-10-30T08:45:45.012264161Z",
  "resend_available_at": "2026-10-30T08:40:46.012264161Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "437809",
  "sent_at": "2026-10-30T08:40:45.015756332Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3764163a-22d0-4457-a862-8b6a1af5e46d",
  "code": "437809",
  "device_ref": "sandbox-13538"
}
```

```json
{
  "session_id": "2f7e63c1-c0ff-4e23-87d4-627cfca48c95",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDU0NSwiaWF0IjoxNzkzMzQ5NjQ1LCJqdGkiOiI4YTQzZjAzMC02ZDhiLTRmMzctOWQ5NC1lYzg3YzZhMGM2NmMiLCJzaWQiOiIyZjdlNjNjMS1jMGZmLTRlMjMtODdkNC02MjdjZmNhNDhjOTUifQ.GTh5XtbviqV9lp_uWZwKbZoKnpVV5j8gLYlGhStQYP8",
  "access_expires_at": "2026-10-30T08:55:45.269024609Z",
  "refresh_token": "98goROmH-qUyGSoKicx4LDCZSPdxMUBJa1d5yDQUgAI",
  "refresh_expires_at": "2026-11-29T08:40:45.268456087Z",
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
  "session_id": "c57529cd-ca9d-488c-8b3b-1eb036e99720",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1NDUsImlhdCI6MTc5MzM0OTY0NSwianRpIjoiYTgxYzRiZWQtZjUzOS00ZjQzLWFhZDMtNDJmNjAyMGZiMGEzIiwic2lkIjoiYzU3NTI5Y2QtY2E5ZC00ODhjLThiM2ItMWViMDM2ZTk5NzIwIn0.D7cEup2acl4ttSasHznoV8SN_FepeRJZycS8vGSWFw0",
  "access_expires_at": "2026-10-30T08:55:45.983031558Z",
  "refresh_token": "9i-dsuX5jiF6dA-LbEcZMpjWVTzghTBJO7EbGbzm0qc",
  "refresh_expires_at": "2026-10-30T20:40:45.982499781Z",
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
  "session_id": "97888792-bcc6-475a-bec3-9a8b4961c713",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1NDYsImlhdCI6MTc5MzM0OTY0NiwianRpIjoiMDYxNjY4NGEtMDU0Ni00ZDkwLTk0ZWQtNDExNjRjN2EzY2RkIiwic2lkIjoiOTc4ODg3OTItYmNjNi00NzVhLWJlYzMtOWE4YjQ5NjFjNzEzIn0.AVClQxwwyq4cyjL-wj-urOwhvsIbjXULD5hMp2ZEByQ",
  "access_expires_at": "2026-10-30T08:55:46.738666937Z",
  "refresh_token": "qMbDiW46EfxIRWxMe7JdERQWBnGL8CSnIrT9bHomllA",
  "refresh_expires_at": "2026-10-30T20:40:46.738099268Z",
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
  "command_id": "d1fa249a-8214-456b-b99d-4e50a0e1c6de",
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
  "id": "a612eac0-0bb5-4414-bf2b-12b79ed2a940",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:47.201306Z",
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
  "command_id": "e817ccaa-61d8-4dc4-aeb2-d6844bf2848d",
  "quote_id": "a612eac0-0bb5-4414-bf2b-12b79ed2a940",
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
  "id": "fbc27bdd-b592-48a3-8826-1f591704b130",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e",
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
  "created_at": "2026-10-30T08:40:47.444305Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fbc27bdd-b592-48a3-8826-1f591704b130` → **200**

```json
{
  "id": "fbc27bdd-b592-48a3-8826-1f591704b130",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e",
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
  "created_at": "2026-10-30T08:40:47.444305Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/fbc27bdd-b592-48a3-8826-1f591704b130/cancel` → **200**

```json
{
  "command_id": "aa37e298-94a0-42c1-9918-b9d9daf1af01",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "fbc27bdd-b592-48a3-8826-1f591704b130",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e",
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
  "created_at": "2026-10-30T08:40:47.444305Z",
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
  "command_id": "65ec7bab-7375-4fb6-afa2-68f210d4515f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:48Z",
    "sequence": 1793349648412
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2b7891e-1d0e-4f9d-9069-247367bb97fd",
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
  "last_heartbeat_at": "2026-10-30T08:40:48.430567Z",
  "last_location_at": "2026-10-30T08:40:48.430567Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-29801"
}
```

```json
{
  "challenge_id": "80d728c1-abb1-43d9-8bda-34532ce67d45",
  "expires_at": "2026-10-30T08:45:48.806854193Z",
  "resend_available_at": "2026-10-30T08:40:49.806854193Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "327651",
  "sent_at": "2026-10-30T08:40:48.809667267Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "80d728c1-abb1-43d9-8bda-34532ce67d45",
  "code": "327651",
  "device_ref": "sandbox-29801"
}
```

```json
{
  "session_id": "f80d21fa-9b34-4bee-bb55-f190aa688f84",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDU0OSwiaWF0IjoxNzkzMzQ5NjQ5LCJqdGkiOiIyNjVjYjAxYi1iYzQyLTRmYWMtOGExYy04YWVlMjE3NjY3Y2QiLCJzaWQiOiJmODBkMjFmYS05YjM0LTRiZWUtYmI1NS1mMTkwYWE2ODhmODQifQ.zwnjTT91w4g_p8gMrLH1wr1EH16A4et-Zxi4aVoyvZg",
  "access_expires_at": "2026-10-30T08:55:49.052990884Z",
  "refresh_token": "QGNC7e-FAYQpQuH9QXvnVQviPNDsSkUimcXKN47a-PQ",
  "refresh_expires_at": "2026-11-29T08:40:49.052482813Z",
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
  "command_id": "c6e76ef7-ae8e-4b49-a985-9dee4606789d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:49Z",
    "sequence": 1793349649493
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:40:49.512215Z",
  "last_location_at": "2026-10-30T08:40:49.512215Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "85e03c7a-705b-4ce4-a0da-1ec99cc8b40c",
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
  "id": "588b0c08-0b2e-48ec-bb99-4b292b87e23b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:49.745397Z",
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
  "command_id": "b597e375-1f34-4af4-b3b6-53fb138d8589",
  "quote_id": "588b0c08-0b2e-48ec-bb99-4b292b87e23b",
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
  "id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e",
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
  "created_at": "2026-10-30T08:40:49.992239Z",
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
    "id": "20a98c2c-e924-4a1d-8396-1c72f33ee083",
    "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
    "expires_at": "2026-10-30T08:41:04.995267Z",
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

`POST /api/driver/v1/offers/20a98c2c-e924-4a1d-8396-1c72f33ee083/accept` → **200**

```json
{
  "command_id": "ad50cae3-3434-426f-8b87-125bbca7ad74"
}
```

```json
{
  "id": "744dd75e-c4ba-410a-83a2-feffebd5bca9",
  "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5424073a-50f7-4df5-8693-142c24971fb1",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5424073a-50f7-4df5-8693-142c24971fb1",
  "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "assignment_id": "744dd75e-c4ba-410a-83a2-feffebd5bca9",
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

`POST /api/driver/v1/trips/5424073a-50f7-4df5-8693-142c24971fb1/cancel` → **200**

```json
{
  "command_id": "5cb07773-4eda-4683-9372-5b24d4fb92aa",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "5424073a-50f7-4df5-8693-142c24971fb1",
  "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "assignment_id": "744dd75e-c4ba-410a-83a2-feffebd5bca9",
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

`GET /api/rider/v1/orders/e9378638-0a88-483e-84fc-5a2bb9f7721b` → **200**

```json
{
  "id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e",
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
    "id": "744dd75e-c4ba-410a-83a2-feffebd5bca9",
    "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "5424073a-50f7-4df5-8693-142c24971fb1",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:40:49.992239Z",
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
    "id": "7b9b9b2b-d2b0-43e5-8caa-862661914332",
    "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
    "expires_at": "2026-10-30T08:41:05.959602Z",
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

`POST /api/driver/v1/offers/7b9b9b2b-d2b0-43e5-8caa-862661914332/accept` → **200**

```json
{
  "command_id": "7835b1b3-8c52-49d8-bc2c-88b95a5263d3"
}
```

```json
{
  "id": "ab5aeaf7-18a5-4814-99ad-6fd85d05b94c",
  "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f160978b-28fe-4ab3-9072-749b33693d86",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f160978b-28fe-4ab3-9072-749b33693d86",
  "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "assignment_id": "ab5aeaf7-18a5-4814-99ad-6fd85d05b94c",
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

`POST /api/driver/v1/trips/f160978b-28fe-4ab3-9072-749b33693d86/cancel` → **200**

```json
{
  "command_id": "b6e285de-bdcd-4a72-86b6-365846f26fc6",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "f160978b-28fe-4ab3-9072-749b33693d86",
  "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
  "assignment_id": "ab5aeaf7-18a5-4814-99ad-6fd85d05b94c",
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
    "id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:40:49.992239Z",
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
    "id": "fbc27bdd-b592-48a3-8826-1f591704b130",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:40:47.444305Z",
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

`GET /api/operator/v1/orders/e9378638-0a88-483e-84fc-5a2bb9f7721b/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:40:49.992842Z",
      "actor": {
        "type": "CLIENT",
        "id": "f865f7e3-0f7d-47cc-a3a0-4f8db6a1084e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
        "quote_id": "588b0c08-0b2e-48ec-bb99-4b292b87e23b",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "bf6fd2f5-45ee-453d-8680-b60d402a63c6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:40:49.994558Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
        "attempt_id": "bf24ed8d-3a54-4a14-8665-599e3612a125",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "bf6fd2f5-45ee-453d-8680-b60d402a63c6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:40:50.000507Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "20a98c2c-e924-4a1d-8396-1c72f33ee083",
        "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "bf6fd2f5-45ee-453d-8680-b60d402a63c6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:40:50.475106Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "20a98c2c-e924-4a1d-8396-1c72f33ee083",
        "order_id": "e9378638-0a88-483e-84fc-5a2bb9f7721b",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "744dd75e-c4ba-410a-83a2-feffebd5bca9"
      },
      "correlation_id": "e84ae8f7-f993-4393-b747-d21205151b9a"
```

Done: orders fbc27bdd-b592-48a3-8826-1f591704b130, e9378638-0a88-483e-84fc-5a2bb9f7721b.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380738632782",
  "device_ref": "sandbox-8397"
}
```

```json
{
  "challenge_id": "39e7e2c4-ea48-41fc-8e05-1025bb8b822e",
  "expires_at": "2026-10-30T08:45:52.831117795Z",
  "resend_available_at": "2026-10-30T08:40:53.831117795Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380738632782` → **200**

```json
{
  "phone": "+380738632782",
  "audience": "CLIENT",
  "code": "511412",
  "sent_at": "2026-10-30T08:40:52.833724865Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "39e7e2c4-ea48-41fc-8e05-1025bb8b822e",
  "code": "511412",
  "device_ref": "sandbox-8397"
}
```

```json
{
  "session_id": "a411400c-e9e0-4750-a6ed-21a77c7ce259",
  "subject": {
    "type": "CLIENT",
    "id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0NGU5NDA5My1jM2M4LTRmMzgtOGYzYS1kOGQzNDg1N2JmZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTUzLCJpYXQiOjE3OTMzNDk2NTMsImp0aSI6IjQwNzI1OTdlLWUwNDItNDdhNy04ZWI1LTk2Zjk2N2RlNDEwYSIsInNpZCI6ImE0MTE0MDBjLWU5ZTAtNDc1MC1hNmVkLTIxYTc3YzdjZTI1OSJ9.-MzoHsg-SXN8lJdnYN-HQY-gI4EXWPuEEAJYc2_-QvI",
  "access_expires_at": "2026-10-30T08:55:53.082290016Z",
  "refresh_token": "YLp-Hf_ZbNbA74CcyfOTAma28025VfVfGgVpLnX2dMs",
  "refresh_expires_at": "2026-11-29T08:40:53.081794742Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "76ed03b0-c3c3-4602-a571-f979aa4535f5",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f350a85f-dc8f-4d55-b542-55fd96bf6f18",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f350a85f-dc8f-4d55-b542-55fd96bf6f18",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "8b83a238613a58e3fc7afa7ca2e84fe3",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f350a85f-dc8f-4d55-b542-55fd96bf6f18",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380738632782"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f350a85f-dc8f-4d55-b542-55fd96bf6f18",
  "expires_at": "2026-10-30T09:10:53.315231Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/f350a85f-dc8f-4d55-b542-55fd96bf6f18` → **200**

```json
{
  "id": "f350a85f-dc8f-4d55-b542-55fd96bf6f18",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:10:53.315231Z",
  "card": {
    "id": "cdf84181-aca5-47ad-8eab-57240b4bc867",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0805",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:40:53.559203Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "cdf84181-aca5-47ad-8eab-57240b4bc867",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0805",
      "card_type": "Visa",
      "created_at": "2026-10-30T08:40:53.559203Z"
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
  "device_ref": "sandbox-18998"
}
```

```json
{
  "challenge_id": "d46deeb8-dd18-4bb6-a232-f4388a1ccc04",
  "expires_at": "2026-10-30T08:45:54.046469566Z",
  "resend_available_at": "2026-10-30T08:40:55.046469566Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "406328",
  "sent_at": "2026-10-30T08:40:54.053694374Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d46deeb8-dd18-4bb6-a232-f4388a1ccc04",
  "code": "406328",
  "device_ref": "sandbox-18998"
}
```

```json
{
  "session_id": "bc8a962f-95e3-41b1-bb87-afbe1a48e405",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDU1NCwiaWF0IjoxNzkzMzQ5NjU0LCJqdGkiOiI1MWEzOTVkOC1hZTJhLTRkODgtYTFkOS01NmVjY2QyYzk0Y2UiLCJzaWQiOiJiYzhhOTYyZi05NWUzLTQxYjEtYmI4Ny1hZmJlMWE0OGU0MDUifQ.gftJBh302GkC5pxgH6fe0ItHn0vUyybBavs7Gof6zPg",
  "access_expires_at": "2026-10-30T08:55:54.311360461Z",
  "refresh_token": "KlnHyB9zgAy4NN8Z89GRKxAu4SasNnbjnl9qSoKFxac",
  "refresh_expires_at": "2026-11-29T08:40:54.310814522Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:40:49.512215Z",
  "last_location_at": "2026-10-30T08:40:49.512215Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/56bbe982-953f-495e-988e-eb23a3fcb468/handover` → **200**

```json
{
  "command_id": "d01ba12a-1a00-4165-89c5-50cb8dfe62ad",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:40:49.512215Z",
  "last_location_at": "2026-10-30T08:40:49.512215Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/56bbe982-953f-495e-988e-eb23a3fcb468/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:55Z",
    "sequence": 1793349655233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:40:55.25134Z",
  "last_location_at": "2026-10-30T08:40:55.25134Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b1a793b1-c985-4d3e-9aee-bc4ec016d0ae",
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
  "id": "dc949936-17ef-4857-975c-6efb25e33e7b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:45:55.494015Z",
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
  "command_id": "d272955b-b555-4a5e-b3a4-5f60579ef85b",
  "quote_id": "dc949936-17ef-4857-975c-6efb25e33e7b",
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
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
  "created_at": "2026-10-30T08:40:55.743504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8` → **200**

```json
{
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
  "created_at": "2026-10-30T08:40:55.743504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8` → **200**

```json
{
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
  "created_at": "2026-10-30T08:40:55.743504Z",
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
    "id": "c625a9a0-4faf-4520-9918-aeae1522959d",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "expires_at": "2026-10-30T08:41:11.328427Z",
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

`POST /api/driver/v1/offers/c625a9a0-4faf-4520-9918-aeae1522959d/accept` → **200**

```json
{
  "command_id": "9b1815a8-14a7-4f87-ab87-12ad9666f90f"
}
```

```json
{
  "id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "assignment_id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
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

`POST /api/driver/v1/work-sessions/56bbe982-953f-495e-988e-eb23a3fcb468/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:40:58Z",
    "sequence": 1793349658679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:40:58.69708Z",
  "last_location_at": "2026-10-30T08:40:58.69708Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7c6a3cb0-60b9-4297-8fe2-2786aad14a7a/arrive` → **200**

```json
{
  "command_id": "370b7e1d-7fcf-44de-b704-2d0686276200",
  "expected_version": 0
}
```

```json
{
  "id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "assignment_id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
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
  "arrived_at": "2026-10-30T08:40:58.933344Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7c6a3cb0-60b9-4297-8fe2-2786aad14a7a/start` → **200**

```json
{
  "command_id": "4a1304cd-f6c6-42d4-8a56-a58d4cd7bd16",
  "expected_version": 1
}
```

```json
{
  "id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "assignment_id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
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
  "arrived_at": "2026-10-30T08:40:58.933344Z",
  "started_at": "2026-10-30T08:40:59.179721Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7c6a3cb0-60b9-4297-8fe2-2786aad14a7a/complete` → **200**

```json
{
  "command_id": "ec519f75-4891-4afb-8f84-1c08af0a7d45",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:40:59Z",
  "cash_received": true
}
```

```json
{
  "id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "assignment_id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
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
  "arrived_at": "2026-10-30T08:40:58.933344Z",
  "started_at": "2026-10-30T08:40:59.179721Z",
  "completed_at": "2026-10-30T08:40:59.428875Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8` → **200**

```json
{
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
    "id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:40:55.743504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8` → **200**

```json
{
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
    "id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:40:55.743504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8` → **200**

```json
{
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
    "id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:40:55.743504Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8` → **200**

```json
{
  "id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
    "id": "f915ee72-dd49-4ee4-8e8a-55b361870ceb",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7c6a3cb0-60b9-4297-8fe2-2786aad14a7a",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:40:55.743504Z",
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

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8/tip` → **200**

```json
{
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
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
  "available_until": "2026-10-31T08:40:59.428875Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8/tip` → **201**

```json
{
  "command_id": "3dd76aa1-7deb-4fac-a743-76a6331c03c1",
  "amount_minor": 2500
}
```

```json
{
  "id": "f6e2e74e-271e-4630-9c60-d611a03d2c93",
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:41:04.112854Z"
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8/tip` → **200**

```json
{
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
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
  "available_until": "2026-10-31T08:40:59.428875Z",
  "open": false,
  "tip": {
    "id": "f6e2e74e-271e-4630-9c60-d611a03d2c93",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:41:04.112854Z"
  }
}
```

`GET /api/rider/v1/orders/f2431044-2fb9-446d-b0d9-7a1f57e308b8/tip` → **200**

```json
{
  "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
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
  "available_until": "2026-10-31T08:40:59.428875Z",
  "open": false,
  "tip": {
    "id": "f6e2e74e-271e-4630-9c60-d611a03d2c93",
    "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:41:04.112854Z"
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
      "id": "09bae574-0c94-41b0-8be4-589729772e30",
      "at": "2026-10-30T08:41:05.625935Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
      "counterpart_id": null
    },
    {
      "id": "cbfcab4b-d61b-4bf7-94c9-88c08830301a",
      "at": "2026-10-30T08:41:00.400624Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5d6ddae2-007c-4926-bb6a-7728272e8347",
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
  "id": "4eb579b7-3752-4a22-a9bf-ee57ab66676f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:06.062977Z",
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
  "session_id": "b6cc21d2-fa38-4846-8c29-6733ecf0935d",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1NjYsImlhdCI6MTc5MzM0OTY2NiwianRpIjoiM2M1ZDM0OTgtYmIwMy00Y2MzLTk2YTctYjFmZWNmMjM4MDUyIiwic2lkIjoiYjZjYzIxZDItZmEzOC00ODQ2LThjMjktNjczM2VjZjA5MzVkIn0.RtwLOaas0EwLewxI9jlQ4vfMHGBVYvKS0ozPE1ir6r8",
  "access_expires_at": "2026-10-30T08:56:06.562734003Z",
  "refresh_token": "a91h6zjbofsBrxfnDLq-KFcJIF1rk-xui3-NSh6SI6c",
  "refresh_expires_at": "2026-10-30T20:41:06.562234363Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380738632782` → **200**

```json
{
  "client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9"
}
```

`POST /api/admin/v1/rider-wallets/44e94093-c3c8-4f38-8f3a-d8d34857bff9/top-ups` → **201**

```json
{
  "command_id": "13289777-c16d-4ccf-a1f7-d377cc0465a1",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
      "id": "58338e0f-1ef3-4ad5-a92c-3146f0b821ae",
      "at": "2026-10-30T08:41:07.05172Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c5aea4a8-74c6-4cb9-a9ce-da1e63c68955",
  "quote_id": "4eb579b7-3752-4a22-a9bf-ee57ab66676f",
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
  "id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
  "created_at": "2026-10-30T08:41:07.295206Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/059fd5d0-4c55-4d94-ba27-696462335565` → **200**

```json
{
  "id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
  "created_at": "2026-10-30T08:41:07.295206Z",
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
    "id": "e8e649d1-b0bc-4b6c-93e7-a3c7fe611a4a",
    "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
    "expires_at": "2026-10-30T08:41:22.299606Z",
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

`POST /api/driver/v1/offers/e8e649d1-b0bc-4b6c-93e7-a3c7fe611a4a/accept` → **200**

```json
{
  "command_id": "51140999-0fe4-4695-8ab4-9d389cf843e5"
}
```

```json
{
  "id": "a4a75975-e78c-48a7-999e-b2abd1669b09",
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "639d9b44-712d-4726-89d4-f2bbcb2d1515",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "639d9b44-712d-4726-89d4-f2bbcb2d1515",
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "assignment_id": "a4a75975-e78c-48a7-999e-b2abd1669b09",
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

`POST /api/driver/v1/work-sessions/56bbe982-953f-495e-988e-eb23a3fcb468/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:08Z",
    "sequence": 1793349668468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:41:08.486007Z",
  "last_location_at": "2026-10-30T08:41:08.486007Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/639d9b44-712d-4726-89d4-f2bbcb2d1515/arrive` → **200**

```json
{
  "command_id": "a565dca9-d6a2-4d8a-af56-63a9d0222d71",
  "expected_version": 0
}
```

```json
{
  "id": "639d9b44-712d-4726-89d4-f2bbcb2d1515",
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "assignment_id": "a4a75975-e78c-48a7-999e-b2abd1669b09",
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
  "arrived_at": "2026-10-30T08:41:08.746046Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/639d9b44-712d-4726-89d4-f2bbcb2d1515/start` → **200**

```json
{
  "command_id": "b966e8cc-afa2-4d1d-9cf3-53a15eaf0d6c",
  "expected_version": 1
}
```

```json
{
  "id": "639d9b44-712d-4726-89d4-f2bbcb2d1515",
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "assignment_id": "a4a75975-e78c-48a7-999e-b2abd1669b09",
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
  "arrived_at": "2026-10-30T08:41:08.746046Z",
  "started_at": "2026-10-30T08:41:08.992495Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/639d9b44-712d-4726-89d4-f2bbcb2d1515/complete` → **200**

```json
{
  "command_id": "056d1f52-78ca-40df-bbe3-219b3ebb0bab",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:41:09Z",
  "cash_received": true
}
```

```json
{
  "id": "639d9b44-712d-4726-89d4-f2bbcb2d1515",
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "assignment_id": "a4a75975-e78c-48a7-999e-b2abd1669b09",
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
  "arrived_at": "2026-10-30T08:41:08.746046Z",
  "started_at": "2026-10-30T08:41:08.992495Z",
  "completed_at": "2026-10-30T08:41:09.239284Z",
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
  "client_id": "44e94093-c3c8-4f38-8f3a-d8d34857bff9",
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
      "id": "58338e0f-1ef3-4ad5-a92c-3146f0b821ae",
      "at": "2026-10-30T08:41:07.05172Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
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

`GET /api/rider/v1/orders/059fd5d0-4c55-4d94-ba27-696462335565/tip` → **200**

```json
{
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
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
  "available_until": "2026-10-31T08:41:09.239284Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/059fd5d0-4c55-4d94-ba27-696462335565/tip` → **201**

```json
{
  "command_id": "66316d3b-d08a-4470-8811-56f99633e0d9",
  "amount_minor": 2500
}
```

```json
{
  "id": "af42295d-58d9-44eb-bf43-49f48fc0f08f",
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-30T08:41:10.198347Z"
}
```

`GET /api/rider/v1/orders/059fd5d0-4c55-4d94-ba27-696462335565/tip` → **200**

```json
{
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
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
  "available_until": "2026-10-31T08:41:09.239284Z",
  "open": false,
  "tip": {
    "id": "af42295d-58d9-44eb-bf43-49f48fc0f08f",
    "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-30T08:41:10.198347Z"
  }
}
```

`GET /api/rider/v1/orders/059fd5d0-4c55-4d94-ba27-696462335565/tip` → **200**

```json
{
  "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
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
  "available_until": "2026-10-31T08:41:09.239284Z",
  "open": false,
  "tip": {
    "id": "af42295d-58d9-44eb-bf43-49f48fc0f08f",
    "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-30T08:41:10.198347Z"
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
      "id": "ffd0e782-5389-4a00-a94a-e33cf1582855",
      "at": "2026-10-30T08:41:11.855285Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
      "counterpart_id": null
    },
    {
      "id": "78073d56-27a8-432c-8e05-8031c1cad4d7",
      "at": "2026-10-30T08:41:09.826539Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "059fd5d0-4c55-4d94-ba27-696462335565",
      "counterpart_id": null
    },
    {
      "id": "09bae574-0c94-41b0-8be4-589729772e30",
      "at": "2026-10-30T08:41:05.625935Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
      "counterpart_id": null
    },
    {
      "id": "cbfcab4b-d61b-4bf7-94c9-88c08830301a",
      "at": "2026-10-30T08:41:00.400624Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "f2431044-2fb9-446d-b0d9-7a1f57e308b8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "56bbe982-953f-495e-988e-eb23a3fcb468",
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
  "last_heartbeat_at": "2026-10-30T08:41:08.486007Z",
  "last_location_at": "2026-10-30T08:41:08.486007Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/56bbe982-953f-495e-988e-eb23a3fcb468/close` → **200**

```json
{
  "command_id": "5b6beea2-ed05-4cab-b8ae-dad2dea68ca5",
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

Done: card order 059fd5d0-4c55-4d94-ba27-696462335565.

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
  "phone": "+380734371082",
  "device_ref": "sandbox-7938"
}
```

```json
{
  "challenge_id": "163f86e4-b42b-4225-913d-bcb4b6c98afd",
  "expires_at": "2026-10-30T08:46:12.851159553Z",
  "resend_available_at": "2026-10-30T08:41:13.851159553Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734371082` → **200**

```json
{
  "phone": "+380734371082",
  "audience": "CLIENT",
  "code": "494257",
  "sent_at": "2026-10-30T08:41:12.853618337Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "163f86e4-b42b-4225-913d-bcb4b6c98afd",
  "code": "494257",
  "device_ref": "sandbox-7938"
}
```

```json
{
  "session_id": "cceef62f-1894-432e-a99f-456ab3d07362",
  "subject": {
    "type": "CLIENT",
    "id": "145db39f-5097-4828-92a3-68a60446e9a4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNDVkYjM5Zi01MDk3LTQ4MjgtOTJhMy02OGE2MDQ0NmU5YTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTczLCJpYXQiOjE3OTMzNDk2NzMsImp0aSI6ImU5YjgwZTFkLTViMmUtNDMwMi05MTRmLTQzNWZhZDI4YTU5MCIsInNpZCI6ImNjZWVmNjJmLTE4OTQtNDMyZS1hOTlmLTQ1NmFiM2QwNzM2MiJ9.U0zyfU17T1amn3ZWoZva_wL16QucBR4T7RrhhGThCzY",
  "access_expires_at": "2026-10-30T08:56:13.168634412Z",
  "refresh_token": "ii3G_oPNoY-znt3lUs5GthMsWVC6IBTKYjxUfBYUxNQ",
  "refresh_expires_at": "2026-11-29T08:41:13.168100371Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "a516e316-2a52-4a8e-91d7-610eb2bddcb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "4ef043b8-886d-4644-be0c-462925aaea39",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-4ef043b8-886d-4644-be0c-462925aaea39",
    "orderDate": "1793349673",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "f6fa67435a788b85b26ef72e4cc5c778",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=4ef043b8-886d-4644-be0c-462925aaea39",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734371082"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=4ef043b8-886d-4644-be0c-462925aaea39",
  "created_at": "2026-10-30T08:41:13.406685Z",
  "expires_at": "2026-10-30T09:11:13.406685Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/4ef043b8-886d-4644-be0c-462925aaea39` → **200**

```json
{
  "id": "4ef043b8-886d-4644-be0c-462925aaea39",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:41:13.406685Z",
  "expires_at": "2026-10-30T09:11:13.406685Z",
  "completed_at": "2026-10-30T08:41:13.642925Z",
  "masked_pan": "41****1817",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "145db39f-5097-4828-92a3-68a60446e9a4",
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
      "id": "3c9f7616-8f8d-45e0-b7ac-15051c378217",
      "at": "2026-10-30T08:41:13.872212Z",
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
  "client_id": "145db39f-5097-4828-92a3-68a60446e9a4",
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
      "id": "3c9f7616-8f8d-45e0-b7ac-15051c378217",
      "at": "2026-10-30T08:41:13.872212Z",
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
  "device_ref": "sandbox-7893"
}
```

```json
{
  "challenge_id": "4bf7c7c0-7a08-413f-aaab-8c83a2a02143",
  "expires_at": "2026-10-30T08:46:14.359402344Z",
  "resend_available_at": "2026-10-30T08:41:15.359402344Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "296132",
  "sent_at": "2026-10-30T08:41:14.36155935Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4bf7c7c0-7a08-413f-aaab-8c83a2a02143",
  "code": "296132",
  "device_ref": "sandbox-7893"
}
```

```json
{
  "session_id": "ccf0eb50-cdfa-49d2-9979-8ae9f4cadfde",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDU3NCwiaWF0IjoxNzkzMzQ5Njc0LCJqdGkiOiJmYmNhZTc2Yy1hZWIyLTRkYmMtODg0OC0zOTVkN2Y1ZWE4ZTYiLCJzaWQiOiJjY2YwZWI1MC1jZGZhLTQ5ZDItOTk3OS04YWU5ZjRjYWRmZGUifQ.fruKC6hAAgqfUggdLqKFvBcDiFhyaycd3h2K0aO21Yo",
  "access_expires_at": "2026-10-30T08:56:14.620506072Z",
  "refresh_token": "vEjbUvI7SsaEzVdyNt-oko06-7JPf_titMoHUyknyLc",
  "refresh_expires_at": "2026-11-29T08:41:14.620020553Z",
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
  "command_id": "c60433c9-d0b6-46b0-85aa-2038af97b6c2",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "ee7f65a0-6af9-4201-a477-6d0193b27dab",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-ee7f65a0-6af9-4201-a477-6d0193b27dab",
    "orderDate": "1793349675",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "5697424dcf6f134407ba9e359ec4653f",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=ee7f65a0-6af9-4201-a477-6d0193b27dab",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=ee7f65a0-6af9-4201-a477-6d0193b27dab",
  "created_at": "2026-10-30T08:41:15.083078Z",
  "expires_at": "2026-10-30T09:11:15.083078Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/ee7f65a0-6af9-4201-a477-6d0193b27dab` → **200**

```json
{
  "id": "ee7f65a0-6af9-4201-a477-6d0193b27dab",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-30T08:41:15.083078Z",
  "expires_at": "2026-10-30T09:11:15.083078Z",
  "completed_at": "2026-10-30T08:41:15.318355Z",
  "masked_pan": "41****0847",
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
      "id": "cb269752-1769-428c-9de8-9541ce9785f7",
      "at": "2026-10-30T08:41:15.886482Z",
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
  "command_id": "1b23cb85-b869-46da-90f8-6100594d593b",
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
  "correlation_id": "2f10160b-3ec9-49fc-859e-fb4d6bd667c1"
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
  "device_ref": "sandbox-18581"
}
```

```json
{
  "challenge_id": "8beacf9b-5617-468e-bec2-264b7819775a",
  "expires_at": "2026-10-30T08:46:17.264077409Z",
  "resend_available_at": "2026-10-30T08:41:18.264077409Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "754920",
  "sent_at": "2026-10-30T08:41:17.266556329Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8beacf9b-5617-468e-bec2-264b7819775a",
  "code": "754920",
  "device_ref": "sandbox-18581"
}
```

```json
{
  "session_id": "d05357e7-1dd5-4c14-9e7a-dabcc4794ef0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDU3NywiaWF0IjoxNzkzMzQ5Njc3LCJqdGkiOiIwNjJjYjY0OC04NmY0LTQ4ZDEtYjZmMS01ODBjNzc0ZWFmMzUiLCJzaWQiOiJkMDUzNTdlNy0xZGQ1LTRjMTQtOWU3YS1kYWJjYzQ3OTRlZjAifQ.GX7CzELJWcefBuxAKP2Zgw75UrD9imtmk7mN_w_5Vuk",
  "access_expires_at": "2026-10-30T08:56:17.523934434Z",
  "refresh_token": "hyGx5I4rHH5BqErp30ePC4kPMo7oHkdfP5QRGYhawSs",
  "refresh_expires_at": "2026-11-29T08:41:17.523355617Z",
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
  "command_id": "ece5257a-b43d-4b4b-baf8-658547004c81",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:17Z",
    "sequence": 1793349677978
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd153def-d867-492b-9ea9-10534b8db029",
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
  "last_heartbeat_at": "2026-10-30T08:41:17.995388Z",
  "last_location_at": "2026-10-30T08:41:17.995388Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636152482",
  "device_ref": "sandbox-12336"
}
```

```json
{
  "challenge_id": "58a6a494-7814-4069-b42a-d670123e8e32",
  "expires_at": "2026-10-30T08:46:18.22852849Z",
  "resend_available_at": "2026-10-30T08:41:19.22852849Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636152482` → **200**

```json
{
  "phone": "+380636152482",
  "audience": "CLIENT",
  "code": "807267",
  "sent_at": "2026-10-30T08:41:18.231031426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58a6a494-7814-4069-b42a-d670123e8e32",
  "code": "807267",
  "device_ref": "sandbox-12336"
}
```

```json
{
  "session_id": "68860bb1-d307-4850-98f3-00c6ba785eef",
  "subject": {
    "type": "CLIENT",
    "id": "14bdd72b-db75-4ae0-ae0e-9a337cfb930c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGJkZDcyYi1kYjc1LTRhZTAtYWUwZS05YTMzN2NmYjkzMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTc4LCJpYXQiOjE3OTMzNDk2NzgsImp0aSI6IjA4ZmE0Mjk2LWVmNzItNDNjZi05NDQ1LTZjNTk3MDMzZjI4ZSIsInNpZCI6IjY4ODYwYmIxLWQzMDctNDg1MC05OGYzLTAwYzZiYTc4NWVlZiJ9.quyTI0D2d3eVMxE-48kGhyfmA6z8y6LW4uAzDbBeGUA",
  "access_expires_at": "2026-10-30T08:56:18.602571209Z",
  "refresh_token": "er2QeXMJ1A0VkrrN6V0GbFZjUxkZ71JWsZQN5oP0BTM",
  "refresh_expires_at": "2026-11-29T08:41:18.60209953Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ff6f6a16-ea44-4372-b26c-66f5b7f00f2d",
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
  "id": "ae6d671c-a69e-4f07-81ec-de69ef28b963",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:18.831469Z",
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
  "command_id": "997dd3c5-4b78-4a6a-b70c-d388786f1e92",
  "quote_id": "ae6d671c-a69e-4f07-81ec-de69ef28b963",
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
  "id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14bdd72b-db75-4ae0-ae0e-9a337cfb930c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:41:19.074472Z",
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
    "id": "fd44a1e5-06c3-461b-92d8-c4588d0a44bd",
    "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
    "expires_at": "2026-10-30T08:41:34.077178Z",
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

`POST /api/driver/v1/offers/fd44a1e5-06c3-461b-92d8-c4588d0a44bd/accept` → **200**

```json
{
  "command_id": "cd6d853e-8e4a-4858-838b-d839e31d3353"
}
```

```json
{
  "id": "0f9d04fb-4fe3-4af3-98bd-bf33d6a2ffb7",
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5727c594-2d0c-4c24-b03d-ea05c71d1bdf",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5727c594-2d0c-4c24-b03d-ea05c71d1bdf",
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "assignment_id": "0f9d04fb-4fe3-4af3-98bd-bf33d6a2ffb7",
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

`POST /api/driver/v1/work-sessions/bd153def-d867-492b-9ea9-10534b8db029/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:20Z",
    "sequence": 1793349680281
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd153def-d867-492b-9ea9-10534b8db029",
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
  "last_heartbeat_at": "2026-10-30T08:41:20.045916Z",
  "last_location_at": "2026-10-30T08:41:20.045916Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/5727c594-2d0c-4c24-b03d-ea05c71d1bdf/arrive` → **200**

```json
{
  "command_id": "2d96329b-d990-4293-b727-98b0a58367d1",
  "expected_version": 0
}
```

```json
{
  "id": "5727c594-2d0c-4c24-b03d-ea05c71d1bdf",
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "assignment_id": "0f9d04fb-4fe3-4af3-98bd-bf33d6a2ffb7",
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
  "arrived_at": "2026-10-30T08:41:20.298483Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5727c594-2d0c-4c24-b03d-ea05c71d1bdf/start` → **200**

```json
{
  "command_id": "70c4be81-1f2b-4c7f-a1d7-1000ff8cf1ce",
  "expected_version": 1
}
```

```json
{
  "id": "5727c594-2d0c-4c24-b03d-ea05c71d1bdf",
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "assignment_id": "0f9d04fb-4fe3-4af3-98bd-bf33d6a2ffb7",
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
  "arrived_at": "2026-10-30T08:41:20.298483Z",
  "started_at": "2026-10-30T08:41:20.543078Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5727c594-2d0c-4c24-b03d-ea05c71d1bdf/complete` → **200**

```json
{
  "command_id": "96e14b12-7bd4-4734-9f3c-93820b8fc3f5",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:41:20Z",
  "cash_received": false
}
```

```json
{
  "id": "5727c594-2d0c-4c24-b03d-ea05c71d1bdf",
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "assignment_id": "0f9d04fb-4fe3-4af3-98bd-bf33d6a2ffb7",
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
  "arrived_at": "2026-10-30T08:41:20.298483Z",
  "started_at": "2026-10-30T08:41:20.543078Z",
  "completed_at": "2026-10-30T08:41:20.896722Z",
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
  "session_id": "b8f35dcb-4c78-4b82-81a6-d5230ab493b6",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1ODEsImlhdCI6MTc5MzM0OTY4MSwianRpIjoiOWMwOTgyYTUtMzMzZC00YmI2LWI2Y2QtYjRkOTc5YzFiODJhIiwic2lkIjoiYjhmMzVkY2ItNGM3OC00YjgyLTgxYTYtZDUyMzBhYjQ5M2I2In0.CD5CEz_0_CMl81vV11rIKPmlnZW8GHrgS7y2QhS9iZA",
  "access_expires_at": "2026-10-30T08:56:21.445658029Z",
  "refresh_token": "aXy3dtkesnrmTGJJvffMmDl5QMQV3th_u6qk51-HxJI",
  "refresh_expires_at": "2026-10-30T20:41:21.445198999Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/eb370146-1a70-4611-b0fd-7f3d49b3be0b/cash-dispute` → **200**

```json
{
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "14bdd72b-db75-4ae0-ae0e-9a337cfb930c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:41:20.988937Z",
  "decide_by": "2026-11-13T08:41:20.988937Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-13T08:41:20.988937Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "14bdd72b-db75-4ae0-ae0e-9a337cfb930c",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-30T08:41:20.988937Z",
      "decide_by": "2026-11-13T08:41:20.988937Z",
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

`POST /api/admin/v1/orders/eb370146-1a70-4611-b0fd-7f3d49b3be0b/cash-dispute/decide` → **400**

```json
{
  "command_id": "c9ce8532-1800-4b5d-a553-044bda0970d7",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/eb370146-1a70-4611-b0fd-7f3d49b3be0b/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "1203b05f-aff5-4fdf-8e69-c6eaa6da1904",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/eb370146-1a70-4611-b0fd-7f3d49b3be0b/cash-dispute/decide` → **200**

```json
{
  "command_id": "23393a5d-bd35-4503-b39b-9a41972272f2",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "14bdd72b-db75-4ae0-ae0e-9a337cfb930c",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-30T08:41:20.988937Z",
  "decide_by": "2026-11-13T08:41:20.988937Z",
  "decision": "PAY_DRIVER",
  "decided_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-30T08:41:22.458243Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/eb370146-1a70-4611-b0fd-7f3d49b3be0b/cash-dispute/decide` → **409**

```json
{
  "command_id": "9fbf7527-ba1a-413a-86eb-63be9d471ce7",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/eb370146-1a70-4611-b0fd-7f3d49b3be0b/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1ff43c89-d648-47db-9c44-5da6a7ee2d3c"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "bd153def-d867-492b-9ea9-10534b8db029",
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
  "last_heartbeat_at": "2026-10-30T08:41:20.045916Z",
  "last_location_at": "2026-10-30T08:41:20.045916Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bd153def-d867-492b-9ea9-10534b8db029/close` → **200**

```json
{
  "command_id": "677dc76d-85d4-464e-bd98-db2f3df21727",
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
  "phone": "+380732915799",
  "device_ref": "sandbox-11203"
}
```

```json
{
  "challenge_id": "0128d31e-0abb-4a3d-ad0c-ab6cd5054fbb",
  "expires_at": "2026-10-30T08:46:23.439034966Z",
  "resend_available_at": "2026-10-30T08:41:24.439034966Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732915799` → **200**

```json
{
  "phone": "+380732915799",
  "audience": "CLIENT",
  "code": "180293",
  "sent_at": "2026-10-30T08:41:23.441579565Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0128d31e-0abb-4a3d-ad0c-ab6cd5054fbb",
  "code": "180293",
  "device_ref": "sandbox-11203"
}
```

```json
{
  "session_id": "138f0f0a-c10f-40d0-ba77-27accd7acd4b",
  "subject": {
    "type": "CLIENT",
    "id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiZjZjNTJkNy1lZjBmLTQ2OTctYTI1Yy05ZGZmMjZiNjQzNzkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTgzLCJpYXQiOjE3OTMzNDk2ODMsImp0aSI6IjczZjUwYWZhLWI3YTAtNDA3Yy1iZjQzLTczZGRjZmQ2YzBmOSIsInNpZCI6IjEzOGYwZjBhLWMxMGYtNDBkMC1iYTc3LTI3YWNjZDdhY2Q0YiJ9.g6dZ72kZNf7kTLCicfQYyb8Ztvs5NaWPNAJwyPEwSIM",
  "access_expires_at": "2026-10-30T08:56:23.703018764Z",
  "refresh_token": "fD7eHONYaPg1I9xJz5bjFvpPsV6bKgKXJsn0-deCLHE",
  "refresh_expires_at": "2026-11-29T08:41:23.702538813Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "1a72530e-2fa1-416f-98ff-3f68912190b6",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "372d819a-c794-45b8-ae45-4b52a6671b93",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-372d819a-c794-45b8-ae45-4b52a6671b93",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "d92e2b63c8b9c24a09dac4909e52bd5f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=372d819a-c794-45b8-ae45-4b52a6671b93",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732915799"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=372d819a-c794-45b8-ae45-4b52a6671b93",
  "expires_at": "2026-10-30T09:11:24.116353Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/372d819a-c794-45b8-ae45-4b52a6671b93` → **200**

```json
{
  "id": "372d819a-c794-45b8-ae45-4b52a6671b93",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:11:24.116353Z",
  "card": {
    "id": "4da25af0-12ae-447a-a9aa-0338a1bc4709",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6035",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:41:24.403063Z"
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
  "device_ref": "sandbox-22704"
}
```

```json
{
  "challenge_id": "8042cb46-b6a0-43cb-a574-2a701e523fb9",
  "expires_at": "2026-10-30T08:46:24.815235286Z",
  "resend_available_at": "2026-10-30T08:41:25.815235286Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "537095",
  "sent_at": "2026-10-30T08:41:24.817475745Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8042cb46-b6a0-43cb-a574-2a701e523fb9",
  "code": "537095",
  "device_ref": "sandbox-22704"
}
```

```json
{
  "session_id": "53afe36f-750a-4365-af03-cefa7705bb8b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDU4NSwiaWF0IjoxNzkzMzQ5Njg1LCJqdGkiOiJiNDJmNDU3MS1mYTUwLTRhMzAtODQyYi03ODJjMjZiN2Q3MWEiLCJzaWQiOiI1M2FmZTM2Zi03NTBhLTQzNjUtYWYwMy1jZWZhNzcwNWJiOGIifQ.bcCwCcB0m8F-jN9IB4QRAmc34ws9aRFmx3dMp1r7PwU",
  "access_expires_at": "2026-10-30T08:56:25.105321987Z",
  "refresh_token": "KrnYiwU83IvY15aPtrX1ktjPyXt85lAv9lgUFyg4hmY",
  "refresh_expires_at": "2026-11-29T08:41:25.104773454Z",
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
  "command_id": "8b44d3d3-f55a-4ff2-90d5-868dba643c97",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:25Z",
    "sequence": 1793349685568
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c17a8e5d-8d9c-4d79-a2e0-46495a499821",
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
  "last_heartbeat_at": "2026-10-30T08:41:25.58607Z",
  "last_location_at": "2026-10-30T08:41:25.58607Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b6e44bc5-8b7c-4e9c-8d2c-03e072a54334",
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
  "id": "4e3074ca-8e15-4174-86a8-8b1c12905225",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:25.824573Z",
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
  "command_id": "5f38f587-1e02-4e54-b078-39ed3d162382",
  "quote_id": "4e3074ca-8e15-4174-86a8-8b1c12905225",
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
  "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
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
  "created_at": "2026-10-30T08:41:26.066989Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d` → **200**

```json
{
  "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
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
  "created_at": "2026-10-30T08:41:26.066989Z",
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
    "id": "f9f3f6ce-8ce7-4364-baaa-8cbc491bd7d3",
    "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
    "expires_at": "2026-10-30T08:41:41.175473Z",
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

`POST /api/driver/v1/offers/f9f3f6ce-8ce7-4364-baaa-8cbc491bd7d3/accept` → **200**

```json
{
  "command_id": "7e8b865a-e9e0-45b7-95e2-024dd8993ba5"
}
```

```json
{
  "id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "227aa684-bffe-477a-8498-a44cd90df93c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "227aa684-bffe-477a-8498-a44cd90df93c",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "assignment_id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
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

`POST /api/rider/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/messages` → **201**

```json
{
  "command_id": "87f7110c-8f41-423b-ae3a-9bb63b057f37",
  "body": "Я біля входу, мій номер +380732915799, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "c2aadd1e-70fb-4e7d-99f8-b5099b4f1f5d",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732915799, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-30T08:41:27.2535538Z"
}
```

`POST /api/driver/v1/trips/227aa684-bffe-477a-8498-a44cd90df93c/messages` → **201**

```json
{
  "command_id": "5a2f171c-6446-4c11-8141-f8f6f5166b2b",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "0951d15c-7506-41ef-8ac1-bbc489514c68",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-30T08:41:27.484074166Z"
}
```

`POST /api/driver/v1/work-sessions/c17a8e5d-8d9c-4d79-a2e0-46495a499821/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:27Z",
    "sequence": 1793349687735
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c17a8e5d-8d9c-4d79-a2e0-46495a499821",
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
  "last_heartbeat_at": "2026-10-30T08:41:27.763958Z",
  "last_location_at": "2026-10-30T08:41:27.763958Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/227aa684-bffe-477a-8498-a44cd90df93c/arrive` → **200**

```json
{
  "command_id": "4f43162c-8d6b-4e90-af7b-8241cc860e6c",
  "expected_version": 0
}
```

```json
{
  "id": "227aa684-bffe-477a-8498-a44cd90df93c",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "assignment_id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
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
  "arrived_at": "2026-10-30T08:41:28.007029Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/227aa684-bffe-477a-8498-a44cd90df93c/start` → **200**

```json
{
  "command_id": "6a34c757-97f6-422d-a8cb-fbdeb93576f2",
  "expected_version": 1
}
```

```json
{
  "id": "227aa684-bffe-477a-8498-a44cd90df93c",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "assignment_id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
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
  "arrived_at": "2026-10-30T08:41:28.007029Z",
  "started_at": "2026-10-30T08:41:28.254332Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c17a8e5d-8d9c-4d79-a2e0-46495a499821/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:41:28Z",
    "sequence": 1793349688499
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c17a8e5d-8d9c-4d79-a2e0-46495a499821",
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
  "last_heartbeat_at": "2026-10-30T08:41:28.517792Z",
  "last_location_at": "2026-10-30T08:41:28.517792Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/227aa684-bffe-477a-8498-a44cd90df93c/complete` → **200**

```json
{
  "command_id": "bcb45fff-3c8a-4373-afea-37d44750e34f",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:41:28Z",
  "cash_received": false
}
```

```json
{
  "id": "227aa684-bffe-477a-8498-a44cd90df93c",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "assignment_id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
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
  "arrived_at": "2026-10-30T08:41:28.007029Z",
  "started_at": "2026-10-30T08:41:28.254332Z",
  "completed_at": "2026-10-30T08:41:28.760568Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d` → **200**

```json
{
  "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
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
    "id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
    "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "227aa684-bffe-477a-8498-a44cd90df93c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:41:26.066989Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d` → **200**

```json
{
  "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
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
    "id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
    "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "227aa684-bffe-477a-8498-a44cd90df93c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:41:26.066989Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d` → **200**

```json
{
  "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
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
    "id": "0198b105-05e4-4912-baa2-cc3e3590e54c",
    "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "227aa684-bffe-477a-8498-a44cd90df93c",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:41:26.066989Z",
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
  "session_id": "c17a8e5d-8d9c-4d79-a2e0-46495a499821",
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
  "last_heartbeat_at": "2026-10-30T08:41:28.517792Z",
  "last_location_at": "2026-10-30T08:41:28.517792Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c17a8e5d-8d9c-4d79-a2e0-46495a499821/close` → **200**

```json
{
  "command_id": "6692b0fc-2f02-43a5-adf5-2abc722cdc7f",
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
  "session_id": "14819025-fc22-4ba3-a8f2-f75b8d00d8ce",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1OTIsImlhdCI6MTc5MzM0OTY5MiwianRpIjoiNTg0NTA1YjItNzYxNy00NDU2LTk3YWItYjdkZDg2OGQ0ODY4Iiwic2lkIjoiMTQ4MTkwMjUtZmMyMi00YmEzLWE4ZjItZjc1YjhkMDBkOGNlIn0.NUcKwJIE_i6I9RXX9w0ccy_pSXz2DbC1CrMAvATkof4",
  "access_expires_at": "2026-10-30T08:56:32.442251138Z",
  "refresh_token": "4FJanV-7AbwSVQ7565qkqDsYxHI0ctzeEpCxE0MNaSc",
  "refresh_expires_at": "2026-10-30T20:41:32.441776184Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "f712a27d-2642-49d7-9f6d-c085e77f17ab"
}
```

`GET /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-30T08:41:32.908225288Z",
  "order": {
    "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
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
    "created_at": "2026-10-30T08:41:26.066989Z",
    "assigned_at": "2026-10-30T08:41:26.784917Z",
    "arrived_at": "2026-10-30T08:41:28.007029Z",
    "started_at": "2026-10-30T08:41:28.254332Z",
    "completed_at": "2026-10-30T08:41:28.760568Z"
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
    "id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
    "registered_at": "2026-10-30T08:41:23.700901Z",
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
      "created_at": "2026-10-30T08:41:26.069024Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-30T08:41:29.235807Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks` → **422**

```json
{
  "command_id": "b73bcc08-41d3-4ea1-b815-a60671330181",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "instance": "/api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "fca895ca-b8b3-4eb1-90a2-d92ca35478b6"
}
```

`POST /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks` → **201**

```json
{
  "command_id": "f9cff142-7252-4b70-b774-49d349855970",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "201ba604-921b-405f-ae8d-e51f7f3f72e6",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:41:33.589805Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks` → **201**

```json
{
  "command_id": "f9cff142-7252-4b70-b774-49d349855970",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29"
}
```

```json
{
  "id": "201ba604-921b-405f-ae8d-e51f7f3f72e6",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-30T08:41:33.589805Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/bf6c52d7-ef0f-4697-a25c-9dff26b64379` → **200**

```json
{
  "client": {
    "id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
    "phone": "+380732915799",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:41:23.700901Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:41:26.066989Z",
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

`GET /api/admin/v1/clients/bf6c52d7-ef0f-4697-a25c-9dff26b64379` → **200**

```json
{
  "client": {
    "id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
    "phone": "+380732915799",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:41:23.700901Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:41:26.066989Z",
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

`POST /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks/201ba604-921b-405f-ae8d-e51f7f3f72e6/resolve` → **200**

```json
{
  "command_id": "b96a8881-9285-491d-bc9f-0fd8c66d6817",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "201ba604-921b-405f-ae8d-e51f7f3f72e6",
  "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-29",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-30T08:41:33.589805Z",
  "resolved_at": "2026-10-30T08:41:35.577543Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/bf6c52d7-ef0f-4697-a25c-9dff26b64379` → **200**

```json
{
  "client": {
    "id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
    "phone": "+380732915799",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:41:23.700901Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:41:26.066989Z",
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

`GET /api/admin/v1/clients/bf6c52d7-ef0f-4697-a25c-9dff26b64379` → **200**

```json
{
  "client": {
    "id": "bf6c52d7-ef0f-4697-a25c-9dff26b64379",
    "phone": "+380732915799",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:41:23.700901Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-30T08:41:26.066989Z",
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

`POST /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks/201ba604-921b-405f-ae8d-e51f7f3f72e6/resolve` → **409**

```json
{
  "command_id": "bda31c43-6f52-4f1e-b39c-6c34f5e77bd1",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks/201ba604-921b-405f-ae8d-e51f7f3f72e6/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "c48d30c5-0cdf-41ef-9da4-087ee1e51d82"
}
```

`GET /api/admin/v1/orders/88bccc21-63cf-4f43-9485-0e5ee1c01d8d/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "201ba604-921b-405f-ae8d-e51f7f3f72e6",
      "order_id": "88bccc21-63cf-4f43-9485-0e5ee1c01d8d",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-29",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-30T08:41:33.589805Z",
      "resolved_at": "2026-10-30T08:41:35.577543Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 88bccc21-63cf-4f43-9485-0e5ee1c01d8d without phone or card digits; chargeback 201ba604-921b-405f-ae8d-e51f7f3f72e6 recorded and won.

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
  "session_id": "e31714f3-7f31-403b-b04a-08d31a057727",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA1OTgsImlhdCI6MTc5MzM0OTY5OCwianRpIjoiNzI1ZmI4NTYtNTI1OS00MmM3LTkwZWMtYjM3OGM0MWUzYmRjIiwic2lkIjoiZTMxNzE0ZjMtN2YzMS00MDNiLWIwNGEtMDhkMzFhMDU3NzI3In0.HzT_pHmIy2WS_hd1-J8tiYmy6qkXsS11A3-plZWsa1Q",
  "access_expires_at": "2026-10-30T08:56:38.722546204Z",
  "refresh_token": "1br5LwMQPrI26nVlO7juFJOnaV_n6Axr594QBq2dEw0",
  "refresh_expires_at": "2026-10-30T20:41:38.722069328Z",
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
  "phone": "+48600325760",
  "device_ref": "sandbox-6694"
}
```

```json
{
  "challenge_id": "d9e9a146-8cd3-4d76-a53e-72bc22d70ee3",
  "expires_at": "2026-10-30T08:46:39.433089138Z",
  "resend_available_at": "2026-10-30T08:41:40.433089138Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600325760` → **200**

```json
{
  "phone": "+48600325760",
  "audience": "CLIENT",
  "code": "579502",
  "sent_at": "2026-10-30T08:41:39.435211832Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d9e9a146-8cd3-4d76-a53e-72bc22d70ee3",
  "code": "579502",
  "device_ref": "sandbox-6694"
}
```

```json
{
  "session_id": "f5575957-054c-43d2-a3c2-85e311ca50f6",
  "subject": {
    "type": "CLIENT",
    "id": "e4b33ab1-2e7d-4874-8c0d-f8cd9ab79112"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNGIzM2FiMS0yZTdkLTQ4NzQtOGMwZC1mOGNkOWFiNzkxMTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNTk5LCJpYXQiOjE3OTMzNDk2OTksImp0aSI6Ijk1MzQ1OGJlLTFjMTktNGJmNC1hYmExLWZjZWQyODJiMjg2MSIsInNpZCI6ImY1NTc1OTU3LTA1NGMtNDNkMi1hM2MyLTg1ZTMxMWNhNTBmNiJ9.4QZKuoWjzJkwdcECV_hv0bHHZ9EwtGsHf5DIbTWFf7s",
  "access_expires_at": "2026-10-30T08:56:39.720917907Z",
  "refresh_token": "qNQO2pemQFDO9rvnVZ9JSQl5Q8hMeQY6l9gMEEOxJTE",
  "refresh_expires_at": "2026-11-29T08:41:39.720455542Z",
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
  "command_id": "8614883b-ab8d-4b0d-8d8a-fd237e2f81cd",
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
  "correlation_id": "fbb2f34f-ab7f-4555-be06-f233daa8df49",
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
  "command_id": "491d3ba4-70ec-4113-9f1f-c4cee86fd7e3",
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
  "paused_at": "2026-10-30T08:41:40.811452486Z",
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
  "command_id": "b065bbae-e999-4893-b673-b728069226ef",
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
  "id": "d9110d67-f69b-4ba7-8116-689f43e12e42",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:41.301459Z",
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
  "command_id": "2d86ced2-6c4a-4ed7-b370-2805259271df",
  "quote_id": "d9110d67-f69b-4ba7-8116-689f43e12e42",
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
  "correlation_id": "6ec24b1f-346e-40f0-b8e2-22db519ad0bb"
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
  "paused_at": "2026-10-30T08:41:40.811452Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "ac98e2e5-7b04-40d5-b8a5-f5dfbf7a7259",
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
  "command_id": "188cd1ee-d4e9-4a52-bd26-3fa4174a25d1",
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
  "command_id": "f2894aa3-ff00-4f22-b776-9364b82c25aa",
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
  "id": "7e84f0ae-f102-4a98-a04e-300801489202",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:42.691652Z",
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
  "command_id": "20584654-06df-46f7-a0d7-7e0f260264ea",
  "quote_id": "7e84f0ae-f102-4a98-a04e-300801489202",
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
  "correlation_id": "021ccba2-2d12-4972-8082-5e5b13f1b6c0"
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
  "command_id": "9bfa1576-90ae-41c4-b7b5-2f0506ad9593",
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
      "from": "11:00",
      "to": "12:00"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "3aa811f8-283a-428a-93d3-ce69c55de1f1",
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
  "id": "3652a06c-cd82-4839-bb0c-a74217403467",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:43.762991Z",
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
  "command_id": "c09ddcab-43b6-4e34-982e-73c783855492",
  "quote_id": "3652a06c-cd82-4839-bb0c-a74217403467",
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
  "correlation_id": "a14f4f02-732a-44e2-a43d-968d061cfcc9"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "6c627d9c-6189-475e-8434-b5d7c136a1cc",
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
  "correlation_id": "e4c7f0d4-d0b3-4ec4-843a-3e391bfd94b6"
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
      "from": "11:00",
      "to": "12:00"
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
  "command_id": "3bd07339-e8b1-4223-a51f-039bbf40389f",
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
  "phone": "+380672438893",
  "device_ref": "sandbox-30008"
}
```

```json
{
  "challenge_id": "5faa041a-839e-4d19-8166-22cecc82021c",
  "expires_at": "2026-10-30T08:46:44.96280949Z",
  "resend_available_at": "2026-10-30T08:41:45.96280949Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380672438893` → **200**

```json
{
  "phone": "+380672438893",
  "audience": "CLIENT",
  "code": "647819",
  "sent_at": "2026-10-30T08:41:44.964941598Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5faa041a-839e-4d19-8166-22cecc82021c",
  "code": "647819",
  "device_ref": "sandbox-30008"
}
```

```json
{
  "session_id": "81ff2212-e462-4492-89e6-794caeb93147",
  "subject": {
    "type": "CLIENT",
    "id": "b5f5d708-4135-4ab5-aeef-db757c63fa59"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNWY1ZDcwOC00MTM1LTRhYjUtYWVlZi1kYjc1N2M2M2ZhNTkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjA1LCJpYXQiOjE3OTMzNDk3MDUsImp0aSI6ImFkY2MxYzZlLTM1MjktNDQxNy04NTllLTVmYTE5ZDhmZDhiOCIsInNpZCI6IjgxZmYyMjEyLWU0NjItNDQ5Mi04OWU2LTc5NGNhZWI5MzE0NyJ9.mBaylZ_E8nHX0h9WplTxk16nsag1nS8Y2AkJqHhzT5A",
  "access_expires_at": "2026-10-30T08:56:45.282228171Z",
  "refresh_token": "ovzHxB8rm1WBp8raSL5DhIXGmTTfAv3H9oI9lHOcfDo",
  "refresh_expires_at": "2026-11-29T08:41:45.281567453Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "b5f5d708-4135-4ab5-aeef-db757c63fa59",
  "session_id": "81ff2212-e462-4492-89e6-794caeb93147",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "aa36fc94-3025-4920-81c7-13ec4b379e01",
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
  "id": "e9dd624a-91f6-4bfe-af55-3188eaf1b075",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:45.778344Z",
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
  "challenge_id": "253b44e3-3b57-4b1a-ba6d-d7d390fdd00a",
  "expires_at": "2026-10-30T08:46:48.01632513Z",
  "resend_available_at": "2026-10-30T08:41:49.01632513Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380672438893` → **200**

```json
{
  "phone": "+380672438893",
  "audience": "CLIENT",
  "code": "392949",
  "sent_at": "2026-10-30T08:41:48.018119317Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "8085b14d-086f-40e2-9c33-720877995f02",
  "challenge_id": "253b44e3-3b57-4b1a-ba6d-d7d390fdd00a",
  "otp_code": "392949"
}
```

```json
{
  "client_id": "b5f5d708-4135-4ab5-aeef-db757c63fa59",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-30T08:41:48.337521184Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "ebe6f71a-41e7-4c53-99dd-036143ae491a",
  "quote_id": "e9dd624a-91f6-4bfe-af55-3188eaf1b075",
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
  "correlation_id": "91dbec46-42fd-47ba-9786-2aee25da342d"
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
  "session_id": "b5b70802-b768-4dcd-877d-32b1de191622",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MDksImlhdCI6MTc5MzM0OTcwOSwianRpIjoiMTM4MmYwZDUtMzFiZS00MTRjLTlkNGUtODI4MjI1ZmQ1OWVkIiwic2lkIjoiYjViNzA4MDItYjc2OC00ZGNkLTg3N2QtMzJiMWRlMTkxNjIyIn0.JgE_XZULFqhwJk1Pf33NGcByULt0A86syz3FBSmqVdQ",
  "access_expires_at": "2026-10-30T08:56:49.081361459Z",
  "refresh_token": "ZUQg6qj7cQBK6MhbVvYq8clyDizsBqDZf7jU4otUSBI",
  "refresh_expires_at": "2026-10-30T20:41:49.080884512Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "b5f5d708-4135-4ab5-aeef-db757c63fa59",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-30T08:41:48.337521Z",
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

`POST /api/admin/v1/client-deletions/b5f5d708-4135-4ab5-aeef-db757c63fa59/complete` → **200**

```json
{
  "command_id": "28685c91-7cff-4ec8-a4d3-e32967299ca3",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "b5f5d708-4135-4ab5-aeef-db757c63fa59",
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
  "correlation_id": "e5e9bf85-d2b6-4469-a8bd-fddd83849db9"
}
```

Done: client b5f5d708-4135-4ab5-aeef-db757c63fa59 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662461722",
  "device_ref": "sandbox-6934"
}
```

```json
{
  "challenge_id": "a7f014cc-f5bd-4ba5-9dfd-58f3f25bf0a4",
  "expires_at": "2026-10-30T08:46:50.024282661Z",
  "resend_available_at": "2026-10-30T08:41:51.024282661Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662461722` → **200**

```json
{
  "phone": "+380662461722",
  "audience": "CLIENT",
  "code": "261348",
  "sent_at": "2026-10-30T08:41:50.026631891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7f014cc-f5bd-4ba5-9dfd-58f3f25bf0a4",
  "code": "261348",
  "device_ref": "sandbox-6934"
}
```

```json
{
  "session_id": "1ef3bc17-5fd0-4386-a6a4-c2b576903458",
  "subject": {
    "type": "CLIENT",
    "id": "76d2607b-8eb0-471c-a9be-60760404a4c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmQyNjA3Yi04ZWIwLTQ3MWMtYTliZS02MDc2MDQwNGE0YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjEwLCJpYXQiOjE3OTMzNDk3MTAsImp0aSI6IjkxZDMyYTYyLWJhZjEtNDUxZi1iMjBiLWU4MzNiMmY5NGVjNCIsInNpZCI6IjFlZjNiYzE3LTVmZDAtNDM4Ni1hNmE0LWMyYjU3NjkwMzQ1OCJ9.-p02fx-vNltQ05wRQwTOs-mUdVp-aJuuzGsrLw8Y6mM",
  "access_expires_at": "2026-10-30T08:56:50.273420063Z",
  "refresh_token": "Koxx_w-15nueKsVF0TKlS630YL034HexiVANuhBs79U",
  "refresh_expires_at": "2026-11-29T08:41:50.27299956Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
  "session_id": "1ef3bc17-5fd0-4386-a6a4-c2b576903458",
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
  "session_id": "4344b486-5754-49c2-9600-ce9da017ac36",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MTEsImlhdCI6MTc5MzM0OTcxMSwianRpIjoiN2VhMmQ2OTktNGUwZi00ZjljLTg2YmEtZjc0YjhmZDNmMzhjIiwic2lkIjoiNDM0NGI0ODYtNTc1NC00OWMyLTk2MDAtY2U5ZGEwMTdhYzM2In0.tmXQPlDEg-2ExsH-Xms7W9LExoqAEGYw38j6J9k_IUA",
  "access_expires_at": "2026-10-30T08:56:51.005376999Z",
  "refresh_token": "4jvBXpnsZbf7MKbfoO0BgQmLC83weU3zflMX4_ShV-c",
  "refresh_expires_at": "2026-10-30T20:41:51.004910259Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=2461722&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
      "phone": "+380662461722",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-30T08:41:50.271513Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/76d2607b-8eb0-471c-a9be-60760404a4c6` → **200**

```json
{
  "client": {
    "id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
    "phone": "+380662461722",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:41:50.271513Z",
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

`POST /api/admin/v1/clients/76d2607b-8eb0-471c-a9be-60760404a4c6/block` → **400**

```json
{
  "command_id": "72125f74-5226-4fca-9f69-627a7df460c6",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/76d2607b-8eb0-471c-a9be-60760404a4c6/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "ec3f2612-e51c-4617-9fb5-dce7e3cb4cd8",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/76d2607b-8eb0-471c-a9be-60760404a4c6/block` → **200**

```json
{
  "command_id": "09258bee-c081-4d49-bc22-10b0de4a1774",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
  "phone": "+380662461722",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-30T08:41:50.271513Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-30T08:41:51.972173Z",
    "by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
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
  "correlation_id": "8b44b1a9-fd58-498e-aac0-66e8996b9682"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662461722",
  "device_ref": "sandbox-24470"
}
```

```json
{
  "challenge_id": "c458680e-196d-4184-8593-89cc155e0c57",
  "expires_at": "2026-10-30T08:46:54.44359647Z",
  "resend_available_at": "2026-10-30T08:41:55.44359647Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662461722` → **200**

```json
{
  "phone": "+380662461722",
  "audience": "CLIENT",
  "code": "231236",
  "sent_at": "2026-10-30T08:41:54.44556226Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "c458680e-196d-4184-8593-89cc155e0c57",
  "code": "231236",
  "device_ref": "sandbox-24470"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "2748d3ad-8fd7-407e-91a4-d9275e4b9c96"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/76d2607b-8eb0-471c-a9be-60760404a4c6` → **200**

```json
{
  "client": {
    "id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
    "phone": "+380662461722",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-30T08:41:50.271513Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-30T08:41:51.972173Z",
      "by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
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

`POST /api/admin/v1/clients/76d2607b-8eb0-471c-a9be-60760404a4c6/unblock` → **200**

```json
{
  "command_id": "8fbb9dcb-2a0e-4c1f-b024-c1a3548beb41",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
  "phone": "+380662461722",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-30T08:41:50.271513Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662461722",
  "device_ref": "sandbox-17729"
}
```

```json
{
  "challenge_id": "66f114e9-ab78-4a9e-a86f-72b22dd66982",
  "expires_at": "2026-10-30T08:46:57.462117098Z",
  "resend_available_at": "2026-10-30T08:41:58.462117098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662461722` → **200**

```json
{
  "phone": "+380662461722",
  "audience": "CLIENT",
  "code": "816224",
  "sent_at": "2026-10-30T08:41:57.464389853Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66f114e9-ab78-4a9e-a86f-72b22dd66982",
  "code": "816224",
  "device_ref": "sandbox-17729"
}
```

```json
{
  "session_id": "4e1eb059-3d8e-41ac-b77c-27a7a3624b9f",
  "subject": {
    "type": "CLIENT",
    "id": "76d2607b-8eb0-471c-a9be-60760404a4c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NmQyNjA3Yi04ZWIwLTQ3MWMtYTliZS02MDc2MDQwNGE0YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjE3LCJpYXQiOjE3OTMzNDk3MTcsImp0aSI6IjdiY2Q3NzBiLTMyNGItNDk3Mi1hZDdjLTgyZmNkYzVkNzM4ZCIsInNpZCI6IjRlMWViMDU5LTNkOGUtNDFhYy1iNzdjLTI3YTdhMzYyNGI5ZiJ9.dqR1lR8rSLEUV0m_gaUD4e4AvdkXCepFK83Sm_lQ3AU",
  "access_expires_at": "2026-10-30T08:56:57.725239137Z",
  "refresh_token": "1Uf4wFZAi56S5-X4X9mojqbNJhExqJHQlVUJ1_cglNs",
  "refresh_expires_at": "2026-11-29T08:41:57.724770443Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "76d2607b-8eb0-471c-a9be-60760404a4c6",
  "session_id": "4e1eb059-3d8e-41ac-b77c-27a7a3624b9f",
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
  "phone": "+380669401848",
  "device_ref": "sandbox-11656"
}
```

```json
{
  "challenge_id": "f8a536c4-7f02-4e03-9be2-e8c2984fa283",
  "expires_at": "2026-10-30T08:46:58.191432383Z",
  "resend_available_at": "2026-10-30T08:41:59.191432383Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380669401848` → **200**

```json
{
  "phone": "+380669401848",
  "audience": "CLIENT",
  "code": "796074",
  "sent_at": "2026-10-30T08:41:58.193449861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f8a536c4-7f02-4e03-9be2-e8c2984fa283",
  "code": "796074",
  "device_ref": "sandbox-11656"
}
```

```json
{
  "session_id": "8b5e74f9-6cb2-437e-8cc0-aea62b0e7c9f",
  "subject": {
    "type": "CLIENT",
    "id": "8ed2e365-c5b3-4c8e-a3e1-fe85e0c117d0"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZWQyZTM2NS1jNWIzLTRjOGUtYTNlMS1mZTg1ZTBjMTE3ZDAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjE4LCJpYXQiOjE3OTMzNDk3MTgsImp0aSI6ImYzYmQzZDY5LTNlNmUtNDI0MS05YTI1LTM0YjBiNzdiNWU5ZCIsInNpZCI6IjhiNWU3NGY5LTZjYjItNDM3ZS04Y2MwLWFlYTYyYjBlN2M5ZiJ9.ehijpgt3e0cpzGchN7MpyHSVbmHYFXWbuhHqFe21qIY",
  "access_expires_at": "2026-10-30T08:56:58.440273852Z",
  "refresh_token": "7Mb64euGDaEF7HxIm38lRC0jzQ9Tt1DmRzGwMb-c76Q",
  "refresh_expires_at": "2026-11-29T08:41:58.439819289Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ed94c842-beef-4a35-8bdc-76b8dc1a05a0",
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
  "id": "2a88dbd6-53d4-4890-9f5d-57402ca481d8",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:46:58.827341Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 2897e848-a7be-4c53-9faf-247271df6ce7) → **201**

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
  "session_id": "ef0ed203-5737-424b-b0aa-4928a7ae6662",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MTksImlhdCI6MTc5MzM0OTcxOSwianRpIjoiNDQ3YzIzNWYtZmRkZC00Y2I4LWI0MDQtNDMxZmFiMTk5ZjhhIiwic2lkIjoiZWYwZWQyMDMtNTczNy00MjRiLWIwYWEtNDkyOGE3YWU2NjYyIn0.lhAH3wFviN2MOxECKKkjaa2k9ZV12yMOvL_KTXjKf4k",
  "access_expires_at": "2026-10-30T08:56:59.34538636Z",
  "refresh_token": "iWqcz9O25-ItL2EZdad8_2u5fvAfdlm3jmhSMMedGBg",
  "refresh_expires_at": "2026-10-30T20:41:59.344940199Z",
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
  "session_id": "2f9af6ac-4650-41a1-bee9-a8722e734cac",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MTksImlhdCI6MTc5MzM0OTcxOSwianRpIjoiNmY4NzE5YWQtOGUzYi00YWMzLTliMTgtNjgwOWE3NGQwYTJlIiwic2lkIjoiMmY5YWY2YWMtNDY1MC00MWExLWJlZTktYTg3MjJlNzM0Y2FjIn0.L6fKeIwX3dc4whbe9tIS-AsNNrulSHdYZ6ktcHQfIfk",
  "access_expires_at": "2026-10-30T08:56:59.849319459Z",
  "refresh_token": "FTfYH1d7ltIaJE7f0ftc2rU0ROqa5Oo4wPbo9Koz1-Q",
  "refresh_expires_at": "2026-10-30T20:41:59.848836163Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/0a125a7a-cec1-4948-a725-9425839e7824/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:41:59.056724Z",
      "actor": {
        "type": "CLIENT",
        "id": "8ed2e365-c5b3-4c8e-a3e1-fe85e0c117d0",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0a125a7a-cec1-4948-a725-9425839e7824",
        "quote_id": "2a88dbd6-53d4-4890-9f5d-57402ca481d8",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2897e848-a7be-4c53-9faf-247271df6ce7"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:41:59.058386Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0a125a7a-cec1-4948-a725-9425839e7824",
        "attempt_id": "92f102bd-0280-458e-8581-1e70b4f010bb",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2897e848-a7be-4c53-9faf-247271df6ce7"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-30T08:41:59.06367Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0a125a7a-cec1-4948-a725-9425839e7824",
        "attempt_id": "92f102bd-0280-458e-8581-1e70b4f010bb"
      },
      "correlation_id": "2897e848-a7be-4c53-9faf-247271df6ce7"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "92f102bd-0280-458e-8581-1e70b4f010bb",
        "generation": 1,
        "started_at": "2026-10-30T08:41:59.057542Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-30T08:41:59.06367Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-30T08:41:59.059036Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/2897e848-a7be-4c53-9faf-247271df6ce7` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "0a125a7a-cec1-4948-a725-9425839e7824:0",
      "order_id": "0a125a7a-cec1-4948-a725-9425839e7824",
      "at": "2026-10-30T08:41:59.056724Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "0a125a7a-cec1-4948-a725-9425839e7824:1",
      "order_id": "0a125a7a-cec1-4948-a725-9425839e7824",
      "at": "2026-10-30T08:41:59.058386Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "0a125a7a-cec1-4948-a725-9425839e7824:2",
      "order_id": "0a125a7a-cec1-4948-a725-9425839e7824",
      "at": "2026-10-30T08:41:59.06367Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/69c7f590-b1c6-4078-92ff-d8acb5c5c0cd` → **200**

```json
{
  "found": []
}
```

Done: request 2897e848-a7be-4c53-9faf-247271df6ce7 — order 0a125a7a-cec1-4948-a725-9425839e7824 found by its id.

`GET /api/rider/v1/orders/0a125a7a-cec1-4948-a725-9425839e7824` → **200**

```json
{
  "id": "0a125a7a-cec1-4948-a725-9425839e7824",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "8ed2e365-c5b3-4c8e-a3e1-fe85e0c117d0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:41:59.056345Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0a125a7a-cec1-4948-a725-9425839e7824/cancel` → **200**

```json
{
  "command_id": "c52852a2-eedb-4b73-898c-fd4c2cb6be73",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0a125a7a-cec1-4948-a725-9425839e7824",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "8ed2e365-c5b3-4c8e-a3e1-fe85e0c117d0",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:41:59.056345Z",
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
  "phone": "+380636792011",
  "device_ref": "sandbox-21958"
}
```

```json
{
  "challenge_id": "008ee49d-da28-4730-9ec2-2f3171f7471f",
  "expires_at": "2026-10-30T08:47:01.283631622Z",
  "resend_available_at": "2026-10-30T08:42:02.283631622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636792011` → **200**

```json
{
  "phone": "+380636792011",
  "audience": "CLIENT",
  "code": "539108",
  "sent_at": "2026-10-30T08:42:01.285629961Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "008ee49d-da28-4730-9ec2-2f3171f7471f",
  "code": "539108",
  "device_ref": "sandbox-21958"
}
```

```json
{
  "session_id": "a31335fc-62c9-45d4-b6cd-5446fe4f1b56",
  "subject": {
    "type": "CLIENT",
    "id": "014e85f8-6771-433f-92b8-d350d1e20306"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwMTRlODVmOC02NzcxLTQzM2YtOTJiOC1kMzUwZDFlMjAzMDYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjIxLCJpYXQiOjE3OTMzNDk3MjEsImp0aSI6ImQ5NjdhY2Q4LTg5MDMtNDYxZS05NzlhLWRjZWQ3NjkxZjMwOCIsInNpZCI6ImEzMTMzNWZjLTYyYzktNDVkNC1iNmNkLTU0NDZmZTRmMWI1NiJ9.9JqdhhV858AdnOPxGtazcJvl1JnHxf6hbPBcfTCu5NM",
  "access_expires_at": "2026-10-30T08:57:01.535391181Z",
  "refresh_token": "jvz10Xclxxfu_KcQfksapE0jR6XXP5MKSFvv_wiut9Q",
  "refresh_expires_at": "2026-11-29T08:42:01.534955747Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "ac6adb2e-48b5-4a9d-8b31-8a5e53df9576",
  "expires_at": "2026-10-30T08:47:03.767233066Z",
  "resend_available_at": "2026-10-30T08:42:04.767233066Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636792011` → **200**

```json
{
  "phone": "+380636792011",
  "audience": "CLIENT",
  "code": "672991",
  "sent_at": "2026-10-30T08:42:03.821089074Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "5401b7b5-f7ac-468d-8c29-c8ea7016244c",
  "challenge_id": "ac6adb2e-48b5-4a9d-8b31-8a5e53df9576",
  "otp_code": "672991"
}
```

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "PENDING",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8` → **200**

```json
{
  "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
  "state": "READY",
  "created_at": "2026-10-30T08:42:04.073848Z",
  "ready_at": "2026-10-30T08:42:13.34835Z",
  "expires_at": "2026-11-06T08:42:13.34835Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632599644",
  "device_ref": "sandbox-13404"
}
```

```json
{
  "challenge_id": "4069d747-f8e3-4b95-a3e1-7f112c2713b7",
  "expires_at": "2026-10-30T08:47:14.34833184Z",
  "resend_available_at": "2026-10-30T08:42:15.34833184Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632599644` → **200**

```json
{
  "phone": "+380632599644",
  "audience": "CLIENT",
  "code": "445095",
  "sent_at": "2026-10-30T08:42:14.350551747Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4069d747-f8e3-4b95-a3e1-7f112c2713b7",
  "code": "445095",
  "device_ref": "sandbox-13404"
}
```

```json
{
  "session_id": "eb1f1870-649d-4fde-8e69-1daca8a6eaf3",
  "subject": {
    "type": "CLIENT",
    "id": "f0e1a33f-9991-4d40-86b1-0e0c06dbb17e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMGUxYTMzZi05OTkxLTRkNDAtODZiMS0wZTBjMDZkYmIxN2UiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjM0LCJpYXQiOjE3OTMzNDk3MzQsImp0aSI6ImU3MTI5Y2ViLTk4OGQtNDgwYy1hNWU4LTViYWY4ZDRjNTQwNSIsInNpZCI6ImViMWYxODcwLTY0OWQtNGZkZS04ZTY5LTFkYWNhOGE2ZWFmMyJ9.arjNbYv5L2Xc6wUHucsstIYyFkIo6sOzzCaGC_o1TR4",
  "access_expires_at": "2026-10-30T08:57:14.604533799Z",
  "refresh_token": "FEf7PcJLvEMEw_iQy_jK9g7i5Row2ieC9rRrD29g-m8",
  "refresh_expires_at": "2026-11-29T08:42:14.604057354Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/fe70bde3-9e91-47aa-84fe-c703a893d6a8/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "1032009d-3739-47d7-98cd-018f0cfafb04"
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
  "session_id": "96394461-7ba0-48c8-9927-d7856725a43c",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MzUsImlhdCI6MTc5MzM0OTczNSwianRpIjoiMjUyYmM0MmYtMjAzYy00ZTEzLWJiMzgtMjk0N2Q1MDU4NDY1Iiwic2lkIjoiOTYzOTQ0NjEtN2JhMC00OGM4LTk5MjctZDc4NTY3MjVhNDNjIn0.Oe3GfDcXODqt-fxJRPRKUlLT7SGCE3NIZ-mxYgZs7U8",
  "access_expires_at": "2026-10-30T08:57:15.318751644Z",
  "refresh_token": "tOXTKAL0RibV8CIjj5UAP1LkWp2tVt_L4WeIne_If1w",
  "refresh_expires_at": "2026-10-30T20:42:15.318300947Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "014e85f8-6771-433f-92b8-d350d1e20306",
  "session_id": "a31335fc-62c9-45d4-b6cd-5446fe4f1b56",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/014e85f8-6771-433f-92b8-d350d1e20306/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "fe70bde3-9e91-47aa-84fe-c703a893d6a8",
      "state": "READY",
      "created_at": "2026-10-30T08:42:04.073848Z",
      "ready_at": "2026-10-30T08:42:13.34835Z",
      "expires_at": "2026-11-06T08:42:13.34835Z",
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
  "device_ref": "sandbox-6824"
}
```

```json
{
  "challenge_id": "972b0706-58e6-40af-bdd4-3b3af6d6c7ad",
  "expires_at": "2026-10-30T08:47:16.018450299Z",
  "resend_available_at": "2026-10-30T08:42:17.018450299Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "736101",
  "sent_at": "2026-10-30T08:42:16.02063342Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "972b0706-58e6-40af-bdd4-3b3af6d6c7ad",
  "code": "736101",
  "device_ref": "sandbox-6824"
}
```

```json
{
  "session_id": "3f1302d3-f688-4ef9-a649-00275fbcbcff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDYzNiwiaWF0IjoxNzkzMzQ5NzM2LCJqdGkiOiJmODNmOGQ3Mi1lZDkyLTQzNzUtYTZkYy0zZjRiM2JkMjAxMGQiLCJzaWQiOiIzZjEzMDJkMy1mNjg4LTRlZjktYTY0OS0wMDI3NWZiY2JjZmYifQ.3tuxh9m-xay8Gk91YHvlanHBZFngZvZfxPJYT3nQ3Sk",
  "access_expires_at": "2026-10-30T08:57:16.276306492Z",
  "refresh_token": "AWi-JoBzunWeSGS4cFbleii7J6sbWh9hs8Z9qIiCOMM",
  "refresh_expires_at": "2026-11-29T08:42:16.275841383Z",
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
  "device_ref": "sandbox-16365"
}
```

```json
{
  "challenge_id": "098c992c-0819-4e2d-82f2-424206d23e4d",
  "expires_at": "2026-10-30T08:47:16.727735232Z",
  "resend_available_at": "2026-10-30T08:42:17.727735232Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "675506",
  "sent_at": "2026-10-30T08:42:16.730061105Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "098c992c-0819-4e2d-82f2-424206d23e4d",
  "code": "675506",
  "device_ref": "sandbox-16365"
}
```

```json
{
  "session_id": "93ad0983-4e19-42aa-ba9f-586806d3a11d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDYzNiwiaWF0IjoxNzkzMzQ5NzM2LCJqdGkiOiJhM2RmM2JlOC00NjY4LTQ3OTctYTVmOC00MDE0OTVlMTAxMzAiLCJzaWQiOiI5M2FkMDk4My00ZTE5LTQyYWEtYmE5Zi01ODY4MDZkM2ExMWQifQ.6SU7j4GZbPyflY_junYZPpk2JOksY5aXPOvrG91JNco",
  "access_expires_at": "2026-10-30T08:57:16.97980456Z",
  "refresh_token": "iyd_K233pxuIgrYi4nFbg291-sbHVVp2tyM_RgLik3s",
  "refresh_expires_at": "2026-11-29T08:42:16.97923625Z",
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
  "command_id": "b8309eff-210e-49f6-a24f-9e67f3fe40bf",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:17Z",
    "sequence": 1793349737418
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbbe6778-dfe7-45d4-a68a-a88aff704083",
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
  "last_heartbeat_at": "2026-10-30T08:42:17.435324Z",
  "last_location_at": "2026-10-30T08:42:17.435324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-8915"
}
```

```json
{
  "challenge_id": "cca75c50-5b62-433b-b638-6428e816a1d7",
  "expires_at": "2026-10-30T08:47:17.66309508Z",
  "resend_available_at": "2026-10-30T08:42:18.66309508Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "383121",
  "sent_at": "2026-10-30T08:42:17.66538574Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cca75c50-5b62-433b-b638-6428e816a1d7",
  "code": "383121",
  "device_ref": "sandbox-8915"
}
```

```json
{
  "session_id": "98deef24-0589-4f4e-abd3-fb1395838647",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDYzNywiaWF0IjoxNzkzMzQ5NzM3LCJqdGkiOiI0N2Q1YTFmYi1mZmIxLTQwODctOWNkNS00MDlhNTUyNWNhY2YiLCJzaWQiOiI5OGRlZWYyNC0wNTg5LTRmNGUtYWJkMy1mYjEzOTU4Mzg2NDcifQ.PLle6zcONIDPsMdRmqK6pWp6KvSXhI8-SmED6U2VGSM",
  "access_expires_at": "2026-10-30T08:57:17.920986055Z",
  "refresh_token": "QNqSPo1hBtma9FzY7tfP-vMRL_rssTirq5SvbC8GgzQ",
  "refresh_expires_at": "2026-11-29T08:42:17.920440397Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2b7891e-1d0e-4f9d-9069-247367bb97fd",
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
  "last_heartbeat_at": "2026-10-30T08:40:48.430567Z",
  "last_location_at": "2026-10-30T08:40:48.430567Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e2b7891e-1d0e-4f9d-9069-247367bb97fd/handover` → **200**

```json
{
  "command_id": "152784df-2dd2-4adf-a12e-5f015e03e0c3",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2b7891e-1d0e-4f9d-9069-247367bb97fd",
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
  "last_heartbeat_at": "2026-10-30T08:40:48.430567Z",
  "last_location_at": "2026-10-30T08:40:48.430567Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e2b7891e-1d0e-4f9d-9069-247367bb97fd/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:18Z",
    "sequence": 1793349738606
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "e2b7891e-1d0e-4f9d-9069-247367bb97fd",
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
  "last_heartbeat_at": "2026-10-30T08:42:18.623428Z",
  "last_location_at": "2026-10-30T08:42:18.623428Z",
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
  "session_id": "bb52f31d-71d0-4af2-b574-61820d64ac67",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MzksImlhdCI6MTc5MzM0OTczOSwianRpIjoiZTZiZDA4ZGUtNGRlNC00YzBjLWE5ZDktNTc1MDMwNTNjNTU4Iiwic2lkIjoiYmI1MmYzMWQtNzFkMC00YWYyLWI1NzQtNjE4MjBkNjRhYzY3In0.Sw4CW5G5dktrIJSAXBh4rwIPNbI8GYv53qc3NDLZLhs",
  "access_expires_at": "2026-10-30T08:57:19.104085092Z",
  "refresh_token": "wSB74S0jecdt8jF_uUFueDQbsvJR08drkeFwQR0fiZc",
  "refresh_expires_at": "2026-10-30T20:42:19.10357045Z",
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
  "session_id": "30175ca8-8f89-4ae8-9016-3c779d930f72",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2MzksImlhdCI6MTc5MzM0OTczOSwianRpIjoiODkyMjRjODAtZTQ3ZS00ZWRkLTkyZTgtNDc2MWJhZGZmYjdkIiwic2lkIjoiMzAxNzVjYTgtOGY4OS00YWU4LTkwMTYtM2M3NzlkOTMwZjcyIn0.EbndSlzk8_fWJ_VrXNJRj9zsE1MbrAM9pXdH6D7bQNQ",
  "access_expires_at": "2026-10-30T08:57:19.590139021Z",
  "refresh_token": "5jjRIG04lA3KCw2NwmENOtwk-Z75cpz5tNSGxBy1LI8",
  "refresh_expires_at": "2026-10-30T20:42:19.589677768Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380683820740",
  "device_ref": "sandbox-32318"
}
```

```json
{
  "challenge_id": "10d0bd8b-763f-4f40-8e37-e7a9395b7297",
  "expires_at": "2026-10-30T08:47:19.817583271Z",
  "resend_available_at": "2026-10-30T08:42:20.817583271Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380683820740` → **200**

```json
{
  "phone": "+380683820740",
  "audience": "CLIENT",
  "code": "415139",
  "sent_at": "2026-10-30T08:42:19.819688357Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10d0bd8b-763f-4f40-8e37-e7a9395b7297",
  "code": "415139",
  "device_ref": "sandbox-32318"
}
```

```json
{
  "session_id": "61251620-3db5-4ca6-b44c-f4426ddb04eb",
  "subject": {
    "type": "CLIENT",
    "id": "207a665f-ca29-4df3-876b-3b8755aa8fb5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDdhNjY1Zi1jYTI5LTRkZjMtODc2Yi0zYjg3NTVhYThmYjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjQwLCJpYXQiOjE3OTMzNDk3NDAsImp0aSI6IjQ2NDBhNTk2LTVjN2YtNDZjZC05YmU1LTQ0N2VmOWQxMDk3NiIsInNpZCI6IjYxMjUxNjIwLTNkYjUtNGNhNi1iNDRjLWY0NDI2ZGRiMDRlYiJ9.yQDiY-4RSxFhBzovhtiwo-q4tIj6BRN6pP8FS_Eexpg",
  "access_expires_at": "2026-10-30T08:57:20.100240823Z",
  "refresh_token": "GXdG0B7iDsX1ALNYYO815-nvKWsOg-tHMkrWzj5dVo0",
  "refresh_expires_at": "2026-11-29T08:42:20.099683378Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "db629307-4bb3-4fd7-879c-2b28fbd6dad2",
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
  "id": "ebef6c79-326d-4fb6-ba13-91b5535fca2a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:20.340227Z",
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
  "command_id": "4afbcd3a-89cc-415e-b79c-fb88279834f9",
  "quote_id": "ebef6c79-326d-4fb6-ba13-91b5535fca2a",
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
  "id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "207a665f-ca29-4df3-876b-3b8755aa8fb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:42:20.585621Z",
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
    "id": "30146161-abaf-4374-8726-9ff05931a347",
    "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
    "expires_at": "2026-10-30T08:42:35.588405Z",
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

`POST /api/driver/v1/offers/30146161-abaf-4374-8726-9ff05931a347/reject` → **204**

```json
{
  "command_id": "e961f618-ca4c-4f52-a29a-d422fc3465f5"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "974aefe7-d73c-48cd-8192-796f43c219dc",
    "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
    "expires_at": "2026-10-30T08:42:36.107077Z",
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

`POST /api/driver/v1/offers/974aefe7-d73c-48cd-8192-796f43c219dc/accept` → **200**

```json
{
  "command_id": "b9c77ca0-5aa8-4cad-b075-ad90108aac61"
}
```

```json
{
  "id": "e8912ef1-517b-4037-9dba-36dab4838e37",
  "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4bf42f62-658d-45d7-91af-db14270dd1b9",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/c443203f-d714-4fff-a31b-d9d7375d27d9/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:42:20.586018Z",
      "actor": {
        "type": "CLIENT",
        "id": "207a665f-ca29-4df3-876b-3b8755aa8fb5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
        "quote_id": "ebef6c79-326d-4fb6-ba13-91b5535fca2a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f2641a82-353c-4ee6-b081-ece184d63be0"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:42:20.587728Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
        "attempt_id": "5bba0c59-1dcf-4a1c-a980-6fb9726d8234",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f2641a82-353c-4ee6-b081-ece184d63be0"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:42:20.5908Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "30146161-abaf-4374-8726-9ff05931a347",
        "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f2641a82-353c-4ee6-b081-ece184d63be0"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-30T08:42:21.106252Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "30146161-abaf-4374-8726-9ff05931a347",
        "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9"
      },
      "correlation_id": "459b7bfc-20a2-4b42-acb1-04db2d4a2d2f"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order c443203f-d714-4fff-a31b-d9d7375d27d9 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/c443203f-d714-4fff-a31b-d9d7375d27d9` → **200**

```json
{
  "id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "207a665f-ca29-4df3-876b-3b8755aa8fb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e8912ef1-517b-4037-9dba-36dab4838e37",
    "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "4bf42f62-658d-45d7-91af-db14270dd1b9",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:42:20.585621Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c443203f-d714-4fff-a31b-d9d7375d27d9/cancel` → **200**

```json
{
  "command_id": "8da9c379-ddf1-412c-a60d-e518304ce477",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "207a665f-ca29-4df3-876b-3b8755aa8fb5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e8912ef1-517b-4037-9dba-36dab4838e37",
    "order_id": "c443203f-d714-4fff-a31b-d9d7375d27d9",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "4bf42f62-658d-45d7-91af-db14270dd1b9",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:42:20.585621Z",
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
  "session_id": "dbbe6778-dfe7-45d4-a68a-a88aff704083",
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
  "last_heartbeat_at": "2026-10-30T08:42:17.435324Z",
  "last_location_at": "2026-10-30T08:42:17.435324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbbe6778-dfe7-45d4-a68a-a88aff704083/close` → **200**

```json
{
  "command_id": "247d6752-87cd-4e04-9343-b388ab4e6862",
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
  "session_id": "e2b7891e-1d0e-4f9d-9069-247367bb97fd",
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
  "last_heartbeat_at": "2026-10-30T08:42:18.623428Z",
  "last_location_at": "2026-10-30T08:42:18.623428Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e2b7891e-1d0e-4f9d-9069-247367bb97fd/close` → **200**

```json
{
  "command_id": "6f24c2f2-a7a3-4892-ae84-b35209afc04c",
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
  "session_id": "7a5ee26c-9667-42ad-a7db-9e4555def04a",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NDMsImlhdCI6MTc5MzM0OTc0MywianRpIjoiNTFlYTdjYjktYzgzYi00YjAxLWE1ZTQtMmZhNmEwNTk2OTVlIiwic2lkIjoiN2E1ZWUyNmMtOTY2Ny00MmFkLWE3ZGItOWU0NTU1ZGVmMDRhIn0.aPjrqYz6bmW4IVWyMe_0bd3jZTpeBnsB_K5CHY8PX7E",
  "access_expires_at": "2026-10-30T08:57:23.659999448Z",
  "refresh_token": "AONB8hnBd5q5MiQ0MNuU1Z9ETOTKJ70qIJjVK46kQ7A",
  "refresh_expires_at": "2026-10-30T20:42:23.659518496Z",
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
  "command_id": "e9683057-4929-4bf6-a12f-02da6f49f156",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-30T08:42:24.147463Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "175fa184-7253-4b83-9db9-a0018328bd6d",
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
  "correlation_id": "dd718a67-378e-44f8-bf6e-8f4a6b006e9c"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c666606a-702a-4a97-9779-4d93d25f5449",
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
  "correlation_id": "f3d501ad-42d1-4540-8b46-5815f85334ee"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638962555",
  "device_ref": "sandbox-28116"
}
```

```json
{
  "challenge_id": "b69d49bb-db77-4c11-a860-9bb1e3c46098",
  "expires_at": "2026-10-30T08:47:24.865048417Z",
  "resend_available_at": "2026-10-30T08:42:25.865048417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638962555` → **200**

```json
{
  "phone": "+380638962555",
  "audience": "CLIENT",
  "code": "086937",
  "sent_at": "2026-10-30T08:42:24.867208678Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b69d49bb-db77-4c11-a860-9bb1e3c46098",
  "code": "086937",
  "device_ref": "sandbox-28116"
}
```

```json
{
  "session_id": "c96c8bbb-2ea2-4d77-b3e5-d37f1e69fdcc",
  "subject": {
    "type": "CLIENT",
    "id": "a44a94b6-1b36-4433-bd80-4d201aae2601"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhNDRhOTRiNi0xYjM2LTQ0MzMtYmQ4MC00ZDIwMWFhZTI2MDEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjQ1LCJpYXQiOjE3OTMzNDk3NDUsImp0aSI6ImFlZmZhOTkwLWMzOTQtNDhmNi1iYjFjLTVmYWIxMTFlNDY4NyIsInNpZCI6ImM5NmM4YmJiLTJlYTItNGQ3Ny1iM2U1LWQzN2YxZTY5ZmRjYyJ9.US92PWfmLSI7U3CllsnUIQlNGuhKv4gcVbp6Ta8JPRk",
  "access_expires_at": "2026-10-30T08:57:25.224468439Z",
  "refresh_token": "pV3-nzt2m4ZmRsfstUNK1CzkVytkiU1StZIgaYc4x_0",
  "refresh_expires_at": "2026-11-29T08:42:25.224062608Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7589e2d5-0f9b-4a3b-ad18-b5837660076d",
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
  "id": "b4735009-bf7f-4d2b-a913-a42f6ff7e489",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:25.687872Z",
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
  "command_id": "600914f3-4449-4951-91d2-56fc64fd5808",
  "quote_id": "b4735009-bf7f-4d2b-a913-a42f6ff7e489",
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
  "correlation_id": "fb35fd7d-b2c2-45ab-b7a7-5419334bd7fb"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "81fb1526-0dd2-4c04-b883-5c0e575486e2",
  "quote_id": "b4735009-bf7f-4d2b-a913-a42f6ff7e489",
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
  "id": "8e317bd0-11b1-4211-94a3-ece0828eb45d",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a44a94b6-1b36-4433-bd80-4d201aae2601",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:42:26.267709Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8e317bd0-11b1-4211-94a3-ece0828eb45d/cancel` → **200**

```json
{
  "command_id": "254cb639-2842-451d-b78b-77a1280e2f85",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8e317bd0-11b1-4211-94a3-ece0828eb45d",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a44a94b6-1b36-4433-bd80-4d201aae2601",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:42:26.267709Z",
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
  "command_id": "82ae6dfc-6768-443e-b33e-ea4a14638639",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-30T08:42:26.783413Z"
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
      "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-30T08:42:26.783413Z"
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
  "device_ref": "sandbox-26008"
}
```

```json
{
  "challenge_id": "386c04fa-a8f7-46d6-9aa6-71acb9e6cfe4",
  "expires_at": "2026-10-30T08:47:27.504991782Z",
  "resend_available_at": "2026-10-30T08:42:28.504991782Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "689854",
  "sent_at": "2026-10-30T08:42:27.507094737Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "386c04fa-a8f7-46d6-9aa6-71acb9e6cfe4",
  "code": "689854",
  "device_ref": "sandbox-26008"
}
```

```json
{
  "session_id": "6e5e3048-7237-4785-8c27-6bc6cc086c30",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY0NywiaWF0IjoxNzkzMzQ5NzQ3LCJqdGkiOiI4ZDAyYWQ5Ny02NmJjLTQyZTAtODUzYi0xOGQwY2NhZmFjNjgiLCJzaWQiOiI2ZTVlMzA0OC03MjM3LTQ3ODUtOGMyNy02YmM2Y2MwODZjMzAifQ.ITkIj0hEQMbghuJRRbpbA2hltnQxlxxH6Fg8BhAXPvw",
  "access_expires_at": "2026-10-30T08:57:27.759331629Z",
  "refresh_token": "-rcG526sr8xzudLhR1xxPLeEm4MsQr0NrEDxFpCCLQo",
  "refresh_expires_at": "2026-11-29T08:42:27.758843506Z",
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
  "command_id": "cc8d7b16-7b1f-4f20-a97c-4638976e5f21",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:28Z",
    "sequence": 1793349748208
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:28.225284Z",
  "last_location_at": "2026-10-30T08:42:28.225284Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673196253",
  "device_ref": "sandbox-32149"
}
```

```json
{
  "challenge_id": "4ab61a01-f2ad-4145-b472-a8cc49d282b6",
  "expires_at": "2026-10-30T08:47:28.464767706Z",
  "resend_available_at": "2026-10-30T08:42:29.464767706Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673196253` → **200**

```json
{
  "phone": "+380673196253",
  "audience": "CLIENT",
  "code": "393761",
  "sent_at": "2026-10-30T08:42:28.466920055Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4ab61a01-f2ad-4145-b472-a8cc49d282b6",
  "code": "393761",
  "device_ref": "sandbox-32149"
}
```

```json
{
  "session_id": "bb3fb7c0-68c9-4bec-84af-aa22e84f2ea7",
  "subject": {
    "type": "CLIENT",
    "id": "e3f64345-c82c-4915-9a54-b0c74594f52c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlM2Y2NDM0NS1jODJjLTQ5MTUtOWE1NC1iMGM3NDU5NGY1MmMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjQ4LCJpYXQiOjE3OTMzNDk3NDgsImp0aSI6ImU4NGJjODFjLTI2MDUtNDI4YS1iOWZkLWFlMWM2MzFmZmVmYSIsInNpZCI6ImJiM2ZiN2MwLTY4YzktNGJlYy04NGFmLWFhMjJlODRmMmVhNyJ9.Q2SR6UQLlANyS4xDECgs3ZvzZCqHsD2lQSiYfEzOd1Q",
  "access_expires_at": "2026-10-30T08:57:28.725079662Z",
  "refresh_token": "JqcNw7UbhNkoovWdNUTPgyJMEN70ogEA7HPV8yk5GuQ",
  "refresh_expires_at": "2026-11-29T08:42:28.72459945Z",
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
  "command_id": "967771ef-f68c-44cc-adf7-687c0ad694e2",
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
  "id": "a52eeeaa-9543-4c3b-95f1-9572a7909d2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:29.193930Z",
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
  "command_id": "41350a23-025a-493c-aa13-46f9880abdbe",
  "platform": "ANDROID",
  "token": "sandbox-driver-6f360087-4acf-42dd-939a-25ee893b0d6b"
}
```

```json
{
  "id": "55cd2708-27b7-4942-921b-210ee0f91b38",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:42:29.454384Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "e5d810f3-9657-4a90-8f1f-d8dda514e194",
  "platform": "ANDROID",
  "token": "sandbox-rider-c541cbdb-013a-4cdb-8173-1a33333ef8e4"
}
```

```json
{
  "id": "b80f9fee-2c3a-4268-ab18-627b475d1ba0",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-30T08:42:29.697291Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f906d963-fb20-4645-aed8-94f466a60941",
  "quote_id": "a52eeeaa-9543-4c3b-95f1-9572a7909d2e",
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
  "id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "e3f64345-c82c-4915-9a54-b0c74594f52c",
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
  "created_at": "2026-10-30T08:42:29.944856Z",
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
    "id": "b88bc25e-4ceb-40ca-94cd-d3d8b8111320",
    "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
    "expires_at": "2026-10-30T08:42:44.947754Z",
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

`POST /api/driver/v1/offers/b88bc25e-4ceb-40ca-94cd-d3d8b8111320/accept` → **200**

```json
{
  "command_id": "6947043c-1b27-46e6-884f-7b3cde6b063c"
}
```

```json
{
  "id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:42:29.921Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-30T08:42:29.921Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:42:30.715286515Z",
    "token_suffix": "3b0d6b",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "type": "driver.offer",
      "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
      "order_version": "2",
      "event_id": "95c3e5ff-2c83-4817-9ab3-9559678f87c2"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380673196253&after=2026-10-30T08:42:29.921Z` → **200**

```json
[
  {
    "at": "2026-10-30T08:42:30.717443498Z",
    "token_suffix": "3ef8e4",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "type": "rider.driver-assigned",
      "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
      "order_version": "3",
      "event_id": "4b9c1c36-e09d-4fe6-8cb0-949e94fd7dfc"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/eccdbf99-5b78-44f0-aba1-c961c67b54fd/messages` → **201**

```json
{
  "command_id": "b08a3a90-e991-4904-80d0-8aa77e8f63d2",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "839e6b30-c77e-4582-8acf-525bc2a9d217",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-30T08:42:31.7668318Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "assignment_id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
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

`POST /api/driver/v1/trips/56c8b06c-1c24-4ee6-bc70-279d18dbf4e5/messages` → **201**

```json
{
  "command_id": "60004215-ca8f-48d2-a47a-32fa1152c02f",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "dd697e01-6d8c-4375-aa23-371a08c8ec62",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-30T08:42:32.229506994Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/eccdbf99-5b78-44f0-aba1-c961c67b54fd/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/56c8b06c-1c24-4ee6-bc70-279d18dbf4e5/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380673196253"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:32Z",
    "sequence": 1793349752924
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:32.942135Z",
  "last_location_at": "2026-10-30T08:42:32.942135Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "assignment_id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
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

`POST /api/driver/v1/trips/56c8b06c-1c24-4ee6-bc70-279d18dbf4e5/arrive` → **200**

```json
{
  "command_id": "5f430e9a-9257-4b55-bbf5-9c544649a0e3",
  "expected_version": 0
}
```

```json
{
  "id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "assignment_id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
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
  "arrived_at": "2026-10-30T08:42:33.405392Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/56c8b06c-1c24-4ee6-bc70-279d18dbf4e5/start` → **200**

```json
{
  "command_id": "95b70269-cc83-48c7-bbf1-40c6173763d7",
  "expected_version": 1
}
```

```json
{
  "id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "assignment_id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
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
  "arrived_at": "2026-10-30T08:42:33.405392Z",
  "started_at": "2026-10-30T08:42:33.649295Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:33Z",
    "sequence": 1793349753875
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:33.893012Z",
  "last_location_at": "2026-10-30T08:42:33.893012Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/56c8b06c-1c24-4ee6-bc70-279d18dbf4e5/complete` → **200**

```json
{
  "command_id": "0ee7c16f-39f0-4e98-9de9-08e7ea8ee95f",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:42:34Z",
  "cash_received": true
}
```

```json
{
  "id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "assignment_id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
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
  "arrived_at": "2026-10-30T08:42:33.405392Z",
  "started_at": "2026-10-30T08:42:33.649295Z",
  "completed_at": "2026-10-30T08:42:34.13481Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/eccdbf99-5b78-44f0-aba1-c961c67b54fd` → **200**

```json
{
  "id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "e3f64345-c82c-4915-9a54-b0c74594f52c",
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
    "id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d",
    "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:42:29.944856Z",
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
    "id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:42:29.944856Z",
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
    "id": "56c8b06c-1c24-4ee6-bc70-279d18dbf4e5",
    "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
    "order_short_number": 13,
    "created_at": "2026-10-30T08:42:30.439122Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "5727c594-2d0c-4c24-b03d-ea05c71d1bdf",
    "order_id": "eb370146-1a70-4611-b0fd-7f3d49b3be0b",
    "order_short_number": 8,
    "created_at": "2026-10-30T08:41:19.549496Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "2c5cf2e9-8b4a-4362-aeb8-da3ff6dd478c",
    "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
    "order_short_number": 3,
    "created_at": "2026-10-30T08:40:38.101226Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6dce82b1-3e7f-488d-bfb8-725ff93b8c1c",
    "order_id": "4b407aad-116f-4560-8294-e3c876815a23",
    "order_short_number": 2,
    "created_at": "2026-10-30T08:40:24.530988Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "3a52ab5f-c09b-491c-93d4-a3c8a2b9e735",
    "order_id": "0b0ad1a4-7ee1-4607-b680-504ebec2f768",
    "order_short_number": 1,
    "created_at": "2026-10-30T08:40:16.346316Z",
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

`GET /api/driver/v1/earnings?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
      "figures": {
        "trips": 5,
        "fare_minor": 52585,
        "commission_minor": 7890,
        "driver_share_minor": 44695,
        "held_minor": 0,
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
    "held_minor": 0,
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

`GET /api/rider/v1/orders/eccdbf99-5b78-44f0-aba1-c961c67b54fd/tip` → **200**

```json
{
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
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
  "available_until": "2026-10-31T08:42:34.13481Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/eccdbf99-5b78-44f0-aba1-c961c67b54fd/tip` → **201**

```json
{
  "command_id": "c457311d-be2d-4955-8d82-6b577b65c491",
  "amount_minor": 1100
}
```

```json
{
  "id": "da22ac2c-b00e-48d8-83b1-8f9f93a76408",
  "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-30T08:42:38.812198Z"
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
  "session_id": "54ce9138-f9f3-4520-b8d2-d1f4fbd280a2",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NTksImlhdCI6MTc5MzM0OTc1OSwianRpIjoiNWYyMzAxZGUtY2MwMi00YThkLThhNDQtOWViODg1ZTEzNzBhIiwic2lkIjoiNTRjZTkxMzgtZjlmMy00NTIwLWI4ZDItZDFmNGZiZDI4MGEyIn0.ykZp9hDfS9BTvC6HySAkfqQFR4ucFL67XYGRKvvyPWY",
  "access_expires_at": "2026-10-30T08:57:39.303026867Z",
  "refresh_token": "7xioj3GdW83wqGPqSObnwx6B0iqvLqJ-k04sqga4PJ8",
  "refresh_expires_at": "2026-10-30T20:42:39.302568407Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/reports/orders?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
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
  "generated_at": "2026-10-30T08:42:39.540673665Z"
}
```

`GET /api/admin/v1/reports/finance?city_id=5a000000-0000-4000-8000-000000000001&from=2026-10-30&to=2026-10-30` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "currency": "UAH",
  "timezone": "Europe/Kyiv",
  "from": "2026-10-30",
  "to": "2026-10-30",
  "days": [
    {
      "date": "2026-10-30",
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
  "generated_at": "2026-10-30T08:42:39.783407142Z"
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
  "session_id": "887aa1db-8ed9-4d63-9604-7202f87783d4",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NjAsImlhdCI6MTc5MzM0OTc2MCwianRpIjoiNWEyNTFlNDItNDE2My00NWYzLTg2MmMtZDE3MTJjNDQyOThiIiwic2lkIjoiODg3YWExZGItOGVkOS00ZDYzLTk2MDQtNzIwMmY4Nzc4M2Q0In0.Xu8O1ZI3wAiOEwBMH1FqrMu6Sz3WvahhX-kdijsHljA",
  "access_expires_at": "2026-10-30T08:57:40.276195517Z",
  "refresh_token": "bp4nh2OKoPXkLJhJc9OWTX50SoQn3IOTZlw26wowAFM",
  "refresh_expires_at": "2026-10-30T20:42:40.275562169Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/eccdbf99-5b78-44f0-aba1-c961c67b54fd/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:42:29.945379Z",
      "actor": {
        "type": "CLIENT",
        "id": "e3f64345-c82c-4915-9a54-b0c74594f52c",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
        "quote_id": "a52eeeaa-9543-4c3b-95f1-9572a7909d2e",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "c894ffe9-7dec-4443-984f-e63f9456e270"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:42:29.947132Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
        "attempt_id": "dbc873c7-9b3d-4f84-b827-eb2ffe033d29",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "c894ffe9-7dec-4443-984f-e63f9456e270"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:42:29.94973Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b88bc25e-4ceb-40ca-94cd-d3d8b8111320",
        "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "c894ffe9-7dec-4443-984f-e63f9456e270"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:42:30.440404Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b88bc25e-4ceb-40ca-94cd-d3d8b8111320",
        "order_id": "eccdbf99-5b78-44f0-aba1-c961c67b54fd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "7bc389d1-f066-4d87-a237-ff5e1b3a446d"
      },
      "correlation_id": "2a8dc7b8-2010-4788-8338-fb14bcfa3447"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-30T08:42:40.749852309Z",
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
      "last_location_at": "2026-10-30T08:42:33.893012Z",
      "order_id": null
    }
  ]
}
```

Done: order eccdbf99-5b78-44f0-aba1-c961c67b54fd.

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
  "session_id": "b472caec-6752-4010-af87-fc44a1cb512c",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NjEsImlhdCI6MTc5MzM0OTc2MSwianRpIjoiYTA5ZjUyNWItNmEzOC00N2FmLWJlNTktODE4YjBmNmE3MWRjIiwic2lkIjoiYjQ3MmNhZWMtNjc1Mi00MDEwLWFmODctZmM0NGExY2I1MTJjIn0.NLJm_mqTpHNwvDvSuhEHqK9nQ4ER138WUqtURAdVqGQ",
  "access_expires_at": "2026-10-30T08:57:41.267769647Z",
  "refresh_token": "coCFLbzrDMzTwdn7FAp0y9bXkqH9xz4L9mZdwGIqAsQ",
  "refresh_expires_at": "2026-10-30T20:42:41.267301553Z",
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
  "command_id": "cd92ed02-ba7c-4aa6-a546-154880790db2",
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
  "timestamp": "2026-10-30T08:42:41.000+0000",
  "channel": {
    "id": "1730052000.1053929897",
    "linkedid": "1730052000.1053929897",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676796774"
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
  "timestamp": "2026-10-30T08:42:41.000+0000",
  "channel": {
    "id": "1730052000.1053929897",
    "linkedid": "1730052000.1053929897",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380676796774"
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
  "session_id": "86583757-e02b-4aae-b7d6-705b18fa3c4c",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NjIsImlhdCI6MTc5MzM0OTc2MiwianRpIjoiM2MzZWQyZDEtMTU2OC00OGFlLWI3ZjktMmVlZjY4YjI2ZDM5Iiwic2lkIjoiODY1ODM3NTctZTAyYi00YWFlLWI3ZDYtNzA1YjE4ZmEzYzRjIn0.OpwVkjrmx5n42yYcuY_wt4c0DH0oKIlwDKGhuA0wHlg",
  "access_expires_at": "2026-10-30T08:57:42.250146545Z",
  "refresh_token": "T1PZgnBrs5fwd6OK2sDn3OWUISfnYRn0nnkrfEEZRJM",
  "refresh_expires_at": "2026-10-30T20:42:42.249677409Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "f79b52ee-b71a-423a-9c90-03bf549d441f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380676796774",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-30T08:42:41Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/f79b52ee-b71a-423a-9c90-03bf549d441f/answer` → **200**

```json
{
  "command_id": "2ea09097-905b-4075-b509-a6419cf9f456"
}
```

```json
{
  "id": "f79b52ee-b71a-423a-9c90-03bf549d441f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380676796774",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "order_ids": [],
  "started_at": "2026-10-30T08:42:41Z",
  "answered_at": "2026-10-30T08:42:42.723774Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1053929897",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ee66f108-8698-4122-b5a6-02c476216332",
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
  "id": "b457ea9f-d13a-4226-8825-2f09722a94f3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:42.988196Z",
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
  "command_id": "f06ef9c9-635f-459f-a6d0-6281b9074d53",
  "quote_id": "b457ea9f-d13a-4226-8825-2f09722a94f3",
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
    "phone": "+380676796774"
  },
  "call_id": "f79b52ee-b71a-423a-9c90-03bf549d441f"
}
```

```json
{
  "id": "bb37bb5d-e04b-4ee1-b845-f0f30295feb7",
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
  "created_at": "2026-10-30T08:42:43.22773Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676796774"
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
    "id": "1730052000.1053929897",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "f79b52ee-b71a-423a-9c90-03bf549d441f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380676796774",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [
        "bb37bb5d-e04b-4ee1-b845-f0f30295feb7"
      ],
      "started_at": "2026-10-30T08:42:41Z",
      "answered_at": "2026-10-30T08:42:42.723774Z",
      "ended_at": "2026-10-30T08:42:43.482568Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "0d024f4a-c895-409b-8653-5ed4d8a82e89",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380671301080",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [],
      "started_at": "2026-10-30T08:40:31.975861Z",
      "answered_at": "2026-10-30T08:40:32.235049Z",
      "ended_at": "2026-10-30T08:40:32.488369Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:40:33.321123Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/bb37bb5d-e04b-4ee1-b845-f0f30295feb7` → **200**

```json
{
  "id": "bb37bb5d-e04b-4ee1-b845-f0f30295feb7",
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
  "created_at": "2026-10-30T08:42:43.22773Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676796774"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/bb37bb5d-e04b-4ee1-b845-f0f30295feb7` → **200**

```json
{
  "id": "bb37bb5d-e04b-4ee1-b845-f0f30295feb7",
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
  "created_at": "2026-10-30T08:42:43.22773Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676796774"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/bb37bb5d-e04b-4ee1-b845-f0f30295feb7/cancel` → **200**

```json
{
  "command_id": "02e2f3b1-82f4-497d-b36f-c5362321f3a3",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "bb37bb5d-e04b-4ee1-b845-f0f30295feb7",
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
  "created_at": "2026-10-30T08:42:43.22773Z",
  "caller": {
    "name": "Caller",
    "phone": "+380676796774"
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

Done: call f79b52ee-b71a-423a-9c90-03bf549d441f with order bb37bb5d-e04b-4ee1-b845-f0f30295feb7.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-10655"
}
```

```json
{
  "challenge_id": "22765978-3daa-4b6f-82ce-7f2f87942c52",
  "expires_at": "2026-10-30T08:47:44.52236866Z",
  "resend_available_at": "2026-10-30T08:42:45.52236866Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "194702",
  "sent_at": "2026-10-30T08:42:44.52432624Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "22765978-3daa-4b6f-82ce-7f2f87942c52",
  "code": "194702",
  "device_ref": "sandbox-10655"
}
```

```json
{
  "session_id": "4dfc891b-aaf7-4a37-8a1c-9ea8903640f3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY2NCwiaWF0IjoxNzkzMzQ5NzY0LCJqdGkiOiI3MjgxNGJiMy0wZDE5LTRjZjMtOTE0Mi1lOWUyMmVhN2M4ZGQiLCJzaWQiOiI0ZGZjODkxYi1hYWY3LTRhMzctOGExYy05ZWE4OTAzNjQwZjMifQ.x46c136kvK0fSnnSON_22FwpePVzOzEkIHZDxjlHzvo",
  "access_expires_at": "2026-10-30T08:57:44.776155058Z",
  "refresh_token": "5zbmmaMu1_DvJ3Ievprmi8N9WyzqGihz3lYqp41vGII",
  "refresh_expires_at": "2026-11-29T08:42:44.775680685Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:33.893012Z",
  "last_location_at": "2026-10-30T08:42:33.893012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/handover` → **200**

```json
{
  "command_id": "76af8385-7b35-46fb-b857-8e74ec421a7a",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:33.893012Z",
  "last_location_at": "2026-10-30T08:42:33.893012Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:45Z",
    "sequence": 1793349765463
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:45.479815Z",
  "last_location_at": "2026-10-30T08:42:45.479815Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665109856",
  "device_ref": "sandbox-28530"
}
```

```json
{
  "challenge_id": "61b4549e-dc96-4da9-9f1f-9c8f6c870375",
  "expires_at": "2026-10-30T08:47:45.704069639Z",
  "resend_available_at": "2026-10-30T08:42:46.704069639Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665109856` → **200**

```json
{
  "phone": "+380665109856",
  "audience": "CLIENT",
  "code": "375168",
  "sent_at": "2026-10-30T08:42:45.70612163Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61b4549e-dc96-4da9-9f1f-9c8f6c870375",
  "code": "375168",
  "device_ref": "sandbox-28530"
}
```

```json
{
  "session_id": "bcbf1931-d3f6-49d9-9bc1-a3b0f388ec49",
  "subject": {
    "type": "CLIENT",
    "id": "3950396a-30c4-4e04-93d1-6a4d8eb6818a"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzOTUwMzk2YS0zMGM0LTRlMDQtOTNkMS02YTRkOGViNjgxOGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjY1LCJpYXQiOjE3OTMzNDk3NjUsImp0aSI6ImJjOGI4YWI2LWRjNzUtNDRiZi04ZGYxLTNlZmFlZDIwZTg1OCIsInNpZCI6ImJjYmYxOTMxLWQzZjYtNDlkOS05YmMxLWEzYjBmMzg4ZWM0OSJ9.JH9bMUyKlbL7BMIn1fOCkz6vwOXTxfZ-ivx1_WExhAw",
  "access_expires_at": "2026-10-30T08:57:45.957665214Z",
  "refresh_token": "jFxPv3KQ65i1uWHy0s7tHmJAjzqCftJvO6VhENjeSsk",
  "refresh_expires_at": "2026-11-29T08:42:45.957205823Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "35a07234-7501-4bb6-aba5-dcf9c1a74f38",
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
  "id": "6715c07d-4e60-4196-997b-e7502e182f04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:46.197733Z",
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
  "command_id": "da180a5c-6bef-4814-8f69-cd57f1af77bb",
  "quote_id": "6715c07d-4e60-4196-997b-e7502e182f04",
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
  "id": "852025a4-9e1c-4586-a685-377db4102fe4",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "3950396a-30c4-4e04-93d1-6a4d8eb6818a",
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
  "created_at": "2026-10-30T08:42:46.446108Z",
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
    "id": "e9027356-d5d3-469e-9a8f-745b5c94a7f0",
    "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
    "expires_at": "2026-10-30T08:43:01.448867Z",
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

`POST /api/driver/v1/offers/e9027356-d5d3-469e-9a8f-745b5c94a7f0/accept` → **200**

```json
{
  "command_id": "19282eac-2335-433a-a414-107285ba599e"
}
```

```json
{
  "id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454",
  "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "825b86ac-00ae-4df4-bfc6-f19349f43b64",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "825b86ac-00ae-4df4-bfc6-f19349f43b64",
  "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
  "assignment_id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454",
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

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:47Z",
    "sequence": 1793349767384
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:47.401829Z",
  "last_location_at": "2026-10-30T08:42:47.401829Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/825b86ac-00ae-4df4-bfc6-f19349f43b64/arrive` → **200**

```json
{
  "command_id": "4e4ec61f-98d9-4e19-a62e-47af10798bac",
  "expected_version": 0
}
```

```json
{
  "id": "825b86ac-00ae-4df4-bfc6-f19349f43b64",
  "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
  "assignment_id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454",
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
  "arrived_at": "2026-10-30T08:42:47.643002Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/825b86ac-00ae-4df4-bfc6-f19349f43b64/start` → **200**

```json
{
  "command_id": "449083ad-2769-4fcd-960c-c3142c69df3f",
  "expected_version": 1
}
```

```json
{
  "id": "825b86ac-00ae-4df4-bfc6-f19349f43b64",
  "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
  "assignment_id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454",
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
  "arrived_at": "2026-10-30T08:42:47.643002Z",
  "started_at": "2026-10-30T08:42:47.895375Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:48Z",
    "sequence": 1793349768127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:48.144638Z",
  "last_location_at": "2026-10-30T08:42:48.144638Z",
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
  "device_ref": "sandbox-12663"
}
```

```json
{
  "challenge_id": "c8a1f52f-da62-4409-851e-577c0d49be67",
  "expires_at": "2026-10-30T08:47:48.375096072Z",
  "resend_available_at": "2026-10-30T08:42:49.375096072Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "842800",
  "sent_at": "2026-10-30T08:42:48.377213909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c8a1f52f-da62-4409-851e-577c0d49be67",
  "code": "842800",
  "device_ref": "sandbox-12663"
}
```

```json
{
  "session_id": "ba096256-582b-4594-acfb-79fffb193194",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY2OCwiaWF0IjoxNzkzMzQ5NzY4LCJqdGkiOiJkNTc3NDNhNy1hOTViLTRiNzItODM5Zi00Y2U4YWQyMDM1ZjkiLCJzaWQiOiJiYTA5NjI1Ni01ODJiLTQ1OTQtYWNmYi03OWZmZmIxOTMxOTQifQ.eyBci_SchtN09JzqphIoZQq-DOA2uGmU2XZf6SnNa70",
  "access_expires_at": "2026-10-30T08:57:48.679315472Z",
  "refresh_token": "CpxlKKdlft8OBpt2Ynkvsnb-Skwd_KmE0zdKLMgu7jQ",
  "refresh_expires_at": "2026-11-29T08:42:48.677992062Z",
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
  "command_id": "46cad6b3-dd82-4b80-98a7-b37d22dd607b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:49Z",
    "sequence": 1793349769130
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "82cca2ec-c831-457c-b40b-9c8d56eb4808",
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
  "last_heartbeat_at": "2026-10-30T08:42:49.147418Z",
  "last_location_at": "2026-10-30T08:42:49.147418Z",
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
  "session_id": "dafe2f2d-7126-4122-81ea-3f0abaac3d4e",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NjksImlhdCI6MTc5MzM0OTc2OSwianRpIjoiNmNmMDc0ZGItYjYwOS00YjE5LWJiNDYtNjY4ZTdkMTZmMWUxIiwic2lkIjoiZGFmZTJmMmQtNzEyNi00MTIyLTgxZWEtM2YwYWJhYWMzZDRlIn0.-uPjEX1QGhEmzmCRxeuE6At4VN5Hk-3iFxnjPnu_-gU",
  "access_expires_at": "2026-10-30T08:57:49.646660068Z",
  "refresh_token": "pn36VWYcXmv_suZLGYYiB4LsgmEJ7733GKkjXZGLejo",
  "refresh_expires_at": "2026-10-30T20:42:49.646167519Z",
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
  "session_id": "f1169f4e-1b8a-44b1-b1fb-08c3d7c0181e",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NzAsImlhdCI6MTc5MzM0OTc3MCwianRpIjoiMzM1Njg3ZmQtM2U1My00N2Q3LWJjMDctNDIzNDE4Yjg4N2NlIiwic2lkIjoiZjExNjlmNGUtMWI4YS00NGIxLWIxZmItMDhjM2Q3YzAxODFlIn0.jfAhyxSSlEB8C6dOqqnWZwh9nJz8wkrar159eGZQWUs",
  "access_expires_at": "2026-10-30T08:57:50.133355405Z",
  "refresh_token": "sYy_OS65JXW7CxKXzjL887TDbSCvla7ZopwdT__n9Us",
  "refresh_expires_at": "2026-10-30T20:42:50.132904056Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/852025a4-9e1c-4586-a685-377db4102fe4` → **200**

```json
{
  "id": "852025a4-9e1c-4586-a685-377db4102fe4",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "3950396a-30c4-4e04-93d1-6a4d8eb6818a",
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
    "id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454",
    "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "825b86ac-00ae-4df4-bfc6-f19349f43b64",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-30T08:42:46.446108Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/852025a4-9e1c-4586-a685-377db4102fe4/interrupt` → **200**

```json
{
  "command_id": "fe9d3936-63cb-465f-bfea-7b319d274e45",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "852025a4-9e1c-4586-a685-377db4102fe4",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "3950396a-30c4-4e04-93d1-6a4d8eb6818a",
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
      "id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454",
      "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "825b86ac-00ae-4df4-bfc6-f19349f43b64",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-30T08:42:46.446108Z",
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
    "id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "3950396a-30c4-4e04-93d1-6a4d8eb6818a",
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
    "id": "97f94e91-b5cc-43b5-87b4-6262415e2ace",
    "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
    "expires_at": "2026-10-30T08:43:05.642251Z",
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

`POST /api/driver/v1/offers/97f94e91-b5cc-43b5-87b4-6262415e2ace/accept` → **200**

```json
{
  "command_id": "0ca3d933-d64a-44dd-bd24-ff0856ca93e0"
}
```

```json
{
  "id": "445b1c23-c9f4-45c9-87ca-1c55b35a5252",
  "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c47d5daf-5d6b-4bb7-84a8-26dda655eab2",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c47d5daf-5d6b-4bb7-84a8-26dda655eab2",
  "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
  "assignment_id": "445b1c23-c9f4-45c9-87ca-1c55b35a5252",
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
  "session_id": "82cca2ec-c831-457c-b40b-9c8d56eb4808",
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
  "last_heartbeat_at": "2026-10-30T08:42:49.147418Z",
  "last_location_at": "2026-10-30T08:42:49.147418Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/82cca2ec-c831-457c-b40b-9c8d56eb4808/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:42:51Z",
    "sequence": 1793349771968
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "82cca2ec-c831-457c-b40b-9c8d56eb4808",
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
  "last_heartbeat_at": "2026-10-30T08:42:51.985081Z",
  "last_location_at": "2026-10-30T08:42:51.985081Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c47d5daf-5d6b-4bb7-84a8-26dda655eab2/arrive` → **200**

```json
{
  "command_id": "37a975bb-5e3b-4afd-807e-047b631af825",
  "expected_version": 0
}
```

```json
{
  "id": "c47d5daf-5d6b-4bb7-84a8-26dda655eab2",
  "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
  "assignment_id": "445b1c23-c9f4-45c9-87ca-1c55b35a5252",
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
  "arrived_at": "2026-10-30T08:42:52.222411Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c47d5daf-5d6b-4bb7-84a8-26dda655eab2/start` → **200**

```json
{
  "command_id": "b81094c7-f0b1-40b3-8bc9-e959efcab1f0",
  "expected_version": 1
}
```

```json
{
  "id": "c47d5daf-5d6b-4bb7-84a8-26dda655eab2",
  "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
  "assignment_id": "445b1c23-c9f4-45c9-87ca-1c55b35a5252",
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
  "arrived_at": "2026-10-30T08:42:52.222411Z",
  "started_at": "2026-10-30T08:42:52.458696Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c47d5daf-5d6b-4bb7-84a8-26dda655eab2/complete` → **200**

```json
{
  "command_id": "8631bd3a-2a79-4a0a-a090-1b799bdfef41",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:42:52Z"
}
```

```json
{
  "id": "c47d5daf-5d6b-4bb7-84a8-26dda655eab2",
  "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
  "assignment_id": "445b1c23-c9f4-45c9-87ca-1c55b35a5252",
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
  "arrived_at": "2026-10-30T08:42:52.222411Z",
  "started_at": "2026-10-30T08:42:52.458696Z",
  "completed_at": "2026-10-30T08:42:52.695932Z",
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
    "id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-30T08:42:50.634246Z",
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
    "id": "852025a4-9e1c-4586-a685-377db4102fe4",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-30T08:42:46.446108Z",
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

`GET /api/operator/v1/orders/852025a4-9e1c-4586-a685-377db4102fe4/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-30T08:42:46.446568Z",
      "actor": {
        "type": "CLIENT",
        "id": "3950396a-30c4-4e04-93d1-6a4d8eb6818a",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
        "quote_id": "6715c07d-4e60-4196-997b-e7502e182f04",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "3b88c1c3-2262-446a-ad69-dd90f30c95df"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-30T08:42:46.448227Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
        "attempt_id": "681a7226-bd27-4b8e-9a9c-59e047dce64c",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "3b88c1c3-2262-446a-ad69-dd90f30c95df"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-30T08:42:46.45038Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "e9027356-d5d3-469e-9a8f-745b5c94a7f0",
        "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "3b88c1c3-2262-446a-ad69-dd90f30c95df"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-30T08:42:46.931627Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "e9027356-d5d3-469e-9a8f-745b5c94a7f0",
        "order_id": "852025a4-9e1c-4586-a685-377db4102fe4",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "f5acef51-4fa1-4fe4-b06b-606bd4cc1454"
      },
      "correlation_id": "33a99b37-1965-40e1-af21-abb584c59fd9"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403/tip` → **200**

```json
{
  "order_id": "b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403",
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
  "available_until": "2026-10-31T08:42:52.695932Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403/tip` → **409**

```json
{
  "command_id": "e114ea47-2b38-4453-8af0-009751ab9c2b",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "51386438-de36-4560-91d0-b95a59238e0a"
}
```

Done: interrupted 852025a4-9e1c-4586-a685-377db4102fe4, follow-up b1b3fc0e-ed8b-48c3-a8de-20c04b5d0403.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "aef5f786-488a-466b-8a9a-f693a7bb0589",
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
  "last_heartbeat_at": "2026-10-30T08:42:48.144638Z",
  "last_location_at": "2026-10-30T08:42:48.144638Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/aef5f786-488a-466b-8a9a-f693a7bb0589/close` → **200**

```json
{
  "command_id": "b2ea7023-bba2-4c69-8c1e-6454714106d5",
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
  "session_id": "82cca2ec-c831-457c-b40b-9c8d56eb4808",
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
  "last_heartbeat_at": "2026-10-30T08:42:51.985081Z",
  "last_location_at": "2026-10-30T08:42:51.985081Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/82cca2ec-c831-457c-b40b-9c8d56eb4808/close` → **200**

```json
{
  "command_id": "ea39fe7f-1ce7-4ba6-b20e-10568cbf0270",
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
  "session_id": "0d91a999-66d3-416e-8fd8-dbf65348a3e4",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2NzgsImlhdCI6MTc5MzM0OTc3OCwianRpIjoiMzkzMGMzOTItY2IyNS00MTQ4LTg0YzQtZjFkZWMzOTlkNWY1Iiwic2lkIjoiMGQ5MWE5OTktNjZkMy00MTZlLThmZDgtZGJmNjUzNDhhM2U0In0.9AmwP0Tm_dLOa06h3JTAOKnwOKYJxT9XKc7rwi3os3Y",
  "access_expires_at": "2026-10-30T08:57:58.313583104Z",
  "refresh_token": "ipzH_hmZErKjoNnjCMLKK5V6UC6MQ1wGF3bxhjoJi8g",
  "refresh_expires_at": "2026-10-30T20:42:58.313048702Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "cd3c468f-ddd1-42e2-8dda-cbffcb884eaa",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:42:58Z"
}
```

```json
{
  "id": "41c408a3-7e7d-4978-a5ea-61dc45dbe145",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:42:58Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/41c408a3-7e7d-4978-a5ea-61dc45dbe145/publish` → **200**

```json
{
  "command_id": "d6367909-c1f1-42cd-a998-310de74ce5cd",
  "expected_version": 0
}
```

```json
{
  "id": "41c408a3-7e7d-4978-a5ea-61dc45dbe145",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:42:58.814397Z",
  "published_at": "2026-10-30T08:42:58.814397Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "41c408a3-7e7d-4978-a5ea-61dc45dbe145",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-30T08:42:58.814397Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637310351",
  "device_ref": "sandbox-23480"
}
```

```json
{
  "challenge_id": "9f664d51-572b-40a4-98a8-e61a02718226",
  "expires_at": "2026-10-30T08:47:59.265577031Z",
  "resend_available_at": "2026-10-30T08:43:00.265577031Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637310351` → **200**

```json
{
  "phone": "+380637310351",
  "audience": "CLIENT",
  "code": "258883",
  "sent_at": "2026-10-30T08:42:59.267675349Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f664d51-572b-40a4-98a8-e61a02718226",
  "code": "258883",
  "device_ref": "sandbox-23480"
}
```

```json
{
  "session_id": "f83a0033-1f46-4466-83eb-2e285e39aa70",
  "subject": {
    "type": "CLIENT",
    "id": "4c2c3138-f293-42d7-afb3-731a6631b6c4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YzJjMzEzOC1mMjkzLTQyZDctYWZiMy03MzFhNjYzMWI2YzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjc5LCJpYXQiOjE3OTMzNDk3NzksImp0aSI6ImFjYjk1ZGRhLTk3YjMtNGI4MC1hYzI3LTVhZjY4MzllOTA3ZiIsInNpZCI6ImY4M2EwMDMzLTFmNDYtNDQ2Ni04M2ViLTJlMjg1ZTM5YWE3MCJ9.Ck4EoQfEl6cAfKFf1gjku7r4boPNVPCMrbgmk8jSiMs",
  "access_expires_at": "2026-10-30T08:57:59.510606588Z",
  "refresh_token": "6vizW08PVDWOjh7MZn-v44v54ndfIk8n6j9PF7z4_SU",
  "refresh_expires_at": "2026-11-29T08:42:59.510075552Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "41c408a3-7e7d-4978-a5ea-61dc45dbe145",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-30T08:42:58.814397Z",
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
  "command_id": "b947685d-271e-47e8-81f3-7d1b89cacea3",
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
  "id": "945129ec-8753-4452-8949-5648eb425f45",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:47:59.964212Z",
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
  "command_id": "cadfa22f-bf97-4f81-b31e-5b18464a3ed8",
  "quote_id": "945129ec-8753-4452-8949-5648eb425f45",
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
  "correlation_id": "082b26a2-0ebc-4024-a63d-96c0896684dd"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f3700b16-bf12-4947-ad47-16a1074e5127",
  "version_id": "41c408a3-7e7d-4978-a5ea-61dc45dbe145",
  "language": "uk"
}
```

```json
{
  "version_id": "41c408a3-7e7d-4978-a5ea-61dc45dbe145",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-30T08:43:00.444381Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "95111a52-53d2-425f-a6a1-653a4b075c5d",
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
  "id": "1a53dc3d-a86f-4a85-9e45-e9f27a039385",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:00.674987Z",
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
  "command_id": "cc77d026-a328-4a40-915f-86f331317889",
  "quote_id": "1a53dc3d-a86f-4a85-9e45-e9f27a039385",
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
  "id": "e47197de-dc95-40d5-a79f-786d63dd939f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c2c3138-f293-42d7-afb3-731a6631b6c4",
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
  "created_at": "2026-10-30T08:43:00.9097Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/e47197de-dc95-40d5-a79f-786d63dd939f` → **200**

```json
{
  "id": "e47197de-dc95-40d5-a79f-786d63dd939f",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4c2c3138-f293-42d7-afb3-731a6631b6c4",
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
  "created_at": "2026-10-30T08:43:00.9097Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e47197de-dc95-40d5-a79f-786d63dd939f/cancel` → **200**

```json
{
  "command_id": "a6ba04fb-67a6-41d4-8910-96efa155f40d",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e47197de-dc95-40d5-a79f-786d63dd939f",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4c2c3138-f293-42d7-afb3-731a6631b6c4",
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
  "created_at": "2026-10-30T08:43:00.9097Z",
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

`POST /api/admin/v1/legal-documents/41c408a3-7e7d-4978-a5ea-61dc45dbe145` → **409**

```json
{
  "command_id": "87dff7ce-e063-4749-8e98-d2250eb36075",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-30T08:43:01Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/41c408a3-7e7d-4978-a5ea-61dc45dbe145",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a2a62c9c-9c23-4742-bd40-dd8e0198d647"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "58e3a344-7773-4998-8657-4fa84517f731",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:43:01Z"
}
```

```json
{
  "id": "d2e5f6f9-60fe-4087-9764-60ce62c81abf",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:43:01Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/d2e5f6f9-60fe-4087-9764-60ce62c81abf/publish` → **200**

```json
{
  "command_id": "c30eecf5-ba5d-4946-b356-30af8c9fa65f",
  "expected_version": 0
}
```

```json
{
  "id": "d2e5f6f9-60fe-4087-9764-60ce62c81abf",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-30T08:43:02.132183Z",
  "published_at": "2026-10-30T08:43:02.132183Z",
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
  "device_ref": "sandbox-8634"
}
```

```json
{
  "challenge_id": "5a4f5200-38ac-4056-9b42-7ff35bfa65e1",
  "expires_at": "2026-10-30T08:48:02.366618425Z",
  "resend_available_at": "2026-10-30T08:43:03.366618425Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "555432",
  "sent_at": "2026-10-30T08:43:02.36891128Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a4f5200-38ac-4056-9b42-7ff35bfa65e1",
  "code": "555432",
  "device_ref": "sandbox-8634"
}
```

```json
{
  "session_id": "e1cb6746-3e54-4abb-9dd4-34f9333473a8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY4MiwiaWF0IjoxNzkzMzQ5NzgyLCJqdGkiOiJmZDRhYTIyNi1lNDYyLTRjNTYtYjk4NS0yNjNhYjM1ZDc2OTUiLCJzaWQiOiJlMWNiNjc0Ni0zZTU0LTRhYmItOWRkNC0zNGY5MzMzNDczYTgifQ.XUL6SHwa2x9ASZQDBrcFt3MxI7vr_GI2TkWuXIaXxWo",
  "access_expires_at": "2026-10-30T08:58:02.619900408Z",
  "refresh_token": "6OgnLpvA_EXQaEVRc5b7Z77PvjnPHLRI3HTWxTA0C9g",
  "refresh_expires_at": "2026-11-29T08:43:02.61946921Z",
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
  "command_id": "f4b1c3cd-49ed-4501-b65f-ca36b94bc042",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:03Z",
    "sequence": 1793349783585
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "50d373d5-64b2-4fb2-8f2c-185ebd9cac11",
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
  "last_heartbeat_at": "2026-10-30T08:43:03.074681Z",
  "last_location_at": "2026-10-30T08:43:03.074681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677710492",
  "device_ref": "sandbox-10970"
}
```

```json
{
  "challenge_id": "31c1e270-f5b1-4a82-a795-81f56fcbbbe7",
  "expires_at": "2026-10-30T08:48:03.302603997Z",
  "resend_available_at": "2026-10-30T08:43:04.302603997Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677710492` → **200**

```json
{
  "phone": "+380677710492",
  "audience": "CLIENT",
  "code": "671794",
  "sent_at": "2026-10-30T08:43:03.305513048Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31c1e270-f5b1-4a82-a795-81f56fcbbbe7",
  "code": "671794",
  "device_ref": "sandbox-10970"
}
```

```json
{
  "session_id": "c9776cd3-55e6-41b5-9995-7be22b692998",
  "subject": {
    "type": "CLIENT",
    "id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYWJkMDVkOC03NDc2LTQ1ZDYtYTRiOC00YzVhZjM5ZjQwNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNjgzLCJpYXQiOjE3OTMzNDk3ODMsImp0aSI6ImEyN2M3YmY1LTRhMzItNGZhYy04Njc3LTU5Mjc3OWEzY2NlOCIsInNpZCI6ImM5Nzc2Y2QzLTU1ZTYtNDFiNS05OTk1LTdiZTIyYjY5Mjk5OCJ9.KGBzeP5Cx0L7Net_DgzoTy5uD6cKUzsZ6oizqVxcfk8",
  "access_expires_at": "2026-10-30T08:58:03.563352987Z",
  "refresh_token": "kexNk5PDamC7CBAxFsnp15AuPCBFBprrN1vYckOmj-Q",
  "refresh_expires_at": "2026-11-29T08:43:03.562877312Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "cab249e1-aa6e-46c1-b54b-c6b07a685d9a",
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
  "id": "ada897ff-2dc5-4254-b176-eb57374856fc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:03.797492Z",
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
  "command_id": "51677472-affe-4a95-877f-d19b46247878",
  "quote_id": "ada897ff-2dc5-4254-b176-eb57374856fc",
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
    "phone": "+380678859918"
  }
}
```

```json
{
  "id": "f44f36e5-0194-4e61-920a-167207b7b206",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:04.044404Z",
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
    "id": "30d374a8-8c1d-4229-a743-2248f804c86f",
    "order_id": "f44f36e5-0194-4e61-920a-167207b7b206",
    "expires_at": "2026-10-30T08:43:19.047038Z",
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

`POST /api/driver/v1/offers/30d374a8-8c1d-4229-a743-2248f804c86f/accept` → **200**

```json
{
  "command_id": "686cccc1-06dd-48d6-aeba-a362940f0fc3"
}
```

```json
{
  "id": "828dfb9c-5c7b-46fd-9bb8-c3c79c5a7472",
  "order_id": "f44f36e5-0194-4e61-920a-167207b7b206",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3aaadc89-224a-4045-a8a4-2fd00cdacad4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3aaadc89-224a-4045-a8a4-2fd00cdacad4",
  "order_id": "f44f36e5-0194-4e61-920a-167207b7b206",
  "assignment_id": "828dfb9c-5c7b-46fd-9bb8-c3c79c5a7472",
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
    "phone": "+380678859918"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6a3360f1-dbbc-4c4f-a9f5-fadf864e343d",
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
  "id": "47472a2a-af8b-4ebe-bb72-b2c0c9ba8363",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:04.996225Z",
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
  "command_id": "2774721a-9300-48a2-91d8-59f3c81a09b3",
  "quote_id": "47472a2a-af8b-4ebe-bb72-b2c0c9ba8363",
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
  "id": "357311ac-79b2-4a7c-ae60-88a75510aa5e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:05.239108Z",
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
  "command_id": "0c5d3e24-8272-4396-ba76-181ee3d593c2",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-30T11:43:05Z"
}
```

```json
{
  "id": "6703b330-6721-433a-9d15-fbb86a84108b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:05.498920Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:43:05Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "b1660ed4-5c5d-4885-b8a7-6434e4c9f707",
  "quote_id": "6703b330-6721-433a-9d15-fbb86a84108b",
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
  "pickup_at": "2026-10-30T11:43:05Z"
}
```

```json
{
  "id": "dfc3e12d-cc02-422e-99b6-a6f9f5c138d7",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:43:05.737836Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:43:05Z",
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
  "command_id": "58539855-984e-4b26-8683-a5581cd6d688",
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
  "id": "80de4210-4f78-4d5f-91f0-e943358e02fb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:05.997328Z",
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
  "command_id": "d1c9f0cf-5cdd-47bd-b7dc-e9eb2045a19d",
  "quote_id": "80de4210-4f78-4d5f-91f0-e943358e02fb",
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
  "correlation_id": "01018e37-b64b-4e0a-9185-d6c8b57edb38"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "dfc3e12d-cc02-422e-99b6-a6f9f5c138d7",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-30T08:43:05.737836Z",
      "cancellation": null,
      "pickup_at": "2026-10-30T11:43:05Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "357311ac-79b2-4a7c-ae60-88a75510aa5e",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-30T08:43:05.239108Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f44f36e5-0194-4e61-920a-167207b7b206",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "357311ac-79b2-4a7c-ae60-88a75510aa5e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:05.239108Z",
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

`GET /api/rider/v1/orders/f44f36e5-0194-4e61-920a-167207b7b206` → **200**

```json
{
  "id": "f44f36e5-0194-4e61-920a-167207b7b206",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "828dfb9c-5c7b-46fd-9bb8-c3c79c5a7472",
    "order_id": "f44f36e5-0194-4e61-920a-167207b7b206",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3aaadc89-224a-4045-a8a4-2fd00cdacad4",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-30T08:43:04.044404Z",
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
    "location_at": "2026-10-30T08:43:03.074681Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/f44f36e5-0194-4e61-920a-167207b7b206/cancel` → **200**

```json
{
  "command_id": "81c60cf9-10ec-487f-9e25-aee5b70c2a99",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f44f36e5-0194-4e61-920a-167207b7b206",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "828dfb9c-5c7b-46fd-9bb8-c3c79c5a7472",
    "order_id": "f44f36e5-0194-4e61-920a-167207b7b206",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3aaadc89-224a-4045-a8a4-2fd00cdacad4",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-30T08:43:04.044404Z",
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

`GET /api/rider/v1/orders/357311ac-79b2-4a7c-ae60-88a75510aa5e` → **200**

```json
{
  "id": "357311ac-79b2-4a7c-ae60-88a75510aa5e",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:05.239108Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/357311ac-79b2-4a7c-ae60-88a75510aa5e/cancel` → **200**

```json
{
  "command_id": "be4ecbcb-8120-4716-8054-7767682985ec",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "357311ac-79b2-4a7c-ae60-88a75510aa5e",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:43:05.239108Z",
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

`GET /api/rider/v1/orders/dfc3e12d-cc02-422e-99b6-a6f9f5c138d7` → **200**

```json
{
  "id": "dfc3e12d-cc02-422e-99b6-a6f9f5c138d7",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:43:05.737836Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:43:05Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/dfc3e12d-cc02-422e-99b6-a6f9f5c138d7/cancel` → **200**

```json
{
  "command_id": "67c96699-4806-412e-960e-8f7ac605e7d7",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "dfc3e12d-cc02-422e-99b6-a6f9f5c138d7",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "fabd05d8-7476-45d6-a4b8-4c5af39f4070",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-30T08:43:05.737836Z",
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
  "pickup_at": "2026-10-30T11:43:05Z",
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
  "session_id": "50d373d5-64b2-4fb2-8f2c-185ebd9cac11",
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
  "last_heartbeat_at": "2026-10-30T08:43:03.074681Z",
  "last_location_at": "2026-10-30T08:43:03.074681Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/50d373d5-64b2-4fb2-8f2c-185ebd9cac11/close` → **200**

```json
{
  "command_id": "3dd63064-be74-4793-8867-3df21e401c56",
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

Done: orders f44f36e5-0194-4e61-920a-167207b7b206, 357311ac-79b2-4a7c-ae60-88a75510aa5e, dfc3e12d-cc02-422e-99b6-a6f9f5c138d7.

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
  "session_id": "95bd3f82-c874-4a56-995b-f358b17186c0",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2ODksImlhdCI6MTc5MzM0OTc4OSwianRpIjoiY2Y1MmFhZGItZDhiOS00OTVkLWI0MDEtOWU3MTg2ZDgxY2ZiIiwic2lkIjoiOTViZDNmODItYzg3NC00YTU2LTk5NWItZjM1OGIxNzE4NmMwIn0.n19GzTOBGBV3O8BXST_oMgx_zrkWr2bqt2IGS6Ff9bU",
  "access_expires_at": "2026-10-30T08:58:09.178461878Z",
  "refresh_token": "NxfLM_uzvAZN6qyfTDUAHy0nYYu5OVACoh7DXU0YsPw",
  "refresh_expires_at": "2026-10-30T20:43:09.17772756Z",
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
  "session_id": "eb857f4d-3541-46a2-a6f5-9e828e698cba",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA2ODksImlhdCI6MTc5MzM0OTc4OSwianRpIjoiY2ViZDlmOTctYWQzMC00OTc3LWIwODctNzJhMWJiNmNiMDU5Iiwic2lkIjoiZWI4NTdmNGQtMzU0MS00NmEyLWE2ZjUtOWU4MjhlNjk4Y2JhIn0.kWnGMixK7Md0W9E3LoCcrLsHkCAFfkoDvQ2LvQd-S0U",
  "access_expires_at": "2026-10-30T08:58:09.654392297Z",
  "refresh_token": "QUcuRtZ2sjxS4l21EZ4pUdKfvC4FtFiLd1LKV96kY4g",
  "refresh_expires_at": "2026-10-30T20:43:09.653639672Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-11831"
}
```

```json
{
  "challenge_id": "9969ec25-d844-4bd7-933e-8741fabb5fc0",
  "expires_at": "2026-10-30T08:48:09.976977453Z",
  "resend_available_at": "2026-10-30T08:43:10.976977453Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "071529",
  "sent_at": "2026-10-30T08:43:09.979668661Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9969ec25-d844-4bd7-933e-8741fabb5fc0",
  "code": "071529",
  "device_ref": "sandbox-11831"
}
```

```json
{
  "session_id": "6466aa4e-9b21-4776-a452-f0269640b938",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDY5MCwiaWF0IjoxNzkzMzQ5NzkwLCJqdGkiOiI1OWJhNmJmMi05YTY5LTRmODYtYWE4ZS00MjVlOWUzYTEyMzYiLCJzaWQiOiI2NDY2YWE0ZS05YjIxLTQ3NzYtYTQ1Mi1mMDI2OTY0MGI5MzgifQ.wHH65rmElmyxZZHkDrD9py5faTN8NcNzbnF_CA1daS8",
  "access_expires_at": "2026-10-30T08:58:10.225943122Z",
  "refresh_token": "gE0Aba4C8hx_WXRZ3fE5MFvOirbG8Yy9jXsXXNY9xCQ",
  "refresh_expires_at": "2026-11-29T08:43:10.225412456Z",
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
  "command_id": "adf84d2f-ad01-49b3-95a9-65f3dbc4da3e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:10Z",
    "sequence": 1793349790679
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6937d88e-8db3-4d3f-93c3-ca37f6dd6f5f",
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
  "last_heartbeat_at": "2026-10-30T08:43:10.697358Z",
  "last_location_at": "2026-10-30T08:43:10.697358Z",
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
  "command_id": "6d297b2b-2e96-4094-ab8c-231bced1a0c9",
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
  "effective_at": "2026-10-30T08:43:11.276978Z",
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-30T08:40:43.596254Z",
  "last_entries": [
    {
      "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:40:43.596254Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4d5caf8b-00f0-49ef-b035-7e5f6daff395",
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
  "id": "2b79ddae-b2c6-44de-bea1-b335b03d966b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:11.755304Z",
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
  "command_id": "838843d3-e6d0-4861-9698-0d6062f718e0",
  "quote_id": "2b79ddae-b2c6-44de-bea1-b335b03d966b",
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
    "phone": "+380671113266"
  }
}
```

```json
{
  "id": "feba410c-d479-44a9-9a23-f112d72487a2",
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
  "created_at": "2026-10-30T08:43:11.991672Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671113266"
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
    "id": "f894d735-d715-4802-b599-6f59227f7a3e",
    "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
    "expires_at": "2026-10-30T08:43:26.995412Z",
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

`POST /api/driver/v1/offers/f894d735-d715-4802-b599-6f59227f7a3e/accept` → **200**

```json
{
  "command_id": "04422111-f30f-4700-b8c6-c9cae507d158"
}
```

```json
{
  "id": "53b31711-91c3-49f2-a927-533c7d258f3c",
  "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "1b7d43d3-756d-4076-b5a9-b2bdadf93cbb",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "1b7d43d3-756d-4076-b5a9-b2bdadf93cbb",
  "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
  "assignment_id": "53b31711-91c3-49f2-a927-533c7d258f3c",
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
    "phone": "+380671113266"
  }
}
```

`POST /api/driver/v1/work-sessions/6937d88e-8db3-4d3f-93c3-ca37f6dd6f5f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:12Z",
    "sequence": 1793349792921
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6937d88e-8db3-4d3f-93c3-ca37f6dd6f5f",
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
  "last_heartbeat_at": "2026-10-30T08:43:12.938867Z",
  "last_location_at": "2026-10-30T08:43:12.938867Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/1b7d43d3-756d-4076-b5a9-b2bdadf93cbb/arrive` → **200**

```json
{
  "command_id": "7833d2c9-a6c3-4e42-8261-7e043dc0e990",
  "expected_version": 0
}
```

```json
{
  "id": "1b7d43d3-756d-4076-b5a9-b2bdadf93cbb",
  "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
  "assignment_id": "53b31711-91c3-49f2-a927-533c7d258f3c",
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
  "arrived_at": "2026-10-30T08:43:13.178192Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113266"
  }
}
```

`POST /api/driver/v1/trips/1b7d43d3-756d-4076-b5a9-b2bdadf93cbb/start` → **200**

```json
{
  "command_id": "fa979285-679c-4e59-89a0-b142acd2badb",
  "expected_version": 1
}
```

```json
{
  "id": "1b7d43d3-756d-4076-b5a9-b2bdadf93cbb",
  "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
  "assignment_id": "53b31711-91c3-49f2-a927-533c7d258f3c",
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
  "arrived_at": "2026-10-30T08:43:13.178192Z",
  "started_at": "2026-10-30T08:43:13.420187Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671113266"
  }
}
```

`POST /api/driver/v1/trips/1b7d43d3-756d-4076-b5a9-b2bdadf93cbb/complete` → **200**

```json
{
  "command_id": "b03946f9-8abe-4bfd-8834-6eccf6703af2",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:43:13Z",
  "cash_received": true
}
```

```json
{
  "id": "1b7d43d3-756d-4076-b5a9-b2bdadf93cbb",
  "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
  "assignment_id": "53b31711-91c3-49f2-a927-533c7d258f3c",
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
  "arrived_at": "2026-10-30T08:43:13.178192Z",
  "started_at": "2026-10-30T08:43:13.420187Z",
  "completed_at": "2026-10-30T08:43:13.67199Z",
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
  "command_id": "fba82b2c-fb11-41fc-86a6-166389e0b6f2",
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
  "id": "78af09a1-7672-43e9-b43a-c7bd379935f1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:13.926205Z",
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
  "command_id": "4f048ca9-9415-4626-ae79-c8e4bf435595",
  "quote_id": "78af09a1-7672-43e9-b43a-c7bd379935f1",
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
    "phone": "+3806711112545"
  }
}
```

```json
{
  "id": "a8db00a5-e072-4d00-a47b-061d090fabc4",
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
  "created_at": "2026-10-30T08:43:14.180249Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112545"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/a8db00a5-e072-4d00-a47b-061d090fabc4` → **200**

```json
{
  "id": "a8db00a5-e072-4d00-a47b-061d090fabc4",
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
  "created_at": "2026-10-30T08:43:14.180249Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112545"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a8db00a5-e072-4d00-a47b-061d090fabc4/cancel` → **200**

```json
{
  "command_id": "7f44f6e7-bd4b-4416-91ac-6e1fc94986c3",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "a8db00a5-e072-4d00-a47b-061d090fabc4",
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
  "created_at": "2026-10-30T08:43:14.180249Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711112545"
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
  "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-30T08:40:43.596254Z",
  "last_entries": [
    {
      "order_id": "a8db00a5-e072-4d00-a47b-061d090fabc4",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-30T08:43:14.696364Z"
    },
    {
      "order_id": "feba410c-d479-44a9-9a23-f112d72487a2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-30T08:43:13.676472Z"
    },
    {
      "order_id": "64b7d359-a47e-4634-84e2-b7a1e77e11b9",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-30T08:40:43.596254Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "6937d88e-8db3-4d3f-93c3-ca37f6dd6f5f",
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
  "last_heartbeat_at": "2026-10-30T08:43:12.938867Z",
  "last_location_at": "2026-10-30T08:43:12.938867Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6937d88e-8db3-4d3f-93c3-ca37f6dd6f5f/close` → **200**

```json
{
  "command_id": "7f5037e9-406a-4d13-8968-5f556ab99e26",
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

Done: operator bonus for fulfilled feba410c-d479-44a9-9a23-f112d72487a2 and operator-fault cancellation a8db00a5-e072-4d00-a47b-061d090fabc4.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674585580",
  "device_ref": "sandbox-825"
}
```

```json
{
  "challenge_id": "9268082e-1c19-48d0-b532-d9fece2d051b",
  "expires_at": "2026-10-30T08:48:18.876275918Z",
  "resend_available_at": "2026-10-30T08:43:19.876275918Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674585580` → **200**

```json
{
  "phone": "+380674585580",
  "audience": "CLIENT",
  "code": "369438",
  "sent_at": "2026-10-30T08:43:18.879051991Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678614309",
  "device_ref": "sandbox-30783",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "1ca71cd0-08f8-43c9-b704-691609597c2d",
  "expires_at": "2026-10-30T08:48:20.333433134Z",
  "resend_available_at": "2026-10-30T08:43:21.333433134Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678614309` → **200**

```json
{
  "phone": "+380678614309",
  "audience": "CLIENT",
  "code": "821593",
  "sent_at": "2026-10-30T08:43:20.335234032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678614309",
  "device_ref": "sandbox-4812",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e34fd7f9-2464-42b1-a1e4-f3e58f2f24e7",
  "expires_at": "2026-10-30T08:48:21.786193829Z",
  "resend_available_at": "2026-10-30T08:43:22.786193829Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678614309` → **200**

```json
{
  "phone": "+380678614309",
  "audience": "CLIENT",
  "code": "494581",
  "sent_at": "2026-10-30T08:43:21.788637219Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674870000",
  "device_ref": "sandbox-1044"
}
```

```json
{
  "challenge_id": "68d580a7-99a4-46ca-a16c-7d7a859b4e06",
  "expires_at": "2026-10-30T08:48:23.245803148Z",
  "resend_available_at": "2026-10-30T08:43:24.245803148Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674870000",
  "device_ref": "sandbox-10496"
}
```

```json
{
  "challenge_id": "f1528582-4d6f-4b03-8b19-49f710763802",
  "expires_at": "2026-10-30T08:48:24.688753287Z",
  "resend_available_at": "2026-10-30T08:43:25.688753287Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674870000` → **200**

```json
{
  "phone": "+380674870000",
  "audience": "CLIENT",
  "code": "475281",
  "sent_at": "2026-10-30T08:43:24.691095747Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674870000",
  "device_ref": "sandbox-30061",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "245a244a-a02e-4c02-8e92-cd09dadf8121",
  "expires_at": "2026-10-30T08:48:26.150796883Z",
  "resend_available_at": "2026-10-30T08:43:27.150796883Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380674870000` → **200**

```json
{
  "phone": "+380674870000",
  "audience": "CLIENT",
  "code": "991933",
  "sent_at": "2026-10-30T08:43:26.152784969Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380674870000",
  "device_ref": "sandbox-8570",
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
  "correlation_id": "4dfc81d2-a421-491c-8f66-6c7a052e0f64",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000001560"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "26dcc28f-fd39-42a7-b395-da1f531a1005"
}
```

`GET /sandbox/v1/otp?phone=%2B442000001560` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120006508"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "e5cb96c2-b505-49d0-bb9e-06f64aafd7f5"
}
```

`GET /sandbox/v1/otp?phone=%2B37120006508` → **404**

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
  "session_id": "d3c70b72-0da7-4f49-b017-31a6f16bc9f5",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MDgsImlhdCI6MTc5MzM0OTgwOCwianRpIjoiMTRkOTRjNTMtZjBlNy00NTQ2LWEyOWUtMjU1OGEzMWJkYjI1Iiwic2lkIjoiZDNjNzBiNzItMGRhNy00ZjQ5LWIwMTctMzFhNmYxNmJjOWY1In0.89gblSgNG82u9yRYzFrQV78bC3mkUA0LogErPtcxdkw",
  "access_expires_at": "2026-10-30T08:58:28.605745592Z",
  "refresh_token": "0DgVBCaYOBtWvMDiRaiglNev6zzZHZWWDSEBpBppyKw",
  "refresh_expires_at": "2026-10-30T20:43:28.605248686Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380674870000` → **200**

```json
{
  "deliveries": [
    {
      "id": "8975008d-ec50-47e8-b468-415109901ccf",
      "challenge_id": "245a244a-a02e-4c02-8e92-cd09dadf8121",
      "phone": "+380674870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-53a26a6c-9913-4307-9d45-ba6fdab94d26",
      "error": null,
      "attempted_at": "2026-10-30T08:43:26.153047Z"
    },
    {
      "id": "a075215f-167f-4389-9fd0-c869399f5643",
      "challenge_id": "f1528582-4d6f-4b03-8b19-49f710763802",
      "phone": "+380674870000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-3a45d568-8296-4f28-9846-88c7069f9957",
      "error": null,
      "attempted_at": "2026-10-30T08:43:24.691534Z"
    },
    {
      "id": "85e62939-ab18-41d3-b0c0-bc517ff60958",
      "challenge_id": "68d580a7-99a4-46ca-a16c-7d7a859b4e06",
      "phone": "+380674870000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-30T08:43:23.248104Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380674870000` → **200**

```json
{
  "phone": "+380674870000",
  "audience": "CLIENT",
  "code": "991933",
  "sent_at": "2026-10-30T08:43:26.152784969Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678614309` → **200**

```json
{
  "deliveries": [
    {
      "id": "5feae3a7-7697-47e8-8e0a-71054483f93f",
      "challenge_id": "e34fd7f9-2464-42b1-a1e4-f3e58f2f24e7",
      "phone": "+380678614309",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-e072a597-1310-4b58-ac6e-8cb57f3688a3",
      "error": null,
      "attempted_at": "2026-10-30T08:43:21.788883Z"
    },
    {
      "id": "a5f41d0b-9010-492e-b879-6d8ffa417a6d",
      "challenge_id": "1ca71cd0-08f8-43c9-b704-691609597c2d",
      "phone": "+380678614309",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c1ba5254-6b87-4016-9b65-42453664a642",
      "error": null,
      "attempted_at": "2026-10-30T08:43:20.335633Z"
    }
  ]
}
```

Done: SMS to +380674585580; SMS then a call to +380678614309; a failed SMS, two calls and a refused third to +380674870000; +44 and +371 refused.

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
  "session_id": "456bfb8f-dd2b-4ecf-a251-cdda11d739e2",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MDksImlhdCI6MTc5MzM0OTgwOSwianRpIjoiMTA4ZGQwYTItOGM1Ni00M2UwLTkwODUtM2IxNzhjYjJmZDU5Iiwic2lkIjoiNDU2YmZiOGYtZGQyYi00ZWNmLWEyNTEtY2RkYTExZDczOWUyIn0.wigpwd7AAmo6phMbQVhm60-i-3UU01GeWww0KP2QSUg",
  "access_expires_at": "2026-10-30T08:58:29.63666163Z",
  "refresh_token": "1wm5b__xUz04XHmlkZnPtaCrv3YHl44FlKUw4hVlajc",
  "refresh_expires_at": "2026-10-30T20:43:29.635909896Z",
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
  "session_id": "6f6cf861-4d45-44a7-b527-2dff91a5b240",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MTAsImlhdCI6MTc5MzM0OTgxMCwianRpIjoiOTk3NjNjMjAtNjQzOC00MDFjLTg2YzUtY2QyYWMyZWQxNTA5Iiwic2lkIjoiNmY2Y2Y4NjEtNGQ0NS00NGE3LWI1MjctMmRmZjkxYTViMjQwIn0.ZZgykv5XS3cJG2F8MgwOS8-h62Fc8UyStpgyPMFoZQY",
  "access_expires_at": "2026-10-30T08:58:30.122249538Z",
  "refresh_token": "hv_LOWr2ifVO84h-lUIWk-J6bjn7UQ1PRxvJdVUEeHI",
  "refresh_expires_at": "2026-10-30T20:43:30.12168405Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
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
    "retention.manage",
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

`POST /api/admin/v1/staff-extensions/b78cf0d5-92cd-4b89-a0b7-a0ac854588fc` → **200**

```json
{
  "command_id": "900f27d3-1da7-4b44-a0d1-fd91ce115e5f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "98c99581-4e70-4a98-ad1e-4f7df597124e",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:43:31.171487Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-30T08:43:31.171487Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "32c3b2eb-47a0-47aa-a455-a5d18f25d640",
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
  "id": "a2751f0d-578e-48fc-9ffd-348b8176bfc7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:31.624938Z",
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
  "command_id": "9765d9db-8e6e-4db7-8e9f-724345ae25c4",
  "quote_id": "a2751f0d-578e-48fc-9ffd-348b8176bfc7",
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
    "phone": "+380673792692"
  }
}
```

```json
{
  "id": "292fd2e5-8772-40dc-ac12-a6782b45ffe7",
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
  "created_at": "2026-10-30T08:43:31.879482Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673792692"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/292fd2e5-8772-40dc-ac12-a6782b45ffe7/calls` → **201**

```json
{
  "command_id": "22cd4fdc-7d27-4cd2-b020-efdb533264fe",
  "to": "CALLER"
}
```

```json
{
  "id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "order_ids": [
    "292fd2e5-8772-40dc-ac12-a6782b45ffe7"
  ],
  "started_at": "2026-10-30T08:43:32.152218Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/292fd2e5-8772-40dc-ac12-a6782b45ffe7/calls` → **201**

```json
{
  "command_id": "22cd4fdc-7d27-4cd2-b020-efdb533264fe",
  "to": "CALLER"
}
```

```json
{
  "id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "order_ids": [
    "292fd2e5-8772-40dc-ac12-a6782b45ffe7"
  ],
  "started_at": "2026-10-30T08:43:32.152218Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673792692",
    "at": "2026-10-30T08:43:32.193395529Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.2044",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "ca88b716-ba7b-4bfa-b03d-dc5992105436"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=292fd2e5-8772-40dc-ac12-a6782b45ffe7` → **200**

```json
{
  "calls": [
    {
      "id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [
        "292fd2e5-8772-40dc-ac12-a6782b45ffe7"
      ],
      "started_at": "2026-10-30T08:43:32.152218Z",
      "answered_at": "2026-10-30T08:43:32.740258Z",
      "ended_at": "2026-10-30T08:43:32.760799Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=292fd2e5-8772-40dc-ac12-a6782b45ffe7` → **200**

```json
{
  "calls": [
    {
      "id": "ca88b716-ba7b-4bfa-b03d-dc5992105436",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "order_ids": [
        "292fd2e5-8772-40dc-ac12-a6782b45ffe7"
      ],
      "started_at": "2026-10-30T08:43:32.152218Z",
      "answered_at": "2026-10-30T08:43:32.740258Z",
      "ended_at": "2026-10-30T08:43:32.760799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-30T08:43:33.384306Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/292fd2e5-8772-40dc-ac12-a6782b45ffe7` → **200**

```json
{
  "id": "292fd2e5-8772-40dc-ac12-a6782b45ffe7",
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
  "created_at": "2026-10-30T08:43:31.879482Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673792692"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/292fd2e5-8772-40dc-ac12-a6782b45ffe7/cancel` → **200**

```json
{
  "command_id": "fd475984-2731-4df8-a11d-73037e584b77",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "292fd2e5-8772-40dc-ac12-a6782b45ffe7",
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
  "created_at": "2026-10-30T08:43:31.879482Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673792692"
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
  "command_id": "5eaf640c-6f6f-4883-8627-3b0509810022",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-30T08:43:35.878804Z",
  "extension": "101"
}
```

Done: outgoing call ca88b716-ba7b-4bfa-b03d-dc5992105436 from order 292fd2e5-8772-40dc-ac12-a6782b45ffe7, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637560660",
  "device_ref": "sandbox-26633"
}
```

```json
{
  "challenge_id": "817bb5ce-cb47-47f9-b4d7-8c46af585a23",
  "expires_at": "2026-10-30T08:48:36.114798182Z",
  "resend_available_at": "2026-10-30T08:43:37.114798182Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637560660` → **200**

```json
{
  "phone": "+380637560660",
  "audience": "CLIENT",
  "code": "127830",
  "sent_at": "2026-10-30T08:43:36.117521346Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "817bb5ce-cb47-47f9-b4d7-8c46af585a23",
  "code": "127830",
  "device_ref": "sandbox-26633"
}
```

```json
{
  "session_id": "ef335516-0309-45e4-b4f8-be0da7026c48",
  "subject": {
    "type": "CLIENT",
    "id": "0513b292-5796-453f-a3d4-63cffe92d47d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTEzYjI5Mi01Nzk2LTQ1M2YtYTNkNC02M2NmZmU5MmQ0N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzE2LCJpYXQiOjE3OTMzNDk4MTYsImp0aSI6IjdjZDFjZGRhLWUwYzgtNDVhYy04Y2VmLWYzOGY1ZjUyY2ZiOSIsInNpZCI6ImVmMzM1NTE2LTAzMDktNDVlNC1iNGY4LWJlMGRhNzAyNmM0OCJ9.8SJDSJWNpTR1H4iK9m-H8xjfj7t6YIdX0q4fS8ztSSc",
  "access_expires_at": "2026-10-30T08:58:36.365434307Z",
  "refresh_token": "9CmICpfVTfITVVOb-b4BVJk2o_Xn3sW8Q0f7r5Mp7rY",
  "refresh_expires_at": "2026-11-29T08:43:36.364971952Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0513b292-5796-453f-a3d4-63cffe92d47d",
  "session_id": "ef335516-0309-45e4-b4f8-be0da7026c48",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637560660",
  "device_ref": "sandbox-13592"
}
```

```json
{
  "challenge_id": "59e15737-3377-4664-9386-b7726f968c79",
  "expires_at": "2026-10-30T08:48:38.82098376Z",
  "resend_available_at": "2026-10-30T08:43:39.82098376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637560660` → **200**

```json
{
  "phone": "+380637560660",
  "audience": "CLIENT",
  "code": "842659",
  "sent_at": "2026-10-30T08:43:38.82373795Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "59e15737-3377-4664-9386-b7726f968c79",
  "code": "842659",
  "device_ref": "sandbox-13592"
}
```

```json
{
  "session_id": "6819241d-f374-4fc1-9091-5de4b6d47e2e",
  "subject": {
    "type": "CLIENT",
    "id": "0513b292-5796-453f-a3d4-63cffe92d47d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTEzYjI5Mi01Nzk2LTQ1M2YtYTNkNC02M2NmZmU5MmQ0N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzE5LCJpYXQiOjE3OTMzNDk4MTksImp0aSI6IjZmOWE3ZDE4LTVkZDMtNDczYy1iNTRlLTI3NTVmNGVmNmY1MCIsInNpZCI6IjY4MTkyNDFkLWYzNzQtNGZjMS05MDkxLTVkZTRiNmQ0N2UyZSJ9.-syiHQtRtAnHFvwXZuA80QV3TwosMqpc96NKxFe-SBc",
  "access_expires_at": "2026-10-30T08:58:39.075010448Z",
  "refresh_token": "Y2PxgFkl1IRYNufWutn0B3B3YgnzVuMK2eC1xl7ogdA",
  "refresh_expires_at": "2026-11-29T08:43:39.074510377Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "e14f5fde-ac74-4c5d-bcd9-543ff6b256ea",
  "expires_at": "2026-10-30T08:48:41.307261977Z",
  "resend_available_at": "2026-10-30T08:43:42.307261977Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637560660` → **200**

```json
{
  "phone": "+380637560660",
  "audience": "CLIENT",
  "code": "846429",
  "sent_at": "2026-10-30T08:43:41.308988755Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380638035041"
}
```

```json
{
  "challenge_id": "79f3841f-e6fb-48cf-9c53-cf8e8c177949",
  "expires_at": "2026-10-30T08:48:41.558607112Z",
  "resend_available_at": "2026-10-30T08:43:42.558607112Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380638035041` → **200**

```json
{
  "phone": "+380638035041",
  "audience": "CLIENT",
  "code": "990983",
  "sent_at": "2026-10-30T08:43:41.560872668Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "8b0462cf-4e90-41ef-bc4f-024ed0241d1e",
  "current_challenge_id": "e14f5fde-ac74-4c5d-bcd9-543ff6b256ea",
  "current_code": "000000",
  "new_challenge_id": "79f3841f-e6fb-48cf-9c53-cf8e8c177949",
  "new_code": "990983"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "01d07fd9-0066-4fc4-9964-9308627a7d7e"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "a9b419e0-8403-4664-86b4-1cfea8c11461",
  "current_challenge_id": "e14f5fde-ac74-4c5d-bcd9-543ff6b256ea",
  "current_code": "846429",
  "new_challenge_id": "79f3841f-e6fb-48cf-9c53-cf8e8c177949",
  "new_code": "990983"
}
```

```json
{
  "subject_id": "0513b292-5796-453f-a3d4-63cffe92d47d",
  "phone": "+380638035041",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0513b292-5796-453f-a3d4-63cffe92d47d",
  "session_id": "ef335516-0309-45e4-b4f8-be0da7026c48",
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
  "correlation_id": "f3ee253b-9754-4e5d-ab0d-09667769b1b5"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638035041",
  "device_ref": "sandbox-21598"
}
```

```json
{
  "challenge_id": "b0493945-9f6b-49dd-9e5e-87913d4a3034",
  "expires_at": "2026-10-30T08:48:44.78818958Z",
  "resend_available_at": "2026-10-30T08:43:45.78818958Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638035041` → **200**

```json
{
  "phone": "+380638035041",
  "audience": "CLIENT",
  "code": "163403",
  "sent_at": "2026-10-30T08:43:44.791111569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b0493945-9f6b-49dd-9e5e-87913d4a3034",
  "code": "163403",
  "device_ref": "sandbox-21598"
}
```

```json
{
  "session_id": "b9714487-6a98-4ff3-af03-07731bc8bde4",
  "subject": {
    "type": "CLIENT",
    "id": "0513b292-5796-453f-a3d4-63cffe92d47d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTEzYjI5Mi01Nzk2LTQ1M2YtYTNkNC02M2NmZmU5MmQ0N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzI1LCJpYXQiOjE3OTMzNDk4MjUsImp0aSI6IjJkMmYzYmY0LWRmOWUtNGNmYS05M2IxLTQ5Y2IwZGU3NWY4YiIsInNpZCI6ImI5NzE0NDg3LTZhOTgtNGZmMy1hZjAzLTA3NzMxYmM4YmRlNCJ9.icbDQ76EZFkAgXa5J2pBU-hBWBiyFPlxk1aV0-ykfZM",
  "access_expires_at": "2026-10-30T08:58:45.037287538Z",
  "refresh_token": "H26-S_j_wk7FxFgooqSkbgfIssZgq1vI9eGnJ2NpKTs",
  "refresh_expires_at": "2026-11-29T08:43:45.036667018Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0513b292-5796-453f-a3d4-63cffe92d47d",
  "session_id": "b9714487-6a98-4ff3-af03-07731bc8bde4",
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
  "session_id": "f7e29517-c97e-4f6c-aea0-39f9ad91fdf2",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MjUsImlhdCI6MTc5MzM0OTgyNSwianRpIjoiZmM4ZDQ4ZjctMDMzYS00ZTA2LTk3ZmEtYjNmOWI4NjNiZDQwIiwic2lkIjoiZjdlMjk1MTctYzk3ZS00ZjZjLWFlYTAtMzlmOWFkOTFmZGYyIn0.njL7RlHvS0BjQ_UKNQL2wXaFZvcY6lMyXKTR7R7Ueh4",
  "access_expires_at": "2026-10-30T08:58:45.729359Z",
  "refresh_token": "Cz45JDLSjeOqMIngLGwmJnEAWb3a33LX_FocfmPLdUk",
  "refresh_expires_at": "2026-10-30T20:43:45.728811378Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d` → **200**

```json
{
  "client": {
    "id": "0513b292-5796-453f-a3d4-63cffe92d47d",
    "phone": "+380638035041",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-30T08:43:36.363548Z",
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

`POST /api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d/phone/new-code` → **201**

```json
{
  "phone": "+380630063903"
}
```

```json
{
  "challenge_id": "1cc30a0e-470c-4a7d-9753-c98d2b563572",
  "expires_at": "2026-10-30T08:48:46.205557645Z",
  "resend_available_at": "2026-10-30T08:43:47.205557645Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630063903` → **200**

```json
{
  "phone": "+380630063903",
  "audience": "CLIENT",
  "code": "395143",
  "sent_at": "2026-10-30T08:43:46.207337622Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d/phone` → **422**

```json
{
  "command_id": "da3f86b5-4147-476c-a9e5-a44dc3778d24",
  "expected_version": 3,
  "new_challenge_id": "1cc30a0e-470c-4a7d-9753-c98d2b563572",
  "new_code": "395144",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "4c566018-7a43-4b78-afc0-a01777e2bdae"
}
```

`POST /api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d/phone` → **400**

```json
{
  "command_id": "13e1b610-052d-4ba4-a083-14f8abbeaf00",
  "expected_version": 3,
  "new_challenge_id": "1cc30a0e-470c-4a7d-9753-c98d2b563572",
  "new_code": "395143",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "c8ff8d7a-fe12-4f03-a711-43994ebd7650",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/0513b292-5796-453f-a3d4-63cffe92d47d/phone` → **200**

```json
{
  "command_id": "f8a27338-ae0c-4a77-9c42-b5499f9cf539",
  "expected_version": 3,
  "new_challenge_id": "1cc30a0e-470c-4a7d-9753-c98d2b563572",
  "new_code": "395143",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "0513b292-5796-453f-a3d4-63cffe92d47d",
  "phone": "+380630063903",
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
  "correlation_id": "fe19397e-6341-4d0f-a517-fb371666954c"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630063903",
  "device_ref": "sandbox-4907"
}
```

```json
{
  "challenge_id": "d7faa651-36c1-4ad3-875e-3809024f6564",
  "expires_at": "2026-10-30T08:48:47.613796664Z",
  "resend_available_at": "2026-10-30T08:43:48.613796664Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630063903` → **200**

```json
{
  "phone": "+380630063903",
  "audience": "CLIENT",
  "code": "120755",
  "sent_at": "2026-10-30T08:43:47.616338921Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7faa651-36c1-4ad3-875e-3809024f6564",
  "code": "120755",
  "device_ref": "sandbox-4907"
}
```

```json
{
  "session_id": "31f6d538-ab1a-4ba9-a3c5-dc1874d5c548",
  "subject": {
    "type": "CLIENT",
    "id": "0513b292-5796-453f-a3d4-63cffe92d47d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNTEzYjI5Mi01Nzk2LTQ1M2YtYTNkNC02M2NmZmU5MmQ0N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzI3LCJpYXQiOjE3OTMzNDk4MjcsImp0aSI6IjQxYTIzZjMxLTBjZjYtNDAxYS1iMTcxLWRiNDI3OGY5ZjczZSIsInNpZCI6IjMxZjZkNTM4LWFiMWEtNGJhOS1hM2M1LWRjMTg3NGQ1YzU0OCJ9.kLD369BU_MKhlJUE9wGoTiz56RmLrq9Ypb8AQ-d1Z6s",
  "access_expires_at": "2026-10-30T08:58:47.865604225Z",
  "refresh_token": "rzL_fNaYYgZVwtheMrgrmvmqk26OemBSUW6t6F5z8ws",
  "refresh_expires_at": "2026-11-29T08:43:47.865008492Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0513b292-5796-453f-a3d4-63cffe92d47d",
  "session_id": "31f6d538-ab1a-4ba9-a3c5-dc1874d5c548",
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
  "phone": "+380633249402",
  "device_ref": "sandbox-23428"
}
```

```json
{
  "challenge_id": "481c2ed0-7070-4894-bd16-c16553892e54",
  "expires_at": "2026-10-30T08:48:48.318743691Z",
  "resend_available_at": "2026-10-30T08:43:49.318743691Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633249402` → **200**

```json
{
  "phone": "+380633249402",
  "audience": "CLIENT",
  "code": "126369",
  "sent_at": "2026-10-30T08:43:48.32071408Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "481c2ed0-7070-4894-bd16-c16553892e54",
  "code": "126369",
  "device_ref": "sandbox-23428"
}
```

```json
{
  "session_id": "0ef7d54e-a260-44be-a9b4-d767eea48057",
  "subject": {
    "type": "CLIENT",
    "id": "c8d8b814-e49a-444c-ae9f-e868d0f988b7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjOGQ4YjgxNC1lNDlhLTQ0NGMtYWU5Zi1lODY4ZDBmOTg4YjciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzI4LCJpYXQiOjE3OTMzNDk4MjgsImp0aSI6IjhmMDg2OTZiLWZhZTMtNDM1Zi1iZDY2LWZjZGY0ZmRhNTdmNCIsInNpZCI6IjBlZjdkNTRlLWEyNjAtNDRiZS1hOWI0LWQ3NjdlZWE0ODA1NyJ9.eac4zAl6AXDRJqXipPBNvHpeWwWCEfmeBdUQ6BqWxl8",
  "access_expires_at": "2026-10-30T08:58:48.570331055Z",
  "refresh_token": "6DknocW-nzk097vpcKAdEg28XmpFMOrumspvLLLK6SI",
  "refresh_expires_at": "2026-11-29T08:43:48.569858525Z",
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
  "session_id": "16f26ff6-9142-4525-9c5b-f3a56d0860dc",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MjksImlhdCI6MTc5MzM0OTgyOSwianRpIjoiYjViM2ZkYjAtYTI5ZC00MGE3LWJhOWUtMWZkNWE2MGIzYThkIiwic2lkIjoiMTZmMjZmZjYtOTE0Mi00NTI1LTljNWItZjNhNTZkMDg2MGRjIn0.XmBCIt1A8faEWjpoSJTAdjMSD_QFxrbtZVzryPJUkCo",
  "access_expires_at": "2026-10-30T08:58:49.680634721Z",
  "refresh_token": "GFYyXqVDin8fnhpVIOBGtZtBrSjPKFaQsEbFFRDv1rU",
  "refresh_expires_at": "2026-10-30T20:43:49.680124715Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633249402` → **200**

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
  "correlation_id": "065f06b5-e409-4d9a-9444-a36a78729d5b"
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
  "session_id": "6be33569-ffeb-46a5-87b7-f35daf4d7eb3",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MzAsImlhdCI6MTc5MzM0OTgzMCwianRpIjoiNzI3MTE5ZDktY2QzZS00OTU2LWI4MWQtODQ4ZjFmMDFkMjM2Iiwic2lkIjoiNmJlMzM1NjktZmZlYi00NmE1LTg3YjctZjM1ZGFmNGQ3ZWIzIn0.VPWhjXaJsz_tz3tnp7qmJnJq6kK_OLDjzzKv0Kr1gzg",
  "access_expires_at": "2026-10-30T08:58:50.651286865Z",
  "refresh_token": "zydrGb73BOiKeroZ4ChG9YJHUxaibMJI5Pwb4z1krOg",
  "refresh_expires_at": "2026-10-30T20:43:50.650718593Z",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-30T08:40:19.844483Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "420b599d-3f4c-42b0-bbf4-c015909a469b",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-30T08:43:51.134595663Z"
}
```

## The rider books the airport for 2026-10-30T11:43:50Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600697515",
  "device_ref": "sandbox-17575"
}
```

```json
{
  "challenge_id": "cc7f6c2d-81bb-4c88-8536-992cc29a03bc",
  "expires_at": "2026-10-30T08:48:51.376919588Z",
  "resend_available_at": "2026-10-30T08:43:52.376919588Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600697515` → **200**

```json
{
  "phone": "+48600697515",
  "audience": "CLIENT",
  "code": "699001",
  "sent_at": "2026-10-30T08:43:51.463278016Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cc7f6c2d-81bb-4c88-8536-992cc29a03bc",
  "code": "699001",
  "device_ref": "sandbox-17575"
}
```

```json
{
  "session_id": "fcc5f63a-b304-437f-9642-ac466c96d965",
  "subject": {
    "type": "CLIENT",
    "id": "2444a40a-314e-400a-8ad5-07b51e0968f3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDQ0YTQwYS0zMTRlLTQwMGEtOGFkNS0wN2I1MWUwOTY4ZjMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzMxLCJpYXQiOjE3OTMzNDk4MzEsImp0aSI6IjhjYjYyMmIwLTQ3ZGEtNDlmNi04OTdiLWYxNWNkNTVlZTQ1MiIsInNpZCI6ImZjYzVmNjNhLWIzMDQtNDM3Zi05NjQyLWFjNDY2Yzk2ZDk2NSJ9.OEbzrp0GHTUpy0OqEMFStVMNEqAK_0NbIzAJO2sGh-8",
  "access_expires_at": "2026-10-30T08:58:51.72112884Z",
  "refresh_token": "OTAg-bwYBE84jNOai_V_Kr8urOXjpJsKAsMB929VNMg",
  "refresh_expires_at": "2026-11-29T08:43:51.720661278Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "040b5d5b-7b88-4553-a415-6c51620776e5",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-30T11:43:50Z"
}
```

```json
{
  "id": "d642887e-8b5b-48e4-a012-b29f4706f940",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:51.958955Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-30T11:43:50Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "2d4754a1-26c5-4796-a419-3f0934775e89",
  "quote_id": "d642887e-8b5b-48e4-a012-b29f4706f940",
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
  "pickup_at": "2026-10-30T11:43:50Z"
}
```

```json
{
  "id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "2444a40a-314e-400a-8ad5-07b51e0968f3",
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
  "created_at": "2026-10-30T08:43:52.204838Z",
  "cancellation": null,
  "pickup_at": "2026-10-30T11:43:50Z",
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
  "device_ref": "sandbox-14794"
}
```

```json
{
  "challenge_id": "5585945d-5ce4-49b2-8ca0-bf83dc7232c2",
  "expires_at": "2026-10-30T08:48:52.449191981Z",
  "resend_available_at": "2026-10-30T08:43:53.449191981Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "792231",
  "sent_at": "2026-10-30T08:43:52.452092468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5585945d-5ce4-49b2-8ca0-bf83dc7232c2",
  "code": "792231",
  "device_ref": "sandbox-14794"
}
```

```json
{
  "session_id": "afe5ba02-d0a4-48b0-aaf6-3584dffe9ef4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDczMiwiaWF0IjoxNzkzMzQ5ODMyLCJqdGkiOiJkNDY5MTBhZS1jZTBjLTQxM2EtOTUzMC00ZDFkYjU0ZDFmNGYiLCJzaWQiOiJhZmU1YmEwMi1kMGE0LTQ4YjAtYWFmNi0zNTg0ZGZmZTllZjQifQ.SMw1A9O-QnKgY_6Ce2skRODnv1qgs6iFrhdgLomKsLg",
  "access_expires_at": "2026-10-30T08:58:52.72310482Z",
  "refresh_token": "tnjEmiU1QFGmrBiS9KUCamDPGL6OQm6KNVtMBzHN29Q",
  "refresh_expires_at": "2026-11-29T08:43:52.722587043Z",
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
  "command_id": "bae703ca-af0b-47e2-9e16-c3c61ebbba2f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:53Z",
    "sequence": 1793349833174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "833e3bc8-2b53-4b91-8b2f-2c9ae254cb15",
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
  "last_heartbeat_at": "2026-10-30T08:43:53.191993Z",
  "last_location_at": "2026-10-30T08:43:53.191993Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
      "short_number": 24,
      "pickup_at": "2026-10-30T11:43:50Z",
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

`POST /api/driver/v1/preorders/310703c6-7dae-4585-b1ec-9adf8b2963e8/reserve` → **200**

```json
{
  "command_id": "ab5d5138-b402-448b-a038-d589d021ed3c"
}
```

```json
{
  "id": "a6c89885-bf72-4021-9bff-dcd45da1f5f5",
  "state": "RESERVED",
  "order": {
    "order_id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
    "short_number": 24,
    "pickup_at": "2026-10-30T11:43:50Z",
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
  "reserved_at": "2026-10-30T08:43:53.689718Z",
  "confirm_from": "2026-10-30T11:13:50Z",
  "confirm_until": "2026-10-30T11:23:50Z",
  "drop_until": "2026-10-30T10:43:50Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "a6c89885-bf72-4021-9bff-dcd45da1f5f5",
      "state": "RESERVED",
      "order": {
        "order_id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:43:50Z",
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
      "reserved_at": "2026-10-30T08:43:53.689718Z",
      "confirm_from": "2026-10-30T11:13:50Z",
      "confirm_until": "2026-10-30T11:23:50Z",
      "drop_until": "2026-10-30T10:43:50Z"
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
      "id": "a6c89885-bf72-4021-9bff-dcd45da1f5f5",
      "state": "RESERVED",
      "order": {
        "order_id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
        "short_number": 24,
        "pickup_at": "2026-10-30T11:43:50Z",
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
      "reserved_at": "2026-10-30T08:43:53.689718Z",
      "confirm_from": "2026-10-30T11:13:50Z",
      "confirm_until": "2026-10-30T11:23:50Z",
      "drop_until": "2026-10-30T10:43:50Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/a6c89885-bf72-4021-9bff-dcd45da1f5f5/confirm` → **409**

```json
{
  "command_id": "727d73f5-a85d-4c86-b7bf-65bf66ca5d26"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/a6c89885-bf72-4021-9bff-dcd45da1f5f5/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e6a515eb-704b-4a94-a0b2-f09f21f60c6e"
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
  "session_id": "321e2e2a-bb18-4b57-8e83-183628a90bb2",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3MzUsImlhdCI6MTc5MzM0OTgzNSwianRpIjoiMzI4MjZiMTAtYWQ5Ny00MzVhLWEzZjAtM2RiNmYzMTA4ZGQ5Iiwic2lkIjoiMzIxZTJlMmEtYmIxOC00YjU3LThlODMtMTgzNjI4YTkwYmIyIn0.1FXUJva9IUwvlXw0KvAlIKuPjYJmN2wCRMcQmiklsXs",
  "access_expires_at": "2026-10-30T08:58:55.041198301Z",
  "refresh_token": "xwNT_W8-h54HQ0M9gJ2zJKLuw9qRCn7Iyv81ZKyasOk",
  "refresh_expires_at": "2026-10-30T20:43:55.040580756Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/310703c6-7dae-4585-b1ec-9adf8b2963e8` → **200**

```json
{
  "id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "2444a40a-314e-400a-8ad5-07b51e0968f3",
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
  "created_at": "2026-10-30T08:43:52.204838Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-30T11:43:50Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "a6c89885-bf72-4021-9bff-dcd45da1f5f5",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-30T08:43:53.689718Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/310703c6-7dae-4585-b1ec-9adf8b2963e8/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-30T08:43:52.205672Z",
      "actor": {
        "type": "CLIENT",
        "id": "2444a40a-314e-400a-8ad5-07b51e0968f3",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
        "preorder": true,
        "quote_id": "d642887e-8b5b-48e4-a012-b29f4706f940",
        "pickup_at": "2026-10-30T11:43:50Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "729a815b-e628-451c-84e0-c00aa9528d3f"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-30T08:43:53.690701Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "310703c6-7dae-4585-b1ec-9adf8b2963e8",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "a6c89885-bf72-4021-9bff-dcd45da1f5f5"
      },
      "correlation_id": "95094e98-6944-4bd6-a232-50141d5c07f7"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 310703c6-7dae-4585-b1ec-9adf8b2963e8, reservation a6c89885-bf72-4021-9bff-dcd45da1f5f5.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21135"
}
```

```json
{
  "challenge_id": "0d2f3a43-5067-4704-8cd5-085cfbe80588",
  "expires_at": "2026-10-30T08:48:55.815213503Z",
  "resend_available_at": "2026-10-30T08:43:56.815213503Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "143871",
  "sent_at": "2026-10-30T08:43:55.817329528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0d2f3a43-5067-4704-8cd5-085cfbe80588",
  "code": "143871",
  "device_ref": "sandbox-21135"
}
```

```json
{
  "session_id": "7d5b6c69-b462-487d-87ca-6e8ee1eb0b23",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDczNiwiaWF0IjoxNzkzMzQ5ODM2LCJqdGkiOiJhNzMwMTY2Yy0wOWNjLTRkOTgtODc4NC04NjQzNzc1N2FiODYiLCJzaWQiOiI3ZDViNmM2OS1iNDYyLTQ4N2QtODdjYS02ZThlZTFlYjBiMjMifQ.75X7_uRztYUec6TWKhBn7dEhrLfxqwxJBF5Sx2mjqJs",
  "access_expires_at": "2026-10-30T08:58:56.070514691Z",
  "refresh_token": "RY0qfdj9e9KEPHVWZkXo6S00G3ON267YcVSr8FMn9vU",
  "refresh_expires_at": "2026-11-29T08:43:56.070053578Z",
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
  "command_id": "d379120b-5f38-4925-aeea-a5f6d82a35e1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:56Z",
    "sequence": 1793349836521
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:43:56.537696Z",
  "last_location_at": "2026-10-30T08:43:56.537696Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673743249",
  "device_ref": "sandbox-5974"
}
```

```json
{
  "challenge_id": "0aa23365-c707-4508-95f3-5467388ebbe9",
  "expires_at": "2026-10-30T08:48:56.764766677Z",
  "resend_available_at": "2026-10-30T08:43:57.764766677Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673743249` → **200**

```json
{
  "phone": "+380673743249",
  "audience": "CLIENT",
  "code": "480995",
  "sent_at": "2026-10-30T08:43:56.766978433Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0aa23365-c707-4508-95f3-5467388ebbe9",
  "code": "480995",
  "device_ref": "sandbox-5974"
}
```

```json
{
  "session_id": "9caa52e9-991a-40ea-a1a2-41eed344631a",
  "subject": {
    "type": "CLIENT",
    "id": "6e0de93a-d118-4e01-82a2-575d45a13803"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZTBkZTkzYS1kMTE4LTRlMDEtODJhMi01NzVkNDVhMTM4MDMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzM3LCJpYXQiOjE3OTMzNDk4MzcsImp0aSI6IjQ4MTcxOTliLTkyMGYtNGI2OS1hMTAxLWQzMTg1YmU2YzFjYiIsInNpZCI6IjljYWE1MmU5LTk5MWEtNDBlYS1hMWEyLTQxZWVkMzQ0NjMxYSJ9.Fp0NkDWH05NzHdL2zVsjvPiBu3LqoacE0YF5a49Raks",
  "access_expires_at": "2026-10-30T08:58:57.018310011Z",
  "refresh_token": "fX5_OTvy668tf7GQ1KZc-lhxs8SmXr4qudpv3uqeAlQ",
  "refresh_expires_at": "2026-11-29T08:43:57.017875398Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "289f3d01-f0c9-4843-a6f6-bd9b54f0918f",
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
  "id": "3f053641-f3d3-4601-a047-216208f86e10",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:48:57.256861Z",
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
  "command_id": "4961d46e-4c75-4e28-958d-02c3050ce860",
  "quote_id": "3f053641-f3d3-4601-a047-216208f86e10",
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
  "id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6e0de93a-d118-4e01-82a2-575d45a13803",
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
  "created_at": "2026-10-30T08:43:57.500198Z",
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
    "id": "0173f51f-de5d-447a-b9be-4958a32d3468",
    "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
    "expires_at": "2026-10-30T08:44:12.50298Z",
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

`POST /api/driver/v1/offers/0173f51f-de5d-447a-b9be-4958a32d3468/accept` → **200**

```json
{
  "command_id": "d4f97b28-7128-41a2-8e62-82b68d9e6cfe"
}
```

```json
{
  "id": "c1c456eb-e240-443b-8819-b7b7d14bbf76",
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "005ebd92-be68-453f-bd50-9ee6d2480ff1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "005ebd92-be68-453f-bd50-9ee6d2480ff1",
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "assignment_id": "c1c456eb-e240-443b-8819-b7b7d14bbf76",
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

`POST /api/driver/v1/work-sessions/f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:58Z",
    "sequence": 1793349838437
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:43:58.453732Z",
  "last_location_at": "2026-10-30T08:43:58.453732Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "005ebd92-be68-453f-bd50-9ee6d2480ff1",
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "assignment_id": "c1c456eb-e240-443b-8819-b7b7d14bbf76",
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

`POST /api/driver/v1/trips/005ebd92-be68-453f-bd50-9ee6d2480ff1/arrive` → **200**

```json
{
  "command_id": "2c665f43-25d2-480f-af3a-2d9da72a60f3",
  "expected_version": 0
}
```

```json
{
  "id": "005ebd92-be68-453f-bd50-9ee6d2480ff1",
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "assignment_id": "c1c456eb-e240-443b-8819-b7b7d14bbf76",
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
  "arrived_at": "2026-10-30T08:43:58.916986Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/005ebd92-be68-453f-bd50-9ee6d2480ff1/start` → **200**

```json
{
  "command_id": "2e13b3c1-0581-4090-ae6a-0305c53620cb",
  "expected_version": 1
}
```

```json
{
  "id": "005ebd92-be68-453f-bd50-9ee6d2480ff1",
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "assignment_id": "c1c456eb-e240-443b-8819-b7b7d14bbf76",
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
  "arrived_at": "2026-10-30T08:43:58.916986Z",
  "started_at": "2026-10-30T08:43:59.160759Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:43:59Z",
    "sequence": 1793349839389
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:43:59.441796Z",
  "last_location_at": "2026-10-30T08:43:59.441796Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/005ebd92-be68-453f-bd50-9ee6d2480ff1/complete` → **200**

```json
{
  "command_id": "73d662e2-71ea-48d0-a9ed-57961d7fb965",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:43:59Z",
  "cash_received": true
}
```

```json
{
  "id": "005ebd92-be68-453f-bd50-9ee6d2480ff1",
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "assignment_id": "c1c456eb-e240-443b-8819-b7b7d14bbf76",
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
  "arrived_at": "2026-10-30T08:43:58.916986Z",
  "started_at": "2026-10-30T08:43:59.160759Z",
  "completed_at": "2026-10-30T08:43:59.677583Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/96ffb86f-bf56-4fff-8d31-a1f6042fafed/rating` → **200**

```json
{
  "command_id": "180fdea0-e4d5-4c10-955c-4b01381d31e8",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "score": 5,
  "created_at": "2026-10-30T08:43:59.956035527Z"
}
```

`POST /api/driver/v1/orders/96ffb86f-bf56-4fff-8d31-a1f6042fafed/rating` → **200**

```json
{
  "command_id": "84ad6f95-d56c-4807-a972-670f25a917c7",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
  "score": 4,
  "created_at": "2026-10-30T08:44:00.194855278Z"
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
  "session_id": "7bb1c807-abb8-4f37-9009-a4d9eb4ba0fe",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NDAsImlhdCI6MTc5MzM0OTg0MCwianRpIjoiMjI1ZmVjZTMtZDI0MC00NzZmLWI1YzQtZGEwNWE4ODUyNjJkIiwic2lkIjoiN2JiMWM4MDctYWJiOC00ZjM3LTkwMDktYTRkOWViNGJhMGZlIn0.GHqbaJqKcSv92a6Y9sBJRCDZfcDDM9SfOnHTXh85nok",
  "access_expires_at": "2026-10-30T08:59:00.923783874Z",
  "refresh_token": "nWykgSQzKD0dBeF3mUJPCeB-DH5sNNMVz76qHcrwegI",
  "refresh_expires_at": "2026-10-30T20:44:00.923299547Z",
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
  "session_id": "e9a5180e-92d1-4739-bcc8-e9d7ceebaf1b",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NDEsImlhdCI6MTc5MzM0OTg0MSwianRpIjoiYjI0MGRiODctMDIxZS00YzQ5LTk3ODktZGVmNmQ2ZWI5ZGJkIiwic2lkIjoiZTlhNTE4MGUtOTJkMS00NzM5LWJjYzgtZTlkN2NlZWJhZjFiIn0.3qiOOwtVM1R3e4heI7VKfzChEzMf60NNX7phaHVF8kk",
  "access_expires_at": "2026-10-30T08:59:01.456837515Z",
  "refresh_token": "f2iO4G1x6WEBX2XFTARepNGm9f-LqN_tBT5eTBUN57M",
  "refresh_expires_at": "2026-10-30T20:44:01.45632152Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/96ffb86f-bf56-4fff-8d31-a1f6042fafed/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
      "author_type": "RIDER",
      "author_id": "6e0de93a-d118-4e01-82a2-575d45a13803",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-30T08:43:59.956036Z"
    },
    {
      "order_id": "96ffb86f-bf56-4fff-8d31-a1f6042fafed",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "6e0de93a-d118-4e01-82a2-575d45a13803",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-30T08:44:00.194855Z"
    }
  ]
}
```

Done: ratings for order 96ffb86f-bf56-4fff-8d31-a1f6042fafed.

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
  "session_id": "6017cdc9-bde1-4c84-be11-8beee30dc595",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NDIsImlhdCI6MTc5MzM0OTg0MiwianRpIjoiNWJkZTdjMmQtMjVhZC00OTFlLWFiZmUtZjA0ZTg2NDcyYTIyIiwic2lkIjoiNjAxN2NkYzktYmRlMS00Yzg0LWJlMTEtOGJlZWUzMGRjNTk1In0.3pHZyjrgQuag02_Dx0Ddk5NU3tvfUZrmZVRWjWq5ny0",
  "access_expires_at": "2026-10-30T08:59:02.20113029Z",
  "refresh_token": "mkA065639DSUw_MPQds5WaIo_0XCTvQwY9p03BqDJ8A",
  "refresh_expires_at": "2026-10-30T20:44:02.200668707Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "dbbfac16-36cd-4fd2-bb48-5164a1875a58",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "5ba3d152-b3c4-4ae8-b5d2-2b23e81c1e3a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:02.442047Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5ba3d152-b3c4-4ae8-b5d2-2b23e81c1e3a` → **200**

```json
{
  "id": "5ba3d152-b3c4-4ae8-b5d2-2b23e81c1e3a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:02.442047Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/5ba3d152-b3c4-4ae8-b5d2-2b23e81c1e3a` → **200**

```json
{
  "id": "5ba3d152-b3c4-4ae8-b5d2-2b23e81c1e3a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:44:02.442047Z",
  "ready_at": "2026-10-30T08:44:03.391465Z",
  "expires_at": "2026-10-31T08:44:03.391465Z"
}
```

`GET /api/admin/v1/reports/exports/5ba3d152-b3c4-4ae8-b5d2-2b23e81c1e3a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-30,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3521c777-2643-4168-9e73-841ae4cb70af",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30"
}
```

```json
{
  "id": "3810eadb-3dfa-4c0b-81c3-68c2651a88d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:04.32233Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3810eadb-3dfa-4c0b-81c3-68c2651a88d0` → **200**

```json
{
  "id": "3810eadb-3dfa-4c0b-81c3-68c2651a88d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:04.32233Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3810eadb-3dfa-4c0b-81c3-68c2651a88d0` → **200**

```json
{
  "id": "3810eadb-3dfa-4c0b-81c3-68c2651a88d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:04.32233Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3810eadb-3dfa-4c0b-81c3-68c2651a88d0` → **200**

```json
{
  "id": "3810eadb-3dfa-4c0b-81c3-68c2651a88d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:04.32233Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3810eadb-3dfa-4c0b-81c3-68c2651a88d0` → **200**

```json
{
  "id": "3810eadb-3dfa-4c0b-81c3-68c2651a88d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-30T08:44:04.32233Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3810eadb-3dfa-4c0b-81c3-68c2651a88d0` → **200**

```json
{
  "id": "3810eadb-3dfa-4c0b-81c3-68c2651a88d0",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-30",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-30.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-30T08:44:04.32233Z",
  "ready_at": "2026-10-30T08:44:08.401932Z",
  "expires_at": "2026-10-31T08:44:08.401932Z"
}
```

`GET /api/admin/v1/reports/exports/3810eadb-3dfa-4c0b-81c3-68c2651a88d0/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-30,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c7db85ee-6a2b-466e-8923-848e1a8ceec6` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c7db85ee-6a2b-466e-8923-848e1a8ceec6",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "2cf442ea-b636-4811-b8e1-409e668f750d"
}
```

Done: both reports were built in the background and downloaded.

# Scenario: retention

## Technical data retention

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
  "session_id": "80e6770a-9733-489e-8458-76917eb22648",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NTAsImlhdCI6MTc5MzM0OTg1MCwianRpIjoiNDhjYzYzNzItNWY2My00ZGM1LWFhMmItZmE1ZDIzY2Y1NWQwIiwic2lkIjoiODBlNjc3MGEtOTczMy00ODllLTg0NTgtNzY5MTdlYjIyNjQ4In0.1ziUfWXwzK5VXIahKinVCaxRhQGoyfKdDqqk8AGnjz4",
  "access_expires_at": "2026-10-30T08:59:10.257114795Z",
  "refresh_token": "d2ebKdsxoZt37NrzDsmWkmtkmEF6KiIeP_t1uFa-EZU",
  "refresh_expires_at": "2026-10-30T20:44:10.256655454Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": null,
  "reason": null,
  "changed_at": null
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "32654698-c6f5-468f-8209-c2f672bf5033",
  "expected_version": 0,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Sandbox retention boundary"
}
```

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T08:44:10.733507695Z"
}
```

`POST /sandbox/v1/retention/fixtures/202cbf6f-cf86-4d38-823a-519c49c8f548` → **200**

```json
{
  "old_done": 1,
  "recent_done": 1,
  "failed": 1
}
```

`POST /sandbox/v1/retention/run` → **200**

```json
{
  "sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "sign_in_codes": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "code_deliveries": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "delivered_events": {
    "deleted": 1,
    "failures": 0,
    "examined": 1
  },
  "consumer_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "command_receipts": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "upload_sessions": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "quarantined_files": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  },
  "call_recordings": {
    "deleted": 0,
    "failures": 0,
    "examined": 0
  }
}
```

`GET /sandbox/v1/retention/fixtures/202cbf6f-cf86-4d38-823a-519c49c8f548` → **200**

```json
{
  "old_done": 0,
  "recent_done": 1,
  "failed": 1
}
```

Old DONE event removed; recent DONE and old FAILED events retained. Policy and synthetic fixtures restored on exit.

`DELETE /sandbox/v1/retention/fixtures/202cbf6f-cf86-4d38-823a-519c49c8f548` → **204**

`GET /api/admin/v1/retention` → **200**

```json
{
  "version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 1,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox retention boundary",
  "changed_at": "2026-10-30T08:44:10.733508Z"
}
```

`PUT /api/admin/v1/retention` → **200**

```json
{
  "command_id": "88ab4c01-05e5-4069-9d99-a8af2b9581ea",
  "expected_version": 1,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "reason": "Restore policy after retention sandbox"
}
```

```json
{
  "version": 2,
  "days": {
    "call_recordings": 0,
    "code_deliveries": 90,
    "command_receipts": 30,
    "consumer_receipts": 30,
    "delivered_events": 30,
    "quarantined_files": 30,
    "sessions": 30,
    "sign_in_codes": 90,
    "upload_sessions": 7
  },
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Restore policy after retention sandbox",
  "changed_at": "2026-10-30T08:44:11.307113801Z"
}
```

# Scenario: risk-flag

## The driver starts a new shift in Kyiv

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-28297"
}
```

```json
{
  "challenge_id": "c261fee2-d939-4003-96c1-daf4bf1724ee",
  "expires_at": "2026-10-30T08:49:11.551309677Z",
  "resend_available_at": "2026-10-30T08:44:12.551309677Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "686986",
  "sent_at": "2026-10-30T08:44:11.553855988Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c261fee2-d939-4003-96c1-daf4bf1724ee",
  "code": "686986",
  "device_ref": "sandbox-28297"
}
```

```json
{
  "session_id": "55bbe96d-abda-4ad9-ad27-a3e903fb1dd3",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc1MSwiaWF0IjoxNzkzMzQ5ODUxLCJqdGkiOiI2ZjBlMzIwNy04OTllLTRhMWItYmFjMS00NDcyYWMzYTYyZDEiLCJzaWQiOiI1NWJiZTk2ZC1hYmRhLTRhZDktYWQyNy1hM2U5MDNmYjFkZDMifQ.HostcR_jfPQX_AksyYbvvz9kal5ZYT0m8WesdCP6dwU",
  "access_expires_at": "2026-10-30T08:59:11.804813238Z",
  "refresh_token": "jLK6gPHpxI7jbdlOX8NArqLbMOfzfg_goyPvT8IYC8k",
  "refresh_expires_at": "2026-11-29T08:44:11.804354218Z",
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
  "command_id": "b3add71e-cc11-46f1-9d16-dc3e6c1165de",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:12Z",
    "sequence": 1793349852484
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c6836173-b7f9-4cba-b3ff-bb53ed3a6b0e",
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
  "last_heartbeat_at": "2026-10-30T08:44:12.500513Z",
  "last_location_at": "2026-10-30T08:44:12.500513Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "a48e1146-528a-4f36-9625-a3d97a1f53f9",
  "points": [
    {
      "sequence": 1793349854736,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:43:14Z"
    },
    {
      "sequence": 1793349854742,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-30T08:44:14Z"
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
  "session_id": "6deb740f-32d8-433e-8226-bd2c066f1e73",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NTUsImlhdCI6MTc5MzM0OTg1NSwianRpIjoiY2Q3Yjk1ZjgtZTA4YS00N2U0LTg1ZDUtNTE0MDI1ZmUyZmIyIiwic2lkIjoiNmRlYjc0MGYtMzJkOC00MzNlLTgyMjYtYmQyYzA2NmYxZTczIn0.PnOuQV9tWjLvGTbyWYlhuUR3sSoh5NFWSLCoZBGnpNo",
  "access_expires_at": "2026-10-30T08:59:15.264472164Z",
  "refresh_token": "bQRrvZu6xAp90WPJTiTf4nhBWJ3iCZMo3sghdUwZUCQ",
  "refresh_expires_at": "2026-10-30T20:44:15.263985765Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "98f48f6f-27ce-426e-a79a-f743ca5f2c5b",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-30T08:44:14Z",
        "track_point_id": "edb48d4d-5e37-4594-8907-cbb582468c69",
        "work_session_id": "c6836173-b7f9-4cba-b3ff-bb53ed3a6b0e"
      },
      "raised_by": null,
      "raised_at": "2026-10-30T08:44:14Z",
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

`POST /api/admin/v1/driver-risk-flags/98f48f6f-27ce-426e-a79a-f743ca5f2c5b/confirm` → **200**

```json
{
  "command_id": "a33e2177-6471-472f-adde-48b508437c98",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "98f48f6f-27ce-426e-a79a-f743ca5f2c5b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-30T08:44:14Z",
    "track_point_id": "edb48d4d-5e37-4594-8907-cbb582468c69",
    "work_session_id": "c6836173-b7f9-4cba-b3ff-bb53ed3a6b0e"
  },
  "raised_by": null,
  "raised_at": "2026-10-30T08:44:14Z",
  "reason": null,
  "reviewed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reviewed_at": "2026-10-30T08:44:15.995634Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/98f48f6f-27ce-426e-a79a-f743ca5f2c5b/dismiss` → **409**

```json
{
  "command_id": "0929bd5c-0dc4-46d9-9b33-235ba15d2ec2",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/98f48f6f-27ce-426e-a79a-f743ca5f2c5b/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "423a6df6-b4d3-4586-adbc-4390d1844082"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "9f128ce9-acfb-41b5-9d0c-a7d01ea13403",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "35d365e7-89c9-441b-a733-ec35f0d89935",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "raised_at": "2026-10-30T08:44:16.473553Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/35d365e7-89c9-441b-a733-ec35f0d89935/dismiss` → **200**

```json
{
  "command_id": "83d50e4e-f356-4867-8f51-7ec5c3975247",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "35d365e7-89c9-441b-a733-ec35f0d89935",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "raised_at": "2026-10-30T08:44:16.473553Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reviewed_at": "2026-10-30T08:44:16.714283Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "85501232-657f-422c-a4f6-c2edb18e00f1",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "98f48f6f-27ce-426e-a79a-f743ca5f2c5b"
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
      "actor_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:44:17.03032Z"
    }
  ]
}
```

Done: flag 98f48f6f-27ce-426e-a79a-f743ca5f2c5b confirmed, suspension named it, driver reinstated.

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
  "session_id": "9a6ea116-2c6f-4cb0-b6d3-cefe114e0594",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NTcsImlhdCI6MTc5MzM0OTg1NywianRpIjoiY2Q1Y2NmYjktYjM0ZC00ODhhLThhYTYtNWI0OTUxZGIyODZlIiwic2lkIjoiOWE2ZWExMTYtMmM2Zi00Y2IwLWI2ZDMtY2VmZTExNGUwNTk0In0.f7RMX46b2vZD8Vo78zOuqOVier_xz65YzppkxMUynLY",
  "access_expires_at": "2026-10-30T08:59:17.80143921Z",
  "refresh_token": "kT-aBUmaLIg1PKb-KoduIZLXNpWf7lOgmKS7PRhfLjw",
  "refresh_expires_at": "2026-10-30T20:44:17.800952851Z",
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
      "actor_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:44:17.03032Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "ec1b1574-e03c-427d-9e06-e85bf9099f63",
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
  "session_id": "c6836173-b7f9-4cba-b3ff-bb53ed3a6b0e",
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
  "last_heartbeat_at": "2026-10-30T08:44:12.500513Z",
  "last_location_at": "2026-10-30T08:44:12.500513Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c6836173-b7f9-4cba-b3ff-bb53ed3a6b0e/close` → **200**

```json
{
  "command_id": "74e9ebf7-3a47-4f78-871e-c2a53263bef5",
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
  "session_id": "47c38f9b-203b-4dc9-ac63-3db86c9912de",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NTksImlhdCI6MTc5MzM0OTg1OSwianRpIjoiNzdiNjQ0ZDAtMzY5MS00MjAxLTkwN2QtODhmZjBlYjNlOGYzIiwic2lkIjoiNDdjMzhmOWItMjAzYi00ZGM5LWFjNjMtM2RiODZjOTkxMmRlIn0.UgkOyWV9deoEQDamITeiDvHzgAxYSvPMGY6q2ph3aLM",
  "access_expires_at": "2026-10-30T08:59:19.29809953Z",
  "refresh_token": "J5oBvWsZF-2zEkah_zLyfIAHPsJ2ub2LFXTwn1jRRy0",
  "refresh_expires_at": "2026-10-30T20:44:19.297633059Z",
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
  "command_id": "fc3027b8-2fb3-4ef2-bfa3-4c4bf4cf64a6",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:44:19.774026Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "fc3027b8-2fb3-4ef2-bfa3-4c4bf4cf64a6",
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
  "changed_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-30T08:44:19.774026Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48650561286",
  "device_ref": "sandbox-31777"
}
```

```json
{
  "challenge_id": "c0ef6859-5264-4ec5-b85b-955ce8b2ad04",
  "expires_at": "2026-10-30T08:49:20.252488018Z",
  "resend_available_at": "2026-10-30T08:44:21.252488018Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48650561286` → **200**

```json
{
  "phone": "+48650561286",
  "audience": "CLIENT",
  "code": "783955",
  "sent_at": "2026-10-30T08:44:20.254634417Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0ef6859-5264-4ec5-b85b-955ce8b2ad04",
  "code": "783955",
  "device_ref": "sandbox-31777"
}
```

```json
{
  "session_id": "1ccc4d62-858c-43e2-a2c9-d22f369374bd",
  "subject": {
    "type": "CLIENT",
    "id": "6188bf5a-3bb8-4589-9f46-9b134f369464"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MTg4YmY1YS0zYmI4LTQ1ODktOWY0Ni05YjEzNGYzNjk0NjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzYwLCJpYXQiOjE3OTMzNDk4NjAsImp0aSI6ImVhOGNiMTYxLTE4NWMtNDMwNy04NGIxLWVjYTc2N2MzMzkyMiIsInNpZCI6IjFjY2M0ZDYyLTg1OGMtNDNlMi1hMmM5LWQyMmYzNjkzNzRiZCJ9.ehmGfD4cvAPWKAq08t-f9Qglfpc_CMrw0492THZJlt8",
  "access_expires_at": "2026-10-30T08:59:20.510881603Z",
  "refresh_token": "CFwISaX0JxjS_gxzf5O4sAqioXUOygLVWkibcHOOjwg",
  "refresh_expires_at": "2026-11-29T08:44:20.510435372Z",
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
  "correlation_id": "952e8119-432e-46fc-903b-0b6392d9093f"
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
  "device_ref": "sandbox-12622"
}
```

```json
{
  "challenge_id": "7db062cd-9383-49f2-8e12-94833fc0f93b",
  "expires_at": "2026-10-30T08:49:21.192754178Z",
  "resend_available_at": "2026-10-30T08:44:22.192754178Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "472883",
  "sent_at": "2026-10-30T08:44:21.195397493Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7db062cd-9383-49f2-8e12-94833fc0f93b",
  "code": "472883",
  "device_ref": "sandbox-12622"
}
```

```json
{
  "session_id": "4e04289b-b142-49d9-a88e-07ba4d10de7d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc2MSwiaWF0IjoxNzkzMzQ5ODYxLCJqdGkiOiIwZDkxZDFjMS04YzBmLTRhZDItYmI4Yi01MmVjYzM1YWYyZjEiLCJzaWQiOiI0ZTA0Mjg5Yi1iMTQyLTQ5ZDktYTg4ZS0wN2JhNGQxMGRlN2QifQ.9JNYfCFvK7qBfOT65bOBf1IkoUJw6KrikzJrqGrbkh4",
  "access_expires_at": "2026-10-30T08:59:21.443867829Z",
  "refresh_token": "ZGUI05dZaTkE9HwNpA0xsPJhOy_8dxE-Y4chaHycqqc",
  "refresh_expires_at": "2026-11-29T08:44:21.443451533Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "833e3bc8-2b53-4b91-8b2f-2c9ae254cb15",
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
  "last_heartbeat_at": "2026-10-30T08:43:53.191993Z",
  "last_location_at": "2026-10-30T08:43:53.191993Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/833e3bc8-2b53-4b91-8b2f-2c9ae254cb15/handover` → **200**

```json
{
  "command_id": "a6d6c14b-d0b4-4f2c-abac-a94e8ae33841",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "833e3bc8-2b53-4b91-8b2f-2c9ae254cb15",
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
  "last_heartbeat_at": "2026-10-30T08:43:53.191993Z",
  "last_location_at": "2026-10-30T08:43:53.191993Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/833e3bc8-2b53-4b91-8b2f-2c9ae254cb15/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:22Z",
    "sequence": 1793349862127
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "833e3bc8-2b53-4b91-8b2f-2c9ae254cb15",
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
  "last_heartbeat_at": "2026-10-30T08:44:22.143704Z",
  "last_location_at": "2026-10-30T08:44:22.143704Z",
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
  "session_id": "833e3bc8-2b53-4b91-8b2f-2c9ae254cb15",
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
  "last_heartbeat_at": "2026-10-30T08:44:22.143704Z",
  "last_location_at": "2026-10-30T08:44:22.143704Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/833e3bc8-2b53-4b91-8b2f-2c9ae254cb15/close` → **200**

```json
{
  "command_id": "a90623f6-36b1-40b2-9bb1-bc9040509217",
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
  "correlation_id": "a0d6979c-9d5f-466f-96f2-5ebc569192d7"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678107121",
  "device_ref": "sandbox-8361"
}
```

```json
{
  "challenge_id": "e1c13a80-428e-458f-8860-fe34e2f3f195",
  "expires_at": "2026-10-30T08:49:23.324762121Z",
  "resend_available_at": "2026-10-30T08:44:24.324762121Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678107121` → **200**

```json
{
  "phone": "+380678107121",
  "audience": "CLIENT",
  "code": "699769",
  "sent_at": "2026-10-30T08:44:23.327267302Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e1c13a80-428e-458f-8860-fe34e2f3f195",
  "code": "699769",
  "device_ref": "sandbox-8361"
}
```

```json
{
  "session_id": "dc2369ce-17c2-45e2-8fdf-3dee57f8fae1",
  "subject": {
    "type": "CLIENT",
    "id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNmNlOWZhYS05ODI1LTQzZGItOGVkOC0wZmY5MmZmZTdmMzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzYzLCJpYXQiOjE3OTMzNDk4NjMsImp0aSI6IjQxNGNkZjRkLTk3ZmEtNDA5Zi04NTMyLWQ3MGVjMTBjYTRlYSIsInNpZCI6ImRjMjM2OWNlLTE3YzItNDVlMi04ZmRmLTNkZWU1N2Y4ZmFlMSJ9.flcavJiF5TlA5qq42x9rXw0i8MxQOCkTAmjAckZWLxg",
  "access_expires_at": "2026-10-30T08:59:23.694087671Z",
  "refresh_token": "l7wjYL75xR68d3vkTfC7ljieQmJlEJgbVgC5_QjzVvo",
  "refresh_expires_at": "2026-11-29T08:44:23.693637003Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "58fc5347-6ba9-4b28-a990-695d57d50379",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1447e2ee-c3fd-416a-8371-9cec69dcaa13",
  "upload_path": "/api/rider/v1/uploads/1447e2ee-c3fd-416a-8371-9cec69dcaa13",
  "expires_at": "2026-10-30T08:59:23.92564485Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/1447e2ee-c3fd-416a-8371-9cec69dcaa13` → **200**

```json
{
  "file_id": "1447e2ee-c3fd-416a-8371-9cec69dcaa13",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "40d81f3f-72e2-4444-8241-0db89bb4ad0d",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "1447e2ee-c3fd-416a-8371-9cec69dcaa13"
  ]
}
```

```json
{
  "id": "d80c3ce5-f7a8-4cb6-a35a-27217d713d1d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:44:24.206442Z",
  "updated_at": "2026-10-30T08:44:24.206442Z",
  "respond_by": "2026-10-30T12:44:24.206442Z",
  "messages": [
    {
      "id": "5da84ac7-4253-4bb0-8eec-b11437af47ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:44:24.207112Z",
      "attachments": [
        {
          "file_id": "1447e2ee-c3fd-416a-8371-9cec69dcaa13",
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
  "session_id": "3faef7f6-0e39-4698-afd9-2c4a335b4dbf",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NjQsImlhdCI6MTc5MzM0OTg2NCwianRpIjoiM2RjMzMzMmEtYjE3Yi00NGZlLWJkMzgtOTRkZWU3NzViMmI0Iiwic2lkIjoiM2ZhZWY3ZjYtMGUzOS00Njk4LWFmZDktMmM0YTMzNWI0ZGJmIn0.IPl-KiKZlPA8oh1VUUW0bYNBRNz3XqfBl4FRve_1CJM",
  "access_expires_at": "2026-10-30T08:59:24.710728443Z",
  "refresh_token": "d808VDR5gqCQyxDnZzCQESPoHJKyr2wX7AhQw9CuGSA",
  "refresh_expires_at": "2026-10-30T20:44:24.710270705Z",
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
  "session_id": "68f94659-c233-48b4-be77-e1c4a40d9176",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NjUsImlhdCI6MTc5MzM0OTg2NSwianRpIjoiYWIwYWRkMjktYTk0ZS00OGM3LTgwNDAtZWMxMzM1MTdiZDlkIiwic2lkIjoiNjhmOTQ2NTktYzIzMy00OGI0LWJlNzctZTFjNGE0MGQ5MTc2In0.T-LMbbx80RsZKZNhgCZoosXncUYkyxH22jz0bIeaCGA",
  "access_expires_at": "2026-10-30T08:59:25.191818476Z",
  "refresh_token": "3lk2hNiV0S4-HMDQvbBNIwqKZZ-1CvScNC1vsYR9LrY",
  "refresh_expires_at": "2026-10-30T20:44:25.191379456Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/d80c3ce5-f7a8-4cb6-a35a-27217d713d1d/attachments/1447e2ee-c3fd-416a-8371-9cec69dcaa13` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "3cae75ef-1a04-43f3-adaa-d2cf4d4e4ff6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "da7b1a06-7ce5-4f93-86cc-ce97fe07caf9",
  "upload_path": "/api/operator/v1/uploads/da7b1a06-7ce5-4f93-86cc-ce97fe07caf9",
  "expires_at": "2026-10-30T08:59:25.443211586Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/da7b1a06-7ce5-4f93-86cc-ce97fe07caf9` → **200**

```json
{
  "file_id": "da7b1a06-7ce5-4f93-86cc-ce97fe07caf9",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/d80c3ce5-f7a8-4cb6-a35a-27217d713d1d` → **200**

```json
{
  "id": "d80c3ce5-f7a8-4cb6-a35a-27217d713d1d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-30T08:44:24.206442Z",
  "updated_at": "2026-10-30T08:44:24.206442Z",
  "respond_by": "2026-10-30T12:44:24.206442Z",
  "messages": [
    {
      "id": "5da84ac7-4253-4bb0-8eec-b11437af47ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:44:24.207112Z",
      "attachments": [
        {
          "file_id": "1447e2ee-c3fd-416a-8371-9cec69dcaa13",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/d80c3ce5-f7a8-4cb6-a35a-27217d713d1d/comments` → **200**

```json
{
  "command_id": "42de6841-b0fa-49e9-a0b0-57f94708170a",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "da7b1a06-7ce5-4f93-86cc-ce97fe07caf9"
  ]
}
```

```json
{
  "id": "d80c3ce5-f7a8-4cb6-a35a-27217d713d1d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:44:24.206442Z",
  "updated_at": "2026-10-30T08:44:25.998622Z",
  "respond_by": "2026-10-30T12:44:24.206442Z",
  "messages": [
    {
      "id": "5da84ac7-4253-4bb0-8eec-b11437af47ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:44:24.207112Z",
      "attachments": [
        {
          "file_id": "1447e2ee-c3fd-416a-8371-9cec69dcaa13",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9d61396f-3f57-42cd-b02f-be545b4d5baa",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:44:25.998213Z",
      "attachments": [
        {
          "file_id": "da7b1a06-7ce5-4f93-86cc-ce97fe07caf9",
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

`GET /api/rider/v1/support/cases/d80c3ce5-f7a8-4cb6-a35a-27217d713d1d` → **200**

```json
{
  "id": "d80c3ce5-f7a8-4cb6-a35a-27217d713d1d",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-30T08:44:24.206442Z",
  "updated_at": "2026-10-30T08:44:25.998622Z",
  "respond_by": "2026-10-30T12:44:24.206442Z",
  "messages": [
    {
      "id": "5da84ac7-4253-4bb0-8eec-b11437af47ab",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "f6ce9faa-9825-43db-8ed8-0ff92ffe7f37",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-30T08:44:24.207112Z",
      "attachments": [
        {
          "file_id": "1447e2ee-c3fd-416a-8371-9cec69dcaa13",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9d61396f-3f57-42cd-b02f-be545b4d5baa",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-30T08:44:25.998213Z",
      "attachments": [
        {
          "file_id": "da7b1a06-7ce5-4f93-86cc-ce97fe07caf9",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/d80c3ce5-f7a8-4cb6-a35a-27217d713d1d/attachments/da7b1a06-7ce5-4f93-86cc-ce97fe07caf9` → **200**

Done: support case d80c3ce5-f7a8-4cb6-a35a-27217d713d1d, rider attachment 1447e2ee-c3fd-416a-8371-9cec69dcaa13, operator attachment da7b1a06-7ce5-4f93-86cc-ce97fe07caf9.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735489962",
  "device_ref": "sandbox-4031"
}
```

```json
{
  "challenge_id": "ba8d1614-14b1-408f-9aa8-612d85dc2b98",
  "expires_at": "2026-10-30T08:49:26.50723439Z",
  "resend_available_at": "2026-10-30T08:44:27.50723439Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735489962` → **200**

```json
{
  "phone": "+380735489962",
  "audience": "CLIENT",
  "code": "785399",
  "sent_at": "2026-10-30T08:44:26.509611401Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ba8d1614-14b1-408f-9aa8-612d85dc2b98",
  "code": "785399",
  "device_ref": "sandbox-4031"
}
```

```json
{
  "session_id": "02120fe2-3b34-4959-9bf0-2475c673fd2c",
  "subject": {
    "type": "CLIENT",
    "id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzM5ZmUxZC1mYzc4LTQ3NGItODU5MS1lODBjYTRhNWExNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzY2LCJpYXQiOjE3OTMzNDk4NjYsImp0aSI6IjFkN2I0YzA3LWMzOWEtNDhkYi05OTE5LWM0MGFhZDMwMTAzZiIsInNpZCI6IjAyMTIwZmUyLTNiMzQtNDk1OS05YmYwLTI0NzVjNjczZmQyYyJ9._w_O56xupdEbP3PfsjfiQw7bh1mdddZg4iwQrlz9OpM",
  "access_expires_at": "2026-10-30T08:59:26.762005243Z",
  "refresh_token": "gttDt9XsvoYzQmimOUI_5ss1EfoddZlUQMUTU_av1Do",
  "refresh_expires_at": "2026-11-29T08:44:26.761577409Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0aa4bd10-02a3-446d-84fa-c6b627bd9472",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8a85f6f1-129f-4fd4-a216-115b5b39f5e3",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8a85f6f1-129f-4fd4-a216-115b5b39f5e3",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "58a6a6141456030e1a881d5b7d71e84d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8a85f6f1-129f-4fd4-a216-115b5b39f5e3",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735489962"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8a85f6f1-129f-4fd4-a216-115b5b39f5e3",
  "expires_at": "2026-10-30T09:14:26.988467Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/8a85f6f1-129f-4fd4-a216-115b5b39f5e3` → **200**

```json
{
  "id": "8a85f6f1-129f-4fd4-a216-115b5b39f5e3",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-30T09:14:26.988467Z",
  "card": {
    "id": "27eedf5e-325f-41d9-bf9d-57e9299b66f4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1193",
    "card_type": "Visa",
    "created_at": "2026-10-30T08:44:27.225408Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8f1eb786-7315-46da-b6b7-65e18839a37e",
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
  "id": "cf28d276-856e-47d1-bdb2-78aa812dc073",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:27.491525Z",
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
  "command_id": "106ad9a9-ef00-4e6b-a04d-8656b5920549",
  "quote_id": "cf28d276-856e-47d1-bdb2-78aa812dc073",
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
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93` → **200**

```json
{
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93` → **200**

```json
{
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
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

`GET /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93` → **200**

```json
{
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93/switch-to-cash` → **200**

```json
{
  "command_id": "274b583a-c3ae-47eb-acee-a4741e6198bf",
  "expected_version": 3
}
```

```json
{
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93/switch-to-cash` → **409**

```json
{
  "command_id": "2822120c-42d8-44db-b994-eb26654514b4",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a272bf07-fda3-4fd2-8702-8fc5715d9b34"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93` → **200**

```json
{
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3ef54f1d-330d-45b0-9e50-32523b0bed93/cancel` → **200**

```json
{
  "command_id": "30e0b32b-9dcb-4601-a6c2-1ebf1ff202dc",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3ef54f1d-330d-45b0-9e50-32523b0bed93",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "bc39fe1d-fc78-474b-8591-e80ca4a5a14c",
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
  "created_at": "2026-10-30T08:44:27.74188Z",
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
  "session_id": "ced8514d-780a-483b-813d-3c54bb42f2fb",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NzAsImlhdCI6MTc5MzM0OTg3MCwianRpIjoiN2MyMGI5ZmItMDAwNC00OTgzLWIxOGUtMjA0ZDUzNzczYTg5Iiwic2lkIjoiY2VkODUxNGQtNzgwYS00ODNiLTgxM2QtM2M1NGJiNDJmMmZiIn0.1DD5fsyE4cZoMVt-3_8GPn_hgGEIlu2zNLk2qFr4O9I",
  "access_expires_at": "2026-10-30T08:59:30.94628249Z",
  "refresh_token": "rj3MyGaq2K93u0UHBrTA12tuD9wvbTIUn01aTxDs6Oo",
  "refresh_expires_at": "2026-10-30T20:44:30.945744583Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12405"
}
```

```json
{
  "challenge_id": "b63d3615-e1bc-48b2-8d87-b6fa45146d75",
  "expires_at": "2026-10-30T08:49:31.167480925Z",
  "resend_available_at": "2026-10-30T08:44:32.167480925Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "939865",
  "sent_at": "2026-10-30T08:44:31.16992802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b63d3615-e1bc-48b2-8d87-b6fa45146d75",
  "code": "939865",
  "device_ref": "sandbox-12405"
}
```

```json
{
  "session_id": "e831b3f1-32a0-40c6-8d96-17f953546978",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc3MSwiaWF0IjoxNzkzMzQ5ODcxLCJqdGkiOiI1MTQ3ZWZlMS1iODlkLTQ4MTctYThhOS0zMjcwYjViNDg1OWEiLCJzaWQiOiJlODMxYjNmMS0zMmEwLTQwYzYtOGQ5Ni0xN2Y5NTM1NDY5NzgifQ.6Aqy3HJOO_MiR6epKzW_s_BBXcmutD_KyoMOtOA7e9M",
  "access_expires_at": "2026-10-30T08:59:31.486392717Z",
  "refresh_token": "h1oq-C1uYWWpgEVLhGR2qorexA7BXF-Gm3aF4a_kh5I",
  "refresh_expires_at": "2026-11-29T08:44:31.485936752Z",
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
      "actor_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-30T08:44:17.03032Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "reason": "Sandbox clean-up",
      "at": "2026-10-30T08:44:18.319392Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "a436963b-645b-454a-bafb-a4c9a3baf1be",
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
  "device_ref": "sandbox-26136"
}
```

```json
{
  "challenge_id": "c6fc83a9-7fe9-49e0-84c8-53af31130e96",
  "expires_at": "2026-10-30T08:49:32.482403155Z",
  "resend_available_at": "2026-10-30T08:44:33.482403155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "763838",
  "sent_at": "2026-10-30T08:44:32.484732004Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6fc83a9-7fe9-49e0-84c8-53af31130e96",
  "code": "763838",
  "device_ref": "sandbox-26136"
}
```

```json
{
  "session_id": "79dd6929-1d98-4d71-8d6c-199c3cb8fc0d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc3MiwiaWF0IjoxNzkzMzQ5ODcyLCJqdGkiOiJlM2IzNjBiZi0yNmY3LTRlYWEtYWEzNS0wNDAyNGZjYzI2NzgiLCJzaWQiOiI3OWRkNjkyOS0xZDk4LTRkNzEtOGQ2Yy0xOTljM2NiOGZjMGQifQ.TQUsGj9kNIYR0jC9CHIWlaR-TU9KwedpOhM4-Gh_-Ps",
  "access_expires_at": "2026-10-30T08:59:32.741382178Z",
  "refresh_token": "v-MZsQwi65x1IvY3yqX3FRuI3bErDKUUppSmINI2ng4",
  "refresh_expires_at": "2026-11-29T08:44:32.740876109Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:43:59.441796Z",
  "last_location_at": "2026-10-30T08:43:59.441796Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2/handover` → **200**

```json
{
  "command_id": "bdb54511-f5ae-4afa-a328-1dcb03b3d207",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:43:59.441796Z",
  "last_location_at": "2026-10-30T08:43:59.441796Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:33Z",
    "sequence": 1793349873442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:44:33.458669Z",
  "last_location_at": "2026-10-30T08:44:33.458669Z",
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
  "command_id": "eb72f66a-caf9-46ed-bdd7-1f8b4fba4691",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:33Z",
    "sequence": 1793349873916
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "da93ded4-9ef3-403e-9545-cd56f50f46a1",
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
  "last_heartbeat_at": "2026-10-30T08:44:33.932929Z",
  "last_location_at": "2026-10-30T08:44:33.932929Z",
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
  "session_id": "47c7926d-b71f-4ae4-9e59-7142f4b6df2d",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA3NzQsImlhdCI6MTc5MzM0OTg3NCwianRpIjoiODZmNGRjYzgtZmM4OC00OWI4LWJjMDgtNmZkZDY2ZWY2ZTU3Iiwic2lkIjoiNDdjNzkyNmQtYjcxZi00YWU0LTllNTktNzE0MmY0YjZkZjJkIn0.o7uP_MzNZLSNiKRCdaF_1epCE8p9ho8oiPZND3yBPqo",
  "access_expires_at": "2026-10-30T08:59:34.439020012Z",
  "refresh_token": "jN3-nKqgppnHcBlXU8ws3whm3h-YNIb6GdATJ6VBteM",
  "refresh_expires_at": "2026-10-30T20:44:34.438401156Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2b702e2c-df1a-493b-945d-31b24fc9349a",
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
  "id": "cb28f56b-696a-431f-bc68-5c0167a582ca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:34.670235Z",
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
  "command_id": "0e681c67-132c-4139-a45d-d0f66b2781f5",
  "quote_id": "cb28f56b-696a-431f-bc68-5c0167a582ca",
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
  "id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
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
  "created_at": "2026-10-30T08:44:35.03666Z",
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
    "id": "4f496945-9005-4928-884c-d44f6557c2e1",
    "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
    "expires_at": "2026-10-30T08:44:50.039502Z",
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

`POST /api/driver/v1/offers/4f496945-9005-4928-884c-d44f6557c2e1/accept` → **200**

```json
{
  "command_id": "4a31cdc5-ee0a-4c70-83cf-69046db69576"
}
```

```json
{
  "id": "f3ac2cc3-d72f-4eaf-abd2-67024aeccb3b",
  "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "251bcb31-f8ab-4a10-80bf-26ab169308a7",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "251bcb31-f8ab-4a10-80bf-26ab169308a7",
  "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
  "assignment_id": "f3ac2cc3-d72f-4eaf-abd2-67024aeccb3b",
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

`POST /api/driver/v1/work-sessions/da93ded4-9ef3-403e-9545-cd56f50f46a1/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-30T08:44:36Z",
    "sequence": 1793349876217
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "da93ded4-9ef3-403e-9545-cd56f50f46a1",
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
  "last_heartbeat_at": "2026-10-30T08:44:36.234068Z",
  "last_location_at": "2026-10-30T08:44:36.234068Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/251bcb31-f8ab-4a10-80bf-26ab169308a7/arrive` → **200**

```json
{
  "command_id": "c0d0a0b2-2f1c-402c-8772-311cfd244d84",
  "expected_version": 0
}
```

```json
{
  "id": "251bcb31-f8ab-4a10-80bf-26ab169308a7",
  "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
  "assignment_id": "f3ac2cc3-d72f-4eaf-abd2-67024aeccb3b",
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
  "arrived_at": "2026-10-30T08:44:36.480266Z",
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

`POST /api/driver/v1/trips/251bcb31-f8ab-4a10-80bf-26ab169308a7/start` → **200**

```json
{
  "command_id": "82e749c7-b7ca-4ed6-a183-a8fbad5b89c7",
  "expected_version": 1
}
```

```json
{
  "id": "251bcb31-f8ab-4a10-80bf-26ab169308a7",
  "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
  "assignment_id": "f3ac2cc3-d72f-4eaf-abd2-67024aeccb3b",
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
  "arrived_at": "2026-10-30T08:44:36.480266Z",
  "started_at": "2026-10-30T08:44:36.739556Z",
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

`POST /api/driver/v1/trips/251bcb31-f8ab-4a10-80bf-26ab169308a7/complete` → **200**

```json
{
  "command_id": "5c7363a5-58c6-44a0-af41-642354906cb5",
  "expected_version": 2,
  "reported_at": "2026-10-30T08:44:36Z",
  "cash_received": true
}
```

```json
{
  "id": "251bcb31-f8ab-4a10-80bf-26ab169308a7",
  "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
  "assignment_id": "f3ac2cc3-d72f-4eaf-abd2-67024aeccb3b",
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
  "arrived_at": "2026-10-30T08:44:36.480266Z",
  "started_at": "2026-10-30T08:44:36.739556Z",
  "completed_at": "2026-10-30T08:44:36.999751Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844` → **200**

```json
{
  "id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
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
    "id": "f3ac2cc3-d72f-4eaf-abd2-67024aeccb3b",
    "order_id": "7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "251bcb31-f8ab-4a10-80bf-26ab169308a7",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-30T08:44:35.03666Z",
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
  "session_id": "f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2",
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
  "last_heartbeat_at": "2026-10-30T08:44:33.458669Z",
  "last_location_at": "2026-10-30T08:44:33.458669Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f03e2e2d-3fa7-44f2-9a28-16d976f3d6d2/close` → **200**

```json
{
  "command_id": "15e8b7c2-33df-493d-89b9-dc3751d35d77",
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
  "session_id": "da93ded4-9ef3-403e-9545-cd56f50f46a1",
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
  "last_heartbeat_at": "2026-10-30T08:44:36.234068Z",
  "last_location_at": "2026-10-30T08:44:36.234068Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/da93ded4-9ef3-403e-9545-cd56f50f46a1/close` → **200**

```json
{
  "command_id": "f5ff78d3-543f-4059-ac77-b9cf4d9c9589",
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

Done: terminal order 7c6c3a3a-8ce6-4c62-9d7e-aea53a27d844 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29809"
}
```

```json
{
  "challenge_id": "fcd75007-2928-46d4-8f6c-c70b375d5d99",
  "expires_at": "2026-10-30T08:49:41.644994298Z",
  "resend_available_at": "2026-10-30T08:44:42.644994298Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "160434",
  "sent_at": "2026-10-30T08:44:41.647088079Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fcd75007-2928-46d4-8f6c-c70b375d5d99",
  "code": "160434",
  "device_ref": "sandbox-29809"
}
```

```json
{
  "session_id": "7ddedec6-0edb-4ad9-990b-9885a65fe77d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc4MSwiaWF0IjoxNzkzMzQ5ODgxLCJqdGkiOiIwNThhZjAwZi1hYWM1LTRmOTMtYTlkNS0zODUwZGRkNGRjNjgiLCJzaWQiOiI3ZGRlZGVjNi0wZWRiLTRhZDktOTkwYi05ODg1YTY1ZmU3N2QifQ.LeKjrlOyfLHtS1NVAyYi7Zcro67dTAbNQqkv84qVZ-A",
  "access_expires_at": "2026-10-30T08:59:41.897413433Z",
  "refresh_token": "BTkpt8UxVZCzc9ORtyWc6f8mCRTCgjg6wRaWWzHnQJM",
  "refresh_expires_at": "2026-11-29T08:44:41.896972019Z",
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
  "device_ref": "sandbox-13348"
}
```

```json
{
  "challenge_id": "61df4ca3-4b31-4030-9107-9e744dd125f6",
  "expires_at": "2026-10-30T08:49:42.346630016Z",
  "resend_available_at": "2026-10-30T08:44:43.346630016Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "842320",
  "sent_at": "2026-10-30T08:44:42.348930514Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "61df4ca3-4b31-4030-9107-9e744dd125f6",
  "code": "842320",
  "device_ref": "sandbox-13348"
}
```

```json
{
  "session_id": "7fb94756-6578-4d1c-a78a-07828b3e6015",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc4MiwiaWF0IjoxNzkzMzQ5ODgyLCJqdGkiOiI2ZDI5MDU2Ni01NTM3LTQ4ZGEtODg2Mi0xMzZjNGNlNzU1NTIiLCJzaWQiOiI3ZmI5NDc1Ni02NTc4LTRkMWMtYTc4YS0wNzgyOGIzZTYwMTUifQ.AiK2itbLpgoQUdJWKexryurIv3S4f9iVFLDPlOAESDw",
  "access_expires_at": "2026-10-30T08:59:42.603418172Z",
  "refresh_token": "PlWnK8a_OGDE_ovyUD87KNCpO1F28qWKCtB5R-tznoc",
  "refresh_expires_at": "2026-11-29T08:44:42.602931792Z",
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
  "device_ref": "sandbox-31729"
}
```

```json
{
  "challenge_id": "6aa293f2-42f2-4050-b2b4-a3fbea5824e6",
  "expires_at": "2026-10-30T08:49:43.1990557Z",
  "resend_available_at": "2026-10-30T08:44:44.1990557Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "176763",
  "sent_at": "2026-10-30T08:44:43.201072327Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6aa293f2-42f2-4050-b2b4-a3fbea5824e6",
  "code": "176763",
  "device_ref": "sandbox-31729"
}
```

```json
{
  "session_id": "2db7f2a5-b744-48b3-b384-97639f579a25",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzM1MDc4MywiaWF0IjoxNzkzMzQ5ODgzLCJqdGkiOiJjNmM0Y2NkMy01NTU2LTQwZDAtYjViZi1lZmE4OGFiYTE5ZWIiLCJzaWQiOiIyZGI3ZjJhNS1iNzQ0LTQ4YjMtYjM4NC05NzYzOWY1NzlhMjUifQ.MlDq9E-DTsk2z_i6h8XgNAnzk6U6M_Uc7MKnj6XWA7c",
  "access_expires_at": "2026-10-30T08:59:43.45995879Z",
  "refresh_token": "uuyV3WFkyMO4lYT58c_4VTmFtb499_JaLg4dhVMjdpk",
  "refresh_expires_at": "2026-11-29T08:44:43.459458069Z",
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
  "phone": "+380693746662",
  "device_ref": "sandbox-14195"
}
```

```json
{
  "challenge_id": "0832b1cb-9727-4503-97eb-c877598fc4f0",
  "expires_at": "2026-10-30T08:49:43.915353375Z",
  "resend_available_at": "2026-10-30T08:44:44.915353375Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693746662` → **200**

```json
{
  "phone": "+380693746662",
  "audience": "CLIENT",
  "code": "251943",
  "sent_at": "2026-10-30T08:44:43.917312437Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0832b1cb-9727-4503-97eb-c877598fc4f0",
  "code": "251943",
  "device_ref": "sandbox-14195"
}
```

```json
{
  "session_id": "1c033bd5-d6c8-45bc-9c48-dd98a12d383b",
  "subject": {
    "type": "CLIENT",
    "id": "6c9ae241-8acd-46f9-a29b-a231e230af52"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2YzlhZTI0MS04YWNkLTQ2ZjktYTI5Yi1hMjMxZTIzMGFmNTIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMzUwNzg0LCJpYXQiOjE3OTMzNDk4ODQsImp0aSI6IjE3N2IwYTllLTY0MGMtNDMzYy05MzEyLWU2OGNhYmJjOWMzOSIsInNpZCI6IjFjMDMzYmQ1LWQ2YzgtNDViYy05YzQ4LWRkOThhMTJkMzgzYiJ9.qZobOYqMu5OkcXgeWKT2svSJXIJ9tGcP6aS1ETtHDD8",
  "access_expires_at": "2026-10-30T08:59:44.295097198Z",
  "refresh_token": "sCh6N8qWP3uyR9b0B-H2BsuDfSvGru3fhZWLdmCGAM4",
  "refresh_expires_at": "2026-11-29T08:44:44.294640742Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "14eb3ab0-1ebb-48e1-b39f-08736fcbc2dc",
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
  "id": "12d18033-9aa9-48f3-80fe-2c1c973d4328",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-30T08:49:44.541661Z",
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
  "command_id": "9d7a9f71-93e4-488e-9a32-0b01762d7377",
  "quote_id": "12d18033-9aa9-48f3-80fe-2c1c973d4328",
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
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.664441626
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.141225917
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

`GET /api/rider/v1/orders/aa0a6f62-920e-4c32-99fa-38f63f891680` → **200**

```json
{
  "id": "aa0a6f62-920e-4c32-99fa-38f63f891680",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6c9ae241-8acd-46f9-a29b-a231e230af52",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-30T08:44:44.782706Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

# Scenario: zz-reconciliation

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
  "session_id": "0815fa00-68fb-455e-bd2e-be77c7098826",
  "subject": {
    "type": "STAFF",
    "id": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiNzhjZjBkNS05MmNkLTRiODktYTBiNy1hMGFjODU0NTg4ZmMiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMzNTA5NjksImlhdCI6MTc5MzM1MDA2OSwianRpIjoiNjgwYzMxN2UtNThiNS00OTBmLWI1YWQtYjI2Y2MzY2FjMGIwIiwic2lkIjoiMDgxNWZhMDAtNjhmYi00NTVlLWJkMmUtYmU3N2M3MDk4ODI2In0.wS3ezrkgkeGm6972OzG8aHSS5kbtpZNc4kI6mdaFBT4",
  "access_expires_at": "2026-10-30T09:02:49.498378857Z",
  "refresh_token": "ekT6UBRaAE9fpjsM6muhmi5V9sadR3Ev5Ilm4wlnpqY",
  "refresh_expires_at": "2026-10-30T20:47:49.497930143Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "719d740f-ecfa-4a81-985e-d9eec729b8d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:49.738214Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:49.738293Z",
  "updated_at": "2026-10-30T08:47:49.843915Z",
  "finished_at": "2026-10-30T08:47:49.843915Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/719d740f-ecfa-4a81-985e-d9eec729b8d3` → **200**

```json
{
  "run": {
    "id": "719d740f-ecfa-4a81-985e-d9eec729b8d3",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:47:49.738214Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:47:49.738293Z",
    "updated_at": "2026-10-30T08:47:49.843915Z",
    "finished_at": "2026-10-30T08:47:49.843915Z",
    "version": 1
  },
  "items": [],
  "next": null
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "719d740f-ecfa-4a81-985e-d9eec729b8d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:49.738214Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:49.738293Z",
  "updated_at": "2026-10-30T08:47:49.843915Z",
  "finished_at": "2026-10-30T08:47:49.843915Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30"
}
```

```json
{
  "id": "719d740f-ecfa-4a81-985e-d9eec729b8d3",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:49.738214Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:49.738293Z",
  "updated_at": "2026-10-30T08:47:49.843915Z",
  "finished_at": "2026-10-30T08:47:49.843915Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/7dfb6583-b01b-4420-94f4-b3a862fe4e57` → **204**

```json
{
  "amount_minor": 100,
  "currency": "PLN"
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:50.230799Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:50.230862Z",
  "updated_at": "2026-10-30T08:47:50.237033Z",
  "finished_at": "2026-10-30T08:47:50.237033Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/4faf95cb-8497-457a-ac7c-ce1d27c13057` → **200**

```json
{
  "run": {
    "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:47:50.230799Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:47:50.230862Z",
    "updated_at": "2026-10-30T08:47:50.237033Z",
    "finished_at": "2026-10-30T08:47:50.237033Z",
    "version": 1
  },
  "items": [
    {
      "id": "10b42150-7121-4d17-bbe5-0dddbf4cc844",
      "run_id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "1e8e7ac0c91fc49056c0e732e6052276dfc559e202b8168cf2c9d714c9f0c893",
      "reference_display": "sandbox-reconciliation-7dfb6583-b01b-4420-94f4-b3a862fe4e57",
      "local_operation_id": null,
      "local_record_id": null,
      "local_type": null,
      "local_state": null,
      "local_amount_minor": null,
      "local_currency": null,
      "provider_type": "PURCHASE",
      "provider_state": "CAPTURED",
      "provider_status": "Approved",
      "provider_amount_minor": 100,
      "provider_currency": "PLN",
      "fee_minor": null,
      "provider_at": "2026-10-30T08:47:50Z",
      "state": "OPEN",
      "decision": null,
      "reason": null,
      "resolved_by": null,
      "resolved_at": null,
      "version": 0
    }
  ],
  "next": null
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:50.230799Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:50.230862Z",
  "updated_at": "2026-10-30T08:47:50.237033Z",
  "finished_at": "2026-10-30T08:47:50.237033Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:50.230799Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:50.230862Z",
  "updated_at": "2026-10-30T08:47:50.237033Z",
  "finished_at": "2026-10-30T08:47:50.237033Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/10b42150-7121-4d17-bbe5-0dddbf4cc844/resolve` → **200**

```json
{
  "command_id": "972fb63f-2211-4f4d-ab74-50fd6c312e2c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "10b42150-7121-4d17-bbe5-0dddbf4cc844",
  "run_id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "1e8e7ac0c91fc49056c0e732e6052276dfc559e202b8168cf2c9d714c9f0c893",
  "reference_display": "sandbox-reconciliation-7dfb6583-b01b-4420-94f4-b3a862fe4e57",
  "local_operation_id": null,
  "local_record_id": null,
  "local_type": null,
  "local_state": null,
  "local_amount_minor": null,
  "local_currency": null,
  "provider_type": "PURCHASE",
  "provider_state": "CAPTURED",
  "provider_status": "Approved",
  "provider_amount_minor": 100,
  "provider_currency": "PLN",
  "fee_minor": null,
  "provider_at": "2026-10-30T08:47:50Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "resolved_at": "2026-10-30T08:47:50.661293Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/10b42150-7121-4d17-bbe5-0dddbf4cc844/resolve` → **200**

```json
{
  "command_id": "972fb63f-2211-4f4d-ab74-50fd6c312e2c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "10b42150-7121-4d17-bbe5-0dddbf4cc844",
  "run_id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "1e8e7ac0c91fc49056c0e732e6052276dfc559e202b8168cf2c9d714c9f0c893",
  "reference_display": "sandbox-reconciliation-7dfb6583-b01b-4420-94f4-b3a862fe4e57",
  "local_operation_id": null,
  "local_record_id": null,
  "local_type": null,
  "local_state": null,
  "local_amount_minor": null,
  "local_currency": null,
  "provider_type": "PURCHASE",
  "provider_state": "CAPTURED",
  "provider_status": "Approved",
  "provider_amount_minor": 100,
  "provider_currency": "PLN",
  "fee_minor": null,
  "provider_at": "2026-10-30T08:47:50Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
  "resolved_at": "2026-10-30T08:47:50.661293Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/10b42150-7121-4d17-bbe5-0dddbf4cc844/resolve` → **409**

```json
{
  "command_id": "32cf8516-bcf3-4136-bcad-90a8d90897f4",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/10b42150-7121-4d17-bbe5-0dddbf4cc844/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "05c505da-2d23-4d49-9c39-af01bf271438"
}
```

`GET /api/admin/v1/payment-reconciliations/4faf95cb-8497-457a-ac7c-ce1d27c13057` → **200**

```json
{
  "run": {
    "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-30",
    "period_from": "2026-10-29T22:00:00Z",
    "period_to": "2026-10-31T02:00:00Z",
    "observed_until": "2026-10-30T08:47:50.230799Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-30T08:47:50.230862Z",
    "updated_at": "2026-10-30T08:47:50.661293Z",
    "finished_at": "2026-10-30T08:47:50.237033Z",
    "version": 2
  },
  "items": [
    {
      "id": "10b42150-7121-4d17-bbe5-0dddbf4cc844",
      "run_id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "1e8e7ac0c91fc49056c0e732e6052276dfc559e202b8168cf2c9d714c9f0c893",
      "reference_display": "sandbox-reconciliation-7dfb6583-b01b-4420-94f4-b3a862fe4e57",
      "local_operation_id": null,
      "local_record_id": null,
      "local_type": null,
      "local_state": null,
      "local_amount_minor": null,
      "local_currency": null,
      "provider_type": "PURCHASE",
      "provider_state": "CAPTURED",
      "provider_status": "Approved",
      "provider_amount_minor": 100,
      "provider_currency": "PLN",
      "fee_minor": null,
      "provider_at": "2026-10-30T08:47:50Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "b78cf0d5-92cd-4b89-a0b7-a0ac854588fc",
      "resolved_at": "2026-10-30T08:47:50.661293Z",
      "version": 1
    }
  ],
  "next": null
}
```

`GET /api/admin/v1/payment-reconciliations?merchant_id=5a000000-0000-4000-8000-000000000602&limit=100` → **200**

```json
{
  "runs": [
    {
      "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-30",
      "period_from": "2026-10-29T22:00:00Z",
      "period_to": "2026-10-31T02:00:00Z",
      "observed_until": "2026-10-30T08:47:50.230799Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:47:50.230862Z",
      "updated_at": "2026-10-30T08:47:50.661293Z",
      "finished_at": "2026-10-30T08:47:50.237033Z",
      "version": 2
    },
    {
      "id": "a1fe8277-e322-4326-8bc7-f48560bf2b76",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-30T08:40:33.3208Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-30T08:40:33.320918Z",
      "updated_at": "2026-10-30T08:40:33.327823Z",
      "finished_at": "2026-10-30T08:40:33.327823Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/7dfb6583-b01b-4420-94f4-b3a862fe4e57` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30"
}
```

```json
{
  "id": "4faf95cb-8497-457a-ac7c-ce1d27c13057",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-30",
  "period_from": "2026-10-29T22:00:00Z",
  "period_to": "2026-10-31T02:00:00Z",
  "observed_until": "2026-10-30T08:47:50.230799Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-30T08:47:50.230862Z",
  "updated_at": "2026-10-30T08:47:50.661293Z",
  "finished_at": "2026-10-30T08:47:50.237033Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793350193467E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793350193682E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793350193682E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793350193468E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793350193683E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
