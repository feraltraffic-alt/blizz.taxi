# Sandbox transcript (2026-10-29T17:28:49Z, 0e8f478)

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
  "correlation_id": "0024518c-dd50-403d-8d41-3dbef2872dda"
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
  "session_id": "4550662e-0a45-43e1-8936-f723118b7e46",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4MzYsImlhdCI6MTc5MzI5NDkzNiwianRpIjoiM2U4NzMzNWYtNGMyYi00YWY3LWJmYTEtZTNiOWViMDFiNTI2Iiwic2lkIjoiNDU1MDY2MmUtMGE0NS00M2UxLTg5MzYtZjcyMzExOGI3ZTQ2In0.RUu3ZHkpZvqOpzeiQEXj7FG-1iCDFJqHRGcJ8yUqQ68",
  "access_expires_at": "2026-10-29T17:43:56.87737998Z",
  "refresh_token": "mPsb6sVbKOpZOE1C38XycIcQQHviyvY52FgptAhbm2Q",
  "refresh_expires_at": "2026-10-30T05:28:56.875146838Z",
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
  "session_id": "db349c6f-f169-4c32-8001-ffe76ed94da0",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4MzgsImlhdCI6MTc5MzI5NDkzOCwianRpIjoiMWI4NDQ3NGUtNzlhMy00NjE2LWFmNjItNjE2NzU4NzJlNjhlIiwic2lkIjoiZGIzNDljNmYtZjE2OS00YzMyLTgwMDEtZmZlNzZlZDk0ZGEwIn0.HWS7iR-2paXIuRl_cRe9zCuVtD1CXONjZ13hAefGoAQ",
  "access_expires_at": "2026-10-29T17:43:58.730864582Z",
  "refresh_token": "KPO0KAl-IuuSD1H1L5ZDsW3UYNrBErqob0KFuxagGHs",
  "refresh_expires_at": "2026-10-30T05:28:58.729896778Z",
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
  "device_ref": "sandbox-306"
}
```

```json
{
  "challenge_id": "c0f7b09d-7c22-49ef-915b-a37a317af6b4",
  "expires_at": "2026-10-29T17:33:59.356105624Z",
  "resend_available_at": "2026-10-29T17:29:00.356105624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "002962",
  "sent_at": "2026-10-29T17:28:59.36927518Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c0f7b09d-7c22-49ef-915b-a37a317af6b4",
  "code": "002962",
  "device_ref": "sandbox-306"
}
```

```json
{
  "session_id": "1570cd52-18fa-4aa5-ab3b-ee3a87cc9b2a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTgzOSwiaWF0IjoxNzkzMjk0OTM5LCJqdGkiOiI2ZGY3OWZkZi1kNzlhLTRhZDItYWIzNy01NGU3ZmE2ODI2YWQiLCJzaWQiOiIxNTcwY2Q1Mi0xOGZhLTRhYTUtYWIzYi1lZTNhODdjYzliMmEifQ.dlSejxvuig3jPaE0mvUZzZCREUKW44DoTsWgvaNeEUc",
  "access_expires_at": "2026-10-29T17:43:59.720436421Z",
  "refresh_token": "RpIFF-5yOuPUtqK1L3KG_NspaSu0nASfwUegeIgdP0s",
  "refresh_expires_at": "2026-11-28T17:28:59.719435838Z",
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
  "command_id": "12a66563-915b-4cd0-95cf-e6785d30734f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:00Z",
    "sequence": 1793294940292
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbf039da-1847-4e55-9de1-69919ed70d0f",
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
  "last_heartbeat_at": "2026-10-29T17:29:00.402989Z",
  "last_location_at": "2026-10-29T17:29:00.402989Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630848727",
  "device_ref": "sandbox-22752"
}
```

```json
{
  "challenge_id": "757c8113-65c5-477a-8de3-4ef0ce43322b",
  "expires_at": "2026-10-29T17:34:00.69585658Z",
  "resend_available_at": "2026-10-29T17:29:01.69585658Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630848727` → **200**

```json
{
  "phone": "+380630848727",
  "audience": "CLIENT",
  "code": "383325",
  "sent_at": "2026-10-29T17:29:00.700815593Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "757c8113-65c5-477a-8de3-4ef0ce43322b",
  "code": "383325",
  "device_ref": "sandbox-22752"
}
```

```json
{
  "session_id": "0eafd4f1-b7d7-4b2a-b81a-743866ed168e",
  "subject": {
    "type": "CLIENT",
    "id": "416e1613-3d98-44d1-b8eb-7f3be310ab16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MTZlMTYxMy0zZDk4LTQ0ZDEtYjhlYi03ZjNiZTMxMGFiMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1ODQxLCJpYXQiOjE3OTMyOTQ5NDEsImp0aSI6ImE5MjBmN2MyLTI4YmQtNDg4Mi05ZDllLTNkYWM3NDI5YjZiOSIsInNpZCI6IjBlYWZkNGYxLWI3ZDctNGIyYS1iODFhLTc0Mzg2NmVkMTY4ZSJ9.CS2cJSCi3_cnJQnIrqhfIkweaKPqW6itmAszKeiO6lk",
  "access_expires_at": "2026-10-29T17:44:01.015085576Z",
  "refresh_token": "WshhPyC7XPaiqEAb7FxZi31EwCuKEt3gopT0tpNHkY4",
  "refresh_expires_at": "2026-11-28T17:29:01.013938656Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "ec6ef699-eb7d-4b97-9d85-ed29a2257c4e",
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
  "id": "0be3cafe-a9d6-4cc4-8b70-42f4ee5e53ff",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:34:01.344046Z",
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
  "command_id": "d567827a-cc99-4da6-8c13-9a68806b5589",
  "quote_id": "0be3cafe-a9d6-4cc4-8b70-42f4ee5e53ff",
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
  "id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "416e1613-3d98-44d1-b8eb-7f3be310ab16",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:29:01.731216Z",
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
    "id": "a0d837de-5198-4a5b-9c84-43df5ff73d77",
    "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
    "expires_at": "2026-10-29T17:29:16.741997Z",
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

`POST /api/driver/v1/offers/a0d837de-5198-4a5b-9c84-43df5ff73d77/accept` → **200**

```json
{
  "command_id": "99707dd2-47f4-410f-bb01-85ed07e579ec"
}
```

```json
{
  "id": "6ef71fe9-d766-4a94-8bf3-66964eeb686a",
  "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "74a55e5c-1913-4ab7-ab2c-58bcbe750d56",
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
  "command_id": "a07f3cb2-e514-47f8-a426-0b5c23fcf84e",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T17:29:03.013710267Z"
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
  "id": "74a55e5c-1913-4ab7-ab2c-58bcbe750d56",
  "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
  "assignment_id": "6ef71fe9-d766-4a94-8bf3-66964eeb686a",
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

`POST /api/driver/v1/work-sessions/dbf039da-1847-4e55-9de1-69919ed70d0f/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:03Z",
    "sequence": 1793294943931
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "dbf039da-1847-4e55-9de1-69919ed70d0f",
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
  "last_heartbeat_at": "2026-10-29T17:29:03.95907Z",
  "last_location_at": "2026-10-29T17:29:03.95907Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/74a55e5c-1913-4ab7-ab2c-58bcbe750d56/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "68bda27d-9be4-4ac5-b13e-8fd726992f1d",
  "expected_version": 0
}
```

```json
{
  "id": "74a55e5c-1913-4ab7-ab2c-58bcbe750d56",
  "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
  "assignment_id": "6ef71fe9-d766-4a94-8bf3-66964eeb686a",
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
  "arrived_at": "2026-10-29T17:29:04.261712Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/74a55e5c-1913-4ab7-ab2c-58bcbe750d56/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f247b9fd-df30-4918-868c-971789b1cfa6",
  "expected_version": 1
}
```

```json
{
  "id": "74a55e5c-1913-4ab7-ab2c-58bcbe750d56",
  "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
  "assignment_id": "6ef71fe9-d766-4a94-8bf3-66964eeb686a",
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
  "arrived_at": "2026-10-29T17:29:04.261712Z",
  "started_at": "2026-10-29T17:29:04.574601Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/74a55e5c-1913-4ab7-ab2c-58bcbe750d56/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "3851a51c-5d9a-4c8d-a3cc-1312f68b04b4",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:29:04Z",
  "cash_received": true
}
```

```json
{
  "id": "74a55e5c-1913-4ab7-ab2c-58bcbe750d56",
  "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
  "assignment_id": "6ef71fe9-d766-4a94-8bf3-66964eeb686a",
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
  "arrived_at": "2026-10-29T17:29:04.261712Z",
  "started_at": "2026-10-29T17:29:04.574601Z",
  "completed_at": "2026-10-29T17:29:04.930849Z",
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
  "session_id": "dbf039da-1847-4e55-9de1-69919ed70d0f",
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
  "last_heartbeat_at": "2026-10-29T17:29:03.95907Z",
  "last_location_at": "2026-10-29T17:29:03.95907Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/dbf039da-1847-4e55-9de1-69919ed70d0f/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "5bbf82ea-dc2f-49d6-8fee-a11fb89d3e8d",
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
  "command_id": "2b3097ab-2784-437e-8b4d-fc057ea352b0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:05Z",
    "sequence": 1793294945834
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
  "correlation_id": "c4403c50-1bbf-4f69-92ff-f2e944fca9f0",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "cd1bfff0-2f71-4f27-8ef6-a4eadc610c2a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:06Z",
    "sequence": 1793294946174
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5385f46e-b8bf-41f7-b603-fe23a91970e8",
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
  "last_heartbeat_at": "2026-10-29T17:29:06.196978Z",
  "last_location_at": "2026-10-29T17:29:06.196978Z",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T17:29:03.01371Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "03f9a3f4-bf9a-424f-9440-c531c33ccb2f",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T17:29:06.813987214Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5385f46e-b8bf-41f7-b603-fe23a91970e8",
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
  "last_heartbeat_at": "2026-10-29T17:29:06.196978Z",
  "last_location_at": "2026-10-29T17:29:06.196978Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5385f46e-b8bf-41f7-b603-fe23a91970e8/close` → **200**

```json
{
  "command_id": "dbb56613-b818-4bd2-8e84-05ae8267a2e2",
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
  "session_id": "244bd85b-a44c-4acd-b9ac-d867fe42592c",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4NDgsImlhdCI6MTc5MzI5NDk0OCwianRpIjoiMjI5YmQwMTEtNTk5NC00YjU4LWE1ZGUtYTNmZWYxZmU5ODBiIiwic2lkIjoiMjQ0YmQ4NWItYTQ0Yy00YWNkLWI5YWMtZDg2N2ZlNDI1OTJjIn0.GXgnj8aYYkw1Xd6AKodsoKnLJnWiv8iaY_Qs3nEWmBA",
  "access_expires_at": "2026-10-29T17:44:08.037125356Z",
  "refresh_token": "n9qfA0ge-RcCXlbwX3pFNQJulfGqNgX5Vz1NAe5FDcc",
  "refresh_expires_at": "2026-10-30T05:29:08.036315767Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "d3e3ccce-e7fb-4d9d-9fbd-18f773d69e01",
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
  "id": "cab19e59-c90a-4879-9364-e4eb3962f48f",
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
  "created_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "created_at": "2026-10-29T17:29:08.343876Z",
  "updated_at": "2026-10-29T17:29:08.343876Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380636344823",
  "device_ref": "sandbox-18618"
}
```

```json
{
  "challenge_id": "425c853b-07ba-4b1d-a58c-6504ee780d58",
  "expires_at": "2026-10-29T17:34:08.661163682Z",
  "resend_available_at": "2026-10-29T17:29:09.661163682Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636344823` → **200**

```json
{
  "phone": "+380636344823",
  "audience": "CLIENT",
  "code": "334362",
  "sent_at": "2026-10-29T17:29:08.666304736Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "425c853b-07ba-4b1d-a58c-6504ee780d58",
  "code": "334362",
  "device_ref": "sandbox-18618"
}
```

```json
{
  "session_id": "333ff0bb-ae73-4de7-9bed-9a5f013d7d07",
  "subject": {
    "type": "CLIENT",
    "id": "47c9a700-5dbd-49af-aaa5-8799b0949255"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0N2M5YTcwMC01ZGJkLTQ5YWYtYWFhNS04Nzk5YjA5NDkyNTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1ODQ5LCJpYXQiOjE3OTMyOTQ5NDksImp0aSI6IjBlODVkMzgxLTQ1NDQtNDllNy1hNTNiLTVjZTliOGQzNzZjZiIsInNpZCI6IjMzM2ZmMGJiLWFlNzMtNGRlNy05YmVkLTlhNWYwMTNkN2QwNyJ9.kDSI8XP5g_z2zh1jR3bfkQ2NndfjMadbdmEtU52J6a0",
  "access_expires_at": "2026-10-29T17:44:09.002836251Z",
  "refresh_token": "HDRbJAafkX2ZiBZPp744SX3UiTLN97lgDY2k13ij9FU",
  "refresh_expires_at": "2026-11-28T17:29:09.002058922Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380636344823` → **200**

```json
{
  "client_id": "47c9a700-5dbd-49af-aaa5-8799b0949255"
}
```

`POST /api/admin/v1/rider-wallets/47c9a700-5dbd-49af-aaa5-8799b0949255/top-ups` → **201**

```json
{
  "command_id": "eb618e90-fa5c-4e7f-a539-6eeff3ec84e8",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "47c9a700-5dbd-49af-aaa5-8799b0949255",
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
      "id": "cfc10464-be12-49c2-b2f7-2bc5ac8fe38d",
      "at": "2026-10-29T17:29:09.590311Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "f06759f7-3ac0-4ff4-beed-94e9691381b4",
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
  "id": "73acc14b-b69d-4dc1-b109-402ad30fc2ec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:34:09.904594Z",
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
      "id": "cab19e59-c90a-4879-9364-e4eb3962f48f",
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
  "device_ref": "sandbox-13125"
}
```

```json
{
  "challenge_id": "6df20489-2166-40f4-af54-20015ea7e8f8",
  "expires_at": "2026-10-29T17:34:10.212038498Z",
  "resend_available_at": "2026-10-29T17:29:11.212038498Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "276399",
  "sent_at": "2026-10-29T17:29:10.216276367Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6df20489-2166-40f4-af54-20015ea7e8f8",
  "code": "276399",
  "device_ref": "sandbox-13125"
}
```

```json
{
  "session_id": "e383ad23-0458-4106-b348-68b63cd5a625",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTg1MCwiaWF0IjoxNzkzMjk0OTUwLCJqdGkiOiJiYjFiNzJhYi01Nzg2LTRmNWQtYmRmNC1iNmMzOGM1NGUwZTkiLCJzaWQiOiJlMzgzYWQyMy0wNDU4LTQxMDYtYjM0OC02OGI2M2NkNWE2MjUifQ.WWXD6uBsXhYGQO5ku6L3Xj0AEDaIiRRWgaNGprVkGds",
  "access_expires_at": "2026-10-29T17:44:10.537733926Z",
  "refresh_token": "OXujHVTCx9Z94_iS_WSE1ZFPZaVCqVyIYEgdh0MWm48",
  "refresh_expires_at": "2026-11-28T17:29:10.5369673Z",
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
  "command_id": "8556156c-c2b3-4d1e-9a2a-d9459d7437f4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:11Z",
    "sequence": 1793294951101
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bd580ca-d729-48f2-a741-0835a5ee3fb3",
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
  "last_heartbeat_at": "2026-10-29T17:29:11.122321Z",
  "last_location_at": "2026-10-29T17:29:11.122321Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "37ca3ed9-3eea-420c-bed0-192a9a994894",
  "quote_id": "73acc14b-b69d-4dc1-b109-402ad30fc2ec",
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
  "id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "47c9a700-5dbd-49af-aaa5-8799b0949255",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:29:11.442516Z",
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
  "client_id": "47c9a700-5dbd-49af-aaa5-8799b0949255",
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
      "id": "cfc10464-be12-49c2-b2f7-2bc5ac8fe38d",
      "at": "2026-10-29T17:29:09.590311Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
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
    "id": "8a157b3f-456e-4c00-b00a-202387c09b65",
    "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
    "expires_at": "2026-10-29T17:29:26.451845Z",
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

`POST /api/driver/v1/offers/8a157b3f-456e-4c00-b00a-202387c09b65/accept` → **200**

```json
{
  "command_id": "d4fec014-d506-478f-ab5a-9d985efe8f39"
}
```

```json
{
  "id": "0e042950-21cd-409f-95c5-8c5801185270",
  "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c33bc8ed-26db-4e66-b852-735b740a0949",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c33bc8ed-26db-4e66-b852-735b740a0949",
  "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
  "assignment_id": "0e042950-21cd-409f-95c5-8c5801185270",
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

`POST /api/driver/v1/work-sessions/5bd580ca-d729-48f2-a741-0835a5ee3fb3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:12Z",
    "sequence": 1793294952938
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bd580ca-d729-48f2-a741-0835a5ee3fb3",
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
  "last_heartbeat_at": "2026-10-29T17:29:12.959479Z",
  "last_location_at": "2026-10-29T17:29:12.959479Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c33bc8ed-26db-4e66-b852-735b740a0949/arrive` → **200**

```json
{
  "command_id": "bdd8e7aa-a929-4082-96a9-50a7cd43754d",
  "expected_version": 0
}
```

```json
{
  "id": "c33bc8ed-26db-4e66-b852-735b740a0949",
  "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
  "assignment_id": "0e042950-21cd-409f-95c5-8c5801185270",
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
  "arrived_at": "2026-10-29T17:29:13.255256Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c33bc8ed-26db-4e66-b852-735b740a0949/start` → **200**

```json
{
  "command_id": "c9ff3047-967e-4588-81c0-2f741069390d",
  "expected_version": 1
}
```

```json
{
  "id": "c33bc8ed-26db-4e66-b852-735b740a0949",
  "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
  "assignment_id": "0e042950-21cd-409f-95c5-8c5801185270",
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
  "arrived_at": "2026-10-29T17:29:13.255256Z",
  "started_at": "2026-10-29T17:29:13.56656Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/c33bc8ed-26db-4e66-b852-735b740a0949/complete` → **200**

```json
{
  "command_id": "7038e29e-8924-407b-8611-f9255bba9277",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:29:13Z",
  "cash_received": true
}
```

```json
{
  "id": "c33bc8ed-26db-4e66-b852-735b740a0949",
  "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
  "assignment_id": "0e042950-21cd-409f-95c5-8c5801185270",
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
  "arrived_at": "2026-10-29T17:29:13.255256Z",
  "started_at": "2026-10-29T17:29:13.56656Z",
  "completed_at": "2026-10-29T17:29:13.887637Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "47c9a700-5dbd-49af-aaa5-8799b0949255",
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
      "id": "b97bf2b1-9e68-44fd-98d4-a04b668ecbcd",
      "at": "2026-10-29T17:29:13.962504Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b"
    },
    {
      "id": "cfc10464-be12-49c2-b2f7-2bc5ac8fe38d",
      "at": "2026-10-29T17:29:09.590311Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/cab19e59-c90a-4879-9364-e4eb3962f48f/archive` → **200**

```json
{
  "command_id": "e507b284-26f3-420c-ad61-9f9c0c1dad56",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "cab19e59-c90a-4879-9364-e4eb3962f48f",
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
  "created_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "created_at": "2026-10-29T17:29:08.343876Z",
  "updated_at": "2026-10-29T17:29:17.526826Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "5bd580ca-d729-48f2-a741-0835a5ee3fb3",
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
  "last_heartbeat_at": "2026-10-29T17:29:12.959479Z",
  "last_location_at": "2026-10-29T17:29:12.959479Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5bd580ca-d729-48f2-a741-0835a5ee3fb3/close` → **200**

```json
{
  "command_id": "2b2c2487-d9b0-4511-86bb-ecbcbdde11b0",
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

Done: order f11ffec8-bafa-4be1-8413-f94eae84c61b.

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
  "session_id": "8eb96338-cf86-46c0-9ad7-c52dde133731",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4NTgsImlhdCI6MTc5MzI5NDk1OCwianRpIjoiNTU1ODViYjEtN2FkNS00ZGU4LWJlYTItYTYzMmQyNTcxZWIzIiwic2lkIjoiOGViOTYzMzgtY2Y4Ni00NmMwLTlhZDctYzUyZGRlMTMzNzMxIn0.aXibSXoWLI0N7PGs51x4_ZGyXcLHot9gaIgPNB0b2ZY",
  "access_expires_at": "2026-10-29T17:44:18.722038689Z",
  "refresh_token": "UmkTFw8ipqtkPu1I_6eowOJbQtZtzuhF26HuvaazyZQ",
  "refresh_expires_at": "2026-10-30T05:29:18.721338624Z",
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
  "command_id": "dfdbd6c9-f00a-46ae-8beb-b6b3c8a4d960",
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
  "session_id": "30005376-d23f-4a9d-bb8f-e8ff3373b308",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4NTksImlhdCI6MTc5MzI5NDk1OSwianRpIjoiNDZhNDUxMmQtMjdmMi00YjA0LTk2YzItZDU0NDc0MDYxYjQ1Iiwic2lkIjoiMzAwMDUzNzYtZDIzZi00YTlkLWJiOGYtZThmZjMzNzNiMzA4In0.2O_SynX45m1ThY3qMStvaItBrpwWyReLEYH3QlJEnFU",
  "access_expires_at": "2026-10-29T17:44:19.890747896Z",
  "refresh_token": "H8bPuskVb8tT-s-pg8zN4IqFdPxx9F5FbTzxeylH7Zo",
  "refresh_expires_at": "2026-10-30T05:29:19.890044746Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.1757828339",
    "linkedid": "1730052700.1757828339",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678144512"
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
    "id": "1730052700.1757828339",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "7078a7ee-2e77-4a8d-a5ce-74a7c71771b2",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.182601Z",
      "answered_at": null,
      "ended_at": "2026-10-29T17:29:20.209164Z",
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
    "id": "1730052600.167511384",
    "linkedid": "1730052600.167511384",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678144512"
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
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/94a12af1-88eb-465f-9efa-a164214ba15f/answer` → **200**

```json
{
  "command_id": "7d3c196f-1e68-4f28-a19f-18f92e514451"
}
```

```json
{
  "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678144512",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "order_ids": [],
  "started_at": "2026-10-29T17:29:20.537853Z",
  "answered_at": "2026-10-29T17:29:20.870318Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.167511384",
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
    "id": "1730052600.167511384",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
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
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
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
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
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
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
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
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:29:28.612317Z"
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
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:29:28.612317Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/94a12af1-88eb-465f-9efa-a164214ba15f/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/94a12af1-88eb-465f-9efa-a164214ba15f/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=94a12af1-88eb-465f-9efa-a164214ba15f` → **200**

```json
{
  "changes": [
    {
      "id": "ca1bba85-7092-47de-bcb0-cfe2001273ba",
      "occurred_at": "2026-10-29T17:29:31.078255Z",
      "actor_type": "STAFF",
      "actor_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"af9f8483-fd99-4e70-9fd2-3ed14d033d39\", \"order_ids\": []}",
      "correlation_id": "d4280f4f-0d70-400d-84ea-58443a892427"
    },
    {
      "id": "a7390851-4b9d-43e4-a6bd-db89b34b02f2",
      "occurred_at": "2026-10-29T17:29:31.043024Z",
      "actor_type": "STAFF",
      "actor_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"af9f8483-fd99-4e70-9fd2-3ed14d033d39\", \"order_ids\": []}",
      "correlation_id": "b05b9c11-accd-44fb-a925-7954f8deca75"
    }
  ]
}
```

Done: call 94a12af1-88eb-465f-9efa-a164214ba15f recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-32744"
}
```

```json
{
  "challenge_id": "2cd8abed-8dd5-40d8-ad6e-bc3c90d1f672",
  "expires_at": "2026-10-29T17:34:31.408613619Z",
  "resend_available_at": "2026-10-29T17:29:32.408613619Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "174809",
  "sent_at": "2026-10-29T17:29:31.413181701Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cd8abed-8dd5-40d8-ad6e-bc3c90d1f672",
  "code": "174809",
  "device_ref": "sandbox-32744"
}
```

```json
{
  "session_id": "c0e968d9-00fe-4a40-8eaa-4d4350838b06",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTg3MSwiaWF0IjoxNzkzMjk0OTcxLCJqdGkiOiJkNmEzZmM0ZC02ZGYxLTQ1ZjUtYjU1MC1lZTk3YmE3YjdlMjMiLCJzaWQiOiJjMGU5NjhkOS0wMGZlLTRhNDAtOGVhYS00ZDQzNTA4MzhiMDYifQ.HRsRiWlD_a6fSWVOjqOMcuqGchfxS5LwVuEzYuBmwxQ",
  "access_expires_at": "2026-10-29T17:44:31.730302736Z",
  "refresh_token": "0MyimqKhxjnsJlIjHiOhLl1lHeQj39IRPJJJTJaRb0k",
  "refresh_expires_at": "2026-11-28T17:29:31.729626556Z",
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
  "command_id": "48c5038c-af26-4063-b357-9a916e3c4ef7",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:32Z",
    "sequence": 1793294972306
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96f7569-e8f6-4aa7-9712-b575ecb287ba",
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
  "last_heartbeat_at": "2026-10-29T17:29:32.32804Z",
  "last_location_at": "2026-10-29T17:29:32.32804Z",
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
  "session_id": "9aded8e6-47f0-46a8-975c-c8c9c22d1f89",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4NzIsImlhdCI6MTc5MzI5NDk3MiwianRpIjoiNzZkODJiOWYtYTUwMC00MmVjLTkzNjAtMDBlMTBlNzZlODYyIiwic2lkIjoiOWFkZWQ4ZTYtNDdmMC00NmE4LTk3NWMtYzhjOWMyMmQxZjg5In0.CPWyQBXhe-Wq8W2W0_2I39z4bIwj3s9eevKA5iewvuk",
  "access_expires_at": "2026-10-29T17:44:32.919307711Z",
  "refresh_token": "HjT_yjiHznhOCsNduSRSC6y_6J6DN6HUukteBzI9YDw",
  "refresh_expires_at": "2026-10-30T05:29:32.91872734Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "afab7ba4-8925-458d-a143-cb4e9f496a89",
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
  "id": "d0f0b62e-f1c4-43d3-841d-324199a006ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:34:33.213516Z",
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
  "command_id": "078e4159-5490-413b-9d92-399e3036789e",
  "quote_id": "d0f0b62e-f1c4-43d3-841d-324199a006ba",
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
    "phone": "+380674889341"
  }
}
```

```json
{
  "id": "25630201-6eda-47be-b239-c10bde4a56ae",
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
  "created_at": "2026-10-29T17:29:33.549097Z",
  "caller": {
    "name": "Олена",
    "phone": "+380674889341"
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
    "id": "bd54d32e-1f44-4ad3-8ee2-d1e20a1244e9",
    "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
    "expires_at": "2026-10-29T17:29:48.554691Z",
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

`POST /api/driver/v1/offers/bd54d32e-1f44-4ad3-8ee2-d1e20a1244e9/accept` → **200**

```json
{
  "command_id": "d395eaaf-858a-47bb-8b19-de46b6bcb2e6"
}
```

```json
{
  "id": "dcb9be69-9f56-441e-a76f-8b216bc33d4c",
  "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6022fbe6-43a7-42f5-8080-bbdb16591565",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "6022fbe6-43a7-42f5-8080-bbdb16591565",
  "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
  "assignment_id": "dcb9be69-9f56-441e-a76f-8b216bc33d4c",
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
    "phone": "+380674889341"
  }
}
```

`POST /api/driver/v1/work-sessions/a96f7569-e8f6-4aa7-9712-b575ecb287ba/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:36Z",
    "sequence": 1793294976881
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "a96f7569-e8f6-4aa7-9712-b575ecb287ba",
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
  "last_heartbeat_at": "2026-10-29T17:29:36.902277Z",
  "last_location_at": "2026-10-29T17:29:36.902277Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/6022fbe6-43a7-42f5-8080-bbdb16591565/arrive` → **200**

```json
{
  "command_id": "ccd1d1f6-7dc9-4ef3-96f7-ef01be14f0fa",
  "expected_version": 0
}
```

```json
{
  "id": "6022fbe6-43a7-42f5-8080-bbdb16591565",
  "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
  "assignment_id": "dcb9be69-9f56-441e-a76f-8b216bc33d4c",
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
  "arrived_at": "2026-10-29T17:29:37.206456Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674889341"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  },
  {
    "phone": "+380674889341",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:38.868011529Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  },
  {
    "phone": "+380674889341",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:38.868011529Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380674889341` → **200**

```json
[
  {
    "phone": "+380674889341",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:35.855766351Z"
  },
  {
    "phone": "+380674889341",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T17:29:38.868011529Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/6022fbe6-43a7-42f5-8080-bbdb16591565/start` → **200**

```json
{
  "command_id": "19a17c71-c7e7-466a-99fa-6cb2792653d4",
  "expected_version": 1
}
```

```json
{
  "id": "6022fbe6-43a7-42f5-8080-bbdb16591565",
  "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
  "assignment_id": "dcb9be69-9f56-441e-a76f-8b216bc33d4c",
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
  "arrived_at": "2026-10-29T17:29:37.206456Z",
  "started_at": "2026-10-29T17:29:39.650236Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380674889341"
  }
}
```

`POST /api/driver/v1/trips/6022fbe6-43a7-42f5-8080-bbdb16591565/complete` → **200**

```json
{
  "command_id": "71100c36-d3f6-4d72-bd0a-7ffa40131c60",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:29:39Z",
  "cash_received": true
}
```

```json
{
  "id": "6022fbe6-43a7-42f5-8080-bbdb16591565",
  "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
  "assignment_id": "dcb9be69-9f56-441e-a76f-8b216bc33d4c",
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
  "arrived_at": "2026-10-29T17:29:37.206456Z",
  "started_at": "2026-10-29T17:29:39.650236Z",
  "completed_at": "2026-10-29T17:29:39.956884Z",
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
  "session_id": "a96f7569-e8f6-4aa7-9712-b575ecb287ba",
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
  "last_heartbeat_at": "2026-10-29T17:29:36.902277Z",
  "last_location_at": "2026-10-29T17:29:36.902277Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a96f7569-e8f6-4aa7-9712-b575ecb287ba/close` → **200**

```json
{
  "command_id": "1778fa8f-c4df-40f6-9b3b-35df0ca57da0",
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
  "phone": "+380632368472",
  "device_ref": "sandbox-7921"
}
```

```json
{
  "challenge_id": "efc2a735-430e-48aa-a1d7-6f51e09b9964",
  "expires_at": "2026-10-29T17:34:40.850234002Z",
  "resend_available_at": "2026-10-29T17:29:41.850234002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632368472` → **200**

```json
{
  "phone": "+380632368472",
  "audience": "CLIENT",
  "code": "797053",
  "sent_at": "2026-10-29T17:29:40.854368093Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "efc2a735-430e-48aa-a1d7-6f51e09b9964",
  "code": "797053",
  "device_ref": "sandbox-7921"
}
```

```json
{
  "session_id": "809db391-5703-4e08-bfeb-654284174de0",
  "subject": {
    "type": "CLIENT",
    "id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkNzQwZmQzZi1lZmFkLTRjYWYtOTE1MC05ZmI3ZjhkZDNjNGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1ODgxLCJpYXQiOjE3OTMyOTQ5ODEsImp0aSI6IjBmYWZhYTIyLTQ4M2MtNDMwMC1hODE3LTlkNTFkY2Q5ZjVhZCIsInNpZCI6IjgwOWRiMzkxLTU3MDMtNGUwOC1iZmViLTY1NDI4NDE3NGRlMCJ9.5oMFOtROXj7RYMudkneBp2Zd4_HHNXXWRKBra1aawcc",
  "access_expires_at": "2026-10-29T17:44:41.172913208Z",
  "refresh_token": "VqdosgJeS_Sw3Z0B-KPuwoGODeRAOtkfC0sx7Ffn770",
  "refresh_expires_at": "2026-11-28T17:29:41.172264299Z",
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
  "device_ref": "sandbox-7819"
}
```

```json
{
  "challenge_id": "044fb8c5-0bfb-4bac-8a9b-4611ad6253f7",
  "expires_at": "2026-10-29T17:34:41.754771493Z",
  "resend_available_at": "2026-10-29T17:29:42.754771493Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "947122",
  "sent_at": "2026-10-29T17:29:41.758236608Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "044fb8c5-0bfb-4bac-8a9b-4611ad6253f7",
  "code": "947122",
  "device_ref": "sandbox-7819"
}
```

```json
{
  "session_id": "5c7253e9-f93b-4d34-a310-b5b9a2a118d6",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTg4MiwiaWF0IjoxNzkzMjk0OTgyLCJqdGkiOiI5YTNlN2MyYi0wMDVjLTRhYjAtYTcwMi1iZDEzYmNiZDQ1NzYiLCJzaWQiOiI1YzcyNTNlOS1mOTNiLTRkMzQtYTMxMC1iNWI5YTJhMTE4ZDYifQ.x-shSH_Yc2xbQRV9uDCuX9qgJjJORPixe9O3uFzDf2M",
  "access_expires_at": "2026-10-29T17:44:42.073946185Z",
  "refresh_token": "m9kiDVFXWRdyNz4zZjkUwXO5HiJQtjo6xaIfPBrFNq0",
  "refresh_expires_at": "2026-11-28T17:29:42.073258947Z",
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
  "session_id": "d283eda2-e1db-4ceb-a7db-287f3686e06a",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4ODIsImlhdCI6MTc5MzI5NDk4MiwianRpIjoiYmE1Y2M0N2EtNjc1Mi00YjlkLWI0MDItYmE1NGU3ZjRiZDlmIiwic2lkIjoiZDI4M2VkYTItZTFkYi00Y2ViLWE3ZGItMjg3ZjM2ODZlMDZhIn0.g9Ui96Iu1niOJo0cKNXXMtM28I78ys1o0M2q9HSN1Sg",
  "access_expires_at": "2026-10-29T17:44:42.935735507Z",
  "refresh_token": "9RadoBODmclrrxX8HVF41K0yQFgqcgVMu72unfEaFk4",
  "refresh_expires_at": "2026-10-30T05:29:42.935127754Z",
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
  "session_id": "781aaa9c-d626-4b8b-b086-c7ca2b2202a5",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU4ODMsImlhdCI6MTc5MzI5NDk4MywianRpIjoiMDk1MmI0YjctMzliYy00ZGY1LTg0YzgtZWYxZmYxOGJhZWZhIiwic2lkIjoiNzgxYWFhOWMtZDYyNi00YjhiLWIwODYtYzdjYTJiMjIwMmE1In0.FwAbrX7Ne4grbL3e4U194pRPlYzNZVEKH_UBD3mYMkw",
  "access_expires_at": "2026-10-29T17:44:43.514292531Z",
  "refresh_token": "IsGJG1EsJqEZ-3ij3Tbyl_8xEKcrIXyC7b3pnmvOwKY",
  "refresh_expires_at": "2026-10-30T05:29:43.513542333Z",
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
  "command_id": "c4036e8a-808d-4369-84ff-73cb12498256",
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
  "id": "33cee1d0-f63a-4d99-b7db-d9fbec77ce1a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:34:44.094656Z",
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
  "command_id": "d948ae08-d51c-4363-9f9c-322fd6015775",
  "quote_id": "33cee1d0-f63a-4d99-b7db-d9fbec77ce1a",
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
  "id": "5dc95a15-906c-41b4-99b6-52224747c97b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d",
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
  "created_at": "2026-10-29T17:29:44.405373Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5dc95a15-906c-41b4-99b6-52224747c97b` → **200**

```json
{
  "id": "5dc95a15-906c-41b4-99b6-52224747c97b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d",
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
  "created_at": "2026-10-29T17:29:44.405373Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/5dc95a15-906c-41b4-99b6-52224747c97b/cancel` → **200**

```json
{
  "command_id": "936933d4-fd27-4e4f-adc5-52460824e40b",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "5dc95a15-906c-41b4-99b6-52224747c97b",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d",
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
  "created_at": "2026-10-29T17:29:44.405373Z",
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
  "command_id": "8eab95f1-c365-489d-bbec-c1ba2de9b3d1",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:45Z",
    "sequence": 1793294985630
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a99fc277-672d-413b-8036-f044cee74c71",
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
  "last_heartbeat_at": "2026-10-29T17:29:45.651324Z",
  "last_location_at": "2026-10-29T17:29:45.651324Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-13558"
}
```

```json
{
  "challenge_id": "48df24c3-431e-4525-88d7-1828a1161770",
  "expires_at": "2026-10-29T17:34:45.943796417Z",
  "resend_available_at": "2026-10-29T17:29:46.943796417Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "862860",
  "sent_at": "2026-10-29T17:29:45.948045497Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "48df24c3-431e-4525-88d7-1828a1161770",
  "code": "862860",
  "device_ref": "sandbox-13558"
}
```

```json
{
  "session_id": "70a2f34b-e3dc-4237-9a8e-0c1c8d60e3cb",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTg4NiwiaWF0IjoxNzkzMjk0OTg2LCJqdGkiOiIxNDYwMzAxZS1mYmMyLTRhNDYtYjQ0NC03Y2E1MmIwYzA1OWUiLCJzaWQiOiI3MGEyZjM0Yi1lM2RjLTQyMzctOWE4ZS0wYzFjOGQ2MGUzY2IifQ.Si1Gk5LSSXruYTqi8KroVfHzrf1eocIEukWQllvgaRw",
  "access_expires_at": "2026-10-29T17:44:46.255241515Z",
  "refresh_token": "h82BdpURwBFSff5vteHz1SZv59DKpvM411LQWJnhfr0",
  "refresh_expires_at": "2026-11-28T17:29:46.254503289Z",
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
  "command_id": "8ab25e5e-81d1-4005-b662-a5a6d2f230a5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:46Z",
    "sequence": 1793294986821
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:29:46.841378Z",
  "last_location_at": "2026-10-29T17:29:46.841378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "60d52a0a-2a29-47ff-bcbf-e43ad9c40ee0",
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
  "id": "aabb009d-591e-4e4d-9748-b73fd6a19f77",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:34:47.145981Z",
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
  "command_id": "e4712356-e6a1-4b18-aabb-b7ca16eb21bb",
  "quote_id": "aabb009d-591e-4e4d-9748-b73fd6a19f77",
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
  "id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d",
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
  "created_at": "2026-10-29T17:29:47.441593Z",
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
    "id": "5ca9d57f-9c2d-4962-a8e2-bd1ef0e2b4c4",
    "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
    "expires_at": "2026-10-29T17:30:02.44578Z",
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

`POST /api/driver/v1/offers/5ca9d57f-9c2d-4962-a8e2-bd1ef0e2b4c4/accept` → **200**

```json
{
  "command_id": "3ec80279-b771-45b7-9a78-073d278dbabb"
}
```

```json
{
  "id": "dc02d22a-b67f-4da3-a2bf-72bc6c3d8926",
  "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8799b601-26a6-40cc-b48f-1353381668f0",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8799b601-26a6-40cc-b48f-1353381668f0",
  "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "assignment_id": "dc02d22a-b67f-4da3-a2bf-72bc6c3d8926",
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

`POST /api/driver/v1/trips/8799b601-26a6-40cc-b48f-1353381668f0/cancel` → **200**

```json
{
  "command_id": "8772190f-d304-4b82-aabb-bc3a823c6b15",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "8799b601-26a6-40cc-b48f-1353381668f0",
  "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "assignment_id": "dc02d22a-b67f-4da3-a2bf-72bc6c3d8926",
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

`GET /api/rider/v1/orders/0378709c-2895-4f2d-9413-ef7bc9c431fa` → **200**

```json
{
  "id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d",
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
    "id": "dc02d22a-b67f-4da3-a2bf-72bc6c3d8926",
    "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8799b601-26a6-40cc-b48f-1353381668f0",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T17:29:47.441593Z",
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
    "id": "37f76b03-4bc7-4435-89d1-cf19fe9a6f8c",
    "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
    "expires_at": "2026-10-29T17:30:03.658784Z",
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

`POST /api/driver/v1/offers/37f76b03-4bc7-4435-89d1-cf19fe9a6f8c/accept` → **200**

```json
{
  "command_id": "f133ff3c-3531-48f1-b3ec-229aa4d7f429"
}
```

```json
{
  "id": "16a8b411-6032-4188-8aae-e5b45de74dd5",
  "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "81ba497f-84a0-452e-8968-e8c89caeedb3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "81ba497f-84a0-452e-8968-e8c89caeedb3",
  "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "assignment_id": "16a8b411-6032-4188-8aae-e5b45de74dd5",
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

`POST /api/driver/v1/trips/81ba497f-84a0-452e-8968-e8c89caeedb3/cancel` → **200**

```json
{
  "command_id": "042399bb-1dde-4838-8cc4-d553e6e8bb30",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "81ba497f-84a0-452e-8968-e8c89caeedb3",
  "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
  "assignment_id": "16a8b411-6032-4188-8aae-e5b45de74dd5",
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
    "id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T17:29:47.441593Z",
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
    "id": "5dc95a15-906c-41b4-99b6-52224747c97b",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T17:29:44.405373Z",
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

`GET /api/operator/v1/orders/0378709c-2895-4f2d-9413-ef7bc9c431fa/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:29:47.442255Z",
      "actor": {
        "type": "CLIENT",
        "id": "d740fd3f-efad-4caf-9150-9fb7f8dd3c4d",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
        "quote_id": "aabb009d-591e-4e4d-9748-b73fd6a19f77",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "a57ba7e5-e44f-4097-ab8e-96daf8b1d343"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:29:47.444836Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
        "attempt_id": "5ec0ec2f-778e-46bc-9901-cbcbe75e1154",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a57ba7e5-e44f-4097-ab8e-96daf8b1d343"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:29:47.452469Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5ca9d57f-9c2d-4962-a8e2-bd1ef0e2b4c4",
        "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "a57ba7e5-e44f-4097-ab8e-96daf8b1d343"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T17:29:48.062481Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5ca9d57f-9c2d-4962-a8e2-bd1ef0e2b4c4",
        "order_id": "0378709c-2895-4f2d-9413-ef7bc9c431fa",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "dc02d22a-b67f-4da3-a2bf-72bc6c3d8926"
      },
      "correlation_id": "954c4d0b-e3b2-4b2e-b904-26ac944209ce"
```

Done: orders 5dc95a15-906c-41b4-99b6-52224747c97b, 0378709c-2895-4f2d-9413-ef7bc9c431fa.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380733451923",
  "device_ref": "sandbox-7793"
}
```

```json
{
  "challenge_id": "10a4c200-267c-4378-8c74-34fc546ec378",
  "expires_at": "2026-10-29T17:34:51.052311592Z",
  "resend_available_at": "2026-10-29T17:29:52.052311592Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380733451923` → **200**

```json
{
  "phone": "+380733451923",
  "audience": "CLIENT",
  "code": "375011",
  "sent_at": "2026-10-29T17:29:51.055795655Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "10a4c200-267c-4378-8c74-34fc546ec378",
  "code": "375011",
  "device_ref": "sandbox-7793"
}
```

```json
{
  "session_id": "4fb9d091-b312-4b95-b602-68e129e19080",
  "subject": {
    "type": "CLIENT",
    "id": "a3a60bab-d854-4fed-baa8-51fbce58773b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2E2MGJhYi1kODU0LTRmZWQtYmFhOC01MWZiY2U1ODc3M2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1ODkxLCJpYXQiOjE3OTMyOTQ5OTEsImp0aSI6ImVhNTQ4MjMxLWMxZmEtNGExZi1iNjZjLTliZjk2NGVlMTI5YSIsInNpZCI6IjRmYjlkMDkxLWIzMTItNGI5NS1iNjAyLTY4ZTEyOWUxOTA4MCJ9.PnDXdsbOC5ErJavq5b8Dvx9zfL2LTDs-uO9pcqe29gM",
  "access_expires_at": "2026-10-29T17:44:51.371777814Z",
  "refresh_token": "v9VZlG_GAV__qmP72UMVb9gWcQQpT8PKeLx820rzK80",
  "refresh_expires_at": "2026-11-28T17:29:51.371143662Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "cc320b13-6593-4a00-a174-c011548685ef",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "d49cee8f-35a3-4e7e-b2f4-9a02192aba63",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-d49cee8f-35a3-4e7e-b2f4-9a02192aba63",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a666dc6328acd8f84ce9104938e02524",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=d49cee8f-35a3-4e7e-b2f4-9a02192aba63",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380733451923"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=d49cee8f-35a3-4e7e-b2f4-9a02192aba63",
  "expires_at": "2026-10-29T17:59:51.66174Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/d49cee8f-35a3-4e7e-b2f4-9a02192aba63` → **200**

```json
{
  "id": "d49cee8f-35a3-4e7e-b2f4-9a02192aba63",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T17:59:51.66174Z",
  "card": {
    "id": "b3c4d23f-3bb3-460c-9b6a-303a0231c3bc",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0047",
    "card_type": "Visa",
    "created_at": "2026-10-29T17:29:51.9564Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "b3c4d23f-3bb3-460c-9b6a-303a0231c3bc",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****0047",
      "card_type": "Visa",
      "created_at": "2026-10-29T17:29:51.9564Z"
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
  "device_ref": "sandbox-13540"
}
```

```json
{
  "challenge_id": "6997dbbd-a1ca-40c9-ac2f-5846bc0f513f",
  "expires_at": "2026-10-29T17:34:52.54929169Z",
  "resend_available_at": "2026-10-29T17:29:53.54929169Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "219569",
  "sent_at": "2026-10-29T17:29:52.55267134Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6997dbbd-a1ca-40c9-ac2f-5846bc0f513f",
  "code": "219569",
  "device_ref": "sandbox-13540"
}
```

```json
{
  "session_id": "aef7b67c-1b66-4b26-bbe9-17bdc82c104f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTg5MiwiaWF0IjoxNzkzMjk0OTkyLCJqdGkiOiJjZTk4NTcwOC1jNWJmLTQwM2UtYjNkNi05OTgyMWFjOTBhOTgiLCJzaWQiOiJhZWY3YjY3Yy0xYjY2LTRiMjYtYmJlOS0xN2JkYzgyYzEwNGYifQ.zxyxTfT_InWfpB_sMPFOxVLZeaqnGOv7LcTZvp4XmT0",
  "access_expires_at": "2026-10-29T17:44:52.87152195Z",
  "refresh_token": "3fHLvNTz_THZYDXw_ETVev3VS8sax1p4xIrpaFbi39s",
  "refresh_expires_at": "2026-11-28T17:29:52.870925238Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:29:46.841378Z",
  "last_location_at": "2026-10-29T17:29:46.841378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bcb208bb-3ccd-4209-9820-cd879762246a/handover` → **200**

```json
{
  "command_id": "0685ff86-4450-4fb3-b912-36d50af9aae5",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:29:46.841378Z",
  "last_location_at": "2026-10-29T17:29:46.841378Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bcb208bb-3ccd-4209-9820-cd879762246a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:53Z",
    "sequence": 1793294993743
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:29:53.763442Z",
  "last_location_at": "2026-10-29T17:29:53.763442Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "8e30d74f-f77a-4aa5-a711-5c7c90ddb8f0",
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
  "id": "5248c676-a024-494d-9db8-3be6e918635c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:34:54.062622Z",
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
  "command_id": "c26b03fc-3611-4d0a-ad7a-23dce39a282c",
  "quote_id": "5248c676-a024-494d-9db8-3be6e918635c",
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
  "id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
  "created_at": "2026-10-29T17:29:54.379913Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da` → **200**

```json
{
  "id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
  "created_at": "2026-10-29T17:29:54.379913Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da` → **200**

```json
{
  "id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
  "created_at": "2026-10-29T17:29:54.379913Z",
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
    "id": "ef8109f4-ad20-48d6-8aab-67748c75d1cd",
    "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
    "expires_at": "2026-10-29T17:30:10.281656Z",
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

`POST /api/driver/v1/offers/ef8109f4-ad20-48d6-8aab-67748c75d1cd/accept` → **200**

```json
{
  "command_id": "0a21db4e-e019-4157-84ef-92aceb56df65"
}
```

```json
{
  "id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "assignment_id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
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

`POST /api/driver/v1/work-sessions/bcb208bb-3ccd-4209-9820-cd879762246a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:29:57Z",
    "sequence": 1793294997163
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:29:57.183657Z",
  "last_location_at": "2026-10-29T17:29:57.183657Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/a07040cb-b3df-4c1b-97af-91cc3e8ae4c6/arrive` → **200**

```json
{
  "command_id": "734a8ccf-d442-49f8-9b31-7f31d109d384",
  "expected_version": 0
}
```

```json
{
  "id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "assignment_id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
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
  "arrived_at": "2026-10-29T17:29:57.488419Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a07040cb-b3df-4c1b-97af-91cc3e8ae4c6/start` → **200**

```json
{
  "command_id": "8e1a9430-9d7b-4ca9-89c0-8b4005c461b9",
  "expected_version": 1
}
```

```json
{
  "id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "assignment_id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
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
  "arrived_at": "2026-10-29T17:29:57.488419Z",
  "started_at": "2026-10-29T17:29:57.796341Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/a07040cb-b3df-4c1b-97af-91cc3e8ae4c6/complete` → **200**

```json
{
  "command_id": "1e1ab93f-5767-4413-9914-7b38ac92ea5e",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:29:58Z",
  "cash_received": true
}
```

```json
{
  "id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "assignment_id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
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
  "arrived_at": "2026-10-29T17:29:57.488419Z",
  "started_at": "2026-10-29T17:29:57.796341Z",
  "completed_at": "2026-10-29T17:29:58.120939Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da` → **200**

```json
{
  "id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
    "id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
    "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:29:54.379913Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da` → **200**

```json
{
  "id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
    "id": "f81a04d1-0e32-4640-a63b-4b96ed5422f9",
    "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "a07040cb-b3df-4c1b-97af-91cc3e8ae4c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:29:54.379913Z",
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

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da/tip` → **200**

```json
{
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
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
  "available_until": "2026-10-30T17:29:58.120939Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da/tip` → **201**

```json
{
  "command_id": "aa9e5adf-2bd9-4c9d-9429-dec51f242bfb",
  "amount_minor": 2500
}
```

```json
{
  "id": "025d0b38-a4cf-4f8b-9da6-56c5e7cb8368",
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T17:30:00.614874Z"
}
```

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da/tip` → **200**

```json
{
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
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
  "available_until": "2026-10-30T17:29:58.120939Z",
  "open": false,
  "tip": {
    "id": "025d0b38-a4cf-4f8b-9da6-56c5e7cb8368",
    "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T17:30:00.614874Z"
  }
}
```

`GET /api/rider/v1/orders/94a21b5e-aa29-44a4-a53e-412023a001da/tip` → **200**

```json
{
  "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
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
  "available_until": "2026-10-30T17:29:58.120939Z",
  "open": false,
  "tip": {
    "id": "025d0b38-a4cf-4f8b-9da6-56c5e7cb8368",
    "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T17:30:00.614874Z"
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
      "id": "7c0a937d-5bb2-45b7-bc84-3bc22e42ba6a",
      "at": "2026-10-29T17:30:02.413151Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
      "counterpart_id": null
    },
    {
      "id": "a932eaaa-de69-4840-b82c-1ae37dc3e5e0",
      "at": "2026-10-29T17:29:58.338997Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6940b583-0a32-4658-8ec2-2bc3bcfed0fe",
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
  "id": "2e25eafb-de0c-4c68-9ea5-9417a0b8451f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:02.812351Z",
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
  "session_id": "c438173a-79a3-4a36-acd0-1388ada84418",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5MDMsImlhdCI6MTc5MzI5NTAwMywianRpIjoiZmE4YmZhNDMtODEzMC00NDYzLWI0MjUtZWFiNjAzZWQ2ZDZmIiwic2lkIjoiYzQzODE3M2EtNzlhMy00YTM2LWFjZDAtMTM4OGFkYTg0NDE4In0.Kr9hUI-YsqiPxHTFL1VQlxBU9Fuv6LhQiJA2BvbSPX0",
  "access_expires_at": "2026-10-29T17:45:03.425712668Z",
  "refresh_token": "VbQ-uIx4MNHW057ms2nWi5YJI8R1PraQnvBnKAWljik",
  "refresh_expires_at": "2026-10-30T05:30:03.425095427Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380733451923` → **200**

```json
{
  "client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b"
}
```

`POST /api/admin/v1/rider-wallets/a3a60bab-d854-4fed-baa8-51fbce58773b/top-ups` → **201**

```json
{
  "command_id": "84d882cc-3d93-4c35-ba36-ed7ad2f6b171",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
      "id": "fd181804-b005-4d99-830c-e67cd0d2bcfb",
      "at": "2026-10-29T17:30:04.007373Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d3329b1c-0a26-42b2-94d5-eaca06557202",
  "quote_id": "2e25eafb-de0c-4c68-9ea5-9417a0b8451f",
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
  "id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
  "created_at": "2026-10-29T17:30:04.311604Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/5affced3-e4b1-4a10-864a-d6f649c6f4f6` → **200**

```json
{
  "id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
  "created_at": "2026-10-29T17:30:04.311604Z",
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
    "id": "025cace9-cd42-41bb-ab7b-3986e5436a95",
    "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
    "expires_at": "2026-10-29T17:30:19.317803Z",
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

`POST /api/driver/v1/offers/025cace9-cd42-41bb-ab7b-3986e5436a95/accept` → **200**

```json
{
  "command_id": "9ee73de3-8fe0-4c81-aefa-09121d96055c"
}
```

```json
{
  "id": "d17c08dd-14bf-4a7d-91e0-f556c712cbba",
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "610f9f9a-a292-4a43-a1d2-1c1d025f9b1e",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "610f9f9a-a292-4a43-a1d2-1c1d025f9b1e",
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "assignment_id": "d17c08dd-14bf-4a7d-91e0-f556c712cbba",
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

`POST /api/driver/v1/work-sessions/bcb208bb-3ccd-4209-9820-cd879762246a/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:30:05Z",
    "sequence": 1793295005815
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:30:05.835135Z",
  "last_location_at": "2026-10-29T17:30:05.835135Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/610f9f9a-a292-4a43-a1d2-1c1d025f9b1e/arrive` → **200**

```json
{
  "command_id": "6f48e624-89f8-4bd9-bbdd-09a8bef37429",
  "expected_version": 0
}
```

```json
{
  "id": "610f9f9a-a292-4a43-a1d2-1c1d025f9b1e",
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "assignment_id": "d17c08dd-14bf-4a7d-91e0-f556c712cbba",
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
  "arrived_at": "2026-10-29T17:30:06.134171Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/610f9f9a-a292-4a43-a1d2-1c1d025f9b1e/start` → **200**

```json
{
  "command_id": "67ad4df0-92f9-4838-9f62-73e120c7f2b2",
  "expected_version": 1
}
```

```json
{
  "id": "610f9f9a-a292-4a43-a1d2-1c1d025f9b1e",
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "assignment_id": "d17c08dd-14bf-4a7d-91e0-f556c712cbba",
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
  "arrived_at": "2026-10-29T17:30:06.134171Z",
  "started_at": "2026-10-29T17:30:06.442733Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/610f9f9a-a292-4a43-a1d2-1c1d025f9b1e/complete` → **200**

```json
{
  "command_id": "5c6fe57e-6f72-43c0-9aa5-1c8b495f218a",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:30:06Z",
  "cash_received": true
}
```

```json
{
  "id": "610f9f9a-a292-4a43-a1d2-1c1d025f9b1e",
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "assignment_id": "d17c08dd-14bf-4a7d-91e0-f556c712cbba",
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
  "arrived_at": "2026-10-29T17:30:06.134171Z",
  "started_at": "2026-10-29T17:30:06.442733Z",
  "completed_at": "2026-10-29T17:30:06.749842Z",
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
  "client_id": "a3a60bab-d854-4fed-baa8-51fbce58773b",
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
      "id": "fd181804-b005-4d99-830c-e67cd0d2bcfb",
      "at": "2026-10-29T17:30:04.007373Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
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

`GET /api/rider/v1/orders/5affced3-e4b1-4a10-864a-d6f649c6f4f6/tip` → **200**

```json
{
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
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
  "available_until": "2026-10-30T17:30:06.749842Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/5affced3-e4b1-4a10-864a-d6f649c6f4f6/tip` → **201**

```json
{
  "command_id": "56fb7e94-ced9-4d61-acc4-2cd7d3f557ef",
  "amount_minor": 2500
}
```

```json
{
  "id": "94f92128-10a6-47b0-ac1c-f5e23951f77e",
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T17:30:07.960626Z"
}
```

`GET /api/rider/v1/orders/5affced3-e4b1-4a10-864a-d6f649c6f4f6/tip` → **200**

```json
{
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
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
  "available_until": "2026-10-30T17:30:06.749842Z",
  "open": false,
  "tip": {
    "id": "94f92128-10a6-47b0-ac1c-f5e23951f77e",
    "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T17:30:07.960626Z"
  }
}
```

`GET /api/rider/v1/orders/5affced3-e4b1-4a10-864a-d6f649c6f4f6/tip` → **200**

```json
{
  "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
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
  "available_until": "2026-10-30T17:30:06.749842Z",
  "open": false,
  "tip": {
    "id": "94f92128-10a6-47b0-ac1c-f5e23951f77e",
    "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T17:30:07.960626Z"
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
      "id": "593c0127-5d64-4169-aa08-5859afd11067",
      "at": "2026-10-29T17:30:09.513271Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
      "counterpart_id": null
    },
    {
      "id": "92f4a687-522d-4388-89d3-59c28c25c7d2",
      "at": "2026-10-29T17:30:07.474993Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "5affced3-e4b1-4a10-864a-d6f649c6f4f6",
      "counterpart_id": null
    },
    {
      "id": "7c0a937d-5bb2-45b7-bc84-3bc22e42ba6a",
      "at": "2026-10-29T17:30:02.413151Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
      "counterpart_id": null
    },
    {
      "id": "a932eaaa-de69-4840-b82c-1ae37dc3e5e0",
      "at": "2026-10-29T17:29:58.338997Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "94a21b5e-aa29-44a4-a53e-412023a001da",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "bcb208bb-3ccd-4209-9820-cd879762246a",
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
  "last_heartbeat_at": "2026-10-29T17:30:05.835135Z",
  "last_location_at": "2026-10-29T17:30:05.835135Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/bcb208bb-3ccd-4209-9820-cd879762246a/close` → **200**

```json
{
  "command_id": "a814d395-2cc8-406f-985b-668dbaaa7aad",
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

Done: card order 5affced3-e4b1-4a10-864a-d6f649c6f4f6.

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
  "phone": "+380730230519",
  "device_ref": "sandbox-6931"
}
```

```json
{
  "challenge_id": "6275193d-72e8-40f9-b3d4-cffe626b2bc6",
  "expires_at": "2026-10-29T17:35:11.03308024Z",
  "resend_available_at": "2026-10-29T17:30:12.03308024Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380730230519` → **200**

```json
{
  "phone": "+380730230519",
  "audience": "CLIENT",
  "code": "070792",
  "sent_at": "2026-10-29T17:30:11.036242767Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6275193d-72e8-40f9-b3d4-cffe626b2bc6",
  "code": "070792",
  "device_ref": "sandbox-6931"
}
```

```json
{
  "session_id": "7d390247-27a2-494e-84c5-8ed500cc34a4",
  "subject": {
    "type": "CLIENT",
    "id": "a9b9ce6f-da72-413a-b24f-6faa03df1f80"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhOWI5Y2U2Zi1kYTcyLTQxM2EtYjI0Zi02ZmFhMDNkZjFmODAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTExLCJpYXQiOjE3OTMyOTUwMTEsImp0aSI6ImRhYTMyYzgwLWNjYjQtNDk2Ni05Mjc3LTk5ZjhkOTU2MWI3ZiIsInNpZCI6IjdkMzkwMjQ3LTI3YTItNDk0ZS04NGM1LThlZDUwMGNjMzRhNCJ9.q1fE48BwQLNtbnBFidOP_pGr4DI_qqKuOyLEmu0gSL4",
  "access_expires_at": "2026-10-29T17:45:11.34363319Z",
  "refresh_token": "x9i653kXVAT1OTv4KDYZFYvntVv1lcJ3ctkJUzmUDHk",
  "refresh_expires_at": "2026-11-28T17:30:11.343021591Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "125439f5-77c9-492c-b7d2-91796810e980",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "5ed23d21-a9ea-42cf-84d5-5cfebdc57f64",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-5ed23d21-a9ea-42cf-84d5-5cfebdc57f64",
    "orderDate": "1793295011",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "867e1d82de72bfb0ea02fd6f41072149",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=5ed23d21-a9ea-42cf-84d5-5cfebdc57f64",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380730230519"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=5ed23d21-a9ea-42cf-84d5-5cfebdc57f64",
  "created_at": "2026-10-29T17:30:11.641441Z",
  "expires_at": "2026-10-29T18:00:11.641441Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/5ed23d21-a9ea-42cf-84d5-5cfebdc57f64` → **200**

```json
{
  "id": "5ed23d21-a9ea-42cf-84d5-5cfebdc57f64",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T17:30:11.641441Z",
  "expires_at": "2026-10-29T18:00:11.641441Z",
  "completed_at": "2026-10-29T17:30:11.933254Z",
  "masked_pan": "41****2905",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a9b9ce6f-da72-413a-b24f-6faa03df1f80",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a9b9ce6f-da72-413a-b24f-6faa03df1f80",
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
      "id": "885875e6-8130-422a-b122-bb6bf12f371a",
      "at": "2026-10-29T17:30:12.529474Z",
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
  "client_id": "a9b9ce6f-da72-413a-b24f-6faa03df1f80",
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
      "id": "885875e6-8130-422a-b122-bb6bf12f371a",
      "at": "2026-10-29T17:30:12.529474Z",
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
  "device_ref": "sandbox-22791"
}
```

```json
{
  "challenge_id": "95215743-6fa7-4c2a-a5d3-e285a7d35479",
  "expires_at": "2026-10-29T17:35:14.10874655Z",
  "resend_available_at": "2026-10-29T17:30:15.10874655Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "720659",
  "sent_at": "2026-10-29T17:30:14.111848855Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "95215743-6fa7-4c2a-a5d3-e285a7d35479",
  "code": "720659",
  "device_ref": "sandbox-22791"
}
```

```json
{
  "session_id": "3a9da941-d3a0-44a6-b10f-79748a6d5e7b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTkxNCwiaWF0IjoxNzkzMjk1MDE0LCJqdGkiOiJiNzg3ZDM2MC1lMDYyLTQ4YjYtOTU5My02MTRlZmY3NmEwODAiLCJzaWQiOiIzYTlkYTk0MS1kM2EwLTQ0YTYtYjEwZi03OTc0OGE2ZDVlN2IifQ.pj6ji6tBgTbwjDKnlZwPZvVxhpr-LW8BcFb_RXsuS8w",
  "access_expires_at": "2026-10-29T17:45:14.42061504Z",
  "refresh_token": "W4MaO9hnybNPPN7T7e5_VmWo9viWKTeqTZCTcJevSLA",
  "refresh_expires_at": "2026-11-28T17:30:14.420058904Z",
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
  "command_id": "21c295cb-4fc8-4558-83e5-4e6e3b0729f1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "01901fe0-c226-4388-9286-2b54972081de",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-01901fe0-c226-4388-9286-2b54972081de",
    "orderDate": "1793295014",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "36147ce12fef503d2d0178d5cb7a72c4",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=01901fe0-c226-4388-9286-2b54972081de",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=01901fe0-c226-4388-9286-2b54972081de",
  "created_at": "2026-10-29T17:30:14.985516Z",
  "expires_at": "2026-10-29T18:00:14.985516Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/01901fe0-c226-4388-9286-2b54972081de` → **200**

```json
{
  "id": "01901fe0-c226-4388-9286-2b54972081de",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T17:30:14.985516Z",
  "expires_at": "2026-10-29T18:00:14.985516Z",
  "completed_at": "2026-10-29T17:30:15.271974Z",
  "masked_pan": "41****7503",
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
      "id": "334aaed6-3a82-4bd1-8d42-e35bddca1ba2",
      "at": "2026-10-29T17:30:15.53827Z",
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
  "command_id": "b7c1907d-7b81-409d-8620-6884a9e3a558",
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
  "correlation_id": "8deb213b-3df1-48e7-b418-047ced678f58"
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
  "device_ref": "sandbox-13138"
}
```

```json
{
  "challenge_id": "93555e77-db68-47c5-ba02-3b1e1cb5351a",
  "expires_at": "2026-10-29T17:35:16.164908486Z",
  "resend_available_at": "2026-10-29T17:30:17.164908486Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "750944",
  "sent_at": "2026-10-29T17:30:16.167960304Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "93555e77-db68-47c5-ba02-3b1e1cb5351a",
  "code": "750944",
  "device_ref": "sandbox-13138"
}
```

```json
{
  "session_id": "304593b2-b9c0-4542-a9ef-e136e49c834d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTkxNiwiaWF0IjoxNzkzMjk1MDE2LCJqdGkiOiI2MTc0MzQ2Ny02ZjFkLTQ1OGUtOWMwYy1jOTJiODk1MDA1MWQiLCJzaWQiOiIzMDQ1OTNiMi1iOWMwLTQ1NDItYTllZi1lMTM2ZTQ5YzgzNGQifQ.sNAijw_DnXbx8nTWfpNb7GNIaTcNaQBdMyM6dop6zQ4",
  "access_expires_at": "2026-10-29T17:45:16.479078812Z",
  "refresh_token": "BP5lDrOsSFx-z9dVjOHtxK3gQFPTzErJwm8WJutiFV8",
  "refresh_expires_at": "2026-11-28T17:30:16.478418271Z",
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
  "command_id": "efa38784-00e4-4a89-9265-734db639b01f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:30:17Z",
    "sequence": 1793295017391
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce447e70-95c6-4662-8984-c32eaf2ffac8",
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
  "last_heartbeat_at": "2026-10-29T17:30:17.058367Z",
  "last_location_at": "2026-10-29T17:30:17.058367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632197592",
  "device_ref": "sandbox-7628"
}
```

```json
{
  "challenge_id": "930e7dcd-59a9-4397-b10c-dce6b1cdbe28",
  "expires_at": "2026-10-29T17:35:17.353417816Z",
  "resend_available_at": "2026-10-29T17:30:18.353417816Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632197592` → **200**

```json
{
  "phone": "+380632197592",
  "audience": "CLIENT",
  "code": "944429",
  "sent_at": "2026-10-29T17:30:17.356268068Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "930e7dcd-59a9-4397-b10c-dce6b1cdbe28",
  "code": "944429",
  "device_ref": "sandbox-7628"
}
```

```json
{
  "session_id": "a2a7556a-c905-460c-99b4-4790702397be",
  "subject": {
    "type": "CLIENT",
    "id": "2aae7879-fcf6-4864-8de8-f7f8827563a3"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyYWFlNzg3OS1mY2Y2LTQ4NjQtOGRlOC1mN2Y4ODI3NTYzYTMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTE3LCJpYXQiOjE3OTMyOTUwMTcsImp0aSI6ImE4YjVjN2UyLWM4MjMtNDcxNi04N2RhLTM0NmU4MjA3NjQ3OSIsInNpZCI6ImEyYTc1NTZhLWM5MDUtNDYwYy05OWI0LTQ3OTA3MDIzOTdiZSJ9.V4-GDeKbBhV_KnLX0U7mpNbMbW6gdUJWpZbQGj0recQ",
  "access_expires_at": "2026-10-29T17:45:17.669809873Z",
  "refresh_token": "COH-tvaBg8Mv08tPlD3n7ZDrO3jdUBN5W9Q7_l07vhQ",
  "refresh_expires_at": "2026-11-28T17:30:17.669260389Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1fad5daa-0e7b-4f62-9ac5-99c6f182e6f7",
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
  "id": "80b51138-c02b-4918-8fb2-f844924bd12a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:17.975968Z",
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
  "command_id": "211a596f-b8f4-4bbc-9a9b-85e72feff3ff",
  "quote_id": "80b51138-c02b-4918-8fb2-f844924bd12a",
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
  "id": "9590860e-5103-4a79-834d-92a6d059f945",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2aae7879-fcf6-4864-8de8-f7f8827563a3",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:30:18.295509Z",
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
    "id": "f5a3615a-e165-4687-ba66-43724acddc5b",
    "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
    "expires_at": "2026-10-29T17:30:33.298863Z",
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

`POST /api/driver/v1/offers/f5a3615a-e165-4687-ba66-43724acddc5b/accept` → **200**

```json
{
  "command_id": "bb22c101-fdb7-4e45-95ef-2fe149004a03"
}
```

```json
{
  "id": "d4999ac2-bb18-4a9b-badd-f133c44329a4",
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "35961fee-8724-4650-88a8-1802849ed318",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "35961fee-8724-4650-88a8-1802849ed318",
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "assignment_id": "d4999ac2-bb18-4a9b-badd-f133c44329a4",
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

`POST /api/driver/v1/work-sessions/ce447e70-95c6-4662-8984-c32eaf2ffac8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:30:19Z",
    "sequence": 1793295019482
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce447e70-95c6-4662-8984-c32eaf2ffac8",
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
  "last_heartbeat_at": "2026-10-29T17:30:19.501314Z",
  "last_location_at": "2026-10-29T17:30:19.501314Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/35961fee-8724-4650-88a8-1802849ed318/arrive` → **200**

```json
{
  "command_id": "7989c7a0-2f2a-460b-a76e-9f96874999cc",
  "expected_version": 0
}
```

```json
{
  "id": "35961fee-8724-4650-88a8-1802849ed318",
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "assignment_id": "d4999ac2-bb18-4a9b-badd-f133c44329a4",
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
  "arrived_at": "2026-10-29T17:30:19.796646Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/35961fee-8724-4650-88a8-1802849ed318/start` → **200**

```json
{
  "command_id": "ab3d2a91-b600-4824-b2f5-dbc5e34957e0",
  "expected_version": 1
}
```

```json
{
  "id": "35961fee-8724-4650-88a8-1802849ed318",
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "assignment_id": "d4999ac2-bb18-4a9b-badd-f133c44329a4",
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
  "arrived_at": "2026-10-29T17:30:19.796646Z",
  "started_at": "2026-10-29T17:30:20.094493Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/35961fee-8724-4650-88a8-1802849ed318/complete` → **200**

```json
{
  "command_id": "a2287a39-a5c6-459b-8095-ef48dd6dfe0d",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:30:20Z",
  "cash_received": false
}
```

```json
{
  "id": "35961fee-8724-4650-88a8-1802849ed318",
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "assignment_id": "d4999ac2-bb18-4a9b-badd-f133c44329a4",
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
  "arrived_at": "2026-10-29T17:30:19.796646Z",
  "started_at": "2026-10-29T17:30:20.094493Z",
  "completed_at": "2026-10-29T17:30:20.393087Z",
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
  "session_id": "53c1e10f-509b-4b74-8a12-f216ec55902a",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5MjAsImlhdCI6MTc5MzI5NTAyMCwianRpIjoiYTg0MDBjZjItNTY4OS00MGI3LTgxNWQtMTIxYmVlZDBkMjAzIiwic2lkIjoiNTNjMWUxMGYtNTA5Yi00Yjc0LThhMTItZjIxNmVjNTU5MDJhIn0.n1PeZhr52qKfVdWiyyhDZOYYZb3yoSEPYzzLwuV1u84",
  "access_expires_at": "2026-10-29T17:45:20.990826758Z",
  "refresh_token": "Z-aEqWQaUWAmRMCPioRNH2LPH_AJOWOBb4vuS1936vc",
  "refresh_expires_at": "2026-10-30T05:30:20.990269269Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/9590860e-5103-4a79-834d-92a6d059f945/cash-dispute` → **200**

```json
{
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2aae7879-fcf6-4864-8de8-f7f8827563a3",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T17:30:20.602022Z",
  "decide_by": "2026-11-12T17:30:20.602022Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T17:30:20.602022Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "2aae7879-fcf6-4864-8de8-f7f8827563a3",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T17:30:20.602022Z",
      "decide_by": "2026-11-12T17:30:20.602022Z",
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

`POST /api/admin/v1/orders/9590860e-5103-4a79-834d-92a6d059f945/cash-dispute/decide` → **400**

```json
{
  "command_id": "38887924-c06c-420c-9dae-11947e32a90b",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/9590860e-5103-4a79-834d-92a6d059f945/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "458f9dd8-c608-4b20-87aa-9af64581998e",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/orders/9590860e-5103-4a79-834d-92a6d059f945/cash-dispute/decide` → **200**

```json
{
  "command_id": "ff5f21c4-d343-41cc-90ed-d12a79240256",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "2aae7879-fcf6-4864-8de8-f7f8827563a3",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T17:30:20.602022Z",
  "decide_by": "2026-11-12T17:30:20.602022Z",
  "decision": "PAY_DRIVER",
  "decided_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T17:30:22.194687Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/9590860e-5103-4a79-834d-92a6d059f945/cash-dispute/decide` → **409**

```json
{
  "command_id": "c1165eaa-41a3-4160-87ab-df233d47fd54",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/9590860e-5103-4a79-834d-92a6d059f945/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "86013d76-4d4b-4e00-9d26-740e6f928f46"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ce447e70-95c6-4662-8984-c32eaf2ffac8",
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
  "last_heartbeat_at": "2026-10-29T17:30:19.501314Z",
  "last_location_at": "2026-10-29T17:30:19.501314Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ce447e70-95c6-4662-8984-c32eaf2ffac8/close` → **200**

```json
{
  "command_id": "f5a51781-bdd8-467e-97df-173056a26e5d",
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
  "phone": "+380732109314",
  "device_ref": "sandbox-20391"
}
```

```json
{
  "challenge_id": "7b9ace7e-895f-4999-9735-b587091f4dc6",
  "expires_at": "2026-10-29T17:35:23.372473975Z",
  "resend_available_at": "2026-10-29T17:30:24.372473975Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732109314` → **200**

```json
{
  "phone": "+380732109314",
  "audience": "CLIENT",
  "code": "862680",
  "sent_at": "2026-10-29T17:30:23.375736687Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7b9ace7e-895f-4999-9735-b587091f4dc6",
  "code": "862680",
  "device_ref": "sandbox-20391"
}
```

```json
{
  "session_id": "4bef9fa9-058c-4987-9cda-e48ebf8e3443",
  "subject": {
    "type": "CLIENT",
    "id": "29c90642-2ac4-431c-b656-74ef3e223573"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyOWM5MDY0Mi0yYWM0LTQzMWMtYjY1Ni03NGVmM2UyMjM1NzMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTIzLCJpYXQiOjE3OTMyOTUwMjMsImp0aSI6IjRjNzhlNDU0LWFlMDEtNGJlMy05N2M2LTU4NDBmZmQwMThjOSIsInNpZCI6IjRiZWY5ZmE5LTA1OGMtNDk4Ny05Y2RhLWU0OGViZjhlMzQ0MyJ9.qmLr29EJCLniwz7p9oYisUsp5__GoEWhou20_DBfPzM",
  "access_expires_at": "2026-10-29T17:45:23.678261675Z",
  "refresh_token": "6xJpxjuH_UeJwwosOBrbk-XoEpI1EJcqQ_SRqWErOcA",
  "refresh_expires_at": "2026-11-28T17:30:23.677761433Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "b6ddbad5-de4c-453a-935d-97418742a7fc",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "24d30912-0b4f-4580-aa74-0f8a50211148",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-24d30912-0b4f-4580-aa74-0f8a50211148",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "f3bb96f6d36ff2e18a27f9d21f93ce08",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=24d30912-0b4f-4580-aa74-0f8a50211148",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732109314"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=24d30912-0b4f-4580-aa74-0f8a50211148",
  "expires_at": "2026-10-29T18:00:23.960757Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/24d30912-0b4f-4580-aa74-0f8a50211148` → **200**

```json
{
  "id": "24d30912-0b4f-4580-aa74-0f8a50211148",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T18:00:23.960757Z",
  "card": {
    "id": "aec9ae68-1b2f-4c49-95fa-aea8ef694a54",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****2157",
    "card_type": "Visa",
    "created_at": "2026-10-29T17:30:24.252819Z"
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
  "device_ref": "sandbox-7683"
}
```

```json
{
  "challenge_id": "7e614750-a51b-404d-8a15-8687287b51d8",
  "expires_at": "2026-10-29T17:35:24.558615109Z",
  "resend_available_at": "2026-10-29T17:30:25.558615109Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "277991",
  "sent_at": "2026-10-29T17:30:24.561306485Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e614750-a51b-404d-8a15-8687287b51d8",
  "code": "277991",
  "device_ref": "sandbox-7683"
}
```

```json
{
  "session_id": "7c21090b-8cf4-4b30-831d-9c00131fd5ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTkyNCwiaWF0IjoxNzkzMjk1MDI0LCJqdGkiOiIwODNiMWZhOS1mNzUwLTRiOTItYjRlNi1kOWU3OTVmOGNkODEiLCJzaWQiOiI3YzIxMDkwYi04Y2Y0LTRiMzAtODMxZC05YzAwMTMxZmQ1ZmYifQ.MXEsLzdsQdNEZAI0c9doqY7FwzbiS1pB1PJaA1xiDG8",
  "access_expires_at": "2026-10-29T17:45:24.866878797Z",
  "refresh_token": "m_iYpBCuowsOPtyi1-8JgWXu042sp09MptXAWoXCkYY",
  "refresh_expires_at": "2026-11-28T17:30:24.866187348Z",
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
  "command_id": "4d0d31dc-6817-4504-b92f-15e509accb25",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:30:25Z",
    "sequence": 1793295025442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c55165c2-d453-4353-80c4-8505d7e6a933",
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
  "last_heartbeat_at": "2026-10-29T17:30:25.461761Z",
  "last_location_at": "2026-10-29T17:30:25.461761Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a6c2cd94-f361-4a03-ae87-242a333195c8",
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
  "id": "423370aa-5b39-4c01-bd46-bae035824d2e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:25.762129Z",
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
  "command_id": "3f038950-b48d-4cbf-bec4-d51533ad8bd4",
  "quote_id": "423370aa-5b39-4c01-bd46-bae035824d2e",
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
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
  "created_at": "2026-10-29T17:30:26.111556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291` → **200**

```json
{
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
  "created_at": "2026-10-29T17:30:26.111556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291` → **200**

```json
{
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
  "created_at": "2026-10-29T17:30:26.111556Z",
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
    "id": "0a7c0e42-8bf4-4fbe-b1c4-6c60819f9d30",
    "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
    "expires_at": "2026-10-29T17:30:41.652132Z",
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

`POST /api/driver/v1/offers/0a7c0e42-8bf4-4fbe-b1c4-6c60819f9d30/accept` → **200**

```json
{
  "command_id": "4b363f5a-74d2-4f8c-82a9-9ebc3c434784"
}
```

```json
{
  "id": "68b9bdd8-d116-472b-ba77-82e240249732",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "04a584af-18be-446e-bb7e-9c69362a28c6",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "04a584af-18be-446e-bb7e-9c69362a28c6",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "assignment_id": "68b9bdd8-d116-472b-ba77-82e240249732",
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

`POST /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/messages` → **201**

```json
{
  "command_id": "768f50ae-29c5-40fa-819d-22824d44c90f",
  "body": "Я біля входу, мій номер +380732109314, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "5a84a16e-1c2d-41d6-9be5-81c896422f5b",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380732109314, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T17:30:28.976693061Z"
}
```

`POST /api/driver/v1/trips/04a584af-18be-446e-bb7e-9c69362a28c6/messages` → **201**

```json
{
  "command_id": "12e8440b-79df-49d5-b793-21005a431d22",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "2ae358a3-5b25-4450-918a-d0a45841e095",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T17:30:29.273266116Z"
}
```

`POST /api/driver/v1/work-sessions/c55165c2-d453-4353-80c4-8505d7e6a933/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:30:29Z",
    "sequence": 1793295029551
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c55165c2-d453-4353-80c4-8505d7e6a933",
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
  "last_heartbeat_at": "2026-10-29T17:30:29.571335Z",
  "last_location_at": "2026-10-29T17:30:29.571335Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/04a584af-18be-446e-bb7e-9c69362a28c6/arrive` → **200**

```json
{
  "command_id": "04203328-11a5-4d9e-917e-09c63dd41ae9",
  "expected_version": 0
}
```

```json
{
  "id": "04a584af-18be-446e-bb7e-9c69362a28c6",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "assignment_id": "68b9bdd8-d116-472b-ba77-82e240249732",
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
  "arrived_at": "2026-10-29T17:30:29.863033Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/04a584af-18be-446e-bb7e-9c69362a28c6/start` → **200**

```json
{
  "command_id": "f7d14667-9de3-4f83-90ed-a889348d4676",
  "expected_version": 1
}
```

```json
{
  "id": "04a584af-18be-446e-bb7e-9c69362a28c6",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "assignment_id": "68b9bdd8-d116-472b-ba77-82e240249732",
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
  "arrived_at": "2026-10-29T17:30:29.863033Z",
  "started_at": "2026-10-29T17:30:30.177186Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/c55165c2-d453-4353-80c4-8505d7e6a933/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:30:30Z",
    "sequence": 1793295030462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c55165c2-d453-4353-80c4-8505d7e6a933",
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
  "last_heartbeat_at": "2026-10-29T17:30:30.481273Z",
  "last_location_at": "2026-10-29T17:30:30.481273Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/04a584af-18be-446e-bb7e-9c69362a28c6/complete` → **200**

```json
{
  "command_id": "dd1d5327-4aa2-4bf5-bac1-297c53fe0081",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:30:30Z",
  "cash_received": false
}
```

```json
{
  "id": "04a584af-18be-446e-bb7e-9c69362a28c6",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "assignment_id": "68b9bdd8-d116-472b-ba77-82e240249732",
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
  "arrived_at": "2026-10-29T17:30:29.863033Z",
  "started_at": "2026-10-29T17:30:30.177186Z",
  "completed_at": "2026-10-29T17:30:30.775075Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291` → **200**

```json
{
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
    "id": "68b9bdd8-d116-472b-ba77-82e240249732",
    "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "04a584af-18be-446e-bb7e-9c69362a28c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:30:26.111556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291` → **200**

```json
{
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
    "id": "68b9bdd8-d116-472b-ba77-82e240249732",
    "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "04a584af-18be-446e-bb7e-9c69362a28c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:30:26.111556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291` → **200**

```json
{
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
    "id": "68b9bdd8-d116-472b-ba77-82e240249732",
    "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "04a584af-18be-446e-bb7e-9c69362a28c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:30:26.111556Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291` → **200**

```json
{
  "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "29c90642-2ac4-431c-b656-74ef3e223573",
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
    "id": "68b9bdd8-d116-472b-ba77-82e240249732",
    "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "04a584af-18be-446e-bb7e-9c69362a28c6",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:30:26.111556Z",
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
  "session_id": "c55165c2-d453-4353-80c4-8505d7e6a933",
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
  "last_heartbeat_at": "2026-10-29T17:30:30.481273Z",
  "last_location_at": "2026-10-29T17:30:30.481273Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c55165c2-d453-4353-80c4-8505d7e6a933/close` → **200**

```json
{
  "command_id": "bc7c3711-ec21-4c96-a624-dcbd2c3bb8b4",
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
  "session_id": "6c109576-9dea-444d-ac4f-67672c65fe0a",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5MzYsImlhdCI6MTc5MzI5NTAzNiwianRpIjoiZmRkNWJhODQtNzkyYi00ZjQ4LTg2NjYtNWUwYmE1ZGU5MjE3Iiwic2lkIjoiNmMxMDk1NzYtOWRlYS00NDRkLWFjNGYtNjc2NzJjNjVmZTBhIn0.3G2wwgE83wTuH1qGdYo1Ifw7WtAejGtrutesbSs7ayI",
  "access_expires_at": "2026-10-29T17:45:36.153829989Z",
  "refresh_token": "Escr6mpnmGy2NR41MQZ6ed_KGCcNJeTpASUVUDACO3I",
  "refresh_expires_at": "2026-10-30T05:30:36.153217137Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "b10aa98d-128a-47e4-9c8d-6021f69669a6"
}
```

`GET /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T17:30:36.720355967Z",
  "order": {
    "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
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
    "created_at": "2026-10-29T17:30:26.111556Z",
    "assigned_at": "2026-10-29T17:30:28.392672Z",
    "arrived_at": "2026-10-29T17:30:29.863033Z",
    "started_at": "2026-10-29T17:30:30.177186Z",
    "completed_at": "2026-10-29T17:30:30.775075Z"
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
    "id": "29c90642-2ac4-431c-b656-74ef3e223573",
    "registered_at": "2026-10-29T17:30:23.675928Z",
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
      "created_at": "2026-10-29T17:30:26.114143Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T17:30:31.761084Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks` → **422**

```json
{
  "command_id": "46997d74-d714-43e2-8d08-69fe2888df56",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "34971abf-e170-4717-bf0c-98dfb1407be2"
}
```

`POST /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks` → **201**

```json
{
  "command_id": "1d74f5d3-b572-4419-b95a-f49f5a52e64f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T17:30:37.381176Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks` → **201**

```json
{
  "command_id": "1d74f5d3-b572-4419-b95a-f49f5a52e64f",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T17:30:37.381176Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/29c90642-2ac4-431c-b656-74ef3e223573` → **200**

```json
{
  "client": {
    "id": "29c90642-2ac4-431c-b656-74ef3e223573",
    "phone": "+380732109314",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:30:23.675928Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:30:26.111556Z",
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

`POST /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks/79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd/resolve` → **200**

```json
{
  "command_id": "4f9695e5-7a7d-4e11-90d8-5f2a52db4960",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd",
  "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T17:30:37.381176Z",
  "resolved_at": "2026-10-29T17:30:38.313964Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/29c90642-2ac4-431c-b656-74ef3e223573` → **200**

```json
{
  "client": {
    "id": "29c90642-2ac4-431c-b656-74ef3e223573",
    "phone": "+380732109314",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:30:23.675928Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:30:26.111556Z",
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

`GET /api/admin/v1/clients/29c90642-2ac4-431c-b656-74ef3e223573` → **200**

```json
{
  "client": {
    "id": "29c90642-2ac4-431c-b656-74ef3e223573",
    "phone": "+380732109314",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:30:23.675928Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "56c256eb-b11a-4b77-9285-af8312ea6291",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T17:30:26.111556Z",
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

`POST /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks/79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd/resolve` → **409**

```json
{
  "command_id": "fa168c58-3a8f-434a-a72f-e18826713e68",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks/79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "2dadc1f3-d9c8-42b8-98a1-05f8fd34e848"
}
```

`GET /api/admin/v1/orders/56c256eb-b11a-4b77-9285-af8312ea6291/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd",
      "order_id": "56c256eb-b11a-4b77-9285-af8312ea6291",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T17:30:37.381176Z",
      "resolved_at": "2026-10-29T17:30:38.313964Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 56c256eb-b11a-4b77-9285-af8312ea6291 without phone or card digits; chargeback 79464bc6-e6e7-4672-a1cf-3e4f8daa5bbd recorded and won.

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
  "session_id": "58ee57fb-ab2f-40cc-a778-e262d01adb48",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5NDEsImlhdCI6MTc5MzI5NTA0MSwianRpIjoiY2IxMjFjYjgtMDQzZS00ZDg4LWI0MTItNmU4YjRhNjJjY2YyIiwic2lkIjoiNThlZTU3ZmItYWIyZi00MGNjLWE3NzgtZTI2MmQwMWFkYjQ4In0.dTSyjBlK2suAEyt_a8B8h98JOLTrrAGb_DWjpmg8vhY",
  "access_expires_at": "2026-10-29T17:45:41.439901687Z",
  "refresh_token": "WLVXvLTqB0NKj0eK_UhSYLIP2EFc-VNY-jkZl_rgR50",
  "refresh_expires_at": "2026-10-30T05:30:41.439289566Z",
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
  "phone": "+48600468800",
  "device_ref": "sandbox-21785"
}
```

```json
{
  "challenge_id": "43a90fc4-f914-4286-9323-488584a47ac0",
  "expires_at": "2026-10-29T17:35:42.303807303Z",
  "resend_available_at": "2026-10-29T17:30:43.303807303Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600468800` → **200**

```json
{
  "phone": "+48600468800",
  "audience": "CLIENT",
  "code": "406929",
  "sent_at": "2026-10-29T17:30:42.306620748Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "43a90fc4-f914-4286-9323-488584a47ac0",
  "code": "406929",
  "device_ref": "sandbox-21785"
}
```

```json
{
  "session_id": "cfd72cbd-2a5f-433b-be7c-490f84fa4edf",
  "subject": {
    "type": "CLIENT",
    "id": "adc0f903-8e9a-4eb6-9b0b-a7b4b5fc7077"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGMwZjkwMy04ZTlhLTRlYjYtOWIwYi1hN2I0YjVmYzcwNzciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTQyLCJpYXQiOjE3OTMyOTUwNDIsImp0aSI6IjgwYTdiM2RkLTBhMzYtNDE3Yi1iMzhmLWUxNTAyNjQ5MDhiOCIsInNpZCI6ImNmZDcyY2JkLTJhNWYtNDMzYi1iZTdjLTQ5MGY4NGZhNGVkZiJ9.Q6P3pMez2u0COoDvI4RpVESa28xiptsvPFuZPejPBiU",
  "access_expires_at": "2026-10-29T17:45:42.617099534Z",
  "refresh_token": "FLyFY-0iro7n_Pp0IG0km8SGyO6e-gjJYLHkUR9r0SE",
  "refresh_expires_at": "2026-11-28T17:30:42.616547535Z",
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
  "command_id": "35913388-9ecf-4200-ae6d-cb0a1dfa82e6",
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
  "correlation_id": "d77a42d6-80d1-491f-a0f9-ccf8d598e5a9",
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
  "command_id": "c2be497f-a91a-43d6-a824-96a7c6dc0f3f",
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
  "paused_at": "2026-10-29T17:30:43.769624333Z",
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
  "command_id": "9987908e-c647-4459-bee0-f78a4547d428",
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
  "id": "6d548dd3-6aae-41d0-bc19-3a7961235856",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:44.373384Z",
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
  "command_id": "ba921e7d-82c4-470b-82ca-2d059e7a49e5",
  "quote_id": "6d548dd3-6aae-41d0-bc19-3a7961235856",
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
  "correlation_id": "2e4c6124-ec32-4869-adee-96c4c0b4781d"
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
  "paused_at": "2026-10-29T17:30:43.769624Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "618e1e7e-abe0-4f74-9190-a713c3fea237",
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
  "command_id": "003235fa-ce30-4ac4-9dbd-4e760a32ded4",
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
  "command_id": "2aca3915-44c9-488b-81b2-f89eb7e06952",
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
  "id": "111cb9df-bf6a-453b-b2c3-e76389bee36f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:46.168176Z",
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
  "command_id": "116a24df-fe22-4053-b0dd-70f4a7684cd9",
  "quote_id": "111cb9df-bf6a-453b-b2c3-e76389bee36f",
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
  "correlation_id": "7da66378-d81f-4627-abc1-d4e790e2e6f0"
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
  "command_id": "ec8b8d0a-333e-4441-94a0-489f3311d944",
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
      "from": "20:00",
      "to": "21:00"
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
      "from": "20:00",
      "to": "21:00"
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
  "command_id": "2e3c9da5-6c5a-4e29-9ee4-8f0e6ee9f08e",
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
  "id": "e8691572-0229-450f-a63e-4c7e2334644f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:47.327489Z",
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
  "command_id": "4ccd366c-c981-4238-9146-b0f2a1a3f050",
  "quote_id": "e8691572-0229-450f-a63e-4c7e2334644f",
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
  "correlation_id": "173767b0-479d-4615-9b79-eb2d60615c80"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "5439a429-49e7-41de-a338-c773d21fc6b8",
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
  "correlation_id": "dd36fcdd-94e4-4de5-9121-926dad2033d3"
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
      "from": "20:00",
      "to": "21:00"
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
  "command_id": "d65be43a-6c8d-4208-a9b8-95bb971651ae",
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
  "phone": "+380674748471",
  "device_ref": "sandbox-31972"
}
```

```json
{
  "challenge_id": "76259970-05e8-420e-a14b-452a38eecb32",
  "expires_at": "2026-10-29T17:35:48.826996514Z",
  "resend_available_at": "2026-10-29T17:30:49.826996514Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674748471` → **200**

```json
{
  "phone": "+380674748471",
  "audience": "CLIENT",
  "code": "870096",
  "sent_at": "2026-10-29T17:30:48.829464191Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "76259970-05e8-420e-a14b-452a38eecb32",
  "code": "870096",
  "device_ref": "sandbox-31972"
}
```

```json
{
  "session_id": "694b4a48-7404-4bfb-a958-6ff6ae4a51f9",
  "subject": {
    "type": "CLIENT",
    "id": "fc82495c-05a1-43fa-b98a-8ed625a1ef11"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYzgyNDk1Yy0wNWExLTQzZmEtYjk4YS04ZWQ2MjVhMWVmMTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTQ5LCJpYXQiOjE3OTMyOTUwNDksImp0aSI6IjhlMjg0NWM4LTM5M2QtNDg4Yi04MzhhLWFkMGY2NTcwYTFjMyIsInNpZCI6IjY5NGI0YTQ4LTc0MDQtNGJmYi1hOTU4LTZmZjZhZTRhNTFmOSJ9.bQ4KPxpx9lAYhKzfq-Ni4luvE5b2OAnxwHxJk8zU7NQ",
  "access_expires_at": "2026-10-29T17:45:49.150204656Z",
  "refresh_token": "OHB1eAQAGqpGiwVKXKDYmZQwgLWjWnIHJaVWmaMOkPE",
  "refresh_expires_at": "2026-11-28T17:30:49.149640706Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "fc82495c-05a1-43fa-b98a-8ed625a1ef11",
  "session_id": "694b4a48-7404-4bfb-a958-6ff6ae4a51f9",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7db260d4-4a57-4d7b-a288-df39556c5f80",
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
  "id": "4db6be29-e4fd-4d51-9033-36ef866bf37d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:35:49.734381Z",
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
  "challenge_id": "fb0ee4f3-9341-40de-8f45-40d13087709f",
  "expires_at": "2026-10-29T17:35:52.030372149Z",
  "resend_available_at": "2026-10-29T17:30:53.030372149Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380674748471` → **200**

```json
{
  "phone": "+380674748471",
  "audience": "CLIENT",
  "code": "655309",
  "sent_at": "2026-10-29T17:30:52.03317041Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "1c2af56a-a992-4440-b18d-b45f632ff783",
  "challenge_id": "fb0ee4f3-9341-40de-8f45-40d13087709f",
  "otp_code": "655309"
}
```

```json
{
  "client_id": "fc82495c-05a1-43fa-b98a-8ed625a1ef11",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T17:30:52.360255402Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "13a90f94-1d94-41ce-8277-4c2e6dbffddc",
  "quote_id": "4db6be29-e4fd-4d51-9033-36ef866bf37d",
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
  "correlation_id": "899ee665-1d4f-4256-ae8d-c30bb71feeb4"
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
  "session_id": "549f15c3-2a7f-4137-8f3f-52e88551417b",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5NTMsImlhdCI6MTc5MzI5NTA1MywianRpIjoiZGUwY2EwYWEtYzRhYy00M2Q0LWE5ODgtZjQzNjkyNWRiMjg1Iiwic2lkIjoiNTQ5ZjE1YzMtMmE3Zi00MTM3LThmM2YtNTJlODg1NTE0MTdiIn0.zoTvDFzd16vruFmf2FFZ6liYURD98lw5X9FwCp2UlYE",
  "access_expires_at": "2026-10-29T17:45:53.223946068Z",
  "refresh_token": "xV3BXknCwDC_5y9UroO4paURhiZREvdVrLC7EMDCp8A",
  "refresh_expires_at": "2026-10-30T05:30:53.223389141Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "fc82495c-05a1-43fa-b98a-8ed625a1ef11",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T17:30:52.360255Z",
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

`POST /api/admin/v1/client-deletions/fc82495c-05a1-43fa-b98a-8ed625a1ef11/complete` → **200**

```json
{
  "command_id": "daae526b-e0f1-42b9-9ad5-f0b9790e3ea6",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "fc82495c-05a1-43fa-b98a-8ed625a1ef11",
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
  "correlation_id": "b1ebf209-506f-4488-b29f-c9f34d1df602"
}
```

Done: client fc82495c-05a1-43fa-b98a-8ed625a1ef11 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660088712",
  "device_ref": "sandbox-6835"
}
```

```json
{
  "challenge_id": "e6614d81-16f9-4cd6-92a4-544e88b515a2",
  "expires_at": "2026-10-29T17:35:54.4010807Z",
  "resend_available_at": "2026-10-29T17:30:55.4010807Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660088712` → **200**

```json
{
  "phone": "+380660088712",
  "audience": "CLIENT",
  "code": "555636",
  "sent_at": "2026-10-29T17:30:54.404105845Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6614d81-16f9-4cd6-92a4-544e88b515a2",
  "code": "555636",
  "device_ref": "sandbox-6835"
}
```

```json
{
  "session_id": "dff52eb7-cf1d-494c-a656-3826a928b718",
  "subject": {
    "type": "CLIENT",
    "id": "aaf60635-e415-47fa-9bae-783426d91265"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWY2MDYzNS1lNDE1LTQ3ZmEtOWJhZS03ODM0MjZkOTEyNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTU0LCJpYXQiOjE3OTMyOTUwNTQsImp0aSI6Ijk0ZjlkMTJlLWRjNmYtNGU1OC04Mzg3LTA3NzA3N2Q5YjVhNiIsInNpZCI6ImRmZjUyZWI3LWNmMWQtNDk0Yy1hNjU2LTM4MjZhOTI4YjcxOCJ9.qkmTKaB3aW6gSsboH88AOFNZ5VBeFnE_h19eF3CtQ74",
  "access_expires_at": "2026-10-29T17:45:54.716001775Z",
  "refresh_token": "vDpdeKM5uw2Kw-Em5vqPHiTWx9_QuyYbtmW-k9C202w",
  "refresh_expires_at": "2026-11-28T17:30:54.715321918Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "aaf60635-e415-47fa-9bae-783426d91265",
  "session_id": "dff52eb7-cf1d-494c-a656-3826a928b718",
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
  "session_id": "db1d3f3f-3d2c-4d71-8ec7-66bcbc21502e",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5NTUsImlhdCI6MTc5MzI5NTA1NSwianRpIjoiNTBiMzE3MWEtYTEwZS00MzJmLWI5YzktZjQzNTYyNThhNzYyIiwic2lkIjoiZGIxZDNmM2YtM2QyYy00ZDcxLThlYzctNjZiY2JjMjE1MDJlIn0.e1a-FURd2sfaHK6zRGvm59M68ZJWwIq6klkh2HiiO6w",
  "access_expires_at": "2026-10-29T17:45:55.582210936Z",
  "refresh_token": "4gGXji85EM-Ha7kdU2cOx9GhbM8EVzq_NHRLqny5i-g",
  "refresh_expires_at": "2026-10-30T05:30:55.58168232Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=0088712&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "aaf60635-e415-47fa-9bae-783426d91265",
      "phone": "+380660088712",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T17:30:54.713609Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/aaf60635-e415-47fa-9bae-783426d91265` → **200**

```json
{
  "client": {
    "id": "aaf60635-e415-47fa-9bae-783426d91265",
    "phone": "+380660088712",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:30:54.713609Z",
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

`POST /api/admin/v1/clients/aaf60635-e415-47fa-9bae-783426d91265/block` → **400**

```json
{
  "command_id": "cde90f9c-6e2d-4200-8f20-5ed249af5607",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/aaf60635-e415-47fa-9bae-783426d91265/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "0656be74-aafe-4ca8-9033-711b9afac975",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/aaf60635-e415-47fa-9bae-783426d91265/block` → **200**

```json
{
  "command_id": "2ed750af-a98f-4075-bb5e-fc4196a794cf",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "aaf60635-e415-47fa-9bae-783426d91265",
  "phone": "+380660088712",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T17:30:54.713609Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T17:30:56.790523Z",
    "by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
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
  "correlation_id": "e94fa31f-5fbd-455d-8271-0381528385f1"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660088712",
  "device_ref": "sandbox-1601"
}
```

```json
{
  "challenge_id": "3d1745f3-9812-4a8d-a646-e5b87dc1f7d7",
  "expires_at": "2026-10-29T17:35:59.357509223Z",
  "resend_available_at": "2026-10-29T17:31:00.357509223Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660088712` → **200**

```json
{
  "phone": "+380660088712",
  "audience": "CLIENT",
  "code": "936418",
  "sent_at": "2026-10-29T17:30:59.359997029Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "3d1745f3-9812-4a8d-a646-e5b87dc1f7d7",
  "code": "936418",
  "device_ref": "sandbox-1601"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "9ed668fe-fcfe-4513-8795-54aa138c115e"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/aaf60635-e415-47fa-9bae-783426d91265` → **200**

```json
{
  "client": {
    "id": "aaf60635-e415-47fa-9bae-783426d91265",
    "phone": "+380660088712",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T17:30:54.713609Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T17:30:56.790523Z",
      "by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
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

`POST /api/admin/v1/clients/aaf60635-e415-47fa-9bae-783426d91265/unblock` → **200**

```json
{
  "command_id": "b5560f0c-00d4-426f-8c7e-0a773fd66f89",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "aaf60635-e415-47fa-9bae-783426d91265",
  "phone": "+380660088712",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T17:30:54.713609Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380660088712",
  "device_ref": "sandbox-23183"
}
```

```json
{
  "challenge_id": "36236033-26ba-4384-808c-d51addc29005",
  "expires_at": "2026-10-29T17:36:02.590731337Z",
  "resend_available_at": "2026-10-29T17:31:03.590731337Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380660088712` → **200**

```json
{
  "phone": "+380660088712",
  "audience": "CLIENT",
  "code": "627377",
  "sent_at": "2026-10-29T17:31:02.593650507Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "36236033-26ba-4384-808c-d51addc29005",
  "code": "627377",
  "device_ref": "sandbox-23183"
}
```

```json
{
  "session_id": "8e7eb95d-7414-4a93-aa09-a0407e3df493",
  "subject": {
    "type": "CLIENT",
    "id": "aaf60635-e415-47fa-9bae-783426d91265"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYWY2MDYzNS1lNDE1LTQ3ZmEtOWJhZS03ODM0MjZkOTEyNjUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTYyLCJpYXQiOjE3OTMyOTUwNjIsImp0aSI6IjIyMDYyZWU5LTVjZmUtNGY2YS05OTE2LTc1YWM5N2JmZTMxMSIsInNpZCI6IjhlN2ViOTVkLTc0MTQtNGE5My1hYTA5LWEwNDA3ZTNkZjQ5MyJ9.nOUUCw1rPoozbkCWUfTdSL7hDSEjw7TaamyLWHOVO6E",
  "access_expires_at": "2026-10-29T17:46:02.898511341Z",
  "refresh_token": "REQ4FXYA1GEj4bwgZ5sSnKdU22BwpZLIXwdaWdfxQjg",
  "refresh_expires_at": "2026-11-28T17:31:02.897950196Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "aaf60635-e415-47fa-9bae-783426d91265",
  "session_id": "8e7eb95d-7414-4a93-aa09-a0407e3df493",
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
  "phone": "+380662456254",
  "device_ref": "sandbox-24919"
}
```

```json
{
  "challenge_id": "021a4942-6d27-4f74-ac09-a1d6b30e78e4",
  "expires_at": "2026-10-29T17:36:03.47720054Z",
  "resend_available_at": "2026-10-29T17:31:04.47720054Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662456254` → **200**

```json
{
  "phone": "+380662456254",
  "audience": "CLIENT",
  "code": "764104",
  "sent_at": "2026-10-29T17:31:03.479833426Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "021a4942-6d27-4f74-ac09-a1d6b30e78e4",
  "code": "764104",
  "device_ref": "sandbox-24919"
}
```

```json
{
  "session_id": "923a1ba0-b4df-4642-9315-0f3ccd9f30a3",
  "subject": {
    "type": "CLIENT",
    "id": "210ae348-2291-426f-bdc7-ac13c238c2cd"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMTBhZTM0OC0yMjkxLTQyNmYtYmRjNy1hYzEzYzIzOGMyY2QiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTYzLCJpYXQiOjE3OTMyOTUwNjMsImp0aSI6ImUyNDBkMTZhLTk0YjMtNDg0ZC1iZjI5LTYwMzBiMWYzMTJhZiIsInNpZCI6IjkyM2ExYmEwLWI0ZGYtNDY0Mi05MzE1LTBmM2NjZDlmMzBhMyJ9.8isW98OYd4VQ53Z1165MdKKFEoYsyszy7nv-IxsN6hU",
  "access_expires_at": "2026-10-29T17:46:03.794063069Z",
  "refresh_token": "5Hp1TR2E_rVCHW1Ldb7WcDH84maKfkMpJpg49QBoCdA",
  "refresh_expires_at": "2026-11-28T17:31:03.793210079Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "98022c30-377b-4329-a383-662f2f8e3d75",
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
  "id": "1fb8ce79-c213-4406-b662-6ef3a62c2c04",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:36:04.101193Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 71a012e5-2a8a-497a-848a-54019c306bc2) → **201**

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
  "session_id": "a707bc08-85e6-4be5-87d5-a0c1d825c360",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5NjQsImlhdCI6MTc5MzI5NTA2NCwianRpIjoiNGZjOTUxYmYtM2Q4Ni00YTliLWFhZDAtYmMyY2E5ZGY4N2FjIiwic2lkIjoiYTcwN2JjMDgtODVlNi00YmU1LTg3ZDUtYTBjMWQ4MjVjMzYwIn0.WFuXvvy8UTo4baRr2oimwwAa0SW3Te0mZkB2kWad4Eo",
  "access_expires_at": "2026-10-29T17:46:04.730770631Z",
  "refresh_token": "NSfgWe18PQjcCquizQA0iMPGnaEoWA8JuwtKVAUt7VE",
  "refresh_expires_at": "2026-10-30T05:31:04.730215967Z",
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
  "session_id": "0cddc43c-73d4-413a-b105-c01427697e1b",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5NjUsImlhdCI6MTc5MzI5NTA2NSwianRpIjoiYWQwNWY4OWItMGU1ZS00OWVkLWIzNWYtOWFiNjdjZTY3N2Y3Iiwic2lkIjoiMGNkZGM0M2MtNzNkNC00MTNhLWIxMDUtYzAxNDI3Njk3ZTFiIn0.DRyNdvRPaphKA9ZmK9-t-0teCMcT17LRnkBAC9guyjA",
  "access_expires_at": "2026-10-29T17:46:05.362002983Z",
  "refresh_token": "5_988fWmadRAxAcE9FO5uba5myMjIpkDQj_YfPVFDSc",
  "refresh_expires_at": "2026-10-30T05:31:05.361437509Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/ace2f76b-5a3f-4cf5-9305-e862b2fd7812/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:31:04.399273Z",
      "actor": {
        "type": "CLIENT",
        "id": "210ae348-2291-426f-bdc7-ac13c238c2cd",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
        "quote_id": "1fb8ce79-c213-4406-b662-6ef3a62c2c04",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "71a012e5-2a8a-497a-848a-54019c306bc2"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:31:04.401667Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
        "attempt_id": "60680eba-198f-4a77-9e4c-c203ad9b443b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "71a012e5-2a8a-497a-848a-54019c306bc2"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T17:31:04.409213Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
        "attempt_id": "60680eba-198f-4a77-9e4c-c203ad9b443b"
      },
      "correlation_id": "71a012e5-2a8a-497a-848a-54019c306bc2"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "60680eba-198f-4a77-9e4c-c203ad9b443b",
        "generation": 1,
        "started_at": "2026-10-29T17:31:04.400675Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T17:31:04.409213Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T17:31:04.402411Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/71a012e5-2a8a-497a-848a-54019c306bc2` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812:0",
      "order_id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
      "at": "2026-10-29T17:31:04.399273Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812:1",
      "order_id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
      "at": "2026-10-29T17:31:04.401667Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812:2",
      "order_id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
      "at": "2026-10-29T17:31:04.409213Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/ab905528-47d6-45eb-a06d-7bf1c5d939ef` → **200**

```json
{
  "found": []
}
```

Done: request 71a012e5-2a8a-497a-848a-54019c306bc2 — order ace2f76b-5a3f-4cf5-9305-e862b2fd7812 found by its id.

`GET /api/rider/v1/orders/ace2f76b-5a3f-4cf5-9305-e862b2fd7812` → **200**

```json
{
  "id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "210ae348-2291-426f-bdc7-ac13c238c2cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:31:04.398679Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/ace2f76b-5a3f-4cf5-9305-e862b2fd7812/cancel` → **200**

```json
{
  "command_id": "a5f81ec3-c0dd-4f8d-b317-8fca4560a62b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "ace2f76b-5a3f-4cf5-9305-e862b2fd7812",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "210ae348-2291-426f-bdc7-ac13c238c2cd",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:31:04.398679Z",
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
  "phone": "+380637461058",
  "device_ref": "sandbox-13881"
}
```

```json
{
  "challenge_id": "5a691d10-9fc9-4b91-b341-70c4343a50c4",
  "expires_at": "2026-10-29T17:36:07.166426508Z",
  "resend_available_at": "2026-10-29T17:31:08.166426508Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637461058` → **200**

```json
{
  "phone": "+380637461058",
  "audience": "CLIENT",
  "code": "371408",
  "sent_at": "2026-10-29T17:31:07.169214594Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5a691d10-9fc9-4b91-b341-70c4343a50c4",
  "code": "371408",
  "device_ref": "sandbox-13881"
}
```

```json
{
  "session_id": "6e6c4de7-6a9d-419e-9e66-25b415f9417c",
  "subject": {
    "type": "CLIENT",
    "id": "3a27e4e8-3446-4301-aabb-81285812e35f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzYTI3ZTRlOC0zNDQ2LTQzMDEtYWFiYi04MTI4NTgxMmUzNWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTY3LCJpYXQiOjE3OTMyOTUwNjcsImp0aSI6IjU5NmVmNjEzLTlhYTItNDdjNi1hM2I4LWUyYTgwOTM4MjU1NSIsInNpZCI6IjZlNmM0ZGU3LTZhOWQtNDE5ZS05ZTY2LTI1YjQxNWY5NDE3YyJ9.Lo4jrzAfoFxLcwfvAyu0JQnrEt2bQPwPmEqHF93m4ak",
  "access_expires_at": "2026-10-29T17:46:07.48282244Z",
  "refresh_token": "BdiTKxDXo95YhbQBkypCqm3VOPW5GFYDpSvnVHA3wDk",
  "refresh_expires_at": "2026-11-28T17:31:07.482266826Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "d8c4cc78-a5d0-4769-a91a-3756758abd72",
  "expires_at": "2026-10-29T17:36:09.762638408Z",
  "resend_available_at": "2026-10-29T17:31:10.762638408Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637461058` → **200**

```json
{
  "phone": "+380637461058",
  "audience": "CLIENT",
  "code": "737207",
  "sent_at": "2026-10-29T17:31:09.765073255Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "a5d7692a-fee7-48ce-bf11-87e6666c36d0",
  "challenge_id": "d8c4cc78-a5d0-4769-a91a-3756758abd72",
  "otp_code": "737207"
}
```

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "PENDING",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081` → **200**

```json
{
  "id": "325af1ab-0310-4f21-8daa-527004846081",
  "state": "READY",
  "created_at": "2026-10-29T17:31:10.072767Z",
  "ready_at": "2026-10-29T17:31:18.637357Z",
  "expires_at": "2026-11-05T17:31:18.637357Z",
  "size_bytes": 1031
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631438986",
  "device_ref": "sandbox-23770"
}
```

```json
{
  "challenge_id": "8ca38f41-5e22-41c5-b069-b404787dbe98",
  "expires_at": "2026-10-29T17:36:19.611623098Z",
  "resend_available_at": "2026-10-29T17:31:20.611623098Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631438986` → **200**

```json
{
  "phone": "+380631438986",
  "audience": "CLIENT",
  "code": "992454",
  "sent_at": "2026-10-29T17:31:19.614356292Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8ca38f41-5e22-41c5-b069-b404787dbe98",
  "code": "992454",
  "device_ref": "sandbox-23770"
}
```

```json
{
  "session_id": "91871f98-52bb-4d1d-9133-749ace855a6c",
  "subject": {
    "type": "CLIENT",
    "id": "d1ac9d6e-1afc-4e92-9b29-479e46a901cf"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJkMWFjOWQ2ZS0xYWZjLTRlOTItOWIyOS00NzllNDZhOTAxY2YiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTc5LCJpYXQiOjE3OTMyOTUwNzksImp0aSI6IjJkZjRlN2UzLTYyMTctNGVmYS1iOTAyLTliZjI2YmZjZWNmNyIsInNpZCI6IjkxODcxZjk4LTUyYmItNGQxZC05MTMzLTc0OWFjZTg1NWE2YyJ9.Bk0ynFwPkuj8SelXqmNMMO9feNw9rGIFiLnea5htuE8",
  "access_expires_at": "2026-10-29T17:46:19.920274244Z",
  "refresh_token": "F7nUf1DPjkIYqUY5d4uuP5J3jYoa35ziZFtjonENlJQ",
  "refresh_expires_at": "2026-11-28T17:31:19.919779462Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/325af1ab-0310-4f21-8daa-527004846081/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "419ef31a-01c0-43b0-af17-4364653c4c35"
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
  "session_id": "89dbfca3-1b5a-49a7-b758-71e4af08038b",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5ODAsImlhdCI6MTc5MzI5NTA4MCwianRpIjoiNjVlODMwNTQtOTlhZi00MTQyLTg5NWQtOWRkYjRjODcyYTExIiwic2lkIjoiODlkYmZjYTMtMWI1YS00OWE3LWI3NTgtNzFlNGFmMDgwMzhiIn0.6P2CNeSIP6HVPMgsfwdlozqdXmqHvDdNtPVn6vhQCmM",
  "access_expires_at": "2026-10-29T17:46:20.771269378Z",
  "refresh_token": "PP_IPEJqvkNubau3oZVOtm4g3jC6CGoMo5II0bBqf2k",
  "refresh_expires_at": "2026-10-30T05:31:20.770737688Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "3a27e4e8-3446-4301-aabb-81285812e35f",
  "session_id": "6e6c4de7-6a9d-419e-9e66-25b415f9417c",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/3a27e4e8-3446-4301-aabb-81285812e35f/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "325af1ab-0310-4f21-8daa-527004846081",
      "state": "READY",
      "created_at": "2026-10-29T17:31:10.072767Z",
      "ready_at": "2026-10-29T17:31:18.637357Z",
      "expires_at": "2026-11-05T17:31:18.637357Z",
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
  "device_ref": "sandbox-3392"
}
```

```json
{
  "challenge_id": "7c5ca699-3783-4aaf-9959-2a90313f76be",
  "expires_at": "2026-10-29T17:36:21.613400984Z",
  "resend_available_at": "2026-10-29T17:31:22.613400984Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "941129",
  "sent_at": "2026-10-29T17:31:21.616086084Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c5ca699-3783-4aaf-9959-2a90313f76be",
  "code": "941129",
  "device_ref": "sandbox-3392"
}
```

```json
{
  "session_id": "76364fd4-9abb-413e-8355-4f2510274d87",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTk4MSwiaWF0IjoxNzkzMjk1MDgxLCJqdGkiOiIzNmI4ZjdlMy0wOTg3LTRlNzItYjY1Ny0xZjFhZmExYWU4MDUiLCJzaWQiOiI3NjM2NGZkNC05YWJiLTQxM2UtODM1NS00ZjI1MTAyNzRkODcifQ.yr4FMLvzg6LZI1legR-lxC3DpoR1vPhRroQxdD1qd0E",
  "access_expires_at": "2026-10-29T17:46:21.917488522Z",
  "refresh_token": "3iRdOCuLxqPKwMYxDM6XEhhJVaExdh1dLtPs6cm_j1A",
  "refresh_expires_at": "2026-11-28T17:31:21.916984464Z",
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
  "device_ref": "sandbox-2270"
}
```

```json
{
  "challenge_id": "07d4a585-b405-4dfc-a696-cc1c62bad5ce",
  "expires_at": "2026-10-29T17:36:22.477088231Z",
  "resend_available_at": "2026-10-29T17:31:23.477088231Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "989006",
  "sent_at": "2026-10-29T17:31:22.47980827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "07d4a585-b405-4dfc-a696-cc1c62bad5ce",
  "code": "989006",
  "device_ref": "sandbox-2270"
}
```

```json
{
  "session_id": "773c3d61-7dab-4965-a763-8b26d969d6df",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTk4MiwiaWF0IjoxNzkzMjk1MDgyLCJqdGkiOiIxODNiODEwMS1hYzk2LTRlZGEtOGZkYy0xM2JjNmNmNzUyYzciLCJzaWQiOiI3NzNjM2Q2MS03ZGFiLTQ5NjUtYTc2My04YjI2ZDk2OWQ2ZGYifQ.i1wXbqjDt18XUapJ_c4w4isbCsTOPMctTXna8MYroP4",
  "access_expires_at": "2026-10-29T17:46:22.774219006Z",
  "refresh_token": "tQXzQ0XImwOm6ksMcVUnAr3eYbB98DAWc4LTWBPMVpQ",
  "refresh_expires_at": "2026-11-28T17:31:22.773595603Z",
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
  "command_id": "d052a523-b8ec-4237-b503-42f5033f287c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:23Z",
    "sequence": 1793295083326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c0244805-5016-4315-bceb-ed7e146e7078",
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
  "last_heartbeat_at": "2026-10-29T17:31:23.344618Z",
  "last_location_at": "2026-10-29T17:31:23.344618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-21968"
}
```

```json
{
  "challenge_id": "3fd6d95d-7d0f-4492-9a61-a2d2659c45ea",
  "expires_at": "2026-10-29T17:36:23.622058072Z",
  "resend_available_at": "2026-10-29T17:31:24.622058072Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "903554",
  "sent_at": "2026-10-29T17:31:23.62510306Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3fd6d95d-7d0f-4492-9a61-a2d2659c45ea",
  "code": "903554",
  "device_ref": "sandbox-21968"
}
```

```json
{
  "session_id": "8ee4fce6-5435-4506-8eb7-7f79fa164eed",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTk4MywiaWF0IjoxNzkzMjk1MDgzLCJqdGkiOiIwNGU5ZTQzMi05NzhlLTQ5MWUtOGJmMC1lZDdkOTNkZWRiZWYiLCJzaWQiOiI4ZWU0ZmNlNi01NDM1LTQ1MDYtOGViNy03Zjc5ZmExNjRlZWQifQ.QTYdF6EXhfqb9cDTm_K51vFMsJn6MG85XILm93zn6xc",
  "access_expires_at": "2026-10-29T17:46:23.93527805Z",
  "refresh_token": "iLlA36uaPBHPA7kKrmjpoSjgLBxWRHih11pEsXG0Rj0",
  "refresh_expires_at": "2026-11-28T17:31:23.934750909Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a99fc277-672d-413b-8036-f044cee74c71",
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
  "last_heartbeat_at": "2026-10-29T17:29:45.651324Z",
  "last_location_at": "2026-10-29T17:29:45.651324Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a99fc277-672d-413b-8036-f044cee74c71/handover` → **200**

```json
{
  "command_id": "47057555-f813-4b6e-831e-dd042448b969",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a99fc277-672d-413b-8036-f044cee74c71",
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
  "last_heartbeat_at": "2026-10-29T17:29:45.651324Z",
  "last_location_at": "2026-10-29T17:29:45.651324Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/a99fc277-672d-413b-8036-f044cee74c71/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:24Z",
    "sequence": 1793295084796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "a99fc277-672d-413b-8036-f044cee74c71",
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
  "last_heartbeat_at": "2026-10-29T17:31:24.81467Z",
  "last_location_at": "2026-10-29T17:31:24.81467Z",
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
  "session_id": "52ac3f46-55fe-4223-b60d-6188d93f995c",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5ODUsImlhdCI6MTc5MzI5NTA4NSwianRpIjoiYmFlYTc4OGYtZDlhZS00NzNkLWFlOTUtYzJjOGFkNjFkMjAwIiwic2lkIjoiNTJhYzNmNDYtNTVmZS00MjIzLWI2MGQtNjE4OGQ5M2Y5OTVjIn0.DQYCi5BeKDx4wAUZ9FolWVS8YaPGbh3GC5BQqin5ZnQ",
  "access_expires_at": "2026-10-29T17:46:25.390347635Z",
  "refresh_token": "ut9khJJAtLyuIyh7Sq2cjP04THXaE4dCz5uPYnrigO0",
  "refresh_expires_at": "2026-10-30T05:31:25.389786837Z",
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
  "session_id": "c7c89b20-2d98-42e7-8377-e7c1358cc181",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5ODUsImlhdCI6MTc5MzI5NTA4NSwianRpIjoiODUwMWE1YmEtOThiOS00MWMwLTk3YjAtODJmOTkxOGMzYWVkIiwic2lkIjoiYzdjODliMjAtMmQ5OC00MmU3LTgzNzctZTdjMTM1OGNjMTgxIn0.RiAkcFvSPeM9KxqCtdCvh0lJtGHdlNuPsc7swq4uLgY",
  "access_expires_at": "2026-10-29T17:46:25.968224134Z",
  "refresh_token": "DMvL0dgU9hyQwkCbQPF69UsdUsK2eMJhTNSqy5f1OuE",
  "refresh_expires_at": "2026-10-30T05:31:25.967611422Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380680768903",
  "device_ref": "sandbox-18530"
}
```

```json
{
  "challenge_id": "3cfcbf6b-d366-448a-ac71-d66a414f48a8",
  "expires_at": "2026-10-29T17:36:26.267502917Z",
  "resend_available_at": "2026-10-29T17:31:27.267502917Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380680768903` → **200**

```json
{
  "phone": "+380680768903",
  "audience": "CLIENT",
  "code": "575143",
  "sent_at": "2026-10-29T17:31:26.27041275Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3cfcbf6b-d366-448a-ac71-d66a414f48a8",
  "code": "575143",
  "device_ref": "sandbox-18530"
}
```

```json
{
  "session_id": "4c3291ac-e88e-4e95-9c8b-ae132b173aff",
  "subject": {
    "type": "CLIENT",
    "id": "aa756066-2f3d-4eb5-831b-61ac05529ae5"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYTc1NjA2Ni0yZjNkLTRlYjUtODMxYi02MWFjMDU1MjlhZTUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTg2LCJpYXQiOjE3OTMyOTUwODYsImp0aSI6IjI1MzkxMDE0LWEzNmUtNDQxZS1iZDZjLTYyOTJiMWIyNGIwZSIsInNpZCI6IjRjMzI5MWFjLWU4OGUtNGU5NS05YzhiLWFlMTMyYjE3M2FmZiJ9.YT5u4V5rW-WxPgaa-dmk3pswZ0hXz5vMhSUUaOzw4XM",
  "access_expires_at": "2026-10-29T17:46:26.596618225Z",
  "refresh_token": "8ZSlQXRuNMDaiVUML5IK68pYuRh1IrTvmhouut3JAxA",
  "refresh_expires_at": "2026-11-28T17:31:26.596044175Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "335e55db-2872-45fe-9917-6793a9baad4d",
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
  "id": "cd64d802-7680-40c8-85ad-9d6fbc6f1b60",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:36:26.910344Z",
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
  "command_id": "9bcc7e13-f293-4749-9dc7-ea2ec5ac0b8d",
  "quote_id": "cd64d802-7680-40c8-85ad-9d6fbc6f1b60",
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
  "id": "dbc53204-1aae-441f-a091-05b75eedc198",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "aa756066-2f3d-4eb5-831b-61ac05529ae5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:31:27.21249Z",
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
    "id": "bef5b1a6-d696-4578-a612-5bee1a88b210",
    "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
    "expires_at": "2026-10-29T17:31:42.215685Z",
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

`POST /api/driver/v1/offers/bef5b1a6-d696-4578-a612-5bee1a88b210/reject` → **204**

```json
{
  "command_id": "0b05fb8c-63f1-43af-92a9-be9545caed83"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "fd7a5109-8c11-4968-98ed-4112e90c5d79",
    "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
    "expires_at": "2026-10-29T17:31:42.803367Z",
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

`POST /api/driver/v1/offers/fd7a5109-8c11-4968-98ed-4112e90c5d79/accept` → **200**

```json
{
  "command_id": "3b9ab0ae-ce1b-4d1e-9dc5-211b35774d40"
}
```

```json
{
  "id": "47124050-0132-44d3-8d79-fa43ac7e4ded",
  "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8dc98fa8-f108-4b39-af62-3cb158aea8bf",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/dbc53204-1aae-441f-a091-05b75eedc198/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:31:27.212934Z",
      "actor": {
        "type": "CLIENT",
        "id": "aa756066-2f3d-4eb5-831b-61ac05529ae5",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
        "quote_id": "cd64d802-7680-40c8-85ad-9d6fbc6f1b60",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f396e25c-b5b2-41e8-9ce3-f3ffe614133d"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:31:27.214884Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
        "attempt_id": "033424a9-675a-48b9-a756-cd7ccaecfa5a",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f396e25c-b5b2-41e8-9ce3-f3ffe614133d"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:31:27.218555Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bef5b1a6-d696-4578-a612-5bee1a88b210",
        "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "f396e25c-b5b2-41e8-9ce3-f3ffe614133d"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T17:31:27.802437Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "bef5b1a6-d696-4578-a612-5bee1a88b210",
        "order_id": "dbc53204-1aae-441f-a091-05b75eedc198"
      },
      "correlation_id": "4f64500d-8924-4c03-b5a1-eb6267bc9cf0"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order dbc53204-1aae-441f-a091-05b75eedc198 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/dbc53204-1aae-441f-a091-05b75eedc198` → **200**

```json
{
  "id": "dbc53204-1aae-441f-a091-05b75eedc198",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "aa756066-2f3d-4eb5-831b-61ac05529ae5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "47124050-0132-44d3-8d79-fa43ac7e4ded",
    "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "8dc98fa8-f108-4b39-af62-3cb158aea8bf",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T17:31:27.21249Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/dbc53204-1aae-441f-a091-05b75eedc198/cancel` → **200**

```json
{
  "command_id": "3bd2859a-6f0e-4241-b597-9313377c60f0",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "dbc53204-1aae-441f-a091-05b75eedc198",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "aa756066-2f3d-4eb5-831b-61ac05529ae5",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "47124050-0132-44d3-8d79-fa43ac7e4ded",
    "order_id": "dbc53204-1aae-441f-a091-05b75eedc198",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "8dc98fa8-f108-4b39-af62-3cb158aea8bf",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T17:31:27.21249Z",
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
  "session_id": "c0244805-5016-4315-bceb-ed7e146e7078",
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
  "last_heartbeat_at": "2026-10-29T17:31:23.344618Z",
  "last_location_at": "2026-10-29T17:31:23.344618Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c0244805-5016-4315-bceb-ed7e146e7078/close` → **200**

```json
{
  "command_id": "c46cc597-fa6a-4960-822b-6c1b8d1cdeae",
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
  "session_id": "a99fc277-672d-413b-8036-f044cee74c71",
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
  "last_heartbeat_at": "2026-10-29T17:31:24.81467Z",
  "last_location_at": "2026-10-29T17:31:24.81467Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/a99fc277-672d-413b-8036-f044cee74c71/close` → **200**

```json
{
  "command_id": "cd86add9-1113-419a-94e8-d87c1c954d8d",
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
  "session_id": "0c46b293-c576-4e3a-b106-9d05d6c22ad0",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTU5OTAsImlhdCI6MTc5MzI5NTA5MCwianRpIjoiMDgzZmYzNWQtNTQ1ZS00ZjRkLWFmMWItNjlmZTZlNzgzZDViIiwic2lkIjoiMGM0NmIyOTMtYzU3Ni00ZTNhLWIxMDYtOWQwNWQ2YzIyYWQwIn0.2Cgo8jjyDrES-4yQHA93drvADWvjRwBbVNvChjc4Lu0",
  "access_expires_at": "2026-10-29T17:46:30.828506993Z",
  "refresh_token": "h_XgWtxbxjK0RNE_S2vXwMw89k6RrG1QbAvX57P0WhA",
  "refresh_expires_at": "2026-10-30T05:31:30.82787249Z",
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
  "command_id": "f558cfe6-92bc-4bde-ad03-2ad5d713e334",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T17:31:31.410822Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "2b7ccb5e-86f0-4925-935c-c8b8203f73ad",
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
  "correlation_id": "056843b0-1ae1-4881-b5ea-2d4277314574"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "60e7db5c-288e-4ade-be4b-31fc096e81a1",
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
  "correlation_id": "81589165-f48f-4a22-a21a-532057b055a1"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631431411",
  "device_ref": "sandbox-22755"
}
```

```json
{
  "challenge_id": "5de3e10e-3ab9-4646-b826-65095eb3c668",
  "expires_at": "2026-10-29T17:36:32.295767287Z",
  "resend_available_at": "2026-10-29T17:31:33.295767287Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631431411` → **200**

```json
{
  "phone": "+380631431411",
  "audience": "CLIENT",
  "code": "276145",
  "sent_at": "2026-10-29T17:31:32.298656435Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5de3e10e-3ab9-4646-b826-65095eb3c668",
  "code": "276145",
  "device_ref": "sandbox-22755"
}
```

```json
{
  "session_id": "fae777b8-a542-4886-9222-ef75e77df6d9",
  "subject": {
    "type": "CLIENT",
    "id": "a19a4e6e-6020-4ffd-92d3-1bbea9591aea"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTlhNGU2ZS02MDIwLTRmZmQtOTJkMy0xYmJlYTk1OTFhZWEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTkyLCJpYXQiOjE3OTMyOTUwOTIsImp0aSI6IjNkYTNiYTQ5LWE3NjEtNDZkZi05ZjFhLTdlZTM3ZWQyZjc0MyIsInNpZCI6ImZhZTc3N2I4LWE1NDItNDg4Ni05MjIyLWVmNzVlNzdkZjZkOSJ9.kO9LJQbRDPefcYx2oCy1IbL8UqUD91BEOBzw1z2Ljgc",
  "access_expires_at": "2026-10-29T17:46:32.608118004Z",
  "refresh_token": "BP2VBKd0N4qCpRbJK6AdV7Gg36I8URJ9yxsL5PutA6M",
  "refresh_expires_at": "2026-11-28T17:31:32.607597373Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "968beaf3-06c9-464d-9e78-e19a61122e7d",
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
  "id": "f180d615-697b-498f-b374-e85de92252cb",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:36:32.897551Z",
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
  "command_id": "7205d3d9-24a0-4adf-b759-f4a83db190bc",
  "quote_id": "f180d615-697b-498f-b374-e85de92252cb",
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
  "correlation_id": "8099796e-4fc3-4877-ac09-438373d8a7db"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f6431b45-bc82-4df4-ac3d-11d328a4644c",
  "quote_id": "f180d615-697b-498f-b374-e85de92252cb",
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
  "id": "e84ad356-f027-4959-90b9-1203eba5a7f1",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a19a4e6e-6020-4ffd-92d3-1bbea9591aea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:31:33.492138Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/e84ad356-f027-4959-90b9-1203eba5a7f1/cancel` → **200**

```json
{
  "command_id": "ee81531e-c2f9-403a-a65d-47760c50b586",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "e84ad356-f027-4959-90b9-1203eba5a7f1",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "a19a4e6e-6020-4ffd-92d3-1bbea9591aea",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:31:33.492138Z",
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

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "f0010104-2fbd-4757-905d-104928fbe60d",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T17:31:34.127746Z"
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
      "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T17:31:34.127746Z"
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
  "device_ref": "sandbox-5980"
}
```

```json
{
  "challenge_id": "2cb145dc-943c-4cba-8349-85b86da541c9",
  "expires_at": "2026-10-29T17:36:34.99329268Z",
  "resend_available_at": "2026-10-29T17:31:35.99329268Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "880465",
  "sent_at": "2026-10-29T17:31:34.995850216Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2cb145dc-943c-4cba-8349-85b86da541c9",
  "code": "880465",
  "device_ref": "sandbox-5980"
}
```

```json
{
  "session_id": "4df81d40-3454-4f8a-9d30-a872269ad5e1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NTk5NSwiaWF0IjoxNzkzMjk1MDk1LCJqdGkiOiIxMTMxOTQ0ZS0wMTQ0LTQyZDEtODE1Zi04MTVjNTRlNGNhMDAiLCJzaWQiOiI0ZGY4MWQ0MC0zNDU0LTRmOGEtOWQzMC1hODcyMjY5YWQ1ZTEifQ.q0VLSkXcyFKp5IEokaKq2ugGpKg_Mnhe4JXm8DpdqiA",
  "access_expires_at": "2026-10-29T17:46:35.297836463Z",
  "refresh_token": "N8m9HgnNbus2tPx28lNqUHccvXvltTGlsP3eUn8szAA",
  "refresh_expires_at": "2026-11-28T17:31:35.297223592Z",
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
  "command_id": "4da41def-4f84-4bbd-a866-f9ecb03de29e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:35Z",
    "sequence": 1793295095845
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:35.863692Z",
  "last_location_at": "2026-10-29T17:31:35.863692Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676543586",
  "device_ref": "sandbox-32467"
}
```

```json
{
  "challenge_id": "dcd7e489-f991-46c2-810c-cb953069b3e0",
  "expires_at": "2026-10-29T17:36:36.15403776Z",
  "resend_available_at": "2026-10-29T17:31:37.15403776Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676543586` → **200**

```json
{
  "phone": "+380676543586",
  "audience": "CLIENT",
  "code": "699935",
  "sent_at": "2026-10-29T17:31:36.156718916Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dcd7e489-f991-46c2-810c-cb953069b3e0",
  "code": "699935",
  "device_ref": "sandbox-32467"
}
```

```json
{
  "session_id": "adfc9b2d-e6f6-4243-9ca3-a53df48b9a1c",
  "subject": {
    "type": "CLIENT",
    "id": "ac50dbff-68eb-43c1-b360-7661a93aefd9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhYzUwZGJmZi02OGViLTQzYzEtYjM2MC03NjYxYTkzYWVmZDkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk1OTk2LCJpYXQiOjE3OTMyOTUwOTYsImp0aSI6IjNhYjFhNTE4LTQwMjEtNDhlYS05OThiLTcyNTE4ZDJjODFlOSIsInNpZCI6ImFkZmM5YjJkLWU2ZjYtNDI0My05Y2EzLWE1M2RmNDhiOWExYyJ9.dCx2rg6Mg1nVGErUgXXj7hq-GeOlf7zfwmyQCTV-sqs",
  "access_expires_at": "2026-10-29T17:46:36.469882286Z",
  "refresh_token": "GOK_GUfjDGip_ELKZyZFwN3IB-R7HVv7LDdZyFloHFI",
  "refresh_expires_at": "2026-11-28T17:31:36.469308928Z",
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
  "command_id": "1f1c07c3-f2b0-4cbf-ae1c-df9e68145560",
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
  "id": "d1136bb9-64b4-44f7-81cc-3479867b11e4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:36:37.044848Z",
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
  "command_id": "190e641b-2d28-4482-8407-def1b80744b4",
  "platform": "ANDROID",
  "token": "sandbox-driver-946c73ec-183b-496f-9642-0edc78fd1853"
}
```

```json
{
  "id": "1ee475e5-2baa-410d-b4b2-5f586678e8fe",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T17:31:37.346794Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "b1486ae1-5442-4429-a960-c6511a34be91",
  "platform": "ANDROID",
  "token": "sandbox-rider-02b32c70-5193-45db-98f8-66cf9c7f7e6b"
}
```

```json
{
  "id": "c187d5f8-94f0-46d3-8abb-b6b6feb8b354",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T17:31:37.641304Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "f76ac095-dcf6-42db-9068-e9f3f498b725",
  "quote_id": "d1136bb9-64b4-44f7-81cc-3479867b11e4",
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
  "id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ac50dbff-68eb-43c1-b360-7661a93aefd9",
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
  "created_at": "2026-10-29T17:31:37.932685Z",
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
    "id": "b83e0f30-74a9-4d78-8431-f393e21df90a",
    "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
    "expires_at": "2026-10-29T17:31:52.935624Z",
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

`POST /api/driver/v1/offers/b83e0f30-74a9-4d78-8431-f393e21df90a/accept` → **200**

```json
{
  "command_id": "b88c15d3-da31-46cd-93a1-15967f5ab6ef"
}
```

```json
{
  "id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T17:31:37.908Z` → **200**

```json
[
  {
    "at": "2026-10-29T17:31:38.196398622Z",
    "token_suffix": "fd1853",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_type": "OfferMade",
      "event_id": "8baf9e1b-3536-4ee1-bcff-939051bbf126",
      "order_version": "2",
      "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
      "type": "driver.offer"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380676543586&after=2026-10-29T17:31:37.908Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380676543586&after=2026-10-29T17:31:37.908Z` → **200**

```json
[
  {
    "at": "2026-10-29T17:31:39.202773579Z",
    "token_suffix": "7f7e6b",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_type": "AssignmentCommitted",
      "event_id": "9580092a-cee3-4c59-939d-5a695fe62f7e",
      "order_version": "3",
      "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
      "type": "rider.driver-assigned"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/e60db76b-0aa1-4440-b51b-1945d0af0427/messages` → **201**

```json
{
  "command_id": "f017110e-e145-4692-a644-4f55f32108c8",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "3bcb4c44-7669-4bc1-8c03-0ce6a8636fd2",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T17:31:39.900250091Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "assignment_id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
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

`POST /api/driver/v1/trips/30331f87-6821-4b0f-bd8c-e28c63b0b81b/messages` → **201**

```json
{
  "command_id": "71a7509d-3dbb-4cdc-a8ac-12ae5d586183",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "e471c21a-f163-430e-969a-9eefa8a9d4a5",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T17:31:40.457933086Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/e60db76b-0aa1-4440-b51b-1945d0af0427/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/30331f87-6821-4b0f-bd8c-e28c63b0b81b/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380676543586"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:41Z",
    "sequence": 1793295101269
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:41.287476Z",
  "last_location_at": "2026-10-29T17:31:41.287476Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "assignment_id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
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

`POST /api/driver/v1/trips/30331f87-6821-4b0f-bd8c-e28c63b0b81b/arrive` → **200**

```json
{
  "command_id": "81f31031-04f9-43b5-b058-64b1f926a974",
  "expected_version": 0
}
```

```json
{
  "id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "assignment_id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
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
  "arrived_at": "2026-10-29T17:31:41.8444Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/30331f87-6821-4b0f-bd8c-e28c63b0b81b/start` → **200**

```json
{
  "command_id": "ccca8f4f-10f7-40ef-a240-737197a35246",
  "expected_version": 1
}
```

```json
{
  "id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "assignment_id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
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
  "arrived_at": "2026-10-29T17:31:41.8444Z",
  "started_at": "2026-10-29T17:31:42.148809Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:42Z",
    "sequence": 1793295102427
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:42.445443Z",
  "last_location_at": "2026-10-29T17:31:42.445443Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/30331f87-6821-4b0f-bd8c-e28c63b0b81b/complete` → **200**

```json
{
  "command_id": "a08f5d8f-4507-4f1c-a074-e519f7eddf8f",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:31:42Z",
  "cash_received": true
}
```

```json
{
  "id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "assignment_id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
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
  "arrived_at": "2026-10-29T17:31:41.8444Z",
  "started_at": "2026-10-29T17:31:42.148809Z",
  "completed_at": "2026-10-29T17:31:42.73944Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/e60db76b-0aa1-4440-b51b-1945d0af0427` → **200**

```json
{
  "id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ac50dbff-68eb-43c1-b360-7661a93aefd9",
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
    "id": "03ba6d9c-810c-47a5-8fee-c3904daad761",
    "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:31:37.932685Z",
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
    "id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T17:31:37.932685Z",
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
    "id": "30331f87-6821-4b0f-bd8c-e28c63b0b81b",
    "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
    "order_short_number": 13,
    "created_at": "2026-10-29T17:31:38.529864Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "35961fee-8724-4650-88a8-1802849ed318",
    "order_id": "9590860e-5103-4a79-834d-92a6d059f945",
    "order_short_number": 8,
    "created_at": "2026-10-29T17:30:18.904629Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "6022fbe6-43a7-42f5-8080-bbdb16591565",
    "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
    "order_short_number": 3,
    "created_at": "2026-10-29T17:29:34.172972Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "c33bc8ed-26db-4e66-b852-735b740a0949",
    "order_id": "f11ffec8-bafa-4be1-8413-f94eae84c61b",
    "order_short_number": 2,
    "created_at": "2026-10-29T17:29:12.366124Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "74a55e5c-1913-4ab7-ab2c-58bcbe750d56",
    "order_id": "1e3c9c91-3ee7-42c3-aa9a-b24151b73199",
    "order_short_number": 1,
    "created_at": "2026-10-29T17:29:02.390063Z",
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

`GET /api/rider/v1/orders/e60db76b-0aa1-4440-b51b-1945d0af0427/tip` → **200**

```json
{
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
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
  "available_until": "2026-10-30T17:31:42.73944Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/e60db76b-0aa1-4440-b51b-1945d0af0427/tip` → **201**

```json
{
  "command_id": "179993f0-bbb8-4f27-a689-e3fce2f0bfed",
  "amount_minor": 1100
}
```

```json
{
  "id": "2a174aa2-6fc3-4e1f-85e7-83821e3e95f2",
  "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T17:31:47.773806Z"
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
  "session_id": "31d8d7bc-689b-4288-8532-c1f127a737c7",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMDgsImlhdCI6MTc5MzI5NTEwOCwianRpIjoiN2JlYThhNjktNmM5YS00YWQ2LWIxMDItMjRiNTNjYjA1OGVhIiwic2lkIjoiMzFkOGQ3YmMtNjg5Yi00Mjg4LTg1MzItYzFmMTI3YTczN2M3In0.sr8PVIfi7Di1e-RNgJ_5N0ozhx1cQoD24NatMkCc0rA",
  "access_expires_at": "2026-10-29T17:46:48.346980634Z",
  "refresh_token": "hdxMvPxX5CC0TucmdWAjzHE0Z3TYGilN2f51Ym0ZV6M",
  "refresh_expires_at": "2026-10-30T05:31:48.346414088Z",
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
          "CARD": 2,
          "CASH": 11
        },
        "cancelled_by": {
          "DRIVER": 1,
          "RIDER": 3,
          "STAFF": 1
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
      "CARD": 2,
      "CASH": 11
    },
    "cancelled_by": {
      "DRIVER": 1,
      "RIDER": 3,
      "STAFF": 1
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
  "generated_at": "2026-10-29T17:31:48.62983702Z"
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
  "generated_at": "2026-10-29T17:31:48.918017177Z"
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
  "session_id": "2cf6bbe6-28e5-45b7-872d-d7b020926c42",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMDksImlhdCI6MTc5MzI5NTEwOSwianRpIjoiYmRmYjljZjItOTBiZi00NjNhLWE4NzgtYzMzZThlMWRjODVjIiwic2lkIjoiMmNmNmJiZTYtMjhlNS00NWI3LTg3MmQtZDdiMDIwOTI2YzQyIn0.OamlLc7zYnukvfZfzGskLT97SJUAPwj0yD5qNEnDYDA",
  "access_expires_at": "2026-10-29T17:46:49.508286982Z",
  "refresh_token": "CHgma1RaQTadQpCKUyRPV1rmxltjy1yxdmrruGOm8CQ",
  "refresh_expires_at": "2026-10-30T05:31:49.507335473Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/e60db76b-0aa1-4440-b51b-1945d0af0427/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:31:37.933127Z",
      "actor": {
        "type": "CLIENT",
        "id": "ac50dbff-68eb-43c1-b360-7661a93aefd9",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
        "quote_id": "d1136bb9-64b4-44f7-81cc-3479867b11e4",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "b7d93371-004c-4817-8bf0-f00877ee8cb6"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:31:37.934924Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
        "attempt_id": "4a25c2e0-d8fb-407c-ade0-4e90ea75780b",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "b7d93371-004c-4817-8bf0-f00877ee8cb6"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:31:37.93754Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "b83e0f30-74a9-4d78-8431-f393e21df90a",
        "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "b7d93371-004c-4817-8bf0-f00877ee8cb6"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T17:31:38.531529Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "b83e0f30-74a9-4d78-8431-f393e21df90a",
        "order_id": "e60db76b-0aa1-4440-b51b-1945d0af0427",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "03ba6d9c-810c-47a5-8fee-c3904daad761"
      },
      "correlation_id": "cab0fa1a-eaef-4e52-a82b-97efb09901a8"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T17:31:50.072926244Z",
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
      "last_location_at": "2026-10-29T17:31:42.445443Z",
      "order_id": null
    }
  ]
}
```

Done: order e60db76b-0aa1-4440-b51b-1945d0af0427.

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
  "session_id": "2689d0a9-d387-4a87-86b4-7390923275af",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMTAsImlhdCI6MTc5MzI5NTExMCwianRpIjoiMmRmODU3ODktY2U3OC00NzRhLWJkMmYtMWQ2NDNlMjI1NjNiIiwic2lkIjoiMjY4OWQwYTktZDM4Ny00YTg3LTg2YjQtNzM5MDkyMzI3NWFmIn0.ndFZ5hDjZKDT9-vxceVj1zLpu4euYQXA1v8jHAhYTr4",
  "access_expires_at": "2026-10-29T17:46:50.673004134Z",
  "refresh_token": "MwfWtym4sb5HYXpfwsZqoqjPhFsX4VMnAwJ4NB5sAm8",
  "refresh_expires_at": "2026-10-30T05:31:50.672296739Z",
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
  "command_id": "9a2a2205-5213-45a6-b8a4-f9627cde5879",
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
  "timestamp": "2026-10-29T17:31:51.000+0000",
  "channel": {
    "id": "1730052000.206704076",
    "linkedid": "1730052000.206704076",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670023095"
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
  "timestamp": "2026-10-29T17:31:51.000+0000",
  "channel": {
    "id": "1730052000.206704076",
    "linkedid": "1730052000.206704076",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380670023095"
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
  "session_id": "9704e2e5-6a44-4ac7-bd62-dacf30ca3838",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMTEsImlhdCI6MTc5MzI5NTExMSwianRpIjoiOTM3ODRmM2YtOTViYS00YjQ2LThlN2MtMGMyMTQxZTExMWIxIiwic2lkIjoiOTcwNGUyZTUtNmE0NC00YWM3LWJkNjItZGFjZjMwY2EzODM4In0.7kwMJKju_-HlpkSD9Jdrpeu5Dl_lziHs4C1FEvn3s0w",
  "access_expires_at": "2026-10-29T17:46:51.867916921Z",
  "refresh_token": "NQjc_ro1TZKc3EeE3yMvVUWep4uWiBw_uMJwI1ZMVJ8",
  "refresh_expires_at": "2026-10-30T05:31:51.867283451Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "52f5bad2-e59a-4357-83c5-70a48a3f98e1",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380670023095",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T17:31:51Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/52f5bad2-e59a-4357-83c5-70a48a3f98e1/answer` → **200**

```json
{
  "command_id": "c0c11498-475d-43b2-828e-44600a6ce2a3"
}
```

```json
{
  "id": "52f5bad2-e59a-4357-83c5-70a48a3f98e1",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380670023095",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "order_ids": [],
  "started_at": "2026-10-29T17:31:51Z",
  "answered_at": "2026-10-29T17:31:52.457755Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.206704076",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "ec9705d9-4776-4d8d-bf83-59f50cd83bbe",
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
  "id": "428595d5-0143-44ea-acf8-9457ede47379",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:36:52.768802Z",
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
  "command_id": "933e7063-6e01-4511-b9e1-e70419e0cf33",
  "quote_id": "428595d5-0143-44ea-acf8-9457ede47379",
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
    "phone": "+380670023095"
  },
  "call_id": "52f5bad2-e59a-4357-83c5-70a48a3f98e1"
}
```

```json
{
  "id": "817ee7df-a9b1-4312-a358-0d4b06aa9a79",
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
  "created_at": "2026-10-29T17:31:53.070399Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670023095"
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
    "id": "1730052000.206704076",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "52f5bad2-e59a-4357-83c5-70a48a3f98e1",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380670023095",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [
        "817ee7df-a9b1-4312-a358-0d4b06aa9a79"
      ],
      "started_at": "2026-10-29T17:31:51Z",
      "answered_at": "2026-10-29T17:31:52.457755Z",
      "ended_at": "2026-10-29T17:31:53.394689Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "94a12af1-88eb-465f-9efa-a164214ba15f",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678144512",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [],
      "started_at": "2026-10-29T17:29:20.537853Z",
      "answered_at": "2026-10-29T17:29:20.870318Z",
      "ended_at": "2026-10-29T17:29:21.194395Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:29:28.612317Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/817ee7df-a9b1-4312-a358-0d4b06aa9a79` → **200**

```json
{
  "id": "817ee7df-a9b1-4312-a358-0d4b06aa9a79",
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
  "created_at": "2026-10-29T17:31:53.070399Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670023095"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/817ee7df-a9b1-4312-a358-0d4b06aa9a79` → **200**

```json
{
  "id": "817ee7df-a9b1-4312-a358-0d4b06aa9a79",
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
  "created_at": "2026-10-29T17:31:53.070399Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670023095"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/817ee7df-a9b1-4312-a358-0d4b06aa9a79/cancel` → **200**

```json
{
  "command_id": "d8a5ef1e-7591-47ba-8303-442b8e3fa4b1",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "817ee7df-a9b1-4312-a358-0d4b06aa9a79",
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
  "created_at": "2026-10-29T17:31:53.070399Z",
  "caller": {
    "name": "Caller",
    "phone": "+380670023095"
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

Done: call 52f5bad2-e59a-4357-83c5-70a48a3f98e1 with order 817ee7df-a9b1-4312-a358-0d4b06aa9a79.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-27370"
}
```

```json
{
  "challenge_id": "7a802ce4-2d53-4c30-95f4-bb2e43261262",
  "expires_at": "2026-10-29T17:36:54.647172391Z",
  "resend_available_at": "2026-10-29T17:31:55.647172391Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "583535",
  "sent_at": "2026-10-29T17:31:54.65073562Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a802ce4-2d53-4c30-95f4-bb2e43261262",
  "code": "583535",
  "device_ref": "sandbox-27370"
}
```

```json
{
  "session_id": "3d5097a9-0728-4d9a-93c3-3b229bba95af",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjAxNCwiaWF0IjoxNzkzMjk1MTE0LCJqdGkiOiJjOTUwOWEyNC1mMmRhLTRhY2YtOTJlOS0zYzBjNmI1OWVlNDgiLCJzaWQiOiIzZDUwOTdhOS0wNzI4LTRkOWEtOTNjMy0zYjIyOWJiYTk1YWYifQ.7e-Hn1TsOyjT2vZkpp4hUoUypgYeFC2ofDeHjoVXiHI",
  "access_expires_at": "2026-10-29T17:46:54.960367124Z",
  "refresh_token": "h1iy6QWCSszZfYLSnJl5Z0lzolyMioWqSiGtMBZdHk4",
  "refresh_expires_at": "2026-11-28T17:31:54.95981733Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:42.445443Z",
  "last_location_at": "2026-10-29T17:31:42.445443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/handover` → **200**

```json
{
  "command_id": "1bc55001-77bd-4161-bd21-7b86acf8e29e",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:42.445443Z",
  "last_location_at": "2026-10-29T17:31:42.445443Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:55Z",
    "sequence": 1793295115808
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:55.827729Z",
  "last_location_at": "2026-10-29T17:31:55.827729Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380665499487",
  "device_ref": "sandbox-3321"
}
```

```json
{
  "challenge_id": "0092f42c-3139-4f68-a9a9-3103a97fd1f2",
  "expires_at": "2026-10-29T17:36:56.114139784Z",
  "resend_available_at": "2026-10-29T17:31:57.114139784Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380665499487` → **200**

```json
{
  "phone": "+380665499487",
  "audience": "CLIENT",
  "code": "550680",
  "sent_at": "2026-10-29T17:31:56.117194446Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0092f42c-3139-4f68-a9a9-3103a97fd1f2",
  "code": "550680",
  "device_ref": "sandbox-3321"
}
```

```json
{
  "session_id": "805c2bef-82a5-4e63-86f9-25c461723d24",
  "subject": {
    "type": "CLIENT",
    "id": "243ce76d-2500-4675-8e77-f03dffd715c6"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNDNjZTc2ZC0yNTAwLTQ2NzUtOGU3Ny1mMDNkZmZkNzE1YzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDE2LCJpYXQiOjE3OTMyOTUxMTYsImp0aSI6IjFkOTIxN2Y1LThiODAtNDM3Ny04ODRhLTUwODI2NmZkZjgxMyIsInNpZCI6IjgwNWMyYmVmLTgyYTUtNGU2My04NmY5LTI1YzQ2MTcyM2QyNCJ9.QABrIh03IAJfkcfshee3fqOX7-r8t_M8HXpYxqNasKc",
  "access_expires_at": "2026-10-29T17:46:56.42193322Z",
  "refresh_token": "jjlMY2S20EgvjgY5nyfHKSH2muQmKjvhkr6Wb7f6pTA",
  "refresh_expires_at": "2026-11-28T17:31:56.421328413Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "a3bc680b-e9b6-4fa8-8538-2bd17fef1221",
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
  "id": "4fee4082-539b-4298-8644-e5f27a04e149",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:36:56.701535Z",
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
  "command_id": "09036556-e563-489b-addb-75da74d6e818",
  "quote_id": "4fee4082-539b-4298-8644-e5f27a04e149",
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
  "id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "243ce76d-2500-4675-8e77-f03dffd715c6",
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
  "created_at": "2026-10-29T17:31:56.99332Z",
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
    "id": "10e9863c-976b-4a12-bb26-5df1fd6150db",
    "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
    "expires_at": "2026-10-29T17:32:11.996281Z",
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

`POST /api/driver/v1/offers/10e9863c-976b-4a12-bb26-5df1fd6150db/accept` → **200**

```json
{
  "command_id": "184cd637-4b56-4426-96ff-dd31b959947a"
}
```

```json
{
  "id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7",
  "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "bd3aa75d-fedd-4af5-93fe-4adc6f479d7a",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "bd3aa75d-fedd-4af5-93fe-4adc6f479d7a",
  "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
  "assignment_id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7",
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

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:58Z",
    "sequence": 1793295118148
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:58.166339Z",
  "last_location_at": "2026-10-29T17:31:58.166339Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/bd3aa75d-fedd-4af5-93fe-4adc6f479d7a/arrive` → **200**

```json
{
  "command_id": "d53acace-f599-444d-9eef-9d39e351760b",
  "expected_version": 0
}
```

```json
{
  "id": "bd3aa75d-fedd-4af5-93fe-4adc6f479d7a",
  "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
  "assignment_id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7",
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
  "arrived_at": "2026-10-29T17:31:58.457926Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/bd3aa75d-fedd-4af5-93fe-4adc6f479d7a/start` → **200**

```json
{
  "command_id": "701a9aaf-a26a-4eba-9708-591ab16792b6",
  "expected_version": 1
}
```

```json
{
  "id": "bd3aa75d-fedd-4af5-93fe-4adc6f479d7a",
  "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
  "assignment_id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7",
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
  "arrived_at": "2026-10-29T17:31:58.457926Z",
  "started_at": "2026-10-29T17:31:58.758795Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:31:59Z",
    "sequence": 1793295119442
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:59.062285Z",
  "last_location_at": "2026-10-29T17:31:59.062285Z",
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
  "device_ref": "sandbox-3110"
}
```

```json
{
  "challenge_id": "f1652b85-16ce-4523-b4a4-aa57d0e5d2b5",
  "expires_at": "2026-10-29T17:36:59.33561227Z",
  "resend_available_at": "2026-10-29T17:32:00.33561227Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "191147",
  "sent_at": "2026-10-29T17:31:59.33830404Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f1652b85-16ce-4523-b4a4-aa57d0e5d2b5",
  "code": "191147",
  "device_ref": "sandbox-3110"
}
```

```json
{
  "session_id": "20a1d2f2-898f-4521-b671-e7f0570166be",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjAxOSwiaWF0IjoxNzkzMjk1MTE5LCJqdGkiOiI2MjY5NjNhMi05ZTAzLTQ1NGQtYmUyMi1jZDY3ZjI3YjM3MTgiLCJzaWQiOiIyMGExZDJmMi04OThmLTQ1MjEtYjY3MS1lN2YwNTcwMTY2YmUifQ.i9hvT53f06NalRkzgpK9V49PTx6m5E5QSG5RbMHDIpE",
  "access_expires_at": "2026-10-29T17:46:59.660255629Z",
  "refresh_token": "5ZvO2f4KLjI-Foo66G-zQ1meBuJy8glMGHaIBD1rYT0",
  "refresh_expires_at": "2026-11-28T17:31:59.659534181Z",
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
  "command_id": "2b78286c-4766-4bc7-89f1-7807b0a6e30a",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:32:00Z",
    "sequence": 1793295120218
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "33fffaba-3126-4317-927a-92f697a3484f",
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
  "last_heartbeat_at": "2026-10-29T17:32:00.23669Z",
  "last_location_at": "2026-10-29T17:32:00.23669Z",
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
  "session_id": "489fb1f0-fcde-4339-a0dc-164f1a2e4ada",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMjAsImlhdCI6MTc5MzI5NTEyMCwianRpIjoiODljMTgxODUtOGU3NS00OTA0LWEyOWItZjQwNzVlMzhkNmJiIiwic2lkIjoiNDg5ZmIxZjAtZmNkZS00MzM5LWEwZGMtMTY0ZjFhMmU0YWRhIn0.TBGnVJ_Q7bMk98xRLAqWP-B-7FShe3xq9O-JmSXyuNY",
  "access_expires_at": "2026-10-29T17:47:00.822915543Z",
  "refresh_token": "p56ymNkm7mESJItDzCABfeBsvTTQO0hAXE49Z1D2BLY",
  "refresh_expires_at": "2026-10-30T05:32:00.822317208Z",
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
  "session_id": "da276d7d-5fd0-4d4e-9cba-c16598450f24",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMjEsImlhdCI6MTc5MzI5NTEyMSwianRpIjoiNTBlYWFjOGMtNTJhYy00OWVmLTk0MzgtYjQwM2JhNjdkZGY3Iiwic2lkIjoiZGEyNzZkN2QtNWZkMC00ZDRlLTljYmEtYzE2NTk4NDUwZjI0In0.XhH46pkxUZNlUMJLsMVGWutZ1Ppk_gU4IEVTwkk_JTI",
  "access_expires_at": "2026-10-29T17:47:01.406292499Z",
  "refresh_token": "H3EjZI9mtzYVYstZfd3AsvqyyyQrR3nSDvwIUz3EK1U",
  "refresh_expires_at": "2026-10-30T05:32:01.405766459Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be` → **200**

```json
{
  "id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "243ce76d-2500-4675-8e77-f03dffd715c6",
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
    "id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7",
    "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "bd3aa75d-fedd-4af5-93fe-4adc6f479d7a",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T17:31:56.99332Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be/interrupt` → **200**

```json
{
  "command_id": "8c5363ba-db30-4890-a8ea-160ea539611a",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "243ce76d-2500-4675-8e77-f03dffd715c6",
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
      "id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7",
      "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "bd3aa75d-fedd-4af5-93fe-4adc6f479d7a",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T17:31:56.99332Z",
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
    "id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "243ce76d-2500-4675-8e77-f03dffd715c6",
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
    "id": "3bec400d-1cb5-46a4-a37f-0e052046c6f8",
    "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
    "expires_at": "2026-10-29T17:32:17.009798Z",
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

`POST /api/driver/v1/offers/3bec400d-1cb5-46a4-a37f-0e052046c6f8/accept` → **200**

```json
{
  "command_id": "cad00d74-ad8f-42e0-9d1d-4a5144da25ed"
}
```

```json
{
  "id": "f7fab7a5-7c14-42e7-953e-a4e52b1f5258",
  "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "33026007-5a70-40f6-9897-5b875dd0b9a0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "33026007-5a70-40f6-9897-5b875dd0b9a0",
  "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
  "assignment_id": "f7fab7a5-7c14-42e7-953e-a4e52b1f5258",
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
  "session_id": "33fffaba-3126-4317-927a-92f697a3484f",
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
  "last_heartbeat_at": "2026-10-29T17:32:00.23669Z",
  "last_location_at": "2026-10-29T17:32:00.23669Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/33fffaba-3126-4317-927a-92f697a3484f/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:32:03Z",
    "sequence": 1793295123462
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "33fffaba-3126-4317-927a-92f697a3484f",
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
  "last_heartbeat_at": "2026-10-29T17:32:03.480959Z",
  "last_location_at": "2026-10-29T17:32:03.480959Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/33026007-5a70-40f6-9897-5b875dd0b9a0/arrive` → **200**

```json
{
  "command_id": "e7f8cc84-f7f2-4f1c-ad88-f0ed90fdf293",
  "expected_version": 0
}
```

```json
{
  "id": "33026007-5a70-40f6-9897-5b875dd0b9a0",
  "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
  "assignment_id": "f7fab7a5-7c14-42e7-953e-a4e52b1f5258",
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
  "arrived_at": "2026-10-29T17:32:03.766528Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/33026007-5a70-40f6-9897-5b875dd0b9a0/start` → **200**

```json
{
  "command_id": "38a536db-5322-4040-9f8e-c1b849ca712b",
  "expected_version": 1
}
```

```json
{
  "id": "33026007-5a70-40f6-9897-5b875dd0b9a0",
  "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
  "assignment_id": "f7fab7a5-7c14-42e7-953e-a4e52b1f5258",
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
  "arrived_at": "2026-10-29T17:32:03.766528Z",
  "started_at": "2026-10-29T17:32:04.066689Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/33026007-5a70-40f6-9897-5b875dd0b9a0/complete` → **200**

```json
{
  "command_id": "42e24b69-1f55-4918-984b-a3fa126c28b5",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:32:04Z"
}
```

```json
{
  "id": "33026007-5a70-40f6-9897-5b875dd0b9a0",
  "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
  "assignment_id": "f7fab7a5-7c14-42e7-953e-a4e52b1f5258",
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
  "arrived_at": "2026-10-29T17:32:03.766528Z",
  "started_at": "2026-10-29T17:32:04.066689Z",
  "completed_at": "2026-10-29T17:32:04.371418Z",
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
    "id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T17:32:02.000273Z",
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
    "id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T17:31:56.99332Z",
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

`GET /api/operator/v1/orders/cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T17:31:56.993821Z",
      "actor": {
        "type": "CLIENT",
        "id": "243ce76d-2500-4675-8e77-f03dffd715c6",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
        "quote_id": "4fee4082-539b-4298-8644-e5f27a04e149",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "95d16ce0-8697-44c5-a1df-2206fe47c10e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T17:31:56.995603Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
        "attempt_id": "f21ab43e-f191-40b3-afae-31cf76a7c41f",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "95d16ce0-8697-44c5-a1df-2206fe47c10e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T17:31:56.998229Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "10e9863c-976b-4a12-bb26-5df1fd6150db",
        "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "95d16ce0-8697-44c5-a1df-2206fe47c10e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T17:31:57.598182Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "10e9863c-976b-4a12-bb26-5df1fd6150db",
        "order_id": "cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "c350a6b9-e72e-4c75-b0b8-0be1aacbc8b7"
      },
      "correlation_id": "5077d07c-f4b7-4e8d-930d-8f9f6527c7e3"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/1833d75e-a525-48cf-8a01-14ce9ebbccfb/tip` → **200**

```json
{
  "order_id": "1833d75e-a525-48cf-8a01-14ce9ebbccfb",
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
  "available_until": "2026-10-30T17:32:04.371418Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/1833d75e-a525-48cf-8a01-14ce9ebbccfb/tip` → **409**

```json
{
  "command_id": "31fe6b3e-10e8-490c-b27b-7b16984be6d6",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/1833d75e-a525-48cf-8a01-14ce9ebbccfb/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "87f3e702-d5ab-4ace-b3f3-268c790edead"
}
```

Done: interrupted cae50f4d-a282-4b4f-a6d1-b18ccfe9f3be, follow-up 1833d75e-a525-48cf-8a01-14ce9ebbccfb.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7",
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
  "last_heartbeat_at": "2026-10-29T17:31:59.062285Z",
  "last_location_at": "2026-10-29T17:31:59.062285Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e7df9862-8b2d-45c9-8ebb-8aec8b85b1c7/close` → **200**

```json
{
  "command_id": "f8f93f22-35a2-4928-b0e7-8632f8fe3f72",
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
  "session_id": "33fffaba-3126-4317-927a-92f697a3484f",
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
  "last_heartbeat_at": "2026-10-29T17:32:03.480959Z",
  "last_location_at": "2026-10-29T17:32:03.480959Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/33fffaba-3126-4317-927a-92f697a3484f/close` → **200**

```json
{
  "command_id": "0f9d02c1-7698-4d54-97bb-dc527a8d80bf",
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
  "session_id": "931e482e-816a-4c1a-a4f2-bcd6bba52be7",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwMzAsImlhdCI6MTc5MzI5NTEzMCwianRpIjoiOTU0ODEzY2UtYzYyNS00MjJiLWExNDUtYTIwZGRmOWRkNzk2Iiwic2lkIjoiOTMxZTQ4MmUtODE2YS00YzFhLWE0ZjItYmNkNmJiYTUyYmU3In0.0ijPDdsARCEEEQXwLOZX_d_TqNEsF8cvPBOAeQJXgWU",
  "access_expires_at": "2026-10-29T17:47:10.576041105Z",
  "refresh_token": "LSbbP0-oYDbLjrNL2vFAdC9OtQZmBhfdNdbNFKjIhng",
  "refresh_expires_at": "2026-10-30T05:32:10.575358193Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "1d21ba4e-8410-418f-826b-33535815dd3b",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:32:10Z"
}
```

```json
{
  "id": "4b70c417-8992-47e4-beb8-ed2a713a575c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:32:10Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/4b70c417-8992-47e4-beb8-ed2a713a575c/publish` → **200**

```json
{
  "command_id": "a25ff57f-60ff-4a1c-ab06-87ba49999d26",
  "expected_version": 0
}
```

```json
{
  "id": "4b70c417-8992-47e4-beb8-ed2a713a575c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:32:11.183975Z",
  "published_at": "2026-10-29T17:32:11.183975Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "4b70c417-8992-47e4-beb8-ed2a713a575c",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T17:32:11.183975Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638260375",
  "device_ref": "sandbox-9198"
}
```

```json
{
  "challenge_id": "dca724ac-d8b5-4133-987f-bb93f88e3aca",
  "expires_at": "2026-10-29T17:37:11.751305712Z",
  "resend_available_at": "2026-10-29T17:32:12.751305712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638260375` → **200**

```json
{
  "phone": "+380638260375",
  "audience": "CLIENT",
  "code": "471377",
  "sent_at": "2026-10-29T17:32:11.753994492Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dca724ac-d8b5-4133-987f-bb93f88e3aca",
  "code": "471377",
  "device_ref": "sandbox-9198"
}
```

```json
{
  "session_id": "ddf7b1d5-1b91-48e5-b952-17e0eb328893",
  "subject": {
    "type": "CLIENT",
    "id": "83bf5d03-7698-47c5-b283-fb30114bf7ef"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4M2JmNWQwMy03Njk4LTQ3YzUtYjI4My1mYjMwMTE0YmY3ZWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDMyLCJpYXQiOjE3OTMyOTUxMzIsImp0aSI6IjVmZmVjMDJmLWNlMzQtNGM5YS1hMTExLWJmZTc2OTNjMzRjMCIsInNpZCI6ImRkZjdiMWQ1LTFiOTEtNDhlNS1iOTUyLTE3ZTBlYjMyODg5MyJ9.nNNmVIec-LyHAYKtkanvMc0ReXxxs8Th3ed4XHndqKc",
  "access_expires_at": "2026-10-29T17:47:12.056907864Z",
  "refresh_token": "kulpLOtx1zjONhQVbsZy6WwWLNAnvLaPwGF0ERZimr0",
  "refresh_expires_at": "2026-11-28T17:32:12.056287573Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "4b70c417-8992-47e4-beb8-ed2a713a575c",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T17:32:11.183975Z",
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
  "command_id": "36ca5df5-a02c-400c-8e4c-5f2a28629c6c",
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
  "id": "48a3f574-37a0-4fb0-b525-7ecb16a799b1",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:12.639265Z",
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
  "command_id": "b16937a1-a0d8-4c44-9d03-769830a44b39",
  "quote_id": "48a3f574-37a0-4fb0-b525-7ecb16a799b1",
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
  "correlation_id": "1ffee8cf-710d-49de-8f18-7816af3d14b6"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "ca8cfbd0-25d6-45d7-891b-b0e2444227ad",
  "version_id": "4b70c417-8992-47e4-beb8-ed2a713a575c",
  "language": "uk"
}
```

```json
{
  "version_id": "4b70c417-8992-47e4-beb8-ed2a713a575c",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T17:32:13.235676Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7a429403-2261-457d-bad5-aabb9b49d4e1",
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
  "id": "2bedc8b9-fe87-4781-8fd8-7f7d98b50346",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:13.513925Z",
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
  "command_id": "fd64c873-4b78-4a8f-ab49-1ce4eac6a7b0",
  "quote_id": "2bedc8b9-fe87-4781-8fd8-7f7d98b50346",
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
  "id": "cfebc9b3-4630-44f4-b2f9-2818f297050d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83bf5d03-7698-47c5-b283-fb30114bf7ef",
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
  "created_at": "2026-10-29T17:32:13.804729Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/cfebc9b3-4630-44f4-b2f9-2818f297050d` → **200**

```json
{
  "id": "cfebc9b3-4630-44f4-b2f9-2818f297050d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "83bf5d03-7698-47c5-b283-fb30114bf7ef",
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
  "created_at": "2026-10-29T17:32:13.804729Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/cfebc9b3-4630-44f4-b2f9-2818f297050d/cancel` → **200**

```json
{
  "command_id": "ee0de5af-de72-4e35-ad18-e45214f9042b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "cfebc9b3-4630-44f4-b2f9-2818f297050d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "83bf5d03-7698-47c5-b283-fb30114bf7ef",
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
  "created_at": "2026-10-29T17:32:13.804729Z",
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

`POST /api/admin/v1/legal-documents/4b70c417-8992-47e4-beb8-ed2a713a575c` → **409**

```json
{
  "command_id": "d5c88f74-171a-4589-92e6-301f054ea7a9",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T17:32:14Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/4b70c417-8992-47e4-beb8-ed2a713a575c",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3361cea4-2751-4c38-abda-dbea898c4eb0"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "6d959f4c-da80-4d1c-9a4b-ffafd7d4b57f",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T17:32:15Z"
}
```

```json
{
  "id": "5844c12b-c1c0-4a90-80ec-1fd028aa01d8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T17:32:15Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/5844c12b-c1c0-4a90-80ec-1fd028aa01d8/publish` → **200**

```json
{
  "command_id": "480f3634-85ed-4c10-abd7-b8d0de8f7cdd",
  "expected_version": 0
}
```

```json
{
  "id": "5844c12b-c1c0-4a90-80ec-1fd028aa01d8",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T17:32:15.32767Z",
  "published_at": "2026-10-29T17:32:15.32767Z",
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
  "device_ref": "sandbox-25397"
}
```

```json
{
  "challenge_id": "e840ccbc-5a5a-4a2e-a859-a6d3b61f82d4",
  "expires_at": "2026-10-29T17:37:15.625195053Z",
  "resend_available_at": "2026-10-29T17:32:16.625195053Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "217165",
  "sent_at": "2026-10-29T17:32:15.628074418Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e840ccbc-5a5a-4a2e-a859-a6d3b61f82d4",
  "code": "217165",
  "device_ref": "sandbox-25397"
}
```

```json
{
  "session_id": "7764cb31-5f3b-4221-bf65-af0dd94105a1",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjAzNSwiaWF0IjoxNzkzMjk1MTM1LCJqdGkiOiI4MzIwOTBmMy1kNjY2LTQ2MzMtYjFhMS04MGVhZTNhYmEwMmYiLCJzaWQiOiI3NzY0Y2IzMS01ZjNiLTQyMjEtYmY2NS1hZjBkZDk0MTA1YTEifQ.o-sTi6PX25oBOrevPo80tqrnTC1QKfn1sPWdW1CXEPU",
  "access_expires_at": "2026-10-29T17:47:15.928433115Z",
  "refresh_token": "V05imJCCod_u8GfarW2MPy1C9JRWECpATR6fpJMFZRk",
  "refresh_expires_at": "2026-11-28T17:32:15.927905091Z",
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
  "command_id": "94de7d50-b410-4e38-a70a-fa16f0648962",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:32:16Z",
    "sequence": 1793295136475
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "612b7938-290c-4b41-9465-715fe032bf78",
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
  "last_heartbeat_at": "2026-10-29T17:32:16.494069Z",
  "last_location_at": "2026-10-29T17:32:16.494069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380676329096",
  "device_ref": "sandbox-12705"
}
```

```json
{
  "challenge_id": "1d32d08f-e9ff-4c56-97c5-42aef70aa474",
  "expires_at": "2026-10-29T17:37:16.782971867Z",
  "resend_available_at": "2026-10-29T17:32:17.782971867Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380676329096` → **200**

```json
{
  "phone": "+380676329096",
  "audience": "CLIENT",
  "code": "837147",
  "sent_at": "2026-10-29T17:32:16.785787604Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1d32d08f-e9ff-4c56-97c5-42aef70aa474",
  "code": "837147",
  "device_ref": "sandbox-12705"
}
```

```json
{
  "session_id": "fbda583a-9026-4641-8137-9bc87bf82102",
  "subject": {
    "type": "CLIENT",
    "id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5MWVjYWYxYy01YTI1LTRkMGEtYjQ4OC01ZGQ4ZmYyNDdmOTgiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDM3LCJpYXQiOjE3OTMyOTUxMzcsImp0aSI6IjFiNjRhOGMwLWNiZGYtNDBlOC1iZTY3LWQzMDM4MmQzMmY2YyIsInNpZCI6ImZiZGE1ODNhLTkwMjYtNDY0MS04MTM3LTliYzg3YmY4MjEwMiJ9.p69n6P8MMO4ooDblRxSRUW14sLdvpxceVQLDbPr_4lg",
  "access_expires_at": "2026-10-29T17:47:17.088675365Z",
  "refresh_token": "0U8l2ij0KA_HLm3BRl4i0Dgq_3ubmzdFyVFB2XaUmYE",
  "refresh_expires_at": "2026-11-28T17:32:17.088119449Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "91ec45f6-1d78-48dc-ad37-1f9461cfc3aa",
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
  "id": "b073cb03-7d65-404b-9d78-079315503d0f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:17.373918Z",
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
  "command_id": "5ebe25bc-9424-4d64-abb2-acd1cb7d8fca",
  "quote_id": "b073cb03-7d65-404b-9d78-079315503d0f",
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
    "phone": "+380678860921"
  }
}
```

```json
{
  "id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:32:17.670498Z",
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
    "id": "2090a914-d323-4504-bb66-11cb0a6ccd21",
    "order_id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
    "expires_at": "2026-10-29T17:32:32.67392Z",
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

`POST /api/driver/v1/offers/2090a914-d323-4504-bb66-11cb0a6ccd21/accept` → **200**

```json
{
  "command_id": "ff6e6e37-600a-4b52-996c-d746c66ab26e"
}
```

```json
{
  "id": "5c95178b-5632-4fa2-8a86-8b825869a67b",
  "order_id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "eb95c49f-06fb-4f60-946b-cb1fd4bb9f91",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "eb95c49f-06fb-4f60-946b-cb1fd4bb9f91",
  "order_id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
  "assignment_id": "5c95178b-5632-4fa2-8a86-8b825869a67b",
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
    "phone": "+380678860921"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "79946e0e-ec90-4711-ad6d-b3f6de450a9a",
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
  "id": "57cc9373-a28e-4a10-9e58-9bfeafdf05bd",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:18.872544Z",
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
  "command_id": "12795bd6-da97-4ad2-a898-00938594e54e",
  "quote_id": "57cc9373-a28e-4a10-9e58-9bfeafdf05bd",
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
  "id": "f1e7d241-ede6-4a72-b73b-7558a78d7061",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:32:19.164698Z",
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
  "command_id": "ceba895a-2771-4b17-8293-57cd291b9b22",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T20:32:19Z"
}
```

```json
{
  "id": "7173ba9d-9b08-480b-be6d-88ec95cdef15",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:19.486166Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T20:32:19Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "0b7ed84a-5d06-4ca1-8821-5264f5c3937f",
  "quote_id": "7173ba9d-9b08-480b-be6d-88ec95cdef15",
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
  "pickup_at": "2026-10-29T20:32:19Z"
}
```

```json
{
  "id": "f3dc3314-2774-4877-9010-c85a02c64b11",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T17:32:19.785387Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T20:32:19Z",
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
  "command_id": "a840d196-6cc5-445a-8e5d-37848bc9b037",
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
  "id": "e9537ad3-e0b7-47d6-b507-560153acc000",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:20.110772Z",
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
  "command_id": "37714fb4-7ab9-4a8e-bbb7-e94b180e413b",
  "quote_id": "e9537ad3-e0b7-47d6-b507-560153acc000",
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
  "correlation_id": "97c0c4ec-7a5a-4bb3-b8f5-26baa89e2ca6"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "f3dc3314-2774-4877-9010-c85a02c64b11",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T17:32:19.785387Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T20:32:19Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f1e7d241-ede6-4a72-b73b-7558a78d7061",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-29T17:32:19.164698Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "f1e7d241-ede6-4a72-b73b-7558a78d7061",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:32:19.164698Z",
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

`GET /api/rider/v1/orders/f156ea54-a941-45d3-a1a4-78cddd8cbb81` → **200**

```json
{
  "id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c95178b-5632-4fa2-8a86-8b825869a67b",
    "order_id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "eb95c49f-06fb-4f60-946b-cb1fd4bb9f91",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T17:32:17.670498Z",
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
    "location_at": "2026-10-29T17:32:16.494069Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/f156ea54-a941-45d3-a1a4-78cddd8cbb81/cancel` → **200**

```json
{
  "command_id": "d1b2e5a0-43ec-423d-b092-6076c2c78b9f",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "5c95178b-5632-4fa2-8a86-8b825869a67b",
    "order_id": "f156ea54-a941-45d3-a1a4-78cddd8cbb81",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "eb95c49f-06fb-4f60-946b-cb1fd4bb9f91",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T17:32:17.670498Z",
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

`GET /api/rider/v1/orders/f1e7d241-ede6-4a72-b73b-7558a78d7061` → **200**

```json
{
  "id": "f1e7d241-ede6-4a72-b73b-7558a78d7061",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:32:19.164698Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f1e7d241-ede6-4a72-b73b-7558a78d7061/cancel` → **200**

```json
{
  "command_id": "50352fbf-e904-41aa-986e-c0fc0a25275c",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f1e7d241-ede6-4a72-b73b-7558a78d7061",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:32:19.164698Z",
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

`GET /api/rider/v1/orders/f3dc3314-2774-4877-9010-c85a02c64b11` → **200**

```json
{
  "id": "f3dc3314-2774-4877-9010-c85a02c64b11",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T17:32:19.785387Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T20:32:19Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/f3dc3314-2774-4877-9010-c85a02c64b11/cancel` → **200**

```json
{
  "command_id": "9958b9c2-1b04-4813-8fa8-91d994beaabb",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "f3dc3314-2774-4877-9010-c85a02c64b11",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "91ecaf1c-5a25-4d0a-b488-5dd8ff247f98",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T17:32:19.785387Z",
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
  "pickup_at": "2026-10-29T20:32:19Z",
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
  "session_id": "612b7938-290c-4b41-9465-715fe032bf78",
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
  "last_heartbeat_at": "2026-10-29T17:32:16.494069Z",
  "last_location_at": "2026-10-29T17:32:16.494069Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/612b7938-290c-4b41-9465-715fe032bf78/close` → **200**

```json
{
  "command_id": "9e7d27dd-fb1a-4219-8424-9293e7b66dc6",
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

Done: orders f156ea54-a941-45d3-a1a4-78cddd8cbb81, f1e7d241-ede6-4a72-b73b-7558a78d7061, f3dc3314-2774-4877-9010-c85a02c64b11.

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
  "session_id": "a08e8533-d424-476f-b582-d6b585c49d9c",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwNDMsImlhdCI6MTc5MzI5NTE0MywianRpIjoiNGNjNmJmZDAtODg1NS00NTFjLThlOTMtMWE3MmUzOTNiNjM5Iiwic2lkIjoiYTA4ZTg1MzMtZDQyNC00NzZmLWI1ODItZDZiNTg1YzQ5ZDljIn0.kiwk71P3Ge5oaHOXCBTySjxd3uQJuqqZzdYehyXe0cw",
  "access_expires_at": "2026-10-29T17:47:23.960855293Z",
  "refresh_token": "vOv4YCSNdIPzsNlNpUQOOMTu8zfMUT3c0xvwQ7HHZyQ",
  "refresh_expires_at": "2026-10-30T05:32:23.960305769Z",
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
  "session_id": "333b65fd-a85f-4d02-9823-61b99f301bd8",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwNDQsImlhdCI6MTc5MzI5NTE0NCwianRpIjoiYjZhNWU2ZjItY2JkZi00YzIyLTlkZDYtOTg1YTQ0MzhhYzI4Iiwic2lkIjoiMzMzYjY1ZmQtYTg1Zi00ZDAyLTk4MjMtNjFiOTlmMzAxYmQ4In0.MHml615D6_R7ibgtAO7fyfYZuReil65JQJv4xQFJDlo",
  "access_expires_at": "2026-10-29T17:47:24.530734273Z",
  "refresh_token": "1HQnxE0LcbSrX7rCTtUwG0TMZokFyxdgqL0bd9jsDHc",
  "refresh_expires_at": "2026-10-30T05:32:24.530137Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-20130"
}
```

```json
{
  "challenge_id": "bb0746e8-fcd8-4204-878b-984846e08fc2",
  "expires_at": "2026-10-29T17:37:24.802968184Z",
  "resend_available_at": "2026-10-29T17:32:25.802968184Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "313177",
  "sent_at": "2026-10-29T17:32:24.805701888Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bb0746e8-fcd8-4204-878b-984846e08fc2",
  "code": "313177",
  "device_ref": "sandbox-20130"
}
```

```json
{
  "session_id": "89b85dba-3fb2-4898-8c2c-639cade2c462",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjA0NSwiaWF0IjoxNzkzMjk1MTQ1LCJqdGkiOiI4YmZlNDA3YS0wYjk1LTQ2Y2EtYWI0Yi1hYzU1YTllMWFjYTgiLCJzaWQiOiI4OWI4NWRiYS0zZmIyLTQ4OTgtOGMyYy02MzljYWRlMmM0NjIifQ.3gvlJnt3qEjw0ETrM2-SDycccNnPZcTfgblVB75ppl0",
  "access_expires_at": "2026-10-29T17:47:25.136959534Z",
  "refresh_token": "2y0aIHAfhoQeE1NpQFVrflm4b3GTM_mxORzt9fUvxbc",
  "refresh_expires_at": "2026-11-28T17:32:25.136387017Z",
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
  "command_id": "541e829c-6f06-4690-b17f-82938d9d387f",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:32:25Z",
    "sequence": 1793295145676
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f567fdc8-0171-43e4-b90c-c4d45284dfb8",
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
  "last_heartbeat_at": "2026-10-29T17:32:25.697883Z",
  "last_location_at": "2026-10-29T17:32:25.697883Z",
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
  "command_id": "280146be-962b-46b4-8962-6d4e1ad04169",
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
  "effective_at": "2026-10-29T17:32:26.350208Z",
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T17:29:39.963234Z",
  "last_entries": [
    {
      "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T17:29:39.963234Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0bb45cdb-cf68-447a-b764-56909814e843",
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
  "id": "1fcb8692-f729-4f83-ac5e-8d4166eda62c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:26.990597Z",
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
  "command_id": "64459ee3-193c-4ee3-9b1b-00ea7eaeee37",
  "quote_id": "1fcb8692-f729-4f83-ac5e-8d4166eda62c",
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
    "phone": "+3806711113627"
  }
}
```

```json
{
  "id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
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
  "created_at": "2026-10-29T17:32:27.283805Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711113627"
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
    "id": "8626e5a1-5c17-467d-8e8c-b9da7b11fb2b",
    "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
    "expires_at": "2026-10-29T17:32:42.287651Z",
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

`POST /api/driver/v1/offers/8626e5a1-5c17-467d-8e8c-b9da7b11fb2b/accept` → **200**

```json
{
  "command_id": "9b9adc95-541b-466c-8da4-58ff892d458f"
}
```

```json
{
  "id": "b0e50738-1748-4ed9-8f4a-3339733f77ea",
  "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "2cc42be7-e78b-4dbd-8659-0cfcb89841fc",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "2cc42be7-e78b-4dbd-8659-0cfcb89841fc",
  "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
  "assignment_id": "b0e50738-1748-4ed9-8f4a-3339733f77ea",
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
    "phone": "+3806711113627"
  }
}
```

`POST /api/driver/v1/work-sessions/f567fdc8-0171-43e4-b90c-c4d45284dfb8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:32:28Z",
    "sequence": 1793295148414
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f567fdc8-0171-43e4-b90c-c4d45284dfb8",
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
  "last_heartbeat_at": "2026-10-29T17:32:28.432367Z",
  "last_location_at": "2026-10-29T17:32:28.432367Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/2cc42be7-e78b-4dbd-8659-0cfcb89841fc/arrive` → **200**

```json
{
  "command_id": "d7cd5946-eea1-4bbe-a2e3-55e5d6e76a2d",
  "expected_version": 0
}
```

```json
{
  "id": "2cc42be7-e78b-4dbd-8659-0cfcb89841fc",
  "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
  "assignment_id": "b0e50738-1748-4ed9-8f4a-3339733f77ea",
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
  "arrived_at": "2026-10-29T17:32:28.725154Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113627"
  }
}
```

`POST /api/driver/v1/trips/2cc42be7-e78b-4dbd-8659-0cfcb89841fc/start` → **200**

```json
{
  "command_id": "3ca442ef-6b73-4db5-a27b-a037c1d58613",
  "expected_version": 1
}
```

```json
{
  "id": "2cc42be7-e78b-4dbd-8659-0cfcb89841fc",
  "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
  "assignment_id": "b0e50738-1748-4ed9-8f4a-3339733f77ea",
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
  "arrived_at": "2026-10-29T17:32:28.725154Z",
  "started_at": "2026-10-29T17:32:29.024411Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711113627"
  }
}
```

`POST /api/driver/v1/trips/2cc42be7-e78b-4dbd-8659-0cfcb89841fc/complete` → **200**

```json
{
  "command_id": "e304780d-f69f-44fe-8949-66be9d5ad248",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:32:29Z",
  "cash_received": true
}
```

```json
{
  "id": "2cc42be7-e78b-4dbd-8659-0cfcb89841fc",
  "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
  "assignment_id": "b0e50738-1748-4ed9-8f4a-3339733f77ea",
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
  "arrived_at": "2026-10-29T17:32:28.725154Z",
  "started_at": "2026-10-29T17:32:29.024411Z",
  "completed_at": "2026-10-29T17:32:29.31712Z",
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
  "command_id": "c8bee5bc-4584-4256-83b6-f650991b81af",
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
  "id": "1261752e-f45d-438b-b1f7-964b3680a772",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:29.614216Z",
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
  "command_id": "73cb3c9f-7a69-439c-a670-1fdc3b02dcf5",
  "quote_id": "1261752e-f45d-438b-b1f7-964b3680a772",
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
    "phone": "+3806711120682"
  }
}
```

```json
{
  "id": "56682d13-975b-4362-a4e7-bb6cf9f23506",
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
  "created_at": "2026-10-29T17:32:29.91677Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120682"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/56682d13-975b-4362-a4e7-bb6cf9f23506` → **200**

```json
{
  "id": "56682d13-975b-4362-a4e7-bb6cf9f23506",
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
  "created_at": "2026-10-29T17:32:29.91677Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120682"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/56682d13-975b-4362-a4e7-bb6cf9f23506/cancel` → **200**

```json
{
  "command_id": "b9de5019-aa35-4e7c-8b79-b93f38d68c04",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "56682d13-975b-4362-a4e7-bb6cf9f23506",
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
  "created_at": "2026-10-29T17:32:29.91677Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711120682"
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
  "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T17:29:39.963234Z",
  "last_entries": [
    {
      "order_id": "56682d13-975b-4362-a4e7-bb6cf9f23506",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T17:32:30.56364Z"
    },
    {
      "order_id": "0229b6e2-9c88-4e4a-a548-335b92b250cd",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T17:32:29.32195Z"
    },
    {
      "order_id": "25630201-6eda-47be-b239-c10bde4a56ae",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T17:29:39.963234Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "f567fdc8-0171-43e4-b90c-c4d45284dfb8",
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
  "last_heartbeat_at": "2026-10-29T17:32:28.432367Z",
  "last_location_at": "2026-10-29T17:32:28.432367Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f567fdc8-0171-43e4-b90c-c4d45284dfb8/close` → **200**

```json
{
  "command_id": "79fc3642-020d-4ca4-a621-8113d0f2d6d3",
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

Done: operator bonus for fulfilled 0229b6e2-9c88-4e4a-a548-335b92b250cd and operator-fault cancellation 56682d13-975b-4362-a4e7-bb6cf9f23506.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380674599618",
  "device_ref": "sandbox-4413"
}
```

```json
{
  "challenge_id": "528459b6-0cc2-4fb2-9ab6-ba6e33385f25",
  "expires_at": "2026-10-29T17:37:34.96147363Z",
  "resend_available_at": "2026-10-29T17:32:35.96147363Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380674599618` → **200**

```json
{
  "phone": "+380674599618",
  "audience": "CLIENT",
  "code": "477645",
  "sent_at": "2026-10-29T17:32:34.964250875Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673152882",
  "device_ref": "sandbox-24967",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "339fe612-7994-49a7-8eed-89d0cc839bac",
  "expires_at": "2026-10-29T17:37:36.496408929Z",
  "resend_available_at": "2026-10-29T17:32:37.496408929Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673152882` → **200**

```json
{
  "phone": "+380673152882",
  "audience": "CLIENT",
  "code": "457899",
  "sent_at": "2026-10-29T17:32:36.49884036Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673152882",
  "device_ref": "sandbox-6541",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "a2aca592-e22a-42b6-9601-84f1f4cbd3ab",
  "expires_at": "2026-10-29T17:37:37.996758354Z",
  "resend_available_at": "2026-10-29T17:32:38.996758354Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380673152882` → **200**

```json
{
  "phone": "+380673152882",
  "audience": "CLIENT",
  "code": "901248",
  "sent_at": "2026-10-29T17:32:37.999735983Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672990000",
  "device_ref": "sandbox-30771"
}
```

```json
{
  "challenge_id": "79c0840a-6d37-4f48-9819-4807a38c22d8",
  "expires_at": "2026-10-29T17:37:39.50848079Z",
  "resend_available_at": "2026-10-29T17:32:40.50848079Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672990000",
  "device_ref": "sandbox-24454"
}
```

```json
{
  "challenge_id": "df4ef8de-55fb-4992-b8db-dfd3426f2e1f",
  "expires_at": "2026-10-29T17:37:40.990201479Z",
  "resend_available_at": "2026-10-29T17:32:41.990201479Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672990000` → **200**

```json
{
  "phone": "+380672990000",
  "audience": "CLIENT",
  "code": "424466",
  "sent_at": "2026-10-29T17:32:40.993194256Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672990000",
  "device_ref": "sandbox-4123",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "0a8c4838-b94c-48d7-9e92-30ab1aecec3e",
  "expires_at": "2026-10-29T17:37:42.504527011Z",
  "resend_available_at": "2026-10-29T17:32:43.504527011Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672990000` → **200**

```json
{
  "phone": "+380672990000",
  "audience": "CLIENT",
  "code": "450687",
  "sent_at": "2026-10-29T17:32:42.50734782Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380672990000",
  "device_ref": "sandbox-13093",
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
  "correlation_id": "9a85f2b1-59fc-4282-bfbc-2350c3c71dc7",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000008267"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "de7e8799-17d2-40fa-9605-4db0892597c5"
}
```

`GET /sandbox/v1/otp?phone=%2B442000008267` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120005183"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "bb98aa13-d3f2-41e0-a70d-3d1e73ce8465"
}
```

`GET /sandbox/v1/otp?phone=%2B37120005183` → **404**

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
  "session_id": "298d3952-dc8c-4e5a-8665-9084b08f14da",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwNjUsImlhdCI6MTc5MzI5NTE2NSwianRpIjoiZjY5MjdlNDItODdiMC00OWQ1LWFlYmYtMmRkNjg4ZDE4YzQ1Iiwic2lkIjoiMjk4ZDM5NTItZGM4Yy00ZTVhLTg2NjUtOTA4NGIwOGYxNGRhIn0.qyzO6lOLQY6rFudfChbfjUkYZ8CMLeygLDjS2-2VvQ4",
  "access_expires_at": "2026-10-29T17:47:45.234013432Z",
  "refresh_token": "Lj2Pl3r2VsQpLF7wxf67pvpTJSIduYJCQwADtrrrdWg",
  "refresh_expires_at": "2026-10-30T05:32:45.233432196Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672990000` → **200**

```json
{
  "deliveries": [
    {
      "id": "54420968-f0e5-4aac-9718-ba0295340713",
      "challenge_id": "0a8c4838-b94c-48d7-9e92-30ab1aecec3e",
      "phone": "+380672990000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c17c304a-a86c-422f-982c-184062d5940f",
      "error": null,
      "attempted_at": "2026-10-29T17:32:42.507819Z"
    },
    {
      "id": "4316804e-f655-41ee-8734-d906918bab9b",
      "challenge_id": "df4ef8de-55fb-4992-b8db-dfd3426f2e1f",
      "phone": "+380672990000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-dcad72c9-32c2-44b0-b9e5-4baec23bd30e",
      "error": null,
      "attempted_at": "2026-10-29T17:32:40.9937Z"
    },
    {
      "id": "f9c9b114-0136-4c48-9c3c-fad2f21c20f1",
      "challenge_id": "79c0840a-6d37-4f48-9819-4807a38c22d8",
      "phone": "+380672990000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T17:32:39.511243Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672990000` → **200**

```json
{
  "phone": "+380672990000",
  "audience": "CLIENT",
  "code": "450687",
  "sent_at": "2026-10-29T17:32:42.50734782Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380673152882` → **200**

```json
{
  "deliveries": [
    {
      "id": "20d4bcbc-2803-4a08-89d8-937053962055",
      "challenge_id": "a2aca592-e22a-42b6-9601-84f1f4cbd3ab",
      "phone": "+380673152882",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-c016ce22-5788-48fe-a2d3-4fefcf925759",
      "error": null,
      "attempted_at": "2026-10-29T17:32:38.000188Z"
    },
    {
      "id": "b7af981a-0c95-401d-8b7a-c21b1eff866c",
      "challenge_id": "339fe612-7994-49a7-8eed-89d0cc839bac",
      "phone": "+380673152882",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-fe54b1d2-7afd-4443-a77f-81da5c51f8a1",
      "error": null,
      "attempted_at": "2026-10-29T17:32:36.499101Z"
    }
  ]
}
```

Done: SMS to +380674599618; SMS then a call to +380673152882; a failed SMS, two calls and a refused third to +380672990000; +44 and +371 refused.

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
  "session_id": "444bd6a9-23e7-4c5c-bc41-c4bc04013912",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwNjYsImlhdCI6MTc5MzI5NTE2NiwianRpIjoiODEwZDAxZjAtNDAzZC00NWI2LThhYTItZGUwMTJkZWQ2MzE5Iiwic2lkIjoiNDQ0YmQ2YTktMjNlNy00YzVjLWJjNDEtYzRiYzA0MDEzOTEyIn0.83GJjGEDqH2vZbTIla6s8fYQXS1tLeY-DCerGmeB42Y",
  "access_expires_at": "2026-10-29T17:47:46.457733164Z",
  "refresh_token": "mDuI0mmpZdaU354dgtN5x_TI91wJcP6LVgruWxXqJd0",
  "refresh_expires_at": "2026-10-30T05:32:46.456915011Z",
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
  "session_id": "69ac459b-6f78-4c78-870b-1ddec1b9575f",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwNjcsImlhdCI6MTc5MzI5NTE2NywianRpIjoiYmNkN2U3YTgtNDBjYi00NDM0LTk3YzEtYTE1ZmZjY2Q4ZWNkIiwic2lkIjoiNjlhYzQ1OWItNmY3OC00Yzc4LTg3MGItMWRkZWMxYjk1NzVmIn0.HopSldZ5QZPCpRDzRAxMLl2FNF-NWJWurDYXknqKBAY",
  "access_expires_at": "2026-10-29T17:47:47.032248045Z",
  "refresh_token": "qpmH34FwxkWjRsaoC9f70OO3idMiyZQFqApi9uCvoZM",
  "refresh_expires_at": "2026-10-30T05:32:47.031682044Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
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

`POST /api/admin/v1/staff-extensions/6031a68f-bd3a-4b1c-bc89-91da3d8958c2` → **200**

```json
{
  "command_id": "9524e6d7-c500-4484-9742-b268da427390",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "4f4853a7-8807-43fa-814c-b298e3f75dfe",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T17:32:48.171433Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T17:32:48.171433Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "08d268e7-cd08-47cb-ac62-ad51b97ad9dd",
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
  "id": "7b6852a5-b6f9-4314-b691-b3e869c2503c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:37:48.754444Z",
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
  "command_id": "a07a8ceb-ae0d-4a54-a052-f0db97f40aa4",
  "quote_id": "7b6852a5-b6f9-4314-b691-b3e869c2503c",
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
    "phone": "+380673802735"
  }
}
```

```json
{
  "id": "d984e59d-30c6-4898-80e1-4921bf97fec1",
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
  "created_at": "2026-10-29T17:32:49.047515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673802735"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/d984e59d-30c6-4898-80e1-4921bf97fec1/calls` → **201**

```json
{
  "command_id": "4de53e25-30d0-4758-a24b-b11da867851d",
  "to": "CALLER"
}
```

```json
{
  "id": "59518ebd-9007-4e36-b71d-4b571322a816",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "order_ids": [
    "d984e59d-30c6-4898-80e1-4921bf97fec1"
  ],
  "started_at": "2026-10-29T17:32:49.38771Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/d984e59d-30c6-4898-80e1-4921bf97fec1/calls` → **201**

```json
{
  "command_id": "4de53e25-30d0-4758-a24b-b11da867851d",
  "to": "CALLER"
}
```

```json
{
  "id": "59518ebd-9007-4e36-b71d-4b571322a816",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "order_ids": [
    "d984e59d-30c6-4898-80e1-4921bf97fec1"
  ],
  "started_at": "2026-10-29T17:32:49.38771Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "59518ebd-9007-4e36-b71d-4b571322a816",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380673802735",
    "at": "2026-10-29T17:32:49.389933071Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "59518ebd-9007-4e36-b71d-4b571322a816",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.30754",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "59518ebd-9007-4e36-b71d-4b571322a816"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "59518ebd-9007-4e36-b71d-4b571322a816",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=d984e59d-30c6-4898-80e1-4921bf97fec1` → **200**

```json
{
  "calls": [
    {
      "id": "59518ebd-9007-4e36-b71d-4b571322a816",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [
        "d984e59d-30c6-4898-80e1-4921bf97fec1"
      ],
      "started_at": "2026-10-29T17:32:49.38771Z",
      "answered_at": "2026-10-29T17:32:50.05589Z",
      "ended_at": "2026-10-29T17:32:50.078025Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d984e59d-30c6-4898-80e1-4921bf97fec1` → **200**

```json
{
  "calls": [
    {
      "id": "59518ebd-9007-4e36-b71d-4b571322a816",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [
        "d984e59d-30c6-4898-80e1-4921bf97fec1"
      ],
      "started_at": "2026-10-29T17:32:49.38771Z",
      "answered_at": "2026-10-29T17:32:50.05589Z",
      "ended_at": "2026-10-29T17:32:50.078025Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d984e59d-30c6-4898-80e1-4921bf97fec1` → **200**

```json
{
  "calls": [
    {
      "id": "59518ebd-9007-4e36-b71d-4b571322a816",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [
        "d984e59d-30c6-4898-80e1-4921bf97fec1"
      ],
      "started_at": "2026-10-29T17:32:49.38771Z",
      "answered_at": "2026-10-29T17:32:50.05589Z",
      "ended_at": "2026-10-29T17:32:50.078025Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d984e59d-30c6-4898-80e1-4921bf97fec1` → **200**

```json
{
  "calls": [
    {
      "id": "59518ebd-9007-4e36-b71d-4b571322a816",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [
        "d984e59d-30c6-4898-80e1-4921bf97fec1"
      ],
      "started_at": "2026-10-29T17:32:49.38771Z",
      "answered_at": "2026-10-29T17:32:50.05589Z",
      "ended_at": "2026-10-29T17:32:50.078025Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=d984e59d-30c6-4898-80e1-4921bf97fec1` → **200**

```json
{
  "calls": [
    {
      "id": "59518ebd-9007-4e36-b71d-4b571322a816",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "order_ids": [
        "d984e59d-30c6-4898-80e1-4921bf97fec1"
      ],
      "started_at": "2026-10-29T17:32:49.38771Z",
      "answered_at": "2026-10-29T17:32:50.05589Z",
      "ended_at": "2026-10-29T17:32:50.078025Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T17:32:58.664764Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/d984e59d-30c6-4898-80e1-4921bf97fec1` → **200**

```json
{
  "id": "d984e59d-30c6-4898-80e1-4921bf97fec1",
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
  "created_at": "2026-10-29T17:32:49.047515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673802735"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/d984e59d-30c6-4898-80e1-4921bf97fec1/cancel` → **200**

```json
{
  "command_id": "0c7dd576-ce70-4e18-ada6-28bee12ddd12",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "d984e59d-30c6-4898-80e1-4921bf97fec1",
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
  "created_at": "2026-10-29T17:32:49.047515Z",
  "caller": {
    "name": "Caller",
    "phone": "+380673802735"
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
  "command_id": "19882ffe-cadf-4aac-86ef-a6803875ef25",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T17:33:00.209466Z",
  "extension": "101"
}
```

Done: outgoing call 59518ebd-9007-4e36-b71d-4b571322a816 from order d984e59d-30c6-4898-80e1-4921bf97fec1, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635138389",
  "device_ref": "sandbox-8901"
}
```

```json
{
  "challenge_id": "69f90fd3-3f98-415c-8175-5a73309c151e",
  "expires_at": "2026-10-29T17:38:00.503251582Z",
  "resend_available_at": "2026-10-29T17:33:01.503251582Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635138389` → **200**

```json
{
  "phone": "+380635138389",
  "audience": "CLIENT",
  "code": "782539",
  "sent_at": "2026-10-29T17:33:00.507115352Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "69f90fd3-3f98-415c-8175-5a73309c151e",
  "code": "782539",
  "device_ref": "sandbox-8901"
}
```

```json
{
  "session_id": "0d4b5561-acb4-4fd8-acc6-d238e310e564",
  "subject": {
    "type": "CLIENT",
    "id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmJiNTgyYS0zYzZhLTQxOTQtYjFiZS02ZjZmZjFjNjA0ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDgwLCJpYXQiOjE3OTMyOTUxODAsImp0aSI6IjUxYjA3MWEyLTI0MzktNDhlMC1hMGRiLWJlNzdkNGEyOWNjZiIsInNpZCI6IjBkNGI1NTYxLWFjYjQtNGZkOC1hY2M2LWQyMzhlMzEwZTU2NCJ9.9iH0T47pVyAd5juuvHAt1hWFEm3qDHPlVK_i8O7wRLg",
  "access_expires_at": "2026-10-29T17:48:00.826103942Z",
  "refresh_token": "A1NtuIORfQ9b39Er0r8vPfJNSJ5fvQ52aMtO_opP10w",
  "refresh_expires_at": "2026-11-28T17:33:00.82536169Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
  "session_id": "0d4b5561-acb4-4fd8-acc6-d238e310e564",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380635138389",
  "device_ref": "sandbox-12516"
}
```

```json
{
  "challenge_id": "55615865-b68a-402d-b4c9-b3ba58bf77da",
  "expires_at": "2026-10-29T17:38:03.388514108Z",
  "resend_available_at": "2026-10-29T17:33:04.388514108Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380635138389` → **200**

```json
{
  "phone": "+380635138389",
  "audience": "CLIENT",
  "code": "039882",
  "sent_at": "2026-10-29T17:33:03.390940297Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "55615865-b68a-402d-b4c9-b3ba58bf77da",
  "code": "039882",
  "device_ref": "sandbox-12516"
}
```

```json
{
  "session_id": "ce7c380b-5b36-49d4-a70c-a5def9b7a81e",
  "subject": {
    "type": "CLIENT",
    "id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmJiNTgyYS0zYzZhLTQxOTQtYjFiZS02ZjZmZjFjNjA0ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDgzLCJpYXQiOjE3OTMyOTUxODMsImp0aSI6IjdlMmFiMDliLTQ5MWYtNDc2NC1iYzQ5LTE0MzhlODdhNDcwOCIsInNpZCI6ImNlN2MzODBiLTViMzYtNDlkNC1hNzBjLWE1ZGVmOWI3YTgxZSJ9._hJEXgxp-qUXaHFqqlbI4qO2rkqjv9-lTMl-6xE8uzQ",
  "access_expires_at": "2026-10-29T17:48:03.699862463Z",
  "refresh_token": "edyZ8PPLxpbppNvlgQosx2Eu68f_KX3AJOMkF0Kk7XM",
  "refresh_expires_at": "2026-11-28T17:33:03.69927563Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "c4c949cc-257b-45ff-9c88-b2ce6b07c5bc",
  "expires_at": "2026-10-29T17:38:05.990734007Z",
  "resend_available_at": "2026-10-29T17:33:06.990734007Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380635138389` → **200**

```json
{
  "phone": "+380635138389",
  "audience": "CLIENT",
  "code": "750451",
  "sent_at": "2026-10-29T17:33:05.993091059Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380632416373"
}
```

```json
{
  "challenge_id": "d8c326db-b9fb-40a2-9a7a-d31f8bf5e55c",
  "expires_at": "2026-10-29T17:38:06.292726361Z",
  "resend_available_at": "2026-10-29T17:33:07.292726361Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632416373` → **200**

```json
{
  "phone": "+380632416373",
  "audience": "CLIENT",
  "code": "622812",
  "sent_at": "2026-10-29T17:33:06.294896746Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "c87fed92-99f7-473c-b00f-f96af79b88c4",
  "current_challenge_id": "c4c949cc-257b-45ff-9c88-b2ce6b07c5bc",
  "current_code": "000000",
  "new_challenge_id": "d8c326db-b9fb-40a2-9a7a-d31f8bf5e55c",
  "new_code": "622812"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "e8f6ba65-3ef9-47c7-a5aa-ed867fe484f8"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "31bf994c-0637-42d3-8347-9da8044d4703",
  "current_challenge_id": "c4c949cc-257b-45ff-9c88-b2ce6b07c5bc",
  "current_code": "750451",
  "new_challenge_id": "d8c326db-b9fb-40a2-9a7a-d31f8bf5e55c",
  "new_code": "622812"
}
```

```json
{
  "subject_id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
  "phone": "+380632416373",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
  "session_id": "0d4b5561-acb4-4fd8-acc6-d238e310e564",
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
  "correlation_id": "4d67c2db-3cdb-4aea-a727-ee61ce81cbdd"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380632416373",
  "device_ref": "sandbox-1090"
}
```

```json
{
  "challenge_id": "8a29d9a0-08f9-4d32-96d4-8d52004798ae",
  "expires_at": "2026-10-29T17:38:09.743674806Z",
  "resend_available_at": "2026-10-29T17:33:10.743674806Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632416373` → **200**

```json
{
  "phone": "+380632416373",
  "audience": "CLIENT",
  "code": "604008",
  "sent_at": "2026-10-29T17:33:09.746436525Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a29d9a0-08f9-4d32-96d4-8d52004798ae",
  "code": "604008",
  "device_ref": "sandbox-1090"
}
```

```json
{
  "session_id": "bee13a84-fa9b-435c-b7fc-adc154420ee6",
  "subject": {
    "type": "CLIENT",
    "id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmJiNTgyYS0zYzZhLTQxOTQtYjFiZS02ZjZmZjFjNjA0ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDkwLCJpYXQiOjE3OTMyOTUxOTAsImp0aSI6IjU5NTE3YzRhLWJkMmQtNGJkNS05NDAyLTU3ZWYwMzA4NjQ2MCIsInNpZCI6ImJlZTEzYTg0LWZhOWItNDM1Yy1iN2ZjLWFkYzE1NDQyMGVlNiJ9.cG0qOjnL6XE2-jMYPkgT78Zg8WSHeLdt6saLC7JPbDw",
  "access_expires_at": "2026-10-29T17:48:10.05077199Z",
  "refresh_token": "eec-Wd7PhLTFC-TTgUbxsTwrUagVvtLVYYhscKqffCM",
  "refresh_expires_at": "2026-11-28T17:33:10.050196362Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
  "session_id": "bee13a84-fa9b-435c-b7fc-adc154420ee6",
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
  "session_id": "8d7d5a19-2011-45da-a059-9b3dced24511",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwOTAsImlhdCI6MTc5MzI5NTE5MCwianRpIjoiYmVjZjA4YWMtNjQ4MS00Njg4LThmOTctY2YxYmM3OWE4OGE2Iiwic2lkIjoiOGQ3ZDVhMTktMjAxMS00NWRhLWEwNTktOWIzZGNlZDI0NTExIn0.PNOWx9uEtPFp9H8Yn10o2Ur4T1nPth1Jx7UFNyMS12A",
  "access_expires_at": "2026-10-29T17:48:10.907298212Z",
  "refresh_token": "B1HAnqpf7KVz6XMkRFx4yGtq01ruHskXjL8COfTD_LQ",
  "refresh_expires_at": "2026-10-30T05:33:10.906790376Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4` → **200**

```json
{
  "client": {
    "id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
    "phone": "+380632416373",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T17:33:00.823758Z",
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

`POST /api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4/phone/new-code` → **201**

```json
{
  "phone": "+380633751531"
}
```

```json
{
  "challenge_id": "3d896cc2-1ac7-4223-8804-ee19ad03870a",
  "expires_at": "2026-10-29T17:38:11.504082597Z",
  "resend_available_at": "2026-10-29T17:33:12.504082597Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380633751531` → **200**

```json
{
  "phone": "+380633751531",
  "audience": "CLIENT",
  "code": "790412",
  "sent_at": "2026-10-29T17:33:11.506750975Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4/phone` → **422**

```json
{
  "command_id": "e44735bc-d47a-4039-8252-1550f76bd291",
  "expected_version": 3,
  "new_challenge_id": "3d896cc2-1ac7-4223-8804-ee19ad03870a",
  "new_code": "790413",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "79fbfb7c-0f2b-4583-816f-624651cdf4e5"
}
```

`POST /api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4/phone` → **400**

```json
{
  "command_id": "fa2ea525-8e2f-46dc-8793-7113e5068d0e",
  "expected_version": 3,
  "new_challenge_id": "3d896cc2-1ac7-4223-8804-ee19ad03870a",
  "new_code": "790412",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9aaa7f0b-985d-4ce2-b671-761c93ec82fd",
  "field_errors": [
    {
      "field": "reason",
      "code": "NotBlank"
    }
  ]
}
```

`POST /api/admin/v1/clients/0fbb582a-3c6a-4194-b1be-6f6ff1c604e4/phone` → **200**

```json
{
  "command_id": "e15858d3-42e7-4745-8b12-4c6e76b6a510",
  "expected_version": 3,
  "new_challenge_id": "3d896cc2-1ac7-4223-8804-ee19ad03870a",
  "new_code": "790412",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
  "phone": "+380633751531",
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
  "correlation_id": "84c7cb4e-86e3-49d1-a4f2-156a89e139f9"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633751531",
  "device_ref": "sandbox-4066"
}
```

```json
{
  "challenge_id": "f6ea3047-565d-40cc-821f-d4e00a06747d",
  "expires_at": "2026-10-29T17:38:12.953604887Z",
  "resend_available_at": "2026-10-29T17:33:13.953604887Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633751531` → **200**

```json
{
  "phone": "+380633751531",
  "audience": "CLIENT",
  "code": "848326",
  "sent_at": "2026-10-29T17:33:12.957520746Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6ea3047-565d-40cc-821f-d4e00a06747d",
  "code": "848326",
  "device_ref": "sandbox-4066"
}
```

```json
{
  "session_id": "7c7ef03a-7b4d-4542-95e5-f3176c854b85",
  "subject": {
    "type": "CLIENT",
    "id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwZmJiNTgyYS0zYzZhLTQxOTQtYjFiZS02ZjZmZjFjNjA0ZTQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDkzLCJpYXQiOjE3OTMyOTUxOTMsImp0aSI6IjMxZTBkOTgzLTdlNzgtNDZiMC1iNGM1LTY0YTViNzUzMmI2YyIsInNpZCI6IjdjN2VmMDNhLTdiNGQtNDU0Mi05NWU1LWYzMTc2Yzg1NGI4NSJ9.ImrPmB1UUHYKCx9SlQEMeWa6v2Hj64Rs-z2gsIkfb0k",
  "access_expires_at": "2026-10-29T17:48:13.257330585Z",
  "refresh_token": "3sTSCldFnRuAv8ENqe-1OXZWfOz-IvH5wv0ILlwkXyI",
  "refresh_expires_at": "2026-11-28T17:33:13.256781372Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "0fbb582a-3c6a-4194-b1be-6f6ff1c604e4",
  "session_id": "7c7ef03a-7b4d-4542-95e5-f3176c854b85",
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
  "phone": "+380636731475",
  "device_ref": "sandbox-15127"
}
```

```json
{
  "challenge_id": "a79a92bf-f224-4460-9b97-1588c0e7c58b",
  "expires_at": "2026-10-29T17:38:13.818071344Z",
  "resend_available_at": "2026-10-29T17:33:14.818071344Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380636731475` → **200**

```json
{
  "phone": "+380636731475",
  "audience": "CLIENT",
  "code": "801059",
  "sent_at": "2026-10-29T17:33:13.8207851Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a79a92bf-f224-4460-9b97-1588c0e7c58b",
  "code": "801059",
  "device_ref": "sandbox-15127"
}
```

```json
{
  "session_id": "f50cc81a-3b0a-4dea-b9a7-a04351a03ac2",
  "subject": {
    "type": "CLIENT",
    "id": "7bf435cd-2693-4623-ba3d-423121fd26ba"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YmY0MzVjZC0yNjkzLTQ2MjMtYmEzZC00MjMxMjFmZDI2YmEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDk0LCJpYXQiOjE3OTMyOTUxOTQsImp0aSI6IjZlNWNiM2Q0LTJmNDItNDlkNi05Mjk0LWNlNDVlMTk4ZDNhNSIsInNpZCI6ImY1MGNjODFhLTNiMGEtNGRlYS1iOWE3LWEwNDM1MWEwM2FjMiJ9.s8NlxNG5vdThZpF8EnMRCLHLa-gp83Kxp__c6K_AmBE",
  "access_expires_at": "2026-10-29T17:48:14.125488993Z",
  "refresh_token": "v-seEsIlGPASLJHNCqZNT5PyffrP5ttBcsnkBDozUQk",
  "refresh_expires_at": "2026-11-28T17:33:14.124960298Z",
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
  "session_id": "a0bdce8a-5678-4e42-8931-ebe3b5a4ac1d",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwOTUsImlhdCI6MTc5MzI5NTE5NSwianRpIjoiZGQzNGEyNzQtMTY0ZS00NDk4LTllYzMtODc2NzBlMTg1OTQ1Iiwic2lkIjoiYTBiZGNlOGEtNTY3OC00ZTQyLTg5MzEtZWJlM2I1YTRhYzFkIn0.gWc-bXHPCnyXzxG3uOiPCf9LfmcdGviojrVfGgryb8k",
  "access_expires_at": "2026-10-29T17:48:15.296375268Z",
  "refresh_token": "DLDmcXGb8nRKxZYzK47NFnvppcv4En9cvIDpN1-Uy7w",
  "refresh_expires_at": "2026-10-30T05:33:15.295868103Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380636731475` → **200**

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
  "correlation_id": "60537c36-9020-4266-980a-3d1b54d78d20"
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
  "session_id": "236cac91-817c-4bac-8d09-16b47359a6f6",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYwOTYsImlhdCI6MTc5MzI5NTE5NiwianRpIjoiMzliMmEyM2EtMzZjMi00MzU5LTg3YmUtNzU5ZWFlNzE5ODY4Iiwic2lkIjoiMjM2Y2FjOTEtODE3Yy00YmFjLThkMDktMTZiNDczNTlhNmY2In0.G2t7THcFfaO2dXegZbg62nA2v0XBh66WkLLHz0AQzWU",
  "access_expires_at": "2026-10-29T17:48:16.459326635Z",
  "refresh_token": "Z9Q5UNdyvj7tEKVUf8cQU7cjPahpYCnc9buRo6Oy5NQ",
  "refresh_expires_at": "2026-10-30T05:33:16.458770905Z",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T17:29:06.813987Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "9a55a075-828d-40c6-a6be-d9b9d4fb444c",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T17:33:17.041801874Z"
}
```

## The rider books the airport for 2026-10-29T20:33:16Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600565308",
  "device_ref": "sandbox-25073"
}
```

```json
{
  "challenge_id": "6594b308-25c3-43e8-b77f-3606191d3c10",
  "expires_at": "2026-10-29T17:38:17.339725895Z",
  "resend_available_at": "2026-10-29T17:33:18.339725895Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600565308` → **200**

```json
{
  "phone": "+48600565308",
  "audience": "CLIENT",
  "code": "033765",
  "sent_at": "2026-10-29T17:33:17.342472373Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6594b308-25c3-43e8-b77f-3606191d3c10",
  "code": "033765",
  "device_ref": "sandbox-25073"
}
```

```json
{
  "session_id": "087d403f-8e2a-4d51-b64b-a82526116b39",
  "subject": {
    "type": "CLIENT",
    "id": "f8a896ba-9bf5-42b5-a20d-c78363be2a34"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmOGE4OTZiYS05YmY1LTQyYjUtYTIwZC1jNzgzNjNiZTJhMzQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MDk3LCJpYXQiOjE3OTMyOTUxOTcsImp0aSI6Ijg5YWFhNzZiLWFlMDEtNDA1MC1hN2U0LWQwYTQ5NzQ0OTg5ZCIsInNpZCI6IjA4N2Q0MDNmLThlMmEtNGQ1MS1iNjRiLWE4MjUyNjExNmIzOSJ9.8w1eLm_E1TbDwMNkrJfBMztN-Y3F1w0ZlDd8beXwbNI",
  "access_expires_at": "2026-10-29T17:48:17.649553561Z",
  "refresh_token": "aX1Ri5KrA5XfdkNpahajzQfQWo3s1UU7QpbmlAa6PjM",
  "refresh_expires_at": "2026-11-28T17:33:17.649055112Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "671332e8-7e07-4080-8f9b-9ce57786b693",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T20:33:16Z"
}
```

```json
{
  "id": "1d11d9a7-ffac-4add-ab5b-092a273b9cbf",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:38:17.946481Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T20:33:16Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "9dec3618-7c94-4474-9615-5b48251df005",
  "quote_id": "1d11d9a7-ffac-4add-ab5b-092a273b9cbf",
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
  "pickup_at": "2026-10-29T20:33:16Z"
}
```

```json
{
  "id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "f8a896ba-9bf5-42b5-a20d-c78363be2a34",
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
  "created_at": "2026-10-29T17:33:18.24543Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T20:33:16Z",
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
  "device_ref": "sandbox-11962"
}
```

```json
{
  "challenge_id": "47d32fd7-b576-41ac-a6fd-ba24e9a9a113",
  "expires_at": "2026-10-29T17:38:18.551853247Z",
  "resend_available_at": "2026-10-29T17:33:19.551853247Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "031625",
  "sent_at": "2026-10-29T17:33:18.554731861Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "47d32fd7-b576-41ac-a6fd-ba24e9a9a113",
  "code": "031625",
  "device_ref": "sandbox-11962"
}
```

```json
{
  "session_id": "75479334-0169-42fe-9264-4e461b25a342",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjA5OCwiaWF0IjoxNzkzMjk1MTk4LCJqdGkiOiI2YWQ2OTYzNC0yYzkwLTQ0YjktOTcxZi0yOTc2OTUyNmFkZWIiLCJzaWQiOiI3NTQ3OTMzNC0wMTY5LTQyZmUtOTI2NC00ZTQ2MWIyNWEzNDIifQ.4kxdK1lVI4En-pcUZnuSROJuPjuMP_IZOlt2YgaQ0aY",
  "access_expires_at": "2026-10-29T17:48:18.873305763Z",
  "refresh_token": "CmHSTrV5w_jMUvxdcr9-wjbPcv7g1y-tojwr1b0SFc8",
  "refresh_expires_at": "2026-11-28T17:33:18.872784291Z",
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
  "command_id": "c97b86b4-fb0e-47f7-b1c4-1198890effe5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:33:19Z",
    "sequence": 1793295199432
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8a582658-90bd-46f0-82fd-2fb1174e22be",
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
  "last_heartbeat_at": "2026-10-29T17:33:19.451045Z",
  "last_location_at": "2026-10-29T17:33:19.451045Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
      "short_number": 24,
      "pickup_at": "2026-10-29T20:33:16Z",
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

`POST /api/driver/v1/preorders/4800d322-6f08-460e-9f4c-97ba2ca554e5/reserve` → **200**

```json
{
  "command_id": "d055f863-658d-4168-8ebe-b500128f5746"
}
```

```json
{
  "id": "6a864af9-7df4-4d15-85f4-bafb6cd8c98a",
  "state": "RESERVED",
  "order": {
    "order_id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
    "short_number": 24,
    "pickup_at": "2026-10-29T20:33:16Z",
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
  "reserved_at": "2026-10-29T17:33:20.017832Z",
  "confirm_from": "2026-10-29T20:03:16Z",
  "confirm_until": "2026-10-29T20:13:16Z",
  "drop_until": "2026-10-29T19:33:16Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "6a864af9-7df4-4d15-85f4-bafb6cd8c98a",
      "state": "RESERVED",
      "order": {
        "order_id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
        "short_number": 24,
        "pickup_at": "2026-10-29T20:33:16Z",
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
      "reserved_at": "2026-10-29T17:33:20.017832Z",
      "confirm_from": "2026-10-29T20:03:16Z",
      "confirm_until": "2026-10-29T20:13:16Z",
      "drop_until": "2026-10-29T19:33:16Z"
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
      "id": "6a864af9-7df4-4d15-85f4-bafb6cd8c98a",
      "state": "RESERVED",
      "order": {
        "order_id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
        "short_number": 24,
        "pickup_at": "2026-10-29T20:33:16Z",
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
      "reserved_at": "2026-10-29T17:33:20.017832Z",
      "confirm_from": "2026-10-29T20:03:16Z",
      "confirm_until": "2026-10-29T20:13:16Z",
      "drop_until": "2026-10-29T19:33:16Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/6a864af9-7df4-4d15-85f4-bafb6cd8c98a/confirm` → **409**

```json
{
  "command_id": "bdcf5181-37a1-4f7d-897b-c763513bbdbb"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/6a864af9-7df4-4d15-85f4-bafb6cd8c98a/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a651daad-6ce9-451d-b547-e2c80b0c06a4"
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
  "session_id": "d68aa2ff-ded5-4dd1-b717-7bc946bc4899",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMDEsImlhdCI6MTc5MzI5NTIwMSwianRpIjoiMmJkMmZmMWQtYTM0NC00OGM0LThmNjAtYWJiNGI5YmQzODUxIiwic2lkIjoiZDY4YWEyZmYtZGVkNS00ZGQxLWI3MTctN2JjOTQ2YmM0ODk5In0.1qX4KLAs7bjaNGTu8xm-7vpzjt5yqT_iC5ffU6xf15Q",
  "access_expires_at": "2026-10-29T17:48:21.470501788Z",
  "refresh_token": "12Q-4vfDP6jYF8z_uvV3lOasc-xdvlf9AG0cW0m2W0k",
  "refresh_expires_at": "2026-10-30T05:33:21.469996923Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/4800d322-6f08-460e-9f4c-97ba2ca554e5` → **200**

```json
{
  "id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "f8a896ba-9bf5-42b5-a20d-c78363be2a34",
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
  "created_at": "2026-10-29T17:33:18.24543Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T20:33:16Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "6a864af9-7df4-4d15-85f4-bafb6cd8c98a",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T17:33:20.017832Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/4800d322-6f08-460e-9f4c-97ba2ca554e5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T17:33:18.246535Z",
      "actor": {
        "type": "CLIENT",
        "id": "f8a896ba-9bf5-42b5-a20d-c78363be2a34",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
        "preorder": true,
        "quote_id": "1d11d9a7-ffac-4add-ab5b-092a273b9cbf",
        "pickup_at": "2026-10-29T20:33:16Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "9054e8d0-c059-44d5-a394-3b1d2a2d4ca9"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T17:33:20.018952Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "4800d322-6f08-460e-9f4c-97ba2ca554e5",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "6a864af9-7df4-4d15-85f4-bafb6cd8c98a"
      },
      "correlation_id": "07082d3a-95bb-4732-847d-36855ee79e8a"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order 4800d322-6f08-460e-9f4c-97ba2ca554e5, reservation 6a864af9-7df4-4d15-85f4-bafb6cd8c98a.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-13122"
}
```

```json
{
  "challenge_id": "a474593d-0787-4b56-a8ae-fe773404da62",
  "expires_at": "2026-10-29T17:38:22.347664376Z",
  "resend_available_at": "2026-10-29T17:33:23.347664376Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "900324",
  "sent_at": "2026-10-29T17:33:22.350497758Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a474593d-0787-4b56-a8ae-fe773404da62",
  "code": "900324",
  "device_ref": "sandbox-13122"
}
```

```json
{
  "session_id": "90eb2d0b-223b-49d2-9d3f-1d4a74dd7d4e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjEwMiwiaWF0IjoxNzkzMjk1MjAyLCJqdGkiOiI3YzViNDEwOS02YTA4LTQ3YjktYWZiZi0xNWU0Y2ZhOGNmYWIiLCJzaWQiOiI5MGViMmQwYi0yMjNiLTQ5ZDItOWQzZi0xZDRhNzRkZDdkNGUifQ.XvLTbj5dYUJGRpIF7r1aiGrGDPIcttVqCSeIkC4hg64",
  "access_expires_at": "2026-10-29T17:48:22.648287724Z",
  "refresh_token": "1iFQHeRne_emmJVWGgm2iryKhvz4dxQtI3GNaLp9Ulw",
  "refresh_expires_at": "2026-11-28T17:33:22.647782232Z",
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
  "command_id": "5d493a56-d167-4fb6-b1f6-f22390cd45ad",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:33:23Z",
    "sequence": 1793295203211
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:33:23.229908Z",
  "last_location_at": "2026-10-29T17:33:23.229908Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670200224",
  "device_ref": "sandbox-9933"
}
```

```json
{
  "challenge_id": "a3d21647-e27d-4f3b-ad81-bf1f30aa3ec9",
  "expires_at": "2026-10-29T17:38:23.512546969Z",
  "resend_available_at": "2026-10-29T17:33:24.512546969Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670200224` → **200**

```json
{
  "phone": "+380670200224",
  "audience": "CLIENT",
  "code": "175374",
  "sent_at": "2026-10-29T17:33:23.515225146Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a3d21647-e27d-4f3b-ad81-bf1f30aa3ec9",
  "code": "175374",
  "device_ref": "sandbox-9933"
}
```

```json
{
  "session_id": "c5e5448d-a868-427b-b885-b68959ea10d2",
  "subject": {
    "type": "CLIENT",
    "id": "adf60174-49cc-405a-8e9d-bcca02852270"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZGY2MDE3NC00OWNjLTQwNWEtOGU5ZC1iY2NhMDI4NTIyNzAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MTAzLCJpYXQiOjE3OTMyOTUyMDMsImp0aSI6IjNlZDg1ZmMzLTYwOGMtNDEzNC1hODM2LTljNTk4ZDcwNzZhMCIsInNpZCI6ImM1ZTU0NDhkLWE4NjgtNDI3Yi1iODg1LWI2ODk1OWVhMTBkMiJ9.h487b05YowYe5kYFCWV2nW1cdBZYfsu_ybkKAovbqJA",
  "access_expires_at": "2026-10-29T17:48:23.829994383Z",
  "refresh_token": "q0CQvPZx-U0uhRFCfcc8ursP7uKGgbjPpZE2VvDwpUk",
  "refresh_expires_at": "2026-11-28T17:33:23.829293938Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7fcf219a-75e8-4fc9-9993-51f5ff5b39b0",
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
  "id": "550c4954-de11-4c70-8405-7ba95c9ff69e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:38:24.127986Z",
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
  "command_id": "3b7a94e8-f04b-4538-894a-171b7c1b35d5",
  "quote_id": "550c4954-de11-4c70-8405-7ba95c9ff69e",
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
  "id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "adf60174-49cc-405a-8e9d-bcca02852270",
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
  "created_at": "2026-10-29T17:33:24.424449Z",
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
    "id": "9b04fa47-5615-4359-92d3-9fc44e42b0e2",
    "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
    "expires_at": "2026-10-29T17:33:39.427598Z",
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

`POST /api/driver/v1/offers/9b04fa47-5615-4359-92d3-9fc44e42b0e2/accept` → **200**

```json
{
  "command_id": "09740cef-1874-4500-8c78-eb0c84b6b48b"
}
```

```json
{
  "id": "02eb059d-f749-4812-abf3-094c18a35d0b",
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "3fb3f40d-0526-4dea-ba65-74bd0449d77d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3fb3f40d-0526-4dea-ba65-74bd0449d77d",
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "assignment_id": "02eb059d-f749-4812-abf3-094c18a35d0b",
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

`POST /api/driver/v1/work-sessions/e1a8d918-e40f-42e1-86ab-20fe796eb9f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:33:25Z",
    "sequence": 1793295205591
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:33:25.610058Z",
  "last_location_at": "2026-10-29T17:33:25.610058Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "3fb3f40d-0526-4dea-ba65-74bd0449d77d",
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "assignment_id": "02eb059d-f749-4812-abf3-094c18a35d0b",
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

`POST /api/driver/v1/trips/3fb3f40d-0526-4dea-ba65-74bd0449d77d/arrive` → **200**

```json
{
  "command_id": "ce7a3aab-c535-4924-b181-659ccdca7b73",
  "expected_version": 0
}
```

```json
{
  "id": "3fb3f40d-0526-4dea-ba65-74bd0449d77d",
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "assignment_id": "02eb059d-f749-4812-abf3-094c18a35d0b",
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
  "arrived_at": "2026-10-29T17:33:26.217978Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/3fb3f40d-0526-4dea-ba65-74bd0449d77d/start` → **200**

```json
{
  "command_id": "3344ba8f-8222-4ac6-b494-7551d35e429b",
  "expected_version": 1
}
```

```json
{
  "id": "3fb3f40d-0526-4dea-ba65-74bd0449d77d",
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "assignment_id": "02eb059d-f749-4812-abf3-094c18a35d0b",
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
  "arrived_at": "2026-10-29T17:33:26.217978Z",
  "started_at": "2026-10-29T17:33:26.554424Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/e1a8d918-e40f-42e1-86ab-20fe796eb9f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:33:26Z",
    "sequence": 1793295206872
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:33:26.891641Z",
  "last_location_at": "2026-10-29T17:33:26.891641Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/3fb3f40d-0526-4dea-ba65-74bd0449d77d/complete` → **200**

```json
{
  "command_id": "b95ddcc0-495b-44ab-9618-18eb9f807e05",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:33:27Z",
  "cash_received": true
}
```

```json
{
  "id": "3fb3f40d-0526-4dea-ba65-74bd0449d77d",
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "assignment_id": "02eb059d-f749-4812-abf3-094c18a35d0b",
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
  "arrived_at": "2026-10-29T17:33:26.217978Z",
  "started_at": "2026-10-29T17:33:26.554424Z",
  "completed_at": "2026-10-29T17:33:27.180828Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/7f1a9e3a-6176-4a21-be24-5e84f5f31c65/rating` → **200**

```json
{
  "command_id": "bf3ec4e3-b181-454c-b6e4-7298bb789345",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "score": 5,
  "created_at": "2026-10-29T17:33:27.515706835Z"
}
```

`POST /api/driver/v1/orders/7f1a9e3a-6176-4a21-be24-5e84f5f31c65/rating` → **200**

```json
{
  "command_id": "4e06f035-2239-4eda-80b3-b0189e6e2f40",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
  "score": 4,
  "created_at": "2026-10-29T17:33:27.806088709Z"
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
  "session_id": "639195ff-4fd4-4f84-a90e-27e60f6473f3",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMDgsImlhdCI6MTc5MzI5NTIwOCwianRpIjoiOGRiNzBlN2UtYTMyOC00NzQwLWI0NGUtMWY2ODgyZWUwNTA5Iiwic2lkIjoiNjM5MTk1ZmYtNGZkNC00Zjg0LWE5MGUtMjdlNjBmNjQ3M2YzIn0.f7DTeB-BhmHrOaDwbDWWv5Mf96tEDz2AGILN-EVtWO0",
  "access_expires_at": "2026-10-29T17:48:28.68704143Z",
  "refresh_token": "N6IVMRW7wEDDH_7_8jhbzbvoCMQJraN6oYpJE7rMWQg",
  "refresh_expires_at": "2026-10-30T05:33:28.686478201Z",
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
  "session_id": "e1976714-df78-43a5-8648-1ac9f91653d6",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMDksImlhdCI6MTc5MzI5NTIwOSwianRpIjoiNmI4OWU3MjQtMmRhMi00OTEwLWJjMGQtMDM2ZDgzYjcyNWNjIiwic2lkIjoiZTE5NzY3MTQtZGY3OC00M2E1LTg2NDgtMWFjOWY5MTY1M2Q2In0.5NfNHVwuID0NQcPJ7028RiOn1Sp88k603rkavM1RKhc",
  "access_expires_at": "2026-10-29T17:48:29.26728342Z",
  "refresh_token": "Vn6tHxTmvTjQlZGdFLAD45_RYrN0m_0diWDXl5H7ons",
  "refresh_expires_at": "2026-10-30T05:33:29.266724438Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/7f1a9e3a-6176-4a21-be24-5e84f5f31c65/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
      "author_type": "RIDER",
      "author_id": "adf60174-49cc-405a-8e9d-bcca02852270",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T17:33:27.515707Z"
    },
    {
      "order_id": "7f1a9e3a-6176-4a21-be24-5e84f5f31c65",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "adf60174-49cc-405a-8e9d-bcca02852270",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T17:33:27.806089Z"
    }
  ]
}
```

Done: ratings for order 7f1a9e3a-6176-4a21-be24-5e84f5f31c65.

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
  "session_id": "4da04f74-53d1-4956-80ca-b722a0b0661b",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMTAsImlhdCI6MTc5MzI5NTIxMCwianRpIjoiZTAwYmJmOGMtNTYzZC00OTJmLWIwZjMtNjliNjU3YTVkZjBkIiwic2lkIjoiNGRhMDRmNzQtNTNkMS00OTU2LTgwY2EtYjcyMmEwYjA2NjFiIn0.92s4CD5FpNiPCOG0lkZw57un5DmxVWlvbIV9wXw1u2c",
  "access_expires_at": "2026-10-29T17:48:30.130888846Z",
  "refresh_token": "xSm38A9ZfkrDFffCldcqM7QSCrzFG6vE0DytFKwm7Qc",
  "refresh_expires_at": "2026-10-30T05:33:30.130310879Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "11308c11-94c0-479e-b042-15f5671c376e",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "29437b77-de7f-4d72-84c0-aa14f5128e15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:30.413433Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29437b77-de7f-4d72-84c0-aa14f5128e15` → **200**

```json
{
  "id": "29437b77-de7f-4d72-84c0-aa14f5128e15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:30.413433Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29437b77-de7f-4d72-84c0-aa14f5128e15` → **200**

```json
{
  "id": "29437b77-de7f-4d72-84c0-aa14f5128e15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:30.413433Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29437b77-de7f-4d72-84c0-aa14f5128e15` → **200**

```json
{
  "id": "29437b77-de7f-4d72-84c0-aa14f5128e15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:30.413433Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/29437b77-de7f-4d72-84c0-aa14f5128e15` → **200**

```json
{
  "id": "29437b77-de7f-4d72-84c0-aa14f5128e15",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T17:33:30.413433Z",
  "ready_at": "2026-10-29T17:33:33.708507Z",
  "expires_at": "2026-10-30T17:33:33.708507Z"
}
```

`GET /api/admin/v1/reports/exports/29437b77-de7f-4d72-84c0-aa14f5128e15/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "da55ca90-a05c-4ac5-9f25-17ab367afef3",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "f4244908-987b-456d-8df2-8836116ba7e1",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:34.857983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4244908-987b-456d-8df2-8836116ba7e1` → **200**

```json
{
  "id": "f4244908-987b-456d-8df2-8836116ba7e1",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:34.857983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4244908-987b-456d-8df2-8836116ba7e1` → **200**

```json
{
  "id": "f4244908-987b-456d-8df2-8836116ba7e1",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:34.857983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4244908-987b-456d-8df2-8836116ba7e1` → **200**

```json
{
  "id": "f4244908-987b-456d-8df2-8836116ba7e1",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T17:33:34.857983Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/f4244908-987b-456d-8df2-8836116ba7e1` → **200**

```json
{
  "id": "f4244908-987b-456d-8df2-8836116ba7e1",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T17:33:34.857983Z",
  "ready_at": "2026-10-29T17:33:38.715776Z",
  "expires_at": "2026-10-30T17:33:38.715776Z"
}
```

`GET /api/admin/v1/reports/exports/f4244908-987b-456d-8df2-8836116ba7e1/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/d6caee54-6b98-4362-9d42-ff8fe95e5f8e` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/d6caee54-6b98-4362-9d42-ff8fe95e5f8e",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "310091ac-42b5-4b1a-a7b8-e1cf95c7a4ad"
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
  "device_ref": "sandbox-30955"
}
```

```json
{
  "challenge_id": "b938119d-ec3f-45ff-bb35-00a34720a8ea",
  "expires_at": "2026-10-29T17:38:39.600622046Z",
  "resend_available_at": "2026-10-29T17:33:40.600622046Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "845685",
  "sent_at": "2026-10-29T17:33:39.603520723Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "b938119d-ec3f-45ff-bb35-00a34720a8ea",
  "code": "845685",
  "device_ref": "sandbox-30955"
}
```

```json
{
  "session_id": "6c62f9b2-1d06-442a-af31-8eb61451d02b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjExOSwiaWF0IjoxNzkzMjk1MjE5LCJqdGkiOiJmODM4YzEyOS1mYjQzLTRhZTYtODQyNC1iMGQwNWUwNDQ4ZDEiLCJzaWQiOiI2YzYyZjliMi0xZDA2LTQ0MmEtYWYzMS04ZWI2MTQ1MWQwMmIifQ.8ezi-5MBj3z9V_58Kn_JphdbH893OX-Xth5xmKJ8Wdc",
  "access_expires_at": "2026-10-29T17:48:39.909529731Z",
  "refresh_token": "vdmdn0QOVsMJrFN-0T-z2qjVETETx80aLLfYwV_HV3I",
  "refresh_expires_at": "2026-11-28T17:33:39.908890991Z",
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
  "command_id": "ae7b5d21-1bd1-4006-b66f-d3e9c18155f8",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:33:40Z",
    "sequence": 1793295220745
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "cec8f5c0-a3c1-4a61-8ff2-3cff2dd36d1c",
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
  "last_heartbeat_at": "2026-10-29T17:33:40.764109Z",
  "last_location_at": "2026-10-29T17:33:40.764109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "8bb31d09-a14a-4ddb-8972-4b671b9e5a73",
  "points": [
    {
      "sequence": 1793295223537,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T17:32:43Z"
    },
    {
      "sequence": 1793295223610,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T17:33:43Z"
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
  "session_id": "fc84438b-d56e-4d84-b419-e423a3c8785b",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMjMsImlhdCI6MTc5MzI5NTIyMywianRpIjoiNzUwNzVmN2YtNjUxNi00YTA4LWE4OTEtZGIyYjgzNjdlNTYyIiwic2lkIjoiZmM4NDQzOGItZDU2ZS00ZDg0LWI0MTktZTQyM2EzYzg3ODViIn0.Yd_LXHFqQ81RYu36NiqYC9e2FaGA7jqOeyXxMVnDONc",
  "access_expires_at": "2026-10-29T17:48:43.67524849Z",
  "refresh_token": "sT_2yrluZNe_59DPX-7B8DTzK6HCFsRuNKeu8BfqEh8",
  "refresh_expires_at": "2026-10-30T05:33:43.674745818Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "e7c81d45-c843-4630-8a55-143fc3e6b6d3",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T17:33:43Z",
        "track_point_id": "ea6a50d9-ec2f-47ed-a831-de2a84d2c305",
        "work_session_id": "cec8f5c0-a3c1-4a61-8ff2-3cff2dd36d1c"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T17:33:43Z",
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

`POST /api/admin/v1/driver-risk-flags/e7c81d45-c843-4630-8a55-143fc3e6b6d3/confirm` → **200**

```json
{
  "command_id": "07f3eece-52fd-46c8-9f97-f4a7009d1897",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "e7c81d45-c843-4630-8a55-143fc3e6b6d3",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T17:33:43Z",
    "track_point_id": "ea6a50d9-ec2f-47ed-a831-de2a84d2c305",
    "work_session_id": "cec8f5c0-a3c1-4a61-8ff2-3cff2dd36d1c"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T17:33:43Z",
  "reason": null,
  "reviewed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reviewed_at": "2026-10-29T17:33:44.568225Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/e7c81d45-c843-4630-8a55-143fc3e6b6d3/dismiss` → **409**

```json
{
  "command_id": "beaeb87b-3399-44d3-ac6a-08abc2fdee18",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/e7c81d45-c843-4630-8a55-143fc3e6b6d3/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "a7eb4e21-be33-49a1-aba4-a924e43e5df9"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "e08722fd-e50d-4385-a6d7-e6ef0f57c0ab",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "d31dc755-b773-4561-8402-ffd75eeee8d4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "raised_at": "2026-10-29T17:33:45.165275Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/d31dc755-b773-4561-8402-ffd75eeee8d4/dismiss` → **200**

```json
{
  "command_id": "5049cbdc-d1f7-45c0-8bb0-9865ead9e2eb",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "d31dc755-b773-4561-8402-ffd75eeee8d4",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "raised_at": "2026-10-29T17:33:45.165275Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reviewed_at": "2026-10-29T17:33:45.453362Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "34efee85-5fa3-4313-87d5-e72858f22c0b",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "e7c81d45-c843-4630-8a55-143fc3e6b6d3"
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
      "actor_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T17:33:45.748054Z"
    }
  ]
}
```

Done: flag e7c81d45-c843-4630-8a55-143fc3e6b6d3 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "dd685434-493b-46b3-bcac-e842c095b97e",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMjYsImlhdCI6MTc5MzI5NTIyNiwianRpIjoiNjA1NzU5YjktMzBmZC00ODM1LWI4MTYtNmY2OThhMTU5YTYyIiwic2lkIjoiZGQ2ODU0MzQtNDkzYi00NmIzLWJjYWMtZTg0MmMwOTViOTdlIn0.Z1T6r1IeaOgymv4ncLD3t5JhgBB3TLd7DNeH2DIDHDk",
  "access_expires_at": "2026-10-29T17:48:46.632518402Z",
  "refresh_token": "x1K8mbGvIEhhgp8zQvOASLkq08gcvl7tJna1tcj8rJE",
  "refresh_expires_at": "2026-10-30T05:33:46.631945306Z",
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
      "actor_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T17:33:45.748054Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "366ff867-5c39-4f14-b43a-7d16390be2e6",
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
  "session_id": "cec8f5c0-a3c1-4a61-8ff2-3cff2dd36d1c",
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
  "last_heartbeat_at": "2026-10-29T17:33:40.764109Z",
  "last_location_at": "2026-10-29T17:33:40.764109Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/cec8f5c0-a3c1-4a61-8ff2-3cff2dd36d1c/close` → **200**

```json
{
  "command_id": "0dcde36c-2772-45ee-b7ce-19f9ad9c23bc",
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
  "session_id": "b92fc498-eba9-4a1d-a005-976830cbe1e5",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMjgsImlhdCI6MTc5MzI5NTIyOCwianRpIjoiYjQxOTk2NjktMWFjNS00OTc1LThhNGUtY2M2Mjk0MGIyOTIyIiwic2lkIjoiYjkyZmM0OTgtZWJhOS00YTFkLWEwMDUtOTc2ODMwY2JlMWU1In0.T8U05-X_F-z3K8WOaKXZp3iAVxI8ZC4BS7K0O6RDRoA",
  "access_expires_at": "2026-10-29T17:48:48.385337646Z",
  "refresh_token": "s6yg1VF8z1yXwkKjwHWggpeB4u4qJIDvTdeXKpfnXa0",
  "refresh_expires_at": "2026-10-30T05:33:48.38480531Z",
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
  "command_id": "c79f556f-ac32-46cb-aaf6-0229a5e3b666",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T17:33:48.972442Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "c79f556f-ac32-46cb-aaf6-0229a5e3b666",
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
  "changed_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T17:33:48.972442Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48253737007",
  "device_ref": "sandbox-25197"
}
```

```json
{
  "challenge_id": "d6592c74-be4c-4288-abb6-4018cb11bc19",
  "expires_at": "2026-10-29T17:38:49.580792282Z",
  "resend_available_at": "2026-10-29T17:33:50.580792282Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48253737007` → **200**

```json
{
  "phone": "+48253737007",
  "audience": "CLIENT",
  "code": "536416",
  "sent_at": "2026-10-29T17:33:49.583905911Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d6592c74-be4c-4288-abb6-4018cb11bc19",
  "code": "536416",
  "device_ref": "sandbox-25197"
}
```

```json
{
  "session_id": "fae64582-10f2-4ed5-82a9-ee8bffabca36",
  "subject": {
    "type": "CLIENT",
    "id": "103b1222-f70c-4650-9c54-37a9d51f3af2"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMDNiMTIyMi1mNzBjLTQ2NTAtOWM1NC0zN2E5ZDUxZjNhZjIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MTI5LCJpYXQiOjE3OTMyOTUyMjksImp0aSI6IjU1NzJjMWJhLWY0YWUtNGY3YS04OTNjLWYxODhjNDg1ZGY2ZSIsInNpZCI6ImZhZTY0NTgyLTEwZjItNGVkNS04MmE5LWVlOGJmZmFiY2EzNiJ9.37USfw90IjwL8W3jCyBScAvy9nJ6huQ_ki1s23cmDMI",
  "access_expires_at": "2026-10-29T17:48:49.892295692Z",
  "refresh_token": "GGi1227QIaIrYmcQHfX_ttB-GcIt2DNTWoe9vlUCYJw",
  "refresh_expires_at": "2026-11-28T17:33:49.891815047Z",
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
  "correlation_id": "d6c96095-c028-4492-a596-16a6bf5c093b"
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
  "device_ref": "sandbox-1379"
}
```

```json
{
  "challenge_id": "aeb9dbde-37d4-4ee9-9e1d-3f96888594bc",
  "expires_at": "2026-10-29T17:38:50.733641967Z",
  "resend_available_at": "2026-10-29T17:33:51.733641967Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "306017",
  "sent_at": "2026-10-29T17:33:50.736438909Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "aeb9dbde-37d4-4ee9-9e1d-3f96888594bc",
  "code": "306017",
  "device_ref": "sandbox-1379"
}
```

```json
{
  "session_id": "78ca60f0-c350-49a3-9315-17f77decf205",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjEzMSwiaWF0IjoxNzkzMjk1MjMxLCJqdGkiOiIyNGJkZmFkYS03MTkxLTQxN2QtYjI5ZC02OTJlNGQxODhhYTkiLCJzaWQiOiI3OGNhNjBmMC1jMzUwLTQ5YTMtOTMxNS0xN2Y3N2RlY2YyMDUifQ.oU8adnBiVujroO5okjfuUqWFw0c-48PjFcnKvJYtCQM",
  "access_expires_at": "2026-10-29T17:48:51.03369213Z",
  "refresh_token": "Cp6LoZMFke9w2wbLoYXcSew-5SdplG3JW7SJWleP27o",
  "refresh_expires_at": "2026-11-28T17:33:51.033083778Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8a582658-90bd-46f0-82fd-2fb1174e22be",
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
  "last_heartbeat_at": "2026-10-29T17:33:19.451045Z",
  "last_location_at": "2026-10-29T17:33:19.451045Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8a582658-90bd-46f0-82fd-2fb1174e22be/handover` → **200**

```json
{
  "command_id": "f9dde24d-128a-4866-ac4f-273ef5afad26",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8a582658-90bd-46f0-82fd-2fb1174e22be",
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
  "last_heartbeat_at": "2026-10-29T17:33:19.451045Z",
  "last_location_at": "2026-10-29T17:33:19.451045Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/8a582658-90bd-46f0-82fd-2fb1174e22be/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:33:51Z",
    "sequence": 1793295231902
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "8a582658-90bd-46f0-82fd-2fb1174e22be",
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
  "last_heartbeat_at": "2026-10-29T17:33:51.920451Z",
  "last_location_at": "2026-10-29T17:33:51.920451Z",
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
  "session_id": "8a582658-90bd-46f0-82fd-2fb1174e22be",
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
  "last_heartbeat_at": "2026-10-29T17:33:51.920451Z",
  "last_location_at": "2026-10-29T17:33:51.920451Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8a582658-90bd-46f0-82fd-2fb1174e22be/close` → **200**

```json
{
  "command_id": "20b3c110-e4d3-477e-9b0d-835a90ea923a",
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
  "correlation_id": "e165930f-5c55-4c9e-a01d-b368387ec572"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380679116265",
  "device_ref": "sandbox-15105"
}
```

```json
{
  "challenge_id": "24959a61-b2ce-450e-b48f-0b33165881b4",
  "expires_at": "2026-10-29T17:38:53.369403132Z",
  "resend_available_at": "2026-10-29T17:33:54.369403132Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380679116265` → **200**

```json
{
  "phone": "+380679116265",
  "audience": "CLIENT",
  "code": "763505",
  "sent_at": "2026-10-29T17:33:53.371921014Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "24959a61-b2ce-450e-b48f-0b33165881b4",
  "code": "763505",
  "device_ref": "sandbox-15105"
}
```

```json
{
  "session_id": "782a0dcd-c4e5-4048-b36b-e8c3c670cc94",
  "subject": {
    "type": "CLIENT",
    "id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2M2ZkM2JmMC0xYmFiLTRhYWYtYmRlOS1hMGI1YjcwYjQyMmQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MTMzLCJpYXQiOjE3OTMyOTUyMzMsImp0aSI6IjBlMzA5ZGQ5LTBmNTItNDNlYS1iYmFlLWU3N2U0OTIxYTU4OSIsInNpZCI6Ijc4MmEwZGNkLWM0ZTUtNDA0OC1iMzZiLWU4YzNjNjcwY2M5NCJ9.iv4ePtIiM4wdGJ3A3zWq9KMcm1HPpnrb0p_x_3iM6ZQ",
  "access_expires_at": "2026-10-29T17:48:53.671041369Z",
  "refresh_token": "u_DMhkzlAr_H0JdGMYfLsXi9c1TPX5HBHYuDk6XL-mo",
  "refresh_expires_at": "2026-11-28T17:33:53.670471868Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "b4678024-fd14-4053-baf6-c8f883290ff2",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
  "upload_path": "/api/rider/v1/uploads/1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
  "expires_at": "2026-10-29T17:48:53.968101275Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/1fb4d5da-8ea9-4459-acfe-c8caa5c5af97` → **200**

```json
{
  "file_id": "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "a13181a1-435a-4ce4-b286-8d16ffb1265c",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97"
  ]
}
```

```json
{
  "id": "96888973-2fd0-423c-8b22-d63c55834d05",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T17:33:54.315532Z",
  "updated_at": "2026-10-29T17:33:54.315532Z",
  "respond_by": "2026-10-29T21:33:54.315532Z",
  "messages": [
    {
      "id": "a61fa014-fe2d-4c38-8542-f60022c24c6a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:33:54.316485Z",
      "attachments": [
        {
          "file_id": "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
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
  "session_id": "829d02e8-2d58-4185-9772-7eeff40766cc",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMzQsImlhdCI6MTc5MzI5NTIzNCwianRpIjoiYTI1YjU3YjEtMTMwMC00MDc0LTkzNzQtMzMxMGY5YTMwNzY2Iiwic2lkIjoiODI5ZDAyZTgtMmQ1OC00MTg1LTk3NzItN2VlZmY0MDc2NmNjIn0.3RETm3YuZhKujWMB-32lwyODYxc4uuzCb0F55nXvgiU",
  "access_expires_at": "2026-10-29T17:48:54.924447383Z",
  "refresh_token": "fKhU28fOFsUGbVnFopHRjebJfA7owkxdFqE2IP-R_M0",
  "refresh_expires_at": "2026-10-30T05:33:54.923912637Z",
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
  "session_id": "d0deb667-5f01-400f-84ee-0af8b166d4c4",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxMzUsImlhdCI6MTc5MzI5NTIzNSwianRpIjoiMGVlYjE3YWMtN2JjOC00YTdiLTk5YTEtNjI5ZGUzMjc0ZDQwIiwic2lkIjoiZDBkZWI2NjctNWYwMS00MDBmLTg0ZWUtMGFmOGIxNjZkNGM0In0.Ap-MfDXKBsi4-8P0SpOkWOSe8_k1CvrqQVJfYuX5hbI",
  "access_expires_at": "2026-10-29T17:48:55.491424211Z",
  "refresh_token": "zfYVz0dmMS7qhthH2gHHZEK3eAgdfMNBIihEtf5p54E",
  "refresh_expires_at": "2026-10-30T05:33:55.490875999Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/96888973-2fd0-423c-8b22-d63c55834d05/attachments/1fb4d5da-8ea9-4459-acfe-c8caa5c5af97` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "414a7e82-dfda-4f03-8ff3-aba7b2434fde",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "710f0479-c053-4a1e-8ebd-bf00f7cb0dc2",
  "upload_path": "/api/operator/v1/uploads/710f0479-c053-4a1e-8ebd-bf00f7cb0dc2",
  "expires_at": "2026-10-29T17:48:55.796103873Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/710f0479-c053-4a1e-8ebd-bf00f7cb0dc2` → **200**

```json
{
  "file_id": "710f0479-c053-4a1e-8ebd-bf00f7cb0dc2",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/96888973-2fd0-423c-8b22-d63c55834d05` → **200**

```json
{
  "id": "96888973-2fd0-423c-8b22-d63c55834d05",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T17:33:54.315532Z",
  "updated_at": "2026-10-29T17:33:54.315532Z",
  "respond_by": "2026-10-29T21:33:54.315532Z",
  "messages": [
    {
      "id": "a61fa014-fe2d-4c38-8542-f60022c24c6a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:33:54.316485Z",
      "attachments": [
        {
          "file_id": "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/96888973-2fd0-423c-8b22-d63c55834d05/comments` → **200**

```json
{
  "command_id": "8f0c4e25-b36f-4975-923c-4407ae120789",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "710f0479-c053-4a1e-8ebd-bf00f7cb0dc2"
  ]
}
```

```json
{
  "id": "96888973-2fd0-423c-8b22-d63c55834d05",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T17:33:54.315532Z",
  "updated_at": "2026-10-29T17:33:56.412226Z",
  "respond_by": "2026-10-29T21:33:54.315532Z",
  "messages": [
    {
      "id": "a61fa014-fe2d-4c38-8542-f60022c24c6a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:33:54.316485Z",
      "attachments": [
        {
          "file_id": "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "360708bf-305b-4404-b71d-486204024061",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T17:33:56.411627Z",
      "attachments": [
        {
          "file_id": "710f0479-c053-4a1e-8ebd-bf00f7cb0dc2",
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

`GET /api/rider/v1/support/cases/96888973-2fd0-423c-8b22-d63c55834d05` → **200**

```json
{
  "id": "96888973-2fd0-423c-8b22-d63c55834d05",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T17:33:54.315532Z",
  "updated_at": "2026-10-29T17:33:56.412226Z",
  "respond_by": "2026-10-29T21:33:54.315532Z",
  "messages": [
    {
      "id": "a61fa014-fe2d-4c38-8542-f60022c24c6a",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "63fd3bf0-1bab-4aaf-bde9-a0b5b70b422d",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T17:33:54.316485Z",
      "attachments": [
        {
          "file_id": "1fb4d5da-8ea9-4459-acfe-c8caa5c5af97",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "360708bf-305b-4404-b71d-486204024061",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T17:33:56.411627Z",
      "attachments": [
        {
          "file_id": "710f0479-c053-4a1e-8ebd-bf00f7cb0dc2",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/96888973-2fd0-423c-8b22-d63c55834d05/attachments/710f0479-c053-4a1e-8ebd-bf00f7cb0dc2` → **200**

Done: support case 96888973-2fd0-423c-8b22-d63c55834d05, rider attachment 1fb4d5da-8ea9-4459-acfe-c8caa5c5af97, operator attachment 710f0479-c053-4a1e-8ebd-bf00f7cb0dc2.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380731422471",
  "device_ref": "sandbox-30216"
}
```

```json
{
  "challenge_id": "89eeb3df-b7d6-4a29-9cba-706dfb741c39",
  "expires_at": "2026-10-29T17:38:57.033348089Z",
  "resend_available_at": "2026-10-29T17:33:58.033348089Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380731422471` → **200**

```json
{
  "phone": "+380731422471",
  "audience": "CLIENT",
  "code": "617696",
  "sent_at": "2026-10-29T17:33:57.036098891Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "89eeb3df-b7d6-4a29-9cba-706dfb741c39",
  "code": "617696",
  "device_ref": "sandbox-30216"
}
```

```json
{
  "session_id": "07612600-537f-435b-be60-eca12b7d9e44",
  "subject": {
    "type": "CLIENT",
    "id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5M2I3ZjdmMy0xYTk3LTQyZTItYTJjMy0yNDRkMzhmYzVmMGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MTM3LCJpYXQiOjE3OTMyOTUyMzcsImp0aSI6IjIyOTc1ODNhLWViYWUtNGM4YS04NThkLWQ3YzQ3Y2QwYWRlMyIsInNpZCI6IjA3NjEyNjAwLTUzN2YtNDM1Yi1iZTYwLWVjYTEyYjdkOWU0NCJ9.4385goFo9Nf_DXmZVC8eQva0KTm4_4_EFYbTmfCpTgM",
  "access_expires_at": "2026-10-29T17:48:57.339881864Z",
  "refresh_token": "X8YENaTMcZDvdd5AUrOAHyNNFQN8ttTcaC40BGqv2J8",
  "refresh_expires_at": "2026-11-28T17:33:57.33936532Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "81b168db-f663-4600-b4e8-8b5882dc68fa",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "520b6798-e3a9-493b-897d-95ddf87f7597",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-520b6798-e3a9-493b-897d-95ddf87f7597",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "a653591011785adac6d1bf092b6c2bf6",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=520b6798-e3a9-493b-897d-95ddf87f7597",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380731422471"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=520b6798-e3a9-493b-897d-95ddf87f7597",
  "expires_at": "2026-10-29T18:03:57.627479Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/520b6798-e3a9-493b-897d-95ddf87f7597` → **200**

```json
{
  "id": "520b6798-e3a9-493b-897d-95ddf87f7597",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T18:03:57.627479Z",
  "card": {
    "id": "c56682d8-6812-469f-a500-b316520e4669",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0645",
    "card_type": "Visa",
    "created_at": "2026-10-29T17:33:57.912359Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "7cae5c5c-de2a-4f94-9b11-9b1a8b8d4c4c",
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
  "id": "c39fecde-13ca-4daf-92d0-be8584c74364",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:38:58.223934Z",
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
  "command_id": "2a96fc70-4a5b-4adb-bef4-28afb13ac87f",
  "quote_id": "c39fecde-13ca-4daf-92d0-be8584c74364",
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
  "id": "0b826374-d17f-4796-8bf6-95ce55f7ac8b",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c",
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
  "created_at": "2026-10-29T17:33:58.51579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b` → **200**

```json
{
  "id": "0b826374-d17f-4796-8bf6-95ce55f7ac8b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c",
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
  "created_at": "2026-10-29T17:33:58.51579Z",
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

`GET /api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b` → **200**

```json
{
  "id": "0b826374-d17f-4796-8bf6-95ce55f7ac8b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c",
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
  "created_at": "2026-10-29T17:33:58.51579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b/switch-to-cash` → **200**

```json
{
  "command_id": "bab26b41-877e-4f41-9912-4687c17fd6df",
  "expected_version": 3
}
```

```json
{
  "id": "0b826374-d17f-4796-8bf6-95ce55f7ac8b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c",
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
  "created_at": "2026-10-29T17:33:58.51579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b/switch-to-cash` → **409**

```json
{
  "command_id": "02791a4c-e490-491d-a301-6fa160550f93",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "9b266ed5-93ea-4821-be3c-53b6afbe10ec"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b` → **200**

```json
{
  "id": "0b826374-d17f-4796-8bf6-95ce55f7ac8b",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c",
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
  "created_at": "2026-10-29T17:33:58.51579Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/0b826374-d17f-4796-8bf6-95ce55f7ac8b/cancel` → **200**

```json
{
  "command_id": "2a63cd84-f350-46f0-9a40-090bc9631da1",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "0b826374-d17f-4796-8bf6-95ce55f7ac8b",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "93b7f7f3-1a97-42e2-a2c3-244d38fc5f0c",
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
  "created_at": "2026-10-29T17:33:58.51579Z",
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
  "session_id": "737003a8-f4f9-46d5-9ed2-5f2e3478d3c9",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxNDAsImlhdCI6MTc5MzI5NTI0MCwianRpIjoiMzM3M2NhN2QtZmFhNS00MTg0LTlhZmUtMTVmYzYxYjU5YzhjIiwic2lkIjoiNzM3MDAzYTgtZjRmOS00NmQ1LTllZDItNWYyZTM0NzhkM2M5In0.QfXHOKs9kGUsj5fBMGd0Gr-9unkMExd1Nnz77vsaW5k",
  "access_expires_at": "2026-10-29T17:49:00.929751808Z",
  "refresh_token": "a7PormVVken5-1m5AoOhPFF-gS9AjMDzJhDYeIHhdtE",
  "refresh_expires_at": "2026-10-30T05:34:00.929164184Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-3534"
}
```

```json
{
  "challenge_id": "378171ca-d024-4c0e-a567-167669672239",
  "expires_at": "2026-10-29T17:39:01.214437989Z",
  "resend_available_at": "2026-10-29T17:34:02.214437989Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "011334",
  "sent_at": "2026-10-29T17:34:01.217218618Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "378171ca-d024-4c0e-a567-167669672239",
  "code": "011334",
  "device_ref": "sandbox-3534"
}
```

```json
{
  "session_id": "448341cd-8764-4cbb-adc2-0e850c98599b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjE0MSwiaWF0IjoxNzkzMjk1MjQxLCJqdGkiOiJkNTA0NzA5MC03MWYwLTQxM2UtYjUzNC1hNDBmZDI5MGEzMDciLCJzaWQiOiI0NDgzNDFjZC04NzY0LTRjYmItYWRjMi0wZTg1MGM5ODU5OWIifQ.fqHqYLOTRsdk4t1Iw5nfqCq514T0nsihMd7nn9knBDM",
  "access_expires_at": "2026-10-29T17:49:01.543301244Z",
  "refresh_token": "1lLHXEAi6BPsrppLGoHn_brB5TDoZn78Yh5yUPPh7fk",
  "refresh_expires_at": "2026-11-28T17:34:01.542777639Z",
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
      "actor_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T17:33:45.748054Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T17:33:47.22229Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "73e01257-b9f2-4fe7-88fe-69d29813e499",
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
  "device_ref": "sandbox-11212"
}
```

```json
{
  "challenge_id": "dd5def5e-0305-422f-aee5-e8f7fd1bdcb6",
  "expires_at": "2026-10-29T17:39:02.684317747Z",
  "resend_available_at": "2026-10-29T17:34:03.684317747Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "304449",
  "sent_at": "2026-10-29T17:34:02.687133806Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "dd5def5e-0305-422f-aee5-e8f7fd1bdcb6",
  "code": "304449",
  "device_ref": "sandbox-11212"
}
```

```json
{
  "session_id": "3f7f056e-b0f7-4164-be4c-b9e454cc0290",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjE0MiwiaWF0IjoxNzkzMjk1MjQyLCJqdGkiOiI4MjBhZTJjNC01MWQyLTQyZmUtYTQzYS1kOTgwMGU0Yjg2M2YiLCJzaWQiOiIzZjdmMDU2ZS1iMGY3LTQxNjQtYmU0Yy1iOWU0NTRjYzAyOTAifQ.mwIdyvajY5XUTVSr2lz1_aItvsbZk3hhlCjdvfN6HCU",
  "access_expires_at": "2026-10-29T17:49:02.984063122Z",
  "refresh_token": "P0RP1h9AEDPEVWu-vvhC4hPK7aO7itFkk6wC-hxbwBw",
  "refresh_expires_at": "2026-11-28T17:34:02.983536652Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:33:26.891641Z",
  "last_location_at": "2026-10-29T17:33:26.891641Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e1a8d918-e40f-42e1-86ab-20fe796eb9f3/handover` → **200**

```json
{
  "command_id": "06d3cbd4-3a30-4d7e-8d86-03aceb9c6c3f",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:33:26.891641Z",
  "last_location_at": "2026-10-29T17:33:26.891641Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/e1a8d918-e40f-42e1-86ab-20fe796eb9f3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:34:03Z",
    "sequence": 1793295243837
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:34:03.85614Z",
  "last_location_at": "2026-10-29T17:34:03.85614Z",
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
  "command_id": "f12365e3-6241-44e4-a7ba-f49b1d3c76e6",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:34:04Z",
    "sequence": 1793295244433
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d0d359d0-ff74-4ad0-a515-99220012db60",
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
  "last_heartbeat_at": "2026-10-29T17:34:04.451162Z",
  "last_location_at": "2026-10-29T17:34:04.451162Z",
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
  "session_id": "0b3f2a81-32d8-4daf-a4bf-4362707984ec",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYxNDUsImlhdCI6MTc5MzI5NTI0NSwianRpIjoiMWZhYjYyMjItMmQ3MS00NjUyLTkzNTUtOTQxMWE4NzJkNjJjIiwic2lkIjoiMGIzZjJhODEtMzJkOC00ZGFmLWE0YmYtNDM2MjcwNzk4NGVjIn0.m8N3lbzVSrEgaVPquYaC0IWsP1eYCQ_z3dXhFpwF9xc",
  "access_expires_at": "2026-10-29T17:49:05.039193342Z",
  "refresh_token": "ZMVvyXonj0b-smp2MNRbUYHwdDUnQ-LKiBWnNXQhyp0",
  "refresh_expires_at": "2026-10-30T05:34:05.038684394Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "9e9488ae-a49b-43c1-a8c9-8ca275b54151",
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
  "id": "9e77e9e4-ef10-434e-8d3c-7b889083ac83",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:39:05.323164Z",
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
  "command_id": "cc5d4f34-f78b-410c-92ff-68c6d0d456a6",
  "quote_id": "9e77e9e4-ef10-434e-8d3c-7b889083ac83",
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
  "id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
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
  "created_at": "2026-10-29T17:34:05.622832Z",
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
    "id": "1238e9e6-9841-4045-bc7a-66d3473aca6f",
    "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
    "expires_at": "2026-10-29T17:34:20.626486Z",
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

`POST /api/driver/v1/offers/1238e9e6-9841-4045-bc7a-66d3473aca6f/accept` → **200**

```json
{
  "command_id": "f2de476b-154f-4d3b-a097-705683fbf2b5"
}
```

```json
{
  "id": "e1b0d04c-c7a0-4354-816a-5e321885fffd",
  "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "23926c2b-99d2-4aee-aba5-3419505677c0",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "23926c2b-99d2-4aee-aba5-3419505677c0",
  "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
  "assignment_id": "e1b0d04c-c7a0-4354-816a-5e321885fffd",
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

`POST /api/driver/v1/work-sessions/d0d359d0-ff74-4ad0-a515-99220012db60/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T17:34:07Z",
    "sequence": 1793295247828
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "d0d359d0-ff74-4ad0-a515-99220012db60",
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
  "last_heartbeat_at": "2026-10-29T17:34:07.101004Z",
  "last_location_at": "2026-10-29T17:34:07.101004Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/23926c2b-99d2-4aee-aba5-3419505677c0/arrive` → **200**

```json
{
  "command_id": "87fb7a75-d6f9-4d22-9a18-bec8314fadb9",
  "expected_version": 0
}
```

```json
{
  "id": "23926c2b-99d2-4aee-aba5-3419505677c0",
  "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
  "assignment_id": "e1b0d04c-c7a0-4354-816a-5e321885fffd",
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
  "arrived_at": "2026-10-29T17:34:07.390928Z",
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

`POST /api/driver/v1/trips/23926c2b-99d2-4aee-aba5-3419505677c0/start` → **200**

```json
{
  "command_id": "e0921533-44ca-4f93-8cc6-187c409334aa",
  "expected_version": 1
}
```

```json
{
  "id": "23926c2b-99d2-4aee-aba5-3419505677c0",
  "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
  "assignment_id": "e1b0d04c-c7a0-4354-816a-5e321885fffd",
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
  "arrived_at": "2026-10-29T17:34:07.390928Z",
  "started_at": "2026-10-29T17:34:07.693239Z",
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

`POST /api/driver/v1/trips/23926c2b-99d2-4aee-aba5-3419505677c0/complete` → **200**

```json
{
  "command_id": "4b2f1922-809a-4f81-9bbe-fb0126fa433e",
  "expected_version": 2,
  "reported_at": "2026-10-29T17:34:07Z",
  "cash_received": true
}
```

```json
{
  "id": "23926c2b-99d2-4aee-aba5-3419505677c0",
  "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
  "assignment_id": "e1b0d04c-c7a0-4354-816a-5e321885fffd",
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
  "arrived_at": "2026-10-29T17:34:07.390928Z",
  "started_at": "2026-10-29T17:34:07.693239Z",
  "completed_at": "2026-10-29T17:34:08.000539Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04` → **200**

```json
{
  "id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
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
    "id": "e1b0d04c-c7a0-4354-816a-5e321885fffd",
    "order_id": "d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "23926c2b-99d2-4aee-aba5-3419505677c0",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T17:34:05.622832Z",
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
  "session_id": "e1a8d918-e40f-42e1-86ab-20fe796eb9f3",
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
  "last_heartbeat_at": "2026-10-29T17:34:03.85614Z",
  "last_location_at": "2026-10-29T17:34:03.85614Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/e1a8d918-e40f-42e1-86ab-20fe796eb9f3/close` → **200**

```json
{
  "command_id": "2a39e85f-92b5-462d-9430-5fecb51a7d8c",
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
  "session_id": "d0d359d0-ff74-4ad0-a515-99220012db60",
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
  "last_heartbeat_at": "2026-10-29T17:34:07.101004Z",
  "last_location_at": "2026-10-29T17:34:07.101004Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/d0d359d0-ff74-4ad0-a515-99220012db60/close` → **200**

```json
{
  "command_id": "ceedbf11-4709-4151-b2ce-346760a77181",
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

Done: terminal order d2e5b6f4-f6f8-4fc2-9ffd-585c9d0d6e04 by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-16611"
}
```

```json
{
  "challenge_id": "ef247d51-9813-4d75-af2f-c389be5058c7",
  "expires_at": "2026-10-29T17:39:13.013999807Z",
  "resend_available_at": "2026-10-29T17:34:14.013999807Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "474807",
  "sent_at": "2026-10-29T17:34:13.016674859Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ef247d51-9813-4d75-af2f-c389be5058c7",
  "code": "474807",
  "device_ref": "sandbox-16611"
}
```

```json
{
  "session_id": "9b63e299-4576-4d96-b7cb-511876756548",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjE1MywiaWF0IjoxNzkzMjk1MjUzLCJqdGkiOiI1NDAzMjlhZS0zNTMxLTQzMWUtOGYwZC0yMWFlNzUwOGMzYzYiLCJzaWQiOiI5YjYzZTI5OS00NTc2LTRkOTYtYjdjYi01MTE4NzY3NTY1NDgifQ.OYlx_Y-CIg-CCr8mUZtpIcRW4BMXCVLskt1JHxqPeD8",
  "access_expires_at": "2026-10-29T17:49:13.328602137Z",
  "refresh_token": "W-fpKV-V-sT0bVDsncGBUiwu7hmANwAcI52tYVxW5tI",
  "refresh_expires_at": "2026-11-28T17:34:13.328038908Z",
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
  "device_ref": "sandbox-28278"
}
```

```json
{
  "challenge_id": "6be343fd-eb6e-4303-ac2a-96440c7e2c82",
  "expires_at": "2026-10-29T17:39:13.878338801Z",
  "resend_available_at": "2026-10-29T17:34:14.878338801Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "239641",
  "sent_at": "2026-10-29T17:34:13.880958051Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "6be343fd-eb6e-4303-ac2a-96440c7e2c82",
  "code": "239641",
  "device_ref": "sandbox-28278"
}
```

```json
{
  "session_id": "e26ff180-0cf8-47a0-99d0-b8fded49230b",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjE1NCwiaWF0IjoxNzkzMjk1MjU0LCJqdGkiOiI2N2YyYzFkYy01NzI1LTQxOWQtYmM5Mi01Y2JlZmI2MjYxMWIiLCJzaWQiOiJlMjZmZjE4MC0wY2Y4LTQ3YTAtOTlkMC1iOGZkZWQ0OTIzMGIifQ.-ArX4npIj9yYbonbz4ZZybJ9LxxkOXVGR3InrHSGPfY",
  "access_expires_at": "2026-10-29T17:49:14.182711804Z",
  "refresh_token": "Ez2036-V2o3NgrX4UaD9smYgL0ugRqdx8E1Evf0Ga7Y",
  "refresh_expires_at": "2026-11-28T17:34:14.182151339Z",
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
  "device_ref": "sandbox-3833"
}
```

```json
{
  "challenge_id": "3e051331-5f46-4869-b273-af9c95b68d02",
  "expires_at": "2026-10-29T17:39:14.744284712Z",
  "resend_available_at": "2026-10-29T17:34:15.744284712Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "510656",
  "sent_at": "2026-10-29T17:34:14.746940099Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3e051331-5f46-4869-b273-af9c95b68d02",
  "code": "510656",
  "device_ref": "sandbox-3833"
}
```

```json
{
  "session_id": "ee6ae3ba-1fb7-41b2-9c85-70b0e859bb6e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI5NjE1NSwiaWF0IjoxNzkzMjk1MjU1LCJqdGkiOiJhYTNmOGE1NS1hOTU4LTQ0ODktODBmZS0zMjBlOTYzYjVjOGYiLCJzaWQiOiJlZTZhZTNiYS0xZmI3LTQxYjItOWM4NS03MGIwZTg1OWJiNmUifQ.W0VK2OgLyztjaLK0UoIDrJDONNZKAHCnlLMSnFdfJFs",
  "access_expires_at": "2026-10-29T17:49:15.048892821Z",
  "refresh_token": "9y--WBHMoRKO53XLxtPo4dGVN2U0wbYfkWl0rZR5tmU",
  "refresh_expires_at": "2026-11-28T17:34:15.048364447Z",
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
  "phone": "+380693569315",
  "device_ref": "sandbox-31405"
}
```

```json
{
  "challenge_id": "c2424c5e-f9b1-4f48-abf6-9ea01d64f2e7",
  "expires_at": "2026-10-29T17:39:15.595514733Z",
  "resend_available_at": "2026-10-29T17:34:16.595514733Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380693569315` → **200**

```json
{
  "phone": "+380693569315",
  "audience": "CLIENT",
  "code": "561566",
  "sent_at": "2026-10-29T17:34:15.598004943Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c2424c5e-f9b1-4f48-abf6-9ea01d64f2e7",
  "code": "561566",
  "device_ref": "sandbox-31405"
}
```

```json
{
  "session_id": "538f8bbe-75eb-4f0b-a2b7-12a05407abef",
  "subject": {
    "type": "CLIENT",
    "id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxMmFjODRhNy0xZDA4LTRkZTItOWY1YS0wNDg1ZWFjYWVmODIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjk2MTU1LCJpYXQiOjE3OTMyOTUyNTUsImp0aSI6IjMwMmE5MDEyLWY5NzAtNDAwYi04YTExLWRjYjU1YzcyN2RkYyIsInNpZCI6IjUzOGY4YmJlLTc1ZWItNGYwYi1hMmI3LTEyYTA1NDA3YWJlZiJ9.nvFoi1ZtIJ1d8esPk_qHdgllGYbwvrX4U1C0oA5wXfA",
  "access_expires_at": "2026-10-29T17:49:15.910938704Z",
  "refresh_token": "AkgiiHo_mUpsj9V08_g45gWFS4h6eXPt-vQ_8ck7Zj4",
  "refresh_expires_at": "2026-11-28T17:34:15.910399961Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "70dad087-48b8-4ec8-8f2b-a1f1bddfbce9",
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
  "id": "bee9c9aa-d039-455e-b6a9-98a7fb682a2c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T17:39:16.204682Z",
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
  "command_id": "04c20b30-dcac-40e9-95df-d28297f8eed2",
  "quote_id": "bee9c9aa-d039-455e-b6a9-98a7fb682a2c",
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
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 14.972068442
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.204115344
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

`GET /api/rider/v1/orders/ff1c1061-73eb-4de0-be83-33027dc19cef` → **200**

```json
{
  "id": "ff1c1061-73eb-4de0-be83-33027dc19cef",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "12ac84a7-1d08-4de2-9f5a-0485eacaef82",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T17:34:16.502532Z",
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
  "session_id": "722d165c-07ed-4fe7-8920-cc3bbcad6ea3",
  "subject": {
    "type": "STAFF",
    "id": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2MDMxYTY4Zi1iZDNhLTRiMWMtYmM4OS05MWRhM2Q4OTU4YzIiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyOTYzNDMsImlhdCI6MTc5MzI5NTQ0MywianRpIjoiMmQ5MGM3MDEtOWFlMy00NzFlLWI3ZTEtYmJjYTU4YTliMDI3Iiwic2lkIjoiNzIyZDE2NWMtMDdlZC00ZmU3LTg5MjAtY2MzYmJjYWQ2ZWEzIn0.8p98ro5YHi85tVz793FthG0StL0amYYkL8msjnG35qA",
  "access_expires_at": "2026-10-29T17:52:23.50273736Z",
  "refresh_token": "6ELCv28yjOwl_fY5DHKpIpgG-XXNCZGSTiEKWTT7PEE",
  "refresh_expires_at": "2026-10-30T05:37:23.501887751Z",
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
  "id": "d1d4b0da-dd23-42b1-a17a-69b31f42544a",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:23.793227Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:23.793264Z",
  "updated_at": "2026-10-29T17:37:23.811355Z",
  "finished_at": "2026-10-29T17:37:23.811355Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/d1d4b0da-dd23-42b1-a17a-69b31f42544a` → **200**

```json
{
  "run": {
    "id": "d1d4b0da-dd23-42b1-a17a-69b31f42544a",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T17:37:23.793227Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T17:37:23.793264Z",
    "updated_at": "2026-10-29T17:37:23.811355Z",
    "finished_at": "2026-10-29T17:37:23.811355Z",
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
  "id": "d1d4b0da-dd23-42b1-a17a-69b31f42544a",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:23.793227Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:23.793264Z",
  "updated_at": "2026-10-29T17:37:23.811355Z",
  "finished_at": "2026-10-29T17:37:23.811355Z",
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
  "id": "d1d4b0da-dd23-42b1-a17a-69b31f42544a",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:23.793227Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:23.793264Z",
  "updated_at": "2026-10-29T17:37:23.811355Z",
  "finished_at": "2026-10-29T17:37:23.811355Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/08790b60-48df-45cc-9ada-003da2b92253` → **204**

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
  "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:24.259555Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:24.259631Z",
  "updated_at": "2026-10-29T17:37:24.267617Z",
  "finished_at": "2026-10-29T17:37:24.267617Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/5e43fdc4-176c-4bb4-8079-cdac307de942` → **200**

```json
{
  "run": {
    "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T17:37:24.259555Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T17:37:24.259631Z",
    "updated_at": "2026-10-29T17:37:24.267617Z",
    "finished_at": "2026-10-29T17:37:24.267617Z",
    "version": 1
  },
  "items": [
    {
      "id": "f4e23ab0-27dd-46a3-8c9f-f248e4cf42da",
      "run_id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "bc35b7553d38b9bd686af93d1c52c7809f808b29a51b090189081fa792dae3bd",
      "reference_display": "sandbox-reconciliation-#####b60-48df-45cc-9ada-003da2b#####",
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
      "provider_at": "2026-10-29T17:37:24Z",
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
  "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:24.259555Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:24.259631Z",
  "updated_at": "2026-10-29T17:37:24.267617Z",
  "finished_at": "2026-10-29T17:37:24.267617Z",
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
  "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:24.259555Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:24.259631Z",
  "updated_at": "2026-10-29T17:37:24.267617Z",
  "finished_at": "2026-10-29T17:37:24.267617Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/f4e23ab0-27dd-46a3-8c9f-f248e4cf42da/resolve` → **200**

```json
{
  "command_id": "6af4a43d-1b97-4f61-a55e-10abb6229c5c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f4e23ab0-27dd-46a3-8c9f-f248e4cf42da",
  "run_id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "bc35b7553d38b9bd686af93d1c52c7809f808b29a51b090189081fa792dae3bd",
  "reference_display": "sandbox-reconciliation-#####b60-48df-45cc-9ada-003da2b#####",
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
  "provider_at": "2026-10-29T17:37:24Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "resolved_at": "2026-10-29T17:37:24.682976Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f4e23ab0-27dd-46a3-8c9f-f248e4cf42da/resolve` → **200**

```json
{
  "command_id": "6af4a43d-1b97-4f61-a55e-10abb6229c5c",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "f4e23ab0-27dd-46a3-8c9f-f248e4cf42da",
  "run_id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "bc35b7553d38b9bd686af93d1c52c7809f808b29a51b090189081fa792dae3bd",
  "reference_display": "sandbox-reconciliation-#####b60-48df-45cc-9ada-003da2b#####",
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
  "provider_at": "2026-10-29T17:37:24Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
  "resolved_at": "2026-10-29T17:37:24.682976Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/f4e23ab0-27dd-46a3-8c9f-f248e4cf42da/resolve` → **409**

```json
{
  "command_id": "12e1dfdd-d656-44e6-bc38-9f718aa418f5",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/f4e23ab0-27dd-46a3-8c9f-f248e4cf42da/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "3a8583a6-89e4-482a-a8f6-6780c5eda030"
}
```

`GET /api/admin/v1/payment-reconciliations/5e43fdc4-176c-4bb4-8079-cdac307de942` → **200**

```json
{
  "run": {
    "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T17:37:24.259555Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T17:37:24.259631Z",
    "updated_at": "2026-10-29T17:37:24.682976Z",
    "finished_at": "2026-10-29T17:37:24.267617Z",
    "version": 2
  },
  "items": [
    {
      "id": "f4e23ab0-27dd-46a3-8c9f-f248e4cf42da",
      "run_id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "bc35b7553d38b9bd686af93d1c52c7809f808b29a51b090189081fa792dae3bd",
      "reference_display": "sandbox-reconciliation-#####b60-48df-45cc-9ada-003da2b#####",
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
      "provider_at": "2026-10-29T17:37:24Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "6031a68f-bd3a-4b1c-bc89-91da3d8958c2",
      "resolved_at": "2026-10-29T17:37:24.682976Z",
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
      "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T17:37:24.259555Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T17:37:24.259631Z",
      "updated_at": "2026-10-29T17:37:24.682976Z",
      "finished_at": "2026-10-29T17:37:24.267617Z",
      "version": 2
    },
    {
      "id": "ffd46a00-567a-4a0b-bd94-b68e5a293a7f",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T17:29:18.610774Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T17:29:18.610841Z",
      "updated_at": "2026-10-29T17:29:18.617036Z",
      "finished_at": "2026-10-29T17:29:18.617036Z",
      "version": 1
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/08790b60-48df-45cc-9ada-003da2b92253` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "5e43fdc4-176c-4bb4-8079-cdac307de942",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T17:37:24.259555Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T17:37:24.259631Z",
  "updated_at": "2026-10-29T17:37:24.682976Z",
  "finished_at": "2026-10-29T17:37:24.267617Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.79329556879E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793295569103E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793295569104E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793295568836E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793295569104E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
