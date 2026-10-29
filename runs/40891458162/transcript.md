# Sandbox transcript (2026-10-29T14:27:19Z, 454613b)

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
  "correlation_id": "84bf929c-6435-40e1-b597-32f97aedd06f"
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
  "session_id": "de7d3090-1295-430f-a3d4-6b9b5374de2f",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NDUsImlhdCI6MTc5MzI4NDA0NSwianRpIjoiODc1ZWNlNmMtOTJmYi00OWZlLWFmNDUtNTZhMDNiZDE5YzI5Iiwic2lkIjoiZGU3ZDMwOTAtMTI5NS00MzBmLWEzZDQtNmI5YjUzNzRkZTJmIn0.VYCavKY1HOsaKhHi0B8L3g2UUJsrpfpnbRmb3sVSVeg",
  "access_expires_at": "2026-10-29T14:42:25.601686744Z",
  "refresh_token": "toSGdfARC5Fe02B6jRfvOyrlg7nF24Q4n03vx_GXAXY",
  "refresh_expires_at": "2026-10-30T02:27:25.599692249Z",
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
  "session_id": "e6fbfea8-d979-4737-9465-1ba3b22d9d6b",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NDYsImlhdCI6MTc5MzI4NDA0NiwianRpIjoiODI0MTY2YzAtYWQ4Yi00Y2UyLWExYzctODgzNTk4MGM1MWE4Iiwic2lkIjoiZTZmYmZlYTgtZDk3OS00NzM3LTk0NjUtMWJhM2IyMmQ5ZDZiIn0.EZ0ocx02A75t_wX4AZd_fuHjRpBuK10Il8rp_AGgQGA",
  "access_expires_at": "2026-10-29T14:42:26.986534733Z",
  "refresh_token": "tUYvdhjVzkbKpaZcnCSGdr3v53hv6IFxOJ0vJEgCPKE",
  "refresh_expires_at": "2026-10-30T02:27:26.985759005Z",
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
  "device_ref": "sandbox-27774"
}
```

```json
{
  "challenge_id": "e8b5bd43-1f02-4114-b86e-7e874f8ecd9b",
  "expires_at": "2026-10-29T14:32:27.48582889Z",
  "resend_available_at": "2026-10-29T14:27:28.48582889Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "141371",
  "sent_at": "2026-10-29T14:27:27.495697559Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e8b5bd43-1f02-4114-b86e-7e874f8ecd9b",
  "code": "141371",
  "device_ref": "sandbox-27774"
}
```

```json
{
  "session_id": "56716dcb-26d9-4325-948b-9de89c043a4a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk0NywiaWF0IjoxNzkzMjg0MDQ3LCJqdGkiOiJhZjg3NGJiNC1jNTg5LTQyYzQtOWE1Yy0zZmVlNTQ2Mjg4N2IiLCJzaWQiOiI1NjcxNmRjYi0yNmQ5LTQzMjUtOTQ4Yi05ZGU4OWMwNDNhNGEifQ.DSG4KRyynHSKUWtDt6ZgSKwqzop2Lm1QBa8n55uco8g",
  "access_expires_at": "2026-10-29T14:42:27.814242642Z",
  "refresh_token": "EUGSuWirw74CC8EjQqS5RRJb9UtiQRC_SEb3vk6m_XI",
  "refresh_expires_at": "2026-11-28T14:27:27.813435195Z",
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
  "command_id": "af108eb4-1097-4a3f-b59d-2db908192e9a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:28Z",
    "sequence": 1793284048278
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "159d3470-4e82-4a9d-9834-fc89440a781a",
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
  "last_heartbeat_at": "2026-10-29T14:27:28.610257Z",
  "last_location_at": "2026-10-29T14:27:28.610257Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635352683",
  "device_ref": "sandbox-24359"
}
```

```json
{
  "challenge_id": "7e04b60c-de86-4a0c-ba04-90e34f8d911b",
  "expires_at": "2026-10-29T14:32:28.847560346Z",
  "resend_available_at": "2026-10-29T14:27:29.847560346Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635352683` → **200**

```json
{
  "phone": "+380635352683",
  "audience": "CLIENT",
  "code": "346495",
  "sent_at": "2026-10-29T14:27:28.851092663Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e04b60c-de86-4a0c-ba04-90e34f8d911b",
  "code": "346495",
  "device_ref": "sandbox-24359"
}
```

```json
{
  "session_id": "ac1d5b5d-9ef9-4978-af8d-738a1071ee47",
  "subject": {
    "type": "CLIENT",
    "id": "10fa08ef-def5-44b6-ab35-10608c8ee226"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMGZhMDhlZi1kZWY1LTQ0YjYtYWIzNS0xMDYwOGM4ZWUyMjYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTQ5LCJpYXQiOjE3OTMyODQwNDksImp0aSI6IjEwOThjZTBhLWZhYzUtNDY2NS04OWQ2LTc4YzM4MGNiMzdmNSIsInNpZCI6ImFjMWQ1YjVkLTllZjktNDk3OC1hZjhkLTczOGExMDcxZWU0NyJ9.EP4vUoPzlWXa0RQvetmvGsgr_LnWtBaLefepgGaA64Q",
  "access_expires_at": "2026-10-29T14:42:29.102609728Z",
  "refresh_token": "LlCccQofBJ-5Ei4NNebb1mwegnTjEwFqSAPMVuRuBxM",
  "refresh_expires_at": "2026-11-28T14:27:29.101908807Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "b68820b5-7862-4db2-8767-133a5621ce32",
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
  "id": "abbee475-b327-4272-82ec-19ed56b189cc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:29.365960Z",
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
  "command_id": "31a5d9d9-07fa-4750-8d2f-0f0a3ea6df1b",
  "quote_id": "abbee475-b327-4272-82ec-19ed56b189cc",
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
  "id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "10fa08ef-def5-44b6-ab35-10608c8ee226",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:27:29.683435Z",
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
    "id": "caf51d5b-2409-41a0-b8fd-460b3bd7fbfc",
    "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
    "expires_at": "2026-10-29T14:27:44.694144Z",
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

`POST /api/driver/v1/offers/caf51d5b-2409-41a0-b8fd-460b3bd7fbfc/accept` → **200**

```json
{
  "command_id": "57f48e96-78e7-40fc-9a9e-42f4d908a700"
}
```

```json
{
  "id": "cd3a4c18-9a78-43e6-b479-e851de98bf3c",
  "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "36bd5910-d377-4b9d-b9ba-3852d00f6ce3",
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
  "command_id": "1040803e-efaa-41e1-b130-04f8ddb9a68a",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:27:30.726089721Z"
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
  "id": "36bd5910-d377-4b9d-b9ba-3852d00f6ce3",
  "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
  "assignment_id": "cd3a4c18-9a78-43e6-b479-e851de98bf3c",
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

`POST /api/driver/v1/work-sessions/159d3470-4e82-4a9d-9834-fc89440a781a/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:31Z",
    "sequence": 1793284051495
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "159d3470-4e82-4a9d-9834-fc89440a781a",
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
  "last_heartbeat_at": "2026-10-29T14:27:31.51851Z",
  "last_location_at": "2026-10-29T14:27:31.51851Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/36bd5910-d377-4b9d-b9ba-3852d00f6ce3/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "393449bd-b1db-47ad-a477-f8fdbf22357a",
  "expected_version": 0
}
```

```json
{
  "id": "36bd5910-d377-4b9d-b9ba-3852d00f6ce3",
  "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
  "assignment_id": "cd3a4c18-9a78-43e6-b479-e851de98bf3c",
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
  "arrived_at": "2026-10-29T14:27:31.77494Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36bd5910-d377-4b9d-b9ba-3852d00f6ce3/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "9e2db34d-535a-4eb4-84ed-064ad31dc7a7",
  "expected_version": 1
}
```

```json
{
  "id": "36bd5910-d377-4b9d-b9ba-3852d00f6ce3",
  "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
  "assignment_id": "cd3a4c18-9a78-43e6-b479-e851de98bf3c",
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
  "arrived_at": "2026-10-29T14:27:31.77494Z",
  "started_at": "2026-10-29T14:27:32.02555Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/36bd5910-d377-4b9d-b9ba-3852d00f6ce3/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "99f38f6f-ff6e-434b-86ba-dc4a2904c1ba",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:27:32Z",
  "cash_received": true
}
```

```json
{
  "id": "36bd5910-d377-4b9d-b9ba-3852d00f6ce3",
  "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
  "assignment_id": "cd3a4c18-9a78-43e6-b479-e851de98bf3c",
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
  "arrived_at": "2026-10-29T14:27:31.77494Z",
  "started_at": "2026-10-29T14:27:32.02555Z",
  "completed_at": "2026-10-29T14:27:32.287494Z",
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
  "session_id": "159d3470-4e82-4a9d-9834-fc89440a781a",
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
  "last_heartbeat_at": "2026-10-29T14:27:31.51851Z",
  "last_location_at": "2026-10-29T14:27:31.51851Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/159d3470-4e82-4a9d-9834-fc89440a781a/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "fafd9a5b-d91a-496a-a592-4e3637f497d8",
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
  "command_id": "327bb3af-fc90-4550-9222-4f897932c344",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:33Z",
    "sequence": 1793284053275
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
  "correlation_id": "92445026-02db-4b9d-a770-aad75e55e29a",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "c5d283e8-6604-433b-86d6-73b35ba12928",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:33Z",
    "sequence": 1793284053276
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c39467e4-a90a-4d0b-a2c8-b13377b19386",
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
  "last_heartbeat_at": "2026-10-29T14:27:33.293783Z",
  "last_location_at": "2026-10-29T14:27:33.293783Z",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T14:27:30.72609Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "7f2d738c-8d7d-45be-b898-ccde3039cce4",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:27:33.78542958Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c39467e4-a90a-4d0b-a2c8-b13377b19386",
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
  "last_heartbeat_at": "2026-10-29T14:27:33.293783Z",
  "last_location_at": "2026-10-29T14:27:33.293783Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c39467e4-a90a-4d0b-a2c8-b13377b19386/close` → **200**

```json
{
  "command_id": "5ea475ef-f88a-437f-a9e0-1c4071a25e0f",
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
  "session_id": "4a09a82c-b703-4d72-abb1-0154b0afa9a2",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NTQsImlhdCI6MTc5MzI4NDA1NCwianRpIjoiNGM1YWUxNjctMzg5YS00MzNiLTkzYmUtOTM3NzY4NjFmMTljIiwic2lkIjoiNGEwOWE4MmMtYjcwMy00ZDcyLWFiYjEtMDE1NGIwYWZhOWEyIn0.YAckh7XJxII1_hrxVTBBMI18tc-j3h5slha6gdTUFYI",
  "access_expires_at": "2026-10-29T14:42:34.888475475Z",
  "refresh_token": "i-H1cuTu7RUWqGbQ-oa5kRjMwNyNiByWBP80llIRBFQ",
  "refresh_expires_at": "2026-10-30T02:27:34.887777314Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "eb0f8432-df59-42df-91bd-e4a79e490f66",
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
  "id": "02855aee-ab6b-434d-ab72-76d3dc4f233e",
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
  "created_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "created_at": "2026-10-29T14:27:35.124671Z",
  "updated_at": "2026-10-29T14:27:35.124671Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635517332",
  "device_ref": "sandbox-18498"
}
```

```json
{
  "challenge_id": "449e5467-62f4-4dc5-959c-c1e585faf722",
  "expires_at": "2026-10-29T14:32:35.371335927Z",
  "resend_available_at": "2026-10-29T14:27:36.371335927Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635517332` → **200**

```json
{
  "phone": "+380635517332",
  "audience": "CLIENT",
  "code": "095515",
  "sent_at": "2026-10-29T14:27:35.375235621Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "449e5467-62f4-4dc5-959c-c1e585faf722",
  "code": "095515",
  "device_ref": "sandbox-18498"
}
```

```json
{
  "session_id": "7e834d97-6b06-4a70-bc1f-3e0df3f4d297",
  "subject": {
    "type": "CLIENT",
    "id": "9a72f314-78c2-4bb3-97fd-5899057ee0ae"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5YTcyZjMxNC03OGMyLTRiYjMtOTdmZC01ODk5MDU3ZWUwYWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTU1LCJpYXQiOjE3OTMyODQwNTUsImp0aSI6IjQ4YzAwM2M1LTM5YzUtNDU0OC04NzdjLTBhNDBmNTJkYzM5NCIsInNpZCI6IjdlODM0ZDk3LTZiMDYtNGE3MC1iYzFmLTNlMGRmM2Y0ZDI5NyJ9.9Bk3Q6simsoU3AocAne4t2CZrqzL54ZOCOmPFTa7ikk",
  "access_expires_at": "2026-10-29T14:42:35.637589726Z",
  "refresh_token": "CjBex35uz6_78GRSQHGdRYayHZiZaWSSobAOsq_aHME",
  "refresh_expires_at": "2026-11-28T14:27:35.636989807Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380635517332` → **200**

```json
{
  "client_id": "9a72f314-78c2-4bb3-97fd-5899057ee0ae"
}
```

`POST /api/admin/v1/rider-wallets/9a72f314-78c2-4bb3-97fd-5899057ee0ae/top-ups` → **201**

```json
{
  "command_id": "cc11d040-c8f0-425e-a815-e94f0befdf20",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "9a72f314-78c2-4bb3-97fd-5899057ee0ae",
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
      "id": "91b8911f-0c5f-46c3-bf91-c7c1ce987b1f",
      "at": "2026-10-29T14:27:36.09934Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ac2e4ba1-d4cc-4990-8081-8ac150a2924a",
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
  "id": "d5083550-6c0b-49a0-a38f-483254afac21",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:36.363011Z",
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
      "id": "02855aee-ab6b-434d-ab72-76d3dc4f233e",
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
  "device_ref": "sandbox-18629"
}
```

```json
{
  "challenge_id": "f10a813e-33ec-4a88-9967-6b2b97c74280",
  "expires_at": "2026-10-29T14:32:36.610814657Z",
  "resend_available_at": "2026-10-29T14:27:37.610814657Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "503350",
  "sent_at": "2026-10-29T14:27:36.615756712Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f10a813e-33ec-4a88-9967-6b2b97c74280",
  "code": "503350",
  "device_ref": "sandbox-18629"
}
```

```json
{
  "session_id": "39ab57fa-419b-420a-99d5-f9dfd80c8225",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk1NiwiaWF0IjoxNzkzMjg0MDU2LCJqdGkiOiJlMTkzZDUzMy1mZGZjLTRmMDYtYmFkNi05NWE4NDgyNDlkZjMiLCJzaWQiOiIzOWFiNTdmYS00MTliLTQyMGEtOTlkNS1mOWRmZDgwYzgyMjUifQ.NIbe_B8EgtWx2tJLiKBIZozkssidn2-uF8eqMapieTc",
  "access_expires_at": "2026-10-29T14:42:36.864202611Z",
  "refresh_token": "TIuJZxV5eh6FYitU2GbWlVtr3aMW-hjvpUhFP0DLJ_U",
  "refresh_expires_at": "2026-11-28T14:27:36.863646063Z",
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
  "command_id": "903a069a-1e63-4334-84aa-1e1b39aac919",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:37Z",
    "sequence": 1793284057409
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90099083-7cd7-46c0-818d-19b97e49bf55",
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
  "last_heartbeat_at": "2026-10-29T14:27:37.429025Z",
  "last_location_at": "2026-10-29T14:27:37.429025Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "c31637f1-f01e-4688-90ab-56b972e0a0bb",
  "quote_id": "d5083550-6c0b-49a0-a38f-483254afac21",
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
  "id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9a72f314-78c2-4bb3-97fd-5899057ee0ae",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:27:37.675954Z",
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
  "client_id": "9a72f314-78c2-4bb3-97fd-5899057ee0ae",
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
      "id": "91b8911f-0c5f-46c3-bf91-c7c1ce987b1f",
      "at": "2026-10-29T14:27:36.09934Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
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
    "id": "14a3cf40-0860-43b2-bb97-cf4ebf78e257",
    "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
    "expires_at": "2026-10-29T14:27:52.682671Z",
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

`POST /api/driver/v1/offers/14a3cf40-0860-43b2-bb97-cf4ebf78e257/accept` → **200**

```json
{
  "command_id": "ad76db4b-0cde-4be1-8461-4c0fd3c60956"
}
```

```json
{
  "id": "29579c9a-f8fa-4a62-a5b4-112de395eb66",
  "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "9db6e5ec-9beb-40da-b40f-c7cb4dc31f61",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "9db6e5ec-9beb-40da-b40f-c7cb4dc31f61",
  "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
  "assignment_id": "29579c9a-f8fa-4a62-a5b4-112de395eb66",
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

`POST /api/driver/v1/work-sessions/90099083-7cd7-46c0-818d-19b97e49bf55/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:38Z",
    "sequence": 1793284058843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90099083-7cd7-46c0-818d-19b97e49bf55",
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
  "last_heartbeat_at": "2026-10-29T14:27:38.95883Z",
  "last_location_at": "2026-10-29T14:27:38.95883Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/9db6e5ec-9beb-40da-b40f-c7cb4dc31f61/arrive` → **200**

```json
{
  "command_id": "fdbe67f6-bc23-4d39-ba50-9fe7800bccea",
  "expected_version": 0
}
```

```json
{
  "id": "9db6e5ec-9beb-40da-b40f-c7cb4dc31f61",
  "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
  "assignment_id": "29579c9a-f8fa-4a62-a5b4-112de395eb66",
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
  "arrived_at": "2026-10-29T14:27:39.411503Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/9db6e5ec-9beb-40da-b40f-c7cb4dc31f61/start` → **200**

```json
{
  "command_id": "299cc943-75b9-4db0-835e-94df2a0a07ff",
  "expected_version": 1
}
```

```json
{
  "id": "9db6e5ec-9beb-40da-b40f-c7cb4dc31f61",
  "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
  "assignment_id": "29579c9a-f8fa-4a62-a5b4-112de395eb66",
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
  "arrived_at": "2026-10-29T14:27:39.411503Z",
  "started_at": "2026-10-29T14:27:39.663852Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/9db6e5ec-9beb-40da-b40f-c7cb4dc31f61/complete` → **200**

```json
{
  "command_id": "81d66caa-58e4-43dc-87d9-d487d516f46e",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:27:39Z",
  "cash_received": true
}
```

```json
{
  "id": "9db6e5ec-9beb-40da-b40f-c7cb4dc31f61",
  "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
  "assignment_id": "29579c9a-f8fa-4a62-a5b4-112de395eb66",
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
  "arrived_at": "2026-10-29T14:27:39.411503Z",
  "started_at": "2026-10-29T14:27:39.663852Z",
  "completed_at": "2026-10-29T14:27:39.933741Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "9a72f314-78c2-4bb3-97fd-5899057ee0ae",
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
      "id": "3c4e9a2b-4e39-43b6-92dd-a93a42e2d298",
      "at": "2026-10-29T14:27:40.194274Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2"
    },
    {
      "id": "91b8911f-0c5f-46c3-bf91-c7c1ce987b1f",
      "at": "2026-10-29T14:27:36.09934Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/02855aee-ab6b-434d-ab72-76d3dc4f233e/archive` → **200**

```json
{
  "command_id": "6b6e9d39-f7ef-454c-bc46-dad029f5be21",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "02855aee-ab6b-434d-ab72-76d3dc4f233e",
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
  "created_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "created_at": "2026-10-29T14:27:35.124671Z",
  "updated_at": "2026-10-29T14:27:43.427229Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "90099083-7cd7-46c0-818d-19b97e49bf55",
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
  "last_heartbeat_at": "2026-10-29T14:27:38.95883Z",
  "last_location_at": "2026-10-29T14:27:38.95883Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/90099083-7cd7-46c0-818d-19b97e49bf55/close` → **200**

```json
{
  "command_id": "982b78f3-af80-4310-9a28-26f861a228de",
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

Done: order 27325a07-6361-4f4c-bf77-68a1623f9aa2.

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
  "session_id": "7d95f98f-cb8d-44b5-8340-45d022c16a62",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NjQsImlhdCI6MTc5MzI4NDA2NCwianRpIjoiMTcwYTZiMjEtMGYwZS00OTgxLTljYTEtMTQyNzE4YTQzOTc4Iiwic2lkIjoiN2Q5NWY5OGYtY2I4ZC00NGI1LTgzNDAtNDVkMDIyYzE2YTYyIn0.izUmJps0cv5Ht2wIRfdf185wQBBL5wgc0wUG_FXaoM4",
  "access_expires_at": "2026-10-29T14:42:44.406573001Z",
  "refresh_token": "t5GW1h27xm2UAjekepbF-97dWnyANMIthV8_HzJmNwU",
  "refresh_expires_at": "2026-10-30T02:27:44.405947398Z",
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
  "command_id": "239e3b01-9649-4e94-9f1d-f391a6c8373d",
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
  "session_id": "2881cc60-7bb2-44cc-96e7-a244ae6d1874",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NjUsImlhdCI6MTc5MzI4NDA2NSwianRpIjoiNGQ4ZDExNzYtMDNkNy00OWZhLWIzM2UtMTZhMTMyMGE3NjU3Iiwic2lkIjoiMjg4MWNjNjAtN2JiMi00NGNjLTk2ZTctYTI0NGFlNmQxODc0In0.-NwvP3tMJRve8-viIYIOfa50yLxWRsNo773FSbbKdho",
  "access_expires_at": "2026-10-29T14:42:45.387281872Z",
  "refresh_token": "qjsHpTGNgZO5bwhdn0f2AA5VXjWe6giW7HS6pIequms",
  "refresh_expires_at": "2026-10-30T02:27:45.386683211Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2887814156",
    "linkedid": "1730052700.2887814156",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673663221"
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
    "id": "1730052700.2887814156",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "d3248e3f-6a3b-44c0-94f1-b676f8337f58",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380673663221",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:27:45.635566Z",
      "answered_at": null,
      "ended_at": "2026-10-29T14:27:45.659424Z",
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
    "id": "1730052600.1570417745",
    "linkedid": "1730052600.1570417745",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673663221"
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
      "id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673663221",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:27:45.925731Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3/answer` → **200**

```json
{
  "command_id": "450fbefe-2898-4998-992e-99f7544557ea"
}
```

```json
{
  "id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673663221",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "order_ids": [],
  "started_at": "2026-10-29T14:27:45.925731Z",
  "answered_at": "2026-10-29T14:27:46.185175Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1570417745",
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
    "id": "1730052600.1570417745",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673663221",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:45.925731Z",
      "answered_at": "2026-10-29T14:27:46.185175Z",
      "ended_at": "2026-10-29T14:27:46.451632Z",
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
      "id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673663221",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:45.925731Z",
      "answered_at": "2026-10-29T14:27:46.185175Z",
      "ended_at": "2026-10-29T14:27:46.451632Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:27:48.540492Z"
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
      "id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673663221",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:45.925731Z",
      "answered_at": "2026-10-29T14:27:46.185175Z",
      "ended_at": "2026-10-29T14:27:46.451632Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:27:48.540492Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3` → **200**

```json
{
  "changes": [
    {
      "id": "68921313-4e0b-427d-8d98-0b581472bb26",
      "occurred_at": "2026-10-29T14:27:49.295291Z",
      "actor_type": "STAFF",
      "actor_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"387ad659-e1c9-4ebc-a067-6283fcebd3a3\", \"order_ids\": []}",
      "correlation_id": "33db0eb8-9315-48ec-ab1a-d4c42a71c0ba"
    },
    {
      "id": "3fde8be4-96ba-4800-be72-4513ac3a1539",
      "occurred_at": "2026-10-29T14:27:49.264881Z",
      "actor_type": "STAFF",
      "actor_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"387ad659-e1c9-4ebc-a067-6283fcebd3a3\", \"order_ids\": []}",
      "correlation_id": "7edde3ef-8980-4b05-8537-ddf42d1c1ebf"
    }
  ]
}
```

Done: call fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29834"
}
```

```json
{
  "challenge_id": "4dc512b4-868a-47e7-b201-aa0b98686197",
  "expires_at": "2026-10-29T14:32:49.576799766Z",
  "resend_available_at": "2026-10-29T14:27:50.576799766Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "909791",
  "sent_at": "2026-10-29T14:27:49.580660152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4dc512b4-868a-47e7-b201-aa0b98686197",
  "code": "909791",
  "device_ref": "sandbox-29834"
}
```

```json
{
  "session_id": "93f9a20d-1858-447a-8ce3-2e654bb1aea0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk2OSwiaWF0IjoxNzkzMjg0MDY5LCJqdGkiOiIwYjEwMzBkMy01YmQ3LTQ2MjQtODVjYy1jNzMxZTM3ZGEyZTIiLCJzaWQiOiI5M2Y5YTIwZC0xODU4LTQ0N2EtOGNlMy0yZTY1NGJiMWFlYTAifQ.4DLpLj61oYGJ-sAR3h3KLnAOggP97FHoUvNlX1FSJ98",
  "access_expires_at": "2026-10-29T14:42:49.83704418Z",
  "refresh_token": "p-OmE24jBkKUrysyQ0M8OwRHxEmlL9HU_W9HL0DZOLQ",
  "refresh_expires_at": "2026-11-28T14:27:49.836405813Z",
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
  "command_id": "351f8577-d9e1-4b4f-853a-588bc089efd9",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:50Z",
    "sequence": 1793284070343
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0fd5a48b-5ec1-4c9a-83d8-fd7c1f6c1829",
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
  "last_heartbeat_at": "2026-10-29T14:27:50.363534Z",
  "last_location_at": "2026-10-29T14:27:50.363534Z",
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
  "session_id": "d6ac61c8-82e6-4a15-b865-2a9c7474d9df",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NzAsImlhdCI6MTc5MzI4NDA3MCwianRpIjoiZDg1YzBhZWQtNGZmMC00MzcxLThiNjEtZjNkYWZiZDdhOTRmIiwic2lkIjoiZDZhYzYxYzgtODJlNi00YTE1LWI4NjUtMmE5Yzc0NzRkOWRmIn0.G7vQJ3CU23ud10sV2cURfNRoxpiwiXln4OoE7u3dNSs",
  "access_expires_at": "2026-10-29T14:42:50.869008306Z",
  "refresh_token": "u8tB-fcD_SUQhJpm1l54r44Ywmi3ETbhVsngPUw5nDY",
  "refresh_expires_at": "2026-10-30T02:27:50.868396244Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "4970c8fc-a1ad-47bb-b910-0bfa1ea85caf",
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
  "id": "9001da3b-7937-4927-82ec-cc56bb4bf8a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:51.109194Z",
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
  "command_id": "ac96d549-76d7-493c-b48f-853972e1a38f",
  "quote_id": "9001da3b-7937-4927-82ec-cc56bb4bf8a0",
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
    "phone": "+380674619368"
  }
}
```

```json
{
  "id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
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
  "created_at": "2026-10-29T14:27:51.424836Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674619368"
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
    "id": "9df15b54-4acc-4aad-902e-587f0fbcd0c0",
    "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
    "expires_at": "2026-10-29T14:28:06.429882Z",
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

`POST /api/driver/v1/offers/9df15b54-4acc-4aad-902e-587f0fbcd0c0/accept` → **200**

```json
{
  "command_id": "174b2751-11ec-407c-9703-9ed8b5423fc4"
}
```

```json
{
  "id": "d9916d30-4d41-470a-a669-4966b7332a9b",
  "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "081d76c8-325e-4772-8605-2d2e7077bc44",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "081d76c8-325e-4772-8605-2d2e7077bc44",
  "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
  "assignment_id": "d9916d30-4d41-470a-a669-4966b7332a9b",
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
    "phone": "+380674619368"
  }
}
```

`POST /api/driver/v1/work-sessions/0fd5a48b-5ec1-4c9a-83d8-fd7c1f6c1829/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:27:53Z",
    "sequence": 1793284073553
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0fd5a48b-5ec1-4c9a-83d8-fd7c1f6c1829",
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
  "last_heartbeat_at": "2026-10-29T14:27:53.57221Z",
  "last_location_at": "2026-10-29T14:27:53.57221Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/081d76c8-325e-4772-8605-2d2e7077bc44/arrive` → **200**

```json
{
  "command_id": "2d48c830-4ceb-4c2b-a42c-efe5c1fa76db",
  "expected_version": 0
}
```

```json
{
  "id": "081d76c8-325e-4772-8605-2d2e7077bc44",
  "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
  "assignment_id": "d9916d30-4d41-470a-a669-4966b7332a9b",
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
  "arrived_at": "2026-10-29T14:27:53.812923Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674619368"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  },
  {
    "phone": "+380674619368",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:54.661962836Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  },
  {
    "phone": "+380674619368",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:54.661962836Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674619368` → **200**

```json
[
  {
    "phone": "+380674619368",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:52.655548571Z"
  },
  {
    "phone": "+380674619368",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T14:27:54.661962836Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/081d76c8-325e-4772-8605-2d2e7077bc44/start` → **200**

```json
{
  "command_id": "8f710f32-76f3-45ad-b723-fcd7da0f3c2e",
  "expected_version": 1
}
```

```json
{
  "id": "081d76c8-325e-4772-8605-2d2e7077bc44",
  "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
  "assignment_id": "d9916d30-4d41-470a-a669-4966b7332a9b",
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
  "arrived_at": "2026-10-29T14:27:53.812923Z",
  "started_at": "2026-10-29T14:27:55.144996Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674619368"
  }
}
```

`POST /api/driver/v1/trips/081d76c8-325e-4772-8605-2d2e7077bc44/complete` → **200**

```json
{
  "command_id": "dc599d20-56eb-4b03-aa5f-2674b5da48a7",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:27:55Z",
  "cash_received": true
}
```

```json
{
  "id": "081d76c8-325e-4772-8605-2d2e7077bc44",
  "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
  "assignment_id": "d9916d30-4d41-470a-a669-4966b7332a9b",
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
  "arrived_at": "2026-10-29T14:27:53.812923Z",
  "started_at": "2026-10-29T14:27:55.144996Z",
  "completed_at": "2026-10-29T14:27:55.39278Z",
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
  "session_id": "0fd5a48b-5ec1-4c9a-83d8-fd7c1f6c1829",
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
  "last_heartbeat_at": "2026-10-29T14:27:53.57221Z",
  "last_location_at": "2026-10-29T14:27:53.57221Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0fd5a48b-5ec1-4c9a-83d8-fd7c1f6c1829/close` → **200**

```json
{
  "command_id": "9c19bcf7-c41c-4155-a1d8-28621316d2d9",
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
  "phone": "+380633893578",
  "device_ref": "sandbox-16910"
}
```

```json
{
  "challenge_id": "1e4400d5-73ea-4444-8b27-cf579e38e6f1",
  "expires_at": "2026-10-29T14:32:56.119791469Z",
  "resend_available_at": "2026-10-29T14:27:57.119791469Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633893578` → **200**

```json
{
  "phone": "+380633893578",
  "audience": "CLIENT",
  "code": "497141",
  "sent_at": "2026-10-29T14:27:56.148889528Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e4400d5-73ea-4444-8b27-cf579e38e6f1",
  "code": "497141",
  "device_ref": "sandbox-16910"
}
```

```json
{
  "session_id": "2dd3b434-1512-45f8-a7b4-cc13b8e7b012",
  "subject": {
    "type": "CLIENT",
    "id": "53f87319-c133-4563-9451-4a0d385e2d48"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1M2Y4NzMxOS1jMTMzLTQ1NjMtOTQ1MS00YTBkMzg1ZTJkNDgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTc2LCJpYXQiOjE3OTMyODQwNzYsImp0aSI6IjJjMjVhNjI5LTAxNjItNDM2Zi04NjFhLTM0ZjM4Mjk4YTNkMSIsInNpZCI6IjJkZDNiNDM0LTE1MTItNDVmOC1hN2I0LWNjMTNiOGU3YjAxMiJ9.pb9Q6lBvxvdzhiVlpv7UvzuglyYkYHothGtkiegxw_E",
  "access_expires_at": "2026-10-29T14:42:56.520538362Z",
  "refresh_token": "WV_Ds7jTryV6v3FxUzDPsL2QHHHrYsRPVXZHYH6j3rI",
  "refresh_expires_at": "2026-11-28T14:27:56.519115058Z",
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
  "device_ref": "sandbox-30315"
}
```

```json
{
  "challenge_id": "3af2e38d-3583-459a-a5ce-f8a80248ba66",
  "expires_at": "2026-10-29T14:32:56.975740197Z",
  "resend_available_at": "2026-10-29T14:27:57.975740197Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "729975",
  "sent_at": "2026-10-29T14:27:56.978782554Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3af2e38d-3583-459a-a5ce-f8a80248ba66",
  "code": "729975",
  "device_ref": "sandbox-30315"
}
```

```json
{
  "session_id": "c7cbabda-e1f3-4075-9779-ac4a9e203bf2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk3NywiaWF0IjoxNzkzMjg0MDc3LCJqdGkiOiIyZjAyNmU4ZS1hNTUwLTQ3YzItOTk3ZC1iYTUyNzU0NjFjMmMiLCJzaWQiOiJjN2NiYWJkYS1lMWYzLTQwNzUtOTc3OS1hYzRhOWUyMDNiZjIifQ.I3izbba_XAgSOFFZhJ7EIzqfbs-LfixI8-50v_IZUYA",
  "access_expires_at": "2026-10-29T14:42:57.227100905Z",
  "refresh_token": "AfoHLt2F87xO3nADud7P1tAln0Tw8wl5ogQDJ1gKh2U",
  "refresh_expires_at": "2026-11-28T14:27:57.226630436Z",
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
  "session_id": "ebdddd9c-cc79-48d3-9a22-204b6c7b4b2b",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NzcsImlhdCI6MTc5MzI4NDA3NywianRpIjoiMWUzZGVhY2UtMjQ3ZC00YTE5LTk1MGQtYjVjZjQyZTM3YjY5Iiwic2lkIjoiZWJkZGRkOWMtY2M3OS00OGQzLTlhMjItMjA0YjZjN2I0YjJiIn0.fMOmcGiu4XkH_xiFmzy6UR2uOCwSL4gW1TtORma-NLo",
  "access_expires_at": "2026-10-29T14:42:57.926202061Z",
  "refresh_token": "tSkn4AR1c1qJGpGcop7XXBT2XcjtT7Al1pxOBzXyXnA",
  "refresh_expires_at": "2026-10-30T02:27:57.925725984Z",
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
  "session_id": "87b2898f-a8f9-4d1a-a852-d5b45691db16",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5NzgsImlhdCI6MTc5MzI4NDA3OCwianRpIjoiNTlkN2MzYjEtM2YyNC00NWE4LWIyNjctNWE2N2Y1ZmY3ZGQzIiwic2lkIjoiODdiMjg5OGYtYThmOS00ZDFhLWE4NTItZDViNDU2OTFkYjE2In0.l95BcU-VGOfWrvv3zqiOqPM_0RmZvhISQyNdeu6_dbs",
  "access_expires_at": "2026-10-29T14:42:58.41006567Z",
  "refresh_token": "R3qrhTe9anPtLacpLkvpyQHcaXiWgG4ZNjp6xyXBccE",
  "refresh_expires_at": "2026-10-30T02:27:58.40952779Z",
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
  "command_id": "f05aa731-29ab-4662-806f-d5cbc6edb3d2",
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
  "id": "f95b2bd1-b48d-4d7c-bcaa-88de5e04785d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:32:58.867596Z",
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
  "command_id": "64ef15f9-420b-4d68-9cc0-f708075d808d",
  "quote_id": "f95b2bd1-b48d-4d7c-bcaa-88de5e04785d",
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
  "id": "3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53f87319-c133-4563-9451-4a0d385e2d48",
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
  "created_at": "2026-10-29T14:27:59.11482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f` → **200**

```json
{
  "id": "3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53f87319-c133-4563-9451-4a0d385e2d48",
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
  "created_at": "2026-10-29T14:27:59.11482Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f/cancel` → **200**

```json
{
  "command_id": "997e0832-40c0-4365-bf38-20399f2a919d",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "53f87319-c133-4563-9451-4a0d385e2d48",
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
  "created_at": "2026-10-29T14:27:59.11482Z",
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
  "command_id": "5e5b9934-83cf-4acf-9f18-a7e7d7f7ffc8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:00Z",
    "sequence": 1793284080802
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b86c370-5baa-4799-ab0d-3cc115df4924",
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
  "last_heartbeat_at": "2026-10-29T14:28:00.098382Z",
  "last_location_at": "2026-10-29T14:28:00.098382Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-12031"
}
```

```json
{
  "challenge_id": "31dc9ebf-285f-48fb-b71e-3e5b52a0e333",
  "expires_at": "2026-10-29T14:33:00.322271482Z",
  "resend_available_at": "2026-10-29T14:28:01.322271482Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "009257",
  "sent_at": "2026-10-29T14:28:00.32495278Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "31dc9ebf-285f-48fb-b71e-3e5b52a0e333",
  "code": "009257",
  "device_ref": "sandbox-12031"
}
```

```json
{
  "session_id": "f68e9ab7-dd38-4b74-9635-a19314861037",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk4MCwiaWF0IjoxNzkzMjg0MDgwLCJqdGkiOiI2MjUzNTE1Yi1lNTM4LTQyMjctOTlmNy0xZWE2YzU0NmIwZmEiLCJzaWQiOiJmNjhlOWFiNy1kZDM4LTRiNzQtOTYzNS1hMTkzMTQ4NjEwMzcifQ.z38vVIIOkGQatBn7PS0gapq0MsmM9bp7dTfyimSNCcw",
  "access_expires_at": "2026-10-29T14:43:00.574119954Z",
  "refresh_token": "infQWw6yDJvPYThkvXPjB2VCY7_HgjtabH-ZSqkcGXQ",
  "refresh_expires_at": "2026-11-28T14:28:00.573673792Z",
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
  "command_id": "42621da5-3a8b-414e-b39d-95adadd4449b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:01Z",
    "sequence": 1793284081210
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:01.039066Z",
  "last_location_at": "2026-10-29T14:28:01.039066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "61938ae8-4ef7-4a7c-8400-6550020eb70c",
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
  "id": "6a4c993d-348a-4f32-bd98-7dc0ad50af28",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:01.274582Z",
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
  "command_id": "84c64e17-04b4-4b05-9a55-353430347573",
  "quote_id": "6a4c993d-348a-4f32-bd98-7dc0ad50af28",
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
  "id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "53f87319-c133-4563-9451-4a0d385e2d48",
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
  "created_at": "2026-10-29T14:28:01.516675Z",
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
    "id": "c4af5be6-eb0d-483c-abb2-61bce42f27bb",
    "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
    "expires_at": "2026-10-29T14:28:16.520015Z",
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

`POST /api/driver/v1/offers/c4af5be6-eb0d-483c-abb2-61bce42f27bb/accept` → **200**

```json
{
  "command_id": "f1c6f26f-b2bf-41bb-950f-4471c838345a"
}
```

```json
{
  "id": "6f366ed1-e3db-4fae-9df6-ac0ef2a5bd8f",
  "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "524193c4-d223-4a62-b752-0bd59d667a28",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "524193c4-d223-4a62-b752-0bd59d667a28",
  "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "assignment_id": "6f366ed1-e3db-4fae-9df6-ac0ef2a5bd8f",
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

`POST /api/driver/v1/trips/524193c4-d223-4a62-b752-0bd59d667a28/cancel` → **200**

```json
{
  "command_id": "9a8fa11e-cde0-43bb-a901-445feed5cc13",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "524193c4-d223-4a62-b752-0bd59d667a28",
  "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "assignment_id": "6f366ed1-e3db-4fae-9df6-ac0ef2a5bd8f",
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

`GET /api/rider/v1/orders/4cb14531-5b33-4e1e-8aac-fb5b263b6774` → **200**

```json
{
  "id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "53f87319-c133-4563-9451-4a0d385e2d48",
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
    "id": "6f366ed1-e3db-4fae-9df6-ac0ef2a5bd8f",
    "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "524193c4-d223-4a62-b752-0bd59d667a28",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:28:01.516675Z",
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
    "id": "60429a6f-24e2-419b-8bcf-1575a0a96b03",
    "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
    "expires_at": "2026-10-29T14:28:17.467556Z",
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

`POST /api/driver/v1/offers/60429a6f-24e2-419b-8bcf-1575a0a96b03/accept` → **200**

```json
{
  "command_id": "ae174b5e-ec21-47f0-b048-fdc44866d674"
}
```

```json
{
  "id": "fcc60b7d-25dd-4730-b0e7-1f4f904aecf1",
  "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "74e7877c-64c1-405c-bce4-7b73e02548a5",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "74e7877c-64c1-405c-bce4-7b73e02548a5",
  "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "assignment_id": "fcc60b7d-25dd-4730-b0e7-1f4f904aecf1",
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

`POST /api/driver/v1/trips/74e7877c-64c1-405c-bce4-7b73e02548a5/cancel` → **200**

```json
{
  "command_id": "a324fdad-849b-458f-bda4-56d823ff0f9f",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "74e7877c-64c1-405c-bce4-7b73e02548a5",
  "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
  "assignment_id": "fcc60b7d-25dd-4730-b0e7-1f4f904aecf1",
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
    "id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:28:01.516675Z",
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
    "id": "3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:27:59.11482Z",
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

`GET /api/operator/v1/orders/4cb14531-5b33-4e1e-8aac-fb5b263b6774/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:28:01.517269Z",
      "actor": {
        "type": "CLIENT",
        "id": "53f87319-c133-4563-9451-4a0d385e2d48",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
        "quote_id": "6a4c993d-348a-4f32-bd98-7dc0ad50af28",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "6cb8c8c5-9026-4a70-b764-cf0d14e65700"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:28:01.519193Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
        "attempt_id": "224bc9b8-0714-4e4f-8db5-016df280aa49",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6cb8c8c5-9026-4a70-b764-cf0d14e65700"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:28:01.525346Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "c4af5be6-eb0d-483c-abb2-61bce42f27bb",
        "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "6cb8c8c5-9026-4a70-b764-cf0d14e65700"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:28:01.999667Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "c4af5be6-eb0d-483c-abb2-61bce42f27bb",
        "order_id": "4cb14531-5b33-4e1e-8aac-fb5b263b6774",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "6f366ed1-e3db-4fae-9df6-ac0ef2a5bd8f"
      },
      "correlation_id": "33c00698-7181-4a8d-9ef4-a992522986d0"
```

Done: orders 3b47fcac-ef02-4aa3-91f6-6a9a6fa6b50f, 4cb14531-5b33-4e1e-8aac-fb5b263b6774.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380732225947",
  "device_ref": "sandbox-18759"
}
```

```json
{
  "challenge_id": "988ae443-33bd-4123-8b2c-5eb14b00b65a",
  "expires_at": "2026-10-29T14:33:04.358640524Z",
  "resend_available_at": "2026-10-29T14:28:05.358640524Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732225947` → **200**

```json
{
  "phone": "+380732225947",
  "audience": "CLIENT",
  "code": "350055",
  "sent_at": "2026-10-29T14:28:04.361430081Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "988ae443-33bd-4123-8b2c-5eb14b00b65a",
  "code": "350055",
  "device_ref": "sandbox-18759"
}
```

```json
{
  "session_id": "8f5caefe-d614-4fe5-b8f5-4dc563198034",
  "subject": {
    "type": "CLIENT",
    "id": "21432512-96b0-4372-8395-f7f5127caef2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTQzMjUxMi05NmIwLTQzNzItODM5NS1mN2Y1MTI3Y2FlZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg0OTg0LCJpYXQiOjE3OTMyODQwODQsImp0aSI6IjdhNGViMGM1LWUzNTktNDY4Zi1hODEzLTBkNTM3OWIyNzYzMSIsInNpZCI6IjhmNWNhZWZlLWQ2MTQtNGZlNS1iOGY1LTRkYzU2MzE5ODAzNCJ9.ZpfXQ3JXOlqZZGLHogPluMNiMSa2MTLPJwuEdoOtyhU",
  "access_expires_at": "2026-10-29T14:43:04.607785545Z",
  "refresh_token": "dCdiHGzgAXX2ZfVoCEwW5Lt75NIkFVp5grHPXBLo7zI",
  "refresh_expires_at": "2026-11-28T14:28:04.607288221Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "eca3852a-c102-4044-8403-5a93fb3d397a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7e6e92ff-1bc9-4e6b-abb2-d7393e927fd7",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7e6e92ff-1bc9-4e6b-abb2-d7393e927fd7",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "b15559fd471ab1a9fc782d81135f30aa",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7e6e92ff-1bc9-4e6b-abb2-d7393e927fd7",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732225947"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7e6e92ff-1bc9-4e6b-abb2-d7393e927fd7",
  "expires_at": "2026-10-29T14:58:04.836504Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/7e6e92ff-1bc9-4e6b-abb2-d7393e927fd7` → **200**

```json
{
  "id": "7e6e92ff-1bc9-4e6b-abb2-d7393e927fd7",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T14:58:04.836504Z",
  "card": {
    "id": "a7f7cfe7-70b6-4126-96f6-e6ed6c826c9f",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****5662",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:28:05.073622Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "a7f7cfe7-70b6-4126-96f6-e6ed6c826c9f",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****5662",
      "card_type": "Visa",
      "created_at": "2026-10-29T14:28:05.073622Z"
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
  "device_ref": "sandbox-16280"
}
```

```json
{
  "challenge_id": "f3966d76-91ba-4298-8b22-b0b39f94c466",
  "expires_at": "2026-10-29T14:33:05.5484485Z",
  "resend_available_at": "2026-10-29T14:28:06.5484485Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "342526",
  "sent_at": "2026-10-29T14:28:05.560828032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f3966d76-91ba-4298-8b22-b0b39f94c466",
  "code": "342526",
  "device_ref": "sandbox-16280"
}
```

```json
{
  "session_id": "b05c5951-8946-44d9-8185-c265f03dc97b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NDk4NSwiaWF0IjoxNzkzMjg0MDg1LCJqdGkiOiJjNDI2MzRlMS01ZGEzLTRhM2MtYTUxMC02MWExYTQ5YjAwODQiLCJzaWQiOiJiMDVjNTk1MS04OTQ2LTQ0ZDktODE4NS1jMjY1ZjAzZGM5N2IifQ.E4Akcs6EHwx7ZYsKdKUwS_3aM5P8rez7CH1DvN8GmVM",
  "access_expires_at": "2026-10-29T14:43:05.884925862Z",
  "refresh_token": "GX0DQ3OVf_JasCFwtG6PMvKc33JrzGAaBAlJ3yLkEog",
  "refresh_expires_at": "2026-11-28T14:28:05.884279398Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:01.039066Z",
  "last_location_at": "2026-10-29T14:28:01.039066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/938e8782-63a3-4fc9-9ff4-eb15818a8b79/handover` → **200**

```json
{
  "command_id": "e26bf3d8-903b-462b-8268-0952e98dd3f7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:01.039066Z",
  "last_location_at": "2026-10-29T14:28:01.039066Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/938e8782-63a3-4fc9-9ff4-eb15818a8b79/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:06Z",
    "sequence": 1793284086563
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:06.580203Z",
  "last_location_at": "2026-10-29T14:28:06.580203Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "27110b57-6a4f-49c2-b866-a7830ad90096",
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
  "id": "6cbc0eb2-1104-4f6c-87b5-17d4ccf27ccb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:06.838180Z",
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
  "command_id": "0af36547-f66a-4402-a879-7cb0372288f2",
  "quote_id": "6cbc0eb2-1104-4f6c-87b5-17d4ccf27ccb",
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
  "id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
  "created_at": "2026-10-29T14:28:07.101524Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6` → **200**

```json
{
  "id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
  "created_at": "2026-10-29T14:28:07.101524Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6` → **200**

```json
{
  "id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
  "created_at": "2026-10-29T14:28:07.101524Z",
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
    "id": "c491435b-7715-4b6a-a9f2-ca0d85a9fb27",
    "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
    "expires_at": "2026-10-29T14:28:22.639642Z",
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

`POST /api/driver/v1/offers/c491435b-7715-4b6a-a9f2-ca0d85a9fb27/accept` → **200**

```json
{
  "command_id": "359b105b-e49e-48eb-a32b-c7fe113438fa"
}
```

```json
{
  "id": "732ca55d-7951-4f93-8504-d34895950c49",
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "assignment_id": "732ca55d-7951-4f93-8504-d34895950c49",
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

`POST /api/driver/v1/work-sessions/938e8782-63a3-4fc9-9ff4-eb15818a8b79/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:09Z",
    "sequence": 1793284089481
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:09.498762Z",
  "last_location_at": "2026-10-29T14:28:09.498762Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7cdeb461-b094-4ad8-be7e-2c1060ea61ac/arrive` → **200**

```json
{
  "command_id": "0f0055fb-4a7e-4e92-b961-d2d556fc7e9f",
  "expected_version": 0
}
```

```json
{
  "id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "assignment_id": "732ca55d-7951-4f93-8504-d34895950c49",
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
  "arrived_at": "2026-10-29T14:28:09.735764Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7cdeb461-b094-4ad8-be7e-2c1060ea61ac/start` → **200**

```json
{
  "command_id": "91a4278c-20df-4960-b9f7-1358038b2c82",
  "expected_version": 1
}
```

```json
{
  "id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "assignment_id": "732ca55d-7951-4f93-8504-d34895950c49",
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
  "arrived_at": "2026-10-29T14:28:09.735764Z",
  "started_at": "2026-10-29T14:28:10.034437Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/7cdeb461-b094-4ad8-be7e-2c1060ea61ac/complete` → **200**

```json
{
  "command_id": "636edd94-e9aa-4f28-92b4-1f0511056062",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:10Z",
  "cash_received": true
}
```

```json
{
  "id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "assignment_id": "732ca55d-7951-4f93-8504-d34895950c49",
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
  "arrived_at": "2026-10-29T14:28:09.735764Z",
  "started_at": "2026-10-29T14:28:10.034437Z",
  "completed_at": "2026-10-29T14:28:10.355205Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6` → **200**

```json
{
  "id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
    "id": "732ca55d-7951-4f93-8504-d34895950c49",
    "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:07.101524Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6` → **200**

```json
{
  "id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
    "id": "732ca55d-7951-4f93-8504-d34895950c49",
    "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:07.101524Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6` → **200**

```json
{
  "id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
    "id": "732ca55d-7951-4f93-8504-d34895950c49",
    "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7cdeb461-b094-4ad8-be7e-2c1060ea61ac",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:07.101524Z",
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

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6/tip` → **200**

```json
{
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
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
  "available_until": "2026-10-30T14:28:10.355205Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6/tip` → **201**

```json
{
  "command_id": "be74bd7e-9678-45f5-8541-b46f42484b51",
  "amount_minor": 2500
}
```

```json
{
  "id": "c94e32a9-a727-4b48-910d-2a16fb7c14d4",
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:28:13.851252Z"
}
```

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6/tip` → **200**

```json
{
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
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
  "available_until": "2026-10-30T14:28:10.355205Z",
  "open": false,
  "tip": {
    "id": "c94e32a9-a727-4b48-910d-2a16fb7c14d4",
    "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:13.851252Z"
  }
}
```

`GET /api/rider/v1/orders/a2081abd-08ff-409e-b7b3-9b8385f550b6/tip` → **200**

```json
{
  "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
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
  "available_until": "2026-10-30T14:28:10.355205Z",
  "open": false,
  "tip": {
    "id": "c94e32a9-a727-4b48-910d-2a16fb7c14d4",
    "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:13.851252Z"
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
      "id": "4aa474c5-bc15-420a-8e1b-d5c26fee217d",
      "at": "2026-10-29T14:28:10.679015Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
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
      "id": "52254f77-36c0-4a60-92ac-38cf9e13608c",
      "at": "2026-10-29T14:28:15.759854Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
      "counterpart_id": null
    },
    {
      "id": "4aa474c5-bc15-420a-8e1b-d5c26fee217d",
      "at": "2026-10-29T14:28:10.679015Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "51ac1bb9-04bd-4201-b5a5-30a98ff858b2",
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
  "id": "e08b990a-104e-48c3-bbab-efcc27bc0fb1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:16.996837Z",
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
  "session_id": "7fd0390e-cbef-4520-bedf-048a22b36c47",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODQ5OTcsImlhdCI6MTc5MzI4NDA5NywianRpIjoiYWYyZGIxNjEtZWU0MS00Njk4LWFjOTItNDJkNmQ3ZjJlZDcwIiwic2lkIjoiN2ZkMDM5MGUtY2JlZi00NTIwLWJlZGYtMDQ4YTIyYjM2YzQ3In0.t2qBy8PAuqg5K9D2ArW5gms3-NT3h97Xi5qMu3GU7Yc",
  "access_expires_at": "2026-10-29T14:43:17.502368857Z",
  "refresh_token": "38iTOxw2W5OWug4hQIAUUXh6sB7lBA20GSWY19hdzos",
  "refresh_expires_at": "2026-10-30T02:28:17.50196556Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380732225947` → **200**

```json
{
  "client_id": "21432512-96b0-4372-8395-f7f5127caef2"
}
```

`POST /api/admin/v1/rider-wallets/21432512-96b0-4372-8395-f7f5127caef2/top-ups` → **201**

```json
{
  "command_id": "646a8b91-a856-4228-adcf-8a5aae1fda33",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
      "id": "829e42b5-d8b3-40c6-b083-5198f8cf3cc7",
      "at": "2026-10-29T14:28:17.940823Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "8fb5d711-3a6f-41f0-b111-383158df4ccc",
  "quote_id": "e08b990a-104e-48c3-bbab-efcc27bc0fb1",
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
  "id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
  "created_at": "2026-10-29T14:28:18.177802Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1421eb65-c0f1-40db-9cdc-50742c3a1007` → **200**

```json
{
  "id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
  "created_at": "2026-10-29T14:28:18.177802Z",
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
    "id": "d1a09ddd-7198-498b-b491-e4c4c8a3d398",
    "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
    "expires_at": "2026-10-29T14:28:33.181735Z",
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

`POST /api/driver/v1/offers/d1a09ddd-7198-498b-b491-e4c4c8a3d398/accept` → **200**

```json
{
  "command_id": "d5c70f0c-826a-4295-9c1e-bdd7f94f920a"
}
```

```json
{
  "id": "0bfd6f26-fab5-41a2-9e8a-13a982c6a49b",
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "0edf1761-6df3-4e32-85a0-67cb0b406b70",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "0edf1761-6df3-4e32-85a0-67cb0b406b70",
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "assignment_id": "0bfd6f26-fab5-41a2-9e8a-13a982c6a49b",
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

`POST /api/driver/v1/work-sessions/938e8782-63a3-4fc9-9ff4-eb15818a8b79/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:19Z",
    "sequence": 1793284099334
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:19.352142Z",
  "last_location_at": "2026-10-29T14:28:19.352142Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/0edf1761-6df3-4e32-85a0-67cb0b406b70/arrive` → **200**

```json
{
  "command_id": "e869fe96-cc0e-49d3-9b31-df83295f0620",
  "expected_version": 0
}
```

```json
{
  "id": "0edf1761-6df3-4e32-85a0-67cb0b406b70",
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "assignment_id": "0bfd6f26-fab5-41a2-9e8a-13a982c6a49b",
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
  "arrived_at": "2026-10-29T14:28:19.587598Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0edf1761-6df3-4e32-85a0-67cb0b406b70/start` → **200**

```json
{
  "command_id": "fcd55395-1a23-400b-8cf4-5a22c98f63dd",
  "expected_version": 1
}
```

```json
{
  "id": "0edf1761-6df3-4e32-85a0-67cb0b406b70",
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "assignment_id": "0bfd6f26-fab5-41a2-9e8a-13a982c6a49b",
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
  "arrived_at": "2026-10-29T14:28:19.587598Z",
  "started_at": "2026-10-29T14:28:19.822029Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/0edf1761-6df3-4e32-85a0-67cb0b406b70/complete` → **200**

```json
{
  "command_id": "8c2760cb-d028-4310-a469-066325a8799c",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:20Z",
  "cash_received": true
}
```

```json
{
  "id": "0edf1761-6df3-4e32-85a0-67cb0b406b70",
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "assignment_id": "0bfd6f26-fab5-41a2-9e8a-13a982c6a49b",
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
  "arrived_at": "2026-10-29T14:28:19.587598Z",
  "started_at": "2026-10-29T14:28:19.822029Z",
  "completed_at": "2026-10-29T14:28:20.063592Z",
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
  "client_id": "21432512-96b0-4372-8395-f7f5127caef2",
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
      "id": "829e42b5-d8b3-40c6-b083-5198f8cf3cc7",
      "at": "2026-10-29T14:28:17.940823Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
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

`GET /api/rider/v1/orders/1421eb65-c0f1-40db-9cdc-50742c3a1007/tip` → **200**

```json
{
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
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
  "available_until": "2026-10-30T14:28:20.063592Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1421eb65-c0f1-40db-9cdc-50742c3a1007/tip` → **201**

```json
{
  "command_id": "944f857d-85d6-451f-9885-090468287322",
  "amount_minor": 2500
}
```

```json
{
  "id": "a1a53471-2b38-4b6f-8892-61d661fe28bb",
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T14:28:21.033416Z"
}
```

`GET /api/rider/v1/orders/1421eb65-c0f1-40db-9cdc-50742c3a1007/tip` → **200**

```json
{
  "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
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
  "available_until": "2026-10-30T14:28:20.063592Z",
  "open": false,
  "tip": {
    "id": "a1a53471-2b38-4b6f-8892-61d661fe28bb",
    "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T14:28:21.033416Z"
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
      "id": "5a50c33e-c481-490f-9605-adedf47ed3b7",
      "at": "2026-10-29T14:28:21.178568Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
      "counterpart_id": null
    },
    {
      "id": "52254f77-36c0-4a60-92ac-38cf9e13608c",
      "at": "2026-10-29T14:28:15.759854Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
      "counterpart_id": null
    },
    {
      "id": "4aa474c5-bc15-420a-8e1b-d5c26fee217d",
      "at": "2026-10-29T14:28:10.679015Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
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
      "id": "38c1f680-1376-456d-8de0-b1d5841e600f",
      "at": "2026-10-29T14:28:22.201545Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
      "counterpart_id": null
    },
    {
      "id": "5a50c33e-c481-490f-9605-adedf47ed3b7",
      "at": "2026-10-29T14:28:21.178568Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1421eb65-c0f1-40db-9cdc-50742c3a1007",
      "counterpart_id": null
    },
    {
      "id": "52254f77-36c0-4a60-92ac-38cf9e13608c",
      "at": "2026-10-29T14:28:15.759854Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
      "counterpart_id": null
    },
    {
      "id": "4aa474c5-bc15-420a-8e1b-d5c26fee217d",
      "at": "2026-10-29T14:28:10.679015Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "a2081abd-08ff-409e-b7b3-9b8385f550b6",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "938e8782-63a3-4fc9-9ff4-eb15818a8b79",
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
  "last_heartbeat_at": "2026-10-29T14:28:19.352142Z",
  "last_location_at": "2026-10-29T14:28:19.352142Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/938e8782-63a3-4fc9-9ff4-eb15818a8b79/close` → **200**

```json
{
  "command_id": "3a1a5bf1-6f4c-42fc-a90f-7f0c0abfd5c0",
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

Done: card order 1421eb65-c0f1-40db-9cdc-50742c3a1007.

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
  "phone": "+380734713696",
  "device_ref": "sandbox-31372"
}
```

```json
{
  "challenge_id": "115151d6-93f2-4641-857c-cb4581fb742c",
  "expires_at": "2026-10-29T14:33:23.649037899Z",
  "resend_available_at": "2026-10-29T14:28:24.649037899Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380734713696` → **200**

```json
{
  "phone": "+380734713696",
  "audience": "CLIENT",
  "code": "603382",
  "sent_at": "2026-10-29T14:28:23.651550784Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "115151d6-93f2-4641-857c-cb4581fb742c",
  "code": "603382",
  "device_ref": "sandbox-31372"
}
```

```json
{
  "session_id": "1a23b426-7ed8-4915-a169-ed163ed07c5b",
  "subject": {
    "type": "CLIENT",
    "id": "f02e5afe-c360-4748-8b18-66232ffa164e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmMDJlNWFmZS1jMzYwLTQ3NDgtOGIxOC02NjIzMmZmYTE2NGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDAzLCJpYXQiOjE3OTMyODQxMDMsImp0aSI6ImE1ZDY4NmQyLTJkMzUtNGIzNy05NjQyLTJjZWVlY2FhNjY1MyIsInNpZCI6IjFhMjNiNDI2LTdlZDgtNDkxNS1hMTY5LWVkMTYzZWQwN2M1YiJ9.U1M6t7vwRNhIWgywlibqHXsfytoB9jsUEbUfx39TGtA",
  "access_expires_at": "2026-10-29T14:43:23.904041742Z",
  "refresh_token": "hiTxBoHMcf2uriQUmJrDxDcBB10qNsZE3tIQokiX5QY",
  "refresh_expires_at": "2026-11-28T14:28:23.903546476Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "23949ba6-7521-4435-81c2-a37a737c60a9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "cff3efcd-54bd-4df8-836e-830fb6f61d2a",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-cff3efcd-54bd-4df8-836e-830fb6f61d2a",
    "orderDate": "1793284104",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "8cc46a3c8afe6a4b7228d7b8d87bfe74",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=cff3efcd-54bd-4df8-836e-830fb6f61d2a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380734713696"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=cff3efcd-54bd-4df8-836e-830fb6f61d2a",
  "created_at": "2026-10-29T14:28:24.138534Z",
  "expires_at": "2026-10-29T14:58:24.138534Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/cff3efcd-54bd-4df8-836e-830fb6f61d2a` → **200**

```json
{
  "id": "cff3efcd-54bd-4df8-836e-830fb6f61d2a",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:28:24.138534Z",
  "expires_at": "2026-10-29T14:58:24.138534Z",
  "completed_at": "2026-10-29T14:28:24.37727Z",
  "masked_pan": "41****4285",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f02e5afe-c360-4748-8b18-66232ffa164e",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "f02e5afe-c360-4748-8b18-66232ffa164e",
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
      "id": "fd29aa4c-42a1-4252-9bd3-a2436e49664b",
      "at": "2026-10-29T14:28:25.214083Z",
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
  "client_id": "f02e5afe-c360-4748-8b18-66232ffa164e",
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
      "id": "fd29aa4c-42a1-4252-9bd3-a2436e49664b",
      "at": "2026-10-29T14:28:25.214083Z",
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
  "device_ref": "sandbox-9457"
}
```

```json
{
  "challenge_id": "2c25bff4-94dd-4443-99d2-810c64a7e733",
  "expires_at": "2026-10-29T14:33:26.328297727Z",
  "resend_available_at": "2026-10-29T14:28:27.328297727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "249705",
  "sent_at": "2026-10-29T14:28:26.330639234Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2c25bff4-94dd-4443-99d2-810c64a7e733",
  "code": "249705",
  "device_ref": "sandbox-9457"
}
```

```json
{
  "session_id": "61cc3bcd-9cb8-46ce-9825-52dd76c954fb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTAwNiwiaWF0IjoxNzkzMjg0MTA2LCJqdGkiOiI3MjY2YjI4NS1jNzA0LTQ4NWYtODMyZi0zMjg1ODFlYjEwMTciLCJzaWQiOiI2MWNjM2JjZC05Y2I4LTQ2Y2UtOTgyNS01MmRkNzZjOTU0ZmIifQ.ofqZsR5ibKt6lnXFIK6AyzRwbYMM4_UGtTMnxrXeo68",
  "access_expires_at": "2026-10-29T14:43:26.575343584Z",
  "refresh_token": "ERYOy1u1fs3u7FxMbbdxpYTWNIC4Z3-y9AZ_eeEVJOo",
  "refresh_expires_at": "2026-11-28T14:28:26.574846806Z",
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
  "command_id": "1af8ea2f-7967-42e3-866f-47561fa22a20",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "dbc51672-47ca-49d8-987b-275bd6bfe3b6",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-dbc51672-47ca-49d8-987b-275bd6bfe3b6",
    "orderDate": "1793284107",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "24bd271b1f3138536704a6c87b89d56a",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=dbc51672-47ca-49d8-987b-275bd6bfe3b6",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=dbc51672-47ca-49d8-987b-275bd6bfe3b6",
  "created_at": "2026-10-29T14:28:27.022181Z",
  "expires_at": "2026-10-29T14:58:27.022181Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/dbc51672-47ca-49d8-987b-275bd6bfe3b6` → **200**

```json
{
  "id": "dbc51672-47ca-49d8-987b-275bd6bfe3b6",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T14:28:27.022181Z",
  "expires_at": "2026-10-29T14:58:27.022181Z",
  "completed_at": "2026-10-29T14:28:27.258485Z",
  "masked_pan": "41****8197",
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
      "id": "b56903e2-533d-4912-9b1c-5084f3131528",
      "at": "2026-10-29T14:28:28.222886Z",
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
  "command_id": "f12c880c-b442-44b2-a985-97b4c2514cc3",
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
  "correlation_id": "8771742b-222e-453a-b16d-966697780b97"
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
  "device_ref": "sandbox-31656"
}
```

```json
{
  "challenge_id": "5b96c900-cf76-48a9-91f1-a8c11c29b7d9",
  "expires_at": "2026-10-29T14:33:29.190765246Z",
  "resend_available_at": "2026-10-29T14:28:30.190765246Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "117589",
  "sent_at": "2026-10-29T14:28:29.193482228Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5b96c900-cf76-48a9-91f1-a8c11c29b7d9",
  "code": "117589",
  "device_ref": "sandbox-31656"
}
```

```json
{
  "session_id": "9c3e1850-0252-4178-8c34-6c772f051b66",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTAwOSwiaWF0IjoxNzkzMjg0MTA5LCJqdGkiOiJjMGU0OTQxMy1mZmFlLTQ3MjEtOTc5ZC1jZjFlZDAyZDI4MDMiLCJzaWQiOiI5YzNlMTg1MC0wMjUyLTQxNzgtOGMzNC02Yzc3MmYwNTFiNjYifQ.xNYIwHARzSJfs7EIlbLhlIqHUG5p6QjHQHpku4dNVsw",
  "access_expires_at": "2026-10-29T14:43:29.441757517Z",
  "refresh_token": "U32O7gVHMDZsJwtfSMLH63v49vWPkPLPOMmcOH2P7_g",
  "refresh_expires_at": "2026-11-28T14:28:29.441307309Z",
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
  "command_id": "7231854d-b4b7-4cfd-96dd-0bbfa4bbc34a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:29Z",
    "sequence": 1793284109886
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e13a1a7-c807-4fdf-a29c-fa58abbe6131",
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
  "last_heartbeat_at": "2026-10-29T14:28:29.903057Z",
  "last_location_at": "2026-10-29T14:28:29.903057Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632419262",
  "device_ref": "sandbox-13469"
}
```

```json
{
  "challenge_id": "cd2b6134-a160-4f92-9270-79dc1ce3462b",
  "expires_at": "2026-10-29T14:33:30.130096209Z",
  "resend_available_at": "2026-10-29T14:28:31.130096209Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632419262` → **200**

```json
{
  "phone": "+380632419262",
  "audience": "CLIENT",
  "code": "316712",
  "sent_at": "2026-10-29T14:28:30.132635378Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "cd2b6134-a160-4f92-9270-79dc1ce3462b",
  "code": "316712",
  "device_ref": "sandbox-13469"
}
```

```json
{
  "session_id": "fc12c297-a1ae-425e-8f02-24219ee8fc20",
  "subject": {
    "type": "CLIENT",
    "id": "9c953d93-5bec-4695-bef7-b937943956cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5Yzk1M2Q5My01YmVjLTQ2OTUtYmVmNy1iOTM3OTQzOTU2Y2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDEwLCJpYXQiOjE3OTMyODQxMTAsImp0aSI6IjQwOTBlMDVlLTg1N2ItNDk1OS1hODllLTZlZmM3Mzk1MjJiYSIsInNpZCI6ImZjMTJjMjk3LWExYWUtNDI1ZS04ZjAyLTI0MjE5ZWU4ZmMyMCJ9.PdO5D_kaEj4zLsTnL3i9VMJyl7BRi46cpDWeaoua2Bs",
  "access_expires_at": "2026-10-29T14:43:30.451833325Z",
  "refresh_token": "EoeX6WJg_J96TkLNFllLcgR6627k-WLlEFhJkqLojF4",
  "refresh_expires_at": "2026-11-28T14:28:30.451173367Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "72f79b91-2fe0-4f24-ac42-1e022c805405",
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
  "id": "e1e1cbfd-dd4f-4ef2-bda6-c2f38204c337",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:30.678631Z",
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
  "command_id": "7529797f-7744-4535-a736-3063df7b955e",
  "quote_id": "e1e1cbfd-dd4f-4ef2-bda6-c2f38204c337",
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
  "id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "9c953d93-5bec-4695-bef7-b937943956cf",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:28:30.92026Z",
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
    "id": "8f50325d-8da2-4c1a-ad99-7d320cfb25c8",
    "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
    "expires_at": "2026-10-29T14:28:45.923907Z",
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

`POST /api/driver/v1/offers/8f50325d-8da2-4c1a-ad99-7d320cfb25c8/accept` → **200**

```json
{
  "command_id": "055a0a60-a4f5-4b80-a5c3-ef110c8fc0ec"
}
```

```json
{
  "id": "918b51cc-93ab-4c49-9a18-7df490d90995",
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d30e46c8-9c92-428e-9f10-e4ae1dcc3724",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d30e46c8-9c92-428e-9f10-e4ae1dcc3724",
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "assignment_id": "918b51cc-93ab-4c49-9a18-7df490d90995",
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

`POST /api/driver/v1/work-sessions/1e13a1a7-c807-4fdf-a29c-fa58abbe6131/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:31Z",
    "sequence": 1793284111843
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e13a1a7-c807-4fdf-a29c-fa58abbe6131",
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
  "last_heartbeat_at": "2026-10-29T14:28:31.861044Z",
  "last_location_at": "2026-10-29T14:28:31.861044Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d30e46c8-9c92-428e-9f10-e4ae1dcc3724/arrive` → **200**

```json
{
  "command_id": "3276444e-fd70-40ac-a753-ce3b68e2528e",
  "expected_version": 0
}
```

```json
{
  "id": "d30e46c8-9c92-428e-9f10-e4ae1dcc3724",
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "assignment_id": "918b51cc-93ab-4c49-9a18-7df490d90995",
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
  "arrived_at": "2026-10-29T14:28:32.0953Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d30e46c8-9c92-428e-9f10-e4ae1dcc3724/start` → **200**

```json
{
  "command_id": "899904f6-4c27-4dd8-9e9c-0d2f349b0498",
  "expected_version": 1
}
```

```json
{
  "id": "d30e46c8-9c92-428e-9f10-e4ae1dcc3724",
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "assignment_id": "918b51cc-93ab-4c49-9a18-7df490d90995",
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
  "arrived_at": "2026-10-29T14:28:32.0953Z",
  "started_at": "2026-10-29T14:28:32.349021Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d30e46c8-9c92-428e-9f10-e4ae1dcc3724/complete` → **200**

```json
{
  "command_id": "9e9729b8-c23c-4e41-a634-7d5def6cad18",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:32Z",
  "cash_received": false
}
```

```json
{
  "id": "d30e46c8-9c92-428e-9f10-e4ae1dcc3724",
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "assignment_id": "918b51cc-93ab-4c49-9a18-7df490d90995",
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
  "arrived_at": "2026-10-29T14:28:32.0953Z",
  "started_at": "2026-10-29T14:28:32.349021Z",
  "completed_at": "2026-10-29T14:28:32.592894Z",
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
  "session_id": "055e4f1a-7f50-40c0-a099-e8aecef3adcf",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMTMsImlhdCI6MTc5MzI4NDExMywianRpIjoiZDYwZTg4MGYtZmExYy00M2U1LTg2YjItYzkyNGIwZmMwYzdhIiwic2lkIjoiMDU1ZTRmMWEtN2Y1MC00MGMwLWEwOTktZThhZWNlZjNhZGNmIn0.eeYFDbAftpaXOY6_tl13-7CEc5Bupf9zvHJz0rFUCiU",
  "access_expires_at": "2026-10-29T14:43:33.084571823Z",
  "refresh_token": "RXDJmNOpWY4DJkVBbmNAqxcUJaOqfxVlSLBe-yj6X2g",
  "refresh_expires_at": "2026-10-30T02:28:33.084104679Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "66751d14-864a-4c15-8831-0da859aa90a5"
}
```

`GET /api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute` → **200**

```json
{
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "9c953d93-5bec-4695-bef7-b937943956cf",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:28:33.318888Z",
  "decide_by": "2026-11-12T14:28:33.318888Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T14:28:33.318888Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "9c953d93-5bec-4695-bef7-b937943956cf",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T14:28:33.318888Z",
      "decide_by": "2026-11-12T14:28:33.318888Z",
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

`POST /api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute/decide` → **400**

```json
{
  "command_id": "5f89c6d4-a28b-484e-b0b1-c6d5e8bc64a8",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "e2679784-d2d2-44cb-859a-73f5fdbe3411",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute/decide` → **200**

```json
{
  "command_id": "a389efe7-3a59-4732-a68b-02387319ea67",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "9c953d93-5bec-4695-bef7-b937943956cf",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T14:28:33.318888Z",
  "decide_by": "2026-11-12T14:28:33.318888Z",
  "decision": "PAY_DRIVER",
  "decided_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T14:28:35.253877Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute/decide` → **409**

```json
{
  "command_id": "57f52b82-feab-4ce3-ae32-6c22c4a56e09",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/3043116b-fa84-4431-864b-a3b0df8c8f34/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3c00ec06-3676-496f-ba9e-62bd3fce2aee"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1e13a1a7-c807-4fdf-a29c-fa58abbe6131",
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
  "last_heartbeat_at": "2026-10-29T14:28:31.861044Z",
  "last_location_at": "2026-10-29T14:28:31.861044Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1e13a1a7-c807-4fdf-a29c-fa58abbe6131/close` → **200**

```json
{
  "command_id": "151d63ae-2363-443e-855f-1f01bb208aff",
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
  "phone": "+380736732689",
  "device_ref": "sandbox-2035"
}
```

```json
{
  "challenge_id": "e2129333-cefe-44e8-a0aa-c92f71181165",
  "expires_at": "2026-10-29T14:33:36.186701748Z",
  "resend_available_at": "2026-10-29T14:28:37.186701748Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380736732689` → **200**

```json
{
  "phone": "+380736732689",
  "audience": "CLIENT",
  "code": "490023",
  "sent_at": "2026-10-29T14:28:36.188980389Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e2129333-cefe-44e8-a0aa-c92f71181165",
  "code": "490023",
  "device_ref": "sandbox-2035"
}
```

```json
{
  "session_id": "4507a678-9892-43b1-bf18-eb709da90658",
  "subject": {
    "type": "CLIENT",
    "id": "5498cb4f-610b-43b4-8245-20ed77880e87"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1NDk4Y2I0Zi02MTBiLTQzYjQtODI0NS0yMGVkNzc4ODBlODciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDE2LCJpYXQiOjE3OTMyODQxMTYsImp0aSI6IjRhNTk4NTQwLTJmM2ItNDdiNi1hOGQ2LWFlODc4YzBlYmViNSIsInNpZCI6IjQ1MDdhNjc4LTk4OTItNDNiMS1iZjE4LWViNzA5ZGE5MDY1OCJ9.J-4FDKV_nLp_KfErSwpFAoh-5qgt_BUwQZF7wKs5LLU",
  "access_expires_at": "2026-10-29T14:43:36.440637502Z",
  "refresh_token": "uXJqwtyQR51UUC0_ZVb0_Yc69FsDkaox0gVfZkk5kUM",
  "refresh_expires_at": "2026-11-28T14:28:36.440205261Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "38e67a44-fb15-4499-8b3e-ecafbf6b7224",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "f1de24de-9124-4182-9445-a48db78bb77d",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-f1de24de-9124-4182-9445-a48db78bb77d",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "e6d57eb4349c3b8a86508170ff03ae1b",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=f1de24de-9124-4182-9445-a48db78bb77d",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380736732689"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=f1de24de-9124-4182-9445-a48db78bb77d",
  "expires_at": "2026-10-29T14:58:36.670558Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/f1de24de-9124-4182-9445-a48db78bb77d` → **200**

```json
{
  "id": "f1de24de-9124-4182-9445-a48db78bb77d",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T14:58:36.670558Z",
  "card": {
    "id": "fcba8c99-6d4a-4554-b54f-40485280bdc4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****8509",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:28:36.905315Z"
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
  "device_ref": "sandbox-32156"
}
```

```json
{
  "challenge_id": "03535df2-dd76-4cc0-8c63-16adb815c5fa",
  "expires_at": "2026-10-29T14:33:37.149500758Z",
  "resend_available_at": "2026-10-29T14:28:38.149500758Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "277555",
  "sent_at": "2026-10-29T14:28:37.151511807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "03535df2-dd76-4cc0-8c63-16adb815c5fa",
  "code": "277555",
  "device_ref": "sandbox-32156"
}
```

```json
{
  "session_id": "aabf7c83-21aa-4eb3-b49a-61753127dcd2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTAxNywiaWF0IjoxNzkzMjg0MTE3LCJqdGkiOiI2ZjYwMTM4ZS1iOTA1LTQzMWMtOWUwZS01YTI1ZTQ4OTIwZTAiLCJzaWQiOiJhYWJmN2M4My0yMWFhLTRlYjMtYjQ5YS02MTc1MzEyN2RjZDIifQ.RbmsUbwE6Zm2HOkzH0XBqRn8m05uWFTNL3ScJRe3uz8",
  "access_expires_at": "2026-10-29T14:43:37.403752593Z",
  "refresh_token": "QmFSBULrCKhOfPI59O-r7mU2ogT5cMhdHg170mPflmI",
  "refresh_expires_at": "2026-11-28T14:28:37.403347463Z",
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
  "command_id": "034007da-ed77-4889-855c-c957b2c6f10d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:37Z",
    "sequence": 1793284117844
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b12ca5c2-c2fb-4ffd-a363-11a42613db98",
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
  "last_heartbeat_at": "2026-10-29T14:28:37.861312Z",
  "last_location_at": "2026-10-29T14:28:37.861312Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "78f7021b-838e-4bb9-91c8-7986c4e12d85",
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
  "id": "0a226dad-1331-49ba-93bc-0311aa42ecf1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:38.101125Z",
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
  "command_id": "4ebca367-d345-409f-a465-9f2cae2efc3c",
  "quote_id": "0a226dad-1331-49ba-93bc-0311aa42ecf1",
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
  "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5498cb4f-610b-43b4-8245-20ed77880e87",
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
  "created_at": "2026-10-29T14:28:38.346058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626` → **200**

```json
{
  "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "5498cb4f-610b-43b4-8245-20ed77880e87",
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
  "created_at": "2026-10-29T14:28:38.346058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626` → **200**

```json
{
  "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "5498cb4f-610b-43b4-8245-20ed77880e87",
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
  "created_at": "2026-10-29T14:28:38.346058Z",
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
    "id": "a072e78b-d94f-4616-b84c-62e56d304438",
    "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
    "expires_at": "2026-10-29T14:28:54.351089Z",
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

`POST /api/driver/v1/offers/a072e78b-d94f-4616-b84c-62e56d304438/accept` → **200**

```json
{
  "command_id": "5f5a0904-e7a6-4073-bae2-1c83bcc5e611"
}
```

```json
{
  "id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "assignment_id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
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

`POST /api/rider/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/messages` → **201**

```json
{
  "command_id": "ab2707bb-17ea-470d-97c2-3ec80481edee",
  "body": "Я біля входу, мій номер +380736732689, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "592de33e-e580-4863-a0ca-a23d845840c5",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380736732689, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T14:28:40.747530663Z"
}
```

`POST /api/driver/v1/trips/d2cf1b2a-e989-4fcb-9146-5822befc90f1/messages` → **201**

```json
{
  "command_id": "177a2370-6e72-46bf-9711-444316480586",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "ae287b38-c847-46a5-98f0-fef060156dbf",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T14:28:40.984181575Z"
}
```

`POST /api/driver/v1/work-sessions/b12ca5c2-c2fb-4ffd-a363-11a42613db98/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:41Z",
    "sequence": 1793284121198
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b12ca5c2-c2fb-4ffd-a363-11a42613db98",
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
  "last_heartbeat_at": "2026-10-29T14:28:41.215097Z",
  "last_location_at": "2026-10-29T14:28:41.215097Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/d2cf1b2a-e989-4fcb-9146-5822befc90f1/arrive` → **200**

```json
{
  "command_id": "830c05a9-c04a-45da-9525-2bbc242af15c",
  "expected_version": 0
}
```

```json
{
  "id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "assignment_id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
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
  "arrived_at": "2026-10-29T14:28:41.452267Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d2cf1b2a-e989-4fcb-9146-5822befc90f1/start` → **200**

```json
{
  "command_id": "ca7c799b-c2ac-4040-86f0-c10fe03d901a",
  "expected_version": 1
}
```

```json
{
  "id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "assignment_id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
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
  "arrived_at": "2026-10-29T14:28:41.452267Z",
  "started_at": "2026-10-29T14:28:41.688067Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/b12ca5c2-c2fb-4ffd-a363-11a42613db98/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:28:41Z",
    "sequence": 1793284121908
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "b12ca5c2-c2fb-4ffd-a363-11a42613db98",
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
  "last_heartbeat_at": "2026-10-29T14:28:41.924987Z",
  "last_location_at": "2026-10-29T14:28:41.924987Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/d2cf1b2a-e989-4fcb-9146-5822befc90f1/complete` → **200**

```json
{
  "command_id": "e7e14d1c-cab0-4d50-95d0-180aa13014dd",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:28:42Z",
  "cash_received": false
}
```

```json
{
  "id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "assignment_id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
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
  "arrived_at": "2026-10-29T14:28:41.452267Z",
  "started_at": "2026-10-29T14:28:41.688067Z",
  "completed_at": "2026-10-29T14:28:42.157166Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626` → **200**

```json
{
  "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "5498cb4f-610b-43b4-8245-20ed77880e87",
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
    "id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
    "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:38.346058Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626` → **200**

```json
{
  "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "5498cb4f-610b-43b4-8245-20ed77880e87",
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
    "id": "e969a0f8-9769-4a4d-a05e-73dd7536c3d4",
    "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d2cf1b2a-e989-4fcb-9146-5822befc90f1",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:28:38.346058Z",
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
  "session_id": "b12ca5c2-c2fb-4ffd-a363-11a42613db98",
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
  "last_heartbeat_at": "2026-10-29T14:28:41.924987Z",
  "last_location_at": "2026-10-29T14:28:41.924987Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/b12ca5c2-c2fb-4ffd-a363-11a42613db98/close` → **200**

```json
{
  "command_id": "41510a04-7b0b-4201-a929-4f513765cb79",
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
  "session_id": "9f9186e5-2f55-4b03-8da0-a29aac46e63f",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMjQsImlhdCI6MTc5MzI4NDEyNCwianRpIjoiY2U1NzNjNGEtNzM1Ni00NjU3LTg1MTEtNTFiYzdkOGY1NWVmIiwic2lkIjoiOWY5MTg2ZTUtMmY1NS00YjAzLThkYTAtYTI5YWFjNDZlNjNmIn0.Qcb_7b1sU6n1t2ENcSHDIwueu6FPIRrn5-lQRGWgDZU",
  "access_expires_at": "2026-10-29T14:43:44.585548667Z",
  "refresh_token": "8B0RRExIRj8NiwprwEcwz1r7iZGPu-VvnNcNNSZZfWw",
  "refresh_expires_at": "2026-10-30T02:28:44.585102965Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9d4458a5-00db-448c-ada7-808cf21e33a2"
}
```

`GET /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T14:28:45.039602491Z",
  "order": {
    "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
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
    "created_at": "2026-10-29T14:28:38.346058Z",
    "assigned_at": "2026-10-29T14:28:40.291075Z",
    "arrived_at": "2026-10-29T14:28:41.452267Z",
    "started_at": "2026-10-29T14:28:41.688067Z",
    "completed_at": "2026-10-29T14:28:42.157166Z"
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
    "id": "5498cb4f-610b-43b4-8245-20ed77880e87",
    "registered_at": "2026-10-29T14:28:36.438674Z",
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
      "created_at": "2026-10-29T14:28:38.348154Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T14:28:42.388323Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks` → **422**

```json
{
  "command_id": "ae4f2203-0907-4ef5-8cb0-fa36333edabd",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "2247b3bd-1b7c-49c8-a8ae-9fca5b2f90be"
}
```

`POST /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks` → **201**

```json
{
  "command_id": "ccdc1656-876f-4902-8510-3bea8da196f7",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "f28be4e7-8008-4937-a0a6-a3366a09353e",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:28:45.565855Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks` → **201**

```json
{
  "command_id": "ccdc1656-876f-4902-8510-3bea8da196f7",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "f28be4e7-8008-4937-a0a6-a3366a09353e",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T14:28:45.565855Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/5498cb4f-610b-43b4-8245-20ed77880e87` → **200**

```json
{
  "client": {
    "id": "5498cb4f-610b-43b4-8245-20ed77880e87",
    "phone": "+380736732689",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:28:36.438674Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:28:38.346058Z",
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

`GET /api/admin/v1/clients/5498cb4f-610b-43b4-8245-20ed77880e87` → **200**

```json
{
  "client": {
    "id": "5498cb4f-610b-43b4-8245-20ed77880e87",
    "phone": "+380736732689",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:28:36.438674Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:28:38.346058Z",
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

`POST /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks/f28be4e7-8008-4937-a0a6-a3366a09353e/resolve` → **200**

```json
{
  "command_id": "e8bfec19-71e9-45ad-a088-5a8d746f9ed8",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "f28be4e7-8008-4937-a0a6-a3366a09353e",
  "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T14:28:45.565855Z",
  "resolved_at": "2026-10-29T14:28:47.606972Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/5498cb4f-610b-43b4-8245-20ed77880e87` → **200**

```json
{
  "client": {
    "id": "5498cb4f-610b-43b4-8245-20ed77880e87",
    "phone": "+380736732689",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:28:36.438674Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:28:38.346058Z",
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

`GET /api/admin/v1/clients/5498cb4f-610b-43b4-8245-20ed77880e87` → **200**

```json
{
  "client": {
    "id": "5498cb4f-610b-43b4-8245-20ed77880e87",
    "phone": "+380736732689",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:28:36.438674Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T14:28:38.346058Z",
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

`POST /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks/f28be4e7-8008-4937-a0a6-a3366a09353e/resolve` → **409**

```json
{
  "command_id": "bb172e0e-68e6-404d-a167-cacb80bab2c1",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks/f28be4e7-8008-4937-a0a6-a3366a09353e/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bdf9ba26-1e5e-4981-893a-9031c1fd4e81"
}
```

`GET /api/admin/v1/orders/736bfb56-2ee5-423f-9b19-fc32e2117626/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "f28be4e7-8008-4937-a0a6-a3366a09353e",
      "order_id": "736bfb56-2ee5-423f-9b19-fc32e2117626",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T14:28:45.565855Z",
      "resolved_at": "2026-10-29T14:28:47.606972Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 736bfb56-2ee5-423f-9b19-fc32e2117626 without phone or card digits; chargeback f28be4e7-8008-4937-a0a6-a3366a09353e recorded and won.

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
  "session_id": "88f5c820-7852-4b36-a0e2-7fd7d497c8d1",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwMzAsImlhdCI6MTc5MzI4NDEzMCwianRpIjoiYjkzOTc5YWMtNzk1OC00ZDg5LWFlYmMtMDNlYzEyOWIyZDllIiwic2lkIjoiODhmNWM4MjAtNzg1Mi00YjM2LWEwZTItN2ZkN2Q0OTdjOGQxIn0.JyjwMMQV4roI1atFi3A0N9RJyWXuSI4pMUVVSJJJu3Y",
  "access_expires_at": "2026-10-29T14:43:50.309302173Z",
  "refresh_token": "x92gURi6mzAamfA5r-Qt2GUKNCuWMthuGW4GXIWDAug",
  "refresh_expires_at": "2026-10-30T02:28:50.308909392Z",
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
  "phone": "+48600385577",
  "device_ref": "sandbox-8010"
}
```

```json
{
  "challenge_id": "3d561fa4-4de6-452c-a4cb-45e592fbeb17",
  "expires_at": "2026-10-29T14:33:50.997921088Z",
  "resend_available_at": "2026-10-29T14:28:51.997921088Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600385577` → **200**

```json
{
  "phone": "+48600385577",
  "audience": "CLIENT",
  "code": "710659",
  "sent_at": "2026-10-29T14:28:51.000189776Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3d561fa4-4de6-452c-a4cb-45e592fbeb17",
  "code": "710659",
  "device_ref": "sandbox-8010"
}
```

```json
{
  "session_id": "cd561795-a851-4dd6-bc2e-429c2830d08b",
  "subject": {
    "type": "CLIENT",
    "id": "113a64e9-04cc-4434-b0b2-898e0ce7dff5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMTNhNjRlOS0wNGNjLTQ0MzQtYjBiMi04OThlMGNlN2RmZjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDMxLCJpYXQiOjE3OTMyODQxMzEsImp0aSI6ImU3ZTU0ZjBjLTZlZjQtNDFiYS1hZGEzLTQxYjEyMjhmMjhlNCIsInNpZCI6ImNkNTYxNzk1LWE4NTEtNGRkNi1iYzJlLTQyOWMyODMwZDA4YiJ9.60l64PWi77ugJTUjKivsUQ7NjtoiiEonoQy9RVA4ocw",
  "access_expires_at": "2026-10-29T14:43:51.250628362Z",
  "refresh_token": "gTWrsH7rxWIQMMHJxmDr1_GKfxFDakpqFljOsQNSgx0",
  "refresh_expires_at": "2026-11-28T14:28:51.250225595Z",
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
  "command_id": "c5302859-eeb1-4a9d-9bff-eb06d68c9b3f",
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
  "correlation_id": "a05eeda4-e727-4f44-b09b-f9502a1b75c4",
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
  "command_id": "6b48dfbf-c0f1-4c3b-bc6a-432a7ca89fbd",
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
  "paused_at": "2026-10-29T14:28:52.160272383Z",
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
  "command_id": "5f06088d-f7ea-4314-b17f-22acfb485518",
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
  "id": "35f33cc4-2063-48dd-9e54-f89adf443f57",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:52.643561Z",
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
  "command_id": "3d99ce58-a1bf-423f-a9cb-c33f62a51550",
  "quote_id": "35f33cc4-2063-48dd-9e54-f89adf443f57",
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
  "correlation_id": "95f7b026-01dc-442e-b744-0eb4bfeb8f73"
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
  "paused_at": "2026-10-29T14:28:52.160272Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "e929658a-8414-4d28-8d83-5a5388ffbc00",
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
  "command_id": "b594cbc4-0ad4-4388-81e9-ebfe4c246fe3",
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
  "command_id": "b5ab8ef2-baad-4478-87fb-3a232babd4bb",
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
  "id": "e521777a-c426-4213-9f3a-ff7cb3140e3e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:54.041749Z",
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
  "command_id": "73ec4a15-bdd3-4c9c-a820-d24dbab63c55",
  "quote_id": "e521777a-c426-4213-9f3a-ff7cb3140e3e",
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
  "correlation_id": "98649829-286f-42c1-9753-b6da42f37790"
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
  "command_id": "ffe66ceb-2499-4c81-a925-9e00e1653e9b",
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
  "command_id": "54413428-f819-4b6f-bc5d-9288109a7511",
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
  "id": "09979312-e73d-4d99-a9ae-5ccc275a7e0b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:55.251898Z",
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
  "command_id": "be044267-5cf9-46ee-b1b3-9783debd0cc1",
  "quote_id": "09979312-e73d-4d99-a9ae-5ccc275a7e0b",
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
  "correlation_id": "2f6ac58f-bed3-438d-b736-0e18f79ce3a6"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "88dda14d-4074-4c5a-a42d-0ceeeeebaf60",
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
  "correlation_id": "41a5469d-8b6b-4909-8087-c341b3138d73"
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
  "command_id": "21f3a6a9-0cb4-4740-883e-e6d803351977",
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
  "phone": "+380678477128",
  "device_ref": "sandbox-11379"
}
```

```json
{
  "challenge_id": "8971d456-82e6-497f-90e4-a78fd7eb03af",
  "expires_at": "2026-10-29T14:33:56.448156024Z",
  "resend_available_at": "2026-10-29T14:28:57.448156024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678477128` → **200**

```json
{
  "phone": "+380678477128",
  "audience": "CLIENT",
  "code": "869926",
  "sent_at": "2026-10-29T14:28:56.450264305Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8971d456-82e6-497f-90e4-a78fd7eb03af",
  "code": "869926",
  "device_ref": "sandbox-11379"
}
```

```json
{
  "session_id": "e0b5a6c8-f8a9-4de6-b947-78be181df585",
  "subject": {
    "type": "CLIENT",
    "id": "79a53a1f-fb6a-49ca-bfa1-5229487d40d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3OWE1M2ExZi1mYjZhLTQ5Y2EtYmZhMS01MjI5NDg3ZDQwZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDM2LCJpYXQiOjE3OTMyODQxMzYsImp0aSI6IjI3ODg1OGQ1LWFmMTctNDExNS1hOWIwLTI5ZGE1YjhjMDQ1YiIsInNpZCI6ImUwYjVhNmM4LWY4YTktNGRlNi1iOTQ3LTc4YmUxODFkZjU4NSJ9.91W7TnsP-rRZsTW2DT4sjhSUywafRsq4kmeAktwByA8",
  "access_expires_at": "2026-10-29T14:43:56.693494287Z",
  "refresh_token": "mjuTIV9-ql9Z10T8dSmsZFYayQEOvy1o0YElzf3iE9Q",
  "refresh_expires_at": "2026-11-28T14:28:56.693080463Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "79a53a1f-fb6a-49ca-bfa1-5229487d40d9",
  "session_id": "e0b5a6c8-f8a9-4de6-b947-78be181df585",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "c2397597-a99e-4184-b16d-7f873976c129",
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
  "id": "5571189e-a9c6-41d0-a181-3ebe6a5fe4f5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:33:57.154252Z",
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
  "challenge_id": "80108163-6e34-4359-9426-b7819849bad7",
  "expires_at": "2026-10-29T14:33:59.381097503Z",
  "resend_available_at": "2026-10-29T14:29:00.381097503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380678477128` → **200**

```json
{
  "phone": "+380678477128",
  "audience": "CLIENT",
  "code": "589834",
  "sent_at": "2026-10-29T14:28:59.383387657Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "cf360522-c0de-4cc4-bbf1-980c8755a826",
  "challenge_id": "80108163-6e34-4359-9426-b7819849bad7",
  "otp_code": "589834"
}
```

```json
{
  "client_id": "79a53a1f-fb6a-49ca-bfa1-5229487d40d9",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T14:28:59.632895203Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "8a79667b-856e-46cf-8704-5c6fb960cd16",
  "quote_id": "5571189e-a9c6-41d0-a181-3ebe6a5fe4f5",
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
  "correlation_id": "6dbd6362-5e3b-4e7a-97d2-17725599dc0b"
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
  "session_id": "363e40cb-2aa4-4abe-9b68-0f2612d422d3",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNDAsImlhdCI6MTc5MzI4NDE0MCwianRpIjoiNzM5NzFjYmItOGJhOS00Mjg0LTgzMmUtMDI2ZDYxNmM3ZGMzIiwic2lkIjoiMzYzZTQwY2ItMmFhNC00YWJlLTliNjgtMGYyNjEyZDQyMmQzIn0.r6HJBFng0y3tBDFyentPSWC5v0bYHKqkr4CJl61W8Pk",
  "access_expires_at": "2026-10-29T14:44:00.507127849Z",
  "refresh_token": "T9BJT81G_mvI6LrKt9xKhztzVhtiwpBJGwnCx7YHOLo",
  "refresh_expires_at": "2026-10-30T02:29:00.506707562Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "79a53a1f-fb6a-49ca-bfa1-5229487d40d9",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T14:28:59.632895Z",
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

`POST /api/admin/v1/client-deletions/79a53a1f-fb6a-49ca-bfa1-5229487d40d9/complete` → **200**

```json
{
  "command_id": "cb53b8d2-8af5-41de-8406-f60b03aa40c1",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "79a53a1f-fb6a-49ca-bfa1-5229487d40d9",
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
  "correlation_id": "ddf9b3ca-513f-4da7-9107-c210f987e2f9"
}
```

Done: client 79a53a1f-fb6a-49ca-bfa1-5229487d40d9 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667473585",
  "device_ref": "sandbox-6951"
}
```

```json
{
  "challenge_id": "09965921-b832-4293-b21f-3effd183597e",
  "expires_at": "2026-10-29T14:34:01.470437773Z",
  "resend_available_at": "2026-10-29T14:29:02.470437773Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667473585` → **200**

```json
{
  "phone": "+380667473585",
  "audience": "CLIENT",
  "code": "610767",
  "sent_at": "2026-10-29T14:29:01.473174604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "09965921-b832-4293-b21f-3effd183597e",
  "code": "610767",
  "device_ref": "sandbox-6951"
}
```

```json
{
  "session_id": "11c62707-69ca-46e6-8a6e-8d4a9e4b4564",
  "subject": {
    "type": "CLIENT",
    "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjdkZGUxMi1hOGUxLTQ1YzYtOWMyZS0wODg1MjdiNzU2ZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDQxLCJpYXQiOjE3OTMyODQxNDEsImp0aSI6ImE3NGExYWRkLTU4ZGUtNGVjMy1hYjhmLThiZmM1NjI4OTcwNyIsInNpZCI6IjExYzYyNzA3LTY5Y2EtNDZlNi04YTZlLThkNGE5ZTRiNDU2NCJ9.VMVPJqWpFzRBqAK3BozrQC2q8kdh2Ogq9PhKAX2WM4U",
  "access_expires_at": "2026-10-29T14:44:01.737417886Z",
  "refresh_token": "Vab8a5Vjfj0mjKzmSftRBz5etjZYxieP7VnZa3o41qw",
  "refresh_expires_at": "2026-11-28T14:29:01.73693239Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
  "session_id": "11c62707-69ca-46e6-8a6e-8d4a9e4b4564",
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
  "session_id": "581c332c-43ff-4a76-8d29-783da7645377",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNDIsImlhdCI6MTc5MzI4NDE0MiwianRpIjoiMzllOTkxZDMtZDZkZC00MDhiLWFkZmMtYjVjYTEyNGZlYTUyIiwic2lkIjoiNTgxYzMzMmMtNDNmZi00YTc2LThkMjktNzgzZGE3NjQ1Mzc3In0.j9H2PLN-AeVgbZzi5TafaxC4wpMEw7_Rs2EwEx6oWSA",
  "access_expires_at": "2026-10-29T14:44:02.452936908Z",
  "refresh_token": "hC2aKWREjPhxRRfOnmNlgGWt_azfxSXn8Yr79Rojb2w",
  "refresh_expires_at": "2026-10-30T02:29:02.452532239Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=7473585&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
      "phone": "+380667473585",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T14:29:01.735164Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/2f7dde12-a8e1-45c6-9c2e-088527b756d9` → **200**

```json
{
  "client": {
    "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
    "phone": "+380667473585",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:29:01.735164Z",
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

`POST /api/admin/v1/clients/2f7dde12-a8e1-45c6-9c2e-088527b756d9/block` → **400**

```json
{
  "command_id": "d752f899-bff8-4fbb-8a5c-8aa74df01ae0",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/2f7dde12-a8e1-45c6-9c2e-088527b756d9/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a8d6c65d-d700-4153-92e4-3e398650f049",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/2f7dde12-a8e1-45c6-9c2e-088527b756d9/block` → **200**

```json
{
  "command_id": "64fe531c-4d2c-4c68-89c2-908e09346368",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
  "phone": "+380667473585",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T14:29:01.735164Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T14:29:03.519867Z",
    "by": "19a415f0-70ef-40f1-bafd-5905cf93503e"
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
  "correlation_id": "6dbf06d3-0609-4251-bf1b-0f3a2295df7a"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667473585",
  "device_ref": "sandbox-29000"
}
```

```json
{
  "challenge_id": "5f3c57c7-4ab8-4947-8c54-8354daecee20",
  "expires_at": "2026-10-29T14:34:05.981920009Z",
  "resend_available_at": "2026-10-29T14:29:06.981920009Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667473585` → **200**

```json
{
  "phone": "+380667473585",
  "audience": "CLIENT",
  "code": "416428",
  "sent_at": "2026-10-29T14:29:05.984055485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "5f3c57c7-4ab8-4947-8c54-8354daecee20",
  "code": "416428",
  "device_ref": "sandbox-29000"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "48814365-be2a-48de-882c-25e6125e0712"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/2f7dde12-a8e1-45c6-9c2e-088527b756d9` → **200**

```json
{
  "client": {
    "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
    "phone": "+380667473585",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T14:29:01.735164Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T14:29:03.519867Z",
      "by": "19a415f0-70ef-40f1-bafd-5905cf93503e"
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

`POST /api/admin/v1/clients/2f7dde12-a8e1-45c6-9c2e-088527b756d9/unblock` → **200**

```json
{
  "command_id": "c9cf94e2-3fa0-4864-a756-3f2addb46f7b",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
  "phone": "+380667473585",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T14:29:01.735164Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380667473585",
  "device_ref": "sandbox-32191"
}
```

```json
{
  "challenge_id": "8ee2df15-60d7-4f3e-8fb6-2c80deea1068",
  "expires_at": "2026-10-29T14:34:08.942993113Z",
  "resend_available_at": "2026-10-29T14:29:09.942993113Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380667473585` → **200**

```json
{
  "phone": "+380667473585",
  "audience": "CLIENT",
  "code": "947274",
  "sent_at": "2026-10-29T14:29:08.94505317Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ee2df15-60d7-4f3e-8fb6-2c80deea1068",
  "code": "947274",
  "device_ref": "sandbox-32191"
}
```

```json
{
  "session_id": "247c7a4d-905c-4aae-95ea-5dee211c0464",
  "subject": {
    "type": "CLIENT",
    "id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyZjdkZGUxMi1hOGUxLTQ1YzYtOWMyZS0wODg1MjdiNzU2ZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDQ5LCJpYXQiOjE3OTMyODQxNDksImp0aSI6IjBiNTk5ZDJlLWJiNmItNGYyYi04Nzg0LWUzMDQ4YTAwMDM5ZCIsInNpZCI6IjI0N2M3YTRkLTkwNWMtNGFhZS05NWVhLTVkZWUyMTFjMDQ2NCJ9.euIbDfjCxlWdnR-s9_yaV2q_MdM0Szmt5vB7z35P5lg",
  "access_expires_at": "2026-10-29T14:44:09.244471869Z",
  "refresh_token": "DJOH2jTsD1COAfJYP-pJxVtqsOGZ8SyiSMESXvlOAg8",
  "refresh_expires_at": "2026-11-28T14:29:09.244062032Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "2f7dde12-a8e1-45c6-9c2e-088527b756d9",
  "session_id": "247c7a4d-905c-4aae-95ea-5dee211c0464",
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
  "phone": "+380665124616",
  "device_ref": "sandbox-12759"
}
```

```json
{
  "challenge_id": "287a50f7-69a2-45bb-be79-7c0e91893e4e",
  "expires_at": "2026-10-29T14:34:09.690233024Z",
  "resend_available_at": "2026-10-29T14:29:10.690233024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665124616` → **200**

```json
{
  "phone": "+380665124616",
  "audience": "CLIENT",
  "code": "878002",
  "sent_at": "2026-10-29T14:29:09.692173677Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "287a50f7-69a2-45bb-be79-7c0e91893e4e",
  "code": "878002",
  "device_ref": "sandbox-12759"
}
```

```json
{
  "session_id": "c13e3bae-796f-4b44-aad1-d3818ed2c302",
  "subject": {
    "type": "CLIENT",
    "id": "0975e41a-9035-4824-a7a6-0842b3a3b9af"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwOTc1ZTQxYS05MDM1LTQ4MjQtYTdhNi0wODQyYjNhM2I5YWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDQ5LCJpYXQiOjE3OTMyODQxNDksImp0aSI6IjcwODY0NDIyLWFlMjktNGM0ZC05MzY3LTA1NzdhZTRlNTI3ZCIsInNpZCI6ImMxM2UzYmFlLTc5NmYtNGI0NC1hYWQxLWQzODE4ZWQyYzMwMiJ9.AHJE_gkjOr_RGBAgfz5Wg6lIhZq8YM3dTBaCgxY3VWE",
  "access_expires_at": "2026-10-29T14:44:09.935644619Z",
  "refresh_token": "qpeIYjxyrnkMWGH1rSJDnglRyH7N2Othc4D0weA--14",
  "refresh_expires_at": "2026-11-28T14:29:09.935250775Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3df680e-12ab-48ef-a03c-f9973461c112",
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
  "id": "04c3d9f6-d54d-4a8e-88e9-8be92165d93a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:10.373695Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 1715ba6c-2168-4f06-ae9f-fe3419740278) → **201**

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
  "session_id": "495f55d8-1d0e-4680-b078-b17e191ae6ed",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNTAsImlhdCI6MTc5MzI4NDE1MCwianRpIjoiOTAxYjY4M2YtNmFhNi00YWI4LWJjODctY2ZjMGQ1ZDZmM2EwIiwic2lkIjoiNDk1ZjU1ZDgtMWQwZS00NjgwLWIwNzgtYjE3ZTE5MWFlNmVkIn0.unMjqPD-G7ncDD8mhlTI815agPpugPsxLDKv_kk0nvQ",
  "access_expires_at": "2026-10-29T14:44:10.895991816Z",
  "refresh_token": "ArweUG6TLxKbMkhxubt75MnkEhSkmZ4AXsjN4EBrVhw",
  "refresh_expires_at": "2026-10-30T02:29:10.89559648Z",
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
  "session_id": "a8d49333-3eb3-4254-9142-e6c8cd1dee95",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNTEsImlhdCI6MTc5MzI4NDE1MSwianRpIjoiZGQ4OTY3OWQtZDBhMS00MmEzLTgxODQtYTQ3NTMzYzY3NzhjIiwic2lkIjoiYThkNDkzMzMtM2ViMy00MjU0LTkxNDItZTZjOGNkMWRlZTk1In0.7eHJyKGhVD8atQaZtx6M6PpAt5kkGNWqdhtFa8YJc_A",
  "access_expires_at": "2026-10-29T14:44:11.378800193Z",
  "refresh_token": "0DLU4zGN0McIe7jxLOihX5lu-_VJ2nZnI9lLAFsKKTU",
  "refresh_expires_at": "2026-10-30T02:29:11.378354141Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d451d526-28ad-4e4f-b648-495057462b09/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:10.609156Z",
      "actor": {
        "type": "CLIENT",
        "id": "0975e41a-9035-4824-a7a6-0842b3a3b9af",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d451d526-28ad-4e4f-b648-495057462b09",
        "quote_id": "04c3d9f6-d54d-4a8e-88e9-8be92165d93a",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "1715ba6c-2168-4f06-ae9f-fe3419740278"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:10.610619Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d451d526-28ad-4e4f-b648-495057462b09",
        "attempt_id": "92ae27ce-76dd-40bf-818d-7626d3666c9f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1715ba6c-2168-4f06-ae9f-fe3419740278"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T14:29:10.615738Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d451d526-28ad-4e4f-b648-495057462b09",
        "attempt_id": "92ae27ce-76dd-40bf-818d-7626d3666c9f"
      },
      "correlation_id": "1715ba6c-2168-4f06-ae9f-fe3419740278"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "92ae27ce-76dd-40bf-818d-7626d3666c9f",
        "generation": 1,
        "started_at": "2026-10-29T14:29:10.609891Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T14:29:10.615738Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T14:29:10.611167Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/1715ba6c-2168-4f06-ae9f-fe3419740278` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "d451d526-28ad-4e4f-b648-495057462b09:0",
      "order_id": "d451d526-28ad-4e4f-b648-495057462b09",
      "at": "2026-10-29T14:29:10.609156Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d451d526-28ad-4e4f-b648-495057462b09:1",
      "order_id": "d451d526-28ad-4e4f-b648-495057462b09",
      "at": "2026-10-29T14:29:10.610619Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "d451d526-28ad-4e4f-b648-495057462b09:2",
      "order_id": "d451d526-28ad-4e4f-b648-495057462b09",
      "at": "2026-10-29T14:29:10.615738Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/029e9ea3-d446-41fd-9a37-d3340f3a2c6d` → **200**

```json
{
  "found": []
}
```

Done: request 1715ba6c-2168-4f06-ae9f-fe3419740278 — order d451d526-28ad-4e4f-b648-495057462b09 found by its id.

`GET /api/rider/v1/orders/d451d526-28ad-4e4f-b648-495057462b09` → **200**

```json
{
  "id": "d451d526-28ad-4e4f-b648-495057462b09",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0975e41a-9035-4824-a7a6-0842b3a3b9af",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:10.608755Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/d451d526-28ad-4e4f-b648-495057462b09/cancel` → **200**

```json
{
  "command_id": "dd9199dc-d9bd-44c4-833a-c97a02f5c04c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d451d526-28ad-4e4f-b648-495057462b09",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0975e41a-9035-4824-a7a6-0842b3a3b9af",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:10.608755Z",
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
  "phone": "+380634067431",
  "device_ref": "sandbox-6758"
}
```

```json
{
  "challenge_id": "8deabc72-19b9-406c-b229-14e25fe74c1d",
  "expires_at": "2026-10-29T14:34:12.826736759Z",
  "resend_available_at": "2026-10-29T14:29:13.826736759Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634067431` → **200**

```json
{
  "phone": "+380634067431",
  "audience": "CLIENT",
  "code": "555741",
  "sent_at": "2026-10-29T14:29:12.828775911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8deabc72-19b9-406c-b229-14e25fe74c1d",
  "code": "555741",
  "device_ref": "sandbox-6758"
}
```

```json
{
  "session_id": "4222b453-ce60-47cf-a3e3-ac7ee4399360",
  "subject": {
    "type": "CLIENT",
    "id": "8bc823ae-aebe-4f5e-8f52-138483e87b53"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4YmM4MjNhZS1hZWJlLTRmNWUtOGY1Mi0xMzg0ODNlODdiNTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDUzLCJpYXQiOjE3OTMyODQxNTMsImp0aSI6IjY5YWQ1MmI5LWRkZGItNGQwMS1hYTczLWVhMWE4MWVmNzI1NCIsInNpZCI6IjQyMjJiNDUzLWNlNjAtNDdjZi1hM2UzLWFjN2VlNDM5OTM2MCJ9.OXW-HnSyLAOKFM-sZJpsTocCq1FkdwD7oRU8TRnR2_A",
  "access_expires_at": "2026-10-29T14:44:13.108456835Z",
  "refresh_token": "iK9GZgDvrOWKFOPdohTz9YYF60Czpeo40PvOlwEusvE",
  "refresh_expires_at": "2026-11-28T14:29:13.108019821Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "b2fc1b1a-1ceb-4fd4-b75c-7f22af05b769",
  "expires_at": "2026-10-29T14:34:15.336446477Z",
  "resend_available_at": "2026-10-29T14:29:16.336446477Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380634067431` → **200**

```json
{
  "phone": "+380634067431",
  "audience": "CLIENT",
  "code": "564555",
  "sent_at": "2026-10-29T14:29:15.338315923Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "295d3da2-5e09-439b-9c1c-e6d4ab64b525",
  "challenge_id": "b2fc1b1a-1ceb-4fd4-b75c-7f22af05b769",
  "otp_code": "564555"
}
```

```json
{
  "id": "f1b01274-5de7-4f83-9acf-e887209ad694",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:15.588624Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694` → **200**

```json
{
  "id": "f1b01274-5de7-4f83-9acf-e887209ad694",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:15.588624Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694` → **200**

```json
{
  "id": "f1b01274-5de7-4f83-9acf-e887209ad694",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:15.588624Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694` → **200**

```json
{
  "id": "f1b01274-5de7-4f83-9acf-e887209ad694",
  "state": "PENDING",
  "created_at": "2026-10-29T14:29:15.588624Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694` → **200**

```json
{
  "id": "f1b01274-5de7-4f83-9acf-e887209ad694",
  "state": "READY",
  "created_at": "2026-10-29T14:29:15.588624Z",
  "ready_at": "2026-10-29T14:29:18.652719Z",
  "expires_at": "2026-11-05T14:29:18.652719Z",
  "size_bytes": 1028
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639629621",
  "device_ref": "sandbox-23816"
}
```

```json
{
  "challenge_id": "bb6c022f-4eda-4d3f-b7b5-f886aaa848f4",
  "expires_at": "2026-10-29T14:34:19.719975727Z",
  "resend_available_at": "2026-10-29T14:29:20.719975727Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639629621` → **200**

```json
{
  "phone": "+380639629621",
  "audience": "CLIENT",
  "code": "361481",
  "sent_at": "2026-10-29T14:29:19.722013175Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb6c022f-4eda-4d3f-b7b5-f886aaa848f4",
  "code": "361481",
  "device_ref": "sandbox-23816"
}
```

```json
{
  "session_id": "a8670fea-368f-43ad-a889-da79799b7766",
  "subject": {
    "type": "CLIENT",
    "id": "fca46ac4-30ad-4fe0-8a30-04fb4bc5689e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmY2E0NmFjNC0zMGFkLTRmZTAtOGEzMC0wNGZiNGJjNTY4OWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDU5LCJpYXQiOjE3OTMyODQxNTksImp0aSI6ImI0MmMyOTJjLWVlYTEtNDYyYS1hMTBkLTJmYTJmZTRhNTI3YyIsInNpZCI6ImE4NjcwZmVhLTM2OGYtNDNhZC1hODg5LWRhNzk3OTliNzc2NiJ9.6byhGmvOk7XDRqZqs-hprs3FXrJDs4jjvQjE56_TY04",
  "access_expires_at": "2026-10-29T14:44:19.972409496Z",
  "refresh_token": "3HYTuLaOZ-Dg-E8IQNPfrwMB0zgBSrzwB7hSJVGv0Nc",
  "refresh_expires_at": "2026-11-28T14:29:19.972001342Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/f1b01274-5de7-4f83-9acf-e887209ad694/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "f0f540c7-9251-4043-a683-24916f660b2d"
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
  "session_id": "11ac66f4-8626-4fe6-99a4-8e50ceeebbf3",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNjAsImlhdCI6MTc5MzI4NDE2MCwianRpIjoiMDE3NjYyMDMtNDFlMi00MTkwLWI2YzUtN2QyMDk2YTJjYjFiIiwic2lkIjoiMTFhYzY2ZjQtODYyNi00ZmU2LTk5YTQtOGU1MGNlZWViYmYzIn0.7vyxT8DxbaQepeAvlxbw9HsUm3_QQAWXVxfDlO1JyoY",
  "access_expires_at": "2026-10-29T14:44:20.678290474Z",
  "refresh_token": "gAtuOK4JLrFySSrFY4CVEfvSKmBE8BKtL-JT1rxNa_Q",
  "refresh_expires_at": "2026-10-30T02:29:20.677902921Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "8bc823ae-aebe-4f5e-8f52-138483e87b53",
  "session_id": "4222b453-ce60-47cf-a3e3-ac7ee4399360",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/8bc823ae-aebe-4f5e-8f52-138483e87b53/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "f1b01274-5de7-4f83-9acf-e887209ad694",
      "state": "READY",
      "created_at": "2026-10-29T14:29:15.588624Z",
      "ready_at": "2026-10-29T14:29:18.652719Z",
      "expires_at": "2026-11-05T14:29:18.652719Z",
      "size_bytes": 1028
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
  "device_ref": "sandbox-14802"
}
```

```json
{
  "challenge_id": "fda4cd4b-43ae-4577-bce3-2b8850233fa8",
  "expires_at": "2026-10-29T14:34:21.356039381Z",
  "resend_available_at": "2026-10-29T14:29:22.356039381Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "701921",
  "sent_at": "2026-10-29T14:29:21.358196619Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fda4cd4b-43ae-4577-bce3-2b8850233fa8",
  "code": "701921",
  "device_ref": "sandbox-14802"
}
```

```json
{
  "session_id": "3966403f-9e1f-48fa-b742-81fda2cdd1e4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA2MSwiaWF0IjoxNzkzMjg0MTYxLCJqdGkiOiJlMmIwYjc1Yi1iZGYwLTQzMWEtOTRkYi1hM2VmNGRmMGFmYjEiLCJzaWQiOiIzOTY2NDAzZi05ZTFmLTQ4ZmEtYjc0Mi04MWZkYTJjZGQxZTQifQ.xDhKOM1Y5eGmBqI3ewMTCeQ8pfxEXlVnE_9ziJfwbJ8",
  "access_expires_at": "2026-10-29T14:44:21.604535711Z",
  "refresh_token": "_7TVy6jFPO8Y2zi2gBW-Lvc7Bh0syaXR5l_7FNzHKzQ",
  "refresh_expires_at": "2026-11-28T14:29:21.60413654Z",
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
  "device_ref": "sandbox-11151"
}
```

```json
{
  "challenge_id": "6032d265-5d37-4bcb-9ec5-24f74116a2cc",
  "expires_at": "2026-10-29T14:34:22.054202097Z",
  "resend_available_at": "2026-10-29T14:29:23.054202097Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "663320",
  "sent_at": "2026-10-29T14:29:22.056216149Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6032d265-5d37-4bcb-9ec5-24f74116a2cc",
  "code": "663320",
  "device_ref": "sandbox-11151"
}
```

```json
{
  "session_id": "d6df1c7a-5dbd-4698-8e6b-bdbb423c7ef8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA2MiwiaWF0IjoxNzkzMjg0MTYyLCJqdGkiOiI5ZGM3ZDhjMi04ZjUzLTQwYTQtOWU2MS0xZmRhNDdkNzU5NmIiLCJzaWQiOiJkNmRmMWM3YS01ZGJkLTQ2OTgtOGU2Yi1iZGJiNDIzYzdlZjgifQ.rKieYxJwBQEtzimNFNKm71JHvDjIEQDTbOBWTMNLHlY",
  "access_expires_at": "2026-10-29T14:44:22.3094845Z",
  "refresh_token": "NyqUwWr9gur3bYzHtGyVoTYVJtXsa4TSLMwmvzzJwIY",
  "refresh_expires_at": "2026-11-28T14:29:22.308927677Z",
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
  "command_id": "c3380a1b-9d1a-46db-a7ed-98e7a49180d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:22Z",
    "sequence": 1793284162754
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1bce2655-3737-4020-8189-7928b7514dcf",
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
  "last_heartbeat_at": "2026-10-29T14:29:22.771491Z",
  "last_location_at": "2026-10-29T14:29:22.771491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-19699"
}
```

```json
{
  "challenge_id": "ae6ad1c3-36d0-4e97-9ba0-e430b9932424",
  "expires_at": "2026-10-29T14:34:23.00030854Z",
  "resend_available_at": "2026-10-29T14:29:24.00030854Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "954370",
  "sent_at": "2026-10-29T14:29:23.002677112Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ae6ad1c3-36d0-4e97-9ba0-e430b9932424",
  "code": "954370",
  "device_ref": "sandbox-19699"
}
```

```json
{
  "session_id": "4f549986-ee18-434d-a904-a1c0b23b190e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA2MywiaWF0IjoxNzkzMjg0MTYzLCJqdGkiOiJlZTVhMWIyZi1jNzliLTQ2OTEtOTNiNi1mYWQ1MWZkMGUzZGIiLCJzaWQiOiI0ZjU0OTk4Ni1lZTE4LTQzNGQtYTkwNC1hMWMwYjIzYjE5MGUifQ.joH2tW_-a08ZGXuzD99iSwjIKZq42jeK3VkgALuWJnI",
  "access_expires_at": "2026-10-29T14:44:23.252612644Z",
  "refresh_token": "TBdkO3klHxhbiNfq7RQZUHz-CC_stEc2yGQiXMtA2qk",
  "refresh_expires_at": "2026-11-28T14:29:23.252104219Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b86c370-5baa-4799-ab0d-3cc115df4924",
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
  "last_heartbeat_at": "2026-10-29T14:28:00.098382Z",
  "last_location_at": "2026-10-29T14:28:00.098382Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5b86c370-5baa-4799-ab0d-3cc115df4924/handover` → **200**

```json
{
  "command_id": "8f6097ec-2186-4940-b401-866930819c13",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b86c370-5baa-4799-ab0d-3cc115df4924",
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
  "last_heartbeat_at": "2026-10-29T14:28:00.098382Z",
  "last_location_at": "2026-10-29T14:28:00.098382Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/5b86c370-5baa-4799-ab0d-3cc115df4924/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:23Z",
    "sequence": 1793284163936
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "5b86c370-5baa-4799-ab0d-3cc115df4924",
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
  "last_heartbeat_at": "2026-10-29T14:29:23.953297Z",
  "last_location_at": "2026-10-29T14:29:23.953297Z",
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
  "session_id": "94372f7c-3a5d-4c48-baec-9b3e5048438e",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNjQsImlhdCI6MTc5MzI4NDE2NCwianRpIjoiNWUzZGZhMTktMmM5My00ZWNiLThlZDktZGVhMTdlYzhjNDg1Iiwic2lkIjoiOTQzNzJmN2MtM2E1ZC00YzQ4LWJhZWMtOWIzZTUwNDg0MzhlIn0.LGrsQMlSsUkhgdQucok6-42WknjEEF4ok0W8RY8-Ims",
  "access_expires_at": "2026-10-29T14:44:24.444520839Z",
  "refresh_token": "swPRjQpt8rqX37_epg6ygOawiHLRRIBiWF9H72e83Yg",
  "refresh_expires_at": "2026-10-30T02:29:24.444024987Z",
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
  "session_id": "5176e2e4-9a9f-4922-ad16-caf8455cd63b",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNjQsImlhdCI6MTc5MzI4NDE2NCwianRpIjoiNTM4ZmIxYWEtZWJlMi00NjA2LWFlYjQtMzZkNDk1NGE0NjhiIiwic2lkIjoiNTE3NmUyZTQtOWE5Zi00OTIyLWFkMTYtY2FmODQ1NWNkNjNiIn0.WeeM4_Puw1wkUp0cFmnGWrsorCh2ycl4xP3u2xQTvI0",
  "access_expires_at": "2026-10-29T14:44:24.935250457Z",
  "refresh_token": "jtkVGTlxtVimBrCFHTn74PQK9gdkwpSOs5FI4tyn6E4",
  "refresh_expires_at": "2026-10-30T02:29:24.934817765Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380684420883",
  "device_ref": "sandbox-26517"
}
```

```json
{
  "challenge_id": "58ffecbd-b028-4d3b-85c2-9bb202482a8e",
  "expires_at": "2026-10-29T14:34:25.169530938Z",
  "resend_available_at": "2026-10-29T14:29:26.169530938Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380684420883` → **200**

```json
{
  "phone": "+380684420883",
  "audience": "CLIENT",
  "code": "895511",
  "sent_at": "2026-10-29T14:29:25.172531768Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "58ffecbd-b028-4d3b-85c2-9bb202482a8e",
  "code": "895511",
  "device_ref": "sandbox-26517"
}
```

```json
{
  "session_id": "69cc198f-78cc-44a2-84bd-4526655a76d0",
  "subject": {
    "type": "CLIENT",
    "id": "77e343e5-4a37-49d2-8f79-80f58066087d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2UzNDNlNS00YTM3LTQ5ZDItOGY3OS04MGY1ODA2NjA4N2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDY1LCJpYXQiOjE3OTMyODQxNjUsImp0aSI6IjExMWU3YmM5LTc3ODItNDQwNi05ZGUzLWU3NDg1YjE3MmMyYSIsInNpZCI6IjY5Y2MxOThmLTc4Y2MtNDRhMi04NGJkLTQ1MjY2NTVhNzZkMCJ9.5sChDceP8JJahJb_T1bXfYjYbBoZIlB0O_nuUGtZWyI",
  "access_expires_at": "2026-10-29T14:44:25.493773704Z",
  "refresh_token": "-lrdXbkEI6iT6v915irTlWhlt9t85cwbV0Im4sfJkug",
  "refresh_expires_at": "2026-11-28T14:29:25.493164065Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e8ab2baa-6d64-434d-a90d-05ad44e96dd6",
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
  "id": "13cde868-41b0-44ce-9b27-8c0ea129657b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:25.733778Z",
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
  "command_id": "ef5d218c-3e6b-4a5d-b4e8-c854fbc7db0d",
  "quote_id": "13cde868-41b0-44ce-9b27-8c0ea129657b",
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
  "id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "77e343e5-4a37-49d2-8f79-80f58066087d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:25.969654Z",
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
    "id": "d58125e0-0ed5-42b2-82eb-d46046db83a8",
    "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
    "expires_at": "2026-10-29T14:29:40.972144Z",
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

`POST /api/driver/v1/offers/d58125e0-0ed5-42b2-82eb-d46046db83a8/reject` → **204**

```json
{
  "command_id": "8d373883-204a-4e79-a252-c146b2f4480c"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "1e41bc77-7030-458a-b240-3b80bae618f6",
    "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
    "expires_at": "2026-10-29T14:29:41.440241Z",
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

`POST /api/driver/v1/offers/1e41bc77-7030-458a-b240-3b80bae618f6/accept` → **200**

```json
{
  "command_id": "904f2640-0cfa-4de7-bac1-e759b728e950"
}
```

```json
{
  "id": "e5a15841-79cd-4444-b247-63169c2d7437",
  "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3d42e92c-573f-49e7-a3be-9d261b851785",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/5cee08f8-7d73-47b0-8691-6c3833c474a5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:25.969989Z",
      "actor": {
        "type": "CLIENT",
        "id": "77e343e5-4a37-49d2-8f79-80f58066087d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
        "quote_id": "13cde868-41b0-44ce-9b27-8c0ea129657b",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "2a237ead-0e1a-4f42-83bf-59839d83581e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:25.971634Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
        "attempt_id": "3381fe38-2ecc-4552-8127-e42ea8c2547f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2a237ead-0e1a-4f42-83bf-59839d83581e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:29:25.974231Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d58125e0-0ed5-42b2-82eb-d46046db83a8",
        "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "2a237ead-0e1a-4f42-83bf-59839d83581e"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T14:29:26.43944Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "d58125e0-0ed5-42b2-82eb-d46046db83a8",
        "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5"
      },
      "correlation_id": "f9e4527c-27aa-40df-a525-ed8bca398a1f"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order 5cee08f8-7d73-47b0-8691-6c3833c474a5 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/5cee08f8-7d73-47b0-8691-6c3833c474a5` → **200**

```json
{
  "id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "77e343e5-4a37-49d2-8f79-80f58066087d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e5a15841-79cd-4444-b247-63169c2d7437",
    "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "3d42e92c-573f-49e7-a3be-9d261b851785",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:29:25.969654Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/5cee08f8-7d73-47b0-8691-6c3833c474a5/cancel` → **200**

```json
{
  "command_id": "ad7c8466-3dda-4985-b089-203af6753fae",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "77e343e5-4a37-49d2-8f79-80f58066087d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "e5a15841-79cd-4444-b247-63169c2d7437",
    "order_id": "5cee08f8-7d73-47b0-8691-6c3833c474a5",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "3d42e92c-573f-49e7-a3be-9d261b851785",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:29:25.969654Z",
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
  "session_id": "1bce2655-3737-4020-8189-7928b7514dcf",
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
  "last_heartbeat_at": "2026-10-29T14:29:22.771491Z",
  "last_location_at": "2026-10-29T14:29:22.771491Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1bce2655-3737-4020-8189-7928b7514dcf/close` → **200**

```json
{
  "command_id": "621349f8-fe46-4dee-ba68-05c4c9cbf007",
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
  "session_id": "5b86c370-5baa-4799-ab0d-3cc115df4924",
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
  "last_heartbeat_at": "2026-10-29T14:29:23.953297Z",
  "last_location_at": "2026-10-29T14:29:23.953297Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5b86c370-5baa-4799-ab0d-3cc115df4924/close` → **200**

```json
{
  "command_id": "e783f88f-13f7-4729-aee9-5e3015a2e06d",
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
  "session_id": "a1bbd10d-2751-43d8-aa1d-d4f8fd2cb859",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwNjgsImlhdCI6MTc5MzI4NDE2OCwianRpIjoiOGEyOWYxY2EtZDYzMS00NjNjLWJjYTQtZWVhNjRlMjI0YTc1Iiwic2lkIjoiYTFiYmQxMGQtMjc1MS00M2Q4LWFhMWQtZDRmOGZkMmNiODU5In0.u-mFykemWd0n_4lPd_flxWznojDtSOrO1EHWxqIhuD4",
  "access_expires_at": "2026-10-29T14:44:28.951328626Z",
  "refresh_token": "V8rg3l6WAuC3_fbjnHXtpSukK5tmJIGUpLprJMW5u1w",
  "refresh_expires_at": "2026-10-30T02:29:28.950903966Z",
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
  "command_id": "8b01e415-cb30-49ad-8373-39502bd7c316",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T14:29:29.419181Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "0948e380-cd55-47f9-9b0d-fa5223f279e8",
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
  "correlation_id": "1ba7e836-e581-4fd8-95e8-5e832ee9ffa2"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "a84d82d4-123a-4b71-9ca3-bcb2ebc665ef",
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
  "correlation_id": "4b1d9f38-7a23-42f4-b12c-0c49b131723d"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635078977",
  "device_ref": "sandbox-7172"
}
```

```json
{
  "challenge_id": "74e680d5-9d6c-49bf-a185-a6b1f5ca725e",
  "expires_at": "2026-10-29T14:34:30.117882347Z",
  "resend_available_at": "2026-10-29T14:29:31.117882347Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635078977` → **200**

```json
{
  "phone": "+380635078977",
  "audience": "CLIENT",
  "code": "409061",
  "sent_at": "2026-10-29T14:29:30.120022201Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74e680d5-9d6c-49bf-a185-a6b1f5ca725e",
  "code": "409061",
  "device_ref": "sandbox-7172"
}
```

```json
{
  "session_id": "1e9b4ab0-5181-4671-8287-925e9eb8c780",
  "subject": {
    "type": "CLIENT",
    "id": "ecde1806-5799-4563-b776-065a8b965113"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlY2RlMTgwNi01Nzk5LTQ1NjMtYjc3Ni0wNjVhOGI5NjUxMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDcwLCJpYXQiOjE3OTMyODQxNzAsImp0aSI6IjA2OWMyZjA4LTJmMGMtNDY1MC05NDVjLWMyMjQ4MWFmNmUxMyIsInNpZCI6IjFlOWI0YWIwLTUxODEtNDY3MS04Mjg3LTkyNWU5ZWI4Yzc4MCJ9.0gVVwW9dK9F8F-nAS0P7Z5drKF6mA8ObI8W9OlIdxNY",
  "access_expires_at": "2026-10-29T14:44:30.361205223Z",
  "refresh_token": "ozG-7R-XhERjZEkxr3RKMzg6BHX9Hqprh2A-penQvaU",
  "refresh_expires_at": "2026-11-28T14:29:30.360845702Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91f9ef0d-1cbf-4ca1-99a7-a4eb2efb468e",
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
  "id": "a84bec90-52fe-4627-afbe-8a343f333431",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:30.597315Z",
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
  "command_id": "724bec3d-2385-4732-98f3-ff25b4043b43",
  "quote_id": "a84bec90-52fe-4627-afbe-8a343f333431",
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
  "correlation_id": "b72174f8-f8ec-4f22-9c83-79f4f7ee538f"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "803466b9-744f-4d92-b737-66c78c77abe4",
  "quote_id": "a84bec90-52fe-4627-afbe-8a343f333431",
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
  "id": "2d9798a3-60c7-4b4d-ac2d-26aa26a74133",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ecde1806-5799-4563-b776-065a8b965113",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:31.080762Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/2d9798a3-60c7-4b4d-ac2d-26aa26a74133/cancel` → **200**

```json
{
  "command_id": "9e290076-3413-4332-902c-f0fedd5e67fe",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "2d9798a3-60c7-4b4d-ac2d-26aa26a74133",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "ecde1806-5799-4563-b776-065a8b965113",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:29:31.080762Z",
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
  "command_id": "155ab6f3-1bee-4604-9c3d-0a057cd31c3d",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T14:29:31.565632Z"
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
      "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T14:29:31.565632Z"
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
  "device_ref": "sandbox-30540"
}
```

```json
{
  "challenge_id": "393dd4a0-2eeb-421b-908f-6b7e374c7c56",
  "expires_at": "2026-10-29T14:34:32.249539607Z",
  "resend_available_at": "2026-10-29T14:29:33.249539607Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "566678",
  "sent_at": "2026-10-29T14:29:32.251783356Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "393dd4a0-2eeb-421b-908f-6b7e374c7c56",
  "code": "566678",
  "device_ref": "sandbox-30540"
}
```

```json
{
  "session_id": "ad30ba49-b439-48b0-bbf6-eda41d38f208",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA3MiwiaWF0IjoxNzkzMjg0MTcyLCJqdGkiOiIxY2VkN2Y1MC02MmU5LTQwZDktYmU1Yy01OGYwZjVhMTRjN2EiLCJzaWQiOiJhZDMwYmE0OS1iNDM5LTQ4YjAtYmJmNi1lZGE0MWQzOGYyMDgifQ.kCTDirIY46RWFsCpgof-HRe1JOaF0kJ2Ff1Go8vnb2A",
  "access_expires_at": "2026-10-29T14:44:32.511811214Z",
  "refresh_token": "o9smnBouepOGe9mspq7F57rIz9SP-NTB70fi01qj7Ik",
  "refresh_expires_at": "2026-11-28T14:29:32.511309163Z",
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
  "command_id": "a0ebceaa-7899-4907-b505-53fee7dab2ef",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:32Z",
    "sequence": 1793284172957
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:32.974015Z",
  "last_location_at": "2026-10-29T14:29:32.974015Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380677587246",
  "device_ref": "sandbox-27356"
}
```

```json
{
  "challenge_id": "558cdaf6-5a7b-4abc-8a5a-a6db29299acf",
  "expires_at": "2026-10-29T14:34:33.1988953Z",
  "resend_available_at": "2026-10-29T14:29:34.1988953Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380677587246` → **200**

```json
{
  "phone": "+380677587246",
  "audience": "CLIENT",
  "code": "359718",
  "sent_at": "2026-10-29T14:29:33.253532266Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "558cdaf6-5a7b-4abc-8a5a-a6db29299acf",
  "code": "359718",
  "device_ref": "sandbox-27356"
}
```

```json
{
  "session_id": "c8d903ab-80d6-4248-a6af-e437badfabcf",
  "subject": {
    "type": "CLIENT",
    "id": "29b28cea-d40b-4cf2-96df-a6576e3625d4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWIyOGNlYS1kNDBiLTRjZjItOTZkZi1hNjU3NmUzNjI1ZDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDczLCJpYXQiOjE3OTMyODQxNzMsImp0aSI6ImFmNTU3NmFjLWZiNTYtNDVhYS04YjRmLTE1YzM5ZGM3YWU3ZiIsInNpZCI6ImM4ZDkwM2FiLTgwZDYtNDI0OC1hNmFmLWU0MzdiYWRmYWJjZiJ9.jb8HaUpXR1NPj6Bv1wZ9ZtnzkeBwIMUiwkoFMY4META",
  "access_expires_at": "2026-10-29T14:44:33.487931571Z",
  "refresh_token": "oDXAboUXNKsoLnjT_hc5cfu-OrJfX9ahWFpaVucMEAs",
  "refresh_expires_at": "2026-11-28T14:29:33.487504067Z",
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
  "command_id": "8ba9ac1a-d4d1-41ff-9f98-f39e3d52bb44",
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
  "id": "b7ddb833-848e-428b-8f94-b3acd1f644c7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:33.936227Z",
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
  "command_id": "990b4665-bf86-47e8-9986-a0a986af905f",
  "platform": "ANDROID",
  "token": "sandbox-driver-52464bb9-db49-48dd-9109-8d96dcad91cb"
}
```

```json
{
  "id": "4406e3a1-e3fb-40e8-ade1-6b29b4d13946",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:29:34.169791Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "ac0f59ea-52e1-4f36-96a6-54c7101a5733",
  "platform": "ANDROID",
  "token": "sandbox-rider-0ed5d099-c1bc-49a6-9934-7d5b27640bf3"
}
```

```json
{
  "id": "dd8bf9ee-c66f-4ae2-8995-791c57a1e204",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T14:29:34.400244Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "566fb980-3d8d-42bf-8a39-ee23fa372528",
  "quote_id": "b7ddb833-848e-428b-8f94-b3acd1f644c7",
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
  "id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "29b28cea-d40b-4cf2-96df-a6576e3625d4",
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
  "created_at": "2026-10-29T14:29:34.630147Z",
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
    "id": "47b1350a-d712-403d-88a6-594204ed20fa",
    "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
    "expires_at": "2026-10-29T14:29:49.632384Z",
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

`POST /api/driver/v1/offers/47b1350a-d712-403d-88a6-594204ed20fa/accept` → **200**

```json
{
  "command_id": "2a47f7af-1cb7-40f8-a62f-c9a58e47e6a0"
}
```

```json
{
  "id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T14:29:34.609Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:29:34.832132128Z",
    "token_suffix": "ad91cb",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "type": "driver.offer",
      "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
      "order_version": "2",
      "event_id": "3e83e919-13a8-4ba2-b363-024b88c267c4",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380677587246&after=2026-10-29T14:29:34.609Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380677587246&after=2026-10-29T14:29:34.609Z` → **200**

```json
[
  {
    "at": "2026-10-29T14:29:35.837339413Z",
    "token_suffix": "640bf3",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "type": "rider.driver-assigned",
      "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
      "order_version": "3",
      "event_id": "2abb4bd7-4c5f-4e5f-9d8a-42d669c9a639",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/2a794f07-733f-422a-be37-bbda77ff21fc/messages` → **201**

```json
{
  "command_id": "0cc4a132-62cd-44f5-980b-31107701dcf3",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "8b38cbee-478a-4324-83a9-6dbbb5eea098",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T14:29:36.404188982Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "assignment_id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
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

`POST /api/driver/v1/trips/d3b36cf8-dca7-4a48-9869-09e254bd2339/messages` → **201**

```json
{
  "command_id": "de9cf8f0-b109-4ada-b970-5830b86096b1",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "37752200-287b-4241-9fce-5f59f410ef8e",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T14:29:36.847336376Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/2a794f07-733f-422a-be37-bbda77ff21fc/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/d3b36cf8-dca7-4a48-9869-09e254bd2339/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380677587246"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:37Z",
    "sequence": 1793284177502
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:37.518205Z",
  "last_location_at": "2026-10-29T14:29:37.518205Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "assignment_id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
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

`POST /api/driver/v1/trips/d3b36cf8-dca7-4a48-9869-09e254bd2339/arrive` → **200**

```json
{
  "command_id": "6ff4e4d6-38b2-4711-9079-11f499c49b2a",
  "expected_version": 0
}
```

```json
{
  "id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "assignment_id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
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
  "arrived_at": "2026-10-29T14:29:37.961151Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/d3b36cf8-dca7-4a48-9869-09e254bd2339/start` → **200**

```json
{
  "command_id": "c89cec80-35c5-4d15-b90e-d9fec656d466",
  "expected_version": 1
}
```

```json
{
  "id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "assignment_id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
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
  "arrived_at": "2026-10-29T14:29:37.961151Z",
  "started_at": "2026-10-29T14:29:38.192517Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:38Z",
    "sequence": 1793284178415
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:38.432268Z",
  "last_location_at": "2026-10-29T14:29:38.432268Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/d3b36cf8-dca7-4a48-9869-09e254bd2339/complete` → **200**

```json
{
  "command_id": "2297213f-ec6f-41e8-9555-33a2c699a926",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:29:38Z",
  "cash_received": true
}
```

```json
{
  "id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "assignment_id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
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
  "arrived_at": "2026-10-29T14:29:37.961151Z",
  "started_at": "2026-10-29T14:29:38.192517Z",
  "completed_at": "2026-10-29T14:29:38.665411Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/2a794f07-733f-422a-be37-bbda77ff21fc` → **200**

```json
{
  "id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "29b28cea-d40b-4cf2-96df-a6576e3625d4",
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
    "id": "6d75b4f4-3368-47c7-a958-d2abc499d194",
    "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:29:34.630147Z",
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
    "id": "2a794f07-733f-422a-be37-bbda77ff21fc",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:29:34.630147Z",
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
    "id": "d3b36cf8-dca7-4a48-9869-09e254bd2339",
    "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
    "order_short_number": 13,
    "created_at": "2026-10-29T14:29:35.103226Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "d30e46c8-9c92-428e-9f10-e4ae1dcc3724",
    "order_id": "3043116b-fa84-4431-864b-a3b0df8c8f34",
    "order_short_number": 8,
    "created_at": "2026-10-29T14:28:31.401735Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "081d76c8-325e-4772-8605-2d2e7077bc44",
    "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
    "order_short_number": 3,
    "created_at": "2026-10-29T14:27:51.943872Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "9db6e5ec-9beb-40da-b40f-c7cb4dc31f61",
    "order_id": "27325a07-6361-4f4c-bf77-68a1623f9aa2",
    "order_short_number": 2,
    "created_at": "2026-10-29T14:27:38.38953Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "36bd5910-d377-4b9d-b9ba-3852d00f6ce3",
    "order_id": "da186a2f-2116-4306-8ac6-774beae1cb1e",
    "order_short_number": 1,
    "created_at": "2026-10-29T14:27:30.200969Z",
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

`GET /api/rider/v1/orders/2a794f07-733f-422a-be37-bbda77ff21fc/tip` → **200**

```json
{
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
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
  "available_until": "2026-10-30T14:29:38.665411Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/2a794f07-733f-422a-be37-bbda77ff21fc/tip` → **201**

```json
{
  "command_id": "9bd30b8c-3333-41c8-a9da-3a199f000326",
  "amount_minor": 1100
}
```

```json
{
  "id": "135a6901-04d7-4d84-a952-bf7538d979d4",
  "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T14:29:43.311713Z"
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
  "session_id": "fdbc3cf6-e5f5-4896-9b40-ec8338ebfbb0",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwODMsImlhdCI6MTc5MzI4NDE4MywianRpIjoiNTkyNGZlNDAtZGQxZi00OTVlLTg0MmQtMmYxNTAxYzU0Y2NhIiwic2lkIjoiZmRiYzNjZjYtZTVmNS00ODk2LTliNDAtZWM4MzM4ZWJmYmIwIn0.JkQ4yJh0RzJ4hVKoJO4a3MAuDNQypPwDicDjPK_Tr-0",
  "access_expires_at": "2026-10-29T14:44:43.802421264Z",
  "refresh_token": "7cQm9mDUIaQ6-yWQT-IOrc_KCQK-wFWfkVCetyCoBD8",
  "refresh_expires_at": "2026-10-30T02:29:43.802030555Z",
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
      "CASH": 11,
      "CARD": 2
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
  "generated_at": "2026-10-29T14:29:44.093109489Z"
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
  "generated_at": "2026-10-29T14:29:44.358964245Z"
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
  "session_id": "4310315e-60fa-4018-8c63-454795134b91",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwODQsImlhdCI6MTc5MzI4NDE4NCwianRpIjoiMjViN2FkYTYtYzM2OS00NDg2LWE5YzItZDYxNGM3OWYyNzEwIiwic2lkIjoiNDMxMDMxNWUtNjBmYS00MDE4LThjNjMtNDU0Nzk1MTM0YjkxIn0.T8YqFGfVpnTlWDKp_zRkULnh8fvWTAkKIrkxnOrhCFM",
  "access_expires_at": "2026-10-29T14:44:44.843719682Z",
  "refresh_token": "yA3Fsn8Fg4wbXSN4ts2sDGJHjSM_0y6tHhPVtvAxWhU",
  "refresh_expires_at": "2026-10-30T02:29:44.843278618Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/2a794f07-733f-422a-be37-bbda77ff21fc/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:34.630535Z",
      "actor": {
        "type": "CLIENT",
        "id": "29b28cea-d40b-4cf2-96df-a6576e3625d4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
        "quote_id": "b7ddb833-848e-428b-8f94-b3acd1f644c7",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "6d9d524d-2ffe-4c97-b911-08e6557ed893"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:34.631871Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
        "attempt_id": "418de972-4ea2-4075-b13a-7b082a001e80",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "6d9d524d-2ffe-4c97-b911-08e6557ed893"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:29:34.633773Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "47b1350a-d712-403d-88a6-594204ed20fa",
        "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "6d9d524d-2ffe-4c97-b911-08e6557ed893"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:29:35.10453Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "47b1350a-d712-403d-88a6-594204ed20fa",
        "order_id": "2a794f07-733f-422a-be37-bbda77ff21fc",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "6d75b4f4-3368-47c7-a958-d2abc499d194"
      },
      "correlation_id": "e48d0f3c-fec2-4439-922e-edea43245c5d"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T14:29:45.307006768Z",
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
      "last_location_at": "2026-10-29T14:29:38.432268Z",
      "order_id": null
    }
  ]
}
```

Done: order 2a794f07-733f-422a-be37-bbda77ff21fc.

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
  "session_id": "b6c666d3-bec7-4de8-a332-29e6da9c2e5e",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwODUsImlhdCI6MTc5MzI4NDE4NSwianRpIjoiMWQ3YjA1NDYtYTE0ZC00NDlmLTkyMmItNWU5ZTQwNTY2NzAxIiwic2lkIjoiYjZjNjY2ZDMtYmVjNy00ZGU4LWEzMzItMjllNmRhOWMyZTVlIn0.T-Sp8sg_8r2bWoZmacm_iwf9YsLa7VCR8a3KnIjTWWQ",
  "access_expires_at": "2026-10-29T14:44:45.804888452Z",
  "refresh_token": "JDOMjbVBGnSEpTG3yzuJ1pN0d_TWumyUipf_I5XTogo",
  "refresh_expires_at": "2026-10-30T02:29:45.804414843Z",
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
  "command_id": "1b168f80-a6c6-40f1-b7cd-595e218b4f6a",
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
  "timestamp": "2026-10-29T14:29:46.000+0000",
  "channel": {
    "id": "1730052000.1495520977",
    "linkedid": "1730052000.1495520977",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673470168"
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
  "timestamp": "2026-10-29T14:29:46.000+0000",
  "channel": {
    "id": "1730052000.1495520977",
    "linkedid": "1730052000.1495520977",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380673470168"
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
  "session_id": "f02cee60-a1e4-4710-ac97-4cd3a81641c8",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwODYsImlhdCI6MTc5MzI4NDE4NiwianRpIjoiMTRmOWIyM2MtZGM5Ni00ZTg0LWI1YzQtMjUxYmQyMzliNTI1Iiwic2lkIjoiZjAyY2VlNjAtYTFlNC00NzEwLWFjOTctNGNkM2E4MTY0MWM4In0.nNGKdR-ko4G1mGehKE_NgPdVJHYaXdwtYQdCdZBdEvA",
  "access_expires_at": "2026-10-29T14:44:46.779924363Z",
  "refresh_token": "5U7a6C6KgF7KLSZx6Y26SEC1YCttbPVcXfUnQRhraSQ",
  "refresh_expires_at": "2026-10-30T02:29:46.779494847Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "713d2d78-1264-4fa8-a8e7-1ecd41528a9b",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380673470168",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T14:29:46Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/713d2d78-1264-4fa8-a8e7-1ecd41528a9b/answer` → **200**

```json
{
  "command_id": "b43f85bd-56b5-4cf5-9194-bed024fa73b1"
}
```

```json
{
  "id": "713d2d78-1264-4fa8-a8e7-1ecd41528a9b",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380673470168",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "order_ids": [],
  "started_at": "2026-10-29T14:29:46Z",
  "answered_at": "2026-10-29T14:29:47.239844Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.1495520977",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "a05ae9a2-43c0-4928-ae17-03ec025607c1",
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
  "id": "5bfb1600-934e-4576-8e69-be21908bcefa",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:47.496759Z",
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
  "command_id": "9cd40e8d-bb3e-4f5f-90a7-6f8ef32ec69d",
  "quote_id": "5bfb1600-934e-4576-8e69-be21908bcefa",
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
    "phone": "+380673470168"
  },
  "call_id": "713d2d78-1264-4fa8-a8e7-1ecd41528a9b"
}
```

```json
{
  "id": "e6434c7a-9135-4e91-88d2-ce5942de0afa",
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
  "created_at": "2026-10-29T14:29:47.736783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470168"
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
    "id": "1730052000.1495520977",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "713d2d78-1264-4fa8-a8e7-1ecd41528a9b",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673470168",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [
        "e6434c7a-9135-4e91-88d2-ce5942de0afa"
      ],
      "started_at": "2026-10-29T14:29:46Z",
      "answered_at": "2026-10-29T14:29:47.239844Z",
      "ended_at": "2026-10-29T14:29:47.99326Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "fdfeb90d-bbc6-45d7-b10b-2f0641bb49b3",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380673663221",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [],
      "started_at": "2026-10-29T14:27:45.925731Z",
      "answered_at": "2026-10-29T14:27:46.185175Z",
      "ended_at": "2026-10-29T14:27:46.451632Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:27:48.540492Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/e6434c7a-9135-4e91-88d2-ce5942de0afa` → **200**

```json
{
  "id": "e6434c7a-9135-4e91-88d2-ce5942de0afa",
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
  "created_at": "2026-10-29T14:29:47.736783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470168"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/e6434c7a-9135-4e91-88d2-ce5942de0afa` → **200**

```json
{
  "id": "e6434c7a-9135-4e91-88d2-ce5942de0afa",
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
  "created_at": "2026-10-29T14:29:47.736783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470168"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/e6434c7a-9135-4e91-88d2-ce5942de0afa/cancel` → **200**

```json
{
  "command_id": "1f000a83-8db9-4e37-904a-fee4cc077ab9",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "e6434c7a-9135-4e91-88d2-ce5942de0afa",
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
  "created_at": "2026-10-29T14:29:47.736783Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673470168"
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

Done: call 713d2d78-1264-4fa8-a8e7-1ecd41528a9b with order e6434c7a-9135-4e91-88d2-ce5942de0afa.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-5986"
}
```

```json
{
  "challenge_id": "a68ec8ff-574a-40d0-8259-08ff37eb4aab",
  "expires_at": "2026-10-29T14:34:49.050077174Z",
  "resend_available_at": "2026-10-29T14:29:50.050077174Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "314482",
  "sent_at": "2026-10-29T14:29:49.183640939Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a68ec8ff-574a-40d0-8259-08ff37eb4aab",
  "code": "314482",
  "device_ref": "sandbox-5986"
}
```

```json
{
  "session_id": "10250aa0-d6cb-4bea-bad7-9423975261ae",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA4OSwiaWF0IjoxNzkzMjg0MTg5LCJqdGkiOiIyMjYwYzZiOC02OTkwLTQ2OWYtYmUyZi0zYmQ2NmZiNGE0MmMiLCJzaWQiOiIxMDI1MGFhMC1kNmNiLTRiZWEtYmFkNy05NDIzOTc1MjYxYWUifQ.WUUxvJhvPcYSM8S_qUSMkyPibVryOB7TF3b-fyoJu2I",
  "access_expires_at": "2026-10-29T14:44:49.427135265Z",
  "refresh_token": "Hw9FpUNZoCc_55oID6p3rMTdSsQ84x2G2BPfmrOdI5I",
  "refresh_expires_at": "2026-11-28T14:29:49.426655989Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:38.432268Z",
  "last_location_at": "2026-10-29T14:29:38.432268Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/handover` → **200**

```json
{
  "command_id": "25d6c75e-a2b7-40d6-a2d3-b6449f22dfdf",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:38.432268Z",
  "last_location_at": "2026-10-29T14:29:38.432268Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:50Z",
    "sequence": 1793284190108
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:50.12416Z",
  "last_location_at": "2026-10-29T14:29:50.12416Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380664432278",
  "device_ref": "sandbox-18426"
}
```

```json
{
  "challenge_id": "4d960d9a-28d3-4189-8998-e788eee881d9",
  "expires_at": "2026-10-29T14:34:50.345834844Z",
  "resend_available_at": "2026-10-29T14:29:51.345834844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380664432278` → **200**

```json
{
  "phone": "+380664432278",
  "audience": "CLIENT",
  "code": "813956",
  "sent_at": "2026-10-29T14:29:50.347881426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4d960d9a-28d3-4189-8998-e788eee881d9",
  "code": "813956",
  "device_ref": "sandbox-18426"
}
```

```json
{
  "session_id": "d751df4b-d7f4-4e20-9733-eaa6cf469b4d",
  "subject": {
    "type": "CLIENT",
    "id": "82db7307-745c-460a-a296-9bcc9133e71e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MmRiNzMwNy03NDVjLTQ2MGEtYTI5Ni05YmNjOTEzM2U3MWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MDkwLCJpYXQiOjE3OTMyODQxOTAsImp0aSI6IjYxZDVkZWRhLWZlZjUtNDk3Ny1hNjdjLWRmNjBkZjM2NzAzNyIsInNpZCI6ImQ3NTFkZjRiLWQ3ZjQtNGUyMC05NzMzLWVhYTZjZjQ2OWI0ZCJ9.H2pPqOE6j7lR5_GBYnkRTjT-TzXHEc9dWHxQdg8R6lg",
  "access_expires_at": "2026-10-29T14:44:50.594173702Z",
  "refresh_token": "FWh21UurJutBVDyOqtS5J7U3iYv36qMIjgs71du8_-0",
  "refresh_expires_at": "2026-11-28T14:29:50.593720039Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "4301eba1-82b7-4797-98d5-2b1ee147c1bc",
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
  "id": "92e987d2-9363-4cb8-91c4-eb9a80e6bc92",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:34:50.821657Z",
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
  "command_id": "691da006-861c-462e-8a17-8c6f8e5e5e90",
  "quote_id": "92e987d2-9363-4cb8-91c4-eb9a80e6bc92",
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
  "id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "82db7307-745c-460a-a296-9bcc9133e71e",
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
  "created_at": "2026-10-29T14:29:51.061845Z",
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
    "id": "5ec9b3c6-1f21-4bf0-9a56-3a00ac7122dc",
    "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
    "expires_at": "2026-10-29T14:30:06.064263Z",
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

`POST /api/driver/v1/offers/5ec9b3c6-1f21-4bf0-9a56-3a00ac7122dc/accept` → **200**

```json
{
  "command_id": "fcc0a6d3-97ef-4163-8bef-ba0043c9f829"
}
```

```json
{
  "id": "72bb16bf-e786-4501-999e-1c95ad2ce924",
  "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f4e237c6-9458-4309-8674-112c126f4749",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f4e237c6-9458-4309-8674-112c126f4749",
  "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
  "assignment_id": "72bb16bf-e786-4501-999e-1c95ad2ce924",
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

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:51Z",
    "sequence": 1793284191964
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:51.980074Z",
  "last_location_at": "2026-10-29T14:29:51.980074Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f4e237c6-9458-4309-8674-112c126f4749/arrive` → **200**

```json
{
  "command_id": "bc1b6346-f84d-42de-8f2a-e65249dbd63b",
  "expected_version": 0
}
```

```json
{
  "id": "f4e237c6-9458-4309-8674-112c126f4749",
  "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
  "assignment_id": "72bb16bf-e786-4501-999e-1c95ad2ce924",
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
  "arrived_at": "2026-10-29T14:29:52.382541Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f4e237c6-9458-4309-8674-112c126f4749/start` → **200**

```json
{
  "command_id": "e19280cf-94c3-4b64-b1f0-4168f9976d4d",
  "expected_version": 1
}
```

```json
{
  "id": "f4e237c6-9458-4309-8674-112c126f4749",
  "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
  "assignment_id": "72bb16bf-e786-4501-999e-1c95ad2ce924",
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
  "arrived_at": "2026-10-29T14:29:52.382541Z",
  "started_at": "2026-10-29T14:29:52.620519Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:52Z",
    "sequence": 1793284192847
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:52.863434Z",
  "last_location_at": "2026-10-29T14:29:52.863434Z",
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
  "device_ref": "sandbox-17209"
}
```

```json
{
  "challenge_id": "a6f35b55-d5e2-48bd-a0ff-9b2c44b38013",
  "expires_at": "2026-10-29T14:34:53.079841948Z",
  "resend_available_at": "2026-10-29T14:29:54.079841948Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "908670",
  "sent_at": "2026-10-29T14:29:53.082149794Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6f35b55-d5e2-48bd-a0ff-9b2c44b38013",
  "code": "908670",
  "device_ref": "sandbox-17209"
}
```

```json
{
  "session_id": "f62bd8e8-f3b9-4241-980a-aed5e27f973e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTA5MywiaWF0IjoxNzkzMjg0MTkzLCJqdGkiOiI4Njk0OGNkNi1iMGMzLTQ1NTQtOWVjNi1lZTMyNWU4NDE5NjkiLCJzaWQiOiJmNjJiZDhlOC1mM2I5LTQyNDEtOTgwYS1hZWQ1ZTI3Zjk3M2UifQ.7tY6A-3S-H9Q-DyqpPL4TfX9lu6cPuHgS24bmMu-Lyo",
  "access_expires_at": "2026-10-29T14:44:53.339402078Z",
  "refresh_token": "D_Ab7EUrgBQZFPFhhXWJUwjYTM7jVmtVIZVJz8a4u7E",
  "refresh_expires_at": "2026-11-28T14:29:53.338887793Z",
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
  "command_id": "5cecbb74-bf14-4783-b133-df583026f8ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:53Z",
    "sequence": 1793284193779
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "71ad9c45-feaa-4582-8070-0af2d7c072fe",
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
  "last_heartbeat_at": "2026-10-29T14:29:53.795252Z",
  "last_location_at": "2026-10-29T14:29:53.795252Z",
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
  "session_id": "4e53dddb-c0c6-4713-ab7f-2803770c1960",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwOTQsImlhdCI6MTc5MzI4NDE5NCwianRpIjoiOWJjNjY5MjYtZWE5ZS00ZmFkLTkxY2MtNzY0OTk0OTY5MDVjIiwic2lkIjoiNGU1M2RkZGItYzBjNi00NzEzLWFiN2YtMjgwMzc3MGMxOTYwIn0.kGpjLZBBT9QaaiOsrb03xweBZGDmaYQzqdADQ6OgusA",
  "access_expires_at": "2026-10-29T14:44:54.280442712Z",
  "refresh_token": "VHS9u8_Cal3vgByKZSijXneev4afMCyevVs_oynyyV0",
  "refresh_expires_at": "2026-10-30T02:29:54.279969349Z",
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
  "session_id": "0af34dc9-955f-403c-8203-70196d23f4fd",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUwOTQsImlhdCI6MTc5MzI4NDE5NCwianRpIjoiNzIwMWM5NGUtNDRlMC00MDFmLWJmMzItYTVmZTU4YmM1N2QwIiwic2lkIjoiMGFmMzRkYzktOTU1Zi00MDNjLTgyMDMtNzAxOTZkMjNmNGZkIn0.cm7755E2leWEwFUliRyeJOnA1kKA0wR5cHOfbnC5FQw",
  "access_expires_at": "2026-10-29T14:44:54.765697032Z",
  "refresh_token": "8W1740ifSQxOwYVotRSc2liIJeKOt0DUsLDSofEajPw",
  "refresh_expires_at": "2026-10-30T02:29:54.765253494Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/d533bd00-f975-4243-b9b2-5a2b031b791c` → **200**

```json
{
  "id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "82db7307-745c-460a-a296-9bcc9133e71e",
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
    "id": "72bb16bf-e786-4501-999e-1c95ad2ce924",
    "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "f4e237c6-9458-4309-8674-112c126f4749",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T14:29:51.061845Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d533bd00-f975-4243-b9b2-5a2b031b791c/interrupt` → **200**

```json
{
  "command_id": "781135bb-9cc5-4b07-9059-5ab587bfe4dc",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "82db7307-745c-460a-a296-9bcc9133e71e",
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
      "id": "72bb16bf-e786-4501-999e-1c95ad2ce924",
      "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "f4e237c6-9458-4309-8674-112c126f4749",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T14:29:51.061845Z",
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
    "id": "0db3ab13-210d-4c38-b293-619293eba825",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "82db7307-745c-460a-a296-9bcc9133e71e",
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
    "id": "e230dd1f-5895-4511-b413-de1892564166",
    "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
    "expires_at": "2026-10-29T14:30:10.24289Z",
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

`POST /api/driver/v1/offers/e230dd1f-5895-4511-b413-de1892564166/accept` → **200**

```json
{
  "command_id": "22f7d66c-b0f4-4aae-aaa6-1aefe1ca5478"
}
```

```json
{
  "id": "8804d067-32c7-4b86-9c2d-7b788f0eb47c",
  "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "270afb0f-9c7d-42c7-aea6-4ee1ba384b00",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "270afb0f-9c7d-42c7-aea6-4ee1ba384b00",
  "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
  "assignment_id": "8804d067-32c7-4b86-9c2d-7b788f0eb47c",
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
  "session_id": "71ad9c45-feaa-4582-8070-0af2d7c072fe",
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
  "last_heartbeat_at": "2026-10-29T14:29:53.795252Z",
  "last_location_at": "2026-10-29T14:29:53.795252Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/71ad9c45-feaa-4582-8070-0af2d7c072fe/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:29:56Z",
    "sequence": 1793284196399
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "71ad9c45-feaa-4582-8070-0af2d7c072fe",
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
  "last_heartbeat_at": "2026-10-29T14:29:56.415557Z",
  "last_location_at": "2026-10-29T14:29:56.415557Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/270afb0f-9c7d-42c7-aea6-4ee1ba384b00/arrive` → **200**

```json
{
  "command_id": "78959f47-0ba1-4637-b1d5-b7eb4db47c53",
  "expected_version": 0
}
```

```json
{
  "id": "270afb0f-9c7d-42c7-aea6-4ee1ba384b00",
  "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
  "assignment_id": "8804d067-32c7-4b86-9c2d-7b788f0eb47c",
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
  "arrived_at": "2026-10-29T14:29:56.648413Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/270afb0f-9c7d-42c7-aea6-4ee1ba384b00/start` → **200**

```json
{
  "command_id": "6d86feb1-e2fb-4f31-998e-abe6f6dfa43c",
  "expected_version": 1
}
```

```json
{
  "id": "270afb0f-9c7d-42c7-aea6-4ee1ba384b00",
  "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
  "assignment_id": "8804d067-32c7-4b86-9c2d-7b788f0eb47c",
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
  "arrived_at": "2026-10-29T14:29:56.648413Z",
  "started_at": "2026-10-29T14:29:56.891585Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/270afb0f-9c7d-42c7-aea6-4ee1ba384b00/complete` → **200**

```json
{
  "command_id": "5bf55c41-fddf-4053-906b-9e2747ce02cf",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:29:57Z"
}
```

```json
{
  "id": "270afb0f-9c7d-42c7-aea6-4ee1ba384b00",
  "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
  "assignment_id": "8804d067-32c7-4b86-9c2d-7b788f0eb47c",
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
  "arrived_at": "2026-10-29T14:29:56.648413Z",
  "started_at": "2026-10-29T14:29:56.891585Z",
  "completed_at": "2026-10-29T14:29:57.130259Z",
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
    "id": "0db3ab13-210d-4c38-b293-619293eba825",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T14:29:55.235478Z",
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
    "id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T14:29:51.061845Z",
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

`GET /api/operator/v1/orders/d533bd00-f975-4243-b9b2-5a2b031b791c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T14:29:51.062257Z",
      "actor": {
        "type": "CLIENT",
        "id": "82db7307-745c-460a-a296-9bcc9133e71e",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
        "quote_id": "92e987d2-9363-4cb8-91c4-eb9a80e6bc92",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "2912b59d-b420-4db4-ba67-92b11b0c947b"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T14:29:51.06375Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
        "attempt_id": "b9c4197e-7a89-4a1b-a6f1-c89105fa3846",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "2912b59d-b420-4db4-ba67-92b11b0c947b"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T14:29:51.06579Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5ec9b3c6-1f21-4bf0-9a56-3a00ac7122dc",
        "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "2912b59d-b420-4db4-ba67-92b11b0c947b"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T14:29:51.519762Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5ec9b3c6-1f21-4bf0-9a56-3a00ac7122dc",
        "order_id": "d533bd00-f975-4243-b9b2-5a2b031b791c",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "72bb16bf-e786-4501-999e-1c95ad2ce924"
      },
      "correlation_id": "3f5c0b85-8f3a-44c9-a924-4ddcd79613ac"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/0db3ab13-210d-4c38-b293-619293eba825/tip` → **200**

```json
{
  "order_id": "0db3ab13-210d-4c38-b293-619293eba825",
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
  "available_until": "2026-10-30T14:29:57.130259Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/0db3ab13-210d-4c38-b293-619293eba825/tip` → **409**

```json
{
  "command_id": "e187119b-e3d4-48b6-a0a0-f66a0e02c588",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/0db3ab13-210d-4c38-b293-619293eba825/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3e162cbe-a501-4b43-9ddf-41ea0246fe04"
}
```

Done: interrupted d533bd00-f975-4243-b9b2-5a2b031b791c, follow-up 0db3ab13-210d-4c38-b293-619293eba825.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e4f54c23-2d5c-4a2f-80d1-8be967f1f922",
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
  "last_heartbeat_at": "2026-10-29T14:29:52.863434Z",
  "last_location_at": "2026-10-29T14:29:52.863434Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e4f54c23-2d5c-4a2f-80d1-8be967f1f922/close` → **200**

```json
{
  "command_id": "5f6f16d2-50f7-4fba-9dcc-3a1d686981b4",
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
  "session_id": "71ad9c45-feaa-4582-8070-0af2d7c072fe",
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
  "last_heartbeat_at": "2026-10-29T14:29:56.415557Z",
  "last_location_at": "2026-10-29T14:29:56.415557Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/71ad9c45-feaa-4582-8070-0af2d7c072fe/close` → **200**

```json
{
  "command_id": "fcd304f5-0bc1-46b0-8687-1f5bd0d572ea",
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
  "session_id": "b1ca3187-e71f-41cd-b8df-40161a5f8985",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMDIsImlhdCI6MTc5MzI4NDIwMiwianRpIjoiZDJjNDdiMWEtY2YxZS00NWIxLTk0ZmMtOGVkYjFjN2IyODk4Iiwic2lkIjoiYjFjYTMxODctZTcxZi00MWNkLWI4ZGYtNDAxNjFhNWY4OTg1In0.G790F_ibYBp_zzJqp5DRkosWkoSfZKVWuD5ZtGkqlag",
  "access_expires_at": "2026-10-29T14:45:02.66496519Z",
  "refresh_token": "zNcLj_L9cWuV9XYvEFGNHgtETeUBwjgSQ0NoDZt-5qE",
  "refresh_expires_at": "2026-10-30T02:30:02.664495673Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "a990528f-6e40-4726-810e-b4c6a2e2a846",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:02Z"
}
```

```json
{
  "id": "88894c09-027d-4bf8-8518-a7a76cd1345b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:02Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/88894c09-027d-4bf8-8518-a7a76cd1345b/publish` → **200**

```json
{
  "command_id": "dd33efad-878f-49fe-9e5b-f6bf6b87a711",
  "expected_version": 0
}
```

```json
{
  "id": "88894c09-027d-4bf8-8518-a7a76cd1345b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:03.136974Z",
  "published_at": "2026-10-29T14:30:03.136974Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "88894c09-027d-4bf8-8518-a7a76cd1345b",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T14:30:03.136974Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631263071",
  "device_ref": "sandbox-7826"
}
```

```json
{
  "challenge_id": "a7577da5-cada-4654-81e9-c98608140f69",
  "expires_at": "2026-10-29T14:35:03.604162478Z",
  "resend_available_at": "2026-10-29T14:30:04.604162478Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631263071` → **200**

```json
{
  "phone": "+380631263071",
  "audience": "CLIENT",
  "code": "273193",
  "sent_at": "2026-10-29T14:30:03.60635819Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a7577da5-cada-4654-81e9-c98608140f69",
  "code": "273193",
  "device_ref": "sandbox-7826"
}
```

```json
{
  "session_id": "704cdaaa-2312-4173-b4cd-e7592529de15",
  "subject": {
    "type": "CLIENT",
    "id": "dc8f89c4-d31c-4089-8463-56d0fa1308e5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkYzhmODljNC1kMzFjLTQwODktODQ2My01NmQwZmExMzA4ZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTAzLCJpYXQiOjE3OTMyODQyMDMsImp0aSI6ImI4MTIwYjY4LWFjNWItNDE5Ni04MmQ5LTYzYmUzMTRiYTYyYyIsInNpZCI6IjcwNGNkYWFhLTIzMTItNDE3My1iNGNkLWU3NTkyNTI5ZGUxNSJ9.j1C2AmsZjcypmopYmB6JcJU6GicFhX1u5joYXvNFu-U",
  "access_expires_at": "2026-10-29T14:45:03.849614283Z",
  "refresh_token": "BWeKcPMLkUyqOebyC49lq77GrkVEQLdcv14msPKpZrM",
  "refresh_expires_at": "2026-11-28T14:30:03.849182808Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "88894c09-027d-4bf8-8518-a7a76cd1345b",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T14:30:03.136974Z",
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
  "command_id": "62a20889-2175-4f5a-8092-b5ffda775331",
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
  "id": "ff4483b5-b057-4f7f-b423-4ee7e12933ad",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:04.306391Z",
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
  "command_id": "b892fffc-7de8-46ce-a437-c55ad25ae938",
  "quote_id": "ff4483b5-b057-4f7f-b423-4ee7e12933ad",
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
  "correlation_id": "74c82531-2a42-45b8-a257-4cdf339d5697"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "a9b0afa3-8aa6-48fe-93b5-9841ac03646a",
  "version_id": "88894c09-027d-4bf8-8518-a7a76cd1345b",
  "language": "uk"
}
```

```json
{
  "version_id": "88894c09-027d-4bf8-8518-a7a76cd1345b",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T14:30:04.771946Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "e2516d7b-9fed-404b-9a43-d84b491216f7",
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
  "id": "d45a7932-f1ef-4ecf-94d0-d71ef1d75e11",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:05.001034Z",
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
  "command_id": "fe9bc019-9c44-49c4-ba86-37ada765fce9",
  "quote_id": "d45a7932-f1ef-4ecf-94d0-d71ef1d75e11",
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
  "id": "abb53279-0f08-4768-bdcb-720abc55179d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc8f89c4-d31c-4089-8463-56d0fa1308e5",
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
  "created_at": "2026-10-29T14:30:05.232996Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/abb53279-0f08-4768-bdcb-720abc55179d` → **200**

```json
{
  "id": "abb53279-0f08-4768-bdcb-720abc55179d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "dc8f89c4-d31c-4089-8463-56d0fa1308e5",
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
  "created_at": "2026-10-29T14:30:05.232996Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/abb53279-0f08-4768-bdcb-720abc55179d/cancel` → **200**

```json
{
  "command_id": "bf3daa92-04c5-46e9-a4c3-a42fd2e55f4b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "abb53279-0f08-4768-bdcb-720abc55179d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "dc8f89c4-d31c-4089-8463-56d0fa1308e5",
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
  "created_at": "2026-10-29T14:30:05.232996Z",
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

`POST /api/admin/v1/legal-documents/88894c09-027d-4bf8-8518-a7a76cd1345b` → **409**

```json
{
  "command_id": "64ef2434-ba28-4cfa-8caf-3811a4347562",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T14:30:05Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/88894c09-027d-4bf8-8518-a7a76cd1345b",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "8c1a5d6b-d6a7-4167-8d5d-e2b33694539f"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2664d784-2796-482f-813b-80b50fe6469b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:30:06Z"
}
```

```json
{
  "id": "503b4790-77c0-4a96-8645-22ccb66b66df",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:30:06Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/503b4790-77c0-4a96-8645-22ccb66b66df/publish` → **200**

```json
{
  "command_id": "9ebf6daf-89db-4795-be6c-b57d0bf7c1db",
  "expected_version": 0
}
```

```json
{
  "id": "503b4790-77c0-4a96-8645-22ccb66b66df",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T14:30:06.442004Z",
  "published_at": "2026-10-29T14:30:06.442004Z",
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
  "device_ref": "sandbox-7059"
}
```

```json
{
  "challenge_id": "36e93c7e-e4ac-4c7f-aaac-8ea6bb34613f",
  "expires_at": "2026-10-29T14:35:06.670571233Z",
  "resend_available_at": "2026-10-29T14:30:07.670571233Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "219002",
  "sent_at": "2026-10-29T14:30:06.672523985Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36e93c7e-e4ac-4c7f-aaac-8ea6bb34613f",
  "code": "219002",
  "device_ref": "sandbox-7059"
}
```

```json
{
  "session_id": "6c4f88a0-a2e9-4e89-985b-909efa0126b2",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTEwNiwiaWF0IjoxNzkzMjg0MjA2LCJqdGkiOiI0YzFjZWUwZC1hYjY4LTRmNjktODdhMi04YTc2NTBiZTE2M2UiLCJzaWQiOiI2YzRmODhhMC1hMmU5LTRlODktOTg1Yi05MDllZmEwMTI2YjIifQ.z_esklAwmhZ7d-MYo4Py77dydNyi_InUHHXLNzyKjls",
  "access_expires_at": "2026-10-29T14:45:06.914287835Z",
  "refresh_token": "WG5RXg1PQ1JAeX-0NmykpkDpA8bTfH_T5VAyBB5oGrE",
  "refresh_expires_at": "2026-11-28T14:30:06.913879881Z",
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
  "command_id": "6c4ef437-d23f-4016-8637-5854a31ed5df",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:07Z",
    "sequence": 1793284207372
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "170b019f-460d-4ea7-99bf-34947d92e66a",
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
  "last_heartbeat_at": "2026-10-29T14:30:07.388929Z",
  "last_location_at": "2026-10-29T14:30:07.388929Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678391078",
  "device_ref": "sandbox-15219"
}
```

```json
{
  "challenge_id": "db215c99-31c6-42f9-ba35-062512cf5206",
  "expires_at": "2026-10-29T14:35:07.616026308Z",
  "resend_available_at": "2026-10-29T14:30:08.616026308Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678391078` → **200**

```json
{
  "phone": "+380678391078",
  "audience": "CLIENT",
  "code": "867466",
  "sent_at": "2026-10-29T14:30:07.618177293Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "db215c99-31c6-42f9-ba35-062512cf5206",
  "code": "867466",
  "device_ref": "sandbox-15219"
}
```

```json
{
  "session_id": "f06bfa3f-998c-4d98-a1e6-c3d4c3773ca8",
  "subject": {
    "type": "CLIENT",
    "id": "6f911db0-3992-4b23-a6ad-159f6604a630"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2ZjkxMWRiMC0zOTkyLTRiMjMtYTZhZC0xNTlmNjYwNGE2MzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTA3LCJpYXQiOjE3OTMyODQyMDcsImp0aSI6IjA1MjM5M2RlLTgwZmEtNDVhMS1iNTI2LTA0YWI4YzkwNDIwMyIsInNpZCI6ImYwNmJmYTNmLTk5OGMtNGQ5OC1hMWU2LWMzZDRjMzc3M2NhOCJ9.Btlkhk_Y_ZRxdsX6C2T9U_xnW_fpPxfyVrtOc6n-_T4",
  "access_expires_at": "2026-10-29T14:45:07.863481351Z",
  "refresh_token": "0r2ZJEUqAs8oa5_nuCDS2FDhc0ECBv1HU8O95saWUpk",
  "refresh_expires_at": "2026-11-28T14:30:07.863114048Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "209cd80f-d8d8-4a72-8e2d-d6d4dbe47213",
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
  "id": "b4f832d3-690f-4316-a34f-40bf55efe38b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:08.095652Z",
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
  "command_id": "6185fb8c-302b-42ea-bca5-ab9458cff6bb",
  "quote_id": "b4f832d3-690f-4316-a34f-40bf55efe38b",
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
    "phone": "+380670880782"
  }
}
```

```json
{
  "id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:08.339848Z",
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
    "id": "64cc0b49-764a-49b2-bcbe-3892570a5eab",
    "order_id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
    "expires_at": "2026-10-29T14:30:23.343841Z",
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

`POST /api/driver/v1/offers/64cc0b49-764a-49b2-bcbe-3892570a5eab/accept` → **200**

```json
{
  "command_id": "17d07651-05e6-4863-babb-786373223d7b"
}
```

```json
{
  "id": "7e5eba8b-21d6-4a5e-b652-a984fc182bde",
  "order_id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "dc5fbe75-63e7-48c0-b713-4fa907b98886",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "dc5fbe75-63e7-48c0-b713-4fa907b98886",
  "order_id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
  "assignment_id": "7e5eba8b-21d6-4a5e-b652-a984fc182bde",
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
    "phone": "+380670880782"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ab561abc-911f-4895-98d5-dbf5b9b1404d",
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
  "id": "0919d117-d5bb-4d03-8a41-3154f188d226",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:09.356237Z",
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
  "command_id": "649d0447-1d72-49b4-9b57-be04607c36df",
  "quote_id": "0919d117-d5bb-4d03-8a41-3154f188d226",
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
  "id": "a93ee31d-1146-4b50-9680-2ce466e9ec73",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:09.593407Z",
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
  "command_id": "86e65368-8d08-460d-9bac-3f1b5a1b0fdb",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T17:30:09Z"
}
```

```json
{
  "id": "601914ff-b326-498f-84b9-c7c8fee40ed2",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:09.849353Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:30:09Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "91b1e4da-965a-48a4-a733-6af6d9dc8529",
  "quote_id": "601914ff-b326-498f-84b9-c7c8fee40ed2",
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
  "pickup_at": "2026-10-29T17:30:09Z"
}
```

```json
{
  "id": "9f7139dc-56ba-4206-9cc8-c4f940757ed0",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:30:10.082624Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:30:09Z",
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
  "command_id": "a317bf5c-b373-4397-9277-cff188b8bcde",
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
  "id": "e10ba0ed-4784-406d-832b-9c4b55e6d9a0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:10.328422Z",
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
  "command_id": "a0f46ced-bb00-4585-a191-33e352eaad8d",
  "quote_id": "e10ba0ed-4784-406d-832b-9c4b55e6d9a0",
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
  "correlation_id": "b83237e8-0bd7-46cc-b507-b8df38686c81"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "9f7139dc-56ba-4206-9cc8-c4f940757ed0",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T14:30:10.082624Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T17:30:09Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "a93ee31d-1146-4b50-9680-2ce466e9ec73",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-29T14:30:09.593407Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "a93ee31d-1146-4b50-9680-2ce466e9ec73",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:09.593407Z",
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

`GET /api/rider/v1/orders/bf3b087b-f66b-42d9-b21f-9acce0a8aea8` → **200**

```json
{
  "id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7e5eba8b-21d6-4a5e-b652-a984fc182bde",
    "order_id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "dc5fbe75-63e7-48c0-b713-4fa907b98886",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T14:30:08.339848Z",
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
    "location_at": "2026-10-29T14:30:07.388929Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/bf3b087b-f66b-42d9-b21f-9acce0a8aea8/cancel` → **200**

```json
{
  "command_id": "e15bd0bf-6d4d-452b-808c-a9b5d4768b18",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "7e5eba8b-21d6-4a5e-b652-a984fc182bde",
    "order_id": "bf3b087b-f66b-42d9-b21f-9acce0a8aea8",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "dc5fbe75-63e7-48c0-b713-4fa907b98886",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T14:30:08.339848Z",
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

`GET /api/rider/v1/orders/a93ee31d-1146-4b50-9680-2ce466e9ec73` → **200**

```json
{
  "id": "a93ee31d-1146-4b50-9680-2ce466e9ec73",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:09.593407Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a93ee31d-1146-4b50-9680-2ce466e9ec73/cancel` → **200**

```json
{
  "command_id": "e6323fa4-8776-450f-ae8c-fee36ebff689",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a93ee31d-1146-4b50-9680-2ce466e9ec73",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:30:09.593407Z",
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

`GET /api/rider/v1/orders/9f7139dc-56ba-4206-9cc8-c4f940757ed0` → **200**

```json
{
  "id": "9f7139dc-56ba-4206-9cc8-c4f940757ed0",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:30:10.082624Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:30:09Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/9f7139dc-56ba-4206-9cc8-c4f940757ed0/cancel` → **200**

```json
{
  "command_id": "9d3829f2-7720-4fa1-94b5-b3eb8a8feb23",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "9f7139dc-56ba-4206-9cc8-c4f940757ed0",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "6f911db0-3992-4b23-a6ad-159f6604a630",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T14:30:10.082624Z",
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
  "pickup_at": "2026-10-29T17:30:09Z",
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
  "session_id": "170b019f-460d-4ea7-99bf-34947d92e66a",
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
  "last_heartbeat_at": "2026-10-29T14:30:07.388929Z",
  "last_location_at": "2026-10-29T14:30:07.388929Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/170b019f-460d-4ea7-99bf-34947d92e66a/close` → **200**

```json
{
  "command_id": "4e89c89a-130b-43a0-8549-82244fd6e830",
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

Done: orders bf3b087b-f66b-42d9-b21f-9acce0a8aea8, a93ee31d-1146-4b50-9680-2ce466e9ec73, 9f7139dc-56ba-4206-9cc8-c4f940757ed0.

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
  "session_id": "a3cae18c-d562-4c6b-842a-4c90ab5a14fa",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMTMsImlhdCI6MTc5MzI4NDIxMywianRpIjoiM2YwZTg2NzUtMTVmMS00MWVmLWFjN2EtNTY3OWI2ZjQ2MmNiIiwic2lkIjoiYTNjYWUxOGMtZDU2Mi00YzZiLTg0MmEtNGM5MGFiNWExNGZhIn0.MYc375S88Z5rEd5O1tI94oubeKwfAnav7fvnCVGideI",
  "access_expires_at": "2026-10-29T14:45:13.417175684Z",
  "refresh_token": "-aYwl8udSfMA-BzRRxUZrO3PtYzy0SWek8ANM9RcD_A",
  "refresh_expires_at": "2026-10-30T02:30:13.41672216Z",
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
  "session_id": "bbf5ac39-1949-4bc8-91ec-45f0ebeb72d7",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMTMsImlhdCI6MTc5MzI4NDIxMywianRpIjoiODcyZmQ3MTctYWM2MC00ZTk2LWExNzctNDM4Y2YyZWRhOTU1Iiwic2lkIjoiYmJmNWFjMzktMTk0OS00YmM4LTkxZWMtNDVmMGViZWI3MmQ3In0.ZRje3Lit8YsLfOFQhV6GlIBG_Jq3NUSIR9sN4wtY_X0",
  "access_expires_at": "2026-10-29T14:45:13.903772016Z",
  "refresh_token": "1OwJmhfS-kjW6MOea0zib6Tw0tw9PFqRVn_EdMZBggU",
  "refresh_expires_at": "2026-10-30T02:30:13.903341768Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-26373"
}
```

```json
{
  "challenge_id": "e3bd0c7c-8263-4524-98c4-13688eb19837",
  "expires_at": "2026-10-29T14:35:14.122974899Z",
  "resend_available_at": "2026-10-29T14:30:15.122974899Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "166291",
  "sent_at": "2026-10-29T14:30:14.124882713Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e3bd0c7c-8263-4524-98c4-13688eb19837",
  "code": "166291",
  "device_ref": "sandbox-26373"
}
```

```json
{
  "session_id": "acf93370-423f-456d-8413-5932b6018e5a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTExNCwiaWF0IjoxNzkzMjg0MjE0LCJqdGkiOiIyMzg2M2U2YS0zMWEzLTRiYzQtYWM2ZS1mNTNlOGU4MjkwMGYiLCJzaWQiOiJhY2Y5MzM3MC00MjNmLTQ1NmQtODQxMy01OTMyYjYwMThlNWEifQ.AZMlWBLEHbH5jBkeLJsF169ILcXB1esk6VrBdNBNWj0",
  "access_expires_at": "2026-10-29T14:45:14.372979457Z",
  "refresh_token": "5Htevw1dzN1fRzO6y0vi8p3fz01wtAP8LV1baPWhvbs",
  "refresh_expires_at": "2026-11-28T14:30:14.372611723Z",
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
  "command_id": "ad18e4fd-5e7c-43b4-8cf4-55bb631522a6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:14Z",
    "sequence": 1793284214830
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad0a6ca2-de90-4bbc-b641-ea3e63c94b31",
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
  "last_heartbeat_at": "2026-10-29T14:30:14.846905Z",
  "last_location_at": "2026-10-29T14:30:14.846905Z",
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
  "command_id": "05a62cb8-345a-4c71-bb74-60d442662c4c",
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
  "effective_at": "2026-10-29T14:30:15.319381Z",
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T14:27:55.397749Z",
  "last_entries": [
    {
      "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:27:55.397749Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "cdcd731d-78bc-4bbc-bfb5-6f1c16666dc8",
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
  "id": "3b07a10a-5e9e-453e-bcfb-897624c4d813",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:15.805362Z",
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
  "command_id": "8b6cb408-8b52-49b4-9cfd-61611511cdc9",
  "quote_id": "3b07a10a-5e9e-453e-bcfb-897624c4d813",
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
    "phone": "+380671111811"
  }
}
```

```json
{
  "id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
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
  "created_at": "2026-10-29T14:30:16.043368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111811"
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
    "id": "e948017a-0841-469f-8505-3e7bc121b62d",
    "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
    "expires_at": "2026-10-29T14:30:31.046342Z",
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

`POST /api/driver/v1/offers/e948017a-0841-469f-8505-3e7bc121b62d/accept` → **200**

```json
{
  "command_id": "ae205776-3dd1-454d-9824-58558a85a3e5"
}
```

```json
{
  "id": "7d855150-76cc-42ee-9bf2-bde2a4d75ca7",
  "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30ec3a8e-78de-4a21-a86a-15fb4a7a883a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30ec3a8e-78de-4a21-a86a-15fb4a7a883a",
  "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
  "assignment_id": "7d855150-76cc-42ee-9bf2-bde2a4d75ca7",
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
    "phone": "+380671111811"
  }
}
```

`POST /api/driver/v1/work-sessions/ad0a6ca2-de90-4bbc-b641-ea3e63c94b31/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:16Z",
    "sequence": 1793284216966
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad0a6ca2-de90-4bbc-b641-ea3e63c94b31",
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
  "last_heartbeat_at": "2026-10-29T14:30:16.982704Z",
  "last_location_at": "2026-10-29T14:30:16.982704Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/30ec3a8e-78de-4a21-a86a-15fb4a7a883a/arrive` → **200**

```json
{
  "command_id": "332e5aff-2666-4ebb-9e4c-8932de1a6c10",
  "expected_version": 0
}
```

```json
{
  "id": "30ec3a8e-78de-4a21-a86a-15fb4a7a883a",
  "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
  "assignment_id": "7d855150-76cc-42ee-9bf2-bde2a4d75ca7",
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
  "arrived_at": "2026-10-29T14:30:17.219252Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111811"
  }
}
```

`POST /api/driver/v1/trips/30ec3a8e-78de-4a21-a86a-15fb4a7a883a/start` → **200**

```json
{
  "command_id": "bdf2de8a-9401-4f80-a944-5eb4e7e36b0b",
  "expected_version": 1
}
```

```json
{
  "id": "30ec3a8e-78de-4a21-a86a-15fb4a7a883a",
  "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
  "assignment_id": "7d855150-76cc-42ee-9bf2-bde2a4d75ca7",
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
  "arrived_at": "2026-10-29T14:30:17.219252Z",
  "started_at": "2026-10-29T14:30:17.45909Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+380671111811"
  }
}
```

`POST /api/driver/v1/trips/30ec3a8e-78de-4a21-a86a-15fb4a7a883a/complete` → **200**

```json
{
  "command_id": "78309985-1b0a-4959-b3c1-7af3d2610c63",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:30:17Z",
  "cash_received": true
}
```

```json
{
  "id": "30ec3a8e-78de-4a21-a86a-15fb4a7a883a",
  "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
  "assignment_id": "7d855150-76cc-42ee-9bf2-bde2a4d75ca7",
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
  "arrived_at": "2026-10-29T14:30:17.219252Z",
  "started_at": "2026-10-29T14:30:17.45909Z",
  "completed_at": "2026-10-29T14:30:17.697366Z",
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
  "command_id": "fc4db40f-adf4-4a61-8764-4f425d5121e2",
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
  "id": "f809dc5c-8830-4631-8003-34c4b0a35321",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:17.931252Z",
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
  "command_id": "e9fb2abc-be5d-4c6c-8a1d-5c874b6bfa02",
  "quote_id": "f809dc5c-8830-4631-8003-34c4b0a35321",
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
    "phone": "+3806711122107"
  }
}
```

```json
{
  "id": "ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b",
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
  "created_at": "2026-10-29T14:30:18.165368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122107"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b` → **200**

```json
{
  "id": "ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b",
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
  "created_at": "2026-10-29T14:30:18.165368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122107"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b/cancel` → **200**

```json
{
  "command_id": "d6992e27-8670-4416-9aff-fcc06163d2a8",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b",
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
  "created_at": "2026-10-29T14:30:18.165368Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711122107"
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
  "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T14:27:55.397749Z",
  "last_entries": [
    {
      "order_id": "ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T14:30:18.680301Z"
    },
    {
      "order_id": "89dd7b73-ed35-43db-ab96-b7016850cfbf",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T14:30:17.700903Z"
    },
    {
      "order_id": "1fda9159-c4e3-4016-96bc-3068b65d6914",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T14:27:55.397749Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ad0a6ca2-de90-4bbc-b641-ea3e63c94b31",
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
  "last_heartbeat_at": "2026-10-29T14:30:16.982704Z",
  "last_location_at": "2026-10-29T14:30:16.982704Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ad0a6ca2-de90-4bbc-b641-ea3e63c94b31/close` → **200**

```json
{
  "command_id": "c6813b6c-d5af-4539-97ec-9f24f52da332",
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

Done: operator bonus for fulfilled 89dd7b73-ed35-43db-ab96-b7016850cfbf and operator-fault cancellation ecb1f0aa-8b61-4a5a-bd18-a5daaa4caf1b.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675043835",
  "device_ref": "sandbox-14856"
}
```

```json
{
  "challenge_id": "377d19fb-04a5-4dac-8e49-a9a9837c21a7",
  "expires_at": "2026-10-29T14:35:22.835942395Z",
  "resend_available_at": "2026-10-29T14:30:23.835942395Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675043835` → **200**

```json
{
  "phone": "+380675043835",
  "audience": "CLIENT",
  "code": "693764",
  "sent_at": "2026-10-29T14:30:22.838054717Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678656400",
  "device_ref": "sandbox-24318",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "e46af4d3-e215-42a1-a21c-e79d8582b892",
  "expires_at": "2026-10-29T14:35:24.298041914Z",
  "resend_available_at": "2026-10-29T14:30:25.298041914Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678656400` → **200**

```json
{
  "phone": "+380678656400",
  "audience": "CLIENT",
  "code": "855618",
  "sent_at": "2026-10-29T14:30:24.299869587Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678656400",
  "device_ref": "sandbox-19352",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "8f777a5c-2337-45ca-83d3-2df6ead2f504",
  "expires_at": "2026-10-29T14:35:25.744535986Z",
  "resend_available_at": "2026-10-29T14:30:26.744535986Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678656400` → **200**

```json
{
  "phone": "+380678656400",
  "audience": "CLIENT",
  "code": "491682",
  "sent_at": "2026-10-29T14:30:25.760147019Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676850000",
  "device_ref": "sandbox-31614"
}
```

```json
{
  "challenge_id": "a51ac49e-05dc-41ce-b4ce-4900960e9e0e",
  "expires_at": "2026-10-29T14:35:27.212810375Z",
  "resend_available_at": "2026-10-29T14:30:28.212810375Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676850000",
  "device_ref": "sandbox-8475"
}
```

```json
{
  "challenge_id": "c6437e5c-925b-47f5-92b0-7a03dff9ddc9",
  "expires_at": "2026-10-29T14:35:28.638740167Z",
  "resend_available_at": "2026-10-29T14:30:29.638740167Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676850000` → **200**

```json
{
  "phone": "+380676850000",
  "audience": "CLIENT",
  "code": "107124",
  "sent_at": "2026-10-29T14:30:28.640975383Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676850000",
  "device_ref": "sandbox-16401",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "2aa300cb-da90-41e9-8ab3-54d1167175e6",
  "expires_at": "2026-10-29T14:35:30.095890195Z",
  "resend_available_at": "2026-10-29T14:30:31.095890195Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380676850000` → **200**

```json
{
  "phone": "+380676850000",
  "audience": "CLIENT",
  "code": "353335",
  "sent_at": "2026-10-29T14:30:30.097821924Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380676850000",
  "device_ref": "sandbox-11373",
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
  "correlation_id": "cfe677a2-2594-4d25-82c5-a894edf4bd56",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000018773"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "193b727b-47da-42f9-8d40-8f1b6fb5c481"
}
```

`GET /sandbox/v1/otp?phone=%2B442000018773` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120009792"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "0acd75b2-3716-421d-ae3c-13608a802693"
}
```

`GET /sandbox/v1/otp?phone=%2B37120009792` → **404**

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
  "session_id": "dba3fe25-470c-4db6-9784-45894c6c01ae",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMzIsImlhdCI6MTc5MzI4NDIzMiwianRpIjoiMzdiOTg4OWUtNWNlMC00ZWRiLWEwYzktNWJjNDkxY2YwOGMzIiwic2lkIjoiZGJhM2ZlMjUtNDcwYy00ZGI2LTk3ODQtNDU4OTRjNmMwMWFlIn0.14OR6eLhGI0Qzij37W8h6DfNKEVRuhyNq_h7Pm8fW1E",
  "access_expires_at": "2026-10-29T14:45:32.520604627Z",
  "refresh_token": "yOxb9ky8wfQglro9FILTfueUKpS3fUgBtFm35rQ4Mp4",
  "refresh_expires_at": "2026-10-30T02:30:32.519879585Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380676850000` → **200**

```json
{
  "deliveries": [
    {
      "id": "479be2ee-183c-4106-85de-a8944d46cf0b",
      "challenge_id": "2aa300cb-da90-41e9-8ab3-54d1167175e6",
      "phone": "+380676850000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-2150511d-bef5-458a-8865-32364a78d39a",
      "error": null,
      "attempted_at": "2026-10-29T14:30:30.098204Z"
    },
    {
      "id": "1745d445-e799-418a-bb1f-2cbb7c8b0046",
      "challenge_id": "c6437e5c-925b-47f5-92b0-7a03dff9ddc9",
      "phone": "+380676850000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-9f6384b9-0740-4755-8999-c40a2bc4dcfe",
      "error": null,
      "attempted_at": "2026-10-29T14:30:28.641408Z"
    },
    {
      "id": "01e151df-6426-4c41-9716-e8d4f2599828",
      "challenge_id": "a51ac49e-05dc-41ce-b4ce-4900960e9e0e",
      "phone": "+380676850000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T14:30:27.214805Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380676850000` → **200**

```json
{
  "phone": "+380676850000",
  "audience": "CLIENT",
  "code": "353335",
  "sent_at": "2026-10-29T14:30:30.097821924Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678656400` → **200**

```json
{
  "deliveries": [
    {
      "id": "e909dd84-020b-4e3f-a9e7-eab100db7c58",
      "challenge_id": "8f777a5c-2337-45ca-83d3-2df6ead2f504",
      "phone": "+380678656400",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-d51347a1-8baa-4650-99d1-bdd6fe68e923",
      "error": null,
      "attempted_at": "2026-10-29T14:30:25.76061Z"
    },
    {
      "id": "c3d866ca-a9fd-49ed-8f50-33778f9efd41",
      "challenge_id": "e46af4d3-e215-42a1-a21c-e79d8582b892",
      "phone": "+380678656400",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-ce7cc2bc-2ce8-4d25-8989-be70667424b8",
      "error": null,
      "attempted_at": "2026-10-29T14:30:24.300448Z"
    }
  ]
}
```

Done: SMS to +380675043835; SMS then a call to +380678656400; a failed SMS, two calls and a refused third to +380676850000; +44 and +371 refused.

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
  "session_id": "08151006-0690-4292-9170-678e31ac4c9f",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMzMsImlhdCI6MTc5MzI4NDIzMywianRpIjoiODg2ZGRkN2EtYTYzMi00NDNiLTg3MWUtYTM1NjI2ZGViNjg2Iiwic2lkIjoiMDgxNTEwMDYtMDY5MC00MjkyLTkxNzAtNjc4ZTMxYWM0YzlmIn0.OHYEJOgDrQf0-H8TOAuyvzdzgxDtu6KVQSBXBs0jKiI",
  "access_expires_at": "2026-10-29T14:45:33.496046916Z",
  "refresh_token": "D3OvQaEDXI-HkyiYiPaRL3rqZJxPfqHrgB40OQatMu0",
  "refresh_expires_at": "2026-10-30T02:30:33.49533894Z",
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
  "session_id": "9da11b8e-d5a3-4b03-86c4-70b7dfd0a52f",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxMzMsImlhdCI6MTc5MzI4NDIzMywianRpIjoiOTZjNmUzNDItY2JlNS00ZGE2LThhYjMtNjA0NjRmZTRjZmRhIiwic2lkIjoiOWRhMTFiOGUtZDVhMy00YjAzLTg2YzQtNzBiN2RmZDBhNTJmIn0.DCwmo0z9hj3XncsZgvQCZasPH2CQgBTvOhYv-cgE8yY",
  "access_expires_at": "2026-10-29T14:45:33.993092346Z",
  "refresh_token": "27px1x--wbPeq_-iqpIiDw5MC4QNMhSoH57dMeGwB2w",
  "refresh_expires_at": "2026-10-30T02:30:33.992633685Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
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

`POST /api/admin/v1/staff-extensions/19a415f0-70ef-40f1-bafd-5905cf93503e` → **200**

```json
{
  "command_id": "540cce81-5d91-4bc9-85a8-b1127674aab1",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "e227c4ca-cb21-4573-acc5-6bd08a7f203b",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:30:34.902091Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T14:30:34.902091Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "b9fcbb00-d76e-4022-aa08-a244ab9e0347",
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
  "id": "b112d0bd-8bee-4342-a0b6-f9f44aa55390",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:35.347210Z",
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
  "command_id": "39b5efb8-3598-4933-be8f-3cc0eb00b4c4",
  "quote_id": "b112d0bd-8bee-4342-a0b6-f9f44aa55390",
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
    "phone": "+380671173018"
  }
}
```

```json
{
  "id": "4a97d91a-83ac-4094-8eb3-edcf75666a18",
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
  "created_at": "2026-10-29T14:30:35.584411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671173018"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/4a97d91a-83ac-4094-8eb3-edcf75666a18/calls` → **201**

```json
{
  "command_id": "b7842d92-5cfc-402c-b605-17986d278e8a",
  "to": "CALLER"
}
```

```json
{
  "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "order_ids": [
    "4a97d91a-83ac-4094-8eb3-edcf75666a18"
  ],
  "started_at": "2026-10-29T14:30:35.841247Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/4a97d91a-83ac-4094-8eb3-edcf75666a18/calls` → **201**

```json
{
  "command_id": "b7842d92-5cfc-402c-b605-17986d278e8a",
  "to": "CALLER"
}
```

```json
{
  "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "order_ids": [
    "4a97d91a-83ac-4094-8eb3-edcf75666a18"
  ],
  "started_at": "2026-10-29T14:30:35.841247Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "551b4cf7-d16a-4344-8a16-76f02997416f",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380671173018",
    "at": "2026-10-29T14:30:35.843122716Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.18996",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "551b4cf7-d16a-4344-8a16-76f02997416f"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=4a97d91a-83ac-4094-8eb3-edcf75666a18` → **200**

```json
{
  "calls": [
    {
      "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [
        "4a97d91a-83ac-4094-8eb3-edcf75666a18"
      ],
      "started_at": "2026-10-29T14:30:35.841247Z",
      "answered_at": "2026-10-29T14:30:36.36482Z",
      "ended_at": "2026-10-29T14:30:36.383696Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4a97d91a-83ac-4094-8eb3-edcf75666a18` → **200**

```json
{
  "calls": [
    {
      "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [
        "4a97d91a-83ac-4094-8eb3-edcf75666a18"
      ],
      "started_at": "2026-10-29T14:30:35.841247Z",
      "answered_at": "2026-10-29T14:30:36.36482Z",
      "ended_at": "2026-10-29T14:30:36.383696Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=4a97d91a-83ac-4094-8eb3-edcf75666a18` → **200**

```json
{
  "calls": [
    {
      "id": "551b4cf7-d16a-4344-8a16-76f02997416f",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "order_ids": [
        "4a97d91a-83ac-4094-8eb3-edcf75666a18"
      ],
      "started_at": "2026-10-29T14:30:35.841247Z",
      "answered_at": "2026-10-29T14:30:36.36482Z",
      "ended_at": "2026-10-29T14:30:36.383696Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T14:30:38.81475Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/4a97d91a-83ac-4094-8eb3-edcf75666a18` → **200**

```json
{
  "id": "4a97d91a-83ac-4094-8eb3-edcf75666a18",
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
  "created_at": "2026-10-29T14:30:35.584411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671173018"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/4a97d91a-83ac-4094-8eb3-edcf75666a18/cancel` → **200**

```json
{
  "command_id": "87d7dfe7-6f6e-41e1-aeb5-5b506a18bdc7",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "4a97d91a-83ac-4094-8eb3-edcf75666a18",
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
  "created_at": "2026-10-29T14:30:35.584411Z",
  "caller": {
    "name": "Caller",
    "phone": "+380671173018"
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
  "command_id": "4fc14e31-ce29-4574-8443-ecc8a5852f2a",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T14:30:41.609484Z",
  "extension": "101"
}
```

Done: outgoing call 551b4cf7-d16a-4344-8a16-76f02997416f from order 4a97d91a-83ac-4094-8eb3-edcf75666a18, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636033448",
  "device_ref": "sandbox-18317"
}
```

```json
{
  "challenge_id": "a8652462-d06c-4760-8da0-d13cdc35a7bf",
  "expires_at": "2026-10-29T14:35:41.839882467Z",
  "resend_available_at": "2026-10-29T14:30:42.839882467Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636033448` → **200**

```json
{
  "phone": "+380636033448",
  "audience": "CLIENT",
  "code": "082089",
  "sent_at": "2026-10-29T14:30:41.841901307Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a8652462-d06c-4760-8da0-d13cdc35a7bf",
  "code": "082089",
  "device_ref": "sandbox-18317"
}
```

```json
{
  "session_id": "759033cd-37f1-4779-90e6-3d6498ffaf61",
  "subject": {
    "type": "CLIENT",
    "id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmU3Yzc1Zi1mMTZiLTQ1ZDktYjJmMi1lYjZhMzRjMTNmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTQyLCJpYXQiOjE3OTMyODQyNDIsImp0aSI6IjJlMzA1YTg4LWNmYWItNGFjOC1hOWYyLWU0MmIzYmYzZTg4OCIsInNpZCI6Ijc1OTAzM2NkLTM3ZjEtNDc3OS05MGU2LTNkNjQ5OGZmYWY2MSJ9.YEg1kZoj4YSTfhABdCIs8UIHuRLq3TEDdL0LI2l_FeQ",
  "access_expires_at": "2026-10-29T14:45:42.088301663Z",
  "refresh_token": "GxR20fUNLo_-9qYVhvcHWACNAcQ_v1Ilw9JWIGbUYlk",
  "refresh_expires_at": "2026-11-28T14:30:42.087869161Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
  "session_id": "759033cd-37f1-4779-90e6-3d6498ffaf61",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636033448",
  "device_ref": "sandbox-25843"
}
```

```json
{
  "challenge_id": "4049d677-4389-4c19-b9ee-6b14353fc83f",
  "expires_at": "2026-10-29T14:35:44.524792393Z",
  "resend_available_at": "2026-10-29T14:30:45.524792393Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636033448` → **200**

```json
{
  "phone": "+380636033448",
  "audience": "CLIENT",
  "code": "749756",
  "sent_at": "2026-10-29T14:30:44.526618814Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "4049d677-4389-4c19-b9ee-6b14353fc83f",
  "code": "749756",
  "device_ref": "sandbox-25843"
}
```

```json
{
  "session_id": "3c852cd6-2689-422e-a275-1eec378a8771",
  "subject": {
    "type": "CLIENT",
    "id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmU3Yzc1Zi1mMTZiLTQ1ZDktYjJmMi1lYjZhMzRjMTNmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTQ0LCJpYXQiOjE3OTMyODQyNDQsImp0aSI6IjYyN2ZiMzhjLWEyOTEtNDEyZC05NGVlLTJhNjJlODQ3ODZjZCIsInNpZCI6IjNjODUyY2Q2LTI2ODktNDIyZS1hMjc1LTFlZWMzNzhhODc3MSJ9.MhgX16vxEqTGrIDMdv6UGtidicnCGmixQhkNcESAxSA",
  "access_expires_at": "2026-10-29T14:45:44.773229825Z",
  "refresh_token": "KhqpZFE0UpV3BpAbeEo_RPsmKW6yLSqKXTgpNwZ5Acw",
  "refresh_expires_at": "2026-11-28T14:30:44.77282145Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "dc7e8409-5a3d-401c-aff3-654d032fbd47",
  "expires_at": "2026-10-29T14:35:47.001282801Z",
  "resend_available_at": "2026-10-29T14:30:48.001282801Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636033448` → **200**

```json
{
  "phone": "+380636033448",
  "audience": "CLIENT",
  "code": "658603",
  "sent_at": "2026-10-29T14:30:47.003381146Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380636857685"
}
```

```json
{
  "challenge_id": "56cfe40e-0c3d-4435-a6d2-7e1dc5c70834",
  "expires_at": "2026-10-29T14:35:47.243944624Z",
  "resend_available_at": "2026-10-29T14:30:48.243944624Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380636857685` → **200**

```json
{
  "phone": "+380636857685",
  "audience": "CLIENT",
  "code": "199699",
  "sent_at": "2026-10-29T14:30:47.24576768Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "607ff979-f1cd-4493-b374-6b5c68a079d6",
  "current_challenge_id": "dc7e8409-5a3d-401c-aff3-654d032fbd47",
  "current_code": "000000",
  "new_challenge_id": "56cfe40e-0c3d-4435-a6d2-7e1dc5c70834",
  "new_code": "199699"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "93aa4585-06fe-4103-b470-e3ea66eb4e5d"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "156c6693-f527-4942-a7d3-d70aa4fa3013",
  "current_challenge_id": "dc7e8409-5a3d-401c-aff3-654d032fbd47",
  "current_code": "658603",
  "new_challenge_id": "56cfe40e-0c3d-4435-a6d2-7e1dc5c70834",
  "new_code": "199699"
}
```

```json
{
  "subject_id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
  "phone": "+380636857685",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
  "session_id": "759033cd-37f1-4779-90e6-3d6498ffaf61",
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
  "correlation_id": "40f1bebf-66a9-45fa-bd9e-79ff634c4192"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636857685",
  "device_ref": "sandbox-11212"
}
```

```json
{
  "challenge_id": "50ec9831-ded6-4080-9dc6-418c0885f90b",
  "expires_at": "2026-10-29T14:35:50.451292106Z",
  "resend_available_at": "2026-10-29T14:30:51.451292106Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636857685` → **200**

```json
{
  "phone": "+380636857685",
  "audience": "CLIENT",
  "code": "358558",
  "sent_at": "2026-10-29T14:30:50.453531249Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "50ec9831-ded6-4080-9dc6-418c0885f90b",
  "code": "358558",
  "device_ref": "sandbox-11212"
}
```

```json
{
  "session_id": "8f8470bc-cf0a-4129-bd71-ed7cf4573c12",
  "subject": {
    "type": "CLIENT",
    "id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmU3Yzc1Zi1mMTZiLTQ1ZDktYjJmMi1lYjZhMzRjMTNmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTUwLCJpYXQiOjE3OTMyODQyNTAsImp0aSI6IjJlY2VlN2UyLTY5MmMtNDkzMi1iNzgyLTE4ZjYyMWU0ZWRmZCIsInNpZCI6IjhmODQ3MGJjLWNmMGEtNDEyOS1iZDcxLWVkN2NmNDU3M2MxMiJ9.hXlSz6nsawV3UsZ89hbNR2Alz3cpqKyeW8GZHyZEkc4",
  "access_expires_at": "2026-10-29T14:45:50.702333992Z",
  "refresh_token": "rvvMSOfrxjH-ydcHr_Tj-zuUjs1-3Uqx38oXpDc6acU",
  "refresh_expires_at": "2026-11-28T14:30:50.701877214Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
  "session_id": "8f8470bc-cf0a-4129-bd71-ed7cf4573c12",
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
  "session_id": "30b1fc06-d362-4889-8722-d5d297f678a1",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNTEsImlhdCI6MTc5MzI4NDI1MSwianRpIjoiNGY1NjU5MDItZDA0OC00NzUxLTkzZGUtNzJlZjFjMDBlYzc0Iiwic2lkIjoiMzBiMWZjMDYtZDM2Mi00ODg5LTg3MjItZDVkMjk3ZjY3OGExIn0.i19hLg0ZgUteyb4NeviW829ipPTROdG7atMZ9ViLwxM",
  "access_expires_at": "2026-10-29T14:45:51.398064355Z",
  "refresh_token": "ywMZEcqGhLjHFghmF-GgHoWUjEJs87FxAjb2QY9cQQ4",
  "refresh_expires_at": "2026-10-30T02:30:51.397673396Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51` → **200**

```json
{
  "client": {
    "id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
    "phone": "+380636857685",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T14:30:42.086523Z",
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

`POST /api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51/phone/new-code` → **201**

```json
{
  "phone": "+380633621813"
}
```

```json
{
  "challenge_id": "1a78184b-8763-47b2-9549-87ac0cca0e01",
  "expires_at": "2026-10-29T14:35:51.869182918Z",
  "resend_available_at": "2026-10-29T14:30:52.869182918Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633621813` → **200**

```json
{
  "phone": "+380633621813",
  "audience": "CLIENT",
  "code": "353129",
  "sent_at": "2026-10-29T14:30:51.870876719Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51/phone` → **422**

```json
{
  "command_id": "f423cc3f-5391-48bb-8251-3d3775e228ab",
  "expected_version": 3,
  "new_challenge_id": "1a78184b-8763-47b2-9549-87ac0cca0e01",
  "new_code": "353130",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "43064fa0-5e07-48b5-ac05-826b01b10b1f"
}
```

`POST /api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51/phone` → **400**

```json
{
  "command_id": "f7c2dbba-8323-4c7e-acce-181021cf646d",
  "expected_version": 3,
  "new_challenge_id": "1a78184b-8763-47b2-9549-87ac0cca0e01",
  "new_code": "353129",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "82f67e62-9203-4143-be50-6cf998b9d384",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/afe7c75f-f16b-45d9-b2f2-eb6a34c13f51/phone` → **200**

```json
{
  "command_id": "80567865-f51d-4faf-b49b-5f3cb2a07f8b",
  "expected_version": 3,
  "new_challenge_id": "1a78184b-8763-47b2-9549-87ac0cca0e01",
  "new_code": "353129",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
  "phone": "+380633621813",
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
  "correlation_id": "412047a3-42eb-41af-96d8-50e4bdc510ab"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633621813",
  "device_ref": "sandbox-31739"
}
```

```json
{
  "challenge_id": "ece0d4bf-3131-4359-930b-63238a835971",
  "expires_at": "2026-10-29T14:35:53.021985711Z",
  "resend_available_at": "2026-10-29T14:30:54.021985711Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633621813` → **200**

```json
{
  "phone": "+380633621813",
  "audience": "CLIENT",
  "code": "344204",
  "sent_at": "2026-10-29T14:30:53.02467047Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ece0d4bf-3131-4359-930b-63238a835971",
  "code": "344204",
  "device_ref": "sandbox-31739"
}
```

```json
{
  "session_id": "23716800-4824-4949-a1f0-d89d46fb0c10",
  "subject": {
    "type": "CLIENT",
    "id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZmU3Yzc1Zi1mMTZiLTQ1ZDktYjJmMi1lYjZhMzRjMTNmNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTUzLCJpYXQiOjE3OTMyODQyNTMsImp0aSI6ImJjMWE3NjhlLWI5YzYtNGNiZS1iOTgxLWM4MTY2YmRjYWE2OSIsInNpZCI6IjIzNzE2ODAwLTQ4MjQtNDk0OS1hMWYwLWQ4OWQ0NmZiMGMxMCJ9.Csb3nmg4kmPol_gLtlVkqZceogDXtd8cT63iS1nKJpQ",
  "access_expires_at": "2026-10-29T14:45:53.271805561Z",
  "refresh_token": "_aIHKU-4PiJf2r_wfvXltfnDT7A0BOhZoMdtCPPB3uk",
  "refresh_expires_at": "2026-11-28T14:30:53.271382284Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "afe7c75f-f16b-45d9-b2f2-eb6a34c13f51",
  "session_id": "23716800-4824-4949-a1f0-d89d46fb0c10",
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
  "phone": "+380637845926",
  "device_ref": "sandbox-11836"
}
```

```json
{
  "challenge_id": "ca1d3482-3084-4ede-8144-1ab0e8882c58",
  "expires_at": "2026-10-29T14:35:53.720141092Z",
  "resend_available_at": "2026-10-29T14:30:54.720141092Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637845926` → **200**

```json
{
  "phone": "+380637845926",
  "audience": "CLIENT",
  "code": "834069",
  "sent_at": "2026-10-29T14:30:53.722160824Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca1d3482-3084-4ede-8144-1ab0e8882c58",
  "code": "834069",
  "device_ref": "sandbox-11836"
}
```

```json
{
  "session_id": "f5139d44-bcb4-4011-bbab-a9a793e915bf",
  "subject": {
    "type": "CLIENT",
    "id": "bc89901c-a986-4288-b1b7-3cb5192b8033"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJiYzg5OTAxYy1hOTg2LTQyODgtYjFiNy0zY2I1MTkyYjgwMzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTUzLCJpYXQiOjE3OTMyODQyNTMsImp0aSI6ImM2ZjgwZmVkLWY3MWQtNGUzYy1iODNhLWVmY2EzNzU0M2ZmZCIsInNpZCI6ImY1MTM5ZDQ0LWJjYjQtNDAxMS1iYmFiLWE5YTc5M2U5MTViZiJ9.t679QioFSXfS-mUcRchfBo-3LNND2EJcpg2wepYI18E",
  "access_expires_at": "2026-10-29T14:45:53.98182947Z",
  "refresh_token": "lidT8kjSC3qrfYbF_m_XIvFA9DxJ09wI05dOBNyUceI",
  "refresh_expires_at": "2026-11-28T14:30:53.981440704Z",
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
  "session_id": "c2bbabf6-8214-4fe7-add7-f65e58291266",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNTQsImlhdCI6MTc5MzI4NDI1NCwianRpIjoiYjc0ODk2OTQtZmI4ZC00Njc1LWE3NWQtMDY2NGRkYmFmZDY1Iiwic2lkIjoiYzJiYmFiZjYtODIxNC00ZmU3LWFkZDctZjY1ZTU4MjkxMjY2In0.-fqkuJEchU_KkzOhsZW7FuSOBrl5zoC9aYetUzdS7jk",
  "access_expires_at": "2026-10-29T14:45:54.930709969Z",
  "refresh_token": "ZBOWY7U7tduU5NdQn6b47gSptUO-JChwCwaGhjDN5GU",
  "refresh_expires_at": "2026-10-30T02:30:54.930290357Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380637845926` → **200**

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
  "correlation_id": "e752bba3-7f2d-4212-9ed4-57404f360ac9"
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
  "session_id": "124d9122-790f-4aab-bfcc-3d0150f3e483",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNTUsImlhdCI6MTc5MzI4NDI1NSwianRpIjoiNTk5MmY2ZjMtZmU4ZC00YzQ4LTkwZmItYmIzNjhmNGY1MDEyIiwic2lkIjoiMTI0ZDkxMjItNzkwZi00YWFiLWJmY2MtM2QwMTUwZjNlNDgzIn0.vJLQtELjSGiGPNPyhiadwzNW8fJ_0zfUSJ-D-wS9xa4",
  "access_expires_at": "2026-10-29T14:45:55.876321655Z",
  "refresh_token": "XA_P9Ju2TjtqNC9OFZybAoGRo-yANX5S1Gtgr4o-91w",
  "refresh_expires_at": "2026-10-30T02:30:55.87592646Z",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T14:27:33.78543Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "e1e7dd9e-4ea5-40a9-956b-264be5fca16d",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T14:30:56.342621869Z"
}
```

## The rider books the airport for 2026-10-29T17:30:55Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600094172",
  "device_ref": "sandbox-16364"
}
```

```json
{
  "challenge_id": "3a9d7799-9a4f-40c1-b2fd-e35fc2f8a2b6",
  "expires_at": "2026-10-29T14:35:56.585345306Z",
  "resend_available_at": "2026-10-29T14:30:57.585345306Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600094172` → **200**

```json
{
  "phone": "+48600094172",
  "audience": "CLIENT",
  "code": "962209",
  "sent_at": "2026-10-29T14:30:56.5873333Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3a9d7799-9a4f-40c1-b2fd-e35fc2f8a2b6",
  "code": "962209",
  "device_ref": "sandbox-16364"
}
```

```json
{
  "session_id": "49b6bcb4-ccb4-4c04-8977-d535d3237181",
  "subject": {
    "type": "CLIENT",
    "id": "17dfa5ec-bf51-4467-b7ca-cc25f5cdf754"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxN2RmYTVlYy1iZjUxLTQ0NjctYjdjYS1jYzI1ZjVjZGY3NTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTU2LCJpYXQiOjE3OTMyODQyNTYsImp0aSI6ImY3NmYwNjQyLWExOWItNDg4OS1iOGE2LWM3MjI4OGU3M2Y2MCIsInNpZCI6IjQ5YjZiY2I0LWNjYjQtNGMwNC04OTc3LWQ1MzVkMzIzNzE4MSJ9.dKybkG0jdDa7oer_Gt677pc7KTYsDcUHzh9FEB9Gzv8",
  "access_expires_at": "2026-10-29T14:45:56.837317554Z",
  "refresh_token": "Ltc3Os5_QcAXllJv1bcXWxexKf9sqw0lL3CBp2l4v-w",
  "refresh_expires_at": "2026-11-28T14:30:56.836950711Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "08b08bc4-1bb4-47ad-a5ad-2800574786ce",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T17:30:55Z"
}
```

```json
{
  "id": "342123e5-3e5f-432b-afcc-b9e8de81251a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:35:57.073337Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T17:30:55Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "27059787-65e7-476e-ba2c-e4b7d7570e9b",
  "quote_id": "342123e5-3e5f-432b-afcc-b9e8de81251a",
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
  "pickup_at": "2026-10-29T17:30:55Z"
}
```

```json
{
  "id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "17dfa5ec-bf51-4467-b7ca-cc25f5cdf754",
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
  "created_at": "2026-10-29T14:30:57.310486Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T17:30:55Z",
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
  "device_ref": "sandbox-31811"
}
```

```json
{
  "challenge_id": "2d04c252-b275-4ac3-9112-d3bf94ccec1f",
  "expires_at": "2026-10-29T14:35:57.551379834Z",
  "resend_available_at": "2026-10-29T14:30:58.551379834Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "112896",
  "sent_at": "2026-10-29T14:30:57.553665547Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2d04c252-b275-4ac3-9112-d3bf94ccec1f",
  "code": "112896",
  "device_ref": "sandbox-31811"
}
```

```json
{
  "session_id": "1f990107-90c3-456c-86e9-d021a236b6cc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE1NywiaWF0IjoxNzkzMjg0MjU3LCJqdGkiOiJlMzA0YWQxYi1iZjE0LTRhMTItYmZkZi01ZTYxN2M1NzNlMWQiLCJzaWQiOiIxZjk5MDEwNy05MGMzLTQ1NmMtODZlOS1kMDIxYTIzNmI2Y2MifQ.xQaOiZRHQ2F6dNPQMOQp-YIz6U6z8CipYswbsX1dIsY",
  "access_expires_at": "2026-10-29T14:45:57.806038123Z",
  "refresh_token": "oJzhOChZMLjKBxsq66kPVS_t-zfzgFxApPAv5bWjZzg",
  "refresh_expires_at": "2026-11-28T14:30:57.805600719Z",
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
  "command_id": "80ab76ac-84c6-4cf0-bc30-58e0a1371c4c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:30:58Z",
    "sequence": 1793284258255
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6254f6e1-d8ae-4d81-89c6-420effd1ffd8",
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
  "last_heartbeat_at": "2026-10-29T14:30:58.271564Z",
  "last_location_at": "2026-10-29T14:30:58.271564Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
      "short_number": 24,
      "pickup_at": "2026-10-29T17:30:55Z",
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

`POST /api/driver/v1/preorders/161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6/reserve` → **200**

```json
{
  "command_id": "49d0e005-7305-439d-838b-a0c94ec6573c"
}
```

```json
{
  "id": "ca120b79-1e60-4a0b-9656-1da2be62adc7",
  "state": "RESERVED",
  "order": {
    "order_id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
    "short_number": 24,
    "pickup_at": "2026-10-29T17:30:55Z",
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
  "reserved_at": "2026-10-29T14:30:58.730728Z",
  "confirm_from": "2026-10-29T17:00:55Z",
  "confirm_until": "2026-10-29T17:10:55Z",
  "drop_until": "2026-10-29T16:30:55Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "ca120b79-1e60-4a0b-9656-1da2be62adc7",
      "state": "RESERVED",
      "order": {
        "order_id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:30:55Z",
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
      "reserved_at": "2026-10-29T14:30:58.730728Z",
      "confirm_from": "2026-10-29T17:00:55Z",
      "confirm_until": "2026-10-29T17:10:55Z",
      "drop_until": "2026-10-29T16:30:55Z"
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
      "id": "ca120b79-1e60-4a0b-9656-1da2be62adc7",
      "state": "RESERVED",
      "order": {
        "order_id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
        "short_number": 24,
        "pickup_at": "2026-10-29T17:30:55Z",
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
      "reserved_at": "2026-10-29T14:30:58.730728Z",
      "confirm_from": "2026-10-29T17:00:55Z",
      "confirm_until": "2026-10-29T17:10:55Z",
      "drop_until": "2026-10-29T16:30:55Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/ca120b79-1e60-4a0b-9656-1da2be62adc7/confirm` → **409**

```json
{
  "command_id": "9d5ef545-7f24-4ebf-a2e9-09872027f025"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/ca120b79-1e60-4a0b-9656-1da2be62adc7/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d1eec412-44f0-4733-9664-40aeb211e87a"
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
  "session_id": "d56b2ccd-974e-4e88-831d-87a68c12f393",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNTksImlhdCI6MTc5MzI4NDI1OSwianRpIjoiMmFjOWYzZjctMWE0Yy00YzA3LWI5NGEtMzJkNDBkY2Q0NWZkIiwic2lkIjoiZDU2YjJjY2QtOTc0ZS00ZTg4LTgzMWQtODdhNjhjMTJmMzkzIn0.90bw1iLPXiI7QmZKVkB4Dc9uZDlgEf40QI88TqfPVjE",
  "access_expires_at": "2026-10-29T14:45:59.909796436Z",
  "refresh_token": "pyDMPvwOKGcp9j3vIN0T3c6o2tOyI0JJvgYqrfEimgg",
  "refresh_expires_at": "2026-10-30T02:30:59.909298566Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6` → **200**

```json
{
  "id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "17dfa5ec-bf51-4467-b7ca-cc25f5cdf754",
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
  "created_at": "2026-10-29T14:30:57.310486Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T17:30:55Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "ca120b79-1e60-4a0b-9656-1da2be62adc7",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T14:30:58.730728Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T14:30:57.31137Z",
      "actor": {
        "type": "CLIENT",
        "id": "17dfa5ec-bf51-4467-b7ca-cc25f5cdf754",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
        "preorder": true,
        "quote_id": "342123e5-3e5f-432b-afcc-b9e8de81251a",
        "pickup_at": "2026-10-29T17:30:55Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "6af3b051-6644-4f2e-8cc3-8da908407473"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T14:30:58.731623Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "ca120b79-1e60-4a0b-9656-1da2be62adc7"
      },
      "correlation_id": "5ef36cdc-396d-465e-ba8a-70f07e63cb41"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 161bb47a-5d53-45d3-aaaf-7e0d4f91e6a6, reservation ca120b79-1e60-4a0b-9656-1da2be62adc7.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-1885"
}
```

```json
{
  "challenge_id": "fe228c84-892d-48d0-9f88-de9bf1d75a2a",
  "expires_at": "2026-10-29T14:36:00.615601715Z",
  "resend_available_at": "2026-10-29T14:31:01.615601715Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "123130",
  "sent_at": "2026-10-29T14:31:00.617617862Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe228c84-892d-48d0-9f88-de9bf1d75a2a",
  "code": "123130",
  "device_ref": "sandbox-1885"
}
```

```json
{
  "session_id": "b8b274db-891d-477b-941c-9a5835e03370",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE2MCwiaWF0IjoxNzkzMjg0MjYwLCJqdGkiOiJkNDBkYjQzYi1lMTZiLTQyYzgtOGZkMy1kMmVjYTMyODI4ZDIiLCJzaWQiOiJiOGIyNzRkYi04OTFkLTQ3N2ItOTQxYy05YTU4MzVlMDMzNzAifQ.GvJ1G7OcZaMAppsxEiwJR5rcvGsHX5VR6iN3oPpfMm4",
  "access_expires_at": "2026-10-29T14:46:00.861900389Z",
  "refresh_token": "TGcs5zn-PA8Zbifdx6lvGRORaiPDTGB-rGetqx_rZ8U",
  "refresh_expires_at": "2026-11-28T14:31:00.861492755Z",
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
  "command_id": "2b7b9286-d0d1-4706-9222-394035edb1f3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:01Z",
    "sequence": 1793284261309
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:01.325191Z",
  "last_location_at": "2026-10-29T14:31:01.325191Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678161433",
  "device_ref": "sandbox-12511"
}
```

```json
{
  "challenge_id": "499bff4c-f381-418e-875e-2ed154ed69c7",
  "expires_at": "2026-10-29T14:36:01.547340418Z",
  "resend_available_at": "2026-10-29T14:31:02.547340418Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678161433` → **200**

```json
{
  "phone": "+380678161433",
  "audience": "CLIENT",
  "code": "453067",
  "sent_at": "2026-10-29T14:31:01.549515304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "499bff4c-f381-418e-875e-2ed154ed69c7",
  "code": "453067",
  "device_ref": "sandbox-12511"
}
```

```json
{
  "session_id": "8f491a5e-eb5d-4660-8aff-c65b0d4a58f6",
  "subject": {
    "type": "CLIENT",
    "id": "35ff003e-b336-41b6-b5b5-5514b4bce28d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNWZmMDAzZS1iMzM2LTQxYjYtYjViNS01NTE0YjRiY2UyOGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTYxLCJpYXQiOjE3OTMyODQyNjEsImp0aSI6IjU3MDhmYTA2LWE1ZDMtNDNkMC1hOTUzLThkNjk0NjcxMzgzNSIsInNpZCI6IjhmNDkxYTVlLWViNWQtNDY2MC04YWZmLWM2NWIwZDRhNThmNiJ9.NKxJJKIKjnmU48qVhd94nB419YqKKxr3XZvftPRunlk",
  "access_expires_at": "2026-10-29T14:46:01.799135907Z",
  "refresh_token": "di29fmI2Drp4F0110Sldm5JhGT7QTSLIwyNhtSmwZVU",
  "refresh_expires_at": "2026-11-28T14:31:01.798525127Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "200d7b34-4bed-4633-adda-2217e93a9b5b",
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
  "id": "8b087fb9-68a0-4287-86f7-8a910987712b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:02.022437Z",
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
  "command_id": "aff67918-d9d6-43a8-a85d-84668481c17a",
  "quote_id": "8b087fb9-68a0-4287-86f7-8a910987712b",
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
  "id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "35ff003e-b336-41b6-b5b5-5514b4bce28d",
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
  "created_at": "2026-10-29T14:31:02.257857Z",
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
    "id": "727e2cc7-5371-49ff-a359-e7b2900abb24",
    "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
    "expires_at": "2026-10-29T14:31:17.259973Z",
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

`POST /api/driver/v1/offers/727e2cc7-5371-49ff-a359-e7b2900abb24/accept` → **200**

```json
{
  "command_id": "481b561a-109a-4245-a38c-f7477b95fe99"
}
```

```json
{
  "id": "4a183907-c4ef-4748-b7d8-a1d37442296a",
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4cc6c508-7c76-4091-8a06-51795efdd5b9",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4cc6c508-7c76-4091-8a06-51795efdd5b9",
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "assignment_id": "4a183907-c4ef-4748-b7d8-a1d37442296a",
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

`POST /api/driver/v1/work-sessions/2fac80c4-f467-456d-b739-b0e84bf1b03b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:03Z",
    "sequence": 1793284263166
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:03.182909Z",
  "last_location_at": "2026-10-29T14:31:03.182909Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4cc6c508-7c76-4091-8a06-51795efdd5b9",
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "assignment_id": "4a183907-c4ef-4748-b7d8-a1d37442296a",
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

`POST /api/driver/v1/trips/4cc6c508-7c76-4091-8a06-51795efdd5b9/arrive` → **200**

```json
{
  "command_id": "adc22273-2adb-4fe7-b9d3-d484ca2f509e",
  "expected_version": 0
}
```

```json
{
  "id": "4cc6c508-7c76-4091-8a06-51795efdd5b9",
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "assignment_id": "4a183907-c4ef-4748-b7d8-a1d37442296a",
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
  "arrived_at": "2026-10-29T14:31:03.640791Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4cc6c508-7c76-4091-8a06-51795efdd5b9/start` → **200**

```json
{
  "command_id": "8bc08ae5-d65e-4b04-ac7f-b17395ec3bb8",
  "expected_version": 1
}
```

```json
{
  "id": "4cc6c508-7c76-4091-8a06-51795efdd5b9",
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "assignment_id": "4a183907-c4ef-4748-b7d8-a1d37442296a",
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
  "arrived_at": "2026-10-29T14:31:03.640791Z",
  "started_at": "2026-10-29T14:31:03.879314Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/2fac80c4-f467-456d-b739-b0e84bf1b03b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:04Z",
    "sequence": 1793284264117
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:04.133656Z",
  "last_location_at": "2026-10-29T14:31:04.133656Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/4cc6c508-7c76-4091-8a06-51795efdd5b9/complete` → **200**

```json
{
  "command_id": "be8696a7-c537-4d64-b458-21c73a625ef6",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:31:04Z",
  "cash_received": true
}
```

```json
{
  "id": "4cc6c508-7c76-4091-8a06-51795efdd5b9",
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "assignment_id": "4a183907-c4ef-4748-b7d8-a1d37442296a",
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
  "arrived_at": "2026-10-29T14:31:03.640791Z",
  "started_at": "2026-10-29T14:31:03.879314Z",
  "completed_at": "2026-10-29T14:31:04.370913Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/9f2eaa69-03c9-4508-abf4-857a10f7cf9b/rating` → **200**

```json
{
  "command_id": "0bf0e1b2-1d32-4ada-aa12-092beb75e926",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "score": 5,
  "created_at": "2026-10-29T14:31:04.632711353Z"
}
```

`POST /api/driver/v1/orders/9f2eaa69-03c9-4508-abf4-857a10f7cf9b/rating` → **200**

```json
{
  "command_id": "c0ff1484-9a51-4c0f-9ded-9965d2cc29d3",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
  "score": 4,
  "created_at": "2026-10-29T14:31:04.865342586Z"
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
  "session_id": "118e1081-8d19-4195-a410-6d21f2a5d208",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNjUsImlhdCI6MTc5MzI4NDI2NSwianRpIjoiZjc4MmI5YWEtNjZiYS00MTdjLWI3OTMtZTBjZWY3ZjMzZDlhIiwic2lkIjoiMTE4ZTEwODEtOGQxOS00MTk1LWE0MTAtNmQyMWYyYTVkMjA4In0.mpHPG2nBuWU8IpMVrBfyz7-shtLTdRlTYSI-rZdOr2w",
  "access_expires_at": "2026-10-29T14:46:05.58213258Z",
  "refresh_token": "dFpZ21LYVySFdYrvoWpUOQwn8enYBZ_FyPu8oGfqlOc",
  "refresh_expires_at": "2026-10-30T02:31:05.58162105Z",
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
  "session_id": "e5447125-6c86-4841-b1b7-e19927295a05",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNjYsImlhdCI6MTc5MzI4NDI2NiwianRpIjoiODNhNDFmNWQtYmY2OS00MDFlLTk0MGEtYTkwZmM4MzU1MmVjIiwic2lkIjoiZTU0NDcxMjUtNmM4Ni00ODQxLWIxYjctZTE5OTI3Mjk1YTA1In0.jvbWulD0UzTv8h2NtIzGLhjHiwGyyDaoap0oDOtGgrY",
  "access_expires_at": "2026-10-29T14:46:06.062846909Z",
  "refresh_token": "Fod-uANCgpx1cipoKxxWwHCtNqA0QRp5UcXyeCE53oY",
  "refresh_expires_at": "2026-10-30T02:31:06.062409881Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/9f2eaa69-03c9-4508-abf4-857a10f7cf9b/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
      "author_type": "RIDER",
      "author_id": "35ff003e-b336-41b6-b5b5-5514b4bce28d",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T14:31:04.632711Z"
    },
    {
      "order_id": "9f2eaa69-03c9-4508-abf4-857a10f7cf9b",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "35ff003e-b336-41b6-b5b5-5514b4bce28d",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T14:31:04.865343Z"
    }
  ]
}
```

Done: ratings for order 9f2eaa69-03c9-4508-abf4-857a10f7cf9b.

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
  "session_id": "0019f1b3-04a4-41de-94c5-01a5ed36fce4",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNjYsImlhdCI6MTc5MzI4NDI2NiwianRpIjoiYzI2YWU2ZWEtZmJhZi00NWViLTlhYmEtMjYxMWJkY2ExYzgzIiwic2lkIjoiMDAxOWYxYjMtMDRhNC00MWRlLTk0YzUtMDFhNWVkMzZmY2U0In0.ZiKe2_PEsiyCtlqFpCZul3aRaA4ItvZKhIyx6tdOYxM",
  "access_expires_at": "2026-10-29T14:46:06.785050958Z",
  "refresh_token": "PgMgPUBqNm9myMnFYk8WFDp-vByScpMWcnhyo7wKZlw",
  "refresh_expires_at": "2026-10-30T02:31:06.78462707Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "7f95ffbb-9598-4e4c-8bf6-db6c91ff198a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "7eae58d3-2383-4072-9f28-f37024dd5f5a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:07.029972Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7eae58d3-2383-4072-9f28-f37024dd5f5a` → **200**

```json
{
  "id": "7eae58d3-2383-4072-9f28-f37024dd5f5a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:07.029972Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7eae58d3-2383-4072-9f28-f37024dd5f5a` → **200**

```json
{
  "id": "7eae58d3-2383-4072-9f28-f37024dd5f5a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:07.029972Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/7eae58d3-2383-4072-9f28-f37024dd5f5a` → **200**

```json
{
  "id": "7eae58d3-2383-4072-9f28-f37024dd5f5a",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:31:07.029972Z",
  "ready_at": "2026-10-29T14:31:08.827485Z",
  "expires_at": "2026-10-30T14:31:08.827485Z"
}
```

`GET /api/admin/v1/reports/exports/7eae58d3-2383-4072-9f28-f37024dd5f5a/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "014d8d8e-6cda-4c6c-bb25-8235b0798a97",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "3d58c734-31bc-4005-933b-e6f514ec8701",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:09.968102Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3d58c734-31bc-4005-933b-e6f514ec8701` → **200**

```json
{
  "id": "3d58c734-31bc-4005-933b-e6f514ec8701",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:09.968102Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3d58c734-31bc-4005-933b-e6f514ec8701` → **200**

```json
{
  "id": "3d58c734-31bc-4005-933b-e6f514ec8701",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:09.968102Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3d58c734-31bc-4005-933b-e6f514ec8701` → **200**

```json
{
  "id": "3d58c734-31bc-4005-933b-e6f514ec8701",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T14:31:09.968102Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/3d58c734-31bc-4005-933b-e6f514ec8701` → **200**

```json
{
  "id": "3d58c734-31bc-4005-933b-e6f514ec8701",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T14:31:09.968102Z",
  "ready_at": "2026-10-29T14:31:13.833818Z",
  "expires_at": "2026-10-30T14:31:13.833818Z"
}
```

`GET /api/admin/v1/reports/exports/3d58c734-31bc-4005-933b-e6f514ec8701/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/c5a2f99b-5aa4-4972-a34a-c2b4814684a9` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/c5a2f99b-5aa4-4972-a34a-c2b4814684a9",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "ce8be830-d0d2-4a08-96de-dc836410bb88"
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
  "device_ref": "sandbox-1961"
}
```

```json
{
  "challenge_id": "3b0a03a2-9adb-4d11-bad4-8b6b11b8a32e",
  "expires_at": "2026-10-29T14:36:14.392521622Z",
  "resend_available_at": "2026-10-29T14:31:15.392521622Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "576976",
  "sent_at": "2026-10-29T14:31:14.394646392Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3b0a03a2-9adb-4d11-bad4-8b6b11b8a32e",
  "code": "576976",
  "device_ref": "sandbox-1961"
}
```

```json
{
  "session_id": "3028807f-73db-43b0-b3e1-f9360231ca2b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE3NCwiaWF0IjoxNzkzMjg0Mjc0LCJqdGkiOiIwMDhkZTBkYi1kMDBhLTQyMGMtOGIxYS01YzA3YTM3NjA5ZDEiLCJzaWQiOiIzMDI4ODA3Zi03M2RiLTQzYjAtYjNlMS1mOTM2MDIzMWNhMmIifQ.vPFwBTgmbmjgZpup8VGC3ehOsxLdTriyDa8l3K72TiY",
  "access_expires_at": "2026-10-29T14:46:14.64572696Z",
  "refresh_token": "ag-sr_sKm7UVO5leN7SFaU_mJ4-he89NIR-vIVSIc1M",
  "refresh_expires_at": "2026-11-28T14:31:14.645274388Z",
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
  "command_id": "02b53d8d-4195-45ac-a3fd-dabb8aa48990",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:15Z",
    "sequence": 1793284275318
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "67e2a778-5680-4519-abc0-ba7560d33e45",
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
  "last_heartbeat_at": "2026-10-29T14:31:15.33414Z",
  "last_location_at": "2026-10-29T14:31:15.33414Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "04c73dc6-ef35-47e7-8574-d779a30ce4c7",
  "points": [
    {
      "sequence": 1793284277565,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:30:17Z"
    },
    {
      "sequence": 1793284277572,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T14:31:17Z"
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
  "session_id": "048673f0-040d-4def-8995-441dd2c4e634",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxNzgsImlhdCI6MTc5MzI4NDI3OCwianRpIjoiZmVkYjc0NzgtMTZlZC00NmE5LWFmZjMtNzU4MzFmMTZiNTNkIiwic2lkIjoiMDQ4NjczZjAtMDQwZC00ZGVmLTg5OTUtNDQxZGQyYzRlNjM0In0.vzuDMFGryO22Ucon9pWaPvLgo8RLXImD-DySJIz-05A",
  "access_expires_at": "2026-10-29T14:46:18.08956225Z",
  "refresh_token": "fF_dKcSah2VC2CzUOCVnFV8ZE4FnUy9E7HvfoG7H9Tk",
  "refresh_expires_at": "2026-10-30T02:31:18.089113058Z",
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
      "id": "fa451e21-a0b4-43cf-976c-330600f5bcce",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T14:31:17Z",
        "track_point_id": "27bec9fc-65bc-476f-9fd6-ddd6e39f232d",
        "work_session_id": "67e2a778-5680-4519-abc0-ba7560d33e45"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T14:31:17Z",
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

`POST /api/admin/v1/driver-risk-flags/fa451e21-a0b4-43cf-976c-330600f5bcce/confirm` → **200**

```json
{
  "command_id": "72b07554-f9a3-4d12-bf9a-3389b3954d9a",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "fa451e21-a0b4-43cf-976c-330600f5bcce",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T14:31:17Z",
    "track_point_id": "27bec9fc-65bc-476f-9fd6-ddd6e39f232d",
    "work_session_id": "67e2a778-5680-4519-abc0-ba7560d33e45"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T14:31:17Z",
  "reason": null,
  "reviewed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reviewed_at": "2026-10-29T14:31:20.042649Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/fa451e21-a0b4-43cf-976c-330600f5bcce/dismiss` → **409**

```json
{
  "command_id": "cccb13a8-cfcb-4235-b56b-acd6e9cd5ec8",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/fa451e21-a0b4-43cf-976c-330600f5bcce/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e72d36ad-c0c3-49a9-8df8-c0b0b819c993"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "85f44eed-2080-48d6-8710-e50783733730",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "8f3a0dc7-bc43-4914-9b3f-ee75c96bebe6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "raised_at": "2026-10-29T14:31:20.516945Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/8f3a0dc7-bc43-4914-9b3f-ee75c96bebe6/dismiss` → **200**

```json
{
  "command_id": "d79b6719-d91e-4739-9bfc-a53df4476b77",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "8f3a0dc7-bc43-4914-9b3f-ee75c96bebe6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "raised_at": "2026-10-29T14:31:20.516945Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reviewed_at": "2026-10-29T14:31:20.751494Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "b8651dfd-89ca-4fd7-b483-ff884725b44d",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "fa451e21-a0b4-43cf-976c-330600f5bcce"
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
      "actor_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:31:20.992799Z"
    }
  ]
}
```

Done: flag fa451e21-a0b4-43cf-976c-330600f5bcce confirmed, suspension named it, driver reinstated.

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
  "session_id": "7ac319ca-d63c-4023-8787-3e3c2fa815c6",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxODEsImlhdCI6MTc5MzI4NDI4MSwianRpIjoiYzJkNmQ3MGItOTgyMC00OGNkLTgyZTQtMDVjYzlkY2IwYTFhIiwic2lkIjoiN2FjMzE5Y2EtZDYzYy00MDIzLTg3ODctM2UzYzJmYTgxNWM2In0.2lrZRmObMKVnM4-EPxhx7HpewLJ9MXSCphgJ_AwUEpc",
  "access_expires_at": "2026-10-29T14:46:21.773993069Z",
  "refresh_token": "JzEaQd-2rCpI9S74IY_as-ZsknedtGkNL0-knpE-XxM",
  "refresh_expires_at": "2026-10-30T02:31:21.773563362Z",
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
      "actor_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:31:20.992799Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "86c1d398-20ee-43c6-8372-eaa186945abb",
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
  "session_id": "67e2a778-5680-4519-abc0-ba7560d33e45",
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
  "last_heartbeat_at": "2026-10-29T14:31:15.33414Z",
  "last_location_at": "2026-10-29T14:31:15.33414Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/67e2a778-5680-4519-abc0-ba7560d33e45/close` → **200**

```json
{
  "command_id": "93a1778a-4fd8-4008-83c4-94fc983bb3f3",
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
  "session_id": "c834e1b0-e4f9-4190-a840-8cd2b4bae97d",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxODMsImlhdCI6MTc5MzI4NDI4MywianRpIjoiOGRmODU5NDQtY2FhOC00M2UzLWFhMmYtY2M1YTM4ZTI3Y2Q5Iiwic2lkIjoiYzgzNGUxYjAtZTRmOS00MTkwLWE4NDAtOGNkMmI0YmFlOTdkIn0.DlBaqG0NziEKDGxBT53MTMCKEsdnID84e7VQwYORIY0",
  "access_expires_at": "2026-10-29T14:46:23.242452518Z",
  "refresh_token": "IhnQD-vRCf-nwRJFmHxrHRmfoo4nqcrDaBP5uJlruMg",
  "refresh_expires_at": "2026-10-30T02:31:23.242037964Z",
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
  "command_id": "20ed31ea-49ab-4292-9374-d1567b7170b2",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:31:23.736979Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "20ed31ea-49ab-4292-9374-d1567b7170b2",
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
  "changed_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T14:31:23.736979Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48005041474",
  "device_ref": "sandbox-10495"
}
```

```json
{
  "challenge_id": "86dffb51-9912-4e16-8ead-d2738f8af1c3",
  "expires_at": "2026-10-29T14:36:24.235046977Z",
  "resend_available_at": "2026-10-29T14:31:25.235046977Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48005041474` → **200**

```json
{
  "phone": "+48005041474",
  "audience": "CLIENT",
  "code": "126222",
  "sent_at": "2026-10-29T14:31:24.240144811Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "86dffb51-9912-4e16-8ead-d2738f8af1c3",
  "code": "126222",
  "device_ref": "sandbox-10495"
}
```

```json
{
  "session_id": "c1331035-b5ad-4c5c-a2a2-70f0bb5d632d",
  "subject": {
    "type": "CLIENT",
    "id": "83061453-ae01-4688-9b43-78f00e3b91fb"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzA2MTQ1My1hZTAxLTQ2ODgtOWI0My03OGYwMGUzYjkxZmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTg0LCJpYXQiOjE3OTMyODQyODQsImp0aSI6IjliOTkwYzQwLTBjMTktNDVlYi1iYWUwLWI4NzA4NWQzNWRkNiIsInNpZCI6ImMxMzMxMDM1LWI1YWQtNGM1Yy1hMmEyLTcwZjBiYjVkNjMyZCJ9.lHXo5nkX4ps9HrRYIyrKdCuyLyzYIEk0IHKHpjtyUsY",
  "access_expires_at": "2026-10-29T14:46:24.523128662Z",
  "refresh_token": "UMEYPTxLMDCKiSwcMb7iQ90zH1l5gFCPsmD2xVl8FLE",
  "refresh_expires_at": "2026-11-28T14:31:24.522753778Z",
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
  "correlation_id": "c4a75265-2486-4264-ba03-7558634970e8"
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
  "device_ref": "sandbox-3816"
}
```

```json
{
  "challenge_id": "a9bc2fc9-948c-49e7-b3f7-27b765b60ae0",
  "expires_at": "2026-10-29T14:36:25.205104823Z",
  "resend_available_at": "2026-10-29T14:31:26.205104823Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "249483",
  "sent_at": "2026-10-29T14:31:25.207653242Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a9bc2fc9-948c-49e7-b3f7-27b765b60ae0",
  "code": "249483",
  "device_ref": "sandbox-3816"
}
```

```json
{
  "session_id": "bcfb1b7d-1634-444f-8277-fda7497d7176",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE4NSwiaWF0IjoxNzkzMjg0Mjg1LCJqdGkiOiIxNDIxOTBlMi0zMGRjLTQ2NjktYTYyNC1mNmEwNTM5N2MzMTgiLCJzaWQiOiJiY2ZiMWI3ZC0xNjM0LTQ0NGYtODI3Ny1mZGE3NDk3ZDcxNzYifQ.qVqTVxfr8S_Jh2W0G57ZrPTNPOKISaJi1dR82Q-HTI8",
  "access_expires_at": "2026-10-29T14:46:25.45796127Z",
  "refresh_token": "PSaCo7IHazwB0vV21MrRMoaa8O4Wols6EsyQOf6EQmM",
  "refresh_expires_at": "2026-11-28T14:31:25.45744363Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6254f6e1-d8ae-4d81-89c6-420effd1ffd8",
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
  "last_heartbeat_at": "2026-10-29T14:30:58.271564Z",
  "last_location_at": "2026-10-29T14:30:58.271564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6254f6e1-d8ae-4d81-89c6-420effd1ffd8/handover` → **200**

```json
{
  "command_id": "729da733-fec5-48f2-b379-7181e4325e26",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6254f6e1-d8ae-4d81-89c6-420effd1ffd8",
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
  "last_heartbeat_at": "2026-10-29T14:30:58.271564Z",
  "last_location_at": "2026-10-29T14:30:58.271564Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/6254f6e1-d8ae-4d81-89c6-420effd1ffd8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:26Z",
    "sequence": 1793284286144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "6254f6e1-d8ae-4d81-89c6-420effd1ffd8",
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
  "last_heartbeat_at": "2026-10-29T14:31:26.160745Z",
  "last_location_at": "2026-10-29T14:31:26.160745Z",
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
  "session_id": "6254f6e1-d8ae-4d81-89c6-420effd1ffd8",
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
  "last_heartbeat_at": "2026-10-29T14:31:26.160745Z",
  "last_location_at": "2026-10-29T14:31:26.160745Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/6254f6e1-d8ae-4d81-89c6-420effd1ffd8/close` → **200**

```json
{
  "command_id": "59bfe35b-d60a-4b87-a9c9-ea5a62a5cdb0",
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
  "correlation_id": "c48d444c-0c12-4e53-a7a5-1956d5363a08"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671455506",
  "device_ref": "sandbox-10262"
}
```

```json
{
  "challenge_id": "72bcdf28-0f32-4870-acc9-445fc73d0e8a",
  "expires_at": "2026-10-29T14:36:27.380450832Z",
  "resend_available_at": "2026-10-29T14:31:28.380450832Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671455506` → **200**

```json
{
  "phone": "+380671455506",
  "audience": "CLIENT",
  "code": "188682",
  "sent_at": "2026-10-29T14:31:27.382477705Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "72bcdf28-0f32-4870-acc9-445fc73d0e8a",
  "code": "188682",
  "device_ref": "sandbox-10262"
}
```

```json
{
  "session_id": "05f587d2-29a8-40d4-833c-c71ee6bd592a",
  "subject": {
    "type": "CLIENT",
    "id": "152737e2-27eb-4d0f-b080-dbcd356b7313"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNTI3MzdlMi0yN2ViLTRkMGYtYjA4MC1kYmNkMzU2YjczMTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTg3LCJpYXQiOjE3OTMyODQyODcsImp0aSI6Ijg0ZjM1ZTBlLTY1ZTItNDM5Ny05NmFiLWRiODU4NDU3OWVkYSIsInNpZCI6IjA1ZjU4N2QyLTI5YTgtNDBkNC04MzNjLWM3MWVlNmJkNTkyYSJ9.fJLYBzwEr8SeQ32tLO6FBTGfYgw40iMOof3NeFO4JX8",
  "access_expires_at": "2026-10-29T14:46:27.639062518Z",
  "refresh_token": "OwkdE8xRkApU9oY1wuaH-P-VsVcY9xOoFx3xOutG5oI",
  "refresh_expires_at": "2026-11-28T14:31:27.637684142Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "078ca2bc-9526-4fbc-924a-166e88d8b4e3",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "91edfbd1-2496-4f3a-b65a-ebeb7756d691",
  "upload_path": "/api/rider/v1/uploads/91edfbd1-2496-4f3a-b65a-ebeb7756d691",
  "expires_at": "2026-10-29T14:46:27.88925397Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/91edfbd1-2496-4f3a-b65a-ebeb7756d691` → **200**

```json
{
  "file_id": "91edfbd1-2496-4f3a-b65a-ebeb7756d691",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "63102547-fc83-4d29-9fa8-ed6d95f815a4",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "91edfbd1-2496-4f3a-b65a-ebeb7756d691"
  ]
}
```

```json
{
  "id": "1c4e5f42-82ce-405e-92c5-edb6219417d9",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:31:28.155678Z",
  "updated_at": "2026-10-29T14:31:28.155678Z",
  "respond_by": "2026-10-29T18:31:28.155678Z",
  "messages": [
    {
      "id": "0a7399fa-fe95-49b5-a41d-e38c27a3453f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:31:28.156589Z",
      "attachments": [
        {
          "file_id": "91edfbd1-2496-4f3a-b65a-ebeb7756d691",
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
  "session_id": "021d25f2-b5d7-4366-a7c7-2e3f6a7b7598",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxODgsImlhdCI6MTc5MzI4NDI4OCwianRpIjoiYmQ0NTZlNmQtOTZlZi00M2NjLWI1NzMtMmNmZDU0ZGI5OGJlIiwic2lkIjoiMDIxZDI1ZjItYjVkNy00MzY2LWE3YzctMmUzZjZhN2I3NTk4In0.nifBnqQER4AabUiAvRax_QHF7VqpgGqkIp1tPaEgsn4",
  "access_expires_at": "2026-10-29T14:46:28.660187619Z",
  "refresh_token": "IX3J24siQ7NL_1i7at68jSnNNnYi58VhmAM2Bqs_re0",
  "refresh_expires_at": "2026-10-30T02:31:28.659806334Z",
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
  "session_id": "1d476b56-510b-48bb-aa16-b763f9cfa963",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxODksImlhdCI6MTc5MzI4NDI4OSwianRpIjoiYmM4ZWVmNmEtNTE4MS00NjUwLTlkYWMtYTcyNzE3ZmFmMDY4Iiwic2lkIjoiMWQ0NzZiNTYtNTEwYi00OGJiLWFhMTYtYjc2M2Y5Y2ZhOTYzIn0.d1ePPP1JVNAktrnrI9DFxtQ8CKKbsCQSOmni6BX564I",
  "access_expires_at": "2026-10-29T14:46:29.14175315Z",
  "refresh_token": "lRUbb8LVtdsP47VNDayMWei7KSO8piX06y2wVRqJfaU",
  "refresh_expires_at": "2026-10-30T02:31:29.141326818Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/1c4e5f42-82ce-405e-92c5-edb6219417d9/attachments/91edfbd1-2496-4f3a-b65a-ebeb7756d691` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "21dd2ae6-54fa-43d4-bea0-e91883457824",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "78091773-bc66-4072-9cad-4d1d56f72294",
  "upload_path": "/api/operator/v1/uploads/78091773-bc66-4072-9cad-4d1d56f72294",
  "expires_at": "2026-10-29T14:46:29.396809896Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/78091773-bc66-4072-9cad-4d1d56f72294` → **200**

```json
{
  "file_id": "78091773-bc66-4072-9cad-4d1d56f72294",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/1c4e5f42-82ce-405e-92c5-edb6219417d9` → **200**

```json
{
  "id": "1c4e5f42-82ce-405e-92c5-edb6219417d9",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T14:31:28.155678Z",
  "updated_at": "2026-10-29T14:31:28.155678Z",
  "respond_by": "2026-10-29T18:31:28.155678Z",
  "messages": [
    {
      "id": "0a7399fa-fe95-49b5-a41d-e38c27a3453f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:31:28.156589Z",
      "attachments": [
        {
          "file_id": "91edfbd1-2496-4f3a-b65a-ebeb7756d691",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/1c4e5f42-82ce-405e-92c5-edb6219417d9/comments` → **200**

```json
{
  "command_id": "5d3bc861-4c60-4a37-b668-4cd02a1577fc",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "78091773-bc66-4072-9cad-4d1d56f72294"
  ]
}
```

```json
{
  "id": "1c4e5f42-82ce-405e-92c5-edb6219417d9",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:31:28.155678Z",
  "updated_at": "2026-10-29T14:31:29.880964Z",
  "respond_by": "2026-10-29T18:31:28.155678Z",
  "messages": [
    {
      "id": "0a7399fa-fe95-49b5-a41d-e38c27a3453f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:31:28.156589Z",
      "attachments": [
        {
          "file_id": "91edfbd1-2496-4f3a-b65a-ebeb7756d691",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9eeb4fa8-2489-4173-a4a2-949c4dd3b635",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:31:29.880511Z",
      "attachments": [
        {
          "file_id": "78091773-bc66-4072-9cad-4d1d56f72294",
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

`GET /api/rider/v1/support/cases/1c4e5f42-82ce-405e-92c5-edb6219417d9` → **200**

```json
{
  "id": "1c4e5f42-82ce-405e-92c5-edb6219417d9",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T14:31:28.155678Z",
  "updated_at": "2026-10-29T14:31:29.880964Z",
  "respond_by": "2026-10-29T18:31:28.155678Z",
  "messages": [
    {
      "id": "0a7399fa-fe95-49b5-a41d-e38c27a3453f",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "152737e2-27eb-4d0f-b080-dbcd356b7313",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T14:31:28.156589Z",
      "attachments": [
        {
          "file_id": "91edfbd1-2496-4f3a-b65a-ebeb7756d691",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "9eeb4fa8-2489-4173-a4a2-949c4dd3b635",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T14:31:29.880511Z",
      "attachments": [
        {
          "file_id": "78091773-bc66-4072-9cad-4d1d56f72294",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/1c4e5f42-82ce-405e-92c5-edb6219417d9/attachments/78091773-bc66-4072-9cad-4d1d56f72294` → **200**

Done: support case 1c4e5f42-82ce-405e-92c5-edb6219417d9, rider attachment 91edfbd1-2496-4f3a-b65a-ebeb7756d691, operator attachment 78091773-bc66-4072-9cad-4d1d56f72294.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731884999",
  "device_ref": "sandbox-23954"
}
```

```json
{
  "challenge_id": "02314cc0-e472-4ef7-a0ec-971c1c902c0f",
  "expires_at": "2026-10-29T14:36:30.375643921Z",
  "resend_available_at": "2026-10-29T14:31:31.375643921Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731884999` → **200**

```json
{
  "phone": "+380731884999",
  "audience": "CLIENT",
  "code": "479085",
  "sent_at": "2026-10-29T14:31:30.377697384Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02314cc0-e472-4ef7-a0ec-971c1c902c0f",
  "code": "479085",
  "device_ref": "sandbox-23954"
}
```

```json
{
  "session_id": "0a378441-1756-4743-9a71-a2fbb549b12f",
  "subject": {
    "type": "CLIENT",
    "id": "a27b977e-c9ca-470d-9f5a-42e3f702f807"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMjdiOTc3ZS1jOWNhLTQ3MGQtOWY1YS00MmUzZjcwMmY4MDciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MTkwLCJpYXQiOjE3OTMyODQyOTAsImp0aSI6IjA1ZDY0YjNhLTViYmQtNDkxNC1iNWNjLWZiNzhiYWRlNmRiNiIsInNpZCI6IjBhMzc4NDQxLTE3NTYtNDc0My05YTcxLWEyZmJiNTQ5YjEyZiJ9.8mw7SjBoFhobDruI7UR5YxbpUVA-5Ye_rCOES7r8No8",
  "access_expires_at": "2026-10-29T14:46:30.625523509Z",
  "refresh_token": "2kLN1KG3TOoDs5Z_BLUMIbeHrWn0p1Op793G-hkYZS8",
  "refresh_expires_at": "2026-11-28T14:31:30.625115009Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "a201e7bf-8201-4c22-9431-20b2f6f1b39a",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "7dc1db7c-3860-416a-b5c1-30519967ce73",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-7dc1db7c-3860-416a-b5c1-30519967ce73",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "3e132098b447b8cb22db8400a8879e4d",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=7dc1db7c-3860-416a-b5c1-30519967ce73",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731884999"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=7dc1db7c-3860-416a-b5c1-30519967ce73",
  "expires_at": "2026-10-29T15:01:30.858313Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/7dc1db7c-3860-416a-b5c1-30519967ce73` → **200**

```json
{
  "id": "7dc1db7c-3860-416a-b5c1-30519967ce73",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T15:01:30.858313Z",
  "card": {
    "id": "d51c325a-fb8d-4bc6-8332-2d5e17742d3a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****6114",
    "card_type": "Visa",
    "created_at": "2026-10-29T14:31:31.087803Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "55c77949-5d28-4502-9e8e-60d3a980246b",
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
  "id": "53f34412-40c0-4e2e-9f1e-e406cc9918ac",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:31.338434Z",
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
  "command_id": "47bc6e47-54b6-4ebf-ab97-90ea106b099d",
  "quote_id": "53f34412-40c0-4e2e-9f1e-e406cc9918ac",
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
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d` → **200**

```json
{
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d` → **200**

```json
{
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
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

`GET /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d` → **200**

```json
{
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d/switch-to-cash` → **200**

```json
{
  "command_id": "658bae3b-72a4-4312-9ddb-5f4f48a5d0bf",
  "expected_version": 3
}
```

```json
{
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d/switch-to-cash` → **409**

```json
{
  "command_id": "69ec769a-7e0d-45cd-adb0-f4cd0a2fe864",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "03a34155-4e04-4d09-9848-0737bc4c7cf0"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d` → **200**

```json
{
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/a64d0990-5070-490f-9aea-49abc7f5dd3d/cancel` → **200**

```json
{
  "command_id": "d1d973dd-c738-4c44-b2eb-0e6b5682f4f7",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "a64d0990-5070-490f-9aea-49abc7f5dd3d",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "a27b977e-c9ca-470d-9f5a-42e3f702f807",
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
  "created_at": "2026-10-29T14:31:31.584649Z",
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
  "session_id": "b22463a9-6b90-476b-98ab-cdbce18da132",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxOTQsImlhdCI6MTc5MzI4NDI5NCwianRpIjoiMWRkOTk3NDAtMDNjNC00N2VjLTgwZjUtNTEyOTcwZDlmZmI0Iiwic2lkIjoiYjIyNDYzYTktNmI5MC00NzZiLTk4YWItY2RiY2UxOGRhMTMyIn0.Ilc-1oXfl_P_GfCUjv4mcgIloEgzUbOsT4VxW7W4E_E",
  "access_expires_at": "2026-10-29T14:46:34.870046604Z",
  "refresh_token": "Ysk96fdKl4l86CSTUEP78mmqiW2cvIJ7SAbqjbycA4E",
  "refresh_expires_at": "2026-10-30T02:31:34.869634343Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-24655"
}
```

```json
{
  "challenge_id": "716eb9c3-d30a-45f5-ab63-d436457be1c0",
  "expires_at": "2026-10-29T14:36:35.102597839Z",
  "resend_available_at": "2026-10-29T14:31:36.102597839Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "879592",
  "sent_at": "2026-10-29T14:31:35.104669209Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "716eb9c3-d30a-45f5-ab63-d436457be1c0",
  "code": "879592",
  "device_ref": "sandbox-24655"
}
```

```json
{
  "session_id": "53086310-d6ac-42f3-b6cb-2c3950862f2e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE5NSwiaWF0IjoxNzkzMjg0Mjk1LCJqdGkiOiJjMzlhNGY3Zi0wZWI2LTRlNzEtOGVmZi02NGRjMzExZGZjODEiLCJzaWQiOiI1MzA4NjMxMC1kNmFjLTQyZjMtYjZjYi0yYzM5NTA4NjJmMmUifQ.Vyd84LkT1ox66WY2pnYEUKytSO9rECEyNjnIyJ323mg",
  "access_expires_at": "2026-10-29T14:46:35.364771795Z",
  "refresh_token": "WoGVrDljFwgcpucinre8ZosafOJh-pgbvTZgfpAQWlg",
  "refresh_expires_at": "2026-11-28T14:31:35.364339308Z",
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
      "actor_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T14:31:20.992799Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T14:31:22.295129Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "65c46bdb-5c4f-46b1-8e41-1336b8b7626d",
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
  "device_ref": "sandbox-4933"
}
```

```json
{
  "challenge_id": "66e01df6-a528-4296-8c79-f2c38d7d7c46",
  "expires_at": "2026-10-29T14:36:36.29329752Z",
  "resend_available_at": "2026-10-29T14:31:37.29329752Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "483261",
  "sent_at": "2026-10-29T14:31:36.295490282Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "66e01df6-a528-4296-8c79-f2c38d7d7c46",
  "code": "483261",
  "device_ref": "sandbox-4933"
}
```

```json
{
  "session_id": "1b07a796-bf0c-4bce-baed-3ad56c834de0",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTE5NiwiaWF0IjoxNzkzMjg0Mjk2LCJqdGkiOiI2NDhlZTUzZS03YWEwLTQyZjktOGRhZC0wOTQ4NDM5YTdmOTYiLCJzaWQiOiIxYjA3YTc5Ni1iZjBjLTRiY2UtYmFlZC0zYWQ1NmM4MzRkZTAifQ.dIr3Et-ePMROjfpqG-dKejPwJrmemM_VAMWrkoz_jvw",
  "access_expires_at": "2026-10-29T14:46:36.549691474Z",
  "refresh_token": "0yMVNNZ8ymjL9MY45ZjF3HjkloMDlrFDrSAu1XOq_VA",
  "refresh_expires_at": "2026-11-28T14:31:36.54928392Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:04.133656Z",
  "last_location_at": "2026-10-29T14:31:04.133656Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2fac80c4-f467-456d-b739-b0e84bf1b03b/handover` → **200**

```json
{
  "command_id": "f2b73b45-a535-4510-885f-f8db15246798",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:04.133656Z",
  "last_location_at": "2026-10-29T14:31:04.133656Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2fac80c4-f467-456d-b739-b0e84bf1b03b/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:37Z",
    "sequence": 1793284297233
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:37.249227Z",
  "last_location_at": "2026-10-29T14:31:37.249227Z",
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
  "command_id": "b285f08f-65d1-4713-bb19-904b9edc98a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:37Z",
    "sequence": 1793284297696
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2c52166f-e856-4a1d-9433-3a9ce630a1ee",
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
  "last_heartbeat_at": "2026-10-29T14:31:37.712393Z",
  "last_location_at": "2026-10-29T14:31:37.712393Z",
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
  "session_id": "18e62a16-5757-4595-9427-5613df70d96a",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUxOTgsImlhdCI6MTc5MzI4NDI5OCwianRpIjoiOTkyMmUxMDktODNhMy00MzhhLWIwMTYtMGNhZjZkYTJmZDMxIiwic2lkIjoiMThlNjJhMTYtNTc1Ny00NTk1LTk0MjctNTYxM2RmNzBkOTZhIn0.bRE4rrLsIbPwB6yNr35ODtjofmBw2b9-PEB3MMMqUVc",
  "access_expires_at": "2026-10-29T14:46:38.199434955Z",
  "refresh_token": "rWhQSnqe-cvPVuYbOjIuGex4mQUkqqD15JB1nScssU8",
  "refresh_expires_at": "2026-10-30T02:31:38.199015583Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "3eca6bad-ad10-4257-b1eb-b2f82ddffa89",
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
  "id": "d25f4f09-a220-49a6-bd85-d71a64c875a5",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:38.430851Z",
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
  "command_id": "85b50ac9-f171-4681-8932-9082e6a7de72",
  "quote_id": "d25f4f09-a220-49a6-bd85-d71a64c875a5",
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
  "id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
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
  "created_at": "2026-10-29T14:31:38.670059Z",
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
    "id": "3458adc4-c9e6-4f44-be1e-ebed2f3af7b2",
    "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
    "expires_at": "2026-10-29T14:31:53.673401Z",
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

`POST /api/driver/v1/offers/3458adc4-c9e6-4f44-be1e-ebed2f3af7b2/accept` → **200**

```json
{
  "command_id": "63f3d3ff-d8c5-4706-9423-63db947a841a"
}
```

```json
{
  "id": "acbd5b3f-6b66-4c5f-bb06-58704289f248",
  "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "7fbe2d3d-41b5-4504-999d-733ad564352e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "7fbe2d3d-41b5-4504-999d-733ad564352e",
  "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
  "assignment_id": "acbd5b3f-6b66-4c5f-bb06-58704289f248",
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

`POST /api/driver/v1/work-sessions/2c52166f-e856-4a1d-9433-3a9ce630a1ee/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T14:31:39Z",
    "sequence": 1793284299837
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2c52166f-e856-4a1d-9433-3a9ce630a1ee",
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
  "last_heartbeat_at": "2026-10-29T14:31:39.852965Z",
  "last_location_at": "2026-10-29T14:31:39.852965Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/7fbe2d3d-41b5-4504-999d-733ad564352e/arrive` → **200**

```json
{
  "command_id": "baaf3ad2-8945-4ff3-8854-a58e56d7060b",
  "expected_version": 0
}
```

```json
{
  "id": "7fbe2d3d-41b5-4504-999d-733ad564352e",
  "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
  "assignment_id": "acbd5b3f-6b66-4c5f-bb06-58704289f248",
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
  "arrived_at": "2026-10-29T14:31:40.085381Z",
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

`POST /api/driver/v1/trips/7fbe2d3d-41b5-4504-999d-733ad564352e/start` → **200**

```json
{
  "command_id": "9c92f047-81fd-4978-888b-3e0a9a402af9",
  "expected_version": 1
}
```

```json
{
  "id": "7fbe2d3d-41b5-4504-999d-733ad564352e",
  "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
  "assignment_id": "acbd5b3f-6b66-4c5f-bb06-58704289f248",
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
  "arrived_at": "2026-10-29T14:31:40.085381Z",
  "started_at": "2026-10-29T14:31:40.32606Z",
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

`POST /api/driver/v1/trips/7fbe2d3d-41b5-4504-999d-733ad564352e/complete` → **200**

```json
{
  "command_id": "0b3d137a-dd65-49cc-8dae-ef6dc50531e6",
  "expected_version": 2,
  "reported_at": "2026-10-29T14:31:40Z",
  "cash_received": true
}
```

```json
{
  "id": "7fbe2d3d-41b5-4504-999d-733ad564352e",
  "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
  "assignment_id": "acbd5b3f-6b66-4c5f-bb06-58704289f248",
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
  "arrived_at": "2026-10-29T14:31:40.085381Z",
  "started_at": "2026-10-29T14:31:40.32606Z",
  "completed_at": "2026-10-29T14:31:40.564369Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/9232f039-69f7-47d6-9552-ac6599ac1d9a` → **200**

```json
{
  "id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
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
    "id": "acbd5b3f-6b66-4c5f-bb06-58704289f248",
    "order_id": "9232f039-69f7-47d6-9552-ac6599ac1d9a",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "7fbe2d3d-41b5-4504-999d-733ad564352e",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T14:31:38.670059Z",
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
  "session_id": "2fac80c4-f467-456d-b739-b0e84bf1b03b",
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
  "last_heartbeat_at": "2026-10-29T14:31:37.249227Z",
  "last_location_at": "2026-10-29T14:31:37.249227Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2fac80c4-f467-456d-b739-b0e84bf1b03b/close` → **200**

```json
{
  "command_id": "0a1d98fe-8132-4217-b840-01355c20a780",
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
  "session_id": "2c52166f-e856-4a1d-9433-3a9ce630a1ee",
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
  "last_heartbeat_at": "2026-10-29T14:31:39.852965Z",
  "last_location_at": "2026-10-29T14:31:39.852965Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2c52166f-e856-4a1d-9433-3a9ce630a1ee/close` → **200**

```json
{
  "command_id": "6cc9560b-7cf9-42e8-8a10-4681c5ce97cf",
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

Done: terminal order 9232f039-69f7-47d6-9552-ac6599ac1d9a by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-8131"
}
```

```json
{
  "challenge_id": "73870d93-6654-413b-b7c5-891a6b90b6c2",
  "expires_at": "2026-10-29T14:36:45.223444236Z",
  "resend_available_at": "2026-10-29T14:31:46.223444236Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "041675",
  "sent_at": "2026-10-29T14:31:45.225650169Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "73870d93-6654-413b-b7c5-891a6b90b6c2",
  "code": "041675",
  "device_ref": "sandbox-8131"
}
```

```json
{
  "session_id": "7caffc60-cb81-4ff6-8f5d-47096ad413e8",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIwNSwiaWF0IjoxNzkzMjg0MzA1LCJqdGkiOiIxYjI3NWIzYS1iZWQ3LTQxNGYtOTY4Mi0xYzIyMWQxZDliYTMiLCJzaWQiOiI3Y2FmZmM2MC1jYjgxLTRmZjYtOGY1ZC00NzA5NmFkNDEzZTgifQ.H9arABeb9cN3Gw1UlzG1KBAioAW3HcCQshOARQTsD7w",
  "access_expires_at": "2026-10-29T14:46:45.471062184Z",
  "refresh_token": "9P26F2YFgWLiRPS4eNT4EmyB8d0DH3vI0HPik4CNyO4",
  "refresh_expires_at": "2026-11-28T14:31:45.470642061Z",
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
  "device_ref": "sandbox-968"
}
```

```json
{
  "challenge_id": "0203c1f6-a879-4270-9a89-ce6c6e2a2c7e",
  "expires_at": "2026-10-29T14:36:45.917017266Z",
  "resend_available_at": "2026-10-29T14:31:46.917017266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "749869",
  "sent_at": "2026-10-29T14:31:45.919002576Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0203c1f6-a879-4270-9a89-ce6c6e2a2c7e",
  "code": "749869",
  "device_ref": "sandbox-968"
}
```

```json
{
  "session_id": "cad0aa88-7ebb-474f-adba-58331200687f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIwNiwiaWF0IjoxNzkzMjg0MzA2LCJqdGkiOiJhZjNlOTM3OS1iZWZhLTQ2ZjQtYTAzZi1mYTQ5NDliNmYyMWUiLCJzaWQiOiJjYWQwYWE4OC03ZWJiLTQ3NGYtYWRiYS01ODMzMTIwMDY4N2YifQ.h-b4S-muVopPevl0B7pH_5h38JW5VB5AMSd0CEs8oDM",
  "access_expires_at": "2026-10-29T14:46:46.167856291Z",
  "refresh_token": "fC-fdOcfVkw36Yl6HuZxEzIsuXnu3XvCuD_gvnnjflw",
  "refresh_expires_at": "2026-11-28T14:31:46.167484891Z",
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
  "device_ref": "sandbox-4869"
}
```

```json
{
  "challenge_id": "74c18fac-be9e-4656-aa6c-0369230f9a35",
  "expires_at": "2026-10-29T14:36:46.613410634Z",
  "resend_available_at": "2026-10-29T14:31:47.613410634Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "398087",
  "sent_at": "2026-10-29T14:31:46.615408173Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "74c18fac-be9e-4656-aa6c-0369230f9a35",
  "code": "398087",
  "device_ref": "sandbox-4869"
}
```

```json
{
  "session_id": "2cf0e95d-020d-43c1-ae25-b0101d092a9f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4NTIwNiwiaWF0IjoxNzkzMjg0MzA2LCJqdGkiOiJiYzRlMWZlNi00YmZmLTRlYWUtYjlmMy0xZGQ1ZjUxMDgyN2YiLCJzaWQiOiIyY2YwZTk1ZC0wMjBkLTQzYzEtYWUyNS1iMDEwMWQwOTJhOWYifQ.Dvr62svcDmS9t9g__NlGzw3KVMNSgEAD1IFuXg_X_z4",
  "access_expires_at": "2026-10-29T14:46:46.865270016Z",
  "refresh_token": "3OlkwFygQ_r8oNarW3Saszwvj7rXE2yWiYIyZooy5BY",
  "refresh_expires_at": "2026-11-28T14:31:46.864854931Z",
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
  "phone": "+380692807021",
  "device_ref": "sandbox-5929"
}
```

```json
{
  "challenge_id": "36023299-aca4-4dd6-b50b-04f9cce5a6fb",
  "expires_at": "2026-10-29T14:36:47.307545946Z",
  "resend_available_at": "2026-10-29T14:31:48.307545946Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380692807021` → **200**

```json
{
  "phone": "+380692807021",
  "audience": "CLIENT",
  "code": "588537",
  "sent_at": "2026-10-29T14:31:47.309538577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36023299-aca4-4dd6-b50b-04f9cce5a6fb",
  "code": "588537",
  "device_ref": "sandbox-5929"
}
```

```json
{
  "session_id": "89b14c97-b56f-4983-93c4-f92bc9c67789",
  "subject": {
    "type": "CLIENT",
    "id": "0af69d7a-626a-480e-868a-985f1defd05d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwYWY2OWQ3YS02MjZhLTQ4MGUtODY4YS05ODVmMWRlZmQwNWQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg1MjA3LCJpYXQiOjE3OTMyODQzMDcsImp0aSI6IjNjNTg1OTk3LWU1NWUtNDYxNy1hNDliLWQ5ZTE4MzczYjUzNCIsInNpZCI6Ijg5YjE0Yzk3LWI1NmYtNDk4My05M2M0LWY5MmJjOWM2Nzc4OSJ9.KlJ-fpWMW-jWUYIsj1tGZfoNyDBFOqlvDpUHfz59o0U",
  "access_expires_at": "2026-10-29T14:46:47.559606951Z",
  "refresh_token": "5S3nmZR-iLlvvkZOcZxVrA5yKQ3-t9QsDS3eB4qT-Mc",
  "refresh_expires_at": "2026-11-28T14:31:47.559170979Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c5e68b5-8413-4fe7-9c68-37c84f36c873",
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
  "id": "1cdb715e-54be-4f1d-8fc6-87562d7e7a1b",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T14:36:47.801296Z",
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
  "command_id": "3586df36-c30c-426a-b07d-21a7aef3b9bc",
  "quote_id": "1cdb715e-54be-4f1d-8fc6-87562d7e7a1b",
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
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 11.789515618
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.120307465
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

`GET /api/rider/v1/orders/fee08c14-7e58-44f9-851d-65bf3c3c1916` → **200**

```json
{
  "id": "fee08c14-7e58-44f9-851d-65bf3c3c1916",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "0af69d7a-626a-480e-868a-985f1defd05d",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T14:31:48.038827Z",
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
  "session_id": "a4883e0e-df09-4999-b654-b4de5e5060ea",
  "subject": {
    "type": "STAFF",
    "id": "19a415f0-70ef-40f1-bafd-5905cf93503e"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxOWE0MTVmMC03MGVmLTQwZjEtYmFmZC01OTA1Y2Y5MzUwM2UiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODUzOTIsImlhdCI6MTc5MzI4NDQ5MiwianRpIjoiN2MyYzYzZTItZGZiZC00ZTM3LTkzNWQtZjNiZjliNTczNzIzIiwic2lkIjoiYTQ4ODNlMGUtZGYwOS00OTk5LWI2NTQtYjRkZTVlNTA2MGVhIn0.j7RCNkN4j-AfpDKrPzzA_1wJWfOPAK9fRygMN9dYbiA",
  "access_expires_at": "2026-10-29T14:49:52.671668223Z",
  "refresh_token": "x_jnegaPVE9cFkHEfombz6wmXHKD4QiPo6oExjnG9t4",
  "refresh_expires_at": "2026-10-30T02:34:52.671246297Z",
  "password_change_required": false
}
```

## The earlier card flows reconcile cleanly without moving money

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29"
}
```

```json
{
  "id": "4b3a0411-d7cf-4192-8472-e278e9c9b5c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.019651Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.019742Z",
  "updated_at": "2026-10-29T14:34:53.033322Z",
  "finished_at": "2026-10-29T14:34:53.033322Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/4b3a0411-d7cf-4192-8472-e278e9c9b5c4` → **200**

```json
{
  "run": {
    "id": "4b3a0411-d7cf-4192-8472-e278e9c9b5c4",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:34:53.019651Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:34:53.019742Z",
    "updated_at": "2026-10-29T14:34:53.033322Z",
    "finished_at": "2026-10-29T14:34:53.033322Z",
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
  "day": "2026-10-29"
}
```

```json
{
  "id": "4b3a0411-d7cf-4192-8472-e278e9c9b5c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.019651Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.019742Z",
  "updated_at": "2026-10-29T14:34:53.033322Z",
  "finished_at": "2026-10-29T14:34:53.033322Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29"
}
```

```json
{
  "id": "4b3a0411-d7cf-4192-8472-e278e9c9b5c4",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.019651Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.019742Z",
  "updated_at": "2026-10-29T14:34:53.033322Z",
  "finished_at": "2026-10-29T14:34:53.033322Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/13e66250-2b4f-44c6-8af4-5106ff237e72` → **204**

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
  "day": "2026-10-29"
}
```

```json
{
  "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.433717Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.433795Z",
  "updated_at": "2026-10-29T14:34:53.439395Z",
  "finished_at": "2026-10-29T14:34:53.439395Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/eab40d80-b357-41fa-9ea9-3c26c08bf3e2` → **200**

```json
{
  "run": {
    "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:34:53.433717Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:34:53.433795Z",
    "updated_at": "2026-10-29T14:34:53.439395Z",
    "finished_at": "2026-10-29T14:34:53.439395Z",
    "version": 1
  },
  "items": [
    {
      "id": "f99c6466-3d47-45a0-b566-0ecc48eafb6c",
      "run_id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "0b8a70f9e5b90a330079e82a779ad73803fc107efeb9e2b88f6dec02580bbd21",
      "reference_display": "sandbox-reconciliation-13e#####-2b4f-44c6-8af4-5106ff237e72",
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
      "provider_at": "2026-10-29T14:34:53Z",
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
  "day": "2026-10-29"
}
```

```json
{
  "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.433717Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.433795Z",
  "updated_at": "2026-10-29T14:34:53.439395Z",
  "finished_at": "2026-10-29T14:34:53.439395Z",
  "version": 1
}
```

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.433717Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.433795Z",
  "updated_at": "2026-10-29T14:34:53.439395Z",
  "finished_at": "2026-10-29T14:34:53.439395Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/f99c6466-3d47-45a0-b566-0ecc48eafb6c/resolve` → **200**

```json
{
  "command_id": "e36e093b-9673-46a1-ae0d-b4af0a2bbde5",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f99c6466-3d47-45a0-b566-0ecc48eafb6c",
  "run_id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "0b8a70f9e5b90a330079e82a779ad73803fc107efeb9e2b88f6dec02580bbd21",
  "reference_display": "sandbox-reconciliation-13e#####-2b4f-44c6-8af4-5106ff237e72",
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
  "provider_at": "2026-10-29T14:34:53Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "resolved_at": "2026-10-29T14:34:53.796222Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f99c6466-3d47-45a0-b566-0ecc48eafb6c/resolve` → **200**

```json
{
  "command_id": "e36e093b-9673-46a1-ae0d-b4af0a2bbde5",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f99c6466-3d47-45a0-b566-0ecc48eafb6c",
  "run_id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "0b8a70f9e5b90a330079e82a779ad73803fc107efeb9e2b88f6dec02580bbd21",
  "reference_display": "sandbox-reconciliation-13e#####-2b4f-44c6-8af4-5106ff237e72",
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
  "provider_at": "2026-10-29T14:34:53Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
  "resolved_at": "2026-10-29T14:34:53.796222Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f99c6466-3d47-45a0-b566-0ecc48eafb6c/resolve` → **409**

```json
{
  "command_id": "04a032fe-8eb5-45c2-a688-4a149b424721",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/f99c6466-3d47-45a0-b566-0ecc48eafb6c/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "e718eb17-8f18-4f13-ba42-5f6fcaa4c580"
}
```

`GET /api/admin/v1/payment-reconciliations/eab40d80-b357-41fa-9ea9-3c26c08bf3e2` → **200**

```json
{
  "run": {
    "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T14:34:53.433717Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T14:34:53.433795Z",
    "updated_at": "2026-10-29T14:34:53.796222Z",
    "finished_at": "2026-10-29T14:34:53.439395Z",
    "version": 2
  },
  "items": [
    {
      "id": "f99c6466-3d47-45a0-b566-0ecc48eafb6c",
      "run_id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "0b8a70f9e5b90a330079e82a779ad73803fc107efeb9e2b88f6dec02580bbd21",
      "reference_display": "sandbox-reconciliation-13e#####-2b4f-44c6-8af4-5106ff237e72",
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
      "provider_at": "2026-10-29T14:34:53Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "19a415f0-70ef-40f1-bafd-5905cf93503e",
      "resolved_at": "2026-10-29T14:34:53.796222Z",
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
      "id": "8602f686-cbdb-4f7d-b419-7a6f8ca2ebe5",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T14:27:48.516241Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:27:48.516359Z",
      "updated_at": "2026-10-29T14:27:48.51993Z",
      "finished_at": "2026-10-29T14:27:48.51993Z",
      "version": 1
    },
    {
      "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T14:34:53.433717Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T14:34:53.433795Z",
      "updated_at": "2026-10-29T14:34:53.796222Z",
      "finished_at": "2026-10-29T14:34:53.439395Z",
      "version": 2
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/13e66250-2b4f-44c6-8af4-5106ff237e72` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "eab40d80-b357-41fa-9ea9-3c26c08bf3e2",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T14:34:53.433717Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T14:34:53.433795Z",
  "updated_at": "2026-10-29T14:34:53.796222Z",
  "finished_at": "2026-10-29T14:34:53.439395Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.793284618911E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793284618948E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793284618948E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793284618949E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793284618948E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
