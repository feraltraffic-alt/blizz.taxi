# Sandbox transcript (2026-10-29T15:34:05Z, 42e6402)

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
  "correlation_id": "1d39c8aa-447d-400c-a00b-05a6562cc621"
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
  "session_id": "76231779-2f04-45cc-a984-c0ac79dd5a58",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5NTIsImlhdCI6MTc5MzI4ODA1MiwianRpIjoiYzc3YzUzNDEtYzhjZC00MmZhLWFiMDUtY2E3ZDM3NjNkOTczIiwic2lkIjoiNzYyMzE3NzktMmYwNC00NWNjLWE5ODQtYzBhYzc5ZGQ1YTU4In0._ug17n5GJ7kxstoq6MKIMHHKP575R9ChbytPW2cMDSQ",
  "access_expires_at": "2026-10-29T15:49:12.013611988Z",
  "refresh_token": "LQhcFYA3I8pm-pQHqUhVaNUNnqOoaEPTx4FKPAdV3bU",
  "refresh_expires_at": "2026-10-30T03:34:12.011844331Z",
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
  "session_id": "1e588c94-199e-428b-88dc-e9ab6656a404",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5NTMsImlhdCI6MTc5MzI4ODA1MywianRpIjoiMDljYjcwYTAtYTEwZC00MGQwLWI2NjYtNjI2ZjFlZTY0ZmRjIiwic2lkIjoiMWU1ODhjOTQtMTk5ZS00MjhiLTg4ZGMtZTlhYjY2NTZhNDA0In0.Wwm0FMGtwL1dEo1TvSU9Hes2J6tgRTNcFCTK0_0CyEE",
  "access_expires_at": "2026-10-29T15:49:13.292742988Z",
  "refresh_token": "vzea6zgRf3tAdCWEULoO_Q-ucVaR2xi3pp1eM1_J75A",
  "refresh_expires_at": "2026-10-30T03:34:13.292043402Z",
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
  "device_ref": "sandbox-12742"
}
```

```json
{
  "challenge_id": "1a7c7881-fd5b-4ca8-96fd-25e97bf0ea6e",
  "expires_at": "2026-10-29T15:39:13.686520799Z",
  "resend_available_at": "2026-10-29T15:34:14.686520799Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "100420",
  "sent_at": "2026-10-29T15:34:13.695442442Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1a7c7881-fd5b-4ca8-96fd-25e97bf0ea6e",
  "code": "100420",
  "device_ref": "sandbox-12742"
}
```

```json
{
  "session_id": "a89a47e4-8305-4201-8343-052cc3d91d71",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4ODk1MywiaWF0IjoxNzkzMjg4MDUzLCJqdGkiOiJlNTNmOGI5MC0yNjM0LTQzOTQtODEzZi0wOGNiYmUyOTU4YTgiLCJzaWQiOiJhODlhNDdlNC04MzA1LTQyMDEtODM0My0wNTJjYzNkOTFkNzEifQ.emzEP0kjj4bVS_iDWsB9UIzzHr1mAaf-9zGroBPQSAY",
  "access_expires_at": "2026-10-29T15:49:13.923923112Z",
  "refresh_token": "Jq1hR4rPETiN76Sapt-QFrsRVnWNFwHaxw4nASVKG8I",
  "refresh_expires_at": "2026-11-28T15:34:13.923285776Z",
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
  "command_id": "1493e071-01e2-4116-b33e-47369074ef2c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:14Z",
    "sequence": 1793288054291
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0219be9c-37b8-42d2-81ab-6f309a617de2",
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
  "last_heartbeat_at": "2026-10-29T15:34:14.37063Z",
  "last_location_at": "2026-10-29T15:34:14.37063Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380634080029",
  "device_ref": "sandbox-23878"
}
```

```json
{
  "challenge_id": "1414fb8f-ebc2-4520-9ae5-6cb7baeda64f",
  "expires_at": "2026-10-29T15:39:14.563117494Z",
  "resend_available_at": "2026-10-29T15:34:15.563117494Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634080029` → **200**

```json
{
  "phone": "+380634080029",
  "audience": "CLIENT",
  "code": "700630",
  "sent_at": "2026-10-29T15:34:14.569474942Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1414fb8f-ebc2-4520-9ae5-6cb7baeda64f",
  "code": "700630",
  "device_ref": "sandbox-23878"
}
```

```json
{
  "session_id": "27a7b7b6-797d-47d8-9ab3-a04fd3131bd6",
  "subject": {
    "type": "CLIENT",
    "id": "14f3826f-31b8-48f5-b2f0-11f8d2c20321"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxNGYzODI2Zi0zMWI4LTQ4ZjUtYjJmMC0xMWY4ZDJjMjAzMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg4OTU0LCJpYXQiOjE3OTMyODgwNTQsImp0aSI6IjhiZDY2YTNjLTVkODItNDIyYS05YjE3LTY5OWMzMDMxMjBmOSIsInNpZCI6IjI3YTdiN2I2LTc5N2QtNDdkOC05YWIzLWEwNGZkMzEzMWJkNiJ9.n-4eVgUThTVKmIii6YQSzNysIL80xiCNiRdT_5ZWgKw",
  "access_expires_at": "2026-10-29T15:49:14.778851743Z",
  "refresh_token": "0VQcbN-_qifUgs1gteLe4Tj87X1hAmnSwicKPxy2ttI",
  "refresh_expires_at": "2026-11-28T15:34:14.778158327Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "6ae3dc50-fa33-47d6-8b14-277b7ced1773",
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
  "id": "d163c107-5c79-40e8-8c16-48f7c78ae66a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:39:14.998760Z",
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
  "command_id": "e244e463-c3e5-44a1-a16a-ceaee1f9c4a9",
  "quote_id": "d163c107-5c79-40e8-8c16-48f7c78ae66a",
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
  "id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
  "short_number": 1,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "14f3826f-31b8-48f5-b2f0-11f8d2c20321",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:34:15.266356Z",
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
    "id": "153adef2-1577-4e1e-9e0b-3adeba6af11e",
    "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
    "expires_at": "2026-10-29T15:34:30.278139Z",
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

`POST /api/driver/v1/offers/153adef2-1577-4e1e-9e0b-3adeba6af11e/accept` → **200**

```json
{
  "command_id": "f5cccfd6-da2c-4685-bbbd-96ec6cff2099"
}
```

```json
{
  "id": "389ad375-a03c-4bbc-93be-054275b71ea5",
  "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "174807c6-4fc7-4bb8-8b68-9a59a3f66292",
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
  "command_id": "9266d4ac-33d4-4b35-8581-a829ded4bd97",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:34:16.118934208Z"
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
  "id": "174807c6-4fc7-4bb8-8b68-9a59a3f66292",
  "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
  "assignment_id": "389ad375-a03c-4bbc-93be-054275b71ea5",
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

`POST /api/driver/v1/work-sessions/0219be9c-37b8-42d2-81ab-6f309a617de2/heartbeat` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:16Z",
    "sequence": 1793288056689
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "0219be9c-37b8-42d2-81ab-6f309a617de2",
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
  "last_heartbeat_at": "2026-10-29T15:34:16.710767Z",
  "last_location_at": "2026-10-29T15:34:16.710767Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/174807c6-4fc7-4bb8-8b68-9a59a3f66292/arrive` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "e5804f9f-5554-4612-92ae-af38081d1b4e",
  "expected_version": 0
}
```

```json
{
  "id": "174807c6-4fc7-4bb8-8b68-9a59a3f66292",
  "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
  "assignment_id": "389ad375-a03c-4bbc-93be-054275b71ea5",
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
  "arrived_at": "2026-10-29T15:34:16.909622Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/174807c6-4fc7-4bb8-8b68-9a59a3f66292/start` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "d0434f0e-2e71-4482-be40-54c1361f472f",
  "expected_version": 1
}
```

```json
{
  "id": "174807c6-4fc7-4bb8-8b68-9a59a3f66292",
  "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
  "assignment_id": "389ad375-a03c-4bbc-93be-054275b71ea5",
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
  "arrived_at": "2026-10-29T15:34:16.909622Z",
  "started_at": "2026-10-29T15:34:17.108629Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/174807c6-4fc7-4bb8-8b68-9a59a3f66292/complete` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "6966ee0c-c0e2-4acd-b260-9619ab101d96",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:34:17Z",
  "cash_received": true
}
```

```json
{
  "id": "174807c6-4fc7-4bb8-8b68-9a59a3f66292",
  "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
  "assignment_id": "389ad375-a03c-4bbc-93be-054275b71ea5",
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
  "arrived_at": "2026-10-29T15:34:16.909622Z",
  "started_at": "2026-10-29T15:34:17.108629Z",
  "completed_at": "2026-10-29T15:34:17.307786Z",
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
  "session_id": "0219be9c-37b8-42d2-81ab-6f309a617de2",
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
  "last_heartbeat_at": "2026-10-29T15:34:16.710767Z",
  "last_location_at": "2026-10-29T15:34:16.710767Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0219be9c-37b8-42d2-81ab-6f309a617de2/close` (X-App-Platform: DRIVER_ANDROID X-App-Version: 1.0.0) → **200**

```json
{
  "command_id": "f75ef634-382d-4c09-9e65-7a4c06287d0d",
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
  "command_id": "72ea377d-e5b8-4203-b15b-fb46dc115c1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:17Z",
    "sequence": 1793288057890
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
  "correlation_id": "46dad242-6edd-4bd1-ba17-3b2d7f2bd774",
  "minimum_version": "9.0.0"
}
```

## After the update he can

`POST /api/driver/v1/work-sessions` (X-App-Platform: DRIVER_ANDROID X-App-Version: 9.0.0) → **201**

```json
{
  "command_id": "3deb1597-9f89-4bcb-a113-f8d70bee5fd0",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:18Z",
    "sequence": 1793288058100
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3e72d0d4-2b96-4584-9759-65cbd022e3c1",
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
  "last_heartbeat_at": "2026-10-29T15:34:18.118693Z",
  "last_location_at": "2026-10-29T15:34:18.118693Z",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: force an update",
  "changed_at": "2026-10-29T15:34:16.118934Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "6afa8d08-4dae-4072-b32b-cb5f565ca871",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:34:18.508444923Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "3e72d0d4-2b96-4584-9759-65cbd022e3c1",
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
  "last_heartbeat_at": "2026-10-29T15:34:18.118693Z",
  "last_location_at": "2026-10-29T15:34:18.118693Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/3e72d0d4-2b96-4584-9759-65cbd022e3c1/close` → **200**

```json
{
  "command_id": "62fca321-44a9-4997-84bf-89659c14510d",
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
  "session_id": "747c5206-ee2f-4153-bfbe-f7312e0f7037",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5NTksImlhdCI6MTc5MzI4ODA1OSwianRpIjoiNTkyNzFlMjUtNTgwNi00OTkyLTg3ODEtYmViZGJhYzQxZmQ1Iiwic2lkIjoiNzQ3YzUyMDYtZWUyZi00MTUzLWJmYmUtZjczMTJlMGY3MDM3In0.jiVi-ZngrZ5yxq3uSmtH6ItxD-k1bMWToRQD3_N0t_Y",
  "access_expires_at": "2026-10-29T15:49:19.298294423Z",
  "refresh_token": "H8VcQJqrgf9HW7VzkJvYrewa4iEUh8y2v8UtzpUD6Mc",
  "refresh_expires_at": "2026-10-30T03:34:19.297652033Z",
  "password_change_required": false
}
```

`POST /api/admin/v1/promotions` → **201**

```json
{
  "command_id": "0cfd40fc-4cee-4e33-80f2-024e67e420b0",
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
  "id": "a2d112c1-a800-4b24-9bd2-07ad8dbb0757",
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
  "created_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "created_at": "2026-10-29T15:34:19.492674Z",
  "updated_at": "2026-10-29T15:34:19.492674Z"
}
```

## A rider signs in; the admin tops up the account with 50 ₴

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380631726696",
  "device_ref": "sandbox-7615"
}
```

```json
{
  "challenge_id": "f4e01070-3bd2-4deb-a66b-3ea60eb77485",
  "expires_at": "2026-10-29T15:39:19.693380586Z",
  "resend_available_at": "2026-10-29T15:34:20.693380586Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380631726696` → **200**

```json
{
  "phone": "+380631726696",
  "audience": "CLIENT",
  "code": "480190",
  "sent_at": "2026-10-29T15:34:19.696026126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f4e01070-3bd2-4deb-a66b-3ea60eb77485",
  "code": "480190",
  "device_ref": "sandbox-7615"
}
```

```json
{
  "session_id": "ada0b065-788c-4017-ac3b-3c893d6748e1",
  "subject": {
    "type": "CLIENT",
    "id": "a12d4713-ff26-4973-9455-ef297dc2398c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhMTJkNDcxMy1mZjI2LTQ5NzMtOTQ1NS1lZjI5N2RjMjM5OGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg4OTU5LCJpYXQiOjE3OTMyODgwNTksImp0aSI6ImJjMjdlOTBlLTU2ZDktNDQzOC1iNTczLWZiMzI3OWU3Nzg3MSIsInNpZCI6ImFkYTBiMDY1LTc4OGMtNDAxNy1hYzNiLTNjODkzZDY3NDhlMSJ9.Qny-xuRKAoHr13RS_2YH_IG7RlsUEkuJp3zcGIgNHqc",
  "access_expires_at": "2026-10-29T15:49:19.901158079Z",
  "refresh_token": "9BHiCTadPJKInEE5z8wvfBxEaYYltVkYZFwpbbiwsxo",
  "refresh_expires_at": "2026-11-28T15:34:19.900639924Z",
  "account_created": true
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380631726696` → **200**

```json
{
  "client_id": "a12d4713-ff26-4973-9455-ef297dc2398c"
}
```

`POST /api/admin/v1/rider-wallets/a12d4713-ff26-4973-9455-ef297dc2398c/top-ups` → **201**

```json
{
  "command_id": "705f670d-43ed-4992-a113-fac576e8ada5",
  "currency": "UAH",
  "amount_minor": 5000,
  "reason": "Вітальний бонус"
}
```

```json
{
  "client_id": "a12d4713-ff26-4973-9455-ef297dc2398c",
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
      "id": "f86d6bef-b9a2-41cd-ad98-cc1f83c92321",
      "at": "2026-10-29T15:34:20.272921Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_id": null
    }
  ]
}
```

## The rider sees the discount and pays 20 ₴ with bonuses

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1e1a8766-394c-4517-956c-3cb6689a1e08",
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
  "id": "91cde56f-16b5-4aee-aa08-b0fd63b196ba",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:39:20.480559Z",
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
      "id": "a2d112c1-a800-4b24-9bd2-07ad8dbb0757",
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
  "device_ref": "sandbox-26875"
}
```

```json
{
  "challenge_id": "11f4e1b2-a7aa-489a-aecd-c3f8679bc420",
  "expires_at": "2026-10-29T15:39:20.688852034Z",
  "resend_available_at": "2026-10-29T15:34:21.688852034Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "907933",
  "sent_at": "2026-10-29T15:34:20.691273321Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11f4e1b2-a7aa-489a-aecd-c3f8679bc420",
  "code": "907933",
  "device_ref": "sandbox-26875"
}
```

```json
{
  "session_id": "ba6cb9b7-4eea-4184-b351-49168c9a54ff",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4ODk2MCwiaWF0IjoxNzkzMjg4MDYwLCJqdGkiOiIwZjc3ZWZhNy1kM2ExLTQ2NTItOTg4Mi0zZjZjOWUxNDkyZjAiLCJzaWQiOiJiYTZjYjliNy00ZWVhLTQxODQtYjM1MS00OTE2OGM5YTU0ZmYifQ.1zsv1VGEEzBcITDxdjmcQd85rlfv6b6fU6A69xVhfuw",
  "access_expires_at": "2026-10-29T15:49:20.899712402Z",
  "refresh_token": "8bVj1DWfMj3zk2if3X6gQ1_8kOJ4Hnvll6wbp3DYq08",
  "refresh_expires_at": "2026-11-28T15:34:20.89909772Z",
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
  "command_id": "5d26a512-0384-4c00-ab2d-9f8445eb99e3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:21Z",
    "sequence": 1793288061265
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca7f303a-35ff-4a8e-bd13-adf7aa1057e7",
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
  "last_heartbeat_at": "2026-10-29T15:34:21.282801Z",
  "last_location_at": "2026-10-29T15:34:21.282801Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "33f709de-6953-4073-9b6c-7c0989fa16dd",
  "quote_id": "91cde56f-16b5-4aee-aa08-b0fd63b196ba",
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
  "id": "e51ceb59-a948-4b72-aef5-b709f163c043",
  "short_number": 2,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "a12d4713-ff26-4973-9455-ef297dc2398c",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:34:21.482925Z",
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
  "client_id": "a12d4713-ff26-4973-9455-ef297dc2398c",
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
      "id": "f86d6bef-b9a2-41cd-ad98-cc1f83c92321",
      "at": "2026-10-29T15:34:20.272921Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
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
    "id": "5df23295-4d4b-4814-baae-b9d283bfb0f0",
    "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
    "expires_at": "2026-10-29T15:34:36.489321Z",
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

`POST /api/driver/v1/offers/5df23295-4d4b-4814-baae-b9d283bfb0f0/accept` → **200**

```json
{
  "command_id": "2f1cdce9-b039-4457-af24-7b6fa9967faf"
}
```

```json
{
  "id": "0f063b7c-6059-4ba6-aa2d-6cf7bc4d5126",
  "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "858f9947-0be5-4c25-b55a-5c146495d145",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "858f9947-0be5-4c25-b55a-5c146495d145",
  "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
  "assignment_id": "0f063b7c-6059-4ba6-aa2d-6cf7bc4d5126",
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

`POST /api/driver/v1/work-sessions/ca7f303a-35ff-4a8e-bd13-adf7aa1057e7/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:22Z",
    "sequence": 1793288062413
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca7f303a-35ff-4a8e-bd13-adf7aa1057e7",
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
  "last_heartbeat_at": "2026-10-29T15:34:22.431881Z",
  "last_location_at": "2026-10-29T15:34:22.431881Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/858f9947-0be5-4c25-b55a-5c146495d145/arrive` → **200**

```json
{
  "command_id": "9f95333b-7c61-40b0-9558-b72a34a4c9cb",
  "expected_version": 0
}
```

```json
{
  "id": "858f9947-0be5-4c25-b55a-5c146495d145",
  "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
  "assignment_id": "0f063b7c-6059-4ba6-aa2d-6cf7bc4d5126",
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
  "arrived_at": "2026-10-29T15:34:22.62304Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`POST /api/driver/v1/trips/858f9947-0be5-4c25-b55a-5c146495d145/start` → **200**

```json
{
  "command_id": "13f77f29-5784-4fa1-b797-aadad4b2ffb4",
  "expected_version": 1
}
```

```json
{
  "id": "858f9947-0be5-4c25-b55a-5c146495d145",
  "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
  "assignment_id": "0f063b7c-6059-4ba6-aa2d-6cf7bc4d5126",
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
  "arrived_at": "2026-10-29T15:34:22.62304Z",
  "started_at": "2026-10-29T15:34:22.824479Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

Ivan collects 7465 minor units in cash

`POST /api/driver/v1/trips/858f9947-0be5-4c25-b55a-5c146495d145/complete` → **200**

```json
{
  "command_id": "d5e2db95-f51a-41c4-947a-89aba6d5acda",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:34:23Z",
  "cash_received": true
}
```

```json
{
  "id": "858f9947-0be5-4c25-b55a-5c146495d145",
  "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
  "assignment_id": "0f063b7c-6059-4ba6-aa2d-6cf7bc4d5126",
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
  "arrived_at": "2026-10-29T15:34:22.62304Z",
  "started_at": "2026-10-29T15:34:22.824479Z",
  "completed_at": "2026-10-29T15:34:23.030295Z",
  "needs_review": false,
  "wallet_minor": 2000,
  "discount_minor": 1052,
  "recipient": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "a12d4713-ff26-4973-9455-ef297dc2398c",
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
      "id": "061af380-9b6b-4948-96c2-9692492f8419",
      "at": "2026-10-29T15:34:23.814204Z",
      "kind": "TRIP_PAYMENT",
      "currency": "UAH",
      "amount_minor": -2000,
      "reason": "Trip paid with bonuses",
      "staff_id": null,
      "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043"
    },
    {
      "id": "f86d6bef-b9a2-41cd-ad98-cc1f83c92321",
      "at": "2026-10-29T15:34:20.272921Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 5000,
      "reason": "Вітальний бонус",
      "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_id": null
    }
  ]
}
```

## The promotion is stopped

`POST /api/admin/v1/promotions/a2d112c1-a800-4b24-9bd2-07ad8dbb0757/archive` → **200**

```json
{
  "command_id": "d00ebad8-820e-4a54-a923-0a2bcc96c658",
  "expected_version": 1,
  "reason": "Кінець акції"
}
```

```json
{
  "id": "a2d112c1-a800-4b24-9bd2-07ad8dbb0757",
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
  "created_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "created_at": "2026-10-29T15:34:19.492674Z",
  "updated_at": "2026-10-29T15:34:26.46696Z"
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "ca7f303a-35ff-4a8e-bd13-adf7aa1057e7",
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
  "last_heartbeat_at": "2026-10-29T15:34:22.431881Z",
  "last_location_at": "2026-10-29T15:34:22.431881Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/ca7f303a-35ff-4a8e-bd13-adf7aa1057e7/close` → **200**

```json
{
  "command_id": "6fe42bc3-9553-406e-bd98-1c80ba09f094",
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

Done: order e51ceb59-a948-4b72-aef5-b709f163c043.

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
  "session_id": "c28dc70d-cd95-4d1c-a79c-612cc5de9477",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5NjcsImlhdCI6MTc5MzI4ODA2NywianRpIjoiN2I0NjBlZjAtZTMxMy00NThhLTkzYjktYmRhMjkwMWVkMzE5Iiwic2lkIjoiYzI4ZGM3MGQtY2Q5NS00ZDFjLWE3OWMtNjEyY2M1ZGU5NDc3In0.X8gq9j9ELxV8e7oB-B27C4X5bblJnWEcAND3QfJO2FQ",
  "access_expires_at": "2026-10-29T15:49:27.245537818Z",
  "refresh_token": "YBkg1t7uFLYde9zvIuwHfSE818_iQje5ozOsr7njmI8",
  "refresh_expires_at": "2026-10-30T03:34:27.245080198Z",
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
  "command_id": "675da94e-c814-437a-9eeb-53da36cfa688",
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
  "session_id": "30263a4a-239a-40d4-b37e-ae671c825d49",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5NjgsImlhdCI6MTc5MzI4ODA2OCwianRpIjoiMjkxMDZmMGUtYjljMC00MTdjLThkZDQtOWFkODljNzVkZDE4Iiwic2lkIjoiMzAyNjNhNGEtMjM5YS00MGQ0LWIzN2UtYWU2NzFjODI1ZDQ5In0.AjyNjcp7cPLB5GXZSeyJEO04TS1I3605NQmZCR-3CRo",
  "access_expires_at": "2026-10-29T15:49:28.013418869Z",
  "refresh_token": "VCA2p_JXZwVU9q8eQrOrB1ney4NASrvcc0LV3MRG0a0",
  "refresh_expires_at": "2026-10-30T03:34:28.012903356Z",
  "password_change_required": false
}
```

## A call nobody takes: missed, no recording

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelCreated",
  "channel": {
    "id": "1730052700.2691718976",
    "linkedid": "1730052700.2691718976",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674349477"
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
    "id": "1730052700.2691718976",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=MISSED` → **200**

```json
{
  "calls": [
    {
      "id": "8cdba2f2-b77d-406f-b09d-d1d5fada6f1e",
      "direction": "INBOUND",
      "party": null,
      "state": "MISSED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.1993Z",
      "answered_at": null,
      "ended_at": "2026-10-29T15:34:28.219442Z",
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
    "id": "1730052600.1084721717",
    "linkedid": "1730052600.1084721717",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380674349477"
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
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

`POST /api/operator/v1/calls/fb657075-ecf8-4e9d-9cf0-717aab8de744/answer` → **200**

```json
{
  "command_id": "9a066905-ffe3-42e6-bd49-670d9c67f411"
}
```

```json
{
  "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380674349477",
  "called_number": "+380441110060",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "order_ids": [],
  "started_at": "2026-10-29T15:34:28.441365Z",
  "answered_at": "2026-10-29T15:34:28.652947Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052600.1084721717",
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
    "id": "1730052600.1084721717",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": "2026-10-29T15:34:28.652947Z",
      "ended_at": "2026-10-29T15:34:28.860799Z",
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
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": "2026-10-29T15:34:28.652947Z",
      "ended_at": "2026-10-29T15:34:28.860799Z",
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
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": "2026-10-29T15:34:28.652947Z",
      "ended_at": "2026-10-29T15:34:28.860799Z",
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
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": "2026-10-29T15:34:28.652947Z",
      "ended_at": "2026-10-29T15:34:28.860799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:34:34.580413Z"
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
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": "2026-10-29T15:34:28.652947Z",
      "ended_at": "2026-10-29T15:34:28.860799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:34:34.580413Z"
      }
    }
  ]
}
```

## Staff with calls.listen listen to it — the whole WAV, never cached

`GET /api/operator/v1/calls/fb657075-ecf8-4e9d-9cf0-717aab8de744/recording` → **200** (32044 bytes)

`GET /api/operator/v1/calls/fb657075-ecf8-4e9d-9cf0-717aab8de744/recording` → **200** (32044 bytes)

## Every listening is in the audit

`GET /api/admin/v1/logs/changes?action=call_recording.listen&resource_id=fb657075-ecf8-4e9d-9cf0-717aab8de744` → **200**

```json
{
  "changes": [
    {
      "id": "2e31a04c-9054-4761-908f-eab7e0ed7066",
      "occurred_at": "2026-10-29T15:34:35.861517Z",
      "actor_type": "STAFF",
      "actor_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"dbbce472-6d23-4891-a9c7-f5804e2e542f\", \"order_ids\": []}",
      "correlation_id": "9d61307a-0610-44c1-a9ae-66dc2bc420ac"
    },
    {
      "id": "f742faa1-5f49-4be7-be15-3b1fe07220e6",
      "occurred_at": "2026-10-29T15:34:35.835372Z",
      "actor_type": "STAFF",
      "actor_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "actor_role": "SUPER_ADMIN",
      "action": "call_recording.listen",
      "resource_type": "call",
      "resource_id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "reason": null,
      "before": null,
      "after": "{\"file_id\": \"dbbce472-6d23-4891-a9c7-f5804e2e542f\", \"order_ids\": []}",
      "correlation_id": "442b664a-ba33-4be7-a9a3-bbd9370c01b5"
    }
  ]
}
```

Done: call fb657075-ecf8-4e9d-9cf0-717aab8de744 recorded, listened to twice.

# Scenario: caller-sms

## Ivan is online near the pickup

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-4797"
}
```

```json
{
  "challenge_id": "a6040ac3-734a-471e-b546-ea26817f8a71",
  "expires_at": "2026-10-29T15:39:36.082854645Z",
  "resend_available_at": "2026-10-29T15:34:37.082854645Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "496789",
  "sent_at": "2026-10-29T15:34:36.086073239Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a6040ac3-734a-471e-b546-ea26817f8a71",
  "code": "496789",
  "device_ref": "sandbox-4797"
}
```

```json
{
  "session_id": "e1d32cda-1d56-4139-9c64-ac2993881e55",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4ODk3NiwiaWF0IjoxNzkzMjg4MDc2LCJqdGkiOiIxZDQ0MTI4OS1hZWQyLTQ3ZDMtOWFkNy1mNWFjYmRlZGEzM2IiLCJzaWQiOiJlMWQzMmNkYS0xZDU2LTQxMzktOWM2NC1hYzI5OTM4ODFlNTUifQ.MrDcfOOYxMGZ6xG8fdlgIzK7KerXzBLWagb6lmAnatA",
  "access_expires_at": "2026-10-29T15:49:36.291781644Z",
  "refresh_token": "_xzmLJNub03ZclRVsbjWQ6WrPh1csGhqJRO2FVOdyVk",
  "refresh_expires_at": "2026-11-28T15:34:36.291387991Z",
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
  "command_id": "eed75854-e5d4-424d-8ad3-1a4b14ea4e49",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:36Z",
    "sequence": 1793288076657
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51ce8b19-cf29-4a02-bfdf-e3d2662c113c",
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
  "last_heartbeat_at": "2026-10-29T15:34:36.675049Z",
  "last_location_at": "2026-10-29T15:34:36.675049Z",
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
  "session_id": "9cdc5ed4-9d56-4907-b1bc-cc4ee3267204",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5NzcsImlhdCI6MTc5MzI4ODA3NywianRpIjoiNTJjOThhMmUtOWQ1ZC00MDAxLTgyZDktOGQ5NDQwOTExY2IwIiwic2lkIjoiOWNkYzVlZDQtOWQ1Ni00OTA3LWIxYmMtY2M0ZWUzMjY3MjA0In0.x913PI92mijly6i0_nRLxqYgZI-qJ4Vvb0CEByUHmf8",
  "access_expires_at": "2026-10-29T15:49:37.132133921Z",
  "refresh_token": "Qvk_E9JLeBqpaFwlOx_Toa_Afse-WNCtnyvC46CtmNw",
  "refresh_expires_at": "2026-10-30T03:34:37.131655435Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "c47f611f-68dd-4d49-80d5-947c8548fb1d",
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
  "id": "cd97be20-04a9-4735-bf30-31f2cf12321e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:39:37.330411Z",
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
  "command_id": "5257e8b3-2223-4ead-b89d-e57e0160a425",
  "quote_id": "cd97be20-04a9-4735-bf30-31f2cf12321e",
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
    "phone": "+380670194609"
  }
}
```

```json
{
  "id": "e278987f-5430-4273-9408-f1ca92daa795",
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
  "created_at": "2026-10-29T15:34:37.544226Z",
  "caller": {
    "name": "Олена",
    "phone": "+380670194609"
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
    "id": "4aee678d-7f3c-40df-a2fa-e847d8eefecb",
    "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
    "expires_at": "2026-10-29T15:34:52.548236Z",
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

`POST /api/driver/v1/offers/4aee678d-7f3c-40df-a2fa-e847d8eefecb/accept` → **200**

```json
{
  "command_id": "fb2f7a0a-ee5a-41c2-b4a3-a68e8b9bbd34"
}
```

```json
{
  "id": "bbcdd967-1b7f-4060-bb7d-0747e3c6f9cb",
  "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "02bf9a1d-aac5-4150-992d-9cb3ace20960",
  "trip_phase": "TO_PICKUP"
}
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[]
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  }
]
```

SMS: До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  }
]
```

## Ivan is at the pickup: a second SMS

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "02bf9a1d-aac5-4150-992d-9cb3ace20960",
  "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
  "assignment_id": "bbcdd967-1b7f-4060-bb7d-0747e3c6f9cb",
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
    "phone": "+380670194609"
  }
}
```

`POST /api/driver/v1/work-sessions/51ce8b19-cf29-4a02-bfdf-e3d2662c113c/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:40Z",
    "sequence": 1793288080452
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "51ce8b19-cf29-4a02-bfdf-e3d2662c113c",
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
  "last_heartbeat_at": "2026-10-29T15:34:40.469633Z",
  "last_location_at": "2026-10-29T15:34:40.469633Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/02bf9a1d-aac5-4150-992d-9cb3ace20960/arrive` → **200**

```json
{
  "command_id": "044044c3-8d6e-4ab4-a8b3-6c6a14a1d201",
  "expected_version": 0
}
```

```json
{
  "id": "02bf9a1d-aac5-4150-992d-9cb3ace20960",
  "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
  "assignment_id": "bbcdd967-1b7f-4060-bb7d-0747e3c6f9cb",
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
  "arrived_at": "2026-10-29T15:34:40.734328Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670194609"
  }
}
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  },
  {
    "phone": "+380670194609",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:41.725595699Z"
  }
]
```

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  },
  {
    "phone": "+380670194609",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:41.725595699Z"
  }
]
```

SMS: Авто AA0001TX чекає на вас. Blizz Taxi

`GET /sandbox/v1/sms?phone=%2B380670194609` → **200**

```json
[
  {
    "phone": "+380670194609",
    "text": "До вас їде white Skoda Octavia, AA0001TX, водій Іван Петренко. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:39.718784352Z"
  },
  {
    "phone": "+380670194609",
    "text": "Авто AA0001TX чекає на вас. Blizz Taxi",
    "sent_at": "2026-10-29T15:34:41.725595699Z"
  }
]
```

## The ride goes on as usual

`POST /api/driver/v1/trips/02bf9a1d-aac5-4150-992d-9cb3ace20960/start` → **200**

```json
{
  "command_id": "bee16b00-6024-48c6-842d-33e505ed4636",
  "expected_version": 1
}
```

```json
{
  "id": "02bf9a1d-aac5-4150-992d-9cb3ace20960",
  "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
  "assignment_id": "bbcdd967-1b7f-4060-bb7d-0747e3c6f9cb",
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
  "arrived_at": "2026-10-29T15:34:40.734328Z",
  "started_at": "2026-10-29T15:34:42.022223Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Олена",
    "phone": "+380670194609"
  }
}
```

`POST /api/driver/v1/trips/02bf9a1d-aac5-4150-992d-9cb3ace20960/complete` → **200**

```json
{
  "command_id": "22be272a-82ed-4cff-a341-5e292e43a17c",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:34:42Z",
  "cash_received": true
}
```

```json
{
  "id": "02bf9a1d-aac5-4150-992d-9cb3ace20960",
  "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
  "assignment_id": "bbcdd967-1b7f-4060-bb7d-0747e3c6f9cb",
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
  "arrived_at": "2026-10-29T15:34:40.734328Z",
  "started_at": "2026-10-29T15:34:42.022223Z",
  "completed_at": "2026-10-29T15:34:42.222317Z",
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
  "session_id": "51ce8b19-cf29-4a02-bfdf-e3d2662c113c",
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
  "last_heartbeat_at": "2026-10-29T15:34:40.469633Z",
  "last_location_at": "2026-10-29T15:34:40.469633Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/51ce8b19-cf29-4a02-bfdf-e3d2662c113c/close` → **200**

```json
{
  "command_id": "5aeb36cf-d0c8-4572-a497-d71e5419669d",
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
  "phone": "+380634973190",
  "device_ref": "sandbox-4404"
}
```

```json
{
  "challenge_id": "ca66848a-d54a-4eee-b8eb-6c7ce9df3fab",
  "expires_at": "2026-10-29T15:39:42.803012155Z",
  "resend_available_at": "2026-10-29T15:34:43.803012155Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380634973190` → **200**

```json
{
  "phone": "+380634973190",
  "audience": "CLIENT",
  "code": "007747",
  "sent_at": "2026-10-29T15:34:42.806455613Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "ca66848a-d54a-4eee-b8eb-6c7ce9df3fab",
  "code": "007747",
  "device_ref": "sandbox-4404"
}
```

```json
{
  "session_id": "7fa8e323-03a9-4911-be63-60aa963297f9",
  "subject": {
    "type": "CLIENT",
    "id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyMDY1YWQxYy0wMjdmLTRhOWQtYmVmMi00OWY0MDFlNjNkNmIiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg4OTgzLCJpYXQiOjE3OTMyODgwODMsImp0aSI6IjcyMTZiODQ2LWNkOWMtNGYwMC04MTI0LTcyYzI4ODQxZGNhMiIsInNpZCI6IjdmYThlMzIzLTAzYTktNDkxMS1iZTYzLTYwYWE5NjMyOTdmOSJ9.Li5umAhdBU84A5uT94dV7k8Q239ijFaRaHFtrX47POA",
  "access_expires_at": "2026-10-29T15:49:43.026515644Z",
  "refresh_token": "OZODt56c2PIeHHMtelOE2rPVweVKy-hjfZ8IH2HkrUM",
  "refresh_expires_at": "2026-11-28T15:34:43.025788687Z",
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
  "device_ref": "sandbox-24477"
}
```

```json
{
  "challenge_id": "f6c81423-be5b-4342-80f3-c99268b82c0c",
  "expires_at": "2026-10-29T15:39:43.391941761Z",
  "resend_available_at": "2026-10-29T15:34:44.391941761Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "649578",
  "sent_at": "2026-10-29T15:34:43.394462827Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f6c81423-be5b-4342-80f3-c99268b82c0c",
  "code": "649578",
  "device_ref": "sandbox-24477"
}
```

```json
{
  "session_id": "334b2d8b-9bca-4be0-8823-6e4aed28bbfc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4ODk4MywiaWF0IjoxNzkzMjg4MDgzLCJqdGkiOiI4MmNkZmM1Ny0wYzA0LTQ2NmEtYmM0YS01MTczY2E0YjlhMzUiLCJzaWQiOiIzMzRiMmQ4Yi05YmNhLTRiZTAtODgyMy02ZTRhZWQyOGJiZmMifQ.q-z2fBY5gHa_oghxf9HasAGLZbnelkpPqOLiDpIo684",
  "access_expires_at": "2026-10-29T15:49:43.605873859Z",
  "refresh_token": "2m-gU9eYfFcrHEXgA1m-s2MTCUh6G-vmBkaIkN-ECGY",
  "refresh_expires_at": "2026-11-28T15:34:43.605459118Z",
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
  "session_id": "20c1c0b0-8ffe-4b9f-a160-28d2df4a9d05",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5ODQsImlhdCI6MTc5MzI4ODA4NCwianRpIjoiYTRiOGE3Y2QtMGQzMi00OGU0LTgzN2ItZGIzNGIzNWRkNmVhIiwic2lkIjoiMjBjMWMwYjAtOGZmZS00YjlmLWExNjAtMjhkMmRmNGE5ZDA1In0.ZRTfhLmnILOZvITLQZ4mHG34uahZ8O5VwEgb4V6ZOd8",
  "access_expires_at": "2026-10-29T15:49:44.177303846Z",
  "refresh_token": "ZeroCbz7ZJhvdQiqWz9vXPQ3_UPmO6QUpNCrz11a4Cc",
  "refresh_expires_at": "2026-10-30T03:34:44.176960158Z",
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
  "session_id": "373fa8ef-d447-4f80-a5bf-a53681ec2c91",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODg5ODQsImlhdCI6MTc5MzI4ODA4NCwianRpIjoiMGQ5ZmNlZTMtZWY1ZS00MDczLWI2MWYtMTg0MDg5NjVjOWEwIiwic2lkIjoiMzczZmE4ZWYtZDQ0Ny00ZjgwLWE1YmYtYTUzNjgxZWMyYzkxIn0.0h4AOAGsj9w6T6X-Elh13uMMeHeKg--QtduBq4JWgfo",
  "access_expires_at": "2026-10-29T15:49:44.575912065Z",
  "refresh_token": "61xthn8LZtOV7dH8dFTYAQFBjNuBUPm8O7skMLJ7G3A",
  "refresh_expires_at": "2026-10-30T03:34:44.575520924Z",
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
  "command_id": "3d47428a-16c5-461e-91f2-183e1dfb57db",
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
  "id": "e726ad90-77f7-4ea9-8bee-4005e97e5009",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:39:44.940609Z",
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
  "command_id": "2e1b0225-42b1-4500-b7e5-da3fcec5bd20",
  "quote_id": "e726ad90-77f7-4ea9-8bee-4005e97e5009",
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
  "id": "1bf104dc-271f-4780-8df4-60525761061b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b",
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
  "created_at": "2026-10-29T15:34:45.135232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1bf104dc-271f-4780-8df4-60525761061b` → **200**

```json
{
  "id": "1bf104dc-271f-4780-8df4-60525761061b",
  "short_number": 4,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b",
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
  "created_at": "2026-10-29T15:34:45.135232Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/1bf104dc-271f-4780-8df4-60525761061b/cancel` → **200**

```json
{
  "command_id": "2f1dc199-e18d-49ab-8b63-0017031916f7",
  "expected_version": 2,
  "reason_code": "WAIT_TOO_LONG"
}
```

```json
{
  "id": "1bf104dc-271f-4780-8df4-60525761061b",
  "short_number": 4,
  "status": "CANCELLED",
  "status_reason": "WAIT_TOO_LONG",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b",
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
  "created_at": "2026-10-29T15:34:45.135232Z",
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
  "command_id": "4799e15b-6e19-448a-9e03-32bd7525e038",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4590,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:45Z",
    "sequence": 1793288085904
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e780e85-00bb-493e-9571-0877b8247a1d",
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
  "last_heartbeat_at": "2026-10-29T15:34:45.921585Z",
  "last_location_at": "2026-10-29T15:34:45.921585Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-1357"
}
```

```json
{
  "challenge_id": "d7f6f955-ce2f-4437-903b-d5a079750d18",
  "expires_at": "2026-10-29T15:39:46.108700536Z",
  "resend_available_at": "2026-10-29T15:34:47.108700536Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "323492",
  "sent_at": "2026-10-29T15:34:46.111081032Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d7f6f955-ce2f-4437-903b-d5a079750d18",
  "code": "323492",
  "device_ref": "sandbox-1357"
}
```

```json
{
  "session_id": "29eb3ca9-51ab-450b-b184-ccfa43f0b5f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4ODk4NiwiaWF0IjoxNzkzMjg4MDg2LCJqdGkiOiI3NDhmN2ZlNC03NDdlLTRiYWQtYjliYS0zMTYxNjIzOWU5MGMiLCJzaWQiOiIyOWViM2NhOS01MWFiLTQ1MGItYjE4NC1jY2ZhNDNmMGI1ZjUifQ.IS_gp7yZrcDpyu3pdT-KspBQNqdvrc1S7AOJ_g-lFgk",
  "access_expires_at": "2026-10-29T15:49:46.317566328Z",
  "refresh_token": "ndCxPzSgjCUEEAgjPqOt1SBD91h4VyGJSE4P9EbLKAE",
  "refresh_expires_at": "2026-11-28T15:34:46.317200427Z",
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
  "command_id": "8d2f1c62-9d62-4d9d-8b56-104818bf96f5",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4650,
    "lon": 30.5238,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:46Z",
    "sequence": 1793288086683
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:34:46.702074Z",
  "last_location_at": "2026-10-29T15:34:46.702074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3c48a618-57f3-4c8b-934e-6f9522444c53",
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
  "id": "8de614c9-e6d7-4c85-ac76-5fcd256f1d25",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:39:46.897717Z",
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
  "command_id": "4e1af180-1198-4169-8a81-8da67f39f415",
  "quote_id": "8de614c9-e6d7-4c85-ac76-5fcd256f1d25",
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
  "id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b",
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
  "created_at": "2026-10-29T15:34:47.093779Z",
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
    "id": "70ec73bf-b06e-4a48-a30d-de2b893264ec",
    "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
    "expires_at": "2026-10-29T15:35:02.09656Z",
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

`POST /api/driver/v1/offers/70ec73bf-b06e-4a48-a30d-de2b893264ec/accept` → **200**

```json
{
  "command_id": "0dc5bfe9-e4d8-4755-bccb-fad9d25f9ab7"
}
```

```json
{
  "id": "38b9983a-87bd-4595-a259-6edb15f66087",
  "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "651d927d-25d7-44b7-a8ad-10989b6323e7",
  "trip_phase": "TO_PICKUP"
}
```

## Oleh gives it back: «Неисправность автомобиля» — the order returns to the search

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "651d927d-25d7-44b7-a8ad-10989b6323e7",
  "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "assignment_id": "38b9983a-87bd-4595-a259-6edb15f66087",
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

`POST /api/driver/v1/trips/651d927d-25d7-44b7-a8ad-10989b6323e7/cancel` → **200**

```json
{
  "command_id": "4b2a78b6-de23-4fba-8d93-b4fcde150bac",
  "expected_version": 0,
  "reason_code": "VEHICLE_PROBLEM"
}
```

```json
{
  "id": "651d927d-25d7-44b7-a8ad-10989b6323e7",
  "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "assignment_id": "38b9983a-87bd-4595-a259-6edb15f66087",
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

`GET /api/rider/v1/orders/0dd078f2-6824-4469-84b4-b2dd1f181540` → **200**

```json
{
  "id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "short_number": 5,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b",
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
    "id": "38b9983a-87bd-4595-a259-6edb15f66087",
    "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "651d927d-25d7-44b7-a8ad-10989b6323e7",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:34:47.093779Z",
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
    "id": "a2fbab98-a420-452d-96f8-d3e2843eea77",
    "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
    "expires_at": "2026-10-29T15:35:02.854579Z",
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

`POST /api/driver/v1/offers/a2fbab98-a420-452d-96f8-d3e2843eea77/accept` → **200**

```json
{
  "command_id": "e8b8bac8-da0a-4e50-b982-0d6e4b65584b"
}
```

```json
{
  "id": "ea8ce045-ac3a-4a80-a10e-6f366a88e2cc",
  "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "8c65f99f-1ca0-4a3d-bf3f-21c9f0a6e00d",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "8c65f99f-1ca0-4a3d-bf3f-21c9f0a6e00d",
  "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "assignment_id": "ea8ce045-ac3a-4a80-a10e-6f366a88e2cc",
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

`POST /api/driver/v1/trips/8c65f99f-1ca0-4a3d-bf3f-21c9f0a6e00d/cancel` → **200**

```json
{
  "command_id": "ffa08b54-de1e-4b20-9f62-1600bfcc27c4",
  "expected_version": 0,
  "reason_code": "PASSENGER_ASKED"
}
```

```json
{
  "id": "8c65f99f-1ca0-4a3d-bf3f-21c9f0a6e00d",
  "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
  "assignment_id": "ea8ce045-ac3a-4a80-a10e-6f366a88e2cc",
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
    "id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
    "short_number": 5,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:34:47.093779Z",
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
    "id": "1bf104dc-271f-4780-8df4-60525761061b",
    "short_number": 4,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:34:45.135232Z",
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

`GET /api/operator/v1/orders/0dd078f2-6824-4469-84b4-b2dd1f181540/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:34:47.09433Z",
      "actor": {
        "type": "CLIENT",
        "id": "2065ad1c-027f-4a9d-bef2-49f401e63d6b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
        "quote_id": "8de614c9-e6d7-4c85-ac76-5fcd256f1d25",
        "price_minor": 30533,
        "payment_method": "CASH"
      },
      "correlation_id": "1d103c51-67b0-4ff9-9a7c-109e35f7053e"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:34:47.095937Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
        "attempt_id": "3aacf0a7-529f-4751-b05d-242d27bc3ae5",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "1d103c51-67b0-4ff9-9a7c-109e35f7053e"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:34:47.10078Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "70ec73bf-b06e-4a48-a30d-de2b893264ec",
        "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "distance_m": 478
      },
      "correlation_id": "1d103c51-67b0-4ff9-9a7c-109e35f7053e"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:34:47.474716Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000402",
        "name": "Олег Коваль",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "70ec73bf-b06e-4a48-a30d-de2b893264ec",
        "order_id": "0dd078f2-6824-4469-84b4-b2dd1f181540",
        "driver_id": "5a000000-0000-4000-8000-000000000402",
        "assignment_id": "38b9983a-87bd-4595-a259-6edb15f66087"
      },
      "correlation_id": "8edee28d-fc7c-498e-afe2-5f7411676871"
```

Done: orders 1bf104dc-271f-4780-8df4-60525761061b, 0dd078f2-6824-4469-84b4-b2dd1f181540.

# Scenario: card-ride

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380737151302",
  "device_ref": "sandbox-9668"
}
```

```json
{
  "challenge_id": "982633a2-5baf-4a32-a101-23dffc500520",
  "expires_at": "2026-10-29T15:39:49.379806641Z",
  "resend_available_at": "2026-10-29T15:34:50.379806641Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380737151302` → **200**

```json
{
  "phone": "+380737151302",
  "audience": "CLIENT",
  "code": "691652",
  "sent_at": "2026-10-29T15:34:49.382767291Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "982633a2-5baf-4a32-a101-23dffc500520",
  "code": "691652",
  "device_ref": "sandbox-9668"
}
```

```json
{
  "session_id": "8ee7708a-7c2f-4fb8-ae1d-2b56719b0d58",
  "subject": {
    "type": "CLIENT",
    "id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0YWQzYzBiNy04YTliLTRmM2UtOGMxNy01YWU2NDkxYzM5MDQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg4OTg5LCJpYXQiOjE3OTMyODgwODksImp0aSI6ImY3NWMxNDJmLTg1NjMtNDZmMi04ZWU1LTkyMmJhY2YyMTYxMiIsInNpZCI6IjhlZTc3MDhhLTdjMmYtNGZiOC1hZTFkLTJiNTY3MTliMGQ1OCJ9.jWBjCbTnCdEH84pATT10NM8Is8Un9dYVLWe71HsyPik",
  "access_expires_at": "2026-10-29T15:49:49.590945191Z",
  "refresh_token": "RdBX5S4OYF2_blLDKKcHgO0T7812Kyiu9DmaJz43OKU",
  "refresh_expires_at": "2026-11-28T15:34:49.590531076Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "0e0f0d20-fcfa-44c3-a8ef-cc80a639e547",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "5121066f-a48b-4856-b4e0-92e42796495a",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-5121066f-a48b-4856-b4e0-92e42796495a",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "bca99746a8fe32795c7fd749015ae24f",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=5121066f-a48b-4856-b4e0-92e42796495a",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380737151302"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=5121066f-a48b-4856-b4e0-92e42796495a",
  "expires_at": "2026-10-29T16:04:49.78073Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/5121066f-a48b-4856-b4e0-92e42796495a` → **200**

```json
{
  "id": "5121066f-a48b-4856-b4e0-92e42796495a",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:04:49.78073Z",
  "card": {
    "id": "461f2732-a072-464e-b692-72b4d31cdde1",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****1092",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:34:49.978439Z"
  },
  "failure_reason": null
}
```

`GET /api/rider/v1/cards` → **200**

```json
{
  "cards": [
    {
      "id": "461f2732-a072-464e-b692-72b4d31cdde1",
      "merchant_id": "5a000000-0000-4000-8000-000000000601",
      "masked_pan": "41****1092",
      "card_type": "Visa",
      "created_at": "2026-10-29T15:34:49.978439Z"
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
  "device_ref": "sandbox-30260"
}
```

```json
{
  "challenge_id": "d2b21682-65d3-4560-84a1-44d91129f4de",
  "expires_at": "2026-10-29T15:39:50.357971148Z",
  "resend_available_at": "2026-10-29T15:34:51.357971148Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "419685",
  "sent_at": "2026-10-29T15:34:50.36036013Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d2b21682-65d3-4560-84a1-44d91129f4de",
  "code": "419685",
  "device_ref": "sandbox-30260"
}
```

```json
{
  "session_id": "d422297c-ab2d-4284-a310-846b18256cac",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4ODk5MCwiaWF0IjoxNzkzMjg4MDkwLCJqdGkiOiI2MTI2NWU5OC0zZmFmLTQ1NDItOTAwYi05NTdkZTU0YzY5OGYiLCJzaWQiOiJkNDIyMjk3Yy1hYjJkLTQyODQtYTMxMC04NDZiMTgyNTZjYWMifQ.9nJTAnKQXii0Ao6206lZEXbYOaUf7GyCeIml8REcHxM",
  "access_expires_at": "2026-10-29T15:49:50.564360295Z",
  "refresh_token": "cAdaKeYFOj7C4cDY4v8nQwWp6rliIt-9g5l18kAOCm0",
  "refresh_expires_at": "2026-11-28T15:34:50.563968244Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:34:46.702074Z",
  "last_location_at": "2026-10-29T15:34:46.702074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a93bb18-7227-4b8d-83c5-5acaf847cb67/handover` → **200**

```json
{
  "command_id": "61c6ad7b-4ac1-42fa-b186-5960cd988c71",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:34:46.702074Z",
  "last_location_at": "2026-10-29T15:34:46.702074Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a93bb18-7227-4b8d-83c5-5acaf847cb67/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:51Z",
    "sequence": 1793288091132
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:34:51.148538Z",
  "last_location_at": "2026-10-29T15:34:51.148538Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "05139c5b-9956-47a7-9339-fb6f69fd8f34",
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
  "id": "fb4c3591-3756-4926-8c52-677fcc0a35d7",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:39:51.341865Z",
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
  "command_id": "7e09ce5f-c2ac-431b-a088-66f13877f494",
  "quote_id": "fb4c3591-3756-4926-8c52-677fcc0a35d7",
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
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
  "created_at": "2026-10-29T15:34:51.538988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8` → **200**

```json
{
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
  "created_at": "2026-10-29T15:34:51.538988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8` → **200**

```json
{
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
  "created_at": "2026-10-29T15:34:51.538988Z",
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
    "id": "c3ad8e3b-814e-45a8-a8e6-d26d234a29e9",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "expires_at": "2026-10-29T15:35:07.022622Z",
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

`POST /api/driver/v1/offers/c3ad8e3b-814e-45a8-a8e6-d26d234a29e9/accept` → **200**

```json
{
  "command_id": "f6cf5ccc-6f97-4759-861e-7f6c7bbb0fde"
}
```

```json
{
  "id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "assignment_id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
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

`POST /api/driver/v1/work-sessions/2a93bb18-7227-4b8d-83c5-5acaf847cb67/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:34:53Z",
    "sequence": 1793288093694
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:34:53.711063Z",
  "last_location_at": "2026-10-29T15:34:53.711063Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/282ba74b-9882-4516-9c7e-8b1c0f346e97/arrive` → **200**

```json
{
  "command_id": "4782cda1-3c31-4a24-a4f4-e9e5781a7e01",
  "expected_version": 0
}
```

```json
{
  "id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "assignment_id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
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
  "arrived_at": "2026-10-29T15:34:53.904105Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/282ba74b-9882-4516-9c7e-8b1c0f346e97/start` → **200**

```json
{
  "command_id": "4b4cf661-6ce6-4897-a4df-cab783216537",
  "expected_version": 1
}
```

```json
{
  "id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "assignment_id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
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
  "arrived_at": "2026-10-29T15:34:53.904105Z",
  "started_at": "2026-10-29T15:34:54.101888Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/282ba74b-9882-4516-9c7e-8b1c0f346e97/complete` → **200**

```json
{
  "command_id": "04ad7fd4-f436-473c-98e8-97fe4492df2b",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:34:54Z",
  "cash_received": true
}
```

```json
{
  "id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "assignment_id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
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
  "arrived_at": "2026-10-29T15:34:53.904105Z",
  "started_at": "2026-10-29T15:34:54.101888Z",
  "completed_at": "2026-10-29T15:34:54.297205Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The bank takes the money after the trip

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8` → **200**

```json
{
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
    "id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:34:51.538988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8` → **200**

```json
{
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
    "id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:34:51.538988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8` → **200**

```json
{
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
    "id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:34:51.538988Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8` → **200**

```json
{
  "id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "short_number": 6,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
    "id": "b7a81ac1-9488-486c-87ca-b991c0707bfe",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "282ba74b-9882-4516-9c7e-8b1c0f346e97",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:34:51.538988Z",
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

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8/tip` → **200**

```json
{
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
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
  "available_until": "2026-10-30T15:34:54.297205Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8/tip` → **201**

```json
{
  "command_id": "de2157c6-43ac-4ee8-8255-2bb6a9129c31",
  "amount_minor": 2500
}
```

```json
{
  "id": "4267c951-0e91-4aad-9b63-31b26f78fec3",
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:34:58.625231Z"
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8/tip` → **200**

```json
{
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
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
  "available_until": "2026-10-30T15:34:54.297205Z",
  "open": false,
  "tip": {
    "id": "4267c951-0e91-4aad-9b63-31b26f78fec3",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:34:58.625231Z"
  }
}
```

`GET /api/rider/v1/orders/1c01dac7-a605-488e-848c-74765ee8bdd8/tip` → **200**

```json
{
  "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
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
  "available_until": "2026-10-30T15:34:54.297205Z",
  "open": false,
  "tip": {
    "id": "4267c951-0e91-4aad-9b63-31b26f78fec3",
    "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:34:58.625231Z"
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
      "id": "6cf115e0-de38-416b-a31a-1a05658f4029",
      "at": "2026-10-29T15:35:00.11523Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
      "counterpart_id": null
    },
    {
      "id": "40660030-2eee-4a77-a830-ef7332b78723",
      "at": "2026-10-29T15:34:55.072571Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
      "counterpart_id": null
    }
  ]
}
```

## The rider orders by card: the hold comes first, then the search

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5764ddba-3016-45a4-847e-886b1579e788",
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
  "id": "ef480983-96b7-4920-9bf4-77bcf0bf2131",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:00.385415Z",
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
  "session_id": "6cd0e350-15a0-4234-a0d6-6d3a20c23298",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwMDAsImlhdCI6MTc5MzI4ODEwMCwianRpIjoiMTRkMDc1YzktOTc2My00NzlmLWI2Y2EtYjU1NzdjYjc2MTU0Iiwic2lkIjoiNmNkMGUzNTAtMTVhMC00MjM0LWEwZDYtNmQzYTIwYzIzMjk4In0.t8HAk6m2fIE0Lrn5MdsaQ2z1kr2Dc_LkPabm9c7Y9u0",
  "access_expires_at": "2026-10-29T15:50:00.779966699Z",
  "refresh_token": "FS1ga0RlFF_lTWBLxUdrmftrToflD7m_-l09t7b5GyM",
  "refresh_expires_at": "2026-10-30T03:35:00.779651584Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/rider-wallets?phone=%2B380737151302` → **200**

```json
{
  "client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904"
}
```

`POST /api/admin/v1/rider-wallets/4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904/top-ups` → **201**

```json
{
  "command_id": "beed4280-2b88-4426-862d-574baf8c2cc1",
  "currency": "UAH",
  "amount_minor": 16597,
  "reason": "Bonus fare test"
}
```

```json
{
  "client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
      "id": "bbecdaad-7cca-4de7-a868-fd82c1266da9",
      "at": "2026-10-29T15:35:01.136811Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_id": null
    }
  ]
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "4e61425e-c76d-4c43-bd5a-c66b0e224585",
  "quote_id": "ef480983-96b7-4920-9bf4-77bcf0bf2131",
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
  "id": "c858352c-7723-441d-913b-2767d8821bd5",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
  "created_at": "2026-10-29T15:35:01.332634Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/c858352c-7723-441d-913b-2767d8821bd5` → **200**

```json
{
  "id": "c858352c-7723-441d-913b-2767d8821bd5",
  "short_number": 7,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
  "created_at": "2026-10-29T15:35:01.332634Z",
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
    "id": "19b69af5-38bf-4635-b5cb-44e12cd74b68",
    "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
    "expires_at": "2026-10-29T15:35:16.336196Z",
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

`POST /api/driver/v1/offers/19b69af5-38bf-4635-b5cb-44e12cd74b68/accept` → **200**

```json
{
  "command_id": "a7360f91-33c0-4187-98a5-c7531b6b0994"
}
```

```json
{
  "id": "bbc288a0-7736-427c-b691-bd046403cfc5",
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "03977301-d871-41b3-abe6-0aa055beeec4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "03977301-d871-41b3-abe6-0aa055beeec4",
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
  "assignment_id": "bbc288a0-7736-427c-b691-bd046403cfc5",
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

`POST /api/driver/v1/work-sessions/2a93bb18-7227-4b8d-83c5-5acaf847cb67/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:02Z",
    "sequence": 1793288102257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:35:02.274596Z",
  "last_location_at": "2026-10-29T15:35:02.274596Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/03977301-d871-41b3-abe6-0aa055beeec4/arrive` → **200**

```json
{
  "command_id": "bea8224c-d4ce-43bd-93b7-2bcca8b298f9",
  "expected_version": 0
}
```

```json
{
  "id": "03977301-d871-41b3-abe6-0aa055beeec4",
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
  "assignment_id": "bbc288a0-7736-427c-b691-bd046403cfc5",
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
  "arrived_at": "2026-10-29T15:35:02.463795Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/03977301-d871-41b3-abe6-0aa055beeec4/start` → **200**

```json
{
  "command_id": "7ca23f72-970b-46ed-8bdf-88683ec3efc3",
  "expected_version": 1
}
```

```json
{
  "id": "03977301-d871-41b3-abe6-0aa055beeec4",
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
  "assignment_id": "bbc288a0-7736-427c-b691-bd046403cfc5",
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
  "arrived_at": "2026-10-29T15:35:02.463795Z",
  "started_at": "2026-10-29T15:35:02.654746Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 16297,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/03977301-d871-41b3-abe6-0aa055beeec4/complete` → **200**

```json
{
  "command_id": "686bab5a-68ac-488b-97bb-097ff23076f5",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:35:02Z",
  "cash_received": true
}
```

```json
{
  "id": "03977301-d871-41b3-abe6-0aa055beeec4",
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
  "assignment_id": "bbc288a0-7736-427c-b691-bd046403cfc5",
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
  "arrived_at": "2026-10-29T15:35:02.463795Z",
  "started_at": "2026-10-29T15:35:02.654746Z",
  "completed_at": "2026-10-29T15:35:02.855623Z",
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
  "client_id": "4ad3c0b7-8a9b-4f3e-8c17-5ae6491c3904",
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
      "id": "bbecdaad-7cca-4de7-a868-fd82c1266da9",
      "at": "2026-10-29T15:35:01.136811Z",
      "kind": "STAFF_TOP_UP",
      "currency": "UAH",
      "amount_minor": 16597,
      "reason": "Bonus fare test",
      "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
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

`GET /api/rider/v1/orders/c858352c-7723-441d-913b-2767d8821bd5/tip` → **200**

```json
{
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
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
  "available_until": "2026-10-30T15:35:02.855623Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/c858352c-7723-441d-913b-2767d8821bd5/tip` → **201**

```json
{
  "command_id": "4a227241-d390-479b-b34f-2636ff98f61f",
  "amount_minor": 2500
}
```

```json
{
  "id": "63143c65-3f4d-4bd4-b2c4-8916eb46af4e",
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
  "amount_minor": 2500,
  "currency": "UAH",
  "method": "CARD",
  "state": "PENDING",
  "failure_reason": null,
  "created_at": "2026-10-29T15:35:03.599041Z"
}
```

`GET /api/rider/v1/orders/c858352c-7723-441d-913b-2767d8821bd5/tip` → **200**

```json
{
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
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
  "available_until": "2026-10-30T15:35:02.855623Z",
  "open": false,
  "tip": {
    "id": "63143c65-3f4d-4bd4-b2c4-8916eb46af4e",
    "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PENDING",
    "failure_reason": null,
    "created_at": "2026-10-29T15:35:03.599041Z"
  }
}
```

`GET /api/rider/v1/orders/c858352c-7723-441d-913b-2767d8821bd5/tip` → **200**

```json
{
  "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
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
  "available_until": "2026-10-30T15:35:02.855623Z",
  "open": false,
  "tip": {
    "id": "63143c65-3f4d-4bd4-b2c4-8916eb46af4e",
    "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
    "amount_minor": 2500,
    "currency": "UAH",
    "method": "CARD",
    "state": "PAID",
    "failure_reason": null,
    "created_at": "2026-10-29T15:35:03.599041Z"
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
      "id": "50eca66c-314d-4ebe-8e3f-f49951f79f56",
      "at": "2026-10-29T15:35:03.144726Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
      "counterpart_id": null
    },
    {
      "id": "6cf115e0-de38-416b-a31a-1a05658f4029",
      "at": "2026-10-29T15:35:00.11523Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
      "counterpart_id": null
    },
    {
      "id": "40660030-2eee-4a77-a830-ef7332b78723",
      "at": "2026-10-29T15:34:55.072571Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
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
      "id": "67d39cf1-4989-4f9e-8fd0-c6a3b5622962",
      "at": "2026-10-29T15:35:05.175504Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
      "counterpart_id": null
    },
    {
      "id": "50eca66c-314d-4ebe-8e3f-f49951f79f56",
      "at": "2026-10-29T15:35:03.144726Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "c858352c-7723-441d-913b-2767d8821bd5",
      "counterpart_id": null
    },
    {
      "id": "6cf115e0-de38-416b-a31a-1a05658f4029",
      "at": "2026-10-29T15:35:00.11523Z",
      "kind": "TIP",
      "currency": "UAH",
      "amount_minor": 2500,
      "reason": "Tip for the driver",
      "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
      "counterpart_id": null
    },
    {
      "id": "40660030-2eee-4a77-a830-ef7332b78723",
      "at": "2026-10-29T15:34:55.072571Z",
      "kind": "TRIP_FARE",
      "currency": "UAH",
      "amount_minor": 13852,
      "reason": "Fare of a completed trip, final fare v1",
      "order_id": "1c01dac7-a605-488e-848c-74765ee8bdd8",
      "counterpart_id": null
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "2a93bb18-7227-4b8d-83c5-5acaf847cb67",
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
  "last_heartbeat_at": "2026-10-29T15:35:02.274596Z",
  "last_location_at": "2026-10-29T15:35:02.274596Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2a93bb18-7227-4b8d-83c5-5acaf847cb67/close` → **200**

```json
{
  "command_id": "4ce966a3-168a-4217-a9da-64a9e99e5e06",
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

Done: card order c858352c-7723-441d-913b-2767d8821bd5.

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
  "phone": "+380732807519",
  "device_ref": "sandbox-22480"
}
```

```json
{
  "challenge_id": "18c5c10c-371b-4f17-b47c-0e55c23644e7",
  "expires_at": "2026-10-29T15:40:07.082120006Z",
  "resend_available_at": "2026-10-29T15:35:08.082120006Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380732807519` → **200**

```json
{
  "phone": "+380732807519",
  "audience": "CLIENT",
  "code": "393114",
  "sent_at": "2026-10-29T15:35:07.084437166Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18c5c10c-371b-4f17-b47c-0e55c23644e7",
  "code": "393114",
  "device_ref": "sandbox-22480"
}
```

```json
{
  "session_id": "4386deab-a1d4-435f-969b-b95270458235",
  "subject": {
    "type": "CLIENT",
    "id": "fdde1f31-f8d5-49e8-8b26-010b670aacda"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmZGRlMWYzMS1mOGQ1LTQ5ZTgtOGIyNi0wMTBiNjcwYWFjZGEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDA3LCJpYXQiOjE3OTMyODgxMDcsImp0aSI6IjBiYzJjOWMxLTI3NjgtNDA0Yi05NDgwLWIwODBjZWI2MTdmNyIsInNpZCI6IjQzODZkZWFiLWExZDQtNDM1Zi05NjliLWI5NTI3MDQ1ODIzNSJ9.x8hDBSP9igi_jZFsHHNQ-j_065so8ecbFp34290LNGs",
  "access_expires_at": "2026-10-29T15:50:07.287625838Z",
  "refresh_token": "9vttCX-mXhLuL3AnSEbxciWRNWR5PhEJMEIYertRdZQ",
  "refresh_expires_at": "2026-11-28T15:35:07.287218474Z",
  "account_created": true
}
```

`POST /api/rider/v1/wallet/card-top-ups` → **201**

```json
{
  "command_id": "e1df2f5f-eeb9-43dc-810e-357b996592c1",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 15000
}
```

```json
{
  "id": "51ff8cd2-4481-4e20-93cc-492a9c60aec2",
  "state": "PENDING",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-51ff8cd2-4481-4e20-93cc-492a9c60aec2",
    "orderDate": "1793288107",
    "amount": "150.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Bonus account top-up",
    "productPrice[]": "150.00",
    "productCount[]": "1",
    "merchantSignature": "44f3ae565bad8afdf75f23d2224accc3",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=51ff8cd2-4481-4e20-93cc-492a9c60aec2",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380732807519"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=51ff8cd2-4481-4e20-93cc-492a9c60aec2",
  "created_at": "2026-10-29T15:35:07.467735Z",
  "expires_at": "2026-10-29T16:05:07.467735Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/rider/v1/wallet/card-top-ups/51ff8cd2-4481-4e20-93cc-492a9c60aec2` → **200**

```json
{
  "id": "51ff8cd2-4481-4e20-93cc-492a9c60aec2",
  "state": "COMPLETED",
  "amount_minor": 15000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:35:07.467735Z",
  "expires_at": "2026-10-29T16:05:07.467735Z",
  "completed_at": "2026-10-29T15:35:07.663526Z",
  "masked_pan": "41****8905",
  "failure_reason": null
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fdde1f31-f8d5-49e8-8b26-010b670aacda",
  "balances": [],
  "entries": []
}
```

`GET /api/rider/v1/wallet` → **200**

```json
{
  "client_id": "fdde1f31-f8d5-49e8-8b26-010b670aacda",
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
      "id": "346dc13c-7ea2-4a2d-92c7-4faaa6d5f53d",
      "at": "2026-10-29T15:35:08.186674Z",
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
  "client_id": "fdde1f31-f8d5-49e8-8b26-010b670aacda",
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
      "id": "346dc13c-7ea2-4a2d-92c7-4faaa6d5f53d",
      "at": "2026-10-29T15:35:08.186674Z",
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
  "device_ref": "sandbox-23199"
}
```

```json
{
  "challenge_id": "f22dba70-d4d3-4542-acbc-80a74c9e0045",
  "expires_at": "2026-10-29T15:40:09.406385029Z",
  "resend_available_at": "2026-10-29T15:35:10.406385029Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "550524",
  "sent_at": "2026-10-29T15:35:09.408773431Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "f22dba70-d4d3-4542-acbc-80a74c9e0045",
  "code": "550524",
  "device_ref": "sandbox-23199"
}
```

```json
{
  "session_id": "c295a59f-6898-47a0-9459-b440648fa84d",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTAwOSwiaWF0IjoxNzkzMjg4MTA5LCJqdGkiOiJmMDJjMzcwMS1lN2NkLTRjYjYtYmI5Mi05MWM5NjFiOGI0YmMiLCJzaWQiOiJjMjk1YTU5Zi02ODk4LTQ3YTAtOTQ1OS1iNDQwNjQ4ZmE4NGQifQ._FnEgoz5ZDrzj5h47rZPs_itWPctLt5BVtdNPjEE54c",
  "access_expires_at": "2026-10-29T15:50:09.610266936Z",
  "refresh_token": "u6Ia48BGJyeHhgQuVrJIqhiwH1dteQjF8ebVjcaY9OI",
  "refresh_expires_at": "2026-11-28T15:35:09.609954996Z",
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
  "command_id": "c46a71a6-af3e-49d1-b504-2fe47c624854",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 50000
}
```

```json
{
  "id": "63e961b0-ba22-4b18-9e1f-e408506dc614",
  "state": "PENDING",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": "http://localhost:8080/payments/v1/fake/pay",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "topup-63e961b0-ba22-4b18-9e1f-e408506dc614",
    "orderDate": "1793288109",
    "amount": "500.00",
    "currency": "UAH",
    "orderTimeout": "1800",
    "orderLifetime": "1800",
    "productName[]": "Driver balance top-up",
    "productPrice[]": "500.00",
    "productCount[]": "1",
    "merchantSignature": "347ef829707493dfa05a1a0a9c2b7aa0",
    "returnUrl": "http://localhost:8080/payments/v1/return?top_up=63e961b0-ba22-4b18-9e1f-e408506dc614",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "language": "UA",
    "clientPhone": "380500000002"
  },
  "return_url": "http://localhost:8080/payments/v1/return?top_up=63e961b0-ba22-4b18-9e1f-e408506dc614",
  "created_at": "2026-10-29T15:35:09.97987Z",
  "expires_at": "2026-10-29T16:05:09.97987Z",
  "completed_at": null,
  "masked_pan": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/pay` (the provider's payment page, from the web view) → **303**

`GET /api/driver/v1/balance/card-top-ups/63e961b0-ba22-4b18-9e1f-e408506dc614` → **200**

```json
{
  "id": "63e961b0-ba22-4b18-9e1f-e408506dc614",
  "state": "COMPLETED",
  "amount_minor": 50000,
  "currency": "UAH",
  "url": null,
  "fields": null,
  "return_url": null,
  "created_at": "2026-10-29T15:35:09.97987Z",
  "expires_at": "2026-10-29T16:05:09.97987Z",
  "completed_at": "2026-10-29T15:35:10.161104Z",
  "masked_pan": "41****8178",
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
      "id": "f3378b60-6c1d-4762-88b7-b8fe20163517",
      "at": "2026-10-29T15:35:10.192624Z",
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
  "command_id": "bee0caf3-a0db-459d-b522-6b6902647542",
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
  "correlation_id": "01b418f1-f5e0-428c-b990-9b46731198aa"
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
  "device_ref": "sandbox-8370"
}
```

```json
{
  "challenge_id": "44b6caff-3801-4a47-862c-e91068886e17",
  "expires_at": "2026-10-29T15:40:10.732025114Z",
  "resend_available_at": "2026-10-29T15:35:11.732025114Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "990643",
  "sent_at": "2026-10-29T15:35:10.734214986Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "44b6caff-3801-4a47-862c-e91068886e17",
  "code": "990643",
  "device_ref": "sandbox-8370"
}
```

```json
{
  "session_id": "2200d959-7f6c-4833-8172-6ce406432a97",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTAxMCwiaWF0IjoxNzkzMjg4MTEwLCJqdGkiOiJhNGY0NDkwYi1iYTk2LTQ2ZjItYjQ2Zi0zMDM1NDJhNGE3NGIiLCJzaWQiOiIyMjAwZDk1OS03ZjZjLTQ4MzMtODE3Mi02Y2U0MDY0MzJhOTcifQ.FI-elhaJJ4C-tWeEkbbGX7ig3ye2Uj-VNKeX1taWgnc",
  "access_expires_at": "2026-10-29T15:50:10.934685341Z",
  "refresh_token": "5MeFb5BJz3izyZK5aSWTtrdF-bJjb-ccV0bStUrKauc",
  "refresh_expires_at": "2026-11-28T15:35:10.934254526Z",
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
  "command_id": "610225e8-dfc9-49ad-a496-f4ff9732ebe4",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:11Z",
    "sequence": 1793288111285
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9791573d-c5e5-46dc-851a-d31044bd67e8",
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
  "last_heartbeat_at": "2026-10-29T15:35:11.301697Z",
  "last_location_at": "2026-10-29T15:35:11.301697Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A rider orders for cash

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380633023137",
  "device_ref": "sandbox-27042"
}
```

```json
{
  "challenge_id": "8a968082-434c-4fb0-bbf2-66726460854c",
  "expires_at": "2026-10-29T15:40:11.486086528Z",
  "resend_available_at": "2026-10-29T15:35:12.486086528Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633023137` → **200**

```json
{
  "phone": "+380633023137",
  "audience": "CLIENT",
  "code": "380188",
  "sent_at": "2026-10-29T15:35:11.488057549Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a968082-434c-4fb0-bbf2-66726460854c",
  "code": "380188",
  "device_ref": "sandbox-27042"
}
```

```json
{
  "session_id": "f43e27df-8787-4637-ba43-79214d5867ae",
  "subject": {
    "type": "CLIENT",
    "id": "7ab21452-b0fd-426a-b7a7-e8ab08e74e76"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3YWIyMTQ1Mi1iMGZkLTQyNmEtYjdhNy1lOGFiMDhlNzRlNzYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDExLCJpYXQiOjE3OTMyODgxMTEsImp0aSI6Ijg0NzIyOGE4LTBhYzYtNDI5MS1hOGI3LWIzNjZkNjk2OWU2MiIsInNpZCI6ImY0M2UyN2RmLTg3ODctNDYzNy1iYTQzLTc5MjE0ZDU4NjdhZSJ9.N_XEMfM2dRipLpFdfXLZRyNqp0PRLHSXLwgJVa1pkAw",
  "access_expires_at": "2026-10-29T15:50:11.685432071Z",
  "refresh_token": "qJ3gibt3d_JPqwwBCd4dbYw8v4cZ8y6YDZPwc1AqdKk",
  "refresh_expires_at": "2026-11-28T15:35:11.68505302Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "192d70a3-c671-4f0d-80bd-2c98961c3002",
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
  "id": "efaaadad-810c-426d-9500-66515d97743c",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:11.871888Z",
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
  "command_id": "35d1b670-b256-4684-8842-7183fde31e70",
  "quote_id": "efaaadad-810c-426d-9500-66515d97743c",
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
  "id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "short_number": 8,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "7ab21452-b0fd-426a-b7a7-e8ab08e74e76",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:35:12.062445Z",
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
    "id": "28e6401d-671e-44d7-893d-ad85a3e65e56",
    "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
    "expires_at": "2026-10-29T15:35:27.064399Z",
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

`POST /api/driver/v1/offers/28e6401d-671e-44d7-893d-ad85a3e65e56/accept` → **200**

```json
{
  "command_id": "e6b56910-a46f-4c5e-9234-97501bcb2dc5"
}
```

```json
{
  "id": "e39fe410-4552-44a5-8391-feb414640f81",
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "4d8cdc62-4269-4ddb-887f-b9bf0e600a04",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "4d8cdc62-4269-4ddb-887f-b9bf0e600a04",
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "assignment_id": "e39fe410-4552-44a5-8391-feb414640f81",
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

`POST /api/driver/v1/work-sessions/9791573d-c5e5-46dc-851a-d31044bd67e8/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:12Z",
    "sequence": 1793288112796
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9791573d-c5e5-46dc-851a-d31044bd67e8",
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
  "last_heartbeat_at": "2026-10-29T15:35:12.813101Z",
  "last_location_at": "2026-10-29T15:35:12.813101Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/4d8cdc62-4269-4ddb-887f-b9bf0e600a04/arrive` → **200**

```json
{
  "command_id": "b993d880-8e94-4779-98e3-0f87667b16d9",
  "expected_version": 0
}
```

```json
{
  "id": "4d8cdc62-4269-4ddb-887f-b9bf0e600a04",
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "assignment_id": "e39fe410-4552-44a5-8391-feb414640f81",
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
  "arrived_at": "2026-10-29T15:35:13.002169Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d8cdc62-4269-4ddb-887f-b9bf0e600a04/start` → **200**

```json
{
  "command_id": "b027aa8d-7de2-408b-b930-0b28f3323d58",
  "expected_version": 1
}
```

```json
{
  "id": "4d8cdc62-4269-4ddb-887f-b9bf0e600a04",
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "assignment_id": "e39fe410-4552-44a5-8391-feb414640f81",
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
  "arrived_at": "2026-10-29T15:35:13.002169Z",
  "started_at": "2026-10-29T15:35:13.194088Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/4d8cdc62-4269-4ddb-887f-b9bf0e600a04/complete` → **200**

```json
{
  "command_id": "5d9d3820-c65c-45b4-a03b-64a24c190b95",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:35:13Z",
  "cash_received": false
}
```

```json
{
  "id": "4d8cdc62-4269-4ddb-887f-b9bf0e600a04",
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "assignment_id": "e39fe410-4552-44a5-8391-feb414640f81",
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
  "arrived_at": "2026-10-29T15:35:13.002169Z",
  "started_at": "2026-10-29T15:35:13.194088Z",
  "completed_at": "2026-10-29T15:35:13.393599Z",
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
  "session_id": "5faffd3f-43fa-468b-ae9c-fb0b2e2de1ee",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwMTMsImlhdCI6MTc5MzI4ODExMywianRpIjoiZjQ1YzZmNWYtMjg4Yi00YzY4LTg0OGQtOGIzYjhmMDUyMzc3Iiwic2lkIjoiNWZhZmZkM2YtNDNmYS00NjhiLWFlOWMtZmIwYjJlMmRlMWVlIn0.jzQ49m8FIfmYj09bPCvmpIRmtadO9KR_vOFWd964Qys",
  "access_expires_at": "2026-10-29T15:50:13.78721585Z",
  "refresh_token": "YxCL-GsQGWrynpVJ2RH-p4mtd0cvfccTjTfnM15l-Qg",
  "refresh_expires_at": "2026-10-30T03:35:13.786898842Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute` → **404**

```json
{
  "instance": "/api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "57bbfabc-9405-4203-91ef-5d271e78469a"
}
```

`GET /api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute` → **200**

```json
{
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7ab21452-b0fd-426a-b7a7-e8ab08e74e76",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:35:14.228262Z",
  "decide_by": "2026-11-12T15:35:14.228262Z",
  "decision": null,
  "decided_by": null,
  "reason": null,
  "decided_at": null,
  "version": 1
}
```

Dispute: {"held_minor":0,"rider_debt_minor":10517,"decide_by":"2026-11-12T15:35:14.228262Z","decision":null}

`GET /api/admin/v1/cash-disputes` → **200**

```json
{
  "disputes": [
    {
      "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "payer_client_id": "7ab21452-b0fd-426a-b7a7-e8ab08e74e76",
      "currency": "UAH",
      "held_minor": 0,
      "rider_debt_minor": 10517,
      "opened_at": "2026-10-29T15:35:14.228262Z",
      "decide_by": "2026-11-12T15:35:14.228262Z",
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

`POST /api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute/decide` → **400**

```json
{
  "command_id": "934b9117-ffed-4caa-957a-bb7d586bd679",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute/decide",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "9702a84e-944c-41e9-b9eb-eaacb951831b",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute/decide` → **200**

```json
{
  "command_id": "c9989d48-8b83-4099-8e24-5b4f326e5246",
  "expected_version": 1,
  "decision": "PAY_DRIVER",
  "reason": "The rider does not answer calls"
}
```

```json
{
  "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "payer_client_id": "7ab21452-b0fd-426a-b7a7-e8ab08e74e76",
  "currency": "UAH",
  "held_minor": 0,
  "rider_debt_minor": 10517,
  "opened_at": "2026-10-29T15:35:14.228262Z",
  "decide_by": "2026-11-12T15:35:14.228262Z",
  "decision": "PAY_DRIVER",
  "decided_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "The rider does not answer calls",
  "decided_at": "2026-10-29T15:35:15.746175Z",
  "version": 2
}
```

`POST /api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute/decide` → **409**

```json
{
  "command_id": "29ce9465-53db-446e-b2b7-0ba1972c2f1a",
  "expected_version": 2,
  "decision": "RIDER_PAID",
  "reason": "Again"
}
```

```json
{
  "instance": "/api/admin/v1/orders/a310a7b7-1a5e-455f-8289-2f1871c48991/cash-dispute/decide",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "12517ed8-1d3b-4340-9ab0-78356ab8c221"
}
```

Done: an unpaid cash trip became a dispute and was decided once.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "9791573d-c5e5-46dc-851a-d31044bd67e8",
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
  "last_heartbeat_at": "2026-10-29T15:35:12.813101Z",
  "last_location_at": "2026-10-29T15:35:12.813101Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/9791573d-c5e5-46dc-851a-d31044bd67e8/close` → **200**

```json
{
  "command_id": "c0067546-6f90-4008-a6c7-7eb3aa54206c",
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
  "phone": "+380739527815",
  "device_ref": "sandbox-11698"
}
```

```json
{
  "challenge_id": "1e36bf66-e900-4355-b584-722fa7e84afb",
  "expires_at": "2026-10-29T15:40:16.500839678Z",
  "resend_available_at": "2026-10-29T15:35:17.500839678Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380739527815` → **200**

```json
{
  "phone": "+380739527815",
  "audience": "CLIENT",
  "code": "646317",
  "sent_at": "2026-10-29T15:35:16.502942319Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1e36bf66-e900-4355-b584-722fa7e84afb",
  "code": "646317",
  "device_ref": "sandbox-11698"
}
```

```json
{
  "session_id": "70838774-30aa-436c-8f06-d00a0cf16581",
  "subject": {
    "type": "CLIENT",
    "id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI2N2MwM2Y3ZS1hMjFlLTRmYjEtYTQ2Yi01YzU1NzFiMjhmMzUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDE2LCJpYXQiOjE3OTMyODgxMTYsImp0aSI6ImI5ZTk5ZWY5LTViMmItNDMwNy05ZWRiLTNiYTQyNTc3ZjVkMCIsInNpZCI6IjcwODM4Nzc0LTMwYWEtNDM2Yy04ZjA2LWQwMGEwY2YxNjU4MSJ9.nNPZuRP32pk9UGsYQ-XJrkUjaS4-JROY-JGu1JzyX5k",
  "access_expires_at": "2026-10-29T15:50:16.703073592Z",
  "refresh_token": "fA7QPc2E-_GivHyWxXNDjzHObP_OcDiKOC2tvXsj3xg",
  "refresh_expires_at": "2026-11-28T15:35:16.702731166Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "f5986231-bb9b-43be-9e05-486d0f5638ed",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "2bf19dbc-5e77-43c8-bb58-a021656e8cbb",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-2bf19dbc-5e77-43c8-bb58-a021656e8cbb",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "90c03b6c6fd2e7f8d2c9ba7b0b38f82a",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=2bf19dbc-5e77-43c8-bb58-a021656e8cbb",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380739527815"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=2bf19dbc-5e77-43c8-bb58-a021656e8cbb",
  "expires_at": "2026-10-29T16:05:16.892071Z",
  "card": null,
  "failure_reason": null
}
```

`POST http://localhost:8080/payments/v1/fake/verify` (the provider's page, from the web view) → **303**

`GET /api/rider/v1/card-bindings/2bf19dbc-5e77-43c8-bb58-a021656e8cbb` → **200**

```json
{
  "id": "2bf19dbc-5e77-43c8-bb58-a021656e8cbb",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:05:16.892071Z",
  "card": {
    "id": "985ab036-c8c1-44ef-a7cc-c3ab022eb324",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****4700",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:35:17.081427Z"
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
  "device_ref": "sandbox-30265"
}
```

```json
{
  "challenge_id": "3bcdfbf4-c328-4b35-b081-07e87f611d77",
  "expires_at": "2026-10-29T15:40:17.278469594Z",
  "resend_available_at": "2026-10-29T15:35:18.278469594Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "101502",
  "sent_at": "2026-10-29T15:35:17.280614468Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "3bcdfbf4-c328-4b35-b081-07e87f611d77",
  "code": "101502",
  "device_ref": "sandbox-30265"
}
```

```json
{
  "session_id": "ee06e343-5faa-4552-aa1b-db91e9276c10",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTAxNywiaWF0IjoxNzkzMjg4MTE3LCJqdGkiOiJmMjU2ZjZlYS1lMjhlLTQyMzItOGRlOC03MmQ1MTQwOWJiNmYiLCJzaWQiOiJlZTA2ZTM0My01ZmFhLTQ1NTItYWExYi1kYjkxZTkyNzZjMTAifQ.A2OO1MstOlgro7irGKNdbm-xtiCDiDK6c4MSL2Wa3V0",
  "access_expires_at": "2026-10-29T15:50:17.484574768Z",
  "refresh_token": "84UXWHe6Fg8nSF9JL3eQ--lAcfRMWvvqum7p5ndWDaU",
  "refresh_expires_at": "2026-11-28T15:35:17.484186223Z",
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
  "command_id": "9b885b44-f99f-4580-a9d1-36d25c5622d2",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4480,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:17Z",
    "sequence": 1793288117836
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5f4d587d-d58d-4252-ac99-0fe578cdb470",
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
  "last_heartbeat_at": "2026-10-29T15:35:17.852046Z",
  "last_location_at": "2026-10-29T15:35:17.852046Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## A card ride; on the way both write numbers into the chat

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "15629a92-901f-4bcd-a681-befd10afa450",
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
  "id": "c03fc0ea-c79a-4476-b412-78d0e8fdac5d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:18.050119Z",
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
  "command_id": "a7f64b24-e56b-4c54-90de-cedb873db4dc",
  "quote_id": "c03fc0ea-c79a-4476-b412-78d0e8fdac5d",
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
  "id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "short_number": 9,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
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
  "created_at": "2026-10-29T15:35:18.240016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea` → **200**

```json
{
  "id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "short_number": 9,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
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
  "created_at": "2026-10-29T15:35:18.240016Z",
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
    "id": "fbcac606-233e-4731-abe3-b7b15b393b60",
    "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
    "expires_at": "2026-10-29T15:35:33.263703Z",
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

`POST /api/driver/v1/offers/fbcac606-233e-4731-abe3-b7b15b393b60/accept` → **200**

```json
{
  "command_id": "482da8c1-3a93-4210-a667-5e8c7f91ae4f"
}
```

```json
{
  "id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "assignment_id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
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

`POST /api/rider/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/messages` → **201**

```json
{
  "command_id": "c9684238-94f8-45fb-b147-9b795cd7e609",
  "body": "Я біля входу, мій номер +380739527815, картка 4111 1111 1111 1111"
}
```

```json
{
  "id": "cb98c3c9-0ad1-447a-909e-0fafa69204a5",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу, мій номер +380739527815, картка 4111 1111 1111 1111",
  "sent_at": "2026-10-29T15:35:19.192625576Z"
}
```

`POST /api/driver/v1/trips/c92133ed-d3b1-4ab2-8223-a3001ac0d830/messages` → **201**

```json
{
  "command_id": "4db7a011-4d1e-4218-9c25-5bbb1043c64f",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03"
}
```

```json
{
  "id": "8bb2e3eb-514d-491a-9eec-781fe2ff6d30",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини, телефонуйте 050 000 00 03",
  "sent_at": "2026-10-29T15:35:19.389258173Z"
}
```

`POST /api/driver/v1/work-sessions/5f4d587d-d58d-4252-ac99-0fe578cdb470/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4438,
    "lon": 30.4970,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:19Z",
    "sequence": 1793288119560
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5f4d587d-d58d-4252-ac99-0fe578cdb470",
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
  "last_heartbeat_at": "2026-10-29T15:35:19.576306Z",
  "last_location_at": "2026-10-29T15:35:19.576306Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c92133ed-d3b1-4ab2-8223-a3001ac0d830/arrive` → **200**

```json
{
  "command_id": "4215ab39-bf14-495a-80ee-6749e7b30c52",
  "expected_version": 0
}
```

```json
{
  "id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "assignment_id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
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
  "arrived_at": "2026-10-29T15:35:19.768016Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/c92133ed-d3b1-4ab2-8223-a3001ac0d830/start` → **200**

```json
{
  "command_id": "e03c9af4-62e1-42b2-82ea-3e645490d052",
  "expected_version": 1
}
```

```json
{
  "id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "assignment_id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
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
  "arrived_at": "2026-10-29T15:35:19.768016Z",
  "started_at": "2026-10-29T15:35:19.96399Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/5f4d587d-d58d-4252-ac99-0fe578cdb470/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4584,
    "lon": 30.4300,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:20Z",
    "sequence": 1793288120144
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "5f4d587d-d58d-4252-ac99-0fe578cdb470",
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
  "last_heartbeat_at": "2026-10-29T15:35:20.15983Z",
  "last_location_at": "2026-10-29T15:35:20.15983Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/c92133ed-d3b1-4ab2-8223-a3001ac0d830/complete` → **200**

```json
{
  "command_id": "56d9ea57-e823-4d66-aa88-871b041f0877",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:35:20Z",
  "cash_received": false
}
```

```json
{
  "id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "assignment_id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
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
  "arrived_at": "2026-10-29T15:35:19.768016Z",
  "started_at": "2026-10-29T15:35:19.96399Z",
  "completed_at": "2026-10-29T15:35:20.350795Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/rider/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea` → **200**

```json
{
  "id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
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
    "id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
    "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:35:18.240016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea` → **200**

```json
{
  "id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
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
    "id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
    "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:35:18.240016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea` → **200**

```json
{
  "id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 7,
  "channel": "APP",
  "payer_client_id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
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
    "id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
    "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:35:18.240016Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea` → **200**

```json
{
  "id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "short_number": 9,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 8,
  "channel": "APP",
  "payer_client_id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
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
    "id": "e3fd1500-b69b-4a36-b0fa-e7453e56acdf",
    "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c92133ed-d3b1-4ab2-8223-a3001ac0d830",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:35:18.240016Z",
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
  "session_id": "5f4d587d-d58d-4252-ac99-0fe578cdb470",
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
  "last_heartbeat_at": "2026-10-29T15:35:20.15983Z",
  "last_location_at": "2026-10-29T15:35:20.15983Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/5f4d587d-d58d-4252-ac99-0fe578cdb470/close` → **200**

```json
{
  "command_id": "252d45f4-c6fd-4ab3-b895-cae9b765eee1",
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
  "session_id": "d4ba8591-4c98-4355-aa81-d0274bb90079",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwMjQsImlhdCI6MTc5MzI4ODEyNCwianRpIjoiN2VhM2NhNTktNDI2Zi00YjEzLTg1MTQtNzdhODJlM2E4MDA4Iiwic2lkIjoiZDRiYTg1OTEtNGM5OC00MzU1LWFhODEtZDAyNzRiYjkwMDc5In0.EsKU33kfWfgVtmsWoxOOEseYJu8nwPT8ndLQixM9j7Q",
  "access_expires_at": "2026-10-29T15:50:24.855102538Z",
  "refresh_token": "o2LYoUNafFM675IVk1z_wHq1J0YVOMRxRT5iJ-obCtE",
  "refresh_expires_at": "2026-10-30T03:35:24.854645524Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/evidence` → **400**

```json
{
  "instance": "/api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/evidence",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "6f20a880-02eb-4a6b-a432-f511e3b2cd5d"
}
```

`GET /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/evidence?reason=Bank%20request%20sandbox` → **200**

```json
{
  "generated_at": "2026-10-29T15:35:25.221470786Z",
  "order": {
    "id": "30719b26-e001-4b49-bd32-d9575e294eea",
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
    "created_at": "2026-10-29T15:35:18.240016Z",
    "assigned_at": "2026-10-29T15:35:18.824179Z",
    "arrived_at": "2026-10-29T15:35:19.768016Z",
    "started_at": "2026-10-29T15:35:19.96399Z",
    "completed_at": "2026-10-29T15:35:20.350795Z"
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
    "id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
    "registered_at": "2026-10-29T15:35:16.701102Z",
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
      "created_at": "2026-10-29T15:35:18.241735Z"
    },
    {
      "type": "SETTLE",
      "state": "SUCCEEDED",
      "amount_minor": 16297,
      "currency": "UAH",
      "provider_status": "Approved",
      "created_at": "2026-10-29T15:35:21.341867Z"
    }
  ],
  "chat": [
    {
```

## Finance records the chargeback: the rider owes the fare again, a case opens

`POST /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks` → **422**

```json
{
  "command_id": "3116863d-3b60-4768-b142-31492381fc1e",
  "amount_minor": 16298,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "instance": "/api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks",
  "status": 422,
  "title": "Chargeback not allowed",
  "type": "https://errors.blizz.taxi/chargeback-not-allowed",
  "code": "CHARGEBACK_NOT_ALLOWED",
  "correlation_id": "333d426e-f6fd-44a2-b9b3-be40746d35ed"
}
```

`POST /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks` → **201**

```json
{
  "command_id": "d6312168-9d40-42fc-8dbf-497da4e6530a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "a491c8b9-ce08-4fb7-bce9-6c64c26e96b5",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:35:25.641967Z",
  "resolved_at": null,
  "version": 0
}
```

`POST /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks` → **201**

```json
{
  "command_id": "d6312168-9d40-42fc-8dbf-497da4e6530a",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28"
}
```

```json
{
  "id": "a491c8b9-ce08-4fb7-bce9-6c64c26e96b5",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "OPEN",
  "resolution_reason": null,
  "created_at": "2026-10-29T15:35:25.641967Z",
  "resolved_at": null,
  "version": 0
}
```

`GET /api/admin/v1/clients/67c03f7e-a21e-4fb1-a46b-5c5571b28f35` → **200**

```json
{
  "client": {
    "id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
    "phone": "+380739527815",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:35:16.701102Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30719b26-e001-4b49-bd32-d9575e294eea",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:35:18.240016Z",
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

`GET /api/admin/v1/clients/67c03f7e-a21e-4fb1-a46b-5c5571b28f35` → **200**

```json
{
  "client": {
    "id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
    "phone": "+380739527815",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:35:16.701102Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30719b26-e001-4b49-bd32-d9575e294eea",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:35:18.240016Z",
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

`POST /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks/a491c8b9-ce08-4fb7-bce9-6c64c26e96b5/resolve` → **200**

```json
{
  "command_id": "1cce8e60-96b1-4ce1-9ebe-411da9874e79",
  "expected_version": 0,
  "outcome": "WON",
  "reason": "Evidence accepted"
}
```

```json
{
  "id": "a491c8b9-ce08-4fb7-bce9-6c64c26e96b5",
  "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
  "amount_minor": 16297,
  "currency": "UAH",
  "bank_reason": "4837 No cardholder authorization",
  "received_on": "2026-10-28",
  "state": "WON",
  "resolution_reason": "Evidence accepted",
  "created_at": "2026-10-29T15:35:25.641967Z",
  "resolved_at": "2026-10-29T15:35:27.436454Z",
  "version": 1
}
```

`GET /api/admin/v1/clients/67c03f7e-a21e-4fb1-a46b-5c5571b28f35` → **200**

```json
{
  "client": {
    "id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
    "phone": "+380739527815",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:35:16.701102Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30719b26-e001-4b49-bd32-d9575e294eea",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:35:18.240016Z",
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

`GET /api/admin/v1/clients/67c03f7e-a21e-4fb1-a46b-5c5571b28f35` → **200**

```json
{
  "client": {
    "id": "67c03f7e-a21e-4fb1-a46b-5c5571b28f35",
    "phone": "+380739527815",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:35:16.701102Z",
    "version": 0,
    "block": null,
    "deletion_requested_at": null
  },
  "current_orders": [],
  "latest_orders": [
    {
      "id": "30719b26-e001-4b49-bd32-d9575e294eea",
      "short_number": 9,
      "status": "FULFILLED",
      "created_at": "2026-10-29T15:35:18.240016Z",
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

`POST /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks/a491c8b9-ce08-4fb7-bce9-6c64c26e96b5/resolve` → **409**

```json
{
  "command_id": "038195ec-a6ef-4ad0-ae09-949c11ce8fe6",
  "expected_version": 1,
  "outcome": "LOST",
  "reason": "Twice"
}
```

```json
{
  "instance": "/api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks/a491c8b9-ce08-4fb7-bce9-6c64c26e96b5/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "263283a6-e5ba-4ab4-8dc4-3429aa246683"
}
```

`GET /api/admin/v1/orders/30719b26-e001-4b49-bd32-d9575e294eea/chargebacks` → **200**

```json
{
  "chargebacks": [
    {
      "id": "a491c8b9-ce08-4fb7-bce9-6c64c26e96b5",
      "order_id": "30719b26-e001-4b49-bd32-d9575e294eea",
      "amount_minor": 16297,
      "currency": "UAH",
      "bank_reason": "4837 No cardholder authorization",
      "received_on": "2026-10-28",
      "state": "WON",
      "resolution_reason": "Evidence accepted",
      "created_at": "2026-10-29T15:35:25.641967Z",
      "resolved_at": "2026-10-29T15:35:27.436454Z",
      "version": 1
    }
  ]
}
```

Done: the evidence of card order 30719b26-e001-4b49-bd32-d9575e294eea without phone or card digits; chargeback a491c8b9-ce08-4fb7-bce9-6c64c26e96b5 recorded and won.

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
  "session_id": "df670522-8758-42e5-b1c8-2bbe72326a0d",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwMjksImlhdCI6MTc5MzI4ODEyOSwianRpIjoiMmQ3Y2Q2ZmYtYmRjNC00MDBlLWFiZTUtMGVjMjkxYzdjOWE1Iiwic2lkIjoiZGY2NzA1MjItODc1OC00MmU1LWIxYzgtMmJiZTcyMzI2YTBkIn0.kvbbVqSoqXPTivHaEoiULbf63i_xfteHamGBI0apyMw",
  "access_expires_at": "2026-10-29T15:50:29.801236497Z",
  "refresh_token": "0N2B7Oe7NZ3mHSWwDY54o2Cz3bk_BQnGD1cSGh1au4U",
  "refresh_expires_at": "2026-10-30T03:35:29.800802572Z",
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
  "phone": "+48600379058",
  "device_ref": "sandbox-959"
}
```

```json
{
  "challenge_id": "e9561539-a5c8-4abd-b1a4-1ca671bea78a",
  "expires_at": "2026-10-29T15:40:30.346861615Z",
  "resend_available_at": "2026-10-29T15:35:31.346861615Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600379058` → **200**

```json
{
  "phone": "+48600379058",
  "audience": "CLIENT",
  "code": "976126",
  "sent_at": "2026-10-29T15:35:30.348741881Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e9561539-a5c8-4abd-b1a4-1ca671bea78a",
  "code": "976126",
  "device_ref": "sandbox-959"
}
```

```json
{
  "session_id": "354b8eb4-a2fe-4d52-984d-c61724d8ddfe",
  "subject": {
    "type": "CLIENT",
    "id": "307510a4-09a7-4173-9380-6146894527e7"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzMDc1MTBhNC0wOWE3LTQxNzMtOTM4MC02MTQ2ODk0NTI3ZTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDMwLCJpYXQiOjE3OTMyODgxMzAsImp0aSI6IjhhNTQ5YTQwLTYxZjYtNGExMy04NDhhLWE1NmFlMWU3ZjEyOSIsInNpZCI6IjM1NGI4ZWI0LWEyZmUtNGQ1Mi05ODRkLWM2MTcyNGQ4ZGRmZSJ9.Uk34vcG_3mnOzt0bKuRtjCY4RPJ2W2LA3UkmvNjlx9U",
  "access_expires_at": "2026-10-29T15:50:30.550038867Z",
  "refresh_token": "jJRbXUUtW8iMSRKlSkFqDS8V9l44KJ07nfXo5x1kx-4",
  "refresh_expires_at": "2026-11-28T15:35:30.54959984Z",
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
  "command_id": "a6179a77-626d-4169-adce-85d6473a8289",
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
  "correlation_id": "cc44d8ec-661a-42f6-b96b-205ef4a4262d",
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
  "command_id": "5d787e00-af4a-4466-ac7b-8c337c09df1d",
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
  "paused_at": "2026-10-29T15:35:31.279838573Z",
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
  "command_id": "4f88491d-ef8e-49e3-adf6-cf83a5763bb2",
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
  "id": "e1692522-2551-4e75-bb62-c7edbca4447f",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:31.660884Z",
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
  "command_id": "ed6f6089-e475-431c-83e6-2e243596910b",
  "quote_id": "e1692522-2551-4e75-bb62-c7edbca4447f",
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
  "correlation_id": "371d76b3-4a86-40ae-8f70-a852e103ceb9"
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
  "paused_at": "2026-10-29T15:35:31.279839Z",
  "version": 1
}
```

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/resume` → **200**

```json
{
  "command_id": "d9c6e239-6588-42e3-9cd0-c5e3cd872bb1",
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
  "command_id": "e08ee4bd-52b9-4094-89b3-edc43559b52a",
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
  "command_id": "f2351f4e-f166-4ad4-a725-f32dadd58071",
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
  "id": "93b735a0-60c6-48bd-895e-e04530c65f85",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:32.770137Z",
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
  "command_id": "ef9d1976-9094-45c7-a322-84fbcf0ea212",
  "quote_id": "93b735a0-60c6-48bd-895e-e04530c65f85",
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
  "correlation_id": "0116db04-b21c-4e33-92a5-17ec2b8a64fc"
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
  "command_id": "be15c1d3-7660-4dc3-b270-039214c2f884",
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
  "command_id": "98adf767-441e-423f-b105-e3aa95322a43",
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
  "id": "3d8414f0-c301-4e4a-ab63-ca2626cd1742",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 1500,
  "currency": "PLN",
  "distance_m": 583,
  "duration_s": 84,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:33.513391Z",
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
  "command_id": "14675c80-a4cb-4bf0-8481-bdb350882abe",
  "quote_id": "3d8414f0-c301-4e4a-ab63-ca2626cd1742",
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
  "correlation_id": "f0aca0ff-fff0-40a2-b592-9c5abb0b3561"
}
```

## A stale version is refused

`POST /api/admin/v1/cities/5a000000-0000-4000-8000-000000000002/operations/pause` → **409**

```json
{
  "command_id": "b92c2cc9-f815-408b-832b-aadc52d4f9d9",
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
  "correlation_id": "e870153b-1b5c-4bdd-b1ec-b30c5a7be370"
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
  "command_id": "245719a9-c643-4450-841c-c64500645a6e",
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
  "phone": "+380670610272",
  "device_ref": "sandbox-20365"
}
```

```json
{
  "challenge_id": "fe5d9191-800d-4dc4-a887-db3ec3ba2f4f",
  "expires_at": "2026-10-29T15:40:34.428852776Z",
  "resend_available_at": "2026-10-29T15:35:35.428852776Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670610272` → **200**

```json
{
  "phone": "+380670610272",
  "audience": "CLIENT",
  "code": "330166",
  "sent_at": "2026-10-29T15:35:34.430672807Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "fe5d9191-800d-4dc4-a887-db3ec3ba2f4f",
  "code": "330166",
  "device_ref": "sandbox-20365"
}
```

```json
{
  "session_id": "ab075687-7603-453b-ad11-b142fdd375ce",
  "subject": {
    "type": "CLIENT",
    "id": "36c4b6a5-5bd4-41a9-aec7-feb0c6078b86"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIzNmM0YjZhNS01YmQ0LTQxYTktYWVjNy1mZWIwYzYwNzhiODYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDM0LCJpYXQiOjE3OTMyODgxMzQsImp0aSI6IjYyMTliMmRjLTZlMmEtNGFjZS04MTM2LTg0MTFhOTQ4YzhhYiIsInNpZCI6ImFiMDc1Njg3LTc2MDMtNDUzYi1hZDExLWIxNDJmZGQzNzVjZSJ9.-aAvJJWnv13FETy6r1B35TcpVKmrufYsdz3EkJVVuY8",
  "access_expires_at": "2026-10-29T15:50:34.627107898Z",
  "refresh_token": "X_9tDj-VFBtFz45ayqy1Fbr6LKSob29_9hray01yxvs",
  "refresh_expires_at": "2026-11-28T15:35:34.626613998Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "36c4b6a5-5bd4-41a9-aec7-feb0c6078b86",
  "session_id": "ab075687-7603-453b-ad11-b142fdd375ce",
  "account_state": "ACTIVE"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "11c89a63-a7d5-4574-b53d-485fb889d010",
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
  "id": "f665f876-f23c-4356-b6e1-2de17fe94b02",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:34.986308Z",
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
  "challenge_id": "ec397dc3-a20a-4c4e-bb90-f742c7deabd8",
  "expires_at": "2026-10-29T15:40:37.177497908Z",
  "resend_available_at": "2026-10-29T15:35:38.177497908Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380670610272` → **200**

```json
{
  "phone": "+380670610272",
  "audience": "CLIENT",
  "code": "381663",
  "sent_at": "2026-10-29T15:35:37.179408149Z",
  "channel": "SMS"
}
```

## Step two: the request; this session stays, the account is DELETION_PENDING

`POST /api/rider/v1/me/deletion-request` → **200**

```json
{
  "command_id": "2db54664-d356-4abc-beec-5f54063e009f",
  "challenge_id": "ec397dc3-a20a-4c4e-bb90-f742c7deabd8",
  "otp_code": "381663"
}
```

```json
{
  "client_id": "36c4b6a5-5bd4-41a9-aec7-feb0c6078b86",
  "account_state": "DELETION_PENDING",
  "requested_at": "2026-10-29T15:35:37.384453305Z"
}
```

## While it is pending the rider cannot order

`POST /api/rider/v1/orders` → **403**

```json
{
  "command_id": "2222e371-a039-418d-921e-134ef6cef41a",
  "quote_id": "f665f876-f23c-4356-b6e1-2de17fe94b02",
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
  "correlation_id": "3546f16c-e8cd-487d-b059-cef197083492"
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
  "session_id": "7d649b27-e219-4cd8-a8e4-61c8f9a4a1e8",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwMzcsImlhdCI6MTc5MzI4ODEzNywianRpIjoiOGFkODg0MTItMmY4ZS00OWNkLThiZDQtOWE2MzBjZmIwNmQxIiwic2lkIjoiN2Q2NDliMjctZTIxOS00Y2Q4LWE4ZTQtNjFjOGY5YTRhMWU4In0.13HL6qaBHj7wwwynkAPPB_9AgnQxzHGLUC8QQNHf6Kg",
  "access_expires_at": "2026-10-29T15:50:37.95886434Z",
  "refresh_token": "Tjcs05lJ3oBnNqzCe4eEZgPwvcl6EjHeNCoD_nf-lXo",
  "refresh_expires_at": "2026-10-30T03:35:37.958566892Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/client-deletions` → **200**

```json
{
  "requests": [
    {
      "client_id": "36c4b6a5-5bd4-41a9-aec7-feb0c6078b86",
      "previous_state": "ACTIVE",
      "requested_at": "2026-10-29T15:35:37.384453Z",
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

`POST /api/admin/v1/client-deletions/36c4b6a5-5bd4-41a9-aec7-feb0c6078b86/complete` → **200**

```json
{
  "command_id": "f050e76e-8377-40f3-9192-623dafb52780",
  "reason": "Sandbox: the rider confirmed by code"
}
```

```json
{
  "client_id": "36c4b6a5-5bd4-41a9-aec7-feb0c6078b86",
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
  "correlation_id": "d4c02142-660a-4da9-984e-f418addf8d38"
}
```

Done: client 36c4b6a5-5bd4-41a9-aec7-feb0c6078b86 anonymized.

# Scenario: clients-admin

## A rider signs in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668398153",
  "device_ref": "sandbox-10086"
}
```

```json
{
  "challenge_id": "70104aec-8943-4e7c-9417-f3869ce385ad",
  "expires_at": "2026-10-29T15:40:38.693564315Z",
  "resend_available_at": "2026-10-29T15:35:39.693564315Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668398153` → **200**

```json
{
  "phone": "+380668398153",
  "audience": "CLIENT",
  "code": "496633",
  "sent_at": "2026-10-29T15:35:38.695717582Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "70104aec-8943-4e7c-9417-f3869ce385ad",
  "code": "496633",
  "device_ref": "sandbox-10086"
}
```

```json
{
  "session_id": "942de098-c453-408f-8896-2ea482f03d10",
  "subject": {
    "type": "CLIENT",
    "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxY2UzZmUzNS02NmVlLTQ2ODMtOTNhYi0zMDk2Yzg5ODhmM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDM4LCJpYXQiOjE3OTMyODgxMzgsImp0aSI6IjE5MTE0MTAyLTczNzAtNDA0ZC1iMzE3LTM2OGEyMmMwOTBhOSIsInNpZCI6Ijk0MmRlMDk4LWM0NTMtNDA4Zi04ODk2LTJlYTQ4MmYwM2QxMCJ9.-r756Ytc82otPEc3W7UsAD68gsJWH6GwAkLgtLfTFPE",
  "access_expires_at": "2026-10-29T15:50:38.901969468Z",
  "refresh_token": "zkDmf7Nbpz3oGEaFw7LxJ1HWXfmQbtaNK9eq9i0EL5Y",
  "refresh_expires_at": "2026-11-28T15:35:38.90155379Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
  "session_id": "942de098-c453-408f-8896-2ea482f03d10",
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
  "session_id": "e714c3cd-7922-4430-a271-7a1826bc1070",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwMzksImlhdCI6MTc5MzI4ODEzOSwianRpIjoiZDU0ZmViOTEtMTAwMS00YmRjLTgzMTEtOTA1NWZmOGQyZWY5Iiwic2lkIjoiZTcxNGMzY2QtNzkyMi00NDMwLWEyNzEtN2ExODI2YmMxMDcwIn0.0jiQMgs1SjP5GPM2e_5gnrAHtPWND_Qye4XDYvYqfYA",
  "access_expires_at": "2026-10-29T15:50:39.460527134Z",
  "refresh_token": "Q-4Ix9ISw2oBcnu7RMTxYVy3F1FDY7NWmpt7obI-Ykg",
  "refresh_expires_at": "2026-10-30T03:35:39.460146296Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients?query=8398153&limit=10` → **200**

```json
{
  "clients": [
    {
      "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
      "phone": "+380668398153",
      "name": null,
      "language": null,
      "account_state": "ACTIVE",
      "has_app": true,
      "created_at": "2026-10-29T15:35:38.899911Z",
      "version": 0,
      "block": null,
      "deletion_requested_at": null
    }
  ]
}
```

`GET /api/admin/v1/clients/1ce3fe35-66ee-4683-93ab-3096c8988f3b` → **200**

```json
{
  "client": {
    "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
    "phone": "+380668398153",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:35:38.899911Z",
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

`POST /api/admin/v1/clients/1ce3fe35-66ee-4683-93ab-3096c8988f3b/block` → **400**

```json
{
  "command_id": "828baf64-886d-4010-adf6-1bbd518cf1ba",
  "expected_version": 0,
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/1ce3fe35-66ee-4683-93ab-3096c8988f3b/block",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "a6caac41-0971-4211-b10e-9a1453c26d47",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

## Staff block the rider; the rider's session ends at once

`POST /api/admin/v1/clients/1ce3fe35-66ee-4683-93ab-3096c8988f3b/block` → **200**

```json
{
  "command_id": "086ec3db-115e-43ed-8441-cd19709c34a0",
  "expected_version": 0,
  "reason": "Abusive calls to drivers"
}
```

```json
{
  "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
  "phone": "+380668398153",
  "name": null,
  "language": null,
  "account_state": "BLOCKED",
  "has_app": true,
  "created_at": "2026-10-29T15:35:38.899911Z",
  "version": 1,
  "block": {
    "reason": "Abusive calls to drivers",
    "until": null,
    "at": "2026-10-29T15:35:40.290718Z",
    "by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
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
  "correlation_id": "c612e76b-3da9-4c48-bd11-7d81cd762ef8"
}
```

## A blocked rider cannot sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668398153",
  "device_ref": "sandbox-15477"
}
```

```json
{
  "challenge_id": "530956bc-104d-4390-9b43-852ff466ae70",
  "expires_at": "2026-10-29T15:40:42.735646158Z",
  "resend_available_at": "2026-10-29T15:35:43.735646158Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668398153` → **200**

```json
{
  "phone": "+380668398153",
  "audience": "CLIENT",
  "code": "762396",
  "sent_at": "2026-10-29T15:35:42.738022152Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **403**

```json
{
  "challenge_id": "530956bc-104d-4390-9b43-852ff466ae70",
  "code": "762396",
  "device_ref": "sandbox-15477"
}
```

```json
{
  "instance": "/auth/v1/otp/verify",
  "status": 403,
  "title": "Access denied",
  "type": "https://errors.blizz.taxi/access-denied",
  "code": "ACCESS_DENIED",
  "correlation_id": "13efc75c-0af5-4946-bda4-ce136326f1a0"
}
```

## Staff reopen the card (the sign-in attempt touched the account) and unblock the rider; the rider signs in again

`GET /api/admin/v1/clients/1ce3fe35-66ee-4683-93ab-3096c8988f3b` → **200**

```json
{
  "client": {
    "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
    "phone": "+380668398153",
    "name": null,
    "language": null,
    "account_state": "BLOCKED",
    "has_app": true,
    "created_at": "2026-10-29T15:35:38.899911Z",
    "version": 2,
    "block": {
      "reason": "Abusive calls to drivers",
      "until": null,
      "at": "2026-10-29T15:35:40.290718Z",
      "by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
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

`POST /api/admin/v1/clients/1ce3fe35-66ee-4683-93ab-3096c8988f3b/unblock` → **200**

```json
{
  "command_id": "d43154d0-e0be-4301-9b2c-b563f4155c52",
  "expected_version": 2,
  "reason": "Apologised"
}
```

```json
{
  "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
  "phone": "+380668398153",
  "name": null,
  "language": null,
  "account_state": "ACTIVE",
  "has_app": true,
  "created_at": "2026-10-29T15:35:38.899911Z",
  "version": 3,
  "block": null,
  "deletion_requested_at": null
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380668398153",
  "device_ref": "sandbox-18263"
}
```

```json
{
  "challenge_id": "02e228fb-7267-49e7-8c5f-6d15c5040d7f",
  "expires_at": "2026-10-29T15:40:45.511306597Z",
  "resend_available_at": "2026-10-29T15:35:46.511306597Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380668398153` → **200**

```json
{
  "phone": "+380668398153",
  "audience": "CLIENT",
  "code": "796627",
  "sent_at": "2026-10-29T15:35:45.513510241Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "02e228fb-7267-49e7-8c5f-6d15c5040d7f",
  "code": "796627",
  "device_ref": "sandbox-18263"
}
```

```json
{
  "session_id": "ce58268c-1d22-4fcd-b917-9d41ac9337f5",
  "subject": {
    "type": "CLIENT",
    "id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxY2UzZmUzNS02NmVlLTQ2ODMtOTNhYi0zMDk2Yzg5ODhmM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDQ1LCJpYXQiOjE3OTMyODgxNDUsImp0aSI6IjYwM2Y0NzFlLTJiZjEtNDE4ZS05MmRmLTMxOWU5NmZlNWZlYSIsInNpZCI6ImNlNTgyNjhjLTFkMjItNGZjZC1iOTE3LTlkNDFhYzkzMzdmNSJ9.RW468SchyWTa4Cox1W2SB-Jl8Ze5dA1psxmXMGhfLPA",
  "access_expires_at": "2026-10-29T15:50:45.715651707Z",
  "refresh_token": "tjXIW7PkFFzvCgP9ThpJ2rJrwG7E_-IJ_UYH1vlwsbM",
  "refresh_expires_at": "2026-11-28T15:35:45.715261577Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "1ce3fe35-66ee-4683-93ab-3096c8988f3b",
  "session_id": "ce58268c-1d22-4fcd-b917-9d41ac9337f5",
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
  "phone": "+380662515425",
  "device_ref": "sandbox-5133"
}
```

```json
{
  "challenge_id": "8a98fcb4-5ca8-4c1d-bc42-d35b1afa541e",
  "expires_at": "2026-10-29T15:40:46.084896369Z",
  "resend_available_at": "2026-10-29T15:35:47.084896369Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662515425` → **200**

```json
{
  "phone": "+380662515425",
  "audience": "CLIENT",
  "code": "921175",
  "sent_at": "2026-10-29T15:35:46.087170789Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8a98fcb4-5ca8-4c1d-bc42-d35b1afa541e",
  "code": "921175",
  "device_ref": "sandbox-5133"
}
```

```json
{
  "session_id": "92f6b4a7-1188-4e55-a1ba-2dda1e83cf7f",
  "subject": {
    "type": "CLIENT",
    "id": "985772b2-a73b-4488-8b8f-de544a88eb51"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI5ODU3NzJiMi1hNzNiLTQ0ODgtOGI4Zi1kZTU0NGE4OGViNTEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDQ2LCJpYXQiOjE3OTMyODgxNDYsImp0aSI6IjFkMjVjNDZjLTQ5MjMtNDI5Zi1hZjdlLTMwMmQwOTFhNDgxNSIsInNpZCI6IjkyZjZiNGE3LTExODgtNGU1NS1hMWJhLTJkZGExZTgzY2Y3ZiJ9.yEb54jsFxW6asqg7nuIubVa3WDz1JPM9MUR8d2NmVR8",
  "access_expires_at": "2026-10-29T15:50:46.289228002Z",
  "refresh_token": "9aSjqLRAdru8-tgUCdj5QEm_9-jCplGxQNO_BLAHe1U",
  "refresh_expires_at": "2026-11-28T15:35:46.288929492Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "be1aee92-2b62-43cd-85f6-b713f7638222",
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
  "id": "a0b1dd35-dc3c-4a07-90c5-e7985a42e451",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:46.476469Z",
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

`POST /api/rider/v1/orders` (X-Correlation-Id: 057f036d-c371-4024-8e69-a996a25644d5) → **201**

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
  "session_id": "ec619947-2b02-4937-b1bb-8614ce977417",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNDYsImlhdCI6MTc5MzI4ODE0NiwianRpIjoiNmFmZGI5MzctMzAwOC00NDc2LTkxODUtMGNiZGEwOTVlN2NjIiwic2lkIjoiZWM2MTk5NDctMmIwMi00OTM3LWIxYmItODYxNGNlOTc3NDE3In0.FsEknQ3ZnA7m8WrtUUny2h1HYWpV2BnXcKBkkqUqgIA",
  "access_expires_at": "2026-10-29T15:50:46.895439273Z",
  "refresh_token": "psTkhVDJEdqXS1-bDne7oE-A2FZpezZXAGlCpJ6yxbw",
  "refresh_expires_at": "2026-10-30T03:35:46.895121373Z",
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
  "session_id": "82e51005-0f1b-46ba-a48f-d555305ed121",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNDcsImlhdCI6MTc5MzI4ODE0NywianRpIjoiYmNmNTZiNDAtOWUxZC00Zjk2LWI3NjItYjA2NTI0NjY2YzM3Iiwic2lkIjoiODJlNTEwMDUtMGYxYi00NmJhLWE0OGYtZDU1NTMwNWVkMTIxIn0.ZtfP0Q9YCIuCFuiGUN4XbM41adPP89320IZxm8lrN6s",
  "access_expires_at": "2026-10-29T15:50:47.271314379Z",
  "refresh_token": "NNfMHcHEFNd-1_C-nZPasRpzg0nuA925ABkz1fUJaYw",
  "refresh_expires_at": "2026-10-30T03:35:47.270973144Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/8056eb0f-267f-4fb5-b60d-f2d5a1f56481/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:35:46.662689Z",
      "actor": {
        "type": "CLIENT",
        "id": "985772b2-a73b-4488-8b8f-de544a88eb51",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
        "quote_id": "a0b1dd35-dc3c-4a07-90c5-e7985a42e451",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "057f036d-c371-4024-8e69-a996a25644d5"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:35:46.663936Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
        "attempt_id": "368803e4-3efc-4947-9645-f921696b5456",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "057f036d-c371-4024-8e69-a996a25644d5"
    },
    {
      "sequence": 2,
      "type": "OrderBroadcast",
      "occurred_at": "2026-10-29T15:35:46.670574Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
        "attempt_id": "368803e4-3efc-4947-9645-f921696b5456"
      },
      "correlation_id": "057f036d-c371-4024-8e69-a996a25644d5"
    }
  ],
  "dispatch": {
    "attempts": [
      {
        "attempt_id": "368803e4-3efc-4947-9645-f921696b5456",
        "generation": 1,
        "started_at": "2026-10-29T15:35:46.663268Z",
        "first_offer_at": null,
        "broadcast_at": "2026-10-29T15:35:46.670574Z",
        "assigned_at": null,
        "ended_at": null,
        "outcome": "SEARCHING",
        "offers": [],
        "rounds": [
          {
            "at": "2026-10-29T15:35:46.664493Z",
            "phase": "PERSONAL",
            "radius_m": 5000,
            "candidates": [
              {
                "driver_id": "5a000000-0000-4000-8000-000000000402",
```

## Support finds what the request recorded — types and ids only

`GET /api/admin/v1/logs/correlation/057f036d-c371-4024-8e69-a996a25644d5` → **200**

```json
{
  "found": [
    {
      "type": "ORDER_EVENT",
      "id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481:0",
      "order_id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
      "at": "2026-10-29T15:35:46.662689Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481:1",
      "order_id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
      "at": "2026-10-29T15:35:46.663936Z"
    },
    {
      "type": "ORDER_EVENT",
      "id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481:2",
      "order_id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
      "at": "2026-10-29T15:35:46.670574Z"
    }
  ]
}
```

`GET /api/admin/v1/logs/correlation/bead3c65-0a19-4413-a077-0c9d3645b5c6` → **200**

```json
{
  "found": []
}
```

Done: request 057f036d-c371-4024-8e69-a996a25644d5 — order 8056eb0f-267f-4fb5-b60d-f2d5a1f56481 found by its id.

`GET /api/rider/v1/orders/8056eb0f-267f-4fb5-b60d-f2d5a1f56481` → **200**

```json
{
  "id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
  "short_number": 10,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "985772b2-a73b-4488-8b8f-de544a88eb51",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:35:46.66228Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8056eb0f-267f-4fb5-b60d-f2d5a1f56481/cancel` → **200**

```json
{
  "command_id": "789bac40-500e-46ff-b896-7eccb1d1f167",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8056eb0f-267f-4fb5-b60d-f2d5a1f56481",
  "short_number": 10,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "985772b2-a73b-4488-8b8f-de544a88eb51",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:35:46.66228Z",
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
  "phone": "+380632202798",
  "device_ref": "sandbox-23033"
}
```

```json
{
  "challenge_id": "0fc22a3a-37d8-4b2a-b22a-00fdc5f5c0ee",
  "expires_at": "2026-10-29T15:40:48.384033844Z",
  "resend_available_at": "2026-10-29T15:35:49.384033844Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380632202798` → **200**

```json
{
  "phone": "+380632202798",
  "audience": "CLIENT",
  "code": "213416",
  "sent_at": "2026-10-29T15:35:48.386074802Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "0fc22a3a-37d8-4b2a-b22a-00fdc5f5c0ee",
  "code": "213416",
  "device_ref": "sandbox-23033"
}
```

```json
{
  "session_id": "fdfb0ee6-957a-454a-926b-fbb14ad24f78",
  "subject": {
    "type": "CLIENT",
    "id": "05a12a62-0bc9-4d51-a259-8dc30d7cab4c"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNWExMmE2Mi0wYmM5LTRkNTEtYTI1OS04ZGMzMGQ3Y2FiNGMiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDQ4LCJpYXQiOjE3OTMyODgxNDgsImp0aSI6IjEyMmQ1NGM1LWVkYzgtNGJhNS04Mjc5LTA2NmU0YzgwNjllMiIsInNpZCI6ImZkZmIwZWU2LTk1N2EtNDU0YS05MjZiLWZiYjE0YWQyNGY3OCJ9.zn6TIunRg-NMDaV7OhgafkR_3fATLTCcV3k9zUE-3cc",
  "access_expires_at": "2026-10-29T15:50:48.584426883Z",
  "refresh_token": "KT4YnTT9E4Fk12WBnw7m6qEMm38hp2QphtBL85opW0Y",
  "refresh_expires_at": "2026-11-28T15:35:48.584073119Z",
  "account_created": true
}
```

`POST /api/rider/v1/me/data-exports/challenge` → **201**

```json
{
  "challenge_id": "35e9ae7c-3a38-4f4c-97a1-1618241d1ab0",
  "expires_at": "2026-10-29T15:40:50.762567705Z",
  "resend_available_at": "2026-10-29T15:35:51.762567705Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380632202798` → **200**

```json
{
  "phone": "+380632202798",
  "audience": "CLIENT",
  "code": "617418",
  "sent_at": "2026-10-29T15:35:50.764100071Z",
  "channel": "SMS"
}
```

## With the code the copy is queued

`POST /api/rider/v1/me/data-exports` → **202**

```json
{
  "command_id": "10f009a0-dc28-41b8-908b-fdc1822fcb3b",
  "challenge_id": "35e9ae7c-3a38-4f4c-97a1-1618241d1ab0",
  "otp_code": "617418"
}
```

```json
{
  "id": "a09fb4a8-d4ae-497f-8aa9-5269a402928d",
  "state": "PENDING",
  "created_at": "2026-10-29T15:35:50.968491Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

## The background job builds it

`GET /api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d` → **200**

```json
{
  "id": "a09fb4a8-d4ae-497f-8aa9-5269a402928d",
  "state": "PENDING",
  "created_at": "2026-10-29T15:35:50.968491Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d` → **200**

```json
{
  "id": "a09fb4a8-d4ae-497f-8aa9-5269a402928d",
  "state": "PENDING",
  "created_at": "2026-10-29T15:35:50.968491Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d` → **200**

```json
{
  "id": "a09fb4a8-d4ae-497f-8aa9-5269a402928d",
  "state": "PENDING",
  "created_at": "2026-10-29T15:35:50.968491Z",
  "ready_at": null,
  "expires_at": null,
  "size_bytes": null
}
```

`GET /api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d` → **200**

```json
{
  "id": "a09fb4a8-d4ae-497f-8aa9-5269a402928d",
  "state": "READY",
  "created_at": "2026-10-29T15:35:50.968491Z",
  "ready_at": "2026-10-29T15:35:54.594468Z",
  "expires_at": "2026-11-05T15:35:54.594468Z",
  "size_bytes": 1032
}
```

## The rider downloads it

`GET /api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d/file` → **200**, sections: ["calls","card_payments","codes_sent","legal_acceptances","money","orders","profile","promotion_bonuses","push_devices","support_cases"]

## Another rider does not see it

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639439424",
  "device_ref": "sandbox-17182"
}
```

```json
{
  "challenge_id": "722af6ac-5d64-45dd-8d96-790a7137f5b6",
  "expires_at": "2026-10-29T15:40:54.887356516Z",
  "resend_available_at": "2026-10-29T15:35:55.887356516Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639439424` → **200**

```json
{
  "phone": "+380639439424",
  "audience": "CLIENT",
  "code": "186623",
  "sent_at": "2026-10-29T15:35:54.889521186Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "722af6ac-5d64-45dd-8d96-790a7137f5b6",
  "code": "186623",
  "device_ref": "sandbox-17182"
}
```

```json
{
  "session_id": "9de10a6d-566f-4aef-aaf9-44e98955d306",
  "subject": {
    "type": "CLIENT",
    "id": "77d21396-df5e-4bcd-979f-bd481a241e16"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3N2QyMTM5Ni1kZjVlLTRiY2QtOTc5Zi1iZDQ4MWEyNDFlMTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDU1LCJpYXQiOjE3OTMyODgxNTUsImp0aSI6ImY4YThhN2M1LTgxNjgtNDhlOC05NzAyLTE2ODBiN2E3NTg1YSIsInNpZCI6IjlkZTEwYTZkLTU2NmYtNGFlZi1hYWY5LTQ0ZTk4OTU1ZDMwNiJ9.vOqGf7V_LajMa_DdVHArp9MX6tmLbiY8SJF5n2Lwz3g",
  "access_expires_at": "2026-10-29T15:50:55.099331224Z",
  "refresh_token": "ixD7du4GRA7aW0u85ae6uCWGbl18BztXk7Tv2rzxDUs",
  "refresh_expires_at": "2026-11-28T15:35:55.09898999Z",
  "account_created": true
}
```

`GET /api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d/file` → **404**

```json
{
  "instance": "/api/rider/v1/me/data-exports/a09fb4a8-d4ae-497f-8aa9-5269a402928d/file",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "32664476-9398-4613-9246-7897793ebaa0"
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
  "session_id": "9025f4d7-e546-4955-86f2-c78f28ab1c9c",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNTUsImlhdCI6MTc5MzI4ODE1NSwianRpIjoiYjMwYjg5NzEtYTE0ZC00MWIyLWE5N2UtYzI4MWVhZmI2ZGJiIiwic2lkIjoiOTAyNWY0ZDctZTU0Ni00OTU1LTg2ZjItYzc4ZjI4YWIxYzljIn0.Q894Tl44hXXULhEJn8Ntg1x4frnPvgMhyV-l_EIvPNY",
  "access_expires_at": "2026-10-29T15:50:55.691514478Z",
  "refresh_token": "E1VJl-KvmthihN7dBDKi_ODAIJ423Vyq7O06Hdj4J54",
  "refresh_expires_at": "2026-10-30T03:35:55.691132607Z",
  "password_change_required": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "05a12a62-0bc9-4d51-a259-8dc30d7cab4c",
  "session_id": "fdfb0ee6-957a-454a-926b-fbb14ad24f78",
  "account_state": "ACTIVE"
}
```

`GET /api/admin/v1/clients/05a12a62-0bc9-4d51-a259-8dc30d7cab4c/data-exports` → **200**

```json
{
  "exports": [
    {
      "id": "a09fb4a8-d4ae-497f-8aa9-5269a402928d",
      "state": "READY",
      "created_at": "2026-10-29T15:35:50.968491Z",
      "ready_at": "2026-10-29T15:35:54.594468Z",
      "expires_at": "2026-11-05T15:35:54.594468Z",
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
  "device_ref": "sandbox-25436"
}
```

```json
{
  "challenge_id": "d07317d6-c836-4b7f-b3b2-2249a2bf3add",
  "expires_at": "2026-10-29T15:40:56.225580447Z",
  "resend_available_at": "2026-10-29T15:35:57.225580447Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "138773",
  "sent_at": "2026-10-29T15:35:56.227478519Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d07317d6-c836-4b7f-b3b2-2249a2bf3add",
  "code": "138773",
  "device_ref": "sandbox-25436"
}
```

```json
{
  "session_id": "3ba86ff4-0055-4a22-8611-d86a04ae94f5",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA1NiwiaWF0IjoxNzkzMjg4MTU2LCJqdGkiOiI0YzM5NWVlYi0yM2I4LTQ5ZDAtYWM3Yy1hMDFmNjVhZGI1YzQiLCJzaWQiOiIzYmE4NmZmNC0wMDU1LTRhMjItODYxMS1kODZhMDRhZTk0ZjUifQ.lWSnSG_OXhkaOlb1pvu9aGgUYojmWWwLLvY_W-2mF30",
  "access_expires_at": "2026-10-29T15:50:56.427530198Z",
  "refresh_token": "MSUftrzLvQYeO1H1wA5FILJgH6qoSmJ8F8n8DXKZ0us",
  "refresh_expires_at": "2026-11-28T15:35:56.427168993Z",
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
  "device_ref": "sandbox-28207"
}
```

```json
{
  "challenge_id": "8385cd74-30c7-471c-b9ec-75b3dfd379e9",
  "expires_at": "2026-10-29T15:40:56.786210006Z",
  "resend_available_at": "2026-10-29T15:35:57.786210006Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "524593",
  "sent_at": "2026-10-29T15:35:56.788212591Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "8385cd74-30c7-471c-b9ec-75b3dfd379e9",
  "code": "524593",
  "device_ref": "sandbox-28207"
}
```

```json
{
  "session_id": "b94744b3-34d3-49f6-bfe5-6f666b5fa338",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA1NiwiaWF0IjoxNzkzMjg4MTU2LCJqdGkiOiJmNGM3Mzk2Yy05YWVkLTRiNDQtYTU3OC00YzMyYzc4YWQ3ZGUiLCJzaWQiOiJiOTQ3NDRiMy0zNGQzLTQ5ZjYtYmZlNS02ZjY2NmI1ZmEzMzgifQ.KIC5ir1g2U8Rh6beSTbYFngthBosOmcngo92IDGZOwg",
  "access_expires_at": "2026-10-29T15:50:56.997522457Z",
  "refresh_token": "lKQSgtAc-_d0tdS0Hm7ryQVLP673zNUbwcpB8gRFdC4",
  "refresh_expires_at": "2026-11-28T15:35:56.997155403Z",
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
  "command_id": "8a3bbce3-a60f-4fcb-a19b-39ce8e0e9a9b",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4519,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:57Z",
    "sequence": 1793288157358
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "88193ed5-bc9b-4171-820f-e9bdfccb7462",
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
  "last_heartbeat_at": "2026-10-29T15:35:57.374856Z",
  "last_location_at": "2026-10-29T15:35:57.374856Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000002",
  "device_ref": "sandbox-26278"
}
```

```json
{
  "challenge_id": "983c0ac7-86b1-4d6f-8a15-bd5e329bf8e3",
  "expires_at": "2026-10-29T15:40:57.55603313Z",
  "resend_available_at": "2026-10-29T15:35:58.55603313Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "074528",
  "sent_at": "2026-10-29T15:35:57.55877815Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "983c0ac7-86b1-4d6f-8a15-bd5e329bf8e3",
  "code": "074528",
  "device_ref": "sandbox-26278"
}
```

```json
{
  "session_id": "3efad782-7db5-47d6-b977-199c0e8c3c16",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA1NywiaWF0IjoxNzkzMjg4MTU3LCJqdGkiOiI4NWZjYzVkMi0zMTlhLTRiN2EtYTdkNS1jMzgxN2Q1NDY4OTciLCJzaWQiOiIzZWZhZDc4Mi03ZGI1LTQ3ZDYtYjk3Ny0xOTljMGU4YzNjMTYifQ.uji3KE42t91BVKdLUGF_2QHrlxKXBZ6QedcWfeul48Q",
  "access_expires_at": "2026-10-29T15:50:57.761184454Z",
  "refresh_token": "P4hcOlyPihWZ4GOfnu96GUWYoPfcYy8MGLf29SJ-764",
  "refresh_expires_at": "2026-11-28T15:35:57.760862138Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e780e85-00bb-493e-9571-0877b8247a1d",
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
  "last_heartbeat_at": "2026-10-29T15:34:45.921585Z",
  "last_location_at": "2026-10-29T15:34:45.921585Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e780e85-00bb-493e-9571-0877b8247a1d/handover` → **200**

```json
{
  "command_id": "1329af24-0964-4804-af29-0ac42e97afc4",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e780e85-00bb-493e-9571-0877b8247a1d",
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
  "last_heartbeat_at": "2026-10-29T15:34:45.921585Z",
  "last_location_at": "2026-10-29T15:34:45.921585Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_DISCONNECTED",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/2e780e85-00bb-493e-9571-0877b8247a1d/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4555,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:35:58Z",
    "sequence": 1793288158299
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "2e780e85-00bb-493e-9571-0877b8247a1d",
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
  "last_heartbeat_at": "2026-10-29T15:35:58.31864Z",
  "last_location_at": "2026-10-29T15:35:58.31864Z",
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
  "session_id": "2cb5ad77-b39e-4b91-a37d-c89be5e2d4f0",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNTgsImlhdCI6MTc5MzI4ODE1OCwianRpIjoiODBlMDU5YjAtMGFlZS00Nzk4LWE0MTQtNGJjOGEzYjIyYTc5Iiwic2lkIjoiMmNiNWFkNzctYjM5ZS00YjkxLWEzN2QtYzg5YmU1ZTJkNGYwIn0.3YlNCotJXn6Xc8K_WzX2uVg1XvZrmGFQJsnpoUENm4k",
  "access_expires_at": "2026-10-29T15:50:58.702090021Z",
  "refresh_token": "M8Nk_skQ-GFVu0jxZfuvTSBqZjNHTN2KXn6WxMkBNrg",
  "refresh_expires_at": "2026-10-30T03:35:58.701785561Z",
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
  "session_id": "a96ea83c-1ce3-4707-a12b-94470cf54820",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNTksImlhdCI6MTc5MzI4ODE1OSwianRpIjoiMjdmNjE5ZGMtZmE1Ni00NDZjLThiMTItYmRjNWY4N2YyODk2Iiwic2lkIjoiYTk2ZWE4M2MtMWNlMy00NzA3LWExMmItOTQ0NzBjZjU0ODIwIn0.aHlGu3I-oz3CpEtIUP3VqacNuaKcRGg3vzEfQZApFiY",
  "access_expires_at": "2026-10-29T15:50:59.07984638Z",
  "refresh_token": "3mMsnkzloZBK2MqZfOhhM03aqMM9exdsOx9TIWf06lg",
  "refresh_expires_at": "2026-10-30T03:35:59.079546068Z",
  "password_change_required": false
}
```

## A rider orders

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380686549476",
  "device_ref": "sandbox-12803"
}
```

```json
{
  "challenge_id": "d5220d11-b272-4e81-b6da-811b2126f83e",
  "expires_at": "2026-10-29T15:40:59.265721186Z",
  "resend_available_at": "2026-10-29T15:36:00.265721186Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380686549476` → **200**

```json
{
  "phone": "+380686549476",
  "audience": "CLIENT",
  "code": "051326",
  "sent_at": "2026-10-29T15:35:59.267792289Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d5220d11-b272-4e81-b6da-811b2126f83e",
  "code": "051326",
  "device_ref": "sandbox-12803"
}
```

```json
{
  "session_id": "437ff172-dc74-431b-8ec3-5fd1cca64c25",
  "subject": {
    "type": "CLIENT",
    "id": "ae895b8d-0899-45e7-a8b7-5bc7ef83247b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZTg5NWI4ZC0wODk5LTQ1ZTctYThiNy01YmM3ZWY4MzI0N2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDU5LCJpYXQiOjE3OTMyODgxNTksImp0aSI6ImMzMTYyY2UyLWU1NWQtNGQzYS1hMTdiLWU4Zjg0MzE5MmRjZiIsInNpZCI6IjQzN2ZmMTcyLWRjNzQtNDMxYi04ZWMzLTVmZDFjY2E2NGMyNSJ9.l_nv_EDTwnlxTxzlPtm7IIhKdFpfE2pdI-S0627jSGQ",
  "access_expires_at": "2026-10-29T15:50:59.46787762Z",
  "refresh_token": "_LQO5zCLybdYYHq57vQflkAmZAAsURthlekBOlWeGJQ",
  "refresh_expires_at": "2026-11-28T15:35:59.46754575Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d9455c8b-ba8f-4342-847c-e7ca90b2c8fb",
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
  "id": "57571c53-d386-469e-a958-c061844543ec",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:40:59.653895Z",
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
  "command_id": "5ac689be-65e3-4b53-a640-eef39680498b",
  "quote_id": "57571c53-d386-469e-a958-c061844543ec",
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
  "id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
  "short_number": 11,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "ae895b8d-0899-45e7-a8b7-5bc7ef83247b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:35:59.843413Z",
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
    "id": "a2b6ab10-a2e6-4807-aad8-5dc061feb561",
    "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
    "expires_at": "2026-10-29T15:36:14.845483Z",
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

`POST /api/driver/v1/offers/a2b6ab10-a2e6-4807-aad8-5dc061feb561/reject` → **204**

```json
{
  "command_id": "ca39f8be-bfc9-4b46-b417-09b377b43a50"
}
```

`GET /api/driver/v1/offers` → **200**

```json
[
  {
    "id": "09fb74b9-2b21-4ca8-a938-d2e68e192e96",
    "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
    "expires_at": "2026-10-29T15:36:15.228054Z",
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

`POST /api/driver/v1/offers/09fb74b9-2b21-4ca8-a938-d2e68e192e96/accept` → **200**

```json
{
  "command_id": "dbd16123-5c78-42e8-aea8-659622c201cb"
}
```

```json
{
  "id": "203a116a-3a07-4eef-8d4e-15dce8dd6246",
  "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "6955dd7d-376e-4397-9e3d-e2fe2a1c393f",
  "trip_phase": "TO_PICKUP"
}
```

## The operator reads why: the order's history with the dispatch journal

`GET /api/operator/v1/orders/a8fec1fd-e1c2-4597-9540-d926409b3474/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:35:59.843772Z",
      "actor": {
        "type": "CLIENT",
        "id": "ae895b8d-0899-45e7-a8b7-5bc7ef83247b",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
        "quote_id": "57571c53-d386-469e-a958-c061844543ec",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "07fe8cc1-1551-40cb-8249-73f36a5cfca4"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:35:59.844926Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
        "attempt_id": "41f53cc5-06ed-48af-9d17-5a999d73ed8e",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "07fe8cc1-1551-40cb-8249-73f36a5cfca4"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:35:59.849097Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a2b6ab10-a2e6-4807-aad8-5dc061feb561",
        "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 200
      },
      "correlation_id": "07fe8cc1-1551-40cb-8249-73f36a5cfca4"
    },
    {
      "sequence": 3,
      "type": "OfferRejected",
      "occurred_at": "2026-10-29T15:36:00.227348Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a2b6ab10-a2e6-4807-aad8-5dc061feb561",
        "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474"
      },
      "correlation_id": "a6d16396-704e-4511-ae19-c9379fbc8aa4"
    },
    {
      "sequence": 4,
```

## Clean-up: the order is cancelled, the drivers go offline

Done: order a8fec1fd-e1c2-4597-9540-d926409b3474 — declined by 5a000000-0000-4000-8000-000000000401, taken by 5a000000-0000-4000-8000-000000000402.

`GET /api/operator/v1/orders/a8fec1fd-e1c2-4597-9540-d926409b3474` → **200**

```json
{
  "id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
  "short_number": 11,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "ae895b8d-0899-45e7-a8b7-5bc7ef83247b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "203a116a-3a07-4eef-8d4e-15dce8dd6246",
    "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "6955dd7d-376e-4397-9e3d-e2fe2a1c393f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:35:59.843413Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/a8fec1fd-e1c2-4597-9540-d926409b3474/cancel` → **200**

```json
{
  "command_id": "1e38f14d-8b3b-408e-9128-b0a7f8b7d34a",
  "expected_version": 5,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
  "short_number": 11,
  "status": "CANCELLED",
  "status_reason": "NO_CARS",
  "version": 6,
  "channel": "APP",
  "payer_client_id": "ae895b8d-0899-45e7-a8b7-5bc7ef83247b",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "203a116a-3a07-4eef-8d4e-15dce8dd6246",
    "order_id": "a8fec1fd-e1c2-4597-9540-d926409b3474",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "6955dd7d-376e-4397-9e3d-e2fe2a1c393f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:35:59.843413Z",
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
  "session_id": "88193ed5-bc9b-4171-820f-e9bdfccb7462",
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
  "last_heartbeat_at": "2026-10-29T15:35:57.374856Z",
  "last_location_at": "2026-10-29T15:35:57.374856Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/88193ed5-bc9b-4171-820f-e9bdfccb7462/close` → **200**

```json
{
  "command_id": "9a01fea5-90ae-410e-9cbb-0b8b503c9112",
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
  "session_id": "2e780e85-00bb-493e-9571-0877b8247a1d",
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
  "last_heartbeat_at": "2026-10-29T15:35:58.31864Z",
  "last_location_at": "2026-10-29T15:35:58.31864Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/2e780e85-00bb-493e-9571-0877b8247a1d/close` → **200**

```json
{
  "command_id": "5f4004bc-8e96-4df2-8529-e88c7714cdec",
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
  "session_id": "a3e012df-2713-442e-a136-6de4dbc59952",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNjIsImlhdCI6MTc5MzI4ODE2MiwianRpIjoiN2Q1ZGFlZmYtOGE0ZS00ZDRhLWFkOGItM2MxOWZjYmM4ZmVkIiwic2lkIjoiYTNlMDEyZGYtMjcxMy00NDJlLWExMzYtNmRlNGRiYzU5OTUyIn0.AjkeVvmWquvwiS5gHJI2XHl4VRwN76iuLj-UFgIpLe4",
  "access_expires_at": "2026-10-29T15:51:02.183234333Z",
  "refresh_token": "MsgxJFSmX1LvpzgURIlTYYVJYF6I9FvRNfqHZJzLm_A",
  "refresh_expires_at": "2026-10-30T03:36:02.182823143Z",
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
  "command_id": "3f3963b0-761e-4dd8-9ae8-bb1ce62bcca5",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: provider incident",
  "changed_at": "2026-10-29T15:36:02.562966Z"
}
```

`POST /api/admin/v1/feature-flags/card-payments/change` → **409**

```json
{
  "command_id": "046dbdcc-91f6-42ca-bcd6-5815d0affd0f",
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
  "correlation_id": "2f8cc89c-0813-4294-ae57-24bd89c46a28"
}
```

`POST /api/admin/v1/feature-flags/no-such-flag/change` → **404**

```json
{
  "command_id": "c2a2e401-81d9-406c-a147-b3c90fa59ca8",
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
  "correlation_id": "d38aac63-6b31-42af-b120-8ca08e763f9e"
}
```

## A rider's new card order is refused; cash still works

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380638036293",
  "device_ref": "sandbox-13345"
}
```

```json
{
  "challenge_id": "459f5c30-541b-485b-b4d7-ba006e59e7d7",
  "expires_at": "2026-10-29T15:41:03.12027915Z",
  "resend_available_at": "2026-10-29T15:36:04.12027915Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380638036293` → **200**

```json
{
  "phone": "+380638036293",
  "audience": "CLIENT",
  "code": "542403",
  "sent_at": "2026-10-29T15:36:03.12219872Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "459f5c30-541b-485b-b4d7-ba006e59e7d7",
  "code": "542403",
  "device_ref": "sandbox-13345"
}
```

```json
{
  "session_id": "efa20f48-5632-4ec4-875f-439a8e5e1267",
  "subject": {
    "type": "CLIENT",
    "id": "f6d5da96-5ea8-49bd-8282-fb0339534a8e"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmNmQ1ZGE5Ni01ZWE4LTQ5YmQtODI4Mi1mYjAzMzk1MzRhOGUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDYzLCJpYXQiOjE3OTMyODgxNjMsImp0aSI6IjMzNzYwOTM5LTM0MGEtNDI4Zi1iNDY2LWE2NDE5NTI1YWNjNCIsInNpZCI6ImVmYTIwZjQ4LTU2MzItNGVjNC04NzVmLTQzOWE4ZTVlMTI2NyJ9.-ozqTMLFkvh9DsUvPfYnHAYrKbtDzSb_44n7eSSzntU",
  "access_expires_at": "2026-10-29T15:51:03.324497904Z",
  "refresh_token": "J1-RH-iyARMCas1p8Orfa9pYQ0Ly8PdGq9x6c4OLT84",
  "refresh_expires_at": "2026-11-28T15:36:03.324176119Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "dcb7fd67-6ea3-4349-89b4-f4ddbb2f937f",
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
  "id": "86c01311-2a70-4060-bfb1-0bde3e3d8eca",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:03.509611Z",
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
  "command_id": "70932986-1757-4d3b-b189-485ba6347a34",
  "quote_id": "86c01311-2a70-4060-bfb1-0bde3e3d8eca",
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
  "correlation_id": "80ea20f6-5d6d-499b-a9a7-568e7b83aa83"
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "d7bb08d4-0454-4f75-acb8-b1a7b5e22af5",
  "quote_id": "86c01311-2a70-4060-bfb1-0bde3e3d8eca",
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
  "id": "249aa8a7-c637-4d36-924e-d3182d047a17",
  "short_number": 12,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "f6d5da96-5ea8-49bd-8282-fb0339534a8e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:03.881939Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/249aa8a7-c637-4d36-924e-d3182d047a17/cancel` → **200**

```json
{
  "command_id": "3416effb-a8e7-471b-acff-4bd2aeb81348",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "249aa8a7-c637-4d36-924e-d3182d047a17",
  "short_number": 12,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "f6d5da96-5ea8-49bd-8282-fb0339534a8e",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:03.881939Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## The incident is over: card payments are back on

`POST /api/admin/v1/feature-flags/card-payments/change` → **200**

```json
{
  "command_id": "132d6634-182b-4678-a373-52fa7692e8fd",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: incident over",
  "changed_at": "2026-10-29T15:36:04.293978Z"
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
      "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "reason": "Sandbox: incident over",
      "changed_at": "2026-10-29T15:36:04.293978Z"
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
  "device_ref": "sandbox-16279"
}
```

```json
{
  "challenge_id": "83ea0a94-49ad-4f09-8917-f28f8ab5cfa3",
  "expires_at": "2026-10-29T15:41:04.860593495Z",
  "resend_available_at": "2026-10-29T15:36:05.860593495Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "632962",
  "sent_at": "2026-10-29T15:36:04.86252009Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "83ea0a94-49ad-4f09-8917-f28f8ab5cfa3",
  "code": "632962",
  "device_ref": "sandbox-16279"
}
```

```json
{
  "session_id": "60111271-27b6-41ca-8208-e43599b600fc",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA2NSwiaWF0IjoxNzkzMjg4MTY1LCJqdGkiOiI3YTc4OGE2NS1mZjA0LTRhMDUtOWE5NC1hZDhhMmZkNTIxODIiLCJzaWQiOiI2MDExMTI3MS0yN2I2LTQxY2EtODIwOC1lNDM1OTliNjAwZmMifQ.8BfCx-a0uVrKEV2Av2B9Sq5BzEivG-JwYlMbodfhJmI",
  "access_expires_at": "2026-10-29T15:51:05.070672271Z",
  "refresh_token": "V9uH8SI8NEA0CZFuPwAmgjr1BK5Hz9thH7QdSs4Qdns",
  "refresh_expires_at": "2026-11-28T15:36:05.070294892Z",
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
  "command_id": "adbe4718-14a8-4e30-ba65-00c335095e1c",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4505,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:05Z",
    "sequence": 1793288165468
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:05.484166Z",
  "last_location_at": "2026-10-29T15:36:05.484166Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## Rider signs in, sees the classes and gets a price

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678527471",
  "device_ref": "sandbox-6430"
}
```

```json
{
  "challenge_id": "9251c2de-c600-4a18-98f0-57d300be2b51",
  "expires_at": "2026-10-29T15:41:05.674152501Z",
  "resend_available_at": "2026-10-29T15:36:06.674152501Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678527471` → **200**

```json
{
  "phone": "+380678527471",
  "audience": "CLIENT",
  "code": "857254",
  "sent_at": "2026-10-29T15:36:05.676063569Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9251c2de-c600-4a18-98f0-57d300be2b51",
  "code": "857254",
  "device_ref": "sandbox-6430"
}
```

```json
{
  "session_id": "99658538-e968-4e80-91fa-418e7056b7ea",
  "subject": {
    "type": "CLIENT",
    "id": "725d9548-e712-4465-a1a6-acbc5d55a450"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3MjVkOTU0OC1lNzEyLTQ0NjUtYTFhNi1hY2JjNWQ1NWE0NTAiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDY1LCJpYXQiOjE3OTMyODgxNjUsImp0aSI6IjdkNDdjYzlhLTViNDAtNDU0NC04ZGRhLTU1ODk1MGRlZjAyMSIsInNpZCI6Ijk5NjU4NTM4LWU5NjgtNGU4MC05MWZhLTQxOGU3MDU2YjdlYSJ9.i5f-LiOIEVXHOWne2nSkwCcdvJVHKv1wixw27SnAZ44",
  "access_expires_at": "2026-10-29T15:51:05.876690351Z",
  "refresh_token": "-Zw2UyyhIHgXqt5-xAhdPDqqV5qLGZjRKlsulUxuL8g",
  "refresh_expires_at": "2026-11-28T15:36:05.876276992Z",
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
  "command_id": "aa6a3168-327a-49ca-b94e-81e9b0234cb5",
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
  "id": "b8d63399-4c8d-4ab2-831a-58b5c81cae3d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:06.237158Z",
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
  "command_id": "5e502535-1f31-4f65-ba27-de06422e3d94",
  "platform": "ANDROID",
  "token": "sandbox-driver-d838a85b-e3b0-4482-8394-2de9997082ad"
}
```

```json
{
  "id": "9477a3a2-2de1-46fa-99ed-09c4c0c92223",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:36:06.432261Z"
}
```

`POST /api/rider/v1/push-devices` → **201**

```json
{
  "command_id": "8e6baf7f-b688-4427-8ef1-3137deaf83a3",
  "platform": "ANDROID",
  "token": "sandbox-rider-a79bad4c-6930-4367-993e-8e42214e2106"
}
```

```json
{
  "id": "320570c3-a142-430b-a726-96bb731a5239",
  "platform": "ANDROID",
  "locale": null,
  "state": "ACTIVE",
  "created_at": "2026-10-29T15:36:06.617352Z"
}
```

## Rider orders (cash)

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5feb5a4a-322a-4be2-a6dc-d1b44f9d6b2d",
  "quote_id": "b8d63399-4c8d-4ab2-831a-58b5c81cae3d",
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
  "id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "short_number": 13,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "725d9548-e712-4465-a1a6-acbc5d55a450",
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
  "created_at": "2026-10-29T15:36:06.819587Z",
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
    "id": "5881193b-f2c1-4757-a96e-aba8d657ed30",
    "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
    "expires_at": "2026-10-29T15:36:21.821805Z",
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

`POST /api/driver/v1/offers/5881193b-f2c1-4757-a96e-aba8d657ed30/accept` → **200**

```json
{
  "command_id": "3eab411a-2389-4364-a993-6d48129804ef"
}
```

```json
{
  "id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
  "trip_phase": "TO_PICKUP"
}
```

## The pushes the server sent: the offer to the driver, "driver assigned" to the rider

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:36:06.800Z` → **200**

```json
[]
```

`GET /sandbox/v1/pushes?phone=%2B380500000001&after=2026-10-29T15:36:06.800Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:36:07.919138965Z",
    "token_suffix": "7082ad",
    "title": "Нове замовлення",
    "body": "Прийміть замовлення, поки пропозиція діє",
    "data": {
      "event_id": "f2344b4a-7e66-44fd-8dfa-dc426cb799ad",
      "order_version": "2",
      "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
      "type": "driver.offer",
      "event_type": "OfferMade"
    }
  }
]
```

`GET /sandbox/v1/pushes?phone=%2B380678527471&after=2026-10-29T15:36:06.800Z` → **200**

```json
[
  {
    "at": "2026-10-29T15:36:07.917354112Z",
    "token_suffix": "4e2106",
    "title": "Водитель найден",
    "body": "Машина едет к вам",
    "data": {
      "event_id": "860f0875-e82b-47e8-b141-58aade45cacc",
      "order_version": "3",
      "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
      "type": "rider.driver-assigned",
      "event_type": "AssignmentCommitted"
    }
  }
]
```

## Rider and driver write in the order chat

`POST /api/rider/v1/orders/f95a3038-924d-4eca-b0dc-8791ef992dbd/messages` → **201**

```json
{
  "command_id": "c19b3e38-b82a-4a89-8535-a4a9bb93f9fe",
  "body": "Я біля входу в метро"
}
```

```json
{
  "id": "b4cd8159-83b6-493b-aa35-ba599ca02f69",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "sequence": 1,
  "sender_role": "RIDER",
  "body": "Я біля входу в метро",
  "sent_at": "2026-10-29T15:36:08.449853205Z"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "assignment_id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
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

`POST /api/driver/v1/trips/44e1f188-62a0-426f-8abf-8ee9f06f8f4f/messages` → **201**

```json
{
  "command_id": "1aadf7be-45ad-4fc3-a9f7-1933bb6f3744",
  "body": "Буду за 3 хвилини"
}
```

```json
{
  "id": "8cde9fe7-4252-4a24-b438-7d1358c764ed",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "sequence": 2,
  "sender_role": "DRIVER",
  "body": "Буду за 3 хвилини",
  "sent_at": "2026-10-29T15:36:08.813578835Z"
}
```

## "Call" from the order card on both sides (settings: call mode)

`GET /api/rider/v1/orders/f95a3038-924d-4eca-b0dc-8791ef992dbd/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380500000001"
}
```

`GET /api/driver/v1/trips/44e1f188-62a0-426f-8abf-8ee9f06f8f4f/call` → **200**

```json
{
  "mode": "DIRECT",
  "phone": "+380678527471"
}
```

## The driver arrives, picks up and drives

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:09Z",
    "sequence": 1793288169363
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:09.380747Z",
  "last_location_at": "2026-10-29T15:36:09.380747Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "assignment_id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
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

`POST /api/driver/v1/trips/44e1f188-62a0-426f-8abf-8ee9f06f8f4f/arrive` → **200**

```json
{
  "command_id": "64ee7f55-c8ba-4cf4-96ad-f73720f3d694",
  "expected_version": 0
}
```

```json
{
  "id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "assignment_id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
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
  "arrived_at": "2026-10-29T15:36:09.749705Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/44e1f188-62a0-426f-8abf-8ee9f06f8f4f/start` → **200**

```json
{
  "command_id": "e5349863-d78f-47bd-ba3f-5214d05599e6",
  "expected_version": 1
}
```

```json
{
  "id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "assignment_id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
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
  "arrived_at": "2026-10-29T15:36:09.749705Z",
  "started_at": "2026-10-29T15:36:09.938999Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:10Z",
    "sequence": 1793288170123
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:10.138722Z",
  "last_location_at": "2026-10-29T15:36:10.138722Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

## The driver completes; cash received

`POST /api/driver/v1/trips/44e1f188-62a0-426f-8abf-8ee9f06f8f4f/complete` → **200**

```json
{
  "command_id": "5b6d65af-2e45-4a61-93ea-fd84a2ff20b2",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:36:10Z",
  "cash_received": true
}
```

```json
{
  "id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "assignment_id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
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
  "arrived_at": "2026-10-29T15:36:09.749705Z",
  "started_at": "2026-10-29T15:36:09.938999Z",
  "completed_at": "2026-10-29T15:36:10.32616Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## What each side sees afterwards

`GET /api/rider/v1/orders/f95a3038-924d-4eca-b0dc-8791ef992dbd` → **200**

```json
{
  "id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "short_number": 13,
  "status": "FULFILLED",
  "status_reason": null,
  "version": 6,
  "channel": "APP",
  "payer_client_id": "725d9548-e712-4465-a1a6-acbc5d55a450",
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
    "id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5",
    "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:36:06.819587Z",
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
    "id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
    "short_number": 13,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:36:06.819587Z",
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
    "id": "44e1f188-62a0-426f-8abf-8ee9f06f8f4f",
    "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
    "order_short_number": 13,
    "created_at": "2026-10-29T15:36:07.195294Z",
    "pickup_label": "Майдан Незалежності",
    "dropoff_label": "Залізничний вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "4d8cdc62-4269-4ddb-887f-b9bf0e600a04",
    "order_id": "a310a7b7-1a5e-455f-8289-2f1871c48991",
    "order_short_number": 8,
    "created_at": "2026-10-29T15:35:12.444875Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "02bf9a1d-aac5-4150-992d-9cb3ace20960",
    "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
    "order_short_number": 3,
    "created_at": "2026-10-29T15:34:37.977924Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "858f9947-0be5-4c25-b55a-5c146495d145",
    "order_id": "e51ceb59-a948-4b72-aef5-b709f163c043",
    "order_short_number": 2,
    "created_at": "2026-10-29T15:34:22.059661Z",
    "pickup_label": "Майдан",
    "dropoff_label": "Вокзал",
    "final_price_minor": 10517,
    "currency": "UAH",
    "payment_method": "CASH",
    "phase": "COMPLETED"
  },
  {
    "id": "174807c6-4fc7-4bb8-8b68-9a59a3f66292",
    "order_id": "44c4d473-5a3a-4c1e-993d-3b92c1a5da30",
    "order_short_number": 1,
    "created_at": "2026-10-29T15:34:15.730293Z",
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

`GET /api/rider/v1/orders/f95a3038-924d-4eca-b0dc-8791ef992dbd/tip` → **200**

```json
{
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
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
  "available_until": "2026-10-30T15:36:10.32616Z",
  "open": true,
  "tip": null
}
```

`POST /api/rider/v1/orders/f95a3038-924d-4eca-b0dc-8791ef992dbd/tip` → **201**

```json
{
  "command_id": "9c727eb8-94c6-4c48-a623-a58c5979c5b7",
  "amount_minor": 1100
}
```

```json
{
  "id": "853aae72-2e9e-44e1-ae99-61202fc01f22",
  "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
  "amount_minor": 1100,
  "currency": "UAH",
  "method": "CASH",
  "state": "RECORDED",
  "failure_reason": null,
  "created_at": "2026-10-29T15:36:14.632986Z"
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
  "session_id": "6807640b-e4e3-4f21-8e1e-3f6109e50802",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNzUsImlhdCI6MTc5MzI4ODE3NSwianRpIjoiMDg0ZGQ1YzQtMDc0NS00ZjRhLWJmYmYtODFkZmM4ODc1NjA5Iiwic2lkIjoiNjgwNzY0MGItZTRlMy00ZjIxLThlMWUtM2Y2MTA5ZTUwODAyIn0.Mteir_tm7ZAF8T15GAYh4SCC3OSl_T0q8NaBI2lNMZ0",
  "access_expires_at": "2026-10-29T15:51:15.034531914Z",
  "refresh_token": "RoqPVKXm_-szbIRA7063IefrnXcmgldVtqRKHROq5X0",
  "refresh_expires_at": "2026-10-30T03:36:15.034138896Z",
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
          "RIDER": 3,
          "STAFF": 1,
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
      "RIDER": 3,
      "STAFF": 1,
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
  "generated_at": "2026-10-29T15:36:15.215707657Z"
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
  "generated_at": "2026-10-29T15:36:15.405197863Z"
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
  "session_id": "79093c8c-007d-4c31-b9d0-c20736869075",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNzUsImlhdCI6MTc5MzI4ODE3NSwianRpIjoiZWY1MzM3OWEtZDRmNy00MWU0LTk5MjAtMTBkZWI4MDA2YzY1Iiwic2lkIjoiNzkwOTNjOGMtMDA3ZC00YzMxLWI5ZDAtYzIwNzM2ODY5MDc1In0.-Bxe16-wWZQ-t1GrU4650uwrrqs60VNLpg_qD36H-ag",
  "access_expires_at": "2026-10-29T15:51:15.80418883Z",
  "refresh_token": "JoNZJSjzvAA6leNuiuwnyBOmsNWwD7dV2n8akaD-wIo",
  "refresh_expires_at": "2026-10-30T03:36:15.803842378Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f95a3038-924d-4eca-b0dc-8791ef992dbd/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:36:06.819926Z",
      "actor": {
        "type": "CLIENT",
        "id": "725d9548-e712-4465-a1a6-acbc5d55a450",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
        "quote_id": "b8d63399-4c8d-4ab2-831a-58b5c81cae3d",
        "price_minor": 10517,
        "payment_method": "CASH"
      },
      "correlation_id": "f401ecb0-6109-4e09-bbf3-d97da6a4c3df"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:36:06.821299Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
        "attempt_id": "e4c97447-7aef-4b52-8f66-1d99cd8653a6",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "f401ecb0-6109-4e09-bbf3-d97da6a4c3df"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:36:06.82331Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "5881193b-f2c1-4757-a96e-aba8d657ed30",
        "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 44
      },
      "correlation_id": "f401ecb0-6109-4e09-bbf3-d97da6a4c3df"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:36:07.196234Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "5881193b-f2c1-4757-a96e-aba8d657ed30",
        "order_id": "f95a3038-924d-4eca-b0dc-8791ef992dbd",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "9d2669d6-aa46-4642-9587-243ed8ddf2a5"
      },
      "correlation_id": "c8d1c5a8-35d3-4a59-bacd-40568d7c40bc"
```

`GET /api/operator/v1/drivers/live?city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "at": "2026-10-29T15:36:16.171466797Z",
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
      "last_location_at": "2026-10-29T15:36:10.138722Z",
      "order_id": null
    }
  ]
}
```

Done: order f95a3038-924d-4eca-b0dc-8791ef992dbd.

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
  "session_id": "54a251c7-8a94-4555-8153-dadb0c5d4c2d",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNzYsImlhdCI6MTc5MzI4ODE3NiwianRpIjoiY2Q0NjdhODMtMDcxZC00OWZlLTliOGMtYjVlMTI1ZmY2MmEzIiwic2lkIjoiNTRhMjUxYzctOGE5NC00NTU1LTgxNTMtZGFkYjBjNWQ0YzJkIn0.Et4Ytpe-mJ--6wy_oYe2Y1Ipjtf3iSbLPARbwtyQpVs",
  "access_expires_at": "2026-10-29T15:51:16.574683857Z",
  "refresh_token": "MzLwuIcskc_8_rCQEUiUOIgT_i9ecnyTT41mYemjOho",
  "refresh_expires_at": "2026-10-30T03:36:16.574369053Z",
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
  "command_id": "e0c5a5a4-3bcc-45db-adb0-665fef5534c7",
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
  "timestamp": "2026-10-29T15:36:17.000+0000",
  "channel": {
    "id": "1730052000.769021764",
    "linkedid": "1730052000.769021764",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678232082"
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
  "timestamp": "2026-10-29T15:36:17.000+0000",
  "channel": {
    "id": "1730052000.769021764",
    "linkedid": "1730052000.769021764",
    "state": "Ring",
    "caller": {
      "name": "",
      "number": "380678232082"
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
  "session_id": "315ea14e-0c62-465e-8be6-731ca337be98",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwNzcsImlhdCI6MTc5MzI4ODE3NywianRpIjoiZWEwNDIyMGQtZWI1ZC00MGNiLTk3OTgtODc0MGUxOTA3OTA1Iiwic2lkIjoiMzE1ZWExNGUtMGM2Mi00NjVlLThiZTYtNzMxY2EzMzdiZTk4In0.XnwFsEuNpbzD7boKOFxeRKcwH9x0xsjcY52oGBJvJPY",
  "access_expires_at": "2026-10-29T15:51:17.398378092Z",
  "refresh_token": "3O-isNTjGRnAAdXFlsNlsB1idvg5q9JShN0d88IJHbs",
  "refresh_expires_at": "2026-10-30T03:36:17.398011429Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/calls?state=RINGING` → **200**

```json
{
  "calls": [
    {
      "id": "30446e45-0383-4606-aeb5-f7f93d1591b4",
      "direction": "INBOUND",
      "party": null,
      "state": "RINGING",
      "caller_phone": "+380678232082",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": null,
      "order_ids": [],
      "started_at": "2026-10-29T15:36:17Z",
      "answered_at": null,
      "ended_at": null,
      "recording": null
    }
  ]
}
```

## The operator takes the call

`POST /api/operator/v1/calls/30446e45-0383-4606-aeb5-f7f93d1591b4/answer` → **200**

```json
{
  "command_id": "fc35c0e3-aa75-4365-b908-7a0fd156f69a"
}
```

```json
{
  "id": "30446e45-0383-4606-aeb5-f7f93d1591b4",
  "direction": "INBOUND",
  "party": null,
  "state": "ANSWERED",
  "caller_phone": "+380678232082",
  "called_number": "+380441110064",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "order_ids": [],
  "started_at": "2026-10-29T15:36:17Z",
  "answered_at": "2026-10-29T15:36:17.772835Z",
  "ended_at": null,
  "recording": null
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730052000.769021764",
    "state": "Up"
  }
}
```

## During the call the operator makes a phone order, linked to the call

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "2cc0b719-4cc4-486b-b89d-9dbc5a9c28cb",
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
  "id": "fe9b824a-94af-4ccc-8bc5-41440bcc0452",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:17.984799Z",
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
  "command_id": "0b54c9c6-5fc8-41b9-9388-19584ac62f53",
  "quote_id": "fe9b824a-94af-4ccc-8bc5-41440bcc0452",
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
    "phone": "+380678232082"
  },
  "call_id": "30446e45-0383-4606-aeb5-f7f93d1591b4"
}
```

```json
{
  "id": "c758b611-99af-45f3-89ae-4f46d0b17519",
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
  "created_at": "2026-10-29T15:36:18.184032Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678232082"
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
    "id": "1730052000.769021764",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?state=ENDED` → **200**

```json
{
  "calls": [
    {
      "id": "30446e45-0383-4606-aeb5-f7f93d1591b4",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380678232082",
      "called_number": "+380441110064",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [
        "c758b611-99af-45f3-89ae-4f46d0b17519"
      ],
      "started_at": "2026-10-29T15:36:17Z",
      "answered_at": "2026-10-29T15:36:17.772835Z",
      "ended_at": "2026-10-29T15:36:18.391302Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    },
    {
      "id": "fb657075-ecf8-4e9d-9cf0-717aab8de744",
      "direction": "INBOUND",
      "party": null,
      "state": "ENDED",
      "caller_phone": "+380674349477",
      "called_number": "+380441110060",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [],
      "started_at": "2026-10-29T15:34:28.441365Z",
      "answered_at": "2026-10-29T15:34:28.652947Z",
      "ended_at": "2026-10-29T15:34:28.860799Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:34:34.580413Z"
      }
    }
  ]
}
```

`GET /api/operator/v1/orders/c758b611-99af-45f3-89ae-4f46d0b17519` → **200**

```json
{
  "id": "c758b611-99af-45f3-89ae-4f46d0b17519",
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
  "created_at": "2026-10-29T15:36:18.184032Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678232082"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## Clean-up: the order is cancelled

`GET /api/operator/v1/orders/c758b611-99af-45f3-89ae-4f46d0b17519` → **200**

```json
{
  "id": "c758b611-99af-45f3-89ae-4f46d0b17519",
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
  "created_at": "2026-10-29T15:36:18.184032Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678232082"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/c758b611-99af-45f3-89ae-4f46d0b17519/cancel` → **200**

```json
{
  "command_id": "2edbcdf1-17ab-4632-84e8-e4561409353d",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "c758b611-99af-45f3-89ae-4f46d0b17519",
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
  "created_at": "2026-10-29T15:36:18.184032Z",
  "caller": {
    "name": "Caller",
    "phone": "+380678232082"
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

Done: call 30446e45-0383-4606-aeb5-f7f93d1591b4 with order c758b611-99af-45f3-89ae-4f46d0b17519.

# Scenario: interruption

## A ride starts with Ivan

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-29272"
}
```

```json
{
  "challenge_id": "7a463018-578f-42b3-ab68-58a5064ed46b",
  "expires_at": "2026-10-29T15:41:19.186860696Z",
  "resend_available_at": "2026-10-29T15:36:20.186860696Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "275968",
  "sent_at": "2026-10-29T15:36:19.18868062Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7a463018-578f-42b3-ab68-58a5064ed46b",
  "code": "275968",
  "device_ref": "sandbox-29272"
}
```

```json
{
  "session_id": "40f7f9a5-36c2-42b0-90c1-16b3cf13a723",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA3OSwiaWF0IjoxNzkzMjg4MTc5LCJqdGkiOiJjNTg2MWVhNS0yMTI4LTQ4NzUtYWUzMS04N2UzN2VkYmZkZDciLCJzaWQiOiI0MGY3ZjlhNS0zNmMyLTQyYjAtOTBjMS0xNmIzY2YxM2E3MjMifQ.TujJS3ZjfSRK664SbYCjzcQ79KZdzqTj7VxJ4Gr_16E",
  "access_expires_at": "2026-10-29T15:51:19.394839062Z",
  "refresh_token": "DB9qoJMMC7iZGLNl9pnlFbebjtnbzdDKi1aYO_Y68qQ",
  "refresh_expires_at": "2026-11-28T15:36:19.394510777Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:10.138722Z",
  "last_location_at": "2026-10-29T15:36:10.138722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/handover` → **200**

```json
{
  "command_id": "85cfc7e8-678e-4b6e-ace3-692328357ea9",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:10.138722Z",
  "last_location_at": "2026-10-29T15:36:10.138722Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4275,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:19Z",
    "sequence": 1793288179967
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:19.982562Z",
  "last_location_at": "2026-10-29T15:36:19.982562Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380662064307",
  "device_ref": "sandbox-9820"
}
```

```json
{
  "challenge_id": "432356f6-6eb9-47fd-ab39-9ed731f9802d",
  "expires_at": "2026-10-29T15:41:20.158583484Z",
  "resend_available_at": "2026-10-29T15:36:21.158583484Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380662064307` → **200**

```json
{
  "phone": "+380662064307",
  "audience": "CLIENT",
  "code": "000836",
  "sent_at": "2026-10-29T15:36:20.160450424Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "432356f6-6eb9-47fd-ab39-9ed731f9802d",
  "code": "000836",
  "device_ref": "sandbox-9820"
}
```

```json
{
  "session_id": "3a72d8a5-c63c-4a7d-962a-b6a625d8f0bd",
  "subject": {
    "type": "CLIENT",
    "id": "767c7161-60c2-46b3-8d2a-e8bcc3052bf4"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI3NjdjNzE2MS02MGMyLTQ2YjMtOGQyYS1lOGJjYzMwNTJiZjQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDgwLCJpYXQiOjE3OTMyODgxODAsImp0aSI6ImNiNzFkMjg2LTEyODMtNDQ4OS04ZDAzLWE0MTdlMTA4ZGUzNyIsInNpZCI6IjNhNzJkOGE1LWM2M2MtNGE3ZC05NjJhLWI2YTYyNWQ4ZjBiZCJ9.D4aB5Y8Oca8-XVfvwzEZM7B5vmKfc9SDH4kywetAuvk",
  "access_expires_at": "2026-10-29T15:51:20.360563925Z",
  "refresh_token": "9w_i7fSn2UYD4TLzp_dqS69FMXLbcF36AWyyBAQET6M",
  "refresh_expires_at": "2026-11-28T15:36:20.359793629Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "3ed246f0-734c-45d0-a079-c3ffc591118b",
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
  "id": "4cf09e9a-93f5-4b6d-84d3-be4b3b153030",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 21185,
  "currency": "UAH",
  "distance_m": 9142,
  "duration_s": 1316,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:20.545116Z",
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
  "command_id": "2cafe1a9-3339-44ad-b246-50c99a7f0daf",
  "quote_id": "4cf09e9a-93f5-4b6d-84d3-be4b3b153030",
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
  "id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
  "short_number": 15,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "767c7161-60c2-46b3-8d2a-e8bcc3052bf4",
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
  "created_at": "2026-10-29T15:36:20.735914Z",
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
    "id": "a2da0f2b-f6cb-4df9-91b3-5a5f876abb28",
    "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
    "expires_at": "2026-10-29T15:36:35.738077Z",
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

`POST /api/driver/v1/offers/a2da0f2b-f6cb-4df9-91b3-5a5f876abb28/accept` → **200**

```json
{
  "command_id": "3ea83bab-20b5-4e4c-bf51-85c026ec61cb"
}
```

```json
{
  "id": "63ee5500-a849-4304-8621-87303c85bbdd",
  "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "465b668a-2894-4b17-9d6b-87e512fbb2e4",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "465b668a-2894-4b17-9d6b-87e512fbb2e4",
  "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
  "assignment_id": "63ee5500-a849-4304-8621-87303c85bbdd",
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

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4269,
    "lon": 30.5636,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:21Z",
    "sequence": 1793288181506
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:21.522475Z",
  "last_location_at": "2026-10-29T15:36:21.522475Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/465b668a-2894-4b17-9d6b-87e512fbb2e4/arrive` → **200**

```json
{
  "command_id": "1914ea9c-c726-4c52-8144-621172483ebb",
  "expected_version": 0
}
```

```json
{
  "id": "465b668a-2894-4b17-9d6b-87e512fbb2e4",
  "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
  "assignment_id": "63ee5500-a849-4304-8621-87303c85bbdd",
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
  "arrived_at": "2026-10-29T15:36:21.720571Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/465b668a-2894-4b17-9d6b-87e512fbb2e4/start` → **200**

```json
{
  "command_id": "1b000483-3e38-4f70-8ac8-22637d523e45",
  "expected_version": 1
}
```

```json
{
  "id": "465b668a-2894-4b17-9d6b-87e512fbb2e4",
  "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
  "assignment_id": "63ee5500-a849-4304-8621-87303c85bbdd",
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
  "arrived_at": "2026-10-29T15:36:21.720571Z",
  "started_at": "2026-10-29T15:36:21.91404Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## The car breaks down halfway; Oleh is free nearby

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4100,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:22Z",
    "sequence": 1793288182101
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:22.116496Z",
  "last_location_at": "2026-10-29T15:36:22.116496Z",
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
  "device_ref": "sandbox-31609"
}
```

```json
{
  "challenge_id": "9f2fbdb9-2eb4-435f-84c1-a0c4caa9d175",
  "expires_at": "2026-10-29T15:41:22.297564015Z",
  "resend_available_at": "2026-10-29T15:36:23.297564015Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "113847",
  "sent_at": "2026-10-29T15:36:22.299818551Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9f2fbdb9-2eb4-435f-84c1-a0c4caa9d175",
  "code": "113847",
  "device_ref": "sandbox-31609"
}
```

```json
{
  "session_id": "e1ad1056-ef8c-4aee-a9f2-570cb2a688f4",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA4MiwiaWF0IjoxNzkzMjg4MTgyLCJqdGkiOiJjMDVjOTY0OS1hNGY2LTQ3ODYtOTc0My1jZTBmYmNkYTZmMjIiLCJzaWQiOiJlMWFkMTA1Ni1lZjhjLTRhZWUtYTlmMi01NzBjYjJhNjg4ZjQifQ.swe1BOwGSIj7PJIyn_z94d6oc_2_8eytyCpuo4ofkUA",
  "access_expires_at": "2026-10-29T15:51:22.501763324Z",
  "refresh_token": "2MN7jWGbWUKlW9y6BLLD4nCDWOP_E_9amTNHKpzDvUM",
  "refresh_expires_at": "2026-11-28T15:36:22.501112382Z",
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
  "command_id": "fdfe191b-a1e0-46bd-a3ef-6e4bbf43dda3",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4105,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:22Z",
    "sequence": 1793288182873
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f3fee577-8d04-44dd-967e-0f6fa327ca4e",
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
  "last_heartbeat_at": "2026-10-29T15:36:22.888541Z",
  "last_location_at": "2026-10-29T15:36:22.888541Z",
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
  "session_id": "8cd79f41-857e-4cad-91e0-a602d03f9d0b",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwODMsImlhdCI6MTc5MzI4ODE4MywianRpIjoiNDRjODZkZTQtMDkzOC00YmFlLWJlNzQtZDFmMzVhOWJkNjIzIiwic2lkIjoiOGNkNzlmNDEtODU3ZS00Y2FkLTkxZTAtYTYwMmQwM2Y5ZDBiIn0.aHKerBLbyA52aVlj_WVvZL2nQWsifLFJlJf1nXzIyk4",
  "access_expires_at": "2026-10-29T15:51:23.278104882Z",
  "refresh_token": "t7WvxunfN06d-muZ-9yA-Uh9g35_YjOe-LgBeBj-NRM",
  "refresh_expires_at": "2026-10-30T03:36:23.277618414Z",
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
  "session_id": "a0a9f092-cbe9-4e18-9bec-5735ded6926f",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwODMsImlhdCI6MTc5MzI4ODE4MywianRpIjoiMjY4NGRlZjUtYjlhOC00Zjg4LTliNmQtODFkNjY3ZmI3MDM3Iiwic2lkIjoiYTBhOWYwOTItY2JlOS00ZTE4LTliZWMtNTczNWRlZDY5MjZmIn0.3KEuEXSQc6jbqW9ygJMi2IBUnBuoK-SzmPSAY_4VktM",
  "access_expires_at": "2026-10-29T15:51:23.665522833Z",
  "refresh_token": "L45x1oO813qjOaylxtjEix50ANzoDyB22wwxvPZk3jU",
  "refresh_expires_at": "2026-10-30T03:36:23.665100376Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f1e4c50a-f620-46dc-9457-dbde092e6bc5` → **200**

```json
{
  "id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
  "short_number": 15,
  "status": "IN_SERVICE",
  "status_reason": null,
  "version": 5,
  "channel": "APP",
  "payer_client_id": "767c7161-60c2-46b3-8d2a-e8bcc3052bf4",
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
    "id": "63ee5500-a849-4304-8621-87303c85bbdd",
    "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
    "driver_id": "5a000000-0000-4000-8000-000000000401",
    "vehicle_id": "5a000000-0000-4000-8000-000000000501",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "465b668a-2894-4b17-9d6b-87e512fbb2e4",
    "trip_phase": "IN_PROGRESS"
  },
  "created_at": "2026-10-29T15:36:20.735914Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/f1e4c50a-f620-46dc-9457-dbde092e6bc5/interrupt` → **200**

```json
{
  "command_id": "59f3558d-aab3-45d6-b12f-ac07ab7f7be5",
  "expected_version": 5,
  "reason_code": "VEHICLE_BREAKDOWN",
  "comment": "Двигун заглух",
  "follow_up": true
}
```

```json
{
  "order": {
    "id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
    "short_number": 15,
    "status": "CANCELLED",
    "status_reason": "VEHICLE_BREAKDOWN",
    "version": 6,
    "channel": "APP",
    "payer_client_id": "767c7161-60c2-46b3-8d2a-e8bcc3052bf4",
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
      "id": "63ee5500-a849-4304-8621-87303c85bbdd",
      "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
      "driver_id": "5a000000-0000-4000-8000-000000000401",
      "vehicle_id": "5a000000-0000-4000-8000-000000000501",
      "source": "OFFER",
      "state": "RELEASED",
      "trip_id": "465b668a-2894-4b17-9d6b-87e512fbb2e4",
      "trip_phase": "ABORTED"
    },
    "created_at": "2026-10-29T15:36:20.735914Z",
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
    "id": "983b0e45-30eb-4195-923e-63f1169f2047",
    "short_number": 16,
    "status": "SEARCHING",
    "status_reason": null,
    "version": 2,
    "channel": "APP",
    "payer_client_id": "767c7161-60c2-46b3-8d2a-e8bcc3052bf4",
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
    "id": "7b455fce-823f-423e-9a97-9668887417d6",
    "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
    "expires_at": "2026-10-29T15:36:39.058187Z",
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

`POST /api/driver/v1/offers/7b455fce-823f-423e-9a97-9668887417d6/accept` → **200**

```json
{
  "command_id": "66139431-1c93-46e1-9fa4-67f582faa1c2"
}
```

```json
{
  "id": "e039252d-7148-48aa-bfe3-f25ee0066e0d",
  "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "f342e8a5-4718-419d-8ea0-482bc0cc449c",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "f342e8a5-4718-419d-8ea0-482bc0cc449c",
  "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
  "assignment_id": "e039252d-7148-48aa-bfe3-f25ee0066e0d",
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
  "session_id": "f3fee577-8d04-44dd-967e-0f6fa327ca4e",
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
  "last_heartbeat_at": "2026-10-29T15:36:22.888541Z",
  "last_location_at": "2026-10-29T15:36:22.888541Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/work-sessions/f3fee577-8d04-44dd-967e-0f6fa327ca4e/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4101,
    "lon": 30.5250,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:25Z",
    "sequence": 1793288185954
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "f3fee577-8d04-44dd-967e-0f6fa327ca4e",
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
  "last_heartbeat_at": "2026-10-29T15:36:25.02542Z",
  "last_location_at": "2026-10-29T15:36:25.02542Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/f342e8a5-4718-419d-8ea0-482bc0cc449c/arrive` → **200**

```json
{
  "command_id": "dde1189f-6648-4d99-95c7-0451d51a8c56",
  "expected_version": 0
}
```

```json
{
  "id": "f342e8a5-4718-419d-8ea0-482bc0cc449c",
  "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
  "assignment_id": "e039252d-7148-48aa-bfe3-f25ee0066e0d",
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
  "arrived_at": "2026-10-29T15:36:25.21603Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f342e8a5-4718-419d-8ea0-482bc0cc449c/start` → **200**

```json
{
  "command_id": "4d286465-ff90-446c-abd1-742bdcf6e9f7",
  "expected_version": 1
}
```

```json
{
  "id": "f342e8a5-4718-419d-8ea0-482bc0cc449c",
  "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
  "assignment_id": "e039252d-7148-48aa-bfe3-f25ee0066e0d",
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
  "arrived_at": "2026-10-29T15:36:25.21603Z",
  "started_at": "2026-10-29T15:36:25.412174Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/f342e8a5-4718-419d-8ea0-482bc0cc449c/complete` → **200**

```json
{
  "command_id": "f0bea980-128f-4598-a672-a961d7c69dc6",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:36:25Z"
}
```

```json
{
  "id": "f342e8a5-4718-419d-8ea0-482bc0cc449c",
  "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
  "assignment_id": "e039252d-7148-48aa-bfe3-f25ee0066e0d",
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
  "arrived_at": "2026-10-29T15:36:25.21603Z",
  "started_at": "2026-10-29T15:36:25.412174Z",
  "completed_at": "2026-10-29T15:36:25.603938Z",
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
    "id": "983b0e45-30eb-4195-923e-63f1169f2047",
    "short_number": 16,
    "status": "FULFILLED",
    "created_at": "2026-10-29T15:36:24.051788Z",
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
    "id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
    "short_number": 15,
    "status": "CANCELLED",
    "created_at": "2026-10-29T15:36:20.735914Z",
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

`GET /api/operator/v1/orders/f1e4c50a-f620-46dc-9457-dbde092e6bc5/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderCreated",
      "occurred_at": "2026-10-29T15:36:20.736279Z",
      "actor": {
        "type": "CLIENT",
        "id": "767c7161-60c2-46b3-8d2a-e8bcc3052bf4",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000001",
        "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
        "quote_id": "4cf09e9a-93f5-4b6d-84d3-be4b3b153030",
        "price_minor": 21185,
        "payment_method": "CASH"
      },
      "correlation_id": "a80d3fff-1c5f-4951-8d31-853647cbd61a"
    },
    {
      "sequence": 1,
      "type": "OrderSearchStarted",
      "occurred_at": "2026-10-29T15:36:20.73764Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
        "attempt_id": "85139a81-5de1-428d-8fce-491fb3e313a2",
        "generation": 1,
        "search_seconds": 180
      },
      "correlation_id": "a80d3fff-1c5f-4951-8d31-853647cbd61a"
    },
    {
      "sequence": 2,
      "type": "OfferMade",
      "occurred_at": "2026-10-29T15:36:20.741818Z",
      "actor": {
        "type": "SYSTEM",
        "id": null,
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "offer_id": "a2da0f2b-f6cb-4df9-91b3-5a5f876abb28",
        "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "distance_m": 78
      },
      "correlation_id": "a80d3fff-1c5f-4951-8d31-853647cbd61a"
    },
    {
      "sequence": 3,
      "type": "AssignmentCommitted",
      "occurred_at": "2026-10-29T15:36:21.157965Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000401",
        "name": "Іван Петренко",
        "role": null
      },
      "reason": null,
      "details": {
        "source": "OFFER",
        "offer_id": "a2da0f2b-f6cb-4df9-91b3-5a5f876abb28",
        "order_id": "f1e4c50a-f620-46dc-9457-dbde092e6bc5",
        "driver_id": "5a000000-0000-4000-8000-000000000401",
        "assignment_id": "63ee5500-a849-4304-8621-87303c85bbdd"
      },
      "correlation_id": "28b7f040-0558-43c6-b449-04122ed501ea"
```

## A service-paid follow-up cannot be tipped

`GET /api/rider/v1/orders/983b0e45-30eb-4195-923e-63f1169f2047/tip` → **200**

```json
{
  "order_id": "983b0e45-30eb-4195-923e-63f1169f2047",
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
  "available_until": "2026-10-30T15:36:25.603938Z",
  "open": false,
  "tip": null
}
```

`POST /api/rider/v1/orders/983b0e45-30eb-4195-923e-63f1169f2047/tip` → **409**

```json
{
  "command_id": "85037512-7a2b-4eac-91ed-93202e8a9f5c",
  "amount_minor": 100
}
```

```json
{
  "instance": "/api/rider/v1/orders/983b0e45-30eb-4195-923e-63f1169f2047/tip",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "7304d4e1-0df0-4286-b6c0-ed7d033dfae5"
}
```

Done: interrupted f1e4c50a-f620-46dc-9457-dbde092e6bc5, follow-up 983b0e45-30eb-4195-923e-63f1169f2047.

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "1105eaa1-82e3-43c6-ab87-fc882718c6ef",
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
  "last_heartbeat_at": "2026-10-29T15:36:22.116496Z",
  "last_location_at": "2026-10-29T15:36:22.116496Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/1105eaa1-82e3-43c6-ab87-fc882718c6ef/close` → **200**

```json
{
  "command_id": "495a86af-7106-4fb2-b02d-34e6b4c02f31",
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
  "session_id": "f3fee577-8d04-44dd-967e-0f6fa327ca4e",
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
  "last_heartbeat_at": "2026-10-29T15:36:25.02542Z",
  "last_location_at": "2026-10-29T15:36:25.02542Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/f3fee577-8d04-44dd-967e-0f6fa327ca4e/close` → **200**

```json
{
  "command_id": "013abf76-513e-4391-8891-d852bd0d7372",
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
  "session_id": "b72b8135-7075-4d6b-b479-1c1b0f985ee4",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwOTAsImlhdCI6MTc5MzI4ODE5MCwianRpIjoiYjkzZmVhZWEtMzdhMi00YjJiLWFhNDYtMmQwNjY3NDEzYmRmIiwic2lkIjoiYjcyYjgxMzUtNzA3NS00ZDZiLWI0NzktMWMxYjBmOTg1ZWU0In0.vfBryJsldUiIl2VPsI76FUgmVd-8AO2nLlVIAr3Qn-0",
  "access_expires_at": "2026-10-29T15:51:30.732677372Z",
  "refresh_token": "JNcCKfts69Zw25ycXif7ZzIAlizOTu6i8pRdp9UPvSg",
  "refresh_expires_at": "2026-10-30T03:36:30.732248255Z",
  "password_change_required": false
}
```

## The admin publishes riders' terms that must be accepted

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "2c891d2d-ee2b-46c4-b693-2f523ecccd49",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:36:30Z"
}
```

```json
{
  "id": "b0db6d75-d0bc-43c6-bb20-52d5ab912744",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:36:30Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/b0db6d75-d0bc-43c6-bb20-52d5ab912744/publish` → **200**

```json
{
  "command_id": "dc194b69-229e-43da-938a-c78fe53c55fe",
  "expected_version": 0
}
```

```json
{
  "id": "b0db6d75-d0bc-43c6-bb20-52d5ab912744",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:36:31.126466Z",
  "published_at": "2026-10-29T15:36:31.126466Z",
  "version": 1
}
```

## Before signing in the app shows the text in Polish

`GET /api/config/v1/legal/rider/terms?language=pl` → **200**

```json
{
  "version_id": "b0db6d75-d0bc-43c6-bb20-52d5ab912744",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 1,
  "language": "pl",
  "text": "Regulamin (piaskownica)",
  "effective_from": "2026-10-29T15:36:31.126466Z"
}
```

## A rider who has not accepted them cannot order

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380639325722",
  "device_ref": "sandbox-14729"
}
```

```json
{
  "challenge_id": "bd67775e-8ebd-4013-879f-2e50a6bea680",
  "expires_at": "2026-10-29T15:41:31.500328638Z",
  "resend_available_at": "2026-10-29T15:36:32.500328638Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380639325722` → **200**

```json
{
  "phone": "+380639325722",
  "audience": "CLIENT",
  "code": "742391",
  "sent_at": "2026-10-29T15:36:31.50249878Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "bd67775e-8ebd-4013-879f-2e50a6bea680",
  "code": "742391",
  "device_ref": "sandbox-14729"
}
```

```json
{
  "session_id": "90cc71ac-8a87-455c-8cc2-8ea017c91f66",
  "subject": {
    "type": "CLIENT",
    "id": "071ba62b-1f56-482d-b34b-98b440337b3b"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNzFiYTYyYi0xZjU2LTQ4MmQtYjM0Yi05OGI0NDAzMzdiM2IiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDkxLCJpYXQiOjE3OTMyODgxOTEsImp0aSI6Ijc1MzNmYjUxLTIzMjAtNGEyOC1hNzIwLWI4NGI1NWQ3NjcwYiIsInNpZCI6IjkwY2M3MWFjLThhODctNDU1Yy04Y2MyLThlYTAxN2M5MWY2NiJ9.sJIHT5RE7ez8wKd-Gzg8cqSWndq60WoMuAwYjB8rXLY",
  "access_expires_at": "2026-10-29T15:51:31.700623718Z",
  "refresh_token": "Z4jeZ_thdaPSwCC5_hueOWfeo5mk6Wj6lGHx_JR_Q08",
  "refresh_expires_at": "2026-11-28T15:36:31.700107054Z",
  "account_created": true
}
```

`GET /api/rider/v1/legal` → **200**

```json
{
  "documents": [
    {
      "version_id": "b0db6d75-d0bc-43c6-bb20-52d5ab912744",
      "audience": "RIDER",
      "kind": "TERMS",
      "number": 1,
      "acceptance_required": true,
      "accepted": false,
      "effective_from": "2026-10-29T15:36:31.126466Z",
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
  "command_id": "aa580791-a8cb-45e1-9ec4-5a590aeed5bd",
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
  "id": "a5579d45-8c01-4798-9809-bafaee22309d",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:32.068514Z",
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
  "command_id": "9b047dc4-0af9-4836-9d2a-9642d194447e",
  "quote_id": "a5579d45-8c01-4798-9809-bafaee22309d",
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
  "correlation_id": "beb7655f-9304-42cd-b47e-4f763bf7fe45"
}
```

## The rider accepts them in Ukrainian and orders

`POST /api/rider/v1/legal/acceptances` → **200**

```json
{
  "command_id": "f97cd0f6-9548-4d6b-85ee-b262dfe4b009",
  "version_id": "b0db6d75-d0bc-43c6-bb20-52d5ab912744",
  "language": "uk"
}
```

```json
{
  "version_id": "b0db6d75-d0bc-43c6-bb20-52d5ab912744",
  "kind": "TERMS",
  "number": 1,
  "language": "uk",
  "accepted_at": "2026-10-29T15:36:32.459683Z"
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "1bbdf61a-f68d-4393-ae09-e397ade6e11c",
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
  "id": "fda57204-1cd6-4f69-bbaf-3db2acd328e6",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 30533,
  "currency": "UAH",
  "distance_m": 14114,
  "duration_s": 2032,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:32.647477Z",
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
  "command_id": "e15692a2-aaee-476c-9960-c4001cf43672",
  "quote_id": "fda57204-1cd6-4f69-bbaf-3db2acd328e6",
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
  "id": "38dd7271-d8a9-4a3c-a513-5c141521ae1d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "071ba62b-1f56-482d-b34b-98b440337b3b",
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
  "created_at": "2026-10-29T15:36:32.840912Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/38dd7271-d8a9-4a3c-a513-5c141521ae1d` → **200**

```json
{
  "id": "38dd7271-d8a9-4a3c-a513-5c141521ae1d",
  "short_number": 17,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "071ba62b-1f56-482d-b34b-98b440337b3b",
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
  "created_at": "2026-10-29T15:36:32.840912Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/38dd7271-d8a9-4a3c-a513-5c141521ae1d/cancel` → **200**

```json
{
  "command_id": "c2125c7c-75f7-4f82-bd01-7eaa01c6307b",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "38dd7271-d8a9-4a3c-a513-5c141521ae1d",
  "short_number": 17,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "071ba62b-1f56-482d-b34b-98b440337b3b",
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
  "created_at": "2026-10-29T15:36:32.840912Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

## A published version never changes

`POST /api/admin/v1/legal-documents/b0db6d75-d0bc-43c6-bb20-52d5ab912744` → **409**

```json
{
  "command_id": "abcb6d08-7f0e-4dd0-810f-821d607afd72",
  "expected_version": 1,
  "texts": {
    "uk": "Інше"
  },
  "acceptance_required": true,
  "effective_from": "2026-10-29T15:36:33Z"
}
```

```json
{
  "instance": "/api/admin/v1/legal-documents/b0db6d75-d0bc-43c6-bb20-52d5ab912744",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "5090f571-91e0-4e65-ace7-135b1e9e3332"
}
```

Done: the terms blocked ordering until accepted; a version that need not be accepted is published at the end.

`POST /api/admin/v1/legal-documents` → **201**

```json
{
  "command_id": "33422991-580c-48d1-bf01-82e23b3f1818",
  "audience": "RIDER",
  "kind": "TERMS",
  "texts": {
    "uk": "Умови користування (пісочниця)",
    "pl": "Regulamin (piaskownica)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:36:33Z"
}
```

```json
{
  "id": "9b824ff7-9d33-422c-b608-2f625a64a934",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "DRAFT",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:36:33Z",
  "published_at": null,
  "version": 0
}
```

`POST /api/admin/v1/legal-documents/9b824ff7-9d33-422c-b608-2f625a64a934/publish` → **200**

```json
{
  "command_id": "a47ea0b5-d9a1-4704-9611-f86cc4c500be",
  "expected_version": 0
}
```

```json
{
  "id": "9b824ff7-9d33-422c-b608-2f625a64a934",
  "audience": "RIDER",
  "kind": "TERMS",
  "number": 2,
  "state": "PUBLISHED",
  "texts": {
    "pl": "Regulamin (piaskownica)",
    "uk": "Умови користування (пісочниця)"
  },
  "acceptance_required": false,
  "effective_from": "2026-10-29T15:36:33.81332Z",
  "published_at": "2026-10-29T15:36:33.81332Z",
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
  "device_ref": "sandbox-4505"
}
```

```json
{
  "challenge_id": "2243fa10-c0de-4eb6-b7cc-026f8e24b729",
  "expires_at": "2026-10-29T15:41:34.001866693Z",
  "resend_available_at": "2026-10-29T15:36:35.001866693Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "612711",
  "sent_at": "2026-10-29T15:36:34.004110837Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2243fa10-c0de-4eb6-b7cc-026f8e24b729",
  "code": "612711",
  "device_ref": "sandbox-4505"
}
```

```json
{
  "session_id": "fb2ccd69-ddf0-4260-a80b-eba7d8db196e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTA5NCwiaWF0IjoxNzkzMjg4MTk0LCJqdGkiOiJkNjEzN2QwZS1kODcxLTQ5MzQtYTRhZC1jMDQ5OTVjYjRiZDkiLCJzaWQiOiJmYjJjY2Q2OS1kZGYwLTQyNjAtYTgwYi1lYmE3ZDhkYjE5NmUifQ.UcKWgdv55Fl8Bddeof005Qw49yERz2spWD3XSJcrD7Y",
  "access_expires_at": "2026-10-29T15:51:34.203670554Z",
  "refresh_token": "eMyKjxMu8zuPQrlYFtjlw4dByPiS8vV6PIgUWphqYGk",
  "refresh_expires_at": "2026-11-28T15:36:34.203213083Z",
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
  "command_id": "231b615f-9c5b-4495-a28f-89981ddcdf5e",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "location": {
    "lat": 50.4520,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:34Z",
    "sequence": 1793288194571
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "session_id": "049cf5cb-a01a-47ff-90f6-5b2b231e891c",
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
  "last_heartbeat_at": "2026-10-29T15:36:34.587212Z",
  "last_location_at": "2026-10-29T15:36:34.587212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## The rider orders a taxi for granny, with her phone; the rider pays

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380671131104",
  "device_ref": "sandbox-1657"
}
```

```json
{
  "challenge_id": "85245cde-51da-4c30-a978-519e1eda6647",
  "expires_at": "2026-10-29T15:41:34.780513968Z",
  "resend_available_at": "2026-10-29T15:36:35.780513968Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380671131104` → **200**

```json
{
  "phone": "+380671131104",
  "audience": "CLIENT",
  "code": "276591",
  "sent_at": "2026-10-29T15:36:34.782486994Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "85245cde-51da-4c30-a978-519e1eda6647",
  "code": "276591",
  "device_ref": "sandbox-1657"
}
```

```json
{
  "session_id": "f49f4d22-a58d-44aa-a30e-0d9f177e4a55",
  "subject": {
    "type": "CLIENT",
    "id": "1b56f751-2708-4edd-a461-a52db4f9559f"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIxYjU2Zjc1MS0yNzA4LTRlZGQtYTQ2MS1hNTJkYjRmOTU1OWYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MDk0LCJpYXQiOjE3OTMyODgxOTQsImp0aSI6IjBmMDFlNjAxLWRlNGUtNGI2Mi1iN2IxLTM2YjZmM2EzZjA5NSIsInNpZCI6ImY0OWY0ZDIyLWE1OGQtNDRhYS1hMzBlLTBkOWYxNzdlNGE1NSJ9.Dz4nPAofMQHLJw9rbiPtBrrv4Qtm7fWBTctxyZBEWWE",
  "access_expires_at": "2026-10-29T15:51:34.989090541Z",
  "refresh_token": "K9vndDMRUnDa9utUw6aOkzpP9PH-1A4hc7uX3RNVnzE",
  "refresh_expires_at": "2026-11-28T15:36:34.988745421Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "505b00d2-04be-4e6d-b5f2-b3c067d5da11",
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
  "id": "092b84da-d364-4d5a-bafb-31d5361b4ed0",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:35.179497Z",
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
  "command_id": "861e849a-d4ef-4c11-afec-72d95ddc7cd6",
  "quote_id": "092b84da-d364-4d5a-bafb-31d5361b4ed0",
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
    "phone": "+380671324689"
  }
}
```

```json
{
  "id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
  "short_number": 18,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:35.380075Z",
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
    "id": "50d691cb-12cd-47d5-9a50-2ea9f331c2a1",
    "order_id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
    "expires_at": "2026-10-29T15:36:50.381953Z",
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

`POST /api/driver/v1/offers/50d691cb-12cd-47d5-9a50-2ea9f331c2a1/accept` → **200**

```json
{
  "command_id": "ce552294-8cb4-474e-a504-0a1fe1403555"
}
```

```json
{
  "id": "53078508-9fda-4264-b855-c36e8d898d46",
  "order_id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
  "driver_id": "5a000000-0000-4000-8000-000000000402",
  "vehicle_id": "5a000000-0000-4000-8000-000000000502",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "57b57eb9-c7ef-4bd1-beaf-60e39387719f",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "57b57eb9-c7ef-4bd1-beaf-60e39387719f",
  "order_id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
  "assignment_id": "53078508-9fda-4264-b855-c36e8d898d46",
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
    "phone": "+380671324689"
  }
}
```

## Two more orders: one for now, one for later — three in all

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "477aaa2c-5cf2-40d8-b427-c07ca4b3f61e",
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
  "id": "a2d0b5fd-ff36-4194-b822-c8ca276c3a6e",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:36.160142Z",
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
  "command_id": "cdf8b172-debd-4011-9a0b-648e8a1469d8",
  "quote_id": "a2d0b5fd-ff36-4194-b822-c8ca276c3a6e",
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
  "id": "8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:36.350897Z",
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
  "command_id": "6b5c17ac-3af1-4762-a21d-fab367a277cd",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "dropoff": {
    "lat": 50.4405,
    "lon": 30.4890
  },
  "pickup_at": "2026-10-29T18:36:36Z"
}
```

```json
{
  "id": "19d50504-a88f-46e6-b367-a0342e89c1ae",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 13517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:36.550614Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 300,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:36:36Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 13517,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "5b92b253-1526-4023-bdb9-3ee7c879d1f2",
  "quote_id": "19d50504-a88f-46e6-b367-a0342e89c1ae",
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
  "pickup_at": "2026-10-29T18:36:36Z"
}
```

```json
{
  "id": "854a5bcf-ab29-4db7-b110-9068777621f8",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:36:36.749774Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:36:36Z",
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
  "command_id": "7d9bd338-d977-45a4-95c9-6f27af4f93bb",
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
  "id": "46338f92-af71-4495-9442-22ead3995452",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:36.950759Z",
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
  "command_id": "e439e017-5fb2-41ea-b3c2-350eff82df29",
  "quote_id": "46338f92-af71-4495-9442-22ead3995452",
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
  "correlation_id": "743a68ab-d29c-49e3-b680-3f96b2af1065"
}
```

`GET /api/rider/v1/orders/current` → **200**

```json
{
  "orders": [
    {
      "id": "854a5bcf-ab29-4db7-b110-9068777621f8",
      "short_number": 20,
      "status": "SCHEDULED",
      "status_reason": null,
      "version": 0,
      "channel": "APP",
      "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
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
      "created_at": "2026-10-29T15:36:36.749774Z",
      "cancellation": null,
      "pickup_at": "2026-10-29T18:36:36Z",
      "preorder": true,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f",
      "short_number": 19,
      "status": "SEARCHING",
      "status_reason": null,
      "version": 2,
      "channel": "APP",
      "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "vehicle_class": "STANDARD",
      "pickup": {
        "lat": 50.4501,
        "lon": 30.5234
      },
      "pickup_label": "Майдан",
      "dropoff": {
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
      "created_at": "2026-10-29T15:36:36.350897Z",
      "cancellation": null,
      "pickup_at": null,
      "preorder": false,
      "related_order_id": null,
      "wallet_minor": 0,
      "discount_minor": 0,
      "pickup_eta": null
    },
    {
      "id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
      "short_number": 18,
      "status": "ASSIGNED",
      "status_reason": null,
      "version": 3,
```

`GET /api/rider/v1/orders/active` → **200**

```json
{
  "id": "8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:36.350897Z",
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

`GET /api/rider/v1/orders/d4ef337a-0bdd-4451-af3b-f3e6ed1961cb` → **200**

```json
{
  "id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
  "short_number": 18,
  "status": "ASSIGNED",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "53078508-9fda-4264-b855-c36e8d898d46",
    "order_id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "COMMITTED",
    "trip_id": "57b57eb9-c7ef-4bd1-beaf-60e39387719f",
    "trip_phase": "TO_PICKUP"
  },
  "created_at": "2026-10-29T15:36:35.380075Z",
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
    "location_at": "2026-10-29T15:36:34.587212Z",
    "stale": false
  }
}
```

`POST /api/rider/v1/orders/d4ef337a-0bdd-4451-af3b-f3e6ed1961cb/cancel` → **200**

```json
{
  "command_id": "40b25e84-b31f-4459-8328-c34cd943218f",
  "expected_version": 3,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
  "short_number": 18,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 4,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
    "id": "53078508-9fda-4264-b855-c36e8d898d46",
    "order_id": "d4ef337a-0bdd-4451-af3b-f3e6ed1961cb",
    "driver_id": "5a000000-0000-4000-8000-000000000402",
    "vehicle_id": "5a000000-0000-4000-8000-000000000502",
    "source": "OFFER",
    "state": "RELEASED",
    "trip_id": "57b57eb9-c7ef-4bd1-beaf-60e39387719f",
    "trip_phase": "ABORTED"
  },
  "created_at": "2026-10-29T15:36:35.380075Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f` → **200**

```json
{
  "id": "8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f",
  "short_number": 19,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:36.350897Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f/cancel` → **200**

```json
{
  "command_id": "70b9ad2a-5db6-42ee-9701-22271b597339",
  "expected_version": 2,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f",
  "short_number": 19,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:36:36.350897Z",
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
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/854a5bcf-ab29-4db7-b110-9068777621f8` → **200**

```json
{
  "id": "854a5bcf-ab29-4db7-b110-9068777621f8",
  "short_number": 20,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:36:36.749774Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:36:36Z",
  "preorder": true,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/854a5bcf-ab29-4db7-b110-9068777621f8/cancel` → **200**

```json
{
  "command_id": "65a9324f-0ee4-42ed-ac8c-998f23f85405",
  "expected_version": 0,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "854a5bcf-ab29-4db7-b110-9068777621f8",
  "short_number": 20,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 1,
  "channel": "APP",
  "payer_client_id": "1b56f751-2708-4edd-a461-a52db4f9559f",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
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
  "created_at": "2026-10-29T15:36:36.749774Z",
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
  "pickup_at": "2026-10-29T18:36:36Z",
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
  "session_id": "049cf5cb-a01a-47ff-90f6-5b2b231e891c",
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
  "last_heartbeat_at": "2026-10-29T15:36:34.587212Z",
  "last_location_at": "2026-10-29T15:36:34.587212Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/049cf5cb-a01a-47ff-90f6-5b2b231e891c/close` → **200**

```json
{
  "command_id": "f0dffd26-6c32-4f99-a82d-f9b8c9a3f433",
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

Done: orders d4ef337a-0bdd-4451-af3b-f3e6ed1961cb, 8c9a2ef3-0ac4-42c2-a38c-872dcdf3d35f, 854a5bcf-ab29-4db7-b110-9068777621f8.

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
  "session_id": "9f815e76-4362-473f-94cd-fe27e5253da1",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwOTksImlhdCI6MTc5MzI4ODE5OSwianRpIjoiODk2NmQ2M2EtMDQzNy00ZTY4LTllMTgtZjU4NTFlYzZmMmU5Iiwic2lkIjoiOWY4MTVlNzYtNDM2Mi00NzNmLTk0Y2QtZmUyN2U1MjUzZGExIn0.CdnpSiu32k0qVLZK0tOXtVDYb_uWjLWhKs1D5lgYRbY",
  "access_expires_at": "2026-10-29T15:51:39.441088757Z",
  "refresh_token": "AbSWwiXQ3V9h2xzA-IWE4975HX-KV_nWFgd2z7BJ_A0",
  "refresh_expires_at": "2026-10-30T03:36:39.440759611Z",
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
  "session_id": "9de28e21-acef-4f0f-b876-9c03263e6238",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkwOTksImlhdCI6MTc5MzI4ODE5OSwianRpIjoiN2QwMzllZTYtYWIxZi00MWY0LTllODctYjk3YmQ2M2E2N2RmIiwic2lkIjoiOWRlMjhlMjEtYWNlZi00ZjBmLWI4NzYtOWMwMzI2M2U2MjM4In0.M9Ekvlh9-8NL2f36bX--ZXsMIbkw_KJn9EMeS7TzEiA",
  "access_expires_at": "2026-10-29T15:51:39.834453436Z",
  "refresh_token": "scsl9HgzKgMBw5M1itOhg77lJZ07V1G8jM_hF85TZHA",
  "refresh_expires_at": "2026-10-30T03:36:39.834087869Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-31904"
}
```

```json
{
  "challenge_id": "407fb101-dde1-4c85-ad95-56c346501c7a",
  "expires_at": "2026-10-29T15:41:40.010174838Z",
  "resend_available_at": "2026-10-29T15:36:41.010174838Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "769536",
  "sent_at": "2026-10-29T15:36:40.012295972Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "407fb101-dde1-4c85-ad95-56c346501c7a",
  "code": "769536",
  "device_ref": "sandbox-31904"
}
```

```json
{
  "session_id": "d09f7a61-62bb-452b-80a7-9554c257dc17",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTEwMCwiaWF0IjoxNzkzMjg4MjAwLCJqdGkiOiIxMWFkZDRiMC03OWE3LTQ5ZTItOWY5ZS03YzhlNWE2OTBkMTUiLCJzaWQiOiJkMDlmN2E2MS02MmJiLTQ1MmItODBhNy05NTU0YzI1N2RjMTcifQ.iqGkbT9Z2wn2121Bi7WdCw5nrc49-DDBA1Mgj9Sp0ok",
  "access_expires_at": "2026-10-29T15:51:40.211568228Z",
  "refresh_token": "mrVamQSpI6Doetoj0V4ZzttYdM-ULJIUi8HNNlYSEUE",
  "refresh_expires_at": "2026-11-28T15:36:40.211150599Z",
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
  "command_id": "c5582874-f8a6-458f-84bb-e6c604e5ad48",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:40Z",
    "sequence": 1793288200570
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c9968158-915c-49f1-9ef2-61fe422660be",
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
  "last_heartbeat_at": "2026-10-29T15:36:40.585672Z",
  "last_location_at": "2026-10-29T15:36:40.585672Z",
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
  "command_id": "94599e24-f1ba-41b2-b38b-7f8a06f373e1",
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
  "effective_at": "2026-10-29T15:36:40.962309Z",
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox operator bonus scenario"
}
```

`GET /api/operator/v1/me/bonus` → **200**

```json
{
  "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "balance": 1,
  "fulfilled_count": 1,
  "cancelled_count": 0,
  "period_started_at": "2026-10-29T15:34:42.226671Z",
  "last_entries": [
    {
      "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:34:42.226671Z"
    }
  ]
}
```

## First phone order is fulfilled

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "194ec7e8-eadf-415a-bba0-fb2ae075ed98",
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
  "id": "486e3d04-5272-421b-860c-f2ac287d77bc",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:41.341027Z",
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
  "command_id": "868fde62-ba74-47ce-8e0e-555f47311242",
  "quote_id": "486e3d04-5272-421b-860c-f2ac287d77bc",
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
    "phone": "+3806711131775"
  }
}
```

```json
{
  "id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
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
  "created_at": "2026-10-29T15:36:41.527786Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+3806711131775"
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
    "id": "90fce266-f5d9-4e02-bf2a-951ef22ff0df",
    "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
    "expires_at": "2026-10-29T15:36:56.530177Z",
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

`POST /api/driver/v1/offers/90fce266-f5d9-4e02-bf2a-951ef22ff0df/accept` → **200**

```json
{
  "command_id": "e1e21c23-2b63-4f67-9626-4773cbae7d30"
}
```

```json
{
  "id": "7b5c015f-f4f2-4f73-91f1-5553ccc4fd7f",
  "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3",
  "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
  "assignment_id": "7b5c015f-f4f2-4f73-91f1-5553ccc4fd7f",
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
    "phone": "+3806711131775"
  }
}
```

`POST /api/driver/v1/work-sessions/c9968158-915c-49f1-9ef2-61fe422660be/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:36:42Z",
    "sequence": 1793288202257
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c9968158-915c-49f1-9ef2-61fe422660be",
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
  "last_heartbeat_at": "2026-10-29T15:36:42.27188Z",
  "last_location_at": "2026-10-29T15:36:42.27188Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3/arrive` → **200**

```json
{
  "command_id": "a4a7a69e-ddfd-4bf0-afee-15453bb46f5f",
  "expected_version": 0
}
```

```json
{
  "id": "fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3",
  "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
  "assignment_id": "7b5c015f-f4f2-4f73-91f1-5553ccc4fd7f",
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
  "arrived_at": "2026-10-29T15:36:42.455791Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131775"
  }
}
```

`POST /api/driver/v1/trips/fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3/start` → **200**

```json
{
  "command_id": "1d1d208a-cde4-45f5-b7c5-d21a2b65136d",
  "expected_version": 1
}
```

```json
{
  "id": "fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3",
  "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
  "assignment_id": "7b5c015f-f4f2-4f73-91f1-5553ccc4fd7f",
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
  "arrived_at": "2026-10-29T15:36:42.455791Z",
  "started_at": "2026-10-29T15:36:42.645009Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": {
    "name": "Bonus rider",
    "phone": "+3806711131775"
  }
}
```

`POST /api/driver/v1/trips/fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3/complete` → **200**

```json
{
  "command_id": "36bd9b65-e6f9-49a1-8ee4-791af6b526ac",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:36:42Z",
  "cash_received": true
}
```

```json
{
  "id": "fcb8c6fe-a0ce-442b-99fd-4f7e6ac573d3",
  "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
  "assignment_id": "7b5c015f-f4f2-4f73-91f1-5553ccc4fd7f",
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
  "arrived_at": "2026-10-29T15:36:42.455791Z",
  "started_at": "2026-10-29T15:36:42.645009Z",
  "completed_at": "2026-10-29T15:36:42.837873Z",
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
  "command_id": "169332c2-85f1-4ed1-b08e-e1a9f8e2174f",
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
  "id": "7a4591e4-217d-473f-97b7-24e6da43a747",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:43.027442Z",
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
  "command_id": "16e2d52b-c39e-4378-88ec-0c1405953406",
  "quote_id": "7a4591e4-217d-473f-97b7-24e6da43a747",
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
    "phone": "+380671111470"
  }
}
```

```json
{
  "id": "8f88f035-e9b2-4eb5-8d15-a52f644b32da",
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
  "created_at": "2026-10-29T15:36:43.21696Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111470"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/8f88f035-e9b2-4eb5-8d15-a52f644b32da` → **200**

```json
{
  "id": "8f88f035-e9b2-4eb5-8d15-a52f644b32da",
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
  "created_at": "2026-10-29T15:36:43.21696Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111470"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/8f88f035-e9b2-4eb5-8d15-a52f644b32da/cancel` → **200**

```json
{
  "command_id": "2a8bba76-5088-4baf-9403-71b92c2f3616",
  "expected_version": 2,
  "reason_code": "OPERATOR_ERROR"
}
```

```json
{
  "id": "8f88f035-e9b2-4eb5-8d15-a52f644b32da",
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
  "created_at": "2026-10-29T15:36:43.21696Z",
  "caller": {
    "name": "Bonus rider",
    "phone": "+380671111470"
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
  "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "balance": 0,
  "fulfilled_count": 2,
  "cancelled_count": 1,
  "period_started_at": "2026-10-29T15:34:42.226671Z",
  "last_entries": [
    {
      "order_id": "8f88f035-e9b2-4eb5-8d15-a52f644b32da",
      "kind": "OPERATOR_FAULT_CANCELLATION",
      "rule_key": "default",
      "settings_version": 1,
      "points": -3,
      "occurred_at": "2026-10-29T15:36:43.602309Z"
    },
    {
      "order_id": "22863a82-d1de-4684-97bf-82f1d7aaa9c2",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 1,
      "points": 2,
      "occurred_at": "2026-10-29T15:36:42.840852Z"
    },
    {
      "order_id": "e278987f-5430-4273-9408-f1ca92daa795",
      "kind": "FULFILLED",
      "rule_key": "default",
      "settings_version": 0,
      "points": 1,
      "occurred_at": "2026-10-29T15:34:42.226671Z"
    }
  ]
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "c9968158-915c-49f1-9ef2-61fe422660be",
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
  "last_heartbeat_at": "2026-10-29T15:36:42.27188Z",
  "last_location_at": "2026-10-29T15:36:42.27188Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c9968158-915c-49f1-9ef2-61fe422660be/close` → **200**

```json
{
  "command_id": "36a548e8-ae0d-4966-b139-845bf16f8d34",
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

Done: operator bonus for fulfilled 22863a82-d1de-4684-97bf-82f1d7aaa9c2 and operator-fault cancellation 8f88f035-e9b2-4eb5-8d15-a52f644b32da.

# Scenario: otp-channels

## A code by SMS, the default channel

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380673483620",
  "device_ref": "sandbox-28148"
}
```

```json
{
  "challenge_id": "482c84d8-60f6-41aa-8f63-c7bde865f6e5",
  "expires_at": "2026-10-29T15:41:47.580074818Z",
  "resend_available_at": "2026-10-29T15:36:48.580074818Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380673483620` → **200**

```json
{
  "phone": "+380673483620",
  "audience": "CLIENT",
  "code": "757313",
  "sent_at": "2026-10-29T15:36:47.581536051Z",
  "channel": "SMS"
}
```

## "Call me instead" on the first try still gets an SMS; the resend is a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678637095",
  "device_ref": "sandbox-24889",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "f4b2e1d3-739a-454a-89a8-e18e04148034",
  "expires_at": "2026-10-29T15:41:48.982107945Z",
  "resend_available_at": "2026-10-29T15:36:49.982107945Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380678637095` → **200**

```json
{
  "phone": "+380678637095",
  "audience": "CLIENT",
  "code": "041014",
  "sent_at": "2026-10-29T15:36:48.983733537Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380678637095",
  "device_ref": "sandbox-13726",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "4babe3bb-ae4a-4413-9e1f-2e9143c94bc1",
  "expires_at": "2026-10-29T15:41:50.383204697Z",
  "resend_available_at": "2026-10-29T15:36:51.383204697Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380678637095` → **200**

```json
{
  "phone": "+380678637095",
  "audience": "CLIENT",
  "code": "602583",
  "sent_at": "2026-10-29T15:36:50.385150882Z",
  "channel": "VOICE"
}
```

## The SMS does not get through: one request, one attempt; the resend comes by a call

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672980000",
  "device_ref": "sandbox-22348"
}
```

```json
{
  "challenge_id": "08ac8da3-2bea-4888-bc63-c8b0c76f0945",
  "expires_at": "2026-10-29T15:41:51.787427458Z",
  "resend_available_at": "2026-10-29T15:36:52.787427458Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672980000",
  "device_ref": "sandbox-2030"
}
```

```json
{
  "challenge_id": "45560ed9-5d4f-435c-9112-27b214b31887",
  "expires_at": "2026-10-29T15:41:53.184269865Z",
  "resend_available_at": "2026-10-29T15:36:54.184269865Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672980000` → **200**

```json
{
  "phone": "+380672980000",
  "audience": "CLIENT",
  "code": "414899",
  "sent_at": "2026-10-29T15:36:53.186063399Z",
  "channel": "VOICE"
}
```

## A second call in the hour is made, the third is refused

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380672980000",
  "device_ref": "sandbox-15990",
  "channel": "VOICE"
}
```

```json
{
  "challenge_id": "c0c7ac32-23ef-40a7-9144-6fba87a7a5f6",
  "expires_at": "2026-10-29T15:41:54.590411875Z",
  "resend_available_at": "2026-10-29T15:36:55.590411875Z",
  "channel": "VOICE"
}
```

`GET /sandbox/v1/otp?phone=%2B380672980000` → **200**

```json
{
  "phone": "+380672980000",
  "audience": "CLIENT",
  "code": "081781",
  "sent_at": "2026-10-29T15:36:54.592286737Z",
  "channel": "VOICE"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380672980000",
  "device_ref": "sandbox-19108",
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
  "correlation_id": "a3eed2dc-58d3-43cf-a5f1-f2684362b7fc",
  "retryable": true,
  "retry_after_seconds": 3600
}
```

## Numbers outside Poland and Ukraine get nothing

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+442000030589"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "62eb2a29-3b0d-4db4-914b-4c28e85a9296"
}
```

`GET /sandbox/v1/otp?phone=%2B442000030589` → **404**

`POST /auth/v1/otp/challenges` → **422**

```json
{
  "audience": "CLIENT",
  "phone": "+37120002307"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 422,
  "title": "Phone country not served",
  "type": "https://errors.blizz.taxi/phone-country-not-served",
  "code": "PHONE_COUNTRY_NOT_SERVED",
  "correlation_id": "088fb200-6d68-486e-811b-15c9f944ce91"
}
```

`GET /sandbox/v1/otp?phone=%2B37120002307` → **404**

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
  "session_id": "7e74707e-b92e-4185-8862-d39ed88059ea",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxMTYsImlhdCI6MTc5MzI4ODIxNiwianRpIjoiNTM5NjEzM2QtNmM1ZS00Mjc5LTg3MzUtMmYxMmQ5MmFmNWQzIiwic2lkIjoiN2U3NDcwN2UtYjkyZS00MTg1LTg4NjItZDM5ZWQ4ODA1OWVhIn0.J2U9PJEMW0rlrgXDXZYRtnU5yI9ZUCZwAXIOytn8jeQ",
  "access_expires_at": "2026-10-29T15:51:56.806442173Z",
  "refresh_token": "K3zDS4csfqnUakm4Vw8JeJp8kHGYVBEVGy3Y8lUPVns",
  "refresh_expires_at": "2026-10-30T03:36:56.806035804Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380672980000` → **200**

```json
{
  "deliveries": [
    {
      "id": "005fff4a-a935-4443-993e-a6b01349f92f",
      "challenge_id": "c0c7ac32-23ef-40a7-9144-6fba87a7a5f6",
      "phone": "+380672980000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-a9216a8b-cf2f-4340-bc05-4da15eec2666",
      "error": null,
      "attempted_at": "2026-10-29T15:36:54.592661Z"
    },
    {
      "id": "8a8dde77-2ea4-4bf7-b45a-dda5fc9ee19d",
      "challenge_id": "45560ed9-5d4f-435c-9112-27b214b31887",
      "phone": "+380672980000",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-f4dbd65c-69fa-42e6-beb9-33f3e34f353f",
      "error": null,
      "attempted_at": "2026-10-29T15:36:53.186288Z"
    },
    {
      "id": "2064d095-ddd5-4549-95dc-eacabf50cec4",
      "challenge_id": "08ac8da3-2bea-4888-bc63-c8b0c76f0945",
      "phone": "+380672980000",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "FAILED",
      "provider_ref": null,
      "error": "fake SMS FAILED",
      "attempted_at": "2026-10-29T15:36:51.789531Z"
    }
  ]
}
```

`GET /sandbox/v1/otp?phone=%2B380672980000` → **200**

```json
{
  "phone": "+380672980000",
  "audience": "CLIENT",
  "code": "081781",
  "sent_at": "2026-10-29T15:36:54.592286737Z",
  "channel": "VOICE"
}
```

`GET /api/admin/v1/otp-deliveries?phone=%2B380678637095` → **200**

```json
{
  "deliveries": [
    {
      "id": "2fb26523-0919-4ae1-90b5-6002ae5718e5",
      "challenge_id": "4babe3bb-ae4a-4413-9e1f-2e9143c94bc1",
      "phone": "+380678637095",
      "audience": "CLIENT",
      "channel": "VOICE",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-92e85545-00ee-4226-aea8-d21e939ae53e",
      "error": null,
      "attempted_at": "2026-10-29T15:36:50.385543Z"
    },
    {
      "id": "d9f3b7cf-bca2-4c82-9fda-254e3c10836c",
      "challenge_id": "f4b2e1d3-739a-454a-89a8-e18e04148034",
      "phone": "+380678637095",
      "audience": "CLIENT",
      "channel": "SMS",
      "provider": "FAKE",
      "state": "SENT",
      "provider_ref": "fake-77866f35-83cc-46f9-a6e1-01a29fa7de3a",
      "error": null,
      "attempted_at": "2026-10-29T15:36:48.983963Z"
    }
  ]
}
```

Done: SMS to +380673483620; SMS then a call to +380678637095; a failed SMS, two calls and a refused third to +380672980000; +44 and +371 refused.

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
  "session_id": "fdebd9eb-fbd5-4ce6-8b0d-3d438fb5bbaa",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxMTcsImlhdCI6MTc5MzI4ODIxNywianRpIjoiMDM0ZTdhODktODEwNC00OGJjLTlhMjQtZmI1ZjI3OTYzZTAzIiwic2lkIjoiZmRlYmQ5ZWItZmJkNS00Y2U2LThiMGQtM2Q0MzhmYjViYmFhIn0.sVNGLgGAl8fmn_PnwMh8WWnNRWOabzowi34zFRVSgB4",
  "access_expires_at": "2026-10-29T15:51:57.588749809Z",
  "refresh_token": "rO2W4vR44-ZcZP9uF7PsX40HLT-Cw7ElIDYwXGGtZ24",
  "refresh_expires_at": "2026-10-30T03:36:57.588249795Z",
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
  "session_id": "d9e6c851-1050-4e17-990d-a6d146ca8848",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxMTcsImlhdCI6MTc5MzI4ODIxNywianRpIjoiMzhhMzA2M2ItYjM0MC00YmI3LThjM2ItNzFhODBjYzQ4YmYwIiwic2lkIjoiZDllNmM4NTEtMTA1MC00ZTE3LTk5MGQtYTZkMTQ2Y2E4ODQ4In0.d1sSlOPROIe2WT6WHXDP5lWJIqSRsuIxlBhmZ9Re5_c",
  "access_expires_at": "2026-10-29T15:51:57.973490879Z",
  "refresh_token": "HDH99-mFom4W3leNemxMoB3xwagXdCchrEZIVX-r6KU",
  "refresh_expires_at": "2026-10-30T03:36:57.973061492Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/me` → **200**

```json
{
  "member": {
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
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

`POST /api/admin/v1/staff-extensions/a3bd2844-c0f0-497d-9066-e5fb0f47cc4f` → **200**

```json
{
  "command_id": "f0033c9a-b115-4cfa-98e5-fa934225897f",
  "expected_version": 0,
  "extension": "101",
  "reason": "Sandbox outgoing-call scenario"
}
```

```json
{
  "staff_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "extension": "101",
  "version": 1
}
```

## The operator says they are available

`POST /api/operator/v1/me/call-status` → **200**

```json
{
  "command_id": "434434b3-44d1-451d-933c-866ca6c7da59",
  "status": "AVAILABLE"
}
```

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:36:58.726449Z",
  "extension": "101"
}
```

`GET /api/operator/v1/me/call-status` → **200**

```json
{
  "status": "AVAILABLE",
  "changed_at": "2026-10-29T15:36:58.726449Z",
  "extension": "101"
}
```

## A phone order

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "0ba3749e-cd95-414d-a76c-4ff268b2ca7f",
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
  "id": "041e9105-2fee-4979-a1dd-b05364aa27b4",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:41:59.090826Z",
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
  "command_id": "d327ca48-1b37-45ff-99cf-0c5472e2a78b",
  "quote_id": "041e9105-2fee-4979-a1dd-b05364aa27b4",
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
    "phone": "+380672152241"
  }
}
```

```json
{
  "id": "163af4db-a232-4b4d-b7d2-ae3842f7bb02",
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
  "created_at": "2026-10-29T15:36:59.28111Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672152241"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

## The operator calls the caller from the order: the answer has no number

`POST /api/operator/v1/orders/163af4db-a232-4b4d-b7d2-ae3842f7bb02/calls` → **201**

```json
{
  "command_id": "7deba3cc-b0bd-43d6-b92d-bad04bf7c30c",
  "to": "CALLER"
}
```

```json
{
  "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "order_ids": [
    "163af4db-a232-4b4d-b7d2-ae3842f7bb02"
  ],
  "started_at": "2026-10-29T15:36:59.482839Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

## Asterisk got the number — once, even when the command is repeated

`POST /api/operator/v1/orders/163af4db-a232-4b4d-b7d2-ae3842f7bb02/calls` → **201**

```json
{
  "command_id": "7deba3cc-b0bd-43d6-b92d-bad04bf7c30c",
  "to": "CALLER"
}
```

```json
{
  "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
  "direction": "OUTBOUND",
  "party": "CALLER",
  "state": "RINGING",
  "caller_phone": null,
  "called_number": null,
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "order_ids": [
    "163af4db-a232-4b4d-b7d2-ae3842f7bb02"
  ],
  "started_at": "2026-10-29T15:36:59.482839Z",
  "answered_at": null,
  "ended_at": null,
  "recording": null
}
```

`GET /sandbox/v1/calls/originated` → **200**

```json
[
  {
    "channel_id": "821170b2-5817-4f23-9c6d-431746cd3f11",
    "endpoint": "PJSIP/101",
    "context": "blizz-outgoing",
    "dial": "+380672152241",
    "at": "2026-10-29T15:36:59.484656406Z"
  }
]
```

## The operator picks up, then the caller; they talk and hang up

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
    "state": "Up"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelStateChange",
  "channel": {
    "id": "1730055000.29939",
    "name": "PJSIP/trunk-0000004a",
    "state": "Up",
    "linkedid": "821170b2-5817-4f23-9c6d-431746cd3f11"
  }
}
```

`POST /sandbox/v1/calls/events` → **202**

```json
{
  "type": "ChannelDestroyed",
  "cause": 16,
  "channel": {
    "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
    "state": "Up"
  }
}
```

`GET /api/operator/v1/calls?order_id=163af4db-a232-4b4d-b7d2-ae3842f7bb02` → **200**

```json
{
  "calls": [
    {
      "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [
        "163af4db-a232-4b4d-b7d2-ae3842f7bb02"
      ],
      "started_at": "2026-10-29T15:36:59.482839Z",
      "answered_at": "2026-10-29T15:36:59.926671Z",
      "ended_at": "2026-10-29T15:36:59.94299Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=163af4db-a232-4b4d-b7d2-ae3842f7bb02` → **200**

```json
{
  "calls": [
    {
      "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [
        "163af4db-a232-4b4d-b7d2-ae3842f7bb02"
      ],
      "started_at": "2026-10-29T15:36:59.482839Z",
      "answered_at": "2026-10-29T15:36:59.926671Z",
      "ended_at": "2026-10-29T15:36:59.94299Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=163af4db-a232-4b4d-b7d2-ae3842f7bb02` → **200**

```json
{
  "calls": [
    {
      "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [
        "163af4db-a232-4b4d-b7d2-ae3842f7bb02"
      ],
      "started_at": "2026-10-29T15:36:59.482839Z",
      "answered_at": "2026-10-29T15:36:59.926671Z",
      "ended_at": "2026-10-29T15:36:59.94299Z",
      "recording": {
        "state": "PENDING",
        "duration_seconds": null,
        "stored_at": null
      }
    }
  ]
}
```

`GET /api/operator/v1/calls?order_id=163af4db-a232-4b4d-b7d2-ae3842f7bb02` → **200**

```json
{
  "calls": [
    {
      "id": "821170b2-5817-4f23-9c6d-431746cd3f11",
      "direction": "OUTBOUND",
      "party": "CALLER",
      "state": "ENDED",
      "caller_phone": null,
      "called_number": null,
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "answered_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "order_ids": [
        "163af4db-a232-4b4d-b7d2-ae3842f7bb02"
      ],
      "started_at": "2026-10-29T15:36:59.482839Z",
      "answered_at": "2026-10-29T15:36:59.926671Z",
      "ended_at": "2026-10-29T15:36:59.94299Z",
      "recording": {
        "state": "STORED",
        "duration_seconds": 2,
        "stored_at": "2026-10-29T15:37:04.610476Z"
      }
    }
  ]
}
```

## Clean-up: the order is cancelled, the operator goes offline

`GET /api/operator/v1/orders/163af4db-a232-4b4d-b7d2-ae3842f7bb02` → **200**

```json
{
  "id": "163af4db-a232-4b4d-b7d2-ae3842f7bb02",
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
  "created_at": "2026-10-29T15:36:59.28111Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672152241"
  },
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "reservation": null,
  "related_order_id": null
}
```

`POST /api/operator/v1/orders/163af4db-a232-4b4d-b7d2-ae3842f7bb02/cancel` → **200**

```json
{
  "command_id": "6caa5292-7eda-48a4-b68a-58b98eae8808",
  "expected_version": 2,
  "reason_code": "NO_CARS"
}
```

```json
{
  "id": "163af4db-a232-4b4d-b7d2-ae3842f7bb02",
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
  "created_at": "2026-10-29T15:36:59.28111Z",
  "caller": {
    "name": "Caller",
    "phone": "+380672152241"
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
  "command_id": "6b9a48da-e27f-46c7-8085-85fa0cb1a147",
  "status": "OFFLINE"
}
```

```json
{
  "status": "OFFLINE",
  "changed_at": "2026-10-29T15:37:07.195029Z",
  "extension": "101"
}
```

Done: outgoing call 821170b2-5817-4f23-9c6d-431746cd3f11 from order 163af4db-a232-4b4d-b7d2-ae3842f7bb02, recorded.

# Scenario: phone-change

## A rider signs in on two phones' worth of sessions

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630251505",
  "device_ref": "sandbox-28920"
}
```

```json
{
  "challenge_id": "18491ce8-f84f-4d31-a90f-45412cf76f02",
  "expires_at": "2026-10-29T15:42:07.390001092Z",
  "resend_available_at": "2026-10-29T15:37:08.390001092Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630251505` → **200**

```json
{
  "phone": "+380630251505",
  "audience": "CLIENT",
  "code": "510439",
  "sent_at": "2026-10-29T15:37:07.391880126Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "18491ce8-f84f-4d31-a90f-45412cf76f02",
  "code": "510439",
  "device_ref": "sandbox-28920"
}
```

```json
{
  "session_id": "fa6099f3-9039-420b-90f8-153381b507e3",
  "subject": {
    "type": "CLIENT",
    "id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmE2OGRhOS1jMTk3LTQ4ZDItOWE4Yy1iOWQyZmVlOGNkMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTI3LCJpYXQiOjE3OTMyODgyMjcsImp0aSI6IjUwOGQyYTBiLTA1ZGUtNGQ3OS04MmI4LTFiMjc5M2FlZTdmZCIsInNpZCI6ImZhNjA5OWYzLTkwMzktNDIwYi05MGY4LTE1MzM4MWI1MDdlMyJ9.jbk4tPJlETY9icPM88bEpEUw4Bk7-7jlFHZRU93XroA",
  "access_expires_at": "2026-10-29T15:52:07.592519841Z",
  "refresh_token": "APjazrTKk3zif16wZdksYmRHivSaFwDzh4lqAnUhyh0",
  "refresh_expires_at": "2026-11-28T15:37:07.592107851Z",
  "account_created": true
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
  "session_id": "fa6099f3-9039-420b-90f8-153381b507e3",
  "account_state": "ACTIVE"
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630251505",
  "device_ref": "sandbox-11039"
}
```

```json
{
  "challenge_id": "35dc916c-b55f-4d2e-9f7b-cbcadb4a58ee",
  "expires_at": "2026-10-29T15:42:09.956215087Z",
  "resend_available_at": "2026-10-29T15:37:10.956215087Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630251505` → **200**

```json
{
  "phone": "+380630251505",
  "audience": "CLIENT",
  "code": "653115",
  "sent_at": "2026-10-29T15:37:09.957891835Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "35dc916c-b55f-4d2e-9f7b-cbcadb4a58ee",
  "code": "653115",
  "device_ref": "sandbox-11039"
}
```

```json
{
  "session_id": "b1c48b39-4bf0-4e16-9174-433c5f6a4729",
  "subject": {
    "type": "CLIENT",
    "id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmE2OGRhOS1jMTk3LTQ4ZDItOWE4Yy1iOWQyZmVlOGNkMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTMwLCJpYXQiOjE3OTMyODgyMzAsImp0aSI6IjM4OGE0NGMyLTRlYzItNGU4Ny04YTE2LWNiMDY2MDRjNGZkYiIsInNpZCI6ImIxYzQ4YjM5LTRiZjAtNGUxNi05MTc0LTQzM2M1ZjZhNDcyOSJ9.Ln07kFB-wAODZsRdCE1KIgZSit9deqOBid8Izf4dyBI",
  "access_expires_at": "2026-10-29T15:52:10.158989793Z",
  "refresh_token": "ORuK0qVP425chVTHWoP_4kW-EVJXfyYSSEX_0rOJjm4",
  "refresh_expires_at": "2026-11-28T15:37:10.15866312Z",
  "account_created": false
}
```

## A code to the current phone and one to the new phone

`POST /api/rider/v1/me/phone-change/current-code` → **201**

```json
{
  "challenge_id": "a45369e8-aede-4947-be07-9a2b7dad306c",
  "expires_at": "2026-10-29T15:42:12.345362737Z",
  "resend_available_at": "2026-10-29T15:37:13.345362737Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630251505` → **200**

```json
{
  "phone": "+380630251505",
  "audience": "CLIENT",
  "code": "349473",
  "sent_at": "2026-10-29T15:37:12.347030037Z",
  "channel": "SMS"
}
```

`POST /api/rider/v1/me/phone-change/new-code` → **201**

```json
{
  "phone": "+380630290934"
}
```

```json
{
  "challenge_id": "0a3c39a5-709f-4632-9c82-deb883ca40ca",
  "expires_at": "2026-10-29T15:42:12.547067503Z",
  "resend_available_at": "2026-10-29T15:37:13.547067503Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380630290934` → **200**

```json
{
  "phone": "+380630290934",
  "audience": "CLIENT",
  "code": "160163",
  "sent_at": "2026-10-29T15:37:12.5491753Z",
  "channel": "SMS"
}
```

## The code to the new phone alone is not enough

`POST /api/rider/v1/me/phone-change` → **422**

```json
{
  "command_id": "9dbbd705-db4d-4f83-9aa5-ae00b8ef9c18",
  "current_challenge_id": "a45369e8-aede-4947-be07-9a2b7dad306c",
  "current_code": "000000",
  "new_challenge_id": "0a3c39a5-709f-4632-9c82-deb883ca40ca",
  "new_code": "160163"
}
```

```json
{
  "instance": "/api/rider/v1/me/phone-change",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "85bafa7d-cb6b-4972-a0ea-6f0879995cbf"
}
```

## With both codes the phone changes; the other session ends, this one stays

`POST /api/rider/v1/me/phone-change` → **200**

```json
{
  "command_id": "9a2989a3-f646-4dcc-8842-374bd3d2220f",
  "current_challenge_id": "a45369e8-aede-4947-be07-9a2b7dad306c",
  "current_code": "349473",
  "new_challenge_id": "0a3c39a5-709f-4632-9c82-deb883ca40ca",
  "new_code": "160163"
}
```

```json
{
  "subject_id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
  "phone": "+380630290934",
  "version": 2
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
  "session_id": "fa6099f3-9039-420b-90f8-153381b507e3",
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
  "correlation_id": "a48fe239-86b0-49f3-8861-7f4e1e08d19d"
}
```

## The new phone signs in to the same account

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380630290934",
  "device_ref": "sandbox-1650"
}
```

```json
{
  "challenge_id": "49648d3c-546e-445f-aeb3-5f8373b3809f",
  "expires_at": "2026-10-29T15:42:15.478010538Z",
  "resend_available_at": "2026-10-29T15:37:16.478010538Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380630290934` → **200**

```json
{
  "phone": "+380630290934",
  "audience": "CLIENT",
  "code": "853924",
  "sent_at": "2026-10-29T15:37:15.479853521Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "49648d3c-546e-445f-aeb3-5f8373b3809f",
  "code": "853924",
  "device_ref": "sandbox-1650"
}
```

```json
{
  "session_id": "4e089e3e-4039-401a-8071-71840f5a2ad9",
  "subject": {
    "type": "CLIENT",
    "id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmE2OGRhOS1jMTk3LTQ4ZDItOWE4Yy1iOWQyZmVlOGNkMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTM1LCJpYXQiOjE3OTMyODgyMzUsImp0aSI6IjQ5OWExZWZkLWUyOTMtNDFhZi1hZjg4LWQ0Y2ZiYWMyMjRkYiIsInNpZCI6IjRlMDg5ZTNlLTQwMzktNDAxYS04MDcxLTcxODQwZjVhMmFkOSJ9.lFIDXy85zvtiYhScWX2qlXBVg3pbTpxy6U4L0iWjacU",
  "access_expires_at": "2026-10-29T15:52:15.688712483Z",
  "refresh_token": "olrq-weU8QU86L5ZCp_JQ8zpIegLJuV3kE_HRYtjQmE",
  "refresh_expires_at": "2026-11-28T15:37:15.688374663Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
  "session_id": "4e089e3e-4039-401a-8071-71840f5a2ad9",
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
  "session_id": "fda3123a-668a-4171-a3f8-b3d9d0b69050",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxMzYsImlhdCI6MTc5MzI4ODIzNiwianRpIjoiNzg3NjMwMGEtMTRkZi00MjMzLTk3Y2QtYzdiNzYzNGYyYTQyIiwic2lkIjoiZmRhMzEyM2EtNjY4YS00MTcxLWEzZjgtYjNkOWQwYjY5MDUwIn0.8Ds66UhMIr0xouDmKaq-K5XSA4wd4QYxfY4Mtgp3DTY",
  "access_expires_at": "2026-10-29T15:52:16.255018785Z",
  "refresh_token": "loIsP3qTE5gktNnaLMk2Qlt6giyoQMX_s7711AFzzBk",
  "refresh_expires_at": "2026-10-30T03:37:16.25461496Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d` → **200**

```json
{
  "client": {
    "id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
    "phone": "+380630290934",
    "name": null,
    "language": null,
    "account_state": "ACTIVE",
    "has_app": true,
    "created_at": "2026-10-29T15:37:07.590812Z",
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

`POST /api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d/phone/new-code` → **201**

```json
{
  "phone": "+380637458803"
}
```

```json
{
  "challenge_id": "b52c518e-d0e4-4e36-9def-c6d5cc2f67f3",
  "expires_at": "2026-10-29T15:42:16.641757746Z",
  "resend_available_at": "2026-10-29T15:37:17.641757746Z"
}
```

`GET /sandbox/v1/otp?phone=%2B380637458803` → **200**

```json
{
  "phone": "+380637458803",
  "audience": "CLIENT",
  "code": "176121",
  "sent_at": "2026-10-29T15:37:16.643035653Z",
  "channel": "SMS"
}
```

## Without the right code nothing changes; with it, support sets the phone

`POST /api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d/phone` → **422**

```json
{
  "command_id": "8b41fddf-470d-44ea-950b-339263f4e697",
  "expected_version": 3,
  "new_challenge_id": "b52c518e-d0e4-4e36-9def-c6d5cc2f67f3",
  "new_code": "176122",
  "reason": "Passport checked at the office"
}
```

```json
{
  "instance": "/api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d/phone",
  "status": 422,
  "title": "Otp invalid",
  "type": "https://errors.blizz.taxi/otp-invalid",
  "code": "OTP_INVALID",
  "correlation_id": "600e70d9-3d8e-4bb3-9014-62c4448a0580"
}
```

`POST /api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d/phone` → **400**

```json
{
  "command_id": "acf9fe2b-c8cb-4369-b71b-9bd9ab9fa758",
  "expected_version": 3,
  "new_challenge_id": "b52c518e-d0e4-4e36-9def-c6d5cc2f67f3",
  "new_code": "176121",
  "reason": " "
}
```

```json
{
  "instance": "/api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d/phone",
  "status": 400,
  "title": "Validation failed",
  "type": "https://errors.blizz.taxi/validation-failed",
  "code": "VALIDATION_FAILED",
  "correlation_id": "8182a081-4b83-4fbc-9607-8061d40f7546",
  "field_errors": [
    {
      "code": "NotBlank",
      "field": "reason"
    }
  ]
}
```

`POST /api/admin/v1/clients/06a68da9-c197-48d2-9a8c-b9d2fee8cd0d/phone` → **200**

```json
{
  "command_id": "956ebd95-ea9c-4b05-b73f-c55c3bccf241",
  "expected_version": 3,
  "new_challenge_id": "b52c518e-d0e4-4e36-9def-c6d5cc2f67f3",
  "new_code": "176121",
  "reason": "Passport checked at the office"
}
```

```json
{
  "subject_id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
  "phone": "+380637458803",
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
  "correlation_id": "69e7bf20-b175-4255-8fa9-4853fbdd2c36"
}
```

`POST /auth/v1/otp/challenges` → **429**

```json
{
  "audience": "CLIENT",
  "phone": "+380637458803",
  "device_ref": "sandbox-7630"
}
```

```json
{
  "instance": "/auth/v1/otp/challenges",
  "status": 429,
  "title": "Rate limited",
  "type": "https://errors.blizz.taxi/rate-limited",
  "code": "RATE_LIMITED",
  "correlation_id": "be7f1173-a4c2-4306-8f48-450102b7012d",
  "retryable": true,
  "retry_after_seconds": 1
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380637458803",
  "device_ref": "sandbox-7630"
}
```

```json
{
  "challenge_id": "c6567df0-2a25-4979-af07-6a970acdbb68",
  "expires_at": "2026-10-29T15:42:18.819137266Z",
  "resend_available_at": "2026-10-29T15:37:19.819137266Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380637458803` → **200**

```json
{
  "phone": "+380637458803",
  "audience": "CLIENT",
  "code": "939279",
  "sent_at": "2026-10-29T15:37:18.821016185Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c6567df0-2a25-4979-af07-6a970acdbb68",
  "code": "939279",
  "device_ref": "sandbox-7630"
}
```

```json
{
  "session_id": "a382b156-de3b-4ccb-b6be-e451f45b87fd",
  "subject": {
    "type": "CLIENT",
    "id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIwNmE2OGRhOS1jMTk3LTQ4ZDItOWE4Yy1iOWQyZmVlOGNkMGQiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTM5LCJpYXQiOjE3OTMyODgyMzksImp0aSI6IjAyMWIzNWJhLTZhM2ItNDk3ZS05NTRkLWU2MDg1OGRjZDRlMSIsInNpZCI6ImEzODJiMTU2LWRlM2ItNGNjYi1iNmJlLWU0NTFmNDViODdmZCJ9.XyrSglem0lHj5eNMUiCMY12S4yn_ur5YgYvP1ypZc4I",
  "access_expires_at": "2026-10-29T15:52:19.0298056Z",
  "refresh_token": "0VAvwyzDI-MkstWqVMEKXaX8R8_uu_p0I-T76MXm9zU",
  "refresh_expires_at": "2026-11-28T15:37:19.02948068Z",
  "account_created": false
}
```

`GET /api/rider/v1/me` → **200**

```json
{
  "subject_type": "CLIENT",
  "subject_id": "06a68da9-c197-48d2-9a8c-b9d2fee8cd0d",
  "session_id": "a382b156-de3b-4ccb-b6be-e451f45b87fd",
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
  "phone": "+380633660683",
  "device_ref": "sandbox-10523"
}
```

```json
{
  "challenge_id": "88cf2ae4-1fbd-432f-9e94-05be2416ccf3",
  "expires_at": "2026-10-29T15:42:19.386817913Z",
  "resend_available_at": "2026-10-29T15:37:20.386817913Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380633660683` → **200**

```json
{
  "phone": "+380633660683",
  "audience": "CLIENT",
  "code": "946736",
  "sent_at": "2026-10-29T15:37:19.388695294Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "88cf2ae4-1fbd-432f-9e94-05be2416ccf3",
  "code": "946736",
  "device_ref": "sandbox-10523"
}
```

```json
{
  "session_id": "1168af2d-7943-4f9b-8b72-cce87062a418",
  "subject": {
    "type": "CLIENT",
    "id": "8f2d28d0-4ac4-4933-84bf-817f155ee5ee"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4ZjJkMjhkMC00YWM0LTQ5MzMtODRiZi04MTdmMTU1ZWU1ZWUiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTM5LCJpYXQiOjE3OTMyODgyMzksImp0aSI6IjZjNWY2MmViLTZhNTUtNDY1OS05YjU3LTg5NjE2YTJmMTEzOSIsInNpZCI6IjExNjhhZjJkLTc5NDMtNGY5Yi04YjcyLWNjZTg3MDYyYTQxOCJ9.b0kjiX3LGaKjBrOMLDOKzhINrYS2zq4WDMnJkrhICms",
  "access_expires_at": "2026-10-29T15:52:19.589021142Z",
  "refresh_token": "NCrZP-UYtmWm3RYE3PXwjPDNwEdOuu4t4V8mr-OevGs",
  "refresh_expires_at": "2026-11-28T15:37:19.58872143Z",
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
  "session_id": "7b64b158-ac2c-4ca9-836c-45dbb27807cc",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNDAsImlhdCI6MTc5MzI4ODI0MCwianRpIjoiMmMwNmMwZmItNzAzNC00OGM1LWFiOTAtYTYzYmY3NmYyZjI5Iiwic2lkIjoiN2I2NGIxNTgtYWMyYy00Y2E5LTgzNmMtNDVkYmIyNzgwN2NjIn0.1mzky5pahbMg0aB2NyNM1dvbd1kNudzyMpAXMSsEB8U",
  "access_expires_at": "2026-10-29T15:52:20.360369218Z",
  "refresh_token": "iGWl4Z8l7WeekKMq4PFLuY1u6mjTF3vepEJvGReHnRI",
  "refresh_expires_at": "2026-10-30T03:37:20.360032601Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/places?query=%D0%92%D0%BE%D0%BA%D0%B7%D0%B0%D0%BB&lat=50.4501&lon=30.5234&caller_phone=%2B380633660683` → **200**

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
  "correlation_id": "4756b302-8119-4c37-84df-8db312a17154"
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
  "session_id": "482577fc-dbce-4ebf-a260-3faef447fedd",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNDEsImlhdCI6MTc5MzI4ODI0MSwianRpIjoiZDIxNjU5MzEtYzBkYi00MWQ4LTk3MGMtZjBmZDZmMTVjMTQ4Iiwic2lkIjoiNDgyNTc3ZmMtZGJjZS00ZWJmLWEyNjAtM2ZhZWY0NDdmZWRkIn0.2hzkSzUGVSKaQNH0HTfSXAmxO3XA_njH3lMRWMjx804",
  "access_expires_at": "2026-10-29T15:52:21.126662403Z",
  "refresh_token": "4GmaN0weXoByoKWCTaIzQ7fJWZ4hNKdslLnnT8QVNIk",
  "refresh_expires_at": "2026-10-30T03:37:21.126360858Z",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: app version scenario over",
  "changed_at": "2026-10-29T15:34:18.508445Z"
}
```

`POST /api/admin/v1/settings` → **200**

```json
{
  "command_id": "4450c395-d739-4cc2-820b-80530ef0db98",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: pre-orders by reservation",
  "changed_at": "2026-10-29T15:37:21.492667526Z"
}
```

## The rider books the airport for 2026-10-29T18:37:20Z

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48600244550",
  "device_ref": "sandbox-89"
}
```

```json
{
  "challenge_id": "11004203-b8ac-4874-b04d-e6d207f537fc",
  "expires_at": "2026-10-29T15:42:21.686975344Z",
  "resend_available_at": "2026-10-29T15:37:22.686975344Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48600244550` → **200**

```json
{
  "phone": "+48600244550",
  "audience": "CLIENT",
  "code": "487722",
  "sent_at": "2026-10-29T15:37:21.689107729Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "11004203-b8ac-4874-b04d-e6d207f537fc",
  "code": "487722",
  "device_ref": "sandbox-89"
}
```

```json
{
  "session_id": "53462df4-349d-48cd-a7fc-75d207a2b937",
  "subject": {
    "type": "CLIENT",
    "id": "ca7b0eb6-4094-4098-9662-6ebf9c050d96"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjYTdiMGViNi00MDk0LTQwOTgtOTY2Mi02ZWJmOWMwNTBkOTYiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTQxLCJpYXQiOjE3OTMyODgyNDEsImp0aSI6ImMwMGMwNWJmLWE3YzEtNDFjYS05OGNkLWY0NzQ1NThiM2UzZiIsInNpZCI6IjUzNDYyZGY0LTM0OWQtNDhjZC1hN2ZjLTc1ZDIwN2EyYjkzNyJ9.D-zNk_fF2pNhUSD4XDfGT3YXjZfJTFvEhVlR1YBtNQQ",
  "access_expires_at": "2026-10-29T15:52:21.89447324Z",
  "refresh_token": "F963G7ukj3l3QX1loJ0efL5vQ_g0nkPqx1bswmNrqxk",
  "refresh_expires_at": "2026-11-28T15:37:21.894145887Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "58b23b18-fea4-4b18-9a0a-e02b887f2e61",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 52.2297,
    "lon": 21.0122
  },
  "dropoff": {
    "lat": 52.1672,
    "lon": 20.9679
  },
  "pickup_at": "2026-10-29T18:37:20Z"
}
```

```json
{
  "id": "615d7e67-50a9-4907-80e8-cad0cf4c5f7a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000002",
  "amount_minor": 5436,
  "currency": "PLN",
  "distance_m": 9861,
  "duration_s": 1420,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:42:22.081004Z",
  "waiting": {
    "free_minutes": 3,
    "per_minute_minor": 60,
    "step_seconds": 60,
    "rounding": "UP"
  },
  "pickup_at": "2026-10-29T18:37:20Z",
  "preorder": true,
  "discount_minor": 0,
  "to_pay_minor": 5436,
  "promotions": []
}
```

`POST /api/rider/v1/orders` → **201**

```json
{
  "command_id": "a4755f7c-5780-4507-bf8d-ed982d7ba941",
  "quote_id": "615d7e67-50a9-4907-80e8-cad0cf4c5f7a",
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
  "pickup_at": "2026-10-29T18:37:20Z"
}
```

```json
{
  "id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "ca7b0eb6-4094-4098-9662-6ebf9c050d96",
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
  "created_at": "2026-10-29T15:37:22.277398Z",
  "cancellation": null,
  "pickup_at": "2026-10-29T18:37:20Z",
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
  "device_ref": "sandbox-21183"
}
```

```json
{
  "challenge_id": "7e837a38-41e4-44bc-ba82-0588ebf5e2fb",
  "expires_at": "2026-10-29T15:42:22.470272902Z",
  "resend_available_at": "2026-10-29T15:37:23.470272902Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "506911",
  "sent_at": "2026-10-29T15:37:22.472275021Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7e837a38-41e4-44bc-ba82-0588ebf5e2fb",
  "code": "506911",
  "device_ref": "sandbox-21183"
}
```

```json
{
  "session_id": "58d2f6a9-783f-4462-be64-fc4dd3730d34",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE0MiwiaWF0IjoxNzkzMjg4MjQyLCJqdGkiOiIxNDcyMTA5YS1lM2Y4LTRlNzUtYmU1NS0wZjI0YjIwNDQ5ZDQiLCJzaWQiOiI1OGQyZjZhOS03ODNmLTQ0NjItYmU2NC1mYzRkZDM3MzBkMzQifQ.4k2Ztq3Lq8gHS9VN56xlSb9wTiRMi9Ep1yWkTiQTP_A",
  "access_expires_at": "2026-10-29T15:52:22.673745219Z",
  "refresh_token": "Ag4TXfWQ3EWmO__WrM-tOOAPyIh_HY7nHnT3Zq4vE20",
  "refresh_expires_at": "2026-11-28T15:37:22.673363068Z",
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
  "command_id": "da76d672-68c3-4728-accb-7527eea9a981",
  "vehicle_id": "5a000000-0000-4000-8000-000000000504",
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:23Z",
    "sequence": 1793288243326
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0a1a415d-0963-470f-81d7-44ace1ff7431",
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
  "last_heartbeat_at": "2026-10-29T15:37:23.04837Z",
  "last_location_at": "2026-10-29T15:37:23.04837Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`GET /api/driver/v1/preorders` → **200**

```json
{
  "preorders": [
    {
      "order_id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
      "short_number": 24,
      "pickup_at": "2026-10-29T18:37:20Z",
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

`POST /api/driver/v1/preorders/f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c/reserve` → **200**

```json
{
  "command_id": "b846c6fd-5a13-4a0b-9483-aac8b44e5613"
}
```

```json
{
  "id": "1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6",
  "state": "RESERVED",
  "order": {
    "order_id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
    "short_number": 24,
    "pickup_at": "2026-10-29T18:37:20Z",
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
  "reserved_at": "2026-10-29T15:37:23.418748Z",
  "confirm_from": "2026-10-29T18:07:20Z",
  "confirm_until": "2026-10-29T18:17:20Z",
  "drop_until": "2026-10-29T17:37:20Z"
}
```

`GET /api/driver/v1/preorders/reservations` → **200**

```json
{
  "reservations": [
    {
      "id": "1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6",
      "state": "RESERVED",
      "order": {
        "order_id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:37:20Z",
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
      "reserved_at": "2026-10-29T15:37:23.418748Z",
      "confirm_from": "2026-10-29T18:07:20Z",
      "confirm_until": "2026-10-29T18:17:20Z",
      "drop_until": "2026-10-29T17:37:20Z"
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
      "id": "1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6",
      "state": "RESERVED",
      "order": {
        "order_id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
        "short_number": 24,
        "pickup_at": "2026-10-29T18:37:20Z",
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
      "reserved_at": "2026-10-29T15:37:23.418748Z",
      "confirm_from": "2026-10-29T18:07:20Z",
      "confirm_until": "2026-10-29T18:17:20Z",
      "drop_until": "2026-10-29T17:37:20Z"
    }
  ]
}
```

`POST /api/driver/v1/preorders/reservations/1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6/confirm` → **409**

```json
{
  "command_id": "9dc1f4fd-ed8c-4ab0-ad01-67a586c694ed"
}
```

```json
{
  "instance": "/api/driver/v1/preorders/reservations/1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6/confirm",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "d569a2ed-f7a4-4c4d-84b0-a234e447ffe3"
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
  "session_id": "b5ffd435-5dfe-4be2-af01-c8c36c02a270",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNDQsImlhdCI6MTc5MzI4ODI0NCwianRpIjoiYTk0ZWYwNDMtMDRhNi00NzU4LThlY2UtMjhiNzI0M2MwNjZhIiwic2lkIjoiYjVmZmQ0MzUtNWRmZS00YmUyLWFmMDEtYzhjMzZjMDJhMjcwIn0.byIiQcp8mspI32vQ78xDCxPX7dwLSNRUZhYoSxXiPNg",
  "access_expires_at": "2026-10-29T15:52:24.355774356Z",
  "refresh_token": "R7SkRgScnXgeFqT-dmmWVwa1YRwtX5skCbWgCBNT_T0",
  "refresh_expires_at": "2026-10-30T03:37:24.355447368Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c` → **200**

```json
{
  "id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
  "short_number": 24,
  "status": "SCHEDULED",
  "status_reason": null,
  "version": 1,
  "channel": "APP",
  "payer_client_id": "ca7b0eb6-4094-4098-9662-6ebf9c050d96",
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
  "created_at": "2026-10-29T15:37:22.277398Z",
  "caller": null,
  "cancellation": null,
  "pickup_at": "2026-10-29T18:37:20Z",
  "preorder": true,
  "reservation": {
    "reservation_id": "1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6",
    "driver_id": "5a000000-0000-4000-8000-000000000404",
    "driver_name": "Piotr Nowak",
    "reserved_at": "2026-10-29T15:37:23.418748Z"
  },
  "related_order_id": null
}
```

`GET /api/operator/v1/orders/f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c/events` → **200**

```json
{
  "events": [
    {
      "sequence": 0,
      "type": "OrderScheduled",
      "occurred_at": "2026-10-29T15:37:22.27821Z",
      "actor": {
        "type": "CLIENT",
        "id": "ca7b0eb6-4094-4098-9662-6ebf9c050d96",
        "name": null,
        "role": null
      },
      "reason": null,
      "details": {
        "channel": "APP",
        "city_id": "5a000000-0000-4000-8000-000000000002",
        "order_id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
        "preorder": true,
        "quote_id": "615d7e67-50a9-4907-80e8-cad0cf4c5f7a",
        "pickup_at": "2026-10-29T18:37:20Z",
        "price_minor": 5436,
        "payment_method": "CASH"
      },
      "correlation_id": "cb92338e-03d6-4c5f-bdd2-6c5a571615e7"
    },
    {
      "sequence": 1,
      "type": "PreorderReserved",
      "occurred_at": "2026-10-29T15:37:23.419598Z",
      "actor": {
        "type": "DRIVER",
        "id": "5a000000-0000-4000-8000-000000000404",
        "name": "Piotr Nowak",
        "role": null
      },
      "reason": null,
      "details": {
        "order_id": "f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c",
        "driver_id": "5a000000-0000-4000-8000-000000000404",
        "reservation_id": "1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6"
      },
      "correlation_id": "8354d057-1fa8-4551-811a-f9628cbde0d4"
    }
  ],
  "dispatch": {
    "attempts": []
  }
}
```

Done: pre-order f1fbb46c-2a27-45e8-9370-06a2e0ba8b5c, reservation 1d8be83e-ebe0-44ae-86c1-7ec9dc0adbb6.

# Scenario: ratings

## Driver and rider sign in

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-14254"
}
```

```json
{
  "challenge_id": "d92458e7-b074-40d2-8b76-c3b1f2ebb3e9",
  "expires_at": "2026-10-29T15:42:24.922471403Z",
  "resend_available_at": "2026-10-29T15:37:25.922471403Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "300456",
  "sent_at": "2026-10-29T15:37:24.924229034Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "d92458e7-b074-40d2-8b76-c3b1f2ebb3e9",
  "code": "300456",
  "device_ref": "sandbox-14254"
}
```

```json
{
  "session_id": "0e1a3007-98a2-435c-9236-c2682311b5ba",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE0NSwiaWF0IjoxNzkzMjg4MjQ1LCJqdGkiOiI2NTM0MjA5Yi1kM2Y2LTQzYzYtYjQwYy05NWJiNDM1YzhhYzUiLCJzaWQiOiIwZTFhMzAwNy05OGEyLTQzNWMtOTIzNi1jMjY4MjMxMWI1YmEifQ.BaI_7OIV7ysxk0dSBY6KdlxlWciHOO-f5Ae_v9UmFk8",
  "access_expires_at": "2026-10-29T15:52:25.136568387Z",
  "refresh_token": "ome3flrtun4OYRWYyxnagt5s-H75vIbCLR_qgpKUCmc",
  "refresh_expires_at": "2026-11-28T15:37:25.136203166Z",
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
  "command_id": "60d51d14-7b62-4eb4-94c9-3b71c6dd8605",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:25Z",
    "sequence": 1793288245491
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:25.50682Z",
  "last_location_at": "2026-10-29T15:37:25.50682Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380675811057",
  "device_ref": "sandbox-11493"
}
```

```json
{
  "challenge_id": "9c2446f3-f38f-4d7d-9296-d7bd9964958b",
  "expires_at": "2026-10-29T15:42:25.685479059Z",
  "resend_available_at": "2026-10-29T15:37:26.685479059Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380675811057` → **200**

```json
{
  "phone": "+380675811057",
  "audience": "CLIENT",
  "code": "785325",
  "sent_at": "2026-10-29T15:37:25.68731019Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "9c2446f3-f38f-4d7d-9296-d7bd9964958b",
  "code": "785325",
  "device_ref": "sandbox-11493"
}
```

```json
{
  "session_id": "28c3146e-0a94-461f-b24a-8e6dbcce7393",
  "subject": {
    "type": "CLIENT",
    "id": "862d7a01-3d6c-4004-a2ce-6e2462112f17"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4NjJkN2EwMS0zZDZjLTQwMDQtYTJjZS02ZTI0NjIxMTJmMTciLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTQ1LCJpYXQiOjE3OTMyODgyNDUsImp0aSI6IjNjNzJjNDk3LTViNDUtNDU3OS04ZDRhLTY5ZGUwZTkxMWZkOCIsInNpZCI6IjI4YzMxNDZlLTBhOTQtNDYxZi1iMjRhLThlNmRiY2NlNzM5MyJ9.k6A7oHpE-dL1KvG0V-Ua-gM8EponYoh4b_YwdbsMVFc",
  "access_expires_at": "2026-10-29T15:52:25.886174119Z",
  "refresh_token": "VQ2Nj82IqhWRUdopFquOm_BYdff14N-XhcoO9Z2KJ3Q",
  "refresh_expires_at": "2026-11-28T15:37:25.885521595Z",
  "account_created": true
}
```

## Rider creates a cash order

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "2acc6871-9fbc-4215-9d69-681e64657da8",
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
  "id": "756f36a3-37cc-4785-a395-2a844b137d81",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:42:26.074078Z",
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
  "command_id": "33a10716-6cfd-459f-bcdd-edd46d672af0",
  "quote_id": "756f36a3-37cc-4785-a395-2a844b137d81",
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
  "id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "short_number": 25,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "862d7a01-3d6c-4004-a2ce-6e2462112f17",
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
  "created_at": "2026-10-29T15:37:26.267228Z",
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
    "id": "a6e0f957-d3e1-4427-bb7e-2321bb62d336",
    "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
    "expires_at": "2026-10-29T15:37:41.269612Z",
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

`POST /api/driver/v1/offers/a6e0f957-d3e1-4427-bb7e-2321bb62d336/accept` → **200**

```json
{
  "command_id": "c36ff461-5dca-4b61-87e1-03e44f0bbc90"
}
```

```json
{
  "id": "6b3c3dcb-bc32-4adb-a86e-9ec3eb3a0ecd",
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "vehicle_id": "5a000000-0000-4000-8000-000000000501",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "5519d0ff-615f-4c71-95cc-3ee54b128c40",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5519d0ff-615f-4c71-95cc-3ee54b128c40",
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "assignment_id": "6b3c3dcb-bc32-4adb-a86e-9ec3eb3a0ecd",
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

`POST /api/driver/v1/work-sessions/06f52485-e970-4b41-aa4c-ac6be9d5e488/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4503,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:26Z",
    "sequence": 1793288246995
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:27.010585Z",
  "last_location_at": "2026-10-29T15:37:27.010585Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "5519d0ff-615f-4c71-95cc-3ee54b128c40",
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "assignment_id": "6b3c3dcb-bc32-4adb-a86e-9ec3eb3a0ecd",
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

`POST /api/driver/v1/trips/5519d0ff-615f-4c71-95cc-3ee54b128c40/arrive` → **200**

```json
{
  "command_id": "86daf3b5-0763-4ab3-9df6-f19350fac4ac",
  "expected_version": 0
}
```

```json
{
  "id": "5519d0ff-615f-4c71-95cc-3ee54b128c40",
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "assignment_id": "6b3c3dcb-bc32-4adb-a86e-9ec3eb3a0ecd",
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
  "arrived_at": "2026-10-29T15:37:27.369921Z",
  "started_at": null,
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/trips/5519d0ff-615f-4c71-95cc-3ee54b128c40/start` → **200**

```json
{
  "command_id": "71451b11-c7b3-4319-a9fc-662da0d1fa03",
  "expected_version": 1
}
```

```json
{
  "id": "5519d0ff-615f-4c71-95cc-3ee54b128c40",
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "assignment_id": "6b3c3dcb-bc32-4adb-a86e-9ec3eb3a0ecd",
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
  "arrived_at": "2026-10-29T15:37:27.369921Z",
  "started_at": "2026-10-29T15:37:27.556625Z",
  "completed_at": null,
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`POST /api/driver/v1/work-sessions/06f52485-e970-4b41-aa4c-ac6be9d5e488/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4405,
    "lon": 30.4890,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:27Z",
    "sequence": 1793288247732
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:27.746999Z",
  "last_location_at": "2026-10-29T15:37:27.746999Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_ON_TRIP"
  ]
}
```

`POST /api/driver/v1/trips/5519d0ff-615f-4c71-95cc-3ee54b128c40/complete` → **200**

```json
{
  "command_id": "ee940a2f-8d71-42dd-8254-6f18d2c681b6",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:37:27Z",
  "cash_received": true
}
```

```json
{
  "id": "5519d0ff-615f-4c71-95cc-3ee54b128c40",
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "assignment_id": "6b3c3dcb-bc32-4adb-a86e-9ec3eb3a0ecd",
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
  "arrived_at": "2026-10-29T15:37:27.369921Z",
  "started_at": "2026-10-29T15:37:27.556625Z",
  "completed_at": "2026-10-29T15:37:27.931504Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

## Both sides rate the fulfilled ride

`POST /api/rider/v1/orders/f9cf210f-50a0-47ce-b7c6-88db12433753/rating` → **200**

```json
{
  "command_id": "edf84a8d-c993-4407-b7de-413f84c823d9",
  "score": 5,
  "comment": "Clean car and a smooth ride"
}
```

```json
{
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "score": 5,
  "created_at": "2026-10-29T15:37:28.125503441Z"
}
```

`POST /api/driver/v1/orders/f9cf210f-50a0-47ce-b7c6-88db12433753/rating` → **200**

```json
{
  "command_id": "b8925d97-7af2-4fb3-956f-71a7c46e08c7",
  "score": 4,
  "comment": "Passenger was ready at pickup"
}
```

```json
{
  "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
  "score": 4,
  "created_at": "2026-10-29T15:37:28.308706323Z"
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
  "session_id": "9f3f0c0e-f25d-4269-bc8d-a88d15cba8ca",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNDgsImlhdCI6MTc5MzI4ODI0OCwianRpIjoiNjc0MTdhODYtOTIwOS00YjMxLWFkYjItNzk5OWM4OGUwZGUxIiwic2lkIjoiOWYzZjBjMGUtZjI1ZC00MjY5LWJjOGQtYTg4ZDE1Y2JhOGNhIn0.lSSXwAVpJ4fGanB0NQpyJI736pWTtKGwf66-0Xj4aXw",
  "access_expires_at": "2026-10-29T15:52:28.874561905Z",
  "refresh_token": "B5hmRkVTxc_-k5BumM6SE-ye_Wq0JHD1XBga23ZJGak",
  "refresh_expires_at": "2026-10-30T03:37:28.874161521Z",
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
  "session_id": "1ce70b4f-b111-4ff8-9de0-f6fa925abb02",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNDksImlhdCI6MTc5MzI4ODI0OSwianRpIjoiM2M0ODQ0MDMtZTlmZS00ZmRlLWIwNzktOGVlNGJiZDgwNDhjIiwic2lkIjoiMWNlNzBiNGYtYjExMS00ZmY4LTlkZTAtZjZmYTkyNWFiYjAyIn0.picIQf0zpM6VgOIOFQgYzdmx1kKIQuQIJFG-8BaZbaU",
  "access_expires_at": "2026-10-29T15:52:29.257011041Z",
  "refresh_token": "ze9QQan83cKbWAOt-yPcVzlXj097qAdfEN_a2ww8alw",
  "refresh_expires_at": "2026-10-30T03:37:29.256673572Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/orders/f9cf210f-50a0-47ce-b7c6-88db12433753/ratings` → **200**

```json
{
  "ratings": [
    {
      "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
      "author_type": "RIDER",
      "author_id": "862d7a01-3d6c-4004-a2ce-6e2462112f17",
      "target_type": "DRIVER",
      "target_id": "5a000000-0000-4000-8000-000000000401",
      "score": 5,
      "comment": "Clean car and a smooth ride",
      "created_at": "2026-10-29T15:37:28.125503Z"
    },
    {
      "order_id": "f9cf210f-50a0-47ce-b7c6-88db12433753",
      "author_type": "DRIVER",
      "author_id": "5a000000-0000-4000-8000-000000000401",
      "target_type": "RIDER",
      "target_id": "862d7a01-3d6c-4004-a2ce-6e2462112f17",
      "score": 4,
      "comment": "Passenger was ready at pickup",
      "created_at": "2026-10-29T15:37:28.308706Z"
    }
  ]
}
```

Done: ratings for order f9cf210f-50a0-47ce-b7c6-88db12433753.

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
  "session_id": "aceaffbf-dec0-41b3-a994-67439eb6a1f0",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNDksImlhdCI6MTc5MzI4ODI0OSwianRpIjoiNmY5ZTAxMzUtYjZiNS00MjcxLThjZmMtZmY1MmVmYzg3Yjg0Iiwic2lkIjoiYWNlYWZmYmYtZGVjMC00MWIzLWE5OTQtNjc0MzllYjZhMWYwIn0.-EKdEkG6Qw6x48f3TOSOrGAf5UArmZV1N-GcCctY6jk",
  "access_expires_at": "2026-10-29T15:52:29.829001336Z",
  "refresh_token": "RHsyMv2jQdd_mhBIcReEVdqp3urq0wD_XgEbtc_8edg",
  "refresh_expires_at": "2026-10-30T03:37:29.828675725Z",
  "password_change_required": false
}
```

## Orders of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "3f1877bb-f5ce-49fc-a417-13ab8c1c5372",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "a2f2b85b-e462-4331-a14f-8f029f1c3278",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:30.015665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2f2b85b-e462-4331-a14f-8f029f1c3278` → **200**

```json
{
  "id": "a2f2b85b-e462-4331-a14f-8f029f1c3278",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:30.015665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2f2b85b-e462-4331-a14f-8f029f1c3278` → **200**

```json
{
  "id": "a2f2b85b-e462-4331-a14f-8f029f1c3278",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:30.015665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2f2b85b-e462-4331-a14f-8f029f1c3278` → **200**

```json
{
  "id": "a2f2b85b-e462-4331-a14f-8f029f1c3278",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:30.015665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2f2b85b-e462-4331-a14f-8f029f1c3278` → **200**

```json
{
  "id": "a2f2b85b-e462-4331-a14f-8f029f1c3278",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:30.015665Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/a2f2b85b-e462-4331-a14f-8f029f1c3278` → **200**

```json
{
  "id": "a2f2b85b-e462-4331-a14f-8f029f1c3278",
  "kind": "ORDERS",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "orders_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:37:30.015665Z",
  "ready_at": "2026-10-29T15:37:34.637042Z",
  "expires_at": "2026-10-30T15:37:34.637042Z"
}
```

`GET /api/admin/v1/reports/exports/a2f2b85b-e462-4331-a14f-8f029f1c3278/file` → **200**, 3 lines:

```csv
date,created,fulfilled,cancelled,unfulfilled,open,channel_app,channel_phone,channel_web,payment_cash,payment_card,payment_terminal,payment_service,cancelled_by_rider,cancelled_by_driver,cancelled_by_staff
2026-10-29,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
total,24,11,13,0,0,19,5,0,21,2,0,1,7,1,5
```

## Money of Kyiv this month, as CSV

`POST /api/admin/v1/reports/exports` → **202**

```json
{
  "command_id": "b739d6da-ce87-499c-b8aa-cb5550c85982",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29"
}
```

```json
{
  "id": "ba450b10-2656-4757-9740-a4fdf0a18e57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:35.151095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba450b10-2656-4757-9740-a4fdf0a18e57` → **200**

```json
{
  "id": "ba450b10-2656-4757-9740-a4fdf0a18e57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:35.151095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba450b10-2656-4757-9740-a4fdf0a18e57` → **200**

```json
{
  "id": "ba450b10-2656-4757-9740-a4fdf0a18e57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:35.151095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba450b10-2656-4757-9740-a4fdf0a18e57` → **200**

```json
{
  "id": "ba450b10-2656-4757-9740-a4fdf0a18e57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:35.151095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba450b10-2656-4757-9740-a4fdf0a18e57` → **200**

```json
{
  "id": "ba450b10-2656-4757-9740-a4fdf0a18e57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "PENDING",
  "file_name": null,
  "rows": null,
  "error": null,
  "created_at": "2026-10-29T15:37:35.151095Z",
  "ready_at": null,
  "expires_at": null
}
```

`GET /api/admin/v1/reports/exports/ba450b10-2656-4757-9740-a4fdf0a18e57` → **200**

```json
{
  "id": "ba450b10-2656-4757-9740-a4fdf0a18e57",
  "kind": "FINANCE",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "from": "2026-10-01",
  "to": "2026-10-29",
  "state": "READY",
  "file_name": "finance_2026-10-01_2026-10-29.csv",
  "rows": 2,
  "error": null,
  "created_at": "2026-10-29T15:37:35.151095Z",
  "ready_at": "2026-10-29T15:37:39.64349Z",
  "expires_at": "2026-10-30T15:37:39.64349Z"
}
```

`GET /api/admin/v1/reports/exports/ba450b10-2656-4757-9740-a4fdf0a18e57/file` → **200**, 3 lines:

```csv
date,currency,trips,fares,service_rides,commission,driver_share,discounts,bonuses_granted,paid_by_card,paid_with_bonuses,collected_by_drivers,tips,rider_debt_change
2026-10-29,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
total,UAH,11,1550.34,130.74,232.59,1317.75,10.52,0.00,325.94,182.97,795.00,50.00,105.17
```

## An export that is not mine is not found

`GET /api/admin/v1/reports/exports/68ed526d-c653-4db4-bf3f-19ee9e57d2f6` → **404**

```json
{
  "instance": "/api/admin/v1/reports/exports/68ed526d-c653-4db4-bf3f-19ee9e57d2f6",
  "status": 404,
  "title": "Not found",
  "type": "https://errors.blizz.taxi/not-found",
  "code": "NOT_FOUND",
  "correlation_id": "cbef65cf-4152-4fef-b1b9-1b86f0399b3a"
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
  "device_ref": "sandbox-29024"
}
```

```json
{
  "challenge_id": "2f4c7d4b-d58a-43de-baa6-e4545b48e370",
  "expires_at": "2026-10-29T15:42:40.461099855Z",
  "resend_available_at": "2026-10-29T15:37:41.461099855Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "308176",
  "sent_at": "2026-10-29T15:37:40.462972459Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "2f4c7d4b-d58a-43de-baa6-e4545b48e370",
  "code": "308176",
  "device_ref": "sandbox-29024"
}
```

```json
{
  "session_id": "587264a3-9508-4f14-95b8-ad493613df45",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE2MCwiaWF0IjoxNzkzMjg4MjYwLCJqdGkiOiJkOTg2ZGU0Ny00NmE4LTRhZjYtYjY3Yy0wMTVhYTMwYjJlNGMiLCJzaWQiOiI1ODcyNjRhMy05NTA4LTRmMTQtOTViOC1hZDQ5MzYxM2RmNDUifQ.sqVc09WC3OOSTc58g6AiepVqKgje0c9yjcpACubYLac",
  "access_expires_at": "2026-10-29T15:52:40.661599395Z",
  "refresh_token": "mU0wW5dGLmT-Jr4bsoOeQqlw1pkX_4OhRpSBEATrIhA",
  "refresh_expires_at": "2026-11-28T15:37:40.661223879Z",
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
  "command_id": "51b9b992-d684-4def-9b4e-a71cb319d7ea",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4501,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:41Z",
    "sequence": 1793288261189
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "c0c52e55-9d0a-44ec-afa8-a3900499ef99",
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
  "last_heartbeat_at": "2026-10-29T15:37:41.205427Z",
  "last_location_at": "2026-10-29T15:37:41.205427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

## His phone reports a jump: 40 km in one minute

`POST /api/driver/v1/location-batches` → **200**

```json
{
  "command_id": "c397a7b5-c648-4b24-8e14-0d859a07aabf",
  "points": [
    {
      "sequence": 1793288263390,
      "lat": 50.4501,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:36:43Z"
    },
    {
      "sequence": 1793288263396,
      "lat": 50.8101,
      "lon": 30.5234,
      "accuracy_m": 5,
      "recorded_at": "2026-10-29T15:37:43Z"
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
  "session_id": "eee96ed3-234f-4d90-9a7d-d0753bb1d077",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNjMsImlhdCI6MTc5MzI4ODI2MywianRpIjoiMjIwMWUwZDgtMTA1MC00NzQxLWE1ZWItNmMxYWNkMjRlNGUxIiwic2lkIjoiZWVlOTZlZDMtMjM0Zi00ZDkwLTlhN2QtZDA3NTNiYjFkMDc3In0.XNdfaGUL_ghlLAsMIqxqSY_mH8v2mKEEkEy6duPJzNY",
  "access_expires_at": "2026-10-29T15:52:43.810449525Z",
  "refresh_token": "DewtAvFKa2yN-fSsxU9LO_C81LCtjc-G0hvGOhVe1bY",
  "refresh_expires_at": "2026-10-30T03:37:43.810140198Z",
  "password_change_required": false
}
```

`GET /api/admin/v1/driver-risk-flags?driver_id=5a000000-0000-4000-8000-000000000403&state=OPEN&city_id=5a000000-0000-4000-8000-000000000001` → **200**

```json
{
  "flags": [
    {
      "id": "aca65871-e3eb-4b10-ad08-0e6fee4a6c67",
      "driver_id": "5a000000-0000-4000-8000-000000000403",
      "city_id": "5a000000-0000-4000-8000-000000000001",
      "kind": "IMPOSSIBLE_MOVEMENT",
      "state": "OPEN",
      "evidence": {
        "seconds": 60.0,
        "speed_kph": 2402,
        "distance_m": 40030,
        "recorded_at": "2026-10-29T15:37:43Z",
        "track_point_id": "2afe7ad4-51f3-4c08-ae4c-2f4a02b1f535",
        "work_session_id": "c0c52e55-9d0a-44ec-afa8-a3900499ef99"
      },
      "raised_by": null,
      "raised_at": "2026-10-29T15:37:43Z",
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

`POST /api/admin/v1/driver-risk-flags/aca65871-e3eb-4b10-ad08-0e6fee4a6c67/confirm` → **200**

```json
{
  "command_id": "9c87ff0e-e35b-47d8-a71b-a8938f854084",
  "expected_version": 1,
  "reason": "Sandbox: the jump is real"
}
```

```json
{
  "id": "aca65871-e3eb-4b10-ad08-0e6fee4a6c67",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "IMPOSSIBLE_MOVEMENT",
  "state": "CONFIRMED",
  "evidence": {
    "seconds": 60.0,
    "speed_kph": 2402,
    "distance_m": 40030,
    "recorded_at": "2026-10-29T15:37:43Z",
    "track_point_id": "2afe7ad4-51f3-4c08-ae4c-2f4a02b1f535",
    "work_session_id": "c0c52e55-9d0a-44ec-afa8-a3900499ef99"
  },
  "raised_by": null,
  "raised_at": "2026-10-29T15:37:43Z",
  "reason": null,
  "reviewed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reviewed_at": "2026-10-29T15:37:44.37494Z",
  "review_reason": "Sandbox: the jump is real",
  "version": 2
}
```

`POST /api/admin/v1/driver-risk-flags/aca65871-e3eb-4b10-ad08-0e6fee4a6c67/dismiss` → **409**

```json
{
  "command_id": "c53243ff-5602-4f93-8098-ccf4bd22522e",
  "expected_version": 2,
  "reason": "Changed my mind"
}
```

```json
{
  "instance": "/api/admin/v1/driver-risk-flags/aca65871-e3eb-4b10-ad08-0e6fee4a6c67/dismiss",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "4dc6eaf5-4697-4958-a41f-430c8c158977"
}
```

## A flag raised by hand, then dismissed

`POST /api/admin/v1/driver-risk-flags` → **201**

```json
{
  "command_id": "667e19df-1770-4e0f-9772-f5c37dd8d09d",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "reason": "Sandbox: a rider complained about detours"
}
```

```json
{
  "id": "3e023c48-2a00-4f26-8d60-d7230719eb0b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "OPEN",
  "evidence": {},
  "raised_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "raised_at": "2026-10-29T15:37:44.744298Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": null,
  "reviewed_at": null,
  "review_reason": null,
  "version": 1
}
```

`POST /api/admin/v1/driver-risk-flags/3e023c48-2a00-4f26-8d60-d7230719eb0b/dismiss` → **200**

```json
{
  "command_id": "e0308808-9e36-4a19-9990-aad6f0b0d1de",
  "expected_version": 1,
  "reason": "Sandbox: the route was a detour for roadworks"
}
```

```json
{
  "id": "3e023c48-2a00-4f26-8d60-d7230719eb0b",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "kind": "MANUAL",
  "state": "DISMISSED",
  "evidence": {},
  "raised_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "raised_at": "2026-10-29T15:37:44.744298Z",
  "reason": "Sandbox: a rider complained about detours",
  "reviewed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reviewed_at": "2026-10-29T15:37:44.930962Z",
  "review_reason": "Sandbox: the route was a detour for roadworks",
  "version": 2
}
```

## The suspension is a separate action and names the confirmed flag; the clean-up reinstates the driver

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/suspend` → **200**

```json
{
  "command_id": "9982c8a4-5158-4624-9080-dcde51430944",
  "expected_version": 5,
  "reason": "Sandbox: impossible movement confirmed",
  "risk_flag_id": "aca65871-e3eb-4b10-ad08-0e6fee4a6c67"
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
      "actor_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:37:45.114847Z"
    }
  ]
}
```

Done: flag aca65871-e3eb-4b10-ad08-0e6fee4a6c67 confirmed, suspension named it, driver reinstated.

`POST /auth/v1/staff/sign-in` → **200**

```json
{
  "login": "admin",
  "password": "Sandbox-Admin-2026-ok",
  "audience": "ADMIN",
  "device_ref": "sandbox"
}
```

```json
{
  "session_id": "6061df62-a236-433d-944b-cc893d05c3cd",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNjUsImlhdCI6MTc5MzI4ODI2NSwianRpIjoiMzQxNThjZjctOTMwZi00ZGE3LTljN2ItNjFlMzQxNzMxZWFiIiwic2lkIjoiNjA2MWRmNjItYTIzNi00MzNkLTk0NGItY2M4OTNkMDVjM2NkIn0.43_ZAH17gXwFGhvW2vP0zJ0HohneIAErYpcaxIAhlS8",
  "access_expires_at": "2026-10-29T15:52:45.677352839Z",
  "refresh_token": "WHaUmX4tJ6_LMF5ddRowqH6ridCFGZIgML9AGAbt3Yc",
  "refresh_expires_at": "2026-10-30T03:37:45.676969166Z",
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
      "actor_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:37:45.114847Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/reinstate` → **200**

```json
{
  "command_id": "49973204-de0b-485e-88a8-af03fb2703a9",
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
  "session_id": "c0c52e55-9d0a-44ec-afa8-a3900499ef99",
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
  "last_heartbeat_at": "2026-10-29T15:37:41.205427Z",
  "last_location_at": "2026-10-29T15:37:41.205427Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/c0c52e55-9d0a-44ec-afa8-a3900499ef99/close` → **200**

```json
{
  "command_id": "52066d3f-762b-4e85-b443-4bbf33efd6f2",
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
  "session_id": "050539bf-203b-4322-8376-51559acba667",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNjYsImlhdCI6MTc5MzI4ODI2NiwianRpIjoiNjI4ZWVlN2EtNWQwYi00Y2YzLTg1M2QtZTBjZjFhNzNjNDgyIiwic2lkIjoiMDUwNTM5YmYtMjAzYi00MzIyLTgzNzYtNTE1NTlhY2JhNjY3In0.sCacuAXoY691PF_4bcxT8eN0-N5YPn9MuLhtohwG4bo",
  "access_expires_at": "2026-10-29T15:52:46.763584768Z",
  "refresh_token": "-ineM6j_Q_Lu1ZXxxDsQn-NYk1jGnZIRBfmZptGpCo0",
  "refresh_expires_at": "2026-10-30T03:37:46.76322828Z",
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
  "command_id": "cea84ec7-1552-4632-b434-aa83b604a398",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:37:47.120542Z"
}
```

## The same command again changes nothing

`POST /api/admin/v1/settings/safety-contacts/5a000000-0000-4000-8000-000000000002` → **200**

```json
{
  "command_id": "cea84ec7-1552-4632-b434-aa83b604a398",
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
  "changed_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "reason": "Sandbox: contacts of Warszawa",
  "changed_at": "2026-10-29T15:37:47.120542Z"
}
```

## The rider opens the safety button for Warszawa

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+48371567704",
  "device_ref": "sandbox-14562"
}
```

```json
{
  "challenge_id": "964b742e-e96f-4a4b-a4d0-c7c796f58a2d",
  "expires_at": "2026-10-29T15:42:47.491541624Z",
  "resend_available_at": "2026-10-29T15:37:48.491541624Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48371567704` → **200**

```json
{
  "phone": "+48371567704",
  "audience": "CLIENT",
  "code": "186798",
  "sent_at": "2026-10-29T15:37:47.493876184Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "964b742e-e96f-4a4b-a4d0-c7c796f58a2d",
  "code": "186798",
  "device_ref": "sandbox-14562"
}
```

```json
{
  "session_id": "9a22d533-8640-4304-b25b-abd8d74c835f",
  "subject": {
    "type": "CLIENT",
    "id": "2556123a-81fd-4f8c-979c-c69afb4da921"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiIyNTU2MTIzYS04MWZkLTRmOGMtOTc5Yy1jNjlhZmI0ZGE5MjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTY3LCJpYXQiOjE3OTMyODgyNjcsImp0aSI6IjUyZDRmMzNmLTE5NTctNGIzMy1iODNkLTYyNjAwODFjNWE3MiIsInNpZCI6IjlhMjJkNTMzLTg2NDAtNDMwNC1iMjViLWFiZDhkNzRjODM1ZiJ9.OW0ODyP9GsHWjbWLeI8tkMIDxce_Uthv41FDI6OqYYQ",
  "access_expires_at": "2026-10-29T15:52:47.689252841Z",
  "refresh_token": "LNaZdwjyubmYLmUnR_frH6h3lJJ0SOmP7FvLUGO2tVw",
  "refresh_expires_at": "2026-11-28T15:37:47.688935402Z",
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
  "correlation_id": "ec037621-3e45-4f0b-9d33-b4eefab59971"
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
  "device_ref": "sandbox-3160"
}
```

```json
{
  "challenge_id": "203d4b9f-309d-48ef-a406-0fb6a3417127",
  "expires_at": "2026-10-29T15:42:48.214904357Z",
  "resend_available_at": "2026-10-29T15:37:49.214904357Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B48500000001` → **200**

```json
{
  "phone": "+48500000001",
  "audience": "DRIVER",
  "code": "585525",
  "sent_at": "2026-10-29T15:37:48.216656499Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "203d4b9f-309d-48ef-a406-0fb6a3417127",
  "code": "585525",
  "device_ref": "sandbox-3160"
}
```

```json
{
  "session_id": "8dc27076-a1e7-4cdb-b3e0-e8b3fc833710",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000404"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDQiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE2OCwiaWF0IjoxNzkzMjg4MjY4LCJqdGkiOiJkYjU0NWVhYi1mNWVkLTQxYzgtODQ2NC1hOGMwNGUxNWNmNTkiLCJzaWQiOiI4ZGMyNzA3Ni1hMWU3LTRjZGItYjNlMC1lOGIzZmM4MzM3MTAifQ.1T0Qm39vRbyAA5PBuL1ziFjAHJzTYYHEYtYoVmnPJyw",
  "access_expires_at": "2026-10-29T15:52:48.413689008Z",
  "refresh_token": "_yNe9f9v85MKLaUmzUHEyR_I6lipHgtlwHZETB5-UX0",
  "refresh_expires_at": "2026-11-28T15:37:48.413368374Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0a1a415d-0963-470f-81d7-44ace1ff7431",
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
  "last_heartbeat_at": "2026-10-29T15:37:23.04837Z",
  "last_location_at": "2026-10-29T15:37:23.04837Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0a1a415d-0963-470f-81d7-44ace1ff7431/handover` → **200**

```json
{
  "command_id": "b0428dc9-30ca-4f53-bf8f-d9d71b208958",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0a1a415d-0963-470f-81d7-44ace1ff7431",
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
  "last_heartbeat_at": "2026-10-29T15:37:23.04837Z",
  "last_location_at": "2026-10-29T15:37:23.04837Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/0a1a415d-0963-470f-81d7-44ace1ff7431/heartbeat` → **200**

```json
{
  "location": {
    "lat": 52.2350,
    "lon": 21.0122,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:48Z",
    "sequence": 1793288268946
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000404",
  "session_id": "0a1a415d-0963-470f-81d7-44ace1ff7431",
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
  "last_heartbeat_at": "2026-10-29T15:37:48.959851Z",
  "last_location_at": "2026-10-29T15:37:48.959851Z",
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
  "session_id": "0a1a415d-0963-470f-81d7-44ace1ff7431",
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
  "last_heartbeat_at": "2026-10-29T15:37:48.959851Z",
  "last_location_at": "2026-10-29T15:37:48.959851Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/0a1a415d-0963-470f-81d7-44ace1ff7431/close` → **200**

```json
{
  "command_id": "80d0c8fe-8aa6-4518-adc3-544a5403d883",
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
  "correlation_id": "1bd25529-3b48-4e82-b528-954fe5f8231c"
}
```

Done: safety contacts of Warszawa, version 1.

# Scenario: support-attachments

## Rider uploads a photo and opens a support case

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380670108028",
  "device_ref": "sandbox-2362"
}
```

```json
{
  "challenge_id": "e6e6d423-b666-4f6d-98d1-2c7778723a28",
  "expires_at": "2026-10-29T15:42:49.835621388Z",
  "resend_available_at": "2026-10-29T15:37:50.835621388Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380670108028` → **200**

```json
{
  "phone": "+380670108028",
  "audience": "CLIENT",
  "code": "562453",
  "sent_at": "2026-10-29T15:37:49.837356914Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e6e6d423-b666-4f6d-98d1-2c7778723a28",
  "code": "562453",
  "device_ref": "sandbox-2362"
}
```

```json
{
  "session_id": "feac24aa-bbbe-4b39-be5f-dd372fa7971b",
  "subject": {
    "type": "CLIENT",
    "id": "5275624d-7fd6-47f8-8116-4b832b2dd829"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1Mjc1NjI0ZC03ZmQ2LTQ3ZjgtODExNi00YjgzMmIyZGQ4MjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTcwLCJpYXQiOjE3OTMyODgyNzAsImp0aSI6IjA4YmZhOWVhLTk4OWEtNDNmMC04NzBiLTE0ZDhhOWEwNmViOCIsInNpZCI6ImZlYWMyNGFhLWJiYmUtNGIzOS1iZTVmLWRkMzcyZmE3OTcxYiJ9.a_SL_hFKuvj16ZkxiZcPvSLbxYlS7cDYvsFXPxwmcLc",
  "access_expires_at": "2026-10-29T15:52:50.027154763Z",
  "refresh_token": "NGK6DlVOtzzm429f3LsctedvoJhH-K5bATPdA0Ie_n4",
  "refresh_expires_at": "2026-11-28T15:37:50.026842002Z",
  "account_created": true
}
```

`POST /api/rider/v1/support/uploads` → **201**

```json
{
  "command_id": "e0bca30f-8c35-4d7b-8a2d-68b03ca354e6",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "aebfb6eb-4c93-4768-bf57-9024a9ecd257",
  "upload_path": "/api/rider/v1/uploads/aebfb6eb-4c93-4768-bf57-9024a9ecd257",
  "expires_at": "2026-10-29T15:52:50.205184527Z",
  "max_bytes": 68
}
```

`PUT /api/rider/v1/uploads/aebfb6eb-4c93-4768-bf57-9024a9ecd257` → **200**

```json
{
  "file_id": "aebfb6eb-4c93-4768-bf57-9024a9ecd257",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`POST /api/rider/v1/support/cases` → **201**

```json
{
  "command_id": "43c40fa9-ee64-4974-9ed5-7d652a2a0c05",
  "category": "APP_PROBLEM",
  "subject": "Screenshot attached",
  "message": "Please check this screenshot",
  "attachment_ids": [
    "aebfb6eb-4c93-4768-bf57-9024a9ecd257"
  ]
}
```

```json
{
  "id": "f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:37:50.41587Z",
  "updated_at": "2026-10-29T15:37:50.41587Z",
  "respond_by": "2026-10-29T19:37:50.41587Z",
  "messages": [
    {
      "id": "5ff46ba4-ab2b-4964-b283-715da31f436b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:37:50.416599Z",
      "attachments": [
        {
          "file_id": "aebfb6eb-4c93-4768-bf57-9024a9ecd257",
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
  "session_id": "ec6d6cd8-7a64-4aa5-8082-36d880d573e7",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNzAsImlhdCI6MTc5MzI4ODI3MCwianRpIjoiOTlhZTlkM2UtZjcxMS00MjM4LTk0YzUtYTI5NTU1NWI5MDM4Iiwic2lkIjoiZWM2ZDZjZDgtN2E2NC00YWE1LTgwODItMzZkODgwZDU3M2U3In0.c44qC9998L6owUIQTBCOKOA65jMyrSiXapdpVJcZ0rM",
  "access_expires_at": "2026-10-29T15:52:50.815177687Z",
  "refresh_token": "RnShRsING3zW-NDHO5CN52ix-7QYYegPFeQh93kuWao",
  "refresh_expires_at": "2026-10-30T03:37:50.814883813Z",
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
  "session_id": "04245ec9-50f2-4351-a003-2c8052237384",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNzEsImlhdCI6MTc5MzI4ODI3MSwianRpIjoiYTcwYTYwYTItZWNkYi00Y2I4LThmZGMtYWJlZGRkODRhMTY0Iiwic2lkIjoiMDQyNDVlYzktNTBmMi00MzUxLWEwMDMtMmM4MDUyMjM3Mzg0In0.G_v0zk_RGWXmeYXkd3DFD4YzgWQoaas_PboG1gKWZzw",
  "access_expires_at": "2026-10-29T15:52:51.191829521Z",
  "refresh_token": "m3ZxgiG_X2NHsMNSvtjkxnbs069iHdHX0C6s9ihxkMs",
  "refresh_expires_at": "2026-10-30T03:37:51.191480585Z",
  "password_change_required": false
}
```

`GET /api/operator/v1/support/cases/f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5/attachments/aebfb6eb-4c93-4768-bf57-9024a9ecd257` → **200**

`POST /api/operator/v1/support/uploads` → **201**

```json
{
  "command_id": "fe599b1c-b75c-411c-9ada-ae95025bed14",
  "content_type": "image/png",
  "size_bytes": 68
}
```

```json
{
  "file_id": "8b6c878c-7605-499d-ae9f-b09ce7f5365c",
  "upload_path": "/api/operator/v1/uploads/8b6c878c-7605-499d-ae9f-b09ce7f5365c",
  "expires_at": "2026-10-29T15:52:51.381411992Z",
  "max_bytes": 68
}
```

`PUT /api/operator/v1/uploads/8b6c878c-7605-499d-ae9f-b09ce7f5365c` → **200**

```json
{
  "file_id": "8b6c878c-7605-499d-ae9f-b09ce7f5365c",
  "state": "SAFE",
  "content_type": "image/png",
  "size_bytes": 68,
  "reject_reason": null
}
```

`GET /api/operator/v1/support/cases/f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5` → **200**

```json
{
  "id": "f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "OPEN",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 0,
  "created_at": "2026-10-29T15:37:50.41587Z",
  "updated_at": "2026-10-29T15:37:50.41587Z",
  "respond_by": "2026-10-29T19:37:50.41587Z",
  "messages": [
    {
      "id": "5ff46ba4-ab2b-4964-b283-715da31f436b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:37:50.416599Z",
      "attachments": [
        {
          "file_id": "aebfb6eb-4c93-4768-bf57-9024a9ecd257",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`POST /api/operator/v1/support/cases/f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5/comments` → **200**

```json
{
  "command_id": "0bf1a746-649b-4943-8024-732f5fe42a5b",
  "expected_version": 0,
  "visibility": "PUBLIC",
  "body": "Here is the annotated file",
  "wait_for_requester": true,
  "attachment_ids": [
    "8b6c878c-7605-499d-ae9f-b09ce7f5365c"
  ]
}
```

```json
{
  "id": "f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:37:50.41587Z",
  "updated_at": "2026-10-29T15:37:51.76955Z",
  "respond_by": "2026-10-29T19:37:50.41587Z",
  "messages": [
    {
      "id": "5ff46ba4-ab2b-4964-b283-715da31f436b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:37:50.416599Z",
      "attachments": [
        {
          "file_id": "aebfb6eb-4c93-4768-bf57-9024a9ecd257",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5684cff8-1503-4212-a72d-7473197109f0",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:37:51.769171Z",
      "attachments": [
        {
          "file_id": "8b6c878c-7605-499d-ae9f-b09ce7f5365c",
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

`GET /api/rider/v1/support/cases/f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5` → **200**

```json
{
  "id": "f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5",
  "number": 3,
  "city_id": null,
  "category": "APP_PROBLEM",
  "order_id": null,
  "requester_type": "CLIENT",
  "requester_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
  "subject": "Screenshot attached",
  "priority": "NORMAL",
  "state": "WAITING_REQUESTER",
  "assigned_staff_id": null,
  "resolution": null,
  "version": 1,
  "created_at": "2026-10-29T15:37:50.41587Z",
  "updated_at": "2026-10-29T15:37:51.76955Z",
  "respond_by": "2026-10-29T19:37:50.41587Z",
  "messages": [
    {
      "id": "5ff46ba4-ab2b-4964-b283-715da31f436b",
      "sequence": 1,
      "author_type": "CLIENT",
      "author_id": "5275624d-7fd6-47f8-8116-4b832b2dd829",
      "visibility": "PUBLIC",
      "body": "Please check this screenshot",
      "created_at": "2026-10-29T15:37:50.416599Z",
      "attachments": [
        {
          "file_id": "aebfb6eb-4c93-4768-bf57-9024a9ecd257",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    },
    {
      "id": "5684cff8-1503-4212-a72d-7473197109f0",
      "sequence": 2,
      "author_type": "STAFF",
      "author_id": null,
      "visibility": "PUBLIC",
      "body": "Here is the annotated file",
      "created_at": "2026-10-29T15:37:51.769171Z",
      "attachments": [
        {
          "file_id": "8b6c878c-7605-499d-ae9f-b09ce7f5365c",
          "content_type": "image/png",
          "size_bytes": 68,
          "name": null
        }
      ]
    }
  ]
}
```

`GET /api/rider/v1/support/cases/f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5/attachments/8b6c878c-7605-499d-ae9f-b09ce7f5365c` → **200**

Done: support case f9bf82c4-ffd5-4a8b-9279-25bcf14e5ae5, rider attachment aebfb6eb-4c93-4768-bf57-9024a9ecd257, operator attachment 8b6c878c-7605-499d-ae9f-b09ce7f5365c.

# Scenario: switch-to-cash

## The rider adds a card

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "CLIENT",
  "phone": "+380735154858",
  "device_ref": "sandbox-27525"
}
```

```json
{
  "challenge_id": "c3abeb1a-f977-4d73-8c69-7b3958044ba8",
  "expires_at": "2026-10-29T15:42:52.166545053Z",
  "resend_available_at": "2026-10-29T15:37:53.166545053Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380735154858` → **200**

```json
{
  "phone": "+380735154858",
  "audience": "CLIENT",
  "code": "458725",
  "sent_at": "2026-10-29T15:37:52.168489926Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c3abeb1a-f977-4d73-8c69-7b3958044ba8",
  "code": "458725",
  "device_ref": "sandbox-27525"
}
```

```json
{
  "session_id": "5eb34350-7c1a-49ac-8ac7-4c880944135d",
  "subject": {
    "type": "CLIENT",
    "id": "e4984b82-ee43-4f66-9ea9-61e371db1f21"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJlNDk4NGI4Mi1lZTQzLTRmNjYtOWVhOS02MWUzNzFkYjFmMjEiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTcyLCJpYXQiOjE3OTMyODgyNzIsImp0aSI6ImQyNjg5NTNmLTRmY2YtNDJlZS05YThhLWY1YmZjMGIzNTNiYSIsInNpZCI6IjVlYjM0MzUwLTdjMWEtNDlhYy04YWM3LTRjODgwOTQ0MTM1ZCJ9.BAF62QRPWFk-eLGnY8mWv2Gl-kjFY_Nn7v1jTsZsdfI",
  "access_expires_at": "2026-10-29T15:52:52.373201225Z",
  "refresh_token": "zoShM-grvsXyRpBVB5sOp4m35hFysCBuzisOSQcViRI",
  "refresh_expires_at": "2026-11-28T15:37:52.372779876Z",
  "account_created": true
}
```

`POST /api/rider/v1/card-bindings` → **201**

```json
{
  "command_id": "3c5eb119-a2d5-42d1-b398-b8c91a973b17",
  "city_id": "5a000000-0000-4000-8000-000000000001"
}
```

```json
{
  "id": "8e1343ca-aafa-41f0-ad49-a47e2434554c",
  "state": "PENDING",
  "url": "http://localhost:8080/payments/v1/fake/verify",
  "fields": {
    "merchantAccount": "sandbox_kyiv",
    "merchantAuthType": "SimpleSignature",
    "merchantDomainName": "sandbox.blizz.invalid",
    "orderReference": "card-8e1343ca-aafa-41f0-ad49-a47e2434554c",
    "amount": "0",
    "currency": "UAH",
    "merchantSignature": "af41c199a398a630953a351ecf149b84",
    "apiVersion": "1",
    "paymentSystem": "lookupCard",
    "returnUrl": "http://localhost:8080/payments/v1/return?binding=8e1343ca-aafa-41f0-ad49-a47e2434554c",
    "serviceUrl": "http://localhost:8080/payments/v1/callbacks/5a000000-0000-4000-8000-000000000601",
    "clientPhone": "380735154858"
  },
  "return_url": "http://localhost:8080/payments/v1/return?binding=8e1343ca-aafa-41f0-ad49-a47e2434554c",
  "expires_at": "2026-10-29T16:07:52.555721Z",
  "card": null,
  "failure_reason": null
}
```

`GET /api/rider/v1/card-bindings/8e1343ca-aafa-41f0-ad49-a47e2434554c` → **200**

```json
{
  "id": "8e1343ca-aafa-41f0-ad49-a47e2434554c",
  "state": "COMPLETED",
  "url": null,
  "fields": null,
  "return_url": null,
  "expires_at": "2026-10-29T16:07:52.555721Z",
  "card": {
    "id": "b4486ef6-7898-4fcb-8f0d-ab72f537af58",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "masked_pan": "41****0656",
    "card_type": "Visa",
    "created_at": "2026-10-29T15:37:52.736423Z"
  },
  "failure_reason": null
}
```

## The rider orders by card: the hold is taken

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "5eadb39c-cb4c-4f43-8efd-7bd4de0320b0",
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
  "id": "dbf6ace4-1a50-4c16-bc7e-d7c691f87db3",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 16297,
  "currency": "UAH",
  "distance_m": 6541,
  "duration_s": 942,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:42:52.934268Z",
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
  "command_id": "da93fecd-9c64-48aa-abc9-924b6fcabb7c",
  "quote_id": "dbf6ace4-1a50-4c16-bc7e-d7c691f87db3",
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
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57` → **200**

```json
{
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "AWAITING_PAYMENT",
  "status_reason": null,
  "version": 0,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57` → **200**

```json
{
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
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

`GET /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57` → **200**

```json
{
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 3,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57/switch-to-cash` → **200**

```json
{
  "command_id": "2674edd3-896f-4fd3-8a0f-d0a47eafdff1",
  "expected_version": 3
}
```

```json
{
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57/switch-to-cash` → **409**

```json
{
  "command_id": "6e6beb89-dfaf-4166-8037-de3206ac42c3",
  "expected_version": 4
}
```

```json
{
  "instance": "/api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57/switch-to-cash",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "1dd98330-a9cc-46bc-8eeb-ae8203d58a79"
}
```

Done: the card order became cash; a second switch is refused.

`GET /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57` → **200**

```json
{
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 4,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`POST /api/rider/v1/orders/3e11a314-fc4f-4080-8d10-a08df705fc57/cancel` → **200**

```json
{
  "command_id": "547684ea-1ea7-4975-aa7d-60ed36dcee96",
  "expected_version": 4,
  "reason_code": "CHANGED_MIND"
}
```

```json
{
  "id": "3e11a314-fc4f-4080-8d10-a08df705fc57",
  "short_number": 26,
  "status": "CANCELLED",
  "status_reason": "CHANGED_MIND",
  "version": 5,
  "channel": "APP",
  "payer_client_id": "e4984b82-ee43-4f66-9ea9-61e371db1f21",
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
  "created_at": "2026-10-29T15:37:53.122113Z",
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
  "session_id": "d7e2a161-1a65-4eea-903a-8bd24c235af3",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNzUsImlhdCI6MTc5MzI4ODI3NSwianRpIjoiODYzMjQ2MGQtNTVhZi00NDkwLTg2YzktMzU2NjdkZmY4ZjgzIiwic2lkIjoiZDdlMmExNjEtMWE2NS00ZWVhLTkwM2EtOGJkMjRjMjM1YWYzIn0.hs-fu8c_GuYajzoX0I0BvwZsOz76D8ws3r5ILZ9RxOQ",
  "access_expires_at": "2026-10-29T15:52:55.856076468Z",
  "refresh_token": "wZyYFOb07REuoZtXuNuCk0R5EHGGAJLaYmomKpWKbc0",
  "refresh_expires_at": "2026-10-30T03:37:55.855769145Z",
  "password_change_required": false
}
```

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000003",
  "device_ref": "sandbox-31515"
}
```

```json
{
  "challenge_id": "a38f842f-abf6-4c51-b7fe-fa3f19699894",
  "expires_at": "2026-10-29T15:42:56.03236678Z",
  "resend_available_at": "2026-10-29T15:37:57.03236678Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "749486",
  "sent_at": "2026-10-29T15:37:56.03408395Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "a38f842f-abf6-4c51-b7fe-fa3f19699894",
  "code": "749486",
  "device_ref": "sandbox-31515"
}
```

```json
{
  "session_id": "b0ff56b1-4aae-4173-b0b8-98a35fa46c60",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE3NiwiaWF0IjoxNzkzMjg4Mjc2LCJqdGkiOiI3OTRhYjBiYi05M2VkLTRlN2EtOGEyMC00MzQ5NmE5ODZlNjIiLCJzaWQiOiJiMGZmNTZiMS00YWFlLTQxNzMtYjBiOC05OGEzNWZhNDZjNjAifQ.nNbJokaqT-bkjxzSsXfnOLDkNQat1JD1J7cQUtpEZWk",
  "access_expires_at": "2026-10-29T15:52:56.229555352Z",
  "refresh_token": "PuYItFzdJoqROpallIgKWKkf-2A16p3S-ku3fb5Vyn4",
  "refresh_expires_at": "2026-11-28T15:37:56.229175314Z",
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
      "actor_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "reason": "Sandbox: impossible movement confirmed",
      "at": "2026-10-29T15:37:45.114847Z"
    },
    {
      "from": "SUSPENDED",
      "to": "APPROVED",
      "actor_type": "STAFF",
      "actor_id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "reason": "Sandbox clean-up",
      "at": "2026-10-29T15:37:46.030792Z"
    }
  ]
}
```

`POST /api/admin/v1/drivers/5a000000-0000-4000-8000-000000000403/payment-terminal` → **200**

```json
{
  "command_id": "343e88e5-f37c-4532-b912-7cf9ed4ada37",
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
  "device_ref": "sandbox-16467"
}
```

```json
{
  "challenge_id": "c7047daf-b9ab-48e8-87e5-71fe5477b8ab",
  "expires_at": "2026-10-29T15:42:56.967607892Z",
  "resend_available_at": "2026-10-29T15:37:57.967607892Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "449336",
  "sent_at": "2026-10-29T15:37:56.969793198Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "c7047daf-b9ab-48e8-87e5-71fe5477b8ab",
  "code": "449336",
  "device_ref": "sandbox-16467"
}
```

```json
{
  "session_id": "abdace4e-e509-475b-bb7a-d3f32a3a92ec",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE3NywiaWF0IjoxNzkzMjg4Mjc3LCJqdGkiOiJmMDA2NTNkZC0zNGY2LTQyNzMtOTE2NS1mYTBmMGE5ODNkYmUiLCJzaWQiOiJhYmRhY2U0ZS1lNTA5LTQ3NWItYmI3YS1kM2YzMmEzYTkyZWMifQ.v_iCgNd4DaNOlhS7ABGP7M8lZX3uyipU8rRGDcK44qQ",
  "access_expires_at": "2026-10-29T15:52:57.171795077Z",
  "refresh_token": "KHCAH26I9TxHDz7cTO8xZyU5c2gcV3NduXUKvIy_kjI",
  "refresh_expires_at": "2026-11-28T15:37:57.171395244Z",
  "account_created": false
}
```

`GET /api/driver/v1/work-sessions/current` → **200**

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:27.746999Z",
  "last_location_at": "2026-10-29T15:37:27.746999Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/06f52485-e970-4b41-aa4c-ac6be9d5e488/handover` → **200**

```json
{
  "command_id": "b7397d0c-1f92-4d8c-8969-1e3d42a8b7a7",
  "expected_version": 0
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:27.746999Z",
  "last_location_at": "2026-10-29T15:37:27.746999Z",
  "eligible": false,
  "ineligible_reasons": [
    "CONNECTION_STALE",
    "LOCATION_STALE"
  ]
}
```

`POST /api/driver/v1/work-sessions/06f52485-e970-4b41-aa4c-ac6be9d5e488/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4510,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:57Z",
    "sequence": 1793288277704
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000401",
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:57.718796Z",
  "last_location_at": "2026-10-29T15:37:57.718796Z",
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
  "command_id": "6460badd-b512-4565-b923-4d9fd0a1cb6d",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "location": {
    "lat": 50.4560,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:58Z",
    "sequence": 1793288278593
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8b3b1b1b-d6a3-4dc9-b7b6-42955cf38aa3",
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
  "last_heartbeat_at": "2026-10-29T15:37:58.073854Z",
  "last_location_at": "2026-10-29T15:37:58.073854Z",
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
  "session_id": "d47659fb-e878-4de1-8737-dae8a0c6465c",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "operator",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJvcGVyYXRvciIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkxNzgsImlhdCI6MTc5MzI4ODI3OCwianRpIjoiMTU0MWZhZTctYTZjOC00ZmFkLTk2MjMtMzNjZmQyYmRhOGM3Iiwic2lkIjoiZDQ3NjU5ZmItZTg3OC00ZGUxLTg3MzctZGFlOGEwYzY0NjVjIn0.9iUWHyz1L_mQLgvMROGHda_CdNsQNKf_95-oxSvwcrY",
  "access_expires_at": "2026-10-29T15:52:58.449220213Z",
  "refresh_token": "JO-YT-3RJln_zboHdRYR337jBW-33h3rlrTVKmmsEBo",
  "refresh_expires_at": "2026-10-30T03:37:58.44891967Z",
  "password_change_required": false
}
```

`POST /api/operator/v1/quotes` → **201**

```json
{
  "command_id": "596630a4-ee83-4015-9efd-4c70b72bb068",
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
  "id": "2fa4d0d3-ecf6-43ce-b0bf-5a5791dbdd0a",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 29967,
  "currency": "UAH",
  "distance_m": 13812,
  "duration_s": 1989,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:42:58.624552Z",
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
  "command_id": "9f351759-2a31-49e9-a75d-d497d2c079b0",
  "quote_id": "2fa4d0d3-ecf6-43ce-b0bf-5a5791dbdd0a",
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
  "id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
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
  "created_at": "2026-10-29T15:37:58.849483Z",
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
    "id": "1ee8daa9-7ce7-450b-9aab-3f4f299c8a84",
    "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
    "expires_at": "2026-10-29T15:38:13.851807Z",
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

`POST /api/driver/v1/offers/1ee8daa9-7ce7-450b-9aab-3f4f299c8a84/accept` → **200**

```json
{
  "command_id": "3de9593e-2317-41b8-87e8-5469f5082f76"
}
```

```json
{
  "id": "677db19e-6895-4cf3-bb18-54a6e9dbb0e8",
  "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "vehicle_id": "5a000000-0000-4000-8000-000000000503",
  "source": "OFFER",
  "state": "COMMITTED",
  "trip_id": "c23f1a19-a528-4abc-b3b1-861405bfa979",
  "trip_phase": "TO_PICKUP"
}
```

`GET /api/driver/v1/trips/current` → **200**

```json
{
  "id": "c23f1a19-a528-4abc-b3b1-861405bfa979",
  "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
  "assignment_id": "677db19e-6895-4cf3-bb18-54a6e9dbb0e8",
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

`POST /api/driver/v1/work-sessions/8b3b1b1b-d6a3-4dc9-b7b6-42955cf38aa3/heartbeat` → **200**

```json
{
  "location": {
    "lat": 50.4502,
    "lon": 30.5234,
    "accuracy_m": 5,
    "recorded_at": "2026-10-29T15:37:59Z",
    "sequence": 1793288279724
  }
}
```

```json
{
  "driver_id": "5a000000-0000-4000-8000-000000000403",
  "session_id": "8b3b1b1b-d6a3-4dc9-b7b6-42955cf38aa3",
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
  "last_heartbeat_at": "2026-10-29T15:37:59.73894Z",
  "last_location_at": "2026-10-29T15:37:59.73894Z",
  "eligible": false,
  "ineligible_reasons": [
    "OCCUPANCY_TO_PICKUP"
  ]
}
```

`POST /api/driver/v1/trips/c23f1a19-a528-4abc-b3b1-861405bfa979/arrive` → **200**

```json
{
  "command_id": "84ce07f4-e611-41cb-8003-79070f0a09a7",
  "expected_version": 0
}
```

```json
{
  "id": "c23f1a19-a528-4abc-b3b1-861405bfa979",
  "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
  "assignment_id": "677db19e-6895-4cf3-bb18-54a6e9dbb0e8",
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
  "arrived_at": "2026-10-29T15:37:59.920726Z",
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

`POST /api/driver/v1/trips/c23f1a19-a528-4abc-b3b1-861405bfa979/start` → **200**

```json
{
  "command_id": "a410f745-3879-4335-adc6-7c401ade275d",
  "expected_version": 1
}
```

```json
{
  "id": "c23f1a19-a528-4abc-b3b1-861405bfa979",
  "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
  "assignment_id": "677db19e-6895-4cf3-bb18-54a6e9dbb0e8",
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
  "arrived_at": "2026-10-29T15:37:59.920726Z",
  "started_at": "2026-10-29T15:38:00.103563Z",
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

`POST /api/driver/v1/trips/c23f1a19-a528-4abc-b3b1-861405bfa979/complete` → **200**

```json
{
  "command_id": "d9a762cd-795e-4fe4-91a9-0578a71791dd",
  "expected_version": 2,
  "reported_at": "2026-10-29T15:38:00Z",
  "cash_received": true
}
```

```json
{
  "id": "c23f1a19-a528-4abc-b3b1-861405bfa979",
  "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
  "assignment_id": "677db19e-6895-4cf3-bb18-54a6e9dbb0e8",
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
  "arrived_at": "2026-10-29T15:37:59.920726Z",
  "started_at": "2026-10-29T15:38:00.103563Z",
  "completed_at": "2026-10-29T15:38:00.285827Z",
  "needs_review": false,
  "wallet_minor": 0,
  "discount_minor": 0,
  "recipient": null
}
```

`GET /api/operator/v1/orders/20d1a2d1-b6bd-4c85-83b6-7e94424bb93c` → **200**

```json
{
  "id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
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
    "id": "677db19e-6895-4cf3-bb18-54a6e9dbb0e8",
    "order_id": "20d1a2d1-b6bd-4c85-83b6-7e94424bb93c",
    "driver_id": "5a000000-0000-4000-8000-000000000403",
    "vehicle_id": "5a000000-0000-4000-8000-000000000503",
    "source": "OFFER",
    "state": "COMPLETED",
    "trip_id": "c23f1a19-a528-4abc-b3b1-861405bfa979",
    "trip_phase": "COMPLETED"
  },
  "created_at": "2026-10-29T15:37:58.849483Z",
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
  "session_id": "06f52485-e970-4b41-aa4c-ac6be9d5e488",
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
  "last_heartbeat_at": "2026-10-29T15:37:57.718796Z",
  "last_location_at": "2026-10-29T15:37:57.718796Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/06f52485-e970-4b41-aa4c-ac6be9d5e488/close` → **200**

```json
{
  "command_id": "665100aa-ace3-4e23-8b93-a7e3d2365e83",
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
  "session_id": "8b3b1b1b-d6a3-4dc9-b7b6-42955cf38aa3",
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
  "last_heartbeat_at": "2026-10-29T15:37:59.73894Z",
  "last_location_at": "2026-10-29T15:37:59.73894Z",
  "eligible": true,
  "ineligible_reasons": []
}
```

`POST /api/driver/v1/work-sessions/8b3b1b1b-d6a3-4dc9-b7b6-42955cf38aa3/close` → **200**

```json
{
  "command_id": "fcaa2796-035b-4d85-b248-4c7309a262bb",
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

Done: terminal order 20d1a2d1-b6bd-4c85-83b6-7e94424bb93c by Andrii (5a000000-0000-4000-8000-000000000403).

# Scenario: zz-metrics

## A search without drivers ends as UNFULFILLED

`POST /auth/v1/otp/challenges` → **201**

```json
{
  "audience": "DRIVER",
  "phone": "+380500000001",
  "device_ref": "sandbox-21586"
}
```

```json
{
  "challenge_id": "1b7e4df7-2c25-46cc-9168-8b2d3628d209",
  "expires_at": "2026-10-29T15:43:04.564631841Z",
  "resend_available_at": "2026-10-29T15:38:05.564631841Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000001` → **200**

```json
{
  "phone": "+380500000001",
  "audience": "DRIVER",
  "code": "011907",
  "sent_at": "2026-10-29T15:38:04.566419577Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "1b7e4df7-2c25-46cc-9168-8b2d3628d209",
  "code": "011907",
  "device_ref": "sandbox-21586"
}
```

```json
{
  "session_id": "5c92b33c-6df2-4e76-a138-f6a60d75814a",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000401"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDEiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE4NCwiaWF0IjoxNzkzMjg4Mjg0LCJqdGkiOiIyNWJmOWI0YS02ZThmLTQ0YTYtOTYyZi1iMWI0MTBlMzBiNTIiLCJzaWQiOiI1YzkyYjMzYy02ZGYyLTRlNzYtYTEzOC1mNmE2MGQ3NTgxNGEifQ.D4nit_hxpdc98Ng1F1dt7xO18_23bIjP0UHiuwyf0A0",
  "access_expires_at": "2026-10-29T15:53:04.765910369Z",
  "refresh_token": "jCn00TBbwV1YhOitcSjkYJ0a0wfRfGU8M7MxKWJiHUg",
  "refresh_expires_at": "2026-11-28T15:38:04.765562895Z",
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
  "device_ref": "sandbox-23304"
}
```

```json
{
  "challenge_id": "5203e0d6-d860-47ef-977d-320d0ee863e6",
  "expires_at": "2026-10-29T15:43:05.117615002Z",
  "resend_available_at": "2026-10-29T15:38:06.117615002Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000002` → **200**

```json
{
  "phone": "+380500000002",
  "audience": "DRIVER",
  "code": "270726",
  "sent_at": "2026-10-29T15:38:05.119396765Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "5203e0d6-d860-47ef-977d-320d0ee863e6",
  "code": "270726",
  "device_ref": "sandbox-23304"
}
```

```json
{
  "session_id": "2760ce99-0f9d-46c6-9350-6ac111537b0f",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000402"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDIiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE4NSwiaWF0IjoxNzkzMjg4Mjg1LCJqdGkiOiIyNzg3NzczYi04MTJhLTQ0ZDItOGQ1Yy00ZWIxMTcwNmZiNzYiLCJzaWQiOiIyNzYwY2U5OS0wZjlkLTQ2YzYtOTM1MC02YWMxMTE1MzdiMGYifQ.OaR8sGLBPw-6LRa1_93UFfITJ6ZTL-bnZzmZe7pJW4k",
  "access_expires_at": "2026-10-29T15:53:05.31804447Z",
  "refresh_token": "t0URSnTtZ6gq5IeQkNcRL77BzCo46FTddi8OGRv9sC8",
  "refresh_expires_at": "2026-11-28T15:38:05.317735764Z",
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
  "device_ref": "sandbox-17129"
}
```

```json
{
  "challenge_id": "7c83014f-6f28-4349-b519-bd75541e5c9f",
  "expires_at": "2026-10-29T15:43:05.677208263Z",
  "resend_available_at": "2026-10-29T15:38:06.677208263Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380500000003` → **200**

```json
{
  "phone": "+380500000003",
  "audience": "DRIVER",
  "code": "452615",
  "sent_at": "2026-10-29T15:38:05.679138444Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "7c83014f-6f28-4349-b519-bd75541e5c9f",
  "code": "452615",
  "device_ref": "sandbox-17129"
}
```

```json
{
  "session_id": "44823b91-dc97-4755-a193-c181627fe69e",
  "subject": {
    "type": "DRIVER",
    "id": "5a000000-0000-4000-8000-000000000403"
  },
  "audience": "driver",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI1YTAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDA0MDMiLCJhdWQiOiJkcml2ZXIiLCJzdWJfdHlwZSI6IkRSSVZFUiIsImlpZCI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImlzcyI6IjAwMDAwMDAwLTAwMDAtNDAwMC04MDAwLTAwMDAwMDAwMDA1YSIsImV4cCI6MTc5MzI4OTE4NSwiaWF0IjoxNzkzMjg4Mjg1LCJqdGkiOiIxNTlkODU5NS0wYmE3LTRjOWYtODBmYS1kOTBiZGFkYTkzY2MiLCJzaWQiOiI0NDgyM2I5MS1kYzk3LTQ3NTUtYTE5My1jMTgxNjI3ZmU2OWUifQ.SkP4aUI5TMEpIQssp0s0r2IFEKb5ltFutHlAZMoUWL8",
  "access_expires_at": "2026-10-29T15:53:05.877483367Z",
  "refresh_token": "eB5hqUy3jX7LZVrz9FNakiUUMGbUbos0NplIEAXQsPs",
  "refresh_expires_at": "2026-11-28T15:38:05.877123635Z",
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
  "phone": "+380698054697",
  "device_ref": "sandbox-31534"
}
```

```json
{
  "challenge_id": "e7c72ff6-20b2-4952-9882-06fa7cbcbcaf",
  "expires_at": "2026-10-29T15:43:06.227983763Z",
  "resend_available_at": "2026-10-29T15:38:07.227983763Z",
  "channel": "SMS"
}
```

`GET /sandbox/v1/otp?phone=%2B380698054697` → **200**

```json
{
  "phone": "+380698054697",
  "audience": "CLIENT",
  "code": "218408",
  "sent_at": "2026-10-29T15:38:06.229781555Z",
  "channel": "SMS"
}
```

`POST /auth/v1/otp/verify` → **200**

```json
{
  "challenge_id": "e7c72ff6-20b2-4952-9882-06fa7cbcbcaf",
  "code": "218408",
  "device_ref": "sandbox-31534"
}
```

```json
{
  "session_id": "70902fe5-7c44-45ca-8684-f4a6d130226f",
  "subject": {
    "type": "CLIENT",
    "id": "833617b3-9e61-462c-9ac1-36b1c91b23f9"
  },
  "audience": "rider",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI4MzM2MTdiMy05ZTYxLTQ2MmMtOWFjMS0zNmIxYzkxYjIzZjkiLCJhdWQiOiJyaWRlciIsInN1Yl90eXBlIjoiQ0xJRU5UIiwiaWlkIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiaXNzIjoiMDAwMDAwMDAtMDAwMC00MDAwLTgwMDAtMDAwMDAwMDAwMDVhIiwiZXhwIjoxNzkzMjg5MTg2LCJpYXQiOjE3OTMyODgyODYsImp0aSI6ImVjY2QzODg3LTUwNDEtNDk2OC1hYzc3LTdhZGMyMmVhMWExYSIsInNpZCI6IjcwOTAyZmU1LTdjNDQtNDVjYS04Njg0LWY0YTZkMTMwMjI2ZiJ9.rzhzNsCYaboqAODLPY6omyWGw0qV7HXFpwW2j0HHxXk",
  "access_expires_at": "2026-10-29T15:53:06.423025493Z",
  "refresh_token": "bm9foLnyCTQ0k2Lm-uJEgs69hoxC8Jk-g1VTZgTF_OM",
  "refresh_expires_at": "2026-11-28T15:38:06.422710864Z",
  "account_created": true
}
```

`POST /api/rider/v1/quotes` → **201**

```json
{
  "command_id": "d97614b1-a731-4af2-8f4a-2d9ae6d003a7",
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
  "id": "983cf302-8ad2-4248-8950-168de43de193",
  "vehicle_class": "STANDARD",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "amount_minor": 10517,
  "currency": "UAH",
  "distance_m": 3467,
  "duration_s": 499,
  "route_source": "STRAIGHT_LINE",
  "expires_at": "2026-10-29T15:43:06.605995Z",
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
  "command_id": "b3b5f661-e7a9-4700-9dec-3e666450f5eb",
  "quote_id": "983cf302-8ad2-4248-8950-168de43de193",
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
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "SEARCHING",
  "status_reason": null,
  "version": 2,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
  "cancellation": null,
  "pickup_at": null,
  "preorder": false,
  "related_order_id": null,
  "wallet_minor": 0,
  "discount_minor": 0,
  "pickup_eta": null
}
```

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
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
blizz_dispatch_assigned_seconds_sum{application="blizz-taxi-server",source="OFFER"} 9.460805223
blizz_dispatch_assigned_seconds_max{application="blizz-taxi-server",source="OFFER"} 0.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="ALREADY_OFFERED"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="BUSY"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PAYMENT"} 1.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="PREVIOUS_DRIVER"} 2.0
blizz_dispatch_excluded_total{application="blizz-taxi-server",reason="STALE_LOCATION"} 5.0
blizz_dispatch_first_offer_seconds_count{application="blizz-taxi-server"} 18
blizz_dispatch_first_offer_seconds_sum{application="blizz-taxi-server"} 0.132691804
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

`GET /api/rider/v1/orders/3d827dda-f612-4103-a629-e49beb8637fb` → **200**

```json
{
  "id": "3d827dda-f612-4103-a629-e49beb8637fb",
  "short_number": 28,
  "status": "UNFULFILLED",
  "status_reason": "NO_DRIVER",
  "version": 3,
  "channel": "APP",
  "payer_client_id": "833617b3-9e61-462c-9ac1-36b1c91b23f9",
  "city_id": "5a000000-0000-4000-8000-000000000001",
  "vehicle_class": "STANDARD",
  "pickup": {
    "lat": 50.4501,
    "lon": 30.5234
  },
  "pickup_label": "Майдан",
  "dropoff": {
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
  "created_at": "2026-10-29T15:38:06.79302Z",
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
  "session_id": "9124b44a-7193-4219-a344-9c53e33ddcac",
  "subject": {
    "type": "STAFF",
    "id": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f"
  },
  "audience": "admin",
  "access_token": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhM2JkMjg0NC1jMGYwLTQ5N2QtOTA2Ni1lNWZiMGY0N2NjNGYiLCJhdWQiOiJhZG1pbiIsInN1Yl90eXBlIjoiU1RBRkYiLCJpaWQiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJpc3MiOiIwMDAwMDAwMC0wMDAwLTQwMDAtODAwMC0wMDAwMDAwMDAwNWEiLCJleHAiOjE3OTMyODkzNjksImlhdCI6MTc5MzI4ODQ2OSwianRpIjoiOGYwMGY5ZTEtMGM0ZS00OWViLWE5NzctODBiMjY3NzRiM2FiIiwic2lkIjoiOTEyNGI0NGEtNzE5My00MjE5LWEzNDQtOWM1M2UzM2RkY2FjIn0.B391e2bp_JMZx2PZTRNHefsg1tNyKWFMy1Pdo52TuIc",
  "access_expires_at": "2026-10-29T15:56:09.429758505Z",
  "refresh_token": "M_TT54yCWHp-Z53FgyalvlT9cMJFqtaTSMr5ExOUncQ",
  "refresh_expires_at": "2026-10-30T03:41:09.429315584Z",
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
  "id": "0b826367-a50b-431b-9a36-7b69c388f424",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.623831Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.623914Z",
  "updated_at": "2026-10-29T15:41:09.634288Z",
  "finished_at": "2026-10-29T15:41:09.634288Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/0b826367-a50b-431b-9a36-7b69c388f424` → **200**

```json
{
  "run": {
    "id": "0b826367-a50b-431b-9a36-7b69c388f424",
    "merchant_id": "5a000000-0000-4000-8000-000000000601",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:41:09.623831Z",
    "partial": true,
    "state": "CLEAN",
    "local_count": 10,
    "provider_count": 10,
    "item_count": 0,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:41:09.623914Z",
    "updated_at": "2026-10-29T15:41:09.634288Z",
    "finished_at": "2026-10-29T15:41:09.634288Z",
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
  "id": "0b826367-a50b-431b-9a36-7b69c388f424",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.623831Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.623914Z",
  "updated_at": "2026-10-29T15:41:09.634288Z",
  "finished_at": "2026-10-29T15:41:09.634288Z",
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
  "id": "0b826367-a50b-431b-9a36-7b69c388f424",
  "merchant_id": "5a000000-0000-4000-8000-000000000601",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.623831Z",
  "partial": true,
  "state": "CLEAN",
  "local_count": 10,
  "provider_count": 10,
  "item_count": 0,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.623914Z",
  "updated_at": "2026-10-29T15:41:09.634288Z",
  "finished_at": "2026-10-29T15:41:09.634288Z",
  "version": 1
}
```

## One independent bank transaction produces one missing-local item on another merchant's first snapshot

`POST /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/d659622d-9f6e-48c6-9b97-6062b183869c` → **204**

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
  "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.93586Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.935946Z",
  "updated_at": "2026-10-29T15:41:09.940688Z",
  "finished_at": "2026-10-29T15:41:09.940688Z",
  "version": 1
}
```

`GET /api/admin/v1/payment-reconciliations/1e526e1d-6092-431f-8832-82a6ecba767b` → **200**

```json
{
  "run": {
    "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:41:09.93586Z",
    "partial": true,
    "state": "OPEN",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 1,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:41:09.935946Z",
    "updated_at": "2026-10-29T15:41:09.940688Z",
    "finished_at": "2026-10-29T15:41:09.940688Z",
    "version": 1
  },
  "items": [
    {
      "id": "b3d928cc-1ab7-44b7-a98a-67307b467376",
      "run_id": "1e526e1d-6092-431f-8832-82a6ecba767b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6a89c402e5e23eb17cbf5329fea2510ed3a3f2457b09a91166b1052af2bbd49e",
      "reference_display": "sandbox-reconciliation-d#####d-9f6e-48c6-9b97-6062b#####c",
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
      "provider_at": "2026-10-29T15:41:09Z",
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
  "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.93586Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.935946Z",
  "updated_at": "2026-10-29T15:41:09.940688Z",
  "finished_at": "2026-10-29T15:41:09.940688Z",
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
  "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.93586Z",
  "partial": true,
  "state": "OPEN",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 1,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.935946Z",
  "updated_at": "2026-10-29T15:41:09.940688Z",
  "finished_at": "2026-10-29T15:41:09.940688Z",
  "version": 1
}
```

## The admin explains the item once; a replay is the same result and a different decision conflicts

`POST /api/admin/v1/payment-reconciliations/items/b3d928cc-1ab7-44b7-a98a-67307b467376/resolve` → **200**

```json
{
  "command_id": "b2f32d02-64b1-4e5c-af7c-08ec7b5187c8",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b3d928cc-1ab7-44b7-a98a-67307b467376",
  "run_id": "1e526e1d-6092-431f-8832-82a6ecba767b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6a89c402e5e23eb17cbf5329fea2510ed3a3f2457b09a91166b1052af2bbd49e",
  "reference_display": "sandbox-reconciliation-d#####d-9f6e-48c6-9b97-6062b#####c",
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
  "provider_at": "2026-10-29T15:41:09Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "resolved_at": "2026-10-29T15:41:10.227816Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b3d928cc-1ab7-44b7-a98a-67307b467376/resolve` → **200**

```json
{
  "command_id": "b2f32d02-64b1-4e5c-af7c-08ec7b5187c8",
  "expected_version": 0,
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved"
}
```

```json
{
  "id": "b3d928cc-1ab7-44b7-a98a-67307b467376",
  "run_id": "1e526e1d-6092-431f-8832-82a6ecba767b",
  "kind": "MISSING_LOCALLY",
  "reference_fingerprint": "6a89c402e5e23eb17cbf5329fea2510ed3a3f2457b09a91166b1052af2bbd49e",
  "reference_display": "sandbox-reconciliation-d#####d-9f6e-48c6-9b97-6062b#####c",
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
  "provider_at": "2026-10-29T15:41:09Z",
  "state": "RESOLVED",
  "decision": "EXPLAINED",
  "reason": "Independent sandbox bank fixture; no real money moved",
  "resolved_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
  "resolved_at": "2026-10-29T15:41:10.227816Z",
  "version": 1
}
```

`POST /api/admin/v1/payment-reconciliations/items/b3d928cc-1ab7-44b7-a98a-67307b467376/resolve` → **409**

```json
{
  "command_id": "8f570675-6864-43db-b90b-56e2c0edfe73",
  "expected_version": 1,
  "decision": "ESCALATED",
  "reason": "A conflicting second decision"
}
```

```json
{
  "instance": "/api/admin/v1/payment-reconciliations/items/b3d928cc-1ab7-44b7-a98a-67307b467376/resolve",
  "status": 409,
  "title": "State conflict",
  "type": "https://errors.blizz.taxi/state-conflict",
  "code": "STATE_CONFLICT",
  "correlation_id": "bf70e8a2-007d-4e43-a374-d6f597c070e0"
}
```

`GET /api/admin/v1/payment-reconciliations/1e526e1d-6092-431f-8832-82a6ecba767b` → **200**

```json
{
  "run": {
    "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
    "merchant_id": "5a000000-0000-4000-8000-000000000602",
    "day": "2026-10-29",
    "period_from": "2026-10-28T22:00:00Z",
    "period_to": "2026-10-30T02:00:00Z",
    "observed_until": "2026-10-29T15:41:09.93586Z",
    "partial": true,
    "state": "RESOLVED",
    "local_count": 0,
    "provider_count": 1,
    "item_count": 1,
    "open_count": 0,
    "failure_code": null,
    "attempts": 1,
    "created_at": "2026-10-29T15:41:09.935946Z",
    "updated_at": "2026-10-29T15:41:10.227816Z",
    "finished_at": "2026-10-29T15:41:09.940688Z",
    "version": 2
  },
  "items": [
    {
      "id": "b3d928cc-1ab7-44b7-a98a-67307b467376",
      "run_id": "1e526e1d-6092-431f-8832-82a6ecba767b",
      "kind": "MISSING_LOCALLY",
      "reference_fingerprint": "6a89c402e5e23eb17cbf5329fea2510ed3a3f2457b09a91166b1052af2bbd49e",
      "reference_display": "sandbox-reconciliation-d#####d-9f6e-48c6-9b97-6062b#####c",
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
      "provider_at": "2026-10-29T15:41:09Z",
      "state": "RESOLVED",
      "decision": "EXPLAINED",
      "reason": "Independent sandbox bank fixture; no real money moved",
      "resolved_by": "a3bd2844-c0f0-497d-9066-e5fb0f47cc4f",
      "resolved_at": "2026-10-29T15:41:10.227816Z",
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
      "id": "1ca0e1a1-cb4f-4a27-9326-212d59845e89",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-28",
      "period_from": "2026-10-27T22:00:00Z",
      "period_to": "2026-10-29T02:00:00Z",
      "observed_until": "2026-10-29T15:34:34.581616Z",
      "partial": false,
      "state": "CLEAN",
      "local_count": 0,
      "provider_count": 0,
      "item_count": 0,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:34:34.581683Z",
      "updated_at": "2026-10-29T15:34:34.58472Z",
      "finished_at": "2026-10-29T15:34:34.58472Z",
      "version": 1
    },
    {
      "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
      "merchant_id": "5a000000-0000-4000-8000-000000000602",
      "day": "2026-10-29",
      "period_from": "2026-10-28T22:00:00Z",
      "period_to": "2026-10-30T02:00:00Z",
      "observed_until": "2026-10-29T15:41:09.93586Z",
      "partial": true,
      "state": "RESOLVED",
      "local_count": 0,
      "provider_count": 1,
      "item_count": 1,
      "open_count": 0,
      "failure_code": null,
      "attempts": 1,
      "created_at": "2026-10-29T15:41:09.935946Z",
      "updated_at": "2026-10-29T15:41:10.227816Z",
      "finished_at": "2026-10-29T15:41:09.940688Z",
      "version": 2
    }
  ],
  "next_cursor": null
}
```

`DELETE /sandbox/v1/payment-reconciliations/merchants/5a000000-0000-4000-8000-000000000602/transactions/d659622d-9f6e-48c6-9b97-6062b183869c` → **204**

`POST /sandbox/v1/payment-reconciliations/run` → **200**

```json
{
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29"
}
```

```json
{
  "id": "1e526e1d-6092-431f-8832-82a6ecba767b",
  "merchant_id": "5a000000-0000-4000-8000-000000000602",
  "day": "2026-10-29",
  "period_from": "2026-10-28T22:00:00Z",
  "period_to": "2026-10-30T02:00:00Z",
  "observed_until": "2026-10-29T15:41:09.93586Z",
  "partial": true,
  "state": "RESOLVED",
  "local_count": 0,
  "provider_count": 1,
  "item_count": 1,
  "open_count": 0,
  "failure_code": null,
  "attempts": 1,
  "created_at": "2026-10-29T15:41:09.935946Z",
  "updated_at": "2026-10-29T15:41:10.227816Z",
  "finished_at": "2026-10-29T15:41:09.940688Z",
  "version": 2
}
```

Done: clean card snapshot, one bank-only difference, three identical runs, audited decision/replay/conflict, bank fixture restored.

# Scenario: zzz-invariants

## Five invariant checks are clean after all scenario transactions settle

```prometheus
blizz_invariant_last_success{application="blizz-taxi-server",check="I1"} 1.7932885947E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I2"} 1.793288594853E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I3"} 1.793288594854E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I4"} 1.793288594721E9
blizz_invariant_last_success{application="blizz-taxi-server",check="I5"} 1.793288594854E9
blizz_invariant_violations{application="blizz-taxi-server",check="I1"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I2"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I3"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I4"} 0.0
blizz_invariant_violations{application="blizz-taxi-server",check="I5"} 0.0
```

Done: five fresh zero invariant gauges after the settling margin.
